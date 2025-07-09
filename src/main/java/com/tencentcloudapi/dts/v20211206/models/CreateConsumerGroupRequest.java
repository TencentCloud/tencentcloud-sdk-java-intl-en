/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateConsumerGroupRequest extends AbstractModel {

    /**
    * Subscription instance ID
    */
    @SerializedName("SubscribeId")
    @Expose
    private String SubscribeId;

    /**
    * Consumer group name, which consists of numbers, letters (upper and lower case), or begins with _ - . Ends with numbers, letters (upper and lower case). The full name of the actually generated consumer group is in the form: consumer-grp-#{SubscribeId}-#{ConsumerGroupName}.
    */
    @SerializedName("ConsumerGroupName")
    @Expose
    private String ConsumerGroupName;

    /**
    * Account name, which consists of numbers, letters (upper and lower case), or begins with _-.. Ends with numbers, letters (upper and lower case). The full name of the actually generated account is in the form: account-#{SubscribeId}-#{AccountName}.
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * Consumer group password, which should be longer than 3 characters.
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Consumer group description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get Subscription instance ID 
     * @return SubscribeId Subscription instance ID
     */
    public String getSubscribeId() {
        return this.SubscribeId;
    }

    /**
     * Set Subscription instance ID
     * @param SubscribeId Subscription instance ID
     */
    public void setSubscribeId(String SubscribeId) {
        this.SubscribeId = SubscribeId;
    }

    /**
     * Get Consumer group name, which consists of numbers, letters (upper and lower case), or begins with _ - . Ends with numbers, letters (upper and lower case). The full name of the actually generated consumer group is in the form: consumer-grp-#{SubscribeId}-#{ConsumerGroupName}. 
     * @return ConsumerGroupName Consumer group name, which consists of numbers, letters (upper and lower case), or begins with _ - . Ends with numbers, letters (upper and lower case). The full name of the actually generated consumer group is in the form: consumer-grp-#{SubscribeId}-#{ConsumerGroupName}.
     */
    public String getConsumerGroupName() {
        return this.ConsumerGroupName;
    }

    /**
     * Set Consumer group name, which consists of numbers, letters (upper and lower case), or begins with _ - . Ends with numbers, letters (upper and lower case). The full name of the actually generated consumer group is in the form: consumer-grp-#{SubscribeId}-#{ConsumerGroupName}.
     * @param ConsumerGroupName Consumer group name, which consists of numbers, letters (upper and lower case), or begins with _ - . Ends with numbers, letters (upper and lower case). The full name of the actually generated consumer group is in the form: consumer-grp-#{SubscribeId}-#{ConsumerGroupName}.
     */
    public void setConsumerGroupName(String ConsumerGroupName) {
        this.ConsumerGroupName = ConsumerGroupName;
    }

    /**
     * Get Account name, which consists of numbers, letters (upper and lower case), or begins with _-.. Ends with numbers, letters (upper and lower case). The full name of the actually generated account is in the form: account-#{SubscribeId}-#{AccountName}. 
     * @return AccountName Account name, which consists of numbers, letters (upper and lower case), or begins with _-.. Ends with numbers, letters (upper and lower case). The full name of the actually generated account is in the form: account-#{SubscribeId}-#{AccountName}.
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set Account name, which consists of numbers, letters (upper and lower case), or begins with _-.. Ends with numbers, letters (upper and lower case). The full name of the actually generated account is in the form: account-#{SubscribeId}-#{AccountName}.
     * @param AccountName Account name, which consists of numbers, letters (upper and lower case), or begins with _-.. Ends with numbers, letters (upper and lower case). The full name of the actually generated account is in the form: account-#{SubscribeId}-#{AccountName}.
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get Consumer group password, which should be longer than 3 characters. 
     * @return Password Consumer group password, which should be longer than 3 characters.
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Consumer group password, which should be longer than 3 characters.
     * @param Password Consumer group password, which should be longer than 3 characters.
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get Consumer group description 
     * @return Description Consumer group description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Consumer group description
     * @param Description Consumer group description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreateConsumerGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateConsumerGroupRequest(CreateConsumerGroupRequest source) {
        if (source.SubscribeId != null) {
            this.SubscribeId = new String(source.SubscribeId);
        }
        if (source.ConsumerGroupName != null) {
            this.ConsumerGroupName = new String(source.ConsumerGroupName);
        }
        if (source.AccountName != null) {
            this.AccountName = new String(source.AccountName);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubscribeId", this.SubscribeId);
        this.setParamSimple(map, prefix + "ConsumerGroupName", this.ConsumerGroupName);
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}


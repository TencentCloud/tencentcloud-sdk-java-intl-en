/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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

public class ModifyConsumerGroupPasswordRequest extends AbstractModel {

    /**
    * Data subscription instance ID
    */
    @SerializedName("SubscribeId")
    @Expose
    private String SubscribeId;

    /**
    * Account name. The full name of the actual account is in the form: account-#{SubscribeId}-#{AccountName}.
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * Consumer group name. The full name of the actual consumer group is in the form: consumer-grp-#{SubscribeId}-#{ConsumerGroupName}.
    */
    @SerializedName("ConsumerGroupName")
    @Expose
    private String ConsumerGroupName;

    /**
    * Old Password.
    */
    @SerializedName("OldPassword")
    @Expose
    private String OldPassword;

    /**
    * New password. The character length is no less than 3 and no more than 32.
    */
    @SerializedName("NewPassword")
    @Expose
    private String NewPassword;

    /**
     * Get Data subscription instance ID 
     * @return SubscribeId Data subscription instance ID
     */
    public String getSubscribeId() {
        return this.SubscribeId;
    }

    /**
     * Set Data subscription instance ID
     * @param SubscribeId Data subscription instance ID
     */
    public void setSubscribeId(String SubscribeId) {
        this.SubscribeId = SubscribeId;
    }

    /**
     * Get Account name. The full name of the actual account is in the form: account-#{SubscribeId}-#{AccountName}. 
     * @return AccountName Account name. The full name of the actual account is in the form: account-#{SubscribeId}-#{AccountName}.
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set Account name. The full name of the actual account is in the form: account-#{SubscribeId}-#{AccountName}.
     * @param AccountName Account name. The full name of the actual account is in the form: account-#{SubscribeId}-#{AccountName}.
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get Consumer group name. The full name of the actual consumer group is in the form: consumer-grp-#{SubscribeId}-#{ConsumerGroupName}. 
     * @return ConsumerGroupName Consumer group name. The full name of the actual consumer group is in the form: consumer-grp-#{SubscribeId}-#{ConsumerGroupName}.
     */
    public String getConsumerGroupName() {
        return this.ConsumerGroupName;
    }

    /**
     * Set Consumer group name. The full name of the actual consumer group is in the form: consumer-grp-#{SubscribeId}-#{ConsumerGroupName}.
     * @param ConsumerGroupName Consumer group name. The full name of the actual consumer group is in the form: consumer-grp-#{SubscribeId}-#{ConsumerGroupName}.
     */
    public void setConsumerGroupName(String ConsumerGroupName) {
        this.ConsumerGroupName = ConsumerGroupName;
    }

    /**
     * Get Old Password. 
     * @return OldPassword Old Password.
     */
    public String getOldPassword() {
        return this.OldPassword;
    }

    /**
     * Set Old Password.
     * @param OldPassword Old Password.
     */
    public void setOldPassword(String OldPassword) {
        this.OldPassword = OldPassword;
    }

    /**
     * Get New password. The character length is no less than 3 and no more than 32. 
     * @return NewPassword New password. The character length is no less than 3 and no more than 32.
     */
    public String getNewPassword() {
        return this.NewPassword;
    }

    /**
     * Set New password. The character length is no less than 3 and no more than 32.
     * @param NewPassword New password. The character length is no less than 3 and no more than 32.
     */
    public void setNewPassword(String NewPassword) {
        this.NewPassword = NewPassword;
    }

    public ModifyConsumerGroupPasswordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyConsumerGroupPasswordRequest(ModifyConsumerGroupPasswordRequest source) {
        if (source.SubscribeId != null) {
            this.SubscribeId = new String(source.SubscribeId);
        }
        if (source.AccountName != null) {
            this.AccountName = new String(source.AccountName);
        }
        if (source.ConsumerGroupName != null) {
            this.ConsumerGroupName = new String(source.ConsumerGroupName);
        }
        if (source.OldPassword != null) {
            this.OldPassword = new String(source.OldPassword);
        }
        if (source.NewPassword != null) {
            this.NewPassword = new String(source.NewPassword);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubscribeId", this.SubscribeId);
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);
        this.setParamSimple(map, prefix + "ConsumerGroupName", this.ConsumerGroupName);
        this.setParamSimple(map, prefix + "OldPassword", this.OldPassword);
        this.setParamSimple(map, prefix + "NewPassword", this.NewPassword);

    }
}


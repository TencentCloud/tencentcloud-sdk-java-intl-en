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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAccountHostRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * New host
    */
    @SerializedName("NewHost")
    @Expose
    private String NewHost;

    /**
    * Account infomation
    */
    @SerializedName("Account")
    @Expose
    private InputAccount Account;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get New host 
     * @return NewHost New host
     */
    public String getNewHost() {
        return this.NewHost;
    }

    /**
     * Set New host
     * @param NewHost New host
     */
    public void setNewHost(String NewHost) {
        this.NewHost = NewHost;
    }

    /**
     * Get Account infomation 
     * @return Account Account infomation
     */
    public InputAccount getAccount() {
        return this.Account;
    }

    /**
     * Set Account infomation
     * @param Account Account infomation
     */
    public void setAccount(InputAccount Account) {
        this.Account = Account;
    }

    public ModifyAccountHostRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAccountHostRequest(ModifyAccountHostRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.NewHost != null) {
            this.NewHost = new String(source.NewHost);
        }
        if (source.Account != null) {
            this.Account = new InputAccount(source.Account);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "NewHost", this.NewHost);
        this.setParamObj(map, prefix + "Account.", this.Account);

    }
}


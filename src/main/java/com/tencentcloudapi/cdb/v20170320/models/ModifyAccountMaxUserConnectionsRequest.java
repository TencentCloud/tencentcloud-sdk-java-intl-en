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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAccountMaxUserConnectionsRequest extends AbstractModel{

    /**
    * List of TencentDB accounts
    */
    @SerializedName("Accounts")
    @Expose
    private Account [] Accounts;

    /**
    * Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed in the TencentDB console.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Maximum connections of the account. Maximum value: `10240`.
    */
    @SerializedName("MaxUserConnections")
    @Expose
    private Long MaxUserConnections;

    /**
     * Get List of TencentDB accounts 
     * @return Accounts List of TencentDB accounts
     */
    public Account [] getAccounts() {
        return this.Accounts;
    }

    /**
     * Set List of TencentDB accounts
     * @param Accounts List of TencentDB accounts
     */
    public void setAccounts(Account [] Accounts) {
        this.Accounts = Accounts;
    }

    /**
     * Get Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed in the TencentDB console. 
     * @return InstanceId Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed in the TencentDB console.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed in the TencentDB console.
     * @param InstanceId Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed in the TencentDB console.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Maximum connections of the account. Maximum value: `10240`. 
     * @return MaxUserConnections Maximum connections of the account. Maximum value: `10240`.
     */
    public Long getMaxUserConnections() {
        return this.MaxUserConnections;
    }

    /**
     * Set Maximum connections of the account. Maximum value: `10240`.
     * @param MaxUserConnections Maximum connections of the account. Maximum value: `10240`.
     */
    public void setMaxUserConnections(Long MaxUserConnections) {
        this.MaxUserConnections = MaxUserConnections;
    }

    public ModifyAccountMaxUserConnectionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAccountMaxUserConnectionsRequest(ModifyAccountMaxUserConnectionsRequest source) {
        if (source.Accounts != null) {
            this.Accounts = new Account[source.Accounts.length];
            for (int i = 0; i < source.Accounts.length; i++) {
                this.Accounts[i] = new Account(source.Accounts[i]);
            }
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.MaxUserConnections != null) {
            this.MaxUserConnections = new Long(source.MaxUserConnections);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Accounts.", this.Accounts);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "MaxUserConnections", this.MaxUserConnections);

    }
}


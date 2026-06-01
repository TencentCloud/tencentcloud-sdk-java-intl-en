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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRotationPasswordRequest extends AbstractModel {

    /**
    * Instance ID, in the format such as cdb-c1nl9rpv. This matches the instance ID displayed on the TencentDB console.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Currently, enable password rotation for account information, including account name and host name.
    */
    @SerializedName("Accounts")
    @Expose
    private Account [] Accounts;

    /**
     * Get Instance ID, in the format such as cdb-c1nl9rpv. This matches the instance ID displayed on the TencentDB console. 
     * @return InstanceId Instance ID, in the format such as cdb-c1nl9rpv. This matches the instance ID displayed on the TencentDB console.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID, in the format such as cdb-c1nl9rpv. This matches the instance ID displayed on the TencentDB console.
     * @param InstanceId Instance ID, in the format such as cdb-c1nl9rpv. This matches the instance ID displayed on the TencentDB console.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Currently, enable password rotation for account information, including account name and host name. 
     * @return Accounts Currently, enable password rotation for account information, including account name and host name.
     */
    public Account [] getAccounts() {
        return this.Accounts;
    }

    /**
     * Set Currently, enable password rotation for account information, including account name and host name.
     * @param Accounts Currently, enable password rotation for account information, including account name and host name.
     */
    public void setAccounts(Account [] Accounts) {
        this.Accounts = Accounts;
    }

    public CreateRotationPasswordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRotationPasswordRequest(CreateRotationPasswordRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Accounts != null) {
            this.Accounts = new Account[source.Accounts.length];
            for (int i = 0; i < source.Accounts.length; i++) {
                this.Accounts[i] = new Account(source.Accounts[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "Accounts.", this.Accounts);

    }
}


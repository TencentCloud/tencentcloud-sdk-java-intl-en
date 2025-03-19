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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstanceAccountRequest extends AbstractModel {

    /**
    * Instance ID. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy it in the instance list.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Sub-account name. If you want to change it to the root account, fill in root.
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * Sub-account password.
    */
    @SerializedName("AccountPassword")
    @Expose
    private String AccountPassword;

    /**
    * Sub-account description information
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Account read/write routing policy.
- master: primary node.
- replication: secondary node.
    */
    @SerializedName("ReadonlyPolicy")
    @Expose
    private String [] ReadonlyPolicy;

    /**
    * Sub-account read/write policy.
- r: read-only.
- w: write-only.
- rw: read/write.
    */
    @SerializedName("Privilege")
    @Expose
    private String Privilege;

    /**
    * Whether to switch the root account to a password-free account. This applies only to the root account. Sub-accounts do not support password-free access.
- true: Switch the root account to a password-free account.
- false: Do not switch it.
    */
    @SerializedName("NoAuth")
    @Expose
    private Boolean NoAuth;

    /**
     * Get Instance ID. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy it in the instance list. 
     * @return InstanceId Instance ID. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy it in the instance list.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy it in the instance list.
     * @param InstanceId Instance ID. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy it in the instance list.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Sub-account name. If you want to change it to the root account, fill in root. 
     * @return AccountName Sub-account name. If you want to change it to the root account, fill in root.
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set Sub-account name. If you want to change it to the root account, fill in root.
     * @param AccountName Sub-account name. If you want to change it to the root account, fill in root.
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get Sub-account password. 
     * @return AccountPassword Sub-account password.
     */
    public String getAccountPassword() {
        return this.AccountPassword;
    }

    /**
     * Set Sub-account password.
     * @param AccountPassword Sub-account password.
     */
    public void setAccountPassword(String AccountPassword) {
        this.AccountPassword = AccountPassword;
    }

    /**
     * Get Sub-account description information 
     * @return Remark Sub-account description information
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Sub-account description information
     * @param Remark Sub-account description information
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Account read/write routing policy.
- master: primary node.
- replication: secondary node. 
     * @return ReadonlyPolicy Account read/write routing policy.
- master: primary node.
- replication: secondary node.
     */
    public String [] getReadonlyPolicy() {
        return this.ReadonlyPolicy;
    }

    /**
     * Set Account read/write routing policy.
- master: primary node.
- replication: secondary node.
     * @param ReadonlyPolicy Account read/write routing policy.
- master: primary node.
- replication: secondary node.
     */
    public void setReadonlyPolicy(String [] ReadonlyPolicy) {
        this.ReadonlyPolicy = ReadonlyPolicy;
    }

    /**
     * Get Sub-account read/write policy.
- r: read-only.
- w: write-only.
- rw: read/write. 
     * @return Privilege Sub-account read/write policy.
- r: read-only.
- w: write-only.
- rw: read/write.
     */
    public String getPrivilege() {
        return this.Privilege;
    }

    /**
     * Set Sub-account read/write policy.
- r: read-only.
- w: write-only.
- rw: read/write.
     * @param Privilege Sub-account read/write policy.
- r: read-only.
- w: write-only.
- rw: read/write.
     */
    public void setPrivilege(String Privilege) {
        this.Privilege = Privilege;
    }

    /**
     * Get Whether to switch the root account to a password-free account. This applies only to the root account. Sub-accounts do not support password-free access.
- true: Switch the root account to a password-free account.
- false: Do not switch it. 
     * @return NoAuth Whether to switch the root account to a password-free account. This applies only to the root account. Sub-accounts do not support password-free access.
- true: Switch the root account to a password-free account.
- false: Do not switch it.
     */
    public Boolean getNoAuth() {
        return this.NoAuth;
    }

    /**
     * Set Whether to switch the root account to a password-free account. This applies only to the root account. Sub-accounts do not support password-free access.
- true: Switch the root account to a password-free account.
- false: Do not switch it.
     * @param NoAuth Whether to switch the root account to a password-free account. This applies only to the root account. Sub-accounts do not support password-free access.
- true: Switch the root account to a password-free account.
- false: Do not switch it.
     */
    public void setNoAuth(Boolean NoAuth) {
        this.NoAuth = NoAuth;
    }

    public ModifyInstanceAccountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceAccountRequest(ModifyInstanceAccountRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AccountName != null) {
            this.AccountName = new String(source.AccountName);
        }
        if (source.AccountPassword != null) {
            this.AccountPassword = new String(source.AccountPassword);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.ReadonlyPolicy != null) {
            this.ReadonlyPolicy = new String[source.ReadonlyPolicy.length];
            for (int i = 0; i < source.ReadonlyPolicy.length; i++) {
                this.ReadonlyPolicy[i] = new String(source.ReadonlyPolicy[i]);
            }
        }
        if (source.Privilege != null) {
            this.Privilege = new String(source.Privilege);
        }
        if (source.NoAuth != null) {
            this.NoAuth = new Boolean(source.NoAuth);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);
        this.setParamSimple(map, prefix + "AccountPassword", this.AccountPassword);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArraySimple(map, prefix + "ReadonlyPolicy.", this.ReadonlyPolicy);
        this.setParamSimple(map, prefix + "Privilege", this.Privilege);
        this.setParamSimple(map, prefix + "NoAuth", this.NoAuth);

    }
}


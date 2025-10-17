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
    * Specifies the account that needs modification.
- root: refers to the automatically generated account when a TencentDB for Redis® instance is created. Users cannot modify read-write permissions for the account, but can only modify its request routing policies.
- Custom account: an account manually created by users after successful instance creation. Users can modify read-write permissions and request routing policies for the account at any time.
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * Specifies the access password for the account to be modified.
    */
    @SerializedName("AccountPassword")
    @Expose
    private String AccountPassword;

    /**
    * Account description information.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Specifies the read-write request routing policies for the account to be modified.
- master: read-write request routing to the primary node.
- replication: read-write request routing to the secondary node.
    */
    @SerializedName("ReadonlyPolicy")
    @Expose
    private String [] ReadonlyPolicy;

    /**
    * Specifies the read-write permissions for the account to be modified.
- r: read-only.
- w: write-only.
- rw: read-write.
    */
    @SerializedName("Privilege")
    @Expose
    private String Privilege;

    /**
    * Specifies whether to set the default account (root) to a password-free account. Custom accounts do not support password-free access.
- true: set the default account (root) to a password-free account.
- false: not set the default account (root) to a password-free account.
    */
    @SerializedName("NoAuth")
    @Expose
    private Boolean NoAuth;

    /**
    * Specifies whether to encrypt the password for the account to be modified.
    */
    @SerializedName("EncryptPassword")
    @Expose
    private Boolean EncryptPassword;

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
     * Get Specifies the account that needs modification.
- root: refers to the automatically generated account when a TencentDB for Redis® instance is created. Users cannot modify read-write permissions for the account, but can only modify its request routing policies.
- Custom account: an account manually created by users after successful instance creation. Users can modify read-write permissions and request routing policies for the account at any time. 
     * @return AccountName Specifies the account that needs modification.
- root: refers to the automatically generated account when a TencentDB for Redis® instance is created. Users cannot modify read-write permissions for the account, but can only modify its request routing policies.
- Custom account: an account manually created by users after successful instance creation. Users can modify read-write permissions and request routing policies for the account at any time.
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set Specifies the account that needs modification.
- root: refers to the automatically generated account when a TencentDB for Redis® instance is created. Users cannot modify read-write permissions for the account, but can only modify its request routing policies.
- Custom account: an account manually created by users after successful instance creation. Users can modify read-write permissions and request routing policies for the account at any time.
     * @param AccountName Specifies the account that needs modification.
- root: refers to the automatically generated account when a TencentDB for Redis® instance is created. Users cannot modify read-write permissions for the account, but can only modify its request routing policies.
- Custom account: an account manually created by users after successful instance creation. Users can modify read-write permissions and request routing policies for the account at any time.
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get Specifies the access password for the account to be modified. 
     * @return AccountPassword Specifies the access password for the account to be modified.
     */
    public String getAccountPassword() {
        return this.AccountPassword;
    }

    /**
     * Set Specifies the access password for the account to be modified.
     * @param AccountPassword Specifies the access password for the account to be modified.
     */
    public void setAccountPassword(String AccountPassword) {
        this.AccountPassword = AccountPassword;
    }

    /**
     * Get Account description information. 
     * @return Remark Account description information.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Account description information.
     * @param Remark Account description information.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Specifies the read-write request routing policies for the account to be modified.
- master: read-write request routing to the primary node.
- replication: read-write request routing to the secondary node. 
     * @return ReadonlyPolicy Specifies the read-write request routing policies for the account to be modified.
- master: read-write request routing to the primary node.
- replication: read-write request routing to the secondary node.
     */
    public String [] getReadonlyPolicy() {
        return this.ReadonlyPolicy;
    }

    /**
     * Set Specifies the read-write request routing policies for the account to be modified.
- master: read-write request routing to the primary node.
- replication: read-write request routing to the secondary node.
     * @param ReadonlyPolicy Specifies the read-write request routing policies for the account to be modified.
- master: read-write request routing to the primary node.
- replication: read-write request routing to the secondary node.
     */
    public void setReadonlyPolicy(String [] ReadonlyPolicy) {
        this.ReadonlyPolicy = ReadonlyPolicy;
    }

    /**
     * Get Specifies the read-write permissions for the account to be modified.
- r: read-only.
- w: write-only.
- rw: read-write. 
     * @return Privilege Specifies the read-write permissions for the account to be modified.
- r: read-only.
- w: write-only.
- rw: read-write.
     */
    public String getPrivilege() {
        return this.Privilege;
    }

    /**
     * Set Specifies the read-write permissions for the account to be modified.
- r: read-only.
- w: write-only.
- rw: read-write.
     * @param Privilege Specifies the read-write permissions for the account to be modified.
- r: read-only.
- w: write-only.
- rw: read-write.
     */
    public void setPrivilege(String Privilege) {
        this.Privilege = Privilege;
    }

    /**
     * Get Specifies whether to set the default account (root) to a password-free account. Custom accounts do not support password-free access.
- true: set the default account (root) to a password-free account.
- false: not set the default account (root) to a password-free account. 
     * @return NoAuth Specifies whether to set the default account (root) to a password-free account. Custom accounts do not support password-free access.
- true: set the default account (root) to a password-free account.
- false: not set the default account (root) to a password-free account.
     */
    public Boolean getNoAuth() {
        return this.NoAuth;
    }

    /**
     * Set Specifies whether to set the default account (root) to a password-free account. Custom accounts do not support password-free access.
- true: set the default account (root) to a password-free account.
- false: not set the default account (root) to a password-free account.
     * @param NoAuth Specifies whether to set the default account (root) to a password-free account. Custom accounts do not support password-free access.
- true: set the default account (root) to a password-free account.
- false: not set the default account (root) to a password-free account.
     */
    public void setNoAuth(Boolean NoAuth) {
        this.NoAuth = NoAuth;
    }

    /**
     * Get Specifies whether to encrypt the password for the account to be modified. 
     * @return EncryptPassword Specifies whether to encrypt the password for the account to be modified.
     */
    public Boolean getEncryptPassword() {
        return this.EncryptPassword;
    }

    /**
     * Set Specifies whether to encrypt the password for the account to be modified.
     * @param EncryptPassword Specifies whether to encrypt the password for the account to be modified.
     */
    public void setEncryptPassword(Boolean EncryptPassword) {
        this.EncryptPassword = EncryptPassword;
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
        if (source.EncryptPassword != null) {
            this.EncryptPassword = new Boolean(source.EncryptPassword);
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
        this.setParamSimple(map, prefix + "EncryptPassword", this.EncryptPassword);

    }
}


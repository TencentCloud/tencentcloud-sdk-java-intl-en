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
    * <p>Instance ID. Log in to the <a href="https://console.cloud.tencent.com/redis/instance/list">Redis console</a> and copy the instance ID from the instance list.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Specify the account that needs modification.</p><ul><li>root: refers to the automatically generated account when a Redis Database Instance is created. Users cannot modify its read-write permissions, but can only modify its request routing strategy.</li><li>Custom account: an account manually created by users once an instance is created successfully. Users can modify its read and write permissions and request routing strategy at any time.</li></ul>
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * <p>Specifies the access password for the account to be modified.</p>
    */
    @SerializedName("AccountPassword")
    @Expose
    private String AccountPassword;

    /**
    * <p>Account description.</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>Specify the policy for request routing of read-write requests for the modified account.</p><ul><li>master: means read-write requests are routed to the primary node.</li><li>replication: means read-write requests are routed to the secondary node.</li></ul>
    */
    @SerializedName("ReadonlyPolicy")
    @Expose
    private String [] ReadonlyPolicy;

    /**
    * <p>Specify the read/write permission of the account to be modified.</p><ul><li>r: Read-only.</li><li>w: Write-only.</li><li>rw: Read-write.</li></ul>
    */
    @SerializedName("Privilege")
    @Expose
    private String Privilege;

    /**
    * <p>Specifies whether to set the default account (root) to a password-free account. Custom accounts do not support password-free access.</p><ul><li>true: The default account (root) is set to a password-free account.</li><li>false: The default account (root) is not set to a password-free account.</li></ul>
    */
    @SerializedName("NoAuth")
    @Expose
    private Boolean NoAuth;

    /**
    * <p>Whether to enable password encryption for transmission.</p><ul><li>true: Encrypted.</li><li>false: Not encrypted (default value).</li></ul>
    */
    @SerializedName("EncryptPassword")
    @Expose
    private Boolean EncryptPassword;

    /**
     * Get <p>Instance ID. Log in to the <a href="https://console.cloud.tencent.com/redis/instance/list">Redis console</a> and copy the instance ID from the instance list.</p> 
     * @return InstanceId <p>Instance ID. Log in to the <a href="https://console.cloud.tencent.com/redis/instance/list">Redis console</a> and copy the instance ID from the instance list.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID. Log in to the <a href="https://console.cloud.tencent.com/redis/instance/list">Redis console</a> and copy the instance ID from the instance list.</p>
     * @param InstanceId <p>Instance ID. Log in to the <a href="https://console.cloud.tencent.com/redis/instance/list">Redis console</a> and copy the instance ID from the instance list.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Specify the account that needs modification.</p><ul><li>root: refers to the automatically generated account when a Redis Database Instance is created. Users cannot modify its read-write permissions, but can only modify its request routing strategy.</li><li>Custom account: an account manually created by users once an instance is created successfully. Users can modify its read and write permissions and request routing strategy at any time.</li></ul> 
     * @return AccountName <p>Specify the account that needs modification.</p><ul><li>root: refers to the automatically generated account when a Redis Database Instance is created. Users cannot modify its read-write permissions, but can only modify its request routing strategy.</li><li>Custom account: an account manually created by users once an instance is created successfully. Users can modify its read and write permissions and request routing strategy at any time.</li></ul>
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set <p>Specify the account that needs modification.</p><ul><li>root: refers to the automatically generated account when a Redis Database Instance is created. Users cannot modify its read-write permissions, but can only modify its request routing strategy.</li><li>Custom account: an account manually created by users once an instance is created successfully. Users can modify its read and write permissions and request routing strategy at any time.</li></ul>
     * @param AccountName <p>Specify the account that needs modification.</p><ul><li>root: refers to the automatically generated account when a Redis Database Instance is created. Users cannot modify its read-write permissions, but can only modify its request routing strategy.</li><li>Custom account: an account manually created by users once an instance is created successfully. Users can modify its read and write permissions and request routing strategy at any time.</li></ul>
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get <p>Specifies the access password for the account to be modified.</p> 
     * @return AccountPassword <p>Specifies the access password for the account to be modified.</p>
     */
    public String getAccountPassword() {
        return this.AccountPassword;
    }

    /**
     * Set <p>Specifies the access password for the account to be modified.</p>
     * @param AccountPassword <p>Specifies the access password for the account to be modified.</p>
     */
    public void setAccountPassword(String AccountPassword) {
        this.AccountPassword = AccountPassword;
    }

    /**
     * Get <p>Account description.</p> 
     * @return Remark <p>Account description.</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>Account description.</p>
     * @param Remark <p>Account description.</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>Specify the policy for request routing of read-write requests for the modified account.</p><ul><li>master: means read-write requests are routed to the primary node.</li><li>replication: means read-write requests are routed to the secondary node.</li></ul> 
     * @return ReadonlyPolicy <p>Specify the policy for request routing of read-write requests for the modified account.</p><ul><li>master: means read-write requests are routed to the primary node.</li><li>replication: means read-write requests are routed to the secondary node.</li></ul>
     */
    public String [] getReadonlyPolicy() {
        return this.ReadonlyPolicy;
    }

    /**
     * Set <p>Specify the policy for request routing of read-write requests for the modified account.</p><ul><li>master: means read-write requests are routed to the primary node.</li><li>replication: means read-write requests are routed to the secondary node.</li></ul>
     * @param ReadonlyPolicy <p>Specify the policy for request routing of read-write requests for the modified account.</p><ul><li>master: means read-write requests are routed to the primary node.</li><li>replication: means read-write requests are routed to the secondary node.</li></ul>
     */
    public void setReadonlyPolicy(String [] ReadonlyPolicy) {
        this.ReadonlyPolicy = ReadonlyPolicy;
    }

    /**
     * Get <p>Specify the read/write permission of the account to be modified.</p><ul><li>r: Read-only.</li><li>w: Write-only.</li><li>rw: Read-write.</li></ul> 
     * @return Privilege <p>Specify the read/write permission of the account to be modified.</p><ul><li>r: Read-only.</li><li>w: Write-only.</li><li>rw: Read-write.</li></ul>
     */
    public String getPrivilege() {
        return this.Privilege;
    }

    /**
     * Set <p>Specify the read/write permission of the account to be modified.</p><ul><li>r: Read-only.</li><li>w: Write-only.</li><li>rw: Read-write.</li></ul>
     * @param Privilege <p>Specify the read/write permission of the account to be modified.</p><ul><li>r: Read-only.</li><li>w: Write-only.</li><li>rw: Read-write.</li></ul>
     */
    public void setPrivilege(String Privilege) {
        this.Privilege = Privilege;
    }

    /**
     * Get <p>Specifies whether to set the default account (root) to a password-free account. Custom accounts do not support password-free access.</p><ul><li>true: The default account (root) is set to a password-free account.</li><li>false: The default account (root) is not set to a password-free account.</li></ul> 
     * @return NoAuth <p>Specifies whether to set the default account (root) to a password-free account. Custom accounts do not support password-free access.</p><ul><li>true: The default account (root) is set to a password-free account.</li><li>false: The default account (root) is not set to a password-free account.</li></ul>
     */
    public Boolean getNoAuth() {
        return this.NoAuth;
    }

    /**
     * Set <p>Specifies whether to set the default account (root) to a password-free account. Custom accounts do not support password-free access.</p><ul><li>true: The default account (root) is set to a password-free account.</li><li>false: The default account (root) is not set to a password-free account.</li></ul>
     * @param NoAuth <p>Specifies whether to set the default account (root) to a password-free account. Custom accounts do not support password-free access.</p><ul><li>true: The default account (root) is set to a password-free account.</li><li>false: The default account (root) is not set to a password-free account.</li></ul>
     */
    public void setNoAuth(Boolean NoAuth) {
        this.NoAuth = NoAuth;
    }

    /**
     * Get <p>Whether to enable password encryption for transmission.</p><ul><li>true: Encrypted.</li><li>false: Not encrypted (default value).</li></ul> 
     * @return EncryptPassword <p>Whether to enable password encryption for transmission.</p><ul><li>true: Encrypted.</li><li>false: Not encrypted (default value).</li></ul>
     */
    public Boolean getEncryptPassword() {
        return this.EncryptPassword;
    }

    /**
     * Set <p>Whether to enable password encryption for transmission.</p><ul><li>true: Encrypted.</li><li>false: Not encrypted (default value).</li></ul>
     * @param EncryptPassword <p>Whether to enable password encryption for transmission.</p><ul><li>true: Encrypted.</li><li>false: Not encrypted (default value).</li></ul>
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


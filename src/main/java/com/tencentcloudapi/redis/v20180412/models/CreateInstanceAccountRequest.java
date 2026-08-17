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

public class CreateInstanceAccountRequest extends AbstractModel {

    /**
    * <p>Instance ID. Log in to the <a href="https://console.cloud.tencent.com/redis">Redis console</a> and copy the instance ID from the instance list.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Custom account name for accessing the database.</p><ul><li>Consist of letters, digits, underscores, and hyphens only.</li><li>Length cannot be greater than 32.</li></ul>
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * <p>Set a password for the customized account. The password complexity requirements are as follows:</p><ul><li>Character count: [8,64].</li><li>Contain at least two kinds of lowercase letters, uppercase letters, digits and characters ()`~!@#$%^&amp;*-+=_|{}[]:;&lt;&gt;,.?/.</li><li>Cannot start with "/".</li></ul>
    */
    @SerializedName("AccountPassword")
    @Expose
    private String AccountPassword;

    /**
    * <p>Read requests for the designated account are routed to the primary node or replica node. Read-only replica is not enabled, and selection of replica nodes is not supported.</p><ul><li>master: primary node</li><li>replication: replica node</li></ul>
    */
    @SerializedName("ReadonlyPolicy")
    @Expose
    private String [] ReadonlyPolicy;

    /**
    * <p>Account read/write permission supports selecting read-only or read-write permission.</p><ul><li>r: Read-only.</li><li>rw: Read-write.</li></ul>
    */
    @SerializedName("Privilege")
    @Expose
    private String Privilege;

    /**
    * <p>Description information about account remarks, with a length of [0, 64] bytes.</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>Whether to enable password encryption for transmission.</p><ul><li>true: Encrypted.</li><li>false: Not encrypted (default value).</li></ul>
    */
    @SerializedName("EncryptPassword")
    @Expose
    private Boolean EncryptPassword;

    /**
     * Get <p>Instance ID. Log in to the <a href="https://console.cloud.tencent.com/redis">Redis console</a> and copy the instance ID from the instance list.</p> 
     * @return InstanceId <p>Instance ID. Log in to the <a href="https://console.cloud.tencent.com/redis">Redis console</a> and copy the instance ID from the instance list.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID. Log in to the <a href="https://console.cloud.tencent.com/redis">Redis console</a> and copy the instance ID from the instance list.</p>
     * @param InstanceId <p>Instance ID. Log in to the <a href="https://console.cloud.tencent.com/redis">Redis console</a> and copy the instance ID from the instance list.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Custom account name for accessing the database.</p><ul><li>Consist of letters, digits, underscores, and hyphens only.</li><li>Length cannot be greater than 32.</li></ul> 
     * @return AccountName <p>Custom account name for accessing the database.</p><ul><li>Consist of letters, digits, underscores, and hyphens only.</li><li>Length cannot be greater than 32.</li></ul>
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set <p>Custom account name for accessing the database.</p><ul><li>Consist of letters, digits, underscores, and hyphens only.</li><li>Length cannot be greater than 32.</li></ul>
     * @param AccountName <p>Custom account name for accessing the database.</p><ul><li>Consist of letters, digits, underscores, and hyphens only.</li><li>Length cannot be greater than 32.</li></ul>
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get <p>Set a password for the customized account. The password complexity requirements are as follows:</p><ul><li>Character count: [8,64].</li><li>Contain at least two kinds of lowercase letters, uppercase letters, digits and characters ()`~!@#$%^&amp;*-+=_|{}[]:;&lt;&gt;,.?/.</li><li>Cannot start with "/".</li></ul> 
     * @return AccountPassword <p>Set a password for the customized account. The password complexity requirements are as follows:</p><ul><li>Character count: [8,64].</li><li>Contain at least two kinds of lowercase letters, uppercase letters, digits and characters ()`~!@#$%^&amp;*-+=_|{}[]:;&lt;&gt;,.?/.</li><li>Cannot start with "/".</li></ul>
     */
    public String getAccountPassword() {
        return this.AccountPassword;
    }

    /**
     * Set <p>Set a password for the customized account. The password complexity requirements are as follows:</p><ul><li>Character count: [8,64].</li><li>Contain at least two kinds of lowercase letters, uppercase letters, digits and characters ()`~!@#$%^&amp;*-+=_|{}[]:;&lt;&gt;,.?/.</li><li>Cannot start with "/".</li></ul>
     * @param AccountPassword <p>Set a password for the customized account. The password complexity requirements are as follows:</p><ul><li>Character count: [8,64].</li><li>Contain at least two kinds of lowercase letters, uppercase letters, digits and characters ()`~!@#$%^&amp;*-+=_|{}[]:;&lt;&gt;,.?/.</li><li>Cannot start with "/".</li></ul>
     */
    public void setAccountPassword(String AccountPassword) {
        this.AccountPassword = AccountPassword;
    }

    /**
     * Get <p>Read requests for the designated account are routed to the primary node or replica node. Read-only replica is not enabled, and selection of replica nodes is not supported.</p><ul><li>master: primary node</li><li>replication: replica node</li></ul> 
     * @return ReadonlyPolicy <p>Read requests for the designated account are routed to the primary node or replica node. Read-only replica is not enabled, and selection of replica nodes is not supported.</p><ul><li>master: primary node</li><li>replication: replica node</li></ul>
     */
    public String [] getReadonlyPolicy() {
        return this.ReadonlyPolicy;
    }

    /**
     * Set <p>Read requests for the designated account are routed to the primary node or replica node. Read-only replica is not enabled, and selection of replica nodes is not supported.</p><ul><li>master: primary node</li><li>replication: replica node</li></ul>
     * @param ReadonlyPolicy <p>Read requests for the designated account are routed to the primary node or replica node. Read-only replica is not enabled, and selection of replica nodes is not supported.</p><ul><li>master: primary node</li><li>replication: replica node</li></ul>
     */
    public void setReadonlyPolicy(String [] ReadonlyPolicy) {
        this.ReadonlyPolicy = ReadonlyPolicy;
    }

    /**
     * Get <p>Account read/write permission supports selecting read-only or read-write permission.</p><ul><li>r: Read-only.</li><li>rw: Read-write.</li></ul> 
     * @return Privilege <p>Account read/write permission supports selecting read-only or read-write permission.</p><ul><li>r: Read-only.</li><li>rw: Read-write.</li></ul>
     */
    public String getPrivilege() {
        return this.Privilege;
    }

    /**
     * Set <p>Account read/write permission supports selecting read-only or read-write permission.</p><ul><li>r: Read-only.</li><li>rw: Read-write.</li></ul>
     * @param Privilege <p>Account read/write permission supports selecting read-only or read-write permission.</p><ul><li>r: Read-only.</li><li>rw: Read-write.</li></ul>
     */
    public void setPrivilege(String Privilege) {
        this.Privilege = Privilege;
    }

    /**
     * Get <p>Description information about account remarks, with a length of [0, 64] bytes.</p> 
     * @return Remark <p>Description information about account remarks, with a length of [0, 64] bytes.</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>Description information about account remarks, with a length of [0, 64] bytes.</p>
     * @param Remark <p>Description information about account remarks, with a length of [0, 64] bytes.</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
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

    public CreateInstanceAccountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInstanceAccountRequest(CreateInstanceAccountRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AccountName != null) {
            this.AccountName = new String(source.AccountName);
        }
        if (source.AccountPassword != null) {
            this.AccountPassword = new String(source.AccountPassword);
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
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
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
        this.setParamArraySimple(map, prefix + "ReadonlyPolicy.", this.ReadonlyPolicy);
        this.setParamSimple(map, prefix + "Privilege", this.Privilege);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "EncryptPassword", this.EncryptPassword);

    }
}


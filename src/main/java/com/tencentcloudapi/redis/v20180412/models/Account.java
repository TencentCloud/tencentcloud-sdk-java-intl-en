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

public class Account extends AbstractModel {

    /**
    * <p>Instance ID.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Account name.</p>
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * <p>Account description.</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>Read/write permission policy. - r: read-only. - w: write-only. - rw: read-write.</p>
    */
    @SerializedName("Privilege")
    @Expose
    private String Privilege;

    /**
    * <p>Read-only Routing Policy. - master: Master node. - replication: Replica node.</p>
    */
    @SerializedName("ReadonlyPolicy")
    @Expose
    private String [] ReadonlyPolicy;

    /**
    * <p>Sub-account status. - 1: Account change in progress. - 2: Valid. - 4: Deleted.</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Account creation time.</p><p>If the parameter is an empty string, the account was created in an earlier version where the recording feature was not supported.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>The time when the account last changed the password.</p><p>If the parameter is an empty string, it means the account was created in an earlier version that did not support the password modification time recording feature.</p>
    */
    @SerializedName("PasswordLastModifiedTime")
    @Expose
    private String PasswordLastModifiedTime;

    /**
     * Get <p>Instance ID.</p> 
     * @return InstanceId <p>Instance ID.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID.</p>
     * @param InstanceId <p>Instance ID.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Account name.</p> 
     * @return AccountName <p>Account name.</p>
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set <p>Account name.</p>
     * @param AccountName <p>Account name.</p>
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
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
     * Get <p>Read/write permission policy. - r: read-only. - w: write-only. - rw: read-write.</p> 
     * @return Privilege <p>Read/write permission policy. - r: read-only. - w: write-only. - rw: read-write.</p>
     */
    public String getPrivilege() {
        return this.Privilege;
    }

    /**
     * Set <p>Read/write permission policy. - r: read-only. - w: write-only. - rw: read-write.</p>
     * @param Privilege <p>Read/write permission policy. - r: read-only. - w: write-only. - rw: read-write.</p>
     */
    public void setPrivilege(String Privilege) {
        this.Privilege = Privilege;
    }

    /**
     * Get <p>Read-only Routing Policy. - master: Master node. - replication: Replica node.</p> 
     * @return ReadonlyPolicy <p>Read-only Routing Policy. - master: Master node. - replication: Replica node.</p>
     */
    public String [] getReadonlyPolicy() {
        return this.ReadonlyPolicy;
    }

    /**
     * Set <p>Read-only Routing Policy. - master: Master node. - replication: Replica node.</p>
     * @param ReadonlyPolicy <p>Read-only Routing Policy. - master: Master node. - replication: Replica node.</p>
     */
    public void setReadonlyPolicy(String [] ReadonlyPolicy) {
        this.ReadonlyPolicy = ReadonlyPolicy;
    }

    /**
     * Get <p>Sub-account status. - 1: Account change in progress. - 2: Valid. - 4: Deleted.</p> 
     * @return Status <p>Sub-account status. - 1: Account change in progress. - 2: Valid. - 4: Deleted.</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Sub-account status. - 1: Account change in progress. - 2: Valid. - 4: Deleted.</p>
     * @param Status <p>Sub-account status. - 1: Account change in progress. - 2: Valid. - 4: Deleted.</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Account creation time.</p><p>If the parameter is an empty string, the account was created in an earlier version where the recording feature was not supported.</p> 
     * @return CreateTime <p>Account creation time.</p><p>If the parameter is an empty string, the account was created in an earlier version where the recording feature was not supported.</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Account creation time.</p><p>If the parameter is an empty string, the account was created in an earlier version where the recording feature was not supported.</p>
     * @param CreateTime <p>Account creation time.</p><p>If the parameter is an empty string, the account was created in an earlier version where the recording feature was not supported.</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>The time when the account last changed the password.</p><p>If the parameter is an empty string, it means the account was created in an earlier version that did not support the password modification time recording feature.</p> 
     * @return PasswordLastModifiedTime <p>The time when the account last changed the password.</p><p>If the parameter is an empty string, it means the account was created in an earlier version that did not support the password modification time recording feature.</p>
     */
    public String getPasswordLastModifiedTime() {
        return this.PasswordLastModifiedTime;
    }

    /**
     * Set <p>The time when the account last changed the password.</p><p>If the parameter is an empty string, it means the account was created in an earlier version that did not support the password modification time recording feature.</p>
     * @param PasswordLastModifiedTime <p>The time when the account last changed the password.</p><p>If the parameter is an empty string, it means the account was created in an earlier version that did not support the password modification time recording feature.</p>
     */
    public void setPasswordLastModifiedTime(String PasswordLastModifiedTime) {
        this.PasswordLastModifiedTime = PasswordLastModifiedTime;
    }

    public Account() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Account(Account source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AccountName != null) {
            this.AccountName = new String(source.AccountName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Privilege != null) {
            this.Privilege = new String(source.Privilege);
        }
        if (source.ReadonlyPolicy != null) {
            this.ReadonlyPolicy = new String[source.ReadonlyPolicy.length];
            for (int i = 0; i < source.ReadonlyPolicy.length; i++) {
                this.ReadonlyPolicy[i] = new String(source.ReadonlyPolicy[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.PasswordLastModifiedTime != null) {
            this.PasswordLastModifiedTime = new String(source.PasswordLastModifiedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Privilege", this.Privilege);
        this.setParamArraySimple(map, prefix + "ReadonlyPolicy.", this.ReadonlyPolicy);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "PasswordLastModifiedTime", this.PasswordLastModifiedTime);

    }
}


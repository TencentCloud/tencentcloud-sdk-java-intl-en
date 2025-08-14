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
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Account name.
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * Account description.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Read/Write permission policy.
- r: read-only.

 - w: write-only.
- rw: read/write.
    */
    @SerializedName("Privilege")
    @Expose
    private String Privilege;

    /**
    * Read-only routing policy.
 - master: primary node.
 - replication: replica node.
    */
    @SerializedName("ReadonlyPolicy")
    @Expose
    private String [] ReadonlyPolicy;

    /**
    * Sub-account status.
 - 1: account under modification.
 - 2: valid account.
 - 4: account deleted.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Account name. 
     * @return AccountName Account name.
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set Account name.
     * @param AccountName Account name.
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get Account description. 
     * @return Remark Account description.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Account description.
     * @param Remark Account description.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Read/Write permission policy.
- r: read-only.

 - w: write-only.
- rw: read/write. 
     * @return Privilege Read/Write permission policy.
- r: read-only.

 - w: write-only.
- rw: read/write.
     */
    public String getPrivilege() {
        return this.Privilege;
    }

    /**
     * Set Read/Write permission policy.
- r: read-only.

 - w: write-only.
- rw: read/write.
     * @param Privilege Read/Write permission policy.
- r: read-only.

 - w: write-only.
- rw: read/write.
     */
    public void setPrivilege(String Privilege) {
        this.Privilege = Privilege;
    }

    /**
     * Get Read-only routing policy.
 - master: primary node.
 - replication: replica node. 
     * @return ReadonlyPolicy Read-only routing policy.
 - master: primary node.
 - replication: replica node.
     */
    public String [] getReadonlyPolicy() {
        return this.ReadonlyPolicy;
    }

    /**
     * Set Read-only routing policy.
 - master: primary node.
 - replication: replica node.
     * @param ReadonlyPolicy Read-only routing policy.
 - master: primary node.
 - replication: replica node.
     */
    public void setReadonlyPolicy(String [] ReadonlyPolicy) {
        this.ReadonlyPolicy = ReadonlyPolicy;
    }

    /**
     * Get Sub-account status.
 - 1: account under modification.
 - 2: valid account.
 - 4: account deleted. 
     * @return Status Sub-account status.
 - 1: account under modification.
 - 2: valid account.
 - 4: account deleted.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Sub-account status.
 - 1: account under modification.
 - 2: valid account.
 - 4: account deleted.
     * @param Status Sub-account status.
 - 1: account under modification.
 - 2: valid account.
 - 4: account deleted.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
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

    }
}


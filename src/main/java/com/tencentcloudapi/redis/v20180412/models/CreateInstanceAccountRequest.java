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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInstanceAccountRequest extends AbstractModel{

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Sub-account name
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * Sub-account password
    */
    @SerializedName("AccountPassword")
    @Expose
    private String AccountPassword;

    /**
    * Routing policy. Enter `master` for primary node or `replication` for secondary node
    */
    @SerializedName("ReadonlyPolicy")
    @Expose
    private String [] ReadonlyPolicy;

    /**
    * Read/write policy. Valid values: r (read-only), rw (read/write).
    */
    @SerializedName("Privilege")
    @Expose
    private String Privilege;

    /**
    * Sub-account description information
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Sub-account name 
     * @return AccountName Sub-account name
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set Sub-account name
     * @param AccountName Sub-account name
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get Sub-account password 
     * @return AccountPassword Sub-account password
     */
    public String getAccountPassword() {
        return this.AccountPassword;
    }

    /**
     * Set Sub-account password
     * @param AccountPassword Sub-account password
     */
    public void setAccountPassword(String AccountPassword) {
        this.AccountPassword = AccountPassword;
    }

    /**
     * Get Routing policy. Enter `master` for primary node or `replication` for secondary node 
     * @return ReadonlyPolicy Routing policy. Enter `master` for primary node or `replication` for secondary node
     */
    public String [] getReadonlyPolicy() {
        return this.ReadonlyPolicy;
    }

    /**
     * Set Routing policy. Enter `master` for primary node or `replication` for secondary node
     * @param ReadonlyPolicy Routing policy. Enter `master` for primary node or `replication` for secondary node
     */
    public void setReadonlyPolicy(String [] ReadonlyPolicy) {
        this.ReadonlyPolicy = ReadonlyPolicy;
    }

    /**
     * Get Read/write policy. Valid values: r (read-only), rw (read/write). 
     * @return Privilege Read/write policy. Valid values: r (read-only), rw (read/write).
     */
    public String getPrivilege() {
        return this.Privilege;
    }

    /**
     * Set Read/write policy. Valid values: r (read-only), rw (read/write).
     * @param Privilege Read/write policy. Valid values: r (read-only), rw (read/write).
     */
    public void setPrivilege(String Privilege) {
        this.Privilege = Privilege;
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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);
        this.setParamSimple(map, prefix + "AccountPassword", this.AccountPassword);
        this.setParamArraySimple(map, prefix + "ReadonlyPolicy.", this.ReadonlyPolicy);
        this.setParamSimple(map, prefix + "Privilege", this.Privilege);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}


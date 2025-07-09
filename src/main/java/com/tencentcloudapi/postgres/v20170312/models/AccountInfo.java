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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccountInfo extends AbstractModel {

    /**
    * Instance ID in the format of postgres-lnp6j617
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * Account
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Account remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Account status. 1: creating, 2: normal, 3: modifying, 4: resetting password, -1: deleting
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Account creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Account last modified time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get Instance ID in the format of postgres-lnp6j617 
     * @return DBInstanceId Instance ID in the format of postgres-lnp6j617
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set Instance ID in the format of postgres-lnp6j617
     * @param DBInstanceId Instance ID in the format of postgres-lnp6j617
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get Account 
     * @return UserName Account
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Account
     * @param UserName Account
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Account remarks 
     * @return Remark Account remarks
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Account remarks
     * @param Remark Account remarks
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Account status. 1: creating, 2: normal, 3: modifying, 4: resetting password, -1: deleting 
     * @return Status Account status. 1: creating, 2: normal, 3: modifying, 4: resetting password, -1: deleting
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Account status. 1: creating, 2: normal, 3: modifying, 4: resetting password, -1: deleting
     * @param Status Account status. 1: creating, 2: normal, 3: modifying, 4: resetting password, -1: deleting
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Account creation time 
     * @return CreateTime Account creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Account creation time
     * @param CreateTime Account creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Account last modified time 
     * @return UpdateTime Account last modified time
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Account last modified time
     * @param UpdateTime Account last modified time
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public AccountInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccountInfo(AccountInfo source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}


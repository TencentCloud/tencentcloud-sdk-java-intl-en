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
    * Specifies the account remark.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Account status. valid values: 1-creating, 2-normal, 3-modifying, 4-resetting password, 5-locked, -1-deleting.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last update time of the account.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Specifies the last modified time of the account.

This field will only take effect after 2025-10-31. No matter whether the password is modified before, the value will be the default value: 0000-00-00 00:00:00
Indicates that this field is updated only when the password is modified via the cloud API or the console.
    */
    @SerializedName("PasswordUpdateTime")
    @Expose
    private String PasswordUpdateTime;

    /**
    * Account type. valid values: normal, tencentDBSuper. normal references a general user, tencentDBSuper possesses the pg_tencentdb_superuser user role.
    */
    @SerializedName("UserType")
    @Expose
    private String UserType;

    /**
    * Specifies whether CAM verification is enabled for the user account.
    */
    @SerializedName("OpenCam")
    @Expose
    private Boolean OpenCam;

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
     * Get Specifies the account remark. 
     * @return Remark Specifies the account remark.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Specifies the account remark.
     * @param Remark Specifies the account remark.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Account status. valid values: 1-creating, 2-normal, 3-modifying, 4-resetting password, 5-locked, -1-deleting. 
     * @return Status Account status. valid values: 1-creating, 2-normal, 3-modifying, 4-resetting password, 5-locked, -1-deleting.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Account status. valid values: 1-creating, 2-normal, 3-modifying, 4-resetting password, 5-locked, -1-deleting.
     * @param Status Account status. valid values: 1-creating, 2-normal, 3-modifying, 4-resetting password, 5-locked, -1-deleting.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Creation time. 
     * @return CreateTime Creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
     * @param CreateTime Creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last update time of the account. 
     * @return UpdateTime Last update time of the account.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last update time of the account.
     * @param UpdateTime Last update time of the account.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Specifies the last modified time of the account.

This field will only take effect after 2025-10-31. No matter whether the password is modified before, the value will be the default value: 0000-00-00 00:00:00
Indicates that this field is updated only when the password is modified via the cloud API or the console. 
     * @return PasswordUpdateTime Specifies the last modified time of the account.

This field will only take effect after 2025-10-31. No matter whether the password is modified before, the value will be the default value: 0000-00-00 00:00:00
Indicates that this field is updated only when the password is modified via the cloud API or the console.
     */
    public String getPasswordUpdateTime() {
        return this.PasswordUpdateTime;
    }

    /**
     * Set Specifies the last modified time of the account.

This field will only take effect after 2025-10-31. No matter whether the password is modified before, the value will be the default value: 0000-00-00 00:00:00
Indicates that this field is updated only when the password is modified via the cloud API or the console.
     * @param PasswordUpdateTime Specifies the last modified time of the account.

This field will only take effect after 2025-10-31. No matter whether the password is modified before, the value will be the default value: 0000-00-00 00:00:00
Indicates that this field is updated only when the password is modified via the cloud API or the console.
     */
    public void setPasswordUpdateTime(String PasswordUpdateTime) {
        this.PasswordUpdateTime = PasswordUpdateTime;
    }

    /**
     * Get Account type. valid values: normal, tencentDBSuper. normal references a general user, tencentDBSuper possesses the pg_tencentdb_superuser user role. 
     * @return UserType Account type. valid values: normal, tencentDBSuper. normal references a general user, tencentDBSuper possesses the pg_tencentdb_superuser user role.
     */
    public String getUserType() {
        return this.UserType;
    }

    /**
     * Set Account type. valid values: normal, tencentDBSuper. normal references a general user, tencentDBSuper possesses the pg_tencentdb_superuser user role.
     * @param UserType Account type. valid values: normal, tencentDBSuper. normal references a general user, tencentDBSuper possesses the pg_tencentdb_superuser user role.
     */
    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    /**
     * Get Specifies whether CAM verification is enabled for the user account. 
     * @return OpenCam Specifies whether CAM verification is enabled for the user account.
     */
    public Boolean getOpenCam() {
        return this.OpenCam;
    }

    /**
     * Set Specifies whether CAM verification is enabled for the user account.
     * @param OpenCam Specifies whether CAM verification is enabled for the user account.
     */
    public void setOpenCam(Boolean OpenCam) {
        this.OpenCam = OpenCam;
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
        if (source.PasswordUpdateTime != null) {
            this.PasswordUpdateTime = new String(source.PasswordUpdateTime);
        }
        if (source.UserType != null) {
            this.UserType = new String(source.UserType);
        }
        if (source.OpenCam != null) {
            this.OpenCam = new Boolean(source.OpenCam);
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
        this.setParamSimple(map, prefix + "PasswordUpdateTime", this.PasswordUpdateTime);
        this.setParamSimple(map, prefix + "UserType", this.UserType);
        this.setParamSimple(map, prefix + "OpenCam", this.OpenCam);

    }
}


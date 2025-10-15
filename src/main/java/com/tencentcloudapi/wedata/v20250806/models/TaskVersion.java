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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskVersion extends AbstractModel {

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Version number

    */
    @SerializedName("VersionNum")
    @Expose
    private String VersionNum;

    /**
    * Creator ID
    */
    @SerializedName("CreateUserUin")
    @Expose
    private String CreateUserUin;

    /**
    * Saved version ID
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
    * Version description

    */
    @SerializedName("VersionRemark")
    @Expose
    private String VersionRemark;

    /**
    * Approval status (only for submit version).

    */
    @SerializedName("ApproveStatus")
    @Expose
    private String ApproveStatus;

    /**
    * Production status (only for submit version).

    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Approver (only for submit version).

    */
    @SerializedName("ApproveUserUin")
    @Expose
    private String ApproveUserUin;

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

    /**
     * Get Version number
 
     * @return VersionNum Version number

     */
    public String getVersionNum() {
        return this.VersionNum;
    }

    /**
     * Set Version number

     * @param VersionNum Version number

     */
    public void setVersionNum(String VersionNum) {
        this.VersionNum = VersionNum;
    }

    /**
     * Get Creator ID 
     * @return CreateUserUin Creator ID
     */
    public String getCreateUserUin() {
        return this.CreateUserUin;
    }

    /**
     * Set Creator ID
     * @param CreateUserUin Creator ID
     */
    public void setCreateUserUin(String CreateUserUin) {
        this.CreateUserUin = CreateUserUin;
    }

    /**
     * Get Saved version ID 
     * @return VersionId Saved version ID
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set Saved version ID
     * @param VersionId Saved version ID
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get Version description
 
     * @return VersionRemark Version description

     */
    public String getVersionRemark() {
        return this.VersionRemark;
    }

    /**
     * Set Version description

     * @param VersionRemark Version description

     */
    public void setVersionRemark(String VersionRemark) {
        this.VersionRemark = VersionRemark;
    }

    /**
     * Get Approval status (only for submit version).
 
     * @return ApproveStatus Approval status (only for submit version).

     */
    public String getApproveStatus() {
        return this.ApproveStatus;
    }

    /**
     * Set Approval status (only for submit version).

     * @param ApproveStatus Approval status (only for submit version).

     */
    public void setApproveStatus(String ApproveStatus) {
        this.ApproveStatus = ApproveStatus;
    }

    /**
     * Get Production status (only for submit version).
 
     * @return Status Production status (only for submit version).

     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Production status (only for submit version).

     * @param Status Production status (only for submit version).

     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Approver (only for submit version).
 
     * @return ApproveUserUin Approver (only for submit version).

     */
    public String getApproveUserUin() {
        return this.ApproveUserUin;
    }

    /**
     * Set Approver (only for submit version).

     * @param ApproveUserUin Approver (only for submit version).

     */
    public void setApproveUserUin(String ApproveUserUin) {
        this.ApproveUserUin = ApproveUserUin;
    }

    public TaskVersion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskVersion(TaskVersion source) {
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.VersionNum != null) {
            this.VersionNum = new String(source.VersionNum);
        }
        if (source.CreateUserUin != null) {
            this.CreateUserUin = new String(source.CreateUserUin);
        }
        if (source.VersionId != null) {
            this.VersionId = new String(source.VersionId);
        }
        if (source.VersionRemark != null) {
            this.VersionRemark = new String(source.VersionRemark);
        }
        if (source.ApproveStatus != null) {
            this.ApproveStatus = new String(source.ApproveStatus);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ApproveUserUin != null) {
            this.ApproveUserUin = new String(source.ApproveUserUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "VersionNum", this.VersionNum);
        this.setParamSimple(map, prefix + "CreateUserUin", this.CreateUserUin);
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);
        this.setParamSimple(map, prefix + "VersionRemark", this.VersionRemark);
        this.setParamSimple(map, prefix + "ApproveStatus", this.ApproveStatus);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ApproveUserUin", this.ApproveUserUin);

    }
}


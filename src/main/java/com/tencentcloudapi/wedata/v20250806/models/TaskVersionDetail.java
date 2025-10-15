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

public class TaskVersionDetail extends AbstractModel {

    /**
    * Creation time.
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
    * Specifies the version creator.

    */
    @SerializedName("CreateUserUin")
    @Expose
    private String CreateUserUin;

    /**
    * Specifies the version Id to save.

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
    * Production status  (only for submit version).
    */
    @SerializedName("ApproveTime")
    @Expose
    private String ApproveTime;

    /**
    * Describes the task detail of the version.

    */
    @SerializedName("Task")
    @Expose
    private Task Task;

    /**
    * Approver Id.
    */
    @SerializedName("ApproveUserUin")
    @Expose
    private String ApproveUserUin;

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
     * Get Specifies the version creator.
 
     * @return CreateUserUin Specifies the version creator.

     */
    public String getCreateUserUin() {
        return this.CreateUserUin;
    }

    /**
     * Set Specifies the version creator.

     * @param CreateUserUin Specifies the version creator.

     */
    public void setCreateUserUin(String CreateUserUin) {
        this.CreateUserUin = CreateUserUin;
    }

    /**
     * Get Specifies the version Id to save.
 
     * @return VersionId Specifies the version Id to save.

     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set Specifies the version Id to save.

     * @param VersionId Specifies the version Id to save.

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
     * Get Production status  (only for submit version). 
     * @return ApproveTime Production status  (only for submit version).
     */
    public String getApproveTime() {
        return this.ApproveTime;
    }

    /**
     * Set Production status  (only for submit version).
     * @param ApproveTime Production status  (only for submit version).
     */
    public void setApproveTime(String ApproveTime) {
        this.ApproveTime = ApproveTime;
    }

    /**
     * Get Describes the task detail of the version.
 
     * @return Task Describes the task detail of the version.

     */
    public Task getTask() {
        return this.Task;
    }

    /**
     * Set Describes the task detail of the version.

     * @param Task Describes the task detail of the version.

     */
    public void setTask(Task Task) {
        this.Task = Task;
    }

    /**
     * Get Approver Id. 
     * @return ApproveUserUin Approver Id.
     */
    public String getApproveUserUin() {
        return this.ApproveUserUin;
    }

    /**
     * Set Approver Id.
     * @param ApproveUserUin Approver Id.
     */
    public void setApproveUserUin(String ApproveUserUin) {
        this.ApproveUserUin = ApproveUserUin;
    }

    public TaskVersionDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskVersionDetail(TaskVersionDetail source) {
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
        if (source.ApproveTime != null) {
            this.ApproveTime = new String(source.ApproveTime);
        }
        if (source.Task != null) {
            this.Task = new Task(source.Task);
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
        this.setParamSimple(map, prefix + "ApproveTime", this.ApproveTime);
        this.setParamObj(map, prefix + "Task.", this.Task);
        this.setParamSimple(map, prefix + "ApproveUserUin", this.ApproveUserUin);

    }
}


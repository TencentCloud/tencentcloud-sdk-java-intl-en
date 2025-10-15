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

public class ListTasksRequest extends AbstractModel {

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Specifies the data page number of the request. default value is 1. valid values: equal to or greater than 1.
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Specifies the number of data records displayed per page. default: 10. value range: 10 to 200.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Task name.
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Workflow ID
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * Owner ID.
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * Task type
    */
    @SerializedName("TaskTypeId")
    @Expose
    private Long TaskTypeId;

    /**
    * Task Status:
* N: New
* Y: Scheduling
* F: Offline
* O: Paused
* T: Offlining
* INVALID: Invalid
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Submission status.
    */
    @SerializedName("Submit")
    @Expose
    private Boolean Submit;

    /**
    * Bundle id.
    */
    @SerializedName("BundleId")
    @Expose
    private String BundleId;

    /**
    * Creator ID.
    */
    @SerializedName("CreateUserUin")
    @Expose
    private String CreateUserUin;

    /**
    * Modification time range (yyyy-MM-dd HH:mm:ss). Two time values must be provided in the array.
    */
    @SerializedName("ModifyTime")
    @Expose
    private String [] ModifyTime;

    /**
    * Creation time range (yyyy-MM-dd HH:MM:ss). Two time values must be provided in the array.
    */
    @SerializedName("CreateTime")
    @Expose
    private String [] CreateTime;

    /**
     * Get Project ID. 
     * @return ProjectId Project ID.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.
     * @param ProjectId Project ID.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Specifies the data page number of the request. default value is 1. valid values: equal to or greater than 1. 
     * @return PageNumber Specifies the data page number of the request. default value is 1. valid values: equal to or greater than 1.
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Specifies the data page number of the request. default value is 1. valid values: equal to or greater than 1.
     * @param PageNumber Specifies the data page number of the request. default value is 1. valid values: equal to or greater than 1.
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Specifies the number of data records displayed per page. default: 10. value range: 10 to 200. 
     * @return PageSize Specifies the number of data records displayed per page. default: 10. value range: 10 to 200.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Specifies the number of data records displayed per page. default: 10. value range: 10 to 200.
     * @param PageSize Specifies the number of data records displayed per page. default: 10. value range: 10 to 200.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Task name. 
     * @return TaskName Task name.
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set Task name.
     * @param TaskName Task name.
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get Workflow ID 
     * @return WorkflowId Workflow ID
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set Workflow ID
     * @param WorkflowId Workflow ID
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get Owner ID. 
     * @return OwnerUin Owner ID.
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set Owner ID.
     * @param OwnerUin Owner ID.
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get Task type 
     * @return TaskTypeId Task type
     */
    public Long getTaskTypeId() {
        return this.TaskTypeId;
    }

    /**
     * Set Task type
     * @param TaskTypeId Task type
     */
    public void setTaskTypeId(Long TaskTypeId) {
        this.TaskTypeId = TaskTypeId;
    }

    /**
     * Get Task Status:
* N: New
* Y: Scheduling
* F: Offline
* O: Paused
* T: Offlining
* INVALID: Invalid 
     * @return Status Task Status:
* N: New
* Y: Scheduling
* F: Offline
* O: Paused
* T: Offlining
* INVALID: Invalid
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task Status:
* N: New
* Y: Scheduling
* F: Offline
* O: Paused
* T: Offlining
* INVALID: Invalid
     * @param Status Task Status:
* N: New
* Y: Scheduling
* F: Offline
* O: Paused
* T: Offlining
* INVALID: Invalid
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Submission status. 
     * @return Submit Submission status.
     */
    public Boolean getSubmit() {
        return this.Submit;
    }

    /**
     * Set Submission status.
     * @param Submit Submission status.
     */
    public void setSubmit(Boolean Submit) {
        this.Submit = Submit;
    }

    /**
     * Get Bundle id. 
     * @return BundleId Bundle id.
     */
    public String getBundleId() {
        return this.BundleId;
    }

    /**
     * Set Bundle id.
     * @param BundleId Bundle id.
     */
    public void setBundleId(String BundleId) {
        this.BundleId = BundleId;
    }

    /**
     * Get Creator ID. 
     * @return CreateUserUin Creator ID.
     */
    public String getCreateUserUin() {
        return this.CreateUserUin;
    }

    /**
     * Set Creator ID.
     * @param CreateUserUin Creator ID.
     */
    public void setCreateUserUin(String CreateUserUin) {
        this.CreateUserUin = CreateUserUin;
    }

    /**
     * Get Modification time range (yyyy-MM-dd HH:mm:ss). Two time values must be provided in the array. 
     * @return ModifyTime Modification time range (yyyy-MM-dd HH:mm:ss). Two time values must be provided in the array.
     */
    public String [] getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Modification time range (yyyy-MM-dd HH:mm:ss). Two time values must be provided in the array.
     * @param ModifyTime Modification time range (yyyy-MM-dd HH:mm:ss). Two time values must be provided in the array.
     */
    public void setModifyTime(String [] ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get Creation time range (yyyy-MM-dd HH:MM:ss). Two time values must be provided in the array. 
     * @return CreateTime Creation time range (yyyy-MM-dd HH:MM:ss). Two time values must be provided in the array.
     */
    public String [] getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time range (yyyy-MM-dd HH:MM:ss). Two time values must be provided in the array.
     * @param CreateTime Creation time range (yyyy-MM-dd HH:MM:ss). Two time values must be provided in the array.
     */
    public void setCreateTime(String [] CreateTime) {
        this.CreateTime = CreateTime;
    }

    public ListTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListTasksRequest(ListTasksRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.TaskTypeId != null) {
            this.TaskTypeId = new Long(source.TaskTypeId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Submit != null) {
            this.Submit = new Boolean(source.Submit);
        }
        if (source.BundleId != null) {
            this.BundleId = new String(source.BundleId);
        }
        if (source.CreateUserUin != null) {
            this.CreateUserUin = new String(source.CreateUserUin);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String[source.ModifyTime.length];
            for (int i = 0; i < source.ModifyTime.length; i++) {
                this.ModifyTime[i] = new String(source.ModifyTime[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String[source.CreateTime.length];
            for (int i = 0; i < source.CreateTime.length; i++) {
                this.CreateTime[i] = new String(source.CreateTime[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "TaskTypeId", this.TaskTypeId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Submit", this.Submit);
        this.setParamSimple(map, prefix + "BundleId", this.BundleId);
        this.setParamSimple(map, prefix + "CreateUserUin", this.CreateUserUin);
        this.setParamArraySimple(map, prefix + "ModifyTime.", this.ModifyTime);
        this.setParamArraySimple(map, prefix + "CreateTime.", this.CreateTime);

    }
}


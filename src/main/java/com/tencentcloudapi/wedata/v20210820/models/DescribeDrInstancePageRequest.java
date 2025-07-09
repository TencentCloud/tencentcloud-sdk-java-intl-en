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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDrInstancePageRequest extends AbstractModel {

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Task Source ADHOC || WORKFLOW
    */
    @SerializedName("TaskSource")
    @Expose
    private String TaskSource;

    /**
    * Index Page Number
    */
    @SerializedName("PageIndex")
    @Expose
    private Long PageIndex;

    /**
    * Page size
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Task Name
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Submission Start Time yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Submission End Time yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Folder ID
    */
    @SerializedName("FolderIds")
    @Expose
    private String [] FolderIds;

    /**
    * Workflow ID
    */
    @SerializedName("WorkflowIds")
    @Expose
    private String [] WorkflowIds;

    /**
    * View Only Mine
    */
    @SerializedName("JustMe")
    @Expose
    private Boolean JustMe;

    /**
    * Task Type
    */
    @SerializedName("TaskTypes")
    @Expose
    private String [] TaskTypes;

    /**
    * Trial Run Submitter userId List
    */
    @SerializedName("SubmitUsers")
    @Expose
    private String [] SubmitUsers;

    /**
    * Trial Run Status
    */
    @SerializedName("StatusList")
    @Expose
    private String [] StatusList;

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Task Source ADHOC || WORKFLOW 
     * @return TaskSource Task Source ADHOC || WORKFLOW
     */
    public String getTaskSource() {
        return this.TaskSource;
    }

    /**
     * Set Task Source ADHOC || WORKFLOW
     * @param TaskSource Task Source ADHOC || WORKFLOW
     */
    public void setTaskSource(String TaskSource) {
        this.TaskSource = TaskSource;
    }

    /**
     * Get Index Page Number 
     * @return PageIndex Index Page Number
     */
    public Long getPageIndex() {
        return this.PageIndex;
    }

    /**
     * Set Index Page Number
     * @param PageIndex Index Page Number
     */
    public void setPageIndex(Long PageIndex) {
        this.PageIndex = PageIndex;
    }

    /**
     * Get Page size 
     * @return PageSize Page size
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Page size
     * @param PageSize Page size
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Task Name 
     * @return TaskName Task Name
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set Task Name
     * @param TaskName Task Name
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get Submission Start Time yyyy-MM-dd HH:mm:ss 
     * @return StartTime Submission Start Time yyyy-MM-dd HH:mm:ss
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Submission Start Time yyyy-MM-dd HH:mm:ss
     * @param StartTime Submission Start Time yyyy-MM-dd HH:mm:ss
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Submission End Time yyyy-MM-dd HH:mm:ss 
     * @return EndTime Submission End Time yyyy-MM-dd HH:mm:ss
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Submission End Time yyyy-MM-dd HH:mm:ss
     * @param EndTime Submission End Time yyyy-MM-dd HH:mm:ss
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Folder ID 
     * @return FolderIds Folder ID
     */
    public String [] getFolderIds() {
        return this.FolderIds;
    }

    /**
     * Set Folder ID
     * @param FolderIds Folder ID
     */
    public void setFolderIds(String [] FolderIds) {
        this.FolderIds = FolderIds;
    }

    /**
     * Get Workflow ID 
     * @return WorkflowIds Workflow ID
     */
    public String [] getWorkflowIds() {
        return this.WorkflowIds;
    }

    /**
     * Set Workflow ID
     * @param WorkflowIds Workflow ID
     */
    public void setWorkflowIds(String [] WorkflowIds) {
        this.WorkflowIds = WorkflowIds;
    }

    /**
     * Get View Only Mine 
     * @return JustMe View Only Mine
     */
    public Boolean getJustMe() {
        return this.JustMe;
    }

    /**
     * Set View Only Mine
     * @param JustMe View Only Mine
     */
    public void setJustMe(Boolean JustMe) {
        this.JustMe = JustMe;
    }

    /**
     * Get Task Type 
     * @return TaskTypes Task Type
     */
    public String [] getTaskTypes() {
        return this.TaskTypes;
    }

    /**
     * Set Task Type
     * @param TaskTypes Task Type
     */
    public void setTaskTypes(String [] TaskTypes) {
        this.TaskTypes = TaskTypes;
    }

    /**
     * Get Trial Run Submitter userId List 
     * @return SubmitUsers Trial Run Submitter userId List
     */
    public String [] getSubmitUsers() {
        return this.SubmitUsers;
    }

    /**
     * Set Trial Run Submitter userId List
     * @param SubmitUsers Trial Run Submitter userId List
     */
    public void setSubmitUsers(String [] SubmitUsers) {
        this.SubmitUsers = SubmitUsers;
    }

    /**
     * Get Trial Run Status 
     * @return StatusList Trial Run Status
     */
    public String [] getStatusList() {
        return this.StatusList;
    }

    /**
     * Set Trial Run Status
     * @param StatusList Trial Run Status
     */
    public void setStatusList(String [] StatusList) {
        this.StatusList = StatusList;
    }

    public DescribeDrInstancePageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDrInstancePageRequest(DescribeDrInstancePageRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TaskSource != null) {
            this.TaskSource = new String(source.TaskSource);
        }
        if (source.PageIndex != null) {
            this.PageIndex = new Long(source.PageIndex);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.FolderIds != null) {
            this.FolderIds = new String[source.FolderIds.length];
            for (int i = 0; i < source.FolderIds.length; i++) {
                this.FolderIds[i] = new String(source.FolderIds[i]);
            }
        }
        if (source.WorkflowIds != null) {
            this.WorkflowIds = new String[source.WorkflowIds.length];
            for (int i = 0; i < source.WorkflowIds.length; i++) {
                this.WorkflowIds[i] = new String(source.WorkflowIds[i]);
            }
        }
        if (source.JustMe != null) {
            this.JustMe = new Boolean(source.JustMe);
        }
        if (source.TaskTypes != null) {
            this.TaskTypes = new String[source.TaskTypes.length];
            for (int i = 0; i < source.TaskTypes.length; i++) {
                this.TaskTypes[i] = new String(source.TaskTypes[i]);
            }
        }
        if (source.SubmitUsers != null) {
            this.SubmitUsers = new String[source.SubmitUsers.length];
            for (int i = 0; i < source.SubmitUsers.length; i++) {
                this.SubmitUsers[i] = new String(source.SubmitUsers[i]);
            }
        }
        if (source.StatusList != null) {
            this.StatusList = new String[source.StatusList.length];
            for (int i = 0; i < source.StatusList.length; i++) {
                this.StatusList[i] = new String(source.StatusList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TaskSource", this.TaskSource);
        this.setParamSimple(map, prefix + "PageIndex", this.PageIndex);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "FolderIds.", this.FolderIds);
        this.setParamArraySimple(map, prefix + "WorkflowIds.", this.WorkflowIds);
        this.setParamSimple(map, prefix + "JustMe", this.JustMe);
        this.setParamArraySimple(map, prefix + "TaskTypes.", this.TaskTypes);
        this.setParamArraySimple(map, prefix + "SubmitUsers.", this.SubmitUsers);
        this.setParamArraySimple(map, prefix + "StatusList.", this.StatusList);

    }
}


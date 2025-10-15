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

public class ListOpsWorkflowsRequest extends AbstractModel {

    /**
    * Project ID.

    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Page number
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Pagination size.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Folder ID
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * Workflow Status Filter

* ALL_RUNNING: All workflows are running (scheduled)

* ALL_FREEZED: All workflows are paused

* ALL_STOPPED: All workflows are offline

* PART_RUNNING: Some workflows are running (partially scheduled)

* ALL_NO_RUNNING: No workflows are running (unscheduled)

* ALL_INVALID: All workflows are invalid
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Owner ID
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * Workflow type filter criteria. supported values: Cycle or Manual. default: Cycle.
    */
    @SerializedName("WorkflowType")
    @Expose
    private String WorkflowType;

    /**
    * Workflow keyword-based filtering supports fuzzy matching of workflow Id/name.
    */
    @SerializedName("KeyWord")
    @Expose
    private String KeyWord;

    /**
    * Sort item. Options: CreateTime, TaskCount.
    */
    @SerializedName("SortItem")
    @Expose
    private String SortItem;

    /**
    * Sorting method, DESC or ASC, uppercase.
    */
    @SerializedName("SortType")
    @Expose
    private String SortType;

    /**
    * CreatorId. specifies the id of the creator.
    */
    @SerializedName("CreateUserUin")
    @Expose
    private String CreateUserUin;

    /**
    * Update time. format: yyyy-MM-dd HH:MM:ss.
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Creation time. format: yyyy-MM-dd HH:MM:ss.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

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
     * Get Page number 
     * @return PageNumber Page number
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Page number
     * @param PageNumber Page number
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Pagination size. 
     * @return PageSize Pagination size.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Pagination size.
     * @param PageSize Pagination size.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Folder ID 
     * @return FolderId Folder ID
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set Folder ID
     * @param FolderId Folder ID
     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }

    /**
     * Get Workflow Status Filter

* ALL_RUNNING: All workflows are running (scheduled)

* ALL_FREEZED: All workflows are paused

* ALL_STOPPED: All workflows are offline

* PART_RUNNING: Some workflows are running (partially scheduled)

* ALL_NO_RUNNING: No workflows are running (unscheduled)

* ALL_INVALID: All workflows are invalid 
     * @return Status Workflow Status Filter

* ALL_RUNNING: All workflows are running (scheduled)

* ALL_FREEZED: All workflows are paused

* ALL_STOPPED: All workflows are offline

* PART_RUNNING: Some workflows are running (partially scheduled)

* ALL_NO_RUNNING: No workflows are running (unscheduled)

* ALL_INVALID: All workflows are invalid
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Workflow Status Filter

* ALL_RUNNING: All workflows are running (scheduled)

* ALL_FREEZED: All workflows are paused

* ALL_STOPPED: All workflows are offline

* PART_RUNNING: Some workflows are running (partially scheduled)

* ALL_NO_RUNNING: No workflows are running (unscheduled)

* ALL_INVALID: All workflows are invalid
     * @param Status Workflow Status Filter

* ALL_RUNNING: All workflows are running (scheduled)

* ALL_FREEZED: All workflows are paused

* ALL_STOPPED: All workflows are offline

* PART_RUNNING: Some workflows are running (partially scheduled)

* ALL_NO_RUNNING: No workflows are running (unscheduled)

* ALL_INVALID: All workflows are invalid
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Owner ID 
     * @return OwnerUin Owner ID
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set Owner ID
     * @param OwnerUin Owner ID
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get Workflow type filter criteria. supported values: Cycle or Manual. default: Cycle. 
     * @return WorkflowType Workflow type filter criteria. supported values: Cycle or Manual. default: Cycle.
     */
    public String getWorkflowType() {
        return this.WorkflowType;
    }

    /**
     * Set Workflow type filter criteria. supported values: Cycle or Manual. default: Cycle.
     * @param WorkflowType Workflow type filter criteria. supported values: Cycle or Manual. default: Cycle.
     */
    public void setWorkflowType(String WorkflowType) {
        this.WorkflowType = WorkflowType;
    }

    /**
     * Get Workflow keyword-based filtering supports fuzzy matching of workflow Id/name. 
     * @return KeyWord Workflow keyword-based filtering supports fuzzy matching of workflow Id/name.
     */
    public String getKeyWord() {
        return this.KeyWord;
    }

    /**
     * Set Workflow keyword-based filtering supports fuzzy matching of workflow Id/name.
     * @param KeyWord Workflow keyword-based filtering supports fuzzy matching of workflow Id/name.
     */
    public void setKeyWord(String KeyWord) {
        this.KeyWord = KeyWord;
    }

    /**
     * Get Sort item. Options: CreateTime, TaskCount. 
     * @return SortItem Sort item. Options: CreateTime, TaskCount.
     */
    public String getSortItem() {
        return this.SortItem;
    }

    /**
     * Set Sort item. Options: CreateTime, TaskCount.
     * @param SortItem Sort item. Options: CreateTime, TaskCount.
     */
    public void setSortItem(String SortItem) {
        this.SortItem = SortItem;
    }

    /**
     * Get Sorting method, DESC or ASC, uppercase. 
     * @return SortType Sorting method, DESC or ASC, uppercase.
     */
    public String getSortType() {
        return this.SortType;
    }

    /**
     * Set Sorting method, DESC or ASC, uppercase.
     * @param SortType Sorting method, DESC or ASC, uppercase.
     */
    public void setSortType(String SortType) {
        this.SortType = SortType;
    }

    /**
     * Get CreatorId. specifies the id of the creator. 
     * @return CreateUserUin CreatorId. specifies the id of the creator.
     */
    public String getCreateUserUin() {
        return this.CreateUserUin;
    }

    /**
     * Set CreatorId. specifies the id of the creator.
     * @param CreateUserUin CreatorId. specifies the id of the creator.
     */
    public void setCreateUserUin(String CreateUserUin) {
        this.CreateUserUin = CreateUserUin;
    }

    /**
     * Get Update time. format: yyyy-MM-dd HH:MM:ss. 
     * @return ModifyTime Update time. format: yyyy-MM-dd HH:MM:ss.
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Update time. format: yyyy-MM-dd HH:MM:ss.
     * @param ModifyTime Update time. format: yyyy-MM-dd HH:MM:ss.
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get Creation time. format: yyyy-MM-dd HH:MM:ss. 
     * @return CreateTime Creation time. format: yyyy-MM-dd HH:MM:ss.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time. format: yyyy-MM-dd HH:MM:ss.
     * @param CreateTime Creation time. format: yyyy-MM-dd HH:MM:ss.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public ListOpsWorkflowsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListOpsWorkflowsRequest(ListOpsWorkflowsRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.WorkflowType != null) {
            this.WorkflowType = new String(source.WorkflowType);
        }
        if (source.KeyWord != null) {
            this.KeyWord = new String(source.KeyWord);
        }
        if (source.SortItem != null) {
            this.SortItem = new String(source.SortItem);
        }
        if (source.SortType != null) {
            this.SortType = new String(source.SortType);
        }
        if (source.CreateUserUin != null) {
            this.CreateUserUin = new String(source.CreateUserUin);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "WorkflowType", this.WorkflowType);
        this.setParamSimple(map, prefix + "KeyWord", this.KeyWord);
        this.setParamSimple(map, prefix + "SortItem", this.SortItem);
        this.setParamSimple(map, prefix + "SortType", this.SortType);
        this.setParamSimple(map, prefix + "CreateUserUin", this.CreateUserUin);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}


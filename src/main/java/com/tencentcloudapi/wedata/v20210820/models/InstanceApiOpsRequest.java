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

public class InstanceApiOpsRequest extends AbstractModel {

    /**
    * Single Query Condition
    */
    @SerializedName("Instance")
    @Expose
    private InstanceOpsDto Instance;

    /**
    * Sort fields, currently includes: Retry Count, Instance Data Time, Runtime Duration
    */
    @SerializedName("SortCol")
    @Expose
    private String SortCol;

    /**
    * Task ID list
    */
    @SerializedName("TaskIdList")
    @Expose
    private String [] TaskIdList;

    /**
    * Fuzzy search by taskName
    */
    @SerializedName("TaskNameList")
    @Expose
    private String [] TaskNameList;

    /**
    * Folder List
    */
    @SerializedName("FolderList")
    @Expose
    private String [] FolderList;

    /**
    * Ascending or Descending
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * Instance Status List
    */
    @SerializedName("StateList")
    @Expose
    private Long [] StateList;

    /**
    * Instance Type List
    */
    @SerializedName("TaskTypeList")
    @Expose
    private Long [] TaskTypeList;

    /**
    * Cycle Type
    */
    @SerializedName("CycleList")
    @Expose
    private String [] CycleList;

    /**
    * Person in Charge
    */
    @SerializedName("OwnerList")
    @Expose
    private String [] OwnerList;

    /**
    * Data Timestamp
    */
    @SerializedName("DateFrom")
    @Expose
    private String DateFrom;

    /**
    * Data Timestamp
    */
    @SerializedName("DateTo")
    @Expose
    private String DateTo;

    /**
    * Instance Storage Time
    */
    @SerializedName("CreateTimeFrom")
    @Expose
    private String CreateTimeFrom;

    /**
    * Instance Storage Time
    */
    @SerializedName("CreateTimeTo")
    @Expose
    private String CreateTimeTo;

    /**
    * Start Execution Time
    */
    @SerializedName("StartFrom")
    @Expose
    private String StartFrom;

    /**
    * Start Execution Time
    */
    @SerializedName("StartTo")
    @Expose
    private String StartTo;

    /**
    * Belongs to Workflow
    */
    @SerializedName("WorkflowIdList")
    @Expose
    private String [] WorkflowIdList;

    /**
    * Fuzzy search by workflowName
    */
    @SerializedName("WorkflowNameList")
    @Expose
    private String [] WorkflowNameList;

    /**
    * Keyword Fuzzy Search
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * searchColumns are the list of field names to search
    */
    @SerializedName("SearchColumns")
    @Expose
    private String [] SearchColumns;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Limit
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Task Type Mapping Relationship, storing Task Type ID and Task Type Description Information
    */
    @SerializedName("TaskTypeMap")
    @Expose
    private TaskTypeMap [] TaskTypeMap;

    /**
    * 0 Supplementary Entry Type 1 Periodic Instance 2 Non-periodic Instance
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Whether it is DAG
    */
    @SerializedName("DagDeal")
    @Expose
    private Boolean DagDeal;

    /**
    * 1 Parent instance 2 Child instance
    */
    @SerializedName("DagType")
    @Expose
    private String DagType;

    /**
    * 1 Self-Dependency 2 Task Dependency 3 All Dependencies
    */
    @SerializedName("DagDependent")
    @Expose
    private String DagDependent;

    /**
    * DAG Depth Default to 1, value range 1-6
    */
    @SerializedName("DagDepth")
    @Expose
    private Long DagDepth;

    /**
    * Tenant ID
    */
    @SerializedName("TenantId")
    @Expose
    private String TenantId;

    /**
    * Inquiry based on Current Data Time or Next Data Time, default to Current Data Time
    */
    @SerializedName("DataTimeCycle")
    @Expose
    private String DataTimeCycle;

    /**
    * Resource Group ID, multiple Resource Group IDs separated by English commas
    */
    @SerializedName("ExecutorGroupIdList")
    @Expose
    private String [] ExecutorGroupIdList;

    /**
     * Get Single Query Condition 
     * @return Instance Single Query Condition
     */
    public InstanceOpsDto getInstance() {
        return this.Instance;
    }

    /**
     * Set Single Query Condition
     * @param Instance Single Query Condition
     */
    public void setInstance(InstanceOpsDto Instance) {
        this.Instance = Instance;
    }

    /**
     * Get Sort fields, currently includes: Retry Count, Instance Data Time, Runtime Duration 
     * @return SortCol Sort fields, currently includes: Retry Count, Instance Data Time, Runtime Duration
     */
    public String getSortCol() {
        return this.SortCol;
    }

    /**
     * Set Sort fields, currently includes: Retry Count, Instance Data Time, Runtime Duration
     * @param SortCol Sort fields, currently includes: Retry Count, Instance Data Time, Runtime Duration
     */
    public void setSortCol(String SortCol) {
        this.SortCol = SortCol;
    }

    /**
     * Get Task ID list 
     * @return TaskIdList Task ID list
     */
    public String [] getTaskIdList() {
        return this.TaskIdList;
    }

    /**
     * Set Task ID list
     * @param TaskIdList Task ID list
     */
    public void setTaskIdList(String [] TaskIdList) {
        this.TaskIdList = TaskIdList;
    }

    /**
     * Get Fuzzy search by taskName 
     * @return TaskNameList Fuzzy search by taskName
     */
    public String [] getTaskNameList() {
        return this.TaskNameList;
    }

    /**
     * Set Fuzzy search by taskName
     * @param TaskNameList Fuzzy search by taskName
     */
    public void setTaskNameList(String [] TaskNameList) {
        this.TaskNameList = TaskNameList;
    }

    /**
     * Get Folder List 
     * @return FolderList Folder List
     */
    public String [] getFolderList() {
        return this.FolderList;
    }

    /**
     * Set Folder List
     * @param FolderList Folder List
     */
    public void setFolderList(String [] FolderList) {
        this.FolderList = FolderList;
    }

    /**
     * Get Ascending or Descending 
     * @return Sort Ascending or Descending
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set Ascending or Descending
     * @param Sort Ascending or Descending
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get Instance Status List 
     * @return StateList Instance Status List
     */
    public Long [] getStateList() {
        return this.StateList;
    }

    /**
     * Set Instance Status List
     * @param StateList Instance Status List
     */
    public void setStateList(Long [] StateList) {
        this.StateList = StateList;
    }

    /**
     * Get Instance Type List 
     * @return TaskTypeList Instance Type List
     */
    public Long [] getTaskTypeList() {
        return this.TaskTypeList;
    }

    /**
     * Set Instance Type List
     * @param TaskTypeList Instance Type List
     */
    public void setTaskTypeList(Long [] TaskTypeList) {
        this.TaskTypeList = TaskTypeList;
    }

    /**
     * Get Cycle Type 
     * @return CycleList Cycle Type
     */
    public String [] getCycleList() {
        return this.CycleList;
    }

    /**
     * Set Cycle Type
     * @param CycleList Cycle Type
     */
    public void setCycleList(String [] CycleList) {
        this.CycleList = CycleList;
    }

    /**
     * Get Person in Charge 
     * @return OwnerList Person in Charge
     */
    public String [] getOwnerList() {
        return this.OwnerList;
    }

    /**
     * Set Person in Charge
     * @param OwnerList Person in Charge
     */
    public void setOwnerList(String [] OwnerList) {
        this.OwnerList = OwnerList;
    }

    /**
     * Get Data Timestamp 
     * @return DateFrom Data Timestamp
     */
    public String getDateFrom() {
        return this.DateFrom;
    }

    /**
     * Set Data Timestamp
     * @param DateFrom Data Timestamp
     */
    public void setDateFrom(String DateFrom) {
        this.DateFrom = DateFrom;
    }

    /**
     * Get Data Timestamp 
     * @return DateTo Data Timestamp
     */
    public String getDateTo() {
        return this.DateTo;
    }

    /**
     * Set Data Timestamp
     * @param DateTo Data Timestamp
     */
    public void setDateTo(String DateTo) {
        this.DateTo = DateTo;
    }

    /**
     * Get Instance Storage Time 
     * @return CreateTimeFrom Instance Storage Time
     */
    public String getCreateTimeFrom() {
        return this.CreateTimeFrom;
    }

    /**
     * Set Instance Storage Time
     * @param CreateTimeFrom Instance Storage Time
     */
    public void setCreateTimeFrom(String CreateTimeFrom) {
        this.CreateTimeFrom = CreateTimeFrom;
    }

    /**
     * Get Instance Storage Time 
     * @return CreateTimeTo Instance Storage Time
     */
    public String getCreateTimeTo() {
        return this.CreateTimeTo;
    }

    /**
     * Set Instance Storage Time
     * @param CreateTimeTo Instance Storage Time
     */
    public void setCreateTimeTo(String CreateTimeTo) {
        this.CreateTimeTo = CreateTimeTo;
    }

    /**
     * Get Start Execution Time 
     * @return StartFrom Start Execution Time
     */
    public String getStartFrom() {
        return this.StartFrom;
    }

    /**
     * Set Start Execution Time
     * @param StartFrom Start Execution Time
     */
    public void setStartFrom(String StartFrom) {
        this.StartFrom = StartFrom;
    }

    /**
     * Get Start Execution Time 
     * @return StartTo Start Execution Time
     */
    public String getStartTo() {
        return this.StartTo;
    }

    /**
     * Set Start Execution Time
     * @param StartTo Start Execution Time
     */
    public void setStartTo(String StartTo) {
        this.StartTo = StartTo;
    }

    /**
     * Get Belongs to Workflow 
     * @return WorkflowIdList Belongs to Workflow
     */
    public String [] getWorkflowIdList() {
        return this.WorkflowIdList;
    }

    /**
     * Set Belongs to Workflow
     * @param WorkflowIdList Belongs to Workflow
     */
    public void setWorkflowIdList(String [] WorkflowIdList) {
        this.WorkflowIdList = WorkflowIdList;
    }

    /**
     * Get Fuzzy search by workflowName 
     * @return WorkflowNameList Fuzzy search by workflowName
     */
    public String [] getWorkflowNameList() {
        return this.WorkflowNameList;
    }

    /**
     * Set Fuzzy search by workflowName
     * @param WorkflowNameList Fuzzy search by workflowName
     */
    public void setWorkflowNameList(String [] WorkflowNameList) {
        this.WorkflowNameList = WorkflowNameList;
    }

    /**
     * Get Keyword Fuzzy Search 
     * @return Keyword Keyword Fuzzy Search
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set Keyword Fuzzy Search
     * @param Keyword Keyword Fuzzy Search
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get searchColumns are the list of field names to search 
     * @return SearchColumns searchColumns are the list of field names to search
     */
    public String [] getSearchColumns() {
        return this.SearchColumns;
    }

    /**
     * Set searchColumns are the list of field names to search
     * @param SearchColumns searchColumns are the list of field names to search
     */
    public void setSearchColumns(String [] SearchColumns) {
        this.SearchColumns = SearchColumns;
    }

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
     * Get Limit 
     * @return Limit Limit
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Limit
     * @param Limit Limit
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Task Type Mapping Relationship, storing Task Type ID and Task Type Description Information 
     * @return TaskTypeMap Task Type Mapping Relationship, storing Task Type ID and Task Type Description Information
     */
    public TaskTypeMap [] getTaskTypeMap() {
        return this.TaskTypeMap;
    }

    /**
     * Set Task Type Mapping Relationship, storing Task Type ID and Task Type Description Information
     * @param TaskTypeMap Task Type Mapping Relationship, storing Task Type ID and Task Type Description Information
     */
    public void setTaskTypeMap(TaskTypeMap [] TaskTypeMap) {
        this.TaskTypeMap = TaskTypeMap;
    }

    /**
     * Get 0 Supplementary Entry Type 1 Periodic Instance 2 Non-periodic Instance 
     * @return InstanceType 0 Supplementary Entry Type 1 Periodic Instance 2 Non-periodic Instance
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 0 Supplementary Entry Type 1 Periodic Instance 2 Non-periodic Instance
     * @param InstanceType 0 Supplementary Entry Type 1 Periodic Instance 2 Non-periodic Instance
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Whether it is DAG 
     * @return DagDeal Whether it is DAG
     */
    public Boolean getDagDeal() {
        return this.DagDeal;
    }

    /**
     * Set Whether it is DAG
     * @param DagDeal Whether it is DAG
     */
    public void setDagDeal(Boolean DagDeal) {
        this.DagDeal = DagDeal;
    }

    /**
     * Get 1 Parent instance 2 Child instance 
     * @return DagType 1 Parent instance 2 Child instance
     */
    public String getDagType() {
        return this.DagType;
    }

    /**
     * Set 1 Parent instance 2 Child instance
     * @param DagType 1 Parent instance 2 Child instance
     */
    public void setDagType(String DagType) {
        this.DagType = DagType;
    }

    /**
     * Get 1 Self-Dependency 2 Task Dependency 3 All Dependencies 
     * @return DagDependent 1 Self-Dependency 2 Task Dependency 3 All Dependencies
     */
    public String getDagDependent() {
        return this.DagDependent;
    }

    /**
     * Set 1 Self-Dependency 2 Task Dependency 3 All Dependencies
     * @param DagDependent 1 Self-Dependency 2 Task Dependency 3 All Dependencies
     */
    public void setDagDependent(String DagDependent) {
        this.DagDependent = DagDependent;
    }

    /**
     * Get DAG Depth Default to 1, value range 1-6 
     * @return DagDepth DAG Depth Default to 1, value range 1-6
     */
    public Long getDagDepth() {
        return this.DagDepth;
    }

    /**
     * Set DAG Depth Default to 1, value range 1-6
     * @param DagDepth DAG Depth Default to 1, value range 1-6
     */
    public void setDagDepth(Long DagDepth) {
        this.DagDepth = DagDepth;
    }

    /**
     * Get Tenant ID 
     * @return TenantId Tenant ID
     */
    public String getTenantId() {
        return this.TenantId;
    }

    /**
     * Set Tenant ID
     * @param TenantId Tenant ID
     */
    public void setTenantId(String TenantId) {
        this.TenantId = TenantId;
    }

    /**
     * Get Inquiry based on Current Data Time or Next Data Time, default to Current Data Time 
     * @return DataTimeCycle Inquiry based on Current Data Time or Next Data Time, default to Current Data Time
     */
    public String getDataTimeCycle() {
        return this.DataTimeCycle;
    }

    /**
     * Set Inquiry based on Current Data Time or Next Data Time, default to Current Data Time
     * @param DataTimeCycle Inquiry based on Current Data Time or Next Data Time, default to Current Data Time
     */
    public void setDataTimeCycle(String DataTimeCycle) {
        this.DataTimeCycle = DataTimeCycle;
    }

    /**
     * Get Resource Group ID, multiple Resource Group IDs separated by English commas 
     * @return ExecutorGroupIdList Resource Group ID, multiple Resource Group IDs separated by English commas
     */
    public String [] getExecutorGroupIdList() {
        return this.ExecutorGroupIdList;
    }

    /**
     * Set Resource Group ID, multiple Resource Group IDs separated by English commas
     * @param ExecutorGroupIdList Resource Group ID, multiple Resource Group IDs separated by English commas
     */
    public void setExecutorGroupIdList(String [] ExecutorGroupIdList) {
        this.ExecutorGroupIdList = ExecutorGroupIdList;
    }

    public InstanceApiOpsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceApiOpsRequest(InstanceApiOpsRequest source) {
        if (source.Instance != null) {
            this.Instance = new InstanceOpsDto(source.Instance);
        }
        if (source.SortCol != null) {
            this.SortCol = new String(source.SortCol);
        }
        if (source.TaskIdList != null) {
            this.TaskIdList = new String[source.TaskIdList.length];
            for (int i = 0; i < source.TaskIdList.length; i++) {
                this.TaskIdList[i] = new String(source.TaskIdList[i]);
            }
        }
        if (source.TaskNameList != null) {
            this.TaskNameList = new String[source.TaskNameList.length];
            for (int i = 0; i < source.TaskNameList.length; i++) {
                this.TaskNameList[i] = new String(source.TaskNameList[i]);
            }
        }
        if (source.FolderList != null) {
            this.FolderList = new String[source.FolderList.length];
            for (int i = 0; i < source.FolderList.length; i++) {
                this.FolderList[i] = new String(source.FolderList[i]);
            }
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
        if (source.StateList != null) {
            this.StateList = new Long[source.StateList.length];
            for (int i = 0; i < source.StateList.length; i++) {
                this.StateList[i] = new Long(source.StateList[i]);
            }
        }
        if (source.TaskTypeList != null) {
            this.TaskTypeList = new Long[source.TaskTypeList.length];
            for (int i = 0; i < source.TaskTypeList.length; i++) {
                this.TaskTypeList[i] = new Long(source.TaskTypeList[i]);
            }
        }
        if (source.CycleList != null) {
            this.CycleList = new String[source.CycleList.length];
            for (int i = 0; i < source.CycleList.length; i++) {
                this.CycleList[i] = new String(source.CycleList[i]);
            }
        }
        if (source.OwnerList != null) {
            this.OwnerList = new String[source.OwnerList.length];
            for (int i = 0; i < source.OwnerList.length; i++) {
                this.OwnerList[i] = new String(source.OwnerList[i]);
            }
        }
        if (source.DateFrom != null) {
            this.DateFrom = new String(source.DateFrom);
        }
        if (source.DateTo != null) {
            this.DateTo = new String(source.DateTo);
        }
        if (source.CreateTimeFrom != null) {
            this.CreateTimeFrom = new String(source.CreateTimeFrom);
        }
        if (source.CreateTimeTo != null) {
            this.CreateTimeTo = new String(source.CreateTimeTo);
        }
        if (source.StartFrom != null) {
            this.StartFrom = new String(source.StartFrom);
        }
        if (source.StartTo != null) {
            this.StartTo = new String(source.StartTo);
        }
        if (source.WorkflowIdList != null) {
            this.WorkflowIdList = new String[source.WorkflowIdList.length];
            for (int i = 0; i < source.WorkflowIdList.length; i++) {
                this.WorkflowIdList[i] = new String(source.WorkflowIdList[i]);
            }
        }
        if (source.WorkflowNameList != null) {
            this.WorkflowNameList = new String[source.WorkflowNameList.length];
            for (int i = 0; i < source.WorkflowNameList.length; i++) {
                this.WorkflowNameList[i] = new String(source.WorkflowNameList[i]);
            }
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.SearchColumns != null) {
            this.SearchColumns = new String[source.SearchColumns.length];
            for (int i = 0; i < source.SearchColumns.length; i++) {
                this.SearchColumns[i] = new String(source.SearchColumns[i]);
            }
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.TaskTypeMap != null) {
            this.TaskTypeMap = new TaskTypeMap[source.TaskTypeMap.length];
            for (int i = 0; i < source.TaskTypeMap.length; i++) {
                this.TaskTypeMap[i] = new TaskTypeMap(source.TaskTypeMap[i]);
            }
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.DagDeal != null) {
            this.DagDeal = new Boolean(source.DagDeal);
        }
        if (source.DagType != null) {
            this.DagType = new String(source.DagType);
        }
        if (source.DagDependent != null) {
            this.DagDependent = new String(source.DagDependent);
        }
        if (source.DagDepth != null) {
            this.DagDepth = new Long(source.DagDepth);
        }
        if (source.TenantId != null) {
            this.TenantId = new String(source.TenantId);
        }
        if (source.DataTimeCycle != null) {
            this.DataTimeCycle = new String(source.DataTimeCycle);
        }
        if (source.ExecutorGroupIdList != null) {
            this.ExecutorGroupIdList = new String[source.ExecutorGroupIdList.length];
            for (int i = 0; i < source.ExecutorGroupIdList.length; i++) {
                this.ExecutorGroupIdList[i] = new String(source.ExecutorGroupIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Instance.", this.Instance);
        this.setParamSimple(map, prefix + "SortCol", this.SortCol);
        this.setParamArraySimple(map, prefix + "TaskIdList.", this.TaskIdList);
        this.setParamArraySimple(map, prefix + "TaskNameList.", this.TaskNameList);
        this.setParamArraySimple(map, prefix + "FolderList.", this.FolderList);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamArraySimple(map, prefix + "StateList.", this.StateList);
        this.setParamArraySimple(map, prefix + "TaskTypeList.", this.TaskTypeList);
        this.setParamArraySimple(map, prefix + "CycleList.", this.CycleList);
        this.setParamArraySimple(map, prefix + "OwnerList.", this.OwnerList);
        this.setParamSimple(map, prefix + "DateFrom", this.DateFrom);
        this.setParamSimple(map, prefix + "DateTo", this.DateTo);
        this.setParamSimple(map, prefix + "CreateTimeFrom", this.CreateTimeFrom);
        this.setParamSimple(map, prefix + "CreateTimeTo", this.CreateTimeTo);
        this.setParamSimple(map, prefix + "StartFrom", this.StartFrom);
        this.setParamSimple(map, prefix + "StartTo", this.StartTo);
        this.setParamArraySimple(map, prefix + "WorkflowIdList.", this.WorkflowIdList);
        this.setParamArraySimple(map, prefix + "WorkflowNameList.", this.WorkflowNameList);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamArraySimple(map, prefix + "SearchColumns.", this.SearchColumns);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "TaskTypeMap.", this.TaskTypeMap);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "DagDeal", this.DagDeal);
        this.setParamSimple(map, prefix + "DagType", this.DagType);
        this.setParamSimple(map, prefix + "DagDependent", this.DagDependent);
        this.setParamSimple(map, prefix + "DagDepth", this.DagDepth);
        this.setParamSimple(map, prefix + "TenantId", this.TenantId);
        this.setParamSimple(map, prefix + "DataTimeCycle", this.DataTimeCycle);
        this.setParamArraySimple(map, prefix + "ExecutorGroupIdList.", this.ExecutorGroupIdList);

    }
}


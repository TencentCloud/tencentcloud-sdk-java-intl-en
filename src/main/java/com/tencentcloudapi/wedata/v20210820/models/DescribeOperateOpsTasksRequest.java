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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOperateOpsTasksRequest extends AbstractModel {

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Folder ID, multiple folders separated by commas
    */
    @SerializedName("FolderIdList")
    @Expose
    private String FolderIdList;

    /**
    * Workflow ID, multiple Workflow IDs separated by English commas
    */
    @SerializedName("WorkFlowIdList")
    @Expose
    private String WorkFlowIdList;

    /**
    * Workflow name, multiple Workflow names separated by English commas
    */
    @SerializedName("WorkFlowNameList")
    @Expose
    private String WorkFlowNameList;

    /**
    * Task Name, multiple Task Names separated by English commas
    */
    @SerializedName("TaskNameList")
    @Expose
    private String TaskNameList;

    /**
    * Task ID, multiple Task IDs separated by English commas
    */
    @SerializedName("TaskIdList")
    @Expose
    private String TaskIdList;

    /**
    * Page Number
    */
    @SerializedName("PageNumber")
    @Expose
    private String PageNumber;

    /**
    * Page size
    */
    @SerializedName("PageSize")
    @Expose
    private String PageSize;

    /**
    * Sort Fields, supported fields are FirstSubmitTime and FirstRunTime, indicating the most recent submission and the first execution event
    */
    @SerializedName("SortItem")
    @Expose
    private String SortItem;

    /**
    * Sort Type. Two values DESC,ASC
    */
    @SerializedName("SortType")
    @Expose
    private String SortType;

    /**
    * Person in Charge, multiple Persons in Charge separated by English commas
    */
    @SerializedName("InChargeList")
    @Expose
    private String InChargeList;

    /**
    * Task Type ID String, multiple Task Type IDs separated by English commas
    */
    @SerializedName("TaskTypeIdList")
    @Expose
    private String TaskTypeIdList;

    /**
    * Task Status String, multiple Task Statuses separated by English commas
    */
    @SerializedName("StatusList")
    @Expose
    private String StatusList;

    /**
    * Task Cycle Type String, multiple Task Cycles separated by English commas
    */
    @SerializedName("TaskCycleUnitList")
    @Expose
    private String TaskCycleUnitList;

    /**
    * Task Belonging Product Type
    */
    @SerializedName("ProductNameList")
    @Expose
    private String ProductNameList;

    /**
    * Data Source ID or (only for offline sync tasks) Source Data Source ID
    */
    @SerializedName("SourceServiceId")
    @Expose
    private String SourceServiceId;

    /**
    * Data Source Type or (only for offline sync tasks) Source Data Source Type
    */
    @SerializedName("SourceServiceType")
    @Expose
    private String SourceServiceType;

    /**
    * (Only for offline sync tasks) Target Data Source ID
    */
    @SerializedName("TargetServiceId")
    @Expose
    private String TargetServiceId;

    /**
    * (Only for offline sync tasks) Target Data Source Type
    */
    @SerializedName("TargetServiceType")
    @Expose
    private String TargetServiceType;

    /**
    * Alarm Type, multiple types separated by commas
    */
    @SerializedName("AlarmType")
    @Expose
    private String AlarmType;

    /**
    * Resource Group ID, multiple Resource Group IDs separated by English commas
    */
    @SerializedName("ExecutorGroupIdList")
    @Expose
    private String ExecutorGroupIdList;

    /**
    * Task tag
    */
    @SerializedName("TaskTags")
    @Expose
    private TaskTag [] TaskTags;

    /**
    * Query Keyword
    */
    @SerializedName("KeyWord")
    @Expose
    private String KeyWord;

    /**
    * Instance Generation Method
    */
    @SerializedName("InitStrategy")
    @Expose
    private String InitStrategy;

    /**
    * Additional Requested Resource Types
    */
    @SerializedName("RequestResourceTypes")
    @Expose
    private String [] RequestResourceTypes;

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
     * Get Folder ID, multiple folders separated by commas 
     * @return FolderIdList Folder ID, multiple folders separated by commas
     */
    public String getFolderIdList() {
        return this.FolderIdList;
    }

    /**
     * Set Folder ID, multiple folders separated by commas
     * @param FolderIdList Folder ID, multiple folders separated by commas
     */
    public void setFolderIdList(String FolderIdList) {
        this.FolderIdList = FolderIdList;
    }

    /**
     * Get Workflow ID, multiple Workflow IDs separated by English commas 
     * @return WorkFlowIdList Workflow ID, multiple Workflow IDs separated by English commas
     */
    public String getWorkFlowIdList() {
        return this.WorkFlowIdList;
    }

    /**
     * Set Workflow ID, multiple Workflow IDs separated by English commas
     * @param WorkFlowIdList Workflow ID, multiple Workflow IDs separated by English commas
     */
    public void setWorkFlowIdList(String WorkFlowIdList) {
        this.WorkFlowIdList = WorkFlowIdList;
    }

    /**
     * Get Workflow name, multiple Workflow names separated by English commas 
     * @return WorkFlowNameList Workflow name, multiple Workflow names separated by English commas
     */
    public String getWorkFlowNameList() {
        return this.WorkFlowNameList;
    }

    /**
     * Set Workflow name, multiple Workflow names separated by English commas
     * @param WorkFlowNameList Workflow name, multiple Workflow names separated by English commas
     */
    public void setWorkFlowNameList(String WorkFlowNameList) {
        this.WorkFlowNameList = WorkFlowNameList;
    }

    /**
     * Get Task Name, multiple Task Names separated by English commas 
     * @return TaskNameList Task Name, multiple Task Names separated by English commas
     */
    public String getTaskNameList() {
        return this.TaskNameList;
    }

    /**
     * Set Task Name, multiple Task Names separated by English commas
     * @param TaskNameList Task Name, multiple Task Names separated by English commas
     */
    public void setTaskNameList(String TaskNameList) {
        this.TaskNameList = TaskNameList;
    }

    /**
     * Get Task ID, multiple Task IDs separated by English commas 
     * @return TaskIdList Task ID, multiple Task IDs separated by English commas
     */
    public String getTaskIdList() {
        return this.TaskIdList;
    }

    /**
     * Set Task ID, multiple Task IDs separated by English commas
     * @param TaskIdList Task ID, multiple Task IDs separated by English commas
     */
    public void setTaskIdList(String TaskIdList) {
        this.TaskIdList = TaskIdList;
    }

    /**
     * Get Page Number 
     * @return PageNumber Page Number
     */
    public String getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Page Number
     * @param PageNumber Page Number
     */
    public void setPageNumber(String PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Page size 
     * @return PageSize Page size
     */
    public String getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Page size
     * @param PageSize Page size
     */
    public void setPageSize(String PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Sort Fields, supported fields are FirstSubmitTime and FirstRunTime, indicating the most recent submission and the first execution event 
     * @return SortItem Sort Fields, supported fields are FirstSubmitTime and FirstRunTime, indicating the most recent submission and the first execution event
     */
    public String getSortItem() {
        return this.SortItem;
    }

    /**
     * Set Sort Fields, supported fields are FirstSubmitTime and FirstRunTime, indicating the most recent submission and the first execution event
     * @param SortItem Sort Fields, supported fields are FirstSubmitTime and FirstRunTime, indicating the most recent submission and the first execution event
     */
    public void setSortItem(String SortItem) {
        this.SortItem = SortItem;
    }

    /**
     * Get Sort Type. Two values DESC,ASC 
     * @return SortType Sort Type. Two values DESC,ASC
     */
    public String getSortType() {
        return this.SortType;
    }

    /**
     * Set Sort Type. Two values DESC,ASC
     * @param SortType Sort Type. Two values DESC,ASC
     */
    public void setSortType(String SortType) {
        this.SortType = SortType;
    }

    /**
     * Get Person in Charge, multiple Persons in Charge separated by English commas 
     * @return InChargeList Person in Charge, multiple Persons in Charge separated by English commas
     */
    public String getInChargeList() {
        return this.InChargeList;
    }

    /**
     * Set Person in Charge, multiple Persons in Charge separated by English commas
     * @param InChargeList Person in Charge, multiple Persons in Charge separated by English commas
     */
    public void setInChargeList(String InChargeList) {
        this.InChargeList = InChargeList;
    }

    /**
     * Get Task Type ID String, multiple Task Type IDs separated by English commas 
     * @return TaskTypeIdList Task Type ID String, multiple Task Type IDs separated by English commas
     */
    public String getTaskTypeIdList() {
        return this.TaskTypeIdList;
    }

    /**
     * Set Task Type ID String, multiple Task Type IDs separated by English commas
     * @param TaskTypeIdList Task Type ID String, multiple Task Type IDs separated by English commas
     */
    public void setTaskTypeIdList(String TaskTypeIdList) {
        this.TaskTypeIdList = TaskTypeIdList;
    }

    /**
     * Get Task Status String, multiple Task Statuses separated by English commas 
     * @return StatusList Task Status String, multiple Task Statuses separated by English commas
     */
    public String getStatusList() {
        return this.StatusList;
    }

    /**
     * Set Task Status String, multiple Task Statuses separated by English commas
     * @param StatusList Task Status String, multiple Task Statuses separated by English commas
     */
    public void setStatusList(String StatusList) {
        this.StatusList = StatusList;
    }

    /**
     * Get Task Cycle Type String, multiple Task Cycles separated by English commas 
     * @return TaskCycleUnitList Task Cycle Type String, multiple Task Cycles separated by English commas
     */
    public String getTaskCycleUnitList() {
        return this.TaskCycleUnitList;
    }

    /**
     * Set Task Cycle Type String, multiple Task Cycles separated by English commas
     * @param TaskCycleUnitList Task Cycle Type String, multiple Task Cycles separated by English commas
     */
    public void setTaskCycleUnitList(String TaskCycleUnitList) {
        this.TaskCycleUnitList = TaskCycleUnitList;
    }

    /**
     * Get Task Belonging Product Type 
     * @return ProductNameList Task Belonging Product Type
     */
    public String getProductNameList() {
        return this.ProductNameList;
    }

    /**
     * Set Task Belonging Product Type
     * @param ProductNameList Task Belonging Product Type
     */
    public void setProductNameList(String ProductNameList) {
        this.ProductNameList = ProductNameList;
    }

    /**
     * Get Data Source ID or (only for offline sync tasks) Source Data Source ID 
     * @return SourceServiceId Data Source ID or (only for offline sync tasks) Source Data Source ID
     */
    public String getSourceServiceId() {
        return this.SourceServiceId;
    }

    /**
     * Set Data Source ID or (only for offline sync tasks) Source Data Source ID
     * @param SourceServiceId Data Source ID or (only for offline sync tasks) Source Data Source ID
     */
    public void setSourceServiceId(String SourceServiceId) {
        this.SourceServiceId = SourceServiceId;
    }

    /**
     * Get Data Source Type or (only for offline sync tasks) Source Data Source Type 
     * @return SourceServiceType Data Source Type or (only for offline sync tasks) Source Data Source Type
     */
    public String getSourceServiceType() {
        return this.SourceServiceType;
    }

    /**
     * Set Data Source Type or (only for offline sync tasks) Source Data Source Type
     * @param SourceServiceType Data Source Type or (only for offline sync tasks) Source Data Source Type
     */
    public void setSourceServiceType(String SourceServiceType) {
        this.SourceServiceType = SourceServiceType;
    }

    /**
     * Get (Only for offline sync tasks) Target Data Source ID 
     * @return TargetServiceId (Only for offline sync tasks) Target Data Source ID
     */
    public String getTargetServiceId() {
        return this.TargetServiceId;
    }

    /**
     * Set (Only for offline sync tasks) Target Data Source ID
     * @param TargetServiceId (Only for offline sync tasks) Target Data Source ID
     */
    public void setTargetServiceId(String TargetServiceId) {
        this.TargetServiceId = TargetServiceId;
    }

    /**
     * Get (Only for offline sync tasks) Target Data Source Type 
     * @return TargetServiceType (Only for offline sync tasks) Target Data Source Type
     */
    public String getTargetServiceType() {
        return this.TargetServiceType;
    }

    /**
     * Set (Only for offline sync tasks) Target Data Source Type
     * @param TargetServiceType (Only for offline sync tasks) Target Data Source Type
     */
    public void setTargetServiceType(String TargetServiceType) {
        this.TargetServiceType = TargetServiceType;
    }

    /**
     * Get Alarm Type, multiple types separated by commas 
     * @return AlarmType Alarm Type, multiple types separated by commas
     */
    public String getAlarmType() {
        return this.AlarmType;
    }

    /**
     * Set Alarm Type, multiple types separated by commas
     * @param AlarmType Alarm Type, multiple types separated by commas
     */
    public void setAlarmType(String AlarmType) {
        this.AlarmType = AlarmType;
    }

    /**
     * Get Resource Group ID, multiple Resource Group IDs separated by English commas 
     * @return ExecutorGroupIdList Resource Group ID, multiple Resource Group IDs separated by English commas
     */
    public String getExecutorGroupIdList() {
        return this.ExecutorGroupIdList;
    }

    /**
     * Set Resource Group ID, multiple Resource Group IDs separated by English commas
     * @param ExecutorGroupIdList Resource Group ID, multiple Resource Group IDs separated by English commas
     */
    public void setExecutorGroupIdList(String ExecutorGroupIdList) {
        this.ExecutorGroupIdList = ExecutorGroupIdList;
    }

    /**
     * Get Task tag 
     * @return TaskTags Task tag
     */
    public TaskTag [] getTaskTags() {
        return this.TaskTags;
    }

    /**
     * Set Task tag
     * @param TaskTags Task tag
     */
    public void setTaskTags(TaskTag [] TaskTags) {
        this.TaskTags = TaskTags;
    }

    /**
     * Get Query Keyword 
     * @return KeyWord Query Keyword
     */
    public String getKeyWord() {
        return this.KeyWord;
    }

    /**
     * Set Query Keyword
     * @param KeyWord Query Keyword
     */
    public void setKeyWord(String KeyWord) {
        this.KeyWord = KeyWord;
    }

    /**
     * Get Instance Generation Method 
     * @return InitStrategy Instance Generation Method
     */
    public String getInitStrategy() {
        return this.InitStrategy;
    }

    /**
     * Set Instance Generation Method
     * @param InitStrategy Instance Generation Method
     */
    public void setInitStrategy(String InitStrategy) {
        this.InitStrategy = InitStrategy;
    }

    /**
     * Get Additional Requested Resource Types 
     * @return RequestResourceTypes Additional Requested Resource Types
     */
    public String [] getRequestResourceTypes() {
        return this.RequestResourceTypes;
    }

    /**
     * Set Additional Requested Resource Types
     * @param RequestResourceTypes Additional Requested Resource Types
     */
    public void setRequestResourceTypes(String [] RequestResourceTypes) {
        this.RequestResourceTypes = RequestResourceTypes;
    }

    public DescribeOperateOpsTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOperateOpsTasksRequest(DescribeOperateOpsTasksRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.FolderIdList != null) {
            this.FolderIdList = new String(source.FolderIdList);
        }
        if (source.WorkFlowIdList != null) {
            this.WorkFlowIdList = new String(source.WorkFlowIdList);
        }
        if (source.WorkFlowNameList != null) {
            this.WorkFlowNameList = new String(source.WorkFlowNameList);
        }
        if (source.TaskNameList != null) {
            this.TaskNameList = new String(source.TaskNameList);
        }
        if (source.TaskIdList != null) {
            this.TaskIdList = new String(source.TaskIdList);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new String(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new String(source.PageSize);
        }
        if (source.SortItem != null) {
            this.SortItem = new String(source.SortItem);
        }
        if (source.SortType != null) {
            this.SortType = new String(source.SortType);
        }
        if (source.InChargeList != null) {
            this.InChargeList = new String(source.InChargeList);
        }
        if (source.TaskTypeIdList != null) {
            this.TaskTypeIdList = new String(source.TaskTypeIdList);
        }
        if (source.StatusList != null) {
            this.StatusList = new String(source.StatusList);
        }
        if (source.TaskCycleUnitList != null) {
            this.TaskCycleUnitList = new String(source.TaskCycleUnitList);
        }
        if (source.ProductNameList != null) {
            this.ProductNameList = new String(source.ProductNameList);
        }
        if (source.SourceServiceId != null) {
            this.SourceServiceId = new String(source.SourceServiceId);
        }
        if (source.SourceServiceType != null) {
            this.SourceServiceType = new String(source.SourceServiceType);
        }
        if (source.TargetServiceId != null) {
            this.TargetServiceId = new String(source.TargetServiceId);
        }
        if (source.TargetServiceType != null) {
            this.TargetServiceType = new String(source.TargetServiceType);
        }
        if (source.AlarmType != null) {
            this.AlarmType = new String(source.AlarmType);
        }
        if (source.ExecutorGroupIdList != null) {
            this.ExecutorGroupIdList = new String(source.ExecutorGroupIdList);
        }
        if (source.TaskTags != null) {
            this.TaskTags = new TaskTag[source.TaskTags.length];
            for (int i = 0; i < source.TaskTags.length; i++) {
                this.TaskTags[i] = new TaskTag(source.TaskTags[i]);
            }
        }
        if (source.KeyWord != null) {
            this.KeyWord = new String(source.KeyWord);
        }
        if (source.InitStrategy != null) {
            this.InitStrategy = new String(source.InitStrategy);
        }
        if (source.RequestResourceTypes != null) {
            this.RequestResourceTypes = new String[source.RequestResourceTypes.length];
            for (int i = 0; i < source.RequestResourceTypes.length; i++) {
                this.RequestResourceTypes[i] = new String(source.RequestResourceTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "FolderIdList", this.FolderIdList);
        this.setParamSimple(map, prefix + "WorkFlowIdList", this.WorkFlowIdList);
        this.setParamSimple(map, prefix + "WorkFlowNameList", this.WorkFlowNameList);
        this.setParamSimple(map, prefix + "TaskNameList", this.TaskNameList);
        this.setParamSimple(map, prefix + "TaskIdList", this.TaskIdList);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "SortItem", this.SortItem);
        this.setParamSimple(map, prefix + "SortType", this.SortType);
        this.setParamSimple(map, prefix + "InChargeList", this.InChargeList);
        this.setParamSimple(map, prefix + "TaskTypeIdList", this.TaskTypeIdList);
        this.setParamSimple(map, prefix + "StatusList", this.StatusList);
        this.setParamSimple(map, prefix + "TaskCycleUnitList", this.TaskCycleUnitList);
        this.setParamSimple(map, prefix + "ProductNameList", this.ProductNameList);
        this.setParamSimple(map, prefix + "SourceServiceId", this.SourceServiceId);
        this.setParamSimple(map, prefix + "SourceServiceType", this.SourceServiceType);
        this.setParamSimple(map, prefix + "TargetServiceId", this.TargetServiceId);
        this.setParamSimple(map, prefix + "TargetServiceType", this.TargetServiceType);
        this.setParamSimple(map, prefix + "AlarmType", this.AlarmType);
        this.setParamSimple(map, prefix + "ExecutorGroupIdList", this.ExecutorGroupIdList);
        this.setParamArrayObj(map, prefix + "TaskTags.", this.TaskTags);
        this.setParamSimple(map, prefix + "KeyWord", this.KeyWord);
        this.setParamSimple(map, prefix + "InitStrategy", this.InitStrategy);
        this.setParamArraySimple(map, prefix + "RequestResourceTypes.", this.RequestResourceTypes);

    }
}


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

public class DescribeBatchOperateTaskRequest extends AbstractModel {

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Page Number
    */
    @SerializedName("Page")
    @Expose
    private String Page;

    /**
    * Page Number
    */
    @SerializedName("Size")
    @Expose
    private String Size;

    /**
    * Status ListDraft: 'NS','N','P','R'
Running: 'Y'
Stopped: 'F'
Frozen: 'O'
Stopping: 'T'
    */
    @SerializedName("StatusList")
    @Expose
    private String [] StatusList;

    /**
    * List of Responsible Persons
    */
    @SerializedName("OwnerNameList")
    @Expose
    private String [] OwnerNameList;

    /**
    * Workflow List
    */
    @SerializedName("WorkflowIdList")
    @Expose
    private String [] WorkflowIdList;

    /**
    * Task Name Search
    */
    @SerializedName("TaskNameFilter")
    @Expose
    private String TaskNameFilter;

    /**
    * Task Type List
    */
    @SerializedName("TaskTypeList")
    @Expose
    private String [] TaskTypeList;

    /**
    * Folder List
    */
    @SerializedName("FordIdList")
    @Expose
    private String [] FordIdList;

    /**
    * Task ID Search
    */
    @SerializedName("TaskIdFilter")
    @Expose
    private String TaskIdFilter;

    /**
    * Responsible Person Search
    */
    @SerializedName("OwnerNameFilter")
    @Expose
    private String OwnerNameFilter;

    /**
    * Sort Fields:
UpdateTime
CreateTime
    */
    @SerializedName("SortItem")
    @Expose
    private String SortItem;

    /**
    * asc: Ascending
desc: Descending
    */
    @SerializedName("SortType")
    @Expose
    private String SortType;

    /**
    * Engine Type List: Three Types
SparkJob
SparkSql
presto
    */
    @SerializedName("DataEngineList")
    @Expose
    private String [] DataEngineList;

    /**
    * Operator Name
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 1
    */
    @SerializedName("OwnerId")
    @Expose
    private String OwnerId;

    /**
    * 1
    */
    @SerializedName("TenantId")
    @Expose
    private String TenantId;

    /**
    * Data Source ID List
    */
    @SerializedName("DatasourceIdList")
    @Expose
    private String [] DatasourceIdList;

    /**
    * Data Source Type List
    */
    @SerializedName("DatasourceTypeList")
    @Expose
    private String [] DatasourceTypeList;

    /**
    * Scheduling Unit Type List
    */
    @SerializedName("CycleUnitList")
    @Expose
    private String [] CycleUnitList;

    /**
    * Filter out tasks that can be submitted?
    */
    @SerializedName("CanSubmit")
    @Expose
    private Boolean CanSubmit;

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
     * Get Page Number 
     * @return Page Page Number
     */
    public String getPage() {
        return this.Page;
    }

    /**
     * Set Page Number
     * @param Page Page Number
     */
    public void setPage(String Page) {
        this.Page = Page;
    }

    /**
     * Get Page Number 
     * @return Size Page Number
     */
    public String getSize() {
        return this.Size;
    }

    /**
     * Set Page Number
     * @param Size Page Number
     */
    public void setSize(String Size) {
        this.Size = Size;
    }

    /**
     * Get Status ListDraft: 'NS','N','P','R'
Running: 'Y'
Stopped: 'F'
Frozen: 'O'
Stopping: 'T' 
     * @return StatusList Status ListDraft: 'NS','N','P','R'
Running: 'Y'
Stopped: 'F'
Frozen: 'O'
Stopping: 'T'
     */
    public String [] getStatusList() {
        return this.StatusList;
    }

    /**
     * Set Status ListDraft: 'NS','N','P','R'
Running: 'Y'
Stopped: 'F'
Frozen: 'O'
Stopping: 'T'
     * @param StatusList Status ListDraft: 'NS','N','P','R'
Running: 'Y'
Stopped: 'F'
Frozen: 'O'
Stopping: 'T'
     */
    public void setStatusList(String [] StatusList) {
        this.StatusList = StatusList;
    }

    /**
     * Get List of Responsible Persons 
     * @return OwnerNameList List of Responsible Persons
     */
    public String [] getOwnerNameList() {
        return this.OwnerNameList;
    }

    /**
     * Set List of Responsible Persons
     * @param OwnerNameList List of Responsible Persons
     */
    public void setOwnerNameList(String [] OwnerNameList) {
        this.OwnerNameList = OwnerNameList;
    }

    /**
     * Get Workflow List 
     * @return WorkflowIdList Workflow List
     */
    public String [] getWorkflowIdList() {
        return this.WorkflowIdList;
    }

    /**
     * Set Workflow List
     * @param WorkflowIdList Workflow List
     */
    public void setWorkflowIdList(String [] WorkflowIdList) {
        this.WorkflowIdList = WorkflowIdList;
    }

    /**
     * Get Task Name Search 
     * @return TaskNameFilter Task Name Search
     */
    public String getTaskNameFilter() {
        return this.TaskNameFilter;
    }

    /**
     * Set Task Name Search
     * @param TaskNameFilter Task Name Search
     */
    public void setTaskNameFilter(String TaskNameFilter) {
        this.TaskNameFilter = TaskNameFilter;
    }

    /**
     * Get Task Type List 
     * @return TaskTypeList Task Type List
     */
    public String [] getTaskTypeList() {
        return this.TaskTypeList;
    }

    /**
     * Set Task Type List
     * @param TaskTypeList Task Type List
     */
    public void setTaskTypeList(String [] TaskTypeList) {
        this.TaskTypeList = TaskTypeList;
    }

    /**
     * Get Folder List 
     * @return FordIdList Folder List
     */
    public String [] getFordIdList() {
        return this.FordIdList;
    }

    /**
     * Set Folder List
     * @param FordIdList Folder List
     */
    public void setFordIdList(String [] FordIdList) {
        this.FordIdList = FordIdList;
    }

    /**
     * Get Task ID Search 
     * @return TaskIdFilter Task ID Search
     */
    public String getTaskIdFilter() {
        return this.TaskIdFilter;
    }

    /**
     * Set Task ID Search
     * @param TaskIdFilter Task ID Search
     */
    public void setTaskIdFilter(String TaskIdFilter) {
        this.TaskIdFilter = TaskIdFilter;
    }

    /**
     * Get Responsible Person Search 
     * @return OwnerNameFilter Responsible Person Search
     */
    public String getOwnerNameFilter() {
        return this.OwnerNameFilter;
    }

    /**
     * Set Responsible Person Search
     * @param OwnerNameFilter Responsible Person Search
     */
    public void setOwnerNameFilter(String OwnerNameFilter) {
        this.OwnerNameFilter = OwnerNameFilter;
    }

    /**
     * Get Sort Fields:
UpdateTime
CreateTime 
     * @return SortItem Sort Fields:
UpdateTime
CreateTime
     */
    public String getSortItem() {
        return this.SortItem;
    }

    /**
     * Set Sort Fields:
UpdateTime
CreateTime
     * @param SortItem Sort Fields:
UpdateTime
CreateTime
     */
    public void setSortItem(String SortItem) {
        this.SortItem = SortItem;
    }

    /**
     * Get asc: Ascending
desc: Descending 
     * @return SortType asc: Ascending
desc: Descending
     */
    public String getSortType() {
        return this.SortType;
    }

    /**
     * Set asc: Ascending
desc: Descending
     * @param SortType asc: Ascending
desc: Descending
     */
    public void setSortType(String SortType) {
        this.SortType = SortType;
    }

    /**
     * Get Engine Type List: Three Types
SparkJob
SparkSql
presto 
     * @return DataEngineList Engine Type List: Three Types
SparkJob
SparkSql
presto
     */
    public String [] getDataEngineList() {
        return this.DataEngineList;
    }

    /**
     * Set Engine Type List: Three Types
SparkJob
SparkSql
presto
     * @param DataEngineList Engine Type List: Three Types
SparkJob
SparkSql
presto
     */
    public void setDataEngineList(String [] DataEngineList) {
        this.DataEngineList = DataEngineList;
    }

    /**
     * Get Operator Name 
     * @return UserId Operator Name
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set Operator Name
     * @param UserId Operator Name
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 1 
     * @return OwnerId 1
     */
    public String getOwnerId() {
        return this.OwnerId;
    }

    /**
     * Set 1
     * @param OwnerId 1
     */
    public void setOwnerId(String OwnerId) {
        this.OwnerId = OwnerId;
    }

    /**
     * Get 1 
     * @return TenantId 1
     */
    public String getTenantId() {
        return this.TenantId;
    }

    /**
     * Set 1
     * @param TenantId 1
     */
    public void setTenantId(String TenantId) {
        this.TenantId = TenantId;
    }

    /**
     * Get Data Source ID List 
     * @return DatasourceIdList Data Source ID List
     */
    public String [] getDatasourceIdList() {
        return this.DatasourceIdList;
    }

    /**
     * Set Data Source ID List
     * @param DatasourceIdList Data Source ID List
     */
    public void setDatasourceIdList(String [] DatasourceIdList) {
        this.DatasourceIdList = DatasourceIdList;
    }

    /**
     * Get Data Source Type List 
     * @return DatasourceTypeList Data Source Type List
     */
    public String [] getDatasourceTypeList() {
        return this.DatasourceTypeList;
    }

    /**
     * Set Data Source Type List
     * @param DatasourceTypeList Data Source Type List
     */
    public void setDatasourceTypeList(String [] DatasourceTypeList) {
        this.DatasourceTypeList = DatasourceTypeList;
    }

    /**
     * Get Scheduling Unit Type List 
     * @return CycleUnitList Scheduling Unit Type List
     */
    public String [] getCycleUnitList() {
        return this.CycleUnitList;
    }

    /**
     * Set Scheduling Unit Type List
     * @param CycleUnitList Scheduling Unit Type List
     */
    public void setCycleUnitList(String [] CycleUnitList) {
        this.CycleUnitList = CycleUnitList;
    }

    /**
     * Get Filter out tasks that can be submitted? 
     * @return CanSubmit Filter out tasks that can be submitted?
     */
    public Boolean getCanSubmit() {
        return this.CanSubmit;
    }

    /**
     * Set Filter out tasks that can be submitted?
     * @param CanSubmit Filter out tasks that can be submitted?
     */
    public void setCanSubmit(Boolean CanSubmit) {
        this.CanSubmit = CanSubmit;
    }

    public DescribeBatchOperateTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBatchOperateTaskRequest(DescribeBatchOperateTaskRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Page != null) {
            this.Page = new String(source.Page);
        }
        if (source.Size != null) {
            this.Size = new String(source.Size);
        }
        if (source.StatusList != null) {
            this.StatusList = new String[source.StatusList.length];
            for (int i = 0; i < source.StatusList.length; i++) {
                this.StatusList[i] = new String(source.StatusList[i]);
            }
        }
        if (source.OwnerNameList != null) {
            this.OwnerNameList = new String[source.OwnerNameList.length];
            for (int i = 0; i < source.OwnerNameList.length; i++) {
                this.OwnerNameList[i] = new String(source.OwnerNameList[i]);
            }
        }
        if (source.WorkflowIdList != null) {
            this.WorkflowIdList = new String[source.WorkflowIdList.length];
            for (int i = 0; i < source.WorkflowIdList.length; i++) {
                this.WorkflowIdList[i] = new String(source.WorkflowIdList[i]);
            }
        }
        if (source.TaskNameFilter != null) {
            this.TaskNameFilter = new String(source.TaskNameFilter);
        }
        if (source.TaskTypeList != null) {
            this.TaskTypeList = new String[source.TaskTypeList.length];
            for (int i = 0; i < source.TaskTypeList.length; i++) {
                this.TaskTypeList[i] = new String(source.TaskTypeList[i]);
            }
        }
        if (source.FordIdList != null) {
            this.FordIdList = new String[source.FordIdList.length];
            for (int i = 0; i < source.FordIdList.length; i++) {
                this.FordIdList[i] = new String(source.FordIdList[i]);
            }
        }
        if (source.TaskIdFilter != null) {
            this.TaskIdFilter = new String(source.TaskIdFilter);
        }
        if (source.OwnerNameFilter != null) {
            this.OwnerNameFilter = new String(source.OwnerNameFilter);
        }
        if (source.SortItem != null) {
            this.SortItem = new String(source.SortItem);
        }
        if (source.SortType != null) {
            this.SortType = new String(source.SortType);
        }
        if (source.DataEngineList != null) {
            this.DataEngineList = new String[source.DataEngineList.length];
            for (int i = 0; i < source.DataEngineList.length; i++) {
                this.DataEngineList[i] = new String(source.DataEngineList[i]);
            }
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.OwnerId != null) {
            this.OwnerId = new String(source.OwnerId);
        }
        if (source.TenantId != null) {
            this.TenantId = new String(source.TenantId);
        }
        if (source.DatasourceIdList != null) {
            this.DatasourceIdList = new String[source.DatasourceIdList.length];
            for (int i = 0; i < source.DatasourceIdList.length; i++) {
                this.DatasourceIdList[i] = new String(source.DatasourceIdList[i]);
            }
        }
        if (source.DatasourceTypeList != null) {
            this.DatasourceTypeList = new String[source.DatasourceTypeList.length];
            for (int i = 0; i < source.DatasourceTypeList.length; i++) {
                this.DatasourceTypeList[i] = new String(source.DatasourceTypeList[i]);
            }
        }
        if (source.CycleUnitList != null) {
            this.CycleUnitList = new String[source.CycleUnitList.length];
            for (int i = 0; i < source.CycleUnitList.length; i++) {
                this.CycleUnitList[i] = new String(source.CycleUnitList[i]);
            }
        }
        if (source.CanSubmit != null) {
            this.CanSubmit = new Boolean(source.CanSubmit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamArraySimple(map, prefix + "StatusList.", this.StatusList);
        this.setParamArraySimple(map, prefix + "OwnerNameList.", this.OwnerNameList);
        this.setParamArraySimple(map, prefix + "WorkflowIdList.", this.WorkflowIdList);
        this.setParamSimple(map, prefix + "TaskNameFilter", this.TaskNameFilter);
        this.setParamArraySimple(map, prefix + "TaskTypeList.", this.TaskTypeList);
        this.setParamArraySimple(map, prefix + "FordIdList.", this.FordIdList);
        this.setParamSimple(map, prefix + "TaskIdFilter", this.TaskIdFilter);
        this.setParamSimple(map, prefix + "OwnerNameFilter", this.OwnerNameFilter);
        this.setParamSimple(map, prefix + "SortItem", this.SortItem);
        this.setParamSimple(map, prefix + "SortType", this.SortType);
        this.setParamArraySimple(map, prefix + "DataEngineList.", this.DataEngineList);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "OwnerId", this.OwnerId);
        this.setParamSimple(map, prefix + "TenantId", this.TenantId);
        this.setParamArraySimple(map, prefix + "DatasourceIdList.", this.DatasourceIdList);
        this.setParamArraySimple(map, prefix + "DatasourceTypeList.", this.DatasourceTypeList);
        this.setParamArraySimple(map, prefix + "CycleUnitList.", this.CycleUnitList);
        this.setParamSimple(map, prefix + "CanSubmit", this.CanSubmit);

    }
}


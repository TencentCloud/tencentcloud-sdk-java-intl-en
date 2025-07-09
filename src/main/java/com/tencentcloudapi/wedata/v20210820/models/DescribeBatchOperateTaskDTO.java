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

public class DescribeBatchOperateTaskDTO extends AbstractModel {

    /**
    * Task IDNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Task NameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Workflow Id
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * Workflow name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * StatusNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Task IDNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskTypeId")
    @Expose
    private Long TaskTypeId;

    /**
    * Task TypeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskTypeDesc")
    @Expose
    private String TaskTypeDesc;

    /**
    * Folder name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("FolderName")
    @Expose
    private String FolderName;

    /**
    * Folder IDNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * Owner
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("InCharge")
    @Expose
    private String InCharge;

    /**
    * Submitted?
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Submit")
    @Expose
    private Long Submit;

    /**
    * Engine:
presto\SparkJob\SparkSql
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DataEngine")
    @Expose
    private String DataEngine;

    /**
    * Update timeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Creation time
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Cycle type
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CycleUnit")
    @Expose
    private String CycleUnit;

    /**
    * Scheduling plan
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ScheduleDesc")
    @Expose
    private String ScheduleDesc;

    /**
    * Data source ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DatasourceId")
    @Expose
    private String DatasourceId;

    /**
    * Data source typeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DatasourceType")
    @Expose
    private String DatasourceType;

    /**
     * Get Task IDNote: This field may return null, indicating that no valid value can be obtained. 
     * @return TaskId Task IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task IDNote: This field may return null, indicating that no valid value can be obtained.
     * @param TaskId Task IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Task NameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return TaskName Task NameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set Task NameNote: This field may return null, indicating that no valid value can be obtained.
     * @param TaskName Task NameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get Workflow Id
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return WorkflowId Workflow Id
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set Workflow Id
Note: This field may return null, indicating that no valid value can be obtained.
     * @param WorkflowId Workflow Id
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get Workflow name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return WorkflowName Workflow name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set Workflow name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param WorkflowName Workflow name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    /**
     * Get StatusNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Status StatusNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set StatusNote: This field may return null, indicating that no valid value can be obtained.
     * @param Status StatusNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Task IDNote: This field may return null, indicating that no valid value can be obtained. 
     * @return TaskTypeId Task IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getTaskTypeId() {
        return this.TaskTypeId;
    }

    /**
     * Set Task IDNote: This field may return null, indicating that no valid value can be obtained.
     * @param TaskTypeId Task IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTaskTypeId(Long TaskTypeId) {
        this.TaskTypeId = TaskTypeId;
    }

    /**
     * Get Task TypeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return TaskTypeDesc Task TypeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTaskTypeDesc() {
        return this.TaskTypeDesc;
    }

    /**
     * Set Task TypeNote: This field may return null, indicating that no valid value can be obtained.
     * @param TaskTypeDesc Task TypeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTaskTypeDesc(String TaskTypeDesc) {
        this.TaskTypeDesc = TaskTypeDesc;
    }

    /**
     * Get Folder name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return FolderName Folder name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getFolderName() {
        return this.FolderName;
    }

    /**
     * Set Folder name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param FolderName Folder name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setFolderName(String FolderName) {
        this.FolderName = FolderName;
    }

    /**
     * Get Folder IDNote: This field may return null, indicating that no valid value can be obtained. 
     * @return FolderId Folder IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set Folder IDNote: This field may return null, indicating that no valid value can be obtained.
     * @param FolderId Folder IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }

    /**
     * Get Owner
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return InCharge Owner
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getInCharge() {
        return this.InCharge;
    }

    /**
     * Set Owner
Note: This field may return null, indicating that no valid value can be obtained.
     * @param InCharge Owner
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setInCharge(String InCharge) {
        this.InCharge = InCharge;
    }

    /**
     * Get Submitted?
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Submit Submitted?
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getSubmit() {
        return this.Submit;
    }

    /**
     * Set Submitted?
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Submit Submitted?
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSubmit(Long Submit) {
        this.Submit = Submit;
    }

    /**
     * Get Engine:
presto\SparkJob\SparkSql
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DataEngine Engine:
presto\SparkJob\SparkSql
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDataEngine() {
        return this.DataEngine;
    }

    /**
     * Set Engine:
presto\SparkJob\SparkSql
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DataEngine Engine:
presto\SparkJob\SparkSql
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDataEngine(String DataEngine) {
        this.DataEngine = DataEngine;
    }

    /**
     * Get Update timeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return UpdateTime Update timeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update timeNote: This field may return null, indicating that no valid value can be obtained.
     * @param UpdateTime Update timeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Creation time
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CreateTime Creation time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CreateTime Creation time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Cycle type
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CycleUnit Cycle type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCycleUnit() {
        return this.CycleUnit;
    }

    /**
     * Set Cycle type
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CycleUnit Cycle type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCycleUnit(String CycleUnit) {
        this.CycleUnit = CycleUnit;
    }

    /**
     * Get Scheduling plan
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ScheduleDesc Scheduling plan
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getScheduleDesc() {
        return this.ScheduleDesc;
    }

    /**
     * Set Scheduling plan
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ScheduleDesc Scheduling plan
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setScheduleDesc(String ScheduleDesc) {
        this.ScheduleDesc = ScheduleDesc;
    }

    /**
     * Get Data source ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DatasourceId Data source ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set Data source ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DatasourceId Data source ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDatasourceId(String DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get Data source typeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return DatasourceType Data source typeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDatasourceType() {
        return this.DatasourceType;
    }

    /**
     * Set Data source typeNote: This field may return null, indicating that no valid value can be obtained.
     * @param DatasourceType Data source typeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDatasourceType(String DatasourceType) {
        this.DatasourceType = DatasourceType;
    }

    public DescribeBatchOperateTaskDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBatchOperateTaskDTO(DescribeBatchOperateTaskDTO source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TaskTypeId != null) {
            this.TaskTypeId = new Long(source.TaskTypeId);
        }
        if (source.TaskTypeDesc != null) {
            this.TaskTypeDesc = new String(source.TaskTypeDesc);
        }
        if (source.FolderName != null) {
            this.FolderName = new String(source.FolderName);
        }
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
        if (source.InCharge != null) {
            this.InCharge = new String(source.InCharge);
        }
        if (source.Submit != null) {
            this.Submit = new Long(source.Submit);
        }
        if (source.DataEngine != null) {
            this.DataEngine = new String(source.DataEngine);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.CycleUnit != null) {
            this.CycleUnit = new String(source.CycleUnit);
        }
        if (source.ScheduleDesc != null) {
            this.ScheduleDesc = new String(source.ScheduleDesc);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new String(source.DatasourceId);
        }
        if (source.DatasourceType != null) {
            this.DatasourceType = new String(source.DatasourceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TaskTypeId", this.TaskTypeId);
        this.setParamSimple(map, prefix + "TaskTypeDesc", this.TaskTypeDesc);
        this.setParamSimple(map, prefix + "FolderName", this.FolderName);
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);
        this.setParamSimple(map, prefix + "InCharge", this.InCharge);
        this.setParamSimple(map, prefix + "Submit", this.Submit);
        this.setParamSimple(map, prefix + "DataEngine", this.DataEngine);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "CycleUnit", this.CycleUnit);
        this.setParamSimple(map, prefix + "ScheduleDesc", this.ScheduleDesc);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "DatasourceType", this.DatasourceType);

    }
}


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

public class ModifyExecStrategyRequest extends AbstractModel {

    /**
    * Rule Group ID
    */
    @SerializedName("RuleGroupId")
    @Expose
    private Long RuleGroupId;

    /**
    * Monitoring Type 1. Not Configured, 2. Associated Production Scheduling, 3. Offline Cycle Detection
    */
    @SerializedName("MonitorType")
    @Expose
    private Long MonitorType;

    /**
    * Compute Queue
    */
    @SerializedName("ExecQueue")
    @Expose
    private String ExecQueue;

    /**
    * Execution Resource Group ID
    */
    @SerializedName("ExecutorGroupId")
    @Expose
    private String ExecutorGroupId;

    /**
    * Execution Resource Group Name
    */
    @SerializedName("ExecutorGroupName")
    @Expose
    private String ExecutorGroupName;

    /**
    * Associated Production Scheduling Task List
    */
    @SerializedName("Tasks")
    @Expose
    private ProdSchedulerTask [] Tasks;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Offline Cycle Mode, Effective Date - Start Time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Offline Cycle Mode, Effective Date - End Time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Offline Cycle Mode, Scheduling Period 
MINUTE_CYCLE:I,
HOUR_CYCLE:H,
DAY_CYCLE:D,
WEEK_CYCLE:W,
MONTH_CYCLE:M
    */
    @SerializedName("CycleType")
    @Expose
    private String CycleType;

    /**
    * Offline Cycle Mode, Scheduling Step
    */
    @SerializedName("CycleStep")
    @Expose
    private Long CycleStep;

    /**
    * Offline Cycle Mode, Specified Time
    */
    @SerializedName("TaskAction")
    @Expose
    private String TaskAction;

    /**
    * Delayed Execution Time, Unit: Minute, Optional: <0-1439
    */
    @SerializedName("DelayTime")
    @Expose
    private Long DelayTime;

    /**
    * Database ID
    */
    @SerializedName("DatabaseId")
    @Expose
    private String DatabaseId;

    /**
    * Data Source ID
    */
    @SerializedName("DatasourceId")
    @Expose
    private String DatasourceId;

    /**
    * Data Table ID
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

    /**
    * Running Execution Engine, Requests Default Execution Engine of the Data Source if Not Specified
    */
    @SerializedName("ExecEngineType")
    @Expose
    private String ExecEngineType;

    /**
    * Trigger scenario
    */
    @SerializedName("TriggerTypes")
    @Expose
    private String [] TriggerTypes;

    /**
     * Get Rule Group ID 
     * @return RuleGroupId Rule Group ID
     */
    public Long getRuleGroupId() {
        return this.RuleGroupId;
    }

    /**
     * Set Rule Group ID
     * @param RuleGroupId Rule Group ID
     */
    public void setRuleGroupId(Long RuleGroupId) {
        this.RuleGroupId = RuleGroupId;
    }

    /**
     * Get Monitoring Type 1. Not Configured, 2. Associated Production Scheduling, 3. Offline Cycle Detection 
     * @return MonitorType Monitoring Type 1. Not Configured, 2. Associated Production Scheduling, 3. Offline Cycle Detection
     */
    public Long getMonitorType() {
        return this.MonitorType;
    }

    /**
     * Set Monitoring Type 1. Not Configured, 2. Associated Production Scheduling, 3. Offline Cycle Detection
     * @param MonitorType Monitoring Type 1. Not Configured, 2. Associated Production Scheduling, 3. Offline Cycle Detection
     */
    public void setMonitorType(Long MonitorType) {
        this.MonitorType = MonitorType;
    }

    /**
     * Get Compute Queue 
     * @return ExecQueue Compute Queue
     */
    public String getExecQueue() {
        return this.ExecQueue;
    }

    /**
     * Set Compute Queue
     * @param ExecQueue Compute Queue
     */
    public void setExecQueue(String ExecQueue) {
        this.ExecQueue = ExecQueue;
    }

    /**
     * Get Execution Resource Group ID 
     * @return ExecutorGroupId Execution Resource Group ID
     */
    public String getExecutorGroupId() {
        return this.ExecutorGroupId;
    }

    /**
     * Set Execution Resource Group ID
     * @param ExecutorGroupId Execution Resource Group ID
     */
    public void setExecutorGroupId(String ExecutorGroupId) {
        this.ExecutorGroupId = ExecutorGroupId;
    }

    /**
     * Get Execution Resource Group Name 
     * @return ExecutorGroupName Execution Resource Group Name
     */
    public String getExecutorGroupName() {
        return this.ExecutorGroupName;
    }

    /**
     * Set Execution Resource Group Name
     * @param ExecutorGroupName Execution Resource Group Name
     */
    public void setExecutorGroupName(String ExecutorGroupName) {
        this.ExecutorGroupName = ExecutorGroupName;
    }

    /**
     * Get Associated Production Scheduling Task List 
     * @return Tasks Associated Production Scheduling Task List
     */
    public ProdSchedulerTask [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set Associated Production Scheduling Task List
     * @param Tasks Associated Production Scheduling Task List
     */
    public void setTasks(ProdSchedulerTask [] Tasks) {
        this.Tasks = Tasks;
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
     * Get Offline Cycle Mode, Effective Date - Start Time 
     * @return StartTime Offline Cycle Mode, Effective Date - Start Time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Offline Cycle Mode, Effective Date - Start Time
     * @param StartTime Offline Cycle Mode, Effective Date - Start Time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Offline Cycle Mode, Effective Date - End Time 
     * @return EndTime Offline Cycle Mode, Effective Date - End Time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Offline Cycle Mode, Effective Date - End Time
     * @param EndTime Offline Cycle Mode, Effective Date - End Time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Offline Cycle Mode, Scheduling Period 
MINUTE_CYCLE:I,
HOUR_CYCLE:H,
DAY_CYCLE:D,
WEEK_CYCLE:W,
MONTH_CYCLE:M 
     * @return CycleType Offline Cycle Mode, Scheduling Period 
MINUTE_CYCLE:I,
HOUR_CYCLE:H,
DAY_CYCLE:D,
WEEK_CYCLE:W,
MONTH_CYCLE:M
     */
    public String getCycleType() {
        return this.CycleType;
    }

    /**
     * Set Offline Cycle Mode, Scheduling Period 
MINUTE_CYCLE:I,
HOUR_CYCLE:H,
DAY_CYCLE:D,
WEEK_CYCLE:W,
MONTH_CYCLE:M
     * @param CycleType Offline Cycle Mode, Scheduling Period 
MINUTE_CYCLE:I,
HOUR_CYCLE:H,
DAY_CYCLE:D,
WEEK_CYCLE:W,
MONTH_CYCLE:M
     */
    public void setCycleType(String CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get Offline Cycle Mode, Scheduling Step 
     * @return CycleStep Offline Cycle Mode, Scheduling Step
     */
    public Long getCycleStep() {
        return this.CycleStep;
    }

    /**
     * Set Offline Cycle Mode, Scheduling Step
     * @param CycleStep Offline Cycle Mode, Scheduling Step
     */
    public void setCycleStep(Long CycleStep) {
        this.CycleStep = CycleStep;
    }

    /**
     * Get Offline Cycle Mode, Specified Time 
     * @return TaskAction Offline Cycle Mode, Specified Time
     */
    public String getTaskAction() {
        return this.TaskAction;
    }

    /**
     * Set Offline Cycle Mode, Specified Time
     * @param TaskAction Offline Cycle Mode, Specified Time
     */
    public void setTaskAction(String TaskAction) {
        this.TaskAction = TaskAction;
    }

    /**
     * Get Delayed Execution Time, Unit: Minute, Optional: <0-1439 
     * @return DelayTime Delayed Execution Time, Unit: Minute, Optional: <0-1439
     */
    public Long getDelayTime() {
        return this.DelayTime;
    }

    /**
     * Set Delayed Execution Time, Unit: Minute, Optional: <0-1439
     * @param DelayTime Delayed Execution Time, Unit: Minute, Optional: <0-1439
     */
    public void setDelayTime(Long DelayTime) {
        this.DelayTime = DelayTime;
    }

    /**
     * Get Database ID 
     * @return DatabaseId Database ID
     */
    public String getDatabaseId() {
        return this.DatabaseId;
    }

    /**
     * Set Database ID
     * @param DatabaseId Database ID
     */
    public void setDatabaseId(String DatabaseId) {
        this.DatabaseId = DatabaseId;
    }

    /**
     * Get Data Source ID 
     * @return DatasourceId Data Source ID
     */
    public String getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set Data Source ID
     * @param DatasourceId Data Source ID
     */
    public void setDatasourceId(String DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get Data Table ID 
     * @return TableId Data Table ID
     */
    public String getTableId() {
        return this.TableId;
    }

    /**
     * Set Data Table ID
     * @param TableId Data Table ID
     */
    public void setTableId(String TableId) {
        this.TableId = TableId;
    }

    /**
     * Get Running Execution Engine, Requests Default Execution Engine of the Data Source if Not Specified 
     * @return ExecEngineType Running Execution Engine, Requests Default Execution Engine of the Data Source if Not Specified
     */
    public String getExecEngineType() {
        return this.ExecEngineType;
    }

    /**
     * Set Running Execution Engine, Requests Default Execution Engine of the Data Source if Not Specified
     * @param ExecEngineType Running Execution Engine, Requests Default Execution Engine of the Data Source if Not Specified
     */
    public void setExecEngineType(String ExecEngineType) {
        this.ExecEngineType = ExecEngineType;
    }

    /**
     * Get Trigger scenario 
     * @return TriggerTypes Trigger scenario
     */
    public String [] getTriggerTypes() {
        return this.TriggerTypes;
    }

    /**
     * Set Trigger scenario
     * @param TriggerTypes Trigger scenario
     */
    public void setTriggerTypes(String [] TriggerTypes) {
        this.TriggerTypes = TriggerTypes;
    }

    public ModifyExecStrategyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyExecStrategyRequest(ModifyExecStrategyRequest source) {
        if (source.RuleGroupId != null) {
            this.RuleGroupId = new Long(source.RuleGroupId);
        }
        if (source.MonitorType != null) {
            this.MonitorType = new Long(source.MonitorType);
        }
        if (source.ExecQueue != null) {
            this.ExecQueue = new String(source.ExecQueue);
        }
        if (source.ExecutorGroupId != null) {
            this.ExecutorGroupId = new String(source.ExecutorGroupId);
        }
        if (source.ExecutorGroupName != null) {
            this.ExecutorGroupName = new String(source.ExecutorGroupName);
        }
        if (source.Tasks != null) {
            this.Tasks = new ProdSchedulerTask[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new ProdSchedulerTask(source.Tasks[i]);
            }
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.CycleType != null) {
            this.CycleType = new String(source.CycleType);
        }
        if (source.CycleStep != null) {
            this.CycleStep = new Long(source.CycleStep);
        }
        if (source.TaskAction != null) {
            this.TaskAction = new String(source.TaskAction);
        }
        if (source.DelayTime != null) {
            this.DelayTime = new Long(source.DelayTime);
        }
        if (source.DatabaseId != null) {
            this.DatabaseId = new String(source.DatabaseId);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new String(source.DatasourceId);
        }
        if (source.TableId != null) {
            this.TableId = new String(source.TableId);
        }
        if (source.ExecEngineType != null) {
            this.ExecEngineType = new String(source.ExecEngineType);
        }
        if (source.TriggerTypes != null) {
            this.TriggerTypes = new String[source.TriggerTypes.length];
            for (int i = 0; i < source.TriggerTypes.length; i++) {
                this.TriggerTypes[i] = new String(source.TriggerTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleGroupId", this.RuleGroupId);
        this.setParamSimple(map, prefix + "MonitorType", this.MonitorType);
        this.setParamSimple(map, prefix + "ExecQueue", this.ExecQueue);
        this.setParamSimple(map, prefix + "ExecutorGroupId", this.ExecutorGroupId);
        this.setParamSimple(map, prefix + "ExecutorGroupName", this.ExecutorGroupName);
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "CycleStep", this.CycleStep);
        this.setParamSimple(map, prefix + "TaskAction", this.TaskAction);
        this.setParamSimple(map, prefix + "DelayTime", this.DelayTime);
        this.setParamSimple(map, prefix + "DatabaseId", this.DatabaseId);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamSimple(map, prefix + "ExecEngineType", this.ExecEngineType);
        this.setParamArraySimple(map, prefix + "TriggerTypes.", this.TriggerTypes);

    }
}


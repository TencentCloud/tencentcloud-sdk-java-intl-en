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

public class RuleGroupExecStrategy extends AbstractModel {

    /**
    * Rule Group ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RuleGroupId")
    @Expose
    private Long RuleGroupId;

    /**
    * Monitoring Type 1. Not configured, 2. Associated with production scheduling, 3. Offline cycle detection
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("MonitorType")
    @Expose
    private Long MonitorType;

    /**
    * Calculation Queue
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ExecQueue")
    @Expose
    private String ExecQueue;

    /**
    * Execution Resource Group ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ExecutorGroupId")
    @Expose
    private String ExecutorGroupId;

    /**
    * Execution Resource Group Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ExecutorGroupName")
    @Expose
    private String ExecutorGroupName;

    /**
    * Associated Production Scheduling Task List
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Tasks")
    @Expose
    private ProdSchedulerTask [] Tasks;

    /**
    * Cycle Start Time
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Cycle End Time
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Scheduling Cycle Type
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CycleType")
    @Expose
    private String CycleType;

    /**
    * Delayed Scheduling Time
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DelayTime")
    @Expose
    private Long DelayTime;

    /**
    * Interval
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CycleStep")
    @Expose
    private Long CycleStep;

    /**
    * Time Specification
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskAction")
    @Expose
    private String TaskAction;

    /**
    * Execution engine to run, if not provided, the default execution engine for this data source will be requested
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ExecEngineType")
    @Expose
    private String ExecEngineType;

    /**
    * Execution planNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ExecPlan")
    @Expose
    private String ExecPlan;

    /**
    * Rule ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * Rule nameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Trigger Type
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TriggerTypes")
    @Expose
    private String [] TriggerTypes;

    /**
     * Get Rule Group ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RuleGroupId Rule Group ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getRuleGroupId() {
        return this.RuleGroupId;
    }

    /**
     * Set Rule Group ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RuleGroupId Rule Group ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRuleGroupId(Long RuleGroupId) {
        this.RuleGroupId = RuleGroupId;
    }

    /**
     * Get Monitoring Type 1. Not configured, 2. Associated with production scheduling, 3. Offline cycle detection
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return MonitorType Monitoring Type 1. Not configured, 2. Associated with production scheduling, 3. Offline cycle detection
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getMonitorType() {
        return this.MonitorType;
    }

    /**
     * Set Monitoring Type 1. Not configured, 2. Associated with production scheduling, 3. Offline cycle detection
Note: This field may return null, indicating that no valid value can be obtained.
     * @param MonitorType Monitoring Type 1. Not configured, 2. Associated with production scheduling, 3. Offline cycle detection
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setMonitorType(Long MonitorType) {
        this.MonitorType = MonitorType;
    }

    /**
     * Get Calculation Queue
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ExecQueue Calculation Queue
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getExecQueue() {
        return this.ExecQueue;
    }

    /**
     * Set Calculation Queue
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ExecQueue Calculation Queue
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setExecQueue(String ExecQueue) {
        this.ExecQueue = ExecQueue;
    }

    /**
     * Get Execution Resource Group ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ExecutorGroupId Execution Resource Group ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getExecutorGroupId() {
        return this.ExecutorGroupId;
    }

    /**
     * Set Execution Resource Group ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ExecutorGroupId Execution Resource Group ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setExecutorGroupId(String ExecutorGroupId) {
        this.ExecutorGroupId = ExecutorGroupId;
    }

    /**
     * Get Execution Resource Group Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ExecutorGroupName Execution Resource Group Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getExecutorGroupName() {
        return this.ExecutorGroupName;
    }

    /**
     * Set Execution Resource Group Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ExecutorGroupName Execution Resource Group Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setExecutorGroupName(String ExecutorGroupName) {
        this.ExecutorGroupName = ExecutorGroupName;
    }

    /**
     * Get Associated Production Scheduling Task List
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Tasks Associated Production Scheduling Task List
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public ProdSchedulerTask [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set Associated Production Scheduling Task List
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Tasks Associated Production Scheduling Task List
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTasks(ProdSchedulerTask [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get Cycle Start Time
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return StartTime Cycle Start Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Cycle Start Time
Note: This field may return null, indicating that no valid value can be obtained.
     * @param StartTime Cycle Start Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Cycle End Time
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return EndTime Cycle End Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Cycle End Time
Note: This field may return null, indicating that no valid value can be obtained.
     * @param EndTime Cycle End Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Scheduling Cycle Type
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CycleType Scheduling Cycle Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCycleType() {
        return this.CycleType;
    }

    /**
     * Set Scheduling Cycle Type
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CycleType Scheduling Cycle Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCycleType(String CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get Delayed Scheduling Time
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DelayTime Delayed Scheduling Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getDelayTime() {
        return this.DelayTime;
    }

    /**
     * Set Delayed Scheduling Time
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DelayTime Delayed Scheduling Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDelayTime(Long DelayTime) {
        this.DelayTime = DelayTime;
    }

    /**
     * Get Interval
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CycleStep Interval
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getCycleStep() {
        return this.CycleStep;
    }

    /**
     * Set Interval
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CycleStep Interval
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCycleStep(Long CycleStep) {
        this.CycleStep = CycleStep;
    }

    /**
     * Get Time Specification
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TaskAction Time Specification
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTaskAction() {
        return this.TaskAction;
    }

    /**
     * Set Time Specification
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TaskAction Time Specification
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTaskAction(String TaskAction) {
        this.TaskAction = TaskAction;
    }

    /**
     * Get Execution engine to run, if not provided, the default execution engine for this data source will be requested
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ExecEngineType Execution engine to run, if not provided, the default execution engine for this data source will be requested
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getExecEngineType() {
        return this.ExecEngineType;
    }

    /**
     * Set Execution engine to run, if not provided, the default execution engine for this data source will be requested
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ExecEngineType Execution engine to run, if not provided, the default execution engine for this data source will be requested
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setExecEngineType(String ExecEngineType) {
        this.ExecEngineType = ExecEngineType;
    }

    /**
     * Get Execution planNote: This field may return null, indicating that no valid value can be obtained. 
     * @return ExecPlan Execution planNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getExecPlan() {
        return this.ExecPlan;
    }

    /**
     * Set Execution planNote: This field may return null, indicating that no valid value can be obtained.
     * @param ExecPlan Execution planNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setExecPlan(String ExecPlan) {
        this.ExecPlan = ExecPlan;
    }

    /**
     * Get Rule ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RuleId Rule ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RuleId Rule ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Rule nameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return RuleName Rule nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Rule nameNote: This field may return null, indicating that no valid value can be obtained.
     * @param RuleName Rule nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Trigger Type
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TriggerTypes Trigger Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String [] getTriggerTypes() {
        return this.TriggerTypes;
    }

    /**
     * Set Trigger Type
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TriggerTypes Trigger Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTriggerTypes(String [] TriggerTypes) {
        this.TriggerTypes = TriggerTypes;
    }

    public RuleGroupExecStrategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleGroupExecStrategy(RuleGroupExecStrategy source) {
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
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.CycleType != null) {
            this.CycleType = new String(source.CycleType);
        }
        if (source.DelayTime != null) {
            this.DelayTime = new Long(source.DelayTime);
        }
        if (source.CycleStep != null) {
            this.CycleStep = new Long(source.CycleStep);
        }
        if (source.TaskAction != null) {
            this.TaskAction = new String(source.TaskAction);
        }
        if (source.ExecEngineType != null) {
            this.ExecEngineType = new String(source.ExecEngineType);
        }
        if (source.ExecPlan != null) {
            this.ExecPlan = new String(source.ExecPlan);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
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
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "DelayTime", this.DelayTime);
        this.setParamSimple(map, prefix + "CycleStep", this.CycleStep);
        this.setParamSimple(map, prefix + "TaskAction", this.TaskAction);
        this.setParamSimple(map, prefix + "ExecEngineType", this.ExecEngineType);
        this.setParamSimple(map, prefix + "ExecPlan", this.ExecPlan);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamArraySimple(map, prefix + "TriggerTypes.", this.TriggerTypes);

    }
}


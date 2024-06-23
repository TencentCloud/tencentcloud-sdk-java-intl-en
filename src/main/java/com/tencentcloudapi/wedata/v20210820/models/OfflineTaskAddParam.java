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

public class OfflineTaskAddParam extends AbstractModel {

    /**
    * Name
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * Dependencies: yes, no
    */
    @SerializedName("DependencyWorkflow")
    @Expose
    private String DependencyWorkflow;

    /**
    * Task Start Data Time. Not Empty. Default to Current Time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Task End Data Time. Not Empty. Default to Current Time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Cycle Type. One-time task: 6, Minute Task: 1, Hourly task: 2, Daily Task: 3, Weekly Task: 4, Monthly Task: 5, Cron task: 0
    */
    @SerializedName("CycleType")
    @Expose
    private Long CycleType;

    /**
    * Interval, optional, default is 1. Not null. Default is 1
    */
    @SerializedName("CycleStep")
    @Expose
    private Long CycleStep;

    /**
    * Delayed Execution Time, in minutes
    */
    @SerializedName("DelayTime")
    @Expose
    private Long DelayTime;

    /**
    * Task cron expression, used only for cron tasks, else defaults to empty
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CrontabExpression")
    @Expose
    private String CrontabExpression;

    /**
    * Retry Wait
    */
    @SerializedName("RetryWait")
    @Expose
    private Long RetryWait;

    /**
    * Is Retry Allowed
    */
    @SerializedName("Retriable")
    @Expose
    private Long Retriable;

    /**
    * Retry Limit
    */
    @SerializedName("TryLimit")
    @Expose
    private Long TryLimit;

    /**
    * Priority
    */
    @SerializedName("RunPriority")
    @Expose
    private Long RunPriority;

    /**
    * Product
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 1 Ordered Serialization, one at a time, queued orderly
2 Unordered Serial, one at a time, not queued serial
3 Parallel, multiple at a time parallel
    */
    @SerializedName("SelfDepend")
    @Expose
    private Long SelfDepend;

    /**
    * Time Specification, such as 1,3 for monthly tasks, enter 1,3. Not empty. Default ""
Monthly Task: for specific days like "1,3", specifying end of month as "L" alone, cannot be mixed with specific dates
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskAction")
    @Expose
    private String TaskAction;

    /**
    * Scheduled Execution End Time
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ExecutionEndTime")
    @Expose
    private String ExecutionEndTime;

    /**
    * Scheduled Execution Start Time
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ExecutionStartTime")
    @Expose
    private String ExecutionStartTime;

    /**
    * Is Auto-submit
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskAutoSubmit")
    @Expose
    private Boolean TaskAutoSubmit;

    /**
    * Instance Generation Method, T_PLUS_0 schedule task on the same day / T_PLUS_1 schedule task the next day
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("InstanceInitStrategy")
    @Expose
    private String InstanceInitStrategy;

    /**
     * Get Name 
     * @return WorkflowName Name
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set Name
     * @param WorkflowName Name
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    /**
     * Get Dependencies: yes, no 
     * @return DependencyWorkflow Dependencies: yes, no
     */
    public String getDependencyWorkflow() {
        return this.DependencyWorkflow;
    }

    /**
     * Set Dependencies: yes, no
     * @param DependencyWorkflow Dependencies: yes, no
     */
    public void setDependencyWorkflow(String DependencyWorkflow) {
        this.DependencyWorkflow = DependencyWorkflow;
    }

    /**
     * Get Task Start Data Time. Not Empty. Default to Current Time 
     * @return StartTime Task Start Data Time. Not Empty. Default to Current Time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Task Start Data Time. Not Empty. Default to Current Time
     * @param StartTime Task Start Data Time. Not Empty. Default to Current Time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Task End Data Time. Not Empty. Default to Current Time 
     * @return EndTime Task End Data Time. Not Empty. Default to Current Time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Task End Data Time. Not Empty. Default to Current Time
     * @param EndTime Task End Data Time. Not Empty. Default to Current Time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Cycle Type. One-time task: 6, Minute Task: 1, Hourly task: 2, Daily Task: 3, Weekly Task: 4, Monthly Task: 5, Cron task: 0 
     * @return CycleType Cycle Type. One-time task: 6, Minute Task: 1, Hourly task: 2, Daily Task: 3, Weekly Task: 4, Monthly Task: 5, Cron task: 0
     */
    public Long getCycleType() {
        return this.CycleType;
    }

    /**
     * Set Cycle Type. One-time task: 6, Minute Task: 1, Hourly task: 2, Daily Task: 3, Weekly Task: 4, Monthly Task: 5, Cron task: 0
     * @param CycleType Cycle Type. One-time task: 6, Minute Task: 1, Hourly task: 2, Daily Task: 3, Weekly Task: 4, Monthly Task: 5, Cron task: 0
     */
    public void setCycleType(Long CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get Interval, optional, default is 1. Not null. Default is 1 
     * @return CycleStep Interval, optional, default is 1. Not null. Default is 1
     */
    public Long getCycleStep() {
        return this.CycleStep;
    }

    /**
     * Set Interval, optional, default is 1. Not null. Default is 1
     * @param CycleStep Interval, optional, default is 1. Not null. Default is 1
     */
    public void setCycleStep(Long CycleStep) {
        this.CycleStep = CycleStep;
    }

    /**
     * Get Delayed Execution Time, in minutes 
     * @return DelayTime Delayed Execution Time, in minutes
     */
    public Long getDelayTime() {
        return this.DelayTime;
    }

    /**
     * Set Delayed Execution Time, in minutes
     * @param DelayTime Delayed Execution Time, in minutes
     */
    public void setDelayTime(Long DelayTime) {
        this.DelayTime = DelayTime;
    }

    /**
     * Get Task cron expression, used only for cron tasks, else defaults to empty
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CrontabExpression Task cron expression, used only for cron tasks, else defaults to empty
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCrontabExpression() {
        return this.CrontabExpression;
    }

    /**
     * Set Task cron expression, used only for cron tasks, else defaults to empty
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CrontabExpression Task cron expression, used only for cron tasks, else defaults to empty
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCrontabExpression(String CrontabExpression) {
        this.CrontabExpression = CrontabExpression;
    }

    /**
     * Get Retry Wait 
     * @return RetryWait Retry Wait
     */
    public Long getRetryWait() {
        return this.RetryWait;
    }

    /**
     * Set Retry Wait
     * @param RetryWait Retry Wait
     */
    public void setRetryWait(Long RetryWait) {
        this.RetryWait = RetryWait;
    }

    /**
     * Get Is Retry Allowed 
     * @return Retriable Is Retry Allowed
     */
    public Long getRetriable() {
        return this.Retriable;
    }

    /**
     * Set Is Retry Allowed
     * @param Retriable Is Retry Allowed
     */
    public void setRetriable(Long Retriable) {
        this.Retriable = Retriable;
    }

    /**
     * Get Retry Limit 
     * @return TryLimit Retry Limit
     */
    public Long getTryLimit() {
        return this.TryLimit;
    }

    /**
     * Set Retry Limit
     * @param TryLimit Retry Limit
     */
    public void setTryLimit(Long TryLimit) {
        this.TryLimit = TryLimit;
    }

    /**
     * Get Priority 
     * @return RunPriority Priority
     */
    public Long getRunPriority() {
        return this.RunPriority;
    }

    /**
     * Set Priority
     * @param RunPriority Priority
     */
    public void setRunPriority(Long RunPriority) {
        this.RunPriority = RunPriority;
    }

    /**
     * Get Product 
     * @return ProductName Product
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set Product
     * @param ProductName Product
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get 1 Ordered Serialization, one at a time, queued orderly
2 Unordered Serial, one at a time, not queued serial
3 Parallel, multiple at a time parallel 
     * @return SelfDepend 1 Ordered Serialization, one at a time, queued orderly
2 Unordered Serial, one at a time, not queued serial
3 Parallel, multiple at a time parallel
     */
    public Long getSelfDepend() {
        return this.SelfDepend;
    }

    /**
     * Set 1 Ordered Serialization, one at a time, queued orderly
2 Unordered Serial, one at a time, not queued serial
3 Parallel, multiple at a time parallel
     * @param SelfDepend 1 Ordered Serialization, one at a time, queued orderly
2 Unordered Serial, one at a time, not queued serial
3 Parallel, multiple at a time parallel
     */
    public void setSelfDepend(Long SelfDepend) {
        this.SelfDepend = SelfDepend;
    }

    /**
     * Get Time Specification, such as 1,3 for monthly tasks, enter 1,3. Not empty. Default ""
Monthly Task: for specific days like "1,3", specifying end of month as "L" alone, cannot be mixed with specific dates
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TaskAction Time Specification, such as 1,3 for monthly tasks, enter 1,3. Not empty. Default ""
Monthly Task: for specific days like "1,3", specifying end of month as "L" alone, cannot be mixed with specific dates
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTaskAction() {
        return this.TaskAction;
    }

    /**
     * Set Time Specification, such as 1,3 for monthly tasks, enter 1,3. Not empty. Default ""
Monthly Task: for specific days like "1,3", specifying end of month as "L" alone, cannot be mixed with specific dates
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TaskAction Time Specification, such as 1,3 for monthly tasks, enter 1,3. Not empty. Default ""
Monthly Task: for specific days like "1,3", specifying end of month as "L" alone, cannot be mixed with specific dates
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTaskAction(String TaskAction) {
        this.TaskAction = TaskAction;
    }

    /**
     * Get Scheduled Execution End Time
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ExecutionEndTime Scheduled Execution End Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getExecutionEndTime() {
        return this.ExecutionEndTime;
    }

    /**
     * Set Scheduled Execution End Time
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ExecutionEndTime Scheduled Execution End Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setExecutionEndTime(String ExecutionEndTime) {
        this.ExecutionEndTime = ExecutionEndTime;
    }

    /**
     * Get Scheduled Execution Start Time
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ExecutionStartTime Scheduled Execution Start Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getExecutionStartTime() {
        return this.ExecutionStartTime;
    }

    /**
     * Set Scheduled Execution Start Time
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ExecutionStartTime Scheduled Execution Start Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setExecutionStartTime(String ExecutionStartTime) {
        this.ExecutionStartTime = ExecutionStartTime;
    }

    /**
     * Get Is Auto-submit
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TaskAutoSubmit Is Auto-submit
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Boolean getTaskAutoSubmit() {
        return this.TaskAutoSubmit;
    }

    /**
     * Set Is Auto-submit
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TaskAutoSubmit Is Auto-submit
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTaskAutoSubmit(Boolean TaskAutoSubmit) {
        this.TaskAutoSubmit = TaskAutoSubmit;
    }

    /**
     * Get Instance Generation Method, T_PLUS_0 schedule task on the same day / T_PLUS_1 schedule task the next day
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return InstanceInitStrategy Instance Generation Method, T_PLUS_0 schedule task on the same day / T_PLUS_1 schedule task the next day
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getInstanceInitStrategy() {
        return this.InstanceInitStrategy;
    }

    /**
     * Set Instance Generation Method, T_PLUS_0 schedule task on the same day / T_PLUS_1 schedule task the next day
Note: This field may return null, indicating that no valid value can be obtained.
     * @param InstanceInitStrategy Instance Generation Method, T_PLUS_0 schedule task on the same day / T_PLUS_1 schedule task the next day
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setInstanceInitStrategy(String InstanceInitStrategy) {
        this.InstanceInitStrategy = InstanceInitStrategy;
    }

    public OfflineTaskAddParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OfflineTaskAddParam(OfflineTaskAddParam source) {
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.DependencyWorkflow != null) {
            this.DependencyWorkflow = new String(source.DependencyWorkflow);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.CycleType != null) {
            this.CycleType = new Long(source.CycleType);
        }
        if (source.CycleStep != null) {
            this.CycleStep = new Long(source.CycleStep);
        }
        if (source.DelayTime != null) {
            this.DelayTime = new Long(source.DelayTime);
        }
        if (source.CrontabExpression != null) {
            this.CrontabExpression = new String(source.CrontabExpression);
        }
        if (source.RetryWait != null) {
            this.RetryWait = new Long(source.RetryWait);
        }
        if (source.Retriable != null) {
            this.Retriable = new Long(source.Retriable);
        }
        if (source.TryLimit != null) {
            this.TryLimit = new Long(source.TryLimit);
        }
        if (source.RunPriority != null) {
            this.RunPriority = new Long(source.RunPriority);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.SelfDepend != null) {
            this.SelfDepend = new Long(source.SelfDepend);
        }
        if (source.TaskAction != null) {
            this.TaskAction = new String(source.TaskAction);
        }
        if (source.ExecutionEndTime != null) {
            this.ExecutionEndTime = new String(source.ExecutionEndTime);
        }
        if (source.ExecutionStartTime != null) {
            this.ExecutionStartTime = new String(source.ExecutionStartTime);
        }
        if (source.TaskAutoSubmit != null) {
            this.TaskAutoSubmit = new Boolean(source.TaskAutoSubmit);
        }
        if (source.InstanceInitStrategy != null) {
            this.InstanceInitStrategy = new String(source.InstanceInitStrategy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "DependencyWorkflow", this.DependencyWorkflow);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "CycleStep", this.CycleStep);
        this.setParamSimple(map, prefix + "DelayTime", this.DelayTime);
        this.setParamSimple(map, prefix + "CrontabExpression", this.CrontabExpression);
        this.setParamSimple(map, prefix + "RetryWait", this.RetryWait);
        this.setParamSimple(map, prefix + "Retriable", this.Retriable);
        this.setParamSimple(map, prefix + "TryLimit", this.TryLimit);
        this.setParamSimple(map, prefix + "RunPriority", this.RunPriority);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "SelfDepend", this.SelfDepend);
        this.setParamSimple(map, prefix + "TaskAction", this.TaskAction);
        this.setParamSimple(map, prefix + "ExecutionEndTime", this.ExecutionEndTime);
        this.setParamSimple(map, prefix + "ExecutionStartTime", this.ExecutionStartTime);
        this.setParamSimple(map, prefix + "TaskAutoSubmit", this.TaskAutoSubmit);
        this.setParamSimple(map, prefix + "InstanceInitStrategy", this.InstanceInitStrategy);

    }
}


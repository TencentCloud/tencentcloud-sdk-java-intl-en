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

public class CreateTriggerTaskSchedulerConfiguration extends AbstractModel {

    /**
    * Task array of upstream dependency.
    */
    @SerializedName("UpstreamDependencyConfigList")
    @Expose
    private DependencyTriggerTaskBrief [] UpstreamDependencyConfigList;

    /**
    * Task scheduling priority. execution priority: 4 (high), 5 (medium), 6 (low). default: 6.
    */
    @SerializedName("RunPriorityType")
    @Expose
    private Long RunPriorityType;

    /**
    * Retry policy retry wait time, in minutes: default: 5.
    */
    @SerializedName("RetryWaitMinute")
    @Expose
    private Long RetryWaitMinute;

    /**
    * Retry policy maximum attempts. default: 4.
    */
    @SerializedName("MaxRetryNumber")
    @Expose
    private Long MaxRetryNumber;

    /**
    * Timeout handling strategy runtime timeout (unit: minutes) defaults to -1.
    */
    @SerializedName("ExecutionTTLMinute")
    @Expose
    private Long ExecutionTTLMinute;

    /**
    * Timeout handling strategy wait duration timeout (unit: minutes) defaults to -1.
    */
    @SerializedName("WaitExecutionTotalTTLMinute")
    @Expose
    private Long WaitExecutionTotalTTLMinute;

    /**
    * Rerun & replenishment configuration, defaults to ALL. ALL allows rerun or replenishment after successful or failed running. FAILURE does not allow rerun or replenishment after successful running, but allows rerun or replenishment after failed running. NONE does not allow rerun or replenishment after successful or failed running.
    */
    @SerializedName("AllowRedoType")
    @Expose
    private String AllowRedoType;

    /**
    * Output parameter array.
    */
    @SerializedName("ParamTaskOutList")
    @Expose
    private OutTaskParameter [] ParamTaskOutList;

    /**
    * Input parameter array.
    */
    @SerializedName("ParamTaskInList")
    @Expose
    private InTaskParameter [] ParamTaskInList;

    /**
    * Output registration.
    */
    @SerializedName("TaskOutputRegistryList")
    @Expose
    private TaskDataRegistry [] TaskOutputRegistryList;

    /**
     * Get Task array of upstream dependency. 
     * @return UpstreamDependencyConfigList Task array of upstream dependency.
     */
    public DependencyTriggerTaskBrief [] getUpstreamDependencyConfigList() {
        return this.UpstreamDependencyConfigList;
    }

    /**
     * Set Task array of upstream dependency.
     * @param UpstreamDependencyConfigList Task array of upstream dependency.
     */
    public void setUpstreamDependencyConfigList(DependencyTriggerTaskBrief [] UpstreamDependencyConfigList) {
        this.UpstreamDependencyConfigList = UpstreamDependencyConfigList;
    }

    /**
     * Get Task scheduling priority. execution priority: 4 (high), 5 (medium), 6 (low). default: 6. 
     * @return RunPriorityType Task scheduling priority. execution priority: 4 (high), 5 (medium), 6 (low). default: 6.
     */
    public Long getRunPriorityType() {
        return this.RunPriorityType;
    }

    /**
     * Set Task scheduling priority. execution priority: 4 (high), 5 (medium), 6 (low). default: 6.
     * @param RunPriorityType Task scheduling priority. execution priority: 4 (high), 5 (medium), 6 (low). default: 6.
     */
    public void setRunPriorityType(Long RunPriorityType) {
        this.RunPriorityType = RunPriorityType;
    }

    /**
     * Get Retry policy retry wait time, in minutes: default: 5. 
     * @return RetryWaitMinute Retry policy retry wait time, in minutes: default: 5.
     */
    public Long getRetryWaitMinute() {
        return this.RetryWaitMinute;
    }

    /**
     * Set Retry policy retry wait time, in minutes: default: 5.
     * @param RetryWaitMinute Retry policy retry wait time, in minutes: default: 5.
     */
    public void setRetryWaitMinute(Long RetryWaitMinute) {
        this.RetryWaitMinute = RetryWaitMinute;
    }

    /**
     * Get Retry policy maximum attempts. default: 4. 
     * @return MaxRetryNumber Retry policy maximum attempts. default: 4.
     */
    public Long getMaxRetryNumber() {
        return this.MaxRetryNumber;
    }

    /**
     * Set Retry policy maximum attempts. default: 4.
     * @param MaxRetryNumber Retry policy maximum attempts. default: 4.
     */
    public void setMaxRetryNumber(Long MaxRetryNumber) {
        this.MaxRetryNumber = MaxRetryNumber;
    }

    /**
     * Get Timeout handling strategy runtime timeout (unit: minutes) defaults to -1. 
     * @return ExecutionTTLMinute Timeout handling strategy runtime timeout (unit: minutes) defaults to -1.
     */
    public Long getExecutionTTLMinute() {
        return this.ExecutionTTLMinute;
    }

    /**
     * Set Timeout handling strategy runtime timeout (unit: minutes) defaults to -1.
     * @param ExecutionTTLMinute Timeout handling strategy runtime timeout (unit: minutes) defaults to -1.
     */
    public void setExecutionTTLMinute(Long ExecutionTTLMinute) {
        this.ExecutionTTLMinute = ExecutionTTLMinute;
    }

    /**
     * Get Timeout handling strategy wait duration timeout (unit: minutes) defaults to -1. 
     * @return WaitExecutionTotalTTLMinute Timeout handling strategy wait duration timeout (unit: minutes) defaults to -1.
     */
    public Long getWaitExecutionTotalTTLMinute() {
        return this.WaitExecutionTotalTTLMinute;
    }

    /**
     * Set Timeout handling strategy wait duration timeout (unit: minutes) defaults to -1.
     * @param WaitExecutionTotalTTLMinute Timeout handling strategy wait duration timeout (unit: minutes) defaults to -1.
     */
    public void setWaitExecutionTotalTTLMinute(Long WaitExecutionTotalTTLMinute) {
        this.WaitExecutionTotalTTLMinute = WaitExecutionTotalTTLMinute;
    }

    /**
     * Get Rerun & replenishment configuration, defaults to ALL. ALL allows rerun or replenishment after successful or failed running. FAILURE does not allow rerun or replenishment after successful running, but allows rerun or replenishment after failed running. NONE does not allow rerun or replenishment after successful or failed running. 
     * @return AllowRedoType Rerun & replenishment configuration, defaults to ALL. ALL allows rerun or replenishment after successful or failed running. FAILURE does not allow rerun or replenishment after successful running, but allows rerun or replenishment after failed running. NONE does not allow rerun or replenishment after successful or failed running.
     */
    public String getAllowRedoType() {
        return this.AllowRedoType;
    }

    /**
     * Set Rerun & replenishment configuration, defaults to ALL. ALL allows rerun or replenishment after successful or failed running. FAILURE does not allow rerun or replenishment after successful running, but allows rerun or replenishment after failed running. NONE does not allow rerun or replenishment after successful or failed running.
     * @param AllowRedoType Rerun & replenishment configuration, defaults to ALL. ALL allows rerun or replenishment after successful or failed running. FAILURE does not allow rerun or replenishment after successful running, but allows rerun or replenishment after failed running. NONE does not allow rerun or replenishment after successful or failed running.
     */
    public void setAllowRedoType(String AllowRedoType) {
        this.AllowRedoType = AllowRedoType;
    }

    /**
     * Get Output parameter array. 
     * @return ParamTaskOutList Output parameter array.
     */
    public OutTaskParameter [] getParamTaskOutList() {
        return this.ParamTaskOutList;
    }

    /**
     * Set Output parameter array.
     * @param ParamTaskOutList Output parameter array.
     */
    public void setParamTaskOutList(OutTaskParameter [] ParamTaskOutList) {
        this.ParamTaskOutList = ParamTaskOutList;
    }

    /**
     * Get Input parameter array. 
     * @return ParamTaskInList Input parameter array.
     */
    public InTaskParameter [] getParamTaskInList() {
        return this.ParamTaskInList;
    }

    /**
     * Set Input parameter array.
     * @param ParamTaskInList Input parameter array.
     */
    public void setParamTaskInList(InTaskParameter [] ParamTaskInList) {
        this.ParamTaskInList = ParamTaskInList;
    }

    /**
     * Get Output registration. 
     * @return TaskOutputRegistryList Output registration.
     */
    public TaskDataRegistry [] getTaskOutputRegistryList() {
        return this.TaskOutputRegistryList;
    }

    /**
     * Set Output registration.
     * @param TaskOutputRegistryList Output registration.
     */
    public void setTaskOutputRegistryList(TaskDataRegistry [] TaskOutputRegistryList) {
        this.TaskOutputRegistryList = TaskOutputRegistryList;
    }

    public CreateTriggerTaskSchedulerConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTriggerTaskSchedulerConfiguration(CreateTriggerTaskSchedulerConfiguration source) {
        if (source.UpstreamDependencyConfigList != null) {
            this.UpstreamDependencyConfigList = new DependencyTriggerTaskBrief[source.UpstreamDependencyConfigList.length];
            for (int i = 0; i < source.UpstreamDependencyConfigList.length; i++) {
                this.UpstreamDependencyConfigList[i] = new DependencyTriggerTaskBrief(source.UpstreamDependencyConfigList[i]);
            }
        }
        if (source.RunPriorityType != null) {
            this.RunPriorityType = new Long(source.RunPriorityType);
        }
        if (source.RetryWaitMinute != null) {
            this.RetryWaitMinute = new Long(source.RetryWaitMinute);
        }
        if (source.MaxRetryNumber != null) {
            this.MaxRetryNumber = new Long(source.MaxRetryNumber);
        }
        if (source.ExecutionTTLMinute != null) {
            this.ExecutionTTLMinute = new Long(source.ExecutionTTLMinute);
        }
        if (source.WaitExecutionTotalTTLMinute != null) {
            this.WaitExecutionTotalTTLMinute = new Long(source.WaitExecutionTotalTTLMinute);
        }
        if (source.AllowRedoType != null) {
            this.AllowRedoType = new String(source.AllowRedoType);
        }
        if (source.ParamTaskOutList != null) {
            this.ParamTaskOutList = new OutTaskParameter[source.ParamTaskOutList.length];
            for (int i = 0; i < source.ParamTaskOutList.length; i++) {
                this.ParamTaskOutList[i] = new OutTaskParameter(source.ParamTaskOutList[i]);
            }
        }
        if (source.ParamTaskInList != null) {
            this.ParamTaskInList = new InTaskParameter[source.ParamTaskInList.length];
            for (int i = 0; i < source.ParamTaskInList.length; i++) {
                this.ParamTaskInList[i] = new InTaskParameter(source.ParamTaskInList[i]);
            }
        }
        if (source.TaskOutputRegistryList != null) {
            this.TaskOutputRegistryList = new TaskDataRegistry[source.TaskOutputRegistryList.length];
            for (int i = 0; i < source.TaskOutputRegistryList.length; i++) {
                this.TaskOutputRegistryList[i] = new TaskDataRegistry(source.TaskOutputRegistryList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "UpstreamDependencyConfigList.", this.UpstreamDependencyConfigList);
        this.setParamSimple(map, prefix + "RunPriorityType", this.RunPriorityType);
        this.setParamSimple(map, prefix + "RetryWaitMinute", this.RetryWaitMinute);
        this.setParamSimple(map, prefix + "MaxRetryNumber", this.MaxRetryNumber);
        this.setParamSimple(map, prefix + "ExecutionTTLMinute", this.ExecutionTTLMinute);
        this.setParamSimple(map, prefix + "WaitExecutionTotalTTLMinute", this.WaitExecutionTotalTTLMinute);
        this.setParamSimple(map, prefix + "AllowRedoType", this.AllowRedoType);
        this.setParamArrayObj(map, prefix + "ParamTaskOutList.", this.ParamTaskOutList);
        this.setParamArrayObj(map, prefix + "ParamTaskInList.", this.ParamTaskInList);
        this.setParamArrayObj(map, prefix + "TaskOutputRegistryList.", this.TaskOutputRegistryList);

    }
}


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

public class TriggerTaskSchedulerConfiguration extends AbstractModel {

    /**
    * Upstream dependency array.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpstreamDependencyConfigList")
    @Expose
    private DependencyTriggerTaskBrief [] UpstreamDependencyConfigList;

    /**
    * Task scheduling priority. execution priority. valid values: 4 (high), 5 (medium), 6 (low). default: 6.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RunPriorityType")
    @Expose
    private Long RunPriorityType;

    /**
    * Retry policy retry wait time, in minutes: default: 5.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RetryWaitMinute")
    @Expose
    private Long RetryWaitMinute;

    /**
    * Retry policy maximum attempts. default: 4.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxRetryNumber")
    @Expose
    private Long MaxRetryNumber;

    /**
    * Timeout handling strategy runtime timeout (unit: minutes) defaults to -1.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExecutionTTLMinute")
    @Expose
    private Long ExecutionTTLMinute;

    /**
    * Timeout handling strategy wait duration timeout (unit: minutes) defaults to -1.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WaitExecutionTotalTTLMinute")
    @Expose
    private Long WaitExecutionTotalTTLMinute;

    /**
    * Rerun & replenishment configuration, defaults to ALL. ALL allows rerun or replenishment after successful or failed running. FAILURE does not allow rerun or replenishment after successful running but allows after failed running. NONE does not allow rerun or replenishment after either successful or failed running.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AllowRedoType")
    @Expose
    private String AllowRedoType;

    /**
    * Output parameter array.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ParamTaskOutList")
    @Expose
    private OutTaskParameter [] ParamTaskOutList;

    /**
    * Input parameter array.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ParamTaskInList")
    @Expose
    private InTaskParameter [] ParamTaskInList;

    /**
    * Output registration.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskOutputRegistryList")
    @Expose
    private TaskDataRegistry [] TaskOutputRegistryList;

    /**
     * Get Upstream dependency array.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpstreamDependencyConfigList Upstream dependency array.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DependencyTriggerTaskBrief [] getUpstreamDependencyConfigList() {
        return this.UpstreamDependencyConfigList;
    }

    /**
     * Set Upstream dependency array.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpstreamDependencyConfigList Upstream dependency array.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpstreamDependencyConfigList(DependencyTriggerTaskBrief [] UpstreamDependencyConfigList) {
        this.UpstreamDependencyConfigList = UpstreamDependencyConfigList;
    }

    /**
     * Get Task scheduling priority. execution priority. valid values: 4 (high), 5 (medium), 6 (low). default: 6.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RunPriorityType Task scheduling priority. execution priority. valid values: 4 (high), 5 (medium), 6 (low). default: 6.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRunPriorityType() {
        return this.RunPriorityType;
    }

    /**
     * Set Task scheduling priority. execution priority. valid values: 4 (high), 5 (medium), 6 (low). default: 6.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RunPriorityType Task scheduling priority. execution priority. valid values: 4 (high), 5 (medium), 6 (low). default: 6.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRunPriorityType(Long RunPriorityType) {
        this.RunPriorityType = RunPriorityType;
    }

    /**
     * Get Retry policy retry wait time, in minutes: default: 5.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RetryWaitMinute Retry policy retry wait time, in minutes: default: 5.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRetryWaitMinute() {
        return this.RetryWaitMinute;
    }

    /**
     * Set Retry policy retry wait time, in minutes: default: 5.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RetryWaitMinute Retry policy retry wait time, in minutes: default: 5.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRetryWaitMinute(Long RetryWaitMinute) {
        this.RetryWaitMinute = RetryWaitMinute;
    }

    /**
     * Get Retry policy maximum attempts. default: 4.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MaxRetryNumber Retry policy maximum attempts. default: 4.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxRetryNumber() {
        return this.MaxRetryNumber;
    }

    /**
     * Set Retry policy maximum attempts. default: 4.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MaxRetryNumber Retry policy maximum attempts. default: 4.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxRetryNumber(Long MaxRetryNumber) {
        this.MaxRetryNumber = MaxRetryNumber;
    }

    /**
     * Get Timeout handling strategy runtime timeout (unit: minutes) defaults to -1.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExecutionTTLMinute Timeout handling strategy runtime timeout (unit: minutes) defaults to -1.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getExecutionTTLMinute() {
        return this.ExecutionTTLMinute;
    }

    /**
     * Set Timeout handling strategy runtime timeout (unit: minutes) defaults to -1.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExecutionTTLMinute Timeout handling strategy runtime timeout (unit: minutes) defaults to -1.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExecutionTTLMinute(Long ExecutionTTLMinute) {
        this.ExecutionTTLMinute = ExecutionTTLMinute;
    }

    /**
     * Get Timeout handling strategy wait duration timeout (unit: minutes) defaults to -1.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WaitExecutionTotalTTLMinute Timeout handling strategy wait duration timeout (unit: minutes) defaults to -1.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getWaitExecutionTotalTTLMinute() {
        return this.WaitExecutionTotalTTLMinute;
    }

    /**
     * Set Timeout handling strategy wait duration timeout (unit: minutes) defaults to -1.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WaitExecutionTotalTTLMinute Timeout handling strategy wait duration timeout (unit: minutes) defaults to -1.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWaitExecutionTotalTTLMinute(Long WaitExecutionTotalTTLMinute) {
        this.WaitExecutionTotalTTLMinute = WaitExecutionTotalTTLMinute;
    }

    /**
     * Get Rerun & replenishment configuration, defaults to ALL. ALL allows rerun or replenishment after successful or failed running. FAILURE does not allow rerun or replenishment after successful running but allows after failed running. NONE does not allow rerun or replenishment after either successful or failed running.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AllowRedoType Rerun & replenishment configuration, defaults to ALL. ALL allows rerun or replenishment after successful or failed running. FAILURE does not allow rerun or replenishment after successful running but allows after failed running. NONE does not allow rerun or replenishment after either successful or failed running.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAllowRedoType() {
        return this.AllowRedoType;
    }

    /**
     * Set Rerun & replenishment configuration, defaults to ALL. ALL allows rerun or replenishment after successful or failed running. FAILURE does not allow rerun or replenishment after successful running but allows after failed running. NONE does not allow rerun or replenishment after either successful or failed running.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AllowRedoType Rerun & replenishment configuration, defaults to ALL. ALL allows rerun or replenishment after successful or failed running. FAILURE does not allow rerun or replenishment after successful running but allows after failed running. NONE does not allow rerun or replenishment after either successful or failed running.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAllowRedoType(String AllowRedoType) {
        this.AllowRedoType = AllowRedoType;
    }

    /**
     * Get Output parameter array.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ParamTaskOutList Output parameter array.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public OutTaskParameter [] getParamTaskOutList() {
        return this.ParamTaskOutList;
    }

    /**
     * Set Output parameter array.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ParamTaskOutList Output parameter array.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setParamTaskOutList(OutTaskParameter [] ParamTaskOutList) {
        this.ParamTaskOutList = ParamTaskOutList;
    }

    /**
     * Get Input parameter array.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ParamTaskInList Input parameter array.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public InTaskParameter [] getParamTaskInList() {
        return this.ParamTaskInList;
    }

    /**
     * Set Input parameter array.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ParamTaskInList Input parameter array.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setParamTaskInList(InTaskParameter [] ParamTaskInList) {
        this.ParamTaskInList = ParamTaskInList;
    }

    /**
     * Get Output registration.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskOutputRegistryList Output registration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TaskDataRegistry [] getTaskOutputRegistryList() {
        return this.TaskOutputRegistryList;
    }

    /**
     * Set Output registration.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskOutputRegistryList Output registration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskOutputRegistryList(TaskDataRegistry [] TaskOutputRegistryList) {
        this.TaskOutputRegistryList = TaskOutputRegistryList;
    }

    public TriggerTaskSchedulerConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TriggerTaskSchedulerConfiguration(TriggerTaskSchedulerConfiguration source) {
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


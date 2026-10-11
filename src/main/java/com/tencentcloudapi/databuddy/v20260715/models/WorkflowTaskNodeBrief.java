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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkflowTaskNodeBrief extends AbstractModel {

    /**
    * <p>Workflow ID</p>
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * <p>Task ID.</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>Task name.</p>
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>Task Type Name. For details, see the TaskTypeName field description in the data structure TaskType.</p>
    */
    @SerializedName("TaskTypeName")
    @Expose
    private String TaskTypeName;

    /**
    * <p>Task dependency list.</p>
    */
    @SerializedName("DependOnList")
    @Expose
    private DependOnBrief [] DependOnList;

    /**
    * <p>Task resource group ID.</p>
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
    * <p>Task resource group name.</p>
    */
    @SerializedName("ResourceGroupName")
    @Expose
    private String ResourceGroupName;

    /**
    * <p>Task X coordinate</p>
    */
    @SerializedName("LeftCoordinate")
    @Expose
    private Float LeftCoordinate;

    /**
    * <p>Task Y-axis coordinate</p>
    */
    @SerializedName("TopCoordinate")
    @Expose
    private Float TopCoordinate;

    /**
    * <p>Task retry policy</p>
    */
    @SerializedName("TaskRetryStrategy")
    @Expose
    private TaskRetryStrategy TaskRetryStrategy;

    /**
    * <p>Task dependency run conditions</p><p>ALL_SUCCESS: All successful: All upstream dependency tasks have been executed and succeeded<br>ONE_SUCCESS: At least one successful: At least one upstream dependency task succeeded<br>NONE_FAILED: No failure currently: No dependency task failed, and at least one dependency task is running<br>ALL_DONE: All completed: All upstream dependency tasks have been executed and completed (regardless of success or failure)<br>ONE_FAILED: At least one failed: At least one upstream dependency task failed<br>ALL_FAILED: All failed: All upstream dependency tasks failed<br>ALL_DONE_AT_LEAST_ONE_SUCCESS: All upstream completed and at least one successful: When all upstream dependency tasks reach a final state, a dependency check is performed. If at least one succeeded, the dependency check passes; otherwise, the run is skipped<br>ALL_SKIPPED: All upstream completed, no skipped run: When all upstream dependency tasks reach a final state, a dependency check is performed. If all upstream states are successful, failed, or upstream failed state, the dependency check passes; otherwise, the run is skipped<br>ONE_DONE: At least one completed: Once at least one upstream task is completed, a dependency check is performed, and the dependency check passes; otherwise, it keeps waiting for upstream<br>ALL_DONE_NONE_FAILED_AT_LEAST_ONE_SUCCESS: All upstream completed, none failed, at least one successful: When all upstream dependency tasks reach a final state, a dependency check is performed. If no upstream task failed and at least one succeeded, the dependency check passes; otherwise, the run is skipped<br>NONE_SKIPPED: All upstream completed, no skipped run: When all upstream dependency tasks reach a final state, a dependency check is performed. If all upstream states are successful, failed, or upstream failed state, the dependency check passes; otherwise, the run is skipped<br>ALL_DONE_AT_LEAST_ONE_FAILED: All upstream completed and at least one failed: When all upstream dependency tasks reach a final state, a dependency check is performed. If at least one failed, the dependency check passes; otherwise, the run is skipped<br>ADVANCED: Configured when the run condition is in advanced mode</p>
    */
    @SerializedName("DependOnRunCondition")
    @Expose
    private String DependOnRunCondition;

    /**
    * <p>Advanced dependency configuration</p>
    */
    @SerializedName("AdvancedDependencyConfig")
    @Expose
    private AdvancedDependencyConfig AdvancedDependencyConfig;

    /**
    * <p>Built-in workflow task node</p>
    */
    @SerializedName("InnerTask")
    @Expose
    private WorkflowTaskNodeBrief InnerTask;

    /**
     * Get <p>Workflow ID</p> 
     * @return WorkflowId <p>Workflow ID</p>
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set <p>Workflow ID</p>
     * @param WorkflowId <p>Workflow ID</p>
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get <p>Task ID.</p> 
     * @return TaskId <p>Task ID.</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>Task ID.</p>
     * @param TaskId <p>Task ID.</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>Task name.</p> 
     * @return TaskName <p>Task name.</p>
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>Task name.</p>
     * @param TaskName <p>Task name.</p>
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get <p>Task Type Name. For details, see the TaskTypeName field description in the data structure TaskType.</p> 
     * @return TaskTypeName <p>Task Type Name. For details, see the TaskTypeName field description in the data structure TaskType.</p>
     */
    public String getTaskTypeName() {
        return this.TaskTypeName;
    }

    /**
     * Set <p>Task Type Name. For details, see the TaskTypeName field description in the data structure TaskType.</p>
     * @param TaskTypeName <p>Task Type Name. For details, see the TaskTypeName field description in the data structure TaskType.</p>
     */
    public void setTaskTypeName(String TaskTypeName) {
        this.TaskTypeName = TaskTypeName;
    }

    /**
     * Get <p>Task dependency list.</p> 
     * @return DependOnList <p>Task dependency list.</p>
     */
    public DependOnBrief [] getDependOnList() {
        return this.DependOnList;
    }

    /**
     * Set <p>Task dependency list.</p>
     * @param DependOnList <p>Task dependency list.</p>
     */
    public void setDependOnList(DependOnBrief [] DependOnList) {
        this.DependOnList = DependOnList;
    }

    /**
     * Get <p>Task resource group ID.</p> 
     * @return ResourceGroupId <p>Task resource group ID.</p>
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set <p>Task resource group ID.</p>
     * @param ResourceGroupId <p>Task resource group ID.</p>
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
    }

    /**
     * Get <p>Task resource group name.</p> 
     * @return ResourceGroupName <p>Task resource group name.</p>
     */
    public String getResourceGroupName() {
        return this.ResourceGroupName;
    }

    /**
     * Set <p>Task resource group name.</p>
     * @param ResourceGroupName <p>Task resource group name.</p>
     */
    public void setResourceGroupName(String ResourceGroupName) {
        this.ResourceGroupName = ResourceGroupName;
    }

    /**
     * Get <p>Task X coordinate</p> 
     * @return LeftCoordinate <p>Task X coordinate</p>
     */
    public Float getLeftCoordinate() {
        return this.LeftCoordinate;
    }

    /**
     * Set <p>Task X coordinate</p>
     * @param LeftCoordinate <p>Task X coordinate</p>
     */
    public void setLeftCoordinate(Float LeftCoordinate) {
        this.LeftCoordinate = LeftCoordinate;
    }

    /**
     * Get <p>Task Y-axis coordinate</p> 
     * @return TopCoordinate <p>Task Y-axis coordinate</p>
     */
    public Float getTopCoordinate() {
        return this.TopCoordinate;
    }

    /**
     * Set <p>Task Y-axis coordinate</p>
     * @param TopCoordinate <p>Task Y-axis coordinate</p>
     */
    public void setTopCoordinate(Float TopCoordinate) {
        this.TopCoordinate = TopCoordinate;
    }

    /**
     * Get <p>Task retry policy</p> 
     * @return TaskRetryStrategy <p>Task retry policy</p>
     */
    public TaskRetryStrategy getTaskRetryStrategy() {
        return this.TaskRetryStrategy;
    }

    /**
     * Set <p>Task retry policy</p>
     * @param TaskRetryStrategy <p>Task retry policy</p>
     */
    public void setTaskRetryStrategy(TaskRetryStrategy TaskRetryStrategy) {
        this.TaskRetryStrategy = TaskRetryStrategy;
    }

    /**
     * Get <p>Task dependency run conditions</p><p>ALL_SUCCESS: All successful: All upstream dependency tasks have been executed and succeeded<br>ONE_SUCCESS: At least one successful: At least one upstream dependency task succeeded<br>NONE_FAILED: No failure currently: No dependency task failed, and at least one dependency task is running<br>ALL_DONE: All completed: All upstream dependency tasks have been executed and completed (regardless of success or failure)<br>ONE_FAILED: At least one failed: At least one upstream dependency task failed<br>ALL_FAILED: All failed: All upstream dependency tasks failed<br>ALL_DONE_AT_LEAST_ONE_SUCCESS: All upstream completed and at least one successful: When all upstream dependency tasks reach a final state, a dependency check is performed. If at least one succeeded, the dependency check passes; otherwise, the run is skipped<br>ALL_SKIPPED: All upstream completed, no skipped run: When all upstream dependency tasks reach a final state, a dependency check is performed. If all upstream states are successful, failed, or upstream failed state, the dependency check passes; otherwise, the run is skipped<br>ONE_DONE: At least one completed: Once at least one upstream task is completed, a dependency check is performed, and the dependency check passes; otherwise, it keeps waiting for upstream<br>ALL_DONE_NONE_FAILED_AT_LEAST_ONE_SUCCESS: All upstream completed, none failed, at least one successful: When all upstream dependency tasks reach a final state, a dependency check is performed. If no upstream task failed and at least one succeeded, the dependency check passes; otherwise, the run is skipped<br>NONE_SKIPPED: All upstream completed, no skipped run: When all upstream dependency tasks reach a final state, a dependency check is performed. If all upstream states are successful, failed, or upstream failed state, the dependency check passes; otherwise, the run is skipped<br>ALL_DONE_AT_LEAST_ONE_FAILED: All upstream completed and at least one failed: When all upstream dependency tasks reach a final state, a dependency check is performed. If at least one failed, the dependency check passes; otherwise, the run is skipped<br>ADVANCED: Configured when the run condition is in advanced mode</p> 
     * @return DependOnRunCondition <p>Task dependency run conditions</p><p>ALL_SUCCESS: All successful: All upstream dependency tasks have been executed and succeeded<br>ONE_SUCCESS: At least one successful: At least one upstream dependency task succeeded<br>NONE_FAILED: No failure currently: No dependency task failed, and at least one dependency task is running<br>ALL_DONE: All completed: All upstream dependency tasks have been executed and completed (regardless of success or failure)<br>ONE_FAILED: At least one failed: At least one upstream dependency task failed<br>ALL_FAILED: All failed: All upstream dependency tasks failed<br>ALL_DONE_AT_LEAST_ONE_SUCCESS: All upstream completed and at least one successful: When all upstream dependency tasks reach a final state, a dependency check is performed. If at least one succeeded, the dependency check passes; otherwise, the run is skipped<br>ALL_SKIPPED: All upstream completed, no skipped run: When all upstream dependency tasks reach a final state, a dependency check is performed. If all upstream states are successful, failed, or upstream failed state, the dependency check passes; otherwise, the run is skipped<br>ONE_DONE: At least one completed: Once at least one upstream task is completed, a dependency check is performed, and the dependency check passes; otherwise, it keeps waiting for upstream<br>ALL_DONE_NONE_FAILED_AT_LEAST_ONE_SUCCESS: All upstream completed, none failed, at least one successful: When all upstream dependency tasks reach a final state, a dependency check is performed. If no upstream task failed and at least one succeeded, the dependency check passes; otherwise, the run is skipped<br>NONE_SKIPPED: All upstream completed, no skipped run: When all upstream dependency tasks reach a final state, a dependency check is performed. If all upstream states are successful, failed, or upstream failed state, the dependency check passes; otherwise, the run is skipped<br>ALL_DONE_AT_LEAST_ONE_FAILED: All upstream completed and at least one failed: When all upstream dependency tasks reach a final state, a dependency check is performed. If at least one failed, the dependency check passes; otherwise, the run is skipped<br>ADVANCED: Configured when the run condition is in advanced mode</p>
     */
    public String getDependOnRunCondition() {
        return this.DependOnRunCondition;
    }

    /**
     * Set <p>Task dependency run conditions</p><p>ALL_SUCCESS: All successful: All upstream dependency tasks have been executed and succeeded<br>ONE_SUCCESS: At least one successful: At least one upstream dependency task succeeded<br>NONE_FAILED: No failure currently: No dependency task failed, and at least one dependency task is running<br>ALL_DONE: All completed: All upstream dependency tasks have been executed and completed (regardless of success or failure)<br>ONE_FAILED: At least one failed: At least one upstream dependency task failed<br>ALL_FAILED: All failed: All upstream dependency tasks failed<br>ALL_DONE_AT_LEAST_ONE_SUCCESS: All upstream completed and at least one successful: When all upstream dependency tasks reach a final state, a dependency check is performed. If at least one succeeded, the dependency check passes; otherwise, the run is skipped<br>ALL_SKIPPED: All upstream completed, no skipped run: When all upstream dependency tasks reach a final state, a dependency check is performed. If all upstream states are successful, failed, or upstream failed state, the dependency check passes; otherwise, the run is skipped<br>ONE_DONE: At least one completed: Once at least one upstream task is completed, a dependency check is performed, and the dependency check passes; otherwise, it keeps waiting for upstream<br>ALL_DONE_NONE_FAILED_AT_LEAST_ONE_SUCCESS: All upstream completed, none failed, at least one successful: When all upstream dependency tasks reach a final state, a dependency check is performed. If no upstream task failed and at least one succeeded, the dependency check passes; otherwise, the run is skipped<br>NONE_SKIPPED: All upstream completed, no skipped run: When all upstream dependency tasks reach a final state, a dependency check is performed. If all upstream states are successful, failed, or upstream failed state, the dependency check passes; otherwise, the run is skipped<br>ALL_DONE_AT_LEAST_ONE_FAILED: All upstream completed and at least one failed: When all upstream dependency tasks reach a final state, a dependency check is performed. If at least one failed, the dependency check passes; otherwise, the run is skipped<br>ADVANCED: Configured when the run condition is in advanced mode</p>
     * @param DependOnRunCondition <p>Task dependency run conditions</p><p>ALL_SUCCESS: All successful: All upstream dependency tasks have been executed and succeeded<br>ONE_SUCCESS: At least one successful: At least one upstream dependency task succeeded<br>NONE_FAILED: No failure currently: No dependency task failed, and at least one dependency task is running<br>ALL_DONE: All completed: All upstream dependency tasks have been executed and completed (regardless of success or failure)<br>ONE_FAILED: At least one failed: At least one upstream dependency task failed<br>ALL_FAILED: All failed: All upstream dependency tasks failed<br>ALL_DONE_AT_LEAST_ONE_SUCCESS: All upstream completed and at least one successful: When all upstream dependency tasks reach a final state, a dependency check is performed. If at least one succeeded, the dependency check passes; otherwise, the run is skipped<br>ALL_SKIPPED: All upstream completed, no skipped run: When all upstream dependency tasks reach a final state, a dependency check is performed. If all upstream states are successful, failed, or upstream failed state, the dependency check passes; otherwise, the run is skipped<br>ONE_DONE: At least one completed: Once at least one upstream task is completed, a dependency check is performed, and the dependency check passes; otherwise, it keeps waiting for upstream<br>ALL_DONE_NONE_FAILED_AT_LEAST_ONE_SUCCESS: All upstream completed, none failed, at least one successful: When all upstream dependency tasks reach a final state, a dependency check is performed. If no upstream task failed and at least one succeeded, the dependency check passes; otherwise, the run is skipped<br>NONE_SKIPPED: All upstream completed, no skipped run: When all upstream dependency tasks reach a final state, a dependency check is performed. If all upstream states are successful, failed, or upstream failed state, the dependency check passes; otherwise, the run is skipped<br>ALL_DONE_AT_LEAST_ONE_FAILED: All upstream completed and at least one failed: When all upstream dependency tasks reach a final state, a dependency check is performed. If at least one failed, the dependency check passes; otherwise, the run is skipped<br>ADVANCED: Configured when the run condition is in advanced mode</p>
     */
    public void setDependOnRunCondition(String DependOnRunCondition) {
        this.DependOnRunCondition = DependOnRunCondition;
    }

    /**
     * Get <p>Advanced dependency configuration</p> 
     * @return AdvancedDependencyConfig <p>Advanced dependency configuration</p>
     */
    public AdvancedDependencyConfig getAdvancedDependencyConfig() {
        return this.AdvancedDependencyConfig;
    }

    /**
     * Set <p>Advanced dependency configuration</p>
     * @param AdvancedDependencyConfig <p>Advanced dependency configuration</p>
     */
    public void setAdvancedDependencyConfig(AdvancedDependencyConfig AdvancedDependencyConfig) {
        this.AdvancedDependencyConfig = AdvancedDependencyConfig;
    }

    /**
     * Get <p>Built-in workflow task node</p> 
     * @return InnerTask <p>Built-in workflow task node</p>
     */
    public WorkflowTaskNodeBrief getInnerTask() {
        return this.InnerTask;
    }

    /**
     * Set <p>Built-in workflow task node</p>
     * @param InnerTask <p>Built-in workflow task node</p>
     */
    public void setInnerTask(WorkflowTaskNodeBrief InnerTask) {
        this.InnerTask = InnerTask;
    }

    public WorkflowTaskNodeBrief() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowTaskNodeBrief(WorkflowTaskNodeBrief source) {
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TaskTypeName != null) {
            this.TaskTypeName = new String(source.TaskTypeName);
        }
        if (source.DependOnList != null) {
            this.DependOnList = new DependOnBrief[source.DependOnList.length];
            for (int i = 0; i < source.DependOnList.length; i++) {
                this.DependOnList[i] = new DependOnBrief(source.DependOnList[i]);
            }
        }
        if (source.ResourceGroupId != null) {
            this.ResourceGroupId = new String(source.ResourceGroupId);
        }
        if (source.ResourceGroupName != null) {
            this.ResourceGroupName = new String(source.ResourceGroupName);
        }
        if (source.LeftCoordinate != null) {
            this.LeftCoordinate = new Float(source.LeftCoordinate);
        }
        if (source.TopCoordinate != null) {
            this.TopCoordinate = new Float(source.TopCoordinate);
        }
        if (source.TaskRetryStrategy != null) {
            this.TaskRetryStrategy = new TaskRetryStrategy(source.TaskRetryStrategy);
        }
        if (source.DependOnRunCondition != null) {
            this.DependOnRunCondition = new String(source.DependOnRunCondition);
        }
        if (source.AdvancedDependencyConfig != null) {
            this.AdvancedDependencyConfig = new AdvancedDependencyConfig(source.AdvancedDependencyConfig);
        }
        if (source.InnerTask != null) {
            this.InnerTask = new WorkflowTaskNodeBrief(source.InnerTask);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskTypeName", this.TaskTypeName);
        this.setParamArrayObj(map, prefix + "DependOnList.", this.DependOnList);
        this.setParamSimple(map, prefix + "ResourceGroupId", this.ResourceGroupId);
        this.setParamSimple(map, prefix + "ResourceGroupName", this.ResourceGroupName);
        this.setParamSimple(map, prefix + "LeftCoordinate", this.LeftCoordinate);
        this.setParamSimple(map, prefix + "TopCoordinate", this.TopCoordinate);
        this.setParamObj(map, prefix + "TaskRetryStrategy.", this.TaskRetryStrategy);
        this.setParamSimple(map, prefix + "DependOnRunCondition", this.DependOnRunCondition);
        this.setParamObj(map, prefix + "AdvancedDependencyConfig.", this.AdvancedDependencyConfig);
        this.setParamObj(map, prefix + "InnerTask.", this.InnerTask);

    }
}


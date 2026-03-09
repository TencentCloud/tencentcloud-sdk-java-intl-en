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

public class RerunTriggerWorkflowRunAsyncRequest extends AbstractModel {

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Workflow ID.
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * Running ID of the workflow.
    */
    @SerializedName("WorkflowExecutionId")
    @Expose
    private String WorkflowExecutionId;

    /**
    * Running mode: ordinary running defaults to all parameters: 1, advanced execution selectable task scope and running parameters: 2.
    */
    @SerializedName("ExecuteType")
    @Expose
    private String ExecuteType;

    /**
    * Custom running parameters filled in when the running type is advanced execution.
    */
    @SerializedName("AdvancedParams")
    @Expose
    private SchedulingParameter [] AdvancedParams;

    /**
    * Advanced execution in mode requires the specified task ID set this time.
    */
    @SerializedName("TaskIds")
    @Expose
    private String [] TaskIds;

    /**
    * Specify a scheduling resource group. uses the original scheduling resource group in the default configurations when left empty.
    */
    @SerializedName("SchedulingResourceGroup")
    @Expose
    private String SchedulingResourceGroup;

    /**
    * Specify the integration resource group. uses the original integration resource group in configurations by default when empty.
    */
    @SerializedName("IntegrationResourceGroup")
    @Expose
    private String IntegrationResourceGroup;

    /**
     * Get Project ID. 
     * @return ProjectId Project ID.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.
     * @param ProjectId Project ID.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Workflow ID. 
     * @return WorkflowId Workflow ID.
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set Workflow ID.
     * @param WorkflowId Workflow ID.
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get Running ID of the workflow. 
     * @return WorkflowExecutionId Running ID of the workflow.
     */
    public String getWorkflowExecutionId() {
        return this.WorkflowExecutionId;
    }

    /**
     * Set Running ID of the workflow.
     * @param WorkflowExecutionId Running ID of the workflow.
     */
    public void setWorkflowExecutionId(String WorkflowExecutionId) {
        this.WorkflowExecutionId = WorkflowExecutionId;
    }

    /**
     * Get Running mode: ordinary running defaults to all parameters: 1, advanced execution selectable task scope and running parameters: 2. 
     * @return ExecuteType Running mode: ordinary running defaults to all parameters: 1, advanced execution selectable task scope and running parameters: 2.
     */
    public String getExecuteType() {
        return this.ExecuteType;
    }

    /**
     * Set Running mode: ordinary running defaults to all parameters: 1, advanced execution selectable task scope and running parameters: 2.
     * @param ExecuteType Running mode: ordinary running defaults to all parameters: 1, advanced execution selectable task scope and running parameters: 2.
     */
    public void setExecuteType(String ExecuteType) {
        this.ExecuteType = ExecuteType;
    }

    /**
     * Get Custom running parameters filled in when the running type is advanced execution. 
     * @return AdvancedParams Custom running parameters filled in when the running type is advanced execution.
     */
    public SchedulingParameter [] getAdvancedParams() {
        return this.AdvancedParams;
    }

    /**
     * Set Custom running parameters filled in when the running type is advanced execution.
     * @param AdvancedParams Custom running parameters filled in when the running type is advanced execution.
     */
    public void setAdvancedParams(SchedulingParameter [] AdvancedParams) {
        this.AdvancedParams = AdvancedParams;
    }

    /**
     * Get Advanced execution in mode requires the specified task ID set this time. 
     * @return TaskIds Advanced execution in mode requires the specified task ID set this time.
     */
    public String [] getTaskIds() {
        return this.TaskIds;
    }

    /**
     * Set Advanced execution in mode requires the specified task ID set this time.
     * @param TaskIds Advanced execution in mode requires the specified task ID set this time.
     */
    public void setTaskIds(String [] TaskIds) {
        this.TaskIds = TaskIds;
    }

    /**
     * Get Specify a scheduling resource group. uses the original scheduling resource group in the default configurations when left empty. 
     * @return SchedulingResourceGroup Specify a scheduling resource group. uses the original scheduling resource group in the default configurations when left empty.
     */
    public String getSchedulingResourceGroup() {
        return this.SchedulingResourceGroup;
    }

    /**
     * Set Specify a scheduling resource group. uses the original scheduling resource group in the default configurations when left empty.
     * @param SchedulingResourceGroup Specify a scheduling resource group. uses the original scheduling resource group in the default configurations when left empty.
     */
    public void setSchedulingResourceGroup(String SchedulingResourceGroup) {
        this.SchedulingResourceGroup = SchedulingResourceGroup;
    }

    /**
     * Get Specify the integration resource group. uses the original integration resource group in configurations by default when empty. 
     * @return IntegrationResourceGroup Specify the integration resource group. uses the original integration resource group in configurations by default when empty.
     */
    public String getIntegrationResourceGroup() {
        return this.IntegrationResourceGroup;
    }

    /**
     * Set Specify the integration resource group. uses the original integration resource group in configurations by default when empty.
     * @param IntegrationResourceGroup Specify the integration resource group. uses the original integration resource group in configurations by default when empty.
     */
    public void setIntegrationResourceGroup(String IntegrationResourceGroup) {
        this.IntegrationResourceGroup = IntegrationResourceGroup;
    }

    public RerunTriggerWorkflowRunAsyncRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RerunTriggerWorkflowRunAsyncRequest(RerunTriggerWorkflowRunAsyncRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.WorkflowExecutionId != null) {
            this.WorkflowExecutionId = new String(source.WorkflowExecutionId);
        }
        if (source.ExecuteType != null) {
            this.ExecuteType = new String(source.ExecuteType);
        }
        if (source.AdvancedParams != null) {
            this.AdvancedParams = new SchedulingParameter[source.AdvancedParams.length];
            for (int i = 0; i < source.AdvancedParams.length; i++) {
                this.AdvancedParams[i] = new SchedulingParameter(source.AdvancedParams[i]);
            }
        }
        if (source.TaskIds != null) {
            this.TaskIds = new String[source.TaskIds.length];
            for (int i = 0; i < source.TaskIds.length; i++) {
                this.TaskIds[i] = new String(source.TaskIds[i]);
            }
        }
        if (source.SchedulingResourceGroup != null) {
            this.SchedulingResourceGroup = new String(source.SchedulingResourceGroup);
        }
        if (source.IntegrationResourceGroup != null) {
            this.IntegrationResourceGroup = new String(source.IntegrationResourceGroup);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "WorkflowExecutionId", this.WorkflowExecutionId);
        this.setParamSimple(map, prefix + "ExecuteType", this.ExecuteType);
        this.setParamArrayObj(map, prefix + "AdvancedParams.", this.AdvancedParams);
        this.setParamArraySimple(map, prefix + "TaskIds.", this.TaskIds);
        this.setParamSimple(map, prefix + "SchedulingResourceGroup", this.SchedulingResourceGroup);
        this.setParamSimple(map, prefix + "IntegrationResourceGroup", this.IntegrationResourceGroup);

    }
}


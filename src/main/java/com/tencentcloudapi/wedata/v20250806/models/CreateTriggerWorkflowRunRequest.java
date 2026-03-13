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

public class CreateTriggerWorkflowRunRequest extends AbstractModel {

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
    * Custom running parameters. if empty or null, use the latest configuration of the workflow.
    */
    @SerializedName("AdvancedParams")
    @Expose
    private SchedulingParameter [] AdvancedParams;

    /**
    * This time, run the specified task ID set. if it is null or empty, run all.
    */
    @SerializedName("TaskIds")
    @Expose
    private String [] TaskIds;

    /**
    * Specified scheduling resource group id. uses the original resource group by default if left empty.
    */
    @SerializedName("SchedulingResourceGroupId")
    @Expose
    private String SchedulingResourceGroupId;

    /**
    * Specified integration resource group id. uses the original resource group if left empty.
    */
    @SerializedName("IntegrationResourceGroupId")
    @Expose
    private String IntegrationResourceGroupId;

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
     * Get Custom running parameters. if empty or null, use the latest configuration of the workflow. 
     * @return AdvancedParams Custom running parameters. if empty or null, use the latest configuration of the workflow.
     */
    public SchedulingParameter [] getAdvancedParams() {
        return this.AdvancedParams;
    }

    /**
     * Set Custom running parameters. if empty or null, use the latest configuration of the workflow.
     * @param AdvancedParams Custom running parameters. if empty or null, use the latest configuration of the workflow.
     */
    public void setAdvancedParams(SchedulingParameter [] AdvancedParams) {
        this.AdvancedParams = AdvancedParams;
    }

    /**
     * Get This time, run the specified task ID set. if it is null or empty, run all. 
     * @return TaskIds This time, run the specified task ID set. if it is null or empty, run all.
     */
    public String [] getTaskIds() {
        return this.TaskIds;
    }

    /**
     * Set This time, run the specified task ID set. if it is null or empty, run all.
     * @param TaskIds This time, run the specified task ID set. if it is null or empty, run all.
     */
    public void setTaskIds(String [] TaskIds) {
        this.TaskIds = TaskIds;
    }

    /**
     * Get Specified scheduling resource group id. uses the original resource group by default if left empty. 
     * @return SchedulingResourceGroupId Specified scheduling resource group id. uses the original resource group by default if left empty.
     */
    public String getSchedulingResourceGroupId() {
        return this.SchedulingResourceGroupId;
    }

    /**
     * Set Specified scheduling resource group id. uses the original resource group by default if left empty.
     * @param SchedulingResourceGroupId Specified scheduling resource group id. uses the original resource group by default if left empty.
     */
    public void setSchedulingResourceGroupId(String SchedulingResourceGroupId) {
        this.SchedulingResourceGroupId = SchedulingResourceGroupId;
    }

    /**
     * Get Specified integration resource group id. uses the original resource group if left empty. 
     * @return IntegrationResourceGroupId Specified integration resource group id. uses the original resource group if left empty.
     */
    public String getIntegrationResourceGroupId() {
        return this.IntegrationResourceGroupId;
    }

    /**
     * Set Specified integration resource group id. uses the original resource group if left empty.
     * @param IntegrationResourceGroupId Specified integration resource group id. uses the original resource group if left empty.
     */
    public void setIntegrationResourceGroupId(String IntegrationResourceGroupId) {
        this.IntegrationResourceGroupId = IntegrationResourceGroupId;
    }

    public CreateTriggerWorkflowRunRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTriggerWorkflowRunRequest(CreateTriggerWorkflowRunRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
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
        if (source.SchedulingResourceGroupId != null) {
            this.SchedulingResourceGroupId = new String(source.SchedulingResourceGroupId);
        }
        if (source.IntegrationResourceGroupId != null) {
            this.IntegrationResourceGroupId = new String(source.IntegrationResourceGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamArrayObj(map, prefix + "AdvancedParams.", this.AdvancedParams);
        this.setParamArraySimple(map, prefix + "TaskIds.", this.TaskIds);
        this.setParamSimple(map, prefix + "SchedulingResourceGroupId", this.SchedulingResourceGroupId);
        this.setParamSimple(map, prefix + "IntegrationResourceGroupId", this.IntegrationResourceGroupId);

    }
}


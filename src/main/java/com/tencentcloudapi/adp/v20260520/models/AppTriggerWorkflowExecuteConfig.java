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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppTriggerWorkflowExecuteConfig extends AbstractModel {

    /**
    * <p>Workflow API parameter binding</p>
    */
    @SerializedName("ParamBindingsApi")
    @Expose
    private AppTriggerParamBindingConfig ParamBindingsApi;

    /**
    * <p>Workflow parameter binding</p>
    */
    @SerializedName("ParamBindingsWorkflow")
    @Expose
    private AppTriggerParamBindingConfig ParamBindingsWorkflow;

    /**
    * <p>Workflow ID</p>
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * <p>Workflow name</p>
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
     * Get <p>Workflow API parameter binding</p> 
     * @return ParamBindingsApi <p>Workflow API parameter binding</p>
     */
    public AppTriggerParamBindingConfig getParamBindingsApi() {
        return this.ParamBindingsApi;
    }

    /**
     * Set <p>Workflow API parameter binding</p>
     * @param ParamBindingsApi <p>Workflow API parameter binding</p>
     */
    public void setParamBindingsApi(AppTriggerParamBindingConfig ParamBindingsApi) {
        this.ParamBindingsApi = ParamBindingsApi;
    }

    /**
     * Get <p>Workflow parameter binding</p> 
     * @return ParamBindingsWorkflow <p>Workflow parameter binding</p>
     */
    public AppTriggerParamBindingConfig getParamBindingsWorkflow() {
        return this.ParamBindingsWorkflow;
    }

    /**
     * Set <p>Workflow parameter binding</p>
     * @param ParamBindingsWorkflow <p>Workflow parameter binding</p>
     */
    public void setParamBindingsWorkflow(AppTriggerParamBindingConfig ParamBindingsWorkflow) {
        this.ParamBindingsWorkflow = ParamBindingsWorkflow;
    }

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
     * Get <p>Workflow name</p> 
     * @return WorkflowName <p>Workflow name</p>
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set <p>Workflow name</p>
     * @param WorkflowName <p>Workflow name</p>
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    public AppTriggerWorkflowExecuteConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppTriggerWorkflowExecuteConfig(AppTriggerWorkflowExecuteConfig source) {
        if (source.ParamBindingsApi != null) {
            this.ParamBindingsApi = new AppTriggerParamBindingConfig(source.ParamBindingsApi);
        }
        if (source.ParamBindingsWorkflow != null) {
            this.ParamBindingsWorkflow = new AppTriggerParamBindingConfig(source.ParamBindingsWorkflow);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ParamBindingsApi.", this.ParamBindingsApi);
        this.setParamObj(map, prefix + "ParamBindingsWorkflow.", this.ParamBindingsWorkflow);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);

    }
}


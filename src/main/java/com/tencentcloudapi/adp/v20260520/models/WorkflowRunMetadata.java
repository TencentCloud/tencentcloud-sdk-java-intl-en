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

public class WorkflowRunMetadata extends AbstractModel {

    /**
    * User input.
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * Name of the main model
    */
    @SerializedName("MainModelName")
    @Expose
    private String MainModelName;

    /**
    * API parameter configuration
    */
    @SerializedName("CustomVariableList")
    @Expose
    private CustomVariable [] CustomVariableList;

    /**
    * Flowchart of the workflow
    */
    @SerializedName("WorkflowGraph")
    @Expose
    private String WorkflowGraph;

    /**
     * Get User input. 
     * @return Query User input.
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set User input.
     * @param Query User input.
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get Name of the main model 
     * @return MainModelName Name of the main model
     */
    public String getMainModelName() {
        return this.MainModelName;
    }

    /**
     * Set Name of the main model
     * @param MainModelName Name of the main model
     */
    public void setMainModelName(String MainModelName) {
        this.MainModelName = MainModelName;
    }

    /**
     * Get API parameter configuration 
     * @return CustomVariableList API parameter configuration
     */
    public CustomVariable [] getCustomVariableList() {
        return this.CustomVariableList;
    }

    /**
     * Set API parameter configuration
     * @param CustomVariableList API parameter configuration
     */
    public void setCustomVariableList(CustomVariable [] CustomVariableList) {
        this.CustomVariableList = CustomVariableList;
    }

    /**
     * Get Flowchart of the workflow 
     * @return WorkflowGraph Flowchart of the workflow
     */
    public String getWorkflowGraph() {
        return this.WorkflowGraph;
    }

    /**
     * Set Flowchart of the workflow
     * @param WorkflowGraph Flowchart of the workflow
     */
    public void setWorkflowGraph(String WorkflowGraph) {
        this.WorkflowGraph = WorkflowGraph;
    }

    public WorkflowRunMetadata() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowRunMetadata(WorkflowRunMetadata source) {
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.MainModelName != null) {
            this.MainModelName = new String(source.MainModelName);
        }
        if (source.CustomVariableList != null) {
            this.CustomVariableList = new CustomVariable[source.CustomVariableList.length];
            for (int i = 0; i < source.CustomVariableList.length; i++) {
                this.CustomVariableList[i] = new CustomVariable(source.CustomVariableList[i]);
            }
        }
        if (source.WorkflowGraph != null) {
            this.WorkflowGraph = new String(source.WorkflowGraph);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "MainModelName", this.MainModelName);
        this.setParamArrayObj(map, prefix + "CustomVariableList.", this.CustomVariableList);
        this.setParamSimple(map, prefix + "WorkflowGraph", this.WorkflowGraph);

    }
}


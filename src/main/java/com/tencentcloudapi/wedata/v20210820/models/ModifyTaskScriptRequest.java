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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyTaskScriptRequest extends AbstractModel {

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Task ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Script content Base64 encoded
    */
    @SerializedName("ScriptContent")
    @Expose
    private String ScriptContent;

    /**
    * Integrated Task Script Configuration
    */
    @SerializedName("IntegrationNodeDetails")
    @Expose
    private IntegrationNodeDetail [] IntegrationNodeDetails;

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
     * Get Task ID 
     * @return TaskId Task ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID
     * @param TaskId Task ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Script content Base64 encoded 
     * @return ScriptContent Script content Base64 encoded
     */
    public String getScriptContent() {
        return this.ScriptContent;
    }

    /**
     * Set Script content Base64 encoded
     * @param ScriptContent Script content Base64 encoded
     */
    public void setScriptContent(String ScriptContent) {
        this.ScriptContent = ScriptContent;
    }

    /**
     * Get Integrated Task Script Configuration 
     * @return IntegrationNodeDetails Integrated Task Script Configuration
     */
    public IntegrationNodeDetail [] getIntegrationNodeDetails() {
        return this.IntegrationNodeDetails;
    }

    /**
     * Set Integrated Task Script Configuration
     * @param IntegrationNodeDetails Integrated Task Script Configuration
     */
    public void setIntegrationNodeDetails(IntegrationNodeDetail [] IntegrationNodeDetails) {
        this.IntegrationNodeDetails = IntegrationNodeDetails;
    }

    public ModifyTaskScriptRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTaskScriptRequest(ModifyTaskScriptRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.ScriptContent != null) {
            this.ScriptContent = new String(source.ScriptContent);
        }
        if (source.IntegrationNodeDetails != null) {
            this.IntegrationNodeDetails = new IntegrationNodeDetail[source.IntegrationNodeDetails.length];
            for (int i = 0; i < source.IntegrationNodeDetails.length; i++) {
                this.IntegrationNodeDetails[i] = new IntegrationNodeDetail(source.IntegrationNodeDetails[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "ScriptContent", this.ScriptContent);
        this.setParamArrayObj(map, prefix + "IntegrationNodeDetails.", this.IntegrationNodeDetails);

    }
}


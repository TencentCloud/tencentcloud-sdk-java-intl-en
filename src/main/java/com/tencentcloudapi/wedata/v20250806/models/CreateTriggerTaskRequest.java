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

public class CreateTriggerTaskRequest extends AbstractModel {

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Task basic attributes.
    */
    @SerializedName("TriggerTaskBaseAttribute")
    @Expose
    private CreateTriggerTaskBaseAttribute TriggerTaskBaseAttribute;

    /**
    * Task configurations.
    */
    @SerializedName("TriggerTaskConfiguration")
    @Expose
    private CreateTriggerTaskConfiguration TriggerTaskConfiguration;

    /**
    * Task scheduling configuration.
    */
    @SerializedName("TriggerTaskSchedulerConfiguration")
    @Expose
    private CreateTriggerTaskSchedulerConfiguration TriggerTaskSchedulerConfiguration;

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
     * Get Task basic attributes. 
     * @return TriggerTaskBaseAttribute Task basic attributes.
     */
    public CreateTriggerTaskBaseAttribute getTriggerTaskBaseAttribute() {
        return this.TriggerTaskBaseAttribute;
    }

    /**
     * Set Task basic attributes.
     * @param TriggerTaskBaseAttribute Task basic attributes.
     */
    public void setTriggerTaskBaseAttribute(CreateTriggerTaskBaseAttribute TriggerTaskBaseAttribute) {
        this.TriggerTaskBaseAttribute = TriggerTaskBaseAttribute;
    }

    /**
     * Get Task configurations. 
     * @return TriggerTaskConfiguration Task configurations.
     */
    public CreateTriggerTaskConfiguration getTriggerTaskConfiguration() {
        return this.TriggerTaskConfiguration;
    }

    /**
     * Set Task configurations.
     * @param TriggerTaskConfiguration Task configurations.
     */
    public void setTriggerTaskConfiguration(CreateTriggerTaskConfiguration TriggerTaskConfiguration) {
        this.TriggerTaskConfiguration = TriggerTaskConfiguration;
    }

    /**
     * Get Task scheduling configuration. 
     * @return TriggerTaskSchedulerConfiguration Task scheduling configuration.
     */
    public CreateTriggerTaskSchedulerConfiguration getTriggerTaskSchedulerConfiguration() {
        return this.TriggerTaskSchedulerConfiguration;
    }

    /**
     * Set Task scheduling configuration.
     * @param TriggerTaskSchedulerConfiguration Task scheduling configuration.
     */
    public void setTriggerTaskSchedulerConfiguration(CreateTriggerTaskSchedulerConfiguration TriggerTaskSchedulerConfiguration) {
        this.TriggerTaskSchedulerConfiguration = TriggerTaskSchedulerConfiguration;
    }

    public CreateTriggerTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTriggerTaskRequest(CreateTriggerTaskRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TriggerTaskBaseAttribute != null) {
            this.TriggerTaskBaseAttribute = new CreateTriggerTaskBaseAttribute(source.TriggerTaskBaseAttribute);
        }
        if (source.TriggerTaskConfiguration != null) {
            this.TriggerTaskConfiguration = new CreateTriggerTaskConfiguration(source.TriggerTaskConfiguration);
        }
        if (source.TriggerTaskSchedulerConfiguration != null) {
            this.TriggerTaskSchedulerConfiguration = new CreateTriggerTaskSchedulerConfiguration(source.TriggerTaskSchedulerConfiguration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamObj(map, prefix + "TriggerTaskBaseAttribute.", this.TriggerTaskBaseAttribute);
        this.setParamObj(map, prefix + "TriggerTaskConfiguration.", this.TriggerTaskConfiguration);
        this.setParamObj(map, prefix + "TriggerTaskSchedulerConfiguration.", this.TriggerTaskSchedulerConfiguration);

    }
}


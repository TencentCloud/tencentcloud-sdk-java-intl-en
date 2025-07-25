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

public class SubmitTaskRequest extends AbstractModel {

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
    * Version Notes
    */
    @SerializedName("VersionRemark")
    @Expose
    private String VersionRemark;

    /**
    * Whether to Enable Scheduling
    */
    @SerializedName("StartScheduling")
    @Expose
    private Boolean StartScheduling;

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
     * Get Version Notes 
     * @return VersionRemark Version Notes
     */
    public String getVersionRemark() {
        return this.VersionRemark;
    }

    /**
     * Set Version Notes
     * @param VersionRemark Version Notes
     */
    public void setVersionRemark(String VersionRemark) {
        this.VersionRemark = VersionRemark;
    }

    /**
     * Get Whether to Enable Scheduling 
     * @return StartScheduling Whether to Enable Scheduling
     */
    public Boolean getStartScheduling() {
        return this.StartScheduling;
    }

    /**
     * Set Whether to Enable Scheduling
     * @param StartScheduling Whether to Enable Scheduling
     */
    public void setStartScheduling(Boolean StartScheduling) {
        this.StartScheduling = StartScheduling;
    }

    public SubmitTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitTaskRequest(SubmitTaskRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.VersionRemark != null) {
            this.VersionRemark = new String(source.VersionRemark);
        }
        if (source.StartScheduling != null) {
            this.StartScheduling = new Boolean(source.StartScheduling);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "VersionRemark", this.VersionRemark);
        this.setParamSimple(map, prefix + "StartScheduling", this.StartScheduling);

    }
}


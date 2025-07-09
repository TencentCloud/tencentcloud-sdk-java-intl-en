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

public class BatchRunOpsTaskRequest extends AbstractModel {

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Whether to Supplement Intermediate Instances, 0 for not supplementing; 1 for supplementing
    */
    @SerializedName("EnableMakeUp")
    @Expose
    private Long EnableMakeUp;

    /**
    * Task ID list
    */
    @SerializedName("Tasks")
    @Expose
    private String [] Tasks;

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
     * Get Whether to Supplement Intermediate Instances, 0 for not supplementing; 1 for supplementing 
     * @return EnableMakeUp Whether to Supplement Intermediate Instances, 0 for not supplementing; 1 for supplementing
     */
    public Long getEnableMakeUp() {
        return this.EnableMakeUp;
    }

    /**
     * Set Whether to Supplement Intermediate Instances, 0 for not supplementing; 1 for supplementing
     * @param EnableMakeUp Whether to Supplement Intermediate Instances, 0 for not supplementing; 1 for supplementing
     */
    public void setEnableMakeUp(Long EnableMakeUp) {
        this.EnableMakeUp = EnableMakeUp;
    }

    /**
     * Get Task ID list 
     * @return Tasks Task ID list
     */
    public String [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set Task ID list
     * @param Tasks Task ID list
     */
    public void setTasks(String [] Tasks) {
        this.Tasks = Tasks;
    }

    public BatchRunOpsTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchRunOpsTaskRequest(BatchRunOpsTaskRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.EnableMakeUp != null) {
            this.EnableMakeUp = new Long(source.EnableMakeUp);
        }
        if (source.Tasks != null) {
            this.Tasks = new String[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new String(source.Tasks[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "EnableMakeUp", this.EnableMakeUp);
        this.setParamArraySimple(map, prefix + "Tasks.", this.Tasks);

    }
}


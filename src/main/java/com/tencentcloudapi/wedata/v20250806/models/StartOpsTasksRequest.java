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

public class StartOpsTasksRequest extends AbstractModel {

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Task Id list.
    */
    @SerializedName("TaskIds")
    @Expose
    private String [] TaskIds;

    /**
    * Whether to supplement intermediate instances from the last pause to the current time at startup. default false indicates no supplement.
    */
    @SerializedName("EnableDataBackfill")
    @Expose
    private Boolean EnableDataBackfill;

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
     * Get Task Id list. 
     * @return TaskIds Task Id list.
     */
    public String [] getTaskIds() {
        return this.TaskIds;
    }

    /**
     * Set Task Id list.
     * @param TaskIds Task Id list.
     */
    public void setTaskIds(String [] TaskIds) {
        this.TaskIds = TaskIds;
    }

    /**
     * Get Whether to supplement intermediate instances from the last pause to the current time at startup. default false indicates no supplement. 
     * @return EnableDataBackfill Whether to supplement intermediate instances from the last pause to the current time at startup. default false indicates no supplement.
     */
    public Boolean getEnableDataBackfill() {
        return this.EnableDataBackfill;
    }

    /**
     * Set Whether to supplement intermediate instances from the last pause to the current time at startup. default false indicates no supplement.
     * @param EnableDataBackfill Whether to supplement intermediate instances from the last pause to the current time at startup. default false indicates no supplement.
     */
    public void setEnableDataBackfill(Boolean EnableDataBackfill) {
        this.EnableDataBackfill = EnableDataBackfill;
    }

    public StartOpsTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StartOpsTasksRequest(StartOpsTasksRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TaskIds != null) {
            this.TaskIds = new String[source.TaskIds.length];
            for (int i = 0; i < source.TaskIds.length; i++) {
                this.TaskIds[i] = new String(source.TaskIds[i]);
            }
        }
        if (source.EnableDataBackfill != null) {
            this.EnableDataBackfill = new Boolean(source.EnableDataBackfill);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "TaskIds.", this.TaskIds);
        this.setParamSimple(map, prefix + "EnableDataBackfill", this.EnableDataBackfill);

    }
}


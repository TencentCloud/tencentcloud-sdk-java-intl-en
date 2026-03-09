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

public class MonitorWhiteTask extends AbstractModel {

    /**
    * Configure the allowlist corresponding to the workflow/project id.
    */
    @SerializedName("MonitorObjectId")
    @Expose
    private String MonitorObjectId;

    /**
    * Allowlist task list.
    */
    @SerializedName("TaskIds")
    @Expose
    private String [] TaskIds;

    /**
     * Get Configure the allowlist corresponding to the workflow/project id. 
     * @return MonitorObjectId Configure the allowlist corresponding to the workflow/project id.
     */
    public String getMonitorObjectId() {
        return this.MonitorObjectId;
    }

    /**
     * Set Configure the allowlist corresponding to the workflow/project id.
     * @param MonitorObjectId Configure the allowlist corresponding to the workflow/project id.
     */
    public void setMonitorObjectId(String MonitorObjectId) {
        this.MonitorObjectId = MonitorObjectId;
    }

    /**
     * Get Allowlist task list. 
     * @return TaskIds Allowlist task list.
     */
    public String [] getTaskIds() {
        return this.TaskIds;
    }

    /**
     * Set Allowlist task list.
     * @param TaskIds Allowlist task list.
     */
    public void setTaskIds(String [] TaskIds) {
        this.TaskIds = TaskIds;
    }

    public MonitorWhiteTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MonitorWhiteTask(MonitorWhiteTask source) {
        if (source.MonitorObjectId != null) {
            this.MonitorObjectId = new String(source.MonitorObjectId);
        }
        if (source.TaskIds != null) {
            this.TaskIds = new String[source.TaskIds.length];
            for (int i = 0; i < source.TaskIds.length; i++) {
                this.TaskIds[i] = new String(source.TaskIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MonitorObjectId", this.MonitorObjectId);
        this.setParamArraySimple(map, prefix + "TaskIds.", this.TaskIds);

    }
}


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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskRunConditionRule extends AbstractModel {

    /**
    * <p>Upstream task ID</p>
    */
    @SerializedName("UpstreamTaskId")
    @Expose
    private String UpstreamTaskId;

    /**
    * <p>Upstream task name</p>
    */
    @SerializedName("UpstreamTaskName")
    @Expose
    private String UpstreamTaskName;

    /**
    * <p>Task run conditions<br>Supported status values: - SUCCESS: successful - FAILED: failed - UPSTREAM_FAILED: upstream failed - EXCLUDED: excluded from running</p>
    */
    @SerializedName("AllowedStates")
    @Expose
    private String [] AllowedStates;

    /**
     * Get <p>Upstream task ID</p> 
     * @return UpstreamTaskId <p>Upstream task ID</p>
     */
    public String getUpstreamTaskId() {
        return this.UpstreamTaskId;
    }

    /**
     * Set <p>Upstream task ID</p>
     * @param UpstreamTaskId <p>Upstream task ID</p>
     */
    public void setUpstreamTaskId(String UpstreamTaskId) {
        this.UpstreamTaskId = UpstreamTaskId;
    }

    /**
     * Get <p>Upstream task name</p> 
     * @return UpstreamTaskName <p>Upstream task name</p>
     */
    public String getUpstreamTaskName() {
        return this.UpstreamTaskName;
    }

    /**
     * Set <p>Upstream task name</p>
     * @param UpstreamTaskName <p>Upstream task name</p>
     */
    public void setUpstreamTaskName(String UpstreamTaskName) {
        this.UpstreamTaskName = UpstreamTaskName;
    }

    /**
     * Get <p>Task run conditions<br>Supported status values: - SUCCESS: successful - FAILED: failed - UPSTREAM_FAILED: upstream failed - EXCLUDED: excluded from running</p> 
     * @return AllowedStates <p>Task run conditions<br>Supported status values: - SUCCESS: successful - FAILED: failed - UPSTREAM_FAILED: upstream failed - EXCLUDED: excluded from running</p>
     */
    public String [] getAllowedStates() {
        return this.AllowedStates;
    }

    /**
     * Set <p>Task run conditions<br>Supported status values: - SUCCESS: successful - FAILED: failed - UPSTREAM_FAILED: upstream failed - EXCLUDED: excluded from running</p>
     * @param AllowedStates <p>Task run conditions<br>Supported status values: - SUCCESS: successful - FAILED: failed - UPSTREAM_FAILED: upstream failed - EXCLUDED: excluded from running</p>
     */
    public void setAllowedStates(String [] AllowedStates) {
        this.AllowedStates = AllowedStates;
    }

    public TaskRunConditionRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskRunConditionRule(TaskRunConditionRule source) {
        if (source.UpstreamTaskId != null) {
            this.UpstreamTaskId = new String(source.UpstreamTaskId);
        }
        if (source.UpstreamTaskName != null) {
            this.UpstreamTaskName = new String(source.UpstreamTaskName);
        }
        if (source.AllowedStates != null) {
            this.AllowedStates = new String[source.AllowedStates.length];
            for (int i = 0; i < source.AllowedStates.length; i++) {
                this.AllowedStates[i] = new String(source.AllowedStates[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UpstreamTaskId", this.UpstreamTaskId);
        this.setParamSimple(map, prefix + "UpstreamTaskName", this.UpstreamTaskName);
        this.setParamArraySimple(map, prefix + "AllowedStates.", this.AllowedStates);

    }
}


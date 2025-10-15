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

public class InstanceExecutionPhase extends AbstractModel {

    /**
    * Start time of the state.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * **Instance lifecycle phase status**.

-WAIT_UPSTREAM indicates the wait event/upstream status.
-WAIT_RUN indicates the waiting for running status.
-RUNNING indicates the running state.
-COMPLETE indicates the final state of completion.
- FAILED indicates the final state - retry on failure.
-EXPIRED indicates the final state - failure.
-SKIP_RUNNING indicates the branch skipped by the upstream branch node in the final state.
-HISTORY indicates compatibility with historical instances before 2024-03-30. no need to pay attention to this enum afterward.
    */
    @SerializedName("DetailState")
    @Expose
    private String DetailState;

    /**
    * End time of the state.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get Start time of the state. 
     * @return StartTime Start time of the state.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time of the state.
     * @param StartTime Start time of the state.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get **Instance lifecycle phase status**.

-WAIT_UPSTREAM indicates the wait event/upstream status.
-WAIT_RUN indicates the waiting for running status.
-RUNNING indicates the running state.
-COMPLETE indicates the final state of completion.
- FAILED indicates the final state - retry on failure.
-EXPIRED indicates the final state - failure.
-SKIP_RUNNING indicates the branch skipped by the upstream branch node in the final state.
-HISTORY indicates compatibility with historical instances before 2024-03-30. no need to pay attention to this enum afterward. 
     * @return DetailState **Instance lifecycle phase status**.

-WAIT_UPSTREAM indicates the wait event/upstream status.
-WAIT_RUN indicates the waiting for running status.
-RUNNING indicates the running state.
-COMPLETE indicates the final state of completion.
- FAILED indicates the final state - retry on failure.
-EXPIRED indicates the final state - failure.
-SKIP_RUNNING indicates the branch skipped by the upstream branch node in the final state.
-HISTORY indicates compatibility with historical instances before 2024-03-30. no need to pay attention to this enum afterward.
     */
    public String getDetailState() {
        return this.DetailState;
    }

    /**
     * Set **Instance lifecycle phase status**.

-WAIT_UPSTREAM indicates the wait event/upstream status.
-WAIT_RUN indicates the waiting for running status.
-RUNNING indicates the running state.
-COMPLETE indicates the final state of completion.
- FAILED indicates the final state - retry on failure.
-EXPIRED indicates the final state - failure.
-SKIP_RUNNING indicates the branch skipped by the upstream branch node in the final state.
-HISTORY indicates compatibility with historical instances before 2024-03-30. no need to pay attention to this enum afterward.
     * @param DetailState **Instance lifecycle phase status**.

-WAIT_UPSTREAM indicates the wait event/upstream status.
-WAIT_RUN indicates the waiting for running status.
-RUNNING indicates the running state.
-COMPLETE indicates the final state of completion.
- FAILED indicates the final state - retry on failure.
-EXPIRED indicates the final state - failure.
-SKIP_RUNNING indicates the branch skipped by the upstream branch node in the final state.
-HISTORY indicates compatibility with historical instances before 2024-03-30. no need to pay attention to this enum afterward.
     */
    public void setDetailState(String DetailState) {
        this.DetailState = DetailState;
    }

    /**
     * Get End time of the state. 
     * @return EndTime End time of the state.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time of the state.
     * @param EndTime End time of the state.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public InstanceExecutionPhase() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceExecutionPhase(InstanceExecutionPhase source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.DetailState != null) {
            this.DetailState = new String(source.DetailState);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "DetailState", this.DetailState);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}


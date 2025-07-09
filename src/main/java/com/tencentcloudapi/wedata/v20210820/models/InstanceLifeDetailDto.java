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

public class InstanceLifeDetailDto extends AbstractModel {

    /**
    * Indicates the status of an instance.
-[0] Indicates waiting for event.
-[12] indicates waiting for upstream.
-[6, 7, 9, 10, 18] indicates awaiting execution.
-[1, 19, 22]  indicate running.
-[21] skip running.
-[3] indicates retry on failure.
-[8, 4, 5, 13] indicates a failure.
-[2] indicates a success.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * Start Time of the State
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Instance lifecycle phase status.

-WAIT_UPSTREAM indicates waiting for an event or upstream status.
-WAIT_RUN indicates waiting for running status.
-RUNNING indicates the running state.
-COMPLETE indicates terminal state - completed.
-FAILED indicates terminal state - retry after failure.
-EXPIRED indicates terminal state - failure.
-SKIP_RUNNING indicates terminal state - a branch skipped by the upstream branch node.
-HISTORY indicates compatibility with historical instances before march 30, 2024. no need to pay attention to this enumeration type for instances afterward.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DetailState")
    @Expose
    private String DetailState;

    /**
    * End Time of the State
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get Indicates the status of an instance.
-[0] Indicates waiting for event.
-[12] indicates waiting for upstream.
-[6, 7, 9, 10, 18] indicates awaiting execution.
-[1, 19, 22]  indicate running.
-[21] skip running.
-[3] indicates retry on failure.
-[8, 4, 5, 13] indicates a failure.
-[2] indicates a success.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return State Indicates the status of an instance.
-[0] Indicates waiting for event.
-[12] indicates waiting for upstream.
-[6, 7, 9, 10, 18] indicates awaiting execution.
-[1, 19, 22]  indicate running.
-[21] skip running.
-[3] indicates retry on failure.
-[8, 4, 5, 13] indicates a failure.
-[2] indicates a success.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Indicates the status of an instance.
-[0] Indicates waiting for event.
-[12] indicates waiting for upstream.
-[6, 7, 9, 10, 18] indicates awaiting execution.
-[1, 19, 22]  indicate running.
-[21] skip running.
-[3] indicates retry on failure.
-[8, 4, 5, 13] indicates a failure.
-[2] indicates a success.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param State Indicates the status of an instance.
-[0] Indicates waiting for event.
-[12] indicates waiting for upstream.
-[6, 7, 9, 10, 18] indicates awaiting execution.
-[1, 19, 22]  indicate running.
-[21] skip running.
-[3] indicates retry on failure.
-[8, 4, 5, 13] indicates a failure.
-[2] indicates a success.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get Start Time of the State
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return StartTime Start Time of the State
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start Time of the State
Note: This field may return null, indicating that no valid value can be obtained.
     * @param StartTime Start Time of the State
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Instance lifecycle phase status.

-WAIT_UPSTREAM indicates waiting for an event or upstream status.
-WAIT_RUN indicates waiting for running status.
-RUNNING indicates the running state.
-COMPLETE indicates terminal state - completed.
-FAILED indicates terminal state - retry after failure.
-EXPIRED indicates terminal state - failure.
-SKIP_RUNNING indicates terminal state - a branch skipped by the upstream branch node.
-HISTORY indicates compatibility with historical instances before march 30, 2024. no need to pay attention to this enumeration type for instances afterward.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DetailState Instance lifecycle phase status.

-WAIT_UPSTREAM indicates waiting for an event or upstream status.
-WAIT_RUN indicates waiting for running status.
-RUNNING indicates the running state.
-COMPLETE indicates terminal state - completed.
-FAILED indicates terminal state - retry after failure.
-EXPIRED indicates terminal state - failure.
-SKIP_RUNNING indicates terminal state - a branch skipped by the upstream branch node.
-HISTORY indicates compatibility with historical instances before march 30, 2024. no need to pay attention to this enumeration type for instances afterward.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDetailState() {
        return this.DetailState;
    }

    /**
     * Set Instance lifecycle phase status.

-WAIT_UPSTREAM indicates waiting for an event or upstream status.
-WAIT_RUN indicates waiting for running status.
-RUNNING indicates the running state.
-COMPLETE indicates terminal state - completed.
-FAILED indicates terminal state - retry after failure.
-EXPIRED indicates terminal state - failure.
-SKIP_RUNNING indicates terminal state - a branch skipped by the upstream branch node.
-HISTORY indicates compatibility with historical instances before march 30, 2024. no need to pay attention to this enumeration type for instances afterward.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DetailState Instance lifecycle phase status.

-WAIT_UPSTREAM indicates waiting for an event or upstream status.
-WAIT_RUN indicates waiting for running status.
-RUNNING indicates the running state.
-COMPLETE indicates terminal state - completed.
-FAILED indicates terminal state - retry after failure.
-EXPIRED indicates terminal state - failure.
-SKIP_RUNNING indicates terminal state - a branch skipped by the upstream branch node.
-HISTORY indicates compatibility with historical instances before march 30, 2024. no need to pay attention to this enumeration type for instances afterward.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDetailState(String DetailState) {
        this.DetailState = DetailState;
    }

    /**
     * Get End Time of the State
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return EndTime End Time of the State
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End Time of the State
Note: This field may return null, indicating that no valid value can be obtained.
     * @param EndTime End Time of the State
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public InstanceLifeDetailDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceLifeDetailDto(InstanceLifeDetailDto source) {
        if (source.State != null) {
            this.State = new String(source.State);
        }
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
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "DetailState", this.DetailState);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}


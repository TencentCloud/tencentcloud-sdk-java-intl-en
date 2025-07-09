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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RollbackTask extends AbstractModel {

    /**
    * Task execution information.
    */
    @SerializedName("Info")
    @Expose
    private String Info;

    /**
    * Task execution result. Valid values: INITIAL: initializing, RUNNING: running, SUCCESS: succeeded, FAILED: failed, KILLED: terminated, REMOVED: deleted, PAUSED: paused.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Task execution progress. Value range: [0,100].
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * Task start time.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Task end time.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Rollback task details.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Detail")
    @Expose
    private RollbackInstancesInfo [] Detail;

    /**
     * Get Task execution information. 
     * @return Info Task execution information.
     */
    public String getInfo() {
        return this.Info;
    }

    /**
     * Set Task execution information.
     * @param Info Task execution information.
     */
    public void setInfo(String Info) {
        this.Info = Info;
    }

    /**
     * Get Task execution result. Valid values: INITIAL: initializing, RUNNING: running, SUCCESS: succeeded, FAILED: failed, KILLED: terminated, REMOVED: deleted, PAUSED: paused. 
     * @return Status Task execution result. Valid values: INITIAL: initializing, RUNNING: running, SUCCESS: succeeded, FAILED: failed, KILLED: terminated, REMOVED: deleted, PAUSED: paused.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task execution result. Valid values: INITIAL: initializing, RUNNING: running, SUCCESS: succeeded, FAILED: failed, KILLED: terminated, REMOVED: deleted, PAUSED: paused.
     * @param Status Task execution result. Valid values: INITIAL: initializing, RUNNING: running, SUCCESS: succeeded, FAILED: failed, KILLED: terminated, REMOVED: deleted, PAUSED: paused.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Task execution progress. Value range: [0,100]. 
     * @return Progress Task execution progress. Value range: [0,100].
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set Task execution progress. Value range: [0,100].
     * @param Progress Task execution progress. Value range: [0,100].
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get Task start time. 
     * @return StartTime Task start time.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Task start time.
     * @param StartTime Task start time.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Task end time. 
     * @return EndTime Task end time.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Task end time.
     * @param EndTime Task end time.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Rollback task details.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Detail Rollback task details.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public RollbackInstancesInfo [] getDetail() {
        return this.Detail;
    }

    /**
     * Set Rollback task details.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Detail Rollback task details.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDetail(RollbackInstancesInfo [] Detail) {
        this.Detail = Detail;
    }

    public RollbackTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RollbackTask(RollbackTask source) {
        if (source.Info != null) {
            this.Info = new String(source.Info);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Detail != null) {
            this.Detail = new RollbackInstancesInfo[source.Detail.length];
            for (int i = 0; i < source.Detail.length; i++) {
                this.Detail[i] = new RollbackInstancesInfo(source.Detail[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Info", this.Info);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArrayObj(map, prefix + "Detail.", this.Detail);

    }
}


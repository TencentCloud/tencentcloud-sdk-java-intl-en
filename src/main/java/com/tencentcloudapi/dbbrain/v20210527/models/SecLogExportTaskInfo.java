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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecLogExportTaskInfo extends AbstractModel {

    /**
    * Async task Id.
    */
    @SerializedName("AsyncRequestId")
    @Expose
    private Long AsyncRequestId;

    /**
    * Task start time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Task end time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Task creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Task status.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Task progress.
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * Exported log start time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LogStartTime")
    @Expose
    private String LogStartTime;

    /**
    * Exported log end time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LogEndTime")
    @Expose
    private String LogEndTime;

    /**
    * Total size of log files in KB.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalSize")
    @Expose
    private Long TotalSize;

    /**
    * List of risk levels. Valid values: `0` (no risk), `1` (low risk), `2` (medium risk), `3` (high risk).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DangerLevels")
    @Expose
    private Long [] DangerLevels;

    /**
     * Get Async task Id. 
     * @return AsyncRequestId Async task Id.
     */
    public Long getAsyncRequestId() {
        return this.AsyncRequestId;
    }

    /**
     * Set Async task Id.
     * @param AsyncRequestId Async task Id.
     */
    public void setAsyncRequestId(Long AsyncRequestId) {
        this.AsyncRequestId = AsyncRequestId;
    }

    /**
     * Get Task start time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StartTime Task start time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Task start time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StartTime Task start time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Task end time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EndTime Task end time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Task end time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EndTime Task end time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Task creation time. 
     * @return CreateTime Task creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Task creation time.
     * @param CreateTime Task creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Task status. 
     * @return Status Task status.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task status.
     * @param Status Task status.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Task progress. 
     * @return Progress Task progress.
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set Task progress.
     * @param Progress Task progress.
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get Exported log start time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LogStartTime Exported log start time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLogStartTime() {
        return this.LogStartTime;
    }

    /**
     * Set Exported log start time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LogStartTime Exported log start time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLogStartTime(String LogStartTime) {
        this.LogStartTime = LogStartTime;
    }

    /**
     * Get Exported log end time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LogEndTime Exported log end time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLogEndTime() {
        return this.LogEndTime;
    }

    /**
     * Set Exported log end time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LogEndTime Exported log end time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLogEndTime(String LogEndTime) {
        this.LogEndTime = LogEndTime;
    }

    /**
     * Get Total size of log files in KB.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TotalSize Total size of log files in KB.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotalSize() {
        return this.TotalSize;
    }

    /**
     * Set Total size of log files in KB.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TotalSize Total size of log files in KB.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalSize(Long TotalSize) {
        this.TotalSize = TotalSize;
    }

    /**
     * Get List of risk levels. Valid values: `0` (no risk), `1` (low risk), `2` (medium risk), `3` (high risk).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DangerLevels List of risk levels. Valid values: `0` (no risk), `1` (low risk), `2` (medium risk), `3` (high risk).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long [] getDangerLevels() {
        return this.DangerLevels;
    }

    /**
     * Set List of risk levels. Valid values: `0` (no risk), `1` (low risk), `2` (medium risk), `3` (high risk).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DangerLevels List of risk levels. Valid values: `0` (no risk), `1` (low risk), `2` (medium risk), `3` (high risk).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDangerLevels(Long [] DangerLevels) {
        this.DangerLevels = DangerLevels;
    }

    public SecLogExportTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecLogExportTaskInfo(SecLogExportTaskInfo source) {
        if (source.AsyncRequestId != null) {
            this.AsyncRequestId = new Long(source.AsyncRequestId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.LogStartTime != null) {
            this.LogStartTime = new String(source.LogStartTime);
        }
        if (source.LogEndTime != null) {
            this.LogEndTime = new String(source.LogEndTime);
        }
        if (source.TotalSize != null) {
            this.TotalSize = new Long(source.TotalSize);
        }
        if (source.DangerLevels != null) {
            this.DangerLevels = new Long[source.DangerLevels.length];
            for (int i = 0; i < source.DangerLevels.length; i++) {
                this.DangerLevels[i] = new Long(source.DangerLevels[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AsyncRequestId", this.AsyncRequestId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "LogStartTime", this.LogStartTime);
        this.setParamSimple(map, prefix + "LogEndTime", this.LogEndTime);
        this.setParamSimple(map, prefix + "TotalSize", this.TotalSize);
        this.setParamArraySimple(map, prefix + "DangerLevels.", this.DangerLevels);

    }
}


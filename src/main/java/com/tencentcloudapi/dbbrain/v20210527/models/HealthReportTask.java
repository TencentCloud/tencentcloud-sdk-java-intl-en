/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HealthReportTask extends AbstractModel{

    /**
    * Async task request ID.
    */
    @SerializedName("AsyncRequestId")
    @Expose
    private Long AsyncRequestId;

    /**
    * Source that triggers the task. Valid values: `DAILY_INSPECTION` (instance inspection), `SCHEDULED` (scheduled task), and `MANUAL` (manual trigger).
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * Task progress in %.
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * Task creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

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
    * Basic information of the instance to which the task belongs.
    */
    @SerializedName("InstanceInfo")
    @Expose
    private InstanceBasicInfo InstanceInfo;

    /**
    * Health information in health report.
    */
    @SerializedName("HealthStatus")
    @Expose
    private HealthStatus HealthStatus;

    /**
     * Get Async task request ID. 
     * @return AsyncRequestId Async task request ID.
     */
    public Long getAsyncRequestId() {
        return this.AsyncRequestId;
    }

    /**
     * Set Async task request ID.
     * @param AsyncRequestId Async task request ID.
     */
    public void setAsyncRequestId(Long AsyncRequestId) {
        this.AsyncRequestId = AsyncRequestId;
    }

    /**
     * Get Source that triggers the task. Valid values: `DAILY_INSPECTION` (instance inspection), `SCHEDULED` (scheduled task), and `MANUAL` (manual trigger). 
     * @return Source Source that triggers the task. Valid values: `DAILY_INSPECTION` (instance inspection), `SCHEDULED` (scheduled task), and `MANUAL` (manual trigger).
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set Source that triggers the task. Valid values: `DAILY_INSPECTION` (instance inspection), `SCHEDULED` (scheduled task), and `MANUAL` (manual trigger).
     * @param Source Source that triggers the task. Valid values: `DAILY_INSPECTION` (instance inspection), `SCHEDULED` (scheduled task), and `MANUAL` (manual trigger).
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get Task progress in %. 
     * @return Progress Task progress in %.
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set Task progress in %.
     * @param Progress Task progress in %.
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
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
     * Get Basic information of the instance to which the task belongs. 
     * @return InstanceInfo Basic information of the instance to which the task belongs.
     */
    public InstanceBasicInfo getInstanceInfo() {
        return this.InstanceInfo;
    }

    /**
     * Set Basic information of the instance to which the task belongs.
     * @param InstanceInfo Basic information of the instance to which the task belongs.
     */
    public void setInstanceInfo(InstanceBasicInfo InstanceInfo) {
        this.InstanceInfo = InstanceInfo;
    }

    /**
     * Get Health information in health report. 
     * @return HealthStatus Health information in health report.
     */
    public HealthStatus getHealthStatus() {
        return this.HealthStatus;
    }

    /**
     * Set Health information in health report.
     * @param HealthStatus Health information in health report.
     */
    public void setHealthStatus(HealthStatus HealthStatus) {
        this.HealthStatus = HealthStatus;
    }

    public HealthReportTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HealthReportTask(HealthReportTask source) {
        if (source.AsyncRequestId != null) {
            this.AsyncRequestId = new Long(source.AsyncRequestId);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.InstanceInfo != null) {
            this.InstanceInfo = new InstanceBasicInfo(source.InstanceInfo);
        }
        if (source.HealthStatus != null) {
            this.HealthStatus = new HealthStatus(source.HealthStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AsyncRequestId", this.AsyncRequestId);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamObj(map, prefix + "InstanceInfo.", this.InstanceInfo);
        this.setParamObj(map, prefix + "HealthStatus.", this.HealthStatus);

    }
}


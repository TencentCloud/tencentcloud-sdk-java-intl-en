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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EmergencyResponseInfo extends AbstractModel {

    /**
    * Task ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Number of hosts
    */
    @SerializedName("HostNum")
    @Expose
    private Long HostNum;

    /**
    * 
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Service start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Service end time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Report download link
    */
    @SerializedName("ReportPath")
    @Expose
    private String ReportPath;

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
     * Get Number of hosts 
     * @return HostNum Number of hosts
     */
    public Long getHostNum() {
        return this.HostNum;
    }

    /**
     * Set Number of hosts
     * @param HostNum Number of hosts
     */
    public void setHostNum(Long HostNum) {
        this.HostNum = HostNum;
    }

    /**
     * Get  
     * @return Status 
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 
     * @param Status 
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Service start time 
     * @return StartTime Service start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Service start time
     * @param StartTime Service start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Service end time 
     * @return EndTime Service end time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Service end time
     * @param EndTime Service end time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Report download link 
     * @return ReportPath Report download link
     */
    public String getReportPath() {
        return this.ReportPath;
    }

    /**
     * Set Report download link
     * @param ReportPath Report download link
     */
    public void setReportPath(String ReportPath) {
        this.ReportPath = ReportPath;
    }

    public EmergencyResponseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EmergencyResponseInfo(EmergencyResponseInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.HostNum != null) {
            this.HostNum = new Long(source.HostNum);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ReportPath != null) {
            this.ReportPath = new String(source.ReportPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "HostNum", this.HostNum);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ReportPath", this.ReportPath);

    }
}


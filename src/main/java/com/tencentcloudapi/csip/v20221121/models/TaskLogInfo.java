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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskLogInfo extends AbstractModel {

    /**
    * Report name
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskLogName")
    @Expose
    private String TaskLogName;

    /**
    * Report ID.
    */
    @SerializedName("TaskLogId")
    @Expose
    private String TaskLogId;

    /**
    * Number of associated assets
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("AssetsNumber")
    @Expose
    private Long AssetsNumber;

    /**
    * Number of risks
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("RiskNumber")
    @Expose
    private Long RiskNumber;

    /**
    * Report generation time
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * Task status. `0`: Initial value; `1`: Scanning; `2`: Completed; `3`: Failed; `4`: Stopped; `5`: Paused; `6`: Retried
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Name of the associated task
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Scan start time
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Scan task ID
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskCenterTaskId")
    @Expose
    private String TaskCenterTaskId;

    /**
    * User AppId
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * User UIN
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("UIN")
    @Expose
    private String UIN;

    /**
    * User name.
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Report type: `1`: Health check report; `2`: Daily report; `3`: Weekly report; `4`: Monthly report
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReportType")
    @Expose
    private Long ReportType;

    /**
    * Report template ID
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
     * Get Report name
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return TaskLogName Report name
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getTaskLogName() {
        return this.TaskLogName;
    }

    /**
     * Set Report name
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param TaskLogName Report name
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setTaskLogName(String TaskLogName) {
        this.TaskLogName = TaskLogName;
    }

    /**
     * Get Report ID. 
     * @return TaskLogId Report ID.
     */
    public String getTaskLogId() {
        return this.TaskLogId;
    }

    /**
     * Set Report ID.
     * @param TaskLogId Report ID.
     */
    public void setTaskLogId(String TaskLogId) {
        this.TaskLogId = TaskLogId;
    }

    /**
     * Get Number of associated assets
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return AssetsNumber Number of associated assets
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getAssetsNumber() {
        return this.AssetsNumber;
    }

    /**
     * Set Number of associated assets
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param AssetsNumber Number of associated assets
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setAssetsNumber(Long AssetsNumber) {
        this.AssetsNumber = AssetsNumber;
    }

    /**
     * Get Number of risks
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return RiskNumber Number of risks
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getRiskNumber() {
        return this.RiskNumber;
    }

    /**
     * Set Number of risks
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param RiskNumber Number of risks
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setRiskNumber(Long RiskNumber) {
        this.RiskNumber = RiskNumber;
    }

    /**
     * Get Report generation time
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Time Report generation time
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set Report generation time
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Time Report generation time
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get Task status. `0`: Initial value; `1`: Scanning; `2`: Completed; `3`: Failed; `4`: Stopped; `5`: Paused; `6`: Retried
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Status Task status. `0`: Initial value; `1`: Scanning; `2`: Completed; `3`: Failed; `4`: Stopped; `5`: Paused; `6`: Retried
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Task status. `0`: Initial value; `1`: Scanning; `2`: Completed; `3`: Failed; `4`: Stopped; `5`: Paused; `6`: Retried
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Status Task status. `0`: Initial value; `1`: Scanning; `2`: Completed; `3`: Failed; `4`: Stopped; `5`: Paused; `6`: Retried
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Name of the associated task
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return TaskName Name of the associated task
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set Name of the associated task
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param TaskName Name of the associated task
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get Scan start time
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return StartTime Scan start time
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Scan start time
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param StartTime Scan start time
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Scan task ID
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return TaskCenterTaskId Scan task ID
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getTaskCenterTaskId() {
        return this.TaskCenterTaskId;
    }

    /**
     * Set Scan task ID
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param TaskCenterTaskId Scan task ID
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setTaskCenterTaskId(String TaskCenterTaskId) {
        this.TaskCenterTaskId = TaskCenterTaskId;
    }

    /**
     * Get User AppId
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return AppId User AppId
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set User AppId
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param AppId User AppId
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get User UIN
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return UIN User UIN
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getUIN() {
        return this.UIN;
    }

    /**
     * Set User UIN
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param UIN User UIN
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setUIN(String UIN) {
        this.UIN = UIN;
    }

    /**
     * Get User name.
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return UserName User name.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set User name.
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param UserName User name.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Report type: `1`: Health check report; `2`: Daily report; `3`: Weekly report; `4`: Monthly report
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return ReportType Report type: `1`: Health check report; `2`: Daily report; `3`: Weekly report; `4`: Monthly report
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getReportType() {
        return this.ReportType;
    }

    /**
     * Set Report type: `1`: Health check report; `2`: Daily report; `3`: Weekly report; `4`: Monthly report
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param ReportType Report type: `1`: Health check report; `2`: Daily report; `3`: Weekly report; `4`: Monthly report
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setReportType(Long ReportType) {
        this.ReportType = ReportType;
    }

    /**
     * Get Report template ID
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return TemplateId Report template ID
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set Report template ID
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param TemplateId Report template ID
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    public TaskLogInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskLogInfo(TaskLogInfo source) {
        if (source.TaskLogName != null) {
            this.TaskLogName = new String(source.TaskLogName);
        }
        if (source.TaskLogId != null) {
            this.TaskLogId = new String(source.TaskLogId);
        }
        if (source.AssetsNumber != null) {
            this.AssetsNumber = new Long(source.AssetsNumber);
        }
        if (source.RiskNumber != null) {
            this.RiskNumber = new Long(source.RiskNumber);
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.TaskCenterTaskId != null) {
            this.TaskCenterTaskId = new String(source.TaskCenterTaskId);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.UIN != null) {
            this.UIN = new String(source.UIN);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.ReportType != null) {
            this.ReportType = new Long(source.ReportType);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskLogName", this.TaskLogName);
        this.setParamSimple(map, prefix + "TaskLogId", this.TaskLogId);
        this.setParamSimple(map, prefix + "AssetsNumber", this.AssetsNumber);
        this.setParamSimple(map, prefix + "RiskNumber", this.RiskNumber);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "TaskCenterTaskId", this.TaskCenterTaskId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "UIN", this.UIN);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "ReportType", this.ReportType);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);

    }
}


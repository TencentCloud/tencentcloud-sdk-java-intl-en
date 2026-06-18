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
    * report name
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
    * Associated Asset Count
    */
    @SerializedName("AssetsNumber")
    @Expose
    private Long AssetsNumber;

    /**
    * Security Risk Count
    */
    @SerializedName("RiskNumber")
    @Expose
    private Long RiskNumber;

    /**
    * Report generation time
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * Task Status Code. 0-Initial Value; 1-Scanning; 2-Scan Completed; 3-Scan Error; 4-Stopped; 5-Halted; 6-Task Has Been Restarted.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Associated Task Name
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Scan start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Task Center Scan Task ID
    */
    @SerializedName("TaskCenterTaskId")
    @Expose
    private String TaskCenterTaskId;

    /**
    * Tenant ID
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * Host Account ID
    */
    @SerializedName("UIN")
    @Expose
    private String UIN;

    /**
    * User name
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Report Type. 1: Security Checkup; 2: Daily Report; 3: Weekly Report; 4: Monthly Report.
    */
    @SerializedName("ReportType")
    @Expose
    private Long ReportType;

    /**
    * Report Template ID
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
     * Get report name 
     * @return TaskLogName report name
     */
    public String getTaskLogName() {
        return this.TaskLogName;
    }

    /**
     * Set report name
     * @param TaskLogName report name
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
     * Get Associated Asset Count 
     * @return AssetsNumber Associated Asset Count
     */
    public Long getAssetsNumber() {
        return this.AssetsNumber;
    }

    /**
     * Set Associated Asset Count
     * @param AssetsNumber Associated Asset Count
     */
    public void setAssetsNumber(Long AssetsNumber) {
        this.AssetsNumber = AssetsNumber;
    }

    /**
     * Get Security Risk Count 
     * @return RiskNumber Security Risk Count
     */
    public Long getRiskNumber() {
        return this.RiskNumber;
    }

    /**
     * Set Security Risk Count
     * @param RiskNumber Security Risk Count
     */
    public void setRiskNumber(Long RiskNumber) {
        this.RiskNumber = RiskNumber;
    }

    /**
     * Get Report generation time 
     * @return Time Report generation time
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set Report generation time
     * @param Time Report generation time
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get Task Status Code. 0-Initial Value; 1-Scanning; 2-Scan Completed; 3-Scan Error; 4-Stopped; 5-Halted; 6-Task Has Been Restarted. 
     * @return Status Task Status Code. 0-Initial Value; 1-Scanning; 2-Scan Completed; 3-Scan Error; 4-Stopped; 5-Halted; 6-Task Has Been Restarted.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Task Status Code. 0-Initial Value; 1-Scanning; 2-Scan Completed; 3-Scan Error; 4-Stopped; 5-Halted; 6-Task Has Been Restarted.
     * @param Status Task Status Code. 0-Initial Value; 1-Scanning; 2-Scan Completed; 3-Scan Error; 4-Stopped; 5-Halted; 6-Task Has Been Restarted.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Associated Task Name 
     * @return TaskName Associated Task Name
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set Associated Task Name
     * @param TaskName Associated Task Name
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get Scan start time 
     * @return StartTime Scan start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Scan start time
     * @param StartTime Scan start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Task Center Scan Task ID 
     * @return TaskCenterTaskId Task Center Scan Task ID
     */
    public String getTaskCenterTaskId() {
        return this.TaskCenterTaskId;
    }

    /**
     * Set Task Center Scan Task ID
     * @param TaskCenterTaskId Task Center Scan Task ID
     */
    public void setTaskCenterTaskId(String TaskCenterTaskId) {
        this.TaskCenterTaskId = TaskCenterTaskId;
    }

    /**
     * Get Tenant ID 
     * @return AppId Tenant ID
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set Tenant ID
     * @param AppId Tenant ID
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Host Account ID 
     * @return UIN Host Account ID
     */
    public String getUIN() {
        return this.UIN;
    }

    /**
     * Set Host Account ID
     * @param UIN Host Account ID
     */
    public void setUIN(String UIN) {
        this.UIN = UIN;
    }

    /**
     * Get User name 
     * @return UserName User name
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set User name
     * @param UserName User name
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Report Type. 1: Security Checkup; 2: Daily Report; 3: Weekly Report; 4: Monthly Report. 
     * @return ReportType Report Type. 1: Security Checkup; 2: Daily Report; 3: Weekly Report; 4: Monthly Report.
     */
    public Long getReportType() {
        return this.ReportType;
    }

    /**
     * Set Report Type. 1: Security Checkup; 2: Daily Report; 3: Weekly Report; 4: Monthly Report.
     * @param ReportType Report Type. 1: Security Checkup; 2: Daily Report; 3: Weekly Report; 4: Monthly Report.
     */
    public void setReportType(Long ReportType) {
        this.ReportType = ReportType;
    }

    /**
     * Get Report Template ID 
     * @return TemplateId Report Template ID
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set Report Template ID
     * @param TemplateId Report Template ID
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


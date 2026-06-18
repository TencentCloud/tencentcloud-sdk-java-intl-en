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

public class ScanTaskInfo extends AbstractModel {

    /**
    * Task ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Task name.
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Task Status Code: 1-Awaiting Start, 2-Scanning, 3-Scan Error, 4-Scan Completed.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Task progress
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * Task Completion Time
    */
    @SerializedName("TaskTime")
    @Expose
    private String TaskTime;

    /**
    * report ID
    */
    @SerializedName("ReportId")
    @Expose
    private String ReportId;

    /**
    * report name
    */
    @SerializedName("ReportName")
    @Expose
    private String ReportName;

    /**
    * Scanning Schedule. 0-Periodic Task; 1-Scan Now; 2-Scheduled Scan; 3-Custom.
    */
    @SerializedName("ScanPlan")
    @Expose
    private Long ScanPlan;

    /**
    * Number of Associated Assets
    */
    @SerializedName("AssetCount")
    @Expose
    private Long AssetCount;

    /**
    * APP ID
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * User Host Account ID
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
     * Get Task name. 
     * @return TaskName Task name.
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set Task name.
     * @param TaskName Task name.
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get Task Status Code: 1-Awaiting Start, 2-Scanning, 3-Scan Error, 4-Scan Completed. 
     * @return Status Task Status Code: 1-Awaiting Start, 2-Scanning, 3-Scan Error, 4-Scan Completed.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Task Status Code: 1-Awaiting Start, 2-Scanning, 3-Scan Error, 4-Scan Completed.
     * @param Status Task Status Code: 1-Awaiting Start, 2-Scanning, 3-Scan Error, 4-Scan Completed.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Task progress 
     * @return Progress Task progress
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set Task progress
     * @param Progress Task progress
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get Task Completion Time 
     * @return TaskTime Task Completion Time
     */
    public String getTaskTime() {
        return this.TaskTime;
    }

    /**
     * Set Task Completion Time
     * @param TaskTime Task Completion Time
     */
    public void setTaskTime(String TaskTime) {
        this.TaskTime = TaskTime;
    }

    /**
     * Get report ID 
     * @return ReportId report ID
     */
    public String getReportId() {
        return this.ReportId;
    }

    /**
     * Set report ID
     * @param ReportId report ID
     */
    public void setReportId(String ReportId) {
        this.ReportId = ReportId;
    }

    /**
     * Get report name 
     * @return ReportName report name
     */
    public String getReportName() {
        return this.ReportName;
    }

    /**
     * Set report name
     * @param ReportName report name
     */
    public void setReportName(String ReportName) {
        this.ReportName = ReportName;
    }

    /**
     * Get Scanning Schedule. 0-Periodic Task; 1-Scan Now; 2-Scheduled Scan; 3-Custom. 
     * @return ScanPlan Scanning Schedule. 0-Periodic Task; 1-Scan Now; 2-Scheduled Scan; 3-Custom.
     */
    public Long getScanPlan() {
        return this.ScanPlan;
    }

    /**
     * Set Scanning Schedule. 0-Periodic Task; 1-Scan Now; 2-Scheduled Scan; 3-Custom.
     * @param ScanPlan Scanning Schedule. 0-Periodic Task; 1-Scan Now; 2-Scheduled Scan; 3-Custom.
     */
    public void setScanPlan(Long ScanPlan) {
        this.ScanPlan = ScanPlan;
    }

    /**
     * Get Number of Associated Assets 
     * @return AssetCount Number of Associated Assets
     */
    public Long getAssetCount() {
        return this.AssetCount;
    }

    /**
     * Set Number of Associated Assets
     * @param AssetCount Number of Associated Assets
     */
    public void setAssetCount(Long AssetCount) {
        this.AssetCount = AssetCount;
    }

    /**
     * Get APP ID 
     * @return AppId APP ID
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set APP ID
     * @param AppId APP ID
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get User Host Account ID 
     * @return UIN User Host Account ID
     */
    public String getUIN() {
        return this.UIN;
    }

    /**
     * Set User Host Account ID
     * @param UIN User Host Account ID
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

    public ScanTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScanTaskInfo(ScanTaskInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.TaskTime != null) {
            this.TaskTime = new String(source.TaskTime);
        }
        if (source.ReportId != null) {
            this.ReportId = new String(source.ReportId);
        }
        if (source.ReportName != null) {
            this.ReportName = new String(source.ReportName);
        }
        if (source.ScanPlan != null) {
            this.ScanPlan = new Long(source.ScanPlan);
        }
        if (source.AssetCount != null) {
            this.AssetCount = new Long(source.AssetCount);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "TaskTime", this.TaskTime);
        this.setParamSimple(map, prefix + "ReportId", this.ReportId);
        this.setParamSimple(map, prefix + "ReportName", this.ReportName);
        this.setParamSimple(map, prefix + "ScanPlan", this.ScanPlan);
        this.setParamSimple(map, prefix + "AssetCount", this.AssetCount);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "UIN", this.UIN);
        this.setParamSimple(map, prefix + "UserName", this.UserName);

    }
}


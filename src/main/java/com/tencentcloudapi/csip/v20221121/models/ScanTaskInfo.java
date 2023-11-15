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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScanTaskInfo extends AbstractModel {

    /**
    * Task ID Id
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Task name
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Task status. `1`: Pending start; `2`: Scanning; `3`: Failed; `4`: Completed
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Task progress
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * Displayed time point
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskTime")
    @Expose
    private String TaskTime;

    /**
    * Report ID
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReportId")
    @Expose
    private String ReportId;

    /**
    * Report name
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReportName")
    @Expose
    private String ReportName;

    /**
    * Task type. `0`: Scheduled task, `1`: Scan immediately; `2`: Scanned at the specified time; `3`: Custom. 
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScanPlan")
    @Expose
    private Long ScanPlan;

    /**
    * Number of associated assets
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("AssetCount")
    @Expose
    private Long AssetCount;

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
     * Get Task ID Id
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return TaskId Task ID Id
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID Id
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param TaskId Task ID Id
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Task name
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return TaskName Task name
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set Task name
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param TaskName Task name
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get Task status. `1`: Pending start; `2`: Scanning; `3`: Failed; `4`: Completed
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Status Task status. `1`: Pending start; `2`: Scanning; `3`: Failed; `4`: Completed
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Task status. `1`: Pending start; `2`: Scanning; `3`: Failed; `4`: Completed
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Status Task status. `1`: Pending start; `2`: Scanning; `3`: Failed; `4`: Completed
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Task progress
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Progress Task progress
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set Task progress
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Progress Task progress
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get Displayed time point
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return TaskTime Displayed time point
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getTaskTime() {
        return this.TaskTime;
    }

    /**
     * Set Displayed time point
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param TaskTime Displayed time point
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setTaskTime(String TaskTime) {
        this.TaskTime = TaskTime;
    }

    /**
     * Get Report ID
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return ReportId Report ID
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getReportId() {
        return this.ReportId;
    }

    /**
     * Set Report ID
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param ReportId Report ID
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setReportId(String ReportId) {
        this.ReportId = ReportId;
    }

    /**
     * Get Report name
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return ReportName Report name
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getReportName() {
        return this.ReportName;
    }

    /**
     * Set Report name
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param ReportName Report name
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setReportName(String ReportName) {
        this.ReportName = ReportName;
    }

    /**
     * Get Task type. `0`: Scheduled task, `1`: Scan immediately; `2`: Scanned at the specified time; `3`: Custom. 
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return ScanPlan Task type. `0`: Scheduled task, `1`: Scan immediately; `2`: Scanned at the specified time; `3`: Custom. 
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getScanPlan() {
        return this.ScanPlan;
    }

    /**
     * Set Task type. `0`: Scheduled task, `1`: Scan immediately; `2`: Scanned at the specified time; `3`: Custom. 
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param ScanPlan Task type. `0`: Scheduled task, `1`: Scan immediately; `2`: Scanned at the specified time; `3`: Custom. 
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setScanPlan(Long ScanPlan) {
        this.ScanPlan = ScanPlan;
    }

    /**
     * Get Number of associated assets
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return AssetCount Number of associated assets
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getAssetCount() {
        return this.AssetCount;
    }

    /**
     * Set Number of associated assets
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param AssetCount Number of associated assets
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setAssetCount(Long AssetCount) {
        this.AssetCount = AssetCount;
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


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

public class ScanTaskInfoList extends AbstractModel {

    /**
    * Task name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Start time of the task
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Task end time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * CRON format
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScanPlanContent")
    @Expose
    private String ScanPlanContent;

    /**
    * Task type. `0`: Scheduled task, `1`: Scan immediately; `2`: Scanned at the specified time; `3`: Custom.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * Creation time
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("InsertTime")
    @Expose
    private String InsertTime;

    /**
    * Task ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Custom list of assets to scan
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SelfDefiningAssets")
    @Expose
    private String [] SelfDefiningAssets;

    /**
    * Estimated period to complete the task
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PredictTime")
    @Expose
    private Long PredictTime;

    /**
    * Estimated completion time of the task
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PredictEndTime")
    @Expose
    private String PredictEndTime;

    /**
    * Number of reports
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReportNumber")
    @Expose
    private Long ReportNumber;

    /**
    * Number of assets
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AssetNumber")
    @Expose
    private Long AssetNumber;

    /**
    * Scanning status. `0`: (default) Not scanned; `1`: Scanning; `2`: Scan completed; `3`: Error while scanning; `4`: Scanning stopped
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScanStatus")
    @Expose
    private Long ScanStatus;

    /**
    * Task progress
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Percent")
    @Expose
    private Float Percent;

    /**
    * port/poc/weakpass/webcontent/configrisk
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScanItem")
    @Expose
    private String ScanItem;

    /**
    * Values: `0` (Scan all); `1` (Scan specific assets); `2` (Scan all expect the specified assets); `3` (Custom assets).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScanAssetType")
    @Expose
    private Long ScanAssetType;

    /**
    * VSS subtask ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VSSTaskId")
    @Expose
    private String VSSTaskId;

    /**
    * CSPM subtask ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CSPMTaskId")
    @Expose
    private String CSPMTaskId;

    /**
    * CWPP vulnerability scan task IDHost missed scan subtask id
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CWPPOCId")
    @Expose
    private String CWPPOCId;

    /**
    * CWPP baseline check task ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CWPBlId")
    @Expose
    private String CWPBlId;

    /**
    * VSS task progess
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VSSTaskProcess")
    @Expose
    private Long VSSTaskProcess;

    /**
    * CSPM task progress
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CSPMTaskProcess")
    @Expose
    private Long CSPMTaskProcess;

    /**
    * CWPP vulnerability scan task progress
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CWPPOCProcess")
    @Expose
    private Long CWPPOCProcess;

    /**
    * CWPP baseline check task progress
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CWPBlProcess")
    @Expose
    private Long CWPBlProcess;

    /**
    * 
    */
    @SerializedName("ErrorCode")
    @Expose
    private Long ErrorCode;

    /**
    * Exception information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ErrorInfo")
    @Expose
    private String ErrorInfo;

    /**
    * Day of the month to start the scheduled task
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StartDay")
    @Expose
    private Long StartDay;

    /**
    * Scan frequency in days. `1`: Every day; `7`: Every seven days; `30`: Every 30 days; `0`: Scan once only
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Frequency")
    @Expose
    private Long Frequency;

    /**
    * Number of completed tasks
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CompleteNumber")
    @Expose
    private Long CompleteNumber;

    /**
    * Number of scanned assets
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CompleteAssetNumber")
    @Expose
    private Long CompleteAssetNumber;

    /**
    * Number of risks
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RiskCount")
    @Expose
    private Long RiskCount;

    /**
    * Assets
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Assets")
    @Expose
    private TaskAssetObject [] Assets;

    /**
    * User `Appid`
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * User UIN
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UIN")
    @Expose
    private String UIN;

    /**
    * User name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Scan task mode: `0` (Standard), `1` (Quick), `2` (Advanced). 
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskMode")
    @Expose
    private Long TaskMode;

    /**
    * Source of scanning request
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScanFrom")
    @Expose
    private String ScanFrom;

    /**
    * Whether it's a limited-time free health check. `0`: No; `1`: Yes
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsFree")
    @Expose
    private Long IsFree;

    /**
    * Whether the user is authorized to delete this task. `1` :Yes; `0`: No. It's available for multi-account management.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsDelete")
    @Expose
    private Long IsDelete;

    /**
    * Source of the task. `0`: Default, `1`: Assistant; `2`: Health check
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
     * Get Task name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskName Task name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set Task name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskName Task name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get Start time of the task
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StartTime Start time of the task
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time of the task
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StartTime Start time of the task
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Task end time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EndTime Task end time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Task end time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EndTime Task end time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get CRON format
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ScanPlanContent CRON format
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getScanPlanContent() {
        return this.ScanPlanContent;
    }

    /**
     * Set CRON format
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ScanPlanContent CRON format
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScanPlanContent(String ScanPlanContent) {
        this.ScanPlanContent = ScanPlanContent;
    }

    /**
     * Get Task type. `0`: Scheduled task, `1`: Scan immediately; `2`: Scanned at the specified time; `3`: Custom.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskType Task type. `0`: Scheduled task, `1`: Scan immediately; `2`: Scanned at the specified time; `3`: Custom.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set Task type. `0`: Scheduled task, `1`: Scan immediately; `2`: Scanned at the specified time; `3`: Custom.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskType Task type. `0`: Scheduled task, `1`: Scan immediately; `2`: Scanned at the specified time; `3`: Custom.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get Creation time
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return InsertTime Creation time
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set Creation time
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param InsertTime Creation time
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setInsertTime(String InsertTime) {
        this.InsertTime = InsertTime;
    }

    /**
     * Get Task ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskId Task ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskId Task ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Custom list of assets to scan
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SelfDefiningAssets Custom list of assets to scan
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getSelfDefiningAssets() {
        return this.SelfDefiningAssets;
    }

    /**
     * Set Custom list of assets to scan
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SelfDefiningAssets Custom list of assets to scan
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSelfDefiningAssets(String [] SelfDefiningAssets) {
        this.SelfDefiningAssets = SelfDefiningAssets;
    }

    /**
     * Get Estimated period to complete the task
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PredictTime Estimated period to complete the task
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPredictTime() {
        return this.PredictTime;
    }

    /**
     * Set Estimated period to complete the task
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PredictTime Estimated period to complete the task
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPredictTime(Long PredictTime) {
        this.PredictTime = PredictTime;
    }

    /**
     * Get Estimated completion time of the task
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PredictEndTime Estimated completion time of the task
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPredictEndTime() {
        return this.PredictEndTime;
    }

    /**
     * Set Estimated completion time of the task
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PredictEndTime Estimated completion time of the task
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPredictEndTime(String PredictEndTime) {
        this.PredictEndTime = PredictEndTime;
    }

    /**
     * Get Number of reports
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ReportNumber Number of reports
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getReportNumber() {
        return this.ReportNumber;
    }

    /**
     * Set Number of reports
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ReportNumber Number of reports
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReportNumber(Long ReportNumber) {
        this.ReportNumber = ReportNumber;
    }

    /**
     * Get Number of assets
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AssetNumber Number of assets
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAssetNumber() {
        return this.AssetNumber;
    }

    /**
     * Set Number of assets
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AssetNumber Number of assets
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAssetNumber(Long AssetNumber) {
        this.AssetNumber = AssetNumber;
    }

    /**
     * Get Scanning status. `0`: (default) Not scanned; `1`: Scanning; `2`: Scan completed; `3`: Error while scanning; `4`: Scanning stopped
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ScanStatus Scanning status. `0`: (default) Not scanned; `1`: Scanning; `2`: Scan completed; `3`: Error while scanning; `4`: Scanning stopped
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getScanStatus() {
        return this.ScanStatus;
    }

    /**
     * Set Scanning status. `0`: (default) Not scanned; `1`: Scanning; `2`: Scan completed; `3`: Error while scanning; `4`: Scanning stopped
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ScanStatus Scanning status. `0`: (default) Not scanned; `1`: Scanning; `2`: Scan completed; `3`: Error while scanning; `4`: Scanning stopped
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScanStatus(Long ScanStatus) {
        this.ScanStatus = ScanStatus;
    }

    /**
     * Get Task progress
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Percent Task progress
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getPercent() {
        return this.Percent;
    }

    /**
     * Set Task progress
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Percent Task progress
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPercent(Float Percent) {
        this.Percent = Percent;
    }

    /**
     * Get port/poc/weakpass/webcontent/configrisk
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ScanItem port/poc/weakpass/webcontent/configrisk
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getScanItem() {
        return this.ScanItem;
    }

    /**
     * Set port/poc/weakpass/webcontent/configrisk
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ScanItem port/poc/weakpass/webcontent/configrisk
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScanItem(String ScanItem) {
        this.ScanItem = ScanItem;
    }

    /**
     * Get Values: `0` (Scan all); `1` (Scan specific assets); `2` (Scan all expect the specified assets); `3` (Custom assets).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ScanAssetType Values: `0` (Scan all); `1` (Scan specific assets); `2` (Scan all expect the specified assets); `3` (Custom assets).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getScanAssetType() {
        return this.ScanAssetType;
    }

    /**
     * Set Values: `0` (Scan all); `1` (Scan specific assets); `2` (Scan all expect the specified assets); `3` (Custom assets).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ScanAssetType Values: `0` (Scan all); `1` (Scan specific assets); `2` (Scan all expect the specified assets); `3` (Custom assets).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScanAssetType(Long ScanAssetType) {
        this.ScanAssetType = ScanAssetType;
    }

    /**
     * Get VSS subtask ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VSSTaskId VSS subtask ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVSSTaskId() {
        return this.VSSTaskId;
    }

    /**
     * Set VSS subtask ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VSSTaskId VSS subtask ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVSSTaskId(String VSSTaskId) {
        this.VSSTaskId = VSSTaskId;
    }

    /**
     * Get CSPM subtask ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CSPMTaskId CSPM subtask ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCSPMTaskId() {
        return this.CSPMTaskId;
    }

    /**
     * Set CSPM subtask ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CSPMTaskId CSPM subtask ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCSPMTaskId(String CSPMTaskId) {
        this.CSPMTaskId = CSPMTaskId;
    }

    /**
     * Get CWPP vulnerability scan task IDHost missed scan subtask id
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CWPPOCId CWPP vulnerability scan task IDHost missed scan subtask id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCWPPOCId() {
        return this.CWPPOCId;
    }

    /**
     * Set CWPP vulnerability scan task IDHost missed scan subtask id
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CWPPOCId CWPP vulnerability scan task IDHost missed scan subtask id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCWPPOCId(String CWPPOCId) {
        this.CWPPOCId = CWPPOCId;
    }

    /**
     * Get CWPP baseline check task ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CWPBlId CWPP baseline check task ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCWPBlId() {
        return this.CWPBlId;
    }

    /**
     * Set CWPP baseline check task ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CWPBlId CWPP baseline check task ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCWPBlId(String CWPBlId) {
        this.CWPBlId = CWPBlId;
    }

    /**
     * Get VSS task progess
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VSSTaskProcess VSS task progess
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getVSSTaskProcess() {
        return this.VSSTaskProcess;
    }

    /**
     * Set VSS task progess
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VSSTaskProcess VSS task progess
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVSSTaskProcess(Long VSSTaskProcess) {
        this.VSSTaskProcess = VSSTaskProcess;
    }

    /**
     * Get CSPM task progress
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CSPMTaskProcess CSPM task progress
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCSPMTaskProcess() {
        return this.CSPMTaskProcess;
    }

    /**
     * Set CSPM task progress
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CSPMTaskProcess CSPM task progress
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCSPMTaskProcess(Long CSPMTaskProcess) {
        this.CSPMTaskProcess = CSPMTaskProcess;
    }

    /**
     * Get CWPP vulnerability scan task progress
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CWPPOCProcess CWPP vulnerability scan task progress
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCWPPOCProcess() {
        return this.CWPPOCProcess;
    }

    /**
     * Set CWPP vulnerability scan task progress
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CWPPOCProcess CWPP vulnerability scan task progress
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCWPPOCProcess(Long CWPPOCProcess) {
        this.CWPPOCProcess = CWPPOCProcess;
    }

    /**
     * Get CWPP baseline check task progress
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CWPBlProcess CWPP baseline check task progress
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCWPBlProcess() {
        return this.CWPBlProcess;
    }

    /**
     * Set CWPP baseline check task progress
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CWPBlProcess CWPP baseline check task progress
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCWPBlProcess(Long CWPBlProcess) {
        this.CWPBlProcess = CWPBlProcess;
    }

    /**
     * Get  
     * @return ErrorCode 
     */
    public Long getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set 
     * @param ErrorCode 
     */
    public void setErrorCode(Long ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get Exception information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ErrorInfo Exception information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getErrorInfo() {
        return this.ErrorInfo;
    }

    /**
     * Set Exception information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ErrorInfo Exception information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setErrorInfo(String ErrorInfo) {
        this.ErrorInfo = ErrorInfo;
    }

    /**
     * Get Day of the month to start the scheduled task
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StartDay Day of the month to start the scheduled task
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStartDay() {
        return this.StartDay;
    }

    /**
     * Set Day of the month to start the scheduled task
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StartDay Day of the month to start the scheduled task
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStartDay(Long StartDay) {
        this.StartDay = StartDay;
    }

    /**
     * Get Scan frequency in days. `1`: Every day; `7`: Every seven days; `30`: Every 30 days; `0`: Scan once only
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Frequency Scan frequency in days. `1`: Every day; `7`: Every seven days; `30`: Every 30 days; `0`: Scan once only
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getFrequency() {
        return this.Frequency;
    }

    /**
     * Set Scan frequency in days. `1`: Every day; `7`: Every seven days; `30`: Every 30 days; `0`: Scan once only
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Frequency Scan frequency in days. `1`: Every day; `7`: Every seven days; `30`: Every 30 days; `0`: Scan once only
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFrequency(Long Frequency) {
        this.Frequency = Frequency;
    }

    /**
     * Get Number of completed tasks
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CompleteNumber Number of completed tasks
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCompleteNumber() {
        return this.CompleteNumber;
    }

    /**
     * Set Number of completed tasks
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CompleteNumber Number of completed tasks
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCompleteNumber(Long CompleteNumber) {
        this.CompleteNumber = CompleteNumber;
    }

    /**
     * Get Number of scanned assets
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CompleteAssetNumber Number of scanned assets
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCompleteAssetNumber() {
        return this.CompleteAssetNumber;
    }

    /**
     * Set Number of scanned assets
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CompleteAssetNumber Number of scanned assets
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCompleteAssetNumber(Long CompleteAssetNumber) {
        this.CompleteAssetNumber = CompleteAssetNumber;
    }

    /**
     * Get Number of risks
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RiskCount Number of risks
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRiskCount() {
        return this.RiskCount;
    }

    /**
     * Set Number of risks
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RiskCount Number of risks
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRiskCount(Long RiskCount) {
        this.RiskCount = RiskCount;
    }

    /**
     * Get Assets
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Assets Assets
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TaskAssetObject [] getAssets() {
        return this.Assets;
    }

    /**
     * Set Assets
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Assets Assets
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAssets(TaskAssetObject [] Assets) {
        this.Assets = Assets;
    }

    /**
     * Get User `Appid`
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AppId User `Appid`
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set User `Appid`
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AppId User `Appid`
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get User UIN
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UIN User UIN
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUIN() {
        return this.UIN;
    }

    /**
     * Set User UIN
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UIN User UIN
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUIN(String UIN) {
        this.UIN = UIN;
    }

    /**
     * Get User name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserName User name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set User name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserName User name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Scan task mode: `0` (Standard), `1` (Quick), `2` (Advanced). 
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskMode Scan task mode: `0` (Standard), `1` (Quick), `2` (Advanced). 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTaskMode() {
        return this.TaskMode;
    }

    /**
     * Set Scan task mode: `0` (Standard), `1` (Quick), `2` (Advanced). 
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskMode Scan task mode: `0` (Standard), `1` (Quick), `2` (Advanced). 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskMode(Long TaskMode) {
        this.TaskMode = TaskMode;
    }

    /**
     * Get Source of scanning request
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ScanFrom Source of scanning request
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getScanFrom() {
        return this.ScanFrom;
    }

    /**
     * Set Source of scanning request
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ScanFrom Source of scanning request
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScanFrom(String ScanFrom) {
        this.ScanFrom = ScanFrom;
    }

    /**
     * Get Whether it's a limited-time free health check. `0`: No; `1`: Yes
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsFree Whether it's a limited-time free health check. `0`: No; `1`: Yes
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsFree() {
        return this.IsFree;
    }

    /**
     * Set Whether it's a limited-time free health check. `0`: No; `1`: Yes
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsFree Whether it's a limited-time free health check. `0`: No; `1`: Yes
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsFree(Long IsFree) {
        this.IsFree = IsFree;
    }

    /**
     * Get Whether the user is authorized to delete this task. `1` :Yes; `0`: No. It's available for multi-account management.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsDelete Whether the user is authorized to delete this task. `1` :Yes; `0`: No. It's available for multi-account management.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsDelete() {
        return this.IsDelete;
    }

    /**
     * Set Whether the user is authorized to delete this task. `1` :Yes; `0`: No. It's available for multi-account management.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsDelete Whether the user is authorized to delete this task. `1` :Yes; `0`: No. It's available for multi-account management.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsDelete(Long IsDelete) {
        this.IsDelete = IsDelete;
    }

    /**
     * Get Source of the task. `0`: Default, `1`: Assistant; `2`: Health check
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SourceType Source of the task. `0`: Default, `1`: Assistant; `2`: Health check
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * Set Source of the task. `0`: Default, `1`: Assistant; `2`: Health check
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SourceType Source of the task. `0`: Default, `1`: Assistant; `2`: Health check
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSourceType(Long SourceType) {
        this.SourceType = SourceType;
    }

    public ScanTaskInfoList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScanTaskInfoList(ScanTaskInfoList source) {
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ScanPlanContent != null) {
            this.ScanPlanContent = new String(source.ScanPlanContent);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.InsertTime != null) {
            this.InsertTime = new String(source.InsertTime);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.SelfDefiningAssets != null) {
            this.SelfDefiningAssets = new String[source.SelfDefiningAssets.length];
            for (int i = 0; i < source.SelfDefiningAssets.length; i++) {
                this.SelfDefiningAssets[i] = new String(source.SelfDefiningAssets[i]);
            }
        }
        if (source.PredictTime != null) {
            this.PredictTime = new Long(source.PredictTime);
        }
        if (source.PredictEndTime != null) {
            this.PredictEndTime = new String(source.PredictEndTime);
        }
        if (source.ReportNumber != null) {
            this.ReportNumber = new Long(source.ReportNumber);
        }
        if (source.AssetNumber != null) {
            this.AssetNumber = new Long(source.AssetNumber);
        }
        if (source.ScanStatus != null) {
            this.ScanStatus = new Long(source.ScanStatus);
        }
        if (source.Percent != null) {
            this.Percent = new Float(source.Percent);
        }
        if (source.ScanItem != null) {
            this.ScanItem = new String(source.ScanItem);
        }
        if (source.ScanAssetType != null) {
            this.ScanAssetType = new Long(source.ScanAssetType);
        }
        if (source.VSSTaskId != null) {
            this.VSSTaskId = new String(source.VSSTaskId);
        }
        if (source.CSPMTaskId != null) {
            this.CSPMTaskId = new String(source.CSPMTaskId);
        }
        if (source.CWPPOCId != null) {
            this.CWPPOCId = new String(source.CWPPOCId);
        }
        if (source.CWPBlId != null) {
            this.CWPBlId = new String(source.CWPBlId);
        }
        if (source.VSSTaskProcess != null) {
            this.VSSTaskProcess = new Long(source.VSSTaskProcess);
        }
        if (source.CSPMTaskProcess != null) {
            this.CSPMTaskProcess = new Long(source.CSPMTaskProcess);
        }
        if (source.CWPPOCProcess != null) {
            this.CWPPOCProcess = new Long(source.CWPPOCProcess);
        }
        if (source.CWPBlProcess != null) {
            this.CWPBlProcess = new Long(source.CWPBlProcess);
        }
        if (source.ErrorCode != null) {
            this.ErrorCode = new Long(source.ErrorCode);
        }
        if (source.ErrorInfo != null) {
            this.ErrorInfo = new String(source.ErrorInfo);
        }
        if (source.StartDay != null) {
            this.StartDay = new Long(source.StartDay);
        }
        if (source.Frequency != null) {
            this.Frequency = new Long(source.Frequency);
        }
        if (source.CompleteNumber != null) {
            this.CompleteNumber = new Long(source.CompleteNumber);
        }
        if (source.CompleteAssetNumber != null) {
            this.CompleteAssetNumber = new Long(source.CompleteAssetNumber);
        }
        if (source.RiskCount != null) {
            this.RiskCount = new Long(source.RiskCount);
        }
        if (source.Assets != null) {
            this.Assets = new TaskAssetObject[source.Assets.length];
            for (int i = 0; i < source.Assets.length; i++) {
                this.Assets[i] = new TaskAssetObject(source.Assets[i]);
            }
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
        if (source.TaskMode != null) {
            this.TaskMode = new Long(source.TaskMode);
        }
        if (source.ScanFrom != null) {
            this.ScanFrom = new String(source.ScanFrom);
        }
        if (source.IsFree != null) {
            this.IsFree = new Long(source.IsFree);
        }
        if (source.IsDelete != null) {
            this.IsDelete = new Long(source.IsDelete);
        }
        if (source.SourceType != null) {
            this.SourceType = new Long(source.SourceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ScanPlanContent", this.ScanPlanContent);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "InsertTime", this.InsertTime);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamArraySimple(map, prefix + "SelfDefiningAssets.", this.SelfDefiningAssets);
        this.setParamSimple(map, prefix + "PredictTime", this.PredictTime);
        this.setParamSimple(map, prefix + "PredictEndTime", this.PredictEndTime);
        this.setParamSimple(map, prefix + "ReportNumber", this.ReportNumber);
        this.setParamSimple(map, prefix + "AssetNumber", this.AssetNumber);
        this.setParamSimple(map, prefix + "ScanStatus", this.ScanStatus);
        this.setParamSimple(map, prefix + "Percent", this.Percent);
        this.setParamSimple(map, prefix + "ScanItem", this.ScanItem);
        this.setParamSimple(map, prefix + "ScanAssetType", this.ScanAssetType);
        this.setParamSimple(map, prefix + "VSSTaskId", this.VSSTaskId);
        this.setParamSimple(map, prefix + "CSPMTaskId", this.CSPMTaskId);
        this.setParamSimple(map, prefix + "CWPPOCId", this.CWPPOCId);
        this.setParamSimple(map, prefix + "CWPBlId", this.CWPBlId);
        this.setParamSimple(map, prefix + "VSSTaskProcess", this.VSSTaskProcess);
        this.setParamSimple(map, prefix + "CSPMTaskProcess", this.CSPMTaskProcess);
        this.setParamSimple(map, prefix + "CWPPOCProcess", this.CWPPOCProcess);
        this.setParamSimple(map, prefix + "CWPBlProcess", this.CWPBlProcess);
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "ErrorInfo", this.ErrorInfo);
        this.setParamSimple(map, prefix + "StartDay", this.StartDay);
        this.setParamSimple(map, prefix + "Frequency", this.Frequency);
        this.setParamSimple(map, prefix + "CompleteNumber", this.CompleteNumber);
        this.setParamSimple(map, prefix + "CompleteAssetNumber", this.CompleteAssetNumber);
        this.setParamSimple(map, prefix + "RiskCount", this.RiskCount);
        this.setParamArrayObj(map, prefix + "Assets.", this.Assets);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "UIN", this.UIN);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "TaskMode", this.TaskMode);
        this.setParamSimple(map, prefix + "ScanFrom", this.ScanFrom);
        this.setParamSimple(map, prefix + "IsFree", this.IsFree);
        this.setParamSimple(map, prefix + "IsDelete", this.IsDelete);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);

    }
}


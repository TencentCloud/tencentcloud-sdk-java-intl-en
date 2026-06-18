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
    * Task name.
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * start time of the task
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Task end time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Cron Format
    */
    @SerializedName("ScanPlanContent")
    @Expose
    private String ScanPlanContent;

    /**
    * 0-Periodic Task; 1-Scan Now; 2-Scheduled Scan; 3-Custom.
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * Creation time.
    */
    @SerializedName("InsertTime")
    @Expose
    private String InsertTime;

    /**
    * Task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Custom Specified Scan Asset Information
    */
    @SerializedName("SelfDefiningAssets")
    @Expose
    private String [] SelfDefiningAssets;

    /**
    * Estimated Time
    */
    @SerializedName("PredictTime")
    @Expose
    private Long PredictTime;

    /**
    * Estimated Completion Time
    */
    @SerializedName("PredictEndTime")
    @Expose
    private String PredictEndTime;

    /**
    * Report Count
    */
    @SerializedName("ReportNumber")
    @Expose
    private Long ReportNumber;

    /**
    * Number of assets
    */
    @SerializedName("AssetNumber")
    @Expose
    private Long AssetNumber;

    /**
    * Scan Status. 0-Initial Value; 1-Scanning; 2-Scan Completed; 3-Scan Error; 4-Scan Stopped.
    */
    @SerializedName("ScanStatus")
    @Expose
    private Long ScanStatus;

    /**
    * Task progress
    */
    @SerializedName("Percent")
    @Expose
    private Float Percent;

    /**
    * port/poc/weakpass/webcontent/configrisk
    */
    @SerializedName("ScanItem")
    @Expose
    private String ScanItem;

    /**
    * 0-Full Scan; 1-Specified Asset Scan; 2-Excluded Asset Scan; 3-Custom Specified Asset Scan.
    */
    @SerializedName("ScanAssetType")
    @Expose
    private Long ScanAssetType;

    /**
    * VSS Subtask ID
    */
    @SerializedName("VSSTaskId")
    @Expose
    private String VSSTaskId;

    /**
    * CSPM Subtask ID
    */
    @SerializedName("CSPMTaskId")
    @Expose
    private String CSPMTaskId;

    /**
    * Host Vulnerability Scan Subtask ID
    */
    @SerializedName("CWPPOCId")
    @Expose
    private String CWPPOCId;

    /**
    * Host Baseline Subtask ID
    */
    @SerializedName("CWPBlId")
    @Expose
    private String CWPBlId;

    /**
    * VSS Subtask Progress
    */
    @SerializedName("VSSTaskProcess")
    @Expose
    private Long VSSTaskProcess;

    /**
    * CSPM Subtask Progress
    */
    @SerializedName("CSPMTaskProcess")
    @Expose
    private Long CSPMTaskProcess;

    /**
    * Host Vulnerability Scan Subtask Progress
    */
    @SerializedName("CWPPOCProcess")
    @Expose
    private Long CWPPOCProcess;

    /**
    * Host Baseline Subtask Progress
    */
    @SerializedName("CWPBlProcess")
    @Expose
    private Long CWPBlProcess;

    /**
    * Exception status code
    */
    @SerializedName("ErrorCode")
    @Expose
    private Long ErrorCode;

    /**
    * Exception information
    */
    @SerializedName("ErrorInfo")
    @Expose
    private String ErrorInfo;

    /**
    * Number of Days for Periodic Task to Start
    */
    @SerializedName("StartDay")
    @Expose
    private Long StartDay;

    /**
    * Scanning Frequency, in Days. 1-Daily; 7-Weekly; 30-Monthly; 0-Scan Once.
    */
    @SerializedName("Frequency")
    @Expose
    private Long Frequency;

    /**
    * Completion Count
    */
    @SerializedName("CompleteNumber")
    @Expose
    private Long CompleteNumber;

    /**
    * Completed Asset Count
    */
    @SerializedName("CompleteAssetNumber")
    @Expose
    private Long CompleteAssetNumber;

    /**
    * risk count
    */
    @SerializedName("RiskCount")
    @Expose
    private Long RiskCount;

    /**
    * Asset
    */
    @SerializedName("Assets")
    @Expose
    private TaskAssetObject [] Assets;

    /**
    * User Appid
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
    * Checkup Mode. 0-Standard Mode; 1-Quick Mode; 2-Advanced Mode.
    */
    @SerializedName("TaskMode")
    @Expose
    private Long TaskMode;

    /**
    * Scan Source
    */
    @SerializedName("ScanFrom")
    @Expose
    private String ScanFrom;

    /**
    * Whether health checkup is limited or exempted. 0-No; 1-Yes.
    */
    @SerializedName("IsFree")
    @Expose
    private Long IsFree;

    /**
    * Whether it can be deleted. 1-Yes; 0-No. For use with multi-account management.
    */
    @SerializedName("IsDelete")
    @Expose
    private Long IsDelete;

    /**
    * Task Source Type. 0: Default; 1: Assistant; 2: Health Checkup Items.
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

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
     * Get start time of the task 
     * @return StartTime start time of the task
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set start time of the task
     * @param StartTime start time of the task
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Task end time 
     * @return EndTime Task end time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Task end time
     * @param EndTime Task end time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Cron Format 
     * @return ScanPlanContent Cron Format
     */
    public String getScanPlanContent() {
        return this.ScanPlanContent;
    }

    /**
     * Set Cron Format
     * @param ScanPlanContent Cron Format
     */
    public void setScanPlanContent(String ScanPlanContent) {
        this.ScanPlanContent = ScanPlanContent;
    }

    /**
     * Get 0-Periodic Task; 1-Scan Now; 2-Scheduled Scan; 3-Custom. 
     * @return TaskType 0-Periodic Task; 1-Scan Now; 2-Scheduled Scan; 3-Custom.
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 0-Periodic Task; 1-Scan Now; 2-Scheduled Scan; 3-Custom.
     * @param TaskType 0-Periodic Task; 1-Scan Now; 2-Scheduled Scan; 3-Custom.
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get Creation time. 
     * @return InsertTime Creation time.
     */
    public String getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set Creation time.
     * @param InsertTime Creation time.
     */
    public void setInsertTime(String InsertTime) {
        this.InsertTime = InsertTime;
    }

    /**
     * Get Task ID. 
     * @return TaskId Task ID.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID.
     * @param TaskId Task ID.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Custom Specified Scan Asset Information 
     * @return SelfDefiningAssets Custom Specified Scan Asset Information
     */
    public String [] getSelfDefiningAssets() {
        return this.SelfDefiningAssets;
    }

    /**
     * Set Custom Specified Scan Asset Information
     * @param SelfDefiningAssets Custom Specified Scan Asset Information
     */
    public void setSelfDefiningAssets(String [] SelfDefiningAssets) {
        this.SelfDefiningAssets = SelfDefiningAssets;
    }

    /**
     * Get Estimated Time 
     * @return PredictTime Estimated Time
     */
    public Long getPredictTime() {
        return this.PredictTime;
    }

    /**
     * Set Estimated Time
     * @param PredictTime Estimated Time
     */
    public void setPredictTime(Long PredictTime) {
        this.PredictTime = PredictTime;
    }

    /**
     * Get Estimated Completion Time 
     * @return PredictEndTime Estimated Completion Time
     */
    public String getPredictEndTime() {
        return this.PredictEndTime;
    }

    /**
     * Set Estimated Completion Time
     * @param PredictEndTime Estimated Completion Time
     */
    public void setPredictEndTime(String PredictEndTime) {
        this.PredictEndTime = PredictEndTime;
    }

    /**
     * Get Report Count 
     * @return ReportNumber Report Count
     */
    public Long getReportNumber() {
        return this.ReportNumber;
    }

    /**
     * Set Report Count
     * @param ReportNumber Report Count
     */
    public void setReportNumber(Long ReportNumber) {
        this.ReportNumber = ReportNumber;
    }

    /**
     * Get Number of assets 
     * @return AssetNumber Number of assets
     */
    public Long getAssetNumber() {
        return this.AssetNumber;
    }

    /**
     * Set Number of assets
     * @param AssetNumber Number of assets
     */
    public void setAssetNumber(Long AssetNumber) {
        this.AssetNumber = AssetNumber;
    }

    /**
     * Get Scan Status. 0-Initial Value; 1-Scanning; 2-Scan Completed; 3-Scan Error; 4-Scan Stopped. 
     * @return ScanStatus Scan Status. 0-Initial Value; 1-Scanning; 2-Scan Completed; 3-Scan Error; 4-Scan Stopped.
     */
    public Long getScanStatus() {
        return this.ScanStatus;
    }

    /**
     * Set Scan Status. 0-Initial Value; 1-Scanning; 2-Scan Completed; 3-Scan Error; 4-Scan Stopped.
     * @param ScanStatus Scan Status. 0-Initial Value; 1-Scanning; 2-Scan Completed; 3-Scan Error; 4-Scan Stopped.
     */
    public void setScanStatus(Long ScanStatus) {
        this.ScanStatus = ScanStatus;
    }

    /**
     * Get Task progress 
     * @return Percent Task progress
     */
    public Float getPercent() {
        return this.Percent;
    }

    /**
     * Set Task progress
     * @param Percent Task progress
     */
    public void setPercent(Float Percent) {
        this.Percent = Percent;
    }

    /**
     * Get port/poc/weakpass/webcontent/configrisk 
     * @return ScanItem port/poc/weakpass/webcontent/configrisk
     */
    public String getScanItem() {
        return this.ScanItem;
    }

    /**
     * Set port/poc/weakpass/webcontent/configrisk
     * @param ScanItem port/poc/weakpass/webcontent/configrisk
     */
    public void setScanItem(String ScanItem) {
        this.ScanItem = ScanItem;
    }

    /**
     * Get 0-Full Scan; 1-Specified Asset Scan; 2-Excluded Asset Scan; 3-Custom Specified Asset Scan. 
     * @return ScanAssetType 0-Full Scan; 1-Specified Asset Scan; 2-Excluded Asset Scan; 3-Custom Specified Asset Scan.
     */
    public Long getScanAssetType() {
        return this.ScanAssetType;
    }

    /**
     * Set 0-Full Scan; 1-Specified Asset Scan; 2-Excluded Asset Scan; 3-Custom Specified Asset Scan.
     * @param ScanAssetType 0-Full Scan; 1-Specified Asset Scan; 2-Excluded Asset Scan; 3-Custom Specified Asset Scan.
     */
    public void setScanAssetType(Long ScanAssetType) {
        this.ScanAssetType = ScanAssetType;
    }

    /**
     * Get VSS Subtask ID 
     * @return VSSTaskId VSS Subtask ID
     */
    public String getVSSTaskId() {
        return this.VSSTaskId;
    }

    /**
     * Set VSS Subtask ID
     * @param VSSTaskId VSS Subtask ID
     */
    public void setVSSTaskId(String VSSTaskId) {
        this.VSSTaskId = VSSTaskId;
    }

    /**
     * Get CSPM Subtask ID 
     * @return CSPMTaskId CSPM Subtask ID
     */
    public String getCSPMTaskId() {
        return this.CSPMTaskId;
    }

    /**
     * Set CSPM Subtask ID
     * @param CSPMTaskId CSPM Subtask ID
     */
    public void setCSPMTaskId(String CSPMTaskId) {
        this.CSPMTaskId = CSPMTaskId;
    }

    /**
     * Get Host Vulnerability Scan Subtask ID 
     * @return CWPPOCId Host Vulnerability Scan Subtask ID
     */
    public String getCWPPOCId() {
        return this.CWPPOCId;
    }

    /**
     * Set Host Vulnerability Scan Subtask ID
     * @param CWPPOCId Host Vulnerability Scan Subtask ID
     */
    public void setCWPPOCId(String CWPPOCId) {
        this.CWPPOCId = CWPPOCId;
    }

    /**
     * Get Host Baseline Subtask ID 
     * @return CWPBlId Host Baseline Subtask ID
     */
    public String getCWPBlId() {
        return this.CWPBlId;
    }

    /**
     * Set Host Baseline Subtask ID
     * @param CWPBlId Host Baseline Subtask ID
     */
    public void setCWPBlId(String CWPBlId) {
        this.CWPBlId = CWPBlId;
    }

    /**
     * Get VSS Subtask Progress 
     * @return VSSTaskProcess VSS Subtask Progress
     */
    public Long getVSSTaskProcess() {
        return this.VSSTaskProcess;
    }

    /**
     * Set VSS Subtask Progress
     * @param VSSTaskProcess VSS Subtask Progress
     */
    public void setVSSTaskProcess(Long VSSTaskProcess) {
        this.VSSTaskProcess = VSSTaskProcess;
    }

    /**
     * Get CSPM Subtask Progress 
     * @return CSPMTaskProcess CSPM Subtask Progress
     */
    public Long getCSPMTaskProcess() {
        return this.CSPMTaskProcess;
    }

    /**
     * Set CSPM Subtask Progress
     * @param CSPMTaskProcess CSPM Subtask Progress
     */
    public void setCSPMTaskProcess(Long CSPMTaskProcess) {
        this.CSPMTaskProcess = CSPMTaskProcess;
    }

    /**
     * Get Host Vulnerability Scan Subtask Progress 
     * @return CWPPOCProcess Host Vulnerability Scan Subtask Progress
     */
    public Long getCWPPOCProcess() {
        return this.CWPPOCProcess;
    }

    /**
     * Set Host Vulnerability Scan Subtask Progress
     * @param CWPPOCProcess Host Vulnerability Scan Subtask Progress
     */
    public void setCWPPOCProcess(Long CWPPOCProcess) {
        this.CWPPOCProcess = CWPPOCProcess;
    }

    /**
     * Get Host Baseline Subtask Progress 
     * @return CWPBlProcess Host Baseline Subtask Progress
     */
    public Long getCWPBlProcess() {
        return this.CWPBlProcess;
    }

    /**
     * Set Host Baseline Subtask Progress
     * @param CWPBlProcess Host Baseline Subtask Progress
     */
    public void setCWPBlProcess(Long CWPBlProcess) {
        this.CWPBlProcess = CWPBlProcess;
    }

    /**
     * Get Exception status code 
     * @return ErrorCode Exception status code
     */
    public Long getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set Exception status code
     * @param ErrorCode Exception status code
     */
    public void setErrorCode(Long ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get Exception information 
     * @return ErrorInfo Exception information
     */
    public String getErrorInfo() {
        return this.ErrorInfo;
    }

    /**
     * Set Exception information
     * @param ErrorInfo Exception information
     */
    public void setErrorInfo(String ErrorInfo) {
        this.ErrorInfo = ErrorInfo;
    }

    /**
     * Get Number of Days for Periodic Task to Start 
     * @return StartDay Number of Days for Periodic Task to Start
     */
    public Long getStartDay() {
        return this.StartDay;
    }

    /**
     * Set Number of Days for Periodic Task to Start
     * @param StartDay Number of Days for Periodic Task to Start
     */
    public void setStartDay(Long StartDay) {
        this.StartDay = StartDay;
    }

    /**
     * Get Scanning Frequency, in Days. 1-Daily; 7-Weekly; 30-Monthly; 0-Scan Once. 
     * @return Frequency Scanning Frequency, in Days. 1-Daily; 7-Weekly; 30-Monthly; 0-Scan Once.
     */
    public Long getFrequency() {
        return this.Frequency;
    }

    /**
     * Set Scanning Frequency, in Days. 1-Daily; 7-Weekly; 30-Monthly; 0-Scan Once.
     * @param Frequency Scanning Frequency, in Days. 1-Daily; 7-Weekly; 30-Monthly; 0-Scan Once.
     */
    public void setFrequency(Long Frequency) {
        this.Frequency = Frequency;
    }

    /**
     * Get Completion Count 
     * @return CompleteNumber Completion Count
     */
    public Long getCompleteNumber() {
        return this.CompleteNumber;
    }

    /**
     * Set Completion Count
     * @param CompleteNumber Completion Count
     */
    public void setCompleteNumber(Long CompleteNumber) {
        this.CompleteNumber = CompleteNumber;
    }

    /**
     * Get Completed Asset Count 
     * @return CompleteAssetNumber Completed Asset Count
     */
    public Long getCompleteAssetNumber() {
        return this.CompleteAssetNumber;
    }

    /**
     * Set Completed Asset Count
     * @param CompleteAssetNumber Completed Asset Count
     */
    public void setCompleteAssetNumber(Long CompleteAssetNumber) {
        this.CompleteAssetNumber = CompleteAssetNumber;
    }

    /**
     * Get risk count 
     * @return RiskCount risk count
     */
    public Long getRiskCount() {
        return this.RiskCount;
    }

    /**
     * Set risk count
     * @param RiskCount risk count
     */
    public void setRiskCount(Long RiskCount) {
        this.RiskCount = RiskCount;
    }

    /**
     * Get Asset 
     * @return Assets Asset
     */
    public TaskAssetObject [] getAssets() {
        return this.Assets;
    }

    /**
     * Set Asset
     * @param Assets Asset
     */
    public void setAssets(TaskAssetObject [] Assets) {
        this.Assets = Assets;
    }

    /**
     * Get User Appid 
     * @return AppId User Appid
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set User Appid
     * @param AppId User Appid
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

    /**
     * Get Checkup Mode. 0-Standard Mode; 1-Quick Mode; 2-Advanced Mode. 
     * @return TaskMode Checkup Mode. 0-Standard Mode; 1-Quick Mode; 2-Advanced Mode.
     */
    public Long getTaskMode() {
        return this.TaskMode;
    }

    /**
     * Set Checkup Mode. 0-Standard Mode; 1-Quick Mode; 2-Advanced Mode.
     * @param TaskMode Checkup Mode. 0-Standard Mode; 1-Quick Mode; 2-Advanced Mode.
     */
    public void setTaskMode(Long TaskMode) {
        this.TaskMode = TaskMode;
    }

    /**
     * Get Scan Source 
     * @return ScanFrom Scan Source
     */
    public String getScanFrom() {
        return this.ScanFrom;
    }

    /**
     * Set Scan Source
     * @param ScanFrom Scan Source
     */
    public void setScanFrom(String ScanFrom) {
        this.ScanFrom = ScanFrom;
    }

    /**
     * Get Whether health checkup is limited or exempted. 0-No; 1-Yes. 
     * @return IsFree Whether health checkup is limited or exempted. 0-No; 1-Yes.
     */
    public Long getIsFree() {
        return this.IsFree;
    }

    /**
     * Set Whether health checkup is limited or exempted. 0-No; 1-Yes.
     * @param IsFree Whether health checkup is limited or exempted. 0-No; 1-Yes.
     */
    public void setIsFree(Long IsFree) {
        this.IsFree = IsFree;
    }

    /**
     * Get Whether it can be deleted. 1-Yes; 0-No. For use with multi-account management. 
     * @return IsDelete Whether it can be deleted. 1-Yes; 0-No. For use with multi-account management.
     */
    public Long getIsDelete() {
        return this.IsDelete;
    }

    /**
     * Set Whether it can be deleted. 1-Yes; 0-No. For use with multi-account management.
     * @param IsDelete Whether it can be deleted. 1-Yes; 0-No. For use with multi-account management.
     */
    public void setIsDelete(Long IsDelete) {
        this.IsDelete = IsDelete;
    }

    /**
     * Get Task Source Type. 0: Default; 1: Assistant; 2: Health Checkup Items. 
     * @return SourceType Task Source Type. 0: Default; 1: Assistant; 2: Health Checkup Items.
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * Set Task Source Type. 0: Default; 1: Assistant; 2: Health Checkup Items.
     * @param SourceType Task Source Type. 0: Default; 1: Assistant; 2: Health Checkup Items.
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


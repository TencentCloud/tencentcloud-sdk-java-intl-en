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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMigrationDetailResponse extends AbstractModel {

    /**
    * Data migration task ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * Data migration task name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * Task creation (submission) time in the format of `yyyy-mm-dd hh:mm:ss`
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Task update time in the format of `yyyy-mm-dd hh:mm:ss`
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Task start time in the format of `yyyy-mm-dd hh:mm:ss`
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Task end time in the format of `yyyy-mm-dd hh:mm:ss`
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Migration task error message
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BriefMsg")
    @Expose
    private String BriefMsg;

    /**
    * Task status. Valid values: `created`(Created), `checking` (Checking), `checkPass` (Check passed), `checkNotPass` (Check not passed), `readyRun` (Ready for running), `running` (Running), `readyComplete` (Preparation completed), `success` (Successful), `failed` (Failed), `stopping` (Stopping), `completing` (Completing), `pausing` (Pausing), `manualPaused` (Paused). Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Task operation information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Action")
    @Expose
    private MigrateAction Action;

    /**
    * Information of the migration task execution process. The check and migration step information will be displayed in the check and migration stages respectively.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StepInfo")
    @Expose
    private MigrateDetailInfo StepInfo;

    /**
    * Source instance information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SrcInfo")
    @Expose
    private DBEndpointInfo SrcInfo;

    /**
    * Target database information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DstInfo")
    @Expose
    private DBEndpointInfo DstInfo;

    /**
    * Data consistency check result
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CompareTask")
    @Expose
    private CompareTaskInfo CompareTask;

    /**
    * Tag information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private TagItem [] Tags;

    /**
    * Running mode. Valid values: `immediate`, `timed`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RunMode")
    @Expose
    private String RunMode;

    /**
    * Expected start time in the format of "2006-01-02 15:04:05", which is required if `RunMode` is `timed`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpectRunTime")
    @Expose
    private String ExpectRunTime;

    /**
    * Migration options, which describe how the task performs migration.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MigrateOption")
    @Expose
    private MigrateOption MigrateOption;

    /**
    * Check task running details
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CheckStepInfo")
    @Expose
    private CheckStepInfo CheckStepInfo;

    /**
    * Billing information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TradeInfo")
    @Expose
    private TradeInfo TradeInfo;

    /**
    * Task error information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ErrorInfo")
    @Expose
    private ErrorInfoItem [] ErrorInfo;

    /**
    * Whether the task can be reentered in the full export stage. Valid values: `yes`, `no`. `yes`: The current task can be reentered. `no`: The current task is in the full export stage which cannot be reentered. If the value of this parameter is `no`, the checkpoint restart is not supported when the task is restarted in the export stage.
    */
    @SerializedName("DumperResumeCtrl")
    @Expose
    private String DumperResumeCtrl;

    /**
    * Task throttling information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RateLimitOption")
    @Expose
    private RateLimitOption RateLimitOption;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Data migration task ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return JobId Data migration task ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set Data migration task ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param JobId Data migration task ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get Data migration task name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return JobName Data migration task name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set Data migration task name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param JobName Data migration task name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get Task creation (submission) time in the format of `yyyy-mm-dd hh:mm:ss`
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Task creation (submission) time in the format of `yyyy-mm-dd hh:mm:ss`
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Task creation (submission) time in the format of `yyyy-mm-dd hh:mm:ss`
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Task creation (submission) time in the format of `yyyy-mm-dd hh:mm:ss`
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Task update time in the format of `yyyy-mm-dd hh:mm:ss`
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdateTime Task update time in the format of `yyyy-mm-dd hh:mm:ss`
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Task update time in the format of `yyyy-mm-dd hh:mm:ss`
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdateTime Task update time in the format of `yyyy-mm-dd hh:mm:ss`
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Task start time in the format of `yyyy-mm-dd hh:mm:ss`
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StartTime Task start time in the format of `yyyy-mm-dd hh:mm:ss`
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Task start time in the format of `yyyy-mm-dd hh:mm:ss`
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StartTime Task start time in the format of `yyyy-mm-dd hh:mm:ss`
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Task end time in the format of `yyyy-mm-dd hh:mm:ss`
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EndTime Task end time in the format of `yyyy-mm-dd hh:mm:ss`
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Task end time in the format of `yyyy-mm-dd hh:mm:ss`
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EndTime Task end time in the format of `yyyy-mm-dd hh:mm:ss`
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Migration task error message
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BriefMsg Migration task error message
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBriefMsg() {
        return this.BriefMsg;
    }

    /**
     * Set Migration task error message
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BriefMsg Migration task error message
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBriefMsg(String BriefMsg) {
        this.BriefMsg = BriefMsg;
    }

    /**
     * Get Task status. Valid values: `created`(Created), `checking` (Checking), `checkPass` (Check passed), `checkNotPass` (Check not passed), `readyRun` (Ready for running), `running` (Running), `readyComplete` (Preparation completed), `success` (Successful), `failed` (Failed), `stopping` (Stopping), `completing` (Completing), `pausing` (Pausing), `manualPaused` (Paused). Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Task status. Valid values: `created`(Created), `checking` (Checking), `checkPass` (Check passed), `checkNotPass` (Check not passed), `readyRun` (Ready for running), `running` (Running), `readyComplete` (Preparation completed), `success` (Successful), `failed` (Failed), `stopping` (Stopping), `completing` (Completing), `pausing` (Pausing), `manualPaused` (Paused). Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task status. Valid values: `created`(Created), `checking` (Checking), `checkPass` (Check passed), `checkNotPass` (Check not passed), `readyRun` (Ready for running), `running` (Running), `readyComplete` (Preparation completed), `success` (Successful), `failed` (Failed), `stopping` (Stopping), `completing` (Completing), `pausing` (Pausing), `manualPaused` (Paused). Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Task status. Valid values: `created`(Created), `checking` (Checking), `checkPass` (Check passed), `checkNotPass` (Check not passed), `readyRun` (Ready for running), `running` (Running), `readyComplete` (Preparation completed), `success` (Successful), `failed` (Failed), `stopping` (Stopping), `completing` (Completing), `pausing` (Pausing), `manualPaused` (Paused). Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Task operation information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Action Task operation information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MigrateAction getAction() {
        return this.Action;
    }

    /**
     * Set Task operation information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Action Task operation information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAction(MigrateAction Action) {
        this.Action = Action;
    }

    /**
     * Get Information of the migration task execution process. The check and migration step information will be displayed in the check and migration stages respectively.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StepInfo Information of the migration task execution process. The check and migration step information will be displayed in the check and migration stages respectively.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MigrateDetailInfo getStepInfo() {
        return this.StepInfo;
    }

    /**
     * Set Information of the migration task execution process. The check and migration step information will be displayed in the check and migration stages respectively.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StepInfo Information of the migration task execution process. The check and migration step information will be displayed in the check and migration stages respectively.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStepInfo(MigrateDetailInfo StepInfo) {
        this.StepInfo = StepInfo;
    }

    /**
     * Get Source instance information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SrcInfo Source instance information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DBEndpointInfo getSrcInfo() {
        return this.SrcInfo;
    }

    /**
     * Set Source instance information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SrcInfo Source instance information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSrcInfo(DBEndpointInfo SrcInfo) {
        this.SrcInfo = SrcInfo;
    }

    /**
     * Get Target database information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DstInfo Target database information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DBEndpointInfo getDstInfo() {
        return this.DstInfo;
    }

    /**
     * Set Target database information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DstInfo Target database information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDstInfo(DBEndpointInfo DstInfo) {
        this.DstInfo = DstInfo;
    }

    /**
     * Get Data consistency check result
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CompareTask Data consistency check result
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public CompareTaskInfo getCompareTask() {
        return this.CompareTask;
    }

    /**
     * Set Data consistency check result
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CompareTask Data consistency check result
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCompareTask(CompareTaskInfo CompareTask) {
        this.CompareTask = CompareTask;
    }

    /**
     * Get Tag information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tags Tag information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TagItem [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tags Tag information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(TagItem [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Running mode. Valid values: `immediate`, `timed`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RunMode Running mode. Valid values: `immediate`, `timed`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRunMode() {
        return this.RunMode;
    }

    /**
     * Set Running mode. Valid values: `immediate`, `timed`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RunMode Running mode. Valid values: `immediate`, `timed`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRunMode(String RunMode) {
        this.RunMode = RunMode;
    }

    /**
     * Get Expected start time in the format of "2006-01-02 15:04:05", which is required if `RunMode` is `timed`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExpectRunTime Expected start time in the format of "2006-01-02 15:04:05", which is required if `RunMode` is `timed`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExpectRunTime() {
        return this.ExpectRunTime;
    }

    /**
     * Set Expected start time in the format of "2006-01-02 15:04:05", which is required if `RunMode` is `timed`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExpectRunTime Expected start time in the format of "2006-01-02 15:04:05", which is required if `RunMode` is `timed`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExpectRunTime(String ExpectRunTime) {
        this.ExpectRunTime = ExpectRunTime;
    }

    /**
     * Get Migration options, which describe how the task performs migration.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MigrateOption Migration options, which describe how the task performs migration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MigrateOption getMigrateOption() {
        return this.MigrateOption;
    }

    /**
     * Set Migration options, which describe how the task performs migration.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MigrateOption Migration options, which describe how the task performs migration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMigrateOption(MigrateOption MigrateOption) {
        this.MigrateOption = MigrateOption;
    }

    /**
     * Get Check task running details
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CheckStepInfo Check task running details
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public CheckStepInfo getCheckStepInfo() {
        return this.CheckStepInfo;
    }

    /**
     * Set Check task running details
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CheckStepInfo Check task running details
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCheckStepInfo(CheckStepInfo CheckStepInfo) {
        this.CheckStepInfo = CheckStepInfo;
    }

    /**
     * Get Billing information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TradeInfo Billing information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TradeInfo getTradeInfo() {
        return this.TradeInfo;
    }

    /**
     * Set Billing information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TradeInfo Billing information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTradeInfo(TradeInfo TradeInfo) {
        this.TradeInfo = TradeInfo;
    }

    /**
     * Get Task error information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ErrorInfo Task error information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ErrorInfoItem [] getErrorInfo() {
        return this.ErrorInfo;
    }

    /**
     * Set Task error information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ErrorInfo Task error information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setErrorInfo(ErrorInfoItem [] ErrorInfo) {
        this.ErrorInfo = ErrorInfo;
    }

    /**
     * Get Whether the task can be reentered in the full export stage. Valid values: `yes`, `no`. `yes`: The current task can be reentered. `no`: The current task is in the full export stage which cannot be reentered. If the value of this parameter is `no`, the checkpoint restart is not supported when the task is restarted in the export stage. 
     * @return DumperResumeCtrl Whether the task can be reentered in the full export stage. Valid values: `yes`, `no`. `yes`: The current task can be reentered. `no`: The current task is in the full export stage which cannot be reentered. If the value of this parameter is `no`, the checkpoint restart is not supported when the task is restarted in the export stage.
     */
    public String getDumperResumeCtrl() {
        return this.DumperResumeCtrl;
    }

    /**
     * Set Whether the task can be reentered in the full export stage. Valid values: `yes`, `no`. `yes`: The current task can be reentered. `no`: The current task is in the full export stage which cannot be reentered. If the value of this parameter is `no`, the checkpoint restart is not supported when the task is restarted in the export stage.
     * @param DumperResumeCtrl Whether the task can be reentered in the full export stage. Valid values: `yes`, `no`. `yes`: The current task can be reentered. `no`: The current task is in the full export stage which cannot be reentered. If the value of this parameter is `no`, the checkpoint restart is not supported when the task is restarted in the export stage.
     */
    public void setDumperResumeCtrl(String DumperResumeCtrl) {
        this.DumperResumeCtrl = DumperResumeCtrl;
    }

    /**
     * Get Task throttling information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RateLimitOption Task throttling information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public RateLimitOption getRateLimitOption() {
        return this.RateLimitOption;
    }

    /**
     * Set Task throttling information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RateLimitOption Task throttling information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRateLimitOption(RateLimitOption RateLimitOption) {
        this.RateLimitOption = RateLimitOption;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeMigrationDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMigrationDetailResponse(DescribeMigrationDetailResponse source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.JobName != null) {
            this.JobName = new String(source.JobName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.BriefMsg != null) {
            this.BriefMsg = new String(source.BriefMsg);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Action != null) {
            this.Action = new MigrateAction(source.Action);
        }
        if (source.StepInfo != null) {
            this.StepInfo = new MigrateDetailInfo(source.StepInfo);
        }
        if (source.SrcInfo != null) {
            this.SrcInfo = new DBEndpointInfo(source.SrcInfo);
        }
        if (source.DstInfo != null) {
            this.DstInfo = new DBEndpointInfo(source.DstInfo);
        }
        if (source.CompareTask != null) {
            this.CompareTask = new CompareTaskInfo(source.CompareTask);
        }
        if (source.Tags != null) {
            this.Tags = new TagItem[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagItem(source.Tags[i]);
            }
        }
        if (source.RunMode != null) {
            this.RunMode = new String(source.RunMode);
        }
        if (source.ExpectRunTime != null) {
            this.ExpectRunTime = new String(source.ExpectRunTime);
        }
        if (source.MigrateOption != null) {
            this.MigrateOption = new MigrateOption(source.MigrateOption);
        }
        if (source.CheckStepInfo != null) {
            this.CheckStepInfo = new CheckStepInfo(source.CheckStepInfo);
        }
        if (source.TradeInfo != null) {
            this.TradeInfo = new TradeInfo(source.TradeInfo);
        }
        if (source.ErrorInfo != null) {
            this.ErrorInfo = new ErrorInfoItem[source.ErrorInfo.length];
            for (int i = 0; i < source.ErrorInfo.length; i++) {
                this.ErrorInfo[i] = new ErrorInfoItem(source.ErrorInfo[i]);
            }
        }
        if (source.DumperResumeCtrl != null) {
            this.DumperResumeCtrl = new String(source.DumperResumeCtrl);
        }
        if (source.RateLimitOption != null) {
            this.RateLimitOption = new RateLimitOption(source.RateLimitOption);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "BriefMsg", this.BriefMsg);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "Action.", this.Action);
        this.setParamObj(map, prefix + "StepInfo.", this.StepInfo);
        this.setParamObj(map, prefix + "SrcInfo.", this.SrcInfo);
        this.setParamObj(map, prefix + "DstInfo.", this.DstInfo);
        this.setParamObj(map, prefix + "CompareTask.", this.CompareTask);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "RunMode", this.RunMode);
        this.setParamSimple(map, prefix + "ExpectRunTime", this.ExpectRunTime);
        this.setParamObj(map, prefix + "MigrateOption.", this.MigrateOption);
        this.setParamObj(map, prefix + "CheckStepInfo.", this.CheckStepInfo);
        this.setParamObj(map, prefix + "TradeInfo.", this.TradeInfo);
        this.setParamArrayObj(map, prefix + "ErrorInfo.", this.ErrorInfo);
        this.setParamSimple(map, prefix + "DumperResumeCtrl", this.DumperResumeCtrl);
        this.setParamObj(map, prefix + "RateLimitOption.", this.RateLimitOption);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


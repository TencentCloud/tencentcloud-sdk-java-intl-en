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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApmInstanceDetail extends AbstractModel {

    /**
    * Business system id.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Business system name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Business system description information.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Status of the business system.
{Initializing; running; throttling}.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Region where the business system belongs.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Business system tag list.
    */
    @SerializedName("Tags")
    @Expose
    private ApmTag [] Tags;

    /**
    * AppID information.
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Creator uin.
    */
    @SerializedName("CreateUin")
    @Expose
    private String CreateUin;

    /**
    * Storage used (unit: mb).
    */
    @SerializedName("AmountOfUsedStorage")
    @Expose
    private Float AmountOfUsedStorage;

    /**
    * Quantity of server applications of the business system.
    */
    @SerializedName("ServiceCount")
    @Expose
    private Long ServiceCount;

    /**
    * Average daily reported span count.
    */
    @SerializedName("CountOfReportSpanPerDay")
    @Expose
    private Long CountOfReportSpanPerDay;

    /**
    * Retention period of trace data (unit: days).
    */
    @SerializedName("TraceDuration")
    @Expose
    private Long TraceDuration;

    /**
    * Business system report limit.
    */
    @SerializedName("SpanDailyCounters")
    @Expose
    private Long SpanDailyCounters;

    /**
    * Whether the business system billing is Activated (0 = not activated, 1 = activated).
    */
    @SerializedName("BillingInstance")
    @Expose
    private Long BillingInstance;

    /**
    * Error warning line (unit: %).
    */
    @SerializedName("ErrRateThreshold")
    @Expose
    private Long ErrRateThreshold;

    /**
    * Sampling rate (unit: %).
    */
    @SerializedName("SampleRate")
    @Expose
    private Long SampleRate;

    /**
    * Error sampling switch (0: off, 1: on).
    */
    @SerializedName("ErrorSample")
    @Expose
    private Long ErrorSample;

    /**
    * Sampling slow call saving threshold (unit: ms).
    */
    @SerializedName("SlowRequestSavedThreshold")
    @Expose
    private Long SlowRequestSavedThreshold;

    /**
    * CLS log region.
    */
    @SerializedName("LogRegion")
    @Expose
    private String LogRegion;

    /**
    * Log source.
    */
    @SerializedName("LogSource")
    @Expose
    private String LogSource;

    /**
    * Log feature switch (0: off; 1: on).
    */
    @SerializedName("IsRelatedLog")
    @Expose
    private Long IsRelatedLog;

    /**
    * Log topic id.
    */
    @SerializedName("LogTopicID")
    @Expose
    private String LogTopicID;

    /**
    * Quantity of client applications of the business system.
    */
    @SerializedName("ClientCount")
    @Expose
    private Long ClientCount;

    /**
    * The quantity of active applications in this business system in the last two days.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * CLS log set.
    */
    @SerializedName("LogSet")
    @Expose
    private String LogSet;

    /**
    * Retention period of metric data (unit: days).
    */
    @SerializedName("MetricDuration")
    @Expose
    private Long MetricDuration;

    /**
    * List of custom display tags.
    */
    @SerializedName("CustomShowTags")
    @Expose
    private String [] CustomShowTags;

    /**
    * Business system billing mode (1: prepaid, 0: pay-as-you-go).
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * Indicates whether the billing mode of the business system takes effect.
    */
    @SerializedName("PayModeEffective")
    @Expose
    private Boolean PayModeEffective;

    /**
    * Response time warning line (unit: ms).
    */
    @SerializedName("ResponseDurationWarningThreshold")
    @Expose
    private Long ResponseDurationWarningThreshold;

    /**
    * Whether it is free (0 = no; 1 = limited free; 2 = completely free), default 0.
    */
    @SerializedName("Free")
    @Expose
    private Long Free;

    /**
    * Indicates whether it is the default business system of tsf (0 = no, 1 = yes).
    */
    @SerializedName("DefaultTSF")
    @Expose
    private Long DefaultTSF;

    /**
    * Whether to associate the dashboard (0 = off, 1 = on).
    */
    @SerializedName("IsRelatedDashboard")
    @Expose
    private Long IsRelatedDashboard;

    /**
    * Associated dashboard id.
    */
    @SerializedName("DashboardTopicID")
    @Expose
    private String DashboardTopicID;

    /**
    * Whether to enable component vulnerability detection (0 = no, 1 = yes).
    */
    @SerializedName("IsInstrumentationVulnerabilityScan")
    @Expose
    private Long IsInstrumentationVulnerabilityScan;

    /**
    * Whether to enable sql injection analysis (0: off, 1: on).
    */
    @SerializedName("IsSqlInjectionAnalysis")
    @Expose
    private Long IsSqlInjectionAnalysis;

    /**
    * Reasons for traffic throttling.
Official version quota;.
Trial version quota.
Trial version expiration;.
Account in arrears.
}.
    */
    @SerializedName("StopReason")
    @Expose
    private Long StopReason;

    /**
    * Whether to enable detection of remote command execution (0 = disabled; 1 = enabled).
    */
    @SerializedName("IsRemoteCommandExecutionAnalysis")
    @Expose
    private Long IsRemoteCommandExecutionAnalysis;

    /**
    * Whether to enable detection of Java webshell execution (0 = disabled; 1 = enabled).
    */
    @SerializedName("IsMemoryHijackingAnalysis")
    @Expose
    private Long IsMemoryHijackingAnalysis;

    /**
    * CLS index type. (0 = full-text index; 1 = key-value index).
    */
    @SerializedName("LogIndexType")
    @Expose
    private Long LogIndexType;

    /**
    * Index key of traceId. It is valid when the CLS index type is key-value index.
    */
    @SerializedName("LogTraceIdKey")
    @Expose
    private String LogTraceIdKey;

    /**
    * Whether to enable the detection of deleting arbitrary files. (0 - disabled; 1: enabled.)
    */
    @SerializedName("IsDeleteAnyFileAnalysis")
    @Expose
    private Long IsDeleteAnyFileAnalysis;

    /**
    * Whether to enable the detection of reading arbitrary files. (0 - disabled; 1 - enabled.)
    */
    @SerializedName("IsReadAnyFileAnalysis")
    @Expose
    private Long IsReadAnyFileAnalysis;

    /**
    * Whether to enable the detection of uploading arbitrary files. (0 - disabled; 1 - enabled.)
    */
    @SerializedName("IsUploadAnyFileAnalysis")
    @Expose
    private Long IsUploadAnyFileAnalysis;

    /**
    * Whether to enable the detection of the inclusion of arbitrary files. (0: disabled, 1: enabled.)
    */
    @SerializedName("IsIncludeAnyFileAnalysis")
    @Expose
    private Long IsIncludeAnyFileAnalysis;

    /**
    * Whether to enable traversal detection of the directory. (0 - disabled; 1 - enabled).
    */
    @SerializedName("IsDirectoryTraversalAnalysis")
    @Expose
    private Long IsDirectoryTraversalAnalysis;

    /**
    * Whether to enable template engine injection detection. (0: disabled; 1: enabled.)
    */
    @SerializedName("IsTemplateEngineInjectionAnalysis")
    @Expose
    private Long IsTemplateEngineInjectionAnalysis;

    /**
    * Whether to enable script engine injection detection. (0 - disabled; 1 - enabled.)
    */
    @SerializedName("IsScriptEngineInjectionAnalysis")
    @Expose
    private Long IsScriptEngineInjectionAnalysis;

    /**
    * Whether to enable expression injection detection. (0 - disabled; 1 - enabled.)
    */
    @SerializedName("IsExpressionInjectionAnalysis")
    @Expose
    private Long IsExpressionInjectionAnalysis;

    /**
    * Whether to enable JNDI injection detection. (0 - disabled; 1 - enabled.)
    */
    @SerializedName("IsJNDIInjectionAnalysis")
    @Expose
    private Long IsJNDIInjectionAnalysis;

    /**
    * Whether to enable JNI injection detection. (0 - disabled, 1 - enabled).
    */
    @SerializedName("IsJNIInjectionAnalysis")
    @Expose
    private Long IsJNIInjectionAnalysis;

    /**
    * Whether to enable Webshell backdoor detection. (0 - disabled; 1 - enabled).
    */
    @SerializedName("IsWebshellBackdoorAnalysis")
    @Expose
    private Long IsWebshellBackdoorAnalysis;

    /**
    * Whether to enable deserialization detection. (0 - disabled; 1 - enabled).
    */
    @SerializedName("IsDeserializationAnalysis")
    @Expose
    private Long IsDeserializationAnalysis;

    /**
    * Business system authentication token.
    */
    @SerializedName("Token")
    @Expose
    private String Token;

    /**
    * Convergence threshold for URL long segments.
    */
    @SerializedName("UrlLongSegmentThreshold")
    @Expose
    private Long UrlLongSegmentThreshold;

    /**
    * Convergence threshold for URL numerical segments.
    */
    @SerializedName("UrlNumberSegmentThreshold")
    @Expose
    private Long UrlNumberSegmentThreshold;

    /**
     * Get Business system id. 
     * @return InstanceId Business system id.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Business system id.
     * @param InstanceId Business system id.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Business system name. 
     * @return Name Business system name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Business system name.
     * @param Name Business system name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Business system description information. 
     * @return Description Business system description information.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Business system description information.
     * @param Description Business system description information.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Status of the business system.
{Initializing; running; throttling}. 
     * @return Status Status of the business system.
{Initializing; running; throttling}.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status of the business system.
{Initializing; running; throttling}.
     * @param Status Status of the business system.
{Initializing; running; throttling}.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Region where the business system belongs. 
     * @return Region Region where the business system belongs.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region where the business system belongs.
     * @param Region Region where the business system belongs.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Business system tag list. 
     * @return Tags Business system tag list.
     */
    public ApmTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Business system tag list.
     * @param Tags Business system tag list.
     */
    public void setTags(ApmTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get AppID information. 
     * @return AppId AppID information.
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set AppID information.
     * @param AppId AppID information.
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Creator uin. 
     * @return CreateUin Creator uin.
     */
    public String getCreateUin() {
        return this.CreateUin;
    }

    /**
     * Set Creator uin.
     * @param CreateUin Creator uin.
     */
    public void setCreateUin(String CreateUin) {
        this.CreateUin = CreateUin;
    }

    /**
     * Get Storage used (unit: mb). 
     * @return AmountOfUsedStorage Storage used (unit: mb).
     */
    public Float getAmountOfUsedStorage() {
        return this.AmountOfUsedStorage;
    }

    /**
     * Set Storage used (unit: mb).
     * @param AmountOfUsedStorage Storage used (unit: mb).
     */
    public void setAmountOfUsedStorage(Float AmountOfUsedStorage) {
        this.AmountOfUsedStorage = AmountOfUsedStorage;
    }

    /**
     * Get Quantity of server applications of the business system. 
     * @return ServiceCount Quantity of server applications of the business system.
     */
    public Long getServiceCount() {
        return this.ServiceCount;
    }

    /**
     * Set Quantity of server applications of the business system.
     * @param ServiceCount Quantity of server applications of the business system.
     */
    public void setServiceCount(Long ServiceCount) {
        this.ServiceCount = ServiceCount;
    }

    /**
     * Get Average daily reported span count. 
     * @return CountOfReportSpanPerDay Average daily reported span count.
     */
    public Long getCountOfReportSpanPerDay() {
        return this.CountOfReportSpanPerDay;
    }

    /**
     * Set Average daily reported span count.
     * @param CountOfReportSpanPerDay Average daily reported span count.
     */
    public void setCountOfReportSpanPerDay(Long CountOfReportSpanPerDay) {
        this.CountOfReportSpanPerDay = CountOfReportSpanPerDay;
    }

    /**
     * Get Retention period of trace data (unit: days). 
     * @return TraceDuration Retention period of trace data (unit: days).
     */
    public Long getTraceDuration() {
        return this.TraceDuration;
    }

    /**
     * Set Retention period of trace data (unit: days).
     * @param TraceDuration Retention period of trace data (unit: days).
     */
    public void setTraceDuration(Long TraceDuration) {
        this.TraceDuration = TraceDuration;
    }

    /**
     * Get Business system report limit. 
     * @return SpanDailyCounters Business system report limit.
     */
    public Long getSpanDailyCounters() {
        return this.SpanDailyCounters;
    }

    /**
     * Set Business system report limit.
     * @param SpanDailyCounters Business system report limit.
     */
    public void setSpanDailyCounters(Long SpanDailyCounters) {
        this.SpanDailyCounters = SpanDailyCounters;
    }

    /**
     * Get Whether the business system billing is Activated (0 = not activated, 1 = activated). 
     * @return BillingInstance Whether the business system billing is Activated (0 = not activated, 1 = activated).
     */
    public Long getBillingInstance() {
        return this.BillingInstance;
    }

    /**
     * Set Whether the business system billing is Activated (0 = not activated, 1 = activated).
     * @param BillingInstance Whether the business system billing is Activated (0 = not activated, 1 = activated).
     */
    public void setBillingInstance(Long BillingInstance) {
        this.BillingInstance = BillingInstance;
    }

    /**
     * Get Error warning line (unit: %). 
     * @return ErrRateThreshold Error warning line (unit: %).
     */
    public Long getErrRateThreshold() {
        return this.ErrRateThreshold;
    }

    /**
     * Set Error warning line (unit: %).
     * @param ErrRateThreshold Error warning line (unit: %).
     */
    public void setErrRateThreshold(Long ErrRateThreshold) {
        this.ErrRateThreshold = ErrRateThreshold;
    }

    /**
     * Get Sampling rate (unit: %). 
     * @return SampleRate Sampling rate (unit: %).
     */
    public Long getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set Sampling rate (unit: %).
     * @param SampleRate Sampling rate (unit: %).
     */
    public void setSampleRate(Long SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * Get Error sampling switch (0: off, 1: on). 
     * @return ErrorSample Error sampling switch (0: off, 1: on).
     */
    public Long getErrorSample() {
        return this.ErrorSample;
    }

    /**
     * Set Error sampling switch (0: off, 1: on).
     * @param ErrorSample Error sampling switch (0: off, 1: on).
     */
    public void setErrorSample(Long ErrorSample) {
        this.ErrorSample = ErrorSample;
    }

    /**
     * Get Sampling slow call saving threshold (unit: ms). 
     * @return SlowRequestSavedThreshold Sampling slow call saving threshold (unit: ms).
     */
    public Long getSlowRequestSavedThreshold() {
        return this.SlowRequestSavedThreshold;
    }

    /**
     * Set Sampling slow call saving threshold (unit: ms).
     * @param SlowRequestSavedThreshold Sampling slow call saving threshold (unit: ms).
     */
    public void setSlowRequestSavedThreshold(Long SlowRequestSavedThreshold) {
        this.SlowRequestSavedThreshold = SlowRequestSavedThreshold;
    }

    /**
     * Get CLS log region. 
     * @return LogRegion CLS log region.
     */
    public String getLogRegion() {
        return this.LogRegion;
    }

    /**
     * Set CLS log region.
     * @param LogRegion CLS log region.
     */
    public void setLogRegion(String LogRegion) {
        this.LogRegion = LogRegion;
    }

    /**
     * Get Log source. 
     * @return LogSource Log source.
     */
    public String getLogSource() {
        return this.LogSource;
    }

    /**
     * Set Log source.
     * @param LogSource Log source.
     */
    public void setLogSource(String LogSource) {
        this.LogSource = LogSource;
    }

    /**
     * Get Log feature switch (0: off; 1: on). 
     * @return IsRelatedLog Log feature switch (0: off; 1: on).
     */
    public Long getIsRelatedLog() {
        return this.IsRelatedLog;
    }

    /**
     * Set Log feature switch (0: off; 1: on).
     * @param IsRelatedLog Log feature switch (0: off; 1: on).
     */
    public void setIsRelatedLog(Long IsRelatedLog) {
        this.IsRelatedLog = IsRelatedLog;
    }

    /**
     * Get Log topic id. 
     * @return LogTopicID Log topic id.
     */
    public String getLogTopicID() {
        return this.LogTopicID;
    }

    /**
     * Set Log topic id.
     * @param LogTopicID Log topic id.
     */
    public void setLogTopicID(String LogTopicID) {
        this.LogTopicID = LogTopicID;
    }

    /**
     * Get Quantity of client applications of the business system. 
     * @return ClientCount Quantity of client applications of the business system.
     */
    public Long getClientCount() {
        return this.ClientCount;
    }

    /**
     * Set Quantity of client applications of the business system.
     * @param ClientCount Quantity of client applications of the business system.
     */
    public void setClientCount(Long ClientCount) {
        this.ClientCount = ClientCount;
    }

    /**
     * Get The quantity of active applications in this business system in the last two days. 
     * @return TotalCount The quantity of active applications in this business system in the last two days.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set The quantity of active applications in this business system in the last two days.
     * @param TotalCount The quantity of active applications in this business system in the last two days.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get CLS log set. 
     * @return LogSet CLS log set.
     */
    public String getLogSet() {
        return this.LogSet;
    }

    /**
     * Set CLS log set.
     * @param LogSet CLS log set.
     */
    public void setLogSet(String LogSet) {
        this.LogSet = LogSet;
    }

    /**
     * Get Retention period of metric data (unit: days). 
     * @return MetricDuration Retention period of metric data (unit: days).
     */
    public Long getMetricDuration() {
        return this.MetricDuration;
    }

    /**
     * Set Retention period of metric data (unit: days).
     * @param MetricDuration Retention period of metric data (unit: days).
     */
    public void setMetricDuration(Long MetricDuration) {
        this.MetricDuration = MetricDuration;
    }

    /**
     * Get List of custom display tags. 
     * @return CustomShowTags List of custom display tags.
     */
    public String [] getCustomShowTags() {
        return this.CustomShowTags;
    }

    /**
     * Set List of custom display tags.
     * @param CustomShowTags List of custom display tags.
     */
    public void setCustomShowTags(String [] CustomShowTags) {
        this.CustomShowTags = CustomShowTags;
    }

    /**
     * Get Business system billing mode (1: prepaid, 0: pay-as-you-go). 
     * @return PayMode Business system billing mode (1: prepaid, 0: pay-as-you-go).
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Business system billing mode (1: prepaid, 0: pay-as-you-go).
     * @param PayMode Business system billing mode (1: prepaid, 0: pay-as-you-go).
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Indicates whether the billing mode of the business system takes effect. 
     * @return PayModeEffective Indicates whether the billing mode of the business system takes effect.
     */
    public Boolean getPayModeEffective() {
        return this.PayModeEffective;
    }

    /**
     * Set Indicates whether the billing mode of the business system takes effect.
     * @param PayModeEffective Indicates whether the billing mode of the business system takes effect.
     */
    public void setPayModeEffective(Boolean PayModeEffective) {
        this.PayModeEffective = PayModeEffective;
    }

    /**
     * Get Response time warning line (unit: ms). 
     * @return ResponseDurationWarningThreshold Response time warning line (unit: ms).
     */
    public Long getResponseDurationWarningThreshold() {
        return this.ResponseDurationWarningThreshold;
    }

    /**
     * Set Response time warning line (unit: ms).
     * @param ResponseDurationWarningThreshold Response time warning line (unit: ms).
     */
    public void setResponseDurationWarningThreshold(Long ResponseDurationWarningThreshold) {
        this.ResponseDurationWarningThreshold = ResponseDurationWarningThreshold;
    }

    /**
     * Get Whether it is free (0 = no; 1 = limited free; 2 = completely free), default 0. 
     * @return Free Whether it is free (0 = no; 1 = limited free; 2 = completely free), default 0.
     */
    public Long getFree() {
        return this.Free;
    }

    /**
     * Set Whether it is free (0 = no; 1 = limited free; 2 = completely free), default 0.
     * @param Free Whether it is free (0 = no; 1 = limited free; 2 = completely free), default 0.
     */
    public void setFree(Long Free) {
        this.Free = Free;
    }

    /**
     * Get Indicates whether it is the default business system of tsf (0 = no, 1 = yes). 
     * @return DefaultTSF Indicates whether it is the default business system of tsf (0 = no, 1 = yes).
     */
    public Long getDefaultTSF() {
        return this.DefaultTSF;
    }

    /**
     * Set Indicates whether it is the default business system of tsf (0 = no, 1 = yes).
     * @param DefaultTSF Indicates whether it is the default business system of tsf (0 = no, 1 = yes).
     */
    public void setDefaultTSF(Long DefaultTSF) {
        this.DefaultTSF = DefaultTSF;
    }

    /**
     * Get Whether to associate the dashboard (0 = off, 1 = on). 
     * @return IsRelatedDashboard Whether to associate the dashboard (0 = off, 1 = on).
     */
    public Long getIsRelatedDashboard() {
        return this.IsRelatedDashboard;
    }

    /**
     * Set Whether to associate the dashboard (0 = off, 1 = on).
     * @param IsRelatedDashboard Whether to associate the dashboard (0 = off, 1 = on).
     */
    public void setIsRelatedDashboard(Long IsRelatedDashboard) {
        this.IsRelatedDashboard = IsRelatedDashboard;
    }

    /**
     * Get Associated dashboard id. 
     * @return DashboardTopicID Associated dashboard id.
     */
    public String getDashboardTopicID() {
        return this.DashboardTopicID;
    }

    /**
     * Set Associated dashboard id.
     * @param DashboardTopicID Associated dashboard id.
     */
    public void setDashboardTopicID(String DashboardTopicID) {
        this.DashboardTopicID = DashboardTopicID;
    }

    /**
     * Get Whether to enable component vulnerability detection (0 = no, 1 = yes). 
     * @return IsInstrumentationVulnerabilityScan Whether to enable component vulnerability detection (0 = no, 1 = yes).
     */
    public Long getIsInstrumentationVulnerabilityScan() {
        return this.IsInstrumentationVulnerabilityScan;
    }

    /**
     * Set Whether to enable component vulnerability detection (0 = no, 1 = yes).
     * @param IsInstrumentationVulnerabilityScan Whether to enable component vulnerability detection (0 = no, 1 = yes).
     */
    public void setIsInstrumentationVulnerabilityScan(Long IsInstrumentationVulnerabilityScan) {
        this.IsInstrumentationVulnerabilityScan = IsInstrumentationVulnerabilityScan;
    }

    /**
     * Get Whether to enable sql injection analysis (0: off, 1: on). 
     * @return IsSqlInjectionAnalysis Whether to enable sql injection analysis (0: off, 1: on).
     */
    public Long getIsSqlInjectionAnalysis() {
        return this.IsSqlInjectionAnalysis;
    }

    /**
     * Set Whether to enable sql injection analysis (0: off, 1: on).
     * @param IsSqlInjectionAnalysis Whether to enable sql injection analysis (0: off, 1: on).
     */
    public void setIsSqlInjectionAnalysis(Long IsSqlInjectionAnalysis) {
        this.IsSqlInjectionAnalysis = IsSqlInjectionAnalysis;
    }

    /**
     * Get Reasons for traffic throttling.
Official version quota;.
Trial version quota.
Trial version expiration;.
Account in arrears.
}. 
     * @return StopReason Reasons for traffic throttling.
Official version quota;.
Trial version quota.
Trial version expiration;.
Account in arrears.
}.
     */
    public Long getStopReason() {
        return this.StopReason;
    }

    /**
     * Set Reasons for traffic throttling.
Official version quota;.
Trial version quota.
Trial version expiration;.
Account in arrears.
}.
     * @param StopReason Reasons for traffic throttling.
Official version quota;.
Trial version quota.
Trial version expiration;.
Account in arrears.
}.
     */
    public void setStopReason(Long StopReason) {
        this.StopReason = StopReason;
    }

    /**
     * Get Whether to enable detection of remote command execution (0 = disabled; 1 = enabled). 
     * @return IsRemoteCommandExecutionAnalysis Whether to enable detection of remote command execution (0 = disabled; 1 = enabled).
     */
    public Long getIsRemoteCommandExecutionAnalysis() {
        return this.IsRemoteCommandExecutionAnalysis;
    }

    /**
     * Set Whether to enable detection of remote command execution (0 = disabled; 1 = enabled).
     * @param IsRemoteCommandExecutionAnalysis Whether to enable detection of remote command execution (0 = disabled; 1 = enabled).
     */
    public void setIsRemoteCommandExecutionAnalysis(Long IsRemoteCommandExecutionAnalysis) {
        this.IsRemoteCommandExecutionAnalysis = IsRemoteCommandExecutionAnalysis;
    }

    /**
     * Get Whether to enable detection of Java webshell execution (0 = disabled; 1 = enabled). 
     * @return IsMemoryHijackingAnalysis Whether to enable detection of Java webshell execution (0 = disabled; 1 = enabled).
     */
    public Long getIsMemoryHijackingAnalysis() {
        return this.IsMemoryHijackingAnalysis;
    }

    /**
     * Set Whether to enable detection of Java webshell execution (0 = disabled; 1 = enabled).
     * @param IsMemoryHijackingAnalysis Whether to enable detection of Java webshell execution (0 = disabled; 1 = enabled).
     */
    public void setIsMemoryHijackingAnalysis(Long IsMemoryHijackingAnalysis) {
        this.IsMemoryHijackingAnalysis = IsMemoryHijackingAnalysis;
    }

    /**
     * Get CLS index type. (0 = full-text index; 1 = key-value index). 
     * @return LogIndexType CLS index type. (0 = full-text index; 1 = key-value index).
     */
    public Long getLogIndexType() {
        return this.LogIndexType;
    }

    /**
     * Set CLS index type. (0 = full-text index; 1 = key-value index).
     * @param LogIndexType CLS index type. (0 = full-text index; 1 = key-value index).
     */
    public void setLogIndexType(Long LogIndexType) {
        this.LogIndexType = LogIndexType;
    }

    /**
     * Get Index key of traceId. It is valid when the CLS index type is key-value index. 
     * @return LogTraceIdKey Index key of traceId. It is valid when the CLS index type is key-value index.
     */
    public String getLogTraceIdKey() {
        return this.LogTraceIdKey;
    }

    /**
     * Set Index key of traceId. It is valid when the CLS index type is key-value index.
     * @param LogTraceIdKey Index key of traceId. It is valid when the CLS index type is key-value index.
     */
    public void setLogTraceIdKey(String LogTraceIdKey) {
        this.LogTraceIdKey = LogTraceIdKey;
    }

    /**
     * Get Whether to enable the detection of deleting arbitrary files. (0 - disabled; 1: enabled.) 
     * @return IsDeleteAnyFileAnalysis Whether to enable the detection of deleting arbitrary files. (0 - disabled; 1: enabled.)
     */
    public Long getIsDeleteAnyFileAnalysis() {
        return this.IsDeleteAnyFileAnalysis;
    }

    /**
     * Set Whether to enable the detection of deleting arbitrary files. (0 - disabled; 1: enabled.)
     * @param IsDeleteAnyFileAnalysis Whether to enable the detection of deleting arbitrary files. (0 - disabled; 1: enabled.)
     */
    public void setIsDeleteAnyFileAnalysis(Long IsDeleteAnyFileAnalysis) {
        this.IsDeleteAnyFileAnalysis = IsDeleteAnyFileAnalysis;
    }

    /**
     * Get Whether to enable the detection of reading arbitrary files. (0 - disabled; 1 - enabled.) 
     * @return IsReadAnyFileAnalysis Whether to enable the detection of reading arbitrary files. (0 - disabled; 1 - enabled.)
     */
    public Long getIsReadAnyFileAnalysis() {
        return this.IsReadAnyFileAnalysis;
    }

    /**
     * Set Whether to enable the detection of reading arbitrary files. (0 - disabled; 1 - enabled.)
     * @param IsReadAnyFileAnalysis Whether to enable the detection of reading arbitrary files. (0 - disabled; 1 - enabled.)
     */
    public void setIsReadAnyFileAnalysis(Long IsReadAnyFileAnalysis) {
        this.IsReadAnyFileAnalysis = IsReadAnyFileAnalysis;
    }

    /**
     * Get Whether to enable the detection of uploading arbitrary files. (0 - disabled; 1 - enabled.) 
     * @return IsUploadAnyFileAnalysis Whether to enable the detection of uploading arbitrary files. (0 - disabled; 1 - enabled.)
     */
    public Long getIsUploadAnyFileAnalysis() {
        return this.IsUploadAnyFileAnalysis;
    }

    /**
     * Set Whether to enable the detection of uploading arbitrary files. (0 - disabled; 1 - enabled.)
     * @param IsUploadAnyFileAnalysis Whether to enable the detection of uploading arbitrary files. (0 - disabled; 1 - enabled.)
     */
    public void setIsUploadAnyFileAnalysis(Long IsUploadAnyFileAnalysis) {
        this.IsUploadAnyFileAnalysis = IsUploadAnyFileAnalysis;
    }

    /**
     * Get Whether to enable the detection of the inclusion of arbitrary files. (0: disabled, 1: enabled.) 
     * @return IsIncludeAnyFileAnalysis Whether to enable the detection of the inclusion of arbitrary files. (0: disabled, 1: enabled.)
     */
    public Long getIsIncludeAnyFileAnalysis() {
        return this.IsIncludeAnyFileAnalysis;
    }

    /**
     * Set Whether to enable the detection of the inclusion of arbitrary files. (0: disabled, 1: enabled.)
     * @param IsIncludeAnyFileAnalysis Whether to enable the detection of the inclusion of arbitrary files. (0: disabled, 1: enabled.)
     */
    public void setIsIncludeAnyFileAnalysis(Long IsIncludeAnyFileAnalysis) {
        this.IsIncludeAnyFileAnalysis = IsIncludeAnyFileAnalysis;
    }

    /**
     * Get Whether to enable traversal detection of the directory. (0 - disabled; 1 - enabled). 
     * @return IsDirectoryTraversalAnalysis Whether to enable traversal detection of the directory. (0 - disabled; 1 - enabled).
     */
    public Long getIsDirectoryTraversalAnalysis() {
        return this.IsDirectoryTraversalAnalysis;
    }

    /**
     * Set Whether to enable traversal detection of the directory. (0 - disabled; 1 - enabled).
     * @param IsDirectoryTraversalAnalysis Whether to enable traversal detection of the directory. (0 - disabled; 1 - enabled).
     */
    public void setIsDirectoryTraversalAnalysis(Long IsDirectoryTraversalAnalysis) {
        this.IsDirectoryTraversalAnalysis = IsDirectoryTraversalAnalysis;
    }

    /**
     * Get Whether to enable template engine injection detection. (0: disabled; 1: enabled.) 
     * @return IsTemplateEngineInjectionAnalysis Whether to enable template engine injection detection. (0: disabled; 1: enabled.)
     */
    public Long getIsTemplateEngineInjectionAnalysis() {
        return this.IsTemplateEngineInjectionAnalysis;
    }

    /**
     * Set Whether to enable template engine injection detection. (0: disabled; 1: enabled.)
     * @param IsTemplateEngineInjectionAnalysis Whether to enable template engine injection detection. (0: disabled; 1: enabled.)
     */
    public void setIsTemplateEngineInjectionAnalysis(Long IsTemplateEngineInjectionAnalysis) {
        this.IsTemplateEngineInjectionAnalysis = IsTemplateEngineInjectionAnalysis;
    }

    /**
     * Get Whether to enable script engine injection detection. (0 - disabled; 1 - enabled.) 
     * @return IsScriptEngineInjectionAnalysis Whether to enable script engine injection detection. (0 - disabled; 1 - enabled.)
     */
    public Long getIsScriptEngineInjectionAnalysis() {
        return this.IsScriptEngineInjectionAnalysis;
    }

    /**
     * Set Whether to enable script engine injection detection. (0 - disabled; 1 - enabled.)
     * @param IsScriptEngineInjectionAnalysis Whether to enable script engine injection detection. (0 - disabled; 1 - enabled.)
     */
    public void setIsScriptEngineInjectionAnalysis(Long IsScriptEngineInjectionAnalysis) {
        this.IsScriptEngineInjectionAnalysis = IsScriptEngineInjectionAnalysis;
    }

    /**
     * Get Whether to enable expression injection detection. (0 - disabled; 1 - enabled.) 
     * @return IsExpressionInjectionAnalysis Whether to enable expression injection detection. (0 - disabled; 1 - enabled.)
     */
    public Long getIsExpressionInjectionAnalysis() {
        return this.IsExpressionInjectionAnalysis;
    }

    /**
     * Set Whether to enable expression injection detection. (0 - disabled; 1 - enabled.)
     * @param IsExpressionInjectionAnalysis Whether to enable expression injection detection. (0 - disabled; 1 - enabled.)
     */
    public void setIsExpressionInjectionAnalysis(Long IsExpressionInjectionAnalysis) {
        this.IsExpressionInjectionAnalysis = IsExpressionInjectionAnalysis;
    }

    /**
     * Get Whether to enable JNDI injection detection. (0 - disabled; 1 - enabled.) 
     * @return IsJNDIInjectionAnalysis Whether to enable JNDI injection detection. (0 - disabled; 1 - enabled.)
     */
    public Long getIsJNDIInjectionAnalysis() {
        return this.IsJNDIInjectionAnalysis;
    }

    /**
     * Set Whether to enable JNDI injection detection. (0 - disabled; 1 - enabled.)
     * @param IsJNDIInjectionAnalysis Whether to enable JNDI injection detection. (0 - disabled; 1 - enabled.)
     */
    public void setIsJNDIInjectionAnalysis(Long IsJNDIInjectionAnalysis) {
        this.IsJNDIInjectionAnalysis = IsJNDIInjectionAnalysis;
    }

    /**
     * Get Whether to enable JNI injection detection. (0 - disabled, 1 - enabled). 
     * @return IsJNIInjectionAnalysis Whether to enable JNI injection detection. (0 - disabled, 1 - enabled).
     */
    public Long getIsJNIInjectionAnalysis() {
        return this.IsJNIInjectionAnalysis;
    }

    /**
     * Set Whether to enable JNI injection detection. (0 - disabled, 1 - enabled).
     * @param IsJNIInjectionAnalysis Whether to enable JNI injection detection. (0 - disabled, 1 - enabled).
     */
    public void setIsJNIInjectionAnalysis(Long IsJNIInjectionAnalysis) {
        this.IsJNIInjectionAnalysis = IsJNIInjectionAnalysis;
    }

    /**
     * Get Whether to enable Webshell backdoor detection. (0 - disabled; 1 - enabled). 
     * @return IsWebshellBackdoorAnalysis Whether to enable Webshell backdoor detection. (0 - disabled; 1 - enabled).
     */
    public Long getIsWebshellBackdoorAnalysis() {
        return this.IsWebshellBackdoorAnalysis;
    }

    /**
     * Set Whether to enable Webshell backdoor detection. (0 - disabled; 1 - enabled).
     * @param IsWebshellBackdoorAnalysis Whether to enable Webshell backdoor detection. (0 - disabled; 1 - enabled).
     */
    public void setIsWebshellBackdoorAnalysis(Long IsWebshellBackdoorAnalysis) {
        this.IsWebshellBackdoorAnalysis = IsWebshellBackdoorAnalysis;
    }

    /**
     * Get Whether to enable deserialization detection. (0 - disabled; 1 - enabled). 
     * @return IsDeserializationAnalysis Whether to enable deserialization detection. (0 - disabled; 1 - enabled).
     */
    public Long getIsDeserializationAnalysis() {
        return this.IsDeserializationAnalysis;
    }

    /**
     * Set Whether to enable deserialization detection. (0 - disabled; 1 - enabled).
     * @param IsDeserializationAnalysis Whether to enable deserialization detection. (0 - disabled; 1 - enabled).
     */
    public void setIsDeserializationAnalysis(Long IsDeserializationAnalysis) {
        this.IsDeserializationAnalysis = IsDeserializationAnalysis;
    }

    /**
     * Get Business system authentication token. 
     * @return Token Business system authentication token.
     */
    public String getToken() {
        return this.Token;
    }

    /**
     * Set Business system authentication token.
     * @param Token Business system authentication token.
     */
    public void setToken(String Token) {
        this.Token = Token;
    }

    /**
     * Get Convergence threshold for URL long segments. 
     * @return UrlLongSegmentThreshold Convergence threshold for URL long segments.
     */
    public Long getUrlLongSegmentThreshold() {
        return this.UrlLongSegmentThreshold;
    }

    /**
     * Set Convergence threshold for URL long segments.
     * @param UrlLongSegmentThreshold Convergence threshold for URL long segments.
     */
    public void setUrlLongSegmentThreshold(Long UrlLongSegmentThreshold) {
        this.UrlLongSegmentThreshold = UrlLongSegmentThreshold;
    }

    /**
     * Get Convergence threshold for URL numerical segments. 
     * @return UrlNumberSegmentThreshold Convergence threshold for URL numerical segments.
     */
    public Long getUrlNumberSegmentThreshold() {
        return this.UrlNumberSegmentThreshold;
    }

    /**
     * Set Convergence threshold for URL numerical segments.
     * @param UrlNumberSegmentThreshold Convergence threshold for URL numerical segments.
     */
    public void setUrlNumberSegmentThreshold(Long UrlNumberSegmentThreshold) {
        this.UrlNumberSegmentThreshold = UrlNumberSegmentThreshold;
    }

    public ApmInstanceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApmInstanceDetail(ApmInstanceDetail source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Tags != null) {
            this.Tags = new ApmTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new ApmTag(source.Tags[i]);
            }
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.CreateUin != null) {
            this.CreateUin = new String(source.CreateUin);
        }
        if (source.AmountOfUsedStorage != null) {
            this.AmountOfUsedStorage = new Float(source.AmountOfUsedStorage);
        }
        if (source.ServiceCount != null) {
            this.ServiceCount = new Long(source.ServiceCount);
        }
        if (source.CountOfReportSpanPerDay != null) {
            this.CountOfReportSpanPerDay = new Long(source.CountOfReportSpanPerDay);
        }
        if (source.TraceDuration != null) {
            this.TraceDuration = new Long(source.TraceDuration);
        }
        if (source.SpanDailyCounters != null) {
            this.SpanDailyCounters = new Long(source.SpanDailyCounters);
        }
        if (source.BillingInstance != null) {
            this.BillingInstance = new Long(source.BillingInstance);
        }
        if (source.ErrRateThreshold != null) {
            this.ErrRateThreshold = new Long(source.ErrRateThreshold);
        }
        if (source.SampleRate != null) {
            this.SampleRate = new Long(source.SampleRate);
        }
        if (source.ErrorSample != null) {
            this.ErrorSample = new Long(source.ErrorSample);
        }
        if (source.SlowRequestSavedThreshold != null) {
            this.SlowRequestSavedThreshold = new Long(source.SlowRequestSavedThreshold);
        }
        if (source.LogRegion != null) {
            this.LogRegion = new String(source.LogRegion);
        }
        if (source.LogSource != null) {
            this.LogSource = new String(source.LogSource);
        }
        if (source.IsRelatedLog != null) {
            this.IsRelatedLog = new Long(source.IsRelatedLog);
        }
        if (source.LogTopicID != null) {
            this.LogTopicID = new String(source.LogTopicID);
        }
        if (source.ClientCount != null) {
            this.ClientCount = new Long(source.ClientCount);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.LogSet != null) {
            this.LogSet = new String(source.LogSet);
        }
        if (source.MetricDuration != null) {
            this.MetricDuration = new Long(source.MetricDuration);
        }
        if (source.CustomShowTags != null) {
            this.CustomShowTags = new String[source.CustomShowTags.length];
            for (int i = 0; i < source.CustomShowTags.length; i++) {
                this.CustomShowTags[i] = new String(source.CustomShowTags[i]);
            }
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.PayModeEffective != null) {
            this.PayModeEffective = new Boolean(source.PayModeEffective);
        }
        if (source.ResponseDurationWarningThreshold != null) {
            this.ResponseDurationWarningThreshold = new Long(source.ResponseDurationWarningThreshold);
        }
        if (source.Free != null) {
            this.Free = new Long(source.Free);
        }
        if (source.DefaultTSF != null) {
            this.DefaultTSF = new Long(source.DefaultTSF);
        }
        if (source.IsRelatedDashboard != null) {
            this.IsRelatedDashboard = new Long(source.IsRelatedDashboard);
        }
        if (source.DashboardTopicID != null) {
            this.DashboardTopicID = new String(source.DashboardTopicID);
        }
        if (source.IsInstrumentationVulnerabilityScan != null) {
            this.IsInstrumentationVulnerabilityScan = new Long(source.IsInstrumentationVulnerabilityScan);
        }
        if (source.IsSqlInjectionAnalysis != null) {
            this.IsSqlInjectionAnalysis = new Long(source.IsSqlInjectionAnalysis);
        }
        if (source.StopReason != null) {
            this.StopReason = new Long(source.StopReason);
        }
        if (source.IsRemoteCommandExecutionAnalysis != null) {
            this.IsRemoteCommandExecutionAnalysis = new Long(source.IsRemoteCommandExecutionAnalysis);
        }
        if (source.IsMemoryHijackingAnalysis != null) {
            this.IsMemoryHijackingAnalysis = new Long(source.IsMemoryHijackingAnalysis);
        }
        if (source.LogIndexType != null) {
            this.LogIndexType = new Long(source.LogIndexType);
        }
        if (source.LogTraceIdKey != null) {
            this.LogTraceIdKey = new String(source.LogTraceIdKey);
        }
        if (source.IsDeleteAnyFileAnalysis != null) {
            this.IsDeleteAnyFileAnalysis = new Long(source.IsDeleteAnyFileAnalysis);
        }
        if (source.IsReadAnyFileAnalysis != null) {
            this.IsReadAnyFileAnalysis = new Long(source.IsReadAnyFileAnalysis);
        }
        if (source.IsUploadAnyFileAnalysis != null) {
            this.IsUploadAnyFileAnalysis = new Long(source.IsUploadAnyFileAnalysis);
        }
        if (source.IsIncludeAnyFileAnalysis != null) {
            this.IsIncludeAnyFileAnalysis = new Long(source.IsIncludeAnyFileAnalysis);
        }
        if (source.IsDirectoryTraversalAnalysis != null) {
            this.IsDirectoryTraversalAnalysis = new Long(source.IsDirectoryTraversalAnalysis);
        }
        if (source.IsTemplateEngineInjectionAnalysis != null) {
            this.IsTemplateEngineInjectionAnalysis = new Long(source.IsTemplateEngineInjectionAnalysis);
        }
        if (source.IsScriptEngineInjectionAnalysis != null) {
            this.IsScriptEngineInjectionAnalysis = new Long(source.IsScriptEngineInjectionAnalysis);
        }
        if (source.IsExpressionInjectionAnalysis != null) {
            this.IsExpressionInjectionAnalysis = new Long(source.IsExpressionInjectionAnalysis);
        }
        if (source.IsJNDIInjectionAnalysis != null) {
            this.IsJNDIInjectionAnalysis = new Long(source.IsJNDIInjectionAnalysis);
        }
        if (source.IsJNIInjectionAnalysis != null) {
            this.IsJNIInjectionAnalysis = new Long(source.IsJNIInjectionAnalysis);
        }
        if (source.IsWebshellBackdoorAnalysis != null) {
            this.IsWebshellBackdoorAnalysis = new Long(source.IsWebshellBackdoorAnalysis);
        }
        if (source.IsDeserializationAnalysis != null) {
            this.IsDeserializationAnalysis = new Long(source.IsDeserializationAnalysis);
        }
        if (source.Token != null) {
            this.Token = new String(source.Token);
        }
        if (source.UrlLongSegmentThreshold != null) {
            this.UrlLongSegmentThreshold = new Long(source.UrlLongSegmentThreshold);
        }
        if (source.UrlNumberSegmentThreshold != null) {
            this.UrlNumberSegmentThreshold = new Long(source.UrlNumberSegmentThreshold);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "CreateUin", this.CreateUin);
        this.setParamSimple(map, prefix + "AmountOfUsedStorage", this.AmountOfUsedStorage);
        this.setParamSimple(map, prefix + "ServiceCount", this.ServiceCount);
        this.setParamSimple(map, prefix + "CountOfReportSpanPerDay", this.CountOfReportSpanPerDay);
        this.setParamSimple(map, prefix + "TraceDuration", this.TraceDuration);
        this.setParamSimple(map, prefix + "SpanDailyCounters", this.SpanDailyCounters);
        this.setParamSimple(map, prefix + "BillingInstance", this.BillingInstance);
        this.setParamSimple(map, prefix + "ErrRateThreshold", this.ErrRateThreshold);
        this.setParamSimple(map, prefix + "SampleRate", this.SampleRate);
        this.setParamSimple(map, prefix + "ErrorSample", this.ErrorSample);
        this.setParamSimple(map, prefix + "SlowRequestSavedThreshold", this.SlowRequestSavedThreshold);
        this.setParamSimple(map, prefix + "LogRegion", this.LogRegion);
        this.setParamSimple(map, prefix + "LogSource", this.LogSource);
        this.setParamSimple(map, prefix + "IsRelatedLog", this.IsRelatedLog);
        this.setParamSimple(map, prefix + "LogTopicID", this.LogTopicID);
        this.setParamSimple(map, prefix + "ClientCount", this.ClientCount);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "LogSet", this.LogSet);
        this.setParamSimple(map, prefix + "MetricDuration", this.MetricDuration);
        this.setParamArraySimple(map, prefix + "CustomShowTags.", this.CustomShowTags);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "PayModeEffective", this.PayModeEffective);
        this.setParamSimple(map, prefix + "ResponseDurationWarningThreshold", this.ResponseDurationWarningThreshold);
        this.setParamSimple(map, prefix + "Free", this.Free);
        this.setParamSimple(map, prefix + "DefaultTSF", this.DefaultTSF);
        this.setParamSimple(map, prefix + "IsRelatedDashboard", this.IsRelatedDashboard);
        this.setParamSimple(map, prefix + "DashboardTopicID", this.DashboardTopicID);
        this.setParamSimple(map, prefix + "IsInstrumentationVulnerabilityScan", this.IsInstrumentationVulnerabilityScan);
        this.setParamSimple(map, prefix + "IsSqlInjectionAnalysis", this.IsSqlInjectionAnalysis);
        this.setParamSimple(map, prefix + "StopReason", this.StopReason);
        this.setParamSimple(map, prefix + "IsRemoteCommandExecutionAnalysis", this.IsRemoteCommandExecutionAnalysis);
        this.setParamSimple(map, prefix + "IsMemoryHijackingAnalysis", this.IsMemoryHijackingAnalysis);
        this.setParamSimple(map, prefix + "LogIndexType", this.LogIndexType);
        this.setParamSimple(map, prefix + "LogTraceIdKey", this.LogTraceIdKey);
        this.setParamSimple(map, prefix + "IsDeleteAnyFileAnalysis", this.IsDeleteAnyFileAnalysis);
        this.setParamSimple(map, prefix + "IsReadAnyFileAnalysis", this.IsReadAnyFileAnalysis);
        this.setParamSimple(map, prefix + "IsUploadAnyFileAnalysis", this.IsUploadAnyFileAnalysis);
        this.setParamSimple(map, prefix + "IsIncludeAnyFileAnalysis", this.IsIncludeAnyFileAnalysis);
        this.setParamSimple(map, prefix + "IsDirectoryTraversalAnalysis", this.IsDirectoryTraversalAnalysis);
        this.setParamSimple(map, prefix + "IsTemplateEngineInjectionAnalysis", this.IsTemplateEngineInjectionAnalysis);
        this.setParamSimple(map, prefix + "IsScriptEngineInjectionAnalysis", this.IsScriptEngineInjectionAnalysis);
        this.setParamSimple(map, prefix + "IsExpressionInjectionAnalysis", this.IsExpressionInjectionAnalysis);
        this.setParamSimple(map, prefix + "IsJNDIInjectionAnalysis", this.IsJNDIInjectionAnalysis);
        this.setParamSimple(map, prefix + "IsJNIInjectionAnalysis", this.IsJNIInjectionAnalysis);
        this.setParamSimple(map, prefix + "IsWebshellBackdoorAnalysis", this.IsWebshellBackdoorAnalysis);
        this.setParamSimple(map, prefix + "IsDeserializationAnalysis", this.IsDeserializationAnalysis);
        this.setParamSimple(map, prefix + "Token", this.Token);
        this.setParamSimple(map, prefix + "UrlLongSegmentThreshold", this.UrlLongSegmentThreshold);
        this.setParamSimple(map, prefix + "UrlNumberSegmentThreshold", this.UrlNumberSegmentThreshold);

    }
}


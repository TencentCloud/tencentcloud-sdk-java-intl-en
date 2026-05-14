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

public class ModifyApmInstanceRequest extends AbstractModel {

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
    * Tag list.
    */
    @SerializedName("Tags")
    @Expose
    private ApmTag [] Tags;

    /**
    * Business system description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Retention period of trace data (unit: days).
    */
    @SerializedName("TraceDuration")
    @Expose
    private Long TraceDuration;

    /**
    * Billing switch.
    */
    @SerializedName("OpenBilling")
    @Expose
    private Boolean OpenBilling;

    /**
    * Business system report limit.
    */
    @SerializedName("SpanDailyCounters")
    @Expose
    private Long SpanDailyCounters;

    /**
    * Error rate warning line. when the average error rate of the application exceeds this threshold, the system will give an abnormal note.
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
    * Log feature switch (0: off; 1: on).
    */
    @SerializedName("IsRelatedLog")
    @Expose
    private Long IsRelatedLog;

    /**
    * Log region, which takes effect after the log feature is enabled.
    */
    @SerializedName("LogRegion")
    @Expose
    private String LogRegion;

    /**
    * CLS log topic id, which takes effect after the log feature is enabled.
    */
    @SerializedName("LogTopicID")
    @Expose
    private String LogTopicID;

    /**
    * Logset, which takes effect only after the log feature is enabled.
    */
    @SerializedName("LogSet")
    @Expose
    private String LogSet;

    /**
    * Log source, which takes effect only after the log feature is enabled.
    */
    @SerializedName("LogSource")
    @Expose
    private String LogSource;

    /**
    * List of custom display tags.
    */
    @SerializedName("CustomShowTags")
    @Expose
    private String [] CustomShowTags;

    /**
    * Modify billing mode (1: prepaid, 0: pay-as-you-go).
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * Response time warning line.
    */
    @SerializedName("ResponseDurationWarningThreshold")
    @Expose
    private Long ResponseDurationWarningThreshold;

    /**
    * Whether it is free (0 = paid edition; 1 = tsf restricted free edition; 2 = free edition), default 0.
    */
    @SerializedName("Free")
    @Expose
    private Long Free;

    /**
    * Whether to associate the dashboard (0 = off, 1 = on).
    */
    @SerializedName("IsRelatedDashboard")
    @Expose
    private Long IsRelatedDashboard;

    /**
    * Associated dashboard id, which takes effect after the associated dashboard is enabled.
    */
    @SerializedName("DashboardTopicID")
    @Expose
    private String DashboardTopicID;

    /**
    * SQL injection detection switch (0: off, 1: on).
    */
    @SerializedName("IsSqlInjectionAnalysis")
    @Expose
    private Long IsSqlInjectionAnalysis;

    /**
    * Whether to enable component vulnerability detection (0 = no, 1 = yes).
    */
    @SerializedName("IsInstrumentationVulnerabilityScan")
    @Expose
    private Long IsInstrumentationVulnerabilityScan;

    /**
    * Whether to enable detection of the remote command attack.
    */
    @SerializedName("IsRemoteCommandExecutionAnalysis")
    @Expose
    private Long IsRemoteCommandExecutionAnalysis;

    /**
    * Whether to enable detection of Java webshell.
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
    * Index key of spanId: This parameter is valid only when the CLS index type is key-value index
    */
    @SerializedName("LogSpanIdKey")
    @Expose
    private String LogSpanIdKey;

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
     * Get Tag list. 
     * @return Tags Tag list.
     */
    public ApmTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag list.
     * @param Tags Tag list.
     */
    public void setTags(ApmTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Business system description. 
     * @return Description Business system description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Business system description.
     * @param Description Business system description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
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
     * Get Billing switch. 
     * @return OpenBilling Billing switch.
     */
    public Boolean getOpenBilling() {
        return this.OpenBilling;
    }

    /**
     * Set Billing switch.
     * @param OpenBilling Billing switch.
     */
    public void setOpenBilling(Boolean OpenBilling) {
        this.OpenBilling = OpenBilling;
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
     * Get Error rate warning line. when the average error rate of the application exceeds this threshold, the system will give an abnormal note. 
     * @return ErrRateThreshold Error rate warning line. when the average error rate of the application exceeds this threshold, the system will give an abnormal note.
     */
    public Long getErrRateThreshold() {
        return this.ErrRateThreshold;
    }

    /**
     * Set Error rate warning line. when the average error rate of the application exceeds this threshold, the system will give an abnormal note.
     * @param ErrRateThreshold Error rate warning line. when the average error rate of the application exceeds this threshold, the system will give an abnormal note.
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
     * Get Log region, which takes effect after the log feature is enabled. 
     * @return LogRegion Log region, which takes effect after the log feature is enabled.
     */
    public String getLogRegion() {
        return this.LogRegion;
    }

    /**
     * Set Log region, which takes effect after the log feature is enabled.
     * @param LogRegion Log region, which takes effect after the log feature is enabled.
     */
    public void setLogRegion(String LogRegion) {
        this.LogRegion = LogRegion;
    }

    /**
     * Get CLS log topic id, which takes effect after the log feature is enabled. 
     * @return LogTopicID CLS log topic id, which takes effect after the log feature is enabled.
     */
    public String getLogTopicID() {
        return this.LogTopicID;
    }

    /**
     * Set CLS log topic id, which takes effect after the log feature is enabled.
     * @param LogTopicID CLS log topic id, which takes effect after the log feature is enabled.
     */
    public void setLogTopicID(String LogTopicID) {
        this.LogTopicID = LogTopicID;
    }

    /**
     * Get Logset, which takes effect only after the log feature is enabled. 
     * @return LogSet Logset, which takes effect only after the log feature is enabled.
     */
    public String getLogSet() {
        return this.LogSet;
    }

    /**
     * Set Logset, which takes effect only after the log feature is enabled.
     * @param LogSet Logset, which takes effect only after the log feature is enabled.
     */
    public void setLogSet(String LogSet) {
        this.LogSet = LogSet;
    }

    /**
     * Get Log source, which takes effect only after the log feature is enabled. 
     * @return LogSource Log source, which takes effect only after the log feature is enabled.
     */
    public String getLogSource() {
        return this.LogSource;
    }

    /**
     * Set Log source, which takes effect only after the log feature is enabled.
     * @param LogSource Log source, which takes effect only after the log feature is enabled.
     */
    public void setLogSource(String LogSource) {
        this.LogSource = LogSource;
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
     * Get Modify billing mode (1: prepaid, 0: pay-as-you-go). 
     * @return PayMode Modify billing mode (1: prepaid, 0: pay-as-you-go).
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Modify billing mode (1: prepaid, 0: pay-as-you-go).
     * @param PayMode Modify billing mode (1: prepaid, 0: pay-as-you-go).
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Response time warning line. 
     * @return ResponseDurationWarningThreshold Response time warning line.
     */
    public Long getResponseDurationWarningThreshold() {
        return this.ResponseDurationWarningThreshold;
    }

    /**
     * Set Response time warning line.
     * @param ResponseDurationWarningThreshold Response time warning line.
     */
    public void setResponseDurationWarningThreshold(Long ResponseDurationWarningThreshold) {
        this.ResponseDurationWarningThreshold = ResponseDurationWarningThreshold;
    }

    /**
     * Get Whether it is free (0 = paid edition; 1 = tsf restricted free edition; 2 = free edition), default 0. 
     * @return Free Whether it is free (0 = paid edition; 1 = tsf restricted free edition; 2 = free edition), default 0.
     */
    public Long getFree() {
        return this.Free;
    }

    /**
     * Set Whether it is free (0 = paid edition; 1 = tsf restricted free edition; 2 = free edition), default 0.
     * @param Free Whether it is free (0 = paid edition; 1 = tsf restricted free edition; 2 = free edition), default 0.
     */
    public void setFree(Long Free) {
        this.Free = Free;
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
     * Get Associated dashboard id, which takes effect after the associated dashboard is enabled. 
     * @return DashboardTopicID Associated dashboard id, which takes effect after the associated dashboard is enabled.
     */
    public String getDashboardTopicID() {
        return this.DashboardTopicID;
    }

    /**
     * Set Associated dashboard id, which takes effect after the associated dashboard is enabled.
     * @param DashboardTopicID Associated dashboard id, which takes effect after the associated dashboard is enabled.
     */
    public void setDashboardTopicID(String DashboardTopicID) {
        this.DashboardTopicID = DashboardTopicID;
    }

    /**
     * Get SQL injection detection switch (0: off, 1: on). 
     * @return IsSqlInjectionAnalysis SQL injection detection switch (0: off, 1: on).
     */
    public Long getIsSqlInjectionAnalysis() {
        return this.IsSqlInjectionAnalysis;
    }

    /**
     * Set SQL injection detection switch (0: off, 1: on).
     * @param IsSqlInjectionAnalysis SQL injection detection switch (0: off, 1: on).
     */
    public void setIsSqlInjectionAnalysis(Long IsSqlInjectionAnalysis) {
        this.IsSqlInjectionAnalysis = IsSqlInjectionAnalysis;
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
     * Get Whether to enable detection of the remote command attack. 
     * @return IsRemoteCommandExecutionAnalysis Whether to enable detection of the remote command attack.
     */
    public Long getIsRemoteCommandExecutionAnalysis() {
        return this.IsRemoteCommandExecutionAnalysis;
    }

    /**
     * Set Whether to enable detection of the remote command attack.
     * @param IsRemoteCommandExecutionAnalysis Whether to enable detection of the remote command attack.
     */
    public void setIsRemoteCommandExecutionAnalysis(Long IsRemoteCommandExecutionAnalysis) {
        this.IsRemoteCommandExecutionAnalysis = IsRemoteCommandExecutionAnalysis;
    }

    /**
     * Get Whether to enable detection of Java webshell. 
     * @return IsMemoryHijackingAnalysis Whether to enable detection of Java webshell.
     */
    public Long getIsMemoryHijackingAnalysis() {
        return this.IsMemoryHijackingAnalysis;
    }

    /**
     * Set Whether to enable detection of Java webshell.
     * @param IsMemoryHijackingAnalysis Whether to enable detection of Java webshell.
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

    /**
     * Get Index key of spanId: This parameter is valid only when the CLS index type is key-value index 
     * @return LogSpanIdKey Index key of spanId: This parameter is valid only when the CLS index type is key-value index
     */
    public String getLogSpanIdKey() {
        return this.LogSpanIdKey;
    }

    /**
     * Set Index key of spanId: This parameter is valid only when the CLS index type is key-value index
     * @param LogSpanIdKey Index key of spanId: This parameter is valid only when the CLS index type is key-value index
     */
    public void setLogSpanIdKey(String LogSpanIdKey) {
        this.LogSpanIdKey = LogSpanIdKey;
    }

    public ModifyApmInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyApmInstanceRequest(ModifyApmInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Tags != null) {
            this.Tags = new ApmTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new ApmTag(source.Tags[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.TraceDuration != null) {
            this.TraceDuration = new Long(source.TraceDuration);
        }
        if (source.OpenBilling != null) {
            this.OpenBilling = new Boolean(source.OpenBilling);
        }
        if (source.SpanDailyCounters != null) {
            this.SpanDailyCounters = new Long(source.SpanDailyCounters);
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
        if (source.IsRelatedLog != null) {
            this.IsRelatedLog = new Long(source.IsRelatedLog);
        }
        if (source.LogRegion != null) {
            this.LogRegion = new String(source.LogRegion);
        }
        if (source.LogTopicID != null) {
            this.LogTopicID = new String(source.LogTopicID);
        }
        if (source.LogSet != null) {
            this.LogSet = new String(source.LogSet);
        }
        if (source.LogSource != null) {
            this.LogSource = new String(source.LogSource);
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
        if (source.ResponseDurationWarningThreshold != null) {
            this.ResponseDurationWarningThreshold = new Long(source.ResponseDurationWarningThreshold);
        }
        if (source.Free != null) {
            this.Free = new Long(source.Free);
        }
        if (source.IsRelatedDashboard != null) {
            this.IsRelatedDashboard = new Long(source.IsRelatedDashboard);
        }
        if (source.DashboardTopicID != null) {
            this.DashboardTopicID = new String(source.DashboardTopicID);
        }
        if (source.IsSqlInjectionAnalysis != null) {
            this.IsSqlInjectionAnalysis = new Long(source.IsSqlInjectionAnalysis);
        }
        if (source.IsInstrumentationVulnerabilityScan != null) {
            this.IsInstrumentationVulnerabilityScan = new Long(source.IsInstrumentationVulnerabilityScan);
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
        if (source.UrlLongSegmentThreshold != null) {
            this.UrlLongSegmentThreshold = new Long(source.UrlLongSegmentThreshold);
        }
        if (source.UrlNumberSegmentThreshold != null) {
            this.UrlNumberSegmentThreshold = new Long(source.UrlNumberSegmentThreshold);
        }
        if (source.LogSpanIdKey != null) {
            this.LogSpanIdKey = new String(source.LogSpanIdKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "TraceDuration", this.TraceDuration);
        this.setParamSimple(map, prefix + "OpenBilling", this.OpenBilling);
        this.setParamSimple(map, prefix + "SpanDailyCounters", this.SpanDailyCounters);
        this.setParamSimple(map, prefix + "ErrRateThreshold", this.ErrRateThreshold);
        this.setParamSimple(map, prefix + "SampleRate", this.SampleRate);
        this.setParamSimple(map, prefix + "ErrorSample", this.ErrorSample);
        this.setParamSimple(map, prefix + "SlowRequestSavedThreshold", this.SlowRequestSavedThreshold);
        this.setParamSimple(map, prefix + "IsRelatedLog", this.IsRelatedLog);
        this.setParamSimple(map, prefix + "LogRegion", this.LogRegion);
        this.setParamSimple(map, prefix + "LogTopicID", this.LogTopicID);
        this.setParamSimple(map, prefix + "LogSet", this.LogSet);
        this.setParamSimple(map, prefix + "LogSource", this.LogSource);
        this.setParamArraySimple(map, prefix + "CustomShowTags.", this.CustomShowTags);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "ResponseDurationWarningThreshold", this.ResponseDurationWarningThreshold);
        this.setParamSimple(map, prefix + "Free", this.Free);
        this.setParamSimple(map, prefix + "IsRelatedDashboard", this.IsRelatedDashboard);
        this.setParamSimple(map, prefix + "DashboardTopicID", this.DashboardTopicID);
        this.setParamSimple(map, prefix + "IsSqlInjectionAnalysis", this.IsSqlInjectionAnalysis);
        this.setParamSimple(map, prefix + "IsInstrumentationVulnerabilityScan", this.IsInstrumentationVulnerabilityScan);
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
        this.setParamSimple(map, prefix + "UrlLongSegmentThreshold", this.UrlLongSegmentThreshold);
        this.setParamSimple(map, prefix + "UrlNumberSegmentThreshold", this.UrlNumberSegmentThreshold);
        this.setParamSimple(map, prefix + "LogSpanIdKey", this.LogSpanIdKey);

    }
}


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

public class ApmAppConfig extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("InstanceKey")
    @Expose
    private String InstanceKey;

    /**
    * Service name.
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * URL convergence switch.
    */
    @SerializedName("UrlConvergenceSwitch")
    @Expose
    private Long UrlConvergenceSwitch;

    /**
    * URL convergence threshold
    */
    @SerializedName("UrlConvergenceThreshold")
    @Expose
    private Long UrlConvergenceThreshold;

    /**
    * URL convergence regular expression.
    */
    @SerializedName("UrlConvergence")
    @Expose
    private String UrlConvergence;

    /**
    * Exception filtering regular expression.
    */
    @SerializedName("ExceptionFilter")
    @Expose
    private String ExceptionFilter;

    /**
    * Error code filtering.
    */
    @SerializedName("ErrorCodeFilter")
    @Expose
    private String ErrorCodeFilter;

    /**
    * Service component type.
    */
    @SerializedName("Components")
    @Expose
    private String Components;

    /**
    * URL exclusion regular.
    */
    @SerializedName("UrlExclude")
    @Expose
    private String UrlExclude;

    /**
    * Specifies the log source.
    */
    @SerializedName("LogSource")
    @Expose
    private String LogSource;

    /**
    * Log region.
    */
    @SerializedName("LogRegion")
    @Expose
    private String LogRegion;

    /**
    * Whether logging is enabled. valid values: 0 (disabled), 1 (enabled).
    */
    @SerializedName("IsRelatedLog")
    @Expose
    private Long IsRelatedLog;

    /**
    * Log topic ID
    */
    @SerializedName("LogTopicID")
    @Expose
    private String LogTopicID;

    /**
    * API names to filter
    */
    @SerializedName("IgnoreOperationName")
    @Expose
    private String IgnoreOperationName;

    /**
    * CLS log set/ES cluster ID
    */
    @SerializedName("LogSet")
    @Expose
    private String LogSet;

    /**
    * Number of traces reported by the probe per second.
    */
    @SerializedName("TraceRateLimit")
    @Expose
    private Long TraceRateLimit;

    /**
    * Whether thread profiling is enabled.
    */
    @SerializedName("EnableSnapshot")
    @Expose
    private Boolean EnableSnapshot;

    /**
    * Timeout threshold for thread profiling.
    */
    @SerializedName("SnapshotTimeout")
    @Expose
    private Long SnapshotTimeout;

    /**
    * Whether agent is enabled.
    */
    @SerializedName("AgentEnable")
    @Expose
    private Boolean AgentEnable;

    /**
    * Component List
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstrumentList")
    @Expose
    private Instrument [] InstrumentList;

    /**
    * Whether link compression is enabled.
    */
    @SerializedName("TraceSquash")
    @Expose
    private Boolean TraceSquash;

    /**
    * Whether application diagnosis is enabled.
    */
    @SerializedName("EventEnable")
    @Expose
    private Boolean EventEnable;

    /**
    * Related configurations of the probe APIs.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AgentOperationConfigView")
    @Expose
    private AgentOperationConfigView AgentOperationConfigView;

    /**
    * Whether to enable application log configuration.
    */
    @SerializedName("EnableLogConfig")
    @Expose
    private Boolean EnableLogConfig;

    /**
    * Application ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceID")
    @Expose
    private String ServiceID;

    /**
    * Whether to enable the dashboard configuration for applications. false: disabled (consistent with the business system configuration); true: enabled (application-level configuration).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EnableDashboardConfig")
    @Expose
    private Boolean EnableDashboardConfig;

    /**
    * Whether to associate with Dashboard. 0: disabled; 1: enabled.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsRelatedDashboard")
    @Expose
    private Long IsRelatedDashboard;

    /**
    * dashboard ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DashboardTopicID")
    @Expose
    private String DashboardTopicID;

    /**
    * Whether to enable the application-level configuration.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EnableSecurityConfig")
    @Expose
    private Boolean EnableSecurityConfig;

    /**
    * Whether to enable detection of component vulnerability.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsInstrumentationVulnerabilityScan")
    @Expose
    private Long IsInstrumentationVulnerabilityScan;

    /**
    * Whether to enable SQL injection analysis.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsSqlInjectionAnalysis")
    @Expose
    private Long IsSqlInjectionAnalysis;

    /**
    * Whether to enable execution analysis of remote command.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsRemoteCommandExecutionAnalysis")
    @Expose
    private Long IsRemoteCommandExecutionAnalysis;

    /**
    * Whether to enable detection analysis of Java webshell.
Note: This field may return null, indicating that no valid values can be obtained.
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
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsDeleteAnyFileAnalysis")
    @Expose
    private Long IsDeleteAnyFileAnalysis;

    /**
    * Whether to enable the detection of reading arbitrary files. (0 - disabled; 1 - enabled.)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsReadAnyFileAnalysis")
    @Expose
    private Long IsReadAnyFileAnalysis;

    /**
    * Whether to enable the detection of uploading arbitrary files. (0 - disabled; 1 - enabled.)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsUploadAnyFileAnalysis")
    @Expose
    private Long IsUploadAnyFileAnalysis;

    /**
    * Whether to enable the detection of the inclusion of arbitrary files. (0: disabled, 1: enabled.)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsIncludeAnyFileAnalysis")
    @Expose
    private Long IsIncludeAnyFileAnalysis;

    /**
    * Whether to enable traversal detection of the directory. (0 - disabled; 1 - enabled).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsDirectoryTraversalAnalysis")
    @Expose
    private Long IsDirectoryTraversalAnalysis;

    /**
    * Whether to enable template engine injection detection. (0: disabled; 1: enabled.)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsTemplateEngineInjectionAnalysis")
    @Expose
    private Long IsTemplateEngineInjectionAnalysis;

    /**
    * Whether to enable script engine injection detection. (0 - disabled; 1 - enabled.)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsScriptEngineInjectionAnalysis")
    @Expose
    private Long IsScriptEngineInjectionAnalysis;

    /**
    * Whether to enable expression injection detection. (0 - disabled; 1 - enabled.)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsExpressionInjectionAnalysis")
    @Expose
    private Long IsExpressionInjectionAnalysis;

    /**
    * Whether to enable JNDI injection detection. (0 - disabled; 1 - enabled.)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsJNDIInjectionAnalysis")
    @Expose
    private Long IsJNDIInjectionAnalysis;

    /**
    * Whether to enable JNI injection detection. (0 - disabled, 1 - enabled).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsJNIInjectionAnalysis")
    @Expose
    private Long IsJNIInjectionAnalysis;

    /**
    * Whether to enable Webshell backdoor detection. (0 - disabled; 1 - enabled).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsWebshellBackdoorAnalysis")
    @Expose
    private Long IsWebshellBackdoorAnalysis;

    /**
    * Whether to enable deserialization detection. (0 - disabled; 1 - enabled).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsDeserializationAnalysis")
    @Expose
    private Long IsDeserializationAnalysis;

    /**
    * API name automatic convergence switch (0 - disabled; 1 - enabled)
    */
    @SerializedName("UrlAutoConvergenceEnable")
    @Expose
    private Boolean UrlAutoConvergenceEnable;

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
    * Specifies the memory threshold for probe fusing.
    */
    @SerializedName("DisableMemoryUsed")
    @Expose
    private Long DisableMemoryUsed;

    /**
    * Specifies the CPU threshold for probe fusing.
    */
    @SerializedName("DisableCpuUsed")
    @Expose
    private Long DisableCpuUsed;

    /**
     * Get Instance ID. 
     * @return InstanceKey Instance ID.
     */
    public String getInstanceKey() {
        return this.InstanceKey;
    }

    /**
     * Set Instance ID.
     * @param InstanceKey Instance ID.
     */
    public void setInstanceKey(String InstanceKey) {
        this.InstanceKey = InstanceKey;
    }

    /**
     * Get Service name. 
     * @return ServiceName Service name.
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set Service name.
     * @param ServiceName Service name.
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get URL convergence switch. 
     * @return UrlConvergenceSwitch URL convergence switch.
     */
    public Long getUrlConvergenceSwitch() {
        return this.UrlConvergenceSwitch;
    }

    /**
     * Set URL convergence switch.
     * @param UrlConvergenceSwitch URL convergence switch.
     */
    public void setUrlConvergenceSwitch(Long UrlConvergenceSwitch) {
        this.UrlConvergenceSwitch = UrlConvergenceSwitch;
    }

    /**
     * Get URL convergence threshold 
     * @return UrlConvergenceThreshold URL convergence threshold
     */
    public Long getUrlConvergenceThreshold() {
        return this.UrlConvergenceThreshold;
    }

    /**
     * Set URL convergence threshold
     * @param UrlConvergenceThreshold URL convergence threshold
     */
    public void setUrlConvergenceThreshold(Long UrlConvergenceThreshold) {
        this.UrlConvergenceThreshold = UrlConvergenceThreshold;
    }

    /**
     * Get URL convergence regular expression. 
     * @return UrlConvergence URL convergence regular expression.
     */
    public String getUrlConvergence() {
        return this.UrlConvergence;
    }

    /**
     * Set URL convergence regular expression.
     * @param UrlConvergence URL convergence regular expression.
     */
    public void setUrlConvergence(String UrlConvergence) {
        this.UrlConvergence = UrlConvergence;
    }

    /**
     * Get Exception filtering regular expression. 
     * @return ExceptionFilter Exception filtering regular expression.
     */
    public String getExceptionFilter() {
        return this.ExceptionFilter;
    }

    /**
     * Set Exception filtering regular expression.
     * @param ExceptionFilter Exception filtering regular expression.
     */
    public void setExceptionFilter(String ExceptionFilter) {
        this.ExceptionFilter = ExceptionFilter;
    }

    /**
     * Get Error code filtering. 
     * @return ErrorCodeFilter Error code filtering.
     */
    public String getErrorCodeFilter() {
        return this.ErrorCodeFilter;
    }

    /**
     * Set Error code filtering.
     * @param ErrorCodeFilter Error code filtering.
     */
    public void setErrorCodeFilter(String ErrorCodeFilter) {
        this.ErrorCodeFilter = ErrorCodeFilter;
    }

    /**
     * Get Service component type. 
     * @return Components Service component type.
     */
    public String getComponents() {
        return this.Components;
    }

    /**
     * Set Service component type.
     * @param Components Service component type.
     */
    public void setComponents(String Components) {
        this.Components = Components;
    }

    /**
     * Get URL exclusion regular. 
     * @return UrlExclude URL exclusion regular.
     */
    public String getUrlExclude() {
        return this.UrlExclude;
    }

    /**
     * Set URL exclusion regular.
     * @param UrlExclude URL exclusion regular.
     */
    public void setUrlExclude(String UrlExclude) {
        this.UrlExclude = UrlExclude;
    }

    /**
     * Get Specifies the log source. 
     * @return LogSource Specifies the log source.
     */
    public String getLogSource() {
        return this.LogSource;
    }

    /**
     * Set Specifies the log source.
     * @param LogSource Specifies the log source.
     */
    public void setLogSource(String LogSource) {
        this.LogSource = LogSource;
    }

    /**
     * Get Log region. 
     * @return LogRegion Log region.
     */
    public String getLogRegion() {
        return this.LogRegion;
    }

    /**
     * Set Log region.
     * @param LogRegion Log region.
     */
    public void setLogRegion(String LogRegion) {
        this.LogRegion = LogRegion;
    }

    /**
     * Get Whether logging is enabled. valid values: 0 (disabled), 1 (enabled). 
     * @return IsRelatedLog Whether logging is enabled. valid values: 0 (disabled), 1 (enabled).
     */
    public Long getIsRelatedLog() {
        return this.IsRelatedLog;
    }

    /**
     * Set Whether logging is enabled. valid values: 0 (disabled), 1 (enabled).
     * @param IsRelatedLog Whether logging is enabled. valid values: 0 (disabled), 1 (enabled).
     */
    public void setIsRelatedLog(Long IsRelatedLog) {
        this.IsRelatedLog = IsRelatedLog;
    }

    /**
     * Get Log topic ID 
     * @return LogTopicID Log topic ID
     */
    public String getLogTopicID() {
        return this.LogTopicID;
    }

    /**
     * Set Log topic ID
     * @param LogTopicID Log topic ID
     */
    public void setLogTopicID(String LogTopicID) {
        this.LogTopicID = LogTopicID;
    }

    /**
     * Get API names to filter 
     * @return IgnoreOperationName API names to filter
     */
    public String getIgnoreOperationName() {
        return this.IgnoreOperationName;
    }

    /**
     * Set API names to filter
     * @param IgnoreOperationName API names to filter
     */
    public void setIgnoreOperationName(String IgnoreOperationName) {
        this.IgnoreOperationName = IgnoreOperationName;
    }

    /**
     * Get CLS log set/ES cluster ID 
     * @return LogSet CLS log set/ES cluster ID
     */
    public String getLogSet() {
        return this.LogSet;
    }

    /**
     * Set CLS log set/ES cluster ID
     * @param LogSet CLS log set/ES cluster ID
     */
    public void setLogSet(String LogSet) {
        this.LogSet = LogSet;
    }

    /**
     * Get Number of traces reported by the probe per second. 
     * @return TraceRateLimit Number of traces reported by the probe per second.
     */
    public Long getTraceRateLimit() {
        return this.TraceRateLimit;
    }

    /**
     * Set Number of traces reported by the probe per second.
     * @param TraceRateLimit Number of traces reported by the probe per second.
     */
    public void setTraceRateLimit(Long TraceRateLimit) {
        this.TraceRateLimit = TraceRateLimit;
    }

    /**
     * Get Whether thread profiling is enabled. 
     * @return EnableSnapshot Whether thread profiling is enabled.
     */
    public Boolean getEnableSnapshot() {
        return this.EnableSnapshot;
    }

    /**
     * Set Whether thread profiling is enabled.
     * @param EnableSnapshot Whether thread profiling is enabled.
     */
    public void setEnableSnapshot(Boolean EnableSnapshot) {
        this.EnableSnapshot = EnableSnapshot;
    }

    /**
     * Get Timeout threshold for thread profiling. 
     * @return SnapshotTimeout Timeout threshold for thread profiling.
     */
    public Long getSnapshotTimeout() {
        return this.SnapshotTimeout;
    }

    /**
     * Set Timeout threshold for thread profiling.
     * @param SnapshotTimeout Timeout threshold for thread profiling.
     */
    public void setSnapshotTimeout(Long SnapshotTimeout) {
        this.SnapshotTimeout = SnapshotTimeout;
    }

    /**
     * Get Whether agent is enabled. 
     * @return AgentEnable Whether agent is enabled.
     */
    public Boolean getAgentEnable() {
        return this.AgentEnable;
    }

    /**
     * Set Whether agent is enabled.
     * @param AgentEnable Whether agent is enabled.
     */
    public void setAgentEnable(Boolean AgentEnable) {
        this.AgentEnable = AgentEnable;
    }

    /**
     * Get Component List
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstrumentList Component List
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Instrument [] getInstrumentList() {
        return this.InstrumentList;
    }

    /**
     * Set Component List
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstrumentList Component List
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstrumentList(Instrument [] InstrumentList) {
        this.InstrumentList = InstrumentList;
    }

    /**
     * Get Whether link compression is enabled. 
     * @return TraceSquash Whether link compression is enabled.
     */
    public Boolean getTraceSquash() {
        return this.TraceSquash;
    }

    /**
     * Set Whether link compression is enabled.
     * @param TraceSquash Whether link compression is enabled.
     */
    public void setTraceSquash(Boolean TraceSquash) {
        this.TraceSquash = TraceSquash;
    }

    /**
     * Get Whether application diagnosis is enabled. 
     * @return EventEnable Whether application diagnosis is enabled.
     */
    public Boolean getEventEnable() {
        return this.EventEnable;
    }

    /**
     * Set Whether application diagnosis is enabled.
     * @param EventEnable Whether application diagnosis is enabled.
     */
    public void setEventEnable(Boolean EventEnable) {
        this.EventEnable = EventEnable;
    }

    /**
     * Get Related configurations of the probe APIs.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AgentOperationConfigView Related configurations of the probe APIs.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AgentOperationConfigView getAgentOperationConfigView() {
        return this.AgentOperationConfigView;
    }

    /**
     * Set Related configurations of the probe APIs.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AgentOperationConfigView Related configurations of the probe APIs.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAgentOperationConfigView(AgentOperationConfigView AgentOperationConfigView) {
        this.AgentOperationConfigView = AgentOperationConfigView;
    }

    /**
     * Get Whether to enable application log configuration. 
     * @return EnableLogConfig Whether to enable application log configuration.
     */
    public Boolean getEnableLogConfig() {
        return this.EnableLogConfig;
    }

    /**
     * Set Whether to enable application log configuration.
     * @param EnableLogConfig Whether to enable application log configuration.
     */
    public void setEnableLogConfig(Boolean EnableLogConfig) {
        this.EnableLogConfig = EnableLogConfig;
    }

    /**
     * Get Application ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ServiceID Application ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getServiceID() {
        return this.ServiceID;
    }

    /**
     * Set Application ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ServiceID Application ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceID(String ServiceID) {
        this.ServiceID = ServiceID;
    }

    /**
     * Get Whether to enable the dashboard configuration for applications. false: disabled (consistent with the business system configuration); true: enabled (application-level configuration).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EnableDashboardConfig Whether to enable the dashboard configuration for applications. false: disabled (consistent with the business system configuration); true: enabled (application-level configuration).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getEnableDashboardConfig() {
        return this.EnableDashboardConfig;
    }

    /**
     * Set Whether to enable the dashboard configuration for applications. false: disabled (consistent with the business system configuration); true: enabled (application-level configuration).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EnableDashboardConfig Whether to enable the dashboard configuration for applications. false: disabled (consistent with the business system configuration); true: enabled (application-level configuration).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEnableDashboardConfig(Boolean EnableDashboardConfig) {
        this.EnableDashboardConfig = EnableDashboardConfig;
    }

    /**
     * Get Whether to associate with Dashboard. 0: disabled; 1: enabled.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsRelatedDashboard Whether to associate with Dashboard. 0: disabled; 1: enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsRelatedDashboard() {
        return this.IsRelatedDashboard;
    }

    /**
     * Set Whether to associate with Dashboard. 0: disabled; 1: enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsRelatedDashboard Whether to associate with Dashboard. 0: disabled; 1: enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsRelatedDashboard(Long IsRelatedDashboard) {
        this.IsRelatedDashboard = IsRelatedDashboard;
    }

    /**
     * Get dashboard ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DashboardTopicID dashboard ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDashboardTopicID() {
        return this.DashboardTopicID;
    }

    /**
     * Set dashboard ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DashboardTopicID dashboard ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDashboardTopicID(String DashboardTopicID) {
        this.DashboardTopicID = DashboardTopicID;
    }

    /**
     * Get Whether to enable the application-level configuration.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EnableSecurityConfig Whether to enable the application-level configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getEnableSecurityConfig() {
        return this.EnableSecurityConfig;
    }

    /**
     * Set Whether to enable the application-level configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EnableSecurityConfig Whether to enable the application-level configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEnableSecurityConfig(Boolean EnableSecurityConfig) {
        this.EnableSecurityConfig = EnableSecurityConfig;
    }

    /**
     * Get Whether to enable detection of component vulnerability.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsInstrumentationVulnerabilityScan Whether to enable detection of component vulnerability.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsInstrumentationVulnerabilityScan() {
        return this.IsInstrumentationVulnerabilityScan;
    }

    /**
     * Set Whether to enable detection of component vulnerability.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsInstrumentationVulnerabilityScan Whether to enable detection of component vulnerability.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsInstrumentationVulnerabilityScan(Long IsInstrumentationVulnerabilityScan) {
        this.IsInstrumentationVulnerabilityScan = IsInstrumentationVulnerabilityScan;
    }

    /**
     * Get Whether to enable SQL injection analysis.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsSqlInjectionAnalysis Whether to enable SQL injection analysis.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsSqlInjectionAnalysis() {
        return this.IsSqlInjectionAnalysis;
    }

    /**
     * Set Whether to enable SQL injection analysis.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsSqlInjectionAnalysis Whether to enable SQL injection analysis.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsSqlInjectionAnalysis(Long IsSqlInjectionAnalysis) {
        this.IsSqlInjectionAnalysis = IsSqlInjectionAnalysis;
    }

    /**
     * Get Whether to enable execution analysis of remote command.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsRemoteCommandExecutionAnalysis Whether to enable execution analysis of remote command.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsRemoteCommandExecutionAnalysis() {
        return this.IsRemoteCommandExecutionAnalysis;
    }

    /**
     * Set Whether to enable execution analysis of remote command.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsRemoteCommandExecutionAnalysis Whether to enable execution analysis of remote command.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsRemoteCommandExecutionAnalysis(Long IsRemoteCommandExecutionAnalysis) {
        this.IsRemoteCommandExecutionAnalysis = IsRemoteCommandExecutionAnalysis;
    }

    /**
     * Get Whether to enable detection analysis of Java webshell.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsMemoryHijackingAnalysis Whether to enable detection analysis of Java webshell.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsMemoryHijackingAnalysis() {
        return this.IsMemoryHijackingAnalysis;
    }

    /**
     * Set Whether to enable detection analysis of Java webshell.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsMemoryHijackingAnalysis Whether to enable detection analysis of Java webshell.
Note: This field may return null, indicating that no valid values can be obtained.
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
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsDeleteAnyFileAnalysis Whether to enable the detection of deleting arbitrary files. (0 - disabled; 1: enabled.)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsDeleteAnyFileAnalysis() {
        return this.IsDeleteAnyFileAnalysis;
    }

    /**
     * Set Whether to enable the detection of deleting arbitrary files. (0 - disabled; 1: enabled.)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsDeleteAnyFileAnalysis Whether to enable the detection of deleting arbitrary files. (0 - disabled; 1: enabled.)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsDeleteAnyFileAnalysis(Long IsDeleteAnyFileAnalysis) {
        this.IsDeleteAnyFileAnalysis = IsDeleteAnyFileAnalysis;
    }

    /**
     * Get Whether to enable the detection of reading arbitrary files. (0 - disabled; 1 - enabled.)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsReadAnyFileAnalysis Whether to enable the detection of reading arbitrary files. (0 - disabled; 1 - enabled.)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsReadAnyFileAnalysis() {
        return this.IsReadAnyFileAnalysis;
    }

    /**
     * Set Whether to enable the detection of reading arbitrary files. (0 - disabled; 1 - enabled.)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsReadAnyFileAnalysis Whether to enable the detection of reading arbitrary files. (0 - disabled; 1 - enabled.)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsReadAnyFileAnalysis(Long IsReadAnyFileAnalysis) {
        this.IsReadAnyFileAnalysis = IsReadAnyFileAnalysis;
    }

    /**
     * Get Whether to enable the detection of uploading arbitrary files. (0 - disabled; 1 - enabled.)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsUploadAnyFileAnalysis Whether to enable the detection of uploading arbitrary files. (0 - disabled; 1 - enabled.)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsUploadAnyFileAnalysis() {
        return this.IsUploadAnyFileAnalysis;
    }

    /**
     * Set Whether to enable the detection of uploading arbitrary files. (0 - disabled; 1 - enabled.)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsUploadAnyFileAnalysis Whether to enable the detection of uploading arbitrary files. (0 - disabled; 1 - enabled.)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsUploadAnyFileAnalysis(Long IsUploadAnyFileAnalysis) {
        this.IsUploadAnyFileAnalysis = IsUploadAnyFileAnalysis;
    }

    /**
     * Get Whether to enable the detection of the inclusion of arbitrary files. (0: disabled, 1: enabled.)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsIncludeAnyFileAnalysis Whether to enable the detection of the inclusion of arbitrary files. (0: disabled, 1: enabled.)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsIncludeAnyFileAnalysis() {
        return this.IsIncludeAnyFileAnalysis;
    }

    /**
     * Set Whether to enable the detection of the inclusion of arbitrary files. (0: disabled, 1: enabled.)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsIncludeAnyFileAnalysis Whether to enable the detection of the inclusion of arbitrary files. (0: disabled, 1: enabled.)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsIncludeAnyFileAnalysis(Long IsIncludeAnyFileAnalysis) {
        this.IsIncludeAnyFileAnalysis = IsIncludeAnyFileAnalysis;
    }

    /**
     * Get Whether to enable traversal detection of the directory. (0 - disabled; 1 - enabled).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsDirectoryTraversalAnalysis Whether to enable traversal detection of the directory. (0 - disabled; 1 - enabled).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsDirectoryTraversalAnalysis() {
        return this.IsDirectoryTraversalAnalysis;
    }

    /**
     * Set Whether to enable traversal detection of the directory. (0 - disabled; 1 - enabled).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsDirectoryTraversalAnalysis Whether to enable traversal detection of the directory. (0 - disabled; 1 - enabled).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsDirectoryTraversalAnalysis(Long IsDirectoryTraversalAnalysis) {
        this.IsDirectoryTraversalAnalysis = IsDirectoryTraversalAnalysis;
    }

    /**
     * Get Whether to enable template engine injection detection. (0: disabled; 1: enabled.)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsTemplateEngineInjectionAnalysis Whether to enable template engine injection detection. (0: disabled; 1: enabled.)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsTemplateEngineInjectionAnalysis() {
        return this.IsTemplateEngineInjectionAnalysis;
    }

    /**
     * Set Whether to enable template engine injection detection. (0: disabled; 1: enabled.)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsTemplateEngineInjectionAnalysis Whether to enable template engine injection detection. (0: disabled; 1: enabled.)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsTemplateEngineInjectionAnalysis(Long IsTemplateEngineInjectionAnalysis) {
        this.IsTemplateEngineInjectionAnalysis = IsTemplateEngineInjectionAnalysis;
    }

    /**
     * Get Whether to enable script engine injection detection. (0 - disabled; 1 - enabled.)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsScriptEngineInjectionAnalysis Whether to enable script engine injection detection. (0 - disabled; 1 - enabled.)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsScriptEngineInjectionAnalysis() {
        return this.IsScriptEngineInjectionAnalysis;
    }

    /**
     * Set Whether to enable script engine injection detection. (0 - disabled; 1 - enabled.)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsScriptEngineInjectionAnalysis Whether to enable script engine injection detection. (0 - disabled; 1 - enabled.)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsScriptEngineInjectionAnalysis(Long IsScriptEngineInjectionAnalysis) {
        this.IsScriptEngineInjectionAnalysis = IsScriptEngineInjectionAnalysis;
    }

    /**
     * Get Whether to enable expression injection detection. (0 - disabled; 1 - enabled.)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsExpressionInjectionAnalysis Whether to enable expression injection detection. (0 - disabled; 1 - enabled.)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsExpressionInjectionAnalysis() {
        return this.IsExpressionInjectionAnalysis;
    }

    /**
     * Set Whether to enable expression injection detection. (0 - disabled; 1 - enabled.)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsExpressionInjectionAnalysis Whether to enable expression injection detection. (0 - disabled; 1 - enabled.)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsExpressionInjectionAnalysis(Long IsExpressionInjectionAnalysis) {
        this.IsExpressionInjectionAnalysis = IsExpressionInjectionAnalysis;
    }

    /**
     * Get Whether to enable JNDI injection detection. (0 - disabled; 1 - enabled.)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsJNDIInjectionAnalysis Whether to enable JNDI injection detection. (0 - disabled; 1 - enabled.)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsJNDIInjectionAnalysis() {
        return this.IsJNDIInjectionAnalysis;
    }

    /**
     * Set Whether to enable JNDI injection detection. (0 - disabled; 1 - enabled.)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsJNDIInjectionAnalysis Whether to enable JNDI injection detection. (0 - disabled; 1 - enabled.)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsJNDIInjectionAnalysis(Long IsJNDIInjectionAnalysis) {
        this.IsJNDIInjectionAnalysis = IsJNDIInjectionAnalysis;
    }

    /**
     * Get Whether to enable JNI injection detection. (0 - disabled, 1 - enabled).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsJNIInjectionAnalysis Whether to enable JNI injection detection. (0 - disabled, 1 - enabled).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsJNIInjectionAnalysis() {
        return this.IsJNIInjectionAnalysis;
    }

    /**
     * Set Whether to enable JNI injection detection. (0 - disabled, 1 - enabled).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsJNIInjectionAnalysis Whether to enable JNI injection detection. (0 - disabled, 1 - enabled).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsJNIInjectionAnalysis(Long IsJNIInjectionAnalysis) {
        this.IsJNIInjectionAnalysis = IsJNIInjectionAnalysis;
    }

    /**
     * Get Whether to enable Webshell backdoor detection. (0 - disabled; 1 - enabled).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsWebshellBackdoorAnalysis Whether to enable Webshell backdoor detection. (0 - disabled; 1 - enabled).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsWebshellBackdoorAnalysis() {
        return this.IsWebshellBackdoorAnalysis;
    }

    /**
     * Set Whether to enable Webshell backdoor detection. (0 - disabled; 1 - enabled).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsWebshellBackdoorAnalysis Whether to enable Webshell backdoor detection. (0 - disabled; 1 - enabled).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsWebshellBackdoorAnalysis(Long IsWebshellBackdoorAnalysis) {
        this.IsWebshellBackdoorAnalysis = IsWebshellBackdoorAnalysis;
    }

    /**
     * Get Whether to enable deserialization detection. (0 - disabled; 1 - enabled).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsDeserializationAnalysis Whether to enable deserialization detection. (0 - disabled; 1 - enabled).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsDeserializationAnalysis() {
        return this.IsDeserializationAnalysis;
    }

    /**
     * Set Whether to enable deserialization detection. (0 - disabled; 1 - enabled).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsDeserializationAnalysis Whether to enable deserialization detection. (0 - disabled; 1 - enabled).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsDeserializationAnalysis(Long IsDeserializationAnalysis) {
        this.IsDeserializationAnalysis = IsDeserializationAnalysis;
    }

    /**
     * Get API name automatic convergence switch (0 - disabled; 1 - enabled) 
     * @return UrlAutoConvergenceEnable API name automatic convergence switch (0 - disabled; 1 - enabled)
     */
    public Boolean getUrlAutoConvergenceEnable() {
        return this.UrlAutoConvergenceEnable;
    }

    /**
     * Set API name automatic convergence switch (0 - disabled; 1 - enabled)
     * @param UrlAutoConvergenceEnable API name automatic convergence switch (0 - disabled; 1 - enabled)
     */
    public void setUrlAutoConvergenceEnable(Boolean UrlAutoConvergenceEnable) {
        this.UrlAutoConvergenceEnable = UrlAutoConvergenceEnable;
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
     * Get Specifies the memory threshold for probe fusing. 
     * @return DisableMemoryUsed Specifies the memory threshold for probe fusing.
     */
    public Long getDisableMemoryUsed() {
        return this.DisableMemoryUsed;
    }

    /**
     * Set Specifies the memory threshold for probe fusing.
     * @param DisableMemoryUsed Specifies the memory threshold for probe fusing.
     */
    public void setDisableMemoryUsed(Long DisableMemoryUsed) {
        this.DisableMemoryUsed = DisableMemoryUsed;
    }

    /**
     * Get Specifies the CPU threshold for probe fusing. 
     * @return DisableCpuUsed Specifies the CPU threshold for probe fusing.
     */
    public Long getDisableCpuUsed() {
        return this.DisableCpuUsed;
    }

    /**
     * Set Specifies the CPU threshold for probe fusing.
     * @param DisableCpuUsed Specifies the CPU threshold for probe fusing.
     */
    public void setDisableCpuUsed(Long DisableCpuUsed) {
        this.DisableCpuUsed = DisableCpuUsed;
    }

    public ApmAppConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApmAppConfig(ApmAppConfig source) {
        if (source.InstanceKey != null) {
            this.InstanceKey = new String(source.InstanceKey);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.UrlConvergenceSwitch != null) {
            this.UrlConvergenceSwitch = new Long(source.UrlConvergenceSwitch);
        }
        if (source.UrlConvergenceThreshold != null) {
            this.UrlConvergenceThreshold = new Long(source.UrlConvergenceThreshold);
        }
        if (source.UrlConvergence != null) {
            this.UrlConvergence = new String(source.UrlConvergence);
        }
        if (source.ExceptionFilter != null) {
            this.ExceptionFilter = new String(source.ExceptionFilter);
        }
        if (source.ErrorCodeFilter != null) {
            this.ErrorCodeFilter = new String(source.ErrorCodeFilter);
        }
        if (source.Components != null) {
            this.Components = new String(source.Components);
        }
        if (source.UrlExclude != null) {
            this.UrlExclude = new String(source.UrlExclude);
        }
        if (source.LogSource != null) {
            this.LogSource = new String(source.LogSource);
        }
        if (source.LogRegion != null) {
            this.LogRegion = new String(source.LogRegion);
        }
        if (source.IsRelatedLog != null) {
            this.IsRelatedLog = new Long(source.IsRelatedLog);
        }
        if (source.LogTopicID != null) {
            this.LogTopicID = new String(source.LogTopicID);
        }
        if (source.IgnoreOperationName != null) {
            this.IgnoreOperationName = new String(source.IgnoreOperationName);
        }
        if (source.LogSet != null) {
            this.LogSet = new String(source.LogSet);
        }
        if (source.TraceRateLimit != null) {
            this.TraceRateLimit = new Long(source.TraceRateLimit);
        }
        if (source.EnableSnapshot != null) {
            this.EnableSnapshot = new Boolean(source.EnableSnapshot);
        }
        if (source.SnapshotTimeout != null) {
            this.SnapshotTimeout = new Long(source.SnapshotTimeout);
        }
        if (source.AgentEnable != null) {
            this.AgentEnable = new Boolean(source.AgentEnable);
        }
        if (source.InstrumentList != null) {
            this.InstrumentList = new Instrument[source.InstrumentList.length];
            for (int i = 0; i < source.InstrumentList.length; i++) {
                this.InstrumentList[i] = new Instrument(source.InstrumentList[i]);
            }
        }
        if (source.TraceSquash != null) {
            this.TraceSquash = new Boolean(source.TraceSquash);
        }
        if (source.EventEnable != null) {
            this.EventEnable = new Boolean(source.EventEnable);
        }
        if (source.AgentOperationConfigView != null) {
            this.AgentOperationConfigView = new AgentOperationConfigView(source.AgentOperationConfigView);
        }
        if (source.EnableLogConfig != null) {
            this.EnableLogConfig = new Boolean(source.EnableLogConfig);
        }
        if (source.ServiceID != null) {
            this.ServiceID = new String(source.ServiceID);
        }
        if (source.EnableDashboardConfig != null) {
            this.EnableDashboardConfig = new Boolean(source.EnableDashboardConfig);
        }
        if (source.IsRelatedDashboard != null) {
            this.IsRelatedDashboard = new Long(source.IsRelatedDashboard);
        }
        if (source.DashboardTopicID != null) {
            this.DashboardTopicID = new String(source.DashboardTopicID);
        }
        if (source.EnableSecurityConfig != null) {
            this.EnableSecurityConfig = new Boolean(source.EnableSecurityConfig);
        }
        if (source.IsInstrumentationVulnerabilityScan != null) {
            this.IsInstrumentationVulnerabilityScan = new Long(source.IsInstrumentationVulnerabilityScan);
        }
        if (source.IsSqlInjectionAnalysis != null) {
            this.IsSqlInjectionAnalysis = new Long(source.IsSqlInjectionAnalysis);
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
        if (source.UrlAutoConvergenceEnable != null) {
            this.UrlAutoConvergenceEnable = new Boolean(source.UrlAutoConvergenceEnable);
        }
        if (source.UrlLongSegmentThreshold != null) {
            this.UrlLongSegmentThreshold = new Long(source.UrlLongSegmentThreshold);
        }
        if (source.UrlNumberSegmentThreshold != null) {
            this.UrlNumberSegmentThreshold = new Long(source.UrlNumberSegmentThreshold);
        }
        if (source.DisableMemoryUsed != null) {
            this.DisableMemoryUsed = new Long(source.DisableMemoryUsed);
        }
        if (source.DisableCpuUsed != null) {
            this.DisableCpuUsed = new Long(source.DisableCpuUsed);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceKey", this.InstanceKey);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "UrlConvergenceSwitch", this.UrlConvergenceSwitch);
        this.setParamSimple(map, prefix + "UrlConvergenceThreshold", this.UrlConvergenceThreshold);
        this.setParamSimple(map, prefix + "UrlConvergence", this.UrlConvergence);
        this.setParamSimple(map, prefix + "ExceptionFilter", this.ExceptionFilter);
        this.setParamSimple(map, prefix + "ErrorCodeFilter", this.ErrorCodeFilter);
        this.setParamSimple(map, prefix + "Components", this.Components);
        this.setParamSimple(map, prefix + "UrlExclude", this.UrlExclude);
        this.setParamSimple(map, prefix + "LogSource", this.LogSource);
        this.setParamSimple(map, prefix + "LogRegion", this.LogRegion);
        this.setParamSimple(map, prefix + "IsRelatedLog", this.IsRelatedLog);
        this.setParamSimple(map, prefix + "LogTopicID", this.LogTopicID);
        this.setParamSimple(map, prefix + "IgnoreOperationName", this.IgnoreOperationName);
        this.setParamSimple(map, prefix + "LogSet", this.LogSet);
        this.setParamSimple(map, prefix + "TraceRateLimit", this.TraceRateLimit);
        this.setParamSimple(map, prefix + "EnableSnapshot", this.EnableSnapshot);
        this.setParamSimple(map, prefix + "SnapshotTimeout", this.SnapshotTimeout);
        this.setParamSimple(map, prefix + "AgentEnable", this.AgentEnable);
        this.setParamArrayObj(map, prefix + "InstrumentList.", this.InstrumentList);
        this.setParamSimple(map, prefix + "TraceSquash", this.TraceSquash);
        this.setParamSimple(map, prefix + "EventEnable", this.EventEnable);
        this.setParamObj(map, prefix + "AgentOperationConfigView.", this.AgentOperationConfigView);
        this.setParamSimple(map, prefix + "EnableLogConfig", this.EnableLogConfig);
        this.setParamSimple(map, prefix + "ServiceID", this.ServiceID);
        this.setParamSimple(map, prefix + "EnableDashboardConfig", this.EnableDashboardConfig);
        this.setParamSimple(map, prefix + "IsRelatedDashboard", this.IsRelatedDashboard);
        this.setParamSimple(map, prefix + "DashboardTopicID", this.DashboardTopicID);
        this.setParamSimple(map, prefix + "EnableSecurityConfig", this.EnableSecurityConfig);
        this.setParamSimple(map, prefix + "IsInstrumentationVulnerabilityScan", this.IsInstrumentationVulnerabilityScan);
        this.setParamSimple(map, prefix + "IsSqlInjectionAnalysis", this.IsSqlInjectionAnalysis);
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
        this.setParamSimple(map, prefix + "UrlAutoConvergenceEnable", this.UrlAutoConvergenceEnable);
        this.setParamSimple(map, prefix + "UrlLongSegmentThreshold", this.UrlLongSegmentThreshold);
        this.setParamSimple(map, prefix + "UrlNumberSegmentThreshold", this.UrlNumberSegmentThreshold);
        this.setParamSimple(map, prefix + "DisableMemoryUsed", this.DisableMemoryUsed);
        this.setParamSimple(map, prefix + "DisableCpuUsed", this.DisableCpuUsed);

    }
}


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

public class ModifyApmApplicationConfigRequest extends AbstractModel {

    /**
    * <p>Business system ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Application name</p>
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * <p>URL convergence switch, 0 Off | 1 On</p>
    */
    @SerializedName("UrlConvergenceSwitch")
    @Expose
    private Long UrlConvergenceSwitch;

    /**
    * <p>URL convergence threshold</p>
    */
    @SerializedName("UrlConvergenceThreshold")
    @Expose
    private Long UrlConvergenceThreshold;

    /**
    * <p>Exception filtering regex rules, comma-separated</p>
    */
    @SerializedName("ExceptionFilter")
    @Expose
    private String ExceptionFilter;

    /**
    * <p>URL convergence regex rules, comma-separated</p>
    */
    @SerializedName("UrlConvergence")
    @Expose
    private String UrlConvergence;

    /**
    * <p>Error code filtering, comma-separated</p>
    */
    @SerializedName("ErrorCodeFilter")
    @Expose
    private String ErrorCodeFilter;

    /**
    * <p>URL exclusion regex rule, comma-separated</p>
    */
    @SerializedName("UrlExclude")
    @Expose
    private String UrlExclude;

    /**
    * <p>Log switch 0 Disabled 1 Enabled</p>
    */
    @SerializedName("IsRelatedLog")
    @Expose
    private Long IsRelatedLog;

    /**
    * <p>Log region</p>
    */
    @SerializedName("LogRegion")
    @Expose
    private String LogRegion;

    /**
    * <p>Log topic ID</p>
    */
    @SerializedName("LogTopicID")
    @Expose
    private String LogTopicID;

    /**
    * <p>CLS logset | ES cluster ID</p>
    */
    @SerializedName("LogSet")
    @Expose
    private String LogSet;

    /**
    * <p>Log source CLS | ES</p>
    */
    @SerializedName("LogSource")
    @Expose
    private String LogSource;

    /**
    * <p>Interfaces to Filter</p>
    */
    @SerializedName("IgnoreOperationName")
    @Expose
    private String IgnoreOperationName;

    /**
    * <p>Whether thread profiling is enabled</p>
    */
    @SerializedName("EnableSnapshot")
    @Expose
    private Boolean EnableSnapshot;

    /**
    * <p>Timeout threshold for thread profiling</p>
    */
    @SerializedName("SnapshotTimeout")
    @Expose
    private Long SnapshotTimeout;

    /**
    * <p>Whether to enable agent</p>
    */
    @SerializedName("AgentEnable")
    @Expose
    private Boolean AgentEnable;

    /**
    * <p>Whether to enable link compression</p>
    */
    @SerializedName("TraceSquash")
    @Expose
    private Boolean TraceSquash;

    /**
    * <p>Whether the switch for enabling application diagnosis is enabled</p>
    */
    @SerializedName("EventEnable")
    @Expose
    private Boolean EventEnable;

    /**
    * <p>Component list</p>
    */
    @SerializedName("InstrumentList")
    @Expose
    private Instrument [] InstrumentList;

    /**
    * <p>probe API related configuration</p>
    */
    @SerializedName("AgentOperationConfigView")
    @Expose
    private AgentOperationConfigView AgentOperationConfigView;

    /**
    * <p>Whether the application log configuration is enabled</p>
    */
    @SerializedName("EnableLogConfig")
    @Expose
    private Boolean EnableLogConfig;

    /**
    * <p>Whether the dashboard configuration is enabled: false (disabled, consistent with the business system)/true (enabled, application-level configuration)</p>
    */
    @SerializedName("EnableDashboardConfig")
    @Expose
    private Boolean EnableDashboardConfig;

    /**
    * <p>Whether to associate with dashboard: 0 off 1 on</p>
    */
    @SerializedName("IsRelatedDashboard")
    @Expose
    private Long IsRelatedDashboard;

    /**
    * <p>dashboard ID</p>
    */
    @SerializedName("DashboardTopicID")
    @Expose
    private String DashboardTopicID;

    /**
    * <p>CLS index type (0=full-text index, 1=key-value index)</p>
    */
    @SerializedName("LogIndexType")
    @Expose
    private Long LogIndexType;

    /**
    * <p>Index key of traceId: This parameter is valid only when the CLS index type is key-value index.</p>
    */
    @SerializedName("LogTraceIdKey")
    @Expose
    private String LogTraceIdKey;

    /**
    * <p>Whether application security configuration is enabled</p>
    */
    @SerializedName("EnableSecurityConfig")
    @Expose
    private Boolean EnableSecurityConfig;

    /**
    * <p>Whether SQL injection analysis is enabled</p>
    */
    @SerializedName("IsSqlInjectionAnalysis")
    @Expose
    private Long IsSqlInjectionAnalysis;

    /**
    * <p>Whether component vulnerability detection is enabled</p>
    */
    @SerializedName("IsInstrumentationVulnerabilityScan")
    @Expose
    private Long IsInstrumentationVulnerabilityScan;

    /**
    * <p>Whether remote command detection is enabled</p>
    */
    @SerializedName("IsRemoteCommandExecutionAnalysis")
    @Expose
    private Long IsRemoteCommandExecutionAnalysis;

    /**
    * <p>Whether Java Webshell detection is enabled</p>
    */
    @SerializedName("IsMemoryHijackingAnalysis")
    @Expose
    private Long IsMemoryHijackingAnalysis;

    /**
    * <p>Whether to enable detection of any file deletion (0 - turn off, 1 - turn on)</p>
    */
    @SerializedName("IsDeleteAnyFileAnalysis")
    @Expose
    private Long IsDeleteAnyFileAnalysis;

    /**
    * <p>Whether to enable arbitrary file read detection (0 - disabled, 1 - enabled)</p>
    */
    @SerializedName("IsReadAnyFileAnalysis")
    @Expose
    private Long IsReadAnyFileAnalysis;

    /**
    * <p>Whether to enable arbitrary file upload detection (0-disable, 1-enable)</p>
    */
    @SerializedName("IsUploadAnyFileAnalysis")
    @Expose
    private Long IsUploadAnyFileAnalysis;

    /**
    * <p>Whether to enable detection of arbitrary files (0 - disabled, 1 - enabled)</p>
    */
    @SerializedName("IsIncludeAnyFileAnalysis")
    @Expose
    private Long IsIncludeAnyFileAnalysis;

    /**
    * <p>Whether path traversal detection is enabled (0-disabled, 1-enabled)</p>
    */
    @SerializedName("IsDirectoryTraversalAnalysis")
    @Expose
    private Long IsDirectoryTraversalAnalysis;

    /**
    * <p>Whether to enable template engine injection detection (0-disable, 1-enable)</p>
    */
    @SerializedName("IsTemplateEngineInjectionAnalysis")
    @Expose
    private Long IsTemplateEngineInjectionAnalysis;

    /**
    * <p>Whether to enable script engine injection detection (0-disable, 1-enable)</p>
    */
    @SerializedName("IsScriptEngineInjectionAnalysis")
    @Expose
    private Long IsScriptEngineInjectionAnalysis;

    /**
    * <p>Whether expression injection detection is enabled (0-disabled, 1-enabled)</p>
    */
    @SerializedName("IsExpressionInjectionAnalysis")
    @Expose
    private Long IsExpressionInjectionAnalysis;

    /**
    * <p>Whether JNDI injection detection is enabled (0 - disabled, 1 - enabled)</p>
    */
    @SerializedName("IsJNDIInjectionAnalysis")
    @Expose
    private Long IsJNDIInjectionAnalysis;

    /**
    * <p>Whether JNI injection detection is enabled (0-disabled, 1-enabled)</p>
    */
    @SerializedName("IsJNIInjectionAnalysis")
    @Expose
    private Long IsJNIInjectionAnalysis;

    /**
    * <p>Whether to enable Webshell backdoor detection (0 - disabled, 1 - enabled)</p>
    */
    @SerializedName("IsWebshellBackdoorAnalysis")
    @Expose
    private Long IsWebshellBackdoorAnalysis;

    /**
    * <p>Whether deserialization detection is enabled (0-disabled, 1-enabled)</p>
    */
    @SerializedName("IsDeserializationAnalysis")
    @Expose
    private Long IsDeserializationAnalysis;

    /**
    * <p>API auto convergence switch, 0-off | 1-on</p>
    */
    @SerializedName("UrlAutoConvergenceEnable")
    @Expose
    private Boolean UrlAutoConvergenceEnable;

    /**
    * <p>URL long segment convergence threshold</p>
    */
    @SerializedName("UrlLongSegmentThreshold")
    @Expose
    private Long UrlLongSegmentThreshold;

    /**
    * <p>URL digit segment convergence threshold</p>
    */
    @SerializedName("UrlNumberSegmentThreshold")
    @Expose
    private Long UrlNumberSegmentThreshold;

    /**
    * <p>Fuse memory threshold of the probe</p>
    */
    @SerializedName("DisableMemoryUsed")
    @Expose
    private Long DisableMemoryUsed;

    /**
    * <p>Probe fuse CPU threshold</p>
    */
    @SerializedName("DisableCpuUsed")
    @Expose
    private Long DisableCpuUsed;

    /**
    * <p>Whether SQL parameter access is enabled</p>
    */
    @SerializedName("DbStatementParametersEnabled")
    @Expose
    private Boolean DbStatementParametersEnabled;

    /**
    * <p>Slow SQL threshold</p>
    */
    @SerializedName("SlowSQLThresholds")
    @Expose
    private ApmTag [] SlowSQLThresholds;

    /**
    * <p>Whether the masking rule is enabled</p>
    */
    @SerializedName("EnableDesensitizationRule")
    @Expose
    private Long EnableDesensitizationRule;

    /**
    * <p>Masking rule</p>
    */
    @SerializedName("DesensitizationRule")
    @Expose
    private String DesensitizationRule;

    /**
    * <p>Index key of spanId: This parameter is valid only when the CLS index type is key-value index.</p>
    */
    @SerializedName("LogSpanIdKey")
    @Expose
    private String LogSpanIdKey;

    /**
    * <p>Automated performance analysis task configuration</p>
    */
    @SerializedName("AutoProfilingConfig")
    @Expose
    private AutoProfilingConfig AutoProfilingConfig;

    /**
    * <p>Threshold configuration switch. true means use application level threshold; false means use business system level threshold.</p>
    */
    @SerializedName("EnableThresholdConfig")
    @Expose
    private Boolean EnableThresholdConfig;

    /**
    * <p>Error rate threshold (%) used to judge the application health status as "red".</p>
    */
    @SerializedName("ErrRateThreshold")
    @Expose
    private Long ErrRateThreshold;

    /**
    * <p>Alert threshold for response time (ms), used to judge the application health status as "yellow".</p>
    */
    @SerializedName("ResponseDurationWarningThreshold")
    @Expose
    private Long ResponseDurationWarningThreshold;

    /**
    * <p>Whether to use the default fuse threshold of the probe</p>
    */
    @SerializedName("UseDefaultFuseConfig")
    @Expose
    private Boolean UseDefaultFuseConfig;

    /**
     * Get <p>Business system ID</p> 
     * @return InstanceId <p>Business system ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Business system ID</p>
     * @param InstanceId <p>Business system ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Application name</p> 
     * @return ServiceName <p>Application name</p>
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set <p>Application name</p>
     * @param ServiceName <p>Application name</p>
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get <p>URL convergence switch, 0 Off | 1 On</p> 
     * @return UrlConvergenceSwitch <p>URL convergence switch, 0 Off | 1 On</p>
     */
    public Long getUrlConvergenceSwitch() {
        return this.UrlConvergenceSwitch;
    }

    /**
     * Set <p>URL convergence switch, 0 Off | 1 On</p>
     * @param UrlConvergenceSwitch <p>URL convergence switch, 0 Off | 1 On</p>
     */
    public void setUrlConvergenceSwitch(Long UrlConvergenceSwitch) {
        this.UrlConvergenceSwitch = UrlConvergenceSwitch;
    }

    /**
     * Get <p>URL convergence threshold</p> 
     * @return UrlConvergenceThreshold <p>URL convergence threshold</p>
     */
    public Long getUrlConvergenceThreshold() {
        return this.UrlConvergenceThreshold;
    }

    /**
     * Set <p>URL convergence threshold</p>
     * @param UrlConvergenceThreshold <p>URL convergence threshold</p>
     */
    public void setUrlConvergenceThreshold(Long UrlConvergenceThreshold) {
        this.UrlConvergenceThreshold = UrlConvergenceThreshold;
    }

    /**
     * Get <p>Exception filtering regex rules, comma-separated</p> 
     * @return ExceptionFilter <p>Exception filtering regex rules, comma-separated</p>
     */
    public String getExceptionFilter() {
        return this.ExceptionFilter;
    }

    /**
     * Set <p>Exception filtering regex rules, comma-separated</p>
     * @param ExceptionFilter <p>Exception filtering regex rules, comma-separated</p>
     */
    public void setExceptionFilter(String ExceptionFilter) {
        this.ExceptionFilter = ExceptionFilter;
    }

    /**
     * Get <p>URL convergence regex rules, comma-separated</p> 
     * @return UrlConvergence <p>URL convergence regex rules, comma-separated</p>
     */
    public String getUrlConvergence() {
        return this.UrlConvergence;
    }

    /**
     * Set <p>URL convergence regex rules, comma-separated</p>
     * @param UrlConvergence <p>URL convergence regex rules, comma-separated</p>
     */
    public void setUrlConvergence(String UrlConvergence) {
        this.UrlConvergence = UrlConvergence;
    }

    /**
     * Get <p>Error code filtering, comma-separated</p> 
     * @return ErrorCodeFilter <p>Error code filtering, comma-separated</p>
     */
    public String getErrorCodeFilter() {
        return this.ErrorCodeFilter;
    }

    /**
     * Set <p>Error code filtering, comma-separated</p>
     * @param ErrorCodeFilter <p>Error code filtering, comma-separated</p>
     */
    public void setErrorCodeFilter(String ErrorCodeFilter) {
        this.ErrorCodeFilter = ErrorCodeFilter;
    }

    /**
     * Get <p>URL exclusion regex rule, comma-separated</p> 
     * @return UrlExclude <p>URL exclusion regex rule, comma-separated</p>
     */
    public String getUrlExclude() {
        return this.UrlExclude;
    }

    /**
     * Set <p>URL exclusion regex rule, comma-separated</p>
     * @param UrlExclude <p>URL exclusion regex rule, comma-separated</p>
     */
    public void setUrlExclude(String UrlExclude) {
        this.UrlExclude = UrlExclude;
    }

    /**
     * Get <p>Log switch 0 Disabled 1 Enabled</p> 
     * @return IsRelatedLog <p>Log switch 0 Disabled 1 Enabled</p>
     */
    public Long getIsRelatedLog() {
        return this.IsRelatedLog;
    }

    /**
     * Set <p>Log switch 0 Disabled 1 Enabled</p>
     * @param IsRelatedLog <p>Log switch 0 Disabled 1 Enabled</p>
     */
    public void setIsRelatedLog(Long IsRelatedLog) {
        this.IsRelatedLog = IsRelatedLog;
    }

    /**
     * Get <p>Log region</p> 
     * @return LogRegion <p>Log region</p>
     */
    public String getLogRegion() {
        return this.LogRegion;
    }

    /**
     * Set <p>Log region</p>
     * @param LogRegion <p>Log region</p>
     */
    public void setLogRegion(String LogRegion) {
        this.LogRegion = LogRegion;
    }

    /**
     * Get <p>Log topic ID</p> 
     * @return LogTopicID <p>Log topic ID</p>
     */
    public String getLogTopicID() {
        return this.LogTopicID;
    }

    /**
     * Set <p>Log topic ID</p>
     * @param LogTopicID <p>Log topic ID</p>
     */
    public void setLogTopicID(String LogTopicID) {
        this.LogTopicID = LogTopicID;
    }

    /**
     * Get <p>CLS logset | ES cluster ID</p> 
     * @return LogSet <p>CLS logset | ES cluster ID</p>
     */
    public String getLogSet() {
        return this.LogSet;
    }

    /**
     * Set <p>CLS logset | ES cluster ID</p>
     * @param LogSet <p>CLS logset | ES cluster ID</p>
     */
    public void setLogSet(String LogSet) {
        this.LogSet = LogSet;
    }

    /**
     * Get <p>Log source CLS | ES</p> 
     * @return LogSource <p>Log source CLS | ES</p>
     */
    public String getLogSource() {
        return this.LogSource;
    }

    /**
     * Set <p>Log source CLS | ES</p>
     * @param LogSource <p>Log source CLS | ES</p>
     */
    public void setLogSource(String LogSource) {
        this.LogSource = LogSource;
    }

    /**
     * Get <p>Interfaces to Filter</p> 
     * @return IgnoreOperationName <p>Interfaces to Filter</p>
     */
    public String getIgnoreOperationName() {
        return this.IgnoreOperationName;
    }

    /**
     * Set <p>Interfaces to Filter</p>
     * @param IgnoreOperationName <p>Interfaces to Filter</p>
     */
    public void setIgnoreOperationName(String IgnoreOperationName) {
        this.IgnoreOperationName = IgnoreOperationName;
    }

    /**
     * Get <p>Whether thread profiling is enabled</p> 
     * @return EnableSnapshot <p>Whether thread profiling is enabled</p>
     */
    public Boolean getEnableSnapshot() {
        return this.EnableSnapshot;
    }

    /**
     * Set <p>Whether thread profiling is enabled</p>
     * @param EnableSnapshot <p>Whether thread profiling is enabled</p>
     */
    public void setEnableSnapshot(Boolean EnableSnapshot) {
        this.EnableSnapshot = EnableSnapshot;
    }

    /**
     * Get <p>Timeout threshold for thread profiling</p> 
     * @return SnapshotTimeout <p>Timeout threshold for thread profiling</p>
     */
    public Long getSnapshotTimeout() {
        return this.SnapshotTimeout;
    }

    /**
     * Set <p>Timeout threshold for thread profiling</p>
     * @param SnapshotTimeout <p>Timeout threshold for thread profiling</p>
     */
    public void setSnapshotTimeout(Long SnapshotTimeout) {
        this.SnapshotTimeout = SnapshotTimeout;
    }

    /**
     * Get <p>Whether to enable agent</p> 
     * @return AgentEnable <p>Whether to enable agent</p>
     */
    public Boolean getAgentEnable() {
        return this.AgentEnable;
    }

    /**
     * Set <p>Whether to enable agent</p>
     * @param AgentEnable <p>Whether to enable agent</p>
     */
    public void setAgentEnable(Boolean AgentEnable) {
        this.AgentEnable = AgentEnable;
    }

    /**
     * Get <p>Whether to enable link compression</p> 
     * @return TraceSquash <p>Whether to enable link compression</p>
     */
    public Boolean getTraceSquash() {
        return this.TraceSquash;
    }

    /**
     * Set <p>Whether to enable link compression</p>
     * @param TraceSquash <p>Whether to enable link compression</p>
     */
    public void setTraceSquash(Boolean TraceSquash) {
        this.TraceSquash = TraceSquash;
    }

    /**
     * Get <p>Whether the switch for enabling application diagnosis is enabled</p> 
     * @return EventEnable <p>Whether the switch for enabling application diagnosis is enabled</p>
     */
    public Boolean getEventEnable() {
        return this.EventEnable;
    }

    /**
     * Set <p>Whether the switch for enabling application diagnosis is enabled</p>
     * @param EventEnable <p>Whether the switch for enabling application diagnosis is enabled</p>
     */
    public void setEventEnable(Boolean EventEnable) {
        this.EventEnable = EventEnable;
    }

    /**
     * Get <p>Component list</p> 
     * @return InstrumentList <p>Component list</p>
     */
    public Instrument [] getInstrumentList() {
        return this.InstrumentList;
    }

    /**
     * Set <p>Component list</p>
     * @param InstrumentList <p>Component list</p>
     */
    public void setInstrumentList(Instrument [] InstrumentList) {
        this.InstrumentList = InstrumentList;
    }

    /**
     * Get <p>probe API related configuration</p> 
     * @return AgentOperationConfigView <p>probe API related configuration</p>
     */
    public AgentOperationConfigView getAgentOperationConfigView() {
        return this.AgentOperationConfigView;
    }

    /**
     * Set <p>probe API related configuration</p>
     * @param AgentOperationConfigView <p>probe API related configuration</p>
     */
    public void setAgentOperationConfigView(AgentOperationConfigView AgentOperationConfigView) {
        this.AgentOperationConfigView = AgentOperationConfigView;
    }

    /**
     * Get <p>Whether the application log configuration is enabled</p> 
     * @return EnableLogConfig <p>Whether the application log configuration is enabled</p>
     */
    public Boolean getEnableLogConfig() {
        return this.EnableLogConfig;
    }

    /**
     * Set <p>Whether the application log configuration is enabled</p>
     * @param EnableLogConfig <p>Whether the application log configuration is enabled</p>
     */
    public void setEnableLogConfig(Boolean EnableLogConfig) {
        this.EnableLogConfig = EnableLogConfig;
    }

    /**
     * Get <p>Whether the dashboard configuration is enabled: false (disabled, consistent with the business system)/true (enabled, application-level configuration)</p> 
     * @return EnableDashboardConfig <p>Whether the dashboard configuration is enabled: false (disabled, consistent with the business system)/true (enabled, application-level configuration)</p>
     */
    public Boolean getEnableDashboardConfig() {
        return this.EnableDashboardConfig;
    }

    /**
     * Set <p>Whether the dashboard configuration is enabled: false (disabled, consistent with the business system)/true (enabled, application-level configuration)</p>
     * @param EnableDashboardConfig <p>Whether the dashboard configuration is enabled: false (disabled, consistent with the business system)/true (enabled, application-level configuration)</p>
     */
    public void setEnableDashboardConfig(Boolean EnableDashboardConfig) {
        this.EnableDashboardConfig = EnableDashboardConfig;
    }

    /**
     * Get <p>Whether to associate with dashboard: 0 off 1 on</p> 
     * @return IsRelatedDashboard <p>Whether to associate with dashboard: 0 off 1 on</p>
     */
    public Long getIsRelatedDashboard() {
        return this.IsRelatedDashboard;
    }

    /**
     * Set <p>Whether to associate with dashboard: 0 off 1 on</p>
     * @param IsRelatedDashboard <p>Whether to associate with dashboard: 0 off 1 on</p>
     */
    public void setIsRelatedDashboard(Long IsRelatedDashboard) {
        this.IsRelatedDashboard = IsRelatedDashboard;
    }

    /**
     * Get <p>dashboard ID</p> 
     * @return DashboardTopicID <p>dashboard ID</p>
     */
    public String getDashboardTopicID() {
        return this.DashboardTopicID;
    }

    /**
     * Set <p>dashboard ID</p>
     * @param DashboardTopicID <p>dashboard ID</p>
     */
    public void setDashboardTopicID(String DashboardTopicID) {
        this.DashboardTopicID = DashboardTopicID;
    }

    /**
     * Get <p>CLS index type (0=full-text index, 1=key-value index)</p> 
     * @return LogIndexType <p>CLS index type (0=full-text index, 1=key-value index)</p>
     */
    public Long getLogIndexType() {
        return this.LogIndexType;
    }

    /**
     * Set <p>CLS index type (0=full-text index, 1=key-value index)</p>
     * @param LogIndexType <p>CLS index type (0=full-text index, 1=key-value index)</p>
     */
    public void setLogIndexType(Long LogIndexType) {
        this.LogIndexType = LogIndexType;
    }

    /**
     * Get <p>Index key of traceId: This parameter is valid only when the CLS index type is key-value index.</p> 
     * @return LogTraceIdKey <p>Index key of traceId: This parameter is valid only when the CLS index type is key-value index.</p>
     */
    public String getLogTraceIdKey() {
        return this.LogTraceIdKey;
    }

    /**
     * Set <p>Index key of traceId: This parameter is valid only when the CLS index type is key-value index.</p>
     * @param LogTraceIdKey <p>Index key of traceId: This parameter is valid only when the CLS index type is key-value index.</p>
     */
    public void setLogTraceIdKey(String LogTraceIdKey) {
        this.LogTraceIdKey = LogTraceIdKey;
    }

    /**
     * Get <p>Whether application security configuration is enabled</p> 
     * @return EnableSecurityConfig <p>Whether application security configuration is enabled</p>
     */
    public Boolean getEnableSecurityConfig() {
        return this.EnableSecurityConfig;
    }

    /**
     * Set <p>Whether application security configuration is enabled</p>
     * @param EnableSecurityConfig <p>Whether application security configuration is enabled</p>
     */
    public void setEnableSecurityConfig(Boolean EnableSecurityConfig) {
        this.EnableSecurityConfig = EnableSecurityConfig;
    }

    /**
     * Get <p>Whether SQL injection analysis is enabled</p> 
     * @return IsSqlInjectionAnalysis <p>Whether SQL injection analysis is enabled</p>
     */
    public Long getIsSqlInjectionAnalysis() {
        return this.IsSqlInjectionAnalysis;
    }

    /**
     * Set <p>Whether SQL injection analysis is enabled</p>
     * @param IsSqlInjectionAnalysis <p>Whether SQL injection analysis is enabled</p>
     */
    public void setIsSqlInjectionAnalysis(Long IsSqlInjectionAnalysis) {
        this.IsSqlInjectionAnalysis = IsSqlInjectionAnalysis;
    }

    /**
     * Get <p>Whether component vulnerability detection is enabled</p> 
     * @return IsInstrumentationVulnerabilityScan <p>Whether component vulnerability detection is enabled</p>
     */
    public Long getIsInstrumentationVulnerabilityScan() {
        return this.IsInstrumentationVulnerabilityScan;
    }

    /**
     * Set <p>Whether component vulnerability detection is enabled</p>
     * @param IsInstrumentationVulnerabilityScan <p>Whether component vulnerability detection is enabled</p>
     */
    public void setIsInstrumentationVulnerabilityScan(Long IsInstrumentationVulnerabilityScan) {
        this.IsInstrumentationVulnerabilityScan = IsInstrumentationVulnerabilityScan;
    }

    /**
     * Get <p>Whether remote command detection is enabled</p> 
     * @return IsRemoteCommandExecutionAnalysis <p>Whether remote command detection is enabled</p>
     */
    public Long getIsRemoteCommandExecutionAnalysis() {
        return this.IsRemoteCommandExecutionAnalysis;
    }

    /**
     * Set <p>Whether remote command detection is enabled</p>
     * @param IsRemoteCommandExecutionAnalysis <p>Whether remote command detection is enabled</p>
     */
    public void setIsRemoteCommandExecutionAnalysis(Long IsRemoteCommandExecutionAnalysis) {
        this.IsRemoteCommandExecutionAnalysis = IsRemoteCommandExecutionAnalysis;
    }

    /**
     * Get <p>Whether Java Webshell detection is enabled</p> 
     * @return IsMemoryHijackingAnalysis <p>Whether Java Webshell detection is enabled</p>
     */
    public Long getIsMemoryHijackingAnalysis() {
        return this.IsMemoryHijackingAnalysis;
    }

    /**
     * Set <p>Whether Java Webshell detection is enabled</p>
     * @param IsMemoryHijackingAnalysis <p>Whether Java Webshell detection is enabled</p>
     */
    public void setIsMemoryHijackingAnalysis(Long IsMemoryHijackingAnalysis) {
        this.IsMemoryHijackingAnalysis = IsMemoryHijackingAnalysis;
    }

    /**
     * Get <p>Whether to enable detection of any file deletion (0 - turn off, 1 - turn on)</p> 
     * @return IsDeleteAnyFileAnalysis <p>Whether to enable detection of any file deletion (0 - turn off, 1 - turn on)</p>
     */
    public Long getIsDeleteAnyFileAnalysis() {
        return this.IsDeleteAnyFileAnalysis;
    }

    /**
     * Set <p>Whether to enable detection of any file deletion (0 - turn off, 1 - turn on)</p>
     * @param IsDeleteAnyFileAnalysis <p>Whether to enable detection of any file deletion (0 - turn off, 1 - turn on)</p>
     */
    public void setIsDeleteAnyFileAnalysis(Long IsDeleteAnyFileAnalysis) {
        this.IsDeleteAnyFileAnalysis = IsDeleteAnyFileAnalysis;
    }

    /**
     * Get <p>Whether to enable arbitrary file read detection (0 - disabled, 1 - enabled)</p> 
     * @return IsReadAnyFileAnalysis <p>Whether to enable arbitrary file read detection (0 - disabled, 1 - enabled)</p>
     */
    public Long getIsReadAnyFileAnalysis() {
        return this.IsReadAnyFileAnalysis;
    }

    /**
     * Set <p>Whether to enable arbitrary file read detection (0 - disabled, 1 - enabled)</p>
     * @param IsReadAnyFileAnalysis <p>Whether to enable arbitrary file read detection (0 - disabled, 1 - enabled)</p>
     */
    public void setIsReadAnyFileAnalysis(Long IsReadAnyFileAnalysis) {
        this.IsReadAnyFileAnalysis = IsReadAnyFileAnalysis;
    }

    /**
     * Get <p>Whether to enable arbitrary file upload detection (0-disable, 1-enable)</p> 
     * @return IsUploadAnyFileAnalysis <p>Whether to enable arbitrary file upload detection (0-disable, 1-enable)</p>
     */
    public Long getIsUploadAnyFileAnalysis() {
        return this.IsUploadAnyFileAnalysis;
    }

    /**
     * Set <p>Whether to enable arbitrary file upload detection (0-disable, 1-enable)</p>
     * @param IsUploadAnyFileAnalysis <p>Whether to enable arbitrary file upload detection (0-disable, 1-enable)</p>
     */
    public void setIsUploadAnyFileAnalysis(Long IsUploadAnyFileAnalysis) {
        this.IsUploadAnyFileAnalysis = IsUploadAnyFileAnalysis;
    }

    /**
     * Get <p>Whether to enable detection of arbitrary files (0 - disabled, 1 - enabled)</p> 
     * @return IsIncludeAnyFileAnalysis <p>Whether to enable detection of arbitrary files (0 - disabled, 1 - enabled)</p>
     */
    public Long getIsIncludeAnyFileAnalysis() {
        return this.IsIncludeAnyFileAnalysis;
    }

    /**
     * Set <p>Whether to enable detection of arbitrary files (0 - disabled, 1 - enabled)</p>
     * @param IsIncludeAnyFileAnalysis <p>Whether to enable detection of arbitrary files (0 - disabled, 1 - enabled)</p>
     */
    public void setIsIncludeAnyFileAnalysis(Long IsIncludeAnyFileAnalysis) {
        this.IsIncludeAnyFileAnalysis = IsIncludeAnyFileAnalysis;
    }

    /**
     * Get <p>Whether path traversal detection is enabled (0-disabled, 1-enabled)</p> 
     * @return IsDirectoryTraversalAnalysis <p>Whether path traversal detection is enabled (0-disabled, 1-enabled)</p>
     */
    public Long getIsDirectoryTraversalAnalysis() {
        return this.IsDirectoryTraversalAnalysis;
    }

    /**
     * Set <p>Whether path traversal detection is enabled (0-disabled, 1-enabled)</p>
     * @param IsDirectoryTraversalAnalysis <p>Whether path traversal detection is enabled (0-disabled, 1-enabled)</p>
     */
    public void setIsDirectoryTraversalAnalysis(Long IsDirectoryTraversalAnalysis) {
        this.IsDirectoryTraversalAnalysis = IsDirectoryTraversalAnalysis;
    }

    /**
     * Get <p>Whether to enable template engine injection detection (0-disable, 1-enable)</p> 
     * @return IsTemplateEngineInjectionAnalysis <p>Whether to enable template engine injection detection (0-disable, 1-enable)</p>
     */
    public Long getIsTemplateEngineInjectionAnalysis() {
        return this.IsTemplateEngineInjectionAnalysis;
    }

    /**
     * Set <p>Whether to enable template engine injection detection (0-disable, 1-enable)</p>
     * @param IsTemplateEngineInjectionAnalysis <p>Whether to enable template engine injection detection (0-disable, 1-enable)</p>
     */
    public void setIsTemplateEngineInjectionAnalysis(Long IsTemplateEngineInjectionAnalysis) {
        this.IsTemplateEngineInjectionAnalysis = IsTemplateEngineInjectionAnalysis;
    }

    /**
     * Get <p>Whether to enable script engine injection detection (0-disable, 1-enable)</p> 
     * @return IsScriptEngineInjectionAnalysis <p>Whether to enable script engine injection detection (0-disable, 1-enable)</p>
     */
    public Long getIsScriptEngineInjectionAnalysis() {
        return this.IsScriptEngineInjectionAnalysis;
    }

    /**
     * Set <p>Whether to enable script engine injection detection (0-disable, 1-enable)</p>
     * @param IsScriptEngineInjectionAnalysis <p>Whether to enable script engine injection detection (0-disable, 1-enable)</p>
     */
    public void setIsScriptEngineInjectionAnalysis(Long IsScriptEngineInjectionAnalysis) {
        this.IsScriptEngineInjectionAnalysis = IsScriptEngineInjectionAnalysis;
    }

    /**
     * Get <p>Whether expression injection detection is enabled (0-disabled, 1-enabled)</p> 
     * @return IsExpressionInjectionAnalysis <p>Whether expression injection detection is enabled (0-disabled, 1-enabled)</p>
     */
    public Long getIsExpressionInjectionAnalysis() {
        return this.IsExpressionInjectionAnalysis;
    }

    /**
     * Set <p>Whether expression injection detection is enabled (0-disabled, 1-enabled)</p>
     * @param IsExpressionInjectionAnalysis <p>Whether expression injection detection is enabled (0-disabled, 1-enabled)</p>
     */
    public void setIsExpressionInjectionAnalysis(Long IsExpressionInjectionAnalysis) {
        this.IsExpressionInjectionAnalysis = IsExpressionInjectionAnalysis;
    }

    /**
     * Get <p>Whether JNDI injection detection is enabled (0 - disabled, 1 - enabled)</p> 
     * @return IsJNDIInjectionAnalysis <p>Whether JNDI injection detection is enabled (0 - disabled, 1 - enabled)</p>
     */
    public Long getIsJNDIInjectionAnalysis() {
        return this.IsJNDIInjectionAnalysis;
    }

    /**
     * Set <p>Whether JNDI injection detection is enabled (0 - disabled, 1 - enabled)</p>
     * @param IsJNDIInjectionAnalysis <p>Whether JNDI injection detection is enabled (0 - disabled, 1 - enabled)</p>
     */
    public void setIsJNDIInjectionAnalysis(Long IsJNDIInjectionAnalysis) {
        this.IsJNDIInjectionAnalysis = IsJNDIInjectionAnalysis;
    }

    /**
     * Get <p>Whether JNI injection detection is enabled (0-disabled, 1-enabled)</p> 
     * @return IsJNIInjectionAnalysis <p>Whether JNI injection detection is enabled (0-disabled, 1-enabled)</p>
     */
    public Long getIsJNIInjectionAnalysis() {
        return this.IsJNIInjectionAnalysis;
    }

    /**
     * Set <p>Whether JNI injection detection is enabled (0-disabled, 1-enabled)</p>
     * @param IsJNIInjectionAnalysis <p>Whether JNI injection detection is enabled (0-disabled, 1-enabled)</p>
     */
    public void setIsJNIInjectionAnalysis(Long IsJNIInjectionAnalysis) {
        this.IsJNIInjectionAnalysis = IsJNIInjectionAnalysis;
    }

    /**
     * Get <p>Whether to enable Webshell backdoor detection (0 - disabled, 1 - enabled)</p> 
     * @return IsWebshellBackdoorAnalysis <p>Whether to enable Webshell backdoor detection (0 - disabled, 1 - enabled)</p>
     */
    public Long getIsWebshellBackdoorAnalysis() {
        return this.IsWebshellBackdoorAnalysis;
    }

    /**
     * Set <p>Whether to enable Webshell backdoor detection (0 - disabled, 1 - enabled)</p>
     * @param IsWebshellBackdoorAnalysis <p>Whether to enable Webshell backdoor detection (0 - disabled, 1 - enabled)</p>
     */
    public void setIsWebshellBackdoorAnalysis(Long IsWebshellBackdoorAnalysis) {
        this.IsWebshellBackdoorAnalysis = IsWebshellBackdoorAnalysis;
    }

    /**
     * Get <p>Whether deserialization detection is enabled (0-disabled, 1-enabled)</p> 
     * @return IsDeserializationAnalysis <p>Whether deserialization detection is enabled (0-disabled, 1-enabled)</p>
     */
    public Long getIsDeserializationAnalysis() {
        return this.IsDeserializationAnalysis;
    }

    /**
     * Set <p>Whether deserialization detection is enabled (0-disabled, 1-enabled)</p>
     * @param IsDeserializationAnalysis <p>Whether deserialization detection is enabled (0-disabled, 1-enabled)</p>
     */
    public void setIsDeserializationAnalysis(Long IsDeserializationAnalysis) {
        this.IsDeserializationAnalysis = IsDeserializationAnalysis;
    }

    /**
     * Get <p>API auto convergence switch, 0-off | 1-on</p> 
     * @return UrlAutoConvergenceEnable <p>API auto convergence switch, 0-off | 1-on</p>
     */
    public Boolean getUrlAutoConvergenceEnable() {
        return this.UrlAutoConvergenceEnable;
    }

    /**
     * Set <p>API auto convergence switch, 0-off | 1-on</p>
     * @param UrlAutoConvergenceEnable <p>API auto convergence switch, 0-off | 1-on</p>
     */
    public void setUrlAutoConvergenceEnable(Boolean UrlAutoConvergenceEnable) {
        this.UrlAutoConvergenceEnable = UrlAutoConvergenceEnable;
    }

    /**
     * Get <p>URL long segment convergence threshold</p> 
     * @return UrlLongSegmentThreshold <p>URL long segment convergence threshold</p>
     */
    public Long getUrlLongSegmentThreshold() {
        return this.UrlLongSegmentThreshold;
    }

    /**
     * Set <p>URL long segment convergence threshold</p>
     * @param UrlLongSegmentThreshold <p>URL long segment convergence threshold</p>
     */
    public void setUrlLongSegmentThreshold(Long UrlLongSegmentThreshold) {
        this.UrlLongSegmentThreshold = UrlLongSegmentThreshold;
    }

    /**
     * Get <p>URL digit segment convergence threshold</p> 
     * @return UrlNumberSegmentThreshold <p>URL digit segment convergence threshold</p>
     */
    public Long getUrlNumberSegmentThreshold() {
        return this.UrlNumberSegmentThreshold;
    }

    /**
     * Set <p>URL digit segment convergence threshold</p>
     * @param UrlNumberSegmentThreshold <p>URL digit segment convergence threshold</p>
     */
    public void setUrlNumberSegmentThreshold(Long UrlNumberSegmentThreshold) {
        this.UrlNumberSegmentThreshold = UrlNumberSegmentThreshold;
    }

    /**
     * Get <p>Fuse memory threshold of the probe</p> 
     * @return DisableMemoryUsed <p>Fuse memory threshold of the probe</p>
     */
    public Long getDisableMemoryUsed() {
        return this.DisableMemoryUsed;
    }

    /**
     * Set <p>Fuse memory threshold of the probe</p>
     * @param DisableMemoryUsed <p>Fuse memory threshold of the probe</p>
     */
    public void setDisableMemoryUsed(Long DisableMemoryUsed) {
        this.DisableMemoryUsed = DisableMemoryUsed;
    }

    /**
     * Get <p>Probe fuse CPU threshold</p> 
     * @return DisableCpuUsed <p>Probe fuse CPU threshold</p>
     */
    public Long getDisableCpuUsed() {
        return this.DisableCpuUsed;
    }

    /**
     * Set <p>Probe fuse CPU threshold</p>
     * @param DisableCpuUsed <p>Probe fuse CPU threshold</p>
     */
    public void setDisableCpuUsed(Long DisableCpuUsed) {
        this.DisableCpuUsed = DisableCpuUsed;
    }

    /**
     * Get <p>Whether SQL parameter access is enabled</p> 
     * @return DbStatementParametersEnabled <p>Whether SQL parameter access is enabled</p>
     */
    public Boolean getDbStatementParametersEnabled() {
        return this.DbStatementParametersEnabled;
    }

    /**
     * Set <p>Whether SQL parameter access is enabled</p>
     * @param DbStatementParametersEnabled <p>Whether SQL parameter access is enabled</p>
     */
    public void setDbStatementParametersEnabled(Boolean DbStatementParametersEnabled) {
        this.DbStatementParametersEnabled = DbStatementParametersEnabled;
    }

    /**
     * Get <p>Slow SQL threshold</p> 
     * @return SlowSQLThresholds <p>Slow SQL threshold</p>
     */
    public ApmTag [] getSlowSQLThresholds() {
        return this.SlowSQLThresholds;
    }

    /**
     * Set <p>Slow SQL threshold</p>
     * @param SlowSQLThresholds <p>Slow SQL threshold</p>
     */
    public void setSlowSQLThresholds(ApmTag [] SlowSQLThresholds) {
        this.SlowSQLThresholds = SlowSQLThresholds;
    }

    /**
     * Get <p>Whether the masking rule is enabled</p> 
     * @return EnableDesensitizationRule <p>Whether the masking rule is enabled</p>
     */
    public Long getEnableDesensitizationRule() {
        return this.EnableDesensitizationRule;
    }

    /**
     * Set <p>Whether the masking rule is enabled</p>
     * @param EnableDesensitizationRule <p>Whether the masking rule is enabled</p>
     */
    public void setEnableDesensitizationRule(Long EnableDesensitizationRule) {
        this.EnableDesensitizationRule = EnableDesensitizationRule;
    }

    /**
     * Get <p>Masking rule</p> 
     * @return DesensitizationRule <p>Masking rule</p>
     */
    public String getDesensitizationRule() {
        return this.DesensitizationRule;
    }

    /**
     * Set <p>Masking rule</p>
     * @param DesensitizationRule <p>Masking rule</p>
     */
    public void setDesensitizationRule(String DesensitizationRule) {
        this.DesensitizationRule = DesensitizationRule;
    }

    /**
     * Get <p>Index key of spanId: This parameter is valid only when the CLS index type is key-value index.</p> 
     * @return LogSpanIdKey <p>Index key of spanId: This parameter is valid only when the CLS index type is key-value index.</p>
     */
    public String getLogSpanIdKey() {
        return this.LogSpanIdKey;
    }

    /**
     * Set <p>Index key of spanId: This parameter is valid only when the CLS index type is key-value index.</p>
     * @param LogSpanIdKey <p>Index key of spanId: This parameter is valid only when the CLS index type is key-value index.</p>
     */
    public void setLogSpanIdKey(String LogSpanIdKey) {
        this.LogSpanIdKey = LogSpanIdKey;
    }

    /**
     * Get <p>Automated performance analysis task configuration</p> 
     * @return AutoProfilingConfig <p>Automated performance analysis task configuration</p>
     */
    public AutoProfilingConfig getAutoProfilingConfig() {
        return this.AutoProfilingConfig;
    }

    /**
     * Set <p>Automated performance analysis task configuration</p>
     * @param AutoProfilingConfig <p>Automated performance analysis task configuration</p>
     */
    public void setAutoProfilingConfig(AutoProfilingConfig AutoProfilingConfig) {
        this.AutoProfilingConfig = AutoProfilingConfig;
    }

    /**
     * Get <p>Threshold configuration switch. true means use application level threshold; false means use business system level threshold.</p> 
     * @return EnableThresholdConfig <p>Threshold configuration switch. true means use application level threshold; false means use business system level threshold.</p>
     */
    public Boolean getEnableThresholdConfig() {
        return this.EnableThresholdConfig;
    }

    /**
     * Set <p>Threshold configuration switch. true means use application level threshold; false means use business system level threshold.</p>
     * @param EnableThresholdConfig <p>Threshold configuration switch. true means use application level threshold; false means use business system level threshold.</p>
     */
    public void setEnableThresholdConfig(Boolean EnableThresholdConfig) {
        this.EnableThresholdConfig = EnableThresholdConfig;
    }

    /**
     * Get <p>Error rate threshold (%) used to judge the application health status as "red".</p> 
     * @return ErrRateThreshold <p>Error rate threshold (%) used to judge the application health status as "red".</p>
     */
    public Long getErrRateThreshold() {
        return this.ErrRateThreshold;
    }

    /**
     * Set <p>Error rate threshold (%) used to judge the application health status as "red".</p>
     * @param ErrRateThreshold <p>Error rate threshold (%) used to judge the application health status as "red".</p>
     */
    public void setErrRateThreshold(Long ErrRateThreshold) {
        this.ErrRateThreshold = ErrRateThreshold;
    }

    /**
     * Get <p>Alert threshold for response time (ms), used to judge the application health status as "yellow".</p> 
     * @return ResponseDurationWarningThreshold <p>Alert threshold for response time (ms), used to judge the application health status as "yellow".</p>
     */
    public Long getResponseDurationWarningThreshold() {
        return this.ResponseDurationWarningThreshold;
    }

    /**
     * Set <p>Alert threshold for response time (ms), used to judge the application health status as "yellow".</p>
     * @param ResponseDurationWarningThreshold <p>Alert threshold for response time (ms), used to judge the application health status as "yellow".</p>
     */
    public void setResponseDurationWarningThreshold(Long ResponseDurationWarningThreshold) {
        this.ResponseDurationWarningThreshold = ResponseDurationWarningThreshold;
    }

    /**
     * Get <p>Whether to use the default fuse threshold of the probe</p> 
     * @return UseDefaultFuseConfig <p>Whether to use the default fuse threshold of the probe</p>
     */
    public Boolean getUseDefaultFuseConfig() {
        return this.UseDefaultFuseConfig;
    }

    /**
     * Set <p>Whether to use the default fuse threshold of the probe</p>
     * @param UseDefaultFuseConfig <p>Whether to use the default fuse threshold of the probe</p>
     */
    public void setUseDefaultFuseConfig(Boolean UseDefaultFuseConfig) {
        this.UseDefaultFuseConfig = UseDefaultFuseConfig;
    }

    public ModifyApmApplicationConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyApmApplicationConfigRequest(ModifyApmApplicationConfigRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
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
        if (source.ExceptionFilter != null) {
            this.ExceptionFilter = new String(source.ExceptionFilter);
        }
        if (source.UrlConvergence != null) {
            this.UrlConvergence = new String(source.UrlConvergence);
        }
        if (source.ErrorCodeFilter != null) {
            this.ErrorCodeFilter = new String(source.ErrorCodeFilter);
        }
        if (source.UrlExclude != null) {
            this.UrlExclude = new String(source.UrlExclude);
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
        if (source.IgnoreOperationName != null) {
            this.IgnoreOperationName = new String(source.IgnoreOperationName);
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
        if (source.TraceSquash != null) {
            this.TraceSquash = new Boolean(source.TraceSquash);
        }
        if (source.EventEnable != null) {
            this.EventEnable = new Boolean(source.EventEnable);
        }
        if (source.InstrumentList != null) {
            this.InstrumentList = new Instrument[source.InstrumentList.length];
            for (int i = 0; i < source.InstrumentList.length; i++) {
                this.InstrumentList[i] = new Instrument(source.InstrumentList[i]);
            }
        }
        if (source.AgentOperationConfigView != null) {
            this.AgentOperationConfigView = new AgentOperationConfigView(source.AgentOperationConfigView);
        }
        if (source.EnableLogConfig != null) {
            this.EnableLogConfig = new Boolean(source.EnableLogConfig);
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
        if (source.LogIndexType != null) {
            this.LogIndexType = new Long(source.LogIndexType);
        }
        if (source.LogTraceIdKey != null) {
            this.LogTraceIdKey = new String(source.LogTraceIdKey);
        }
        if (source.EnableSecurityConfig != null) {
            this.EnableSecurityConfig = new Boolean(source.EnableSecurityConfig);
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
        if (source.DbStatementParametersEnabled != null) {
            this.DbStatementParametersEnabled = new Boolean(source.DbStatementParametersEnabled);
        }
        if (source.SlowSQLThresholds != null) {
            this.SlowSQLThresholds = new ApmTag[source.SlowSQLThresholds.length];
            for (int i = 0; i < source.SlowSQLThresholds.length; i++) {
                this.SlowSQLThresholds[i] = new ApmTag(source.SlowSQLThresholds[i]);
            }
        }
        if (source.EnableDesensitizationRule != null) {
            this.EnableDesensitizationRule = new Long(source.EnableDesensitizationRule);
        }
        if (source.DesensitizationRule != null) {
            this.DesensitizationRule = new String(source.DesensitizationRule);
        }
        if (source.LogSpanIdKey != null) {
            this.LogSpanIdKey = new String(source.LogSpanIdKey);
        }
        if (source.AutoProfilingConfig != null) {
            this.AutoProfilingConfig = new AutoProfilingConfig(source.AutoProfilingConfig);
        }
        if (source.EnableThresholdConfig != null) {
            this.EnableThresholdConfig = new Boolean(source.EnableThresholdConfig);
        }
        if (source.ErrRateThreshold != null) {
            this.ErrRateThreshold = new Long(source.ErrRateThreshold);
        }
        if (source.ResponseDurationWarningThreshold != null) {
            this.ResponseDurationWarningThreshold = new Long(source.ResponseDurationWarningThreshold);
        }
        if (source.UseDefaultFuseConfig != null) {
            this.UseDefaultFuseConfig = new Boolean(source.UseDefaultFuseConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "UrlConvergenceSwitch", this.UrlConvergenceSwitch);
        this.setParamSimple(map, prefix + "UrlConvergenceThreshold", this.UrlConvergenceThreshold);
        this.setParamSimple(map, prefix + "ExceptionFilter", this.ExceptionFilter);
        this.setParamSimple(map, prefix + "UrlConvergence", this.UrlConvergence);
        this.setParamSimple(map, prefix + "ErrorCodeFilter", this.ErrorCodeFilter);
        this.setParamSimple(map, prefix + "UrlExclude", this.UrlExclude);
        this.setParamSimple(map, prefix + "IsRelatedLog", this.IsRelatedLog);
        this.setParamSimple(map, prefix + "LogRegion", this.LogRegion);
        this.setParamSimple(map, prefix + "LogTopicID", this.LogTopicID);
        this.setParamSimple(map, prefix + "LogSet", this.LogSet);
        this.setParamSimple(map, prefix + "LogSource", this.LogSource);
        this.setParamSimple(map, prefix + "IgnoreOperationName", this.IgnoreOperationName);
        this.setParamSimple(map, prefix + "EnableSnapshot", this.EnableSnapshot);
        this.setParamSimple(map, prefix + "SnapshotTimeout", this.SnapshotTimeout);
        this.setParamSimple(map, prefix + "AgentEnable", this.AgentEnable);
        this.setParamSimple(map, prefix + "TraceSquash", this.TraceSquash);
        this.setParamSimple(map, prefix + "EventEnable", this.EventEnable);
        this.setParamArrayObj(map, prefix + "InstrumentList.", this.InstrumentList);
        this.setParamObj(map, prefix + "AgentOperationConfigView.", this.AgentOperationConfigView);
        this.setParamSimple(map, prefix + "EnableLogConfig", this.EnableLogConfig);
        this.setParamSimple(map, prefix + "EnableDashboardConfig", this.EnableDashboardConfig);
        this.setParamSimple(map, prefix + "IsRelatedDashboard", this.IsRelatedDashboard);
        this.setParamSimple(map, prefix + "DashboardTopicID", this.DashboardTopicID);
        this.setParamSimple(map, prefix + "LogIndexType", this.LogIndexType);
        this.setParamSimple(map, prefix + "LogTraceIdKey", this.LogTraceIdKey);
        this.setParamSimple(map, prefix + "EnableSecurityConfig", this.EnableSecurityConfig);
        this.setParamSimple(map, prefix + "IsSqlInjectionAnalysis", this.IsSqlInjectionAnalysis);
        this.setParamSimple(map, prefix + "IsInstrumentationVulnerabilityScan", this.IsInstrumentationVulnerabilityScan);
        this.setParamSimple(map, prefix + "IsRemoteCommandExecutionAnalysis", this.IsRemoteCommandExecutionAnalysis);
        this.setParamSimple(map, prefix + "IsMemoryHijackingAnalysis", this.IsMemoryHijackingAnalysis);
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
        this.setParamSimple(map, prefix + "DbStatementParametersEnabled", this.DbStatementParametersEnabled);
        this.setParamArrayObj(map, prefix + "SlowSQLThresholds.", this.SlowSQLThresholds);
        this.setParamSimple(map, prefix + "EnableDesensitizationRule", this.EnableDesensitizationRule);
        this.setParamSimple(map, prefix + "DesensitizationRule", this.DesensitizationRule);
        this.setParamSimple(map, prefix + "LogSpanIdKey", this.LogSpanIdKey);
        this.setParamObj(map, prefix + "AutoProfilingConfig.", this.AutoProfilingConfig);
        this.setParamSimple(map, prefix + "EnableThresholdConfig", this.EnableThresholdConfig);
        this.setParamSimple(map, prefix + "ErrRateThreshold", this.ErrRateThreshold);
        this.setParamSimple(map, prefix + "ResponseDurationWarningThreshold", this.ResponseDurationWarningThreshold);
        this.setParamSimple(map, prefix + "UseDefaultFuseConfig", this.UseDefaultFuseConfig);

    }
}


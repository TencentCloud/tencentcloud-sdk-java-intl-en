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

public class ApmApplicationConfigView extends AbstractModel {

    /**
    * <p>Business system ID</p>
    */
    @SerializedName("InstanceKey")
    @Expose
    private String InstanceKey;

    /**
    * <p>Application name</p>
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * <p>Interface Filtering</p>
    */
    @SerializedName("OperationNameFilter")
    @Expose
    private String OperationNameFilter;

    /**
    * <p>Error type filtering</p>
    */
    @SerializedName("ExceptionFilter")
    @Expose
    private String ExceptionFilter;

    /**
    * <p>HTTP status code filtering</p>
    */
    @SerializedName("ErrorCodeFilter")
    @Expose
    private String ErrorCodeFilter;

    /**
    * <p>Application diagnosis switch (abandoned)</p>
    */
    @SerializedName("EventEnable")
    @Expose
    private Boolean EventEnable;

    /**
    * <p>URL convergence switch 0 Off 1 On</p>
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
    * <p>URL regular convergence rules</p>
    */
    @SerializedName("UrlConvergence")
    @Expose
    private String UrlConvergence;

    /**
    * <p>URL exclusion rule regex</p>
    */
    @SerializedName("UrlExclude")
    @Expose
    private String UrlExclude;

    /**
    * <p>Whether logging is enabled 0 Disabled 1 Enabled</p>
    */
    @SerializedName("IsRelatedLog")
    @Expose
    private Long IsRelatedLog;

    /**
    * <p>Log source</p>
    */
    @SerializedName("LogSource")
    @Expose
    private String LogSource;

    /**
    * <p>Logset</p>
    */
    @SerializedName("LogSet")
    @Expose
    private String LogSet;

    /**
    * <p>Log topic</p>
    */
    @SerializedName("LogTopicID")
    @Expose
    private String LogTopicID;

    /**
    * <p>Method stack snapshot switch. Enabled indicates true. false indicates disabled.</p>
    */
    @SerializedName("SnapshotEnable")
    @Expose
    private Boolean SnapshotEnable;

    /**
    * <p>Slow call monitoring trigger threshold</p>
    */
    @SerializedName("SnapshotTimeout")
    @Expose
    private Long SnapshotTimeout;

    /**
    * <p>Master switch for probes</p>
    */
    @SerializedName("AgentEnable")
    @Expose
    private Boolean AgentEnable;

    /**
    * <p>Component list toggle (abandoned)</p>
    */
    @SerializedName("InstrumentList")
    @Expose
    private Instrument [] InstrumentList;

    /**
    * <p>Link compression switch (abandoned)</p>
    */
    @SerializedName("TraceSquash")
    @Expose
    private Boolean TraceSquash;

    /**
    * <p>Link filtering configuration</p>
    */
    @SerializedName("AgentIgnoreOperation")
    @Expose
    private String AgentIgnoreOperation;

    /**
    * <p>Enable the application security switch</p>
    */
    @SerializedName("EnableSecurityConfig")
    @Expose
    private Boolean EnableSecurityConfig;

    /**
    * <p>Whether SQL injection detection is enabled</p>
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
    * <p>Whether remote command execution detection is enabled</p>
    */
    @SerializedName("IsRemoteCommandExecutionAnalysis")
    @Expose
    private Long IsRemoteCommandExecutionAnalysis;

    /**
    * <p>Whether memory leakage detection is enabled</p>
    */
    @SerializedName("IsMemoryHijackingAnalysis")
    @Expose
    private Long IsMemoryHijackingAnalysis;

    /**
    * <p>Whether to enable detection of any file deletion</p>
    */
    @SerializedName("IsDeleteAnyFileAnalysis")
    @Expose
    private Long IsDeleteAnyFileAnalysis;

    /**
    * <p>Whether to enable arbitrary file read detection</p>
    */
    @SerializedName("IsReadAnyFileAnalysis")
    @Expose
    private Long IsReadAnyFileAnalysis;

    /**
    * <p>Whether to enable arbitrary file upload detection</p>
    */
    @SerializedName("IsUploadAnyFileAnalysis")
    @Expose
    private Long IsUploadAnyFileAnalysis;

    /**
    * <p>Whether to enable detection of arbitrary files</p>
    */
    @SerializedName("IsIncludeAnyFileAnalysis")
    @Expose
    private Long IsIncludeAnyFileAnalysis;

    /**
    * <p>Whether path traversal detection is enabled</p>
    */
    @SerializedName("IsDirectoryTraversalAnalysis")
    @Expose
    private Long IsDirectoryTraversalAnalysis;

    /**
    * <p>Whether to enable template engine injection detection</p>
    */
    @SerializedName("IsTemplateEngineInjectionAnalysis")
    @Expose
    private Long IsTemplateEngineInjectionAnalysis;

    /**
    * <p>Whether script engine injection detection is enabled</p>
    */
    @SerializedName("IsScriptEngineInjectionAnalysis")
    @Expose
    private Long IsScriptEngineInjectionAnalysis;

    /**
    * <p>Whether expression injection detection is enabled</p>
    */
    @SerializedName("IsExpressionInjectionAnalysis")
    @Expose
    private Long IsExpressionInjectionAnalysis;

    /**
    * <p>Whether JNDI injection detection is enabled</p>
    */
    @SerializedName("IsJndiInjectionAnalysis")
    @Expose
    private Long IsJndiInjectionAnalysis;

    /**
    * <p>Whether JNI injection detection is enabled</p>
    */
    @SerializedName("IsJniInjectionAnalysis")
    @Expose
    private Long IsJniInjectionAnalysis;

    /**
    * <p>Whether Webshell backdoor detection is enabled</p>
    */
    @SerializedName("IsWebshellBackdoorAnalysis")
    @Expose
    private Long IsWebshellBackdoorAnalysis;

    /**
    * <p>Whether deserialization detection is enabled</p>
    */
    @SerializedName("IsDeserializationAnalysis")
    @Expose
    private Long IsDeserializationAnalysis;

    /**
    * <p>Whether the console switch is enabled</p>
    */
    @SerializedName("EnableDashboardConfig")
    @Expose
    private Boolean EnableDashboardConfig;

    /**
    * <p>Whether to associate with Dashboard</p>
    */
    @SerializedName("IsRelatedDashboard")
    @Expose
    private Long IsRelatedDashboard;

    /**
    * <p>Dashboard topic</p>
    */
    @SerializedName("DashboardTopicID")
    @Expose
    private String DashboardTopicID;

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
    * <p>Automated performance analysis task configuration</p>
    */
    @SerializedName("AutoProfilingConfig")
    @Expose
    private AutoProfilingConfig AutoProfilingConfig;

    /**
    * <p>Threshold configuration switch</p>
    */
    @SerializedName("EnableThresholdConfig")
    @Expose
    private Boolean EnableThresholdConfig;

    /**
    * <p>Error rate threshold</p><p>Unit: %</p>
    */
    @SerializedName("ErrRateThreshold")
    @Expose
    private Long ErrRateThreshold;

    /**
    * <p>Alert threshold of response time</p><p>Unit: ms</p>
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
     * @return InstanceKey <p>Business system ID</p>
     */
    public String getInstanceKey() {
        return this.InstanceKey;
    }

    /**
     * Set <p>Business system ID</p>
     * @param InstanceKey <p>Business system ID</p>
     */
    public void setInstanceKey(String InstanceKey) {
        this.InstanceKey = InstanceKey;
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
     * Get <p>Interface Filtering</p> 
     * @return OperationNameFilter <p>Interface Filtering</p>
     */
    public String getOperationNameFilter() {
        return this.OperationNameFilter;
    }

    /**
     * Set <p>Interface Filtering</p>
     * @param OperationNameFilter <p>Interface Filtering</p>
     */
    public void setOperationNameFilter(String OperationNameFilter) {
        this.OperationNameFilter = OperationNameFilter;
    }

    /**
     * Get <p>Error type filtering</p> 
     * @return ExceptionFilter <p>Error type filtering</p>
     */
    public String getExceptionFilter() {
        return this.ExceptionFilter;
    }

    /**
     * Set <p>Error type filtering</p>
     * @param ExceptionFilter <p>Error type filtering</p>
     */
    public void setExceptionFilter(String ExceptionFilter) {
        this.ExceptionFilter = ExceptionFilter;
    }

    /**
     * Get <p>HTTP status code filtering</p> 
     * @return ErrorCodeFilter <p>HTTP status code filtering</p>
     */
    public String getErrorCodeFilter() {
        return this.ErrorCodeFilter;
    }

    /**
     * Set <p>HTTP status code filtering</p>
     * @param ErrorCodeFilter <p>HTTP status code filtering</p>
     */
    public void setErrorCodeFilter(String ErrorCodeFilter) {
        this.ErrorCodeFilter = ErrorCodeFilter;
    }

    /**
     * Get <p>Application diagnosis switch (abandoned)</p> 
     * @return EventEnable <p>Application diagnosis switch (abandoned)</p>
     */
    public Boolean getEventEnable() {
        return this.EventEnable;
    }

    /**
     * Set <p>Application diagnosis switch (abandoned)</p>
     * @param EventEnable <p>Application diagnosis switch (abandoned)</p>
     */
    public void setEventEnable(Boolean EventEnable) {
        this.EventEnable = EventEnable;
    }

    /**
     * Get <p>URL convergence switch 0 Off 1 On</p> 
     * @return UrlConvergenceSwitch <p>URL convergence switch 0 Off 1 On</p>
     */
    public Long getUrlConvergenceSwitch() {
        return this.UrlConvergenceSwitch;
    }

    /**
     * Set <p>URL convergence switch 0 Off 1 On</p>
     * @param UrlConvergenceSwitch <p>URL convergence switch 0 Off 1 On</p>
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
     * Get <p>URL regular convergence rules</p> 
     * @return UrlConvergence <p>URL regular convergence rules</p>
     */
    public String getUrlConvergence() {
        return this.UrlConvergence;
    }

    /**
     * Set <p>URL regular convergence rules</p>
     * @param UrlConvergence <p>URL regular convergence rules</p>
     */
    public void setUrlConvergence(String UrlConvergence) {
        this.UrlConvergence = UrlConvergence;
    }

    /**
     * Get <p>URL exclusion rule regex</p> 
     * @return UrlExclude <p>URL exclusion rule regex</p>
     */
    public String getUrlExclude() {
        return this.UrlExclude;
    }

    /**
     * Set <p>URL exclusion rule regex</p>
     * @param UrlExclude <p>URL exclusion rule regex</p>
     */
    public void setUrlExclude(String UrlExclude) {
        this.UrlExclude = UrlExclude;
    }

    /**
     * Get <p>Whether logging is enabled 0 Disabled 1 Enabled</p> 
     * @return IsRelatedLog <p>Whether logging is enabled 0 Disabled 1 Enabled</p>
     */
    public Long getIsRelatedLog() {
        return this.IsRelatedLog;
    }

    /**
     * Set <p>Whether logging is enabled 0 Disabled 1 Enabled</p>
     * @param IsRelatedLog <p>Whether logging is enabled 0 Disabled 1 Enabled</p>
     */
    public void setIsRelatedLog(Long IsRelatedLog) {
        this.IsRelatedLog = IsRelatedLog;
    }

    /**
     * Get <p>Log source</p> 
     * @return LogSource <p>Log source</p>
     */
    public String getLogSource() {
        return this.LogSource;
    }

    /**
     * Set <p>Log source</p>
     * @param LogSource <p>Log source</p>
     */
    public void setLogSource(String LogSource) {
        this.LogSource = LogSource;
    }

    /**
     * Get <p>Logset</p> 
     * @return LogSet <p>Logset</p>
     */
    public String getLogSet() {
        return this.LogSet;
    }

    /**
     * Set <p>Logset</p>
     * @param LogSet <p>Logset</p>
     */
    public void setLogSet(String LogSet) {
        this.LogSet = LogSet;
    }

    /**
     * Get <p>Log topic</p> 
     * @return LogTopicID <p>Log topic</p>
     */
    public String getLogTopicID() {
        return this.LogTopicID;
    }

    /**
     * Set <p>Log topic</p>
     * @param LogTopicID <p>Log topic</p>
     */
    public void setLogTopicID(String LogTopicID) {
        this.LogTopicID = LogTopicID;
    }

    /**
     * Get <p>Method stack snapshot switch. Enabled indicates true. false indicates disabled.</p> 
     * @return SnapshotEnable <p>Method stack snapshot switch. Enabled indicates true. false indicates disabled.</p>
     */
    public Boolean getSnapshotEnable() {
        return this.SnapshotEnable;
    }

    /**
     * Set <p>Method stack snapshot switch. Enabled indicates true. false indicates disabled.</p>
     * @param SnapshotEnable <p>Method stack snapshot switch. Enabled indicates true. false indicates disabled.</p>
     */
    public void setSnapshotEnable(Boolean SnapshotEnable) {
        this.SnapshotEnable = SnapshotEnable;
    }

    /**
     * Get <p>Slow call monitoring trigger threshold</p> 
     * @return SnapshotTimeout <p>Slow call monitoring trigger threshold</p>
     */
    public Long getSnapshotTimeout() {
        return this.SnapshotTimeout;
    }

    /**
     * Set <p>Slow call monitoring trigger threshold</p>
     * @param SnapshotTimeout <p>Slow call monitoring trigger threshold</p>
     */
    public void setSnapshotTimeout(Long SnapshotTimeout) {
        this.SnapshotTimeout = SnapshotTimeout;
    }

    /**
     * Get <p>Master switch for probes</p> 
     * @return AgentEnable <p>Master switch for probes</p>
     */
    public Boolean getAgentEnable() {
        return this.AgentEnable;
    }

    /**
     * Set <p>Master switch for probes</p>
     * @param AgentEnable <p>Master switch for probes</p>
     */
    public void setAgentEnable(Boolean AgentEnable) {
        this.AgentEnable = AgentEnable;
    }

    /**
     * Get <p>Component list toggle (abandoned)</p> 
     * @return InstrumentList <p>Component list toggle (abandoned)</p>
     */
    public Instrument [] getInstrumentList() {
        return this.InstrumentList;
    }

    /**
     * Set <p>Component list toggle (abandoned)</p>
     * @param InstrumentList <p>Component list toggle (abandoned)</p>
     */
    public void setInstrumentList(Instrument [] InstrumentList) {
        this.InstrumentList = InstrumentList;
    }

    /**
     * Get <p>Link compression switch (abandoned)</p> 
     * @return TraceSquash <p>Link compression switch (abandoned)</p>
     */
    public Boolean getTraceSquash() {
        return this.TraceSquash;
    }

    /**
     * Set <p>Link compression switch (abandoned)</p>
     * @param TraceSquash <p>Link compression switch (abandoned)</p>
     */
    public void setTraceSquash(Boolean TraceSquash) {
        this.TraceSquash = TraceSquash;
    }

    /**
     * Get <p>Link filtering configuration</p> 
     * @return AgentIgnoreOperation <p>Link filtering configuration</p>
     */
    public String getAgentIgnoreOperation() {
        return this.AgentIgnoreOperation;
    }

    /**
     * Set <p>Link filtering configuration</p>
     * @param AgentIgnoreOperation <p>Link filtering configuration</p>
     */
    public void setAgentIgnoreOperation(String AgentIgnoreOperation) {
        this.AgentIgnoreOperation = AgentIgnoreOperation;
    }

    /**
     * Get <p>Enable the application security switch</p> 
     * @return EnableSecurityConfig <p>Enable the application security switch</p>
     */
    public Boolean getEnableSecurityConfig() {
        return this.EnableSecurityConfig;
    }

    /**
     * Set <p>Enable the application security switch</p>
     * @param EnableSecurityConfig <p>Enable the application security switch</p>
     */
    public void setEnableSecurityConfig(Boolean EnableSecurityConfig) {
        this.EnableSecurityConfig = EnableSecurityConfig;
    }

    /**
     * Get <p>Whether SQL injection detection is enabled</p> 
     * @return IsSqlInjectionAnalysis <p>Whether SQL injection detection is enabled</p>
     */
    public Long getIsSqlInjectionAnalysis() {
        return this.IsSqlInjectionAnalysis;
    }

    /**
     * Set <p>Whether SQL injection detection is enabled</p>
     * @param IsSqlInjectionAnalysis <p>Whether SQL injection detection is enabled</p>
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
     * Get <p>Whether remote command execution detection is enabled</p> 
     * @return IsRemoteCommandExecutionAnalysis <p>Whether remote command execution detection is enabled</p>
     */
    public Long getIsRemoteCommandExecutionAnalysis() {
        return this.IsRemoteCommandExecutionAnalysis;
    }

    /**
     * Set <p>Whether remote command execution detection is enabled</p>
     * @param IsRemoteCommandExecutionAnalysis <p>Whether remote command execution detection is enabled</p>
     */
    public void setIsRemoteCommandExecutionAnalysis(Long IsRemoteCommandExecutionAnalysis) {
        this.IsRemoteCommandExecutionAnalysis = IsRemoteCommandExecutionAnalysis;
    }

    /**
     * Get <p>Whether memory leakage detection is enabled</p> 
     * @return IsMemoryHijackingAnalysis <p>Whether memory leakage detection is enabled</p>
     */
    public Long getIsMemoryHijackingAnalysis() {
        return this.IsMemoryHijackingAnalysis;
    }

    /**
     * Set <p>Whether memory leakage detection is enabled</p>
     * @param IsMemoryHijackingAnalysis <p>Whether memory leakage detection is enabled</p>
     */
    public void setIsMemoryHijackingAnalysis(Long IsMemoryHijackingAnalysis) {
        this.IsMemoryHijackingAnalysis = IsMemoryHijackingAnalysis;
    }

    /**
     * Get <p>Whether to enable detection of any file deletion</p> 
     * @return IsDeleteAnyFileAnalysis <p>Whether to enable detection of any file deletion</p>
     */
    public Long getIsDeleteAnyFileAnalysis() {
        return this.IsDeleteAnyFileAnalysis;
    }

    /**
     * Set <p>Whether to enable detection of any file deletion</p>
     * @param IsDeleteAnyFileAnalysis <p>Whether to enable detection of any file deletion</p>
     */
    public void setIsDeleteAnyFileAnalysis(Long IsDeleteAnyFileAnalysis) {
        this.IsDeleteAnyFileAnalysis = IsDeleteAnyFileAnalysis;
    }

    /**
     * Get <p>Whether to enable arbitrary file read detection</p> 
     * @return IsReadAnyFileAnalysis <p>Whether to enable arbitrary file read detection</p>
     */
    public Long getIsReadAnyFileAnalysis() {
        return this.IsReadAnyFileAnalysis;
    }

    /**
     * Set <p>Whether to enable arbitrary file read detection</p>
     * @param IsReadAnyFileAnalysis <p>Whether to enable arbitrary file read detection</p>
     */
    public void setIsReadAnyFileAnalysis(Long IsReadAnyFileAnalysis) {
        this.IsReadAnyFileAnalysis = IsReadAnyFileAnalysis;
    }

    /**
     * Get <p>Whether to enable arbitrary file upload detection</p> 
     * @return IsUploadAnyFileAnalysis <p>Whether to enable arbitrary file upload detection</p>
     */
    public Long getIsUploadAnyFileAnalysis() {
        return this.IsUploadAnyFileAnalysis;
    }

    /**
     * Set <p>Whether to enable arbitrary file upload detection</p>
     * @param IsUploadAnyFileAnalysis <p>Whether to enable arbitrary file upload detection</p>
     */
    public void setIsUploadAnyFileAnalysis(Long IsUploadAnyFileAnalysis) {
        this.IsUploadAnyFileAnalysis = IsUploadAnyFileAnalysis;
    }

    /**
     * Get <p>Whether to enable detection of arbitrary files</p> 
     * @return IsIncludeAnyFileAnalysis <p>Whether to enable detection of arbitrary files</p>
     */
    public Long getIsIncludeAnyFileAnalysis() {
        return this.IsIncludeAnyFileAnalysis;
    }

    /**
     * Set <p>Whether to enable detection of arbitrary files</p>
     * @param IsIncludeAnyFileAnalysis <p>Whether to enable detection of arbitrary files</p>
     */
    public void setIsIncludeAnyFileAnalysis(Long IsIncludeAnyFileAnalysis) {
        this.IsIncludeAnyFileAnalysis = IsIncludeAnyFileAnalysis;
    }

    /**
     * Get <p>Whether path traversal detection is enabled</p> 
     * @return IsDirectoryTraversalAnalysis <p>Whether path traversal detection is enabled</p>
     */
    public Long getIsDirectoryTraversalAnalysis() {
        return this.IsDirectoryTraversalAnalysis;
    }

    /**
     * Set <p>Whether path traversal detection is enabled</p>
     * @param IsDirectoryTraversalAnalysis <p>Whether path traversal detection is enabled</p>
     */
    public void setIsDirectoryTraversalAnalysis(Long IsDirectoryTraversalAnalysis) {
        this.IsDirectoryTraversalAnalysis = IsDirectoryTraversalAnalysis;
    }

    /**
     * Get <p>Whether to enable template engine injection detection</p> 
     * @return IsTemplateEngineInjectionAnalysis <p>Whether to enable template engine injection detection</p>
     */
    public Long getIsTemplateEngineInjectionAnalysis() {
        return this.IsTemplateEngineInjectionAnalysis;
    }

    /**
     * Set <p>Whether to enable template engine injection detection</p>
     * @param IsTemplateEngineInjectionAnalysis <p>Whether to enable template engine injection detection</p>
     */
    public void setIsTemplateEngineInjectionAnalysis(Long IsTemplateEngineInjectionAnalysis) {
        this.IsTemplateEngineInjectionAnalysis = IsTemplateEngineInjectionAnalysis;
    }

    /**
     * Get <p>Whether script engine injection detection is enabled</p> 
     * @return IsScriptEngineInjectionAnalysis <p>Whether script engine injection detection is enabled</p>
     */
    public Long getIsScriptEngineInjectionAnalysis() {
        return this.IsScriptEngineInjectionAnalysis;
    }

    /**
     * Set <p>Whether script engine injection detection is enabled</p>
     * @param IsScriptEngineInjectionAnalysis <p>Whether script engine injection detection is enabled</p>
     */
    public void setIsScriptEngineInjectionAnalysis(Long IsScriptEngineInjectionAnalysis) {
        this.IsScriptEngineInjectionAnalysis = IsScriptEngineInjectionAnalysis;
    }

    /**
     * Get <p>Whether expression injection detection is enabled</p> 
     * @return IsExpressionInjectionAnalysis <p>Whether expression injection detection is enabled</p>
     */
    public Long getIsExpressionInjectionAnalysis() {
        return this.IsExpressionInjectionAnalysis;
    }

    /**
     * Set <p>Whether expression injection detection is enabled</p>
     * @param IsExpressionInjectionAnalysis <p>Whether expression injection detection is enabled</p>
     */
    public void setIsExpressionInjectionAnalysis(Long IsExpressionInjectionAnalysis) {
        this.IsExpressionInjectionAnalysis = IsExpressionInjectionAnalysis;
    }

    /**
     * Get <p>Whether JNDI injection detection is enabled</p> 
     * @return IsJndiInjectionAnalysis <p>Whether JNDI injection detection is enabled</p>
     */
    public Long getIsJndiInjectionAnalysis() {
        return this.IsJndiInjectionAnalysis;
    }

    /**
     * Set <p>Whether JNDI injection detection is enabled</p>
     * @param IsJndiInjectionAnalysis <p>Whether JNDI injection detection is enabled</p>
     */
    public void setIsJndiInjectionAnalysis(Long IsJndiInjectionAnalysis) {
        this.IsJndiInjectionAnalysis = IsJndiInjectionAnalysis;
    }

    /**
     * Get <p>Whether JNI injection detection is enabled</p> 
     * @return IsJniInjectionAnalysis <p>Whether JNI injection detection is enabled</p>
     */
    public Long getIsJniInjectionAnalysis() {
        return this.IsJniInjectionAnalysis;
    }

    /**
     * Set <p>Whether JNI injection detection is enabled</p>
     * @param IsJniInjectionAnalysis <p>Whether JNI injection detection is enabled</p>
     */
    public void setIsJniInjectionAnalysis(Long IsJniInjectionAnalysis) {
        this.IsJniInjectionAnalysis = IsJniInjectionAnalysis;
    }

    /**
     * Get <p>Whether Webshell backdoor detection is enabled</p> 
     * @return IsWebshellBackdoorAnalysis <p>Whether Webshell backdoor detection is enabled</p>
     */
    public Long getIsWebshellBackdoorAnalysis() {
        return this.IsWebshellBackdoorAnalysis;
    }

    /**
     * Set <p>Whether Webshell backdoor detection is enabled</p>
     * @param IsWebshellBackdoorAnalysis <p>Whether Webshell backdoor detection is enabled</p>
     */
    public void setIsWebshellBackdoorAnalysis(Long IsWebshellBackdoorAnalysis) {
        this.IsWebshellBackdoorAnalysis = IsWebshellBackdoorAnalysis;
    }

    /**
     * Get <p>Whether deserialization detection is enabled</p> 
     * @return IsDeserializationAnalysis <p>Whether deserialization detection is enabled</p>
     */
    public Long getIsDeserializationAnalysis() {
        return this.IsDeserializationAnalysis;
    }

    /**
     * Set <p>Whether deserialization detection is enabled</p>
     * @param IsDeserializationAnalysis <p>Whether deserialization detection is enabled</p>
     */
    public void setIsDeserializationAnalysis(Long IsDeserializationAnalysis) {
        this.IsDeserializationAnalysis = IsDeserializationAnalysis;
    }

    /**
     * Get <p>Whether the console switch is enabled</p> 
     * @return EnableDashboardConfig <p>Whether the console switch is enabled</p>
     */
    public Boolean getEnableDashboardConfig() {
        return this.EnableDashboardConfig;
    }

    /**
     * Set <p>Whether the console switch is enabled</p>
     * @param EnableDashboardConfig <p>Whether the console switch is enabled</p>
     */
    public void setEnableDashboardConfig(Boolean EnableDashboardConfig) {
        this.EnableDashboardConfig = EnableDashboardConfig;
    }

    /**
     * Get <p>Whether to associate with Dashboard</p> 
     * @return IsRelatedDashboard <p>Whether to associate with Dashboard</p>
     */
    public Long getIsRelatedDashboard() {
        return this.IsRelatedDashboard;
    }

    /**
     * Set <p>Whether to associate with Dashboard</p>
     * @param IsRelatedDashboard <p>Whether to associate with Dashboard</p>
     */
    public void setIsRelatedDashboard(Long IsRelatedDashboard) {
        this.IsRelatedDashboard = IsRelatedDashboard;
    }

    /**
     * Get <p>Dashboard topic</p> 
     * @return DashboardTopicID <p>Dashboard topic</p>
     */
    public String getDashboardTopicID() {
        return this.DashboardTopicID;
    }

    /**
     * Set <p>Dashboard topic</p>
     * @param DashboardTopicID <p>Dashboard topic</p>
     */
    public void setDashboardTopicID(String DashboardTopicID) {
        this.DashboardTopicID = DashboardTopicID;
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
     * Get <p>Threshold configuration switch</p> 
     * @return EnableThresholdConfig <p>Threshold configuration switch</p>
     */
    public Boolean getEnableThresholdConfig() {
        return this.EnableThresholdConfig;
    }

    /**
     * Set <p>Threshold configuration switch</p>
     * @param EnableThresholdConfig <p>Threshold configuration switch</p>
     */
    public void setEnableThresholdConfig(Boolean EnableThresholdConfig) {
        this.EnableThresholdConfig = EnableThresholdConfig;
    }

    /**
     * Get <p>Error rate threshold</p><p>Unit: %</p> 
     * @return ErrRateThreshold <p>Error rate threshold</p><p>Unit: %</p>
     */
    public Long getErrRateThreshold() {
        return this.ErrRateThreshold;
    }

    /**
     * Set <p>Error rate threshold</p><p>Unit: %</p>
     * @param ErrRateThreshold <p>Error rate threshold</p><p>Unit: %</p>
     */
    public void setErrRateThreshold(Long ErrRateThreshold) {
        this.ErrRateThreshold = ErrRateThreshold;
    }

    /**
     * Get <p>Alert threshold of response time</p><p>Unit: ms</p> 
     * @return ResponseDurationWarningThreshold <p>Alert threshold of response time</p><p>Unit: ms</p>
     */
    public Long getResponseDurationWarningThreshold() {
        return this.ResponseDurationWarningThreshold;
    }

    /**
     * Set <p>Alert threshold of response time</p><p>Unit: ms</p>
     * @param ResponseDurationWarningThreshold <p>Alert threshold of response time</p><p>Unit: ms</p>
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

    public ApmApplicationConfigView() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApmApplicationConfigView(ApmApplicationConfigView source) {
        if (source.InstanceKey != null) {
            this.InstanceKey = new String(source.InstanceKey);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.OperationNameFilter != null) {
            this.OperationNameFilter = new String(source.OperationNameFilter);
        }
        if (source.ExceptionFilter != null) {
            this.ExceptionFilter = new String(source.ExceptionFilter);
        }
        if (source.ErrorCodeFilter != null) {
            this.ErrorCodeFilter = new String(source.ErrorCodeFilter);
        }
        if (source.EventEnable != null) {
            this.EventEnable = new Boolean(source.EventEnable);
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
        if (source.UrlExclude != null) {
            this.UrlExclude = new String(source.UrlExclude);
        }
        if (source.IsRelatedLog != null) {
            this.IsRelatedLog = new Long(source.IsRelatedLog);
        }
        if (source.LogSource != null) {
            this.LogSource = new String(source.LogSource);
        }
        if (source.LogSet != null) {
            this.LogSet = new String(source.LogSet);
        }
        if (source.LogTopicID != null) {
            this.LogTopicID = new String(source.LogTopicID);
        }
        if (source.SnapshotEnable != null) {
            this.SnapshotEnable = new Boolean(source.SnapshotEnable);
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
        if (source.AgentIgnoreOperation != null) {
            this.AgentIgnoreOperation = new String(source.AgentIgnoreOperation);
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
        if (source.IsJndiInjectionAnalysis != null) {
            this.IsJndiInjectionAnalysis = new Long(source.IsJndiInjectionAnalysis);
        }
        if (source.IsJniInjectionAnalysis != null) {
            this.IsJniInjectionAnalysis = new Long(source.IsJniInjectionAnalysis);
        }
        if (source.IsWebshellBackdoorAnalysis != null) {
            this.IsWebshellBackdoorAnalysis = new Long(source.IsWebshellBackdoorAnalysis);
        }
        if (source.IsDeserializationAnalysis != null) {
            this.IsDeserializationAnalysis = new Long(source.IsDeserializationAnalysis);
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
        this.setParamSimple(map, prefix + "InstanceKey", this.InstanceKey);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "OperationNameFilter", this.OperationNameFilter);
        this.setParamSimple(map, prefix + "ExceptionFilter", this.ExceptionFilter);
        this.setParamSimple(map, prefix + "ErrorCodeFilter", this.ErrorCodeFilter);
        this.setParamSimple(map, prefix + "EventEnable", this.EventEnable);
        this.setParamSimple(map, prefix + "UrlConvergenceSwitch", this.UrlConvergenceSwitch);
        this.setParamSimple(map, prefix + "UrlConvergenceThreshold", this.UrlConvergenceThreshold);
        this.setParamSimple(map, prefix + "UrlConvergence", this.UrlConvergence);
        this.setParamSimple(map, prefix + "UrlExclude", this.UrlExclude);
        this.setParamSimple(map, prefix + "IsRelatedLog", this.IsRelatedLog);
        this.setParamSimple(map, prefix + "LogSource", this.LogSource);
        this.setParamSimple(map, prefix + "LogSet", this.LogSet);
        this.setParamSimple(map, prefix + "LogTopicID", this.LogTopicID);
        this.setParamSimple(map, prefix + "SnapshotEnable", this.SnapshotEnable);
        this.setParamSimple(map, prefix + "SnapshotTimeout", this.SnapshotTimeout);
        this.setParamSimple(map, prefix + "AgentEnable", this.AgentEnable);
        this.setParamArrayObj(map, prefix + "InstrumentList.", this.InstrumentList);
        this.setParamSimple(map, prefix + "TraceSquash", this.TraceSquash);
        this.setParamSimple(map, prefix + "AgentIgnoreOperation", this.AgentIgnoreOperation);
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
        this.setParamSimple(map, prefix + "IsJndiInjectionAnalysis", this.IsJndiInjectionAnalysis);
        this.setParamSimple(map, prefix + "IsJniInjectionAnalysis", this.IsJniInjectionAnalysis);
        this.setParamSimple(map, prefix + "IsWebshellBackdoorAnalysis", this.IsWebshellBackdoorAnalysis);
        this.setParamSimple(map, prefix + "IsDeserializationAnalysis", this.IsDeserializationAnalysis);
        this.setParamSimple(map, prefix + "EnableDashboardConfig", this.EnableDashboardConfig);
        this.setParamSimple(map, prefix + "IsRelatedDashboard", this.IsRelatedDashboard);
        this.setParamSimple(map, prefix + "DashboardTopicID", this.DashboardTopicID);
        this.setParamSimple(map, prefix + "DisableMemoryUsed", this.DisableMemoryUsed);
        this.setParamSimple(map, prefix + "DisableCpuUsed", this.DisableCpuUsed);
        this.setParamSimple(map, prefix + "DbStatementParametersEnabled", this.DbStatementParametersEnabled);
        this.setParamArrayObj(map, prefix + "SlowSQLThresholds.", this.SlowSQLThresholds);
        this.setParamSimple(map, prefix + "EnableDesensitizationRule", this.EnableDesensitizationRule);
        this.setParamSimple(map, prefix + "DesensitizationRule", this.DesensitizationRule);
        this.setParamObj(map, prefix + "AutoProfilingConfig.", this.AutoProfilingConfig);
        this.setParamSimple(map, prefix + "EnableThresholdConfig", this.EnableThresholdConfig);
        this.setParamSimple(map, prefix + "ErrRateThreshold", this.ErrRateThreshold);
        this.setParamSimple(map, prefix + "ResponseDurationWarningThreshold", this.ResponseDurationWarningThreshold);
        this.setParamSimple(map, prefix + "UseDefaultFuseConfig", this.UseDefaultFuseConfig);

    }
}


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
    * <p>Instance ID</p>
    */
    @SerializedName("InstanceKey")
    @Expose
    private String InstanceKey;

    /**
    * <p>Service name</p>
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * <p>URL convergence switch</p>
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
    * <p>URL regular convergence</p>
    */
    @SerializedName("UrlConvergence")
    @Expose
    private String UrlConvergence;

    /**
    * <p>Exception filter regular</p>
    */
    @SerializedName("ExceptionFilter")
    @Expose
    private String ExceptionFilter;

    /**
    * <p>Error code filtering</p>
    */
    @SerializedName("ErrorCodeFilter")
    @Expose
    private String ErrorCodeFilter;

    /**
    * <p>Service component type</p>
    */
    @SerializedName("Components")
    @Expose
    private String Components;

    /**
    * <p>URL exclusion regular</p>
    */
    @SerializedName("UrlExclude")
    @Expose
    private String UrlExclude;

    /**
    * <p>Log source</p>
    */
    @SerializedName("LogSource")
    @Expose
    private String LogSource;

    /**
    * <p>Log region</p>
    */
    @SerializedName("LogRegion")
    @Expose
    private String LogRegion;

    /**
    * <p>Whether logging is enabled 0 Disabled 1 Enabled</p>
    */
    @SerializedName("IsRelatedLog")
    @Expose
    private Long IsRelatedLog;

    /**
    * <p>Log topic ID</p>
    */
    @SerializedName("LogTopicID")
    @Expose
    private String LogTopicID;

    /**
    * <p>Interface Names to Filter</p>
    */
    @SerializedName("IgnoreOperationName")
    @Expose
    private String IgnoreOperationName;

    /**
    * <p>CLS logset | ES cluster ID</p>
    */
    @SerializedName("LogSet")
    @Expose
    private String LogSet;

    /**
    * <p>Number of traces reported by the probe per second</p>
    */
    @SerializedName("TraceRateLimit")
    @Expose
    private Long TraceRateLimit;

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
    * <p>Component list</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstrumentList")
    @Expose
    private Instrument [] InstrumentList;

    /**
    * <p>Whether to enable link compression</p>
    */
    @SerializedName("TraceSquash")
    @Expose
    private Boolean TraceSquash;

    /**
    * <p>Whether the application diagnosis switch is enabled</p>
    */
    @SerializedName("EventEnable")
    @Expose
    private Boolean EventEnable;

    /**
    * <p>probe API related configuration</p>
Note: This field may return null, indicating that no valid values can be obtained.
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
    * <p>Application ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceID")
    @Expose
    private String ServiceID;

    /**
    * <p>Whether the dashboard configuration is enabled: false (disabled, consistent with the business system)/true (enabled, hierarchical configuration)</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EnableDashboardConfig")
    @Expose
    private Boolean EnableDashboardConfig;

    /**
    * <p>Whether dashboard is associated: 0 Disabled 1 Enabled</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsRelatedDashboard")
    @Expose
    private Long IsRelatedDashboard;

    /**
    * <p>dashboard ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DashboardTopicID")
    @Expose
    private String DashboardTopicID;

    /**
    * <p>Whether the application-level configuration is enabled</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EnableSecurityConfig")
    @Expose
    private Boolean EnableSecurityConfig;

    /**
    * <p>Whether the component vulnerability detection is enabled</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsInstrumentationVulnerabilityScan")
    @Expose
    private Long IsInstrumentationVulnerabilityScan;

    /**
    * <p>Whether SQL injection analysis is enabled</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsSqlInjectionAnalysis")
    @Expose
    private Long IsSqlInjectionAnalysis;

    /**
    * <p>Whether remote command execution analysis is enabled</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsRemoteCommandExecutionAnalysis")
    @Expose
    private Long IsRemoteCommandExecutionAnalysis;

    /**
    * <p>Whether Java Webshell detection and analysis is enabled</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsMemoryHijackingAnalysis")
    @Expose
    private Long IsMemoryHijackingAnalysis;

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
    * <p>Whether to enable file deletion detection (0 - disabled, 1 - enabled)</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsDeleteAnyFileAnalysis")
    @Expose
    private Long IsDeleteAnyFileAnalysis;

    /**
    * <p>Whether to enable arbitrary file read detection (0 - disabled, 1 - enabled)</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsReadAnyFileAnalysis")
    @Expose
    private Long IsReadAnyFileAnalysis;

    /**
    * <p>Whether to enable arbitrary file upload detection (0 - disabled, 1 - enabled)</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsUploadAnyFileAnalysis")
    @Expose
    private Long IsUploadAnyFileAnalysis;

    /**
    * <p>Whether to enable detection of arbitrary files (0 - disabled, 1 - enabled)</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsIncludeAnyFileAnalysis")
    @Expose
    private Long IsIncludeAnyFileAnalysis;

    /**
    * <p>Whether path traversal detection is enabled (0-disabled, 1-enabled)</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsDirectoryTraversalAnalysis")
    @Expose
    private Long IsDirectoryTraversalAnalysis;

    /**
    * <p>Whether to enable template engine injection detection (0-disable, 1-enable)</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsTemplateEngineInjectionAnalysis")
    @Expose
    private Long IsTemplateEngineInjectionAnalysis;

    /**
    * <p>Whether script engine injection detection is enabled (0-disabled, 1-enabled)</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsScriptEngineInjectionAnalysis")
    @Expose
    private Long IsScriptEngineInjectionAnalysis;

    /**
    * <p>Whether expression injection detection is enabled (0-disabled, 1-enabled)</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsExpressionInjectionAnalysis")
    @Expose
    private Long IsExpressionInjectionAnalysis;

    /**
    * <p>Whether JNDI injection detection is enabled (0-disabled, 1-enabled)</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsJNDIInjectionAnalysis")
    @Expose
    private Long IsJNDIInjectionAnalysis;

    /**
    * <p>Whether JNI injection detection is enabled (0 - disabled, 1 - enabled)</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsJNIInjectionAnalysis")
    @Expose
    private Long IsJNIInjectionAnalysis;

    /**
    * <p>Whether to enable Webshell backdoor detection (0 - disabled, 1 - enabled)</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsWebshellBackdoorAnalysis")
    @Expose
    private Long IsWebshellBackdoorAnalysis;

    /**
    * <p>Whether deserialization detection is enabled (0-disabled, 1-enabled)</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsDeserializationAnalysis")
    @Expose
    private Long IsDeserializationAnalysis;

    /**
    * <p>API name auto convergence switch (0-off, 1-on)</p>
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
    * <p>Automated performance analysis configuration</p>
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
    * <p>Whether to use the built-in fuse threshold of the probe by default</p>
    */
    @SerializedName("UseDefaultFuseConfig")
    @Expose
    private Boolean UseDefaultFuseConfig;

    /**
     * Get <p>Instance ID</p> 
     * @return InstanceKey <p>Instance ID</p>
     */
    public String getInstanceKey() {
        return this.InstanceKey;
    }

    /**
     * Set <p>Instance ID</p>
     * @param InstanceKey <p>Instance ID</p>
     */
    public void setInstanceKey(String InstanceKey) {
        this.InstanceKey = InstanceKey;
    }

    /**
     * Get <p>Service name</p> 
     * @return ServiceName <p>Service name</p>
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set <p>Service name</p>
     * @param ServiceName <p>Service name</p>
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get <p>URL convergence switch</p> 
     * @return UrlConvergenceSwitch <p>URL convergence switch</p>
     */
    public Long getUrlConvergenceSwitch() {
        return this.UrlConvergenceSwitch;
    }

    /**
     * Set <p>URL convergence switch</p>
     * @param UrlConvergenceSwitch <p>URL convergence switch</p>
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
     * Get <p>URL regular convergence</p> 
     * @return UrlConvergence <p>URL regular convergence</p>
     */
    public String getUrlConvergence() {
        return this.UrlConvergence;
    }

    /**
     * Set <p>URL regular convergence</p>
     * @param UrlConvergence <p>URL regular convergence</p>
     */
    public void setUrlConvergence(String UrlConvergence) {
        this.UrlConvergence = UrlConvergence;
    }

    /**
     * Get <p>Exception filter regular</p> 
     * @return ExceptionFilter <p>Exception filter regular</p>
     */
    public String getExceptionFilter() {
        return this.ExceptionFilter;
    }

    /**
     * Set <p>Exception filter regular</p>
     * @param ExceptionFilter <p>Exception filter regular</p>
     */
    public void setExceptionFilter(String ExceptionFilter) {
        this.ExceptionFilter = ExceptionFilter;
    }

    /**
     * Get <p>Error code filtering</p> 
     * @return ErrorCodeFilter <p>Error code filtering</p>
     */
    public String getErrorCodeFilter() {
        return this.ErrorCodeFilter;
    }

    /**
     * Set <p>Error code filtering</p>
     * @param ErrorCodeFilter <p>Error code filtering</p>
     */
    public void setErrorCodeFilter(String ErrorCodeFilter) {
        this.ErrorCodeFilter = ErrorCodeFilter;
    }

    /**
     * Get <p>Service component type</p> 
     * @return Components <p>Service component type</p>
     */
    public String getComponents() {
        return this.Components;
    }

    /**
     * Set <p>Service component type</p>
     * @param Components <p>Service component type</p>
     */
    public void setComponents(String Components) {
        this.Components = Components;
    }

    /**
     * Get <p>URL exclusion regular</p> 
     * @return UrlExclude <p>URL exclusion regular</p>
     */
    public String getUrlExclude() {
        return this.UrlExclude;
    }

    /**
     * Set <p>URL exclusion regular</p>
     * @param UrlExclude <p>URL exclusion regular</p>
     */
    public void setUrlExclude(String UrlExclude) {
        this.UrlExclude = UrlExclude;
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
     * Get <p>Interface Names to Filter</p> 
     * @return IgnoreOperationName <p>Interface Names to Filter</p>
     */
    public String getIgnoreOperationName() {
        return this.IgnoreOperationName;
    }

    /**
     * Set <p>Interface Names to Filter</p>
     * @param IgnoreOperationName <p>Interface Names to Filter</p>
     */
    public void setIgnoreOperationName(String IgnoreOperationName) {
        this.IgnoreOperationName = IgnoreOperationName;
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
     * Get <p>Number of traces reported by the probe per second</p> 
     * @return TraceRateLimit <p>Number of traces reported by the probe per second</p>
     */
    public Long getTraceRateLimit() {
        return this.TraceRateLimit;
    }

    /**
     * Set <p>Number of traces reported by the probe per second</p>
     * @param TraceRateLimit <p>Number of traces reported by the probe per second</p>
     */
    public void setTraceRateLimit(Long TraceRateLimit) {
        this.TraceRateLimit = TraceRateLimit;
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
     * Get <p>Component list</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstrumentList <p>Component list</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Instrument [] getInstrumentList() {
        return this.InstrumentList;
    }

    /**
     * Set <p>Component list</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstrumentList <p>Component list</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstrumentList(Instrument [] InstrumentList) {
        this.InstrumentList = InstrumentList;
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
     * Get <p>Whether the application diagnosis switch is enabled</p> 
     * @return EventEnable <p>Whether the application diagnosis switch is enabled</p>
     */
    public Boolean getEventEnable() {
        return this.EventEnable;
    }

    /**
     * Set <p>Whether the application diagnosis switch is enabled</p>
     * @param EventEnable <p>Whether the application diagnosis switch is enabled</p>
     */
    public void setEventEnable(Boolean EventEnable) {
        this.EventEnable = EventEnable;
    }

    /**
     * Get <p>probe API related configuration</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AgentOperationConfigView <p>probe API related configuration</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AgentOperationConfigView getAgentOperationConfigView() {
        return this.AgentOperationConfigView;
    }

    /**
     * Set <p>probe API related configuration</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AgentOperationConfigView <p>probe API related configuration</p>
Note: This field may return null, indicating that no valid values can be obtained.
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
     * Get <p>Application ID</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ServiceID <p>Application ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getServiceID() {
        return this.ServiceID;
    }

    /**
     * Set <p>Application ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ServiceID <p>Application ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceID(String ServiceID) {
        this.ServiceID = ServiceID;
    }

    /**
     * Get <p>Whether the dashboard configuration is enabled: false (disabled, consistent with the business system)/true (enabled, hierarchical configuration)</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EnableDashboardConfig <p>Whether the dashboard configuration is enabled: false (disabled, consistent with the business system)/true (enabled, hierarchical configuration)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getEnableDashboardConfig() {
        return this.EnableDashboardConfig;
    }

    /**
     * Set <p>Whether the dashboard configuration is enabled: false (disabled, consistent with the business system)/true (enabled, hierarchical configuration)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EnableDashboardConfig <p>Whether the dashboard configuration is enabled: false (disabled, consistent with the business system)/true (enabled, hierarchical configuration)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEnableDashboardConfig(Boolean EnableDashboardConfig) {
        this.EnableDashboardConfig = EnableDashboardConfig;
    }

    /**
     * Get <p>Whether dashboard is associated: 0 Disabled 1 Enabled</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsRelatedDashboard <p>Whether dashboard is associated: 0 Disabled 1 Enabled</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsRelatedDashboard() {
        return this.IsRelatedDashboard;
    }

    /**
     * Set <p>Whether dashboard is associated: 0 Disabled 1 Enabled</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsRelatedDashboard <p>Whether dashboard is associated: 0 Disabled 1 Enabled</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsRelatedDashboard(Long IsRelatedDashboard) {
        this.IsRelatedDashboard = IsRelatedDashboard;
    }

    /**
     * Get <p>dashboard ID</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DashboardTopicID <p>dashboard ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDashboardTopicID() {
        return this.DashboardTopicID;
    }

    /**
     * Set <p>dashboard ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DashboardTopicID <p>dashboard ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDashboardTopicID(String DashboardTopicID) {
        this.DashboardTopicID = DashboardTopicID;
    }

    /**
     * Get <p>Whether the application-level configuration is enabled</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EnableSecurityConfig <p>Whether the application-level configuration is enabled</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getEnableSecurityConfig() {
        return this.EnableSecurityConfig;
    }

    /**
     * Set <p>Whether the application-level configuration is enabled</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EnableSecurityConfig <p>Whether the application-level configuration is enabled</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEnableSecurityConfig(Boolean EnableSecurityConfig) {
        this.EnableSecurityConfig = EnableSecurityConfig;
    }

    /**
     * Get <p>Whether the component vulnerability detection is enabled</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsInstrumentationVulnerabilityScan <p>Whether the component vulnerability detection is enabled</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsInstrumentationVulnerabilityScan() {
        return this.IsInstrumentationVulnerabilityScan;
    }

    /**
     * Set <p>Whether the component vulnerability detection is enabled</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsInstrumentationVulnerabilityScan <p>Whether the component vulnerability detection is enabled</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsInstrumentationVulnerabilityScan(Long IsInstrumentationVulnerabilityScan) {
        this.IsInstrumentationVulnerabilityScan = IsInstrumentationVulnerabilityScan;
    }

    /**
     * Get <p>Whether SQL injection analysis is enabled</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsSqlInjectionAnalysis <p>Whether SQL injection analysis is enabled</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsSqlInjectionAnalysis() {
        return this.IsSqlInjectionAnalysis;
    }

    /**
     * Set <p>Whether SQL injection analysis is enabled</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsSqlInjectionAnalysis <p>Whether SQL injection analysis is enabled</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsSqlInjectionAnalysis(Long IsSqlInjectionAnalysis) {
        this.IsSqlInjectionAnalysis = IsSqlInjectionAnalysis;
    }

    /**
     * Get <p>Whether remote command execution analysis is enabled</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsRemoteCommandExecutionAnalysis <p>Whether remote command execution analysis is enabled</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsRemoteCommandExecutionAnalysis() {
        return this.IsRemoteCommandExecutionAnalysis;
    }

    /**
     * Set <p>Whether remote command execution analysis is enabled</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsRemoteCommandExecutionAnalysis <p>Whether remote command execution analysis is enabled</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsRemoteCommandExecutionAnalysis(Long IsRemoteCommandExecutionAnalysis) {
        this.IsRemoteCommandExecutionAnalysis = IsRemoteCommandExecutionAnalysis;
    }

    /**
     * Get <p>Whether Java Webshell detection and analysis is enabled</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsMemoryHijackingAnalysis <p>Whether Java Webshell detection and analysis is enabled</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsMemoryHijackingAnalysis() {
        return this.IsMemoryHijackingAnalysis;
    }

    /**
     * Set <p>Whether Java Webshell detection and analysis is enabled</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsMemoryHijackingAnalysis <p>Whether Java Webshell detection and analysis is enabled</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsMemoryHijackingAnalysis(Long IsMemoryHijackingAnalysis) {
        this.IsMemoryHijackingAnalysis = IsMemoryHijackingAnalysis;
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
     * Get <p>Whether to enable file deletion detection (0 - disabled, 1 - enabled)</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsDeleteAnyFileAnalysis <p>Whether to enable file deletion detection (0 - disabled, 1 - enabled)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsDeleteAnyFileAnalysis() {
        return this.IsDeleteAnyFileAnalysis;
    }

    /**
     * Set <p>Whether to enable file deletion detection (0 - disabled, 1 - enabled)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsDeleteAnyFileAnalysis <p>Whether to enable file deletion detection (0 - disabled, 1 - enabled)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsDeleteAnyFileAnalysis(Long IsDeleteAnyFileAnalysis) {
        this.IsDeleteAnyFileAnalysis = IsDeleteAnyFileAnalysis;
    }

    /**
     * Get <p>Whether to enable arbitrary file read detection (0 - disabled, 1 - enabled)</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsReadAnyFileAnalysis <p>Whether to enable arbitrary file read detection (0 - disabled, 1 - enabled)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsReadAnyFileAnalysis() {
        return this.IsReadAnyFileAnalysis;
    }

    /**
     * Set <p>Whether to enable arbitrary file read detection (0 - disabled, 1 - enabled)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsReadAnyFileAnalysis <p>Whether to enable arbitrary file read detection (0 - disabled, 1 - enabled)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsReadAnyFileAnalysis(Long IsReadAnyFileAnalysis) {
        this.IsReadAnyFileAnalysis = IsReadAnyFileAnalysis;
    }

    /**
     * Get <p>Whether to enable arbitrary file upload detection (0 - disabled, 1 - enabled)</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsUploadAnyFileAnalysis <p>Whether to enable arbitrary file upload detection (0 - disabled, 1 - enabled)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsUploadAnyFileAnalysis() {
        return this.IsUploadAnyFileAnalysis;
    }

    /**
     * Set <p>Whether to enable arbitrary file upload detection (0 - disabled, 1 - enabled)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsUploadAnyFileAnalysis <p>Whether to enable arbitrary file upload detection (0 - disabled, 1 - enabled)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsUploadAnyFileAnalysis(Long IsUploadAnyFileAnalysis) {
        this.IsUploadAnyFileAnalysis = IsUploadAnyFileAnalysis;
    }

    /**
     * Get <p>Whether to enable detection of arbitrary files (0 - disabled, 1 - enabled)</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsIncludeAnyFileAnalysis <p>Whether to enable detection of arbitrary files (0 - disabled, 1 - enabled)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsIncludeAnyFileAnalysis() {
        return this.IsIncludeAnyFileAnalysis;
    }

    /**
     * Set <p>Whether to enable detection of arbitrary files (0 - disabled, 1 - enabled)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsIncludeAnyFileAnalysis <p>Whether to enable detection of arbitrary files (0 - disabled, 1 - enabled)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsIncludeAnyFileAnalysis(Long IsIncludeAnyFileAnalysis) {
        this.IsIncludeAnyFileAnalysis = IsIncludeAnyFileAnalysis;
    }

    /**
     * Get <p>Whether path traversal detection is enabled (0-disabled, 1-enabled)</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsDirectoryTraversalAnalysis <p>Whether path traversal detection is enabled (0-disabled, 1-enabled)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsDirectoryTraversalAnalysis() {
        return this.IsDirectoryTraversalAnalysis;
    }

    /**
     * Set <p>Whether path traversal detection is enabled (0-disabled, 1-enabled)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsDirectoryTraversalAnalysis <p>Whether path traversal detection is enabled (0-disabled, 1-enabled)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsDirectoryTraversalAnalysis(Long IsDirectoryTraversalAnalysis) {
        this.IsDirectoryTraversalAnalysis = IsDirectoryTraversalAnalysis;
    }

    /**
     * Get <p>Whether to enable template engine injection detection (0-disable, 1-enable)</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsTemplateEngineInjectionAnalysis <p>Whether to enable template engine injection detection (0-disable, 1-enable)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsTemplateEngineInjectionAnalysis() {
        return this.IsTemplateEngineInjectionAnalysis;
    }

    /**
     * Set <p>Whether to enable template engine injection detection (0-disable, 1-enable)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsTemplateEngineInjectionAnalysis <p>Whether to enable template engine injection detection (0-disable, 1-enable)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsTemplateEngineInjectionAnalysis(Long IsTemplateEngineInjectionAnalysis) {
        this.IsTemplateEngineInjectionAnalysis = IsTemplateEngineInjectionAnalysis;
    }

    /**
     * Get <p>Whether script engine injection detection is enabled (0-disabled, 1-enabled)</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsScriptEngineInjectionAnalysis <p>Whether script engine injection detection is enabled (0-disabled, 1-enabled)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsScriptEngineInjectionAnalysis() {
        return this.IsScriptEngineInjectionAnalysis;
    }

    /**
     * Set <p>Whether script engine injection detection is enabled (0-disabled, 1-enabled)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsScriptEngineInjectionAnalysis <p>Whether script engine injection detection is enabled (0-disabled, 1-enabled)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsScriptEngineInjectionAnalysis(Long IsScriptEngineInjectionAnalysis) {
        this.IsScriptEngineInjectionAnalysis = IsScriptEngineInjectionAnalysis;
    }

    /**
     * Get <p>Whether expression injection detection is enabled (0-disabled, 1-enabled)</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsExpressionInjectionAnalysis <p>Whether expression injection detection is enabled (0-disabled, 1-enabled)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsExpressionInjectionAnalysis() {
        return this.IsExpressionInjectionAnalysis;
    }

    /**
     * Set <p>Whether expression injection detection is enabled (0-disabled, 1-enabled)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsExpressionInjectionAnalysis <p>Whether expression injection detection is enabled (0-disabled, 1-enabled)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsExpressionInjectionAnalysis(Long IsExpressionInjectionAnalysis) {
        this.IsExpressionInjectionAnalysis = IsExpressionInjectionAnalysis;
    }

    /**
     * Get <p>Whether JNDI injection detection is enabled (0-disabled, 1-enabled)</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsJNDIInjectionAnalysis <p>Whether JNDI injection detection is enabled (0-disabled, 1-enabled)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsJNDIInjectionAnalysis() {
        return this.IsJNDIInjectionAnalysis;
    }

    /**
     * Set <p>Whether JNDI injection detection is enabled (0-disabled, 1-enabled)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsJNDIInjectionAnalysis <p>Whether JNDI injection detection is enabled (0-disabled, 1-enabled)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsJNDIInjectionAnalysis(Long IsJNDIInjectionAnalysis) {
        this.IsJNDIInjectionAnalysis = IsJNDIInjectionAnalysis;
    }

    /**
     * Get <p>Whether JNI injection detection is enabled (0 - disabled, 1 - enabled)</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsJNIInjectionAnalysis <p>Whether JNI injection detection is enabled (0 - disabled, 1 - enabled)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsJNIInjectionAnalysis() {
        return this.IsJNIInjectionAnalysis;
    }

    /**
     * Set <p>Whether JNI injection detection is enabled (0 - disabled, 1 - enabled)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsJNIInjectionAnalysis <p>Whether JNI injection detection is enabled (0 - disabled, 1 - enabled)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsJNIInjectionAnalysis(Long IsJNIInjectionAnalysis) {
        this.IsJNIInjectionAnalysis = IsJNIInjectionAnalysis;
    }

    /**
     * Get <p>Whether to enable Webshell backdoor detection (0 - disabled, 1 - enabled)</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsWebshellBackdoorAnalysis <p>Whether to enable Webshell backdoor detection (0 - disabled, 1 - enabled)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsWebshellBackdoorAnalysis() {
        return this.IsWebshellBackdoorAnalysis;
    }

    /**
     * Set <p>Whether to enable Webshell backdoor detection (0 - disabled, 1 - enabled)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsWebshellBackdoorAnalysis <p>Whether to enable Webshell backdoor detection (0 - disabled, 1 - enabled)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsWebshellBackdoorAnalysis(Long IsWebshellBackdoorAnalysis) {
        this.IsWebshellBackdoorAnalysis = IsWebshellBackdoorAnalysis;
    }

    /**
     * Get <p>Whether deserialization detection is enabled (0-disabled, 1-enabled)</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsDeserializationAnalysis <p>Whether deserialization detection is enabled (0-disabled, 1-enabled)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsDeserializationAnalysis() {
        return this.IsDeserializationAnalysis;
    }

    /**
     * Set <p>Whether deserialization detection is enabled (0-disabled, 1-enabled)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsDeserializationAnalysis <p>Whether deserialization detection is enabled (0-disabled, 1-enabled)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsDeserializationAnalysis(Long IsDeserializationAnalysis) {
        this.IsDeserializationAnalysis = IsDeserializationAnalysis;
    }

    /**
     * Get <p>API name auto convergence switch (0-off, 1-on)</p> 
     * @return UrlAutoConvergenceEnable <p>API name auto convergence switch (0-off, 1-on)</p>
     */
    public Boolean getUrlAutoConvergenceEnable() {
        return this.UrlAutoConvergenceEnable;
    }

    /**
     * Set <p>API name auto convergence switch (0-off, 1-on)</p>
     * @param UrlAutoConvergenceEnable <p>API name auto convergence switch (0-off, 1-on)</p>
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
     * Get <p>Automated performance analysis configuration</p> 
     * @return AutoProfilingConfig <p>Automated performance analysis configuration</p>
     */
    public AutoProfilingConfig getAutoProfilingConfig() {
        return this.AutoProfilingConfig;
    }

    /**
     * Set <p>Automated performance analysis configuration</p>
     * @param AutoProfilingConfig <p>Automated performance analysis configuration</p>
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
     * Get <p>Whether to use the built-in fuse threshold of the probe by default</p> 
     * @return UseDefaultFuseConfig <p>Whether to use the built-in fuse threshold of the probe by default</p>
     */
    public Boolean getUseDefaultFuseConfig() {
        return this.UseDefaultFuseConfig;
    }

    /**
     * Set <p>Whether to use the built-in fuse threshold of the probe by default</p>
     * @param UseDefaultFuseConfig <p>Whether to use the built-in fuse threshold of the probe by default</p>
     */
    public void setUseDefaultFuseConfig(Boolean UseDefaultFuseConfig) {
        this.UseDefaultFuseConfig = UseDefaultFuseConfig;
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


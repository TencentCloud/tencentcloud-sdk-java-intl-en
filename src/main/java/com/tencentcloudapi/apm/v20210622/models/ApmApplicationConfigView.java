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
    * Business system id.
    */
    @SerializedName("InstanceKey")
    @Expose
    private String InstanceKey;

    /**
    * Application name	.	
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * API filtering.
    */
    @SerializedName("OperationNameFilter")
    @Expose
    private String OperationNameFilter;

    /**
    * Error type filtering.
    */
    @SerializedName("ExceptionFilter")
    @Expose
    private String ExceptionFilter;

    /**
    * HTTP status code filtering.
    */
    @SerializedName("ErrorCodeFilter")
    @Expose
    private String ErrorCodeFilter;

    /**
    * Application diagnosis switch (deprecated).
    */
    @SerializedName("EventEnable")
    @Expose
    private Boolean EventEnable;

    /**
    * URL convergence switch. 0: off; 1: on.
    */
    @SerializedName("UrlConvergenceSwitch")
    @Expose
    private Long UrlConvergenceSwitch;

    /**
    * URL convergence threshold.	
    */
    @SerializedName("UrlConvergenceThreshold")
    @Expose
    private Long UrlConvergenceThreshold;

    /**
    * URL convergence rule in the form of a regular expression.	
    */
    @SerializedName("UrlConvergence")
    @Expose
    private String UrlConvergence;

    /**
    * URL exclusion rule in the form of a regular expression.
    */
    @SerializedName("UrlExclude")
    @Expose
    private String UrlExclude;

    /**
    * Log feature switch. 0: off; 1: on.
    */
    @SerializedName("IsRelatedLog")
    @Expose
    private Long IsRelatedLog;

    /**
    * Log source.	
    */
    @SerializedName("LogSource")
    @Expose
    private String LogSource;

    /**
    * Log set. 
    */
    @SerializedName("LogSet")
    @Expose
    private String LogSet;

    /**
    * Log topic.
    */
    @SerializedName("LogTopicID")
    @Expose
    private String LogTopicID;

    /**
    * Method stack snapshot switch: true to enable, false to disable.
    */
    @SerializedName("SnapshotEnable")
    @Expose
    private Boolean SnapshotEnable;

    /**
    * Slow call listening trigger threshold.
    */
    @SerializedName("SnapshotTimeout")
    @Expose
    private Long SnapshotTimeout;

    /**
    * Probe master switch.
    */
    @SerializedName("AgentEnable")
    @Expose
    private Boolean AgentEnable;

    /**
    * Component list switch (deprecated).
    */
    @SerializedName("InstrumentList")
    @Expose
    private Instrument [] InstrumentList;

    /**
    * Link compression switch (deprecated).
    */
    @SerializedName("TraceSquash")
    @Expose
    private Boolean TraceSquash;

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
     * Get Business system id. 
     * @return InstanceKey Business system id.
     */
    public String getInstanceKey() {
        return this.InstanceKey;
    }

    /**
     * Set Business system id.
     * @param InstanceKey Business system id.
     */
    public void setInstanceKey(String InstanceKey) {
        this.InstanceKey = InstanceKey;
    }

    /**
     * Get Application name	.	 
     * @return ServiceName Application name	.	
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set Application name	.	
     * @param ServiceName Application name	.	
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get API filtering. 
     * @return OperationNameFilter API filtering.
     */
    public String getOperationNameFilter() {
        return this.OperationNameFilter;
    }

    /**
     * Set API filtering.
     * @param OperationNameFilter API filtering.
     */
    public void setOperationNameFilter(String OperationNameFilter) {
        this.OperationNameFilter = OperationNameFilter;
    }

    /**
     * Get Error type filtering. 
     * @return ExceptionFilter Error type filtering.
     */
    public String getExceptionFilter() {
        return this.ExceptionFilter;
    }

    /**
     * Set Error type filtering.
     * @param ExceptionFilter Error type filtering.
     */
    public void setExceptionFilter(String ExceptionFilter) {
        this.ExceptionFilter = ExceptionFilter;
    }

    /**
     * Get HTTP status code filtering. 
     * @return ErrorCodeFilter HTTP status code filtering.
     */
    public String getErrorCodeFilter() {
        return this.ErrorCodeFilter;
    }

    /**
     * Set HTTP status code filtering.
     * @param ErrorCodeFilter HTTP status code filtering.
     */
    public void setErrorCodeFilter(String ErrorCodeFilter) {
        this.ErrorCodeFilter = ErrorCodeFilter;
    }

    /**
     * Get Application diagnosis switch (deprecated). 
     * @return EventEnable Application diagnosis switch (deprecated).
     */
    public Boolean getEventEnable() {
        return this.EventEnable;
    }

    /**
     * Set Application diagnosis switch (deprecated).
     * @param EventEnable Application diagnosis switch (deprecated).
     */
    public void setEventEnable(Boolean EventEnable) {
        this.EventEnable = EventEnable;
    }

    /**
     * Get URL convergence switch. 0: off; 1: on. 
     * @return UrlConvergenceSwitch URL convergence switch. 0: off; 1: on.
     */
    public Long getUrlConvergenceSwitch() {
        return this.UrlConvergenceSwitch;
    }

    /**
     * Set URL convergence switch. 0: off; 1: on.
     * @param UrlConvergenceSwitch URL convergence switch. 0: off; 1: on.
     */
    public void setUrlConvergenceSwitch(Long UrlConvergenceSwitch) {
        this.UrlConvergenceSwitch = UrlConvergenceSwitch;
    }

    /**
     * Get URL convergence threshold.	 
     * @return UrlConvergenceThreshold URL convergence threshold.	
     */
    public Long getUrlConvergenceThreshold() {
        return this.UrlConvergenceThreshold;
    }

    /**
     * Set URL convergence threshold.	
     * @param UrlConvergenceThreshold URL convergence threshold.	
     */
    public void setUrlConvergenceThreshold(Long UrlConvergenceThreshold) {
        this.UrlConvergenceThreshold = UrlConvergenceThreshold;
    }

    /**
     * Get URL convergence rule in the form of a regular expression.	 
     * @return UrlConvergence URL convergence rule in the form of a regular expression.	
     */
    public String getUrlConvergence() {
        return this.UrlConvergence;
    }

    /**
     * Set URL convergence rule in the form of a regular expression.	
     * @param UrlConvergence URL convergence rule in the form of a regular expression.	
     */
    public void setUrlConvergence(String UrlConvergence) {
        this.UrlConvergence = UrlConvergence;
    }

    /**
     * Get URL exclusion rule in the form of a regular expression. 
     * @return UrlExclude URL exclusion rule in the form of a regular expression.
     */
    public String getUrlExclude() {
        return this.UrlExclude;
    }

    /**
     * Set URL exclusion rule in the form of a regular expression.
     * @param UrlExclude URL exclusion rule in the form of a regular expression.
     */
    public void setUrlExclude(String UrlExclude) {
        this.UrlExclude = UrlExclude;
    }

    /**
     * Get Log feature switch. 0: off; 1: on. 
     * @return IsRelatedLog Log feature switch. 0: off; 1: on.
     */
    public Long getIsRelatedLog() {
        return this.IsRelatedLog;
    }

    /**
     * Set Log feature switch. 0: off; 1: on.
     * @param IsRelatedLog Log feature switch. 0: off; 1: on.
     */
    public void setIsRelatedLog(Long IsRelatedLog) {
        this.IsRelatedLog = IsRelatedLog;
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
     * Get Log set.  
     * @return LogSet Log set. 
     */
    public String getLogSet() {
        return this.LogSet;
    }

    /**
     * Set Log set. 
     * @param LogSet Log set. 
     */
    public void setLogSet(String LogSet) {
        this.LogSet = LogSet;
    }

    /**
     * Get Log topic. 
     * @return LogTopicID Log topic.
     */
    public String getLogTopicID() {
        return this.LogTopicID;
    }

    /**
     * Set Log topic.
     * @param LogTopicID Log topic.
     */
    public void setLogTopicID(String LogTopicID) {
        this.LogTopicID = LogTopicID;
    }

    /**
     * Get Method stack snapshot switch: true to enable, false to disable. 
     * @return SnapshotEnable Method stack snapshot switch: true to enable, false to disable.
     */
    public Boolean getSnapshotEnable() {
        return this.SnapshotEnable;
    }

    /**
     * Set Method stack snapshot switch: true to enable, false to disable.
     * @param SnapshotEnable Method stack snapshot switch: true to enable, false to disable.
     */
    public void setSnapshotEnable(Boolean SnapshotEnable) {
        this.SnapshotEnable = SnapshotEnable;
    }

    /**
     * Get Slow call listening trigger threshold. 
     * @return SnapshotTimeout Slow call listening trigger threshold.
     */
    public Long getSnapshotTimeout() {
        return this.SnapshotTimeout;
    }

    /**
     * Set Slow call listening trigger threshold.
     * @param SnapshotTimeout Slow call listening trigger threshold.
     */
    public void setSnapshotTimeout(Long SnapshotTimeout) {
        this.SnapshotTimeout = SnapshotTimeout;
    }

    /**
     * Get Probe master switch. 
     * @return AgentEnable Probe master switch.
     */
    public Boolean getAgentEnable() {
        return this.AgentEnable;
    }

    /**
     * Set Probe master switch.
     * @param AgentEnable Probe master switch.
     */
    public void setAgentEnable(Boolean AgentEnable) {
        this.AgentEnable = AgentEnable;
    }

    /**
     * Get Component list switch (deprecated). 
     * @return InstrumentList Component list switch (deprecated).
     */
    public Instrument [] getInstrumentList() {
        return this.InstrumentList;
    }

    /**
     * Set Component list switch (deprecated).
     * @param InstrumentList Component list switch (deprecated).
     */
    public void setInstrumentList(Instrument [] InstrumentList) {
        this.InstrumentList = InstrumentList;
    }

    /**
     * Get Link compression switch (deprecated). 
     * @return TraceSquash Link compression switch (deprecated).
     */
    public Boolean getTraceSquash() {
        return this.TraceSquash;
    }

    /**
     * Set Link compression switch (deprecated).
     * @param TraceSquash Link compression switch (deprecated).
     */
    public void setTraceSquash(Boolean TraceSquash) {
        this.TraceSquash = TraceSquash;
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
        this.setParamSimple(map, prefix + "DisableMemoryUsed", this.DisableMemoryUsed);
        this.setParamSimple(map, prefix + "DisableCpuUsed", this.DisableCpuUsed);

    }
}


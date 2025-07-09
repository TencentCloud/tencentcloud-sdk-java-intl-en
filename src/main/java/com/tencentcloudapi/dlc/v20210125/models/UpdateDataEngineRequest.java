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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateDataEngineRequest extends AbstractModel {

    /**
    * Resource size
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * Minimum CU resource
    */
    @SerializedName("MinClusters")
    @Expose
    private Long MinClusters;

    /**
    * Maximum CU resource
    */
    @SerializedName("MaxClusters")
    @Expose
    private Long MaxClusters;

    /**
    * Enable the auto-refresh. True means that it is enabled while false means that it is disabled (by default).
    */
    @SerializedName("AutoResume")
    @Expose
    private Boolean AutoResume;

    /**
    * Data engine name
    */
    @SerializedName("DataEngineName")
    @Expose
    private String DataEngineName;

    /**
    * Related information
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Whether to automatically suspend the cluster. False means no (by default) while true means yes.
    */
    @SerializedName("AutoSuspend")
    @Expose
    private Boolean AutoSuspend;

    /**
    * Scheduling policy of starting and ending the cluster: 0 (by default) indicates disabling the scheduling policy; 1 indicates enabling the scheduling policy. (Note: The scheduling policy and the automatic suspension policy are mutually exclusive.)
    */
    @SerializedName("CrontabResumeSuspend")
    @Expose
    private Long CrontabResumeSuspend;

    /**
    * Scheduling policy for the start and end; the complex type includes start and end time and the cluster suspension policy.
    */
    @SerializedName("CrontabResumeSuspendStrategy")
    @Expose
    private CrontabResumeSuspendStrategy CrontabResumeSuspendStrategy;

    /**
    * The maximum number of concurrent tasks for a single cluster, which is 5 by default.
    */
    @SerializedName("MaxConcurrency")
    @Expose
    private Long MaxConcurrency;

    /**
    * Tolerable queuing time, and it is 0 by default. When the queuing time for tasks exceeds the tolerable time, it may trigger scale-out. If this parameter is 0, it means that scale-out may be triggered immediately once tasks start queuing.
    */
    @SerializedName("TolerableQueueTime")
    @Expose
    private Long TolerableQueueTime;

    /**
    * Cluster automatic suspension time
    */
    @SerializedName("AutoSuspendTime")
    @Expose
    private Long AutoSuspendTime;

    /**
    * Whether the AS of the spark jar monthly subscription cluster is enabled
    */
    @SerializedName("ElasticSwitch")
    @Expose
    private Boolean ElasticSwitch;

    /**
    * Upper limit of the spark jar monthly subscription cluster elastic scaling
    */
    @SerializedName("ElasticLimit")
    @Expose
    private Long ElasticLimit;

    /**
    * Session resource configuration template of Spark batch job clusters
    */
    @SerializedName("SessionResourceTemplate")
    @Expose
    private SessionResourceTemplate SessionResourceTemplate;

    /**
     * Get Resource size 
     * @return Size Resource size
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set Resource size
     * @param Size Resource size
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get Minimum CU resource 
     * @return MinClusters Minimum CU resource
     */
    public Long getMinClusters() {
        return this.MinClusters;
    }

    /**
     * Set Minimum CU resource
     * @param MinClusters Minimum CU resource
     */
    public void setMinClusters(Long MinClusters) {
        this.MinClusters = MinClusters;
    }

    /**
     * Get Maximum CU resource 
     * @return MaxClusters Maximum CU resource
     */
    public Long getMaxClusters() {
        return this.MaxClusters;
    }

    /**
     * Set Maximum CU resource
     * @param MaxClusters Maximum CU resource
     */
    public void setMaxClusters(Long MaxClusters) {
        this.MaxClusters = MaxClusters;
    }

    /**
     * Get Enable the auto-refresh. True means that it is enabled while false means that it is disabled (by default). 
     * @return AutoResume Enable the auto-refresh. True means that it is enabled while false means that it is disabled (by default).
     */
    public Boolean getAutoResume() {
        return this.AutoResume;
    }

    /**
     * Set Enable the auto-refresh. True means that it is enabled while false means that it is disabled (by default).
     * @param AutoResume Enable the auto-refresh. True means that it is enabled while false means that it is disabled (by default).
     */
    public void setAutoResume(Boolean AutoResume) {
        this.AutoResume = AutoResume;
    }

    /**
     * Get Data engine name 
     * @return DataEngineName Data engine name
     */
    public String getDataEngineName() {
        return this.DataEngineName;
    }

    /**
     * Set Data engine name
     * @param DataEngineName Data engine name
     */
    public void setDataEngineName(String DataEngineName) {
        this.DataEngineName = DataEngineName;
    }

    /**
     * Get Related information 
     * @return Message Related information
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Related information
     * @param Message Related information
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Whether to automatically suspend the cluster. False means no (by default) while true means yes. 
     * @return AutoSuspend Whether to automatically suspend the cluster. False means no (by default) while true means yes.
     */
    public Boolean getAutoSuspend() {
        return this.AutoSuspend;
    }

    /**
     * Set Whether to automatically suspend the cluster. False means no (by default) while true means yes.
     * @param AutoSuspend Whether to automatically suspend the cluster. False means no (by default) while true means yes.
     */
    public void setAutoSuspend(Boolean AutoSuspend) {
        this.AutoSuspend = AutoSuspend;
    }

    /**
     * Get Scheduling policy of starting and ending the cluster: 0 (by default) indicates disabling the scheduling policy; 1 indicates enabling the scheduling policy. (Note: The scheduling policy and the automatic suspension policy are mutually exclusive.) 
     * @return CrontabResumeSuspend Scheduling policy of starting and ending the cluster: 0 (by default) indicates disabling the scheduling policy; 1 indicates enabling the scheduling policy. (Note: The scheduling policy and the automatic suspension policy are mutually exclusive.)
     */
    public Long getCrontabResumeSuspend() {
        return this.CrontabResumeSuspend;
    }

    /**
     * Set Scheduling policy of starting and ending the cluster: 0 (by default) indicates disabling the scheduling policy; 1 indicates enabling the scheduling policy. (Note: The scheduling policy and the automatic suspension policy are mutually exclusive.)
     * @param CrontabResumeSuspend Scheduling policy of starting and ending the cluster: 0 (by default) indicates disabling the scheduling policy; 1 indicates enabling the scheduling policy. (Note: The scheduling policy and the automatic suspension policy are mutually exclusive.)
     */
    public void setCrontabResumeSuspend(Long CrontabResumeSuspend) {
        this.CrontabResumeSuspend = CrontabResumeSuspend;
    }

    /**
     * Get Scheduling policy for the start and end; the complex type includes start and end time and the cluster suspension policy. 
     * @return CrontabResumeSuspendStrategy Scheduling policy for the start and end; the complex type includes start and end time and the cluster suspension policy.
     */
    public CrontabResumeSuspendStrategy getCrontabResumeSuspendStrategy() {
        return this.CrontabResumeSuspendStrategy;
    }

    /**
     * Set Scheduling policy for the start and end; the complex type includes start and end time and the cluster suspension policy.
     * @param CrontabResumeSuspendStrategy Scheduling policy for the start and end; the complex type includes start and end time and the cluster suspension policy.
     */
    public void setCrontabResumeSuspendStrategy(CrontabResumeSuspendStrategy CrontabResumeSuspendStrategy) {
        this.CrontabResumeSuspendStrategy = CrontabResumeSuspendStrategy;
    }

    /**
     * Get The maximum number of concurrent tasks for a single cluster, which is 5 by default. 
     * @return MaxConcurrency The maximum number of concurrent tasks for a single cluster, which is 5 by default.
     */
    public Long getMaxConcurrency() {
        return this.MaxConcurrency;
    }

    /**
     * Set The maximum number of concurrent tasks for a single cluster, which is 5 by default.
     * @param MaxConcurrency The maximum number of concurrent tasks for a single cluster, which is 5 by default.
     */
    public void setMaxConcurrency(Long MaxConcurrency) {
        this.MaxConcurrency = MaxConcurrency;
    }

    /**
     * Get Tolerable queuing time, and it is 0 by default. When the queuing time for tasks exceeds the tolerable time, it may trigger scale-out. If this parameter is 0, it means that scale-out may be triggered immediately once tasks start queuing. 
     * @return TolerableQueueTime Tolerable queuing time, and it is 0 by default. When the queuing time for tasks exceeds the tolerable time, it may trigger scale-out. If this parameter is 0, it means that scale-out may be triggered immediately once tasks start queuing.
     */
    public Long getTolerableQueueTime() {
        return this.TolerableQueueTime;
    }

    /**
     * Set Tolerable queuing time, and it is 0 by default. When the queuing time for tasks exceeds the tolerable time, it may trigger scale-out. If this parameter is 0, it means that scale-out may be triggered immediately once tasks start queuing.
     * @param TolerableQueueTime Tolerable queuing time, and it is 0 by default. When the queuing time for tasks exceeds the tolerable time, it may trigger scale-out. If this parameter is 0, it means that scale-out may be triggered immediately once tasks start queuing.
     */
    public void setTolerableQueueTime(Long TolerableQueueTime) {
        this.TolerableQueueTime = TolerableQueueTime;
    }

    /**
     * Get Cluster automatic suspension time 
     * @return AutoSuspendTime Cluster automatic suspension time
     */
    public Long getAutoSuspendTime() {
        return this.AutoSuspendTime;
    }

    /**
     * Set Cluster automatic suspension time
     * @param AutoSuspendTime Cluster automatic suspension time
     */
    public void setAutoSuspendTime(Long AutoSuspendTime) {
        this.AutoSuspendTime = AutoSuspendTime;
    }

    /**
     * Get Whether the AS of the spark jar monthly subscription cluster is enabled 
     * @return ElasticSwitch Whether the AS of the spark jar monthly subscription cluster is enabled
     */
    public Boolean getElasticSwitch() {
        return this.ElasticSwitch;
    }

    /**
     * Set Whether the AS of the spark jar monthly subscription cluster is enabled
     * @param ElasticSwitch Whether the AS of the spark jar monthly subscription cluster is enabled
     */
    public void setElasticSwitch(Boolean ElasticSwitch) {
        this.ElasticSwitch = ElasticSwitch;
    }

    /**
     * Get Upper limit of the spark jar monthly subscription cluster elastic scaling 
     * @return ElasticLimit Upper limit of the spark jar monthly subscription cluster elastic scaling
     */
    public Long getElasticLimit() {
        return this.ElasticLimit;
    }

    /**
     * Set Upper limit of the spark jar monthly subscription cluster elastic scaling
     * @param ElasticLimit Upper limit of the spark jar monthly subscription cluster elastic scaling
     */
    public void setElasticLimit(Long ElasticLimit) {
        this.ElasticLimit = ElasticLimit;
    }

    /**
     * Get Session resource configuration template of Spark batch job clusters 
     * @return SessionResourceTemplate Session resource configuration template of Spark batch job clusters
     */
    public SessionResourceTemplate getSessionResourceTemplate() {
        return this.SessionResourceTemplate;
    }

    /**
     * Set Session resource configuration template of Spark batch job clusters
     * @param SessionResourceTemplate Session resource configuration template of Spark batch job clusters
     */
    public void setSessionResourceTemplate(SessionResourceTemplate SessionResourceTemplate) {
        this.SessionResourceTemplate = SessionResourceTemplate;
    }

    public UpdateDataEngineRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateDataEngineRequest(UpdateDataEngineRequest source) {
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.MinClusters != null) {
            this.MinClusters = new Long(source.MinClusters);
        }
        if (source.MaxClusters != null) {
            this.MaxClusters = new Long(source.MaxClusters);
        }
        if (source.AutoResume != null) {
            this.AutoResume = new Boolean(source.AutoResume);
        }
        if (source.DataEngineName != null) {
            this.DataEngineName = new String(source.DataEngineName);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.AutoSuspend != null) {
            this.AutoSuspend = new Boolean(source.AutoSuspend);
        }
        if (source.CrontabResumeSuspend != null) {
            this.CrontabResumeSuspend = new Long(source.CrontabResumeSuspend);
        }
        if (source.CrontabResumeSuspendStrategy != null) {
            this.CrontabResumeSuspendStrategy = new CrontabResumeSuspendStrategy(source.CrontabResumeSuspendStrategy);
        }
        if (source.MaxConcurrency != null) {
            this.MaxConcurrency = new Long(source.MaxConcurrency);
        }
        if (source.TolerableQueueTime != null) {
            this.TolerableQueueTime = new Long(source.TolerableQueueTime);
        }
        if (source.AutoSuspendTime != null) {
            this.AutoSuspendTime = new Long(source.AutoSuspendTime);
        }
        if (source.ElasticSwitch != null) {
            this.ElasticSwitch = new Boolean(source.ElasticSwitch);
        }
        if (source.ElasticLimit != null) {
            this.ElasticLimit = new Long(source.ElasticLimit);
        }
        if (source.SessionResourceTemplate != null) {
            this.SessionResourceTemplate = new SessionResourceTemplate(source.SessionResourceTemplate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "MinClusters", this.MinClusters);
        this.setParamSimple(map, prefix + "MaxClusters", this.MaxClusters);
        this.setParamSimple(map, prefix + "AutoResume", this.AutoResume);
        this.setParamSimple(map, prefix + "DataEngineName", this.DataEngineName);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "AutoSuspend", this.AutoSuspend);
        this.setParamSimple(map, prefix + "CrontabResumeSuspend", this.CrontabResumeSuspend);
        this.setParamObj(map, prefix + "CrontabResumeSuspendStrategy.", this.CrontabResumeSuspendStrategy);
        this.setParamSimple(map, prefix + "MaxConcurrency", this.MaxConcurrency);
        this.setParamSimple(map, prefix + "TolerableQueueTime", this.TolerableQueueTime);
        this.setParamSimple(map, prefix + "AutoSuspendTime", this.AutoSuspendTime);
        this.setParamSimple(map, prefix + "ElasticSwitch", this.ElasticSwitch);
        this.setParamSimple(map, prefix + "ElasticLimit", this.ElasticLimit);
        this.setParamObj(map, prefix + "SessionResourceTemplate.", this.SessionResourceTemplate);

    }
}


/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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

public class CreateDataEngineRequest extends AbstractModel {

    /**
    * The engine type. Valid values: `spark` and `presto`.
    */
    @SerializedName("EngineType")
    @Expose
    private String EngineType;

    /**
    * The name of the virtual cluster.
    */
    @SerializedName("DataEngineName")
    @Expose
    private String DataEngineName;

    /**
    * The cluster type. Valid values: `spark_private`, `presto_private`, `presto_cu`, and `spark_cu`.
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * The billing mode. Valid values: `0` (shared engine), `1` (pay-as-you-go), and `2` (monthly subscription).
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * Whether to automatically start the clusters.
    */
    @SerializedName("AutoResume")
    @Expose
    private Boolean AutoResume;

    /**
    * The minimum number of clusters.
    */
    @SerializedName("MinClusters")
    @Expose
    private Long MinClusters;

    /**
    * The maximum number of clusters.
    */
    @SerializedName("MaxClusters")
    @Expose
    private Long MaxClusters;

    /**
    * Whether the cluster is the default one.
    */
    @SerializedName("DefaultDataEngine")
    @Expose
    private Boolean DefaultDataEngine;

    /**
    * The VPC CIDR block.
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * The description.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * The cluster size.
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * The pay mode. Valid value: `0` (postpaid, default) and `1` (prepaid) (currently not available).
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * The resource period. For the postpaid mode, the value is 3600 (default); for the prepaid mode, the value must be in the range of 1–120, representing purchasing the resource for 1–120 months.
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * The unit of the resource period. Valid values: `s` (default) for the postpaid mode and `m` for the prepaid mode.
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * The auto-renewal status of the resource. For the postpaid mode, no renewal is required, and the value is fixed to `0`. For the prepaid mode, valid values are `0` (manual), `1` (auto), and `2` (no renewal). If this parameter is set to `0` for a key account in the prepaid mode, auto-renewal applies. It defaults to `0`.
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
    * The tags to be set for the resource being created.
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * Whether to automatically suspend clusters. Valid values: `false` (default, no) and `true` (yes).
    */
    @SerializedName("AutoSuspend")
    @Expose
    private Boolean AutoSuspend;

    /**
    * Whether to enable scheduled start and suspension of clusters. Valid values: `0` (disable) and `1` (enable). Note: This policy and the auto-suspension policy are mutually exclusive.
    */
    @SerializedName("CrontabResumeSuspend")
    @Expose
    private Long CrontabResumeSuspend;

    /**
    * The complex policy for scheduled start and suspension, including the start/suspension time and suspension policy.
    */
    @SerializedName("CrontabResumeSuspendStrategy")
    @Expose
    private CrontabResumeSuspendStrategy CrontabResumeSuspendStrategy;

    /**
    * The type of tasks to be executed by the engine, which defaults to SQL. Valid values: `SQL` and `BATCH`.
    */
    @SerializedName("EngineExecType")
    @Expose
    private String EngineExecType;

    /**
    * The max task concurrency of a cluster, which defaults to 5.
    */
    @SerializedName("MaxConcurrency")
    @Expose
    private Long MaxConcurrency;

    /**
    * The task queue time limit, which defaults to 0. When the actual queue time exceeds the value set here, scale-out may be triggered. Setting this parameter to 0 represents that scale-out may be triggered immediately after a task queues up.
    */
    @SerializedName("TolerableQueueTime")
    @Expose
    private Long TolerableQueueTime;

    /**
    * The cluster auto-suspension time, which defaults to 10 min.
    */
    @SerializedName("AutoSuspendTime")
    @Expose
    private Long AutoSuspendTime;

    /**
    * The resource type. Valid values: `Standard_CU` (standard) and `Memory_CU` (memory).
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * The advanced configurations of clusters.
    */
    @SerializedName("DataEngineConfigPairs")
    @Expose
    private DataEngineConfigPair [] DataEngineConfigPairs;

    /**
    * The version name of cluster image, such as SuperSQL-P 1.1 and SuperSQL-S 3.2. If no value is passed in, a cluster is created using the latest image version.
    */
    @SerializedName("ImageVersionName")
    @Expose
    private String ImageVersionName;

    /**
    * The primary cluster, which is specified when a failover cluster is created.
    */
    @SerializedName("MainClusterName")
    @Expose
    private String MainClusterName;

    /**
    * Whether to enable the scaling feature for a monthly subscribed Spark job cluster.
    */
    @SerializedName("ElasticSwitch")
    @Expose
    private Boolean ElasticSwitch;

    /**
    * The upper limit (in CUs) for scaling of the monthly subscribed Spark job cluster.
    */
    @SerializedName("ElasticLimit")
    @Expose
    private Long ElasticLimit;

    /**
    * The session resource configuration template for a Spark job cluster.
    */
    @SerializedName("SessionResourceTemplate")
    @Expose
    private SessionResourceTemplate SessionResourceTemplate;

    /**
     * Get The engine type. Valid values: `spark` and `presto`. 
     * @return EngineType The engine type. Valid values: `spark` and `presto`.
     */
    public String getEngineType() {
        return this.EngineType;
    }

    /**
     * Set The engine type. Valid values: `spark` and `presto`.
     * @param EngineType The engine type. Valid values: `spark` and `presto`.
     */
    public void setEngineType(String EngineType) {
        this.EngineType = EngineType;
    }

    /**
     * Get The name of the virtual cluster. 
     * @return DataEngineName The name of the virtual cluster.
     */
    public String getDataEngineName() {
        return this.DataEngineName;
    }

    /**
     * Set The name of the virtual cluster.
     * @param DataEngineName The name of the virtual cluster.
     */
    public void setDataEngineName(String DataEngineName) {
        this.DataEngineName = DataEngineName;
    }

    /**
     * Get The cluster type. Valid values: `spark_private`, `presto_private`, `presto_cu`, and `spark_cu`. 
     * @return ClusterType The cluster type. Valid values: `spark_private`, `presto_private`, `presto_cu`, and `spark_cu`.
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set The cluster type. Valid values: `spark_private`, `presto_private`, `presto_cu`, and `spark_cu`.
     * @param ClusterType The cluster type. Valid values: `spark_private`, `presto_private`, `presto_cu`, and `spark_cu`.
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get The billing mode. Valid values: `0` (shared engine), `1` (pay-as-you-go), and `2` (monthly subscription). 
     * @return Mode The billing mode. Valid values: `0` (shared engine), `1` (pay-as-you-go), and `2` (monthly subscription).
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set The billing mode. Valid values: `0` (shared engine), `1` (pay-as-you-go), and `2` (monthly subscription).
     * @param Mode The billing mode. Valid values: `0` (shared engine), `1` (pay-as-you-go), and `2` (monthly subscription).
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get Whether to automatically start the clusters. 
     * @return AutoResume Whether to automatically start the clusters.
     */
    public Boolean getAutoResume() {
        return this.AutoResume;
    }

    /**
     * Set Whether to automatically start the clusters.
     * @param AutoResume Whether to automatically start the clusters.
     */
    public void setAutoResume(Boolean AutoResume) {
        this.AutoResume = AutoResume;
    }

    /**
     * Get The minimum number of clusters. 
     * @return MinClusters The minimum number of clusters.
     */
    public Long getMinClusters() {
        return this.MinClusters;
    }

    /**
     * Set The minimum number of clusters.
     * @param MinClusters The minimum number of clusters.
     */
    public void setMinClusters(Long MinClusters) {
        this.MinClusters = MinClusters;
    }

    /**
     * Get The maximum number of clusters. 
     * @return MaxClusters The maximum number of clusters.
     */
    public Long getMaxClusters() {
        return this.MaxClusters;
    }

    /**
     * Set The maximum number of clusters.
     * @param MaxClusters The maximum number of clusters.
     */
    public void setMaxClusters(Long MaxClusters) {
        this.MaxClusters = MaxClusters;
    }

    /**
     * Get Whether the cluster is the default one. 
     * @return DefaultDataEngine Whether the cluster is the default one.
     * @deprecated
     */
    @Deprecated
    public Boolean getDefaultDataEngine() {
        return this.DefaultDataEngine;
    }

    /**
     * Set Whether the cluster is the default one.
     * @param DefaultDataEngine Whether the cluster is the default one.
     * @deprecated
     */
    @Deprecated
    public void setDefaultDataEngine(Boolean DefaultDataEngine) {
        this.DefaultDataEngine = DefaultDataEngine;
    }

    /**
     * Get The VPC CIDR block. 
     * @return CidrBlock The VPC CIDR block.
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set The VPC CIDR block.
     * @param CidrBlock The VPC CIDR block.
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get The description. 
     * @return Message The description.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set The description.
     * @param Message The description.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get The cluster size. 
     * @return Size The cluster size.
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set The cluster size.
     * @param Size The cluster size.
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get The pay mode. Valid value: `0` (postpaid, default) and `1` (prepaid) (currently not available). 
     * @return PayMode The pay mode. Valid value: `0` (postpaid, default) and `1` (prepaid) (currently not available).
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set The pay mode. Valid value: `0` (postpaid, default) and `1` (prepaid) (currently not available).
     * @param PayMode The pay mode. Valid value: `0` (postpaid, default) and `1` (prepaid) (currently not available).
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get The resource period. For the postpaid mode, the value is 3600 (default); for the prepaid mode, the value must be in the range of 1–120, representing purchasing the resource for 1–120 months. 
     * @return TimeSpan The resource period. For the postpaid mode, the value is 3600 (default); for the prepaid mode, the value must be in the range of 1–120, representing purchasing the resource for 1–120 months.
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set The resource period. For the postpaid mode, the value is 3600 (default); for the prepaid mode, the value must be in the range of 1–120, representing purchasing the resource for 1–120 months.
     * @param TimeSpan The resource period. For the postpaid mode, the value is 3600 (default); for the prepaid mode, the value must be in the range of 1–120, representing purchasing the resource for 1–120 months.
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get The unit of the resource period. Valid values: `s` (default) for the postpaid mode and `m` for the prepaid mode. 
     * @return TimeUnit The unit of the resource period. Valid values: `s` (default) for the postpaid mode and `m` for the prepaid mode.
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set The unit of the resource period. Valid values: `s` (default) for the postpaid mode and `m` for the prepaid mode.
     * @param TimeUnit The unit of the resource period. Valid values: `s` (default) for the postpaid mode and `m` for the prepaid mode.
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get The auto-renewal status of the resource. For the postpaid mode, no renewal is required, and the value is fixed to `0`. For the prepaid mode, valid values are `0` (manual), `1` (auto), and `2` (no renewal). If this parameter is set to `0` for a key account in the prepaid mode, auto-renewal applies. It defaults to `0`. 
     * @return AutoRenew The auto-renewal status of the resource. For the postpaid mode, no renewal is required, and the value is fixed to `0`. For the prepaid mode, valid values are `0` (manual), `1` (auto), and `2` (no renewal). If this parameter is set to `0` for a key account in the prepaid mode, auto-renewal applies. It defaults to `0`.
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set The auto-renewal status of the resource. For the postpaid mode, no renewal is required, and the value is fixed to `0`. For the prepaid mode, valid values are `0` (manual), `1` (auto), and `2` (no renewal). If this parameter is set to `0` for a key account in the prepaid mode, auto-renewal applies. It defaults to `0`.
     * @param AutoRenew The auto-renewal status of the resource. For the postpaid mode, no renewal is required, and the value is fixed to `0`. For the prepaid mode, valid values are `0` (manual), `1` (auto), and `2` (no renewal). If this parameter is set to `0` for a key account in the prepaid mode, auto-renewal applies. It defaults to `0`.
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get The tags to be set for the resource being created. 
     * @return Tags The tags to be set for the resource being created.
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set The tags to be set for the resource being created.
     * @param Tags The tags to be set for the resource being created.
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Whether to automatically suspend clusters. Valid values: `false` (default, no) and `true` (yes). 
     * @return AutoSuspend Whether to automatically suspend clusters. Valid values: `false` (default, no) and `true` (yes).
     */
    public Boolean getAutoSuspend() {
        return this.AutoSuspend;
    }

    /**
     * Set Whether to automatically suspend clusters. Valid values: `false` (default, no) and `true` (yes).
     * @param AutoSuspend Whether to automatically suspend clusters. Valid values: `false` (default, no) and `true` (yes).
     */
    public void setAutoSuspend(Boolean AutoSuspend) {
        this.AutoSuspend = AutoSuspend;
    }

    /**
     * Get Whether to enable scheduled start and suspension of clusters. Valid values: `0` (disable) and `1` (enable). Note: This policy and the auto-suspension policy are mutually exclusive. 
     * @return CrontabResumeSuspend Whether to enable scheduled start and suspension of clusters. Valid values: `0` (disable) and `1` (enable). Note: This policy and the auto-suspension policy are mutually exclusive.
     */
    public Long getCrontabResumeSuspend() {
        return this.CrontabResumeSuspend;
    }

    /**
     * Set Whether to enable scheduled start and suspension of clusters. Valid values: `0` (disable) and `1` (enable). Note: This policy and the auto-suspension policy are mutually exclusive.
     * @param CrontabResumeSuspend Whether to enable scheduled start and suspension of clusters. Valid values: `0` (disable) and `1` (enable). Note: This policy and the auto-suspension policy are mutually exclusive.
     */
    public void setCrontabResumeSuspend(Long CrontabResumeSuspend) {
        this.CrontabResumeSuspend = CrontabResumeSuspend;
    }

    /**
     * Get The complex policy for scheduled start and suspension, including the start/suspension time and suspension policy. 
     * @return CrontabResumeSuspendStrategy The complex policy for scheduled start and suspension, including the start/suspension time and suspension policy.
     */
    public CrontabResumeSuspendStrategy getCrontabResumeSuspendStrategy() {
        return this.CrontabResumeSuspendStrategy;
    }

    /**
     * Set The complex policy for scheduled start and suspension, including the start/suspension time and suspension policy.
     * @param CrontabResumeSuspendStrategy The complex policy for scheduled start and suspension, including the start/suspension time and suspension policy.
     */
    public void setCrontabResumeSuspendStrategy(CrontabResumeSuspendStrategy CrontabResumeSuspendStrategy) {
        this.CrontabResumeSuspendStrategy = CrontabResumeSuspendStrategy;
    }

    /**
     * Get The type of tasks to be executed by the engine, which defaults to SQL. Valid values: `SQL` and `BATCH`. 
     * @return EngineExecType The type of tasks to be executed by the engine, which defaults to SQL. Valid values: `SQL` and `BATCH`.
     */
    public String getEngineExecType() {
        return this.EngineExecType;
    }

    /**
     * Set The type of tasks to be executed by the engine, which defaults to SQL. Valid values: `SQL` and `BATCH`.
     * @param EngineExecType The type of tasks to be executed by the engine, which defaults to SQL. Valid values: `SQL` and `BATCH`.
     */
    public void setEngineExecType(String EngineExecType) {
        this.EngineExecType = EngineExecType;
    }

    /**
     * Get The max task concurrency of a cluster, which defaults to 5. 
     * @return MaxConcurrency The max task concurrency of a cluster, which defaults to 5.
     */
    public Long getMaxConcurrency() {
        return this.MaxConcurrency;
    }

    /**
     * Set The max task concurrency of a cluster, which defaults to 5.
     * @param MaxConcurrency The max task concurrency of a cluster, which defaults to 5.
     */
    public void setMaxConcurrency(Long MaxConcurrency) {
        this.MaxConcurrency = MaxConcurrency;
    }

    /**
     * Get The task queue time limit, which defaults to 0. When the actual queue time exceeds the value set here, scale-out may be triggered. Setting this parameter to 0 represents that scale-out may be triggered immediately after a task queues up. 
     * @return TolerableQueueTime The task queue time limit, which defaults to 0. When the actual queue time exceeds the value set here, scale-out may be triggered. Setting this parameter to 0 represents that scale-out may be triggered immediately after a task queues up.
     */
    public Long getTolerableQueueTime() {
        return this.TolerableQueueTime;
    }

    /**
     * Set The task queue time limit, which defaults to 0. When the actual queue time exceeds the value set here, scale-out may be triggered. Setting this parameter to 0 represents that scale-out may be triggered immediately after a task queues up.
     * @param TolerableQueueTime The task queue time limit, which defaults to 0. When the actual queue time exceeds the value set here, scale-out may be triggered. Setting this parameter to 0 represents that scale-out may be triggered immediately after a task queues up.
     */
    public void setTolerableQueueTime(Long TolerableQueueTime) {
        this.TolerableQueueTime = TolerableQueueTime;
    }

    /**
     * Get The cluster auto-suspension time, which defaults to 10 min. 
     * @return AutoSuspendTime The cluster auto-suspension time, which defaults to 10 min.
     */
    public Long getAutoSuspendTime() {
        return this.AutoSuspendTime;
    }

    /**
     * Set The cluster auto-suspension time, which defaults to 10 min.
     * @param AutoSuspendTime The cluster auto-suspension time, which defaults to 10 min.
     */
    public void setAutoSuspendTime(Long AutoSuspendTime) {
        this.AutoSuspendTime = AutoSuspendTime;
    }

    /**
     * Get The resource type. Valid values: `Standard_CU` (standard) and `Memory_CU` (memory). 
     * @return ResourceType The resource type. Valid values: `Standard_CU` (standard) and `Memory_CU` (memory).
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set The resource type. Valid values: `Standard_CU` (standard) and `Memory_CU` (memory).
     * @param ResourceType The resource type. Valid values: `Standard_CU` (standard) and `Memory_CU` (memory).
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get The advanced configurations of clusters. 
     * @return DataEngineConfigPairs The advanced configurations of clusters.
     */
    public DataEngineConfigPair [] getDataEngineConfigPairs() {
        return this.DataEngineConfigPairs;
    }

    /**
     * Set The advanced configurations of clusters.
     * @param DataEngineConfigPairs The advanced configurations of clusters.
     */
    public void setDataEngineConfigPairs(DataEngineConfigPair [] DataEngineConfigPairs) {
        this.DataEngineConfigPairs = DataEngineConfigPairs;
    }

    /**
     * Get The version name of cluster image, such as SuperSQL-P 1.1 and SuperSQL-S 3.2. If no value is passed in, a cluster is created using the latest image version. 
     * @return ImageVersionName The version name of cluster image, such as SuperSQL-P 1.1 and SuperSQL-S 3.2. If no value is passed in, a cluster is created using the latest image version.
     */
    public String getImageVersionName() {
        return this.ImageVersionName;
    }

    /**
     * Set The version name of cluster image, such as SuperSQL-P 1.1 and SuperSQL-S 3.2. If no value is passed in, a cluster is created using the latest image version.
     * @param ImageVersionName The version name of cluster image, such as SuperSQL-P 1.1 and SuperSQL-S 3.2. If no value is passed in, a cluster is created using the latest image version.
     */
    public void setImageVersionName(String ImageVersionName) {
        this.ImageVersionName = ImageVersionName;
    }

    /**
     * Get The primary cluster, which is specified when a failover cluster is created. 
     * @return MainClusterName The primary cluster, which is specified when a failover cluster is created.
     */
    public String getMainClusterName() {
        return this.MainClusterName;
    }

    /**
     * Set The primary cluster, which is specified when a failover cluster is created.
     * @param MainClusterName The primary cluster, which is specified when a failover cluster is created.
     */
    public void setMainClusterName(String MainClusterName) {
        this.MainClusterName = MainClusterName;
    }

    /**
     * Get Whether to enable the scaling feature for a monthly subscribed Spark job cluster. 
     * @return ElasticSwitch Whether to enable the scaling feature for a monthly subscribed Spark job cluster.
     */
    public Boolean getElasticSwitch() {
        return this.ElasticSwitch;
    }

    /**
     * Set Whether to enable the scaling feature for a monthly subscribed Spark job cluster.
     * @param ElasticSwitch Whether to enable the scaling feature for a monthly subscribed Spark job cluster.
     */
    public void setElasticSwitch(Boolean ElasticSwitch) {
        this.ElasticSwitch = ElasticSwitch;
    }

    /**
     * Get The upper limit (in CUs) for scaling of the monthly subscribed Spark job cluster. 
     * @return ElasticLimit The upper limit (in CUs) for scaling of the monthly subscribed Spark job cluster.
     */
    public Long getElasticLimit() {
        return this.ElasticLimit;
    }

    /**
     * Set The upper limit (in CUs) for scaling of the monthly subscribed Spark job cluster.
     * @param ElasticLimit The upper limit (in CUs) for scaling of the monthly subscribed Spark job cluster.
     */
    public void setElasticLimit(Long ElasticLimit) {
        this.ElasticLimit = ElasticLimit;
    }

    /**
     * Get The session resource configuration template for a Spark job cluster. 
     * @return SessionResourceTemplate The session resource configuration template for a Spark job cluster.
     */
    public SessionResourceTemplate getSessionResourceTemplate() {
        return this.SessionResourceTemplate;
    }

    /**
     * Set The session resource configuration template for a Spark job cluster.
     * @param SessionResourceTemplate The session resource configuration template for a Spark job cluster.
     */
    public void setSessionResourceTemplate(SessionResourceTemplate SessionResourceTemplate) {
        this.SessionResourceTemplate = SessionResourceTemplate;
    }

    public CreateDataEngineRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDataEngineRequest(CreateDataEngineRequest source) {
        if (source.EngineType != null) {
            this.EngineType = new String(source.EngineType);
        }
        if (source.DataEngineName != null) {
            this.DataEngineName = new String(source.DataEngineName);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
        if (source.AutoResume != null) {
            this.AutoResume = new Boolean(source.AutoResume);
        }
        if (source.MinClusters != null) {
            this.MinClusters = new Long(source.MinClusters);
        }
        if (source.MaxClusters != null) {
            this.MaxClusters = new Long(source.MaxClusters);
        }
        if (source.DefaultDataEngine != null) {
            this.DefaultDataEngine = new Boolean(source.DefaultDataEngine);
        }
        if (source.CidrBlock != null) {
            this.CidrBlock = new String(source.CidrBlock);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.AutoRenew != null) {
            this.AutoRenew = new Long(source.AutoRenew);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
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
        if (source.EngineExecType != null) {
            this.EngineExecType = new String(source.EngineExecType);
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
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.DataEngineConfigPairs != null) {
            this.DataEngineConfigPairs = new DataEngineConfigPair[source.DataEngineConfigPairs.length];
            for (int i = 0; i < source.DataEngineConfigPairs.length; i++) {
                this.DataEngineConfigPairs[i] = new DataEngineConfigPair(source.DataEngineConfigPairs[i]);
            }
        }
        if (source.ImageVersionName != null) {
            this.ImageVersionName = new String(source.ImageVersionName);
        }
        if (source.MainClusterName != null) {
            this.MainClusterName = new String(source.MainClusterName);
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
        this.setParamSimple(map, prefix + "EngineType", this.EngineType);
        this.setParamSimple(map, prefix + "DataEngineName", this.DataEngineName);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "AutoResume", this.AutoResume);
        this.setParamSimple(map, prefix + "MinClusters", this.MinClusters);
        this.setParamSimple(map, prefix + "MaxClusters", this.MaxClusters);
        this.setParamSimple(map, prefix + "DefaultDataEngine", this.DefaultDataEngine);
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "AutoRenew", this.AutoRenew);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "AutoSuspend", this.AutoSuspend);
        this.setParamSimple(map, prefix + "CrontabResumeSuspend", this.CrontabResumeSuspend);
        this.setParamObj(map, prefix + "CrontabResumeSuspendStrategy.", this.CrontabResumeSuspendStrategy);
        this.setParamSimple(map, prefix + "EngineExecType", this.EngineExecType);
        this.setParamSimple(map, prefix + "MaxConcurrency", this.MaxConcurrency);
        this.setParamSimple(map, prefix + "TolerableQueueTime", this.TolerableQueueTime);
        this.setParamSimple(map, prefix + "AutoSuspendTime", this.AutoSuspendTime);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamArrayObj(map, prefix + "DataEngineConfigPairs.", this.DataEngineConfigPairs);
        this.setParamSimple(map, prefix + "ImageVersionName", this.ImageVersionName);
        this.setParamSimple(map, prefix + "MainClusterName", this.MainClusterName);
        this.setParamSimple(map, prefix + "ElasticSwitch", this.ElasticSwitch);
        this.setParamSimple(map, prefix + "ElasticLimit", this.ElasticLimit);
        this.setParamObj(map, prefix + "SessionResourceTemplate.", this.SessionResourceTemplate);

    }
}


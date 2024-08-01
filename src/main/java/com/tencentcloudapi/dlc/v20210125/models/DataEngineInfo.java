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

public class DataEngineInfo extends AbstractModel {

    /**
    * DataEngine name
    */
    @SerializedName("DataEngineName")
    @Expose
    private String DataEngineName;

    /**
    * Engine type: spark/presto
    */
    @SerializedName("EngineType")
    @Expose
    private String EngineType;

    /**
    * Cluster resource type spark_private/presto_private/presto_cu/spark_cu
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * Quota ID
    */
    @SerializedName("QuotaId")
    @Expose
    private String QuotaId;

    /**
    * Data engine status -2 deleted, -1 failed, 0 initializing, 1 suspended, 2 running, 3 ready to delete, and 4 deleting
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Update time
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * Cluster specifications
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * Billing mode: 0 shared mode, 1 pay-as-you-go, and 2 monthly subscription
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * Minimum number of clusters
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("MinClusters")
    @Expose
    private Long MinClusters;

    /**
    * Maximum number of clusters
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("MaxClusters")
    @Expose
    private Long MaxClusters;

    /**
    * Whether to recover automatically
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("AutoResume")
    @Expose
    private Boolean AutoResume;

    /**
    * Automatic recovery time
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("SpendAfter")
    @Expose
    private Long SpendAfter;

    /**
    * Cluster IP range
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * Whether it is the default engine
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("DefaultDataEngine")
    @Expose
    private Boolean DefaultDataEngine;

    /**
    * Returned Message
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Engine ID
    */
    @SerializedName("DataEngineId")
    @Expose
    private String DataEngineId;

    /**
    * Operator
    */
    @SerializedName("SubAccountUin")
    @Expose
    private String SubAccountUin;

    /**
    * Expiration time
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Isolation time
    */
    @SerializedName("IsolatedTime")
    @Expose
    private String IsolatedTime;

    /**
    * Rectification time
    */
    @SerializedName("ReversalTime")
    @Expose
    private String ReversalTime;

    /**
    * Username
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("UserAlias")
    @Expose
    private String UserAlias;

    /**
    * Key-value pair collection
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("TagList")
    @Expose
    private TagInfo [] TagList;

    /**
    * Permissions owned by the engine
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("Permissions")
    @Expose
    private String [] Permissions;

    /**
    * Whether to automatically suspend the cluster: False (by default) means that the cluster is not automatically suspended; true means that the cluster is automatically suspended.
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("AutoSuspend")
    @Expose
    private Boolean AutoSuspend;

    /**
    * Scheduling policy of starting and ending the cluster: 0 (by default) indicates turning off the scheduling policy; 1 indicates turning on the scheduling policy. (Note: The scheduling policy of starting and ending the cluster and the automatic suspension policy are mutually exclusive.)
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("CrontabResumeSuspend")
    @Expose
    private Long CrontabResumeSuspend;

    /**
    * Scheduled start and end policy. Complex type: Include start and end time and the cluster suspension strategy.
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("CrontabResumeSuspendStrategy")
    @Expose
    private CrontabResumeSuspendStrategy CrontabResumeSuspendStrategy;

    /**
    * Type of the task executed by the engine. Valid value: SQL/BATCH
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("EngineExecType")
    @Expose
    private String EngineExecType;

    /**
    * Automatic renewal flag: 0 means the initial state and there is no automatic renewal by default. If the user has the privilege to retain services with advanced payment, there will be an automatic renewal. 1 means that there is an automatic renewal. 2 means that there is surely no automatic renewal.
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * Cluster automatic suspension time
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("AutoSuspendTime")
    @Expose
    private Long AutoSuspendTime;

    /**
    * Network connection configuration
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("NetworkConnectionSet")
    @Expose
    private NetworkConnection [] NetworkConnectionSet;

    /**
    * Jump address of ui
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("UiURL")
    @Expose
    private String UiURL;

    /**
    * Type of the engine resource
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * Cluster image version ID
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("ImageVersionId")
    @Expose
    private String ImageVersionId;

    /**
    * Minor cluster image version ID
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("ChildImageVersionId")
    @Expose
    private String ChildImageVersionId;

    /**
    * Cluster image version name
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("ImageVersionName")
    @Expose
    private String ImageVersionName;

    /**
    * Whether to enable the standby cluster
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("StartStandbyCluster")
    @Expose
    private Boolean StartStandbyCluster;

    /**
    * Whether the elastic scaling of the spark jar monthly subscription cluster is enabled
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("ElasticSwitch")
    @Expose
    private Boolean ElasticSwitch;

    /**
    * Upper limit of the spark jar's monthly subscribed cluster elasticity
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("ElasticLimit")
    @Expose
    private Long ElasticLimit;

    /**
    * Whether it is the default engine
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("DefaultHouse")
    @Expose
    private Boolean DefaultHouse;

    /**
    * Maximum concurrency number of a single cluster
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("MaxConcurrency")
    @Expose
    private Long MaxConcurrency;

    /**
    * Maximum time for the task to queue
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("TolerableQueueTime")
    @Expose
    private Long TolerableQueueTime;

    /**
    * User AppID
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("UserAppId")
    @Expose
    private Long UserAppId;

    /**
    * User uin
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("UserUin")
    @Expose
    private String UserUin;

    /**
    * SessionResourceTemplate
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("SessionResourceTemplate")
    @Expose
    private SessionResourceTemplate SessionResourceTemplate;

    /**
    * Automatic authorization switch
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("AutoAuthorization")
    @Expose
    private Boolean AutoAuthorization;

    /**
    * Engine version, supporting Native/SuperSQL
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("EngineGeneration")
    @Expose
    private String EngineGeneration;

    /**
    * Detailed engine type, supporting SparkSQL/SparkBatch/PrestoSQL/Kyuubi
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("EngineTypeDetail")
    @Expose
    private String EngineTypeDetail;

    /**
    * Engine network ID
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("EngineNetworkId")
    @Expose
    private String EngineNetworkId;

    /**
    * Number of resource groups associated with the standard engine
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("EngineResourceGroupCount")
    @Expose
    private Long EngineResourceGroupCount;

    /**
    * Current usage of the engine (Cu)
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("EngineResourceUsedCU")
    @Expose
    private Long EngineResourceUsedCU;

    /**
    * Access information of the engine
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("AccessInfos")
    @Expose
    private AccessInfo [] AccessInfos;

    /**
    * Name of the network where the engine is located
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("EngineNetworkName")
    @Expose
    private String EngineNetworkName;

    /**
     * Get DataEngine name 
     * @return DataEngineName DataEngine name
     */
    public String getDataEngineName() {
        return this.DataEngineName;
    }

    /**
     * Set DataEngine name
     * @param DataEngineName DataEngine name
     */
    public void setDataEngineName(String DataEngineName) {
        this.DataEngineName = DataEngineName;
    }

    /**
     * Get Engine type: spark/presto 
     * @return EngineType Engine type: spark/presto
     */
    public String getEngineType() {
        return this.EngineType;
    }

    /**
     * Set Engine type: spark/presto
     * @param EngineType Engine type: spark/presto
     */
    public void setEngineType(String EngineType) {
        this.EngineType = EngineType;
    }

    /**
     * Get Cluster resource type spark_private/presto_private/presto_cu/spark_cu 
     * @return ClusterType Cluster resource type spark_private/presto_private/presto_cu/spark_cu
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set Cluster resource type spark_private/presto_private/presto_cu/spark_cu
     * @param ClusterType Cluster resource type spark_private/presto_private/presto_cu/spark_cu
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get Quota ID 
     * @return QuotaId Quota ID
     */
    public String getQuotaId() {
        return this.QuotaId;
    }

    /**
     * Set Quota ID
     * @param QuotaId Quota ID
     */
    public void setQuotaId(String QuotaId) {
        this.QuotaId = QuotaId;
    }

    /**
     * Get Data engine status -2 deleted, -1 failed, 0 initializing, 1 suspended, 2 running, 3 ready to delete, and 4 deleting 
     * @return State Data engine status -2 deleted, -1 failed, 0 initializing, 1 suspended, 2 running, 3 ready to delete, and 4 deleting
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set Data engine status -2 deleted, -1 failed, 0 initializing, 1 suspended, 2 running, 3 ready to delete, and 4 deleting
     * @param State Data engine status -2 deleted, -1 failed, 0 initializing, 1 suspended, 2 running, 3 ready to delete, and 4 deleting
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Update time 
     * @return UpdateTime Update time
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time
     * @param UpdateTime Update time
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Cluster specifications
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return Size Cluster specifications
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set Cluster specifications
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param Size Cluster specifications
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get Billing mode: 0 shared mode, 1 pay-as-you-go, and 2 monthly subscription 
     * @return Mode Billing mode: 0 shared mode, 1 pay-as-you-go, and 2 monthly subscription
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set Billing mode: 0 shared mode, 1 pay-as-you-go, and 2 monthly subscription
     * @param Mode Billing mode: 0 shared mode, 1 pay-as-you-go, and 2 monthly subscription
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get Minimum number of clusters
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return MinClusters Minimum number of clusters
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public Long getMinClusters() {
        return this.MinClusters;
    }

    /**
     * Set Minimum number of clusters
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param MinClusters Minimum number of clusters
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setMinClusters(Long MinClusters) {
        this.MinClusters = MinClusters;
    }

    /**
     * Get Maximum number of clusters
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return MaxClusters Maximum number of clusters
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public Long getMaxClusters() {
        return this.MaxClusters;
    }

    /**
     * Set Maximum number of clusters
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param MaxClusters Maximum number of clusters
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setMaxClusters(Long MaxClusters) {
        this.MaxClusters = MaxClusters;
    }

    /**
     * Get Whether to recover automatically
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return AutoResume Whether to recover automatically
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public Boolean getAutoResume() {
        return this.AutoResume;
    }

    /**
     * Set Whether to recover automatically
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param AutoResume Whether to recover automatically
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setAutoResume(Boolean AutoResume) {
        this.AutoResume = AutoResume;
    }

    /**
     * Get Automatic recovery time
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return SpendAfter Automatic recovery time
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public Long getSpendAfter() {
        return this.SpendAfter;
    }

    /**
     * Set Automatic recovery time
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param SpendAfter Automatic recovery time
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setSpendAfter(Long SpendAfter) {
        this.SpendAfter = SpendAfter;
    }

    /**
     * Get Cluster IP range
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return CidrBlock Cluster IP range
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set Cluster IP range
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param CidrBlock Cluster IP range
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get Whether it is the default engine
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return DefaultDataEngine Whether it is the default engine
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public Boolean getDefaultDataEngine() {
        return this.DefaultDataEngine;
    }

    /**
     * Set Whether it is the default engine
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param DefaultDataEngine Whether it is the default engine
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setDefaultDataEngine(Boolean DefaultDataEngine) {
        this.DefaultDataEngine = DefaultDataEngine;
    }

    /**
     * Get Returned Message
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return Message Returned Message
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Returned Message
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param Message Returned Message
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Engine ID 
     * @return DataEngineId Engine ID
     */
    public String getDataEngineId() {
        return this.DataEngineId;
    }

    /**
     * Set Engine ID
     * @param DataEngineId Engine ID
     */
    public void setDataEngineId(String DataEngineId) {
        this.DataEngineId = DataEngineId;
    }

    /**
     * Get Operator 
     * @return SubAccountUin Operator
     */
    public String getSubAccountUin() {
        return this.SubAccountUin;
    }

    /**
     * Set Operator
     * @param SubAccountUin Operator
     */
    public void setSubAccountUin(String SubAccountUin) {
        this.SubAccountUin = SubAccountUin;
    }

    /**
     * Get Expiration time 
     * @return ExpireTime Expiration time
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Expiration time
     * @param ExpireTime Expiration time
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Isolation time 
     * @return IsolatedTime Isolation time
     */
    public String getIsolatedTime() {
        return this.IsolatedTime;
    }

    /**
     * Set Isolation time
     * @param IsolatedTime Isolation time
     */
    public void setIsolatedTime(String IsolatedTime) {
        this.IsolatedTime = IsolatedTime;
    }

    /**
     * Get Rectification time 
     * @return ReversalTime Rectification time
     */
    public String getReversalTime() {
        return this.ReversalTime;
    }

    /**
     * Set Rectification time
     * @param ReversalTime Rectification time
     */
    public void setReversalTime(String ReversalTime) {
        this.ReversalTime = ReversalTime;
    }

    /**
     * Get Username
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return UserAlias Username
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public String getUserAlias() {
        return this.UserAlias;
    }

    /**
     * Set Username
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param UserAlias Username
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setUserAlias(String UserAlias) {
        this.UserAlias = UserAlias;
    }

    /**
     * Get Key-value pair collection
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return TagList Key-value pair collection
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public TagInfo [] getTagList() {
        return this.TagList;
    }

    /**
     * Set Key-value pair collection
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param TagList Key-value pair collection
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setTagList(TagInfo [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get Permissions owned by the engine
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return Permissions Permissions owned by the engine
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public String [] getPermissions() {
        return this.Permissions;
    }

    /**
     * Set Permissions owned by the engine
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param Permissions Permissions owned by the engine
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setPermissions(String [] Permissions) {
        this.Permissions = Permissions;
    }

    /**
     * Get Whether to automatically suspend the cluster: False (by default) means that the cluster is not automatically suspended; true means that the cluster is automatically suspended.
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return AutoSuspend Whether to automatically suspend the cluster: False (by default) means that the cluster is not automatically suspended; true means that the cluster is automatically suspended.
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public Boolean getAutoSuspend() {
        return this.AutoSuspend;
    }

    /**
     * Set Whether to automatically suspend the cluster: False (by default) means that the cluster is not automatically suspended; true means that the cluster is automatically suspended.
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param AutoSuspend Whether to automatically suspend the cluster: False (by default) means that the cluster is not automatically suspended; true means that the cluster is automatically suspended.
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setAutoSuspend(Boolean AutoSuspend) {
        this.AutoSuspend = AutoSuspend;
    }

    /**
     * Get Scheduling policy of starting and ending the cluster: 0 (by default) indicates turning off the scheduling policy; 1 indicates turning on the scheduling policy. (Note: The scheduling policy of starting and ending the cluster and the automatic suspension policy are mutually exclusive.)
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return CrontabResumeSuspend Scheduling policy of starting and ending the cluster: 0 (by default) indicates turning off the scheduling policy; 1 indicates turning on the scheduling policy. (Note: The scheduling policy of starting and ending the cluster and the automatic suspension policy are mutually exclusive.)
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public Long getCrontabResumeSuspend() {
        return this.CrontabResumeSuspend;
    }

    /**
     * Set Scheduling policy of starting and ending the cluster: 0 (by default) indicates turning off the scheduling policy; 1 indicates turning on the scheduling policy. (Note: The scheduling policy of starting and ending the cluster and the automatic suspension policy are mutually exclusive.)
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param CrontabResumeSuspend Scheduling policy of starting and ending the cluster: 0 (by default) indicates turning off the scheduling policy; 1 indicates turning on the scheduling policy. (Note: The scheduling policy of starting and ending the cluster and the automatic suspension policy are mutually exclusive.)
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setCrontabResumeSuspend(Long CrontabResumeSuspend) {
        this.CrontabResumeSuspend = CrontabResumeSuspend;
    }

    /**
     * Get Scheduled start and end policy. Complex type: Include start and end time and the cluster suspension strategy.
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return CrontabResumeSuspendStrategy Scheduled start and end policy. Complex type: Include start and end time and the cluster suspension strategy.
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public CrontabResumeSuspendStrategy getCrontabResumeSuspendStrategy() {
        return this.CrontabResumeSuspendStrategy;
    }

    /**
     * Set Scheduled start and end policy. Complex type: Include start and end time and the cluster suspension strategy.
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param CrontabResumeSuspendStrategy Scheduled start and end policy. Complex type: Include start and end time and the cluster suspension strategy.
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setCrontabResumeSuspendStrategy(CrontabResumeSuspendStrategy CrontabResumeSuspendStrategy) {
        this.CrontabResumeSuspendStrategy = CrontabResumeSuspendStrategy;
    }

    /**
     * Get Type of the task executed by the engine. Valid value: SQL/BATCH
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return EngineExecType Type of the task executed by the engine. Valid value: SQL/BATCH
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public String getEngineExecType() {
        return this.EngineExecType;
    }

    /**
     * Set Type of the task executed by the engine. Valid value: SQL/BATCH
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param EngineExecType Type of the task executed by the engine. Valid value: SQL/BATCH
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setEngineExecType(String EngineExecType) {
        this.EngineExecType = EngineExecType;
    }

    /**
     * Get Automatic renewal flag: 0 means the initial state and there is no automatic renewal by default. If the user has the privilege to retain services with advanced payment, there will be an automatic renewal. 1 means that there is an automatic renewal. 2 means that there is surely no automatic renewal.
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return RenewFlag Automatic renewal flag: 0 means the initial state and there is no automatic renewal by default. If the user has the privilege to retain services with advanced payment, there will be an automatic renewal. 1 means that there is an automatic renewal. 2 means that there is surely no automatic renewal.
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set Automatic renewal flag: 0 means the initial state and there is no automatic renewal by default. If the user has the privilege to retain services with advanced payment, there will be an automatic renewal. 1 means that there is an automatic renewal. 2 means that there is surely no automatic renewal.
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param RenewFlag Automatic renewal flag: 0 means the initial state and there is no automatic renewal by default. If the user has the privilege to retain services with advanced payment, there will be an automatic renewal. 1 means that there is an automatic renewal. 2 means that there is surely no automatic renewal.
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get Cluster automatic suspension time
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return AutoSuspendTime Cluster automatic suspension time
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public Long getAutoSuspendTime() {
        return this.AutoSuspendTime;
    }

    /**
     * Set Cluster automatic suspension time
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param AutoSuspendTime Cluster automatic suspension time
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setAutoSuspendTime(Long AutoSuspendTime) {
        this.AutoSuspendTime = AutoSuspendTime;
    }

    /**
     * Get Network connection configuration
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return NetworkConnectionSet Network connection configuration
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public NetworkConnection [] getNetworkConnectionSet() {
        return this.NetworkConnectionSet;
    }

    /**
     * Set Network connection configuration
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param NetworkConnectionSet Network connection configuration
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setNetworkConnectionSet(NetworkConnection [] NetworkConnectionSet) {
        this.NetworkConnectionSet = NetworkConnectionSet;
    }

    /**
     * Get Jump address of ui
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return UiURL Jump address of ui
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public String getUiURL() {
        return this.UiURL;
    }

    /**
     * Set Jump address of ui
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param UiURL Jump address of ui
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setUiURL(String UiURL) {
        this.UiURL = UiURL;
    }

    /**
     * Get Type of the engine resource
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return ResourceType Type of the engine resource
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set Type of the engine resource
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param ResourceType Type of the engine resource
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get Cluster image version ID
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return ImageVersionId Cluster image version ID
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public String getImageVersionId() {
        return this.ImageVersionId;
    }

    /**
     * Set Cluster image version ID
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param ImageVersionId Cluster image version ID
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setImageVersionId(String ImageVersionId) {
        this.ImageVersionId = ImageVersionId;
    }

    /**
     * Get Minor cluster image version ID
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return ChildImageVersionId Minor cluster image version ID
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public String getChildImageVersionId() {
        return this.ChildImageVersionId;
    }

    /**
     * Set Minor cluster image version ID
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param ChildImageVersionId Minor cluster image version ID
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setChildImageVersionId(String ChildImageVersionId) {
        this.ChildImageVersionId = ChildImageVersionId;
    }

    /**
     * Get Cluster image version name
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return ImageVersionName Cluster image version name
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public String getImageVersionName() {
        return this.ImageVersionName;
    }

    /**
     * Set Cluster image version name
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param ImageVersionName Cluster image version name
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setImageVersionName(String ImageVersionName) {
        this.ImageVersionName = ImageVersionName;
    }

    /**
     * Get Whether to enable the standby cluster
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return StartStandbyCluster Whether to enable the standby cluster
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public Boolean getStartStandbyCluster() {
        return this.StartStandbyCluster;
    }

    /**
     * Set Whether to enable the standby cluster
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param StartStandbyCluster Whether to enable the standby cluster
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setStartStandbyCluster(Boolean StartStandbyCluster) {
        this.StartStandbyCluster = StartStandbyCluster;
    }

    /**
     * Get Whether the elastic scaling of the spark jar monthly subscription cluster is enabled
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return ElasticSwitch Whether the elastic scaling of the spark jar monthly subscription cluster is enabled
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public Boolean getElasticSwitch() {
        return this.ElasticSwitch;
    }

    /**
     * Set Whether the elastic scaling of the spark jar monthly subscription cluster is enabled
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param ElasticSwitch Whether the elastic scaling of the spark jar monthly subscription cluster is enabled
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setElasticSwitch(Boolean ElasticSwitch) {
        this.ElasticSwitch = ElasticSwitch;
    }

    /**
     * Get Upper limit of the spark jar's monthly subscribed cluster elasticity
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return ElasticLimit Upper limit of the spark jar's monthly subscribed cluster elasticity
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public Long getElasticLimit() {
        return this.ElasticLimit;
    }

    /**
     * Set Upper limit of the spark jar's monthly subscribed cluster elasticity
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param ElasticLimit Upper limit of the spark jar's monthly subscribed cluster elasticity
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setElasticLimit(Long ElasticLimit) {
        this.ElasticLimit = ElasticLimit;
    }

    /**
     * Get Whether it is the default engine
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return DefaultHouse Whether it is the default engine
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public Boolean getDefaultHouse() {
        return this.DefaultHouse;
    }

    /**
     * Set Whether it is the default engine
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param DefaultHouse Whether it is the default engine
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setDefaultHouse(Boolean DefaultHouse) {
        this.DefaultHouse = DefaultHouse;
    }

    /**
     * Get Maximum concurrency number of a single cluster
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return MaxConcurrency Maximum concurrency number of a single cluster
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public Long getMaxConcurrency() {
        return this.MaxConcurrency;
    }

    /**
     * Set Maximum concurrency number of a single cluster
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param MaxConcurrency Maximum concurrency number of a single cluster
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setMaxConcurrency(Long MaxConcurrency) {
        this.MaxConcurrency = MaxConcurrency;
    }

    /**
     * Get Maximum time for the task to queue
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return TolerableQueueTime Maximum time for the task to queue
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public Long getTolerableQueueTime() {
        return this.TolerableQueueTime;
    }

    /**
     * Set Maximum time for the task to queue
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param TolerableQueueTime Maximum time for the task to queue
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setTolerableQueueTime(Long TolerableQueueTime) {
        this.TolerableQueueTime = TolerableQueueTime;
    }

    /**
     * Get User AppID
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return UserAppId User AppID
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public Long getUserAppId() {
        return this.UserAppId;
    }

    /**
     * Set User AppID
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param UserAppId User AppID
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setUserAppId(Long UserAppId) {
        this.UserAppId = UserAppId;
    }

    /**
     * Get User uin
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return UserUin User uin
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public String getUserUin() {
        return this.UserUin;
    }

    /**
     * Set User uin
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param UserUin User uin
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setUserUin(String UserUin) {
        this.UserUin = UserUin;
    }

    /**
     * Get SessionResourceTemplate
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return SessionResourceTemplate SessionResourceTemplate
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public SessionResourceTemplate getSessionResourceTemplate() {
        return this.SessionResourceTemplate;
    }

    /**
     * Set SessionResourceTemplate
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param SessionResourceTemplate SessionResourceTemplate
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setSessionResourceTemplate(SessionResourceTemplate SessionResourceTemplate) {
        this.SessionResourceTemplate = SessionResourceTemplate;
    }

    /**
     * Get Automatic authorization switch
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return AutoAuthorization Automatic authorization switch
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public Boolean getAutoAuthorization() {
        return this.AutoAuthorization;
    }

    /**
     * Set Automatic authorization switch
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param AutoAuthorization Automatic authorization switch
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setAutoAuthorization(Boolean AutoAuthorization) {
        this.AutoAuthorization = AutoAuthorization;
    }

    /**
     * Get Engine version, supporting Native/SuperSQL
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return EngineGeneration Engine version, supporting Native/SuperSQL
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public String getEngineGeneration() {
        return this.EngineGeneration;
    }

    /**
     * Set Engine version, supporting Native/SuperSQL
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param EngineGeneration Engine version, supporting Native/SuperSQL
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setEngineGeneration(String EngineGeneration) {
        this.EngineGeneration = EngineGeneration;
    }

    /**
     * Get Detailed engine type, supporting SparkSQL/SparkBatch/PrestoSQL/Kyuubi
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return EngineTypeDetail Detailed engine type, supporting SparkSQL/SparkBatch/PrestoSQL/Kyuubi
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public String getEngineTypeDetail() {
        return this.EngineTypeDetail;
    }

    /**
     * Set Detailed engine type, supporting SparkSQL/SparkBatch/PrestoSQL/Kyuubi
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param EngineTypeDetail Detailed engine type, supporting SparkSQL/SparkBatch/PrestoSQL/Kyuubi
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setEngineTypeDetail(String EngineTypeDetail) {
        this.EngineTypeDetail = EngineTypeDetail;
    }

    /**
     * Get Engine network ID
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return EngineNetworkId Engine network ID
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public String getEngineNetworkId() {
        return this.EngineNetworkId;
    }

    /**
     * Set Engine network ID
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param EngineNetworkId Engine network ID
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setEngineNetworkId(String EngineNetworkId) {
        this.EngineNetworkId = EngineNetworkId;
    }

    /**
     * Get Number of resource groups associated with the standard engine
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return EngineResourceGroupCount Number of resource groups associated with the standard engine
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public Long getEngineResourceGroupCount() {
        return this.EngineResourceGroupCount;
    }

    /**
     * Set Number of resource groups associated with the standard engine
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param EngineResourceGroupCount Number of resource groups associated with the standard engine
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setEngineResourceGroupCount(Long EngineResourceGroupCount) {
        this.EngineResourceGroupCount = EngineResourceGroupCount;
    }

    /**
     * Get Current usage of the engine (Cu)
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return EngineResourceUsedCU Current usage of the engine (Cu)
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public Long getEngineResourceUsedCU() {
        return this.EngineResourceUsedCU;
    }

    /**
     * Set Current usage of the engine (Cu)
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param EngineResourceUsedCU Current usage of the engine (Cu)
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setEngineResourceUsedCU(Long EngineResourceUsedCU) {
        this.EngineResourceUsedCU = EngineResourceUsedCU;
    }

    /**
     * Get Access information of the engine
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return AccessInfos Access information of the engine
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public AccessInfo [] getAccessInfos() {
        return this.AccessInfos;
    }

    /**
     * Set Access information of the engine
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param AccessInfos Access information of the engine
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setAccessInfos(AccessInfo [] AccessInfos) {
        this.AccessInfos = AccessInfos;
    }

    /**
     * Get Name of the network where the engine is located
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return EngineNetworkName Name of the network where the engine is located
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public String getEngineNetworkName() {
        return this.EngineNetworkName;
    }

    /**
     * Set Name of the network where the engine is located
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param EngineNetworkName Name of the network where the engine is located
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setEngineNetworkName(String EngineNetworkName) {
        this.EngineNetworkName = EngineNetworkName;
    }

    public DataEngineInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataEngineInfo(DataEngineInfo source) {
        if (source.DataEngineName != null) {
            this.DataEngineName = new String(source.DataEngineName);
        }
        if (source.EngineType != null) {
            this.EngineType = new String(source.EngineType);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.QuotaId != null) {
            this.QuotaId = new String(source.QuotaId);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
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
        if (source.SpendAfter != null) {
            this.SpendAfter = new Long(source.SpendAfter);
        }
        if (source.CidrBlock != null) {
            this.CidrBlock = new String(source.CidrBlock);
        }
        if (source.DefaultDataEngine != null) {
            this.DefaultDataEngine = new Boolean(source.DefaultDataEngine);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.DataEngineId != null) {
            this.DataEngineId = new String(source.DataEngineId);
        }
        if (source.SubAccountUin != null) {
            this.SubAccountUin = new String(source.SubAccountUin);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.IsolatedTime != null) {
            this.IsolatedTime = new String(source.IsolatedTime);
        }
        if (source.ReversalTime != null) {
            this.ReversalTime = new String(source.ReversalTime);
        }
        if (source.UserAlias != null) {
            this.UserAlias = new String(source.UserAlias);
        }
        if (source.TagList != null) {
            this.TagList = new TagInfo[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new TagInfo(source.TagList[i]);
            }
        }
        if (source.Permissions != null) {
            this.Permissions = new String[source.Permissions.length];
            for (int i = 0; i < source.Permissions.length; i++) {
                this.Permissions[i] = new String(source.Permissions[i]);
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
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.AutoSuspendTime != null) {
            this.AutoSuspendTime = new Long(source.AutoSuspendTime);
        }
        if (source.NetworkConnectionSet != null) {
            this.NetworkConnectionSet = new NetworkConnection[source.NetworkConnectionSet.length];
            for (int i = 0; i < source.NetworkConnectionSet.length; i++) {
                this.NetworkConnectionSet[i] = new NetworkConnection(source.NetworkConnectionSet[i]);
            }
        }
        if (source.UiURL != null) {
            this.UiURL = new String(source.UiURL);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ImageVersionId != null) {
            this.ImageVersionId = new String(source.ImageVersionId);
        }
        if (source.ChildImageVersionId != null) {
            this.ChildImageVersionId = new String(source.ChildImageVersionId);
        }
        if (source.ImageVersionName != null) {
            this.ImageVersionName = new String(source.ImageVersionName);
        }
        if (source.StartStandbyCluster != null) {
            this.StartStandbyCluster = new Boolean(source.StartStandbyCluster);
        }
        if (source.ElasticSwitch != null) {
            this.ElasticSwitch = new Boolean(source.ElasticSwitch);
        }
        if (source.ElasticLimit != null) {
            this.ElasticLimit = new Long(source.ElasticLimit);
        }
        if (source.DefaultHouse != null) {
            this.DefaultHouse = new Boolean(source.DefaultHouse);
        }
        if (source.MaxConcurrency != null) {
            this.MaxConcurrency = new Long(source.MaxConcurrency);
        }
        if (source.TolerableQueueTime != null) {
            this.TolerableQueueTime = new Long(source.TolerableQueueTime);
        }
        if (source.UserAppId != null) {
            this.UserAppId = new Long(source.UserAppId);
        }
        if (source.UserUin != null) {
            this.UserUin = new String(source.UserUin);
        }
        if (source.SessionResourceTemplate != null) {
            this.SessionResourceTemplate = new SessionResourceTemplate(source.SessionResourceTemplate);
        }
        if (source.AutoAuthorization != null) {
            this.AutoAuthorization = new Boolean(source.AutoAuthorization);
        }
        if (source.EngineGeneration != null) {
            this.EngineGeneration = new String(source.EngineGeneration);
        }
        if (source.EngineTypeDetail != null) {
            this.EngineTypeDetail = new String(source.EngineTypeDetail);
        }
        if (source.EngineNetworkId != null) {
            this.EngineNetworkId = new String(source.EngineNetworkId);
        }
        if (source.EngineResourceGroupCount != null) {
            this.EngineResourceGroupCount = new Long(source.EngineResourceGroupCount);
        }
        if (source.EngineResourceUsedCU != null) {
            this.EngineResourceUsedCU = new Long(source.EngineResourceUsedCU);
        }
        if (source.AccessInfos != null) {
            this.AccessInfos = new AccessInfo[source.AccessInfos.length];
            for (int i = 0; i < source.AccessInfos.length; i++) {
                this.AccessInfos[i] = new AccessInfo(source.AccessInfos[i]);
            }
        }
        if (source.EngineNetworkName != null) {
            this.EngineNetworkName = new String(source.EngineNetworkName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataEngineName", this.DataEngineName);
        this.setParamSimple(map, prefix + "EngineType", this.EngineType);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "QuotaId", this.QuotaId);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "MinClusters", this.MinClusters);
        this.setParamSimple(map, prefix + "MaxClusters", this.MaxClusters);
        this.setParamSimple(map, prefix + "AutoResume", this.AutoResume);
        this.setParamSimple(map, prefix + "SpendAfter", this.SpendAfter);
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);
        this.setParamSimple(map, prefix + "DefaultDataEngine", this.DefaultDataEngine);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "DataEngineId", this.DataEngineId);
        this.setParamSimple(map, prefix + "SubAccountUin", this.SubAccountUin);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "IsolatedTime", this.IsolatedTime);
        this.setParamSimple(map, prefix + "ReversalTime", this.ReversalTime);
        this.setParamSimple(map, prefix + "UserAlias", this.UserAlias);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);
        this.setParamArraySimple(map, prefix + "Permissions.", this.Permissions);
        this.setParamSimple(map, prefix + "AutoSuspend", this.AutoSuspend);
        this.setParamSimple(map, prefix + "CrontabResumeSuspend", this.CrontabResumeSuspend);
        this.setParamObj(map, prefix + "CrontabResumeSuspendStrategy.", this.CrontabResumeSuspendStrategy);
        this.setParamSimple(map, prefix + "EngineExecType", this.EngineExecType);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "AutoSuspendTime", this.AutoSuspendTime);
        this.setParamArrayObj(map, prefix + "NetworkConnectionSet.", this.NetworkConnectionSet);
        this.setParamSimple(map, prefix + "UiURL", this.UiURL);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ImageVersionId", this.ImageVersionId);
        this.setParamSimple(map, prefix + "ChildImageVersionId", this.ChildImageVersionId);
        this.setParamSimple(map, prefix + "ImageVersionName", this.ImageVersionName);
        this.setParamSimple(map, prefix + "StartStandbyCluster", this.StartStandbyCluster);
        this.setParamSimple(map, prefix + "ElasticSwitch", this.ElasticSwitch);
        this.setParamSimple(map, prefix + "ElasticLimit", this.ElasticLimit);
        this.setParamSimple(map, prefix + "DefaultHouse", this.DefaultHouse);
        this.setParamSimple(map, prefix + "MaxConcurrency", this.MaxConcurrency);
        this.setParamSimple(map, prefix + "TolerableQueueTime", this.TolerableQueueTime);
        this.setParamSimple(map, prefix + "UserAppId", this.UserAppId);
        this.setParamSimple(map, prefix + "UserUin", this.UserUin);
        this.setParamObj(map, prefix + "SessionResourceTemplate.", this.SessionResourceTemplate);
        this.setParamSimple(map, prefix + "AutoAuthorization", this.AutoAuthorization);
        this.setParamSimple(map, prefix + "EngineGeneration", this.EngineGeneration);
        this.setParamSimple(map, prefix + "EngineTypeDetail", this.EngineTypeDetail);
        this.setParamSimple(map, prefix + "EngineNetworkId", this.EngineNetworkId);
        this.setParamSimple(map, prefix + "EngineResourceGroupCount", this.EngineResourceGroupCount);
        this.setParamSimple(map, prefix + "EngineResourceUsedCU", this.EngineResourceUsedCU);
        this.setParamArrayObj(map, prefix + "AccessInfos.", this.AccessInfos);
        this.setParamSimple(map, prefix + "EngineNetworkName", this.EngineNetworkName);

    }
}


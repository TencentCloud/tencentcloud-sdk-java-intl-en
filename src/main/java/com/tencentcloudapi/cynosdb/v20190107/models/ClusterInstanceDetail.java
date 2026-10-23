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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterInstanceDetail extends AbstractModel {

    /**
    * <p>User Uin.</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>User AppId</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>Cluster ID.</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>Cluster name.</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>Instance ID.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Instance name.</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>Engine type</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>Instance status</p><p>Enumeration values:</p><ul><li>creating: Creating</li><li>running: Running</li><li>isolating: Isolating</li><li>isolated: Isolated</li><li>activating: Recovering</li><li>offlining: Offlining</li><li>offlined: Offline</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Instance status</p>
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * <p>Status description in Chinese of the instance</p>
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * <p>Instance status description</p>
    */
    @SerializedName("InstanceStatusDesc")
    @Expose
    private String InstanceStatusDesc;

    /**
    * <p>Cpu</p><p>Unit: core</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>cpu cores</p>
    */
    @SerializedName("InstanceCpu")
    @Expose
    private Long InstanceCpu;

    /**
    * <p>Lower limit of cpu for serverless instance</p><p>Unit: core</p>
    */
    @SerializedName("MinCpu")
    @Expose
    private Float MinCpu;

    /**
    * <p>cpu upper limit of the serverless instance</p><p>Unit: core</p>
    */
    @SerializedName("MaxCpu")
    @Expose
    private Float MaxCpu;

    /**
    * <p>Memory</p><p>Unit: GB</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>Memory</p>
    */
    @SerializedName("InstanceMemory")
    @Expose
    private Long InstanceMemory;

    /**
    * <p>Hard disk.</p>
    */
    @SerializedName("InstanceStorage")
    @Expose
    private Long InstanceStorage;

    /**
    * <p>Instance role</p>
    */
    @SerializedName("InstanceRole")
    @Expose
    private String InstanceRole;

    /**
    * <p>Execution start time (seconds from 00:00:00)</p>
    */
    @SerializedName("MaintainStartTime")
    @Expose
    private Long MaintainStartTime;

    /**
    * <p>Continuous time (unit: second)</p>
    */
    @SerializedName("MaintainDuration")
    @Expose
    private Long MaintainDuration;

    /**
    * <p>The time when it can be executed. Enumeration values: ["Mon","Tue","Wed","Thu","Fri", "Sat", "Sun"]</p>
    */
    @SerializedName("MaintainWeekDays")
    @Expose
    private String [] MaintainWeekDays;

    /**
    * <p>Instance task information</p>
    */
    @SerializedName("InstanceTasks")
    @Expose
    private ObjectTask [] InstanceTasks;

    /**
    * <p>Instance Machine Type</p><p>Enumeration values:</p><ul><li>common: universal type</li><li>exclusive: dedicated</li></ul>
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * <p>Instance Machine Type</p><ol><li>common, universal type.</li><li>exclusive, dedicated.</li></ol>
    */
    @SerializedName("InstanceDeviceType")
    @Expose
    private String InstanceDeviceType;

    /**
    * <p>Instance storage type<br>Description: This parameter returns a value only when the resource to query is LibraDB.</p>
    */
    @SerializedName("InstanceStorageType")
    @Expose
    private String InstanceStorageType;

    /**
    * <p>Database type</p>
    */
    @SerializedName("DbMode")
    @Expose
    private String DbMode;

    /**
    * <p>Node list<br>Description: This parameter returns a value only when the resource to query is LibraDB.</p>
    */
    @SerializedName("NodeList")
    @Expose
    private String [] NodeList;

    /**
    * <p>serverless instance sub-status</p>
    */
    @SerializedName("ServerlessStatus")
    @Expose
    private String ServerlessStatus;

    /**
    * <p>AI optimizer status</p>
    */
    @SerializedName("AIOptimizerStatus")
    @Expose
    private AIOptimizerStatus AIOptimizerStatus;

    /**
    * <p>Project ID.</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>Region.</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>AZ.</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>Physical AZ of the instance location</p>
    */
    @SerializedName("PhysicalZone")
    @Expose
    private String PhysicalZone;

    /**
    * <p>Database type</p>
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * <p>Database version.</p>
    */
    @SerializedName("DbVersion")
    @Expose
    private String DbVersion;

    /**
    * <p>Stored amount</p><p>Unit: GB</p>
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * <p>Prepaid storage Id.</p>
    */
    @SerializedName("StorageId")
    @Expose
    private String StorageId;

    /**
    * <p>Storage billing type.</p><p>Valid values:</p><ul><li>0: postpaid</li><li>1: prepaid</li></ul>
    */
    @SerializedName("StoragePayMode")
    @Expose
    private Long StoragePayMode;

    /**
    * <p>Creation time.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Update time.</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>Isolation time</p>
    */
    @SerializedName("IsolateTime")
    @Expose
    private String IsolateTime;

    /**
    * <p>Instance destruction time</p>
    */
    @SerializedName("DestroyTime")
    @Expose
    private String DestroyTime;

    /**
    * <p>Termination phase</p>
    */
    @SerializedName("DestroyDeadlineText")
    @Expose
    private String DestroyDeadlineText;

    /**
    * <p>Instance expiration time</p>
    */
    @SerializedName("PeriodEndTime")
    @Expose
    private String PeriodEndTime;

    /**
    * <p>VPC network ID</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>Subnet ID.</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>Instance private IP address</p>
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * <p>Instance Intranet Port</p>
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * <p>Network type</p>
    */
    @SerializedName("NetType")
    @Expose
    private Long NetType;

    /**
    * <p>Public network IP</p>
    */
    @SerializedName("WanIP")
    @Expose
    private String WanIP;

    /**
    * <p>External port</p>
    */
    @SerializedName("WanPort")
    @Expose
    private Long WanPort;

    /**
    * <p>Public network enabled status</p>
    */
    @SerializedName("WanStatus")
    @Expose
    private String WanStatus;

    /**
    * <p>Instance public domain name.</p>
    */
    @SerializedName("WanDomain")
    @Expose
    private String WanDomain;

    /**
    * <p>Network information of the instance</p>
    */
    @SerializedName("InstanceNetInfo")
    @Expose
    private InstanceNetInfo [] InstanceNetInfo;

    /**
    * <p>Payment mode.</p><p>Valid values:</p><ul><li>0: postpaid</li><li>1: prepaid</li></ul>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * <p>Currently processing task</p>
    */
    @SerializedName("ProcessingTask")
    @Expose
    private String ProcessingTask;

    /**
    * <p>Renewal flag.</p>
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * <p>Task</p>
    */
    @SerializedName("Tasks")
    @Expose
    private ObjectTask [] Tasks;

    /**
    * <p>Whether to freeze</p>
    */
    @SerializedName("IsFreeze")
    @Expose
    private String IsFreeze;

    /**
    * <p>Resource label.</p>
    */
    @SerializedName("ResourceTags")
    @Expose
    private Tag [] ResourceTags;

    /**
    * <p>Supported capabilities of the current instance</p>
    */
    @SerializedName("InstanceAbility")
    @Expose
    private InstanceAbility InstanceAbility;

    /**
    * <p>Global database unique ID</p>
    */
    @SerializedName("GdnId")
    @Expose
    private String GdnId;

    /**
     * Get <p>User Uin.</p> 
     * @return Uin <p>User Uin.</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>User Uin.</p>
     * @param Uin <p>User Uin.</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>User AppId</p> 
     * @return AppId <p>User AppId</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>User AppId</p>
     * @param AppId <p>User AppId</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>Cluster ID.</p> 
     * @return ClusterId <p>Cluster ID.</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>Cluster ID.</p>
     * @param ClusterId <p>Cluster ID.</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>Cluster name.</p> 
     * @return ClusterName <p>Cluster name.</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>Cluster name.</p>
     * @param ClusterName <p>Cluster name.</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get <p>Instance ID.</p> 
     * @return InstanceId <p>Instance ID.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID.</p>
     * @param InstanceId <p>Instance ID.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Instance name.</p> 
     * @return InstanceName <p>Instance name.</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>Instance name.</p>
     * @param InstanceName <p>Instance name.</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>Engine type</p> 
     * @return InstanceType <p>Engine type</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>Engine type</p>
     * @param InstanceType <p>Engine type</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>Instance status</p><p>Enumeration values:</p><ul><li>creating: Creating</li><li>running: Running</li><li>isolating: Isolating</li><li>isolated: Isolated</li><li>activating: Recovering</li><li>offlining: Offlining</li><li>offlined: Offline</li></ul> 
     * @return Status <p>Instance status</p><p>Enumeration values:</p><ul><li>creating: Creating</li><li>running: Running</li><li>isolating: Isolating</li><li>isolated: Isolated</li><li>activating: Recovering</li><li>offlining: Offlining</li><li>offlined: Offline</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Instance status</p><p>Enumeration values:</p><ul><li>creating: Creating</li><li>running: Running</li><li>isolating: Isolating</li><li>isolated: Isolated</li><li>activating: Recovering</li><li>offlining: Offlining</li><li>offlined: Offline</li></ul>
     * @param Status <p>Instance status</p><p>Enumeration values:</p><ul><li>creating: Creating</li><li>running: Running</li><li>isolating: Isolating</li><li>isolated: Isolated</li><li>activating: Recovering</li><li>offlining: Offlining</li><li>offlined: Offline</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Instance status</p> 
     * @return InstanceStatus <p>Instance status</p>
     * @deprecated
     */
    @Deprecated
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set <p>Instance status</p>
     * @param InstanceStatus <p>Instance status</p>
     * @deprecated
     */
    @Deprecated
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get <p>Status description in Chinese of the instance</p> 
     * @return StatusDesc <p>Status description in Chinese of the instance</p>
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set <p>Status description in Chinese of the instance</p>
     * @param StatusDesc <p>Status description in Chinese of the instance</p>
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get <p>Instance status description</p> 
     * @return InstanceStatusDesc <p>Instance status description</p>
     * @deprecated
     */
    @Deprecated
    public String getInstanceStatusDesc() {
        return this.InstanceStatusDesc;
    }

    /**
     * Set <p>Instance status description</p>
     * @param InstanceStatusDesc <p>Instance status description</p>
     * @deprecated
     */
    @Deprecated
    public void setInstanceStatusDesc(String InstanceStatusDesc) {
        this.InstanceStatusDesc = InstanceStatusDesc;
    }

    /**
     * Get <p>Cpu</p><p>Unit: core</p> 
     * @return Cpu <p>Cpu</p><p>Unit: core</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>Cpu</p><p>Unit: core</p>
     * @param Cpu <p>Cpu</p><p>Unit: core</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>cpu cores</p> 
     * @return InstanceCpu <p>cpu cores</p>
     * @deprecated
     */
    @Deprecated
    public Long getInstanceCpu() {
        return this.InstanceCpu;
    }

    /**
     * Set <p>cpu cores</p>
     * @param InstanceCpu <p>cpu cores</p>
     * @deprecated
     */
    @Deprecated
    public void setInstanceCpu(Long InstanceCpu) {
        this.InstanceCpu = InstanceCpu;
    }

    /**
     * Get <p>Lower limit of cpu for serverless instance</p><p>Unit: core</p> 
     * @return MinCpu <p>Lower limit of cpu for serverless instance</p><p>Unit: core</p>
     */
    public Float getMinCpu() {
        return this.MinCpu;
    }

    /**
     * Set <p>Lower limit of cpu for serverless instance</p><p>Unit: core</p>
     * @param MinCpu <p>Lower limit of cpu for serverless instance</p><p>Unit: core</p>
     */
    public void setMinCpu(Float MinCpu) {
        this.MinCpu = MinCpu;
    }

    /**
     * Get <p>cpu upper limit of the serverless instance</p><p>Unit: core</p> 
     * @return MaxCpu <p>cpu upper limit of the serverless instance</p><p>Unit: core</p>
     */
    public Float getMaxCpu() {
        return this.MaxCpu;
    }

    /**
     * Set <p>cpu upper limit of the serverless instance</p><p>Unit: core</p>
     * @param MaxCpu <p>cpu upper limit of the serverless instance</p><p>Unit: core</p>
     */
    public void setMaxCpu(Float MaxCpu) {
        this.MaxCpu = MaxCpu;
    }

    /**
     * Get <p>Memory</p><p>Unit: GB</p> 
     * @return Memory <p>Memory</p><p>Unit: GB</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>Memory</p><p>Unit: GB</p>
     * @param Memory <p>Memory</p><p>Unit: GB</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>Memory</p> 
     * @return InstanceMemory <p>Memory</p>
     * @deprecated
     */
    @Deprecated
    public Long getInstanceMemory() {
        return this.InstanceMemory;
    }

    /**
     * Set <p>Memory</p>
     * @param InstanceMemory <p>Memory</p>
     * @deprecated
     */
    @Deprecated
    public void setInstanceMemory(Long InstanceMemory) {
        this.InstanceMemory = InstanceMemory;
    }

    /**
     * Get <p>Hard disk.</p> 
     * @return InstanceStorage <p>Hard disk.</p>
     */
    public Long getInstanceStorage() {
        return this.InstanceStorage;
    }

    /**
     * Set <p>Hard disk.</p>
     * @param InstanceStorage <p>Hard disk.</p>
     */
    public void setInstanceStorage(Long InstanceStorage) {
        this.InstanceStorage = InstanceStorage;
    }

    /**
     * Get <p>Instance role</p> 
     * @return InstanceRole <p>Instance role</p>
     */
    public String getInstanceRole() {
        return this.InstanceRole;
    }

    /**
     * Set <p>Instance role</p>
     * @param InstanceRole <p>Instance role</p>
     */
    public void setInstanceRole(String InstanceRole) {
        this.InstanceRole = InstanceRole;
    }

    /**
     * Get <p>Execution start time (seconds from 00:00:00)</p> 
     * @return MaintainStartTime <p>Execution start time (seconds from 00:00:00)</p>
     */
    public Long getMaintainStartTime() {
        return this.MaintainStartTime;
    }

    /**
     * Set <p>Execution start time (seconds from 00:00:00)</p>
     * @param MaintainStartTime <p>Execution start time (seconds from 00:00:00)</p>
     */
    public void setMaintainStartTime(Long MaintainStartTime) {
        this.MaintainStartTime = MaintainStartTime;
    }

    /**
     * Get <p>Continuous time (unit: second)</p> 
     * @return MaintainDuration <p>Continuous time (unit: second)</p>
     */
    public Long getMaintainDuration() {
        return this.MaintainDuration;
    }

    /**
     * Set <p>Continuous time (unit: second)</p>
     * @param MaintainDuration <p>Continuous time (unit: second)</p>
     */
    public void setMaintainDuration(Long MaintainDuration) {
        this.MaintainDuration = MaintainDuration;
    }

    /**
     * Get <p>The time when it can be executed. Enumeration values: ["Mon","Tue","Wed","Thu","Fri", "Sat", "Sun"]</p> 
     * @return MaintainWeekDays <p>The time when it can be executed. Enumeration values: ["Mon","Tue","Wed","Thu","Fri", "Sat", "Sun"]</p>
     */
    public String [] getMaintainWeekDays() {
        return this.MaintainWeekDays;
    }

    /**
     * Set <p>The time when it can be executed. Enumeration values: ["Mon","Tue","Wed","Thu","Fri", "Sat", "Sun"]</p>
     * @param MaintainWeekDays <p>The time when it can be executed. Enumeration values: ["Mon","Tue","Wed","Thu","Fri", "Sat", "Sun"]</p>
     */
    public void setMaintainWeekDays(String [] MaintainWeekDays) {
        this.MaintainWeekDays = MaintainWeekDays;
    }

    /**
     * Get <p>Instance task information</p> 
     * @return InstanceTasks <p>Instance task information</p>
     */
    public ObjectTask [] getInstanceTasks() {
        return this.InstanceTasks;
    }

    /**
     * Set <p>Instance task information</p>
     * @param InstanceTasks <p>Instance task information</p>
     */
    public void setInstanceTasks(ObjectTask [] InstanceTasks) {
        this.InstanceTasks = InstanceTasks;
    }

    /**
     * Get <p>Instance Machine Type</p><p>Enumeration values:</p><ul><li>common: universal type</li><li>exclusive: dedicated</li></ul> 
     * @return DeviceType <p>Instance Machine Type</p><p>Enumeration values:</p><ul><li>common: universal type</li><li>exclusive: dedicated</li></ul>
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set <p>Instance Machine Type</p><p>Enumeration values:</p><ul><li>common: universal type</li><li>exclusive: dedicated</li></ul>
     * @param DeviceType <p>Instance Machine Type</p><p>Enumeration values:</p><ul><li>common: universal type</li><li>exclusive: dedicated</li></ul>
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get <p>Instance Machine Type</p><ol><li>common, universal type.</li><li>exclusive, dedicated.</li></ol> 
     * @return InstanceDeviceType <p>Instance Machine Type</p><ol><li>common, universal type.</li><li>exclusive, dedicated.</li></ol>
     * @deprecated
     */
    @Deprecated
    public String getInstanceDeviceType() {
        return this.InstanceDeviceType;
    }

    /**
     * Set <p>Instance Machine Type</p><ol><li>common, universal type.</li><li>exclusive, dedicated.</li></ol>
     * @param InstanceDeviceType <p>Instance Machine Type</p><ol><li>common, universal type.</li><li>exclusive, dedicated.</li></ol>
     * @deprecated
     */
    @Deprecated
    public void setInstanceDeviceType(String InstanceDeviceType) {
        this.InstanceDeviceType = InstanceDeviceType;
    }

    /**
     * Get <p>Instance storage type<br>Description: This parameter returns a value only when the resource to query is LibraDB.</p> 
     * @return InstanceStorageType <p>Instance storage type<br>Description: This parameter returns a value only when the resource to query is LibraDB.</p>
     */
    public String getInstanceStorageType() {
        return this.InstanceStorageType;
    }

    /**
     * Set <p>Instance storage type<br>Description: This parameter returns a value only when the resource to query is LibraDB.</p>
     * @param InstanceStorageType <p>Instance storage type<br>Description: This parameter returns a value only when the resource to query is LibraDB.</p>
     */
    public void setInstanceStorageType(String InstanceStorageType) {
        this.InstanceStorageType = InstanceStorageType;
    }

    /**
     * Get <p>Database type</p> 
     * @return DbMode <p>Database type</p>
     */
    public String getDbMode() {
        return this.DbMode;
    }

    /**
     * Set <p>Database type</p>
     * @param DbMode <p>Database type</p>
     */
    public void setDbMode(String DbMode) {
        this.DbMode = DbMode;
    }

    /**
     * Get <p>Node list<br>Description: This parameter returns a value only when the resource to query is LibraDB.</p> 
     * @return NodeList <p>Node list<br>Description: This parameter returns a value only when the resource to query is LibraDB.</p>
     */
    public String [] getNodeList() {
        return this.NodeList;
    }

    /**
     * Set <p>Node list<br>Description: This parameter returns a value only when the resource to query is LibraDB.</p>
     * @param NodeList <p>Node list<br>Description: This parameter returns a value only when the resource to query is LibraDB.</p>
     */
    public void setNodeList(String [] NodeList) {
        this.NodeList = NodeList;
    }

    /**
     * Get <p>serverless instance sub-status</p> 
     * @return ServerlessStatus <p>serverless instance sub-status</p>
     */
    public String getServerlessStatus() {
        return this.ServerlessStatus;
    }

    /**
     * Set <p>serverless instance sub-status</p>
     * @param ServerlessStatus <p>serverless instance sub-status</p>
     */
    public void setServerlessStatus(String ServerlessStatus) {
        this.ServerlessStatus = ServerlessStatus;
    }

    /**
     * Get <p>AI optimizer status</p> 
     * @return AIOptimizerStatus <p>AI optimizer status</p>
     */
    public AIOptimizerStatus getAIOptimizerStatus() {
        return this.AIOptimizerStatus;
    }

    /**
     * Set <p>AI optimizer status</p>
     * @param AIOptimizerStatus <p>AI optimizer status</p>
     */
    public void setAIOptimizerStatus(AIOptimizerStatus AIOptimizerStatus) {
        this.AIOptimizerStatus = AIOptimizerStatus;
    }

    /**
     * Get <p>Project ID.</p> 
     * @return ProjectId <p>Project ID.</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>Project ID.</p>
     * @param ProjectId <p>Project ID.</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>Region.</p> 
     * @return Region <p>Region.</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>Region.</p>
     * @param Region <p>Region.</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>AZ.</p> 
     * @return Zone <p>AZ.</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>AZ.</p>
     * @param Zone <p>AZ.</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>Physical AZ of the instance location</p> 
     * @return PhysicalZone <p>Physical AZ of the instance location</p>
     */
    public String getPhysicalZone() {
        return this.PhysicalZone;
    }

    /**
     * Set <p>Physical AZ of the instance location</p>
     * @param PhysicalZone <p>Physical AZ of the instance location</p>
     */
    public void setPhysicalZone(String PhysicalZone) {
        this.PhysicalZone = PhysicalZone;
    }

    /**
     * Get <p>Database type</p> 
     * @return DbType <p>Database type</p>
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set <p>Database type</p>
     * @param DbType <p>Database type</p>
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
    }

    /**
     * Get <p>Database version.</p> 
     * @return DbVersion <p>Database version.</p>
     */
    public String getDbVersion() {
        return this.DbVersion;
    }

    /**
     * Set <p>Database version.</p>
     * @param DbVersion <p>Database version.</p>
     */
    public void setDbVersion(String DbVersion) {
        this.DbVersion = DbVersion;
    }

    /**
     * Get <p>Stored amount</p><p>Unit: GB</p> 
     * @return Storage <p>Stored amount</p><p>Unit: GB</p>
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set <p>Stored amount</p><p>Unit: GB</p>
     * @param Storage <p>Stored amount</p><p>Unit: GB</p>
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get <p>Prepaid storage Id.</p> 
     * @return StorageId <p>Prepaid storage Id.</p>
     */
    public String getStorageId() {
        return this.StorageId;
    }

    /**
     * Set <p>Prepaid storage Id.</p>
     * @param StorageId <p>Prepaid storage Id.</p>
     */
    public void setStorageId(String StorageId) {
        this.StorageId = StorageId;
    }

    /**
     * Get <p>Storage billing type.</p><p>Valid values:</p><ul><li>0: postpaid</li><li>1: prepaid</li></ul> 
     * @return StoragePayMode <p>Storage billing type.</p><p>Valid values:</p><ul><li>0: postpaid</li><li>1: prepaid</li></ul>
     */
    public Long getStoragePayMode() {
        return this.StoragePayMode;
    }

    /**
     * Set <p>Storage billing type.</p><p>Valid values:</p><ul><li>0: postpaid</li><li>1: prepaid</li></ul>
     * @param StoragePayMode <p>Storage billing type.</p><p>Valid values:</p><ul><li>0: postpaid</li><li>1: prepaid</li></ul>
     */
    public void setStoragePayMode(Long StoragePayMode) {
        this.StoragePayMode = StoragePayMode;
    }

    /**
     * Get <p>Creation time.</p> 
     * @return CreateTime <p>Creation time.</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time.</p>
     * @param CreateTime <p>Creation time.</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Update time.</p> 
     * @return UpdateTime <p>Update time.</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Update time.</p>
     * @param UpdateTime <p>Update time.</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>Isolation time</p> 
     * @return IsolateTime <p>Isolation time</p>
     */
    public String getIsolateTime() {
        return this.IsolateTime;
    }

    /**
     * Set <p>Isolation time</p>
     * @param IsolateTime <p>Isolation time</p>
     */
    public void setIsolateTime(String IsolateTime) {
        this.IsolateTime = IsolateTime;
    }

    /**
     * Get <p>Instance destruction time</p> 
     * @return DestroyTime <p>Instance destruction time</p>
     */
    public String getDestroyTime() {
        return this.DestroyTime;
    }

    /**
     * Set <p>Instance destruction time</p>
     * @param DestroyTime <p>Instance destruction time</p>
     */
    public void setDestroyTime(String DestroyTime) {
        this.DestroyTime = DestroyTime;
    }

    /**
     * Get <p>Termination phase</p> 
     * @return DestroyDeadlineText <p>Termination phase</p>
     */
    public String getDestroyDeadlineText() {
        return this.DestroyDeadlineText;
    }

    /**
     * Set <p>Termination phase</p>
     * @param DestroyDeadlineText <p>Termination phase</p>
     */
    public void setDestroyDeadlineText(String DestroyDeadlineText) {
        this.DestroyDeadlineText = DestroyDeadlineText;
    }

    /**
     * Get <p>Instance expiration time</p> 
     * @return PeriodEndTime <p>Instance expiration time</p>
     */
    public String getPeriodEndTime() {
        return this.PeriodEndTime;
    }

    /**
     * Set <p>Instance expiration time</p>
     * @param PeriodEndTime <p>Instance expiration time</p>
     */
    public void setPeriodEndTime(String PeriodEndTime) {
        this.PeriodEndTime = PeriodEndTime;
    }

    /**
     * Get <p>VPC network ID</p> 
     * @return VpcId <p>VPC network ID</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>VPC network ID</p>
     * @param VpcId <p>VPC network ID</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>Subnet ID.</p> 
     * @return SubnetId <p>Subnet ID.</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>Subnet ID.</p>
     * @param SubnetId <p>Subnet ID.</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>Instance private IP address</p> 
     * @return Vip <p>Instance private IP address</p>
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set <p>Instance private IP address</p>
     * @param Vip <p>Instance private IP address</p>
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get <p>Instance Intranet Port</p> 
     * @return Vport <p>Instance Intranet Port</p>
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set <p>Instance Intranet Port</p>
     * @param Vport <p>Instance Intranet Port</p>
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get <p>Network type</p> 
     * @return NetType <p>Network type</p>
     */
    public Long getNetType() {
        return this.NetType;
    }

    /**
     * Set <p>Network type</p>
     * @param NetType <p>Network type</p>
     */
    public void setNetType(Long NetType) {
        this.NetType = NetType;
    }

    /**
     * Get <p>Public network IP</p> 
     * @return WanIP <p>Public network IP</p>
     */
    public String getWanIP() {
        return this.WanIP;
    }

    /**
     * Set <p>Public network IP</p>
     * @param WanIP <p>Public network IP</p>
     */
    public void setWanIP(String WanIP) {
        this.WanIP = WanIP;
    }

    /**
     * Get <p>External port</p> 
     * @return WanPort <p>External port</p>
     */
    public Long getWanPort() {
        return this.WanPort;
    }

    /**
     * Set <p>External port</p>
     * @param WanPort <p>External port</p>
     */
    public void setWanPort(Long WanPort) {
        this.WanPort = WanPort;
    }

    /**
     * Get <p>Public network enabled status</p> 
     * @return WanStatus <p>Public network enabled status</p>
     */
    public String getWanStatus() {
        return this.WanStatus;
    }

    /**
     * Set <p>Public network enabled status</p>
     * @param WanStatus <p>Public network enabled status</p>
     */
    public void setWanStatus(String WanStatus) {
        this.WanStatus = WanStatus;
    }

    /**
     * Get <p>Instance public domain name.</p> 
     * @return WanDomain <p>Instance public domain name.</p>
     */
    public String getWanDomain() {
        return this.WanDomain;
    }

    /**
     * Set <p>Instance public domain name.</p>
     * @param WanDomain <p>Instance public domain name.</p>
     */
    public void setWanDomain(String WanDomain) {
        this.WanDomain = WanDomain;
    }

    /**
     * Get <p>Network information of the instance</p> 
     * @return InstanceNetInfo <p>Network information of the instance</p>
     */
    public InstanceNetInfo [] getInstanceNetInfo() {
        return this.InstanceNetInfo;
    }

    /**
     * Set <p>Network information of the instance</p>
     * @param InstanceNetInfo <p>Network information of the instance</p>
     */
    public void setInstanceNetInfo(InstanceNetInfo [] InstanceNetInfo) {
        this.InstanceNetInfo = InstanceNetInfo;
    }

    /**
     * Get <p>Payment mode.</p><p>Valid values:</p><ul><li>0: postpaid</li><li>1: prepaid</li></ul> 
     * @return PayMode <p>Payment mode.</p><p>Valid values:</p><ul><li>0: postpaid</li><li>1: prepaid</li></ul>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>Payment mode.</p><p>Valid values:</p><ul><li>0: postpaid</li><li>1: prepaid</li></ul>
     * @param PayMode <p>Payment mode.</p><p>Valid values:</p><ul><li>0: postpaid</li><li>1: prepaid</li></ul>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>Currently processing task</p> 
     * @return ProcessingTask <p>Currently processing task</p>
     */
    public String getProcessingTask() {
        return this.ProcessingTask;
    }

    /**
     * Set <p>Currently processing task</p>
     * @param ProcessingTask <p>Currently processing task</p>
     */
    public void setProcessingTask(String ProcessingTask) {
        this.ProcessingTask = ProcessingTask;
    }

    /**
     * Get <p>Renewal flag.</p> 
     * @return RenewFlag <p>Renewal flag.</p>
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set <p>Renewal flag.</p>
     * @param RenewFlag <p>Renewal flag.</p>
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get <p>Task</p> 
     * @return Tasks <p>Task</p>
     */
    public ObjectTask [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set <p>Task</p>
     * @param Tasks <p>Task</p>
     */
    public void setTasks(ObjectTask [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get <p>Whether to freeze</p> 
     * @return IsFreeze <p>Whether to freeze</p>
     */
    public String getIsFreeze() {
        return this.IsFreeze;
    }

    /**
     * Set <p>Whether to freeze</p>
     * @param IsFreeze <p>Whether to freeze</p>
     */
    public void setIsFreeze(String IsFreeze) {
        this.IsFreeze = IsFreeze;
    }

    /**
     * Get <p>Resource label.</p> 
     * @return ResourceTags <p>Resource label.</p>
     */
    public Tag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set <p>Resource label.</p>
     * @param ResourceTags <p>Resource label.</p>
     */
    public void setResourceTags(Tag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get <p>Supported capabilities of the current instance</p> 
     * @return InstanceAbility <p>Supported capabilities of the current instance</p>
     */
    public InstanceAbility getInstanceAbility() {
        return this.InstanceAbility;
    }

    /**
     * Set <p>Supported capabilities of the current instance</p>
     * @param InstanceAbility <p>Supported capabilities of the current instance</p>
     */
    public void setInstanceAbility(InstanceAbility InstanceAbility) {
        this.InstanceAbility = InstanceAbility;
    }

    /**
     * Get <p>Global database unique ID</p> 
     * @return GdnId <p>Global database unique ID</p>
     */
    public String getGdnId() {
        return this.GdnId;
    }

    /**
     * Set <p>Global database unique ID</p>
     * @param GdnId <p>Global database unique ID</p>
     */
    public void setGdnId(String GdnId) {
        this.GdnId = GdnId;
    }

    public ClusterInstanceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterInstanceDetail(ClusterInstanceDetail source) {
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new String(source.InstanceStatus);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.InstanceStatusDesc != null) {
            this.InstanceStatusDesc = new String(source.InstanceStatusDesc);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.InstanceCpu != null) {
            this.InstanceCpu = new Long(source.InstanceCpu);
        }
        if (source.MinCpu != null) {
            this.MinCpu = new Float(source.MinCpu);
        }
        if (source.MaxCpu != null) {
            this.MaxCpu = new Float(source.MaxCpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.InstanceMemory != null) {
            this.InstanceMemory = new Long(source.InstanceMemory);
        }
        if (source.InstanceStorage != null) {
            this.InstanceStorage = new Long(source.InstanceStorage);
        }
        if (source.InstanceRole != null) {
            this.InstanceRole = new String(source.InstanceRole);
        }
        if (source.MaintainStartTime != null) {
            this.MaintainStartTime = new Long(source.MaintainStartTime);
        }
        if (source.MaintainDuration != null) {
            this.MaintainDuration = new Long(source.MaintainDuration);
        }
        if (source.MaintainWeekDays != null) {
            this.MaintainWeekDays = new String[source.MaintainWeekDays.length];
            for (int i = 0; i < source.MaintainWeekDays.length; i++) {
                this.MaintainWeekDays[i] = new String(source.MaintainWeekDays[i]);
            }
        }
        if (source.InstanceTasks != null) {
            this.InstanceTasks = new ObjectTask[source.InstanceTasks.length];
            for (int i = 0; i < source.InstanceTasks.length; i++) {
                this.InstanceTasks[i] = new ObjectTask(source.InstanceTasks[i]);
            }
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.InstanceDeviceType != null) {
            this.InstanceDeviceType = new String(source.InstanceDeviceType);
        }
        if (source.InstanceStorageType != null) {
            this.InstanceStorageType = new String(source.InstanceStorageType);
        }
        if (source.DbMode != null) {
            this.DbMode = new String(source.DbMode);
        }
        if (source.NodeList != null) {
            this.NodeList = new String[source.NodeList.length];
            for (int i = 0; i < source.NodeList.length; i++) {
                this.NodeList[i] = new String(source.NodeList[i]);
            }
        }
        if (source.ServerlessStatus != null) {
            this.ServerlessStatus = new String(source.ServerlessStatus);
        }
        if (source.AIOptimizerStatus != null) {
            this.AIOptimizerStatus = new AIOptimizerStatus(source.AIOptimizerStatus);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.PhysicalZone != null) {
            this.PhysicalZone = new String(source.PhysicalZone);
        }
        if (source.DbType != null) {
            this.DbType = new String(source.DbType);
        }
        if (source.DbVersion != null) {
            this.DbVersion = new String(source.DbVersion);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.StorageId != null) {
            this.StorageId = new String(source.StorageId);
        }
        if (source.StoragePayMode != null) {
            this.StoragePayMode = new Long(source.StoragePayMode);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.IsolateTime != null) {
            this.IsolateTime = new String(source.IsolateTime);
        }
        if (source.DestroyTime != null) {
            this.DestroyTime = new String(source.DestroyTime);
        }
        if (source.DestroyDeadlineText != null) {
            this.DestroyDeadlineText = new String(source.DestroyDeadlineText);
        }
        if (source.PeriodEndTime != null) {
            this.PeriodEndTime = new String(source.PeriodEndTime);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.NetType != null) {
            this.NetType = new Long(source.NetType);
        }
        if (source.WanIP != null) {
            this.WanIP = new String(source.WanIP);
        }
        if (source.WanPort != null) {
            this.WanPort = new Long(source.WanPort);
        }
        if (source.WanStatus != null) {
            this.WanStatus = new String(source.WanStatus);
        }
        if (source.WanDomain != null) {
            this.WanDomain = new String(source.WanDomain);
        }
        if (source.InstanceNetInfo != null) {
            this.InstanceNetInfo = new InstanceNetInfo[source.InstanceNetInfo.length];
            for (int i = 0; i < source.InstanceNetInfo.length; i++) {
                this.InstanceNetInfo[i] = new InstanceNetInfo(source.InstanceNetInfo[i]);
            }
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.ProcessingTask != null) {
            this.ProcessingTask = new String(source.ProcessingTask);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.Tasks != null) {
            this.Tasks = new ObjectTask[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new ObjectTask(source.Tasks[i]);
            }
        }
        if (source.IsFreeze != null) {
            this.IsFreeze = new String(source.IsFreeze);
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new Tag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new Tag(source.ResourceTags[i]);
            }
        }
        if (source.InstanceAbility != null) {
            this.InstanceAbility = new InstanceAbility(source.InstanceAbility);
        }
        if (source.GdnId != null) {
            this.GdnId = new String(source.GdnId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "InstanceStatusDesc", this.InstanceStatusDesc);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "InstanceCpu", this.InstanceCpu);
        this.setParamSimple(map, prefix + "MinCpu", this.MinCpu);
        this.setParamSimple(map, prefix + "MaxCpu", this.MaxCpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "InstanceMemory", this.InstanceMemory);
        this.setParamSimple(map, prefix + "InstanceStorage", this.InstanceStorage);
        this.setParamSimple(map, prefix + "InstanceRole", this.InstanceRole);
        this.setParamSimple(map, prefix + "MaintainStartTime", this.MaintainStartTime);
        this.setParamSimple(map, prefix + "MaintainDuration", this.MaintainDuration);
        this.setParamArraySimple(map, prefix + "MaintainWeekDays.", this.MaintainWeekDays);
        this.setParamArrayObj(map, prefix + "InstanceTasks.", this.InstanceTasks);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "InstanceDeviceType", this.InstanceDeviceType);
        this.setParamSimple(map, prefix + "InstanceStorageType", this.InstanceStorageType);
        this.setParamSimple(map, prefix + "DbMode", this.DbMode);
        this.setParamArraySimple(map, prefix + "NodeList.", this.NodeList);
        this.setParamSimple(map, prefix + "ServerlessStatus", this.ServerlessStatus);
        this.setParamObj(map, prefix + "AIOptimizerStatus.", this.AIOptimizerStatus);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "PhysicalZone", this.PhysicalZone);
        this.setParamSimple(map, prefix + "DbType", this.DbType);
        this.setParamSimple(map, prefix + "DbVersion", this.DbVersion);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "StorageId", this.StorageId);
        this.setParamSimple(map, prefix + "StoragePayMode", this.StoragePayMode);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "IsolateTime", this.IsolateTime);
        this.setParamSimple(map, prefix + "DestroyTime", this.DestroyTime);
        this.setParamSimple(map, prefix + "DestroyDeadlineText", this.DestroyDeadlineText);
        this.setParamSimple(map, prefix + "PeriodEndTime", this.PeriodEndTime);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "NetType", this.NetType);
        this.setParamSimple(map, prefix + "WanIP", this.WanIP);
        this.setParamSimple(map, prefix + "WanPort", this.WanPort);
        this.setParamSimple(map, prefix + "WanStatus", this.WanStatus);
        this.setParamSimple(map, prefix + "WanDomain", this.WanDomain);
        this.setParamArrayObj(map, prefix + "InstanceNetInfo.", this.InstanceNetInfo);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "ProcessingTask", this.ProcessingTask);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamSimple(map, prefix + "IsFreeze", this.IsFreeze);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamObj(map, prefix + "InstanceAbility.", this.InstanceAbility);
        this.setParamSimple(map, prefix + "GdnId", this.GdnId);

    }
}


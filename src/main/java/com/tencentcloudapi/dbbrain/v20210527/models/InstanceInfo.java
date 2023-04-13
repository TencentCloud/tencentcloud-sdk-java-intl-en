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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceInfo extends AbstractModel{

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance name.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Instance region.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Health score.
    */
    @SerializedName("HealthScore")
    @Expose
    private Long HealthScore;

    /**
    * Service.
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * Number of exceptions.
    */
    @SerializedName("EventCount")
    @Expose
    private Long EventCount;

    /**
    * Instance type. Valid values: 1 (MASTER), 2 (DR), 3 (RO), 4 (SDR)
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * Number of cores.
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * Memory in MB.
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Disk storage in GB.
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * Database version.
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * Private network address.
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Private network port.
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * Access source.
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * Group ID.
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Group name.
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * Instance status. Valid values: 0 (delivering), 1 (running), 4 (terminating), 5 (isolated)
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Unified subnet ID.
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * TencentDB instance type.
    */
    @SerializedName("DeployMode")
    @Expose
    private String DeployMode;

    /**
    * TencentDB instance initialization flag. Valid values: 0 (not initialized), 1 (initialized).
    */
    @SerializedName("InitFlag")
    @Expose
    private Long InitFlag;

    /**
    * Task status.
    */
    @SerializedName("TaskStatus")
    @Expose
    private Long TaskStatus;

    /**
    * Unified VPC ID.
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * Instance inspection/overview status.
    */
    @SerializedName("InstanceConf")
    @Expose
    private InstanceConfs InstanceConf;

    /**
    * Resource expiration time.
    */
    @SerializedName("DeadlineTime")
    @Expose
    private String DeadlineTime;

    /**
    * Whether it is an instance supported by DBbrain.
    */
    @SerializedName("IsSupported")
    @Expose
    private Boolean IsSupported;

    /**
    * Status of instance security audit log. Valid values: ON (enabled), OFF (disabled).
    */
    @SerializedName("SecAuditStatus")
    @Expose
    private String SecAuditStatus;

    /**
    * Status of instance audit log. Valid values: ALL_AUDIT (full audit is enabled), RULE_AUDIT (rule audit is enabled), UNBOUND (audit is disabled).
    */
    @SerializedName("AuditPolicyStatus")
    @Expose
    private String AuditPolicyStatus;

    /**
    * Running status of instance audit log. Valid values: normal (running), paused (suspension due to overdue payment).
    */
    @SerializedName("AuditRunningStatus")
    @Expose
    private String AuditRunningStatus;

    /**
    * Private VIP
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InternalVip")
    @Expose
    private String InternalVip;

    /**
    * Private network port
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InternalVport")
    @Expose
    private Long InternalVport;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance name. 
     * @return InstanceName Instance name.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name.
     * @param InstanceName Instance name.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Instance region. 
     * @return Region Instance region.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Instance region.
     * @param Region Instance region.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Health score. 
     * @return HealthScore Health score.
     */
    public Long getHealthScore() {
        return this.HealthScore;
    }

    /**
     * Set Health score.
     * @param HealthScore Health score.
     */
    public void setHealthScore(Long HealthScore) {
        this.HealthScore = HealthScore;
    }

    /**
     * Get Service. 
     * @return Product Service.
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set Service.
     * @param Product Service.
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get Number of exceptions. 
     * @return EventCount Number of exceptions.
     */
    public Long getEventCount() {
        return this.EventCount;
    }

    /**
     * Set Number of exceptions.
     * @param EventCount Number of exceptions.
     */
    public void setEventCount(Long EventCount) {
        this.EventCount = EventCount;
    }

    /**
     * Get Instance type. Valid values: 1 (MASTER), 2 (DR), 3 (RO), 4 (SDR) 
     * @return InstanceType Instance type. Valid values: 1 (MASTER), 2 (DR), 3 (RO), 4 (SDR)
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance type. Valid values: 1 (MASTER), 2 (DR), 3 (RO), 4 (SDR)
     * @param InstanceType Instance type. Valid values: 1 (MASTER), 2 (DR), 3 (RO), 4 (SDR)
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Number of cores. 
     * @return Cpu Number of cores.
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Number of cores.
     * @param Cpu Number of cores.
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Memory in MB. 
     * @return Memory Memory in MB.
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Memory in MB.
     * @param Memory Memory in MB.
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Disk storage in GB. 
     * @return Volume Disk storage in GB.
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set Disk storage in GB.
     * @param Volume Disk storage in GB.
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Get Database version. 
     * @return EngineVersion Database version.
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set Database version.
     * @param EngineVersion Database version.
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get Private network address. 
     * @return Vip Private network address.
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Private network address.
     * @param Vip Private network address.
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Private network port. 
     * @return Vport Private network port.
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set Private network port.
     * @param Vport Private network port.
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get Access source. 
     * @return Source Access source.
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set Access source.
     * @param Source Access source.
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get Group ID. 
     * @return GroupId Group ID.
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Group ID.
     * @param GroupId Group ID.
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Group name. 
     * @return GroupName Group name.
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set Group name.
     * @param GroupName Group name.
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get Instance status. Valid values: 0 (delivering), 1 (running), 4 (terminating), 5 (isolated) 
     * @return Status Instance status. Valid values: 0 (delivering), 1 (running), 4 (terminating), 5 (isolated)
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Instance status. Valid values: 0 (delivering), 1 (running), 4 (terminating), 5 (isolated)
     * @param Status Instance status. Valid values: 0 (delivering), 1 (running), 4 (terminating), 5 (isolated)
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Unified subnet ID. 
     * @return UniqSubnetId Unified subnet ID.
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set Unified subnet ID.
     * @param UniqSubnetId Unified subnet ID.
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get TencentDB instance type. 
     * @return DeployMode TencentDB instance type.
     */
    public String getDeployMode() {
        return this.DeployMode;
    }

    /**
     * Set TencentDB instance type.
     * @param DeployMode TencentDB instance type.
     */
    public void setDeployMode(String DeployMode) {
        this.DeployMode = DeployMode;
    }

    /**
     * Get TencentDB instance initialization flag. Valid values: 0 (not initialized), 1 (initialized). 
     * @return InitFlag TencentDB instance initialization flag. Valid values: 0 (not initialized), 1 (initialized).
     */
    public Long getInitFlag() {
        return this.InitFlag;
    }

    /**
     * Set TencentDB instance initialization flag. Valid values: 0 (not initialized), 1 (initialized).
     * @param InitFlag TencentDB instance initialization flag. Valid values: 0 (not initialized), 1 (initialized).
     */
    public void setInitFlag(Long InitFlag) {
        this.InitFlag = InitFlag;
    }

    /**
     * Get Task status. 
     * @return TaskStatus Task status.
     */
    public Long getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set Task status.
     * @param TaskStatus Task status.
     */
    public void setTaskStatus(Long TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get Unified VPC ID. 
     * @return UniqVpcId Unified VPC ID.
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set Unified VPC ID.
     * @param UniqVpcId Unified VPC ID.
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get Instance inspection/overview status. 
     * @return InstanceConf Instance inspection/overview status.
     */
    public InstanceConfs getInstanceConf() {
        return this.InstanceConf;
    }

    /**
     * Set Instance inspection/overview status.
     * @param InstanceConf Instance inspection/overview status.
     */
    public void setInstanceConf(InstanceConfs InstanceConf) {
        this.InstanceConf = InstanceConf;
    }

    /**
     * Get Resource expiration time. 
     * @return DeadlineTime Resource expiration time.
     */
    public String getDeadlineTime() {
        return this.DeadlineTime;
    }

    /**
     * Set Resource expiration time.
     * @param DeadlineTime Resource expiration time.
     */
    public void setDeadlineTime(String DeadlineTime) {
        this.DeadlineTime = DeadlineTime;
    }

    /**
     * Get Whether it is an instance supported by DBbrain. 
     * @return IsSupported Whether it is an instance supported by DBbrain.
     */
    public Boolean getIsSupported() {
        return this.IsSupported;
    }

    /**
     * Set Whether it is an instance supported by DBbrain.
     * @param IsSupported Whether it is an instance supported by DBbrain.
     */
    public void setIsSupported(Boolean IsSupported) {
        this.IsSupported = IsSupported;
    }

    /**
     * Get Status of instance security audit log. Valid values: ON (enabled), OFF (disabled). 
     * @return SecAuditStatus Status of instance security audit log. Valid values: ON (enabled), OFF (disabled).
     */
    public String getSecAuditStatus() {
        return this.SecAuditStatus;
    }

    /**
     * Set Status of instance security audit log. Valid values: ON (enabled), OFF (disabled).
     * @param SecAuditStatus Status of instance security audit log. Valid values: ON (enabled), OFF (disabled).
     */
    public void setSecAuditStatus(String SecAuditStatus) {
        this.SecAuditStatus = SecAuditStatus;
    }

    /**
     * Get Status of instance audit log. Valid values: ALL_AUDIT (full audit is enabled), RULE_AUDIT (rule audit is enabled), UNBOUND (audit is disabled). 
     * @return AuditPolicyStatus Status of instance audit log. Valid values: ALL_AUDIT (full audit is enabled), RULE_AUDIT (rule audit is enabled), UNBOUND (audit is disabled).
     */
    public String getAuditPolicyStatus() {
        return this.AuditPolicyStatus;
    }

    /**
     * Set Status of instance audit log. Valid values: ALL_AUDIT (full audit is enabled), RULE_AUDIT (rule audit is enabled), UNBOUND (audit is disabled).
     * @param AuditPolicyStatus Status of instance audit log. Valid values: ALL_AUDIT (full audit is enabled), RULE_AUDIT (rule audit is enabled), UNBOUND (audit is disabled).
     */
    public void setAuditPolicyStatus(String AuditPolicyStatus) {
        this.AuditPolicyStatus = AuditPolicyStatus;
    }

    /**
     * Get Running status of instance audit log. Valid values: normal (running), paused (suspension due to overdue payment). 
     * @return AuditRunningStatus Running status of instance audit log. Valid values: normal (running), paused (suspension due to overdue payment).
     */
    public String getAuditRunningStatus() {
        return this.AuditRunningStatus;
    }

    /**
     * Set Running status of instance audit log. Valid values: normal (running), paused (suspension due to overdue payment).
     * @param AuditRunningStatus Running status of instance audit log. Valid values: normal (running), paused (suspension due to overdue payment).
     */
    public void setAuditRunningStatus(String AuditRunningStatus) {
        this.AuditRunningStatus = AuditRunningStatus;
    }

    /**
     * Get Private VIP
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InternalVip Private VIP
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInternalVip() {
        return this.InternalVip;
    }

    /**
     * Set Private VIP
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InternalVip Private VIP
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInternalVip(String InternalVip) {
        this.InternalVip = InternalVip;
    }

    /**
     * Get Private network port
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InternalVport Private network port
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getInternalVport() {
        return this.InternalVport;
    }

    /**
     * Set Private network port
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InternalVport Private network port
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInternalVport(Long InternalVport) {
        this.InternalVport = InternalVport;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public InstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceInfo(InstanceInfo source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.HealthScore != null) {
            this.HealthScore = new Long(source.HealthScore);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.EventCount != null) {
            this.EventCount = new Long(source.EventCount);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new Long(source.InstanceType);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Volume != null) {
            this.Volume = new Long(source.Volume);
        }
        if (source.EngineVersion != null) {
            this.EngineVersion = new String(source.EngineVersion);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
        if (source.DeployMode != null) {
            this.DeployMode = new String(source.DeployMode);
        }
        if (source.InitFlag != null) {
            this.InitFlag = new Long(source.InitFlag);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new Long(source.TaskStatus);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.InstanceConf != null) {
            this.InstanceConf = new InstanceConfs(source.InstanceConf);
        }
        if (source.DeadlineTime != null) {
            this.DeadlineTime = new String(source.DeadlineTime);
        }
        if (source.IsSupported != null) {
            this.IsSupported = new Boolean(source.IsSupported);
        }
        if (source.SecAuditStatus != null) {
            this.SecAuditStatus = new String(source.SecAuditStatus);
        }
        if (source.AuditPolicyStatus != null) {
            this.AuditPolicyStatus = new String(source.AuditPolicyStatus);
        }
        if (source.AuditRunningStatus != null) {
            this.AuditRunningStatus = new String(source.AuditRunningStatus);
        }
        if (source.InternalVip != null) {
            this.InternalVip = new String(source.InternalVip);
        }
        if (source.InternalVport != null) {
            this.InternalVport = new Long(source.InternalVport);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "HealthScore", this.HealthScore);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "EventCount", this.EventCount);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "DeployMode", this.DeployMode);
        this.setParamSimple(map, prefix + "InitFlag", this.InitFlag);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamObj(map, prefix + "InstanceConf.", this.InstanceConf);
        this.setParamSimple(map, prefix + "DeadlineTime", this.DeadlineTime);
        this.setParamSimple(map, prefix + "IsSupported", this.IsSupported);
        this.setParamSimple(map, prefix + "SecAuditStatus", this.SecAuditStatus);
        this.setParamSimple(map, prefix + "AuditPolicyStatus", this.AuditPolicyStatus);
        this.setParamSimple(map, prefix + "AuditRunningStatus", this.AuditRunningStatus);
        this.setParamSimple(map, prefix + "InternalVip", this.InternalVip);
        this.setParamSimple(map, prefix + "InternalVport", this.InternalVport);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}


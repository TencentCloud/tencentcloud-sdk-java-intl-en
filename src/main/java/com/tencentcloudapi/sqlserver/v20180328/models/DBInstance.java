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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DBInstance extends AbstractModel{

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Project ID of instance
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Instance region ID
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * Instance AZ ID
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * Instance VPC ID, which will be 0 if the basic network is used
    */
    @SerializedName("VpcId")
    @Expose
    private Long VpcId;

    /**
    * Instance VPC subnet ID, which will be 0 if the basic network is used
    */
    @SerializedName("SubnetId")
    @Expose
    private Long SubnetId;

    /**
    * Instance status. Valid values: <li>1: applying </li> <li>2: running </li> <li>3: restrictedly running (primary/secondary switching) </li> <li>4: isolated </li> <li>5: repossessing </li> <li>6: repossessed </li> <li>7: task running (e.g., backing up or rolling back the instance) </li> <li>8: decommissioned </li> <li>9: scaling </li> <li>10: migrating </li> <li>11: read-only </li> <li>12: restarting </li>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Instance access IP
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Instance access port
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * Instance creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Instance update time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Instance billing start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Instance billing end time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Instance isolation time
    */
    @SerializedName("IsolateTime")
    @Expose
    private String IsolateTime;

    /**
    * Instance memory size in GB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Used storage capacity of instance in GB
    */
    @SerializedName("UsedStorage")
    @Expose
    private Long UsedStorage;

    /**
    * Instance storage capacity in GB
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * Instance version
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * Instance renewal flag
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * High-availability instance type. Valid values: 1 (dual-server high-availability), 2 (standalone), 3 (multi-AZ), 4 (multi-AZ cluster), 5 (cluster), 9 (private consumption)
    */
    @SerializedName("Model")
    @Expose
    private Long Model;

    /**
    * Instance region name, such as ap-guangzhou
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Instance AZ name, such as ap-guangzhou-1
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Backup time point
    */
    @SerializedName("BackupTime")
    @Expose
    private String BackupTime;

    /**
    * Instance billing mode. 0: pay-as-you-go
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * Instance UID
    */
    @SerializedName("Uid")
    @Expose
    private String Uid;

    /**
    * Number of CPU cores of instance
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * Instance version code
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Physical server code
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Billing ID
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * Unique string-type ID of instance VPC in the format of `vpc-xxx`, which is an empty string if the basic network is used
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * Unique string-type ID of instance subnet in the format of `subnet-xxx`, which is an empty string if the basic network is used
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * Instance isolation.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsolateOperator")
    @Expose
    private String IsolateOperator;

    /**
    * Pub/sub flag. Valid values: SUB (subscribe instance), PUB (publish instance). If it is left empty, it refers to a regular instance without a pub/sub design.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubFlag")
    @Expose
    private String SubFlag;

    /**
    * Read-only flag. Valid values: RO (read-only instance), MASTER (primary instance with read-only instances). If it is left empty, it refers to an instance which is not read-only and has no RO group.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ROFlag")
    @Expose
    private String ROFlag;

    /**
    * Disaster recovery type. Valid values: MIRROR (image), ALWAYSON (AlwaysOn), SINGLE (singleton).
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HAFlag")
    @Expose
    private String HAFlag;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance name 
     * @return Name Instance name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Instance name
     * @param Name Instance name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Project ID of instance 
     * @return ProjectId Project ID of instance
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID of instance
     * @param ProjectId Project ID of instance
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Instance region ID 
     * @return RegionId Instance region ID
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Instance region ID
     * @param RegionId Instance region ID
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get Instance AZ ID 
     * @return ZoneId Instance AZ ID
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Instance AZ ID
     * @param ZoneId Instance AZ ID
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Instance VPC ID, which will be 0 if the basic network is used 
     * @return VpcId Instance VPC ID, which will be 0 if the basic network is used
     */
    public Long getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Instance VPC ID, which will be 0 if the basic network is used
     * @param VpcId Instance VPC ID, which will be 0 if the basic network is used
     */
    public void setVpcId(Long VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Instance VPC subnet ID, which will be 0 if the basic network is used 
     * @return SubnetId Instance VPC subnet ID, which will be 0 if the basic network is used
     */
    public Long getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Instance VPC subnet ID, which will be 0 if the basic network is used
     * @param SubnetId Instance VPC subnet ID, which will be 0 if the basic network is used
     */
    public void setSubnetId(Long SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Instance status. Valid values: <li>1: applying </li> <li>2: running </li> <li>3: restrictedly running (primary/secondary switching) </li> <li>4: isolated </li> <li>5: repossessing </li> <li>6: repossessed </li> <li>7: task running (e.g., backing up or rolling back the instance) </li> <li>8: decommissioned </li> <li>9: scaling </li> <li>10: migrating </li> <li>11: read-only </li> <li>12: restarting </li> 
     * @return Status Instance status. Valid values: <li>1: applying </li> <li>2: running </li> <li>3: restrictedly running (primary/secondary switching) </li> <li>4: isolated </li> <li>5: repossessing </li> <li>6: repossessed </li> <li>7: task running (e.g., backing up or rolling back the instance) </li> <li>8: decommissioned </li> <li>9: scaling </li> <li>10: migrating </li> <li>11: read-only </li> <li>12: restarting </li>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Instance status. Valid values: <li>1: applying </li> <li>2: running </li> <li>3: restrictedly running (primary/secondary switching) </li> <li>4: isolated </li> <li>5: repossessing </li> <li>6: repossessed </li> <li>7: task running (e.g., backing up or rolling back the instance) </li> <li>8: decommissioned </li> <li>9: scaling </li> <li>10: migrating </li> <li>11: read-only </li> <li>12: restarting </li>
     * @param Status Instance status. Valid values: <li>1: applying </li> <li>2: running </li> <li>3: restrictedly running (primary/secondary switching) </li> <li>4: isolated </li> <li>5: repossessing </li> <li>6: repossessed </li> <li>7: task running (e.g., backing up or rolling back the instance) </li> <li>8: decommissioned </li> <li>9: scaling </li> <li>10: migrating </li> <li>11: read-only </li> <li>12: restarting </li>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Instance access IP 
     * @return Vip Instance access IP
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Instance access IP
     * @param Vip Instance access IP
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Instance access port 
     * @return Vport Instance access port
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set Instance access port
     * @param Vport Instance access port
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get Instance creation time 
     * @return CreateTime Instance creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Instance creation time
     * @param CreateTime Instance creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Instance update time 
     * @return UpdateTime Instance update time
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Instance update time
     * @param UpdateTime Instance update time
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Instance billing start time 
     * @return StartTime Instance billing start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Instance billing start time
     * @param StartTime Instance billing start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Instance billing end time 
     * @return EndTime Instance billing end time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Instance billing end time
     * @param EndTime Instance billing end time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Instance isolation time 
     * @return IsolateTime Instance isolation time
     */
    public String getIsolateTime() {
        return this.IsolateTime;
    }

    /**
     * Set Instance isolation time
     * @param IsolateTime Instance isolation time
     */
    public void setIsolateTime(String IsolateTime) {
        this.IsolateTime = IsolateTime;
    }

    /**
     * Get Instance memory size in GB 
     * @return Memory Instance memory size in GB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Instance memory size in GB
     * @param Memory Instance memory size in GB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Used storage capacity of instance in GB 
     * @return UsedStorage Used storage capacity of instance in GB
     */
    public Long getUsedStorage() {
        return this.UsedStorage;
    }

    /**
     * Set Used storage capacity of instance in GB
     * @param UsedStorage Used storage capacity of instance in GB
     */
    public void setUsedStorage(Long UsedStorage) {
        this.UsedStorage = UsedStorage;
    }

    /**
     * Get Instance storage capacity in GB 
     * @return Storage Instance storage capacity in GB
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set Instance storage capacity in GB
     * @param Storage Instance storage capacity in GB
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get Instance version 
     * @return VersionName Instance version
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set Instance version
     * @param VersionName Instance version
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get Instance renewal flag 
     * @return RenewFlag Instance renewal flag
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set Instance renewal flag
     * @param RenewFlag Instance renewal flag
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get High-availability instance type. Valid values: 1 (dual-server high-availability), 2 (standalone), 3 (multi-AZ), 4 (multi-AZ cluster), 5 (cluster), 9 (private consumption) 
     * @return Model High-availability instance type. Valid values: 1 (dual-server high-availability), 2 (standalone), 3 (multi-AZ), 4 (multi-AZ cluster), 5 (cluster), 9 (private consumption)
     */
    public Long getModel() {
        return this.Model;
    }

    /**
     * Set High-availability instance type. Valid values: 1 (dual-server high-availability), 2 (standalone), 3 (multi-AZ), 4 (multi-AZ cluster), 5 (cluster), 9 (private consumption)
     * @param Model High-availability instance type. Valid values: 1 (dual-server high-availability), 2 (standalone), 3 (multi-AZ), 4 (multi-AZ cluster), 5 (cluster), 9 (private consumption)
     */
    public void setModel(Long Model) {
        this.Model = Model;
    }

    /**
     * Get Instance region name, such as ap-guangzhou 
     * @return Region Instance region name, such as ap-guangzhou
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Instance region name, such as ap-guangzhou
     * @param Region Instance region name, such as ap-guangzhou
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Instance AZ name, such as ap-guangzhou-1 
     * @return Zone Instance AZ name, such as ap-guangzhou-1
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Instance AZ name, such as ap-guangzhou-1
     * @param Zone Instance AZ name, such as ap-guangzhou-1
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Backup time point 
     * @return BackupTime Backup time point
     */
    public String getBackupTime() {
        return this.BackupTime;
    }

    /**
     * Set Backup time point
     * @param BackupTime Backup time point
     */
    public void setBackupTime(String BackupTime) {
        this.BackupTime = BackupTime;
    }

    /**
     * Get Instance billing mode. 0: pay-as-you-go 
     * @return PayMode Instance billing mode. 0: pay-as-you-go
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Instance billing mode. 0: pay-as-you-go
     * @param PayMode Instance billing mode. 0: pay-as-you-go
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Instance UID 
     * @return Uid Instance UID
     */
    public String getUid() {
        return this.Uid;
    }

    /**
     * Set Instance UID
     * @param Uid Instance UID
     */
    public void setUid(String Uid) {
        this.Uid = Uid;
    }

    /**
     * Get Number of CPU cores of instance 
     * @return Cpu Number of CPU cores of instance
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Number of CPU cores of instance
     * @param Cpu Number of CPU cores of instance
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Instance version code 
     * @return Version Instance version code
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Instance version code
     * @param Version Instance version code
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Physical server code 
     * @return Type Physical server code
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Physical server code
     * @param Type Physical server code
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Billing ID 
     * @return Pid Billing ID
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set Billing ID
     * @param Pid Billing ID
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get Unique string-type ID of instance VPC in the format of `vpc-xxx`, which is an empty string if the basic network is used 
     * @return UniqVpcId Unique string-type ID of instance VPC in the format of `vpc-xxx`, which is an empty string if the basic network is used
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set Unique string-type ID of instance VPC in the format of `vpc-xxx`, which is an empty string if the basic network is used
     * @param UniqVpcId Unique string-type ID of instance VPC in the format of `vpc-xxx`, which is an empty string if the basic network is used
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get Unique string-type ID of instance subnet in the format of `subnet-xxx`, which is an empty string if the basic network is used 
     * @return UniqSubnetId Unique string-type ID of instance subnet in the format of `subnet-xxx`, which is an empty string if the basic network is used
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set Unique string-type ID of instance subnet in the format of `subnet-xxx`, which is an empty string if the basic network is used
     * @param UniqSubnetId Unique string-type ID of instance subnet in the format of `subnet-xxx`, which is an empty string if the basic network is used
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get Instance isolation.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IsolateOperator Instance isolation.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getIsolateOperator() {
        return this.IsolateOperator;
    }

    /**
     * Set Instance isolation.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IsolateOperator Instance isolation.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIsolateOperator(String IsolateOperator) {
        this.IsolateOperator = IsolateOperator;
    }

    /**
     * Get Pub/sub flag. Valid values: SUB (subscribe instance), PUB (publish instance). If it is left empty, it refers to a regular instance without a pub/sub design.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SubFlag Pub/sub flag. Valid values: SUB (subscribe instance), PUB (publish instance). If it is left empty, it refers to a regular instance without a pub/sub design.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getSubFlag() {
        return this.SubFlag;
    }

    /**
     * Set Pub/sub flag. Valid values: SUB (subscribe instance), PUB (publish instance). If it is left empty, it refers to a regular instance without a pub/sub design.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SubFlag Pub/sub flag. Valid values: SUB (subscribe instance), PUB (publish instance). If it is left empty, it refers to a regular instance without a pub/sub design.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSubFlag(String SubFlag) {
        this.SubFlag = SubFlag;
    }

    /**
     * Get Read-only flag. Valid values: RO (read-only instance), MASTER (primary instance with read-only instances). If it is left empty, it refers to an instance which is not read-only and has no RO group.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ROFlag Read-only flag. Valid values: RO (read-only instance), MASTER (primary instance with read-only instances). If it is left empty, it refers to an instance which is not read-only and has no RO group.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getROFlag() {
        return this.ROFlag;
    }

    /**
     * Set Read-only flag. Valid values: RO (read-only instance), MASTER (primary instance with read-only instances). If it is left empty, it refers to an instance which is not read-only and has no RO group.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ROFlag Read-only flag. Valid values: RO (read-only instance), MASTER (primary instance with read-only instances). If it is left empty, it refers to an instance which is not read-only and has no RO group.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setROFlag(String ROFlag) {
        this.ROFlag = ROFlag;
    }

    /**
     * Get Disaster recovery type. Valid values: MIRROR (image), ALWAYSON (AlwaysOn), SINGLE (singleton).
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return HAFlag Disaster recovery type. Valid values: MIRROR (image), ALWAYSON (AlwaysOn), SINGLE (singleton).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getHAFlag() {
        return this.HAFlag;
    }

    /**
     * Set Disaster recovery type. Valid values: MIRROR (image), ALWAYSON (AlwaysOn), SINGLE (singleton).
Note: this field may return null, indicating that no valid values can be obtained.
     * @param HAFlag Disaster recovery type. Valid values: MIRROR (image), ALWAYSON (AlwaysOn), SINGLE (singleton).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setHAFlag(String HAFlag) {
        this.HAFlag = HAFlag;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "IsolateTime", this.IsolateTime);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "UsedStorage", this.UsedStorage);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "BackupTime", this.BackupTime);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "IsolateOperator", this.IsolateOperator);
        this.setParamSimple(map, prefix + "SubFlag", this.SubFlag);
        this.setParamSimple(map, prefix + "ROFlag", this.ROFlag);
        this.setParamSimple(map, prefix + "HAFlag", this.HAFlag);

    }
}


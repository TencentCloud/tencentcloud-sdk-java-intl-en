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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCloneInstanceRequest extends AbstractModel{

    /**
    * ID of the instance to be cloned from
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * To roll back the cloned instance to a specific point in time, set this parameter to a value in the format of "yyyy-mm-dd hh:mm:ss".
    */
    @SerializedName("SpecifiedRollbackTime")
    @Expose
    private String SpecifiedRollbackTime;

    /**
    * To roll back the cloned instance to a specific physical backup file, set this parameter to the ID of the physical backup file. The ID can be obtained by the [DescribeBackups](https://intl.cloud.tencent.com/document/api/236/15842?from_cn_redirect=1) API.
    */
    @SerializedName("SpecifiedBackupId")
    @Expose
    private Long SpecifiedBackupId;

    /**
    * VPC ID, which can be obtained by the [DescribeVpcs](https://intl.cloud.tencent.com/document/api/215/15778?from_cn_redirect=1) API. If this parameter is left empty, the classic network will be used by default.
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * VPC subnet ID, which can be obtained by the [DescribeSubnets](https://intl.cloud.tencent.com/document/api/215/15784?from_cn_redirect=1) API. If `UniqVpcId` is set, `UniqSubnetId` will be required.
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * Memory of the cloned instance in MB, which should be equal to (by default) or larger than that of the original instance
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Disk capacity of the cloned instance in GB, which should be equal to (by default) or larger than that of the original instance
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * Name of the cloned instance
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Security group parameter, which can be obtained by the [DescribeProjectSecurityGroups](https://intl.cloud.tencent.com/document/api/236/15850?from_cn_redirect=1) API
    */
    @SerializedName("SecurityGroup")
    @Expose
    private String [] SecurityGroup;

    /**
    * Information of the cloned instance tag
    */
    @SerializedName("ResourceTags")
    @Expose
    private TagInfo [] ResourceTags;

    /**
    * The number of CPU cores of the cloned instance. It should be equal to (by default) or larger than that of the original instance.
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * Data replication mode. Valid values: 0 (async), 1 (semi-sync), 2 (strong sync). Default value: 0.
    */
    @SerializedName("ProtectMode")
    @Expose
    private Long ProtectMode;

    /**
    * Multi-AZ or single-AZ. Valid values: 0 (single-AZ), 1 (multi-AZ). Default value: 0.
    */
    @SerializedName("DeployMode")
    @Expose
    private Long DeployMode;

    /**
    * Availability zone information of replica 1 of the cloned instance, which is the same as the value of `Zone` of the original instance by default
    */
    @SerializedName("SlaveZone")
    @Expose
    private String SlaveZone;

    /**
    * Availability zone information of replica 2 of the cloned instance, 
which is left empty by default. Specify this parameter when cloning a strong sync source instance.
    */
    @SerializedName("BackupZone")
    @Expose
    private String BackupZone;

    /**
    * Resource isolation type of the clone. Valid values: `UNIVERSAL` (general instance), `EXCLUSIVE` (dedicated instance). Default value: `UNIVERSAL`.
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * The number of nodes of the clone. If this parameter is set to `3` or the `BackupZone` parameter is specified, the clone will have three nodes. If this parameter is set to `2` or left empty, the clone will have two nodes.
    */
    @SerializedName("InstanceNodes")
    @Expose
    private Long InstanceNodes;

    /**
     * Get ID of the instance to be cloned from 
     * @return InstanceId ID of the instance to be cloned from
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ID of the instance to be cloned from
     * @param InstanceId ID of the instance to be cloned from
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get To roll back the cloned instance to a specific point in time, set this parameter to a value in the format of "yyyy-mm-dd hh:mm:ss". 
     * @return SpecifiedRollbackTime To roll back the cloned instance to a specific point in time, set this parameter to a value in the format of "yyyy-mm-dd hh:mm:ss".
     */
    public String getSpecifiedRollbackTime() {
        return this.SpecifiedRollbackTime;
    }

    /**
     * Set To roll back the cloned instance to a specific point in time, set this parameter to a value in the format of "yyyy-mm-dd hh:mm:ss".
     * @param SpecifiedRollbackTime To roll back the cloned instance to a specific point in time, set this parameter to a value in the format of "yyyy-mm-dd hh:mm:ss".
     */
    public void setSpecifiedRollbackTime(String SpecifiedRollbackTime) {
        this.SpecifiedRollbackTime = SpecifiedRollbackTime;
    }

    /**
     * Get To roll back the cloned instance to a specific physical backup file, set this parameter to the ID of the physical backup file. The ID can be obtained by the [DescribeBackups](https://intl.cloud.tencent.com/document/api/236/15842?from_cn_redirect=1) API. 
     * @return SpecifiedBackupId To roll back the cloned instance to a specific physical backup file, set this parameter to the ID of the physical backup file. The ID can be obtained by the [DescribeBackups](https://intl.cloud.tencent.com/document/api/236/15842?from_cn_redirect=1) API.
     */
    public Long getSpecifiedBackupId() {
        return this.SpecifiedBackupId;
    }

    /**
     * Set To roll back the cloned instance to a specific physical backup file, set this parameter to the ID of the physical backup file. The ID can be obtained by the [DescribeBackups](https://intl.cloud.tencent.com/document/api/236/15842?from_cn_redirect=1) API.
     * @param SpecifiedBackupId To roll back the cloned instance to a specific physical backup file, set this parameter to the ID of the physical backup file. The ID can be obtained by the [DescribeBackups](https://intl.cloud.tencent.com/document/api/236/15842?from_cn_redirect=1) API.
     */
    public void setSpecifiedBackupId(Long SpecifiedBackupId) {
        this.SpecifiedBackupId = SpecifiedBackupId;
    }

    /**
     * Get VPC ID, which can be obtained by the [DescribeVpcs](https://intl.cloud.tencent.com/document/api/215/15778?from_cn_redirect=1) API. If this parameter is left empty, the classic network will be used by default. 
     * @return UniqVpcId VPC ID, which can be obtained by the [DescribeVpcs](https://intl.cloud.tencent.com/document/api/215/15778?from_cn_redirect=1) API. If this parameter is left empty, the classic network will be used by default.
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set VPC ID, which can be obtained by the [DescribeVpcs](https://intl.cloud.tencent.com/document/api/215/15778?from_cn_redirect=1) API. If this parameter is left empty, the classic network will be used by default.
     * @param UniqVpcId VPC ID, which can be obtained by the [DescribeVpcs](https://intl.cloud.tencent.com/document/api/215/15778?from_cn_redirect=1) API. If this parameter is left empty, the classic network will be used by default.
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get VPC subnet ID, which can be obtained by the [DescribeSubnets](https://intl.cloud.tencent.com/document/api/215/15784?from_cn_redirect=1) API. If `UniqVpcId` is set, `UniqSubnetId` will be required. 
     * @return UniqSubnetId VPC subnet ID, which can be obtained by the [DescribeSubnets](https://intl.cloud.tencent.com/document/api/215/15784?from_cn_redirect=1) API. If `UniqVpcId` is set, `UniqSubnetId` will be required.
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set VPC subnet ID, which can be obtained by the [DescribeSubnets](https://intl.cloud.tencent.com/document/api/215/15784?from_cn_redirect=1) API. If `UniqVpcId` is set, `UniqSubnetId` will be required.
     * @param UniqSubnetId VPC subnet ID, which can be obtained by the [DescribeSubnets](https://intl.cloud.tencent.com/document/api/215/15784?from_cn_redirect=1) API. If `UniqVpcId` is set, `UniqSubnetId` will be required.
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get Memory of the cloned instance in MB, which should be equal to (by default) or larger than that of the original instance 
     * @return Memory Memory of the cloned instance in MB, which should be equal to (by default) or larger than that of the original instance
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Memory of the cloned instance in MB, which should be equal to (by default) or larger than that of the original instance
     * @param Memory Memory of the cloned instance in MB, which should be equal to (by default) or larger than that of the original instance
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Disk capacity of the cloned instance in GB, which should be equal to (by default) or larger than that of the original instance 
     * @return Volume Disk capacity of the cloned instance in GB, which should be equal to (by default) or larger than that of the original instance
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set Disk capacity of the cloned instance in GB, which should be equal to (by default) or larger than that of the original instance
     * @param Volume Disk capacity of the cloned instance in GB, which should be equal to (by default) or larger than that of the original instance
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Get Name of the cloned instance 
     * @return InstanceName Name of the cloned instance
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Name of the cloned instance
     * @param InstanceName Name of the cloned instance
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Security group parameter, which can be obtained by the [DescribeProjectSecurityGroups](https://intl.cloud.tencent.com/document/api/236/15850?from_cn_redirect=1) API 
     * @return SecurityGroup Security group parameter, which can be obtained by the [DescribeProjectSecurityGroups](https://intl.cloud.tencent.com/document/api/236/15850?from_cn_redirect=1) API
     */
    public String [] getSecurityGroup() {
        return this.SecurityGroup;
    }

    /**
     * Set Security group parameter, which can be obtained by the [DescribeProjectSecurityGroups](https://intl.cloud.tencent.com/document/api/236/15850?from_cn_redirect=1) API
     * @param SecurityGroup Security group parameter, which can be obtained by the [DescribeProjectSecurityGroups](https://intl.cloud.tencent.com/document/api/236/15850?from_cn_redirect=1) API
     */
    public void setSecurityGroup(String [] SecurityGroup) {
        this.SecurityGroup = SecurityGroup;
    }

    /**
     * Get Information of the cloned instance tag 
     * @return ResourceTags Information of the cloned instance tag
     */
    public TagInfo [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set Information of the cloned instance tag
     * @param ResourceTags Information of the cloned instance tag
     */
    public void setResourceTags(TagInfo [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get The number of CPU cores of the cloned instance. It should be equal to (by default) or larger than that of the original instance. 
     * @return Cpu The number of CPU cores of the cloned instance. It should be equal to (by default) or larger than that of the original instance.
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set The number of CPU cores of the cloned instance. It should be equal to (by default) or larger than that of the original instance.
     * @param Cpu The number of CPU cores of the cloned instance. It should be equal to (by default) or larger than that of the original instance.
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Data replication mode. Valid values: 0 (async), 1 (semi-sync), 2 (strong sync). Default value: 0. 
     * @return ProtectMode Data replication mode. Valid values: 0 (async), 1 (semi-sync), 2 (strong sync). Default value: 0.
     */
    public Long getProtectMode() {
        return this.ProtectMode;
    }

    /**
     * Set Data replication mode. Valid values: 0 (async), 1 (semi-sync), 2 (strong sync). Default value: 0.
     * @param ProtectMode Data replication mode. Valid values: 0 (async), 1 (semi-sync), 2 (strong sync). Default value: 0.
     */
    public void setProtectMode(Long ProtectMode) {
        this.ProtectMode = ProtectMode;
    }

    /**
     * Get Multi-AZ or single-AZ. Valid values: 0 (single-AZ), 1 (multi-AZ). Default value: 0. 
     * @return DeployMode Multi-AZ or single-AZ. Valid values: 0 (single-AZ), 1 (multi-AZ). Default value: 0.
     */
    public Long getDeployMode() {
        return this.DeployMode;
    }

    /**
     * Set Multi-AZ or single-AZ. Valid values: 0 (single-AZ), 1 (multi-AZ). Default value: 0.
     * @param DeployMode Multi-AZ or single-AZ. Valid values: 0 (single-AZ), 1 (multi-AZ). Default value: 0.
     */
    public void setDeployMode(Long DeployMode) {
        this.DeployMode = DeployMode;
    }

    /**
     * Get Availability zone information of replica 1 of the cloned instance, which is the same as the value of `Zone` of the original instance by default 
     * @return SlaveZone Availability zone information of replica 1 of the cloned instance, which is the same as the value of `Zone` of the original instance by default
     */
    public String getSlaveZone() {
        return this.SlaveZone;
    }

    /**
     * Set Availability zone information of replica 1 of the cloned instance, which is the same as the value of `Zone` of the original instance by default
     * @param SlaveZone Availability zone information of replica 1 of the cloned instance, which is the same as the value of `Zone` of the original instance by default
     */
    public void setSlaveZone(String SlaveZone) {
        this.SlaveZone = SlaveZone;
    }

    /**
     * Get Availability zone information of replica 2 of the cloned instance, 
which is left empty by default. Specify this parameter when cloning a strong sync source instance. 
     * @return BackupZone Availability zone information of replica 2 of the cloned instance, 
which is left empty by default. Specify this parameter when cloning a strong sync source instance.
     */
    public String getBackupZone() {
        return this.BackupZone;
    }

    /**
     * Set Availability zone information of replica 2 of the cloned instance, 
which is left empty by default. Specify this parameter when cloning a strong sync source instance.
     * @param BackupZone Availability zone information of replica 2 of the cloned instance, 
which is left empty by default. Specify this parameter when cloning a strong sync source instance.
     */
    public void setBackupZone(String BackupZone) {
        this.BackupZone = BackupZone;
    }

    /**
     * Get Resource isolation type of the clone. Valid values: `UNIVERSAL` (general instance), `EXCLUSIVE` (dedicated instance). Default value: `UNIVERSAL`. 
     * @return DeviceType Resource isolation type of the clone. Valid values: `UNIVERSAL` (general instance), `EXCLUSIVE` (dedicated instance). Default value: `UNIVERSAL`.
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set Resource isolation type of the clone. Valid values: `UNIVERSAL` (general instance), `EXCLUSIVE` (dedicated instance). Default value: `UNIVERSAL`.
     * @param DeviceType Resource isolation type of the clone. Valid values: `UNIVERSAL` (general instance), `EXCLUSIVE` (dedicated instance). Default value: `UNIVERSAL`.
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get The number of nodes of the clone. If this parameter is set to `3` or the `BackupZone` parameter is specified, the clone will have three nodes. If this parameter is set to `2` or left empty, the clone will have two nodes. 
     * @return InstanceNodes The number of nodes of the clone. If this parameter is set to `3` or the `BackupZone` parameter is specified, the clone will have three nodes. If this parameter is set to `2` or left empty, the clone will have two nodes.
     */
    public Long getInstanceNodes() {
        return this.InstanceNodes;
    }

    /**
     * Set The number of nodes of the clone. If this parameter is set to `3` or the `BackupZone` parameter is specified, the clone will have three nodes. If this parameter is set to `2` or left empty, the clone will have two nodes.
     * @param InstanceNodes The number of nodes of the clone. If this parameter is set to `3` or the `BackupZone` parameter is specified, the clone will have three nodes. If this parameter is set to `2` or left empty, the clone will have two nodes.
     */
    public void setInstanceNodes(Long InstanceNodes) {
        this.InstanceNodes = InstanceNodes;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SpecifiedRollbackTime", this.SpecifiedRollbackTime);
        this.setParamSimple(map, prefix + "SpecifiedBackupId", this.SpecifiedBackupId);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArraySimple(map, prefix + "SecurityGroup.", this.SecurityGroup);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "ProtectMode", this.ProtectMode);
        this.setParamSimple(map, prefix + "DeployMode", this.DeployMode);
        this.setParamSimple(map, prefix + "SlaveZone", this.SlaveZone);
        this.setParamSimple(map, prefix + "BackupZone", this.BackupZone);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "InstanceNodes", this.InstanceNodes);

    }
}


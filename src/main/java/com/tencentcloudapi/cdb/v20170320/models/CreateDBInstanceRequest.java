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

public class CreateDBInstanceRequest extends AbstractModel{

    /**
    * Instance memory size in MB. You can use the [DescribeDBZoneConfig](https://intl.cloud.tencent.com/document/api/236/17229?from_cn_redirect=1) API to query the supported memory specifications.
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Instance disk size in GB. You can use the [DescribeDBZoneConfig](https://intl.cloud.tencent.com/document/api/236/17229?from_cn_redirect=1) API to query the supported disk specifications.
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * Instance validity period in months. Valid values: `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, `36`.
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Number of instances. Value range: 1-100. Default value: `1`.
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * AZ information. The system will automatically select an AZ by default. You can use the [DescribeDBZoneConfig](https://intl.cloud.tencent.com/document/api/236/17229?from_cn_redirect=1) API to query the supported AZs.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * VPC ID. If this parameter is not passed in, the basic network will be selected by default. You can use the [DescribeVpcs](https://intl.cloud.tencent.com/document/api/215/15778?from_cn_redirect=1) API to query the VPCs.
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * VPC subnet ID. If `UniqVpcId` is set, then `UniqSubnetId` will be required. You can use the [DescribeSubnets](https://intl.cloud.tencent.com/document/api/215/15784?from_cn_redirect=1) API to query the subnet lists.
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * Project ID. If this is left empty, the default project will be used. If read-only instances or disaster recovery instances are purchased, the project ID will be the same as the source instance ID by default.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Custom port. Value range: 1024-65535.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Instance typeA. Valid values: `master` (source instance), `dr` (disaster recovery instance), `ro` (read-only instance).
    */
    @SerializedName("InstanceRole")
    @Expose
    private String InstanceRole;

    /**
    * Instance ID. It is required when purchasing a read-only instance, which is the same as the source instance ID. You can use the [DescribeDBInstances](https://intl.cloud.tencent.com/document/api/236/15872?from_cn_redirect=1) API to query the instance ID.
    */
    @SerializedName("MasterInstanceId")
    @Expose
    private String MasterInstanceId;

    /**
    * MySQL version. Valid values: `5.5`, `5.6`, `5.7`. You can use the [DescribeDBZoneConfig](https://intl.cloud.tencent.com/document/api/236/17229?from_cn_redirect=1) API to query the supported versions.
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * The root account password. It can contain 8-64 characters and must contain at least two of the following types of characters: letters, digits, and symbols (_+-&=!@#$%^*()). This parameter can be specified when purchasing a replica instance and is invalid for read-only or disaster recovery instances.
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Data replication mode. Valid values: `0` (async replication), `1` (semi-sync replication), `2` (strong sync replication). Default value: `0`.
    */
    @SerializedName("ProtectMode")
    @Expose
    private Long ProtectMode;

    /**
    * Multi-AZ or single-AZ. Valid values: `0` (single-AZ), `1` (multi-AZ). Default value: `0`.
    */
    @SerializedName("DeployMode")
    @Expose
    private Long DeployMode;

    /**
    * Information of replica AZ 1, which is the `Zone` value by default.
    */
    @SerializedName("SlaveZone")
    @Expose
    private String SlaveZone;

    /**
    * List of parameters in the format of ParamList.0.Name=auto_increment&ParamList.0.Value=1. You can use the [DescribeDefaultParams](https://intl.cloud.tencent.com/document/api/236/32662?from_cn_redirect=1) API to query the configurable parameters.
    */
    @SerializedName("ParamList")
    @Expose
    private ParamInfo [] ParamList;

    /**
    * Information of replica AZ 2, which is left empty by default. Specify this parameter when purchasing a source instance in the one-source-two-replica architecture.
    */
    @SerializedName("BackupZone")
    @Expose
    private String BackupZone;

    /**
    * Auto-renewal flag. Valid values: `0` (auto-renewal not enabled), `1` (auto-renewal enabled).
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * Region information of the source instance, which is required when purchasing a read-only or disaster recovery instance.
    */
    @SerializedName("MasterRegion")
    @Expose
    private String MasterRegion;

    /**
    * Security group parameter. You can use the [DescribeProjectSecurityGroups](https://intl.cloud.tencent.com/document/api/236/15850?from_cn_redirect=1) API to query the security group details of a project.
    */
    @SerializedName("SecurityGroup")
    @Expose
    private String [] SecurityGroup;

    /**
    * Read-only instance parameter. This parameter must be passed in when purchasing read-only instances.
    */
    @SerializedName("RoGroup")
    @Expose
    private RoGroup RoGroup;

    /**
    * Instance name. For multiple instances purchased at one time, they will be distinguished by the name suffix number, such as instnaceName=db and goodsNum=3, and their instance names are db1, db2, and db3, respectively.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Instance tag information
    */
    @SerializedName("ResourceTags")
    @Expose
    private TagInfo [] ResourceTags;

    /**
    * Placement group ID
    */
    @SerializedName("DeployGroupId")
    @Expose
    private String DeployGroupId;

    /**
    * A string unique in 48 hours, which is supplied by the client to ensure that the request is idempotent. Its maximum length is 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be guaranteed.
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * Instance isolation type. Valid values: `UNIVERSAL` (general instance), `EXCLUSIVE` (dedicated instance), `BASIC` (basic instance). Default value: `UNIVERSAL`.
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * Parameter template ID
    */
    @SerializedName("ParamTemplateId")
    @Expose
    private Long ParamTemplateId;

    /**
    * Array of alarm policy IDs, which is `OriginId` obtained through the `DescribeAlarmPolicy` API.
    */
    @SerializedName("AlarmPolicyList")
    @Expose
    private Long [] AlarmPolicyList;

    /**
    * The number of nodes of the instance. To purchase a read-only instance or a basic instance, set this parameter to `1` or leave it empty. To purchase a three-node instance, set this parameter to `3` or specify the `BackupZone` parameter. If the instance to be purchased is a source instance and both `BackupZone` and this parameter are left empty, the value `2` will be used, which indicates the source instance will have two nodes.
    */
    @SerializedName("InstanceNodes")
    @Expose
    private Long InstanceNodes;

    /**
    * The number of the instance CPU cores. If this parameter is left empty, it will be subject to the `Memory` value.
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * Whether to automatically start disaster recovery synchronization. This parameter takes effect only for disaster recovery instances. Valid values: `0` (no), `1` (yes). Default value: `0`.
    */
    @SerializedName("AutoSyncFlag")
    @Expose
    private Long AutoSyncFlag;

    /**
    * Financial cage ID.
    */
    @SerializedName("CageId")
    @Expose
    private String CageId;

    /**
    * Type of the default parameter template. Valid values: `HIGH_STABILITY` (high-stability template), `HIGH_PERFORMANCE` (high-performance template).
    */
    @SerializedName("ParamTemplateType")
    @Expose
    private String ParamTemplateType;

    /**
    * The array of alarm policy names, such as ["policy-uyoee9wg"]. If the `AlarmPolicyList` parameter is specified, this parameter is invalid.
    */
    @SerializedName("AlarmPolicyIdList")
    @Expose
    private String [] AlarmPolicyIdList;

    /**
    * Whether to check the request without creating any instance. Valid values: `true`, `false` (default). After being submitted, the request will be checked to see if it is in correct format and has all required parameters with valid values. An error code is returned if the check failed, and `RequestId` is returned if the check succeeded. After a successful check, no instance will be created if this parameter is set to `true`, whereas an instance will be created and if it is set to `false`.
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
    * Instance engine type. Valid values: `InnoDB` (default), `RocksDB`.
    */
    @SerializedName("EngineType")
    @Expose
    private String EngineType;

    /**
    * The list of IPs for sources instances. Only one IP address can be assigned to a single source instance. If all IPs are used up, the system will automatically assign IPs to the remaining source instances that do not have one.
    */
    @SerializedName("Vips")
    @Expose
    private String [] Vips;

    /**
     * Get Instance memory size in MB. You can use the [DescribeDBZoneConfig](https://intl.cloud.tencent.com/document/api/236/17229?from_cn_redirect=1) API to query the supported memory specifications. 
     * @return Memory Instance memory size in MB. You can use the [DescribeDBZoneConfig](https://intl.cloud.tencent.com/document/api/236/17229?from_cn_redirect=1) API to query the supported memory specifications.
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Instance memory size in MB. You can use the [DescribeDBZoneConfig](https://intl.cloud.tencent.com/document/api/236/17229?from_cn_redirect=1) API to query the supported memory specifications.
     * @param Memory Instance memory size in MB. You can use the [DescribeDBZoneConfig](https://intl.cloud.tencent.com/document/api/236/17229?from_cn_redirect=1) API to query the supported memory specifications.
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Instance disk size in GB. You can use the [DescribeDBZoneConfig](https://intl.cloud.tencent.com/document/api/236/17229?from_cn_redirect=1) API to query the supported disk specifications. 
     * @return Volume Instance disk size in GB. You can use the [DescribeDBZoneConfig](https://intl.cloud.tencent.com/document/api/236/17229?from_cn_redirect=1) API to query the supported disk specifications.
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set Instance disk size in GB. You can use the [DescribeDBZoneConfig](https://intl.cloud.tencent.com/document/api/236/17229?from_cn_redirect=1) API to query the supported disk specifications.
     * @param Volume Instance disk size in GB. You can use the [DescribeDBZoneConfig](https://intl.cloud.tencent.com/document/api/236/17229?from_cn_redirect=1) API to query the supported disk specifications.
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Get Instance validity period in months. Valid values: `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, `36`. 
     * @return Period Instance validity period in months. Valid values: `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, `36`.
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Instance validity period in months. Valid values: `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, `36`.
     * @param Period Instance validity period in months. Valid values: `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, `36`.
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Number of instances. Value range: 1-100. Default value: `1`. 
     * @return GoodsNum Number of instances. Value range: 1-100. Default value: `1`.
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set Number of instances. Value range: 1-100. Default value: `1`.
     * @param GoodsNum Number of instances. Value range: 1-100. Default value: `1`.
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get AZ information. The system will automatically select an AZ by default. You can use the [DescribeDBZoneConfig](https://intl.cloud.tencent.com/document/api/236/17229?from_cn_redirect=1) API to query the supported AZs. 
     * @return Zone AZ information. The system will automatically select an AZ by default. You can use the [DescribeDBZoneConfig](https://intl.cloud.tencent.com/document/api/236/17229?from_cn_redirect=1) API to query the supported AZs.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set AZ information. The system will automatically select an AZ by default. You can use the [DescribeDBZoneConfig](https://intl.cloud.tencent.com/document/api/236/17229?from_cn_redirect=1) API to query the supported AZs.
     * @param Zone AZ information. The system will automatically select an AZ by default. You can use the [DescribeDBZoneConfig](https://intl.cloud.tencent.com/document/api/236/17229?from_cn_redirect=1) API to query the supported AZs.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get VPC ID. If this parameter is not passed in, the basic network will be selected by default. You can use the [DescribeVpcs](https://intl.cloud.tencent.com/document/api/215/15778?from_cn_redirect=1) API to query the VPCs. 
     * @return UniqVpcId VPC ID. If this parameter is not passed in, the basic network will be selected by default. You can use the [DescribeVpcs](https://intl.cloud.tencent.com/document/api/215/15778?from_cn_redirect=1) API to query the VPCs.
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set VPC ID. If this parameter is not passed in, the basic network will be selected by default. You can use the [DescribeVpcs](https://intl.cloud.tencent.com/document/api/215/15778?from_cn_redirect=1) API to query the VPCs.
     * @param UniqVpcId VPC ID. If this parameter is not passed in, the basic network will be selected by default. You can use the [DescribeVpcs](https://intl.cloud.tencent.com/document/api/215/15778?from_cn_redirect=1) API to query the VPCs.
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get VPC subnet ID. If `UniqVpcId` is set, then `UniqSubnetId` will be required. You can use the [DescribeSubnets](https://intl.cloud.tencent.com/document/api/215/15784?from_cn_redirect=1) API to query the subnet lists. 
     * @return UniqSubnetId VPC subnet ID. If `UniqVpcId` is set, then `UniqSubnetId` will be required. You can use the [DescribeSubnets](https://intl.cloud.tencent.com/document/api/215/15784?from_cn_redirect=1) API to query the subnet lists.
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set VPC subnet ID. If `UniqVpcId` is set, then `UniqSubnetId` will be required. You can use the [DescribeSubnets](https://intl.cloud.tencent.com/document/api/215/15784?from_cn_redirect=1) API to query the subnet lists.
     * @param UniqSubnetId VPC subnet ID. If `UniqVpcId` is set, then `UniqSubnetId` will be required. You can use the [DescribeSubnets](https://intl.cloud.tencent.com/document/api/215/15784?from_cn_redirect=1) API to query the subnet lists.
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get Project ID. If this is left empty, the default project will be used. If read-only instances or disaster recovery instances are purchased, the project ID will be the same as the source instance ID by default. 
     * @return ProjectId Project ID. If this is left empty, the default project will be used. If read-only instances or disaster recovery instances are purchased, the project ID will be the same as the source instance ID by default.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID. If this is left empty, the default project will be used. If read-only instances or disaster recovery instances are purchased, the project ID will be the same as the source instance ID by default.
     * @param ProjectId Project ID. If this is left empty, the default project will be used. If read-only instances or disaster recovery instances are purchased, the project ID will be the same as the source instance ID by default.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Custom port. Value range: 1024-65535. 
     * @return Port Custom port. Value range: 1024-65535.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Custom port. Value range: 1024-65535.
     * @param Port Custom port. Value range: 1024-65535.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Instance typeA. Valid values: `master` (source instance), `dr` (disaster recovery instance), `ro` (read-only instance). 
     * @return InstanceRole Instance typeA. Valid values: `master` (source instance), `dr` (disaster recovery instance), `ro` (read-only instance).
     */
    public String getInstanceRole() {
        return this.InstanceRole;
    }

    /**
     * Set Instance typeA. Valid values: `master` (source instance), `dr` (disaster recovery instance), `ro` (read-only instance).
     * @param InstanceRole Instance typeA. Valid values: `master` (source instance), `dr` (disaster recovery instance), `ro` (read-only instance).
     */
    public void setInstanceRole(String InstanceRole) {
        this.InstanceRole = InstanceRole;
    }

    /**
     * Get Instance ID. It is required when purchasing a read-only instance, which is the same as the source instance ID. You can use the [DescribeDBInstances](https://intl.cloud.tencent.com/document/api/236/15872?from_cn_redirect=1) API to query the instance ID. 
     * @return MasterInstanceId Instance ID. It is required when purchasing a read-only instance, which is the same as the source instance ID. You can use the [DescribeDBInstances](https://intl.cloud.tencent.com/document/api/236/15872?from_cn_redirect=1) API to query the instance ID.
     */
    public String getMasterInstanceId() {
        return this.MasterInstanceId;
    }

    /**
     * Set Instance ID. It is required when purchasing a read-only instance, which is the same as the source instance ID. You can use the [DescribeDBInstances](https://intl.cloud.tencent.com/document/api/236/15872?from_cn_redirect=1) API to query the instance ID.
     * @param MasterInstanceId Instance ID. It is required when purchasing a read-only instance, which is the same as the source instance ID. You can use the [DescribeDBInstances](https://intl.cloud.tencent.com/document/api/236/15872?from_cn_redirect=1) API to query the instance ID.
     */
    public void setMasterInstanceId(String MasterInstanceId) {
        this.MasterInstanceId = MasterInstanceId;
    }

    /**
     * Get MySQL version. Valid values: `5.5`, `5.6`, `5.7`. You can use the [DescribeDBZoneConfig](https://intl.cloud.tencent.com/document/api/236/17229?from_cn_redirect=1) API to query the supported versions. 
     * @return EngineVersion MySQL version. Valid values: `5.5`, `5.6`, `5.7`. You can use the [DescribeDBZoneConfig](https://intl.cloud.tencent.com/document/api/236/17229?from_cn_redirect=1) API to query the supported versions.
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set MySQL version. Valid values: `5.5`, `5.6`, `5.7`. You can use the [DescribeDBZoneConfig](https://intl.cloud.tencent.com/document/api/236/17229?from_cn_redirect=1) API to query the supported versions.
     * @param EngineVersion MySQL version. Valid values: `5.5`, `5.6`, `5.7`. You can use the [DescribeDBZoneConfig](https://intl.cloud.tencent.com/document/api/236/17229?from_cn_redirect=1) API to query the supported versions.
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get The root account password. It can contain 8-64 characters and must contain at least two of the following types of characters: letters, digits, and symbols (_+-&=!@#$%^*()). This parameter can be specified when purchasing a replica instance and is invalid for read-only or disaster recovery instances. 
     * @return Password The root account password. It can contain 8-64 characters and must contain at least two of the following types of characters: letters, digits, and symbols (_+-&=!@#$%^*()). This parameter can be specified when purchasing a replica instance and is invalid for read-only or disaster recovery instances.
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set The root account password. It can contain 8-64 characters and must contain at least two of the following types of characters: letters, digits, and symbols (_+-&=!@#$%^*()). This parameter can be specified when purchasing a replica instance and is invalid for read-only or disaster recovery instances.
     * @param Password The root account password. It can contain 8-64 characters and must contain at least two of the following types of characters: letters, digits, and symbols (_+-&=!@#$%^*()). This parameter can be specified when purchasing a replica instance and is invalid for read-only or disaster recovery instances.
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get Data replication mode. Valid values: `0` (async replication), `1` (semi-sync replication), `2` (strong sync replication). Default value: `0`. 
     * @return ProtectMode Data replication mode. Valid values: `0` (async replication), `1` (semi-sync replication), `2` (strong sync replication). Default value: `0`.
     */
    public Long getProtectMode() {
        return this.ProtectMode;
    }

    /**
     * Set Data replication mode. Valid values: `0` (async replication), `1` (semi-sync replication), `2` (strong sync replication). Default value: `0`.
     * @param ProtectMode Data replication mode. Valid values: `0` (async replication), `1` (semi-sync replication), `2` (strong sync replication). Default value: `0`.
     */
    public void setProtectMode(Long ProtectMode) {
        this.ProtectMode = ProtectMode;
    }

    /**
     * Get Multi-AZ or single-AZ. Valid values: `0` (single-AZ), `1` (multi-AZ). Default value: `0`. 
     * @return DeployMode Multi-AZ or single-AZ. Valid values: `0` (single-AZ), `1` (multi-AZ). Default value: `0`.
     */
    public Long getDeployMode() {
        return this.DeployMode;
    }

    /**
     * Set Multi-AZ or single-AZ. Valid values: `0` (single-AZ), `1` (multi-AZ). Default value: `0`.
     * @param DeployMode Multi-AZ or single-AZ. Valid values: `0` (single-AZ), `1` (multi-AZ). Default value: `0`.
     */
    public void setDeployMode(Long DeployMode) {
        this.DeployMode = DeployMode;
    }

    /**
     * Get Information of replica AZ 1, which is the `Zone` value by default. 
     * @return SlaveZone Information of replica AZ 1, which is the `Zone` value by default.
     */
    public String getSlaveZone() {
        return this.SlaveZone;
    }

    /**
     * Set Information of replica AZ 1, which is the `Zone` value by default.
     * @param SlaveZone Information of replica AZ 1, which is the `Zone` value by default.
     */
    public void setSlaveZone(String SlaveZone) {
        this.SlaveZone = SlaveZone;
    }

    /**
     * Get List of parameters in the format of ParamList.0.Name=auto_increment&ParamList.0.Value=1. You can use the [DescribeDefaultParams](https://intl.cloud.tencent.com/document/api/236/32662?from_cn_redirect=1) API to query the configurable parameters. 
     * @return ParamList List of parameters in the format of ParamList.0.Name=auto_increment&ParamList.0.Value=1. You can use the [DescribeDefaultParams](https://intl.cloud.tencent.com/document/api/236/32662?from_cn_redirect=1) API to query the configurable parameters.
     */
    public ParamInfo [] getParamList() {
        return this.ParamList;
    }

    /**
     * Set List of parameters in the format of ParamList.0.Name=auto_increment&ParamList.0.Value=1. You can use the [DescribeDefaultParams](https://intl.cloud.tencent.com/document/api/236/32662?from_cn_redirect=1) API to query the configurable parameters.
     * @param ParamList List of parameters in the format of ParamList.0.Name=auto_increment&ParamList.0.Value=1. You can use the [DescribeDefaultParams](https://intl.cloud.tencent.com/document/api/236/32662?from_cn_redirect=1) API to query the configurable parameters.
     */
    public void setParamList(ParamInfo [] ParamList) {
        this.ParamList = ParamList;
    }

    /**
     * Get Information of replica AZ 2, which is left empty by default. Specify this parameter when purchasing a source instance in the one-source-two-replica architecture. 
     * @return BackupZone Information of replica AZ 2, which is left empty by default. Specify this parameter when purchasing a source instance in the one-source-two-replica architecture.
     */
    public String getBackupZone() {
        return this.BackupZone;
    }

    /**
     * Set Information of replica AZ 2, which is left empty by default. Specify this parameter when purchasing a source instance in the one-source-two-replica architecture.
     * @param BackupZone Information of replica AZ 2, which is left empty by default. Specify this parameter when purchasing a source instance in the one-source-two-replica architecture.
     */
    public void setBackupZone(String BackupZone) {
        this.BackupZone = BackupZone;
    }

    /**
     * Get Auto-renewal flag. Valid values: `0` (auto-renewal not enabled), `1` (auto-renewal enabled). 
     * @return AutoRenewFlag Auto-renewal flag. Valid values: `0` (auto-renewal not enabled), `1` (auto-renewal enabled).
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Auto-renewal flag. Valid values: `0` (auto-renewal not enabled), `1` (auto-renewal enabled).
     * @param AutoRenewFlag Auto-renewal flag. Valid values: `0` (auto-renewal not enabled), `1` (auto-renewal enabled).
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get Region information of the source instance, which is required when purchasing a read-only or disaster recovery instance. 
     * @return MasterRegion Region information of the source instance, which is required when purchasing a read-only or disaster recovery instance.
     */
    public String getMasterRegion() {
        return this.MasterRegion;
    }

    /**
     * Set Region information of the source instance, which is required when purchasing a read-only or disaster recovery instance.
     * @param MasterRegion Region information of the source instance, which is required when purchasing a read-only or disaster recovery instance.
     */
    public void setMasterRegion(String MasterRegion) {
        this.MasterRegion = MasterRegion;
    }

    /**
     * Get Security group parameter. You can use the [DescribeProjectSecurityGroups](https://intl.cloud.tencent.com/document/api/236/15850?from_cn_redirect=1) API to query the security group details of a project. 
     * @return SecurityGroup Security group parameter. You can use the [DescribeProjectSecurityGroups](https://intl.cloud.tencent.com/document/api/236/15850?from_cn_redirect=1) API to query the security group details of a project.
     */
    public String [] getSecurityGroup() {
        return this.SecurityGroup;
    }

    /**
     * Set Security group parameter. You can use the [DescribeProjectSecurityGroups](https://intl.cloud.tencent.com/document/api/236/15850?from_cn_redirect=1) API to query the security group details of a project.
     * @param SecurityGroup Security group parameter. You can use the [DescribeProjectSecurityGroups](https://intl.cloud.tencent.com/document/api/236/15850?from_cn_redirect=1) API to query the security group details of a project.
     */
    public void setSecurityGroup(String [] SecurityGroup) {
        this.SecurityGroup = SecurityGroup;
    }

    /**
     * Get Read-only instance parameter. This parameter must be passed in when purchasing read-only instances. 
     * @return RoGroup Read-only instance parameter. This parameter must be passed in when purchasing read-only instances.
     */
    public RoGroup getRoGroup() {
        return this.RoGroup;
    }

    /**
     * Set Read-only instance parameter. This parameter must be passed in when purchasing read-only instances.
     * @param RoGroup Read-only instance parameter. This parameter must be passed in when purchasing read-only instances.
     */
    public void setRoGroup(RoGroup RoGroup) {
        this.RoGroup = RoGroup;
    }

    /**
     * Get Instance name. For multiple instances purchased at one time, they will be distinguished by the name suffix number, such as instnaceName=db and goodsNum=3, and their instance names are db1, db2, and db3, respectively. 
     * @return InstanceName Instance name. For multiple instances purchased at one time, they will be distinguished by the name suffix number, such as instnaceName=db and goodsNum=3, and their instance names are db1, db2, and db3, respectively.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name. For multiple instances purchased at one time, they will be distinguished by the name suffix number, such as instnaceName=db and goodsNum=3, and their instance names are db1, db2, and db3, respectively.
     * @param InstanceName Instance name. For multiple instances purchased at one time, they will be distinguished by the name suffix number, such as instnaceName=db and goodsNum=3, and their instance names are db1, db2, and db3, respectively.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Instance tag information 
     * @return ResourceTags Instance tag information
     */
    public TagInfo [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set Instance tag information
     * @param ResourceTags Instance tag information
     */
    public void setResourceTags(TagInfo [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get Placement group ID 
     * @return DeployGroupId Placement group ID
     */
    public String getDeployGroupId() {
        return this.DeployGroupId;
    }

    /**
     * Set Placement group ID
     * @param DeployGroupId Placement group ID
     */
    public void setDeployGroupId(String DeployGroupId) {
        this.DeployGroupId = DeployGroupId;
    }

    /**
     * Get A string unique in 48 hours, which is supplied by the client to ensure that the request is idempotent. Its maximum length is 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be guaranteed. 
     * @return ClientToken A string unique in 48 hours, which is supplied by the client to ensure that the request is idempotent. Its maximum length is 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be guaranteed.
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set A string unique in 48 hours, which is supplied by the client to ensure that the request is idempotent. Its maximum length is 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be guaranteed.
     * @param ClientToken A string unique in 48 hours, which is supplied by the client to ensure that the request is idempotent. Its maximum length is 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be guaranteed.
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get Instance isolation type. Valid values: `UNIVERSAL` (general instance), `EXCLUSIVE` (dedicated instance), `BASIC` (basic instance). Default value: `UNIVERSAL`. 
     * @return DeviceType Instance isolation type. Valid values: `UNIVERSAL` (general instance), `EXCLUSIVE` (dedicated instance), `BASIC` (basic instance). Default value: `UNIVERSAL`.
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set Instance isolation type. Valid values: `UNIVERSAL` (general instance), `EXCLUSIVE` (dedicated instance), `BASIC` (basic instance). Default value: `UNIVERSAL`.
     * @param DeviceType Instance isolation type. Valid values: `UNIVERSAL` (general instance), `EXCLUSIVE` (dedicated instance), `BASIC` (basic instance). Default value: `UNIVERSAL`.
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get Parameter template ID 
     * @return ParamTemplateId Parameter template ID
     */
    public Long getParamTemplateId() {
        return this.ParamTemplateId;
    }

    /**
     * Set Parameter template ID
     * @param ParamTemplateId Parameter template ID
     */
    public void setParamTemplateId(Long ParamTemplateId) {
        this.ParamTemplateId = ParamTemplateId;
    }

    /**
     * Get Array of alarm policy IDs, which is `OriginId` obtained through the `DescribeAlarmPolicy` API. 
     * @return AlarmPolicyList Array of alarm policy IDs, which is `OriginId` obtained through the `DescribeAlarmPolicy` API.
     */
    public Long [] getAlarmPolicyList() {
        return this.AlarmPolicyList;
    }

    /**
     * Set Array of alarm policy IDs, which is `OriginId` obtained through the `DescribeAlarmPolicy` API.
     * @param AlarmPolicyList Array of alarm policy IDs, which is `OriginId` obtained through the `DescribeAlarmPolicy` API.
     */
    public void setAlarmPolicyList(Long [] AlarmPolicyList) {
        this.AlarmPolicyList = AlarmPolicyList;
    }

    /**
     * Get The number of nodes of the instance. To purchase a read-only instance or a basic instance, set this parameter to `1` or leave it empty. To purchase a three-node instance, set this parameter to `3` or specify the `BackupZone` parameter. If the instance to be purchased is a source instance and both `BackupZone` and this parameter are left empty, the value `2` will be used, which indicates the source instance will have two nodes. 
     * @return InstanceNodes The number of nodes of the instance. To purchase a read-only instance or a basic instance, set this parameter to `1` or leave it empty. To purchase a three-node instance, set this parameter to `3` or specify the `BackupZone` parameter. If the instance to be purchased is a source instance and both `BackupZone` and this parameter are left empty, the value `2` will be used, which indicates the source instance will have two nodes.
     */
    public Long getInstanceNodes() {
        return this.InstanceNodes;
    }

    /**
     * Set The number of nodes of the instance. To purchase a read-only instance or a basic instance, set this parameter to `1` or leave it empty. To purchase a three-node instance, set this parameter to `3` or specify the `BackupZone` parameter. If the instance to be purchased is a source instance and both `BackupZone` and this parameter are left empty, the value `2` will be used, which indicates the source instance will have two nodes.
     * @param InstanceNodes The number of nodes of the instance. To purchase a read-only instance or a basic instance, set this parameter to `1` or leave it empty. To purchase a three-node instance, set this parameter to `3` or specify the `BackupZone` parameter. If the instance to be purchased is a source instance and both `BackupZone` and this parameter are left empty, the value `2` will be used, which indicates the source instance will have two nodes.
     */
    public void setInstanceNodes(Long InstanceNodes) {
        this.InstanceNodes = InstanceNodes;
    }

    /**
     * Get The number of the instance CPU cores. If this parameter is left empty, it will be subject to the `Memory` value. 
     * @return Cpu The number of the instance CPU cores. If this parameter is left empty, it will be subject to the `Memory` value.
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set The number of the instance CPU cores. If this parameter is left empty, it will be subject to the `Memory` value.
     * @param Cpu The number of the instance CPU cores. If this parameter is left empty, it will be subject to the `Memory` value.
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Whether to automatically start disaster recovery synchronization. This parameter takes effect only for disaster recovery instances. Valid values: `0` (no), `1` (yes). Default value: `0`. 
     * @return AutoSyncFlag Whether to automatically start disaster recovery synchronization. This parameter takes effect only for disaster recovery instances. Valid values: `0` (no), `1` (yes). Default value: `0`.
     */
    public Long getAutoSyncFlag() {
        return this.AutoSyncFlag;
    }

    /**
     * Set Whether to automatically start disaster recovery synchronization. This parameter takes effect only for disaster recovery instances. Valid values: `0` (no), `1` (yes). Default value: `0`.
     * @param AutoSyncFlag Whether to automatically start disaster recovery synchronization. This parameter takes effect only for disaster recovery instances. Valid values: `0` (no), `1` (yes). Default value: `0`.
     */
    public void setAutoSyncFlag(Long AutoSyncFlag) {
        this.AutoSyncFlag = AutoSyncFlag;
    }

    /**
     * Get Financial cage ID. 
     * @return CageId Financial cage ID.
     */
    public String getCageId() {
        return this.CageId;
    }

    /**
     * Set Financial cage ID.
     * @param CageId Financial cage ID.
     */
    public void setCageId(String CageId) {
        this.CageId = CageId;
    }

    /**
     * Get Type of the default parameter template. Valid values: `HIGH_STABILITY` (high-stability template), `HIGH_PERFORMANCE` (high-performance template). 
     * @return ParamTemplateType Type of the default parameter template. Valid values: `HIGH_STABILITY` (high-stability template), `HIGH_PERFORMANCE` (high-performance template).
     */
    public String getParamTemplateType() {
        return this.ParamTemplateType;
    }

    /**
     * Set Type of the default parameter template. Valid values: `HIGH_STABILITY` (high-stability template), `HIGH_PERFORMANCE` (high-performance template).
     * @param ParamTemplateType Type of the default parameter template. Valid values: `HIGH_STABILITY` (high-stability template), `HIGH_PERFORMANCE` (high-performance template).
     */
    public void setParamTemplateType(String ParamTemplateType) {
        this.ParamTemplateType = ParamTemplateType;
    }

    /**
     * Get The array of alarm policy names, such as ["policy-uyoee9wg"]. If the `AlarmPolicyList` parameter is specified, this parameter is invalid. 
     * @return AlarmPolicyIdList The array of alarm policy names, such as ["policy-uyoee9wg"]. If the `AlarmPolicyList` parameter is specified, this parameter is invalid.
     */
    public String [] getAlarmPolicyIdList() {
        return this.AlarmPolicyIdList;
    }

    /**
     * Set The array of alarm policy names, such as ["policy-uyoee9wg"]. If the `AlarmPolicyList` parameter is specified, this parameter is invalid.
     * @param AlarmPolicyIdList The array of alarm policy names, such as ["policy-uyoee9wg"]. If the `AlarmPolicyList` parameter is specified, this parameter is invalid.
     */
    public void setAlarmPolicyIdList(String [] AlarmPolicyIdList) {
        this.AlarmPolicyIdList = AlarmPolicyIdList;
    }

    /**
     * Get Whether to check the request without creating any instance. Valid values: `true`, `false` (default). After being submitted, the request will be checked to see if it is in correct format and has all required parameters with valid values. An error code is returned if the check failed, and `RequestId` is returned if the check succeeded. After a successful check, no instance will be created if this parameter is set to `true`, whereas an instance will be created and if it is set to `false`. 
     * @return DryRun Whether to check the request without creating any instance. Valid values: `true`, `false` (default). After being submitted, the request will be checked to see if it is in correct format and has all required parameters with valid values. An error code is returned if the check failed, and `RequestId` is returned if the check succeeded. After a successful check, no instance will be created if this parameter is set to `true`, whereas an instance will be created and if it is set to `false`.
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set Whether to check the request without creating any instance. Valid values: `true`, `false` (default). After being submitted, the request will be checked to see if it is in correct format and has all required parameters with valid values. An error code is returned if the check failed, and `RequestId` is returned if the check succeeded. After a successful check, no instance will be created if this parameter is set to `true`, whereas an instance will be created and if it is set to `false`.
     * @param DryRun Whether to check the request without creating any instance. Valid values: `true`, `false` (default). After being submitted, the request will be checked to see if it is in correct format and has all required parameters with valid values. An error code is returned if the check failed, and `RequestId` is returned if the check succeeded. After a successful check, no instance will be created if this parameter is set to `true`, whereas an instance will be created and if it is set to `false`.
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    /**
     * Get Instance engine type. Valid values: `InnoDB` (default), `RocksDB`. 
     * @return EngineType Instance engine type. Valid values: `InnoDB` (default), `RocksDB`.
     */
    public String getEngineType() {
        return this.EngineType;
    }

    /**
     * Set Instance engine type. Valid values: `InnoDB` (default), `RocksDB`.
     * @param EngineType Instance engine type. Valid values: `InnoDB` (default), `RocksDB`.
     */
    public void setEngineType(String EngineType) {
        this.EngineType = EngineType;
    }

    /**
     * Get The list of IPs for sources instances. Only one IP address can be assigned to a single source instance. If all IPs are used up, the system will automatically assign IPs to the remaining source instances that do not have one. 
     * @return Vips The list of IPs for sources instances. Only one IP address can be assigned to a single source instance. If all IPs are used up, the system will automatically assign IPs to the remaining source instances that do not have one.
     */
    public String [] getVips() {
        return this.Vips;
    }

    /**
     * Set The list of IPs for sources instances. Only one IP address can be assigned to a single source instance. If all IPs are used up, the system will automatically assign IPs to the remaining source instances that do not have one.
     * @param Vips The list of IPs for sources instances. Only one IP address can be assigned to a single source instance. If all IPs are used up, the system will automatically assign IPs to the remaining source instances that do not have one.
     */
    public void setVips(String [] Vips) {
        this.Vips = Vips;
    }

    public CreateDBInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDBInstanceRequest(CreateDBInstanceRequest source) {
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Volume != null) {
            this.Volume = new Long(source.Volume);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.GoodsNum != null) {
            this.GoodsNum = new Long(source.GoodsNum);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.InstanceRole != null) {
            this.InstanceRole = new String(source.InstanceRole);
        }
        if (source.MasterInstanceId != null) {
            this.MasterInstanceId = new String(source.MasterInstanceId);
        }
        if (source.EngineVersion != null) {
            this.EngineVersion = new String(source.EngineVersion);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.ProtectMode != null) {
            this.ProtectMode = new Long(source.ProtectMode);
        }
        if (source.DeployMode != null) {
            this.DeployMode = new Long(source.DeployMode);
        }
        if (source.SlaveZone != null) {
            this.SlaveZone = new String(source.SlaveZone);
        }
        if (source.ParamList != null) {
            this.ParamList = new ParamInfo[source.ParamList.length];
            for (int i = 0; i < source.ParamList.length; i++) {
                this.ParamList[i] = new ParamInfo(source.ParamList[i]);
            }
        }
        if (source.BackupZone != null) {
            this.BackupZone = new String(source.BackupZone);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.MasterRegion != null) {
            this.MasterRegion = new String(source.MasterRegion);
        }
        if (source.SecurityGroup != null) {
            this.SecurityGroup = new String[source.SecurityGroup.length];
            for (int i = 0; i < source.SecurityGroup.length; i++) {
                this.SecurityGroup[i] = new String(source.SecurityGroup[i]);
            }
        }
        if (source.RoGroup != null) {
            this.RoGroup = new RoGroup(source.RoGroup);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new TagInfo[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new TagInfo(source.ResourceTags[i]);
            }
        }
        if (source.DeployGroupId != null) {
            this.DeployGroupId = new String(source.DeployGroupId);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.ParamTemplateId != null) {
            this.ParamTemplateId = new Long(source.ParamTemplateId);
        }
        if (source.AlarmPolicyList != null) {
            this.AlarmPolicyList = new Long[source.AlarmPolicyList.length];
            for (int i = 0; i < source.AlarmPolicyList.length; i++) {
                this.AlarmPolicyList[i] = new Long(source.AlarmPolicyList[i]);
            }
        }
        if (source.InstanceNodes != null) {
            this.InstanceNodes = new Long(source.InstanceNodes);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.AutoSyncFlag != null) {
            this.AutoSyncFlag = new Long(source.AutoSyncFlag);
        }
        if (source.CageId != null) {
            this.CageId = new String(source.CageId);
        }
        if (source.ParamTemplateType != null) {
            this.ParamTemplateType = new String(source.ParamTemplateType);
        }
        if (source.AlarmPolicyIdList != null) {
            this.AlarmPolicyIdList = new String[source.AlarmPolicyIdList.length];
            for (int i = 0; i < source.AlarmPolicyIdList.length; i++) {
                this.AlarmPolicyIdList[i] = new String(source.AlarmPolicyIdList[i]);
            }
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
        if (source.EngineType != null) {
            this.EngineType = new String(source.EngineType);
        }
        if (source.Vips != null) {
            this.Vips = new String[source.Vips.length];
            for (int i = 0; i < source.Vips.length; i++) {
                this.Vips[i] = new String(source.Vips[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "InstanceRole", this.InstanceRole);
        this.setParamSimple(map, prefix + "MasterInstanceId", this.MasterInstanceId);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "ProtectMode", this.ProtectMode);
        this.setParamSimple(map, prefix + "DeployMode", this.DeployMode);
        this.setParamSimple(map, prefix + "SlaveZone", this.SlaveZone);
        this.setParamArrayObj(map, prefix + "ParamList.", this.ParamList);
        this.setParamSimple(map, prefix + "BackupZone", this.BackupZone);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "MasterRegion", this.MasterRegion);
        this.setParamArraySimple(map, prefix + "SecurityGroup.", this.SecurityGroup);
        this.setParamObj(map, prefix + "RoGroup.", this.RoGroup);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "DeployGroupId", this.DeployGroupId);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "ParamTemplateId", this.ParamTemplateId);
        this.setParamArraySimple(map, prefix + "AlarmPolicyList.", this.AlarmPolicyList);
        this.setParamSimple(map, prefix + "InstanceNodes", this.InstanceNodes);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "AutoSyncFlag", this.AutoSyncFlag);
        this.setParamSimple(map, prefix + "CageId", this.CageId);
        this.setParamSimple(map, prefix + "ParamTemplateType", this.ParamTemplateType);
        this.setParamArraySimple(map, prefix + "AlarmPolicyIdList.", this.AlarmPolicyIdList);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);
        this.setParamSimple(map, prefix + "EngineType", this.EngineType);
        this.setParamArraySimple(map, prefix + "Vips.", this.Vips);

    }
}


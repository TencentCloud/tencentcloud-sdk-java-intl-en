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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInstanceRequest extends AbstractModel{

    /**
    * Availability Zone
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Instance version ("5.6.4", "6.4.3", "6.8.2", or "7.5.1")
    */
    @SerializedName("EsVersion")
    @Expose
    private String EsVersion;

    /**
    * VPC ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Subnet ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Access password, which must contain 8 to 16 characters, and include at least two of the following three types of characters: [a-z,A-Z], [0-9] and [-!@#$%&^*+=_:;,.?]
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Instance name, which can contain 1 to 50 English letters, Chinese characters, digits, dashes (-), or underscores (_)
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * This parameter has been disused. Please use `NodeInfoList`
Number of nodes (2-50)
    */
    @SerializedName("NodeNum")
    @Expose
    private Long NodeNum;

    /**
    * Billing mode <li>POSTPAID_BY_HOUR: Pay-as-you-go hourly </li>Default value: POSTPAID_BY_HOUR
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * This parameter is not used on the global website
    */
    @SerializedName("ChargePeriod")
    @Expose
    private Long ChargePeriod;

    /**
    * This parameter is not used on the global website
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * This parameter has been disused. Please use `NodeInfoList`
Node specification <li>ES.S1.SMALL2: 1-core 2 GB </li><li>ES.S1.MEDIUM4: 2-core 4 GB </li><li>ES.S1.MEDIUM8: 2-core 8 GB </li><li>ES.S1.LARGE16: 4-core 16 GB </li><li>ES.S1.2XLARGE32: 8-core 32 GB </li><li>ES.S1.4XLARGE32: 16-core 32 GB </li><li>ES.S1.4XLARGE64: 16-core 64 GB </li>
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * This parameter has been disused. Please use `NodeInfoList`
Node storage type <li>CLOUD_SSD: SSD cloud storage </li><li>CLOUD_PREMIUM: premium cloud storage </li>Default value: CLOUD_SSD
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * This parameter has been disused. Please use `NodeInfoList`
Node disk size in GB
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * This parameter is not used on the global website
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * Whether to automatically use vouchers <li>0: No </li><li>1: Yes </li>Default value: 0
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * List of voucher IDs (only one voucher can be specified at a time currently)
    */
    @SerializedName("VoucherIds")
    @Expose
    private String [] VoucherIds;

    /**
    * This parameter has been disused. Please use `NodeInfoList`
Whether to create a dedicated primary node <li>true: yes </li><li>false: no </li>Default value: false
    */
    @SerializedName("EnableDedicatedMaster")
    @Expose
    private Boolean EnableDedicatedMaster;

    /**
    * This parameter has been disused. Please use `NodeInfoList`
Number of dedicated primary nodes (only 3 and 5 are supported. This value must be passed in if `EnableDedicatedMaster` is `true`)
    */
    @SerializedName("MasterNodeNum")
    @Expose
    private Long MasterNodeNum;

    /**
    * This parameter has been disused. Please use `NodeInfoList`
Dedicated primary node type, which must be passed in if `EnableDedicatedMaster` is `true` <li>ES.S1.SMALL2: 1-core 2 GB</li><li>ES.S1.MEDIUM4: 2-core 4 GB</li><li>ES.S1.MEDIUM8: 2-core 8 GB</li><li>ES.S1.LARGE16: 4-core 16 GB</li><li>ES.S1.2XLARGE32: 8-core 32 GB</li><li>ES.S1.4XLARGE32: 16-core 32 GB</li><li>ES.S1.4XLARGE64: 16-core 64 GB</li>
    */
    @SerializedName("MasterNodeType")
    @Expose
    private String MasterNodeType;

    /**
    * This parameter has been disused. Please use `NodeInfoList`
Dedicated primary node disk size in GB, which is optional. If passed in, it can only be 50 and cannot be customized currently
    */
    @SerializedName("MasterNodeDiskSize")
    @Expose
    private Long MasterNodeDiskSize;

    /**
    * ClusterName in the cluster configuration file, which is the instance ID by default and currently cannot be customized
    */
    @SerializedName("ClusterNameInConf")
    @Expose
    private String ClusterNameInConf;

    /**
    * Cluster deployment mode <li>0: single-AZ deployment </li><li>1: multi-AZ deployment </li>Default value: 0
    */
    @SerializedName("DeployMode")
    @Expose
    private Long DeployMode;

    /**
    * Details of AZs in multi-AZ deployment mode (which is required when DeployMode is 1)
    */
    @SerializedName("MultiZoneInfo")
    @Expose
    private ZoneDetail [] MultiZoneInfo;

    /**
    * License type <li>oss: Open Source Edition </li><li>basic: Basic Edition </li><li>platinum: Platinum Edition </li>Default value: Platinum
    */
    @SerializedName("LicenseType")
    @Expose
    private String LicenseType;

    /**
    * Node information list, which is used to describe the specification information of various types of nodes in the cluster, such as node type, node quantity, node specification, disk type, and disk size
    */
    @SerializedName("NodeInfoList")
    @Expose
    private NodeInfo [] NodeInfoList;

    /**
    * Node tag information list
    */
    @SerializedName("TagList")
    @Expose
    private TagInfo [] TagList;

    /**
    * Whether to enable X-Pack security authentication in Basic Edition 6.8 (and above) <li>1: disabled </li><li>2: enabled</li>
    */
    @SerializedName("BasicSecurityType")
    @Expose
    private Long BasicSecurityType;

    /**
     * Get Availability Zone 
     * @return Zone Availability Zone
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Availability Zone
     * @param Zone Availability Zone
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Instance version ("5.6.4", "6.4.3", "6.8.2", or "7.5.1") 
     * @return EsVersion Instance version ("5.6.4", "6.4.3", "6.8.2", or "7.5.1")
     */
    public String getEsVersion() {
        return this.EsVersion;
    }

    /**
     * Set Instance version ("5.6.4", "6.4.3", "6.8.2", or "7.5.1")
     * @param EsVersion Instance version ("5.6.4", "6.4.3", "6.8.2", or "7.5.1")
     */
    public void setEsVersion(String EsVersion) {
        this.EsVersion = EsVersion;
    }

    /**
     * Get VPC ID 
     * @return VpcId VPC ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID
     * @param VpcId VPC ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet ID 
     * @return SubnetId Subnet ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID
     * @param SubnetId Subnet ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Access password, which must contain 8 to 16 characters, and include at least two of the following three types of characters: [a-z,A-Z], [0-9] and [-!@#$%&^*+=_:;,.?] 
     * @return Password Access password, which must contain 8 to 16 characters, and include at least two of the following three types of characters: [a-z,A-Z], [0-9] and [-!@#$%&^*+=_:;,.?]
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Access password, which must contain 8 to 16 characters, and include at least two of the following three types of characters: [a-z,A-Z], [0-9] and [-!@#$%&^*+=_:;,.?]
     * @param Password Access password, which must contain 8 to 16 characters, and include at least two of the following three types of characters: [a-z,A-Z], [0-9] and [-!@#$%&^*+=_:;,.?]
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get Instance name, which can contain 1 to 50 English letters, Chinese characters, digits, dashes (-), or underscores (_) 
     * @return InstanceName Instance name, which can contain 1 to 50 English letters, Chinese characters, digits, dashes (-), or underscores (_)
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name, which can contain 1 to 50 English letters, Chinese characters, digits, dashes (-), or underscores (_)
     * @param InstanceName Instance name, which can contain 1 to 50 English letters, Chinese characters, digits, dashes (-), or underscores (_)
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get This parameter has been disused. Please use `NodeInfoList`
Number of nodes (2-50) 
     * @return NodeNum This parameter has been disused. Please use `NodeInfoList`
Number of nodes (2-50)
     */
    public Long getNodeNum() {
        return this.NodeNum;
    }

    /**
     * Set This parameter has been disused. Please use `NodeInfoList`
Number of nodes (2-50)
     * @param NodeNum This parameter has been disused. Please use `NodeInfoList`
Number of nodes (2-50)
     */
    public void setNodeNum(Long NodeNum) {
        this.NodeNum = NodeNum;
    }

    /**
     * Get Billing mode <li>POSTPAID_BY_HOUR: Pay-as-you-go hourly </li>Default value: POSTPAID_BY_HOUR 
     * @return ChargeType Billing mode <li>POSTPAID_BY_HOUR: Pay-as-you-go hourly </li>Default value: POSTPAID_BY_HOUR
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set Billing mode <li>POSTPAID_BY_HOUR: Pay-as-you-go hourly </li>Default value: POSTPAID_BY_HOUR
     * @param ChargeType Billing mode <li>POSTPAID_BY_HOUR: Pay-as-you-go hourly </li>Default value: POSTPAID_BY_HOUR
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get This parameter is not used on the global website 
     * @return ChargePeriod This parameter is not used on the global website
     */
    public Long getChargePeriod() {
        return this.ChargePeriod;
    }

    /**
     * Set This parameter is not used on the global website
     * @param ChargePeriod This parameter is not used on the global website
     */
    public void setChargePeriod(Long ChargePeriod) {
        this.ChargePeriod = ChargePeriod;
    }

    /**
     * Get This parameter is not used on the global website 
     * @return RenewFlag This parameter is not used on the global website
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set This parameter is not used on the global website
     * @param RenewFlag This parameter is not used on the global website
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get This parameter has been disused. Please use `NodeInfoList`
Node specification <li>ES.S1.SMALL2: 1-core 2 GB </li><li>ES.S1.MEDIUM4: 2-core 4 GB </li><li>ES.S1.MEDIUM8: 2-core 8 GB </li><li>ES.S1.LARGE16: 4-core 16 GB </li><li>ES.S1.2XLARGE32: 8-core 32 GB </li><li>ES.S1.4XLARGE32: 16-core 32 GB </li><li>ES.S1.4XLARGE64: 16-core 64 GB </li> 
     * @return NodeType This parameter has been disused. Please use `NodeInfoList`
Node specification <li>ES.S1.SMALL2: 1-core 2 GB </li><li>ES.S1.MEDIUM4: 2-core 4 GB </li><li>ES.S1.MEDIUM8: 2-core 8 GB </li><li>ES.S1.LARGE16: 4-core 16 GB </li><li>ES.S1.2XLARGE32: 8-core 32 GB </li><li>ES.S1.4XLARGE32: 16-core 32 GB </li><li>ES.S1.4XLARGE64: 16-core 64 GB </li>
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set This parameter has been disused. Please use `NodeInfoList`
Node specification <li>ES.S1.SMALL2: 1-core 2 GB </li><li>ES.S1.MEDIUM4: 2-core 4 GB </li><li>ES.S1.MEDIUM8: 2-core 8 GB </li><li>ES.S1.LARGE16: 4-core 16 GB </li><li>ES.S1.2XLARGE32: 8-core 32 GB </li><li>ES.S1.4XLARGE32: 16-core 32 GB </li><li>ES.S1.4XLARGE64: 16-core 64 GB </li>
     * @param NodeType This parameter has been disused. Please use `NodeInfoList`
Node specification <li>ES.S1.SMALL2: 1-core 2 GB </li><li>ES.S1.MEDIUM4: 2-core 4 GB </li><li>ES.S1.MEDIUM8: 2-core 8 GB </li><li>ES.S1.LARGE16: 4-core 16 GB </li><li>ES.S1.2XLARGE32: 8-core 32 GB </li><li>ES.S1.4XLARGE32: 16-core 32 GB </li><li>ES.S1.4XLARGE64: 16-core 64 GB </li>
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get This parameter has been disused. Please use `NodeInfoList`
Node storage type <li>CLOUD_SSD: SSD cloud storage </li><li>CLOUD_PREMIUM: premium cloud storage </li>Default value: CLOUD_SSD 
     * @return DiskType This parameter has been disused. Please use `NodeInfoList`
Node storage type <li>CLOUD_SSD: SSD cloud storage </li><li>CLOUD_PREMIUM: premium cloud storage </li>Default value: CLOUD_SSD
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set This parameter has been disused. Please use `NodeInfoList`
Node storage type <li>CLOUD_SSD: SSD cloud storage </li><li>CLOUD_PREMIUM: premium cloud storage </li>Default value: CLOUD_SSD
     * @param DiskType This parameter has been disused. Please use `NodeInfoList`
Node storage type <li>CLOUD_SSD: SSD cloud storage </li><li>CLOUD_PREMIUM: premium cloud storage </li>Default value: CLOUD_SSD
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get This parameter has been disused. Please use `NodeInfoList`
Node disk size in GB 
     * @return DiskSize This parameter has been disused. Please use `NodeInfoList`
Node disk size in GB
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set This parameter has been disused. Please use `NodeInfoList`
Node disk size in GB
     * @param DiskSize This parameter has been disused. Please use `NodeInfoList`
Node disk size in GB
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get This parameter is not used on the global website 
     * @return TimeUnit This parameter is not used on the global website
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set This parameter is not used on the global website
     * @param TimeUnit This parameter is not used on the global website
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get Whether to automatically use vouchers <li>0: No </li><li>1: Yes </li>Default value: 0 
     * @return AutoVoucher Whether to automatically use vouchers <li>0: No </li><li>1: Yes </li>Default value: 0
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set Whether to automatically use vouchers <li>0: No </li><li>1: Yes </li>Default value: 0
     * @param AutoVoucher Whether to automatically use vouchers <li>0: No </li><li>1: Yes </li>Default value: 0
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get List of voucher IDs (only one voucher can be specified at a time currently) 
     * @return VoucherIds List of voucher IDs (only one voucher can be specified at a time currently)
     */
    public String [] getVoucherIds() {
        return this.VoucherIds;
    }

    /**
     * Set List of voucher IDs (only one voucher can be specified at a time currently)
     * @param VoucherIds List of voucher IDs (only one voucher can be specified at a time currently)
     */
    public void setVoucherIds(String [] VoucherIds) {
        this.VoucherIds = VoucherIds;
    }

    /**
     * Get This parameter has been disused. Please use `NodeInfoList`
Whether to create a dedicated primary node <li>true: yes </li><li>false: no </li>Default value: false 
     * @return EnableDedicatedMaster This parameter has been disused. Please use `NodeInfoList`
Whether to create a dedicated primary node <li>true: yes </li><li>false: no </li>Default value: false
     */
    public Boolean getEnableDedicatedMaster() {
        return this.EnableDedicatedMaster;
    }

    /**
     * Set This parameter has been disused. Please use `NodeInfoList`
Whether to create a dedicated primary node <li>true: yes </li><li>false: no </li>Default value: false
     * @param EnableDedicatedMaster This parameter has been disused. Please use `NodeInfoList`
Whether to create a dedicated primary node <li>true: yes </li><li>false: no </li>Default value: false
     */
    public void setEnableDedicatedMaster(Boolean EnableDedicatedMaster) {
        this.EnableDedicatedMaster = EnableDedicatedMaster;
    }

    /**
     * Get This parameter has been disused. Please use `NodeInfoList`
Number of dedicated primary nodes (only 3 and 5 are supported. This value must be passed in if `EnableDedicatedMaster` is `true`) 
     * @return MasterNodeNum This parameter has been disused. Please use `NodeInfoList`
Number of dedicated primary nodes (only 3 and 5 are supported. This value must be passed in if `EnableDedicatedMaster` is `true`)
     */
    public Long getMasterNodeNum() {
        return this.MasterNodeNum;
    }

    /**
     * Set This parameter has been disused. Please use `NodeInfoList`
Number of dedicated primary nodes (only 3 and 5 are supported. This value must be passed in if `EnableDedicatedMaster` is `true`)
     * @param MasterNodeNum This parameter has been disused. Please use `NodeInfoList`
Number of dedicated primary nodes (only 3 and 5 are supported. This value must be passed in if `EnableDedicatedMaster` is `true`)
     */
    public void setMasterNodeNum(Long MasterNodeNum) {
        this.MasterNodeNum = MasterNodeNum;
    }

    /**
     * Get This parameter has been disused. Please use `NodeInfoList`
Dedicated primary node type, which must be passed in if `EnableDedicatedMaster` is `true` <li>ES.S1.SMALL2: 1-core 2 GB</li><li>ES.S1.MEDIUM4: 2-core 4 GB</li><li>ES.S1.MEDIUM8: 2-core 8 GB</li><li>ES.S1.LARGE16: 4-core 16 GB</li><li>ES.S1.2XLARGE32: 8-core 32 GB</li><li>ES.S1.4XLARGE32: 16-core 32 GB</li><li>ES.S1.4XLARGE64: 16-core 64 GB</li> 
     * @return MasterNodeType This parameter has been disused. Please use `NodeInfoList`
Dedicated primary node type, which must be passed in if `EnableDedicatedMaster` is `true` <li>ES.S1.SMALL2: 1-core 2 GB</li><li>ES.S1.MEDIUM4: 2-core 4 GB</li><li>ES.S1.MEDIUM8: 2-core 8 GB</li><li>ES.S1.LARGE16: 4-core 16 GB</li><li>ES.S1.2XLARGE32: 8-core 32 GB</li><li>ES.S1.4XLARGE32: 16-core 32 GB</li><li>ES.S1.4XLARGE64: 16-core 64 GB</li>
     */
    public String getMasterNodeType() {
        return this.MasterNodeType;
    }

    /**
     * Set This parameter has been disused. Please use `NodeInfoList`
Dedicated primary node type, which must be passed in if `EnableDedicatedMaster` is `true` <li>ES.S1.SMALL2: 1-core 2 GB</li><li>ES.S1.MEDIUM4: 2-core 4 GB</li><li>ES.S1.MEDIUM8: 2-core 8 GB</li><li>ES.S1.LARGE16: 4-core 16 GB</li><li>ES.S1.2XLARGE32: 8-core 32 GB</li><li>ES.S1.4XLARGE32: 16-core 32 GB</li><li>ES.S1.4XLARGE64: 16-core 64 GB</li>
     * @param MasterNodeType This parameter has been disused. Please use `NodeInfoList`
Dedicated primary node type, which must be passed in if `EnableDedicatedMaster` is `true` <li>ES.S1.SMALL2: 1-core 2 GB</li><li>ES.S1.MEDIUM4: 2-core 4 GB</li><li>ES.S1.MEDIUM8: 2-core 8 GB</li><li>ES.S1.LARGE16: 4-core 16 GB</li><li>ES.S1.2XLARGE32: 8-core 32 GB</li><li>ES.S1.4XLARGE32: 16-core 32 GB</li><li>ES.S1.4XLARGE64: 16-core 64 GB</li>
     */
    public void setMasterNodeType(String MasterNodeType) {
        this.MasterNodeType = MasterNodeType;
    }

    /**
     * Get This parameter has been disused. Please use `NodeInfoList`
Dedicated primary node disk size in GB, which is optional. If passed in, it can only be 50 and cannot be customized currently 
     * @return MasterNodeDiskSize This parameter has been disused. Please use `NodeInfoList`
Dedicated primary node disk size in GB, which is optional. If passed in, it can only be 50 and cannot be customized currently
     */
    public Long getMasterNodeDiskSize() {
        return this.MasterNodeDiskSize;
    }

    /**
     * Set This parameter has been disused. Please use `NodeInfoList`
Dedicated primary node disk size in GB, which is optional. If passed in, it can only be 50 and cannot be customized currently
     * @param MasterNodeDiskSize This parameter has been disused. Please use `NodeInfoList`
Dedicated primary node disk size in GB, which is optional. If passed in, it can only be 50 and cannot be customized currently
     */
    public void setMasterNodeDiskSize(Long MasterNodeDiskSize) {
        this.MasterNodeDiskSize = MasterNodeDiskSize;
    }

    /**
     * Get ClusterName in the cluster configuration file, which is the instance ID by default and currently cannot be customized 
     * @return ClusterNameInConf ClusterName in the cluster configuration file, which is the instance ID by default and currently cannot be customized
     */
    public String getClusterNameInConf() {
        return this.ClusterNameInConf;
    }

    /**
     * Set ClusterName in the cluster configuration file, which is the instance ID by default and currently cannot be customized
     * @param ClusterNameInConf ClusterName in the cluster configuration file, which is the instance ID by default and currently cannot be customized
     */
    public void setClusterNameInConf(String ClusterNameInConf) {
        this.ClusterNameInConf = ClusterNameInConf;
    }

    /**
     * Get Cluster deployment mode <li>0: single-AZ deployment </li><li>1: multi-AZ deployment </li>Default value: 0 
     * @return DeployMode Cluster deployment mode <li>0: single-AZ deployment </li><li>1: multi-AZ deployment </li>Default value: 0
     */
    public Long getDeployMode() {
        return this.DeployMode;
    }

    /**
     * Set Cluster deployment mode <li>0: single-AZ deployment </li><li>1: multi-AZ deployment </li>Default value: 0
     * @param DeployMode Cluster deployment mode <li>0: single-AZ deployment </li><li>1: multi-AZ deployment </li>Default value: 0
     */
    public void setDeployMode(Long DeployMode) {
        this.DeployMode = DeployMode;
    }

    /**
     * Get Details of AZs in multi-AZ deployment mode (which is required when DeployMode is 1) 
     * @return MultiZoneInfo Details of AZs in multi-AZ deployment mode (which is required when DeployMode is 1)
     */
    public ZoneDetail [] getMultiZoneInfo() {
        return this.MultiZoneInfo;
    }

    /**
     * Set Details of AZs in multi-AZ deployment mode (which is required when DeployMode is 1)
     * @param MultiZoneInfo Details of AZs in multi-AZ deployment mode (which is required when DeployMode is 1)
     */
    public void setMultiZoneInfo(ZoneDetail [] MultiZoneInfo) {
        this.MultiZoneInfo = MultiZoneInfo;
    }

    /**
     * Get License type <li>oss: Open Source Edition </li><li>basic: Basic Edition </li><li>platinum: Platinum Edition </li>Default value: Platinum 
     * @return LicenseType License type <li>oss: Open Source Edition </li><li>basic: Basic Edition </li><li>platinum: Platinum Edition </li>Default value: Platinum
     */
    public String getLicenseType() {
        return this.LicenseType;
    }

    /**
     * Set License type <li>oss: Open Source Edition </li><li>basic: Basic Edition </li><li>platinum: Platinum Edition </li>Default value: Platinum
     * @param LicenseType License type <li>oss: Open Source Edition </li><li>basic: Basic Edition </li><li>platinum: Platinum Edition </li>Default value: Platinum
     */
    public void setLicenseType(String LicenseType) {
        this.LicenseType = LicenseType;
    }

    /**
     * Get Node information list, which is used to describe the specification information of various types of nodes in the cluster, such as node type, node quantity, node specification, disk type, and disk size 
     * @return NodeInfoList Node information list, which is used to describe the specification information of various types of nodes in the cluster, such as node type, node quantity, node specification, disk type, and disk size
     */
    public NodeInfo [] getNodeInfoList() {
        return this.NodeInfoList;
    }

    /**
     * Set Node information list, which is used to describe the specification information of various types of nodes in the cluster, such as node type, node quantity, node specification, disk type, and disk size
     * @param NodeInfoList Node information list, which is used to describe the specification information of various types of nodes in the cluster, such as node type, node quantity, node specification, disk type, and disk size
     */
    public void setNodeInfoList(NodeInfo [] NodeInfoList) {
        this.NodeInfoList = NodeInfoList;
    }

    /**
     * Get Node tag information list 
     * @return TagList Node tag information list
     */
    public TagInfo [] getTagList() {
        return this.TagList;
    }

    /**
     * Set Node tag information list
     * @param TagList Node tag information list
     */
    public void setTagList(TagInfo [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get Whether to enable X-Pack security authentication in Basic Edition 6.8 (and above) <li>1: disabled </li><li>2: enabled</li> 
     * @return BasicSecurityType Whether to enable X-Pack security authentication in Basic Edition 6.8 (and above) <li>1: disabled </li><li>2: enabled</li>
     */
    public Long getBasicSecurityType() {
        return this.BasicSecurityType;
    }

    /**
     * Set Whether to enable X-Pack security authentication in Basic Edition 6.8 (and above) <li>1: disabled </li><li>2: enabled</li>
     * @param BasicSecurityType Whether to enable X-Pack security authentication in Basic Edition 6.8 (and above) <li>1: disabled </li><li>2: enabled</li>
     */
    public void setBasicSecurityType(Long BasicSecurityType) {
        this.BasicSecurityType = BasicSecurityType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "EsVersion", this.EsVersion);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "NodeNum", this.NodeNum);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "ChargePeriod", this.ChargePeriod);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamArraySimple(map, prefix + "VoucherIds.", this.VoucherIds);
        this.setParamSimple(map, prefix + "EnableDedicatedMaster", this.EnableDedicatedMaster);
        this.setParamSimple(map, prefix + "MasterNodeNum", this.MasterNodeNum);
        this.setParamSimple(map, prefix + "MasterNodeType", this.MasterNodeType);
        this.setParamSimple(map, prefix + "MasterNodeDiskSize", this.MasterNodeDiskSize);
        this.setParamSimple(map, prefix + "ClusterNameInConf", this.ClusterNameInConf);
        this.setParamSimple(map, prefix + "DeployMode", this.DeployMode);
        this.setParamArrayObj(map, prefix + "MultiZoneInfo.", this.MultiZoneInfo);
        this.setParamSimple(map, prefix + "LicenseType", this.LicenseType);
        this.setParamArrayObj(map, prefix + "NodeInfoList.", this.NodeInfoList);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);
        this.setParamSimple(map, prefix + "BasicSecurityType", this.BasicSecurityType);

    }
}


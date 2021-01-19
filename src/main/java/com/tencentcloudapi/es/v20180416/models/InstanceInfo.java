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

public class InstanceInfo extends AbstractModel{

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Availability Zone
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * User ID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * User UIN
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * UID of the VPC where the instance resides
    */
    @SerializedName("VpcUid")
    @Expose
    private String VpcUid;

    /**
    * UID of the subnet where the instance resides
    */
    @SerializedName("SubnetUid")
    @Expose
    private String SubnetUid;

    /**
    * Instance status. 0: processing; 1: normal; -1: stopped; -2: terminating; -3: terminated
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Instance billing method. Valid values: POSTPAID_BY_HOUR (pay-as-you-go hourly); CDHPAID (billed based on CDH, i.e., only CDH is billed but not the instances on CDH)
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
    * Node specification <li>ES.S1.SMALL2: 1-core 2 GB </li><li>ES.S1.MEDIUM4: 2-core 4 GB </li><li>ES.S1.MEDIUM8: 2-core 8 GB </li><li>ES.S1.LARGE16: 4-core 16 GB </li><li>ES.S1.2XLARGE32: 8-core 32 GB </li><li>ES.S1.4XLARGE32: 16-core 32 GB </li><li>ES.S1.4XLARGE64: 16-core 64 GB </li>
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * Number of nodes
    */
    @SerializedName("NodeNum")
    @Expose
    private Long NodeNum;

    /**
    * Number of CPU cores of the node
    */
    @SerializedName("CpuNum")
    @Expose
    private Long CpuNum;

    /**
    * Node memory size in GB
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * Node disk type
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * Node disk size in GB
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * ES domain name
    */
    @SerializedName("EsDomain")
    @Expose
    private String EsDomain;

    /**
    * ES VIP
    */
    @SerializedName("EsVip")
    @Expose
    private String EsVip;

    /**
    * ES port
    */
    @SerializedName("EsPort")
    @Expose
    private Long EsPort;

    /**
    * Kibana access URL
    */
    @SerializedName("KibanaUrl")
    @Expose
    private String KibanaUrl;

    /**
    * ES version number
    */
    @SerializedName("EsVersion")
    @Expose
    private String EsVersion;

    /**
    * ES configuration item
    */
    @SerializedName("EsConfig")
    @Expose
    private String EsConfig;

    /**
    * Kibana access control configuration
    */
    @SerializedName("EsAcl")
    @Expose
    private EsAcl EsAcl;

    /**
    * Instance creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last modified time of the instance
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * This parameter is not used on the global website
    */
    @SerializedName("Deadline")
    @Expose
    private String Deadline;

    /**
    * Instance type (instance type identifier, which can be only 1 or 2 currently)
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * IK analyzer configuration
    */
    @SerializedName("IkConfig")
    @Expose
    private EsDictionaryInfo IkConfig;

    /**
    * Dedicated primary node configuration
    */
    @SerializedName("MasterNodeInfo")
    @Expose
    private MasterNodeInfo MasterNodeInfo;

    /**
    * Auto-backup to COS configuration
    */
    @SerializedName("CosBackup")
    @Expose
    private CosBackup CosBackup;

    /**
    * Whether to allow auto-backup to COS
    */
    @SerializedName("AllowCosBackup")
    @Expose
    private Boolean AllowCosBackup;

    /**
    * List of tags owned by the instance
    */
    @SerializedName("TagList")
    @Expose
    private TagInfo [] TagList;

    /**
    * License type <li>oss: Open Source Edition </li><li>basic: Basic Edition </li><li>platinum: Platinum Edition </li>Default value: Platinum
    */
    @SerializedName("LicenseType")
    @Expose
    private String LicenseType;

    /**
    * Whether it is a hot/warm cluster <li>true: yes </li><li>false: no</li>
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EnableHotWarmMode")
    @Expose
    private Boolean EnableHotWarmMode;

    /**
    * Warm node specification <li>ES.S1.SMALL2: 1-core 2 GB </li><li>ES.S1.MEDIUM4: 2-core 4 GB </li><li>ES.S1.MEDIUM8: 2-core 8 GB </li><li>ES.S1.LARGE16: 4-core 16 GB </li><li>ES.S1.2XLARGE32: 8-core 32 GB </li><li>ES.S1.4XLARGE32: 16-core 32 GB </li><li>ES.S1.4XLARGE64: 16-core 64 GB </li>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WarmNodeType")
    @Expose
    private String WarmNodeType;

    /**
    * Number of warm nodes
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WarmNodeNum")
    @Expose
    private Long WarmNodeNum;

    /**
    * Number of warm node CPU cores
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WarmCpuNum")
    @Expose
    private Long WarmCpuNum;

    /**
    * Warm node memory size in GB
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WarmMemSize")
    @Expose
    private Long WarmMemSize;

    /**
    * Warm node disk type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WarmDiskType")
    @Expose
    private String WarmDiskType;

    /**
    * Warm node disk size in GB
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WarmDiskSize")
    @Expose
    private Long WarmDiskSize;

    /**
    * Cluster node information list
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NodeInfoList")
    @Expose
    private NodeInfo [] NodeInfoList;

    /**
    * ES public IP address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EsPublicUrl")
    @Expose
    private String EsPublicUrl;

    /**
    * Multi-AZ network information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MultiZoneInfo")
    @Expose
    private ZoneDetail [] MultiZoneInfo;

    /**
    * Deployment mode <li>0: single-AZ </li><li>1: multi-AZ</li>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DeployMode")
    @Expose
    private Long DeployMode;

    /**
    * ES public access status <li>OPEN: enabled </li><li>CLOSE: disabled
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PublicAccess")
    @Expose
    private String PublicAccess;

    /**
    * ES public access control configuration
    */
    @SerializedName("EsPublicAcl")
    @Expose
    private EsAcl EsPublicAcl;

    /**
    * Kibana private IP address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("KibanaPrivateUrl")
    @Expose
    private String KibanaPrivateUrl;

    /**
    * Kibana public access status <li>OPEN: enabled </li><li>CLOSE: disabled
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("KibanaPublicAccess")
    @Expose
    private String KibanaPublicAccess;

    /**
    * Kibana private access status <li>OPEN: enabled </li><li>CLOSE: disabled
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("KibanaPrivateAccess")
    @Expose
    private String KibanaPrivateAccess;

    /**
    * Whether to enable X-Pack security authentication in Basic Edition 6.8 (and above) <li>1: disabled </li><li>2: enabled</li>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SecurityType")
    @Expose
    private Long SecurityType;

    /**
    * Scenario template type. 0: not enabled; 1: general scenario; 2: log scenario; 3: search scenario
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SceneType")
    @Expose
    private Long SceneType;

    /**
    * Kibana configuration item.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("KibanaConfig")
    @Expose
    private String KibanaConfig;

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
     * @return InstanceName Instance name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name
     * @param InstanceName Instance name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Region 
     * @return Region Region
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region
     * @param Region Region
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

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
     * Get User ID 
     * @return AppId User ID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set User ID
     * @param AppId User ID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get User UIN 
     * @return Uin User UIN
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set User UIN
     * @param Uin User UIN
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get UID of the VPC where the instance resides 
     * @return VpcUid UID of the VPC where the instance resides
     */
    public String getVpcUid() {
        return this.VpcUid;
    }

    /**
     * Set UID of the VPC where the instance resides
     * @param VpcUid UID of the VPC where the instance resides
     */
    public void setVpcUid(String VpcUid) {
        this.VpcUid = VpcUid;
    }

    /**
     * Get UID of the subnet where the instance resides 
     * @return SubnetUid UID of the subnet where the instance resides
     */
    public String getSubnetUid() {
        return this.SubnetUid;
    }

    /**
     * Set UID of the subnet where the instance resides
     * @param SubnetUid UID of the subnet where the instance resides
     */
    public void setSubnetUid(String SubnetUid) {
        this.SubnetUid = SubnetUid;
    }

    /**
     * Get Instance status. 0: processing; 1: normal; -1: stopped; -2: terminating; -3: terminated 
     * @return Status Instance status. 0: processing; 1: normal; -1: stopped; -2: terminating; -3: terminated
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Instance status. 0: processing; 1: normal; -1: stopped; -2: terminating; -3: terminated
     * @param Status Instance status. 0: processing; 1: normal; -1: stopped; -2: terminating; -3: terminated
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Instance billing method. Valid values: POSTPAID_BY_HOUR (pay-as-you-go hourly); CDHPAID (billed based on CDH, i.e., only CDH is billed but not the instances on CDH) 
     * @return ChargeType Instance billing method. Valid values: POSTPAID_BY_HOUR (pay-as-you-go hourly); CDHPAID (billed based on CDH, i.e., only CDH is billed but not the instances on CDH)
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set Instance billing method. Valid values: POSTPAID_BY_HOUR (pay-as-you-go hourly); CDHPAID (billed based on CDH, i.e., only CDH is billed but not the instances on CDH)
     * @param ChargeType Instance billing method. Valid values: POSTPAID_BY_HOUR (pay-as-you-go hourly); CDHPAID (billed based on CDH, i.e., only CDH is billed but not the instances on CDH)
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
     * Get Node specification <li>ES.S1.SMALL2: 1-core 2 GB </li><li>ES.S1.MEDIUM4: 2-core 4 GB </li><li>ES.S1.MEDIUM8: 2-core 8 GB </li><li>ES.S1.LARGE16: 4-core 16 GB </li><li>ES.S1.2XLARGE32: 8-core 32 GB </li><li>ES.S1.4XLARGE32: 16-core 32 GB </li><li>ES.S1.4XLARGE64: 16-core 64 GB </li> 
     * @return NodeType Node specification <li>ES.S1.SMALL2: 1-core 2 GB </li><li>ES.S1.MEDIUM4: 2-core 4 GB </li><li>ES.S1.MEDIUM8: 2-core 8 GB </li><li>ES.S1.LARGE16: 4-core 16 GB </li><li>ES.S1.2XLARGE32: 8-core 32 GB </li><li>ES.S1.4XLARGE32: 16-core 32 GB </li><li>ES.S1.4XLARGE64: 16-core 64 GB </li>
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set Node specification <li>ES.S1.SMALL2: 1-core 2 GB </li><li>ES.S1.MEDIUM4: 2-core 4 GB </li><li>ES.S1.MEDIUM8: 2-core 8 GB </li><li>ES.S1.LARGE16: 4-core 16 GB </li><li>ES.S1.2XLARGE32: 8-core 32 GB </li><li>ES.S1.4XLARGE32: 16-core 32 GB </li><li>ES.S1.4XLARGE64: 16-core 64 GB </li>
     * @param NodeType Node specification <li>ES.S1.SMALL2: 1-core 2 GB </li><li>ES.S1.MEDIUM4: 2-core 4 GB </li><li>ES.S1.MEDIUM8: 2-core 8 GB </li><li>ES.S1.LARGE16: 4-core 16 GB </li><li>ES.S1.2XLARGE32: 8-core 32 GB </li><li>ES.S1.4XLARGE32: 16-core 32 GB </li><li>ES.S1.4XLARGE64: 16-core 64 GB </li>
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get Number of nodes 
     * @return NodeNum Number of nodes
     */
    public Long getNodeNum() {
        return this.NodeNum;
    }

    /**
     * Set Number of nodes
     * @param NodeNum Number of nodes
     */
    public void setNodeNum(Long NodeNum) {
        this.NodeNum = NodeNum;
    }

    /**
     * Get Number of CPU cores of the node 
     * @return CpuNum Number of CPU cores of the node
     */
    public Long getCpuNum() {
        return this.CpuNum;
    }

    /**
     * Set Number of CPU cores of the node
     * @param CpuNum Number of CPU cores of the node
     */
    public void setCpuNum(Long CpuNum) {
        this.CpuNum = CpuNum;
    }

    /**
     * Get Node memory size in GB 
     * @return MemSize Node memory size in GB
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set Node memory size in GB
     * @param MemSize Node memory size in GB
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get Node disk type 
     * @return DiskType Node disk type
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set Node disk type
     * @param DiskType Node disk type
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get Node disk size in GB 
     * @return DiskSize Node disk size in GB
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Node disk size in GB
     * @param DiskSize Node disk size in GB
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get ES domain name 
     * @return EsDomain ES domain name
     */
    public String getEsDomain() {
        return this.EsDomain;
    }

    /**
     * Set ES domain name
     * @param EsDomain ES domain name
     */
    public void setEsDomain(String EsDomain) {
        this.EsDomain = EsDomain;
    }

    /**
     * Get ES VIP 
     * @return EsVip ES VIP
     */
    public String getEsVip() {
        return this.EsVip;
    }

    /**
     * Set ES VIP
     * @param EsVip ES VIP
     */
    public void setEsVip(String EsVip) {
        this.EsVip = EsVip;
    }

    /**
     * Get ES port 
     * @return EsPort ES port
     */
    public Long getEsPort() {
        return this.EsPort;
    }

    /**
     * Set ES port
     * @param EsPort ES port
     */
    public void setEsPort(Long EsPort) {
        this.EsPort = EsPort;
    }

    /**
     * Get Kibana access URL 
     * @return KibanaUrl Kibana access URL
     */
    public String getKibanaUrl() {
        return this.KibanaUrl;
    }

    /**
     * Set Kibana access URL
     * @param KibanaUrl Kibana access URL
     */
    public void setKibanaUrl(String KibanaUrl) {
        this.KibanaUrl = KibanaUrl;
    }

    /**
     * Get ES version number 
     * @return EsVersion ES version number
     */
    public String getEsVersion() {
        return this.EsVersion;
    }

    /**
     * Set ES version number
     * @param EsVersion ES version number
     */
    public void setEsVersion(String EsVersion) {
        this.EsVersion = EsVersion;
    }

    /**
     * Get ES configuration item 
     * @return EsConfig ES configuration item
     */
    public String getEsConfig() {
        return this.EsConfig;
    }

    /**
     * Set ES configuration item
     * @param EsConfig ES configuration item
     */
    public void setEsConfig(String EsConfig) {
        this.EsConfig = EsConfig;
    }

    /**
     * Get Kibana access control configuration 
     * @return EsAcl Kibana access control configuration
     */
    public EsAcl getEsAcl() {
        return this.EsAcl;
    }

    /**
     * Set Kibana access control configuration
     * @param EsAcl Kibana access control configuration
     */
    public void setEsAcl(EsAcl EsAcl) {
        this.EsAcl = EsAcl;
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
     * Get Last modified time of the instance 
     * @return UpdateTime Last modified time of the instance
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last modified time of the instance
     * @param UpdateTime Last modified time of the instance
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get This parameter is not used on the global website 
     * @return Deadline This parameter is not used on the global website
     */
    public String getDeadline() {
        return this.Deadline;
    }

    /**
     * Set This parameter is not used on the global website
     * @param Deadline This parameter is not used on the global website
     */
    public void setDeadline(String Deadline) {
        this.Deadline = Deadline;
    }

    /**
     * Get Instance type (instance type identifier, which can be only 1 or 2 currently) 
     * @return InstanceType Instance type (instance type identifier, which can be only 1 or 2 currently)
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance type (instance type identifier, which can be only 1 or 2 currently)
     * @param InstanceType Instance type (instance type identifier, which can be only 1 or 2 currently)
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get IK analyzer configuration 
     * @return IkConfig IK analyzer configuration
     */
    public EsDictionaryInfo getIkConfig() {
        return this.IkConfig;
    }

    /**
     * Set IK analyzer configuration
     * @param IkConfig IK analyzer configuration
     */
    public void setIkConfig(EsDictionaryInfo IkConfig) {
        this.IkConfig = IkConfig;
    }

    /**
     * Get Dedicated primary node configuration 
     * @return MasterNodeInfo Dedicated primary node configuration
     */
    public MasterNodeInfo getMasterNodeInfo() {
        return this.MasterNodeInfo;
    }

    /**
     * Set Dedicated primary node configuration
     * @param MasterNodeInfo Dedicated primary node configuration
     */
    public void setMasterNodeInfo(MasterNodeInfo MasterNodeInfo) {
        this.MasterNodeInfo = MasterNodeInfo;
    }

    /**
     * Get Auto-backup to COS configuration 
     * @return CosBackup Auto-backup to COS configuration
     */
    public CosBackup getCosBackup() {
        return this.CosBackup;
    }

    /**
     * Set Auto-backup to COS configuration
     * @param CosBackup Auto-backup to COS configuration
     */
    public void setCosBackup(CosBackup CosBackup) {
        this.CosBackup = CosBackup;
    }

    /**
     * Get Whether to allow auto-backup to COS 
     * @return AllowCosBackup Whether to allow auto-backup to COS
     */
    public Boolean getAllowCosBackup() {
        return this.AllowCosBackup;
    }

    /**
     * Set Whether to allow auto-backup to COS
     * @param AllowCosBackup Whether to allow auto-backup to COS
     */
    public void setAllowCosBackup(Boolean AllowCosBackup) {
        this.AllowCosBackup = AllowCosBackup;
    }

    /**
     * Get List of tags owned by the instance 
     * @return TagList List of tags owned by the instance
     */
    public TagInfo [] getTagList() {
        return this.TagList;
    }

    /**
     * Set List of tags owned by the instance
     * @param TagList List of tags owned by the instance
     */
    public void setTagList(TagInfo [] TagList) {
        this.TagList = TagList;
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
     * Get Whether it is a hot/warm cluster <li>true: yes </li><li>false: no</li>
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return EnableHotWarmMode Whether it is a hot/warm cluster <li>true: yes </li><li>false: no</li>
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getEnableHotWarmMode() {
        return this.EnableHotWarmMode;
    }

    /**
     * Set Whether it is a hot/warm cluster <li>true: yes </li><li>false: no</li>
Note: this field may return null, indicating that no valid values can be obtained.
     * @param EnableHotWarmMode Whether it is a hot/warm cluster <li>true: yes </li><li>false: no</li>
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setEnableHotWarmMode(Boolean EnableHotWarmMode) {
        this.EnableHotWarmMode = EnableHotWarmMode;
    }

    /**
     * Get Warm node specification <li>ES.S1.SMALL2: 1-core 2 GB </li><li>ES.S1.MEDIUM4: 2-core 4 GB </li><li>ES.S1.MEDIUM8: 2-core 8 GB </li><li>ES.S1.LARGE16: 4-core 16 GB </li><li>ES.S1.2XLARGE32: 8-core 32 GB </li><li>ES.S1.4XLARGE32: 16-core 32 GB </li><li>ES.S1.4XLARGE64: 16-core 64 GB </li>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WarmNodeType Warm node specification <li>ES.S1.SMALL2: 1-core 2 GB </li><li>ES.S1.MEDIUM4: 2-core 4 GB </li><li>ES.S1.MEDIUM8: 2-core 8 GB </li><li>ES.S1.LARGE16: 4-core 16 GB </li><li>ES.S1.2XLARGE32: 8-core 32 GB </li><li>ES.S1.4XLARGE32: 16-core 32 GB </li><li>ES.S1.4XLARGE64: 16-core 64 GB </li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getWarmNodeType() {
        return this.WarmNodeType;
    }

    /**
     * Set Warm node specification <li>ES.S1.SMALL2: 1-core 2 GB </li><li>ES.S1.MEDIUM4: 2-core 4 GB </li><li>ES.S1.MEDIUM8: 2-core 8 GB </li><li>ES.S1.LARGE16: 4-core 16 GB </li><li>ES.S1.2XLARGE32: 8-core 32 GB </li><li>ES.S1.4XLARGE32: 16-core 32 GB </li><li>ES.S1.4XLARGE64: 16-core 64 GB </li>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WarmNodeType Warm node specification <li>ES.S1.SMALL2: 1-core 2 GB </li><li>ES.S1.MEDIUM4: 2-core 4 GB </li><li>ES.S1.MEDIUM8: 2-core 8 GB </li><li>ES.S1.LARGE16: 4-core 16 GB </li><li>ES.S1.2XLARGE32: 8-core 32 GB </li><li>ES.S1.4XLARGE32: 16-core 32 GB </li><li>ES.S1.4XLARGE64: 16-core 64 GB </li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWarmNodeType(String WarmNodeType) {
        this.WarmNodeType = WarmNodeType;
    }

    /**
     * Get Number of warm nodes
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WarmNodeNum Number of warm nodes
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getWarmNodeNum() {
        return this.WarmNodeNum;
    }

    /**
     * Set Number of warm nodes
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WarmNodeNum Number of warm nodes
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWarmNodeNum(Long WarmNodeNum) {
        this.WarmNodeNum = WarmNodeNum;
    }

    /**
     * Get Number of warm node CPU cores
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WarmCpuNum Number of warm node CPU cores
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getWarmCpuNum() {
        return this.WarmCpuNum;
    }

    /**
     * Set Number of warm node CPU cores
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WarmCpuNum Number of warm node CPU cores
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWarmCpuNum(Long WarmCpuNum) {
        this.WarmCpuNum = WarmCpuNum;
    }

    /**
     * Get Warm node memory size in GB
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WarmMemSize Warm node memory size in GB
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getWarmMemSize() {
        return this.WarmMemSize;
    }

    /**
     * Set Warm node memory size in GB
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WarmMemSize Warm node memory size in GB
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWarmMemSize(Long WarmMemSize) {
        this.WarmMemSize = WarmMemSize;
    }

    /**
     * Get Warm node disk type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WarmDiskType Warm node disk type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getWarmDiskType() {
        return this.WarmDiskType;
    }

    /**
     * Set Warm node disk type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WarmDiskType Warm node disk type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWarmDiskType(String WarmDiskType) {
        this.WarmDiskType = WarmDiskType;
    }

    /**
     * Get Warm node disk size in GB
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WarmDiskSize Warm node disk size in GB
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getWarmDiskSize() {
        return this.WarmDiskSize;
    }

    /**
     * Set Warm node disk size in GB
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WarmDiskSize Warm node disk size in GB
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWarmDiskSize(Long WarmDiskSize) {
        this.WarmDiskSize = WarmDiskSize;
    }

    /**
     * Get Cluster node information list
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NodeInfoList Cluster node information list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public NodeInfo [] getNodeInfoList() {
        return this.NodeInfoList;
    }

    /**
     * Set Cluster node information list
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NodeInfoList Cluster node information list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNodeInfoList(NodeInfo [] NodeInfoList) {
        this.NodeInfoList = NodeInfoList;
    }

    /**
     * Get ES public IP address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EsPublicUrl ES public IP address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEsPublicUrl() {
        return this.EsPublicUrl;
    }

    /**
     * Set ES public IP address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EsPublicUrl ES public IP address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEsPublicUrl(String EsPublicUrl) {
        this.EsPublicUrl = EsPublicUrl;
    }

    /**
     * Get Multi-AZ network information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MultiZoneInfo Multi-AZ network information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ZoneDetail [] getMultiZoneInfo() {
        return this.MultiZoneInfo;
    }

    /**
     * Set Multi-AZ network information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MultiZoneInfo Multi-AZ network information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMultiZoneInfo(ZoneDetail [] MultiZoneInfo) {
        this.MultiZoneInfo = MultiZoneInfo;
    }

    /**
     * Get Deployment mode <li>0: single-AZ </li><li>1: multi-AZ</li>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DeployMode Deployment mode <li>0: single-AZ </li><li>1: multi-AZ</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDeployMode() {
        return this.DeployMode;
    }

    /**
     * Set Deployment mode <li>0: single-AZ </li><li>1: multi-AZ</li>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DeployMode Deployment mode <li>0: single-AZ </li><li>1: multi-AZ</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDeployMode(Long DeployMode) {
        this.DeployMode = DeployMode;
    }

    /**
     * Get ES public access status <li>OPEN: enabled </li><li>CLOSE: disabled
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PublicAccess ES public access status <li>OPEN: enabled </li><li>CLOSE: disabled
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPublicAccess() {
        return this.PublicAccess;
    }

    /**
     * Set ES public access status <li>OPEN: enabled </li><li>CLOSE: disabled
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PublicAccess ES public access status <li>OPEN: enabled </li><li>CLOSE: disabled
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPublicAccess(String PublicAccess) {
        this.PublicAccess = PublicAccess;
    }

    /**
     * Get ES public access control configuration 
     * @return EsPublicAcl ES public access control configuration
     */
    public EsAcl getEsPublicAcl() {
        return this.EsPublicAcl;
    }

    /**
     * Set ES public access control configuration
     * @param EsPublicAcl ES public access control configuration
     */
    public void setEsPublicAcl(EsAcl EsPublicAcl) {
        this.EsPublicAcl = EsPublicAcl;
    }

    /**
     * Get Kibana private IP address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return KibanaPrivateUrl Kibana private IP address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getKibanaPrivateUrl() {
        return this.KibanaPrivateUrl;
    }

    /**
     * Set Kibana private IP address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param KibanaPrivateUrl Kibana private IP address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setKibanaPrivateUrl(String KibanaPrivateUrl) {
        this.KibanaPrivateUrl = KibanaPrivateUrl;
    }

    /**
     * Get Kibana public access status <li>OPEN: enabled </li><li>CLOSE: disabled
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return KibanaPublicAccess Kibana public access status <li>OPEN: enabled </li><li>CLOSE: disabled
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getKibanaPublicAccess() {
        return this.KibanaPublicAccess;
    }

    /**
     * Set Kibana public access status <li>OPEN: enabled </li><li>CLOSE: disabled
Note: This field may return null, indicating that no valid values can be obtained.
     * @param KibanaPublicAccess Kibana public access status <li>OPEN: enabled </li><li>CLOSE: disabled
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setKibanaPublicAccess(String KibanaPublicAccess) {
        this.KibanaPublicAccess = KibanaPublicAccess;
    }

    /**
     * Get Kibana private access status <li>OPEN: enabled </li><li>CLOSE: disabled
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return KibanaPrivateAccess Kibana private access status <li>OPEN: enabled </li><li>CLOSE: disabled
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getKibanaPrivateAccess() {
        return this.KibanaPrivateAccess;
    }

    /**
     * Set Kibana private access status <li>OPEN: enabled </li><li>CLOSE: disabled
Note: This field may return null, indicating that no valid values can be obtained.
     * @param KibanaPrivateAccess Kibana private access status <li>OPEN: enabled </li><li>CLOSE: disabled
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setKibanaPrivateAccess(String KibanaPrivateAccess) {
        this.KibanaPrivateAccess = KibanaPrivateAccess;
    }

    /**
     * Get Whether to enable X-Pack security authentication in Basic Edition 6.8 (and above) <li>1: disabled </li><li>2: enabled</li>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SecurityType Whether to enable X-Pack security authentication in Basic Edition 6.8 (and above) <li>1: disabled </li><li>2: enabled</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSecurityType() {
        return this.SecurityType;
    }

    /**
     * Set Whether to enable X-Pack security authentication in Basic Edition 6.8 (and above) <li>1: disabled </li><li>2: enabled</li>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SecurityType Whether to enable X-Pack security authentication in Basic Edition 6.8 (and above) <li>1: disabled </li><li>2: enabled</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSecurityType(Long SecurityType) {
        this.SecurityType = SecurityType;
    }

    /**
     * Get Scenario template type. 0: not enabled; 1: general scenario; 2: log scenario; 3: search scenario
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SceneType Scenario template type. 0: not enabled; 1: general scenario; 2: log scenario; 3: search scenario
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getSceneType() {
        return this.SceneType;
    }

    /**
     * Set Scenario template type. 0: not enabled; 1: general scenario; 2: log scenario; 3: search scenario
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SceneType Scenario template type. 0: not enabled; 1: general scenario; 2: log scenario; 3: search scenario
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSceneType(Long SceneType) {
        this.SceneType = SceneType;
    }

    /**
     * Get Kibana configuration item.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return KibanaConfig Kibana configuration item.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getKibanaConfig() {
        return this.KibanaConfig;
    }

    /**
     * Set Kibana configuration item.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param KibanaConfig Kibana configuration item.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setKibanaConfig(String KibanaConfig) {
        this.KibanaConfig = KibanaConfig;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "VpcUid", this.VpcUid);
        this.setParamSimple(map, prefix + "SubnetUid", this.SubnetUid);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "ChargePeriod", this.ChargePeriod);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "NodeNum", this.NodeNum);
        this.setParamSimple(map, prefix + "CpuNum", this.CpuNum);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "EsDomain", this.EsDomain);
        this.setParamSimple(map, prefix + "EsVip", this.EsVip);
        this.setParamSimple(map, prefix + "EsPort", this.EsPort);
        this.setParamSimple(map, prefix + "KibanaUrl", this.KibanaUrl);
        this.setParamSimple(map, prefix + "EsVersion", this.EsVersion);
        this.setParamSimple(map, prefix + "EsConfig", this.EsConfig);
        this.setParamObj(map, prefix + "EsAcl.", this.EsAcl);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Deadline", this.Deadline);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamObj(map, prefix + "IkConfig.", this.IkConfig);
        this.setParamObj(map, prefix + "MasterNodeInfo.", this.MasterNodeInfo);
        this.setParamObj(map, prefix + "CosBackup.", this.CosBackup);
        this.setParamSimple(map, prefix + "AllowCosBackup", this.AllowCosBackup);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);
        this.setParamSimple(map, prefix + "LicenseType", this.LicenseType);
        this.setParamSimple(map, prefix + "EnableHotWarmMode", this.EnableHotWarmMode);
        this.setParamSimple(map, prefix + "WarmNodeType", this.WarmNodeType);
        this.setParamSimple(map, prefix + "WarmNodeNum", this.WarmNodeNum);
        this.setParamSimple(map, prefix + "WarmCpuNum", this.WarmCpuNum);
        this.setParamSimple(map, prefix + "WarmMemSize", this.WarmMemSize);
        this.setParamSimple(map, prefix + "WarmDiskType", this.WarmDiskType);
        this.setParamSimple(map, prefix + "WarmDiskSize", this.WarmDiskSize);
        this.setParamArrayObj(map, prefix + "NodeInfoList.", this.NodeInfoList);
        this.setParamSimple(map, prefix + "EsPublicUrl", this.EsPublicUrl);
        this.setParamArrayObj(map, prefix + "MultiZoneInfo.", this.MultiZoneInfo);
        this.setParamSimple(map, prefix + "DeployMode", this.DeployMode);
        this.setParamSimple(map, prefix + "PublicAccess", this.PublicAccess);
        this.setParamObj(map, prefix + "EsPublicAcl.", this.EsPublicAcl);
        this.setParamSimple(map, prefix + "KibanaPrivateUrl", this.KibanaPrivateUrl);
        this.setParamSimple(map, prefix + "KibanaPublicAccess", this.KibanaPublicAccess);
        this.setParamSimple(map, prefix + "KibanaPrivateAccess", this.KibanaPrivateAccess);
        this.setParamSimple(map, prefix + "SecurityType", this.SecurityType);
        this.setParamSimple(map, prefix + "SceneType", this.SceneType);
        this.setParamSimple(map, prefix + "KibanaConfig", this.KibanaConfig);

    }
}


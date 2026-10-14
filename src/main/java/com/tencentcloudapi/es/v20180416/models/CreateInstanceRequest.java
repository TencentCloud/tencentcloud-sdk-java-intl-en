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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInstanceRequest extends AbstractModel {

    /**
    * <p>AZ.</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>Instance version (supported: "5.6.4", "6.4.3", "6.8.2", "7.5.1", "7.10.1")</p>
    */
    @SerializedName("EsVersion")
    @Expose
    private String EsVersion;

    /**
    * <p>VPC ID</p>
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
    * <p>Access password (8-16 characters, including at least two of the following: [a-z,A-Z], [0-9], and special characters in [-!@#$%&amp;^*+=_:;,.?])</p>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>Instance name (1-50 English letters, Chinese characters, digits, hyphens -, or underscores _)</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>Abandoned. Please use NodeInfoList<br>Node quantity (2-50)</p>
    */
    @SerializedName("NodeNum")
    @Expose
    private Long NodeNum;

    /**
    * <p>Billing type<li>PREPAID: prepaid, i.e., monthly subscription</li><li>POSTPAID_BY_HOUR: pay-as-you-go by hour</li>Default value: POSTPAID_BY_HOUR</p>
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * <p>Annual and monthly subscription duration (unit determined by the TimeUnit parameter)</p>
    */
    @SerializedName("ChargePeriod")
    @Expose
    private Long ChargePeriod;

    /**
    * <p>Auto-renewal flag<li>RENEW_FLAG_AUTO: auto renewal</li><li>RENEW_FLAG_MANUAL: no auto-renewal, user renews manually</li>This needs to be set when ChargeType is PREPAID. If this parameter is not passed, no automatic renewal by default for general users, and auto renewal for SVIP users</p>
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * <p>Abandoned. Please use NodeInfoList<br>Node specification<li>ES.S1.SMALL2: 1-core 2G</li><li>ES.S1.MEDIUM4: 2-core 4G</li><li>ES.S1.MEDIUM8: 2-core 8G</li><li>ES.S1.LARGE16: 4-core 16G</li><li>ES.S1.2XLARGE32: 8-core 32G</li><li>ES.S1.4XLARGE32: 16-core 32G</li><li>ES.S1.4XLARGE64: 16-core 64G</li></p>
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * <p>Abandoned. Please use NodeInfoList<br>Node disk type<li>CLOUD_SSD: ssd cloud disk</li><li>CLOUD_PREMIUM: high-performance cloud block storage</li><li>CLOUD_HSSD: enhanced SSD cloud disk</li><li>CLOUD_BSSD: universal type SSD cloud disk</li>Default value: CLOUD_SSD</p>
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * <p>Abandoned. Please use NodeInfoList<br>Node disk capacity (unit: GB)</p>
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * <p>Billing duration unit (needs to be set when ChargeType is PREPAID. Default value: "m", which means month. Currently only support "m")</p>
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * <p>Indicates whether to use vouchers automatically<li>0: Do not use automatically.</li><li>1: Use automatically.</li>Default value: 0.</p>
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * <p>Voucher ID list. Only one voucher can be specified.</p>
    */
    @SerializedName("VoucherIds")
    @Expose
    private String [] VoucherIds;

    /**
    * <p>Abandoned. Please use NodeInfoList<br>Whether to create a dedicated master node<li>true: enable a dedicated master node</li><li>false: disable a dedicated master node</li>Default value: false</p>
    */
    @SerializedName("EnableDedicatedMaster")
    @Expose
    private Boolean EnableDedicatedMaster;

    /**
    * <p>Abandoned. Please use NodeInfoList<br>Number of dedicated primary nodes (supports only 3 or 5. Required if EnableDedicatedMaster is true)</p>
    */
    @SerializedName("MasterNodeNum")
    @Expose
    private Long MasterNodeNum;

    /**
    * <p>Abandoned. Please use NodeInfoList<br>Dedicated primary node type (required if EnableDedicatedMaster is true)<li>ES.S1.SMALL2: 1-core 2G</li><li>ES.S1.MEDIUM4: 2-core 4G</li><li>ES.S1.MEDIUM8: 2-core 8G</li><li>ES.S1.LARGE16: 4-core 16G</li><li>ES.S1.2XLARGE32: 8-core 32G</li><li>ES.S1.4XLARGE32: 16-core 32G</li><li>ES.S1.4XLARGE64: 16-core 64G</li></p>
    */
    @SerializedName("MasterNodeType")
    @Expose
    private String MasterNodeType;

    /**
    * <p>Abandoned. Please use NodeInfoList<br>Dedicated primary node disk size (in GB, optional; if transmitted, it must be 50. Customization is not supported temporarily)</p>
    */
    @SerializedName("MasterNodeDiskSize")
    @Expose
    private Long MasterNodeDiskSize;

    /**
    * <p>ClusterName in the cluster configuration file (system default configuration is the instance ID, customization is not supported temporarily)</p>
    */
    @SerializedName("ClusterNameInConf")
    @Expose
    private String ClusterNameInConf;

    /**
    * <p>Cluster deployment method<li>0: single-AZ deployment</li><li>1: multi-AZ deployment, Beijing, Shanghai, Shanghai Finance, Guangzhou, Nanjing, Hong Kong, Singapore, Frankfurt (allowlist control)</li>Default value: 0</p>
    */
    @SerializedName("DeployMode")
    @Expose
    private Long DeployMode;

    /**
    * <p>Detailed information of availability zones in multi-AZ deployment (required when DeployMode is 1)</p>
    */
    @SerializedName("MultiZoneInfo")
    @Expose
    private ZoneDetail [] MultiZoneInfo;

    /**
    * <p>License type<li>oss: open source edition</li><li>basic: basic version</li><li>platinum: platinum version</li>Default value: platinum</p>
    */
    @SerializedName("LicenseType")
    @Expose
    private String LicenseType;

    /**
    * <p>Node information list, for description of the specification information of various types of nodes in the cluster, such as node type, number of nodes, node specification, disk type, and disk size</p>
    */
    @SerializedName("NodeInfoList")
    @Expose
    private NodeInfo [] NodeInfoList;

    /**
    * <p>Node tag information list</p>
    */
    @SerializedName("TagList")
    @Expose
    private TagInfo [] TagList;

    /**
    * <p>Whether xpack security authentication is enabled for basic version 6.8 (and above versions)<li>1: not enabled</li><li>2: enabled</li></p>
    */
    @SerializedName("BasicSecurityType")
    @Expose
    private Long BasicSecurityType;

    /**
    * <p>Scenario template type 0: disabled 1: common 2: log 3: search</p>
    */
    @SerializedName("SceneType")
    @Expose
    private Long SceneType;

    /**
    * <p>Visualize node configuration</p>
    */
    @SerializedName("WebNodeTypeInfo")
    @Expose
    private WebNodeTypeInfo WebNodeTypeInfo;

    /**
    * <p>Create an https cluster. http is selected by default.</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>Maintenance time slot</p>
    */
    @SerializedName("OperationDuration")
    @Expose
    private OperationDuration OperationDuration;

    /**
    * <p>Whether storage-compute separation is enabled</p>
    */
    @SerializedName("EnableHybridStorage")
    @Expose
    private Boolean EnableHybridStorage;

    /**
    * <p>Additional hard disk performance</p>
    */
    @SerializedName("DiskEnhance")
    @Expose
    private Long DiskEnhance;

    /**
    * <p>Whether intelligent check is enabled</p>
    */
    @SerializedName("EnableDiagnose")
    @Expose
    private Boolean EnableDiagnose;

    /**
    * <p>Whether to enable automatic backup</p>
    */
    @SerializedName("EnableCosBackup")
    @Expose
    private Boolean EnableCosBackup;

    /**
    * <p>cdcId, pass it when using a CDC subnet</p>
    */
    @SerializedName("CdcId")
    @Expose
    private String CdcId;

    /**
    * <p>Placement group affinity. Value range: [0,10]. 0 indicates disabled.</p>
    */
    @SerializedName("DisasterRecoverGroupAffinity")
    @Expose
    private Long DisasterRecoverGroupAffinity;

    /**
    * <p>Enumeration values of sub-product ID: open source edition: "sp_es_io2", basic version: "sp_es_basic", platinum version: "sp_es_platinum", enterprise edition: "sp_es_enterprise", CDC platinum version: "sp_es_CDC_platinum", Log Enhancement Edition: "sp_es_enlogging", tsearch: "sp_tsearch_io2", logstash: "sp_es_logstash". It can be empty. When it is empty, the backend maps this field based on LicenseType.</p>
    */
    @SerializedName("SubProductCode")
    @Expose
    private String SubProductCode;

    /**
    * <p>Read-write separation mode: 0: not enabled; 1: local read/write separation; 2: remote read/write separation.</p>
    */
    @SerializedName("ReadWriteMode")
    @Expose
    private Long ReadWriteMode;

    /**
    * <p>Whether the placement group has asynchronous tasks enabled</p>
    */
    @SerializedName("EnableScheduleRecoverGroup")
    @Expose
    private Boolean EnableScheduleRecoverGroup;

    /**
    * <p>Maintenance time slot for enabling async tasks in a placement group</p>
    */
    @SerializedName("EnableScheduleOperationDuration")
    @Expose
    private EnableScheduleOperationDuration EnableScheduleOperationDuration;

    /**
    * <p>Auto capacity expansion parameter list</p>
    */
    @SerializedName("AutoScaleDiskInfoList")
    @Expose
    private AutoScaleDiskInfo [] AutoScaleDiskInfoList;

    /**
    * <p>Whether to enable public network access to kibana. Enabled by default if not passed</p>
    */
    @SerializedName("EnableKibanaPublicAccess")
    @Expose
    private String EnableKibanaPublicAccess;

    /**
    * <p>Existing cloud monitoring and alarm policy ID</p>
    */
    @SerializedName("AlarmPolicyIds")
    @Expose
    private String [] AlarmPolicyIds;

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
     * Get <p>Instance version (supported: "5.6.4", "6.4.3", "6.8.2", "7.5.1", "7.10.1")</p> 
     * @return EsVersion <p>Instance version (supported: "5.6.4", "6.4.3", "6.8.2", "7.5.1", "7.10.1")</p>
     */
    public String getEsVersion() {
        return this.EsVersion;
    }

    /**
     * Set <p>Instance version (supported: "5.6.4", "6.4.3", "6.8.2", "7.5.1", "7.10.1")</p>
     * @param EsVersion <p>Instance version (supported: "5.6.4", "6.4.3", "6.8.2", "7.5.1", "7.10.1")</p>
     */
    public void setEsVersion(String EsVersion) {
        this.EsVersion = EsVersion;
    }

    /**
     * Get <p>VPC ID</p> 
     * @return VpcId <p>VPC ID</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>VPC ID</p>
     * @param VpcId <p>VPC ID</p>
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
     * Get <p>Access password (8-16 characters, including at least two of the following: [a-z,A-Z], [0-9], and special characters in [-!@#$%&amp;^*+=_:;,.?])</p> 
     * @return Password <p>Access password (8-16 characters, including at least two of the following: [a-z,A-Z], [0-9], and special characters in [-!@#$%&amp;^*+=_:;,.?])</p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>Access password (8-16 characters, including at least two of the following: [a-z,A-Z], [0-9], and special characters in [-!@#$%&amp;^*+=_:;,.?])</p>
     * @param Password <p>Access password (8-16 characters, including at least two of the following: [a-z,A-Z], [0-9], and special characters in [-!@#$%&amp;^*+=_:;,.?])</p>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>Instance name (1-50 English letters, Chinese characters, digits, hyphens -, or underscores _)</p> 
     * @return InstanceName <p>Instance name (1-50 English letters, Chinese characters, digits, hyphens -, or underscores _)</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>Instance name (1-50 English letters, Chinese characters, digits, hyphens -, or underscores _)</p>
     * @param InstanceName <p>Instance name (1-50 English letters, Chinese characters, digits, hyphens -, or underscores _)</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>Abandoned. Please use NodeInfoList<br>Node quantity (2-50)</p> 
     * @return NodeNum <p>Abandoned. Please use NodeInfoList<br>Node quantity (2-50)</p>
     */
    public Long getNodeNum() {
        return this.NodeNum;
    }

    /**
     * Set <p>Abandoned. Please use NodeInfoList<br>Node quantity (2-50)</p>
     * @param NodeNum <p>Abandoned. Please use NodeInfoList<br>Node quantity (2-50)</p>
     */
    public void setNodeNum(Long NodeNum) {
        this.NodeNum = NodeNum;
    }

    /**
     * Get <p>Billing type<li>PREPAID: prepaid, i.e., monthly subscription</li><li>POSTPAID_BY_HOUR: pay-as-you-go by hour</li>Default value: POSTPAID_BY_HOUR</p> 
     * @return ChargeType <p>Billing type<li>PREPAID: prepaid, i.e., monthly subscription</li><li>POSTPAID_BY_HOUR: pay-as-you-go by hour</li>Default value: POSTPAID_BY_HOUR</p>
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set <p>Billing type<li>PREPAID: prepaid, i.e., monthly subscription</li><li>POSTPAID_BY_HOUR: pay-as-you-go by hour</li>Default value: POSTPAID_BY_HOUR</p>
     * @param ChargeType <p>Billing type<li>PREPAID: prepaid, i.e., monthly subscription</li><li>POSTPAID_BY_HOUR: pay-as-you-go by hour</li>Default value: POSTPAID_BY_HOUR</p>
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get <p>Annual and monthly subscription duration (unit determined by the TimeUnit parameter)</p> 
     * @return ChargePeriod <p>Annual and monthly subscription duration (unit determined by the TimeUnit parameter)</p>
     */
    public Long getChargePeriod() {
        return this.ChargePeriod;
    }

    /**
     * Set <p>Annual and monthly subscription duration (unit determined by the TimeUnit parameter)</p>
     * @param ChargePeriod <p>Annual and monthly subscription duration (unit determined by the TimeUnit parameter)</p>
     */
    public void setChargePeriod(Long ChargePeriod) {
        this.ChargePeriod = ChargePeriod;
    }

    /**
     * Get <p>Auto-renewal flag<li>RENEW_FLAG_AUTO: auto renewal</li><li>RENEW_FLAG_MANUAL: no auto-renewal, user renews manually</li>This needs to be set when ChargeType is PREPAID. If this parameter is not passed, no automatic renewal by default for general users, and auto renewal for SVIP users</p> 
     * @return RenewFlag <p>Auto-renewal flag<li>RENEW_FLAG_AUTO: auto renewal</li><li>RENEW_FLAG_MANUAL: no auto-renewal, user renews manually</li>This needs to be set when ChargeType is PREPAID. If this parameter is not passed, no automatic renewal by default for general users, and auto renewal for SVIP users</p>
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set <p>Auto-renewal flag<li>RENEW_FLAG_AUTO: auto renewal</li><li>RENEW_FLAG_MANUAL: no auto-renewal, user renews manually</li>This needs to be set when ChargeType is PREPAID. If this parameter is not passed, no automatic renewal by default for general users, and auto renewal for SVIP users</p>
     * @param RenewFlag <p>Auto-renewal flag<li>RENEW_FLAG_AUTO: auto renewal</li><li>RENEW_FLAG_MANUAL: no auto-renewal, user renews manually</li>This needs to be set when ChargeType is PREPAID. If this parameter is not passed, no automatic renewal by default for general users, and auto renewal for SVIP users</p>
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get <p>Abandoned. Please use NodeInfoList<br>Node specification<li>ES.S1.SMALL2: 1-core 2G</li><li>ES.S1.MEDIUM4: 2-core 4G</li><li>ES.S1.MEDIUM8: 2-core 8G</li><li>ES.S1.LARGE16: 4-core 16G</li><li>ES.S1.2XLARGE32: 8-core 32G</li><li>ES.S1.4XLARGE32: 16-core 32G</li><li>ES.S1.4XLARGE64: 16-core 64G</li></p> 
     * @return NodeType <p>Abandoned. Please use NodeInfoList<br>Node specification<li>ES.S1.SMALL2: 1-core 2G</li><li>ES.S1.MEDIUM4: 2-core 4G</li><li>ES.S1.MEDIUM8: 2-core 8G</li><li>ES.S1.LARGE16: 4-core 16G</li><li>ES.S1.2XLARGE32: 8-core 32G</li><li>ES.S1.4XLARGE32: 16-core 32G</li><li>ES.S1.4XLARGE64: 16-core 64G</li></p>
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set <p>Abandoned. Please use NodeInfoList<br>Node specification<li>ES.S1.SMALL2: 1-core 2G</li><li>ES.S1.MEDIUM4: 2-core 4G</li><li>ES.S1.MEDIUM8: 2-core 8G</li><li>ES.S1.LARGE16: 4-core 16G</li><li>ES.S1.2XLARGE32: 8-core 32G</li><li>ES.S1.4XLARGE32: 16-core 32G</li><li>ES.S1.4XLARGE64: 16-core 64G</li></p>
     * @param NodeType <p>Abandoned. Please use NodeInfoList<br>Node specification<li>ES.S1.SMALL2: 1-core 2G</li><li>ES.S1.MEDIUM4: 2-core 4G</li><li>ES.S1.MEDIUM8: 2-core 8G</li><li>ES.S1.LARGE16: 4-core 16G</li><li>ES.S1.2XLARGE32: 8-core 32G</li><li>ES.S1.4XLARGE32: 16-core 32G</li><li>ES.S1.4XLARGE64: 16-core 64G</li></p>
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get <p>Abandoned. Please use NodeInfoList<br>Node disk type<li>CLOUD_SSD: ssd cloud disk</li><li>CLOUD_PREMIUM: high-performance cloud block storage</li><li>CLOUD_HSSD: enhanced SSD cloud disk</li><li>CLOUD_BSSD: universal type SSD cloud disk</li>Default value: CLOUD_SSD</p> 
     * @return DiskType <p>Abandoned. Please use NodeInfoList<br>Node disk type<li>CLOUD_SSD: ssd cloud disk</li><li>CLOUD_PREMIUM: high-performance cloud block storage</li><li>CLOUD_HSSD: enhanced SSD cloud disk</li><li>CLOUD_BSSD: universal type SSD cloud disk</li>Default value: CLOUD_SSD</p>
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set <p>Abandoned. Please use NodeInfoList<br>Node disk type<li>CLOUD_SSD: ssd cloud disk</li><li>CLOUD_PREMIUM: high-performance cloud block storage</li><li>CLOUD_HSSD: enhanced SSD cloud disk</li><li>CLOUD_BSSD: universal type SSD cloud disk</li>Default value: CLOUD_SSD</p>
     * @param DiskType <p>Abandoned. Please use NodeInfoList<br>Node disk type<li>CLOUD_SSD: ssd cloud disk</li><li>CLOUD_PREMIUM: high-performance cloud block storage</li><li>CLOUD_HSSD: enhanced SSD cloud disk</li><li>CLOUD_BSSD: universal type SSD cloud disk</li>Default value: CLOUD_SSD</p>
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get <p>Abandoned. Please use NodeInfoList<br>Node disk capacity (unit: GB)</p> 
     * @return DiskSize <p>Abandoned. Please use NodeInfoList<br>Node disk capacity (unit: GB)</p>
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set <p>Abandoned. Please use NodeInfoList<br>Node disk capacity (unit: GB)</p>
     * @param DiskSize <p>Abandoned. Please use NodeInfoList<br>Node disk capacity (unit: GB)</p>
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get <p>Billing duration unit (needs to be set when ChargeType is PREPAID. Default value: "m", which means month. Currently only support "m")</p> 
     * @return TimeUnit <p>Billing duration unit (needs to be set when ChargeType is PREPAID. Default value: "m", which means month. Currently only support "m")</p>
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set <p>Billing duration unit (needs to be set when ChargeType is PREPAID. Default value: "m", which means month. Currently only support "m")</p>
     * @param TimeUnit <p>Billing duration unit (needs to be set when ChargeType is PREPAID. Default value: "m", which means month. Currently only support "m")</p>
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get <p>Indicates whether to use vouchers automatically<li>0: Do not use automatically.</li><li>1: Use automatically.</li>Default value: 0.</p> 
     * @return AutoVoucher <p>Indicates whether to use vouchers automatically<li>0: Do not use automatically.</li><li>1: Use automatically.</li>Default value: 0.</p>
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set <p>Indicates whether to use vouchers automatically<li>0: Do not use automatically.</li><li>1: Use automatically.</li>Default value: 0.</p>
     * @param AutoVoucher <p>Indicates whether to use vouchers automatically<li>0: Do not use automatically.</li><li>1: Use automatically.</li>Default value: 0.</p>
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get <p>Voucher ID list. Only one voucher can be specified.</p> 
     * @return VoucherIds <p>Voucher ID list. Only one voucher can be specified.</p>
     */
    public String [] getVoucherIds() {
        return this.VoucherIds;
    }

    /**
     * Set <p>Voucher ID list. Only one voucher can be specified.</p>
     * @param VoucherIds <p>Voucher ID list. Only one voucher can be specified.</p>
     */
    public void setVoucherIds(String [] VoucherIds) {
        this.VoucherIds = VoucherIds;
    }

    /**
     * Get <p>Abandoned. Please use NodeInfoList<br>Whether to create a dedicated master node<li>true: enable a dedicated master node</li><li>false: disable a dedicated master node</li>Default value: false</p> 
     * @return EnableDedicatedMaster <p>Abandoned. Please use NodeInfoList<br>Whether to create a dedicated master node<li>true: enable a dedicated master node</li><li>false: disable a dedicated master node</li>Default value: false</p>
     */
    public Boolean getEnableDedicatedMaster() {
        return this.EnableDedicatedMaster;
    }

    /**
     * Set <p>Abandoned. Please use NodeInfoList<br>Whether to create a dedicated master node<li>true: enable a dedicated master node</li><li>false: disable a dedicated master node</li>Default value: false</p>
     * @param EnableDedicatedMaster <p>Abandoned. Please use NodeInfoList<br>Whether to create a dedicated master node<li>true: enable a dedicated master node</li><li>false: disable a dedicated master node</li>Default value: false</p>
     */
    public void setEnableDedicatedMaster(Boolean EnableDedicatedMaster) {
        this.EnableDedicatedMaster = EnableDedicatedMaster;
    }

    /**
     * Get <p>Abandoned. Please use NodeInfoList<br>Number of dedicated primary nodes (supports only 3 or 5. Required if EnableDedicatedMaster is true)</p> 
     * @return MasterNodeNum <p>Abandoned. Please use NodeInfoList<br>Number of dedicated primary nodes (supports only 3 or 5. Required if EnableDedicatedMaster is true)</p>
     */
    public Long getMasterNodeNum() {
        return this.MasterNodeNum;
    }

    /**
     * Set <p>Abandoned. Please use NodeInfoList<br>Number of dedicated primary nodes (supports only 3 or 5. Required if EnableDedicatedMaster is true)</p>
     * @param MasterNodeNum <p>Abandoned. Please use NodeInfoList<br>Number of dedicated primary nodes (supports only 3 or 5. Required if EnableDedicatedMaster is true)</p>
     */
    public void setMasterNodeNum(Long MasterNodeNum) {
        this.MasterNodeNum = MasterNodeNum;
    }

    /**
     * Get <p>Abandoned. Please use NodeInfoList<br>Dedicated primary node type (required if EnableDedicatedMaster is true)<li>ES.S1.SMALL2: 1-core 2G</li><li>ES.S1.MEDIUM4: 2-core 4G</li><li>ES.S1.MEDIUM8: 2-core 8G</li><li>ES.S1.LARGE16: 4-core 16G</li><li>ES.S1.2XLARGE32: 8-core 32G</li><li>ES.S1.4XLARGE32: 16-core 32G</li><li>ES.S1.4XLARGE64: 16-core 64G</li></p> 
     * @return MasterNodeType <p>Abandoned. Please use NodeInfoList<br>Dedicated primary node type (required if EnableDedicatedMaster is true)<li>ES.S1.SMALL2: 1-core 2G</li><li>ES.S1.MEDIUM4: 2-core 4G</li><li>ES.S1.MEDIUM8: 2-core 8G</li><li>ES.S1.LARGE16: 4-core 16G</li><li>ES.S1.2XLARGE32: 8-core 32G</li><li>ES.S1.4XLARGE32: 16-core 32G</li><li>ES.S1.4XLARGE64: 16-core 64G</li></p>
     */
    public String getMasterNodeType() {
        return this.MasterNodeType;
    }

    /**
     * Set <p>Abandoned. Please use NodeInfoList<br>Dedicated primary node type (required if EnableDedicatedMaster is true)<li>ES.S1.SMALL2: 1-core 2G</li><li>ES.S1.MEDIUM4: 2-core 4G</li><li>ES.S1.MEDIUM8: 2-core 8G</li><li>ES.S1.LARGE16: 4-core 16G</li><li>ES.S1.2XLARGE32: 8-core 32G</li><li>ES.S1.4XLARGE32: 16-core 32G</li><li>ES.S1.4XLARGE64: 16-core 64G</li></p>
     * @param MasterNodeType <p>Abandoned. Please use NodeInfoList<br>Dedicated primary node type (required if EnableDedicatedMaster is true)<li>ES.S1.SMALL2: 1-core 2G</li><li>ES.S1.MEDIUM4: 2-core 4G</li><li>ES.S1.MEDIUM8: 2-core 8G</li><li>ES.S1.LARGE16: 4-core 16G</li><li>ES.S1.2XLARGE32: 8-core 32G</li><li>ES.S1.4XLARGE32: 16-core 32G</li><li>ES.S1.4XLARGE64: 16-core 64G</li></p>
     */
    public void setMasterNodeType(String MasterNodeType) {
        this.MasterNodeType = MasterNodeType;
    }

    /**
     * Get <p>Abandoned. Please use NodeInfoList<br>Dedicated primary node disk size (in GB, optional; if transmitted, it must be 50. Customization is not supported temporarily)</p> 
     * @return MasterNodeDiskSize <p>Abandoned. Please use NodeInfoList<br>Dedicated primary node disk size (in GB, optional; if transmitted, it must be 50. Customization is not supported temporarily)</p>
     */
    public Long getMasterNodeDiskSize() {
        return this.MasterNodeDiskSize;
    }

    /**
     * Set <p>Abandoned. Please use NodeInfoList<br>Dedicated primary node disk size (in GB, optional; if transmitted, it must be 50. Customization is not supported temporarily)</p>
     * @param MasterNodeDiskSize <p>Abandoned. Please use NodeInfoList<br>Dedicated primary node disk size (in GB, optional; if transmitted, it must be 50. Customization is not supported temporarily)</p>
     */
    public void setMasterNodeDiskSize(Long MasterNodeDiskSize) {
        this.MasterNodeDiskSize = MasterNodeDiskSize;
    }

    /**
     * Get <p>ClusterName in the cluster configuration file (system default configuration is the instance ID, customization is not supported temporarily)</p> 
     * @return ClusterNameInConf <p>ClusterName in the cluster configuration file (system default configuration is the instance ID, customization is not supported temporarily)</p>
     */
    public String getClusterNameInConf() {
        return this.ClusterNameInConf;
    }

    /**
     * Set <p>ClusterName in the cluster configuration file (system default configuration is the instance ID, customization is not supported temporarily)</p>
     * @param ClusterNameInConf <p>ClusterName in the cluster configuration file (system default configuration is the instance ID, customization is not supported temporarily)</p>
     */
    public void setClusterNameInConf(String ClusterNameInConf) {
        this.ClusterNameInConf = ClusterNameInConf;
    }

    /**
     * Get <p>Cluster deployment method<li>0: single-AZ deployment</li><li>1: multi-AZ deployment, Beijing, Shanghai, Shanghai Finance, Guangzhou, Nanjing, Hong Kong, Singapore, Frankfurt (allowlist control)</li>Default value: 0</p> 
     * @return DeployMode <p>Cluster deployment method<li>0: single-AZ deployment</li><li>1: multi-AZ deployment, Beijing, Shanghai, Shanghai Finance, Guangzhou, Nanjing, Hong Kong, Singapore, Frankfurt (allowlist control)</li>Default value: 0</p>
     */
    public Long getDeployMode() {
        return this.DeployMode;
    }

    /**
     * Set <p>Cluster deployment method<li>0: single-AZ deployment</li><li>1: multi-AZ deployment, Beijing, Shanghai, Shanghai Finance, Guangzhou, Nanjing, Hong Kong, Singapore, Frankfurt (allowlist control)</li>Default value: 0</p>
     * @param DeployMode <p>Cluster deployment method<li>0: single-AZ deployment</li><li>1: multi-AZ deployment, Beijing, Shanghai, Shanghai Finance, Guangzhou, Nanjing, Hong Kong, Singapore, Frankfurt (allowlist control)</li>Default value: 0</p>
     */
    public void setDeployMode(Long DeployMode) {
        this.DeployMode = DeployMode;
    }

    /**
     * Get <p>Detailed information of availability zones in multi-AZ deployment (required when DeployMode is 1)</p> 
     * @return MultiZoneInfo <p>Detailed information of availability zones in multi-AZ deployment (required when DeployMode is 1)</p>
     */
    public ZoneDetail [] getMultiZoneInfo() {
        return this.MultiZoneInfo;
    }

    /**
     * Set <p>Detailed information of availability zones in multi-AZ deployment (required when DeployMode is 1)</p>
     * @param MultiZoneInfo <p>Detailed information of availability zones in multi-AZ deployment (required when DeployMode is 1)</p>
     */
    public void setMultiZoneInfo(ZoneDetail [] MultiZoneInfo) {
        this.MultiZoneInfo = MultiZoneInfo;
    }

    /**
     * Get <p>License type<li>oss: open source edition</li><li>basic: basic version</li><li>platinum: platinum version</li>Default value: platinum</p> 
     * @return LicenseType <p>License type<li>oss: open source edition</li><li>basic: basic version</li><li>platinum: platinum version</li>Default value: platinum</p>
     */
    public String getLicenseType() {
        return this.LicenseType;
    }

    /**
     * Set <p>License type<li>oss: open source edition</li><li>basic: basic version</li><li>platinum: platinum version</li>Default value: platinum</p>
     * @param LicenseType <p>License type<li>oss: open source edition</li><li>basic: basic version</li><li>platinum: platinum version</li>Default value: platinum</p>
     */
    public void setLicenseType(String LicenseType) {
        this.LicenseType = LicenseType;
    }

    /**
     * Get <p>Node information list, for description of the specification information of various types of nodes in the cluster, such as node type, number of nodes, node specification, disk type, and disk size</p> 
     * @return NodeInfoList <p>Node information list, for description of the specification information of various types of nodes in the cluster, such as node type, number of nodes, node specification, disk type, and disk size</p>
     */
    public NodeInfo [] getNodeInfoList() {
        return this.NodeInfoList;
    }

    /**
     * Set <p>Node information list, for description of the specification information of various types of nodes in the cluster, such as node type, number of nodes, node specification, disk type, and disk size</p>
     * @param NodeInfoList <p>Node information list, for description of the specification information of various types of nodes in the cluster, such as node type, number of nodes, node specification, disk type, and disk size</p>
     */
    public void setNodeInfoList(NodeInfo [] NodeInfoList) {
        this.NodeInfoList = NodeInfoList;
    }

    /**
     * Get <p>Node tag information list</p> 
     * @return TagList <p>Node tag information list</p>
     */
    public TagInfo [] getTagList() {
        return this.TagList;
    }

    /**
     * Set <p>Node tag information list</p>
     * @param TagList <p>Node tag information list</p>
     */
    public void setTagList(TagInfo [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get <p>Whether xpack security authentication is enabled for basic version 6.8 (and above versions)<li>1: not enabled</li><li>2: enabled</li></p> 
     * @return BasicSecurityType <p>Whether xpack security authentication is enabled for basic version 6.8 (and above versions)<li>1: not enabled</li><li>2: enabled</li></p>
     */
    public Long getBasicSecurityType() {
        return this.BasicSecurityType;
    }

    /**
     * Set <p>Whether xpack security authentication is enabled for basic version 6.8 (and above versions)<li>1: not enabled</li><li>2: enabled</li></p>
     * @param BasicSecurityType <p>Whether xpack security authentication is enabled for basic version 6.8 (and above versions)<li>1: not enabled</li><li>2: enabled</li></p>
     */
    public void setBasicSecurityType(Long BasicSecurityType) {
        this.BasicSecurityType = BasicSecurityType;
    }

    /**
     * Get <p>Scenario template type 0: disabled 1: common 2: log 3: search</p> 
     * @return SceneType <p>Scenario template type 0: disabled 1: common 2: log 3: search</p>
     */
    public Long getSceneType() {
        return this.SceneType;
    }

    /**
     * Set <p>Scenario template type 0: disabled 1: common 2: log 3: search</p>
     * @param SceneType <p>Scenario template type 0: disabled 1: common 2: log 3: search</p>
     */
    public void setSceneType(Long SceneType) {
        this.SceneType = SceneType;
    }

    /**
     * Get <p>Visualize node configuration</p> 
     * @return WebNodeTypeInfo <p>Visualize node configuration</p>
     */
    public WebNodeTypeInfo getWebNodeTypeInfo() {
        return this.WebNodeTypeInfo;
    }

    /**
     * Set <p>Visualize node configuration</p>
     * @param WebNodeTypeInfo <p>Visualize node configuration</p>
     */
    public void setWebNodeTypeInfo(WebNodeTypeInfo WebNodeTypeInfo) {
        this.WebNodeTypeInfo = WebNodeTypeInfo;
    }

    /**
     * Get <p>Create an https cluster. http is selected by default.</p> 
     * @return Protocol <p>Create an https cluster. http is selected by default.</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>Create an https cluster. http is selected by default.</p>
     * @param Protocol <p>Create an https cluster. http is selected by default.</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>Maintenance time slot</p> 
     * @return OperationDuration <p>Maintenance time slot</p>
     */
    public OperationDuration getOperationDuration() {
        return this.OperationDuration;
    }

    /**
     * Set <p>Maintenance time slot</p>
     * @param OperationDuration <p>Maintenance time slot</p>
     */
    public void setOperationDuration(OperationDuration OperationDuration) {
        this.OperationDuration = OperationDuration;
    }

    /**
     * Get <p>Whether storage-compute separation is enabled</p> 
     * @return EnableHybridStorage <p>Whether storage-compute separation is enabled</p>
     */
    public Boolean getEnableHybridStorage() {
        return this.EnableHybridStorage;
    }

    /**
     * Set <p>Whether storage-compute separation is enabled</p>
     * @param EnableHybridStorage <p>Whether storage-compute separation is enabled</p>
     */
    public void setEnableHybridStorage(Boolean EnableHybridStorage) {
        this.EnableHybridStorage = EnableHybridStorage;
    }

    /**
     * Get <p>Additional hard disk performance</p> 
     * @return DiskEnhance <p>Additional hard disk performance</p>
     */
    public Long getDiskEnhance() {
        return this.DiskEnhance;
    }

    /**
     * Set <p>Additional hard disk performance</p>
     * @param DiskEnhance <p>Additional hard disk performance</p>
     */
    public void setDiskEnhance(Long DiskEnhance) {
        this.DiskEnhance = DiskEnhance;
    }

    /**
     * Get <p>Whether intelligent check is enabled</p> 
     * @return EnableDiagnose <p>Whether intelligent check is enabled</p>
     */
    public Boolean getEnableDiagnose() {
        return this.EnableDiagnose;
    }

    /**
     * Set <p>Whether intelligent check is enabled</p>
     * @param EnableDiagnose <p>Whether intelligent check is enabled</p>
     */
    public void setEnableDiagnose(Boolean EnableDiagnose) {
        this.EnableDiagnose = EnableDiagnose;
    }

    /**
     * Get <p>Whether to enable automatic backup</p> 
     * @return EnableCosBackup <p>Whether to enable automatic backup</p>
     */
    public Boolean getEnableCosBackup() {
        return this.EnableCosBackup;
    }

    /**
     * Set <p>Whether to enable automatic backup</p>
     * @param EnableCosBackup <p>Whether to enable automatic backup</p>
     */
    public void setEnableCosBackup(Boolean EnableCosBackup) {
        this.EnableCosBackup = EnableCosBackup;
    }

    /**
     * Get <p>cdcId, pass it when using a CDC subnet</p> 
     * @return CdcId <p>cdcId, pass it when using a CDC subnet</p>
     */
    public String getCdcId() {
        return this.CdcId;
    }

    /**
     * Set <p>cdcId, pass it when using a CDC subnet</p>
     * @param CdcId <p>cdcId, pass it when using a CDC subnet</p>
     */
    public void setCdcId(String CdcId) {
        this.CdcId = CdcId;
    }

    /**
     * Get <p>Placement group affinity. Value range: [0,10]. 0 indicates disabled.</p> 
     * @return DisasterRecoverGroupAffinity <p>Placement group affinity. Value range: [0,10]. 0 indicates disabled.</p>
     */
    public Long getDisasterRecoverGroupAffinity() {
        return this.DisasterRecoverGroupAffinity;
    }

    /**
     * Set <p>Placement group affinity. Value range: [0,10]. 0 indicates disabled.</p>
     * @param DisasterRecoverGroupAffinity <p>Placement group affinity. Value range: [0,10]. 0 indicates disabled.</p>
     */
    public void setDisasterRecoverGroupAffinity(Long DisasterRecoverGroupAffinity) {
        this.DisasterRecoverGroupAffinity = DisasterRecoverGroupAffinity;
    }

    /**
     * Get <p>Enumeration values of sub-product ID: open source edition: "sp_es_io2", basic version: "sp_es_basic", platinum version: "sp_es_platinum", enterprise edition: "sp_es_enterprise", CDC platinum version: "sp_es_CDC_platinum", Log Enhancement Edition: "sp_es_enlogging", tsearch: "sp_tsearch_io2", logstash: "sp_es_logstash". It can be empty. When it is empty, the backend maps this field based on LicenseType.</p> 
     * @return SubProductCode <p>Enumeration values of sub-product ID: open source edition: "sp_es_io2", basic version: "sp_es_basic", platinum version: "sp_es_platinum", enterprise edition: "sp_es_enterprise", CDC platinum version: "sp_es_CDC_platinum", Log Enhancement Edition: "sp_es_enlogging", tsearch: "sp_tsearch_io2", logstash: "sp_es_logstash". It can be empty. When it is empty, the backend maps this field based on LicenseType.</p>
     */
    public String getSubProductCode() {
        return this.SubProductCode;
    }

    /**
     * Set <p>Enumeration values of sub-product ID: open source edition: "sp_es_io2", basic version: "sp_es_basic", platinum version: "sp_es_platinum", enterprise edition: "sp_es_enterprise", CDC platinum version: "sp_es_CDC_platinum", Log Enhancement Edition: "sp_es_enlogging", tsearch: "sp_tsearch_io2", logstash: "sp_es_logstash". It can be empty. When it is empty, the backend maps this field based on LicenseType.</p>
     * @param SubProductCode <p>Enumeration values of sub-product ID: open source edition: "sp_es_io2", basic version: "sp_es_basic", platinum version: "sp_es_platinum", enterprise edition: "sp_es_enterprise", CDC platinum version: "sp_es_CDC_platinum", Log Enhancement Edition: "sp_es_enlogging", tsearch: "sp_tsearch_io2", logstash: "sp_es_logstash". It can be empty. When it is empty, the backend maps this field based on LicenseType.</p>
     */
    public void setSubProductCode(String SubProductCode) {
        this.SubProductCode = SubProductCode;
    }

    /**
     * Get <p>Read-write separation mode: 0: not enabled; 1: local read/write separation; 2: remote read/write separation.</p> 
     * @return ReadWriteMode <p>Read-write separation mode: 0: not enabled; 1: local read/write separation; 2: remote read/write separation.</p>
     */
    public Long getReadWriteMode() {
        return this.ReadWriteMode;
    }

    /**
     * Set <p>Read-write separation mode: 0: not enabled; 1: local read/write separation; 2: remote read/write separation.</p>
     * @param ReadWriteMode <p>Read-write separation mode: 0: not enabled; 1: local read/write separation; 2: remote read/write separation.</p>
     */
    public void setReadWriteMode(Long ReadWriteMode) {
        this.ReadWriteMode = ReadWriteMode;
    }

    /**
     * Get <p>Whether the placement group has asynchronous tasks enabled</p> 
     * @return EnableScheduleRecoverGroup <p>Whether the placement group has asynchronous tasks enabled</p>
     */
    public Boolean getEnableScheduleRecoverGroup() {
        return this.EnableScheduleRecoverGroup;
    }

    /**
     * Set <p>Whether the placement group has asynchronous tasks enabled</p>
     * @param EnableScheduleRecoverGroup <p>Whether the placement group has asynchronous tasks enabled</p>
     */
    public void setEnableScheduleRecoverGroup(Boolean EnableScheduleRecoverGroup) {
        this.EnableScheduleRecoverGroup = EnableScheduleRecoverGroup;
    }

    /**
     * Get <p>Maintenance time slot for enabling async tasks in a placement group</p> 
     * @return EnableScheduleOperationDuration <p>Maintenance time slot for enabling async tasks in a placement group</p>
     */
    public EnableScheduleOperationDuration getEnableScheduleOperationDuration() {
        return this.EnableScheduleOperationDuration;
    }

    /**
     * Set <p>Maintenance time slot for enabling async tasks in a placement group</p>
     * @param EnableScheduleOperationDuration <p>Maintenance time slot for enabling async tasks in a placement group</p>
     */
    public void setEnableScheduleOperationDuration(EnableScheduleOperationDuration EnableScheduleOperationDuration) {
        this.EnableScheduleOperationDuration = EnableScheduleOperationDuration;
    }

    /**
     * Get <p>Auto capacity expansion parameter list</p> 
     * @return AutoScaleDiskInfoList <p>Auto capacity expansion parameter list</p>
     */
    public AutoScaleDiskInfo [] getAutoScaleDiskInfoList() {
        return this.AutoScaleDiskInfoList;
    }

    /**
     * Set <p>Auto capacity expansion parameter list</p>
     * @param AutoScaleDiskInfoList <p>Auto capacity expansion parameter list</p>
     */
    public void setAutoScaleDiskInfoList(AutoScaleDiskInfo [] AutoScaleDiskInfoList) {
        this.AutoScaleDiskInfoList = AutoScaleDiskInfoList;
    }

    /**
     * Get <p>Whether to enable public network access to kibana. Enabled by default if not passed</p> 
     * @return EnableKibanaPublicAccess <p>Whether to enable public network access to kibana. Enabled by default if not passed</p>
     */
    public String getEnableKibanaPublicAccess() {
        return this.EnableKibanaPublicAccess;
    }

    /**
     * Set <p>Whether to enable public network access to kibana. Enabled by default if not passed</p>
     * @param EnableKibanaPublicAccess <p>Whether to enable public network access to kibana. Enabled by default if not passed</p>
     */
    public void setEnableKibanaPublicAccess(String EnableKibanaPublicAccess) {
        this.EnableKibanaPublicAccess = EnableKibanaPublicAccess;
    }

    /**
     * Get <p>Existing cloud monitoring and alarm policy ID</p> 
     * @return AlarmPolicyIds <p>Existing cloud monitoring and alarm policy ID</p>
     */
    public String [] getAlarmPolicyIds() {
        return this.AlarmPolicyIds;
    }

    /**
     * Set <p>Existing cloud monitoring and alarm policy ID</p>
     * @param AlarmPolicyIds <p>Existing cloud monitoring and alarm policy ID</p>
     */
    public void setAlarmPolicyIds(String [] AlarmPolicyIds) {
        this.AlarmPolicyIds = AlarmPolicyIds;
    }

    public CreateInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInstanceRequest(CreateInstanceRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.EsVersion != null) {
            this.EsVersion = new String(source.EsVersion);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.NodeNum != null) {
            this.NodeNum = new Long(source.NodeNum);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.ChargePeriod != null) {
            this.ChargePeriod = new Long(source.ChargePeriod);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new String(source.RenewFlag);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Long(source.AutoVoucher);
        }
        if (source.VoucherIds != null) {
            this.VoucherIds = new String[source.VoucherIds.length];
            for (int i = 0; i < source.VoucherIds.length; i++) {
                this.VoucherIds[i] = new String(source.VoucherIds[i]);
            }
        }
        if (source.EnableDedicatedMaster != null) {
            this.EnableDedicatedMaster = new Boolean(source.EnableDedicatedMaster);
        }
        if (source.MasterNodeNum != null) {
            this.MasterNodeNum = new Long(source.MasterNodeNum);
        }
        if (source.MasterNodeType != null) {
            this.MasterNodeType = new String(source.MasterNodeType);
        }
        if (source.MasterNodeDiskSize != null) {
            this.MasterNodeDiskSize = new Long(source.MasterNodeDiskSize);
        }
        if (source.ClusterNameInConf != null) {
            this.ClusterNameInConf = new String(source.ClusterNameInConf);
        }
        if (source.DeployMode != null) {
            this.DeployMode = new Long(source.DeployMode);
        }
        if (source.MultiZoneInfo != null) {
            this.MultiZoneInfo = new ZoneDetail[source.MultiZoneInfo.length];
            for (int i = 0; i < source.MultiZoneInfo.length; i++) {
                this.MultiZoneInfo[i] = new ZoneDetail(source.MultiZoneInfo[i]);
            }
        }
        if (source.LicenseType != null) {
            this.LicenseType = new String(source.LicenseType);
        }
        if (source.NodeInfoList != null) {
            this.NodeInfoList = new NodeInfo[source.NodeInfoList.length];
            for (int i = 0; i < source.NodeInfoList.length; i++) {
                this.NodeInfoList[i] = new NodeInfo(source.NodeInfoList[i]);
            }
        }
        if (source.TagList != null) {
            this.TagList = new TagInfo[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new TagInfo(source.TagList[i]);
            }
        }
        if (source.BasicSecurityType != null) {
            this.BasicSecurityType = new Long(source.BasicSecurityType);
        }
        if (source.SceneType != null) {
            this.SceneType = new Long(source.SceneType);
        }
        if (source.WebNodeTypeInfo != null) {
            this.WebNodeTypeInfo = new WebNodeTypeInfo(source.WebNodeTypeInfo);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.OperationDuration != null) {
            this.OperationDuration = new OperationDuration(source.OperationDuration);
        }
        if (source.EnableHybridStorage != null) {
            this.EnableHybridStorage = new Boolean(source.EnableHybridStorage);
        }
        if (source.DiskEnhance != null) {
            this.DiskEnhance = new Long(source.DiskEnhance);
        }
        if (source.EnableDiagnose != null) {
            this.EnableDiagnose = new Boolean(source.EnableDiagnose);
        }
        if (source.EnableCosBackup != null) {
            this.EnableCosBackup = new Boolean(source.EnableCosBackup);
        }
        if (source.CdcId != null) {
            this.CdcId = new String(source.CdcId);
        }
        if (source.DisasterRecoverGroupAffinity != null) {
            this.DisasterRecoverGroupAffinity = new Long(source.DisasterRecoverGroupAffinity);
        }
        if (source.SubProductCode != null) {
            this.SubProductCode = new String(source.SubProductCode);
        }
        if (source.ReadWriteMode != null) {
            this.ReadWriteMode = new Long(source.ReadWriteMode);
        }
        if (source.EnableScheduleRecoverGroup != null) {
            this.EnableScheduleRecoverGroup = new Boolean(source.EnableScheduleRecoverGroup);
        }
        if (source.EnableScheduleOperationDuration != null) {
            this.EnableScheduleOperationDuration = new EnableScheduleOperationDuration(source.EnableScheduleOperationDuration);
        }
        if (source.AutoScaleDiskInfoList != null) {
            this.AutoScaleDiskInfoList = new AutoScaleDiskInfo[source.AutoScaleDiskInfoList.length];
            for (int i = 0; i < source.AutoScaleDiskInfoList.length; i++) {
                this.AutoScaleDiskInfoList[i] = new AutoScaleDiskInfo(source.AutoScaleDiskInfoList[i]);
            }
        }
        if (source.EnableKibanaPublicAccess != null) {
            this.EnableKibanaPublicAccess = new String(source.EnableKibanaPublicAccess);
        }
        if (source.AlarmPolicyIds != null) {
            this.AlarmPolicyIds = new String[source.AlarmPolicyIds.length];
            for (int i = 0; i < source.AlarmPolicyIds.length; i++) {
                this.AlarmPolicyIds[i] = new String(source.AlarmPolicyIds[i]);
            }
        }
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
        this.setParamSimple(map, prefix + "SceneType", this.SceneType);
        this.setParamObj(map, prefix + "WebNodeTypeInfo.", this.WebNodeTypeInfo);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamObj(map, prefix + "OperationDuration.", this.OperationDuration);
        this.setParamSimple(map, prefix + "EnableHybridStorage", this.EnableHybridStorage);
        this.setParamSimple(map, prefix + "DiskEnhance", this.DiskEnhance);
        this.setParamSimple(map, prefix + "EnableDiagnose", this.EnableDiagnose);
        this.setParamSimple(map, prefix + "EnableCosBackup", this.EnableCosBackup);
        this.setParamSimple(map, prefix + "CdcId", this.CdcId);
        this.setParamSimple(map, prefix + "DisasterRecoverGroupAffinity", this.DisasterRecoverGroupAffinity);
        this.setParamSimple(map, prefix + "SubProductCode", this.SubProductCode);
        this.setParamSimple(map, prefix + "ReadWriteMode", this.ReadWriteMode);
        this.setParamSimple(map, prefix + "EnableScheduleRecoverGroup", this.EnableScheduleRecoverGroup);
        this.setParamObj(map, prefix + "EnableScheduleOperationDuration.", this.EnableScheduleOperationDuration);
        this.setParamArrayObj(map, prefix + "AutoScaleDiskInfoList.", this.AutoScaleDiskInfoList);
        this.setParamSimple(map, prefix + "EnableKibanaPublicAccess", this.EnableKibanaPublicAccess);
        this.setParamArraySimple(map, prefix + "AlarmPolicyIds.", this.AlarmPolicyIds);

    }
}


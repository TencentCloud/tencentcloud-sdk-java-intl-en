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

public class InstanceInfo extends AbstractModel {

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
    * <p>uid</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>User UIN.</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>UID of the VPC to which the instance belongs</p>
    */
    @SerializedName("VpcUid")
    @Expose
    private String VpcUid;

    /**
    * <p>UID of the subnet to which the instance belongs</p>
    */
    @SerializedName("SubnetUid")
    @Expose
    private String SubnetUid;

    /**
    * <p>Instance status. 0: processing, 1: normal, -1: stopped, -2: being destroyed, -3: terminated, -4: isolated, 2: initializing when creating a cluster</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Auto-renewal flag. Value range: <br>RENEW_FLAG_AUTO: auto renewal<br>RENEW_FLAG_MANUAL: no auto-renewal<br>Default value: <br>RENEW_FLAG_DEFAULT: no auto-renewal<br>If this parameter is set to RENEW_FLAG_AUTO, the instance will automatically renew on a monthly basis after expiration if the account balance is sufficient.</p>
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * <p>Instance billing mode. Value ranges: PREPAID: prepaid mode, i.e., monthly subscription. POSTPAID_BY_HOUR: postpaid, i.e., pay-as-you-go. CDHPAID: CDH-paid mode, i.e., only charges for CDH, without charging for instances on CDH.</p>
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * <p>Annual and monthly subscription duration, unit: month</p>
    */
    @SerializedName("ChargePeriod")
    @Expose
    private Long ChargePeriod;

    /**
    * <p>Node specification<li>ES.S1.SMALL2: 1-core 2G</li><li>ES.S1.MEDIUM4: 2-core 4G</li><li>ES.S1.MEDIUM8: 2-core 8G</li><li>ES.S1.LARGE16: 4-core 16G</li><li>ES.S1.2XLARGE32: 8-core 32G</li><li>ES.S1.4XLARGE32: 16-core 32G</li><li>ES.S1.4XLARGE64: 16-core 64G</li></p>
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * <p>Number of nodes</p>
    */
    @SerializedName("NodeNum")
    @Expose
    private Long NodeNum;

    /**
    * <p>Number of node CPU cores.</p>
    */
    @SerializedName("CpuNum")
    @Expose
    private Long CpuNum;

    /**
    * <p>Node memory size (GB).</p>
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * <p>Node disk type</p>
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * <p>Node disk size (GB).</p>
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * <p>ES domain name</p>
    */
    @SerializedName("EsDomain")
    @Expose
    private String EsDomain;

    /**
    * <p>ES VIP</p>
    */
    @SerializedName("EsVip")
    @Expose
    private String EsVip;

    /**
    * <p>ES port</p>
    */
    @SerializedName("EsPort")
    @Expose
    private Long EsPort;

    /**
    * <p>Kibana access url</p>
    */
    @SerializedName("KibanaUrl")
    @Expose
    private String KibanaUrl;

    /**
    * <p>ES version number</p>
    */
    @SerializedName("EsVersion")
    @Expose
    private String EsVersion;

    /**
    * <p>ES configuration item</p>
    */
    @SerializedName("EsConfig")
    @Expose
    private String EsConfig;

    /**
    * <p>Kibana Access Control Configuration</p>
    */
    @SerializedName("EsAcl")
    @Expose
    private EsAcl EsAcl;

    /**
    * <p>Instance creation time</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Last modification time of the instance</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>Instance expiration time</p>
    */
    @SerializedName("Deadline")
    @Expose
    private String Deadline;

    /**
    * <p>Instance type (instance type flag, currently only 1 and 2)</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * <p>Ik analyzer configuration</p>
    */
    @SerializedName("IkConfig")
    @Expose
    private EsDictionaryInfo IkConfig;

    /**
    * <p>Dedicated master node configuration</p>
    */
    @SerializedName("MasterNodeInfo")
    @Expose
    private MasterNodeInfo MasterNodeInfo;

    /**
    * <p>cos automatic backup configuration</p>
    */
    @SerializedName("CosBackup")
    @Expose
    private CosBackup CosBackup;

    /**
    * <p>Whether cos automatic backup is allowed</p>
    */
    @SerializedName("AllowCosBackup")
    @Expose
    private Boolean AllowCosBackup;

    /**
    * <p>Tag list of the instance</p>
    */
    @SerializedName("TagList")
    @Expose
    private TagInfo [] TagList;

    /**
    * <p>License type<li>oss: open source edition</li><li>basic: basic version</li><li>platinum: platinum version</li>Default value: platinum</p>
    */
    @SerializedName("LicenseType")
    @Expose
    private String LicenseType;

    /**
    * <p>License type<li>oss: open source edition</li><li>basic: basic version</li><li>platinum: platinum version</li><li>enterprise: enterprise edition</li>Default value: platinum</p>
    */
    @SerializedName("RealLicenseType")
    @Expose
    private String RealLicenseType;

    /**
    * <p>Whether it is a hot-cold cluster<li>true: Hot-cold cluster</li><li>false: Non-hot-cold cluster</li></p>
    */
    @SerializedName("EnableHotWarmMode")
    @Expose
    private Boolean EnableHotWarmMode;

    /**
    * <p>Warm node specification<li>ES.S1.SMALL2: 1-core 2G</li><li>ES.S1.MEDIUM4: 2-core 4G</li><li>ES.S1.MEDIUM8: 2-core 8G</li><li>ES.S1.LARGE16: 4-core 16G</li><li>ES.S1.2XLARGE32: 8-core 32G</li><li>ES.S1.4XLARGE32: 16-core 32G</li><li>ES.S1.4XLARGE64: 16-core 64G</li></p>
    */
    @SerializedName("WarmNodeType")
    @Expose
    private String WarmNodeType;

    /**
    * <p>Number of warm nodes</p>
    */
    @SerializedName("WarmNodeNum")
    @Expose
    private Long WarmNodeNum;

    /**
    * <p>Warm node CPU cores</p>
    */
    @SerializedName("WarmCpuNum")
    @Expose
    private Long WarmCpuNum;

    /**
    * <p>Warm node memory size (GB).</p>
    */
    @SerializedName("WarmMemSize")
    @Expose
    private Long WarmMemSize;

    /**
    * <p>Warm node disk type</p>
    */
    @SerializedName("WarmDiskType")
    @Expose
    private String WarmDiskType;

    /**
    * <p>Warm node disk size (GB).</p>
    */
    @SerializedName("WarmDiskSize")
    @Expose
    private Long WarmDiskSize;

    /**
    * <p>Cluster node information list</p>
    */
    @SerializedName("NodeInfoList")
    @Expose
    private NodeInfo [] NodeInfoList;

    /**
    * <p>Es public network address</p>
    */
    @SerializedName("EsPublicUrl")
    @Expose
    private String EsPublicUrl;

    /**
    * <p>Multi-AZ network info</p>
    */
    @SerializedName("MultiZoneInfo")
    @Expose
    private ZoneDetail [] MultiZoneInfo;

    /**
    * <p>Deployment mode<li>0: single availability zone</li><li>1: multi-availability zone, Beijing, Shanghai, Shanghai Finance, Guangzhou, Nanjing, Hong Kong, Singapore, Frankfurt (allowlist control)</li></p>
    */
    @SerializedName("DeployMode")
    @Expose
    private Long DeployMode;

    /**
    * <p>ES public access status<li>OPEN: enable</li><li>CLOSE: disable</li></p>
    */
    @SerializedName("PublicAccess")
    @Expose
    private String PublicAccess;

    /**
    * <p>ES public network access control configuration</p>
    */
    @SerializedName("EsPublicAcl")
    @Expose
    private EsAcl EsPublicAcl;

    /**
    * <p>Kibana private network address</p>
    */
    @SerializedName("KibanaPrivateUrl")
    @Expose
    private String KibanaPrivateUrl;

    /**
    * <p>Kibana public access status<li>OPEN: enabled</li><li>CLOSE: disabled</li></p>
    */
    @SerializedName("KibanaPublicAccess")
    @Expose
    private String KibanaPublicAccess;

    /**
    * <p>Kibana internal access status<li>OPEN: enable</li><li>CLOSE: disable</li></p>
    */
    @SerializedName("KibanaPrivateAccess")
    @Expose
    private String KibanaPrivateAccess;

    /**
    * <p>Whether xpack security authentication is enabled for basic version 6.8 (and above versions)<li>1: not enabled</li><li>2: enabled</li></p>
    */
    @SerializedName("SecurityType")
    @Expose
    private Long SecurityType;

    /**
    * <p>Scenario template type: 0, not enabled; 1, common scenarios; 2, log scenario; 3, search scenario</p>
    */
    @SerializedName("SceneType")
    @Expose
    private Long SceneType;

    /**
    * <p>Kibana configuration item</p>
    */
    @SerializedName("KibanaConfig")
    @Expose
    private String KibanaConfig;

    /**
    * <p>Kibana node information</p>
    */
    @SerializedName("KibanaNodeInfo")
    @Expose
    private KibanaNodeInfo KibanaNodeInfo;

    /**
    * <p>Visualize node configuration</p>
    */
    @SerializedName("WebNodeTypeInfo")
    @Expose
    private WebNodeTypeInfo WebNodeTypeInfo;

    /**
    * <p>JDK type. Valid values: oracle, kona</p>
    */
    @SerializedName("Jdk")
    @Expose
    private String Jdk;

    /**
    * <p>Cluster network communication protocol</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>Security group id</p>
    */
    @SerializedName("SecurityGroups")
    @Expose
    private String [] SecurityGroups;

    /**
    * <p>Cold node specification<li>ES.S1.SMALL2: 1-core 2G</li><li>ES.S1.MEDIUM4: 2-core 4G</li><li>ES.S1.MEDIUM8: 2-core 8G</li><li>ES.S1.LARGE16: 4-core 16G</li><li>ES.S1.2XLARGE32: 8-core 32G</li><li>ES.S1.4XLARGE32: 16-core 32G</li><li>ES.S1.4XLARGE64: 16-core 64G</li></p>
    */
    @SerializedName("ColdNodeType")
    @Expose
    private String ColdNodeType;

    /**
    * <p>Number of cold nodes</p>
    */
    @SerializedName("ColdNodeNum")
    @Expose
    private Long ColdNodeNum;

    /**
    * <p>Cold node CPU cores</p>
    */
    @SerializedName("ColdCpuNum")
    @Expose
    private Long ColdCpuNum;

    /**
    * <p>Cold node memory size (GB).</p>
    */
    @SerializedName("ColdMemSize")
    @Expose
    private Long ColdMemSize;

    /**
    * <p>Cold node disk type</p>
    */
    @SerializedName("ColdDiskType")
    @Expose
    private String ColdDiskType;

    /**
    * <p>Cold node disk size (GB).</p>
    */
    @SerializedName("ColdDiskSize")
    @Expose
    private Long ColdDiskSize;

    /**
    * <p>Frozen node specification<li>ES.S1.SMALL2: 1-core 2GB</li><li>ES.S1.MEDIUM4: 2-core 4GB</li><li>ES.S1.MEDIUM8: 2-core 8GB</li><li>ES.S1.LARGE16: 4-core 16GB</li><li>ES.S1.2XLARGE32: 8-core 32GB</li><li>ES.S1.4XLARGE32: 16-core 32GB</li><li>ES.S1.4XLARGE64: 16-core 64GB</li></p>
    */
    @SerializedName("FrozenNodeType")
    @Expose
    private String FrozenNodeType;

    /**
    * <p>Number of frozen nodes</p>
    */
    @SerializedName("FrozenNodeNum")
    @Expose
    private Long FrozenNodeNum;

    /**
    * <p>Frozen node CPU cores</p>
    */
    @SerializedName("FrozenCpuNum")
    @Expose
    private Long FrozenCpuNum;

    /**
    * <p>Frozen node memory size (GB).</p>
    */
    @SerializedName("FrozenMemSize")
    @Expose
    private Long FrozenMemSize;

    /**
    * <p>Frozen node disk type</p>
    */
    @SerializedName("FrozenDiskType")
    @Expose
    private String FrozenDiskType;

    /**
    * <p>Frozen node disk size (GB).</p>
    */
    @SerializedName("FrozenDiskSize")
    @Expose
    private Long FrozenDiskSize;

    /**
    * <p>Cluster health status: -1 unknown; 0 Green; 1 Yellow; 2 Red</p>
    */
    @SerializedName("HealthStatus")
    @Expose
    private Long HealthStatus;

    /**
    * <p>Intracluster network url for https.</p>
    */
    @SerializedName("EsPrivateUrl")
    @Expose
    private String EsPrivateUrl;

    /**
    * <p>https cluster private network domain name</p>
    */
    @SerializedName("EsPrivateDomain")
    @Expose
    private String EsPrivateDomain;

    /**
    * <p>Cluster configuration group information.</p>
    */
    @SerializedName("EsConfigSets")
    @Expose
    private EsConfigSetInfo [] EsConfigSets;

    /**
    * <p>Cluster maintenance time slot</p>
    */
    @SerializedName("OperationDuration")
    @Expose
    private OperationDuration OperationDuration;

    /**
    * <p>web node list</p>
    */
    @SerializedName("OptionalWebServiceInfos")
    @Expose
    private OptionalWebServiceInfo [] OptionalWebServiceInfos;

    /**
    * <p>Autonomous index switch</p>
    */
    @SerializedName("AutoIndexEnabled")
    @Expose
    private Boolean AutoIndexEnabled;

    /**
    * <p>Whether storage and computation separation is supported.</p>
    */
    @SerializedName("EnableHybridStorage")
    @Expose
    private Boolean EnableHybridStorage;

    /**
    * <p>Process progress.</p>
    */
    @SerializedName("ProcessPercent")
    @Expose
    private Float ProcessPercent;

    /**
    * <p>Kibana alerting public network alert policy<li>OPEN: enable</li><li>CLOSE: disable</li></p>
    */
    @SerializedName("KibanaAlteringPublicAccess")
    @Expose
    private String KibanaAlteringPublicAccess;

    /**
    * <p>Whether there is a kernel update this month: false (no) and true (yes).</p>
    */
    @SerializedName("HasKernelUpgrade")
    @Expose
    private Boolean HasKernelUpgrade;

    /**
    * <p>cdcId, pass it when using a CDC subnet</p>
    */
    @SerializedName("CdcId")
    @Expose
    private String CdcId;

    /**
    * <p>kibana intranet vip</p>
    */
    @SerializedName("KibanaPrivateVip")
    @Expose
    private String KibanaPrivateVip;

    /**
    * <p>Customize the private network url of kibana</p>
    */
    @SerializedName("CustomKibanaPrivateUrl")
    @Expose
    private String CustomKibanaPrivateUrl;

    /**
    * <p>Node outbound access detailed information.</p>
    */
    @SerializedName("OutboundPublicAcls")
    @Expose
    private OutboundPublicAcl [] OutboundPublicAcls;

    /**
    * <p>Network connection solution</p>
    */
    @SerializedName("NetConnectScheme")
    @Expose
    private String NetConnectScheme;

    /**
    * <p>Placement group related parameters</p>
    */
    @SerializedName("DisasterRecoverGroupAffinity")
    @Expose
    private Long DisasterRecoverGroupAffinity;

    /**
    * <p>Sub-product ID enumeration values: open source edition: "sp_es_io2", basic version: "sp_es_basic", platinum version: "sp_es_platinum", AI Search Enhancement Edition: "sp_es_aisearch", enterprise edition: "sp_es_enterprise", CDC platinum version: "sp_es_CDC_platinum", Log Enhancement Edition: "sp_es_enlogging", tsearch: "sp_tsearch_io2", logstash: "sp_es_logstash". It can be empty. When it is empty, the backend maps this field based on LicenseType.</p>
    */
    @SerializedName("SubProductCode")
    @Expose
    private String SubProductCode;

    /**
    * <p>Storage-compute separation cos usage, Unit: M</p>
    */
    @SerializedName("CosBucketStorageSize")
    @Expose
    private Long CosBucketStorageSize;

    /**
    * <p>Read-write separation mode: 0: not enabled; 1: local read/write separation; 2: remote read/write separation.</p>
    */
    @SerializedName("ReadWriteMode")
    @Expose
    private Long ReadWriteMode;

    /**
    * <p>Whether there is an asynchronous task scheduling for placement groups</p>
    */
    @SerializedName("EnableScheduleRecoverGroup")
    @Expose
    private Boolean EnableScheduleRecoverGroup;

    /**
    * <p>The time when an asynchronous task is scheduled</p>
    */
    @SerializedName("EnableScheduleOperationDuration")
    @Expose
    private EnableScheduleOperationDuration EnableScheduleOperationDuration;

    /**
    * <p>Cluster protection: OPEN: enable, CLOSE: disable</p>
    */
    @SerializedName("EnableDestroyProtection")
    @Expose
    private String EnableDestroyProtection;

    /**
    * <p>kibana intranet access address</p>
    */
    @SerializedName("ShowKibanaIpPort")
    @Expose
    private String ShowKibanaIpPort;

    /**
    * <p>Whether it is a CDZLite availability zone</p>
    */
    @SerializedName("IsCdzLite")
    @Expose
    private Boolean IsCdzLite;

    /**
    * <p>Cluster private network tcp address</p>
    */
    @SerializedName("EsPrivateTcpUrl")
    @Expose
    private String EsPrivateTcpUrl;

    /**
    * <p>Whether it is in the recycle bin</p><p>Default value: false</p>
    */
    @SerializedName("IsInRecycleBin")
    @Expose
    private Boolean IsInRecycleBin;

    /**
    * <p>Is locked in the recycle bin</p><p>Default value: false</p>
    */
    @SerializedName("RecycleLockEnabled")
    @Expose
    private Boolean RecycleLockEnabled;

    /**
    * <p>The time when termination is expected</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
    */
    @SerializedName("MayDestroyPoint")
    @Expose
    private String MayDestroyPoint;

    /**
    * <p>The time when termination is delayed</p><p>Unit: day</p>
    */
    @SerializedName("DelayDestroyInterval")
    @Expose
    private Long DelayDestroyInterval;

    /**
    * <p>Enable automatic replacement of unhealthy nodes. 0: disable, 1: enable</p>
    */
    @SerializedName("EnableAutoReplace")
    @Expose
    private Long EnableAutoReplace;

    /**
    * <p>Enable mtls. 0: disable, 1: enable</p>
    */
    @SerializedName("OpenMTLS")
    @Expose
    private Long OpenMTLS;

    /**
    * <p>Certificate type</p>
    */
    @SerializedName("ServerCertSource")
    @Expose
    private String ServerCertSource;

    /**
    * <p>VIP pending migration for the cluster</p>
    */
    @SerializedName("OldEsVip")
    @Expose
    private String OldEsVip;

    /**
    * <p>Cluster TCP address to be migrated</p>
    */
    @SerializedName("OldEsPrivateTcpUrl")
    @Expose
    private String OldEsPrivateTcpUrl;

    /**
    * <p>Whether to take old nodes offline from the VIP</p>
    */
    @SerializedName("NeedOfflineOldNodesNotify")
    @Expose
    private Boolean NeedOfflineOldNodesNotify;

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
     * Get <p>uid</p> 
     * @return AppId <p>uid</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>uid</p>
     * @param AppId <p>uid</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>User UIN.</p> 
     * @return Uin <p>User UIN.</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>User UIN.</p>
     * @param Uin <p>User UIN.</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>UID of the VPC to which the instance belongs</p> 
     * @return VpcUid <p>UID of the VPC to which the instance belongs</p>
     */
    public String getVpcUid() {
        return this.VpcUid;
    }

    /**
     * Set <p>UID of the VPC to which the instance belongs</p>
     * @param VpcUid <p>UID of the VPC to which the instance belongs</p>
     */
    public void setVpcUid(String VpcUid) {
        this.VpcUid = VpcUid;
    }

    /**
     * Get <p>UID of the subnet to which the instance belongs</p> 
     * @return SubnetUid <p>UID of the subnet to which the instance belongs</p>
     */
    public String getSubnetUid() {
        return this.SubnetUid;
    }

    /**
     * Set <p>UID of the subnet to which the instance belongs</p>
     * @param SubnetUid <p>UID of the subnet to which the instance belongs</p>
     */
    public void setSubnetUid(String SubnetUid) {
        this.SubnetUid = SubnetUid;
    }

    /**
     * Get <p>Instance status. 0: processing, 1: normal, -1: stopped, -2: being destroyed, -3: terminated, -4: isolated, 2: initializing when creating a cluster</p> 
     * @return Status <p>Instance status. 0: processing, 1: normal, -1: stopped, -2: being destroyed, -3: terminated, -4: isolated, 2: initializing when creating a cluster</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Instance status. 0: processing, 1: normal, -1: stopped, -2: being destroyed, -3: terminated, -4: isolated, 2: initializing when creating a cluster</p>
     * @param Status <p>Instance status. 0: processing, 1: normal, -1: stopped, -2: being destroyed, -3: terminated, -4: isolated, 2: initializing when creating a cluster</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Auto-renewal flag. Value range: <br>RENEW_FLAG_AUTO: auto renewal<br>RENEW_FLAG_MANUAL: no auto-renewal<br>Default value: <br>RENEW_FLAG_DEFAULT: no auto-renewal<br>If this parameter is set to RENEW_FLAG_AUTO, the instance will automatically renew on a monthly basis after expiration if the account balance is sufficient.</p> 
     * @return RenewFlag <p>Auto-renewal flag. Value range: <br>RENEW_FLAG_AUTO: auto renewal<br>RENEW_FLAG_MANUAL: no auto-renewal<br>Default value: <br>RENEW_FLAG_DEFAULT: no auto-renewal<br>If this parameter is set to RENEW_FLAG_AUTO, the instance will automatically renew on a monthly basis after expiration if the account balance is sufficient.</p>
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set <p>Auto-renewal flag. Value range: <br>RENEW_FLAG_AUTO: auto renewal<br>RENEW_FLAG_MANUAL: no auto-renewal<br>Default value: <br>RENEW_FLAG_DEFAULT: no auto-renewal<br>If this parameter is set to RENEW_FLAG_AUTO, the instance will automatically renew on a monthly basis after expiration if the account balance is sufficient.</p>
     * @param RenewFlag <p>Auto-renewal flag. Value range: <br>RENEW_FLAG_AUTO: auto renewal<br>RENEW_FLAG_MANUAL: no auto-renewal<br>Default value: <br>RENEW_FLAG_DEFAULT: no auto-renewal<br>If this parameter is set to RENEW_FLAG_AUTO, the instance will automatically renew on a monthly basis after expiration if the account balance is sufficient.</p>
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get <p>Instance billing mode. Value ranges: PREPAID: prepaid mode, i.e., monthly subscription. POSTPAID_BY_HOUR: postpaid, i.e., pay-as-you-go. CDHPAID: CDH-paid mode, i.e., only charges for CDH, without charging for instances on CDH.</p> 
     * @return ChargeType <p>Instance billing mode. Value ranges: PREPAID: prepaid mode, i.e., monthly subscription. POSTPAID_BY_HOUR: postpaid, i.e., pay-as-you-go. CDHPAID: CDH-paid mode, i.e., only charges for CDH, without charging for instances on CDH.</p>
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set <p>Instance billing mode. Value ranges: PREPAID: prepaid mode, i.e., monthly subscription. POSTPAID_BY_HOUR: postpaid, i.e., pay-as-you-go. CDHPAID: CDH-paid mode, i.e., only charges for CDH, without charging for instances on CDH.</p>
     * @param ChargeType <p>Instance billing mode. Value ranges: PREPAID: prepaid mode, i.e., monthly subscription. POSTPAID_BY_HOUR: postpaid, i.e., pay-as-you-go. CDHPAID: CDH-paid mode, i.e., only charges for CDH, without charging for instances on CDH.</p>
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get <p>Annual and monthly subscription duration, unit: month</p> 
     * @return ChargePeriod <p>Annual and monthly subscription duration, unit: month</p>
     */
    public Long getChargePeriod() {
        return this.ChargePeriod;
    }

    /**
     * Set <p>Annual and monthly subscription duration, unit: month</p>
     * @param ChargePeriod <p>Annual and monthly subscription duration, unit: month</p>
     */
    public void setChargePeriod(Long ChargePeriod) {
        this.ChargePeriod = ChargePeriod;
    }

    /**
     * Get <p>Node specification<li>ES.S1.SMALL2: 1-core 2G</li><li>ES.S1.MEDIUM4: 2-core 4G</li><li>ES.S1.MEDIUM8: 2-core 8G</li><li>ES.S1.LARGE16: 4-core 16G</li><li>ES.S1.2XLARGE32: 8-core 32G</li><li>ES.S1.4XLARGE32: 16-core 32G</li><li>ES.S1.4XLARGE64: 16-core 64G</li></p> 
     * @return NodeType <p>Node specification<li>ES.S1.SMALL2: 1-core 2G</li><li>ES.S1.MEDIUM4: 2-core 4G</li><li>ES.S1.MEDIUM8: 2-core 8G</li><li>ES.S1.LARGE16: 4-core 16G</li><li>ES.S1.2XLARGE32: 8-core 32G</li><li>ES.S1.4XLARGE32: 16-core 32G</li><li>ES.S1.4XLARGE64: 16-core 64G</li></p>
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set <p>Node specification<li>ES.S1.SMALL2: 1-core 2G</li><li>ES.S1.MEDIUM4: 2-core 4G</li><li>ES.S1.MEDIUM8: 2-core 8G</li><li>ES.S1.LARGE16: 4-core 16G</li><li>ES.S1.2XLARGE32: 8-core 32G</li><li>ES.S1.4XLARGE32: 16-core 32G</li><li>ES.S1.4XLARGE64: 16-core 64G</li></p>
     * @param NodeType <p>Node specification<li>ES.S1.SMALL2: 1-core 2G</li><li>ES.S1.MEDIUM4: 2-core 4G</li><li>ES.S1.MEDIUM8: 2-core 8G</li><li>ES.S1.LARGE16: 4-core 16G</li><li>ES.S1.2XLARGE32: 8-core 32G</li><li>ES.S1.4XLARGE32: 16-core 32G</li><li>ES.S1.4XLARGE64: 16-core 64G</li></p>
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get <p>Number of nodes</p> 
     * @return NodeNum <p>Number of nodes</p>
     */
    public Long getNodeNum() {
        return this.NodeNum;
    }

    /**
     * Set <p>Number of nodes</p>
     * @param NodeNum <p>Number of nodes</p>
     */
    public void setNodeNum(Long NodeNum) {
        this.NodeNum = NodeNum;
    }

    /**
     * Get <p>Number of node CPU cores.</p> 
     * @return CpuNum <p>Number of node CPU cores.</p>
     */
    public Long getCpuNum() {
        return this.CpuNum;
    }

    /**
     * Set <p>Number of node CPU cores.</p>
     * @param CpuNum <p>Number of node CPU cores.</p>
     */
    public void setCpuNum(Long CpuNum) {
        this.CpuNum = CpuNum;
    }

    /**
     * Get <p>Node memory size (GB).</p> 
     * @return MemSize <p>Node memory size (GB).</p>
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set <p>Node memory size (GB).</p>
     * @param MemSize <p>Node memory size (GB).</p>
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get <p>Node disk type</p> 
     * @return DiskType <p>Node disk type</p>
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set <p>Node disk type</p>
     * @param DiskType <p>Node disk type</p>
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get <p>Node disk size (GB).</p> 
     * @return DiskSize <p>Node disk size (GB).</p>
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set <p>Node disk size (GB).</p>
     * @param DiskSize <p>Node disk size (GB).</p>
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get <p>ES domain name</p> 
     * @return EsDomain <p>ES domain name</p>
     */
    public String getEsDomain() {
        return this.EsDomain;
    }

    /**
     * Set <p>ES domain name</p>
     * @param EsDomain <p>ES domain name</p>
     */
    public void setEsDomain(String EsDomain) {
        this.EsDomain = EsDomain;
    }

    /**
     * Get <p>ES VIP</p> 
     * @return EsVip <p>ES VIP</p>
     */
    public String getEsVip() {
        return this.EsVip;
    }

    /**
     * Set <p>ES VIP</p>
     * @param EsVip <p>ES VIP</p>
     */
    public void setEsVip(String EsVip) {
        this.EsVip = EsVip;
    }

    /**
     * Get <p>ES port</p> 
     * @return EsPort <p>ES port</p>
     */
    public Long getEsPort() {
        return this.EsPort;
    }

    /**
     * Set <p>ES port</p>
     * @param EsPort <p>ES port</p>
     */
    public void setEsPort(Long EsPort) {
        this.EsPort = EsPort;
    }

    /**
     * Get <p>Kibana access url</p> 
     * @return KibanaUrl <p>Kibana access url</p>
     */
    public String getKibanaUrl() {
        return this.KibanaUrl;
    }

    /**
     * Set <p>Kibana access url</p>
     * @param KibanaUrl <p>Kibana access url</p>
     */
    public void setKibanaUrl(String KibanaUrl) {
        this.KibanaUrl = KibanaUrl;
    }

    /**
     * Get <p>ES version number</p> 
     * @return EsVersion <p>ES version number</p>
     */
    public String getEsVersion() {
        return this.EsVersion;
    }

    /**
     * Set <p>ES version number</p>
     * @param EsVersion <p>ES version number</p>
     */
    public void setEsVersion(String EsVersion) {
        this.EsVersion = EsVersion;
    }

    /**
     * Get <p>ES configuration item</p> 
     * @return EsConfig <p>ES configuration item</p>
     */
    public String getEsConfig() {
        return this.EsConfig;
    }

    /**
     * Set <p>ES configuration item</p>
     * @param EsConfig <p>ES configuration item</p>
     */
    public void setEsConfig(String EsConfig) {
        this.EsConfig = EsConfig;
    }

    /**
     * Get <p>Kibana Access Control Configuration</p> 
     * @return EsAcl <p>Kibana Access Control Configuration</p>
     */
    public EsAcl getEsAcl() {
        return this.EsAcl;
    }

    /**
     * Set <p>Kibana Access Control Configuration</p>
     * @param EsAcl <p>Kibana Access Control Configuration</p>
     */
    public void setEsAcl(EsAcl EsAcl) {
        this.EsAcl = EsAcl;
    }

    /**
     * Get <p>Instance creation time</p> 
     * @return CreateTime <p>Instance creation time</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Instance creation time</p>
     * @param CreateTime <p>Instance creation time</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Last modification time of the instance</p> 
     * @return UpdateTime <p>Last modification time of the instance</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Last modification time of the instance</p>
     * @param UpdateTime <p>Last modification time of the instance</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>Instance expiration time</p> 
     * @return Deadline <p>Instance expiration time</p>
     */
    public String getDeadline() {
        return this.Deadline;
    }

    /**
     * Set <p>Instance expiration time</p>
     * @param Deadline <p>Instance expiration time</p>
     */
    public void setDeadline(String Deadline) {
        this.Deadline = Deadline;
    }

    /**
     * Get <p>Instance type (instance type flag, currently only 1 and 2)</p> 
     * @return InstanceType <p>Instance type (instance type flag, currently only 1 and 2)</p>
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>Instance type (instance type flag, currently only 1 and 2)</p>
     * @param InstanceType <p>Instance type (instance type flag, currently only 1 and 2)</p>
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>Ik analyzer configuration</p> 
     * @return IkConfig <p>Ik analyzer configuration</p>
     */
    public EsDictionaryInfo getIkConfig() {
        return this.IkConfig;
    }

    /**
     * Set <p>Ik analyzer configuration</p>
     * @param IkConfig <p>Ik analyzer configuration</p>
     */
    public void setIkConfig(EsDictionaryInfo IkConfig) {
        this.IkConfig = IkConfig;
    }

    /**
     * Get <p>Dedicated master node configuration</p> 
     * @return MasterNodeInfo <p>Dedicated master node configuration</p>
     */
    public MasterNodeInfo getMasterNodeInfo() {
        return this.MasterNodeInfo;
    }

    /**
     * Set <p>Dedicated master node configuration</p>
     * @param MasterNodeInfo <p>Dedicated master node configuration</p>
     */
    public void setMasterNodeInfo(MasterNodeInfo MasterNodeInfo) {
        this.MasterNodeInfo = MasterNodeInfo;
    }

    /**
     * Get <p>cos automatic backup configuration</p> 
     * @return CosBackup <p>cos automatic backup configuration</p>
     */
    public CosBackup getCosBackup() {
        return this.CosBackup;
    }

    /**
     * Set <p>cos automatic backup configuration</p>
     * @param CosBackup <p>cos automatic backup configuration</p>
     */
    public void setCosBackup(CosBackup CosBackup) {
        this.CosBackup = CosBackup;
    }

    /**
     * Get <p>Whether cos automatic backup is allowed</p> 
     * @return AllowCosBackup <p>Whether cos automatic backup is allowed</p>
     */
    public Boolean getAllowCosBackup() {
        return this.AllowCosBackup;
    }

    /**
     * Set <p>Whether cos automatic backup is allowed</p>
     * @param AllowCosBackup <p>Whether cos automatic backup is allowed</p>
     */
    public void setAllowCosBackup(Boolean AllowCosBackup) {
        this.AllowCosBackup = AllowCosBackup;
    }

    /**
     * Get <p>Tag list of the instance</p> 
     * @return TagList <p>Tag list of the instance</p>
     */
    public TagInfo [] getTagList() {
        return this.TagList;
    }

    /**
     * Set <p>Tag list of the instance</p>
     * @param TagList <p>Tag list of the instance</p>
     */
    public void setTagList(TagInfo [] TagList) {
        this.TagList = TagList;
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
     * Get <p>License type<li>oss: open source edition</li><li>basic: basic version</li><li>platinum: platinum version</li><li>enterprise: enterprise edition</li>Default value: platinum</p> 
     * @return RealLicenseType <p>License type<li>oss: open source edition</li><li>basic: basic version</li><li>platinum: platinum version</li><li>enterprise: enterprise edition</li>Default value: platinum</p>
     */
    public String getRealLicenseType() {
        return this.RealLicenseType;
    }

    /**
     * Set <p>License type<li>oss: open source edition</li><li>basic: basic version</li><li>platinum: platinum version</li><li>enterprise: enterprise edition</li>Default value: platinum</p>
     * @param RealLicenseType <p>License type<li>oss: open source edition</li><li>basic: basic version</li><li>platinum: platinum version</li><li>enterprise: enterprise edition</li>Default value: platinum</p>
     */
    public void setRealLicenseType(String RealLicenseType) {
        this.RealLicenseType = RealLicenseType;
    }

    /**
     * Get <p>Whether it is a hot-cold cluster<li>true: Hot-cold cluster</li><li>false: Non-hot-cold cluster</li></p> 
     * @return EnableHotWarmMode <p>Whether it is a hot-cold cluster<li>true: Hot-cold cluster</li><li>false: Non-hot-cold cluster</li></p>
     */
    public Boolean getEnableHotWarmMode() {
        return this.EnableHotWarmMode;
    }

    /**
     * Set <p>Whether it is a hot-cold cluster<li>true: Hot-cold cluster</li><li>false: Non-hot-cold cluster</li></p>
     * @param EnableHotWarmMode <p>Whether it is a hot-cold cluster<li>true: Hot-cold cluster</li><li>false: Non-hot-cold cluster</li></p>
     */
    public void setEnableHotWarmMode(Boolean EnableHotWarmMode) {
        this.EnableHotWarmMode = EnableHotWarmMode;
    }

    /**
     * Get <p>Warm node specification<li>ES.S1.SMALL2: 1-core 2G</li><li>ES.S1.MEDIUM4: 2-core 4G</li><li>ES.S1.MEDIUM8: 2-core 8G</li><li>ES.S1.LARGE16: 4-core 16G</li><li>ES.S1.2XLARGE32: 8-core 32G</li><li>ES.S1.4XLARGE32: 16-core 32G</li><li>ES.S1.4XLARGE64: 16-core 64G</li></p> 
     * @return WarmNodeType <p>Warm node specification<li>ES.S1.SMALL2: 1-core 2G</li><li>ES.S1.MEDIUM4: 2-core 4G</li><li>ES.S1.MEDIUM8: 2-core 8G</li><li>ES.S1.LARGE16: 4-core 16G</li><li>ES.S1.2XLARGE32: 8-core 32G</li><li>ES.S1.4XLARGE32: 16-core 32G</li><li>ES.S1.4XLARGE64: 16-core 64G</li></p>
     */
    public String getWarmNodeType() {
        return this.WarmNodeType;
    }

    /**
     * Set <p>Warm node specification<li>ES.S1.SMALL2: 1-core 2G</li><li>ES.S1.MEDIUM4: 2-core 4G</li><li>ES.S1.MEDIUM8: 2-core 8G</li><li>ES.S1.LARGE16: 4-core 16G</li><li>ES.S1.2XLARGE32: 8-core 32G</li><li>ES.S1.4XLARGE32: 16-core 32G</li><li>ES.S1.4XLARGE64: 16-core 64G</li></p>
     * @param WarmNodeType <p>Warm node specification<li>ES.S1.SMALL2: 1-core 2G</li><li>ES.S1.MEDIUM4: 2-core 4G</li><li>ES.S1.MEDIUM8: 2-core 8G</li><li>ES.S1.LARGE16: 4-core 16G</li><li>ES.S1.2XLARGE32: 8-core 32G</li><li>ES.S1.4XLARGE32: 16-core 32G</li><li>ES.S1.4XLARGE64: 16-core 64G</li></p>
     */
    public void setWarmNodeType(String WarmNodeType) {
        this.WarmNodeType = WarmNodeType;
    }

    /**
     * Get <p>Number of warm nodes</p> 
     * @return WarmNodeNum <p>Number of warm nodes</p>
     */
    public Long getWarmNodeNum() {
        return this.WarmNodeNum;
    }

    /**
     * Set <p>Number of warm nodes</p>
     * @param WarmNodeNum <p>Number of warm nodes</p>
     */
    public void setWarmNodeNum(Long WarmNodeNum) {
        this.WarmNodeNum = WarmNodeNum;
    }

    /**
     * Get <p>Warm node CPU cores</p> 
     * @return WarmCpuNum <p>Warm node CPU cores</p>
     */
    public Long getWarmCpuNum() {
        return this.WarmCpuNum;
    }

    /**
     * Set <p>Warm node CPU cores</p>
     * @param WarmCpuNum <p>Warm node CPU cores</p>
     */
    public void setWarmCpuNum(Long WarmCpuNum) {
        this.WarmCpuNum = WarmCpuNum;
    }

    /**
     * Get <p>Warm node memory size (GB).</p> 
     * @return WarmMemSize <p>Warm node memory size (GB).</p>
     */
    public Long getWarmMemSize() {
        return this.WarmMemSize;
    }

    /**
     * Set <p>Warm node memory size (GB).</p>
     * @param WarmMemSize <p>Warm node memory size (GB).</p>
     */
    public void setWarmMemSize(Long WarmMemSize) {
        this.WarmMemSize = WarmMemSize;
    }

    /**
     * Get <p>Warm node disk type</p> 
     * @return WarmDiskType <p>Warm node disk type</p>
     */
    public String getWarmDiskType() {
        return this.WarmDiskType;
    }

    /**
     * Set <p>Warm node disk type</p>
     * @param WarmDiskType <p>Warm node disk type</p>
     */
    public void setWarmDiskType(String WarmDiskType) {
        this.WarmDiskType = WarmDiskType;
    }

    /**
     * Get <p>Warm node disk size (GB).</p> 
     * @return WarmDiskSize <p>Warm node disk size (GB).</p>
     */
    public Long getWarmDiskSize() {
        return this.WarmDiskSize;
    }

    /**
     * Set <p>Warm node disk size (GB).</p>
     * @param WarmDiskSize <p>Warm node disk size (GB).</p>
     */
    public void setWarmDiskSize(Long WarmDiskSize) {
        this.WarmDiskSize = WarmDiskSize;
    }

    /**
     * Get <p>Cluster node information list</p> 
     * @return NodeInfoList <p>Cluster node information list</p>
     */
    public NodeInfo [] getNodeInfoList() {
        return this.NodeInfoList;
    }

    /**
     * Set <p>Cluster node information list</p>
     * @param NodeInfoList <p>Cluster node information list</p>
     */
    public void setNodeInfoList(NodeInfo [] NodeInfoList) {
        this.NodeInfoList = NodeInfoList;
    }

    /**
     * Get <p>Es public network address</p> 
     * @return EsPublicUrl <p>Es public network address</p>
     */
    public String getEsPublicUrl() {
        return this.EsPublicUrl;
    }

    /**
     * Set <p>Es public network address</p>
     * @param EsPublicUrl <p>Es public network address</p>
     */
    public void setEsPublicUrl(String EsPublicUrl) {
        this.EsPublicUrl = EsPublicUrl;
    }

    /**
     * Get <p>Multi-AZ network info</p> 
     * @return MultiZoneInfo <p>Multi-AZ network info</p>
     */
    public ZoneDetail [] getMultiZoneInfo() {
        return this.MultiZoneInfo;
    }

    /**
     * Set <p>Multi-AZ network info</p>
     * @param MultiZoneInfo <p>Multi-AZ network info</p>
     */
    public void setMultiZoneInfo(ZoneDetail [] MultiZoneInfo) {
        this.MultiZoneInfo = MultiZoneInfo;
    }

    /**
     * Get <p>Deployment mode<li>0: single availability zone</li><li>1: multi-availability zone, Beijing, Shanghai, Shanghai Finance, Guangzhou, Nanjing, Hong Kong, Singapore, Frankfurt (allowlist control)</li></p> 
     * @return DeployMode <p>Deployment mode<li>0: single availability zone</li><li>1: multi-availability zone, Beijing, Shanghai, Shanghai Finance, Guangzhou, Nanjing, Hong Kong, Singapore, Frankfurt (allowlist control)</li></p>
     */
    public Long getDeployMode() {
        return this.DeployMode;
    }

    /**
     * Set <p>Deployment mode<li>0: single availability zone</li><li>1: multi-availability zone, Beijing, Shanghai, Shanghai Finance, Guangzhou, Nanjing, Hong Kong, Singapore, Frankfurt (allowlist control)</li></p>
     * @param DeployMode <p>Deployment mode<li>0: single availability zone</li><li>1: multi-availability zone, Beijing, Shanghai, Shanghai Finance, Guangzhou, Nanjing, Hong Kong, Singapore, Frankfurt (allowlist control)</li></p>
     */
    public void setDeployMode(Long DeployMode) {
        this.DeployMode = DeployMode;
    }

    /**
     * Get <p>ES public access status<li>OPEN: enable</li><li>CLOSE: disable</li></p> 
     * @return PublicAccess <p>ES public access status<li>OPEN: enable</li><li>CLOSE: disable</li></p>
     */
    public String getPublicAccess() {
        return this.PublicAccess;
    }

    /**
     * Set <p>ES public access status<li>OPEN: enable</li><li>CLOSE: disable</li></p>
     * @param PublicAccess <p>ES public access status<li>OPEN: enable</li><li>CLOSE: disable</li></p>
     */
    public void setPublicAccess(String PublicAccess) {
        this.PublicAccess = PublicAccess;
    }

    /**
     * Get <p>ES public network access control configuration</p> 
     * @return EsPublicAcl <p>ES public network access control configuration</p>
     */
    public EsAcl getEsPublicAcl() {
        return this.EsPublicAcl;
    }

    /**
     * Set <p>ES public network access control configuration</p>
     * @param EsPublicAcl <p>ES public network access control configuration</p>
     */
    public void setEsPublicAcl(EsAcl EsPublicAcl) {
        this.EsPublicAcl = EsPublicAcl;
    }

    /**
     * Get <p>Kibana private network address</p> 
     * @return KibanaPrivateUrl <p>Kibana private network address</p>
     */
    public String getKibanaPrivateUrl() {
        return this.KibanaPrivateUrl;
    }

    /**
     * Set <p>Kibana private network address</p>
     * @param KibanaPrivateUrl <p>Kibana private network address</p>
     */
    public void setKibanaPrivateUrl(String KibanaPrivateUrl) {
        this.KibanaPrivateUrl = KibanaPrivateUrl;
    }

    /**
     * Get <p>Kibana public access status<li>OPEN: enabled</li><li>CLOSE: disabled</li></p> 
     * @return KibanaPublicAccess <p>Kibana public access status<li>OPEN: enabled</li><li>CLOSE: disabled</li></p>
     */
    public String getKibanaPublicAccess() {
        return this.KibanaPublicAccess;
    }

    /**
     * Set <p>Kibana public access status<li>OPEN: enabled</li><li>CLOSE: disabled</li></p>
     * @param KibanaPublicAccess <p>Kibana public access status<li>OPEN: enabled</li><li>CLOSE: disabled</li></p>
     */
    public void setKibanaPublicAccess(String KibanaPublicAccess) {
        this.KibanaPublicAccess = KibanaPublicAccess;
    }

    /**
     * Get <p>Kibana internal access status<li>OPEN: enable</li><li>CLOSE: disable</li></p> 
     * @return KibanaPrivateAccess <p>Kibana internal access status<li>OPEN: enable</li><li>CLOSE: disable</li></p>
     */
    public String getKibanaPrivateAccess() {
        return this.KibanaPrivateAccess;
    }

    /**
     * Set <p>Kibana internal access status<li>OPEN: enable</li><li>CLOSE: disable</li></p>
     * @param KibanaPrivateAccess <p>Kibana internal access status<li>OPEN: enable</li><li>CLOSE: disable</li></p>
     */
    public void setKibanaPrivateAccess(String KibanaPrivateAccess) {
        this.KibanaPrivateAccess = KibanaPrivateAccess;
    }

    /**
     * Get <p>Whether xpack security authentication is enabled for basic version 6.8 (and above versions)<li>1: not enabled</li><li>2: enabled</li></p> 
     * @return SecurityType <p>Whether xpack security authentication is enabled for basic version 6.8 (and above versions)<li>1: not enabled</li><li>2: enabled</li></p>
     */
    public Long getSecurityType() {
        return this.SecurityType;
    }

    /**
     * Set <p>Whether xpack security authentication is enabled for basic version 6.8 (and above versions)<li>1: not enabled</li><li>2: enabled</li></p>
     * @param SecurityType <p>Whether xpack security authentication is enabled for basic version 6.8 (and above versions)<li>1: not enabled</li><li>2: enabled</li></p>
     */
    public void setSecurityType(Long SecurityType) {
        this.SecurityType = SecurityType;
    }

    /**
     * Get <p>Scenario template type: 0, not enabled; 1, common scenarios; 2, log scenario; 3, search scenario</p> 
     * @return SceneType <p>Scenario template type: 0, not enabled; 1, common scenarios; 2, log scenario; 3, search scenario</p>
     */
    public Long getSceneType() {
        return this.SceneType;
    }

    /**
     * Set <p>Scenario template type: 0, not enabled; 1, common scenarios; 2, log scenario; 3, search scenario</p>
     * @param SceneType <p>Scenario template type: 0, not enabled; 1, common scenarios; 2, log scenario; 3, search scenario</p>
     */
    public void setSceneType(Long SceneType) {
        this.SceneType = SceneType;
    }

    /**
     * Get <p>Kibana configuration item</p> 
     * @return KibanaConfig <p>Kibana configuration item</p>
     */
    public String getKibanaConfig() {
        return this.KibanaConfig;
    }

    /**
     * Set <p>Kibana configuration item</p>
     * @param KibanaConfig <p>Kibana configuration item</p>
     */
    public void setKibanaConfig(String KibanaConfig) {
        this.KibanaConfig = KibanaConfig;
    }

    /**
     * Get <p>Kibana node information</p> 
     * @return KibanaNodeInfo <p>Kibana node information</p>
     */
    public KibanaNodeInfo getKibanaNodeInfo() {
        return this.KibanaNodeInfo;
    }

    /**
     * Set <p>Kibana node information</p>
     * @param KibanaNodeInfo <p>Kibana node information</p>
     */
    public void setKibanaNodeInfo(KibanaNodeInfo KibanaNodeInfo) {
        this.KibanaNodeInfo = KibanaNodeInfo;
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
     * Get <p>JDK type. Valid values: oracle, kona</p> 
     * @return Jdk <p>JDK type. Valid values: oracle, kona</p>
     */
    public String getJdk() {
        return this.Jdk;
    }

    /**
     * Set <p>JDK type. Valid values: oracle, kona</p>
     * @param Jdk <p>JDK type. Valid values: oracle, kona</p>
     */
    public void setJdk(String Jdk) {
        this.Jdk = Jdk;
    }

    /**
     * Get <p>Cluster network communication protocol</p> 
     * @return Protocol <p>Cluster network communication protocol</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>Cluster network communication protocol</p>
     * @param Protocol <p>Cluster network communication protocol</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>Security group id</p> 
     * @return SecurityGroups <p>Security group id</p>
     */
    public String [] getSecurityGroups() {
        return this.SecurityGroups;
    }

    /**
     * Set <p>Security group id</p>
     * @param SecurityGroups <p>Security group id</p>
     */
    public void setSecurityGroups(String [] SecurityGroups) {
        this.SecurityGroups = SecurityGroups;
    }

    /**
     * Get <p>Cold node specification<li>ES.S1.SMALL2: 1-core 2G</li><li>ES.S1.MEDIUM4: 2-core 4G</li><li>ES.S1.MEDIUM8: 2-core 8G</li><li>ES.S1.LARGE16: 4-core 16G</li><li>ES.S1.2XLARGE32: 8-core 32G</li><li>ES.S1.4XLARGE32: 16-core 32G</li><li>ES.S1.4XLARGE64: 16-core 64G</li></p> 
     * @return ColdNodeType <p>Cold node specification<li>ES.S1.SMALL2: 1-core 2G</li><li>ES.S1.MEDIUM4: 2-core 4G</li><li>ES.S1.MEDIUM8: 2-core 8G</li><li>ES.S1.LARGE16: 4-core 16G</li><li>ES.S1.2XLARGE32: 8-core 32G</li><li>ES.S1.4XLARGE32: 16-core 32G</li><li>ES.S1.4XLARGE64: 16-core 64G</li></p>
     */
    public String getColdNodeType() {
        return this.ColdNodeType;
    }

    /**
     * Set <p>Cold node specification<li>ES.S1.SMALL2: 1-core 2G</li><li>ES.S1.MEDIUM4: 2-core 4G</li><li>ES.S1.MEDIUM8: 2-core 8G</li><li>ES.S1.LARGE16: 4-core 16G</li><li>ES.S1.2XLARGE32: 8-core 32G</li><li>ES.S1.4XLARGE32: 16-core 32G</li><li>ES.S1.4XLARGE64: 16-core 64G</li></p>
     * @param ColdNodeType <p>Cold node specification<li>ES.S1.SMALL2: 1-core 2G</li><li>ES.S1.MEDIUM4: 2-core 4G</li><li>ES.S1.MEDIUM8: 2-core 8G</li><li>ES.S1.LARGE16: 4-core 16G</li><li>ES.S1.2XLARGE32: 8-core 32G</li><li>ES.S1.4XLARGE32: 16-core 32G</li><li>ES.S1.4XLARGE64: 16-core 64G</li></p>
     */
    public void setColdNodeType(String ColdNodeType) {
        this.ColdNodeType = ColdNodeType;
    }

    /**
     * Get <p>Number of cold nodes</p> 
     * @return ColdNodeNum <p>Number of cold nodes</p>
     */
    public Long getColdNodeNum() {
        return this.ColdNodeNum;
    }

    /**
     * Set <p>Number of cold nodes</p>
     * @param ColdNodeNum <p>Number of cold nodes</p>
     */
    public void setColdNodeNum(Long ColdNodeNum) {
        this.ColdNodeNum = ColdNodeNum;
    }

    /**
     * Get <p>Cold node CPU cores</p> 
     * @return ColdCpuNum <p>Cold node CPU cores</p>
     */
    public Long getColdCpuNum() {
        return this.ColdCpuNum;
    }

    /**
     * Set <p>Cold node CPU cores</p>
     * @param ColdCpuNum <p>Cold node CPU cores</p>
     */
    public void setColdCpuNum(Long ColdCpuNum) {
        this.ColdCpuNum = ColdCpuNum;
    }

    /**
     * Get <p>Cold node memory size (GB).</p> 
     * @return ColdMemSize <p>Cold node memory size (GB).</p>
     */
    public Long getColdMemSize() {
        return this.ColdMemSize;
    }

    /**
     * Set <p>Cold node memory size (GB).</p>
     * @param ColdMemSize <p>Cold node memory size (GB).</p>
     */
    public void setColdMemSize(Long ColdMemSize) {
        this.ColdMemSize = ColdMemSize;
    }

    /**
     * Get <p>Cold node disk type</p> 
     * @return ColdDiskType <p>Cold node disk type</p>
     */
    public String getColdDiskType() {
        return this.ColdDiskType;
    }

    /**
     * Set <p>Cold node disk type</p>
     * @param ColdDiskType <p>Cold node disk type</p>
     */
    public void setColdDiskType(String ColdDiskType) {
        this.ColdDiskType = ColdDiskType;
    }

    /**
     * Get <p>Cold node disk size (GB).</p> 
     * @return ColdDiskSize <p>Cold node disk size (GB).</p>
     */
    public Long getColdDiskSize() {
        return this.ColdDiskSize;
    }

    /**
     * Set <p>Cold node disk size (GB).</p>
     * @param ColdDiskSize <p>Cold node disk size (GB).</p>
     */
    public void setColdDiskSize(Long ColdDiskSize) {
        this.ColdDiskSize = ColdDiskSize;
    }

    /**
     * Get <p>Frozen node specification<li>ES.S1.SMALL2: 1-core 2GB</li><li>ES.S1.MEDIUM4: 2-core 4GB</li><li>ES.S1.MEDIUM8: 2-core 8GB</li><li>ES.S1.LARGE16: 4-core 16GB</li><li>ES.S1.2XLARGE32: 8-core 32GB</li><li>ES.S1.4XLARGE32: 16-core 32GB</li><li>ES.S1.4XLARGE64: 16-core 64GB</li></p> 
     * @return FrozenNodeType <p>Frozen node specification<li>ES.S1.SMALL2: 1-core 2GB</li><li>ES.S1.MEDIUM4: 2-core 4GB</li><li>ES.S1.MEDIUM8: 2-core 8GB</li><li>ES.S1.LARGE16: 4-core 16GB</li><li>ES.S1.2XLARGE32: 8-core 32GB</li><li>ES.S1.4XLARGE32: 16-core 32GB</li><li>ES.S1.4XLARGE64: 16-core 64GB</li></p>
     */
    public String getFrozenNodeType() {
        return this.FrozenNodeType;
    }

    /**
     * Set <p>Frozen node specification<li>ES.S1.SMALL2: 1-core 2GB</li><li>ES.S1.MEDIUM4: 2-core 4GB</li><li>ES.S1.MEDIUM8: 2-core 8GB</li><li>ES.S1.LARGE16: 4-core 16GB</li><li>ES.S1.2XLARGE32: 8-core 32GB</li><li>ES.S1.4XLARGE32: 16-core 32GB</li><li>ES.S1.4XLARGE64: 16-core 64GB</li></p>
     * @param FrozenNodeType <p>Frozen node specification<li>ES.S1.SMALL2: 1-core 2GB</li><li>ES.S1.MEDIUM4: 2-core 4GB</li><li>ES.S1.MEDIUM8: 2-core 8GB</li><li>ES.S1.LARGE16: 4-core 16GB</li><li>ES.S1.2XLARGE32: 8-core 32GB</li><li>ES.S1.4XLARGE32: 16-core 32GB</li><li>ES.S1.4XLARGE64: 16-core 64GB</li></p>
     */
    public void setFrozenNodeType(String FrozenNodeType) {
        this.FrozenNodeType = FrozenNodeType;
    }

    /**
     * Get <p>Number of frozen nodes</p> 
     * @return FrozenNodeNum <p>Number of frozen nodes</p>
     */
    public Long getFrozenNodeNum() {
        return this.FrozenNodeNum;
    }

    /**
     * Set <p>Number of frozen nodes</p>
     * @param FrozenNodeNum <p>Number of frozen nodes</p>
     */
    public void setFrozenNodeNum(Long FrozenNodeNum) {
        this.FrozenNodeNum = FrozenNodeNum;
    }

    /**
     * Get <p>Frozen node CPU cores</p> 
     * @return FrozenCpuNum <p>Frozen node CPU cores</p>
     */
    public Long getFrozenCpuNum() {
        return this.FrozenCpuNum;
    }

    /**
     * Set <p>Frozen node CPU cores</p>
     * @param FrozenCpuNum <p>Frozen node CPU cores</p>
     */
    public void setFrozenCpuNum(Long FrozenCpuNum) {
        this.FrozenCpuNum = FrozenCpuNum;
    }

    /**
     * Get <p>Frozen node memory size (GB).</p> 
     * @return FrozenMemSize <p>Frozen node memory size (GB).</p>
     */
    public Long getFrozenMemSize() {
        return this.FrozenMemSize;
    }

    /**
     * Set <p>Frozen node memory size (GB).</p>
     * @param FrozenMemSize <p>Frozen node memory size (GB).</p>
     */
    public void setFrozenMemSize(Long FrozenMemSize) {
        this.FrozenMemSize = FrozenMemSize;
    }

    /**
     * Get <p>Frozen node disk type</p> 
     * @return FrozenDiskType <p>Frozen node disk type</p>
     */
    public String getFrozenDiskType() {
        return this.FrozenDiskType;
    }

    /**
     * Set <p>Frozen node disk type</p>
     * @param FrozenDiskType <p>Frozen node disk type</p>
     */
    public void setFrozenDiskType(String FrozenDiskType) {
        this.FrozenDiskType = FrozenDiskType;
    }

    /**
     * Get <p>Frozen node disk size (GB).</p> 
     * @return FrozenDiskSize <p>Frozen node disk size (GB).</p>
     */
    public Long getFrozenDiskSize() {
        return this.FrozenDiskSize;
    }

    /**
     * Set <p>Frozen node disk size (GB).</p>
     * @param FrozenDiskSize <p>Frozen node disk size (GB).</p>
     */
    public void setFrozenDiskSize(Long FrozenDiskSize) {
        this.FrozenDiskSize = FrozenDiskSize;
    }

    /**
     * Get <p>Cluster health status: -1 unknown; 0 Green; 1 Yellow; 2 Red</p> 
     * @return HealthStatus <p>Cluster health status: -1 unknown; 0 Green; 1 Yellow; 2 Red</p>
     */
    public Long getHealthStatus() {
        return this.HealthStatus;
    }

    /**
     * Set <p>Cluster health status: -1 unknown; 0 Green; 1 Yellow; 2 Red</p>
     * @param HealthStatus <p>Cluster health status: -1 unknown; 0 Green; 1 Yellow; 2 Red</p>
     */
    public void setHealthStatus(Long HealthStatus) {
        this.HealthStatus = HealthStatus;
    }

    /**
     * Get <p>Intracluster network url for https.</p> 
     * @return EsPrivateUrl <p>Intracluster network url for https.</p>
     */
    public String getEsPrivateUrl() {
        return this.EsPrivateUrl;
    }

    /**
     * Set <p>Intracluster network url for https.</p>
     * @param EsPrivateUrl <p>Intracluster network url for https.</p>
     */
    public void setEsPrivateUrl(String EsPrivateUrl) {
        this.EsPrivateUrl = EsPrivateUrl;
    }

    /**
     * Get <p>https cluster private network domain name</p> 
     * @return EsPrivateDomain <p>https cluster private network domain name</p>
     */
    public String getEsPrivateDomain() {
        return this.EsPrivateDomain;
    }

    /**
     * Set <p>https cluster private network domain name</p>
     * @param EsPrivateDomain <p>https cluster private network domain name</p>
     */
    public void setEsPrivateDomain(String EsPrivateDomain) {
        this.EsPrivateDomain = EsPrivateDomain;
    }

    /**
     * Get <p>Cluster configuration group information.</p> 
     * @return EsConfigSets <p>Cluster configuration group information.</p>
     */
    public EsConfigSetInfo [] getEsConfigSets() {
        return this.EsConfigSets;
    }

    /**
     * Set <p>Cluster configuration group information.</p>
     * @param EsConfigSets <p>Cluster configuration group information.</p>
     */
    public void setEsConfigSets(EsConfigSetInfo [] EsConfigSets) {
        this.EsConfigSets = EsConfigSets;
    }

    /**
     * Get <p>Cluster maintenance time slot</p> 
     * @return OperationDuration <p>Cluster maintenance time slot</p>
     */
    public OperationDuration getOperationDuration() {
        return this.OperationDuration;
    }

    /**
     * Set <p>Cluster maintenance time slot</p>
     * @param OperationDuration <p>Cluster maintenance time slot</p>
     */
    public void setOperationDuration(OperationDuration OperationDuration) {
        this.OperationDuration = OperationDuration;
    }

    /**
     * Get <p>web node list</p> 
     * @return OptionalWebServiceInfos <p>web node list</p>
     */
    public OptionalWebServiceInfo [] getOptionalWebServiceInfos() {
        return this.OptionalWebServiceInfos;
    }

    /**
     * Set <p>web node list</p>
     * @param OptionalWebServiceInfos <p>web node list</p>
     */
    public void setOptionalWebServiceInfos(OptionalWebServiceInfo [] OptionalWebServiceInfos) {
        this.OptionalWebServiceInfos = OptionalWebServiceInfos;
    }

    /**
     * Get <p>Autonomous index switch</p> 
     * @return AutoIndexEnabled <p>Autonomous index switch</p>
     */
    public Boolean getAutoIndexEnabled() {
        return this.AutoIndexEnabled;
    }

    /**
     * Set <p>Autonomous index switch</p>
     * @param AutoIndexEnabled <p>Autonomous index switch</p>
     */
    public void setAutoIndexEnabled(Boolean AutoIndexEnabled) {
        this.AutoIndexEnabled = AutoIndexEnabled;
    }

    /**
     * Get <p>Whether storage and computation separation is supported.</p> 
     * @return EnableHybridStorage <p>Whether storage and computation separation is supported.</p>
     */
    public Boolean getEnableHybridStorage() {
        return this.EnableHybridStorage;
    }

    /**
     * Set <p>Whether storage and computation separation is supported.</p>
     * @param EnableHybridStorage <p>Whether storage and computation separation is supported.</p>
     */
    public void setEnableHybridStorage(Boolean EnableHybridStorage) {
        this.EnableHybridStorage = EnableHybridStorage;
    }

    /**
     * Get <p>Process progress.</p> 
     * @return ProcessPercent <p>Process progress.</p>
     */
    public Float getProcessPercent() {
        return this.ProcessPercent;
    }

    /**
     * Set <p>Process progress.</p>
     * @param ProcessPercent <p>Process progress.</p>
     */
    public void setProcessPercent(Float ProcessPercent) {
        this.ProcessPercent = ProcessPercent;
    }

    /**
     * Get <p>Kibana alerting public network alert policy<li>OPEN: enable</li><li>CLOSE: disable</li></p> 
     * @return KibanaAlteringPublicAccess <p>Kibana alerting public network alert policy<li>OPEN: enable</li><li>CLOSE: disable</li></p>
     */
    public String getKibanaAlteringPublicAccess() {
        return this.KibanaAlteringPublicAccess;
    }

    /**
     * Set <p>Kibana alerting public network alert policy<li>OPEN: enable</li><li>CLOSE: disable</li></p>
     * @param KibanaAlteringPublicAccess <p>Kibana alerting public network alert policy<li>OPEN: enable</li><li>CLOSE: disable</li></p>
     */
    public void setKibanaAlteringPublicAccess(String KibanaAlteringPublicAccess) {
        this.KibanaAlteringPublicAccess = KibanaAlteringPublicAccess;
    }

    /**
     * Get <p>Whether there is a kernel update this month: false (no) and true (yes).</p> 
     * @return HasKernelUpgrade <p>Whether there is a kernel update this month: false (no) and true (yes).</p>
     */
    public Boolean getHasKernelUpgrade() {
        return this.HasKernelUpgrade;
    }

    /**
     * Set <p>Whether there is a kernel update this month: false (no) and true (yes).</p>
     * @param HasKernelUpgrade <p>Whether there is a kernel update this month: false (no) and true (yes).</p>
     */
    public void setHasKernelUpgrade(Boolean HasKernelUpgrade) {
        this.HasKernelUpgrade = HasKernelUpgrade;
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
     * Get <p>kibana intranet vip</p> 
     * @return KibanaPrivateVip <p>kibana intranet vip</p>
     */
    public String getKibanaPrivateVip() {
        return this.KibanaPrivateVip;
    }

    /**
     * Set <p>kibana intranet vip</p>
     * @param KibanaPrivateVip <p>kibana intranet vip</p>
     */
    public void setKibanaPrivateVip(String KibanaPrivateVip) {
        this.KibanaPrivateVip = KibanaPrivateVip;
    }

    /**
     * Get <p>Customize the private network url of kibana</p> 
     * @return CustomKibanaPrivateUrl <p>Customize the private network url of kibana</p>
     */
    public String getCustomKibanaPrivateUrl() {
        return this.CustomKibanaPrivateUrl;
    }

    /**
     * Set <p>Customize the private network url of kibana</p>
     * @param CustomKibanaPrivateUrl <p>Customize the private network url of kibana</p>
     */
    public void setCustomKibanaPrivateUrl(String CustomKibanaPrivateUrl) {
        this.CustomKibanaPrivateUrl = CustomKibanaPrivateUrl;
    }

    /**
     * Get <p>Node outbound access detailed information.</p> 
     * @return OutboundPublicAcls <p>Node outbound access detailed information.</p>
     */
    public OutboundPublicAcl [] getOutboundPublicAcls() {
        return this.OutboundPublicAcls;
    }

    /**
     * Set <p>Node outbound access detailed information.</p>
     * @param OutboundPublicAcls <p>Node outbound access detailed information.</p>
     */
    public void setOutboundPublicAcls(OutboundPublicAcl [] OutboundPublicAcls) {
        this.OutboundPublicAcls = OutboundPublicAcls;
    }

    /**
     * Get <p>Network connection solution</p> 
     * @return NetConnectScheme <p>Network connection solution</p>
     */
    public String getNetConnectScheme() {
        return this.NetConnectScheme;
    }

    /**
     * Set <p>Network connection solution</p>
     * @param NetConnectScheme <p>Network connection solution</p>
     */
    public void setNetConnectScheme(String NetConnectScheme) {
        this.NetConnectScheme = NetConnectScheme;
    }

    /**
     * Get <p>Placement group related parameters</p> 
     * @return DisasterRecoverGroupAffinity <p>Placement group related parameters</p>
     */
    public Long getDisasterRecoverGroupAffinity() {
        return this.DisasterRecoverGroupAffinity;
    }

    /**
     * Set <p>Placement group related parameters</p>
     * @param DisasterRecoverGroupAffinity <p>Placement group related parameters</p>
     */
    public void setDisasterRecoverGroupAffinity(Long DisasterRecoverGroupAffinity) {
        this.DisasterRecoverGroupAffinity = DisasterRecoverGroupAffinity;
    }

    /**
     * Get <p>Sub-product ID enumeration values: open source edition: "sp_es_io2", basic version: "sp_es_basic", platinum version: "sp_es_platinum", AI Search Enhancement Edition: "sp_es_aisearch", enterprise edition: "sp_es_enterprise", CDC platinum version: "sp_es_CDC_platinum", Log Enhancement Edition: "sp_es_enlogging", tsearch: "sp_tsearch_io2", logstash: "sp_es_logstash". It can be empty. When it is empty, the backend maps this field based on LicenseType.</p> 
     * @return SubProductCode <p>Sub-product ID enumeration values: open source edition: "sp_es_io2", basic version: "sp_es_basic", platinum version: "sp_es_platinum", AI Search Enhancement Edition: "sp_es_aisearch", enterprise edition: "sp_es_enterprise", CDC platinum version: "sp_es_CDC_platinum", Log Enhancement Edition: "sp_es_enlogging", tsearch: "sp_tsearch_io2", logstash: "sp_es_logstash". It can be empty. When it is empty, the backend maps this field based on LicenseType.</p>
     */
    public String getSubProductCode() {
        return this.SubProductCode;
    }

    /**
     * Set <p>Sub-product ID enumeration values: open source edition: "sp_es_io2", basic version: "sp_es_basic", platinum version: "sp_es_platinum", AI Search Enhancement Edition: "sp_es_aisearch", enterprise edition: "sp_es_enterprise", CDC platinum version: "sp_es_CDC_platinum", Log Enhancement Edition: "sp_es_enlogging", tsearch: "sp_tsearch_io2", logstash: "sp_es_logstash". It can be empty. When it is empty, the backend maps this field based on LicenseType.</p>
     * @param SubProductCode <p>Sub-product ID enumeration values: open source edition: "sp_es_io2", basic version: "sp_es_basic", platinum version: "sp_es_platinum", AI Search Enhancement Edition: "sp_es_aisearch", enterprise edition: "sp_es_enterprise", CDC platinum version: "sp_es_CDC_platinum", Log Enhancement Edition: "sp_es_enlogging", tsearch: "sp_tsearch_io2", logstash: "sp_es_logstash". It can be empty. When it is empty, the backend maps this field based on LicenseType.</p>
     */
    public void setSubProductCode(String SubProductCode) {
        this.SubProductCode = SubProductCode;
    }

    /**
     * Get <p>Storage-compute separation cos usage, Unit: M</p> 
     * @return CosBucketStorageSize <p>Storage-compute separation cos usage, Unit: M</p>
     */
    public Long getCosBucketStorageSize() {
        return this.CosBucketStorageSize;
    }

    /**
     * Set <p>Storage-compute separation cos usage, Unit: M</p>
     * @param CosBucketStorageSize <p>Storage-compute separation cos usage, Unit: M</p>
     */
    public void setCosBucketStorageSize(Long CosBucketStorageSize) {
        this.CosBucketStorageSize = CosBucketStorageSize;
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
     * Get <p>Whether there is an asynchronous task scheduling for placement groups</p> 
     * @return EnableScheduleRecoverGroup <p>Whether there is an asynchronous task scheduling for placement groups</p>
     */
    public Boolean getEnableScheduleRecoverGroup() {
        return this.EnableScheduleRecoverGroup;
    }

    /**
     * Set <p>Whether there is an asynchronous task scheduling for placement groups</p>
     * @param EnableScheduleRecoverGroup <p>Whether there is an asynchronous task scheduling for placement groups</p>
     */
    public void setEnableScheduleRecoverGroup(Boolean EnableScheduleRecoverGroup) {
        this.EnableScheduleRecoverGroup = EnableScheduleRecoverGroup;
    }

    /**
     * Get <p>The time when an asynchronous task is scheduled</p> 
     * @return EnableScheduleOperationDuration <p>The time when an asynchronous task is scheduled</p>
     */
    public EnableScheduleOperationDuration getEnableScheduleOperationDuration() {
        return this.EnableScheduleOperationDuration;
    }

    /**
     * Set <p>The time when an asynchronous task is scheduled</p>
     * @param EnableScheduleOperationDuration <p>The time when an asynchronous task is scheduled</p>
     */
    public void setEnableScheduleOperationDuration(EnableScheduleOperationDuration EnableScheduleOperationDuration) {
        this.EnableScheduleOperationDuration = EnableScheduleOperationDuration;
    }

    /**
     * Get <p>Cluster protection: OPEN: enable, CLOSE: disable</p> 
     * @return EnableDestroyProtection <p>Cluster protection: OPEN: enable, CLOSE: disable</p>
     */
    public String getEnableDestroyProtection() {
        return this.EnableDestroyProtection;
    }

    /**
     * Set <p>Cluster protection: OPEN: enable, CLOSE: disable</p>
     * @param EnableDestroyProtection <p>Cluster protection: OPEN: enable, CLOSE: disable</p>
     */
    public void setEnableDestroyProtection(String EnableDestroyProtection) {
        this.EnableDestroyProtection = EnableDestroyProtection;
    }

    /**
     * Get <p>kibana intranet access address</p> 
     * @return ShowKibanaIpPort <p>kibana intranet access address</p>
     */
    public String getShowKibanaIpPort() {
        return this.ShowKibanaIpPort;
    }

    /**
     * Set <p>kibana intranet access address</p>
     * @param ShowKibanaIpPort <p>kibana intranet access address</p>
     */
    public void setShowKibanaIpPort(String ShowKibanaIpPort) {
        this.ShowKibanaIpPort = ShowKibanaIpPort;
    }

    /**
     * Get <p>Whether it is a CDZLite availability zone</p> 
     * @return IsCdzLite <p>Whether it is a CDZLite availability zone</p>
     */
    public Boolean getIsCdzLite() {
        return this.IsCdzLite;
    }

    /**
     * Set <p>Whether it is a CDZLite availability zone</p>
     * @param IsCdzLite <p>Whether it is a CDZLite availability zone</p>
     */
    public void setIsCdzLite(Boolean IsCdzLite) {
        this.IsCdzLite = IsCdzLite;
    }

    /**
     * Get <p>Cluster private network tcp address</p> 
     * @return EsPrivateTcpUrl <p>Cluster private network tcp address</p>
     */
    public String getEsPrivateTcpUrl() {
        return this.EsPrivateTcpUrl;
    }

    /**
     * Set <p>Cluster private network tcp address</p>
     * @param EsPrivateTcpUrl <p>Cluster private network tcp address</p>
     */
    public void setEsPrivateTcpUrl(String EsPrivateTcpUrl) {
        this.EsPrivateTcpUrl = EsPrivateTcpUrl;
    }

    /**
     * Get <p>Whether it is in the recycle bin</p><p>Default value: false</p> 
     * @return IsInRecycleBin <p>Whether it is in the recycle bin</p><p>Default value: false</p>
     */
    public Boolean getIsInRecycleBin() {
        return this.IsInRecycleBin;
    }

    /**
     * Set <p>Whether it is in the recycle bin</p><p>Default value: false</p>
     * @param IsInRecycleBin <p>Whether it is in the recycle bin</p><p>Default value: false</p>
     */
    public void setIsInRecycleBin(Boolean IsInRecycleBin) {
        this.IsInRecycleBin = IsInRecycleBin;
    }

    /**
     * Get <p>Is locked in the recycle bin</p><p>Default value: false</p> 
     * @return RecycleLockEnabled <p>Is locked in the recycle bin</p><p>Default value: false</p>
     */
    public Boolean getRecycleLockEnabled() {
        return this.RecycleLockEnabled;
    }

    /**
     * Set <p>Is locked in the recycle bin</p><p>Default value: false</p>
     * @param RecycleLockEnabled <p>Is locked in the recycle bin</p><p>Default value: false</p>
     */
    public void setRecycleLockEnabled(Boolean RecycleLockEnabled) {
        this.RecycleLockEnabled = RecycleLockEnabled;
    }

    /**
     * Get <p>The time when termination is expected</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p> 
     * @return MayDestroyPoint <p>The time when termination is expected</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     */
    public String getMayDestroyPoint() {
        return this.MayDestroyPoint;
    }

    /**
     * Set <p>The time when termination is expected</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     * @param MayDestroyPoint <p>The time when termination is expected</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     */
    public void setMayDestroyPoint(String MayDestroyPoint) {
        this.MayDestroyPoint = MayDestroyPoint;
    }

    /**
     * Get <p>The time when termination is delayed</p><p>Unit: day</p> 
     * @return DelayDestroyInterval <p>The time when termination is delayed</p><p>Unit: day</p>
     */
    public Long getDelayDestroyInterval() {
        return this.DelayDestroyInterval;
    }

    /**
     * Set <p>The time when termination is delayed</p><p>Unit: day</p>
     * @param DelayDestroyInterval <p>The time when termination is delayed</p><p>Unit: day</p>
     */
    public void setDelayDestroyInterval(Long DelayDestroyInterval) {
        this.DelayDestroyInterval = DelayDestroyInterval;
    }

    /**
     * Get <p>Enable automatic replacement of unhealthy nodes. 0: disable, 1: enable</p> 
     * @return EnableAutoReplace <p>Enable automatic replacement of unhealthy nodes. 0: disable, 1: enable</p>
     */
    public Long getEnableAutoReplace() {
        return this.EnableAutoReplace;
    }

    /**
     * Set <p>Enable automatic replacement of unhealthy nodes. 0: disable, 1: enable</p>
     * @param EnableAutoReplace <p>Enable automatic replacement of unhealthy nodes. 0: disable, 1: enable</p>
     */
    public void setEnableAutoReplace(Long EnableAutoReplace) {
        this.EnableAutoReplace = EnableAutoReplace;
    }

    /**
     * Get <p>Enable mtls. 0: disable, 1: enable</p> 
     * @return OpenMTLS <p>Enable mtls. 0: disable, 1: enable</p>
     */
    public Long getOpenMTLS() {
        return this.OpenMTLS;
    }

    /**
     * Set <p>Enable mtls. 0: disable, 1: enable</p>
     * @param OpenMTLS <p>Enable mtls. 0: disable, 1: enable</p>
     */
    public void setOpenMTLS(Long OpenMTLS) {
        this.OpenMTLS = OpenMTLS;
    }

    /**
     * Get <p>Certificate type</p> 
     * @return ServerCertSource <p>Certificate type</p>
     */
    public String getServerCertSource() {
        return this.ServerCertSource;
    }

    /**
     * Set <p>Certificate type</p>
     * @param ServerCertSource <p>Certificate type</p>
     */
    public void setServerCertSource(String ServerCertSource) {
        this.ServerCertSource = ServerCertSource;
    }

    /**
     * Get <p>VIP pending migration for the cluster</p> 
     * @return OldEsVip <p>VIP pending migration for the cluster</p>
     */
    public String getOldEsVip() {
        return this.OldEsVip;
    }

    /**
     * Set <p>VIP pending migration for the cluster</p>
     * @param OldEsVip <p>VIP pending migration for the cluster</p>
     */
    public void setOldEsVip(String OldEsVip) {
        this.OldEsVip = OldEsVip;
    }

    /**
     * Get <p>Cluster TCP address to be migrated</p> 
     * @return OldEsPrivateTcpUrl <p>Cluster TCP address to be migrated</p>
     */
    public String getOldEsPrivateTcpUrl() {
        return this.OldEsPrivateTcpUrl;
    }

    /**
     * Set <p>Cluster TCP address to be migrated</p>
     * @param OldEsPrivateTcpUrl <p>Cluster TCP address to be migrated</p>
     */
    public void setOldEsPrivateTcpUrl(String OldEsPrivateTcpUrl) {
        this.OldEsPrivateTcpUrl = OldEsPrivateTcpUrl;
    }

    /**
     * Get <p>Whether to take old nodes offline from the VIP</p> 
     * @return NeedOfflineOldNodesNotify <p>Whether to take old nodes offline from the VIP</p>
     */
    public Boolean getNeedOfflineOldNodesNotify() {
        return this.NeedOfflineOldNodesNotify;
    }

    /**
     * Set <p>Whether to take old nodes offline from the VIP</p>
     * @param NeedOfflineOldNodesNotify <p>Whether to take old nodes offline from the VIP</p>
     */
    public void setNeedOfflineOldNodesNotify(Boolean NeedOfflineOldNodesNotify) {
        this.NeedOfflineOldNodesNotify = NeedOfflineOldNodesNotify;
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
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.VpcUid != null) {
            this.VpcUid = new String(source.VpcUid);
        }
        if (source.SubnetUid != null) {
            this.SubnetUid = new String(source.SubnetUid);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new String(source.RenewFlag);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.ChargePeriod != null) {
            this.ChargePeriod = new Long(source.ChargePeriod);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.NodeNum != null) {
            this.NodeNum = new Long(source.NodeNum);
        }
        if (source.CpuNum != null) {
            this.CpuNum = new Long(source.CpuNum);
        }
        if (source.MemSize != null) {
            this.MemSize = new Long(source.MemSize);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.EsDomain != null) {
            this.EsDomain = new String(source.EsDomain);
        }
        if (source.EsVip != null) {
            this.EsVip = new String(source.EsVip);
        }
        if (source.EsPort != null) {
            this.EsPort = new Long(source.EsPort);
        }
        if (source.KibanaUrl != null) {
            this.KibanaUrl = new String(source.KibanaUrl);
        }
        if (source.EsVersion != null) {
            this.EsVersion = new String(source.EsVersion);
        }
        if (source.EsConfig != null) {
            this.EsConfig = new String(source.EsConfig);
        }
        if (source.EsAcl != null) {
            this.EsAcl = new EsAcl(source.EsAcl);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Deadline != null) {
            this.Deadline = new String(source.Deadline);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new Long(source.InstanceType);
        }
        if (source.IkConfig != null) {
            this.IkConfig = new EsDictionaryInfo(source.IkConfig);
        }
        if (source.MasterNodeInfo != null) {
            this.MasterNodeInfo = new MasterNodeInfo(source.MasterNodeInfo);
        }
        if (source.CosBackup != null) {
            this.CosBackup = new CosBackup(source.CosBackup);
        }
        if (source.AllowCosBackup != null) {
            this.AllowCosBackup = new Boolean(source.AllowCosBackup);
        }
        if (source.TagList != null) {
            this.TagList = new TagInfo[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new TagInfo(source.TagList[i]);
            }
        }
        if (source.LicenseType != null) {
            this.LicenseType = new String(source.LicenseType);
        }
        if (source.RealLicenseType != null) {
            this.RealLicenseType = new String(source.RealLicenseType);
        }
        if (source.EnableHotWarmMode != null) {
            this.EnableHotWarmMode = new Boolean(source.EnableHotWarmMode);
        }
        if (source.WarmNodeType != null) {
            this.WarmNodeType = new String(source.WarmNodeType);
        }
        if (source.WarmNodeNum != null) {
            this.WarmNodeNum = new Long(source.WarmNodeNum);
        }
        if (source.WarmCpuNum != null) {
            this.WarmCpuNum = new Long(source.WarmCpuNum);
        }
        if (source.WarmMemSize != null) {
            this.WarmMemSize = new Long(source.WarmMemSize);
        }
        if (source.WarmDiskType != null) {
            this.WarmDiskType = new String(source.WarmDiskType);
        }
        if (source.WarmDiskSize != null) {
            this.WarmDiskSize = new Long(source.WarmDiskSize);
        }
        if (source.NodeInfoList != null) {
            this.NodeInfoList = new NodeInfo[source.NodeInfoList.length];
            for (int i = 0; i < source.NodeInfoList.length; i++) {
                this.NodeInfoList[i] = new NodeInfo(source.NodeInfoList[i]);
            }
        }
        if (source.EsPublicUrl != null) {
            this.EsPublicUrl = new String(source.EsPublicUrl);
        }
        if (source.MultiZoneInfo != null) {
            this.MultiZoneInfo = new ZoneDetail[source.MultiZoneInfo.length];
            for (int i = 0; i < source.MultiZoneInfo.length; i++) {
                this.MultiZoneInfo[i] = new ZoneDetail(source.MultiZoneInfo[i]);
            }
        }
        if (source.DeployMode != null) {
            this.DeployMode = new Long(source.DeployMode);
        }
        if (source.PublicAccess != null) {
            this.PublicAccess = new String(source.PublicAccess);
        }
        if (source.EsPublicAcl != null) {
            this.EsPublicAcl = new EsAcl(source.EsPublicAcl);
        }
        if (source.KibanaPrivateUrl != null) {
            this.KibanaPrivateUrl = new String(source.KibanaPrivateUrl);
        }
        if (source.KibanaPublicAccess != null) {
            this.KibanaPublicAccess = new String(source.KibanaPublicAccess);
        }
        if (source.KibanaPrivateAccess != null) {
            this.KibanaPrivateAccess = new String(source.KibanaPrivateAccess);
        }
        if (source.SecurityType != null) {
            this.SecurityType = new Long(source.SecurityType);
        }
        if (source.SceneType != null) {
            this.SceneType = new Long(source.SceneType);
        }
        if (source.KibanaConfig != null) {
            this.KibanaConfig = new String(source.KibanaConfig);
        }
        if (source.KibanaNodeInfo != null) {
            this.KibanaNodeInfo = new KibanaNodeInfo(source.KibanaNodeInfo);
        }
        if (source.WebNodeTypeInfo != null) {
            this.WebNodeTypeInfo = new WebNodeTypeInfo(source.WebNodeTypeInfo);
        }
        if (source.Jdk != null) {
            this.Jdk = new String(source.Jdk);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.SecurityGroups != null) {
            this.SecurityGroups = new String[source.SecurityGroups.length];
            for (int i = 0; i < source.SecurityGroups.length; i++) {
                this.SecurityGroups[i] = new String(source.SecurityGroups[i]);
            }
        }
        if (source.ColdNodeType != null) {
            this.ColdNodeType = new String(source.ColdNodeType);
        }
        if (source.ColdNodeNum != null) {
            this.ColdNodeNum = new Long(source.ColdNodeNum);
        }
        if (source.ColdCpuNum != null) {
            this.ColdCpuNum = new Long(source.ColdCpuNum);
        }
        if (source.ColdMemSize != null) {
            this.ColdMemSize = new Long(source.ColdMemSize);
        }
        if (source.ColdDiskType != null) {
            this.ColdDiskType = new String(source.ColdDiskType);
        }
        if (source.ColdDiskSize != null) {
            this.ColdDiskSize = new Long(source.ColdDiskSize);
        }
        if (source.FrozenNodeType != null) {
            this.FrozenNodeType = new String(source.FrozenNodeType);
        }
        if (source.FrozenNodeNum != null) {
            this.FrozenNodeNum = new Long(source.FrozenNodeNum);
        }
        if (source.FrozenCpuNum != null) {
            this.FrozenCpuNum = new Long(source.FrozenCpuNum);
        }
        if (source.FrozenMemSize != null) {
            this.FrozenMemSize = new Long(source.FrozenMemSize);
        }
        if (source.FrozenDiskType != null) {
            this.FrozenDiskType = new String(source.FrozenDiskType);
        }
        if (source.FrozenDiskSize != null) {
            this.FrozenDiskSize = new Long(source.FrozenDiskSize);
        }
        if (source.HealthStatus != null) {
            this.HealthStatus = new Long(source.HealthStatus);
        }
        if (source.EsPrivateUrl != null) {
            this.EsPrivateUrl = new String(source.EsPrivateUrl);
        }
        if (source.EsPrivateDomain != null) {
            this.EsPrivateDomain = new String(source.EsPrivateDomain);
        }
        if (source.EsConfigSets != null) {
            this.EsConfigSets = new EsConfigSetInfo[source.EsConfigSets.length];
            for (int i = 0; i < source.EsConfigSets.length; i++) {
                this.EsConfigSets[i] = new EsConfigSetInfo(source.EsConfigSets[i]);
            }
        }
        if (source.OperationDuration != null) {
            this.OperationDuration = new OperationDuration(source.OperationDuration);
        }
        if (source.OptionalWebServiceInfos != null) {
            this.OptionalWebServiceInfos = new OptionalWebServiceInfo[source.OptionalWebServiceInfos.length];
            for (int i = 0; i < source.OptionalWebServiceInfos.length; i++) {
                this.OptionalWebServiceInfos[i] = new OptionalWebServiceInfo(source.OptionalWebServiceInfos[i]);
            }
        }
        if (source.AutoIndexEnabled != null) {
            this.AutoIndexEnabled = new Boolean(source.AutoIndexEnabled);
        }
        if (source.EnableHybridStorage != null) {
            this.EnableHybridStorage = new Boolean(source.EnableHybridStorage);
        }
        if (source.ProcessPercent != null) {
            this.ProcessPercent = new Float(source.ProcessPercent);
        }
        if (source.KibanaAlteringPublicAccess != null) {
            this.KibanaAlteringPublicAccess = new String(source.KibanaAlteringPublicAccess);
        }
        if (source.HasKernelUpgrade != null) {
            this.HasKernelUpgrade = new Boolean(source.HasKernelUpgrade);
        }
        if (source.CdcId != null) {
            this.CdcId = new String(source.CdcId);
        }
        if (source.KibanaPrivateVip != null) {
            this.KibanaPrivateVip = new String(source.KibanaPrivateVip);
        }
        if (source.CustomKibanaPrivateUrl != null) {
            this.CustomKibanaPrivateUrl = new String(source.CustomKibanaPrivateUrl);
        }
        if (source.OutboundPublicAcls != null) {
            this.OutboundPublicAcls = new OutboundPublicAcl[source.OutboundPublicAcls.length];
            for (int i = 0; i < source.OutboundPublicAcls.length; i++) {
                this.OutboundPublicAcls[i] = new OutboundPublicAcl(source.OutboundPublicAcls[i]);
            }
        }
        if (source.NetConnectScheme != null) {
            this.NetConnectScheme = new String(source.NetConnectScheme);
        }
        if (source.DisasterRecoverGroupAffinity != null) {
            this.DisasterRecoverGroupAffinity = new Long(source.DisasterRecoverGroupAffinity);
        }
        if (source.SubProductCode != null) {
            this.SubProductCode = new String(source.SubProductCode);
        }
        if (source.CosBucketStorageSize != null) {
            this.CosBucketStorageSize = new Long(source.CosBucketStorageSize);
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
        if (source.EnableDestroyProtection != null) {
            this.EnableDestroyProtection = new String(source.EnableDestroyProtection);
        }
        if (source.ShowKibanaIpPort != null) {
            this.ShowKibanaIpPort = new String(source.ShowKibanaIpPort);
        }
        if (source.IsCdzLite != null) {
            this.IsCdzLite = new Boolean(source.IsCdzLite);
        }
        if (source.EsPrivateTcpUrl != null) {
            this.EsPrivateTcpUrl = new String(source.EsPrivateTcpUrl);
        }
        if (source.IsInRecycleBin != null) {
            this.IsInRecycleBin = new Boolean(source.IsInRecycleBin);
        }
        if (source.RecycleLockEnabled != null) {
            this.RecycleLockEnabled = new Boolean(source.RecycleLockEnabled);
        }
        if (source.MayDestroyPoint != null) {
            this.MayDestroyPoint = new String(source.MayDestroyPoint);
        }
        if (source.DelayDestroyInterval != null) {
            this.DelayDestroyInterval = new Long(source.DelayDestroyInterval);
        }
        if (source.EnableAutoReplace != null) {
            this.EnableAutoReplace = new Long(source.EnableAutoReplace);
        }
        if (source.OpenMTLS != null) {
            this.OpenMTLS = new Long(source.OpenMTLS);
        }
        if (source.ServerCertSource != null) {
            this.ServerCertSource = new String(source.ServerCertSource);
        }
        if (source.OldEsVip != null) {
            this.OldEsVip = new String(source.OldEsVip);
        }
        if (source.OldEsPrivateTcpUrl != null) {
            this.OldEsPrivateTcpUrl = new String(source.OldEsPrivateTcpUrl);
        }
        if (source.NeedOfflineOldNodesNotify != null) {
            this.NeedOfflineOldNodesNotify = new Boolean(source.NeedOfflineOldNodesNotify);
        }
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
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "ChargePeriod", this.ChargePeriod);
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
        this.setParamSimple(map, prefix + "RealLicenseType", this.RealLicenseType);
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
        this.setParamObj(map, prefix + "KibanaNodeInfo.", this.KibanaNodeInfo);
        this.setParamObj(map, prefix + "WebNodeTypeInfo.", this.WebNodeTypeInfo);
        this.setParamSimple(map, prefix + "Jdk", this.Jdk);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamArraySimple(map, prefix + "SecurityGroups.", this.SecurityGroups);
        this.setParamSimple(map, prefix + "ColdNodeType", this.ColdNodeType);
        this.setParamSimple(map, prefix + "ColdNodeNum", this.ColdNodeNum);
        this.setParamSimple(map, prefix + "ColdCpuNum", this.ColdCpuNum);
        this.setParamSimple(map, prefix + "ColdMemSize", this.ColdMemSize);
        this.setParamSimple(map, prefix + "ColdDiskType", this.ColdDiskType);
        this.setParamSimple(map, prefix + "ColdDiskSize", this.ColdDiskSize);
        this.setParamSimple(map, prefix + "FrozenNodeType", this.FrozenNodeType);
        this.setParamSimple(map, prefix + "FrozenNodeNum", this.FrozenNodeNum);
        this.setParamSimple(map, prefix + "FrozenCpuNum", this.FrozenCpuNum);
        this.setParamSimple(map, prefix + "FrozenMemSize", this.FrozenMemSize);
        this.setParamSimple(map, prefix + "FrozenDiskType", this.FrozenDiskType);
        this.setParamSimple(map, prefix + "FrozenDiskSize", this.FrozenDiskSize);
        this.setParamSimple(map, prefix + "HealthStatus", this.HealthStatus);
        this.setParamSimple(map, prefix + "EsPrivateUrl", this.EsPrivateUrl);
        this.setParamSimple(map, prefix + "EsPrivateDomain", this.EsPrivateDomain);
        this.setParamArrayObj(map, prefix + "EsConfigSets.", this.EsConfigSets);
        this.setParamObj(map, prefix + "OperationDuration.", this.OperationDuration);
        this.setParamArrayObj(map, prefix + "OptionalWebServiceInfos.", this.OptionalWebServiceInfos);
        this.setParamSimple(map, prefix + "AutoIndexEnabled", this.AutoIndexEnabled);
        this.setParamSimple(map, prefix + "EnableHybridStorage", this.EnableHybridStorage);
        this.setParamSimple(map, prefix + "ProcessPercent", this.ProcessPercent);
        this.setParamSimple(map, prefix + "KibanaAlteringPublicAccess", this.KibanaAlteringPublicAccess);
        this.setParamSimple(map, prefix + "HasKernelUpgrade", this.HasKernelUpgrade);
        this.setParamSimple(map, prefix + "CdcId", this.CdcId);
        this.setParamSimple(map, prefix + "KibanaPrivateVip", this.KibanaPrivateVip);
        this.setParamSimple(map, prefix + "CustomKibanaPrivateUrl", this.CustomKibanaPrivateUrl);
        this.setParamArrayObj(map, prefix + "OutboundPublicAcls.", this.OutboundPublicAcls);
        this.setParamSimple(map, prefix + "NetConnectScheme", this.NetConnectScheme);
        this.setParamSimple(map, prefix + "DisasterRecoverGroupAffinity", this.DisasterRecoverGroupAffinity);
        this.setParamSimple(map, prefix + "SubProductCode", this.SubProductCode);
        this.setParamSimple(map, prefix + "CosBucketStorageSize", this.CosBucketStorageSize);
        this.setParamSimple(map, prefix + "ReadWriteMode", this.ReadWriteMode);
        this.setParamSimple(map, prefix + "EnableScheduleRecoverGroup", this.EnableScheduleRecoverGroup);
        this.setParamObj(map, prefix + "EnableScheduleOperationDuration.", this.EnableScheduleOperationDuration);
        this.setParamSimple(map, prefix + "EnableDestroyProtection", this.EnableDestroyProtection);
        this.setParamSimple(map, prefix + "ShowKibanaIpPort", this.ShowKibanaIpPort);
        this.setParamSimple(map, prefix + "IsCdzLite", this.IsCdzLite);
        this.setParamSimple(map, prefix + "EsPrivateTcpUrl", this.EsPrivateTcpUrl);
        this.setParamSimple(map, prefix + "IsInRecycleBin", this.IsInRecycleBin);
        this.setParamSimple(map, prefix + "RecycleLockEnabled", this.RecycleLockEnabled);
        this.setParamSimple(map, prefix + "MayDestroyPoint", this.MayDestroyPoint);
        this.setParamSimple(map, prefix + "DelayDestroyInterval", this.DelayDestroyInterval);
        this.setParamSimple(map, prefix + "EnableAutoReplace", this.EnableAutoReplace);
        this.setParamSimple(map, prefix + "OpenMTLS", this.OpenMTLS);
        this.setParamSimple(map, prefix + "ServerCertSource", this.ServerCertSource);
        this.setParamSimple(map, prefix + "OldEsVip", this.OldEsVip);
        this.setParamSimple(map, prefix + "OldEsPrivateTcpUrl", this.OldEsPrivateTcpUrl);
        this.setParamSimple(map, prefix + "NeedOfflineOldNodesNotify", this.NeedOfflineOldNodesNotify);

    }
}


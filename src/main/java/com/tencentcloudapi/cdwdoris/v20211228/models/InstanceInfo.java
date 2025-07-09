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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceInfo extends AbstractModel {

    /**
    * Cluster instance ID, "cdw-xxxx" string type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Cluster instance name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Status,
Init is being created. Serving is running. 
Deleted indicates the cluster has been terminated. Deleting indicates the cluster is being terminated.
Modify indicates the cluster is being changed.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Version
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Region, ap-guangzhou
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Availability zone, ap-guangzhou-3
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * VPC name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Subnet name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Payment type: hour and prepay
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * Creation time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Expiration time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Data node description information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MasterSummary")
    @Expose
    private NodesSummary MasterSummary;

    /**
    * Zookeeper node description information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CoreSummary")
    @Expose
    private NodesSummary CoreSummary;

    /**
    * High availability, being true or false
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HA")
    @Expose
    private String HA;

    /**
    * High availability type:
0: non-high availability
1: read high availability
2: read-write high availability
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HaType")
    @Expose
    private Long HaType;

    /**
    * Access address. Example: 10.0.0.1:9000
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AccessInfo")
    @Expose
    private String AccessInfo;

    /**
    * Record ID, in numerical type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Region ID, indicating the region
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * Note about availability zone, such as Guangzhou Zone 2
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ZoneDesc")
    @Expose
    private String ZoneDesc;

    /**
    * Error process description information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FlowMsg")
    @Expose
    private String FlowMsg;

    /**
    * Status description, such as "running"
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * Automatic renewal marker
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RenewFlag")
    @Expose
    private Boolean RenewFlag;

    /**
    * Tag list
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Monitoring Information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Monitor")
    @Expose
    private String Monitor;

    /**
    * Whether to enable logs.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HasClsTopic")
    @Expose
    private Boolean HasClsTopic;

    /**
    * Log Topic ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClsTopicId")
    @Expose
    private String ClsTopicId;

    /**
    * Logset ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClsLogSetId")
    @Expose
    private String ClsLogSetId;

    /**
    * Whether to support XML configuration management.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EnableXMLConfig")
    @Expose
    private Long EnableXMLConfig;

    /**
    * Region
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegionDesc")
    @Expose
    private String RegionDesc;

    /**
    * Elastic network interface address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Eip")
    @Expose
    private String Eip;

    /**
    * Cold and hot stratification coefficient
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CosMoveFactor")
    @Expose
    private Long CosMoveFactor;

    /**
    * external/local/yunti
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * COS bucket
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CosBucketName")
    @Expose
    private String CosBucketName;

    /**
    * cbs
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CanAttachCbs")
    @Expose
    private Boolean CanAttachCbs;

    /**
    * Minor versions
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BuildVersion")
    @Expose
    private String BuildVersion;

    /**
    * Component Information
Note: The return type here is map[string]struct, not the string type displayed. You can refer to "Sample Value" to parse the data.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Components")
    @Expose
    private String Components;

    /**
    * Determine whether the audit log table has a catalog field.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IfExistCatalog")
    @Expose
    private Long IfExistCatalog;

    /**
    * Page features, used to block some page entrances on the front end.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Characteristic")
    @Expose
    private String [] Characteristic;

    /**
    * Timeout period, in seconds
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RestartTimeout")
    @Expose
    private String RestartTimeout;

    /**
    * The timeout time for the graceful restart of the kernel. If it is -1, it means it is not set.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GraceShutdownWaitSeconds")
    @Expose
    private String GraceShutdownWaitSeconds;

    /**
    * Whether the table name is case sensitive, 0 refers to sensitive, 1 refers to insensitive, compared in lowercase; 2 refers to insensitive, and the table name is changed to lowercase for storage.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CaseSensitive")
    @Expose
    private Long CaseSensitive;

    /**
    * Whether users can bind security groups.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsWhiteSGs")
    @Expose
    private Boolean IsWhiteSGs;

    /**
    * Bound security group information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BindSGs")
    @Expose
    private String [] BindSGs;

    /**
    * Whether it is a multi-AZ.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EnableMultiZones")
    @Expose
    private Boolean EnableMultiZones;

    /**
    * User availability zone and subnet information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserNetworkInfos")
    @Expose
    private String UserNetworkInfos;

    /**
    * Whether to enable hot and cold stratification. 0 refers to disabled, and 1 refers to enabled.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EnableCoolDown")
    @Expose
    private Long EnableCoolDown;

    /**
    * COS buckets are used for hot and cold stratification
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CoolDownBucket")
    @Expose
    private String CoolDownBucket;

    /**
    * Instance extension information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Details")
    @Expose
    private InstanceDetail Details;

    /**
    * Whether to enable DLC. 0: disable; 1: enable.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EnableDlc")
    @Expose
    private Long EnableDlc;

    /**
    * Account type. 0: ordinary user; 1: CAM user.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AccountType")
    @Expose
    private Long AccountType;

    /**
     * Get Cluster instance ID, "cdw-xxxx" string type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceId Cluster instance ID, "cdw-xxxx" string type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Cluster instance ID, "cdw-xxxx" string type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceId Cluster instance ID, "cdw-xxxx" string type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Cluster instance name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceName Cluster instance name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Cluster instance name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceName Cluster instance name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Status,
Init is being created. Serving is running. 
Deleted indicates the cluster has been terminated. Deleting indicates the cluster is being terminated.
Modify indicates the cluster is being changed.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Status,
Init is being created. Serving is running. 
Deleted indicates the cluster has been terminated. Deleting indicates the cluster is being terminated.
Modify indicates the cluster is being changed.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status,
Init is being created. Serving is running. 
Deleted indicates the cluster has been terminated. Deleting indicates the cluster is being terminated.
Modify indicates the cluster is being changed.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Status,
Init is being created. Serving is running. 
Deleted indicates the cluster has been terminated. Deleting indicates the cluster is being terminated.
Modify indicates the cluster is being changed.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Version
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Version Version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Version
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Version Version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Region, ap-guangzhou
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Region Region, ap-guangzhou
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region, ap-guangzhou
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Region Region, ap-guangzhou
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Availability zone, ap-guangzhou-3
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Zone Availability zone, ap-guangzhou-3
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Availability zone, ap-guangzhou-3
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Zone Availability zone, ap-guangzhou-3
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get VPC name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VpcId VPC name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VpcId VPC name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubnetId Subnet name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubnetId Subnet name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Payment type: hour and prepay
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PayMode Payment type: hour and prepay
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Payment type: hour and prepay
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PayMode Payment type: hour and prepay
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Creation time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Creation time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Creation time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Expiration time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExpireTime Expiration time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Expiration time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExpireTime Expiration time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Data node description information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MasterSummary Data node description information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public NodesSummary getMasterSummary() {
        return this.MasterSummary;
    }

    /**
     * Set Data node description information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MasterSummary Data node description information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMasterSummary(NodesSummary MasterSummary) {
        this.MasterSummary = MasterSummary;
    }

    /**
     * Get Zookeeper node description information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CoreSummary Zookeeper node description information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public NodesSummary getCoreSummary() {
        return this.CoreSummary;
    }

    /**
     * Set Zookeeper node description information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CoreSummary Zookeeper node description information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCoreSummary(NodesSummary CoreSummary) {
        this.CoreSummary = CoreSummary;
    }

    /**
     * Get High availability, being true or false
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HA High availability, being true or false
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHA() {
        return this.HA;
    }

    /**
     * Set High availability, being true or false
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HA High availability, being true or false
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHA(String HA) {
        this.HA = HA;
    }

    /**
     * Get High availability type:
0: non-high availability
1: read high availability
2: read-write high availability
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HaType High availability type:
0: non-high availability
1: read high availability
2: read-write high availability
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getHaType() {
        return this.HaType;
    }

    /**
     * Set High availability type:
0: non-high availability
1: read high availability
2: read-write high availability
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HaType High availability type:
0: non-high availability
1: read high availability
2: read-write high availability
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHaType(Long HaType) {
        this.HaType = HaType;
    }

    /**
     * Get Access address. Example: 10.0.0.1:9000
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AccessInfo Access address. Example: 10.0.0.1:9000
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAccessInfo() {
        return this.AccessInfo;
    }

    /**
     * Set Access address. Example: 10.0.0.1:9000
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AccessInfo Access address. Example: 10.0.0.1:9000
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAccessInfo(String AccessInfo) {
        this.AccessInfo = AccessInfo;
    }

    /**
     * Get Record ID, in numerical type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Id Record ID, in numerical type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Record ID, in numerical type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Id Record ID, in numerical type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Region ID, indicating the region
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RegionId Region ID, indicating the region
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Region ID, indicating the region
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RegionId Region ID, indicating the region
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get Note about availability zone, such as Guangzhou Zone 2
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ZoneDesc Note about availability zone, such as Guangzhou Zone 2
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getZoneDesc() {
        return this.ZoneDesc;
    }

    /**
     * Set Note about availability zone, such as Guangzhou Zone 2
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ZoneDesc Note about availability zone, such as Guangzhou Zone 2
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setZoneDesc(String ZoneDesc) {
        this.ZoneDesc = ZoneDesc;
    }

    /**
     * Get Error process description information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FlowMsg Error process description information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFlowMsg() {
        return this.FlowMsg;
    }

    /**
     * Set Error process description information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FlowMsg Error process description information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFlowMsg(String FlowMsg) {
        this.FlowMsg = FlowMsg;
    }

    /**
     * Get Status description, such as "running"
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StatusDesc Status description, such as "running"
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set Status description, such as "running"
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StatusDesc Status description, such as "running"
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get Automatic renewal marker
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RenewFlag Automatic renewal marker
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set Automatic renewal marker
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RenewFlag Automatic renewal marker
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRenewFlag(Boolean RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get Tag list
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tags Tag list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag list
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tags Tag list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Monitoring Information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Monitor Monitoring Information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMonitor() {
        return this.Monitor;
    }

    /**
     * Set Monitoring Information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Monitor Monitoring Information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMonitor(String Monitor) {
        this.Monitor = Monitor;
    }

    /**
     * Get Whether to enable logs.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HasClsTopic Whether to enable logs.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getHasClsTopic() {
        return this.HasClsTopic;
    }

    /**
     * Set Whether to enable logs.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HasClsTopic Whether to enable logs.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHasClsTopic(Boolean HasClsTopic) {
        this.HasClsTopic = HasClsTopic;
    }

    /**
     * Get Log Topic ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClsTopicId Log Topic ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getClsTopicId() {
        return this.ClsTopicId;
    }

    /**
     * Set Log Topic ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClsTopicId Log Topic ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClsTopicId(String ClsTopicId) {
        this.ClsTopicId = ClsTopicId;
    }

    /**
     * Get Logset ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClsLogSetId Logset ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getClsLogSetId() {
        return this.ClsLogSetId;
    }

    /**
     * Set Logset ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClsLogSetId Logset ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClsLogSetId(String ClsLogSetId) {
        this.ClsLogSetId = ClsLogSetId;
    }

    /**
     * Get Whether to support XML configuration management.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EnableXMLConfig Whether to support XML configuration management.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getEnableXMLConfig() {
        return this.EnableXMLConfig;
    }

    /**
     * Set Whether to support XML configuration management.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EnableXMLConfig Whether to support XML configuration management.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEnableXMLConfig(Long EnableXMLConfig) {
        this.EnableXMLConfig = EnableXMLConfig;
    }

    /**
     * Get Region
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RegionDesc Region
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegionDesc() {
        return this.RegionDesc;
    }

    /**
     * Set Region
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RegionDesc Region
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegionDesc(String RegionDesc) {
        this.RegionDesc = RegionDesc;
    }

    /**
     * Get Elastic network interface address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Eip Elastic network interface address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEip() {
        return this.Eip;
    }

    /**
     * Set Elastic network interface address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Eip Elastic network interface address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEip(String Eip) {
        this.Eip = Eip;
    }

    /**
     * Get Cold and hot stratification coefficient
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CosMoveFactor Cold and hot stratification coefficient
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCosMoveFactor() {
        return this.CosMoveFactor;
    }

    /**
     * Set Cold and hot stratification coefficient
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CosMoveFactor Cold and hot stratification coefficient
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCosMoveFactor(Long CosMoveFactor) {
        this.CosMoveFactor = CosMoveFactor;
    }

    /**
     * Get external/local/yunti
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Kind external/local/yunti
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set external/local/yunti
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Kind external/local/yunti
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    /**
     * Get COS bucket
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CosBucketName COS bucket
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCosBucketName() {
        return this.CosBucketName;
    }

    /**
     * Set COS bucket
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CosBucketName COS bucket
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCosBucketName(String CosBucketName) {
        this.CosBucketName = CosBucketName;
    }

    /**
     * Get cbs
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CanAttachCbs cbs
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getCanAttachCbs() {
        return this.CanAttachCbs;
    }

    /**
     * Set cbs
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CanAttachCbs cbs
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCanAttachCbs(Boolean CanAttachCbs) {
        this.CanAttachCbs = CanAttachCbs;
    }

    /**
     * Get Minor versions
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BuildVersion Minor versions
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBuildVersion() {
        return this.BuildVersion;
    }

    /**
     * Set Minor versions
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BuildVersion Minor versions
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBuildVersion(String BuildVersion) {
        this.BuildVersion = BuildVersion;
    }

    /**
     * Get Component Information
Note: The return type here is map[string]struct, not the string type displayed. You can refer to "Sample Value" to parse the data.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Components Component Information
Note: The return type here is map[string]struct, not the string type displayed. You can refer to "Sample Value" to parse the data.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getComponents() {
        return this.Components;
    }

    /**
     * Set Component Information
Note: The return type here is map[string]struct, not the string type displayed. You can refer to "Sample Value" to parse the data.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Components Component Information
Note: The return type here is map[string]struct, not the string type displayed. You can refer to "Sample Value" to parse the data.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setComponents(String Components) {
        this.Components = Components;
    }

    /**
     * Get Determine whether the audit log table has a catalog field.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IfExistCatalog Determine whether the audit log table has a catalog field.
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public Long getIfExistCatalog() {
        return this.IfExistCatalog;
    }

    /**
     * Set Determine whether the audit log table has a catalog field.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IfExistCatalog Determine whether the audit log table has a catalog field.
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setIfExistCatalog(Long IfExistCatalog) {
        this.IfExistCatalog = IfExistCatalog;
    }

    /**
     * Get Page features, used to block some page entrances on the front end.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Characteristic Page features, used to block some page entrances on the front end.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getCharacteristic() {
        return this.Characteristic;
    }

    /**
     * Set Page features, used to block some page entrances on the front end.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Characteristic Page features, used to block some page entrances on the front end.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCharacteristic(String [] Characteristic) {
        this.Characteristic = Characteristic;
    }

    /**
     * Get Timeout period, in seconds
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RestartTimeout Timeout period, in seconds
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRestartTimeout() {
        return this.RestartTimeout;
    }

    /**
     * Set Timeout period, in seconds
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RestartTimeout Timeout period, in seconds
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRestartTimeout(String RestartTimeout) {
        this.RestartTimeout = RestartTimeout;
    }

    /**
     * Get The timeout time for the graceful restart of the kernel. If it is -1, it means it is not set.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GraceShutdownWaitSeconds The timeout time for the graceful restart of the kernel. If it is -1, it means it is not set.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getGraceShutdownWaitSeconds() {
        return this.GraceShutdownWaitSeconds;
    }

    /**
     * Set The timeout time for the graceful restart of the kernel. If it is -1, it means it is not set.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GraceShutdownWaitSeconds The timeout time for the graceful restart of the kernel. If it is -1, it means it is not set.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGraceShutdownWaitSeconds(String GraceShutdownWaitSeconds) {
        this.GraceShutdownWaitSeconds = GraceShutdownWaitSeconds;
    }

    /**
     * Get Whether the table name is case sensitive, 0 refers to sensitive, 1 refers to insensitive, compared in lowercase; 2 refers to insensitive, and the table name is changed to lowercase for storage.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CaseSensitive Whether the table name is case sensitive, 0 refers to sensitive, 1 refers to insensitive, compared in lowercase; 2 refers to insensitive, and the table name is changed to lowercase for storage.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCaseSensitive() {
        return this.CaseSensitive;
    }

    /**
     * Set Whether the table name is case sensitive, 0 refers to sensitive, 1 refers to insensitive, compared in lowercase; 2 refers to insensitive, and the table name is changed to lowercase for storage.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CaseSensitive Whether the table name is case sensitive, 0 refers to sensitive, 1 refers to insensitive, compared in lowercase; 2 refers to insensitive, and the table name is changed to lowercase for storage.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCaseSensitive(Long CaseSensitive) {
        this.CaseSensitive = CaseSensitive;
    }

    /**
     * Get Whether users can bind security groups.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsWhiteSGs Whether users can bind security groups.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsWhiteSGs() {
        return this.IsWhiteSGs;
    }

    /**
     * Set Whether users can bind security groups.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsWhiteSGs Whether users can bind security groups.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsWhiteSGs(Boolean IsWhiteSGs) {
        this.IsWhiteSGs = IsWhiteSGs;
    }

    /**
     * Get Bound security group information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BindSGs Bound security group information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getBindSGs() {
        return this.BindSGs;
    }

    /**
     * Set Bound security group information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BindSGs Bound security group information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBindSGs(String [] BindSGs) {
        this.BindSGs = BindSGs;
    }

    /**
     * Get Whether it is a multi-AZ.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EnableMultiZones Whether it is a multi-AZ.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getEnableMultiZones() {
        return this.EnableMultiZones;
    }

    /**
     * Set Whether it is a multi-AZ.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EnableMultiZones Whether it is a multi-AZ.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEnableMultiZones(Boolean EnableMultiZones) {
        this.EnableMultiZones = EnableMultiZones;
    }

    /**
     * Get User availability zone and subnet information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserNetworkInfos User availability zone and subnet information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserNetworkInfos() {
        return this.UserNetworkInfos;
    }

    /**
     * Set User availability zone and subnet information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserNetworkInfos User availability zone and subnet information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserNetworkInfos(String UserNetworkInfos) {
        this.UserNetworkInfos = UserNetworkInfos;
    }

    /**
     * Get Whether to enable hot and cold stratification. 0 refers to disabled, and 1 refers to enabled.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EnableCoolDown Whether to enable hot and cold stratification. 0 refers to disabled, and 1 refers to enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getEnableCoolDown() {
        return this.EnableCoolDown;
    }

    /**
     * Set Whether to enable hot and cold stratification. 0 refers to disabled, and 1 refers to enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EnableCoolDown Whether to enable hot and cold stratification. 0 refers to disabled, and 1 refers to enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEnableCoolDown(Long EnableCoolDown) {
        this.EnableCoolDown = EnableCoolDown;
    }

    /**
     * Get COS buckets are used for hot and cold stratification
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CoolDownBucket COS buckets are used for hot and cold stratification
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCoolDownBucket() {
        return this.CoolDownBucket;
    }

    /**
     * Set COS buckets are used for hot and cold stratification
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CoolDownBucket COS buckets are used for hot and cold stratification
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCoolDownBucket(String CoolDownBucket) {
        this.CoolDownBucket = CoolDownBucket;
    }

    /**
     * Get Instance extension information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Details Instance extension information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public InstanceDetail getDetails() {
        return this.Details;
    }

    /**
     * Set Instance extension information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Details Instance extension information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDetails(InstanceDetail Details) {
        this.Details = Details;
    }

    /**
     * Get Whether to enable DLC. 0: disable; 1: enable.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EnableDlc Whether to enable DLC. 0: disable; 1: enable.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getEnableDlc() {
        return this.EnableDlc;
    }

    /**
     * Set Whether to enable DLC. 0: disable; 1: enable.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EnableDlc Whether to enable DLC. 0: disable; 1: enable.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEnableDlc(Long EnableDlc) {
        this.EnableDlc = EnableDlc;
    }

    /**
     * Get Account type. 0: ordinary user; 1: CAM user.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AccountType Account type. 0: ordinary user; 1: CAM user.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAccountType() {
        return this.AccountType;
    }

    /**
     * Set Account type. 0: ordinary user; 1: CAM user.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AccountType Account type. 0: ordinary user; 1: CAM user.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAccountType(Long AccountType) {
        this.AccountType = AccountType;
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
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.MasterSummary != null) {
            this.MasterSummary = new NodesSummary(source.MasterSummary);
        }
        if (source.CoreSummary != null) {
            this.CoreSummary = new NodesSummary(source.CoreSummary);
        }
        if (source.HA != null) {
            this.HA = new String(source.HA);
        }
        if (source.HaType != null) {
            this.HaType = new Long(source.HaType);
        }
        if (source.AccessInfo != null) {
            this.AccessInfo = new String(source.AccessInfo);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.ZoneDesc != null) {
            this.ZoneDesc = new String(source.ZoneDesc);
        }
        if (source.FlowMsg != null) {
            this.FlowMsg = new String(source.FlowMsg);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Boolean(source.RenewFlag);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.Monitor != null) {
            this.Monitor = new String(source.Monitor);
        }
        if (source.HasClsTopic != null) {
            this.HasClsTopic = new Boolean(source.HasClsTopic);
        }
        if (source.ClsTopicId != null) {
            this.ClsTopicId = new String(source.ClsTopicId);
        }
        if (source.ClsLogSetId != null) {
            this.ClsLogSetId = new String(source.ClsLogSetId);
        }
        if (source.EnableXMLConfig != null) {
            this.EnableXMLConfig = new Long(source.EnableXMLConfig);
        }
        if (source.RegionDesc != null) {
            this.RegionDesc = new String(source.RegionDesc);
        }
        if (source.Eip != null) {
            this.Eip = new String(source.Eip);
        }
        if (source.CosMoveFactor != null) {
            this.CosMoveFactor = new Long(source.CosMoveFactor);
        }
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
        if (source.CosBucketName != null) {
            this.CosBucketName = new String(source.CosBucketName);
        }
        if (source.CanAttachCbs != null) {
            this.CanAttachCbs = new Boolean(source.CanAttachCbs);
        }
        if (source.BuildVersion != null) {
            this.BuildVersion = new String(source.BuildVersion);
        }
        if (source.Components != null) {
            this.Components = new String(source.Components);
        }
        if (source.IfExistCatalog != null) {
            this.IfExistCatalog = new Long(source.IfExistCatalog);
        }
        if (source.Characteristic != null) {
            this.Characteristic = new String[source.Characteristic.length];
            for (int i = 0; i < source.Characteristic.length; i++) {
                this.Characteristic[i] = new String(source.Characteristic[i]);
            }
        }
        if (source.RestartTimeout != null) {
            this.RestartTimeout = new String(source.RestartTimeout);
        }
        if (source.GraceShutdownWaitSeconds != null) {
            this.GraceShutdownWaitSeconds = new String(source.GraceShutdownWaitSeconds);
        }
        if (source.CaseSensitive != null) {
            this.CaseSensitive = new Long(source.CaseSensitive);
        }
        if (source.IsWhiteSGs != null) {
            this.IsWhiteSGs = new Boolean(source.IsWhiteSGs);
        }
        if (source.BindSGs != null) {
            this.BindSGs = new String[source.BindSGs.length];
            for (int i = 0; i < source.BindSGs.length; i++) {
                this.BindSGs[i] = new String(source.BindSGs[i]);
            }
        }
        if (source.EnableMultiZones != null) {
            this.EnableMultiZones = new Boolean(source.EnableMultiZones);
        }
        if (source.UserNetworkInfos != null) {
            this.UserNetworkInfos = new String(source.UserNetworkInfos);
        }
        if (source.EnableCoolDown != null) {
            this.EnableCoolDown = new Long(source.EnableCoolDown);
        }
        if (source.CoolDownBucket != null) {
            this.CoolDownBucket = new String(source.CoolDownBucket);
        }
        if (source.Details != null) {
            this.Details = new InstanceDetail(source.Details);
        }
        if (source.EnableDlc != null) {
            this.EnableDlc = new Long(source.EnableDlc);
        }
        if (source.AccountType != null) {
            this.AccountType = new Long(source.AccountType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamObj(map, prefix + "MasterSummary.", this.MasterSummary);
        this.setParamObj(map, prefix + "CoreSummary.", this.CoreSummary);
        this.setParamSimple(map, prefix + "HA", this.HA);
        this.setParamSimple(map, prefix + "HaType", this.HaType);
        this.setParamSimple(map, prefix + "AccessInfo", this.AccessInfo);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "ZoneDesc", this.ZoneDesc);
        this.setParamSimple(map, prefix + "FlowMsg", this.FlowMsg);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Monitor", this.Monitor);
        this.setParamSimple(map, prefix + "HasClsTopic", this.HasClsTopic);
        this.setParamSimple(map, prefix + "ClsTopicId", this.ClsTopicId);
        this.setParamSimple(map, prefix + "ClsLogSetId", this.ClsLogSetId);
        this.setParamSimple(map, prefix + "EnableXMLConfig", this.EnableXMLConfig);
        this.setParamSimple(map, prefix + "RegionDesc", this.RegionDesc);
        this.setParamSimple(map, prefix + "Eip", this.Eip);
        this.setParamSimple(map, prefix + "CosMoveFactor", this.CosMoveFactor);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "CosBucketName", this.CosBucketName);
        this.setParamSimple(map, prefix + "CanAttachCbs", this.CanAttachCbs);
        this.setParamSimple(map, prefix + "BuildVersion", this.BuildVersion);
        this.setParamSimple(map, prefix + "Components", this.Components);
        this.setParamSimple(map, prefix + "IfExistCatalog", this.IfExistCatalog);
        this.setParamArraySimple(map, prefix + "Characteristic.", this.Characteristic);
        this.setParamSimple(map, prefix + "RestartTimeout", this.RestartTimeout);
        this.setParamSimple(map, prefix + "GraceShutdownWaitSeconds", this.GraceShutdownWaitSeconds);
        this.setParamSimple(map, prefix + "CaseSensitive", this.CaseSensitive);
        this.setParamSimple(map, prefix + "IsWhiteSGs", this.IsWhiteSGs);
        this.setParamArraySimple(map, prefix + "BindSGs.", this.BindSGs);
        this.setParamSimple(map, prefix + "EnableMultiZones", this.EnableMultiZones);
        this.setParamSimple(map, prefix + "UserNetworkInfos", this.UserNetworkInfos);
        this.setParamSimple(map, prefix + "EnableCoolDown", this.EnableCoolDown);
        this.setParamSimple(map, prefix + "CoolDownBucket", this.CoolDownBucket);
        this.setParamObj(map, prefix + "Details.", this.Details);
        this.setParamSimple(map, prefix + "EnableDlc", this.EnableDlc);
        this.setParamSimple(map, prefix + "AccountType", this.AccountType);

    }
}


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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoadBalancer extends AbstractModel{

    /**
    * CLB instance ID.
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * CLB instance name.
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * CLB instance network type:
OPEN: public network; INTERNAL: private network.
    */
    @SerializedName("LoadBalancerType")
    @Expose
    private String LoadBalancerType;

    /**
    * CLB type identifier. Value range: 1 (CLB); 0 (classic CLB).
    */
    @SerializedName("Forward")
    @Expose
    private Long Forward;

    /**
    * CLB instance domain name. This field is provided only to public network classic CLB instance.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * List of VIPs of a CLB instance.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LoadBalancerVips")
    @Expose
    private String [] LoadBalancerVips;

    /**
    * CLB instance status, including:
0: creating; 1: running.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * CLB instance creation time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last status change time of a CLB instance.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StatusTime")
    @Expose
    private String StatusTime;

    /**
    * ID of the project to which a CLB instance belongs. 0: default project.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * VPC ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Protective CLB identifier. Value range: 1 (protective), 0 (non-protective).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OpenBgp")
    @Expose
    private Long OpenBgp;

    /**
    * SNAT is enabled for all private network classic CLB created before December 2016.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Snat")
    @Expose
    private Boolean Snat;

    /**
    * 0: not isolated; 1: isolated.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Isolation")
    @Expose
    private Long Isolation;

    /**
    * Log information. Only the public network CLB that have HTTP or HTTPS listeners can generate logs.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Log")
    @Expose
    private String Log;

    /**
    * Subnet where a CLB instance resides (meaningful only for private network VPC CLB)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * CLB instance tag information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * Security group of a CLB instance
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SecureGroups")
    @Expose
    private String [] SecureGroups;

    /**
    * Basic information of a backend server bound to a CLB instance
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TargetRegionInfo")
    @Expose
    private TargetRegionInfo TargetRegionInfo;

    /**
    * Anycast CLB publishing region. For non-anycast CLB, this field returns an empty string.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AnycastZone")
    @Expose
    private String AnycastZone;

    /**
    * IP version. Valid values: ipv4, ipv6
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AddressIPVersion")
    @Expose
    private String AddressIPVersion;

    /**
    * VPC ID in a numeric form
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NumericalVpcId")
    @Expose
    private Long NumericalVpcId;

    /**
    * ISP to which a CLB IP address belongs
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VipIsp")
    @Expose
    private String VipIsp;

    /**
    * Primary AZ
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MasterZone")
    @Expose
    private ZoneInfo MasterZone;

    /**
    * Secondary AZ
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BackupZoneSet")
    @Expose
    private ZoneInfo [] BackupZoneSet;

    /**
    * CLB instance isolation time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsolatedTime")
    @Expose
    private String IsolatedTime;

    /**
    * CLB instance expiration time, which takes effect only for prepaid instances
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * CLB instance billing mode
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * CLB instance network attributes
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NetworkAttributes")
    @Expose
    private InternetAccessible NetworkAttributes;

    /**
    * Prepaid billing attributes of a CLB instance
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PrepaidAttributes")
    @Expose
    private LBChargePrepaid PrepaidAttributes;

    /**
    * Logset ID of CLB Log Service (CLS)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LogSetId")
    @Expose
    private String LogSetId;

    /**
    * Log topic ID of CLB Log Service (CLS)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LogTopicId")
    @Expose
    private String LogTopicId;

    /**
    * IPv6 address of a CLB instance
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AddressIPv6")
    @Expose
    private String AddressIPv6;

    /**
    * Reserved field which can be ignored generally.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExtraInfo")
    @Expose
    private ExtraInfo ExtraInfo;

    /**
    * Whether an Anti-DDoS Pro instance can be bound
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsDDos")
    @Expose
    private Boolean IsDDos;

    /**
    * Custom configuration ID at the CLB instance level
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
    * Whether a real server opens the traffic from a CLB instance to the internet
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LoadBalancerPassToTarget")
    @Expose
    private Boolean LoadBalancerPassToTarget;

    /**
    * Private network dedicated cluster
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExclusiveCluster")
    @Expose
    private ExclusiveCluster ExclusiveCluster;

    /**
    * This field is meaningful only when the IP address version is `ipv6`. Valid values: IPv6Nat64, IPv6FullChain
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IPv6Mode")
    @Expose
    private String IPv6Mode;

    /**
    * Whether to enable SnatPro.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SnatPro")
    @Expose
    private Boolean SnatPro;

    /**
    * `SnatIp` list after SnatPro load balancing is enabled.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SnatIps")
    @Expose
    private SnatIp [] SnatIps;

    /**
    * Performance guarantee specification
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SlaType")
    @Expose
    private String SlaType;

    /**
    * Whether VIP is blocked
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsBlock")
    @Expose
    private Boolean IsBlock;

    /**
    * Time blocked or unblocked
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsBlockTime")
    @Expose
    private String IsBlockTime;

    /**
    * Whether the IP type is the local BGP
    */
    @SerializedName("LocalBgp")
    @Expose
    private Boolean LocalBgp;

    /**
    * Dedicated layer-7 tag.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterTag")
    @Expose
    private String ClusterTag;

    /**
    * If the layer-7 listener of an IPv6FullChain CLB instance is enabled, the CLB instance can be bound with an IPv4 and an IPv6 CVM instance simultaneously.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MixIpTarget")
    @Expose
    private Boolean MixIpTarget;

    /**
     * Get CLB instance ID. 
     * @return LoadBalancerId CLB instance ID.
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set CLB instance ID.
     * @param LoadBalancerId CLB instance ID.
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get CLB instance name. 
     * @return LoadBalancerName CLB instance name.
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * Set CLB instance name.
     * @param LoadBalancerName CLB instance name.
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * Get CLB instance network type:
OPEN: public network; INTERNAL: private network. 
     * @return LoadBalancerType CLB instance network type:
OPEN: public network; INTERNAL: private network.
     */
    public String getLoadBalancerType() {
        return this.LoadBalancerType;
    }

    /**
     * Set CLB instance network type:
OPEN: public network; INTERNAL: private network.
     * @param LoadBalancerType CLB instance network type:
OPEN: public network; INTERNAL: private network.
     */
    public void setLoadBalancerType(String LoadBalancerType) {
        this.LoadBalancerType = LoadBalancerType;
    }

    /**
     * Get CLB type identifier. Value range: 1 (CLB); 0 (classic CLB). 
     * @return Forward CLB type identifier. Value range: 1 (CLB); 0 (classic CLB).
     */
    public Long getForward() {
        return this.Forward;
    }

    /**
     * Set CLB type identifier. Value range: 1 (CLB); 0 (classic CLB).
     * @param Forward CLB type identifier. Value range: 1 (CLB); 0 (classic CLB).
     */
    public void setForward(Long Forward) {
        this.Forward = Forward;
    }

    /**
     * Get CLB instance domain name. This field is provided only to public network classic CLB instance.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Domain CLB instance domain name. This field is provided only to public network classic CLB instance.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set CLB instance domain name. This field is provided only to public network classic CLB instance.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Domain CLB instance domain name. This field is provided only to public network classic CLB instance.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get List of VIPs of a CLB instance.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LoadBalancerVips List of VIPs of a CLB instance.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getLoadBalancerVips() {
        return this.LoadBalancerVips;
    }

    /**
     * Set List of VIPs of a CLB instance.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LoadBalancerVips List of VIPs of a CLB instance.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLoadBalancerVips(String [] LoadBalancerVips) {
        this.LoadBalancerVips = LoadBalancerVips;
    }

    /**
     * Get CLB instance status, including:
0: creating; 1: running.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status CLB instance status, including:
0: creating; 1: running.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set CLB instance status, including:
0: creating; 1: running.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status CLB instance status, including:
0: creating; 1: running.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get CLB instance creation time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime CLB instance creation time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set CLB instance creation time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime CLB instance creation time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last status change time of a CLB instance.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StatusTime Last status change time of a CLB instance.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStatusTime() {
        return this.StatusTime;
    }

    /**
     * Set Last status change time of a CLB instance.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StatusTime Last status change time of a CLB instance.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatusTime(String StatusTime) {
        this.StatusTime = StatusTime;
    }

    /**
     * Get ID of the project to which a CLB instance belongs. 0: default project. 
     * @return ProjectId ID of the project to which a CLB instance belongs. 0: default project.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set ID of the project to which a CLB instance belongs. 0: default project.
     * @param ProjectId ID of the project to which a CLB instance belongs. 0: default project.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get VPC ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VpcId VPC ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VpcId VPC ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Protective CLB identifier. Value range: 1 (protective), 0 (non-protective).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OpenBgp Protective CLB identifier. Value range: 1 (protective), 0 (non-protective).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getOpenBgp() {
        return this.OpenBgp;
    }

    /**
     * Set Protective CLB identifier. Value range: 1 (protective), 0 (non-protective).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OpenBgp Protective CLB identifier. Value range: 1 (protective), 0 (non-protective).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOpenBgp(Long OpenBgp) {
        this.OpenBgp = OpenBgp;
    }

    /**
     * Get SNAT is enabled for all private network classic CLB created before December 2016.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Snat SNAT is enabled for all private network classic CLB created before December 2016.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getSnat() {
        return this.Snat;
    }

    /**
     * Set SNAT is enabled for all private network classic CLB created before December 2016.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Snat SNAT is enabled for all private network classic CLB created before December 2016.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSnat(Boolean Snat) {
        this.Snat = Snat;
    }

    /**
     * Get 0: not isolated; 1: isolated.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Isolation 0: not isolated; 1: isolated.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsolation() {
        return this.Isolation;
    }

    /**
     * Set 0: not isolated; 1: isolated.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Isolation 0: not isolated; 1: isolated.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsolation(Long Isolation) {
        this.Isolation = Isolation;
    }

    /**
     * Get Log information. Only the public network CLB that have HTTP or HTTPS listeners can generate logs.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Log Log information. Only the public network CLB that have HTTP or HTTPS listeners can generate logs.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLog() {
        return this.Log;
    }

    /**
     * Set Log information. Only the public network CLB that have HTTP or HTTPS listeners can generate logs.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Log Log information. Only the public network CLB that have HTTP or HTTPS listeners can generate logs.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLog(String Log) {
        this.Log = Log;
    }

    /**
     * Get Subnet where a CLB instance resides (meaningful only for private network VPC CLB)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubnetId Subnet where a CLB instance resides (meaningful only for private network VPC CLB)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet where a CLB instance resides (meaningful only for private network VPC CLB)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubnetId Subnet where a CLB instance resides (meaningful only for private network VPC CLB)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get CLB instance tag information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tags CLB instance tag information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set CLB instance tag information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tags CLB instance tag information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Security group of a CLB instance
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SecureGroups Security group of a CLB instance
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getSecureGroups() {
        return this.SecureGroups;
    }

    /**
     * Set Security group of a CLB instance
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SecureGroups Security group of a CLB instance
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSecureGroups(String [] SecureGroups) {
        this.SecureGroups = SecureGroups;
    }

    /**
     * Get Basic information of a backend server bound to a CLB instance
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TargetRegionInfo Basic information of a backend server bound to a CLB instance
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TargetRegionInfo getTargetRegionInfo() {
        return this.TargetRegionInfo;
    }

    /**
     * Set Basic information of a backend server bound to a CLB instance
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TargetRegionInfo Basic information of a backend server bound to a CLB instance
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTargetRegionInfo(TargetRegionInfo TargetRegionInfo) {
        this.TargetRegionInfo = TargetRegionInfo;
    }

    /**
     * Get Anycast CLB publishing region. For non-anycast CLB, this field returns an empty string.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AnycastZone Anycast CLB publishing region. For non-anycast CLB, this field returns an empty string.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAnycastZone() {
        return this.AnycastZone;
    }

    /**
     * Set Anycast CLB publishing region. For non-anycast CLB, this field returns an empty string.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AnycastZone Anycast CLB publishing region. For non-anycast CLB, this field returns an empty string.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAnycastZone(String AnycastZone) {
        this.AnycastZone = AnycastZone;
    }

    /**
     * Get IP version. Valid values: ipv4, ipv6
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AddressIPVersion IP version. Valid values: ipv4, ipv6
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getAddressIPVersion() {
        return this.AddressIPVersion;
    }

    /**
     * Set IP version. Valid values: ipv4, ipv6
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AddressIPVersion IP version. Valid values: ipv4, ipv6
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAddressIPVersion(String AddressIPVersion) {
        this.AddressIPVersion = AddressIPVersion;
    }

    /**
     * Get VPC ID in a numeric form
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NumericalVpcId VPC ID in a numeric form
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getNumericalVpcId() {
        return this.NumericalVpcId;
    }

    /**
     * Set VPC ID in a numeric form
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NumericalVpcId VPC ID in a numeric form
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNumericalVpcId(Long NumericalVpcId) {
        this.NumericalVpcId = NumericalVpcId;
    }

    /**
     * Get ISP to which a CLB IP address belongs
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VipIsp ISP to which a CLB IP address belongs
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVipIsp() {
        return this.VipIsp;
    }

    /**
     * Set ISP to which a CLB IP address belongs
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VipIsp ISP to which a CLB IP address belongs
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVipIsp(String VipIsp) {
        this.VipIsp = VipIsp;
    }

    /**
     * Get Primary AZ
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MasterZone Primary AZ
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ZoneInfo getMasterZone() {
        return this.MasterZone;
    }

    /**
     * Set Primary AZ
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MasterZone Primary AZ
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMasterZone(ZoneInfo MasterZone) {
        this.MasterZone = MasterZone;
    }

    /**
     * Get Secondary AZ
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BackupZoneSet Secondary AZ
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ZoneInfo [] getBackupZoneSet() {
        return this.BackupZoneSet;
    }

    /**
     * Set Secondary AZ
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BackupZoneSet Secondary AZ
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBackupZoneSet(ZoneInfo [] BackupZoneSet) {
        this.BackupZoneSet = BackupZoneSet;
    }

    /**
     * Get CLB instance isolation time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsolatedTime CLB instance isolation time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIsolatedTime() {
        return this.IsolatedTime;
    }

    /**
     * Set CLB instance isolation time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsolatedTime CLB instance isolation time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsolatedTime(String IsolatedTime) {
        this.IsolatedTime = IsolatedTime;
    }

    /**
     * Get CLB instance expiration time, which takes effect only for prepaid instances
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExpireTime CLB instance expiration time, which takes effect only for prepaid instances
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set CLB instance expiration time, which takes effect only for prepaid instances
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExpireTime CLB instance expiration time, which takes effect only for prepaid instances
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get CLB instance billing mode
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ChargeType CLB instance billing mode
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set CLB instance billing mode
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ChargeType CLB instance billing mode
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get CLB instance network attributes
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NetworkAttributes CLB instance network attributes
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public InternetAccessible getNetworkAttributes() {
        return this.NetworkAttributes;
    }

    /**
     * Set CLB instance network attributes
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NetworkAttributes CLB instance network attributes
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNetworkAttributes(InternetAccessible NetworkAttributes) {
        this.NetworkAttributes = NetworkAttributes;
    }

    /**
     * Get Prepaid billing attributes of a CLB instance
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PrepaidAttributes Prepaid billing attributes of a CLB instance
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public LBChargePrepaid getPrepaidAttributes() {
        return this.PrepaidAttributes;
    }

    /**
     * Set Prepaid billing attributes of a CLB instance
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PrepaidAttributes Prepaid billing attributes of a CLB instance
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPrepaidAttributes(LBChargePrepaid PrepaidAttributes) {
        this.PrepaidAttributes = PrepaidAttributes;
    }

    /**
     * Get Logset ID of CLB Log Service (CLS)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LogSetId Logset ID of CLB Log Service (CLS)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLogSetId() {
        return this.LogSetId;
    }

    /**
     * Set Logset ID of CLB Log Service (CLS)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LogSetId Logset ID of CLB Log Service (CLS)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLogSetId(String LogSetId) {
        this.LogSetId = LogSetId;
    }

    /**
     * Get Log topic ID of CLB Log Service (CLS)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LogTopicId Log topic ID of CLB Log Service (CLS)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLogTopicId() {
        return this.LogTopicId;
    }

    /**
     * Set Log topic ID of CLB Log Service (CLS)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LogTopicId Log topic ID of CLB Log Service (CLS)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLogTopicId(String LogTopicId) {
        this.LogTopicId = LogTopicId;
    }

    /**
     * Get IPv6 address of a CLB instance
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AddressIPv6 IPv6 address of a CLB instance
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAddressIPv6() {
        return this.AddressIPv6;
    }

    /**
     * Set IPv6 address of a CLB instance
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AddressIPv6 IPv6 address of a CLB instance
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAddressIPv6(String AddressIPv6) {
        this.AddressIPv6 = AddressIPv6;
    }

    /**
     * Get Reserved field which can be ignored generally.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExtraInfo Reserved field which can be ignored generally.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ExtraInfo getExtraInfo() {
        return this.ExtraInfo;
    }

    /**
     * Set Reserved field which can be ignored generally.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExtraInfo Reserved field which can be ignored generally.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExtraInfo(ExtraInfo ExtraInfo) {
        this.ExtraInfo = ExtraInfo;
    }

    /**
     * Get Whether an Anti-DDoS Pro instance can be bound
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsDDos Whether an Anti-DDoS Pro instance can be bound
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsDDos() {
        return this.IsDDos;
    }

    /**
     * Set Whether an Anti-DDoS Pro instance can be bound
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsDDos Whether an Anti-DDoS Pro instance can be bound
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsDDos(Boolean IsDDos) {
        this.IsDDos = IsDDos;
    }

    /**
     * Get Custom configuration ID at the CLB instance level
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ConfigId Custom configuration ID at the CLB instance level
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set Custom configuration ID at the CLB instance level
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ConfigId Custom configuration ID at the CLB instance level
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
    }

    /**
     * Get Whether a real server opens the traffic from a CLB instance to the internet
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return LoadBalancerPassToTarget Whether a real server opens the traffic from a CLB instance to the internet
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getLoadBalancerPassToTarget() {
        return this.LoadBalancerPassToTarget;
    }

    /**
     * Set Whether a real server opens the traffic from a CLB instance to the internet
Note: this field may return null, indicating that no valid values can be obtained.
     * @param LoadBalancerPassToTarget Whether a real server opens the traffic from a CLB instance to the internet
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLoadBalancerPassToTarget(Boolean LoadBalancerPassToTarget) {
        this.LoadBalancerPassToTarget = LoadBalancerPassToTarget;
    }

    /**
     * Get Private network dedicated cluster
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ExclusiveCluster Private network dedicated cluster
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ExclusiveCluster getExclusiveCluster() {
        return this.ExclusiveCluster;
    }

    /**
     * Set Private network dedicated cluster
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ExclusiveCluster Private network dedicated cluster
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setExclusiveCluster(ExclusiveCluster ExclusiveCluster) {
        this.ExclusiveCluster = ExclusiveCluster;
    }

    /**
     * Get This field is meaningful only when the IP address version is `ipv6`. Valid values: IPv6Nat64, IPv6FullChain
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IPv6Mode This field is meaningful only when the IP address version is `ipv6`. Valid values: IPv6Nat64, IPv6FullChain
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getIPv6Mode() {
        return this.IPv6Mode;
    }

    /**
     * Set This field is meaningful only when the IP address version is `ipv6`. Valid values: IPv6Nat64, IPv6FullChain
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IPv6Mode This field is meaningful only when the IP address version is `ipv6`. Valid values: IPv6Nat64, IPv6FullChain
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIPv6Mode(String IPv6Mode) {
        this.IPv6Mode = IPv6Mode;
    }

    /**
     * Get Whether to enable SnatPro.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SnatPro Whether to enable SnatPro.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getSnatPro() {
        return this.SnatPro;
    }

    /**
     * Set Whether to enable SnatPro.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SnatPro Whether to enable SnatPro.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSnatPro(Boolean SnatPro) {
        this.SnatPro = SnatPro;
    }

    /**
     * Get `SnatIp` list after SnatPro load balancing is enabled.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SnatIps `SnatIp` list after SnatPro load balancing is enabled.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public SnatIp [] getSnatIps() {
        return this.SnatIps;
    }

    /**
     * Set `SnatIp` list after SnatPro load balancing is enabled.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SnatIps `SnatIp` list after SnatPro load balancing is enabled.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSnatIps(SnatIp [] SnatIps) {
        this.SnatIps = SnatIps;
    }

    /**
     * Get Performance guarantee specification
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SlaType Performance guarantee specification
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getSlaType() {
        return this.SlaType;
    }

    /**
     * Set Performance guarantee specification
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SlaType Performance guarantee specification
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSlaType(String SlaType) {
        this.SlaType = SlaType;
    }

    /**
     * Get Whether VIP is blocked
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IsBlock Whether VIP is blocked
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsBlock() {
        return this.IsBlock;
    }

    /**
     * Set Whether VIP is blocked
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IsBlock Whether VIP is blocked
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIsBlock(Boolean IsBlock) {
        this.IsBlock = IsBlock;
    }

    /**
     * Get Time blocked or unblocked
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IsBlockTime Time blocked or unblocked
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getIsBlockTime() {
        return this.IsBlockTime;
    }

    /**
     * Set Time blocked or unblocked
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IsBlockTime Time blocked or unblocked
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIsBlockTime(String IsBlockTime) {
        this.IsBlockTime = IsBlockTime;
    }

    /**
     * Get Whether the IP type is the local BGP 
     * @return LocalBgp Whether the IP type is the local BGP
     */
    public Boolean getLocalBgp() {
        return this.LocalBgp;
    }

    /**
     * Set Whether the IP type is the local BGP
     * @param LocalBgp Whether the IP type is the local BGP
     */
    public void setLocalBgp(Boolean LocalBgp) {
        this.LocalBgp = LocalBgp;
    }

    /**
     * Get Dedicated layer-7 tag.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ClusterTag Dedicated layer-7 tag.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getClusterTag() {
        return this.ClusterTag;
    }

    /**
     * Set Dedicated layer-7 tag.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ClusterTag Dedicated layer-7 tag.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setClusterTag(String ClusterTag) {
        this.ClusterTag = ClusterTag;
    }

    /**
     * Get If the layer-7 listener of an IPv6FullChain CLB instance is enabled, the CLB instance can be bound with an IPv4 and an IPv6 CVM instance simultaneously.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MixIpTarget If the layer-7 listener of an IPv6FullChain CLB instance is enabled, the CLB instance can be bound with an IPv4 and an IPv6 CVM instance simultaneously.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getMixIpTarget() {
        return this.MixIpTarget;
    }

    /**
     * Set If the layer-7 listener of an IPv6FullChain CLB instance is enabled, the CLB instance can be bound with an IPv4 and an IPv6 CVM instance simultaneously.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MixIpTarget If the layer-7 listener of an IPv6FullChain CLB instance is enabled, the CLB instance can be bound with an IPv4 and an IPv6 CVM instance simultaneously.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMixIpTarget(Boolean MixIpTarget) {
        this.MixIpTarget = MixIpTarget;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "LoadBalancerName", this.LoadBalancerName);
        this.setParamSimple(map, prefix + "LoadBalancerType", this.LoadBalancerType);
        this.setParamSimple(map, prefix + "Forward", this.Forward);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArraySimple(map, prefix + "LoadBalancerVips.", this.LoadBalancerVips);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "StatusTime", this.StatusTime);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "OpenBgp", this.OpenBgp);
        this.setParamSimple(map, prefix + "Snat", this.Snat);
        this.setParamSimple(map, prefix + "Isolation", this.Isolation);
        this.setParamSimple(map, prefix + "Log", this.Log);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArraySimple(map, prefix + "SecureGroups.", this.SecureGroups);
        this.setParamObj(map, prefix + "TargetRegionInfo.", this.TargetRegionInfo);
        this.setParamSimple(map, prefix + "AnycastZone", this.AnycastZone);
        this.setParamSimple(map, prefix + "AddressIPVersion", this.AddressIPVersion);
        this.setParamSimple(map, prefix + "NumericalVpcId", this.NumericalVpcId);
        this.setParamSimple(map, prefix + "VipIsp", this.VipIsp);
        this.setParamObj(map, prefix + "MasterZone.", this.MasterZone);
        this.setParamArrayObj(map, prefix + "BackupZoneSet.", this.BackupZoneSet);
        this.setParamSimple(map, prefix + "IsolatedTime", this.IsolatedTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamObj(map, prefix + "NetworkAttributes.", this.NetworkAttributes);
        this.setParamObj(map, prefix + "PrepaidAttributes.", this.PrepaidAttributes);
        this.setParamSimple(map, prefix + "LogSetId", this.LogSetId);
        this.setParamSimple(map, prefix + "LogTopicId", this.LogTopicId);
        this.setParamSimple(map, prefix + "AddressIPv6", this.AddressIPv6);
        this.setParamObj(map, prefix + "ExtraInfo.", this.ExtraInfo);
        this.setParamSimple(map, prefix + "IsDDos", this.IsDDos);
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);
        this.setParamSimple(map, prefix + "LoadBalancerPassToTarget", this.LoadBalancerPassToTarget);
        this.setParamObj(map, prefix + "ExclusiveCluster.", this.ExclusiveCluster);
        this.setParamSimple(map, prefix + "IPv6Mode", this.IPv6Mode);
        this.setParamSimple(map, prefix + "SnatPro", this.SnatPro);
        this.setParamArrayObj(map, prefix + "SnatIps.", this.SnatIps);
        this.setParamSimple(map, prefix + "SlaType", this.SlaType);
        this.setParamSimple(map, prefix + "IsBlock", this.IsBlock);
        this.setParamSimple(map, prefix + "IsBlockTime", this.IsBlockTime);
        this.setParamSimple(map, prefix + "LocalBgp", this.LocalBgp);
        this.setParamSimple(map, prefix + "ClusterTag", this.ClusterTag);
        this.setParamSimple(map, prefix + "MixIpTarget", this.MixIpTarget);

    }
}


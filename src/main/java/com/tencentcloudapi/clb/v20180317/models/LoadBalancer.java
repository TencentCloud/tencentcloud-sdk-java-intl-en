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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoadBalancer extends AbstractModel {

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
    * Network type of the load balancing instance.
OPEN: public network attribute. INTERNAL: private network attribute. for a cloud load balancer with private network attribute, you can bind an EIP for public network access. for details, see the EIP document on binding elastic IP (https://www.tencentcloud.comom/document/product/215/16700?from_cn_redirect=1).
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
    * The domain name of the cloud load balancer instance. this field is only provided for public network classic and domain name-based load balancing instances. it is being gradually phased out. we recommend using LoadBalancerDomain instead.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * List of VIPs of a CLB instance.
    */
    @SerializedName("LoadBalancerVips")
    @Expose
    private String [] LoadBalancerVips;

    /**
    * Specifies the state of the load balancing instance, including.
0: creating. 1: normal operation.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * CLB instance creation time
Format: YYYY-MM-DD HH:MM:ss.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last status transition time of the CLB instance.
Format: YYYY-MM-DD HH:MM:ss.
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
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Anti-DDoS Pro identifier for CLB. 1: CLB with Anti-DDoS Pro; 0: CLB without Anti-DDoS Pro.
    */
    @SerializedName("OpenBgp")
    @Expose
    private Long OpenBgp;

    /**
    * Whether SNAT is enabled. for traditional private network clbs before december 2016, SNAT was enabled.
    */
    @SerializedName("Snat")
    @Expose
    private Boolean Snat;

    /**
    * Whether isolated. 0 means not isolated. 1 means isolated.
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
    * Subnet of the CLB instance (applicable only to VPC-type CLB instances on private networks)
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * CLB instance tag information
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * Security group of the CLB instance
    */
    @SerializedName("SecureGroups")
    @Expose
    private String [] SecureGroups;

    /**
    * Basic information of real servers bound to the CLB instance
    */
    @SerializedName("TargetRegionInfo")
    @Expose
    private TargetRegionInfo TargetRegionInfo;

    /**
    * Anycast CLB release domain. For non-anycast CLB, this field returns an empty string.
    */
    @SerializedName("AnycastZone")
    @Expose
    private String AnycastZone;

    /**
    * IP Version, ipv4 | ipv6
    */
    @SerializedName("AddressIPVersion")
    @Expose
    private String AddressIPVersion;

    /**
    * Specifies the VPC ID in numerical form, obtainable through the DescribeVpcs API (https://www.tencentcloud.comom/document/product/215/15778?from_cn_redirect=1).
    */
    @SerializedName("NumericalVpcId")
    @Expose
    private Long NumericalVpcId;

    /**
    * Specifies the ISP of the load balancer IP address.

-BGP (multi-line).
- CMCC: CMCC single line network.
-CTCC: ctcc single-line.
- CUCC: china unicom single-line.
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
    * Specifies the isolation time of the cloud load balancer instance.
Format: YYYY-MM-DD HH:MM:ss.
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
    * Billing mode of CLB instance. Valid values: PREPAID (monthly subscription), POSTPAID_BY_HOUR (pay as you go).
Note: this field may return `null`, indicating that no valid values can be obtained.
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
    * Log set ID of Cloud Log Service (CLS) for CLB
    */
    @SerializedName("LogSetId")
    @Expose
    private String LogSetId;

    /**
    * Log topic ID of Cloud Log Service (CLS) for CLB
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
    */
    @SerializedName("IsDDos")
    @Expose
    private Boolean IsDDos;

    /**
    * Custom configuration IDs of CLB instances
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
    * Whether the real server allows traffic from CLB
    */
    @SerializedName("LoadBalancerPassToTarget")
    @Expose
    private Boolean LoadBalancerPassToTarget;

    /**
    * Exclusive cluster on the private network
    */
    @SerializedName("ExclusiveCluster")
    @Expose
    private ExclusiveCluster ExclusiveCluster;

    /**
    * Specifies the field is meaningful when the IP address version is ipv6. valid values: ipv6Nat64 | ipv6FullChain.
IPv6Nat64: specifies a load balancer based on Nat64 IPv6 transition technology.
IPv6FullChain: specifies a cloud load balancer implemented based on ipv6 single-stack technology.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IPv6Mode")
    @Expose
    private String IPv6Mode;

    /**
    * Specifies whether SnatPro is enabled.
    */
    @SerializedName("SnatPro")
    @Expose
    private Boolean SnatPro;

    /**
    * Enables the SnatIp list after turning on SnatPro load balancing.
    */
    @SerializedName("SnatIps")
    @Expose
    private SnatIp [] SnatIps;

    /**
    * Performance capacity specification. <ul><li> clb.c1.small: minimalist specification </li> <li> clb.c2.medium: standard specification </li> <li> clb.c3.small: advanced type 1 specification </li> <li> clb.c3.medium: advanced type 2 specification </li> <li> clb.c4.small: super type 1 specification </li> <li> clb.c4.medium: super type 2 specification </li> <li> clb.c4.large: super type 3 specification </li> <li> clb.c4.xlarge: super type 4 specification </li> <li>"" : non-performance capacity instance</li></ul>.
    */
    @SerializedName("SlaType")
    @Expose
    private String SlaType;

    /**
    * Whether VIP is blocked
    */
    @SerializedName("IsBlock")
    @Expose
    private Boolean IsBlock;

    /**
    * Specifies the blocking or unblocking time.
Format: YYYY-MM-DD HH:MM:ss.
    */
    @SerializedName("IsBlockTime")
    @Expose
    private String IsBlockTime;

    /**
    * Whether the IP type is Local BGP
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
    * If the layer-7 listener of an IPv6FullChain CLB instance is enabled, the CLB instance can be bound with IPv4 and IPv6 CVM instances simultaneously.
    */
    @SerializedName("MixIpTarget")
    @Expose
    private Boolean MixIpTarget;

    /**
    * Availability zone of a VPC-based private network CLB instance
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * Whether it is an NFV CLB instance. No returned information: no; l7nfv: yes.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("NfvInfo")
    @Expose
    private String NfvInfo;

    /**
    * Health check log set ID of Cloud Log Service (CLS) for CLB
    */
    @SerializedName("HealthLogSetId")
    @Expose
    private String HealthLogSetId;

    /**
    * Health check log topic ID of Cloud Log Service (CLS) for CLB
    */
    @SerializedName("HealthLogTopicId")
    @Expose
    private String HealthLogTopicId;

    /**
    * Cluster ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterIds")
    @Expose
    private String [] ClusterIds;

    /**
    * Attributes of cloud load balancer, input an array of strings to determine whether it is enabled.
DeleteProtect: specifies deletion protection. once enabled, it prevents the cloud load balancer from being accidentally deleted. 
UserInVisible: invisible to users, controls load balancing visibility to users. 
BlockStatus: specifies the blockage status, used to limit certain operations or traffic for cloud load balancer. 
NoLBNat: disables the NAT feature of cloud load balancer for direct forwarding of traffic in specific scenarios. 
BanStatus: specifies the blocking status for suspending the clb service or restricting access. 
ShiftupFlag: specifies the upgrade flag used to identify if the cloud load balancer requires a configuration upgrade or performance improvement. 
Specifies the stopped status. once enabled, the cloud load balancer suspends service. 
NoVpcGw: specifies not to use VPC gateway to bypass the gateway for direct traffic handling. 
SgInTgw: specifies the security group in TGW (Transit Gateway) involving network security policy configuration. 
SharedLimitFlag: specifies the shared limit flag used to control the resource constraints of cloud load balancer. 
WafFlag: specifies the Web application firewall (WAF) flag. enabled to enable WAF protection. 
IsDomainCLB: indicates whether the cloud load balancer is domain name-based for traffic distribution. 
IPv6Snat: IPv6 source address translation (Snat), used for source address processing in IPv6 networks. 
HideDomain. specifies whether to hide the domain name for privacy protection or to avoid exposing it in specific scenarios. 
JumboFrame: specifies giant frame support. once enabled, it supports larger data frames to improve network efficiency. 
NoLBNatL4IPdc: specifies layer 4 IP direct connection without NAT, used for direct forwarding of IP traffic in layer 4 load balancing. 
VpcGwL3Service: specifies the VPC gateway layer-3 Service, which involves the gateway feature of the layer-3 network. 
Ipv62Flag: specifies the Ipv6 expansion Flag for specific feature support. 
Ipv62ExclusiveFlag: specifies the Ipv6 exclusive flag used for exclusive Ipv6 traffic processing. 
BgpPro: specifies BGP Pro support. 
ToaClean: TOA (TCP Option Address) cleanup. clears Address information in TCP options. 

    */
    @SerializedName("AttributeFlags")
    @Expose
    private String [] AttributeFlags;

    /**
    * Specifies the domain name of the load balancing instance.
    */
    @SerializedName("LoadBalancerDomain")
    @Expose
    private String LoadBalancerDomain;

    /**
    * Specifies the network outbound.
    */
    @SerializedName("Egress")
    @Expose
    private String Egress;

    /**
    * Indicates whether the instance type is dedicated. 1: dedicated instance. 0: non-dedicated instance.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Exclusive")
    @Expose
    private Long Exclusive;

    /**
    * Specifies the number of bound backend services.
    */
    @SerializedName("TargetCount")
    @Expose
    private Long TargetCount;

    /**
    * Specifies the Endpoint id associated with the clb instance.
    */
    @SerializedName("AssociateEndpoint")
    @Expose
    private String AssociateEndpoint;

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
     * Get Network type of the load balancing instance.
OPEN: public network attribute. INTERNAL: private network attribute. for a cloud load balancer with private network attribute, you can bind an EIP for public network access. for details, see the EIP document on binding elastic IP (https://www.tencentcloud.comom/document/product/215/16700?from_cn_redirect=1). 
     * @return LoadBalancerType Network type of the load balancing instance.
OPEN: public network attribute. INTERNAL: private network attribute. for a cloud load balancer with private network attribute, you can bind an EIP for public network access. for details, see the EIP document on binding elastic IP (https://www.tencentcloud.comom/document/product/215/16700?from_cn_redirect=1).
     */
    public String getLoadBalancerType() {
        return this.LoadBalancerType;
    }

    /**
     * Set Network type of the load balancing instance.
OPEN: public network attribute. INTERNAL: private network attribute. for a cloud load balancer with private network attribute, you can bind an EIP for public network access. for details, see the EIP document on binding elastic IP (https://www.tencentcloud.comom/document/product/215/16700?from_cn_redirect=1).
     * @param LoadBalancerType Network type of the load balancing instance.
OPEN: public network attribute. INTERNAL: private network attribute. for a cloud load balancer with private network attribute, you can bind an EIP for public network access. for details, see the EIP document on binding elastic IP (https://www.tencentcloud.comom/document/product/215/16700?from_cn_redirect=1).
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
     * Get The domain name of the cloud load balancer instance. this field is only provided for public network classic and domain name-based load balancing instances. it is being gradually phased out. we recommend using LoadBalancerDomain instead. 
     * @return Domain The domain name of the cloud load balancer instance. this field is only provided for public network classic and domain name-based load balancing instances. it is being gradually phased out. we recommend using LoadBalancerDomain instead.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set The domain name of the cloud load balancer instance. this field is only provided for public network classic and domain name-based load balancing instances. it is being gradually phased out. we recommend using LoadBalancerDomain instead.
     * @param Domain The domain name of the cloud load balancer instance. this field is only provided for public network classic and domain name-based load balancing instances. it is being gradually phased out. we recommend using LoadBalancerDomain instead.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get List of VIPs of a CLB instance. 
     * @return LoadBalancerVips List of VIPs of a CLB instance.
     */
    public String [] getLoadBalancerVips() {
        return this.LoadBalancerVips;
    }

    /**
     * Set List of VIPs of a CLB instance.
     * @param LoadBalancerVips List of VIPs of a CLB instance.
     */
    public void setLoadBalancerVips(String [] LoadBalancerVips) {
        this.LoadBalancerVips = LoadBalancerVips;
    }

    /**
     * Get Specifies the state of the load balancing instance, including.
0: creating. 1: normal operation. 
     * @return Status Specifies the state of the load balancing instance, including.
0: creating. 1: normal operation.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Specifies the state of the load balancing instance, including.
0: creating. 1: normal operation.
     * @param Status Specifies the state of the load balancing instance, including.
0: creating. 1: normal operation.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get CLB instance creation time
Format: YYYY-MM-DD HH:MM:ss. 
     * @return CreateTime CLB instance creation time
Format: YYYY-MM-DD HH:MM:ss.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set CLB instance creation time
Format: YYYY-MM-DD HH:MM:ss.
     * @param CreateTime CLB instance creation time
Format: YYYY-MM-DD HH:MM:ss.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last status transition time of the CLB instance.
Format: YYYY-MM-DD HH:MM:ss. 
     * @return StatusTime Last status transition time of the CLB instance.
Format: YYYY-MM-DD HH:MM:ss.
     */
    public String getStatusTime() {
        return this.StatusTime;
    }

    /**
     * Set Last status transition time of the CLB instance.
Format: YYYY-MM-DD HH:MM:ss.
     * @param StatusTime Last status transition time of the CLB instance.
Format: YYYY-MM-DD HH:MM:ss.
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
     * Get Anti-DDoS Pro identifier for CLB. 1: CLB with Anti-DDoS Pro; 0: CLB without Anti-DDoS Pro. 
     * @return OpenBgp Anti-DDoS Pro identifier for CLB. 1: CLB with Anti-DDoS Pro; 0: CLB without Anti-DDoS Pro.
     */
    public Long getOpenBgp() {
        return this.OpenBgp;
    }

    /**
     * Set Anti-DDoS Pro identifier for CLB. 1: CLB with Anti-DDoS Pro; 0: CLB without Anti-DDoS Pro.
     * @param OpenBgp Anti-DDoS Pro identifier for CLB. 1: CLB with Anti-DDoS Pro; 0: CLB without Anti-DDoS Pro.
     */
    public void setOpenBgp(Long OpenBgp) {
        this.OpenBgp = OpenBgp;
    }

    /**
     * Get Whether SNAT is enabled. for traditional private network clbs before december 2016, SNAT was enabled. 
     * @return Snat Whether SNAT is enabled. for traditional private network clbs before december 2016, SNAT was enabled.
     */
    public Boolean getSnat() {
        return this.Snat;
    }

    /**
     * Set Whether SNAT is enabled. for traditional private network clbs before december 2016, SNAT was enabled.
     * @param Snat Whether SNAT is enabled. for traditional private network clbs before december 2016, SNAT was enabled.
     */
    public void setSnat(Boolean Snat) {
        this.Snat = Snat;
    }

    /**
     * Get Whether isolated. 0 means not isolated. 1 means isolated. 
     * @return Isolation Whether isolated. 0 means not isolated. 1 means isolated.
     */
    public Long getIsolation() {
        return this.Isolation;
    }

    /**
     * Set Whether isolated. 0 means not isolated. 1 means isolated.
     * @param Isolation Whether isolated. 0 means not isolated. 1 means isolated.
     */
    public void setIsolation(Long Isolation) {
        this.Isolation = Isolation;
    }

    /**
     * Get Log information. Only the public network CLB that have HTTP or HTTPS listeners can generate logs.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Log Log information. Only the public network CLB that have HTTP or HTTPS listeners can generate logs.
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public String getLog() {
        return this.Log;
    }

    /**
     * Set Log information. Only the public network CLB that have HTTP or HTTPS listeners can generate logs.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Log Log information. Only the public network CLB that have HTTP or HTTPS listeners can generate logs.
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setLog(String Log) {
        this.Log = Log;
    }

    /**
     * Get Subnet of the CLB instance (applicable only to VPC-type CLB instances on private networks) 
     * @return SubnetId Subnet of the CLB instance (applicable only to VPC-type CLB instances on private networks)
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet of the CLB instance (applicable only to VPC-type CLB instances on private networks)
     * @param SubnetId Subnet of the CLB instance (applicable only to VPC-type CLB instances on private networks)
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get CLB instance tag information 
     * @return Tags CLB instance tag information
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set CLB instance tag information
     * @param Tags CLB instance tag information
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Security group of the CLB instance 
     * @return SecureGroups Security group of the CLB instance
     */
    public String [] getSecureGroups() {
        return this.SecureGroups;
    }

    /**
     * Set Security group of the CLB instance
     * @param SecureGroups Security group of the CLB instance
     */
    public void setSecureGroups(String [] SecureGroups) {
        this.SecureGroups = SecureGroups;
    }

    /**
     * Get Basic information of real servers bound to the CLB instance 
     * @return TargetRegionInfo Basic information of real servers bound to the CLB instance
     */
    public TargetRegionInfo getTargetRegionInfo() {
        return this.TargetRegionInfo;
    }

    /**
     * Set Basic information of real servers bound to the CLB instance
     * @param TargetRegionInfo Basic information of real servers bound to the CLB instance
     */
    public void setTargetRegionInfo(TargetRegionInfo TargetRegionInfo) {
        this.TargetRegionInfo = TargetRegionInfo;
    }

    /**
     * Get Anycast CLB release domain. For non-anycast CLB, this field returns an empty string. 
     * @return AnycastZone Anycast CLB release domain. For non-anycast CLB, this field returns an empty string.
     */
    public String getAnycastZone() {
        return this.AnycastZone;
    }

    /**
     * Set Anycast CLB release domain. For non-anycast CLB, this field returns an empty string.
     * @param AnycastZone Anycast CLB release domain. For non-anycast CLB, this field returns an empty string.
     */
    public void setAnycastZone(String AnycastZone) {
        this.AnycastZone = AnycastZone;
    }

    /**
     * Get IP Version, ipv4 | ipv6 
     * @return AddressIPVersion IP Version, ipv4 | ipv6
     */
    public String getAddressIPVersion() {
        return this.AddressIPVersion;
    }

    /**
     * Set IP Version, ipv4 | ipv6
     * @param AddressIPVersion IP Version, ipv4 | ipv6
     */
    public void setAddressIPVersion(String AddressIPVersion) {
        this.AddressIPVersion = AddressIPVersion;
    }

    /**
     * Get Specifies the VPC ID in numerical form, obtainable through the DescribeVpcs API (https://www.tencentcloud.comom/document/product/215/15778?from_cn_redirect=1). 
     * @return NumericalVpcId Specifies the VPC ID in numerical form, obtainable through the DescribeVpcs API (https://www.tencentcloud.comom/document/product/215/15778?from_cn_redirect=1).
     */
    public Long getNumericalVpcId() {
        return this.NumericalVpcId;
    }

    /**
     * Set Specifies the VPC ID in numerical form, obtainable through the DescribeVpcs API (https://www.tencentcloud.comom/document/product/215/15778?from_cn_redirect=1).
     * @param NumericalVpcId Specifies the VPC ID in numerical form, obtainable through the DescribeVpcs API (https://www.tencentcloud.comom/document/product/215/15778?from_cn_redirect=1).
     */
    public void setNumericalVpcId(Long NumericalVpcId) {
        this.NumericalVpcId = NumericalVpcId;
    }

    /**
     * Get Specifies the ISP of the load balancer IP address.

-BGP (multi-line).
- CMCC: CMCC single line network.
-CTCC: ctcc single-line.
- CUCC: china unicom single-line.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VipIsp Specifies the ISP of the load balancer IP address.

-BGP (multi-line).
- CMCC: CMCC single line network.
-CTCC: ctcc single-line.
- CUCC: china unicom single-line.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVipIsp() {
        return this.VipIsp;
    }

    /**
     * Set Specifies the ISP of the load balancer IP address.

-BGP (multi-line).
- CMCC: CMCC single line network.
-CTCC: ctcc single-line.
- CUCC: china unicom single-line.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VipIsp Specifies the ISP of the load balancer IP address.

-BGP (multi-line).
- CMCC: CMCC single line network.
-CTCC: ctcc single-line.
- CUCC: china unicom single-line.
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
     * Get Specifies the isolation time of the cloud load balancer instance.
Format: YYYY-MM-DD HH:MM:ss.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsolatedTime Specifies the isolation time of the cloud load balancer instance.
Format: YYYY-MM-DD HH:MM:ss.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIsolatedTime() {
        return this.IsolatedTime;
    }

    /**
     * Set Specifies the isolation time of the cloud load balancer instance.
Format: YYYY-MM-DD HH:MM:ss.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsolatedTime Specifies the isolation time of the cloud load balancer instance.
Format: YYYY-MM-DD HH:MM:ss.
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
     * Get Billing mode of CLB instance. Valid values: PREPAID (monthly subscription), POSTPAID_BY_HOUR (pay as you go).
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ChargeType Billing mode of CLB instance. Valid values: PREPAID (monthly subscription), POSTPAID_BY_HOUR (pay as you go).
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set Billing mode of CLB instance. Valid values: PREPAID (monthly subscription), POSTPAID_BY_HOUR (pay as you go).
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ChargeType Billing mode of CLB instance. Valid values: PREPAID (monthly subscription), POSTPAID_BY_HOUR (pay as you go).
Note: this field may return `null`, indicating that no valid values can be obtained.
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
     * Get Log set ID of Cloud Log Service (CLS) for CLB 
     * @return LogSetId Log set ID of Cloud Log Service (CLS) for CLB
     */
    public String getLogSetId() {
        return this.LogSetId;
    }

    /**
     * Set Log set ID of Cloud Log Service (CLS) for CLB
     * @param LogSetId Log set ID of Cloud Log Service (CLS) for CLB
     */
    public void setLogSetId(String LogSetId) {
        this.LogSetId = LogSetId;
    }

    /**
     * Get Log topic ID of Cloud Log Service (CLS) for CLB 
     * @return LogTopicId Log topic ID of Cloud Log Service (CLS) for CLB
     */
    public String getLogTopicId() {
        return this.LogTopicId;
    }

    /**
     * Set Log topic ID of Cloud Log Service (CLS) for CLB
     * @param LogTopicId Log topic ID of Cloud Log Service (CLS) for CLB
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
     * @return IsDDos Whether an Anti-DDoS Pro instance can be bound
     */
    public Boolean getIsDDos() {
        return this.IsDDos;
    }

    /**
     * Set Whether an Anti-DDoS Pro instance can be bound
     * @param IsDDos Whether an Anti-DDoS Pro instance can be bound
     */
    public void setIsDDos(Boolean IsDDos) {
        this.IsDDos = IsDDos;
    }

    /**
     * Get Custom configuration IDs of CLB instances 
     * @return ConfigId Custom configuration IDs of CLB instances
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set Custom configuration IDs of CLB instances
     * @param ConfigId Custom configuration IDs of CLB instances
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
    }

    /**
     * Get Whether the real server allows traffic from CLB 
     * @return LoadBalancerPassToTarget Whether the real server allows traffic from CLB
     */
    public Boolean getLoadBalancerPassToTarget() {
        return this.LoadBalancerPassToTarget;
    }

    /**
     * Set Whether the real server allows traffic from CLB
     * @param LoadBalancerPassToTarget Whether the real server allows traffic from CLB
     */
    public void setLoadBalancerPassToTarget(Boolean LoadBalancerPassToTarget) {
        this.LoadBalancerPassToTarget = LoadBalancerPassToTarget;
    }

    /**
     * Get Exclusive cluster on the private network 
     * @return ExclusiveCluster Exclusive cluster on the private network
     */
    public ExclusiveCluster getExclusiveCluster() {
        return this.ExclusiveCluster;
    }

    /**
     * Set Exclusive cluster on the private network
     * @param ExclusiveCluster Exclusive cluster on the private network
     */
    public void setExclusiveCluster(ExclusiveCluster ExclusiveCluster) {
        this.ExclusiveCluster = ExclusiveCluster;
    }

    /**
     * Get Specifies the field is meaningful when the IP address version is ipv6. valid values: ipv6Nat64 | ipv6FullChain.
IPv6Nat64: specifies a load balancer based on Nat64 IPv6 transition technology.
IPv6FullChain: specifies a cloud load balancer implemented based on ipv6 single-stack technology.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IPv6Mode Specifies the field is meaningful when the IP address version is ipv6. valid values: ipv6Nat64 | ipv6FullChain.
IPv6Nat64: specifies a load balancer based on Nat64 IPv6 transition technology.
IPv6FullChain: specifies a cloud load balancer implemented based on ipv6 single-stack technology.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIPv6Mode() {
        return this.IPv6Mode;
    }

    /**
     * Set Specifies the field is meaningful when the IP address version is ipv6. valid values: ipv6Nat64 | ipv6FullChain.
IPv6Nat64: specifies a load balancer based on Nat64 IPv6 transition technology.
IPv6FullChain: specifies a cloud load balancer implemented based on ipv6 single-stack technology.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IPv6Mode Specifies the field is meaningful when the IP address version is ipv6. valid values: ipv6Nat64 | ipv6FullChain.
IPv6Nat64: specifies a load balancer based on Nat64 IPv6 transition technology.
IPv6FullChain: specifies a cloud load balancer implemented based on ipv6 single-stack technology.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIPv6Mode(String IPv6Mode) {
        this.IPv6Mode = IPv6Mode;
    }

    /**
     * Get Specifies whether SnatPro is enabled. 
     * @return SnatPro Specifies whether SnatPro is enabled.
     */
    public Boolean getSnatPro() {
        return this.SnatPro;
    }

    /**
     * Set Specifies whether SnatPro is enabled.
     * @param SnatPro Specifies whether SnatPro is enabled.
     */
    public void setSnatPro(Boolean SnatPro) {
        this.SnatPro = SnatPro;
    }

    /**
     * Get Enables the SnatIp list after turning on SnatPro load balancing. 
     * @return SnatIps Enables the SnatIp list after turning on SnatPro load balancing.
     */
    public SnatIp [] getSnatIps() {
        return this.SnatIps;
    }

    /**
     * Set Enables the SnatIp list after turning on SnatPro load balancing.
     * @param SnatIps Enables the SnatIp list after turning on SnatPro load balancing.
     */
    public void setSnatIps(SnatIp [] SnatIps) {
        this.SnatIps = SnatIps;
    }

    /**
     * Get Performance capacity specification. <ul><li> clb.c1.small: minimalist specification </li> <li> clb.c2.medium: standard specification </li> <li> clb.c3.small: advanced type 1 specification </li> <li> clb.c3.medium: advanced type 2 specification </li> <li> clb.c4.small: super type 1 specification </li> <li> clb.c4.medium: super type 2 specification </li> <li> clb.c4.large: super type 3 specification </li> <li> clb.c4.xlarge: super type 4 specification </li> <li>"" : non-performance capacity instance</li></ul>. 
     * @return SlaType Performance capacity specification. <ul><li> clb.c1.small: minimalist specification </li> <li> clb.c2.medium: standard specification </li> <li> clb.c3.small: advanced type 1 specification </li> <li> clb.c3.medium: advanced type 2 specification </li> <li> clb.c4.small: super type 1 specification </li> <li> clb.c4.medium: super type 2 specification </li> <li> clb.c4.large: super type 3 specification </li> <li> clb.c4.xlarge: super type 4 specification </li> <li>"" : non-performance capacity instance</li></ul>.
     */
    public String getSlaType() {
        return this.SlaType;
    }

    /**
     * Set Performance capacity specification. <ul><li> clb.c1.small: minimalist specification </li> <li> clb.c2.medium: standard specification </li> <li> clb.c3.small: advanced type 1 specification </li> <li> clb.c3.medium: advanced type 2 specification </li> <li> clb.c4.small: super type 1 specification </li> <li> clb.c4.medium: super type 2 specification </li> <li> clb.c4.large: super type 3 specification </li> <li> clb.c4.xlarge: super type 4 specification </li> <li>"" : non-performance capacity instance</li></ul>.
     * @param SlaType Performance capacity specification. <ul><li> clb.c1.small: minimalist specification </li> <li> clb.c2.medium: standard specification </li> <li> clb.c3.small: advanced type 1 specification </li> <li> clb.c3.medium: advanced type 2 specification </li> <li> clb.c4.small: super type 1 specification </li> <li> clb.c4.medium: super type 2 specification </li> <li> clb.c4.large: super type 3 specification </li> <li> clb.c4.xlarge: super type 4 specification </li> <li>"" : non-performance capacity instance</li></ul>.
     */
    public void setSlaType(String SlaType) {
        this.SlaType = SlaType;
    }

    /**
     * Get Whether VIP is blocked 
     * @return IsBlock Whether VIP is blocked
     */
    public Boolean getIsBlock() {
        return this.IsBlock;
    }

    /**
     * Set Whether VIP is blocked
     * @param IsBlock Whether VIP is blocked
     */
    public void setIsBlock(Boolean IsBlock) {
        this.IsBlock = IsBlock;
    }

    /**
     * Get Specifies the blocking or unblocking time.
Format: YYYY-MM-DD HH:MM:ss. 
     * @return IsBlockTime Specifies the blocking or unblocking time.
Format: YYYY-MM-DD HH:MM:ss.
     */
    public String getIsBlockTime() {
        return this.IsBlockTime;
    }

    /**
     * Set Specifies the blocking or unblocking time.
Format: YYYY-MM-DD HH:MM:ss.
     * @param IsBlockTime Specifies the blocking or unblocking time.
Format: YYYY-MM-DD HH:MM:ss.
     */
    public void setIsBlockTime(String IsBlockTime) {
        this.IsBlockTime = IsBlockTime;
    }

    /**
     * Get Whether the IP type is Local BGP 
     * @return LocalBgp Whether the IP type is Local BGP
     */
    public Boolean getLocalBgp() {
        return this.LocalBgp;
    }

    /**
     * Set Whether the IP type is Local BGP
     * @param LocalBgp Whether the IP type is Local BGP
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
     * Get If the layer-7 listener of an IPv6FullChain CLB instance is enabled, the CLB instance can be bound with IPv4 and IPv6 CVM instances simultaneously. 
     * @return MixIpTarget If the layer-7 listener of an IPv6FullChain CLB instance is enabled, the CLB instance can be bound with IPv4 and IPv6 CVM instances simultaneously.
     */
    public Boolean getMixIpTarget() {
        return this.MixIpTarget;
    }

    /**
     * Set If the layer-7 listener of an IPv6FullChain CLB instance is enabled, the CLB instance can be bound with IPv4 and IPv6 CVM instances simultaneously.
     * @param MixIpTarget If the layer-7 listener of an IPv6FullChain CLB instance is enabled, the CLB instance can be bound with IPv4 and IPv6 CVM instances simultaneously.
     */
    public void setMixIpTarget(Boolean MixIpTarget) {
        this.MixIpTarget = MixIpTarget;
    }

    /**
     * Get Availability zone of a VPC-based private network CLB instance
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Zones Availability zone of a VPC-based private network CLB instance
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set Availability zone of a VPC-based private network CLB instance
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Zones Availability zone of a VPC-based private network CLB instance
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get Whether it is an NFV CLB instance. No returned information: no; l7nfv: yes.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return NfvInfo Whether it is an NFV CLB instance. No returned information: no; l7nfv: yes.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getNfvInfo() {
        return this.NfvInfo;
    }

    /**
     * Set Whether it is an NFV CLB instance. No returned information: no; l7nfv: yes.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param NfvInfo Whether it is an NFV CLB instance. No returned information: no; l7nfv: yes.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setNfvInfo(String NfvInfo) {
        this.NfvInfo = NfvInfo;
    }

    /**
     * Get Health check log set ID of Cloud Log Service (CLS) for CLB 
     * @return HealthLogSetId Health check log set ID of Cloud Log Service (CLS) for CLB
     */
    public String getHealthLogSetId() {
        return this.HealthLogSetId;
    }

    /**
     * Set Health check log set ID of Cloud Log Service (CLS) for CLB
     * @param HealthLogSetId Health check log set ID of Cloud Log Service (CLS) for CLB
     */
    public void setHealthLogSetId(String HealthLogSetId) {
        this.HealthLogSetId = HealthLogSetId;
    }

    /**
     * Get Health check log topic ID of Cloud Log Service (CLS) for CLB 
     * @return HealthLogTopicId Health check log topic ID of Cloud Log Service (CLS) for CLB
     */
    public String getHealthLogTopicId() {
        return this.HealthLogTopicId;
    }

    /**
     * Set Health check log topic ID of Cloud Log Service (CLS) for CLB
     * @param HealthLogTopicId Health check log topic ID of Cloud Log Service (CLS) for CLB
     */
    public void setHealthLogTopicId(String HealthLogTopicId) {
        this.HealthLogTopicId = HealthLogTopicId;
    }

    /**
     * Get Cluster ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClusterIds Cluster ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getClusterIds() {
        return this.ClusterIds;
    }

    /**
     * Set Cluster ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClusterIds Cluster ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClusterIds(String [] ClusterIds) {
        this.ClusterIds = ClusterIds;
    }

    /**
     * Get Attributes of cloud load balancer, input an array of strings to determine whether it is enabled.
DeleteProtect: specifies deletion protection. once enabled, it prevents the cloud load balancer from being accidentally deleted. 
UserInVisible: invisible to users, controls load balancing visibility to users. 
BlockStatus: specifies the blockage status, used to limit certain operations or traffic for cloud load balancer. 
NoLBNat: disables the NAT feature of cloud load balancer for direct forwarding of traffic in specific scenarios. 
BanStatus: specifies the blocking status for suspending the clb service or restricting access. 
ShiftupFlag: specifies the upgrade flag used to identify if the cloud load balancer requires a configuration upgrade or performance improvement. 
Specifies the stopped status. once enabled, the cloud load balancer suspends service. 
NoVpcGw: specifies not to use VPC gateway to bypass the gateway for direct traffic handling. 
SgInTgw: specifies the security group in TGW (Transit Gateway) involving network security policy configuration. 
SharedLimitFlag: specifies the shared limit flag used to control the resource constraints of cloud load balancer. 
WafFlag: specifies the Web application firewall (WAF) flag. enabled to enable WAF protection. 
IsDomainCLB: indicates whether the cloud load balancer is domain name-based for traffic distribution. 
IPv6Snat: IPv6 source address translation (Snat), used for source address processing in IPv6 networks. 
HideDomain. specifies whether to hide the domain name for privacy protection or to avoid exposing it in specific scenarios. 
JumboFrame: specifies giant frame support. once enabled, it supports larger data frames to improve network efficiency. 
NoLBNatL4IPdc: specifies layer 4 IP direct connection without NAT, used for direct forwarding of IP traffic in layer 4 load balancing. 
VpcGwL3Service: specifies the VPC gateway layer-3 Service, which involves the gateway feature of the layer-3 network. 
Ipv62Flag: specifies the Ipv6 expansion Flag for specific feature support. 
Ipv62ExclusiveFlag: specifies the Ipv6 exclusive flag used for exclusive Ipv6 traffic processing. 
BgpPro: specifies BGP Pro support. 
ToaClean: TOA (TCP Option Address) cleanup. clears Address information in TCP options. 
 
     * @return AttributeFlags Attributes of cloud load balancer, input an array of strings to determine whether it is enabled.
DeleteProtect: specifies deletion protection. once enabled, it prevents the cloud load balancer from being accidentally deleted. 
UserInVisible: invisible to users, controls load balancing visibility to users. 
BlockStatus: specifies the blockage status, used to limit certain operations or traffic for cloud load balancer. 
NoLBNat: disables the NAT feature of cloud load balancer for direct forwarding of traffic in specific scenarios. 
BanStatus: specifies the blocking status for suspending the clb service or restricting access. 
ShiftupFlag: specifies the upgrade flag used to identify if the cloud load balancer requires a configuration upgrade or performance improvement. 
Specifies the stopped status. once enabled, the cloud load balancer suspends service. 
NoVpcGw: specifies not to use VPC gateway to bypass the gateway for direct traffic handling. 
SgInTgw: specifies the security group in TGW (Transit Gateway) involving network security policy configuration. 
SharedLimitFlag: specifies the shared limit flag used to control the resource constraints of cloud load balancer. 
WafFlag: specifies the Web application firewall (WAF) flag. enabled to enable WAF protection. 
IsDomainCLB: indicates whether the cloud load balancer is domain name-based for traffic distribution. 
IPv6Snat: IPv6 source address translation (Snat), used for source address processing in IPv6 networks. 
HideDomain. specifies whether to hide the domain name for privacy protection or to avoid exposing it in specific scenarios. 
JumboFrame: specifies giant frame support. once enabled, it supports larger data frames to improve network efficiency. 
NoLBNatL4IPdc: specifies layer 4 IP direct connection without NAT, used for direct forwarding of IP traffic in layer 4 load balancing. 
VpcGwL3Service: specifies the VPC gateway layer-3 Service, which involves the gateway feature of the layer-3 network. 
Ipv62Flag: specifies the Ipv6 expansion Flag for specific feature support. 
Ipv62ExclusiveFlag: specifies the Ipv6 exclusive flag used for exclusive Ipv6 traffic processing. 
BgpPro: specifies BGP Pro support. 
ToaClean: TOA (TCP Option Address) cleanup. clears Address information in TCP options. 

     */
    public String [] getAttributeFlags() {
        return this.AttributeFlags;
    }

    /**
     * Set Attributes of cloud load balancer, input an array of strings to determine whether it is enabled.
DeleteProtect: specifies deletion protection. once enabled, it prevents the cloud load balancer from being accidentally deleted. 
UserInVisible: invisible to users, controls load balancing visibility to users. 
BlockStatus: specifies the blockage status, used to limit certain operations or traffic for cloud load balancer. 
NoLBNat: disables the NAT feature of cloud load balancer for direct forwarding of traffic in specific scenarios. 
BanStatus: specifies the blocking status for suspending the clb service or restricting access. 
ShiftupFlag: specifies the upgrade flag used to identify if the cloud load balancer requires a configuration upgrade or performance improvement. 
Specifies the stopped status. once enabled, the cloud load balancer suspends service. 
NoVpcGw: specifies not to use VPC gateway to bypass the gateway for direct traffic handling. 
SgInTgw: specifies the security group in TGW (Transit Gateway) involving network security policy configuration. 
SharedLimitFlag: specifies the shared limit flag used to control the resource constraints of cloud load balancer. 
WafFlag: specifies the Web application firewall (WAF) flag. enabled to enable WAF protection. 
IsDomainCLB: indicates whether the cloud load balancer is domain name-based for traffic distribution. 
IPv6Snat: IPv6 source address translation (Snat), used for source address processing in IPv6 networks. 
HideDomain. specifies whether to hide the domain name for privacy protection or to avoid exposing it in specific scenarios. 
JumboFrame: specifies giant frame support. once enabled, it supports larger data frames to improve network efficiency. 
NoLBNatL4IPdc: specifies layer 4 IP direct connection without NAT, used for direct forwarding of IP traffic in layer 4 load balancing. 
VpcGwL3Service: specifies the VPC gateway layer-3 Service, which involves the gateway feature of the layer-3 network. 
Ipv62Flag: specifies the Ipv6 expansion Flag for specific feature support. 
Ipv62ExclusiveFlag: specifies the Ipv6 exclusive flag used for exclusive Ipv6 traffic processing. 
BgpPro: specifies BGP Pro support. 
ToaClean: TOA (TCP Option Address) cleanup. clears Address information in TCP options. 

     * @param AttributeFlags Attributes of cloud load balancer, input an array of strings to determine whether it is enabled.
DeleteProtect: specifies deletion protection. once enabled, it prevents the cloud load balancer from being accidentally deleted. 
UserInVisible: invisible to users, controls load balancing visibility to users. 
BlockStatus: specifies the blockage status, used to limit certain operations or traffic for cloud load balancer. 
NoLBNat: disables the NAT feature of cloud load balancer for direct forwarding of traffic in specific scenarios. 
BanStatus: specifies the blocking status for suspending the clb service or restricting access. 
ShiftupFlag: specifies the upgrade flag used to identify if the cloud load balancer requires a configuration upgrade or performance improvement. 
Specifies the stopped status. once enabled, the cloud load balancer suspends service. 
NoVpcGw: specifies not to use VPC gateway to bypass the gateway for direct traffic handling. 
SgInTgw: specifies the security group in TGW (Transit Gateway) involving network security policy configuration. 
SharedLimitFlag: specifies the shared limit flag used to control the resource constraints of cloud load balancer. 
WafFlag: specifies the Web application firewall (WAF) flag. enabled to enable WAF protection. 
IsDomainCLB: indicates whether the cloud load balancer is domain name-based for traffic distribution. 
IPv6Snat: IPv6 source address translation (Snat), used for source address processing in IPv6 networks. 
HideDomain. specifies whether to hide the domain name for privacy protection or to avoid exposing it in specific scenarios. 
JumboFrame: specifies giant frame support. once enabled, it supports larger data frames to improve network efficiency. 
NoLBNatL4IPdc: specifies layer 4 IP direct connection without NAT, used for direct forwarding of IP traffic in layer 4 load balancing. 
VpcGwL3Service: specifies the VPC gateway layer-3 Service, which involves the gateway feature of the layer-3 network. 
Ipv62Flag: specifies the Ipv6 expansion Flag for specific feature support. 
Ipv62ExclusiveFlag: specifies the Ipv6 exclusive flag used for exclusive Ipv6 traffic processing. 
BgpPro: specifies BGP Pro support. 
ToaClean: TOA (TCP Option Address) cleanup. clears Address information in TCP options. 

     */
    public void setAttributeFlags(String [] AttributeFlags) {
        this.AttributeFlags = AttributeFlags;
    }

    /**
     * Get Specifies the domain name of the load balancing instance. 
     * @return LoadBalancerDomain Specifies the domain name of the load balancing instance.
     */
    public String getLoadBalancerDomain() {
        return this.LoadBalancerDomain;
    }

    /**
     * Set Specifies the domain name of the load balancing instance.
     * @param LoadBalancerDomain Specifies the domain name of the load balancing instance.
     */
    public void setLoadBalancerDomain(String LoadBalancerDomain) {
        this.LoadBalancerDomain = LoadBalancerDomain;
    }

    /**
     * Get Specifies the network outbound. 
     * @return Egress Specifies the network outbound.
     */
    public String getEgress() {
        return this.Egress;
    }

    /**
     * Set Specifies the network outbound.
     * @param Egress Specifies the network outbound.
     */
    public void setEgress(String Egress) {
        this.Egress = Egress;
    }

    /**
     * Get Indicates whether the instance type is dedicated. 1: dedicated instance. 0: non-dedicated instance.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Exclusive Indicates whether the instance type is dedicated. 1: dedicated instance. 0: non-dedicated instance.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getExclusive() {
        return this.Exclusive;
    }

    /**
     * Set Indicates whether the instance type is dedicated. 1: dedicated instance. 0: non-dedicated instance.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Exclusive Indicates whether the instance type is dedicated. 1: dedicated instance. 0: non-dedicated instance.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExclusive(Long Exclusive) {
        this.Exclusive = Exclusive;
    }

    /**
     * Get Specifies the number of bound backend services. 
     * @return TargetCount Specifies the number of bound backend services.
     */
    public Long getTargetCount() {
        return this.TargetCount;
    }

    /**
     * Set Specifies the number of bound backend services.
     * @param TargetCount Specifies the number of bound backend services.
     */
    public void setTargetCount(Long TargetCount) {
        this.TargetCount = TargetCount;
    }

    /**
     * Get Specifies the Endpoint id associated with the clb instance. 
     * @return AssociateEndpoint Specifies the Endpoint id associated with the clb instance.
     */
    public String getAssociateEndpoint() {
        return this.AssociateEndpoint;
    }

    /**
     * Set Specifies the Endpoint id associated with the clb instance.
     * @param AssociateEndpoint Specifies the Endpoint id associated with the clb instance.
     */
    public void setAssociateEndpoint(String AssociateEndpoint) {
        this.AssociateEndpoint = AssociateEndpoint;
    }

    public LoadBalancer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoadBalancer(LoadBalancer source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.LoadBalancerName != null) {
            this.LoadBalancerName = new String(source.LoadBalancerName);
        }
        if (source.LoadBalancerType != null) {
            this.LoadBalancerType = new String(source.LoadBalancerType);
        }
        if (source.Forward != null) {
            this.Forward = new Long(source.Forward);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.LoadBalancerVips != null) {
            this.LoadBalancerVips = new String[source.LoadBalancerVips.length];
            for (int i = 0; i < source.LoadBalancerVips.length; i++) {
                this.LoadBalancerVips[i] = new String(source.LoadBalancerVips[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.StatusTime != null) {
            this.StatusTime = new String(source.StatusTime);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.OpenBgp != null) {
            this.OpenBgp = new Long(source.OpenBgp);
        }
        if (source.Snat != null) {
            this.Snat = new Boolean(source.Snat);
        }
        if (source.Isolation != null) {
            this.Isolation = new Long(source.Isolation);
        }
        if (source.Log != null) {
            this.Log = new String(source.Log);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.SecureGroups != null) {
            this.SecureGroups = new String[source.SecureGroups.length];
            for (int i = 0; i < source.SecureGroups.length; i++) {
                this.SecureGroups[i] = new String(source.SecureGroups[i]);
            }
        }
        if (source.TargetRegionInfo != null) {
            this.TargetRegionInfo = new TargetRegionInfo(source.TargetRegionInfo);
        }
        if (source.AnycastZone != null) {
            this.AnycastZone = new String(source.AnycastZone);
        }
        if (source.AddressIPVersion != null) {
            this.AddressIPVersion = new String(source.AddressIPVersion);
        }
        if (source.NumericalVpcId != null) {
            this.NumericalVpcId = new Long(source.NumericalVpcId);
        }
        if (source.VipIsp != null) {
            this.VipIsp = new String(source.VipIsp);
        }
        if (source.MasterZone != null) {
            this.MasterZone = new ZoneInfo(source.MasterZone);
        }
        if (source.BackupZoneSet != null) {
            this.BackupZoneSet = new ZoneInfo[source.BackupZoneSet.length];
            for (int i = 0; i < source.BackupZoneSet.length; i++) {
                this.BackupZoneSet[i] = new ZoneInfo(source.BackupZoneSet[i]);
            }
        }
        if (source.IsolatedTime != null) {
            this.IsolatedTime = new String(source.IsolatedTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.NetworkAttributes != null) {
            this.NetworkAttributes = new InternetAccessible(source.NetworkAttributes);
        }
        if (source.PrepaidAttributes != null) {
            this.PrepaidAttributes = new LBChargePrepaid(source.PrepaidAttributes);
        }
        if (source.LogSetId != null) {
            this.LogSetId = new String(source.LogSetId);
        }
        if (source.LogTopicId != null) {
            this.LogTopicId = new String(source.LogTopicId);
        }
        if (source.AddressIPv6 != null) {
            this.AddressIPv6 = new String(source.AddressIPv6);
        }
        if (source.ExtraInfo != null) {
            this.ExtraInfo = new ExtraInfo(source.ExtraInfo);
        }
        if (source.IsDDos != null) {
            this.IsDDos = new Boolean(source.IsDDos);
        }
        if (source.ConfigId != null) {
            this.ConfigId = new String(source.ConfigId);
        }
        if (source.LoadBalancerPassToTarget != null) {
            this.LoadBalancerPassToTarget = new Boolean(source.LoadBalancerPassToTarget);
        }
        if (source.ExclusiveCluster != null) {
            this.ExclusiveCluster = new ExclusiveCluster(source.ExclusiveCluster);
        }
        if (source.IPv6Mode != null) {
            this.IPv6Mode = new String(source.IPv6Mode);
        }
        if (source.SnatPro != null) {
            this.SnatPro = new Boolean(source.SnatPro);
        }
        if (source.SnatIps != null) {
            this.SnatIps = new SnatIp[source.SnatIps.length];
            for (int i = 0; i < source.SnatIps.length; i++) {
                this.SnatIps[i] = new SnatIp(source.SnatIps[i]);
            }
        }
        if (source.SlaType != null) {
            this.SlaType = new String(source.SlaType);
        }
        if (source.IsBlock != null) {
            this.IsBlock = new Boolean(source.IsBlock);
        }
        if (source.IsBlockTime != null) {
            this.IsBlockTime = new String(source.IsBlockTime);
        }
        if (source.LocalBgp != null) {
            this.LocalBgp = new Boolean(source.LocalBgp);
        }
        if (source.ClusterTag != null) {
            this.ClusterTag = new String(source.ClusterTag);
        }
        if (source.MixIpTarget != null) {
            this.MixIpTarget = new Boolean(source.MixIpTarget);
        }
        if (source.Zones != null) {
            this.Zones = new String[source.Zones.length];
            for (int i = 0; i < source.Zones.length; i++) {
                this.Zones[i] = new String(source.Zones[i]);
            }
        }
        if (source.NfvInfo != null) {
            this.NfvInfo = new String(source.NfvInfo);
        }
        if (source.HealthLogSetId != null) {
            this.HealthLogSetId = new String(source.HealthLogSetId);
        }
        if (source.HealthLogTopicId != null) {
            this.HealthLogTopicId = new String(source.HealthLogTopicId);
        }
        if (source.ClusterIds != null) {
            this.ClusterIds = new String[source.ClusterIds.length];
            for (int i = 0; i < source.ClusterIds.length; i++) {
                this.ClusterIds[i] = new String(source.ClusterIds[i]);
            }
        }
        if (source.AttributeFlags != null) {
            this.AttributeFlags = new String[source.AttributeFlags.length];
            for (int i = 0; i < source.AttributeFlags.length; i++) {
                this.AttributeFlags[i] = new String(source.AttributeFlags[i]);
            }
        }
        if (source.LoadBalancerDomain != null) {
            this.LoadBalancerDomain = new String(source.LoadBalancerDomain);
        }
        if (source.Egress != null) {
            this.Egress = new String(source.Egress);
        }
        if (source.Exclusive != null) {
            this.Exclusive = new Long(source.Exclusive);
        }
        if (source.TargetCount != null) {
            this.TargetCount = new Long(source.TargetCount);
        }
        if (source.AssociateEndpoint != null) {
            this.AssociateEndpoint = new String(source.AssociateEndpoint);
        }
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
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamSimple(map, prefix + "NfvInfo", this.NfvInfo);
        this.setParamSimple(map, prefix + "HealthLogSetId", this.HealthLogSetId);
        this.setParamSimple(map, prefix + "HealthLogTopicId", this.HealthLogTopicId);
        this.setParamArraySimple(map, prefix + "ClusterIds.", this.ClusterIds);
        this.setParamArraySimple(map, prefix + "AttributeFlags.", this.AttributeFlags);
        this.setParamSimple(map, prefix + "LoadBalancerDomain", this.LoadBalancerDomain);
        this.setParamSimple(map, prefix + "Egress", this.Egress);
        this.setParamSimple(map, prefix + "Exclusive", this.Exclusive);
        this.setParamSimple(map, prefix + "TargetCount", this.TargetCount);
        this.setParamSimple(map, prefix + "AssociateEndpoint", this.AssociateEndpoint);

    }
}


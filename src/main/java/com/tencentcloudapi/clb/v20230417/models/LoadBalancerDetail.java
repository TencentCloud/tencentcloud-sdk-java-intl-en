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
package com.tencentcloudapi.clb.v20230417.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoadBalancerDetail extends AbstractModel {

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
    * Network type of the CLB instance:
OPEN: public network attribute, INTERNAL: private network attribute. For a Cloud Load Balancer with private network attribute, you can bind EIP for outbound public network access. For details, see the EIP document.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LoadBalancerType")
    @Expose
    private String LoadBalancerType;

    /**
    * CLB instance state, including
0: creating, 1: normal operation.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * VIP of the CLB instance.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * IPv6 address of the VIP in the CLB instance.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AddressIPv6")
    @Expose
    private String AddressIPv6;

    /**
    * IP version of the Cloud Load Balancer instance, IPv4 | IPv6.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AddressIPVersion")
    @Expose
    private String AddressIPVersion;

    /**
    * IPv6 address type of the Cloud Load Balancer instance: IPv6Nat64 | IPv6FullChain.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IPv6Mode")
    @Expose
    private String IPv6Mode;

    /**
    * Availability Zone of the Cloud Load Balancer instance.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * The ISP to which the IP address of the CLB instance belongs. Value ranges from BGP (multi-line), CMCC (China Mobile), CUCC (China Unicom), CTCC (China Telecom) to INTERNAL (private network).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AddressIsp")
    @Expose
    private String AddressIsp;

    /**
    * ID of the VPC that the CLB instance belongs to.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * The ID of the project to which the CLB instance belongs. 0: Default project.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * CLB instance creation time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Billing type of the CLB instance. Valid values: PREPAID and POSTPAID_BY_HOUR (pay-as-you-go).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * Network properties of the CLB instance.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NetworkAttributes")
    @Expose
    private InternetAccessible NetworkAttributes;

    /**
    * Prepaid billing attributes of the Cloud Load Balancer instance.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PrepaidAttributes")
    @Expose
    private LBChargePrepaid PrepaidAttributes;

    /**
    * Reserved. Generally unnecessary for users to concern.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExtraInfo")
    @Expose
    private ExtraInfo ExtraInfo;

    /**
    * Personalized configuration ID of the Cloud Load Balancer (CLB) dimension. Multiple configurations are separated by commas.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
    * Tag information of the GWLB instance.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * CLB listener ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * Listener protocol.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Listener port.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Forwarding rule ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LocationId")
    @Expose
    private String LocationId;

    /**
    * Domain name of the forwarding rule
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Path of forwarding rules.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Backend target ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TargetId")
    @Expose
    private String TargetId;

    /**
    * Backend target IP address.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TargetAddress")
    @Expose
    private String TargetAddress;

    /**
    * Backend target listening port.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TargetPort")
    @Expose
    private Long TargetPort;

    /**
    * Backend target forwarding weight.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TargetWeight")
    @Expose
    private Long TargetWeight;

    /**
    * 0: Not isolated; 1: Isolated.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Isolation")
    @Expose
    private Long Isolation;

    /**
    * List of security groups bound to Cloud Load Balancer (CLB).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SecurityGroup")
    @Expose
    private String [] SecurityGroup;

    /**
    * Valid values: 1 (enabled), 0 (not enabled). Value ranges from 1 to 0.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LoadBalancerPassToTarget")
    @Expose
    private Long LoadBalancerPassToTarget;

    /**
    * Backend target health status.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TargetHealth")
    @Expose
    private String TargetHealth;

    /**
    * Domain name list of the forwarding rule.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Domains")
    @Expose
    private String Domains;

    /**
    * Multi-availability zone Cloud Load Balancer instance selected backup availability zone
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SlaveZone")
    @Expose
    private String [] SlaveZone;

    /**
    * The availability zone of the private network CLB instance is controlled by the allowlist CLB_Internal_Zone.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * Whether to enable the SNI feature. 1: enable; 0: disable (this parameter is applicable only to HTTPS listeners).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SniSwitch")
    @Expose
    private Long SniSwitch;

    /**
    * Domain name of the CLB instance.
    */
    @SerializedName("LoadBalancerDomain")
    @Expose
    private String LoadBalancerDomain;

    /**
    * Network outbound
    */
    @SerializedName("Egress")
    @Expose
    private String Egress;

    /**
    * Attributes of Cloud Load Balancer
    */
    @SerializedName("AttributeFlags")
    @Expose
    private String [] AttributeFlags;

    /**
    * Specification type information of Cloud Load Balancer instance<ul><li> clb.c1.small: Minimalist specification </li><li>clb.c2.medium: Standard specification </li><li> clb.c3.small: Advanced type 1 specification </li><li> clb.c3.medium: Advanced type 2 specification </li><li> clb.c4.small: Super type 1 specification </li><li> clb.c4.medium: Super type 2 specification </li><li> clb.c4.large: Super type 3 specification </li><li> clb.c4.xlarge: Super type 4 specification </li><li>\"\": Non-LCU-supported instance</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SlaType")
    @Expose
    private String SlaType;

    /**
    * 0: Non-exclusive type instance; 1: Exclusive type instance.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Exclusive")
    @Expose
    private Long Exclusive;

    /**
    * Availability zone forward affinity info
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AvailableZoneAffinityInfo")
    @Expose
    private AvailableZoneAffinityInfo AvailableZoneAffinityInfo;

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
     * Get Network type of the CLB instance:
OPEN: public network attribute, INTERNAL: private network attribute. For a Cloud Load Balancer with private network attribute, you can bind EIP for outbound public network access. For details, see the EIP document.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LoadBalancerType Network type of the CLB instance:
OPEN: public network attribute, INTERNAL: private network attribute. For a Cloud Load Balancer with private network attribute, you can bind EIP for outbound public network access. For details, see the EIP document.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLoadBalancerType() {
        return this.LoadBalancerType;
    }

    /**
     * Set Network type of the CLB instance:
OPEN: public network attribute, INTERNAL: private network attribute. For a Cloud Load Balancer with private network attribute, you can bind EIP for outbound public network access. For details, see the EIP document.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LoadBalancerType Network type of the CLB instance:
OPEN: public network attribute, INTERNAL: private network attribute. For a Cloud Load Balancer with private network attribute, you can bind EIP for outbound public network access. For details, see the EIP document.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLoadBalancerType(String LoadBalancerType) {
        this.LoadBalancerType = LoadBalancerType;
    }

    /**
     * Get CLB instance state, including
0: creating, 1: normal operation.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status CLB instance state, including
0: creating, 1: normal operation.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set CLB instance state, including
0: creating, 1: normal operation.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status CLB instance state, including
0: creating, 1: normal operation.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get VIP of the CLB instance.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Address VIP of the CLB instance.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set VIP of the CLB instance.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Address VIP of the CLB instance.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get IPv6 address of the VIP in the CLB instance.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AddressIPv6 IPv6 address of the VIP in the CLB instance.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAddressIPv6() {
        return this.AddressIPv6;
    }

    /**
     * Set IPv6 address of the VIP in the CLB instance.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AddressIPv6 IPv6 address of the VIP in the CLB instance.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAddressIPv6(String AddressIPv6) {
        this.AddressIPv6 = AddressIPv6;
    }

    /**
     * Get IP version of the Cloud Load Balancer instance, IPv4 | IPv6.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AddressIPVersion IP version of the Cloud Load Balancer instance, IPv4 | IPv6.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAddressIPVersion() {
        return this.AddressIPVersion;
    }

    /**
     * Set IP version of the Cloud Load Balancer instance, IPv4 | IPv6.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AddressIPVersion IP version of the Cloud Load Balancer instance, IPv4 | IPv6.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAddressIPVersion(String AddressIPVersion) {
        this.AddressIPVersion = AddressIPVersion;
    }

    /**
     * Get IPv6 address type of the Cloud Load Balancer instance: IPv6Nat64 | IPv6FullChain.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IPv6Mode IPv6 address type of the Cloud Load Balancer instance: IPv6Nat64 | IPv6FullChain.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIPv6Mode() {
        return this.IPv6Mode;
    }

    /**
     * Set IPv6 address type of the Cloud Load Balancer instance: IPv6Nat64 | IPv6FullChain.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IPv6Mode IPv6 address type of the Cloud Load Balancer instance: IPv6Nat64 | IPv6FullChain.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIPv6Mode(String IPv6Mode) {
        this.IPv6Mode = IPv6Mode;
    }

    /**
     * Get Availability Zone of the Cloud Load Balancer instance.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Zone Availability Zone of the Cloud Load Balancer instance.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Availability Zone of the Cloud Load Balancer instance.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Zone Availability Zone of the Cloud Load Balancer instance.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get The ISP to which the IP address of the CLB instance belongs. Value ranges from BGP (multi-line), CMCC (China Mobile), CUCC (China Unicom), CTCC (China Telecom) to INTERNAL (private network).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AddressIsp The ISP to which the IP address of the CLB instance belongs. Value ranges from BGP (multi-line), CMCC (China Mobile), CUCC (China Unicom), CTCC (China Telecom) to INTERNAL (private network).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAddressIsp() {
        return this.AddressIsp;
    }

    /**
     * Set The ISP to which the IP address of the CLB instance belongs. Value ranges from BGP (multi-line), CMCC (China Mobile), CUCC (China Unicom), CTCC (China Telecom) to INTERNAL (private network).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AddressIsp The ISP to which the IP address of the CLB instance belongs. Value ranges from BGP (multi-line), CMCC (China Mobile), CUCC (China Unicom), CTCC (China Telecom) to INTERNAL (private network).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAddressIsp(String AddressIsp) {
        this.AddressIsp = AddressIsp;
    }

    /**
     * Get ID of the VPC that the CLB instance belongs to.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VpcId ID of the VPC that the CLB instance belongs to.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set ID of the VPC that the CLB instance belongs to.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VpcId ID of the VPC that the CLB instance belongs to.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get The ID of the project to which the CLB instance belongs. 0: Default project.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProjectId The ID of the project to which the CLB instance belongs. 0: Default project.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set The ID of the project to which the CLB instance belongs. 0: Default project.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProjectId The ID of the project to which the CLB instance belongs. 0: Default project.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get CLB instance creation time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime CLB instance creation time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set CLB instance creation time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime CLB instance creation time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Billing type of the CLB instance. Valid values: PREPAID and POSTPAID_BY_HOUR (pay-as-you-go).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ChargeType Billing type of the CLB instance. Valid values: PREPAID and POSTPAID_BY_HOUR (pay-as-you-go).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set Billing type of the CLB instance. Valid values: PREPAID and POSTPAID_BY_HOUR (pay-as-you-go).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ChargeType Billing type of the CLB instance. Valid values: PREPAID and POSTPAID_BY_HOUR (pay-as-you-go).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get Network properties of the CLB instance.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NetworkAttributes Network properties of the CLB instance.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public InternetAccessible getNetworkAttributes() {
        return this.NetworkAttributes;
    }

    /**
     * Set Network properties of the CLB instance.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NetworkAttributes Network properties of the CLB instance.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNetworkAttributes(InternetAccessible NetworkAttributes) {
        this.NetworkAttributes = NetworkAttributes;
    }

    /**
     * Get Prepaid billing attributes of the Cloud Load Balancer instance.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PrepaidAttributes Prepaid billing attributes of the Cloud Load Balancer instance.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public LBChargePrepaid getPrepaidAttributes() {
        return this.PrepaidAttributes;
    }

    /**
     * Set Prepaid billing attributes of the Cloud Load Balancer instance.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PrepaidAttributes Prepaid billing attributes of the Cloud Load Balancer instance.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPrepaidAttributes(LBChargePrepaid PrepaidAttributes) {
        this.PrepaidAttributes = PrepaidAttributes;
    }

    /**
     * Get Reserved. Generally unnecessary for users to concern.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExtraInfo Reserved. Generally unnecessary for users to concern.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ExtraInfo getExtraInfo() {
        return this.ExtraInfo;
    }

    /**
     * Set Reserved. Generally unnecessary for users to concern.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExtraInfo Reserved. Generally unnecessary for users to concern.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExtraInfo(ExtraInfo ExtraInfo) {
        this.ExtraInfo = ExtraInfo;
    }

    /**
     * Get Personalized configuration ID of the Cloud Load Balancer (CLB) dimension. Multiple configurations are separated by commas.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ConfigId Personalized configuration ID of the Cloud Load Balancer (CLB) dimension. Multiple configurations are separated by commas.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set Personalized configuration ID of the Cloud Load Balancer (CLB) dimension. Multiple configurations are separated by commas.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ConfigId Personalized configuration ID of the Cloud Load Balancer (CLB) dimension. Multiple configurations are separated by commas.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
    }

    /**
     * Get Tag information of the GWLB instance.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tags Tag information of the GWLB instance.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag information of the GWLB instance.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tags Tag information of the GWLB instance.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get CLB listener ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ListenerId CLB listener ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set CLB listener ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ListenerId CLB listener ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get Listener protocol.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Protocol Listener protocol.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Listener protocol.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Protocol Listener protocol.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Listener port.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Port Listener port.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Listener port.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Port Listener port.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Forwarding rule ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LocationId Forwarding rule ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLocationId() {
        return this.LocationId;
    }

    /**
     * Set Forwarding rule ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LocationId Forwarding rule ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLocationId(String LocationId) {
        this.LocationId = LocationId;
    }

    /**
     * Get Domain name of the forwarding rule
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Domain Domain name of the forwarding rule
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name of the forwarding rule
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Domain Domain name of the forwarding rule
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Path of forwarding rules.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Url Path of forwarding rules.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Path of forwarding rules.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Url Path of forwarding rules.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Backend target ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TargetId Backend target ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTargetId() {
        return this.TargetId;
    }

    /**
     * Set Backend target ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TargetId Backend target ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTargetId(String TargetId) {
        this.TargetId = TargetId;
    }

    /**
     * Get Backend target IP address.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TargetAddress Backend target IP address.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTargetAddress() {
        return this.TargetAddress;
    }

    /**
     * Set Backend target IP address.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TargetAddress Backend target IP address.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTargetAddress(String TargetAddress) {
        this.TargetAddress = TargetAddress;
    }

    /**
     * Get Backend target listening port.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TargetPort Backend target listening port.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTargetPort() {
        return this.TargetPort;
    }

    /**
     * Set Backend target listening port.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TargetPort Backend target listening port.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTargetPort(Long TargetPort) {
        this.TargetPort = TargetPort;
    }

    /**
     * Get Backend target forwarding weight.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TargetWeight Backend target forwarding weight.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTargetWeight() {
        return this.TargetWeight;
    }

    /**
     * Set Backend target forwarding weight.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TargetWeight Backend target forwarding weight.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTargetWeight(Long TargetWeight) {
        this.TargetWeight = TargetWeight;
    }

    /**
     * Get 0: Not isolated; 1: Isolated.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Isolation 0: Not isolated; 1: Isolated.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsolation() {
        return this.Isolation;
    }

    /**
     * Set 0: Not isolated; 1: Isolated.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Isolation 0: Not isolated; 1: Isolated.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsolation(Long Isolation) {
        this.Isolation = Isolation;
    }

    /**
     * Get List of security groups bound to Cloud Load Balancer (CLB).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SecurityGroup List of security groups bound to Cloud Load Balancer (CLB).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getSecurityGroup() {
        return this.SecurityGroup;
    }

    /**
     * Set List of security groups bound to Cloud Load Balancer (CLB).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SecurityGroup List of security groups bound to Cloud Load Balancer (CLB).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSecurityGroup(String [] SecurityGroup) {
        this.SecurityGroup = SecurityGroup;
    }

    /**
     * Get Valid values: 1 (enabled), 0 (not enabled). Value ranges from 1 to 0.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LoadBalancerPassToTarget Valid values: 1 (enabled), 0 (not enabled). Value ranges from 1 to 0.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getLoadBalancerPassToTarget() {
        return this.LoadBalancerPassToTarget;
    }

    /**
     * Set Valid values: 1 (enabled), 0 (not enabled). Value ranges from 1 to 0.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LoadBalancerPassToTarget Valid values: 1 (enabled), 0 (not enabled). Value ranges from 1 to 0.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLoadBalancerPassToTarget(Long LoadBalancerPassToTarget) {
        this.LoadBalancerPassToTarget = LoadBalancerPassToTarget;
    }

    /**
     * Get Backend target health status.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TargetHealth Backend target health status.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTargetHealth() {
        return this.TargetHealth;
    }

    /**
     * Set Backend target health status.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TargetHealth Backend target health status.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTargetHealth(String TargetHealth) {
        this.TargetHealth = TargetHealth;
    }

    /**
     * Get Domain name list of the forwarding rule.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Domains Domain name list of the forwarding rule.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDomains() {
        return this.Domains;
    }

    /**
     * Set Domain name list of the forwarding rule.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Domains Domain name list of the forwarding rule.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDomains(String Domains) {
        this.Domains = Domains;
    }

    /**
     * Get Multi-availability zone Cloud Load Balancer instance selected backup availability zone
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SlaveZone Multi-availability zone Cloud Load Balancer instance selected backup availability zone
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getSlaveZone() {
        return this.SlaveZone;
    }

    /**
     * Set Multi-availability zone Cloud Load Balancer instance selected backup availability zone
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SlaveZone Multi-availability zone Cloud Load Balancer instance selected backup availability zone
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSlaveZone(String [] SlaveZone) {
        this.SlaveZone = SlaveZone;
    }

    /**
     * Get The availability zone of the private network CLB instance is controlled by the allowlist CLB_Internal_Zone.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Zones The availability zone of the private network CLB instance is controlled by the allowlist CLB_Internal_Zone.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set The availability zone of the private network CLB instance is controlled by the allowlist CLB_Internal_Zone.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Zones The availability zone of the private network CLB instance is controlled by the allowlist CLB_Internal_Zone.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get Whether to enable the SNI feature. 1: enable; 0: disable (this parameter is applicable only to HTTPS listeners).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SniSwitch Whether to enable the SNI feature. 1: enable; 0: disable (this parameter is applicable only to HTTPS listeners).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSniSwitch() {
        return this.SniSwitch;
    }

    /**
     * Set Whether to enable the SNI feature. 1: enable; 0: disable (this parameter is applicable only to HTTPS listeners).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SniSwitch Whether to enable the SNI feature. 1: enable; 0: disable (this parameter is applicable only to HTTPS listeners).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSniSwitch(Long SniSwitch) {
        this.SniSwitch = SniSwitch;
    }

    /**
     * Get Domain name of the CLB instance. 
     * @return LoadBalancerDomain Domain name of the CLB instance.
     */
    public String getLoadBalancerDomain() {
        return this.LoadBalancerDomain;
    }

    /**
     * Set Domain name of the CLB instance.
     * @param LoadBalancerDomain Domain name of the CLB instance.
     */
    public void setLoadBalancerDomain(String LoadBalancerDomain) {
        this.LoadBalancerDomain = LoadBalancerDomain;
    }

    /**
     * Get Network outbound 
     * @return Egress Network outbound
     */
    public String getEgress() {
        return this.Egress;
    }

    /**
     * Set Network outbound
     * @param Egress Network outbound
     */
    public void setEgress(String Egress) {
        this.Egress = Egress;
    }

    /**
     * Get Attributes of Cloud Load Balancer 
     * @return AttributeFlags Attributes of Cloud Load Balancer
     */
    public String [] getAttributeFlags() {
        return this.AttributeFlags;
    }

    /**
     * Set Attributes of Cloud Load Balancer
     * @param AttributeFlags Attributes of Cloud Load Balancer
     */
    public void setAttributeFlags(String [] AttributeFlags) {
        this.AttributeFlags = AttributeFlags;
    }

    /**
     * Get Specification type information of Cloud Load Balancer instance<ul><li> clb.c1.small: Minimalist specification </li><li>clb.c2.medium: Standard specification </li><li> clb.c3.small: Advanced type 1 specification </li><li> clb.c3.medium: Advanced type 2 specification </li><li> clb.c4.small: Super type 1 specification </li><li> clb.c4.medium: Super type 2 specification </li><li> clb.c4.large: Super type 3 specification </li><li> clb.c4.xlarge: Super type 4 specification </li><li>\"\": Non-LCU-supported instance</li></ul>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SlaType Specification type information of Cloud Load Balancer instance<ul><li> clb.c1.small: Minimalist specification </li><li>clb.c2.medium: Standard specification </li><li> clb.c3.small: Advanced type 1 specification </li><li> clb.c3.medium: Advanced type 2 specification </li><li> clb.c4.small: Super type 1 specification </li><li> clb.c4.medium: Super type 2 specification </li><li> clb.c4.large: Super type 3 specification </li><li> clb.c4.xlarge: Super type 4 specification </li><li>\"\": Non-LCU-supported instance</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSlaType() {
        return this.SlaType;
    }

    /**
     * Set Specification type information of Cloud Load Balancer instance<ul><li> clb.c1.small: Minimalist specification </li><li>clb.c2.medium: Standard specification </li><li> clb.c3.small: Advanced type 1 specification </li><li> clb.c3.medium: Advanced type 2 specification </li><li> clb.c4.small: Super type 1 specification </li><li> clb.c4.medium: Super type 2 specification </li><li> clb.c4.large: Super type 3 specification </li><li> clb.c4.xlarge: Super type 4 specification </li><li>\"\": Non-LCU-supported instance</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SlaType Specification type information of Cloud Load Balancer instance<ul><li> clb.c1.small: Minimalist specification </li><li>clb.c2.medium: Standard specification </li><li> clb.c3.small: Advanced type 1 specification </li><li> clb.c3.medium: Advanced type 2 specification </li><li> clb.c4.small: Super type 1 specification </li><li> clb.c4.medium: Super type 2 specification </li><li> clb.c4.large: Super type 3 specification </li><li> clb.c4.xlarge: Super type 4 specification </li><li>\"\": Non-LCU-supported instance</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSlaType(String SlaType) {
        this.SlaType = SlaType;
    }

    /**
     * Get 0: Non-exclusive type instance; 1: Exclusive type instance.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Exclusive 0: Non-exclusive type instance; 1: Exclusive type instance.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getExclusive() {
        return this.Exclusive;
    }

    /**
     * Set 0: Non-exclusive type instance; 1: Exclusive type instance.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Exclusive 0: Non-exclusive type instance; 1: Exclusive type instance.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExclusive(Long Exclusive) {
        this.Exclusive = Exclusive;
    }

    /**
     * Get Availability zone forward affinity info
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AvailableZoneAffinityInfo Availability zone forward affinity info
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AvailableZoneAffinityInfo getAvailableZoneAffinityInfo() {
        return this.AvailableZoneAffinityInfo;
    }

    /**
     * Set Availability zone forward affinity info
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AvailableZoneAffinityInfo Availability zone forward affinity info
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAvailableZoneAffinityInfo(AvailableZoneAffinityInfo AvailableZoneAffinityInfo) {
        this.AvailableZoneAffinityInfo = AvailableZoneAffinityInfo;
    }

    public LoadBalancerDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoadBalancerDetail(LoadBalancerDetail source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.LoadBalancerName != null) {
            this.LoadBalancerName = new String(source.LoadBalancerName);
        }
        if (source.LoadBalancerType != null) {
            this.LoadBalancerType = new String(source.LoadBalancerType);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.AddressIPv6 != null) {
            this.AddressIPv6 = new String(source.AddressIPv6);
        }
        if (source.AddressIPVersion != null) {
            this.AddressIPVersion = new String(source.AddressIPVersion);
        }
        if (source.IPv6Mode != null) {
            this.IPv6Mode = new String(source.IPv6Mode);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.AddressIsp != null) {
            this.AddressIsp = new String(source.AddressIsp);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
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
        if (source.ExtraInfo != null) {
            this.ExtraInfo = new ExtraInfo(source.ExtraInfo);
        }
        if (source.ConfigId != null) {
            this.ConfigId = new String(source.ConfigId);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.LocationId != null) {
            this.LocationId = new String(source.LocationId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.TargetId != null) {
            this.TargetId = new String(source.TargetId);
        }
        if (source.TargetAddress != null) {
            this.TargetAddress = new String(source.TargetAddress);
        }
        if (source.TargetPort != null) {
            this.TargetPort = new Long(source.TargetPort);
        }
        if (source.TargetWeight != null) {
            this.TargetWeight = new Long(source.TargetWeight);
        }
        if (source.Isolation != null) {
            this.Isolation = new Long(source.Isolation);
        }
        if (source.SecurityGroup != null) {
            this.SecurityGroup = new String[source.SecurityGroup.length];
            for (int i = 0; i < source.SecurityGroup.length; i++) {
                this.SecurityGroup[i] = new String(source.SecurityGroup[i]);
            }
        }
        if (source.LoadBalancerPassToTarget != null) {
            this.LoadBalancerPassToTarget = new Long(source.LoadBalancerPassToTarget);
        }
        if (source.TargetHealth != null) {
            this.TargetHealth = new String(source.TargetHealth);
        }
        if (source.Domains != null) {
            this.Domains = new String(source.Domains);
        }
        if (source.SlaveZone != null) {
            this.SlaveZone = new String[source.SlaveZone.length];
            for (int i = 0; i < source.SlaveZone.length; i++) {
                this.SlaveZone[i] = new String(source.SlaveZone[i]);
            }
        }
        if (source.Zones != null) {
            this.Zones = new String[source.Zones.length];
            for (int i = 0; i < source.Zones.length; i++) {
                this.Zones[i] = new String(source.Zones[i]);
            }
        }
        if (source.SniSwitch != null) {
            this.SniSwitch = new Long(source.SniSwitch);
        }
        if (source.LoadBalancerDomain != null) {
            this.LoadBalancerDomain = new String(source.LoadBalancerDomain);
        }
        if (source.Egress != null) {
            this.Egress = new String(source.Egress);
        }
        if (source.AttributeFlags != null) {
            this.AttributeFlags = new String[source.AttributeFlags.length];
            for (int i = 0; i < source.AttributeFlags.length; i++) {
                this.AttributeFlags[i] = new String(source.AttributeFlags[i]);
            }
        }
        if (source.SlaType != null) {
            this.SlaType = new String(source.SlaType);
        }
        if (source.Exclusive != null) {
            this.Exclusive = new Long(source.Exclusive);
        }
        if (source.AvailableZoneAffinityInfo != null) {
            this.AvailableZoneAffinityInfo = new AvailableZoneAffinityInfo(source.AvailableZoneAffinityInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "LoadBalancerName", this.LoadBalancerName);
        this.setParamSimple(map, prefix + "LoadBalancerType", this.LoadBalancerType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "AddressIPv6", this.AddressIPv6);
        this.setParamSimple(map, prefix + "AddressIPVersion", this.AddressIPVersion);
        this.setParamSimple(map, prefix + "IPv6Mode", this.IPv6Mode);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "AddressIsp", this.AddressIsp);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamObj(map, prefix + "NetworkAttributes.", this.NetworkAttributes);
        this.setParamObj(map, prefix + "PrepaidAttributes.", this.PrepaidAttributes);
        this.setParamObj(map, prefix + "ExtraInfo.", this.ExtraInfo);
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "LocationId", this.LocationId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "TargetId", this.TargetId);
        this.setParamSimple(map, prefix + "TargetAddress", this.TargetAddress);
        this.setParamSimple(map, prefix + "TargetPort", this.TargetPort);
        this.setParamSimple(map, prefix + "TargetWeight", this.TargetWeight);
        this.setParamSimple(map, prefix + "Isolation", this.Isolation);
        this.setParamArraySimple(map, prefix + "SecurityGroup.", this.SecurityGroup);
        this.setParamSimple(map, prefix + "LoadBalancerPassToTarget", this.LoadBalancerPassToTarget);
        this.setParamSimple(map, prefix + "TargetHealth", this.TargetHealth);
        this.setParamSimple(map, prefix + "Domains", this.Domains);
        this.setParamArraySimple(map, prefix + "SlaveZone.", this.SlaveZone);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamSimple(map, prefix + "SniSwitch", this.SniSwitch);
        this.setParamSimple(map, prefix + "LoadBalancerDomain", this.LoadBalancerDomain);
        this.setParamSimple(map, prefix + "Egress", this.Egress);
        this.setParamArraySimple(map, prefix + "AttributeFlags.", this.AttributeFlags);
        this.setParamSimple(map, prefix + "SlaType", this.SlaType);
        this.setParamSimple(map, prefix + "Exclusive", this.Exclusive);
        this.setParamObj(map, prefix + "AvailableZoneAffinityInfo.", this.AvailableZoneAffinityInfo);

    }
}


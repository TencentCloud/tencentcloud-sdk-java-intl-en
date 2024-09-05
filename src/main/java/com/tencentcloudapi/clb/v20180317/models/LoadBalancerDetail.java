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
    * CLB instance network type:
Public: public network; Private: private network.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LoadBalancerType")
    @Expose
    private String LoadBalancerType;

    /**
    * CLB instance status, including:
0: creating; 1: running.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * CLB instance VIP.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * IPv6 VIP address of the CLB instance.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AddressIPv6")
    @Expose
    private String AddressIPv6;

    /**
    * IP version of the CLB instance. Valid values: IPv4, IPv6.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AddressIPVersion")
    @Expose
    private String AddressIPVersion;

    /**
    * IPv6 address type of the CLB instance. Valid values: IPv6Nat64, IPv6FullChain.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IPv6Mode")
    @Expose
    private String IPv6Mode;

    /**
    * Availability zone where the CLB instance resides.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * ISP for the IP address of the CLB instance. Valid values: BGP (multi-line), CMCC (China Mobile), CUCC (China Unicom), CTCC (China Telecom), INTERNAL (private network).Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AddressIsp")
    @Expose
    private String AddressIsp;

    /**
    * ID of the VPC instance to which the CLB instance belongs.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * ID of the project to which the CLB instance belongs. 0: default project.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * CLB instance creation time.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Billing type of a CLB instance. Valid values: PREPAID (prepaid), POSTPAID_BY_HOUR (pay-as-you-go).Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * CLB instance network attribute.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NetworkAttributes")
    @Expose
    private InternetAccessible NetworkAttributes;

    /**
    * Pay-as-you-go attribute of the CLB instance.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PrepaidAttributes")
    @Expose
    private LBChargePrepaid PrepaidAttributes;

    /**
    * Reserved field, which can be ignored generally.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExtraInfo")
    @Expose
    private ExtraInfo ExtraInfo;

    /**
    * Custom configuration IDs of CLB instances. Multiple IDs must be separated by commas (,).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
    * CLB instance tag information.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * CLB listener ID.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * Listener protocol.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Listener port.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Forwarding rule ID.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LocationId")
    @Expose
    private String LocationId;

    /**
    * Domain name of the forwarding rule.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Forwarding rule path.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * ID of target real servers.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TargetId")
    @Expose
    private String TargetId;

    /**
    * Address of target real servers.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TargetAddress")
    @Expose
    private String TargetAddress;

    /**
    * Listening port of target real servers.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TargetPort")
    @Expose
    private Long TargetPort;

    /**
    * Forwarding weight of target real servers.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TargetWeight")
    @Expose
    private Long TargetWeight;

    /**
    * 0: not isolated; 1: isolated.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Isolation")
    @Expose
    private Long Isolation;

    /**
    * List of the security groups bound to the CLB instance.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("SecurityGroup")
    @Expose
    private String [] SecurityGroup;

    /**
    * Whether to enable moving up CLB security groups. Valid values: 1 (enabled), 0 (not enabled).Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LoadBalancerPassToTarget")
    @Expose
    private Long LoadBalancerPassToTarget;

    /**
    * Health status of the target real server.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("TargetHealth")
    @Expose
    private String TargetHealth;

    /**
    * List o domain names associated with the forwarding rule
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Domains")
    @Expose
    private String Domains;

    /**
    * The secondary zone of multi-AZ CLB instance
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("SlaveZone")
    @Expose
    private String [] SlaveZone;

    /**
    * The AZ of private CLB instance. This is only available for beta users.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * Whether to enable SNI. `1`: Enable; `0`: Do not enable. This parameter is only meaningful for HTTPS listeners.
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("SniSwitch")
    @Expose
    private Long SniSwitch;

    /**
    * Domain name of the CLB instance.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LoadBalancerDomain")
    @Expose
    private String LoadBalancerDomain;

    /**
    * Network egress
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Egress")
    @Expose
    private String Egress;

    /**
    * 
    */
    @SerializedName("AttributeFlags")
    @Expose
    private String [] AttributeFlags;

    /**
    * 
    */
    @SerializedName("SlaType")
    @Expose
    private String SlaType;

    /**
    * 
    */
    @SerializedName("Exclusive")
    @Expose
    private Long Exclusive;

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
Public: public network; Private: private network.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return LoadBalancerType CLB instance network type:
Public: public network; Private: private network.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getLoadBalancerType() {
        return this.LoadBalancerType;
    }

    /**
     * Set CLB instance network type:
Public: public network; Private: private network.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param LoadBalancerType CLB instance network type:
Public: public network; Private: private network.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLoadBalancerType(String LoadBalancerType) {
        this.LoadBalancerType = LoadBalancerType;
    }

    /**
     * Get CLB instance status, including:
0: creating; 1: running.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Status CLB instance status, including:
0: creating; 1: running.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set CLB instance status, including:
0: creating; 1: running.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Status CLB instance status, including:
0: creating; 1: running.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get CLB instance VIP.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Address CLB instance VIP.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set CLB instance VIP.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Address CLB instance VIP.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get IPv6 VIP address of the CLB instance.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AddressIPv6 IPv6 VIP address of the CLB instance.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getAddressIPv6() {
        return this.AddressIPv6;
    }

    /**
     * Set IPv6 VIP address of the CLB instance.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AddressIPv6 IPv6 VIP address of the CLB instance.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAddressIPv6(String AddressIPv6) {
        this.AddressIPv6 = AddressIPv6;
    }

    /**
     * Get IP version of the CLB instance. Valid values: IPv4, IPv6.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AddressIPVersion IP version of the CLB instance. Valid values: IPv4, IPv6.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getAddressIPVersion() {
        return this.AddressIPVersion;
    }

    /**
     * Set IP version of the CLB instance. Valid values: IPv4, IPv6.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AddressIPVersion IP version of the CLB instance. Valid values: IPv4, IPv6.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAddressIPVersion(String AddressIPVersion) {
        this.AddressIPVersion = AddressIPVersion;
    }

    /**
     * Get IPv6 address type of the CLB instance. Valid values: IPv6Nat64, IPv6FullChain.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IPv6Mode IPv6 address type of the CLB instance. Valid values: IPv6Nat64, IPv6FullChain.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getIPv6Mode() {
        return this.IPv6Mode;
    }

    /**
     * Set IPv6 address type of the CLB instance. Valid values: IPv6Nat64, IPv6FullChain.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IPv6Mode IPv6 address type of the CLB instance. Valid values: IPv6Nat64, IPv6FullChain.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIPv6Mode(String IPv6Mode) {
        this.IPv6Mode = IPv6Mode;
    }

    /**
     * Get Availability zone where the CLB instance resides.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Zone Availability zone where the CLB instance resides.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Availability zone where the CLB instance resides.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Zone Availability zone where the CLB instance resides.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get ISP for the IP address of the CLB instance. Valid values: BGP (multi-line), CMCC (China Mobile), CUCC (China Unicom), CTCC (China Telecom), INTERNAL (private network).Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AddressIsp ISP for the IP address of the CLB instance. Valid values: BGP (multi-line), CMCC (China Mobile), CUCC (China Unicom), CTCC (China Telecom), INTERNAL (private network).Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAddressIsp() {
        return this.AddressIsp;
    }

    /**
     * Set ISP for the IP address of the CLB instance. Valid values: BGP (multi-line), CMCC (China Mobile), CUCC (China Unicom), CTCC (China Telecom), INTERNAL (private network).Note: This field may return null, indicating that no valid values can be obtained.
     * @param AddressIsp ISP for the IP address of the CLB instance. Valid values: BGP (multi-line), CMCC (China Mobile), CUCC (China Unicom), CTCC (China Telecom), INTERNAL (private network).Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAddressIsp(String AddressIsp) {
        this.AddressIsp = AddressIsp;
    }

    /**
     * Get ID of the VPC instance to which the CLB instance belongs.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return VpcId ID of the VPC instance to which the CLB instance belongs.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set ID of the VPC instance to which the CLB instance belongs.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param VpcId ID of the VPC instance to which the CLB instance belongs.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get ID of the project to which the CLB instance belongs. 0: default project.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ProjectId ID of the project to which the CLB instance belongs. 0: default project.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set ID of the project to which the CLB instance belongs. 0: default project.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ProjectId ID of the project to which the CLB instance belongs. 0: default project.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get CLB instance creation time.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime CLB instance creation time.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set CLB instance creation time.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CreateTime CLB instance creation time.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Billing type of a CLB instance. Valid values: PREPAID (prepaid), POSTPAID_BY_HOUR (pay-as-you-go).Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ChargeType Billing type of a CLB instance. Valid values: PREPAID (prepaid), POSTPAID_BY_HOUR (pay-as-you-go).Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set Billing type of a CLB instance. Valid values: PREPAID (prepaid), POSTPAID_BY_HOUR (pay-as-you-go).Note: This field may return null, indicating that no valid values can be obtained.
     * @param ChargeType Billing type of a CLB instance. Valid values: PREPAID (prepaid), POSTPAID_BY_HOUR (pay-as-you-go).Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get CLB instance network attribute.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return NetworkAttributes CLB instance network attribute.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public InternetAccessible getNetworkAttributes() {
        return this.NetworkAttributes;
    }

    /**
     * Set CLB instance network attribute.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param NetworkAttributes CLB instance network attribute.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setNetworkAttributes(InternetAccessible NetworkAttributes) {
        this.NetworkAttributes = NetworkAttributes;
    }

    /**
     * Get Pay-as-you-go attribute of the CLB instance.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PrepaidAttributes Pay-as-you-go attribute of the CLB instance.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public LBChargePrepaid getPrepaidAttributes() {
        return this.PrepaidAttributes;
    }

    /**
     * Set Pay-as-you-go attribute of the CLB instance.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PrepaidAttributes Pay-as-you-go attribute of the CLB instance.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPrepaidAttributes(LBChargePrepaid PrepaidAttributes) {
        this.PrepaidAttributes = PrepaidAttributes;
    }

    /**
     * Get Reserved field, which can be ignored generally.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ExtraInfo Reserved field, which can be ignored generally.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ExtraInfo getExtraInfo() {
        return this.ExtraInfo;
    }

    /**
     * Set Reserved field, which can be ignored generally.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ExtraInfo Reserved field, which can be ignored generally.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setExtraInfo(ExtraInfo ExtraInfo) {
        this.ExtraInfo = ExtraInfo;
    }

    /**
     * Get Custom configuration IDs of CLB instances. Multiple IDs must be separated by commas (,).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ConfigId Custom configuration IDs of CLB instances. Multiple IDs must be separated by commas (,).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set Custom configuration IDs of CLB instances. Multiple IDs must be separated by commas (,).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ConfigId Custom configuration IDs of CLB instances. Multiple IDs must be separated by commas (,).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
    }

    /**
     * Get CLB instance tag information.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Tags CLB instance tag information.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set CLB instance tag information.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Tags CLB instance tag information.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get CLB listener ID.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ListenerId CLB listener ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set CLB listener ID.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ListenerId CLB listener ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get Listener protocol.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Protocol Listener protocol.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Listener protocol.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Protocol Listener protocol.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Listener port.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Port Listener port.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Listener port.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Port Listener port.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Forwarding rule ID.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return LocationId Forwarding rule ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getLocationId() {
        return this.LocationId;
    }

    /**
     * Set Forwarding rule ID.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param LocationId Forwarding rule ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLocationId(String LocationId) {
        this.LocationId = LocationId;
    }

    /**
     * Get Domain name of the forwarding rule.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Domain Domain name of the forwarding rule.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name of the forwarding rule.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Domain Domain name of the forwarding rule.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Forwarding rule path.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Url Forwarding rule path.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Forwarding rule path.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Url Forwarding rule path.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get ID of target real servers.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TargetId ID of target real servers.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getTargetId() {
        return this.TargetId;
    }

    /**
     * Set ID of target real servers.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TargetId ID of target real servers.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTargetId(String TargetId) {
        this.TargetId = TargetId;
    }

    /**
     * Get Address of target real servers.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TargetAddress Address of target real servers.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getTargetAddress() {
        return this.TargetAddress;
    }

    /**
     * Set Address of target real servers.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TargetAddress Address of target real servers.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTargetAddress(String TargetAddress) {
        this.TargetAddress = TargetAddress;
    }

    /**
     * Get Listening port of target real servers.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TargetPort Listening port of target real servers.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getTargetPort() {
        return this.TargetPort;
    }

    /**
     * Set Listening port of target real servers.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TargetPort Listening port of target real servers.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTargetPort(Long TargetPort) {
        this.TargetPort = TargetPort;
    }

    /**
     * Get Forwarding weight of target real servers.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TargetWeight Forwarding weight of target real servers.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getTargetWeight() {
        return this.TargetWeight;
    }

    /**
     * Set Forwarding weight of target real servers.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TargetWeight Forwarding weight of target real servers.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTargetWeight(Long TargetWeight) {
        this.TargetWeight = TargetWeight;
    }

    /**
     * Get 0: not isolated; 1: isolated.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Isolation 0: not isolated; 1: isolated.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsolation() {
        return this.Isolation;
    }

    /**
     * Set 0: not isolated; 1: isolated.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Isolation 0: not isolated; 1: isolated.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIsolation(Long Isolation) {
        this.Isolation = Isolation;
    }

    /**
     * Get List of the security groups bound to the CLB instance.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return SecurityGroup List of the security groups bound to the CLB instance.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String [] getSecurityGroup() {
        return this.SecurityGroup;
    }

    /**
     * Set List of the security groups bound to the CLB instance.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param SecurityGroup List of the security groups bound to the CLB instance.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setSecurityGroup(String [] SecurityGroup) {
        this.SecurityGroup = SecurityGroup;
    }

    /**
     * Get Whether to enable moving up CLB security groups. Valid values: 1 (enabled), 0 (not enabled).Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LoadBalancerPassToTarget Whether to enable moving up CLB security groups. Valid values: 1 (enabled), 0 (not enabled).Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getLoadBalancerPassToTarget() {
        return this.LoadBalancerPassToTarget;
    }

    /**
     * Set Whether to enable moving up CLB security groups. Valid values: 1 (enabled), 0 (not enabled).Note: This field may return null, indicating that no valid values can be obtained.
     * @param LoadBalancerPassToTarget Whether to enable moving up CLB security groups. Valid values: 1 (enabled), 0 (not enabled).Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLoadBalancerPassToTarget(Long LoadBalancerPassToTarget) {
        this.LoadBalancerPassToTarget = LoadBalancerPassToTarget;
    }

    /**
     * Get Health status of the target real server.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return TargetHealth Health status of the target real server.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getTargetHealth() {
        return this.TargetHealth;
    }

    /**
     * Set Health status of the target real server.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param TargetHealth Health status of the target real server.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTargetHealth(String TargetHealth) {
        this.TargetHealth = TargetHealth;
    }

    /**
     * Get List o domain names associated with the forwarding rule
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Domains List o domain names associated with the forwarding rule
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getDomains() {
        return this.Domains;
    }

    /**
     * Set List o domain names associated with the forwarding rule
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Domains List o domain names associated with the forwarding rule
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDomains(String Domains) {
        this.Domains = Domains;
    }

    /**
     * Get The secondary zone of multi-AZ CLB instance
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return SlaveZone The secondary zone of multi-AZ CLB instance
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String [] getSlaveZone() {
        return this.SlaveZone;
    }

    /**
     * Set The secondary zone of multi-AZ CLB instance
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param SlaveZone The secondary zone of multi-AZ CLB instance
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setSlaveZone(String [] SlaveZone) {
        this.SlaveZone = SlaveZone;
    }

    /**
     * Get The AZ of private CLB instance. This is only available for beta users.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Zones The AZ of private CLB instance. This is only available for beta users.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set The AZ of private CLB instance. This is only available for beta users.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Zones The AZ of private CLB instance. This is only available for beta users.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get Whether to enable SNI. `1`: Enable; `0`: Do not enable. This parameter is only meaningful for HTTPS listeners.
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return SniSwitch Whether to enable SNI. `1`: Enable; `0`: Do not enable. This parameter is only meaningful for HTTPS listeners.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getSniSwitch() {
        return this.SniSwitch;
    }

    /**
     * Set Whether to enable SNI. `1`: Enable; `0`: Do not enable. This parameter is only meaningful for HTTPS listeners.
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param SniSwitch Whether to enable SNI. `1`: Enable; `0`: Do not enable. This parameter is only meaningful for HTTPS listeners.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setSniSwitch(Long SniSwitch) {
        this.SniSwitch = SniSwitch;
    }

    /**
     * Get Domain name of the CLB instance.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LoadBalancerDomain Domain name of the CLB instance.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLoadBalancerDomain() {
        return this.LoadBalancerDomain;
    }

    /**
     * Set Domain name of the CLB instance.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LoadBalancerDomain Domain name of the CLB instance.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLoadBalancerDomain(String LoadBalancerDomain) {
        this.LoadBalancerDomain = LoadBalancerDomain;
    }

    /**
     * Get Network egress
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Egress Network egress
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getEgress() {
        return this.Egress;
    }

    /**
     * Set Network egress
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Egress Network egress
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setEgress(String Egress) {
        this.Egress = Egress;
    }

    /**
     * Get  
     * @return AttributeFlags 
     */
    public String [] getAttributeFlags() {
        return this.AttributeFlags;
    }

    /**
     * Set 
     * @param AttributeFlags 
     */
    public void setAttributeFlags(String [] AttributeFlags) {
        this.AttributeFlags = AttributeFlags;
    }

    /**
     * Get  
     * @return SlaType 
     */
    public String getSlaType() {
        return this.SlaType;
    }

    /**
     * Set 
     * @param SlaType 
     */
    public void setSlaType(String SlaType) {
        this.SlaType = SlaType;
    }

    /**
     * Get  
     * @return Exclusive 
     */
    public Long getExclusive() {
        return this.Exclusive;
    }

    /**
     * Set 
     * @param Exclusive 
     */
    public void setExclusive(Long Exclusive) {
        this.Exclusive = Exclusive;
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

    }
}


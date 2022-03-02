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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProxyInfo extends AbstractModel{

    /**
    * Connection instance ID; It's an old parameter, please switch to ProxyId.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Creation time in the format of UNIX timestamp, indicating the number of seconds that have elapsed since January 1, 1970 (midnight in UTC/GMT).
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Connection name.
    */
    @SerializedName("ProxyName")
    @Expose
    private String ProxyName;

    /**
    * Access region.
    */
    @SerializedName("AccessRegion")
    @Expose
    private String AccessRegion;

    /**
    * Origin server region.
    */
    @SerializedName("RealServerRegion")
    @Expose
    private String RealServerRegion;

    /**
    * Bandwidth. Unit: Mbps.
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * Concurrence. Unit: requests/second.
    */
    @SerializedName("Concurrent")
    @Expose
    private Long Concurrent;

    /**
    * Connection status. Valid values:
`RUNNING`: running
`CREATING`: creating
`DESTROYING`: terminating
`OPENING`: enabling
`CLOSING`: disabling
`CLOSED`: disabled
`ADJUSTING`: adjusting configuration
`ISOLATING`: isolating
`ISOLATED`: isolated
`CLONING`: copying
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Accessed domain name.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Accessed IP.
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * Connection versions: 1.0, 2.0, 3.0.
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Connection instance ID; It's a new parameter.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * 1: this connection is expandable; 0: this connection is not expandable.
    */
    @SerializedName("Scalarable")
    @Expose
    private Long Scalarable;

    /**
    * Supported protocol types.
    */
    @SerializedName("SupportProtocols")
    @Expose
    private String [] SupportProtocols;

    /**
    * Connection group ID. This field exists if a connection belongs to a connection group.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Security policy ID. This field exists if security policies are configured.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * Access region details, including region ID and region name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AccessRegionInfo")
    @Expose
    private RegionDetail AccessRegionInfo;

    /**
    * Origin server region details, including region ID and region name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RealServerRegionInfo")
    @Expose
    private RegionDetail RealServerRegionInfo;

    /**
    * Forwarding IP of the connection
    */
    @SerializedName("ForwardIP")
    @Expose
    private String ForwardIP;

    /**
    * Tag list. This field is an empty list if no tags exist.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TagSet")
    @Expose
    private TagPair [] TagSet;

    /**
    * Whether security groups are supported.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SupportSecurity")
    @Expose
    private Long SupportSecurity;

    /**
    * Billing mode. 0: bill-by-bandwidth; 1: bill-by-traffic.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BillingType")
    @Expose
    private Long BillingType;

    /**
    * List of domain names associated with resolution record
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RelatedGlobalDomains")
    @Expose
    private String [] RelatedGlobalDomains;

    /**
    * Configuration change time
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ModifyConfigTime")
    @Expose
    private Long ModifyConfigTime;

    /**
    * Connection type. `100`: THUNDER connection; `103`: Microsoft connection.
Note: this field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("ProxyType")
    @Expose
    private Long ProxyType;

    /**
    * Describes how the connection obtains client IPs. 0: TOA; 1: Proxy Protocol.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ClientIPMethod")
    @Expose
    private Long [] ClientIPMethod;

    /**
    * IP version. Valid values: `IPv4`, `IPv6`.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("IPAddressVersion")
    @Expose
    private String IPAddressVersion;

    /**
    * Network type. `normal`: general BGP; `cn2`: dedicated BGP; `triple`: Non-BGP (provided by the top 3 ISPs in the Chinese mainland).
Note: this field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("NetworkType")
    @Expose
    private String NetworkType;

    /**
    * Package type of connections. Valid values: `Thunder` (general connection), `Accelerator` (silver connection), 
and `CrossBorder` (cross-MLC-border connection).
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
    * Blocking-related status of the domain name. `BANNED`: the domain name is blocked; `RECOVER`: the domain name is unblocked or normal; `BANNING`: the domain name is being blocked; `RECOVERING`: the domain name is being unblocked; `BAN_FAILED`: the blocking fails; RECOVER_FAILED: the unblocking fails.
Note: this field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("BanStatus")
    @Expose
    private String BanStatus;

    /**
    * 
    */
    @SerializedName("IPList")
    @Expose
    private IPDetail [] IPList;

    /**
    * Specifies whether to enable HTTP3. Valid values:
`0`: disable HTTP3;
`1`: enable HTTP3.
Note: this field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Http3Supported")
    @Expose
    private Long Http3Supported;

    /**
    * Indicates whether the origin server IP or domain name is in the blocklist. Valid values: `0` (no) and `1` (yes).
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("InBanBlacklist")
    @Expose
    private Long InBanBlacklist;

    /**
     * Get Connection instance ID; It's an old parameter, please switch to ProxyId.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceId Connection instance ID; It's an old parameter, please switch to ProxyId.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Connection instance ID; It's an old parameter, please switch to ProxyId.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceId Connection instance ID; It's an old parameter, please switch to ProxyId.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Creation time in the format of UNIX timestamp, indicating the number of seconds that have elapsed since January 1, 1970 (midnight in UTC/GMT). 
     * @return CreateTime Creation time in the format of UNIX timestamp, indicating the number of seconds that have elapsed since January 1, 1970 (midnight in UTC/GMT).
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time in the format of UNIX timestamp, indicating the number of seconds that have elapsed since January 1, 1970 (midnight in UTC/GMT).
     * @param CreateTime Creation time in the format of UNIX timestamp, indicating the number of seconds that have elapsed since January 1, 1970 (midnight in UTC/GMT).
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Project ID. 
     * @return ProjectId Project ID.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.
     * @param ProjectId Project ID.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Connection name. 
     * @return ProxyName Connection name.
     */
    public String getProxyName() {
        return this.ProxyName;
    }

    /**
     * Set Connection name.
     * @param ProxyName Connection name.
     */
    public void setProxyName(String ProxyName) {
        this.ProxyName = ProxyName;
    }

    /**
     * Get Access region. 
     * @return AccessRegion Access region.
     */
    public String getAccessRegion() {
        return this.AccessRegion;
    }

    /**
     * Set Access region.
     * @param AccessRegion Access region.
     */
    public void setAccessRegion(String AccessRegion) {
        this.AccessRegion = AccessRegion;
    }

    /**
     * Get Origin server region. 
     * @return RealServerRegion Origin server region.
     */
    public String getRealServerRegion() {
        return this.RealServerRegion;
    }

    /**
     * Set Origin server region.
     * @param RealServerRegion Origin server region.
     */
    public void setRealServerRegion(String RealServerRegion) {
        this.RealServerRegion = RealServerRegion;
    }

    /**
     * Get Bandwidth. Unit: Mbps. 
     * @return Bandwidth Bandwidth. Unit: Mbps.
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set Bandwidth. Unit: Mbps.
     * @param Bandwidth Bandwidth. Unit: Mbps.
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get Concurrence. Unit: requests/second. 
     * @return Concurrent Concurrence. Unit: requests/second.
     */
    public Long getConcurrent() {
        return this.Concurrent;
    }

    /**
     * Set Concurrence. Unit: requests/second.
     * @param Concurrent Concurrence. Unit: requests/second.
     */
    public void setConcurrent(Long Concurrent) {
        this.Concurrent = Concurrent;
    }

    /**
     * Get Connection status. Valid values:
`RUNNING`: running
`CREATING`: creating
`DESTROYING`: terminating
`OPENING`: enabling
`CLOSING`: disabling
`CLOSED`: disabled
`ADJUSTING`: adjusting configuration
`ISOLATING`: isolating
`ISOLATED`: isolated
`CLONING`: copying 
     * @return Status Connection status. Valid values:
`RUNNING`: running
`CREATING`: creating
`DESTROYING`: terminating
`OPENING`: enabling
`CLOSING`: disabling
`CLOSED`: disabled
`ADJUSTING`: adjusting configuration
`ISOLATING`: isolating
`ISOLATED`: isolated
`CLONING`: copying
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Connection status. Valid values:
`RUNNING`: running
`CREATING`: creating
`DESTROYING`: terminating
`OPENING`: enabling
`CLOSING`: disabling
`CLOSED`: disabled
`ADJUSTING`: adjusting configuration
`ISOLATING`: isolating
`ISOLATED`: isolated
`CLONING`: copying
     * @param Status Connection status. Valid values:
`RUNNING`: running
`CREATING`: creating
`DESTROYING`: terminating
`OPENING`: enabling
`CLOSING`: disabling
`CLOSED`: disabled
`ADJUSTING`: adjusting configuration
`ISOLATING`: isolating
`ISOLATED`: isolated
`CLONING`: copying
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Accessed domain name. 
     * @return Domain Accessed domain name.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Accessed domain name.
     * @param Domain Accessed domain name.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Accessed IP. 
     * @return IP Accessed IP.
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set Accessed IP.
     * @param IP Accessed IP.
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Get Connection versions: 1.0, 2.0, 3.0. 
     * @return Version Connection versions: 1.0, 2.0, 3.0.
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Connection versions: 1.0, 2.0, 3.0.
     * @param Version Connection versions: 1.0, 2.0, 3.0.
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Connection instance ID; It's a new parameter.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProxyId Connection instance ID; It's a new parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set Connection instance ID; It's a new parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProxyId Connection instance ID; It's a new parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get 1: this connection is expandable; 0: this connection is not expandable. 
     * @return Scalarable 1: this connection is expandable; 0: this connection is not expandable.
     */
    public Long getScalarable() {
        return this.Scalarable;
    }

    /**
     * Set 1: this connection is expandable; 0: this connection is not expandable.
     * @param Scalarable 1: this connection is expandable; 0: this connection is not expandable.
     */
    public void setScalarable(Long Scalarable) {
        this.Scalarable = Scalarable;
    }

    /**
     * Get Supported protocol types. 
     * @return SupportProtocols Supported protocol types.
     */
    public String [] getSupportProtocols() {
        return this.SupportProtocols;
    }

    /**
     * Set Supported protocol types.
     * @param SupportProtocols Supported protocol types.
     */
    public void setSupportProtocols(String [] SupportProtocols) {
        this.SupportProtocols = SupportProtocols;
    }

    /**
     * Get Connection group ID. This field exists if a connection belongs to a connection group.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GroupId Connection group ID. This field exists if a connection belongs to a connection group.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Connection group ID. This field exists if a connection belongs to a connection group.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GroupId Connection group ID. This field exists if a connection belongs to a connection group.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Security policy ID. This field exists if security policies are configured.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PolicyId Security policy ID. This field exists if security policies are configured.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set Security policy ID. This field exists if security policies are configured.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PolicyId Security policy ID. This field exists if security policies are configured.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get Access region details, including region ID and region name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AccessRegionInfo Access region details, including region ID and region name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public RegionDetail getAccessRegionInfo() {
        return this.AccessRegionInfo;
    }

    /**
     * Set Access region details, including region ID and region name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AccessRegionInfo Access region details, including region ID and region name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAccessRegionInfo(RegionDetail AccessRegionInfo) {
        this.AccessRegionInfo = AccessRegionInfo;
    }

    /**
     * Get Origin server region details, including region ID and region name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RealServerRegionInfo Origin server region details, including region ID and region name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public RegionDetail getRealServerRegionInfo() {
        return this.RealServerRegionInfo;
    }

    /**
     * Set Origin server region details, including region ID and region name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RealServerRegionInfo Origin server region details, including region ID and region name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRealServerRegionInfo(RegionDetail RealServerRegionInfo) {
        this.RealServerRegionInfo = RealServerRegionInfo;
    }

    /**
     * Get Forwarding IP of the connection 
     * @return ForwardIP Forwarding IP of the connection
     */
    public String getForwardIP() {
        return this.ForwardIP;
    }

    /**
     * Set Forwarding IP of the connection
     * @param ForwardIP Forwarding IP of the connection
     */
    public void setForwardIP(String ForwardIP) {
        this.ForwardIP = ForwardIP;
    }

    /**
     * Get Tag list. This field is an empty list if no tags exist.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TagSet Tag list. This field is an empty list if no tags exist.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TagPair [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set Tag list. This field is an empty list if no tags exist.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TagSet Tag list. This field is an empty list if no tags exist.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTagSet(TagPair [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get Whether security groups are supported.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SupportSecurity Whether security groups are supported.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSupportSecurity() {
        return this.SupportSecurity;
    }

    /**
     * Set Whether security groups are supported.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SupportSecurity Whether security groups are supported.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSupportSecurity(Long SupportSecurity) {
        this.SupportSecurity = SupportSecurity;
    }

    /**
     * Get Billing mode. 0: bill-by-bandwidth; 1: bill-by-traffic.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return BillingType Billing mode. 0: bill-by-bandwidth; 1: bill-by-traffic.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getBillingType() {
        return this.BillingType;
    }

    /**
     * Set Billing mode. 0: bill-by-bandwidth; 1: bill-by-traffic.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param BillingType Billing mode. 0: bill-by-bandwidth; 1: bill-by-traffic.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setBillingType(Long BillingType) {
        this.BillingType = BillingType;
    }

    /**
     * Get List of domain names associated with resolution record
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RelatedGlobalDomains List of domain names associated with resolution record
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getRelatedGlobalDomains() {
        return this.RelatedGlobalDomains;
    }

    /**
     * Set List of domain names associated with resolution record
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RelatedGlobalDomains List of domain names associated with resolution record
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRelatedGlobalDomains(String [] RelatedGlobalDomains) {
        this.RelatedGlobalDomains = RelatedGlobalDomains;
    }

    /**
     * Get Configuration change time
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ModifyConfigTime Configuration change time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getModifyConfigTime() {
        return this.ModifyConfigTime;
    }

    /**
     * Set Configuration change time
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ModifyConfigTime Configuration change time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setModifyConfigTime(Long ModifyConfigTime) {
        this.ModifyConfigTime = ModifyConfigTime;
    }

    /**
     * Get Connection type. `100`: THUNDER connection; `103`: Microsoft connection.
Note: this field may return `null`, indicating that no valid value can be obtained. 
     * @return ProxyType Connection type. `100`: THUNDER connection; `103`: Microsoft connection.
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getProxyType() {
        return this.ProxyType;
    }

    /**
     * Set Connection type. `100`: THUNDER connection; `103`: Microsoft connection.
Note: this field may return `null`, indicating that no valid value can be obtained.
     * @param ProxyType Connection type. `100`: THUNDER connection; `103`: Microsoft connection.
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public void setProxyType(Long ProxyType) {
        this.ProxyType = ProxyType;
    }

    /**
     * Get Describes how the connection obtains client IPs. 0: TOA; 1: Proxy Protocol.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ClientIPMethod Describes how the connection obtains client IPs. 0: TOA; 1: Proxy Protocol.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long [] getClientIPMethod() {
        return this.ClientIPMethod;
    }

    /**
     * Set Describes how the connection obtains client IPs. 0: TOA; 1: Proxy Protocol.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ClientIPMethod Describes how the connection obtains client IPs. 0: TOA; 1: Proxy Protocol.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setClientIPMethod(Long [] ClientIPMethod) {
        this.ClientIPMethod = ClientIPMethod;
    }

    /**
     * Get IP version. Valid values: `IPv4`, `IPv6`.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return IPAddressVersion IP version. Valid values: `IPv4`, `IPv6`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getIPAddressVersion() {
        return this.IPAddressVersion;
    }

    /**
     * Set IP version. Valid values: `IPv4`, `IPv6`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param IPAddressVersion IP version. Valid values: `IPv4`, `IPv6`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setIPAddressVersion(String IPAddressVersion) {
        this.IPAddressVersion = IPAddressVersion;
    }

    /**
     * Get Network type. `normal`: general BGP; `cn2`: dedicated BGP; `triple`: Non-BGP (provided by the top 3 ISPs in the Chinese mainland).
Note: this field may return `null`, indicating that no valid value can be obtained. 
     * @return NetworkType Network type. `normal`: general BGP; `cn2`: dedicated BGP; `triple`: Non-BGP (provided by the top 3 ISPs in the Chinese mainland).
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public String getNetworkType() {
        return this.NetworkType;
    }

    /**
     * Set Network type. `normal`: general BGP; `cn2`: dedicated BGP; `triple`: Non-BGP (provided by the top 3 ISPs in the Chinese mainland).
Note: this field may return `null`, indicating that no valid value can be obtained.
     * @param NetworkType Network type. `normal`: general BGP; `cn2`: dedicated BGP; `triple`: Non-BGP (provided by the top 3 ISPs in the Chinese mainland).
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public void setNetworkType(String NetworkType) {
        this.NetworkType = NetworkType;
    }

    /**
     * Get Package type of connections. Valid values: `Thunder` (general connection), `Accelerator` (silver connection), 
and `CrossBorder` (cross-MLC-border connection).
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return PackageType Package type of connections. Valid values: `Thunder` (general connection), `Accelerator` (silver connection), 
and `CrossBorder` (cross-MLC-border connection).
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set Package type of connections. Valid values: `Thunder` (general connection), `Accelerator` (silver connection), 
and `CrossBorder` (cross-MLC-border connection).
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param PackageType Package type of connections. Valid values: `Thunder` (general connection), `Accelerator` (silver connection), 
and `CrossBorder` (cross-MLC-border connection).
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get Blocking-related status of the domain name. `BANNED`: the domain name is blocked; `RECOVER`: the domain name is unblocked or normal; `BANNING`: the domain name is being blocked; `RECOVERING`: the domain name is being unblocked; `BAN_FAILED`: the blocking fails; RECOVER_FAILED: the unblocking fails.
Note: this field may return `null`, indicating that no valid value can be obtained. 
     * @return BanStatus Blocking-related status of the domain name. `BANNED`: the domain name is blocked; `RECOVER`: the domain name is unblocked or normal; `BANNING`: the domain name is being blocked; `RECOVERING`: the domain name is being unblocked; `BAN_FAILED`: the blocking fails; RECOVER_FAILED: the unblocking fails.
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public String getBanStatus() {
        return this.BanStatus;
    }

    /**
     * Set Blocking-related status of the domain name. `BANNED`: the domain name is blocked; `RECOVER`: the domain name is unblocked or normal; `BANNING`: the domain name is being blocked; `RECOVERING`: the domain name is being unblocked; `BAN_FAILED`: the blocking fails; RECOVER_FAILED: the unblocking fails.
Note: this field may return `null`, indicating that no valid value can be obtained.
     * @param BanStatus Blocking-related status of the domain name. `BANNED`: the domain name is blocked; `RECOVER`: the domain name is unblocked or normal; `BANNING`: the domain name is being blocked; `RECOVERING`: the domain name is being unblocked; `BAN_FAILED`: the blocking fails; RECOVER_FAILED: the unblocking fails.
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public void setBanStatus(String BanStatus) {
        this.BanStatus = BanStatus;
    }

    /**
     * Get  
     * @return IPList 
     */
    public IPDetail [] getIPList() {
        return this.IPList;
    }

    /**
     * Set 
     * @param IPList 
     */
    public void setIPList(IPDetail [] IPList) {
        this.IPList = IPList;
    }

    /**
     * Get Specifies whether to enable HTTP3. Valid values:
`0`: disable HTTP3;
`1`: enable HTTP3.
Note: this field may return `null`, indicating that no valid value can be obtained. 
     * @return Http3Supported Specifies whether to enable HTTP3. Valid values:
`0`: disable HTTP3;
`1`: enable HTTP3.
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getHttp3Supported() {
        return this.Http3Supported;
    }

    /**
     * Set Specifies whether to enable HTTP3. Valid values:
`0`: disable HTTP3;
`1`: enable HTTP3.
Note: this field may return `null`, indicating that no valid value can be obtained.
     * @param Http3Supported Specifies whether to enable HTTP3. Valid values:
`0`: disable HTTP3;
`1`: enable HTTP3.
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public void setHttp3Supported(Long Http3Supported) {
        this.Http3Supported = Http3Supported;
    }

    /**
     * Get Indicates whether the origin server IP or domain name is in the blocklist. Valid values: `0` (no) and `1` (yes).
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return InBanBlacklist Indicates whether the origin server IP or domain name is in the blocklist. Valid values: `0` (no) and `1` (yes).
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getInBanBlacklist() {
        return this.InBanBlacklist;
    }

    /**
     * Set Indicates whether the origin server IP or domain name is in the blocklist. Valid values: `0` (no) and `1` (yes).
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param InBanBlacklist Indicates whether the origin server IP or domain name is in the blocklist. Valid values: `0` (no) and `1` (yes).
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setInBanBlacklist(Long InBanBlacklist) {
        this.InBanBlacklist = InBanBlacklist;
    }

    public ProxyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProxyInfo(ProxyInfo source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.ProxyName != null) {
            this.ProxyName = new String(source.ProxyName);
        }
        if (source.AccessRegion != null) {
            this.AccessRegion = new String(source.AccessRegion);
        }
        if (source.RealServerRegion != null) {
            this.RealServerRegion = new String(source.RealServerRegion);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.Concurrent != null) {
            this.Concurrent = new Long(source.Concurrent);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.IP != null) {
            this.IP = new String(source.IP);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.ProxyId != null) {
            this.ProxyId = new String(source.ProxyId);
        }
        if (source.Scalarable != null) {
            this.Scalarable = new Long(source.Scalarable);
        }
        if (source.SupportProtocols != null) {
            this.SupportProtocols = new String[source.SupportProtocols.length];
            for (int i = 0; i < source.SupportProtocols.length; i++) {
                this.SupportProtocols[i] = new String(source.SupportProtocols[i]);
            }
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
        if (source.AccessRegionInfo != null) {
            this.AccessRegionInfo = new RegionDetail(source.AccessRegionInfo);
        }
        if (source.RealServerRegionInfo != null) {
            this.RealServerRegionInfo = new RegionDetail(source.RealServerRegionInfo);
        }
        if (source.ForwardIP != null) {
            this.ForwardIP = new String(source.ForwardIP);
        }
        if (source.TagSet != null) {
            this.TagSet = new TagPair[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new TagPair(source.TagSet[i]);
            }
        }
        if (source.SupportSecurity != null) {
            this.SupportSecurity = new Long(source.SupportSecurity);
        }
        if (source.BillingType != null) {
            this.BillingType = new Long(source.BillingType);
        }
        if (source.RelatedGlobalDomains != null) {
            this.RelatedGlobalDomains = new String[source.RelatedGlobalDomains.length];
            for (int i = 0; i < source.RelatedGlobalDomains.length; i++) {
                this.RelatedGlobalDomains[i] = new String(source.RelatedGlobalDomains[i]);
            }
        }
        if (source.ModifyConfigTime != null) {
            this.ModifyConfigTime = new Long(source.ModifyConfigTime);
        }
        if (source.ProxyType != null) {
            this.ProxyType = new Long(source.ProxyType);
        }
        if (source.ClientIPMethod != null) {
            this.ClientIPMethod = new Long[source.ClientIPMethod.length];
            for (int i = 0; i < source.ClientIPMethod.length; i++) {
                this.ClientIPMethod[i] = new Long(source.ClientIPMethod[i]);
            }
        }
        if (source.IPAddressVersion != null) {
            this.IPAddressVersion = new String(source.IPAddressVersion);
        }
        if (source.NetworkType != null) {
            this.NetworkType = new String(source.NetworkType);
        }
        if (source.PackageType != null) {
            this.PackageType = new String(source.PackageType);
        }
        if (source.BanStatus != null) {
            this.BanStatus = new String(source.BanStatus);
        }
        if (source.IPList != null) {
            this.IPList = new IPDetail[source.IPList.length];
            for (int i = 0; i < source.IPList.length; i++) {
                this.IPList[i] = new IPDetail(source.IPList[i]);
            }
        }
        if (source.Http3Supported != null) {
            this.Http3Supported = new Long(source.Http3Supported);
        }
        if (source.InBanBlacklist != null) {
            this.InBanBlacklist = new Long(source.InBanBlacklist);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProxyName", this.ProxyName);
        this.setParamSimple(map, prefix + "AccessRegion", this.AccessRegion);
        this.setParamSimple(map, prefix + "RealServerRegion", this.RealServerRegion);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "Concurrent", this.Concurrent);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "Scalarable", this.Scalarable);
        this.setParamArraySimple(map, prefix + "SupportProtocols.", this.SupportProtocols);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamObj(map, prefix + "AccessRegionInfo.", this.AccessRegionInfo);
        this.setParamObj(map, prefix + "RealServerRegionInfo.", this.RealServerRegionInfo);
        this.setParamSimple(map, prefix + "ForwardIP", this.ForwardIP);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);
        this.setParamSimple(map, prefix + "SupportSecurity", this.SupportSecurity);
        this.setParamSimple(map, prefix + "BillingType", this.BillingType);
        this.setParamArraySimple(map, prefix + "RelatedGlobalDomains.", this.RelatedGlobalDomains);
        this.setParamSimple(map, prefix + "ModifyConfigTime", this.ModifyConfigTime);
        this.setParamSimple(map, prefix + "ProxyType", this.ProxyType);
        this.setParamArraySimple(map, prefix + "ClientIPMethod.", this.ClientIPMethod);
        this.setParamSimple(map, prefix + "IPAddressVersion", this.IPAddressVersion);
        this.setParamSimple(map, prefix + "NetworkType", this.NetworkType);
        this.setParamSimple(map, prefix + "PackageType", this.PackageType);
        this.setParamSimple(map, prefix + "BanStatus", this.BanStatus);
        this.setParamArrayObj(map, prefix + "IPList.", this.IPList);
        this.setParamSimple(map, prefix + "Http3Supported", this.Http3Supported);
        this.setParamSimple(map, prefix + "InBanBlacklist", this.InBanBlacklist);

    }
}


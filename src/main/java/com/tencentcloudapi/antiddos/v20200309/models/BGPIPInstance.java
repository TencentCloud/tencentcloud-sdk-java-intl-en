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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BGPIPInstance extends AbstractModel {

    /**
    * Anti-DDoS instance details
    */
    @SerializedName("InstanceDetail")
    @Expose
    private InstanceRelation InstanceDetail;

    /**
    * Anti-DDoS instance specifications
    */
    @SerializedName("SpecificationLimit")
    @Expose
    private BGPIPInstanceSpecification SpecificationLimit;

    /**
    * Anti-DDoS instance usage statistics
    */
    @SerializedName("Usage")
    @Expose
    private BGPIPInstanceUsages Usage;

    /**
    * Region of the Anti-DDoS instance
    */
    @SerializedName("Region")
    @Expose
    private RegionInfo Region;

    /**
    * Status of the Anti-DDoS instance. Valid values:
`idle`: running
`attacking`: under attacks
`blocking`: blocked
`creating`: creating
`deblocking`: unblocking
`isolate`: reprocessed and isolated
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Purchase time
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

    /**
    * Expired At
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Name of the Anti-DDoS instance
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Package details of the Anti-DDoS instance.
Note: This field is `null` for an Anti-DDoS instance without using a package.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("PackInfo")
    @Expose
    private PackInfo PackInfo;

    /**
    * Non-BGP package details of the Anti-DDoS instance.
Note: This field is `null` for an Anti-DDoS instance without using a non-BGP package.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("StaticPackRelation")
    @Expose
    private StaticPackRelation StaticPackRelation;

    /**
    * Specifies the ISP. `0`: Chinese mainland ISPs (default); `1`：Radware；`2`: Tencent; `3`: NSFOCUS. Note that `1`, `2` and `3` are used for services outside the Chinese mainland.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * Used to differentiate clusters
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Tgw")
    @Expose
    private Long Tgw;

    /**
    * EIP states: `CREATING`, `BINDING`, `BIND`, `UNBINDING`, `UNBIND`, `OFFLINING`, and `BIND_ENI`. The EIP must be bound to an Anti-DDoS Advanced instance.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("EipAddressStatus")
    @Expose
    private String EipAddressStatus;

    /**
    * Whether it is an Anti-DDoS EIP instance. `1`: Yes; `0`: No.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("EipFlag")
    @Expose
    private Long EipFlag;

    /**
    * EIP package details of the Anti-DDoS Advanced instance.
Note: This field is `null` for an Anti-DDoS Advanced instance without using an EIP package.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("EipAddressPackRelation")
    @Expose
    private EipAddressPackRelation EipAddressPackRelation;

    /**
    * Details of the Anti-DDoS Advanced instance bound to the EIP.
Note: This field is `null` if the EIP is not bound to an Anti-DDoS Advanced instance.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("EipAddressInfo")
    @Expose
    private EipAddressRelation EipAddressInfo;

    /**
    * Recommended domain name for clients to access.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Whether to enable Sec-MCA. Valid values: `1` (enabled) and `0` (disabled).
    */
    @SerializedName("DamDDoSStatus")
    @Expose
    private Long DamDDoSStatus;

    /**
    * Whether it’s an IPv6 address. `1`: Yes; `0`: No.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("V6Flag")
    @Expose
    private Long V6Flag;

    /**
    * Whether it’s an Anti-DDoS Advanced instance from Tencent Cloud channels. `1`: Yes; `0`: No.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("BGPIPChannelFlag")
    @Expose
    private Long BGPIPChannelFlag;

    /**
    * Tag that the Anti-DDoS Advanced instance is associated with
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("TagInfoList")
    @Expose
    private TagInfo [] TagInfoList;

    /**
    * All-out package details of the instance
When an all-out package is not used by the instance, this field is `null`.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("AnycastOutPackRelation")
    @Expose
    private AnycastOutPackRelation AnycastOutPackRelation;

    /**
    * Edition of the instance
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("InstanceVersion")
    @Expose
    private Long InstanceVersion;

    /**
    * Convoy instance ID
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("ConvoyId")
    @Expose
    private String ConvoyId;

    /**
    * Pay-as-you-go bandwidth
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("ElasticBandwidth")
    @Expose
    private Long ElasticBandwidth;

    /**
    * Whether it’s the IP broadcasted by EdgeOne. Values: `1` (yes), `0` (no)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EOFlag")
    @Expose
    private Long EOFlag;

    /**
     * Get Anti-DDoS instance details 
     * @return InstanceDetail Anti-DDoS instance details
     */
    public InstanceRelation getInstanceDetail() {
        return this.InstanceDetail;
    }

    /**
     * Set Anti-DDoS instance details
     * @param InstanceDetail Anti-DDoS instance details
     */
    public void setInstanceDetail(InstanceRelation InstanceDetail) {
        this.InstanceDetail = InstanceDetail;
    }

    /**
     * Get Anti-DDoS instance specifications 
     * @return SpecificationLimit Anti-DDoS instance specifications
     */
    public BGPIPInstanceSpecification getSpecificationLimit() {
        return this.SpecificationLimit;
    }

    /**
     * Set Anti-DDoS instance specifications
     * @param SpecificationLimit Anti-DDoS instance specifications
     */
    public void setSpecificationLimit(BGPIPInstanceSpecification SpecificationLimit) {
        this.SpecificationLimit = SpecificationLimit;
    }

    /**
     * Get Anti-DDoS instance usage statistics 
     * @return Usage Anti-DDoS instance usage statistics
     */
    public BGPIPInstanceUsages getUsage() {
        return this.Usage;
    }

    /**
     * Set Anti-DDoS instance usage statistics
     * @param Usage Anti-DDoS instance usage statistics
     */
    public void setUsage(BGPIPInstanceUsages Usage) {
        this.Usage = Usage;
    }

    /**
     * Get Region of the Anti-DDoS instance 
     * @return Region Region of the Anti-DDoS instance
     */
    public RegionInfo getRegion() {
        return this.Region;
    }

    /**
     * Set Region of the Anti-DDoS instance
     * @param Region Region of the Anti-DDoS instance
     */
    public void setRegion(RegionInfo Region) {
        this.Region = Region;
    }

    /**
     * Get Status of the Anti-DDoS instance. Valid values:
`idle`: running
`attacking`: under attacks
`blocking`: blocked
`creating`: creating
`deblocking`: unblocking
`isolate`: reprocessed and isolated 
     * @return Status Status of the Anti-DDoS instance. Valid values:
`idle`: running
`attacking`: under attacks
`blocking`: blocked
`creating`: creating
`deblocking`: unblocking
`isolate`: reprocessed and isolated
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status of the Anti-DDoS instance. Valid values:
`idle`: running
`attacking`: under attacks
`blocking`: blocked
`creating`: creating
`deblocking`: unblocking
`isolate`: reprocessed and isolated
     * @param Status Status of the Anti-DDoS instance. Valid values:
`idle`: running
`attacking`: under attacks
`blocking`: blocked
`creating`: creating
`deblocking`: unblocking
`isolate`: reprocessed and isolated
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Purchase time 
     * @return ExpiredTime Purchase time
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set Purchase time
     * @param ExpiredTime Purchase time
     */
    public void setExpiredTime(String ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get Expired At 
     * @return CreatedTime Expired At
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Expired At
     * @param CreatedTime Expired At
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Name of the Anti-DDoS instance 
     * @return Name Name of the Anti-DDoS instance
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of the Anti-DDoS instance
     * @param Name Name of the Anti-DDoS instance
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Package details of the Anti-DDoS instance.
Note: This field is `null` for an Anti-DDoS instance without using a package.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return PackInfo Package details of the Anti-DDoS instance.
Note: This field is `null` for an Anti-DDoS instance without using a package.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public PackInfo getPackInfo() {
        return this.PackInfo;
    }

    /**
     * Set Package details of the Anti-DDoS instance.
Note: This field is `null` for an Anti-DDoS instance without using a package.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param PackInfo Package details of the Anti-DDoS instance.
Note: This field is `null` for an Anti-DDoS instance without using a package.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setPackInfo(PackInfo PackInfo) {
        this.PackInfo = PackInfo;
    }

    /**
     * Get Non-BGP package details of the Anti-DDoS instance.
Note: This field is `null` for an Anti-DDoS instance without using a non-BGP package.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return StaticPackRelation Non-BGP package details of the Anti-DDoS instance.
Note: This field is `null` for an Anti-DDoS instance without using a non-BGP package.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public StaticPackRelation getStaticPackRelation() {
        return this.StaticPackRelation;
    }

    /**
     * Set Non-BGP package details of the Anti-DDoS instance.
Note: This field is `null` for an Anti-DDoS instance without using a non-BGP package.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param StaticPackRelation Non-BGP package details of the Anti-DDoS instance.
Note: This field is `null` for an Anti-DDoS instance without using a non-BGP package.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setStaticPackRelation(StaticPackRelation StaticPackRelation) {
        this.StaticPackRelation = StaticPackRelation;
    }

    /**
     * Get Specifies the ISP. `0`: Chinese mainland ISPs (default); `1`：Radware；`2`: Tencent; `3`: NSFOCUS. Note that `1`, `2` and `3` are used for services outside the Chinese mainland.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ZoneId Specifies the ISP. `0`: Chinese mainland ISPs (default); `1`：Radware；`2`: Tencent; `3`: NSFOCUS. Note that `1`, `2` and `3` are used for services outside the Chinese mainland.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Specifies the ISP. `0`: Chinese mainland ISPs (default); `1`：Radware；`2`: Tencent; `3`: NSFOCUS. Note that `1`, `2` and `3` are used for services outside the Chinese mainland.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ZoneId Specifies the ISP. `0`: Chinese mainland ISPs (default); `1`：Radware；`2`: Tencent; `3`: NSFOCUS. Note that `1`, `2` and `3` are used for services outside the Chinese mainland.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Used to differentiate clusters
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Tgw Used to differentiate clusters
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getTgw() {
        return this.Tgw;
    }

    /**
     * Set Used to differentiate clusters
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Tgw Used to differentiate clusters
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setTgw(Long Tgw) {
        this.Tgw = Tgw;
    }

    /**
     * Get EIP states: `CREATING`, `BINDING`, `BIND`, `UNBINDING`, `UNBIND`, `OFFLINING`, and `BIND_ENI`. The EIP must be bound to an Anti-DDoS Advanced instance.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return EipAddressStatus EIP states: `CREATING`, `BINDING`, `BIND`, `UNBINDING`, `UNBIND`, `OFFLINING`, and `BIND_ENI`. The EIP must be bound to an Anti-DDoS Advanced instance.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getEipAddressStatus() {
        return this.EipAddressStatus;
    }

    /**
     * Set EIP states: `CREATING`, `BINDING`, `BIND`, `UNBINDING`, `UNBIND`, `OFFLINING`, and `BIND_ENI`. The EIP must be bound to an Anti-DDoS Advanced instance.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param EipAddressStatus EIP states: `CREATING`, `BINDING`, `BIND`, `UNBINDING`, `UNBIND`, `OFFLINING`, and `BIND_ENI`. The EIP must be bound to an Anti-DDoS Advanced instance.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setEipAddressStatus(String EipAddressStatus) {
        this.EipAddressStatus = EipAddressStatus;
    }

    /**
     * Get Whether it is an Anti-DDoS EIP instance. `1`: Yes; `0`: No.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return EipFlag Whether it is an Anti-DDoS EIP instance. `1`: Yes; `0`: No.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getEipFlag() {
        return this.EipFlag;
    }

    /**
     * Set Whether it is an Anti-DDoS EIP instance. `1`: Yes; `0`: No.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param EipFlag Whether it is an Anti-DDoS EIP instance. `1`: Yes; `0`: No.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setEipFlag(Long EipFlag) {
        this.EipFlag = EipFlag;
    }

    /**
     * Get EIP package details of the Anti-DDoS Advanced instance.
Note: This field is `null` for an Anti-DDoS Advanced instance without using an EIP package.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return EipAddressPackRelation EIP package details of the Anti-DDoS Advanced instance.
Note: This field is `null` for an Anti-DDoS Advanced instance without using an EIP package.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public EipAddressPackRelation getEipAddressPackRelation() {
        return this.EipAddressPackRelation;
    }

    /**
     * Set EIP package details of the Anti-DDoS Advanced instance.
Note: This field is `null` for an Anti-DDoS Advanced instance without using an EIP package.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param EipAddressPackRelation EIP package details of the Anti-DDoS Advanced instance.
Note: This field is `null` for an Anti-DDoS Advanced instance without using an EIP package.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setEipAddressPackRelation(EipAddressPackRelation EipAddressPackRelation) {
        this.EipAddressPackRelation = EipAddressPackRelation;
    }

    /**
     * Get Details of the Anti-DDoS Advanced instance bound to the EIP.
Note: This field is `null` if the EIP is not bound to an Anti-DDoS Advanced instance.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return EipAddressInfo Details of the Anti-DDoS Advanced instance bound to the EIP.
Note: This field is `null` if the EIP is not bound to an Anti-DDoS Advanced instance.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public EipAddressRelation getEipAddressInfo() {
        return this.EipAddressInfo;
    }

    /**
     * Set Details of the Anti-DDoS Advanced instance bound to the EIP.
Note: This field is `null` if the EIP is not bound to an Anti-DDoS Advanced instance.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param EipAddressInfo Details of the Anti-DDoS Advanced instance bound to the EIP.
Note: This field is `null` if the EIP is not bound to an Anti-DDoS Advanced instance.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setEipAddressInfo(EipAddressRelation EipAddressInfo) {
        this.EipAddressInfo = EipAddressInfo;
    }

    /**
     * Get Recommended domain name for clients to access.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Domain Recommended domain name for clients to access.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Recommended domain name for clients to access.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Domain Recommended domain name for clients to access.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Whether to enable Sec-MCA. Valid values: `1` (enabled) and `0` (disabled). 
     * @return DamDDoSStatus Whether to enable Sec-MCA. Valid values: `1` (enabled) and `0` (disabled).
     */
    public Long getDamDDoSStatus() {
        return this.DamDDoSStatus;
    }

    /**
     * Set Whether to enable Sec-MCA. Valid values: `1` (enabled) and `0` (disabled).
     * @param DamDDoSStatus Whether to enable Sec-MCA. Valid values: `1` (enabled) and `0` (disabled).
     */
    public void setDamDDoSStatus(Long DamDDoSStatus) {
        this.DamDDoSStatus = DamDDoSStatus;
    }

    /**
     * Get Whether it’s an IPv6 address. `1`: Yes; `0`: No.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return V6Flag Whether it’s an IPv6 address. `1`: Yes; `0`: No.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getV6Flag() {
        return this.V6Flag;
    }

    /**
     * Set Whether it’s an IPv6 address. `1`: Yes; `0`: No.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param V6Flag Whether it’s an IPv6 address. `1`: Yes; `0`: No.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setV6Flag(Long V6Flag) {
        this.V6Flag = V6Flag;
    }

    /**
     * Get Whether it’s an Anti-DDoS Advanced instance from Tencent Cloud channels. `1`: Yes; `0`: No.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return BGPIPChannelFlag Whether it’s an Anti-DDoS Advanced instance from Tencent Cloud channels. `1`: Yes; `0`: No.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getBGPIPChannelFlag() {
        return this.BGPIPChannelFlag;
    }

    /**
     * Set Whether it’s an Anti-DDoS Advanced instance from Tencent Cloud channels. `1`: Yes; `0`: No.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param BGPIPChannelFlag Whether it’s an Anti-DDoS Advanced instance from Tencent Cloud channels. `1`: Yes; `0`: No.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setBGPIPChannelFlag(Long BGPIPChannelFlag) {
        this.BGPIPChannelFlag = BGPIPChannelFlag;
    }

    /**
     * Get Tag that the Anti-DDoS Advanced instance is associated with
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return TagInfoList Tag that the Anti-DDoS Advanced instance is associated with
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public TagInfo [] getTagInfoList() {
        return this.TagInfoList;
    }

    /**
     * Set Tag that the Anti-DDoS Advanced instance is associated with
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param TagInfoList Tag that the Anti-DDoS Advanced instance is associated with
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setTagInfoList(TagInfo [] TagInfoList) {
        this.TagInfoList = TagInfoList;
    }

    /**
     * Get All-out package details of the instance
When an all-out package is not used by the instance, this field is `null`.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return AnycastOutPackRelation All-out package details of the instance
When an all-out package is not used by the instance, this field is `null`.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public AnycastOutPackRelation getAnycastOutPackRelation() {
        return this.AnycastOutPackRelation;
    }

    /**
     * Set All-out package details of the instance
When an all-out package is not used by the instance, this field is `null`.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param AnycastOutPackRelation All-out package details of the instance
When an all-out package is not used by the instance, this field is `null`.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setAnycastOutPackRelation(AnycastOutPackRelation AnycastOutPackRelation) {
        this.AnycastOutPackRelation = AnycastOutPackRelation;
    }

    /**
     * Get Edition of the instance
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return InstanceVersion Edition of the instance
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getInstanceVersion() {
        return this.InstanceVersion;
    }

    /**
     * Set Edition of the instance
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param InstanceVersion Edition of the instance
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setInstanceVersion(Long InstanceVersion) {
        this.InstanceVersion = InstanceVersion;
    }

    /**
     * Get Convoy instance ID
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return ConvoyId Convoy instance ID
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getConvoyId() {
        return this.ConvoyId;
    }

    /**
     * Set Convoy instance ID
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param ConvoyId Convoy instance ID
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setConvoyId(String ConvoyId) {
        this.ConvoyId = ConvoyId;
    }

    /**
     * Get Pay-as-you-go bandwidth
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return ElasticBandwidth Pay-as-you-go bandwidth
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getElasticBandwidth() {
        return this.ElasticBandwidth;
    }

    /**
     * Set Pay-as-you-go bandwidth
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param ElasticBandwidth Pay-as-you-go bandwidth
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setElasticBandwidth(Long ElasticBandwidth) {
        this.ElasticBandwidth = ElasticBandwidth;
    }

    /**
     * Get Whether it’s the IP broadcasted by EdgeOne. Values: `1` (yes), `0` (no)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EOFlag Whether it’s the IP broadcasted by EdgeOne. Values: `1` (yes), `0` (no)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getEOFlag() {
        return this.EOFlag;
    }

    /**
     * Set Whether it’s the IP broadcasted by EdgeOne. Values: `1` (yes), `0` (no)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EOFlag Whether it’s the IP broadcasted by EdgeOne. Values: `1` (yes), `0` (no)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEOFlag(Long EOFlag) {
        this.EOFlag = EOFlag;
    }

    public BGPIPInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BGPIPInstance(BGPIPInstance source) {
        if (source.InstanceDetail != null) {
            this.InstanceDetail = new InstanceRelation(source.InstanceDetail);
        }
        if (source.SpecificationLimit != null) {
            this.SpecificationLimit = new BGPIPInstanceSpecification(source.SpecificationLimit);
        }
        if (source.Usage != null) {
            this.Usage = new BGPIPInstanceUsages(source.Usage);
        }
        if (source.Region != null) {
            this.Region = new RegionInfo(source.Region);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new String(source.ExpiredTime);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.PackInfo != null) {
            this.PackInfo = new PackInfo(source.PackInfo);
        }
        if (source.StaticPackRelation != null) {
            this.StaticPackRelation = new StaticPackRelation(source.StaticPackRelation);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.Tgw != null) {
            this.Tgw = new Long(source.Tgw);
        }
        if (source.EipAddressStatus != null) {
            this.EipAddressStatus = new String(source.EipAddressStatus);
        }
        if (source.EipFlag != null) {
            this.EipFlag = new Long(source.EipFlag);
        }
        if (source.EipAddressPackRelation != null) {
            this.EipAddressPackRelation = new EipAddressPackRelation(source.EipAddressPackRelation);
        }
        if (source.EipAddressInfo != null) {
            this.EipAddressInfo = new EipAddressRelation(source.EipAddressInfo);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.DamDDoSStatus != null) {
            this.DamDDoSStatus = new Long(source.DamDDoSStatus);
        }
        if (source.V6Flag != null) {
            this.V6Flag = new Long(source.V6Flag);
        }
        if (source.BGPIPChannelFlag != null) {
            this.BGPIPChannelFlag = new Long(source.BGPIPChannelFlag);
        }
        if (source.TagInfoList != null) {
            this.TagInfoList = new TagInfo[source.TagInfoList.length];
            for (int i = 0; i < source.TagInfoList.length; i++) {
                this.TagInfoList[i] = new TagInfo(source.TagInfoList[i]);
            }
        }
        if (source.AnycastOutPackRelation != null) {
            this.AnycastOutPackRelation = new AnycastOutPackRelation(source.AnycastOutPackRelation);
        }
        if (source.InstanceVersion != null) {
            this.InstanceVersion = new Long(source.InstanceVersion);
        }
        if (source.ConvoyId != null) {
            this.ConvoyId = new String(source.ConvoyId);
        }
        if (source.ElasticBandwidth != null) {
            this.ElasticBandwidth = new Long(source.ElasticBandwidth);
        }
        if (source.EOFlag != null) {
            this.EOFlag = new Long(source.EOFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "InstanceDetail.", this.InstanceDetail);
        this.setParamObj(map, prefix + "SpecificationLimit.", this.SpecificationLimit);
        this.setParamObj(map, prefix + "Usage.", this.Usage);
        this.setParamObj(map, prefix + "Region.", this.Region);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "PackInfo.", this.PackInfo);
        this.setParamObj(map, prefix + "StaticPackRelation.", this.StaticPackRelation);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Tgw", this.Tgw);
        this.setParamSimple(map, prefix + "EipAddressStatus", this.EipAddressStatus);
        this.setParamSimple(map, prefix + "EipFlag", this.EipFlag);
        this.setParamObj(map, prefix + "EipAddressPackRelation.", this.EipAddressPackRelation);
        this.setParamObj(map, prefix + "EipAddressInfo.", this.EipAddressInfo);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "DamDDoSStatus", this.DamDDoSStatus);
        this.setParamSimple(map, prefix + "V6Flag", this.V6Flag);
        this.setParamSimple(map, prefix + "BGPIPChannelFlag", this.BGPIPChannelFlag);
        this.setParamArrayObj(map, prefix + "TagInfoList.", this.TagInfoList);
        this.setParamObj(map, prefix + "AnycastOutPackRelation.", this.AnycastOutPackRelation);
        this.setParamSimple(map, prefix + "InstanceVersion", this.InstanceVersion);
        this.setParamSimple(map, prefix + "ConvoyId", this.ConvoyId);
        this.setParamSimple(map, prefix + "ElasticBandwidth", this.ElasticBandwidth);
        this.setParamSimple(map, prefix + "EOFlag", this.EOFlag);

    }
}


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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AllocateAddressesRequest extends AbstractModel{

    /**
    * The number of EIPs. Default: 1.
    */
    @SerializedName("AddressCount")
    @Expose
    private Long AddressCount;

    /**
    * The EIP line type. Default: BGP.
<ul style="margin:0"><li>For a user who has activated the static single-line IP allowlist, possible values are:<ul><li>CMCC: China Mobile</li>
<li>CTCC: China Telecom</li>
<li>CUCC: China Unicom</li></ul>Note: Only certain regions support static single-line IP addresses.</li></ul>
    */
    @SerializedName("InternetServiceProvider")
    @Expose
    private String InternetServiceProvider;

    /**
    * The EIP billing method.
<ul style="margin:0"><li>For bill-by-IP account beta users, valid values: <ul><li>BANDWIDTH_PACKAGE: paid by the [bandwidth package](https://intl.cloud.tencent.com/document/product/684/15255?from_cn_redirect=1)(who must also be bandwidth package beta users)</li>
<li>BANDWIDTH_POSTPAID_BY_HOUR: billed by hourly bandwidth on a pay-as-you-go basis</li>
<li>BANDWIDTH_PREPAID_BY_MONTH: monthly bandwidth subscription</li>
<li>TRAFFIC_POSTPAID_BY_HOUR: billed by hourly traffic on a pay-as-you-go basis</li></ul>Default value: TRAFFIC_POSTPAID_BY_HOUR</li>
<li>If you are not a bill-by-IP account beta user, the EIP billing is the same as that for the instance bound to the EIP. Therefore, you do not need to pass in this parameter.</li></ul>
    */
    @SerializedName("InternetChargeType")
    @Expose
    private String InternetChargeType;

    /**
    * The EIP outbound bandwidth cap, in Mbps.
<ul style="margin:0"><li>For bill-by-IP account beta users, the bandwidth cap range is determined by the EIP billing mode. <ul><li>`BANDWIDTH_PACKAGE`: 1 Mbps to 2000 Mbps</li>
<li>`BANDWIDTH_POSTPAID_BY_HOUR`: 1 Mbps to 100 Mbps</li>
<li>`BANDWIDTH_PREPAID_BY_MONTH`: 1 Mbps to 200 Mbps</li>
<li>`TRAFFIC_POSTPAID_BY_HOUR`: 1 Mbps to 100 Mbps</li></ul>Default value: 1 Mbps </li>
<li>If you are not a bill-by-IP account beta user, the EIP outbound bandwidth cap is subject to the bandwidth cap of the instance bound to the EIP. Therefore, you do not need to pass in this parameter. </li></ul>
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * A required billing parameter for an EIP billed by monthly bandwidth subscription. For EIPs using other billing modes, it can be ignored.
    */
    @SerializedName("AddressChargePrepaid")
    @Expose
    private AddressChargePrepaid AddressChargePrepaid;

    /**
    * EIP type. Default value: EIP.
<ul style="margin:0"><li>For beta users of AIA, the value can be:</li></ul>`AnycastEIP`: an AIA IP address. For more information, see [Anycast Internet Acceleration](https://intl.cloud.tencent.com/document/product/644?from_cn_redirect=1).</li></ul>Note: Anycast EIPs are supported only in partial regions. </li></ul>
<ul style="margin:0"><li>For beta users of dedicated IP, the value can be: <ul><li>`HighQualityEIP`: Dedicated IP</li></ul>Note that dedicated IPs are only available in partial regions. </li></ul>
</ul>
<ul style="margin:0"><li>For beta users of Anti-DDoS IP, the value can be: <ul><li>`AntiDDoSEIP`: Anti-DDoS EIP</li></ul>Note that Anti-DDoS IPs are only available in partial regions. </li></ul>
    */
    @SerializedName("AddressType")
    @Expose
    private String AddressType;

    /**
    * Anycast publishing region
<ul style="margin:0"><li>Valid for users who have activated AIA. Values:<ul><li>ANYCAST_ZONE_GLOBAL: global publishing region </li><li>ANYCAST_ZONE_OVERSEAS: overseas publishing region</li><li><b>**[Disused]**</b> ANYCAST_ZONE_A: publishing region A (updated to ANYCAST_ZONE_GLOBAL)</li><li><b>**[Disused]**</b> ANYCAST_ZONE_B: publishing region B (updated to ANYCAST_ZONE_GLOBAL)</li></ul>Default: ANYCAST_ZONE_OVERSEAS.</li></ul>
    */
    @SerializedName("AnycastZone")
    @Expose
    private String AnycastZone;

    /**
    * <b>**[Disused]**</b>
Whether the Anycast EIP can be bound to CLB instances.
<ul style="margin:0"><li>Valid for users who have activated the AIA. Values:<ul><li>TRUE: the Anycast EIP can be bound to CLB instances.</li>
<li>FALSE: the Anycast EIP can be bound to CVMs, NAT gateways, and HAVIPs.</li></ul>Default: FALSE.</li></ul>
    */
    @SerializedName("ApplicableForCLB")
    @Expose
    private Boolean ApplicableForCLB;

    /**
    * List of tags to be bound.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * The unique ID of a BGP bandwidth package. If you configure this parameter and set InternetChargeType as BANDWIDTH_PACKAGE, the new EIP is added to this package and billed by the bandwidth package mode.
    */
    @SerializedName("BandwidthPackageId")
    @Expose
    private String BandwidthPackageId;

    /**
    * EIP name, which is the custom EIP name given by the user when applying for the EIP. Default: not named
    */
    @SerializedName("AddressName")
    @Expose
    private String AddressName;

    /**
    * Network egress. It defaults to `center_egress1`.
    */
    @SerializedName("Egress")
    @Expose
    private String Egress;

    /**
    * Anti-DDoS service package ID. This is required when you want to request an u200dAnti-DDoS IP.
    */
    @SerializedName("AntiDDoSPackageId")
    @Expose
    private String AntiDDoSPackageId;

    /**
    * A string used to ensure the idempotency of the request. Generate a value based on your client. This can ensure that the value is unique for different requests. It only supports ASCII characters and can contain up to 64 characters. 
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
     * Get The number of EIPs. Default: 1. 
     * @return AddressCount The number of EIPs. Default: 1.
     */
    public Long getAddressCount() {
        return this.AddressCount;
    }

    /**
     * Set The number of EIPs. Default: 1.
     * @param AddressCount The number of EIPs. Default: 1.
     */
    public void setAddressCount(Long AddressCount) {
        this.AddressCount = AddressCount;
    }

    /**
     * Get The EIP line type. Default: BGP.
<ul style="margin:0"><li>For a user who has activated the static single-line IP allowlist, possible values are:<ul><li>CMCC: China Mobile</li>
<li>CTCC: China Telecom</li>
<li>CUCC: China Unicom</li></ul>Note: Only certain regions support static single-line IP addresses.</li></ul> 
     * @return InternetServiceProvider The EIP line type. Default: BGP.
<ul style="margin:0"><li>For a user who has activated the static single-line IP allowlist, possible values are:<ul><li>CMCC: China Mobile</li>
<li>CTCC: China Telecom</li>
<li>CUCC: China Unicom</li></ul>Note: Only certain regions support static single-line IP addresses.</li></ul>
     */
    public String getInternetServiceProvider() {
        return this.InternetServiceProvider;
    }

    /**
     * Set The EIP line type. Default: BGP.
<ul style="margin:0"><li>For a user who has activated the static single-line IP allowlist, possible values are:<ul><li>CMCC: China Mobile</li>
<li>CTCC: China Telecom</li>
<li>CUCC: China Unicom</li></ul>Note: Only certain regions support static single-line IP addresses.</li></ul>
     * @param InternetServiceProvider The EIP line type. Default: BGP.
<ul style="margin:0"><li>For a user who has activated the static single-line IP allowlist, possible values are:<ul><li>CMCC: China Mobile</li>
<li>CTCC: China Telecom</li>
<li>CUCC: China Unicom</li></ul>Note: Only certain regions support static single-line IP addresses.</li></ul>
     */
    public void setInternetServiceProvider(String InternetServiceProvider) {
        this.InternetServiceProvider = InternetServiceProvider;
    }

    /**
     * Get The EIP billing method.
<ul style="margin:0"><li>For bill-by-IP account beta users, valid values: <ul><li>BANDWIDTH_PACKAGE: paid by the [bandwidth package](https://intl.cloud.tencent.com/document/product/684/15255?from_cn_redirect=1)(who must also be bandwidth package beta users)</li>
<li>BANDWIDTH_POSTPAID_BY_HOUR: billed by hourly bandwidth on a pay-as-you-go basis</li>
<li>BANDWIDTH_PREPAID_BY_MONTH: monthly bandwidth subscription</li>
<li>TRAFFIC_POSTPAID_BY_HOUR: billed by hourly traffic on a pay-as-you-go basis</li></ul>Default value: TRAFFIC_POSTPAID_BY_HOUR</li>
<li>If you are not a bill-by-IP account beta user, the EIP billing is the same as that for the instance bound to the EIP. Therefore, you do not need to pass in this parameter.</li></ul> 
     * @return InternetChargeType The EIP billing method.
<ul style="margin:0"><li>For bill-by-IP account beta users, valid values: <ul><li>BANDWIDTH_PACKAGE: paid by the [bandwidth package](https://intl.cloud.tencent.com/document/product/684/15255?from_cn_redirect=1)(who must also be bandwidth package beta users)</li>
<li>BANDWIDTH_POSTPAID_BY_HOUR: billed by hourly bandwidth on a pay-as-you-go basis</li>
<li>BANDWIDTH_PREPAID_BY_MONTH: monthly bandwidth subscription</li>
<li>TRAFFIC_POSTPAID_BY_HOUR: billed by hourly traffic on a pay-as-you-go basis</li></ul>Default value: TRAFFIC_POSTPAID_BY_HOUR</li>
<li>If you are not a bill-by-IP account beta user, the EIP billing is the same as that for the instance bound to the EIP. Therefore, you do not need to pass in this parameter.</li></ul>
     */
    public String getInternetChargeType() {
        return this.InternetChargeType;
    }

    /**
     * Set The EIP billing method.
<ul style="margin:0"><li>For bill-by-IP account beta users, valid values: <ul><li>BANDWIDTH_PACKAGE: paid by the [bandwidth package](https://intl.cloud.tencent.com/document/product/684/15255?from_cn_redirect=1)(who must also be bandwidth package beta users)</li>
<li>BANDWIDTH_POSTPAID_BY_HOUR: billed by hourly bandwidth on a pay-as-you-go basis</li>
<li>BANDWIDTH_PREPAID_BY_MONTH: monthly bandwidth subscription</li>
<li>TRAFFIC_POSTPAID_BY_HOUR: billed by hourly traffic on a pay-as-you-go basis</li></ul>Default value: TRAFFIC_POSTPAID_BY_HOUR</li>
<li>If you are not a bill-by-IP account beta user, the EIP billing is the same as that for the instance bound to the EIP. Therefore, you do not need to pass in this parameter.</li></ul>
     * @param InternetChargeType The EIP billing method.
<ul style="margin:0"><li>For bill-by-IP account beta users, valid values: <ul><li>BANDWIDTH_PACKAGE: paid by the [bandwidth package](https://intl.cloud.tencent.com/document/product/684/15255?from_cn_redirect=1)(who must also be bandwidth package beta users)</li>
<li>BANDWIDTH_POSTPAID_BY_HOUR: billed by hourly bandwidth on a pay-as-you-go basis</li>
<li>BANDWIDTH_PREPAID_BY_MONTH: monthly bandwidth subscription</li>
<li>TRAFFIC_POSTPAID_BY_HOUR: billed by hourly traffic on a pay-as-you-go basis</li></ul>Default value: TRAFFIC_POSTPAID_BY_HOUR</li>
<li>If you are not a bill-by-IP account beta user, the EIP billing is the same as that for the instance bound to the EIP. Therefore, you do not need to pass in this parameter.</li></ul>
     */
    public void setInternetChargeType(String InternetChargeType) {
        this.InternetChargeType = InternetChargeType;
    }

    /**
     * Get The EIP outbound bandwidth cap, in Mbps.
<ul style="margin:0"><li>For bill-by-IP account beta users, the bandwidth cap range is determined by the EIP billing mode. <ul><li>`BANDWIDTH_PACKAGE`: 1 Mbps to 2000 Mbps</li>
<li>`BANDWIDTH_POSTPAID_BY_HOUR`: 1 Mbps to 100 Mbps</li>
<li>`BANDWIDTH_PREPAID_BY_MONTH`: 1 Mbps to 200 Mbps</li>
<li>`TRAFFIC_POSTPAID_BY_HOUR`: 1 Mbps to 100 Mbps</li></ul>Default value: 1 Mbps </li>
<li>If you are not a bill-by-IP account beta user, the EIP outbound bandwidth cap is subject to the bandwidth cap of the instance bound to the EIP. Therefore, you do not need to pass in this parameter. </li></ul> 
     * @return InternetMaxBandwidthOut The EIP outbound bandwidth cap, in Mbps.
<ul style="margin:0"><li>For bill-by-IP account beta users, the bandwidth cap range is determined by the EIP billing mode. <ul><li>`BANDWIDTH_PACKAGE`: 1 Mbps to 2000 Mbps</li>
<li>`BANDWIDTH_POSTPAID_BY_HOUR`: 1 Mbps to 100 Mbps</li>
<li>`BANDWIDTH_PREPAID_BY_MONTH`: 1 Mbps to 200 Mbps</li>
<li>`TRAFFIC_POSTPAID_BY_HOUR`: 1 Mbps to 100 Mbps</li></ul>Default value: 1 Mbps </li>
<li>If you are not a bill-by-IP account beta user, the EIP outbound bandwidth cap is subject to the bandwidth cap of the instance bound to the EIP. Therefore, you do not need to pass in this parameter. </li></ul>
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set The EIP outbound bandwidth cap, in Mbps.
<ul style="margin:0"><li>For bill-by-IP account beta users, the bandwidth cap range is determined by the EIP billing mode. <ul><li>`BANDWIDTH_PACKAGE`: 1 Mbps to 2000 Mbps</li>
<li>`BANDWIDTH_POSTPAID_BY_HOUR`: 1 Mbps to 100 Mbps</li>
<li>`BANDWIDTH_PREPAID_BY_MONTH`: 1 Mbps to 200 Mbps</li>
<li>`TRAFFIC_POSTPAID_BY_HOUR`: 1 Mbps to 100 Mbps</li></ul>Default value: 1 Mbps </li>
<li>If you are not a bill-by-IP account beta user, the EIP outbound bandwidth cap is subject to the bandwidth cap of the instance bound to the EIP. Therefore, you do not need to pass in this parameter. </li></ul>
     * @param InternetMaxBandwidthOut The EIP outbound bandwidth cap, in Mbps.
<ul style="margin:0"><li>For bill-by-IP account beta users, the bandwidth cap range is determined by the EIP billing mode. <ul><li>`BANDWIDTH_PACKAGE`: 1 Mbps to 2000 Mbps</li>
<li>`BANDWIDTH_POSTPAID_BY_HOUR`: 1 Mbps to 100 Mbps</li>
<li>`BANDWIDTH_PREPAID_BY_MONTH`: 1 Mbps to 200 Mbps</li>
<li>`TRAFFIC_POSTPAID_BY_HOUR`: 1 Mbps to 100 Mbps</li></ul>Default value: 1 Mbps </li>
<li>If you are not a bill-by-IP account beta user, the EIP outbound bandwidth cap is subject to the bandwidth cap of the instance bound to the EIP. Therefore, you do not need to pass in this parameter. </li></ul>
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get A required billing parameter for an EIP billed by monthly bandwidth subscription. For EIPs using other billing modes, it can be ignored. 
     * @return AddressChargePrepaid A required billing parameter for an EIP billed by monthly bandwidth subscription. For EIPs using other billing modes, it can be ignored.
     */
    public AddressChargePrepaid getAddressChargePrepaid() {
        return this.AddressChargePrepaid;
    }

    /**
     * Set A required billing parameter for an EIP billed by monthly bandwidth subscription. For EIPs using other billing modes, it can be ignored.
     * @param AddressChargePrepaid A required billing parameter for an EIP billed by monthly bandwidth subscription. For EIPs using other billing modes, it can be ignored.
     */
    public void setAddressChargePrepaid(AddressChargePrepaid AddressChargePrepaid) {
        this.AddressChargePrepaid = AddressChargePrepaid;
    }

    /**
     * Get EIP type. Default value: EIP.
<ul style="margin:0"><li>For beta users of AIA, the value can be:</li></ul>`AnycastEIP`: an AIA IP address. For more information, see [Anycast Internet Acceleration](https://intl.cloud.tencent.com/document/product/644?from_cn_redirect=1).</li></ul>Note: Anycast EIPs are supported only in partial regions. </li></ul>
<ul style="margin:0"><li>For beta users of dedicated IP, the value can be: <ul><li>`HighQualityEIP`: Dedicated IP</li></ul>Note that dedicated IPs are only available in partial regions. </li></ul>
</ul>
<ul style="margin:0"><li>For beta users of Anti-DDoS IP, the value can be: <ul><li>`AntiDDoSEIP`: Anti-DDoS EIP</li></ul>Note that Anti-DDoS IPs are only available in partial regions. </li></ul> 
     * @return AddressType EIP type. Default value: EIP.
<ul style="margin:0"><li>For beta users of AIA, the value can be:</li></ul>`AnycastEIP`: an AIA IP address. For more information, see [Anycast Internet Acceleration](https://intl.cloud.tencent.com/document/product/644?from_cn_redirect=1).</li></ul>Note: Anycast EIPs are supported only in partial regions. </li></ul>
<ul style="margin:0"><li>For beta users of dedicated IP, the value can be: <ul><li>`HighQualityEIP`: Dedicated IP</li></ul>Note that dedicated IPs are only available in partial regions. </li></ul>
</ul>
<ul style="margin:0"><li>For beta users of Anti-DDoS IP, the value can be: <ul><li>`AntiDDoSEIP`: Anti-DDoS EIP</li></ul>Note that Anti-DDoS IPs are only available in partial regions. </li></ul>
     */
    public String getAddressType() {
        return this.AddressType;
    }

    /**
     * Set EIP type. Default value: EIP.
<ul style="margin:0"><li>For beta users of AIA, the value can be:</li></ul>`AnycastEIP`: an AIA IP address. For more information, see [Anycast Internet Acceleration](https://intl.cloud.tencent.com/document/product/644?from_cn_redirect=1).</li></ul>Note: Anycast EIPs are supported only in partial regions. </li></ul>
<ul style="margin:0"><li>For beta users of dedicated IP, the value can be: <ul><li>`HighQualityEIP`: Dedicated IP</li></ul>Note that dedicated IPs are only available in partial regions. </li></ul>
</ul>
<ul style="margin:0"><li>For beta users of Anti-DDoS IP, the value can be: <ul><li>`AntiDDoSEIP`: Anti-DDoS EIP</li></ul>Note that Anti-DDoS IPs are only available in partial regions. </li></ul>
     * @param AddressType EIP type. Default value: EIP.
<ul style="margin:0"><li>For beta users of AIA, the value can be:</li></ul>`AnycastEIP`: an AIA IP address. For more information, see [Anycast Internet Acceleration](https://intl.cloud.tencent.com/document/product/644?from_cn_redirect=1).</li></ul>Note: Anycast EIPs are supported only in partial regions. </li></ul>
<ul style="margin:0"><li>For beta users of dedicated IP, the value can be: <ul><li>`HighQualityEIP`: Dedicated IP</li></ul>Note that dedicated IPs are only available in partial regions. </li></ul>
</ul>
<ul style="margin:0"><li>For beta users of Anti-DDoS IP, the value can be: <ul><li>`AntiDDoSEIP`: Anti-DDoS EIP</li></ul>Note that Anti-DDoS IPs are only available in partial regions. </li></ul>
     */
    public void setAddressType(String AddressType) {
        this.AddressType = AddressType;
    }

    /**
     * Get Anycast publishing region
<ul style="margin:0"><li>Valid for users who have activated AIA. Values:<ul><li>ANYCAST_ZONE_GLOBAL: global publishing region </li><li>ANYCAST_ZONE_OVERSEAS: overseas publishing region</li><li><b>**[Disused]**</b> ANYCAST_ZONE_A: publishing region A (updated to ANYCAST_ZONE_GLOBAL)</li><li><b>**[Disused]**</b> ANYCAST_ZONE_B: publishing region B (updated to ANYCAST_ZONE_GLOBAL)</li></ul>Default: ANYCAST_ZONE_OVERSEAS.</li></ul> 
     * @return AnycastZone Anycast publishing region
<ul style="margin:0"><li>Valid for users who have activated AIA. Values:<ul><li>ANYCAST_ZONE_GLOBAL: global publishing region </li><li>ANYCAST_ZONE_OVERSEAS: overseas publishing region</li><li><b>**[Disused]**</b> ANYCAST_ZONE_A: publishing region A (updated to ANYCAST_ZONE_GLOBAL)</li><li><b>**[Disused]**</b> ANYCAST_ZONE_B: publishing region B (updated to ANYCAST_ZONE_GLOBAL)</li></ul>Default: ANYCAST_ZONE_OVERSEAS.</li></ul>
     */
    public String getAnycastZone() {
        return this.AnycastZone;
    }

    /**
     * Set Anycast publishing region
<ul style="margin:0"><li>Valid for users who have activated AIA. Values:<ul><li>ANYCAST_ZONE_GLOBAL: global publishing region </li><li>ANYCAST_ZONE_OVERSEAS: overseas publishing region</li><li><b>**[Disused]**</b> ANYCAST_ZONE_A: publishing region A (updated to ANYCAST_ZONE_GLOBAL)</li><li><b>**[Disused]**</b> ANYCAST_ZONE_B: publishing region B (updated to ANYCAST_ZONE_GLOBAL)</li></ul>Default: ANYCAST_ZONE_OVERSEAS.</li></ul>
     * @param AnycastZone Anycast publishing region
<ul style="margin:0"><li>Valid for users who have activated AIA. Values:<ul><li>ANYCAST_ZONE_GLOBAL: global publishing region </li><li>ANYCAST_ZONE_OVERSEAS: overseas publishing region</li><li><b>**[Disused]**</b> ANYCAST_ZONE_A: publishing region A (updated to ANYCAST_ZONE_GLOBAL)</li><li><b>**[Disused]**</b> ANYCAST_ZONE_B: publishing region B (updated to ANYCAST_ZONE_GLOBAL)</li></ul>Default: ANYCAST_ZONE_OVERSEAS.</li></ul>
     */
    public void setAnycastZone(String AnycastZone) {
        this.AnycastZone = AnycastZone;
    }

    /**
     * Get <b>**[Disused]**</b>
Whether the Anycast EIP can be bound to CLB instances.
<ul style="margin:0"><li>Valid for users who have activated the AIA. Values:<ul><li>TRUE: the Anycast EIP can be bound to CLB instances.</li>
<li>FALSE: the Anycast EIP can be bound to CVMs, NAT gateways, and HAVIPs.</li></ul>Default: FALSE.</li></ul> 
     * @return ApplicableForCLB <b>**[Disused]**</b>
Whether the Anycast EIP can be bound to CLB instances.
<ul style="margin:0"><li>Valid for users who have activated the AIA. Values:<ul><li>TRUE: the Anycast EIP can be bound to CLB instances.</li>
<li>FALSE: the Anycast EIP can be bound to CVMs, NAT gateways, and HAVIPs.</li></ul>Default: FALSE.</li></ul>
     */
    public Boolean getApplicableForCLB() {
        return this.ApplicableForCLB;
    }

    /**
     * Set <b>**[Disused]**</b>
Whether the Anycast EIP can be bound to CLB instances.
<ul style="margin:0"><li>Valid for users who have activated the AIA. Values:<ul><li>TRUE: the Anycast EIP can be bound to CLB instances.</li>
<li>FALSE: the Anycast EIP can be bound to CVMs, NAT gateways, and HAVIPs.</li></ul>Default: FALSE.</li></ul>
     * @param ApplicableForCLB <b>**[Disused]**</b>
Whether the Anycast EIP can be bound to CLB instances.
<ul style="margin:0"><li>Valid for users who have activated the AIA. Values:<ul><li>TRUE: the Anycast EIP can be bound to CLB instances.</li>
<li>FALSE: the Anycast EIP can be bound to CVMs, NAT gateways, and HAVIPs.</li></ul>Default: FALSE.</li></ul>
     */
    public void setApplicableForCLB(Boolean ApplicableForCLB) {
        this.ApplicableForCLB = ApplicableForCLB;
    }

    /**
     * Get List of tags to be bound. 
     * @return Tags List of tags to be bound.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set List of tags to be bound.
     * @param Tags List of tags to be bound.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get The unique ID of a BGP bandwidth package. If you configure this parameter and set InternetChargeType as BANDWIDTH_PACKAGE, the new EIP is added to this package and billed by the bandwidth package mode. 
     * @return BandwidthPackageId The unique ID of a BGP bandwidth package. If you configure this parameter and set InternetChargeType as BANDWIDTH_PACKAGE, the new EIP is added to this package and billed by the bandwidth package mode.
     */
    public String getBandwidthPackageId() {
        return this.BandwidthPackageId;
    }

    /**
     * Set The unique ID of a BGP bandwidth package. If you configure this parameter and set InternetChargeType as BANDWIDTH_PACKAGE, the new EIP is added to this package and billed by the bandwidth package mode.
     * @param BandwidthPackageId The unique ID of a BGP bandwidth package. If you configure this parameter and set InternetChargeType as BANDWIDTH_PACKAGE, the new EIP is added to this package and billed by the bandwidth package mode.
     */
    public void setBandwidthPackageId(String BandwidthPackageId) {
        this.BandwidthPackageId = BandwidthPackageId;
    }

    /**
     * Get EIP name, which is the custom EIP name given by the user when applying for the EIP. Default: not named 
     * @return AddressName EIP name, which is the custom EIP name given by the user when applying for the EIP. Default: not named
     */
    public String getAddressName() {
        return this.AddressName;
    }

    /**
     * Set EIP name, which is the custom EIP name given by the user when applying for the EIP. Default: not named
     * @param AddressName EIP name, which is the custom EIP name given by the user when applying for the EIP. Default: not named
     */
    public void setAddressName(String AddressName) {
        this.AddressName = AddressName;
    }

    /**
     * Get Network egress. It defaults to `center_egress1`. 
     * @return Egress Network egress. It defaults to `center_egress1`.
     */
    public String getEgress() {
        return this.Egress;
    }

    /**
     * Set Network egress. It defaults to `center_egress1`.
     * @param Egress Network egress. It defaults to `center_egress1`.
     */
    public void setEgress(String Egress) {
        this.Egress = Egress;
    }

    /**
     * Get Anti-DDoS service package ID. This is required when you want to request an u200dAnti-DDoS IP. 
     * @return AntiDDoSPackageId Anti-DDoS service package ID. This is required when you want to request an u200dAnti-DDoS IP.
     */
    public String getAntiDDoSPackageId() {
        return this.AntiDDoSPackageId;
    }

    /**
     * Set Anti-DDoS service package ID. This is required when you want to request an u200dAnti-DDoS IP.
     * @param AntiDDoSPackageId Anti-DDoS service package ID. This is required when you want to request an u200dAnti-DDoS IP.
     */
    public void setAntiDDoSPackageId(String AntiDDoSPackageId) {
        this.AntiDDoSPackageId = AntiDDoSPackageId;
    }

    /**
     * Get A string used to ensure the idempotency of the request. Generate a value based on your client. This can ensure that the value is unique for different requests. It only supports ASCII characters and can contain up to 64 characters.  
     * @return ClientToken A string used to ensure the idempotency of the request. Generate a value based on your client. This can ensure that the value is unique for different requests. It only supports ASCII characters and can contain up to 64 characters. 
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set A string used to ensure the idempotency of the request. Generate a value based on your client. This can ensure that the value is unique for different requests. It only supports ASCII characters and can contain up to 64 characters. 
     * @param ClientToken A string used to ensure the idempotency of the request. Generate a value based on your client. This can ensure that the value is unique for different requests. It only supports ASCII characters and can contain up to 64 characters. 
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    public AllocateAddressesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AllocateAddressesRequest(AllocateAddressesRequest source) {
        if (source.AddressCount != null) {
            this.AddressCount = new Long(source.AddressCount);
        }
        if (source.InternetServiceProvider != null) {
            this.InternetServiceProvider = new String(source.InternetServiceProvider);
        }
        if (source.InternetChargeType != null) {
            this.InternetChargeType = new String(source.InternetChargeType);
        }
        if (source.InternetMaxBandwidthOut != null) {
            this.InternetMaxBandwidthOut = new Long(source.InternetMaxBandwidthOut);
        }
        if (source.AddressChargePrepaid != null) {
            this.AddressChargePrepaid = new AddressChargePrepaid(source.AddressChargePrepaid);
        }
        if (source.AddressType != null) {
            this.AddressType = new String(source.AddressType);
        }
        if (source.AnycastZone != null) {
            this.AnycastZone = new String(source.AnycastZone);
        }
        if (source.ApplicableForCLB != null) {
            this.ApplicableForCLB = new Boolean(source.ApplicableForCLB);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.BandwidthPackageId != null) {
            this.BandwidthPackageId = new String(source.BandwidthPackageId);
        }
        if (source.AddressName != null) {
            this.AddressName = new String(source.AddressName);
        }
        if (source.Egress != null) {
            this.Egress = new String(source.Egress);
        }
        if (source.AntiDDoSPackageId != null) {
            this.AntiDDoSPackageId = new String(source.AntiDDoSPackageId);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddressCount", this.AddressCount);
        this.setParamSimple(map, prefix + "InternetServiceProvider", this.InternetServiceProvider);
        this.setParamSimple(map, prefix + "InternetChargeType", this.InternetChargeType);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamObj(map, prefix + "AddressChargePrepaid.", this.AddressChargePrepaid);
        this.setParamSimple(map, prefix + "AddressType", this.AddressType);
        this.setParamSimple(map, prefix + "AnycastZone", this.AnycastZone);
        this.setParamSimple(map, prefix + "ApplicableForCLB", this.ApplicableForCLB);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "BandwidthPackageId", this.BandwidthPackageId);
        this.setParamSimple(map, prefix + "AddressName", this.AddressName);
        this.setParamSimple(map, prefix + "Egress", this.Egress);
        this.setParamSimple(map, prefix + "AntiDDoSPackageId", this.AntiDDoSPackageId);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);

    }
}


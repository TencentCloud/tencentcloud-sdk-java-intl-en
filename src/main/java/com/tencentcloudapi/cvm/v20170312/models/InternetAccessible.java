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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InternetAccessible extends AbstractModel {

    /**
    * Network connection billing plan. Valid value:

<li>TRAFFIC_POSTPAID_BY_HOUR: pay after use. You are billed for your traffic, by the hour. </li>
<li>BANDWIDTH_PACKAGE: Bandwidth package user. </li>
    */
    @SerializedName("InternetChargeType")
    @Expose
    private String InternetChargeType;

    /**
    * The maximum outbound bandwidth of the public network, in Mbps. The default value is 0 Mbps. The upper limit of bandwidth varies for different models. For more information, see [Purchase Network Bandwidth](https://intl.cloud.tencent.com/document/product/213/12523?from_cn_redirect=1).
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * Whether to allocate a public IP address. Valid values:<br><li>true: Allocate a public IP address.</li><li>false: Do not allocate a public IP address.</li><br>When the public network bandwidth is greater than 0 Mbps, you can choose whether to enable the public IP address. The public IP address is enabled by default. When the public network bandwidth is 0, allocating the public IP address is not supported. This parameter is only used as an input parameter in the RunInstances API.
    */
    @SerializedName("PublicIpAssigned")
    @Expose
    private Boolean PublicIpAssigned;

    /**
    * Bandwidth package ID. it can be obtained through the `BandwidthPackageId` in the return value from the DescribeBandwidthPackages api. this parameter is used as an input parameter only in the RunInstances api.
    */
    @SerializedName("BandwidthPackageId")
    @Expose
    private String BandwidthPackageId;

    /**
    * Line type. for details on various types of lines and supported regions, refer to [EIP IP address types](https://www.tencentcloud.comom/document/product/1199/41646?from_cn_redirect=1). default value: BGP.
<Li>BGP: specifies the general bgp line.</li>.
For a user with static single-line IP allowlist enabled, valid values include:.
<Li>CMCC: china mobile.</li>.
<Li>CTCC: china telecom</li>.
<Li>CUCC: china unicom</li>.
Note: The static single-line IP is only supported in some regions.


    */
    @SerializedName("InternetServiceProvider")
    @Expose
    private String InternetServiceProvider;

    /**
    * Specifies the public IP type.

<Li>WanIP: specifies the public ip address.</li>.
<Li>HighQualityEIP: specifies a high quality ip. high quality ip is only supported in Singapore and hong kong (china).</li>.
<li> AntiDDoSEIP: specifies the anti-ddos eip. only partial regions support anti-ddos eip. details visible in the [elastic IP product overview](https://www.tencentcloud.comom/document/product/1199/41646?from_cn_redirect=1).</li>.
If needed, assign a public IPv4 address to the resource by specifying the IPv4 address type.

This feature is in beta test in selected regions. submit a ticket for consultation (https://console.cloud.tencent.com/workorder/category) if needed.
    */
    @SerializedName("IPv4AddressType")
    @Expose
    private String IPv4AddressType;

    /**
    * Indicates the type of elastic public IPv6.
<Li>EIPv6: elastic ip version 6.</li>.
<Li>HighQualityEIPv6: specifies the high quality ipv6. highqualityeipv6 is only supported in hong kong (china).</li>.
If needed, assign an elastic IPv6 address for resource allocation.

This feature is in beta test in selected regions. submit a ticket for consultation (https://console.cloud.tencent.com/workorder/category) if needed.
    */
    @SerializedName("IPv6AddressType")
    @Expose
    private String IPv6AddressType;

    /**
    * DDoS protection package unique ID. this field is required when applying for a ddos protection IP.

    */
    @SerializedName("AntiDDoSPackageId")
    @Expose
    private String AntiDDoSPackageId;

    /**
     * Get Network connection billing plan. Valid value:

<li>TRAFFIC_POSTPAID_BY_HOUR: pay after use. You are billed for your traffic, by the hour. </li>
<li>BANDWIDTH_PACKAGE: Bandwidth package user. </li> 
     * @return InternetChargeType Network connection billing plan. Valid value:

<li>TRAFFIC_POSTPAID_BY_HOUR: pay after use. You are billed for your traffic, by the hour. </li>
<li>BANDWIDTH_PACKAGE: Bandwidth package user. </li>
     */
    public String getInternetChargeType() {
        return this.InternetChargeType;
    }

    /**
     * Set Network connection billing plan. Valid value:

<li>TRAFFIC_POSTPAID_BY_HOUR: pay after use. You are billed for your traffic, by the hour. </li>
<li>BANDWIDTH_PACKAGE: Bandwidth package user. </li>
     * @param InternetChargeType Network connection billing plan. Valid value:

<li>TRAFFIC_POSTPAID_BY_HOUR: pay after use. You are billed for your traffic, by the hour. </li>
<li>BANDWIDTH_PACKAGE: Bandwidth package user. </li>
     */
    public void setInternetChargeType(String InternetChargeType) {
        this.InternetChargeType = InternetChargeType;
    }

    /**
     * Get The maximum outbound bandwidth of the public network, in Mbps. The default value is 0 Mbps. The upper limit of bandwidth varies for different models. For more information, see [Purchase Network Bandwidth](https://intl.cloud.tencent.com/document/product/213/12523?from_cn_redirect=1). 
     * @return InternetMaxBandwidthOut The maximum outbound bandwidth of the public network, in Mbps. The default value is 0 Mbps. The upper limit of bandwidth varies for different models. For more information, see [Purchase Network Bandwidth](https://intl.cloud.tencent.com/document/product/213/12523?from_cn_redirect=1).
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set The maximum outbound bandwidth of the public network, in Mbps. The default value is 0 Mbps. The upper limit of bandwidth varies for different models. For more information, see [Purchase Network Bandwidth](https://intl.cloud.tencent.com/document/product/213/12523?from_cn_redirect=1).
     * @param InternetMaxBandwidthOut The maximum outbound bandwidth of the public network, in Mbps. The default value is 0 Mbps. The upper limit of bandwidth varies for different models. For more information, see [Purchase Network Bandwidth](https://intl.cloud.tencent.com/document/product/213/12523?from_cn_redirect=1).
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get Whether to allocate a public IP address. Valid values:<br><li>true: Allocate a public IP address.</li><li>false: Do not allocate a public IP address.</li><br>When the public network bandwidth is greater than 0 Mbps, you can choose whether to enable the public IP address. The public IP address is enabled by default. When the public network bandwidth is 0, allocating the public IP address is not supported. This parameter is only used as an input parameter in the RunInstances API. 
     * @return PublicIpAssigned Whether to allocate a public IP address. Valid values:<br><li>true: Allocate a public IP address.</li><li>false: Do not allocate a public IP address.</li><br>When the public network bandwidth is greater than 0 Mbps, you can choose whether to enable the public IP address. The public IP address is enabled by default. When the public network bandwidth is 0, allocating the public IP address is not supported. This parameter is only used as an input parameter in the RunInstances API.
     */
    public Boolean getPublicIpAssigned() {
        return this.PublicIpAssigned;
    }

    /**
     * Set Whether to allocate a public IP address. Valid values:<br><li>true: Allocate a public IP address.</li><li>false: Do not allocate a public IP address.</li><br>When the public network bandwidth is greater than 0 Mbps, you can choose whether to enable the public IP address. The public IP address is enabled by default. When the public network bandwidth is 0, allocating the public IP address is not supported. This parameter is only used as an input parameter in the RunInstances API.
     * @param PublicIpAssigned Whether to allocate a public IP address. Valid values:<br><li>true: Allocate a public IP address.</li><li>false: Do not allocate a public IP address.</li><br>When the public network bandwidth is greater than 0 Mbps, you can choose whether to enable the public IP address. The public IP address is enabled by default. When the public network bandwidth is 0, allocating the public IP address is not supported. This parameter is only used as an input parameter in the RunInstances API.
     */
    public void setPublicIpAssigned(Boolean PublicIpAssigned) {
        this.PublicIpAssigned = PublicIpAssigned;
    }

    /**
     * Get Bandwidth package ID. it can be obtained through the `BandwidthPackageId` in the return value from the DescribeBandwidthPackages api. this parameter is used as an input parameter only in the RunInstances api. 
     * @return BandwidthPackageId Bandwidth package ID. it can be obtained through the `BandwidthPackageId` in the return value from the DescribeBandwidthPackages api. this parameter is used as an input parameter only in the RunInstances api.
     */
    public String getBandwidthPackageId() {
        return this.BandwidthPackageId;
    }

    /**
     * Set Bandwidth package ID. it can be obtained through the `BandwidthPackageId` in the return value from the DescribeBandwidthPackages api. this parameter is used as an input parameter only in the RunInstances api.
     * @param BandwidthPackageId Bandwidth package ID. it can be obtained through the `BandwidthPackageId` in the return value from the DescribeBandwidthPackages api. this parameter is used as an input parameter only in the RunInstances api.
     */
    public void setBandwidthPackageId(String BandwidthPackageId) {
        this.BandwidthPackageId = BandwidthPackageId;
    }

    /**
     * Get Line type. for details on various types of lines and supported regions, refer to [EIP IP address types](https://www.tencentcloud.comom/document/product/1199/41646?from_cn_redirect=1). default value: BGP.
<Li>BGP: specifies the general bgp line.</li>.
For a user with static single-line IP allowlist enabled, valid values include:.
<Li>CMCC: china mobile.</li>.
<Li>CTCC: china telecom</li>.
<Li>CUCC: china unicom</li>.
Note: The static single-line IP is only supported in some regions.

 
     * @return InternetServiceProvider Line type. for details on various types of lines and supported regions, refer to [EIP IP address types](https://www.tencentcloud.comom/document/product/1199/41646?from_cn_redirect=1). default value: BGP.
<Li>BGP: specifies the general bgp line.</li>.
For a user with static single-line IP allowlist enabled, valid values include:.
<Li>CMCC: china mobile.</li>.
<Li>CTCC: china telecom</li>.
<Li>CUCC: china unicom</li>.
Note: The static single-line IP is only supported in some regions.


     */
    public String getInternetServiceProvider() {
        return this.InternetServiceProvider;
    }

    /**
     * Set Line type. for details on various types of lines and supported regions, refer to [EIP IP address types](https://www.tencentcloud.comom/document/product/1199/41646?from_cn_redirect=1). default value: BGP.
<Li>BGP: specifies the general bgp line.</li>.
For a user with static single-line IP allowlist enabled, valid values include:.
<Li>CMCC: china mobile.</li>.
<Li>CTCC: china telecom</li>.
<Li>CUCC: china unicom</li>.
Note: The static single-line IP is only supported in some regions.


     * @param InternetServiceProvider Line type. for details on various types of lines and supported regions, refer to [EIP IP address types](https://www.tencentcloud.comom/document/product/1199/41646?from_cn_redirect=1). default value: BGP.
<Li>BGP: specifies the general bgp line.</li>.
For a user with static single-line IP allowlist enabled, valid values include:.
<Li>CMCC: china mobile.</li>.
<Li>CTCC: china telecom</li>.
<Li>CUCC: china unicom</li>.
Note: The static single-line IP is only supported in some regions.


     */
    public void setInternetServiceProvider(String InternetServiceProvider) {
        this.InternetServiceProvider = InternetServiceProvider;
    }

    /**
     * Get Specifies the public IP type.

<Li>WanIP: specifies the public ip address.</li>.
<Li>HighQualityEIP: specifies a high quality ip. high quality ip is only supported in Singapore and hong kong (china).</li>.
<li> AntiDDoSEIP: specifies the anti-ddos eip. only partial regions support anti-ddos eip. details visible in the [elastic IP product overview](https://www.tencentcloud.comom/document/product/1199/41646?from_cn_redirect=1).</li>.
If needed, assign a public IPv4 address to the resource by specifying the IPv4 address type.

This feature is in beta test in selected regions. submit a ticket for consultation (https://console.cloud.tencent.com/workorder/category) if needed. 
     * @return IPv4AddressType Specifies the public IP type.

<Li>WanIP: specifies the public ip address.</li>.
<Li>HighQualityEIP: specifies a high quality ip. high quality ip is only supported in Singapore and hong kong (china).</li>.
<li> AntiDDoSEIP: specifies the anti-ddos eip. only partial regions support anti-ddos eip. details visible in the [elastic IP product overview](https://www.tencentcloud.comom/document/product/1199/41646?from_cn_redirect=1).</li>.
If needed, assign a public IPv4 address to the resource by specifying the IPv4 address type.

This feature is in beta test in selected regions. submit a ticket for consultation (https://console.cloud.tencent.com/workorder/category) if needed.
     */
    public String getIPv4AddressType() {
        return this.IPv4AddressType;
    }

    /**
     * Set Specifies the public IP type.

<Li>WanIP: specifies the public ip address.</li>.
<Li>HighQualityEIP: specifies a high quality ip. high quality ip is only supported in Singapore and hong kong (china).</li>.
<li> AntiDDoSEIP: specifies the anti-ddos eip. only partial regions support anti-ddos eip. details visible in the [elastic IP product overview](https://www.tencentcloud.comom/document/product/1199/41646?from_cn_redirect=1).</li>.
If needed, assign a public IPv4 address to the resource by specifying the IPv4 address type.

This feature is in beta test in selected regions. submit a ticket for consultation (https://console.cloud.tencent.com/workorder/category) if needed.
     * @param IPv4AddressType Specifies the public IP type.

<Li>WanIP: specifies the public ip address.</li>.
<Li>HighQualityEIP: specifies a high quality ip. high quality ip is only supported in Singapore and hong kong (china).</li>.
<li> AntiDDoSEIP: specifies the anti-ddos eip. only partial regions support anti-ddos eip. details visible in the [elastic IP product overview](https://www.tencentcloud.comom/document/product/1199/41646?from_cn_redirect=1).</li>.
If needed, assign a public IPv4 address to the resource by specifying the IPv4 address type.

This feature is in beta test in selected regions. submit a ticket for consultation (https://console.cloud.tencent.com/workorder/category) if needed.
     */
    public void setIPv4AddressType(String IPv4AddressType) {
        this.IPv4AddressType = IPv4AddressType;
    }

    /**
     * Get Indicates the type of elastic public IPv6.
<Li>EIPv6: elastic ip version 6.</li>.
<Li>HighQualityEIPv6: specifies the high quality ipv6. highqualityeipv6 is only supported in hong kong (china).</li>.
If needed, assign an elastic IPv6 address for resource allocation.

This feature is in beta test in selected regions. submit a ticket for consultation (https://console.cloud.tencent.com/workorder/category) if needed. 
     * @return IPv6AddressType Indicates the type of elastic public IPv6.
<Li>EIPv6: elastic ip version 6.</li>.
<Li>HighQualityEIPv6: specifies the high quality ipv6. highqualityeipv6 is only supported in hong kong (china).</li>.
If needed, assign an elastic IPv6 address for resource allocation.

This feature is in beta test in selected regions. submit a ticket for consultation (https://console.cloud.tencent.com/workorder/category) if needed.
     */
    public String getIPv6AddressType() {
        return this.IPv6AddressType;
    }

    /**
     * Set Indicates the type of elastic public IPv6.
<Li>EIPv6: elastic ip version 6.</li>.
<Li>HighQualityEIPv6: specifies the high quality ipv6. highqualityeipv6 is only supported in hong kong (china).</li>.
If needed, assign an elastic IPv6 address for resource allocation.

This feature is in beta test in selected regions. submit a ticket for consultation (https://console.cloud.tencent.com/workorder/category) if needed.
     * @param IPv6AddressType Indicates the type of elastic public IPv6.
<Li>EIPv6: elastic ip version 6.</li>.
<Li>HighQualityEIPv6: specifies the high quality ipv6. highqualityeipv6 is only supported in hong kong (china).</li>.
If needed, assign an elastic IPv6 address for resource allocation.

This feature is in beta test in selected regions. submit a ticket for consultation (https://console.cloud.tencent.com/workorder/category) if needed.
     */
    public void setIPv6AddressType(String IPv6AddressType) {
        this.IPv6AddressType = IPv6AddressType;
    }

    /**
     * Get DDoS protection package unique ID. this field is required when applying for a ddos protection IP.
 
     * @return AntiDDoSPackageId DDoS protection package unique ID. this field is required when applying for a ddos protection IP.

     */
    public String getAntiDDoSPackageId() {
        return this.AntiDDoSPackageId;
    }

    /**
     * Set DDoS protection package unique ID. this field is required when applying for a ddos protection IP.

     * @param AntiDDoSPackageId DDoS protection package unique ID. this field is required when applying for a ddos protection IP.

     */
    public void setAntiDDoSPackageId(String AntiDDoSPackageId) {
        this.AntiDDoSPackageId = AntiDDoSPackageId;
    }

    public InternetAccessible() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InternetAccessible(InternetAccessible source) {
        if (source.InternetChargeType != null) {
            this.InternetChargeType = new String(source.InternetChargeType);
        }
        if (source.InternetMaxBandwidthOut != null) {
            this.InternetMaxBandwidthOut = new Long(source.InternetMaxBandwidthOut);
        }
        if (source.PublicIpAssigned != null) {
            this.PublicIpAssigned = new Boolean(source.PublicIpAssigned);
        }
        if (source.BandwidthPackageId != null) {
            this.BandwidthPackageId = new String(source.BandwidthPackageId);
        }
        if (source.InternetServiceProvider != null) {
            this.InternetServiceProvider = new String(source.InternetServiceProvider);
        }
        if (source.IPv4AddressType != null) {
            this.IPv4AddressType = new String(source.IPv4AddressType);
        }
        if (source.IPv6AddressType != null) {
            this.IPv6AddressType = new String(source.IPv6AddressType);
        }
        if (source.AntiDDoSPackageId != null) {
            this.AntiDDoSPackageId = new String(source.AntiDDoSPackageId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InternetChargeType", this.InternetChargeType);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamSimple(map, prefix + "PublicIpAssigned", this.PublicIpAssigned);
        this.setParamSimple(map, prefix + "BandwidthPackageId", this.BandwidthPackageId);
        this.setParamSimple(map, prefix + "InternetServiceProvider", this.InternetServiceProvider);
        this.setParamSimple(map, prefix + "IPv4AddressType", this.IPv4AddressType);
        this.setParamSimple(map, prefix + "IPv6AddressType", this.IPv6AddressType);
        this.setParamSimple(map, prefix + "AntiDDoSPackageId", this.AntiDDoSPackageId);

    }
}


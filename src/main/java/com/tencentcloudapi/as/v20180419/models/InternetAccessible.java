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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InternetAccessible extends AbstractModel {

    /**
    * Network billing type. Valid values: <li>BANDWIDTH_PREPAID: prepaid by bandwidth;</li> <li>TRAFFIC_POSTPAID_BY_HOUR: postpaid by traffic per hour;</li> <li>BANDWIDTH_POSTPAID_BY_HOUR: postpaid by bandwidth per hour;</li> <li>BANDWIDTH_PACKAGE: bandwidth package users.</li> Default value: TRAFFIC_POSTPAID_BY_HOUR.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InternetChargeType")
    @Expose
    private String InternetChargeType;

    /**
    * The maximum outbound bandwidth in Mbps of the public network. The default value is 0 Mbps. The upper limit of bandwidth varies by model. For more information, see [Purchase Network Bandwidth](https://intl.cloud.tencent.com/document/product/213/509?from_cn_redirect=1).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * Whether to assign a public IP address. Valid values: <li>TRUE: Allocate a public IP address.</li> <li>FALSE: Do not allocate a public IP address.</li> When the public network bandwidth is greater than 0 Mbps, you can choose whether to enable this feature based on your needs. By default, this feature is enabled. When the public network bandwidth is 0, public IP address assignment is not allowed.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PublicIpAssigned")
    @Expose
    private Boolean PublicIpAssigned;

    /**
    * Bandwidth package ID. You can obtain the ID from the `BandwidthPackageId` field in the response of the [DescribeBandwidthPackages](https://intl.cloud.tencent.com/document/api/215/19209?from_cn_redirect=1) API.
Note: this field may return null, indicating that no valid value was found.
    */
    @SerializedName("BandwidthPackageId")
    @Expose
    private String BandwidthPackageId;

    /**
    * Describes the line type. For details, refer to [EIP Product Overview](https://intl.cloud.tencent.com/document/product/1199/41646?from_cn_redirect=1). default value: `BGP`.

<Li>BGP: general bgp line.</li>
For a user who has enabled the static single-line IP allowlist, valid values include:
 <li>CMCC: China Mobile</li> <li>CTCC: China Telecom</li> <li>CUCC: China Unicom</li>
Note: Only certain regions support static single-line IP addresses.


    */
    @SerializedName("InternetServiceProvider")
    @Expose
    private String InternetServiceProvider;

    /**
    * Type of public IP address.

<li> WanIP: Ordinary public IP address. </li> <li> HighQualityEIP: High Quality EIP is supported only in Singapore and Hong Kong. </li> <li> AntiDDoSEIP: Anti-DDoS IP is supported only in specific regions. For details, see [EIP Product Overview](https://cloud.tencent.com/document/product/1199/41646). </li> Specify the type of public IPv4 address to assign a public IPv4 address to the resource. Premium IP and Anti-DDoS IP features are gradually released in select regions. For usage, [submit a ticket for consultation](https://console.cloud.tencent.com/workorder/category).
    */
    @SerializedName("IPv4AddressType")
    @Expose
    private String IPv4AddressType;

    /**
    * Anti-DDoS service package ID. This is required when you want to request an Anti-DDoS IP.
    */
    @SerializedName("AntiDDoSPackageId")
    @Expose
    private String AntiDDoSPackageId;

    /**
    * Whether to delete the bound EIP when the instance is destroyed.

Range of values:

<li>TRUE: retain the EIP</li> <li>FALSE: not retain the EIP</li>

Note that when the IPv4AddressType field specifies the EIP type, the default behavior is not to retain the EIP. 
WanIP is unaffected by this field and will always be deleted with the instance. 
Changing this field configuration will take effect immediately for resources already bound to a scaling group.
    */
    @SerializedName("IsKeepEIP")
    @Expose
    private Boolean IsKeepEIP;

    /**
     * Get Network billing type. Valid values: <li>BANDWIDTH_PREPAID: prepaid by bandwidth;</li> <li>TRAFFIC_POSTPAID_BY_HOUR: postpaid by traffic per hour;</li> <li>BANDWIDTH_POSTPAID_BY_HOUR: postpaid by bandwidth per hour;</li> <li>BANDWIDTH_PACKAGE: bandwidth package users.</li> Default value: TRAFFIC_POSTPAID_BY_HOUR.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InternetChargeType Network billing type. Valid values: <li>BANDWIDTH_PREPAID: prepaid by bandwidth;</li> <li>TRAFFIC_POSTPAID_BY_HOUR: postpaid by traffic per hour;</li> <li>BANDWIDTH_POSTPAID_BY_HOUR: postpaid by bandwidth per hour;</li> <li>BANDWIDTH_PACKAGE: bandwidth package users.</li> Default value: TRAFFIC_POSTPAID_BY_HOUR.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInternetChargeType() {
        return this.InternetChargeType;
    }

    /**
     * Set Network billing type. Valid values: <li>BANDWIDTH_PREPAID: prepaid by bandwidth;</li> <li>TRAFFIC_POSTPAID_BY_HOUR: postpaid by traffic per hour;</li> <li>BANDWIDTH_POSTPAID_BY_HOUR: postpaid by bandwidth per hour;</li> <li>BANDWIDTH_PACKAGE: bandwidth package users.</li> Default value: TRAFFIC_POSTPAID_BY_HOUR.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InternetChargeType Network billing type. Valid values: <li>BANDWIDTH_PREPAID: prepaid by bandwidth;</li> <li>TRAFFIC_POSTPAID_BY_HOUR: postpaid by traffic per hour;</li> <li>BANDWIDTH_POSTPAID_BY_HOUR: postpaid by bandwidth per hour;</li> <li>BANDWIDTH_PACKAGE: bandwidth package users.</li> Default value: TRAFFIC_POSTPAID_BY_HOUR.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInternetChargeType(String InternetChargeType) {
        this.InternetChargeType = InternetChargeType;
    }

    /**
     * Get The maximum outbound bandwidth in Mbps of the public network. The default value is 0 Mbps. The upper limit of bandwidth varies by model. For more information, see [Purchase Network Bandwidth](https://intl.cloud.tencent.com/document/product/213/509?from_cn_redirect=1).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InternetMaxBandwidthOut The maximum outbound bandwidth in Mbps of the public network. The default value is 0 Mbps. The upper limit of bandwidth varies by model. For more information, see [Purchase Network Bandwidth](https://intl.cloud.tencent.com/document/product/213/509?from_cn_redirect=1).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set The maximum outbound bandwidth in Mbps of the public network. The default value is 0 Mbps. The upper limit of bandwidth varies by model. For more information, see [Purchase Network Bandwidth](https://intl.cloud.tencent.com/document/product/213/509?from_cn_redirect=1).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InternetMaxBandwidthOut The maximum outbound bandwidth in Mbps of the public network. The default value is 0 Mbps. The upper limit of bandwidth varies by model. For more information, see [Purchase Network Bandwidth](https://intl.cloud.tencent.com/document/product/213/509?from_cn_redirect=1).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get Whether to assign a public IP address. Valid values: <li>TRUE: Allocate a public IP address.</li> <li>FALSE: Do not allocate a public IP address.</li> When the public network bandwidth is greater than 0 Mbps, you can choose whether to enable this feature based on your needs. By default, this feature is enabled. When the public network bandwidth is 0, public IP address assignment is not allowed.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PublicIpAssigned Whether to assign a public IP address. Valid values: <li>TRUE: Allocate a public IP address.</li> <li>FALSE: Do not allocate a public IP address.</li> When the public network bandwidth is greater than 0 Mbps, you can choose whether to enable this feature based on your needs. By default, this feature is enabled. When the public network bandwidth is 0, public IP address assignment is not allowed.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getPublicIpAssigned() {
        return this.PublicIpAssigned;
    }

    /**
     * Set Whether to assign a public IP address. Valid values: <li>TRUE: Allocate a public IP address.</li> <li>FALSE: Do not allocate a public IP address.</li> When the public network bandwidth is greater than 0 Mbps, you can choose whether to enable this feature based on your needs. By default, this feature is enabled. When the public network bandwidth is 0, public IP address assignment is not allowed.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PublicIpAssigned Whether to assign a public IP address. Valid values: <li>TRUE: Allocate a public IP address.</li> <li>FALSE: Do not allocate a public IP address.</li> When the public network bandwidth is greater than 0 Mbps, you can choose whether to enable this feature based on your needs. By default, this feature is enabled. When the public network bandwidth is 0, public IP address assignment is not allowed.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPublicIpAssigned(Boolean PublicIpAssigned) {
        this.PublicIpAssigned = PublicIpAssigned;
    }

    /**
     * Get Bandwidth package ID. You can obtain the ID from the `BandwidthPackageId` field in the response of the [DescribeBandwidthPackages](https://intl.cloud.tencent.com/document/api/215/19209?from_cn_redirect=1) API.
Note: this field may return null, indicating that no valid value was found. 
     * @return BandwidthPackageId Bandwidth package ID. You can obtain the ID from the `BandwidthPackageId` field in the response of the [DescribeBandwidthPackages](https://intl.cloud.tencent.com/document/api/215/19209?from_cn_redirect=1) API.
Note: this field may return null, indicating that no valid value was found.
     */
    public String getBandwidthPackageId() {
        return this.BandwidthPackageId;
    }

    /**
     * Set Bandwidth package ID. You can obtain the ID from the `BandwidthPackageId` field in the response of the [DescribeBandwidthPackages](https://intl.cloud.tencent.com/document/api/215/19209?from_cn_redirect=1) API.
Note: this field may return null, indicating that no valid value was found.
     * @param BandwidthPackageId Bandwidth package ID. You can obtain the ID from the `BandwidthPackageId` field in the response of the [DescribeBandwidthPackages](https://intl.cloud.tencent.com/document/api/215/19209?from_cn_redirect=1) API.
Note: this field may return null, indicating that no valid value was found.
     */
    public void setBandwidthPackageId(String BandwidthPackageId) {
        this.BandwidthPackageId = BandwidthPackageId;
    }

    /**
     * Get Describes the line type. For details, refer to [EIP Product Overview](https://intl.cloud.tencent.com/document/product/1199/41646?from_cn_redirect=1). default value: `BGP`.

<Li>BGP: general bgp line.</li>
For a user who has enabled the static single-line IP allowlist, valid values include:
 <li>CMCC: China Mobile</li> <li>CTCC: China Telecom</li> <li>CUCC: China Unicom</li>
Note: Only certain regions support static single-line IP addresses.

 
     * @return InternetServiceProvider Describes the line type. For details, refer to [EIP Product Overview](https://intl.cloud.tencent.com/document/product/1199/41646?from_cn_redirect=1). default value: `BGP`.

<Li>BGP: general bgp line.</li>
For a user who has enabled the static single-line IP allowlist, valid values include:
 <li>CMCC: China Mobile</li> <li>CTCC: China Telecom</li> <li>CUCC: China Unicom</li>
Note: Only certain regions support static single-line IP addresses.


     */
    public String getInternetServiceProvider() {
        return this.InternetServiceProvider;
    }

    /**
     * Set Describes the line type. For details, refer to [EIP Product Overview](https://intl.cloud.tencent.com/document/product/1199/41646?from_cn_redirect=1). default value: `BGP`.

<Li>BGP: general bgp line.</li>
For a user who has enabled the static single-line IP allowlist, valid values include:
 <li>CMCC: China Mobile</li> <li>CTCC: China Telecom</li> <li>CUCC: China Unicom</li>
Note: Only certain regions support static single-line IP addresses.


     * @param InternetServiceProvider Describes the line type. For details, refer to [EIP Product Overview](https://intl.cloud.tencent.com/document/product/1199/41646?from_cn_redirect=1). default value: `BGP`.

<Li>BGP: general bgp line.</li>
For a user who has enabled the static single-line IP allowlist, valid values include:
 <li>CMCC: China Mobile</li> <li>CTCC: China Telecom</li> <li>CUCC: China Unicom</li>
Note: Only certain regions support static single-line IP addresses.


     */
    public void setInternetServiceProvider(String InternetServiceProvider) {
        this.InternetServiceProvider = InternetServiceProvider;
    }

    /**
     * Get Type of public IP address.

<li> WanIP: Ordinary public IP address. </li> <li> HighQualityEIP: High Quality EIP is supported only in Singapore and Hong Kong. </li> <li> AntiDDoSEIP: Anti-DDoS IP is supported only in specific regions. For details, see [EIP Product Overview](https://cloud.tencent.com/document/product/1199/41646). </li> Specify the type of public IPv4 address to assign a public IPv4 address to the resource. Premium IP and Anti-DDoS IP features are gradually released in select regions. For usage, [submit a ticket for consultation](https://console.cloud.tencent.com/workorder/category). 
     * @return IPv4AddressType Type of public IP address.

<li> WanIP: Ordinary public IP address. </li> <li> HighQualityEIP: High Quality EIP is supported only in Singapore and Hong Kong. </li> <li> AntiDDoSEIP: Anti-DDoS IP is supported only in specific regions. For details, see [EIP Product Overview](https://cloud.tencent.com/document/product/1199/41646). </li> Specify the type of public IPv4 address to assign a public IPv4 address to the resource. Premium IP and Anti-DDoS IP features are gradually released in select regions. For usage, [submit a ticket for consultation](https://console.cloud.tencent.com/workorder/category).
     */
    public String getIPv4AddressType() {
        return this.IPv4AddressType;
    }

    /**
     * Set Type of public IP address.

<li> WanIP: Ordinary public IP address. </li> <li> HighQualityEIP: High Quality EIP is supported only in Singapore and Hong Kong. </li> <li> AntiDDoSEIP: Anti-DDoS IP is supported only in specific regions. For details, see [EIP Product Overview](https://cloud.tencent.com/document/product/1199/41646). </li> Specify the type of public IPv4 address to assign a public IPv4 address to the resource. Premium IP and Anti-DDoS IP features are gradually released in select regions. For usage, [submit a ticket for consultation](https://console.cloud.tencent.com/workorder/category).
     * @param IPv4AddressType Type of public IP address.

<li> WanIP: Ordinary public IP address. </li> <li> HighQualityEIP: High Quality EIP is supported only in Singapore and Hong Kong. </li> <li> AntiDDoSEIP: Anti-DDoS IP is supported only in specific regions. For details, see [EIP Product Overview](https://cloud.tencent.com/document/product/1199/41646). </li> Specify the type of public IPv4 address to assign a public IPv4 address to the resource. Premium IP and Anti-DDoS IP features are gradually released in select regions. For usage, [submit a ticket for consultation](https://console.cloud.tencent.com/workorder/category).
     */
    public void setIPv4AddressType(String IPv4AddressType) {
        this.IPv4AddressType = IPv4AddressType;
    }

    /**
     * Get Anti-DDoS service package ID. This is required when you want to request an Anti-DDoS IP. 
     * @return AntiDDoSPackageId Anti-DDoS service package ID. This is required when you want to request an Anti-DDoS IP.
     */
    public String getAntiDDoSPackageId() {
        return this.AntiDDoSPackageId;
    }

    /**
     * Set Anti-DDoS service package ID. This is required when you want to request an Anti-DDoS IP.
     * @param AntiDDoSPackageId Anti-DDoS service package ID. This is required when you want to request an Anti-DDoS IP.
     */
    public void setAntiDDoSPackageId(String AntiDDoSPackageId) {
        this.AntiDDoSPackageId = AntiDDoSPackageId;
    }

    /**
     * Get Whether to delete the bound EIP when the instance is destroyed.

Range of values:

<li>TRUE: retain the EIP</li> <li>FALSE: not retain the EIP</li>

Note that when the IPv4AddressType field specifies the EIP type, the default behavior is not to retain the EIP. 
WanIP is unaffected by this field and will always be deleted with the instance. 
Changing this field configuration will take effect immediately for resources already bound to a scaling group. 
     * @return IsKeepEIP Whether to delete the bound EIP when the instance is destroyed.

Range of values:

<li>TRUE: retain the EIP</li> <li>FALSE: not retain the EIP</li>

Note that when the IPv4AddressType field specifies the EIP type, the default behavior is not to retain the EIP. 
WanIP is unaffected by this field and will always be deleted with the instance. 
Changing this field configuration will take effect immediately for resources already bound to a scaling group.
     */
    public Boolean getIsKeepEIP() {
        return this.IsKeepEIP;
    }

    /**
     * Set Whether to delete the bound EIP when the instance is destroyed.

Range of values:

<li>TRUE: retain the EIP</li> <li>FALSE: not retain the EIP</li>

Note that when the IPv4AddressType field specifies the EIP type, the default behavior is not to retain the EIP. 
WanIP is unaffected by this field and will always be deleted with the instance. 
Changing this field configuration will take effect immediately for resources already bound to a scaling group.
     * @param IsKeepEIP Whether to delete the bound EIP when the instance is destroyed.

Range of values:

<li>TRUE: retain the EIP</li> <li>FALSE: not retain the EIP</li>

Note that when the IPv4AddressType field specifies the EIP type, the default behavior is not to retain the EIP. 
WanIP is unaffected by this field and will always be deleted with the instance. 
Changing this field configuration will take effect immediately for resources already bound to a scaling group.
     */
    public void setIsKeepEIP(Boolean IsKeepEIP) {
        this.IsKeepEIP = IsKeepEIP;
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
        if (source.AntiDDoSPackageId != null) {
            this.AntiDDoSPackageId = new String(source.AntiDDoSPackageId);
        }
        if (source.IsKeepEIP != null) {
            this.IsKeepEIP = new Boolean(source.IsKeepEIP);
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
        this.setParamSimple(map, prefix + "AntiDDoSPackageId", this.AntiDDoSPackageId);
        this.setParamSimple(map, prefix + "IsKeepEIP", this.IsKeepEIP);

    }
}


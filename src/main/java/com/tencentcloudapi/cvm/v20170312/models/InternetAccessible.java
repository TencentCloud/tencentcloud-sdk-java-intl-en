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
    * Network connection billing plan. Valid value: <br><li>TRAFFIC_POSTPAID_BY_HOUR: pay after use. You are billed for your traffic, by the hour.
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
    * The EIP line type. 
 <li>BGP Default: BGP</li>

For a user who has activated the static single-line IP allowlist, possible values are:

 <li>CMCC: China Mobile</li>
 <li>CTCC: China Telecom</li>
 <li>CUCC: China Unicom</li>

Note: Only certain regions support static single-line IP addresses.
    */
    @SerializedName("InternetServiceProvider")
    @Expose
    private String InternetServiceProvider;

    /**
    * AddressType. Default value: `WanIP`.

For beta users of dedicated IP, the value can be:
<li>HighQualityEIP: Dedicated IP</li>
Note that dedicated IPs are only available in partial regions.

For beta users of Anti-DDoS IP, the value can be:
<li>AntiDDoSEIP: Anti-DDoS EIP</li>
Note that Anti-DDoS IPs are only available in partial regions.

This feature is currently in gradually released phase. To access it, please contact us.
    */
    @SerializedName("IPv4AddressType")
    @Expose
    private String IPv4AddressType;

    /**
    * Indicates the type of EIPv6. Valid values:

<li>EIPv6: common IPv6</li>
<li>HighQualityEIPv6: dedicated IPv6</li>
Note: Contact the product team to enable the dedicated IPv6 allowlist. The dedicated IPv6 is only supported in some regions. 

Default: `EIPv6`

This feature is currently in gradually released phase. To access it, please contact us.
    */
    @SerializedName("IPv6AddressType")
    @Expose
    private String IPv6AddressType;

    /**
    * Anti-DDoS service package ID. This is required when you want to request an Anti-DDoS IP.
    */
    @SerializedName("AntiDDoSPackageId")
    @Expose
    private String AntiDDoSPackageId;

    /**
     * Get Network connection billing plan. Valid value: <br><li>TRAFFIC_POSTPAID_BY_HOUR: pay after use. You are billed for your traffic, by the hour. 
     * @return InternetChargeType Network connection billing plan. Valid value: <br><li>TRAFFIC_POSTPAID_BY_HOUR: pay after use. You are billed for your traffic, by the hour.
     */
    public String getInternetChargeType() {
        return this.InternetChargeType;
    }

    /**
     * Set Network connection billing plan. Valid value: <br><li>TRAFFIC_POSTPAID_BY_HOUR: pay after use. You are billed for your traffic, by the hour.
     * @param InternetChargeType Network connection billing plan. Valid value: <br><li>TRAFFIC_POSTPAID_BY_HOUR: pay after use. You are billed for your traffic, by the hour.
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
     * Get The EIP line type. 
 <li>BGP Default: BGP</li>

For a user who has activated the static single-line IP allowlist, possible values are:

 <li>CMCC: China Mobile</li>
 <li>CTCC: China Telecom</li>
 <li>CUCC: China Unicom</li>

Note: Only certain regions support static single-line IP addresses. 
     * @return InternetServiceProvider The EIP line type. 
 <li>BGP Default: BGP</li>

For a user who has activated the static single-line IP allowlist, possible values are:

 <li>CMCC: China Mobile</li>
 <li>CTCC: China Telecom</li>
 <li>CUCC: China Unicom</li>

Note: Only certain regions support static single-line IP addresses.
     */
    public String getInternetServiceProvider() {
        return this.InternetServiceProvider;
    }

    /**
     * Set The EIP line type. 
 <li>BGP Default: BGP</li>

For a user who has activated the static single-line IP allowlist, possible values are:

 <li>CMCC: China Mobile</li>
 <li>CTCC: China Telecom</li>
 <li>CUCC: China Unicom</li>

Note: Only certain regions support static single-line IP addresses.
     * @param InternetServiceProvider The EIP line type. 
 <li>BGP Default: BGP</li>

For a user who has activated the static single-line IP allowlist, possible values are:

 <li>CMCC: China Mobile</li>
 <li>CTCC: China Telecom</li>
 <li>CUCC: China Unicom</li>

Note: Only certain regions support static single-line IP addresses.
     */
    public void setInternetServiceProvider(String InternetServiceProvider) {
        this.InternetServiceProvider = InternetServiceProvider;
    }

    /**
     * Get AddressType. Default value: `WanIP`.

For beta users of dedicated IP, the value can be:
<li>HighQualityEIP: Dedicated IP</li>
Note that dedicated IPs are only available in partial regions.

For beta users of Anti-DDoS IP, the value can be:
<li>AntiDDoSEIP: Anti-DDoS EIP</li>
Note that Anti-DDoS IPs are only available in partial regions.

This feature is currently in gradually released phase. To access it, please contact us. 
     * @return IPv4AddressType AddressType. Default value: `WanIP`.

For beta users of dedicated IP, the value can be:
<li>HighQualityEIP: Dedicated IP</li>
Note that dedicated IPs are only available in partial regions.

For beta users of Anti-DDoS IP, the value can be:
<li>AntiDDoSEIP: Anti-DDoS EIP</li>
Note that Anti-DDoS IPs are only available in partial regions.

This feature is currently in gradually released phase. To access it, please contact us.
     */
    public String getIPv4AddressType() {
        return this.IPv4AddressType;
    }

    /**
     * Set AddressType. Default value: `WanIP`.

For beta users of dedicated IP, the value can be:
<li>HighQualityEIP: Dedicated IP</li>
Note that dedicated IPs are only available in partial regions.

For beta users of Anti-DDoS IP, the value can be:
<li>AntiDDoSEIP: Anti-DDoS EIP</li>
Note that Anti-DDoS IPs are only available in partial regions.

This feature is currently in gradually released phase. To access it, please contact us.
     * @param IPv4AddressType AddressType. Default value: `WanIP`.

For beta users of dedicated IP, the value can be:
<li>HighQualityEIP: Dedicated IP</li>
Note that dedicated IPs are only available in partial regions.

For beta users of Anti-DDoS IP, the value can be:
<li>AntiDDoSEIP: Anti-DDoS EIP</li>
Note that Anti-DDoS IPs are only available in partial regions.

This feature is currently in gradually released phase. To access it, please contact us.
     */
    public void setIPv4AddressType(String IPv4AddressType) {
        this.IPv4AddressType = IPv4AddressType;
    }

    /**
     * Get Indicates the type of EIPv6. Valid values:

<li>EIPv6: common IPv6</li>
<li>HighQualityEIPv6: dedicated IPv6</li>
Note: Contact the product team to enable the dedicated IPv6 allowlist. The dedicated IPv6 is only supported in some regions. 

Default: `EIPv6`

This feature is currently in gradually released phase. To access it, please contact us. 
     * @return IPv6AddressType Indicates the type of EIPv6. Valid values:

<li>EIPv6: common IPv6</li>
<li>HighQualityEIPv6: dedicated IPv6</li>
Note: Contact the product team to enable the dedicated IPv6 allowlist. The dedicated IPv6 is only supported in some regions. 

Default: `EIPv6`

This feature is currently in gradually released phase. To access it, please contact us.
     */
    public String getIPv6AddressType() {
        return this.IPv6AddressType;
    }

    /**
     * Set Indicates the type of EIPv6. Valid values:

<li>EIPv6: common IPv6</li>
<li>HighQualityEIPv6: dedicated IPv6</li>
Note: Contact the product team to enable the dedicated IPv6 allowlist. The dedicated IPv6 is only supported in some regions. 

Default: `EIPv6`

This feature is currently in gradually released phase. To access it, please contact us.
     * @param IPv6AddressType Indicates the type of EIPv6. Valid values:

<li>EIPv6: common IPv6</li>
<li>HighQualityEIPv6: dedicated IPv6</li>
Note: Contact the product team to enable the dedicated IPv6 allowlist. The dedicated IPv6 is only supported in some regions. 

Default: `EIPv6`

This feature is currently in gradually released phase. To access it, please contact us.
     */
    public void setIPv6AddressType(String IPv6AddressType) {
        this.IPv6AddressType = IPv6AddressType;
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


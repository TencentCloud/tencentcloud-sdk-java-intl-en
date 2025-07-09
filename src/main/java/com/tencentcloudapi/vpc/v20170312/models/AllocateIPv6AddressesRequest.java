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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AllocateIPv6AddressesRequest extends AbstractModel {

    /**
    * EIPv6 name, which is the custom EIPv6 name given by the user when the user applies for the EIPv6. Default: not named.
    */
    @SerializedName("AddressName")
    @Expose
    private String AddressName;

    /**
    * Indicates the type of EIPv6. Valid values:

- EIPv6: common IPv6
- HighQualityEIPv6: dedicated IPv6
Note: Contact the product team to enable the dedicated IPv6 allowlist. The dedicated IPv6 is only supported in some regions.

Default: EIPv6.
    */
    @SerializedName("AddressType")
    @Expose
    private String AddressType;

    /**
    * Number of applied EIPv6 addresses. Default: 1.
    */
    @SerializedName("AddressCount")
    @Expose
    private Long AddressCount;

    /**
    * Indicates the billing method of EIPv6. Valid values:

- BANDWIDTH_PACKAGE: billed by [Bandwidth Package](https://intl.cloud.tencent.com/document/product/684/15255?from_cn_redirect=1)
- TRAFFIC_POSTPAID_BY_HOUR: postpaid by traffic on an hourly basis

Default: TRAFFIC_POSTPAID_BY_HOUR.
    */
    @SerializedName("InternetChargeType")
    @Expose
    private String InternetChargeType;

    /**
    * Indicates the type of EIPv6 line. Default: BGP.

For a user who has enabled the static single-line IP allowlist, valid values include:
- CMCC: China Mobile
- CTCC: China Telecom
- CUCC: China Unicom
Note: The static single-line IP is only supported in some regions.
    */
    @SerializedName("InternetServiceProvider")
    @Expose
    private String InternetServiceProvider;

    /**
    * EIPv6 bandwidth cap, in Mbps.

Valid values depend on the EIP billing method:

- BANDWIDTH_PACKAGE: 1 Mbps to 2000 Mbps
- TRAFFIC_POSTPAID_BY_HOUR: 1 Mbps to 100 Mbps

Default: 1 Mbps.
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * Unique ID of the bandwidth package.
Setting this parameter and having InternetChargeType as BANDWIDTH_PACKAGE indicate that the created EIP will join this BGP bandwidth package and the billing method of bandwidth package will be adopted.
    */
    @SerializedName("BandwidthPackageId")
    @Expose
    private String BandwidthPackageId;

    /**
    * List of tags to be associated.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * EIPv6 network egress. Valid values:

- CENTER_EGRESS_1: Central egress point 1
- CENTER_EGRESS_2: Central egress point 2
- CENTER_EGRESS_3: Central egress point 3
Note: The network egress for different Internet Service Providers (ISPs) or resource types requires contacting the product team for enablement.

Default: CENTER_EGRESS_1.
    */
    @SerializedName("Egress")
    @Expose
    private String Egress;

    /**
     * Get EIPv6 name, which is the custom EIPv6 name given by the user when the user applies for the EIPv6. Default: not named. 
     * @return AddressName EIPv6 name, which is the custom EIPv6 name given by the user when the user applies for the EIPv6. Default: not named.
     */
    public String getAddressName() {
        return this.AddressName;
    }

    /**
     * Set EIPv6 name, which is the custom EIPv6 name given by the user when the user applies for the EIPv6. Default: not named.
     * @param AddressName EIPv6 name, which is the custom EIPv6 name given by the user when the user applies for the EIPv6. Default: not named.
     */
    public void setAddressName(String AddressName) {
        this.AddressName = AddressName;
    }

    /**
     * Get Indicates the type of EIPv6. Valid values:

- EIPv6: common IPv6
- HighQualityEIPv6: dedicated IPv6
Note: Contact the product team to enable the dedicated IPv6 allowlist. The dedicated IPv6 is only supported in some regions.

Default: EIPv6. 
     * @return AddressType Indicates the type of EIPv6. Valid values:

- EIPv6: common IPv6
- HighQualityEIPv6: dedicated IPv6
Note: Contact the product team to enable the dedicated IPv6 allowlist. The dedicated IPv6 is only supported in some regions.

Default: EIPv6.
     */
    public String getAddressType() {
        return this.AddressType;
    }

    /**
     * Set Indicates the type of EIPv6. Valid values:

- EIPv6: common IPv6
- HighQualityEIPv6: dedicated IPv6
Note: Contact the product team to enable the dedicated IPv6 allowlist. The dedicated IPv6 is only supported in some regions.

Default: EIPv6.
     * @param AddressType Indicates the type of EIPv6. Valid values:

- EIPv6: common IPv6
- HighQualityEIPv6: dedicated IPv6
Note: Contact the product team to enable the dedicated IPv6 allowlist. The dedicated IPv6 is only supported in some regions.

Default: EIPv6.
     */
    public void setAddressType(String AddressType) {
        this.AddressType = AddressType;
    }

    /**
     * Get Number of applied EIPv6 addresses. Default: 1. 
     * @return AddressCount Number of applied EIPv6 addresses. Default: 1.
     */
    public Long getAddressCount() {
        return this.AddressCount;
    }

    /**
     * Set Number of applied EIPv6 addresses. Default: 1.
     * @param AddressCount Number of applied EIPv6 addresses. Default: 1.
     */
    public void setAddressCount(Long AddressCount) {
        this.AddressCount = AddressCount;
    }

    /**
     * Get Indicates the billing method of EIPv6. Valid values:

- BANDWIDTH_PACKAGE: billed by [Bandwidth Package](https://intl.cloud.tencent.com/document/product/684/15255?from_cn_redirect=1)
- TRAFFIC_POSTPAID_BY_HOUR: postpaid by traffic on an hourly basis

Default: TRAFFIC_POSTPAID_BY_HOUR. 
     * @return InternetChargeType Indicates the billing method of EIPv6. Valid values:

- BANDWIDTH_PACKAGE: billed by [Bandwidth Package](https://intl.cloud.tencent.com/document/product/684/15255?from_cn_redirect=1)
- TRAFFIC_POSTPAID_BY_HOUR: postpaid by traffic on an hourly basis

Default: TRAFFIC_POSTPAID_BY_HOUR.
     */
    public String getInternetChargeType() {
        return this.InternetChargeType;
    }

    /**
     * Set Indicates the billing method of EIPv6. Valid values:

- BANDWIDTH_PACKAGE: billed by [Bandwidth Package](https://intl.cloud.tencent.com/document/product/684/15255?from_cn_redirect=1)
- TRAFFIC_POSTPAID_BY_HOUR: postpaid by traffic on an hourly basis

Default: TRAFFIC_POSTPAID_BY_HOUR.
     * @param InternetChargeType Indicates the billing method of EIPv6. Valid values:

- BANDWIDTH_PACKAGE: billed by [Bandwidth Package](https://intl.cloud.tencent.com/document/product/684/15255?from_cn_redirect=1)
- TRAFFIC_POSTPAID_BY_HOUR: postpaid by traffic on an hourly basis

Default: TRAFFIC_POSTPAID_BY_HOUR.
     */
    public void setInternetChargeType(String InternetChargeType) {
        this.InternetChargeType = InternetChargeType;
    }

    /**
     * Get Indicates the type of EIPv6 line. Default: BGP.

For a user who has enabled the static single-line IP allowlist, valid values include:
- CMCC: China Mobile
- CTCC: China Telecom
- CUCC: China Unicom
Note: The static single-line IP is only supported in some regions. 
     * @return InternetServiceProvider Indicates the type of EIPv6 line. Default: BGP.

For a user who has enabled the static single-line IP allowlist, valid values include:
- CMCC: China Mobile
- CTCC: China Telecom
- CUCC: China Unicom
Note: The static single-line IP is only supported in some regions.
     */
    public String getInternetServiceProvider() {
        return this.InternetServiceProvider;
    }

    /**
     * Set Indicates the type of EIPv6 line. Default: BGP.

For a user who has enabled the static single-line IP allowlist, valid values include:
- CMCC: China Mobile
- CTCC: China Telecom
- CUCC: China Unicom
Note: The static single-line IP is only supported in some regions.
     * @param InternetServiceProvider Indicates the type of EIPv6 line. Default: BGP.

For a user who has enabled the static single-line IP allowlist, valid values include:
- CMCC: China Mobile
- CTCC: China Telecom
- CUCC: China Unicom
Note: The static single-line IP is only supported in some regions.
     */
    public void setInternetServiceProvider(String InternetServiceProvider) {
        this.InternetServiceProvider = InternetServiceProvider;
    }

    /**
     * Get EIPv6 bandwidth cap, in Mbps.

Valid values depend on the EIP billing method:

- BANDWIDTH_PACKAGE: 1 Mbps to 2000 Mbps
- TRAFFIC_POSTPAID_BY_HOUR: 1 Mbps to 100 Mbps

Default: 1 Mbps. 
     * @return InternetMaxBandwidthOut EIPv6 bandwidth cap, in Mbps.

Valid values depend on the EIP billing method:

- BANDWIDTH_PACKAGE: 1 Mbps to 2000 Mbps
- TRAFFIC_POSTPAID_BY_HOUR: 1 Mbps to 100 Mbps

Default: 1 Mbps.
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set EIPv6 bandwidth cap, in Mbps.

Valid values depend on the EIP billing method:

- BANDWIDTH_PACKAGE: 1 Mbps to 2000 Mbps
- TRAFFIC_POSTPAID_BY_HOUR: 1 Mbps to 100 Mbps

Default: 1 Mbps.
     * @param InternetMaxBandwidthOut EIPv6 bandwidth cap, in Mbps.

Valid values depend on the EIP billing method:

- BANDWIDTH_PACKAGE: 1 Mbps to 2000 Mbps
- TRAFFIC_POSTPAID_BY_HOUR: 1 Mbps to 100 Mbps

Default: 1 Mbps.
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get Unique ID of the bandwidth package.
Setting this parameter and having InternetChargeType as BANDWIDTH_PACKAGE indicate that the created EIP will join this BGP bandwidth package and the billing method of bandwidth package will be adopted. 
     * @return BandwidthPackageId Unique ID of the bandwidth package.
Setting this parameter and having InternetChargeType as BANDWIDTH_PACKAGE indicate that the created EIP will join this BGP bandwidth package and the billing method of bandwidth package will be adopted.
     */
    public String getBandwidthPackageId() {
        return this.BandwidthPackageId;
    }

    /**
     * Set Unique ID of the bandwidth package.
Setting this parameter and having InternetChargeType as BANDWIDTH_PACKAGE indicate that the created EIP will join this BGP bandwidth package and the billing method of bandwidth package will be adopted.
     * @param BandwidthPackageId Unique ID of the bandwidth package.
Setting this parameter and having InternetChargeType as BANDWIDTH_PACKAGE indicate that the created EIP will join this BGP bandwidth package and the billing method of bandwidth package will be adopted.
     */
    public void setBandwidthPackageId(String BandwidthPackageId) {
        this.BandwidthPackageId = BandwidthPackageId;
    }

    /**
     * Get List of tags to be associated. 
     * @return Tags List of tags to be associated.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set List of tags to be associated.
     * @param Tags List of tags to be associated.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get EIPv6 network egress. Valid values:

- CENTER_EGRESS_1: Central egress point 1
- CENTER_EGRESS_2: Central egress point 2
- CENTER_EGRESS_3: Central egress point 3
Note: The network egress for different Internet Service Providers (ISPs) or resource types requires contacting the product team for enablement.

Default: CENTER_EGRESS_1. 
     * @return Egress EIPv6 network egress. Valid values:

- CENTER_EGRESS_1: Central egress point 1
- CENTER_EGRESS_2: Central egress point 2
- CENTER_EGRESS_3: Central egress point 3
Note: The network egress for different Internet Service Providers (ISPs) or resource types requires contacting the product team for enablement.

Default: CENTER_EGRESS_1.
     */
    public String getEgress() {
        return this.Egress;
    }

    /**
     * Set EIPv6 network egress. Valid values:

- CENTER_EGRESS_1: Central egress point 1
- CENTER_EGRESS_2: Central egress point 2
- CENTER_EGRESS_3: Central egress point 3
Note: The network egress for different Internet Service Providers (ISPs) or resource types requires contacting the product team for enablement.

Default: CENTER_EGRESS_1.
     * @param Egress EIPv6 network egress. Valid values:

- CENTER_EGRESS_1: Central egress point 1
- CENTER_EGRESS_2: Central egress point 2
- CENTER_EGRESS_3: Central egress point 3
Note: The network egress for different Internet Service Providers (ISPs) or resource types requires contacting the product team for enablement.

Default: CENTER_EGRESS_1.
     */
    public void setEgress(String Egress) {
        this.Egress = Egress;
    }

    public AllocateIPv6AddressesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AllocateIPv6AddressesRequest(AllocateIPv6AddressesRequest source) {
        if (source.AddressName != null) {
            this.AddressName = new String(source.AddressName);
        }
        if (source.AddressType != null) {
            this.AddressType = new String(source.AddressType);
        }
        if (source.AddressCount != null) {
            this.AddressCount = new Long(source.AddressCount);
        }
        if (source.InternetChargeType != null) {
            this.InternetChargeType = new String(source.InternetChargeType);
        }
        if (source.InternetServiceProvider != null) {
            this.InternetServiceProvider = new String(source.InternetServiceProvider);
        }
        if (source.InternetMaxBandwidthOut != null) {
            this.InternetMaxBandwidthOut = new Long(source.InternetMaxBandwidthOut);
        }
        if (source.BandwidthPackageId != null) {
            this.BandwidthPackageId = new String(source.BandwidthPackageId);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.Egress != null) {
            this.Egress = new String(source.Egress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddressName", this.AddressName);
        this.setParamSimple(map, prefix + "AddressType", this.AddressType);
        this.setParamSimple(map, prefix + "AddressCount", this.AddressCount);
        this.setParamSimple(map, prefix + "InternetChargeType", this.InternetChargeType);
        this.setParamSimple(map, prefix + "InternetServiceProvider", this.InternetServiceProvider);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamSimple(map, prefix + "BandwidthPackageId", this.BandwidthPackageId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Egress", this.Egress);

    }
}


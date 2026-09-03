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

public class IPv6InternetAccessible extends AbstractModel {

    /**
    * Network billing mode. Values include TRAFFIC_POSTPAID_BY_HOUR and BANDWIDTH_PACKAGE. Default value: TRAFFIC_POSTPAID_BY_HOUR. To view the current account type, see Account Type Description (https://www.tencentcloud.com/document/product/1199/49090?from_cn_redirect=1#judge).
<br><li> IPv6 supports TRAFFIC_POSTPAID_BY_HOUR for standard account type.
<br><li> IPv6 supports BANDWIDTH_PACKAGE for classic account type.
    */
    @SerializedName("InternetChargeType")
    @Expose
    private String InternetChargeType;

    /**
    * Public network outbound bandwidth cap, unit: Mbps.<br>Default value: 0. At this point, no public network bandwidth is allocated to IPv6. The bandwidth cap range varies by model, availability zone, and billing mode. For specific limitations, see [Public Network Bandwidth Limit](https://www.tencentcloud.com/document/product/213/12523?from_cn_redirect=1).
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * Bandwidth package ID, which can be obtained from the `BandwidthPackageId` in the return value from the [DescribeBandwidthPackages](https://www.tencentcloud.com/document/api/215/19209?from_cn_redirect=1) API.
    */
    @SerializedName("BandwidthPackageId")
    @Expose
    private String BandwidthPackageId;

    /**
     * Get Network billing mode. Values include TRAFFIC_POSTPAID_BY_HOUR and BANDWIDTH_PACKAGE. Default value: TRAFFIC_POSTPAID_BY_HOUR. To view the current account type, see Account Type Description (https://www.tencentcloud.com/document/product/1199/49090?from_cn_redirect=1#judge).
<br><li> IPv6 supports TRAFFIC_POSTPAID_BY_HOUR for standard account type.
<br><li> IPv6 supports BANDWIDTH_PACKAGE for classic account type. 
     * @return InternetChargeType Network billing mode. Values include TRAFFIC_POSTPAID_BY_HOUR and BANDWIDTH_PACKAGE. Default value: TRAFFIC_POSTPAID_BY_HOUR. To view the current account type, see Account Type Description (https://www.tencentcloud.com/document/product/1199/49090?from_cn_redirect=1#judge).
<br><li> IPv6 supports TRAFFIC_POSTPAID_BY_HOUR for standard account type.
<br><li> IPv6 supports BANDWIDTH_PACKAGE for classic account type.
     */
    public String getInternetChargeType() {
        return this.InternetChargeType;
    }

    /**
     * Set Network billing mode. Values include TRAFFIC_POSTPAID_BY_HOUR and BANDWIDTH_PACKAGE. Default value: TRAFFIC_POSTPAID_BY_HOUR. To view the current account type, see Account Type Description (https://www.tencentcloud.com/document/product/1199/49090?from_cn_redirect=1#judge).
<br><li> IPv6 supports TRAFFIC_POSTPAID_BY_HOUR for standard account type.
<br><li> IPv6 supports BANDWIDTH_PACKAGE for classic account type.
     * @param InternetChargeType Network billing mode. Values include TRAFFIC_POSTPAID_BY_HOUR and BANDWIDTH_PACKAGE. Default value: TRAFFIC_POSTPAID_BY_HOUR. To view the current account type, see Account Type Description (https://www.tencentcloud.com/document/product/1199/49090?from_cn_redirect=1#judge).
<br><li> IPv6 supports TRAFFIC_POSTPAID_BY_HOUR for standard account type.
<br><li> IPv6 supports BANDWIDTH_PACKAGE for classic account type.
     */
    public void setInternetChargeType(String InternetChargeType) {
        this.InternetChargeType = InternetChargeType;
    }

    /**
     * Get Public network outbound bandwidth cap, unit: Mbps.<br>Default value: 0. At this point, no public network bandwidth is allocated to IPv6. The bandwidth cap range varies by model, availability zone, and billing mode. For specific limitations, see [Public Network Bandwidth Limit](https://www.tencentcloud.com/document/product/213/12523?from_cn_redirect=1). 
     * @return InternetMaxBandwidthOut Public network outbound bandwidth cap, unit: Mbps.<br>Default value: 0. At this point, no public network bandwidth is allocated to IPv6. The bandwidth cap range varies by model, availability zone, and billing mode. For specific limitations, see [Public Network Bandwidth Limit](https://www.tencentcloud.com/document/product/213/12523?from_cn_redirect=1).
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set Public network outbound bandwidth cap, unit: Mbps.<br>Default value: 0. At this point, no public network bandwidth is allocated to IPv6. The bandwidth cap range varies by model, availability zone, and billing mode. For specific limitations, see [Public Network Bandwidth Limit](https://www.tencentcloud.com/document/product/213/12523?from_cn_redirect=1).
     * @param InternetMaxBandwidthOut Public network outbound bandwidth cap, unit: Mbps.<br>Default value: 0. At this point, no public network bandwidth is allocated to IPv6. The bandwidth cap range varies by model, availability zone, and billing mode. For specific limitations, see [Public Network Bandwidth Limit](https://www.tencentcloud.com/document/product/213/12523?from_cn_redirect=1).
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get Bandwidth package ID, which can be obtained from the `BandwidthPackageId` in the return value from the [DescribeBandwidthPackages](https://www.tencentcloud.com/document/api/215/19209?from_cn_redirect=1) API. 
     * @return BandwidthPackageId Bandwidth package ID, which can be obtained from the `BandwidthPackageId` in the return value from the [DescribeBandwidthPackages](https://www.tencentcloud.com/document/api/215/19209?from_cn_redirect=1) API.
     */
    public String getBandwidthPackageId() {
        return this.BandwidthPackageId;
    }

    /**
     * Set Bandwidth package ID, which can be obtained from the `BandwidthPackageId` in the return value from the [DescribeBandwidthPackages](https://www.tencentcloud.com/document/api/215/19209?from_cn_redirect=1) API.
     * @param BandwidthPackageId Bandwidth package ID, which can be obtained from the `BandwidthPackageId` in the return value from the [DescribeBandwidthPackages](https://www.tencentcloud.com/document/api/215/19209?from_cn_redirect=1) API.
     */
    public void setBandwidthPackageId(String BandwidthPackageId) {
        this.BandwidthPackageId = BandwidthPackageId;
    }

    public IPv6InternetAccessible() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IPv6InternetAccessible(IPv6InternetAccessible source) {
        if (source.InternetChargeType != null) {
            this.InternetChargeType = new String(source.InternetChargeType);
        }
        if (source.InternetMaxBandwidthOut != null) {
            this.InternetMaxBandwidthOut = new Long(source.InternetMaxBandwidthOut);
        }
        if (source.BandwidthPackageId != null) {
            this.BandwidthPackageId = new String(source.BandwidthPackageId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InternetChargeType", this.InternetChargeType);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamSimple(map, prefix + "BandwidthPackageId", this.BandwidthPackageId);

    }
}


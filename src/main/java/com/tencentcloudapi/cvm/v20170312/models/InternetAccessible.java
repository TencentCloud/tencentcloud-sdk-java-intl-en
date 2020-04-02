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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InternetAccessible extends AbstractModel{

    /**
    * Network connection billing plan. Valid value: <br><li>TRAFFIC_POSTPAID_BY_HOUR: pay after use. You are billed for your traffic, by the hour.
    */
    @SerializedName("InternetChargeType")
    @Expose
    private String InternetChargeType;

    /**
    * The maximum outbound bandwidth of the public network, in Mbps. The default value is 0 Mbps. The upper limit of bandwidth varies for different models. For more information, see [Purchase Network Bandwidth](https://cloud.tencent.com/document/product/213/12523).
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * Whether to assign a public IP. Valid values: <br><li>TRUE: Assign a public IP <br><li>FALSE: Do not assign a public IP <br><br>If the public network bandwidth is greater than 0 Mbps, you can choose whether to assign a public IP; by default a public IP will be assigned. If the public network bandwidth is 0 Mbps, you will not be able to assign a public IP.
    */
    @SerializedName("PublicIpAssigned")
    @Expose
    private Boolean PublicIpAssigned;

    /**
    * Bandwidth package ID. To obatin the IDs, you can call [`DescribeBandwidthPackages`](https://cloud.tencent.com/document/api/215/19209) and look for the `BandwidthPackageId` fields in the response.
    */
    @SerializedName("BandwidthPackageId")
    @Expose
    private String BandwidthPackageId;

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
     * Get The maximum outbound bandwidth of the public network, in Mbps. The default value is 0 Mbps. The upper limit of bandwidth varies for different models. For more information, see [Purchase Network Bandwidth](https://cloud.tencent.com/document/product/213/12523). 
     * @return InternetMaxBandwidthOut The maximum outbound bandwidth of the public network, in Mbps. The default value is 0 Mbps. The upper limit of bandwidth varies for different models. For more information, see [Purchase Network Bandwidth](https://cloud.tencent.com/document/product/213/12523).
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set The maximum outbound bandwidth of the public network, in Mbps. The default value is 0 Mbps. The upper limit of bandwidth varies for different models. For more information, see [Purchase Network Bandwidth](https://cloud.tencent.com/document/product/213/12523).
     * @param InternetMaxBandwidthOut The maximum outbound bandwidth of the public network, in Mbps. The default value is 0 Mbps. The upper limit of bandwidth varies for different models. For more information, see [Purchase Network Bandwidth](https://cloud.tencent.com/document/product/213/12523).
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get Whether to assign a public IP. Valid values: <br><li>TRUE: Assign a public IP <br><li>FALSE: Do not assign a public IP <br><br>If the public network bandwidth is greater than 0 Mbps, you can choose whether to assign a public IP; by default a public IP will be assigned. If the public network bandwidth is 0 Mbps, you will not be able to assign a public IP. 
     * @return PublicIpAssigned Whether to assign a public IP. Valid values: <br><li>TRUE: Assign a public IP <br><li>FALSE: Do not assign a public IP <br><br>If the public network bandwidth is greater than 0 Mbps, you can choose whether to assign a public IP; by default a public IP will be assigned. If the public network bandwidth is 0 Mbps, you will not be able to assign a public IP.
     */
    public Boolean getPublicIpAssigned() {
        return this.PublicIpAssigned;
    }

    /**
     * Set Whether to assign a public IP. Valid values: <br><li>TRUE: Assign a public IP <br><li>FALSE: Do not assign a public IP <br><br>If the public network bandwidth is greater than 0 Mbps, you can choose whether to assign a public IP; by default a public IP will be assigned. If the public network bandwidth is 0 Mbps, you will not be able to assign a public IP.
     * @param PublicIpAssigned Whether to assign a public IP. Valid values: <br><li>TRUE: Assign a public IP <br><li>FALSE: Do not assign a public IP <br><br>If the public network bandwidth is greater than 0 Mbps, you can choose whether to assign a public IP; by default a public IP will be assigned. If the public network bandwidth is 0 Mbps, you will not be able to assign a public IP.
     */
    public void setPublicIpAssigned(Boolean PublicIpAssigned) {
        this.PublicIpAssigned = PublicIpAssigned;
    }

    /**
     * Get Bandwidth package ID. To obatin the IDs, you can call [`DescribeBandwidthPackages`](https://cloud.tencent.com/document/api/215/19209) and look for the `BandwidthPackageId` fields in the response. 
     * @return BandwidthPackageId Bandwidth package ID. To obatin the IDs, you can call [`DescribeBandwidthPackages`](https://cloud.tencent.com/document/api/215/19209) and look for the `BandwidthPackageId` fields in the response.
     */
    public String getBandwidthPackageId() {
        return this.BandwidthPackageId;
    }

    /**
     * Set Bandwidth package ID. To obatin the IDs, you can call [`DescribeBandwidthPackages`](https://cloud.tencent.com/document/api/215/19209) and look for the `BandwidthPackageId` fields in the response.
     * @param BandwidthPackageId Bandwidth package ID. To obatin the IDs, you can call [`DescribeBandwidthPackages`](https://cloud.tencent.com/document/api/215/19209) and look for the `BandwidthPackageId` fields in the response.
     */
    public void setBandwidthPackageId(String BandwidthPackageId) {
        this.BandwidthPackageId = BandwidthPackageId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InternetChargeType", this.InternetChargeType);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamSimple(map, prefix + "PublicIpAssigned", this.PublicIpAssigned);
        this.setParamSimple(map, prefix + "BandwidthPackageId", this.BandwidthPackageId);

    }
}


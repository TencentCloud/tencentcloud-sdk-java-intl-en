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

public class InternetAccessible extends AbstractModel {

    /**
    * TRAFFIC_POSTPAID_BY_HOUR: hourly pay-as-you-go by traffic; BANDWIDTH_POSTPAID_BY_HOUR: hourly pay-as-you-go by bandwidth;
BANDWIDTH_PACKAGE: billed by bandwidth package (currently, this method is supported only if the ISP is specified)
    */
    @SerializedName("InternetChargeType")
    @Expose
    private String InternetChargeType;

    /**
    * Maximum outbound bandwidth, in Mbps. This applies only to shared, LCU-supported, and exclusive CLB instances of the public network type, as well as the LCU-supported CLB instances of the private network type.- For shared and exclusive CLB instances of the public network type, the maximum outbound bandwidth ranges from 1 Mbps to 2048 Mbps.- For LCU-supported CLB instances of the public network type and the private network type, the maximum outbound bandwidth ranges from 1 Mbps to 61440 Mbps.(If this parameter is not specified when CreateLoadBalancer is called to create a CLB instance, it defaults to 10 Mbps. This upper limit can be adjusted.)Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * Bandwidth package type, such as SINGLEISP (single-line) and BGP (multi-line).Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BandwidthpkgSubType")
    @Expose
    private String BandwidthpkgSubType;

    /**
     * Get TRAFFIC_POSTPAID_BY_HOUR: hourly pay-as-you-go by traffic; BANDWIDTH_POSTPAID_BY_HOUR: hourly pay-as-you-go by bandwidth;
BANDWIDTH_PACKAGE: billed by bandwidth package (currently, this method is supported only if the ISP is specified) 
     * @return InternetChargeType TRAFFIC_POSTPAID_BY_HOUR: hourly pay-as-you-go by traffic; BANDWIDTH_POSTPAID_BY_HOUR: hourly pay-as-you-go by bandwidth;
BANDWIDTH_PACKAGE: billed by bandwidth package (currently, this method is supported only if the ISP is specified)
     */
    public String getInternetChargeType() {
        return this.InternetChargeType;
    }

    /**
     * Set TRAFFIC_POSTPAID_BY_HOUR: hourly pay-as-you-go by traffic; BANDWIDTH_POSTPAID_BY_HOUR: hourly pay-as-you-go by bandwidth;
BANDWIDTH_PACKAGE: billed by bandwidth package (currently, this method is supported only if the ISP is specified)
     * @param InternetChargeType TRAFFIC_POSTPAID_BY_HOUR: hourly pay-as-you-go by traffic; BANDWIDTH_POSTPAID_BY_HOUR: hourly pay-as-you-go by bandwidth;
BANDWIDTH_PACKAGE: billed by bandwidth package (currently, this method is supported only if the ISP is specified)
     */
    public void setInternetChargeType(String InternetChargeType) {
        this.InternetChargeType = InternetChargeType;
    }

    /**
     * Get Maximum outbound bandwidth, in Mbps. This applies only to shared, LCU-supported, and exclusive CLB instances of the public network type, as well as the LCU-supported CLB instances of the private network type.- For shared and exclusive CLB instances of the public network type, the maximum outbound bandwidth ranges from 1 Mbps to 2048 Mbps.- For LCU-supported CLB instances of the public network type and the private network type, the maximum outbound bandwidth ranges from 1 Mbps to 61440 Mbps.(If this parameter is not specified when CreateLoadBalancer is called to create a CLB instance, it defaults to 10 Mbps. This upper limit can be adjusted.)Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InternetMaxBandwidthOut Maximum outbound bandwidth, in Mbps. This applies only to shared, LCU-supported, and exclusive CLB instances of the public network type, as well as the LCU-supported CLB instances of the private network type.- For shared and exclusive CLB instances of the public network type, the maximum outbound bandwidth ranges from 1 Mbps to 2048 Mbps.- For LCU-supported CLB instances of the public network type and the private network type, the maximum outbound bandwidth ranges from 1 Mbps to 61440 Mbps.(If this parameter is not specified when CreateLoadBalancer is called to create a CLB instance, it defaults to 10 Mbps. This upper limit can be adjusted.)Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set Maximum outbound bandwidth, in Mbps. This applies only to shared, LCU-supported, and exclusive CLB instances of the public network type, as well as the LCU-supported CLB instances of the private network type.- For shared and exclusive CLB instances of the public network type, the maximum outbound bandwidth ranges from 1 Mbps to 2048 Mbps.- For LCU-supported CLB instances of the public network type and the private network type, the maximum outbound bandwidth ranges from 1 Mbps to 61440 Mbps.(If this parameter is not specified when CreateLoadBalancer is called to create a CLB instance, it defaults to 10 Mbps. This upper limit can be adjusted.)Note: This field may return null, indicating that no valid values can be obtained.
     * @param InternetMaxBandwidthOut Maximum outbound bandwidth, in Mbps. This applies only to shared, LCU-supported, and exclusive CLB instances of the public network type, as well as the LCU-supported CLB instances of the private network type.- For shared and exclusive CLB instances of the public network type, the maximum outbound bandwidth ranges from 1 Mbps to 2048 Mbps.- For LCU-supported CLB instances of the public network type and the private network type, the maximum outbound bandwidth ranges from 1 Mbps to 61440 Mbps.(If this parameter is not specified when CreateLoadBalancer is called to create a CLB instance, it defaults to 10 Mbps. This upper limit can be adjusted.)Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get Bandwidth package type, such as SINGLEISP (single-line) and BGP (multi-line).Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BandwidthpkgSubType Bandwidth package type, such as SINGLEISP (single-line) and BGP (multi-line).Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBandwidthpkgSubType() {
        return this.BandwidthpkgSubType;
    }

    /**
     * Set Bandwidth package type, such as SINGLEISP (single-line) and BGP (multi-line).Note: This field may return null, indicating that no valid values can be obtained.
     * @param BandwidthpkgSubType Bandwidth package type, such as SINGLEISP (single-line) and BGP (multi-line).Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBandwidthpkgSubType(String BandwidthpkgSubType) {
        this.BandwidthpkgSubType = BandwidthpkgSubType;
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
        if (source.BandwidthpkgSubType != null) {
            this.BandwidthpkgSubType = new String(source.BandwidthpkgSubType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InternetChargeType", this.InternetChargeType);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamSimple(map, prefix + "BandwidthpkgSubType", this.BandwidthpkgSubType);

    }
}


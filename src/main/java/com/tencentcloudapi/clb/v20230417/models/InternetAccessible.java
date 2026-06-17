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
package com.tencentcloudapi.clb.v20230417.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InternetAccessible extends AbstractModel {

    /**
    * TRAFFIC_POSTPAID_BY_HOUR: postpaid by traffic on an hourly basis;
    */
    @SerializedName("InternetChargeType")
    @Expose
    private String InternetChargeType;

    /**
    * Maximum outbound bandwidth in Mbps. It applies only to shared, LCU-supported, and exclusive CLB instances of the public network type and LCU-supported CLB instances of the private network type.
-For shared type and exclusive CLB instances with public network attributes, the maximum outbound bandwidth ranges from 1Mbps to 2048Mbps.
-For LCU-supported CLB instances with public network attributes and private network attributes, the maximum outbound bandwidth ranges from 1Mbps to 61440Mbps.
(If this parameter is not specified when CreateLoadBalancer is called to create a CLB instance, the default value of 10 Mbps is used. This value can be modified.)
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * Bandwidth package type, such as SINGLEISP (single ISP) and BGP (multi ISP).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BandwidthPackageSubType")
    @Expose
    private String BandwidthPackageSubType;

    /**
     * Get TRAFFIC_POSTPAID_BY_HOUR: postpaid by traffic on an hourly basis; 
     * @return InternetChargeType TRAFFIC_POSTPAID_BY_HOUR: postpaid by traffic on an hourly basis;
     */
    public String getInternetChargeType() {
        return this.InternetChargeType;
    }

    /**
     * Set TRAFFIC_POSTPAID_BY_HOUR: postpaid by traffic on an hourly basis;
     * @param InternetChargeType TRAFFIC_POSTPAID_BY_HOUR: postpaid by traffic on an hourly basis;
     */
    public void setInternetChargeType(String InternetChargeType) {
        this.InternetChargeType = InternetChargeType;
    }

    /**
     * Get Maximum outbound bandwidth in Mbps. It applies only to shared, LCU-supported, and exclusive CLB instances of the public network type and LCU-supported CLB instances of the private network type.
-For shared type and exclusive CLB instances with public network attributes, the maximum outbound bandwidth ranges from 1Mbps to 2048Mbps.
-For LCU-supported CLB instances with public network attributes and private network attributes, the maximum outbound bandwidth ranges from 1Mbps to 61440Mbps.
(If this parameter is not specified when CreateLoadBalancer is called to create a CLB instance, the default value of 10 Mbps is used. This value can be modified.) 
     * @return InternetMaxBandwidthOut Maximum outbound bandwidth in Mbps. It applies only to shared, LCU-supported, and exclusive CLB instances of the public network type and LCU-supported CLB instances of the private network type.
-For shared type and exclusive CLB instances with public network attributes, the maximum outbound bandwidth ranges from 1Mbps to 2048Mbps.
-For LCU-supported CLB instances with public network attributes and private network attributes, the maximum outbound bandwidth ranges from 1Mbps to 61440Mbps.
(If this parameter is not specified when CreateLoadBalancer is called to create a CLB instance, the default value of 10 Mbps is used. This value can be modified.)
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set Maximum outbound bandwidth in Mbps. It applies only to shared, LCU-supported, and exclusive CLB instances of the public network type and LCU-supported CLB instances of the private network type.
-For shared type and exclusive CLB instances with public network attributes, the maximum outbound bandwidth ranges from 1Mbps to 2048Mbps.
-For LCU-supported CLB instances with public network attributes and private network attributes, the maximum outbound bandwidth ranges from 1Mbps to 61440Mbps.
(If this parameter is not specified when CreateLoadBalancer is called to create a CLB instance, the default value of 10 Mbps is used. This value can be modified.)
     * @param InternetMaxBandwidthOut Maximum outbound bandwidth in Mbps. It applies only to shared, LCU-supported, and exclusive CLB instances of the public network type and LCU-supported CLB instances of the private network type.
-For shared type and exclusive CLB instances with public network attributes, the maximum outbound bandwidth ranges from 1Mbps to 2048Mbps.
-For LCU-supported CLB instances with public network attributes and private network attributes, the maximum outbound bandwidth ranges from 1Mbps to 61440Mbps.
(If this parameter is not specified when CreateLoadBalancer is called to create a CLB instance, the default value of 10 Mbps is used. This value can be modified.)
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get Bandwidth package type, such as SINGLEISP (single ISP) and BGP (multi ISP).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BandwidthPackageSubType Bandwidth package type, such as SINGLEISP (single ISP) and BGP (multi ISP).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBandwidthPackageSubType() {
        return this.BandwidthPackageSubType;
    }

    /**
     * Set Bandwidth package type, such as SINGLEISP (single ISP) and BGP (multi ISP).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BandwidthPackageSubType Bandwidth package type, such as SINGLEISP (single ISP) and BGP (multi ISP).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBandwidthPackageSubType(String BandwidthPackageSubType) {
        this.BandwidthPackageSubType = BandwidthPackageSubType;
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
        if (source.BandwidthPackageSubType != null) {
            this.BandwidthPackageSubType = new String(source.BandwidthPackageSubType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InternetChargeType", this.InternetChargeType);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamSimple(map, prefix + "BandwidthPackageSubType", this.BandwidthPackageSubType);

    }
}


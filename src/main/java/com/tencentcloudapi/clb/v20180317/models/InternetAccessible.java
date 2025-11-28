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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InternetAccessible extends AbstractModel {

    /**
    * TRAFFIC_POSTPAID_BY_HOUR: Postpaid by traffic on an hourly basis. BANDWIDTH_POSTPAID_BY_HOUR: Postpaid by bandwidth on an hourly basis. International site users do not support this billing mode. BANDWIDTH_PACKAGE: Charged by bandwidth package. BANDWIDTH_PREPAID: Bandwidth prepaid.
    */
    @SerializedName("InternetChargeType")
    @Expose
    private String InternetChargeType;

    /**
    * Maximum outbound bandwidth, in Mbps. This parameter is valid only for public network shared, LCU-supported, and exclusive CLB instances and private network LCU-supported CLB instances.
- The range of the maximum outbound bandwidth for public network shared and exclusive CLB instances is 1 Mbps to 2,048 Mbps.
- The range of the maximum outbound bandwidth for public network and private network LCU-supported CLB instances is 1 Mbps to 61,440 Mbps.
(If this parameter is not specified when CreateLoadBalancer is called to create a CLB instance, the default value of 10 Mbps is used. This value can be modified.)
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * Bandwidth package type, for example BGP (multi-line).
Type as follows:.
SINGLEISP: single isp.
BGP: multi-line.
HIGH_QUALITY_BGP: specifies a dedicated bgp bandwidth package.
SINGLEISP_CMCC: specifies a cmcc bandwidth package.
SINGLEISP_CTCC: specifies the ctcc bandwidth package.
SINGLEISP_CUCC: specifies the china unicom bandwidth package.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BandwidthpkgSubType")
    @Expose
    private String BandwidthpkgSubType;

    /**
     * Get TRAFFIC_POSTPAID_BY_HOUR: Postpaid by traffic on an hourly basis. BANDWIDTH_POSTPAID_BY_HOUR: Postpaid by bandwidth on an hourly basis. International site users do not support this billing mode. BANDWIDTH_PACKAGE: Charged by bandwidth package. BANDWIDTH_PREPAID: Bandwidth prepaid. 
     * @return InternetChargeType TRAFFIC_POSTPAID_BY_HOUR: Postpaid by traffic on an hourly basis. BANDWIDTH_POSTPAID_BY_HOUR: Postpaid by bandwidth on an hourly basis. International site users do not support this billing mode. BANDWIDTH_PACKAGE: Charged by bandwidth package. BANDWIDTH_PREPAID: Bandwidth prepaid.
     */
    public String getInternetChargeType() {
        return this.InternetChargeType;
    }

    /**
     * Set TRAFFIC_POSTPAID_BY_HOUR: Postpaid by traffic on an hourly basis. BANDWIDTH_POSTPAID_BY_HOUR: Postpaid by bandwidth on an hourly basis. International site users do not support this billing mode. BANDWIDTH_PACKAGE: Charged by bandwidth package. BANDWIDTH_PREPAID: Bandwidth prepaid.
     * @param InternetChargeType TRAFFIC_POSTPAID_BY_HOUR: Postpaid by traffic on an hourly basis. BANDWIDTH_POSTPAID_BY_HOUR: Postpaid by bandwidth on an hourly basis. International site users do not support this billing mode. BANDWIDTH_PACKAGE: Charged by bandwidth package. BANDWIDTH_PREPAID: Bandwidth prepaid.
     */
    public void setInternetChargeType(String InternetChargeType) {
        this.InternetChargeType = InternetChargeType;
    }

    /**
     * Get Maximum outbound bandwidth, in Mbps. This parameter is valid only for public network shared, LCU-supported, and exclusive CLB instances and private network LCU-supported CLB instances.
- The range of the maximum outbound bandwidth for public network shared and exclusive CLB instances is 1 Mbps to 2,048 Mbps.
- The range of the maximum outbound bandwidth for public network and private network LCU-supported CLB instances is 1 Mbps to 61,440 Mbps.
(If this parameter is not specified when CreateLoadBalancer is called to create a CLB instance, the default value of 10 Mbps is used. This value can be modified.) 
     * @return InternetMaxBandwidthOut Maximum outbound bandwidth, in Mbps. This parameter is valid only for public network shared, LCU-supported, and exclusive CLB instances and private network LCU-supported CLB instances.
- The range of the maximum outbound bandwidth for public network shared and exclusive CLB instances is 1 Mbps to 2,048 Mbps.
- The range of the maximum outbound bandwidth for public network and private network LCU-supported CLB instances is 1 Mbps to 61,440 Mbps.
(If this parameter is not specified when CreateLoadBalancer is called to create a CLB instance, the default value of 10 Mbps is used. This value can be modified.)
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set Maximum outbound bandwidth, in Mbps. This parameter is valid only for public network shared, LCU-supported, and exclusive CLB instances and private network LCU-supported CLB instances.
- The range of the maximum outbound bandwidth for public network shared and exclusive CLB instances is 1 Mbps to 2,048 Mbps.
- The range of the maximum outbound bandwidth for public network and private network LCU-supported CLB instances is 1 Mbps to 61,440 Mbps.
(If this parameter is not specified when CreateLoadBalancer is called to create a CLB instance, the default value of 10 Mbps is used. This value can be modified.)
     * @param InternetMaxBandwidthOut Maximum outbound bandwidth, in Mbps. This parameter is valid only for public network shared, LCU-supported, and exclusive CLB instances and private network LCU-supported CLB instances.
- The range of the maximum outbound bandwidth for public network shared and exclusive CLB instances is 1 Mbps to 2,048 Mbps.
- The range of the maximum outbound bandwidth for public network and private network LCU-supported CLB instances is 1 Mbps to 61,440 Mbps.
(If this parameter is not specified when CreateLoadBalancer is called to create a CLB instance, the default value of 10 Mbps is used. This value can be modified.)
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get Bandwidth package type, for example BGP (multi-line).
Type as follows:.
SINGLEISP: single isp.
BGP: multi-line.
HIGH_QUALITY_BGP: specifies a dedicated bgp bandwidth package.
SINGLEISP_CMCC: specifies a cmcc bandwidth package.
SINGLEISP_CTCC: specifies the ctcc bandwidth package.
SINGLEISP_CUCC: specifies the china unicom bandwidth package.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BandwidthpkgSubType Bandwidth package type, for example BGP (multi-line).
Type as follows:.
SINGLEISP: single isp.
BGP: multi-line.
HIGH_QUALITY_BGP: specifies a dedicated bgp bandwidth package.
SINGLEISP_CMCC: specifies a cmcc bandwidth package.
SINGLEISP_CTCC: specifies the ctcc bandwidth package.
SINGLEISP_CUCC: specifies the china unicom bandwidth package.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBandwidthpkgSubType() {
        return this.BandwidthpkgSubType;
    }

    /**
     * Set Bandwidth package type, for example BGP (multi-line).
Type as follows:.
SINGLEISP: single isp.
BGP: multi-line.
HIGH_QUALITY_BGP: specifies a dedicated bgp bandwidth package.
SINGLEISP_CMCC: specifies a cmcc bandwidth package.
SINGLEISP_CTCC: specifies the ctcc bandwidth package.
SINGLEISP_CUCC: specifies the china unicom bandwidth package.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BandwidthpkgSubType Bandwidth package type, for example BGP (multi-line).
Type as follows:.
SINGLEISP: single isp.
BGP: multi-line.
HIGH_QUALITY_BGP: specifies a dedicated bgp bandwidth package.
SINGLEISP_CMCC: specifies a cmcc bandwidth package.
SINGLEISP_CTCC: specifies the ctcc bandwidth package.
SINGLEISP_CUCC: specifies the china unicom bandwidth package.
Note: This field may return null, indicating that no valid values can be obtained.
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


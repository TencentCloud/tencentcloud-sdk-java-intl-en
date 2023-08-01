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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InternetAccessible extends AbstractModel{

    /**
    * TRAFFIC_POSTPAID_BY_HOUR: hourly pay-as-you-go by traffic; BANDWIDTH_POSTPAID_BY_HOUR: hourly pay-as-you-go by bandwidth;
BANDWIDTH_PACKAGE: billed by bandwidth package (currently, this method is supported only if the ISP is specified)
    */
    @SerializedName("InternetChargeType")
    @Expose
    private String InternetChargeType;

    /**
    * Maximum outgoing bandwidth in Mbps. It works on LCU-supported instances on private networks and all instances on public networks.
- For shared and dedicated CLB instances on public networks, the range is 1Mbps-2048Mbps.
- For all LCU-supported CLB instances:
  - It defaults to General LCU-supported instance. SLA corresponds to Super Large 1, and the range of maximum outgoing bandwidth is 1 Mbps - 10240 Mbps.
  - If you have enabled Super Large specification, the range of maximum outgoing bandwidth is 1 Mbps - 61440 Mbps Super Large LCU-supported specification is in beta now. To join the beta, [submit a ticket](https://console.cloud.tencent.com/workorder/category).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * Bandwidth package type, such as SINGLEISP
Note: This field may return null, indicating that no valid values can be obtained.
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
     * Get Maximum outgoing bandwidth in Mbps. It works on LCU-supported instances on private networks and all instances on public networks.
- For shared and dedicated CLB instances on public networks, the range is 1Mbps-2048Mbps.
- For all LCU-supported CLB instances:
  - It defaults to General LCU-supported instance. SLA corresponds to Super Large 1, and the range of maximum outgoing bandwidth is 1 Mbps - 10240 Mbps.
  - If you have enabled Super Large specification, the range of maximum outgoing bandwidth is 1 Mbps - 61440 Mbps Super Large LCU-supported specification is in beta now. To join the beta, [submit a ticket](https://console.cloud.tencent.com/workorder/category).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InternetMaxBandwidthOut Maximum outgoing bandwidth in Mbps. It works on LCU-supported instances on private networks and all instances on public networks.
- For shared and dedicated CLB instances on public networks, the range is 1Mbps-2048Mbps.
- For all LCU-supported CLB instances:
  - It defaults to General LCU-supported instance. SLA corresponds to Super Large 1, and the range of maximum outgoing bandwidth is 1 Mbps - 10240 Mbps.
  - If you have enabled Super Large specification, the range of maximum outgoing bandwidth is 1 Mbps - 61440 Mbps Super Large LCU-supported specification is in beta now. To join the beta, [submit a ticket](https://console.cloud.tencent.com/workorder/category).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set Maximum outgoing bandwidth in Mbps. It works on LCU-supported instances on private networks and all instances on public networks.
- For shared and dedicated CLB instances on public networks, the range is 1Mbps-2048Mbps.
- For all LCU-supported CLB instances:
  - It defaults to General LCU-supported instance. SLA corresponds to Super Large 1, and the range of maximum outgoing bandwidth is 1 Mbps - 10240 Mbps.
  - If you have enabled Super Large specification, the range of maximum outgoing bandwidth is 1 Mbps - 61440 Mbps Super Large LCU-supported specification is in beta now. To join the beta, [submit a ticket](https://console.cloud.tencent.com/workorder/category).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InternetMaxBandwidthOut Maximum outgoing bandwidth in Mbps. It works on LCU-supported instances on private networks and all instances on public networks.
- For shared and dedicated CLB instances on public networks, the range is 1Mbps-2048Mbps.
- For all LCU-supported CLB instances:
  - It defaults to General LCU-supported instance. SLA corresponds to Super Large 1, and the range of maximum outgoing bandwidth is 1 Mbps - 10240 Mbps.
  - If you have enabled Super Large specification, the range of maximum outgoing bandwidth is 1 Mbps - 61440 Mbps Super Large LCU-supported specification is in beta now. To join the beta, [submit a ticket](https://console.cloud.tencent.com/workorder/category).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get Bandwidth package type, such as SINGLEISP
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BandwidthpkgSubType Bandwidth package type, such as SINGLEISP
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBandwidthpkgSubType() {
        return this.BandwidthpkgSubType;
    }

    /**
     * Set Bandwidth package type, such as SINGLEISP
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BandwidthpkgSubType Bandwidth package type, such as SINGLEISP
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


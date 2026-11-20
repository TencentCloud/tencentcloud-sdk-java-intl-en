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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InternetAccessible extends AbstractModel {

    /**
    * Network billing type. Valid values:
<li>Pay-as-you-go by traffic: TRAFFIC_POSTPAID_BY_HOUR</li>
<li>Pay-as-you-go by bandwidth: BANDWIDTH_POSTPAID_BY_HOUR</li>
    */
    @SerializedName("InternetChargeType")
    @Expose
    private String InternetChargeType;

    /**
    * Maximum outbound public bandwidth, in the unit of Mbps.
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * Indicates whether a public IP is assigned.
    */
    @SerializedName("PublicIpAssigned")
    @Expose
    private Boolean PublicIpAssigned;

    /**
     * Get Network billing type. Valid values:
<li>Pay-as-you-go by traffic: TRAFFIC_POSTPAID_BY_HOUR</li>
<li>Pay-as-you-go by bandwidth: BANDWIDTH_POSTPAID_BY_HOUR</li> 
     * @return InternetChargeType Network billing type. Valid values:
<li>Pay-as-you-go by traffic: TRAFFIC_POSTPAID_BY_HOUR</li>
<li>Pay-as-you-go by bandwidth: BANDWIDTH_POSTPAID_BY_HOUR</li>
     */
    public String getInternetChargeType() {
        return this.InternetChargeType;
    }

    /**
     * Set Network billing type. Valid values:
<li>Pay-as-you-go by traffic: TRAFFIC_POSTPAID_BY_HOUR</li>
<li>Pay-as-you-go by bandwidth: BANDWIDTH_POSTPAID_BY_HOUR</li>
     * @param InternetChargeType Network billing type. Valid values:
<li>Pay-as-you-go by traffic: TRAFFIC_POSTPAID_BY_HOUR</li>
<li>Pay-as-you-go by bandwidth: BANDWIDTH_POSTPAID_BY_HOUR</li>
     */
    public void setInternetChargeType(String InternetChargeType) {
        this.InternetChargeType = InternetChargeType;
    }

    /**
     * Get Maximum outbound public bandwidth, in the unit of Mbps. 
     * @return InternetMaxBandwidthOut Maximum outbound public bandwidth, in the unit of Mbps.
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set Maximum outbound public bandwidth, in the unit of Mbps.
     * @param InternetMaxBandwidthOut Maximum outbound public bandwidth, in the unit of Mbps.
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get Indicates whether a public IP is assigned. 
     * @return PublicIpAssigned Indicates whether a public IP is assigned.
     */
    public Boolean getPublicIpAssigned() {
        return this.PublicIpAssigned;
    }

    /**
     * Set Indicates whether a public IP is assigned.
     * @param PublicIpAssigned Indicates whether a public IP is assigned.
     */
    public void setPublicIpAssigned(Boolean PublicIpAssigned) {
        this.PublicIpAssigned = PublicIpAssigned;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InternetChargeType", this.InternetChargeType);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamSimple(map, prefix + "PublicIpAssigned", this.PublicIpAssigned);

    }
}


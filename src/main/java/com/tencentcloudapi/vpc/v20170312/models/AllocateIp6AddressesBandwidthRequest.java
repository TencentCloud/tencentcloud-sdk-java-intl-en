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

public class AllocateIp6AddressesBandwidthRequest extends AbstractModel {

    /**
    * IPv6 addresses that require the public network access capability.
    */
    @SerializedName("Ip6Addresses")
    @Expose
    private String [] Ip6Addresses;

    /**
    * Bandwidth, in Mbps. The default value is 1 Mbps.
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * Network billing mode. IPv6 addresses currently support "TRAFFIC_POSTPAID_BY_HOUR" and "BANDWIDTH_PACKAGE". The default network billing mode is "TRAFFIC_POSTPAID_BY_HOUR".
    */
    @SerializedName("InternetChargeType")
    @Expose
    private String InternetChargeType;

    /**
    * Bandwidth package ID. This ID is required for standard accounts to add the IPv6 addresses to the bandwidth package, thus using the billing mode.
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
     * Get IPv6 addresses that require the public network access capability. 
     * @return Ip6Addresses IPv6 addresses that require the public network access capability.
     */
    public String [] getIp6Addresses() {
        return this.Ip6Addresses;
    }

    /**
     * Set IPv6 addresses that require the public network access capability.
     * @param Ip6Addresses IPv6 addresses that require the public network access capability.
     */
    public void setIp6Addresses(String [] Ip6Addresses) {
        this.Ip6Addresses = Ip6Addresses;
    }

    /**
     * Get Bandwidth, in Mbps. The default value is 1 Mbps. 
     * @return InternetMaxBandwidthOut Bandwidth, in Mbps. The default value is 1 Mbps.
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set Bandwidth, in Mbps. The default value is 1 Mbps.
     * @param InternetMaxBandwidthOut Bandwidth, in Mbps. The default value is 1 Mbps.
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get Network billing mode. IPv6 addresses currently support "TRAFFIC_POSTPAID_BY_HOUR" and "BANDWIDTH_PACKAGE". The default network billing mode is "TRAFFIC_POSTPAID_BY_HOUR". 
     * @return InternetChargeType Network billing mode. IPv6 addresses currently support "TRAFFIC_POSTPAID_BY_HOUR" and "BANDWIDTH_PACKAGE". The default network billing mode is "TRAFFIC_POSTPAID_BY_HOUR".
     */
    public String getInternetChargeType() {
        return this.InternetChargeType;
    }

    /**
     * Set Network billing mode. IPv6 addresses currently support "TRAFFIC_POSTPAID_BY_HOUR" and "BANDWIDTH_PACKAGE". The default network billing mode is "TRAFFIC_POSTPAID_BY_HOUR".
     * @param InternetChargeType Network billing mode. IPv6 addresses currently support "TRAFFIC_POSTPAID_BY_HOUR" and "BANDWIDTH_PACKAGE". The default network billing mode is "TRAFFIC_POSTPAID_BY_HOUR".
     */
    public void setInternetChargeType(String InternetChargeType) {
        this.InternetChargeType = InternetChargeType;
    }

    /**
     * Get Bandwidth package ID. This ID is required for standard accounts to add the IPv6 addresses to the bandwidth package, thus using the billing mode. 
     * @return BandwidthPackageId Bandwidth package ID. This ID is required for standard accounts to add the IPv6 addresses to the bandwidth package, thus using the billing mode.
     */
    public String getBandwidthPackageId() {
        return this.BandwidthPackageId;
    }

    /**
     * Set Bandwidth package ID. This ID is required for standard accounts to add the IPv6 addresses to the bandwidth package, thus using the billing mode.
     * @param BandwidthPackageId Bandwidth package ID. This ID is required for standard accounts to add the IPv6 addresses to the bandwidth package, thus using the billing mode.
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

    public AllocateIp6AddressesBandwidthRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AllocateIp6AddressesBandwidthRequest(AllocateIp6AddressesBandwidthRequest source) {
        if (source.Ip6Addresses != null) {
            this.Ip6Addresses = new String[source.Ip6Addresses.length];
            for (int i = 0; i < source.Ip6Addresses.length; i++) {
                this.Ip6Addresses[i] = new String(source.Ip6Addresses[i]);
            }
        }
        if (source.InternetMaxBandwidthOut != null) {
            this.InternetMaxBandwidthOut = new Long(source.InternetMaxBandwidthOut);
        }
        if (source.InternetChargeType != null) {
            this.InternetChargeType = new String(source.InternetChargeType);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Ip6Addresses.", this.Ip6Addresses);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamSimple(map, prefix + "InternetChargeType", this.InternetChargeType);
        this.setParamSimple(map, prefix + "BandwidthPackageId", this.BandwidthPackageId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}


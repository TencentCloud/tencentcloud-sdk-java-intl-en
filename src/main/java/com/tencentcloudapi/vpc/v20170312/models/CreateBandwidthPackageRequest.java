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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBandwidthPackageRequest extends AbstractModel{

    /**
    * The bandwidth package type. Valid values: 'BGP', 'SINGLEISP', and 'ANYCAST'.
    */
    @SerializedName("NetworkType")
    @Expose
    private String NetworkType;

    /**
    * The bandwidth package billing mode. Valid values: 'TOP5_POSTPAID_BY_MONTH' and 'PERCENT95_POSTPAID_BY_MONTH'.
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * The name of the bandwidth package.
    */
    @SerializedName("BandwidthPackageName")
    @Expose
    private String BandwidthPackageName;

    /**
    * The number of bandwidth packages (It can only be “1” for bill-by-CVM accounts)
    */
    @SerializedName("BandwidthPackageCount")
    @Expose
    private Long BandwidthPackageCount;

    /**
    * The limit of the bandwidth package in Mbps. The value '-1' indicates there is no limit.
    */
    @SerializedName("InternetMaxBandwidth")
    @Expose
    private Long InternetMaxBandwidth;

    /**
    * The list of tags to be bound.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * The protocol type of the bandwidth package. Valid values: 'ipv4' and 'ipv6'. Default value: 'ipv4'.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
     * Get The bandwidth package type. Valid values: 'BGP', 'SINGLEISP', and 'ANYCAST'. 
     * @return NetworkType The bandwidth package type. Valid values: 'BGP', 'SINGLEISP', and 'ANYCAST'.
     */
    public String getNetworkType() {
        return this.NetworkType;
    }

    /**
     * Set The bandwidth package type. Valid values: 'BGP', 'SINGLEISP', and 'ANYCAST'.
     * @param NetworkType The bandwidth package type. Valid values: 'BGP', 'SINGLEISP', and 'ANYCAST'.
     */
    public void setNetworkType(String NetworkType) {
        this.NetworkType = NetworkType;
    }

    /**
     * Get The bandwidth package billing mode. Valid values: 'TOP5_POSTPAID_BY_MONTH' and 'PERCENT95_POSTPAID_BY_MONTH'. 
     * @return ChargeType The bandwidth package billing mode. Valid values: 'TOP5_POSTPAID_BY_MONTH' and 'PERCENT95_POSTPAID_BY_MONTH'.
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set The bandwidth package billing mode. Valid values: 'TOP5_POSTPAID_BY_MONTH' and 'PERCENT95_POSTPAID_BY_MONTH'.
     * @param ChargeType The bandwidth package billing mode. Valid values: 'TOP5_POSTPAID_BY_MONTH' and 'PERCENT95_POSTPAID_BY_MONTH'.
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get The name of the bandwidth package. 
     * @return BandwidthPackageName The name of the bandwidth package.
     */
    public String getBandwidthPackageName() {
        return this.BandwidthPackageName;
    }

    /**
     * Set The name of the bandwidth package.
     * @param BandwidthPackageName The name of the bandwidth package.
     */
    public void setBandwidthPackageName(String BandwidthPackageName) {
        this.BandwidthPackageName = BandwidthPackageName;
    }

    /**
     * Get The number of bandwidth packages (It can only be “1” for bill-by-CVM accounts) 
     * @return BandwidthPackageCount The number of bandwidth packages (It can only be “1” for bill-by-CVM accounts)
     */
    public Long getBandwidthPackageCount() {
        return this.BandwidthPackageCount;
    }

    /**
     * Set The number of bandwidth packages (It can only be “1” for bill-by-CVM accounts)
     * @param BandwidthPackageCount The number of bandwidth packages (It can only be “1” for bill-by-CVM accounts)
     */
    public void setBandwidthPackageCount(Long BandwidthPackageCount) {
        this.BandwidthPackageCount = BandwidthPackageCount;
    }

    /**
     * Get The limit of the bandwidth package in Mbps. The value '-1' indicates there is no limit. 
     * @return InternetMaxBandwidth The limit of the bandwidth package in Mbps. The value '-1' indicates there is no limit.
     */
    public Long getInternetMaxBandwidth() {
        return this.InternetMaxBandwidth;
    }

    /**
     * Set The limit of the bandwidth package in Mbps. The value '-1' indicates there is no limit.
     * @param InternetMaxBandwidth The limit of the bandwidth package in Mbps. The value '-1' indicates there is no limit.
     */
    public void setInternetMaxBandwidth(Long InternetMaxBandwidth) {
        this.InternetMaxBandwidth = InternetMaxBandwidth;
    }

    /**
     * Get The list of tags to be bound. 
     * @return Tags The list of tags to be bound.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set The list of tags to be bound.
     * @param Tags The list of tags to be bound.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get The protocol type of the bandwidth package. Valid values: 'ipv4' and 'ipv6'. Default value: 'ipv4'. 
     * @return Protocol The protocol type of the bandwidth package. Valid values: 'ipv4' and 'ipv6'. Default value: 'ipv4'.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set The protocol type of the bandwidth package. Valid values: 'ipv4' and 'ipv6'. Default value: 'ipv4'.
     * @param Protocol The protocol type of the bandwidth package. Valid values: 'ipv4' and 'ipv6'. Default value: 'ipv4'.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NetworkType", this.NetworkType);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "BandwidthPackageName", this.BandwidthPackageName);
        this.setParamSimple(map, prefix + "BandwidthPackageCount", this.BandwidthPackageCount);
        this.setParamSimple(map, prefix + "InternetMaxBandwidth", this.InternetMaxBandwidth);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);

    }
}


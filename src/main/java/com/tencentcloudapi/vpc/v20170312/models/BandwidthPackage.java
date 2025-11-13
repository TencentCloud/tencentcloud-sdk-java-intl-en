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

public class BandwidthPackage extends AbstractModel {

    /**
    * The unique ID of the bandwidth package.
    */
    @SerializedName("BandwidthPackageId")
    @Expose
    private String BandwidthPackageId;

    /**
    * Bandwidth package type, includes:
<li>BGP: General BGP bandwidth package</li>
<li>HIGH_QUALITY_BGP: Dedicated BGP bandwidth package</li>
<li>ANYCAST: AIA BGP bandwidth package</li>
<li>SINGLEISP_CMCC: CMCC bandwidth package</li>
<li>SINGLEISP_CTCC: CTCC bandwidth package</li>
<li>SINGLEISP_CUCC: CUCC bandwidth package</li>
    */
    @SerializedName("NetworkType")
    @Expose
    private String NetworkType;

    /**
    * Bandwidth package billing type, includes:
<li>ENHANCED95_POSTPAID_BY_MONTH: Pay-as-you-go - Enhanced 95th percentile</li>
<li>PRIMARY_TRAFFIC_POSTPAID_BY_HOUR: Postpaid - Main Traffic Billing</li>
<li>BANDWIDTH_POSTPAID_BY_DAY: General BGP, Pay-as-you-go - Bandwidth-based</li>
<li>PEAK_BANDWIDTH_POSTPAID_BY_DAY: Static single-line, Pay-as-you-go - Daily billed</li>
<li>TOP5_POSTPAID_BY_MONTH: Pay-as-you-go - Monthly top 5th, If you need to use this Bglling mode, please submit a ticket</li>

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
    * The creation time of the bandwidth package, which follows the `ISO8601` standard and uses `UTC` time in the format of `YYYY-MM-DDThh:mm:ssZ`.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * The status of the bandwidth package. Valid values: 'CREATING', 'CREATED', 'DELETING', and 'DELETED'.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * The resource information of the bandwidth package.
    */
    @SerializedName("ResourceSet")
    @Expose
    private Resource [] ResourceSet;

    /**
    * The limit of the bandwidth package in Mbps. The value '-1' indicates there is no limit.
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * Network egress. It defaults to `center_egress1`. Valid values:
center_egress1,center_egress2,center_egress3

    */
    @SerializedName("Egress")
    @Expose
    private String Egress;

    /**
     * Get The unique ID of the bandwidth package. 
     * @return BandwidthPackageId The unique ID of the bandwidth package.
     */
    public String getBandwidthPackageId() {
        return this.BandwidthPackageId;
    }

    /**
     * Set The unique ID of the bandwidth package.
     * @param BandwidthPackageId The unique ID of the bandwidth package.
     */
    public void setBandwidthPackageId(String BandwidthPackageId) {
        this.BandwidthPackageId = BandwidthPackageId;
    }

    /**
     * Get Bandwidth package type, includes:
<li>BGP: General BGP bandwidth package</li>
<li>HIGH_QUALITY_BGP: Dedicated BGP bandwidth package</li>
<li>ANYCAST: AIA BGP bandwidth package</li>
<li>SINGLEISP_CMCC: CMCC bandwidth package</li>
<li>SINGLEISP_CTCC: CTCC bandwidth package</li>
<li>SINGLEISP_CUCC: CUCC bandwidth package</li> 
     * @return NetworkType Bandwidth package type, includes:
<li>BGP: General BGP bandwidth package</li>
<li>HIGH_QUALITY_BGP: Dedicated BGP bandwidth package</li>
<li>ANYCAST: AIA BGP bandwidth package</li>
<li>SINGLEISP_CMCC: CMCC bandwidth package</li>
<li>SINGLEISP_CTCC: CTCC bandwidth package</li>
<li>SINGLEISP_CUCC: CUCC bandwidth package</li>
     */
    public String getNetworkType() {
        return this.NetworkType;
    }

    /**
     * Set Bandwidth package type, includes:
<li>BGP: General BGP bandwidth package</li>
<li>HIGH_QUALITY_BGP: Dedicated BGP bandwidth package</li>
<li>ANYCAST: AIA BGP bandwidth package</li>
<li>SINGLEISP_CMCC: CMCC bandwidth package</li>
<li>SINGLEISP_CTCC: CTCC bandwidth package</li>
<li>SINGLEISP_CUCC: CUCC bandwidth package</li>
     * @param NetworkType Bandwidth package type, includes:
<li>BGP: General BGP bandwidth package</li>
<li>HIGH_QUALITY_BGP: Dedicated BGP bandwidth package</li>
<li>ANYCAST: AIA BGP bandwidth package</li>
<li>SINGLEISP_CMCC: CMCC bandwidth package</li>
<li>SINGLEISP_CTCC: CTCC bandwidth package</li>
<li>SINGLEISP_CUCC: CUCC bandwidth package</li>
     */
    public void setNetworkType(String NetworkType) {
        this.NetworkType = NetworkType;
    }

    /**
     * Get Bandwidth package billing type, includes:
<li>ENHANCED95_POSTPAID_BY_MONTH: Pay-as-you-go - Enhanced 95th percentile</li>
<li>PRIMARY_TRAFFIC_POSTPAID_BY_HOUR: Postpaid - Main Traffic Billing</li>
<li>BANDWIDTH_POSTPAID_BY_DAY: General BGP, Pay-as-you-go - Bandwidth-based</li>
<li>PEAK_BANDWIDTH_POSTPAID_BY_DAY: Static single-line, Pay-as-you-go - Daily billed</li>
<li>TOP5_POSTPAID_BY_MONTH: Pay-as-you-go - Monthly top 5th, If you need to use this Bglling mode, please submit a ticket</li>
 
     * @return ChargeType Bandwidth package billing type, includes:
<li>ENHANCED95_POSTPAID_BY_MONTH: Pay-as-you-go - Enhanced 95th percentile</li>
<li>PRIMARY_TRAFFIC_POSTPAID_BY_HOUR: Postpaid - Main Traffic Billing</li>
<li>BANDWIDTH_POSTPAID_BY_DAY: General BGP, Pay-as-you-go - Bandwidth-based</li>
<li>PEAK_BANDWIDTH_POSTPAID_BY_DAY: Static single-line, Pay-as-you-go - Daily billed</li>
<li>TOP5_POSTPAID_BY_MONTH: Pay-as-you-go - Monthly top 5th, If you need to use this Bglling mode, please submit a ticket</li>

     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set Bandwidth package billing type, includes:
<li>ENHANCED95_POSTPAID_BY_MONTH: Pay-as-you-go - Enhanced 95th percentile</li>
<li>PRIMARY_TRAFFIC_POSTPAID_BY_HOUR: Postpaid - Main Traffic Billing</li>
<li>BANDWIDTH_POSTPAID_BY_DAY: General BGP, Pay-as-you-go - Bandwidth-based</li>
<li>PEAK_BANDWIDTH_POSTPAID_BY_DAY: Static single-line, Pay-as-you-go - Daily billed</li>
<li>TOP5_POSTPAID_BY_MONTH: Pay-as-you-go - Monthly top 5th, If you need to use this Bglling mode, please submit a ticket</li>

     * @param ChargeType Bandwidth package billing type, includes:
<li>ENHANCED95_POSTPAID_BY_MONTH: Pay-as-you-go - Enhanced 95th percentile</li>
<li>PRIMARY_TRAFFIC_POSTPAID_BY_HOUR: Postpaid - Main Traffic Billing</li>
<li>BANDWIDTH_POSTPAID_BY_DAY: General BGP, Pay-as-you-go - Bandwidth-based</li>
<li>PEAK_BANDWIDTH_POSTPAID_BY_DAY: Static single-line, Pay-as-you-go - Daily billed</li>
<li>TOP5_POSTPAID_BY_MONTH: Pay-as-you-go - Monthly top 5th, If you need to use this Bglling mode, please submit a ticket</li>

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
     * Get The creation time of the bandwidth package, which follows the `ISO8601` standard and uses `UTC` time in the format of `YYYY-MM-DDThh:mm:ssZ`. 
     * @return CreatedTime The creation time of the bandwidth package, which follows the `ISO8601` standard and uses `UTC` time in the format of `YYYY-MM-DDThh:mm:ssZ`.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set The creation time of the bandwidth package, which follows the `ISO8601` standard and uses `UTC` time in the format of `YYYY-MM-DDThh:mm:ssZ`.
     * @param CreatedTime The creation time of the bandwidth package, which follows the `ISO8601` standard and uses `UTC` time in the format of `YYYY-MM-DDThh:mm:ssZ`.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get The status of the bandwidth package. Valid values: 'CREATING', 'CREATED', 'DELETING', and 'DELETED'. 
     * @return Status The status of the bandwidth package. Valid values: 'CREATING', 'CREATED', 'DELETING', and 'DELETED'.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set The status of the bandwidth package. Valid values: 'CREATING', 'CREATED', 'DELETING', and 'DELETED'.
     * @param Status The status of the bandwidth package. Valid values: 'CREATING', 'CREATED', 'DELETING', and 'DELETED'.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get The resource information of the bandwidth package. 
     * @return ResourceSet The resource information of the bandwidth package.
     */
    public Resource [] getResourceSet() {
        return this.ResourceSet;
    }

    /**
     * Set The resource information of the bandwidth package.
     * @param ResourceSet The resource information of the bandwidth package.
     */
    public void setResourceSet(Resource [] ResourceSet) {
        this.ResourceSet = ResourceSet;
    }

    /**
     * Get The limit of the bandwidth package in Mbps. The value '-1' indicates there is no limit. 
     * @return Bandwidth The limit of the bandwidth package in Mbps. The value '-1' indicates there is no limit.
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set The limit of the bandwidth package in Mbps. The value '-1' indicates there is no limit.
     * @param Bandwidth The limit of the bandwidth package in Mbps. The value '-1' indicates there is no limit.
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get Network egress. It defaults to `center_egress1`. Valid values:
center_egress1,center_egress2,center_egress3
 
     * @return Egress Network egress. It defaults to `center_egress1`. Valid values:
center_egress1,center_egress2,center_egress3

     */
    public String getEgress() {
        return this.Egress;
    }

    /**
     * Set Network egress. It defaults to `center_egress1`. Valid values:
center_egress1,center_egress2,center_egress3

     * @param Egress Network egress. It defaults to `center_egress1`. Valid values:
center_egress1,center_egress2,center_egress3

     */
    public void setEgress(String Egress) {
        this.Egress = Egress;
    }

    public BandwidthPackage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BandwidthPackage(BandwidthPackage source) {
        if (source.BandwidthPackageId != null) {
            this.BandwidthPackageId = new String(source.BandwidthPackageId);
        }
        if (source.NetworkType != null) {
            this.NetworkType = new String(source.NetworkType);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.BandwidthPackageName != null) {
            this.BandwidthPackageName = new String(source.BandwidthPackageName);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ResourceSet != null) {
            this.ResourceSet = new Resource[source.ResourceSet.length];
            for (int i = 0; i < source.ResourceSet.length; i++) {
                this.ResourceSet[i] = new Resource(source.ResourceSet[i]);
            }
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.Egress != null) {
            this.Egress = new String(source.Egress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BandwidthPackageId", this.BandwidthPackageId);
        this.setParamSimple(map, prefix + "NetworkType", this.NetworkType);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "BandwidthPackageName", this.BandwidthPackageName);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "ResourceSet.", this.ResourceSet);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "Egress", this.Egress);

    }
}


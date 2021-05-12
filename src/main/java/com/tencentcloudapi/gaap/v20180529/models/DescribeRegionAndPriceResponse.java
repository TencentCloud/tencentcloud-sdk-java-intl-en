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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRegionAndPriceResponse extends AbstractModel{

    /**
    * Total number of origin server regions
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * List of origin server region details
    */
    @SerializedName("DestRegionSet")
    @Expose
    private RegionDetail [] DestRegionSet;

    /**
    * Connection bandwidth price gradient
    */
    @SerializedName("BandwidthUnitPrice")
    @Expose
    private BandwidthPriceGradient [] BandwidthUnitPrice;

    /**
    * Currency type of bandwidth price:
CNY (Chinese Yuan)
USD (United States Dollar)
    */
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of origin server regions 
     * @return TotalCount Total number of origin server regions
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of origin server regions
     * @param TotalCount Total number of origin server regions
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get List of origin server region details 
     * @return DestRegionSet List of origin server region details
     */
    public RegionDetail [] getDestRegionSet() {
        return this.DestRegionSet;
    }

    /**
     * Set List of origin server region details
     * @param DestRegionSet List of origin server region details
     */
    public void setDestRegionSet(RegionDetail [] DestRegionSet) {
        this.DestRegionSet = DestRegionSet;
    }

    /**
     * Get Connection bandwidth price gradient 
     * @return BandwidthUnitPrice Connection bandwidth price gradient
     */
    public BandwidthPriceGradient [] getBandwidthUnitPrice() {
        return this.BandwidthUnitPrice;
    }

    /**
     * Set Connection bandwidth price gradient
     * @param BandwidthUnitPrice Connection bandwidth price gradient
     */
    public void setBandwidthUnitPrice(BandwidthPriceGradient [] BandwidthUnitPrice) {
        this.BandwidthUnitPrice = BandwidthUnitPrice;
    }

    /**
     * Get Currency type of bandwidth price:
CNY (Chinese Yuan)
USD (United States Dollar) 
     * @return Currency Currency type of bandwidth price:
CNY (Chinese Yuan)
USD (United States Dollar)
     */
    public String getCurrency() {
        return this.Currency;
    }

    /**
     * Set Currency type of bandwidth price:
CNY (Chinese Yuan)
USD (United States Dollar)
     * @param Currency Currency type of bandwidth price:
CNY (Chinese Yuan)
USD (United States Dollar)
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeRegionAndPriceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRegionAndPriceResponse(DescribeRegionAndPriceResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.DestRegionSet != null) {
            this.DestRegionSet = new RegionDetail[source.DestRegionSet.length];
            for (int i = 0; i < source.DestRegionSet.length; i++) {
                this.DestRegionSet[i] = new RegionDetail(source.DestRegionSet[i]);
            }
        }
        if (source.BandwidthUnitPrice != null) {
            this.BandwidthUnitPrice = new BandwidthPriceGradient[source.BandwidthUnitPrice.length];
            for (int i = 0; i < source.BandwidthUnitPrice.length; i++) {
                this.BandwidthUnitPrice[i] = new BandwidthPriceGradient(source.BandwidthUnitPrice[i]);
            }
        }
        if (source.Currency != null) {
            this.Currency = new String(source.Currency);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "DestRegionSet.", this.DestRegionSet);
        this.setParamArrayObj(map, prefix + "BandwidthUnitPrice.", this.BandwidthUnitPrice);
        this.setParamSimple(map, prefix + "Currency", this.Currency);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


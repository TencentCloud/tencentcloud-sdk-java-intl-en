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

public class InquiryPriceCreateProxyResponse extends AbstractModel{

    /**
    * Basic cost of connection (unit: CNY/day).
    */
    @SerializedName("ProxyDailyPrice")
    @Expose
    private Float ProxyDailyPrice;

    /**
    * Connection bandwidth price gradient.
    */
    @SerializedName("BandwidthUnitPrice")
    @Expose
    private BandwidthPriceGradient [] BandwidthUnitPrice;

    /**
    * Discounted basic cost of connection (unit: CNY/day).
    */
    @SerializedName("DiscountProxyDailyPrice")
    @Expose
    private Float DiscountProxyDailyPrice;

    /**
    * Currency, which supports CNY, USD, etc.
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
     * Get Basic cost of connection (unit: CNY/day). 
     * @return ProxyDailyPrice Basic cost of connection (unit: CNY/day).
     */
    public Float getProxyDailyPrice() {
        return this.ProxyDailyPrice;
    }

    /**
     * Set Basic cost of connection (unit: CNY/day).
     * @param ProxyDailyPrice Basic cost of connection (unit: CNY/day).
     */
    public void setProxyDailyPrice(Float ProxyDailyPrice) {
        this.ProxyDailyPrice = ProxyDailyPrice;
    }

    /**
     * Get Connection bandwidth price gradient. 
     * @return BandwidthUnitPrice Connection bandwidth price gradient.
     */
    public BandwidthPriceGradient [] getBandwidthUnitPrice() {
        return this.BandwidthUnitPrice;
    }

    /**
     * Set Connection bandwidth price gradient.
     * @param BandwidthUnitPrice Connection bandwidth price gradient.
     */
    public void setBandwidthUnitPrice(BandwidthPriceGradient [] BandwidthUnitPrice) {
        this.BandwidthUnitPrice = BandwidthUnitPrice;
    }

    /**
     * Get Discounted basic cost of connection (unit: CNY/day). 
     * @return DiscountProxyDailyPrice Discounted basic cost of connection (unit: CNY/day).
     */
    public Float getDiscountProxyDailyPrice() {
        return this.DiscountProxyDailyPrice;
    }

    /**
     * Set Discounted basic cost of connection (unit: CNY/day).
     * @param DiscountProxyDailyPrice Discounted basic cost of connection (unit: CNY/day).
     */
    public void setDiscountProxyDailyPrice(Float DiscountProxyDailyPrice) {
        this.DiscountProxyDailyPrice = DiscountProxyDailyPrice;
    }

    /**
     * Get Currency, which supports CNY, USD, etc. 
     * @return Currency Currency, which supports CNY, USD, etc.
     */
    public String getCurrency() {
        return this.Currency;
    }

    /**
     * Set Currency, which supports CNY, USD, etc.
     * @param Currency Currency, which supports CNY, USD, etc.
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyDailyPrice", this.ProxyDailyPrice);
        this.setParamArrayObj(map, prefix + "BandwidthUnitPrice.", this.BandwidthUnitPrice);
        this.setParamSimple(map, prefix + "DiscountProxyDailyPrice", this.DiscountProxyDailyPrice);
        this.setParamSimple(map, prefix + "Currency", this.Currency);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


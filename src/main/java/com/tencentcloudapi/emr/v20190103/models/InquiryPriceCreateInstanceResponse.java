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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryPriceCreateInstanceResponse extends AbstractModel {

    /**
    * Original price.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OriginalCost")
    @Expose
    private Float OriginalCost;

    /**
    * Discounted price.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DiscountCost")
    @Expose
    private Float DiscountCost;

    /**
    * Time unit of instance purchase duration. Valid values:
<li>s: seconds.</li>
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * Purchase duration of instance.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * The price list.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PriceList")
    @Expose
    private ZoneDetailPriceResult [] PriceList;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Original price.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return OriginalCost Original price.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Float getOriginalCost() {
        return this.OriginalCost;
    }

    /**
     * Set Original price.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param OriginalCost Original price.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOriginalCost(Float OriginalCost) {
        this.OriginalCost = OriginalCost;
    }

    /**
     * Get Discounted price.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DiscountCost Discounted price.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Float getDiscountCost() {
        return this.DiscountCost;
    }

    /**
     * Set Discounted price.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DiscountCost Discounted price.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDiscountCost(Float DiscountCost) {
        this.DiscountCost = DiscountCost;
    }

    /**
     * Get Time unit of instance purchase duration. Valid values:
<li>s: seconds.</li>
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TimeUnit Time unit of instance purchase duration. Valid values:
<li>s: seconds.</li>
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set Time unit of instance purchase duration. Valid values:
<li>s: seconds.</li>
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TimeUnit Time unit of instance purchase duration. Valid values:
<li>s: seconds.</li>
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get Purchase duration of instance.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TimeSpan Purchase duration of instance.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set Purchase duration of instance.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TimeSpan Purchase duration of instance.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get The price list.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PriceList The price list.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ZoneDetailPriceResult [] getPriceList() {
        return this.PriceList;
    }

    /**
     * Set The price list.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PriceList The price list.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPriceList(ZoneDetailPriceResult [] PriceList) {
        this.PriceList = PriceList;
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

    public InquiryPriceCreateInstanceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquiryPriceCreateInstanceResponse(InquiryPriceCreateInstanceResponse source) {
        if (source.OriginalCost != null) {
            this.OriginalCost = new Float(source.OriginalCost);
        }
        if (source.DiscountCost != null) {
            this.DiscountCost = new Float(source.DiscountCost);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.PriceList != null) {
            this.PriceList = new ZoneDetailPriceResult[source.PriceList.length];
            for (int i = 0; i < source.PriceList.length; i++) {
                this.PriceList[i] = new ZoneDetailPriceResult(source.PriceList[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OriginalCost", this.OriginalCost);
        this.setParamSimple(map, prefix + "DiscountCost", this.DiscountCost);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamArrayObj(map, prefix + "PriceList.", this.PriceList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


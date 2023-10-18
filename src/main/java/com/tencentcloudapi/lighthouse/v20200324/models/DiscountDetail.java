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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiscountDetail extends AbstractModel {

    /**
    * Billing duration.
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * Billing unit.
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * Total price.
    */
    @SerializedName("TotalCost")
    @Expose
    private Float TotalCost;

    /**
    * Discounted total price.
    */
    @SerializedName("RealTotalCost")
    @Expose
    private Float RealTotalCost;

    /**
    * Discount.
    */
    @SerializedName("Discount")
    @Expose
    private Long Discount;

    /**
    * Discount details.
    */
    @SerializedName("PolicyDetail")
    @Expose
    private PolicyDetail PolicyDetail;

    /**
     * Get Billing duration. 
     * @return TimeSpan Billing duration.
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set Billing duration.
     * @param TimeSpan Billing duration.
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get Billing unit. 
     * @return TimeUnit Billing unit.
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set Billing unit.
     * @param TimeUnit Billing unit.
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get Total price. 
     * @return TotalCost Total price.
     */
    public Float getTotalCost() {
        return this.TotalCost;
    }

    /**
     * Set Total price.
     * @param TotalCost Total price.
     */
    public void setTotalCost(Float TotalCost) {
        this.TotalCost = TotalCost;
    }

    /**
     * Get Discounted total price. 
     * @return RealTotalCost Discounted total price.
     */
    public Float getRealTotalCost() {
        return this.RealTotalCost;
    }

    /**
     * Set Discounted total price.
     * @param RealTotalCost Discounted total price.
     */
    public void setRealTotalCost(Float RealTotalCost) {
        this.RealTotalCost = RealTotalCost;
    }

    /**
     * Get Discount. 
     * @return Discount Discount.
     */
    public Long getDiscount() {
        return this.Discount;
    }

    /**
     * Set Discount.
     * @param Discount Discount.
     */
    public void setDiscount(Long Discount) {
        this.Discount = Discount;
    }

    /**
     * Get Discount details. 
     * @return PolicyDetail Discount details.
     */
    public PolicyDetail getPolicyDetail() {
        return this.PolicyDetail;
    }

    /**
     * Set Discount details.
     * @param PolicyDetail Discount details.
     */
    public void setPolicyDetail(PolicyDetail PolicyDetail) {
        this.PolicyDetail = PolicyDetail;
    }

    public DiscountDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiscountDetail(DiscountDetail source) {
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.TotalCost != null) {
            this.TotalCost = new Float(source.TotalCost);
        }
        if (source.RealTotalCost != null) {
            this.RealTotalCost = new Float(source.RealTotalCost);
        }
        if (source.Discount != null) {
            this.Discount = new Long(source.Discount);
        }
        if (source.PolicyDetail != null) {
            this.PolicyDetail = new PolicyDetail(source.PolicyDetail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "TotalCost", this.TotalCost);
        this.setParamSimple(map, prefix + "RealTotalCost", this.RealTotalCost);
        this.setParamSimple(map, prefix + "Discount", this.Discount);
        this.setParamObj(map, prefix + "PolicyDetail.", this.PolicyDetail);

    }
}


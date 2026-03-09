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

public class DiscountDetail extends AbstractModel {

    /**
    * <P>Billing duration.</p>.
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * <P>Time unit.<br>value is:</p><ul><li>m - month</li><li>d - day</li></ul>.
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * <P>Total price.</p><p>unit: usd</p>.
    */
    @SerializedName("TotalCost")
    @Expose
    private Float TotalCost;

    /**
    * <P>Discounted total price.</p><p>unit: usd</p>.
    */
    @SerializedName("RealTotalCost")
    @Expose
    private Float RealTotalCost;

    /**
    * <p>Discount.</p>.
    */
    @SerializedName("Discount")
    @Expose
    private Float Discount;

    /**
    * <P>Specific discount details.</p>.
    */
    @SerializedName("PolicyDetail")
    @Expose
    private PolicyDetail PolicyDetail;

    /**
     * Get <P>Billing duration.</p>. 
     * @return TimeSpan <P>Billing duration.</p>.
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set <P>Billing duration.</p>.
     * @param TimeSpan <P>Billing duration.</p>.
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get <P>Time unit.<br>value is:</p><ul><li>m - month</li><li>d - day</li></ul>. 
     * @return TimeUnit <P>Time unit.<br>value is:</p><ul><li>m - month</li><li>d - day</li></ul>.
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set <P>Time unit.<br>value is:</p><ul><li>m - month</li><li>d - day</li></ul>.
     * @param TimeUnit <P>Time unit.<br>value is:</p><ul><li>m - month</li><li>d - day</li></ul>.
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get <P>Total price.</p><p>unit: usd</p>. 
     * @return TotalCost <P>Total price.</p><p>unit: usd</p>.
     */
    public Float getTotalCost() {
        return this.TotalCost;
    }

    /**
     * Set <P>Total price.</p><p>unit: usd</p>.
     * @param TotalCost <P>Total price.</p><p>unit: usd</p>.
     */
    public void setTotalCost(Float TotalCost) {
        this.TotalCost = TotalCost;
    }

    /**
     * Get <P>Discounted total price.</p><p>unit: usd</p>. 
     * @return RealTotalCost <P>Discounted total price.</p><p>unit: usd</p>.
     */
    public Float getRealTotalCost() {
        return this.RealTotalCost;
    }

    /**
     * Set <P>Discounted total price.</p><p>unit: usd</p>.
     * @param RealTotalCost <P>Discounted total price.</p><p>unit: usd</p>.
     */
    public void setRealTotalCost(Float RealTotalCost) {
        this.RealTotalCost = RealTotalCost;
    }

    /**
     * Get <p>Discount.</p>. 
     * @return Discount <p>Discount.</p>.
     */
    public Float getDiscount() {
        return this.Discount;
    }

    /**
     * Set <p>Discount.</p>.
     * @param Discount <p>Discount.</p>.
     */
    public void setDiscount(Float Discount) {
        this.Discount = Discount;
    }

    /**
     * Get <P>Specific discount details.</p>. 
     * @return PolicyDetail <P>Specific discount details.</p>.
     */
    public PolicyDetail getPolicyDetail() {
        return this.PolicyDetail;
    }

    /**
     * Set <P>Specific discount details.</p>.
     * @param PolicyDetail <P>Specific discount details.</p>.
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
            this.Discount = new Float(source.Discount);
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


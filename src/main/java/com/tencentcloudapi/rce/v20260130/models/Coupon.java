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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Coupon extends AbstractModel {

    /**
    * <p>The unique ID of each coupon</p>
    */
    @SerializedName("CouponId")
    @Expose
    private String CouponId;

    /**
    * <p>The name of the coupon</p>
    */
    @SerializedName("CouponName")
    @Expose
    private String CouponName;

    /**
    * <p>The start time of the coupon</p><p>Parameter format: Millisecond-level time with UTC time zone compliant with ISO 8601.</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>The expiration time of the coupon</p><p>Parameter format: Millisecond-level time with UTC time zone compliant with ISO 8601 standard</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * <p>The percentage rate of the coupon. If discount off is 10%,please send 0.1</p>
    */
    @SerializedName("PercentageRate")
    @Expose
    private Float PercentageRate;

    /**
    * <p>The discount amount of the coupon</p>
    */
    @SerializedName("DiscountAmount")
    @Expose
    private Amount DiscountAmount;

    /**
    * <p>The threshold amount of the coupon</p>
    */
    @SerializedName("Threshold")
    @Expose
    private Float Threshold;

    /**
     * Get <p>The unique ID of each coupon</p> 
     * @return CouponId <p>The unique ID of each coupon</p>
     */
    public String getCouponId() {
        return this.CouponId;
    }

    /**
     * Set <p>The unique ID of each coupon</p>
     * @param CouponId <p>The unique ID of each coupon</p>
     */
    public void setCouponId(String CouponId) {
        this.CouponId = CouponId;
    }

    /**
     * Get <p>The name of the coupon</p> 
     * @return CouponName <p>The name of the coupon</p>
     */
    public String getCouponName() {
        return this.CouponName;
    }

    /**
     * Set <p>The name of the coupon</p>
     * @param CouponName <p>The name of the coupon</p>
     */
    public void setCouponName(String CouponName) {
        this.CouponName = CouponName;
    }

    /**
     * Get <p>The start time of the coupon</p><p>Parameter format: Millisecond-level time with UTC time zone compliant with ISO 8601.</p> 
     * @return StartTime <p>The start time of the coupon</p><p>Parameter format: Millisecond-level time with UTC time zone compliant with ISO 8601.</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>The start time of the coupon</p><p>Parameter format: Millisecond-level time with UTC time zone compliant with ISO 8601.</p>
     * @param StartTime <p>The start time of the coupon</p><p>Parameter format: Millisecond-level time with UTC time zone compliant with ISO 8601.</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>The expiration time of the coupon</p><p>Parameter format: Millisecond-level time with UTC time zone compliant with ISO 8601 standard</p> 
     * @return ExpireTime <p>The expiration time of the coupon</p><p>Parameter format: Millisecond-level time with UTC time zone compliant with ISO 8601 standard</p>
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>The expiration time of the coupon</p><p>Parameter format: Millisecond-level time with UTC time zone compliant with ISO 8601 standard</p>
     * @param ExpireTime <p>The expiration time of the coupon</p><p>Parameter format: Millisecond-level time with UTC time zone compliant with ISO 8601 standard</p>
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>The percentage rate of the coupon. If discount off is 10%,please send 0.1</p> 
     * @return PercentageRate <p>The percentage rate of the coupon. If discount off is 10%,please send 0.1</p>
     */
    public Float getPercentageRate() {
        return this.PercentageRate;
    }

    /**
     * Set <p>The percentage rate of the coupon. If discount off is 10%,please send 0.1</p>
     * @param PercentageRate <p>The percentage rate of the coupon. If discount off is 10%,please send 0.1</p>
     */
    public void setPercentageRate(Float PercentageRate) {
        this.PercentageRate = PercentageRate;
    }

    /**
     * Get <p>The discount amount of the coupon</p> 
     * @return DiscountAmount <p>The discount amount of the coupon</p>
     */
    public Amount getDiscountAmount() {
        return this.DiscountAmount;
    }

    /**
     * Set <p>The discount amount of the coupon</p>
     * @param DiscountAmount <p>The discount amount of the coupon</p>
     */
    public void setDiscountAmount(Amount DiscountAmount) {
        this.DiscountAmount = DiscountAmount;
    }

    /**
     * Get <p>The threshold amount of the coupon</p> 
     * @return Threshold <p>The threshold amount of the coupon</p>
     */
    public Float getThreshold() {
        return this.Threshold;
    }

    /**
     * Set <p>The threshold amount of the coupon</p>
     * @param Threshold <p>The threshold amount of the coupon</p>
     */
    public void setThreshold(Float Threshold) {
        this.Threshold = Threshold;
    }

    public Coupon() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Coupon(Coupon source) {
        if (source.CouponId != null) {
            this.CouponId = new String(source.CouponId);
        }
        if (source.CouponName != null) {
            this.CouponName = new String(source.CouponName);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.PercentageRate != null) {
            this.PercentageRate = new Float(source.PercentageRate);
        }
        if (source.DiscountAmount != null) {
            this.DiscountAmount = new Amount(source.DiscountAmount);
        }
        if (source.Threshold != null) {
            this.Threshold = new Float(source.Threshold);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CouponId", this.CouponId);
        this.setParamSimple(map, prefix + "CouponName", this.CouponName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "PercentageRate", this.PercentageRate);
        this.setParamObj(map, prefix + "DiscountAmount.", this.DiscountAmount);
        this.setParamSimple(map, prefix + "Threshold", this.Threshold);

    }
}


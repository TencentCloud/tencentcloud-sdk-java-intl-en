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

public class InstancePrice extends AbstractModel {

    /**
    * Original package unit price.
    */
    @SerializedName("OriginalBundlePrice")
    @Expose
    private Float OriginalBundlePrice;

    /**
    * Original price.
    */
    @SerializedName("OriginalPrice")
    @Expose
    private Float OriginalPrice;

    /**
    * Discount.
    */
    @SerializedName("Discount")
    @Expose
    private Long Discount;

    /**
    * Discounted price.
    */
    @SerializedName("DiscountPrice")
    @Expose
    private Float DiscountPrice;

    /**
    * Currency unit. Valid values: `CNY` and `USD`.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
     * Get Original package unit price. 
     * @return OriginalBundlePrice Original package unit price.
     */
    public Float getOriginalBundlePrice() {
        return this.OriginalBundlePrice;
    }

    /**
     * Set Original package unit price.
     * @param OriginalBundlePrice Original package unit price.
     */
    public void setOriginalBundlePrice(Float OriginalBundlePrice) {
        this.OriginalBundlePrice = OriginalBundlePrice;
    }

    /**
     * Get Original price. 
     * @return OriginalPrice Original price.
     */
    public Float getOriginalPrice() {
        return this.OriginalPrice;
    }

    /**
     * Set Original price.
     * @param OriginalPrice Original price.
     */
    public void setOriginalPrice(Float OriginalPrice) {
        this.OriginalPrice = OriginalPrice;
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
     * Get Discounted price. 
     * @return DiscountPrice Discounted price.
     */
    public Float getDiscountPrice() {
        return this.DiscountPrice;
    }

    /**
     * Set Discounted price.
     * @param DiscountPrice Discounted price.
     */
    public void setDiscountPrice(Float DiscountPrice) {
        this.DiscountPrice = DiscountPrice;
    }

    /**
     * Get Currency unit. Valid values: `CNY` and `USD`.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Currency Currency unit. Valid values: `CNY` and `USD`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getCurrency() {
        return this.Currency;
    }

    /**
     * Set Currency unit. Valid values: `CNY` and `USD`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Currency Currency unit. Valid values: `CNY` and `USD`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    public InstancePrice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstancePrice(InstancePrice source) {
        if (source.OriginalBundlePrice != null) {
            this.OriginalBundlePrice = new Float(source.OriginalBundlePrice);
        }
        if (source.OriginalPrice != null) {
            this.OriginalPrice = new Float(source.OriginalPrice);
        }
        if (source.Discount != null) {
            this.Discount = new Long(source.Discount);
        }
        if (source.DiscountPrice != null) {
            this.DiscountPrice = new Float(source.DiscountPrice);
        }
        if (source.Currency != null) {
            this.Currency = new String(source.Currency);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OriginalBundlePrice", this.OriginalBundlePrice);
        this.setParamSimple(map, prefix + "OriginalPrice", this.OriginalPrice);
        this.setParamSimple(map, prefix + "Discount", this.Discount);
        this.setParamSimple(map, prefix + "DiscountPrice", this.DiscountPrice);
        this.setParamSimple(map, prefix + "Currency", this.Currency);

    }
}


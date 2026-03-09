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
    * <P>Unit price of the package.</p><p>unit: usd</p>.
    */
    @SerializedName("OriginalBundlePrice")
    @Expose
    private Float OriginalBundlePrice;

    /**
    * <P>Original price.</p><p>unit: usd</p>.
    */
    @SerializedName("OriginalPrice")
    @Expose
    private Float OriginalPrice;

    /**
    * <p>Discount.</p>.
    */
    @SerializedName("Discount")
    @Expose
    private Float Discount;

    /**
    * <P>Discounted price.</p><p>unit: usd</p>.
    */
    @SerializedName("DiscountPrice")
    @Expose
    private Float DiscountPrice;

    /**
    * <p>Price currency unit. valid values: USD.</p>.
    */
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
    * <P>Billing item detail.</p>.
    */
    @SerializedName("DetailPrices")
    @Expose
    private DetailPrice [] DetailPrices;

    /**
     * Get <P>Unit price of the package.</p><p>unit: usd</p>. 
     * @return OriginalBundlePrice <P>Unit price of the package.</p><p>unit: usd</p>.
     */
    public Float getOriginalBundlePrice() {
        return this.OriginalBundlePrice;
    }

    /**
     * Set <P>Unit price of the package.</p><p>unit: usd</p>.
     * @param OriginalBundlePrice <P>Unit price of the package.</p><p>unit: usd</p>.
     */
    public void setOriginalBundlePrice(Float OriginalBundlePrice) {
        this.OriginalBundlePrice = OriginalBundlePrice;
    }

    /**
     * Get <P>Original price.</p><p>unit: usd</p>. 
     * @return OriginalPrice <P>Original price.</p><p>unit: usd</p>.
     */
    public Float getOriginalPrice() {
        return this.OriginalPrice;
    }

    /**
     * Set <P>Original price.</p><p>unit: usd</p>.
     * @param OriginalPrice <P>Original price.</p><p>unit: usd</p>.
     */
    public void setOriginalPrice(Float OriginalPrice) {
        this.OriginalPrice = OriginalPrice;
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
     * Get <P>Discounted price.</p><p>unit: usd</p>. 
     * @return DiscountPrice <P>Discounted price.</p><p>unit: usd</p>.
     */
    public Float getDiscountPrice() {
        return this.DiscountPrice;
    }

    /**
     * Set <P>Discounted price.</p><p>unit: usd</p>.
     * @param DiscountPrice <P>Discounted price.</p><p>unit: usd</p>.
     */
    public void setDiscountPrice(Float DiscountPrice) {
        this.DiscountPrice = DiscountPrice;
    }

    /**
     * Get <p>Price currency unit. valid values: USD.</p>. 
     * @return Currency <p>Price currency unit. valid values: USD.</p>.
     */
    public String getCurrency() {
        return this.Currency;
    }

    /**
     * Set <p>Price currency unit. valid values: USD.</p>.
     * @param Currency <p>Price currency unit. valid values: USD.</p>.
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    /**
     * Get <P>Billing item detail.</p>. 
     * @return DetailPrices <P>Billing item detail.</p>.
     */
    public DetailPrice [] getDetailPrices() {
        return this.DetailPrices;
    }

    /**
     * Set <P>Billing item detail.</p>.
     * @param DetailPrices <P>Billing item detail.</p>.
     */
    public void setDetailPrices(DetailPrice [] DetailPrices) {
        this.DetailPrices = DetailPrices;
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
            this.Discount = new Float(source.Discount);
        }
        if (source.DiscountPrice != null) {
            this.DiscountPrice = new Float(source.DiscountPrice);
        }
        if (source.Currency != null) {
            this.Currency = new String(source.Currency);
        }
        if (source.DetailPrices != null) {
            this.DetailPrices = new DetailPrice[source.DetailPrices.length];
            for (int i = 0; i < source.DetailPrices.length; i++) {
                this.DetailPrices[i] = new DetailPrice(source.DetailPrices[i]);
            }
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
        this.setParamArrayObj(map, prefix + "DetailPrices.", this.DetailPrices);

    }
}


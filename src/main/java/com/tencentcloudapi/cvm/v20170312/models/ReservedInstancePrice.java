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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReservedInstancePrice extends AbstractModel{

    /**
    * Original upfront payment, in USD.
    */
    @SerializedName("OriginalFixedPrice")
    @Expose
    private Float OriginalFixedPrice;

    /**
    * Discounted upfront payment, in USD.
    */
    @SerializedName("DiscountFixedPrice")
    @Expose
    private Float DiscountFixedPrice;

    /**
    * Original subsequent unit price, in USD/hr.
    */
    @SerializedName("OriginalUsagePrice")
    @Expose
    private Float OriginalUsagePrice;

    /**
    * Discounted subsequent unit price, in USD/hr.
    */
    @SerializedName("DiscountUsagePrice")
    @Expose
    private Float DiscountUsagePrice;

    /**
     * Get Original upfront payment, in USD. 
     * @return OriginalFixedPrice Original upfront payment, in USD.
     */
    public Float getOriginalFixedPrice() {
        return this.OriginalFixedPrice;
    }

    /**
     * Set Original upfront payment, in USD.
     * @param OriginalFixedPrice Original upfront payment, in USD.
     */
    public void setOriginalFixedPrice(Float OriginalFixedPrice) {
        this.OriginalFixedPrice = OriginalFixedPrice;
    }

    /**
     * Get Discounted upfront payment, in USD. 
     * @return DiscountFixedPrice Discounted upfront payment, in USD.
     */
    public Float getDiscountFixedPrice() {
        return this.DiscountFixedPrice;
    }

    /**
     * Set Discounted upfront payment, in USD.
     * @param DiscountFixedPrice Discounted upfront payment, in USD.
     */
    public void setDiscountFixedPrice(Float DiscountFixedPrice) {
        this.DiscountFixedPrice = DiscountFixedPrice;
    }

    /**
     * Get Original subsequent unit price, in USD/hr. 
     * @return OriginalUsagePrice Original subsequent unit price, in USD/hr.
     */
    public Float getOriginalUsagePrice() {
        return this.OriginalUsagePrice;
    }

    /**
     * Set Original subsequent unit price, in USD/hr.
     * @param OriginalUsagePrice Original subsequent unit price, in USD/hr.
     */
    public void setOriginalUsagePrice(Float OriginalUsagePrice) {
        this.OriginalUsagePrice = OriginalUsagePrice;
    }

    /**
     * Get Discounted subsequent unit price, in USD/hr. 
     * @return DiscountUsagePrice Discounted subsequent unit price, in USD/hr.
     */
    public Float getDiscountUsagePrice() {
        return this.DiscountUsagePrice;
    }

    /**
     * Set Discounted subsequent unit price, in USD/hr.
     * @param DiscountUsagePrice Discounted subsequent unit price, in USD/hr.
     */
    public void setDiscountUsagePrice(Float DiscountUsagePrice) {
        this.DiscountUsagePrice = DiscountUsagePrice;
    }

    public ReservedInstancePrice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReservedInstancePrice(ReservedInstancePrice source) {
        if (source.OriginalFixedPrice != null) {
            this.OriginalFixedPrice = new Float(source.OriginalFixedPrice);
        }
        if (source.DiscountFixedPrice != null) {
            this.DiscountFixedPrice = new Float(source.DiscountFixedPrice);
        }
        if (source.OriginalUsagePrice != null) {
            this.OriginalUsagePrice = new Float(source.OriginalUsagePrice);
        }
        if (source.DiscountUsagePrice != null) {
            this.DiscountUsagePrice = new Float(source.DiscountUsagePrice);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OriginalFixedPrice", this.OriginalFixedPrice);
        this.setParamSimple(map, prefix + "DiscountFixedPrice", this.DiscountFixedPrice);
        this.setParamSimple(map, prefix + "OriginalUsagePrice", this.OriginalUsagePrice);
        this.setParamSimple(map, prefix + "DiscountUsagePrice", this.DiscountUsagePrice);

    }
}


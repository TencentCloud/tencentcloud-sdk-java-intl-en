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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BlueprintPrice extends AbstractModel{

    /**
    * Original image unit price in USD.
    */
    @SerializedName("OriginalBlueprintPrice")
    @Expose
    private Float OriginalBlueprintPrice;

    /**
    * Original image total price in USD.
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
    * Discounted image total price in USD.
    */
    @SerializedName("DiscountPrice")
    @Expose
    private Float DiscountPrice;

    /**
     * Get Original image unit price in USD. 
     * @return OriginalBlueprintPrice Original image unit price in USD.
     */
    public Float getOriginalBlueprintPrice() {
        return this.OriginalBlueprintPrice;
    }

    /**
     * Set Original image unit price in USD.
     * @param OriginalBlueprintPrice Original image unit price in USD.
     */
    public void setOriginalBlueprintPrice(Float OriginalBlueprintPrice) {
        this.OriginalBlueprintPrice = OriginalBlueprintPrice;
    }

    /**
     * Get Original image total price in USD. 
     * @return OriginalPrice Original image total price in USD.
     */
    public Float getOriginalPrice() {
        return this.OriginalPrice;
    }

    /**
     * Set Original image total price in USD.
     * @param OriginalPrice Original image total price in USD.
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
     * Get Discounted image total price in USD. 
     * @return DiscountPrice Discounted image total price in USD.
     */
    public Float getDiscountPrice() {
        return this.DiscountPrice;
    }

    /**
     * Set Discounted image total price in USD.
     * @param DiscountPrice Discounted image total price in USD.
     */
    public void setDiscountPrice(Float DiscountPrice) {
        this.DiscountPrice = DiscountPrice;
    }

    public BlueprintPrice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BlueprintPrice(BlueprintPrice source) {
        if (source.OriginalBlueprintPrice != null) {
            this.OriginalBlueprintPrice = new Float(source.OriginalBlueprintPrice);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OriginalBlueprintPrice", this.OriginalBlueprintPrice);
        this.setParamSimple(map, prefix + "OriginalPrice", this.OriginalPrice);
        this.setParamSimple(map, prefix + "Discount", this.Discount);
        this.setParamSimple(map, prefix + "DiscountPrice", this.DiscountPrice);

    }
}


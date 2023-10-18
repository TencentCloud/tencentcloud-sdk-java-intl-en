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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PriceDetail extends AbstractModel {

    /**
    * Discount, such as `20`, which represents 80% off
    */
    @SerializedName("Discount")
    @Expose
    private Long Discount;

    /**
    * Discounted price in cents
    */
    @SerializedName("DiscountPrice")
    @Expose
    private Long DiscountPrice;

    /**
    * Original price in cents
    */
    @SerializedName("OriginalPrice")
    @Expose
    private Long OriginalPrice;

    /**
     * Get Discount, such as `20`, which represents 80% off 
     * @return Discount Discount, such as `20`, which represents 80% off
     */
    public Long getDiscount() {
        return this.Discount;
    }

    /**
     * Set Discount, such as `20`, which represents 80% off
     * @param Discount Discount, such as `20`, which represents 80% off
     */
    public void setDiscount(Long Discount) {
        this.Discount = Discount;
    }

    /**
     * Get Discounted price in cents 
     * @return DiscountPrice Discounted price in cents
     */
    public Long getDiscountPrice() {
        return this.DiscountPrice;
    }

    /**
     * Set Discounted price in cents
     * @param DiscountPrice Discounted price in cents
     */
    public void setDiscountPrice(Long DiscountPrice) {
        this.DiscountPrice = DiscountPrice;
    }

    /**
     * Get Original price in cents 
     * @return OriginalPrice Original price in cents
     */
    public Long getOriginalPrice() {
        return this.OriginalPrice;
    }

    /**
     * Set Original price in cents
     * @param OriginalPrice Original price in cents
     */
    public void setOriginalPrice(Long OriginalPrice) {
        this.OriginalPrice = OriginalPrice;
    }

    public PriceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PriceDetail(PriceDetail source) {
        if (source.Discount != null) {
            this.Discount = new Long(source.Discount);
        }
        if (source.DiscountPrice != null) {
            this.DiscountPrice = new Long(source.DiscountPrice);
        }
        if (source.OriginalPrice != null) {
            this.OriginalPrice = new Long(source.OriginalPrice);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Discount", this.Discount);
        this.setParamSimple(map, prefix + "DiscountPrice", this.DiscountPrice);
        this.setParamSimple(map, prefix + "OriginalPrice", this.OriginalPrice);

    }
}


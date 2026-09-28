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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PostPayPriceInfo extends AbstractModel {

    /**
    * Discount, such as 20.0 representing 80% off.
    */
    @SerializedName("Discount")
    @Expose
    private Float Discount;

    /**
    * Unit price, in CNY.
    */
    @SerializedName("UnitPrice")
    @Expose
    private Float UnitPrice;

    /**
    * Discounted unit price. Unit: CNY.
    */
    @SerializedName("UnitPriceDiscount")
    @Expose
    private Float UnitPriceDiscount;

    /**
     * Get Discount, such as 20.0 representing 80% off. 
     * @return Discount Discount, such as 20.0 representing 80% off.
     */
    public Float getDiscount() {
        return this.Discount;
    }

    /**
     * Set Discount, such as 20.0 representing 80% off.
     * @param Discount Discount, such as 20.0 representing 80% off.
     */
    public void setDiscount(Float Discount) {
        this.Discount = Discount;
    }

    /**
     * Get Unit price, in CNY. 
     * @return UnitPrice Unit price, in CNY.
     */
    public Float getUnitPrice() {
        return this.UnitPrice;
    }

    /**
     * Set Unit price, in CNY.
     * @param UnitPrice Unit price, in CNY.
     */
    public void setUnitPrice(Float UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    /**
     * Get Discounted unit price. Unit: CNY. 
     * @return UnitPriceDiscount Discounted unit price. Unit: CNY.
     */
    public Float getUnitPriceDiscount() {
        return this.UnitPriceDiscount;
    }

    /**
     * Set Discounted unit price. Unit: CNY.
     * @param UnitPriceDiscount Discounted unit price. Unit: CNY.
     */
    public void setUnitPriceDiscount(Float UnitPriceDiscount) {
        this.UnitPriceDiscount = UnitPriceDiscount;
    }

    public PostPayPriceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PostPayPriceInfo(PostPayPriceInfo source) {
        if (source.Discount != null) {
            this.Discount = new Float(source.Discount);
        }
        if (source.UnitPrice != null) {
            this.UnitPrice = new Float(source.UnitPrice);
        }
        if (source.UnitPriceDiscount != null) {
            this.UnitPriceDiscount = new Float(source.UnitPriceDiscount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Discount", this.Discount);
        this.setParamSimple(map, prefix + "UnitPrice", this.UnitPrice);
        this.setParamSimple(map, prefix + "UnitPriceDiscount", this.UnitPriceDiscount);

    }
}


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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstancesPrice extends AbstractModel{

    /**
    * Instance price details
    */
    @SerializedName("InstancePricesPartDetail")
    @Expose
    private InstancePricesPartDetail InstancePricesPartDetail;

    /**
    * Discount on the total instance price
    */
    @SerializedName("Discount")
    @Expose
    private Long Discount;

    /**
    * Discounted price
    */
    @SerializedName("DiscountPrice")
    @Expose
    private Long DiscountPrice;

    /**
    * Original cost
    */
    @SerializedName("OriginalPrice")
    @Expose
    private Long OriginalPrice;

    /**
     * Get Instance price details 
     * @return InstancePricesPartDetail Instance price details
     */
    public InstancePricesPartDetail getInstancePricesPartDetail() {
        return this.InstancePricesPartDetail;
    }

    /**
     * Set Instance price details
     * @param InstancePricesPartDetail Instance price details
     */
    public void setInstancePricesPartDetail(InstancePricesPartDetail InstancePricesPartDetail) {
        this.InstancePricesPartDetail = InstancePricesPartDetail;
    }

    /**
     * Get Discount on the total instance price 
     * @return Discount Discount on the total instance price
     */
    public Long getDiscount() {
        return this.Discount;
    }

    /**
     * Set Discount on the total instance price
     * @param Discount Discount on the total instance price
     */
    public void setDiscount(Long Discount) {
        this.Discount = Discount;
    }

    /**
     * Get Discounted price 
     * @return DiscountPrice Discounted price
     */
    public Long getDiscountPrice() {
        return this.DiscountPrice;
    }

    /**
     * Set Discounted price
     * @param DiscountPrice Discounted price
     */
    public void setDiscountPrice(Long DiscountPrice) {
        this.DiscountPrice = DiscountPrice;
    }

    /**
     * Get Original cost 
     * @return OriginalPrice Original cost
     */
    public Long getOriginalPrice() {
        return this.OriginalPrice;
    }

    /**
     * Set Original cost
     * @param OriginalPrice Original cost
     */
    public void setOriginalPrice(Long OriginalPrice) {
        this.OriginalPrice = OriginalPrice;
    }

    public InstancesPrice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstancesPrice(InstancesPrice source) {
        if (source.InstancePricesPartDetail != null) {
            this.InstancePricesPartDetail = new InstancePricesPartDetail(source.InstancePricesPartDetail);
        }
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
        this.setParamObj(map, prefix + "InstancePricesPartDetail.", this.InstancePricesPartDetail);
        this.setParamSimple(map, prefix + "Discount", this.Discount);
        this.setParamSimple(map, prefix + "DiscountPrice", this.DiscountPrice);
        this.setParamSimple(map, prefix + "OriginalPrice", this.OriginalPrice);

    }
}


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

public class DiskPrice extends AbstractModel {

    /**
    * Cloud disk unit price.
    */
    @SerializedName("OriginalDiskPrice")
    @Expose
    private Float OriginalDiskPrice;

    /**
    * Total cloud disk price.
    */
    @SerializedName("OriginalPrice")
    @Expose
    private Float OriginalPrice;

    /**
    * Discount.
    */
    @SerializedName("Discount")
    @Expose
    private Float Discount;

    /**
    * Discounted total price.
    */
    @SerializedName("DiscountPrice")
    @Expose
    private Float DiscountPrice;

    /**
    * Detailed billing items
    */
    @SerializedName("DetailPrices")
    @Expose
    private DetailPrice [] DetailPrices;

    /**
     * Get Cloud disk unit price. 
     * @return OriginalDiskPrice Cloud disk unit price.
     */
    public Float getOriginalDiskPrice() {
        return this.OriginalDiskPrice;
    }

    /**
     * Set Cloud disk unit price.
     * @param OriginalDiskPrice Cloud disk unit price.
     */
    public void setOriginalDiskPrice(Float OriginalDiskPrice) {
        this.OriginalDiskPrice = OriginalDiskPrice;
    }

    /**
     * Get Total cloud disk price. 
     * @return OriginalPrice Total cloud disk price.
     */
    public Float getOriginalPrice() {
        return this.OriginalPrice;
    }

    /**
     * Set Total cloud disk price.
     * @param OriginalPrice Total cloud disk price.
     */
    public void setOriginalPrice(Float OriginalPrice) {
        this.OriginalPrice = OriginalPrice;
    }

    /**
     * Get Discount. 
     * @return Discount Discount.
     */
    public Float getDiscount() {
        return this.Discount;
    }

    /**
     * Set Discount.
     * @param Discount Discount.
     */
    public void setDiscount(Float Discount) {
        this.Discount = Discount;
    }

    /**
     * Get Discounted total price. 
     * @return DiscountPrice Discounted total price.
     */
    public Float getDiscountPrice() {
        return this.DiscountPrice;
    }

    /**
     * Set Discounted total price.
     * @param DiscountPrice Discounted total price.
     */
    public void setDiscountPrice(Float DiscountPrice) {
        this.DiscountPrice = DiscountPrice;
    }

    /**
     * Get Detailed billing items 
     * @return DetailPrices Detailed billing items
     */
    public DetailPrice [] getDetailPrices() {
        return this.DetailPrices;
    }

    /**
     * Set Detailed billing items
     * @param DetailPrices Detailed billing items
     */
    public void setDetailPrices(DetailPrice [] DetailPrices) {
        this.DetailPrices = DetailPrices;
    }

    public DiskPrice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiskPrice(DiskPrice source) {
        if (source.OriginalDiskPrice != null) {
            this.OriginalDiskPrice = new Float(source.OriginalDiskPrice);
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
        this.setParamSimple(map, prefix + "OriginalDiskPrice", this.OriginalDiskPrice);
        this.setParamSimple(map, prefix + "OriginalPrice", this.OriginalPrice);
        this.setParamSimple(map, prefix + "Discount", this.Discount);
        this.setParamSimple(map, prefix + "DiscountPrice", this.DiscountPrice);
        this.setParamArrayObj(map, prefix + "DetailPrices.", this.DetailPrices);

    }
}


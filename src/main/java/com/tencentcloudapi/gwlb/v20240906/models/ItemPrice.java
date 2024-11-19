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
package com.tencentcloudapi.gwlb.v20240906.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ItemPrice extends AbstractModel {

    /**
    * Postpaid unit price. Unit: CNY.

Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("UnitPrice")
    @Expose
    private Float UnitPrice;

    /**
    * Pay-as-you-go billing unit. Valid values: HOUR: indicates that the billing unit is calculated by hour. Current scenarios involving this billing unit include: postpaid by hour for instances (POSTPAID_BY_HOUR).Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ChargeUnit")
    @Expose
    private String ChargeUnit;

    /**
    * Original price of pre-payment (in CNY).

Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("OriginalPrice")
    @Expose
    private Float OriginalPrice;

    /**
    * Discount price of prepaid costs, unit: CNY.

Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DiscountPrice")
    @Expose
    private Float DiscountPrice;

    /**
    * Discounted unit price for pay-as-you-go. Unit: CNY.Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("UnitPriceDiscount")
    @Expose
    private Float UnitPriceDiscount;

    /**
    * Discount, such as 20.0 representing 80% off.

Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Discount")
    @Expose
    private Float Discount;

    /**
     * Get Postpaid unit price. Unit: CNY.

Note: This field may return null, indicating that no valid value can be obtained. 
     * @return UnitPrice Postpaid unit price. Unit: CNY.

Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Float getUnitPrice() {
        return this.UnitPrice;
    }

    /**
     * Set Postpaid unit price. Unit: CNY.

Note: This field may return null, indicating that no valid value can be obtained.
     * @param UnitPrice Postpaid unit price. Unit: CNY.

Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setUnitPrice(Float UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    /**
     * Get Pay-as-you-go billing unit. Valid values: HOUR: indicates that the billing unit is calculated by hour. Current scenarios involving this billing unit include: postpaid by hour for instances (POSTPAID_BY_HOUR).Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ChargeUnit Pay-as-you-go billing unit. Valid values: HOUR: indicates that the billing unit is calculated by hour. Current scenarios involving this billing unit include: postpaid by hour for instances (POSTPAID_BY_HOUR).Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getChargeUnit() {
        return this.ChargeUnit;
    }

    /**
     * Set Pay-as-you-go billing unit. Valid values: HOUR: indicates that the billing unit is calculated by hour. Current scenarios involving this billing unit include: postpaid by hour for instances (POSTPAID_BY_HOUR).Note: This field may return null, indicating that no valid value can be obtained.
     * @param ChargeUnit Pay-as-you-go billing unit. Valid values: HOUR: indicates that the billing unit is calculated by hour. Current scenarios involving this billing unit include: postpaid by hour for instances (POSTPAID_BY_HOUR).Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setChargeUnit(String ChargeUnit) {
        this.ChargeUnit = ChargeUnit;
    }

    /**
     * Get Original price of pre-payment (in CNY).

Note: This field may return null, indicating that no valid value can be obtained. 
     * @return OriginalPrice Original price of pre-payment (in CNY).

Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Float getOriginalPrice() {
        return this.OriginalPrice;
    }

    /**
     * Set Original price of pre-payment (in CNY).

Note: This field may return null, indicating that no valid value can be obtained.
     * @param OriginalPrice Original price of pre-payment (in CNY).

Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOriginalPrice(Float OriginalPrice) {
        this.OriginalPrice = OriginalPrice;
    }

    /**
     * Get Discount price of prepaid costs, unit: CNY.

Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DiscountPrice Discount price of prepaid costs, unit: CNY.

Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Float getDiscountPrice() {
        return this.DiscountPrice;
    }

    /**
     * Set Discount price of prepaid costs, unit: CNY.

Note: This field may return null, indicating that no valid value can be obtained.
     * @param DiscountPrice Discount price of prepaid costs, unit: CNY.

Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDiscountPrice(Float DiscountPrice) {
        this.DiscountPrice = DiscountPrice;
    }

    /**
     * Get Discounted unit price for pay-as-you-go. Unit: CNY.Note: This field may return null, indicating that no valid value can be obtained. 
     * @return UnitPriceDiscount Discounted unit price for pay-as-you-go. Unit: CNY.Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Float getUnitPriceDiscount() {
        return this.UnitPriceDiscount;
    }

    /**
     * Set Discounted unit price for pay-as-you-go. Unit: CNY.Note: This field may return null, indicating that no valid value can be obtained.
     * @param UnitPriceDiscount Discounted unit price for pay-as-you-go. Unit: CNY.Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setUnitPriceDiscount(Float UnitPriceDiscount) {
        this.UnitPriceDiscount = UnitPriceDiscount;
    }

    /**
     * Get Discount, such as 20.0 representing 80% off.

Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Discount Discount, such as 20.0 representing 80% off.

Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Float getDiscount() {
        return this.Discount;
    }

    /**
     * Set Discount, such as 20.0 representing 80% off.

Note: This field may return null, indicating that no valid value can be obtained.
     * @param Discount Discount, such as 20.0 representing 80% off.

Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDiscount(Float Discount) {
        this.Discount = Discount;
    }

    public ItemPrice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ItemPrice(ItemPrice source) {
        if (source.UnitPrice != null) {
            this.UnitPrice = new Float(source.UnitPrice);
        }
        if (source.ChargeUnit != null) {
            this.ChargeUnit = new String(source.ChargeUnit);
        }
        if (source.OriginalPrice != null) {
            this.OriginalPrice = new Float(source.OriginalPrice);
        }
        if (source.DiscountPrice != null) {
            this.DiscountPrice = new Float(source.DiscountPrice);
        }
        if (source.UnitPriceDiscount != null) {
            this.UnitPriceDiscount = new Float(source.UnitPriceDiscount);
        }
        if (source.Discount != null) {
            this.Discount = new Float(source.Discount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UnitPrice", this.UnitPrice);
        this.setParamSimple(map, prefix + "ChargeUnit", this.ChargeUnit);
        this.setParamSimple(map, prefix + "OriginalPrice", this.OriginalPrice);
        this.setParamSimple(map, prefix + "DiscountPrice", this.DiscountPrice);
        this.setParamSimple(map, prefix + "UnitPriceDiscount", this.UnitPriceDiscount);
        this.setParamSimple(map, prefix + "Discount", this.Discount);

    }
}


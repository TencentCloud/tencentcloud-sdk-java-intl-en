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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TradePrice extends AbstractModel {

    /**
    * The non-discounted total price of monthly subscribed resources (unit: 0.000001 cent)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalPrice")
    @Expose
    private Long TotalPrice;

    /**
    * Total discount. `100` means no discount.
    */
    @SerializedName("Discount")
    @Expose
    private Float Discount;

    /**
    * The discounted total price of monthly subscribed resources (unit: 0.000001 cent). If a discount is applied, `TotalPriceDiscount` will be the product of `TotalPrice` and `Discount`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalPriceDiscount")
    @Expose
    private Long TotalPriceDiscount;

    /**
    * The non-discounted unit price of pay-as-you-go resources (unit: 0.000001 cent)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UnitPrice")
    @Expose
    private Long UnitPrice;

    /**
    * The discounted unit price of pay-as-you-go resources (unit: 0.000001 cent). If a discount is applied, `UnitPriceDiscount` will be the product of `UnitPrice` and `Discount`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UnitPriceDiscount")
    @Expose
    private Long UnitPriceDiscount;

    /**
    * Price unit
    */
    @SerializedName("ChargeUnit")
    @Expose
    private String ChargeUnit;

    /**
     * Get The non-discounted total price of monthly subscribed resources (unit: 0.000001 cent)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TotalPrice The non-discounted total price of monthly subscribed resources (unit: 0.000001 cent)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotalPrice() {
        return this.TotalPrice;
    }

    /**
     * Set The non-discounted total price of monthly subscribed resources (unit: 0.000001 cent)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TotalPrice The non-discounted total price of monthly subscribed resources (unit: 0.000001 cent)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalPrice(Long TotalPrice) {
        this.TotalPrice = TotalPrice;
    }

    /**
     * Get Total discount. `100` means no discount. 
     * @return Discount Total discount. `100` means no discount.
     */
    public Float getDiscount() {
        return this.Discount;
    }

    /**
     * Set Total discount. `100` means no discount.
     * @param Discount Total discount. `100` means no discount.
     */
    public void setDiscount(Float Discount) {
        this.Discount = Discount;
    }

    /**
     * Get The discounted total price of monthly subscribed resources (unit: 0.000001 cent). If a discount is applied, `TotalPriceDiscount` will be the product of `TotalPrice` and `Discount`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TotalPriceDiscount The discounted total price of monthly subscribed resources (unit: 0.000001 cent). If a discount is applied, `TotalPriceDiscount` will be the product of `TotalPrice` and `Discount`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotalPriceDiscount() {
        return this.TotalPriceDiscount;
    }

    /**
     * Set The discounted total price of monthly subscribed resources (unit: 0.000001 cent). If a discount is applied, `TotalPriceDiscount` will be the product of `TotalPrice` and `Discount`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TotalPriceDiscount The discounted total price of monthly subscribed resources (unit: 0.000001 cent). If a discount is applied, `TotalPriceDiscount` will be the product of `TotalPrice` and `Discount`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalPriceDiscount(Long TotalPriceDiscount) {
        this.TotalPriceDiscount = TotalPriceDiscount;
    }

    /**
     * Get The non-discounted unit price of pay-as-you-go resources (unit: 0.000001 cent)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UnitPrice The non-discounted unit price of pay-as-you-go resources (unit: 0.000001 cent)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getUnitPrice() {
        return this.UnitPrice;
    }

    /**
     * Set The non-discounted unit price of pay-as-you-go resources (unit: 0.000001 cent)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UnitPrice The non-discounted unit price of pay-as-you-go resources (unit: 0.000001 cent)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUnitPrice(Long UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    /**
     * Get The discounted unit price of pay-as-you-go resources (unit: 0.000001 cent). If a discount is applied, `UnitPriceDiscount` will be the product of `UnitPrice` and `Discount`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UnitPriceDiscount The discounted unit price of pay-as-you-go resources (unit: 0.000001 cent). If a discount is applied, `UnitPriceDiscount` will be the product of `UnitPrice` and `Discount`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getUnitPriceDiscount() {
        return this.UnitPriceDiscount;
    }

    /**
     * Set The discounted unit price of pay-as-you-go resources (unit: 0.000001 cent). If a discount is applied, `UnitPriceDiscount` will be the product of `UnitPrice` and `Discount`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UnitPriceDiscount The discounted unit price of pay-as-you-go resources (unit: 0.000001 cent). If a discount is applied, `UnitPriceDiscount` will be the product of `UnitPrice` and `Discount`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUnitPriceDiscount(Long UnitPriceDiscount) {
        this.UnitPriceDiscount = UnitPriceDiscount;
    }

    /**
     * Get Price unit 
     * @return ChargeUnit Price unit
     */
    public String getChargeUnit() {
        return this.ChargeUnit;
    }

    /**
     * Set Price unit
     * @param ChargeUnit Price unit
     */
    public void setChargeUnit(String ChargeUnit) {
        this.ChargeUnit = ChargeUnit;
    }

    public TradePrice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TradePrice(TradePrice source) {
        if (source.TotalPrice != null) {
            this.TotalPrice = new Long(source.TotalPrice);
        }
        if (source.Discount != null) {
            this.Discount = new Float(source.Discount);
        }
        if (source.TotalPriceDiscount != null) {
            this.TotalPriceDiscount = new Long(source.TotalPriceDiscount);
        }
        if (source.UnitPrice != null) {
            this.UnitPrice = new Long(source.UnitPrice);
        }
        if (source.UnitPriceDiscount != null) {
            this.UnitPriceDiscount = new Long(source.UnitPriceDiscount);
        }
        if (source.ChargeUnit != null) {
            this.ChargeUnit = new String(source.ChargeUnit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalPrice", this.TotalPrice);
        this.setParamSimple(map, prefix + "Discount", this.Discount);
        this.setParamSimple(map, prefix + "TotalPriceDiscount", this.TotalPriceDiscount);
        this.setParamSimple(map, prefix + "UnitPrice", this.UnitPrice);
        this.setParamSimple(map, prefix + "UnitPriceDiscount", this.UnitPriceDiscount);
        this.setParamSimple(map, prefix + "ChargeUnit", this.ChargeUnit);

    }
}


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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TradePrice extends AbstractModel {

    /**
    * Resource total price under prepaid mode, excluding discounts. unit: microCent. 1 US dollar equals 1e8 microCents.
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
    * Discounted total price under prepaid mode, unit: cent. 1 US dollar equals 1e8 microCents. for example, the user enjoys a Discount = TotalPrice * Discount.
    */
    @SerializedName("TotalPriceDiscount")
    @Expose
    private Long TotalPriceDiscount;

    /**
    * Unit resource price in postpaid mode, excluding discounts. unit: cent. 1 US dollar equals 1e2 cents
    */
    @SerializedName("UnitPrice")
    @Expose
    private Long UnitPrice;

    /**
    * Unit resource price in postpaid mode after Discount, unit: cent. 1 US dollar equals 1e2 cents. for example, the user enjoys a Discount = unitprice * Discount.
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
    * Excludes discounted rates under high precision.
    */
    @SerializedName("UnitPriceHighPrecision")
    @Expose
    private String UnitPriceHighPrecision;

    /**
    * Discounted price under high precision.
    */
    @SerializedName("UnitPriceDiscountHighPrecision")
    @Expose
    private String UnitPriceDiscountHighPrecision;

    /**
    * Currency unit.
    */
    @SerializedName("AmountUnit")
    @Expose
    private String AmountUnit;

    /**
     * Get Resource total price under prepaid mode, excluding discounts. unit: microCent. 1 US dollar equals 1e8 microCents. 
     * @return TotalPrice Resource total price under prepaid mode, excluding discounts. unit: microCent. 1 US dollar equals 1e8 microCents.
     */
    public Long getTotalPrice() {
        return this.TotalPrice;
    }

    /**
     * Set Resource total price under prepaid mode, excluding discounts. unit: microCent. 1 US dollar equals 1e8 microCents.
     * @param TotalPrice Resource total price under prepaid mode, excluding discounts. unit: microCent. 1 US dollar equals 1e8 microCents.
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
     * Get Discounted total price under prepaid mode, unit: cent. 1 US dollar equals 1e8 microCents. for example, the user enjoys a Discount = TotalPrice * Discount. 
     * @return TotalPriceDiscount Discounted total price under prepaid mode, unit: cent. 1 US dollar equals 1e8 microCents. for example, the user enjoys a Discount = TotalPrice * Discount.
     */
    public Long getTotalPriceDiscount() {
        return this.TotalPriceDiscount;
    }

    /**
     * Set Discounted total price under prepaid mode, unit: cent. 1 US dollar equals 1e8 microCents. for example, the user enjoys a Discount = TotalPrice * Discount.
     * @param TotalPriceDiscount Discounted total price under prepaid mode, unit: cent. 1 US dollar equals 1e8 microCents. for example, the user enjoys a Discount = TotalPrice * Discount.
     */
    public void setTotalPriceDiscount(Long TotalPriceDiscount) {
        this.TotalPriceDiscount = TotalPriceDiscount;
    }

    /**
     * Get Unit resource price in postpaid mode, excluding discounts. unit: cent. 1 US dollar equals 1e2 cents 
     * @return UnitPrice Unit resource price in postpaid mode, excluding discounts. unit: cent. 1 US dollar equals 1e2 cents
     */
    public Long getUnitPrice() {
        return this.UnitPrice;
    }

    /**
     * Set Unit resource price in postpaid mode, excluding discounts. unit: cent. 1 US dollar equals 1e2 cents
     * @param UnitPrice Unit resource price in postpaid mode, excluding discounts. unit: cent. 1 US dollar equals 1e2 cents
     */
    public void setUnitPrice(Long UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    /**
     * Get Unit resource price in postpaid mode after Discount, unit: cent. 1 US dollar equals 1e2 cents. for example, the user enjoys a Discount = unitprice * Discount. 
     * @return UnitPriceDiscount Unit resource price in postpaid mode after Discount, unit: cent. 1 US dollar equals 1e2 cents. for example, the user enjoys a Discount = unitprice * Discount.
     */
    public Long getUnitPriceDiscount() {
        return this.UnitPriceDiscount;
    }

    /**
     * Set Unit resource price in postpaid mode after Discount, unit: cent. 1 US dollar equals 1e2 cents. for example, the user enjoys a Discount = unitprice * Discount.
     * @param UnitPriceDiscount Unit resource price in postpaid mode after Discount, unit: cent. 1 US dollar equals 1e2 cents. for example, the user enjoys a Discount = unitprice * Discount.
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

    /**
     * Get Excludes discounted rates under high precision. 
     * @return UnitPriceHighPrecision Excludes discounted rates under high precision.
     */
    public String getUnitPriceHighPrecision() {
        return this.UnitPriceHighPrecision;
    }

    /**
     * Set Excludes discounted rates under high precision.
     * @param UnitPriceHighPrecision Excludes discounted rates under high precision.
     */
    public void setUnitPriceHighPrecision(String UnitPriceHighPrecision) {
        this.UnitPriceHighPrecision = UnitPriceHighPrecision;
    }

    /**
     * Get Discounted price under high precision. 
     * @return UnitPriceDiscountHighPrecision Discounted price under high precision.
     */
    public String getUnitPriceDiscountHighPrecision() {
        return this.UnitPriceDiscountHighPrecision;
    }

    /**
     * Set Discounted price under high precision.
     * @param UnitPriceDiscountHighPrecision Discounted price under high precision.
     */
    public void setUnitPriceDiscountHighPrecision(String UnitPriceDiscountHighPrecision) {
        this.UnitPriceDiscountHighPrecision = UnitPriceDiscountHighPrecision;
    }

    /**
     * Get Currency unit. 
     * @return AmountUnit Currency unit.
     */
    public String getAmountUnit() {
        return this.AmountUnit;
    }

    /**
     * Set Currency unit.
     * @param AmountUnit Currency unit.
     */
    public void setAmountUnit(String AmountUnit) {
        this.AmountUnit = AmountUnit;
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
        if (source.UnitPriceHighPrecision != null) {
            this.UnitPriceHighPrecision = new String(source.UnitPriceHighPrecision);
        }
        if (source.UnitPriceDiscountHighPrecision != null) {
            this.UnitPriceDiscountHighPrecision = new String(source.UnitPriceDiscountHighPrecision);
        }
        if (source.AmountUnit != null) {
            this.AmountUnit = new String(source.AmountUnit);
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
        this.setParamSimple(map, prefix + "UnitPriceHighPrecision", this.UnitPriceHighPrecision);
        this.setParamSimple(map, prefix + "UnitPriceDiscountHighPrecision", this.UnitPriceDiscountHighPrecision);
        this.setParamSimple(map, prefix + "AmountUnit", this.AmountUnit);

    }
}


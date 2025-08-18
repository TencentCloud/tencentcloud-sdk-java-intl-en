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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ItemPrice extends AbstractModel {

    /**
    * Original price of subsequent total costs, postpaid billing mode usage, unit: usd. <li>if other time interval items are returned, such as UnitPriceSecondStep, this item represents the time interval (0, 96) hr. if no other time interval items are returned, this item represents the full period (0, ∞) hr.
    */
    @SerializedName("UnitPrice")
    @Expose
    private Float UnitPrice;

    /**
    * Billing unit for pay-as-you-go mode. valid values: <br><li>HOUR: billed on an hourly basis. it's used for hourly POSTPAID instances (`POSTPAID_BY_HOUR`). <br><li>GB: bill BY TRAFFIC in GB. it's used for POSTPAID products that are billed BY the hourly TRAFFIC (`TRAFFIC_POSTPAID_BY_HOUR`).
    */
    @SerializedName("ChargeUnit")
    @Expose
    private String ChargeUnit;

    /**
    * Original price of total prepaid costs. measurement unit: usd.
    */
    @SerializedName("OriginalPrice")
    @Expose
    private Float OriginalPrice;

    /**
    * Discount price of total prepaid costs. unit: usd.
    */
    @SerializedName("DiscountPrice")
    @Expose
    private Float DiscountPrice;

    /**
    * Discount, such as 20.0 representing 80% off.
    */
    @SerializedName("Discount")
    @Expose
    private Float Discount;

    /**
    * Discounted price of subsequent total cost, postpaid billing mode usage, unit: usd <li>if other time interval items are returned, such as UnitPriceDiscountSecondStep, this item represents the time interval (0, 96) hr; if no other time interval items are returned, this item represents the full period (0, ∞) hr.
    */
    @SerializedName("UnitPriceDiscount")
    @Expose
    private Float UnitPriceDiscount;

    /**
    * Original price of subsequent total costs for usage time range (96, 360) hr in postpaid billing mode. unit: usd.
    */
    @SerializedName("UnitPriceSecondStep")
    @Expose
    private Float UnitPriceSecondStep;

    /**
    * Discounted price of subsequent total cost for usage time interval (96, 360) hr in postpaid billing mode. unit: usd.
    */
    @SerializedName("UnitPriceDiscountSecondStep")
    @Expose
    private Float UnitPriceDiscountSecondStep;

    /**
    * Specifies the original price of subsequent total costs with a usage time interval exceeding 360 hr in postpaid billing mode. measurement unit: usd.
    */
    @SerializedName("UnitPriceThirdStep")
    @Expose
    private Float UnitPriceThirdStep;

    /**
    * Discounted price of subsequent total cost for usage time interval exceeding 360 hr in postpaid billing mode. measurement unit: usd.
    */
    @SerializedName("UnitPriceDiscountThirdStep")
    @Expose
    private Float UnitPriceDiscountThirdStep;

    /**
    * Specifies the original price of total 3-year prepaid costs in prepaid billing mode. measurement unit: usd.
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("OriginalPriceThreeYear")
    @Expose
    private Float OriginalPriceThreeYear;

    /**
    * Specifies the discount price for an advance payment of the total fee for three years, prepaid mode usage, measurement unit: usd.
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("DiscountPriceThreeYear")
    @Expose
    private Float DiscountPriceThreeYear;

    /**
    * Specifies the discount for a 3-year advance payment, for example 20.0 represents 80% off.
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("DiscountThreeYear")
    @Expose
    private Float DiscountThreeYear;

    /**
    * Specifies the original price of the 5-year total cost with advance payment, using prepaid billing mode. measurement unit: usd.
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("OriginalPriceFiveYear")
    @Expose
    private Float OriginalPriceFiveYear;

    /**
    * Prepaid 5-year total cost discount price, prepaid billing mode usage. unit: usd.
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("DiscountPriceFiveYear")
    @Expose
    private Float DiscountPriceFiveYear;

    /**
    * Specifies the discount for 5-year advance payment, such as 20.0 for 80% off.
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("DiscountFiveYear")
    @Expose
    private Float DiscountFiveYear;

    /**
    * Original price of one-year advance payment total cost. prepaid mode usage. unit: usd.
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("OriginalPriceOneYear")
    @Expose
    private Float OriginalPriceOneYear;

    /**
    * Discount price for total advance payment for one year. specifies prepaid mode usage. measurement unit: usd.
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("DiscountPriceOneYear")
    @Expose
    private Float DiscountPriceOneYear;

    /**
    * Specifies the discount for a one-year advance payment, such as 20.0 for 80% off.
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("DiscountOneYear")
    @Expose
    private Float DiscountOneYear;

    /**
     * Get Original price of subsequent total costs, postpaid billing mode usage, unit: usd. <li>if other time interval items are returned, such as UnitPriceSecondStep, this item represents the time interval (0, 96) hr. if no other time interval items are returned, this item represents the full period (0, ∞) hr. 
     * @return UnitPrice Original price of subsequent total costs, postpaid billing mode usage, unit: usd. <li>if other time interval items are returned, such as UnitPriceSecondStep, this item represents the time interval (0, 96) hr. if no other time interval items are returned, this item represents the full period (0, ∞) hr.
     */
    public Float getUnitPrice() {
        return this.UnitPrice;
    }

    /**
     * Set Original price of subsequent total costs, postpaid billing mode usage, unit: usd. <li>if other time interval items are returned, such as UnitPriceSecondStep, this item represents the time interval (0, 96) hr. if no other time interval items are returned, this item represents the full period (0, ∞) hr.
     * @param UnitPrice Original price of subsequent total costs, postpaid billing mode usage, unit: usd. <li>if other time interval items are returned, such as UnitPriceSecondStep, this item represents the time interval (0, 96) hr. if no other time interval items are returned, this item represents the full period (0, ∞) hr.
     */
    public void setUnitPrice(Float UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    /**
     * Get Billing unit for pay-as-you-go mode. valid values: <br><li>HOUR: billed on an hourly basis. it's used for hourly POSTPAID instances (`POSTPAID_BY_HOUR`). <br><li>GB: bill BY TRAFFIC in GB. it's used for POSTPAID products that are billed BY the hourly TRAFFIC (`TRAFFIC_POSTPAID_BY_HOUR`). 
     * @return ChargeUnit Billing unit for pay-as-you-go mode. valid values: <br><li>HOUR: billed on an hourly basis. it's used for hourly POSTPAID instances (`POSTPAID_BY_HOUR`). <br><li>GB: bill BY TRAFFIC in GB. it's used for POSTPAID products that are billed BY the hourly TRAFFIC (`TRAFFIC_POSTPAID_BY_HOUR`).
     */
    public String getChargeUnit() {
        return this.ChargeUnit;
    }

    /**
     * Set Billing unit for pay-as-you-go mode. valid values: <br><li>HOUR: billed on an hourly basis. it's used for hourly POSTPAID instances (`POSTPAID_BY_HOUR`). <br><li>GB: bill BY TRAFFIC in GB. it's used for POSTPAID products that are billed BY the hourly TRAFFIC (`TRAFFIC_POSTPAID_BY_HOUR`).
     * @param ChargeUnit Billing unit for pay-as-you-go mode. valid values: <br><li>HOUR: billed on an hourly basis. it's used for hourly POSTPAID instances (`POSTPAID_BY_HOUR`). <br><li>GB: bill BY TRAFFIC in GB. it's used for POSTPAID products that are billed BY the hourly TRAFFIC (`TRAFFIC_POSTPAID_BY_HOUR`).
     */
    public void setChargeUnit(String ChargeUnit) {
        this.ChargeUnit = ChargeUnit;
    }

    /**
     * Get Original price of total prepaid costs. measurement unit: usd. 
     * @return OriginalPrice Original price of total prepaid costs. measurement unit: usd.
     */
    public Float getOriginalPrice() {
        return this.OriginalPrice;
    }

    /**
     * Set Original price of total prepaid costs. measurement unit: usd.
     * @param OriginalPrice Original price of total prepaid costs. measurement unit: usd.
     */
    public void setOriginalPrice(Float OriginalPrice) {
        this.OriginalPrice = OriginalPrice;
    }

    /**
     * Get Discount price of total prepaid costs. unit: usd. 
     * @return DiscountPrice Discount price of total prepaid costs. unit: usd.
     */
    public Float getDiscountPrice() {
        return this.DiscountPrice;
    }

    /**
     * Set Discount price of total prepaid costs. unit: usd.
     * @param DiscountPrice Discount price of total prepaid costs. unit: usd.
     */
    public void setDiscountPrice(Float DiscountPrice) {
        this.DiscountPrice = DiscountPrice;
    }

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
     * Get Discounted price of subsequent total cost, postpaid billing mode usage, unit: usd <li>if other time interval items are returned, such as UnitPriceDiscountSecondStep, this item represents the time interval (0, 96) hr; if no other time interval items are returned, this item represents the full period (0, ∞) hr. 
     * @return UnitPriceDiscount Discounted price of subsequent total cost, postpaid billing mode usage, unit: usd <li>if other time interval items are returned, such as UnitPriceDiscountSecondStep, this item represents the time interval (0, 96) hr; if no other time interval items are returned, this item represents the full period (0, ∞) hr.
     */
    public Float getUnitPriceDiscount() {
        return this.UnitPriceDiscount;
    }

    /**
     * Set Discounted price of subsequent total cost, postpaid billing mode usage, unit: usd <li>if other time interval items are returned, such as UnitPriceDiscountSecondStep, this item represents the time interval (0, 96) hr; if no other time interval items are returned, this item represents the full period (0, ∞) hr.
     * @param UnitPriceDiscount Discounted price of subsequent total cost, postpaid billing mode usage, unit: usd <li>if other time interval items are returned, such as UnitPriceDiscountSecondStep, this item represents the time interval (0, 96) hr; if no other time interval items are returned, this item represents the full period (0, ∞) hr.
     */
    public void setUnitPriceDiscount(Float UnitPriceDiscount) {
        this.UnitPriceDiscount = UnitPriceDiscount;
    }

    /**
     * Get Original price of subsequent total costs for usage time range (96, 360) hr in postpaid billing mode. unit: usd. 
     * @return UnitPriceSecondStep Original price of subsequent total costs for usage time range (96, 360) hr in postpaid billing mode. unit: usd.
     */
    public Float getUnitPriceSecondStep() {
        return this.UnitPriceSecondStep;
    }

    /**
     * Set Original price of subsequent total costs for usage time range (96, 360) hr in postpaid billing mode. unit: usd.
     * @param UnitPriceSecondStep Original price of subsequent total costs for usage time range (96, 360) hr in postpaid billing mode. unit: usd.
     */
    public void setUnitPriceSecondStep(Float UnitPriceSecondStep) {
        this.UnitPriceSecondStep = UnitPriceSecondStep;
    }

    /**
     * Get Discounted price of subsequent total cost for usage time interval (96, 360) hr in postpaid billing mode. unit: usd. 
     * @return UnitPriceDiscountSecondStep Discounted price of subsequent total cost for usage time interval (96, 360) hr in postpaid billing mode. unit: usd.
     */
    public Float getUnitPriceDiscountSecondStep() {
        return this.UnitPriceDiscountSecondStep;
    }

    /**
     * Set Discounted price of subsequent total cost for usage time interval (96, 360) hr in postpaid billing mode. unit: usd.
     * @param UnitPriceDiscountSecondStep Discounted price of subsequent total cost for usage time interval (96, 360) hr in postpaid billing mode. unit: usd.
     */
    public void setUnitPriceDiscountSecondStep(Float UnitPriceDiscountSecondStep) {
        this.UnitPriceDiscountSecondStep = UnitPriceDiscountSecondStep;
    }

    /**
     * Get Specifies the original price of subsequent total costs with a usage time interval exceeding 360 hr in postpaid billing mode. measurement unit: usd. 
     * @return UnitPriceThirdStep Specifies the original price of subsequent total costs with a usage time interval exceeding 360 hr in postpaid billing mode. measurement unit: usd.
     */
    public Float getUnitPriceThirdStep() {
        return this.UnitPriceThirdStep;
    }

    /**
     * Set Specifies the original price of subsequent total costs with a usage time interval exceeding 360 hr in postpaid billing mode. measurement unit: usd.
     * @param UnitPriceThirdStep Specifies the original price of subsequent total costs with a usage time interval exceeding 360 hr in postpaid billing mode. measurement unit: usd.
     */
    public void setUnitPriceThirdStep(Float UnitPriceThirdStep) {
        this.UnitPriceThirdStep = UnitPriceThirdStep;
    }

    /**
     * Get Discounted price of subsequent total cost for usage time interval exceeding 360 hr in postpaid billing mode. measurement unit: usd. 
     * @return UnitPriceDiscountThirdStep Discounted price of subsequent total cost for usage time interval exceeding 360 hr in postpaid billing mode. measurement unit: usd.
     */
    public Float getUnitPriceDiscountThirdStep() {
        return this.UnitPriceDiscountThirdStep;
    }

    /**
     * Set Discounted price of subsequent total cost for usage time interval exceeding 360 hr in postpaid billing mode. measurement unit: usd.
     * @param UnitPriceDiscountThirdStep Discounted price of subsequent total cost for usage time interval exceeding 360 hr in postpaid billing mode. measurement unit: usd.
     */
    public void setUnitPriceDiscountThirdStep(Float UnitPriceDiscountThirdStep) {
        this.UnitPriceDiscountThirdStep = UnitPriceDiscountThirdStep;
    }

    /**
     * Get Specifies the original price of total 3-year prepaid costs in prepaid billing mode. measurement unit: usd.
Note: This field may return null, indicating that no valid value is found. 
     * @return OriginalPriceThreeYear Specifies the original price of total 3-year prepaid costs in prepaid billing mode. measurement unit: usd.
Note: This field may return null, indicating that no valid value is found.
     */
    public Float getOriginalPriceThreeYear() {
        return this.OriginalPriceThreeYear;
    }

    /**
     * Set Specifies the original price of total 3-year prepaid costs in prepaid billing mode. measurement unit: usd.
Note: This field may return null, indicating that no valid value is found.
     * @param OriginalPriceThreeYear Specifies the original price of total 3-year prepaid costs in prepaid billing mode. measurement unit: usd.
Note: This field may return null, indicating that no valid value is found.
     */
    public void setOriginalPriceThreeYear(Float OriginalPriceThreeYear) {
        this.OriginalPriceThreeYear = OriginalPriceThreeYear;
    }

    /**
     * Get Specifies the discount price for an advance payment of the total fee for three years, prepaid mode usage, measurement unit: usd.
Note: This field may return null, indicating that no valid value is found. 
     * @return DiscountPriceThreeYear Specifies the discount price for an advance payment of the total fee for three years, prepaid mode usage, measurement unit: usd.
Note: This field may return null, indicating that no valid value is found.
     */
    public Float getDiscountPriceThreeYear() {
        return this.DiscountPriceThreeYear;
    }

    /**
     * Set Specifies the discount price for an advance payment of the total fee for three years, prepaid mode usage, measurement unit: usd.
Note: This field may return null, indicating that no valid value is found.
     * @param DiscountPriceThreeYear Specifies the discount price for an advance payment of the total fee for three years, prepaid mode usage, measurement unit: usd.
Note: This field may return null, indicating that no valid value is found.
     */
    public void setDiscountPriceThreeYear(Float DiscountPriceThreeYear) {
        this.DiscountPriceThreeYear = DiscountPriceThreeYear;
    }

    /**
     * Get Specifies the discount for a 3-year advance payment, for example 20.0 represents 80% off.
Note: This field may return null, indicating that no valid value is found. 
     * @return DiscountThreeYear Specifies the discount for a 3-year advance payment, for example 20.0 represents 80% off.
Note: This field may return null, indicating that no valid value is found.
     */
    public Float getDiscountThreeYear() {
        return this.DiscountThreeYear;
    }

    /**
     * Set Specifies the discount for a 3-year advance payment, for example 20.0 represents 80% off.
Note: This field may return null, indicating that no valid value is found.
     * @param DiscountThreeYear Specifies the discount for a 3-year advance payment, for example 20.0 represents 80% off.
Note: This field may return null, indicating that no valid value is found.
     */
    public void setDiscountThreeYear(Float DiscountThreeYear) {
        this.DiscountThreeYear = DiscountThreeYear;
    }

    /**
     * Get Specifies the original price of the 5-year total cost with advance payment, using prepaid billing mode. measurement unit: usd.
Note: This field may return null, indicating that no valid value is found. 
     * @return OriginalPriceFiveYear Specifies the original price of the 5-year total cost with advance payment, using prepaid billing mode. measurement unit: usd.
Note: This field may return null, indicating that no valid value is found.
     */
    public Float getOriginalPriceFiveYear() {
        return this.OriginalPriceFiveYear;
    }

    /**
     * Set Specifies the original price of the 5-year total cost with advance payment, using prepaid billing mode. measurement unit: usd.
Note: This field may return null, indicating that no valid value is found.
     * @param OriginalPriceFiveYear Specifies the original price of the 5-year total cost with advance payment, using prepaid billing mode. measurement unit: usd.
Note: This field may return null, indicating that no valid value is found.
     */
    public void setOriginalPriceFiveYear(Float OriginalPriceFiveYear) {
        this.OriginalPriceFiveYear = OriginalPriceFiveYear;
    }

    /**
     * Get Prepaid 5-year total cost discount price, prepaid billing mode usage. unit: usd.
Note: This field may return null, indicating that no valid value is found. 
     * @return DiscountPriceFiveYear Prepaid 5-year total cost discount price, prepaid billing mode usage. unit: usd.
Note: This field may return null, indicating that no valid value is found.
     */
    public Float getDiscountPriceFiveYear() {
        return this.DiscountPriceFiveYear;
    }

    /**
     * Set Prepaid 5-year total cost discount price, prepaid billing mode usage. unit: usd.
Note: This field may return null, indicating that no valid value is found.
     * @param DiscountPriceFiveYear Prepaid 5-year total cost discount price, prepaid billing mode usage. unit: usd.
Note: This field may return null, indicating that no valid value is found.
     */
    public void setDiscountPriceFiveYear(Float DiscountPriceFiveYear) {
        this.DiscountPriceFiveYear = DiscountPriceFiveYear;
    }

    /**
     * Get Specifies the discount for 5-year advance payment, such as 20.0 for 80% off.
Note: This field may return null, indicating that no valid value is found. 
     * @return DiscountFiveYear Specifies the discount for 5-year advance payment, such as 20.0 for 80% off.
Note: This field may return null, indicating that no valid value is found.
     */
    public Float getDiscountFiveYear() {
        return this.DiscountFiveYear;
    }

    /**
     * Set Specifies the discount for 5-year advance payment, such as 20.0 for 80% off.
Note: This field may return null, indicating that no valid value is found.
     * @param DiscountFiveYear Specifies the discount for 5-year advance payment, such as 20.0 for 80% off.
Note: This field may return null, indicating that no valid value is found.
     */
    public void setDiscountFiveYear(Float DiscountFiveYear) {
        this.DiscountFiveYear = DiscountFiveYear;
    }

    /**
     * Get Original price of one-year advance payment total cost. prepaid mode usage. unit: usd.
Note: This field may return null, indicating that no valid value is found. 
     * @return OriginalPriceOneYear Original price of one-year advance payment total cost. prepaid mode usage. unit: usd.
Note: This field may return null, indicating that no valid value is found.
     */
    public Float getOriginalPriceOneYear() {
        return this.OriginalPriceOneYear;
    }

    /**
     * Set Original price of one-year advance payment total cost. prepaid mode usage. unit: usd.
Note: This field may return null, indicating that no valid value is found.
     * @param OriginalPriceOneYear Original price of one-year advance payment total cost. prepaid mode usage. unit: usd.
Note: This field may return null, indicating that no valid value is found.
     */
    public void setOriginalPriceOneYear(Float OriginalPriceOneYear) {
        this.OriginalPriceOneYear = OriginalPriceOneYear;
    }

    /**
     * Get Discount price for total advance payment for one year. specifies prepaid mode usage. measurement unit: usd.
Note: This field may return null, indicating that no valid value is found. 
     * @return DiscountPriceOneYear Discount price for total advance payment for one year. specifies prepaid mode usage. measurement unit: usd.
Note: This field may return null, indicating that no valid value is found.
     */
    public Float getDiscountPriceOneYear() {
        return this.DiscountPriceOneYear;
    }

    /**
     * Set Discount price for total advance payment for one year. specifies prepaid mode usage. measurement unit: usd.
Note: This field may return null, indicating that no valid value is found.
     * @param DiscountPriceOneYear Discount price for total advance payment for one year. specifies prepaid mode usage. measurement unit: usd.
Note: This field may return null, indicating that no valid value is found.
     */
    public void setDiscountPriceOneYear(Float DiscountPriceOneYear) {
        this.DiscountPriceOneYear = DiscountPriceOneYear;
    }

    /**
     * Get Specifies the discount for a one-year advance payment, such as 20.0 for 80% off.
Note: This field may return null, indicating that no valid value is found. 
     * @return DiscountOneYear Specifies the discount for a one-year advance payment, such as 20.0 for 80% off.
Note: This field may return null, indicating that no valid value is found.
     */
    public Float getDiscountOneYear() {
        return this.DiscountOneYear;
    }

    /**
     * Set Specifies the discount for a one-year advance payment, such as 20.0 for 80% off.
Note: This field may return null, indicating that no valid value is found.
     * @param DiscountOneYear Specifies the discount for a one-year advance payment, such as 20.0 for 80% off.
Note: This field may return null, indicating that no valid value is found.
     */
    public void setDiscountOneYear(Float DiscountOneYear) {
        this.DiscountOneYear = DiscountOneYear;
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
        if (source.Discount != null) {
            this.Discount = new Float(source.Discount);
        }
        if (source.UnitPriceDiscount != null) {
            this.UnitPriceDiscount = new Float(source.UnitPriceDiscount);
        }
        if (source.UnitPriceSecondStep != null) {
            this.UnitPriceSecondStep = new Float(source.UnitPriceSecondStep);
        }
        if (source.UnitPriceDiscountSecondStep != null) {
            this.UnitPriceDiscountSecondStep = new Float(source.UnitPriceDiscountSecondStep);
        }
        if (source.UnitPriceThirdStep != null) {
            this.UnitPriceThirdStep = new Float(source.UnitPriceThirdStep);
        }
        if (source.UnitPriceDiscountThirdStep != null) {
            this.UnitPriceDiscountThirdStep = new Float(source.UnitPriceDiscountThirdStep);
        }
        if (source.OriginalPriceThreeYear != null) {
            this.OriginalPriceThreeYear = new Float(source.OriginalPriceThreeYear);
        }
        if (source.DiscountPriceThreeYear != null) {
            this.DiscountPriceThreeYear = new Float(source.DiscountPriceThreeYear);
        }
        if (source.DiscountThreeYear != null) {
            this.DiscountThreeYear = new Float(source.DiscountThreeYear);
        }
        if (source.OriginalPriceFiveYear != null) {
            this.OriginalPriceFiveYear = new Float(source.OriginalPriceFiveYear);
        }
        if (source.DiscountPriceFiveYear != null) {
            this.DiscountPriceFiveYear = new Float(source.DiscountPriceFiveYear);
        }
        if (source.DiscountFiveYear != null) {
            this.DiscountFiveYear = new Float(source.DiscountFiveYear);
        }
        if (source.OriginalPriceOneYear != null) {
            this.OriginalPriceOneYear = new Float(source.OriginalPriceOneYear);
        }
        if (source.DiscountPriceOneYear != null) {
            this.DiscountPriceOneYear = new Float(source.DiscountPriceOneYear);
        }
        if (source.DiscountOneYear != null) {
            this.DiscountOneYear = new Float(source.DiscountOneYear);
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
        this.setParamSimple(map, prefix + "Discount", this.Discount);
        this.setParamSimple(map, prefix + "UnitPriceDiscount", this.UnitPriceDiscount);
        this.setParamSimple(map, prefix + "UnitPriceSecondStep", this.UnitPriceSecondStep);
        this.setParamSimple(map, prefix + "UnitPriceDiscountSecondStep", this.UnitPriceDiscountSecondStep);
        this.setParamSimple(map, prefix + "UnitPriceThirdStep", this.UnitPriceThirdStep);
        this.setParamSimple(map, prefix + "UnitPriceDiscountThirdStep", this.UnitPriceDiscountThirdStep);
        this.setParamSimple(map, prefix + "OriginalPriceThreeYear", this.OriginalPriceThreeYear);
        this.setParamSimple(map, prefix + "DiscountPriceThreeYear", this.DiscountPriceThreeYear);
        this.setParamSimple(map, prefix + "DiscountThreeYear", this.DiscountThreeYear);
        this.setParamSimple(map, prefix + "OriginalPriceFiveYear", this.OriginalPriceFiveYear);
        this.setParamSimple(map, prefix + "DiscountPriceFiveYear", this.DiscountPriceFiveYear);
        this.setParamSimple(map, prefix + "DiscountFiveYear", this.DiscountFiveYear);
        this.setParamSimple(map, prefix + "OriginalPriceOneYear", this.OriginalPriceOneYear);
        this.setParamSimple(map, prefix + "DiscountPriceOneYear", this.DiscountPriceOneYear);
        this.setParamSimple(map, prefix + "DiscountOneYear", this.DiscountOneYear);

    }
}


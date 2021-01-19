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

public class ItemPrice extends AbstractModel{

    /**
    * The original unit price for pay-as-you-go mode in USD. <br><li>When a billing tier is returned, it indicates the price fo the returned billing tier. For example, if `UnitPriceSecondStep` is returned, it refers to the unit price for the usage between 0 to 96 hours. Otherwise, it refers to that the unit price for unlimited usage.
Note: this field may return null, indicating that no valid value is obtained.
    */
    @SerializedName("UnitPrice")
    @Expose
    private Float UnitPrice;

    /**
    * Billing unit for pay-as-you-go mode. Valid values: <br><li>HOUR: billed on an hourly basis. It's used for hourly postpaid instances (`POSTPAID_BY_HOUR`). <br><li>GB: bill by traffic in GB. It's used for postpaid products that are billed by the hourly traffic (`TRAFFIC_POSTPAID_BY_HOUR`).
Note: this field may return null, indicating that no valid value is obtained.
    */
    @SerializedName("ChargeUnit")
    @Expose
    private String ChargeUnit;

    /**
    * The original price of a pay-in-advance instance, in USD.
Note: this field may return null, indicating that no valid value is obtained.
    */
    @SerializedName("OriginalPrice")
    @Expose
    private Float OriginalPrice;

    /**
    * Discount price of a prepaid instance, in USD.
Note: this field may return null, indicating that no valid value is obtained.
    */
    @SerializedName("DiscountPrice")
    @Expose
    private Float DiscountPrice;

    /**
    * Discount. For example, 20.0 indicates 80% off.
Note: this field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Discount")
    @Expose
    private Float Discount;

    /**
    * The discounted unit price for pay-as-you-go mode in USD. <br><li>When a billing tier is returned, it indicates the price fo the returned billing tier. For example, if `UnitPriceSecondStep` is returned, it refers to the unit price for the usage between 0 to 96 hours. Otherwise, it refers to that the unit price for unlimited usage.
Note: this field may return null, indicating that no valid value is obtained.
    */
    @SerializedName("UnitPriceDiscount")
    @Expose
    private Float UnitPriceDiscount;

    /**
    * Original unit price for the usage between 96 to 360 hours in USD. It's applicable to pay-as-you-go mode.
Note: this field may return null, indicating that no valid value is obtained.
    */
    @SerializedName("UnitPriceSecondStep")
    @Expose
    private Float UnitPriceSecondStep;

    /**
    * Discounted unit price for the usage between 96 to 360 hours in USD. It's applicable to pay-as-you-go mode.
Note: this field may return null, indicating that no valid value is obtained.
    */
    @SerializedName("UnitPriceDiscountSecondStep")
    @Expose
    private Float UnitPriceDiscountSecondStep;

    /**
    * Original unit price for the usage after 360 hours in USD. It's applicable to pay-as-you-go mode.
Note: this field may return null, indicating that no valid value is obtained.
    */
    @SerializedName("UnitPriceThirdStep")
    @Expose
    private Float UnitPriceThirdStep;

    /**
    * Discounted unit price for the usage after 360 hours in USD. It's applicable to pay-as-you-go mode.
Note: this field may return null, indicating that no valid value is obtained.
    */
    @SerializedName("UnitPriceDiscountThirdStep")
    @Expose
    private Float UnitPriceDiscountThirdStep;

    /**
    * Original 3-year payment, in USD. This parameter is only available to upfront payment mode.
Note: this field may return `null`, indicating that no valid value was found.
Note: this field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("OriginalPriceThreeYear")
    @Expose
    private Float OriginalPriceThreeYear;

    /**
    * Discounted 3-year upfront payment, in USD. This parameter is only available to upfront payment mode.
Note: this field may return `null`, indicating that no valid value was found.
Note: this field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("DiscountPriceThreeYear")
    @Expose
    private Float DiscountPriceThreeYear;

    /**
    * Discount for 3-year upfront payment. For example, 20.0 indicates 80% off.
Note: this field may return `null`, indicating that no valid value was found.
Note: this field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("DiscountThreeYear")
    @Expose
    private Float DiscountThreeYear;

    /**
    * Original 5-year payment, in USD. This parameter is only available to upfront payment mode.
Note: this field may return `null`, indicating that no valid value was found.
Note: this field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("OriginalPriceFiveYear")
    @Expose
    private Float OriginalPriceFiveYear;

    /**
    * Discounted 5-year upfront payment, in USD. This parameter is only available to upfront payment mode.
Note: this field may return `null`, indicating that no valid value was found.
Note: this field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("DiscountPriceFiveYear")
    @Expose
    private Float DiscountPriceFiveYear;

    /**
    * Discount for 5-year upfront payment. For example, 20.0 indicates 80% off.
Note: this field may return `null`, indicating that no valid value was found.
Note: this field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("DiscountFiveYear")
    @Expose
    private Float DiscountFiveYear;

    /**
    * Original 1-year payment, in USD. This parameter is only available to upfront payment mode.
Note: this field may return `null`, indicating that no valid value was found.
Note: this field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("OriginalPriceOneYear")
    @Expose
    private Float OriginalPriceOneYear;

    /**
    * Discounted 1-year payment, in USD. This parameter is only available to upfront payment mode.
Note: this field may return `null`, indicating that no valid value was found.
Note: this field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("DiscountPriceOneYear")
    @Expose
    private Float DiscountPriceOneYear;

    /**
    * Discount for 1-year upfront payment. For example, 20.0 indicates 80% off.
Note: this field may return `null`, indicating that no valid value was found.
Note: this field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("DiscountOneYear")
    @Expose
    private Float DiscountOneYear;

    /**
     * Get The original unit price for pay-as-you-go mode in USD. <br><li>When a billing tier is returned, it indicates the price fo the returned billing tier. For example, if `UnitPriceSecondStep` is returned, it refers to the unit price for the usage between 0 to 96 hours. Otherwise, it refers to that the unit price for unlimited usage.
Note: this field may return null, indicating that no valid value is obtained. 
     * @return UnitPrice The original unit price for pay-as-you-go mode in USD. <br><li>When a billing tier is returned, it indicates the price fo the returned billing tier. For example, if `UnitPriceSecondStep` is returned, it refers to the unit price for the usage between 0 to 96 hours. Otherwise, it refers to that the unit price for unlimited usage.
Note: this field may return null, indicating that no valid value is obtained.
     */
    public Float getUnitPrice() {
        return this.UnitPrice;
    }

    /**
     * Set The original unit price for pay-as-you-go mode in USD. <br><li>When a billing tier is returned, it indicates the price fo the returned billing tier. For example, if `UnitPriceSecondStep` is returned, it refers to the unit price for the usage between 0 to 96 hours. Otherwise, it refers to that the unit price for unlimited usage.
Note: this field may return null, indicating that no valid value is obtained.
     * @param UnitPrice The original unit price for pay-as-you-go mode in USD. <br><li>When a billing tier is returned, it indicates the price fo the returned billing tier. For example, if `UnitPriceSecondStep` is returned, it refers to the unit price for the usage between 0 to 96 hours. Otherwise, it refers to that the unit price for unlimited usage.
Note: this field may return null, indicating that no valid value is obtained.
     */
    public void setUnitPrice(Float UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    /**
     * Get Billing unit for pay-as-you-go mode. Valid values: <br><li>HOUR: billed on an hourly basis. It's used for hourly postpaid instances (`POSTPAID_BY_HOUR`). <br><li>GB: bill by traffic in GB. It's used for postpaid products that are billed by the hourly traffic (`TRAFFIC_POSTPAID_BY_HOUR`).
Note: this field may return null, indicating that no valid value is obtained. 
     * @return ChargeUnit Billing unit for pay-as-you-go mode. Valid values: <br><li>HOUR: billed on an hourly basis. It's used for hourly postpaid instances (`POSTPAID_BY_HOUR`). <br><li>GB: bill by traffic in GB. It's used for postpaid products that are billed by the hourly traffic (`TRAFFIC_POSTPAID_BY_HOUR`).
Note: this field may return null, indicating that no valid value is obtained.
     */
    public String getChargeUnit() {
        return this.ChargeUnit;
    }

    /**
     * Set Billing unit for pay-as-you-go mode. Valid values: <br><li>HOUR: billed on an hourly basis. It's used for hourly postpaid instances (`POSTPAID_BY_HOUR`). <br><li>GB: bill by traffic in GB. It's used for postpaid products that are billed by the hourly traffic (`TRAFFIC_POSTPAID_BY_HOUR`).
Note: this field may return null, indicating that no valid value is obtained.
     * @param ChargeUnit Billing unit for pay-as-you-go mode. Valid values: <br><li>HOUR: billed on an hourly basis. It's used for hourly postpaid instances (`POSTPAID_BY_HOUR`). <br><li>GB: bill by traffic in GB. It's used for postpaid products that are billed by the hourly traffic (`TRAFFIC_POSTPAID_BY_HOUR`).
Note: this field may return null, indicating that no valid value is obtained.
     */
    public void setChargeUnit(String ChargeUnit) {
        this.ChargeUnit = ChargeUnit;
    }

    /**
     * Get The original price of a pay-in-advance instance, in USD.
Note: this field may return null, indicating that no valid value is obtained. 
     * @return OriginalPrice The original price of a pay-in-advance instance, in USD.
Note: this field may return null, indicating that no valid value is obtained.
     */
    public Float getOriginalPrice() {
        return this.OriginalPrice;
    }

    /**
     * Set The original price of a pay-in-advance instance, in USD.
Note: this field may return null, indicating that no valid value is obtained.
     * @param OriginalPrice The original price of a pay-in-advance instance, in USD.
Note: this field may return null, indicating that no valid value is obtained.
     */
    public void setOriginalPrice(Float OriginalPrice) {
        this.OriginalPrice = OriginalPrice;
    }

    /**
     * Get Discount price of a prepaid instance, in USD.
Note: this field may return null, indicating that no valid value is obtained. 
     * @return DiscountPrice Discount price of a prepaid instance, in USD.
Note: this field may return null, indicating that no valid value is obtained.
     */
    public Float getDiscountPrice() {
        return this.DiscountPrice;
    }

    /**
     * Set Discount price of a prepaid instance, in USD.
Note: this field may return null, indicating that no valid value is obtained.
     * @param DiscountPrice Discount price of a prepaid instance, in USD.
Note: this field may return null, indicating that no valid value is obtained.
     */
    public void setDiscountPrice(Float DiscountPrice) {
        this.DiscountPrice = DiscountPrice;
    }

    /**
     * Get Discount. For example, 20.0 indicates 80% off.
Note: this field may return `null`, indicating that no valid value was found. 
     * @return Discount Discount. For example, 20.0 indicates 80% off.
Note: this field may return `null`, indicating that no valid value was found.
     */
    public Float getDiscount() {
        return this.Discount;
    }

    /**
     * Set Discount. For example, 20.0 indicates 80% off.
Note: this field may return `null`, indicating that no valid value was found.
     * @param Discount Discount. For example, 20.0 indicates 80% off.
Note: this field may return `null`, indicating that no valid value was found.
     */
    public void setDiscount(Float Discount) {
        this.Discount = Discount;
    }

    /**
     * Get The discounted unit price for pay-as-you-go mode in USD. <br><li>When a billing tier is returned, it indicates the price fo the returned billing tier. For example, if `UnitPriceSecondStep` is returned, it refers to the unit price for the usage between 0 to 96 hours. Otherwise, it refers to that the unit price for unlimited usage.
Note: this field may return null, indicating that no valid value is obtained. 
     * @return UnitPriceDiscount The discounted unit price for pay-as-you-go mode in USD. <br><li>When a billing tier is returned, it indicates the price fo the returned billing tier. For example, if `UnitPriceSecondStep` is returned, it refers to the unit price for the usage between 0 to 96 hours. Otherwise, it refers to that the unit price for unlimited usage.
Note: this field may return null, indicating that no valid value is obtained.
     */
    public Float getUnitPriceDiscount() {
        return this.UnitPriceDiscount;
    }

    /**
     * Set The discounted unit price for pay-as-you-go mode in USD. <br><li>When a billing tier is returned, it indicates the price fo the returned billing tier. For example, if `UnitPriceSecondStep` is returned, it refers to the unit price for the usage between 0 to 96 hours. Otherwise, it refers to that the unit price for unlimited usage.
Note: this field may return null, indicating that no valid value is obtained.
     * @param UnitPriceDiscount The discounted unit price for pay-as-you-go mode in USD. <br><li>When a billing tier is returned, it indicates the price fo the returned billing tier. For example, if `UnitPriceSecondStep` is returned, it refers to the unit price for the usage between 0 to 96 hours. Otherwise, it refers to that the unit price for unlimited usage.
Note: this field may return null, indicating that no valid value is obtained.
     */
    public void setUnitPriceDiscount(Float UnitPriceDiscount) {
        this.UnitPriceDiscount = UnitPriceDiscount;
    }

    /**
     * Get Original unit price for the usage between 96 to 360 hours in USD. It's applicable to pay-as-you-go mode.
Note: this field may return null, indicating that no valid value is obtained. 
     * @return UnitPriceSecondStep Original unit price for the usage between 96 to 360 hours in USD. It's applicable to pay-as-you-go mode.
Note: this field may return null, indicating that no valid value is obtained.
     */
    public Float getUnitPriceSecondStep() {
        return this.UnitPriceSecondStep;
    }

    /**
     * Set Original unit price for the usage between 96 to 360 hours in USD. It's applicable to pay-as-you-go mode.
Note: this field may return null, indicating that no valid value is obtained.
     * @param UnitPriceSecondStep Original unit price for the usage between 96 to 360 hours in USD. It's applicable to pay-as-you-go mode.
Note: this field may return null, indicating that no valid value is obtained.
     */
    public void setUnitPriceSecondStep(Float UnitPriceSecondStep) {
        this.UnitPriceSecondStep = UnitPriceSecondStep;
    }

    /**
     * Get Discounted unit price for the usage between 96 to 360 hours in USD. It's applicable to pay-as-you-go mode.
Note: this field may return null, indicating that no valid value is obtained. 
     * @return UnitPriceDiscountSecondStep Discounted unit price for the usage between 96 to 360 hours in USD. It's applicable to pay-as-you-go mode.
Note: this field may return null, indicating that no valid value is obtained.
     */
    public Float getUnitPriceDiscountSecondStep() {
        return this.UnitPriceDiscountSecondStep;
    }

    /**
     * Set Discounted unit price for the usage between 96 to 360 hours in USD. It's applicable to pay-as-you-go mode.
Note: this field may return null, indicating that no valid value is obtained.
     * @param UnitPriceDiscountSecondStep Discounted unit price for the usage between 96 to 360 hours in USD. It's applicable to pay-as-you-go mode.
Note: this field may return null, indicating that no valid value is obtained.
     */
    public void setUnitPriceDiscountSecondStep(Float UnitPriceDiscountSecondStep) {
        this.UnitPriceDiscountSecondStep = UnitPriceDiscountSecondStep;
    }

    /**
     * Get Original unit price for the usage after 360 hours in USD. It's applicable to pay-as-you-go mode.
Note: this field may return null, indicating that no valid value is obtained. 
     * @return UnitPriceThirdStep Original unit price for the usage after 360 hours in USD. It's applicable to pay-as-you-go mode.
Note: this field may return null, indicating that no valid value is obtained.
     */
    public Float getUnitPriceThirdStep() {
        return this.UnitPriceThirdStep;
    }

    /**
     * Set Original unit price for the usage after 360 hours in USD. It's applicable to pay-as-you-go mode.
Note: this field may return null, indicating that no valid value is obtained.
     * @param UnitPriceThirdStep Original unit price for the usage after 360 hours in USD. It's applicable to pay-as-you-go mode.
Note: this field may return null, indicating that no valid value is obtained.
     */
    public void setUnitPriceThirdStep(Float UnitPriceThirdStep) {
        this.UnitPriceThirdStep = UnitPriceThirdStep;
    }

    /**
     * Get Discounted unit price for the usage after 360 hours in USD. It's applicable to pay-as-you-go mode.
Note: this field may return null, indicating that no valid value is obtained. 
     * @return UnitPriceDiscountThirdStep Discounted unit price for the usage after 360 hours in USD. It's applicable to pay-as-you-go mode.
Note: this field may return null, indicating that no valid value is obtained.
     */
    public Float getUnitPriceDiscountThirdStep() {
        return this.UnitPriceDiscountThirdStep;
    }

    /**
     * Set Discounted unit price for the usage after 360 hours in USD. It's applicable to pay-as-you-go mode.
Note: this field may return null, indicating that no valid value is obtained.
     * @param UnitPriceDiscountThirdStep Discounted unit price for the usage after 360 hours in USD. It's applicable to pay-as-you-go mode.
Note: this field may return null, indicating that no valid value is obtained.
     */
    public void setUnitPriceDiscountThirdStep(Float UnitPriceDiscountThirdStep) {
        this.UnitPriceDiscountThirdStep = UnitPriceDiscountThirdStep;
    }

    /**
     * Get Original 3-year payment, in USD. This parameter is only available to upfront payment mode.
Note: this field may return `null`, indicating that no valid value was found.
Note: this field may return `null`, indicating that no valid value was found. 
     * @return OriginalPriceThreeYear Original 3-year payment, in USD. This parameter is only available to upfront payment mode.
Note: this field may return `null`, indicating that no valid value was found.
Note: this field may return `null`, indicating that no valid value was found.
     */
    public Float getOriginalPriceThreeYear() {
        return this.OriginalPriceThreeYear;
    }

    /**
     * Set Original 3-year payment, in USD. This parameter is only available to upfront payment mode.
Note: this field may return `null`, indicating that no valid value was found.
Note: this field may return `null`, indicating that no valid value was found.
     * @param OriginalPriceThreeYear Original 3-year payment, in USD. This parameter is only available to upfront payment mode.
Note: this field may return `null`, indicating that no valid value was found.
Note: this field may return `null`, indicating that no valid value was found.
     */
    public void setOriginalPriceThreeYear(Float OriginalPriceThreeYear) {
        this.OriginalPriceThreeYear = OriginalPriceThreeYear;
    }

    /**
     * Get Discounted 3-year upfront payment, in USD. This parameter is only available to upfront payment mode.
Note: this field may return `null`, indicating that no valid value was found.
Note: this field may return `null`, indicating that no valid value was found. 
     * @return DiscountPriceThreeYear Discounted 3-year upfront payment, in USD. This parameter is only available to upfront payment mode.
Note: this field may return `null`, indicating that no valid value was found.
Note: this field may return `null`, indicating that no valid value was found.
     */
    public Float getDiscountPriceThreeYear() {
        return this.DiscountPriceThreeYear;
    }

    /**
     * Set Discounted 3-year upfront payment, in USD. This parameter is only available to upfront payment mode.
Note: this field may return `null`, indicating that no valid value was found.
Note: this field may return `null`, indicating that no valid value was found.
     * @param DiscountPriceThreeYear Discounted 3-year upfront payment, in USD. This parameter is only available to upfront payment mode.
Note: this field may return `null`, indicating that no valid value was found.
Note: this field may return `null`, indicating that no valid value was found.
     */
    public void setDiscountPriceThreeYear(Float DiscountPriceThreeYear) {
        this.DiscountPriceThreeYear = DiscountPriceThreeYear;
    }

    /**
     * Get Discount for 3-year upfront payment. For example, 20.0 indicates 80% off.
Note: this field may return `null`, indicating that no valid value was found.
Note: this field may return `null`, indicating that no valid value was found. 
     * @return DiscountThreeYear Discount for 3-year upfront payment. For example, 20.0 indicates 80% off.
Note: this field may return `null`, indicating that no valid value was found.
Note: this field may return `null`, indicating that no valid value was found.
     */
    public Float getDiscountThreeYear() {
        return this.DiscountThreeYear;
    }

    /**
     * Set Discount for 3-year upfront payment. For example, 20.0 indicates 80% off.
Note: this field may return `null`, indicating that no valid value was found.
Note: this field may return `null`, indicating that no valid value was found.
     * @param DiscountThreeYear Discount for 3-year upfront payment. For example, 20.0 indicates 80% off.
Note: this field may return `null`, indicating that no valid value was found.
Note: this field may return `null`, indicating that no valid value was found.
     */
    public void setDiscountThreeYear(Float DiscountThreeYear) {
        this.DiscountThreeYear = DiscountThreeYear;
    }

    /**
     * Get Original 5-year payment, in USD. This parameter is only available to upfront payment mode.
Note: this field may return `null`, indicating that no valid value was found.
Note: this field may return `null`, indicating that no valid value was found. 
     * @return OriginalPriceFiveYear Original 5-year payment, in USD. This parameter is only available to upfront payment mode.
Note: this field may return `null`, indicating that no valid value was found.
Note: this field may return `null`, indicating that no valid value was found.
     */
    public Float getOriginalPriceFiveYear() {
        return this.OriginalPriceFiveYear;
    }

    /**
     * Set Original 5-year payment, in USD. This parameter is only available to upfront payment mode.
Note: this field may return `null`, indicating that no valid value was found.
Note: this field may return `null`, indicating that no valid value was found.
     * @param OriginalPriceFiveYear Original 5-year payment, in USD. This parameter is only available to upfront payment mode.
Note: this field may return `null`, indicating that no valid value was found.
Note: this field may return `null`, indicating that no valid value was found.
     */
    public void setOriginalPriceFiveYear(Float OriginalPriceFiveYear) {
        this.OriginalPriceFiveYear = OriginalPriceFiveYear;
    }

    /**
     * Get Discounted 5-year upfront payment, in USD. This parameter is only available to upfront payment mode.
Note: this field may return `null`, indicating that no valid value was found.
Note: this field may return `null`, indicating that no valid value was found. 
     * @return DiscountPriceFiveYear Discounted 5-year upfront payment, in USD. This parameter is only available to upfront payment mode.
Note: this field may return `null`, indicating that no valid value was found.
Note: this field may return `null`, indicating that no valid value was found.
     */
    public Float getDiscountPriceFiveYear() {
        return this.DiscountPriceFiveYear;
    }

    /**
     * Set Discounted 5-year upfront payment, in USD. This parameter is only available to upfront payment mode.
Note: this field may return `null`, indicating that no valid value was found.
Note: this field may return `null`, indicating that no valid value was found.
     * @param DiscountPriceFiveYear Discounted 5-year upfront payment, in USD. This parameter is only available to upfront payment mode.
Note: this field may return `null`, indicating that no valid value was found.
Note: this field may return `null`, indicating that no valid value was found.
     */
    public void setDiscountPriceFiveYear(Float DiscountPriceFiveYear) {
        this.DiscountPriceFiveYear = DiscountPriceFiveYear;
    }

    /**
     * Get Discount for 5-year upfront payment. For example, 20.0 indicates 80% off.
Note: this field may return `null`, indicating that no valid value was found.
Note: this field may return `null`, indicating that no valid value was found. 
     * @return DiscountFiveYear Discount for 5-year upfront payment. For example, 20.0 indicates 80% off.
Note: this field may return `null`, indicating that no valid value was found.
Note: this field may return `null`, indicating that no valid value was found.
     */
    public Float getDiscountFiveYear() {
        return this.DiscountFiveYear;
    }

    /**
     * Set Discount for 5-year upfront payment. For example, 20.0 indicates 80% off.
Note: this field may return `null`, indicating that no valid value was found.
Note: this field may return `null`, indicating that no valid value was found.
     * @param DiscountFiveYear Discount for 5-year upfront payment. For example, 20.0 indicates 80% off.
Note: this field may return `null`, indicating that no valid value was found.
Note: this field may return `null`, indicating that no valid value was found.
     */
    public void setDiscountFiveYear(Float DiscountFiveYear) {
        this.DiscountFiveYear = DiscountFiveYear;
    }

    /**
     * Get Original 1-year payment, in USD. This parameter is only available to upfront payment mode.
Note: this field may return `null`, indicating that no valid value was found.
Note: this field may return `null`, indicating that no valid value was found. 
     * @return OriginalPriceOneYear Original 1-year payment, in USD. This parameter is only available to upfront payment mode.
Note: this field may return `null`, indicating that no valid value was found.
Note: this field may return `null`, indicating that no valid value was found.
     */
    public Float getOriginalPriceOneYear() {
        return this.OriginalPriceOneYear;
    }

    /**
     * Set Original 1-year payment, in USD. This parameter is only available to upfront payment mode.
Note: this field may return `null`, indicating that no valid value was found.
Note: this field may return `null`, indicating that no valid value was found.
     * @param OriginalPriceOneYear Original 1-year payment, in USD. This parameter is only available to upfront payment mode.
Note: this field may return `null`, indicating that no valid value was found.
Note: this field may return `null`, indicating that no valid value was found.
     */
    public void setOriginalPriceOneYear(Float OriginalPriceOneYear) {
        this.OriginalPriceOneYear = OriginalPriceOneYear;
    }

    /**
     * Get Discounted 1-year payment, in USD. This parameter is only available to upfront payment mode.
Note: this field may return `null`, indicating that no valid value was found.
Note: this field may return `null`, indicating that no valid value was found. 
     * @return DiscountPriceOneYear Discounted 1-year payment, in USD. This parameter is only available to upfront payment mode.
Note: this field may return `null`, indicating that no valid value was found.
Note: this field may return `null`, indicating that no valid value was found.
     */
    public Float getDiscountPriceOneYear() {
        return this.DiscountPriceOneYear;
    }

    /**
     * Set Discounted 1-year payment, in USD. This parameter is only available to upfront payment mode.
Note: this field may return `null`, indicating that no valid value was found.
Note: this field may return `null`, indicating that no valid value was found.
     * @param DiscountPriceOneYear Discounted 1-year payment, in USD. This parameter is only available to upfront payment mode.
Note: this field may return `null`, indicating that no valid value was found.
Note: this field may return `null`, indicating that no valid value was found.
     */
    public void setDiscountPriceOneYear(Float DiscountPriceOneYear) {
        this.DiscountPriceOneYear = DiscountPriceOneYear;
    }

    /**
     * Get Discount for 1-year upfront payment. For example, 20.0 indicates 80% off.
Note: this field may return `null`, indicating that no valid value was found.
Note: this field may return `null`, indicating that no valid value was found. 
     * @return DiscountOneYear Discount for 1-year upfront payment. For example, 20.0 indicates 80% off.
Note: this field may return `null`, indicating that no valid value was found.
Note: this field may return `null`, indicating that no valid value was found.
     */
    public Float getDiscountOneYear() {
        return this.DiscountOneYear;
    }

    /**
     * Set Discount for 1-year upfront payment. For example, 20.0 indicates 80% off.
Note: this field may return `null`, indicating that no valid value was found.
Note: this field may return `null`, indicating that no valid value was found.
     * @param DiscountOneYear Discount for 1-year upfront payment. For example, 20.0 indicates 80% off.
Note: this field may return `null`, indicating that no valid value was found.
Note: this field may return `null`, indicating that no valid value was found.
     */
    public void setDiscountOneYear(Float DiscountOneYear) {
        this.DiscountOneYear = DiscountOneYear;
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


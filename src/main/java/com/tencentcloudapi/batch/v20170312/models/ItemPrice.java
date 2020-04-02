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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ItemPrice extends AbstractModel{

    /**
    * The original unit price for pay-as-you-go mode in USD. <br><li>When a billing tier is returned, it indicates the price fo the returned billing tier. For example, if `UnitPriceSecondStep` is returned, it refers to the unit price for the usage between 0 to 96 hours. Otherwise, it refers to the unit price for the usage between 0 and ∞ hours.
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
    * Percentage of the original price. For example, if you enter "20", the discounted price will be 20% of the original price.
Note: this field may return null, indicating that no valid value is obtained.
    */
    @SerializedName("Discount")
    @Expose
    private Long Discount;

    /**
    * The discounted unit price for pay-as-you-go mode in USD. <br><li>When a billing tier is returned, it indicates the price fo the returned billing tier. For example, if `UnitPriceSecondStep` is returned, it refers to the unit price for the usage between 0 to 96 hours. Otherwise, it refers to the unit price for the usage between 0 and ∞ hours.
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
     * Get The original unit price for pay-as-you-go mode in USD. <br><li>When a billing tier is returned, it indicates the price fo the returned billing tier. For example, if `UnitPriceSecondStep` is returned, it refers to the unit price for the usage between 0 to 96 hours. Otherwise, it refers to the unit price for the usage between 0 and ∞ hours.
Note: this field may return null, indicating that no valid value is obtained. 
     * @return UnitPrice The original unit price for pay-as-you-go mode in USD. <br><li>When a billing tier is returned, it indicates the price fo the returned billing tier. For example, if `UnitPriceSecondStep` is returned, it refers to the unit price for the usage between 0 to 96 hours. Otherwise, it refers to the unit price for the usage between 0 and ∞ hours.
Note: this field may return null, indicating that no valid value is obtained.
     */
    public Float getUnitPrice() {
        return this.UnitPrice;
    }

    /**
     * Set The original unit price for pay-as-you-go mode in USD. <br><li>When a billing tier is returned, it indicates the price fo the returned billing tier. For example, if `UnitPriceSecondStep` is returned, it refers to the unit price for the usage between 0 to 96 hours. Otherwise, it refers to the unit price for the usage between 0 and ∞ hours.
Note: this field may return null, indicating that no valid value is obtained.
     * @param UnitPrice The original unit price for pay-as-you-go mode in USD. <br><li>When a billing tier is returned, it indicates the price fo the returned billing tier. For example, if `UnitPriceSecondStep` is returned, it refers to the unit price for the usage between 0 to 96 hours. Otherwise, it refers to the unit price for the usage between 0 and ∞ hours.
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
     * Get Percentage of the original price. For example, if you enter "20", the discounted price will be 20% of the original price.
Note: this field may return null, indicating that no valid value is obtained. 
     * @return Discount Percentage of the original price. For example, if you enter "20", the discounted price will be 20% of the original price.
Note: this field may return null, indicating that no valid value is obtained.
     */
    public Long getDiscount() {
        return this.Discount;
    }

    /**
     * Set Percentage of the original price. For example, if you enter "20", the discounted price will be 20% of the original price.
Note: this field may return null, indicating that no valid value is obtained.
     * @param Discount Percentage of the original price. For example, if you enter "20", the discounted price will be 20% of the original price.
Note: this field may return null, indicating that no valid value is obtained.
     */
    public void setDiscount(Long Discount) {
        this.Discount = Discount;
    }

    /**
     * Get The discounted unit price for pay-as-you-go mode in USD. <br><li>When a billing tier is returned, it indicates the price fo the returned billing tier. For example, if `UnitPriceSecondStep` is returned, it refers to the unit price for the usage between 0 to 96 hours. Otherwise, it refers to the unit price for the usage between 0 and ∞ hours.
Note: this field may return null, indicating that no valid value is obtained. 
     * @return UnitPriceDiscount The discounted unit price for pay-as-you-go mode in USD. <br><li>When a billing tier is returned, it indicates the price fo the returned billing tier. For example, if `UnitPriceSecondStep` is returned, it refers to the unit price for the usage between 0 to 96 hours. Otherwise, it refers to the unit price for the usage between 0 and ∞ hours.
Note: this field may return null, indicating that no valid value is obtained.
     */
    public Float getUnitPriceDiscount() {
        return this.UnitPriceDiscount;
    }

    /**
     * Set The discounted unit price for pay-as-you-go mode in USD. <br><li>When a billing tier is returned, it indicates the price fo the returned billing tier. For example, if `UnitPriceSecondStep` is returned, it refers to the unit price for the usage between 0 to 96 hours. Otherwise, it refers to the unit price for the usage between 0 and ∞ hours.
Note: this field may return null, indicating that no valid value is obtained.
     * @param UnitPriceDiscount The discounted unit price for pay-as-you-go mode in USD. <br><li>When a billing tier is returned, it indicates the price fo the returned billing tier. For example, if `UnitPriceSecondStep` is returned, it refers to the unit price for the usage between 0 to 96 hours. Otherwise, it refers to the unit price for the usage between 0 and ∞ hours.
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

    }
}


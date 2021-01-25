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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrepayPrice extends AbstractModel{

    /**
    * Original price of the advanced payment for a prepaid cloud disk or snapshot (in CNY).
    */
    @SerializedName("OriginalPrice")
    @Expose
    private Float OriginalPrice;

    /**
    * Discount price of the advanced payment for a prepaid cloud disk or snapshot (in CNY).
    */
    @SerializedName("DiscountPrice")
    @Expose
    private Float DiscountPrice;

    /**
    * Highly-precise published unit price of a monthly-subscribed cloud disk or a snapshot, in USD.
    */
    @SerializedName("OriginalPriceHigh")
    @Expose
    private String OriginalPriceHigh;

    /**
    * Highly-precise discounted unit price of a monthly-subscribed cloud disk or a snapshot, in USD.
    */
    @SerializedName("DiscountPriceHigh")
    @Expose
    private String DiscountPriceHigh;

    /**
    * Published unit price of a pay-as-you-go cloud disk, in USD.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("UnitPrice")
    @Expose
    private String UnitPrice;

    /**
    * Billing unit for pay-as-you-go cloud disks. Valid value: <br><li>HOUR: billed hourly.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ChargeUnit")
    @Expose
    private String ChargeUnit;

    /**
    * Discount unit price of a pay-as-you-go cloud disk, in USD.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("UnitPriceDiscount")
    @Expose
    private String UnitPriceDiscount;

    /**
    * Highly-precise published unit price of a pay-as-you-go cloud disk, in USD.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("UnitPriceHigh")
    @Expose
    private String UnitPriceHigh;

    /**
    * Highly-precise discounted unit price of a pay-as-you-go cloud disk, in USD.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("UnitPriceDiscountHigh")
    @Expose
    private String UnitPriceDiscountHigh;

    /**
     * Get Original price of the advanced payment for a prepaid cloud disk or snapshot (in CNY). 
     * @return OriginalPrice Original price of the advanced payment for a prepaid cloud disk or snapshot (in CNY).
     */
    public Float getOriginalPrice() {
        return this.OriginalPrice;
    }

    /**
     * Set Original price of the advanced payment for a prepaid cloud disk or snapshot (in CNY).
     * @param OriginalPrice Original price of the advanced payment for a prepaid cloud disk or snapshot (in CNY).
     */
    public void setOriginalPrice(Float OriginalPrice) {
        this.OriginalPrice = OriginalPrice;
    }

    /**
     * Get Discount price of the advanced payment for a prepaid cloud disk or snapshot (in CNY). 
     * @return DiscountPrice Discount price of the advanced payment for a prepaid cloud disk or snapshot (in CNY).
     */
    public Float getDiscountPrice() {
        return this.DiscountPrice;
    }

    /**
     * Set Discount price of the advanced payment for a prepaid cloud disk or snapshot (in CNY).
     * @param DiscountPrice Discount price of the advanced payment for a prepaid cloud disk or snapshot (in CNY).
     */
    public void setDiscountPrice(Float DiscountPrice) {
        this.DiscountPrice = DiscountPrice;
    }

    /**
     * Get Highly-precise published unit price of a monthly-subscribed cloud disk or a snapshot, in USD. 
     * @return OriginalPriceHigh Highly-precise published unit price of a monthly-subscribed cloud disk or a snapshot, in USD.
     */
    public String getOriginalPriceHigh() {
        return this.OriginalPriceHigh;
    }

    /**
     * Set Highly-precise published unit price of a monthly-subscribed cloud disk or a snapshot, in USD.
     * @param OriginalPriceHigh Highly-precise published unit price of a monthly-subscribed cloud disk or a snapshot, in USD.
     */
    public void setOriginalPriceHigh(String OriginalPriceHigh) {
        this.OriginalPriceHigh = OriginalPriceHigh;
    }

    /**
     * Get Highly-precise discounted unit price of a monthly-subscribed cloud disk or a snapshot, in USD. 
     * @return DiscountPriceHigh Highly-precise discounted unit price of a monthly-subscribed cloud disk or a snapshot, in USD.
     */
    public String getDiscountPriceHigh() {
        return this.DiscountPriceHigh;
    }

    /**
     * Set Highly-precise discounted unit price of a monthly-subscribed cloud disk or a snapshot, in USD.
     * @param DiscountPriceHigh Highly-precise discounted unit price of a monthly-subscribed cloud disk or a snapshot, in USD.
     */
    public void setDiscountPriceHigh(String DiscountPriceHigh) {
        this.DiscountPriceHigh = DiscountPriceHigh;
    }

    /**
     * Get Published unit price of a pay-as-you-go cloud disk, in USD.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return UnitPrice Published unit price of a pay-as-you-go cloud disk, in USD.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getUnitPrice() {
        return this.UnitPrice;
    }

    /**
     * Set Published unit price of a pay-as-you-go cloud disk, in USD.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param UnitPrice Published unit price of a pay-as-you-go cloud disk, in USD.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setUnitPrice(String UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    /**
     * Get Billing unit for pay-as-you-go cloud disks. Valid value: <br><li>HOUR: billed hourly.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ChargeUnit Billing unit for pay-as-you-go cloud disks. Valid value: <br><li>HOUR: billed hourly.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getChargeUnit() {
        return this.ChargeUnit;
    }

    /**
     * Set Billing unit for pay-as-you-go cloud disks. Valid value: <br><li>HOUR: billed hourly.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ChargeUnit Billing unit for pay-as-you-go cloud disks. Valid value: <br><li>HOUR: billed hourly.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setChargeUnit(String ChargeUnit) {
        this.ChargeUnit = ChargeUnit;
    }

    /**
     * Get Discount unit price of a pay-as-you-go cloud disk, in USD.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return UnitPriceDiscount Discount unit price of a pay-as-you-go cloud disk, in USD.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getUnitPriceDiscount() {
        return this.UnitPriceDiscount;
    }

    /**
     * Set Discount unit price of a pay-as-you-go cloud disk, in USD.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param UnitPriceDiscount Discount unit price of a pay-as-you-go cloud disk, in USD.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setUnitPriceDiscount(String UnitPriceDiscount) {
        this.UnitPriceDiscount = UnitPriceDiscount;
    }

    /**
     * Get Highly-precise published unit price of a pay-as-you-go cloud disk, in USD.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return UnitPriceHigh Highly-precise published unit price of a pay-as-you-go cloud disk, in USD.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getUnitPriceHigh() {
        return this.UnitPriceHigh;
    }

    /**
     * Set Highly-precise published unit price of a pay-as-you-go cloud disk, in USD.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param UnitPriceHigh Highly-precise published unit price of a pay-as-you-go cloud disk, in USD.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setUnitPriceHigh(String UnitPriceHigh) {
        this.UnitPriceHigh = UnitPriceHigh;
    }

    /**
     * Get Highly-precise discounted unit price of a pay-as-you-go cloud disk, in USD.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return UnitPriceDiscountHigh Highly-precise discounted unit price of a pay-as-you-go cloud disk, in USD.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getUnitPriceDiscountHigh() {
        return this.UnitPriceDiscountHigh;
    }

    /**
     * Set Highly-precise discounted unit price of a pay-as-you-go cloud disk, in USD.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param UnitPriceDiscountHigh Highly-precise discounted unit price of a pay-as-you-go cloud disk, in USD.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setUnitPriceDiscountHigh(String UnitPriceDiscountHigh) {
        this.UnitPriceDiscountHigh = UnitPriceDiscountHigh;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OriginalPrice", this.OriginalPrice);
        this.setParamSimple(map, prefix + "DiscountPrice", this.DiscountPrice);
        this.setParamSimple(map, prefix + "OriginalPriceHigh", this.OriginalPriceHigh);
        this.setParamSimple(map, prefix + "DiscountPriceHigh", this.DiscountPriceHigh);
        this.setParamSimple(map, prefix + "UnitPrice", this.UnitPrice);
        this.setParamSimple(map, prefix + "ChargeUnit", this.ChargeUnit);
        this.setParamSimple(map, prefix + "UnitPriceDiscount", this.UnitPriceDiscount);
        this.setParamSimple(map, prefix + "UnitPriceHigh", this.UnitPriceHigh);
        this.setParamSimple(map, prefix + "UnitPriceDiscountHigh", this.UnitPriceDiscountHigh);

    }
}


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

public class DetailPrice extends AbstractModel{

    /**
    * Name of the billable item.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PriceTitle")
    @Expose
    private String PriceTitle;

    /**
    * Name of the billable item displayed in the console.
    */
    @SerializedName("PriceName")
    @Expose
    private String PriceName;

    /**
    * Original price of a monthly subscribed cloud disk, in USD.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OriginalPrice")
    @Expose
    private Float OriginalPrice;

    /**
    * Discounted price of a monthly subscribed cloud disk, in USD.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DiscountPrice")
    @Expose
    private Float DiscountPrice;

    /**
    * Original unit price of a pay-as-you-go cloud disk, in USD.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UnitPrice")
    @Expose
    private Float UnitPrice;

    /**
    * Discount unit price of a pay-as-you-go cloud disk, in USD.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UnitPriceDiscount")
    @Expose
    private Float UnitPriceDiscount;

    /**
    * Billing unit for pay-as-you-go cloud disks. Valid value: `HOUR` (billed hourly).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ChargeUnit")
    @Expose
    private String ChargeUnit;

    /**
    * Original highly-precise price of a monthly subscribed cloud disk, in USD.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OriginalPriceHigh")
    @Expose
    private String OriginalPriceHigh;

    /**
    * Discounted highly-precise price of a monthly subscribed cloud disk, in USD.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DiscountPriceHigh")
    @Expose
    private String DiscountPriceHigh;

    /**
    * Original highly-precise unit price of a pay-as-you-go cloud disk, in USD.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UnitPriceHigh")
    @Expose
    private String UnitPriceHigh;

    /**
    * Discounted highly-precise unit price of a pay-as-you-go cloud disk, in USD.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UnitPriceDiscountHigh")
    @Expose
    private String UnitPriceDiscountHigh;

    /**
     * Get Name of the billable item.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PriceTitle Name of the billable item.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPriceTitle() {
        return this.PriceTitle;
    }

    /**
     * Set Name of the billable item.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PriceTitle Name of the billable item.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPriceTitle(String PriceTitle) {
        this.PriceTitle = PriceTitle;
    }

    /**
     * Get Name of the billable item displayed in the console. 
     * @return PriceName Name of the billable item displayed in the console.
     */
    public String getPriceName() {
        return this.PriceName;
    }

    /**
     * Set Name of the billable item displayed in the console.
     * @param PriceName Name of the billable item displayed in the console.
     */
    public void setPriceName(String PriceName) {
        this.PriceName = PriceName;
    }

    /**
     * Get Original price of a monthly subscribed cloud disk, in USD.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OriginalPrice Original price of a monthly subscribed cloud disk, in USD.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getOriginalPrice() {
        return this.OriginalPrice;
    }

    /**
     * Set Original price of a monthly subscribed cloud disk, in USD.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OriginalPrice Original price of a monthly subscribed cloud disk, in USD.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOriginalPrice(Float OriginalPrice) {
        this.OriginalPrice = OriginalPrice;
    }

    /**
     * Get Discounted price of a monthly subscribed cloud disk, in USD.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DiscountPrice Discounted price of a monthly subscribed cloud disk, in USD.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getDiscountPrice() {
        return this.DiscountPrice;
    }

    /**
     * Set Discounted price of a monthly subscribed cloud disk, in USD.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DiscountPrice Discounted price of a monthly subscribed cloud disk, in USD.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDiscountPrice(Float DiscountPrice) {
        this.DiscountPrice = DiscountPrice;
    }

    /**
     * Get Original unit price of a pay-as-you-go cloud disk, in USD.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UnitPrice Original unit price of a pay-as-you-go cloud disk, in USD.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getUnitPrice() {
        return this.UnitPrice;
    }

    /**
     * Set Original unit price of a pay-as-you-go cloud disk, in USD.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UnitPrice Original unit price of a pay-as-you-go cloud disk, in USD.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUnitPrice(Float UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    /**
     * Get Discount unit price of a pay-as-you-go cloud disk, in USD.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UnitPriceDiscount Discount unit price of a pay-as-you-go cloud disk, in USD.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getUnitPriceDiscount() {
        return this.UnitPriceDiscount;
    }

    /**
     * Set Discount unit price of a pay-as-you-go cloud disk, in USD.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UnitPriceDiscount Discount unit price of a pay-as-you-go cloud disk, in USD.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUnitPriceDiscount(Float UnitPriceDiscount) {
        this.UnitPriceDiscount = UnitPriceDiscount;
    }

    /**
     * Get Billing unit for pay-as-you-go cloud disks. Valid value: `HOUR` (billed hourly).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ChargeUnit Billing unit for pay-as-you-go cloud disks. Valid value: `HOUR` (billed hourly).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getChargeUnit() {
        return this.ChargeUnit;
    }

    /**
     * Set Billing unit for pay-as-you-go cloud disks. Valid value: `HOUR` (billed hourly).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ChargeUnit Billing unit for pay-as-you-go cloud disks. Valid value: `HOUR` (billed hourly).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setChargeUnit(String ChargeUnit) {
        this.ChargeUnit = ChargeUnit;
    }

    /**
     * Get Original highly-precise price of a monthly subscribed cloud disk, in USD.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OriginalPriceHigh Original highly-precise price of a monthly subscribed cloud disk, in USD.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOriginalPriceHigh() {
        return this.OriginalPriceHigh;
    }

    /**
     * Set Original highly-precise price of a monthly subscribed cloud disk, in USD.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OriginalPriceHigh Original highly-precise price of a monthly subscribed cloud disk, in USD.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOriginalPriceHigh(String OriginalPriceHigh) {
        this.OriginalPriceHigh = OriginalPriceHigh;
    }

    /**
     * Get Discounted highly-precise price of a monthly subscribed cloud disk, in USD.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DiscountPriceHigh Discounted highly-precise price of a monthly subscribed cloud disk, in USD.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDiscountPriceHigh() {
        return this.DiscountPriceHigh;
    }

    /**
     * Set Discounted highly-precise price of a monthly subscribed cloud disk, in USD.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DiscountPriceHigh Discounted highly-precise price of a monthly subscribed cloud disk, in USD.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDiscountPriceHigh(String DiscountPriceHigh) {
        this.DiscountPriceHigh = DiscountPriceHigh;
    }

    /**
     * Get Original highly-precise unit price of a pay-as-you-go cloud disk, in USD.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UnitPriceHigh Original highly-precise unit price of a pay-as-you-go cloud disk, in USD.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUnitPriceHigh() {
        return this.UnitPriceHigh;
    }

    /**
     * Set Original highly-precise unit price of a pay-as-you-go cloud disk, in USD.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UnitPriceHigh Original highly-precise unit price of a pay-as-you-go cloud disk, in USD.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUnitPriceHigh(String UnitPriceHigh) {
        this.UnitPriceHigh = UnitPriceHigh;
    }

    /**
     * Get Discounted highly-precise unit price of a pay-as-you-go cloud disk, in USD.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UnitPriceDiscountHigh Discounted highly-precise unit price of a pay-as-you-go cloud disk, in USD.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUnitPriceDiscountHigh() {
        return this.UnitPriceDiscountHigh;
    }

    /**
     * Set Discounted highly-precise unit price of a pay-as-you-go cloud disk, in USD.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UnitPriceDiscountHigh Discounted highly-precise unit price of a pay-as-you-go cloud disk, in USD.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUnitPriceDiscountHigh(String UnitPriceDiscountHigh) {
        this.UnitPriceDiscountHigh = UnitPriceDiscountHigh;
    }

    public DetailPrice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetailPrice(DetailPrice source) {
        if (source.PriceTitle != null) {
            this.PriceTitle = new String(source.PriceTitle);
        }
        if (source.PriceName != null) {
            this.PriceName = new String(source.PriceName);
        }
        if (source.OriginalPrice != null) {
            this.OriginalPrice = new Float(source.OriginalPrice);
        }
        if (source.DiscountPrice != null) {
            this.DiscountPrice = new Float(source.DiscountPrice);
        }
        if (source.UnitPrice != null) {
            this.UnitPrice = new Float(source.UnitPrice);
        }
        if (source.UnitPriceDiscount != null) {
            this.UnitPriceDiscount = new Float(source.UnitPriceDiscount);
        }
        if (source.ChargeUnit != null) {
            this.ChargeUnit = new String(source.ChargeUnit);
        }
        if (source.OriginalPriceHigh != null) {
            this.OriginalPriceHigh = new String(source.OriginalPriceHigh);
        }
        if (source.DiscountPriceHigh != null) {
            this.DiscountPriceHigh = new String(source.DiscountPriceHigh);
        }
        if (source.UnitPriceHigh != null) {
            this.UnitPriceHigh = new String(source.UnitPriceHigh);
        }
        if (source.UnitPriceDiscountHigh != null) {
            this.UnitPriceDiscountHigh = new String(source.UnitPriceDiscountHigh);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PriceTitle", this.PriceTitle);
        this.setParamSimple(map, prefix + "PriceName", this.PriceName);
        this.setParamSimple(map, prefix + "OriginalPrice", this.OriginalPrice);
        this.setParamSimple(map, prefix + "DiscountPrice", this.DiscountPrice);
        this.setParamSimple(map, prefix + "UnitPrice", this.UnitPrice);
        this.setParamSimple(map, prefix + "UnitPriceDiscount", this.UnitPriceDiscount);
        this.setParamSimple(map, prefix + "ChargeUnit", this.ChargeUnit);
        this.setParamSimple(map, prefix + "OriginalPriceHigh", this.OriginalPriceHigh);
        this.setParamSimple(map, prefix + "DiscountPriceHigh", this.DiscountPriceHigh);
        this.setParamSimple(map, prefix + "UnitPriceHigh", this.UnitPriceHigh);
        this.setParamSimple(map, prefix + "UnitPriceDiscountHigh", this.UnitPriceDiscountHigh);

    }
}


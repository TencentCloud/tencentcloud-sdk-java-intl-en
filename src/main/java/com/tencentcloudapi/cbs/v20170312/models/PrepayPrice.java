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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrepayPrice extends AbstractModel {

    /**
    * Discounted price of a monthly-subscribed cloud disk or a snapshot, in USD.
    */
    @SerializedName("DiscountPrice")
    @Expose
    private Float DiscountPrice;

    /**
    * Billing unit for pay-as-you-go cloud disks. Valid value: <br><li>HOUR: billed hourly.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ChargeUnit")
    @Expose
    private String ChargeUnit;

    /**
    * Original unit price of a pay-as-you-go cloud disk, in USD, with six decimal places.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("UnitPriceHigh")
    @Expose
    private String UnitPriceHigh;

    /**
    * Original payment of a monthly-subscribed cloud disk or a snapshot, in USD, with six decimal places.
    */
    @SerializedName("OriginalPriceHigh")
    @Expose
    private String OriginalPriceHigh;

    /**
    * Original payment of a monthly-subscribed cloud disk or a snapshot, in USD.
    */
    @SerializedName("OriginalPrice")
    @Expose
    private Float OriginalPrice;

    /**
    * Discount unit price of a pay-as-you-go cloud disk, in USD.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("UnitPriceDiscount")
    @Expose
    private Float UnitPriceDiscount;

    /**
    * Discounted unit price of a pay-as-you-go cloud disk, in USD, with six decimal places.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("UnitPriceDiscountHigh")
    @Expose
    private String UnitPriceDiscountHigh;

    /**
    * Discounted price of a monthly-subscribed cloud disk or a snapshot, in USD, with six decimal places.
    */
    @SerializedName("DiscountPriceHigh")
    @Expose
    private String DiscountPriceHigh;

    /**
    * Original unit price of a pay-as-you-go cloud disk, in USD.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("UnitPrice")
    @Expose
    private Float UnitPrice;

    /**
    * Detailed billing items
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DetailPrices")
    @Expose
    private DetailPrice [] DetailPrices;

    /**
     * Get Discounted price of a monthly-subscribed cloud disk or a snapshot, in USD. 
     * @return DiscountPrice Discounted price of a monthly-subscribed cloud disk or a snapshot, in USD.
     */
    public Float getDiscountPrice() {
        return this.DiscountPrice;
    }

    /**
     * Set Discounted price of a monthly-subscribed cloud disk or a snapshot, in USD.
     * @param DiscountPrice Discounted price of a monthly-subscribed cloud disk or a snapshot, in USD.
     */
    public void setDiscountPrice(Float DiscountPrice) {
        this.DiscountPrice = DiscountPrice;
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
     * Get Original unit price of a pay-as-you-go cloud disk, in USD, with six decimal places.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return UnitPriceHigh Original unit price of a pay-as-you-go cloud disk, in USD, with six decimal places.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getUnitPriceHigh() {
        return this.UnitPriceHigh;
    }

    /**
     * Set Original unit price of a pay-as-you-go cloud disk, in USD, with six decimal places.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param UnitPriceHigh Original unit price of a pay-as-you-go cloud disk, in USD, with six decimal places.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setUnitPriceHigh(String UnitPriceHigh) {
        this.UnitPriceHigh = UnitPriceHigh;
    }

    /**
     * Get Original payment of a monthly-subscribed cloud disk or a snapshot, in USD, with six decimal places. 
     * @return OriginalPriceHigh Original payment of a monthly-subscribed cloud disk or a snapshot, in USD, with six decimal places.
     */
    public String getOriginalPriceHigh() {
        return this.OriginalPriceHigh;
    }

    /**
     * Set Original payment of a monthly-subscribed cloud disk or a snapshot, in USD, with six decimal places.
     * @param OriginalPriceHigh Original payment of a monthly-subscribed cloud disk or a snapshot, in USD, with six decimal places.
     */
    public void setOriginalPriceHigh(String OriginalPriceHigh) {
        this.OriginalPriceHigh = OriginalPriceHigh;
    }

    /**
     * Get Original payment of a monthly-subscribed cloud disk or a snapshot, in USD. 
     * @return OriginalPrice Original payment of a monthly-subscribed cloud disk or a snapshot, in USD.
     */
    public Float getOriginalPrice() {
        return this.OriginalPrice;
    }

    /**
     * Set Original payment of a monthly-subscribed cloud disk or a snapshot, in USD.
     * @param OriginalPrice Original payment of a monthly-subscribed cloud disk or a snapshot, in USD.
     */
    public void setOriginalPrice(Float OriginalPrice) {
        this.OriginalPrice = OriginalPrice;
    }

    /**
     * Get Discount unit price of a pay-as-you-go cloud disk, in USD.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return UnitPriceDiscount Discount unit price of a pay-as-you-go cloud disk, in USD.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Float getUnitPriceDiscount() {
        return this.UnitPriceDiscount;
    }

    /**
     * Set Discount unit price of a pay-as-you-go cloud disk, in USD.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param UnitPriceDiscount Discount unit price of a pay-as-you-go cloud disk, in USD.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setUnitPriceDiscount(Float UnitPriceDiscount) {
        this.UnitPriceDiscount = UnitPriceDiscount;
    }

    /**
     * Get Discounted unit price of a pay-as-you-go cloud disk, in USD, with six decimal places.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return UnitPriceDiscountHigh Discounted unit price of a pay-as-you-go cloud disk, in USD, with six decimal places.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getUnitPriceDiscountHigh() {
        return this.UnitPriceDiscountHigh;
    }

    /**
     * Set Discounted unit price of a pay-as-you-go cloud disk, in USD, with six decimal places.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param UnitPriceDiscountHigh Discounted unit price of a pay-as-you-go cloud disk, in USD, with six decimal places.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setUnitPriceDiscountHigh(String UnitPriceDiscountHigh) {
        this.UnitPriceDiscountHigh = UnitPriceDiscountHigh;
    }

    /**
     * Get Discounted price of a monthly-subscribed cloud disk or a snapshot, in USD, with six decimal places. 
     * @return DiscountPriceHigh Discounted price of a monthly-subscribed cloud disk or a snapshot, in USD, with six decimal places.
     */
    public String getDiscountPriceHigh() {
        return this.DiscountPriceHigh;
    }

    /**
     * Set Discounted price of a monthly-subscribed cloud disk or a snapshot, in USD, with six decimal places.
     * @param DiscountPriceHigh Discounted price of a monthly-subscribed cloud disk or a snapshot, in USD, with six decimal places.
     */
    public void setDiscountPriceHigh(String DiscountPriceHigh) {
        this.DiscountPriceHigh = DiscountPriceHigh;
    }

    /**
     * Get Original unit price of a pay-as-you-go cloud disk, in USD.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return UnitPrice Original unit price of a pay-as-you-go cloud disk, in USD.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Float getUnitPrice() {
        return this.UnitPrice;
    }

    /**
     * Set Original unit price of a pay-as-you-go cloud disk, in USD.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param UnitPrice Original unit price of a pay-as-you-go cloud disk, in USD.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setUnitPrice(Float UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    /**
     * Get Detailed billing items
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DetailPrices Detailed billing items
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DetailPrice [] getDetailPrices() {
        return this.DetailPrices;
    }

    /**
     * Set Detailed billing items
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DetailPrices Detailed billing items
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDetailPrices(DetailPrice [] DetailPrices) {
        this.DetailPrices = DetailPrices;
    }

    public PrepayPrice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrepayPrice(PrepayPrice source) {
        if (source.DiscountPrice != null) {
            this.DiscountPrice = new Float(source.DiscountPrice);
        }
        if (source.ChargeUnit != null) {
            this.ChargeUnit = new String(source.ChargeUnit);
        }
        if (source.UnitPriceHigh != null) {
            this.UnitPriceHigh = new String(source.UnitPriceHigh);
        }
        if (source.OriginalPriceHigh != null) {
            this.OriginalPriceHigh = new String(source.OriginalPriceHigh);
        }
        if (source.OriginalPrice != null) {
            this.OriginalPrice = new Float(source.OriginalPrice);
        }
        if (source.UnitPriceDiscount != null) {
            this.UnitPriceDiscount = new Float(source.UnitPriceDiscount);
        }
        if (source.UnitPriceDiscountHigh != null) {
            this.UnitPriceDiscountHigh = new String(source.UnitPriceDiscountHigh);
        }
        if (source.DiscountPriceHigh != null) {
            this.DiscountPriceHigh = new String(source.DiscountPriceHigh);
        }
        if (source.UnitPrice != null) {
            this.UnitPrice = new Float(source.UnitPrice);
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
        this.setParamSimple(map, prefix + "DiscountPrice", this.DiscountPrice);
        this.setParamSimple(map, prefix + "ChargeUnit", this.ChargeUnit);
        this.setParamSimple(map, prefix + "UnitPriceHigh", this.UnitPriceHigh);
        this.setParamSimple(map, prefix + "OriginalPriceHigh", this.OriginalPriceHigh);
        this.setParamSimple(map, prefix + "OriginalPrice", this.OriginalPrice);
        this.setParamSimple(map, prefix + "UnitPriceDiscount", this.UnitPriceDiscount);
        this.setParamSimple(map, prefix + "UnitPriceDiscountHigh", this.UnitPriceDiscountHigh);
        this.setParamSimple(map, prefix + "DiscountPriceHigh", this.DiscountPriceHigh);
        this.setParamSimple(map, prefix + "UnitPrice", this.UnitPrice);
        this.setParamArrayObj(map, prefix + "DetailPrices.", this.DetailPrices);

    }
}


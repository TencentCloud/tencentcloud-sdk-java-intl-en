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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ItemPrice extends AbstractModel {

    /**
    * PAYG unit price, in USD.
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("UnitPrice")
    @Expose
    private Float UnitPrice;

    /**
    * Subsequent billing unit. Value Range: 
`HOUR`: Calculate the cost by hour. It's available when "InternetChargeType=POSTPAID_BY_HOUR".
`GB`: Calculate the cost by traffic in GB. It's available when "InternetChargeType=TRAFFIC_POSTPAID_BY_HOUR".
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("ChargeUnit")
    @Expose
    private String ChargeUnit;

    /**
    * Reserved field
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("OriginalPrice")
    @Expose
    private Float OriginalPrice;

    /**
    * Reserved field
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("DiscountPrice")
    @Expose
    private Float DiscountPrice;

    /**
    * Discount unit price of a pay-as-you-go instance, in USD.
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("UnitPriceDiscount")
    @Expose
    private Float UnitPriceDiscount;

    /**
    * Discount. For example, 20.0 indicates 80% off.
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Discount")
    @Expose
    private Float Discount;

    /**
     * Get PAYG unit price, in USD.
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return UnitPrice PAYG unit price, in USD.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Float getUnitPrice() {
        return this.UnitPrice;
    }

    /**
     * Set PAYG unit price, in USD.
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param UnitPrice PAYG unit price, in USD.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setUnitPrice(Float UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    /**
     * Get Subsequent billing unit. Value Range: 
`HOUR`: Calculate the cost by hour. It's available when "InternetChargeType=POSTPAID_BY_HOUR".
`GB`: Calculate the cost by traffic in GB. It's available when "InternetChargeType=TRAFFIC_POSTPAID_BY_HOUR".
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return ChargeUnit Subsequent billing unit. Value Range: 
`HOUR`: Calculate the cost by hour. It's available when "InternetChargeType=POSTPAID_BY_HOUR".
`GB`: Calculate the cost by traffic in GB. It's available when "InternetChargeType=TRAFFIC_POSTPAID_BY_HOUR".
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getChargeUnit() {
        return this.ChargeUnit;
    }

    /**
     * Set Subsequent billing unit. Value Range: 
`HOUR`: Calculate the cost by hour. It's available when "InternetChargeType=POSTPAID_BY_HOUR".
`GB`: Calculate the cost by traffic in GB. It's available when "InternetChargeType=TRAFFIC_POSTPAID_BY_HOUR".
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param ChargeUnit Subsequent billing unit. Value Range: 
`HOUR`: Calculate the cost by hour. It's available when "InternetChargeType=POSTPAID_BY_HOUR".
`GB`: Calculate the cost by traffic in GB. It's available when "InternetChargeType=TRAFFIC_POSTPAID_BY_HOUR".
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setChargeUnit(String ChargeUnit) {
        this.ChargeUnit = ChargeUnit;
    }

    /**
     * Get Reserved field
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return OriginalPrice Reserved field
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Float getOriginalPrice() {
        return this.OriginalPrice;
    }

    /**
     * Set Reserved field
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param OriginalPrice Reserved field
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setOriginalPrice(Float OriginalPrice) {
        this.OriginalPrice = OriginalPrice;
    }

    /**
     * Get Reserved field
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return DiscountPrice Reserved field
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Float getDiscountPrice() {
        return this.DiscountPrice;
    }

    /**
     * Set Reserved field
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param DiscountPrice Reserved field
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setDiscountPrice(Float DiscountPrice) {
        this.DiscountPrice = DiscountPrice;
    }

    /**
     * Get Discount unit price of a pay-as-you-go instance, in USD.
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return UnitPriceDiscount Discount unit price of a pay-as-you-go instance, in USD.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Float getUnitPriceDiscount() {
        return this.UnitPriceDiscount;
    }

    /**
     * Set Discount unit price of a pay-as-you-go instance, in USD.
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param UnitPriceDiscount Discount unit price of a pay-as-you-go instance, in USD.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setUnitPriceDiscount(Float UnitPriceDiscount) {
        this.UnitPriceDiscount = UnitPriceDiscount;
    }

    /**
     * Get Discount. For example, 20.0 indicates 80% off.
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Discount Discount. For example, 20.0 indicates 80% off.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Float getDiscount() {
        return this.Discount;
    }

    /**
     * Set Discount. For example, 20.0 indicates 80% off.
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Discount Discount. For example, 20.0 indicates 80% off.
Note: This field may return·null, indicating that no valid values can be obtained.
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


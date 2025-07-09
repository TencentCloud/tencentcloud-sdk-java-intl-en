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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryBasePrice extends AbstractModel {

    /**
    * Original unit price
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UnitPrice")
    @Expose
    private Float UnitPrice;

    /**
    * Discounted unit price
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UnitPriceDiscount")
    @Expose
    private Float UnitPriceDiscount;

    /**
    * Original price in total
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OriginalPrice")
    @Expose
    private Float OriginalPrice;

    /**
    * Discounted price in total
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DiscountPrice")
    @Expose
    private Float DiscountPrice;

    /**
    * Discount (%)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Discount")
    @Expose
    private Float Discount;

    /**
    * Number of purchased items
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * Currency for payment
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
    * Dedicated disk response parameter
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * Validity period
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * Unit of the validity period (`m`: Month; `h`: Hour)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * Purchase quantity
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Value")
    @Expose
    private Long Value;

    /**
     * Get Original unit price
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UnitPrice Original unit price
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getUnitPrice() {
        return this.UnitPrice;
    }

    /**
     * Set Original unit price
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UnitPrice Original unit price
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUnitPrice(Float UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    /**
     * Get Discounted unit price
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UnitPriceDiscount Discounted unit price
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getUnitPriceDiscount() {
        return this.UnitPriceDiscount;
    }

    /**
     * Set Discounted unit price
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UnitPriceDiscount Discounted unit price
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUnitPriceDiscount(Float UnitPriceDiscount) {
        this.UnitPriceDiscount = UnitPriceDiscount;
    }

    /**
     * Get Original price in total
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OriginalPrice Original price in total
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getOriginalPrice() {
        return this.OriginalPrice;
    }

    /**
     * Set Original price in total
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OriginalPrice Original price in total
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOriginalPrice(Float OriginalPrice) {
        this.OriginalPrice = OriginalPrice;
    }

    /**
     * Get Discounted price in total
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DiscountPrice Discounted price in total
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getDiscountPrice() {
        return this.DiscountPrice;
    }

    /**
     * Set Discounted price in total
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DiscountPrice Discounted price in total
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDiscountPrice(Float DiscountPrice) {
        this.DiscountPrice = DiscountPrice;
    }

    /**
     * Get Discount (%)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Discount Discount (%)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getDiscount() {
        return this.Discount;
    }

    /**
     * Set Discount (%)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Discount Discount (%)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDiscount(Float Discount) {
        this.Discount = Discount;
    }

    /**
     * Get Number of purchased items
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GoodsNum Number of purchased items
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set Number of purchased items
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GoodsNum Number of purchased items
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get Currency for payment
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Currency Currency for payment
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCurrency() {
        return this.Currency;
    }

    /**
     * Set Currency for payment
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Currency Currency for payment
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    /**
     * Get Dedicated disk response parameter
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DiskType Dedicated disk response parameter
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set Dedicated disk response parameter
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DiskType Dedicated disk response parameter
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get Validity period
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TimeSpan Validity period
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set Validity period
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TimeSpan Validity period
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get Unit of the validity period (`m`: Month; `h`: Hour)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TimeUnit Unit of the validity period (`m`: Month; `h`: Hour)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set Unit of the validity period (`m`: Month; `h`: Hour)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TimeUnit Unit of the validity period (`m`: Month; `h`: Hour)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get Purchase quantity
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Value Purchase quantity
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getValue() {
        return this.Value;
    }

    /**
     * Set Purchase quantity
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Value Purchase quantity
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setValue(Long Value) {
        this.Value = Value;
    }

    public InquiryBasePrice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquiryBasePrice(InquiryBasePrice source) {
        if (source.UnitPrice != null) {
            this.UnitPrice = new Float(source.UnitPrice);
        }
        if (source.UnitPriceDiscount != null) {
            this.UnitPriceDiscount = new Float(source.UnitPriceDiscount);
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
        if (source.GoodsNum != null) {
            this.GoodsNum = new Long(source.GoodsNum);
        }
        if (source.Currency != null) {
            this.Currency = new String(source.Currency);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.Value != null) {
            this.Value = new Long(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UnitPrice", this.UnitPrice);
        this.setParamSimple(map, prefix + "UnitPriceDiscount", this.UnitPriceDiscount);
        this.setParamSimple(map, prefix + "OriginalPrice", this.OriginalPrice);
        this.setParamSimple(map, prefix + "DiscountPrice", this.DiscountPrice);
        this.setParamSimple(map, prefix + "Discount", this.Discount);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "Currency", this.Currency);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}


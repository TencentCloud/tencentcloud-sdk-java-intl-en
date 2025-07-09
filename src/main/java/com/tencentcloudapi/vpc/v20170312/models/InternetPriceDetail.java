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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InternetPriceDetail extends AbstractModel {

    /**
    * Postpaid unit price. Unit: USD. Returned only for postpaid price inquiry.
    */
    @SerializedName("UnitPrice")
    @Expose
    private Float UnitPrice;

    /**
    * Discounted price. Unit: USD
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("DiscountPrice")
    @Expose
    private Float DiscountPrice;

    /**
    * Billing unit. Valid values: <ul> <li>HOUR: Indicates that the billing unit is calculated hourly. The scenarios currently involving this billing unit include TRAFFIC_POSTPAID_BY_HOUR and BANDWIDTH_POSTPAID_BY_HOUR.</li></ul>
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("ChargeUnit")
    @Expose
    private String ChargeUnit;

    /**
    * Original price. Unit: CNY. Returned only for prepaid price inquiry.
    */
    @SerializedName("OriginalPrice")
    @Expose
    private Float OriginalPrice;

    /**
     * Get Postpaid unit price. Unit: USD. Returned only for postpaid price inquiry. 
     * @return UnitPrice Postpaid unit price. Unit: USD. Returned only for postpaid price inquiry.
     */
    public Float getUnitPrice() {
        return this.UnitPrice;
    }

    /**
     * Set Postpaid unit price. Unit: USD. Returned only for postpaid price inquiry.
     * @param UnitPrice Postpaid unit price. Unit: USD. Returned only for postpaid price inquiry.
     */
    public void setUnitPrice(Float UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    /**
     * Get Discounted price. Unit: USD
Note: This field may return null, indicating that no valid value was found. 
     * @return DiscountPrice Discounted price. Unit: USD
Note: This field may return null, indicating that no valid value was found.
     */
    public Float getDiscountPrice() {
        return this.DiscountPrice;
    }

    /**
     * Set Discounted price. Unit: USD
Note: This field may return null, indicating that no valid value was found.
     * @param DiscountPrice Discounted price. Unit: USD
Note: This field may return null, indicating that no valid value was found.
     */
    public void setDiscountPrice(Float DiscountPrice) {
        this.DiscountPrice = DiscountPrice;
    }

    /**
     * Get Billing unit. Valid values: <ul> <li>HOUR: Indicates that the billing unit is calculated hourly. The scenarios currently involving this billing unit include TRAFFIC_POSTPAID_BY_HOUR and BANDWIDTH_POSTPAID_BY_HOUR.</li></ul>
Note: This field may return null, indicating that no valid value was found. 
     * @return ChargeUnit Billing unit. Valid values: <ul> <li>HOUR: Indicates that the billing unit is calculated hourly. The scenarios currently involving this billing unit include TRAFFIC_POSTPAID_BY_HOUR and BANDWIDTH_POSTPAID_BY_HOUR.</li></ul>
Note: This field may return null, indicating that no valid value was found.
     */
    public String getChargeUnit() {
        return this.ChargeUnit;
    }

    /**
     * Set Billing unit. Valid values: <ul> <li>HOUR: Indicates that the billing unit is calculated hourly. The scenarios currently involving this billing unit include TRAFFIC_POSTPAID_BY_HOUR and BANDWIDTH_POSTPAID_BY_HOUR.</li></ul>
Note: This field may return null, indicating that no valid value was found.
     * @param ChargeUnit Billing unit. Valid values: <ul> <li>HOUR: Indicates that the billing unit is calculated hourly. The scenarios currently involving this billing unit include TRAFFIC_POSTPAID_BY_HOUR and BANDWIDTH_POSTPAID_BY_HOUR.</li></ul>
Note: This field may return null, indicating that no valid value was found.
     */
    public void setChargeUnit(String ChargeUnit) {
        this.ChargeUnit = ChargeUnit;
    }

    /**
     * Get Original price. Unit: CNY. Returned only for prepaid price inquiry. 
     * @return OriginalPrice Original price. Unit: CNY. Returned only for prepaid price inquiry.
     */
    public Float getOriginalPrice() {
        return this.OriginalPrice;
    }

    /**
     * Set Original price. Unit: CNY. Returned only for prepaid price inquiry.
     * @param OriginalPrice Original price. Unit: CNY. Returned only for prepaid price inquiry.
     */
    public void setOriginalPrice(Float OriginalPrice) {
        this.OriginalPrice = OriginalPrice;
    }

    public InternetPriceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InternetPriceDetail(InternetPriceDetail source) {
        if (source.UnitPrice != null) {
            this.UnitPrice = new Float(source.UnitPrice);
        }
        if (source.DiscountPrice != null) {
            this.DiscountPrice = new Float(source.DiscountPrice);
        }
        if (source.ChargeUnit != null) {
            this.ChargeUnit = new String(source.ChargeUnit);
        }
        if (source.OriginalPrice != null) {
            this.OriginalPrice = new Float(source.OriginalPrice);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UnitPrice", this.UnitPrice);
        this.setParamSimple(map, prefix + "DiscountPrice", this.DiscountPrice);
        this.setParamSimple(map, prefix + "ChargeUnit", this.ChargeUnit);
        this.setParamSimple(map, prefix + "OriginalPrice", this.OriginalPrice);

    }
}


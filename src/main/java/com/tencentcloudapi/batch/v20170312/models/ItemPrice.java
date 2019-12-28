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
    * Subsequent unit price (in RMB).
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("UnitPrice")
    @Expose
    private Float UnitPrice;

    /**
    * Subsequent billing unit. Valid values: <br><li>HOUR: bill by hour. Scenarios using this billing unit include: pay as you go for instances on an hourly basis (`POSTPAID_BY_HOUR`), and pay as you go for bandwidth on an hourly basis (`BANDWIDTH_POSTPAID_BY_HOUR`). <br><li>GB: bill by traffic in GB. Scenarios using this billing unit include: pay as you go for traffic on an hourly basis (`TRAFFIC_POSTPAID_BY_HOUR`).
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("ChargeUnit")
    @Expose
    private String ChargeUnit;

    /**
    * Original price of a prepaid instance (in RMB).
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("OriginalPrice")
    @Expose
    private Float OriginalPrice;

    /**
    * Discount price of a prepaid instance (in RMB).
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("DiscountPrice")
    @Expose
    private Float DiscountPrice;

    /**
     * Get Subsequent unit price (in RMB).
Note: This field may return null, indicating that no valid value is found. 
     * @return UnitPrice Subsequent unit price (in RMB).
Note: This field may return null, indicating that no valid value is found.
     */
    public Float getUnitPrice() {
        return this.UnitPrice;
    }

    /**
     * Set Subsequent unit price (in RMB).
Note: This field may return null, indicating that no valid value is found.
     * @param UnitPrice Subsequent unit price (in RMB).
Note: This field may return null, indicating that no valid value is found.
     */
    public void setUnitPrice(Float UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    /**
     * Get Subsequent billing unit. Valid values: <br><li>HOUR: bill by hour. Scenarios using this billing unit include: pay as you go for instances on an hourly basis (`POSTPAID_BY_HOUR`), and pay as you go for bandwidth on an hourly basis (`BANDWIDTH_POSTPAID_BY_HOUR`). <br><li>GB: bill by traffic in GB. Scenarios using this billing unit include: pay as you go for traffic on an hourly basis (`TRAFFIC_POSTPAID_BY_HOUR`).
Note: This field may return null, indicating that no valid value is found. 
     * @return ChargeUnit Subsequent billing unit. Valid values: <br><li>HOUR: bill by hour. Scenarios using this billing unit include: pay as you go for instances on an hourly basis (`POSTPAID_BY_HOUR`), and pay as you go for bandwidth on an hourly basis (`BANDWIDTH_POSTPAID_BY_HOUR`). <br><li>GB: bill by traffic in GB. Scenarios using this billing unit include: pay as you go for traffic on an hourly basis (`TRAFFIC_POSTPAID_BY_HOUR`).
Note: This field may return null, indicating that no valid value is found.
     */
    public String getChargeUnit() {
        return this.ChargeUnit;
    }

    /**
     * Set Subsequent billing unit. Valid values: <br><li>HOUR: bill by hour. Scenarios using this billing unit include: pay as you go for instances on an hourly basis (`POSTPAID_BY_HOUR`), and pay as you go for bandwidth on an hourly basis (`BANDWIDTH_POSTPAID_BY_HOUR`). <br><li>GB: bill by traffic in GB. Scenarios using this billing unit include: pay as you go for traffic on an hourly basis (`TRAFFIC_POSTPAID_BY_HOUR`).
Note: This field may return null, indicating that no valid value is found.
     * @param ChargeUnit Subsequent billing unit. Valid values: <br><li>HOUR: bill by hour. Scenarios using this billing unit include: pay as you go for instances on an hourly basis (`POSTPAID_BY_HOUR`), and pay as you go for bandwidth on an hourly basis (`BANDWIDTH_POSTPAID_BY_HOUR`). <br><li>GB: bill by traffic in GB. Scenarios using this billing unit include: pay as you go for traffic on an hourly basis (`TRAFFIC_POSTPAID_BY_HOUR`).
Note: This field may return null, indicating that no valid value is found.
     */
    public void setChargeUnit(String ChargeUnit) {
        this.ChargeUnit = ChargeUnit;
    }

    /**
     * Get Original price of a prepaid instance (in RMB).
Note: This field may return null, indicating that no valid value is found. 
     * @return OriginalPrice Original price of a prepaid instance (in RMB).
Note: This field may return null, indicating that no valid value is found.
     */
    public Float getOriginalPrice() {
        return this.OriginalPrice;
    }

    /**
     * Set Original price of a prepaid instance (in RMB).
Note: This field may return null, indicating that no valid value is found.
     * @param OriginalPrice Original price of a prepaid instance (in RMB).
Note: This field may return null, indicating that no valid value is found.
     */
    public void setOriginalPrice(Float OriginalPrice) {
        this.OriginalPrice = OriginalPrice;
    }

    /**
     * Get Discount price of a prepaid instance (in RMB).
Note: This field may return null, indicating that no valid value is found. 
     * @return DiscountPrice Discount price of a prepaid instance (in RMB).
Note: This field may return null, indicating that no valid value is found.
     */
    public Float getDiscountPrice() {
        return this.DiscountPrice;
    }

    /**
     * Set Discount price of a prepaid instance (in RMB).
Note: This field may return null, indicating that no valid value is found.
     * @param DiscountPrice Discount price of a prepaid instance (in RMB).
Note: This field may return null, indicating that no valid value is found.
     */
    public void setDiscountPrice(Float DiscountPrice) {
        this.DiscountPrice = DiscountPrice;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UnitPrice", this.UnitPrice);
        this.setParamSimple(map, prefix + "ChargeUnit", this.ChargeUnit);
        this.setParamSimple(map, prefix + "OriginalPrice", this.OriginalPrice);
        this.setParamSimple(map, prefix + "DiscountPrice", this.DiscountPrice);

    }
}


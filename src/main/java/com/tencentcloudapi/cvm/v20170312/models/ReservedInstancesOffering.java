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

public class ReservedInstancesOffering extends AbstractModel{

    /**
    * The availability zones in which the Reserved Instance can be purchased, such as ap-guangzhou-1.
Valid value: <a href="https://cloud.tencent.com/document/product/213/6091">Availability Zones</a>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * The currency of the Reserved Instance you are purchasing. It's specified using ISO 4217 standard currency.
Valid value: USD.
    */
    @SerializedName("CurrencyCode")
    @Expose
    private String CurrencyCode;

    /**
    * The **duration** of the Reserved Instance in seconds, which is the purchased usage period. For example, 31536000.
Unit: second
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * The purchase price of the Reserved Instance, such as 4000.0.
Unit: this field uses the currency code specified in `currencyCode`, and only supports “USD” at this time.
    */
    @SerializedName("FixedPrice")
    @Expose
    private Float FixedPrice;

    /**
    * The instance type on which the Reserved Instance can be used, such as S3.MEDIUM4.
Valid value: <a href="https://cloud.tencent.com/product/cvm/instances">Instance Types</a>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * The payment term of the Reserved Instance, such as All Upfront.
Valid value: All Upfront.
    */
    @SerializedName("OfferingType")
    @Expose
    private String OfferingType;

    /**
    * The ID of the Reserved Instance offering, such as 650c138f-ae7e-4750-952a-96841d6e9fc1.
    */
    @SerializedName("ReservedInstancesOfferingId")
    @Expose
    private String ReservedInstancesOfferingId;

    /**
    * The platform description (operating system) of the Reserved Instance, such as linux.
Valid value: linux.
    */
    @SerializedName("ProductDescription")
    @Expose
    private String ProductDescription;

    /**
    * The hourly usage price of the Reserved Instance, such as 0.0.
Currently, the only supported payment is “All Upfront”, so the default value of `UsagePrice` is 0 USD/hr.
Unit: USD/hr. This field uses the currency code specified in `currencyCode`, and only supports “USD” at this time.
    */
    @SerializedName("UsagePrice")
    @Expose
    private Float UsagePrice;

    /**
     * Get The availability zones in which the Reserved Instance can be purchased, such as ap-guangzhou-1.
Valid value: <a href="https://cloud.tencent.com/document/product/213/6091">Availability Zones</a> 
     * @return Zone The availability zones in which the Reserved Instance can be purchased, such as ap-guangzhou-1.
Valid value: <a href="https://cloud.tencent.com/document/product/213/6091">Availability Zones</a>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set The availability zones in which the Reserved Instance can be purchased, such as ap-guangzhou-1.
Valid value: <a href="https://cloud.tencent.com/document/product/213/6091">Availability Zones</a>
     * @param Zone The availability zones in which the Reserved Instance can be purchased, such as ap-guangzhou-1.
Valid value: <a href="https://cloud.tencent.com/document/product/213/6091">Availability Zones</a>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get The currency of the Reserved Instance you are purchasing. It's specified using ISO 4217 standard currency.
Valid value: USD. 
     * @return CurrencyCode The currency of the Reserved Instance you are purchasing. It's specified using ISO 4217 standard currency.
Valid value: USD.
     */
    public String getCurrencyCode() {
        return this.CurrencyCode;
    }

    /**
     * Set The currency of the Reserved Instance you are purchasing. It's specified using ISO 4217 standard currency.
Valid value: USD.
     * @param CurrencyCode The currency of the Reserved Instance you are purchasing. It's specified using ISO 4217 standard currency.
Valid value: USD.
     */
    public void setCurrencyCode(String CurrencyCode) {
        this.CurrencyCode = CurrencyCode;
    }

    /**
     * Get The **duration** of the Reserved Instance in seconds, which is the purchased usage period. For example, 31536000.
Unit: second 
     * @return Duration The **duration** of the Reserved Instance in seconds, which is the purchased usage period. For example, 31536000.
Unit: second
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set The **duration** of the Reserved Instance in seconds, which is the purchased usage period. For example, 31536000.
Unit: second
     * @param Duration The **duration** of the Reserved Instance in seconds, which is the purchased usage period. For example, 31536000.
Unit: second
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get The purchase price of the Reserved Instance, such as 4000.0.
Unit: this field uses the currency code specified in `currencyCode`, and only supports “USD” at this time. 
     * @return FixedPrice The purchase price of the Reserved Instance, such as 4000.0.
Unit: this field uses the currency code specified in `currencyCode`, and only supports “USD” at this time.
     */
    public Float getFixedPrice() {
        return this.FixedPrice;
    }

    /**
     * Set The purchase price of the Reserved Instance, such as 4000.0.
Unit: this field uses the currency code specified in `currencyCode`, and only supports “USD” at this time.
     * @param FixedPrice The purchase price of the Reserved Instance, such as 4000.0.
Unit: this field uses the currency code specified in `currencyCode`, and only supports “USD” at this time.
     */
    public void setFixedPrice(Float FixedPrice) {
        this.FixedPrice = FixedPrice;
    }

    /**
     * Get The instance type on which the Reserved Instance can be used, such as S3.MEDIUM4.
Valid value: <a href="https://cloud.tencent.com/product/cvm/instances">Instance Types</a> 
     * @return InstanceType The instance type on which the Reserved Instance can be used, such as S3.MEDIUM4.
Valid value: <a href="https://cloud.tencent.com/product/cvm/instances">Instance Types</a>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set The instance type on which the Reserved Instance can be used, such as S3.MEDIUM4.
Valid value: <a href="https://cloud.tencent.com/product/cvm/instances">Instance Types</a>
     * @param InstanceType The instance type on which the Reserved Instance can be used, such as S3.MEDIUM4.
Valid value: <a href="https://cloud.tencent.com/product/cvm/instances">Instance Types</a>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get The payment term of the Reserved Instance, such as All Upfront.
Valid value: All Upfront. 
     * @return OfferingType The payment term of the Reserved Instance, such as All Upfront.
Valid value: All Upfront.
     */
    public String getOfferingType() {
        return this.OfferingType;
    }

    /**
     * Set The payment term of the Reserved Instance, such as All Upfront.
Valid value: All Upfront.
     * @param OfferingType The payment term of the Reserved Instance, such as All Upfront.
Valid value: All Upfront.
     */
    public void setOfferingType(String OfferingType) {
        this.OfferingType = OfferingType;
    }

    /**
     * Get The ID of the Reserved Instance offering, such as 650c138f-ae7e-4750-952a-96841d6e9fc1. 
     * @return ReservedInstancesOfferingId The ID of the Reserved Instance offering, such as 650c138f-ae7e-4750-952a-96841d6e9fc1.
     */
    public String getReservedInstancesOfferingId() {
        return this.ReservedInstancesOfferingId;
    }

    /**
     * Set The ID of the Reserved Instance offering, such as 650c138f-ae7e-4750-952a-96841d6e9fc1.
     * @param ReservedInstancesOfferingId The ID of the Reserved Instance offering, such as 650c138f-ae7e-4750-952a-96841d6e9fc1.
     */
    public void setReservedInstancesOfferingId(String ReservedInstancesOfferingId) {
        this.ReservedInstancesOfferingId = ReservedInstancesOfferingId;
    }

    /**
     * Get The platform description (operating system) of the Reserved Instance, such as linux.
Valid value: linux. 
     * @return ProductDescription The platform description (operating system) of the Reserved Instance, such as linux.
Valid value: linux.
     */
    public String getProductDescription() {
        return this.ProductDescription;
    }

    /**
     * Set The platform description (operating system) of the Reserved Instance, such as linux.
Valid value: linux.
     * @param ProductDescription The platform description (operating system) of the Reserved Instance, such as linux.
Valid value: linux.
     */
    public void setProductDescription(String ProductDescription) {
        this.ProductDescription = ProductDescription;
    }

    /**
     * Get The hourly usage price of the Reserved Instance, such as 0.0.
Currently, the only supported payment is “All Upfront”, so the default value of `UsagePrice` is 0 USD/hr.
Unit: USD/hr. This field uses the currency code specified in `currencyCode`, and only supports “USD” at this time. 
     * @return UsagePrice The hourly usage price of the Reserved Instance, such as 0.0.
Currently, the only supported payment is “All Upfront”, so the default value of `UsagePrice` is 0 USD/hr.
Unit: USD/hr. This field uses the currency code specified in `currencyCode`, and only supports “USD” at this time.
     */
    public Float getUsagePrice() {
        return this.UsagePrice;
    }

    /**
     * Set The hourly usage price of the Reserved Instance, such as 0.0.
Currently, the only supported payment is “All Upfront”, so the default value of `UsagePrice` is 0 USD/hr.
Unit: USD/hr. This field uses the currency code specified in `currencyCode`, and only supports “USD” at this time.
     * @param UsagePrice The hourly usage price of the Reserved Instance, such as 0.0.
Currently, the only supported payment is “All Upfront”, so the default value of `UsagePrice` is 0 USD/hr.
Unit: USD/hr. This field uses the currency code specified in `currencyCode`, and only supports “USD” at this time.
     */
    public void setUsagePrice(Float UsagePrice) {
        this.UsagePrice = UsagePrice;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "CurrencyCode", this.CurrencyCode);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "FixedPrice", this.FixedPrice);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "OfferingType", this.OfferingType);
        this.setParamSimple(map, prefix + "ReservedInstancesOfferingId", this.ReservedInstancesOfferingId);
        this.setParamSimple(map, prefix + "ProductDescription", this.ProductDescription);
        this.setParamSimple(map, prefix + "UsagePrice", this.UsagePrice);

    }
}


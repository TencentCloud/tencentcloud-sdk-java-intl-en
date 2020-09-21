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

public class ReservedInstancePriceItem extends AbstractModel{

    /**
    * Payment method. Valid values: All Upfront, Partial Upfront, and No Upfront.
    */
    @SerializedName("OfferingType")
    @Expose
    private String OfferingType;

    /**
    * Total upfront price, in USD.
    */
    @SerializedName("FixedPrice")
    @Expose
    private Float FixedPrice;

    /**
    * Total usage price, in USD/hr.
    */
    @SerializedName("UsagePrice")
    @Expose
    private Float UsagePrice;

    /**
    * The ID of the reserved instance offering.
    */
    @SerializedName("ReservedInstancesOfferingId")
    @Expose
    private String ReservedInstancesOfferingId;

    /**
    * The availability zone in which the reserved instance can be purchased.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * The **validity** of the reserved instance in seconds, which is the purchased usage period. For example, `31536000`.
Unit: second
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * The operating system of the reserved instance, such as `linux`.
Valid value: linux.
    */
    @SerializedName("ProductDescription")
    @Expose
    private String ProductDescription;

    /**
     * Get Payment method. Valid values: All Upfront, Partial Upfront, and No Upfront. 
     * @return OfferingType Payment method. Valid values: All Upfront, Partial Upfront, and No Upfront.
     */
    public String getOfferingType() {
        return this.OfferingType;
    }

    /**
     * Set Payment method. Valid values: All Upfront, Partial Upfront, and No Upfront.
     * @param OfferingType Payment method. Valid values: All Upfront, Partial Upfront, and No Upfront.
     */
    public void setOfferingType(String OfferingType) {
        this.OfferingType = OfferingType;
    }

    /**
     * Get Total upfront price, in USD. 
     * @return FixedPrice Total upfront price, in USD.
     */
    public Float getFixedPrice() {
        return this.FixedPrice;
    }

    /**
     * Set Total upfront price, in USD.
     * @param FixedPrice Total upfront price, in USD.
     */
    public void setFixedPrice(Float FixedPrice) {
        this.FixedPrice = FixedPrice;
    }

    /**
     * Get Total usage price, in USD/hr. 
     * @return UsagePrice Total usage price, in USD/hr.
     */
    public Float getUsagePrice() {
        return this.UsagePrice;
    }

    /**
     * Set Total usage price, in USD/hr.
     * @param UsagePrice Total usage price, in USD/hr.
     */
    public void setUsagePrice(Float UsagePrice) {
        this.UsagePrice = UsagePrice;
    }

    /**
     * Get The ID of the reserved instance offering. 
     * @return ReservedInstancesOfferingId The ID of the reserved instance offering.
     */
    public String getReservedInstancesOfferingId() {
        return this.ReservedInstancesOfferingId;
    }

    /**
     * Set The ID of the reserved instance offering.
     * @param ReservedInstancesOfferingId The ID of the reserved instance offering.
     */
    public void setReservedInstancesOfferingId(String ReservedInstancesOfferingId) {
        this.ReservedInstancesOfferingId = ReservedInstancesOfferingId;
    }

    /**
     * Get The availability zone in which the reserved instance can be purchased. 
     * @return Zone The availability zone in which the reserved instance can be purchased.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set The availability zone in which the reserved instance can be purchased.
     * @param Zone The availability zone in which the reserved instance can be purchased.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get The **validity** of the reserved instance in seconds, which is the purchased usage period. For example, `31536000`.
Unit: second 
     * @return Duration The **validity** of the reserved instance in seconds, which is the purchased usage period. For example, `31536000`.
Unit: second
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set The **validity** of the reserved instance in seconds, which is the purchased usage period. For example, `31536000`.
Unit: second
     * @param Duration The **validity** of the reserved instance in seconds, which is the purchased usage period. For example, `31536000`.
Unit: second
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get The operating system of the reserved instance, such as `linux`.
Valid value: linux. 
     * @return ProductDescription The operating system of the reserved instance, such as `linux`.
Valid value: linux.
     */
    public String getProductDescription() {
        return this.ProductDescription;
    }

    /**
     * Set The operating system of the reserved instance, such as `linux`.
Valid value: linux.
     * @param ProductDescription The operating system of the reserved instance, such as `linux`.
Valid value: linux.
     */
    public void setProductDescription(String ProductDescription) {
        this.ProductDescription = ProductDescription;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OfferingType", this.OfferingType);
        this.setParamSimple(map, prefix + "FixedPrice", this.FixedPrice);
        this.setParamSimple(map, prefix + "UsagePrice", this.UsagePrice);
        this.setParamSimple(map, prefix + "ReservedInstancesOfferingId", this.ReservedInstancesOfferingId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "ProductDescription", this.ProductDescription);

    }
}


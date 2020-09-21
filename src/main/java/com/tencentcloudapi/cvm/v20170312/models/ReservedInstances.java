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

public class ReservedInstances extends AbstractModel{

    /**
    * The ID of the purchased reserved instance, taking the form 650c138f-ae7e-4750-952a-96841d6e9fc1.
    */
    @SerializedName("ReservedInstancesId")
    @Expose
    private String ReservedInstancesId;

    /**
    * Reserved instance specification, such as `S3.MEDIUM4`.
Valid values: please see <a href="https://intl.cloud.tencent.com/document/product/213/11518?from_cn_redirect=1">Reserved Instance Specifications</a>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Availability zones in which the reserved instance can be purchased. For example, "ap-guangzhou-1".
Returned values: <a href="https://intl.cloud.tencent.com/document/product/213/6091?from_cn_redirect=1">list of availability zones</a>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Start time of the reserved instance billing, taking the form of 2019-10-23 00:00:00.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time of the reserved instance, taking the form of 2019-10-23 00:00:00
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * The **validity** of the reserved instance in seconds, which is the purchased usage period. For example, 31536000.
Measurement unit: second.
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * The number of reserved instances that have been purchased. For example, 10.
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * The operating system of the reserved instance. For example, "linux".
Returned value: linux.
    */
    @SerializedName("ProductDescription")
    @Expose
    private String ProductDescription;

    /**
    * The status of the reserved instance. For example, "active".
Returned value: "active" (created) | "pending" (waiting to be created) | "retired" (expired).
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * The currency in which the reserved instance is billed. The ISO 4217 standard currency codes are used. For example, USD.
Returned value: USD.
    */
    @SerializedName("CurrencyCode")
    @Expose
    private String CurrencyCode;

    /**
    * The payment method of the reserved instance. For example, "All Upfront".
Returned value: All Upfront.
    */
    @SerializedName("OfferingType")
    @Expose
    private String OfferingType;

    /**
    * Reserved instance type, such as `S3`.
Valid values: please see <a href="https://intl.cloud.tencent.com/document/product/213/11518?from_cn_redirect=1">Reserved Instance Types</a>
    */
    @SerializedName("InstanceFamily")
    @Expose
    private String InstanceFamily;

    /**
     * Get The ID of the purchased reserved instance, taking the form 650c138f-ae7e-4750-952a-96841d6e9fc1. 
     * @return ReservedInstancesId The ID of the purchased reserved instance, taking the form 650c138f-ae7e-4750-952a-96841d6e9fc1.
     */
    public String getReservedInstancesId() {
        return this.ReservedInstancesId;
    }

    /**
     * Set The ID of the purchased reserved instance, taking the form 650c138f-ae7e-4750-952a-96841d6e9fc1.
     * @param ReservedInstancesId The ID of the purchased reserved instance, taking the form 650c138f-ae7e-4750-952a-96841d6e9fc1.
     */
    public void setReservedInstancesId(String ReservedInstancesId) {
        this.ReservedInstancesId = ReservedInstancesId;
    }

    /**
     * Get Reserved instance specification, such as `S3.MEDIUM4`.
Valid values: please see <a href="https://intl.cloud.tencent.com/document/product/213/11518?from_cn_redirect=1">Reserved Instance Specifications</a> 
     * @return InstanceType Reserved instance specification, such as `S3.MEDIUM4`.
Valid values: please see <a href="https://intl.cloud.tencent.com/document/product/213/11518?from_cn_redirect=1">Reserved Instance Specifications</a>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Reserved instance specification, such as `S3.MEDIUM4`.
Valid values: please see <a href="https://intl.cloud.tencent.com/document/product/213/11518?from_cn_redirect=1">Reserved Instance Specifications</a>
     * @param InstanceType Reserved instance specification, such as `S3.MEDIUM4`.
Valid values: please see <a href="https://intl.cloud.tencent.com/document/product/213/11518?from_cn_redirect=1">Reserved Instance Specifications</a>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Availability zones in which the reserved instance can be purchased. For example, "ap-guangzhou-1".
Returned values: <a href="https://intl.cloud.tencent.com/document/product/213/6091?from_cn_redirect=1">list of availability zones</a> 
     * @return Zone Availability zones in which the reserved instance can be purchased. For example, "ap-guangzhou-1".
Returned values: <a href="https://intl.cloud.tencent.com/document/product/213/6091?from_cn_redirect=1">list of availability zones</a>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Availability zones in which the reserved instance can be purchased. For example, "ap-guangzhou-1".
Returned values: <a href="https://intl.cloud.tencent.com/document/product/213/6091?from_cn_redirect=1">list of availability zones</a>
     * @param Zone Availability zones in which the reserved instance can be purchased. For example, "ap-guangzhou-1".
Returned values: <a href="https://intl.cloud.tencent.com/document/product/213/6091?from_cn_redirect=1">list of availability zones</a>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Start time of the reserved instance billing, taking the form of 2019-10-23 00:00:00. 
     * @return StartTime Start time of the reserved instance billing, taking the form of 2019-10-23 00:00:00.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time of the reserved instance billing, taking the form of 2019-10-23 00:00:00.
     * @param StartTime Start time of the reserved instance billing, taking the form of 2019-10-23 00:00:00.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time of the reserved instance, taking the form of 2019-10-23 00:00:00 
     * @return EndTime End time of the reserved instance, taking the form of 2019-10-23 00:00:00
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time of the reserved instance, taking the form of 2019-10-23 00:00:00
     * @param EndTime End time of the reserved instance, taking the form of 2019-10-23 00:00:00
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get The **validity** of the reserved instance in seconds, which is the purchased usage period. For example, 31536000.
Measurement unit: second. 
     * @return Duration The **validity** of the reserved instance in seconds, which is the purchased usage period. For example, 31536000.
Measurement unit: second.
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set The **validity** of the reserved instance in seconds, which is the purchased usage period. For example, 31536000.
Measurement unit: second.
     * @param Duration The **validity** of the reserved instance in seconds, which is the purchased usage period. For example, 31536000.
Measurement unit: second.
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get The number of reserved instances that have been purchased. For example, 10. 
     * @return InstanceCount The number of reserved instances that have been purchased. For example, 10.
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set The number of reserved instances that have been purchased. For example, 10.
     * @param InstanceCount The number of reserved instances that have been purchased. For example, 10.
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get The operating system of the reserved instance. For example, "linux".
Returned value: linux. 
     * @return ProductDescription The operating system of the reserved instance. For example, "linux".
Returned value: linux.
     */
    public String getProductDescription() {
        return this.ProductDescription;
    }

    /**
     * Set The operating system of the reserved instance. For example, "linux".
Returned value: linux.
     * @param ProductDescription The operating system of the reserved instance. For example, "linux".
Returned value: linux.
     */
    public void setProductDescription(String ProductDescription) {
        this.ProductDescription = ProductDescription;
    }

    /**
     * Get The status of the reserved instance. For example, "active".
Returned value: "active" (created) | "pending" (waiting to be created) | "retired" (expired). 
     * @return State The status of the reserved instance. For example, "active".
Returned value: "active" (created) | "pending" (waiting to be created) | "retired" (expired).
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set The status of the reserved instance. For example, "active".
Returned value: "active" (created) | "pending" (waiting to be created) | "retired" (expired).
     * @param State The status of the reserved instance. For example, "active".
Returned value: "active" (created) | "pending" (waiting to be created) | "retired" (expired).
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get The currency in which the reserved instance is billed. The ISO 4217 standard currency codes are used. For example, USD.
Returned value: USD. 
     * @return CurrencyCode The currency in which the reserved instance is billed. The ISO 4217 standard currency codes are used. For example, USD.
Returned value: USD.
     */
    public String getCurrencyCode() {
        return this.CurrencyCode;
    }

    /**
     * Set The currency in which the reserved instance is billed. The ISO 4217 standard currency codes are used. For example, USD.
Returned value: USD.
     * @param CurrencyCode The currency in which the reserved instance is billed. The ISO 4217 standard currency codes are used. For example, USD.
Returned value: USD.
     */
    public void setCurrencyCode(String CurrencyCode) {
        this.CurrencyCode = CurrencyCode;
    }

    /**
     * Get The payment method of the reserved instance. For example, "All Upfront".
Returned value: All Upfront. 
     * @return OfferingType The payment method of the reserved instance. For example, "All Upfront".
Returned value: All Upfront.
     */
    public String getOfferingType() {
        return this.OfferingType;
    }

    /**
     * Set The payment method of the reserved instance. For example, "All Upfront".
Returned value: All Upfront.
     * @param OfferingType The payment method of the reserved instance. For example, "All Upfront".
Returned value: All Upfront.
     */
    public void setOfferingType(String OfferingType) {
        this.OfferingType = OfferingType;
    }

    /**
     * Get Reserved instance type, such as `S3`.
Valid values: please see <a href="https://intl.cloud.tencent.com/document/product/213/11518?from_cn_redirect=1">Reserved Instance Types</a> 
     * @return InstanceFamily Reserved instance type, such as `S3`.
Valid values: please see <a href="https://intl.cloud.tencent.com/document/product/213/11518?from_cn_redirect=1">Reserved Instance Types</a>
     */
    public String getInstanceFamily() {
        return this.InstanceFamily;
    }

    /**
     * Set Reserved instance type, such as `S3`.
Valid values: please see <a href="https://intl.cloud.tencent.com/document/product/213/11518?from_cn_redirect=1">Reserved Instance Types</a>
     * @param InstanceFamily Reserved instance type, such as `S3`.
Valid values: please see <a href="https://intl.cloud.tencent.com/document/product/213/11518?from_cn_redirect=1">Reserved Instance Types</a>
     */
    public void setInstanceFamily(String InstanceFamily) {
        this.InstanceFamily = InstanceFamily;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReservedInstancesId", this.ReservedInstancesId);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "ProductDescription", this.ProductDescription);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "CurrencyCode", this.CurrencyCode);
        this.setParamSimple(map, prefix + "OfferingType", this.OfferingType);
        this.setParamSimple(map, prefix + "InstanceFamily", this.InstanceFamily);

    }
}


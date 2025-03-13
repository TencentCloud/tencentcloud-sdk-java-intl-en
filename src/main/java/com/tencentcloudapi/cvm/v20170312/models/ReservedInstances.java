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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReservedInstances extends AbstractModel {

    /**
    * (This field has been deprecated. ReservedInstanceId is recommended.) IDs of purchased reserved instances. For example, ri-rtbh4han.
    */
    @SerializedName("ReservedInstancesId")
    @Expose
    private String ReservedInstancesId;

    /**
    * Specifications of reserved instances. For example, S3.MEDIUM4.
Return values: <a href="https://intl.cloud.tencent.com/document/product/213/11518?from_cn_redirect=1">Reserved instance specification list.</a>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Availability zones in which reserved instances can be purchased. For example, ap-guangzhou-1.
Return values: <a href="https://intl.cloud.tencent.com/document/product/213/6091?from_cn_redirect=1">Availability zone list.</a>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Billing start time of reserved instances. For example, 1949-10-01 00:00:00.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Billing end time of reserved instances. For example, 1949-10-01 00:00:00.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Validity periods of reserved instances, which is the purchase duration of reserved instances. For example, 31536000.
Unit: second.
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * Number of purchased reserved instances. For example, 10.
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * Platform descriptions (operating systems) of reserved instances. For example, linux.
Return value: linux.
    */
    @SerializedName("ProductDescription")
    @Expose
    private String ProductDescription;

    /**
    * Statuses of purchased reserved instances. For example: active.
Return values: active (created) | pending (waiting to be created) | retired (expired).
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * Billing currencies of purchasable reserved instances. Use standard currency codes defined in ISO 4217. For example, USD.
Return value: USD.
    */
    @SerializedName("CurrencyCode")
    @Expose
    private String CurrencyCode;

    /**
    * Payment types of reserved instances. For example, All Upfront.
Return value: All Upfront (fully prepaid).
    */
    @SerializedName("OfferingType")
    @Expose
    private String OfferingType;

    /**
    * Types of reserved instances. For example, S3.
Return values: <a href="https://intl.cloud.tencent.com/document/product/213/11518?from_cn_redirect=1">Reserved instance type list.</a>
    */
    @SerializedName("InstanceFamily")
    @Expose
    private String InstanceFamily;

    /**
    * IDs of purchased reserved instances. For example, ri-rtbh4han.
    */
    @SerializedName("ReservedInstanceId")
    @Expose
    private String ReservedInstanceId;

    /**
    * Display names of reserved instances. For example, riname-01.
    */
    @SerializedName("ReservedInstanceName")
    @Expose
    private String ReservedInstanceName;

    /**
     * Get (This field has been deprecated. ReservedInstanceId is recommended.) IDs of purchased reserved instances. For example, ri-rtbh4han. 
     * @return ReservedInstancesId (This field has been deprecated. ReservedInstanceId is recommended.) IDs of purchased reserved instances. For example, ri-rtbh4han.
     * @deprecated
     */
    @Deprecated
    public String getReservedInstancesId() {
        return this.ReservedInstancesId;
    }

    /**
     * Set (This field has been deprecated. ReservedInstanceId is recommended.) IDs of purchased reserved instances. For example, ri-rtbh4han.
     * @param ReservedInstancesId (This field has been deprecated. ReservedInstanceId is recommended.) IDs of purchased reserved instances. For example, ri-rtbh4han.
     * @deprecated
     */
    @Deprecated
    public void setReservedInstancesId(String ReservedInstancesId) {
        this.ReservedInstancesId = ReservedInstancesId;
    }

    /**
     * Get Specifications of reserved instances. For example, S3.MEDIUM4.
Return values: <a href="https://intl.cloud.tencent.com/document/product/213/11518?from_cn_redirect=1">Reserved instance specification list.</a> 
     * @return InstanceType Specifications of reserved instances. For example, S3.MEDIUM4.
Return values: <a href="https://intl.cloud.tencent.com/document/product/213/11518?from_cn_redirect=1">Reserved instance specification list.</a>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Specifications of reserved instances. For example, S3.MEDIUM4.
Return values: <a href="https://intl.cloud.tencent.com/document/product/213/11518?from_cn_redirect=1">Reserved instance specification list.</a>
     * @param InstanceType Specifications of reserved instances. For example, S3.MEDIUM4.
Return values: <a href="https://intl.cloud.tencent.com/document/product/213/11518?from_cn_redirect=1">Reserved instance specification list.</a>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Availability zones in which reserved instances can be purchased. For example, ap-guangzhou-1.
Return values: <a href="https://intl.cloud.tencent.com/document/product/213/6091?from_cn_redirect=1">Availability zone list.</a> 
     * @return Zone Availability zones in which reserved instances can be purchased. For example, ap-guangzhou-1.
Return values: <a href="https://intl.cloud.tencent.com/document/product/213/6091?from_cn_redirect=1">Availability zone list.</a>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Availability zones in which reserved instances can be purchased. For example, ap-guangzhou-1.
Return values: <a href="https://intl.cloud.tencent.com/document/product/213/6091?from_cn_redirect=1">Availability zone list.</a>
     * @param Zone Availability zones in which reserved instances can be purchased. For example, ap-guangzhou-1.
Return values: <a href="https://intl.cloud.tencent.com/document/product/213/6091?from_cn_redirect=1">Availability zone list.</a>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Billing start time of reserved instances. For example, 1949-10-01 00:00:00. 
     * @return StartTime Billing start time of reserved instances. For example, 1949-10-01 00:00:00.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Billing start time of reserved instances. For example, 1949-10-01 00:00:00.
     * @param StartTime Billing start time of reserved instances. For example, 1949-10-01 00:00:00.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Billing end time of reserved instances. For example, 1949-10-01 00:00:00. 
     * @return EndTime Billing end time of reserved instances. For example, 1949-10-01 00:00:00.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Billing end time of reserved instances. For example, 1949-10-01 00:00:00.
     * @param EndTime Billing end time of reserved instances. For example, 1949-10-01 00:00:00.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Validity periods of reserved instances, which is the purchase duration of reserved instances. For example, 31536000.
Unit: second. 
     * @return Duration Validity periods of reserved instances, which is the purchase duration of reserved instances. For example, 31536000.
Unit: second.
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set Validity periods of reserved instances, which is the purchase duration of reserved instances. For example, 31536000.
Unit: second.
     * @param Duration Validity periods of reserved instances, which is the purchase duration of reserved instances. For example, 31536000.
Unit: second.
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get Number of purchased reserved instances. For example, 10. 
     * @return InstanceCount Number of purchased reserved instances. For example, 10.
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set Number of purchased reserved instances. For example, 10.
     * @param InstanceCount Number of purchased reserved instances. For example, 10.
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get Platform descriptions (operating systems) of reserved instances. For example, linux.
Return value: linux. 
     * @return ProductDescription Platform descriptions (operating systems) of reserved instances. For example, linux.
Return value: linux.
     */
    public String getProductDescription() {
        return this.ProductDescription;
    }

    /**
     * Set Platform descriptions (operating systems) of reserved instances. For example, linux.
Return value: linux.
     * @param ProductDescription Platform descriptions (operating systems) of reserved instances. For example, linux.
Return value: linux.
     */
    public void setProductDescription(String ProductDescription) {
        this.ProductDescription = ProductDescription;
    }

    /**
     * Get Statuses of purchased reserved instances. For example: active.
Return values: active (created) | pending (waiting to be created) | retired (expired). 
     * @return State Statuses of purchased reserved instances. For example: active.
Return values: active (created) | pending (waiting to be created) | retired (expired).
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Statuses of purchased reserved instances. For example: active.
Return values: active (created) | pending (waiting to be created) | retired (expired).
     * @param State Statuses of purchased reserved instances. For example: active.
Return values: active (created) | pending (waiting to be created) | retired (expired).
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get Billing currencies of purchasable reserved instances. Use standard currency codes defined in ISO 4217. For example, USD.
Return value: USD. 
     * @return CurrencyCode Billing currencies of purchasable reserved instances. Use standard currency codes defined in ISO 4217. For example, USD.
Return value: USD.
     */
    public String getCurrencyCode() {
        return this.CurrencyCode;
    }

    /**
     * Set Billing currencies of purchasable reserved instances. Use standard currency codes defined in ISO 4217. For example, USD.
Return value: USD.
     * @param CurrencyCode Billing currencies of purchasable reserved instances. Use standard currency codes defined in ISO 4217. For example, USD.
Return value: USD.
     */
    public void setCurrencyCode(String CurrencyCode) {
        this.CurrencyCode = CurrencyCode;
    }

    /**
     * Get Payment types of reserved instances. For example, All Upfront.
Return value: All Upfront (fully prepaid). 
     * @return OfferingType Payment types of reserved instances. For example, All Upfront.
Return value: All Upfront (fully prepaid).
     */
    public String getOfferingType() {
        return this.OfferingType;
    }

    /**
     * Set Payment types of reserved instances. For example, All Upfront.
Return value: All Upfront (fully prepaid).
     * @param OfferingType Payment types of reserved instances. For example, All Upfront.
Return value: All Upfront (fully prepaid).
     */
    public void setOfferingType(String OfferingType) {
        this.OfferingType = OfferingType;
    }

    /**
     * Get Types of reserved instances. For example, S3.
Return values: <a href="https://intl.cloud.tencent.com/document/product/213/11518?from_cn_redirect=1">Reserved instance type list.</a> 
     * @return InstanceFamily Types of reserved instances. For example, S3.
Return values: <a href="https://intl.cloud.tencent.com/document/product/213/11518?from_cn_redirect=1">Reserved instance type list.</a>
     */
    public String getInstanceFamily() {
        return this.InstanceFamily;
    }

    /**
     * Set Types of reserved instances. For example, S3.
Return values: <a href="https://intl.cloud.tencent.com/document/product/213/11518?from_cn_redirect=1">Reserved instance type list.</a>
     * @param InstanceFamily Types of reserved instances. For example, S3.
Return values: <a href="https://intl.cloud.tencent.com/document/product/213/11518?from_cn_redirect=1">Reserved instance type list.</a>
     */
    public void setInstanceFamily(String InstanceFamily) {
        this.InstanceFamily = InstanceFamily;
    }

    /**
     * Get IDs of purchased reserved instances. For example, ri-rtbh4han. 
     * @return ReservedInstanceId IDs of purchased reserved instances. For example, ri-rtbh4han.
     */
    public String getReservedInstanceId() {
        return this.ReservedInstanceId;
    }

    /**
     * Set IDs of purchased reserved instances. For example, ri-rtbh4han.
     * @param ReservedInstanceId IDs of purchased reserved instances. For example, ri-rtbh4han.
     */
    public void setReservedInstanceId(String ReservedInstanceId) {
        this.ReservedInstanceId = ReservedInstanceId;
    }

    /**
     * Get Display names of reserved instances. For example, riname-01. 
     * @return ReservedInstanceName Display names of reserved instances. For example, riname-01.
     */
    public String getReservedInstanceName() {
        return this.ReservedInstanceName;
    }

    /**
     * Set Display names of reserved instances. For example, riname-01.
     * @param ReservedInstanceName Display names of reserved instances. For example, riname-01.
     */
    public void setReservedInstanceName(String ReservedInstanceName) {
        this.ReservedInstanceName = ReservedInstanceName;
    }

    public ReservedInstances() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReservedInstances(ReservedInstances source) {
        if (source.ReservedInstancesId != null) {
            this.ReservedInstancesId = new String(source.ReservedInstancesId);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
        if (source.ProductDescription != null) {
            this.ProductDescription = new String(source.ProductDescription);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.CurrencyCode != null) {
            this.CurrencyCode = new String(source.CurrencyCode);
        }
        if (source.OfferingType != null) {
            this.OfferingType = new String(source.OfferingType);
        }
        if (source.InstanceFamily != null) {
            this.InstanceFamily = new String(source.InstanceFamily);
        }
        if (source.ReservedInstanceId != null) {
            this.ReservedInstanceId = new String(source.ReservedInstanceId);
        }
        if (source.ReservedInstanceName != null) {
            this.ReservedInstanceName = new String(source.ReservedInstanceName);
        }
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
        this.setParamSimple(map, prefix + "ReservedInstanceId", this.ReservedInstanceId);
        this.setParamSimple(map, prefix + "ReservedInstanceName", this.ReservedInstanceName);

    }
}


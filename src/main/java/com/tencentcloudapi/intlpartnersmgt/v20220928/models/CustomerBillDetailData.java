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
package com.tencentcloudapi.intlpartnersmgt.v20220928.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomerBillDetailData extends AbstractModel {

    /**
    * Reseller account
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PayerAccountId")
    @Expose
    private Long PayerAccountId;

    /**
    * Customer account
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OwnerAccountId")
    @Expose
    private Long OwnerAccountId;

    /**
    * Operator account
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OperatorAccountId")
    @Expose
    private Long OperatorAccountId;

    /**
    * Product name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * Billing mode
`Monthly subscription` (Monthly subscription)
`Pay-As-You-Go resources` (Pay-as-you-go)
`Standard RI` (Reserved instance)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BillingMode")
    @Expose
    private String BillingMode;

    /**
    * Project name

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * Resource region
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Resource AZ
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AvailabilityZone")
    @Expose
    private String AvailabilityZone;

    /**
    * Instance ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Subproduct name

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubProductName")
    @Expose
    private String SubProductName;

    /**
    * Settlement type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TransactionType")
    @Expose
    private String TransactionType;

    /**
    * Transaction ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TransactionId")
    @Expose
    private String TransactionId;

    /**
    * Settlement time

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TransactionTime")
    @Expose
    private String TransactionTime;

    /**
    * Start time of resource use
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UsageStartTime")
    @Expose
    private String UsageStartTime;

    /**
    * End time of resource use
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UsageEndTime")
    @Expose
    private String UsageEndTime;

    /**
    * Component
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ComponentType")
    @Expose
    private String ComponentType;

    /**
    * Component name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ComponentName")
    @Expose
    private String ComponentName;

    /**
    * Component list price
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ComponentListPrice")
    @Expose
    private String ComponentListPrice;

    /**
    * Price unit
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ComponentPriceMeasurementUnit")
    @Expose
    private String ComponentPriceMeasurementUnit;

    /**
    * Component usage
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ComponentUsage")
    @Expose
    private String ComponentUsage;

    /**
    * Component usage unit
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ComponentUsageUnit")
    @Expose
    private String ComponentUsageUnit;

    /**
    * Resource usage duration
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UsageDuration")
    @Expose
    private String UsageDuration;

    /**
    * Duration unit
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DurationUnit")
    @Expose
    private String DurationUnit;

    /**
    * Original cost
Original cost = component list price * component usage * usage duration
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OriginalCost")
    @Expose
    private String OriginalCost;

    /**
    * Currency
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
    * Total cost = discounted total - voucher deduction
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalCost")
    @Expose
    private String TotalCost;

    /**
    * ID
Note: The return value may be null, indicating that no valid data can be obtained.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Tag informationNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
     * Get Reseller account
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PayerAccountId Reseller account
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPayerAccountId() {
        return this.PayerAccountId;
    }

    /**
     * Set Reseller account
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PayerAccountId Reseller account
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPayerAccountId(Long PayerAccountId) {
        this.PayerAccountId = PayerAccountId;
    }

    /**
     * Get Customer account
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OwnerAccountId Customer account
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getOwnerAccountId() {
        return this.OwnerAccountId;
    }

    /**
     * Set Customer account
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OwnerAccountId Customer account
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOwnerAccountId(Long OwnerAccountId) {
        this.OwnerAccountId = OwnerAccountId;
    }

    /**
     * Get Operator account
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OperatorAccountId Operator account
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getOperatorAccountId() {
        return this.OperatorAccountId;
    }

    /**
     * Set Operator account
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OperatorAccountId Operator account
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOperatorAccountId(Long OperatorAccountId) {
        this.OperatorAccountId = OperatorAccountId;
    }

    /**
     * Get Product name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProductName Product name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set Product name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProductName Product name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get Billing mode
`Monthly subscription` (Monthly subscription)
`Pay-As-You-Go resources` (Pay-as-you-go)
`Standard RI` (Reserved instance)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BillingMode Billing mode
`Monthly subscription` (Monthly subscription)
`Pay-As-You-Go resources` (Pay-as-you-go)
`Standard RI` (Reserved instance)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBillingMode() {
        return this.BillingMode;
    }

    /**
     * Set Billing mode
`Monthly subscription` (Monthly subscription)
`Pay-As-You-Go resources` (Pay-as-you-go)
`Standard RI` (Reserved instance)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BillingMode Billing mode
`Monthly subscription` (Monthly subscription)
`Pay-As-You-Go resources` (Pay-as-you-go)
`Standard RI` (Reserved instance)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBillingMode(String BillingMode) {
        this.BillingMode = BillingMode;
    }

    /**
     * Get Project name

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProjectName Project name

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set Project name

Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProjectName Project name

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get Resource region
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Region Resource region
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Resource region
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Region Resource region
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Resource AZ
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AvailabilityZone Resource AZ
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAvailabilityZone() {
        return this.AvailabilityZone;
    }

    /**
     * Set Resource AZ
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AvailabilityZone Resource AZ
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAvailabilityZone(String AvailabilityZone) {
        this.AvailabilityZone = AvailabilityZone;
    }

    /**
     * Get Instance ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceId Instance ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceId Instance ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceName Instance name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceName Instance name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Subproduct name

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubProductName Subproduct name

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSubProductName() {
        return this.SubProductName;
    }

    /**
     * Set Subproduct name

Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubProductName Subproduct name

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubProductName(String SubProductName) {
        this.SubProductName = SubProductName;
    }

    /**
     * Get Settlement type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TransactionType Settlement type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTransactionType() {
        return this.TransactionType;
    }

    /**
     * Set Settlement type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TransactionType Settlement type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTransactionType(String TransactionType) {
        this.TransactionType = TransactionType;
    }

    /**
     * Get Transaction ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TransactionId Transaction ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTransactionId() {
        return this.TransactionId;
    }

    /**
     * Set Transaction ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TransactionId Transaction ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTransactionId(String TransactionId) {
        this.TransactionId = TransactionId;
    }

    /**
     * Get Settlement time

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TransactionTime Settlement time

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTransactionTime() {
        return this.TransactionTime;
    }

    /**
     * Set Settlement time

Note: This field may return null, indicating that no valid values can be obtained.
     * @param TransactionTime Settlement time

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTransactionTime(String TransactionTime) {
        this.TransactionTime = TransactionTime;
    }

    /**
     * Get Start time of resource use
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UsageStartTime Start time of resource use
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUsageStartTime() {
        return this.UsageStartTime;
    }

    /**
     * Set Start time of resource use
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UsageStartTime Start time of resource use
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUsageStartTime(String UsageStartTime) {
        this.UsageStartTime = UsageStartTime;
    }

    /**
     * Get End time of resource use
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UsageEndTime End time of resource use
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUsageEndTime() {
        return this.UsageEndTime;
    }

    /**
     * Set End time of resource use
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UsageEndTime End time of resource use
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUsageEndTime(String UsageEndTime) {
        this.UsageEndTime = UsageEndTime;
    }

    /**
     * Get Component
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ComponentType Component
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getComponentType() {
        return this.ComponentType;
    }

    /**
     * Set Component
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ComponentType Component
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setComponentType(String ComponentType) {
        this.ComponentType = ComponentType;
    }

    /**
     * Get Component name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ComponentName Component name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getComponentName() {
        return this.ComponentName;
    }

    /**
     * Set Component name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ComponentName Component name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setComponentName(String ComponentName) {
        this.ComponentName = ComponentName;
    }

    /**
     * Get Component list price
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ComponentListPrice Component list price
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getComponentListPrice() {
        return this.ComponentListPrice;
    }

    /**
     * Set Component list price
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ComponentListPrice Component list price
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setComponentListPrice(String ComponentListPrice) {
        this.ComponentListPrice = ComponentListPrice;
    }

    /**
     * Get Price unit
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ComponentPriceMeasurementUnit Price unit
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getComponentPriceMeasurementUnit() {
        return this.ComponentPriceMeasurementUnit;
    }

    /**
     * Set Price unit
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ComponentPriceMeasurementUnit Price unit
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setComponentPriceMeasurementUnit(String ComponentPriceMeasurementUnit) {
        this.ComponentPriceMeasurementUnit = ComponentPriceMeasurementUnit;
    }

    /**
     * Get Component usage
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ComponentUsage Component usage
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getComponentUsage() {
        return this.ComponentUsage;
    }

    /**
     * Set Component usage
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ComponentUsage Component usage
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setComponentUsage(String ComponentUsage) {
        this.ComponentUsage = ComponentUsage;
    }

    /**
     * Get Component usage unit
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ComponentUsageUnit Component usage unit
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getComponentUsageUnit() {
        return this.ComponentUsageUnit;
    }

    /**
     * Set Component usage unit
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ComponentUsageUnit Component usage unit
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setComponentUsageUnit(String ComponentUsageUnit) {
        this.ComponentUsageUnit = ComponentUsageUnit;
    }

    /**
     * Get Resource usage duration
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UsageDuration Resource usage duration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUsageDuration() {
        return this.UsageDuration;
    }

    /**
     * Set Resource usage duration
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UsageDuration Resource usage duration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUsageDuration(String UsageDuration) {
        this.UsageDuration = UsageDuration;
    }

    /**
     * Get Duration unit
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DurationUnit Duration unit
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDurationUnit() {
        return this.DurationUnit;
    }

    /**
     * Set Duration unit
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DurationUnit Duration unit
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDurationUnit(String DurationUnit) {
        this.DurationUnit = DurationUnit;
    }

    /**
     * Get Original cost
Original cost = component list price * component usage * usage duration
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OriginalCost Original cost
Original cost = component list price * component usage * usage duration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOriginalCost() {
        return this.OriginalCost;
    }

    /**
     * Set Original cost
Original cost = component list price * component usage * usage duration
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OriginalCost Original cost
Original cost = component list price * component usage * usage duration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOriginalCost(String OriginalCost) {
        this.OriginalCost = OriginalCost;
    }

    /**
     * Get Currency
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Currency Currency
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCurrency() {
        return this.Currency;
    }

    /**
     * Set Currency
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Currency Currency
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    /**
     * Get Total cost = discounted total - voucher deduction
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TotalCost Total cost = discounted total - voucher deduction
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTotalCost() {
        return this.TotalCost;
    }

    /**
     * Set Total cost = discounted total - voucher deduction
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TotalCost Total cost = discounted total - voucher deduction
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalCost(String TotalCost) {
        this.TotalCost = TotalCost;
    }

    /**
     * Get ID
Note: The return value may be null, indicating that no valid data can be obtained. 
     * @return Id ID
Note: The return value may be null, indicating that no valid data can be obtained.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set ID
Note: The return value may be null, indicating that no valid data can be obtained.
     * @param Id ID
Note: The return value may be null, indicating that no valid data can be obtained.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Tag informationNote: This field may return null, indicating that no valid values can be obtained. 
     * @return Tags Tag informationNote: This field may return null, indicating that no valid values can be obtained.
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag informationNote: This field may return null, indicating that no valid values can be obtained.
     * @param Tags Tag informationNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    public CustomerBillDetailData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomerBillDetailData(CustomerBillDetailData source) {
        if (source.PayerAccountId != null) {
            this.PayerAccountId = new Long(source.PayerAccountId);
        }
        if (source.OwnerAccountId != null) {
            this.OwnerAccountId = new Long(source.OwnerAccountId);
        }
        if (source.OperatorAccountId != null) {
            this.OperatorAccountId = new Long(source.OperatorAccountId);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.BillingMode != null) {
            this.BillingMode = new String(source.BillingMode);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.AvailabilityZone != null) {
            this.AvailabilityZone = new String(source.AvailabilityZone);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.SubProductName != null) {
            this.SubProductName = new String(source.SubProductName);
        }
        if (source.TransactionType != null) {
            this.TransactionType = new String(source.TransactionType);
        }
        if (source.TransactionId != null) {
            this.TransactionId = new String(source.TransactionId);
        }
        if (source.TransactionTime != null) {
            this.TransactionTime = new String(source.TransactionTime);
        }
        if (source.UsageStartTime != null) {
            this.UsageStartTime = new String(source.UsageStartTime);
        }
        if (source.UsageEndTime != null) {
            this.UsageEndTime = new String(source.UsageEndTime);
        }
        if (source.ComponentType != null) {
            this.ComponentType = new String(source.ComponentType);
        }
        if (source.ComponentName != null) {
            this.ComponentName = new String(source.ComponentName);
        }
        if (source.ComponentListPrice != null) {
            this.ComponentListPrice = new String(source.ComponentListPrice);
        }
        if (source.ComponentPriceMeasurementUnit != null) {
            this.ComponentPriceMeasurementUnit = new String(source.ComponentPriceMeasurementUnit);
        }
        if (source.ComponentUsage != null) {
            this.ComponentUsage = new String(source.ComponentUsage);
        }
        if (source.ComponentUsageUnit != null) {
            this.ComponentUsageUnit = new String(source.ComponentUsageUnit);
        }
        if (source.UsageDuration != null) {
            this.UsageDuration = new String(source.UsageDuration);
        }
        if (source.DurationUnit != null) {
            this.DurationUnit = new String(source.DurationUnit);
        }
        if (source.OriginalCost != null) {
            this.OriginalCost = new String(source.OriginalCost);
        }
        if (source.Currency != null) {
            this.Currency = new String(source.Currency);
        }
        if (source.TotalCost != null) {
            this.TotalCost = new String(source.TotalCost);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PayerAccountId", this.PayerAccountId);
        this.setParamSimple(map, prefix + "OwnerAccountId", this.OwnerAccountId);
        this.setParamSimple(map, prefix + "OperatorAccountId", this.OperatorAccountId);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "BillingMode", this.BillingMode);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "AvailabilityZone", this.AvailabilityZone);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "SubProductName", this.SubProductName);
        this.setParamSimple(map, prefix + "TransactionType", this.TransactionType);
        this.setParamSimple(map, prefix + "TransactionId", this.TransactionId);
        this.setParamSimple(map, prefix + "TransactionTime", this.TransactionTime);
        this.setParamSimple(map, prefix + "UsageStartTime", this.UsageStartTime);
        this.setParamSimple(map, prefix + "UsageEndTime", this.UsageEndTime);
        this.setParamSimple(map, prefix + "ComponentType", this.ComponentType);
        this.setParamSimple(map, prefix + "ComponentName", this.ComponentName);
        this.setParamSimple(map, prefix + "ComponentListPrice", this.ComponentListPrice);
        this.setParamSimple(map, prefix + "ComponentPriceMeasurementUnit", this.ComponentPriceMeasurementUnit);
        this.setParamSimple(map, prefix + "ComponentUsage", this.ComponentUsage);
        this.setParamSimple(map, prefix + "ComponentUsageUnit", this.ComponentUsageUnit);
        this.setParamSimple(map, prefix + "UsageDuration", this.UsageDuration);
        this.setParamSimple(map, prefix + "DurationUnit", this.DurationUnit);
        this.setParamSimple(map, prefix + "OriginalCost", this.OriginalCost);
        this.setParamSimple(map, prefix + "Currency", this.Currency);
        this.setParamSimple(map, prefix + "TotalCost", this.TotalCost);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}


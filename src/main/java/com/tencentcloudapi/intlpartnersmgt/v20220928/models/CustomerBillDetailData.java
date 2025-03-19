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
    * Distributor account.
    */
    @SerializedName("PayerAccountId")
    @Expose
    private Long PayerAccountId;

    /**
    * Sub-Customer account.
    */
    @SerializedName("OwnerAccountId")
    @Expose
    private Long OwnerAccountId;

    /**
    * Operator account.
    */
    @SerializedName("OperatorAccountId")
    @Expose
    private Long OperatorAccountId;

    /**
    * Product name.
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * Billing mode
.
Monthly subscription.
Pay-As-You-Go resources.
Standard ri reserved instances.
    */
    @SerializedName("BillingMode")
    @Expose
    private String BillingMode;

    /**
    * Project name.
.

    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * Resource region.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Resource availability zone.
    */
    @SerializedName("AvailabilityZone")
    @Expose
    private String AvailabilityZone;

    /**
    * Instance id.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance name.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Sub-Product name
.

    */
    @SerializedName("SubProductName")
    @Expose
    private String SubProductName;

    /**
    * Settlement type.
    */
    @SerializedName("TransactionType")
    @Expose
    private String TransactionType;

    /**
    * Transaction flow id.
    */
    @SerializedName("TransactionId")
    @Expose
    private String TransactionId;

    /**
    * Settlement time.

    */
    @SerializedName("TransactionTime")
    @Expose
    private String TransactionTime;

    /**
    * Resource start time.
    */
    @SerializedName("UsageStartTime")
    @Expose
    private String UsageStartTime;

    /**
    * Resource end time.
    */
    @SerializedName("UsageEndTime")
    @Expose
    private String UsageEndTime;

    /**
    * Component.
    */
    @SerializedName("ComponentType")
    @Expose
    private String ComponentType;

    /**
    * Component name.
    */
    @SerializedName("ComponentName")
    @Expose
    private String ComponentName;

    /**
    * Component list price.
    */
    @SerializedName("ComponentListPrice")
    @Expose
    private String ComponentListPrice;

    /**
    * Price unit.
    */
    @SerializedName("ComponentPriceMeasurementUnit")
    @Expose
    private String ComponentPriceMeasurementUnit;

    /**
    * Component usage.
    */
    @SerializedName("ComponentUsage")
    @Expose
    private String ComponentUsage;

    /**
    * Component usage unit.
    */
    @SerializedName("ComponentUsageUnit")
    @Expose
    private String ComponentUsageUnit;

    /**
    * Resource usage duration.
    */
    @SerializedName("UsageDuration")
    @Expose
    private String UsageDuration;

    /**
    * duration unit.
    */
    @SerializedName("DurationUnit")
    @Expose
    private String DurationUnit;

    /**
    * Total original price.
Original cost = component list price * component usage * usage duration.
    */
    @SerializedName("OriginalCost")
    @Expose
    private String OriginalCost;

    /**
    * Currency.
    */
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
    * = Total Amount After Discount - Voucher Deduction
    */
    @SerializedName("TotalCost")
    @Expose
    private String TotalCost;

    /**
    * Id identifier.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Tag information.
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
     * Get Distributor account. 
     * @return PayerAccountId Distributor account.
     */
    public Long getPayerAccountId() {
        return this.PayerAccountId;
    }

    /**
     * Set Distributor account.
     * @param PayerAccountId Distributor account.
     */
    public void setPayerAccountId(Long PayerAccountId) {
        this.PayerAccountId = PayerAccountId;
    }

    /**
     * Get Sub-Customer account. 
     * @return OwnerAccountId Sub-Customer account.
     */
    public Long getOwnerAccountId() {
        return this.OwnerAccountId;
    }

    /**
     * Set Sub-Customer account.
     * @param OwnerAccountId Sub-Customer account.
     */
    public void setOwnerAccountId(Long OwnerAccountId) {
        this.OwnerAccountId = OwnerAccountId;
    }

    /**
     * Get Operator account. 
     * @return OperatorAccountId Operator account.
     */
    public Long getOperatorAccountId() {
        return this.OperatorAccountId;
    }

    /**
     * Set Operator account.
     * @param OperatorAccountId Operator account.
     */
    public void setOperatorAccountId(Long OperatorAccountId) {
        this.OperatorAccountId = OperatorAccountId;
    }

    /**
     * Get Product name. 
     * @return ProductName Product name.
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set Product name.
     * @param ProductName Product name.
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get Billing mode
.
Monthly subscription.
Pay-As-You-Go resources.
Standard ri reserved instances. 
     * @return BillingMode Billing mode
.
Monthly subscription.
Pay-As-You-Go resources.
Standard ri reserved instances.
     */
    public String getBillingMode() {
        return this.BillingMode;
    }

    /**
     * Set Billing mode
.
Monthly subscription.
Pay-As-You-Go resources.
Standard ri reserved instances.
     * @param BillingMode Billing mode
.
Monthly subscription.
Pay-As-You-Go resources.
Standard ri reserved instances.
     */
    public void setBillingMode(String BillingMode) {
        this.BillingMode = BillingMode;
    }

    /**
     * Get Project name.
.
 
     * @return ProjectName Project name.
.

     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set Project name.
.

     * @param ProjectName Project name.
.

     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get Resource region. 
     * @return Region Resource region.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Resource region.
     * @param Region Resource region.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Resource availability zone. 
     * @return AvailabilityZone Resource availability zone.
     */
    public String getAvailabilityZone() {
        return this.AvailabilityZone;
    }

    /**
     * Set Resource availability zone.
     * @param AvailabilityZone Resource availability zone.
     */
    public void setAvailabilityZone(String AvailabilityZone) {
        this.AvailabilityZone = AvailabilityZone;
    }

    /**
     * Get Instance id. 
     * @return InstanceId Instance id.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance id.
     * @param InstanceId Instance id.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance name. 
     * @return InstanceName Instance name.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name.
     * @param InstanceName Instance name.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Sub-Product name
.
 
     * @return SubProductName Sub-Product name
.

     */
    public String getSubProductName() {
        return this.SubProductName;
    }

    /**
     * Set Sub-Product name
.

     * @param SubProductName Sub-Product name
.

     */
    public void setSubProductName(String SubProductName) {
        this.SubProductName = SubProductName;
    }

    /**
     * Get Settlement type. 
     * @return TransactionType Settlement type.
     */
    public String getTransactionType() {
        return this.TransactionType;
    }

    /**
     * Set Settlement type.
     * @param TransactionType Settlement type.
     */
    public void setTransactionType(String TransactionType) {
        this.TransactionType = TransactionType;
    }

    /**
     * Get Transaction flow id. 
     * @return TransactionId Transaction flow id.
     */
    public String getTransactionId() {
        return this.TransactionId;
    }

    /**
     * Set Transaction flow id.
     * @param TransactionId Transaction flow id.
     */
    public void setTransactionId(String TransactionId) {
        this.TransactionId = TransactionId;
    }

    /**
     * Get Settlement time.
 
     * @return TransactionTime Settlement time.

     */
    public String getTransactionTime() {
        return this.TransactionTime;
    }

    /**
     * Set Settlement time.

     * @param TransactionTime Settlement time.

     */
    public void setTransactionTime(String TransactionTime) {
        this.TransactionTime = TransactionTime;
    }

    /**
     * Get Resource start time. 
     * @return UsageStartTime Resource start time.
     */
    public String getUsageStartTime() {
        return this.UsageStartTime;
    }

    /**
     * Set Resource start time.
     * @param UsageStartTime Resource start time.
     */
    public void setUsageStartTime(String UsageStartTime) {
        this.UsageStartTime = UsageStartTime;
    }

    /**
     * Get Resource end time. 
     * @return UsageEndTime Resource end time.
     */
    public String getUsageEndTime() {
        return this.UsageEndTime;
    }

    /**
     * Set Resource end time.
     * @param UsageEndTime Resource end time.
     */
    public void setUsageEndTime(String UsageEndTime) {
        this.UsageEndTime = UsageEndTime;
    }

    /**
     * Get Component. 
     * @return ComponentType Component.
     */
    public String getComponentType() {
        return this.ComponentType;
    }

    /**
     * Set Component.
     * @param ComponentType Component.
     */
    public void setComponentType(String ComponentType) {
        this.ComponentType = ComponentType;
    }

    /**
     * Get Component name. 
     * @return ComponentName Component name.
     */
    public String getComponentName() {
        return this.ComponentName;
    }

    /**
     * Set Component name.
     * @param ComponentName Component name.
     */
    public void setComponentName(String ComponentName) {
        this.ComponentName = ComponentName;
    }

    /**
     * Get Component list price. 
     * @return ComponentListPrice Component list price.
     */
    public String getComponentListPrice() {
        return this.ComponentListPrice;
    }

    /**
     * Set Component list price.
     * @param ComponentListPrice Component list price.
     */
    public void setComponentListPrice(String ComponentListPrice) {
        this.ComponentListPrice = ComponentListPrice;
    }

    /**
     * Get Price unit. 
     * @return ComponentPriceMeasurementUnit Price unit.
     */
    public String getComponentPriceMeasurementUnit() {
        return this.ComponentPriceMeasurementUnit;
    }

    /**
     * Set Price unit.
     * @param ComponentPriceMeasurementUnit Price unit.
     */
    public void setComponentPriceMeasurementUnit(String ComponentPriceMeasurementUnit) {
        this.ComponentPriceMeasurementUnit = ComponentPriceMeasurementUnit;
    }

    /**
     * Get Component usage. 
     * @return ComponentUsage Component usage.
     */
    public String getComponentUsage() {
        return this.ComponentUsage;
    }

    /**
     * Set Component usage.
     * @param ComponentUsage Component usage.
     */
    public void setComponentUsage(String ComponentUsage) {
        this.ComponentUsage = ComponentUsage;
    }

    /**
     * Get Component usage unit. 
     * @return ComponentUsageUnit Component usage unit.
     */
    public String getComponentUsageUnit() {
        return this.ComponentUsageUnit;
    }

    /**
     * Set Component usage unit.
     * @param ComponentUsageUnit Component usage unit.
     */
    public void setComponentUsageUnit(String ComponentUsageUnit) {
        this.ComponentUsageUnit = ComponentUsageUnit;
    }

    /**
     * Get Resource usage duration. 
     * @return UsageDuration Resource usage duration.
     */
    public String getUsageDuration() {
        return this.UsageDuration;
    }

    /**
     * Set Resource usage duration.
     * @param UsageDuration Resource usage duration.
     */
    public void setUsageDuration(String UsageDuration) {
        this.UsageDuration = UsageDuration;
    }

    /**
     * Get duration unit. 
     * @return DurationUnit duration unit.
     */
    public String getDurationUnit() {
        return this.DurationUnit;
    }

    /**
     * Set duration unit.
     * @param DurationUnit duration unit.
     */
    public void setDurationUnit(String DurationUnit) {
        this.DurationUnit = DurationUnit;
    }

    /**
     * Get Total original price.
Original cost = component list price * component usage * usage duration. 
     * @return OriginalCost Total original price.
Original cost = component list price * component usage * usage duration.
     */
    public String getOriginalCost() {
        return this.OriginalCost;
    }

    /**
     * Set Total original price.
Original cost = component list price * component usage * usage duration.
     * @param OriginalCost Total original price.
Original cost = component list price * component usage * usage duration.
     */
    public void setOriginalCost(String OriginalCost) {
        this.OriginalCost = OriginalCost;
    }

    /**
     * Get Currency. 
     * @return Currency Currency.
     */
    public String getCurrency() {
        return this.Currency;
    }

    /**
     * Set Currency.
     * @param Currency Currency.
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    /**
     * Get = Total Amount After Discount - Voucher Deduction 
     * @return TotalCost = Total Amount After Discount - Voucher Deduction
     */
    public String getTotalCost() {
        return this.TotalCost;
    }

    /**
     * Set = Total Amount After Discount - Voucher Deduction
     * @param TotalCost = Total Amount After Discount - Voucher Deduction
     */
    public void setTotalCost(String TotalCost) {
        this.TotalCost = TotalCost;
    }

    /**
     * Get Id identifier. 
     * @return Id Id identifier.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Id identifier.
     * @param Id Id identifier.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Tag information. 
     * @return Tags Tag information.
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag information.
     * @param Tags Tag information.
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


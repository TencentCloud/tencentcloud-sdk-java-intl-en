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
package com.tencentcloudapi.intlpartnersmgt.v20220928.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BillDetailData extends AbstractModel {

    /**
    * <p> Distributor account</p>
    */
    @SerializedName("PayerAccountId")
    @Expose
    private Long PayerAccountId;

    /**
    * <p>Sub-Customer account</p>
    */
    @SerializedName("OwnerAccountId")
    @Expose
    private Long OwnerAccountId;

    /**
    * <p>Operator account</p>
    */
    @SerializedName("OperatorAccountId")
    @Expose
    private Long OperatorAccountId;

    /**
    * <p>Product name.</p>
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * <p>Billing mode</p><p>Enumeration values:</p><ul><li>yearly/monthly subscription</li><li>Pay-As-You-Go resources</li></ul>
    */
    @SerializedName("BillingMode")
    @Expose
    private String BillingMode;

    /**
    * <p>Project name.</p>
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * <p>Associated region of the resource</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>Availability zone of resource</p>
    */
    @SerializedName("AvailabilityZone")
    @Expose
    private String AvailabilityZone;

    /**
    * <p>Instance ID.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Instance name.</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>Sub-product name</p>
    */
    @SerializedName("SubProductName")
    @Expose
    private String SubProductName;

    /**
    * <p>Settlement type</p>
    */
    @SerializedName("TransactionType")
    @Expose
    private String TransactionType;

    /**
    * <p>Transaction log ID</p>
    */
    @SerializedName("TransactionId")
    @Expose
    private String TransactionId;

    /**
    * <p>Time of settlement</p>
    */
    @SerializedName("TransactionTime")
    @Expose
    private String TransactionTime;

    /**
    * <p>Resource usage start time</p>
    */
    @SerializedName("UsageStartTime")
    @Expose
    private String UsageStartTime;

    /**
    * <p>Resource usage end time</p>
    */
    @SerializedName("UsageEndTime")
    @Expose
    private String UsageEndTime;

    /**
    * <p>Component</p>
    */
    @SerializedName("ComponentType")
    @Expose
    private String ComponentType;

    /**
    * <p>Component name</p>
    */
    @SerializedName("ComponentName")
    @Expose
    private String ComponentName;

    /**
    * <p>Component list price</p>
    */
    @SerializedName("ComponentListPrice")
    @Expose
    private String ComponentListPrice;

    /**
    * <p>Price unit</p>
    */
    @SerializedName("ComponentPriceMeasurementUnit")
    @Expose
    private String ComponentPriceMeasurementUnit;

    /**
    * <p>Component usage</p>
    */
    @SerializedName("ComponentUsage")
    @Expose
    private String ComponentUsage;

    /**
    * <p>Component usage unit</p>
    */
    @SerializedName("ComponentUsageUnit")
    @Expose
    private String ComponentUsageUnit;

    /**
    * <p>Resource usage duration</p>
    */
    @SerializedName("UsageDuration")
    @Expose
    private String UsageDuration;

    /**
    * <p>Duration unit</p>
    */
    @SerializedName("DurationUnit")
    @Expose
    private String DurationUnit;

    /**
    * <p>Original total price<br>Original Cost = Component List Price * Component Usage * Usage Duration</p>
    */
    @SerializedName("OriginalCost")
    @Expose
    private String OriginalCost;

    /**
    * <p>Discount (default: 1) - abandoned</p>
    */
    @SerializedName("DiscountRate")
    @Expose
    private String DiscountRate;

    /**
    * <p>Currency.</p>
    */
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
    * <p>Total cost after discount</p>
    */
    @SerializedName("TotalAmountAfterDiscount")
    @Expose
    private String TotalAmountAfterDiscount;

    /**
    * <p>Voucher deducted amount</p>
    */
    @SerializedName("VoucherDeduction")
    @Expose
    private String VoucherDeduction;

    /**
    * <p>= Total Amount After Discount - Voucher Deduction</p>
    */
    @SerializedName("TotalCost")
    @Expose
    private String TotalCost;

    /**
    * <p>id</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>customer discount rate. The discount rate for customers of resellers, set by the reseller. The default value is 1.</p>
    */
    @SerializedName("CustomerDiscountRate")
    @Expose
    private String CustomerDiscountRate;

    /**
    * <p>Product code</p>
    */
    @SerializedName("BusinessCode")
    @Expose
    private String BusinessCode;

    /**
    * <p>Sub-product code</p>
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
    * <p>Component type code</p>
    */
    @SerializedName("ComponentCode")
    @Expose
    private String ComponentCode;

    /**
    * <p>Component code</p>
    */
    @SerializedName("ItemCode")
    @Expose
    private String ItemCode;

    /**
     * Get <p> Distributor account</p> 
     * @return PayerAccountId <p> Distributor account</p>
     */
    public Long getPayerAccountId() {
        return this.PayerAccountId;
    }

    /**
     * Set <p> Distributor account</p>
     * @param PayerAccountId <p> Distributor account</p>
     */
    public void setPayerAccountId(Long PayerAccountId) {
        this.PayerAccountId = PayerAccountId;
    }

    /**
     * Get <p>Sub-Customer account</p> 
     * @return OwnerAccountId <p>Sub-Customer account</p>
     */
    public Long getOwnerAccountId() {
        return this.OwnerAccountId;
    }

    /**
     * Set <p>Sub-Customer account</p>
     * @param OwnerAccountId <p>Sub-Customer account</p>
     */
    public void setOwnerAccountId(Long OwnerAccountId) {
        this.OwnerAccountId = OwnerAccountId;
    }

    /**
     * Get <p>Operator account</p> 
     * @return OperatorAccountId <p>Operator account</p>
     */
    public Long getOperatorAccountId() {
        return this.OperatorAccountId;
    }

    /**
     * Set <p>Operator account</p>
     * @param OperatorAccountId <p>Operator account</p>
     */
    public void setOperatorAccountId(Long OperatorAccountId) {
        this.OperatorAccountId = OperatorAccountId;
    }

    /**
     * Get <p>Product name.</p> 
     * @return ProductName <p>Product name.</p>
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set <p>Product name.</p>
     * @param ProductName <p>Product name.</p>
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get <p>Billing mode</p><p>Enumeration values:</p><ul><li>yearly/monthly subscription</li><li>Pay-As-You-Go resources</li></ul> 
     * @return BillingMode <p>Billing mode</p><p>Enumeration values:</p><ul><li>yearly/monthly subscription</li><li>Pay-As-You-Go resources</li></ul>
     */
    public String getBillingMode() {
        return this.BillingMode;
    }

    /**
     * Set <p>Billing mode</p><p>Enumeration values:</p><ul><li>yearly/monthly subscription</li><li>Pay-As-You-Go resources</li></ul>
     * @param BillingMode <p>Billing mode</p><p>Enumeration values:</p><ul><li>yearly/monthly subscription</li><li>Pay-As-You-Go resources</li></ul>
     */
    public void setBillingMode(String BillingMode) {
        this.BillingMode = BillingMode;
    }

    /**
     * Get <p>Project name.</p> 
     * @return ProjectName <p>Project name.</p>
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set <p>Project name.</p>
     * @param ProjectName <p>Project name.</p>
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get <p>Associated region of the resource</p> 
     * @return Region <p>Associated region of the resource</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>Associated region of the resource</p>
     * @param Region <p>Associated region of the resource</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>Availability zone of resource</p> 
     * @return AvailabilityZone <p>Availability zone of resource</p>
     */
    public String getAvailabilityZone() {
        return this.AvailabilityZone;
    }

    /**
     * Set <p>Availability zone of resource</p>
     * @param AvailabilityZone <p>Availability zone of resource</p>
     */
    public void setAvailabilityZone(String AvailabilityZone) {
        this.AvailabilityZone = AvailabilityZone;
    }

    /**
     * Get <p>Instance ID.</p> 
     * @return InstanceId <p>Instance ID.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID.</p>
     * @param InstanceId <p>Instance ID.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Instance name.</p> 
     * @return InstanceName <p>Instance name.</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>Instance name.</p>
     * @param InstanceName <p>Instance name.</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>Sub-product name</p> 
     * @return SubProductName <p>Sub-product name</p>
     */
    public String getSubProductName() {
        return this.SubProductName;
    }

    /**
     * Set <p>Sub-product name</p>
     * @param SubProductName <p>Sub-product name</p>
     */
    public void setSubProductName(String SubProductName) {
        this.SubProductName = SubProductName;
    }

    /**
     * Get <p>Settlement type</p> 
     * @return TransactionType <p>Settlement type</p>
     */
    public String getTransactionType() {
        return this.TransactionType;
    }

    /**
     * Set <p>Settlement type</p>
     * @param TransactionType <p>Settlement type</p>
     */
    public void setTransactionType(String TransactionType) {
        this.TransactionType = TransactionType;
    }

    /**
     * Get <p>Transaction log ID</p> 
     * @return TransactionId <p>Transaction log ID</p>
     */
    public String getTransactionId() {
        return this.TransactionId;
    }

    /**
     * Set <p>Transaction log ID</p>
     * @param TransactionId <p>Transaction log ID</p>
     */
    public void setTransactionId(String TransactionId) {
        this.TransactionId = TransactionId;
    }

    /**
     * Get <p>Time of settlement</p> 
     * @return TransactionTime <p>Time of settlement</p>
     */
    public String getTransactionTime() {
        return this.TransactionTime;
    }

    /**
     * Set <p>Time of settlement</p>
     * @param TransactionTime <p>Time of settlement</p>
     */
    public void setTransactionTime(String TransactionTime) {
        this.TransactionTime = TransactionTime;
    }

    /**
     * Get <p>Resource usage start time</p> 
     * @return UsageStartTime <p>Resource usage start time</p>
     */
    public String getUsageStartTime() {
        return this.UsageStartTime;
    }

    /**
     * Set <p>Resource usage start time</p>
     * @param UsageStartTime <p>Resource usage start time</p>
     */
    public void setUsageStartTime(String UsageStartTime) {
        this.UsageStartTime = UsageStartTime;
    }

    /**
     * Get <p>Resource usage end time</p> 
     * @return UsageEndTime <p>Resource usage end time</p>
     */
    public String getUsageEndTime() {
        return this.UsageEndTime;
    }

    /**
     * Set <p>Resource usage end time</p>
     * @param UsageEndTime <p>Resource usage end time</p>
     */
    public void setUsageEndTime(String UsageEndTime) {
        this.UsageEndTime = UsageEndTime;
    }

    /**
     * Get <p>Component</p> 
     * @return ComponentType <p>Component</p>
     */
    public String getComponentType() {
        return this.ComponentType;
    }

    /**
     * Set <p>Component</p>
     * @param ComponentType <p>Component</p>
     */
    public void setComponentType(String ComponentType) {
        this.ComponentType = ComponentType;
    }

    /**
     * Get <p>Component name</p> 
     * @return ComponentName <p>Component name</p>
     */
    public String getComponentName() {
        return this.ComponentName;
    }

    /**
     * Set <p>Component name</p>
     * @param ComponentName <p>Component name</p>
     */
    public void setComponentName(String ComponentName) {
        this.ComponentName = ComponentName;
    }

    /**
     * Get <p>Component list price</p> 
     * @return ComponentListPrice <p>Component list price</p>
     */
    public String getComponentListPrice() {
        return this.ComponentListPrice;
    }

    /**
     * Set <p>Component list price</p>
     * @param ComponentListPrice <p>Component list price</p>
     */
    public void setComponentListPrice(String ComponentListPrice) {
        this.ComponentListPrice = ComponentListPrice;
    }

    /**
     * Get <p>Price unit</p> 
     * @return ComponentPriceMeasurementUnit <p>Price unit</p>
     */
    public String getComponentPriceMeasurementUnit() {
        return this.ComponentPriceMeasurementUnit;
    }

    /**
     * Set <p>Price unit</p>
     * @param ComponentPriceMeasurementUnit <p>Price unit</p>
     */
    public void setComponentPriceMeasurementUnit(String ComponentPriceMeasurementUnit) {
        this.ComponentPriceMeasurementUnit = ComponentPriceMeasurementUnit;
    }

    /**
     * Get <p>Component usage</p> 
     * @return ComponentUsage <p>Component usage</p>
     */
    public String getComponentUsage() {
        return this.ComponentUsage;
    }

    /**
     * Set <p>Component usage</p>
     * @param ComponentUsage <p>Component usage</p>
     */
    public void setComponentUsage(String ComponentUsage) {
        this.ComponentUsage = ComponentUsage;
    }

    /**
     * Get <p>Component usage unit</p> 
     * @return ComponentUsageUnit <p>Component usage unit</p>
     */
    public String getComponentUsageUnit() {
        return this.ComponentUsageUnit;
    }

    /**
     * Set <p>Component usage unit</p>
     * @param ComponentUsageUnit <p>Component usage unit</p>
     */
    public void setComponentUsageUnit(String ComponentUsageUnit) {
        this.ComponentUsageUnit = ComponentUsageUnit;
    }

    /**
     * Get <p>Resource usage duration</p> 
     * @return UsageDuration <p>Resource usage duration</p>
     */
    public String getUsageDuration() {
        return this.UsageDuration;
    }

    /**
     * Set <p>Resource usage duration</p>
     * @param UsageDuration <p>Resource usage duration</p>
     */
    public void setUsageDuration(String UsageDuration) {
        this.UsageDuration = UsageDuration;
    }

    /**
     * Get <p>Duration unit</p> 
     * @return DurationUnit <p>Duration unit</p>
     */
    public String getDurationUnit() {
        return this.DurationUnit;
    }

    /**
     * Set <p>Duration unit</p>
     * @param DurationUnit <p>Duration unit</p>
     */
    public void setDurationUnit(String DurationUnit) {
        this.DurationUnit = DurationUnit;
    }

    /**
     * Get <p>Original total price<br>Original Cost = Component List Price * Component Usage * Usage Duration</p> 
     * @return OriginalCost <p>Original total price<br>Original Cost = Component List Price * Component Usage * Usage Duration</p>
     */
    public String getOriginalCost() {
        return this.OriginalCost;
    }

    /**
     * Set <p>Original total price<br>Original Cost = Component List Price * Component Usage * Usage Duration</p>
     * @param OriginalCost <p>Original total price<br>Original Cost = Component List Price * Component Usage * Usage Duration</p>
     */
    public void setOriginalCost(String OriginalCost) {
        this.OriginalCost = OriginalCost;
    }

    /**
     * Get <p>Discount (default: 1) - abandoned</p> 
     * @return DiscountRate <p>Discount (default: 1) - abandoned</p>
     */
    public String getDiscountRate() {
        return this.DiscountRate;
    }

    /**
     * Set <p>Discount (default: 1) - abandoned</p>
     * @param DiscountRate <p>Discount (default: 1) - abandoned</p>
     */
    public void setDiscountRate(String DiscountRate) {
        this.DiscountRate = DiscountRate;
    }

    /**
     * Get <p>Currency.</p> 
     * @return Currency <p>Currency.</p>
     */
    public String getCurrency() {
        return this.Currency;
    }

    /**
     * Set <p>Currency.</p>
     * @param Currency <p>Currency.</p>
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    /**
     * Get <p>Total cost after discount</p> 
     * @return TotalAmountAfterDiscount <p>Total cost after discount</p>
     */
    public String getTotalAmountAfterDiscount() {
        return this.TotalAmountAfterDiscount;
    }

    /**
     * Set <p>Total cost after discount</p>
     * @param TotalAmountAfterDiscount <p>Total cost after discount</p>
     */
    public void setTotalAmountAfterDiscount(String TotalAmountAfterDiscount) {
        this.TotalAmountAfterDiscount = TotalAmountAfterDiscount;
    }

    /**
     * Get <p>Voucher deducted amount</p> 
     * @return VoucherDeduction <p>Voucher deducted amount</p>
     */
    public String getVoucherDeduction() {
        return this.VoucherDeduction;
    }

    /**
     * Set <p>Voucher deducted amount</p>
     * @param VoucherDeduction <p>Voucher deducted amount</p>
     */
    public void setVoucherDeduction(String VoucherDeduction) {
        this.VoucherDeduction = VoucherDeduction;
    }

    /**
     * Get <p>= Total Amount After Discount - Voucher Deduction</p> 
     * @return TotalCost <p>= Total Amount After Discount - Voucher Deduction</p>
     */
    public String getTotalCost() {
        return this.TotalCost;
    }

    /**
     * Set <p>= Total Amount After Discount - Voucher Deduction</p>
     * @param TotalCost <p>= Total Amount After Discount - Voucher Deduction</p>
     */
    public void setTotalCost(String TotalCost) {
        this.TotalCost = TotalCost;
    }

    /**
     * Get <p>id</p> 
     * @return Id <p>id</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>id</p>
     * @param Id <p>id</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>customer discount rate. The discount rate for customers of resellers, set by the reseller. The default value is 1.</p> 
     * @return CustomerDiscountRate <p>customer discount rate. The discount rate for customers of resellers, set by the reseller. The default value is 1.</p>
     */
    public String getCustomerDiscountRate() {
        return this.CustomerDiscountRate;
    }

    /**
     * Set <p>customer discount rate. The discount rate for customers of resellers, set by the reseller. The default value is 1.</p>
     * @param CustomerDiscountRate <p>customer discount rate. The discount rate for customers of resellers, set by the reseller. The default value is 1.</p>
     */
    public void setCustomerDiscountRate(String CustomerDiscountRate) {
        this.CustomerDiscountRate = CustomerDiscountRate;
    }

    /**
     * Get <p>Product code</p> 
     * @return BusinessCode <p>Product code</p>
     */
    public String getBusinessCode() {
        return this.BusinessCode;
    }

    /**
     * Set <p>Product code</p>
     * @param BusinessCode <p>Product code</p>
     */
    public void setBusinessCode(String BusinessCode) {
        this.BusinessCode = BusinessCode;
    }

    /**
     * Get <p>Sub-product code</p> 
     * @return ProductCode <p>Sub-product code</p>
     */
    public String getProductCode() {
        return this.ProductCode;
    }

    /**
     * Set <p>Sub-product code</p>
     * @param ProductCode <p>Sub-product code</p>
     */
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    /**
     * Get <p>Component type code</p> 
     * @return ComponentCode <p>Component type code</p>
     */
    public String getComponentCode() {
        return this.ComponentCode;
    }

    /**
     * Set <p>Component type code</p>
     * @param ComponentCode <p>Component type code</p>
     */
    public void setComponentCode(String ComponentCode) {
        this.ComponentCode = ComponentCode;
    }

    /**
     * Get <p>Component code</p> 
     * @return ItemCode <p>Component code</p>
     */
    public String getItemCode() {
        return this.ItemCode;
    }

    /**
     * Set <p>Component code</p>
     * @param ItemCode <p>Component code</p>
     */
    public void setItemCode(String ItemCode) {
        this.ItemCode = ItemCode;
    }

    public BillDetailData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BillDetailData(BillDetailData source) {
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
        if (source.DiscountRate != null) {
            this.DiscountRate = new String(source.DiscountRate);
        }
        if (source.Currency != null) {
            this.Currency = new String(source.Currency);
        }
        if (source.TotalAmountAfterDiscount != null) {
            this.TotalAmountAfterDiscount = new String(source.TotalAmountAfterDiscount);
        }
        if (source.VoucherDeduction != null) {
            this.VoucherDeduction = new String(source.VoucherDeduction);
        }
        if (source.TotalCost != null) {
            this.TotalCost = new String(source.TotalCost);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.CustomerDiscountRate != null) {
            this.CustomerDiscountRate = new String(source.CustomerDiscountRate);
        }
        if (source.BusinessCode != null) {
            this.BusinessCode = new String(source.BusinessCode);
        }
        if (source.ProductCode != null) {
            this.ProductCode = new String(source.ProductCode);
        }
        if (source.ComponentCode != null) {
            this.ComponentCode = new String(source.ComponentCode);
        }
        if (source.ItemCode != null) {
            this.ItemCode = new String(source.ItemCode);
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
        this.setParamSimple(map, prefix + "DiscountRate", this.DiscountRate);
        this.setParamSimple(map, prefix + "Currency", this.Currency);
        this.setParamSimple(map, prefix + "TotalAmountAfterDiscount", this.TotalAmountAfterDiscount);
        this.setParamSimple(map, prefix + "VoucherDeduction", this.VoucherDeduction);
        this.setParamSimple(map, prefix + "TotalCost", this.TotalCost);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "CustomerDiscountRate", this.CustomerDiscountRate);
        this.setParamSimple(map, prefix + "BusinessCode", this.BusinessCode);
        this.setParamSimple(map, prefix + "ProductCode", this.ProductCode);
        this.setParamSimple(map, prefix + "ComponentCode", this.ComponentCode);
        this.setParamSimple(map, prefix + "ItemCode", this.ItemCode);

    }
}


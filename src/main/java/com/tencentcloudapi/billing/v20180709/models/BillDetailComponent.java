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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BillDetailComponent extends AbstractModel {

    /**
    * Component type: The component type of a product or service purchased, such as CVM instance components including CPU and memory.
    */
    @SerializedName("ComponentCodeName")
    @Expose
    private String ComponentCodeName;

    /**
    * Component name: The specific component of a product or service purchased
    */
    @SerializedName("ItemCodeName")
    @Expose
    private String ItemCodeName;

    /**
    * Component list price: The listed unit price of a component. If a customer has applied for a fixed preferential price or contract price, this parameter will not be displayed by default.
    */
    @SerializedName("SinglePrice")
    @Expose
    private String SinglePrice;

    /**
    * Specified price of a component. This parameter has been deprecated.
    */
    @SerializedName("SpecifiedPrice")
    @Expose
    private String SpecifiedPrice;

    /**
    * Component price measurement unit: The unit of measurement for a component price, which is composed of USD, usage unit, and duration unit.
    */
    @SerializedName("PriceUnit")
    @Expose
    private String PriceUnit;

    /**
    * Component usage: The actually settled usage of a component, which is "Raw usage - Deducted usage (including packages)".
    */
    @SerializedName("UsedAmount")
    @Expose
    private String UsedAmount;

    /**
    * Component usage unit: The unit of measurement for component usage
    */
    @SerializedName("UsedAmountUnit")
    @Expose
    private String UsedAmountUnit;

    /**
    * Original usage/duration: The original usage of the component before deduction by resource packages.
    */
    @SerializedName("RealTotalMeasure")
    @Expose
    private String RealTotalMeasure;

    /**
    * Deduction of usage/duration (including resource packages): The amount of usage/duration deducted by resource packages
    */
    @SerializedName("DeductedMeasure")
    @Expose
    private String DeductedMeasure;

    /**
    * Usage duration: The resource usage duration
    */
    @SerializedName("TimeSpan")
    @Expose
    private String TimeSpan;

    /**
    * Duration unit: The unit of measurement for usage duration
    */
    @SerializedName("TimeUnitName")
    @Expose
    private String TimeUnitName;

    /**
    * Original cost: The original cost of a resource, which is "List price x Usage x Usage duration". If a customer has applied for a fixed preferential price or contract price or is in a refund scenario, this parameter will not be displayed by default.
    */
    @SerializedName("Cost")
    @Expose
    private String Cost;

    /**
    * Discount multiplier: The discount multiplier applied to the cost of the resource. If a customer has applied for a fixed preferential price or contract price or is in a refund scenario, this parameter will not be displayed by default.
    */
    @SerializedName("Discount")
    @Expose
    private String Discount;

    /**
    * Offer type
    */
    @SerializedName("ReduceType")
    @Expose
    private String ReduceType;

    /**
    * Total amount after discount: Total amount after discount = (Original cost - RI deduction (cost) - SP deduction (cost)) x Discount multiplier
    */
    @SerializedName("RealCost")
    @Expose
    private String RealCost;

    /**
    * Voucher payment: The voucher deduction amount
    */
    @SerializedName("VoucherPayAmount")
    @Expose
    private String VoucherPayAmount;

    /**
    * Cash credit: The amount paid from the user's cash account

    */
    @SerializedName("CashPayAmount")
    @Expose
    private String CashPayAmount;

    /**
    * Free credit: The amount paid with the user's free credit

    */
    @SerializedName("IncentivePayAmount")
    @Expose
    private String IncentivePayAmount;

    /**
    * Royalty account expenditure: The amount paid through the royalty account
    */
    @SerializedName("TransferPayAmount")
    @Expose
    private String TransferPayAmount;

    /**
    * Component type code
    */
    @SerializedName("ItemCode")
    @Expose
    private String ItemCode;

    /**
    * Component name code
    */
    @SerializedName("ComponentCode")
    @Expose
    private String ComponentCode;

    /**
    * Component unit price: Discounted unit price of the component. Component unit price = list price * discount.
    */
    @SerializedName("ContractPrice")
    @Expose
    private String ContractPrice;

    /**
    * Instance type: The type of an instance corresponding to the product service purchased, including resource packages, RI, SP, and spot instances. Normal instance display is not displayed by default.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * RI deduction duration: The duration of use deducted by reserved instances for this product or service.
    */
    @SerializedName("RiTimeSpan")
    @Expose
    private String RiTimeSpan;

    /**
    * Reserved Instance Deduction Component Original Price: The original price of a component deducted by reserved instances for this product or service
    */
    @SerializedName("OriginalCostWithRI")
    @Expose
    private String OriginalCostWithRI;

    /**
    * Savings plan deduction rate: The discount rate for this component within the available balance limit of the savings plan
    */
    @SerializedName("SPDeductionRate")
    @Expose
    private String SPDeductionRate;

    /**
    * Cost deduction by SP. This parameter has been deprecated. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SPDeduction")
    @Expose
    private String SPDeduction;

    /**
    * Original Price of Savings Plan Deduction Component: Savings Plan Deduction from Original Price = Deduction Amount of Savings Plan Package / Savings Plan Deduction Rate
    */
    @SerializedName("OriginalCostWithSP")
    @Expose
    private String OriginalCostWithSP;

    /**
    * Mixed discount rate: The final discount rate after integrating various discount deductions. Mixed Discount Rate = Discounted total price/Component original price.
    */
    @SerializedName("BlendedDiscount")
    @Expose
    private String BlendedDiscount;

    /**
    * Configuration description: Information on specification of resource configuration
    */
    @SerializedName("ComponentConfig")
    @Expose
    private BillDetailComponentConfig [] ComponentConfig;

    /**
    * tax rate
    */
    @SerializedName("TaxRate")
    @Expose
    private String TaxRate;

    /**
    * Tax.
    */
    @SerializedName("TaxAmount")
    @Expose
    private String TaxAmount;

    /**
    * Currency.
    */
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
     * Get Component type: The component type of a product or service purchased, such as CVM instance components including CPU and memory. 
     * @return ComponentCodeName Component type: The component type of a product or service purchased, such as CVM instance components including CPU and memory.
     */
    public String getComponentCodeName() {
        return this.ComponentCodeName;
    }

    /**
     * Set Component type: The component type of a product or service purchased, such as CVM instance components including CPU and memory.
     * @param ComponentCodeName Component type: The component type of a product or service purchased, such as CVM instance components including CPU and memory.
     */
    public void setComponentCodeName(String ComponentCodeName) {
        this.ComponentCodeName = ComponentCodeName;
    }

    /**
     * Get Component name: The specific component of a product or service purchased 
     * @return ItemCodeName Component name: The specific component of a product or service purchased
     */
    public String getItemCodeName() {
        return this.ItemCodeName;
    }

    /**
     * Set Component name: The specific component of a product or service purchased
     * @param ItemCodeName Component name: The specific component of a product or service purchased
     */
    public void setItemCodeName(String ItemCodeName) {
        this.ItemCodeName = ItemCodeName;
    }

    /**
     * Get Component list price: The listed unit price of a component. If a customer has applied for a fixed preferential price or contract price, this parameter will not be displayed by default. 
     * @return SinglePrice Component list price: The listed unit price of a component. If a customer has applied for a fixed preferential price or contract price, this parameter will not be displayed by default.
     */
    public String getSinglePrice() {
        return this.SinglePrice;
    }

    /**
     * Set Component list price: The listed unit price of a component. If a customer has applied for a fixed preferential price or contract price, this parameter will not be displayed by default.
     * @param SinglePrice Component list price: The listed unit price of a component. If a customer has applied for a fixed preferential price or contract price, this parameter will not be displayed by default.
     */
    public void setSinglePrice(String SinglePrice) {
        this.SinglePrice = SinglePrice;
    }

    /**
     * Get Specified price of a component. This parameter has been deprecated. 
     * @return SpecifiedPrice Specified price of a component. This parameter has been deprecated.
     * @deprecated
     */
    @Deprecated
    public String getSpecifiedPrice() {
        return this.SpecifiedPrice;
    }

    /**
     * Set Specified price of a component. This parameter has been deprecated.
     * @param SpecifiedPrice Specified price of a component. This parameter has been deprecated.
     * @deprecated
     */
    @Deprecated
    public void setSpecifiedPrice(String SpecifiedPrice) {
        this.SpecifiedPrice = SpecifiedPrice;
    }

    /**
     * Get Component price measurement unit: The unit of measurement for a component price, which is composed of USD, usage unit, and duration unit. 
     * @return PriceUnit Component price measurement unit: The unit of measurement for a component price, which is composed of USD, usage unit, and duration unit.
     */
    public String getPriceUnit() {
        return this.PriceUnit;
    }

    /**
     * Set Component price measurement unit: The unit of measurement for a component price, which is composed of USD, usage unit, and duration unit.
     * @param PriceUnit Component price measurement unit: The unit of measurement for a component price, which is composed of USD, usage unit, and duration unit.
     */
    public void setPriceUnit(String PriceUnit) {
        this.PriceUnit = PriceUnit;
    }

    /**
     * Get Component usage: The actually settled usage of a component, which is "Raw usage - Deducted usage (including packages)". 
     * @return UsedAmount Component usage: The actually settled usage of a component, which is "Raw usage - Deducted usage (including packages)".
     */
    public String getUsedAmount() {
        return this.UsedAmount;
    }

    /**
     * Set Component usage: The actually settled usage of a component, which is "Raw usage - Deducted usage (including packages)".
     * @param UsedAmount Component usage: The actually settled usage of a component, which is "Raw usage - Deducted usage (including packages)".
     */
    public void setUsedAmount(String UsedAmount) {
        this.UsedAmount = UsedAmount;
    }

    /**
     * Get Component usage unit: The unit of measurement for component usage 
     * @return UsedAmountUnit Component usage unit: The unit of measurement for component usage
     */
    public String getUsedAmountUnit() {
        return this.UsedAmountUnit;
    }

    /**
     * Set Component usage unit: The unit of measurement for component usage
     * @param UsedAmountUnit Component usage unit: The unit of measurement for component usage
     */
    public void setUsedAmountUnit(String UsedAmountUnit) {
        this.UsedAmountUnit = UsedAmountUnit;
    }

    /**
     * Get Original usage/duration: The original usage of the component before deduction by resource packages. 
     * @return RealTotalMeasure Original usage/duration: The original usage of the component before deduction by resource packages.
     */
    public String getRealTotalMeasure() {
        return this.RealTotalMeasure;
    }

    /**
     * Set Original usage/duration: The original usage of the component before deduction by resource packages.
     * @param RealTotalMeasure Original usage/duration: The original usage of the component before deduction by resource packages.
     */
    public void setRealTotalMeasure(String RealTotalMeasure) {
        this.RealTotalMeasure = RealTotalMeasure;
    }

    /**
     * Get Deduction of usage/duration (including resource packages): The amount of usage/duration deducted by resource packages 
     * @return DeductedMeasure Deduction of usage/duration (including resource packages): The amount of usage/duration deducted by resource packages
     */
    public String getDeductedMeasure() {
        return this.DeductedMeasure;
    }

    /**
     * Set Deduction of usage/duration (including resource packages): The amount of usage/duration deducted by resource packages
     * @param DeductedMeasure Deduction of usage/duration (including resource packages): The amount of usage/duration deducted by resource packages
     */
    public void setDeductedMeasure(String DeductedMeasure) {
        this.DeductedMeasure = DeductedMeasure;
    }

    /**
     * Get Usage duration: The resource usage duration 
     * @return TimeSpan Usage duration: The resource usage duration
     */
    public String getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set Usage duration: The resource usage duration
     * @param TimeSpan Usage duration: The resource usage duration
     */
    public void setTimeSpan(String TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get Duration unit: The unit of measurement for usage duration 
     * @return TimeUnitName Duration unit: The unit of measurement for usage duration
     */
    public String getTimeUnitName() {
        return this.TimeUnitName;
    }

    /**
     * Set Duration unit: The unit of measurement for usage duration
     * @param TimeUnitName Duration unit: The unit of measurement for usage duration
     */
    public void setTimeUnitName(String TimeUnitName) {
        this.TimeUnitName = TimeUnitName;
    }

    /**
     * Get Original cost: The original cost of a resource, which is "List price x Usage x Usage duration". If a customer has applied for a fixed preferential price or contract price or is in a refund scenario, this parameter will not be displayed by default. 
     * @return Cost Original cost: The original cost of a resource, which is "List price x Usage x Usage duration". If a customer has applied for a fixed preferential price or contract price or is in a refund scenario, this parameter will not be displayed by default.
     */
    public String getCost() {
        return this.Cost;
    }

    /**
     * Set Original cost: The original cost of a resource, which is "List price x Usage x Usage duration". If a customer has applied for a fixed preferential price or contract price or is in a refund scenario, this parameter will not be displayed by default.
     * @param Cost Original cost: The original cost of a resource, which is "List price x Usage x Usage duration". If a customer has applied for a fixed preferential price or contract price or is in a refund scenario, this parameter will not be displayed by default.
     */
    public void setCost(String Cost) {
        this.Cost = Cost;
    }

    /**
     * Get Discount multiplier: The discount multiplier applied to the cost of the resource. If a customer has applied for a fixed preferential price or contract price or is in a refund scenario, this parameter will not be displayed by default. 
     * @return Discount Discount multiplier: The discount multiplier applied to the cost of the resource. If a customer has applied for a fixed preferential price or contract price or is in a refund scenario, this parameter will not be displayed by default.
     */
    public String getDiscount() {
        return this.Discount;
    }

    /**
     * Set Discount multiplier: The discount multiplier applied to the cost of the resource. If a customer has applied for a fixed preferential price or contract price or is in a refund scenario, this parameter will not be displayed by default.
     * @param Discount Discount multiplier: The discount multiplier applied to the cost of the resource. If a customer has applied for a fixed preferential price or contract price or is in a refund scenario, this parameter will not be displayed by default.
     */
    public void setDiscount(String Discount) {
        this.Discount = Discount;
    }

    /**
     * Get Offer type 
     * @return ReduceType Offer type
     */
    public String getReduceType() {
        return this.ReduceType;
    }

    /**
     * Set Offer type
     * @param ReduceType Offer type
     */
    public void setReduceType(String ReduceType) {
        this.ReduceType = ReduceType;
    }

    /**
     * Get Total amount after discount: Total amount after discount = (Original cost - RI deduction (cost) - SP deduction (cost)) x Discount multiplier 
     * @return RealCost Total amount after discount: Total amount after discount = (Original cost - RI deduction (cost) - SP deduction (cost)) x Discount multiplier
     */
    public String getRealCost() {
        return this.RealCost;
    }

    /**
     * Set Total amount after discount: Total amount after discount = (Original cost - RI deduction (cost) - SP deduction (cost)) x Discount multiplier
     * @param RealCost Total amount after discount: Total amount after discount = (Original cost - RI deduction (cost) - SP deduction (cost)) x Discount multiplier
     */
    public void setRealCost(String RealCost) {
        this.RealCost = RealCost;
    }

    /**
     * Get Voucher payment: The voucher deduction amount 
     * @return VoucherPayAmount Voucher payment: The voucher deduction amount
     */
    public String getVoucherPayAmount() {
        return this.VoucherPayAmount;
    }

    /**
     * Set Voucher payment: The voucher deduction amount
     * @param VoucherPayAmount Voucher payment: The voucher deduction amount
     */
    public void setVoucherPayAmount(String VoucherPayAmount) {
        this.VoucherPayAmount = VoucherPayAmount;
    }

    /**
     * Get Cash credit: The amount paid from the user's cash account
 
     * @return CashPayAmount Cash credit: The amount paid from the user's cash account

     */
    public String getCashPayAmount() {
        return this.CashPayAmount;
    }

    /**
     * Set Cash credit: The amount paid from the user's cash account

     * @param CashPayAmount Cash credit: The amount paid from the user's cash account

     */
    public void setCashPayAmount(String CashPayAmount) {
        this.CashPayAmount = CashPayAmount;
    }

    /**
     * Get Free credit: The amount paid with the user's free credit
 
     * @return IncentivePayAmount Free credit: The amount paid with the user's free credit

     */
    public String getIncentivePayAmount() {
        return this.IncentivePayAmount;
    }

    /**
     * Set Free credit: The amount paid with the user's free credit

     * @param IncentivePayAmount Free credit: The amount paid with the user's free credit

     */
    public void setIncentivePayAmount(String IncentivePayAmount) {
        this.IncentivePayAmount = IncentivePayAmount;
    }

    /**
     * Get Royalty account expenditure: The amount paid through the royalty account 
     * @return TransferPayAmount Royalty account expenditure: The amount paid through the royalty account
     */
    public String getTransferPayAmount() {
        return this.TransferPayAmount;
    }

    /**
     * Set Royalty account expenditure: The amount paid through the royalty account
     * @param TransferPayAmount Royalty account expenditure: The amount paid through the royalty account
     */
    public void setTransferPayAmount(String TransferPayAmount) {
        this.TransferPayAmount = TransferPayAmount;
    }

    /**
     * Get Component type code 
     * @return ItemCode Component type code
     */
    public String getItemCode() {
        return this.ItemCode;
    }

    /**
     * Set Component type code
     * @param ItemCode Component type code
     */
    public void setItemCode(String ItemCode) {
        this.ItemCode = ItemCode;
    }

    /**
     * Get Component name code 
     * @return ComponentCode Component name code
     */
    public String getComponentCode() {
        return this.ComponentCode;
    }

    /**
     * Set Component name code
     * @param ComponentCode Component name code
     */
    public void setComponentCode(String ComponentCode) {
        this.ComponentCode = ComponentCode;
    }

    /**
     * Get Component unit price: Discounted unit price of the component. Component unit price = list price * discount. 
     * @return ContractPrice Component unit price: Discounted unit price of the component. Component unit price = list price * discount.
     */
    public String getContractPrice() {
        return this.ContractPrice;
    }

    /**
     * Set Component unit price: Discounted unit price of the component. Component unit price = list price * discount.
     * @param ContractPrice Component unit price: Discounted unit price of the component. Component unit price = list price * discount.
     */
    public void setContractPrice(String ContractPrice) {
        this.ContractPrice = ContractPrice;
    }

    /**
     * Get Instance type: The type of an instance corresponding to the product service purchased, including resource packages, RI, SP, and spot instances. Normal instance display is not displayed by default. 
     * @return InstanceType Instance type: The type of an instance corresponding to the product service purchased, including resource packages, RI, SP, and spot instances. Normal instance display is not displayed by default.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance type: The type of an instance corresponding to the product service purchased, including resource packages, RI, SP, and spot instances. Normal instance display is not displayed by default.
     * @param InstanceType Instance type: The type of an instance corresponding to the product service purchased, including resource packages, RI, SP, and spot instances. Normal instance display is not displayed by default.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get RI deduction duration: The duration of use deducted by reserved instances for this product or service. 
     * @return RiTimeSpan RI deduction duration: The duration of use deducted by reserved instances for this product or service.
     */
    public String getRiTimeSpan() {
        return this.RiTimeSpan;
    }

    /**
     * Set RI deduction duration: The duration of use deducted by reserved instances for this product or service.
     * @param RiTimeSpan RI deduction duration: The duration of use deducted by reserved instances for this product or service.
     */
    public void setRiTimeSpan(String RiTimeSpan) {
        this.RiTimeSpan = RiTimeSpan;
    }

    /**
     * Get Reserved Instance Deduction Component Original Price: The original price of a component deducted by reserved instances for this product or service 
     * @return OriginalCostWithRI Reserved Instance Deduction Component Original Price: The original price of a component deducted by reserved instances for this product or service
     */
    public String getOriginalCostWithRI() {
        return this.OriginalCostWithRI;
    }

    /**
     * Set Reserved Instance Deduction Component Original Price: The original price of a component deducted by reserved instances for this product or service
     * @param OriginalCostWithRI Reserved Instance Deduction Component Original Price: The original price of a component deducted by reserved instances for this product or service
     */
    public void setOriginalCostWithRI(String OriginalCostWithRI) {
        this.OriginalCostWithRI = OriginalCostWithRI;
    }

    /**
     * Get Savings plan deduction rate: The discount rate for this component within the available balance limit of the savings plan 
     * @return SPDeductionRate Savings plan deduction rate: The discount rate for this component within the available balance limit of the savings plan
     */
    public String getSPDeductionRate() {
        return this.SPDeductionRate;
    }

    /**
     * Set Savings plan deduction rate: The discount rate for this component within the available balance limit of the savings plan
     * @param SPDeductionRate Savings plan deduction rate: The discount rate for this component within the available balance limit of the savings plan
     */
    public void setSPDeductionRate(String SPDeductionRate) {
        this.SPDeductionRate = SPDeductionRate;
    }

    /**
     * Get Cost deduction by SP. This parameter has been deprecated. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SPDeduction Cost deduction by SP. This parameter has been deprecated. Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public String getSPDeduction() {
        return this.SPDeduction;
    }

    /**
     * Set Cost deduction by SP. This parameter has been deprecated. Note: This field may return null, indicating that no valid values can be obtained.
     * @param SPDeduction Cost deduction by SP. This parameter has been deprecated. Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setSPDeduction(String SPDeduction) {
        this.SPDeduction = SPDeduction;
    }

    /**
     * Get Original Price of Savings Plan Deduction Component: Savings Plan Deduction from Original Price = Deduction Amount of Savings Plan Package / Savings Plan Deduction Rate 
     * @return OriginalCostWithSP Original Price of Savings Plan Deduction Component: Savings Plan Deduction from Original Price = Deduction Amount of Savings Plan Package / Savings Plan Deduction Rate
     */
    public String getOriginalCostWithSP() {
        return this.OriginalCostWithSP;
    }

    /**
     * Set Original Price of Savings Plan Deduction Component: Savings Plan Deduction from Original Price = Deduction Amount of Savings Plan Package / Savings Plan Deduction Rate
     * @param OriginalCostWithSP Original Price of Savings Plan Deduction Component: Savings Plan Deduction from Original Price = Deduction Amount of Savings Plan Package / Savings Plan Deduction Rate
     */
    public void setOriginalCostWithSP(String OriginalCostWithSP) {
        this.OriginalCostWithSP = OriginalCostWithSP;
    }

    /**
     * Get Mixed discount rate: The final discount rate after integrating various discount deductions. Mixed Discount Rate = Discounted total price/Component original price. 
     * @return BlendedDiscount Mixed discount rate: The final discount rate after integrating various discount deductions. Mixed Discount Rate = Discounted total price/Component original price.
     */
    public String getBlendedDiscount() {
        return this.BlendedDiscount;
    }

    /**
     * Set Mixed discount rate: The final discount rate after integrating various discount deductions. Mixed Discount Rate = Discounted total price/Component original price.
     * @param BlendedDiscount Mixed discount rate: The final discount rate after integrating various discount deductions. Mixed Discount Rate = Discounted total price/Component original price.
     */
    public void setBlendedDiscount(String BlendedDiscount) {
        this.BlendedDiscount = BlendedDiscount;
    }

    /**
     * Get Configuration description: Information on specification of resource configuration 
     * @return ComponentConfig Configuration description: Information on specification of resource configuration
     */
    public BillDetailComponentConfig [] getComponentConfig() {
        return this.ComponentConfig;
    }

    /**
     * Set Configuration description: Information on specification of resource configuration
     * @param ComponentConfig Configuration description: Information on specification of resource configuration
     */
    public void setComponentConfig(BillDetailComponentConfig [] ComponentConfig) {
        this.ComponentConfig = ComponentConfig;
    }

    /**
     * Get tax rate 
     * @return TaxRate tax rate
     */
    public String getTaxRate() {
        return this.TaxRate;
    }

    /**
     * Set tax rate
     * @param TaxRate tax rate
     */
    public void setTaxRate(String TaxRate) {
        this.TaxRate = TaxRate;
    }

    /**
     * Get Tax. 
     * @return TaxAmount Tax.
     */
    public String getTaxAmount() {
        return this.TaxAmount;
    }

    /**
     * Set Tax.
     * @param TaxAmount Tax.
     */
    public void setTaxAmount(String TaxAmount) {
        this.TaxAmount = TaxAmount;
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

    public BillDetailComponent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BillDetailComponent(BillDetailComponent source) {
        if (source.ComponentCodeName != null) {
            this.ComponentCodeName = new String(source.ComponentCodeName);
        }
        if (source.ItemCodeName != null) {
            this.ItemCodeName = new String(source.ItemCodeName);
        }
        if (source.SinglePrice != null) {
            this.SinglePrice = new String(source.SinglePrice);
        }
        if (source.SpecifiedPrice != null) {
            this.SpecifiedPrice = new String(source.SpecifiedPrice);
        }
        if (source.PriceUnit != null) {
            this.PriceUnit = new String(source.PriceUnit);
        }
        if (source.UsedAmount != null) {
            this.UsedAmount = new String(source.UsedAmount);
        }
        if (source.UsedAmountUnit != null) {
            this.UsedAmountUnit = new String(source.UsedAmountUnit);
        }
        if (source.RealTotalMeasure != null) {
            this.RealTotalMeasure = new String(source.RealTotalMeasure);
        }
        if (source.DeductedMeasure != null) {
            this.DeductedMeasure = new String(source.DeductedMeasure);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new String(source.TimeSpan);
        }
        if (source.TimeUnitName != null) {
            this.TimeUnitName = new String(source.TimeUnitName);
        }
        if (source.Cost != null) {
            this.Cost = new String(source.Cost);
        }
        if (source.Discount != null) {
            this.Discount = new String(source.Discount);
        }
        if (source.ReduceType != null) {
            this.ReduceType = new String(source.ReduceType);
        }
        if (source.RealCost != null) {
            this.RealCost = new String(source.RealCost);
        }
        if (source.VoucherPayAmount != null) {
            this.VoucherPayAmount = new String(source.VoucherPayAmount);
        }
        if (source.CashPayAmount != null) {
            this.CashPayAmount = new String(source.CashPayAmount);
        }
        if (source.IncentivePayAmount != null) {
            this.IncentivePayAmount = new String(source.IncentivePayAmount);
        }
        if (source.TransferPayAmount != null) {
            this.TransferPayAmount = new String(source.TransferPayAmount);
        }
        if (source.ItemCode != null) {
            this.ItemCode = new String(source.ItemCode);
        }
        if (source.ComponentCode != null) {
            this.ComponentCode = new String(source.ComponentCode);
        }
        if (source.ContractPrice != null) {
            this.ContractPrice = new String(source.ContractPrice);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.RiTimeSpan != null) {
            this.RiTimeSpan = new String(source.RiTimeSpan);
        }
        if (source.OriginalCostWithRI != null) {
            this.OriginalCostWithRI = new String(source.OriginalCostWithRI);
        }
        if (source.SPDeductionRate != null) {
            this.SPDeductionRate = new String(source.SPDeductionRate);
        }
        if (source.SPDeduction != null) {
            this.SPDeduction = new String(source.SPDeduction);
        }
        if (source.OriginalCostWithSP != null) {
            this.OriginalCostWithSP = new String(source.OriginalCostWithSP);
        }
        if (source.BlendedDiscount != null) {
            this.BlendedDiscount = new String(source.BlendedDiscount);
        }
        if (source.ComponentConfig != null) {
            this.ComponentConfig = new BillDetailComponentConfig[source.ComponentConfig.length];
            for (int i = 0; i < source.ComponentConfig.length; i++) {
                this.ComponentConfig[i] = new BillDetailComponentConfig(source.ComponentConfig[i]);
            }
        }
        if (source.TaxRate != null) {
            this.TaxRate = new String(source.TaxRate);
        }
        if (source.TaxAmount != null) {
            this.TaxAmount = new String(source.TaxAmount);
        }
        if (source.Currency != null) {
            this.Currency = new String(source.Currency);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ComponentCodeName", this.ComponentCodeName);
        this.setParamSimple(map, prefix + "ItemCodeName", this.ItemCodeName);
        this.setParamSimple(map, prefix + "SinglePrice", this.SinglePrice);
        this.setParamSimple(map, prefix + "SpecifiedPrice", this.SpecifiedPrice);
        this.setParamSimple(map, prefix + "PriceUnit", this.PriceUnit);
        this.setParamSimple(map, prefix + "UsedAmount", this.UsedAmount);
        this.setParamSimple(map, prefix + "UsedAmountUnit", this.UsedAmountUnit);
        this.setParamSimple(map, prefix + "RealTotalMeasure", this.RealTotalMeasure);
        this.setParamSimple(map, prefix + "DeductedMeasure", this.DeductedMeasure);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "TimeUnitName", this.TimeUnitName);
        this.setParamSimple(map, prefix + "Cost", this.Cost);
        this.setParamSimple(map, prefix + "Discount", this.Discount);
        this.setParamSimple(map, prefix + "ReduceType", this.ReduceType);
        this.setParamSimple(map, prefix + "RealCost", this.RealCost);
        this.setParamSimple(map, prefix + "VoucherPayAmount", this.VoucherPayAmount);
        this.setParamSimple(map, prefix + "CashPayAmount", this.CashPayAmount);
        this.setParamSimple(map, prefix + "IncentivePayAmount", this.IncentivePayAmount);
        this.setParamSimple(map, prefix + "TransferPayAmount", this.TransferPayAmount);
        this.setParamSimple(map, prefix + "ItemCode", this.ItemCode);
        this.setParamSimple(map, prefix + "ComponentCode", this.ComponentCode);
        this.setParamSimple(map, prefix + "ContractPrice", this.ContractPrice);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "RiTimeSpan", this.RiTimeSpan);
        this.setParamSimple(map, prefix + "OriginalCostWithRI", this.OriginalCostWithRI);
        this.setParamSimple(map, prefix + "SPDeductionRate", this.SPDeductionRate);
        this.setParamSimple(map, prefix + "SPDeduction", this.SPDeduction);
        this.setParamSimple(map, prefix + "OriginalCostWithSP", this.OriginalCostWithSP);
        this.setParamSimple(map, prefix + "BlendedDiscount", this.BlendedDiscount);
        this.setParamArrayObj(map, prefix + "ComponentConfig.", this.ComponentConfig);
        this.setParamSimple(map, prefix + "TaxRate", this.TaxRate);
        this.setParamSimple(map, prefix + "TaxAmount", this.TaxAmount);
        this.setParamSimple(map, prefix + "Currency", this.Currency);

    }
}


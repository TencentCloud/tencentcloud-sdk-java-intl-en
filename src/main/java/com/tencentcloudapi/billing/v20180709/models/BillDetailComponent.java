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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BillDetailComponent extends AbstractModel{

    /**
    * Component type: type of a resource component, e.g. memory, disk, etc.
    */
    @SerializedName("ComponentCodeName")
    @Expose
    private String ComponentCodeName;

    /**
    * Component name: name of a resource component, e.g. TencentDB for MySQL-memory
    */
    @SerializedName("ItemCodeName")
    @Expose
    private String ItemCodeName;

    /**
    * Component published price: original price of a resource component with the original granularity
    */
    @SerializedName("SinglePrice")
    @Expose
    private String SinglePrice;

    /**
    * Specified price of the component
    */
    @SerializedName("SpecifiedPrice")
    @Expose
    private String SpecifiedPrice;

    /**
    * Price unit
    */
    @SerializedName("PriceUnit")
    @Expose
    private String PriceUnit;

    /**
    * Component usage
    */
    @SerializedName("UsedAmount")
    @Expose
    private String UsedAmount;

    /**
    * Component usage unit
    */
    @SerializedName("UsedAmountUnit")
    @Expose
    private String UsedAmountUnit;

    /**
    * Usage period
    */
    @SerializedName("TimeSpan")
    @Expose
    private String TimeSpan;

    /**
    * Time unit
    */
    @SerializedName("TimeUnitName")
    @Expose
    private String TimeUnitName;

    /**
    * Original price of the component
    */
    @SerializedName("Cost")
    @Expose
    private String Cost;

    /**
    * Discount rate
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
    * Total discounted price
    */
    @SerializedName("RealCost")
    @Expose
    private String RealCost;

    /**
    * Amount paid in voucher
    */
    @SerializedName("VoucherPayAmount")
    @Expose
    private String VoucherPayAmount;

    /**
    * Amount paid in cash
    */
    @SerializedName("CashPayAmount")
    @Expose
    private String CashPayAmount;

    /**
    * Amount paid in trial credit
    */
    @SerializedName("IncentivePayAmount")
    @Expose
    private String IncentivePayAmount;

    /**
    * Component type code
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ItemCode")
    @Expose
    private String ItemCode;

    /**
    * Component code
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ComponentCode")
    @Expose
    private String ComponentCode;

    /**
    * Contract price
    */
    @SerializedName("ContractPrice")
    @Expose
    private String ContractPrice;

    /**
    * The special instance (resource pack, reserved instance, savings plan, or spot instance) that is applied to deduction. Valid values:
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * The usage duration deducted by a reserved instance. The unit of measurement for deduction is the same as that for usage duration.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("RiTimeSpan")
    @Expose
    private String RiTimeSpan;

    /**
    * The amount deducted by a reserved instance based on the original component cost.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("OriginalCostWithRI")
    @Expose
    private String OriginalCostWithRI;

    /**
    * The discount multiplier that applies to the component based on the remaining commitment of the savings plan.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("SPDeductionRate")
    @Expose
    private String SPDeductionRate;

    /**
    * The savings plan deduction amount.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("SPDeduction")
    @Expose
    private String SPDeduction;

    /**
    * The amount deducted by a savings plan based on the original component cost.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("OriginalCostWithSP")
    @Expose
    private String OriginalCostWithSP;

    /**
    * The blended discount multiplier that combines the official website discount, reserved instance discount, and savings plan discount. If no reserved instance and savings plan discounts are available, the blended discount multiplier equals the discount multiplier.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("BlendedDiscount")
    @Expose
    private String BlendedDiscount;

    /**
     * Get Component type: type of a resource component, e.g. memory, disk, etc. 
     * @return ComponentCodeName Component type: type of a resource component, e.g. memory, disk, etc.
     */
    public String getComponentCodeName() {
        return this.ComponentCodeName;
    }

    /**
     * Set Component type: type of a resource component, e.g. memory, disk, etc.
     * @param ComponentCodeName Component type: type of a resource component, e.g. memory, disk, etc.
     */
    public void setComponentCodeName(String ComponentCodeName) {
        this.ComponentCodeName = ComponentCodeName;
    }

    /**
     * Get Component name: name of a resource component, e.g. TencentDB for MySQL-memory 
     * @return ItemCodeName Component name: name of a resource component, e.g. TencentDB for MySQL-memory
     */
    public String getItemCodeName() {
        return this.ItemCodeName;
    }

    /**
     * Set Component name: name of a resource component, e.g. TencentDB for MySQL-memory
     * @param ItemCodeName Component name: name of a resource component, e.g. TencentDB for MySQL-memory
     */
    public void setItemCodeName(String ItemCodeName) {
        this.ItemCodeName = ItemCodeName;
    }

    /**
     * Get Component published price: original price of a resource component with the original granularity 
     * @return SinglePrice Component published price: original price of a resource component with the original granularity
     */
    public String getSinglePrice() {
        return this.SinglePrice;
    }

    /**
     * Set Component published price: original price of a resource component with the original granularity
     * @param SinglePrice Component published price: original price of a resource component with the original granularity
     */
    public void setSinglePrice(String SinglePrice) {
        this.SinglePrice = SinglePrice;
    }

    /**
     * Get Specified price of the component 
     * @return SpecifiedPrice Specified price of the component
     */
    public String getSpecifiedPrice() {
        return this.SpecifiedPrice;
    }

    /**
     * Set Specified price of the component
     * @param SpecifiedPrice Specified price of the component
     */
    public void setSpecifiedPrice(String SpecifiedPrice) {
        this.SpecifiedPrice = SpecifiedPrice;
    }

    /**
     * Get Price unit 
     * @return PriceUnit Price unit
     */
    public String getPriceUnit() {
        return this.PriceUnit;
    }

    /**
     * Set Price unit
     * @param PriceUnit Price unit
     */
    public void setPriceUnit(String PriceUnit) {
        this.PriceUnit = PriceUnit;
    }

    /**
     * Get Component usage 
     * @return UsedAmount Component usage
     */
    public String getUsedAmount() {
        return this.UsedAmount;
    }

    /**
     * Set Component usage
     * @param UsedAmount Component usage
     */
    public void setUsedAmount(String UsedAmount) {
        this.UsedAmount = UsedAmount;
    }

    /**
     * Get Component usage unit 
     * @return UsedAmountUnit Component usage unit
     */
    public String getUsedAmountUnit() {
        return this.UsedAmountUnit;
    }

    /**
     * Set Component usage unit
     * @param UsedAmountUnit Component usage unit
     */
    public void setUsedAmountUnit(String UsedAmountUnit) {
        this.UsedAmountUnit = UsedAmountUnit;
    }

    /**
     * Get Usage period 
     * @return TimeSpan Usage period
     */
    public String getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set Usage period
     * @param TimeSpan Usage period
     */
    public void setTimeSpan(String TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get Time unit 
     * @return TimeUnitName Time unit
     */
    public String getTimeUnitName() {
        return this.TimeUnitName;
    }

    /**
     * Set Time unit
     * @param TimeUnitName Time unit
     */
    public void setTimeUnitName(String TimeUnitName) {
        this.TimeUnitName = TimeUnitName;
    }

    /**
     * Get Original price of the component 
     * @return Cost Original price of the component
     */
    public String getCost() {
        return this.Cost;
    }

    /**
     * Set Original price of the component
     * @param Cost Original price of the component
     */
    public void setCost(String Cost) {
        this.Cost = Cost;
    }

    /**
     * Get Discount rate 
     * @return Discount Discount rate
     */
    public String getDiscount() {
        return this.Discount;
    }

    /**
     * Set Discount rate
     * @param Discount Discount rate
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
     * Get Total discounted price 
     * @return RealCost Total discounted price
     */
    public String getRealCost() {
        return this.RealCost;
    }

    /**
     * Set Total discounted price
     * @param RealCost Total discounted price
     */
    public void setRealCost(String RealCost) {
        this.RealCost = RealCost;
    }

    /**
     * Get Amount paid in voucher 
     * @return VoucherPayAmount Amount paid in voucher
     */
    public String getVoucherPayAmount() {
        return this.VoucherPayAmount;
    }

    /**
     * Set Amount paid in voucher
     * @param VoucherPayAmount Amount paid in voucher
     */
    public void setVoucherPayAmount(String VoucherPayAmount) {
        this.VoucherPayAmount = VoucherPayAmount;
    }

    /**
     * Get Amount paid in cash 
     * @return CashPayAmount Amount paid in cash
     */
    public String getCashPayAmount() {
        return this.CashPayAmount;
    }

    /**
     * Set Amount paid in cash
     * @param CashPayAmount Amount paid in cash
     */
    public void setCashPayAmount(String CashPayAmount) {
        this.CashPayAmount = CashPayAmount;
    }

    /**
     * Get Amount paid in trial credit 
     * @return IncentivePayAmount Amount paid in trial credit
     */
    public String getIncentivePayAmount() {
        return this.IncentivePayAmount;
    }

    /**
     * Set Amount paid in trial credit
     * @param IncentivePayAmount Amount paid in trial credit
     */
    public void setIncentivePayAmount(String IncentivePayAmount) {
        this.IncentivePayAmount = IncentivePayAmount;
    }

    /**
     * Get Component type code
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ItemCode Component type code
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getItemCode() {
        return this.ItemCode;
    }

    /**
     * Set Component type code
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ItemCode Component type code
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setItemCode(String ItemCode) {
        this.ItemCode = ItemCode;
    }

    /**
     * Get Component code
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ComponentCode Component code
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getComponentCode() {
        return this.ComponentCode;
    }

    /**
     * Set Component code
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ComponentCode Component code
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setComponentCode(String ComponentCode) {
        this.ComponentCode = ComponentCode;
    }

    /**
     * Get Contract price 
     * @return ContractPrice Contract price
     */
    public String getContractPrice() {
        return this.ContractPrice;
    }

    /**
     * Set Contract price
     * @param ContractPrice Contract price
     */
    public void setContractPrice(String ContractPrice) {
        this.ContractPrice = ContractPrice;
    }

    /**
     * Get The special instance (resource pack, reserved instance, savings plan, or spot instance) that is applied to deduction. Valid values:
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return InstanceType The special instance (resource pack, reserved instance, savings plan, or spot instance) that is applied to deduction. Valid values:
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set The special instance (resource pack, reserved instance, savings plan, or spot instance) that is applied to deduction. Valid values:
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param InstanceType The special instance (resource pack, reserved instance, savings plan, or spot instance) that is applied to deduction. Valid values:
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get The usage duration deducted by a reserved instance. The unit of measurement for deduction is the same as that for usage duration.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return RiTimeSpan The usage duration deducted by a reserved instance. The unit of measurement for deduction is the same as that for usage duration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getRiTimeSpan() {
        return this.RiTimeSpan;
    }

    /**
     * Set The usage duration deducted by a reserved instance. The unit of measurement for deduction is the same as that for usage duration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param RiTimeSpan The usage duration deducted by a reserved instance. The unit of measurement for deduction is the same as that for usage duration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setRiTimeSpan(String RiTimeSpan) {
        this.RiTimeSpan = RiTimeSpan;
    }

    /**
     * Get The amount deducted by a reserved instance based on the original component cost.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return OriginalCostWithRI The amount deducted by a reserved instance based on the original component cost.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getOriginalCostWithRI() {
        return this.OriginalCostWithRI;
    }

    /**
     * Set The amount deducted by a reserved instance based on the original component cost.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param OriginalCostWithRI The amount deducted by a reserved instance based on the original component cost.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setOriginalCostWithRI(String OriginalCostWithRI) {
        this.OriginalCostWithRI = OriginalCostWithRI;
    }

    /**
     * Get The discount multiplier that applies to the component based on the remaining commitment of the savings plan.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return SPDeductionRate The discount multiplier that applies to the component based on the remaining commitment of the savings plan.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getSPDeductionRate() {
        return this.SPDeductionRate;
    }

    /**
     * Set The discount multiplier that applies to the component based on the remaining commitment of the savings plan.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param SPDeductionRate The discount multiplier that applies to the component based on the remaining commitment of the savings plan.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setSPDeductionRate(String SPDeductionRate) {
        this.SPDeductionRate = SPDeductionRate;
    }

    /**
     * Get The savings plan deduction amount.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return SPDeduction The savings plan deduction amount.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getSPDeduction() {
        return this.SPDeduction;
    }

    /**
     * Set The savings plan deduction amount.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param SPDeduction The savings plan deduction amount.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setSPDeduction(String SPDeduction) {
        this.SPDeduction = SPDeduction;
    }

    /**
     * Get The amount deducted by a savings plan based on the original component cost.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return OriginalCostWithSP The amount deducted by a savings plan based on the original component cost.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getOriginalCostWithSP() {
        return this.OriginalCostWithSP;
    }

    /**
     * Set The amount deducted by a savings plan based on the original component cost.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param OriginalCostWithSP The amount deducted by a savings plan based on the original component cost.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setOriginalCostWithSP(String OriginalCostWithSP) {
        this.OriginalCostWithSP = OriginalCostWithSP;
    }

    /**
     * Get The blended discount multiplier that combines the official website discount, reserved instance discount, and savings plan discount. If no reserved instance and savings plan discounts are available, the blended discount multiplier equals the discount multiplier.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return BlendedDiscount The blended discount multiplier that combines the official website discount, reserved instance discount, and savings plan discount. If no reserved instance and savings plan discounts are available, the blended discount multiplier equals the discount multiplier.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getBlendedDiscount() {
        return this.BlendedDiscount;
    }

    /**
     * Set The blended discount multiplier that combines the official website discount, reserved instance discount, and savings plan discount. If no reserved instance and savings plan discounts are available, the blended discount multiplier equals the discount multiplier.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param BlendedDiscount The blended discount multiplier that combines the official website discount, reserved instance discount, and savings plan discount. If no reserved instance and savings plan discounts are available, the blended discount multiplier equals the discount multiplier.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setBlendedDiscount(String BlendedDiscount) {
        this.BlendedDiscount = BlendedDiscount;
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
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "TimeUnitName", this.TimeUnitName);
        this.setParamSimple(map, prefix + "Cost", this.Cost);
        this.setParamSimple(map, prefix + "Discount", this.Discount);
        this.setParamSimple(map, prefix + "ReduceType", this.ReduceType);
        this.setParamSimple(map, prefix + "RealCost", this.RealCost);
        this.setParamSimple(map, prefix + "VoucherPayAmount", this.VoucherPayAmount);
        this.setParamSimple(map, prefix + "CashPayAmount", this.CashPayAmount);
        this.setParamSimple(map, prefix + "IncentivePayAmount", this.IncentivePayAmount);
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

    }
}


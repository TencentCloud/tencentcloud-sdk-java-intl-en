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
    * Component type/code (optional)
    */
    @SerializedName("ItemCode")
    @Expose
    private String ItemCode;

    /**
    * Component name/code (optional)
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
     * Get Component type/code (optional) 
     * @return ItemCode Component type/code (optional)
     */
    public String getItemCode() {
        return this.ItemCode;
    }

    /**
     * Set Component type/code (optional)
     * @param ItemCode Component type/code (optional)
     */
    public void setItemCode(String ItemCode) {
        this.ItemCode = ItemCode;
    }

    /**
     * Get Component name/code (optional) 
     * @return ComponentCode Component name/code (optional)
     */
    public String getComponentCode() {
        return this.ComponentCode;
    }

    /**
     * Set Component name/code (optional)
     * @param ComponentCode Component name/code (optional)
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

    }
}


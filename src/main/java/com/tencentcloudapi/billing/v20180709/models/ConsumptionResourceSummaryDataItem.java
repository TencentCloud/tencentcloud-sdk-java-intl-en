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

public class ConsumptionResourceSummaryDataItem extends AbstractModel {

    /**
    * Resource ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * Resource name
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * Discounted total price
    */
    @SerializedName("RealTotalCost")
    @Expose
    private String RealTotalCost;

    /**
    * Cash expenditure
    */
    @SerializedName("CashPayAmount")
    @Expose
    private String CashPayAmount;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Project name
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * Region ID
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * Region name
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * Payment mode
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * Payment mode name
    */
    @SerializedName("PayModeName")
    @Expose
    private String PayModeName;

    /**
    * Product name code
    */
    @SerializedName("BusinessCode")
    @Expose
    private String BusinessCode;

    /**
    * Product name
    */
    @SerializedName("BusinessCodeName")
    @Expose
    private String BusinessCodeName;

    /**
    * Consumption type
    */
    @SerializedName("ConsumptionTypeName")
    @Expose
    private String ConsumptionTypeName;

    /**
    * Original price
    */
    @SerializedName("RealCost")
    @Expose
    private String RealCost;

    /**
    * Fee start time
    */
    @SerializedName("FeeBeginTime")
    @Expose
    private String FeeBeginTime;

    /**
    * End time of fees
    */
    @SerializedName("FeeEndTime")
    @Expose
    private String FeeEndTime;

    /**
    * Days
    */
    @SerializedName("DayDiff")
    @Expose
    private String DayDiff;

    /**
    * Daily consumption
    */
    @SerializedName("DailyTotalCost")
    @Expose
    private String DailyTotalCost;

    /**
    * Order ID
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * Voucher
    */
    @SerializedName("VoucherPayAmount")
    @Expose
    private String VoucherPayAmount;

    /**
    * Bonus
    */
    @SerializedName("IncentivePayAmount")
    @Expose
    private String IncentivePayAmount;

    /**
    * Royalty amount
    */
    @SerializedName("TransferPayAmount")
    @Expose
    private String TransferPayAmount;

    /**
    * Tax
    */
    @SerializedName("Tax")
    @Expose
    private String Tax;

    /**
    * tax rate
    */
    @SerializedName("TaxRate")
    @Expose
    private String TaxRate;

    /**
    * Cash payment (pre-tax)
    */
    @SerializedName("AmountBeforeTax")
    @Expose
    private String AmountBeforeTax;

    /**
    * Payer UIN: Account ID of the payer, which is the unique account identifier for the user in Tencent Cloud.
    */
    @SerializedName("PayerUin")
    @Expose
    private String PayerUin;

    /**
    * User UIN: Account ID of the actual resource user
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * Operator UIN: Operator account ID (ID of the operator who places orders for prepaid resources or activates postpaid resource account, or role ID).
    */
    @SerializedName("OperateUin")
    @Expose
    private String OperateUin;

    /**
    * Subproduct code
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
    * Subproduct name: Product subdivision type purchased by the user, such as Cloud Virtual Machine (CVM)-Standard Type S1
    */
    @SerializedName("ProductCodeName")
    @Expose
    private String ProductCodeName;

    /**
    * Region type
    */
    @SerializedName("RegionType")
    @Expose
    private String RegionType;

    /**
    * Region type name.
    */
    @SerializedName("RegionTypeName")
    @Expose
    private String RegionTypeName;

    /**
    * Extension Field 1
    */
    @SerializedName("Extend1")
    @Expose
    private String Extend1;

    /**
    * Extension Field 2
    */
    @SerializedName("Extend2")
    @Expose
    private String Extend2;

    /**
    * Extension Field 3
    */
    @SerializedName("Extend3")
    @Expose
    private String Extend3;

    /**
    * Extension Field 4
    */
    @SerializedName("Extend4")
    @Expose
    private String Extend4;

    /**
    * Extension Field 5
    */
    @SerializedName("Extend5")
    @Expose
    private String Extend5;

    /**
    * Instance type
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Instance Type Name
    */
    @SerializedName("InstanceTypeName")
    @Expose
    private String InstanceTypeName;

    /**
    * Deduction time: Deduction time
    */
    @SerializedName("PayTime")
    @Expose
    private String PayTime;

    /**
    * Availability zone: The availability zone where the resource is located, such as Guangzhou Zone 3.
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * Describing Configurations
    */
    @SerializedName("ComponentConfig")
    @Expose
    private String ComponentConfig;

    /**
    * Tag information.
    */
    @SerializedName("Tags")
    @Expose
    private String Tags;

    /**
     * Get Resource ID 
     * @return ResourceId Resource ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Resource ID
     * @param ResourceId Resource ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get Resource name 
     * @return ResourceName Resource name
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set Resource name
     * @param ResourceName Resource name
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get Discounted total price 
     * @return RealTotalCost Discounted total price
     */
    public String getRealTotalCost() {
        return this.RealTotalCost;
    }

    /**
     * Set Discounted total price
     * @param RealTotalCost Discounted total price
     */
    public void setRealTotalCost(String RealTotalCost) {
        this.RealTotalCost = RealTotalCost;
    }

    /**
     * Get Cash expenditure 
     * @return CashPayAmount Cash expenditure
     */
    public String getCashPayAmount() {
        return this.CashPayAmount;
    }

    /**
     * Set Cash expenditure
     * @param CashPayAmount Cash expenditure
     */
    public void setCashPayAmount(String CashPayAmount) {
        this.CashPayAmount = CashPayAmount;
    }

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Project name 
     * @return ProjectName Project name
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set Project name
     * @param ProjectName Project name
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get Region ID 
     * @return RegionId Region ID
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Region ID
     * @param RegionId Region ID
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get Region name 
     * @return RegionName Region name
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set Region name
     * @param RegionName Region name
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get Payment mode 
     * @return PayMode Payment mode
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Payment mode
     * @param PayMode Payment mode
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Payment mode name 
     * @return PayModeName Payment mode name
     */
    public String getPayModeName() {
        return this.PayModeName;
    }

    /**
     * Set Payment mode name
     * @param PayModeName Payment mode name
     */
    public void setPayModeName(String PayModeName) {
        this.PayModeName = PayModeName;
    }

    /**
     * Get Product name code 
     * @return BusinessCode Product name code
     */
    public String getBusinessCode() {
        return this.BusinessCode;
    }

    /**
     * Set Product name code
     * @param BusinessCode Product name code
     */
    public void setBusinessCode(String BusinessCode) {
        this.BusinessCode = BusinessCode;
    }

    /**
     * Get Product name 
     * @return BusinessCodeName Product name
     */
    public String getBusinessCodeName() {
        return this.BusinessCodeName;
    }

    /**
     * Set Product name
     * @param BusinessCodeName Product name
     */
    public void setBusinessCodeName(String BusinessCodeName) {
        this.BusinessCodeName = BusinessCodeName;
    }

    /**
     * Get Consumption type 
     * @return ConsumptionTypeName Consumption type
     */
    public String getConsumptionTypeName() {
        return this.ConsumptionTypeName;
    }

    /**
     * Set Consumption type
     * @param ConsumptionTypeName Consumption type
     */
    public void setConsumptionTypeName(String ConsumptionTypeName) {
        this.ConsumptionTypeName = ConsumptionTypeName;
    }

    /**
     * Get Original price 
     * @return RealCost Original price
     */
    public String getRealCost() {
        return this.RealCost;
    }

    /**
     * Set Original price
     * @param RealCost Original price
     */
    public void setRealCost(String RealCost) {
        this.RealCost = RealCost;
    }

    /**
     * Get Fee start time 
     * @return FeeBeginTime Fee start time
     */
    public String getFeeBeginTime() {
        return this.FeeBeginTime;
    }

    /**
     * Set Fee start time
     * @param FeeBeginTime Fee start time
     */
    public void setFeeBeginTime(String FeeBeginTime) {
        this.FeeBeginTime = FeeBeginTime;
    }

    /**
     * Get End time of fees 
     * @return FeeEndTime End time of fees
     */
    public String getFeeEndTime() {
        return this.FeeEndTime;
    }

    /**
     * Set End time of fees
     * @param FeeEndTime End time of fees
     */
    public void setFeeEndTime(String FeeEndTime) {
        this.FeeEndTime = FeeEndTime;
    }

    /**
     * Get Days 
     * @return DayDiff Days
     */
    public String getDayDiff() {
        return this.DayDiff;
    }

    /**
     * Set Days
     * @param DayDiff Days
     */
    public void setDayDiff(String DayDiff) {
        this.DayDiff = DayDiff;
    }

    /**
     * Get Daily consumption 
     * @return DailyTotalCost Daily consumption
     */
    public String getDailyTotalCost() {
        return this.DailyTotalCost;
    }

    /**
     * Set Daily consumption
     * @param DailyTotalCost Daily consumption
     */
    public void setDailyTotalCost(String DailyTotalCost) {
        this.DailyTotalCost = DailyTotalCost;
    }

    /**
     * Get Order ID 
     * @return OrderId Order ID
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set Order ID
     * @param OrderId Order ID
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get Voucher 
     * @return VoucherPayAmount Voucher
     */
    public String getVoucherPayAmount() {
        return this.VoucherPayAmount;
    }

    /**
     * Set Voucher
     * @param VoucherPayAmount Voucher
     */
    public void setVoucherPayAmount(String VoucherPayAmount) {
        this.VoucherPayAmount = VoucherPayAmount;
    }

    /**
     * Get Bonus 
     * @return IncentivePayAmount Bonus
     */
    public String getIncentivePayAmount() {
        return this.IncentivePayAmount;
    }

    /**
     * Set Bonus
     * @param IncentivePayAmount Bonus
     */
    public void setIncentivePayAmount(String IncentivePayAmount) {
        this.IncentivePayAmount = IncentivePayAmount;
    }

    /**
     * Get Royalty amount 
     * @return TransferPayAmount Royalty amount
     */
    public String getTransferPayAmount() {
        return this.TransferPayAmount;
    }

    /**
     * Set Royalty amount
     * @param TransferPayAmount Royalty amount
     */
    public void setTransferPayAmount(String TransferPayAmount) {
        this.TransferPayAmount = TransferPayAmount;
    }

    /**
     * Get Tax 
     * @return Tax Tax
     */
    public String getTax() {
        return this.Tax;
    }

    /**
     * Set Tax
     * @param Tax Tax
     */
    public void setTax(String Tax) {
        this.Tax = Tax;
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
     * Get Cash payment (pre-tax) 
     * @return AmountBeforeTax Cash payment (pre-tax)
     */
    public String getAmountBeforeTax() {
        return this.AmountBeforeTax;
    }

    /**
     * Set Cash payment (pre-tax)
     * @param AmountBeforeTax Cash payment (pre-tax)
     */
    public void setAmountBeforeTax(String AmountBeforeTax) {
        this.AmountBeforeTax = AmountBeforeTax;
    }

    /**
     * Get Payer UIN: Account ID of the payer, which is the unique account identifier for the user in Tencent Cloud. 
     * @return PayerUin Payer UIN: Account ID of the payer, which is the unique account identifier for the user in Tencent Cloud.
     */
    public String getPayerUin() {
        return this.PayerUin;
    }

    /**
     * Set Payer UIN: Account ID of the payer, which is the unique account identifier for the user in Tencent Cloud.
     * @param PayerUin Payer UIN: Account ID of the payer, which is the unique account identifier for the user in Tencent Cloud.
     */
    public void setPayerUin(String PayerUin) {
        this.PayerUin = PayerUin;
    }

    /**
     * Get User UIN: Account ID of the actual resource user 
     * @return OwnerUin User UIN: Account ID of the actual resource user
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set User UIN: Account ID of the actual resource user
     * @param OwnerUin User UIN: Account ID of the actual resource user
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get Operator UIN: Operator account ID (ID of the operator who places orders for prepaid resources or activates postpaid resource account, or role ID). 
     * @return OperateUin Operator UIN: Operator account ID (ID of the operator who places orders for prepaid resources or activates postpaid resource account, or role ID).
     */
    public String getOperateUin() {
        return this.OperateUin;
    }

    /**
     * Set Operator UIN: Operator account ID (ID of the operator who places orders for prepaid resources or activates postpaid resource account, or role ID).
     * @param OperateUin Operator UIN: Operator account ID (ID of the operator who places orders for prepaid resources or activates postpaid resource account, or role ID).
     */
    public void setOperateUin(String OperateUin) {
        this.OperateUin = OperateUin;
    }

    /**
     * Get Subproduct code 
     * @return ProductCode Subproduct code
     */
    public String getProductCode() {
        return this.ProductCode;
    }

    /**
     * Set Subproduct code
     * @param ProductCode Subproduct code
     */
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    /**
     * Get Subproduct name: Product subdivision type purchased by the user, such as Cloud Virtual Machine (CVM)-Standard Type S1 
     * @return ProductCodeName Subproduct name: Product subdivision type purchased by the user, such as Cloud Virtual Machine (CVM)-Standard Type S1
     */
    public String getProductCodeName() {
        return this.ProductCodeName;
    }

    /**
     * Set Subproduct name: Product subdivision type purchased by the user, such as Cloud Virtual Machine (CVM)-Standard Type S1
     * @param ProductCodeName Subproduct name: Product subdivision type purchased by the user, such as Cloud Virtual Machine (CVM)-Standard Type S1
     */
    public void setProductCodeName(String ProductCodeName) {
        this.ProductCodeName = ProductCodeName;
    }

    /**
     * Get Region type 
     * @return RegionType Region type
     */
    public String getRegionType() {
        return this.RegionType;
    }

    /**
     * Set Region type
     * @param RegionType Region type
     */
    public void setRegionType(String RegionType) {
        this.RegionType = RegionType;
    }

    /**
     * Get Region type name. 
     * @return RegionTypeName Region type name.
     */
    public String getRegionTypeName() {
        return this.RegionTypeName;
    }

    /**
     * Set Region type name.
     * @param RegionTypeName Region type name.
     */
    public void setRegionTypeName(String RegionTypeName) {
        this.RegionTypeName = RegionTypeName;
    }

    /**
     * Get Extension Field 1 
     * @return Extend1 Extension Field 1
     */
    public String getExtend1() {
        return this.Extend1;
    }

    /**
     * Set Extension Field 1
     * @param Extend1 Extension Field 1
     */
    public void setExtend1(String Extend1) {
        this.Extend1 = Extend1;
    }

    /**
     * Get Extension Field 2 
     * @return Extend2 Extension Field 2
     */
    public String getExtend2() {
        return this.Extend2;
    }

    /**
     * Set Extension Field 2
     * @param Extend2 Extension Field 2
     */
    public void setExtend2(String Extend2) {
        this.Extend2 = Extend2;
    }

    /**
     * Get Extension Field 3 
     * @return Extend3 Extension Field 3
     */
    public String getExtend3() {
        return this.Extend3;
    }

    /**
     * Set Extension Field 3
     * @param Extend3 Extension Field 3
     */
    public void setExtend3(String Extend3) {
        this.Extend3 = Extend3;
    }

    /**
     * Get Extension Field 4 
     * @return Extend4 Extension Field 4
     */
    public String getExtend4() {
        return this.Extend4;
    }

    /**
     * Set Extension Field 4
     * @param Extend4 Extension Field 4
     */
    public void setExtend4(String Extend4) {
        this.Extend4 = Extend4;
    }

    /**
     * Get Extension Field 5 
     * @return Extend5 Extension Field 5
     */
    public String getExtend5() {
        return this.Extend5;
    }

    /**
     * Set Extension Field 5
     * @param Extend5 Extension Field 5
     */
    public void setExtend5(String Extend5) {
        this.Extend5 = Extend5;
    }

    /**
     * Get Instance type 
     * @return InstanceType Instance type
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance type
     * @param InstanceType Instance type
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Instance Type Name 
     * @return InstanceTypeName Instance Type Name
     */
    public String getInstanceTypeName() {
        return this.InstanceTypeName;
    }

    /**
     * Set Instance Type Name
     * @param InstanceTypeName Instance Type Name
     */
    public void setInstanceTypeName(String InstanceTypeName) {
        this.InstanceTypeName = InstanceTypeName;
    }

    /**
     * Get Deduction time: Deduction time 
     * @return PayTime Deduction time: Deduction time
     */
    public String getPayTime() {
        return this.PayTime;
    }

    /**
     * Set Deduction time: Deduction time
     * @param PayTime Deduction time: Deduction time
     */
    public void setPayTime(String PayTime) {
        this.PayTime = PayTime;
    }

    /**
     * Get Availability zone: The availability zone where the resource is located, such as Guangzhou Zone 3. 
     * @return ZoneName Availability zone: The availability zone where the resource is located, such as Guangzhou Zone 3.
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set Availability zone: The availability zone where the resource is located, such as Guangzhou Zone 3.
     * @param ZoneName Availability zone: The availability zone where the resource is located, such as Guangzhou Zone 3.
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get Describing Configurations 
     * @return ComponentConfig Describing Configurations
     */
    public String getComponentConfig() {
        return this.ComponentConfig;
    }

    /**
     * Set Describing Configurations
     * @param ComponentConfig Describing Configurations
     */
    public void setComponentConfig(String ComponentConfig) {
        this.ComponentConfig = ComponentConfig;
    }

    /**
     * Get Tag information. 
     * @return Tags Tag information.
     */
    public String getTags() {
        return this.Tags;
    }

    /**
     * Set Tag information.
     * @param Tags Tag information.
     */
    public void setTags(String Tags) {
        this.Tags = Tags;
    }

    public ConsumptionResourceSummaryDataItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConsumptionResourceSummaryDataItem(ConsumptionResourceSummaryDataItem source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.RealTotalCost != null) {
            this.RealTotalCost = new String(source.RealTotalCost);
        }
        if (source.CashPayAmount != null) {
            this.CashPayAmount = new String(source.CashPayAmount);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.RegionId != null) {
            this.RegionId = new String(source.RegionId);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.PayModeName != null) {
            this.PayModeName = new String(source.PayModeName);
        }
        if (source.BusinessCode != null) {
            this.BusinessCode = new String(source.BusinessCode);
        }
        if (source.BusinessCodeName != null) {
            this.BusinessCodeName = new String(source.BusinessCodeName);
        }
        if (source.ConsumptionTypeName != null) {
            this.ConsumptionTypeName = new String(source.ConsumptionTypeName);
        }
        if (source.RealCost != null) {
            this.RealCost = new String(source.RealCost);
        }
        if (source.FeeBeginTime != null) {
            this.FeeBeginTime = new String(source.FeeBeginTime);
        }
        if (source.FeeEndTime != null) {
            this.FeeEndTime = new String(source.FeeEndTime);
        }
        if (source.DayDiff != null) {
            this.DayDiff = new String(source.DayDiff);
        }
        if (source.DailyTotalCost != null) {
            this.DailyTotalCost = new String(source.DailyTotalCost);
        }
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
        if (source.VoucherPayAmount != null) {
            this.VoucherPayAmount = new String(source.VoucherPayAmount);
        }
        if (source.IncentivePayAmount != null) {
            this.IncentivePayAmount = new String(source.IncentivePayAmount);
        }
        if (source.TransferPayAmount != null) {
            this.TransferPayAmount = new String(source.TransferPayAmount);
        }
        if (source.Tax != null) {
            this.Tax = new String(source.Tax);
        }
        if (source.TaxRate != null) {
            this.TaxRate = new String(source.TaxRate);
        }
        if (source.AmountBeforeTax != null) {
            this.AmountBeforeTax = new String(source.AmountBeforeTax);
        }
        if (source.PayerUin != null) {
            this.PayerUin = new String(source.PayerUin);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.OperateUin != null) {
            this.OperateUin = new String(source.OperateUin);
        }
        if (source.ProductCode != null) {
            this.ProductCode = new String(source.ProductCode);
        }
        if (source.ProductCodeName != null) {
            this.ProductCodeName = new String(source.ProductCodeName);
        }
        if (source.RegionType != null) {
            this.RegionType = new String(source.RegionType);
        }
        if (source.RegionTypeName != null) {
            this.RegionTypeName = new String(source.RegionTypeName);
        }
        if (source.Extend1 != null) {
            this.Extend1 = new String(source.Extend1);
        }
        if (source.Extend2 != null) {
            this.Extend2 = new String(source.Extend2);
        }
        if (source.Extend3 != null) {
            this.Extend3 = new String(source.Extend3);
        }
        if (source.Extend4 != null) {
            this.Extend4 = new String(source.Extend4);
        }
        if (source.Extend5 != null) {
            this.Extend5 = new String(source.Extend5);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceTypeName != null) {
            this.InstanceTypeName = new String(source.InstanceTypeName);
        }
        if (source.PayTime != null) {
            this.PayTime = new String(source.PayTime);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.ComponentConfig != null) {
            this.ComponentConfig = new String(source.ComponentConfig);
        }
        if (source.Tags != null) {
            this.Tags = new String(source.Tags);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "RealTotalCost", this.RealTotalCost);
        this.setParamSimple(map, prefix + "CashPayAmount", this.CashPayAmount);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "PayModeName", this.PayModeName);
        this.setParamSimple(map, prefix + "BusinessCode", this.BusinessCode);
        this.setParamSimple(map, prefix + "BusinessCodeName", this.BusinessCodeName);
        this.setParamSimple(map, prefix + "ConsumptionTypeName", this.ConsumptionTypeName);
        this.setParamSimple(map, prefix + "RealCost", this.RealCost);
        this.setParamSimple(map, prefix + "FeeBeginTime", this.FeeBeginTime);
        this.setParamSimple(map, prefix + "FeeEndTime", this.FeeEndTime);
        this.setParamSimple(map, prefix + "DayDiff", this.DayDiff);
        this.setParamSimple(map, prefix + "DailyTotalCost", this.DailyTotalCost);
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "VoucherPayAmount", this.VoucherPayAmount);
        this.setParamSimple(map, prefix + "IncentivePayAmount", this.IncentivePayAmount);
        this.setParamSimple(map, prefix + "TransferPayAmount", this.TransferPayAmount);
        this.setParamSimple(map, prefix + "Tax", this.Tax);
        this.setParamSimple(map, prefix + "TaxRate", this.TaxRate);
        this.setParamSimple(map, prefix + "AmountBeforeTax", this.AmountBeforeTax);
        this.setParamSimple(map, prefix + "PayerUin", this.PayerUin);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "OperateUin", this.OperateUin);
        this.setParamSimple(map, prefix + "ProductCode", this.ProductCode);
        this.setParamSimple(map, prefix + "ProductCodeName", this.ProductCodeName);
        this.setParamSimple(map, prefix + "RegionType", this.RegionType);
        this.setParamSimple(map, prefix + "RegionTypeName", this.RegionTypeName);
        this.setParamSimple(map, prefix + "Extend1", this.Extend1);
        this.setParamSimple(map, prefix + "Extend2", this.Extend2);
        this.setParamSimple(map, prefix + "Extend3", this.Extend3);
        this.setParamSimple(map, prefix + "Extend4", this.Extend4);
        this.setParamSimple(map, prefix + "Extend5", this.Extend5);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceTypeName", this.InstanceTypeName);
        this.setParamSimple(map, prefix + "PayTime", this.PayTime);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "ComponentConfig", this.ComponentConfig);
        this.setParamSimple(map, prefix + "Tags", this.Tags);

    }
}


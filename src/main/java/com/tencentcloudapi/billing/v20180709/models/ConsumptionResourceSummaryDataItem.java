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
    * Pre-discount priceNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RealCost")
    @Expose
    private String RealCost;

    /**
    * Start time of feesNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FeeBeginTime")
    @Expose
    private String FeeBeginTime;

    /**
    * End time of feesNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FeeEndTime")
    @Expose
    private String FeeEndTime;

    /**
    * Days
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DayDiff")
    @Expose
    private String DayDiff;

    /**
    * Daily consumptionNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DailyTotalCost")
    @Expose
    private String DailyTotalCost;

    /**
    * Order numberNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * VoucherNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VoucherPayAmount")
    @Expose
    private String VoucherPayAmount;

    /**
    * Bonus
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IncentivePayAmount")
    @Expose
    private String IncentivePayAmount;

    /**
    * Share revenueNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TransferPayAmount")
    @Expose
    private String TransferPayAmount;

    /**
    * Payer UIN: the account ID of the payer, which is the unique identifier of a Tencent Cloud userNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PayerUin")
    @Expose
    private String PayerUin;

    /**
    * User UIN: the account ID of the actual resource userNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * Operator UIN: the account ID or role ID of the operator who places orders for prepaid resources or activates postpaid resourcesNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OperateUin")
    @Expose
    private String OperateUin;

    /**
    * Subproduct codeNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
    * Subproduct name: the subcategory of a product purchased by the user, such as CVM – Standard S1Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProductCodeName")
    @Expose
    private String ProductCodeName;

    /**
    * Region typeNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegionType")
    @Expose
    private String RegionType;

    /**
    * Region type nameNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegionTypeName")
    @Expose
    private String RegionTypeName;

    /**
    * Extended field 1Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Extend1")
    @Expose
    private String Extend1;

    /**
    * Extended field 2Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Extend2")
    @Expose
    private String Extend2;

    /**
    * Extended field 3Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Extend3")
    @Expose
    private String Extend3;

    /**
    * Extended field 4Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Extend4")
    @Expose
    private String Extend4;

    /**
    * Extended field 5Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Extend5")
    @Expose
    private String Extend5;

    /**
    * Instance typeNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Instance type nameNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceTypeName")
    @Expose
    private String InstanceTypeName;

    /**
    * Deduction time: the time at which a payment is deductedNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PayTime")
    @Expose
    private String PayTime;

    /**
    * Availability zone: availability zone of a resource, e.g. Guangzhou Zone 3Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * Configuration descriptionNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ComponentConfig")
    @Expose
    private String ComponentConfig;

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
     * Get Pre-discount priceNote: This field may return null, indicating that no valid values can be obtained. 
     * @return RealCost Pre-discount priceNote: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRealCost() {
        return this.RealCost;
    }

    /**
     * Set Pre-discount priceNote: This field may return null, indicating that no valid values can be obtained.
     * @param RealCost Pre-discount priceNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRealCost(String RealCost) {
        this.RealCost = RealCost;
    }

    /**
     * Get Start time of feesNote: This field may return null, indicating that no valid values can be obtained. 
     * @return FeeBeginTime Start time of feesNote: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFeeBeginTime() {
        return this.FeeBeginTime;
    }

    /**
     * Set Start time of feesNote: This field may return null, indicating that no valid values can be obtained.
     * @param FeeBeginTime Start time of feesNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFeeBeginTime(String FeeBeginTime) {
        this.FeeBeginTime = FeeBeginTime;
    }

    /**
     * Get End time of feesNote: This field may return null, indicating that no valid values can be obtained. 
     * @return FeeEndTime End time of feesNote: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFeeEndTime() {
        return this.FeeEndTime;
    }

    /**
     * Set End time of feesNote: This field may return null, indicating that no valid values can be obtained.
     * @param FeeEndTime End time of feesNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFeeEndTime(String FeeEndTime) {
        this.FeeEndTime = FeeEndTime;
    }

    /**
     * Get Days
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DayDiff Days
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDayDiff() {
        return this.DayDiff;
    }

    /**
     * Set Days
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DayDiff Days
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDayDiff(String DayDiff) {
        this.DayDiff = DayDiff;
    }

    /**
     * Get Daily consumptionNote: This field may return null, indicating that no valid values can be obtained. 
     * @return DailyTotalCost Daily consumptionNote: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDailyTotalCost() {
        return this.DailyTotalCost;
    }

    /**
     * Set Daily consumptionNote: This field may return null, indicating that no valid values can be obtained.
     * @param DailyTotalCost Daily consumptionNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDailyTotalCost(String DailyTotalCost) {
        this.DailyTotalCost = DailyTotalCost;
    }

    /**
     * Get Order numberNote: This field may return null, indicating that no valid values can be obtained. 
     * @return OrderId Order numberNote: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set Order numberNote: This field may return null, indicating that no valid values can be obtained.
     * @param OrderId Order numberNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get VoucherNote: This field may return null, indicating that no valid values can be obtained. 
     * @return VoucherPayAmount VoucherNote: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVoucherPayAmount() {
        return this.VoucherPayAmount;
    }

    /**
     * Set VoucherNote: This field may return null, indicating that no valid values can be obtained.
     * @param VoucherPayAmount VoucherNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVoucherPayAmount(String VoucherPayAmount) {
        this.VoucherPayAmount = VoucherPayAmount;
    }

    /**
     * Get Bonus
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IncentivePayAmount Bonus
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIncentivePayAmount() {
        return this.IncentivePayAmount;
    }

    /**
     * Set Bonus
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IncentivePayAmount Bonus
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIncentivePayAmount(String IncentivePayAmount) {
        this.IncentivePayAmount = IncentivePayAmount;
    }

    /**
     * Get Share revenueNote: This field may return null, indicating that no valid values can be obtained. 
     * @return TransferPayAmount Share revenueNote: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTransferPayAmount() {
        return this.TransferPayAmount;
    }

    /**
     * Set Share revenueNote: This field may return null, indicating that no valid values can be obtained.
     * @param TransferPayAmount Share revenueNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTransferPayAmount(String TransferPayAmount) {
        this.TransferPayAmount = TransferPayAmount;
    }

    /**
     * Get Payer UIN: the account ID of the payer, which is the unique identifier of a Tencent Cloud userNote: This field may return null, indicating that no valid values can be obtained. 
     * @return PayerUin Payer UIN: the account ID of the payer, which is the unique identifier of a Tencent Cloud userNote: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPayerUin() {
        return this.PayerUin;
    }

    /**
     * Set Payer UIN: the account ID of the payer, which is the unique identifier of a Tencent Cloud userNote: This field may return null, indicating that no valid values can be obtained.
     * @param PayerUin Payer UIN: the account ID of the payer, which is the unique identifier of a Tencent Cloud userNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPayerUin(String PayerUin) {
        this.PayerUin = PayerUin;
    }

    /**
     * Get User UIN: the account ID of the actual resource userNote: This field may return null, indicating that no valid values can be obtained. 
     * @return OwnerUin User UIN: the account ID of the actual resource userNote: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set User UIN: the account ID of the actual resource userNote: This field may return null, indicating that no valid values can be obtained.
     * @param OwnerUin User UIN: the account ID of the actual resource userNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get Operator UIN: the account ID or role ID of the operator who places orders for prepaid resources or activates postpaid resourcesNote: This field may return null, indicating that no valid values can be obtained. 
     * @return OperateUin Operator UIN: the account ID or role ID of the operator who places orders for prepaid resources or activates postpaid resourcesNote: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOperateUin() {
        return this.OperateUin;
    }

    /**
     * Set Operator UIN: the account ID or role ID of the operator who places orders for prepaid resources or activates postpaid resourcesNote: This field may return null, indicating that no valid values can be obtained.
     * @param OperateUin Operator UIN: the account ID or role ID of the operator who places orders for prepaid resources or activates postpaid resourcesNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOperateUin(String OperateUin) {
        this.OperateUin = OperateUin;
    }

    /**
     * Get Subproduct codeNote: This field may return null, indicating that no valid values can be obtained. 
     * @return ProductCode Subproduct codeNote: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProductCode() {
        return this.ProductCode;
    }

    /**
     * Set Subproduct codeNote: This field may return null, indicating that no valid values can be obtained.
     * @param ProductCode Subproduct codeNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    /**
     * Get Subproduct name: the subcategory of a product purchased by the user, such as CVM – Standard S1Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProductCodeName Subproduct name: the subcategory of a product purchased by the user, such as CVM – Standard S1Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProductCodeName() {
        return this.ProductCodeName;
    }

    /**
     * Set Subproduct name: the subcategory of a product purchased by the user, such as CVM – Standard S1Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProductCodeName Subproduct name: the subcategory of a product purchased by the user, such as CVM – Standard S1Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProductCodeName(String ProductCodeName) {
        this.ProductCodeName = ProductCodeName;
    }

    /**
     * Get Region typeNote: This field may return null, indicating that no valid values can be obtained. 
     * @return RegionType Region typeNote: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegionType() {
        return this.RegionType;
    }

    /**
     * Set Region typeNote: This field may return null, indicating that no valid values can be obtained.
     * @param RegionType Region typeNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegionType(String RegionType) {
        this.RegionType = RegionType;
    }

    /**
     * Get Region type nameNote: This field may return null, indicating that no valid values can be obtained. 
     * @return RegionTypeName Region type nameNote: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegionTypeName() {
        return this.RegionTypeName;
    }

    /**
     * Set Region type nameNote: This field may return null, indicating that no valid values can be obtained.
     * @param RegionTypeName Region type nameNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegionTypeName(String RegionTypeName) {
        this.RegionTypeName = RegionTypeName;
    }

    /**
     * Get Extended field 1Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Extend1 Extended field 1Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExtend1() {
        return this.Extend1;
    }

    /**
     * Set Extended field 1Note: This field may return null, indicating that no valid values can be obtained.
     * @param Extend1 Extended field 1Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExtend1(String Extend1) {
        this.Extend1 = Extend1;
    }

    /**
     * Get Extended field 2Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Extend2 Extended field 2Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExtend2() {
        return this.Extend2;
    }

    /**
     * Set Extended field 2Note: This field may return null, indicating that no valid values can be obtained.
     * @param Extend2 Extended field 2Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExtend2(String Extend2) {
        this.Extend2 = Extend2;
    }

    /**
     * Get Extended field 3Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Extend3 Extended field 3Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExtend3() {
        return this.Extend3;
    }

    /**
     * Set Extended field 3Note: This field may return null, indicating that no valid values can be obtained.
     * @param Extend3 Extended field 3Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExtend3(String Extend3) {
        this.Extend3 = Extend3;
    }

    /**
     * Get Extended field 4Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Extend4 Extended field 4Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExtend4() {
        return this.Extend4;
    }

    /**
     * Set Extended field 4Note: This field may return null, indicating that no valid values can be obtained.
     * @param Extend4 Extended field 4Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExtend4(String Extend4) {
        this.Extend4 = Extend4;
    }

    /**
     * Get Extended field 5Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Extend5 Extended field 5Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExtend5() {
        return this.Extend5;
    }

    /**
     * Set Extended field 5Note: This field may return null, indicating that no valid values can be obtained.
     * @param Extend5 Extended field 5Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExtend5(String Extend5) {
        this.Extend5 = Extend5;
    }

    /**
     * Get Instance typeNote: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceType Instance typeNote: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance typeNote: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceType Instance typeNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Instance type nameNote: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceTypeName Instance type nameNote: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceTypeName() {
        return this.InstanceTypeName;
    }

    /**
     * Set Instance type nameNote: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceTypeName Instance type nameNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceTypeName(String InstanceTypeName) {
        this.InstanceTypeName = InstanceTypeName;
    }

    /**
     * Get Deduction time: the time at which a payment is deductedNote: This field may return null, indicating that no valid values can be obtained. 
     * @return PayTime Deduction time: the time at which a payment is deductedNote: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPayTime() {
        return this.PayTime;
    }

    /**
     * Set Deduction time: the time at which a payment is deductedNote: This field may return null, indicating that no valid values can be obtained.
     * @param PayTime Deduction time: the time at which a payment is deductedNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPayTime(String PayTime) {
        this.PayTime = PayTime;
    }

    /**
     * Get Availability zone: availability zone of a resource, e.g. Guangzhou Zone 3Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ZoneName Availability zone: availability zone of a resource, e.g. Guangzhou Zone 3Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set Availability zone: availability zone of a resource, e.g. Guangzhou Zone 3Note: This field may return null, indicating that no valid values can be obtained.
     * @param ZoneName Availability zone: availability zone of a resource, e.g. Guangzhou Zone 3Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get Configuration descriptionNote: This field may return null, indicating that no valid values can be obtained. 
     * @return ComponentConfig Configuration descriptionNote: This field may return null, indicating that no valid values can be obtained.
     */
    public String getComponentConfig() {
        return this.ComponentConfig;
    }

    /**
     * Set Configuration descriptionNote: This field may return null, indicating that no valid values can be obtained.
     * @param ComponentConfig Configuration descriptionNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setComponentConfig(String ComponentConfig) {
        this.ComponentConfig = ComponentConfig;
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

    }
}


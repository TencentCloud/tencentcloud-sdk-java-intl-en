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

public class BillResourceSummary extends AbstractModel {

    /**
    * Product name: The name of a Tencent Cloud product purchased by the user, such as CVM.
    */
    @SerializedName("BusinessCodeName")
    @Expose
    private String BusinessCodeName;

    /**
    * Subproduct name: The subcategory of a Tencent Cloud product purchased by the user, such as CVM Computing C5t.
    */
    @SerializedName("ProductCodeName")
    @Expose
    private String ProductCodeName;

    /**
    * Billing mode, which can be monthly subscription or pay-as-you-go.
    */
    @SerializedName("PayModeName")
    @Expose
    private String PayModeName;

    /**
    * Project name: The project to which a resource belongs, which is user-designated. If a resource has not been assigned to a project, it will automatically belong to the default project.
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * Region: The region to which a resource belongs, such as South China (Guangzhou).
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * Availability zone: The availability zone to which a resource belongs, such as Guangzhou Zone 3.
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * Instance ID: The object ID of a billed resource, such as a CVM instance ID. This object ID may vary due to various forms and contents of resources in different products.	
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * Instance name: The resource name set by the user in the console. If it is not set, it will be empty by default.
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * Transaction type, which can be monthly subscription purchase, monthly subscription renewal, or pay-as-you-go deduction.
    */
    @SerializedName("ActionTypeName")
    @Expose
    private String ActionTypeName;

    /**
    * Order ID: The order number for a monthly subscription purchase
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * Transaction time: The time at which a payment was deducted
    */
    @SerializedName("PayTime")
    @Expose
    private String PayTime;

    /**
    * Usage start time: The time at which product or service usage starts
    */
    @SerializedName("FeeBeginTime")
    @Expose
    private String FeeBeginTime;

    /**
    * Usage end time: The time at which product or service usage ends
    */
    @SerializedName("FeeEndTime")
    @Expose
    private String FeeEndTime;

    /**
    * Configuration description: The billable item names and usage of a resource, which are displayed on the resource bill only.
    */
    @SerializedName("ConfigDesc")
    @Expose
    private String ConfigDesc;

    /**
    * Extended field 1: Extended attribute information of a product, which is displayed on the resource bill only.
    */
    @SerializedName("ExtendField1")
    @Expose
    private String ExtendField1;

    /**
    * Extended field 2: Extended attribute information of a product, which is displayed on the resource bill only.
    */
    @SerializedName("ExtendField2")
    @Expose
    private String ExtendField2;

    /**
    * Original cost: The original cost of a resource, which is "List price x Usage x Usage duration". If a customer has applied for a fixed preferential price or contract price or applied for a refund, this parameter will not be displayed by default.
    */
    @SerializedName("TotalCost")
    @Expose
    private String TotalCost;

    /**
    * Discount multiplier: The discount multiplier applied to the cost of the resource. If a customer has applied for a fixed preferential price or contract price or applied for a refund, this parameter will not be displayed by default.
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
    * Total amount after discount (Including Tax):  = Total Amount After Discount (Excluding Tax) + TaxAmount
    */
    @SerializedName("RealTotalCost")
    @Expose
    private String RealTotalCost;

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
    * Commission credit: The amount paid with the user's commission credit. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TransferPayAmount")
    @Expose
    private String TransferPayAmount;

    /**
    * Extended field 3: Extended attribute information of a product, which is displayed on the resource bill only.
    */
    @SerializedName("ExtendField3")
    @Expose
    private String ExtendField3;

    /**
    * Extended field 4: Extended attribute information of a product, which is displayed on the resource bill only.
    */
    @SerializedName("ExtendField4")
    @Expose
    private String ExtendField4;

    /**
    * Extended field 5: Extended attribute information of a product, which is displayed on the resource bill only.
    */
    @SerializedName("ExtendField5")
    @Expose
    private String ExtendField5;

    /**
    * Tag information. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private BillTagInfo [] Tags;

    /**
    * Payer account ID: The account ID of the payer, which is the unique identifier of a Tencent Cloud user.
    */
    @SerializedName("PayerUin")
    @Expose
    private String PayerUin;

    /**
    * Owner account ID: The account ID of the actual resource user
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * Operator account ID: The account or role ID of the operator who purchases or activates a resource.
    */
    @SerializedName("OperateUin")
    @Expose
    private String OperateUin;

    /**
    * Product code
    */
    @SerializedName("BusinessCode")
    @Expose
    private String BusinessCode;

    /**
    * Subproduct code
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
    * Region ID
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * Instance type: The instance type of a product or service purchased, which can be resource package, RI, SP, or spot instance. Other instance types are not displayed by default.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * RI deduction (cost): The amount deducted from the original cost by RI	
    */
    @SerializedName("OriginalCostWithRI")
    @Expose
    private String OriginalCostWithRI;

    /**
    * Cost deduction by SP. This parameter has been deprecated.
    */
    @SerializedName("SPDeduction")
    @Expose
    private String SPDeduction;

    /**
    * SP deduction (cost): SP deduction (cost) = Cost deduction by SP / SP deduction rate	
    */
    @SerializedName("OriginalCostWithSP")
    @Expose
    private String OriginalCostWithSP;

    /**
    * Billing monthNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BillMonth")
    @Expose
    private String BillMonth;

    /**
     * Get Product name: The name of a Tencent Cloud product purchased by the user, such as CVM. 
     * @return BusinessCodeName Product name: The name of a Tencent Cloud product purchased by the user, such as CVM.
     */
    public String getBusinessCodeName() {
        return this.BusinessCodeName;
    }

    /**
     * Set Product name: The name of a Tencent Cloud product purchased by the user, such as CVM.
     * @param BusinessCodeName Product name: The name of a Tencent Cloud product purchased by the user, such as CVM.
     */
    public void setBusinessCodeName(String BusinessCodeName) {
        this.BusinessCodeName = BusinessCodeName;
    }

    /**
     * Get Subproduct name: The subcategory of a Tencent Cloud product purchased by the user, such as CVM Computing C5t. 
     * @return ProductCodeName Subproduct name: The subcategory of a Tencent Cloud product purchased by the user, such as CVM Computing C5t.
     */
    public String getProductCodeName() {
        return this.ProductCodeName;
    }

    /**
     * Set Subproduct name: The subcategory of a Tencent Cloud product purchased by the user, such as CVM Computing C5t.
     * @param ProductCodeName Subproduct name: The subcategory of a Tencent Cloud product purchased by the user, such as CVM Computing C5t.
     */
    public void setProductCodeName(String ProductCodeName) {
        this.ProductCodeName = ProductCodeName;
    }

    /**
     * Get Billing mode, which can be monthly subscription or pay-as-you-go. 
     * @return PayModeName Billing mode, which can be monthly subscription or pay-as-you-go.
     */
    public String getPayModeName() {
        return this.PayModeName;
    }

    /**
     * Set Billing mode, which can be monthly subscription or pay-as-you-go.
     * @param PayModeName Billing mode, which can be monthly subscription or pay-as-you-go.
     */
    public void setPayModeName(String PayModeName) {
        this.PayModeName = PayModeName;
    }

    /**
     * Get Project name: The project to which a resource belongs, which is user-designated. If a resource has not been assigned to a project, it will automatically belong to the default project. 
     * @return ProjectName Project name: The project to which a resource belongs, which is user-designated. If a resource has not been assigned to a project, it will automatically belong to the default project.
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set Project name: The project to which a resource belongs, which is user-designated. If a resource has not been assigned to a project, it will automatically belong to the default project.
     * @param ProjectName Project name: The project to which a resource belongs, which is user-designated. If a resource has not been assigned to a project, it will automatically belong to the default project.
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get Region: The region to which a resource belongs, such as South China (Guangzhou). 
     * @return RegionName Region: The region to which a resource belongs, such as South China (Guangzhou).
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set Region: The region to which a resource belongs, such as South China (Guangzhou).
     * @param RegionName Region: The region to which a resource belongs, such as South China (Guangzhou).
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get Availability zone: The availability zone to which a resource belongs, such as Guangzhou Zone 3. 
     * @return ZoneName Availability zone: The availability zone to which a resource belongs, such as Guangzhou Zone 3.
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set Availability zone: The availability zone to which a resource belongs, such as Guangzhou Zone 3.
     * @param ZoneName Availability zone: The availability zone to which a resource belongs, such as Guangzhou Zone 3.
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get Instance ID: The object ID of a billed resource, such as a CVM instance ID. This object ID may vary due to various forms and contents of resources in different products.	 
     * @return ResourceId Instance ID: The object ID of a billed resource, such as a CVM instance ID. This object ID may vary due to various forms and contents of resources in different products.	
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Instance ID: The object ID of a billed resource, such as a CVM instance ID. This object ID may vary due to various forms and contents of resources in different products.	
     * @param ResourceId Instance ID: The object ID of a billed resource, such as a CVM instance ID. This object ID may vary due to various forms and contents of resources in different products.	
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get Instance name: The resource name set by the user in the console. If it is not set, it will be empty by default. 
     * @return ResourceName Instance name: The resource name set by the user in the console. If it is not set, it will be empty by default.
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set Instance name: The resource name set by the user in the console. If it is not set, it will be empty by default.
     * @param ResourceName Instance name: The resource name set by the user in the console. If it is not set, it will be empty by default.
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get Transaction type, which can be monthly subscription purchase, monthly subscription renewal, or pay-as-you-go deduction. 
     * @return ActionTypeName Transaction type, which can be monthly subscription purchase, monthly subscription renewal, or pay-as-you-go deduction.
     */
    public String getActionTypeName() {
        return this.ActionTypeName;
    }

    /**
     * Set Transaction type, which can be monthly subscription purchase, monthly subscription renewal, or pay-as-you-go deduction.
     * @param ActionTypeName Transaction type, which can be monthly subscription purchase, monthly subscription renewal, or pay-as-you-go deduction.
     */
    public void setActionTypeName(String ActionTypeName) {
        this.ActionTypeName = ActionTypeName;
    }

    /**
     * Get Order ID: The order number for a monthly subscription purchase 
     * @return OrderId Order ID: The order number for a monthly subscription purchase
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set Order ID: The order number for a monthly subscription purchase
     * @param OrderId Order ID: The order number for a monthly subscription purchase
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get Transaction time: The time at which a payment was deducted 
     * @return PayTime Transaction time: The time at which a payment was deducted
     */
    public String getPayTime() {
        return this.PayTime;
    }

    /**
     * Set Transaction time: The time at which a payment was deducted
     * @param PayTime Transaction time: The time at which a payment was deducted
     */
    public void setPayTime(String PayTime) {
        this.PayTime = PayTime;
    }

    /**
     * Get Usage start time: The time at which product or service usage starts 
     * @return FeeBeginTime Usage start time: The time at which product or service usage starts
     */
    public String getFeeBeginTime() {
        return this.FeeBeginTime;
    }

    /**
     * Set Usage start time: The time at which product or service usage starts
     * @param FeeBeginTime Usage start time: The time at which product or service usage starts
     */
    public void setFeeBeginTime(String FeeBeginTime) {
        this.FeeBeginTime = FeeBeginTime;
    }

    /**
     * Get Usage end time: The time at which product or service usage ends 
     * @return FeeEndTime Usage end time: The time at which product or service usage ends
     */
    public String getFeeEndTime() {
        return this.FeeEndTime;
    }

    /**
     * Set Usage end time: The time at which product or service usage ends
     * @param FeeEndTime Usage end time: The time at which product or service usage ends
     */
    public void setFeeEndTime(String FeeEndTime) {
        this.FeeEndTime = FeeEndTime;
    }

    /**
     * Get Configuration description: The billable item names and usage of a resource, which are displayed on the resource bill only. 
     * @return ConfigDesc Configuration description: The billable item names and usage of a resource, which are displayed on the resource bill only.
     */
    public String getConfigDesc() {
        return this.ConfigDesc;
    }

    /**
     * Set Configuration description: The billable item names and usage of a resource, which are displayed on the resource bill only.
     * @param ConfigDesc Configuration description: The billable item names and usage of a resource, which are displayed on the resource bill only.
     */
    public void setConfigDesc(String ConfigDesc) {
        this.ConfigDesc = ConfigDesc;
    }

    /**
     * Get Extended field 1: Extended attribute information of a product, which is displayed on the resource bill only. 
     * @return ExtendField1 Extended field 1: Extended attribute information of a product, which is displayed on the resource bill only.
     */
    public String getExtendField1() {
        return this.ExtendField1;
    }

    /**
     * Set Extended field 1: Extended attribute information of a product, which is displayed on the resource bill only.
     * @param ExtendField1 Extended field 1: Extended attribute information of a product, which is displayed on the resource bill only.
     */
    public void setExtendField1(String ExtendField1) {
        this.ExtendField1 = ExtendField1;
    }

    /**
     * Get Extended field 2: Extended attribute information of a product, which is displayed on the resource bill only. 
     * @return ExtendField2 Extended field 2: Extended attribute information of a product, which is displayed on the resource bill only.
     */
    public String getExtendField2() {
        return this.ExtendField2;
    }

    /**
     * Set Extended field 2: Extended attribute information of a product, which is displayed on the resource bill only.
     * @param ExtendField2 Extended field 2: Extended attribute information of a product, which is displayed on the resource bill only.
     */
    public void setExtendField2(String ExtendField2) {
        this.ExtendField2 = ExtendField2;
    }

    /**
     * Get Original cost: The original cost of a resource, which is "List price x Usage x Usage duration". If a customer has applied for a fixed preferential price or contract price or applied for a refund, this parameter will not be displayed by default. 
     * @return TotalCost Original cost: The original cost of a resource, which is "List price x Usage x Usage duration". If a customer has applied for a fixed preferential price or contract price or applied for a refund, this parameter will not be displayed by default.
     */
    public String getTotalCost() {
        return this.TotalCost;
    }

    /**
     * Set Original cost: The original cost of a resource, which is "List price x Usage x Usage duration". If a customer has applied for a fixed preferential price or contract price or applied for a refund, this parameter will not be displayed by default.
     * @param TotalCost Original cost: The original cost of a resource, which is "List price x Usage x Usage duration". If a customer has applied for a fixed preferential price or contract price or applied for a refund, this parameter will not be displayed by default.
     */
    public void setTotalCost(String TotalCost) {
        this.TotalCost = TotalCost;
    }

    /**
     * Get Discount multiplier: The discount multiplier applied to the cost of the resource. If a customer has applied for a fixed preferential price or contract price or applied for a refund, this parameter will not be displayed by default. 
     * @return Discount Discount multiplier: The discount multiplier applied to the cost of the resource. If a customer has applied for a fixed preferential price or contract price or applied for a refund, this parameter will not be displayed by default.
     */
    public String getDiscount() {
        return this.Discount;
    }

    /**
     * Set Discount multiplier: The discount multiplier applied to the cost of the resource. If a customer has applied for a fixed preferential price or contract price or applied for a refund, this parameter will not be displayed by default.
     * @param Discount Discount multiplier: The discount multiplier applied to the cost of the resource. If a customer has applied for a fixed preferential price or contract price or applied for a refund, this parameter will not be displayed by default.
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
     * Get Total amount after discount (Including Tax):  = Total Amount After Discount (Excluding Tax) + TaxAmount 
     * @return RealTotalCost Total amount after discount (Including Tax):  = Total Amount After Discount (Excluding Tax) + TaxAmount
     */
    public String getRealTotalCost() {
        return this.RealTotalCost;
    }

    /**
     * Set Total amount after discount (Including Tax):  = Total Amount After Discount (Excluding Tax) + TaxAmount
     * @param RealTotalCost Total amount after discount (Including Tax):  = Total Amount After Discount (Excluding Tax) + TaxAmount
     */
    public void setRealTotalCost(String RealTotalCost) {
        this.RealTotalCost = RealTotalCost;
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
     * Get Commission credit: The amount paid with the user's commission credit. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TransferPayAmount Commission credit: The amount paid with the user's commission credit. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTransferPayAmount() {
        return this.TransferPayAmount;
    }

    /**
     * Set Commission credit: The amount paid with the user's commission credit. Note: This field may return null, indicating that no valid values can be obtained.
     * @param TransferPayAmount Commission credit: The amount paid with the user's commission credit. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTransferPayAmount(String TransferPayAmount) {
        this.TransferPayAmount = TransferPayAmount;
    }

    /**
     * Get Extended field 3: Extended attribute information of a product, which is displayed on the resource bill only. 
     * @return ExtendField3 Extended field 3: Extended attribute information of a product, which is displayed on the resource bill only.
     */
    public String getExtendField3() {
        return this.ExtendField3;
    }

    /**
     * Set Extended field 3: Extended attribute information of a product, which is displayed on the resource bill only.
     * @param ExtendField3 Extended field 3: Extended attribute information of a product, which is displayed on the resource bill only.
     */
    public void setExtendField3(String ExtendField3) {
        this.ExtendField3 = ExtendField3;
    }

    /**
     * Get Extended field 4: Extended attribute information of a product, which is displayed on the resource bill only. 
     * @return ExtendField4 Extended field 4: Extended attribute information of a product, which is displayed on the resource bill only.
     */
    public String getExtendField4() {
        return this.ExtendField4;
    }

    /**
     * Set Extended field 4: Extended attribute information of a product, which is displayed on the resource bill only.
     * @param ExtendField4 Extended field 4: Extended attribute information of a product, which is displayed on the resource bill only.
     */
    public void setExtendField4(String ExtendField4) {
        this.ExtendField4 = ExtendField4;
    }

    /**
     * Get Extended field 5: Extended attribute information of a product, which is displayed on the resource bill only. 
     * @return ExtendField5 Extended field 5: Extended attribute information of a product, which is displayed on the resource bill only.
     */
    public String getExtendField5() {
        return this.ExtendField5;
    }

    /**
     * Set Extended field 5: Extended attribute information of a product, which is displayed on the resource bill only.
     * @param ExtendField5 Extended field 5: Extended attribute information of a product, which is displayed on the resource bill only.
     */
    public void setExtendField5(String ExtendField5) {
        this.ExtendField5 = ExtendField5;
    }

    /**
     * Get Tag information. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tags Tag information. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public BillTagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag information. Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tags Tag information. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(BillTagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Payer account ID: The account ID of the payer, which is the unique identifier of a Tencent Cloud user. 
     * @return PayerUin Payer account ID: The account ID of the payer, which is the unique identifier of a Tencent Cloud user.
     */
    public String getPayerUin() {
        return this.PayerUin;
    }

    /**
     * Set Payer account ID: The account ID of the payer, which is the unique identifier of a Tencent Cloud user.
     * @param PayerUin Payer account ID: The account ID of the payer, which is the unique identifier of a Tencent Cloud user.
     */
    public void setPayerUin(String PayerUin) {
        this.PayerUin = PayerUin;
    }

    /**
     * Get Owner account ID: The account ID of the actual resource user 
     * @return OwnerUin Owner account ID: The account ID of the actual resource user
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set Owner account ID: The account ID of the actual resource user
     * @param OwnerUin Owner account ID: The account ID of the actual resource user
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get Operator account ID: The account or role ID of the operator who purchases or activates a resource. 
     * @return OperateUin Operator account ID: The account or role ID of the operator who purchases or activates a resource.
     */
    public String getOperateUin() {
        return this.OperateUin;
    }

    /**
     * Set Operator account ID: The account or role ID of the operator who purchases or activates a resource.
     * @param OperateUin Operator account ID: The account or role ID of the operator who purchases or activates a resource.
     */
    public void setOperateUin(String OperateUin) {
        this.OperateUin = OperateUin;
    }

    /**
     * Get Product code 
     * @return BusinessCode Product code
     */
    public String getBusinessCode() {
        return this.BusinessCode;
    }

    /**
     * Set Product code
     * @param BusinessCode Product code
     */
    public void setBusinessCode(String BusinessCode) {
        this.BusinessCode = BusinessCode;
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
     * Get Region ID 
     * @return RegionId Region ID
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Region ID
     * @param RegionId Region ID
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get Instance type: The instance type of a product or service purchased, which can be resource package, RI, SP, or spot instance. Other instance types are not displayed by default. 
     * @return InstanceType Instance type: The instance type of a product or service purchased, which can be resource package, RI, SP, or spot instance. Other instance types are not displayed by default.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance type: The instance type of a product or service purchased, which can be resource package, RI, SP, or spot instance. Other instance types are not displayed by default.
     * @param InstanceType Instance type: The instance type of a product or service purchased, which can be resource package, RI, SP, or spot instance. Other instance types are not displayed by default.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get RI deduction (cost): The amount deducted from the original cost by RI	 
     * @return OriginalCostWithRI RI deduction (cost): The amount deducted from the original cost by RI	
     */
    public String getOriginalCostWithRI() {
        return this.OriginalCostWithRI;
    }

    /**
     * Set RI deduction (cost): The amount deducted from the original cost by RI	
     * @param OriginalCostWithRI RI deduction (cost): The amount deducted from the original cost by RI	
     */
    public void setOriginalCostWithRI(String OriginalCostWithRI) {
        this.OriginalCostWithRI = OriginalCostWithRI;
    }

    /**
     * Get Cost deduction by SP. This parameter has been deprecated. 
     * @return SPDeduction Cost deduction by SP. This parameter has been deprecated.
     * @deprecated
     */
    @Deprecated
    public String getSPDeduction() {
        return this.SPDeduction;
    }

    /**
     * Set Cost deduction by SP. This parameter has been deprecated.
     * @param SPDeduction Cost deduction by SP. This parameter has been deprecated.
     * @deprecated
     */
    @Deprecated
    public void setSPDeduction(String SPDeduction) {
        this.SPDeduction = SPDeduction;
    }

    /**
     * Get SP deduction (cost): SP deduction (cost) = Cost deduction by SP / SP deduction rate	 
     * @return OriginalCostWithSP SP deduction (cost): SP deduction (cost) = Cost deduction by SP / SP deduction rate	
     */
    public String getOriginalCostWithSP() {
        return this.OriginalCostWithSP;
    }

    /**
     * Set SP deduction (cost): SP deduction (cost) = Cost deduction by SP / SP deduction rate	
     * @param OriginalCostWithSP SP deduction (cost): SP deduction (cost) = Cost deduction by SP / SP deduction rate	
     */
    public void setOriginalCostWithSP(String OriginalCostWithSP) {
        this.OriginalCostWithSP = OriginalCostWithSP;
    }

    /**
     * Get Billing monthNote: This field may return null, indicating that no valid values can be obtained. 
     * @return BillMonth Billing monthNote: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBillMonth() {
        return this.BillMonth;
    }

    /**
     * Set Billing monthNote: This field may return null, indicating that no valid values can be obtained.
     * @param BillMonth Billing monthNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBillMonth(String BillMonth) {
        this.BillMonth = BillMonth;
    }

    public BillResourceSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BillResourceSummary(BillResourceSummary source) {
        if (source.BusinessCodeName != null) {
            this.BusinessCodeName = new String(source.BusinessCodeName);
        }
        if (source.ProductCodeName != null) {
            this.ProductCodeName = new String(source.ProductCodeName);
        }
        if (source.PayModeName != null) {
            this.PayModeName = new String(source.PayModeName);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.ActionTypeName != null) {
            this.ActionTypeName = new String(source.ActionTypeName);
        }
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
        if (source.PayTime != null) {
            this.PayTime = new String(source.PayTime);
        }
        if (source.FeeBeginTime != null) {
            this.FeeBeginTime = new String(source.FeeBeginTime);
        }
        if (source.FeeEndTime != null) {
            this.FeeEndTime = new String(source.FeeEndTime);
        }
        if (source.ConfigDesc != null) {
            this.ConfigDesc = new String(source.ConfigDesc);
        }
        if (source.ExtendField1 != null) {
            this.ExtendField1 = new String(source.ExtendField1);
        }
        if (source.ExtendField2 != null) {
            this.ExtendField2 = new String(source.ExtendField2);
        }
        if (source.TotalCost != null) {
            this.TotalCost = new String(source.TotalCost);
        }
        if (source.Discount != null) {
            this.Discount = new String(source.Discount);
        }
        if (source.ReduceType != null) {
            this.ReduceType = new String(source.ReduceType);
        }
        if (source.RealTotalCost != null) {
            this.RealTotalCost = new String(source.RealTotalCost);
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
        if (source.ExtendField3 != null) {
            this.ExtendField3 = new String(source.ExtendField3);
        }
        if (source.ExtendField4 != null) {
            this.ExtendField4 = new String(source.ExtendField4);
        }
        if (source.ExtendField5 != null) {
            this.ExtendField5 = new String(source.ExtendField5);
        }
        if (source.Tags != null) {
            this.Tags = new BillTagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new BillTagInfo(source.Tags[i]);
            }
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
        if (source.BusinessCode != null) {
            this.BusinessCode = new String(source.BusinessCode);
        }
        if (source.ProductCode != null) {
            this.ProductCode = new String(source.ProductCode);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.OriginalCostWithRI != null) {
            this.OriginalCostWithRI = new String(source.OriginalCostWithRI);
        }
        if (source.SPDeduction != null) {
            this.SPDeduction = new String(source.SPDeduction);
        }
        if (source.OriginalCostWithSP != null) {
            this.OriginalCostWithSP = new String(source.OriginalCostWithSP);
        }
        if (source.BillMonth != null) {
            this.BillMonth = new String(source.BillMonth);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BusinessCodeName", this.BusinessCodeName);
        this.setParamSimple(map, prefix + "ProductCodeName", this.ProductCodeName);
        this.setParamSimple(map, prefix + "PayModeName", this.PayModeName);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "ActionTypeName", this.ActionTypeName);
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "PayTime", this.PayTime);
        this.setParamSimple(map, prefix + "FeeBeginTime", this.FeeBeginTime);
        this.setParamSimple(map, prefix + "FeeEndTime", this.FeeEndTime);
        this.setParamSimple(map, prefix + "ConfigDesc", this.ConfigDesc);
        this.setParamSimple(map, prefix + "ExtendField1", this.ExtendField1);
        this.setParamSimple(map, prefix + "ExtendField2", this.ExtendField2);
        this.setParamSimple(map, prefix + "TotalCost", this.TotalCost);
        this.setParamSimple(map, prefix + "Discount", this.Discount);
        this.setParamSimple(map, prefix + "ReduceType", this.ReduceType);
        this.setParamSimple(map, prefix + "RealTotalCost", this.RealTotalCost);
        this.setParamSimple(map, prefix + "VoucherPayAmount", this.VoucherPayAmount);
        this.setParamSimple(map, prefix + "CashPayAmount", this.CashPayAmount);
        this.setParamSimple(map, prefix + "IncentivePayAmount", this.IncentivePayAmount);
        this.setParamSimple(map, prefix + "TransferPayAmount", this.TransferPayAmount);
        this.setParamSimple(map, prefix + "ExtendField3", this.ExtendField3);
        this.setParamSimple(map, prefix + "ExtendField4", this.ExtendField4);
        this.setParamSimple(map, prefix + "ExtendField5", this.ExtendField5);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "PayerUin", this.PayerUin);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "OperateUin", this.OperateUin);
        this.setParamSimple(map, prefix + "BusinessCode", this.BusinessCode);
        this.setParamSimple(map, prefix + "ProductCode", this.ProductCode);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "OriginalCostWithRI", this.OriginalCostWithRI);
        this.setParamSimple(map, prefix + "SPDeduction", this.SPDeduction);
        this.setParamSimple(map, prefix + "OriginalCostWithSP", this.OriginalCostWithSP);
        this.setParamSimple(map, prefix + "BillMonth", this.BillMonth);

    }
}


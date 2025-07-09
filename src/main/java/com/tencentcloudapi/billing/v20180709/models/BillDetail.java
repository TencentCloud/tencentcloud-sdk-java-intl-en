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

public class BillDetail extends AbstractModel {

    /**
    * Product name: The name of a Tencent Cloud product purchased by the user, such as CVM.
    */
    @SerializedName("BusinessCodeName")
    @Expose
    private String BusinessCodeName;

    /**
    * Subproduct name: The subcategory of a Tencent Cloud product purchased by the user, such as CVM Standard S1.
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
    * Availability zone: availability zone of a resource, e.g. Guangzhou Zone 3
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
    * Transaction ID: The bill number for a deducted payment
    */
    @SerializedName("BillId")
    @Expose
    private String BillId;

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
    * Component list
    */
    @SerializedName("ComponentSet")
    @Expose
    private BillDetailComponent [] ComponentSet;

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
    * Operator account ID: The account or role ID of the operator who purchases or activates a resource
    */
    @SerializedName("OperateUin")
    @Expose
    private String OperateUin;

    /**
    * Tag information. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private BillTagInfo [] Tags;

    /**
    * Product code. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BusinessCode")
    @Expose
    private String BusinessCode;

    /**
    * Subproduct code. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
    * Transaction type code. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * Region ID. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Price attribute: A set of attributes which will determine the price of a component, apart from unit price and usage duration.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PriceInfo")
    @Expose
    private String [] PriceInfo;

    /**
    * Associated transaction document ID: The ID of the document associated with a transaction, such as a write-off order, the original order showing a deduction error during first settlement, a restructured order, or the original purchase order corresponding to a refund order.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AssociatedOrder")
    @Expose
    private BillDetailAssociatedOrder AssociatedOrder;

    /**
    * Calculation formula: The detailed calculation formula for a specific transaction type, such as refund or configuration change.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Formula")
    @Expose
    private String Formula;

    /**
    * Billing rules: Official website links for detailed billing rules of each product.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FormulaUrl")
    @Expose
    private String FormulaUrl;

    /**
    * Billing dayNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BillDay")
    @Expose
    private String BillDay;

    /**
    * Billing monthNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BillMonth")
    @Expose
    private String BillMonth;

    /**
    * Billing record IDNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Domestic and international codesNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegionType")
    @Expose
    private String RegionType;

    /**
    * Domestic and International: The region type to which the resource belongs (domestic, international)Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegionTypeName")
    @Expose
    private String RegionTypeName;

    /**
    * Note attributes (instance configuration): Other note information, such as the reserved instance, the reserved instance type, the transaction type, and the region information on both ends of the CCN product.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReserveDetail")
    @Expose
    private String ReserveDetail;

    /**
    * the discount object for the current consumption item, such as official website discount, user discount, and event discount.
    */
    @SerializedName("DiscountObject")
    @Expose
    private String DiscountObject;

    /**
    * the discount type for the current consumption item, such as discount and contract price.

    */
    @SerializedName("DiscountType")
    @Expose
    private String DiscountType;

    /**
    * supplementary description of the discount type, such as 0.2.
    */
    @SerializedName("DiscountContent")
    @Expose
    private String DiscountContent;

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
     * Get Subproduct name: The subcategory of a Tencent Cloud product purchased by the user, such as CVM Standard S1. 
     * @return ProductCodeName Subproduct name: The subcategory of a Tencent Cloud product purchased by the user, such as CVM Standard S1.
     */
    public String getProductCodeName() {
        return this.ProductCodeName;
    }

    /**
     * Set Subproduct name: The subcategory of a Tencent Cloud product purchased by the user, such as CVM Standard S1.
     * @param ProductCodeName Subproduct name: The subcategory of a Tencent Cloud product purchased by the user, such as CVM Standard S1.
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
     * Get Availability zone: availability zone of a resource, e.g. Guangzhou Zone 3 
     * @return ZoneName Availability zone: availability zone of a resource, e.g. Guangzhou Zone 3
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set Availability zone: availability zone of a resource, e.g. Guangzhou Zone 3
     * @param ZoneName Availability zone: availability zone of a resource, e.g. Guangzhou Zone 3
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
     * Get Transaction ID: The bill number for a deducted payment 
     * @return BillId Transaction ID: The bill number for a deducted payment
     */
    public String getBillId() {
        return this.BillId;
    }

    /**
     * Set Transaction ID: The bill number for a deducted payment
     * @param BillId Transaction ID: The bill number for a deducted payment
     */
    public void setBillId(String BillId) {
        this.BillId = BillId;
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
     * Get Component list 
     * @return ComponentSet Component list
     */
    public BillDetailComponent [] getComponentSet() {
        return this.ComponentSet;
    }

    /**
     * Set Component list
     * @param ComponentSet Component list
     */
    public void setComponentSet(BillDetailComponent [] ComponentSet) {
        this.ComponentSet = ComponentSet;
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
     * Get Operator account ID: The account or role ID of the operator who purchases or activates a resource 
     * @return OperateUin Operator account ID: The account or role ID of the operator who purchases or activates a resource
     */
    public String getOperateUin() {
        return this.OperateUin;
    }

    /**
     * Set Operator account ID: The account or role ID of the operator who purchases or activates a resource
     * @param OperateUin Operator account ID: The account or role ID of the operator who purchases or activates a resource
     */
    public void setOperateUin(String OperateUin) {
        this.OperateUin = OperateUin;
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
     * Get Product code. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BusinessCode Product code. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBusinessCode() {
        return this.BusinessCode;
    }

    /**
     * Set Product code. Note: This field may return null, indicating that no valid values can be obtained.
     * @param BusinessCode Product code. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBusinessCode(String BusinessCode) {
        this.BusinessCode = BusinessCode;
    }

    /**
     * Get Subproduct code. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProductCode Subproduct code. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProductCode() {
        return this.ProductCode;
    }

    /**
     * Set Subproduct code. Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProductCode Subproduct code. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    /**
     * Get Transaction type code. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ActionType Transaction type code. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set Transaction type code. Note: This field may return null, indicating that no valid values can be obtained.
     * @param ActionType Transaction type code. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get Region ID. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RegionId Region ID. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Region ID. Note: This field may return null, indicating that no valid values can be obtained.
     * @param RegionId Region ID. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Price attribute: A set of attributes which will determine the price of a component, apart from unit price and usage duration.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PriceInfo Price attribute: A set of attributes which will determine the price of a component, apart from unit price and usage duration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getPriceInfo() {
        return this.PriceInfo;
    }

    /**
     * Set Price attribute: A set of attributes which will determine the price of a component, apart from unit price and usage duration.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PriceInfo Price attribute: A set of attributes which will determine the price of a component, apart from unit price and usage duration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPriceInfo(String [] PriceInfo) {
        this.PriceInfo = PriceInfo;
    }

    /**
     * Get Associated transaction document ID: The ID of the document associated with a transaction, such as a write-off order, the original order showing a deduction error during first settlement, a restructured order, or the original purchase order corresponding to a refund order.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AssociatedOrder Associated transaction document ID: The ID of the document associated with a transaction, such as a write-off order, the original order showing a deduction error during first settlement, a restructured order, or the original purchase order corresponding to a refund order.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public BillDetailAssociatedOrder getAssociatedOrder() {
        return this.AssociatedOrder;
    }

    /**
     * Set Associated transaction document ID: The ID of the document associated with a transaction, such as a write-off order, the original order showing a deduction error during first settlement, a restructured order, or the original purchase order corresponding to a refund order.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AssociatedOrder Associated transaction document ID: The ID of the document associated with a transaction, such as a write-off order, the original order showing a deduction error during first settlement, a restructured order, or the original purchase order corresponding to a refund order.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAssociatedOrder(BillDetailAssociatedOrder AssociatedOrder) {
        this.AssociatedOrder = AssociatedOrder;
    }

    /**
     * Get Calculation formula: The detailed calculation formula for a specific transaction type, such as refund or configuration change.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Formula Calculation formula: The detailed calculation formula for a specific transaction type, such as refund or configuration change.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFormula() {
        return this.Formula;
    }

    /**
     * Set Calculation formula: The detailed calculation formula for a specific transaction type, such as refund or configuration change.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Formula Calculation formula: The detailed calculation formula for a specific transaction type, such as refund or configuration change.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFormula(String Formula) {
        this.Formula = Formula;
    }

    /**
     * Get Billing rules: Official website links for detailed billing rules of each product.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FormulaUrl Billing rules: Official website links for detailed billing rules of each product.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFormulaUrl() {
        return this.FormulaUrl;
    }

    /**
     * Set Billing rules: Official website links for detailed billing rules of each product.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FormulaUrl Billing rules: Official website links for detailed billing rules of each product.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFormulaUrl(String FormulaUrl) {
        this.FormulaUrl = FormulaUrl;
    }

    /**
     * Get Billing dayNote: This field may return null, indicating that no valid values can be obtained. 
     * @return BillDay Billing dayNote: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBillDay() {
        return this.BillDay;
    }

    /**
     * Set Billing dayNote: This field may return null, indicating that no valid values can be obtained.
     * @param BillDay Billing dayNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBillDay(String BillDay) {
        this.BillDay = BillDay;
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

    /**
     * Get Billing record IDNote: This field may return null, indicating that no valid values can be obtained. 
     * @return Id Billing record IDNote: This field may return null, indicating that no valid values can be obtained.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Billing record IDNote: This field may return null, indicating that no valid values can be obtained.
     * @param Id Billing record IDNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Domestic and international codesNote: This field may return null, indicating that no valid values can be obtained. 
     * @return RegionType Domestic and international codesNote: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegionType() {
        return this.RegionType;
    }

    /**
     * Set Domestic and international codesNote: This field may return null, indicating that no valid values can be obtained.
     * @param RegionType Domestic and international codesNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegionType(String RegionType) {
        this.RegionType = RegionType;
    }

    /**
     * Get Domestic and International: The region type to which the resource belongs (domestic, international)Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RegionTypeName Domestic and International: The region type to which the resource belongs (domestic, international)Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegionTypeName() {
        return this.RegionTypeName;
    }

    /**
     * Set Domestic and International: The region type to which the resource belongs (domestic, international)Note: This field may return null, indicating that no valid values can be obtained.
     * @param RegionTypeName Domestic and International: The region type to which the resource belongs (domestic, international)Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegionTypeName(String RegionTypeName) {
        this.RegionTypeName = RegionTypeName;
    }

    /**
     * Get Note attributes (instance configuration): Other note information, such as the reserved instance, the reserved instance type, the transaction type, and the region information on both ends of the CCN product.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ReserveDetail Note attributes (instance configuration): Other note information, such as the reserved instance, the reserved instance type, the transaction type, and the region information on both ends of the CCN product.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getReserveDetail() {
        return this.ReserveDetail;
    }

    /**
     * Set Note attributes (instance configuration): Other note information, such as the reserved instance, the reserved instance type, the transaction type, and the region information on both ends of the CCN product.Note: This field may return null, indicating that no valid values can be obtained.
     * @param ReserveDetail Note attributes (instance configuration): Other note information, such as the reserved instance, the reserved instance type, the transaction type, and the region information on both ends of the CCN product.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReserveDetail(String ReserveDetail) {
        this.ReserveDetail = ReserveDetail;
    }

    /**
     * Get the discount object for the current consumption item, such as official website discount, user discount, and event discount. 
     * @return DiscountObject the discount object for the current consumption item, such as official website discount, user discount, and event discount.
     */
    public String getDiscountObject() {
        return this.DiscountObject;
    }

    /**
     * Set the discount object for the current consumption item, such as official website discount, user discount, and event discount.
     * @param DiscountObject the discount object for the current consumption item, such as official website discount, user discount, and event discount.
     */
    public void setDiscountObject(String DiscountObject) {
        this.DiscountObject = DiscountObject;
    }

    /**
     * Get the discount type for the current consumption item, such as discount and contract price.
 
     * @return DiscountType the discount type for the current consumption item, such as discount and contract price.

     */
    public String getDiscountType() {
        return this.DiscountType;
    }

    /**
     * Set the discount type for the current consumption item, such as discount and contract price.

     * @param DiscountType the discount type for the current consumption item, such as discount and contract price.

     */
    public void setDiscountType(String DiscountType) {
        this.DiscountType = DiscountType;
    }

    /**
     * Get supplementary description of the discount type, such as 0.2. 
     * @return DiscountContent supplementary description of the discount type, such as 0.2.
     */
    public String getDiscountContent() {
        return this.DiscountContent;
    }

    /**
     * Set supplementary description of the discount type, such as 0.2.
     * @param DiscountContent supplementary description of the discount type, such as 0.2.
     */
    public void setDiscountContent(String DiscountContent) {
        this.DiscountContent = DiscountContent;
    }

    public BillDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BillDetail(BillDetail source) {
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
        if (source.BillId != null) {
            this.BillId = new String(source.BillId);
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
        if (source.ComponentSet != null) {
            this.ComponentSet = new BillDetailComponent[source.ComponentSet.length];
            for (int i = 0; i < source.ComponentSet.length; i++) {
                this.ComponentSet[i] = new BillDetailComponent(source.ComponentSet[i]);
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
        if (source.Tags != null) {
            this.Tags = new BillTagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new BillTagInfo(source.Tags[i]);
            }
        }
        if (source.BusinessCode != null) {
            this.BusinessCode = new String(source.BusinessCode);
        }
        if (source.ProductCode != null) {
            this.ProductCode = new String(source.ProductCode);
        }
        if (source.ActionType != null) {
            this.ActionType = new String(source.ActionType);
        }
        if (source.RegionId != null) {
            this.RegionId = new String(source.RegionId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.PriceInfo != null) {
            this.PriceInfo = new String[source.PriceInfo.length];
            for (int i = 0; i < source.PriceInfo.length; i++) {
                this.PriceInfo[i] = new String(source.PriceInfo[i]);
            }
        }
        if (source.AssociatedOrder != null) {
            this.AssociatedOrder = new BillDetailAssociatedOrder(source.AssociatedOrder);
        }
        if (source.Formula != null) {
            this.Formula = new String(source.Formula);
        }
        if (source.FormulaUrl != null) {
            this.FormulaUrl = new String(source.FormulaUrl);
        }
        if (source.BillDay != null) {
            this.BillDay = new String(source.BillDay);
        }
        if (source.BillMonth != null) {
            this.BillMonth = new String(source.BillMonth);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.RegionType != null) {
            this.RegionType = new String(source.RegionType);
        }
        if (source.RegionTypeName != null) {
            this.RegionTypeName = new String(source.RegionTypeName);
        }
        if (source.ReserveDetail != null) {
            this.ReserveDetail = new String(source.ReserveDetail);
        }
        if (source.DiscountObject != null) {
            this.DiscountObject = new String(source.DiscountObject);
        }
        if (source.DiscountType != null) {
            this.DiscountType = new String(source.DiscountType);
        }
        if (source.DiscountContent != null) {
            this.DiscountContent = new String(source.DiscountContent);
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
        this.setParamSimple(map, prefix + "BillId", this.BillId);
        this.setParamSimple(map, prefix + "PayTime", this.PayTime);
        this.setParamSimple(map, prefix + "FeeBeginTime", this.FeeBeginTime);
        this.setParamSimple(map, prefix + "FeeEndTime", this.FeeEndTime);
        this.setParamArrayObj(map, prefix + "ComponentSet.", this.ComponentSet);
        this.setParamSimple(map, prefix + "PayerUin", this.PayerUin);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "OperateUin", this.OperateUin);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "BusinessCode", this.BusinessCode);
        this.setParamSimple(map, prefix + "ProductCode", this.ProductCode);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "PriceInfo.", this.PriceInfo);
        this.setParamObj(map, prefix + "AssociatedOrder.", this.AssociatedOrder);
        this.setParamSimple(map, prefix + "Formula", this.Formula);
        this.setParamSimple(map, prefix + "FormulaUrl", this.FormulaUrl);
        this.setParamSimple(map, prefix + "BillDay", this.BillDay);
        this.setParamSimple(map, prefix + "BillMonth", this.BillMonth);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "RegionType", this.RegionType);
        this.setParamSimple(map, prefix + "RegionTypeName", this.RegionTypeName);
        this.setParamSimple(map, prefix + "ReserveDetail", this.ReserveDetail);
        this.setParamSimple(map, prefix + "DiscountObject", this.DiscountObject);
        this.setParamSimple(map, prefix + "DiscountType", this.DiscountType);
        this.setParamSimple(map, prefix + "DiscountContent", this.DiscountContent);

    }
}


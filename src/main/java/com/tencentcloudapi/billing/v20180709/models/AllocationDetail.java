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

public class AllocationDetail extends AbstractModel {

    /**
    * Unique identifier of a cost allocation unit
    */
    @SerializedName("TreeNodeUniqKey")
    @Expose
    private String TreeNodeUniqKey;

    /**
    * Name of a cost allocation unit
    */
    @SerializedName("TreeNodeUniqKeyName")
    @Expose
    private String TreeNodeUniqKeyName;

    /**
    * Date: Settlement date
    */
    @SerializedName("BillDate")
    @Expose
    private String BillDate;

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
    * Operator account ID (the resource account ID or role ID opened by prepaid resource ordering or postpaid operation)
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
    * Product name: Various cloud products purchased by users
    */
    @SerializedName("BusinessCodeName")
    @Expose
    private String BusinessCodeName;

    /**
    * Billing mode code
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * Billing mode: Resource billing mode, which can be monthly subscription or pay-as-you-go.
    */
    @SerializedName("PayModeName")
    @Expose
    private String PayModeName;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Project name: The Project to which a resource belongs, which is independently allocated by the user for the resource in the console. If a resource has not been allocated to an Project, it will be a default Project.
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * Region ID
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * Region name: The region where the resource is located
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * AZ ID
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * Availability zone: The availability zone where the resource is located.
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * Resource ID: Resources vary by product, and the content is not identical. For example, Cloud Virtual Machine (CVM) corresponds to the instance ID. If the product is split, it shows the split item ID, such as COS bucket ID and CDN domain name.
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * Instance name: The name set by the user for the resource in the console, which is empty by default if not set. If the product is split, it shows the split resource alias.
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * Instance type code
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Instance type: The type of an instance corresponding to the product service purchased, including resource packages, RI, SP, and spot instances. It is displayed as "-" by default for regular instances.
    */
    @SerializedName("InstanceTypeName")
    @Expose
    private String InstanceTypeName;

    /**
    * Split item ID: The ID of the split item involved in the split product, such as COS bucket ID and CDN domain name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SplitItemId")
    @Expose
    private String SplitItemId;

    /**
    * Split item name: The split item involved in the split product
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SplitItemName")
    @Expose
    private String SplitItemName;

    /**
    * Subproduct code
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
    * Subproduct name: Product subdivision type purchased by the user
    */
    @SerializedName("ProductCodeName")
    @Expose
    private String ProductCodeName;

    /**
    * Transaction type code
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * Transaction type: Detailed transaction type
    */
    @SerializedName("ActionTypeName")
    @Expose
    private String ActionTypeName;

    /**
    * Order ID: The order number for purchase in the annual and monthly billing mode

    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * Transaction ID: The settlement and deduction number
    */
    @SerializedName("BillId")
    @Expose
    private String BillId;

    /**
    * Deduction time: Deduction time
    */
    @SerializedName("PayTime")
    @Expose
    private String PayTime;

    /**
    * Usage start time: Usage start time
    */
    @SerializedName("FeeBeginTime")
    @Expose
    private String FeeBeginTime;

    /**
    * Usage end time: Product or service usage end time
    */
    @SerializedName("FeeEndTime")
    @Expose
    private String FeeEndTime;

    /**
    * Component type code
    */
    @SerializedName("ComponentCode")
    @Expose
    private String ComponentCode;

    /**
    * Component type: The major component category corresponding to the product or service purchased by the user
    */
    @SerializedName("ComponentCodeName")
    @Expose
    private String ComponentCodeName;

    /**
    * Component list price: The original unit price of the component on the portal (not displayed if the customer enjoys a fixed price/contract price)
    */
    @SerializedName("SinglePrice")
    @Expose
    private String SinglePrice;

    /**
    * Component unit price: Discounted unit price of the component. Component unit price = list price * discount.
    */
    @SerializedName("ContractPrice")
    @Expose
    private String ContractPrice;

    /**
    * Component Price Unit: Unit of component price, Unit Composition: CNY/usage unit/duration unit
    */
    @SerializedName("SinglePriceUnit")
    @Expose
    private String SinglePriceUnit;

    /**
    * Component usage: The actual settlement usage of the component, Component Usage = Original Component Usage - Deducted Usage (including resource packages)
    */
    @SerializedName("UsedAmount")
    @Expose
    private String UsedAmount;

    /**
    * Component usage unit: Unit of measurement corresponding to component usage.
    */
    @SerializedName("UsedAmountUnit")
    @Expose
    private String UsedAmountUnit;

    /**
    * Usage duration: The duration of resource usage, Component Usage = Original Component Usage Duration - Deducted Duration (including resource packages)
    */
    @SerializedName("TimeSpan")
    @Expose
    private String TimeSpan;

    /**
    * Duration unit: Unit of resource usage duration.
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * Remark attribute (instance configuration): Additional remark information, such as reserved instance type and transaction type for reserved instances, regional information of both ends for CCN products.
    */
    @SerializedName("ReserveDetail")
    @Expose
    private String ReserveDetail;

    /**
    * Split item usage/duration ratio: Split item usage (duration) ratio, Split Item Usage (Duration) /Total Usage Before Splitting (Duration)
    */
    @SerializedName("SplitRatio")
    @Expose
    private String SplitRatio;

    /**
    * Original price of a component: Original Price = Component List Price * Component Usage * Duration of Use (not displayed if the customer enjoys a fixed price/contract price, and not displayed by default in refund scenarios), specified price mode
    */
    @SerializedName("TotalCost")
    @Expose
    private String TotalCost;

    /**
    * Reserved instance deduction duration: The duration of use deducted by reserved instances for this product or service.
    */
    @SerializedName("RITimeSpan")
    @Expose
    private String RITimeSpan;

    /**
    * Original price deducted by a reserved instance: The original price of a component deducted by reserved instances for this product or service
    */
    @SerializedName("RICost")
    @Expose
    private String RICost;

    /**
    * Savings plan deduction from original price: Savings Plan Deduction from Original Price = Monetary Value of Savings Plan Deduction/ Savings Plan Deduction Rate
    */
    @SerializedName("SPCost")
    @Expose
    private String SPCost;

    /**
    * Discount rate: The discount rate enjoyed by this resource (it is not shown by default if the customer enjoys a fixed/contract price, and it is also not shown by default in the refund scenario)
    */
    @SerializedName("Discount")
    @Expose
    private String Discount;

    /**
    * Mixed discount rate: The final discount rate after integrating various discount deductions. Mixed Discount Rate = Discounted total price/Original Price.
    */
    @SerializedName("BlendedDiscount")
    @Expose
    private String BlendedDiscount;

    /**
    * Discounted total: discounted total = (Original Price - Original Price Deducted by a Reserved Instance - Savings Plan Deduction from Original Price) * Discount Rate
    */
    @SerializedName("RealTotalCost")
    @Expose
    private String RealTotalCost;

    /**
    * Cash account expenditure (CNY): The amount paid through the cash account
    */
    @SerializedName("CashPayAmount")
    @Expose
    private String CashPayAmount;

    /**
    * Promo voucher expenditure (CNY): The amount paid using various vouchers (such as promo vouchers and cash vouchers)
    */
    @SerializedName("VoucherPayAmount")
    @Expose
    private String VoucherPayAmount;

    /**
    * Gift account expenditure (CNY): The amount paid using free credits
    */
    @SerializedName("IncentivePayAmount")
    @Expose
    private String IncentivePayAmount;

    /**
    * Royalty account expenditure (CNY): The amount paid through the royalty account
    */
    @SerializedName("TransferPayAmount")
    @Expose
    private String TransferPayAmount;

    /**
    * Allocation tag: The resource-bound tag
    */
    @SerializedName("Tag")
    @Expose
    private BillTag [] Tag;

    /**
    * Domestic and international codes
    */
    @SerializedName("RegionType")
    @Expose
    private String RegionType;

    /**
    * Domestic and international: Resource region type (domestic, international)
    */
    @SerializedName("RegionTypeName")
    @Expose
    private String RegionTypeName;

    /**
    * Component name code
    */
    @SerializedName("ItemCode")
    @Expose
    private String ItemCode;

    /**
    * Component name: The specific component of a product or service purchased by the user
    */
    @SerializedName("ItemCodeName")
    @Expose
    private String ItemCodeName;

    /**
    * Associated document ID: Document ID associated with this transaction, such as the original new purchase order corresponding to a refund order
    */
    @SerializedName("AssociatedOrder")
    @Expose
    private String AssociatedOrder;

    /**
    * Price attribute: Other attributes of the component that affect discount pricing besides unit price and duration
    */
    @SerializedName("PriceInfo")
    @Expose
    private String [] PriceInfo;

    /**
    * Calculation rule explanation: A detailed explanation to calculations of billing settlement for special transaction types, such as refund and configuration changes.
    */
    @SerializedName("Formula")
    @Expose
    private String Formula;

    /**
    * Billing Rules: The detailed billing rules for each product shown in the portal explanation link
    */
    @SerializedName("FormulaUrl")
    @Expose
    private String FormulaUrl;

    /**
    * Original usage/duration: The original usage of the component before deduction by resource packages.
(Currently only TRTC, TEM, Cloud Call Center, and CDZ products support this information display. Other products are being integrated.)
    */
    @SerializedName("RealTotalMeasure")
    @Expose
    private String RealTotalMeasure;

    /**
    * Deduction of usage/duration (including resource packages): The amount of usage deducted by resource packages
(Currently only TRTC, TEM, Cloud Call Center, and CDZ products support this information display. Other products are being integrated.)
    */
    @SerializedName("DeductedMeasure")
    @Expose
    private String DeductedMeasure;

    /**
    * Configuration description: Information on specification of resource configuration
    */
    @SerializedName("ComponentConfig")
    @Expose
    private String ComponentConfig;

    /**
    * Cost collection type: The source types of fees, including allocated, collection and unallocated.
0 - Allocation
1 - Collection
2 - Unallocated
    */
    @SerializedName("AllocationType")
    @Expose
    private Long AllocationType;

    /**
    * CostBeforeTax
    */
    @SerializedName("CostBeforeTax")
    @Expose
    private String CostBeforeTax;

    /**
    * Tax
    */
    @SerializedName("Tax")
    @Expose
    private String Tax;

    /**
    * AmountBeforeTax
    */
    @SerializedName("AmountBeforeTax")
    @Expose
    private String AmountBeforeTax;

    /**
    * Discount object of the current consumption item, such as official website discount, user discount and activity discount.
    */
    @SerializedName("DiscountObject")
    @Expose
    private String DiscountObject;

    /**
    * Discount type of the current consumption item, such as discount and contract price.
    */
    @SerializedName("DiscountType")
    @Expose
    private String DiscountType;

    /**
    * Supplementary description of the offer type, for example: business discount 20% off, the offer type is "discount" and the discount content is "0.8".
    */
    @SerializedName("DiscountContent")
    @Expose
    private String DiscountContent;

    /**
    * SPDeduction
    */
    @SerializedName("SPDeduction")
    @Expose
    private String SPDeduction;

    /**
    * SPDeduction
    */
    @SerializedName("SPDeductionRate")
    @Expose
    private String SPDeductionRate;

    /**
    * Currency
    */
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
    * Billing month
    */
    @SerializedName("BillMonth")
    @Expose
    private String BillMonth;

    /**
    * tax rate
    */
    @SerializedName("TaxRate")
    @Expose
    private String TaxRate;

    /**
     * Get Unique identifier of a cost allocation unit 
     * @return TreeNodeUniqKey Unique identifier of a cost allocation unit
     */
    public String getTreeNodeUniqKey() {
        return this.TreeNodeUniqKey;
    }

    /**
     * Set Unique identifier of a cost allocation unit
     * @param TreeNodeUniqKey Unique identifier of a cost allocation unit
     */
    public void setTreeNodeUniqKey(String TreeNodeUniqKey) {
        this.TreeNodeUniqKey = TreeNodeUniqKey;
    }

    /**
     * Get Name of a cost allocation unit 
     * @return TreeNodeUniqKeyName Name of a cost allocation unit
     */
    public String getTreeNodeUniqKeyName() {
        return this.TreeNodeUniqKeyName;
    }

    /**
     * Set Name of a cost allocation unit
     * @param TreeNodeUniqKeyName Name of a cost allocation unit
     */
    public void setTreeNodeUniqKeyName(String TreeNodeUniqKeyName) {
        this.TreeNodeUniqKeyName = TreeNodeUniqKeyName;
    }

    /**
     * Get Date: Settlement date 
     * @return BillDate Date: Settlement date
     */
    public String getBillDate() {
        return this.BillDate;
    }

    /**
     * Set Date: Settlement date
     * @param BillDate Date: Settlement date
     */
    public void setBillDate(String BillDate) {
        this.BillDate = BillDate;
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
     * Get Operator account ID (the resource account ID or role ID opened by prepaid resource ordering or postpaid operation) 
     * @return OperateUin Operator account ID (the resource account ID or role ID opened by prepaid resource ordering or postpaid operation)
     */
    public String getOperateUin() {
        return this.OperateUin;
    }

    /**
     * Set Operator account ID (the resource account ID or role ID opened by prepaid resource ordering or postpaid operation)
     * @param OperateUin Operator account ID (the resource account ID or role ID opened by prepaid resource ordering or postpaid operation)
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
     * Get Product name: Various cloud products purchased by users 
     * @return BusinessCodeName Product name: Various cloud products purchased by users
     */
    public String getBusinessCodeName() {
        return this.BusinessCodeName;
    }

    /**
     * Set Product name: Various cloud products purchased by users
     * @param BusinessCodeName Product name: Various cloud products purchased by users
     */
    public void setBusinessCodeName(String BusinessCodeName) {
        this.BusinessCodeName = BusinessCodeName;
    }

    /**
     * Get Billing mode code 
     * @return PayMode Billing mode code
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Billing mode code
     * @param PayMode Billing mode code
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Billing mode: Resource billing mode, which can be monthly subscription or pay-as-you-go. 
     * @return PayModeName Billing mode: Resource billing mode, which can be monthly subscription or pay-as-you-go.
     */
    public String getPayModeName() {
        return this.PayModeName;
    }

    /**
     * Set Billing mode: Resource billing mode, which can be monthly subscription or pay-as-you-go.
     * @param PayModeName Billing mode: Resource billing mode, which can be monthly subscription or pay-as-you-go.
     */
    public void setPayModeName(String PayModeName) {
        this.PayModeName = PayModeName;
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
     * Get Project name: The Project to which a resource belongs, which is independently allocated by the user for the resource in the console. If a resource has not been allocated to an Project, it will be a default Project. 
     * @return ProjectName Project name: The Project to which a resource belongs, which is independently allocated by the user for the resource in the console. If a resource has not been allocated to an Project, it will be a default Project.
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set Project name: The Project to which a resource belongs, which is independently allocated by the user for the resource in the console. If a resource has not been allocated to an Project, it will be a default Project.
     * @param ProjectName Project name: The Project to which a resource belongs, which is independently allocated by the user for the resource in the console. If a resource has not been allocated to an Project, it will be a default Project.
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
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
     * Get Region name: The region where the resource is located 
     * @return RegionName Region name: The region where the resource is located
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set Region name: The region where the resource is located
     * @param RegionName Region name: The region where the resource is located
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get AZ ID 
     * @return ZoneId AZ ID
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set AZ ID
     * @param ZoneId AZ ID
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Availability zone: The availability zone where the resource is located. 
     * @return ZoneName Availability zone: The availability zone where the resource is located.
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set Availability zone: The availability zone where the resource is located.
     * @param ZoneName Availability zone: The availability zone where the resource is located.
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get Resource ID: Resources vary by product, and the content is not identical. For example, Cloud Virtual Machine (CVM) corresponds to the instance ID. If the product is split, it shows the split item ID, such as COS bucket ID and CDN domain name. 
     * @return ResourceId Resource ID: Resources vary by product, and the content is not identical. For example, Cloud Virtual Machine (CVM) corresponds to the instance ID. If the product is split, it shows the split item ID, such as COS bucket ID and CDN domain name.
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Resource ID: Resources vary by product, and the content is not identical. For example, Cloud Virtual Machine (CVM) corresponds to the instance ID. If the product is split, it shows the split item ID, such as COS bucket ID and CDN domain name.
     * @param ResourceId Resource ID: Resources vary by product, and the content is not identical. For example, Cloud Virtual Machine (CVM) corresponds to the instance ID. If the product is split, it shows the split item ID, such as COS bucket ID and CDN domain name.
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get Instance name: The name set by the user for the resource in the console, which is empty by default if not set. If the product is split, it shows the split resource alias. 
     * @return ResourceName Instance name: The name set by the user for the resource in the console, which is empty by default if not set. If the product is split, it shows the split resource alias.
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set Instance name: The name set by the user for the resource in the console, which is empty by default if not set. If the product is split, it shows the split resource alias.
     * @param ResourceName Instance name: The name set by the user for the resource in the console, which is empty by default if not set. If the product is split, it shows the split resource alias.
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get Instance type code 
     * @return InstanceType Instance type code
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance type code
     * @param InstanceType Instance type code
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Instance type: The type of an instance corresponding to the product service purchased, including resource packages, RI, SP, and spot instances. It is displayed as "-" by default for regular instances. 
     * @return InstanceTypeName Instance type: The type of an instance corresponding to the product service purchased, including resource packages, RI, SP, and spot instances. It is displayed as "-" by default for regular instances.
     */
    public String getInstanceTypeName() {
        return this.InstanceTypeName;
    }

    /**
     * Set Instance type: The type of an instance corresponding to the product service purchased, including resource packages, RI, SP, and spot instances. It is displayed as "-" by default for regular instances.
     * @param InstanceTypeName Instance type: The type of an instance corresponding to the product service purchased, including resource packages, RI, SP, and spot instances. It is displayed as "-" by default for regular instances.
     */
    public void setInstanceTypeName(String InstanceTypeName) {
        this.InstanceTypeName = InstanceTypeName;
    }

    /**
     * Get Split item ID: The ID of the split item involved in the split product, such as COS bucket ID and CDN domain name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SplitItemId Split item ID: The ID of the split item involved in the split product, such as COS bucket ID and CDN domain name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public String getSplitItemId() {
        return this.SplitItemId;
    }

    /**
     * Set Split item ID: The ID of the split item involved in the split product, such as COS bucket ID and CDN domain name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SplitItemId Split item ID: The ID of the split item involved in the split product, such as COS bucket ID and CDN domain name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setSplitItemId(String SplitItemId) {
        this.SplitItemId = SplitItemId;
    }

    /**
     * Get Split item name: The split item involved in the split product
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SplitItemName Split item name: The split item involved in the split product
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public String getSplitItemName() {
        return this.SplitItemName;
    }

    /**
     * Set Split item name: The split item involved in the split product
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SplitItemName Split item name: The split item involved in the split product
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setSplitItemName(String SplitItemName) {
        this.SplitItemName = SplitItemName;
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
     * Get Subproduct name: Product subdivision type purchased by the user 
     * @return ProductCodeName Subproduct name: Product subdivision type purchased by the user
     */
    public String getProductCodeName() {
        return this.ProductCodeName;
    }

    /**
     * Set Subproduct name: Product subdivision type purchased by the user
     * @param ProductCodeName Subproduct name: Product subdivision type purchased by the user
     */
    public void setProductCodeName(String ProductCodeName) {
        this.ProductCodeName = ProductCodeName;
    }

    /**
     * Get Transaction type code 
     * @return ActionType Transaction type code
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set Transaction type code
     * @param ActionType Transaction type code
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get Transaction type: Detailed transaction type 
     * @return ActionTypeName Transaction type: Detailed transaction type
     */
    public String getActionTypeName() {
        return this.ActionTypeName;
    }

    /**
     * Set Transaction type: Detailed transaction type
     * @param ActionTypeName Transaction type: Detailed transaction type
     */
    public void setActionTypeName(String ActionTypeName) {
        this.ActionTypeName = ActionTypeName;
    }

    /**
     * Get Order ID: The order number for purchase in the annual and monthly billing mode
 
     * @return OrderId Order ID: The order number for purchase in the annual and monthly billing mode

     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set Order ID: The order number for purchase in the annual and monthly billing mode

     * @param OrderId Order ID: The order number for purchase in the annual and monthly billing mode

     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get Transaction ID: The settlement and deduction number 
     * @return BillId Transaction ID: The settlement and deduction number
     */
    public String getBillId() {
        return this.BillId;
    }

    /**
     * Set Transaction ID: The settlement and deduction number
     * @param BillId Transaction ID: The settlement and deduction number
     */
    public void setBillId(String BillId) {
        this.BillId = BillId;
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
     * Get Usage start time: Usage start time 
     * @return FeeBeginTime Usage start time: Usage start time
     */
    public String getFeeBeginTime() {
        return this.FeeBeginTime;
    }

    /**
     * Set Usage start time: Usage start time
     * @param FeeBeginTime Usage start time: Usage start time
     */
    public void setFeeBeginTime(String FeeBeginTime) {
        this.FeeBeginTime = FeeBeginTime;
    }

    /**
     * Get Usage end time: Product or service usage end time 
     * @return FeeEndTime Usage end time: Product or service usage end time
     */
    public String getFeeEndTime() {
        return this.FeeEndTime;
    }

    /**
     * Set Usage end time: Product or service usage end time
     * @param FeeEndTime Usage end time: Product or service usage end time
     */
    public void setFeeEndTime(String FeeEndTime) {
        this.FeeEndTime = FeeEndTime;
    }

    /**
     * Get Component type code 
     * @return ComponentCode Component type code
     */
    public String getComponentCode() {
        return this.ComponentCode;
    }

    /**
     * Set Component type code
     * @param ComponentCode Component type code
     */
    public void setComponentCode(String ComponentCode) {
        this.ComponentCode = ComponentCode;
    }

    /**
     * Get Component type: The major component category corresponding to the product or service purchased by the user 
     * @return ComponentCodeName Component type: The major component category corresponding to the product or service purchased by the user
     */
    public String getComponentCodeName() {
        return this.ComponentCodeName;
    }

    /**
     * Set Component type: The major component category corresponding to the product or service purchased by the user
     * @param ComponentCodeName Component type: The major component category corresponding to the product or service purchased by the user
     */
    public void setComponentCodeName(String ComponentCodeName) {
        this.ComponentCodeName = ComponentCodeName;
    }

    /**
     * Get Component list price: The original unit price of the component on the portal (not displayed if the customer enjoys a fixed price/contract price) 
     * @return SinglePrice Component list price: The original unit price of the component on the portal (not displayed if the customer enjoys a fixed price/contract price)
     */
    public String getSinglePrice() {
        return this.SinglePrice;
    }

    /**
     * Set Component list price: The original unit price of the component on the portal (not displayed if the customer enjoys a fixed price/contract price)
     * @param SinglePrice Component list price: The original unit price of the component on the portal (not displayed if the customer enjoys a fixed price/contract price)
     */
    public void setSinglePrice(String SinglePrice) {
        this.SinglePrice = SinglePrice;
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
     * Get Component Price Unit: Unit of component price, Unit Composition: CNY/usage unit/duration unit 
     * @return SinglePriceUnit Component Price Unit: Unit of component price, Unit Composition: CNY/usage unit/duration unit
     */
    public String getSinglePriceUnit() {
        return this.SinglePriceUnit;
    }

    /**
     * Set Component Price Unit: Unit of component price, Unit Composition: CNY/usage unit/duration unit
     * @param SinglePriceUnit Component Price Unit: Unit of component price, Unit Composition: CNY/usage unit/duration unit
     */
    public void setSinglePriceUnit(String SinglePriceUnit) {
        this.SinglePriceUnit = SinglePriceUnit;
    }

    /**
     * Get Component usage: The actual settlement usage of the component, Component Usage = Original Component Usage - Deducted Usage (including resource packages) 
     * @return UsedAmount Component usage: The actual settlement usage of the component, Component Usage = Original Component Usage - Deducted Usage (including resource packages)
     */
    public String getUsedAmount() {
        return this.UsedAmount;
    }

    /**
     * Set Component usage: The actual settlement usage of the component, Component Usage = Original Component Usage - Deducted Usage (including resource packages)
     * @param UsedAmount Component usage: The actual settlement usage of the component, Component Usage = Original Component Usage - Deducted Usage (including resource packages)
     */
    public void setUsedAmount(String UsedAmount) {
        this.UsedAmount = UsedAmount;
    }

    /**
     * Get Component usage unit: Unit of measurement corresponding to component usage. 
     * @return UsedAmountUnit Component usage unit: Unit of measurement corresponding to component usage.
     */
    public String getUsedAmountUnit() {
        return this.UsedAmountUnit;
    }

    /**
     * Set Component usage unit: Unit of measurement corresponding to component usage.
     * @param UsedAmountUnit Component usage unit: Unit of measurement corresponding to component usage.
     */
    public void setUsedAmountUnit(String UsedAmountUnit) {
        this.UsedAmountUnit = UsedAmountUnit;
    }

    /**
     * Get Usage duration: The duration of resource usage, Component Usage = Original Component Usage Duration - Deducted Duration (including resource packages) 
     * @return TimeSpan Usage duration: The duration of resource usage, Component Usage = Original Component Usage Duration - Deducted Duration (including resource packages)
     */
    public String getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set Usage duration: The duration of resource usage, Component Usage = Original Component Usage Duration - Deducted Duration (including resource packages)
     * @param TimeSpan Usage duration: The duration of resource usage, Component Usage = Original Component Usage Duration - Deducted Duration (including resource packages)
     */
    public void setTimeSpan(String TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get Duration unit: Unit of resource usage duration. 
     * @return TimeUnit Duration unit: Unit of resource usage duration.
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set Duration unit: Unit of resource usage duration.
     * @param TimeUnit Duration unit: Unit of resource usage duration.
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get Remark attribute (instance configuration): Additional remark information, such as reserved instance type and transaction type for reserved instances, regional information of both ends for CCN products. 
     * @return ReserveDetail Remark attribute (instance configuration): Additional remark information, such as reserved instance type and transaction type for reserved instances, regional information of both ends for CCN products.
     */
    public String getReserveDetail() {
        return this.ReserveDetail;
    }

    /**
     * Set Remark attribute (instance configuration): Additional remark information, such as reserved instance type and transaction type for reserved instances, regional information of both ends for CCN products.
     * @param ReserveDetail Remark attribute (instance configuration): Additional remark information, such as reserved instance type and transaction type for reserved instances, regional information of both ends for CCN products.
     */
    public void setReserveDetail(String ReserveDetail) {
        this.ReserveDetail = ReserveDetail;
    }

    /**
     * Get Split item usage/duration ratio: Split item usage (duration) ratio, Split Item Usage (Duration) /Total Usage Before Splitting (Duration) 
     * @return SplitRatio Split item usage/duration ratio: Split item usage (duration) ratio, Split Item Usage (Duration) /Total Usage Before Splitting (Duration)
     */
    public String getSplitRatio() {
        return this.SplitRatio;
    }

    /**
     * Set Split item usage/duration ratio: Split item usage (duration) ratio, Split Item Usage (Duration) /Total Usage Before Splitting (Duration)
     * @param SplitRatio Split item usage/duration ratio: Split item usage (duration) ratio, Split Item Usage (Duration) /Total Usage Before Splitting (Duration)
     */
    public void setSplitRatio(String SplitRatio) {
        this.SplitRatio = SplitRatio;
    }

    /**
     * Get Original price of a component: Original Price = Component List Price * Component Usage * Duration of Use (not displayed if the customer enjoys a fixed price/contract price, and not displayed by default in refund scenarios), specified price mode 
     * @return TotalCost Original price of a component: Original Price = Component List Price * Component Usage * Duration of Use (not displayed if the customer enjoys a fixed price/contract price, and not displayed by default in refund scenarios), specified price mode
     */
    public String getTotalCost() {
        return this.TotalCost;
    }

    /**
     * Set Original price of a component: Original Price = Component List Price * Component Usage * Duration of Use (not displayed if the customer enjoys a fixed price/contract price, and not displayed by default in refund scenarios), specified price mode
     * @param TotalCost Original price of a component: Original Price = Component List Price * Component Usage * Duration of Use (not displayed if the customer enjoys a fixed price/contract price, and not displayed by default in refund scenarios), specified price mode
     */
    public void setTotalCost(String TotalCost) {
        this.TotalCost = TotalCost;
    }

    /**
     * Get Reserved instance deduction duration: The duration of use deducted by reserved instances for this product or service. 
     * @return RITimeSpan Reserved instance deduction duration: The duration of use deducted by reserved instances for this product or service.
     */
    public String getRITimeSpan() {
        return this.RITimeSpan;
    }

    /**
     * Set Reserved instance deduction duration: The duration of use deducted by reserved instances for this product or service.
     * @param RITimeSpan Reserved instance deduction duration: The duration of use deducted by reserved instances for this product or service.
     */
    public void setRITimeSpan(String RITimeSpan) {
        this.RITimeSpan = RITimeSpan;
    }

    /**
     * Get Original price deducted by a reserved instance: The original price of a component deducted by reserved instances for this product or service 
     * @return RICost Original price deducted by a reserved instance: The original price of a component deducted by reserved instances for this product or service
     */
    public String getRICost() {
        return this.RICost;
    }

    /**
     * Set Original price deducted by a reserved instance: The original price of a component deducted by reserved instances for this product or service
     * @param RICost Original price deducted by a reserved instance: The original price of a component deducted by reserved instances for this product or service
     */
    public void setRICost(String RICost) {
        this.RICost = RICost;
    }

    /**
     * Get Savings plan deduction from original price: Savings Plan Deduction from Original Price = Monetary Value of Savings Plan Deduction/ Savings Plan Deduction Rate 
     * @return SPCost Savings plan deduction from original price: Savings Plan Deduction from Original Price = Monetary Value of Savings Plan Deduction/ Savings Plan Deduction Rate
     */
    public String getSPCost() {
        return this.SPCost;
    }

    /**
     * Set Savings plan deduction from original price: Savings Plan Deduction from Original Price = Monetary Value of Savings Plan Deduction/ Savings Plan Deduction Rate
     * @param SPCost Savings plan deduction from original price: Savings Plan Deduction from Original Price = Monetary Value of Savings Plan Deduction/ Savings Plan Deduction Rate
     */
    public void setSPCost(String SPCost) {
        this.SPCost = SPCost;
    }

    /**
     * Get Discount rate: The discount rate enjoyed by this resource (it is not shown by default if the customer enjoys a fixed/contract price, and it is also not shown by default in the refund scenario) 
     * @return Discount Discount rate: The discount rate enjoyed by this resource (it is not shown by default if the customer enjoys a fixed/contract price, and it is also not shown by default in the refund scenario)
     */
    public String getDiscount() {
        return this.Discount;
    }

    /**
     * Set Discount rate: The discount rate enjoyed by this resource (it is not shown by default if the customer enjoys a fixed/contract price, and it is also not shown by default in the refund scenario)
     * @param Discount Discount rate: The discount rate enjoyed by this resource (it is not shown by default if the customer enjoys a fixed/contract price, and it is also not shown by default in the refund scenario)
     */
    public void setDiscount(String Discount) {
        this.Discount = Discount;
    }

    /**
     * Get Mixed discount rate: The final discount rate after integrating various discount deductions. Mixed Discount Rate = Discounted total price/Original Price. 
     * @return BlendedDiscount Mixed discount rate: The final discount rate after integrating various discount deductions. Mixed Discount Rate = Discounted total price/Original Price.
     */
    public String getBlendedDiscount() {
        return this.BlendedDiscount;
    }

    /**
     * Set Mixed discount rate: The final discount rate after integrating various discount deductions. Mixed Discount Rate = Discounted total price/Original Price.
     * @param BlendedDiscount Mixed discount rate: The final discount rate after integrating various discount deductions. Mixed Discount Rate = Discounted total price/Original Price.
     */
    public void setBlendedDiscount(String BlendedDiscount) {
        this.BlendedDiscount = BlendedDiscount;
    }

    /**
     * Get Discounted total: discounted total = (Original Price - Original Price Deducted by a Reserved Instance - Savings Plan Deduction from Original Price) * Discount Rate 
     * @return RealTotalCost Discounted total: discounted total = (Original Price - Original Price Deducted by a Reserved Instance - Savings Plan Deduction from Original Price) * Discount Rate
     */
    public String getRealTotalCost() {
        return this.RealTotalCost;
    }

    /**
     * Set Discounted total: discounted total = (Original Price - Original Price Deducted by a Reserved Instance - Savings Plan Deduction from Original Price) * Discount Rate
     * @param RealTotalCost Discounted total: discounted total = (Original Price - Original Price Deducted by a Reserved Instance - Savings Plan Deduction from Original Price) * Discount Rate
     */
    public void setRealTotalCost(String RealTotalCost) {
        this.RealTotalCost = RealTotalCost;
    }

    /**
     * Get Cash account expenditure (CNY): The amount paid through the cash account 
     * @return CashPayAmount Cash account expenditure (CNY): The amount paid through the cash account
     */
    public String getCashPayAmount() {
        return this.CashPayAmount;
    }

    /**
     * Set Cash account expenditure (CNY): The amount paid through the cash account
     * @param CashPayAmount Cash account expenditure (CNY): The amount paid through the cash account
     */
    public void setCashPayAmount(String CashPayAmount) {
        this.CashPayAmount = CashPayAmount;
    }

    /**
     * Get Promo voucher expenditure (CNY): The amount paid using various vouchers (such as promo vouchers and cash vouchers) 
     * @return VoucherPayAmount Promo voucher expenditure (CNY): The amount paid using various vouchers (such as promo vouchers and cash vouchers)
     */
    public String getVoucherPayAmount() {
        return this.VoucherPayAmount;
    }

    /**
     * Set Promo voucher expenditure (CNY): The amount paid using various vouchers (such as promo vouchers and cash vouchers)
     * @param VoucherPayAmount Promo voucher expenditure (CNY): The amount paid using various vouchers (such as promo vouchers and cash vouchers)
     */
    public void setVoucherPayAmount(String VoucherPayAmount) {
        this.VoucherPayAmount = VoucherPayAmount;
    }

    /**
     * Get Gift account expenditure (CNY): The amount paid using free credits 
     * @return IncentivePayAmount Gift account expenditure (CNY): The amount paid using free credits
     */
    public String getIncentivePayAmount() {
        return this.IncentivePayAmount;
    }

    /**
     * Set Gift account expenditure (CNY): The amount paid using free credits
     * @param IncentivePayAmount Gift account expenditure (CNY): The amount paid using free credits
     */
    public void setIncentivePayAmount(String IncentivePayAmount) {
        this.IncentivePayAmount = IncentivePayAmount;
    }

    /**
     * Get Royalty account expenditure (CNY): The amount paid through the royalty account 
     * @return TransferPayAmount Royalty account expenditure (CNY): The amount paid through the royalty account
     */
    public String getTransferPayAmount() {
        return this.TransferPayAmount;
    }

    /**
     * Set Royalty account expenditure (CNY): The amount paid through the royalty account
     * @param TransferPayAmount Royalty account expenditure (CNY): The amount paid through the royalty account
     */
    public void setTransferPayAmount(String TransferPayAmount) {
        this.TransferPayAmount = TransferPayAmount;
    }

    /**
     * Get Allocation tag: The resource-bound tag 
     * @return Tag Allocation tag: The resource-bound tag
     */
    public BillTag [] getTag() {
        return this.Tag;
    }

    /**
     * Set Allocation tag: The resource-bound tag
     * @param Tag Allocation tag: The resource-bound tag
     */
    public void setTag(BillTag [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get Domestic and international codes 
     * @return RegionType Domestic and international codes
     */
    public String getRegionType() {
        return this.RegionType;
    }

    /**
     * Set Domestic and international codes
     * @param RegionType Domestic and international codes
     */
    public void setRegionType(String RegionType) {
        this.RegionType = RegionType;
    }

    /**
     * Get Domestic and international: Resource region type (domestic, international) 
     * @return RegionTypeName Domestic and international: Resource region type (domestic, international)
     */
    public String getRegionTypeName() {
        return this.RegionTypeName;
    }

    /**
     * Set Domestic and international: Resource region type (domestic, international)
     * @param RegionTypeName Domestic and international: Resource region type (domestic, international)
     */
    public void setRegionTypeName(String RegionTypeName) {
        this.RegionTypeName = RegionTypeName;
    }

    /**
     * Get Component name code 
     * @return ItemCode Component name code
     */
    public String getItemCode() {
        return this.ItemCode;
    }

    /**
     * Set Component name code
     * @param ItemCode Component name code
     */
    public void setItemCode(String ItemCode) {
        this.ItemCode = ItemCode;
    }

    /**
     * Get Component name: The specific component of a product or service purchased by the user 
     * @return ItemCodeName Component name: The specific component of a product or service purchased by the user
     */
    public String getItemCodeName() {
        return this.ItemCodeName;
    }

    /**
     * Set Component name: The specific component of a product or service purchased by the user
     * @param ItemCodeName Component name: The specific component of a product or service purchased by the user
     */
    public void setItemCodeName(String ItemCodeName) {
        this.ItemCodeName = ItemCodeName;
    }

    /**
     * Get Associated document ID: Document ID associated with this transaction, such as the original new purchase order corresponding to a refund order 
     * @return AssociatedOrder Associated document ID: Document ID associated with this transaction, such as the original new purchase order corresponding to a refund order
     */
    public String getAssociatedOrder() {
        return this.AssociatedOrder;
    }

    /**
     * Set Associated document ID: Document ID associated with this transaction, such as the original new purchase order corresponding to a refund order
     * @param AssociatedOrder Associated document ID: Document ID associated with this transaction, such as the original new purchase order corresponding to a refund order
     */
    public void setAssociatedOrder(String AssociatedOrder) {
        this.AssociatedOrder = AssociatedOrder;
    }

    /**
     * Get Price attribute: Other attributes of the component that affect discount pricing besides unit price and duration 
     * @return PriceInfo Price attribute: Other attributes of the component that affect discount pricing besides unit price and duration
     */
    public String [] getPriceInfo() {
        return this.PriceInfo;
    }

    /**
     * Set Price attribute: Other attributes of the component that affect discount pricing besides unit price and duration
     * @param PriceInfo Price attribute: Other attributes of the component that affect discount pricing besides unit price and duration
     */
    public void setPriceInfo(String [] PriceInfo) {
        this.PriceInfo = PriceInfo;
    }

    /**
     * Get Calculation rule explanation: A detailed explanation to calculations of billing settlement for special transaction types, such as refund and configuration changes. 
     * @return Formula Calculation rule explanation: A detailed explanation to calculations of billing settlement for special transaction types, such as refund and configuration changes.
     */
    public String getFormula() {
        return this.Formula;
    }

    /**
     * Set Calculation rule explanation: A detailed explanation to calculations of billing settlement for special transaction types, such as refund and configuration changes.
     * @param Formula Calculation rule explanation: A detailed explanation to calculations of billing settlement for special transaction types, such as refund and configuration changes.
     */
    public void setFormula(String Formula) {
        this.Formula = Formula;
    }

    /**
     * Get Billing Rules: The detailed billing rules for each product shown in the portal explanation link 
     * @return FormulaUrl Billing Rules: The detailed billing rules for each product shown in the portal explanation link
     */
    public String getFormulaUrl() {
        return this.FormulaUrl;
    }

    /**
     * Set Billing Rules: The detailed billing rules for each product shown in the portal explanation link
     * @param FormulaUrl Billing Rules: The detailed billing rules for each product shown in the portal explanation link
     */
    public void setFormulaUrl(String FormulaUrl) {
        this.FormulaUrl = FormulaUrl;
    }

    /**
     * Get Original usage/duration: The original usage of the component before deduction by resource packages.
(Currently only TRTC, TEM, Cloud Call Center, and CDZ products support this information display. Other products are being integrated.) 
     * @return RealTotalMeasure Original usage/duration: The original usage of the component before deduction by resource packages.
(Currently only TRTC, TEM, Cloud Call Center, and CDZ products support this information display. Other products are being integrated.)
     */
    public String getRealTotalMeasure() {
        return this.RealTotalMeasure;
    }

    /**
     * Set Original usage/duration: The original usage of the component before deduction by resource packages.
(Currently only TRTC, TEM, Cloud Call Center, and CDZ products support this information display. Other products are being integrated.)
     * @param RealTotalMeasure Original usage/duration: The original usage of the component before deduction by resource packages.
(Currently only TRTC, TEM, Cloud Call Center, and CDZ products support this information display. Other products are being integrated.)
     */
    public void setRealTotalMeasure(String RealTotalMeasure) {
        this.RealTotalMeasure = RealTotalMeasure;
    }

    /**
     * Get Deduction of usage/duration (including resource packages): The amount of usage deducted by resource packages
(Currently only TRTC, TEM, Cloud Call Center, and CDZ products support this information display. Other products are being integrated.) 
     * @return DeductedMeasure Deduction of usage/duration (including resource packages): The amount of usage deducted by resource packages
(Currently only TRTC, TEM, Cloud Call Center, and CDZ products support this information display. Other products are being integrated.)
     */
    public String getDeductedMeasure() {
        return this.DeductedMeasure;
    }

    /**
     * Set Deduction of usage/duration (including resource packages): The amount of usage deducted by resource packages
(Currently only TRTC, TEM, Cloud Call Center, and CDZ products support this information display. Other products are being integrated.)
     * @param DeductedMeasure Deduction of usage/duration (including resource packages): The amount of usage deducted by resource packages
(Currently only TRTC, TEM, Cloud Call Center, and CDZ products support this information display. Other products are being integrated.)
     */
    public void setDeductedMeasure(String DeductedMeasure) {
        this.DeductedMeasure = DeductedMeasure;
    }

    /**
     * Get Configuration description: Information on specification of resource configuration 
     * @return ComponentConfig Configuration description: Information on specification of resource configuration
     */
    public String getComponentConfig() {
        return this.ComponentConfig;
    }

    /**
     * Set Configuration description: Information on specification of resource configuration
     * @param ComponentConfig Configuration description: Information on specification of resource configuration
     */
    public void setComponentConfig(String ComponentConfig) {
        this.ComponentConfig = ComponentConfig;
    }

    /**
     * Get Cost collection type: The source types of fees, including allocated, collection and unallocated.
0 - Allocation
1 - Collection
2 - Unallocated 
     * @return AllocationType Cost collection type: The source types of fees, including allocated, collection and unallocated.
0 - Allocation
1 - Collection
2 - Unallocated
     */
    public Long getAllocationType() {
        return this.AllocationType;
    }

    /**
     * Set Cost collection type: The source types of fees, including allocated, collection and unallocated.
0 - Allocation
1 - Collection
2 - Unallocated
     * @param AllocationType Cost collection type: The source types of fees, including allocated, collection and unallocated.
0 - Allocation
1 - Collection
2 - Unallocated
     */
    public void setAllocationType(Long AllocationType) {
        this.AllocationType = AllocationType;
    }

    /**
     * Get CostBeforeTax 
     * @return CostBeforeTax CostBeforeTax
     */
    public String getCostBeforeTax() {
        return this.CostBeforeTax;
    }

    /**
     * Set CostBeforeTax
     * @param CostBeforeTax CostBeforeTax
     */
    public void setCostBeforeTax(String CostBeforeTax) {
        this.CostBeforeTax = CostBeforeTax;
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
     * Get AmountBeforeTax 
     * @return AmountBeforeTax AmountBeforeTax
     */
    public String getAmountBeforeTax() {
        return this.AmountBeforeTax;
    }

    /**
     * Set AmountBeforeTax
     * @param AmountBeforeTax AmountBeforeTax
     */
    public void setAmountBeforeTax(String AmountBeforeTax) {
        this.AmountBeforeTax = AmountBeforeTax;
    }

    /**
     * Get Discount object of the current consumption item, such as official website discount, user discount and activity discount. 
     * @return DiscountObject Discount object of the current consumption item, such as official website discount, user discount and activity discount.
     */
    public String getDiscountObject() {
        return this.DiscountObject;
    }

    /**
     * Set Discount object of the current consumption item, such as official website discount, user discount and activity discount.
     * @param DiscountObject Discount object of the current consumption item, such as official website discount, user discount and activity discount.
     */
    public void setDiscountObject(String DiscountObject) {
        this.DiscountObject = DiscountObject;
    }

    /**
     * Get Discount type of the current consumption item, such as discount and contract price. 
     * @return DiscountType Discount type of the current consumption item, such as discount and contract price.
     */
    public String getDiscountType() {
        return this.DiscountType;
    }

    /**
     * Set Discount type of the current consumption item, such as discount and contract price.
     * @param DiscountType Discount type of the current consumption item, such as discount and contract price.
     */
    public void setDiscountType(String DiscountType) {
        this.DiscountType = DiscountType;
    }

    /**
     * Get Supplementary description of the offer type, for example: business discount 20% off, the offer type is "discount" and the discount content is "0.8". 
     * @return DiscountContent Supplementary description of the offer type, for example: business discount 20% off, the offer type is "discount" and the discount content is "0.8".
     */
    public String getDiscountContent() {
        return this.DiscountContent;
    }

    /**
     * Set Supplementary description of the offer type, for example: business discount 20% off, the offer type is "discount" and the discount content is "0.8".
     * @param DiscountContent Supplementary description of the offer type, for example: business discount 20% off, the offer type is "discount" and the discount content is "0.8".
     */
    public void setDiscountContent(String DiscountContent) {
        this.DiscountContent = DiscountContent;
    }

    /**
     * Get SPDeduction 
     * @return SPDeduction SPDeduction
     */
    public String getSPDeduction() {
        return this.SPDeduction;
    }

    /**
     * Set SPDeduction
     * @param SPDeduction SPDeduction
     */
    public void setSPDeduction(String SPDeduction) {
        this.SPDeduction = SPDeduction;
    }

    /**
     * Get SPDeduction 
     * @return SPDeductionRate SPDeduction
     */
    public String getSPDeductionRate() {
        return this.SPDeductionRate;
    }

    /**
     * Set SPDeduction
     * @param SPDeductionRate SPDeduction
     */
    public void setSPDeductionRate(String SPDeductionRate) {
        this.SPDeductionRate = SPDeductionRate;
    }

    /**
     * Get Currency 
     * @return Currency Currency
     */
    public String getCurrency() {
        return this.Currency;
    }

    /**
     * Set Currency
     * @param Currency Currency
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    /**
     * Get Billing month 
     * @return BillMonth Billing month
     */
    public String getBillMonth() {
        return this.BillMonth;
    }

    /**
     * Set Billing month
     * @param BillMonth Billing month
     */
    public void setBillMonth(String BillMonth) {
        this.BillMonth = BillMonth;
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

    public AllocationDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AllocationDetail(AllocationDetail source) {
        if (source.TreeNodeUniqKey != null) {
            this.TreeNodeUniqKey = new String(source.TreeNodeUniqKey);
        }
        if (source.TreeNodeUniqKeyName != null) {
            this.TreeNodeUniqKeyName = new String(source.TreeNodeUniqKeyName);
        }
        if (source.BillDate != null) {
            this.BillDate = new String(source.BillDate);
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
        if (source.BusinessCodeName != null) {
            this.BusinessCodeName = new String(source.BusinessCodeName);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.PayModeName != null) {
            this.PayModeName = new String(source.PayModeName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
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
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceTypeName != null) {
            this.InstanceTypeName = new String(source.InstanceTypeName);
        }
        if (source.SplitItemId != null) {
            this.SplitItemId = new String(source.SplitItemId);
        }
        if (source.SplitItemName != null) {
            this.SplitItemName = new String(source.SplitItemName);
        }
        if (source.ProductCode != null) {
            this.ProductCode = new String(source.ProductCode);
        }
        if (source.ProductCodeName != null) {
            this.ProductCodeName = new String(source.ProductCodeName);
        }
        if (source.ActionType != null) {
            this.ActionType = new String(source.ActionType);
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
        if (source.ComponentCode != null) {
            this.ComponentCode = new String(source.ComponentCode);
        }
        if (source.ComponentCodeName != null) {
            this.ComponentCodeName = new String(source.ComponentCodeName);
        }
        if (source.SinglePrice != null) {
            this.SinglePrice = new String(source.SinglePrice);
        }
        if (source.ContractPrice != null) {
            this.ContractPrice = new String(source.ContractPrice);
        }
        if (source.SinglePriceUnit != null) {
            this.SinglePriceUnit = new String(source.SinglePriceUnit);
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
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.ReserveDetail != null) {
            this.ReserveDetail = new String(source.ReserveDetail);
        }
        if (source.SplitRatio != null) {
            this.SplitRatio = new String(source.SplitRatio);
        }
        if (source.TotalCost != null) {
            this.TotalCost = new String(source.TotalCost);
        }
        if (source.RITimeSpan != null) {
            this.RITimeSpan = new String(source.RITimeSpan);
        }
        if (source.RICost != null) {
            this.RICost = new String(source.RICost);
        }
        if (source.SPCost != null) {
            this.SPCost = new String(source.SPCost);
        }
        if (source.Discount != null) {
            this.Discount = new String(source.Discount);
        }
        if (source.BlendedDiscount != null) {
            this.BlendedDiscount = new String(source.BlendedDiscount);
        }
        if (source.RealTotalCost != null) {
            this.RealTotalCost = new String(source.RealTotalCost);
        }
        if (source.CashPayAmount != null) {
            this.CashPayAmount = new String(source.CashPayAmount);
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
        if (source.Tag != null) {
            this.Tag = new BillTag[source.Tag.length];
            for (int i = 0; i < source.Tag.length; i++) {
                this.Tag[i] = new BillTag(source.Tag[i]);
            }
        }
        if (source.RegionType != null) {
            this.RegionType = new String(source.RegionType);
        }
        if (source.RegionTypeName != null) {
            this.RegionTypeName = new String(source.RegionTypeName);
        }
        if (source.ItemCode != null) {
            this.ItemCode = new String(source.ItemCode);
        }
        if (source.ItemCodeName != null) {
            this.ItemCodeName = new String(source.ItemCodeName);
        }
        if (source.AssociatedOrder != null) {
            this.AssociatedOrder = new String(source.AssociatedOrder);
        }
        if (source.PriceInfo != null) {
            this.PriceInfo = new String[source.PriceInfo.length];
            for (int i = 0; i < source.PriceInfo.length; i++) {
                this.PriceInfo[i] = new String(source.PriceInfo[i]);
            }
        }
        if (source.Formula != null) {
            this.Formula = new String(source.Formula);
        }
        if (source.FormulaUrl != null) {
            this.FormulaUrl = new String(source.FormulaUrl);
        }
        if (source.RealTotalMeasure != null) {
            this.RealTotalMeasure = new String(source.RealTotalMeasure);
        }
        if (source.DeductedMeasure != null) {
            this.DeductedMeasure = new String(source.DeductedMeasure);
        }
        if (source.ComponentConfig != null) {
            this.ComponentConfig = new String(source.ComponentConfig);
        }
        if (source.AllocationType != null) {
            this.AllocationType = new Long(source.AllocationType);
        }
        if (source.CostBeforeTax != null) {
            this.CostBeforeTax = new String(source.CostBeforeTax);
        }
        if (source.Tax != null) {
            this.Tax = new String(source.Tax);
        }
        if (source.AmountBeforeTax != null) {
            this.AmountBeforeTax = new String(source.AmountBeforeTax);
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
        if (source.SPDeduction != null) {
            this.SPDeduction = new String(source.SPDeduction);
        }
        if (source.SPDeductionRate != null) {
            this.SPDeductionRate = new String(source.SPDeductionRate);
        }
        if (source.Currency != null) {
            this.Currency = new String(source.Currency);
        }
        if (source.BillMonth != null) {
            this.BillMonth = new String(source.BillMonth);
        }
        if (source.TaxRate != null) {
            this.TaxRate = new String(source.TaxRate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TreeNodeUniqKey", this.TreeNodeUniqKey);
        this.setParamSimple(map, prefix + "TreeNodeUniqKeyName", this.TreeNodeUniqKeyName);
        this.setParamSimple(map, prefix + "BillDate", this.BillDate);
        this.setParamSimple(map, prefix + "PayerUin", this.PayerUin);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "OperateUin", this.OperateUin);
        this.setParamSimple(map, prefix + "BusinessCode", this.BusinessCode);
        this.setParamSimple(map, prefix + "BusinessCodeName", this.BusinessCodeName);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "PayModeName", this.PayModeName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceTypeName", this.InstanceTypeName);
        this.setParamSimple(map, prefix + "SplitItemId", this.SplitItemId);
        this.setParamSimple(map, prefix + "SplitItemName", this.SplitItemName);
        this.setParamSimple(map, prefix + "ProductCode", this.ProductCode);
        this.setParamSimple(map, prefix + "ProductCodeName", this.ProductCodeName);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "ActionTypeName", this.ActionTypeName);
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "BillId", this.BillId);
        this.setParamSimple(map, prefix + "PayTime", this.PayTime);
        this.setParamSimple(map, prefix + "FeeBeginTime", this.FeeBeginTime);
        this.setParamSimple(map, prefix + "FeeEndTime", this.FeeEndTime);
        this.setParamSimple(map, prefix + "ComponentCode", this.ComponentCode);
        this.setParamSimple(map, prefix + "ComponentCodeName", this.ComponentCodeName);
        this.setParamSimple(map, prefix + "SinglePrice", this.SinglePrice);
        this.setParamSimple(map, prefix + "ContractPrice", this.ContractPrice);
        this.setParamSimple(map, prefix + "SinglePriceUnit", this.SinglePriceUnit);
        this.setParamSimple(map, prefix + "UsedAmount", this.UsedAmount);
        this.setParamSimple(map, prefix + "UsedAmountUnit", this.UsedAmountUnit);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "ReserveDetail", this.ReserveDetail);
        this.setParamSimple(map, prefix + "SplitRatio", this.SplitRatio);
        this.setParamSimple(map, prefix + "TotalCost", this.TotalCost);
        this.setParamSimple(map, prefix + "RITimeSpan", this.RITimeSpan);
        this.setParamSimple(map, prefix + "RICost", this.RICost);
        this.setParamSimple(map, prefix + "SPCost", this.SPCost);
        this.setParamSimple(map, prefix + "Discount", this.Discount);
        this.setParamSimple(map, prefix + "BlendedDiscount", this.BlendedDiscount);
        this.setParamSimple(map, prefix + "RealTotalCost", this.RealTotalCost);
        this.setParamSimple(map, prefix + "CashPayAmount", this.CashPayAmount);
        this.setParamSimple(map, prefix + "VoucherPayAmount", this.VoucherPayAmount);
        this.setParamSimple(map, prefix + "IncentivePayAmount", this.IncentivePayAmount);
        this.setParamSimple(map, prefix + "TransferPayAmount", this.TransferPayAmount);
        this.setParamArrayObj(map, prefix + "Tag.", this.Tag);
        this.setParamSimple(map, prefix + "RegionType", this.RegionType);
        this.setParamSimple(map, prefix + "RegionTypeName", this.RegionTypeName);
        this.setParamSimple(map, prefix + "ItemCode", this.ItemCode);
        this.setParamSimple(map, prefix + "ItemCodeName", this.ItemCodeName);
        this.setParamSimple(map, prefix + "AssociatedOrder", this.AssociatedOrder);
        this.setParamArraySimple(map, prefix + "PriceInfo.", this.PriceInfo);
        this.setParamSimple(map, prefix + "Formula", this.Formula);
        this.setParamSimple(map, prefix + "FormulaUrl", this.FormulaUrl);
        this.setParamSimple(map, prefix + "RealTotalMeasure", this.RealTotalMeasure);
        this.setParamSimple(map, prefix + "DeductedMeasure", this.DeductedMeasure);
        this.setParamSimple(map, prefix + "ComponentConfig", this.ComponentConfig);
        this.setParamSimple(map, prefix + "AllocationType", this.AllocationType);
        this.setParamSimple(map, prefix + "CostBeforeTax", this.CostBeforeTax);
        this.setParamSimple(map, prefix + "Tax", this.Tax);
        this.setParamSimple(map, prefix + "AmountBeforeTax", this.AmountBeforeTax);
        this.setParamSimple(map, prefix + "DiscountObject", this.DiscountObject);
        this.setParamSimple(map, prefix + "DiscountType", this.DiscountType);
        this.setParamSimple(map, prefix + "DiscountContent", this.DiscountContent);
        this.setParamSimple(map, prefix + "SPDeduction", this.SPDeduction);
        this.setParamSimple(map, prefix + "SPDeductionRate", this.SPDeductionRate);
        this.setParamSimple(map, prefix + "Currency", this.Currency);
        this.setParamSimple(map, prefix + "BillMonth", this.BillMonth);
        this.setParamSimple(map, prefix + "TaxRate", this.TaxRate);

    }
}


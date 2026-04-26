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

public class GatherResourceSummary extends AbstractModel {

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
    * Allocation rule ID hit by the resource
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * Allocation rule name hit by the resource
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

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
    * Allocation tag: The resource-bound tag
    */
    @SerializedName("Tag")
    @Expose
    private BillTag [] Tag;

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
    * Cost collection type: The source types of fees, including allocated, collection and unallocated.
0 - Allocation
1 - Collection
-1 - Unallocated
    */
    @SerializedName("AllocationType")
    @Expose
    private Long AllocationType;

    /**
    * Information of the current allocation unit
    */
    @SerializedName("BelongTreeNodeUniqKey")
    @Expose
    private AllocationTreeNode BelongTreeNodeUniqKey;

    /**
    * Information on allocation rules hit by the current resource
    */
    @SerializedName("BelongRule")
    @Expose
    private AllocationRule BelongRule;

    /**
    * Information on other allocation units
    */
    @SerializedName("OtherTreeNodeUniqKeys")
    @Expose
    private AllocationTreeNode [] OtherTreeNodeUniqKeys;

    /**
    * Information on other hit rules
    */
    @SerializedName("OtherRules")
    @Expose
    private AllocationRule [] OtherRules;

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
    * Split item ID: The ID of the split item involved in the split product, such as COS bucket ID and CDN domain name
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
     * Get Allocation rule ID hit by the resource 
     * @return RuleId Allocation rule ID hit by the resource
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Allocation rule ID hit by the resource
     * @param RuleId Allocation rule ID hit by the resource
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Allocation rule name hit by the resource 
     * @return RuleName Allocation rule name hit by the resource
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Allocation rule name hit by the resource
     * @param RuleName Allocation rule name hit by the resource
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
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
     * Get Cost collection type: The source types of fees, including allocated, collection and unallocated.
0 - Allocation
1 - Collection
-1 - Unallocated 
     * @return AllocationType Cost collection type: The source types of fees, including allocated, collection and unallocated.
0 - Allocation
1 - Collection
-1 - Unallocated
     */
    public Long getAllocationType() {
        return this.AllocationType;
    }

    /**
     * Set Cost collection type: The source types of fees, including allocated, collection and unallocated.
0 - Allocation
1 - Collection
-1 - Unallocated
     * @param AllocationType Cost collection type: The source types of fees, including allocated, collection and unallocated.
0 - Allocation
1 - Collection
-1 - Unallocated
     */
    public void setAllocationType(Long AllocationType) {
        this.AllocationType = AllocationType;
    }

    /**
     * Get Information of the current allocation unit 
     * @return BelongTreeNodeUniqKey Information of the current allocation unit
     */
    public AllocationTreeNode getBelongTreeNodeUniqKey() {
        return this.BelongTreeNodeUniqKey;
    }

    /**
     * Set Information of the current allocation unit
     * @param BelongTreeNodeUniqKey Information of the current allocation unit
     */
    public void setBelongTreeNodeUniqKey(AllocationTreeNode BelongTreeNodeUniqKey) {
        this.BelongTreeNodeUniqKey = BelongTreeNodeUniqKey;
    }

    /**
     * Get Information on allocation rules hit by the current resource 
     * @return BelongRule Information on allocation rules hit by the current resource
     */
    public AllocationRule getBelongRule() {
        return this.BelongRule;
    }

    /**
     * Set Information on allocation rules hit by the current resource
     * @param BelongRule Information on allocation rules hit by the current resource
     */
    public void setBelongRule(AllocationRule BelongRule) {
        this.BelongRule = BelongRule;
    }

    /**
     * Get Information on other allocation units 
     * @return OtherTreeNodeUniqKeys Information on other allocation units
     */
    public AllocationTreeNode [] getOtherTreeNodeUniqKeys() {
        return this.OtherTreeNodeUniqKeys;
    }

    /**
     * Set Information on other allocation units
     * @param OtherTreeNodeUniqKeys Information on other allocation units
     */
    public void setOtherTreeNodeUniqKeys(AllocationTreeNode [] OtherTreeNodeUniqKeys) {
        this.OtherTreeNodeUniqKeys = OtherTreeNodeUniqKeys;
    }

    /**
     * Get Information on other hit rules 
     * @return OtherRules Information on other hit rules
     */
    public AllocationRule [] getOtherRules() {
        return this.OtherRules;
    }

    /**
     * Set Information on other hit rules
     * @param OtherRules Information on other hit rules
     */
    public void setOtherRules(AllocationRule [] OtherRules) {
        this.OtherRules = OtherRules;
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
     * Get Split item ID: The ID of the split item involved in the split product, such as COS bucket ID and CDN domain name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SplitItemId Split item ID: The ID of the split item involved in the split product, such as COS bucket ID and CDN domain name
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public String getSplitItemId() {
        return this.SplitItemId;
    }

    /**
     * Set Split item ID: The ID of the split item involved in the split product, such as COS bucket ID and CDN domain name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SplitItemId Split item ID: The ID of the split item involved in the split product, such as COS bucket ID and CDN domain name
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

    public GatherResourceSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GatherResourceSummary(GatherResourceSummary source) {
        if (source.PayerUin != null) {
            this.PayerUin = new String(source.PayerUin);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.OperateUin != null) {
            this.OperateUin = new String(source.OperateUin);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceTypeName != null) {
            this.InstanceTypeName = new String(source.InstanceTypeName);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.TreeNodeUniqKey != null) {
            this.TreeNodeUniqKey = new String(source.TreeNodeUniqKey);
        }
        if (source.TreeNodeUniqKeyName != null) {
            this.TreeNodeUniqKeyName = new String(source.TreeNodeUniqKeyName);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.BusinessCode != null) {
            this.BusinessCode = new String(source.BusinessCode);
        }
        if (source.BusinessCodeName != null) {
            this.BusinessCodeName = new String(source.BusinessCodeName);
        }
        if (source.ItemCode != null) {
            this.ItemCode = new String(source.ItemCode);
        }
        if (source.ItemCodeName != null) {
            this.ItemCodeName = new String(source.ItemCodeName);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.Tag != null) {
            this.Tag = new BillTag[source.Tag.length];
            for (int i = 0; i < source.Tag.length; i++) {
                this.Tag[i] = new BillTag(source.Tag[i]);
            }
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
        if (source.AllocationType != null) {
            this.AllocationType = new Long(source.AllocationType);
        }
        if (source.BelongTreeNodeUniqKey != null) {
            this.BelongTreeNodeUniqKey = new AllocationTreeNode(source.BelongTreeNodeUniqKey);
        }
        if (source.BelongRule != null) {
            this.BelongRule = new AllocationRule(source.BelongRule);
        }
        if (source.OtherTreeNodeUniqKeys != null) {
            this.OtherTreeNodeUniqKeys = new AllocationTreeNode[source.OtherTreeNodeUniqKeys.length];
            for (int i = 0; i < source.OtherTreeNodeUniqKeys.length; i++) {
                this.OtherTreeNodeUniqKeys[i] = new AllocationTreeNode(source.OtherTreeNodeUniqKeys[i]);
            }
        }
        if (source.OtherRules != null) {
            this.OtherRules = new AllocationRule[source.OtherRules.length];
            for (int i = 0; i < source.OtherRules.length; i++) {
                this.OtherRules[i] = new AllocationRule(source.OtherRules[i]);
            }
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.ProductCode != null) {
            this.ProductCode = new String(source.ProductCode);
        }
        if (source.ProductCodeName != null) {
            this.ProductCodeName = new String(source.ProductCodeName);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.PayModeName != null) {
            this.PayModeName = new String(source.PayModeName);
        }
        if (source.ActionType != null) {
            this.ActionType = new String(source.ActionType);
        }
        if (source.ActionTypeName != null) {
            this.ActionTypeName = new String(source.ActionTypeName);
        }
        if (source.SplitItemId != null) {
            this.SplitItemId = new String(source.SplitItemId);
        }
        if (source.SplitItemName != null) {
            this.SplitItemName = new String(source.SplitItemName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PayerUin", this.PayerUin);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "OperateUin", this.OperateUin);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceTypeName", this.InstanceTypeName);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "TreeNodeUniqKey", this.TreeNodeUniqKey);
        this.setParamSimple(map, prefix + "TreeNodeUniqKeyName", this.TreeNodeUniqKeyName);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "BusinessCode", this.BusinessCode);
        this.setParamSimple(map, prefix + "BusinessCodeName", this.BusinessCodeName);
        this.setParamSimple(map, prefix + "ItemCode", this.ItemCode);
        this.setParamSimple(map, prefix + "ItemCodeName", this.ItemCodeName);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamArrayObj(map, prefix + "Tag.", this.Tag);
        this.setParamSimple(map, prefix + "RealTotalCost", this.RealTotalCost);
        this.setParamSimple(map, prefix + "CashPayAmount", this.CashPayAmount);
        this.setParamSimple(map, prefix + "VoucherPayAmount", this.VoucherPayAmount);
        this.setParamSimple(map, prefix + "IncentivePayAmount", this.IncentivePayAmount);
        this.setParamSimple(map, prefix + "TransferPayAmount", this.TransferPayAmount);
        this.setParamSimple(map, prefix + "AllocationType", this.AllocationType);
        this.setParamObj(map, prefix + "BelongTreeNodeUniqKey.", this.BelongTreeNodeUniqKey);
        this.setParamObj(map, prefix + "BelongRule.", this.BelongRule);
        this.setParamArrayObj(map, prefix + "OtherTreeNodeUniqKeys.", this.OtherTreeNodeUniqKeys);
        this.setParamArrayObj(map, prefix + "OtherRules.", this.OtherRules);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "ProductCode", this.ProductCode);
        this.setParamSimple(map, prefix + "ProductCodeName", this.ProductCodeName);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "PayModeName", this.PayModeName);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "ActionTypeName", this.ActionTypeName);
        this.setParamSimple(map, prefix + "SplitItemId", this.SplitItemId);
        this.setParamSimple(map, prefix + "SplitItemName", this.SplitItemName);

    }
}


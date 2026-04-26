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

public class AllocationSummaryByBusiness extends AbstractModel {

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
    * Collected fees (cash): Cash directly collected to the cost allocation unit based on the collection rules
    */
    @SerializedName("GatherCashPayAmount")
    @Expose
    private String GatherCashPayAmount;

    /**
    * Collected fees (voucher): Resource vouchers directly collected to the cost allocation unit based on the collection rules
    */
    @SerializedName("GatherVoucherPayAmount")
    @Expose
    private String GatherVoucherPayAmount;

    /**
    * Collected fees (free credit): Resource free credit directly collected to the cost allocation unit based on the collection rules
    */
    @SerializedName("GatherIncentivePayAmount")
    @Expose
    private String GatherIncentivePayAmount;

    /**
    * Collected fees (royalty amount): Resource royalty amount directly collected to the cost allocation unit based on the collection rules
    */
    @SerializedName("GatherTransferPayAmount")
    @Expose
    private String GatherTransferPayAmount;

    /**
    * Allocated fees (cash): Resource cash allocated to the cost allocation unit based on the allocation rules
    */
    @SerializedName("AllocateCashPayAmount")
    @Expose
    private String AllocateCashPayAmount;

    /**
    * Allocated fees (voucher): Resource vouchers allocated to the cost allocation unit based on the allocation rules
    */
    @SerializedName("AllocateVoucherPayAmount")
    @Expose
    private String AllocateVoucherPayAmount;

    /**
    * Allocated fees (free credit): Resource free credit allocated to the cost allocation unit based on the allocation rules
    */
    @SerializedName("AllocateIncentivePayAmount")
    @Expose
    private String AllocateIncentivePayAmount;

    /**
    * Allocated fees (royalty amount): Resource royalty amount allocated to the cost allocation unit based on the allocation rules
    */
    @SerializedName("AllocateTransferPayAmount")
    @Expose
    private String AllocateTransferPayAmount;

    /**
    * Total fees (cash): Total fees of the cost allocation unit, Collected Fees (Cash) + Allocated fees (Cash)
    */
    @SerializedName("TotalCashPayAmount")
    @Expose
    private String TotalCashPayAmount;

    /**
    * Total fees (voucher): Total fees of the cost allocation unit, Collected Fees (Vouchers) + Allocated fees (Vouchers)
    */
    @SerializedName("TotalVoucherPayAmount")
    @Expose
    private String TotalVoucherPayAmount;

    /**
    * Total fees (free credit): Total fees of the cost allocation unit, Collected Fees (Free Credit) + Allocated fees (Free Credit)
    */
    @SerializedName("TotalIncentivePayAmount")
    @Expose
    private String TotalIncentivePayAmount;

    /**
    * Total fees (royalty amount): Total fees of the cost allocation unit, Collected Fees (Royalty Amount) + Allocated fees (Royalty Amount)
    */
    @SerializedName("TotalTransferPayAmount")
    @Expose
    private String TotalTransferPayAmount;

    /**
    * Collected fees (discounted total): Total resource amount after discount directly collected to the cost allocation unit based on the collection rules
    */
    @SerializedName("GatherRealCost")
    @Expose
    private String GatherRealCost;

    /**
    * Allocated fees (discounted total): Total resource amount after discount allocated to the cost allocation unit based on the allocation rules
    */
    @SerializedName("AllocateRealCost")
    @Expose
    private String AllocateRealCost;

    /**
    * Total fees (discounted total): Total fees of the cost allocation unit, Collected Fees (discounted total) + Allocated fees (discounted total)
    */
    @SerializedName("RealTotalCost")
    @Expose
    private String RealTotalCost;

    /**
    * Proportion (discounted total): Total fees (discounted total) of the Cost Allocation Unit/Total Fees (discounted total) * 100%
    */
    @SerializedName("Ratio")
    @Expose
    private String Ratio;

    /**
    * Month-on-month ratio (discounted total): [Total fees (discounted total) of the cost allocation unit in this month - Total fees (discounted total) of the cost allocation unit in the previous month]/Total fees (discounted total) of the cost allocation unit in the previous month * 100%
    */
    @SerializedName("Trend")
    @Expose
    private String Trend;

    /**
    * Sequential Comparison Arrow
upward - Upward
downward - Downward
none - Stable
    */
    @SerializedName("TrendType")
    @Expose
    private String TrendType;

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
    * Original price of a component: Original Price = Component List Price * Component Usage * Duration of Use (not displayed if the customer enjoys a fixed price/contract price, and not displayed by default in refund scenarios), specified price mode
    */
    @SerializedName("TotalCost")
    @Expose
    private String TotalCost;

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
    * Discounted total: discounted total = (Original Price - Original Price Deducted by a Reserved Instance - Savings Plan Deduction from Original Price) * Discount Rate
    */
    @SerializedName("AllocationRealTotalCost")
    @Expose
    private String AllocationRealTotalCost;

    /**
    * Collected fees (tax): Tax directly collected to the cost allocation unit based on the collection rules
    */
    @SerializedName("GatherTax")
    @Expose
    private String GatherTax;

    /**
    * Allocated fees (tax): Resource tax allocated to the cost allocation unit based on the allocation rules
    */
    @SerializedName("AllocateTax")
    @Expose
    private String AllocateTax;

    /**
    * Total fees (tax): Total fees of the cost allocation unit, Collected Fees (Tax) + Allocated fees (Tax)
    */
    @SerializedName("TotalTax")
    @Expose
    private String TotalTax;

    /**
    * GatherCostBeforeTax
    */
    @SerializedName("GatherCostBeforeTax")
    @Expose
    private String GatherCostBeforeTax;

    /**
    * AllocateCostBeforeTax
    */
    @SerializedName("AllocateCostBeforeTax")
    @Expose
    private String AllocateCostBeforeTax;

    /**
    * TotalCostBeforeTax
    */
    @SerializedName("TotalCostBeforeTax")
    @Expose
    private String TotalCostBeforeTax;

    /**
    * Tax
    */
    @SerializedName("Tax")
    @Expose
    private String Tax;

    /**
    * CostBeforeTax
    */
    @SerializedName("CostBeforeTax")
    @Expose
    private String CostBeforeTax;

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
     * Get Collected fees (cash): Cash directly collected to the cost allocation unit based on the collection rules 
     * @return GatherCashPayAmount Collected fees (cash): Cash directly collected to the cost allocation unit based on the collection rules
     */
    public String getGatherCashPayAmount() {
        return this.GatherCashPayAmount;
    }

    /**
     * Set Collected fees (cash): Cash directly collected to the cost allocation unit based on the collection rules
     * @param GatherCashPayAmount Collected fees (cash): Cash directly collected to the cost allocation unit based on the collection rules
     */
    public void setGatherCashPayAmount(String GatherCashPayAmount) {
        this.GatherCashPayAmount = GatherCashPayAmount;
    }

    /**
     * Get Collected fees (voucher): Resource vouchers directly collected to the cost allocation unit based on the collection rules 
     * @return GatherVoucherPayAmount Collected fees (voucher): Resource vouchers directly collected to the cost allocation unit based on the collection rules
     */
    public String getGatherVoucherPayAmount() {
        return this.GatherVoucherPayAmount;
    }

    /**
     * Set Collected fees (voucher): Resource vouchers directly collected to the cost allocation unit based on the collection rules
     * @param GatherVoucherPayAmount Collected fees (voucher): Resource vouchers directly collected to the cost allocation unit based on the collection rules
     */
    public void setGatherVoucherPayAmount(String GatherVoucherPayAmount) {
        this.GatherVoucherPayAmount = GatherVoucherPayAmount;
    }

    /**
     * Get Collected fees (free credit): Resource free credit directly collected to the cost allocation unit based on the collection rules 
     * @return GatherIncentivePayAmount Collected fees (free credit): Resource free credit directly collected to the cost allocation unit based on the collection rules
     */
    public String getGatherIncentivePayAmount() {
        return this.GatherIncentivePayAmount;
    }

    /**
     * Set Collected fees (free credit): Resource free credit directly collected to the cost allocation unit based on the collection rules
     * @param GatherIncentivePayAmount Collected fees (free credit): Resource free credit directly collected to the cost allocation unit based on the collection rules
     */
    public void setGatherIncentivePayAmount(String GatherIncentivePayAmount) {
        this.GatherIncentivePayAmount = GatherIncentivePayAmount;
    }

    /**
     * Get Collected fees (royalty amount): Resource royalty amount directly collected to the cost allocation unit based on the collection rules 
     * @return GatherTransferPayAmount Collected fees (royalty amount): Resource royalty amount directly collected to the cost allocation unit based on the collection rules
     */
    public String getGatherTransferPayAmount() {
        return this.GatherTransferPayAmount;
    }

    /**
     * Set Collected fees (royalty amount): Resource royalty amount directly collected to the cost allocation unit based on the collection rules
     * @param GatherTransferPayAmount Collected fees (royalty amount): Resource royalty amount directly collected to the cost allocation unit based on the collection rules
     */
    public void setGatherTransferPayAmount(String GatherTransferPayAmount) {
        this.GatherTransferPayAmount = GatherTransferPayAmount;
    }

    /**
     * Get Allocated fees (cash): Resource cash allocated to the cost allocation unit based on the allocation rules 
     * @return AllocateCashPayAmount Allocated fees (cash): Resource cash allocated to the cost allocation unit based on the allocation rules
     */
    public String getAllocateCashPayAmount() {
        return this.AllocateCashPayAmount;
    }

    /**
     * Set Allocated fees (cash): Resource cash allocated to the cost allocation unit based on the allocation rules
     * @param AllocateCashPayAmount Allocated fees (cash): Resource cash allocated to the cost allocation unit based on the allocation rules
     */
    public void setAllocateCashPayAmount(String AllocateCashPayAmount) {
        this.AllocateCashPayAmount = AllocateCashPayAmount;
    }

    /**
     * Get Allocated fees (voucher): Resource vouchers allocated to the cost allocation unit based on the allocation rules 
     * @return AllocateVoucherPayAmount Allocated fees (voucher): Resource vouchers allocated to the cost allocation unit based on the allocation rules
     */
    public String getAllocateVoucherPayAmount() {
        return this.AllocateVoucherPayAmount;
    }

    /**
     * Set Allocated fees (voucher): Resource vouchers allocated to the cost allocation unit based on the allocation rules
     * @param AllocateVoucherPayAmount Allocated fees (voucher): Resource vouchers allocated to the cost allocation unit based on the allocation rules
     */
    public void setAllocateVoucherPayAmount(String AllocateVoucherPayAmount) {
        this.AllocateVoucherPayAmount = AllocateVoucherPayAmount;
    }

    /**
     * Get Allocated fees (free credit): Resource free credit allocated to the cost allocation unit based on the allocation rules 
     * @return AllocateIncentivePayAmount Allocated fees (free credit): Resource free credit allocated to the cost allocation unit based on the allocation rules
     */
    public String getAllocateIncentivePayAmount() {
        return this.AllocateIncentivePayAmount;
    }

    /**
     * Set Allocated fees (free credit): Resource free credit allocated to the cost allocation unit based on the allocation rules
     * @param AllocateIncentivePayAmount Allocated fees (free credit): Resource free credit allocated to the cost allocation unit based on the allocation rules
     */
    public void setAllocateIncentivePayAmount(String AllocateIncentivePayAmount) {
        this.AllocateIncentivePayAmount = AllocateIncentivePayAmount;
    }

    /**
     * Get Allocated fees (royalty amount): Resource royalty amount allocated to the cost allocation unit based on the allocation rules 
     * @return AllocateTransferPayAmount Allocated fees (royalty amount): Resource royalty amount allocated to the cost allocation unit based on the allocation rules
     */
    public String getAllocateTransferPayAmount() {
        return this.AllocateTransferPayAmount;
    }

    /**
     * Set Allocated fees (royalty amount): Resource royalty amount allocated to the cost allocation unit based on the allocation rules
     * @param AllocateTransferPayAmount Allocated fees (royalty amount): Resource royalty amount allocated to the cost allocation unit based on the allocation rules
     */
    public void setAllocateTransferPayAmount(String AllocateTransferPayAmount) {
        this.AllocateTransferPayAmount = AllocateTransferPayAmount;
    }

    /**
     * Get Total fees (cash): Total fees of the cost allocation unit, Collected Fees (Cash) + Allocated fees (Cash) 
     * @return TotalCashPayAmount Total fees (cash): Total fees of the cost allocation unit, Collected Fees (Cash) + Allocated fees (Cash)
     */
    public String getTotalCashPayAmount() {
        return this.TotalCashPayAmount;
    }

    /**
     * Set Total fees (cash): Total fees of the cost allocation unit, Collected Fees (Cash) + Allocated fees (Cash)
     * @param TotalCashPayAmount Total fees (cash): Total fees of the cost allocation unit, Collected Fees (Cash) + Allocated fees (Cash)
     */
    public void setTotalCashPayAmount(String TotalCashPayAmount) {
        this.TotalCashPayAmount = TotalCashPayAmount;
    }

    /**
     * Get Total fees (voucher): Total fees of the cost allocation unit, Collected Fees (Vouchers) + Allocated fees (Vouchers) 
     * @return TotalVoucherPayAmount Total fees (voucher): Total fees of the cost allocation unit, Collected Fees (Vouchers) + Allocated fees (Vouchers)
     */
    public String getTotalVoucherPayAmount() {
        return this.TotalVoucherPayAmount;
    }

    /**
     * Set Total fees (voucher): Total fees of the cost allocation unit, Collected Fees (Vouchers) + Allocated fees (Vouchers)
     * @param TotalVoucherPayAmount Total fees (voucher): Total fees of the cost allocation unit, Collected Fees (Vouchers) + Allocated fees (Vouchers)
     */
    public void setTotalVoucherPayAmount(String TotalVoucherPayAmount) {
        this.TotalVoucherPayAmount = TotalVoucherPayAmount;
    }

    /**
     * Get Total fees (free credit): Total fees of the cost allocation unit, Collected Fees (Free Credit) + Allocated fees (Free Credit) 
     * @return TotalIncentivePayAmount Total fees (free credit): Total fees of the cost allocation unit, Collected Fees (Free Credit) + Allocated fees (Free Credit)
     */
    public String getTotalIncentivePayAmount() {
        return this.TotalIncentivePayAmount;
    }

    /**
     * Set Total fees (free credit): Total fees of the cost allocation unit, Collected Fees (Free Credit) + Allocated fees (Free Credit)
     * @param TotalIncentivePayAmount Total fees (free credit): Total fees of the cost allocation unit, Collected Fees (Free Credit) + Allocated fees (Free Credit)
     */
    public void setTotalIncentivePayAmount(String TotalIncentivePayAmount) {
        this.TotalIncentivePayAmount = TotalIncentivePayAmount;
    }

    /**
     * Get Total fees (royalty amount): Total fees of the cost allocation unit, Collected Fees (Royalty Amount) + Allocated fees (Royalty Amount) 
     * @return TotalTransferPayAmount Total fees (royalty amount): Total fees of the cost allocation unit, Collected Fees (Royalty Amount) + Allocated fees (Royalty Amount)
     */
    public String getTotalTransferPayAmount() {
        return this.TotalTransferPayAmount;
    }

    /**
     * Set Total fees (royalty amount): Total fees of the cost allocation unit, Collected Fees (Royalty Amount) + Allocated fees (Royalty Amount)
     * @param TotalTransferPayAmount Total fees (royalty amount): Total fees of the cost allocation unit, Collected Fees (Royalty Amount) + Allocated fees (Royalty Amount)
     */
    public void setTotalTransferPayAmount(String TotalTransferPayAmount) {
        this.TotalTransferPayAmount = TotalTransferPayAmount;
    }

    /**
     * Get Collected fees (discounted total): Total resource amount after discount directly collected to the cost allocation unit based on the collection rules 
     * @return GatherRealCost Collected fees (discounted total): Total resource amount after discount directly collected to the cost allocation unit based on the collection rules
     */
    public String getGatherRealCost() {
        return this.GatherRealCost;
    }

    /**
     * Set Collected fees (discounted total): Total resource amount after discount directly collected to the cost allocation unit based on the collection rules
     * @param GatherRealCost Collected fees (discounted total): Total resource amount after discount directly collected to the cost allocation unit based on the collection rules
     */
    public void setGatherRealCost(String GatherRealCost) {
        this.GatherRealCost = GatherRealCost;
    }

    /**
     * Get Allocated fees (discounted total): Total resource amount after discount allocated to the cost allocation unit based on the allocation rules 
     * @return AllocateRealCost Allocated fees (discounted total): Total resource amount after discount allocated to the cost allocation unit based on the allocation rules
     */
    public String getAllocateRealCost() {
        return this.AllocateRealCost;
    }

    /**
     * Set Allocated fees (discounted total): Total resource amount after discount allocated to the cost allocation unit based on the allocation rules
     * @param AllocateRealCost Allocated fees (discounted total): Total resource amount after discount allocated to the cost allocation unit based on the allocation rules
     */
    public void setAllocateRealCost(String AllocateRealCost) {
        this.AllocateRealCost = AllocateRealCost;
    }

    /**
     * Get Total fees (discounted total): Total fees of the cost allocation unit, Collected Fees (discounted total) + Allocated fees (discounted total) 
     * @return RealTotalCost Total fees (discounted total): Total fees of the cost allocation unit, Collected Fees (discounted total) + Allocated fees (discounted total)
     */
    public String getRealTotalCost() {
        return this.RealTotalCost;
    }

    /**
     * Set Total fees (discounted total): Total fees of the cost allocation unit, Collected Fees (discounted total) + Allocated fees (discounted total)
     * @param RealTotalCost Total fees (discounted total): Total fees of the cost allocation unit, Collected Fees (discounted total) + Allocated fees (discounted total)
     */
    public void setRealTotalCost(String RealTotalCost) {
        this.RealTotalCost = RealTotalCost;
    }

    /**
     * Get Proportion (discounted total): Total fees (discounted total) of the Cost Allocation Unit/Total Fees (discounted total) * 100% 
     * @return Ratio Proportion (discounted total): Total fees (discounted total) of the Cost Allocation Unit/Total Fees (discounted total) * 100%
     */
    public String getRatio() {
        return this.Ratio;
    }

    /**
     * Set Proportion (discounted total): Total fees (discounted total) of the Cost Allocation Unit/Total Fees (discounted total) * 100%
     * @param Ratio Proportion (discounted total): Total fees (discounted total) of the Cost Allocation Unit/Total Fees (discounted total) * 100%
     */
    public void setRatio(String Ratio) {
        this.Ratio = Ratio;
    }

    /**
     * Get Month-on-month ratio (discounted total): [Total fees (discounted total) of the cost allocation unit in this month - Total fees (discounted total) of the cost allocation unit in the previous month]/Total fees (discounted total) of the cost allocation unit in the previous month * 100% 
     * @return Trend Month-on-month ratio (discounted total): [Total fees (discounted total) of the cost allocation unit in this month - Total fees (discounted total) of the cost allocation unit in the previous month]/Total fees (discounted total) of the cost allocation unit in the previous month * 100%
     */
    public String getTrend() {
        return this.Trend;
    }

    /**
     * Set Month-on-month ratio (discounted total): [Total fees (discounted total) of the cost allocation unit in this month - Total fees (discounted total) of the cost allocation unit in the previous month]/Total fees (discounted total) of the cost allocation unit in the previous month * 100%
     * @param Trend Month-on-month ratio (discounted total): [Total fees (discounted total) of the cost allocation unit in this month - Total fees (discounted total) of the cost allocation unit in the previous month]/Total fees (discounted total) of the cost allocation unit in the previous month * 100%
     */
    public void setTrend(String Trend) {
        this.Trend = Trend;
    }

    /**
     * Get Sequential Comparison Arrow
upward - Upward
downward - Downward
none - Stable 
     * @return TrendType Sequential Comparison Arrow
upward - Upward
downward - Downward
none - Stable
     */
    public String getTrendType() {
        return this.TrendType;
    }

    /**
     * Set Sequential Comparison Arrow
upward - Upward
downward - Downward
none - Stable
     * @param TrendType Sequential Comparison Arrow
upward - Upward
downward - Downward
none - Stable
     */
    public void setTrendType(String TrendType) {
        this.TrendType = TrendType;
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
     * Get Discounted total: discounted total = (Original Price - Original Price Deducted by a Reserved Instance - Savings Plan Deduction from Original Price) * Discount Rate 
     * @return AllocationRealTotalCost Discounted total: discounted total = (Original Price - Original Price Deducted by a Reserved Instance - Savings Plan Deduction from Original Price) * Discount Rate
     */
    public String getAllocationRealTotalCost() {
        return this.AllocationRealTotalCost;
    }

    /**
     * Set Discounted total: discounted total = (Original Price - Original Price Deducted by a Reserved Instance - Savings Plan Deduction from Original Price) * Discount Rate
     * @param AllocationRealTotalCost Discounted total: discounted total = (Original Price - Original Price Deducted by a Reserved Instance - Savings Plan Deduction from Original Price) * Discount Rate
     */
    public void setAllocationRealTotalCost(String AllocationRealTotalCost) {
        this.AllocationRealTotalCost = AllocationRealTotalCost;
    }

    /**
     * Get Collected fees (tax): Tax directly collected to the cost allocation unit based on the collection rules 
     * @return GatherTax Collected fees (tax): Tax directly collected to the cost allocation unit based on the collection rules
     */
    public String getGatherTax() {
        return this.GatherTax;
    }

    /**
     * Set Collected fees (tax): Tax directly collected to the cost allocation unit based on the collection rules
     * @param GatherTax Collected fees (tax): Tax directly collected to the cost allocation unit based on the collection rules
     */
    public void setGatherTax(String GatherTax) {
        this.GatherTax = GatherTax;
    }

    /**
     * Get Allocated fees (tax): Resource tax allocated to the cost allocation unit based on the allocation rules 
     * @return AllocateTax Allocated fees (tax): Resource tax allocated to the cost allocation unit based on the allocation rules
     */
    public String getAllocateTax() {
        return this.AllocateTax;
    }

    /**
     * Set Allocated fees (tax): Resource tax allocated to the cost allocation unit based on the allocation rules
     * @param AllocateTax Allocated fees (tax): Resource tax allocated to the cost allocation unit based on the allocation rules
     */
    public void setAllocateTax(String AllocateTax) {
        this.AllocateTax = AllocateTax;
    }

    /**
     * Get Total fees (tax): Total fees of the cost allocation unit, Collected Fees (Tax) + Allocated fees (Tax) 
     * @return TotalTax Total fees (tax): Total fees of the cost allocation unit, Collected Fees (Tax) + Allocated fees (Tax)
     */
    public String getTotalTax() {
        return this.TotalTax;
    }

    /**
     * Set Total fees (tax): Total fees of the cost allocation unit, Collected Fees (Tax) + Allocated fees (Tax)
     * @param TotalTax Total fees (tax): Total fees of the cost allocation unit, Collected Fees (Tax) + Allocated fees (Tax)
     */
    public void setTotalTax(String TotalTax) {
        this.TotalTax = TotalTax;
    }

    /**
     * Get GatherCostBeforeTax 
     * @return GatherCostBeforeTax GatherCostBeforeTax
     */
    public String getGatherCostBeforeTax() {
        return this.GatherCostBeforeTax;
    }

    /**
     * Set GatherCostBeforeTax
     * @param GatherCostBeforeTax GatherCostBeforeTax
     */
    public void setGatherCostBeforeTax(String GatherCostBeforeTax) {
        this.GatherCostBeforeTax = GatherCostBeforeTax;
    }

    /**
     * Get AllocateCostBeforeTax 
     * @return AllocateCostBeforeTax AllocateCostBeforeTax
     */
    public String getAllocateCostBeforeTax() {
        return this.AllocateCostBeforeTax;
    }

    /**
     * Set AllocateCostBeforeTax
     * @param AllocateCostBeforeTax AllocateCostBeforeTax
     */
    public void setAllocateCostBeforeTax(String AllocateCostBeforeTax) {
        this.AllocateCostBeforeTax = AllocateCostBeforeTax;
    }

    /**
     * Get TotalCostBeforeTax 
     * @return TotalCostBeforeTax TotalCostBeforeTax
     */
    public String getTotalCostBeforeTax() {
        return this.TotalCostBeforeTax;
    }

    /**
     * Set TotalCostBeforeTax
     * @param TotalCostBeforeTax TotalCostBeforeTax
     */
    public void setTotalCostBeforeTax(String TotalCostBeforeTax) {
        this.TotalCostBeforeTax = TotalCostBeforeTax;
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

    public AllocationSummaryByBusiness() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AllocationSummaryByBusiness(AllocationSummaryByBusiness source) {
        if (source.TreeNodeUniqKey != null) {
            this.TreeNodeUniqKey = new String(source.TreeNodeUniqKey);
        }
        if (source.TreeNodeUniqKeyName != null) {
            this.TreeNodeUniqKeyName = new String(source.TreeNodeUniqKeyName);
        }
        if (source.BillDate != null) {
            this.BillDate = new String(source.BillDate);
        }
        if (source.GatherCashPayAmount != null) {
            this.GatherCashPayAmount = new String(source.GatherCashPayAmount);
        }
        if (source.GatherVoucherPayAmount != null) {
            this.GatherVoucherPayAmount = new String(source.GatherVoucherPayAmount);
        }
        if (source.GatherIncentivePayAmount != null) {
            this.GatherIncentivePayAmount = new String(source.GatherIncentivePayAmount);
        }
        if (source.GatherTransferPayAmount != null) {
            this.GatherTransferPayAmount = new String(source.GatherTransferPayAmount);
        }
        if (source.AllocateCashPayAmount != null) {
            this.AllocateCashPayAmount = new String(source.AllocateCashPayAmount);
        }
        if (source.AllocateVoucherPayAmount != null) {
            this.AllocateVoucherPayAmount = new String(source.AllocateVoucherPayAmount);
        }
        if (source.AllocateIncentivePayAmount != null) {
            this.AllocateIncentivePayAmount = new String(source.AllocateIncentivePayAmount);
        }
        if (source.AllocateTransferPayAmount != null) {
            this.AllocateTransferPayAmount = new String(source.AllocateTransferPayAmount);
        }
        if (source.TotalCashPayAmount != null) {
            this.TotalCashPayAmount = new String(source.TotalCashPayAmount);
        }
        if (source.TotalVoucherPayAmount != null) {
            this.TotalVoucherPayAmount = new String(source.TotalVoucherPayAmount);
        }
        if (source.TotalIncentivePayAmount != null) {
            this.TotalIncentivePayAmount = new String(source.TotalIncentivePayAmount);
        }
        if (source.TotalTransferPayAmount != null) {
            this.TotalTransferPayAmount = new String(source.TotalTransferPayAmount);
        }
        if (source.GatherRealCost != null) {
            this.GatherRealCost = new String(source.GatherRealCost);
        }
        if (source.AllocateRealCost != null) {
            this.AllocateRealCost = new String(source.AllocateRealCost);
        }
        if (source.RealTotalCost != null) {
            this.RealTotalCost = new String(source.RealTotalCost);
        }
        if (source.Ratio != null) {
            this.Ratio = new String(source.Ratio);
        }
        if (source.Trend != null) {
            this.Trend = new String(source.Trend);
        }
        if (source.TrendType != null) {
            this.TrendType = new String(source.TrendType);
        }
        if (source.BusinessCode != null) {
            this.BusinessCode = new String(source.BusinessCode);
        }
        if (source.BusinessCodeName != null) {
            this.BusinessCodeName = new String(source.BusinessCodeName);
        }
        if (source.TotalCost != null) {
            this.TotalCost = new String(source.TotalCost);
        }
        if (source.RICost != null) {
            this.RICost = new String(source.RICost);
        }
        if (source.SPCost != null) {
            this.SPCost = new String(source.SPCost);
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
        if (source.AllocationRealTotalCost != null) {
            this.AllocationRealTotalCost = new String(source.AllocationRealTotalCost);
        }
        if (source.GatherTax != null) {
            this.GatherTax = new String(source.GatherTax);
        }
        if (source.AllocateTax != null) {
            this.AllocateTax = new String(source.AllocateTax);
        }
        if (source.TotalTax != null) {
            this.TotalTax = new String(source.TotalTax);
        }
        if (source.GatherCostBeforeTax != null) {
            this.GatherCostBeforeTax = new String(source.GatherCostBeforeTax);
        }
        if (source.AllocateCostBeforeTax != null) {
            this.AllocateCostBeforeTax = new String(source.AllocateCostBeforeTax);
        }
        if (source.TotalCostBeforeTax != null) {
            this.TotalCostBeforeTax = new String(source.TotalCostBeforeTax);
        }
        if (source.Tax != null) {
            this.Tax = new String(source.Tax);
        }
        if (source.CostBeforeTax != null) {
            this.CostBeforeTax = new String(source.CostBeforeTax);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TreeNodeUniqKey", this.TreeNodeUniqKey);
        this.setParamSimple(map, prefix + "TreeNodeUniqKeyName", this.TreeNodeUniqKeyName);
        this.setParamSimple(map, prefix + "BillDate", this.BillDate);
        this.setParamSimple(map, prefix + "GatherCashPayAmount", this.GatherCashPayAmount);
        this.setParamSimple(map, prefix + "GatherVoucherPayAmount", this.GatherVoucherPayAmount);
        this.setParamSimple(map, prefix + "GatherIncentivePayAmount", this.GatherIncentivePayAmount);
        this.setParamSimple(map, prefix + "GatherTransferPayAmount", this.GatherTransferPayAmount);
        this.setParamSimple(map, prefix + "AllocateCashPayAmount", this.AllocateCashPayAmount);
        this.setParamSimple(map, prefix + "AllocateVoucherPayAmount", this.AllocateVoucherPayAmount);
        this.setParamSimple(map, prefix + "AllocateIncentivePayAmount", this.AllocateIncentivePayAmount);
        this.setParamSimple(map, prefix + "AllocateTransferPayAmount", this.AllocateTransferPayAmount);
        this.setParamSimple(map, prefix + "TotalCashPayAmount", this.TotalCashPayAmount);
        this.setParamSimple(map, prefix + "TotalVoucherPayAmount", this.TotalVoucherPayAmount);
        this.setParamSimple(map, prefix + "TotalIncentivePayAmount", this.TotalIncentivePayAmount);
        this.setParamSimple(map, prefix + "TotalTransferPayAmount", this.TotalTransferPayAmount);
        this.setParamSimple(map, prefix + "GatherRealCost", this.GatherRealCost);
        this.setParamSimple(map, prefix + "AllocateRealCost", this.AllocateRealCost);
        this.setParamSimple(map, prefix + "RealTotalCost", this.RealTotalCost);
        this.setParamSimple(map, prefix + "Ratio", this.Ratio);
        this.setParamSimple(map, prefix + "Trend", this.Trend);
        this.setParamSimple(map, prefix + "TrendType", this.TrendType);
        this.setParamSimple(map, prefix + "BusinessCode", this.BusinessCode);
        this.setParamSimple(map, prefix + "BusinessCodeName", this.BusinessCodeName);
        this.setParamSimple(map, prefix + "TotalCost", this.TotalCost);
        this.setParamSimple(map, prefix + "RICost", this.RICost);
        this.setParamSimple(map, prefix + "SPCost", this.SPCost);
        this.setParamSimple(map, prefix + "CashPayAmount", this.CashPayAmount);
        this.setParamSimple(map, prefix + "VoucherPayAmount", this.VoucherPayAmount);
        this.setParamSimple(map, prefix + "IncentivePayAmount", this.IncentivePayAmount);
        this.setParamSimple(map, prefix + "TransferPayAmount", this.TransferPayAmount);
        this.setParamSimple(map, prefix + "AllocationRealTotalCost", this.AllocationRealTotalCost);
        this.setParamSimple(map, prefix + "GatherTax", this.GatherTax);
        this.setParamSimple(map, prefix + "AllocateTax", this.AllocateTax);
        this.setParamSimple(map, prefix + "TotalTax", this.TotalTax);
        this.setParamSimple(map, prefix + "GatherCostBeforeTax", this.GatherCostBeforeTax);
        this.setParamSimple(map, prefix + "AllocateCostBeforeTax", this.AllocateCostBeforeTax);
        this.setParamSimple(map, prefix + "TotalCostBeforeTax", this.TotalCostBeforeTax);
        this.setParamSimple(map, prefix + "Tax", this.Tax);
        this.setParamSimple(map, prefix + "CostBeforeTax", this.CostBeforeTax);

    }
}


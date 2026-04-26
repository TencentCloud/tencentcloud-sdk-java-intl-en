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

public class AllocationMonthOverviewDetail extends AbstractModel {

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
    * Allocated fees (vouchers): Resource vouchers allocated to the cost allocation unit based on the allocation rules
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
    * Total fees (voucher): Total fees of the cost allocation unit, Collected Fees (Voucher) + Allocated fees (Voucher)
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
    * Total fees (royalty amount): Total cost of the cost allocation unit, Collected Fees (Royalty Amount) + Allocated fees (Royalty Amount)
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
    * Allocated fees (discounted total): Total resource amount after discount directly allocated to the cost allocation unit based on the allocation rules
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
    * AllocateCostBeforeTax
    */
    @SerializedName("AllocateCostBeforeTax")
    @Expose
    private String AllocateCostBeforeTax;

    /**
    * GatherCostBeforeTax
    */
    @SerializedName("GatherCostBeforeTax")
    @Expose
    private String GatherCostBeforeTax;

    /**
    * TotalCostBeforeTax
    */
    @SerializedName("TotalCostBeforeTax")
    @Expose
    private String TotalCostBeforeTax;

    /**
    * AllocateTax
    */
    @SerializedName("AllocateTax")
    @Expose
    private String AllocateTax;

    /**
    * GatherTax
    */
    @SerializedName("GatherTax")
    @Expose
    private String GatherTax;

    /**
    * TotalTax
    */
    @SerializedName("TotalTax")
    @Expose
    private String TotalTax;

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
     * Get Allocated fees (vouchers): Resource vouchers allocated to the cost allocation unit based on the allocation rules 
     * @return AllocateVoucherPayAmount Allocated fees (vouchers): Resource vouchers allocated to the cost allocation unit based on the allocation rules
     */
    public String getAllocateVoucherPayAmount() {
        return this.AllocateVoucherPayAmount;
    }

    /**
     * Set Allocated fees (vouchers): Resource vouchers allocated to the cost allocation unit based on the allocation rules
     * @param AllocateVoucherPayAmount Allocated fees (vouchers): Resource vouchers allocated to the cost allocation unit based on the allocation rules
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
     * Get Total fees (voucher): Total fees of the cost allocation unit, Collected Fees (Voucher) + Allocated fees (Voucher) 
     * @return TotalVoucherPayAmount Total fees (voucher): Total fees of the cost allocation unit, Collected Fees (Voucher) + Allocated fees (Voucher)
     */
    public String getTotalVoucherPayAmount() {
        return this.TotalVoucherPayAmount;
    }

    /**
     * Set Total fees (voucher): Total fees of the cost allocation unit, Collected Fees (Voucher) + Allocated fees (Voucher)
     * @param TotalVoucherPayAmount Total fees (voucher): Total fees of the cost allocation unit, Collected Fees (Voucher) + Allocated fees (Voucher)
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
     * Get Total fees (royalty amount): Total cost of the cost allocation unit, Collected Fees (Royalty Amount) + Allocated fees (Royalty Amount) 
     * @return TotalTransferPayAmount Total fees (royalty amount): Total cost of the cost allocation unit, Collected Fees (Royalty Amount) + Allocated fees (Royalty Amount)
     */
    public String getTotalTransferPayAmount() {
        return this.TotalTransferPayAmount;
    }

    /**
     * Set Total fees (royalty amount): Total cost of the cost allocation unit, Collected Fees (Royalty Amount) + Allocated fees (Royalty Amount)
     * @param TotalTransferPayAmount Total fees (royalty amount): Total cost of the cost allocation unit, Collected Fees (Royalty Amount) + Allocated fees (Royalty Amount)
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
     * Get Allocated fees (discounted total): Total resource amount after discount directly allocated to the cost allocation unit based on the allocation rules 
     * @return AllocateRealCost Allocated fees (discounted total): Total resource amount after discount directly allocated to the cost allocation unit based on the allocation rules
     */
    public String getAllocateRealCost() {
        return this.AllocateRealCost;
    }

    /**
     * Set Allocated fees (discounted total): Total resource amount after discount directly allocated to the cost allocation unit based on the allocation rules
     * @param AllocateRealCost Allocated fees (discounted total): Total resource amount after discount directly allocated to the cost allocation unit based on the allocation rules
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
     * Get AllocateTax 
     * @return AllocateTax AllocateTax
     */
    public String getAllocateTax() {
        return this.AllocateTax;
    }

    /**
     * Set AllocateTax
     * @param AllocateTax AllocateTax
     */
    public void setAllocateTax(String AllocateTax) {
        this.AllocateTax = AllocateTax;
    }

    /**
     * Get GatherTax 
     * @return GatherTax GatherTax
     */
    public String getGatherTax() {
        return this.GatherTax;
    }

    /**
     * Set GatherTax
     * @param GatherTax GatherTax
     */
    public void setGatherTax(String GatherTax) {
        this.GatherTax = GatherTax;
    }

    /**
     * Get TotalTax 
     * @return TotalTax TotalTax
     */
    public String getTotalTax() {
        return this.TotalTax;
    }

    /**
     * Set TotalTax
     * @param TotalTax TotalTax
     */
    public void setTotalTax(String TotalTax) {
        this.TotalTax = TotalTax;
    }

    public AllocationMonthOverviewDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AllocationMonthOverviewDetail(AllocationMonthOverviewDetail source) {
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
        if (source.AllocateCostBeforeTax != null) {
            this.AllocateCostBeforeTax = new String(source.AllocateCostBeforeTax);
        }
        if (source.GatherCostBeforeTax != null) {
            this.GatherCostBeforeTax = new String(source.GatherCostBeforeTax);
        }
        if (source.TotalCostBeforeTax != null) {
            this.TotalCostBeforeTax = new String(source.TotalCostBeforeTax);
        }
        if (source.AllocateTax != null) {
            this.AllocateTax = new String(source.AllocateTax);
        }
        if (source.GatherTax != null) {
            this.GatherTax = new String(source.GatherTax);
        }
        if (source.TotalTax != null) {
            this.TotalTax = new String(source.TotalTax);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
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
        this.setParamSimple(map, prefix + "AllocateCostBeforeTax", this.AllocateCostBeforeTax);
        this.setParamSimple(map, prefix + "GatherCostBeforeTax", this.GatherCostBeforeTax);
        this.setParamSimple(map, prefix + "TotalCostBeforeTax", this.TotalCostBeforeTax);
        this.setParamSimple(map, prefix + "AllocateTax", this.AllocateTax);
        this.setParamSimple(map, prefix + "GatherTax", this.GatherTax);
        this.setParamSimple(map, prefix + "TotalTax", this.TotalTax);

    }
}


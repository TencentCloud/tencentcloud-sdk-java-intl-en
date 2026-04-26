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

public class AllocationOverviewTotal extends AbstractModel {

    /**
    * Total fees: Total Fees (Cash) + Total Fees (Royalty Amount) + Total Fees (Free Credit) + Total Fees (Voucher)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RealTotalCost")
    @Expose
    private String RealTotalCost;

    /**
    * Cash: Total fees of cash
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CashPayAmount")
    @Expose
    private String CashPayAmount;

    /**
    * Free credit: Total fees of free credit
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IncentivePayAmount")
    @Expose
    private String IncentivePayAmount;

    /**
    * Voucher: Total fees of voucher
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VoucherPayAmount")
    @Expose
    private String VoucherPayAmount;

    /**
    * Royalty amount: Total fees of royalty amount
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TransferPayAmount")
    @Expose
    private String TransferPayAmount;

    /**
    * Pre-tax price after discount
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
     * Get Total fees: Total Fees (Cash) + Total Fees (Royalty Amount) + Total Fees (Free Credit) + Total Fees (Voucher)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RealTotalCost Total fees: Total Fees (Cash) + Total Fees (Royalty Amount) + Total Fees (Free Credit) + Total Fees (Voucher)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRealTotalCost() {
        return this.RealTotalCost;
    }

    /**
     * Set Total fees: Total Fees (Cash) + Total Fees (Royalty Amount) + Total Fees (Free Credit) + Total Fees (Voucher)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RealTotalCost Total fees: Total Fees (Cash) + Total Fees (Royalty Amount) + Total Fees (Free Credit) + Total Fees (Voucher)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRealTotalCost(String RealTotalCost) {
        this.RealTotalCost = RealTotalCost;
    }

    /**
     * Get Cash: Total fees of cash
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CashPayAmount Cash: Total fees of cash
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCashPayAmount() {
        return this.CashPayAmount;
    }

    /**
     * Set Cash: Total fees of cash
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CashPayAmount Cash: Total fees of cash
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCashPayAmount(String CashPayAmount) {
        this.CashPayAmount = CashPayAmount;
    }

    /**
     * Get Free credit: Total fees of free credit
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IncentivePayAmount Free credit: Total fees of free credit
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIncentivePayAmount() {
        return this.IncentivePayAmount;
    }

    /**
     * Set Free credit: Total fees of free credit
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IncentivePayAmount Free credit: Total fees of free credit
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIncentivePayAmount(String IncentivePayAmount) {
        this.IncentivePayAmount = IncentivePayAmount;
    }

    /**
     * Get Voucher: Total fees of voucher
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VoucherPayAmount Voucher: Total fees of voucher
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVoucherPayAmount() {
        return this.VoucherPayAmount;
    }

    /**
     * Set Voucher: Total fees of voucher
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VoucherPayAmount Voucher: Total fees of voucher
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVoucherPayAmount(String VoucherPayAmount) {
        this.VoucherPayAmount = VoucherPayAmount;
    }

    /**
     * Get Royalty amount: Total fees of royalty amount
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TransferPayAmount Royalty amount: Total fees of royalty amount
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTransferPayAmount() {
        return this.TransferPayAmount;
    }

    /**
     * Set Royalty amount: Total fees of royalty amount
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TransferPayAmount Royalty amount: Total fees of royalty amount
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTransferPayAmount(String TransferPayAmount) {
        this.TransferPayAmount = TransferPayAmount;
    }

    /**
     * Get Pre-tax price after discount 
     * @return CostBeforeTax Pre-tax price after discount
     */
    public String getCostBeforeTax() {
        return this.CostBeforeTax;
    }

    /**
     * Set Pre-tax price after discount
     * @param CostBeforeTax Pre-tax price after discount
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

    public AllocationOverviewTotal() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AllocationOverviewTotal(AllocationOverviewTotal source) {
        if (source.RealTotalCost != null) {
            this.RealTotalCost = new String(source.RealTotalCost);
        }
        if (source.CashPayAmount != null) {
            this.CashPayAmount = new String(source.CashPayAmount);
        }
        if (source.IncentivePayAmount != null) {
            this.IncentivePayAmount = new String(source.IncentivePayAmount);
        }
        if (source.VoucherPayAmount != null) {
            this.VoucherPayAmount = new String(source.VoucherPayAmount);
        }
        if (source.TransferPayAmount != null) {
            this.TransferPayAmount = new String(source.TransferPayAmount);
        }
        if (source.CostBeforeTax != null) {
            this.CostBeforeTax = new String(source.CostBeforeTax);
        }
        if (source.Tax != null) {
            this.Tax = new String(source.Tax);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RealTotalCost", this.RealTotalCost);
        this.setParamSimple(map, prefix + "CashPayAmount", this.CashPayAmount);
        this.setParamSimple(map, prefix + "IncentivePayAmount", this.IncentivePayAmount);
        this.setParamSimple(map, prefix + "VoucherPayAmount", this.VoucherPayAmount);
        this.setParamSimple(map, prefix + "TransferPayAmount", this.TransferPayAmount);
        this.setParamSimple(map, prefix + "CostBeforeTax", this.CostBeforeTax);
        this.setParamSimple(map, prefix + "Tax", this.Tax);

    }
}


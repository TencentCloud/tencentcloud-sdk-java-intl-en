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

public class BusinessSummaryOverviewItem extends AbstractModel {

    /**
    * Product code. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BusinessCode")
    @Expose
    private String BusinessCode;

    /**
    * Product name: The name of a Tencent Cloud product purchased by the user, such as CVM.
    */
    @SerializedName("BusinessCodeName")
    @Expose
    private String BusinessCodeName;

    /**
    * Cost ratio, to two decimal points
    */
    @SerializedName("RealTotalCostRatio")
    @Expose
    private String RealTotalCostRatio;

    /**
    * Total amount after discount
    */
    @SerializedName("RealTotalCost")
    @Expose
    private String RealTotalCost;

    /**
    * Cash credit: The amount paid from the user’s cash account
    */
    @SerializedName("CashPayAmount")
    @Expose
    private String CashPayAmount;

    /**
    * Free credit: The amount paid with the user’s free credit
    */
    @SerializedName("IncentivePayAmount")
    @Expose
    private String IncentivePayAmount;

    /**
    * Voucher payment: The voucher deduction amount
    */
    @SerializedName("VoucherPayAmount")
    @Expose
    private String VoucherPayAmount;

    /**
    * Commission credit: The amount paid with the user’s commission credit.
    */
    @SerializedName("TransferPayAmount")
    @Expose
    private String TransferPayAmount;

    /**
    * Billing month, e.g. `2019-08`
    */
    @SerializedName("BillMonth")
    @Expose
    private String BillMonth;

    /**
    * The original cost in USD. This parameter has become valid since v3.0 bills took effect in May 2021, and before that `-` was returned for this parameter. If a customer uses a contract price different from the published price, `-` will also be returned for this parameter.
    */
    @SerializedName("TotalCost")
    @Expose
    private String TotalCost;

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
     * Get Cost ratio, to two decimal points 
     * @return RealTotalCostRatio Cost ratio, to two decimal points
     */
    public String getRealTotalCostRatio() {
        return this.RealTotalCostRatio;
    }

    /**
     * Set Cost ratio, to two decimal points
     * @param RealTotalCostRatio Cost ratio, to two decimal points
     */
    public void setRealTotalCostRatio(String RealTotalCostRatio) {
        this.RealTotalCostRatio = RealTotalCostRatio;
    }

    /**
     * Get Total amount after discount 
     * @return RealTotalCost Total amount after discount
     */
    public String getRealTotalCost() {
        return this.RealTotalCost;
    }

    /**
     * Set Total amount after discount
     * @param RealTotalCost Total amount after discount
     */
    public void setRealTotalCost(String RealTotalCost) {
        this.RealTotalCost = RealTotalCost;
    }

    /**
     * Get Cash credit: The amount paid from the user’s cash account 
     * @return CashPayAmount Cash credit: The amount paid from the user’s cash account
     */
    public String getCashPayAmount() {
        return this.CashPayAmount;
    }

    /**
     * Set Cash credit: The amount paid from the user’s cash account
     * @param CashPayAmount Cash credit: The amount paid from the user’s cash account
     */
    public void setCashPayAmount(String CashPayAmount) {
        this.CashPayAmount = CashPayAmount;
    }

    /**
     * Get Free credit: The amount paid with the user’s free credit 
     * @return IncentivePayAmount Free credit: The amount paid with the user’s free credit
     */
    public String getIncentivePayAmount() {
        return this.IncentivePayAmount;
    }

    /**
     * Set Free credit: The amount paid with the user’s free credit
     * @param IncentivePayAmount Free credit: The amount paid with the user’s free credit
     */
    public void setIncentivePayAmount(String IncentivePayAmount) {
        this.IncentivePayAmount = IncentivePayAmount;
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
     * Get Commission credit: The amount paid with the user’s commission credit. 
     * @return TransferPayAmount Commission credit: The amount paid with the user’s commission credit.
     */
    public String getTransferPayAmount() {
        return this.TransferPayAmount;
    }

    /**
     * Set Commission credit: The amount paid with the user’s commission credit.
     * @param TransferPayAmount Commission credit: The amount paid with the user’s commission credit.
     */
    public void setTransferPayAmount(String TransferPayAmount) {
        this.TransferPayAmount = TransferPayAmount;
    }

    /**
     * Get Billing month, e.g. `2019-08` 
     * @return BillMonth Billing month, e.g. `2019-08`
     */
    public String getBillMonth() {
        return this.BillMonth;
    }

    /**
     * Set Billing month, e.g. `2019-08`
     * @param BillMonth Billing month, e.g. `2019-08`
     */
    public void setBillMonth(String BillMonth) {
        this.BillMonth = BillMonth;
    }

    /**
     * Get The original cost in USD. This parameter has become valid since v3.0 bills took effect in May 2021, and before that `-` was returned for this parameter. If a customer uses a contract price different from the published price, `-` will also be returned for this parameter. 
     * @return TotalCost The original cost in USD. This parameter has become valid since v3.0 bills took effect in May 2021, and before that `-` was returned for this parameter. If a customer uses a contract price different from the published price, `-` will also be returned for this parameter.
     */
    public String getTotalCost() {
        return this.TotalCost;
    }

    /**
     * Set The original cost in USD. This parameter has become valid since v3.0 bills took effect in May 2021, and before that `-` was returned for this parameter. If a customer uses a contract price different from the published price, `-` will also be returned for this parameter.
     * @param TotalCost The original cost in USD. This parameter has become valid since v3.0 bills took effect in May 2021, and before that `-` was returned for this parameter. If a customer uses a contract price different from the published price, `-` will also be returned for this parameter.
     */
    public void setTotalCost(String TotalCost) {
        this.TotalCost = TotalCost;
    }

    public BusinessSummaryOverviewItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BusinessSummaryOverviewItem(BusinessSummaryOverviewItem source) {
        if (source.BusinessCode != null) {
            this.BusinessCode = new String(source.BusinessCode);
        }
        if (source.BusinessCodeName != null) {
            this.BusinessCodeName = new String(source.BusinessCodeName);
        }
        if (source.RealTotalCostRatio != null) {
            this.RealTotalCostRatio = new String(source.RealTotalCostRatio);
        }
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
        if (source.BillMonth != null) {
            this.BillMonth = new String(source.BillMonth);
        }
        if (source.TotalCost != null) {
            this.TotalCost = new String(source.TotalCost);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BusinessCode", this.BusinessCode);
        this.setParamSimple(map, prefix + "BusinessCodeName", this.BusinessCodeName);
        this.setParamSimple(map, prefix + "RealTotalCostRatio", this.RealTotalCostRatio);
        this.setParamSimple(map, prefix + "RealTotalCost", this.RealTotalCost);
        this.setParamSimple(map, prefix + "CashPayAmount", this.CashPayAmount);
        this.setParamSimple(map, prefix + "IncentivePayAmount", this.IncentivePayAmount);
        this.setParamSimple(map, prefix + "VoucherPayAmount", this.VoucherPayAmount);
        this.setParamSimple(map, prefix + "TransferPayAmount", this.TransferPayAmount);
        this.setParamSimple(map, prefix + "BillMonth", this.BillMonth);
        this.setParamSimple(map, prefix + "TotalCost", this.TotalCost);

    }
}


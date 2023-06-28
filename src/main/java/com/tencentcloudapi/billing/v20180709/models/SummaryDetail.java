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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SummaryDetail extends AbstractModel{

    /**
    * Bill dimension code. Note:  This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GroupKey")
    @Expose
    private String GroupKey;

    /**
    * Bill dimension value. Note:  This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GroupValue")
    @Expose
    private String GroupValue;

    /**
    * Original cost in USD. This parameter has become valid since Bill 3.0 took effect in May 2021, and before that `-` was returned for this parameter. If a customer has applied for a contract price different from the prices listed on the official website, `-` will also be returned for this parameter.
    */
    @SerializedName("TotalCost")
    @Expose
    private String TotalCost;

    /**
    * Total amount after discount
    */
    @SerializedName("RealTotalCost")
    @Expose
    private String RealTotalCost;

    /**
    * Cash credit:  The amount paid from the user’s cash account
    */
    @SerializedName("CashPayAmount")
    @Expose
    private String CashPayAmount;

    /**
    * Free credit:  The amount paid by the user’s free credit
    */
    @SerializedName("IncentivePayAmount")
    @Expose
    private String IncentivePayAmount;

    /**
    * Voucher payment:  The voucher deduction amount
    */
    @SerializedName("VoucherPayAmount")
    @Expose
    private String VoucherPayAmount;

    /**
    * Commission credit:  The amount paid by the user’s commission credit. Note:  This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TransferPayAmount")
    @Expose
    private String TransferPayAmount;

    /**
    * Detailed summary of products. Note:  This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Business")
    @Expose
    private BusinessSummaryInfo [] Business;

    /**
     * Get Bill dimension code. Note:  This field may return null, indicating that no valid values can be obtained. 
     * @return GroupKey Bill dimension code. Note:  This field may return null, indicating that no valid values can be obtained.
     */
    public String getGroupKey() {
        return this.GroupKey;
    }

    /**
     * Set Bill dimension code. Note:  This field may return null, indicating that no valid values can be obtained.
     * @param GroupKey Bill dimension code. Note:  This field may return null, indicating that no valid values can be obtained.
     */
    public void setGroupKey(String GroupKey) {
        this.GroupKey = GroupKey;
    }

    /**
     * Get Bill dimension value. Note:  This field may return null, indicating that no valid values can be obtained. 
     * @return GroupValue Bill dimension value. Note:  This field may return null, indicating that no valid values can be obtained.
     */
    public String getGroupValue() {
        return this.GroupValue;
    }

    /**
     * Set Bill dimension value. Note:  This field may return null, indicating that no valid values can be obtained.
     * @param GroupValue Bill dimension value. Note:  This field may return null, indicating that no valid values can be obtained.
     */
    public void setGroupValue(String GroupValue) {
        this.GroupValue = GroupValue;
    }

    /**
     * Get Original cost in USD. This parameter has become valid since Bill 3.0 took effect in May 2021, and before that `-` was returned for this parameter. If a customer has applied for a contract price different from the prices listed on the official website, `-` will also be returned for this parameter. 
     * @return TotalCost Original cost in USD. This parameter has become valid since Bill 3.0 took effect in May 2021, and before that `-` was returned for this parameter. If a customer has applied for a contract price different from the prices listed on the official website, `-` will also be returned for this parameter.
     */
    public String getTotalCost() {
        return this.TotalCost;
    }

    /**
     * Set Original cost in USD. This parameter has become valid since Bill 3.0 took effect in May 2021, and before that `-` was returned for this parameter. If a customer has applied for a contract price different from the prices listed on the official website, `-` will also be returned for this parameter.
     * @param TotalCost Original cost in USD. This parameter has become valid since Bill 3.0 took effect in May 2021, and before that `-` was returned for this parameter. If a customer has applied for a contract price different from the prices listed on the official website, `-` will also be returned for this parameter.
     */
    public void setTotalCost(String TotalCost) {
        this.TotalCost = TotalCost;
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
     * Get Cash credit:  The amount paid from the user’s cash account 
     * @return CashPayAmount Cash credit:  The amount paid from the user’s cash account
     */
    public String getCashPayAmount() {
        return this.CashPayAmount;
    }

    /**
     * Set Cash credit:  The amount paid from the user’s cash account
     * @param CashPayAmount Cash credit:  The amount paid from the user’s cash account
     */
    public void setCashPayAmount(String CashPayAmount) {
        this.CashPayAmount = CashPayAmount;
    }

    /**
     * Get Free credit:  The amount paid by the user’s free credit 
     * @return IncentivePayAmount Free credit:  The amount paid by the user’s free credit
     */
    public String getIncentivePayAmount() {
        return this.IncentivePayAmount;
    }

    /**
     * Set Free credit:  The amount paid by the user’s free credit
     * @param IncentivePayAmount Free credit:  The amount paid by the user’s free credit
     */
    public void setIncentivePayAmount(String IncentivePayAmount) {
        this.IncentivePayAmount = IncentivePayAmount;
    }

    /**
     * Get Voucher payment:  The voucher deduction amount 
     * @return VoucherPayAmount Voucher payment:  The voucher deduction amount
     */
    public String getVoucherPayAmount() {
        return this.VoucherPayAmount;
    }

    /**
     * Set Voucher payment:  The voucher deduction amount
     * @param VoucherPayAmount Voucher payment:  The voucher deduction amount
     */
    public void setVoucherPayAmount(String VoucherPayAmount) {
        this.VoucherPayAmount = VoucherPayAmount;
    }

    /**
     * Get Commission credit:  The amount paid by the user’s commission credit. Note:  This field may return null, indicating that no valid values can be obtained. 
     * @return TransferPayAmount Commission credit:  The amount paid by the user’s commission credit. Note:  This field may return null, indicating that no valid values can be obtained.
     */
    public String getTransferPayAmount() {
        return this.TransferPayAmount;
    }

    /**
     * Set Commission credit:  The amount paid by the user’s commission credit. Note:  This field may return null, indicating that no valid values can be obtained.
     * @param TransferPayAmount Commission credit:  The amount paid by the user’s commission credit. Note:  This field may return null, indicating that no valid values can be obtained.
     */
    public void setTransferPayAmount(String TransferPayAmount) {
        this.TransferPayAmount = TransferPayAmount;
    }

    /**
     * Get Detailed summary of products. Note:  This field may return null, indicating that no valid values can be obtained. 
     * @return Business Detailed summary of products. Note:  This field may return null, indicating that no valid values can be obtained.
     */
    public BusinessSummaryInfo [] getBusiness() {
        return this.Business;
    }

    /**
     * Set Detailed summary of products. Note:  This field may return null, indicating that no valid values can be obtained.
     * @param Business Detailed summary of products. Note:  This field may return null, indicating that no valid values can be obtained.
     */
    public void setBusiness(BusinessSummaryInfo [] Business) {
        this.Business = Business;
    }

    public SummaryDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SummaryDetail(SummaryDetail source) {
        if (source.GroupKey != null) {
            this.GroupKey = new String(source.GroupKey);
        }
        if (source.GroupValue != null) {
            this.GroupValue = new String(source.GroupValue);
        }
        if (source.TotalCost != null) {
            this.TotalCost = new String(source.TotalCost);
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
        if (source.Business != null) {
            this.Business = new BusinessSummaryInfo[source.Business.length];
            for (int i = 0; i < source.Business.length; i++) {
                this.Business[i] = new BusinessSummaryInfo(source.Business[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupKey", this.GroupKey);
        this.setParamSimple(map, prefix + "GroupValue", this.GroupValue);
        this.setParamSimple(map, prefix + "TotalCost", this.TotalCost);
        this.setParamSimple(map, prefix + "RealTotalCost", this.RealTotalCost);
        this.setParamSimple(map, prefix + "CashPayAmount", this.CashPayAmount);
        this.setParamSimple(map, prefix + "IncentivePayAmount", this.IncentivePayAmount);
        this.setParamSimple(map, prefix + "VoucherPayAmount", this.VoucherPayAmount);
        this.setParamSimple(map, prefix + "TransferPayAmount", this.TransferPayAmount);
        this.setParamArrayObj(map, prefix + "Business.", this.Business);

    }
}


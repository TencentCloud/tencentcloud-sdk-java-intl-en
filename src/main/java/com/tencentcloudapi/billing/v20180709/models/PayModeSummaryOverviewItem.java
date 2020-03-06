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

public class PayModeSummaryOverviewItem extends AbstractModel{

    /**
    * Billing mode
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * Billing mode name
    */
    @SerializedName("PayModeName")
    @Expose
    private String PayModeName;

    /**
    * Actual cost
    */
    @SerializedName("RealTotalCost")
    @Expose
    private String RealTotalCost;

    /**
    * Cost ratio, to two decimal points
    */
    @SerializedName("RealTotalCostRatio")
    @Expose
    private String RealTotalCostRatio;

    /**
    * Detailed summary of purchases by transaction type
    */
    @SerializedName("Detail")
    @Expose
    private ActionSummaryOverviewItem [] Detail;

    /**
    * Cash amount
    */
    @SerializedName("CashPayAmount")
    @Expose
    private String CashPayAmount;

    /**
    * Trial credit amount
    */
    @SerializedName("IncentivePayAmount")
    @Expose
    private String IncentivePayAmount;

    /**
    * Voucher amount
    */
    @SerializedName("VoucherPayAmount")
    @Expose
    private String VoucherPayAmount;

    /**
     * Get Billing mode 
     * @return PayMode Billing mode
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Billing mode
     * @param PayMode Billing mode
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Billing mode name 
     * @return PayModeName Billing mode name
     */
    public String getPayModeName() {
        return this.PayModeName;
    }

    /**
     * Set Billing mode name
     * @param PayModeName Billing mode name
     */
    public void setPayModeName(String PayModeName) {
        this.PayModeName = PayModeName;
    }

    /**
     * Get Actual cost 
     * @return RealTotalCost Actual cost
     */
    public String getRealTotalCost() {
        return this.RealTotalCost;
    }

    /**
     * Set Actual cost
     * @param RealTotalCost Actual cost
     */
    public void setRealTotalCost(String RealTotalCost) {
        this.RealTotalCost = RealTotalCost;
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
     * Get Detailed summary of purchases by transaction type 
     * @return Detail Detailed summary of purchases by transaction type
     */
    public ActionSummaryOverviewItem [] getDetail() {
        return this.Detail;
    }

    /**
     * Set Detailed summary of purchases by transaction type
     * @param Detail Detailed summary of purchases by transaction type
     */
    public void setDetail(ActionSummaryOverviewItem [] Detail) {
        this.Detail = Detail;
    }

    /**
     * Get Cash amount 
     * @return CashPayAmount Cash amount
     */
    public String getCashPayAmount() {
        return this.CashPayAmount;
    }

    /**
     * Set Cash amount
     * @param CashPayAmount Cash amount
     */
    public void setCashPayAmount(String CashPayAmount) {
        this.CashPayAmount = CashPayAmount;
    }

    /**
     * Get Trial credit amount 
     * @return IncentivePayAmount Trial credit amount
     */
    public String getIncentivePayAmount() {
        return this.IncentivePayAmount;
    }

    /**
     * Set Trial credit amount
     * @param IncentivePayAmount Trial credit amount
     */
    public void setIncentivePayAmount(String IncentivePayAmount) {
        this.IncentivePayAmount = IncentivePayAmount;
    }

    /**
     * Get Voucher amount 
     * @return VoucherPayAmount Voucher amount
     */
    public String getVoucherPayAmount() {
        return this.VoucherPayAmount;
    }

    /**
     * Set Voucher amount
     * @param VoucherPayAmount Voucher amount
     */
    public void setVoucherPayAmount(String VoucherPayAmount) {
        this.VoucherPayAmount = VoucherPayAmount;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "PayModeName", this.PayModeName);
        this.setParamSimple(map, prefix + "RealTotalCost", this.RealTotalCost);
        this.setParamSimple(map, prefix + "RealTotalCostRatio", this.RealTotalCostRatio);
        this.setParamArrayObj(map, prefix + "Detail.", this.Detail);
        this.setParamSimple(map, prefix + "CashPayAmount", this.CashPayAmount);
        this.setParamSimple(map, prefix + "IncentivePayAmount", this.IncentivePayAmount);
        this.setParamSimple(map, prefix + "VoucherPayAmount", this.VoucherPayAmount);

    }
}


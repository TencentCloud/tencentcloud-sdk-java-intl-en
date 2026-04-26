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

public class ConsumptionProjectSummaryDataItem extends AbstractModel {

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Project name
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * Discounted total price
    */
    @SerializedName("RealTotalCost")
    @Expose
    private String RealTotalCost;

    /**
    * Trend
    */
    @SerializedName("Trend")
    @Expose
    private ConsumptionSummaryTrend Trend;

    /**
    * Product consumption details
    */
    @SerializedName("Business")
    @Expose
    private ConsumptionBusinessSummaryDataItem [] Business;

    /**
    * Cash
    */
    @SerializedName("CashPayAmount")
    @Expose
    private String CashPayAmount;

    /**
    * Bonus
    */
    @SerializedName("IncentivePayAmount")
    @Expose
    private String IncentivePayAmount;

    /**
    * Voucher
    */
    @SerializedName("VoucherPayAmount")
    @Expose
    private String VoucherPayAmount;

    /**
    * Royalty amount
    */
    @SerializedName("TransferPayAmount")
    @Expose
    private String TransferPayAmount;

    /**
    * Tax
    */
    @SerializedName("Tax")
    @Expose
    private String Tax;

    /**
    * Cash payment (pre-tax)
    */
    @SerializedName("AmountBeforeTax")
    @Expose
    private String AmountBeforeTax;

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Project name 
     * @return ProjectName Project name
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set Project name
     * @param ProjectName Project name
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get Discounted total price 
     * @return RealTotalCost Discounted total price
     */
    public String getRealTotalCost() {
        return this.RealTotalCost;
    }

    /**
     * Set Discounted total price
     * @param RealTotalCost Discounted total price
     */
    public void setRealTotalCost(String RealTotalCost) {
        this.RealTotalCost = RealTotalCost;
    }

    /**
     * Get Trend 
     * @return Trend Trend
     */
    public ConsumptionSummaryTrend getTrend() {
        return this.Trend;
    }

    /**
     * Set Trend
     * @param Trend Trend
     */
    public void setTrend(ConsumptionSummaryTrend Trend) {
        this.Trend = Trend;
    }

    /**
     * Get Product consumption details 
     * @return Business Product consumption details
     */
    public ConsumptionBusinessSummaryDataItem [] getBusiness() {
        return this.Business;
    }

    /**
     * Set Product consumption details
     * @param Business Product consumption details
     */
    public void setBusiness(ConsumptionBusinessSummaryDataItem [] Business) {
        this.Business = Business;
    }

    /**
     * Get Cash 
     * @return CashPayAmount Cash
     */
    public String getCashPayAmount() {
        return this.CashPayAmount;
    }

    /**
     * Set Cash
     * @param CashPayAmount Cash
     */
    public void setCashPayAmount(String CashPayAmount) {
        this.CashPayAmount = CashPayAmount;
    }

    /**
     * Get Bonus 
     * @return IncentivePayAmount Bonus
     */
    public String getIncentivePayAmount() {
        return this.IncentivePayAmount;
    }

    /**
     * Set Bonus
     * @param IncentivePayAmount Bonus
     */
    public void setIncentivePayAmount(String IncentivePayAmount) {
        this.IncentivePayAmount = IncentivePayAmount;
    }

    /**
     * Get Voucher 
     * @return VoucherPayAmount Voucher
     */
    public String getVoucherPayAmount() {
        return this.VoucherPayAmount;
    }

    /**
     * Set Voucher
     * @param VoucherPayAmount Voucher
     */
    public void setVoucherPayAmount(String VoucherPayAmount) {
        this.VoucherPayAmount = VoucherPayAmount;
    }

    /**
     * Get Royalty amount 
     * @return TransferPayAmount Royalty amount
     */
    public String getTransferPayAmount() {
        return this.TransferPayAmount;
    }

    /**
     * Set Royalty amount
     * @param TransferPayAmount Royalty amount
     */
    public void setTransferPayAmount(String TransferPayAmount) {
        this.TransferPayAmount = TransferPayAmount;
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
     * Get Cash payment (pre-tax) 
     * @return AmountBeforeTax Cash payment (pre-tax)
     */
    public String getAmountBeforeTax() {
        return this.AmountBeforeTax;
    }

    /**
     * Set Cash payment (pre-tax)
     * @param AmountBeforeTax Cash payment (pre-tax)
     */
    public void setAmountBeforeTax(String AmountBeforeTax) {
        this.AmountBeforeTax = AmountBeforeTax;
    }

    public ConsumptionProjectSummaryDataItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConsumptionProjectSummaryDataItem(ConsumptionProjectSummaryDataItem source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.RealTotalCost != null) {
            this.RealTotalCost = new String(source.RealTotalCost);
        }
        if (source.Trend != null) {
            this.Trend = new ConsumptionSummaryTrend(source.Trend);
        }
        if (source.Business != null) {
            this.Business = new ConsumptionBusinessSummaryDataItem[source.Business.length];
            for (int i = 0; i < source.Business.length; i++) {
                this.Business[i] = new ConsumptionBusinessSummaryDataItem(source.Business[i]);
            }
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
        if (source.Tax != null) {
            this.Tax = new String(source.Tax);
        }
        if (source.AmountBeforeTax != null) {
            this.AmountBeforeTax = new String(source.AmountBeforeTax);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "RealTotalCost", this.RealTotalCost);
        this.setParamObj(map, prefix + "Trend.", this.Trend);
        this.setParamArrayObj(map, prefix + "Business.", this.Business);
        this.setParamSimple(map, prefix + "CashPayAmount", this.CashPayAmount);
        this.setParamSimple(map, prefix + "IncentivePayAmount", this.IncentivePayAmount);
        this.setParamSimple(map, prefix + "VoucherPayAmount", this.VoucherPayAmount);
        this.setParamSimple(map, prefix + "TransferPayAmount", this.TransferPayAmount);
        this.setParamSimple(map, prefix + "Tax", this.Tax);
        this.setParamSimple(map, prefix + "AmountBeforeTax", this.AmountBeforeTax);

    }
}


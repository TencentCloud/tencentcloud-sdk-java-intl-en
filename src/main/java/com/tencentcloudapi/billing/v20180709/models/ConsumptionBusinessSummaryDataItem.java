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

public class ConsumptionBusinessSummaryDataItem extends AbstractModel {

    /**
    * Product name code
    */
    @SerializedName("BusinessCode")
    @Expose
    private String BusinessCode;

    /**
    * Product name
    */
    @SerializedName("BusinessCodeName")
    @Expose
    private String BusinessCodeName;

    /**
    * Discounted total price
    */
    @SerializedName("RealTotalCost")
    @Expose
    private String RealTotalCost;

    /**
    * Cost trend
    */
    @SerializedName("Trend")
    @Expose
    private ConsumptionSummaryTrend Trend;

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
    * Cash payment (pre-tax)
    */
    @SerializedName("AmountBeforeTax")
    @Expose
    private String AmountBeforeTax;

    /**
    * Tax
    */
    @SerializedName("Tax")
    @Expose
    private String Tax;

    /**
    * Region name (only shown in regional summary)
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
     * Get Product name code 
     * @return BusinessCode Product name code
     */
    public String getBusinessCode() {
        return this.BusinessCode;
    }

    /**
     * Set Product name code
     * @param BusinessCode Product name code
     */
    public void setBusinessCode(String BusinessCode) {
        this.BusinessCode = BusinessCode;
    }

    /**
     * Get Product name 
     * @return BusinessCodeName Product name
     */
    public String getBusinessCodeName() {
        return this.BusinessCodeName;
    }

    /**
     * Set Product name
     * @param BusinessCodeName Product name
     */
    public void setBusinessCodeName(String BusinessCodeName) {
        this.BusinessCodeName = BusinessCodeName;
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
     * Get Cost trend 
     * @return Trend Cost trend
     */
    public ConsumptionSummaryTrend getTrend() {
        return this.Trend;
    }

    /**
     * Set Cost trend
     * @param Trend Cost trend
     */
    public void setTrend(ConsumptionSummaryTrend Trend) {
        this.Trend = Trend;
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
     * Get Region name (only shown in regional summary) 
     * @return RegionName Region name (only shown in regional summary)
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set Region name (only shown in regional summary)
     * @param RegionName Region name (only shown in regional summary)
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    public ConsumptionBusinessSummaryDataItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConsumptionBusinessSummaryDataItem(ConsumptionBusinessSummaryDataItem source) {
        if (source.BusinessCode != null) {
            this.BusinessCode = new String(source.BusinessCode);
        }
        if (source.BusinessCodeName != null) {
            this.BusinessCodeName = new String(source.BusinessCodeName);
        }
        if (source.RealTotalCost != null) {
            this.RealTotalCost = new String(source.RealTotalCost);
        }
        if (source.Trend != null) {
            this.Trend = new ConsumptionSummaryTrend(source.Trend);
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
        if (source.AmountBeforeTax != null) {
            this.AmountBeforeTax = new String(source.AmountBeforeTax);
        }
        if (source.Tax != null) {
            this.Tax = new String(source.Tax);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BusinessCode", this.BusinessCode);
        this.setParamSimple(map, prefix + "BusinessCodeName", this.BusinessCodeName);
        this.setParamSimple(map, prefix + "RealTotalCost", this.RealTotalCost);
        this.setParamObj(map, prefix + "Trend.", this.Trend);
        this.setParamSimple(map, prefix + "CashPayAmount", this.CashPayAmount);
        this.setParamSimple(map, prefix + "IncentivePayAmount", this.IncentivePayAmount);
        this.setParamSimple(map, prefix + "VoucherPayAmount", this.VoucherPayAmount);
        this.setParamSimple(map, prefix + "TransferPayAmount", this.TransferPayAmount);
        this.setParamSimple(map, prefix + "AmountBeforeTax", this.AmountBeforeTax);
        this.setParamSimple(map, prefix + "Tax", this.Tax);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);

    }
}


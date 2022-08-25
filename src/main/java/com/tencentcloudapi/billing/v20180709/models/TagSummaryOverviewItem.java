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

public class TagSummaryOverviewItem extends AbstractModel{

    /**
    * Tag value
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TagValue")
    @Expose
    private String TagValue;

    /**
    * Actual cost
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RealTotalCost")
    @Expose
    private String RealTotalCost;

    /**
    * Cost percentage rounded to two decimal places
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RealTotalCostRatio")
    @Expose
    private String RealTotalCostRatio;

    /**
    * The original cost in USD. This parameter has become valid since v3.0 bills took effect in May 2021, and before that `-` was returned for this parameter. If a customer uses a contract price different from the published price, `-` will also be returned for this parameter.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalCost")
    @Expose
    private String TotalCost;

    /**
    * Payment by cash credits
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CashPayAmount")
    @Expose
    private String CashPayAmount;

    /**
    * Payment by free credits
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IncentivePayAmount")
    @Expose
    private String IncentivePayAmount;

    /**
    * Payment by vouchers
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VoucherPayAmount")
    @Expose
    private String VoucherPayAmount;

    /**
    * Payment by commission credits
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TransferPayAmount")
    @Expose
    private String TransferPayAmount;

    /**
     * Get Tag value
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TagValue Tag value
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTagValue() {
        return this.TagValue;
    }

    /**
     * Set Tag value
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TagValue Tag value
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTagValue(String TagValue) {
        this.TagValue = TagValue;
    }

    /**
     * Get Actual cost
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RealTotalCost Actual cost
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRealTotalCost() {
        return this.RealTotalCost;
    }

    /**
     * Set Actual cost
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RealTotalCost Actual cost
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRealTotalCost(String RealTotalCost) {
        this.RealTotalCost = RealTotalCost;
    }

    /**
     * Get Cost percentage rounded to two decimal places
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RealTotalCostRatio Cost percentage rounded to two decimal places
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRealTotalCostRatio() {
        return this.RealTotalCostRatio;
    }

    /**
     * Set Cost percentage rounded to two decimal places
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RealTotalCostRatio Cost percentage rounded to two decimal places
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRealTotalCostRatio(String RealTotalCostRatio) {
        this.RealTotalCostRatio = RealTotalCostRatio;
    }

    /**
     * Get The original cost in USD. This parameter has become valid since v3.0 bills took effect in May 2021, and before that `-` was returned for this parameter. If a customer uses a contract price different from the published price, `-` will also be returned for this parameter.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return TotalCost The original cost in USD. This parameter has become valid since v3.0 bills took effect in May 2021, and before that `-` was returned for this parameter. If a customer uses a contract price different from the published price, `-` will also be returned for this parameter.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getTotalCost() {
        return this.TotalCost;
    }

    /**
     * Set The original cost in USD. This parameter has become valid since v3.0 bills took effect in May 2021, and before that `-` was returned for this parameter. If a customer uses a contract price different from the published price, `-` will also be returned for this parameter.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param TotalCost The original cost in USD. This parameter has become valid since v3.0 bills took effect in May 2021, and before that `-` was returned for this parameter. If a customer uses a contract price different from the published price, `-` will also be returned for this parameter.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTotalCost(String TotalCost) {
        this.TotalCost = TotalCost;
    }

    /**
     * Get Payment by cash credits
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CashPayAmount Payment by cash credits
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCashPayAmount() {
        return this.CashPayAmount;
    }

    /**
     * Set Payment by cash credits
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CashPayAmount Payment by cash credits
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCashPayAmount(String CashPayAmount) {
        this.CashPayAmount = CashPayAmount;
    }

    /**
     * Get Payment by free credits
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IncentivePayAmount Payment by free credits
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIncentivePayAmount() {
        return this.IncentivePayAmount;
    }

    /**
     * Set Payment by free credits
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IncentivePayAmount Payment by free credits
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIncentivePayAmount(String IncentivePayAmount) {
        this.IncentivePayAmount = IncentivePayAmount;
    }

    /**
     * Get Payment by vouchers
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VoucherPayAmount Payment by vouchers
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVoucherPayAmount() {
        return this.VoucherPayAmount;
    }

    /**
     * Set Payment by vouchers
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VoucherPayAmount Payment by vouchers
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVoucherPayAmount(String VoucherPayAmount) {
        this.VoucherPayAmount = VoucherPayAmount;
    }

    /**
     * Get Payment by commission credits
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TransferPayAmount Payment by commission credits
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTransferPayAmount() {
        return this.TransferPayAmount;
    }

    /**
     * Set Payment by commission credits
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TransferPayAmount Payment by commission credits
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTransferPayAmount(String TransferPayAmount) {
        this.TransferPayAmount = TransferPayAmount;
    }

    public TagSummaryOverviewItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TagSummaryOverviewItem(TagSummaryOverviewItem source) {
        if (source.TagValue != null) {
            this.TagValue = new String(source.TagValue);
        }
        if (source.RealTotalCost != null) {
            this.RealTotalCost = new String(source.RealTotalCost);
        }
        if (source.RealTotalCostRatio != null) {
            this.RealTotalCostRatio = new String(source.RealTotalCostRatio);
        }
        if (source.TotalCost != null) {
            this.TotalCost = new String(source.TotalCost);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TagValue", this.TagValue);
        this.setParamSimple(map, prefix + "RealTotalCost", this.RealTotalCost);
        this.setParamSimple(map, prefix + "RealTotalCostRatio", this.RealTotalCostRatio);
        this.setParamSimple(map, prefix + "TotalCost", this.TotalCost);
        this.setParamSimple(map, prefix + "CashPayAmount", this.CashPayAmount);
        this.setParamSimple(map, prefix + "IncentivePayAmount", this.IncentivePayAmount);
        this.setParamSimple(map, prefix + "VoucherPayAmount", this.VoucherPayAmount);
        this.setParamSimple(map, prefix + "TransferPayAmount", this.TransferPayAmount);

    }
}


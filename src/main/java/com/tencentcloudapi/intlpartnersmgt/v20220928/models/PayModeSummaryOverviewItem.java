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
package com.tencentcloudapi.intlpartnersmgt.v20220928.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PayModeSummaryOverviewItem extends AbstractModel {

    /**
    * Payment mode.
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * Payment mode name.
    */
    @SerializedName("PayModeName")
    @Expose
    private String PayModeName;

    /**
    * Actual total consumption, up to 8 decimal places.
    */
    @SerializedName("OriginalCost")
    @Expose
    private String OriginalCost;

    /**
    * Bill details in each payment mode.
    */
    @SerializedName("Detail")
    @Expose
    private ActionSummaryOverviewItem [] Detail;

    /**
    * Voucher payment amount, up to 8 decimal places.
    */
    @SerializedName("VoucherPayAmount")
    @Expose
    private String VoucherPayAmount;

    /**
    * Total consumption, up to 8 decimal places.
    */
    @SerializedName("TotalCost")
    @Expose
    private String TotalCost;

    /**
     * Get Payment mode. 
     * @return PayMode Payment mode.
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Payment mode.
     * @param PayMode Payment mode.
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Payment mode name. 
     * @return PayModeName Payment mode name.
     */
    public String getPayModeName() {
        return this.PayModeName;
    }

    /**
     * Set Payment mode name.
     * @param PayModeName Payment mode name.
     */
    public void setPayModeName(String PayModeName) {
        this.PayModeName = PayModeName;
    }

    /**
     * Get Actual total consumption, up to 8 decimal places. 
     * @return OriginalCost Actual total consumption, up to 8 decimal places.
     */
    public String getOriginalCost() {
        return this.OriginalCost;
    }

    /**
     * Set Actual total consumption, up to 8 decimal places.
     * @param OriginalCost Actual total consumption, up to 8 decimal places.
     */
    public void setOriginalCost(String OriginalCost) {
        this.OriginalCost = OriginalCost;
    }

    /**
     * Get Bill details in each payment mode. 
     * @return Detail Bill details in each payment mode.
     */
    public ActionSummaryOverviewItem [] getDetail() {
        return this.Detail;
    }

    /**
     * Set Bill details in each payment mode.
     * @param Detail Bill details in each payment mode.
     */
    public void setDetail(ActionSummaryOverviewItem [] Detail) {
        this.Detail = Detail;
    }

    /**
     * Get Voucher payment amount, up to 8 decimal places. 
     * @return VoucherPayAmount Voucher payment amount, up to 8 decimal places.
     */
    public String getVoucherPayAmount() {
        return this.VoucherPayAmount;
    }

    /**
     * Set Voucher payment amount, up to 8 decimal places.
     * @param VoucherPayAmount Voucher payment amount, up to 8 decimal places.
     */
    public void setVoucherPayAmount(String VoucherPayAmount) {
        this.VoucherPayAmount = VoucherPayAmount;
    }

    /**
     * Get Total consumption, up to 8 decimal places. 
     * @return TotalCost Total consumption, up to 8 decimal places.
     */
    public String getTotalCost() {
        return this.TotalCost;
    }

    /**
     * Set Total consumption, up to 8 decimal places.
     * @param TotalCost Total consumption, up to 8 decimal places.
     */
    public void setTotalCost(String TotalCost) {
        this.TotalCost = TotalCost;
    }

    public PayModeSummaryOverviewItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PayModeSummaryOverviewItem(PayModeSummaryOverviewItem source) {
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.PayModeName != null) {
            this.PayModeName = new String(source.PayModeName);
        }
        if (source.OriginalCost != null) {
            this.OriginalCost = new String(source.OriginalCost);
        }
        if (source.Detail != null) {
            this.Detail = new ActionSummaryOverviewItem[source.Detail.length];
            for (int i = 0; i < source.Detail.length; i++) {
                this.Detail[i] = new ActionSummaryOverviewItem(source.Detail[i]);
            }
        }
        if (source.VoucherPayAmount != null) {
            this.VoucherPayAmount = new String(source.VoucherPayAmount);
        }
        if (source.TotalCost != null) {
            this.TotalCost = new String(source.TotalCost);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "PayModeName", this.PayModeName);
        this.setParamSimple(map, prefix + "OriginalCost", this.OriginalCost);
        this.setParamArrayObj(map, prefix + "Detail.", this.Detail);
        this.setParamSimple(map, prefix + "VoucherPayAmount", this.VoucherPayAmount);
        this.setParamSimple(map, prefix + "TotalCost", this.TotalCost);

    }
}


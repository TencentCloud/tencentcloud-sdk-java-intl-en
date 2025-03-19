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
package com.tencentcloudapi.intlpartnersmgt.v20220928.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ActionSummaryOverviewItem extends AbstractModel {

    /**
    * Transaction type code.
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * Transaction type name.
    */
    @SerializedName("ActionTypeName")
    @Expose
    private String ActionTypeName;

    /**
    * Actual total consumption, up to 8 decimal places.
    */
    @SerializedName("OriginalCost")
    @Expose
    private String OriginalCost;

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
     * Get Transaction type code. 
     * @return ActionType Transaction type code.
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set Transaction type code.
     * @param ActionType Transaction type code.
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get Transaction type name. 
     * @return ActionTypeName Transaction type name.
     */
    public String getActionTypeName() {
        return this.ActionTypeName;
    }

    /**
     * Set Transaction type name.
     * @param ActionTypeName Transaction type name.
     */
    public void setActionTypeName(String ActionTypeName) {
        this.ActionTypeName = ActionTypeName;
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

    public ActionSummaryOverviewItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ActionSummaryOverviewItem(ActionSummaryOverviewItem source) {
        if (source.ActionType != null) {
            this.ActionType = new String(source.ActionType);
        }
        if (source.ActionTypeName != null) {
            this.ActionTypeName = new String(source.ActionTypeName);
        }
        if (source.OriginalCost != null) {
            this.OriginalCost = new String(source.OriginalCost);
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
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "ActionTypeName", this.ActionTypeName);
        this.setParamSimple(map, prefix + "OriginalCost", this.OriginalCost);
        this.setParamSimple(map, prefix + "VoucherPayAmount", this.VoucherPayAmount);
        this.setParamSimple(map, prefix + "TotalCost", this.TotalCost);

    }
}


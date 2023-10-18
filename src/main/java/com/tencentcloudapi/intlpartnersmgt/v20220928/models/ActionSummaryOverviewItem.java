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
    * Transaction type code
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * Transaction type name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ActionTypeName")
    @Expose
    private String ActionTypeName;

    /**
    * The actual total consumption amount accurate down to eight decimal places
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OriginalCost")
    @Expose
    private String OriginalCost;

    /**
    * The deducted voucher amount accurate down to eight decimal places
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VoucherPayAmount")
    @Expose
    private String VoucherPayAmount;

    /**
    * Total consumption amount accurate down to eight decimal places
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalCost")
    @Expose
    private String TotalCost;

    /**
     * Get Transaction type code
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ActionType Transaction type code
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set Transaction type code
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ActionType Transaction type code
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get Transaction type name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ActionTypeName Transaction type name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getActionTypeName() {
        return this.ActionTypeName;
    }

    /**
     * Set Transaction type name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ActionTypeName Transaction type name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setActionTypeName(String ActionTypeName) {
        this.ActionTypeName = ActionTypeName;
    }

    /**
     * Get The actual total consumption amount accurate down to eight decimal places
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OriginalCost The actual total consumption amount accurate down to eight decimal places
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOriginalCost() {
        return this.OriginalCost;
    }

    /**
     * Set The actual total consumption amount accurate down to eight decimal places
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OriginalCost The actual total consumption amount accurate down to eight decimal places
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOriginalCost(String OriginalCost) {
        this.OriginalCost = OriginalCost;
    }

    /**
     * Get The deducted voucher amount accurate down to eight decimal places
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VoucherPayAmount The deducted voucher amount accurate down to eight decimal places
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVoucherPayAmount() {
        return this.VoucherPayAmount;
    }

    /**
     * Set The deducted voucher amount accurate down to eight decimal places
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VoucherPayAmount The deducted voucher amount accurate down to eight decimal places
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVoucherPayAmount(String VoucherPayAmount) {
        this.VoucherPayAmount = VoucherPayAmount;
    }

    /**
     * Get Total consumption amount accurate down to eight decimal places
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TotalCost Total consumption amount accurate down to eight decimal places
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTotalCost() {
        return this.TotalCost;
    }

    /**
     * Set Total consumption amount accurate down to eight decimal places
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TotalCost Total consumption amount accurate down to eight decimal places
Note: This field may return null, indicating that no valid values can be obtained.
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


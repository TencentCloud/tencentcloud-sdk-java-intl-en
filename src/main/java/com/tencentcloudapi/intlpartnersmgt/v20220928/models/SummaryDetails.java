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

public class SummaryDetails extends AbstractModel {

    /**
    * Product information list.
    */
    @SerializedName("Business")
    @Expose
    private BusinessInfo [] Business;

    /**
    * Original price.
    */
    @SerializedName("OriginalCost")
    @Expose
    private String OriginalCost;

    /**
    * Voucher amount.
    */
    @SerializedName("VoucherPayAmount")
    @Expose
    private String VoucherPayAmount;

    /**
    * RI deduction.
    */
    @SerializedName("RICost")
    @Expose
    private String RICost;

    /**
    * <TOTAL_AMOUNT>.
    */
    @SerializedName("TotalCost")
    @Expose
    private String TotalCost;

    /**
    * Classification dimension summary key.
    */
    @SerializedName("GroupKey")
    @Expose
    private String GroupKey;

    /**
    * Summary value by classification dimension.
    */
    @SerializedName("GroupValue")
    @Expose
    private String GroupValue;

    /**
     * Get Product information list. 
     * @return Business Product information list.
     */
    public BusinessInfo [] getBusiness() {
        return this.Business;
    }

    /**
     * Set Product information list.
     * @param Business Product information list.
     */
    public void setBusiness(BusinessInfo [] Business) {
        this.Business = Business;
    }

    /**
     * Get Original price. 
     * @return OriginalCost Original price.
     */
    public String getOriginalCost() {
        return this.OriginalCost;
    }

    /**
     * Set Original price.
     * @param OriginalCost Original price.
     */
    public void setOriginalCost(String OriginalCost) {
        this.OriginalCost = OriginalCost;
    }

    /**
     * Get Voucher amount. 
     * @return VoucherPayAmount Voucher amount.
     */
    public String getVoucherPayAmount() {
        return this.VoucherPayAmount;
    }

    /**
     * Set Voucher amount.
     * @param VoucherPayAmount Voucher amount.
     */
    public void setVoucherPayAmount(String VoucherPayAmount) {
        this.VoucherPayAmount = VoucherPayAmount;
    }

    /**
     * Get RI deduction. 
     * @return RICost RI deduction.
     */
    public String getRICost() {
        return this.RICost;
    }

    /**
     * Set RI deduction.
     * @param RICost RI deduction.
     */
    public void setRICost(String RICost) {
        this.RICost = RICost;
    }

    /**
     * Get <TOTAL_AMOUNT>. 
     * @return TotalCost <TOTAL_AMOUNT>.
     */
    public String getTotalCost() {
        return this.TotalCost;
    }

    /**
     * Set <TOTAL_AMOUNT>.
     * @param TotalCost <TOTAL_AMOUNT>.
     */
    public void setTotalCost(String TotalCost) {
        this.TotalCost = TotalCost;
    }

    /**
     * Get Classification dimension summary key. 
     * @return GroupKey Classification dimension summary key.
     */
    public String getGroupKey() {
        return this.GroupKey;
    }

    /**
     * Set Classification dimension summary key.
     * @param GroupKey Classification dimension summary key.
     */
    public void setGroupKey(String GroupKey) {
        this.GroupKey = GroupKey;
    }

    /**
     * Get Summary value by classification dimension. 
     * @return GroupValue Summary value by classification dimension.
     */
    public String getGroupValue() {
        return this.GroupValue;
    }

    /**
     * Set Summary value by classification dimension.
     * @param GroupValue Summary value by classification dimension.
     */
    public void setGroupValue(String GroupValue) {
        this.GroupValue = GroupValue;
    }

    public SummaryDetails() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SummaryDetails(SummaryDetails source) {
        if (source.Business != null) {
            this.Business = new BusinessInfo[source.Business.length];
            for (int i = 0; i < source.Business.length; i++) {
                this.Business[i] = new BusinessInfo(source.Business[i]);
            }
        }
        if (source.OriginalCost != null) {
            this.OriginalCost = new String(source.OriginalCost);
        }
        if (source.VoucherPayAmount != null) {
            this.VoucherPayAmount = new String(source.VoucherPayAmount);
        }
        if (source.RICost != null) {
            this.RICost = new String(source.RICost);
        }
        if (source.TotalCost != null) {
            this.TotalCost = new String(source.TotalCost);
        }
        if (source.GroupKey != null) {
            this.GroupKey = new String(source.GroupKey);
        }
        if (source.GroupValue != null) {
            this.GroupValue = new String(source.GroupValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Business.", this.Business);
        this.setParamSimple(map, prefix + "OriginalCost", this.OriginalCost);
        this.setParamSimple(map, prefix + "VoucherPayAmount", this.VoucherPayAmount);
        this.setParamSimple(map, prefix + "RICost", this.RICost);
        this.setParamSimple(map, prefix + "TotalCost", this.TotalCost);
        this.setParamSimple(map, prefix + "GroupKey", this.GroupKey);
        this.setParamSimple(map, prefix + "GroupValue", this.GroupValue);

    }
}


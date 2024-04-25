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

public class SummaryDetails extends AbstractModel {

    /**
    * Product information list
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Business")
    @Expose
    private BusinessInfo [] Business;

    /**
    * Original price
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OriginalCost")
    @Expose
    private String OriginalCost;

    /**
    * Voucher amount
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VoucherPayAmount")
    @Expose
    private String VoucherPayAmount;

    /**
    * Daily deduction
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RICost")
    @Expose
    private String RICost;

    /**
    * Total amount
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalCost")
    @Expose
    private String TotalCost;

    /**
    * Summary key by classification dimension Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GroupKey")
    @Expose
    private String GroupKey;

    /**
    *  Summary value by classification dimension
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GroupValue")
    @Expose
    private String GroupValue;

    /**
     * Get Product information list
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Business Product information list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public BusinessInfo [] getBusiness() {
        return this.Business;
    }

    /**
     * Set Product information list
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Business Product information list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBusiness(BusinessInfo [] Business) {
        this.Business = Business;
    }

    /**
     * Get Original price
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OriginalCost Original price
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOriginalCost() {
        return this.OriginalCost;
    }

    /**
     * Set Original price
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OriginalCost Original price
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOriginalCost(String OriginalCost) {
        this.OriginalCost = OriginalCost;
    }

    /**
     * Get Voucher amount
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VoucherPayAmount Voucher amount
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVoucherPayAmount() {
        return this.VoucherPayAmount;
    }

    /**
     * Set Voucher amount
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VoucherPayAmount Voucher amount
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVoucherPayAmount(String VoucherPayAmount) {
        this.VoucherPayAmount = VoucherPayAmount;
    }

    /**
     * Get Daily deduction
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RICost Daily deduction
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRICost() {
        return this.RICost;
    }

    /**
     * Set Daily deduction
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RICost Daily deduction
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRICost(String RICost) {
        this.RICost = RICost;
    }

    /**
     * Get Total amount
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TotalCost Total amount
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTotalCost() {
        return this.TotalCost;
    }

    /**
     * Set Total amount
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TotalCost Total amount
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalCost(String TotalCost) {
        this.TotalCost = TotalCost;
    }

    /**
     * Get Summary key by classification dimension Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GroupKey Summary key by classification dimension Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getGroupKey() {
        return this.GroupKey;
    }

    /**
     * Set Summary key by classification dimension Note: This field may return null, indicating that no valid values can be obtained.
     * @param GroupKey Summary key by classification dimension Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGroupKey(String GroupKey) {
        this.GroupKey = GroupKey;
    }

    /**
     * Get  Summary value by classification dimension
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GroupValue  Summary value by classification dimension
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getGroupValue() {
        return this.GroupValue;
    }

    /**
     * Set  Summary value by classification dimension
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GroupValue  Summary value by classification dimension
Note: This field may return null, indicating that no valid values can be obtained.
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


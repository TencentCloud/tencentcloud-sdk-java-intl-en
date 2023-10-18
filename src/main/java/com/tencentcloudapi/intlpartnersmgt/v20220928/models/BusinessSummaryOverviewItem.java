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

public class BusinessSummaryOverviewItem extends AbstractModel {

    /**
    * Product code
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BusinessCode")
    @Expose
    private String BusinessCode;

    /**
    * Product name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BusinessCodeName")
    @Expose
    private String BusinessCodeName;

    /**
    * List price accurate down to eight decimal places
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
    * Consumption amount accurate down to eight decimal places
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalCost")
    @Expose
    private String TotalCost;

    /**
     * Get Product code
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BusinessCode Product code
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBusinessCode() {
        return this.BusinessCode;
    }

    /**
     * Set Product code
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BusinessCode Product code
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBusinessCode(String BusinessCode) {
        this.BusinessCode = BusinessCode;
    }

    /**
     * Get Product name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BusinessCodeName Product name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBusinessCodeName() {
        return this.BusinessCodeName;
    }

    /**
     * Set Product name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BusinessCodeName Product name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBusinessCodeName(String BusinessCodeName) {
        this.BusinessCodeName = BusinessCodeName;
    }

    /**
     * Get List price accurate down to eight decimal places
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OriginalCost List price accurate down to eight decimal places
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOriginalCost() {
        return this.OriginalCost;
    }

    /**
     * Set List price accurate down to eight decimal places
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OriginalCost List price accurate down to eight decimal places
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
     * Get Consumption amount accurate down to eight decimal places
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TotalCost Consumption amount accurate down to eight decimal places
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTotalCost() {
        return this.TotalCost;
    }

    /**
     * Set Consumption amount accurate down to eight decimal places
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TotalCost Consumption amount accurate down to eight decimal places
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalCost(String TotalCost) {
        this.TotalCost = TotalCost;
    }

    public BusinessSummaryOverviewItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BusinessSummaryOverviewItem(BusinessSummaryOverviewItem source) {
        if (source.BusinessCode != null) {
            this.BusinessCode = new String(source.BusinessCode);
        }
        if (source.BusinessCodeName != null) {
            this.BusinessCodeName = new String(source.BusinessCodeName);
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
        this.setParamSimple(map, prefix + "BusinessCode", this.BusinessCode);
        this.setParamSimple(map, prefix + "BusinessCodeName", this.BusinessCodeName);
        this.setParamSimple(map, prefix + "OriginalCost", this.OriginalCost);
        this.setParamSimple(map, prefix + "VoucherPayAmount", this.VoucherPayAmount);
        this.setParamSimple(map, prefix + "TotalCost", this.TotalCost);

    }
}


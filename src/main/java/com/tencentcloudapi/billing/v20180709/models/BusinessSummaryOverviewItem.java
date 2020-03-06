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

public class BusinessSummaryOverviewItem extends AbstractModel{

    /**
    * Product code
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("BusinessCode")
    @Expose
    private String BusinessCode;

    /**
    * Product name: major categories of Tencent Cloud services, e.g. CVM and TencentDB for MySQL
    */
    @SerializedName("BusinessCodeName")
    @Expose
    private String BusinessCodeName;

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
    * Billing month, e.g. `2019-08`
    */
    @SerializedName("BillMonth")
    @Expose
    private String BillMonth;

    /**
     * Get Product code
Note: This field may return null, indicating that no valid value was found. 
     * @return BusinessCode Product code
Note: This field may return null, indicating that no valid value was found.
     */
    public String getBusinessCode() {
        return this.BusinessCode;
    }

    /**
     * Set Product code
Note: This field may return null, indicating that no valid value was found.
     * @param BusinessCode Product code
Note: This field may return null, indicating that no valid value was found.
     */
    public void setBusinessCode(String BusinessCode) {
        this.BusinessCode = BusinessCode;
    }

    /**
     * Get Product name: major categories of Tencent Cloud services, e.g. CVM and TencentDB for MySQL 
     * @return BusinessCodeName Product name: major categories of Tencent Cloud services, e.g. CVM and TencentDB for MySQL
     */
    public String getBusinessCodeName() {
        return this.BusinessCodeName;
    }

    /**
     * Set Product name: major categories of Tencent Cloud services, e.g. CVM and TencentDB for MySQL
     * @param BusinessCodeName Product name: major categories of Tencent Cloud services, e.g. CVM and TencentDB for MySQL
     */
    public void setBusinessCodeName(String BusinessCodeName) {
        this.BusinessCodeName = BusinessCodeName;
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
     * Get Billing month, e.g. `2019-08` 
     * @return BillMonth Billing month, e.g. `2019-08`
     */
    public String getBillMonth() {
        return this.BillMonth;
    }

    /**
     * Set Billing month, e.g. `2019-08`
     * @param BillMonth Billing month, e.g. `2019-08`
     */
    public void setBillMonth(String BillMonth) {
        this.BillMonth = BillMonth;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BusinessCode", this.BusinessCode);
        this.setParamSimple(map, prefix + "BusinessCodeName", this.BusinessCodeName);
        this.setParamSimple(map, prefix + "RealTotalCost", this.RealTotalCost);
        this.setParamSimple(map, prefix + "RealTotalCostRatio", this.RealTotalCostRatio);
        this.setParamSimple(map, prefix + "CashPayAmount", this.CashPayAmount);
        this.setParamSimple(map, prefix + "IncentivePayAmount", this.IncentivePayAmount);
        this.setParamSimple(map, prefix + "VoucherPayAmount", this.VoucherPayAmount);
        this.setParamSimple(map, prefix + "BillMonth", this.BillMonth);

    }
}


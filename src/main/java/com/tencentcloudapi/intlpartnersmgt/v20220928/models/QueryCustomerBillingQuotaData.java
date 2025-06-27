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

public class QueryCustomerBillingQuotaData extends AbstractModel {

    /**
    * Total credit limit (unit: usd), accurate down to two decimal places.
    */
    @SerializedName("TotalCredit")
    @Expose
    private Float TotalCredit;

    /**
    * Remaining credit limit (unit: usd), accurate down to two decimal places.
    */
    @SerializedName("RemainingCredit")
    @Expose
    private Float RemainingCredit;

    /**
    * Remaining total voucher amount (unit: usd), accurate down to two decimal places.
    */
    @SerializedName("RemainingVoucher")
    @Expose
    private Float RemainingVoucher;

    /**
    * Forced status.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Force")
    @Expose
    private Long Force;

    /**
    * Prepaid frozen amount.
    */
    @SerializedName("PrepayFrozen")
    @Expose
    private Float PrepayFrozen;

    /**
    * Postpaid frozen amount.
    */
    @SerializedName("PostpayFrozen")
    @Expose
    private Float PostpayFrozen;

    /**
     * Get Total credit limit (unit: usd), accurate down to two decimal places. 
     * @return TotalCredit Total credit limit (unit: usd), accurate down to two decimal places.
     */
    public Float getTotalCredit() {
        return this.TotalCredit;
    }

    /**
     * Set Total credit limit (unit: usd), accurate down to two decimal places.
     * @param TotalCredit Total credit limit (unit: usd), accurate down to two decimal places.
     */
    public void setTotalCredit(Float TotalCredit) {
        this.TotalCredit = TotalCredit;
    }

    /**
     * Get Remaining credit limit (unit: usd), accurate down to two decimal places. 
     * @return RemainingCredit Remaining credit limit (unit: usd), accurate down to two decimal places.
     */
    public Float getRemainingCredit() {
        return this.RemainingCredit;
    }

    /**
     * Set Remaining credit limit (unit: usd), accurate down to two decimal places.
     * @param RemainingCredit Remaining credit limit (unit: usd), accurate down to two decimal places.
     */
    public void setRemainingCredit(Float RemainingCredit) {
        this.RemainingCredit = RemainingCredit;
    }

    /**
     * Get Remaining total voucher amount (unit: usd), accurate down to two decimal places. 
     * @return RemainingVoucher Remaining total voucher amount (unit: usd), accurate down to two decimal places.
     */
    public Float getRemainingVoucher() {
        return this.RemainingVoucher;
    }

    /**
     * Set Remaining total voucher amount (unit: usd), accurate down to two decimal places.
     * @param RemainingVoucher Remaining total voucher amount (unit: usd), accurate down to two decimal places.
     */
    public void setRemainingVoucher(Float RemainingVoucher) {
        this.RemainingVoucher = RemainingVoucher;
    }

    /**
     * Get Forced status.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Force Forced status.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getForce() {
        return this.Force;
    }

    /**
     * Set Forced status.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Force Forced status.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setForce(Long Force) {
        this.Force = Force;
    }

    /**
     * Get Prepaid frozen amount. 
     * @return PrepayFrozen Prepaid frozen amount.
     */
    public Float getPrepayFrozen() {
        return this.PrepayFrozen;
    }

    /**
     * Set Prepaid frozen amount.
     * @param PrepayFrozen Prepaid frozen amount.
     */
    public void setPrepayFrozen(Float PrepayFrozen) {
        this.PrepayFrozen = PrepayFrozen;
    }

    /**
     * Get Postpaid frozen amount. 
     * @return PostpayFrozen Postpaid frozen amount.
     */
    public Float getPostpayFrozen() {
        return this.PostpayFrozen;
    }

    /**
     * Set Postpaid frozen amount.
     * @param PostpayFrozen Postpaid frozen amount.
     */
    public void setPostpayFrozen(Float PostpayFrozen) {
        this.PostpayFrozen = PostpayFrozen;
    }

    public QueryCustomerBillingQuotaData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryCustomerBillingQuotaData(QueryCustomerBillingQuotaData source) {
        if (source.TotalCredit != null) {
            this.TotalCredit = new Float(source.TotalCredit);
        }
        if (source.RemainingCredit != null) {
            this.RemainingCredit = new Float(source.RemainingCredit);
        }
        if (source.RemainingVoucher != null) {
            this.RemainingVoucher = new Float(source.RemainingVoucher);
        }
        if (source.Force != null) {
            this.Force = new Long(source.Force);
        }
        if (source.PrepayFrozen != null) {
            this.PrepayFrozen = new Float(source.PrepayFrozen);
        }
        if (source.PostpayFrozen != null) {
            this.PostpayFrozen = new Float(source.PostpayFrozen);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCredit", this.TotalCredit);
        this.setParamSimple(map, prefix + "RemainingCredit", this.RemainingCredit);
        this.setParamSimple(map, prefix + "RemainingVoucher", this.RemainingVoucher);
        this.setParamSimple(map, prefix + "Force", this.Force);
        this.setParamSimple(map, prefix + "PrepayFrozen", this.PrepayFrozen);
        this.setParamSimple(map, prefix + "PostpayFrozen", this.PostpayFrozen);

    }
}


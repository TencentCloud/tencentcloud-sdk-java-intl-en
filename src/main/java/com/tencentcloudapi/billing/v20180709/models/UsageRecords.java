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

public class UsageRecords extends AbstractModel {

    /**
    * The amount used. The value of this parameter is the amount used (USD, rounded to 8 decimal places) multiplied by 100,000,000.
    */
    @SerializedName("UsedAmount")
    @Expose
    private Long UsedAmount;

    /**
    * The time when the voucher was used.
    */
    @SerializedName("UsedTime")
    @Expose
    private String UsedTime;

    /**
    * Usage record details
    */
    @SerializedName("UsageDetails")
    @Expose
    private UsageDetails [] UsageDetails;

    /**
    * Payment mode
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * Queried coupon id
    */
    @SerializedName("VoucherId")
    @Expose
    private String VoucherId;

    /**
    * Transaction scene: (adjust: adjust accounts, common: normal transaction scene)
    */
    @SerializedName("PayScene")
    @Expose
    private String PayScene;

    /**
    * Unique ID, corresponding to transaction: prepaid dealName, bill adjustment/postpaid outTradeNo
    */
    @SerializedName("SeqId")
    @Expose
    private String SeqId;

    /**
     * Get The amount used. The value of this parameter is the amount used (USD, rounded to 8 decimal places) multiplied by 100,000,000. 
     * @return UsedAmount The amount used. The value of this parameter is the amount used (USD, rounded to 8 decimal places) multiplied by 100,000,000.
     */
    public Long getUsedAmount() {
        return this.UsedAmount;
    }

    /**
     * Set The amount used. The value of this parameter is the amount used (USD, rounded to 8 decimal places) multiplied by 100,000,000.
     * @param UsedAmount The amount used. The value of this parameter is the amount used (USD, rounded to 8 decimal places) multiplied by 100,000,000.
     */
    public void setUsedAmount(Long UsedAmount) {
        this.UsedAmount = UsedAmount;
    }

    /**
     * Get The time when the voucher was used. 
     * @return UsedTime The time when the voucher was used.
     */
    public String getUsedTime() {
        return this.UsedTime;
    }

    /**
     * Set The time when the voucher was used.
     * @param UsedTime The time when the voucher was used.
     */
    public void setUsedTime(String UsedTime) {
        this.UsedTime = UsedTime;
    }

    /**
     * Get Usage record details 
     * @return UsageDetails Usage record details
     */
    public UsageDetails [] getUsageDetails() {
        return this.UsageDetails;
    }

    /**
     * Set Usage record details
     * @param UsageDetails Usage record details
     */
    public void setUsageDetails(UsageDetails [] UsageDetails) {
        this.UsageDetails = UsageDetails;
    }

    /**
     * Get Payment mode 
     * @return PayMode Payment mode
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Payment mode
     * @param PayMode Payment mode
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Queried coupon id 
     * @return VoucherId Queried coupon id
     */
    public String getVoucherId() {
        return this.VoucherId;
    }

    /**
     * Set Queried coupon id
     * @param VoucherId Queried coupon id
     */
    public void setVoucherId(String VoucherId) {
        this.VoucherId = VoucherId;
    }

    /**
     * Get Transaction scene: (adjust: adjust accounts, common: normal transaction scene) 
     * @return PayScene Transaction scene: (adjust: adjust accounts, common: normal transaction scene)
     */
    public String getPayScene() {
        return this.PayScene;
    }

    /**
     * Set Transaction scene: (adjust: adjust accounts, common: normal transaction scene)
     * @param PayScene Transaction scene: (adjust: adjust accounts, common: normal transaction scene)
     */
    public void setPayScene(String PayScene) {
        this.PayScene = PayScene;
    }

    /**
     * Get Unique ID, corresponding to transaction: prepaid dealName, bill adjustment/postpaid outTradeNo 
     * @return SeqId Unique ID, corresponding to transaction: prepaid dealName, bill adjustment/postpaid outTradeNo
     */
    public String getSeqId() {
        return this.SeqId;
    }

    /**
     * Set Unique ID, corresponding to transaction: prepaid dealName, bill adjustment/postpaid outTradeNo
     * @param SeqId Unique ID, corresponding to transaction: prepaid dealName, bill adjustment/postpaid outTradeNo
     */
    public void setSeqId(String SeqId) {
        this.SeqId = SeqId;
    }

    public UsageRecords() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UsageRecords(UsageRecords source) {
        if (source.UsedAmount != null) {
            this.UsedAmount = new Long(source.UsedAmount);
        }
        if (source.UsedTime != null) {
            this.UsedTime = new String(source.UsedTime);
        }
        if (source.UsageDetails != null) {
            this.UsageDetails = new UsageDetails[source.UsageDetails.length];
            for (int i = 0; i < source.UsageDetails.length; i++) {
                this.UsageDetails[i] = new UsageDetails(source.UsageDetails[i]);
            }
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.VoucherId != null) {
            this.VoucherId = new String(source.VoucherId);
        }
        if (source.PayScene != null) {
            this.PayScene = new String(source.PayScene);
        }
        if (source.SeqId != null) {
            this.SeqId = new String(source.SeqId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UsedAmount", this.UsedAmount);
        this.setParamSimple(map, prefix + "UsedTime", this.UsedTime);
        this.setParamArrayObj(map, prefix + "UsageDetails.", this.UsageDetails);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "VoucherId", this.VoucherId);
        this.setParamSimple(map, prefix + "PayScene", this.PayScene);
        this.setParamSimple(map, prefix + "SeqId", this.SeqId);

    }
}


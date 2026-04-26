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

public class AdjustInfoDetail extends AbstractModel {

    /**
    * Payer UIN: Account ID of the payer, which is the unique account identifier for the user in Tencent Cloud.
    */
    @SerializedName("PayerUin")
    @Expose
    private String PayerUin;

    /**
    * Bill month, formatted as yyyy-MM.
    */
    @SerializedName("Month")
    @Expose
    private String Month;

    /**
    * Adjustment type
Bill adjustment: manualAdjustment
Supplementary settlement: supplementarySettlement
Re-settlement
    */
    @SerializedName("AdjustType")
    @Expose
    private String AdjustType;

    /**
    * Adjustment Number
    */
    @SerializedName("AdjustNum")
    @Expose
    private String AdjustNum;

    /**
    * Abnormal adjustment completion time. Format: yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("AdjustCompletionTime")
    @Expose
    private String AdjustCompletionTime;

    /**
    * Adjustment Amount
    */
    @SerializedName("AdjustAmount")
    @Expose
    private Float AdjustAmount;

    /**
     * Get Payer UIN: Account ID of the payer, which is the unique account identifier for the user in Tencent Cloud. 
     * @return PayerUin Payer UIN: Account ID of the payer, which is the unique account identifier for the user in Tencent Cloud.
     */
    public String getPayerUin() {
        return this.PayerUin;
    }

    /**
     * Set Payer UIN: Account ID of the payer, which is the unique account identifier for the user in Tencent Cloud.
     * @param PayerUin Payer UIN: Account ID of the payer, which is the unique account identifier for the user in Tencent Cloud.
     */
    public void setPayerUin(String PayerUin) {
        this.PayerUin = PayerUin;
    }

    /**
     * Get Bill month, formatted as yyyy-MM. 
     * @return Month Bill month, formatted as yyyy-MM.
     */
    public String getMonth() {
        return this.Month;
    }

    /**
     * Set Bill month, formatted as yyyy-MM.
     * @param Month Bill month, formatted as yyyy-MM.
     */
    public void setMonth(String Month) {
        this.Month = Month;
    }

    /**
     * Get Adjustment type
Bill adjustment: manualAdjustment
Supplementary settlement: supplementarySettlement
Re-settlement 
     * @return AdjustType Adjustment type
Bill adjustment: manualAdjustment
Supplementary settlement: supplementarySettlement
Re-settlement
     */
    public String getAdjustType() {
        return this.AdjustType;
    }

    /**
     * Set Adjustment type
Bill adjustment: manualAdjustment
Supplementary settlement: supplementarySettlement
Re-settlement
     * @param AdjustType Adjustment type
Bill adjustment: manualAdjustment
Supplementary settlement: supplementarySettlement
Re-settlement
     */
    public void setAdjustType(String AdjustType) {
        this.AdjustType = AdjustType;
    }

    /**
     * Get Adjustment Number 
     * @return AdjustNum Adjustment Number
     */
    public String getAdjustNum() {
        return this.AdjustNum;
    }

    /**
     * Set Adjustment Number
     * @param AdjustNum Adjustment Number
     */
    public void setAdjustNum(String AdjustNum) {
        this.AdjustNum = AdjustNum;
    }

    /**
     * Get Abnormal adjustment completion time. Format: yyyy-MM-dd HH:mm:ss 
     * @return AdjustCompletionTime Abnormal adjustment completion time. Format: yyyy-MM-dd HH:mm:ss
     */
    public String getAdjustCompletionTime() {
        return this.AdjustCompletionTime;
    }

    /**
     * Set Abnormal adjustment completion time. Format: yyyy-MM-dd HH:mm:ss
     * @param AdjustCompletionTime Abnormal adjustment completion time. Format: yyyy-MM-dd HH:mm:ss
     */
    public void setAdjustCompletionTime(String AdjustCompletionTime) {
        this.AdjustCompletionTime = AdjustCompletionTime;
    }

    /**
     * Get Adjustment Amount 
     * @return AdjustAmount Adjustment Amount
     */
    public Float getAdjustAmount() {
        return this.AdjustAmount;
    }

    /**
     * Set Adjustment Amount
     * @param AdjustAmount Adjustment Amount
     */
    public void setAdjustAmount(Float AdjustAmount) {
        this.AdjustAmount = AdjustAmount;
    }

    public AdjustInfoDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdjustInfoDetail(AdjustInfoDetail source) {
        if (source.PayerUin != null) {
            this.PayerUin = new String(source.PayerUin);
        }
        if (source.Month != null) {
            this.Month = new String(source.Month);
        }
        if (source.AdjustType != null) {
            this.AdjustType = new String(source.AdjustType);
        }
        if (source.AdjustNum != null) {
            this.AdjustNum = new String(source.AdjustNum);
        }
        if (source.AdjustCompletionTime != null) {
            this.AdjustCompletionTime = new String(source.AdjustCompletionTime);
        }
        if (source.AdjustAmount != null) {
            this.AdjustAmount = new Float(source.AdjustAmount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PayerUin", this.PayerUin);
        this.setParamSimple(map, prefix + "Month", this.Month);
        this.setParamSimple(map, prefix + "AdjustType", this.AdjustType);
        this.setParamSimple(map, prefix + "AdjustNum", this.AdjustNum);
        this.setParamSimple(map, prefix + "AdjustCompletionTime", this.AdjustCompletionTime);
        this.setParamSimple(map, prefix + "AdjustAmount", this.AdjustAmount);

    }
}


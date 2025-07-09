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
    * Payer UIN, namely the account ID of the payer. The account ID is the user's unique account identifier on Tencent Cloud.
Note: This field may return null, indicating that no valid values can be obtained.
Example value: 909619400.
    */
    @SerializedName("PayerUin")
    @Expose
    private String PayerUin;

    /**
    * Bill month. Format: yyyy-MM.
Note: This field may return null, indicating that no valid value can be obtained.
Example value: 2024-10.
    */
    @SerializedName("Month")
    @Expose
    private String Month;

    /**
    * Adjustment type.
Adjustment: manualAdjustment.
Supplementary settlement: supplementarySettlement.
Re-settlement: reSettlement.
Note: This field may return null, indicating that no valid value can be obtained.
Example value: manualAdjustment.
    */
    @SerializedName("AdjustType")
    @Expose
    private String AdjustType;

    /**
    * Adjustment order number.
Note: This field may return null, indicating that no valid value can be obtained.
Example value: 2220726096135.
    */
    @SerializedName("AdjustNum")
    @Expose
    private String AdjustNum;

    /**
    * Completion time of exception adjustment. Format: yyyy-MM-dd HH:mm:ss.
Note: This field may return null, indicating that no valid value can be obtained.
Example value: 2022-12-02 12:39:04.
    */
    @SerializedName("AdjustCompletionTime")
    @Expose
    private String AdjustCompletionTime;

    /**
    * Adjustment amount.
Note: This field may return null, indicating that no valid value can be obtained.
Example value: 333.00000000.
    */
    @SerializedName("AdjustAmount")
    @Expose
    private Float AdjustAmount;

    /**
     * Get Payer UIN, namely the account ID of the payer. The account ID is the user's unique account identifier on Tencent Cloud.
Note: This field may return null, indicating that no valid values can be obtained.
Example value: 909619400. 
     * @return PayerUin Payer UIN, namely the account ID of the payer. The account ID is the user's unique account identifier on Tencent Cloud.
Note: This field may return null, indicating that no valid values can be obtained.
Example value: 909619400.
     */
    public String getPayerUin() {
        return this.PayerUin;
    }

    /**
     * Set Payer UIN, namely the account ID of the payer. The account ID is the user's unique account identifier on Tencent Cloud.
Note: This field may return null, indicating that no valid values can be obtained.
Example value: 909619400.
     * @param PayerUin Payer UIN, namely the account ID of the payer. The account ID is the user's unique account identifier on Tencent Cloud.
Note: This field may return null, indicating that no valid values can be obtained.
Example value: 909619400.
     */
    public void setPayerUin(String PayerUin) {
        this.PayerUin = PayerUin;
    }

    /**
     * Get Bill month. Format: yyyy-MM.
Note: This field may return null, indicating that no valid value can be obtained.
Example value: 2024-10. 
     * @return Month Bill month. Format: yyyy-MM.
Note: This field may return null, indicating that no valid value can be obtained.
Example value: 2024-10.
     */
    public String getMonth() {
        return this.Month;
    }

    /**
     * Set Bill month. Format: yyyy-MM.
Note: This field may return null, indicating that no valid value can be obtained.
Example value: 2024-10.
     * @param Month Bill month. Format: yyyy-MM.
Note: This field may return null, indicating that no valid value can be obtained.
Example value: 2024-10.
     */
    public void setMonth(String Month) {
        this.Month = Month;
    }

    /**
     * Get Adjustment type.
Adjustment: manualAdjustment.
Supplementary settlement: supplementarySettlement.
Re-settlement: reSettlement.
Note: This field may return null, indicating that no valid value can be obtained.
Example value: manualAdjustment. 
     * @return AdjustType Adjustment type.
Adjustment: manualAdjustment.
Supplementary settlement: supplementarySettlement.
Re-settlement: reSettlement.
Note: This field may return null, indicating that no valid value can be obtained.
Example value: manualAdjustment.
     */
    public String getAdjustType() {
        return this.AdjustType;
    }

    /**
     * Set Adjustment type.
Adjustment: manualAdjustment.
Supplementary settlement: supplementarySettlement.
Re-settlement: reSettlement.
Note: This field may return null, indicating that no valid value can be obtained.
Example value: manualAdjustment.
     * @param AdjustType Adjustment type.
Adjustment: manualAdjustment.
Supplementary settlement: supplementarySettlement.
Re-settlement: reSettlement.
Note: This field may return null, indicating that no valid value can be obtained.
Example value: manualAdjustment.
     */
    public void setAdjustType(String AdjustType) {
        this.AdjustType = AdjustType;
    }

    /**
     * Get Adjustment order number.
Note: This field may return null, indicating that no valid value can be obtained.
Example value: 2220726096135. 
     * @return AdjustNum Adjustment order number.
Note: This field may return null, indicating that no valid value can be obtained.
Example value: 2220726096135.
     */
    public String getAdjustNum() {
        return this.AdjustNum;
    }

    /**
     * Set Adjustment order number.
Note: This field may return null, indicating that no valid value can be obtained.
Example value: 2220726096135.
     * @param AdjustNum Adjustment order number.
Note: This field may return null, indicating that no valid value can be obtained.
Example value: 2220726096135.
     */
    public void setAdjustNum(String AdjustNum) {
        this.AdjustNum = AdjustNum;
    }

    /**
     * Get Completion time of exception adjustment. Format: yyyy-MM-dd HH:mm:ss.
Note: This field may return null, indicating that no valid value can be obtained.
Example value: 2022-12-02 12:39:04. 
     * @return AdjustCompletionTime Completion time of exception adjustment. Format: yyyy-MM-dd HH:mm:ss.
Note: This field may return null, indicating that no valid value can be obtained.
Example value: 2022-12-02 12:39:04.
     */
    public String getAdjustCompletionTime() {
        return this.AdjustCompletionTime;
    }

    /**
     * Set Completion time of exception adjustment. Format: yyyy-MM-dd HH:mm:ss.
Note: This field may return null, indicating that no valid value can be obtained.
Example value: 2022-12-02 12:39:04.
     * @param AdjustCompletionTime Completion time of exception adjustment. Format: yyyy-MM-dd HH:mm:ss.
Note: This field may return null, indicating that no valid value can be obtained.
Example value: 2022-12-02 12:39:04.
     */
    public void setAdjustCompletionTime(String AdjustCompletionTime) {
        this.AdjustCompletionTime = AdjustCompletionTime;
    }

    /**
     * Get Adjustment amount.
Note: This field may return null, indicating that no valid value can be obtained.
Example value: 333.00000000. 
     * @return AdjustAmount Adjustment amount.
Note: This field may return null, indicating that no valid value can be obtained.
Example value: 333.00000000.
     */
    public Float getAdjustAmount() {
        return this.AdjustAmount;
    }

    /**
     * Set Adjustment amount.
Note: This field may return null, indicating that no valid value can be obtained.
Example value: 333.00000000.
     * @param AdjustAmount Adjustment amount.
Note: This field may return null, indicating that no valid value can be obtained.
Example value: 333.00000000.
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


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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReconciliationStrategyInfo extends AbstractModel {

    /**
    * Offline Integration Task Reconciliation Alarms

reconciliationFailure: Alarm when offline reconciliation task fails

reconciliationOvertime: Alarm when offline reconciliation task runs overtime

reconciliationMismatch: Alarm when the number of mismatched records in reconciliation exceeds the threshold
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * Reconciliation Mismatch Threshold - Required when RuleType = reconciliationMismatch. Specifies the threshold for the number of mismatched records in reconciliation. No default value.
    */
    @SerializedName("MismatchCount")
    @Expose
    private Long MismatchCount;

    /**
    * Task run timeout threshold for reconciliation: hr, defaults to 0.
    */
    @SerializedName("Hour")
    @Expose
    private Long Hour;

    /**
    * Reconciliation task timeout threshold: minutes, defaults to 1.
    */
    @SerializedName("Min")
    @Expose
    private Long Min;

    /**
     * Get Offline Integration Task Reconciliation Alarms

reconciliationFailure: Alarm when offline reconciliation task fails

reconciliationOvertime: Alarm when offline reconciliation task runs overtime

reconciliationMismatch: Alarm when the number of mismatched records in reconciliation exceeds the threshold 
     * @return RuleType Offline Integration Task Reconciliation Alarms

reconciliationFailure: Alarm when offline reconciliation task fails

reconciliationOvertime: Alarm when offline reconciliation task runs overtime

reconciliationMismatch: Alarm when the number of mismatched records in reconciliation exceeds the threshold
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set Offline Integration Task Reconciliation Alarms

reconciliationFailure: Alarm when offline reconciliation task fails

reconciliationOvertime: Alarm when offline reconciliation task runs overtime

reconciliationMismatch: Alarm when the number of mismatched records in reconciliation exceeds the threshold
     * @param RuleType Offline Integration Task Reconciliation Alarms

reconciliationFailure: Alarm when offline reconciliation task fails

reconciliationOvertime: Alarm when offline reconciliation task runs overtime

reconciliationMismatch: Alarm when the number of mismatched records in reconciliation exceeds the threshold
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get Reconciliation Mismatch Threshold - Required when RuleType = reconciliationMismatch. Specifies the threshold for the number of mismatched records in reconciliation. No default value. 
     * @return MismatchCount Reconciliation Mismatch Threshold - Required when RuleType = reconciliationMismatch. Specifies the threshold for the number of mismatched records in reconciliation. No default value.
     */
    public Long getMismatchCount() {
        return this.MismatchCount;
    }

    /**
     * Set Reconciliation Mismatch Threshold - Required when RuleType = reconciliationMismatch. Specifies the threshold for the number of mismatched records in reconciliation. No default value.
     * @param MismatchCount Reconciliation Mismatch Threshold - Required when RuleType = reconciliationMismatch. Specifies the threshold for the number of mismatched records in reconciliation. No default value.
     */
    public void setMismatchCount(Long MismatchCount) {
        this.MismatchCount = MismatchCount;
    }

    /**
     * Get Task run timeout threshold for reconciliation: hr, defaults to 0. 
     * @return Hour Task run timeout threshold for reconciliation: hr, defaults to 0.
     */
    public Long getHour() {
        return this.Hour;
    }

    /**
     * Set Task run timeout threshold for reconciliation: hr, defaults to 0.
     * @param Hour Task run timeout threshold for reconciliation: hr, defaults to 0.
     */
    public void setHour(Long Hour) {
        this.Hour = Hour;
    }

    /**
     * Get Reconciliation task timeout threshold: minutes, defaults to 1. 
     * @return Min Reconciliation task timeout threshold: minutes, defaults to 1.
     */
    public Long getMin() {
        return this.Min;
    }

    /**
     * Set Reconciliation task timeout threshold: minutes, defaults to 1.
     * @param Min Reconciliation task timeout threshold: minutes, defaults to 1.
     */
    public void setMin(Long Min) {
        this.Min = Min;
    }

    public ReconciliationStrategyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReconciliationStrategyInfo(ReconciliationStrategyInfo source) {
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.MismatchCount != null) {
            this.MismatchCount = new Long(source.MismatchCount);
        }
        if (source.Hour != null) {
            this.Hour = new Long(source.Hour);
        }
        if (source.Min != null) {
            this.Min = new Long(source.Min);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "MismatchCount", this.MismatchCount);
        this.setParamSimple(map, prefix + "Hour", this.Hour);
        this.setParamSimple(map, prefix + "Min", this.Min);

    }
}


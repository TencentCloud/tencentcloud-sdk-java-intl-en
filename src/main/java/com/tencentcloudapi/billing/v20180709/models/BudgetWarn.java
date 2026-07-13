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

public class BudgetWarn extends AbstractModel {

    /**
    * ACTUAL amount
FORECAST Amount
    */
    @SerializedName("WarnType")
    @Expose
    private String WarnType;

    /**
    * PERCENTAGE Percentage of the budget amount, ABS Fixed value
    */
    @SerializedName("CalType")
    @Expose
    private String CalType;

    /**
    * Threshold (greater than or equal to 0)
    */
    @SerializedName("ThresholdValue")
    @Expose
    private String ThresholdValue;

    /**
     * Get ACTUAL amount
FORECAST Amount 
     * @return WarnType ACTUAL amount
FORECAST Amount
     */
    public String getWarnType() {
        return this.WarnType;
    }

    /**
     * Set ACTUAL amount
FORECAST Amount
     * @param WarnType ACTUAL amount
FORECAST Amount
     */
    public void setWarnType(String WarnType) {
        this.WarnType = WarnType;
    }

    /**
     * Get PERCENTAGE Percentage of the budget amount, ABS Fixed value 
     * @return CalType PERCENTAGE Percentage of the budget amount, ABS Fixed value
     */
    public String getCalType() {
        return this.CalType;
    }

    /**
     * Set PERCENTAGE Percentage of the budget amount, ABS Fixed value
     * @param CalType PERCENTAGE Percentage of the budget amount, ABS Fixed value
     */
    public void setCalType(String CalType) {
        this.CalType = CalType;
    }

    /**
     * Get Threshold (greater than or equal to 0) 
     * @return ThresholdValue Threshold (greater than or equal to 0)
     */
    public String getThresholdValue() {
        return this.ThresholdValue;
    }

    /**
     * Set Threshold (greater than or equal to 0)
     * @param ThresholdValue Threshold (greater than or equal to 0)
     */
    public void setThresholdValue(String ThresholdValue) {
        this.ThresholdValue = ThresholdValue;
    }

    public BudgetWarn() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BudgetWarn(BudgetWarn source) {
        if (source.WarnType != null) {
            this.WarnType = new String(source.WarnType);
        }
        if (source.CalType != null) {
            this.CalType = new String(source.CalType);
        }
        if (source.ThresholdValue != null) {
            this.ThresholdValue = new String(source.ThresholdValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WarnType", this.WarnType);
        this.setParamSimple(map, prefix + "CalType", this.CalType);
        this.setParamSimple(map, prefix + "ThresholdValue", this.ThresholdValue);

    }
}


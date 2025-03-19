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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApmField extends AbstractModel {

    /**
    * Metric name.
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Indicator numerical value.
    */
    @SerializedName("Value")
    @Expose
    private Float Value;

    /**
    * Units corresponding to the metric.
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * Year-Over-Year result array, recommended to use.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CompareVals")
    @Expose
    private APMKVItem [] CompareVals;

    /**
    * Indicator numerical value of the previous period in year-over-year comparison.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastPeriodValue")
    @Expose
    private APMKV [] LastPeriodValue;

    /**
    * Year-On-Year metric value. deprecated, not recommended for use.
    */
    @SerializedName("CompareVal")
    @Expose
    private String CompareVal;

    /**
     * Get Metric name. 
     * @return Key Metric name.
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Metric name.
     * @param Key Metric name.
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Indicator numerical value. 
     * @return Value Indicator numerical value.
     */
    public Float getValue() {
        return this.Value;
    }

    /**
     * Set Indicator numerical value.
     * @param Value Indicator numerical value.
     */
    public void setValue(Float Value) {
        this.Value = Value;
    }

    /**
     * Get Units corresponding to the metric. 
     * @return Unit Units corresponding to the metric.
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set Units corresponding to the metric.
     * @param Unit Units corresponding to the metric.
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get Year-Over-Year result array, recommended to use.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CompareVals Year-Over-Year result array, recommended to use.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public APMKVItem [] getCompareVals() {
        return this.CompareVals;
    }

    /**
     * Set Year-Over-Year result array, recommended to use.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CompareVals Year-Over-Year result array, recommended to use.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCompareVals(APMKVItem [] CompareVals) {
        this.CompareVals = CompareVals;
    }

    /**
     * Get Indicator numerical value of the previous period in year-over-year comparison.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return LastPeriodValue Indicator numerical value of the previous period in year-over-year comparison.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public APMKV [] getLastPeriodValue() {
        return this.LastPeriodValue;
    }

    /**
     * Set Indicator numerical value of the previous period in year-over-year comparison.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param LastPeriodValue Indicator numerical value of the previous period in year-over-year comparison.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLastPeriodValue(APMKV [] LastPeriodValue) {
        this.LastPeriodValue = LastPeriodValue;
    }

    /**
     * Get Year-On-Year metric value. deprecated, not recommended for use. 
     * @return CompareVal Year-On-Year metric value. deprecated, not recommended for use.
     */
    public String getCompareVal() {
        return this.CompareVal;
    }

    /**
     * Set Year-On-Year metric value. deprecated, not recommended for use.
     * @param CompareVal Year-On-Year metric value. deprecated, not recommended for use.
     */
    public void setCompareVal(String CompareVal) {
        this.CompareVal = CompareVal;
    }

    public ApmField() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApmField(ApmField source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new Float(source.Value);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
        if (source.CompareVals != null) {
            this.CompareVals = new APMKVItem[source.CompareVals.length];
            for (int i = 0; i < source.CompareVals.length; i++) {
                this.CompareVals[i] = new APMKVItem(source.CompareVals[i]);
            }
        }
        if (source.LastPeriodValue != null) {
            this.LastPeriodValue = new APMKV[source.LastPeriodValue.length];
            for (int i = 0; i < source.LastPeriodValue.length; i++) {
                this.LastPeriodValue[i] = new APMKV(source.LastPeriodValue[i]);
            }
        }
        if (source.CompareVal != null) {
            this.CompareVal = new String(source.CompareVal);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamArrayObj(map, prefix + "CompareVals.", this.CompareVals);
        this.setParamArrayObj(map, prefix + "LastPeriodValue.", this.LastPeriodValue);
        this.setParamSimple(map, prefix + "CompareVal", this.CompareVal);

    }
}


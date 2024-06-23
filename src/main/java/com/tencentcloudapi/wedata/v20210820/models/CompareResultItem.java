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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CompareResultItem extends AbstractModel {

    /**
    * Comparison Result, 1 is true, 2 is false
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("FixResult")
    @Expose
    private Long FixResult;

    /**
    * Quality SQL Execution Result
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ResultValue")
    @Expose
    private String ResultValue;

    /**
    * Threshold List
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Values")
    @Expose
    private ThresholdValue [] Values;

    /**
    * Comparison Operation Type
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * Comparison Type
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CompareType")
    @Expose
    private Long CompareType;

    /**
    * Value Comparison Type
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ValueComputeType")
    @Expose
    private Long ValueComputeType;

    /**
     * Get Comparison Result, 1 is true, 2 is false
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return FixResult Comparison Result, 1 is true, 2 is false
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getFixResult() {
        return this.FixResult;
    }

    /**
     * Set Comparison Result, 1 is true, 2 is false
Note: This field may return null, indicating that no valid value can be obtained.
     * @param FixResult Comparison Result, 1 is true, 2 is false
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setFixResult(Long FixResult) {
        this.FixResult = FixResult;
    }

    /**
     * Get Quality SQL Execution Result
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ResultValue Quality SQL Execution Result
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getResultValue() {
        return this.ResultValue;
    }

    /**
     * Set Quality SQL Execution Result
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ResultValue Quality SQL Execution Result
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setResultValue(String ResultValue) {
        this.ResultValue = ResultValue;
    }

    /**
     * Get Threshold List
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Values Threshold List
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public ThresholdValue [] getValues() {
        return this.Values;
    }

    /**
     * Set Threshold List
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Values Threshold List
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setValues(ThresholdValue [] Values) {
        this.Values = Values;
    }

    /**
     * Get Comparison Operation Type
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Operator Comparison Operation Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set Comparison Operation Type
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Operator Comparison Operation Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get Comparison Type
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CompareType Comparison Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getCompareType() {
        return this.CompareType;
    }

    /**
     * Set Comparison Type
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CompareType Comparison Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCompareType(Long CompareType) {
        this.CompareType = CompareType;
    }

    /**
     * Get Value Comparison Type
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ValueComputeType Value Comparison Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getValueComputeType() {
        return this.ValueComputeType;
    }

    /**
     * Set Value Comparison Type
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ValueComputeType Value Comparison Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setValueComputeType(Long ValueComputeType) {
        this.ValueComputeType = ValueComputeType;
    }

    public CompareResultItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CompareResultItem(CompareResultItem source) {
        if (source.FixResult != null) {
            this.FixResult = new Long(source.FixResult);
        }
        if (source.ResultValue != null) {
            this.ResultValue = new String(source.ResultValue);
        }
        if (source.Values != null) {
            this.Values = new ThresholdValue[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new ThresholdValue(source.Values[i]);
            }
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.CompareType != null) {
            this.CompareType = new Long(source.CompareType);
        }
        if (source.ValueComputeType != null) {
            this.ValueComputeType = new Long(source.ValueComputeType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FixResult", this.FixResult);
        this.setParamSimple(map, prefix + "ResultValue", this.ResultValue);
        this.setParamArrayObj(map, prefix + "Values.", this.Values);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "CompareType", this.CompareType);
        this.setParamSimple(map, prefix + "ValueComputeType", this.ValueComputeType);

    }
}


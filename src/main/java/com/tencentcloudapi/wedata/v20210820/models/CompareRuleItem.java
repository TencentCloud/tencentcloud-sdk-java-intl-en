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

public class CompareRuleItem extends AbstractModel {

    /**
    * Comparison Type 1. Fixed value  2. Fluctuation Value  3. Numeric Range Comparison  4. Enumeration Range Comparison  5. No Comparison
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CompareType")
    @Expose
    private Long CompareType;

    /**
    * Comparison Operation Type
<  <=  ==  =>  > !=
IRLCRO: Within the interval (left closed, right open)
IRLORC: Within the interval (left open, right closed)
IRLCRC: Within the interval (left closed, right closed)
IRLORO: Within the interval (left open, right open)
NRLCRO: Not within the range (left-closed, right-open)
NRLORC: Not within the range (left-open, right-closed)
NRLCRC: Not within the range (left-closed, right-closed)
NRLORO: Not within the range (left-open, right-open)
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * Quality statistical value types 1. Absolute Value 2. Increase 3. Decline 4. _C includes 5. N_C does not include
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ValueComputeType")
    @Expose
    private Long ValueComputeType;

    /**
    * Comparison threshold list
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ValueList")
    @Expose
    private ThresholdValue [] ValueList;

    /**
     * Get Comparison Type 1. Fixed value  2. Fluctuation Value  3. Numeric Range Comparison  4. Enumeration Range Comparison  5. No Comparison
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CompareType Comparison Type 1. Fixed value  2. Fluctuation Value  3. Numeric Range Comparison  4. Enumeration Range Comparison  5. No Comparison
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getCompareType() {
        return this.CompareType;
    }

    /**
     * Set Comparison Type 1. Fixed value  2. Fluctuation Value  3. Numeric Range Comparison  4. Enumeration Range Comparison  5. No Comparison
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CompareType Comparison Type 1. Fixed value  2. Fluctuation Value  3. Numeric Range Comparison  4. Enumeration Range Comparison  5. No Comparison
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCompareType(Long CompareType) {
        this.CompareType = CompareType;
    }

    /**
     * Get Comparison Operation Type
<  <=  ==  =>  > !=
IRLCRO: Within the interval (left closed, right open)
IRLORC: Within the interval (left open, right closed)
IRLCRC: Within the interval (left closed, right closed)
IRLORO: Within the interval (left open, right open)
NRLCRO: Not within the range (left-closed, right-open)
NRLORC: Not within the range (left-open, right-closed)
NRLCRC: Not within the range (left-closed, right-closed)
NRLORO: Not within the range (left-open, right-open)
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Operator Comparison Operation Type
<  <=  ==  =>  > !=
IRLCRO: Within the interval (left closed, right open)
IRLORC: Within the interval (left open, right closed)
IRLCRC: Within the interval (left closed, right closed)
IRLORO: Within the interval (left open, right open)
NRLCRO: Not within the range (left-closed, right-open)
NRLORC: Not within the range (left-open, right-closed)
NRLCRC: Not within the range (left-closed, right-closed)
NRLORO: Not within the range (left-open, right-open)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set Comparison Operation Type
<  <=  ==  =>  > !=
IRLCRO: Within the interval (left closed, right open)
IRLORC: Within the interval (left open, right closed)
IRLCRC: Within the interval (left closed, right closed)
IRLORO: Within the interval (left open, right open)
NRLCRO: Not within the range (left-closed, right-open)
NRLORC: Not within the range (left-open, right-closed)
NRLCRC: Not within the range (left-closed, right-closed)
NRLORO: Not within the range (left-open, right-open)
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Operator Comparison Operation Type
<  <=  ==  =>  > !=
IRLCRO: Within the interval (left closed, right open)
IRLORC: Within the interval (left open, right closed)
IRLCRC: Within the interval (left closed, right closed)
IRLORO: Within the interval (left open, right open)
NRLCRO: Not within the range (left-closed, right-open)
NRLORC: Not within the range (left-open, right-closed)
NRLCRC: Not within the range (left-closed, right-closed)
NRLORO: Not within the range (left-open, right-open)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get Quality statistical value types 1. Absolute Value 2. Increase 3. Decline 4. _C includes 5. N_C does not include
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ValueComputeType Quality statistical value types 1. Absolute Value 2. Increase 3. Decline 4. _C includes 5. N_C does not include
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getValueComputeType() {
        return this.ValueComputeType;
    }

    /**
     * Set Quality statistical value types 1. Absolute Value 2. Increase 3. Decline 4. _C includes 5. N_C does not include
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ValueComputeType Quality statistical value types 1. Absolute Value 2. Increase 3. Decline 4. _C includes 5. N_C does not include
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setValueComputeType(Long ValueComputeType) {
        this.ValueComputeType = ValueComputeType;
    }

    /**
     * Get Comparison threshold list
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ValueList Comparison threshold list
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public ThresholdValue [] getValueList() {
        return this.ValueList;
    }

    /**
     * Set Comparison threshold list
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ValueList Comparison threshold list
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setValueList(ThresholdValue [] ValueList) {
        this.ValueList = ValueList;
    }

    public CompareRuleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CompareRuleItem(CompareRuleItem source) {
        if (source.CompareType != null) {
            this.CompareType = new Long(source.CompareType);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.ValueComputeType != null) {
            this.ValueComputeType = new Long(source.ValueComputeType);
        }
        if (source.ValueList != null) {
            this.ValueList = new ThresholdValue[source.ValueList.length];
            for (int i = 0; i < source.ValueList.length; i++) {
                this.ValueList[i] = new ThresholdValue(source.ValueList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CompareType", this.CompareType);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "ValueComputeType", this.ValueComputeType);
        this.setParamArrayObj(map, prefix + "ValueList.", this.ValueList);

    }
}


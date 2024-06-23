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

public class ThresholdValue extends AbstractModel {

    /**
    * Threshold type 1. Low threshold 2. High threshold 3. Normal threshold 4. Enumerated values
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ValueType")
    @Expose
    private Long ValueType;

    /**
    * ThresholdNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get Threshold type 1. Low threshold 2. High threshold 3. Normal threshold 4. Enumerated values
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ValueType Threshold type 1. Low threshold 2. High threshold 3. Normal threshold 4. Enumerated values
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getValueType() {
        return this.ValueType;
    }

    /**
     * Set Threshold type 1. Low threshold 2. High threshold 3. Normal threshold 4. Enumerated values
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ValueType Threshold type 1. Low threshold 2. High threshold 3. Normal threshold 4. Enumerated values
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setValueType(Long ValueType) {
        this.ValueType = ValueType;
    }

    /**
     * Get ThresholdNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Value ThresholdNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set ThresholdNote: This field may return null, indicating that no valid value can be obtained.
     * @param Value ThresholdNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public ThresholdValue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ThresholdValue(ThresholdValue source) {
        if (source.ValueType != null) {
            this.ValueType = new Long(source.ValueType);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ValueType", this.ValueType);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}


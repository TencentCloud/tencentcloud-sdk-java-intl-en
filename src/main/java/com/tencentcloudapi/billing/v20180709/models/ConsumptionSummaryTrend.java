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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConsumptionSummaryTrend extends AbstractModel {

    /**
    * Trend type, upward for rising, downward for falling, none for no change
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Trend value. The value is null when Type is none.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get Trend type, upward for rising, downward for falling, none for no change 
     * @return Type Trend type, upward for rising, downward for falling, none for no change
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Trend type, upward for rising, downward for falling, none for no change
     * @param Type Trend type, upward for rising, downward for falling, none for no change
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Trend value. The value is null when Type is none.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Value Trend value. The value is null when Type is none.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Trend value. The value is null when Type is none.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Value Trend value. The value is null when Type is none.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public ConsumptionSummaryTrend() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConsumptionSummaryTrend(ConsumptionSummaryTrend source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}


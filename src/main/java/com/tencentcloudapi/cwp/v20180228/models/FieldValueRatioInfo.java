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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FieldValueRatioInfo extends AbstractModel {

    /**
    * Number
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Ratio
    */
    @SerializedName("Ratio")
    @Expose
    private Float Ratio;

    /**
    * Value
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get Number 
     * @return Count Number
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Number
     * @param Count Number
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Ratio 
     * @return Ratio Ratio
     */
    public Float getRatio() {
        return this.Ratio;
    }

    /**
     * Set Ratio
     * @param Ratio Ratio
     */
    public void setRatio(Float Ratio) {
        this.Ratio = Ratio;
    }

    /**
     * Get Value 
     * @return Value Value
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Value
     * @param Value Value
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public FieldValueRatioInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FieldValueRatioInfo(FieldValueRatioInfo source) {
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Ratio != null) {
            this.Ratio = new Float(source.Ratio);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Ratio", this.Ratio);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}


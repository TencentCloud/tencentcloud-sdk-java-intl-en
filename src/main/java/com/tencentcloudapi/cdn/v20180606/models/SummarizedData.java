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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SummarizedData extends AbstractModel {

    /**
    * Aggregation method, which can be:
`sum`: Aggregate summation
`max`: Maximum value. In bandwidth mode, the peak bandwidth is calculated based on the data aggregated in 5 minutes.
`avg`: Average value
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Aggregated value
    */
    @SerializedName("Value")
    @Expose
    private Float Value;

    /**
     * Get Aggregation method, which can be:
`sum`: Aggregate summation
`max`: Maximum value. In bandwidth mode, the peak bandwidth is calculated based on the data aggregated in 5 minutes.
`avg`: Average value 
     * @return Name Aggregation method, which can be:
`sum`: Aggregate summation
`max`: Maximum value. In bandwidth mode, the peak bandwidth is calculated based on the data aggregated in 5 minutes.
`avg`: Average value
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Aggregation method, which can be:
`sum`: Aggregate summation
`max`: Maximum value. In bandwidth mode, the peak bandwidth is calculated based on the data aggregated in 5 minutes.
`avg`: Average value
     * @param Name Aggregation method, which can be:
`sum`: Aggregate summation
`max`: Maximum value. In bandwidth mode, the peak bandwidth is calculated based on the data aggregated in 5 minutes.
`avg`: Average value
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Aggregated value 
     * @return Value Aggregated value
     */
    public Float getValue() {
        return this.Value;
    }

    /**
     * Set Aggregated value
     * @param Value Aggregated value
     */
    public void setValue(Float Value) {
        this.Value = Value;
    }

    public SummarizedData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SummarizedData(SummarizedData source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Value != null) {
            this.Value = new Float(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}


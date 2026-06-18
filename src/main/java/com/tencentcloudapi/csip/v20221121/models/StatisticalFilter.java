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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StatisticalFilter extends AbstractModel {

    /**
    * 0: Not based on statistical testing
1: Occurrence count higher than a fixed value
2: Occurrence count exceeds 100 percent of the period average
3: Occurrences higher than 50 percent of the user average
    */
    @SerializedName("OperatorType")
    @Expose
    private Long OperatorType;

    /**
    * Statistical value
    */
    @SerializedName("Value")
    @Expose
    private Float Value;

    /**
     * Get 0: Not based on statistical testing
1: Occurrence count higher than a fixed value
2: Occurrence count exceeds 100 percent of the period average
3: Occurrences higher than 50 percent of the user average 
     * @return OperatorType 0: Not based on statistical testing
1: Occurrence count higher than a fixed value
2: Occurrence count exceeds 100 percent of the period average
3: Occurrences higher than 50 percent of the user average
     */
    public Long getOperatorType() {
        return this.OperatorType;
    }

    /**
     * Set 0: Not based on statistical testing
1: Occurrence count higher than a fixed value
2: Occurrence count exceeds 100 percent of the period average
3: Occurrences higher than 50 percent of the user average
     * @param OperatorType 0: Not based on statistical testing
1: Occurrence count higher than a fixed value
2: Occurrence count exceeds 100 percent of the period average
3: Occurrences higher than 50 percent of the user average
     */
    public void setOperatorType(Long OperatorType) {
        this.OperatorType = OperatorType;
    }

    /**
     * Get Statistical value 
     * @return Value Statistical value
     */
    public Float getValue() {
        return this.Value;
    }

    /**
     * Set Statistical value
     * @param Value Statistical value
     */
    public void setValue(Float Value) {
        this.Value = Value;
    }

    public StatisticalFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StatisticalFilter(StatisticalFilter source) {
        if (source.OperatorType != null) {
            this.OperatorType = new Long(source.OperatorType);
        }
        if (source.Value != null) {
            this.Value = new Float(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OperatorType", this.OperatorType);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}


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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FunctionWeightedSelection extends AbstractModel {

    /**
    * Function ID.
    */
    @SerializedName("FunctionId")
    @Expose
    private String FunctionId;

    /**
    * Specifies the selected weight. value ranges from 0 to 100. the sum of all weights needs to be 100.
Specifies the calculation method for the select probability.
weight/100. for example, setting two functions A and B, among them A has A weight of 30, then B must be 70, finally the probability of selecting A is 30%, and the probability of selecting B is 70%.
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
     * Get Function ID. 
     * @return FunctionId Function ID.
     */
    public String getFunctionId() {
        return this.FunctionId;
    }

    /**
     * Set Function ID.
     * @param FunctionId Function ID.
     */
    public void setFunctionId(String FunctionId) {
        this.FunctionId = FunctionId;
    }

    /**
     * Get Specifies the selected weight. value ranges from 0 to 100. the sum of all weights needs to be 100.
Specifies the calculation method for the select probability.
weight/100. for example, setting two functions A and B, among them A has A weight of 30, then B must be 70, finally the probability of selecting A is 30%, and the probability of selecting B is 70%. 
     * @return Weight Specifies the selected weight. value ranges from 0 to 100. the sum of all weights needs to be 100.
Specifies the calculation method for the select probability.
weight/100. for example, setting two functions A and B, among them A has A weight of 30, then B must be 70, finally the probability of selecting A is 30%, and the probability of selecting B is 70%.
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set Specifies the selected weight. value ranges from 0 to 100. the sum of all weights needs to be 100.
Specifies the calculation method for the select probability.
weight/100. for example, setting two functions A and B, among them A has A weight of 30, then B must be 70, finally the probability of selecting A is 30%, and the probability of selecting B is 70%.
     * @param Weight Specifies the selected weight. value ranges from 0 to 100. the sum of all weights needs to be 100.
Specifies the calculation method for the select probability.
weight/100. for example, setting two functions A and B, among them A has A weight of 30, then B must be 70, finally the probability of selecting A is 30%, and the probability of selecting B is 70%.
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    public FunctionWeightedSelection() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FunctionWeightedSelection(FunctionWeightedSelection source) {
        if (source.FunctionId != null) {
            this.FunctionId = new String(source.FunctionId);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionId", this.FunctionId);
        this.setParamSimple(map, prefix + "Weight", this.Weight);

    }
}


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

public class ConfigGroupFunctionWeightedSelection extends AbstractModel {

    /**
    * <p>Specify the function executed. The value is the unique identifier of the function in the site. This parameter is valid only when TriggerType is direct.</p>
    */
    @SerializedName("Function")
    @Expose
    private String Function;

    /**
    * <p>Select the weight. The value ranges from 0 to 100, and the sum of all weights must be 100. The probability of being selected is calculated as: weight/100. For example, if two functions A and B are set, where the weight of A is 30, then the weight of B must be 70. Finally, the probability of selecting A is 30%, and the probability of selecting B is 70%.</p>
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
     * Get <p>Specify the function executed. The value is the unique identifier of the function in the site. This parameter is valid only when TriggerType is direct.</p> 
     * @return Function <p>Specify the function executed. The value is the unique identifier of the function in the site. This parameter is valid only when TriggerType is direct.</p>
     */
    public String getFunction() {
        return this.Function;
    }

    /**
     * Set <p>Specify the function executed. The value is the unique identifier of the function in the site. This parameter is valid only when TriggerType is direct.</p>
     * @param Function <p>Specify the function executed. The value is the unique identifier of the function in the site. This parameter is valid only when TriggerType is direct.</p>
     */
    public void setFunction(String Function) {
        this.Function = Function;
    }

    /**
     * Get <p>Select the weight. The value ranges from 0 to 100, and the sum of all weights must be 100. The probability of being selected is calculated as: weight/100. For example, if two functions A and B are set, where the weight of A is 30, then the weight of B must be 70. Finally, the probability of selecting A is 30%, and the probability of selecting B is 70%.</p> 
     * @return Weight <p>Select the weight. The value ranges from 0 to 100, and the sum of all weights must be 100. The probability of being selected is calculated as: weight/100. For example, if two functions A and B are set, where the weight of A is 30, then the weight of B must be 70. Finally, the probability of selecting A is 30%, and the probability of selecting B is 70%.</p>
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set <p>Select the weight. The value ranges from 0 to 100, and the sum of all weights must be 100. The probability of being selected is calculated as: weight/100. For example, if two functions A and B are set, where the weight of A is 30, then the weight of B must be 70. Finally, the probability of selecting A is 30%, and the probability of selecting B is 70%.</p>
     * @param Weight <p>Select the weight. The value ranges from 0 to 100, and the sum of all weights must be 100. The probability of being selected is calculated as: weight/100. For example, if two functions A and B are set, where the weight of A is 30, then the weight of B must be 70. Finally, the probability of selecting A is 30%, and the probability of selecting B is 70%.</p>
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    public ConfigGroupFunctionWeightedSelection() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfigGroupFunctionWeightedSelection(ConfigGroupFunctionWeightedSelection source) {
        if (source.Function != null) {
            this.Function = new String(source.Function);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Function", this.Function);
        this.setParamSimple(map, prefix + "Weight", this.Weight);

    }
}


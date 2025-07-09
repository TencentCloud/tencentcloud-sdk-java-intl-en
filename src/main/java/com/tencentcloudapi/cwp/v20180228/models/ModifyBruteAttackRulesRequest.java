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

public class ModifyBruteAttackRulesRequest extends AbstractModel {

    /**
    * Rule of determining brute force cracking
    */
    @SerializedName("Rules")
    @Expose
    private BruteAttackRule [] Rules;

    /**
     * Get Rule of determining brute force cracking 
     * @return Rules Rule of determining brute force cracking
     */
    public BruteAttackRule [] getRules() {
        return this.Rules;
    }

    /**
     * Set Rule of determining brute force cracking
     * @param Rules Rule of determining brute force cracking
     */
    public void setRules(BruteAttackRule [] Rules) {
        this.Rules = Rules;
    }

    public ModifyBruteAttackRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBruteAttackRulesRequest(ModifyBruteAttackRulesRequest source) {
        if (source.Rules != null) {
            this.Rules = new BruteAttackRule[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new BruteAttackRule(source.Rules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);

    }
}


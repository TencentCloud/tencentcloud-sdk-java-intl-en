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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MaxAge extends AbstractModel{

    /**
    * MaxAge rule.
    */
    @SerializedName("MaxAgeRules")
    @Expose
    private MaxAgeRule [] MaxAgeRules;

    /**
     * Get MaxAge rule. 
     * @return MaxAgeRules MaxAge rule.
     */
    public MaxAgeRule [] getMaxAgeRules() {
        return this.MaxAgeRules;
    }

    /**
     * Set MaxAge rule.
     * @param MaxAgeRules MaxAge rule.
     */
    public void setMaxAgeRules(MaxAgeRule [] MaxAgeRules) {
        this.MaxAgeRules = MaxAgeRules;
    }

    public MaxAge() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MaxAge(MaxAge source) {
        if (source.MaxAgeRules != null) {
            this.MaxAgeRules = new MaxAgeRule[source.MaxAgeRules.length];
            for (int i = 0; i < source.MaxAgeRules.length; i++) {
                this.MaxAgeRules[i] = new MaxAgeRule(source.MaxAgeRules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "MaxAgeRules.", this.MaxAgeRules);

    }
}


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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateL7AccRulesRequest extends AbstractModel {

    /**
    * Zone id.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * The rule content.
    */
    @SerializedName("Rules")
    @Expose
    private RuleEngineItem [] Rules;

    /**
     * Get Zone id. 
     * @return ZoneId Zone id.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone id.
     * @param ZoneId Zone id.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get The rule content. 
     * @return Rules The rule content.
     */
    public RuleEngineItem [] getRules() {
        return this.Rules;
    }

    /**
     * Set The rule content.
     * @param Rules The rule content.
     */
    public void setRules(RuleEngineItem [] Rules) {
        this.Rules = Rules;
    }

    public CreateL7AccRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateL7AccRulesRequest(CreateL7AccRulesRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Rules != null) {
            this.Rules = new RuleEngineItem[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new RuleEngineItem(source.Rules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);

    }
}


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

public class ExportFileTamperRulesRequest extends AbstractModel {

    /**
    * Filter criteria
<li>RuleCategory- string- rule category: 0 = system rule; 1 = user rule</li>
<li>Name - String - Rule name</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
     * Get Filter criteria
<li>RuleCategory- string- rule category: 0 = system rule; 1 = user rule</li>
<li>Name - String - Rule name</li> 
     * @return Filters Filter criteria
<li>RuleCategory- string- rule category: 0 = system rule; 1 = user rule</li>
<li>Name - String - Rule name</li>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria
<li>RuleCategory- string- rule category: 0 = system rule; 1 = user rule</li>
<li>Name - String - Rule name</li>
     * @param Filters Filter criteria
<li>RuleCategory- string- rule category: 0 = system rule; 1 = user rule</li>
<li>Name - String - Rule name</li>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    public ExportFileTamperRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportFileTamperRulesRequest(ExportFileTamperRulesRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}


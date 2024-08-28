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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeScanStateRequest extends AbstractModel {

    /**
    * Module type. Malware (Trojan), Vul (vulnerability), and Baseline are currently available.
    */
    @SerializedName("ModuleType")
    @Expose
    private String ModuleType;

    /**
    * Filter parameters
<li>StrategyId: Baseline policy ID, which is required only if ModuleType is set to Baseline</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
     * Get Module type. Malware (Trojan), Vul (vulnerability), and Baseline are currently available. 
     * @return ModuleType Module type. Malware (Trojan), Vul (vulnerability), and Baseline are currently available.
     */
    public String getModuleType() {
        return this.ModuleType;
    }

    /**
     * Set Module type. Malware (Trojan), Vul (vulnerability), and Baseline are currently available.
     * @param ModuleType Module type. Malware (Trojan), Vul (vulnerability), and Baseline are currently available.
     */
    public void setModuleType(String ModuleType) {
        this.ModuleType = ModuleType;
    }

    /**
     * Get Filter parameters
<li>StrategyId: Baseline policy ID, which is required only if ModuleType is set to Baseline</li> 
     * @return Filters Filter parameters
<li>StrategyId: Baseline policy ID, which is required only if ModuleType is set to Baseline</li>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter parameters
<li>StrategyId: Baseline policy ID, which is required only if ModuleType is set to Baseline</li>
     * @param Filters Filter parameters
<li>StrategyId: Baseline policy ID, which is required only if ModuleType is set to Baseline</li>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    public DescribeScanStateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeScanStateRequest(DescribeScanStateRequest source) {
        if (source.ModuleType != null) {
            this.ModuleType = new String(source.ModuleType);
        }
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
        this.setParamSimple(map, prefix + "ModuleType", this.ModuleType);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}


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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PluginUsageSummary extends AbstractModel {

    /**
    * <p>Number of calls (top-level count of API calls)</p>
    */
    @SerializedName("CallCount")
    @Expose
    private Float CallCount;

    /**
    * <p>Consumption measurement list for the PLUGIN domain (authoritative field): lists each measurement category by unit + label. When unit=TOKEN, label is case-sensitive for Token subcategories (input/output/avg_*). Being empty indicates total_tokens</p>
    */
    @SerializedName("ResourceConsumptionList")
    @Expose
    private ResourceConsumption [] ResourceConsumptionList;

    /**
     * Get <p>Number of calls (top-level count of API calls)</p> 
     * @return CallCount <p>Number of calls (top-level count of API calls)</p>
     */
    public Float getCallCount() {
        return this.CallCount;
    }

    /**
     * Set <p>Number of calls (top-level count of API calls)</p>
     * @param CallCount <p>Number of calls (top-level count of API calls)</p>
     */
    public void setCallCount(Float CallCount) {
        this.CallCount = CallCount;
    }

    /**
     * Get <p>Consumption measurement list for the PLUGIN domain (authoritative field): lists each measurement category by unit + label. When unit=TOKEN, label is case-sensitive for Token subcategories (input/output/avg_*). Being empty indicates total_tokens</p> 
     * @return ResourceConsumptionList <p>Consumption measurement list for the PLUGIN domain (authoritative field): lists each measurement category by unit + label. When unit=TOKEN, label is case-sensitive for Token subcategories (input/output/avg_*). Being empty indicates total_tokens</p>
     */
    public ResourceConsumption [] getResourceConsumptionList() {
        return this.ResourceConsumptionList;
    }

    /**
     * Set <p>Consumption measurement list for the PLUGIN domain (authoritative field): lists each measurement category by unit + label. When unit=TOKEN, label is case-sensitive for Token subcategories (input/output/avg_*). Being empty indicates total_tokens</p>
     * @param ResourceConsumptionList <p>Consumption measurement list for the PLUGIN domain (authoritative field): lists each measurement category by unit + label. When unit=TOKEN, label is case-sensitive for Token subcategories (input/output/avg_*). Being empty indicates total_tokens</p>
     */
    public void setResourceConsumptionList(ResourceConsumption [] ResourceConsumptionList) {
        this.ResourceConsumptionList = ResourceConsumptionList;
    }

    public PluginUsageSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PluginUsageSummary(PluginUsageSummary source) {
        if (source.CallCount != null) {
            this.CallCount = new Float(source.CallCount);
        }
        if (source.ResourceConsumptionList != null) {
            this.ResourceConsumptionList = new ResourceConsumption[source.ResourceConsumptionList.length];
            for (int i = 0; i < source.ResourceConsumptionList.length; i++) {
                this.ResourceConsumptionList[i] = new ResourceConsumption(source.ResourceConsumptionList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CallCount", this.CallCount);
        this.setParamArrayObj(map, prefix + "ResourceConsumptionList.", this.ResourceConsumptionList);

    }
}


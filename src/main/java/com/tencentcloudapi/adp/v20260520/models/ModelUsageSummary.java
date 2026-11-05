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

public class ModelUsageSummary extends AbstractModel {

    /**
    * <p>Number of calls (top-level count of API calls)</p>
    */
    @SerializedName("CallCount")
    @Expose
    private Float CallCount;

    /**
    * <p>Whether it is the default knowledge base</p>
    */
    @SerializedName("IsDefaultKB")
    @Expose
    private Boolean IsDefaultKB;

    /**
    * <p>Model name, flag indicating the AI model used</p>
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * <p>MODEL domain consumption measurement list (authoritative field): lists each measurement category by unit + label. When unit=TOKEN, label is case-sensitive for Token subcategories (input/output/avg_* /cache_*), with an empty label indicating total_tokens; unit=PAGE_COUNT refers to the model's consumed page count</p>
    */
    @SerializedName("ResourceConsumptionList")
    @Expose
    private ResourceConsumption [] ResourceConsumptionList;

    /**
    * <p>Total model PU consumption (sum of PU consumption within the aggregate dimension)</p>
    */
    @SerializedName("ConsumptionPU")
    @Expose
    private Float ConsumptionPU;

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
     * Get <p>Whether it is the default knowledge base</p> 
     * @return IsDefaultKB <p>Whether it is the default knowledge base</p>
     */
    public Boolean getIsDefaultKB() {
        return this.IsDefaultKB;
    }

    /**
     * Set <p>Whether it is the default knowledge base</p>
     * @param IsDefaultKB <p>Whether it is the default knowledge base</p>
     */
    public void setIsDefaultKB(Boolean IsDefaultKB) {
        this.IsDefaultKB = IsDefaultKB;
    }

    /**
     * Get <p>Model name, flag indicating the AI model used</p> 
     * @return ModelName <p>Model name, flag indicating the AI model used</p>
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set <p>Model name, flag indicating the AI model used</p>
     * @param ModelName <p>Model name, flag indicating the AI model used</p>
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get <p>MODEL domain consumption measurement list (authoritative field): lists each measurement category by unit + label. When unit=TOKEN, label is case-sensitive for Token subcategories (input/output/avg_* /cache_*), with an empty label indicating total_tokens; unit=PAGE_COUNT refers to the model's consumed page count</p> 
     * @return ResourceConsumptionList <p>MODEL domain consumption measurement list (authoritative field): lists each measurement category by unit + label. When unit=TOKEN, label is case-sensitive for Token subcategories (input/output/avg_* /cache_*), with an empty label indicating total_tokens; unit=PAGE_COUNT refers to the model's consumed page count</p>
     */
    public ResourceConsumption [] getResourceConsumptionList() {
        return this.ResourceConsumptionList;
    }

    /**
     * Set <p>MODEL domain consumption measurement list (authoritative field): lists each measurement category by unit + label. When unit=TOKEN, label is case-sensitive for Token subcategories (input/output/avg_* /cache_*), with an empty label indicating total_tokens; unit=PAGE_COUNT refers to the model's consumed page count</p>
     * @param ResourceConsumptionList <p>MODEL domain consumption measurement list (authoritative field): lists each measurement category by unit + label. When unit=TOKEN, label is case-sensitive for Token subcategories (input/output/avg_* /cache_*), with an empty label indicating total_tokens; unit=PAGE_COUNT refers to the model's consumed page count</p>
     */
    public void setResourceConsumptionList(ResourceConsumption [] ResourceConsumptionList) {
        this.ResourceConsumptionList = ResourceConsumptionList;
    }

    /**
     * Get <p>Total model PU consumption (sum of PU consumption within the aggregate dimension)</p> 
     * @return ConsumptionPU <p>Total model PU consumption (sum of PU consumption within the aggregate dimension)</p>
     */
    public Float getConsumptionPU() {
        return this.ConsumptionPU;
    }

    /**
     * Set <p>Total model PU consumption (sum of PU consumption within the aggregate dimension)</p>
     * @param ConsumptionPU <p>Total model PU consumption (sum of PU consumption within the aggregate dimension)</p>
     */
    public void setConsumptionPU(Float ConsumptionPU) {
        this.ConsumptionPU = ConsumptionPU;
    }

    public ModelUsageSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelUsageSummary(ModelUsageSummary source) {
        if (source.CallCount != null) {
            this.CallCount = new Float(source.CallCount);
        }
        if (source.IsDefaultKB != null) {
            this.IsDefaultKB = new Boolean(source.IsDefaultKB);
        }
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.ResourceConsumptionList != null) {
            this.ResourceConsumptionList = new ResourceConsumption[source.ResourceConsumptionList.length];
            for (int i = 0; i < source.ResourceConsumptionList.length; i++) {
                this.ResourceConsumptionList[i] = new ResourceConsumption(source.ResourceConsumptionList[i]);
            }
        }
        if (source.ConsumptionPU != null) {
            this.ConsumptionPU = new Float(source.ConsumptionPU);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CallCount", this.CallCount);
        this.setParamSimple(map, prefix + "IsDefaultKB", this.IsDefaultKB);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamArrayObj(map, prefix + "ResourceConsumptionList.", this.ResourceConsumptionList);
        this.setParamSimple(map, prefix + "ConsumptionPU", this.ConsumptionPU);

    }
}


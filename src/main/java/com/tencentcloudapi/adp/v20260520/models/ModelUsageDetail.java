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

public class ModelUsageDetail extends AbstractModel {

    /**
    * <p>Invocation type, originating from billing scene_billing (corresponding to filter.call_type)</p>
    */
    @SerializedName("CallType")
    @Expose
    private String CallType;

    /**
    * <p>Whether it is the default knowledge base. It is only meaningful for the business where ResourceType=5 (knowledge base capacity)</p>
    */
    @SerializedName("IsDefaultKB")
    @Expose
    private Boolean IsDefaultKB;

    /**
    * <p>Model name</p>
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * <p>List of consumption measurements for a single call in the MODEL field (authoritative field): lists each measurement type by unit + label. When unit=TOKEN, label is case-sensitive for Token subcategories (input/output/avg_* /cache_*), and being empty indicates total_tokens; unit=PAGE_COUNT refers to the number of pages consumed by the model</p>
    */
    @SerializedName("ResourceConsumptionList")
    @Expose
    private ResourceConsumption [] ResourceConsumptionList;

    /**
    * <p>PU consumption of this call</p>
    */
    @SerializedName("ConsumptionPU")
    @Expose
    private Float ConsumptionPU;

    /**
     * Get <p>Invocation type, originating from billing scene_billing (corresponding to filter.call_type)</p> 
     * @return CallType <p>Invocation type, originating from billing scene_billing (corresponding to filter.call_type)</p>
     */
    public String getCallType() {
        return this.CallType;
    }

    /**
     * Set <p>Invocation type, originating from billing scene_billing (corresponding to filter.call_type)</p>
     * @param CallType <p>Invocation type, originating from billing scene_billing (corresponding to filter.call_type)</p>
     */
    public void setCallType(String CallType) {
        this.CallType = CallType;
    }

    /**
     * Get <p>Whether it is the default knowledge base. It is only meaningful for the business where ResourceType=5 (knowledge base capacity)</p> 
     * @return IsDefaultKB <p>Whether it is the default knowledge base. It is only meaningful for the business where ResourceType=5 (knowledge base capacity)</p>
     */
    public Boolean getIsDefaultKB() {
        return this.IsDefaultKB;
    }

    /**
     * Set <p>Whether it is the default knowledge base. It is only meaningful for the business where ResourceType=5 (knowledge base capacity)</p>
     * @param IsDefaultKB <p>Whether it is the default knowledge base. It is only meaningful for the business where ResourceType=5 (knowledge base capacity)</p>
     */
    public void setIsDefaultKB(Boolean IsDefaultKB) {
        this.IsDefaultKB = IsDefaultKB;
    }

    /**
     * Get <p>Model name</p> 
     * @return ModelName <p>Model name</p>
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set <p>Model name</p>
     * @param ModelName <p>Model name</p>
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get <p>List of consumption measurements for a single call in the MODEL field (authoritative field): lists each measurement type by unit + label. When unit=TOKEN, label is case-sensitive for Token subcategories (input/output/avg_* /cache_*), and being empty indicates total_tokens; unit=PAGE_COUNT refers to the number of pages consumed by the model</p> 
     * @return ResourceConsumptionList <p>List of consumption measurements for a single call in the MODEL field (authoritative field): lists each measurement type by unit + label. When unit=TOKEN, label is case-sensitive for Token subcategories (input/output/avg_* /cache_*), and being empty indicates total_tokens; unit=PAGE_COUNT refers to the number of pages consumed by the model</p>
     */
    public ResourceConsumption [] getResourceConsumptionList() {
        return this.ResourceConsumptionList;
    }

    /**
     * Set <p>List of consumption measurements for a single call in the MODEL field (authoritative field): lists each measurement type by unit + label. When unit=TOKEN, label is case-sensitive for Token subcategories (input/output/avg_* /cache_*), and being empty indicates total_tokens; unit=PAGE_COUNT refers to the number of pages consumed by the model</p>
     * @param ResourceConsumptionList <p>List of consumption measurements for a single call in the MODEL field (authoritative field): lists each measurement type by unit + label. When unit=TOKEN, label is case-sensitive for Token subcategories (input/output/avg_* /cache_*), and being empty indicates total_tokens; unit=PAGE_COUNT refers to the number of pages consumed by the model</p>
     */
    public void setResourceConsumptionList(ResourceConsumption [] ResourceConsumptionList) {
        this.ResourceConsumptionList = ResourceConsumptionList;
    }

    /**
     * Get <p>PU consumption of this call</p> 
     * @return ConsumptionPU <p>PU consumption of this call</p>
     */
    public Float getConsumptionPU() {
        return this.ConsumptionPU;
    }

    /**
     * Set <p>PU consumption of this call</p>
     * @param ConsumptionPU <p>PU consumption of this call</p>
     */
    public void setConsumptionPU(Float ConsumptionPU) {
        this.ConsumptionPU = ConsumptionPU;
    }

    public ModelUsageDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelUsageDetail(ModelUsageDetail source) {
        if (source.CallType != null) {
            this.CallType = new String(source.CallType);
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
        this.setParamSimple(map, prefix + "CallType", this.CallType);
        this.setParamSimple(map, prefix + "IsDefaultKB", this.IsDefaultKB);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamArrayObj(map, prefix + "ResourceConsumptionList.", this.ResourceConsumptionList);
        this.setParamSimple(map, prefix + "ConsumptionPU", this.ConsumptionPU);

    }
}


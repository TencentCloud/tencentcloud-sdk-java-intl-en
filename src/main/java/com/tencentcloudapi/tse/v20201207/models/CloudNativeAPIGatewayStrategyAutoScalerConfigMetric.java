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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudNativeAPIGatewayStrategyAutoScalerConfigMetric extends AbstractModel {

    /**
    * Metric Type
- Resource
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Metric resource name
- cpu
- memory
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * Metric target type, currently only support percentage Utilization
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * Target value of the metric
    */
    @SerializedName("TargetValue")
    @Expose
    private Long TargetValue;

    /**
     * Get Metric Type
- Resource 
     * @return Type Metric Type
- Resource
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Metric Type
- Resource
     * @param Type Metric Type
- Resource
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Metric resource name
- cpu
- memory 
     * @return ResourceName Metric resource name
- cpu
- memory
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set Metric resource name
- cpu
- memory
     * @param ResourceName Metric resource name
- cpu
- memory
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get Metric target type, currently only support percentage Utilization 
     * @return TargetType Metric target type, currently only support percentage Utilization
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set Metric target type, currently only support percentage Utilization
     * @param TargetType Metric target type, currently only support percentage Utilization
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get Target value of the metric 
     * @return TargetValue Target value of the metric
     */
    public Long getTargetValue() {
        return this.TargetValue;
    }

    /**
     * Set Target value of the metric
     * @param TargetValue Target value of the metric
     */
    public void setTargetValue(Long TargetValue) {
        this.TargetValue = TargetValue;
    }

    public CloudNativeAPIGatewayStrategyAutoScalerConfigMetric() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudNativeAPIGatewayStrategyAutoScalerConfigMetric(CloudNativeAPIGatewayStrategyAutoScalerConfigMetric source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.TargetType != null) {
            this.TargetType = new String(source.TargetType);
        }
        if (source.TargetValue != null) {
            this.TargetValue = new Long(source.TargetValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamSimple(map, prefix + "TargetValue", this.TargetValue);

    }
}


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

public class InferenceResourceConfigForModify extends AbstractModel {

    /**
    * Scaling way. Valid values: <li>Auto: Automatically adjust instance count based on request volume;</li><li>Manual: Fixed number of resource instances via manual setting.</li>
    */
    @SerializedName("ScalingMode")
    @Expose
    private String ScalingMode;

    /**
    * Inference service auto scaling configuration. Required when ScalingMode is Auto.
    */
    @SerializedName("AutoScalingConfig")
    @Expose
    private InferenceAutoScalingConfig AutoScalingConfig;

    /**
    * Manual setting of inference service instance configuration. Required when ScalingMode is Manual.
    */
    @SerializedName("ManualInstanceConfig")
    @Expose
    private InferenceManualInstanceConfig ManualInstanceConfig;

    /**
    * Concurrency of a single instance. Default value is 1.
    */
    @SerializedName("Concurrency")
    @Expose
    private Long Concurrency;

    /**
     * Get Scaling way. Valid values: <li>Auto: Automatically adjust instance count based on request volume;</li><li>Manual: Fixed number of resource instances via manual setting.</li> 
     * @return ScalingMode Scaling way. Valid values: <li>Auto: Automatically adjust instance count based on request volume;</li><li>Manual: Fixed number of resource instances via manual setting.</li>
     */
    public String getScalingMode() {
        return this.ScalingMode;
    }

    /**
     * Set Scaling way. Valid values: <li>Auto: Automatically adjust instance count based on request volume;</li><li>Manual: Fixed number of resource instances via manual setting.</li>
     * @param ScalingMode Scaling way. Valid values: <li>Auto: Automatically adjust instance count based on request volume;</li><li>Manual: Fixed number of resource instances via manual setting.</li>
     */
    public void setScalingMode(String ScalingMode) {
        this.ScalingMode = ScalingMode;
    }

    /**
     * Get Inference service auto scaling configuration. Required when ScalingMode is Auto. 
     * @return AutoScalingConfig Inference service auto scaling configuration. Required when ScalingMode is Auto.
     */
    public InferenceAutoScalingConfig getAutoScalingConfig() {
        return this.AutoScalingConfig;
    }

    /**
     * Set Inference service auto scaling configuration. Required when ScalingMode is Auto.
     * @param AutoScalingConfig Inference service auto scaling configuration. Required when ScalingMode is Auto.
     */
    public void setAutoScalingConfig(InferenceAutoScalingConfig AutoScalingConfig) {
        this.AutoScalingConfig = AutoScalingConfig;
    }

    /**
     * Get Manual setting of inference service instance configuration. Required when ScalingMode is Manual. 
     * @return ManualInstanceConfig Manual setting of inference service instance configuration. Required when ScalingMode is Manual.
     */
    public InferenceManualInstanceConfig getManualInstanceConfig() {
        return this.ManualInstanceConfig;
    }

    /**
     * Set Manual setting of inference service instance configuration. Required when ScalingMode is Manual.
     * @param ManualInstanceConfig Manual setting of inference service instance configuration. Required when ScalingMode is Manual.
     */
    public void setManualInstanceConfig(InferenceManualInstanceConfig ManualInstanceConfig) {
        this.ManualInstanceConfig = ManualInstanceConfig;
    }

    /**
     * Get Concurrency of a single instance. Default value is 1. 
     * @return Concurrency Concurrency of a single instance. Default value is 1.
     */
    public Long getConcurrency() {
        return this.Concurrency;
    }

    /**
     * Set Concurrency of a single instance. Default value is 1.
     * @param Concurrency Concurrency of a single instance. Default value is 1.
     */
    public void setConcurrency(Long Concurrency) {
        this.Concurrency = Concurrency;
    }

    public InferenceResourceConfigForModify() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InferenceResourceConfigForModify(InferenceResourceConfigForModify source) {
        if (source.ScalingMode != null) {
            this.ScalingMode = new String(source.ScalingMode);
        }
        if (source.AutoScalingConfig != null) {
            this.AutoScalingConfig = new InferenceAutoScalingConfig(source.AutoScalingConfig);
        }
        if (source.ManualInstanceConfig != null) {
            this.ManualInstanceConfig = new InferenceManualInstanceConfig(source.ManualInstanceConfig);
        }
        if (source.Concurrency != null) {
            this.Concurrency = new Long(source.Concurrency);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScalingMode", this.ScalingMode);
        this.setParamObj(map, prefix + "AutoScalingConfig.", this.AutoScalingConfig);
        this.setParamObj(map, prefix + "ManualInstanceConfig.", this.ManualInstanceConfig);
        this.setParamSimple(map, prefix + "Concurrency", this.Concurrency);

    }
}


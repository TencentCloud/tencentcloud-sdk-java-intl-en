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
    * <p>Scaling method. Valid values: <li>Auto: automatically adjust the number of instances based on request volume;</li><li>Manual: manually set a fixed number of instances.</li></p>
    */
    @SerializedName("ScalingMode")
    @Expose
    private String ScalingMode;

    /**
    * <p>Automatic scaling configuration for the inference service. Required when ScalingMode is Auto.</p>
    */
    @SerializedName("AutoScalingConfig")
    @Expose
    private InferenceAutoScalingConfig AutoScalingConfig;

    /**
    * <p>Inference service manual setting instance configuration. Required when ScalingMode is Manual.</p>
    */
    @SerializedName("ManualInstanceConfig")
    @Expose
    private InferenceManualInstanceConfig ManualInstanceConfig;

    /**
    * <p>Concurrency of a single instance. Default value: 1.</p>
    */
    @SerializedName("Concurrency")
    @Expose
    private Long Concurrency;

    /**
    * <p>Hardware resource configuration of the inference service.</p>
    */
    @SerializedName("HardwareConfig")
    @Expose
    private InferenceHardwareConfigForModify HardwareConfig;

    /**
     * Get <p>Scaling method. Valid values: <li>Auto: automatically adjust the number of instances based on request volume;</li><li>Manual: manually set a fixed number of instances.</li></p> 
     * @return ScalingMode <p>Scaling method. Valid values: <li>Auto: automatically adjust the number of instances based on request volume;</li><li>Manual: manually set a fixed number of instances.</li></p>
     */
    public String getScalingMode() {
        return this.ScalingMode;
    }

    /**
     * Set <p>Scaling method. Valid values: <li>Auto: automatically adjust the number of instances based on request volume;</li><li>Manual: manually set a fixed number of instances.</li></p>
     * @param ScalingMode <p>Scaling method. Valid values: <li>Auto: automatically adjust the number of instances based on request volume;</li><li>Manual: manually set a fixed number of instances.</li></p>
     */
    public void setScalingMode(String ScalingMode) {
        this.ScalingMode = ScalingMode;
    }

    /**
     * Get <p>Automatic scaling configuration for the inference service. Required when ScalingMode is Auto.</p> 
     * @return AutoScalingConfig <p>Automatic scaling configuration for the inference service. Required when ScalingMode is Auto.</p>
     */
    public InferenceAutoScalingConfig getAutoScalingConfig() {
        return this.AutoScalingConfig;
    }

    /**
     * Set <p>Automatic scaling configuration for the inference service. Required when ScalingMode is Auto.</p>
     * @param AutoScalingConfig <p>Automatic scaling configuration for the inference service. Required when ScalingMode is Auto.</p>
     */
    public void setAutoScalingConfig(InferenceAutoScalingConfig AutoScalingConfig) {
        this.AutoScalingConfig = AutoScalingConfig;
    }

    /**
     * Get <p>Inference service manual setting instance configuration. Required when ScalingMode is Manual.</p> 
     * @return ManualInstanceConfig <p>Inference service manual setting instance configuration. Required when ScalingMode is Manual.</p>
     */
    public InferenceManualInstanceConfig getManualInstanceConfig() {
        return this.ManualInstanceConfig;
    }

    /**
     * Set <p>Inference service manual setting instance configuration. Required when ScalingMode is Manual.</p>
     * @param ManualInstanceConfig <p>Inference service manual setting instance configuration. Required when ScalingMode is Manual.</p>
     */
    public void setManualInstanceConfig(InferenceManualInstanceConfig ManualInstanceConfig) {
        this.ManualInstanceConfig = ManualInstanceConfig;
    }

    /**
     * Get <p>Concurrency of a single instance. Default value: 1.</p> 
     * @return Concurrency <p>Concurrency of a single instance. Default value: 1.</p>
     */
    public Long getConcurrency() {
        return this.Concurrency;
    }

    /**
     * Set <p>Concurrency of a single instance. Default value: 1.</p>
     * @param Concurrency <p>Concurrency of a single instance. Default value: 1.</p>
     */
    public void setConcurrency(Long Concurrency) {
        this.Concurrency = Concurrency;
    }

    /**
     * Get <p>Hardware resource configuration of the inference service.</p> 
     * @return HardwareConfig <p>Hardware resource configuration of the inference service.</p>
     */
    public InferenceHardwareConfigForModify getHardwareConfig() {
        return this.HardwareConfig;
    }

    /**
     * Set <p>Hardware resource configuration of the inference service.</p>
     * @param HardwareConfig <p>Hardware resource configuration of the inference service.</p>
     */
    public void setHardwareConfig(InferenceHardwareConfigForModify HardwareConfig) {
        this.HardwareConfig = HardwareConfig;
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
        if (source.HardwareConfig != null) {
            this.HardwareConfig = new InferenceHardwareConfigForModify(source.HardwareConfig);
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
        this.setParamObj(map, prefix + "HardwareConfig.", this.HardwareConfig);

    }
}


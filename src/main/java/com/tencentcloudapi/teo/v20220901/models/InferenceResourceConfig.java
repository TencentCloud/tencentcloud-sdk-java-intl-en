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

public class InferenceResourceConfig extends AbstractModel {

    /**
    * Scaling way. Valid values: <li>Auto: Automatically adjust instance count according to request volume;</li><li>Manual: Manual setting of fixed number of resource instances.</li>
    */
    @SerializedName("ScalingMode")
    @Expose
    private String ScalingMode;

    /**
    * Hardware specifications.
    */
    @SerializedName("HardwareSpec")
    @Expose
    private String HardwareSpec;

    /**
    * Inference service automatic scaling configuration. Required when ScalingMode is Auto.
Note: This field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("AutoScalingConfig")
    @Expose
    private InferenceAutoScalingConfig AutoScalingConfig;

    /**
    * Manual setting of inference service instance configuration. Required when ScalingMode is Manual.
Note: This field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("ManualInstanceConfig")
    @Expose
    private InferenceManualInstanceConfig ManualInstanceConfig;

    /**
    * Single-instance concurrency. Default value is 1.
    */
    @SerializedName("Concurrency")
    @Expose
    private Long Concurrency;

    /**
     * Get Scaling way. Valid values: <li>Auto: Automatically adjust instance count according to request volume;</li><li>Manual: Manual setting of fixed number of resource instances.</li> 
     * @return ScalingMode Scaling way. Valid values: <li>Auto: Automatically adjust instance count according to request volume;</li><li>Manual: Manual setting of fixed number of resource instances.</li>
     */
    public String getScalingMode() {
        return this.ScalingMode;
    }

    /**
     * Set Scaling way. Valid values: <li>Auto: Automatically adjust instance count according to request volume;</li><li>Manual: Manual setting of fixed number of resource instances.</li>
     * @param ScalingMode Scaling way. Valid values: <li>Auto: Automatically adjust instance count according to request volume;</li><li>Manual: Manual setting of fixed number of resource instances.</li>
     */
    public void setScalingMode(String ScalingMode) {
        this.ScalingMode = ScalingMode;
    }

    /**
     * Get Hardware specifications. 
     * @return HardwareSpec Hardware specifications.
     */
    public String getHardwareSpec() {
        return this.HardwareSpec;
    }

    /**
     * Set Hardware specifications.
     * @param HardwareSpec Hardware specifications.
     */
    public void setHardwareSpec(String HardwareSpec) {
        this.HardwareSpec = HardwareSpec;
    }

    /**
     * Get Inference service automatic scaling configuration. Required when ScalingMode is Auto.
Note: This field may return null, which indicates a failure to obtain a valid value. 
     * @return AutoScalingConfig Inference service automatic scaling configuration. Required when ScalingMode is Auto.
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public InferenceAutoScalingConfig getAutoScalingConfig() {
        return this.AutoScalingConfig;
    }

    /**
     * Set Inference service automatic scaling configuration. Required when ScalingMode is Auto.
Note: This field may return null, which indicates a failure to obtain a valid value.
     * @param AutoScalingConfig Inference service automatic scaling configuration. Required when ScalingMode is Auto.
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public void setAutoScalingConfig(InferenceAutoScalingConfig AutoScalingConfig) {
        this.AutoScalingConfig = AutoScalingConfig;
    }

    /**
     * Get Manual setting of inference service instance configuration. Required when ScalingMode is Manual.
Note: This field may return null, which indicates a failure to obtain a valid value. 
     * @return ManualInstanceConfig Manual setting of inference service instance configuration. Required when ScalingMode is Manual.
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public InferenceManualInstanceConfig getManualInstanceConfig() {
        return this.ManualInstanceConfig;
    }

    /**
     * Set Manual setting of inference service instance configuration. Required when ScalingMode is Manual.
Note: This field may return null, which indicates a failure to obtain a valid value.
     * @param ManualInstanceConfig Manual setting of inference service instance configuration. Required when ScalingMode is Manual.
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public void setManualInstanceConfig(InferenceManualInstanceConfig ManualInstanceConfig) {
        this.ManualInstanceConfig = ManualInstanceConfig;
    }

    /**
     * Get Single-instance concurrency. Default value is 1. 
     * @return Concurrency Single-instance concurrency. Default value is 1.
     */
    public Long getConcurrency() {
        return this.Concurrency;
    }

    /**
     * Set Single-instance concurrency. Default value is 1.
     * @param Concurrency Single-instance concurrency. Default value is 1.
     */
    public void setConcurrency(Long Concurrency) {
        this.Concurrency = Concurrency;
    }

    public InferenceResourceConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InferenceResourceConfig(InferenceResourceConfig source) {
        if (source.ScalingMode != null) {
            this.ScalingMode = new String(source.ScalingMode);
        }
        if (source.HardwareSpec != null) {
            this.HardwareSpec = new String(source.HardwareSpec);
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
        this.setParamSimple(map, prefix + "HardwareSpec", this.HardwareSpec);
        this.setParamObj(map, prefix + "AutoScalingConfig.", this.AutoScalingConfig);
        this.setParamObj(map, prefix + "ManualInstanceConfig.", this.ManualInstanceConfig);
        this.setParamSimple(map, prefix + "Concurrency", this.Concurrency);

    }
}


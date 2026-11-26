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
    * <p>Scaling method. Valid values: <li>Auto: automatically adjust instance count according to request volume;</li><li>Manual: manually set a fixed number of instances.</li></p>
    */
    @SerializedName("ScalingMode")
    @Expose
    private String ScalingMode;

    /**
    * <p>Hardware specification flag. Abandoned. For reference, use <code>HardwareSpecId</code>.</p>
    */
    @SerializedName("HardwareSpec")
    @Expose
    private String HardwareSpec;

    /**
    * <p>Unique identification ID of the hardware specification. You can obtain the supported hardware specifications of the current site through the <code>DescribeInferenceHardwareSpecifications</code> API.</p><p>By default, the system configures the required resources for the inference service according to the hardware specification corresponding to the selected <code>HardwareSpecId</code>. If adjustments are needed, you can customize the hardware resource configuration through <code>HardwareConfig</code>.</p>
    */
    @SerializedName("HardwareSpecId")
    @Expose
    private String HardwareSpecId;

    /**
    * <p>Hardware configuration for the inference service.</p><p>As an input parameter, if unpadded, hardware resources are configured according to the default value of the selected <code>HardwareSpecId</code> specification; if padded, priority is given to the fill value for configuration.</p>
    */
    @SerializedName("HardwareConfig")
    @Expose
    private InferenceHardwareConfig HardwareConfig;

    /**
    * <p>Automatic scaling configuration of the inference service. Required when ScalingMode is Auto.</p>
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
     * Get <p>Scaling method. Valid values: <li>Auto: automatically adjust instance count according to request volume;</li><li>Manual: manually set a fixed number of instances.</li></p> 
     * @return ScalingMode <p>Scaling method. Valid values: <li>Auto: automatically adjust instance count according to request volume;</li><li>Manual: manually set a fixed number of instances.</li></p>
     */
    public String getScalingMode() {
        return this.ScalingMode;
    }

    /**
     * Set <p>Scaling method. Valid values: <li>Auto: automatically adjust instance count according to request volume;</li><li>Manual: manually set a fixed number of instances.</li></p>
     * @param ScalingMode <p>Scaling method. Valid values: <li>Auto: automatically adjust instance count according to request volume;</li><li>Manual: manually set a fixed number of instances.</li></p>
     */
    public void setScalingMode(String ScalingMode) {
        this.ScalingMode = ScalingMode;
    }

    /**
     * Get <p>Hardware specification flag. Abandoned. For reference, use <code>HardwareSpecId</code>.</p> 
     * @return HardwareSpec <p>Hardware specification flag. Abandoned. For reference, use <code>HardwareSpecId</code>.</p>
     * @deprecated
     */
    @Deprecated
    public String getHardwareSpec() {
        return this.HardwareSpec;
    }

    /**
     * Set <p>Hardware specification flag. Abandoned. For reference, use <code>HardwareSpecId</code>.</p>
     * @param HardwareSpec <p>Hardware specification flag. Abandoned. For reference, use <code>HardwareSpecId</code>.</p>
     * @deprecated
     */
    @Deprecated
    public void setHardwareSpec(String HardwareSpec) {
        this.HardwareSpec = HardwareSpec;
    }

    /**
     * Get <p>Unique identification ID of the hardware specification. You can obtain the supported hardware specifications of the current site through the <code>DescribeInferenceHardwareSpecifications</code> API.</p><p>By default, the system configures the required resources for the inference service according to the hardware specification corresponding to the selected <code>HardwareSpecId</code>. If adjustments are needed, you can customize the hardware resource configuration through <code>HardwareConfig</code>.</p> 
     * @return HardwareSpecId <p>Unique identification ID of the hardware specification. You can obtain the supported hardware specifications of the current site through the <code>DescribeInferenceHardwareSpecifications</code> API.</p><p>By default, the system configures the required resources for the inference service according to the hardware specification corresponding to the selected <code>HardwareSpecId</code>. If adjustments are needed, you can customize the hardware resource configuration through <code>HardwareConfig</code>.</p>
     */
    public String getHardwareSpecId() {
        return this.HardwareSpecId;
    }

    /**
     * Set <p>Unique identification ID of the hardware specification. You can obtain the supported hardware specifications of the current site through the <code>DescribeInferenceHardwareSpecifications</code> API.</p><p>By default, the system configures the required resources for the inference service according to the hardware specification corresponding to the selected <code>HardwareSpecId</code>. If adjustments are needed, you can customize the hardware resource configuration through <code>HardwareConfig</code>.</p>
     * @param HardwareSpecId <p>Unique identification ID of the hardware specification. You can obtain the supported hardware specifications of the current site through the <code>DescribeInferenceHardwareSpecifications</code> API.</p><p>By default, the system configures the required resources for the inference service according to the hardware specification corresponding to the selected <code>HardwareSpecId</code>. If adjustments are needed, you can customize the hardware resource configuration through <code>HardwareConfig</code>.</p>
     */
    public void setHardwareSpecId(String HardwareSpecId) {
        this.HardwareSpecId = HardwareSpecId;
    }

    /**
     * Get <p>Hardware configuration for the inference service.</p><p>As an input parameter, if unpadded, hardware resources are configured according to the default value of the selected <code>HardwareSpecId</code> specification; if padded, priority is given to the fill value for configuration.</p> 
     * @return HardwareConfig <p>Hardware configuration for the inference service.</p><p>As an input parameter, if unpadded, hardware resources are configured according to the default value of the selected <code>HardwareSpecId</code> specification; if padded, priority is given to the fill value for configuration.</p>
     */
    public InferenceHardwareConfig getHardwareConfig() {
        return this.HardwareConfig;
    }

    /**
     * Set <p>Hardware configuration for the inference service.</p><p>As an input parameter, if unpadded, hardware resources are configured according to the default value of the selected <code>HardwareSpecId</code> specification; if padded, priority is given to the fill value for configuration.</p>
     * @param HardwareConfig <p>Hardware configuration for the inference service.</p><p>As an input parameter, if unpadded, hardware resources are configured according to the default value of the selected <code>HardwareSpecId</code> specification; if padded, priority is given to the fill value for configuration.</p>
     */
    public void setHardwareConfig(InferenceHardwareConfig HardwareConfig) {
        this.HardwareConfig = HardwareConfig;
    }

    /**
     * Get <p>Automatic scaling configuration of the inference service. Required when ScalingMode is Auto.</p> 
     * @return AutoScalingConfig <p>Automatic scaling configuration of the inference service. Required when ScalingMode is Auto.</p>
     */
    public InferenceAutoScalingConfig getAutoScalingConfig() {
        return this.AutoScalingConfig;
    }

    /**
     * Set <p>Automatic scaling configuration of the inference service. Required when ScalingMode is Auto.</p>
     * @param AutoScalingConfig <p>Automatic scaling configuration of the inference service. Required when ScalingMode is Auto.</p>
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
        if (source.HardwareSpecId != null) {
            this.HardwareSpecId = new String(source.HardwareSpecId);
        }
        if (source.HardwareConfig != null) {
            this.HardwareConfig = new InferenceHardwareConfig(source.HardwareConfig);
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
        this.setParamSimple(map, prefix + "HardwareSpecId", this.HardwareSpecId);
        this.setParamObj(map, prefix + "HardwareConfig.", this.HardwareConfig);
        this.setParamObj(map, prefix + "AutoScalingConfig.", this.AutoScalingConfig);
        this.setParamObj(map, prefix + "ManualInstanceConfig.", this.ManualInstanceConfig);
        this.setParamSimple(map, prefix + "Concurrency", this.Concurrency);

    }
}


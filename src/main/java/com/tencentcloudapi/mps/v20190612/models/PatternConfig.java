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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PatternConfig extends AbstractModel {

    /**
    * <p>Transparency threshold</p><p>Value ranges from 0 to 255.</p><p>Default value: 30</p>
    */
    @SerializedName("TransparencyThreshold")
    @Expose
    private Long TransparencyThreshold;

    /**
    * <p>Opaque threshold must be greater than TransparencyThreshold.</p><p>Value ranges from 0 to 255.</p><p>Default value: 127.</p>
    */
    @SerializedName("OpaqueThreshold")
    @Expose
    private Long OpaqueThreshold;

    /**
    * <p>Edge sampling steps, default 5.</p><p>Value ranges from 1 to 10.</p>
    */
    @SerializedName("EdgeSamplingStep")
    @Expose
    private Long EdgeSamplingStep;

    /**
    * <p>Edge expansion steps. Default: 5</p>
    */
    @SerializedName("EdgeExpansionStep")
    @Expose
    private Long EdgeExpansionStep;

    /**
    * <p>Edge fusion strength, default 0.5</p><p>Value ranges from 0 to 1.0</p>
    */
    @SerializedName("EdgeBlendingIntensity")
    @Expose
    private Float EdgeBlendingIntensity;

    /**
     * Get <p>Transparency threshold</p><p>Value ranges from 0 to 255.</p><p>Default value: 30</p> 
     * @return TransparencyThreshold <p>Transparency threshold</p><p>Value ranges from 0 to 255.</p><p>Default value: 30</p>
     */
    public Long getTransparencyThreshold() {
        return this.TransparencyThreshold;
    }

    /**
     * Set <p>Transparency threshold</p><p>Value ranges from 0 to 255.</p><p>Default value: 30</p>
     * @param TransparencyThreshold <p>Transparency threshold</p><p>Value ranges from 0 to 255.</p><p>Default value: 30</p>
     */
    public void setTransparencyThreshold(Long TransparencyThreshold) {
        this.TransparencyThreshold = TransparencyThreshold;
    }

    /**
     * Get <p>Opaque threshold must be greater than TransparencyThreshold.</p><p>Value ranges from 0 to 255.</p><p>Default value: 127.</p> 
     * @return OpaqueThreshold <p>Opaque threshold must be greater than TransparencyThreshold.</p><p>Value ranges from 0 to 255.</p><p>Default value: 127.</p>
     */
    public Long getOpaqueThreshold() {
        return this.OpaqueThreshold;
    }

    /**
     * Set <p>Opaque threshold must be greater than TransparencyThreshold.</p><p>Value ranges from 0 to 255.</p><p>Default value: 127.</p>
     * @param OpaqueThreshold <p>Opaque threshold must be greater than TransparencyThreshold.</p><p>Value ranges from 0 to 255.</p><p>Default value: 127.</p>
     */
    public void setOpaqueThreshold(Long OpaqueThreshold) {
        this.OpaqueThreshold = OpaqueThreshold;
    }

    /**
     * Get <p>Edge sampling steps, default 5.</p><p>Value ranges from 1 to 10.</p> 
     * @return EdgeSamplingStep <p>Edge sampling steps, default 5.</p><p>Value ranges from 1 to 10.</p>
     */
    public Long getEdgeSamplingStep() {
        return this.EdgeSamplingStep;
    }

    /**
     * Set <p>Edge sampling steps, default 5.</p><p>Value ranges from 1 to 10.</p>
     * @param EdgeSamplingStep <p>Edge sampling steps, default 5.</p><p>Value ranges from 1 to 10.</p>
     */
    public void setEdgeSamplingStep(Long EdgeSamplingStep) {
        this.EdgeSamplingStep = EdgeSamplingStep;
    }

    /**
     * Get <p>Edge expansion steps. Default: 5</p> 
     * @return EdgeExpansionStep <p>Edge expansion steps. Default: 5</p>
     */
    public Long getEdgeExpansionStep() {
        return this.EdgeExpansionStep;
    }

    /**
     * Set <p>Edge expansion steps. Default: 5</p>
     * @param EdgeExpansionStep <p>Edge expansion steps. Default: 5</p>
     */
    public void setEdgeExpansionStep(Long EdgeExpansionStep) {
        this.EdgeExpansionStep = EdgeExpansionStep;
    }

    /**
     * Get <p>Edge fusion strength, default 0.5</p><p>Value ranges from 0 to 1.0</p> 
     * @return EdgeBlendingIntensity <p>Edge fusion strength, default 0.5</p><p>Value ranges from 0 to 1.0</p>
     */
    public Float getEdgeBlendingIntensity() {
        return this.EdgeBlendingIntensity;
    }

    /**
     * Set <p>Edge fusion strength, default 0.5</p><p>Value ranges from 0 to 1.0</p>
     * @param EdgeBlendingIntensity <p>Edge fusion strength, default 0.5</p><p>Value ranges from 0 to 1.0</p>
     */
    public void setEdgeBlendingIntensity(Float EdgeBlendingIntensity) {
        this.EdgeBlendingIntensity = EdgeBlendingIntensity;
    }

    public PatternConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PatternConfig(PatternConfig source) {
        if (source.TransparencyThreshold != null) {
            this.TransparencyThreshold = new Long(source.TransparencyThreshold);
        }
        if (source.OpaqueThreshold != null) {
            this.OpaqueThreshold = new Long(source.OpaqueThreshold);
        }
        if (source.EdgeSamplingStep != null) {
            this.EdgeSamplingStep = new Long(source.EdgeSamplingStep);
        }
        if (source.EdgeExpansionStep != null) {
            this.EdgeExpansionStep = new Long(source.EdgeExpansionStep);
        }
        if (source.EdgeBlendingIntensity != null) {
            this.EdgeBlendingIntensity = new Float(source.EdgeBlendingIntensity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TransparencyThreshold", this.TransparencyThreshold);
        this.setParamSimple(map, prefix + "OpaqueThreshold", this.OpaqueThreshold);
        this.setParamSimple(map, prefix + "EdgeSamplingStep", this.EdgeSamplingStep);
        this.setParamSimple(map, prefix + "EdgeExpansionStep", this.EdgeExpansionStep);
        this.setParamSimple(map, prefix + "EdgeBlendingIntensity", this.EdgeBlendingIntensity);

    }
}


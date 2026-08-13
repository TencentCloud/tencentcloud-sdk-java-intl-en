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

public class AiCutoutConfig extends AbstractModel {

    /**
    * <p>Capability configuration switch, available values: ON: Enable; OFF: Disable. Default value: ON.</p>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * <p>Target type: "foreground" (default) / "pattern"</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Pattern matting configuration. This parameter is valid only when Type is pattern.</p>
    */
    @SerializedName("PatternConfig")
    @Expose
    private PatternConfig PatternConfig;

    /**
    * <p>Cutout model selection, optional.</p><p>Enumeration value:</p><ul><li>auto: Automatically choose appropriate model</li><li>WAND-cutout-1.0-lite: Standard version, fastest speed</li><li>WAND-cutout-2.0-lite: Enhanced, fastest speed</li><li>WAND-cutout-2.0-flash: Enhanced, quality-speed balance</li></ul>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
     * Get <p>Capability configuration switch, available values: ON: Enable; OFF: Disable. Default value: ON.</p> 
     * @return Switch <p>Capability configuration switch, available values: ON: Enable; OFF: Disable. Default value: ON.</p>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set <p>Capability configuration switch, available values: ON: Enable; OFF: Disable. Default value: ON.</p>
     * @param Switch <p>Capability configuration switch, available values: ON: Enable; OFF: Disable. Default value: ON.</p>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get <p>Target type: "foreground" (default) / "pattern"</p> 
     * @return Type <p>Target type: "foreground" (default) / "pattern"</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Target type: "foreground" (default) / "pattern"</p>
     * @param Type <p>Target type: "foreground" (default) / "pattern"</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Pattern matting configuration. This parameter is valid only when Type is pattern.</p> 
     * @return PatternConfig <p>Pattern matting configuration. This parameter is valid only when Type is pattern.</p>
     */
    public PatternConfig getPatternConfig() {
        return this.PatternConfig;
    }

    /**
     * Set <p>Pattern matting configuration. This parameter is valid only when Type is pattern.</p>
     * @param PatternConfig <p>Pattern matting configuration. This parameter is valid only when Type is pattern.</p>
     */
    public void setPatternConfig(PatternConfig PatternConfig) {
        this.PatternConfig = PatternConfig;
    }

    /**
     * Get <p>Cutout model selection, optional.</p><p>Enumeration value:</p><ul><li>auto: Automatically choose appropriate model</li><li>WAND-cutout-1.0-lite: Standard version, fastest speed</li><li>WAND-cutout-2.0-lite: Enhanced, fastest speed</li><li>WAND-cutout-2.0-flash: Enhanced, quality-speed balance</li></ul> 
     * @return Model <p>Cutout model selection, optional.</p><p>Enumeration value:</p><ul><li>auto: Automatically choose appropriate model</li><li>WAND-cutout-1.0-lite: Standard version, fastest speed</li><li>WAND-cutout-2.0-lite: Enhanced, fastest speed</li><li>WAND-cutout-2.0-flash: Enhanced, quality-speed balance</li></ul>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>Cutout model selection, optional.</p><p>Enumeration value:</p><ul><li>auto: Automatically choose appropriate model</li><li>WAND-cutout-1.0-lite: Standard version, fastest speed</li><li>WAND-cutout-2.0-lite: Enhanced, fastest speed</li><li>WAND-cutout-2.0-flash: Enhanced, quality-speed balance</li></ul>
     * @param Model <p>Cutout model selection, optional.</p><p>Enumeration value:</p><ul><li>auto: Automatically choose appropriate model</li><li>WAND-cutout-1.0-lite: Standard version, fastest speed</li><li>WAND-cutout-2.0-lite: Enhanced, fastest speed</li><li>WAND-cutout-2.0-flash: Enhanced, quality-speed balance</li></ul>
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    public AiCutoutConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiCutoutConfig(AiCutoutConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.PatternConfig != null) {
            this.PatternConfig = new PatternConfig(source.PatternConfig);
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "PatternConfig.", this.PatternConfig);
        this.setParamSimple(map, prefix + "Model", this.Model);

    }
}


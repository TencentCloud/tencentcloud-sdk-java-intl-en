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

public class RawAIDubbingParameter extends AbstractModel {

    /**
    * <p>Translation configuration message.</p>
    */
    @SerializedName("TranslateConfig")
    @Expose
    private DubbingTranslateConfig TranslateConfig;

    /**
    * <p>Subtitle configuration information.</p>
    */
    @SerializedName("SubtitleConfig")
    @Expose
    private DubbingSubtitleConfig SubtitleConfig;

    /**
    * <p>Dubbing configuration message.</p>
    */
    @SerializedName("DubbingConfig")
    @Expose
    private DubbingConfig DubbingConfig;

    /**
    * <p>Output configuration message.</p>
    */
    @SerializedName("OutputConfig")
    @Expose
    private DubbingOutputConfig OutputConfig;

    /**
     * Get <p>Translation configuration message.</p> 
     * @return TranslateConfig <p>Translation configuration message.</p>
     */
    public DubbingTranslateConfig getTranslateConfig() {
        return this.TranslateConfig;
    }

    /**
     * Set <p>Translation configuration message.</p>
     * @param TranslateConfig <p>Translation configuration message.</p>
     */
    public void setTranslateConfig(DubbingTranslateConfig TranslateConfig) {
        this.TranslateConfig = TranslateConfig;
    }

    /**
     * Get <p>Subtitle configuration information.</p> 
     * @return SubtitleConfig <p>Subtitle configuration information.</p>
     */
    public DubbingSubtitleConfig getSubtitleConfig() {
        return this.SubtitleConfig;
    }

    /**
     * Set <p>Subtitle configuration information.</p>
     * @param SubtitleConfig <p>Subtitle configuration information.</p>
     */
    public void setSubtitleConfig(DubbingSubtitleConfig SubtitleConfig) {
        this.SubtitleConfig = SubtitleConfig;
    }

    /**
     * Get <p>Dubbing configuration message.</p> 
     * @return DubbingConfig <p>Dubbing configuration message.</p>
     */
    public DubbingConfig getDubbingConfig() {
        return this.DubbingConfig;
    }

    /**
     * Set <p>Dubbing configuration message.</p>
     * @param DubbingConfig <p>Dubbing configuration message.</p>
     */
    public void setDubbingConfig(DubbingConfig DubbingConfig) {
        this.DubbingConfig = DubbingConfig;
    }

    /**
     * Get <p>Output configuration message.</p> 
     * @return OutputConfig <p>Output configuration message.</p>
     */
    public DubbingOutputConfig getOutputConfig() {
        return this.OutputConfig;
    }

    /**
     * Set <p>Output configuration message.</p>
     * @param OutputConfig <p>Output configuration message.</p>
     */
    public void setOutputConfig(DubbingOutputConfig OutputConfig) {
        this.OutputConfig = OutputConfig;
    }

    public RawAIDubbingParameter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RawAIDubbingParameter(RawAIDubbingParameter source) {
        if (source.TranslateConfig != null) {
            this.TranslateConfig = new DubbingTranslateConfig(source.TranslateConfig);
        }
        if (source.SubtitleConfig != null) {
            this.SubtitleConfig = new DubbingSubtitleConfig(source.SubtitleConfig);
        }
        if (source.DubbingConfig != null) {
            this.DubbingConfig = new DubbingConfig(source.DubbingConfig);
        }
        if (source.OutputConfig != null) {
            this.OutputConfig = new DubbingOutputConfig(source.OutputConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "TranslateConfig.", this.TranslateConfig);
        this.setParamObj(map, prefix + "SubtitleConfig.", this.SubtitleConfig);
        this.setParamObj(map, prefix + "DubbingConfig.", this.DubbingConfig);
        this.setParamObj(map, prefix + "OutputConfig.", this.OutputConfig);

    }
}


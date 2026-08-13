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

public class ImageTaskInput extends AbstractModel {

    /**
    * <p>Image encoding configuration.</p>
    */
    @SerializedName("EncodeConfig")
    @Expose
    private ImageEncodeConfig EncodeConfig;

    /**
    * <p>Image enhancement configuration.</p>
    */
    @SerializedName("EnhanceConfig")
    @Expose
    private ImageEnhanceConfig EnhanceConfig;

    /**
    * <p>Image erasing configuration.</p>
    */
    @SerializedName("EraseConfig")
    @Expose
    private ImageEraseConfig EraseConfig;

    /**
    * <p>AI image set configuration.</p>
    */
    @SerializedName("AiPosterSuiteConfig")
    @Expose
    private AiPosterSuiteConfig AiPosterSuiteConfig;

    /**
    * <p>Ai image cutout configuration</p>
    */
    @SerializedName("AiCutoutConfig")
    @Expose
    private AiCutoutConfig AiCutoutConfig;

    /**
    * <p>Ai Image Expansion Configuration</p>
    */
    @SerializedName("AiExpansionConfig")
    @Expose
    private AiExpansionConfig AiExpansionConfig;

    /**
    * <p>Ai storyboard deconstruction configuration</p>
    */
    @SerializedName("AiStoryboardConfig")
    @Expose
    private AiStoryboardConfig AiStoryboardConfig;

    /**
    * <p>Image understanding configuration.</p>
    */
    @SerializedName("UnderstandImageConfig")
    @Expose
    private UnderstandImageConfig UnderstandImageConfig;

    /**
     * Get <p>Image encoding configuration.</p> 
     * @return EncodeConfig <p>Image encoding configuration.</p>
     */
    public ImageEncodeConfig getEncodeConfig() {
        return this.EncodeConfig;
    }

    /**
     * Set <p>Image encoding configuration.</p>
     * @param EncodeConfig <p>Image encoding configuration.</p>
     */
    public void setEncodeConfig(ImageEncodeConfig EncodeConfig) {
        this.EncodeConfig = EncodeConfig;
    }

    /**
     * Get <p>Image enhancement configuration.</p> 
     * @return EnhanceConfig <p>Image enhancement configuration.</p>
     */
    public ImageEnhanceConfig getEnhanceConfig() {
        return this.EnhanceConfig;
    }

    /**
     * Set <p>Image enhancement configuration.</p>
     * @param EnhanceConfig <p>Image enhancement configuration.</p>
     */
    public void setEnhanceConfig(ImageEnhanceConfig EnhanceConfig) {
        this.EnhanceConfig = EnhanceConfig;
    }

    /**
     * Get <p>Image erasing configuration.</p> 
     * @return EraseConfig <p>Image erasing configuration.</p>
     */
    public ImageEraseConfig getEraseConfig() {
        return this.EraseConfig;
    }

    /**
     * Set <p>Image erasing configuration.</p>
     * @param EraseConfig <p>Image erasing configuration.</p>
     */
    public void setEraseConfig(ImageEraseConfig EraseConfig) {
        this.EraseConfig = EraseConfig;
    }

    /**
     * Get <p>AI image set configuration.</p> 
     * @return AiPosterSuiteConfig <p>AI image set configuration.</p>
     */
    public AiPosterSuiteConfig getAiPosterSuiteConfig() {
        return this.AiPosterSuiteConfig;
    }

    /**
     * Set <p>AI image set configuration.</p>
     * @param AiPosterSuiteConfig <p>AI image set configuration.</p>
     */
    public void setAiPosterSuiteConfig(AiPosterSuiteConfig AiPosterSuiteConfig) {
        this.AiPosterSuiteConfig = AiPosterSuiteConfig;
    }

    /**
     * Get <p>Ai image cutout configuration</p> 
     * @return AiCutoutConfig <p>Ai image cutout configuration</p>
     */
    public AiCutoutConfig getAiCutoutConfig() {
        return this.AiCutoutConfig;
    }

    /**
     * Set <p>Ai image cutout configuration</p>
     * @param AiCutoutConfig <p>Ai image cutout configuration</p>
     */
    public void setAiCutoutConfig(AiCutoutConfig AiCutoutConfig) {
        this.AiCutoutConfig = AiCutoutConfig;
    }

    /**
     * Get <p>Ai Image Expansion Configuration</p> 
     * @return AiExpansionConfig <p>Ai Image Expansion Configuration</p>
     */
    public AiExpansionConfig getAiExpansionConfig() {
        return this.AiExpansionConfig;
    }

    /**
     * Set <p>Ai Image Expansion Configuration</p>
     * @param AiExpansionConfig <p>Ai Image Expansion Configuration</p>
     */
    public void setAiExpansionConfig(AiExpansionConfig AiExpansionConfig) {
        this.AiExpansionConfig = AiExpansionConfig;
    }

    /**
     * Get <p>Ai storyboard deconstruction configuration</p> 
     * @return AiStoryboardConfig <p>Ai storyboard deconstruction configuration</p>
     */
    public AiStoryboardConfig getAiStoryboardConfig() {
        return this.AiStoryboardConfig;
    }

    /**
     * Set <p>Ai storyboard deconstruction configuration</p>
     * @param AiStoryboardConfig <p>Ai storyboard deconstruction configuration</p>
     */
    public void setAiStoryboardConfig(AiStoryboardConfig AiStoryboardConfig) {
        this.AiStoryboardConfig = AiStoryboardConfig;
    }

    /**
     * Get <p>Image understanding configuration.</p> 
     * @return UnderstandImageConfig <p>Image understanding configuration.</p>
     */
    public UnderstandImageConfig getUnderstandImageConfig() {
        return this.UnderstandImageConfig;
    }

    /**
     * Set <p>Image understanding configuration.</p>
     * @param UnderstandImageConfig <p>Image understanding configuration.</p>
     */
    public void setUnderstandImageConfig(UnderstandImageConfig UnderstandImageConfig) {
        this.UnderstandImageConfig = UnderstandImageConfig;
    }

    public ImageTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageTaskInput(ImageTaskInput source) {
        if (source.EncodeConfig != null) {
            this.EncodeConfig = new ImageEncodeConfig(source.EncodeConfig);
        }
        if (source.EnhanceConfig != null) {
            this.EnhanceConfig = new ImageEnhanceConfig(source.EnhanceConfig);
        }
        if (source.EraseConfig != null) {
            this.EraseConfig = new ImageEraseConfig(source.EraseConfig);
        }
        if (source.AiPosterSuiteConfig != null) {
            this.AiPosterSuiteConfig = new AiPosterSuiteConfig(source.AiPosterSuiteConfig);
        }
        if (source.AiCutoutConfig != null) {
            this.AiCutoutConfig = new AiCutoutConfig(source.AiCutoutConfig);
        }
        if (source.AiExpansionConfig != null) {
            this.AiExpansionConfig = new AiExpansionConfig(source.AiExpansionConfig);
        }
        if (source.AiStoryboardConfig != null) {
            this.AiStoryboardConfig = new AiStoryboardConfig(source.AiStoryboardConfig);
        }
        if (source.UnderstandImageConfig != null) {
            this.UnderstandImageConfig = new UnderstandImageConfig(source.UnderstandImageConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "EncodeConfig.", this.EncodeConfig);
        this.setParamObj(map, prefix + "EnhanceConfig.", this.EnhanceConfig);
        this.setParamObj(map, prefix + "EraseConfig.", this.EraseConfig);
        this.setParamObj(map, prefix + "AiPosterSuiteConfig.", this.AiPosterSuiteConfig);
        this.setParamObj(map, prefix + "AiCutoutConfig.", this.AiCutoutConfig);
        this.setParamObj(map, prefix + "AiExpansionConfig.", this.AiExpansionConfig);
        this.setParamObj(map, prefix + "AiStoryboardConfig.", this.AiStoryboardConfig);
        this.setParamObj(map, prefix + "UnderstandImageConfig.", this.UnderstandImageConfig);

    }
}


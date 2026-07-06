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
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EncodeConfig")
    @Expose
    private ImageEncodeConfig EncodeConfig;

    /**
    * <p>Image enhancement configuration.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EnhanceConfig")
    @Expose
    private ImageEnhanceConfig EnhanceConfig;

    /**
    * <p>Image erasing configuration.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EraseConfig")
    @Expose
    private ImageEraseConfig EraseConfig;

    /**
    * 
    */
    @SerializedName("AiPosterSuiteConfig")
    @Expose
    private AiPosterSuiteConfig AiPosterSuiteConfig;

    /**
     * Get <p>Image encoding configuration.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EncodeConfig <p>Image encoding configuration.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ImageEncodeConfig getEncodeConfig() {
        return this.EncodeConfig;
    }

    /**
     * Set <p>Image encoding configuration.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EncodeConfig <p>Image encoding configuration.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEncodeConfig(ImageEncodeConfig EncodeConfig) {
        this.EncodeConfig = EncodeConfig;
    }

    /**
     * Get <p>Image enhancement configuration.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EnhanceConfig <p>Image enhancement configuration.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ImageEnhanceConfig getEnhanceConfig() {
        return this.EnhanceConfig;
    }

    /**
     * Set <p>Image enhancement configuration.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EnhanceConfig <p>Image enhancement configuration.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEnhanceConfig(ImageEnhanceConfig EnhanceConfig) {
        this.EnhanceConfig = EnhanceConfig;
    }

    /**
     * Get <p>Image erasing configuration.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EraseConfig <p>Image erasing configuration.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ImageEraseConfig getEraseConfig() {
        return this.EraseConfig;
    }

    /**
     * Set <p>Image erasing configuration.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EraseConfig <p>Image erasing configuration.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEraseConfig(ImageEraseConfig EraseConfig) {
        this.EraseConfig = EraseConfig;
    }

    /**
     * Get  
     * @return AiPosterSuiteConfig 
     */
    public AiPosterSuiteConfig getAiPosterSuiteConfig() {
        return this.AiPosterSuiteConfig;
    }

    /**
     * Set 
     * @param AiPosterSuiteConfig 
     */
    public void setAiPosterSuiteConfig(AiPosterSuiteConfig AiPosterSuiteConfig) {
        this.AiPosterSuiteConfig = AiPosterSuiteConfig;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "EncodeConfig.", this.EncodeConfig);
        this.setParamObj(map, prefix + "EnhanceConfig.", this.EnhanceConfig);
        this.setParamObj(map, prefix + "EraseConfig.", this.EraseConfig);
        this.setParamObj(map, prefix + "AiPosterSuiteConfig.", this.AiPosterSuiteConfig);

    }
}


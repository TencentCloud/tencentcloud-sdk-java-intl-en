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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProcessImageAsyncTask extends AbstractModel {

    /**
    * <p>Image transcoding output configuration.</p>
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
    * <p>Image beauty effect configuration.</p>
    */
    @SerializedName("BeautyConfig")
    @Expose
    private ImageBeautyConfig BeautyConfig;

    /**
    * <p>Ai cutout configuration</p>
    */
    @SerializedName("AiCutOutConfig")
    @Expose
    private AiCutOutConfig AiCutOutConfig;

    /**
     * Get <p>Image transcoding output configuration.</p> 
     * @return EncodeConfig <p>Image transcoding output configuration.</p>
     */
    public ImageEncodeConfig getEncodeConfig() {
        return this.EncodeConfig;
    }

    /**
     * Set <p>Image transcoding output configuration.</p>
     * @param EncodeConfig <p>Image transcoding output configuration.</p>
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
     * Get <p>Image beauty effect configuration.</p> 
     * @return BeautyConfig <p>Image beauty effect configuration.</p>
     */
    public ImageBeautyConfig getBeautyConfig() {
        return this.BeautyConfig;
    }

    /**
     * Set <p>Image beauty effect configuration.</p>
     * @param BeautyConfig <p>Image beauty effect configuration.</p>
     */
    public void setBeautyConfig(ImageBeautyConfig BeautyConfig) {
        this.BeautyConfig = BeautyConfig;
    }

    /**
     * Get <p>Ai cutout configuration</p> 
     * @return AiCutOutConfig <p>Ai cutout configuration</p>
     */
    public AiCutOutConfig getAiCutOutConfig() {
        return this.AiCutOutConfig;
    }

    /**
     * Set <p>Ai cutout configuration</p>
     * @param AiCutOutConfig <p>Ai cutout configuration</p>
     */
    public void setAiCutOutConfig(AiCutOutConfig AiCutOutConfig) {
        this.AiCutOutConfig = AiCutOutConfig;
    }

    public ProcessImageAsyncTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProcessImageAsyncTask(ProcessImageAsyncTask source) {
        if (source.EncodeConfig != null) {
            this.EncodeConfig = new ImageEncodeConfig(source.EncodeConfig);
        }
        if (source.EnhanceConfig != null) {
            this.EnhanceConfig = new ImageEnhanceConfig(source.EnhanceConfig);
        }
        if (source.BeautyConfig != null) {
            this.BeautyConfig = new ImageBeautyConfig(source.BeautyConfig);
        }
        if (source.AiCutOutConfig != null) {
            this.AiCutOutConfig = new AiCutOutConfig(source.AiCutOutConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "EncodeConfig.", this.EncodeConfig);
        this.setParamObj(map, prefix + "EnhanceConfig.", this.EnhanceConfig);
        this.setParamObj(map, prefix + "BeautyConfig.", this.BeautyConfig);
        this.setParamObj(map, prefix + "AiCutOutConfig.", this.AiCutOutConfig);

    }
}


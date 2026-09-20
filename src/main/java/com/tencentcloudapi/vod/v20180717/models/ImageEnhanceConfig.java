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

public class ImageEnhanceConfig extends AbstractModel {

    /**
    * Super-resolution configuration.
    */
    @SerializedName("SuperResolution")
    @Expose
    private SuperResolutionInfo SuperResolution;

    /**
    * Advanced super-resolution configuration.
    */
    @SerializedName("AdvancedSuperResolution")
    @Expose
    private AdvancedSuperResolutionConfig AdvancedSuperResolution;

    /**
    * Denoising configuration.
    */
    @SerializedName("Denoise")
    @Expose
    private ImageDenoiseConfig Denoise;

    /**
    * Comprehensive enhancement configuration.
    */
    @SerializedName("ImageQualityEnhance")
    @Expose
    private ImageQualityEnhanceInfo ImageQualityEnhance;

    /**
    * Color enhancement configuration.
    */
    @SerializedName("ColorEnhance")
    @Expose
    private ColorEnhanceInfo ColorEnhance;

    /**
    * Detail enhancement configuration.
    */
    @SerializedName("SharpEnhance")
    @Expose
    private SharpEnhanceInfo SharpEnhance;

    /**
    * Face enhancement configuration.
    */
    @SerializedName("FaceEnhance")
    @Expose
    private FaceEnhanceInfo FaceEnhance;

    /**
    * Low-light enhancement configuration.
    */
    @SerializedName("LowLightEnhance")
    @Expose
    private LowLightEnhanceInfo LowLightEnhance;

    /**
     * Get Super-resolution configuration. 
     * @return SuperResolution Super-resolution configuration.
     */
    public SuperResolutionInfo getSuperResolution() {
        return this.SuperResolution;
    }

    /**
     * Set Super-resolution configuration.
     * @param SuperResolution Super-resolution configuration.
     */
    public void setSuperResolution(SuperResolutionInfo SuperResolution) {
        this.SuperResolution = SuperResolution;
    }

    /**
     * Get Advanced super-resolution configuration. 
     * @return AdvancedSuperResolution Advanced super-resolution configuration.
     */
    public AdvancedSuperResolutionConfig getAdvancedSuperResolution() {
        return this.AdvancedSuperResolution;
    }

    /**
     * Set Advanced super-resolution configuration.
     * @param AdvancedSuperResolution Advanced super-resolution configuration.
     */
    public void setAdvancedSuperResolution(AdvancedSuperResolutionConfig AdvancedSuperResolution) {
        this.AdvancedSuperResolution = AdvancedSuperResolution;
    }

    /**
     * Get Denoising configuration. 
     * @return Denoise Denoising configuration.
     */
    public ImageDenoiseConfig getDenoise() {
        return this.Denoise;
    }

    /**
     * Set Denoising configuration.
     * @param Denoise Denoising configuration.
     */
    public void setDenoise(ImageDenoiseConfig Denoise) {
        this.Denoise = Denoise;
    }

    /**
     * Get Comprehensive enhancement configuration. 
     * @return ImageQualityEnhance Comprehensive enhancement configuration.
     */
    public ImageQualityEnhanceInfo getImageQualityEnhance() {
        return this.ImageQualityEnhance;
    }

    /**
     * Set Comprehensive enhancement configuration.
     * @param ImageQualityEnhance Comprehensive enhancement configuration.
     */
    public void setImageQualityEnhance(ImageQualityEnhanceInfo ImageQualityEnhance) {
        this.ImageQualityEnhance = ImageQualityEnhance;
    }

    /**
     * Get Color enhancement configuration. 
     * @return ColorEnhance Color enhancement configuration.
     */
    public ColorEnhanceInfo getColorEnhance() {
        return this.ColorEnhance;
    }

    /**
     * Set Color enhancement configuration.
     * @param ColorEnhance Color enhancement configuration.
     */
    public void setColorEnhance(ColorEnhanceInfo ColorEnhance) {
        this.ColorEnhance = ColorEnhance;
    }

    /**
     * Get Detail enhancement configuration. 
     * @return SharpEnhance Detail enhancement configuration.
     */
    public SharpEnhanceInfo getSharpEnhance() {
        return this.SharpEnhance;
    }

    /**
     * Set Detail enhancement configuration.
     * @param SharpEnhance Detail enhancement configuration.
     */
    public void setSharpEnhance(SharpEnhanceInfo SharpEnhance) {
        this.SharpEnhance = SharpEnhance;
    }

    /**
     * Get Face enhancement configuration. 
     * @return FaceEnhance Face enhancement configuration.
     */
    public FaceEnhanceInfo getFaceEnhance() {
        return this.FaceEnhance;
    }

    /**
     * Set Face enhancement configuration.
     * @param FaceEnhance Face enhancement configuration.
     */
    public void setFaceEnhance(FaceEnhanceInfo FaceEnhance) {
        this.FaceEnhance = FaceEnhance;
    }

    /**
     * Get Low-light enhancement configuration. 
     * @return LowLightEnhance Low-light enhancement configuration.
     */
    public LowLightEnhanceInfo getLowLightEnhance() {
        return this.LowLightEnhance;
    }

    /**
     * Set Low-light enhancement configuration.
     * @param LowLightEnhance Low-light enhancement configuration.
     */
    public void setLowLightEnhance(LowLightEnhanceInfo LowLightEnhance) {
        this.LowLightEnhance = LowLightEnhance;
    }

    public ImageEnhanceConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageEnhanceConfig(ImageEnhanceConfig source) {
        if (source.SuperResolution != null) {
            this.SuperResolution = new SuperResolutionInfo(source.SuperResolution);
        }
        if (source.AdvancedSuperResolution != null) {
            this.AdvancedSuperResolution = new AdvancedSuperResolutionConfig(source.AdvancedSuperResolution);
        }
        if (source.Denoise != null) {
            this.Denoise = new ImageDenoiseConfig(source.Denoise);
        }
        if (source.ImageQualityEnhance != null) {
            this.ImageQualityEnhance = new ImageQualityEnhanceInfo(source.ImageQualityEnhance);
        }
        if (source.ColorEnhance != null) {
            this.ColorEnhance = new ColorEnhanceInfo(source.ColorEnhance);
        }
        if (source.SharpEnhance != null) {
            this.SharpEnhance = new SharpEnhanceInfo(source.SharpEnhance);
        }
        if (source.FaceEnhance != null) {
            this.FaceEnhance = new FaceEnhanceInfo(source.FaceEnhance);
        }
        if (source.LowLightEnhance != null) {
            this.LowLightEnhance = new LowLightEnhanceInfo(source.LowLightEnhance);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SuperResolution.", this.SuperResolution);
        this.setParamObj(map, prefix + "AdvancedSuperResolution.", this.AdvancedSuperResolution);
        this.setParamObj(map, prefix + "Denoise.", this.Denoise);
        this.setParamObj(map, prefix + "ImageQualityEnhance.", this.ImageQualityEnhance);
        this.setParamObj(map, prefix + "ColorEnhance.", this.ColorEnhance);
        this.setParamObj(map, prefix + "SharpEnhance.", this.SharpEnhance);
        this.setParamObj(map, prefix + "FaceEnhance.", this.FaceEnhance);
        this.setParamObj(map, prefix + "LowLightEnhance.", this.LowLightEnhance);

    }
}


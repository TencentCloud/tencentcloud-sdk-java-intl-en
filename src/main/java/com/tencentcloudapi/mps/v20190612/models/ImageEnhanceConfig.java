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

public class ImageEnhanceConfig extends AbstractModel {

    /**
    * Super-resolution configuration.

    */
    @SerializedName("SuperResolution")
    @Expose
    private SuperResolutionConfig SuperResolution;

    /**
    * Advanced super-resolution configuration.
    */
    @SerializedName("AdvancedSuperResolutionConfig")
    @Expose
    private AdvancedSuperResolutionConfig AdvancedSuperResolutionConfig;

    /**
    * Denoising configuration.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Denoise")
    @Expose
    private ImageDenoiseConfig Denoise;

    /**
    * Comprehensive enhancement configuration.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ImageQualityEnhance")
    @Expose
    private ImageQualityEnhanceConfig ImageQualityEnhance;

    /**
    * Color enhancement configuration.

    */
    @SerializedName("ColorEnhance")
    @Expose
    private ColorEnhanceConfig ColorEnhance;

    /**
    * Detail enhancement configuration.

    */
    @SerializedName("SharpEnhance")
    @Expose
    private SharpEnhanceConfig SharpEnhance;

    /**
    * Face enhancement configuration.

    */
    @SerializedName("FaceEnhance")
    @Expose
    private FaceEnhanceConfig FaceEnhance;

    /**
    * Low-light enhancement configuration.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("LowLightEnhance")
    @Expose
    private LowLightEnhanceConfig LowLightEnhance;

    /**
     * Get Super-resolution configuration.
 
     * @return SuperResolution Super-resolution configuration.

     */
    public SuperResolutionConfig getSuperResolution() {
        return this.SuperResolution;
    }

    /**
     * Set Super-resolution configuration.

     * @param SuperResolution Super-resolution configuration.

     */
    public void setSuperResolution(SuperResolutionConfig SuperResolution) {
        this.SuperResolution = SuperResolution;
    }

    /**
     * Get Advanced super-resolution configuration. 
     * @return AdvancedSuperResolutionConfig Advanced super-resolution configuration.
     */
    public AdvancedSuperResolutionConfig getAdvancedSuperResolutionConfig() {
        return this.AdvancedSuperResolutionConfig;
    }

    /**
     * Set Advanced super-resolution configuration.
     * @param AdvancedSuperResolutionConfig Advanced super-resolution configuration.
     */
    public void setAdvancedSuperResolutionConfig(AdvancedSuperResolutionConfig AdvancedSuperResolutionConfig) {
        this.AdvancedSuperResolutionConfig = AdvancedSuperResolutionConfig;
    }

    /**
     * Get Denoising configuration.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Denoise Denoising configuration.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public ImageDenoiseConfig getDenoise() {
        return this.Denoise;
    }

    /**
     * Set Denoising configuration.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Denoise Denoising configuration.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDenoise(ImageDenoiseConfig Denoise) {
        this.Denoise = Denoise;
    }

    /**
     * Get Comprehensive enhancement configuration.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ImageQualityEnhance Comprehensive enhancement configuration.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public ImageQualityEnhanceConfig getImageQualityEnhance() {
        return this.ImageQualityEnhance;
    }

    /**
     * Set Comprehensive enhancement configuration.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ImageQualityEnhance Comprehensive enhancement configuration.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setImageQualityEnhance(ImageQualityEnhanceConfig ImageQualityEnhance) {
        this.ImageQualityEnhance = ImageQualityEnhance;
    }

    /**
     * Get Color enhancement configuration.
 
     * @return ColorEnhance Color enhancement configuration.

     */
    public ColorEnhanceConfig getColorEnhance() {
        return this.ColorEnhance;
    }

    /**
     * Set Color enhancement configuration.

     * @param ColorEnhance Color enhancement configuration.

     */
    public void setColorEnhance(ColorEnhanceConfig ColorEnhance) {
        this.ColorEnhance = ColorEnhance;
    }

    /**
     * Get Detail enhancement configuration.
 
     * @return SharpEnhance Detail enhancement configuration.

     */
    public SharpEnhanceConfig getSharpEnhance() {
        return this.SharpEnhance;
    }

    /**
     * Set Detail enhancement configuration.

     * @param SharpEnhance Detail enhancement configuration.

     */
    public void setSharpEnhance(SharpEnhanceConfig SharpEnhance) {
        this.SharpEnhance = SharpEnhance;
    }

    /**
     * Get Face enhancement configuration.
 
     * @return FaceEnhance Face enhancement configuration.

     */
    public FaceEnhanceConfig getFaceEnhance() {
        return this.FaceEnhance;
    }

    /**
     * Set Face enhancement configuration.

     * @param FaceEnhance Face enhancement configuration.

     */
    public void setFaceEnhance(FaceEnhanceConfig FaceEnhance) {
        this.FaceEnhance = FaceEnhance;
    }

    /**
     * Get Low-light enhancement configuration.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return LowLightEnhance Low-light enhancement configuration.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public LowLightEnhanceConfig getLowLightEnhance() {
        return this.LowLightEnhance;
    }

    /**
     * Set Low-light enhancement configuration.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param LowLightEnhance Low-light enhancement configuration.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setLowLightEnhance(LowLightEnhanceConfig LowLightEnhance) {
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
            this.SuperResolution = new SuperResolutionConfig(source.SuperResolution);
        }
        if (source.AdvancedSuperResolutionConfig != null) {
            this.AdvancedSuperResolutionConfig = new AdvancedSuperResolutionConfig(source.AdvancedSuperResolutionConfig);
        }
        if (source.Denoise != null) {
            this.Denoise = new ImageDenoiseConfig(source.Denoise);
        }
        if (source.ImageQualityEnhance != null) {
            this.ImageQualityEnhance = new ImageQualityEnhanceConfig(source.ImageQualityEnhance);
        }
        if (source.ColorEnhance != null) {
            this.ColorEnhance = new ColorEnhanceConfig(source.ColorEnhance);
        }
        if (source.SharpEnhance != null) {
            this.SharpEnhance = new SharpEnhanceConfig(source.SharpEnhance);
        }
        if (source.FaceEnhance != null) {
            this.FaceEnhance = new FaceEnhanceConfig(source.FaceEnhance);
        }
        if (source.LowLightEnhance != null) {
            this.LowLightEnhance = new LowLightEnhanceConfig(source.LowLightEnhance);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SuperResolution.", this.SuperResolution);
        this.setParamObj(map, prefix + "AdvancedSuperResolutionConfig.", this.AdvancedSuperResolutionConfig);
        this.setParamObj(map, prefix + "Denoise.", this.Denoise);
        this.setParamObj(map, prefix + "ImageQualityEnhance.", this.ImageQualityEnhance);
        this.setParamObj(map, prefix + "ColorEnhance.", this.ColorEnhance);
        this.setParamObj(map, prefix + "SharpEnhance.", this.SharpEnhance);
        this.setParamObj(map, prefix + "FaceEnhance.", this.FaceEnhance);
        this.setParamObj(map, prefix + "LowLightEnhance.", this.LowLightEnhance);

    }
}


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
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SuperResolution")
    @Expose
    private SuperResolutionInfo SuperResolution;

    /**
    * Advanced super-resolution configuration.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AdvancedSuperResolution")
    @Expose
    private AdvancedSuperResolutionConfig AdvancedSuperResolution;

    /**
    * Denoising configuration.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Denoise")
    @Expose
    private ImageDenoiseConfig Denoise;

    /**
    * Comprehensive enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ImageQualityEnhance")
    @Expose
    private ImageQualityEnhanceInfo ImageQualityEnhance;

    /**
    * Color enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ColorEnhance")
    @Expose
    private ColorEnhanceInfo ColorEnhance;

    /**
    * Detail enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SharpEnhance")
    @Expose
    private SharpEnhanceInfo SharpEnhance;

    /**
    * Face enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FaceEnhance")
    @Expose
    private FaceEnhanceInfo FaceEnhance;

    /**
    * Low-light enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LowLightEnhance")
    @Expose
    private LowLightEnhanceInfo LowLightEnhance;

    /**
     * Get Super-resolution configuration.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SuperResolution Super-resolution configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SuperResolutionInfo getSuperResolution() {
        return this.SuperResolution;
    }

    /**
     * Set Super-resolution configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SuperResolution Super-resolution configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSuperResolution(SuperResolutionInfo SuperResolution) {
        this.SuperResolution = SuperResolution;
    }

    /**
     * Get Advanced super-resolution configuration.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AdvancedSuperResolution Advanced super-resolution configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AdvancedSuperResolutionConfig getAdvancedSuperResolution() {
        return this.AdvancedSuperResolution;
    }

    /**
     * Set Advanced super-resolution configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AdvancedSuperResolution Advanced super-resolution configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAdvancedSuperResolution(AdvancedSuperResolutionConfig AdvancedSuperResolution) {
        this.AdvancedSuperResolution = AdvancedSuperResolution;
    }

    /**
     * Get Denoising configuration.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Denoise Denoising configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ImageDenoiseConfig getDenoise() {
        return this.Denoise;
    }

    /**
     * Set Denoising configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Denoise Denoising configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDenoise(ImageDenoiseConfig Denoise) {
        this.Denoise = Denoise;
    }

    /**
     * Get Comprehensive enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ImageQualityEnhance Comprehensive enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ImageQualityEnhanceInfo getImageQualityEnhance() {
        return this.ImageQualityEnhance;
    }

    /**
     * Set Comprehensive enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ImageQualityEnhance Comprehensive enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setImageQualityEnhance(ImageQualityEnhanceInfo ImageQualityEnhance) {
        this.ImageQualityEnhance = ImageQualityEnhance;
    }

    /**
     * Get Color enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ColorEnhance Color enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ColorEnhanceInfo getColorEnhance() {
        return this.ColorEnhance;
    }

    /**
     * Set Color enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ColorEnhance Color enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setColorEnhance(ColorEnhanceInfo ColorEnhance) {
        this.ColorEnhance = ColorEnhance;
    }

    /**
     * Get Detail enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SharpEnhance Detail enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SharpEnhanceInfo getSharpEnhance() {
        return this.SharpEnhance;
    }

    /**
     * Set Detail enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SharpEnhance Detail enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSharpEnhance(SharpEnhanceInfo SharpEnhance) {
        this.SharpEnhance = SharpEnhance;
    }

    /**
     * Get Face enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FaceEnhance Face enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public FaceEnhanceInfo getFaceEnhance() {
        return this.FaceEnhance;
    }

    /**
     * Set Face enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FaceEnhance Face enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFaceEnhance(FaceEnhanceInfo FaceEnhance) {
        this.FaceEnhance = FaceEnhance;
    }

    /**
     * Get Low-light enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LowLightEnhance Low-light enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public LowLightEnhanceInfo getLowLightEnhance() {
        return this.LowLightEnhance;
    }

    /**
     * Set Low-light enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LowLightEnhance Low-light enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained.
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


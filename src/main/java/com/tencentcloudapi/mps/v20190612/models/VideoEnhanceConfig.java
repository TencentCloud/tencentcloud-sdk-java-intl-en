/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VideoEnhanceConfig extends AbstractModel{

    /**
    * Frame interpolation configuration.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FrameRate")
    @Expose
    private FrameRateConfig FrameRate;

    /**
    * Super resolution configuration.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SuperResolution")
    @Expose
    private SuperResolutionConfig SuperResolution;

    /**
    * HDR configuration.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Hdr")
    @Expose
    private HdrConfig Hdr;

    /**
    * Image noise removal configuration.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Denoise")
    @Expose
    private VideoDenoiseConfig Denoise;

    /**
    * Overall enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ImageQualityEnhance")
    @Expose
    private ImageQualityEnhanceConfig ImageQualityEnhance;

    /**
    * Color enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ColorEnhance")
    @Expose
    private ColorEnhanceConfig ColorEnhance;

    /**
    * Detail enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SharpEnhance")
    @Expose
    private SharpEnhanceConfig SharpEnhance;

    /**
    * Face enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FaceEnhance")
    @Expose
    private FaceEnhanceConfig FaceEnhance;

    /**
    * Low-light enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LowLightEnhance")
    @Expose
    private LowLightEnhanceConfig LowLightEnhance;

    /**
    * Banding removal configuration.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScratchRepair")
    @Expose
    private ScratchRepairConfig ScratchRepair;

    /**
    * Artifact removal (smoothing) configuration.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ArtifactRepair")
    @Expose
    private ArtifactRepairConfig ArtifactRepair;

    /**
     * Get Frame interpolation configuration.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FrameRate Frame interpolation configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public FrameRateConfig getFrameRate() {
        return this.FrameRate;
    }

    /**
     * Set Frame interpolation configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FrameRate Frame interpolation configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFrameRate(FrameRateConfig FrameRate) {
        this.FrameRate = FrameRate;
    }

    /**
     * Get Super resolution configuration.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SuperResolution Super resolution configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SuperResolutionConfig getSuperResolution() {
        return this.SuperResolution;
    }

    /**
     * Set Super resolution configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SuperResolution Super resolution configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSuperResolution(SuperResolutionConfig SuperResolution) {
        this.SuperResolution = SuperResolution;
    }

    /**
     * Get HDR configuration.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Hdr HDR configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public HdrConfig getHdr() {
        return this.Hdr;
    }

    /**
     * Set HDR configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Hdr HDR configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHdr(HdrConfig Hdr) {
        this.Hdr = Hdr;
    }

    /**
     * Get Image noise removal configuration.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Denoise Image noise removal configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public VideoDenoiseConfig getDenoise() {
        return this.Denoise;
    }

    /**
     * Set Image noise removal configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Denoise Image noise removal configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDenoise(VideoDenoiseConfig Denoise) {
        this.Denoise = Denoise;
    }

    /**
     * Get Overall enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ImageQualityEnhance Overall enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ImageQualityEnhanceConfig getImageQualityEnhance() {
        return this.ImageQualityEnhance;
    }

    /**
     * Set Overall enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ImageQualityEnhance Overall enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setImageQualityEnhance(ImageQualityEnhanceConfig ImageQualityEnhance) {
        this.ImageQualityEnhance = ImageQualityEnhance;
    }

    /**
     * Get Color enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ColorEnhance Color enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ColorEnhanceConfig getColorEnhance() {
        return this.ColorEnhance;
    }

    /**
     * Set Color enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ColorEnhance Color enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setColorEnhance(ColorEnhanceConfig ColorEnhance) {
        this.ColorEnhance = ColorEnhance;
    }

    /**
     * Get Detail enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SharpEnhance Detail enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SharpEnhanceConfig getSharpEnhance() {
        return this.SharpEnhance;
    }

    /**
     * Set Detail enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SharpEnhance Detail enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSharpEnhance(SharpEnhanceConfig SharpEnhance) {
        this.SharpEnhance = SharpEnhance;
    }

    /**
     * Get Face enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FaceEnhance Face enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public FaceEnhanceConfig getFaceEnhance() {
        return this.FaceEnhance;
    }

    /**
     * Set Face enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FaceEnhance Face enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFaceEnhance(FaceEnhanceConfig FaceEnhance) {
        this.FaceEnhance = FaceEnhance;
    }

    /**
     * Get Low-light enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LowLightEnhance Low-light enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public LowLightEnhanceConfig getLowLightEnhance() {
        return this.LowLightEnhance;
    }

    /**
     * Set Low-light enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LowLightEnhance Low-light enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLowLightEnhance(LowLightEnhanceConfig LowLightEnhance) {
        this.LowLightEnhance = LowLightEnhance;
    }

    /**
     * Get Banding removal configuration.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ScratchRepair Banding removal configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ScratchRepairConfig getScratchRepair() {
        return this.ScratchRepair;
    }

    /**
     * Set Banding removal configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ScratchRepair Banding removal configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScratchRepair(ScratchRepairConfig ScratchRepair) {
        this.ScratchRepair = ScratchRepair;
    }

    /**
     * Get Artifact removal (smoothing) configuration.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ArtifactRepair Artifact removal (smoothing) configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ArtifactRepairConfig getArtifactRepair() {
        return this.ArtifactRepair;
    }

    /**
     * Set Artifact removal (smoothing) configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ArtifactRepair Artifact removal (smoothing) configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setArtifactRepair(ArtifactRepairConfig ArtifactRepair) {
        this.ArtifactRepair = ArtifactRepair;
    }

    public VideoEnhanceConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoEnhanceConfig(VideoEnhanceConfig source) {
        if (source.FrameRate != null) {
            this.FrameRate = new FrameRateConfig(source.FrameRate);
        }
        if (source.SuperResolution != null) {
            this.SuperResolution = new SuperResolutionConfig(source.SuperResolution);
        }
        if (source.Hdr != null) {
            this.Hdr = new HdrConfig(source.Hdr);
        }
        if (source.Denoise != null) {
            this.Denoise = new VideoDenoiseConfig(source.Denoise);
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
        if (source.ScratchRepair != null) {
            this.ScratchRepair = new ScratchRepairConfig(source.ScratchRepair);
        }
        if (source.ArtifactRepair != null) {
            this.ArtifactRepair = new ArtifactRepairConfig(source.ArtifactRepair);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "FrameRate.", this.FrameRate);
        this.setParamObj(map, prefix + "SuperResolution.", this.SuperResolution);
        this.setParamObj(map, prefix + "Hdr.", this.Hdr);
        this.setParamObj(map, prefix + "Denoise.", this.Denoise);
        this.setParamObj(map, prefix + "ImageQualityEnhance.", this.ImageQualityEnhance);
        this.setParamObj(map, prefix + "ColorEnhance.", this.ColorEnhance);
        this.setParamObj(map, prefix + "SharpEnhance.", this.SharpEnhance);
        this.setParamObj(map, prefix + "FaceEnhance.", this.FaceEnhance);
        this.setParamObj(map, prefix + "LowLightEnhance.", this.LowLightEnhance);
        this.setParamObj(map, prefix + "ScratchRepair.", this.ScratchRepair);
        this.setParamObj(map, prefix + "ArtifactRepair.", this.ArtifactRepair);

    }
}


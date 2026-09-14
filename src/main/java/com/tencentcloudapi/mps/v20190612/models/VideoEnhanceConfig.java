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

public class VideoEnhanceConfig extends AbstractModel {

    /**
    * 
    */
    @SerializedName("FrameRate")
    @Expose
    private FrameRateConfig FrameRate;

    /**
    * 
    */
    @SerializedName("SuperResolution")
    @Expose
    private SuperResolutionConfig SuperResolution;

    /**
    * 
    */
    @SerializedName("Hdr")
    @Expose
    private HdrConfig Hdr;

    /**
    * 
    */
    @SerializedName("Denoise")
    @Expose
    private VideoDenoiseConfig Denoise;

    /**
    * 
    */
    @SerializedName("ImageQualityEnhance")
    @Expose
    private ImageQualityEnhanceConfig ImageQualityEnhance;

    /**
    * 
    */
    @SerializedName("ColorEnhance")
    @Expose
    private ColorEnhanceConfig ColorEnhance;

    /**
    * 
    */
    @SerializedName("LowLightEnhance")
    @Expose
    private LowLightEnhanceConfig LowLightEnhance;

    /**
    * 
    */
    @SerializedName("ScratchRepair")
    @Expose
    private ScratchRepairConfig ScratchRepair;

    /**
    * 
    */
    @SerializedName("ArtifactRepair")
    @Expose
    private ArtifactRepairConfig ArtifactRepair;

    /**
    * 
    */
    @SerializedName("EnhanceSceneType")
    @Expose
    private String EnhanceSceneType;

    /**
    * 
    */
    @SerializedName("DiffusionEnhance")
    @Expose
    private DiffusionEnhanceConfig DiffusionEnhance;

    /**
    * 
    */
    @SerializedName("FrameRateWithDen")
    @Expose
    private FrameRateWithDenConfig FrameRateWithDen;

    /**
    * 
    */
    @SerializedName("AiRestoration")
    @Expose
    private AiRestorationConfig AiRestoration;

    /**
     * Get  
     * @return FrameRate 
     */
    public FrameRateConfig getFrameRate() {
        return this.FrameRate;
    }

    /**
     * Set 
     * @param FrameRate 
     */
    public void setFrameRate(FrameRateConfig FrameRate) {
        this.FrameRate = FrameRate;
    }

    /**
     * Get  
     * @return SuperResolution 
     */
    public SuperResolutionConfig getSuperResolution() {
        return this.SuperResolution;
    }

    /**
     * Set 
     * @param SuperResolution 
     */
    public void setSuperResolution(SuperResolutionConfig SuperResolution) {
        this.SuperResolution = SuperResolution;
    }

    /**
     * Get  
     * @return Hdr 
     */
    public HdrConfig getHdr() {
        return this.Hdr;
    }

    /**
     * Set 
     * @param Hdr 
     */
    public void setHdr(HdrConfig Hdr) {
        this.Hdr = Hdr;
    }

    /**
     * Get  
     * @return Denoise 
     */
    public VideoDenoiseConfig getDenoise() {
        return this.Denoise;
    }

    /**
     * Set 
     * @param Denoise 
     */
    public void setDenoise(VideoDenoiseConfig Denoise) {
        this.Denoise = Denoise;
    }

    /**
     * Get  
     * @return ImageQualityEnhance 
     */
    public ImageQualityEnhanceConfig getImageQualityEnhance() {
        return this.ImageQualityEnhance;
    }

    /**
     * Set 
     * @param ImageQualityEnhance 
     */
    public void setImageQualityEnhance(ImageQualityEnhanceConfig ImageQualityEnhance) {
        this.ImageQualityEnhance = ImageQualityEnhance;
    }

    /**
     * Get  
     * @return ColorEnhance 
     */
    public ColorEnhanceConfig getColorEnhance() {
        return this.ColorEnhance;
    }

    /**
     * Set 
     * @param ColorEnhance 
     */
    public void setColorEnhance(ColorEnhanceConfig ColorEnhance) {
        this.ColorEnhance = ColorEnhance;
    }

    /**
     * Get  
     * @return LowLightEnhance 
     */
    public LowLightEnhanceConfig getLowLightEnhance() {
        return this.LowLightEnhance;
    }

    /**
     * Set 
     * @param LowLightEnhance 
     */
    public void setLowLightEnhance(LowLightEnhanceConfig LowLightEnhance) {
        this.LowLightEnhance = LowLightEnhance;
    }

    /**
     * Get  
     * @return ScratchRepair 
     */
    public ScratchRepairConfig getScratchRepair() {
        return this.ScratchRepair;
    }

    /**
     * Set 
     * @param ScratchRepair 
     */
    public void setScratchRepair(ScratchRepairConfig ScratchRepair) {
        this.ScratchRepair = ScratchRepair;
    }

    /**
     * Get  
     * @return ArtifactRepair 
     */
    public ArtifactRepairConfig getArtifactRepair() {
        return this.ArtifactRepair;
    }

    /**
     * Set 
     * @param ArtifactRepair 
     */
    public void setArtifactRepair(ArtifactRepairConfig ArtifactRepair) {
        this.ArtifactRepair = ArtifactRepair;
    }

    /**
     * Get  
     * @return EnhanceSceneType 
     */
    public String getEnhanceSceneType() {
        return this.EnhanceSceneType;
    }

    /**
     * Set 
     * @param EnhanceSceneType 
     */
    public void setEnhanceSceneType(String EnhanceSceneType) {
        this.EnhanceSceneType = EnhanceSceneType;
    }

    /**
     * Get  
     * @return DiffusionEnhance 
     */
    public DiffusionEnhanceConfig getDiffusionEnhance() {
        return this.DiffusionEnhance;
    }

    /**
     * Set 
     * @param DiffusionEnhance 
     */
    public void setDiffusionEnhance(DiffusionEnhanceConfig DiffusionEnhance) {
        this.DiffusionEnhance = DiffusionEnhance;
    }

    /**
     * Get  
     * @return FrameRateWithDen 
     */
    public FrameRateWithDenConfig getFrameRateWithDen() {
        return this.FrameRateWithDen;
    }

    /**
     * Set 
     * @param FrameRateWithDen 
     */
    public void setFrameRateWithDen(FrameRateWithDenConfig FrameRateWithDen) {
        this.FrameRateWithDen = FrameRateWithDen;
    }

    /**
     * Get  
     * @return AiRestoration 
     */
    public AiRestorationConfig getAiRestoration() {
        return this.AiRestoration;
    }

    /**
     * Set 
     * @param AiRestoration 
     */
    public void setAiRestoration(AiRestorationConfig AiRestoration) {
        this.AiRestoration = AiRestoration;
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
        if (source.LowLightEnhance != null) {
            this.LowLightEnhance = new LowLightEnhanceConfig(source.LowLightEnhance);
        }
        if (source.ScratchRepair != null) {
            this.ScratchRepair = new ScratchRepairConfig(source.ScratchRepair);
        }
        if (source.ArtifactRepair != null) {
            this.ArtifactRepair = new ArtifactRepairConfig(source.ArtifactRepair);
        }
        if (source.EnhanceSceneType != null) {
            this.EnhanceSceneType = new String(source.EnhanceSceneType);
        }
        if (source.DiffusionEnhance != null) {
            this.DiffusionEnhance = new DiffusionEnhanceConfig(source.DiffusionEnhance);
        }
        if (source.FrameRateWithDen != null) {
            this.FrameRateWithDen = new FrameRateWithDenConfig(source.FrameRateWithDen);
        }
        if (source.AiRestoration != null) {
            this.AiRestoration = new AiRestorationConfig(source.AiRestoration);
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
        this.setParamObj(map, prefix + "LowLightEnhance.", this.LowLightEnhance);
        this.setParamObj(map, prefix + "ScratchRepair.", this.ScratchRepair);
        this.setParamObj(map, prefix + "ArtifactRepair.", this.ArtifactRepair);
        this.setParamSimple(map, prefix + "EnhanceSceneType", this.EnhanceSceneType);
        this.setParamObj(map, prefix + "DiffusionEnhance.", this.DiffusionEnhance);
        this.setParamObj(map, prefix + "FrameRateWithDen.", this.FrameRateWithDen);
        this.setParamObj(map, prefix + "AiRestoration.", this.AiRestoration);

    }
}


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

public class VideoEnhanceConfig extends AbstractModel {

    /**
    * 
    */
    @SerializedName("EnhanceScenarioType")
    @Expose
    private String EnhanceScenarioType;

    /**
    * 
    */
    @SerializedName("SuperResolution")
    @Expose
    private SuperResolutionInfo SuperResolution;

    /**
    * 
    */
    @SerializedName("Hdr")
    @Expose
    private HDRInfo Hdr;

    /**
    * 
    */
    @SerializedName("Denoise")
    @Expose
    private VideoDenoiseInfo Denoise;

    /**
    * 
    */
    @SerializedName("ImageQualityEnhance")
    @Expose
    private ImageQualityEnhanceInfo ImageQualityEnhance;

    /**
    * 
    */
    @SerializedName("ColorEnhance")
    @Expose
    private ColorEnhanceInfo ColorEnhance;

    /**
    * 
    */
    @SerializedName("LowLightEnhance")
    @Expose
    private LowLightEnhanceInfo LowLightEnhance;

    /**
    * 
    */
    @SerializedName("ScratchRepair")
    @Expose
    private ScratchRepairInfo ScratchRepair;

    /**
    * 
    */
    @SerializedName("ArtifactRepair")
    @Expose
    private ArtifactRepairInfo ArtifactRepair;

    /**
    * 
    */
    @SerializedName("DiffusionEnhance")
    @Expose
    private DiffusionEnhanceInfo DiffusionEnhance;

    /**
    * 
    */
    @SerializedName("FrameRateWithDen")
    @Expose
    private FrameRateWithDenInfo FrameRateWithDen;

    /**
     * Get  
     * @return EnhanceScenarioType 
     */
    public String getEnhanceScenarioType() {
        return this.EnhanceScenarioType;
    }

    /**
     * Set 
     * @param EnhanceScenarioType 
     */
    public void setEnhanceScenarioType(String EnhanceScenarioType) {
        this.EnhanceScenarioType = EnhanceScenarioType;
    }

    /**
     * Get  
     * @return SuperResolution 
     */
    public SuperResolutionInfo getSuperResolution() {
        return this.SuperResolution;
    }

    /**
     * Set 
     * @param SuperResolution 
     */
    public void setSuperResolution(SuperResolutionInfo SuperResolution) {
        this.SuperResolution = SuperResolution;
    }

    /**
     * Get  
     * @return Hdr 
     */
    public HDRInfo getHdr() {
        return this.Hdr;
    }

    /**
     * Set 
     * @param Hdr 
     */
    public void setHdr(HDRInfo Hdr) {
        this.Hdr = Hdr;
    }

    /**
     * Get  
     * @return Denoise 
     */
    public VideoDenoiseInfo getDenoise() {
        return this.Denoise;
    }

    /**
     * Set 
     * @param Denoise 
     */
    public void setDenoise(VideoDenoiseInfo Denoise) {
        this.Denoise = Denoise;
    }

    /**
     * Get  
     * @return ImageQualityEnhance 
     */
    public ImageQualityEnhanceInfo getImageQualityEnhance() {
        return this.ImageQualityEnhance;
    }

    /**
     * Set 
     * @param ImageQualityEnhance 
     */
    public void setImageQualityEnhance(ImageQualityEnhanceInfo ImageQualityEnhance) {
        this.ImageQualityEnhance = ImageQualityEnhance;
    }

    /**
     * Get  
     * @return ColorEnhance 
     */
    public ColorEnhanceInfo getColorEnhance() {
        return this.ColorEnhance;
    }

    /**
     * Set 
     * @param ColorEnhance 
     */
    public void setColorEnhance(ColorEnhanceInfo ColorEnhance) {
        this.ColorEnhance = ColorEnhance;
    }

    /**
     * Get  
     * @return LowLightEnhance 
     */
    public LowLightEnhanceInfo getLowLightEnhance() {
        return this.LowLightEnhance;
    }

    /**
     * Set 
     * @param LowLightEnhance 
     */
    public void setLowLightEnhance(LowLightEnhanceInfo LowLightEnhance) {
        this.LowLightEnhance = LowLightEnhance;
    }

    /**
     * Get  
     * @return ScratchRepair 
     */
    public ScratchRepairInfo getScratchRepair() {
        return this.ScratchRepair;
    }

    /**
     * Set 
     * @param ScratchRepair 
     */
    public void setScratchRepair(ScratchRepairInfo ScratchRepair) {
        this.ScratchRepair = ScratchRepair;
    }

    /**
     * Get  
     * @return ArtifactRepair 
     */
    public ArtifactRepairInfo getArtifactRepair() {
        return this.ArtifactRepair;
    }

    /**
     * Set 
     * @param ArtifactRepair 
     */
    public void setArtifactRepair(ArtifactRepairInfo ArtifactRepair) {
        this.ArtifactRepair = ArtifactRepair;
    }

    /**
     * Get  
     * @return DiffusionEnhance 
     */
    public DiffusionEnhanceInfo getDiffusionEnhance() {
        return this.DiffusionEnhance;
    }

    /**
     * Set 
     * @param DiffusionEnhance 
     */
    public void setDiffusionEnhance(DiffusionEnhanceInfo DiffusionEnhance) {
        this.DiffusionEnhance = DiffusionEnhance;
    }

    /**
     * Get  
     * @return FrameRateWithDen 
     */
    public FrameRateWithDenInfo getFrameRateWithDen() {
        return this.FrameRateWithDen;
    }

    /**
     * Set 
     * @param FrameRateWithDen 
     */
    public void setFrameRateWithDen(FrameRateWithDenInfo FrameRateWithDen) {
        this.FrameRateWithDen = FrameRateWithDen;
    }

    public VideoEnhanceConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoEnhanceConfig(VideoEnhanceConfig source) {
        if (source.EnhanceScenarioType != null) {
            this.EnhanceScenarioType = new String(source.EnhanceScenarioType);
        }
        if (source.SuperResolution != null) {
            this.SuperResolution = new SuperResolutionInfo(source.SuperResolution);
        }
        if (source.Hdr != null) {
            this.Hdr = new HDRInfo(source.Hdr);
        }
        if (source.Denoise != null) {
            this.Denoise = new VideoDenoiseInfo(source.Denoise);
        }
        if (source.ImageQualityEnhance != null) {
            this.ImageQualityEnhance = new ImageQualityEnhanceInfo(source.ImageQualityEnhance);
        }
        if (source.ColorEnhance != null) {
            this.ColorEnhance = new ColorEnhanceInfo(source.ColorEnhance);
        }
        if (source.LowLightEnhance != null) {
            this.LowLightEnhance = new LowLightEnhanceInfo(source.LowLightEnhance);
        }
        if (source.ScratchRepair != null) {
            this.ScratchRepair = new ScratchRepairInfo(source.ScratchRepair);
        }
        if (source.ArtifactRepair != null) {
            this.ArtifactRepair = new ArtifactRepairInfo(source.ArtifactRepair);
        }
        if (source.DiffusionEnhance != null) {
            this.DiffusionEnhance = new DiffusionEnhanceInfo(source.DiffusionEnhance);
        }
        if (source.FrameRateWithDen != null) {
            this.FrameRateWithDen = new FrameRateWithDenInfo(source.FrameRateWithDen);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnhanceScenarioType", this.EnhanceScenarioType);
        this.setParamObj(map, prefix + "SuperResolution.", this.SuperResolution);
        this.setParamObj(map, prefix + "Hdr.", this.Hdr);
        this.setParamObj(map, prefix + "Denoise.", this.Denoise);
        this.setParamObj(map, prefix + "ImageQualityEnhance.", this.ImageQualityEnhance);
        this.setParamObj(map, prefix + "ColorEnhance.", this.ColorEnhance);
        this.setParamObj(map, prefix + "LowLightEnhance.", this.LowLightEnhance);
        this.setParamObj(map, prefix + "ScratchRepair.", this.ScratchRepair);
        this.setParamObj(map, prefix + "ArtifactRepair.", this.ArtifactRepair);
        this.setParamObj(map, prefix + "DiffusionEnhance.", this.DiffusionEnhance);
        this.setParamObj(map, prefix + "FrameRateWithDen.", this.FrameRateWithDen);

    }
}


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
    * Enhancement scenario configuration. Valid values:
<li>common: common enhancement parameters, which are basic optimization parameters suitable for various video types, enhancing overall image quality.</li>
<li>AIGC: overall resolution enhancement. It uses AI technology to improve the overall video resolution and image clarity.</li>
<li>short_play: enhance facial and subtitle details, emphasizing characters' facial expressions and subtitle clarity to improve the viewing experience.</li>
<li>short_video: optimize complex and diverse image quality issues, tailoring quality enhancements for the complex scenarios such as short videos to address various visual issues.</li>
<li>game: fix motion blur and enhance details, with a focus on enhancing the clarity of game details and restoring blurry areas during motions to make the image content during gaming clearer and richer.</li>
<li>HD_movie_series (UHD TV shows and movies) obtains smooth UHD effects. Targeting the demand for UHD video in broadcasting and OTT, it generates Ultra-High-Definition Standard Video at 4K 60fps HDR, supporting broadcasting scenario format standards.</li>
<li>LQ_material: low-definition material/old video restoration. It enhances overall resolution, and solves issues of old videos, such as low resolution, blur, distortion, scratches, and color temperature due to their age.</li>
<li>lecture: live shows, e-commerce, conferences, and lectures. It improves the face display effect and performs specific optimizations, including face region enhancement, noise reduction, and artifacts removal, for scenarios involving human explanation, such as live shows, e-commerce, conferences, and lectures.</li>
<li>Input of a null string indicates that the enhancement scenario is not used.</li>
    */
    @SerializedName("EnhanceScenarioType")
    @Expose
    private String EnhanceScenarioType;

    /**
    * Super-resolution configuration. If the source resolution is higher than the target resolution, the video will not be processed. Note that it cannot be enabled simultaneously with large model enhancement.
    */
    @SerializedName("SuperResolution")
    @Expose
    private SuperResolutionInfo SuperResolution;

    /**
    * HDR configuration.
    */
    @SerializedName("Hdr")
    @Expose
    private HDRInfo Hdr;

    /**
    * Video noise reduction configuration. Note that it cannot be enabled simultaneously with large model enhancement.
    */
    @SerializedName("Denoise")
    @Expose
    private VideoDenoiseInfo Denoise;

    /**
    * Comprehensive enhancement configuration. Note that only one of the three items, large model, comprehensive enhancement, and jitter removal, can be configured.
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
    * Low-light enhancement configuration.
    */
    @SerializedName("LowLightEnhance")
    @Expose
    private LowLightEnhanceInfo LowLightEnhance;

    /**
    * Remove scratch configuration.
    */
    @SerializedName("ScratchRepair")
    @Expose
    private ScratchRepairInfo ScratchRepair;

    /**
    * Artifacts removal configuration. Note that only one of the three items, LLM enhancement, comprehensive enhancement, and artifacts removal, can be configured.
    */
    @SerializedName("ArtifactRepair")
    @Expose
    private ArtifactRepairInfo ArtifactRepair;

    /**
    * Large model enhancement configuration. Note that only one of the three items, large model, comprehensive enhancement, and jitter removal, can be configured. It cannot be enabled simultaneously with super resolution and noise reduction.
    */
    @SerializedName("DiffusionEnhance")
    @Expose
    private DiffusionEnhanceInfo DiffusionEnhance;

    /**
    * Frame interpolation frame rate configuration. Supports fractions. Note that you can only specify either this parameter or FrameRate. The capacity will not take effect when the source frame rate is equal to or greater than the target frame rate.
    */
    @SerializedName("FrameRateWithDen")
    @Expose
    private FrameRateWithDenInfo FrameRateWithDen;

    /**
     * Get Enhancement scenario configuration. Valid values:
<li>common: common enhancement parameters, which are basic optimization parameters suitable for various video types, enhancing overall image quality.</li>
<li>AIGC: overall resolution enhancement. It uses AI technology to improve the overall video resolution and image clarity.</li>
<li>short_play: enhance facial and subtitle details, emphasizing characters' facial expressions and subtitle clarity to improve the viewing experience.</li>
<li>short_video: optimize complex and diverse image quality issues, tailoring quality enhancements for the complex scenarios such as short videos to address various visual issues.</li>
<li>game: fix motion blur and enhance details, with a focus on enhancing the clarity of game details and restoring blurry areas during motions to make the image content during gaming clearer and richer.</li>
<li>HD_movie_series (UHD TV shows and movies) obtains smooth UHD effects. Targeting the demand for UHD video in broadcasting and OTT, it generates Ultra-High-Definition Standard Video at 4K 60fps HDR, supporting broadcasting scenario format standards.</li>
<li>LQ_material: low-definition material/old video restoration. It enhances overall resolution, and solves issues of old videos, such as low resolution, blur, distortion, scratches, and color temperature due to their age.</li>
<li>lecture: live shows, e-commerce, conferences, and lectures. It improves the face display effect and performs specific optimizations, including face region enhancement, noise reduction, and artifacts removal, for scenarios involving human explanation, such as live shows, e-commerce, conferences, and lectures.</li>
<li>Input of a null string indicates that the enhancement scenario is not used.</li> 
     * @return EnhanceScenarioType Enhancement scenario configuration. Valid values:
<li>common: common enhancement parameters, which are basic optimization parameters suitable for various video types, enhancing overall image quality.</li>
<li>AIGC: overall resolution enhancement. It uses AI technology to improve the overall video resolution and image clarity.</li>
<li>short_play: enhance facial and subtitle details, emphasizing characters' facial expressions and subtitle clarity to improve the viewing experience.</li>
<li>short_video: optimize complex and diverse image quality issues, tailoring quality enhancements for the complex scenarios such as short videos to address various visual issues.</li>
<li>game: fix motion blur and enhance details, with a focus on enhancing the clarity of game details and restoring blurry areas during motions to make the image content during gaming clearer and richer.</li>
<li>HD_movie_series (UHD TV shows and movies) obtains smooth UHD effects. Targeting the demand for UHD video in broadcasting and OTT, it generates Ultra-High-Definition Standard Video at 4K 60fps HDR, supporting broadcasting scenario format standards.</li>
<li>LQ_material: low-definition material/old video restoration. It enhances overall resolution, and solves issues of old videos, such as low resolution, blur, distortion, scratches, and color temperature due to their age.</li>
<li>lecture: live shows, e-commerce, conferences, and lectures. It improves the face display effect and performs specific optimizations, including face region enhancement, noise reduction, and artifacts removal, for scenarios involving human explanation, such as live shows, e-commerce, conferences, and lectures.</li>
<li>Input of a null string indicates that the enhancement scenario is not used.</li>
     */
    public String getEnhanceScenarioType() {
        return this.EnhanceScenarioType;
    }

    /**
     * Set Enhancement scenario configuration. Valid values:
<li>common: common enhancement parameters, which are basic optimization parameters suitable for various video types, enhancing overall image quality.</li>
<li>AIGC: overall resolution enhancement. It uses AI technology to improve the overall video resolution and image clarity.</li>
<li>short_play: enhance facial and subtitle details, emphasizing characters' facial expressions and subtitle clarity to improve the viewing experience.</li>
<li>short_video: optimize complex and diverse image quality issues, tailoring quality enhancements for the complex scenarios such as short videos to address various visual issues.</li>
<li>game: fix motion blur and enhance details, with a focus on enhancing the clarity of game details and restoring blurry areas during motions to make the image content during gaming clearer and richer.</li>
<li>HD_movie_series (UHD TV shows and movies) obtains smooth UHD effects. Targeting the demand for UHD video in broadcasting and OTT, it generates Ultra-High-Definition Standard Video at 4K 60fps HDR, supporting broadcasting scenario format standards.</li>
<li>LQ_material: low-definition material/old video restoration. It enhances overall resolution, and solves issues of old videos, such as low resolution, blur, distortion, scratches, and color temperature due to their age.</li>
<li>lecture: live shows, e-commerce, conferences, and lectures. It improves the face display effect and performs specific optimizations, including face region enhancement, noise reduction, and artifacts removal, for scenarios involving human explanation, such as live shows, e-commerce, conferences, and lectures.</li>
<li>Input of a null string indicates that the enhancement scenario is not used.</li>
     * @param EnhanceScenarioType Enhancement scenario configuration. Valid values:
<li>common: common enhancement parameters, which are basic optimization parameters suitable for various video types, enhancing overall image quality.</li>
<li>AIGC: overall resolution enhancement. It uses AI technology to improve the overall video resolution and image clarity.</li>
<li>short_play: enhance facial and subtitle details, emphasizing characters' facial expressions and subtitle clarity to improve the viewing experience.</li>
<li>short_video: optimize complex and diverse image quality issues, tailoring quality enhancements for the complex scenarios such as short videos to address various visual issues.</li>
<li>game: fix motion blur and enhance details, with a focus on enhancing the clarity of game details and restoring blurry areas during motions to make the image content during gaming clearer and richer.</li>
<li>HD_movie_series (UHD TV shows and movies) obtains smooth UHD effects. Targeting the demand for UHD video in broadcasting and OTT, it generates Ultra-High-Definition Standard Video at 4K 60fps HDR, supporting broadcasting scenario format standards.</li>
<li>LQ_material: low-definition material/old video restoration. It enhances overall resolution, and solves issues of old videos, such as low resolution, blur, distortion, scratches, and color temperature due to their age.</li>
<li>lecture: live shows, e-commerce, conferences, and lectures. It improves the face display effect and performs specific optimizations, including face region enhancement, noise reduction, and artifacts removal, for scenarios involving human explanation, such as live shows, e-commerce, conferences, and lectures.</li>
<li>Input of a null string indicates that the enhancement scenario is not used.</li>
     */
    public void setEnhanceScenarioType(String EnhanceScenarioType) {
        this.EnhanceScenarioType = EnhanceScenarioType;
    }

    /**
     * Get Super-resolution configuration. If the source resolution is higher than the target resolution, the video will not be processed. Note that it cannot be enabled simultaneously with large model enhancement. 
     * @return SuperResolution Super-resolution configuration. If the source resolution is higher than the target resolution, the video will not be processed. Note that it cannot be enabled simultaneously with large model enhancement.
     */
    public SuperResolutionInfo getSuperResolution() {
        return this.SuperResolution;
    }

    /**
     * Set Super-resolution configuration. If the source resolution is higher than the target resolution, the video will not be processed. Note that it cannot be enabled simultaneously with large model enhancement.
     * @param SuperResolution Super-resolution configuration. If the source resolution is higher than the target resolution, the video will not be processed. Note that it cannot be enabled simultaneously with large model enhancement.
     */
    public void setSuperResolution(SuperResolutionInfo SuperResolution) {
        this.SuperResolution = SuperResolution;
    }

    /**
     * Get HDR configuration. 
     * @return Hdr HDR configuration.
     */
    public HDRInfo getHdr() {
        return this.Hdr;
    }

    /**
     * Set HDR configuration.
     * @param Hdr HDR configuration.
     */
    public void setHdr(HDRInfo Hdr) {
        this.Hdr = Hdr;
    }

    /**
     * Get Video noise reduction configuration. Note that it cannot be enabled simultaneously with large model enhancement. 
     * @return Denoise Video noise reduction configuration. Note that it cannot be enabled simultaneously with large model enhancement.
     */
    public VideoDenoiseInfo getDenoise() {
        return this.Denoise;
    }

    /**
     * Set Video noise reduction configuration. Note that it cannot be enabled simultaneously with large model enhancement.
     * @param Denoise Video noise reduction configuration. Note that it cannot be enabled simultaneously with large model enhancement.
     */
    public void setDenoise(VideoDenoiseInfo Denoise) {
        this.Denoise = Denoise;
    }

    /**
     * Get Comprehensive enhancement configuration. Note that only one of the three items, large model, comprehensive enhancement, and jitter removal, can be configured. 
     * @return ImageQualityEnhance Comprehensive enhancement configuration. Note that only one of the three items, large model, comprehensive enhancement, and jitter removal, can be configured.
     */
    public ImageQualityEnhanceInfo getImageQualityEnhance() {
        return this.ImageQualityEnhance;
    }

    /**
     * Set Comprehensive enhancement configuration. Note that only one of the three items, large model, comprehensive enhancement, and jitter removal, can be configured.
     * @param ImageQualityEnhance Comprehensive enhancement configuration. Note that only one of the three items, large model, comprehensive enhancement, and jitter removal, can be configured.
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

    /**
     * Get Remove scratch configuration. 
     * @return ScratchRepair Remove scratch configuration.
     */
    public ScratchRepairInfo getScratchRepair() {
        return this.ScratchRepair;
    }

    /**
     * Set Remove scratch configuration.
     * @param ScratchRepair Remove scratch configuration.
     */
    public void setScratchRepair(ScratchRepairInfo ScratchRepair) {
        this.ScratchRepair = ScratchRepair;
    }

    /**
     * Get Artifacts removal configuration. Note that only one of the three items, LLM enhancement, comprehensive enhancement, and artifacts removal, can be configured. 
     * @return ArtifactRepair Artifacts removal configuration. Note that only one of the three items, LLM enhancement, comprehensive enhancement, and artifacts removal, can be configured.
     */
    public ArtifactRepairInfo getArtifactRepair() {
        return this.ArtifactRepair;
    }

    /**
     * Set Artifacts removal configuration. Note that only one of the three items, LLM enhancement, comprehensive enhancement, and artifacts removal, can be configured.
     * @param ArtifactRepair Artifacts removal configuration. Note that only one of the three items, LLM enhancement, comprehensive enhancement, and artifacts removal, can be configured.
     */
    public void setArtifactRepair(ArtifactRepairInfo ArtifactRepair) {
        this.ArtifactRepair = ArtifactRepair;
    }

    /**
     * Get Large model enhancement configuration. Note that only one of the three items, large model, comprehensive enhancement, and jitter removal, can be configured. It cannot be enabled simultaneously with super resolution and noise reduction. 
     * @return DiffusionEnhance Large model enhancement configuration. Note that only one of the three items, large model, comprehensive enhancement, and jitter removal, can be configured. It cannot be enabled simultaneously with super resolution and noise reduction.
     */
    public DiffusionEnhanceInfo getDiffusionEnhance() {
        return this.DiffusionEnhance;
    }

    /**
     * Set Large model enhancement configuration. Note that only one of the three items, large model, comprehensive enhancement, and jitter removal, can be configured. It cannot be enabled simultaneously with super resolution and noise reduction.
     * @param DiffusionEnhance Large model enhancement configuration. Note that only one of the three items, large model, comprehensive enhancement, and jitter removal, can be configured. It cannot be enabled simultaneously with super resolution and noise reduction.
     */
    public void setDiffusionEnhance(DiffusionEnhanceInfo DiffusionEnhance) {
        this.DiffusionEnhance = DiffusionEnhance;
    }

    /**
     * Get Frame interpolation frame rate configuration. Supports fractions. Note that you can only specify either this parameter or FrameRate. The capacity will not take effect when the source frame rate is equal to or greater than the target frame rate. 
     * @return FrameRateWithDen Frame interpolation frame rate configuration. Supports fractions. Note that you can only specify either this parameter or FrameRate. The capacity will not take effect when the source frame rate is equal to or greater than the target frame rate.
     */
    public FrameRateWithDenInfo getFrameRateWithDen() {
        return this.FrameRateWithDen;
    }

    /**
     * Set Frame interpolation frame rate configuration. Supports fractions. Note that you can only specify either this parameter or FrameRate. The capacity will not take effect when the source frame rate is equal to or greater than the target frame rate.
     * @param FrameRateWithDen Frame interpolation frame rate configuration. Supports fractions. Note that you can only specify either this parameter or FrameRate. The capacity will not take effect when the source frame rate is equal to or greater than the target frame rate.
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


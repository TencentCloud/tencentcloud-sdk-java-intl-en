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
    * Frame rate configuration (old) for the frame interpolation. New users are recommended to use FrameRateWithDen for configuring the frame rate of frame interpolation, which supports fractions and provides better results. Note that FrameRate and FrameRateWithDen are mutually exclusive; configuring both simultaneously may cause task failures. The configuration does not take effect if the source frame rate is greater than or equal to the target frame rate.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FrameRate")
    @Expose
    private FrameRateConfig FrameRate;

    /**
    * Super-resolution configuration. The video is not processed when the source resolution is higher than the target resolution. Note that it cannot be enabled simultaneously with Large Model enhancement.
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
    * Video noise reduction configuration. Note that it cannot be enabled simultaneously with LLM enhancement.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Denoise")
    @Expose
    private VideoDenoiseConfig Denoise;

    /**
    * Comprehensive enhancement configuration. Note that only one of the three items, LLM enhancement, comprehensive enhancement, and artifacts removal, can be configured.
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
    * Artifacts removal configuration. Note that only one of the three items, LLM enhancement, comprehensive enhancement, and artifacts removal, can be configured.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ArtifactRepair")
    @Expose
    private ArtifactRepairConfig ArtifactRepair;

    /**
    * Enhancement scenario configuration. Valid values:
<li>common: common enhancement parameters, which are basic optimization parameters suitable for various video types, enhancing overall image quality.</li>
<li>AIGC: overall resolution enhancement. It uses AI technology to improve the overall video resolution and image clarity.</li>
<li>short_play: enhance facial and subtitle details, emphasizing characters' facial expressions and subtitle clarity to improve the viewing experience.</li>
<li>short_video: optimize complex and diverse image quality issues, tailoring quality enhancements for the complex scenarios such as short videos to address various visual issues.</li>
<li>game: fix motion blur and enhance details, with a focus on enhancing the clarity of game details and restoring blurry areas during motions to make the image content during gaming clearer and richer.</li>
<li>HD_movie_series: provide a smooth playback effect for UHD videos. Standard 4K HDR videos with an FPS of 60 are generated to meet the needs of broadcasting/OTT for UHD videos. Formats for broadcasting scenarios are supported.</li>
<li>LQ_material: low-definition material/old video restoration. It enhances overall resolution, and solves issues of old videos, such as low resolution, blur, distortion, scratches, and color temperature due to their age.</li>
<li>lecture: live shows, e-commerce, conferences, and lectures. It improves the face display effect and performs specific optimizations, including face region enhancement, noise reduction, and artifacts removal, for scenarios involving human explanation, such as live shows, e-commerce, conferences, and lectures.</li>
<li>Input of a null string indicates that the enhancement scenario is not used.</li>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EnhanceSceneType")
    @Expose
    private String EnhanceSceneType;

    /**
    * Large Model enhancement configuration. Note that only one of the three items, LLM enhancement, comprehensive enhancement, and artifacts removal, can be configured. It cannot be enabled simultaneously with super-resolution and noise reduction.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DiffusionEnhance")
    @Expose
    private DiffusionEnhanceConfig DiffusionEnhance;

    /**
    * New frame rate configuration for the frame interpolation, which supports fractions. Note that it is mutually exclusive with FrameRate. The configuration does not take effect if the source frame rate is greater than or equal to the target frame rate.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FrameRateWithDen")
    @Expose
    private FrameRateWithDenConfig FrameRateWithDen;

    /**
     * Get Frame rate configuration (old) for the frame interpolation. New users are recommended to use FrameRateWithDen for configuring the frame rate of frame interpolation, which supports fractions and provides better results. Note that FrameRate and FrameRateWithDen are mutually exclusive; configuring both simultaneously may cause task failures. The configuration does not take effect if the source frame rate is greater than or equal to the target frame rate.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FrameRate Frame rate configuration (old) for the frame interpolation. New users are recommended to use FrameRateWithDen for configuring the frame rate of frame interpolation, which supports fractions and provides better results. Note that FrameRate and FrameRateWithDen are mutually exclusive; configuring both simultaneously may cause task failures. The configuration does not take effect if the source frame rate is greater than or equal to the target frame rate.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public FrameRateConfig getFrameRate() {
        return this.FrameRate;
    }

    /**
     * Set Frame rate configuration (old) for the frame interpolation. New users are recommended to use FrameRateWithDen for configuring the frame rate of frame interpolation, which supports fractions and provides better results. Note that FrameRate and FrameRateWithDen are mutually exclusive; configuring both simultaneously may cause task failures. The configuration does not take effect if the source frame rate is greater than or equal to the target frame rate.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FrameRate Frame rate configuration (old) for the frame interpolation. New users are recommended to use FrameRateWithDen for configuring the frame rate of frame interpolation, which supports fractions and provides better results. Note that FrameRate and FrameRateWithDen are mutually exclusive; configuring both simultaneously may cause task failures. The configuration does not take effect if the source frame rate is greater than or equal to the target frame rate.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFrameRate(FrameRateConfig FrameRate) {
        this.FrameRate = FrameRate;
    }

    /**
     * Get Super-resolution configuration. The video is not processed when the source resolution is higher than the target resolution. Note that it cannot be enabled simultaneously with Large Model enhancement.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SuperResolution Super-resolution configuration. The video is not processed when the source resolution is higher than the target resolution. Note that it cannot be enabled simultaneously with Large Model enhancement.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SuperResolutionConfig getSuperResolution() {
        return this.SuperResolution;
    }

    /**
     * Set Super-resolution configuration. The video is not processed when the source resolution is higher than the target resolution. Note that it cannot be enabled simultaneously with Large Model enhancement.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SuperResolution Super-resolution configuration. The video is not processed when the source resolution is higher than the target resolution. Note that it cannot be enabled simultaneously with Large Model enhancement.
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
     * Get Video noise reduction configuration. Note that it cannot be enabled simultaneously with LLM enhancement.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Denoise Video noise reduction configuration. Note that it cannot be enabled simultaneously with LLM enhancement.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public VideoDenoiseConfig getDenoise() {
        return this.Denoise;
    }

    /**
     * Set Video noise reduction configuration. Note that it cannot be enabled simultaneously with LLM enhancement.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Denoise Video noise reduction configuration. Note that it cannot be enabled simultaneously with LLM enhancement.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDenoise(VideoDenoiseConfig Denoise) {
        this.Denoise = Denoise;
    }

    /**
     * Get Comprehensive enhancement configuration. Note that only one of the three items, LLM enhancement, comprehensive enhancement, and artifacts removal, can be configured.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ImageQualityEnhance Comprehensive enhancement configuration. Note that only one of the three items, LLM enhancement, comprehensive enhancement, and artifacts removal, can be configured.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ImageQualityEnhanceConfig getImageQualityEnhance() {
        return this.ImageQualityEnhance;
    }

    /**
     * Set Comprehensive enhancement configuration. Note that only one of the three items, LLM enhancement, comprehensive enhancement, and artifacts removal, can be configured.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ImageQualityEnhance Comprehensive enhancement configuration. Note that only one of the three items, LLM enhancement, comprehensive enhancement, and artifacts removal, can be configured.
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
     * Get Artifacts removal configuration. Note that only one of the three items, LLM enhancement, comprehensive enhancement, and artifacts removal, can be configured.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ArtifactRepair Artifacts removal configuration. Note that only one of the three items, LLM enhancement, comprehensive enhancement, and artifacts removal, can be configured.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ArtifactRepairConfig getArtifactRepair() {
        return this.ArtifactRepair;
    }

    /**
     * Set Artifacts removal configuration. Note that only one of the three items, LLM enhancement, comprehensive enhancement, and artifacts removal, can be configured.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ArtifactRepair Artifacts removal configuration. Note that only one of the three items, LLM enhancement, comprehensive enhancement, and artifacts removal, can be configured.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setArtifactRepair(ArtifactRepairConfig ArtifactRepair) {
        this.ArtifactRepair = ArtifactRepair;
    }

    /**
     * Get Enhancement scenario configuration. Valid values:
<li>common: common enhancement parameters, which are basic optimization parameters suitable for various video types, enhancing overall image quality.</li>
<li>AIGC: overall resolution enhancement. It uses AI technology to improve the overall video resolution and image clarity.</li>
<li>short_play: enhance facial and subtitle details, emphasizing characters' facial expressions and subtitle clarity to improve the viewing experience.</li>
<li>short_video: optimize complex and diverse image quality issues, tailoring quality enhancements for the complex scenarios such as short videos to address various visual issues.</li>
<li>game: fix motion blur and enhance details, with a focus on enhancing the clarity of game details and restoring blurry areas during motions to make the image content during gaming clearer and richer.</li>
<li>HD_movie_series: provide a smooth playback effect for UHD videos. Standard 4K HDR videos with an FPS of 60 are generated to meet the needs of broadcasting/OTT for UHD videos. Formats for broadcasting scenarios are supported.</li>
<li>LQ_material: low-definition material/old video restoration. It enhances overall resolution, and solves issues of old videos, such as low resolution, blur, distortion, scratches, and color temperature due to their age.</li>
<li>lecture: live shows, e-commerce, conferences, and lectures. It improves the face display effect and performs specific optimizations, including face region enhancement, noise reduction, and artifacts removal, for scenarios involving human explanation, such as live shows, e-commerce, conferences, and lectures.</li>
<li>Input of a null string indicates that the enhancement scenario is not used.</li>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EnhanceSceneType Enhancement scenario configuration. Valid values:
<li>common: common enhancement parameters, which are basic optimization parameters suitable for various video types, enhancing overall image quality.</li>
<li>AIGC: overall resolution enhancement. It uses AI technology to improve the overall video resolution and image clarity.</li>
<li>short_play: enhance facial and subtitle details, emphasizing characters' facial expressions and subtitle clarity to improve the viewing experience.</li>
<li>short_video: optimize complex and diverse image quality issues, tailoring quality enhancements for the complex scenarios such as short videos to address various visual issues.</li>
<li>game: fix motion blur and enhance details, with a focus on enhancing the clarity of game details and restoring blurry areas during motions to make the image content during gaming clearer and richer.</li>
<li>HD_movie_series: provide a smooth playback effect for UHD videos. Standard 4K HDR videos with an FPS of 60 are generated to meet the needs of broadcasting/OTT for UHD videos. Formats for broadcasting scenarios are supported.</li>
<li>LQ_material: low-definition material/old video restoration. It enhances overall resolution, and solves issues of old videos, such as low resolution, blur, distortion, scratches, and color temperature due to their age.</li>
<li>lecture: live shows, e-commerce, conferences, and lectures. It improves the face display effect and performs specific optimizations, including face region enhancement, noise reduction, and artifacts removal, for scenarios involving human explanation, such as live shows, e-commerce, conferences, and lectures.</li>
<li>Input of a null string indicates that the enhancement scenario is not used.</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEnhanceSceneType() {
        return this.EnhanceSceneType;
    }

    /**
     * Set Enhancement scenario configuration. Valid values:
<li>common: common enhancement parameters, which are basic optimization parameters suitable for various video types, enhancing overall image quality.</li>
<li>AIGC: overall resolution enhancement. It uses AI technology to improve the overall video resolution and image clarity.</li>
<li>short_play: enhance facial and subtitle details, emphasizing characters' facial expressions and subtitle clarity to improve the viewing experience.</li>
<li>short_video: optimize complex and diverse image quality issues, tailoring quality enhancements for the complex scenarios such as short videos to address various visual issues.</li>
<li>game: fix motion blur and enhance details, with a focus on enhancing the clarity of game details and restoring blurry areas during motions to make the image content during gaming clearer and richer.</li>
<li>HD_movie_series: provide a smooth playback effect for UHD videos. Standard 4K HDR videos with an FPS of 60 are generated to meet the needs of broadcasting/OTT for UHD videos. Formats for broadcasting scenarios are supported.</li>
<li>LQ_material: low-definition material/old video restoration. It enhances overall resolution, and solves issues of old videos, such as low resolution, blur, distortion, scratches, and color temperature due to their age.</li>
<li>lecture: live shows, e-commerce, conferences, and lectures. It improves the face display effect and performs specific optimizations, including face region enhancement, noise reduction, and artifacts removal, for scenarios involving human explanation, such as live shows, e-commerce, conferences, and lectures.</li>
<li>Input of a null string indicates that the enhancement scenario is not used.</li>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EnhanceSceneType Enhancement scenario configuration. Valid values:
<li>common: common enhancement parameters, which are basic optimization parameters suitable for various video types, enhancing overall image quality.</li>
<li>AIGC: overall resolution enhancement. It uses AI technology to improve the overall video resolution and image clarity.</li>
<li>short_play: enhance facial and subtitle details, emphasizing characters' facial expressions and subtitle clarity to improve the viewing experience.</li>
<li>short_video: optimize complex and diverse image quality issues, tailoring quality enhancements for the complex scenarios such as short videos to address various visual issues.</li>
<li>game: fix motion blur and enhance details, with a focus on enhancing the clarity of game details and restoring blurry areas during motions to make the image content during gaming clearer and richer.</li>
<li>HD_movie_series: provide a smooth playback effect for UHD videos. Standard 4K HDR videos with an FPS of 60 are generated to meet the needs of broadcasting/OTT for UHD videos. Formats for broadcasting scenarios are supported.</li>
<li>LQ_material: low-definition material/old video restoration. It enhances overall resolution, and solves issues of old videos, such as low resolution, blur, distortion, scratches, and color temperature due to their age.</li>
<li>lecture: live shows, e-commerce, conferences, and lectures. It improves the face display effect and performs specific optimizations, including face region enhancement, noise reduction, and artifacts removal, for scenarios involving human explanation, such as live shows, e-commerce, conferences, and lectures.</li>
<li>Input of a null string indicates that the enhancement scenario is not used.</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEnhanceSceneType(String EnhanceSceneType) {
        this.EnhanceSceneType = EnhanceSceneType;
    }

    /**
     * Get Large Model enhancement configuration. Note that only one of the three items, LLM enhancement, comprehensive enhancement, and artifacts removal, can be configured. It cannot be enabled simultaneously with super-resolution and noise reduction.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DiffusionEnhance Large Model enhancement configuration. Note that only one of the three items, LLM enhancement, comprehensive enhancement, and artifacts removal, can be configured. It cannot be enabled simultaneously with super-resolution and noise reduction.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DiffusionEnhanceConfig getDiffusionEnhance() {
        return this.DiffusionEnhance;
    }

    /**
     * Set Large Model enhancement configuration. Note that only one of the three items, LLM enhancement, comprehensive enhancement, and artifacts removal, can be configured. It cannot be enabled simultaneously with super-resolution and noise reduction.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DiffusionEnhance Large Model enhancement configuration. Note that only one of the three items, LLM enhancement, comprehensive enhancement, and artifacts removal, can be configured. It cannot be enabled simultaneously with super-resolution and noise reduction.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDiffusionEnhance(DiffusionEnhanceConfig DiffusionEnhance) {
        this.DiffusionEnhance = DiffusionEnhance;
    }

    /**
     * Get New frame rate configuration for the frame interpolation, which supports fractions. Note that it is mutually exclusive with FrameRate. The configuration does not take effect if the source frame rate is greater than or equal to the target frame rate.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FrameRateWithDen New frame rate configuration for the frame interpolation, which supports fractions. Note that it is mutually exclusive with FrameRate. The configuration does not take effect if the source frame rate is greater than or equal to the target frame rate.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public FrameRateWithDenConfig getFrameRateWithDen() {
        return this.FrameRateWithDen;
    }

    /**
     * Set New frame rate configuration for the frame interpolation, which supports fractions. Note that it is mutually exclusive with FrameRate. The configuration does not take effect if the source frame rate is greater than or equal to the target frame rate.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FrameRateWithDen New frame rate configuration for the frame interpolation, which supports fractions. Note that it is mutually exclusive with FrameRate. The configuration does not take effect if the source frame rate is greater than or equal to the target frame rate.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFrameRateWithDen(FrameRateWithDenConfig FrameRateWithDen) {
        this.FrameRateWithDen = FrameRateWithDen;
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

    }
}


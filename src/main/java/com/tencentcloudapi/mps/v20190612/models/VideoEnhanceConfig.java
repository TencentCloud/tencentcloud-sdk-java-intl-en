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
    * <p>Frame rate configuration (old) for the frame interpolation. New users are recommended to use FrameRateWithDen for configuring the frame rate of frame interpolation, which supports fractions and provides better results. Note that FrameRate and FrameRateWithDen are mutually exclusive; configuring both simultaneously may cause task failures. The configuration does not take effect if the source frame rate is greater than or equal to the target frame rate.</p>
    */
    @SerializedName("FrameRate")
    @Expose
    private FrameRateConfig FrameRate;

    /**
    * <p>Super-resolution configuration. The video is not processed when the source resolution is higher than the target resolution. Note that it cannot be enabled simultaneously with LLM enhancement.</p>
    */
    @SerializedName("SuperResolution")
    @Expose
    private SuperResolutionConfig SuperResolution;

    /**
    * <p>HDR configuration.</p>
    */
    @SerializedName("Hdr")
    @Expose
    private HdrConfig Hdr;

    /**
    * <p>Video noise reduction configuration. Note that it cannot be enabled simultaneously with LLM enhancement.</p>
    */
    @SerializedName("Denoise")
    @Expose
    private VideoDenoiseConfig Denoise;

    /**
    * <p>Comprehensive enhancement configuration. Note that only one of the three items, LLM enhancement, comprehensive enhancement, and artifacts removal, can be configured.</p>
    */
    @SerializedName("ImageQualityEnhance")
    @Expose
    private ImageQualityEnhanceConfig ImageQualityEnhance;

    /**
    * <p>Color enhancement configuration.</p>
    */
    @SerializedName("ColorEnhance")
    @Expose
    private ColorEnhanceConfig ColorEnhance;

    /**
    * <p>Low-light enhancement configuration.</p>
    */
    @SerializedName("LowLightEnhance")
    @Expose
    private LowLightEnhanceConfig LowLightEnhance;

    /**
    * <p>Scratches removal configuration.</p>
    */
    @SerializedName("ScratchRepair")
    @Expose
    private ScratchRepairConfig ScratchRepair;

    /**
    * <p>Artifacts removal configuration. Note that only one of the three items, LLM enhancement, comprehensive enhancement, and artifacts removal, can be configured.</p>
    */
    @SerializedName("ArtifactRepair")
    @Expose
    private ArtifactRepairConfig ArtifactRepair;

    /**
    * <p>Enhanced scenario configuration, available values:</p><li>common (General), general enhancement parameter, suitable for various video types, foundation optimization parameters, enhance overall video quality.</li><li>AIGC, overall resolution enhancement, use AI technology to enhance video overall resolution, improve image definition.</li><li>short_play (Mini-drama & AI simulation drama), enhance face and subtitle details, highlight facial expression details and subtitle clarity, improve viewing experience.</li><li>AI_comic (AI comic drama), enhance comic style image detail.</li><li>short_video (short video), optimize complex and diverse image quality issues, target complex scenarios in short videos, optimize video quality, address multiple visual issues.</li><li>game (Gaming video), restore motion blur, enhance details, focus on enhancing the clarity of game details, restore motion blur areas, make the game screen content clearer and more various.</li><li>HD_movie_series (Ultra-high-definition TV shows and movies), obtain ultra-high-definition smooth effect, target the demand for broadcasting/OTT ultra-high-definition video, generate 4K 60fps HDR Ultra-High-Definition Standard video. Support broadcasting scenario format standards.</li><li>LQ_material (Low-quality material/Classic film restoration), overall resolution enhancement, target old video with insufficient resolution, blur distortion, scratch damage and color temperature issues due to older shooting era for specialized optimization.</li><li>lecture (Showroom/E-commerce/Conference/lecture), beautify and enhance face effect, target scenarios where people explain in showroom/e-commerce/conference/lecture, perform specialized optimization for face region, noise reduction, burr processing.</li><li>Fill-in string represents non-use of enhanced scenario.</li>
    */
    @SerializedName("EnhanceSceneType")
    @Expose
    private String EnhanceSceneType;

    /**
    * <p>LLM enhancement configuration. Note that only one of the three items, LLM enhancement, comprehensive enhancement, and artifacts removal, can be configured. It cannot intersect with super-resolution and noise reduction.</p>
    */
    @SerializedName("DiffusionEnhance")
    @Expose
    private DiffusionEnhanceConfig DiffusionEnhance;

    /**
    * <p>The new frame interpolation frame rate configuration supports fractions. Note that you must choose between this and FrameRate. The capacity will not take effect when the source frame rate is equal to or greater than the target frame rate.</p>
    */
    @SerializedName("FrameRateWithDen")
    @Expose
    private FrameRateWithDenConfig FrameRateWithDen;

    /**
    * <p>Large model repair configuration. Note that you can configure at most one of large model, comprehensive enhancement, and artifacts removal. It cannot intersect with super-resolution and noise reduction.</p>
    */
    @SerializedName("AiRestoration")
    @Expose
    private AiRestorationConfig AiRestoration;

    /**
     * Get <p>Frame rate configuration (old) for the frame interpolation. New users are recommended to use FrameRateWithDen for configuring the frame rate of frame interpolation, which supports fractions and provides better results. Note that FrameRate and FrameRateWithDen are mutually exclusive; configuring both simultaneously may cause task failures. The configuration does not take effect if the source frame rate is greater than or equal to the target frame rate.</p> 
     * @return FrameRate <p>Frame rate configuration (old) for the frame interpolation. New users are recommended to use FrameRateWithDen for configuring the frame rate of frame interpolation, which supports fractions and provides better results. Note that FrameRate and FrameRateWithDen are mutually exclusive; configuring both simultaneously may cause task failures. The configuration does not take effect if the source frame rate is greater than or equal to the target frame rate.</p>
     */
    public FrameRateConfig getFrameRate() {
        return this.FrameRate;
    }

    /**
     * Set <p>Frame rate configuration (old) for the frame interpolation. New users are recommended to use FrameRateWithDen for configuring the frame rate of frame interpolation, which supports fractions and provides better results. Note that FrameRate and FrameRateWithDen are mutually exclusive; configuring both simultaneously may cause task failures. The configuration does not take effect if the source frame rate is greater than or equal to the target frame rate.</p>
     * @param FrameRate <p>Frame rate configuration (old) for the frame interpolation. New users are recommended to use FrameRateWithDen for configuring the frame rate of frame interpolation, which supports fractions and provides better results. Note that FrameRate and FrameRateWithDen are mutually exclusive; configuring both simultaneously may cause task failures. The configuration does not take effect if the source frame rate is greater than or equal to the target frame rate.</p>
     */
    public void setFrameRate(FrameRateConfig FrameRate) {
        this.FrameRate = FrameRate;
    }

    /**
     * Get <p>Super-resolution configuration. The video is not processed when the source resolution is higher than the target resolution. Note that it cannot be enabled simultaneously with LLM enhancement.</p> 
     * @return SuperResolution <p>Super-resolution configuration. The video is not processed when the source resolution is higher than the target resolution. Note that it cannot be enabled simultaneously with LLM enhancement.</p>
     */
    public SuperResolutionConfig getSuperResolution() {
        return this.SuperResolution;
    }

    /**
     * Set <p>Super-resolution configuration. The video is not processed when the source resolution is higher than the target resolution. Note that it cannot be enabled simultaneously with LLM enhancement.</p>
     * @param SuperResolution <p>Super-resolution configuration. The video is not processed when the source resolution is higher than the target resolution. Note that it cannot be enabled simultaneously with LLM enhancement.</p>
     */
    public void setSuperResolution(SuperResolutionConfig SuperResolution) {
        this.SuperResolution = SuperResolution;
    }

    /**
     * Get <p>HDR configuration.</p> 
     * @return Hdr <p>HDR configuration.</p>
     */
    public HdrConfig getHdr() {
        return this.Hdr;
    }

    /**
     * Set <p>HDR configuration.</p>
     * @param Hdr <p>HDR configuration.</p>
     */
    public void setHdr(HdrConfig Hdr) {
        this.Hdr = Hdr;
    }

    /**
     * Get <p>Video noise reduction configuration. Note that it cannot be enabled simultaneously with LLM enhancement.</p> 
     * @return Denoise <p>Video noise reduction configuration. Note that it cannot be enabled simultaneously with LLM enhancement.</p>
     */
    public VideoDenoiseConfig getDenoise() {
        return this.Denoise;
    }

    /**
     * Set <p>Video noise reduction configuration. Note that it cannot be enabled simultaneously with LLM enhancement.</p>
     * @param Denoise <p>Video noise reduction configuration. Note that it cannot be enabled simultaneously with LLM enhancement.</p>
     */
    public void setDenoise(VideoDenoiseConfig Denoise) {
        this.Denoise = Denoise;
    }

    /**
     * Get <p>Comprehensive enhancement configuration. Note that only one of the three items, LLM enhancement, comprehensive enhancement, and artifacts removal, can be configured.</p> 
     * @return ImageQualityEnhance <p>Comprehensive enhancement configuration. Note that only one of the three items, LLM enhancement, comprehensive enhancement, and artifacts removal, can be configured.</p>
     */
    public ImageQualityEnhanceConfig getImageQualityEnhance() {
        return this.ImageQualityEnhance;
    }

    /**
     * Set <p>Comprehensive enhancement configuration. Note that only one of the three items, LLM enhancement, comprehensive enhancement, and artifacts removal, can be configured.</p>
     * @param ImageQualityEnhance <p>Comprehensive enhancement configuration. Note that only one of the three items, LLM enhancement, comprehensive enhancement, and artifacts removal, can be configured.</p>
     */
    public void setImageQualityEnhance(ImageQualityEnhanceConfig ImageQualityEnhance) {
        this.ImageQualityEnhance = ImageQualityEnhance;
    }

    /**
     * Get <p>Color enhancement configuration.</p> 
     * @return ColorEnhance <p>Color enhancement configuration.</p>
     */
    public ColorEnhanceConfig getColorEnhance() {
        return this.ColorEnhance;
    }

    /**
     * Set <p>Color enhancement configuration.</p>
     * @param ColorEnhance <p>Color enhancement configuration.</p>
     */
    public void setColorEnhance(ColorEnhanceConfig ColorEnhance) {
        this.ColorEnhance = ColorEnhance;
    }

    /**
     * Get <p>Low-light enhancement configuration.</p> 
     * @return LowLightEnhance <p>Low-light enhancement configuration.</p>
     */
    public LowLightEnhanceConfig getLowLightEnhance() {
        return this.LowLightEnhance;
    }

    /**
     * Set <p>Low-light enhancement configuration.</p>
     * @param LowLightEnhance <p>Low-light enhancement configuration.</p>
     */
    public void setLowLightEnhance(LowLightEnhanceConfig LowLightEnhance) {
        this.LowLightEnhance = LowLightEnhance;
    }

    /**
     * Get <p>Scratches removal configuration.</p> 
     * @return ScratchRepair <p>Scratches removal configuration.</p>
     */
    public ScratchRepairConfig getScratchRepair() {
        return this.ScratchRepair;
    }

    /**
     * Set <p>Scratches removal configuration.</p>
     * @param ScratchRepair <p>Scratches removal configuration.</p>
     */
    public void setScratchRepair(ScratchRepairConfig ScratchRepair) {
        this.ScratchRepair = ScratchRepair;
    }

    /**
     * Get <p>Artifacts removal configuration. Note that only one of the three items, LLM enhancement, comprehensive enhancement, and artifacts removal, can be configured.</p> 
     * @return ArtifactRepair <p>Artifacts removal configuration. Note that only one of the three items, LLM enhancement, comprehensive enhancement, and artifacts removal, can be configured.</p>
     */
    public ArtifactRepairConfig getArtifactRepair() {
        return this.ArtifactRepair;
    }

    /**
     * Set <p>Artifacts removal configuration. Note that only one of the three items, LLM enhancement, comprehensive enhancement, and artifacts removal, can be configured.</p>
     * @param ArtifactRepair <p>Artifacts removal configuration. Note that only one of the three items, LLM enhancement, comprehensive enhancement, and artifacts removal, can be configured.</p>
     */
    public void setArtifactRepair(ArtifactRepairConfig ArtifactRepair) {
        this.ArtifactRepair = ArtifactRepair;
    }

    /**
     * Get <p>Enhanced scenario configuration, available values:</p><li>common (General), general enhancement parameter, suitable for various video types, foundation optimization parameters, enhance overall video quality.</li><li>AIGC, overall resolution enhancement, use AI technology to enhance video overall resolution, improve image definition.</li><li>short_play (Mini-drama & AI simulation drama), enhance face and subtitle details, highlight facial expression details and subtitle clarity, improve viewing experience.</li><li>AI_comic (AI comic drama), enhance comic style image detail.</li><li>short_video (short video), optimize complex and diverse image quality issues, target complex scenarios in short videos, optimize video quality, address multiple visual issues.</li><li>game (Gaming video), restore motion blur, enhance details, focus on enhancing the clarity of game details, restore motion blur areas, make the game screen content clearer and more various.</li><li>HD_movie_series (Ultra-high-definition TV shows and movies), obtain ultra-high-definition smooth effect, target the demand for broadcasting/OTT ultra-high-definition video, generate 4K 60fps HDR Ultra-High-Definition Standard video. Support broadcasting scenario format standards.</li><li>LQ_material (Low-quality material/Classic film restoration), overall resolution enhancement, target old video with insufficient resolution, blur distortion, scratch damage and color temperature issues due to older shooting era for specialized optimization.</li><li>lecture (Showroom/E-commerce/Conference/lecture), beautify and enhance face effect, target scenarios where people explain in showroom/e-commerce/conference/lecture, perform specialized optimization for face region, noise reduction, burr processing.</li><li>Fill-in string represents non-use of enhanced scenario.</li> 
     * @return EnhanceSceneType <p>Enhanced scenario configuration, available values:</p><li>common (General), general enhancement parameter, suitable for various video types, foundation optimization parameters, enhance overall video quality.</li><li>AIGC, overall resolution enhancement, use AI technology to enhance video overall resolution, improve image definition.</li><li>short_play (Mini-drama & AI simulation drama), enhance face and subtitle details, highlight facial expression details and subtitle clarity, improve viewing experience.</li><li>AI_comic (AI comic drama), enhance comic style image detail.</li><li>short_video (short video), optimize complex and diverse image quality issues, target complex scenarios in short videos, optimize video quality, address multiple visual issues.</li><li>game (Gaming video), restore motion blur, enhance details, focus on enhancing the clarity of game details, restore motion blur areas, make the game screen content clearer and more various.</li><li>HD_movie_series (Ultra-high-definition TV shows and movies), obtain ultra-high-definition smooth effect, target the demand for broadcasting/OTT ultra-high-definition video, generate 4K 60fps HDR Ultra-High-Definition Standard video. Support broadcasting scenario format standards.</li><li>LQ_material (Low-quality material/Classic film restoration), overall resolution enhancement, target old video with insufficient resolution, blur distortion, scratch damage and color temperature issues due to older shooting era for specialized optimization.</li><li>lecture (Showroom/E-commerce/Conference/lecture), beautify and enhance face effect, target scenarios where people explain in showroom/e-commerce/conference/lecture, perform specialized optimization for face region, noise reduction, burr processing.</li><li>Fill-in string represents non-use of enhanced scenario.</li>
     */
    public String getEnhanceSceneType() {
        return this.EnhanceSceneType;
    }

    /**
     * Set <p>Enhanced scenario configuration, available values:</p><li>common (General), general enhancement parameter, suitable for various video types, foundation optimization parameters, enhance overall video quality.</li><li>AIGC, overall resolution enhancement, use AI technology to enhance video overall resolution, improve image definition.</li><li>short_play (Mini-drama & AI simulation drama), enhance face and subtitle details, highlight facial expression details and subtitle clarity, improve viewing experience.</li><li>AI_comic (AI comic drama), enhance comic style image detail.</li><li>short_video (short video), optimize complex and diverse image quality issues, target complex scenarios in short videos, optimize video quality, address multiple visual issues.</li><li>game (Gaming video), restore motion blur, enhance details, focus on enhancing the clarity of game details, restore motion blur areas, make the game screen content clearer and more various.</li><li>HD_movie_series (Ultra-high-definition TV shows and movies), obtain ultra-high-definition smooth effect, target the demand for broadcasting/OTT ultra-high-definition video, generate 4K 60fps HDR Ultra-High-Definition Standard video. Support broadcasting scenario format standards.</li><li>LQ_material (Low-quality material/Classic film restoration), overall resolution enhancement, target old video with insufficient resolution, blur distortion, scratch damage and color temperature issues due to older shooting era for specialized optimization.</li><li>lecture (Showroom/E-commerce/Conference/lecture), beautify and enhance face effect, target scenarios where people explain in showroom/e-commerce/conference/lecture, perform specialized optimization for face region, noise reduction, burr processing.</li><li>Fill-in string represents non-use of enhanced scenario.</li>
     * @param EnhanceSceneType <p>Enhanced scenario configuration, available values:</p><li>common (General), general enhancement parameter, suitable for various video types, foundation optimization parameters, enhance overall video quality.</li><li>AIGC, overall resolution enhancement, use AI technology to enhance video overall resolution, improve image definition.</li><li>short_play (Mini-drama & AI simulation drama), enhance face and subtitle details, highlight facial expression details and subtitle clarity, improve viewing experience.</li><li>AI_comic (AI comic drama), enhance comic style image detail.</li><li>short_video (short video), optimize complex and diverse image quality issues, target complex scenarios in short videos, optimize video quality, address multiple visual issues.</li><li>game (Gaming video), restore motion blur, enhance details, focus on enhancing the clarity of game details, restore motion blur areas, make the game screen content clearer and more various.</li><li>HD_movie_series (Ultra-high-definition TV shows and movies), obtain ultra-high-definition smooth effect, target the demand for broadcasting/OTT ultra-high-definition video, generate 4K 60fps HDR Ultra-High-Definition Standard video. Support broadcasting scenario format standards.</li><li>LQ_material (Low-quality material/Classic film restoration), overall resolution enhancement, target old video with insufficient resolution, blur distortion, scratch damage and color temperature issues due to older shooting era for specialized optimization.</li><li>lecture (Showroom/E-commerce/Conference/lecture), beautify and enhance face effect, target scenarios where people explain in showroom/e-commerce/conference/lecture, perform specialized optimization for face region, noise reduction, burr processing.</li><li>Fill-in string represents non-use of enhanced scenario.</li>
     */
    public void setEnhanceSceneType(String EnhanceSceneType) {
        this.EnhanceSceneType = EnhanceSceneType;
    }

    /**
     * Get <p>LLM enhancement configuration. Note that only one of the three items, LLM enhancement, comprehensive enhancement, and artifacts removal, can be configured. It cannot intersect with super-resolution and noise reduction.</p> 
     * @return DiffusionEnhance <p>LLM enhancement configuration. Note that only one of the three items, LLM enhancement, comprehensive enhancement, and artifacts removal, can be configured. It cannot intersect with super-resolution and noise reduction.</p>
     */
    public DiffusionEnhanceConfig getDiffusionEnhance() {
        return this.DiffusionEnhance;
    }

    /**
     * Set <p>LLM enhancement configuration. Note that only one of the three items, LLM enhancement, comprehensive enhancement, and artifacts removal, can be configured. It cannot intersect with super-resolution and noise reduction.</p>
     * @param DiffusionEnhance <p>LLM enhancement configuration. Note that only one of the three items, LLM enhancement, comprehensive enhancement, and artifacts removal, can be configured. It cannot intersect with super-resolution and noise reduction.</p>
     */
    public void setDiffusionEnhance(DiffusionEnhanceConfig DiffusionEnhance) {
        this.DiffusionEnhance = DiffusionEnhance;
    }

    /**
     * Get <p>The new frame interpolation frame rate configuration supports fractions. Note that you must choose between this and FrameRate. The capacity will not take effect when the source frame rate is equal to or greater than the target frame rate.</p> 
     * @return FrameRateWithDen <p>The new frame interpolation frame rate configuration supports fractions. Note that you must choose between this and FrameRate. The capacity will not take effect when the source frame rate is equal to or greater than the target frame rate.</p>
     */
    public FrameRateWithDenConfig getFrameRateWithDen() {
        return this.FrameRateWithDen;
    }

    /**
     * Set <p>The new frame interpolation frame rate configuration supports fractions. Note that you must choose between this and FrameRate. The capacity will not take effect when the source frame rate is equal to or greater than the target frame rate.</p>
     * @param FrameRateWithDen <p>The new frame interpolation frame rate configuration supports fractions. Note that you must choose between this and FrameRate. The capacity will not take effect when the source frame rate is equal to or greater than the target frame rate.</p>
     */
    public void setFrameRateWithDen(FrameRateWithDenConfig FrameRateWithDen) {
        this.FrameRateWithDen = FrameRateWithDen;
    }

    /**
     * Get <p>Large model repair configuration. Note that you can configure at most one of large model, comprehensive enhancement, and artifacts removal. It cannot intersect with super-resolution and noise reduction.</p> 
     * @return AiRestoration <p>Large model repair configuration. Note that you can configure at most one of large model, comprehensive enhancement, and artifacts removal. It cannot intersect with super-resolution and noise reduction.</p>
     */
    public AiRestorationConfig getAiRestoration() {
        return this.AiRestoration;
    }

    /**
     * Set <p>Large model repair configuration. Note that you can configure at most one of large model, comprehensive enhancement, and artifacts removal. It cannot intersect with super-resolution and noise reduction.</p>
     * @param AiRestoration <p>Large model repair configuration. Note that you can configure at most one of large model, comprehensive enhancement, and artifacts removal. It cannot intersect with super-resolution and noise reduction.</p>
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


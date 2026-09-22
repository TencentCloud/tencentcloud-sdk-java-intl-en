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

public class QualityInspectTemplateItem extends AbstractModel {

    /**
    * <p>Template ID.</p>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <p>Template type. Available values:</p><li>Preset: preset template;</li><li>Custom: custom template.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Template name.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Template description.</p>
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>Configuration parameters for audio and video quality detection.</p>
    */
    @SerializedName("Configs")
    @Expose
    private QualityInspectConfig [] Configs;

    /**
    * <p>Spot check policy for audio and video quality inspection.</p>
    */
    @SerializedName("Strategy")
    @Expose
    private QualityInspectStrategy Strategy;

    /**
    * <p>Template creation time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Template last modified time in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>(Not recommended. Use Configs as an alternative.) Frame interception interval in seconds.</p>
    */
    @SerializedName("ScreenshotInterval")
    @Expose
    private Float ScreenshotInterval;

    /**
    * <p>(Not recommended. Use Configs as an alternative.) Control parameters for video frame jitter and ghosting detection.</p>
    */
    @SerializedName("JitterConfigure")
    @Expose
    private JitterConfigureInfo JitterConfigure;

    /**
    * <p>(Not recommended. Use Configs as an alternative.) Control parameters for video frame blur detection.</p>
    */
    @SerializedName("BlurConfigure")
    @Expose
    private BlurConfigureInfo BlurConfigure;

    /**
    * <p>(Not recommended. Use Configs instead.) Control parameters for low-light and overexposure detection in video frames.</p>
    */
    @SerializedName("AbnormalLightingConfigure")
    @Expose
    private AbnormalLightingConfigureInfo AbnormalLightingConfigure;

    /**
    * <p>(Not recommended. Use Configs as an alternative.) Control parameters for video footage distortion detection.</p>
    */
    @SerializedName("CrashScreenConfigure")
    @Expose
    private CrashScreenConfigureInfo CrashScreenConfigure;

    /**
    * <p>Control parameters for detecting black edges, white edges, black screen, and white screen in video picture.</p>
    */
    @SerializedName("BlackWhiteEdgeConfigure")
    @Expose
    private BlackWhiteEdgeConfigureInfo BlackWhiteEdgeConfigure;

    /**
    * <p>(Not recommended. Use Configs as an alternative.) Control parameters for video frame noise detection.</p>
    */
    @SerializedName("NoiseConfigure")
    @Expose
    private NoiseConfigureInfo NoiseConfigure;

    /**
    * <p>(Not recommended. Use Configs instead.) Control parameters for video frame mosaic detection.</p>
    */
    @SerializedName("MosaicConfigure")
    @Expose
    private MosaicConfigureInfo MosaicConfigure;

    /**
    * <p>(Not recommended. Use Configs as an alternative.) Control parameters for video frame QR code detection.</p>
    */
    @SerializedName("QRCodeConfigure")
    @Expose
    private QRCodeConfigureInfo QRCodeConfigure;

    /**
    * <p>(Not recommended. Use Configs instead.) Control parameters for video frame quality evaluation.</p>
    */
    @SerializedName("QualityEvaluationConfigure")
    @Expose
    private QualityEvaluationConfigureInfo QualityEvaluationConfigure;

    /**
    * <p>(Not recommended. Use Configs as an alternative.) Control parameters for audio (mute, bass, pop) detection.</p>
    */
    @SerializedName("VoiceConfigure")
    @Expose
    private VoiceConfigureInfo VoiceConfigure;

    /**
     * Get <p>Template ID.</p> 
     * @return Definition <p>Template ID.</p>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>Template ID.</p>
     * @param Definition <p>Template ID.</p>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <p>Template type. Available values:</p><li>Preset: preset template;</li><li>Custom: custom template.</li> 
     * @return Type <p>Template type. Available values:</p><li>Preset: preset template;</li><li>Custom: custom template.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Template type. Available values:</p><li>Preset: preset template;</li><li>Custom: custom template.</li>
     * @param Type <p>Template type. Available values:</p><li>Preset: preset template;</li><li>Custom: custom template.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Template name.</p> 
     * @return Name <p>Template name.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Template name.</p>
     * @param Name <p>Template name.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Template description.</p> 
     * @return Comment <p>Template description.</p>
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>Template description.</p>
     * @param Comment <p>Template description.</p>
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get <p>Configuration parameters for audio and video quality detection.</p> 
     * @return Configs <p>Configuration parameters for audio and video quality detection.</p>
     */
    public QualityInspectConfig [] getConfigs() {
        return this.Configs;
    }

    /**
     * Set <p>Configuration parameters for audio and video quality detection.</p>
     * @param Configs <p>Configuration parameters for audio and video quality detection.</p>
     */
    public void setConfigs(QualityInspectConfig [] Configs) {
        this.Configs = Configs;
    }

    /**
     * Get <p>Spot check policy for audio and video quality inspection.</p> 
     * @return Strategy <p>Spot check policy for audio and video quality inspection.</p>
     */
    public QualityInspectStrategy getStrategy() {
        return this.Strategy;
    }

    /**
     * Set <p>Spot check policy for audio and video quality inspection.</p>
     * @param Strategy <p>Spot check policy for audio and video quality inspection.</p>
     */
    public void setStrategy(QualityInspectStrategy Strategy) {
        this.Strategy = Strategy;
    }

    /**
     * Get <p>Template creation time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p> 
     * @return CreateTime <p>Template creation time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Template creation time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
     * @param CreateTime <p>Template creation time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Template last modified time in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p> 
     * @return UpdateTime <p>Template last modified time in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Template last modified time in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
     * @param UpdateTime <p>Template last modified time in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>(Not recommended. Use Configs as an alternative.) Frame interception interval in seconds.</p> 
     * @return ScreenshotInterval <p>(Not recommended. Use Configs as an alternative.) Frame interception interval in seconds.</p>
     */
    public Float getScreenshotInterval() {
        return this.ScreenshotInterval;
    }

    /**
     * Set <p>(Not recommended. Use Configs as an alternative.) Frame interception interval in seconds.</p>
     * @param ScreenshotInterval <p>(Not recommended. Use Configs as an alternative.) Frame interception interval in seconds.</p>
     */
    public void setScreenshotInterval(Float ScreenshotInterval) {
        this.ScreenshotInterval = ScreenshotInterval;
    }

    /**
     * Get <p>(Not recommended. Use Configs as an alternative.) Control parameters for video frame jitter and ghosting detection.</p> 
     * @return JitterConfigure <p>(Not recommended. Use Configs as an alternative.) Control parameters for video frame jitter and ghosting detection.</p>
     */
    public JitterConfigureInfo getJitterConfigure() {
        return this.JitterConfigure;
    }

    /**
     * Set <p>(Not recommended. Use Configs as an alternative.) Control parameters for video frame jitter and ghosting detection.</p>
     * @param JitterConfigure <p>(Not recommended. Use Configs as an alternative.) Control parameters for video frame jitter and ghosting detection.</p>
     */
    public void setJitterConfigure(JitterConfigureInfo JitterConfigure) {
        this.JitterConfigure = JitterConfigure;
    }

    /**
     * Get <p>(Not recommended. Use Configs as an alternative.) Control parameters for video frame blur detection.</p> 
     * @return BlurConfigure <p>(Not recommended. Use Configs as an alternative.) Control parameters for video frame blur detection.</p>
     */
    public BlurConfigureInfo getBlurConfigure() {
        return this.BlurConfigure;
    }

    /**
     * Set <p>(Not recommended. Use Configs as an alternative.) Control parameters for video frame blur detection.</p>
     * @param BlurConfigure <p>(Not recommended. Use Configs as an alternative.) Control parameters for video frame blur detection.</p>
     */
    public void setBlurConfigure(BlurConfigureInfo BlurConfigure) {
        this.BlurConfigure = BlurConfigure;
    }

    /**
     * Get <p>(Not recommended. Use Configs instead.) Control parameters for low-light and overexposure detection in video frames.</p> 
     * @return AbnormalLightingConfigure <p>(Not recommended. Use Configs instead.) Control parameters for low-light and overexposure detection in video frames.</p>
     */
    public AbnormalLightingConfigureInfo getAbnormalLightingConfigure() {
        return this.AbnormalLightingConfigure;
    }

    /**
     * Set <p>(Not recommended. Use Configs instead.) Control parameters for low-light and overexposure detection in video frames.</p>
     * @param AbnormalLightingConfigure <p>(Not recommended. Use Configs instead.) Control parameters for low-light and overexposure detection in video frames.</p>
     */
    public void setAbnormalLightingConfigure(AbnormalLightingConfigureInfo AbnormalLightingConfigure) {
        this.AbnormalLightingConfigure = AbnormalLightingConfigure;
    }

    /**
     * Get <p>(Not recommended. Use Configs as an alternative.) Control parameters for video footage distortion detection.</p> 
     * @return CrashScreenConfigure <p>(Not recommended. Use Configs as an alternative.) Control parameters for video footage distortion detection.</p>
     */
    public CrashScreenConfigureInfo getCrashScreenConfigure() {
        return this.CrashScreenConfigure;
    }

    /**
     * Set <p>(Not recommended. Use Configs as an alternative.) Control parameters for video footage distortion detection.</p>
     * @param CrashScreenConfigure <p>(Not recommended. Use Configs as an alternative.) Control parameters for video footage distortion detection.</p>
     */
    public void setCrashScreenConfigure(CrashScreenConfigureInfo CrashScreenConfigure) {
        this.CrashScreenConfigure = CrashScreenConfigure;
    }

    /**
     * Get <p>Control parameters for detecting black edges, white edges, black screen, and white screen in video picture.</p> 
     * @return BlackWhiteEdgeConfigure <p>Control parameters for detecting black edges, white edges, black screen, and white screen in video picture.</p>
     */
    public BlackWhiteEdgeConfigureInfo getBlackWhiteEdgeConfigure() {
        return this.BlackWhiteEdgeConfigure;
    }

    /**
     * Set <p>Control parameters for detecting black edges, white edges, black screen, and white screen in video picture.</p>
     * @param BlackWhiteEdgeConfigure <p>Control parameters for detecting black edges, white edges, black screen, and white screen in video picture.</p>
     */
    public void setBlackWhiteEdgeConfigure(BlackWhiteEdgeConfigureInfo BlackWhiteEdgeConfigure) {
        this.BlackWhiteEdgeConfigure = BlackWhiteEdgeConfigure;
    }

    /**
     * Get <p>(Not recommended. Use Configs as an alternative.) Control parameters for video frame noise detection.</p> 
     * @return NoiseConfigure <p>(Not recommended. Use Configs as an alternative.) Control parameters for video frame noise detection.</p>
     */
    public NoiseConfigureInfo getNoiseConfigure() {
        return this.NoiseConfigure;
    }

    /**
     * Set <p>(Not recommended. Use Configs as an alternative.) Control parameters for video frame noise detection.</p>
     * @param NoiseConfigure <p>(Not recommended. Use Configs as an alternative.) Control parameters for video frame noise detection.</p>
     */
    public void setNoiseConfigure(NoiseConfigureInfo NoiseConfigure) {
        this.NoiseConfigure = NoiseConfigure;
    }

    /**
     * Get <p>(Not recommended. Use Configs instead.) Control parameters for video frame mosaic detection.</p> 
     * @return MosaicConfigure <p>(Not recommended. Use Configs instead.) Control parameters for video frame mosaic detection.</p>
     */
    public MosaicConfigureInfo getMosaicConfigure() {
        return this.MosaicConfigure;
    }

    /**
     * Set <p>(Not recommended. Use Configs instead.) Control parameters for video frame mosaic detection.</p>
     * @param MosaicConfigure <p>(Not recommended. Use Configs instead.) Control parameters for video frame mosaic detection.</p>
     */
    public void setMosaicConfigure(MosaicConfigureInfo MosaicConfigure) {
        this.MosaicConfigure = MosaicConfigure;
    }

    /**
     * Get <p>(Not recommended. Use Configs as an alternative.) Control parameters for video frame QR code detection.</p> 
     * @return QRCodeConfigure <p>(Not recommended. Use Configs as an alternative.) Control parameters for video frame QR code detection.</p>
     */
    public QRCodeConfigureInfo getQRCodeConfigure() {
        return this.QRCodeConfigure;
    }

    /**
     * Set <p>(Not recommended. Use Configs as an alternative.) Control parameters for video frame QR code detection.</p>
     * @param QRCodeConfigure <p>(Not recommended. Use Configs as an alternative.) Control parameters for video frame QR code detection.</p>
     */
    public void setQRCodeConfigure(QRCodeConfigureInfo QRCodeConfigure) {
        this.QRCodeConfigure = QRCodeConfigure;
    }

    /**
     * Get <p>(Not recommended. Use Configs instead.) Control parameters for video frame quality evaluation.</p> 
     * @return QualityEvaluationConfigure <p>(Not recommended. Use Configs instead.) Control parameters for video frame quality evaluation.</p>
     */
    public QualityEvaluationConfigureInfo getQualityEvaluationConfigure() {
        return this.QualityEvaluationConfigure;
    }

    /**
     * Set <p>(Not recommended. Use Configs instead.) Control parameters for video frame quality evaluation.</p>
     * @param QualityEvaluationConfigure <p>(Not recommended. Use Configs instead.) Control parameters for video frame quality evaluation.</p>
     */
    public void setQualityEvaluationConfigure(QualityEvaluationConfigureInfo QualityEvaluationConfigure) {
        this.QualityEvaluationConfigure = QualityEvaluationConfigure;
    }

    /**
     * Get <p>(Not recommended. Use Configs as an alternative.) Control parameters for audio (mute, bass, pop) detection.</p> 
     * @return VoiceConfigure <p>(Not recommended. Use Configs as an alternative.) Control parameters for audio (mute, bass, pop) detection.</p>
     */
    public VoiceConfigureInfo getVoiceConfigure() {
        return this.VoiceConfigure;
    }

    /**
     * Set <p>(Not recommended. Use Configs as an alternative.) Control parameters for audio (mute, bass, pop) detection.</p>
     * @param VoiceConfigure <p>(Not recommended. Use Configs as an alternative.) Control parameters for audio (mute, bass, pop) detection.</p>
     */
    public void setVoiceConfigure(VoiceConfigureInfo VoiceConfigure) {
        this.VoiceConfigure = VoiceConfigure;
    }

    public QualityInspectTemplateItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QualityInspectTemplateItem(QualityInspectTemplateItem source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.Configs != null) {
            this.Configs = new QualityInspectConfig[source.Configs.length];
            for (int i = 0; i < source.Configs.length; i++) {
                this.Configs[i] = new QualityInspectConfig(source.Configs[i]);
            }
        }
        if (source.Strategy != null) {
            this.Strategy = new QualityInspectStrategy(source.Strategy);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.ScreenshotInterval != null) {
            this.ScreenshotInterval = new Float(source.ScreenshotInterval);
        }
        if (source.JitterConfigure != null) {
            this.JitterConfigure = new JitterConfigureInfo(source.JitterConfigure);
        }
        if (source.BlurConfigure != null) {
            this.BlurConfigure = new BlurConfigureInfo(source.BlurConfigure);
        }
        if (source.AbnormalLightingConfigure != null) {
            this.AbnormalLightingConfigure = new AbnormalLightingConfigureInfo(source.AbnormalLightingConfigure);
        }
        if (source.CrashScreenConfigure != null) {
            this.CrashScreenConfigure = new CrashScreenConfigureInfo(source.CrashScreenConfigure);
        }
        if (source.BlackWhiteEdgeConfigure != null) {
            this.BlackWhiteEdgeConfigure = new BlackWhiteEdgeConfigureInfo(source.BlackWhiteEdgeConfigure);
        }
        if (source.NoiseConfigure != null) {
            this.NoiseConfigure = new NoiseConfigureInfo(source.NoiseConfigure);
        }
        if (source.MosaicConfigure != null) {
            this.MosaicConfigure = new MosaicConfigureInfo(source.MosaicConfigure);
        }
        if (source.QRCodeConfigure != null) {
            this.QRCodeConfigure = new QRCodeConfigureInfo(source.QRCodeConfigure);
        }
        if (source.QualityEvaluationConfigure != null) {
            this.QualityEvaluationConfigure = new QualityEvaluationConfigureInfo(source.QualityEvaluationConfigure);
        }
        if (source.VoiceConfigure != null) {
            this.VoiceConfigure = new VoiceConfigureInfo(source.VoiceConfigure);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamArrayObj(map, prefix + "Configs.", this.Configs);
        this.setParamObj(map, prefix + "Strategy.", this.Strategy);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ScreenshotInterval", this.ScreenshotInterval);
        this.setParamObj(map, prefix + "JitterConfigure.", this.JitterConfigure);
        this.setParamObj(map, prefix + "BlurConfigure.", this.BlurConfigure);
        this.setParamObj(map, prefix + "AbnormalLightingConfigure.", this.AbnormalLightingConfigure);
        this.setParamObj(map, prefix + "CrashScreenConfigure.", this.CrashScreenConfigure);
        this.setParamObj(map, prefix + "BlackWhiteEdgeConfigure.", this.BlackWhiteEdgeConfigure);
        this.setParamObj(map, prefix + "NoiseConfigure.", this.NoiseConfigure);
        this.setParamObj(map, prefix + "MosaicConfigure.", this.MosaicConfigure);
        this.setParamObj(map, prefix + "QRCodeConfigure.", this.QRCodeConfigure);
        this.setParamObj(map, prefix + "QualityEvaluationConfigure.", this.QualityEvaluationConfigure);
        this.setParamObj(map, prefix + "VoiceConfigure.", this.VoiceConfigure);

    }
}


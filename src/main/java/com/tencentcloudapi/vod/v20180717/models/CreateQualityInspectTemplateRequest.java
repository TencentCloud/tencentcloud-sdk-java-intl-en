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

public class CreateQualityInspectTemplateRequest extends AbstractModel {

    /**
    * <p><b>On-demand <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. For customers who activate on-demand services after December 25, 2023, this field must be filled in as the app ID when accessing resources in on-demand applications, whether it is the default application or a newly created application.</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>Audio and video quality inspection template name.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Audio and video quality inspection template description.</p>
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>Audio and video quality detection configuration parameters.</p>
    */
    @SerializedName("Configs")
    @Expose
    private QualityInspectConfig [] Configs;

    /**
    * <p>Spot check policy parameters for audio and video quality inspection.</p>
    */
    @SerializedName("Strategy")
    @Expose
    private QualityInspectStrategy Strategy;

    /**
    * <p>(Not recommended. Use Configs instead.) Frame interception interval in seconds. Minimum value: 1. If not specified, the default frame interval is 1 second.</p>
    */
    @SerializedName("ScreenshotInterval")
    @Expose
    private Float ScreenshotInterval;

    /**
    * <p>(Not recommended. Use Configs instead.) Control parameters for video frame jitter and ghosting detection.</p>
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
    * <p>(Not recommended. Use Configs instead.) Control parameters for screen glitch detection in video footage.</p>
    */
    @SerializedName("CrashScreenConfigure")
    @Expose
    private CrashScreenConfigureInfo CrashScreenConfigure;

    /**
    * <p>(Not recommended, use Configs as an alternative) Control parameters for video picture black edge, white edge, black screen, and white screen detection.</p>
    */
    @SerializedName("BlackWhiteEdgeConfigure")
    @Expose
    private BlackWhiteEdgeConfigureInfo BlackWhiteEdgeConfigure;

    /**
    * <p>(Not recommended. Use Configs instead.) Control parameters for video frame noise detection.</p>
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
    * <p>(Not recommended. Use Configs instead.) Control parameters for video frame QR code detection.</p>
    */
    @SerializedName("QRCodeConfigure")
    @Expose
    private QRCodeConfigureInfo QRCodeConfigure;

    /**
    * <p>(Not recommended. Use Configs as an alternative) Control parameters for audio (mute, bass, pop) detection.</p>
    */
    @SerializedName("VoiceConfigure")
    @Expose
    private VoiceConfigureInfo VoiceConfigure;

    /**
    * <p>(Not recommended. Use Configs instead.) Control parameters for video frame quality evaluation.</p>
    */
    @SerializedName("QualityEvaluationConfigure")
    @Expose
    private QualityEvaluationConfigureInfo QualityEvaluationConfigure;

    /**
     * Get <p><b>On-demand <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. For customers who activate on-demand services after December 25, 2023, this field must be filled in as the app ID when accessing resources in on-demand applications, whether it is the default application or a newly created application.</b></p> 
     * @return SubAppId <p><b>On-demand <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. For customers who activate on-demand services after December 25, 2023, this field must be filled in as the app ID when accessing resources in on-demand applications, whether it is the default application or a newly created application.</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>On-demand <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. For customers who activate on-demand services after December 25, 2023, this field must be filled in as the app ID when accessing resources in on-demand applications, whether it is the default application or a newly created application.</b></p>
     * @param SubAppId <p><b>On-demand <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. For customers who activate on-demand services after December 25, 2023, this field must be filled in as the app ID when accessing resources in on-demand applications, whether it is the default application or a newly created application.</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>Audio and video quality inspection template name.</p> 
     * @return Name <p>Audio and video quality inspection template name.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Audio and video quality inspection template name.</p>
     * @param Name <p>Audio and video quality inspection template name.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Audio and video quality inspection template description.</p> 
     * @return Comment <p>Audio and video quality inspection template description.</p>
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>Audio and video quality inspection template description.</p>
     * @param Comment <p>Audio and video quality inspection template description.</p>
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get <p>Audio and video quality detection configuration parameters.</p> 
     * @return Configs <p>Audio and video quality detection configuration parameters.</p>
     */
    public QualityInspectConfig [] getConfigs() {
        return this.Configs;
    }

    /**
     * Set <p>Audio and video quality detection configuration parameters.</p>
     * @param Configs <p>Audio and video quality detection configuration parameters.</p>
     */
    public void setConfigs(QualityInspectConfig [] Configs) {
        this.Configs = Configs;
    }

    /**
     * Get <p>Spot check policy parameters for audio and video quality inspection.</p> 
     * @return Strategy <p>Spot check policy parameters for audio and video quality inspection.</p>
     */
    public QualityInspectStrategy getStrategy() {
        return this.Strategy;
    }

    /**
     * Set <p>Spot check policy parameters for audio and video quality inspection.</p>
     * @param Strategy <p>Spot check policy parameters for audio and video quality inspection.</p>
     */
    public void setStrategy(QualityInspectStrategy Strategy) {
        this.Strategy = Strategy;
    }

    /**
     * Get <p>(Not recommended. Use Configs instead.) Frame interception interval in seconds. Minimum value: 1. If not specified, the default frame interval is 1 second.</p> 
     * @return ScreenshotInterval <p>(Not recommended. Use Configs instead.) Frame interception interval in seconds. Minimum value: 1. If not specified, the default frame interval is 1 second.</p>
     */
    public Float getScreenshotInterval() {
        return this.ScreenshotInterval;
    }

    /**
     * Set <p>(Not recommended. Use Configs instead.) Frame interception interval in seconds. Minimum value: 1. If not specified, the default frame interval is 1 second.</p>
     * @param ScreenshotInterval <p>(Not recommended. Use Configs instead.) Frame interception interval in seconds. Minimum value: 1. If not specified, the default frame interval is 1 second.</p>
     */
    public void setScreenshotInterval(Float ScreenshotInterval) {
        this.ScreenshotInterval = ScreenshotInterval;
    }

    /**
     * Get <p>(Not recommended. Use Configs instead.) Control parameters for video frame jitter and ghosting detection.</p> 
     * @return JitterConfigure <p>(Not recommended. Use Configs instead.) Control parameters for video frame jitter and ghosting detection.</p>
     */
    public JitterConfigureInfo getJitterConfigure() {
        return this.JitterConfigure;
    }

    /**
     * Set <p>(Not recommended. Use Configs instead.) Control parameters for video frame jitter and ghosting detection.</p>
     * @param JitterConfigure <p>(Not recommended. Use Configs instead.) Control parameters for video frame jitter and ghosting detection.</p>
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
     * Get <p>(Not recommended. Use Configs instead.) Control parameters for screen glitch detection in video footage.</p> 
     * @return CrashScreenConfigure <p>(Not recommended. Use Configs instead.) Control parameters for screen glitch detection in video footage.</p>
     */
    public CrashScreenConfigureInfo getCrashScreenConfigure() {
        return this.CrashScreenConfigure;
    }

    /**
     * Set <p>(Not recommended. Use Configs instead.) Control parameters for screen glitch detection in video footage.</p>
     * @param CrashScreenConfigure <p>(Not recommended. Use Configs instead.) Control parameters for screen glitch detection in video footage.</p>
     */
    public void setCrashScreenConfigure(CrashScreenConfigureInfo CrashScreenConfigure) {
        this.CrashScreenConfigure = CrashScreenConfigure;
    }

    /**
     * Get <p>(Not recommended, use Configs as an alternative) Control parameters for video picture black edge, white edge, black screen, and white screen detection.</p> 
     * @return BlackWhiteEdgeConfigure <p>(Not recommended, use Configs as an alternative) Control parameters for video picture black edge, white edge, black screen, and white screen detection.</p>
     */
    public BlackWhiteEdgeConfigureInfo getBlackWhiteEdgeConfigure() {
        return this.BlackWhiteEdgeConfigure;
    }

    /**
     * Set <p>(Not recommended, use Configs as an alternative) Control parameters for video picture black edge, white edge, black screen, and white screen detection.</p>
     * @param BlackWhiteEdgeConfigure <p>(Not recommended, use Configs as an alternative) Control parameters for video picture black edge, white edge, black screen, and white screen detection.</p>
     */
    public void setBlackWhiteEdgeConfigure(BlackWhiteEdgeConfigureInfo BlackWhiteEdgeConfigure) {
        this.BlackWhiteEdgeConfigure = BlackWhiteEdgeConfigure;
    }

    /**
     * Get <p>(Not recommended. Use Configs instead.) Control parameters for video frame noise detection.</p> 
     * @return NoiseConfigure <p>(Not recommended. Use Configs instead.) Control parameters for video frame noise detection.</p>
     */
    public NoiseConfigureInfo getNoiseConfigure() {
        return this.NoiseConfigure;
    }

    /**
     * Set <p>(Not recommended. Use Configs instead.) Control parameters for video frame noise detection.</p>
     * @param NoiseConfigure <p>(Not recommended. Use Configs instead.) Control parameters for video frame noise detection.</p>
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
     * Get <p>(Not recommended. Use Configs instead.) Control parameters for video frame QR code detection.</p> 
     * @return QRCodeConfigure <p>(Not recommended. Use Configs instead.) Control parameters for video frame QR code detection.</p>
     */
    public QRCodeConfigureInfo getQRCodeConfigure() {
        return this.QRCodeConfigure;
    }

    /**
     * Set <p>(Not recommended. Use Configs instead.) Control parameters for video frame QR code detection.</p>
     * @param QRCodeConfigure <p>(Not recommended. Use Configs instead.) Control parameters for video frame QR code detection.</p>
     */
    public void setQRCodeConfigure(QRCodeConfigureInfo QRCodeConfigure) {
        this.QRCodeConfigure = QRCodeConfigure;
    }

    /**
     * Get <p>(Not recommended. Use Configs as an alternative) Control parameters for audio (mute, bass, pop) detection.</p> 
     * @return VoiceConfigure <p>(Not recommended. Use Configs as an alternative) Control parameters for audio (mute, bass, pop) detection.</p>
     */
    public VoiceConfigureInfo getVoiceConfigure() {
        return this.VoiceConfigure;
    }

    /**
     * Set <p>(Not recommended. Use Configs as an alternative) Control parameters for audio (mute, bass, pop) detection.</p>
     * @param VoiceConfigure <p>(Not recommended. Use Configs as an alternative) Control parameters for audio (mute, bass, pop) detection.</p>
     */
    public void setVoiceConfigure(VoiceConfigureInfo VoiceConfigure) {
        this.VoiceConfigure = VoiceConfigure;
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

    public CreateQualityInspectTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateQualityInspectTemplateRequest(CreateQualityInspectTemplateRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
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
        if (source.VoiceConfigure != null) {
            this.VoiceConfigure = new VoiceConfigureInfo(source.VoiceConfigure);
        }
        if (source.QualityEvaluationConfigure != null) {
            this.QualityEvaluationConfigure = new QualityEvaluationConfigureInfo(source.QualityEvaluationConfigure);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamArrayObj(map, prefix + "Configs.", this.Configs);
        this.setParamObj(map, prefix + "Strategy.", this.Strategy);
        this.setParamSimple(map, prefix + "ScreenshotInterval", this.ScreenshotInterval);
        this.setParamObj(map, prefix + "JitterConfigure.", this.JitterConfigure);
        this.setParamObj(map, prefix + "BlurConfigure.", this.BlurConfigure);
        this.setParamObj(map, prefix + "AbnormalLightingConfigure.", this.AbnormalLightingConfigure);
        this.setParamObj(map, prefix + "CrashScreenConfigure.", this.CrashScreenConfigure);
        this.setParamObj(map, prefix + "BlackWhiteEdgeConfigure.", this.BlackWhiteEdgeConfigure);
        this.setParamObj(map, prefix + "NoiseConfigure.", this.NoiseConfigure);
        this.setParamObj(map, prefix + "MosaicConfigure.", this.MosaicConfigure);
        this.setParamObj(map, prefix + "QRCodeConfigure.", this.QRCodeConfigure);
        this.setParamObj(map, prefix + "VoiceConfigure.", this.VoiceConfigure);
        this.setParamObj(map, prefix + "QualityEvaluationConfigure.", this.QualityEvaluationConfigure);

    }
}


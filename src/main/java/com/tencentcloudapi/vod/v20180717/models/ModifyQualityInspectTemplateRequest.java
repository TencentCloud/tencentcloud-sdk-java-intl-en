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

public class ModifyQualityInspectTemplateRequest extends AbstractModel {

    /**
    * <p>Template ID.</p>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <p><b>Video-on-demand (VOD) <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. For customers who activate on-demand services after December 25, 2023, this field must be set to the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>Template name. Length limit: 64 characters.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Transcoding template description. Length limit: 256 characters.</p>
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
    * <p>(Not recommended. Use Configs instead.) Frame interception interval in seconds. Minimum value: 1.</p>
    */
    @SerializedName("ScreenshotInterval")
    @Expose
    private Float ScreenshotInterval;

    /**
    * <p>(Not recommended. Use Configs instead.) Control parameters for video frame jitter and ghosting detection.</p>
    */
    @SerializedName("JitterConfigure")
    @Expose
    private JitterConfigureInfoForUpdate JitterConfigure;

    /**
    * <p>(Not recommended. Use Configs as an alternative.) Control parameters for video frame blur detection.</p>
    */
    @SerializedName("BlurConfigure")
    @Expose
    private BlurConfigureInfoForUpdate BlurConfigure;

    /**
    * <p>(Not recommended. Use Configs instead.) Control parameters for low-light and overexposure detection in video frames.</p>
    */
    @SerializedName("AbnormalLightingConfigure")
    @Expose
    private AbnormalLightingConfigureInfoForUpdate AbnormalLightingConfigure;

    /**
    * <p>(Not recommended. Use Configs instead.) Control parameters for video image distortion detection.</p>
    */
    @SerializedName("CrashScreenConfigure")
    @Expose
    private CrashScreenConfigureInfoForUpdate CrashScreenConfigure;

    /**
    * <p>(Not recommended. Use Configs as an alternative) Control parameters for detecting black edges, white edges, black screen, and white screen in video pictures.</p>
    */
    @SerializedName("BlackWhiteEdgeConfigure")
    @Expose
    private BlackWhiteEdgeConfigureInfoForUpdate BlackWhiteEdgeConfigure;

    /**
    * <p>(Not recommended. Use Configs instead.) Control parameters for video frame noise detection.</p>
    */
    @SerializedName("NoiseConfigure")
    @Expose
    private NoiseConfigureInfoForUpdate NoiseConfigure;

    /**
    * <p>(Not recommended. Use Configs instead.) Control parameters for video frame mosaic detection.</p>
    */
    @SerializedName("MosaicConfigure")
    @Expose
    private MosaicConfigureInfoForUpdate MosaicConfigure;

    /**
    * <p>(Not recommended. Use Configs instead.) Control parameters for video frame QR code detection.</p>
    */
    @SerializedName("QRCodeConfigure")
    @Expose
    private QRCodeConfigureInfoForUpdate QRCodeConfigure;

    /**
    * <p>(Not recommended. Use Configs as an alternative) Control parameters for audio (mute, bass, pop) detection.</p>
    */
    @SerializedName("VoiceConfigure")
    @Expose
    private VoiceConfigureInfoForUpdate VoiceConfigure;

    /**
    * <p>(Not recommended. Use Configs instead.) Control parameters for video frame quality evaluation.</p>
    */
    @SerializedName("QualityEvaluationConfigure")
    @Expose
    private QualityEvaluationConfigureInfoForUpdate QualityEvaluationConfigure;

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
     * Get <p><b>Video-on-demand (VOD) <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. For customers who activate on-demand services after December 25, 2023, this field must be set to the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p> 
     * @return SubAppId <p><b>Video-on-demand (VOD) <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. For customers who activate on-demand services after December 25, 2023, this field must be set to the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>Video-on-demand (VOD) <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. For customers who activate on-demand services after December 25, 2023, this field must be set to the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p>
     * @param SubAppId <p><b>Video-on-demand (VOD) <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. For customers who activate on-demand services after December 25, 2023, this field must be set to the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>Template name. Length limit: 64 characters.</p> 
     * @return Name <p>Template name. Length limit: 64 characters.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Template name. Length limit: 64 characters.</p>
     * @param Name <p>Template name. Length limit: 64 characters.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Transcoding template description. Length limit: 256 characters.</p> 
     * @return Comment <p>Transcoding template description. Length limit: 256 characters.</p>
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>Transcoding template description. Length limit: 256 characters.</p>
     * @param Comment <p>Transcoding template description. Length limit: 256 characters.</p>
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
     * Get <p>(Not recommended. Use Configs instead.) Frame interception interval in seconds. Minimum value: 1.</p> 
     * @return ScreenshotInterval <p>(Not recommended. Use Configs instead.) Frame interception interval in seconds. Minimum value: 1.</p>
     */
    public Float getScreenshotInterval() {
        return this.ScreenshotInterval;
    }

    /**
     * Set <p>(Not recommended. Use Configs instead.) Frame interception interval in seconds. Minimum value: 1.</p>
     * @param ScreenshotInterval <p>(Not recommended. Use Configs instead.) Frame interception interval in seconds. Minimum value: 1.</p>
     */
    public void setScreenshotInterval(Float ScreenshotInterval) {
        this.ScreenshotInterval = ScreenshotInterval;
    }

    /**
     * Get <p>(Not recommended. Use Configs instead.) Control parameters for video frame jitter and ghosting detection.</p> 
     * @return JitterConfigure <p>(Not recommended. Use Configs instead.) Control parameters for video frame jitter and ghosting detection.</p>
     */
    public JitterConfigureInfoForUpdate getJitterConfigure() {
        return this.JitterConfigure;
    }

    /**
     * Set <p>(Not recommended. Use Configs instead.) Control parameters for video frame jitter and ghosting detection.</p>
     * @param JitterConfigure <p>(Not recommended. Use Configs instead.) Control parameters for video frame jitter and ghosting detection.</p>
     */
    public void setJitterConfigure(JitterConfigureInfoForUpdate JitterConfigure) {
        this.JitterConfigure = JitterConfigure;
    }

    /**
     * Get <p>(Not recommended. Use Configs as an alternative.) Control parameters for video frame blur detection.</p> 
     * @return BlurConfigure <p>(Not recommended. Use Configs as an alternative.) Control parameters for video frame blur detection.</p>
     */
    public BlurConfigureInfoForUpdate getBlurConfigure() {
        return this.BlurConfigure;
    }

    /**
     * Set <p>(Not recommended. Use Configs as an alternative.) Control parameters for video frame blur detection.</p>
     * @param BlurConfigure <p>(Not recommended. Use Configs as an alternative.) Control parameters for video frame blur detection.</p>
     */
    public void setBlurConfigure(BlurConfigureInfoForUpdate BlurConfigure) {
        this.BlurConfigure = BlurConfigure;
    }

    /**
     * Get <p>(Not recommended. Use Configs instead.) Control parameters for low-light and overexposure detection in video frames.</p> 
     * @return AbnormalLightingConfigure <p>(Not recommended. Use Configs instead.) Control parameters for low-light and overexposure detection in video frames.</p>
     */
    public AbnormalLightingConfigureInfoForUpdate getAbnormalLightingConfigure() {
        return this.AbnormalLightingConfigure;
    }

    /**
     * Set <p>(Not recommended. Use Configs instead.) Control parameters for low-light and overexposure detection in video frames.</p>
     * @param AbnormalLightingConfigure <p>(Not recommended. Use Configs instead.) Control parameters for low-light and overexposure detection in video frames.</p>
     */
    public void setAbnormalLightingConfigure(AbnormalLightingConfigureInfoForUpdate AbnormalLightingConfigure) {
        this.AbnormalLightingConfigure = AbnormalLightingConfigure;
    }

    /**
     * Get <p>(Not recommended. Use Configs instead.) Control parameters for video image distortion detection.</p> 
     * @return CrashScreenConfigure <p>(Not recommended. Use Configs instead.) Control parameters for video image distortion detection.</p>
     */
    public CrashScreenConfigureInfoForUpdate getCrashScreenConfigure() {
        return this.CrashScreenConfigure;
    }

    /**
     * Set <p>(Not recommended. Use Configs instead.) Control parameters for video image distortion detection.</p>
     * @param CrashScreenConfigure <p>(Not recommended. Use Configs instead.) Control parameters for video image distortion detection.</p>
     */
    public void setCrashScreenConfigure(CrashScreenConfigureInfoForUpdate CrashScreenConfigure) {
        this.CrashScreenConfigure = CrashScreenConfigure;
    }

    /**
     * Get <p>(Not recommended. Use Configs as an alternative) Control parameters for detecting black edges, white edges, black screen, and white screen in video pictures.</p> 
     * @return BlackWhiteEdgeConfigure <p>(Not recommended. Use Configs as an alternative) Control parameters for detecting black edges, white edges, black screen, and white screen in video pictures.</p>
     */
    public BlackWhiteEdgeConfigureInfoForUpdate getBlackWhiteEdgeConfigure() {
        return this.BlackWhiteEdgeConfigure;
    }

    /**
     * Set <p>(Not recommended. Use Configs as an alternative) Control parameters for detecting black edges, white edges, black screen, and white screen in video pictures.</p>
     * @param BlackWhiteEdgeConfigure <p>(Not recommended. Use Configs as an alternative) Control parameters for detecting black edges, white edges, black screen, and white screen in video pictures.</p>
     */
    public void setBlackWhiteEdgeConfigure(BlackWhiteEdgeConfigureInfoForUpdate BlackWhiteEdgeConfigure) {
        this.BlackWhiteEdgeConfigure = BlackWhiteEdgeConfigure;
    }

    /**
     * Get <p>(Not recommended. Use Configs instead.) Control parameters for video frame noise detection.</p> 
     * @return NoiseConfigure <p>(Not recommended. Use Configs instead.) Control parameters for video frame noise detection.</p>
     */
    public NoiseConfigureInfoForUpdate getNoiseConfigure() {
        return this.NoiseConfigure;
    }

    /**
     * Set <p>(Not recommended. Use Configs instead.) Control parameters for video frame noise detection.</p>
     * @param NoiseConfigure <p>(Not recommended. Use Configs instead.) Control parameters for video frame noise detection.</p>
     */
    public void setNoiseConfigure(NoiseConfigureInfoForUpdate NoiseConfigure) {
        this.NoiseConfigure = NoiseConfigure;
    }

    /**
     * Get <p>(Not recommended. Use Configs instead.) Control parameters for video frame mosaic detection.</p> 
     * @return MosaicConfigure <p>(Not recommended. Use Configs instead.) Control parameters for video frame mosaic detection.</p>
     */
    public MosaicConfigureInfoForUpdate getMosaicConfigure() {
        return this.MosaicConfigure;
    }

    /**
     * Set <p>(Not recommended. Use Configs instead.) Control parameters for video frame mosaic detection.</p>
     * @param MosaicConfigure <p>(Not recommended. Use Configs instead.) Control parameters for video frame mosaic detection.</p>
     */
    public void setMosaicConfigure(MosaicConfigureInfoForUpdate MosaicConfigure) {
        this.MosaicConfigure = MosaicConfigure;
    }

    /**
     * Get <p>(Not recommended. Use Configs instead.) Control parameters for video frame QR code detection.</p> 
     * @return QRCodeConfigure <p>(Not recommended. Use Configs instead.) Control parameters for video frame QR code detection.</p>
     */
    public QRCodeConfigureInfoForUpdate getQRCodeConfigure() {
        return this.QRCodeConfigure;
    }

    /**
     * Set <p>(Not recommended. Use Configs instead.) Control parameters for video frame QR code detection.</p>
     * @param QRCodeConfigure <p>(Not recommended. Use Configs instead.) Control parameters for video frame QR code detection.</p>
     */
    public void setQRCodeConfigure(QRCodeConfigureInfoForUpdate QRCodeConfigure) {
        this.QRCodeConfigure = QRCodeConfigure;
    }

    /**
     * Get <p>(Not recommended. Use Configs as an alternative) Control parameters for audio (mute, bass, pop) detection.</p> 
     * @return VoiceConfigure <p>(Not recommended. Use Configs as an alternative) Control parameters for audio (mute, bass, pop) detection.</p>
     */
    public VoiceConfigureInfoForUpdate getVoiceConfigure() {
        return this.VoiceConfigure;
    }

    /**
     * Set <p>(Not recommended. Use Configs as an alternative) Control parameters for audio (mute, bass, pop) detection.</p>
     * @param VoiceConfigure <p>(Not recommended. Use Configs as an alternative) Control parameters for audio (mute, bass, pop) detection.</p>
     */
    public void setVoiceConfigure(VoiceConfigureInfoForUpdate VoiceConfigure) {
        this.VoiceConfigure = VoiceConfigure;
    }

    /**
     * Get <p>(Not recommended. Use Configs instead.) Control parameters for video frame quality evaluation.</p> 
     * @return QualityEvaluationConfigure <p>(Not recommended. Use Configs instead.) Control parameters for video frame quality evaluation.</p>
     */
    public QualityEvaluationConfigureInfoForUpdate getQualityEvaluationConfigure() {
        return this.QualityEvaluationConfigure;
    }

    /**
     * Set <p>(Not recommended. Use Configs instead.) Control parameters for video frame quality evaluation.</p>
     * @param QualityEvaluationConfigure <p>(Not recommended. Use Configs instead.) Control parameters for video frame quality evaluation.</p>
     */
    public void setQualityEvaluationConfigure(QualityEvaluationConfigureInfoForUpdate QualityEvaluationConfigure) {
        this.QualityEvaluationConfigure = QualityEvaluationConfigure;
    }

    public ModifyQualityInspectTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyQualityInspectTemplateRequest(ModifyQualityInspectTemplateRequest source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
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
            this.JitterConfigure = new JitterConfigureInfoForUpdate(source.JitterConfigure);
        }
        if (source.BlurConfigure != null) {
            this.BlurConfigure = new BlurConfigureInfoForUpdate(source.BlurConfigure);
        }
        if (source.AbnormalLightingConfigure != null) {
            this.AbnormalLightingConfigure = new AbnormalLightingConfigureInfoForUpdate(source.AbnormalLightingConfigure);
        }
        if (source.CrashScreenConfigure != null) {
            this.CrashScreenConfigure = new CrashScreenConfigureInfoForUpdate(source.CrashScreenConfigure);
        }
        if (source.BlackWhiteEdgeConfigure != null) {
            this.BlackWhiteEdgeConfigure = new BlackWhiteEdgeConfigureInfoForUpdate(source.BlackWhiteEdgeConfigure);
        }
        if (source.NoiseConfigure != null) {
            this.NoiseConfigure = new NoiseConfigureInfoForUpdate(source.NoiseConfigure);
        }
        if (source.MosaicConfigure != null) {
            this.MosaicConfigure = new MosaicConfigureInfoForUpdate(source.MosaicConfigure);
        }
        if (source.QRCodeConfigure != null) {
            this.QRCodeConfigure = new QRCodeConfigureInfoForUpdate(source.QRCodeConfigure);
        }
        if (source.VoiceConfigure != null) {
            this.VoiceConfigure = new VoiceConfigureInfoForUpdate(source.VoiceConfigure);
        }
        if (source.QualityEvaluationConfigure != null) {
            this.QualityEvaluationConfigure = new QualityEvaluationConfigureInfoForUpdate(source.QualityEvaluationConfigure);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
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


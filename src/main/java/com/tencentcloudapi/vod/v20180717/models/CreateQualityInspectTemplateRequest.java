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
    * <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Media quality inspect template name.Length limit: 64 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Template description. Length limit: 256 characters.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Frame interval, unit in seconds, minimum value is 1. When not filled, the default frame interval is 1 second.
    */
    @SerializedName("ScreenshotInterval")
    @Expose
    private Float ScreenshotInterval;

    /**
    * Control parameters for detecting video jitter and ghosting.
    */
    @SerializedName("JitterConfigure")
    @Expose
    private JitterConfigureInfo JitterConfigure;

    /**
    * Control parameters for detecting video blur.
    */
    @SerializedName("BlurConfigure")
    @Expose
    private BlurConfigureInfo BlurConfigure;

    /**
    * Control parameters for detecting low brightness and overexposure of video.
    */
    @SerializedName("AbnormalLightingConfigure")
    @Expose
    private AbnormalLightingConfigureInfo AbnormalLightingConfigure;

    /**
    * Control parameters for detecting video crash.
    */
    @SerializedName("CrashScreenConfigure")
    @Expose
    private CrashScreenConfigureInfo CrashScreenConfigure;

    /**
    * Control parameters for detecting video black edges, white edges, black screen, and white screen.
    */
    @SerializedName("BlackWhiteEdgeConfigure")
    @Expose
    private BlackWhiteEdgeConfigureInfo BlackWhiteEdgeConfigure;

    /**
    * Control parameters for detecting video noise.
    */
    @SerializedName("NoiseConfigure")
    @Expose
    private NoiseConfigureInfo NoiseConfigure;

    /**
    * Control parameters for detecting video mosaic.
    */
    @SerializedName("MosaicConfigure")
    @Expose
    private MosaicConfigureInfo MosaicConfigure;

    /**
    * Control parameters for QR code detection in video.
    */
    @SerializedName("QRCodeConfigure")
    @Expose
    private QRCodeConfigureInfo QRCodeConfigure;

    /**
    * Control parameters for audio (mutes, bass, blast sound).
    */
    @SerializedName("VoiceConfigure")
    @Expose
    private VoiceConfigureInfo VoiceConfigure;

    /**
    * Control parameters for video quality evaluation.
    */
    @SerializedName("QualityEvaluationConfigure")
    @Expose
    private QualityEvaluationConfigureInfo QualityEvaluationConfigure;

    /**
     * Get <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b> 
     * @return SubAppId <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
     * @param SubAppId <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Media quality inspect template name.Length limit: 64 characters. 
     * @return Name Media quality inspect template name.Length limit: 64 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Media quality inspect template name.Length limit: 64 characters.
     * @param Name Media quality inspect template name.Length limit: 64 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Template description. Length limit: 256 characters. 
     * @return Comment Template description. Length limit: 256 characters.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Template description. Length limit: 256 characters.
     * @param Comment Template description. Length limit: 256 characters.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get Frame interval, unit in seconds, minimum value is 1. When not filled, the default frame interval is 1 second. 
     * @return ScreenshotInterval Frame interval, unit in seconds, minimum value is 1. When not filled, the default frame interval is 1 second.
     */
    public Float getScreenshotInterval() {
        return this.ScreenshotInterval;
    }

    /**
     * Set Frame interval, unit in seconds, minimum value is 1. When not filled, the default frame interval is 1 second.
     * @param ScreenshotInterval Frame interval, unit in seconds, minimum value is 1. When not filled, the default frame interval is 1 second.
     */
    public void setScreenshotInterval(Float ScreenshotInterval) {
        this.ScreenshotInterval = ScreenshotInterval;
    }

    /**
     * Get Control parameters for detecting video jitter and ghosting. 
     * @return JitterConfigure Control parameters for detecting video jitter and ghosting.
     */
    public JitterConfigureInfo getJitterConfigure() {
        return this.JitterConfigure;
    }

    /**
     * Set Control parameters for detecting video jitter and ghosting.
     * @param JitterConfigure Control parameters for detecting video jitter and ghosting.
     */
    public void setJitterConfigure(JitterConfigureInfo JitterConfigure) {
        this.JitterConfigure = JitterConfigure;
    }

    /**
     * Get Control parameters for detecting video blur. 
     * @return BlurConfigure Control parameters for detecting video blur.
     */
    public BlurConfigureInfo getBlurConfigure() {
        return this.BlurConfigure;
    }

    /**
     * Set Control parameters for detecting video blur.
     * @param BlurConfigure Control parameters for detecting video blur.
     */
    public void setBlurConfigure(BlurConfigureInfo BlurConfigure) {
        this.BlurConfigure = BlurConfigure;
    }

    /**
     * Get Control parameters for detecting low brightness and overexposure of video. 
     * @return AbnormalLightingConfigure Control parameters for detecting low brightness and overexposure of video.
     */
    public AbnormalLightingConfigureInfo getAbnormalLightingConfigure() {
        return this.AbnormalLightingConfigure;
    }

    /**
     * Set Control parameters for detecting low brightness and overexposure of video.
     * @param AbnormalLightingConfigure Control parameters for detecting low brightness and overexposure of video.
     */
    public void setAbnormalLightingConfigure(AbnormalLightingConfigureInfo AbnormalLightingConfigure) {
        this.AbnormalLightingConfigure = AbnormalLightingConfigure;
    }

    /**
     * Get Control parameters for detecting video crash. 
     * @return CrashScreenConfigure Control parameters for detecting video crash.
     */
    public CrashScreenConfigureInfo getCrashScreenConfigure() {
        return this.CrashScreenConfigure;
    }

    /**
     * Set Control parameters for detecting video crash.
     * @param CrashScreenConfigure Control parameters for detecting video crash.
     */
    public void setCrashScreenConfigure(CrashScreenConfigureInfo CrashScreenConfigure) {
        this.CrashScreenConfigure = CrashScreenConfigure;
    }

    /**
     * Get Control parameters for detecting video black edges, white edges, black screen, and white screen. 
     * @return BlackWhiteEdgeConfigure Control parameters for detecting video black edges, white edges, black screen, and white screen.
     */
    public BlackWhiteEdgeConfigureInfo getBlackWhiteEdgeConfigure() {
        return this.BlackWhiteEdgeConfigure;
    }

    /**
     * Set Control parameters for detecting video black edges, white edges, black screen, and white screen.
     * @param BlackWhiteEdgeConfigure Control parameters for detecting video black edges, white edges, black screen, and white screen.
     */
    public void setBlackWhiteEdgeConfigure(BlackWhiteEdgeConfigureInfo BlackWhiteEdgeConfigure) {
        this.BlackWhiteEdgeConfigure = BlackWhiteEdgeConfigure;
    }

    /**
     * Get Control parameters for detecting video noise. 
     * @return NoiseConfigure Control parameters for detecting video noise.
     */
    public NoiseConfigureInfo getNoiseConfigure() {
        return this.NoiseConfigure;
    }

    /**
     * Set Control parameters for detecting video noise.
     * @param NoiseConfigure Control parameters for detecting video noise.
     */
    public void setNoiseConfigure(NoiseConfigureInfo NoiseConfigure) {
        this.NoiseConfigure = NoiseConfigure;
    }

    /**
     * Get Control parameters for detecting video mosaic. 
     * @return MosaicConfigure Control parameters for detecting video mosaic.
     */
    public MosaicConfigureInfo getMosaicConfigure() {
        return this.MosaicConfigure;
    }

    /**
     * Set Control parameters for detecting video mosaic.
     * @param MosaicConfigure Control parameters for detecting video mosaic.
     */
    public void setMosaicConfigure(MosaicConfigureInfo MosaicConfigure) {
        this.MosaicConfigure = MosaicConfigure;
    }

    /**
     * Get Control parameters for QR code detection in video. 
     * @return QRCodeConfigure Control parameters for QR code detection in video.
     */
    public QRCodeConfigureInfo getQRCodeConfigure() {
        return this.QRCodeConfigure;
    }

    /**
     * Set Control parameters for QR code detection in video.
     * @param QRCodeConfigure Control parameters for QR code detection in video.
     */
    public void setQRCodeConfigure(QRCodeConfigureInfo QRCodeConfigure) {
        this.QRCodeConfigure = QRCodeConfigure;
    }

    /**
     * Get Control parameters for audio (mutes, bass, blast sound). 
     * @return VoiceConfigure Control parameters for audio (mutes, bass, blast sound).
     */
    public VoiceConfigureInfo getVoiceConfigure() {
        return this.VoiceConfigure;
    }

    /**
     * Set Control parameters for audio (mutes, bass, blast sound).
     * @param VoiceConfigure Control parameters for audio (mutes, bass, blast sound).
     */
    public void setVoiceConfigure(VoiceConfigureInfo VoiceConfigure) {
        this.VoiceConfigure = VoiceConfigure;
    }

    /**
     * Get Control parameters for video quality evaluation. 
     * @return QualityEvaluationConfigure Control parameters for video quality evaluation.
     */
    public QualityEvaluationConfigureInfo getQualityEvaluationConfigure() {
        return this.QualityEvaluationConfigure;
    }

    /**
     * Set Control parameters for video quality evaluation.
     * @param QualityEvaluationConfigure Control parameters for video quality evaluation.
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


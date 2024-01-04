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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyQualityInspectTemplateRequest extends AbstractModel {

    /**
    * Media quality inspection template ID.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Media quality inspection template name.Length limit: 64 characters.
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
    private JitterConfigureInfoForUpdate JitterConfigure;

    /**
    * Control parameters for detecting video blur.
    */
    @SerializedName("BlurConfigure")
    @Expose
    private BlurConfigureInfoForUpdate BlurConfigure;

    /**
    * Control parameters for detecting low brightness and overexposure of video.
    */
    @SerializedName("AbnormalLightingConfigure")
    @Expose
    private AbnormalLightingConfigureInfoForUpdate AbnormalLightingConfigure;

    /**
    * Control parameters for detecting video crash.
    */
    @SerializedName("CrashScreenConfigure")
    @Expose
    private CrashScreenConfigureInfoForUpdate CrashScreenConfigure;

    /**
    * Control parameters for detecting video black edges, white edges, black screen, and white screen.
    */
    @SerializedName("BlackWhiteEdgeConfigure")
    @Expose
    private BlackWhiteEdgeConfigureInfoForUpdate BlackWhiteEdgeConfigure;

    /**
    * Control parameters for detecting video noise.
    */
    @SerializedName("NoiseConfigure")
    @Expose
    private NoiseConfigureInfoForUpdate NoiseConfigure;

    /**
    * Control parameters for detecting video mosaic.
    */
    @SerializedName("MosaicConfigure")
    @Expose
    private MosaicConfigureInfoForUpdate MosaicConfigure;

    /**
    * Control parameters for QR code detection in video.
    */
    @SerializedName("QRCodeConfigure")
    @Expose
    private QRCodeConfigureInfoForUpdate QRCodeConfigure;

    /**
    * Control parameters for audio (mutes, bass, blast sound).
    */
    @SerializedName("VoiceConfigure")
    @Expose
    private VoiceConfigureInfoForUpdate VoiceConfigure;

    /**
    * Control parameters for video quality evaluation.
    */
    @SerializedName("QualityEvaluationConfigure")
    @Expose
    private QualityEvaluationConfigureInfoForUpdate QualityEvaluationConfigure;

    /**
     * Get Media quality inspection template ID. 
     * @return Definition Media quality inspection template ID.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Media quality inspection template ID.
     * @param Definition Media quality inspection template ID.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

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
     * Get Media quality inspection template name.Length limit: 64 characters. 
     * @return Name Media quality inspection template name.Length limit: 64 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Media quality inspection template name.Length limit: 64 characters.
     * @param Name Media quality inspection template name.Length limit: 64 characters.
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
    public JitterConfigureInfoForUpdate getJitterConfigure() {
        return this.JitterConfigure;
    }

    /**
     * Set Control parameters for detecting video jitter and ghosting.
     * @param JitterConfigure Control parameters for detecting video jitter and ghosting.
     */
    public void setJitterConfigure(JitterConfigureInfoForUpdate JitterConfigure) {
        this.JitterConfigure = JitterConfigure;
    }

    /**
     * Get Control parameters for detecting video blur. 
     * @return BlurConfigure Control parameters for detecting video blur.
     */
    public BlurConfigureInfoForUpdate getBlurConfigure() {
        return this.BlurConfigure;
    }

    /**
     * Set Control parameters for detecting video blur.
     * @param BlurConfigure Control parameters for detecting video blur.
     */
    public void setBlurConfigure(BlurConfigureInfoForUpdate BlurConfigure) {
        this.BlurConfigure = BlurConfigure;
    }

    /**
     * Get Control parameters for detecting low brightness and overexposure of video. 
     * @return AbnormalLightingConfigure Control parameters for detecting low brightness and overexposure of video.
     */
    public AbnormalLightingConfigureInfoForUpdate getAbnormalLightingConfigure() {
        return this.AbnormalLightingConfigure;
    }

    /**
     * Set Control parameters for detecting low brightness and overexposure of video.
     * @param AbnormalLightingConfigure Control parameters for detecting low brightness and overexposure of video.
     */
    public void setAbnormalLightingConfigure(AbnormalLightingConfigureInfoForUpdate AbnormalLightingConfigure) {
        this.AbnormalLightingConfigure = AbnormalLightingConfigure;
    }

    /**
     * Get Control parameters for detecting video crash. 
     * @return CrashScreenConfigure Control parameters for detecting video crash.
     */
    public CrashScreenConfigureInfoForUpdate getCrashScreenConfigure() {
        return this.CrashScreenConfigure;
    }

    /**
     * Set Control parameters for detecting video crash.
     * @param CrashScreenConfigure Control parameters for detecting video crash.
     */
    public void setCrashScreenConfigure(CrashScreenConfigureInfoForUpdate CrashScreenConfigure) {
        this.CrashScreenConfigure = CrashScreenConfigure;
    }

    /**
     * Get Control parameters for detecting video black edges, white edges, black screen, and white screen. 
     * @return BlackWhiteEdgeConfigure Control parameters for detecting video black edges, white edges, black screen, and white screen.
     */
    public BlackWhiteEdgeConfigureInfoForUpdate getBlackWhiteEdgeConfigure() {
        return this.BlackWhiteEdgeConfigure;
    }

    /**
     * Set Control parameters for detecting video black edges, white edges, black screen, and white screen.
     * @param BlackWhiteEdgeConfigure Control parameters for detecting video black edges, white edges, black screen, and white screen.
     */
    public void setBlackWhiteEdgeConfigure(BlackWhiteEdgeConfigureInfoForUpdate BlackWhiteEdgeConfigure) {
        this.BlackWhiteEdgeConfigure = BlackWhiteEdgeConfigure;
    }

    /**
     * Get Control parameters for detecting video noise. 
     * @return NoiseConfigure Control parameters for detecting video noise.
     */
    public NoiseConfigureInfoForUpdate getNoiseConfigure() {
        return this.NoiseConfigure;
    }

    /**
     * Set Control parameters for detecting video noise.
     * @param NoiseConfigure Control parameters for detecting video noise.
     */
    public void setNoiseConfigure(NoiseConfigureInfoForUpdate NoiseConfigure) {
        this.NoiseConfigure = NoiseConfigure;
    }

    /**
     * Get Control parameters for detecting video mosaic. 
     * @return MosaicConfigure Control parameters for detecting video mosaic.
     */
    public MosaicConfigureInfoForUpdate getMosaicConfigure() {
        return this.MosaicConfigure;
    }

    /**
     * Set Control parameters for detecting video mosaic.
     * @param MosaicConfigure Control parameters for detecting video mosaic.
     */
    public void setMosaicConfigure(MosaicConfigureInfoForUpdate MosaicConfigure) {
        this.MosaicConfigure = MosaicConfigure;
    }

    /**
     * Get Control parameters for QR code detection in video. 
     * @return QRCodeConfigure Control parameters for QR code detection in video.
     */
    public QRCodeConfigureInfoForUpdate getQRCodeConfigure() {
        return this.QRCodeConfigure;
    }

    /**
     * Set Control parameters for QR code detection in video.
     * @param QRCodeConfigure Control parameters for QR code detection in video.
     */
    public void setQRCodeConfigure(QRCodeConfigureInfoForUpdate QRCodeConfigure) {
        this.QRCodeConfigure = QRCodeConfigure;
    }

    /**
     * Get Control parameters for audio (mutes, bass, blast sound). 
     * @return VoiceConfigure Control parameters for audio (mutes, bass, blast sound).
     */
    public VoiceConfigureInfoForUpdate getVoiceConfigure() {
        return this.VoiceConfigure;
    }

    /**
     * Set Control parameters for audio (mutes, bass, blast sound).
     * @param VoiceConfigure Control parameters for audio (mutes, bass, blast sound).
     */
    public void setVoiceConfigure(VoiceConfigureInfoForUpdate VoiceConfigure) {
        this.VoiceConfigure = VoiceConfigure;
    }

    /**
     * Get Control parameters for video quality evaluation. 
     * @return QualityEvaluationConfigure Control parameters for video quality evaluation.
     */
    public QualityEvaluationConfigureInfoForUpdate getQualityEvaluationConfigure() {
        return this.QualityEvaluationConfigure;
    }

    /**
     * Set Control parameters for video quality evaluation.
     * @param QualityEvaluationConfigure Control parameters for video quality evaluation.
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


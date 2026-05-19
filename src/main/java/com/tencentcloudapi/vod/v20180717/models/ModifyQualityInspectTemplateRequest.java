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
    * Template ID.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Template name. The length cannot exceed 64 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Template description, with a length limit of 256 characters.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Frame interception interval, unit: seconds, minimum value 1.
    */
    @SerializedName("ScreenshotInterval")
    @Expose
    private Float ScreenshotInterval;

    /**
    * Control parameters for video frame jitter and ghosting detection.
    */
    @SerializedName("JitterConfigure")
    @Expose
    private JitterConfigureInfoForUpdate JitterConfigure;

    /**
    * Control parameters for video frame blur detection.
    */
    @SerializedName("BlurConfigure")
    @Expose
    private BlurConfigureInfoForUpdate BlurConfigure;

    /**
    * Control parameters for low-light and overexposure detection in video frames.
    */
    @SerializedName("AbnormalLightingConfigure")
    @Expose
    private AbnormalLightingConfigureInfoForUpdate AbnormalLightingConfigure;

    /**
    * Control parameters for screen glitch detection in video footage.
    */
    @SerializedName("CrashScreenConfigure")
    @Expose
    private CrashScreenConfigureInfoForUpdate CrashScreenConfigure;

    /**
    * Control parameters for video picture black edge, white edge, black screen, and white screen detection.
    */
    @SerializedName("BlackWhiteEdgeConfigure")
    @Expose
    private BlackWhiteEdgeConfigureInfoForUpdate BlackWhiteEdgeConfigure;

    /**
    * Control parameters for video frame noise detection.
    */
    @SerializedName("NoiseConfigure")
    @Expose
    private NoiseConfigureInfoForUpdate NoiseConfigure;

    /**
    * Control parameters for video frame mosaic detection.
    */
    @SerializedName("MosaicConfigure")
    @Expose
    private MosaicConfigureInfoForUpdate MosaicConfigure;

    /**
    * Control parameters for video frame QR code detection.
    */
    @SerializedName("QRCodeConfigure")
    @Expose
    private QRCodeConfigureInfoForUpdate QRCodeConfigure;

    /**
    * Audio (mute, bass, clipping) detection control parameters.
    */
    @SerializedName("VoiceConfigure")
    @Expose
    private VoiceConfigureInfoForUpdate VoiceConfigure;

    /**
    * Control parameters for video frame quality evaluation.
    */
    @SerializedName("QualityEvaluationConfigure")
    @Expose
    private QualityEvaluationConfigureInfoForUpdate QualityEvaluationConfigure;

    /**
     * Get Template ID. 
     * @return Definition Template ID.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Template ID.
     * @param Definition Template ID.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b> 
     * @return SubAppId <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b>
     * @param SubAppId <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Template name. The length cannot exceed 64 characters. 
     * @return Name Template name. The length cannot exceed 64 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Template name. The length cannot exceed 64 characters.
     * @param Name Template name. The length cannot exceed 64 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Template description, with a length limit of 256 characters. 
     * @return Comment Template description, with a length limit of 256 characters.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Template description, with a length limit of 256 characters.
     * @param Comment Template description, with a length limit of 256 characters.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get Frame interception interval, unit: seconds, minimum value 1. 
     * @return ScreenshotInterval Frame interception interval, unit: seconds, minimum value 1.
     */
    public Float getScreenshotInterval() {
        return this.ScreenshotInterval;
    }

    /**
     * Set Frame interception interval, unit: seconds, minimum value 1.
     * @param ScreenshotInterval Frame interception interval, unit: seconds, minimum value 1.
     */
    public void setScreenshotInterval(Float ScreenshotInterval) {
        this.ScreenshotInterval = ScreenshotInterval;
    }

    /**
     * Get Control parameters for video frame jitter and ghosting detection. 
     * @return JitterConfigure Control parameters for video frame jitter and ghosting detection.
     */
    public JitterConfigureInfoForUpdate getJitterConfigure() {
        return this.JitterConfigure;
    }

    /**
     * Set Control parameters for video frame jitter and ghosting detection.
     * @param JitterConfigure Control parameters for video frame jitter and ghosting detection.
     */
    public void setJitterConfigure(JitterConfigureInfoForUpdate JitterConfigure) {
        this.JitterConfigure = JitterConfigure;
    }

    /**
     * Get Control parameters for video frame blur detection. 
     * @return BlurConfigure Control parameters for video frame blur detection.
     */
    public BlurConfigureInfoForUpdate getBlurConfigure() {
        return this.BlurConfigure;
    }

    /**
     * Set Control parameters for video frame blur detection.
     * @param BlurConfigure Control parameters for video frame blur detection.
     */
    public void setBlurConfigure(BlurConfigureInfoForUpdate BlurConfigure) {
        this.BlurConfigure = BlurConfigure;
    }

    /**
     * Get Control parameters for low-light and overexposure detection in video frames. 
     * @return AbnormalLightingConfigure Control parameters for low-light and overexposure detection in video frames.
     */
    public AbnormalLightingConfigureInfoForUpdate getAbnormalLightingConfigure() {
        return this.AbnormalLightingConfigure;
    }

    /**
     * Set Control parameters for low-light and overexposure detection in video frames.
     * @param AbnormalLightingConfigure Control parameters for low-light and overexposure detection in video frames.
     */
    public void setAbnormalLightingConfigure(AbnormalLightingConfigureInfoForUpdate AbnormalLightingConfigure) {
        this.AbnormalLightingConfigure = AbnormalLightingConfigure;
    }

    /**
     * Get Control parameters for screen glitch detection in video footage. 
     * @return CrashScreenConfigure Control parameters for screen glitch detection in video footage.
     */
    public CrashScreenConfigureInfoForUpdate getCrashScreenConfigure() {
        return this.CrashScreenConfigure;
    }

    /**
     * Set Control parameters for screen glitch detection in video footage.
     * @param CrashScreenConfigure Control parameters for screen glitch detection in video footage.
     */
    public void setCrashScreenConfigure(CrashScreenConfigureInfoForUpdate CrashScreenConfigure) {
        this.CrashScreenConfigure = CrashScreenConfigure;
    }

    /**
     * Get Control parameters for video picture black edge, white edge, black screen, and white screen detection. 
     * @return BlackWhiteEdgeConfigure Control parameters for video picture black edge, white edge, black screen, and white screen detection.
     */
    public BlackWhiteEdgeConfigureInfoForUpdate getBlackWhiteEdgeConfigure() {
        return this.BlackWhiteEdgeConfigure;
    }

    /**
     * Set Control parameters for video picture black edge, white edge, black screen, and white screen detection.
     * @param BlackWhiteEdgeConfigure Control parameters for video picture black edge, white edge, black screen, and white screen detection.
     */
    public void setBlackWhiteEdgeConfigure(BlackWhiteEdgeConfigureInfoForUpdate BlackWhiteEdgeConfigure) {
        this.BlackWhiteEdgeConfigure = BlackWhiteEdgeConfigure;
    }

    /**
     * Get Control parameters for video frame noise detection. 
     * @return NoiseConfigure Control parameters for video frame noise detection.
     */
    public NoiseConfigureInfoForUpdate getNoiseConfigure() {
        return this.NoiseConfigure;
    }

    /**
     * Set Control parameters for video frame noise detection.
     * @param NoiseConfigure Control parameters for video frame noise detection.
     */
    public void setNoiseConfigure(NoiseConfigureInfoForUpdate NoiseConfigure) {
        this.NoiseConfigure = NoiseConfigure;
    }

    /**
     * Get Control parameters for video frame mosaic detection. 
     * @return MosaicConfigure Control parameters for video frame mosaic detection.
     */
    public MosaicConfigureInfoForUpdate getMosaicConfigure() {
        return this.MosaicConfigure;
    }

    /**
     * Set Control parameters for video frame mosaic detection.
     * @param MosaicConfigure Control parameters for video frame mosaic detection.
     */
    public void setMosaicConfigure(MosaicConfigureInfoForUpdate MosaicConfigure) {
        this.MosaicConfigure = MosaicConfigure;
    }

    /**
     * Get Control parameters for video frame QR code detection. 
     * @return QRCodeConfigure Control parameters for video frame QR code detection.
     */
    public QRCodeConfigureInfoForUpdate getQRCodeConfigure() {
        return this.QRCodeConfigure;
    }

    /**
     * Set Control parameters for video frame QR code detection.
     * @param QRCodeConfigure Control parameters for video frame QR code detection.
     */
    public void setQRCodeConfigure(QRCodeConfigureInfoForUpdate QRCodeConfigure) {
        this.QRCodeConfigure = QRCodeConfigure;
    }

    /**
     * Get Audio (mute, bass, clipping) detection control parameters. 
     * @return VoiceConfigure Audio (mute, bass, clipping) detection control parameters.
     */
    public VoiceConfigureInfoForUpdate getVoiceConfigure() {
        return this.VoiceConfigure;
    }

    /**
     * Set Audio (mute, bass, clipping) detection control parameters.
     * @param VoiceConfigure Audio (mute, bass, clipping) detection control parameters.
     */
    public void setVoiceConfigure(VoiceConfigureInfoForUpdate VoiceConfigure) {
        this.VoiceConfigure = VoiceConfigure;
    }

    /**
     * Get Control parameters for video frame quality evaluation. 
     * @return QualityEvaluationConfigure Control parameters for video frame quality evaluation.
     */
    public QualityEvaluationConfigureInfoForUpdate getQualityEvaluationConfigure() {
        return this.QualityEvaluationConfigure;
    }

    /**
     * Set Control parameters for video frame quality evaluation.
     * @param QualityEvaluationConfigure Control parameters for video frame quality evaluation.
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


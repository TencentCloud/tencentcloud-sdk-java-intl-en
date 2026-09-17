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
    * 
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 
    */
    @SerializedName("Configs")
    @Expose
    private QualityInspectConfig [] Configs;

    /**
    * 
    */
    @SerializedName("Strategy")
    @Expose
    private QualityInspectStrategy Strategy;

    /**
    * 
    */
    @SerializedName("ScreenshotInterval")
    @Expose
    private Float ScreenshotInterval;

    /**
    * 
    */
    @SerializedName("JitterConfigure")
    @Expose
    private JitterConfigureInfo JitterConfigure;

    /**
    * 
    */
    @SerializedName("BlurConfigure")
    @Expose
    private BlurConfigureInfo BlurConfigure;

    /**
    * 
    */
    @SerializedName("AbnormalLightingConfigure")
    @Expose
    private AbnormalLightingConfigureInfo AbnormalLightingConfigure;

    /**
    * 
    */
    @SerializedName("CrashScreenConfigure")
    @Expose
    private CrashScreenConfigureInfo CrashScreenConfigure;

    /**
    * 
    */
    @SerializedName("BlackWhiteEdgeConfigure")
    @Expose
    private BlackWhiteEdgeConfigureInfo BlackWhiteEdgeConfigure;

    /**
    * 
    */
    @SerializedName("NoiseConfigure")
    @Expose
    private NoiseConfigureInfo NoiseConfigure;

    /**
    * 
    */
    @SerializedName("MosaicConfigure")
    @Expose
    private MosaicConfigureInfo MosaicConfigure;

    /**
    * 
    */
    @SerializedName("QRCodeConfigure")
    @Expose
    private QRCodeConfigureInfo QRCodeConfigure;

    /**
    * 
    */
    @SerializedName("VoiceConfigure")
    @Expose
    private VoiceConfigureInfo VoiceConfigure;

    /**
    * 
    */
    @SerializedName("QualityEvaluationConfigure")
    @Expose
    private QualityEvaluationConfigureInfo QualityEvaluationConfigure;

    /**
     * Get  
     * @return SubAppId 
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 
     * @param SubAppId 
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get  
     * @return Name 
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 
     * @param Name 
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get  
     * @return Comment 
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 
     * @param Comment 
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get  
     * @return Configs 
     */
    public QualityInspectConfig [] getConfigs() {
        return this.Configs;
    }

    /**
     * Set 
     * @param Configs 
     */
    public void setConfigs(QualityInspectConfig [] Configs) {
        this.Configs = Configs;
    }

    /**
     * Get  
     * @return Strategy 
     */
    public QualityInspectStrategy getStrategy() {
        return this.Strategy;
    }

    /**
     * Set 
     * @param Strategy 
     */
    public void setStrategy(QualityInspectStrategy Strategy) {
        this.Strategy = Strategy;
    }

    /**
     * Get  
     * @return ScreenshotInterval 
     */
    public Float getScreenshotInterval() {
        return this.ScreenshotInterval;
    }

    /**
     * Set 
     * @param ScreenshotInterval 
     */
    public void setScreenshotInterval(Float ScreenshotInterval) {
        this.ScreenshotInterval = ScreenshotInterval;
    }

    /**
     * Get  
     * @return JitterConfigure 
     */
    public JitterConfigureInfo getJitterConfigure() {
        return this.JitterConfigure;
    }

    /**
     * Set 
     * @param JitterConfigure 
     */
    public void setJitterConfigure(JitterConfigureInfo JitterConfigure) {
        this.JitterConfigure = JitterConfigure;
    }

    /**
     * Get  
     * @return BlurConfigure 
     */
    public BlurConfigureInfo getBlurConfigure() {
        return this.BlurConfigure;
    }

    /**
     * Set 
     * @param BlurConfigure 
     */
    public void setBlurConfigure(BlurConfigureInfo BlurConfigure) {
        this.BlurConfigure = BlurConfigure;
    }

    /**
     * Get  
     * @return AbnormalLightingConfigure 
     */
    public AbnormalLightingConfigureInfo getAbnormalLightingConfigure() {
        return this.AbnormalLightingConfigure;
    }

    /**
     * Set 
     * @param AbnormalLightingConfigure 
     */
    public void setAbnormalLightingConfigure(AbnormalLightingConfigureInfo AbnormalLightingConfigure) {
        this.AbnormalLightingConfigure = AbnormalLightingConfigure;
    }

    /**
     * Get  
     * @return CrashScreenConfigure 
     */
    public CrashScreenConfigureInfo getCrashScreenConfigure() {
        return this.CrashScreenConfigure;
    }

    /**
     * Set 
     * @param CrashScreenConfigure 
     */
    public void setCrashScreenConfigure(CrashScreenConfigureInfo CrashScreenConfigure) {
        this.CrashScreenConfigure = CrashScreenConfigure;
    }

    /**
     * Get  
     * @return BlackWhiteEdgeConfigure 
     */
    public BlackWhiteEdgeConfigureInfo getBlackWhiteEdgeConfigure() {
        return this.BlackWhiteEdgeConfigure;
    }

    /**
     * Set 
     * @param BlackWhiteEdgeConfigure 
     */
    public void setBlackWhiteEdgeConfigure(BlackWhiteEdgeConfigureInfo BlackWhiteEdgeConfigure) {
        this.BlackWhiteEdgeConfigure = BlackWhiteEdgeConfigure;
    }

    /**
     * Get  
     * @return NoiseConfigure 
     */
    public NoiseConfigureInfo getNoiseConfigure() {
        return this.NoiseConfigure;
    }

    /**
     * Set 
     * @param NoiseConfigure 
     */
    public void setNoiseConfigure(NoiseConfigureInfo NoiseConfigure) {
        this.NoiseConfigure = NoiseConfigure;
    }

    /**
     * Get  
     * @return MosaicConfigure 
     */
    public MosaicConfigureInfo getMosaicConfigure() {
        return this.MosaicConfigure;
    }

    /**
     * Set 
     * @param MosaicConfigure 
     */
    public void setMosaicConfigure(MosaicConfigureInfo MosaicConfigure) {
        this.MosaicConfigure = MosaicConfigure;
    }

    /**
     * Get  
     * @return QRCodeConfigure 
     */
    public QRCodeConfigureInfo getQRCodeConfigure() {
        return this.QRCodeConfigure;
    }

    /**
     * Set 
     * @param QRCodeConfigure 
     */
    public void setQRCodeConfigure(QRCodeConfigureInfo QRCodeConfigure) {
        this.QRCodeConfigure = QRCodeConfigure;
    }

    /**
     * Get  
     * @return VoiceConfigure 
     */
    public VoiceConfigureInfo getVoiceConfigure() {
        return this.VoiceConfigure;
    }

    /**
     * Set 
     * @param VoiceConfigure 
     */
    public void setVoiceConfigure(VoiceConfigureInfo VoiceConfigure) {
        this.VoiceConfigure = VoiceConfigure;
    }

    /**
     * Get  
     * @return QualityEvaluationConfigure 
     */
    public QualityEvaluationConfigureInfo getQualityEvaluationConfigure() {
        return this.QualityEvaluationConfigure;
    }

    /**
     * Set 
     * @param QualityEvaluationConfigure 
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


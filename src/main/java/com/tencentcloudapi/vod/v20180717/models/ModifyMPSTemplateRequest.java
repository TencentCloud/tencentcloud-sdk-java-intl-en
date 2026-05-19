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

public class ModifyMPSTemplateRequest extends AbstractModel {

    /**
    * <p><b>VOD <a href="/document/product/266/14574?from_cn_redirect=1">application</a> ID.</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>Type of the MPS template that needs to be modified.</p><p>Enumeration value:</p><ul><li>AIAnalysis: Intelligent analysis template</li><li>SmartSubtitle: Intelligent subtitle template</li><li>SmartErase: Intelligent erasure template</li></ul>
    */
    @SerializedName("TemplateType")
    @Expose
    private String TemplateType;

    /**
    * <p>MPS modifies template parameters. This parameter is used for passing through to the media processing service (MPS) to modify user-defined MPS task templates from the VOD side.<br> Currently only support modifying templates of the following task types in this way:</p><ol><li>Audio and video enhancement: Only support filling in the content of Name, Comment, RemoveVideo, RemoveAudio, VideoTemplate, AudioTemplate, and EnhanceConfig parameters in the "<a href="https://www.tencentcloud.com/document/api/862/37578?from_cn_redirect=1">modify transcoding template</a>" interface. Currently only support configuring the above parameters in the template, other parameters are not required. If other parameters are included, the system will automatically ignore them.</li><li>AI analysis: Only support filling in the content of Name, Comment, ClassificationConfigure, TagConfigure, CoverConfigure, and FrameTagConfigure parameters in the "<a href="https://www.tencentcloud.com/document/api/862/40246?from_cn_redirect=1">modify content analysis template</a>" interface. Currently only support configuring the above parameters in the template, other parameters are not required. If other parameters are included, the system will automatically ignore them.</li><li>Intelligent caption: Only support filling in the content of Name, Comment, TranslateSwitch, VideoSrcLanguage, SubtitleFormat, SubtitleType, AsrHotWordsConfigure, TranslateDstLanguage, and ProcessType parameters in the "<a href="https://www.tencentcloud.com/document/api/862/117001?from_cn_redirect=1">modify intelligent caption template</a>" interface. Currently only support configuring the above parameters in the template, other parameters are not required. If other parameters are included, the system will automatically ignore them.</li><li>Intelligent erasure: Only support filling in the content of Name, Comment, EraseType, EraseSubtitleConfig, EraseWatermarkConfig, and ErasePrivacyConfig parameters in the "<a href="https://www.tencentcloud.com/document/api/862/123732?from_cn_redirect=1">modify intelligent erasure template</a>" interface. Currently only support configuring the above parameters in the template, other parameters are not required. If other parameters are included, the system will automatically ignore them.</li></ol>
    */
    @SerializedName("MPSModifyTemplateParams")
    @Expose
    private String MPSModifyTemplateParams;

    /**
    * <p>Intelligent analysis template parameter. Valid when MPSModifyTemplateParams is empty.</p>
    */
    @SerializedName("AIAnalysisTemplate")
    @Expose
    private MPSAIAnalysisTemplateForUpdate AIAnalysisTemplate;

    /**
    * <p>Intelligent subtitle template parameter. Valid when MPSModifyTemplateParams is empty.</p>
    */
    @SerializedName("SmartSubtitleTemplate")
    @Expose
    private MPSSmartSubtitleTemplateForUpdate SmartSubtitleTemplate;

    /**
    * <p>Intelligent erasure template parameter. Valid when MPSModifyTemplateParams is empty.</p>
    */
    @SerializedName("SmartEraseTemplate")
    @Expose
    private MPSSmartEraseTemplateForUpdate SmartEraseTemplate;

    /**
     * Get <p><b>VOD <a href="/document/product/266/14574?from_cn_redirect=1">application</a> ID.</b></p> 
     * @return SubAppId <p><b>VOD <a href="/document/product/266/14574?from_cn_redirect=1">application</a> ID.</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>VOD <a href="/document/product/266/14574?from_cn_redirect=1">application</a> ID.</b></p>
     * @param SubAppId <p><b>VOD <a href="/document/product/266/14574?from_cn_redirect=1">application</a> ID.</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>Type of the MPS template that needs to be modified.</p><p>Enumeration value:</p><ul><li>AIAnalysis: Intelligent analysis template</li><li>SmartSubtitle: Intelligent subtitle template</li><li>SmartErase: Intelligent erasure template</li></ul> 
     * @return TemplateType <p>Type of the MPS template that needs to be modified.</p><p>Enumeration value:</p><ul><li>AIAnalysis: Intelligent analysis template</li><li>SmartSubtitle: Intelligent subtitle template</li><li>SmartErase: Intelligent erasure template</li></ul>
     */
    public String getTemplateType() {
        return this.TemplateType;
    }

    /**
     * Set <p>Type of the MPS template that needs to be modified.</p><p>Enumeration value:</p><ul><li>AIAnalysis: Intelligent analysis template</li><li>SmartSubtitle: Intelligent subtitle template</li><li>SmartErase: Intelligent erasure template</li></ul>
     * @param TemplateType <p>Type of the MPS template that needs to be modified.</p><p>Enumeration value:</p><ul><li>AIAnalysis: Intelligent analysis template</li><li>SmartSubtitle: Intelligent subtitle template</li><li>SmartErase: Intelligent erasure template</li></ul>
     */
    public void setTemplateType(String TemplateType) {
        this.TemplateType = TemplateType;
    }

    /**
     * Get <p>MPS modifies template parameters. This parameter is used for passing through to the media processing service (MPS) to modify user-defined MPS task templates from the VOD side.<br> Currently only support modifying templates of the following task types in this way:</p><ol><li>Audio and video enhancement: Only support filling in the content of Name, Comment, RemoveVideo, RemoveAudio, VideoTemplate, AudioTemplate, and EnhanceConfig parameters in the "<a href="https://www.tencentcloud.com/document/api/862/37578?from_cn_redirect=1">modify transcoding template</a>" interface. Currently only support configuring the above parameters in the template, other parameters are not required. If other parameters are included, the system will automatically ignore them.</li><li>AI analysis: Only support filling in the content of Name, Comment, ClassificationConfigure, TagConfigure, CoverConfigure, and FrameTagConfigure parameters in the "<a href="https://www.tencentcloud.com/document/api/862/40246?from_cn_redirect=1">modify content analysis template</a>" interface. Currently only support configuring the above parameters in the template, other parameters are not required. If other parameters are included, the system will automatically ignore them.</li><li>Intelligent caption: Only support filling in the content of Name, Comment, TranslateSwitch, VideoSrcLanguage, SubtitleFormat, SubtitleType, AsrHotWordsConfigure, TranslateDstLanguage, and ProcessType parameters in the "<a href="https://www.tencentcloud.com/document/api/862/117001?from_cn_redirect=1">modify intelligent caption template</a>" interface. Currently only support configuring the above parameters in the template, other parameters are not required. If other parameters are included, the system will automatically ignore them.</li><li>Intelligent erasure: Only support filling in the content of Name, Comment, EraseType, EraseSubtitleConfig, EraseWatermarkConfig, and ErasePrivacyConfig parameters in the "<a href="https://www.tencentcloud.com/document/api/862/123732?from_cn_redirect=1">modify intelligent erasure template</a>" interface. Currently only support configuring the above parameters in the template, other parameters are not required. If other parameters are included, the system will automatically ignore them.</li></ol> 
     * @return MPSModifyTemplateParams <p>MPS modifies template parameters. This parameter is used for passing through to the media processing service (MPS) to modify user-defined MPS task templates from the VOD side.<br> Currently only support modifying templates of the following task types in this way:</p><ol><li>Audio and video enhancement: Only support filling in the content of Name, Comment, RemoveVideo, RemoveAudio, VideoTemplate, AudioTemplate, and EnhanceConfig parameters in the "<a href="https://www.tencentcloud.com/document/api/862/37578?from_cn_redirect=1">modify transcoding template</a>" interface. Currently only support configuring the above parameters in the template, other parameters are not required. If other parameters are included, the system will automatically ignore them.</li><li>AI analysis: Only support filling in the content of Name, Comment, ClassificationConfigure, TagConfigure, CoverConfigure, and FrameTagConfigure parameters in the "<a href="https://www.tencentcloud.com/document/api/862/40246?from_cn_redirect=1">modify content analysis template</a>" interface. Currently only support configuring the above parameters in the template, other parameters are not required. If other parameters are included, the system will automatically ignore them.</li><li>Intelligent caption: Only support filling in the content of Name, Comment, TranslateSwitch, VideoSrcLanguage, SubtitleFormat, SubtitleType, AsrHotWordsConfigure, TranslateDstLanguage, and ProcessType parameters in the "<a href="https://www.tencentcloud.com/document/api/862/117001?from_cn_redirect=1">modify intelligent caption template</a>" interface. Currently only support configuring the above parameters in the template, other parameters are not required. If other parameters are included, the system will automatically ignore them.</li><li>Intelligent erasure: Only support filling in the content of Name, Comment, EraseType, EraseSubtitleConfig, EraseWatermarkConfig, and ErasePrivacyConfig parameters in the "<a href="https://www.tencentcloud.com/document/api/862/123732?from_cn_redirect=1">modify intelligent erasure template</a>" interface. Currently only support configuring the above parameters in the template, other parameters are not required. If other parameters are included, the system will automatically ignore them.</li></ol>
     */
    public String getMPSModifyTemplateParams() {
        return this.MPSModifyTemplateParams;
    }

    /**
     * Set <p>MPS modifies template parameters. This parameter is used for passing through to the media processing service (MPS) to modify user-defined MPS task templates from the VOD side.<br> Currently only support modifying templates of the following task types in this way:</p><ol><li>Audio and video enhancement: Only support filling in the content of Name, Comment, RemoveVideo, RemoveAudio, VideoTemplate, AudioTemplate, and EnhanceConfig parameters in the "<a href="https://www.tencentcloud.com/document/api/862/37578?from_cn_redirect=1">modify transcoding template</a>" interface. Currently only support configuring the above parameters in the template, other parameters are not required. If other parameters are included, the system will automatically ignore them.</li><li>AI analysis: Only support filling in the content of Name, Comment, ClassificationConfigure, TagConfigure, CoverConfigure, and FrameTagConfigure parameters in the "<a href="https://www.tencentcloud.com/document/api/862/40246?from_cn_redirect=1">modify content analysis template</a>" interface. Currently only support configuring the above parameters in the template, other parameters are not required. If other parameters are included, the system will automatically ignore them.</li><li>Intelligent caption: Only support filling in the content of Name, Comment, TranslateSwitch, VideoSrcLanguage, SubtitleFormat, SubtitleType, AsrHotWordsConfigure, TranslateDstLanguage, and ProcessType parameters in the "<a href="https://www.tencentcloud.com/document/api/862/117001?from_cn_redirect=1">modify intelligent caption template</a>" interface. Currently only support configuring the above parameters in the template, other parameters are not required. If other parameters are included, the system will automatically ignore them.</li><li>Intelligent erasure: Only support filling in the content of Name, Comment, EraseType, EraseSubtitleConfig, EraseWatermarkConfig, and ErasePrivacyConfig parameters in the "<a href="https://www.tencentcloud.com/document/api/862/123732?from_cn_redirect=1">modify intelligent erasure template</a>" interface. Currently only support configuring the above parameters in the template, other parameters are not required. If other parameters are included, the system will automatically ignore them.</li></ol>
     * @param MPSModifyTemplateParams <p>MPS modifies template parameters. This parameter is used for passing through to the media processing service (MPS) to modify user-defined MPS task templates from the VOD side.<br> Currently only support modifying templates of the following task types in this way:</p><ol><li>Audio and video enhancement: Only support filling in the content of Name, Comment, RemoveVideo, RemoveAudio, VideoTemplate, AudioTemplate, and EnhanceConfig parameters in the "<a href="https://www.tencentcloud.com/document/api/862/37578?from_cn_redirect=1">modify transcoding template</a>" interface. Currently only support configuring the above parameters in the template, other parameters are not required. If other parameters are included, the system will automatically ignore them.</li><li>AI analysis: Only support filling in the content of Name, Comment, ClassificationConfigure, TagConfigure, CoverConfigure, and FrameTagConfigure parameters in the "<a href="https://www.tencentcloud.com/document/api/862/40246?from_cn_redirect=1">modify content analysis template</a>" interface. Currently only support configuring the above parameters in the template, other parameters are not required. If other parameters are included, the system will automatically ignore them.</li><li>Intelligent caption: Only support filling in the content of Name, Comment, TranslateSwitch, VideoSrcLanguage, SubtitleFormat, SubtitleType, AsrHotWordsConfigure, TranslateDstLanguage, and ProcessType parameters in the "<a href="https://www.tencentcloud.com/document/api/862/117001?from_cn_redirect=1">modify intelligent caption template</a>" interface. Currently only support configuring the above parameters in the template, other parameters are not required. If other parameters are included, the system will automatically ignore them.</li><li>Intelligent erasure: Only support filling in the content of Name, Comment, EraseType, EraseSubtitleConfig, EraseWatermarkConfig, and ErasePrivacyConfig parameters in the "<a href="https://www.tencentcloud.com/document/api/862/123732?from_cn_redirect=1">modify intelligent erasure template</a>" interface. Currently only support configuring the above parameters in the template, other parameters are not required. If other parameters are included, the system will automatically ignore them.</li></ol>
     */
    public void setMPSModifyTemplateParams(String MPSModifyTemplateParams) {
        this.MPSModifyTemplateParams = MPSModifyTemplateParams;
    }

    /**
     * Get <p>Intelligent analysis template parameter. Valid when MPSModifyTemplateParams is empty.</p> 
     * @return AIAnalysisTemplate <p>Intelligent analysis template parameter. Valid when MPSModifyTemplateParams is empty.</p>
     */
    public MPSAIAnalysisTemplateForUpdate getAIAnalysisTemplate() {
        return this.AIAnalysisTemplate;
    }

    /**
     * Set <p>Intelligent analysis template parameter. Valid when MPSModifyTemplateParams is empty.</p>
     * @param AIAnalysisTemplate <p>Intelligent analysis template parameter. Valid when MPSModifyTemplateParams is empty.</p>
     */
    public void setAIAnalysisTemplate(MPSAIAnalysisTemplateForUpdate AIAnalysisTemplate) {
        this.AIAnalysisTemplate = AIAnalysisTemplate;
    }

    /**
     * Get <p>Intelligent subtitle template parameter. Valid when MPSModifyTemplateParams is empty.</p> 
     * @return SmartSubtitleTemplate <p>Intelligent subtitle template parameter. Valid when MPSModifyTemplateParams is empty.</p>
     */
    public MPSSmartSubtitleTemplateForUpdate getSmartSubtitleTemplate() {
        return this.SmartSubtitleTemplate;
    }

    /**
     * Set <p>Intelligent subtitle template parameter. Valid when MPSModifyTemplateParams is empty.</p>
     * @param SmartSubtitleTemplate <p>Intelligent subtitle template parameter. Valid when MPSModifyTemplateParams is empty.</p>
     */
    public void setSmartSubtitleTemplate(MPSSmartSubtitleTemplateForUpdate SmartSubtitleTemplate) {
        this.SmartSubtitleTemplate = SmartSubtitleTemplate;
    }

    /**
     * Get <p>Intelligent erasure template parameter. Valid when MPSModifyTemplateParams is empty.</p> 
     * @return SmartEraseTemplate <p>Intelligent erasure template parameter. Valid when MPSModifyTemplateParams is empty.</p>
     */
    public MPSSmartEraseTemplateForUpdate getSmartEraseTemplate() {
        return this.SmartEraseTemplate;
    }

    /**
     * Set <p>Intelligent erasure template parameter. Valid when MPSModifyTemplateParams is empty.</p>
     * @param SmartEraseTemplate <p>Intelligent erasure template parameter. Valid when MPSModifyTemplateParams is empty.</p>
     */
    public void setSmartEraseTemplate(MPSSmartEraseTemplateForUpdate SmartEraseTemplate) {
        this.SmartEraseTemplate = SmartEraseTemplate;
    }

    public ModifyMPSTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMPSTemplateRequest(ModifyMPSTemplateRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.TemplateType != null) {
            this.TemplateType = new String(source.TemplateType);
        }
        if (source.MPSModifyTemplateParams != null) {
            this.MPSModifyTemplateParams = new String(source.MPSModifyTemplateParams);
        }
        if (source.AIAnalysisTemplate != null) {
            this.AIAnalysisTemplate = new MPSAIAnalysisTemplateForUpdate(source.AIAnalysisTemplate);
        }
        if (source.SmartSubtitleTemplate != null) {
            this.SmartSubtitleTemplate = new MPSSmartSubtitleTemplateForUpdate(source.SmartSubtitleTemplate);
        }
        if (source.SmartEraseTemplate != null) {
            this.SmartEraseTemplate = new MPSSmartEraseTemplateForUpdate(source.SmartEraseTemplate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "TemplateType", this.TemplateType);
        this.setParamSimple(map, prefix + "MPSModifyTemplateParams", this.MPSModifyTemplateParams);
        this.setParamObj(map, prefix + "AIAnalysisTemplate.", this.AIAnalysisTemplate);
        this.setParamObj(map, prefix + "SmartSubtitleTemplate.", this.SmartSubtitleTemplate);
        this.setParamObj(map, prefix + "SmartEraseTemplate.", this.SmartEraseTemplate);

    }
}


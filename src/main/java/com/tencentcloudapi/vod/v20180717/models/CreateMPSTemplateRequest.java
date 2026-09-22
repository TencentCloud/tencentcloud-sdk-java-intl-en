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

public class CreateMPSTemplateRequest extends AbstractModel {

    /**
    * <p><b>VOD <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID.</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>Type of MPS template to create. Value:</p><li>AIAnalysis: Create intelligent analysis template.</li><li>SmartSubtitle: Create intelligent subtitle template.</li><li>SmartErase: Create intelligent erasure template.</li><li>EmbedSubtitle: Create subtitle suppression template.</li>
    */
    @SerializedName("TemplateType")
    @Expose
    private String TemplateType;

    /**
    * <p>MPS template creation parameter. This parameter is used to pass through to the media processing service (MPS) to create a user-defined MPS task template from VOD.<br>Currently, only the following task types can be created as templates using this method:</p><ol><li>Intelligent Analysis: only supports filling in the content of the Name, Comment, ClassificationConfigure, TagConfigure, CoverConfigure, and FrameTagConfigure parameters in the <a href="https://www.tencentcloud.com/document/api/862/40249?from_cn_redirect=1">Create Content Analysis Template</a> API. Currently, only the above parameters can be configured in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them.</li><li>Smart subtitling: only supports filling in the content of the Name, Comment, TranslateSwitch, VideoSrcLanguage, SubtitleFormat, SubtitleType, AsrHotWordsConfigure, TranslateDstLanguage, and ProcessType parameters in the <a href="https://www.tencentcloud.com/document/api/862/117004?from_cn_redirect=1">Create Smart Subtitle Template</a> API. Currently, only the above parameters can be configured in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them.</li><li>Intelligent erasure: only supports filling in the content of the Name, Comment, EraseType, EraseSubtitleConfig, EraseWatermarkConfig, and ErasePrivacyConfig parameters in the <a href="https://www.tencentcloud.com/document/api/862/123735?from_cn_redirect=1">Create Intelligent Erasure Template</a> API. Currently, only the above parameters can be configured in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them.</li></ol><p>Currently, only the above parameters can be configured in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them. The above pass-through parameters are represented in JSON.</p>
    */
    @SerializedName("MPSCreateTemplateParams")
    @Expose
    private String MPSCreateTemplateParams;

    /**
    * <p>Intelligent analysis template parameter. Valid when MPSCreateTemplateParams is empty.</p>
    */
    @SerializedName("AIAnalysisTemplate")
    @Expose
    private MPSAIAnalysisTemplate AIAnalysisTemplate;

    /**
    * <p>Smart subtitle template parameter. Valid when MPSCreateTemplateParams is empty.</p>
    */
    @SerializedName("SmartSubtitleTemplate")
    @Expose
    private MPSSmartSubtitleTemplate SmartSubtitleTemplate;

    /**
    * <p>Intelligent erasure template parameter. Valid when MPSCreateTemplateParams is empty.</p>
    */
    @SerializedName("SmartEraseTemplate")
    @Expose
    private MPSSmartEraseTemplate SmartEraseTemplate;

    /**
    * <p>Subtitle suppression template parameter. Valid when MPSCreateTemplateParams is empty.</p>
    */
    @SerializedName("EmbedSubtitleTemplate")
    @Expose
    private MPSEmbedSubtitleTemplate EmbedSubtitleTemplate;

    /**
     * Get <p><b>VOD <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID.</b></p> 
     * @return SubAppId <p><b>VOD <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID.</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>VOD <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID.</b></p>
     * @param SubAppId <p><b>VOD <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID.</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>Type of MPS template to create. Value:</p><li>AIAnalysis: Create intelligent analysis template.</li><li>SmartSubtitle: Create intelligent subtitle template.</li><li>SmartErase: Create intelligent erasure template.</li><li>EmbedSubtitle: Create subtitle suppression template.</li> 
     * @return TemplateType <p>Type of MPS template to create. Value:</p><li>AIAnalysis: Create intelligent analysis template.</li><li>SmartSubtitle: Create intelligent subtitle template.</li><li>SmartErase: Create intelligent erasure template.</li><li>EmbedSubtitle: Create subtitle suppression template.</li>
     */
    public String getTemplateType() {
        return this.TemplateType;
    }

    /**
     * Set <p>Type of MPS template to create. Value:</p><li>AIAnalysis: Create intelligent analysis template.</li><li>SmartSubtitle: Create intelligent subtitle template.</li><li>SmartErase: Create intelligent erasure template.</li><li>EmbedSubtitle: Create subtitle suppression template.</li>
     * @param TemplateType <p>Type of MPS template to create. Value:</p><li>AIAnalysis: Create intelligent analysis template.</li><li>SmartSubtitle: Create intelligent subtitle template.</li><li>SmartErase: Create intelligent erasure template.</li><li>EmbedSubtitle: Create subtitle suppression template.</li>
     */
    public void setTemplateType(String TemplateType) {
        this.TemplateType = TemplateType;
    }

    /**
     * Get <p>MPS template creation parameter. This parameter is used to pass through to the media processing service (MPS) to create a user-defined MPS task template from VOD.<br>Currently, only the following task types can be created as templates using this method:</p><ol><li>Intelligent Analysis: only supports filling in the content of the Name, Comment, ClassificationConfigure, TagConfigure, CoverConfigure, and FrameTagConfigure parameters in the <a href="https://www.tencentcloud.com/document/api/862/40249?from_cn_redirect=1">Create Content Analysis Template</a> API. Currently, only the above parameters can be configured in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them.</li><li>Smart subtitling: only supports filling in the content of the Name, Comment, TranslateSwitch, VideoSrcLanguage, SubtitleFormat, SubtitleType, AsrHotWordsConfigure, TranslateDstLanguage, and ProcessType parameters in the <a href="https://www.tencentcloud.com/document/api/862/117004?from_cn_redirect=1">Create Smart Subtitle Template</a> API. Currently, only the above parameters can be configured in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them.</li><li>Intelligent erasure: only supports filling in the content of the Name, Comment, EraseType, EraseSubtitleConfig, EraseWatermarkConfig, and ErasePrivacyConfig parameters in the <a href="https://www.tencentcloud.com/document/api/862/123735?from_cn_redirect=1">Create Intelligent Erasure Template</a> API. Currently, only the above parameters can be configured in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them.</li></ol><p>Currently, only the above parameters can be configured in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them. The above pass-through parameters are represented in JSON.</p> 
     * @return MPSCreateTemplateParams <p>MPS template creation parameter. This parameter is used to pass through to the media processing service (MPS) to create a user-defined MPS task template from VOD.<br>Currently, only the following task types can be created as templates using this method:</p><ol><li>Intelligent Analysis: only supports filling in the content of the Name, Comment, ClassificationConfigure, TagConfigure, CoverConfigure, and FrameTagConfigure parameters in the <a href="https://www.tencentcloud.com/document/api/862/40249?from_cn_redirect=1">Create Content Analysis Template</a> API. Currently, only the above parameters can be configured in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them.</li><li>Smart subtitling: only supports filling in the content of the Name, Comment, TranslateSwitch, VideoSrcLanguage, SubtitleFormat, SubtitleType, AsrHotWordsConfigure, TranslateDstLanguage, and ProcessType parameters in the <a href="https://www.tencentcloud.com/document/api/862/117004?from_cn_redirect=1">Create Smart Subtitle Template</a> API. Currently, only the above parameters can be configured in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them.</li><li>Intelligent erasure: only supports filling in the content of the Name, Comment, EraseType, EraseSubtitleConfig, EraseWatermarkConfig, and ErasePrivacyConfig parameters in the <a href="https://www.tencentcloud.com/document/api/862/123735?from_cn_redirect=1">Create Intelligent Erasure Template</a> API. Currently, only the above parameters can be configured in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them.</li></ol><p>Currently, only the above parameters can be configured in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them. The above pass-through parameters are represented in JSON.</p>
     */
    public String getMPSCreateTemplateParams() {
        return this.MPSCreateTemplateParams;
    }

    /**
     * Set <p>MPS template creation parameter. This parameter is used to pass through to the media processing service (MPS) to create a user-defined MPS task template from VOD.<br>Currently, only the following task types can be created as templates using this method:</p><ol><li>Intelligent Analysis: only supports filling in the content of the Name, Comment, ClassificationConfigure, TagConfigure, CoverConfigure, and FrameTagConfigure parameters in the <a href="https://www.tencentcloud.com/document/api/862/40249?from_cn_redirect=1">Create Content Analysis Template</a> API. Currently, only the above parameters can be configured in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them.</li><li>Smart subtitling: only supports filling in the content of the Name, Comment, TranslateSwitch, VideoSrcLanguage, SubtitleFormat, SubtitleType, AsrHotWordsConfigure, TranslateDstLanguage, and ProcessType parameters in the <a href="https://www.tencentcloud.com/document/api/862/117004?from_cn_redirect=1">Create Smart Subtitle Template</a> API. Currently, only the above parameters can be configured in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them.</li><li>Intelligent erasure: only supports filling in the content of the Name, Comment, EraseType, EraseSubtitleConfig, EraseWatermarkConfig, and ErasePrivacyConfig parameters in the <a href="https://www.tencentcloud.com/document/api/862/123735?from_cn_redirect=1">Create Intelligent Erasure Template</a> API. Currently, only the above parameters can be configured in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them.</li></ol><p>Currently, only the above parameters can be configured in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them. The above pass-through parameters are represented in JSON.</p>
     * @param MPSCreateTemplateParams <p>MPS template creation parameter. This parameter is used to pass through to the media processing service (MPS) to create a user-defined MPS task template from VOD.<br>Currently, only the following task types can be created as templates using this method:</p><ol><li>Intelligent Analysis: only supports filling in the content of the Name, Comment, ClassificationConfigure, TagConfigure, CoverConfigure, and FrameTagConfigure parameters in the <a href="https://www.tencentcloud.com/document/api/862/40249?from_cn_redirect=1">Create Content Analysis Template</a> API. Currently, only the above parameters can be configured in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them.</li><li>Smart subtitling: only supports filling in the content of the Name, Comment, TranslateSwitch, VideoSrcLanguage, SubtitleFormat, SubtitleType, AsrHotWordsConfigure, TranslateDstLanguage, and ProcessType parameters in the <a href="https://www.tencentcloud.com/document/api/862/117004?from_cn_redirect=1">Create Smart Subtitle Template</a> API. Currently, only the above parameters can be configured in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them.</li><li>Intelligent erasure: only supports filling in the content of the Name, Comment, EraseType, EraseSubtitleConfig, EraseWatermarkConfig, and ErasePrivacyConfig parameters in the <a href="https://www.tencentcloud.com/document/api/862/123735?from_cn_redirect=1">Create Intelligent Erasure Template</a> API. Currently, only the above parameters can be configured in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them.</li></ol><p>Currently, only the above parameters can be configured in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them. The above pass-through parameters are represented in JSON.</p>
     */
    public void setMPSCreateTemplateParams(String MPSCreateTemplateParams) {
        this.MPSCreateTemplateParams = MPSCreateTemplateParams;
    }

    /**
     * Get <p>Intelligent analysis template parameter. Valid when MPSCreateTemplateParams is empty.</p> 
     * @return AIAnalysisTemplate <p>Intelligent analysis template parameter. Valid when MPSCreateTemplateParams is empty.</p>
     */
    public MPSAIAnalysisTemplate getAIAnalysisTemplate() {
        return this.AIAnalysisTemplate;
    }

    /**
     * Set <p>Intelligent analysis template parameter. Valid when MPSCreateTemplateParams is empty.</p>
     * @param AIAnalysisTemplate <p>Intelligent analysis template parameter. Valid when MPSCreateTemplateParams is empty.</p>
     */
    public void setAIAnalysisTemplate(MPSAIAnalysisTemplate AIAnalysisTemplate) {
        this.AIAnalysisTemplate = AIAnalysisTemplate;
    }

    /**
     * Get <p>Smart subtitle template parameter. Valid when MPSCreateTemplateParams is empty.</p> 
     * @return SmartSubtitleTemplate <p>Smart subtitle template parameter. Valid when MPSCreateTemplateParams is empty.</p>
     */
    public MPSSmartSubtitleTemplate getSmartSubtitleTemplate() {
        return this.SmartSubtitleTemplate;
    }

    /**
     * Set <p>Smart subtitle template parameter. Valid when MPSCreateTemplateParams is empty.</p>
     * @param SmartSubtitleTemplate <p>Smart subtitle template parameter. Valid when MPSCreateTemplateParams is empty.</p>
     */
    public void setSmartSubtitleTemplate(MPSSmartSubtitleTemplate SmartSubtitleTemplate) {
        this.SmartSubtitleTemplate = SmartSubtitleTemplate;
    }

    /**
     * Get <p>Intelligent erasure template parameter. Valid when MPSCreateTemplateParams is empty.</p> 
     * @return SmartEraseTemplate <p>Intelligent erasure template parameter. Valid when MPSCreateTemplateParams is empty.</p>
     */
    public MPSSmartEraseTemplate getSmartEraseTemplate() {
        return this.SmartEraseTemplate;
    }

    /**
     * Set <p>Intelligent erasure template parameter. Valid when MPSCreateTemplateParams is empty.</p>
     * @param SmartEraseTemplate <p>Intelligent erasure template parameter. Valid when MPSCreateTemplateParams is empty.</p>
     */
    public void setSmartEraseTemplate(MPSSmartEraseTemplate SmartEraseTemplate) {
        this.SmartEraseTemplate = SmartEraseTemplate;
    }

    /**
     * Get <p>Subtitle suppression template parameter. Valid when MPSCreateTemplateParams is empty.</p> 
     * @return EmbedSubtitleTemplate <p>Subtitle suppression template parameter. Valid when MPSCreateTemplateParams is empty.</p>
     */
    public MPSEmbedSubtitleTemplate getEmbedSubtitleTemplate() {
        return this.EmbedSubtitleTemplate;
    }

    /**
     * Set <p>Subtitle suppression template parameter. Valid when MPSCreateTemplateParams is empty.</p>
     * @param EmbedSubtitleTemplate <p>Subtitle suppression template parameter. Valid when MPSCreateTemplateParams is empty.</p>
     */
    public void setEmbedSubtitleTemplate(MPSEmbedSubtitleTemplate EmbedSubtitleTemplate) {
        this.EmbedSubtitleTemplate = EmbedSubtitleTemplate;
    }

    public CreateMPSTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateMPSTemplateRequest(CreateMPSTemplateRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.TemplateType != null) {
            this.TemplateType = new String(source.TemplateType);
        }
        if (source.MPSCreateTemplateParams != null) {
            this.MPSCreateTemplateParams = new String(source.MPSCreateTemplateParams);
        }
        if (source.AIAnalysisTemplate != null) {
            this.AIAnalysisTemplate = new MPSAIAnalysisTemplate(source.AIAnalysisTemplate);
        }
        if (source.SmartSubtitleTemplate != null) {
            this.SmartSubtitleTemplate = new MPSSmartSubtitleTemplate(source.SmartSubtitleTemplate);
        }
        if (source.SmartEraseTemplate != null) {
            this.SmartEraseTemplate = new MPSSmartEraseTemplate(source.SmartEraseTemplate);
        }
        if (source.EmbedSubtitleTemplate != null) {
            this.EmbedSubtitleTemplate = new MPSEmbedSubtitleTemplate(source.EmbedSubtitleTemplate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "TemplateType", this.TemplateType);
        this.setParamSimple(map, prefix + "MPSCreateTemplateParams", this.MPSCreateTemplateParams);
        this.setParamObj(map, prefix + "AIAnalysisTemplate.", this.AIAnalysisTemplate);
        this.setParamObj(map, prefix + "SmartSubtitleTemplate.", this.SmartSubtitleTemplate);
        this.setParamObj(map, prefix + "SmartEraseTemplate.", this.SmartEraseTemplate);
        this.setParamObj(map, prefix + "EmbedSubtitleTemplate.", this.EmbedSubtitleTemplate);

    }
}


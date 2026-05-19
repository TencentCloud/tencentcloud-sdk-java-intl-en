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
    * <p><b>Video-on-demand (VOD) <a href="/document/product/266/14574?from_cn_redirect=1">application</a> ID.</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>Type of the MPS template to create. Value:</p><li>AIAnalysis: Create an intelligent analysis template.</li><li>SmartSubtitle: Create an intelligent subtitle template.</li><li>SmartErase: Create an intelligent erasure template.</li>
    */
    @SerializedName("TemplateType")
    @Expose
    private String TemplateType;

    /**
    * <p>MPS template creation parameters. This parameter is used for transparent transmission to the media processing service (MPS) to create user-defined MPS task templates from the VOD side.<br>Currently only supports creating templates of the following task types through this method:</p><ol><li>AI analysis: only supports filling in the content of Name, Comment, ClassificationConfigure, TagConfigure, CoverConfigure, and FrameTagConfigure parameters in the "<a href="https://www.tencentcloud.com/document/api/862/40249?from_cn_redirect=1">create content analysis template</a>" API. Currently only supports configuring the above parameters in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them.</li><li>Smart subtitling: only supports filling in the content of Name, Comment, TranslateSwitch, VideoSrcLanguage, SubtitleFormat, SubtitleType, AsrHotWordsConfigure, TranslateDstLanguage, and ProcessType parameters in the "<a href="https://www.tencentcloud.com/document/api/862/117004?from_cn_redirect=1">create intelligent caption template</a>" API. Currently only supports configuring the above parameters in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them.</li><li>Intelligent erasure: only supports filling in the content of Name, Comment, EraseType, EraseSubtitleConfig, EraseWatermarkConfig, and ErasePrivacyConfig parameters in the "<a href="https://www.tencentcloud.com/document/api/862/123735?from_cn_redirect=1">create intelligent erasure template</a>" API. Currently only supports configuring the above parameters in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them.</li></ol><p>Currently, only the above parameters can be configured in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them. The above pass-through parameters are represented in JSON format.</p>
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
    * <p>Parameter of the intelligent subtitle template. Valid when MPSCreateTemplateParams is empty.</p>
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
     * Get <p><b>Video-on-demand (VOD) <a href="/document/product/266/14574?from_cn_redirect=1">application</a> ID.</b></p> 
     * @return SubAppId <p><b>Video-on-demand (VOD) <a href="/document/product/266/14574?from_cn_redirect=1">application</a> ID.</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>Video-on-demand (VOD) <a href="/document/product/266/14574?from_cn_redirect=1">application</a> ID.</b></p>
     * @param SubAppId <p><b>Video-on-demand (VOD) <a href="/document/product/266/14574?from_cn_redirect=1">application</a> ID.</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>Type of the MPS template to create. Value:</p><li>AIAnalysis: Create an intelligent analysis template.</li><li>SmartSubtitle: Create an intelligent subtitle template.</li><li>SmartErase: Create an intelligent erasure template.</li> 
     * @return TemplateType <p>Type of the MPS template to create. Value:</p><li>AIAnalysis: Create an intelligent analysis template.</li><li>SmartSubtitle: Create an intelligent subtitle template.</li><li>SmartErase: Create an intelligent erasure template.</li>
     */
    public String getTemplateType() {
        return this.TemplateType;
    }

    /**
     * Set <p>Type of the MPS template to create. Value:</p><li>AIAnalysis: Create an intelligent analysis template.</li><li>SmartSubtitle: Create an intelligent subtitle template.</li><li>SmartErase: Create an intelligent erasure template.</li>
     * @param TemplateType <p>Type of the MPS template to create. Value:</p><li>AIAnalysis: Create an intelligent analysis template.</li><li>SmartSubtitle: Create an intelligent subtitle template.</li><li>SmartErase: Create an intelligent erasure template.</li>
     */
    public void setTemplateType(String TemplateType) {
        this.TemplateType = TemplateType;
    }

    /**
     * Get <p>MPS template creation parameters. This parameter is used for transparent transmission to the media processing service (MPS) to create user-defined MPS task templates from the VOD side.<br>Currently only supports creating templates of the following task types through this method:</p><ol><li>AI analysis: only supports filling in the content of Name, Comment, ClassificationConfigure, TagConfigure, CoverConfigure, and FrameTagConfigure parameters in the "<a href="https://www.tencentcloud.com/document/api/862/40249?from_cn_redirect=1">create content analysis template</a>" API. Currently only supports configuring the above parameters in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them.</li><li>Smart subtitling: only supports filling in the content of Name, Comment, TranslateSwitch, VideoSrcLanguage, SubtitleFormat, SubtitleType, AsrHotWordsConfigure, TranslateDstLanguage, and ProcessType parameters in the "<a href="https://www.tencentcloud.com/document/api/862/117004?from_cn_redirect=1">create intelligent caption template</a>" API. Currently only supports configuring the above parameters in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them.</li><li>Intelligent erasure: only supports filling in the content of Name, Comment, EraseType, EraseSubtitleConfig, EraseWatermarkConfig, and ErasePrivacyConfig parameters in the "<a href="https://www.tencentcloud.com/document/api/862/123735?from_cn_redirect=1">create intelligent erasure template</a>" API. Currently only supports configuring the above parameters in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them.</li></ol><p>Currently, only the above parameters can be configured in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them. The above pass-through parameters are represented in JSON format.</p> 
     * @return MPSCreateTemplateParams <p>MPS template creation parameters. This parameter is used for transparent transmission to the media processing service (MPS) to create user-defined MPS task templates from the VOD side.<br>Currently only supports creating templates of the following task types through this method:</p><ol><li>AI analysis: only supports filling in the content of Name, Comment, ClassificationConfigure, TagConfigure, CoverConfigure, and FrameTagConfigure parameters in the "<a href="https://www.tencentcloud.com/document/api/862/40249?from_cn_redirect=1">create content analysis template</a>" API. Currently only supports configuring the above parameters in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them.</li><li>Smart subtitling: only supports filling in the content of Name, Comment, TranslateSwitch, VideoSrcLanguage, SubtitleFormat, SubtitleType, AsrHotWordsConfigure, TranslateDstLanguage, and ProcessType parameters in the "<a href="https://www.tencentcloud.com/document/api/862/117004?from_cn_redirect=1">create intelligent caption template</a>" API. Currently only supports configuring the above parameters in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them.</li><li>Intelligent erasure: only supports filling in the content of Name, Comment, EraseType, EraseSubtitleConfig, EraseWatermarkConfig, and ErasePrivacyConfig parameters in the "<a href="https://www.tencentcloud.com/document/api/862/123735?from_cn_redirect=1">create intelligent erasure template</a>" API. Currently only supports configuring the above parameters in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them.</li></ol><p>Currently, only the above parameters can be configured in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them. The above pass-through parameters are represented in JSON format.</p>
     */
    public String getMPSCreateTemplateParams() {
        return this.MPSCreateTemplateParams;
    }

    /**
     * Set <p>MPS template creation parameters. This parameter is used for transparent transmission to the media processing service (MPS) to create user-defined MPS task templates from the VOD side.<br>Currently only supports creating templates of the following task types through this method:</p><ol><li>AI analysis: only supports filling in the content of Name, Comment, ClassificationConfigure, TagConfigure, CoverConfigure, and FrameTagConfigure parameters in the "<a href="https://www.tencentcloud.com/document/api/862/40249?from_cn_redirect=1">create content analysis template</a>" API. Currently only supports configuring the above parameters in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them.</li><li>Smart subtitling: only supports filling in the content of Name, Comment, TranslateSwitch, VideoSrcLanguage, SubtitleFormat, SubtitleType, AsrHotWordsConfigure, TranslateDstLanguage, and ProcessType parameters in the "<a href="https://www.tencentcloud.com/document/api/862/117004?from_cn_redirect=1">create intelligent caption template</a>" API. Currently only supports configuring the above parameters in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them.</li><li>Intelligent erasure: only supports filling in the content of Name, Comment, EraseType, EraseSubtitleConfig, EraseWatermarkConfig, and ErasePrivacyConfig parameters in the "<a href="https://www.tencentcloud.com/document/api/862/123735?from_cn_redirect=1">create intelligent erasure template</a>" API. Currently only supports configuring the above parameters in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them.</li></ol><p>Currently, only the above parameters can be configured in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them. The above pass-through parameters are represented in JSON format.</p>
     * @param MPSCreateTemplateParams <p>MPS template creation parameters. This parameter is used for transparent transmission to the media processing service (MPS) to create user-defined MPS task templates from the VOD side.<br>Currently only supports creating templates of the following task types through this method:</p><ol><li>AI analysis: only supports filling in the content of Name, Comment, ClassificationConfigure, TagConfigure, CoverConfigure, and FrameTagConfigure parameters in the "<a href="https://www.tencentcloud.com/document/api/862/40249?from_cn_redirect=1">create content analysis template</a>" API. Currently only supports configuring the above parameters in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them.</li><li>Smart subtitling: only supports filling in the content of Name, Comment, TranslateSwitch, VideoSrcLanguage, SubtitleFormat, SubtitleType, AsrHotWordsConfigure, TranslateDstLanguage, and ProcessType parameters in the "<a href="https://www.tencentcloud.com/document/api/862/117004?from_cn_redirect=1">create intelligent caption template</a>" API. Currently only supports configuring the above parameters in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them.</li><li>Intelligent erasure: only supports filling in the content of Name, Comment, EraseType, EraseSubtitleConfig, EraseWatermarkConfig, and ErasePrivacyConfig parameters in the "<a href="https://www.tencentcloud.com/document/api/862/123735?from_cn_redirect=1">create intelligent erasure template</a>" API. Currently only supports configuring the above parameters in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them.</li></ol><p>Currently, only the above parameters can be configured in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them. The above pass-through parameters are represented in JSON format.</p>
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
     * Get <p>Parameter of the intelligent subtitle template. Valid when MPSCreateTemplateParams is empty.</p> 
     * @return SmartSubtitleTemplate <p>Parameter of the intelligent subtitle template. Valid when MPSCreateTemplateParams is empty.</p>
     */
    public MPSSmartSubtitleTemplate getSmartSubtitleTemplate() {
        return this.SmartSubtitleTemplate;
    }

    /**
     * Set <p>Parameter of the intelligent subtitle template. Valid when MPSCreateTemplateParams is empty.</p>
     * @param SmartSubtitleTemplate <p>Parameter of the intelligent subtitle template. Valid when MPSCreateTemplateParams is empty.</p>
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

    }
}


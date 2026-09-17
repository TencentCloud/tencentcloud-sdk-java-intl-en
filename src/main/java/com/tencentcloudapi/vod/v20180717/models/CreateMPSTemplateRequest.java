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
    * 
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 
    */
    @SerializedName("TemplateType")
    @Expose
    private String TemplateType;

    /**
    * 
    */
    @SerializedName("MPSCreateTemplateParams")
    @Expose
    private String MPSCreateTemplateParams;

    /**
    * 
    */
    @SerializedName("AIAnalysisTemplate")
    @Expose
    private MPSAIAnalysisTemplate AIAnalysisTemplate;

    /**
    * 
    */
    @SerializedName("SmartSubtitleTemplate")
    @Expose
    private MPSSmartSubtitleTemplate SmartSubtitleTemplate;

    /**
    * 
    */
    @SerializedName("SmartEraseTemplate")
    @Expose
    private MPSSmartEraseTemplate SmartEraseTemplate;

    /**
    * 
    */
    @SerializedName("EmbedSubtitleTemplate")
    @Expose
    private MPSEmbedSubtitleTemplate EmbedSubtitleTemplate;

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
     * @return TemplateType 
     */
    public String getTemplateType() {
        return this.TemplateType;
    }

    /**
     * Set 
     * @param TemplateType 
     */
    public void setTemplateType(String TemplateType) {
        this.TemplateType = TemplateType;
    }

    /**
     * Get  
     * @return MPSCreateTemplateParams 
     */
    public String getMPSCreateTemplateParams() {
        return this.MPSCreateTemplateParams;
    }

    /**
     * Set 
     * @param MPSCreateTemplateParams 
     */
    public void setMPSCreateTemplateParams(String MPSCreateTemplateParams) {
        this.MPSCreateTemplateParams = MPSCreateTemplateParams;
    }

    /**
     * Get  
     * @return AIAnalysisTemplate 
     */
    public MPSAIAnalysisTemplate getAIAnalysisTemplate() {
        return this.AIAnalysisTemplate;
    }

    /**
     * Set 
     * @param AIAnalysisTemplate 
     */
    public void setAIAnalysisTemplate(MPSAIAnalysisTemplate AIAnalysisTemplate) {
        this.AIAnalysisTemplate = AIAnalysisTemplate;
    }

    /**
     * Get  
     * @return SmartSubtitleTemplate 
     */
    public MPSSmartSubtitleTemplate getSmartSubtitleTemplate() {
        return this.SmartSubtitleTemplate;
    }

    /**
     * Set 
     * @param SmartSubtitleTemplate 
     */
    public void setSmartSubtitleTemplate(MPSSmartSubtitleTemplate SmartSubtitleTemplate) {
        this.SmartSubtitleTemplate = SmartSubtitleTemplate;
    }

    /**
     * Get  
     * @return SmartEraseTemplate 
     */
    public MPSSmartEraseTemplate getSmartEraseTemplate() {
        return this.SmartEraseTemplate;
    }

    /**
     * Set 
     * @param SmartEraseTemplate 
     */
    public void setSmartEraseTemplate(MPSSmartEraseTemplate SmartEraseTemplate) {
        this.SmartEraseTemplate = SmartEraseTemplate;
    }

    /**
     * Get  
     * @return EmbedSubtitleTemplate 
     */
    public MPSEmbedSubtitleTemplate getEmbedSubtitleTemplate() {
        return this.EmbedSubtitleTemplate;
    }

    /**
     * Set 
     * @param EmbedSubtitleTemplate 
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


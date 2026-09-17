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
    @SerializedName("MPSModifyTemplateParams")
    @Expose
    private String MPSModifyTemplateParams;

    /**
    * 
    */
    @SerializedName("AIAnalysisTemplate")
    @Expose
    private MPSAIAnalysisTemplateForUpdate AIAnalysisTemplate;

    /**
    * 
    */
    @SerializedName("SmartSubtitleTemplate")
    @Expose
    private MPSSmartSubtitleTemplateForUpdate SmartSubtitleTemplate;

    /**
    * 
    */
    @SerializedName("SmartEraseTemplate")
    @Expose
    private MPSSmartEraseTemplateForUpdate SmartEraseTemplate;

    /**
    * 
    */
    @SerializedName("EmbedSubtitleTemplate")
    @Expose
    private MPSEmbedSubtitleTemplateForUpdate EmbedSubtitleTemplate;

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
     * @return MPSModifyTemplateParams 
     */
    public String getMPSModifyTemplateParams() {
        return this.MPSModifyTemplateParams;
    }

    /**
     * Set 
     * @param MPSModifyTemplateParams 
     */
    public void setMPSModifyTemplateParams(String MPSModifyTemplateParams) {
        this.MPSModifyTemplateParams = MPSModifyTemplateParams;
    }

    /**
     * Get  
     * @return AIAnalysisTemplate 
     */
    public MPSAIAnalysisTemplateForUpdate getAIAnalysisTemplate() {
        return this.AIAnalysisTemplate;
    }

    /**
     * Set 
     * @param AIAnalysisTemplate 
     */
    public void setAIAnalysisTemplate(MPSAIAnalysisTemplateForUpdate AIAnalysisTemplate) {
        this.AIAnalysisTemplate = AIAnalysisTemplate;
    }

    /**
     * Get  
     * @return SmartSubtitleTemplate 
     */
    public MPSSmartSubtitleTemplateForUpdate getSmartSubtitleTemplate() {
        return this.SmartSubtitleTemplate;
    }

    /**
     * Set 
     * @param SmartSubtitleTemplate 
     */
    public void setSmartSubtitleTemplate(MPSSmartSubtitleTemplateForUpdate SmartSubtitleTemplate) {
        this.SmartSubtitleTemplate = SmartSubtitleTemplate;
    }

    /**
     * Get  
     * @return SmartEraseTemplate 
     */
    public MPSSmartEraseTemplateForUpdate getSmartEraseTemplate() {
        return this.SmartEraseTemplate;
    }

    /**
     * Set 
     * @param SmartEraseTemplate 
     */
    public void setSmartEraseTemplate(MPSSmartEraseTemplateForUpdate SmartEraseTemplate) {
        this.SmartEraseTemplate = SmartEraseTemplate;
    }

    /**
     * Get  
     * @return EmbedSubtitleTemplate 
     */
    public MPSEmbedSubtitleTemplateForUpdate getEmbedSubtitleTemplate() {
        return this.EmbedSubtitleTemplate;
    }

    /**
     * Set 
     * @param EmbedSubtitleTemplate 
     */
    public void setEmbedSubtitleTemplate(MPSEmbedSubtitleTemplateForUpdate EmbedSubtitleTemplate) {
        this.EmbedSubtitleTemplate = EmbedSubtitleTemplate;
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
        if (source.EmbedSubtitleTemplate != null) {
            this.EmbedSubtitleTemplate = new MPSEmbedSubtitleTemplateForUpdate(source.EmbedSubtitleTemplate);
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
        this.setParamObj(map, prefix + "EmbedSubtitleTemplate.", this.EmbedSubtitleTemplate);

    }
}


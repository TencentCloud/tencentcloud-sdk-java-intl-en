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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LLMSdkAccessItem extends AbstractModel {

    /**
    * <p>Service id.</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>Service name.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Remarks.</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>SDK access source. This parameter is optional.</p>
    */
    @SerializedName("SdkSource")
    @Expose
    private String SdkSource;

    /**
    * <p>Master switch.</p>
    */
    @SerializedName("MainStatus")
    @Expose
    private Boolean MainStatus;

    /**
    * <p>Rate limiting switch.</p>
    */
    @SerializedName("LimitRuleStatus")
    @Expose
    private Boolean LimitRuleStatus;

    /**
    * <p>Content security switch.</p>
    */
    @SerializedName("ContentRuleStatus")
    @Expose
    private Boolean ContentRuleStatus;

    /**
    * <p>Creation time.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>Modification time.</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * <p>Number of rate limiting rules.</p>
    */
    @SerializedName("LimitRuleCount")
    @Expose
    private Long LimitRuleCount;

    /**
    * <p>Number of content security rules.</p>
    */
    @SerializedName("ContentRuleCount")
    @Expose
    private Long ContentRuleCount;

    /**
    * <p>Tool call protection switch.</p>
    */
    @SerializedName("ToolCallStatus")
    @Expose
    private Boolean ToolCallStatus;

    /**
    * <p>llm inference protection switch.</p>
    */
    @SerializedName("LLMProtectStatus")
    @Expose
    private Boolean LLMProtectStatus;

    /**
    * <p>Content compliance detection switch.</p>
    */
    @SerializedName("ContentComplianceStatus")
    @Expose
    private Boolean ContentComplianceStatus;

    /**
    * <p>dlp protection switch.</p>
    */
    @SerializedName("DLPStatus")
    @Expose
    private Boolean DLPStatus;

    /**
    * <p>skills protection switch.</p>
    */
    @SerializedName("SkillsStatus")
    @Expose
    private Boolean SkillsStatus;

    /**
    * <p>Intent recognition detection switch.</p>
    */
    @SerializedName("IntentStatus")
    @Expose
    private Boolean IntentStatus;

    /**
    * <p>Malicious URL detection switch.</p>
    */
    @SerializedName("UrlDetectStatus")
    @Expose
    private Boolean UrlDetectStatus;

    /**
    * <p>Number of effective rules.</p>
    */
    @SerializedName("EffectiveRules")
    @Expose
    private Long EffectiveRules;

    /**
     * Get <p>Service id.</p> 
     * @return Domain <p>Service id.</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>Service id.</p>
     * @param Domain <p>Service id.</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>Service name.</p> 
     * @return Name <p>Service name.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Service name.</p>
     * @param Name <p>Service name.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Remarks.</p> 
     * @return Remark <p>Remarks.</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>Remarks.</p>
     * @param Remark <p>Remarks.</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>SDK access source. This parameter is optional.</p> 
     * @return SdkSource <p>SDK access source. This parameter is optional.</p>
     */
    public String getSdkSource() {
        return this.SdkSource;
    }

    /**
     * Set <p>SDK access source. This parameter is optional.</p>
     * @param SdkSource <p>SDK access source. This parameter is optional.</p>
     */
    public void setSdkSource(String SdkSource) {
        this.SdkSource = SdkSource;
    }

    /**
     * Get <p>Master switch.</p> 
     * @return MainStatus <p>Master switch.</p>
     */
    public Boolean getMainStatus() {
        return this.MainStatus;
    }

    /**
     * Set <p>Master switch.</p>
     * @param MainStatus <p>Master switch.</p>
     */
    public void setMainStatus(Boolean MainStatus) {
        this.MainStatus = MainStatus;
    }

    /**
     * Get <p>Rate limiting switch.</p> 
     * @return LimitRuleStatus <p>Rate limiting switch.</p>
     */
    public Boolean getLimitRuleStatus() {
        return this.LimitRuleStatus;
    }

    /**
     * Set <p>Rate limiting switch.</p>
     * @param LimitRuleStatus <p>Rate limiting switch.</p>
     */
    public void setLimitRuleStatus(Boolean LimitRuleStatus) {
        this.LimitRuleStatus = LimitRuleStatus;
    }

    /**
     * Get <p>Content security switch.</p> 
     * @return ContentRuleStatus <p>Content security switch.</p>
     */
    public Boolean getContentRuleStatus() {
        return this.ContentRuleStatus;
    }

    /**
     * Set <p>Content security switch.</p>
     * @param ContentRuleStatus <p>Content security switch.</p>
     */
    public void setContentRuleStatus(Boolean ContentRuleStatus) {
        this.ContentRuleStatus = ContentRuleStatus;
    }

    /**
     * Get <p>Creation time.</p> 
     * @return CreateTime <p>Creation time.</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time.</p>
     * @param CreateTime <p>Creation time.</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Modification time.</p> 
     * @return UpdateTime <p>Modification time.</p>
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Modification time.</p>
     * @param UpdateTime <p>Modification time.</p>
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>Number of rate limiting rules.</p> 
     * @return LimitRuleCount <p>Number of rate limiting rules.</p>
     */
    public Long getLimitRuleCount() {
        return this.LimitRuleCount;
    }

    /**
     * Set <p>Number of rate limiting rules.</p>
     * @param LimitRuleCount <p>Number of rate limiting rules.</p>
     */
    public void setLimitRuleCount(Long LimitRuleCount) {
        this.LimitRuleCount = LimitRuleCount;
    }

    /**
     * Get <p>Number of content security rules.</p> 
     * @return ContentRuleCount <p>Number of content security rules.</p>
     */
    public Long getContentRuleCount() {
        return this.ContentRuleCount;
    }

    /**
     * Set <p>Number of content security rules.</p>
     * @param ContentRuleCount <p>Number of content security rules.</p>
     */
    public void setContentRuleCount(Long ContentRuleCount) {
        this.ContentRuleCount = ContentRuleCount;
    }

    /**
     * Get <p>Tool call protection switch.</p> 
     * @return ToolCallStatus <p>Tool call protection switch.</p>
     */
    public Boolean getToolCallStatus() {
        return this.ToolCallStatus;
    }

    /**
     * Set <p>Tool call protection switch.</p>
     * @param ToolCallStatus <p>Tool call protection switch.</p>
     */
    public void setToolCallStatus(Boolean ToolCallStatus) {
        this.ToolCallStatus = ToolCallStatus;
    }

    /**
     * Get <p>llm inference protection switch.</p> 
     * @return LLMProtectStatus <p>llm inference protection switch.</p>
     */
    public Boolean getLLMProtectStatus() {
        return this.LLMProtectStatus;
    }

    /**
     * Set <p>llm inference protection switch.</p>
     * @param LLMProtectStatus <p>llm inference protection switch.</p>
     */
    public void setLLMProtectStatus(Boolean LLMProtectStatus) {
        this.LLMProtectStatus = LLMProtectStatus;
    }

    /**
     * Get <p>Content compliance detection switch.</p> 
     * @return ContentComplianceStatus <p>Content compliance detection switch.</p>
     */
    public Boolean getContentComplianceStatus() {
        return this.ContentComplianceStatus;
    }

    /**
     * Set <p>Content compliance detection switch.</p>
     * @param ContentComplianceStatus <p>Content compliance detection switch.</p>
     */
    public void setContentComplianceStatus(Boolean ContentComplianceStatus) {
        this.ContentComplianceStatus = ContentComplianceStatus;
    }

    /**
     * Get <p>dlp protection switch.</p> 
     * @return DLPStatus <p>dlp protection switch.</p>
     */
    public Boolean getDLPStatus() {
        return this.DLPStatus;
    }

    /**
     * Set <p>dlp protection switch.</p>
     * @param DLPStatus <p>dlp protection switch.</p>
     */
    public void setDLPStatus(Boolean DLPStatus) {
        this.DLPStatus = DLPStatus;
    }

    /**
     * Get <p>skills protection switch.</p> 
     * @return SkillsStatus <p>skills protection switch.</p>
     */
    public Boolean getSkillsStatus() {
        return this.SkillsStatus;
    }

    /**
     * Set <p>skills protection switch.</p>
     * @param SkillsStatus <p>skills protection switch.</p>
     */
    public void setSkillsStatus(Boolean SkillsStatus) {
        this.SkillsStatus = SkillsStatus;
    }

    /**
     * Get <p>Intent recognition detection switch.</p> 
     * @return IntentStatus <p>Intent recognition detection switch.</p>
     */
    public Boolean getIntentStatus() {
        return this.IntentStatus;
    }

    /**
     * Set <p>Intent recognition detection switch.</p>
     * @param IntentStatus <p>Intent recognition detection switch.</p>
     */
    public void setIntentStatus(Boolean IntentStatus) {
        this.IntentStatus = IntentStatus;
    }

    /**
     * Get <p>Malicious URL detection switch.</p> 
     * @return UrlDetectStatus <p>Malicious URL detection switch.</p>
     */
    public Boolean getUrlDetectStatus() {
        return this.UrlDetectStatus;
    }

    /**
     * Set <p>Malicious URL detection switch.</p>
     * @param UrlDetectStatus <p>Malicious URL detection switch.</p>
     */
    public void setUrlDetectStatus(Boolean UrlDetectStatus) {
        this.UrlDetectStatus = UrlDetectStatus;
    }

    /**
     * Get <p>Number of effective rules.</p> 
     * @return EffectiveRules <p>Number of effective rules.</p>
     */
    public Long getEffectiveRules() {
        return this.EffectiveRules;
    }

    /**
     * Set <p>Number of effective rules.</p>
     * @param EffectiveRules <p>Number of effective rules.</p>
     */
    public void setEffectiveRules(Long EffectiveRules) {
        this.EffectiveRules = EffectiveRules;
    }

    public LLMSdkAccessItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LLMSdkAccessItem(LLMSdkAccessItem source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.SdkSource != null) {
            this.SdkSource = new String(source.SdkSource);
        }
        if (source.MainStatus != null) {
            this.MainStatus = new Boolean(source.MainStatus);
        }
        if (source.LimitRuleStatus != null) {
            this.LimitRuleStatus = new Boolean(source.LimitRuleStatus);
        }
        if (source.ContentRuleStatus != null) {
            this.ContentRuleStatus = new Boolean(source.ContentRuleStatus);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.LimitRuleCount != null) {
            this.LimitRuleCount = new Long(source.LimitRuleCount);
        }
        if (source.ContentRuleCount != null) {
            this.ContentRuleCount = new Long(source.ContentRuleCount);
        }
        if (source.ToolCallStatus != null) {
            this.ToolCallStatus = new Boolean(source.ToolCallStatus);
        }
        if (source.LLMProtectStatus != null) {
            this.LLMProtectStatus = new Boolean(source.LLMProtectStatus);
        }
        if (source.ContentComplianceStatus != null) {
            this.ContentComplianceStatus = new Boolean(source.ContentComplianceStatus);
        }
        if (source.DLPStatus != null) {
            this.DLPStatus = new Boolean(source.DLPStatus);
        }
        if (source.SkillsStatus != null) {
            this.SkillsStatus = new Boolean(source.SkillsStatus);
        }
        if (source.IntentStatus != null) {
            this.IntentStatus = new Boolean(source.IntentStatus);
        }
        if (source.UrlDetectStatus != null) {
            this.UrlDetectStatus = new Boolean(source.UrlDetectStatus);
        }
        if (source.EffectiveRules != null) {
            this.EffectiveRules = new Long(source.EffectiveRules);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "SdkSource", this.SdkSource);
        this.setParamSimple(map, prefix + "MainStatus", this.MainStatus);
        this.setParamSimple(map, prefix + "LimitRuleStatus", this.LimitRuleStatus);
        this.setParamSimple(map, prefix + "ContentRuleStatus", this.ContentRuleStatus);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "LimitRuleCount", this.LimitRuleCount);
        this.setParamSimple(map, prefix + "ContentRuleCount", this.ContentRuleCount);
        this.setParamSimple(map, prefix + "ToolCallStatus", this.ToolCallStatus);
        this.setParamSimple(map, prefix + "LLMProtectStatus", this.LLMProtectStatus);
        this.setParamSimple(map, prefix + "ContentComplianceStatus", this.ContentComplianceStatus);
        this.setParamSimple(map, prefix + "DLPStatus", this.DLPStatus);
        this.setParamSimple(map, prefix + "SkillsStatus", this.SkillsStatus);
        this.setParamSimple(map, prefix + "IntentStatus", this.IntentStatus);
        this.setParamSimple(map, prefix + "UrlDetectStatus", this.UrlDetectStatus);
        this.setParamSimple(map, prefix + "EffectiveRules", this.EffectiveRules);

    }
}


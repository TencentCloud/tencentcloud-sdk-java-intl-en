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
package com.tencentcloudapi.config.v20220802.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConfigRuleResourceEvaluationResult extends AbstractModel {

    /**
    * Rule ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Rule name
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Rule ID.
    */
    @SerializedName("RuleIdentifier")
    @Expose
    private String RuleIdentifier;

    /**
    * Rule description
    */
    @SerializedName("RuleDescription")
    @Expose
    private String RuleDescription;

    /**
    * Account to which the rule belongs.
    */
    @SerializedName("RuleOwnerId")
    @Expose
    private Long RuleOwnerId;

    /**
    * Rule risk level.
    */
    @SerializedName("RuleRiskLevel")
    @Expose
    private Long RuleRiskLevel;

    /**
    * Resource ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * Resource type.
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * Resource name
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * Resource region
    */
    @SerializedName("ResourceRegion")
    @Expose
    private String ResourceRegion;

    /**
    * Resource tag
    */
    @SerializedName("ResourceTags")
    @Expose
    private Tag [] ResourceTags;

    /**
    * Compliance details
    */
    @SerializedName("Annotation")
    @Expose
    private Annotation Annotation;

    /**
     * Get Rule ID 
     * @return RuleId Rule ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule ID
     * @param RuleId Rule ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Rule name 
     * @return RuleName Rule name
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Rule name
     * @param RuleName Rule name
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Rule ID. 
     * @return RuleIdentifier Rule ID.
     */
    public String getRuleIdentifier() {
        return this.RuleIdentifier;
    }

    /**
     * Set Rule ID.
     * @param RuleIdentifier Rule ID.
     */
    public void setRuleIdentifier(String RuleIdentifier) {
        this.RuleIdentifier = RuleIdentifier;
    }

    /**
     * Get Rule description 
     * @return RuleDescription Rule description
     */
    public String getRuleDescription() {
        return this.RuleDescription;
    }

    /**
     * Set Rule description
     * @param RuleDescription Rule description
     */
    public void setRuleDescription(String RuleDescription) {
        this.RuleDescription = RuleDescription;
    }

    /**
     * Get Account to which the rule belongs. 
     * @return RuleOwnerId Account to which the rule belongs.
     */
    public Long getRuleOwnerId() {
        return this.RuleOwnerId;
    }

    /**
     * Set Account to which the rule belongs.
     * @param RuleOwnerId Account to which the rule belongs.
     */
    public void setRuleOwnerId(Long RuleOwnerId) {
        this.RuleOwnerId = RuleOwnerId;
    }

    /**
     * Get Rule risk level. 
     * @return RuleRiskLevel Rule risk level.
     */
    public Long getRuleRiskLevel() {
        return this.RuleRiskLevel;
    }

    /**
     * Set Rule risk level.
     * @param RuleRiskLevel Rule risk level.
     */
    public void setRuleRiskLevel(Long RuleRiskLevel) {
        this.RuleRiskLevel = RuleRiskLevel;
    }

    /**
     * Get Resource ID 
     * @return ResourceId Resource ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Resource ID
     * @param ResourceId Resource ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get Resource type. 
     * @return ResourceType Resource type.
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set Resource type.
     * @param ResourceType Resource type.
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get Resource name 
     * @return ResourceName Resource name
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set Resource name
     * @param ResourceName Resource name
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get Resource region 
     * @return ResourceRegion Resource region
     */
    public String getResourceRegion() {
        return this.ResourceRegion;
    }

    /**
     * Set Resource region
     * @param ResourceRegion Resource region
     */
    public void setResourceRegion(String ResourceRegion) {
        this.ResourceRegion = ResourceRegion;
    }

    /**
     * Get Resource tag 
     * @return ResourceTags Resource tag
     */
    public Tag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set Resource tag
     * @param ResourceTags Resource tag
     */
    public void setResourceTags(Tag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get Compliance details 
     * @return Annotation Compliance details
     */
    public Annotation getAnnotation() {
        return this.Annotation;
    }

    /**
     * Set Compliance details
     * @param Annotation Compliance details
     */
    public void setAnnotation(Annotation Annotation) {
        this.Annotation = Annotation;
    }

    public ConfigRuleResourceEvaluationResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfigRuleResourceEvaluationResult(ConfigRuleResourceEvaluationResult source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.RuleIdentifier != null) {
            this.RuleIdentifier = new String(source.RuleIdentifier);
        }
        if (source.RuleDescription != null) {
            this.RuleDescription = new String(source.RuleDescription);
        }
        if (source.RuleOwnerId != null) {
            this.RuleOwnerId = new Long(source.RuleOwnerId);
        }
        if (source.RuleRiskLevel != null) {
            this.RuleRiskLevel = new Long(source.RuleRiskLevel);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.ResourceRegion != null) {
            this.ResourceRegion = new String(source.ResourceRegion);
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new Tag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new Tag(source.ResourceTags[i]);
            }
        }
        if (source.Annotation != null) {
            this.Annotation = new Annotation(source.Annotation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "RuleIdentifier", this.RuleIdentifier);
        this.setParamSimple(map, prefix + "RuleDescription", this.RuleDescription);
        this.setParamSimple(map, prefix + "RuleOwnerId", this.RuleOwnerId);
        this.setParamSimple(map, prefix + "RuleRiskLevel", this.RuleRiskLevel);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "ResourceRegion", this.ResourceRegion);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamObj(map, prefix + "Annotation.", this.Annotation);

    }
}


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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AbnormalProcessRuleInfo extends AbstractModel {

    /**
    * Array of sub-policies of the user policy
    */
    @SerializedName("ChildRules")
    @Expose
    private AbnormalProcessChildRuleInfo [] ChildRules;

    /**
    * IDs of associated images. An empty array indicates all images.
    */
    @SerializedName("ImageIds")
    @Expose
    private String [] ImageIds;

    /**
    * Valid values: `true` (enabled); `false` (disabled).
    */
    @SerializedName("IsEnable")
    @Expose
    private Boolean IsEnable;

    /**
    * Policy name
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Whether it is the default preset policy
    */
    @SerializedName("IsDefault")
    @Expose
    private Boolean IsDefault;

    /**
    * Whether the rule applies to all images. true indicates it takes effect on all images.
    */
    @SerializedName("IsGlobal")
    @Expose
    private Boolean IsGlobal;

    /**
    * Policy ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Array of sub-policies of the preset policy
    */
    @SerializedName("SystemChildRules")
    @Expose
    private AbnormalProcessSystemChildRuleInfo [] SystemChildRules;

    /**
     * Get Array of sub-policies of the user policy 
     * @return ChildRules Array of sub-policies of the user policy
     */
    public AbnormalProcessChildRuleInfo [] getChildRules() {
        return this.ChildRules;
    }

    /**
     * Set Array of sub-policies of the user policy
     * @param ChildRules Array of sub-policies of the user policy
     */
    public void setChildRules(AbnormalProcessChildRuleInfo [] ChildRules) {
        this.ChildRules = ChildRules;
    }

    /**
     * Get IDs of associated images. An empty array indicates all images. 
     * @return ImageIds IDs of associated images. An empty array indicates all images.
     */
    public String [] getImageIds() {
        return this.ImageIds;
    }

    /**
     * Set IDs of associated images. An empty array indicates all images.
     * @param ImageIds IDs of associated images. An empty array indicates all images.
     */
    public void setImageIds(String [] ImageIds) {
        this.ImageIds = ImageIds;
    }

    /**
     * Get Valid values: `true` (enabled); `false` (disabled). 
     * @return IsEnable Valid values: `true` (enabled); `false` (disabled).
     */
    public Boolean getIsEnable() {
        return this.IsEnable;
    }

    /**
     * Set Valid values: `true` (enabled); `false` (disabled).
     * @param IsEnable Valid values: `true` (enabled); `false` (disabled).
     */
    public void setIsEnable(Boolean IsEnable) {
        this.IsEnable = IsEnable;
    }

    /**
     * Get Policy name 
     * @return RuleName Policy name
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Policy name
     * @param RuleName Policy name
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Whether it is the default preset policy 
     * @return IsDefault Whether it is the default preset policy
     */
    public Boolean getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set Whether it is the default preset policy
     * @param IsDefault Whether it is the default preset policy
     */
    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get Whether the rule applies to all images. true indicates it takes effect on all images. 
     * @return IsGlobal Whether the rule applies to all images. true indicates it takes effect on all images.
     */
    public Boolean getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * Set Whether the rule applies to all images. true indicates it takes effect on all images.
     * @param IsGlobal Whether the rule applies to all images. true indicates it takes effect on all images.
     */
    public void setIsGlobal(Boolean IsGlobal) {
        this.IsGlobal = IsGlobal;
    }

    /**
     * Get Policy ID 
     * @return RuleId Policy ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Policy ID
     * @param RuleId Policy ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Array of sub-policies of the preset policy 
     * @return SystemChildRules Array of sub-policies of the preset policy
     */
    public AbnormalProcessSystemChildRuleInfo [] getSystemChildRules() {
        return this.SystemChildRules;
    }

    /**
     * Set Array of sub-policies of the preset policy
     * @param SystemChildRules Array of sub-policies of the preset policy
     */
    public void setSystemChildRules(AbnormalProcessSystemChildRuleInfo [] SystemChildRules) {
        this.SystemChildRules = SystemChildRules;
    }

    public AbnormalProcessRuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AbnormalProcessRuleInfo(AbnormalProcessRuleInfo source) {
        if (source.ChildRules != null) {
            this.ChildRules = new AbnormalProcessChildRuleInfo[source.ChildRules.length];
            for (int i = 0; i < source.ChildRules.length; i++) {
                this.ChildRules[i] = new AbnormalProcessChildRuleInfo(source.ChildRules[i]);
            }
        }
        if (source.ImageIds != null) {
            this.ImageIds = new String[source.ImageIds.length];
            for (int i = 0; i < source.ImageIds.length; i++) {
                this.ImageIds[i] = new String(source.ImageIds[i]);
            }
        }
        if (source.IsEnable != null) {
            this.IsEnable = new Boolean(source.IsEnable);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Boolean(source.IsDefault);
        }
        if (source.IsGlobal != null) {
            this.IsGlobal = new Boolean(source.IsGlobal);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.SystemChildRules != null) {
            this.SystemChildRules = new AbnormalProcessSystemChildRuleInfo[source.SystemChildRules.length];
            for (int i = 0; i < source.SystemChildRules.length; i++) {
                this.SystemChildRules[i] = new AbnormalProcessSystemChildRuleInfo(source.SystemChildRules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ChildRules.", this.ChildRules);
        this.setParamArraySimple(map, prefix + "ImageIds.", this.ImageIds);
        this.setParamSimple(map, prefix + "IsEnable", this.IsEnable);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "IsGlobal", this.IsGlobal);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamArrayObj(map, prefix + "SystemChildRules.", this.SystemChildRules);

    }
}


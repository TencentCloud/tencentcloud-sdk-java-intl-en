/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccessControlRuleInfo extends AbstractModel{

    /**
    * Switch. Valid values: `true` (on); `false` (off).
    */
    @SerializedName("IsEnable")
    @Expose
    private Boolean IsEnable;

    /**
    * IDs of associated images. An empty array indicates all images.
    */
    @SerializedName("ImageIds")
    @Expose
    private String [] ImageIds;

    /**
    * Array of sub-policies of the user policy
    */
    @SerializedName("ChildRules")
    @Expose
    private AccessControlChildRuleInfo [] ChildRules;

    /**
    * Policy name
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Policy ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Array of sub-policies of the preset policy
    */
    @SerializedName("SystemChildRules")
    @Expose
    private AccessControlSystemChildRuleInfo [] SystemChildRules;

    /**
    * Whether it is the default preset policy
    */
    @SerializedName("IsDefault")
    @Expose
    private Boolean IsDefault;

    /**
     * Get Switch. Valid values: `true` (on); `false` (off). 
     * @return IsEnable Switch. Valid values: `true` (on); `false` (off).
     */
    public Boolean getIsEnable() {
        return this.IsEnable;
    }

    /**
     * Set Switch. Valid values: `true` (on); `false` (off).
     * @param IsEnable Switch. Valid values: `true` (on); `false` (off).
     */
    public void setIsEnable(Boolean IsEnable) {
        this.IsEnable = IsEnable;
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
     * Get Array of sub-policies of the user policy 
     * @return ChildRules Array of sub-policies of the user policy
     */
    public AccessControlChildRuleInfo [] getChildRules() {
        return this.ChildRules;
    }

    /**
     * Set Array of sub-policies of the user policy
     * @param ChildRules Array of sub-policies of the user policy
     */
    public void setChildRules(AccessControlChildRuleInfo [] ChildRules) {
        this.ChildRules = ChildRules;
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
     * Get Policy ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RuleId Policy ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Policy ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RuleId Policy ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Array of sub-policies of the preset policy 
     * @return SystemChildRules Array of sub-policies of the preset policy
     */
    public AccessControlSystemChildRuleInfo [] getSystemChildRules() {
        return this.SystemChildRules;
    }

    /**
     * Set Array of sub-policies of the preset policy
     * @param SystemChildRules Array of sub-policies of the preset policy
     */
    public void setSystemChildRules(AccessControlSystemChildRuleInfo [] SystemChildRules) {
        this.SystemChildRules = SystemChildRules;
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

    public AccessControlRuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessControlRuleInfo(AccessControlRuleInfo source) {
        if (source.IsEnable != null) {
            this.IsEnable = new Boolean(source.IsEnable);
        }
        if (source.ImageIds != null) {
            this.ImageIds = new String[source.ImageIds.length];
            for (int i = 0; i < source.ImageIds.length; i++) {
                this.ImageIds[i] = new String(source.ImageIds[i]);
            }
        }
        if (source.ChildRules != null) {
            this.ChildRules = new AccessControlChildRuleInfo[source.ChildRules.length];
            for (int i = 0; i < source.ChildRules.length; i++) {
                this.ChildRules[i] = new AccessControlChildRuleInfo(source.ChildRules[i]);
            }
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.SystemChildRules != null) {
            this.SystemChildRules = new AccessControlSystemChildRuleInfo[source.SystemChildRules.length];
            for (int i = 0; i < source.SystemChildRules.length; i++) {
                this.SystemChildRules[i] = new AccessControlSystemChildRuleInfo(source.SystemChildRules[i]);
            }
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Boolean(source.IsDefault);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsEnable", this.IsEnable);
        this.setParamArraySimple(map, prefix + "ImageIds.", this.ImageIds);
        this.setParamArrayObj(map, prefix + "ChildRules.", this.ChildRules);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamArrayObj(map, prefix + "SystemChildRules.", this.SystemChildRules);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);

    }
}


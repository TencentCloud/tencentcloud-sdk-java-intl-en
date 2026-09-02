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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaselineItem extends AbstractModel {

    /**
    * <p>Baseline detection item ID.</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>Built-in rule ID.</p>
    */
    @SerializedName("RuleID")
    @Expose
    private Long RuleID;

    /**
    * <p>Detection object description, such as configuration file path, kernel parameter, and Kubernetes Resources.</p>
    */
    @SerializedName("CheckObject")
    @Expose
    private String [] CheckObject;

    /**
    * <p>Risk level. Value:</p><ul><li>LOW: Low risk</li><li>MEDIUM: Medium risk</li><li>HIGH: High risk</li><li>CRITICAL: Critical</li></ul>
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * <p>Detection item name (Chinese).</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Detection item description (Chinese, explaining the detection background and determination logic).</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Detection item repair advice (Chinese, including recommended configuration reference values or hardening commands).</p>
    */
    @SerializedName("FixSuggestion")
    @Expose
    private String FixSuggestion;

    /**
    * <p>Reference link list of detection items.</p>
    */
    @SerializedName("ReferenceLink")
    @Expose
    private String ReferenceLink;

    /**
    * <p>Classification information of the parent category in the associated system.</p>
    */
    @SerializedName("SystemCategory")
    @Expose
    private BaselineCategory SystemCategory;

    /**
    * <p>Classification information of the subcategory it belongs to.</p>
    */
    @SerializedName("Category")
    @Expose
    private BaselineCategory Category;

    /**
    * <p>Whether one-click repair is supported. true: supported, false: unsupported.</p>
    */
    @SerializedName("SupportFix")
    @Expose
    private Boolean SupportFix;

    /**
    * <p>Whether user-defined judgment values are supported. true: supported; false: not supported.</p>
    */
    @SerializedName("SupportCustomValue")
    @Expose
    private Boolean SupportCustomValue;

    /**
    * <p>Operating system/component version list applicable to this detection item.</p>
    */
    @SerializedName("AffectedVersionList")
    @Expose
    private String [] AffectedVersionList;

    /**
    * <p>Parameter definition when editing a custom judgment value (for example, permissible range, control type).</p>
    */
    @SerializedName("WebEditParam")
    @Expose
    private String WebEditParam;

    /**
    * <p>Default detection item judgment value list.</p>
    */
    @SerializedName("DefaultValueList")
    @Expose
    private String [] DefaultValueList;

    /**
    * <p>Whether customized by the user. true: customized; false: use default values.</p>
    */
    @SerializedName("IsCustomConf")
    @Expose
    private Boolean IsCustomConf;

    /**
    * <p>User-customized configuration record ID. The value is 0 if not customized.</p>
    */
    @SerializedName("CustomItemID")
    @Expose
    private Long CustomItemID;

    /**
     * Get <p>Baseline detection item ID.</p> 
     * @return ID <p>Baseline detection item ID.</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>Baseline detection item ID.</p>
     * @param ID <p>Baseline detection item ID.</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>Built-in rule ID.</p> 
     * @return RuleID <p>Built-in rule ID.</p>
     */
    public Long getRuleID() {
        return this.RuleID;
    }

    /**
     * Set <p>Built-in rule ID.</p>
     * @param RuleID <p>Built-in rule ID.</p>
     */
    public void setRuleID(Long RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get <p>Detection object description, such as configuration file path, kernel parameter, and Kubernetes Resources.</p> 
     * @return CheckObject <p>Detection object description, such as configuration file path, kernel parameter, and Kubernetes Resources.</p>
     */
    public String [] getCheckObject() {
        return this.CheckObject;
    }

    /**
     * Set <p>Detection object description, such as configuration file path, kernel parameter, and Kubernetes Resources.</p>
     * @param CheckObject <p>Detection object description, such as configuration file path, kernel parameter, and Kubernetes Resources.</p>
     */
    public void setCheckObject(String [] CheckObject) {
        this.CheckObject = CheckObject;
    }

    /**
     * Get <p>Risk level. Value:</p><ul><li>LOW: Low risk</li><li>MEDIUM: Medium risk</li><li>HIGH: High risk</li><li>CRITICAL: Critical</li></ul> 
     * @return RiskLevel <p>Risk level. Value:</p><ul><li>LOW: Low risk</li><li>MEDIUM: Medium risk</li><li>HIGH: High risk</li><li>CRITICAL: Critical</li></ul>
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set <p>Risk level. Value:</p><ul><li>LOW: Low risk</li><li>MEDIUM: Medium risk</li><li>HIGH: High risk</li><li>CRITICAL: Critical</li></ul>
     * @param RiskLevel <p>Risk level. Value:</p><ul><li>LOW: Low risk</li><li>MEDIUM: Medium risk</li><li>HIGH: High risk</li><li>CRITICAL: Critical</li></ul>
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get <p>Detection item name (Chinese).</p> 
     * @return Name <p>Detection item name (Chinese).</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Detection item name (Chinese).</p>
     * @param Name <p>Detection item name (Chinese).</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Detection item description (Chinese, explaining the detection background and determination logic).</p> 
     * @return Description <p>Detection item description (Chinese, explaining the detection background and determination logic).</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Detection item description (Chinese, explaining the detection background and determination logic).</p>
     * @param Description <p>Detection item description (Chinese, explaining the detection background and determination logic).</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Detection item repair advice (Chinese, including recommended configuration reference values or hardening commands).</p> 
     * @return FixSuggestion <p>Detection item repair advice (Chinese, including recommended configuration reference values or hardening commands).</p>
     */
    public String getFixSuggestion() {
        return this.FixSuggestion;
    }

    /**
     * Set <p>Detection item repair advice (Chinese, including recommended configuration reference values or hardening commands).</p>
     * @param FixSuggestion <p>Detection item repair advice (Chinese, including recommended configuration reference values or hardening commands).</p>
     */
    public void setFixSuggestion(String FixSuggestion) {
        this.FixSuggestion = FixSuggestion;
    }

    /**
     * Get <p>Reference link list of detection items.</p> 
     * @return ReferenceLink <p>Reference link list of detection items.</p>
     */
    public String getReferenceLink() {
        return this.ReferenceLink;
    }

    /**
     * Set <p>Reference link list of detection items.</p>
     * @param ReferenceLink <p>Reference link list of detection items.</p>
     */
    public void setReferenceLink(String ReferenceLink) {
        this.ReferenceLink = ReferenceLink;
    }

    /**
     * Get <p>Classification information of the parent category in the associated system.</p> 
     * @return SystemCategory <p>Classification information of the parent category in the associated system.</p>
     */
    public BaselineCategory getSystemCategory() {
        return this.SystemCategory;
    }

    /**
     * Set <p>Classification information of the parent category in the associated system.</p>
     * @param SystemCategory <p>Classification information of the parent category in the associated system.</p>
     */
    public void setSystemCategory(BaselineCategory SystemCategory) {
        this.SystemCategory = SystemCategory;
    }

    /**
     * Get <p>Classification information of the subcategory it belongs to.</p> 
     * @return Category <p>Classification information of the subcategory it belongs to.</p>
     */
    public BaselineCategory getCategory() {
        return this.Category;
    }

    /**
     * Set <p>Classification information of the subcategory it belongs to.</p>
     * @param Category <p>Classification information of the subcategory it belongs to.</p>
     */
    public void setCategory(BaselineCategory Category) {
        this.Category = Category;
    }

    /**
     * Get <p>Whether one-click repair is supported. true: supported, false: unsupported.</p> 
     * @return SupportFix <p>Whether one-click repair is supported. true: supported, false: unsupported.</p>
     */
    public Boolean getSupportFix() {
        return this.SupportFix;
    }

    /**
     * Set <p>Whether one-click repair is supported. true: supported, false: unsupported.</p>
     * @param SupportFix <p>Whether one-click repair is supported. true: supported, false: unsupported.</p>
     */
    public void setSupportFix(Boolean SupportFix) {
        this.SupportFix = SupportFix;
    }

    /**
     * Get <p>Whether user-defined judgment values are supported. true: supported; false: not supported.</p> 
     * @return SupportCustomValue <p>Whether user-defined judgment values are supported. true: supported; false: not supported.</p>
     */
    public Boolean getSupportCustomValue() {
        return this.SupportCustomValue;
    }

    /**
     * Set <p>Whether user-defined judgment values are supported. true: supported; false: not supported.</p>
     * @param SupportCustomValue <p>Whether user-defined judgment values are supported. true: supported; false: not supported.</p>
     */
    public void setSupportCustomValue(Boolean SupportCustomValue) {
        this.SupportCustomValue = SupportCustomValue;
    }

    /**
     * Get <p>Operating system/component version list applicable to this detection item.</p> 
     * @return AffectedVersionList <p>Operating system/component version list applicable to this detection item.</p>
     */
    public String [] getAffectedVersionList() {
        return this.AffectedVersionList;
    }

    /**
     * Set <p>Operating system/component version list applicable to this detection item.</p>
     * @param AffectedVersionList <p>Operating system/component version list applicable to this detection item.</p>
     */
    public void setAffectedVersionList(String [] AffectedVersionList) {
        this.AffectedVersionList = AffectedVersionList;
    }

    /**
     * Get <p>Parameter definition when editing a custom judgment value (for example, permissible range, control type).</p> 
     * @return WebEditParam <p>Parameter definition when editing a custom judgment value (for example, permissible range, control type).</p>
     */
    public String getWebEditParam() {
        return this.WebEditParam;
    }

    /**
     * Set <p>Parameter definition when editing a custom judgment value (for example, permissible range, control type).</p>
     * @param WebEditParam <p>Parameter definition when editing a custom judgment value (for example, permissible range, control type).</p>
     */
    public void setWebEditParam(String WebEditParam) {
        this.WebEditParam = WebEditParam;
    }

    /**
     * Get <p>Default detection item judgment value list.</p> 
     * @return DefaultValueList <p>Default detection item judgment value list.</p>
     */
    public String [] getDefaultValueList() {
        return this.DefaultValueList;
    }

    /**
     * Set <p>Default detection item judgment value list.</p>
     * @param DefaultValueList <p>Default detection item judgment value list.</p>
     */
    public void setDefaultValueList(String [] DefaultValueList) {
        this.DefaultValueList = DefaultValueList;
    }

    /**
     * Get <p>Whether customized by the user. true: customized; false: use default values.</p> 
     * @return IsCustomConf <p>Whether customized by the user. true: customized; false: use default values.</p>
     */
    public Boolean getIsCustomConf() {
        return this.IsCustomConf;
    }

    /**
     * Set <p>Whether customized by the user. true: customized; false: use default values.</p>
     * @param IsCustomConf <p>Whether customized by the user. true: customized; false: use default values.</p>
     */
    public void setIsCustomConf(Boolean IsCustomConf) {
        this.IsCustomConf = IsCustomConf;
    }

    /**
     * Get <p>User-customized configuration record ID. The value is 0 if not customized.</p> 
     * @return CustomItemID <p>User-customized configuration record ID. The value is 0 if not customized.</p>
     */
    public Long getCustomItemID() {
        return this.CustomItemID;
    }

    /**
     * Set <p>User-customized configuration record ID. The value is 0 if not customized.</p>
     * @param CustomItemID <p>User-customized configuration record ID. The value is 0 if not customized.</p>
     */
    public void setCustomItemID(Long CustomItemID) {
        this.CustomItemID = CustomItemID;
    }

    public BaselineItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineItem(BaselineItem source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.RuleID != null) {
            this.RuleID = new Long(source.RuleID);
        }
        if (source.CheckObject != null) {
            this.CheckObject = new String[source.CheckObject.length];
            for (int i = 0; i < source.CheckObject.length; i++) {
                this.CheckObject[i] = new String(source.CheckObject[i]);
            }
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.FixSuggestion != null) {
            this.FixSuggestion = new String(source.FixSuggestion);
        }
        if (source.ReferenceLink != null) {
            this.ReferenceLink = new String(source.ReferenceLink);
        }
        if (source.SystemCategory != null) {
            this.SystemCategory = new BaselineCategory(source.SystemCategory);
        }
        if (source.Category != null) {
            this.Category = new BaselineCategory(source.Category);
        }
        if (source.SupportFix != null) {
            this.SupportFix = new Boolean(source.SupportFix);
        }
        if (source.SupportCustomValue != null) {
            this.SupportCustomValue = new Boolean(source.SupportCustomValue);
        }
        if (source.AffectedVersionList != null) {
            this.AffectedVersionList = new String[source.AffectedVersionList.length];
            for (int i = 0; i < source.AffectedVersionList.length; i++) {
                this.AffectedVersionList[i] = new String(source.AffectedVersionList[i]);
            }
        }
        if (source.WebEditParam != null) {
            this.WebEditParam = new String(source.WebEditParam);
        }
        if (source.DefaultValueList != null) {
            this.DefaultValueList = new String[source.DefaultValueList.length];
            for (int i = 0; i < source.DefaultValueList.length; i++) {
                this.DefaultValueList[i] = new String(source.DefaultValueList[i]);
            }
        }
        if (source.IsCustomConf != null) {
            this.IsCustomConf = new Boolean(source.IsCustomConf);
        }
        if (source.CustomItemID != null) {
            this.CustomItemID = new Long(source.CustomItemID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamArraySimple(map, prefix + "CheckObject.", this.CheckObject);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "FixSuggestion", this.FixSuggestion);
        this.setParamSimple(map, prefix + "ReferenceLink", this.ReferenceLink);
        this.setParamObj(map, prefix + "SystemCategory.", this.SystemCategory);
        this.setParamObj(map, prefix + "Category.", this.Category);
        this.setParamSimple(map, prefix + "SupportFix", this.SupportFix);
        this.setParamSimple(map, prefix + "SupportCustomValue", this.SupportCustomValue);
        this.setParamArraySimple(map, prefix + "AffectedVersionList.", this.AffectedVersionList);
        this.setParamSimple(map, prefix + "WebEditParam", this.WebEditParam);
        this.setParamArraySimple(map, prefix + "DefaultValueList.", this.DefaultValueList);
        this.setParamSimple(map, prefix + "IsCustomConf", this.IsCustomConf);
        this.setParamSimple(map, prefix + "CustomItemID", this.CustomItemID);

    }
}


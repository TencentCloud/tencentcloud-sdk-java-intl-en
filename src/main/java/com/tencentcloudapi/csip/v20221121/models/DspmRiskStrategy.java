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

public class DspmRiskStrategy extends AbstractModel {

    /**
    * <p>Policy type</p>
    */
    @SerializedName("StrategyType")
    @Expose
    private String StrategyType;

    /**
    * <p>Policy name.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Policy type</p>
    */
    @SerializedName("StrategyCategory")
    @Expose
    private String StrategyCategory;

    /**
    * <p>Whether to enable. 0-Disable 1-Enable</p>
    */
    @SerializedName("IsEnabled")
    @Expose
    private Long IsEnabled;

    /**
    * <p>Risk level.</p>
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * <p>Policy rule</p>
    */
    @SerializedName("Rule")
    @Expose
    private String Rule;

    /**
    * <p>Remarks.</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>Policy content.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Number of hits</p>
    */
    @SerializedName("HitCount")
    @Expose
    private Long HitCount;

    /**
    * <p>Risk type. risk: Risk; alarm: Alarm.</p>
    */
    @SerializedName("RiskType")
    @Expose
    private String RiskType;

    /**
    * <p>app id of the asset ownership account</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>Account nickname</p>
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * <p>uin of the account to which the asset belongs</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>Policy ID.</p>
    */
    @SerializedName("StrategyId")
    @Expose
    private Long StrategyId;

    /**
    * <p>Rule source</p>
    */
    @SerializedName("RuleSource")
    @Expose
    private String RuleSource;

    /**
    * <p>Supported asset types</p>
    */
    @SerializedName("AssetTypes")
    @Expose
    private String [] AssetTypes;

    /**
    * <p>Risk description</p>
    */
    @SerializedName("RiskDescription")
    @Expose
    private String RiskDescription;

    /**
     * Get <p>Policy type</p> 
     * @return StrategyType <p>Policy type</p>
     */
    public String getStrategyType() {
        return this.StrategyType;
    }

    /**
     * Set <p>Policy type</p>
     * @param StrategyType <p>Policy type</p>
     */
    public void setStrategyType(String StrategyType) {
        this.StrategyType = StrategyType;
    }

    /**
     * Get <p>Policy name.</p> 
     * @return Name <p>Policy name.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Policy name.</p>
     * @param Name <p>Policy name.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Policy type</p> 
     * @return StrategyCategory <p>Policy type</p>
     */
    public String getStrategyCategory() {
        return this.StrategyCategory;
    }

    /**
     * Set <p>Policy type</p>
     * @param StrategyCategory <p>Policy type</p>
     */
    public void setStrategyCategory(String StrategyCategory) {
        this.StrategyCategory = StrategyCategory;
    }

    /**
     * Get <p>Whether to enable. 0-Disable 1-Enable</p> 
     * @return IsEnabled <p>Whether to enable. 0-Disable 1-Enable</p>
     */
    public Long getIsEnabled() {
        return this.IsEnabled;
    }

    /**
     * Set <p>Whether to enable. 0-Disable 1-Enable</p>
     * @param IsEnabled <p>Whether to enable. 0-Disable 1-Enable</p>
     */
    public void setIsEnabled(Long IsEnabled) {
        this.IsEnabled = IsEnabled;
    }

    /**
     * Get <p>Risk level.</p> 
     * @return RiskLevel <p>Risk level.</p>
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set <p>Risk level.</p>
     * @param RiskLevel <p>Risk level.</p>
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get <p>Policy rule</p> 
     * @return Rule <p>Policy rule</p>
     */
    public String getRule() {
        return this.Rule;
    }

    /**
     * Set <p>Policy rule</p>
     * @param Rule <p>Policy rule</p>
     */
    public void setRule(String Rule) {
        this.Rule = Rule;
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
     * Get <p>Policy content.</p> 
     * @return Description <p>Policy content.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Policy content.</p>
     * @param Description <p>Policy content.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Number of hits</p> 
     * @return HitCount <p>Number of hits</p>
     */
    public Long getHitCount() {
        return this.HitCount;
    }

    /**
     * Set <p>Number of hits</p>
     * @param HitCount <p>Number of hits</p>
     */
    public void setHitCount(Long HitCount) {
        this.HitCount = HitCount;
    }

    /**
     * Get <p>Risk type. risk: Risk; alarm: Alarm.</p> 
     * @return RiskType <p>Risk type. risk: Risk; alarm: Alarm.</p>
     */
    public String getRiskType() {
        return this.RiskType;
    }

    /**
     * Set <p>Risk type. risk: Risk; alarm: Alarm.</p>
     * @param RiskType <p>Risk type. risk: Risk; alarm: Alarm.</p>
     */
    public void setRiskType(String RiskType) {
        this.RiskType = RiskType;
    }

    /**
     * Get <p>app id of the asset ownership account</p> 
     * @return AppId <p>app id of the asset ownership account</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>app id of the asset ownership account</p>
     * @param AppId <p>app id of the asset ownership account</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>Account nickname</p> 
     * @return NickName <p>Account nickname</p>
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set <p>Account nickname</p>
     * @param NickName <p>Account nickname</p>
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get <p>uin of the account to which the asset belongs</p> 
     * @return Uin <p>uin of the account to which the asset belongs</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>uin of the account to which the asset belongs</p>
     * @param Uin <p>uin of the account to which the asset belongs</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>Policy ID.</p> 
     * @return StrategyId <p>Policy ID.</p>
     */
    public Long getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set <p>Policy ID.</p>
     * @param StrategyId <p>Policy ID.</p>
     */
    public void setStrategyId(Long StrategyId) {
        this.StrategyId = StrategyId;
    }

    /**
     * Get <p>Rule source</p> 
     * @return RuleSource <p>Rule source</p>
     */
    public String getRuleSource() {
        return this.RuleSource;
    }

    /**
     * Set <p>Rule source</p>
     * @param RuleSource <p>Rule source</p>
     */
    public void setRuleSource(String RuleSource) {
        this.RuleSource = RuleSource;
    }

    /**
     * Get <p>Supported asset types</p> 
     * @return AssetTypes <p>Supported asset types</p>
     */
    public String [] getAssetTypes() {
        return this.AssetTypes;
    }

    /**
     * Set <p>Supported asset types</p>
     * @param AssetTypes <p>Supported asset types</p>
     */
    public void setAssetTypes(String [] AssetTypes) {
        this.AssetTypes = AssetTypes;
    }

    /**
     * Get <p>Risk description</p> 
     * @return RiskDescription <p>Risk description</p>
     */
    public String getRiskDescription() {
        return this.RiskDescription;
    }

    /**
     * Set <p>Risk description</p>
     * @param RiskDescription <p>Risk description</p>
     */
    public void setRiskDescription(String RiskDescription) {
        this.RiskDescription = RiskDescription;
    }

    public DspmRiskStrategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmRiskStrategy(DspmRiskStrategy source) {
        if (source.StrategyType != null) {
            this.StrategyType = new String(source.StrategyType);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.StrategyCategory != null) {
            this.StrategyCategory = new String(source.StrategyCategory);
        }
        if (source.IsEnabled != null) {
            this.IsEnabled = new Long(source.IsEnabled);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.Rule != null) {
            this.Rule = new String(source.Rule);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.HitCount != null) {
            this.HitCount = new Long(source.HitCount);
        }
        if (source.RiskType != null) {
            this.RiskType = new String(source.RiskType);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.StrategyId != null) {
            this.StrategyId = new Long(source.StrategyId);
        }
        if (source.RuleSource != null) {
            this.RuleSource = new String(source.RuleSource);
        }
        if (source.AssetTypes != null) {
            this.AssetTypes = new String[source.AssetTypes.length];
            for (int i = 0; i < source.AssetTypes.length; i++) {
                this.AssetTypes[i] = new String(source.AssetTypes[i]);
            }
        }
        if (source.RiskDescription != null) {
            this.RiskDescription = new String(source.RiskDescription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StrategyType", this.StrategyType);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "StrategyCategory", this.StrategyCategory);
        this.setParamSimple(map, prefix + "IsEnabled", this.IsEnabled);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "Rule", this.Rule);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "HitCount", this.HitCount);
        this.setParamSimple(map, prefix + "RiskType", this.RiskType);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);
        this.setParamSimple(map, prefix + "RuleSource", this.RuleSource);
        this.setParamArraySimple(map, prefix + "AssetTypes.", this.AssetTypes);
        this.setParamSimple(map, prefix + "RiskDescription", this.RiskDescription);

    }
}


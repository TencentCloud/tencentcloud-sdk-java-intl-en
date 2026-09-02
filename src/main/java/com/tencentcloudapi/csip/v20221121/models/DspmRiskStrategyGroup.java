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

public class DspmRiskStrategyGroup extends AbstractModel {

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
    * <p>Whether to enable. 0 - disable, 1 - enable</p>
    */
    @SerializedName("IsEnabled")
    @Expose
    private Long IsEnabled;

    /**
    * <p>Number of hits</p>
    */
    @SerializedName("HitCount")
    @Expose
    private Long HitCount;

    /**
    * <p>Risk type. risk: risk; alarm: alarm.</p>
    */
    @SerializedName("RiskType")
    @Expose
    private String RiskType;

    /**
    * <p>Policy list.</p>
    */
    @SerializedName("StrategyList")
    @Expose
    private DspmRiskStrategy [] StrategyList;

    /**
    * <p>Rule source.</p>
    */
    @SerializedName("RuleSource")
    @Expose
    private String RuleSource;

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
     * Get <p>Whether to enable. 0 - disable, 1 - enable</p> 
     * @return IsEnabled <p>Whether to enable. 0 - disable, 1 - enable</p>
     */
    public Long getIsEnabled() {
        return this.IsEnabled;
    }

    /**
     * Set <p>Whether to enable. 0 - disable, 1 - enable</p>
     * @param IsEnabled <p>Whether to enable. 0 - disable, 1 - enable</p>
     */
    public void setIsEnabled(Long IsEnabled) {
        this.IsEnabled = IsEnabled;
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
     * Get <p>Risk type. risk: risk; alarm: alarm.</p> 
     * @return RiskType <p>Risk type. risk: risk; alarm: alarm.</p>
     */
    public String getRiskType() {
        return this.RiskType;
    }

    /**
     * Set <p>Risk type. risk: risk; alarm: alarm.</p>
     * @param RiskType <p>Risk type. risk: risk; alarm: alarm.</p>
     */
    public void setRiskType(String RiskType) {
        this.RiskType = RiskType;
    }

    /**
     * Get <p>Policy list.</p> 
     * @return StrategyList <p>Policy list.</p>
     */
    public DspmRiskStrategy [] getStrategyList() {
        return this.StrategyList;
    }

    /**
     * Set <p>Policy list.</p>
     * @param StrategyList <p>Policy list.</p>
     */
    public void setStrategyList(DspmRiskStrategy [] StrategyList) {
        this.StrategyList = StrategyList;
    }

    /**
     * Get <p>Rule source.</p> 
     * @return RuleSource <p>Rule source.</p>
     */
    public String getRuleSource() {
        return this.RuleSource;
    }

    /**
     * Set <p>Rule source.</p>
     * @param RuleSource <p>Rule source.</p>
     */
    public void setRuleSource(String RuleSource) {
        this.RuleSource = RuleSource;
    }

    public DspmRiskStrategyGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmRiskStrategyGroup(DspmRiskStrategyGroup source) {
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
        if (source.HitCount != null) {
            this.HitCount = new Long(source.HitCount);
        }
        if (source.RiskType != null) {
            this.RiskType = new String(source.RiskType);
        }
        if (source.StrategyList != null) {
            this.StrategyList = new DspmRiskStrategy[source.StrategyList.length];
            for (int i = 0; i < source.StrategyList.length; i++) {
                this.StrategyList[i] = new DspmRiskStrategy(source.StrategyList[i]);
            }
        }
        if (source.RuleSource != null) {
            this.RuleSource = new String(source.RuleSource);
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
        this.setParamSimple(map, prefix + "HitCount", this.HitCount);
        this.setParamSimple(map, prefix + "RiskType", this.RiskType);
        this.setParamArrayObj(map, prefix + "StrategyList.", this.StrategyList);
        this.setParamSimple(map, prefix + "RuleSource", this.RuleSource);

    }
}


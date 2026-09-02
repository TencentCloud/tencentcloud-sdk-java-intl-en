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

public class CreateDspmRiskStrategyRequest extends AbstractModel {

    /**
    * <p>Policy name.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Policy rule, JSON string</p>
    */
    @SerializedName("Rule")
    @Expose
    private String Rule;

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>English policy name.</p>
    */
    @SerializedName("EnName")
    @Expose
    private String EnName;

    /**
    * <p>Policy description.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>English strategy description</p>
    */
    @SerializedName("EnDescription")
    @Expose
    private String EnDescription;

    /**
    * <p>Risk level. Available values: Info/Low/Medium/High. Default if not passed: Medium</p>
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * <p>Whether to enable. 0: disable, 1: enable. If not specified, enabled by default.</p>
    */
    @SerializedName("IsEnabled")
    @Expose
    private Long IsEnabled;

    /**
    * <p>Risk type. Currently only support alarm, default if not passed: alarm</p>
    */
    @SerializedName("RiskType")
    @Expose
    private String RiskType;

    /**
    * <p>Policy category. Currently only support SQLOperationAnomaly. If not passed, SQLOperationAnomaly is used by default</p>
    */
    @SerializedName("StrategyCategory")
    @Expose
    private String StrategyCategory;

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
     * Get <p>Policy rule, JSON string</p> 
     * @return Rule <p>Policy rule, JSON string</p>
     */
    public String getRule() {
        return this.Rule;
    }

    /**
     * Set <p>Policy rule, JSON string</p>
     * @param Rule <p>Policy rule, JSON string</p>
     */
    public void setRule(String Rule) {
        this.Rule = Rule;
    }

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>English policy name.</p> 
     * @return EnName <p>English policy name.</p>
     */
    public String getEnName() {
        return this.EnName;
    }

    /**
     * Set <p>English policy name.</p>
     * @param EnName <p>English policy name.</p>
     */
    public void setEnName(String EnName) {
        this.EnName = EnName;
    }

    /**
     * Get <p>Policy description.</p> 
     * @return Description <p>Policy description.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Policy description.</p>
     * @param Description <p>Policy description.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>English strategy description</p> 
     * @return EnDescription <p>English strategy description</p>
     */
    public String getEnDescription() {
        return this.EnDescription;
    }

    /**
     * Set <p>English strategy description</p>
     * @param EnDescription <p>English strategy description</p>
     */
    public void setEnDescription(String EnDescription) {
        this.EnDescription = EnDescription;
    }

    /**
     * Get <p>Risk level. Available values: Info/Low/Medium/High. Default if not passed: Medium</p> 
     * @return RiskLevel <p>Risk level. Available values: Info/Low/Medium/High. Default if not passed: Medium</p>
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set <p>Risk level. Available values: Info/Low/Medium/High. Default if not passed: Medium</p>
     * @param RiskLevel <p>Risk level. Available values: Info/Low/Medium/High. Default if not passed: Medium</p>
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get <p>Whether to enable. 0: disable, 1: enable. If not specified, enabled by default.</p> 
     * @return IsEnabled <p>Whether to enable. 0: disable, 1: enable. If not specified, enabled by default.</p>
     */
    public Long getIsEnabled() {
        return this.IsEnabled;
    }

    /**
     * Set <p>Whether to enable. 0: disable, 1: enable. If not specified, enabled by default.</p>
     * @param IsEnabled <p>Whether to enable. 0: disable, 1: enable. If not specified, enabled by default.</p>
     */
    public void setIsEnabled(Long IsEnabled) {
        this.IsEnabled = IsEnabled;
    }

    /**
     * Get <p>Risk type. Currently only support alarm, default if not passed: alarm</p> 
     * @return RiskType <p>Risk type. Currently only support alarm, default if not passed: alarm</p>
     */
    public String getRiskType() {
        return this.RiskType;
    }

    /**
     * Set <p>Risk type. Currently only support alarm, default if not passed: alarm</p>
     * @param RiskType <p>Risk type. Currently only support alarm, default if not passed: alarm</p>
     */
    public void setRiskType(String RiskType) {
        this.RiskType = RiskType;
    }

    /**
     * Get <p>Policy category. Currently only support SQLOperationAnomaly. If not passed, SQLOperationAnomaly is used by default</p> 
     * @return StrategyCategory <p>Policy category. Currently only support SQLOperationAnomaly. If not passed, SQLOperationAnomaly is used by default</p>
     */
    public String getStrategyCategory() {
        return this.StrategyCategory;
    }

    /**
     * Set <p>Policy category. Currently only support SQLOperationAnomaly. If not passed, SQLOperationAnomaly is used by default</p>
     * @param StrategyCategory <p>Policy category. Currently only support SQLOperationAnomaly. If not passed, SQLOperationAnomaly is used by default</p>
     */
    public void setStrategyCategory(String StrategyCategory) {
        this.StrategyCategory = StrategyCategory;
    }

    public CreateDspmRiskStrategyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDspmRiskStrategyRequest(CreateDspmRiskStrategyRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Rule != null) {
            this.Rule = new String(source.Rule);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.EnName != null) {
            this.EnName = new String(source.EnName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.EnDescription != null) {
            this.EnDescription = new String(source.EnDescription);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.IsEnabled != null) {
            this.IsEnabled = new Long(source.IsEnabled);
        }
        if (source.RiskType != null) {
            this.RiskType = new String(source.RiskType);
        }
        if (source.StrategyCategory != null) {
            this.StrategyCategory = new String(source.StrategyCategory);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Rule", this.Rule);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "EnName", this.EnName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "EnDescription", this.EnDescription);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "IsEnabled", this.IsEnabled);
        this.setParamSimple(map, prefix + "RiskType", this.RiskType);
        this.setParamSimple(map, prefix + "StrategyCategory", this.StrategyCategory);

    }
}


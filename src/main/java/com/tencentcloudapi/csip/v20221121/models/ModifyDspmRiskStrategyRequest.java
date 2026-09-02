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

public class ModifyDspmRiskStrategyRequest extends AbstractModel {

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Risk policy type</p>
    */
    @SerializedName("StrategyType")
    @Expose
    private String StrategyType;

    /**
    * <p>Whether to enable</p>
    */
    @SerializedName("IsEnabled")
    @Expose
    private Long IsEnabled;

    /**
    * <p>Policy content, for example: {     ThresholdValue: &quot;100&quot; }</p>
    */
    @SerializedName("Rule")
    @Expose
    private String Rule;

    /**
    * <p>Available values: Info/Low/Medium/High</p>
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * <p>Policy ID.</p>
    */
    @SerializedName("StrategyId")
    @Expose
    private Long [] StrategyId;

    /**
    * <p>Policy name.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Policy description</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Supported database types</p>
    */
    @SerializedName("DbTypes")
    @Expose
    private String DbTypes;

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
     * Get <p>Risk policy type</p> 
     * @return StrategyType <p>Risk policy type</p>
     */
    public String getStrategyType() {
        return this.StrategyType;
    }

    /**
     * Set <p>Risk policy type</p>
     * @param StrategyType <p>Risk policy type</p>
     */
    public void setStrategyType(String StrategyType) {
        this.StrategyType = StrategyType;
    }

    /**
     * Get <p>Whether to enable</p> 
     * @return IsEnabled <p>Whether to enable</p>
     */
    public Long getIsEnabled() {
        return this.IsEnabled;
    }

    /**
     * Set <p>Whether to enable</p>
     * @param IsEnabled <p>Whether to enable</p>
     */
    public void setIsEnabled(Long IsEnabled) {
        this.IsEnabled = IsEnabled;
    }

    /**
     * Get <p>Policy content, for example: {     ThresholdValue: &quot;100&quot; }</p> 
     * @return Rule <p>Policy content, for example: {     ThresholdValue: &quot;100&quot; }</p>
     */
    public String getRule() {
        return this.Rule;
    }

    /**
     * Set <p>Policy content, for example: {     ThresholdValue: &quot;100&quot; }</p>
     * @param Rule <p>Policy content, for example: {     ThresholdValue: &quot;100&quot; }</p>
     */
    public void setRule(String Rule) {
        this.Rule = Rule;
    }

    /**
     * Get <p>Available values: Info/Low/Medium/High</p> 
     * @return RiskLevel <p>Available values: Info/Low/Medium/High</p>
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set <p>Available values: Info/Low/Medium/High</p>
     * @param RiskLevel <p>Available values: Info/Low/Medium/High</p>
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get <p>Policy ID.</p> 
     * @return StrategyId <p>Policy ID.</p>
     */
    public Long [] getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set <p>Policy ID.</p>
     * @param StrategyId <p>Policy ID.</p>
     */
    public void setStrategyId(Long [] StrategyId) {
        this.StrategyId = StrategyId;
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
     * Get <p>Policy description</p> 
     * @return Description <p>Policy description</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Policy description</p>
     * @param Description <p>Policy description</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Supported database types</p> 
     * @return DbTypes <p>Supported database types</p>
     */
    public String getDbTypes() {
        return this.DbTypes;
    }

    /**
     * Set <p>Supported database types</p>
     * @param DbTypes <p>Supported database types</p>
     */
    public void setDbTypes(String DbTypes) {
        this.DbTypes = DbTypes;
    }

    public ModifyDspmRiskStrategyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDspmRiskStrategyRequest(ModifyDspmRiskStrategyRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.StrategyType != null) {
            this.StrategyType = new String(source.StrategyType);
        }
        if (source.IsEnabled != null) {
            this.IsEnabled = new Long(source.IsEnabled);
        }
        if (source.Rule != null) {
            this.Rule = new String(source.Rule);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.StrategyId != null) {
            this.StrategyId = new Long[source.StrategyId.length];
            for (int i = 0; i < source.StrategyId.length; i++) {
                this.StrategyId[i] = new Long(source.StrategyId[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.DbTypes != null) {
            this.DbTypes = new String(source.DbTypes);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "StrategyType", this.StrategyType);
        this.setParamSimple(map, prefix + "IsEnabled", this.IsEnabled);
        this.setParamSimple(map, prefix + "Rule", this.Rule);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamArraySimple(map, prefix + "StrategyId.", this.StrategyId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "DbTypes", this.DbTypes);

    }
}


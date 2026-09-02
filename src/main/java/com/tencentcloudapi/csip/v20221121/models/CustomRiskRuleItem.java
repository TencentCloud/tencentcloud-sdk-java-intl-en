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

public class CustomRiskRuleItem extends AbstractModel {

    /**
    * <p>Risk rule ID</p>
    */
    @SerializedName("RuleID")
    @Expose
    private String RuleID;

    /**
    * <p>Tencent Cloud</p>
    */
    @SerializedName("Provider")
    @Expose
    private String Provider;

    /**
    * <p>Risk title</p>
    */
    @SerializedName("RiskTitle")
    @Expose
    private String RiskTitle;

    /**
    * <p>Risk classification</p>
    */
    @SerializedName("Classify")
    @Expose
    private String Classify;

    /**
    * <p>Risk level.</p>
    */
    @SerializedName("Severity")
    @Expose
    private String Severity;

    /**
    * <p>Risk rule opening status</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Number of associated accounts</p>
    */
    @SerializedName("RelatedUinCount")
    @Expose
    private Long RelatedUinCount;

    /**
    * <p>Number of accounts with policy activation</p>
    */
    @SerializedName("PolicyEnableCount")
    @Expose
    private Long PolicyEnableCount;

    /**
    * <p>Asset type</p>
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * <p>Whether the rule is free</p>
    */
    @SerializedName("IsFree")
    @Expose
    private Long IsFree;

    /**
    * <p>Check type</p>
    */
    @SerializedName("CheckType")
    @Expose
    private String CheckType;

    /**
    * <p>Security clause specification</p>
    */
    @SerializedName("StandardTerms")
    @Expose
    private StandardTerm [] StandardTerms;

    /**
    * <p>Asset type icon</p>
    */
    @SerializedName("AssetTypeIconURL")
    @Expose
    private String AssetTypeIconURL;

    /**
    * <p>Rule enabled by default</p>
    */
    @SerializedName("EnableDefault")
    @Expose
    private Long EnableDefault;

    /**
     * Get <p>Risk rule ID</p> 
     * @return RuleID <p>Risk rule ID</p>
     */
    public String getRuleID() {
        return this.RuleID;
    }

    /**
     * Set <p>Risk rule ID</p>
     * @param RuleID <p>Risk rule ID</p>
     */
    public void setRuleID(String RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get <p>Tencent Cloud</p> 
     * @return Provider <p>Tencent Cloud</p>
     */
    public String getProvider() {
        return this.Provider;
    }

    /**
     * Set <p>Tencent Cloud</p>
     * @param Provider <p>Tencent Cloud</p>
     */
    public void setProvider(String Provider) {
        this.Provider = Provider;
    }

    /**
     * Get <p>Risk title</p> 
     * @return RiskTitle <p>Risk title</p>
     */
    public String getRiskTitle() {
        return this.RiskTitle;
    }

    /**
     * Set <p>Risk title</p>
     * @param RiskTitle <p>Risk title</p>
     */
    public void setRiskTitle(String RiskTitle) {
        this.RiskTitle = RiskTitle;
    }

    /**
     * Get <p>Risk classification</p> 
     * @return Classify <p>Risk classification</p>
     */
    public String getClassify() {
        return this.Classify;
    }

    /**
     * Set <p>Risk classification</p>
     * @param Classify <p>Risk classification</p>
     */
    public void setClassify(String Classify) {
        this.Classify = Classify;
    }

    /**
     * Get <p>Risk level.</p> 
     * @return Severity <p>Risk level.</p>
     */
    public String getSeverity() {
        return this.Severity;
    }

    /**
     * Set <p>Risk level.</p>
     * @param Severity <p>Risk level.</p>
     */
    public void setSeverity(String Severity) {
        this.Severity = Severity;
    }

    /**
     * Get <p>Risk rule opening status</p> 
     * @return Status <p>Risk rule opening status</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Risk rule opening status</p>
     * @param Status <p>Risk rule opening status</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Number of associated accounts</p> 
     * @return RelatedUinCount <p>Number of associated accounts</p>
     */
    public Long getRelatedUinCount() {
        return this.RelatedUinCount;
    }

    /**
     * Set <p>Number of associated accounts</p>
     * @param RelatedUinCount <p>Number of associated accounts</p>
     */
    public void setRelatedUinCount(Long RelatedUinCount) {
        this.RelatedUinCount = RelatedUinCount;
    }

    /**
     * Get <p>Number of accounts with policy activation</p> 
     * @return PolicyEnableCount <p>Number of accounts with policy activation</p>
     */
    public Long getPolicyEnableCount() {
        return this.PolicyEnableCount;
    }

    /**
     * Set <p>Number of accounts with policy activation</p>
     * @param PolicyEnableCount <p>Number of accounts with policy activation</p>
     */
    public void setPolicyEnableCount(Long PolicyEnableCount) {
        this.PolicyEnableCount = PolicyEnableCount;
    }

    /**
     * Get <p>Asset type</p> 
     * @return AssetType <p>Asset type</p>
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set <p>Asset type</p>
     * @param AssetType <p>Asset type</p>
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get <p>Whether the rule is free</p> 
     * @return IsFree <p>Whether the rule is free</p>
     */
    public Long getIsFree() {
        return this.IsFree;
    }

    /**
     * Set <p>Whether the rule is free</p>
     * @param IsFree <p>Whether the rule is free</p>
     */
    public void setIsFree(Long IsFree) {
        this.IsFree = IsFree;
    }

    /**
     * Get <p>Check type</p> 
     * @return CheckType <p>Check type</p>
     */
    public String getCheckType() {
        return this.CheckType;
    }

    /**
     * Set <p>Check type</p>
     * @param CheckType <p>Check type</p>
     */
    public void setCheckType(String CheckType) {
        this.CheckType = CheckType;
    }

    /**
     * Get <p>Security clause specification</p> 
     * @return StandardTerms <p>Security clause specification</p>
     */
    public StandardTerm [] getStandardTerms() {
        return this.StandardTerms;
    }

    /**
     * Set <p>Security clause specification</p>
     * @param StandardTerms <p>Security clause specification</p>
     */
    public void setStandardTerms(StandardTerm [] StandardTerms) {
        this.StandardTerms = StandardTerms;
    }

    /**
     * Get <p>Asset type icon</p> 
     * @return AssetTypeIconURL <p>Asset type icon</p>
     */
    public String getAssetTypeIconURL() {
        return this.AssetTypeIconURL;
    }

    /**
     * Set <p>Asset type icon</p>
     * @param AssetTypeIconURL <p>Asset type icon</p>
     */
    public void setAssetTypeIconURL(String AssetTypeIconURL) {
        this.AssetTypeIconURL = AssetTypeIconURL;
    }

    /**
     * Get <p>Rule enabled by default</p> 
     * @return EnableDefault <p>Rule enabled by default</p>
     */
    public Long getEnableDefault() {
        return this.EnableDefault;
    }

    /**
     * Set <p>Rule enabled by default</p>
     * @param EnableDefault <p>Rule enabled by default</p>
     */
    public void setEnableDefault(Long EnableDefault) {
        this.EnableDefault = EnableDefault;
    }

    public CustomRiskRuleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomRiskRuleItem(CustomRiskRuleItem source) {
        if (source.RuleID != null) {
            this.RuleID = new String(source.RuleID);
        }
        if (source.Provider != null) {
            this.Provider = new String(source.Provider);
        }
        if (source.RiskTitle != null) {
            this.RiskTitle = new String(source.RiskTitle);
        }
        if (source.Classify != null) {
            this.Classify = new String(source.Classify);
        }
        if (source.Severity != null) {
            this.Severity = new String(source.Severity);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.RelatedUinCount != null) {
            this.RelatedUinCount = new Long(source.RelatedUinCount);
        }
        if (source.PolicyEnableCount != null) {
            this.PolicyEnableCount = new Long(source.PolicyEnableCount);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.IsFree != null) {
            this.IsFree = new Long(source.IsFree);
        }
        if (source.CheckType != null) {
            this.CheckType = new String(source.CheckType);
        }
        if (source.StandardTerms != null) {
            this.StandardTerms = new StandardTerm[source.StandardTerms.length];
            for (int i = 0; i < source.StandardTerms.length; i++) {
                this.StandardTerms[i] = new StandardTerm(source.StandardTerms[i]);
            }
        }
        if (source.AssetTypeIconURL != null) {
            this.AssetTypeIconURL = new String(source.AssetTypeIconURL);
        }
        if (source.EnableDefault != null) {
            this.EnableDefault = new Long(source.EnableDefault);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamSimple(map, prefix + "Provider", this.Provider);
        this.setParamSimple(map, prefix + "RiskTitle", this.RiskTitle);
        this.setParamSimple(map, prefix + "Classify", this.Classify);
        this.setParamSimple(map, prefix + "Severity", this.Severity);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RelatedUinCount", this.RelatedUinCount);
        this.setParamSimple(map, prefix + "PolicyEnableCount", this.PolicyEnableCount);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "IsFree", this.IsFree);
        this.setParamSimple(map, prefix + "CheckType", this.CheckType);
        this.setParamArrayObj(map, prefix + "StandardTerms.", this.StandardTerms);
        this.setParamSimple(map, prefix + "AssetTypeIconURL", this.AssetTypeIconURL);
        this.setParamSimple(map, prefix + "EnableDefault", this.EnableDefault);

    }
}


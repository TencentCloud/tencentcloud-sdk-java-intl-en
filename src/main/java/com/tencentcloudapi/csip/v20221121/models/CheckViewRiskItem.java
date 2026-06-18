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

public class CheckViewRiskItem extends AbstractModel {

    /**
    * <p>Check item rule ID</p>
    */
    @SerializedName("RiskRuleId")
    @Expose
    private String RiskRuleId;

    /**
    * <p>Risk name</p>
    */
    @SerializedName("RiskTitle")
    @Expose
    private String RiskTitle;

    /**
    * <p>Check type</p>
    */
    @SerializedName("CheckType")
    @Expose
    private String CheckType;

    /**
    * <p>Risk level</p>
    */
    @SerializedName("Severity")
    @Expose
    private String Severity;

    /**
    * <p>1 risk item exists</p>
    */
    @SerializedName("RiskDesc")
    @Expose
    private String RiskDesc;

    /**
    * <p>First discovery time</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Risk update time</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>Cloud vendor</p>
    */
    @SerializedName("Provider")
    @Expose
    private String Provider;

    /**
    * <p>Risk status</p>
    */
    @SerializedName("RiskStatus")
    @Expose
    private Long RiskStatus;

    /**
    * <p>Number of affected assets</p>
    */
    @SerializedName("AssetCount")
    @Expose
    private Long AssetCount;

    /**
    * <p>Number of risks</p>
    */
    @SerializedName("RiskCount")
    @Expose
    private Long RiskCount;

    /**
    * <p>Asset type</p>
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * <p>Event type</p>
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * <p>Disposal categorization</p>
    */
    @SerializedName("Classify")
    @Expose
    private String Classify;

    /**
    * <p>cspm standard clauses</p>
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
     * Get <p>Check item rule ID</p> 
     * @return RiskRuleId <p>Check item rule ID</p>
     */
    public String getRiskRuleId() {
        return this.RiskRuleId;
    }

    /**
     * Set <p>Check item rule ID</p>
     * @param RiskRuleId <p>Check item rule ID</p>
     */
    public void setRiskRuleId(String RiskRuleId) {
        this.RiskRuleId = RiskRuleId;
    }

    /**
     * Get <p>Risk name</p> 
     * @return RiskTitle <p>Risk name</p>
     */
    public String getRiskTitle() {
        return this.RiskTitle;
    }

    /**
     * Set <p>Risk name</p>
     * @param RiskTitle <p>Risk name</p>
     */
    public void setRiskTitle(String RiskTitle) {
        this.RiskTitle = RiskTitle;
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
     * Get <p>Risk level</p> 
     * @return Severity <p>Risk level</p>
     */
    public String getSeverity() {
        return this.Severity;
    }

    /**
     * Set <p>Risk level</p>
     * @param Severity <p>Risk level</p>
     */
    public void setSeverity(String Severity) {
        this.Severity = Severity;
    }

    /**
     * Get <p>1 risk item exists</p> 
     * @return RiskDesc <p>1 risk item exists</p>
     */
    public String getRiskDesc() {
        return this.RiskDesc;
    }

    /**
     * Set <p>1 risk item exists</p>
     * @param RiskDesc <p>1 risk item exists</p>
     */
    public void setRiskDesc(String RiskDesc) {
        this.RiskDesc = RiskDesc;
    }

    /**
     * Get <p>First discovery time</p> 
     * @return CreateTime <p>First discovery time</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>First discovery time</p>
     * @param CreateTime <p>First discovery time</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Risk update time</p> 
     * @return UpdateTime <p>Risk update time</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Risk update time</p>
     * @param UpdateTime <p>Risk update time</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>Cloud vendor</p> 
     * @return Provider <p>Cloud vendor</p>
     */
    public String getProvider() {
        return this.Provider;
    }

    /**
     * Set <p>Cloud vendor</p>
     * @param Provider <p>Cloud vendor</p>
     */
    public void setProvider(String Provider) {
        this.Provider = Provider;
    }

    /**
     * Get <p>Risk status</p> 
     * @return RiskStatus <p>Risk status</p>
     */
    public Long getRiskStatus() {
        return this.RiskStatus;
    }

    /**
     * Set <p>Risk status</p>
     * @param RiskStatus <p>Risk status</p>
     */
    public void setRiskStatus(Long RiskStatus) {
        this.RiskStatus = RiskStatus;
    }

    /**
     * Get <p>Number of affected assets</p> 
     * @return AssetCount <p>Number of affected assets</p>
     */
    public Long getAssetCount() {
        return this.AssetCount;
    }

    /**
     * Set <p>Number of affected assets</p>
     * @param AssetCount <p>Number of affected assets</p>
     */
    public void setAssetCount(Long AssetCount) {
        this.AssetCount = AssetCount;
    }

    /**
     * Get <p>Number of risks</p> 
     * @return RiskCount <p>Number of risks</p>
     */
    public Long getRiskCount() {
        return this.RiskCount;
    }

    /**
     * Set <p>Number of risks</p>
     * @param RiskCount <p>Number of risks</p>
     */
    public void setRiskCount(Long RiskCount) {
        this.RiskCount = RiskCount;
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
     * Get <p>Event type</p> 
     * @return EventType <p>Event type</p>
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set <p>Event type</p>
     * @param EventType <p>Event type</p>
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get <p>Disposal categorization</p> 
     * @return Classify <p>Disposal categorization</p>
     */
    public String getClassify() {
        return this.Classify;
    }

    /**
     * Set <p>Disposal categorization</p>
     * @param Classify <p>Disposal categorization</p>
     */
    public void setClassify(String Classify) {
        this.Classify = Classify;
    }

    /**
     * Get <p>cspm standard clauses</p> 
     * @return StandardTerms <p>cspm standard clauses</p>
     */
    public StandardTerm [] getStandardTerms() {
        return this.StandardTerms;
    }

    /**
     * Set <p>cspm standard clauses</p>
     * @param StandardTerms <p>cspm standard clauses</p>
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

    public CheckViewRiskItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckViewRiskItem(CheckViewRiskItem source) {
        if (source.RiskRuleId != null) {
            this.RiskRuleId = new String(source.RiskRuleId);
        }
        if (source.RiskTitle != null) {
            this.RiskTitle = new String(source.RiskTitle);
        }
        if (source.CheckType != null) {
            this.CheckType = new String(source.CheckType);
        }
        if (source.Severity != null) {
            this.Severity = new String(source.Severity);
        }
        if (source.RiskDesc != null) {
            this.RiskDesc = new String(source.RiskDesc);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Provider != null) {
            this.Provider = new String(source.Provider);
        }
        if (source.RiskStatus != null) {
            this.RiskStatus = new Long(source.RiskStatus);
        }
        if (source.AssetCount != null) {
            this.AssetCount = new Long(source.AssetCount);
        }
        if (source.RiskCount != null) {
            this.RiskCount = new Long(source.RiskCount);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.EventType != null) {
            this.EventType = new String(source.EventType);
        }
        if (source.Classify != null) {
            this.Classify = new String(source.Classify);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RiskRuleId", this.RiskRuleId);
        this.setParamSimple(map, prefix + "RiskTitle", this.RiskTitle);
        this.setParamSimple(map, prefix + "CheckType", this.CheckType);
        this.setParamSimple(map, prefix + "Severity", this.Severity);
        this.setParamSimple(map, prefix + "RiskDesc", this.RiskDesc);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Provider", this.Provider);
        this.setParamSimple(map, prefix + "RiskStatus", this.RiskStatus);
        this.setParamSimple(map, prefix + "AssetCount", this.AssetCount);
        this.setParamSimple(map, prefix + "RiskCount", this.RiskCount);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "Classify", this.Classify);
        this.setParamArrayObj(map, prefix + "StandardTerms.", this.StandardTerms);
        this.setParamSimple(map, prefix + "AssetTypeIconURL", this.AssetTypeIconURL);

    }
}


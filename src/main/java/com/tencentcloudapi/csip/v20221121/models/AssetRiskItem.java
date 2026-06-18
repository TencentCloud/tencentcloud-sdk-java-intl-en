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

public class AssetRiskItem extends AbstractModel {

    /**
    * <p>Tenant ID</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>Cloud vendor</p>
    */
    @SerializedName("Provider")
    @Expose
    private String Provider;

    /**
    * <p>Cloud vendor name</p>
    */
    @SerializedName("ProviderName")
    @Expose
    private String ProviderName;

    /**
    * <p>Cloud account name</p>
    */
    @SerializedName("CloudAccountName")
    @Expose
    private String CloudAccountName;

    /**
    * <p>Cloud Account ID</p>
    */
    @SerializedName("CloudAccountId")
    @Expose
    private String CloudAccountId;

    /**
    * <p>Instance name</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>Instance ID.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>First discovery time</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Update time.</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>Risk status</p>
    */
    @SerializedName("RiskStatus")
    @Expose
    private Long RiskStatus;

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
    * <p>Risk rule ID</p>
    */
    @SerializedName("RiskRuleId")
    @Expose
    private String RiskRuleId;

    /**
    * <p>Disposal categorization</p>
    */
    @SerializedName("Classify")
    @Expose
    private String Classify;

    /**
    * <p>Cybersecurity classified protection compliance</p>
    */
    @SerializedName("StandardTerms")
    @Expose
    private StandardTerm [] StandardTerms;

    /**
    * <p>Asset type</p>
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * <p>Asset type icon</p>
    */
    @SerializedName("AssetTypeIconURL")
    @Expose
    private String AssetTypeIconURL;

    /**
    * <p>Asset type</p>
    */
    @SerializedName("AssetTypeName")
    @Expose
    private String AssetTypeName;

    /**
     * Get <p>Tenant ID</p> 
     * @return AppId <p>Tenant ID</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>Tenant ID</p>
     * @param AppId <p>Tenant ID</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
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
     * Get <p>Cloud vendor name</p> 
     * @return ProviderName <p>Cloud vendor name</p>
     */
    public String getProviderName() {
        return this.ProviderName;
    }

    /**
     * Set <p>Cloud vendor name</p>
     * @param ProviderName <p>Cloud vendor name</p>
     */
    public void setProviderName(String ProviderName) {
        this.ProviderName = ProviderName;
    }

    /**
     * Get <p>Cloud account name</p> 
     * @return CloudAccountName <p>Cloud account name</p>
     */
    public String getCloudAccountName() {
        return this.CloudAccountName;
    }

    /**
     * Set <p>Cloud account name</p>
     * @param CloudAccountName <p>Cloud account name</p>
     */
    public void setCloudAccountName(String CloudAccountName) {
        this.CloudAccountName = CloudAccountName;
    }

    /**
     * Get <p>Cloud Account ID</p> 
     * @return CloudAccountId <p>Cloud Account ID</p>
     */
    public String getCloudAccountId() {
        return this.CloudAccountId;
    }

    /**
     * Set <p>Cloud Account ID</p>
     * @param CloudAccountId <p>Cloud Account ID</p>
     */
    public void setCloudAccountId(String CloudAccountId) {
        this.CloudAccountId = CloudAccountId;
    }

    /**
     * Get <p>Instance name</p> 
     * @return InstanceName <p>Instance name</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>Instance name</p>
     * @param InstanceName <p>Instance name</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>Instance ID.</p> 
     * @return InstanceId <p>Instance ID.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID.</p>
     * @param InstanceId <p>Instance ID.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
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
     * Get <p>Update time.</p> 
     * @return UpdateTime <p>Update time.</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Update time.</p>
     * @param UpdateTime <p>Update time.</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
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
     * Get <p>Risk rule ID</p> 
     * @return RiskRuleId <p>Risk rule ID</p>
     */
    public String getRiskRuleId() {
        return this.RiskRuleId;
    }

    /**
     * Set <p>Risk rule ID</p>
     * @param RiskRuleId <p>Risk rule ID</p>
     */
    public void setRiskRuleId(String RiskRuleId) {
        this.RiskRuleId = RiskRuleId;
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
     * Get <p>Cybersecurity classified protection compliance</p> 
     * @return StandardTerms <p>Cybersecurity classified protection compliance</p>
     */
    public StandardTerm [] getStandardTerms() {
        return this.StandardTerms;
    }

    /**
     * Set <p>Cybersecurity classified protection compliance</p>
     * @param StandardTerms <p>Cybersecurity classified protection compliance</p>
     */
    public void setStandardTerms(StandardTerm [] StandardTerms) {
        this.StandardTerms = StandardTerms;
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
     * Get <p>Asset type</p> 
     * @return AssetTypeName <p>Asset type</p>
     */
    public String getAssetTypeName() {
        return this.AssetTypeName;
    }

    /**
     * Set <p>Asset type</p>
     * @param AssetTypeName <p>Asset type</p>
     */
    public void setAssetTypeName(String AssetTypeName) {
        this.AssetTypeName = AssetTypeName;
    }

    public AssetRiskItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetRiskItem(AssetRiskItem source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Provider != null) {
            this.Provider = new String(source.Provider);
        }
        if (source.ProviderName != null) {
            this.ProviderName = new String(source.ProviderName);
        }
        if (source.CloudAccountName != null) {
            this.CloudAccountName = new String(source.CloudAccountName);
        }
        if (source.CloudAccountId != null) {
            this.CloudAccountId = new String(source.CloudAccountId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.RiskStatus != null) {
            this.RiskStatus = new Long(source.RiskStatus);
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
        if (source.RiskRuleId != null) {
            this.RiskRuleId = new String(source.RiskRuleId);
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
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.AssetTypeIconURL != null) {
            this.AssetTypeIconURL = new String(source.AssetTypeIconURL);
        }
        if (source.AssetTypeName != null) {
            this.AssetTypeName = new String(source.AssetTypeName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Provider", this.Provider);
        this.setParamSimple(map, prefix + "ProviderName", this.ProviderName);
        this.setParamSimple(map, prefix + "CloudAccountName", this.CloudAccountName);
        this.setParamSimple(map, prefix + "CloudAccountId", this.CloudAccountId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "RiskStatus", this.RiskStatus);
        this.setParamSimple(map, prefix + "RiskTitle", this.RiskTitle);
        this.setParamSimple(map, prefix + "CheckType", this.CheckType);
        this.setParamSimple(map, prefix + "Severity", this.Severity);
        this.setParamSimple(map, prefix + "RiskRuleId", this.RiskRuleId);
        this.setParamSimple(map, prefix + "Classify", this.Classify);
        this.setParamArrayObj(map, prefix + "StandardTerms.", this.StandardTerms);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "AssetTypeIconURL", this.AssetTypeIconURL);
        this.setParamSimple(map, prefix + "AssetTypeName", this.AssetTypeName);

    }
}


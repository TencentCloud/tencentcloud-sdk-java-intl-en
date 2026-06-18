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

public class RiskDetailItem extends AbstractModel {

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
    * <p>Risk content</p>
    */
    @SerializedName("RiskContent")
    @Expose
    private String RiskContent;

    /**
    * <p>Cloud service provider</p>
    */
    @SerializedName("Provider")
    @Expose
    private String Provider;

    /**
    * <p>Vendor name</p>
    */
    @SerializedName("ProviderName")
    @Expose
    private String ProviderName;

    /**
    * <p>cloud account</p>
    */
    @SerializedName("CloudAccountId")
    @Expose
    private String CloudAccountId;

    /**
    * <p>Cloud account name</p>
    */
    @SerializedName("CloudAccountName")
    @Expose
    private String CloudAccountName;

    /**
    * <p>Instance ID.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Instance name</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>Risk ID</p>
    */
    @SerializedName("RiskId")
    @Expose
    private Long RiskId;

    /**
    * <p>Risk rule ID</p>
    */
    @SerializedName("RiskRuleId")
    @Expose
    private String RiskRuleId;

    /**
    * <p>Risk verification status</p>
    */
    @SerializedName("CheckStatus")
    @Expose
    private String CheckStatus;

    /**
    * <p>User AppID</p>
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * <p>Asset type</p>
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

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
     * Get <p>Risk content</p> 
     * @return RiskContent <p>Risk content</p>
     */
    public String getRiskContent() {
        return this.RiskContent;
    }

    /**
     * Set <p>Risk content</p>
     * @param RiskContent <p>Risk content</p>
     */
    public void setRiskContent(String RiskContent) {
        this.RiskContent = RiskContent;
    }

    /**
     * Get <p>Cloud service provider</p> 
     * @return Provider <p>Cloud service provider</p>
     */
    public String getProvider() {
        return this.Provider;
    }

    /**
     * Set <p>Cloud service provider</p>
     * @param Provider <p>Cloud service provider</p>
     */
    public void setProvider(String Provider) {
        this.Provider = Provider;
    }

    /**
     * Get <p>Vendor name</p> 
     * @return ProviderName <p>Vendor name</p>
     */
    public String getProviderName() {
        return this.ProviderName;
    }

    /**
     * Set <p>Vendor name</p>
     * @param ProviderName <p>Vendor name</p>
     */
    public void setProviderName(String ProviderName) {
        this.ProviderName = ProviderName;
    }

    /**
     * Get <p>cloud account</p> 
     * @return CloudAccountId <p>cloud account</p>
     */
    public String getCloudAccountId() {
        return this.CloudAccountId;
    }

    /**
     * Set <p>cloud account</p>
     * @param CloudAccountId <p>cloud account</p>
     */
    public void setCloudAccountId(String CloudAccountId) {
        this.CloudAccountId = CloudAccountId;
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
     * Get <p>Risk ID</p> 
     * @return RiskId <p>Risk ID</p>
     */
    public Long getRiskId() {
        return this.RiskId;
    }

    /**
     * Set <p>Risk ID</p>
     * @param RiskId <p>Risk ID</p>
     */
    public void setRiskId(Long RiskId) {
        this.RiskId = RiskId;
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
     * Get <p>Risk verification status</p> 
     * @return CheckStatus <p>Risk verification status</p>
     */
    public String getCheckStatus() {
        return this.CheckStatus;
    }

    /**
     * Set <p>Risk verification status</p>
     * @param CheckStatus <p>Risk verification status</p>
     */
    public void setCheckStatus(String CheckStatus) {
        this.CheckStatus = CheckStatus;
    }

    /**
     * Get <p>User AppID</p> 
     * @return AppID <p>User AppID</p>
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set <p>User AppID</p>
     * @param AppID <p>User AppID</p>
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
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

    public RiskDetailItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RiskDetailItem(RiskDetailItem source) {
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.RiskStatus != null) {
            this.RiskStatus = new Long(source.RiskStatus);
        }
        if (source.RiskContent != null) {
            this.RiskContent = new String(source.RiskContent);
        }
        if (source.Provider != null) {
            this.Provider = new String(source.Provider);
        }
        if (source.ProviderName != null) {
            this.ProviderName = new String(source.ProviderName);
        }
        if (source.CloudAccountId != null) {
            this.CloudAccountId = new String(source.CloudAccountId);
        }
        if (source.CloudAccountName != null) {
            this.CloudAccountName = new String(source.CloudAccountName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.RiskId != null) {
            this.RiskId = new Long(source.RiskId);
        }
        if (source.RiskRuleId != null) {
            this.RiskRuleId = new String(source.RiskRuleId);
        }
        if (source.CheckStatus != null) {
            this.CheckStatus = new String(source.CheckStatus);
        }
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "RiskStatus", this.RiskStatus);
        this.setParamSimple(map, prefix + "RiskContent", this.RiskContent);
        this.setParamSimple(map, prefix + "Provider", this.Provider);
        this.setParamSimple(map, prefix + "ProviderName", this.ProviderName);
        this.setParamSimple(map, prefix + "CloudAccountId", this.CloudAccountId);
        this.setParamSimple(map, prefix + "CloudAccountName", this.CloudAccountName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "RiskId", this.RiskId);
        this.setParamSimple(map, prefix + "RiskRuleId", this.RiskRuleId);
        this.setParamSimple(map, prefix + "CheckStatus", this.CheckStatus);
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);

    }
}


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

public class HighBaseLineRiskItem extends AbstractModel {

    /**
    * Cloud account ID.
    */
    @SerializedName("CloudAccountID")
    @Expose
    private String CloudAccountID;

    /**
    * Instance ID.
    */
    @SerializedName("AssetID")
    @Expose
    private String AssetID;

    /**
    * Instance status
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * Instance name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Risk name.
    */
    @SerializedName("RiskName")
    @Expose
    private String RiskName;

    /**
    * Risk classification.
    */
    @SerializedName("RiskCategory")
    @Expose
    private String RiskCategory;

    /**
    * Risk level.
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * Risk description.
    */
    @SerializedName("RiskDesc")
    @Expose
    private String RiskDesc;

    /**
    * Risk result.
    */
    @SerializedName("RiskResult")
    @Expose
    private String RiskResult;

    /**
    * Fixing suggestion
    */
    @SerializedName("FixAdvice")
    @Expose
    private String FixAdvice;

    /**
    * Linux vulnerability.
    */
    @SerializedName("RiskCategoryName")
    @Expose
    private String RiskCategoryName;

    /**
    * Risk name.
    */
    @SerializedName("RiskLevelName")
    @Expose
    private String RiskLevelName;

    /**
    * Instance status
    */
    @SerializedName("InstanceStatusName")
    @Expose
    private String InstanceStatusName;

    /**
    * First detection time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last discovery time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Tenant ID.
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
     * Get Cloud account ID. 
     * @return CloudAccountID Cloud account ID.
     */
    public String getCloudAccountID() {
        return this.CloudAccountID;
    }

    /**
     * Set Cloud account ID.
     * @param CloudAccountID Cloud account ID.
     */
    public void setCloudAccountID(String CloudAccountID) {
        this.CloudAccountID = CloudAccountID;
    }

    /**
     * Get Instance ID. 
     * @return AssetID Instance ID.
     */
    public String getAssetID() {
        return this.AssetID;
    }

    /**
     * Set Instance ID.
     * @param AssetID Instance ID.
     */
    public void setAssetID(String AssetID) {
        this.AssetID = AssetID;
    }

    /**
     * Get Instance status 
     * @return InstanceStatus Instance status
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set Instance status
     * @param InstanceStatus Instance status
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get Instance name 
     * @return InstanceName Instance name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name
     * @param InstanceName Instance name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Risk name. 
     * @return RiskName Risk name.
     */
    public String getRiskName() {
        return this.RiskName;
    }

    /**
     * Set Risk name.
     * @param RiskName Risk name.
     */
    public void setRiskName(String RiskName) {
        this.RiskName = RiskName;
    }

    /**
     * Get Risk classification. 
     * @return RiskCategory Risk classification.
     */
    public String getRiskCategory() {
        return this.RiskCategory;
    }

    /**
     * Set Risk classification.
     * @param RiskCategory Risk classification.
     */
    public void setRiskCategory(String RiskCategory) {
        this.RiskCategory = RiskCategory;
    }

    /**
     * Get Risk level. 
     * @return RiskLevel Risk level.
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set Risk level.
     * @param RiskLevel Risk level.
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get Risk description. 
     * @return RiskDesc Risk description.
     */
    public String getRiskDesc() {
        return this.RiskDesc;
    }

    /**
     * Set Risk description.
     * @param RiskDesc Risk description.
     */
    public void setRiskDesc(String RiskDesc) {
        this.RiskDesc = RiskDesc;
    }

    /**
     * Get Risk result. 
     * @return RiskResult Risk result.
     */
    public String getRiskResult() {
        return this.RiskResult;
    }

    /**
     * Set Risk result.
     * @param RiskResult Risk result.
     */
    public void setRiskResult(String RiskResult) {
        this.RiskResult = RiskResult;
    }

    /**
     * Get Fixing suggestion 
     * @return FixAdvice Fixing suggestion
     */
    public String getFixAdvice() {
        return this.FixAdvice;
    }

    /**
     * Set Fixing suggestion
     * @param FixAdvice Fixing suggestion
     */
    public void setFixAdvice(String FixAdvice) {
        this.FixAdvice = FixAdvice;
    }

    /**
     * Get Linux vulnerability. 
     * @return RiskCategoryName Linux vulnerability.
     */
    public String getRiskCategoryName() {
        return this.RiskCategoryName;
    }

    /**
     * Set Linux vulnerability.
     * @param RiskCategoryName Linux vulnerability.
     */
    public void setRiskCategoryName(String RiskCategoryName) {
        this.RiskCategoryName = RiskCategoryName;
    }

    /**
     * Get Risk name. 
     * @return RiskLevelName Risk name.
     */
    public String getRiskLevelName() {
        return this.RiskLevelName;
    }

    /**
     * Set Risk name.
     * @param RiskLevelName Risk name.
     */
    public void setRiskLevelName(String RiskLevelName) {
        this.RiskLevelName = RiskLevelName;
    }

    /**
     * Get Instance status 
     * @return InstanceStatusName Instance status
     */
    public String getInstanceStatusName() {
        return this.InstanceStatusName;
    }

    /**
     * Set Instance status
     * @param InstanceStatusName Instance status
     */
    public void setInstanceStatusName(String InstanceStatusName) {
        this.InstanceStatusName = InstanceStatusName;
    }

    /**
     * Get First detection time 
     * @return CreateTime First detection time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set First detection time
     * @param CreateTime First detection time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last discovery time 
     * @return UpdateTime Last discovery time
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last discovery time
     * @param UpdateTime Last discovery time
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Tenant ID. 
     * @return AppID Tenant ID.
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set Tenant ID.
     * @param AppID Tenant ID.
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    public HighBaseLineRiskItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HighBaseLineRiskItem(HighBaseLineRiskItem source) {
        if (source.CloudAccountID != null) {
            this.CloudAccountID = new String(source.CloudAccountID);
        }
        if (source.AssetID != null) {
            this.AssetID = new String(source.AssetID);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new String(source.InstanceStatus);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.RiskName != null) {
            this.RiskName = new String(source.RiskName);
        }
        if (source.RiskCategory != null) {
            this.RiskCategory = new String(source.RiskCategory);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.RiskDesc != null) {
            this.RiskDesc = new String(source.RiskDesc);
        }
        if (source.RiskResult != null) {
            this.RiskResult = new String(source.RiskResult);
        }
        if (source.FixAdvice != null) {
            this.FixAdvice = new String(source.FixAdvice);
        }
        if (source.RiskCategoryName != null) {
            this.RiskCategoryName = new String(source.RiskCategoryName);
        }
        if (source.RiskLevelName != null) {
            this.RiskLevelName = new String(source.RiskLevelName);
        }
        if (source.InstanceStatusName != null) {
            this.InstanceStatusName = new String(source.InstanceStatusName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CloudAccountID", this.CloudAccountID);
        this.setParamSimple(map, prefix + "AssetID", this.AssetID);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "RiskName", this.RiskName);
        this.setParamSimple(map, prefix + "RiskCategory", this.RiskCategory);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "RiskDesc", this.RiskDesc);
        this.setParamSimple(map, prefix + "RiskResult", this.RiskResult);
        this.setParamSimple(map, prefix + "FixAdvice", this.FixAdvice);
        this.setParamSimple(map, prefix + "RiskCategoryName", this.RiskCategoryName);
        this.setParamSimple(map, prefix + "RiskLevelName", this.RiskLevelName);
        this.setParamSimple(map, prefix + "InstanceStatusName", this.InstanceStatusName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "AppID", this.AppID);

    }
}


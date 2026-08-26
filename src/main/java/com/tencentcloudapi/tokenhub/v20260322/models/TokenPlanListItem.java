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
package com.tencentcloudapi.tokenhub.v20260322.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TokenPlanListItem extends AbstractModel {

    /**
    * <p>Package ID.</p>
    */
    @SerializedName("TeamId")
    @Expose
    private String TeamId;

    /**
    * <p>Package type. Values: enterprise (Enterprise Professional package), enterprise-auto (Enterprise Light package)</p>
    */
    @SerializedName("ProductType")
    @Expose
    private String ProductType;

    /**
    * <p>Package name. Maximum 128 characters.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Account APP ID.</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>Main account UIN.</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>Package status. Valid values: enable, disable.</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Reason for package disablement. Value: NORMAL, ISOLATED, FROZEN, EXHAUSTED, DESTROYED</p>
    */
    @SerializedName("StopReason")
    @Expose
    private String StopReason;

    /**
    * <p>Maximum number of API Keys that can be created.</p>
    */
    @SerializedName("ApiKeyMax")
    @Expose
    private Long ApiKeyMax;

    /**
    * <p>Number of API Keys currently created</p>
    */
    @SerializedName("ApiKeyCount")
    @Expose
    private Long ApiKeyCount;

    /**
    * <p>Cloud billing prepaid resource package ID.</p>
    */
    @SerializedName("PrepayResourceID")
    @Expose
    private String PrepayResourceID;

    /**
    * <p>Creator. If the package is created by a sub-account, this value is the sub-account UIN.</p>
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * <p>Creation time.</p>
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * <p>Update time.</p>
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * <p>Basic information of the package.</p>
    */
    @SerializedName("PackageInfo")
    @Expose
    private TokenPlanPackageInfo PackageInfo;

    /**
    * <p>Whether to enable auto-renewal. Value: 0 (not enabled), 1 (enabled)</p>
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
     * Get <p>Package ID.</p> 
     * @return TeamId <p>Package ID.</p>
     */
    public String getTeamId() {
        return this.TeamId;
    }

    /**
     * Set <p>Package ID.</p>
     * @param TeamId <p>Package ID.</p>
     */
    public void setTeamId(String TeamId) {
        this.TeamId = TeamId;
    }

    /**
     * Get <p>Package type. Values: enterprise (Enterprise Professional package), enterprise-auto (Enterprise Light package)</p> 
     * @return ProductType <p>Package type. Values: enterprise (Enterprise Professional package), enterprise-auto (Enterprise Light package)</p>
     */
    public String getProductType() {
        return this.ProductType;
    }

    /**
     * Set <p>Package type. Values: enterprise (Enterprise Professional package), enterprise-auto (Enterprise Light package)</p>
     * @param ProductType <p>Package type. Values: enterprise (Enterprise Professional package), enterprise-auto (Enterprise Light package)</p>
     */
    public void setProductType(String ProductType) {
        this.ProductType = ProductType;
    }

    /**
     * Get <p>Package name. Maximum 128 characters.</p> 
     * @return Name <p>Package name. Maximum 128 characters.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Package name. Maximum 128 characters.</p>
     * @param Name <p>Package name. Maximum 128 characters.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Account APP ID.</p> 
     * @return AppId <p>Account APP ID.</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>Account APP ID.</p>
     * @param AppId <p>Account APP ID.</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>Main account UIN.</p> 
     * @return Uin <p>Main account UIN.</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>Main account UIN.</p>
     * @param Uin <p>Main account UIN.</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>Package status. Valid values: enable, disable.</p> 
     * @return Status <p>Package status. Valid values: enable, disable.</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Package status. Valid values: enable, disable.</p>
     * @param Status <p>Package status. Valid values: enable, disable.</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Reason for package disablement. Value: NORMAL, ISOLATED, FROZEN, EXHAUSTED, DESTROYED</p> 
     * @return StopReason <p>Reason for package disablement. Value: NORMAL, ISOLATED, FROZEN, EXHAUSTED, DESTROYED</p>
     */
    public String getStopReason() {
        return this.StopReason;
    }

    /**
     * Set <p>Reason for package disablement. Value: NORMAL, ISOLATED, FROZEN, EXHAUSTED, DESTROYED</p>
     * @param StopReason <p>Reason for package disablement. Value: NORMAL, ISOLATED, FROZEN, EXHAUSTED, DESTROYED</p>
     */
    public void setStopReason(String StopReason) {
        this.StopReason = StopReason;
    }

    /**
     * Get <p>Maximum number of API Keys that can be created.</p> 
     * @return ApiKeyMax <p>Maximum number of API Keys that can be created.</p>
     */
    public Long getApiKeyMax() {
        return this.ApiKeyMax;
    }

    /**
     * Set <p>Maximum number of API Keys that can be created.</p>
     * @param ApiKeyMax <p>Maximum number of API Keys that can be created.</p>
     */
    public void setApiKeyMax(Long ApiKeyMax) {
        this.ApiKeyMax = ApiKeyMax;
    }

    /**
     * Get <p>Number of API Keys currently created</p> 
     * @return ApiKeyCount <p>Number of API Keys currently created</p>
     */
    public Long getApiKeyCount() {
        return this.ApiKeyCount;
    }

    /**
     * Set <p>Number of API Keys currently created</p>
     * @param ApiKeyCount <p>Number of API Keys currently created</p>
     */
    public void setApiKeyCount(Long ApiKeyCount) {
        this.ApiKeyCount = ApiKeyCount;
    }

    /**
     * Get <p>Cloud billing prepaid resource package ID.</p> 
     * @return PrepayResourceID <p>Cloud billing prepaid resource package ID.</p>
     */
    public String getPrepayResourceID() {
        return this.PrepayResourceID;
    }

    /**
     * Set <p>Cloud billing prepaid resource package ID.</p>
     * @param PrepayResourceID <p>Cloud billing prepaid resource package ID.</p>
     */
    public void setPrepayResourceID(String PrepayResourceID) {
        this.PrepayResourceID = PrepayResourceID;
    }

    /**
     * Get <p>Creator. If the package is created by a sub-account, this value is the sub-account UIN.</p> 
     * @return Creator <p>Creator. If the package is created by a sub-account, this value is the sub-account UIN.</p>
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set <p>Creator. If the package is created by a sub-account, this value is the sub-account UIN.</p>
     * @param Creator <p>Creator. If the package is created by a sub-account, this value is the sub-account UIN.</p>
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get <p>Creation time.</p> 
     * @return CreatedAt <p>Creation time.</p>
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set <p>Creation time.</p>
     * @param CreatedAt <p>Creation time.</p>
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get <p>Update time.</p> 
     * @return UpdatedAt <p>Update time.</p>
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set <p>Update time.</p>
     * @param UpdatedAt <p>Update time.</p>
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get <p>Basic information of the package.</p> 
     * @return PackageInfo <p>Basic information of the package.</p>
     */
    public TokenPlanPackageInfo getPackageInfo() {
        return this.PackageInfo;
    }

    /**
     * Set <p>Basic information of the package.</p>
     * @param PackageInfo <p>Basic information of the package.</p>
     */
    public void setPackageInfo(TokenPlanPackageInfo PackageInfo) {
        this.PackageInfo = PackageInfo;
    }

    /**
     * Get <p>Whether to enable auto-renewal. Value: 0 (not enabled), 1 (enabled)</p> 
     * @return AutoRenewFlag <p>Whether to enable auto-renewal. Value: 0 (not enabled), 1 (enabled)</p>
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set <p>Whether to enable auto-renewal. Value: 0 (not enabled), 1 (enabled)</p>
     * @param AutoRenewFlag <p>Whether to enable auto-renewal. Value: 0 (not enabled), 1 (enabled)</p>
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    public TokenPlanListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TokenPlanListItem(TokenPlanListItem source) {
        if (source.TeamId != null) {
            this.TeamId = new String(source.TeamId);
        }
        if (source.ProductType != null) {
            this.ProductType = new String(source.ProductType);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StopReason != null) {
            this.StopReason = new String(source.StopReason);
        }
        if (source.ApiKeyMax != null) {
            this.ApiKeyMax = new Long(source.ApiKeyMax);
        }
        if (source.ApiKeyCount != null) {
            this.ApiKeyCount = new Long(source.ApiKeyCount);
        }
        if (source.PrepayResourceID != null) {
            this.PrepayResourceID = new String(source.PrepayResourceID);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.PackageInfo != null) {
            this.PackageInfo = new TokenPlanPackageInfo(source.PackageInfo);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TeamId", this.TeamId);
        this.setParamSimple(map, prefix + "ProductType", this.ProductType);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StopReason", this.StopReason);
        this.setParamSimple(map, prefix + "ApiKeyMax", this.ApiKeyMax);
        this.setParamSimple(map, prefix + "ApiKeyCount", this.ApiKeyCount);
        this.setParamSimple(map, prefix + "PrepayResourceID", this.PrepayResourceID);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamObj(map, prefix + "PackageInfo.", this.PackageInfo);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);

    }
}


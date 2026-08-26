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

public class TokenPlanApiKeyInfo extends AbstractModel {

    /**
    * API Key ID.
    */
    @SerializedName("ApiKeyId")
    @Expose
    private String ApiKeyId;

    /**
    * API Key secret key value (masked).
    */
    @SerializedName("ApiKey")
    @Expose
    private String ApiKey;

    /**
    * API Key name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Bundle ID.
    */
    @SerializedName("TeamId")
    @Expose
    private String TeamId;

    /**
    * Account APP ID.
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * Main account UIN.
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * API Key available model list (JSON array string).
    */
    @SerializedName("AllowedModels")
    @Expose
    private String AllowedModels;

    /**
    * Whether the API Key is available. Values: enable (enable), disable (disable).
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Reason for disabling the API Key. Valid values: NORMAL (normal, default value), QUOTA_EXHAUSTED (API Key quota package exhausted), ABNORMAL (exception, human intervention required)
    */
    @SerializedName("StopReason")
    @Expose
    private String StopReason;

    /**
    * User-side switch. Valid values: enable, disable.
    */
    @SerializedName("UseStatus")
    @Expose
    private String UseStatus;

    /**
    * Key version.
    */
    @SerializedName("KeyVersion")
    @Expose
    private Long KeyVersion;

    /**
    * Last reset time (ISO 8601).
    */
    @SerializedName("LastRotatedAt")
    @Expose
    private String LastRotatedAt;

    /**
    * Creator. If it is created by a sub-account, this value is the sub-account UIN.
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * Creation time.
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * Update time.
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * TPM limit (Tokens Per Minute).
    */
    @SerializedName("TPM")
    @Expose
    private Long TPM;

    /**
    * Package type. Values: enterprise (Enterprise Professional package), enterprise-auto (Enterprise Light package)
    */
    @SerializedName("ProductType")
    @Expose
    private String ProductType;

    /**
     * Get API Key ID. 
     * @return ApiKeyId API Key ID.
     */
    public String getApiKeyId() {
        return this.ApiKeyId;
    }

    /**
     * Set API Key ID.
     * @param ApiKeyId API Key ID.
     */
    public void setApiKeyId(String ApiKeyId) {
        this.ApiKeyId = ApiKeyId;
    }

    /**
     * Get API Key secret key value (masked). 
     * @return ApiKey API Key secret key value (masked).
     */
    public String getApiKey() {
        return this.ApiKey;
    }

    /**
     * Set API Key secret key value (masked).
     * @param ApiKey API Key secret key value (masked).
     */
    public void setApiKey(String ApiKey) {
        this.ApiKey = ApiKey;
    }

    /**
     * Get API Key name. 
     * @return Name API Key name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set API Key name.
     * @param Name API Key name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Bundle ID. 
     * @return TeamId Bundle ID.
     */
    public String getTeamId() {
        return this.TeamId;
    }

    /**
     * Set Bundle ID.
     * @param TeamId Bundle ID.
     */
    public void setTeamId(String TeamId) {
        this.TeamId = TeamId;
    }

    /**
     * Get Account APP ID. 
     * @return AppId Account APP ID.
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set Account APP ID.
     * @param AppId Account APP ID.
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Main account UIN. 
     * @return Uin Main account UIN.
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set Main account UIN.
     * @param Uin Main account UIN.
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get API Key available model list (JSON array string). 
     * @return AllowedModels API Key available model list (JSON array string).
     */
    public String getAllowedModels() {
        return this.AllowedModels;
    }

    /**
     * Set API Key available model list (JSON array string).
     * @param AllowedModels API Key available model list (JSON array string).
     */
    public void setAllowedModels(String AllowedModels) {
        this.AllowedModels = AllowedModels;
    }

    /**
     * Get Whether the API Key is available. Values: enable (enable), disable (disable). 
     * @return Status Whether the API Key is available. Values: enable (enable), disable (disable).
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Whether the API Key is available. Values: enable (enable), disable (disable).
     * @param Status Whether the API Key is available. Values: enable (enable), disable (disable).
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Reason for disabling the API Key. Valid values: NORMAL (normal, default value), QUOTA_EXHAUSTED (API Key quota package exhausted), ABNORMAL (exception, human intervention required) 
     * @return StopReason Reason for disabling the API Key. Valid values: NORMAL (normal, default value), QUOTA_EXHAUSTED (API Key quota package exhausted), ABNORMAL (exception, human intervention required)
     */
    public String getStopReason() {
        return this.StopReason;
    }

    /**
     * Set Reason for disabling the API Key. Valid values: NORMAL (normal, default value), QUOTA_EXHAUSTED (API Key quota package exhausted), ABNORMAL (exception, human intervention required)
     * @param StopReason Reason for disabling the API Key. Valid values: NORMAL (normal, default value), QUOTA_EXHAUSTED (API Key quota package exhausted), ABNORMAL (exception, human intervention required)
     */
    public void setStopReason(String StopReason) {
        this.StopReason = StopReason;
    }

    /**
     * Get User-side switch. Valid values: enable, disable. 
     * @return UseStatus User-side switch. Valid values: enable, disable.
     */
    public String getUseStatus() {
        return this.UseStatus;
    }

    /**
     * Set User-side switch. Valid values: enable, disable.
     * @param UseStatus User-side switch. Valid values: enable, disable.
     */
    public void setUseStatus(String UseStatus) {
        this.UseStatus = UseStatus;
    }

    /**
     * Get Key version. 
     * @return KeyVersion Key version.
     */
    public Long getKeyVersion() {
        return this.KeyVersion;
    }

    /**
     * Set Key version.
     * @param KeyVersion Key version.
     */
    public void setKeyVersion(Long KeyVersion) {
        this.KeyVersion = KeyVersion;
    }

    /**
     * Get Last reset time (ISO 8601). 
     * @return LastRotatedAt Last reset time (ISO 8601).
     */
    public String getLastRotatedAt() {
        return this.LastRotatedAt;
    }

    /**
     * Set Last reset time (ISO 8601).
     * @param LastRotatedAt Last reset time (ISO 8601).
     */
    public void setLastRotatedAt(String LastRotatedAt) {
        this.LastRotatedAt = LastRotatedAt;
    }

    /**
     * Get Creator. If it is created by a sub-account, this value is the sub-account UIN. 
     * @return Creator Creator. If it is created by a sub-account, this value is the sub-account UIN.
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set Creator. If it is created by a sub-account, this value is the sub-account UIN.
     * @param Creator Creator. If it is created by a sub-account, this value is the sub-account UIN.
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get Creation time. 
     * @return CreatedAt Creation time.
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set Creation time.
     * @param CreatedAt Creation time.
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get Update time. 
     * @return UpdatedAt Update time.
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set Update time.
     * @param UpdatedAt Update time.
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get TPM limit (Tokens Per Minute). 
     * @return TPM TPM limit (Tokens Per Minute).
     */
    public Long getTPM() {
        return this.TPM;
    }

    /**
     * Set TPM limit (Tokens Per Minute).
     * @param TPM TPM limit (Tokens Per Minute).
     */
    public void setTPM(Long TPM) {
        this.TPM = TPM;
    }

    /**
     * Get Package type. Values: enterprise (Enterprise Professional package), enterprise-auto (Enterprise Light package) 
     * @return ProductType Package type. Values: enterprise (Enterprise Professional package), enterprise-auto (Enterprise Light package)
     */
    public String getProductType() {
        return this.ProductType;
    }

    /**
     * Set Package type. Values: enterprise (Enterprise Professional package), enterprise-auto (Enterprise Light package)
     * @param ProductType Package type. Values: enterprise (Enterprise Professional package), enterprise-auto (Enterprise Light package)
     */
    public void setProductType(String ProductType) {
        this.ProductType = ProductType;
    }

    public TokenPlanApiKeyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TokenPlanApiKeyInfo(TokenPlanApiKeyInfo source) {
        if (source.ApiKeyId != null) {
            this.ApiKeyId = new String(source.ApiKeyId);
        }
        if (source.ApiKey != null) {
            this.ApiKey = new String(source.ApiKey);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TeamId != null) {
            this.TeamId = new String(source.TeamId);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.AllowedModels != null) {
            this.AllowedModels = new String(source.AllowedModels);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StopReason != null) {
            this.StopReason = new String(source.StopReason);
        }
        if (source.UseStatus != null) {
            this.UseStatus = new String(source.UseStatus);
        }
        if (source.KeyVersion != null) {
            this.KeyVersion = new Long(source.KeyVersion);
        }
        if (source.LastRotatedAt != null) {
            this.LastRotatedAt = new String(source.LastRotatedAt);
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
        if (source.TPM != null) {
            this.TPM = new Long(source.TPM);
        }
        if (source.ProductType != null) {
            this.ProductType = new String(source.ProductType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApiKeyId", this.ApiKeyId);
        this.setParamSimple(map, prefix + "ApiKey", this.ApiKey);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "TeamId", this.TeamId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "AllowedModels", this.AllowedModels);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StopReason", this.StopReason);
        this.setParamSimple(map, prefix + "UseStatus", this.UseStatus);
        this.setParamSimple(map, prefix + "KeyVersion", this.KeyVersion);
        this.setParamSimple(map, prefix + "LastRotatedAt", this.LastRotatedAt);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "TPM", this.TPM);
        this.setParamSimple(map, prefix + "ProductType", this.ProductType);

    }
}


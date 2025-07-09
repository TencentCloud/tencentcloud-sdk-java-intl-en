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
package com.tencentcloudapi.eiam.v20210420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApplicationResponse extends AbstractModel {

    /**
    * Key ID.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * Displayed application name, which can contain up to 64 characters and is the same as the application name by default.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * Last modification time of the application in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastModifiedDate")
    @Expose
    private String LastModifiedDate;

    /**
    * Client ID.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * Application type, i.e., the application template type selected during application creation.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationType")
    @Expose
    private String ApplicationType;

    /**
    * Application creation time in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreatedDate")
    @Expose
    private String CreatedDate;

    /**
    * Application ID, which is globally unique.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * Token validity period in seconds.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TokenExpired")
    @Expose
    private Long TokenExpired;

    /**
    * Client secret.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClientSecret")
    @Expose
    private String ClientSecret;

    /**
    * Public key information.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PublicKey")
    @Expose
    private String PublicKey;

    /**
    * Authorization address.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AuthorizeUrl")
    @Expose
    private String AuthorizeUrl;

    /**
    * Access address of the application icon image.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IconUrl")
    @Expose
    private String IconUrl;

    /**
    * Security level.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SecureLevel")
    @Expose
    private String SecureLevel;

    /**
    * Application status.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AppStatus")
    @Expose
    private Boolean AppStatus;

    /**
    * Description.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Key ID.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return KeyId Key ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set Key ID.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param KeyId Key ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get Displayed application name, which can contain up to 64 characters and is the same as the application name by default.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DisplayName Displayed application name, which can contain up to 64 characters and is the same as the application name by default.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set Displayed application name, which can contain up to 64 characters and is the same as the application name by default.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DisplayName Displayed application name, which can contain up to 64 characters and is the same as the application name by default.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get Last modification time of the application in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return LastModifiedDate Last modification time of the application in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getLastModifiedDate() {
        return this.LastModifiedDate;
    }

    /**
     * Set Last modification time of the application in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param LastModifiedDate Last modification time of the application in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLastModifiedDate(String LastModifiedDate) {
        this.LastModifiedDate = LastModifiedDate;
    }

    /**
     * Get Client ID.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ClientId Client ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set Client ID.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ClientId Client ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get Application type, i.e., the application template type selected during application creation.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ApplicationType Application type, i.e., the application template type selected during application creation.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getApplicationType() {
        return this.ApplicationType;
    }

    /**
     * Set Application type, i.e., the application template type selected during application creation.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ApplicationType Application type, i.e., the application template type selected during application creation.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setApplicationType(String ApplicationType) {
        this.ApplicationType = ApplicationType;
    }

    /**
     * Get Application creation time in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CreatedDate Application creation time in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCreatedDate() {
        return this.CreatedDate;
    }

    /**
     * Set Application creation time in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CreatedDate Application creation time in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCreatedDate(String CreatedDate) {
        this.CreatedDate = CreatedDate;
    }

    /**
     * Get Application ID, which is globally unique.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ApplicationId Application ID, which is globally unique.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set Application ID, which is globally unique.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ApplicationId Application ID, which is globally unique.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get Token validity period in seconds.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TokenExpired Token validity period in seconds.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getTokenExpired() {
        return this.TokenExpired;
    }

    /**
     * Set Token validity period in seconds.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TokenExpired Token validity period in seconds.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTokenExpired(Long TokenExpired) {
        this.TokenExpired = TokenExpired;
    }

    /**
     * Get Client secret.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ClientSecret Client secret.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getClientSecret() {
        return this.ClientSecret;
    }

    /**
     * Set Client secret.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ClientSecret Client secret.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setClientSecret(String ClientSecret) {
        this.ClientSecret = ClientSecret;
    }

    /**
     * Get Public key information.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PublicKey Public key information.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getPublicKey() {
        return this.PublicKey;
    }

    /**
     * Set Public key information.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PublicKey Public key information.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPublicKey(String PublicKey) {
        this.PublicKey = PublicKey;
    }

    /**
     * Get Authorization address.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AuthorizeUrl Authorization address.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getAuthorizeUrl() {
        return this.AuthorizeUrl;
    }

    /**
     * Set Authorization address.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AuthorizeUrl Authorization address.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAuthorizeUrl(String AuthorizeUrl) {
        this.AuthorizeUrl = AuthorizeUrl;
    }

    /**
     * Get Access address of the application icon image.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IconUrl Access address of the application icon image.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getIconUrl() {
        return this.IconUrl;
    }

    /**
     * Set Access address of the application icon image.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IconUrl Access address of the application icon image.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIconUrl(String IconUrl) {
        this.IconUrl = IconUrl;
    }

    /**
     * Get Security level.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SecureLevel Security level.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getSecureLevel() {
        return this.SecureLevel;
    }

    /**
     * Set Security level.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SecureLevel Security level.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSecureLevel(String SecureLevel) {
        this.SecureLevel = SecureLevel;
    }

    /**
     * Get Application status.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AppStatus Application status.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getAppStatus() {
        return this.AppStatus;
    }

    /**
     * Set Application status.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AppStatus Application status.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAppStatus(Boolean AppStatus) {
        this.AppStatus = AppStatus;
    }

    /**
     * Get Description.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Description Description.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Description Description.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeApplicationResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApplicationResponse(DescribeApplicationResponse source) {
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.LastModifiedDate != null) {
            this.LastModifiedDate = new String(source.LastModifiedDate);
        }
        if (source.ClientId != null) {
            this.ClientId = new String(source.ClientId);
        }
        if (source.ApplicationType != null) {
            this.ApplicationType = new String(source.ApplicationType);
        }
        if (source.CreatedDate != null) {
            this.CreatedDate = new String(source.CreatedDate);
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.TokenExpired != null) {
            this.TokenExpired = new Long(source.TokenExpired);
        }
        if (source.ClientSecret != null) {
            this.ClientSecret = new String(source.ClientSecret);
        }
        if (source.PublicKey != null) {
            this.PublicKey = new String(source.PublicKey);
        }
        if (source.AuthorizeUrl != null) {
            this.AuthorizeUrl = new String(source.AuthorizeUrl);
        }
        if (source.IconUrl != null) {
            this.IconUrl = new String(source.IconUrl);
        }
        if (source.SecureLevel != null) {
            this.SecureLevel = new String(source.SecureLevel);
        }
        if (source.AppStatus != null) {
            this.AppStatus = new Boolean(source.AppStatus);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "LastModifiedDate", this.LastModifiedDate);
        this.setParamSimple(map, prefix + "ClientId", this.ClientId);
        this.setParamSimple(map, prefix + "ApplicationType", this.ApplicationType);
        this.setParamSimple(map, prefix + "CreatedDate", this.CreatedDate);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "TokenExpired", this.TokenExpired);
        this.setParamSimple(map, prefix + "ClientSecret", this.ClientSecret);
        this.setParamSimple(map, prefix + "PublicKey", this.PublicKey);
        this.setParamSimple(map, prefix + "AuthorizeUrl", this.AuthorizeUrl);
        this.setParamSimple(map, prefix + "IconUrl", this.IconUrl);
        this.setParamSimple(map, prefix + "SecureLevel", this.SecureLevel);
        this.setParamSimple(map, prefix + "AppStatus", this.AppStatus);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApiIdStatus extends AbstractModel {

    /**
    * Unique service ID.
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * Unique API ID.
    */
    @SerializedName("ApiId")
    @Expose
    private String ApiId;

    /**
    * API description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApiDesc")
    @Expose
    private String ApiDesc;

    /**
    * API path.
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * API method.
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * Service creation time.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Service modification time.
    */
    @SerializedName("ModifiedTime")
    @Expose
    private String ModifiedTime;

    /**
    * API name.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApiName")
    @Expose
    private String ApiName;

    /**
    * Unique VPC ID.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * API type.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApiType")
    @Expose
    private String ApiType;

    /**
    * API protocol.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Whether to enable debugging after purchase.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsDebugAfterCharge")
    @Expose
    private Boolean IsDebugAfterCharge;

    /**
    * Authorization type.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AuthType")
    @Expose
    private String AuthType;

    /**
    * API business type.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApiBusinessType")
    @Expose
    private String ApiBusinessType;

    /**
    * Unique ID of associated authorization API.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AuthRelationApiId")
    @Expose
    private String AuthRelationApiId;

    /**
    * List of business APIs associated with authorization API.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RelationBuniessApiIds")
    @Expose
    private String [] RelationBuniessApiIds;

    /**
    * OAuth configuration information.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OauthConfig")
    @Expose
    private OauthConfig OauthConfig;

    /**
    * Token storage position, which is an OAuth 2.0 API request.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TokenLocation")
    @Expose
    private String TokenLocation;

    /**
     * Get Unique service ID. 
     * @return ServiceId Unique service ID.
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set Unique service ID.
     * @param ServiceId Unique service ID.
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get Unique API ID. 
     * @return ApiId Unique API ID.
     */
    public String getApiId() {
        return this.ApiId;
    }

    /**
     * Set Unique API ID.
     * @param ApiId Unique API ID.
     */
    public void setApiId(String ApiId) {
        this.ApiId = ApiId;
    }

    /**
     * Get API description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApiDesc API description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getApiDesc() {
        return this.ApiDesc;
    }

    /**
     * Set API description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApiDesc API description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApiDesc(String ApiDesc) {
        this.ApiDesc = ApiDesc;
    }

    /**
     * Get API path. 
     * @return Path API path.
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set API path.
     * @param Path API path.
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get API method. 
     * @return Method API method.
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set API method.
     * @param Method API method.
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get Service creation time. 
     * @return CreatedTime Service creation time.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Service creation time.
     * @param CreatedTime Service creation time.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Service modification time. 
     * @return ModifiedTime Service modification time.
     */
    public String getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set Service modification time.
     * @param ModifiedTime Service modification time.
     */
    public void setModifiedTime(String ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    /**
     * Get API name.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ApiName API name.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getApiName() {
        return this.ApiName;
    }

    /**
     * Set API name.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ApiName API name.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setApiName(String ApiName) {
        this.ApiName = ApiName;
    }

    /**
     * Get Unique VPC ID.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return UniqVpcId Unique VPC ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set Unique VPC ID.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param UniqVpcId Unique VPC ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get API type.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ApiType API type.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getApiType() {
        return this.ApiType;
    }

    /**
     * Set API type.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ApiType API type.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setApiType(String ApiType) {
        this.ApiType = ApiType;
    }

    /**
     * Get API protocol.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Protocol API protocol.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set API protocol.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Protocol API protocol.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Whether to enable debugging after purchase.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IsDebugAfterCharge Whether to enable debugging after purchase.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsDebugAfterCharge() {
        return this.IsDebugAfterCharge;
    }

    /**
     * Set Whether to enable debugging after purchase.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IsDebugAfterCharge Whether to enable debugging after purchase.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIsDebugAfterCharge(Boolean IsDebugAfterCharge) {
        this.IsDebugAfterCharge = IsDebugAfterCharge;
    }

    /**
     * Get Authorization type.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AuthType Authorization type.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getAuthType() {
        return this.AuthType;
    }

    /**
     * Set Authorization type.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AuthType Authorization type.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAuthType(String AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get API business type.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ApiBusinessType API business type.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getApiBusinessType() {
        return this.ApiBusinessType;
    }

    /**
     * Set API business type.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ApiBusinessType API business type.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setApiBusinessType(String ApiBusinessType) {
        this.ApiBusinessType = ApiBusinessType;
    }

    /**
     * Get Unique ID of associated authorization API.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AuthRelationApiId Unique ID of associated authorization API.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getAuthRelationApiId() {
        return this.AuthRelationApiId;
    }

    /**
     * Set Unique ID of associated authorization API.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AuthRelationApiId Unique ID of associated authorization API.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAuthRelationApiId(String AuthRelationApiId) {
        this.AuthRelationApiId = AuthRelationApiId;
    }

    /**
     * Get List of business APIs associated with authorization API.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RelationBuniessApiIds List of business APIs associated with authorization API.
Note: this field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public String [] getRelationBuniessApiIds() {
        return this.RelationBuniessApiIds;
    }

    /**
     * Set List of business APIs associated with authorization API.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RelationBuniessApiIds List of business APIs associated with authorization API.
Note: this field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setRelationBuniessApiIds(String [] RelationBuniessApiIds) {
        this.RelationBuniessApiIds = RelationBuniessApiIds;
    }

    /**
     * Get OAuth configuration information.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return OauthConfig OAuth configuration information.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public OauthConfig getOauthConfig() {
        return this.OauthConfig;
    }

    /**
     * Set OAuth configuration information.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param OauthConfig OAuth configuration information.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOauthConfig(OauthConfig OauthConfig) {
        this.OauthConfig = OauthConfig;
    }

    /**
     * Get Token storage position, which is an OAuth 2.0 API request.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TokenLocation Token storage position, which is an OAuth 2.0 API request.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getTokenLocation() {
        return this.TokenLocation;
    }

    /**
     * Set Token storage position, which is an OAuth 2.0 API request.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TokenLocation Token storage position, which is an OAuth 2.0 API request.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTokenLocation(String TokenLocation) {
        this.TokenLocation = TokenLocation;
    }

    public ApiIdStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiIdStatus(ApiIdStatus source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.ApiId != null) {
            this.ApiId = new String(source.ApiId);
        }
        if (source.ApiDesc != null) {
            this.ApiDesc = new String(source.ApiDesc);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new String(source.ModifiedTime);
        }
        if (source.ApiName != null) {
            this.ApiName = new String(source.ApiName);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.ApiType != null) {
            this.ApiType = new String(source.ApiType);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.IsDebugAfterCharge != null) {
            this.IsDebugAfterCharge = new Boolean(source.IsDebugAfterCharge);
        }
        if (source.AuthType != null) {
            this.AuthType = new String(source.AuthType);
        }
        if (source.ApiBusinessType != null) {
            this.ApiBusinessType = new String(source.ApiBusinessType);
        }
        if (source.AuthRelationApiId != null) {
            this.AuthRelationApiId = new String(source.AuthRelationApiId);
        }
        if (source.RelationBuniessApiIds != null) {
            this.RelationBuniessApiIds = new String[source.RelationBuniessApiIds.length];
            for (int i = 0; i < source.RelationBuniessApiIds.length; i++) {
                this.RelationBuniessApiIds[i] = new String(source.RelationBuniessApiIds[i]);
            }
        }
        if (source.OauthConfig != null) {
            this.OauthConfig = new OauthConfig(source.OauthConfig);
        }
        if (source.TokenLocation != null) {
            this.TokenLocation = new String(source.TokenLocation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "ApiId", this.ApiId);
        this.setParamSimple(map, prefix + "ApiDesc", this.ApiDesc);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);
        this.setParamSimple(map, prefix + "ApiName", this.ApiName);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "ApiType", this.ApiType);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "IsDebugAfterCharge", this.IsDebugAfterCharge);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamSimple(map, prefix + "ApiBusinessType", this.ApiBusinessType);
        this.setParamSimple(map, prefix + "AuthRelationApiId", this.AuthRelationApiId);
        this.setParamArraySimple(map, prefix + "RelationBuniessApiIds.", this.RelationBuniessApiIds);
        this.setParamObj(map, prefix + "OauthConfig.", this.OauthConfig);
        this.setParamSimple(map, prefix + "TokenLocation", this.TokenLocation);

    }
}


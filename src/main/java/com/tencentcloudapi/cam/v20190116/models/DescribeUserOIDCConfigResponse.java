/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUserOIDCConfigResponse extends AbstractModel{

    /**
    * IdP type. 12: user OIDC IdP
    */
    @SerializedName("ProviderType")
    @Expose
    private Long ProviderType;

    /**
    * IdP URL
    */
    @SerializedName("IdentityUrl")
    @Expose
    private String IdentityUrl;

    /**
    * Signature public key
    */
    @SerializedName("IdentityKey")
    @Expose
    private String IdentityKey;

    /**
    * Client ID
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * Status. 0: not set; 2: disabled; 11: enabled.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Authorization endpoint
    */
    @SerializedName("AuthorizationEndpoint")
    @Expose
    private String AuthorizationEndpoint;

    /**
    * Authorization scope
    */
    @SerializedName("Scope")
    @Expose
    private String [] Scope;

    /**
    * Authorization response type
    */
    @SerializedName("ResponseType")
    @Expose
    private String ResponseType;

    /**
    * Authorization response mode
    */
    @SerializedName("ResponseMode")
    @Expose
    private String ResponseMode;

    /**
    * Mapping field name
    */
    @SerializedName("MappingFiled")
    @Expose
    private String MappingFiled;

    /**
    * Description
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
     * Get IdP type. 12: user OIDC IdP 
     * @return ProviderType IdP type. 12: user OIDC IdP
     */
    public Long getProviderType() {
        return this.ProviderType;
    }

    /**
     * Set IdP type. 12: user OIDC IdP
     * @param ProviderType IdP type. 12: user OIDC IdP
     */
    public void setProviderType(Long ProviderType) {
        this.ProviderType = ProviderType;
    }

    /**
     * Get IdP URL 
     * @return IdentityUrl IdP URL
     */
    public String getIdentityUrl() {
        return this.IdentityUrl;
    }

    /**
     * Set IdP URL
     * @param IdentityUrl IdP URL
     */
    public void setIdentityUrl(String IdentityUrl) {
        this.IdentityUrl = IdentityUrl;
    }

    /**
     * Get Signature public key 
     * @return IdentityKey Signature public key
     */
    public String getIdentityKey() {
        return this.IdentityKey;
    }

    /**
     * Set Signature public key
     * @param IdentityKey Signature public key
     */
    public void setIdentityKey(String IdentityKey) {
        this.IdentityKey = IdentityKey;
    }

    /**
     * Get Client ID 
     * @return ClientId Client ID
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set Client ID
     * @param ClientId Client ID
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get Status. 0: not set; 2: disabled; 11: enabled. 
     * @return Status Status. 0: not set; 2: disabled; 11: enabled.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status. 0: not set; 2: disabled; 11: enabled.
     * @param Status Status. 0: not set; 2: disabled; 11: enabled.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Authorization endpoint 
     * @return AuthorizationEndpoint Authorization endpoint
     */
    public String getAuthorizationEndpoint() {
        return this.AuthorizationEndpoint;
    }

    /**
     * Set Authorization endpoint
     * @param AuthorizationEndpoint Authorization endpoint
     */
    public void setAuthorizationEndpoint(String AuthorizationEndpoint) {
        this.AuthorizationEndpoint = AuthorizationEndpoint;
    }

    /**
     * Get Authorization scope 
     * @return Scope Authorization scope
     */
    public String [] getScope() {
        return this.Scope;
    }

    /**
     * Set Authorization scope
     * @param Scope Authorization scope
     */
    public void setScope(String [] Scope) {
        this.Scope = Scope;
    }

    /**
     * Get Authorization response type 
     * @return ResponseType Authorization response type
     */
    public String getResponseType() {
        return this.ResponseType;
    }

    /**
     * Set Authorization response type
     * @param ResponseType Authorization response type
     */
    public void setResponseType(String ResponseType) {
        this.ResponseType = ResponseType;
    }

    /**
     * Get Authorization response mode 
     * @return ResponseMode Authorization response mode
     */
    public String getResponseMode() {
        return this.ResponseMode;
    }

    /**
     * Set Authorization response mode
     * @param ResponseMode Authorization response mode
     */
    public void setResponseMode(String ResponseMode) {
        this.ResponseMode = ResponseMode;
    }

    /**
     * Get Mapping field name 
     * @return MappingFiled Mapping field name
     */
    public String getMappingFiled() {
        return this.MappingFiled;
    }

    /**
     * Set Mapping field name
     * @param MappingFiled Mapping field name
     */
    public void setMappingFiled(String MappingFiled) {
        this.MappingFiled = MappingFiled;
    }

    /**
     * Get Description 
     * @return Description Description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description
     * @param Description Description
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

    public DescribeUserOIDCConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserOIDCConfigResponse(DescribeUserOIDCConfigResponse source) {
        if (source.ProviderType != null) {
            this.ProviderType = new Long(source.ProviderType);
        }
        if (source.IdentityUrl != null) {
            this.IdentityUrl = new String(source.IdentityUrl);
        }
        if (source.IdentityKey != null) {
            this.IdentityKey = new String(source.IdentityKey);
        }
        if (source.ClientId != null) {
            this.ClientId = new String(source.ClientId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.AuthorizationEndpoint != null) {
            this.AuthorizationEndpoint = new String(source.AuthorizationEndpoint);
        }
        if (source.Scope != null) {
            this.Scope = new String[source.Scope.length];
            for (int i = 0; i < source.Scope.length; i++) {
                this.Scope[i] = new String(source.Scope[i]);
            }
        }
        if (source.ResponseType != null) {
            this.ResponseType = new String(source.ResponseType);
        }
        if (source.ResponseMode != null) {
            this.ResponseMode = new String(source.ResponseMode);
        }
        if (source.MappingFiled != null) {
            this.MappingFiled = new String(source.MappingFiled);
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
        this.setParamSimple(map, prefix + "ProviderType", this.ProviderType);
        this.setParamSimple(map, prefix + "IdentityUrl", this.IdentityUrl);
        this.setParamSimple(map, prefix + "IdentityKey", this.IdentityKey);
        this.setParamSimple(map, prefix + "ClientId", this.ClientId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AuthorizationEndpoint", this.AuthorizationEndpoint);
        this.setParamArraySimple(map, prefix + "Scope.", this.Scope);
        this.setParamSimple(map, prefix + "ResponseType", this.ResponseType);
        this.setParamSimple(map, prefix + "ResponseMode", this.ResponseMode);
        this.setParamSimple(map, prefix + "MappingFiled", this.MappingFiled);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


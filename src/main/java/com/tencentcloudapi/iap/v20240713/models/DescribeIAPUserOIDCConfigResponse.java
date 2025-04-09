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
package com.tencentcloudapi.iap.v20240713.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIAPUserOIDCConfigResponse extends AbstractModel {

    /**
    * IdP type. 13: IAP user OIDC IdP.
    */
    @SerializedName("ProviderType")
    @Expose
    private Long ProviderType;

    /**
    * IdP URL.
    */
    @SerializedName("IdentityUrl")
    @Expose
    private String IdentityUrl;

    /**
    * Public key for signature.
    */
    @SerializedName("IdentityKey")
    @Expose
    private String IdentityKey;

    /**
    * Client ID.
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * Status. 0: Not set; 2: Disabled; 11: Enabled.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * The verification fingerprint of the HTTPS CA certificate. English letters and digits are allowed, and each fingerprint is 40 characters long, with a maximum of 5 fingerprints.
    */
    @SerializedName("Fingerprints")
    @Expose
    private String [] Fingerprints;

    /**
    * Whether to enable the automatic use of the OIDC signature public key. 1: Yes, 2: No (default).
    */
    @SerializedName("EnableAutoPublicKey")
    @Expose
    private Long EnableAutoPublicKey;

    /**
    * Authorization endpoint.
    */
    @SerializedName("AuthorizationEndpoint")
    @Expose
    private String AuthorizationEndpoint;

    /**
    * Authorization scope.
    */
    @SerializedName("Scope")
    @Expose
    private String [] Scope;

    /**
    * Authorization response type.
    */
    @SerializedName("ResponseType")
    @Expose
    private String ResponseType;

    /**
    * Authorization response mode.
    */
    @SerializedName("ResponseMode")
    @Expose
    private String ResponseMode;

    /**
    * Mapping field name.
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
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get IdP type. 13: IAP user OIDC IdP. 
     * @return ProviderType IdP type. 13: IAP user OIDC IdP.
     */
    public Long getProviderType() {
        return this.ProviderType;
    }

    /**
     * Set IdP type. 13: IAP user OIDC IdP.
     * @param ProviderType IdP type. 13: IAP user OIDC IdP.
     */
    public void setProviderType(Long ProviderType) {
        this.ProviderType = ProviderType;
    }

    /**
     * Get IdP URL. 
     * @return IdentityUrl IdP URL.
     */
    public String getIdentityUrl() {
        return this.IdentityUrl;
    }

    /**
     * Set IdP URL.
     * @param IdentityUrl IdP URL.
     */
    public void setIdentityUrl(String IdentityUrl) {
        this.IdentityUrl = IdentityUrl;
    }

    /**
     * Get Public key for signature. 
     * @return IdentityKey Public key for signature.
     */
    public String getIdentityKey() {
        return this.IdentityKey;
    }

    /**
     * Set Public key for signature.
     * @param IdentityKey Public key for signature.
     */
    public void setIdentityKey(String IdentityKey) {
        this.IdentityKey = IdentityKey;
    }

    /**
     * Get Client ID. 
     * @return ClientId Client ID.
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set Client ID.
     * @param ClientId Client ID.
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get Status. 0: Not set; 2: Disabled; 11: Enabled. 
     * @return Status Status. 0: Not set; 2: Disabled; 11: Enabled.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status. 0: Not set; 2: Disabled; 11: Enabled.
     * @param Status Status. 0: Not set; 2: Disabled; 11: Enabled.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get The verification fingerprint of the HTTPS CA certificate. English letters and digits are allowed, and each fingerprint is 40 characters long, with a maximum of 5 fingerprints. 
     * @return Fingerprints The verification fingerprint of the HTTPS CA certificate. English letters and digits are allowed, and each fingerprint is 40 characters long, with a maximum of 5 fingerprints.
     */
    public String [] getFingerprints() {
        return this.Fingerprints;
    }

    /**
     * Set The verification fingerprint of the HTTPS CA certificate. English letters and digits are allowed, and each fingerprint is 40 characters long, with a maximum of 5 fingerprints.
     * @param Fingerprints The verification fingerprint of the HTTPS CA certificate. English letters and digits are allowed, and each fingerprint is 40 characters long, with a maximum of 5 fingerprints.
     */
    public void setFingerprints(String [] Fingerprints) {
        this.Fingerprints = Fingerprints;
    }

    /**
     * Get Whether to enable the automatic use of the OIDC signature public key. 1: Yes, 2: No (default). 
     * @return EnableAutoPublicKey Whether to enable the automatic use of the OIDC signature public key. 1: Yes, 2: No (default).
     */
    public Long getEnableAutoPublicKey() {
        return this.EnableAutoPublicKey;
    }

    /**
     * Set Whether to enable the automatic use of the OIDC signature public key. 1: Yes, 2: No (default).
     * @param EnableAutoPublicKey Whether to enable the automatic use of the OIDC signature public key. 1: Yes, 2: No (default).
     */
    public void setEnableAutoPublicKey(Long EnableAutoPublicKey) {
        this.EnableAutoPublicKey = EnableAutoPublicKey;
    }

    /**
     * Get Authorization endpoint. 
     * @return AuthorizationEndpoint Authorization endpoint.
     */
    public String getAuthorizationEndpoint() {
        return this.AuthorizationEndpoint;
    }

    /**
     * Set Authorization endpoint.
     * @param AuthorizationEndpoint Authorization endpoint.
     */
    public void setAuthorizationEndpoint(String AuthorizationEndpoint) {
        this.AuthorizationEndpoint = AuthorizationEndpoint;
    }

    /**
     * Get Authorization scope. 
     * @return Scope Authorization scope.
     */
    public String [] getScope() {
        return this.Scope;
    }

    /**
     * Set Authorization scope.
     * @param Scope Authorization scope.
     */
    public void setScope(String [] Scope) {
        this.Scope = Scope;
    }

    /**
     * Get Authorization response type. 
     * @return ResponseType Authorization response type.
     */
    public String getResponseType() {
        return this.ResponseType;
    }

    /**
     * Set Authorization response type.
     * @param ResponseType Authorization response type.
     */
    public void setResponseType(String ResponseType) {
        this.ResponseType = ResponseType;
    }

    /**
     * Get Authorization response mode. 
     * @return ResponseMode Authorization response mode.
     */
    public String getResponseMode() {
        return this.ResponseMode;
    }

    /**
     * Set Authorization response mode.
     * @param ResponseMode Authorization response mode.
     */
    public void setResponseMode(String ResponseMode) {
        this.ResponseMode = ResponseMode;
    }

    /**
     * Get Mapping field name. 
     * @return MappingFiled Mapping field name.
     */
    public String getMappingFiled() {
        return this.MappingFiled;
    }

    /**
     * Set Mapping field name.
     * @param MappingFiled Mapping field name.
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
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeIAPUserOIDCConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIAPUserOIDCConfigResponse(DescribeIAPUserOIDCConfigResponse source) {
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
        if (source.Fingerprints != null) {
            this.Fingerprints = new String[source.Fingerprints.length];
            for (int i = 0; i < source.Fingerprints.length; i++) {
                this.Fingerprints[i] = new String(source.Fingerprints[i]);
            }
        }
        if (source.EnableAutoPublicKey != null) {
            this.EnableAutoPublicKey = new Long(source.EnableAutoPublicKey);
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
        this.setParamArraySimple(map, prefix + "Fingerprints.", this.Fingerprints);
        this.setParamSimple(map, prefix + "EnableAutoPublicKey", this.EnableAutoPublicKey);
        this.setParamSimple(map, prefix + "AuthorizationEndpoint", this.AuthorizationEndpoint);
        this.setParamArraySimple(map, prefix + "Scope.", this.Scope);
        this.setParamSimple(map, prefix + "ResponseType", this.ResponseType);
        this.setParamSimple(map, prefix + "ResponseMode", this.ResponseMode);
        this.setParamSimple(map, prefix + "MappingFiled", this.MappingFiled);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


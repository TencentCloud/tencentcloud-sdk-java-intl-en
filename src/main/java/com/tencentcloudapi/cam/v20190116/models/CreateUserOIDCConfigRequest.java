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

public class CreateUserOIDCConfigRequest extends AbstractModel{

    /**
    * OpenID Connect IdP URL.
It corresponds to the value of the `issuer` field in the `Openid-configuration` provided by the enterprise IdP.
    */
    @SerializedName("IdentityUrl")
    @Expose
    private String IdentityUrl;

    /**
    * Signature public key, which is used to verify the OpenID Connect IdP's ID token and must be Base64-encoded. For the security of your account, we recommend you rotate it regularly.
    */
    @SerializedName("IdentityKey")
    @Expose
    private String IdentityKey;

    /**
    * Client ID registered with the OpenID Connect IdP.
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * OpenID Connect IdP authorization endpoint. It corresponds to the value of the `authorization_endpoint` field in the `Openid-configuration` provided by the enterprise IdP.
    */
    @SerializedName("AuthorizationEndpoint")
    @Expose
    private String AuthorizationEndpoint;

    /**
    * Authorization response type, which is always `id_token`.
    */
    @SerializedName("ResponseType")
    @Expose
    private String ResponseType;

    /**
    * Authorization response mode. Valid values: form_post (recommended); fragment.
    */
    @SerializedName("ResponseMode")
    @Expose
    private String ResponseMode;

    /**
    * Mapping field name. It indicates which field in the `id_token` of the IdP is mapped to the username of a sub-user. It is usually the `sub` or `name` field
    */
    @SerializedName("MappingFiled")
    @Expose
    private String MappingFiled;

    /**
    * Authorization information scope. Valid values: openid (default); email; profile.
    */
    @SerializedName("Scope")
    @Expose
    private String [] Scope;

    /**
    * Description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get OpenID Connect IdP URL.
It corresponds to the value of the `issuer` field in the `Openid-configuration` provided by the enterprise IdP. 
     * @return IdentityUrl OpenID Connect IdP URL.
It corresponds to the value of the `issuer` field in the `Openid-configuration` provided by the enterprise IdP.
     */
    public String getIdentityUrl() {
        return this.IdentityUrl;
    }

    /**
     * Set OpenID Connect IdP URL.
It corresponds to the value of the `issuer` field in the `Openid-configuration` provided by the enterprise IdP.
     * @param IdentityUrl OpenID Connect IdP URL.
It corresponds to the value of the `issuer` field in the `Openid-configuration` provided by the enterprise IdP.
     */
    public void setIdentityUrl(String IdentityUrl) {
        this.IdentityUrl = IdentityUrl;
    }

    /**
     * Get Signature public key, which is used to verify the OpenID Connect IdP's ID token and must be Base64-encoded. For the security of your account, we recommend you rotate it regularly. 
     * @return IdentityKey Signature public key, which is used to verify the OpenID Connect IdP's ID token and must be Base64-encoded. For the security of your account, we recommend you rotate it regularly.
     */
    public String getIdentityKey() {
        return this.IdentityKey;
    }

    /**
     * Set Signature public key, which is used to verify the OpenID Connect IdP's ID token and must be Base64-encoded. For the security of your account, we recommend you rotate it regularly.
     * @param IdentityKey Signature public key, which is used to verify the OpenID Connect IdP's ID token and must be Base64-encoded. For the security of your account, we recommend you rotate it regularly.
     */
    public void setIdentityKey(String IdentityKey) {
        this.IdentityKey = IdentityKey;
    }

    /**
     * Get Client ID registered with the OpenID Connect IdP. 
     * @return ClientId Client ID registered with the OpenID Connect IdP.
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set Client ID registered with the OpenID Connect IdP.
     * @param ClientId Client ID registered with the OpenID Connect IdP.
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get OpenID Connect IdP authorization endpoint. It corresponds to the value of the `authorization_endpoint` field in the `Openid-configuration` provided by the enterprise IdP. 
     * @return AuthorizationEndpoint OpenID Connect IdP authorization endpoint. It corresponds to the value of the `authorization_endpoint` field in the `Openid-configuration` provided by the enterprise IdP.
     */
    public String getAuthorizationEndpoint() {
        return this.AuthorizationEndpoint;
    }

    /**
     * Set OpenID Connect IdP authorization endpoint. It corresponds to the value of the `authorization_endpoint` field in the `Openid-configuration` provided by the enterprise IdP.
     * @param AuthorizationEndpoint OpenID Connect IdP authorization endpoint. It corresponds to the value of the `authorization_endpoint` field in the `Openid-configuration` provided by the enterprise IdP.
     */
    public void setAuthorizationEndpoint(String AuthorizationEndpoint) {
        this.AuthorizationEndpoint = AuthorizationEndpoint;
    }

    /**
     * Get Authorization response type, which is always `id_token`. 
     * @return ResponseType Authorization response type, which is always `id_token`.
     */
    public String getResponseType() {
        return this.ResponseType;
    }

    /**
     * Set Authorization response type, which is always `id_token`.
     * @param ResponseType Authorization response type, which is always `id_token`.
     */
    public void setResponseType(String ResponseType) {
        this.ResponseType = ResponseType;
    }

    /**
     * Get Authorization response mode. Valid values: form_post (recommended); fragment. 
     * @return ResponseMode Authorization response mode. Valid values: form_post (recommended); fragment.
     */
    public String getResponseMode() {
        return this.ResponseMode;
    }

    /**
     * Set Authorization response mode. Valid values: form_post (recommended); fragment.
     * @param ResponseMode Authorization response mode. Valid values: form_post (recommended); fragment.
     */
    public void setResponseMode(String ResponseMode) {
        this.ResponseMode = ResponseMode;
    }

    /**
     * Get Mapping field name. It indicates which field in the `id_token` of the IdP is mapped to the username of a sub-user. It is usually the `sub` or `name` field 
     * @return MappingFiled Mapping field name. It indicates which field in the `id_token` of the IdP is mapped to the username of a sub-user. It is usually the `sub` or `name` field
     */
    public String getMappingFiled() {
        return this.MappingFiled;
    }

    /**
     * Set Mapping field name. It indicates which field in the `id_token` of the IdP is mapped to the username of a sub-user. It is usually the `sub` or `name` field
     * @param MappingFiled Mapping field name. It indicates which field in the `id_token` of the IdP is mapped to the username of a sub-user. It is usually the `sub` or `name` field
     */
    public void setMappingFiled(String MappingFiled) {
        this.MappingFiled = MappingFiled;
    }

    /**
     * Get Authorization information scope. Valid values: openid (default); email; profile. 
     * @return Scope Authorization information scope. Valid values: openid (default); email; profile.
     */
    public String [] getScope() {
        return this.Scope;
    }

    /**
     * Set Authorization information scope. Valid values: openid (default); email; profile.
     * @param Scope Authorization information scope. Valid values: openid (default); email; profile.
     */
    public void setScope(String [] Scope) {
        this.Scope = Scope;
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

    public CreateUserOIDCConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateUserOIDCConfigRequest(CreateUserOIDCConfigRequest source) {
        if (source.IdentityUrl != null) {
            this.IdentityUrl = new String(source.IdentityUrl);
        }
        if (source.IdentityKey != null) {
            this.IdentityKey = new String(source.IdentityKey);
        }
        if (source.ClientId != null) {
            this.ClientId = new String(source.ClientId);
        }
        if (source.AuthorizationEndpoint != null) {
            this.AuthorizationEndpoint = new String(source.AuthorizationEndpoint);
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
        if (source.Scope != null) {
            this.Scope = new String[source.Scope.length];
            for (int i = 0; i < source.Scope.length; i++) {
                this.Scope[i] = new String(source.Scope[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdentityUrl", this.IdentityUrl);
        this.setParamSimple(map, prefix + "IdentityKey", this.IdentityKey);
        this.setParamSimple(map, prefix + "ClientId", this.ClientId);
        this.setParamSimple(map, prefix + "AuthorizationEndpoint", this.AuthorizationEndpoint);
        this.setParamSimple(map, prefix + "ResponseType", this.ResponseType);
        this.setParamSimple(map, prefix + "ResponseMode", this.ResponseMode);
        this.setParamSimple(map, prefix + "MappingFiled", this.MappingFiled);
        this.setParamArraySimple(map, prefix + "Scope.", this.Scope);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}


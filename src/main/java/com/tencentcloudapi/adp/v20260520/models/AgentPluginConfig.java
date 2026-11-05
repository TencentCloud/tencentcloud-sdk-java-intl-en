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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgentPluginConfig extends AbstractModel {

    /**
    * <p>plugin_id</p>
    */
    @SerializedName("PluginId")
    @Expose
    private String PluginId;

    /**
    * <p>Plug-in Header parameter</p>
    */
    @SerializedName("HeaderParameterList")
    @Expose
    private AgentPluginParameter [] HeaderParameterList;

    /**
    * <p>Plug-in Query parameter</p>
    */
    @SerializedName("QueryParameterList")
    @Expose
    private AgentPluginParameter [] QueryParameterList;

    /**
    * <p>Whether to use CAM one-click authorization. This parameter is valid only when auth_type=2</p>
    */
    @SerializedName("EnableCamRoleAuth")
    @Expose
    private Boolean EnableCamRoleAuth;

    /**
    * <p>Authorization type</p><p>Enumeration values:</p><ul><li>0: No authentication</li><li>1: API Key</li><li>2: CAM authorization</li><li>3: OAuth2.0 authorization</li></ul>
    */
    @SerializedName("AuthType")
    @Expose
    private Long AuthType;

    /**
    * <p>OAuth authorization and consent mode; 0 - developer authorization; 1 - user authorization (valid only when auth_type=3)</p>
    */
    @SerializedName("OAuthConsent")
    @Expose
    private Long OAuthConsent;

    /**
    * <p>Credential configuration</p>
    */
    @SerializedName("CredentialConfig")
    @Expose
    private AgentPluginCredentialConfig CredentialConfig;

    /**
     * Get <p>plugin_id</p> 
     * @return PluginId <p>plugin_id</p>
     */
    public String getPluginId() {
        return this.PluginId;
    }

    /**
     * Set <p>plugin_id</p>
     * @param PluginId <p>plugin_id</p>
     */
    public void setPluginId(String PluginId) {
        this.PluginId = PluginId;
    }

    /**
     * Get <p>Plug-in Header parameter</p> 
     * @return HeaderParameterList <p>Plug-in Header parameter</p>
     */
    public AgentPluginParameter [] getHeaderParameterList() {
        return this.HeaderParameterList;
    }

    /**
     * Set <p>Plug-in Header parameter</p>
     * @param HeaderParameterList <p>Plug-in Header parameter</p>
     */
    public void setHeaderParameterList(AgentPluginParameter [] HeaderParameterList) {
        this.HeaderParameterList = HeaderParameterList;
    }

    /**
     * Get <p>Plug-in Query parameter</p> 
     * @return QueryParameterList <p>Plug-in Query parameter</p>
     */
    public AgentPluginParameter [] getQueryParameterList() {
        return this.QueryParameterList;
    }

    /**
     * Set <p>Plug-in Query parameter</p>
     * @param QueryParameterList <p>Plug-in Query parameter</p>
     */
    public void setQueryParameterList(AgentPluginParameter [] QueryParameterList) {
        this.QueryParameterList = QueryParameterList;
    }

    /**
     * Get <p>Whether to use CAM one-click authorization. This parameter is valid only when auth_type=2</p> 
     * @return EnableCamRoleAuth <p>Whether to use CAM one-click authorization. This parameter is valid only when auth_type=2</p>
     */
    public Boolean getEnableCamRoleAuth() {
        return this.EnableCamRoleAuth;
    }

    /**
     * Set <p>Whether to use CAM one-click authorization. This parameter is valid only when auth_type=2</p>
     * @param EnableCamRoleAuth <p>Whether to use CAM one-click authorization. This parameter is valid only when auth_type=2</p>
     */
    public void setEnableCamRoleAuth(Boolean EnableCamRoleAuth) {
        this.EnableCamRoleAuth = EnableCamRoleAuth;
    }

    /**
     * Get <p>Authorization type</p><p>Enumeration values:</p><ul><li>0: No authentication</li><li>1: API Key</li><li>2: CAM authorization</li><li>3: OAuth2.0 authorization</li></ul> 
     * @return AuthType <p>Authorization type</p><p>Enumeration values:</p><ul><li>0: No authentication</li><li>1: API Key</li><li>2: CAM authorization</li><li>3: OAuth2.0 authorization</li></ul>
     */
    public Long getAuthType() {
        return this.AuthType;
    }

    /**
     * Set <p>Authorization type</p><p>Enumeration values:</p><ul><li>0: No authentication</li><li>1: API Key</li><li>2: CAM authorization</li><li>3: OAuth2.0 authorization</li></ul>
     * @param AuthType <p>Authorization type</p><p>Enumeration values:</p><ul><li>0: No authentication</li><li>1: API Key</li><li>2: CAM authorization</li><li>3: OAuth2.0 authorization</li></ul>
     */
    public void setAuthType(Long AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get <p>OAuth authorization and consent mode; 0 - developer authorization; 1 - user authorization (valid only when auth_type=3)</p> 
     * @return OAuthConsent <p>OAuth authorization and consent mode; 0 - developer authorization; 1 - user authorization (valid only when auth_type=3)</p>
     */
    public Long getOAuthConsent() {
        return this.OAuthConsent;
    }

    /**
     * Set <p>OAuth authorization and consent mode; 0 - developer authorization; 1 - user authorization (valid only when auth_type=3)</p>
     * @param OAuthConsent <p>OAuth authorization and consent mode; 0 - developer authorization; 1 - user authorization (valid only when auth_type=3)</p>
     */
    public void setOAuthConsent(Long OAuthConsent) {
        this.OAuthConsent = OAuthConsent;
    }

    /**
     * Get <p>Credential configuration</p> 
     * @return CredentialConfig <p>Credential configuration</p>
     */
    public AgentPluginCredentialConfig getCredentialConfig() {
        return this.CredentialConfig;
    }

    /**
     * Set <p>Credential configuration</p>
     * @param CredentialConfig <p>Credential configuration</p>
     */
    public void setCredentialConfig(AgentPluginCredentialConfig CredentialConfig) {
        this.CredentialConfig = CredentialConfig;
    }

    public AgentPluginConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentPluginConfig(AgentPluginConfig source) {
        if (source.PluginId != null) {
            this.PluginId = new String(source.PluginId);
        }
        if (source.HeaderParameterList != null) {
            this.HeaderParameterList = new AgentPluginParameter[source.HeaderParameterList.length];
            for (int i = 0; i < source.HeaderParameterList.length; i++) {
                this.HeaderParameterList[i] = new AgentPluginParameter(source.HeaderParameterList[i]);
            }
        }
        if (source.QueryParameterList != null) {
            this.QueryParameterList = new AgentPluginParameter[source.QueryParameterList.length];
            for (int i = 0; i < source.QueryParameterList.length; i++) {
                this.QueryParameterList[i] = new AgentPluginParameter(source.QueryParameterList[i]);
            }
        }
        if (source.EnableCamRoleAuth != null) {
            this.EnableCamRoleAuth = new Boolean(source.EnableCamRoleAuth);
        }
        if (source.AuthType != null) {
            this.AuthType = new Long(source.AuthType);
        }
        if (source.OAuthConsent != null) {
            this.OAuthConsent = new Long(source.OAuthConsent);
        }
        if (source.CredentialConfig != null) {
            this.CredentialConfig = new AgentPluginCredentialConfig(source.CredentialConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PluginId", this.PluginId);
        this.setParamArrayObj(map, prefix + "HeaderParameterList.", this.HeaderParameterList);
        this.setParamArrayObj(map, prefix + "QueryParameterList.", this.QueryParameterList);
        this.setParamSimple(map, prefix + "EnableCamRoleAuth", this.EnableCamRoleAuth);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamSimple(map, prefix + "OAuthConsent", this.OAuthConsent);
        this.setParamObj(map, prefix + "CredentialConfig.", this.CredentialConfig);

    }
}


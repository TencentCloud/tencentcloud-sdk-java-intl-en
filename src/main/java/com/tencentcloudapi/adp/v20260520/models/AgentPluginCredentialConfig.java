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

public class AgentPluginCredentialConfig extends AbstractModel {

    /**
    * <p>Plugin authentication value source</p><p>Enumeration values:</p><ul><li>0: Unspecified</li><li>1: Use the default authentication value of the plug-in. Only APIKey/AccessKey is supported.</li><li>2: Refer to a credential</li><li>3: Refer to a variable</li></ul>
    */
    @SerializedName("AuthValueSource")
    @Expose
    private Long AuthValueSource;

    /**
    * <p>Credential ID</p><p>Input parameter limit: required when AuthValueSource=2</p>
    */
    @SerializedName("CredentialId")
    @Expose
    private String CredentialId;

    /**
    * <p>Parameter configuration</p>
    */
    @SerializedName("ParamList")
    @Expose
    private AgentPluginCredentialParam [] ParamList;

    /**
     * Get <p>Plugin authentication value source</p><p>Enumeration values:</p><ul><li>0: Unspecified</li><li>1: Use the default authentication value of the plug-in. Only APIKey/AccessKey is supported.</li><li>2: Refer to a credential</li><li>3: Refer to a variable</li></ul> 
     * @return AuthValueSource <p>Plugin authentication value source</p><p>Enumeration values:</p><ul><li>0: Unspecified</li><li>1: Use the default authentication value of the plug-in. Only APIKey/AccessKey is supported.</li><li>2: Refer to a credential</li><li>3: Refer to a variable</li></ul>
     */
    public Long getAuthValueSource() {
        return this.AuthValueSource;
    }

    /**
     * Set <p>Plugin authentication value source</p><p>Enumeration values:</p><ul><li>0: Unspecified</li><li>1: Use the default authentication value of the plug-in. Only APIKey/AccessKey is supported.</li><li>2: Refer to a credential</li><li>3: Refer to a variable</li></ul>
     * @param AuthValueSource <p>Plugin authentication value source</p><p>Enumeration values:</p><ul><li>0: Unspecified</li><li>1: Use the default authentication value of the plug-in. Only APIKey/AccessKey is supported.</li><li>2: Refer to a credential</li><li>3: Refer to a variable</li></ul>
     */
    public void setAuthValueSource(Long AuthValueSource) {
        this.AuthValueSource = AuthValueSource;
    }

    /**
     * Get <p>Credential ID</p><p>Input parameter limit: required when AuthValueSource=2</p> 
     * @return CredentialId <p>Credential ID</p><p>Input parameter limit: required when AuthValueSource=2</p>
     */
    public String getCredentialId() {
        return this.CredentialId;
    }

    /**
     * Set <p>Credential ID</p><p>Input parameter limit: required when AuthValueSource=2</p>
     * @param CredentialId <p>Credential ID</p><p>Input parameter limit: required when AuthValueSource=2</p>
     */
    public void setCredentialId(String CredentialId) {
        this.CredentialId = CredentialId;
    }

    /**
     * Get <p>Parameter configuration</p> 
     * @return ParamList <p>Parameter configuration</p>
     */
    public AgentPluginCredentialParam [] getParamList() {
        return this.ParamList;
    }

    /**
     * Set <p>Parameter configuration</p>
     * @param ParamList <p>Parameter configuration</p>
     */
    public void setParamList(AgentPluginCredentialParam [] ParamList) {
        this.ParamList = ParamList;
    }

    public AgentPluginCredentialConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentPluginCredentialConfig(AgentPluginCredentialConfig source) {
        if (source.AuthValueSource != null) {
            this.AuthValueSource = new Long(source.AuthValueSource);
        }
        if (source.CredentialId != null) {
            this.CredentialId = new String(source.CredentialId);
        }
        if (source.ParamList != null) {
            this.ParamList = new AgentPluginCredentialParam[source.ParamList.length];
            for (int i = 0; i < source.ParamList.length; i++) {
                this.ParamList[i] = new AgentPluginCredentialParam(source.ParamList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AuthValueSource", this.AuthValueSource);
        this.setParamSimple(map, prefix + "CredentialId", this.CredentialId);
        this.setParamArrayObj(map, prefix + "ParamList.", this.ParamList);

    }
}


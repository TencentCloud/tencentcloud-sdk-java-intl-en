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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SAMLIdentityProviderConfiguration extends AbstractModel {

    /**
    * IdP identifier.
    */
    @SerializedName("EntityId")
    @Expose
    private String EntityId;

    /**
    * SSO enabling status. Valid values: Enabled, Disabled (default).
    */
    @SerializedName("SSOStatus")
    @Expose
    private String SSOStatus;

    /**
    * IdP metadata document (Base64 encoded).
    */
    @SerializedName("EncodedMetadataDocument")
    @Expose
    private String EncodedMetadataDocument;

    /**
    * X509 certificate ID.
    */
    @SerializedName("CertificateIds")
    @Expose
    private String [] CertificateIds;

    /**
    * IdP login URL.
    */
    @SerializedName("LoginUrl")
    @Expose
    private String LoginUrl;

    /**
    * Creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Update time.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get IdP identifier. 
     * @return EntityId IdP identifier.
     */
    public String getEntityId() {
        return this.EntityId;
    }

    /**
     * Set IdP identifier.
     * @param EntityId IdP identifier.
     */
    public void setEntityId(String EntityId) {
        this.EntityId = EntityId;
    }

    /**
     * Get SSO enabling status. Valid values: Enabled, Disabled (default). 
     * @return SSOStatus SSO enabling status. Valid values: Enabled, Disabled (default).
     */
    public String getSSOStatus() {
        return this.SSOStatus;
    }

    /**
     * Set SSO enabling status. Valid values: Enabled, Disabled (default).
     * @param SSOStatus SSO enabling status. Valid values: Enabled, Disabled (default).
     */
    public void setSSOStatus(String SSOStatus) {
        this.SSOStatus = SSOStatus;
    }

    /**
     * Get IdP metadata document (Base64 encoded). 
     * @return EncodedMetadataDocument IdP metadata document (Base64 encoded).
     */
    public String getEncodedMetadataDocument() {
        return this.EncodedMetadataDocument;
    }

    /**
     * Set IdP metadata document (Base64 encoded).
     * @param EncodedMetadataDocument IdP metadata document (Base64 encoded).
     */
    public void setEncodedMetadataDocument(String EncodedMetadataDocument) {
        this.EncodedMetadataDocument = EncodedMetadataDocument;
    }

    /**
     * Get X509 certificate ID. 
     * @return CertificateIds X509 certificate ID.
     */
    public String [] getCertificateIds() {
        return this.CertificateIds;
    }

    /**
     * Set X509 certificate ID.
     * @param CertificateIds X509 certificate ID.
     */
    public void setCertificateIds(String [] CertificateIds) {
        this.CertificateIds = CertificateIds;
    }

    /**
     * Get IdP login URL. 
     * @return LoginUrl IdP login URL.
     */
    public String getLoginUrl() {
        return this.LoginUrl;
    }

    /**
     * Set IdP login URL.
     * @param LoginUrl IdP login URL.
     */
    public void setLoginUrl(String LoginUrl) {
        this.LoginUrl = LoginUrl;
    }

    /**
     * Get Creation time. 
     * @return CreateTime Creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
     * @param CreateTime Creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Update time. 
     * @return UpdateTime Update time.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time.
     * @param UpdateTime Update time.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public SAMLIdentityProviderConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SAMLIdentityProviderConfiguration(SAMLIdentityProviderConfiguration source) {
        if (source.EntityId != null) {
            this.EntityId = new String(source.EntityId);
        }
        if (source.SSOStatus != null) {
            this.SSOStatus = new String(source.SSOStatus);
        }
        if (source.EncodedMetadataDocument != null) {
            this.EncodedMetadataDocument = new String(source.EncodedMetadataDocument);
        }
        if (source.CertificateIds != null) {
            this.CertificateIds = new String[source.CertificateIds.length];
            for (int i = 0; i < source.CertificateIds.length; i++) {
                this.CertificateIds[i] = new String(source.CertificateIds[i]);
            }
        }
        if (source.LoginUrl != null) {
            this.LoginUrl = new String(source.LoginUrl);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EntityId", this.EntityId);
        this.setParamSimple(map, prefix + "SSOStatus", this.SSOStatus);
        this.setParamSimple(map, prefix + "EncodedMetadataDocument", this.EncodedMetadataDocument);
        this.setParamArraySimple(map, prefix + "CertificateIds.", this.CertificateIds);
        this.setParamSimple(map, prefix + "LoginUrl", this.LoginUrl);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}


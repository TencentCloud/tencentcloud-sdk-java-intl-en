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

public class SetExternalSAMLIdentityProviderRequest extends AbstractModel {

    /**
    * Space ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * IdP metadata document (Base64 encoded). Provided by an IdP that supports the SAML 2.0 protocol.
    */
    @SerializedName("EncodedMetadataDocument")
    @Expose
    private String EncodedMetadataDocument;

    /**
    * SSO enabling status. Valid values: Enabled, Disabled (default).
    */
    @SerializedName("SSOStatus")
    @Expose
    private String SSOStatus;

    /**
    * IdP identifier.
    */
    @SerializedName("EntityId")
    @Expose
    private String EntityId;

    /**
    * IdP login URL.
    */
    @SerializedName("LoginUrl")
    @Expose
    private String LoginUrl;

    /**
    * X509 certificate in PEM format. If this parameter is specified, all existing certificates will be replaced.
    */
    @SerializedName("X509Certificate")
    @Expose
    private String X509Certificate;

    /**
     * Get Space ID. 
     * @return ZoneId Space ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Space ID.
     * @param ZoneId Space ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get IdP metadata document (Base64 encoded). Provided by an IdP that supports the SAML 2.0 protocol. 
     * @return EncodedMetadataDocument IdP metadata document (Base64 encoded). Provided by an IdP that supports the SAML 2.0 protocol.
     */
    public String getEncodedMetadataDocument() {
        return this.EncodedMetadataDocument;
    }

    /**
     * Set IdP metadata document (Base64 encoded). Provided by an IdP that supports the SAML 2.0 protocol.
     * @param EncodedMetadataDocument IdP metadata document (Base64 encoded). Provided by an IdP that supports the SAML 2.0 protocol.
     */
    public void setEncodedMetadataDocument(String EncodedMetadataDocument) {
        this.EncodedMetadataDocument = EncodedMetadataDocument;
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
     * Get X509 certificate in PEM format. If this parameter is specified, all existing certificates will be replaced. 
     * @return X509Certificate X509 certificate in PEM format. If this parameter is specified, all existing certificates will be replaced.
     */
    public String getX509Certificate() {
        return this.X509Certificate;
    }

    /**
     * Set X509 certificate in PEM format. If this parameter is specified, all existing certificates will be replaced.
     * @param X509Certificate X509 certificate in PEM format. If this parameter is specified, all existing certificates will be replaced.
     */
    public void setX509Certificate(String X509Certificate) {
        this.X509Certificate = X509Certificate;
    }

    public SetExternalSAMLIdentityProviderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetExternalSAMLIdentityProviderRequest(SetExternalSAMLIdentityProviderRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.EncodedMetadataDocument != null) {
            this.EncodedMetadataDocument = new String(source.EncodedMetadataDocument);
        }
        if (source.SSOStatus != null) {
            this.SSOStatus = new String(source.SSOStatus);
        }
        if (source.EntityId != null) {
            this.EntityId = new String(source.EntityId);
        }
        if (source.LoginUrl != null) {
            this.LoginUrl = new String(source.LoginUrl);
        }
        if (source.X509Certificate != null) {
            this.X509Certificate = new String(source.X509Certificate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "EncodedMetadataDocument", this.EncodedMetadataDocument);
        this.setParamSimple(map, prefix + "SSOStatus", this.SSOStatus);
        this.setParamSimple(map, prefix + "EntityId", this.EntityId);
        this.setParamSimple(map, prefix + "LoginUrl", this.LoginUrl);
        this.setParamSimple(map, prefix + "X509Certificate", this.X509Certificate);

    }
}


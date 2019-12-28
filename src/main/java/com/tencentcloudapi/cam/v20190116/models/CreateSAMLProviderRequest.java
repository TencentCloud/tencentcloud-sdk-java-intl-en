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

public class CreateSAMLProviderRequest extends AbstractModel{

    /**
    * SAML identity provider name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * SAML identity provider description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * SAML identity provider metadata document (Base64)
    */
    @SerializedName("SAMLMetadataDocument")
    @Expose
    private String SAMLMetadataDocument;

    /**
     * Get SAML identity provider name 
     * @return Name SAML identity provider name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set SAML identity provider name
     * @param Name SAML identity provider name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get SAML identity provider description 
     * @return Description SAML identity provider description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set SAML identity provider description
     * @param Description SAML identity provider description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get SAML identity provider metadata document (Base64) 
     * @return SAMLMetadataDocument SAML identity provider metadata document (Base64)
     */
    public String getSAMLMetadataDocument() {
        return this.SAMLMetadataDocument;
    }

    /**
     * Set SAML identity provider metadata document (Base64)
     * @param SAMLMetadataDocument SAML identity provider metadata document (Base64)
     */
    public void setSAMLMetadataDocument(String SAMLMetadataDocument) {
        this.SAMLMetadataDocument = SAMLMetadataDocument;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "SAMLMetadataDocument", this.SAMLMetadataDocument);

    }
}


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

public class SAMLServiceProvider extends AbstractModel {

    /**
    * https://tencentcloudsso.com/saml/sp/z-sjw8ensa**
    */
    @SerializedName("EntityId")
    @Expose
    private String EntityId;

    /**
    * Space ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * SP metadata document (Base64 encoded).
    */
    @SerializedName("EncodedMetadataDocument")
    @Expose
    private String EncodedMetadataDocument;

    /**
    * SP ACS URL.
    */
    @SerializedName("AcsUrl")
    @Expose
    private String AcsUrl;

    /**
     * Get https://tencentcloudsso.com/saml/sp/z-sjw8ensa** 
     * @return EntityId https://tencentcloudsso.com/saml/sp/z-sjw8ensa**
     */
    public String getEntityId() {
        return this.EntityId;
    }

    /**
     * Set https://tencentcloudsso.com/saml/sp/z-sjw8ensa**
     * @param EntityId https://tencentcloudsso.com/saml/sp/z-sjw8ensa**
     */
    public void setEntityId(String EntityId) {
        this.EntityId = EntityId;
    }

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
     * Get SP metadata document (Base64 encoded). 
     * @return EncodedMetadataDocument SP metadata document (Base64 encoded).
     */
    public String getEncodedMetadataDocument() {
        return this.EncodedMetadataDocument;
    }

    /**
     * Set SP metadata document (Base64 encoded).
     * @param EncodedMetadataDocument SP metadata document (Base64 encoded).
     */
    public void setEncodedMetadataDocument(String EncodedMetadataDocument) {
        this.EncodedMetadataDocument = EncodedMetadataDocument;
    }

    /**
     * Get SP ACS URL. 
     * @return AcsUrl SP ACS URL.
     */
    public String getAcsUrl() {
        return this.AcsUrl;
    }

    /**
     * Set SP ACS URL.
     * @param AcsUrl SP ACS URL.
     */
    public void setAcsUrl(String AcsUrl) {
        this.AcsUrl = AcsUrl;
    }

    public SAMLServiceProvider() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SAMLServiceProvider(SAMLServiceProvider source) {
        if (source.EntityId != null) {
            this.EntityId = new String(source.EntityId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.EncodedMetadataDocument != null) {
            this.EncodedMetadataDocument = new String(source.EncodedMetadataDocument);
        }
        if (source.AcsUrl != null) {
            this.AcsUrl = new String(source.AcsUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EntityId", this.EntityId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "EncodedMetadataDocument", this.EncodedMetadataDocument);
        this.setParamSimple(map, prefix + "AcsUrl", this.AcsUrl);

    }
}


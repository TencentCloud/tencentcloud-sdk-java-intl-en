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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DocReference extends AbstractModel {

    /**
    * <p>Document business ID</p>
    */
    @SerializedName("DocBizId")
    @Expose
    private String DocBizId;

    /**
    * <p>Document fragment reference ID</p>
    */
    @SerializedName("ReferBizId")
    @Expose
    private String ReferBizId;

    /**
    * <p>Document name</p>
    */
    @SerializedName("DocName")
    @Expose
    private String DocName;

    /**
    * <p>Business ID of the knowledge base where the document resides</p>
    */
    @SerializedName("KnowledgeBizId")
    @Expose
    private String KnowledgeBizId;

    /**
    * <p>Name of the knowledge base where the document resides</p>
    */
    @SerializedName("KnowledgeName")
    @Expose
    private String KnowledgeName;

    /**
    * <p>Document Access Address</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get <p>Document business ID</p> 
     * @return DocBizId <p>Document business ID</p>
     */
    public String getDocBizId() {
        return this.DocBizId;
    }

    /**
     * Set <p>Document business ID</p>
     * @param DocBizId <p>Document business ID</p>
     */
    public void setDocBizId(String DocBizId) {
        this.DocBizId = DocBizId;
    }

    /**
     * Get <p>Document fragment reference ID</p> 
     * @return ReferBizId <p>Document fragment reference ID</p>
     */
    public String getReferBizId() {
        return this.ReferBizId;
    }

    /**
     * Set <p>Document fragment reference ID</p>
     * @param ReferBizId <p>Document fragment reference ID</p>
     */
    public void setReferBizId(String ReferBizId) {
        this.ReferBizId = ReferBizId;
    }

    /**
     * Get <p>Document name</p> 
     * @return DocName <p>Document name</p>
     */
    public String getDocName() {
        return this.DocName;
    }

    /**
     * Set <p>Document name</p>
     * @param DocName <p>Document name</p>
     */
    public void setDocName(String DocName) {
        this.DocName = DocName;
    }

    /**
     * Get <p>Business ID of the knowledge base where the document resides</p> 
     * @return KnowledgeBizId <p>Business ID of the knowledge base where the document resides</p>
     */
    public String getKnowledgeBizId() {
        return this.KnowledgeBizId;
    }

    /**
     * Set <p>Business ID of the knowledge base where the document resides</p>
     * @param KnowledgeBizId <p>Business ID of the knowledge base where the document resides</p>
     */
    public void setKnowledgeBizId(String KnowledgeBizId) {
        this.KnowledgeBizId = KnowledgeBizId;
    }

    /**
     * Get <p>Name of the knowledge base where the document resides</p> 
     * @return KnowledgeName <p>Name of the knowledge base where the document resides</p>
     */
    public String getKnowledgeName() {
        return this.KnowledgeName;
    }

    /**
     * Set <p>Name of the knowledge base where the document resides</p>
     * @param KnowledgeName <p>Name of the knowledge base where the document resides</p>
     */
    public void setKnowledgeName(String KnowledgeName) {
        this.KnowledgeName = KnowledgeName;
    }

    /**
     * Get <p>Document Access Address</p> 
     * @return Url <p>Document Access Address</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>Document Access Address</p>
     * @param Url <p>Document Access Address</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    public DocReference() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DocReference(DocReference source) {
        if (source.DocBizId != null) {
            this.DocBizId = new String(source.DocBizId);
        }
        if (source.ReferBizId != null) {
            this.ReferBizId = new String(source.ReferBizId);
        }
        if (source.DocName != null) {
            this.DocName = new String(source.DocName);
        }
        if (source.KnowledgeBizId != null) {
            this.KnowledgeBizId = new String(source.KnowledgeBizId);
        }
        if (source.KnowledgeName != null) {
            this.KnowledgeName = new String(source.KnowledgeName);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DocBizId", this.DocBizId);
        this.setParamSimple(map, prefix + "ReferBizId", this.ReferBizId);
        this.setParamSimple(map, prefix + "DocName", this.DocName);
        this.setParamSimple(map, prefix + "KnowledgeBizId", this.KnowledgeBizId);
        this.setParamSimple(map, prefix + "KnowledgeName", this.KnowledgeName);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}


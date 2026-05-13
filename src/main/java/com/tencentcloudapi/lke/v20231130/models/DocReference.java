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
    * 
    */
    @SerializedName("DocBizId")
    @Expose
    private Long DocBizId;

    /**
    * 
    */
    @SerializedName("ReferBizId")
    @Expose
    private Long ReferBizId;

    /**
    * 
    */
    @SerializedName("DocName")
    @Expose
    private String DocName;

    /**
    * 
    */
    @SerializedName("KnowledgeBizId")
    @Expose
    private Long KnowledgeBizId;

    /**
    * 
    */
    @SerializedName("KnowledgeName")
    @Expose
    private String KnowledgeName;

    /**
    * 
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get  
     * @return DocBizId 
     */
    public Long getDocBizId() {
        return this.DocBizId;
    }

    /**
     * Set 
     * @param DocBizId 
     */
    public void setDocBizId(Long DocBizId) {
        this.DocBizId = DocBizId;
    }

    /**
     * Get  
     * @return ReferBizId 
     */
    public Long getReferBizId() {
        return this.ReferBizId;
    }

    /**
     * Set 
     * @param ReferBizId 
     */
    public void setReferBizId(Long ReferBizId) {
        this.ReferBizId = ReferBizId;
    }

    /**
     * Get  
     * @return DocName 
     */
    public String getDocName() {
        return this.DocName;
    }

    /**
     * Set 
     * @param DocName 
     */
    public void setDocName(String DocName) {
        this.DocName = DocName;
    }

    /**
     * Get  
     * @return KnowledgeBizId 
     */
    public Long getKnowledgeBizId() {
        return this.KnowledgeBizId;
    }

    /**
     * Set 
     * @param KnowledgeBizId 
     */
    public void setKnowledgeBizId(Long KnowledgeBizId) {
        this.KnowledgeBizId = KnowledgeBizId;
    }

    /**
     * Get  
     * @return KnowledgeName 
     */
    public String getKnowledgeName() {
        return this.KnowledgeName;
    }

    /**
     * Set 
     * @param KnowledgeName 
     */
    public void setKnowledgeName(String KnowledgeName) {
        this.KnowledgeName = KnowledgeName;
    }

    /**
     * Get  
     * @return Url 
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 
     * @param Url 
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
            this.DocBizId = new Long(source.DocBizId);
        }
        if (source.ReferBizId != null) {
            this.ReferBizId = new Long(source.ReferBizId);
        }
        if (source.DocName != null) {
            this.DocName = new String(source.DocName);
        }
        if (source.KnowledgeBizId != null) {
            this.KnowledgeBizId = new Long(source.KnowledgeBizId);
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


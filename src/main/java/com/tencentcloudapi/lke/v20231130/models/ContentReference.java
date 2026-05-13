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

public class ContentReference extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
    * 
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 
    */
    @SerializedName("DocRefer")
    @Expose
    private DocReference DocRefer;

    /**
    * 
    */
    @SerializedName("QaRefer")
    @Expose
    private QaReference QaRefer;

    /**
    * 
    */
    @SerializedName("WebSearchRefer")
    @Expose
    private WebSearchReference WebSearchRefer;

    /**
     * Get  
     * @return Index 
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set 
     * @param Index 
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    /**
     * Get  
     * @return Name 
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 
     * @param Name 
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get  
     * @return Type 
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 
     * @param Type 
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get  
     * @return DocRefer 
     */
    public DocReference getDocRefer() {
        return this.DocRefer;
    }

    /**
     * Set 
     * @param DocRefer 
     */
    public void setDocRefer(DocReference DocRefer) {
        this.DocRefer = DocRefer;
    }

    /**
     * Get  
     * @return QaRefer 
     */
    public QaReference getQaRefer() {
        return this.QaRefer;
    }

    /**
     * Set 
     * @param QaRefer 
     */
    public void setQaRefer(QaReference QaRefer) {
        this.QaRefer = QaRefer;
    }

    /**
     * Get  
     * @return WebSearchRefer 
     */
    public WebSearchReference getWebSearchRefer() {
        return this.WebSearchRefer;
    }

    /**
     * Set 
     * @param WebSearchRefer 
     */
    public void setWebSearchRefer(WebSearchReference WebSearchRefer) {
        this.WebSearchRefer = WebSearchRefer;
    }

    public ContentReference() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContentReference(ContentReference source) {
        if (source.Index != null) {
            this.Index = new Long(source.Index);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.DocRefer != null) {
            this.DocRefer = new DocReference(source.DocRefer);
        }
        if (source.QaRefer != null) {
            this.QaRefer = new QaReference(source.QaRefer);
        }
        if (source.WebSearchRefer != null) {
            this.WebSearchRefer = new WebSearchReference(source.WebSearchRefer);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "DocRefer.", this.DocRefer);
        this.setParamObj(map, prefix + "QaRefer.", this.QaRefer);
        this.setParamObj(map, prefix + "WebSearchRefer.", this.WebSearchRefer);

    }
}


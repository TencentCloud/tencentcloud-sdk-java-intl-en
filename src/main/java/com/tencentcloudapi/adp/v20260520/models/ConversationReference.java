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

public class ConversationReference extends AbstractModel {

    /**
    * <p>Reference index</p>
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
    * <p>Reference name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>REFERENCE source TYPE. Enumeration values: 0-APP_REFERENCE_TYPE_UNSPECIFIED (not specified), 1-APP_REFERENCE_TYPE_QA (QA), 2-APP_REFERENCE_TYPE_SEGMENT (fragment), 3-APP_REFERENCE_TYPE_DOC (document), 4-APP_REFERENCE_TYPE_WEB_SEARCH (WEB SEARCH), 5-APP_REFERENCE_TYPE_GRAPH_RAG (GraphRAG)</p>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get <p>Reference index</p> 
     * @return Index <p>Reference index</p>
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set <p>Reference index</p>
     * @param Index <p>Reference index</p>
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    /**
     * Get <p>Reference name</p> 
     * @return Name <p>Reference name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Reference name</p>
     * @param Name <p>Reference name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>REFERENCE source TYPE. Enumeration values: 0-APP_REFERENCE_TYPE_UNSPECIFIED (not specified), 1-APP_REFERENCE_TYPE_QA (QA), 2-APP_REFERENCE_TYPE_SEGMENT (fragment), 3-APP_REFERENCE_TYPE_DOC (document), 4-APP_REFERENCE_TYPE_WEB_SEARCH (WEB SEARCH), 5-APP_REFERENCE_TYPE_GRAPH_RAG (GraphRAG)</p> 
     * @return Type <p>REFERENCE source TYPE. Enumeration values: 0-APP_REFERENCE_TYPE_UNSPECIFIED (not specified), 1-APP_REFERENCE_TYPE_QA (QA), 2-APP_REFERENCE_TYPE_SEGMENT (fragment), 3-APP_REFERENCE_TYPE_DOC (document), 4-APP_REFERENCE_TYPE_WEB_SEARCH (WEB SEARCH), 5-APP_REFERENCE_TYPE_GRAPH_RAG (GraphRAG)</p>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>REFERENCE source TYPE. Enumeration values: 0-APP_REFERENCE_TYPE_UNSPECIFIED (not specified), 1-APP_REFERENCE_TYPE_QA (QA), 2-APP_REFERENCE_TYPE_SEGMENT (fragment), 3-APP_REFERENCE_TYPE_DOC (document), 4-APP_REFERENCE_TYPE_WEB_SEARCH (WEB SEARCH), 5-APP_REFERENCE_TYPE_GRAPH_RAG (GraphRAG)</p>
     * @param Type <p>REFERENCE source TYPE. Enumeration values: 0-APP_REFERENCE_TYPE_UNSPECIFIED (not specified), 1-APP_REFERENCE_TYPE_QA (QA), 2-APP_REFERENCE_TYPE_SEGMENT (fragment), 3-APP_REFERENCE_TYPE_DOC (document), 4-APP_REFERENCE_TYPE_WEB_SEARCH (WEB SEARCH), 5-APP_REFERENCE_TYPE_GRAPH_RAG (GraphRAG)</p>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    public ConversationReference() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConversationReference(ConversationReference source) {
        if (source.Index != null) {
            this.Index = new Long(source.Index);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}


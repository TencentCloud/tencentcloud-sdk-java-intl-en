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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImportMediaKnowledgeTaskInput extends AbstractModel {

    /**
    * <p>Large Model Understanding Template</p>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <p>List of knowledge base IDs. Leave empty to use the default knowledge base.</p>
    */
    @SerializedName("KnowledgeBaseIds")
    @Expose
    private String [] KnowledgeBaseIds;

    /**
     * Get <p>Large Model Understanding Template</p> 
     * @return Definition <p>Large Model Understanding Template</p>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>Large Model Understanding Template</p>
     * @param Definition <p>Large Model Understanding Template</p>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <p>List of knowledge base IDs. Leave empty to use the default knowledge base.</p> 
     * @return KnowledgeBaseIds <p>List of knowledge base IDs. Leave empty to use the default knowledge base.</p>
     */
    public String [] getKnowledgeBaseIds() {
        return this.KnowledgeBaseIds;
    }

    /**
     * Set <p>List of knowledge base IDs. Leave empty to use the default knowledge base.</p>
     * @param KnowledgeBaseIds <p>List of knowledge base IDs. Leave empty to use the default knowledge base.</p>
     */
    public void setKnowledgeBaseIds(String [] KnowledgeBaseIds) {
        this.KnowledgeBaseIds = KnowledgeBaseIds;
    }

    public ImportMediaKnowledgeTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImportMediaKnowledgeTaskInput(ImportMediaKnowledgeTaskInput source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.KnowledgeBaseIds != null) {
            this.KnowledgeBaseIds = new String[source.KnowledgeBaseIds.length];
            for (int i = 0; i < source.KnowledgeBaseIds.length; i++) {
                this.KnowledgeBaseIds[i] = new String(source.KnowledgeBaseIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamArraySimple(map, prefix + "KnowledgeBaseIds.", this.KnowledgeBaseIds);

    }
}


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

public class KnowledgeBaseDetail extends AbstractModel {

    /**
    * <p>Knowledge base ID</p>
    */
    @SerializedName("KnowledgeBaseId")
    @Expose
    private String KnowledgeBaseId;

    /**
    * <p>Associated large model parsing template</p>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <p>Storage time</p>
    */
    @SerializedName("ImportTime")
    @Expose
    private String ImportTime;

    /**
     * Get <p>Knowledge base ID</p> 
     * @return KnowledgeBaseId <p>Knowledge base ID</p>
     */
    public String getKnowledgeBaseId() {
        return this.KnowledgeBaseId;
    }

    /**
     * Set <p>Knowledge base ID</p>
     * @param KnowledgeBaseId <p>Knowledge base ID</p>
     */
    public void setKnowledgeBaseId(String KnowledgeBaseId) {
        this.KnowledgeBaseId = KnowledgeBaseId;
    }

    /**
     * Get <p>Associated large model parsing template</p> 
     * @return Definition <p>Associated large model parsing template</p>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>Associated large model parsing template</p>
     * @param Definition <p>Associated large model parsing template</p>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <p>Storage time</p> 
     * @return ImportTime <p>Storage time</p>
     */
    public String getImportTime() {
        return this.ImportTime;
    }

    /**
     * Set <p>Storage time</p>
     * @param ImportTime <p>Storage time</p>
     */
    public void setImportTime(String ImportTime) {
        this.ImportTime = ImportTime;
    }

    public KnowledgeBaseDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KnowledgeBaseDetail(KnowledgeBaseDetail source) {
        if (source.KnowledgeBaseId != null) {
            this.KnowledgeBaseId = new String(source.KnowledgeBaseId);
        }
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.ImportTime != null) {
            this.ImportTime = new String(source.ImportTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KnowledgeBaseId", this.KnowledgeBaseId);
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "ImportTime", this.ImportTime);

    }
}


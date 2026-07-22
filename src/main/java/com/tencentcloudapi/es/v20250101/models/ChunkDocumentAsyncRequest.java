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
package com.tencentcloudapi.es.v20250101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChunkDocumentAsyncRequest extends AbstractModel {

    /**
    * File information.
    */
    @SerializedName("Document")
    @Expose
    private Document Document;

    /**
    * Model name, selectable model list: doc-tree-chunk.
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * File slice configuration.
    */
    @SerializedName("Config")
    @Expose
    private ChunkConfigAsync Config;

    /**
     * Get File information. 
     * @return Document File information.
     */
    public Document getDocument() {
        return this.Document;
    }

    /**
     * Set File information.
     * @param Document File information.
     */
    public void setDocument(Document Document) {
        this.Document = Document;
    }

    /**
     * Get Model name, selectable model list: doc-tree-chunk. 
     * @return ModelName Model name, selectable model list: doc-tree-chunk.
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set Model name, selectable model list: doc-tree-chunk.
     * @param ModelName Model name, selectable model list: doc-tree-chunk.
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get File slice configuration. 
     * @return Config File slice configuration.
     */
    public ChunkConfigAsync getConfig() {
        return this.Config;
    }

    /**
     * Set File slice configuration.
     * @param Config File slice configuration.
     */
    public void setConfig(ChunkConfigAsync Config) {
        this.Config = Config;
    }

    public ChunkDocumentAsyncRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChunkDocumentAsyncRequest(ChunkDocumentAsyncRequest source) {
        if (source.Document != null) {
            this.Document = new Document(source.Document);
        }
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.Config != null) {
            this.Config = new ChunkConfigAsync(source.Config);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Document.", this.Document);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamObj(map, prefix + "Config.", this.Config);

    }
}


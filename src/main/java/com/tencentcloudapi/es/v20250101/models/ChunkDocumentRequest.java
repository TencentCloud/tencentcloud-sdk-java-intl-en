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

public class ChunkDocumentRequest extends AbstractModel {

    /**
    * Slice file info.
    */
    @SerializedName("Document")
    @Expose
    private ChunkDocument Document;

    /**
    * Model name, selectable model list: doc-chunk.
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * File slice configuration.
    */
    @SerializedName("Config")
    @Expose
    private ChunkConfig Config;

    /**
     * Get Slice file info. 
     * @return Document Slice file info.
     */
    public ChunkDocument getDocument() {
        return this.Document;
    }

    /**
     * Set Slice file info.
     * @param Document Slice file info.
     */
    public void setDocument(ChunkDocument Document) {
        this.Document = Document;
    }

    /**
     * Get Model name, selectable model list: doc-chunk. 
     * @return ModelName Model name, selectable model list: doc-chunk.
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set Model name, selectable model list: doc-chunk.
     * @param ModelName Model name, selectable model list: doc-chunk.
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get File slice configuration. 
     * @return Config File slice configuration.
     */
    public ChunkConfig getConfig() {
        return this.Config;
    }

    /**
     * Set File slice configuration.
     * @param Config File slice configuration.
     */
    public void setConfig(ChunkConfig Config) {
        this.Config = Config;
    }

    public ChunkDocumentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChunkDocumentRequest(ChunkDocumentRequest source) {
        if (source.Document != null) {
            this.Document = new ChunkDocument(source.Document);
        }
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.Config != null) {
            this.Config = new ChunkConfig(source.Config);
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


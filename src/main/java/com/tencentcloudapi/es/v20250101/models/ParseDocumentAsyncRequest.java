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

public class ParseDocumentAsyncRequest extends AbstractModel {

    /**
    * File information.
    */
    @SerializedName("Document")
    @Expose
    private Document Document;

    /**
    * Model name, selectable model list: doc-llm.
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

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
     * Get Model name, selectable model list: doc-llm. 
     * @return ModelName Model name, selectable model list: doc-llm.
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set Model name, selectable model list: doc-llm.
     * @param ModelName Model name, selectable model list: doc-llm.
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    public ParseDocumentAsyncRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParseDocumentAsyncRequest(ParseDocumentAsyncRequest source) {
        if (source.Document != null) {
            this.Document = new Document(source.Document);
        }
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Document.", this.Document);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);

    }
}


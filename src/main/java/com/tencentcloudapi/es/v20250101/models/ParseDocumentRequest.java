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

public class ParseDocumentRequest extends AbstractModel {

    /**
    * File Information
    */
    @SerializedName("Document")
    @Expose
    private ParseDocument Document;

    /**
    * Model name, doc-llm.
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
     * Get File Information 
     * @return Document File Information
     */
    public ParseDocument getDocument() {
        return this.Document;
    }

    /**
     * Set File Information
     * @param Document File Information
     */
    public void setDocument(ParseDocument Document) {
        this.Document = Document;
    }

    /**
     * Get Model name, doc-llm. 
     * @return ModelName Model name, doc-llm.
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set Model name, doc-llm.
     * @param ModelName Model name, doc-llm.
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    public ParseDocumentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParseDocumentRequest(ParseDocumentRequest source) {
        if (source.Document != null) {
            this.Document = new ParseDocument(source.Document);
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


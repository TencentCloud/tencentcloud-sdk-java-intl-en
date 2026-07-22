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

public class GetTextEmbeddingRequest extends AbstractModel {

    /**
    * Model name, selectable model list: bge-base-zh-v1.5, bge-large-zh-v1.5, Conan-embedding-v1, bge-m3, KaLM-embedding-multilingual-mini-v1, Qwen3-Embedding-0.6B.
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * Text set to be vectorized.
    */
    @SerializedName("Texts")
    @Expose
    private String [] Texts;

    /**
     * Get Model name, selectable model list: bge-base-zh-v1.5, bge-large-zh-v1.5, Conan-embedding-v1, bge-m3, KaLM-embedding-multilingual-mini-v1, Qwen3-Embedding-0.6B. 
     * @return ModelName Model name, selectable model list: bge-base-zh-v1.5, bge-large-zh-v1.5, Conan-embedding-v1, bge-m3, KaLM-embedding-multilingual-mini-v1, Qwen3-Embedding-0.6B.
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set Model name, selectable model list: bge-base-zh-v1.5, bge-large-zh-v1.5, Conan-embedding-v1, bge-m3, KaLM-embedding-multilingual-mini-v1, Qwen3-Embedding-0.6B.
     * @param ModelName Model name, selectable model list: bge-base-zh-v1.5, bge-large-zh-v1.5, Conan-embedding-v1, bge-m3, KaLM-embedding-multilingual-mini-v1, Qwen3-Embedding-0.6B.
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get Text set to be vectorized. 
     * @return Texts Text set to be vectorized.
     */
    public String [] getTexts() {
        return this.Texts;
    }

    /**
     * Set Text set to be vectorized.
     * @param Texts Text set to be vectorized.
     */
    public void setTexts(String [] Texts) {
        this.Texts = Texts;
    }

    public GetTextEmbeddingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetTextEmbeddingRequest(GetTextEmbeddingRequest source) {
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.Texts != null) {
            this.Texts = new String[source.Texts.length];
            for (int i = 0; i < source.Texts.length; i++) {
                this.Texts[i] = new String(source.Texts[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamArraySimple(map, prefix + "Texts.", this.Texts);

    }
}


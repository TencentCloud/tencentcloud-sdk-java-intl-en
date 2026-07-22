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

public class EmbeddingData extends AbstractModel {

    /**
    * embedding content
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Embedding")
    @Expose
    private Float [] Embedding;

    /**
    * Index serial number
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
     * Get embedding content
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Embedding embedding content
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float [] getEmbedding() {
        return this.Embedding;
    }

    /**
     * Set embedding content
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Embedding embedding content
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEmbedding(Float [] Embedding) {
        this.Embedding = Embedding;
    }

    /**
     * Get Index serial number
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Index Index serial number
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set Index serial number
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Index Index serial number
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    public EmbeddingData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EmbeddingData(EmbeddingData source) {
        if (source.Embedding != null) {
            this.Embedding = new Float[source.Embedding.length];
            for (int i = 0; i < source.Embedding.length; i++) {
                this.Embedding[i] = new Float(source.Embedding[i]);
            }
        }
        if (source.Index != null) {
            this.Index = new Long(source.Index);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Embedding.", this.Embedding);
        this.setParamSimple(map, prefix + "Index", this.Index);

    }
}


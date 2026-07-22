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

public class RerankResult extends AbstractModel {

    /**
    * Location index value of the corresponding doc in the array of candidate docs
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
    * Similarity score
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RelevanceScore")
    @Expose
    private Float RelevanceScore;

    /**
    * Document content
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Document")
    @Expose
    private String Document;

    /**
     * Get Location index value of the corresponding doc in the array of candidate docs
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Index Location index value of the corresponding doc in the array of candidate docs
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set Location index value of the corresponding doc in the array of candidate docs
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Index Location index value of the corresponding doc in the array of candidate docs
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    /**
     * Get Similarity score
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RelevanceScore Similarity score
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getRelevanceScore() {
        return this.RelevanceScore;
    }

    /**
     * Set Similarity score
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RelevanceScore Similarity score
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRelevanceScore(Float RelevanceScore) {
        this.RelevanceScore = RelevanceScore;
    }

    /**
     * Get Document content
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Document Document content
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDocument() {
        return this.Document;
    }

    /**
     * Set Document content
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Document Document content
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDocument(String Document) {
        this.Document = Document;
    }

    public RerankResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RerankResult(RerankResult source) {
        if (source.Index != null) {
            this.Index = new Long(source.Index);
        }
        if (source.RelevanceScore != null) {
            this.RelevanceScore = new Float(source.RelevanceScore);
        }
        if (source.Document != null) {
            this.Document = new String(source.Document);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "RelevanceScore", this.RelevanceScore);
        this.setParamSimple(map, prefix + "Document", this.Document);

    }
}


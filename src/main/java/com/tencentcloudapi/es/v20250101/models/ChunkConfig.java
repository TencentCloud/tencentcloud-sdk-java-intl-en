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

public class ChunkConfig extends AbstractModel {

    /**
    * After splitting by the separator, the fragment length is validated. If it exceeds the maximum fragment length, it is split using the next-level separator. If there is no next-level separator, the original length is retained. Default value: 1000.
    */
    @SerializedName("MaxChunkSize")
    @Expose
    private Long MaxChunkSize;

    /**
    * Separator list, separators positioned towards the front take precedence; when the file type is TXT, default value: ["\n\n", "\n", ".", ".", "?", ",", ""].
    */
    @SerializedName("Delimiters")
    @Expose
    private String [] Delimiters;

    /**
    * The number of overlapping characters between adjacent fragments must be less than the fragment length. Fragments that form completely redundant slices are automatically filtered. Default value: 0.2*MaxChunkSize
    */
    @SerializedName("ChunkOverlap")
    @Expose
    private Long ChunkOverlap;

    /**
     * Get After splitting by the separator, the fragment length is validated. If it exceeds the maximum fragment length, it is split using the next-level separator. If there is no next-level separator, the original length is retained. Default value: 1000. 
     * @return MaxChunkSize After splitting by the separator, the fragment length is validated. If it exceeds the maximum fragment length, it is split using the next-level separator. If there is no next-level separator, the original length is retained. Default value: 1000.
     */
    public Long getMaxChunkSize() {
        return this.MaxChunkSize;
    }

    /**
     * Set After splitting by the separator, the fragment length is validated. If it exceeds the maximum fragment length, it is split using the next-level separator. If there is no next-level separator, the original length is retained. Default value: 1000.
     * @param MaxChunkSize After splitting by the separator, the fragment length is validated. If it exceeds the maximum fragment length, it is split using the next-level separator. If there is no next-level separator, the original length is retained. Default value: 1000.
     */
    public void setMaxChunkSize(Long MaxChunkSize) {
        this.MaxChunkSize = MaxChunkSize;
    }

    /**
     * Get Separator list, separators positioned towards the front take precedence; when the file type is TXT, default value: ["\n\n", "\n", ".", ".", "?", ",", ""]. 
     * @return Delimiters Separator list, separators positioned towards the front take precedence; when the file type is TXT, default value: ["\n\n", "\n", ".", ".", "?", ",", ""].
     */
    public String [] getDelimiters() {
        return this.Delimiters;
    }

    /**
     * Set Separator list, separators positioned towards the front take precedence; when the file type is TXT, default value: ["\n\n", "\n", ".", ".", "?", ",", ""].
     * @param Delimiters Separator list, separators positioned towards the front take precedence; when the file type is TXT, default value: ["\n\n", "\n", ".", ".", "?", ",", ""].
     */
    public void setDelimiters(String [] Delimiters) {
        this.Delimiters = Delimiters;
    }

    /**
     * Get The number of overlapping characters between adjacent fragments must be less than the fragment length. Fragments that form completely redundant slices are automatically filtered. Default value: 0.2*MaxChunkSize 
     * @return ChunkOverlap The number of overlapping characters between adjacent fragments must be less than the fragment length. Fragments that form completely redundant slices are automatically filtered. Default value: 0.2*MaxChunkSize
     */
    public Long getChunkOverlap() {
        return this.ChunkOverlap;
    }

    /**
     * Set The number of overlapping characters between adjacent fragments must be less than the fragment length. Fragments that form completely redundant slices are automatically filtered. Default value: 0.2*MaxChunkSize
     * @param ChunkOverlap The number of overlapping characters between adjacent fragments must be less than the fragment length. Fragments that form completely redundant slices are automatically filtered. Default value: 0.2*MaxChunkSize
     */
    public void setChunkOverlap(Long ChunkOverlap) {
        this.ChunkOverlap = ChunkOverlap;
    }

    public ChunkConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChunkConfig(ChunkConfig source) {
        if (source.MaxChunkSize != null) {
            this.MaxChunkSize = new Long(source.MaxChunkSize);
        }
        if (source.Delimiters != null) {
            this.Delimiters = new String[source.Delimiters.length];
            for (int i = 0; i < source.Delimiters.length; i++) {
                this.Delimiters[i] = new String(source.Delimiters[i]);
            }
        }
        if (source.ChunkOverlap != null) {
            this.ChunkOverlap = new Long(source.ChunkOverlap);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxChunkSize", this.MaxChunkSize);
        this.setParamArraySimple(map, prefix + "Delimiters.", this.Delimiters);
        this.setParamSimple(map, prefix + "ChunkOverlap", this.ChunkOverlap);

    }
}


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

public class Chunk extends AbstractModel {

    /**
    * chunk index. Slice sequence id.
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
    * chunk content.
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get chunk index. Slice sequence id. 
     * @return Index chunk index. Slice sequence id.
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set chunk index. Slice sequence id.
     * @param Index chunk index. Slice sequence id.
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    /**
     * Get chunk content. 
     * @return Content chunk content.
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set chunk content.
     * @param Content chunk content.
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public Chunk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Chunk(Chunk source) {
        if (source.Index != null) {
            this.Index = new Long(source.Index);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}


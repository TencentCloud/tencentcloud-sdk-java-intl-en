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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KnowledgeSummary extends AbstractModel {

    /**
    * 1: Q&A; 2: document fragment.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Knowledge content.
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get 1: Q&A; 2: document fragment. 
     * @return Type 1: Q&A; 2: document fragment.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 1: Q&A; 2: document fragment.
     * @param Type 1: Q&A; 2: document fragment.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Knowledge content. 
     * @return Content Knowledge content.
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Knowledge content.
     * @param Content Knowledge content.
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public KnowledgeSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KnowledgeSummary(KnowledgeSummary source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}


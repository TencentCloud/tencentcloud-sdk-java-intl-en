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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EmbeddingData extends AbstractModel {

    /**
    * <p>Data type</p><p>Enumeration values:</p><ul><li>text: Text</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Data content. When Type is text, it is a text string.</p>
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
     * Get <p>Data type</p><p>Enumeration values:</p><ul><li>text: Text</li></ul> 
     * @return Type <p>Data type</p><p>Enumeration values:</p><ul><li>text: Text</li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Data type</p><p>Enumeration values:</p><ul><li>text: Text</li></ul>
     * @param Type <p>Data type</p><p>Enumeration values:</p><ul><li>text: Text</li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Data content. When Type is text, it is a text string.</p> 
     * @return Data <p>Data content. When Type is text, it is a text string.</p>
     */
    public String getData() {
        return this.Data;
    }

    /**
     * Set <p>Data content. When Type is text, it is a text string.</p>
     * @param Data <p>Data content. When Type is text, it is a text string.</p>
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    public EmbeddingData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EmbeddingData(EmbeddingData source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Data != null) {
            this.Data = new String(source.Data);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Data", this.Data);

    }
}


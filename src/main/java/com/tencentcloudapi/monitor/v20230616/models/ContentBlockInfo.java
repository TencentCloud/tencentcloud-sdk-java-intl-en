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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ContentBlockInfo extends AbstractModel {

    /**
    * <p>Type.</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Data content.</p>
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
     * Get <p>Type.</p> 
     * @return Type <p>Type.</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Type.</p>
     * @param Type <p>Type.</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Data content.</p> 
     * @return Data <p>Data content.</p>
     */
    public String getData() {
        return this.Data;
    }

    /**
     * Set <p>Data content.</p>
     * @param Data <p>Data content.</p>
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    public ContentBlockInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContentBlockInfo(ContentBlockInfo source) {
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


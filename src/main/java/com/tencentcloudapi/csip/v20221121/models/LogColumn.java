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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogColumn extends AbstractModel {

    /**
    * <p>Name.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Type.</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get <p>Name.</p> 
     * @return Name <p>Name.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Name.</p>
     * @param Name <p>Name.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

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

    public LogColumn() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogColumn(LogColumn source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}


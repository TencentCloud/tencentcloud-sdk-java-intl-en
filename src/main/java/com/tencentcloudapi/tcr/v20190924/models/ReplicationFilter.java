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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReplicationFilter extends AbstractModel {

    /**
    * Type (`name`, `tag` and `resource`)
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * It is left blank by default
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get Type (`name`, `tag` and `resource`) 
     * @return Type Type (`name`, `tag` and `resource`)
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type (`name`, `tag` and `resource`)
     * @param Type Type (`name`, `tag` and `resource`)
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get It is left blank by default 
     * @return Value It is left blank by default
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set It is left blank by default
     * @param Value It is left blank by default
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public ReplicationFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReplicationFilter(ReplicationFilter source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}


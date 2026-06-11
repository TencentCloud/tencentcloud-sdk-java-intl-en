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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HostMetricItem extends AbstractModel {

    /**
    * Host metric collection item type. Supports "cpu", "mem", "net", "disk", "system".

- cpu:CPU
-mem: memory
-net: network
-disk
- system: System
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get Host metric collection item type. Supports "cpu", "mem", "net", "disk", "system".

- cpu:CPU
-mem: memory
-net: network
-disk
- system: System 
     * @return Type Host metric collection item type. Supports "cpu", "mem", "net", "disk", "system".

- cpu:CPU
-mem: memory
-net: network
-disk
- system: System
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Host metric collection item type. Supports "cpu", "mem", "net", "disk", "system".

- cpu:CPU
-mem: memory
-net: network
-disk
- system: System
     * @param Type Host metric collection item type. Supports "cpu", "mem", "net", "disk", "system".

- cpu:CPU
-mem: memory
-net: network
-disk
- system: System
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public HostMetricItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostMetricItem(HostMetricItem source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}


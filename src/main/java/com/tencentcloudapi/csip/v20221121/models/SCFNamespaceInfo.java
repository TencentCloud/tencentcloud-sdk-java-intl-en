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

public class SCFNamespaceInfo extends AbstractModel {

    /**
    * Namespace name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Namespace type
Enumeration values:
Default: default namespace
Custom: custom namespace
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get Namespace name 
     * @return Name Namespace name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Namespace name
     * @param Name Namespace name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Namespace type
Enumeration values:
Default: default namespace
Custom: custom namespace 
     * @return Type Namespace type
Enumeration values:
Default: default namespace
Custom: custom namespace
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Namespace type
Enumeration values:
Default: default namespace
Custom: custom namespace
     * @param Type Namespace type
Enumeration values:
Default: default namespace
Custom: custom namespace
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public SCFNamespaceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SCFNamespaceInfo(SCFNamespaceInfo source) {
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


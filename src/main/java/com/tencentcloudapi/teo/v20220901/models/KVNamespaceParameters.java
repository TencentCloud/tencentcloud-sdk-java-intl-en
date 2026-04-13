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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KVNamespaceParameters extends AbstractModel {

    /**
    * The site ID belonging to the KV namespace. Specifies the site where the KV namespace resides that should be bound, supporting cross-site binding.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * KV namespace name. Specifies the specific namespace that should be bound. You can obtain the list of namespaces under the site through the DescribeKVNamespace API.
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
     * Get The site ID belonging to the KV namespace. Specifies the site where the KV namespace resides that should be bound, supporting cross-site binding. 
     * @return ZoneId The site ID belonging to the KV namespace. Specifies the site where the KV namespace resides that should be bound, supporting cross-site binding.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set The site ID belonging to the KV namespace. Specifies the site where the KV namespace resides that should be bound, supporting cross-site binding.
     * @param ZoneId The site ID belonging to the KV namespace. Specifies the site where the KV namespace resides that should be bound, supporting cross-site binding.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get KV namespace name. Specifies the specific namespace that should be bound. You can obtain the list of namespaces under the site through the DescribeKVNamespace API. 
     * @return Namespace KV namespace name. Specifies the specific namespace that should be bound. You can obtain the list of namespaces under the site through the DescribeKVNamespace API.
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set KV namespace name. Specifies the specific namespace that should be bound. You can obtain the list of namespaces under the site through the DescribeKVNamespace API.
     * @param Namespace KV namespace name. Specifies the specific namespace that should be bound. You can obtain the list of namespaces under the site through the DescribeKVNamespace API.
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    public KVNamespaceParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KVNamespaceParameters(KVNamespaceParameters source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);

    }
}


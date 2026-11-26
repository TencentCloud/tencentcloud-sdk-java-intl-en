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

public class FunctionComponentBinding extends AbstractModel {

    /**
    * Bound component type. Valid values:
<li>kv_namespace: KV namespace.</li>

    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Variable name for binding. It can contain 1-50 characters, including letters, digits, and underscores. It cannot start with a digit. In edge function code, access the bound component through this variable name. Usage varies based on the value of Type as follows:
<li>When Type is kv_namespace: In code, you can access the KV namespace through this variable name. For example, when setting it to "MY_KV", you can perform read-write operations through MY_KV.get("key").</li>

    */
    @SerializedName("VariableName")
    @Expose
    private String VariableName;

    /**
    * KV namespace configuration parameter. Used to specify the bound KV namespace details. Required when Type is kv_namespace.


    */
    @SerializedName("KVNamespaceParameters")
    @Expose
    private KVNamespaceParameters KVNamespaceParameters;

    /**
     * Get Bound component type. Valid values:
<li>kv_namespace: KV namespace.</li>
 
     * @return Type Bound component type. Valid values:
<li>kv_namespace: KV namespace.</li>

     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Bound component type. Valid values:
<li>kv_namespace: KV namespace.</li>

     * @param Type Bound component type. Valid values:
<li>kv_namespace: KV namespace.</li>

     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Variable name for binding. It can contain 1-50 characters, including letters, digits, and underscores. It cannot start with a digit. In edge function code, access the bound component through this variable name. Usage varies based on the value of Type as follows:
<li>When Type is kv_namespace: In code, you can access the KV namespace through this variable name. For example, when setting it to "MY_KV", you can perform read-write operations through MY_KV.get("key").</li>
 
     * @return VariableName Variable name for binding. It can contain 1-50 characters, including letters, digits, and underscores. It cannot start with a digit. In edge function code, access the bound component through this variable name. Usage varies based on the value of Type as follows:
<li>When Type is kv_namespace: In code, you can access the KV namespace through this variable name. For example, when setting it to "MY_KV", you can perform read-write operations through MY_KV.get("key").</li>

     */
    public String getVariableName() {
        return this.VariableName;
    }

    /**
     * Set Variable name for binding. It can contain 1-50 characters, including letters, digits, and underscores. It cannot start with a digit. In edge function code, access the bound component through this variable name. Usage varies based on the value of Type as follows:
<li>When Type is kv_namespace: In code, you can access the KV namespace through this variable name. For example, when setting it to "MY_KV", you can perform read-write operations through MY_KV.get("key").</li>

     * @param VariableName Variable name for binding. It can contain 1-50 characters, including letters, digits, and underscores. It cannot start with a digit. In edge function code, access the bound component through this variable name. Usage varies based on the value of Type as follows:
<li>When Type is kv_namespace: In code, you can access the KV namespace through this variable name. For example, when setting it to "MY_KV", you can perform read-write operations through MY_KV.get("key").</li>

     */
    public void setVariableName(String VariableName) {
        this.VariableName = VariableName;
    }

    /**
     * Get KV namespace configuration parameter. Used to specify the bound KV namespace details. Required when Type is kv_namespace.

 
     * @return KVNamespaceParameters KV namespace configuration parameter. Used to specify the bound KV namespace details. Required when Type is kv_namespace.


     */
    public KVNamespaceParameters getKVNamespaceParameters() {
        return this.KVNamespaceParameters;
    }

    /**
     * Set KV namespace configuration parameter. Used to specify the bound KV namespace details. Required when Type is kv_namespace.


     * @param KVNamespaceParameters KV namespace configuration parameter. Used to specify the bound KV namespace details. Required when Type is kv_namespace.


     */
    public void setKVNamespaceParameters(KVNamespaceParameters KVNamespaceParameters) {
        this.KVNamespaceParameters = KVNamespaceParameters;
    }

    public FunctionComponentBinding() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FunctionComponentBinding(FunctionComponentBinding source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.VariableName != null) {
            this.VariableName = new String(source.VariableName);
        }
        if (source.KVNamespaceParameters != null) {
            this.KVNamespaceParameters = new KVNamespaceParameters(source.KVNamespaceParameters);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "VariableName", this.VariableName);
        this.setParamObj(map, prefix + "KVNamespaceParameters.", this.KVNamespaceParameters);

    }
}


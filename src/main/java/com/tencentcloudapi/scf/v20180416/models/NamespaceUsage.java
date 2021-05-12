/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NamespaceUsage extends AbstractModel{

    /**
    * Function array
    */
    @SerializedName("Functions")
    @Expose
    private String [] Functions;

    /**
    * Namespace name
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Number of functions in namespace
    */
    @SerializedName("FunctionsCount")
    @Expose
    private Long FunctionsCount;

    /**
     * Get Function array 
     * @return Functions Function array
     */
    public String [] getFunctions() {
        return this.Functions;
    }

    /**
     * Set Function array
     * @param Functions Function array
     */
    public void setFunctions(String [] Functions) {
        this.Functions = Functions;
    }

    /**
     * Get Namespace name 
     * @return Namespace Namespace name
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Namespace name
     * @param Namespace Namespace name
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Number of functions in namespace 
     * @return FunctionsCount Number of functions in namespace
     */
    public Long getFunctionsCount() {
        return this.FunctionsCount;
    }

    /**
     * Set Number of functions in namespace
     * @param FunctionsCount Number of functions in namespace
     */
    public void setFunctionsCount(Long FunctionsCount) {
        this.FunctionsCount = FunctionsCount;
    }

    public NamespaceUsage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NamespaceUsage(NamespaceUsage source) {
        if (source.Functions != null) {
            this.Functions = new String[source.Functions.length];
            for (int i = 0; i < source.Functions.length; i++) {
                this.Functions[i] = new String(source.Functions[i]);
            }
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.FunctionsCount != null) {
            this.FunctionsCount = new Long(source.FunctionsCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Functions.", this.Functions);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "FunctionsCount", this.FunctionsCount);

    }
}


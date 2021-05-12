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

public class LimitsInfo extends AbstractModel{

    /**
    * Limit of namespace quantity
    */
    @SerializedName("NamespacesCount")
    @Expose
    private Long NamespacesCount;

    /**
    * Namespace limit information
    */
    @SerializedName("Namespace")
    @Expose
    private NamespaceLimit [] Namespace;

    /**
     * Get Limit of namespace quantity 
     * @return NamespacesCount Limit of namespace quantity
     */
    public Long getNamespacesCount() {
        return this.NamespacesCount;
    }

    /**
     * Set Limit of namespace quantity
     * @param NamespacesCount Limit of namespace quantity
     */
    public void setNamespacesCount(Long NamespacesCount) {
        this.NamespacesCount = NamespacesCount;
    }

    /**
     * Get Namespace limit information 
     * @return Namespace Namespace limit information
     */
    public NamespaceLimit [] getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Namespace limit information
     * @param Namespace Namespace limit information
     */
    public void setNamespace(NamespaceLimit [] Namespace) {
        this.Namespace = Namespace;
    }

    public LimitsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LimitsInfo(LimitsInfo source) {
        if (source.NamespacesCount != null) {
            this.NamespacesCount = new Long(source.NamespacesCount);
        }
        if (source.Namespace != null) {
            this.Namespace = new NamespaceLimit[source.Namespace.length];
            for (int i = 0; i < source.Namespace.length; i++) {
                this.Namespace[i] = new NamespaceLimit(source.Namespace[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NamespacesCount", this.NamespacesCount);
        this.setParamArrayObj(map, prefix + "Namespace.", this.Namespace);

    }
}


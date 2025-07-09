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

public class ReplicationRule extends AbstractModel {

    /**
    * Name of synchronization rule
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Destination namespace
    */
    @SerializedName("DestNamespace")
    @Expose
    private String DestNamespace;

    /**
    * Whether to override
    */
    @SerializedName("Override")
    @Expose
    private Boolean Override;

    /**
    * Synchronization filters
    */
    @SerializedName("Filters")
    @Expose
    private ReplicationFilter [] Filters;

    /**
     * Get Name of synchronization rule 
     * @return Name Name of synchronization rule
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of synchronization rule
     * @param Name Name of synchronization rule
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Destination namespace 
     * @return DestNamespace Destination namespace
     */
    public String getDestNamespace() {
        return this.DestNamespace;
    }

    /**
     * Set Destination namespace
     * @param DestNamespace Destination namespace
     */
    public void setDestNamespace(String DestNamespace) {
        this.DestNamespace = DestNamespace;
    }

    /**
     * Get Whether to override 
     * @return Override Whether to override
     */
    public Boolean getOverride() {
        return this.Override;
    }

    /**
     * Set Whether to override
     * @param Override Whether to override
     */
    public void setOverride(Boolean Override) {
        this.Override = Override;
    }

    /**
     * Get Synchronization filters 
     * @return Filters Synchronization filters
     */
    public ReplicationFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Synchronization filters
     * @param Filters Synchronization filters
     */
    public void setFilters(ReplicationFilter [] Filters) {
        this.Filters = Filters;
    }

    public ReplicationRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReplicationRule(ReplicationRule source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DestNamespace != null) {
            this.DestNamespace = new String(source.DestNamespace);
        }
        if (source.Override != null) {
            this.Override = new Boolean(source.Override);
        }
        if (source.Filters != null) {
            this.Filters = new ReplicationFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new ReplicationFilter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DestNamespace", this.DestNamespace);
        this.setParamSimple(map, prefix + "Override", this.Override);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}


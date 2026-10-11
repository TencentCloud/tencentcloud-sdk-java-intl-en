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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PodAffinityTerm extends AbstractModel {

    /**
    * <p>Label selector.</p>
    */
    @SerializedName("LabelSelector")
    @Expose
    private LabelSelector LabelSelector;

    /**
    * <p>Namespace list.</p>
    */
    @SerializedName("Namespaces")
    @Expose
    private String [] Namespaces;

    /**
    * <p>Topology domain key.</p>
    */
    @SerializedName("TopologyKey")
    @Expose
    private String TopologyKey;

    /**
    * <p>Namespace selector.</p>
    */
    @SerializedName("NamespaceSelector")
    @Expose
    private LabelSelector NamespaceSelector;

    /**
     * Get <p>Label selector.</p> 
     * @return LabelSelector <p>Label selector.</p>
     */
    public LabelSelector getLabelSelector() {
        return this.LabelSelector;
    }

    /**
     * Set <p>Label selector.</p>
     * @param LabelSelector <p>Label selector.</p>
     */
    public void setLabelSelector(LabelSelector LabelSelector) {
        this.LabelSelector = LabelSelector;
    }

    /**
     * Get <p>Namespace list.</p> 
     * @return Namespaces <p>Namespace list.</p>
     */
    public String [] getNamespaces() {
        return this.Namespaces;
    }

    /**
     * Set <p>Namespace list.</p>
     * @param Namespaces <p>Namespace list.</p>
     */
    public void setNamespaces(String [] Namespaces) {
        this.Namespaces = Namespaces;
    }

    /**
     * Get <p>Topology domain key.</p> 
     * @return TopologyKey <p>Topology domain key.</p>
     */
    public String getTopologyKey() {
        return this.TopologyKey;
    }

    /**
     * Set <p>Topology domain key.</p>
     * @param TopologyKey <p>Topology domain key.</p>
     */
    public void setTopologyKey(String TopologyKey) {
        this.TopologyKey = TopologyKey;
    }

    /**
     * Get <p>Namespace selector.</p> 
     * @return NamespaceSelector <p>Namespace selector.</p>
     */
    public LabelSelector getNamespaceSelector() {
        return this.NamespaceSelector;
    }

    /**
     * Set <p>Namespace selector.</p>
     * @param NamespaceSelector <p>Namespace selector.</p>
     */
    public void setNamespaceSelector(LabelSelector NamespaceSelector) {
        this.NamespaceSelector = NamespaceSelector;
    }

    public PodAffinityTerm() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PodAffinityTerm(PodAffinityTerm source) {
        if (source.LabelSelector != null) {
            this.LabelSelector = new LabelSelector(source.LabelSelector);
        }
        if (source.Namespaces != null) {
            this.Namespaces = new String[source.Namespaces.length];
            for (int i = 0; i < source.Namespaces.length; i++) {
                this.Namespaces[i] = new String(source.Namespaces[i]);
            }
        }
        if (source.TopologyKey != null) {
            this.TopologyKey = new String(source.TopologyKey);
        }
        if (source.NamespaceSelector != null) {
            this.NamespaceSelector = new LabelSelector(source.NamespaceSelector);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "LabelSelector.", this.LabelSelector);
        this.setParamArraySimple(map, prefix + "Namespaces.", this.Namespaces);
        this.setParamSimple(map, prefix + "TopologyKey", this.TopologyKey);
        this.setParamObj(map, prefix + "NamespaceSelector.", this.NamespaceSelector);

    }
}


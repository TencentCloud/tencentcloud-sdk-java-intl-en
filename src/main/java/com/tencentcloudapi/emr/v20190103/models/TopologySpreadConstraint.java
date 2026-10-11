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

public class TopologySpreadConstraint extends AbstractModel {

    /**
    * <p>Maximum deviation value.</p>
    */
    @SerializedName("MaxSkew")
    @Expose
    private Long MaxSkew;

    /**
    * <p>Topology domain key.</p>
    */
    @SerializedName("TopologyKey")
    @Expose
    private String TopologyKey;

    /**
    * <p>Handling policy, which is used when constraints are not met.</p>
    */
    @SerializedName("WhenUnsatisfiable")
    @Expose
    private String WhenUnsatisfiable;

    /**
    * <p>Tag selector.</p>
    */
    @SerializedName("LabelSelector")
    @Expose
    private LabelSelector LabelSelector;

    /**
    * <p>Minimum number of topology domains.</p>
    */
    @SerializedName("MinDomains")
    @Expose
    private Long MinDomains;

    /**
    * <p>Node affinity policy.</p>
    */
    @SerializedName("NodeAffinityPolicy")
    @Expose
    private String NodeAffinityPolicy;

    /**
    * <p>Node taint policy.</p>
    */
    @SerializedName("NodeTaintsPolicy")
    @Expose
    private String NodeTaintsPolicy;

    /**
    * <p>List of tag keys to be matched.</p>
    */
    @SerializedName("MatchLabelKeys")
    @Expose
    private String [] MatchLabelKeys;

    /**
     * Get <p>Maximum deviation value.</p> 
     * @return MaxSkew <p>Maximum deviation value.</p>
     */
    public Long getMaxSkew() {
        return this.MaxSkew;
    }

    /**
     * Set <p>Maximum deviation value.</p>
     * @param MaxSkew <p>Maximum deviation value.</p>
     */
    public void setMaxSkew(Long MaxSkew) {
        this.MaxSkew = MaxSkew;
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
     * Get <p>Handling policy, which is used when constraints are not met.</p> 
     * @return WhenUnsatisfiable <p>Handling policy, which is used when constraints are not met.</p>
     */
    public String getWhenUnsatisfiable() {
        return this.WhenUnsatisfiable;
    }

    /**
     * Set <p>Handling policy, which is used when constraints are not met.</p>
     * @param WhenUnsatisfiable <p>Handling policy, which is used when constraints are not met.</p>
     */
    public void setWhenUnsatisfiable(String WhenUnsatisfiable) {
        this.WhenUnsatisfiable = WhenUnsatisfiable;
    }

    /**
     * Get <p>Tag selector.</p> 
     * @return LabelSelector <p>Tag selector.</p>
     */
    public LabelSelector getLabelSelector() {
        return this.LabelSelector;
    }

    /**
     * Set <p>Tag selector.</p>
     * @param LabelSelector <p>Tag selector.</p>
     */
    public void setLabelSelector(LabelSelector LabelSelector) {
        this.LabelSelector = LabelSelector;
    }

    /**
     * Get <p>Minimum number of topology domains.</p> 
     * @return MinDomains <p>Minimum number of topology domains.</p>
     */
    public Long getMinDomains() {
        return this.MinDomains;
    }

    /**
     * Set <p>Minimum number of topology domains.</p>
     * @param MinDomains <p>Minimum number of topology domains.</p>
     */
    public void setMinDomains(Long MinDomains) {
        this.MinDomains = MinDomains;
    }

    /**
     * Get <p>Node affinity policy.</p> 
     * @return NodeAffinityPolicy <p>Node affinity policy.</p>
     */
    public String getNodeAffinityPolicy() {
        return this.NodeAffinityPolicy;
    }

    /**
     * Set <p>Node affinity policy.</p>
     * @param NodeAffinityPolicy <p>Node affinity policy.</p>
     */
    public void setNodeAffinityPolicy(String NodeAffinityPolicy) {
        this.NodeAffinityPolicy = NodeAffinityPolicy;
    }

    /**
     * Get <p>Node taint policy.</p> 
     * @return NodeTaintsPolicy <p>Node taint policy.</p>
     */
    public String getNodeTaintsPolicy() {
        return this.NodeTaintsPolicy;
    }

    /**
     * Set <p>Node taint policy.</p>
     * @param NodeTaintsPolicy <p>Node taint policy.</p>
     */
    public void setNodeTaintsPolicy(String NodeTaintsPolicy) {
        this.NodeTaintsPolicy = NodeTaintsPolicy;
    }

    /**
     * Get <p>List of tag keys to be matched.</p> 
     * @return MatchLabelKeys <p>List of tag keys to be matched.</p>
     */
    public String [] getMatchLabelKeys() {
        return this.MatchLabelKeys;
    }

    /**
     * Set <p>List of tag keys to be matched.</p>
     * @param MatchLabelKeys <p>List of tag keys to be matched.</p>
     */
    public void setMatchLabelKeys(String [] MatchLabelKeys) {
        this.MatchLabelKeys = MatchLabelKeys;
    }

    public TopologySpreadConstraint() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TopologySpreadConstraint(TopologySpreadConstraint source) {
        if (source.MaxSkew != null) {
            this.MaxSkew = new Long(source.MaxSkew);
        }
        if (source.TopologyKey != null) {
            this.TopologyKey = new String(source.TopologyKey);
        }
        if (source.WhenUnsatisfiable != null) {
            this.WhenUnsatisfiable = new String(source.WhenUnsatisfiable);
        }
        if (source.LabelSelector != null) {
            this.LabelSelector = new LabelSelector(source.LabelSelector);
        }
        if (source.MinDomains != null) {
            this.MinDomains = new Long(source.MinDomains);
        }
        if (source.NodeAffinityPolicy != null) {
            this.NodeAffinityPolicy = new String(source.NodeAffinityPolicy);
        }
        if (source.NodeTaintsPolicy != null) {
            this.NodeTaintsPolicy = new String(source.NodeTaintsPolicy);
        }
        if (source.MatchLabelKeys != null) {
            this.MatchLabelKeys = new String[source.MatchLabelKeys.length];
            for (int i = 0; i < source.MatchLabelKeys.length; i++) {
                this.MatchLabelKeys[i] = new String(source.MatchLabelKeys[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxSkew", this.MaxSkew);
        this.setParamSimple(map, prefix + "TopologyKey", this.TopologyKey);
        this.setParamSimple(map, prefix + "WhenUnsatisfiable", this.WhenUnsatisfiable);
        this.setParamObj(map, prefix + "LabelSelector.", this.LabelSelector);
        this.setParamSimple(map, prefix + "MinDomains", this.MinDomains);
        this.setParamSimple(map, prefix + "NodeAffinityPolicy", this.NodeAffinityPolicy);
        this.setParamSimple(map, prefix + "NodeTaintsPolicy", this.NodeTaintsPolicy);
        this.setParamArraySimple(map, prefix + "MatchLabelKeys.", this.MatchLabelKeys);

    }
}


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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PulsarProClusterSpecInfo extends AbstractModel{

    /**
    * Cluster specification name
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * Peak TPS
    */
    @SerializedName("MaxTps")
    @Expose
    private Long MaxTps;

    /**
    * Peak bandwidth in Mbps
    */
    @SerializedName("MaxBandWidth")
    @Expose
    private Long MaxBandWidth;

    /**
    * Maximum number of namespaces
    */
    @SerializedName("MaxNamespaces")
    @Expose
    private Long MaxNamespaces;

    /**
    * Maximum number of topic partitions
    */
    @SerializedName("MaxTopics")
    @Expose
    private Long MaxTopics;

    /**
    * Elastic TPS beyond the specification
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScalableTps")
    @Expose
    private Long ScalableTps;

    /**
     * Get Cluster specification name 
     * @return SpecName Cluster specification name
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set Cluster specification name
     * @param SpecName Cluster specification name
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * Get Peak TPS 
     * @return MaxTps Peak TPS
     */
    public Long getMaxTps() {
        return this.MaxTps;
    }

    /**
     * Set Peak TPS
     * @param MaxTps Peak TPS
     */
    public void setMaxTps(Long MaxTps) {
        this.MaxTps = MaxTps;
    }

    /**
     * Get Peak bandwidth in Mbps 
     * @return MaxBandWidth Peak bandwidth in Mbps
     */
    public Long getMaxBandWidth() {
        return this.MaxBandWidth;
    }

    /**
     * Set Peak bandwidth in Mbps
     * @param MaxBandWidth Peak bandwidth in Mbps
     */
    public void setMaxBandWidth(Long MaxBandWidth) {
        this.MaxBandWidth = MaxBandWidth;
    }

    /**
     * Get Maximum number of namespaces 
     * @return MaxNamespaces Maximum number of namespaces
     */
    public Long getMaxNamespaces() {
        return this.MaxNamespaces;
    }

    /**
     * Set Maximum number of namespaces
     * @param MaxNamespaces Maximum number of namespaces
     */
    public void setMaxNamespaces(Long MaxNamespaces) {
        this.MaxNamespaces = MaxNamespaces;
    }

    /**
     * Get Maximum number of topic partitions 
     * @return MaxTopics Maximum number of topic partitions
     */
    public Long getMaxTopics() {
        return this.MaxTopics;
    }

    /**
     * Set Maximum number of topic partitions
     * @param MaxTopics Maximum number of topic partitions
     */
    public void setMaxTopics(Long MaxTopics) {
        this.MaxTopics = MaxTopics;
    }

    /**
     * Get Elastic TPS beyond the specification
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ScalableTps Elastic TPS beyond the specification
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getScalableTps() {
        return this.ScalableTps;
    }

    /**
     * Set Elastic TPS beyond the specification
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ScalableTps Elastic TPS beyond the specification
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScalableTps(Long ScalableTps) {
        this.ScalableTps = ScalableTps;
    }

    public PulsarProClusterSpecInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PulsarProClusterSpecInfo(PulsarProClusterSpecInfo source) {
        if (source.SpecName != null) {
            this.SpecName = new String(source.SpecName);
        }
        if (source.MaxTps != null) {
            this.MaxTps = new Long(source.MaxTps);
        }
        if (source.MaxBandWidth != null) {
            this.MaxBandWidth = new Long(source.MaxBandWidth);
        }
        if (source.MaxNamespaces != null) {
            this.MaxNamespaces = new Long(source.MaxNamespaces);
        }
        if (source.MaxTopics != null) {
            this.MaxTopics = new Long(source.MaxTopics);
        }
        if (source.ScalableTps != null) {
            this.ScalableTps = new Long(source.ScalableTps);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpecName", this.SpecName);
        this.setParamSimple(map, prefix + "MaxTps", this.MaxTps);
        this.setParamSimple(map, prefix + "MaxBandWidth", this.MaxBandWidth);
        this.setParamSimple(map, prefix + "MaxNamespaces", this.MaxNamespaces);
        this.setParamSimple(map, prefix + "MaxTopics", this.MaxTopics);
        this.setParamSimple(map, prefix + "ScalableTps", this.ScalableTps);

    }
}


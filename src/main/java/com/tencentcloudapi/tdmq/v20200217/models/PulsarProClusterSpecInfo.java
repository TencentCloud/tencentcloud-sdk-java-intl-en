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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PulsarProClusterSpecInfo extends AbstractModel {

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
    * Maximum number of topics that can be created
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
    * 32 or 128.
Maximum number of partitions for topics in the current cluster.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxPartitions")
    @Expose
    private Long MaxPartitions;

    /**
    * Maximum delayed message count. 0 means no limit.	
    */
    @SerializedName("MaxDelayedMessages")
    @Expose
    private Long MaxDelayedMessages;

    /**
    * Maximum number of topic partitions that can be created
    */
    @SerializedName("MaxTopicsPartitioned")
    @Expose
    private Long MaxTopicsPartitioned;

    /**
    * Maximum number of connections per broker
    */
    @SerializedName("BrokerMaxConnections")
    @Expose
    private Long BrokerMaxConnections;

    /**
    * Maximum number of connections per IP
    */
    @SerializedName("BrokerMaxConnectionsPerIp")
    @Expose
    private Long BrokerMaxConnectionsPerIp;

    /**
    * Elastic storage cluster maximum storage specification; fixed storage is 0.
    */
    @SerializedName("MaximumElasticStorage")
    @Expose
    private Long MaximumElasticStorage;

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
     * Get Maximum number of topics that can be created 
     * @return MaxTopics Maximum number of topics that can be created
     */
    public Long getMaxTopics() {
        return this.MaxTopics;
    }

    /**
     * Set Maximum number of topics that can be created
     * @param MaxTopics Maximum number of topics that can be created
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

    /**
     * Get 32 or 128.
Maximum number of partitions for topics in the current cluster.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MaxPartitions 32 or 128.
Maximum number of partitions for topics in the current cluster.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxPartitions() {
        return this.MaxPartitions;
    }

    /**
     * Set 32 or 128.
Maximum number of partitions for topics in the current cluster.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MaxPartitions 32 or 128.
Maximum number of partitions for topics in the current cluster.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxPartitions(Long MaxPartitions) {
        this.MaxPartitions = MaxPartitions;
    }

    /**
     * Get Maximum delayed message count. 0 means no limit.	 
     * @return MaxDelayedMessages Maximum delayed message count. 0 means no limit.	
     */
    public Long getMaxDelayedMessages() {
        return this.MaxDelayedMessages;
    }

    /**
     * Set Maximum delayed message count. 0 means no limit.	
     * @param MaxDelayedMessages Maximum delayed message count. 0 means no limit.	
     */
    public void setMaxDelayedMessages(Long MaxDelayedMessages) {
        this.MaxDelayedMessages = MaxDelayedMessages;
    }

    /**
     * Get Maximum number of topic partitions that can be created 
     * @return MaxTopicsPartitioned Maximum number of topic partitions that can be created
     */
    public Long getMaxTopicsPartitioned() {
        return this.MaxTopicsPartitioned;
    }

    /**
     * Set Maximum number of topic partitions that can be created
     * @param MaxTopicsPartitioned Maximum number of topic partitions that can be created
     */
    public void setMaxTopicsPartitioned(Long MaxTopicsPartitioned) {
        this.MaxTopicsPartitioned = MaxTopicsPartitioned;
    }

    /**
     * Get Maximum number of connections per broker 
     * @return BrokerMaxConnections Maximum number of connections per broker
     */
    public Long getBrokerMaxConnections() {
        return this.BrokerMaxConnections;
    }

    /**
     * Set Maximum number of connections per broker
     * @param BrokerMaxConnections Maximum number of connections per broker
     */
    public void setBrokerMaxConnections(Long BrokerMaxConnections) {
        this.BrokerMaxConnections = BrokerMaxConnections;
    }

    /**
     * Get Maximum number of connections per IP 
     * @return BrokerMaxConnectionsPerIp Maximum number of connections per IP
     */
    public Long getBrokerMaxConnectionsPerIp() {
        return this.BrokerMaxConnectionsPerIp;
    }

    /**
     * Set Maximum number of connections per IP
     * @param BrokerMaxConnectionsPerIp Maximum number of connections per IP
     */
    public void setBrokerMaxConnectionsPerIp(Long BrokerMaxConnectionsPerIp) {
        this.BrokerMaxConnectionsPerIp = BrokerMaxConnectionsPerIp;
    }

    /**
     * Get Elastic storage cluster maximum storage specification; fixed storage is 0. 
     * @return MaximumElasticStorage Elastic storage cluster maximum storage specification; fixed storage is 0.
     */
    public Long getMaximumElasticStorage() {
        return this.MaximumElasticStorage;
    }

    /**
     * Set Elastic storage cluster maximum storage specification; fixed storage is 0.
     * @param MaximumElasticStorage Elastic storage cluster maximum storage specification; fixed storage is 0.
     */
    public void setMaximumElasticStorage(Long MaximumElasticStorage) {
        this.MaximumElasticStorage = MaximumElasticStorage;
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
        if (source.MaxPartitions != null) {
            this.MaxPartitions = new Long(source.MaxPartitions);
        }
        if (source.MaxDelayedMessages != null) {
            this.MaxDelayedMessages = new Long(source.MaxDelayedMessages);
        }
        if (source.MaxTopicsPartitioned != null) {
            this.MaxTopicsPartitioned = new Long(source.MaxTopicsPartitioned);
        }
        if (source.BrokerMaxConnections != null) {
            this.BrokerMaxConnections = new Long(source.BrokerMaxConnections);
        }
        if (source.BrokerMaxConnectionsPerIp != null) {
            this.BrokerMaxConnectionsPerIp = new Long(source.BrokerMaxConnectionsPerIp);
        }
        if (source.MaximumElasticStorage != null) {
            this.MaximumElasticStorage = new Long(source.MaximumElasticStorage);
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
        this.setParamSimple(map, prefix + "MaxPartitions", this.MaxPartitions);
        this.setParamSimple(map, prefix + "MaxDelayedMessages", this.MaxDelayedMessages);
        this.setParamSimple(map, prefix + "MaxTopicsPartitioned", this.MaxTopicsPartitioned);
        this.setParamSimple(map, prefix + "BrokerMaxConnections", this.BrokerMaxConnections);
        this.setParamSimple(map, prefix + "BrokerMaxConnectionsPerIp", this.BrokerMaxConnectionsPerIp);
        this.setParamSimple(map, prefix + "MaximumElasticStorage", this.MaximumElasticStorage);

    }
}


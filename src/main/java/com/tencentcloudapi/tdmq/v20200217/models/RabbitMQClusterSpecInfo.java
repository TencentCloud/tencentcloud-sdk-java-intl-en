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

public class RabbitMQClusterSpecInfo extends AbstractModel {

    /**
    * Cluster Specification Name
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * Number of Nodes
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * Peak tps
    */
    @SerializedName("MaxTps")
    @Expose
    private Long MaxTps;

    /**
    * Peak bandwidth Unit: mbps
    */
    @SerializedName("MaxBandWidth")
    @Expose
    private Long MaxBandWidth;

    /**
    * Storage capacity Unit: GB
    */
    @SerializedName("MaxStorage")
    @Expose
    private Long MaxStorage;

    /**
    * public network bandwidth tps. Unit: Mbps
    */
    @SerializedName("PublicNetworkTps")
    @Expose
    private Long PublicNetworkTps;

    /**
     * Get Cluster Specification Name 
     * @return SpecName Cluster Specification Name
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set Cluster Specification Name
     * @param SpecName Cluster Specification Name
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * Get Number of Nodes 
     * @return NodeCount Number of Nodes
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set Number of Nodes
     * @param NodeCount Number of Nodes
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get Peak tps 
     * @return MaxTps Peak tps
     */
    public Long getMaxTps() {
        return this.MaxTps;
    }

    /**
     * Set Peak tps
     * @param MaxTps Peak tps
     */
    public void setMaxTps(Long MaxTps) {
        this.MaxTps = MaxTps;
    }

    /**
     * Get Peak bandwidth Unit: mbps 
     * @return MaxBandWidth Peak bandwidth Unit: mbps
     */
    public Long getMaxBandWidth() {
        return this.MaxBandWidth;
    }

    /**
     * Set Peak bandwidth Unit: mbps
     * @param MaxBandWidth Peak bandwidth Unit: mbps
     */
    public void setMaxBandWidth(Long MaxBandWidth) {
        this.MaxBandWidth = MaxBandWidth;
    }

    /**
     * Get Storage capacity Unit: GB 
     * @return MaxStorage Storage capacity Unit: GB
     */
    public Long getMaxStorage() {
        return this.MaxStorage;
    }

    /**
     * Set Storage capacity Unit: GB
     * @param MaxStorage Storage capacity Unit: GB
     */
    public void setMaxStorage(Long MaxStorage) {
        this.MaxStorage = MaxStorage;
    }

    /**
     * Get public network bandwidth tps. Unit: Mbps 
     * @return PublicNetworkTps public network bandwidth tps. Unit: Mbps
     */
    public Long getPublicNetworkTps() {
        return this.PublicNetworkTps;
    }

    /**
     * Set public network bandwidth tps. Unit: Mbps
     * @param PublicNetworkTps public network bandwidth tps. Unit: Mbps
     */
    public void setPublicNetworkTps(Long PublicNetworkTps) {
        this.PublicNetworkTps = PublicNetworkTps;
    }

    public RabbitMQClusterSpecInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RabbitMQClusterSpecInfo(RabbitMQClusterSpecInfo source) {
        if (source.SpecName != null) {
            this.SpecName = new String(source.SpecName);
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
        if (source.MaxTps != null) {
            this.MaxTps = new Long(source.MaxTps);
        }
        if (source.MaxBandWidth != null) {
            this.MaxBandWidth = new Long(source.MaxBandWidth);
        }
        if (source.MaxStorage != null) {
            this.MaxStorage = new Long(source.MaxStorage);
        }
        if (source.PublicNetworkTps != null) {
            this.PublicNetworkTps = new Long(source.PublicNetworkTps);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpecName", this.SpecName);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "MaxTps", this.MaxTps);
        this.setParamSimple(map, prefix + "MaxBandWidth", this.MaxBandWidth);
        this.setParamSimple(map, prefix + "MaxStorage", this.MaxStorage);
        this.setParamSimple(map, prefix + "PublicNetworkTps", this.PublicNetworkTps);

    }
}


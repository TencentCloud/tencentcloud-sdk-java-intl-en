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
    * 
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * 
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * 
    */
    @SerializedName("MaxTps")
    @Expose
    private Long MaxTps;

    /**
    * 
    */
    @SerializedName("MaxBandWidth")
    @Expose
    private Long MaxBandWidth;

    /**
    * 
    */
    @SerializedName("MaxStorage")
    @Expose
    private Long MaxStorage;

    /**
    * 
    */
    @SerializedName("PublicNetworkTps")
    @Expose
    private Long PublicNetworkTps;

    /**
     * Get  
     * @return SpecName 
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set 
     * @param SpecName 
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * Get  
     * @return NodeCount 
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set 
     * @param NodeCount 
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get  
     * @return MaxTps 
     */
    public Long getMaxTps() {
        return this.MaxTps;
    }

    /**
     * Set 
     * @param MaxTps 
     */
    public void setMaxTps(Long MaxTps) {
        this.MaxTps = MaxTps;
    }

    /**
     * Get  
     * @return MaxBandWidth 
     */
    public Long getMaxBandWidth() {
        return this.MaxBandWidth;
    }

    /**
     * Set 
     * @param MaxBandWidth 
     */
    public void setMaxBandWidth(Long MaxBandWidth) {
        this.MaxBandWidth = MaxBandWidth;
    }

    /**
     * Get  
     * @return MaxStorage 
     */
    public Long getMaxStorage() {
        return this.MaxStorage;
    }

    /**
     * Set 
     * @param MaxStorage 
     */
    public void setMaxStorage(Long MaxStorage) {
        this.MaxStorage = MaxStorage;
    }

    /**
     * Get  
     * @return PublicNetworkTps 
     */
    public Long getPublicNetworkTps() {
        return this.PublicNetworkTps;
    }

    /**
     * Set 
     * @param PublicNetworkTps 
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


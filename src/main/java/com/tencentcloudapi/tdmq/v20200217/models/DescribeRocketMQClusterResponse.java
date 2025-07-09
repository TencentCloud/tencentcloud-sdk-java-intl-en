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

public class DescribeRocketMQClusterResponse extends AbstractModel {

    /**
    * Cluster information
    */
    @SerializedName("ClusterInfo")
    @Expose
    private RocketMQClusterInfo ClusterInfo;

    /**
    * Cluster configuration
    */
    @SerializedName("ClusterConfig")
    @Expose
    private RocketMQClusterConfig ClusterConfig;

    /**
    * Recent cluster usage
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterStats")
    @Expose
    private RocketMQClusterRecentStats ClusterStats;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Cluster information 
     * @return ClusterInfo Cluster information
     */
    public RocketMQClusterInfo getClusterInfo() {
        return this.ClusterInfo;
    }

    /**
     * Set Cluster information
     * @param ClusterInfo Cluster information
     */
    public void setClusterInfo(RocketMQClusterInfo ClusterInfo) {
        this.ClusterInfo = ClusterInfo;
    }

    /**
     * Get Cluster configuration 
     * @return ClusterConfig Cluster configuration
     */
    public RocketMQClusterConfig getClusterConfig() {
        return this.ClusterConfig;
    }

    /**
     * Set Cluster configuration
     * @param ClusterConfig Cluster configuration
     */
    public void setClusterConfig(RocketMQClusterConfig ClusterConfig) {
        this.ClusterConfig = ClusterConfig;
    }

    /**
     * Get Recent cluster usage
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ClusterStats Recent cluster usage
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public RocketMQClusterRecentStats getClusterStats() {
        return this.ClusterStats;
    }

    /**
     * Set Recent cluster usage
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ClusterStats Recent cluster usage
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setClusterStats(RocketMQClusterRecentStats ClusterStats) {
        this.ClusterStats = ClusterStats;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeRocketMQClusterResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRocketMQClusterResponse(DescribeRocketMQClusterResponse source) {
        if (source.ClusterInfo != null) {
            this.ClusterInfo = new RocketMQClusterInfo(source.ClusterInfo);
        }
        if (source.ClusterConfig != null) {
            this.ClusterConfig = new RocketMQClusterConfig(source.ClusterConfig);
        }
        if (source.ClusterStats != null) {
            this.ClusterStats = new RocketMQClusterRecentStats(source.ClusterStats);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ClusterInfo.", this.ClusterInfo);
        this.setParamObj(map, prefix + "ClusterConfig.", this.ClusterConfig);
        this.setParamObj(map, prefix + "ClusterStats.", this.ClusterStats);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceShardsResponse extends AbstractModel {

    /**
    * List information of the instance shards, which includes  node information, node ID, key count, used capacity, and capacity slope.
    */
    @SerializedName("InstanceShards")
    @Expose
    private InstanceClusterShard [] InstanceShards;

    /**
    * Number of instance shard nodes
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get List information of the instance shards, which includes  node information, node ID, key count, used capacity, and capacity slope. 
     * @return InstanceShards List information of the instance shards, which includes  node information, node ID, key count, used capacity, and capacity slope.
     */
    public InstanceClusterShard [] getInstanceShards() {
        return this.InstanceShards;
    }

    /**
     * Set List information of the instance shards, which includes  node information, node ID, key count, used capacity, and capacity slope.
     * @param InstanceShards List information of the instance shards, which includes  node information, node ID, key count, used capacity, and capacity slope.
     */
    public void setInstanceShards(InstanceClusterShard [] InstanceShards) {
        this.InstanceShards = InstanceShards;
    }

    /**
     * Get Number of instance shard nodes 
     * @return TotalCount Number of instance shard nodes
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of instance shard nodes
     * @param TotalCount Number of instance shard nodes
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeInstanceShardsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceShardsResponse(DescribeInstanceShardsResponse source) {
        if (source.InstanceShards != null) {
            this.InstanceShards = new InstanceClusterShard[source.InstanceShards.length];
            for (int i = 0; i < source.InstanceShards.length; i++) {
                this.InstanceShards[i] = new InstanceClusterShard(source.InstanceShards[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "InstanceShards.", this.InstanceShards);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceNodeInfoResponse extends AbstractModel {

    /**
    * Total number of nodes
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Node information
    */
    @SerializedName("NodesInfo")
    @Expose
    private NodeInfo [] NodesInfo;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of nodes 
     * @return TotalCount Total number of nodes
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of nodes
     * @param TotalCount Total number of nodes
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Node information 
     * @return NodesInfo Node information
     */
    public NodeInfo [] getNodesInfo() {
        return this.NodesInfo;
    }

    /**
     * Set Node information
     * @param NodesInfo Node information
     */
    public void setNodesInfo(NodeInfo [] NodesInfo) {
        this.NodesInfo = NodesInfo;
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

    public DescribeInstanceNodeInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceNodeInfoResponse(DescribeInstanceNodeInfoResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.NodesInfo != null) {
            this.NodesInfo = new NodeInfo[source.NodesInfo.length];
            for (int i = 0; i < source.NodesInfo.length; i++) {
                this.NodesInfo[i] = new NodeInfo(source.NodesInfo[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "NodesInfo.", this.NodesInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


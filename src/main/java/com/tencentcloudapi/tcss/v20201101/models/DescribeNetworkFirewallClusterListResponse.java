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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNetworkFirewallClusterListResponse extends AbstractModel{

    /**
    * Total number of clusters
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Cluster details
    */
    @SerializedName("ClusterInfoList")
    @Expose
    private NetworkClusterInfoItem [] ClusterInfoList;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of clusters 
     * @return TotalCount Total number of clusters
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of clusters
     * @param TotalCount Total number of clusters
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Cluster details 
     * @return ClusterInfoList Cluster details
     */
    public NetworkClusterInfoItem [] getClusterInfoList() {
        return this.ClusterInfoList;
    }

    /**
     * Set Cluster details
     * @param ClusterInfoList Cluster details
     */
    public void setClusterInfoList(NetworkClusterInfoItem [] ClusterInfoList) {
        this.ClusterInfoList = ClusterInfoList;
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

    public DescribeNetworkFirewallClusterListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNetworkFirewallClusterListResponse(DescribeNetworkFirewallClusterListResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ClusterInfoList != null) {
            this.ClusterInfoList = new NetworkClusterInfoItem[source.ClusterInfoList.length];
            for (int i = 0; i < source.ClusterInfoList.length; i++) {
                this.ClusterInfoList[i] = new NetworkClusterInfoItem(source.ClusterInfoList[i]);
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
        this.setParamArrayObj(map, prefix + "ClusterInfoList.", this.ClusterInfoList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


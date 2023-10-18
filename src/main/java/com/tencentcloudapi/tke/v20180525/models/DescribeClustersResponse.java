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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClustersResponse extends AbstractModel {

    /**
    * Total number of clusters
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Cluster information list
    */
    @SerializedName("Clusters")
    @Expose
    private Cluster [] Clusters;

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
     * Get Cluster information list 
     * @return Clusters Cluster information list
     */
    public Cluster [] getClusters() {
        return this.Clusters;
    }

    /**
     * Set Cluster information list
     * @param Clusters Cluster information list
     */
    public void setClusters(Cluster [] Clusters) {
        this.Clusters = Clusters;
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

    public DescribeClustersResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClustersResponse(DescribeClustersResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Clusters != null) {
            this.Clusters = new Cluster[source.Clusters.length];
            for (int i = 0; i < source.Clusters.length; i++) {
                this.Clusters[i] = new Cluster(source.Clusters[i]);
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
        this.setParamArrayObj(map, prefix + "Clusters.", this.Clusters);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


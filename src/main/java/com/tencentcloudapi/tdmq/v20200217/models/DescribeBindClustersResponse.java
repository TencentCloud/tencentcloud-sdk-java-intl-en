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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBindClustersResponse extends AbstractModel {

    /**
    * The number of dedicated clusters
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * List of dedicated clusters
    */
    @SerializedName("ClusterSet")
    @Expose
    private BindCluster [] ClusterSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The number of dedicated clusters 
     * @return TotalCount The number of dedicated clusters
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set The number of dedicated clusters
     * @param TotalCount The number of dedicated clusters
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get List of dedicated clusters 
     * @return ClusterSet List of dedicated clusters
     */
    public BindCluster [] getClusterSet() {
        return this.ClusterSet;
    }

    /**
     * Set List of dedicated clusters
     * @param ClusterSet List of dedicated clusters
     */
    public void setClusterSet(BindCluster [] ClusterSet) {
        this.ClusterSet = ClusterSet;
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

    public DescribeBindClustersResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBindClustersResponse(DescribeBindClustersResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ClusterSet != null) {
            this.ClusterSet = new BindCluster[source.ClusterSet.length];
            for (int i = 0; i < source.ClusterSet.length; i++) {
                this.ClusterSet[i] = new BindCluster(source.ClusterSet[i]);
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
        this.setParamArrayObj(map, prefix + "ClusterSet.", this.ClusterSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


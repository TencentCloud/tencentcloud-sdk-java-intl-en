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
package com.tencentcloudapi.cdc.v20201214.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDedicatedClustersResponse extends AbstractModel {

    /**
    * List of CDCs that meet the conditions
    */
    @SerializedName("DedicatedClusterSet")
    @Expose
    private DedicatedCluster [] DedicatedClusterSet;

    /**
    * Total number of CDCs that meet the conditions
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
     * Get List of CDCs that meet the conditions 
     * @return DedicatedClusterSet List of CDCs that meet the conditions
     */
    public DedicatedCluster [] getDedicatedClusterSet() {
        return this.DedicatedClusterSet;
    }

    /**
     * Set List of CDCs that meet the conditions
     * @param DedicatedClusterSet List of CDCs that meet the conditions
     */
    public void setDedicatedClusterSet(DedicatedCluster [] DedicatedClusterSet) {
        this.DedicatedClusterSet = DedicatedClusterSet;
    }

    /**
     * Get Total number of CDCs that meet the conditions 
     * @return TotalCount Total number of CDCs that meet the conditions
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of CDCs that meet the conditions
     * @param TotalCount Total number of CDCs that meet the conditions
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

    public DescribeDedicatedClustersResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDedicatedClustersResponse(DescribeDedicatedClustersResponse source) {
        if (source.DedicatedClusterSet != null) {
            this.DedicatedClusterSet = new DedicatedCluster[source.DedicatedClusterSet.length];
            for (int i = 0; i < source.DedicatedClusterSet.length; i++) {
                this.DedicatedClusterSet[i] = new DedicatedCluster(source.DedicatedClusterSet[i]);
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
        this.setParamArrayObj(map, prefix + "DedicatedClusterSet.", this.DedicatedClusterSet);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


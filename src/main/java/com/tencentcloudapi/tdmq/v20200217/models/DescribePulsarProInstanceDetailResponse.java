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

public class DescribePulsarProInstanceDetailResponse extends AbstractModel {

    /**
    * Cluster information
    */
    @SerializedName("ClusterInfo")
    @Expose
    private PulsarProClusterInfo ClusterInfo;

    /**
    * Cluster network access point information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NetworkAccessPointInfos")
    @Expose
    private PulsarNetworkAccessPointInfo [] NetworkAccessPointInfos;

    /**
    * Cluster specification information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterSpecInfo")
    @Expose
    private PulsarProClusterSpecInfo ClusterSpecInfo;

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
    public PulsarProClusterInfo getClusterInfo() {
        return this.ClusterInfo;
    }

    /**
     * Set Cluster information
     * @param ClusterInfo Cluster information
     */
    public void setClusterInfo(PulsarProClusterInfo ClusterInfo) {
        this.ClusterInfo = ClusterInfo;
    }

    /**
     * Get Cluster network access point information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NetworkAccessPointInfos Cluster network access point information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public PulsarNetworkAccessPointInfo [] getNetworkAccessPointInfos() {
        return this.NetworkAccessPointInfos;
    }

    /**
     * Set Cluster network access point information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NetworkAccessPointInfos Cluster network access point information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNetworkAccessPointInfos(PulsarNetworkAccessPointInfo [] NetworkAccessPointInfos) {
        this.NetworkAccessPointInfos = NetworkAccessPointInfos;
    }

    /**
     * Get Cluster specification information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClusterSpecInfo Cluster specification information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public PulsarProClusterSpecInfo getClusterSpecInfo() {
        return this.ClusterSpecInfo;
    }

    /**
     * Set Cluster specification information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClusterSpecInfo Cluster specification information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClusterSpecInfo(PulsarProClusterSpecInfo ClusterSpecInfo) {
        this.ClusterSpecInfo = ClusterSpecInfo;
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

    public DescribePulsarProInstanceDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePulsarProInstanceDetailResponse(DescribePulsarProInstanceDetailResponse source) {
        if (source.ClusterInfo != null) {
            this.ClusterInfo = new PulsarProClusterInfo(source.ClusterInfo);
        }
        if (source.NetworkAccessPointInfos != null) {
            this.NetworkAccessPointInfos = new PulsarNetworkAccessPointInfo[source.NetworkAccessPointInfos.length];
            for (int i = 0; i < source.NetworkAccessPointInfos.length; i++) {
                this.NetworkAccessPointInfos[i] = new PulsarNetworkAccessPointInfo(source.NetworkAccessPointInfos[i]);
            }
        }
        if (source.ClusterSpecInfo != null) {
            this.ClusterSpecInfo = new PulsarProClusterSpecInfo(source.ClusterSpecInfo);
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
        this.setParamArrayObj(map, prefix + "NetworkAccessPointInfos.", this.NetworkAccessPointInfos);
        this.setParamObj(map, prefix + "ClusterSpecInfo.", this.ClusterSpecInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


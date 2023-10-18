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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePrometheusTargetsTMPRequest extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Cluster type
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Filters.
You can filter by `RawJob`, `Job`, `ServiceMonitor`, `PodMonitor`, or `Health`.
`Health` contains three values: `up`, `down`, `unknown`.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Cluster type 
     * @return ClusterType Cluster type
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set Cluster type
     * @param ClusterType Cluster type
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Filters.
You can filter by `RawJob`, `Job`, `ServiceMonitor`, `PodMonitor`, or `Health`.
`Health` contains three values: `up`, `down`, `unknown`. 
     * @return Filters Filters.
You can filter by `RawJob`, `Job`, `ServiceMonitor`, `PodMonitor`, or `Health`.
`Health` contains three values: `up`, `down`, `unknown`.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filters.
You can filter by `RawJob`, `Job`, `ServiceMonitor`, `PodMonitor`, or `Health`.
`Health` contains three values: `up`, `down`, `unknown`.
     * @param Filters Filters.
You can filter by `RawJob`, `Job`, `ServiceMonitor`, `PodMonitor`, or `Health`.
`Health` contains three values: `up`, `down`, `unknown`.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribePrometheusTargetsTMPRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePrometheusTargetsTMPRequest(DescribePrometheusTargetsTMPRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}


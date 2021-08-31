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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterInstancesRequest extends AbstractModel{

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Offset. Default value: 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Maximum number of output entries. Default value: 20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * List of instance IDs to be obtained. This parameter is empty by default, which indicates that all instances in the cluster will be pulled.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Node role. Valid values are MASTER, WORKER, ETCD, MASTER_ETCD, and ALL. Default value: WORKER.
    */
    @SerializedName("InstanceRole")
    @Expose
    private String InstanceRole;

    /**
    * Filters include `nodepool-id` and `nodepool-instance-type` (how the instance is added to the pool). For `nodepool-instance-type`, the values can be `MANUALLY_ADDED`, `AUTOSCALING_ADDED` and `ALL`.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

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
     * Get Offset. Default value: 0 
     * @return Offset Offset. Default value: 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: 0
     * @param Offset Offset. Default value: 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Maximum number of output entries. Default value: 20 
     * @return Limit Maximum number of output entries. Default value: 20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Maximum number of output entries. Default value: 20
     * @param Limit Maximum number of output entries. Default value: 20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get List of instance IDs to be obtained. This parameter is empty by default, which indicates that all instances in the cluster will be pulled. 
     * @return InstanceIds List of instance IDs to be obtained. This parameter is empty by default, which indicates that all instances in the cluster will be pulled.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set List of instance IDs to be obtained. This parameter is empty by default, which indicates that all instances in the cluster will be pulled.
     * @param InstanceIds List of instance IDs to be obtained. This parameter is empty by default, which indicates that all instances in the cluster will be pulled.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Node role. Valid values are MASTER, WORKER, ETCD, MASTER_ETCD, and ALL. Default value: WORKER. 
     * @return InstanceRole Node role. Valid values are MASTER, WORKER, ETCD, MASTER_ETCD, and ALL. Default value: WORKER.
     */
    public String getInstanceRole() {
        return this.InstanceRole;
    }

    /**
     * Set Node role. Valid values are MASTER, WORKER, ETCD, MASTER_ETCD, and ALL. Default value: WORKER.
     * @param InstanceRole Node role. Valid values are MASTER, WORKER, ETCD, MASTER_ETCD, and ALL. Default value: WORKER.
     */
    public void setInstanceRole(String InstanceRole) {
        this.InstanceRole = InstanceRole;
    }

    /**
     * Get Filters include `nodepool-id` and `nodepool-instance-type` (how the instance is added to the pool). For `nodepool-instance-type`, the values can be `MANUALLY_ADDED`, `AUTOSCALING_ADDED` and `ALL`. 
     * @return Filters Filters include `nodepool-id` and `nodepool-instance-type` (how the instance is added to the pool). For `nodepool-instance-type`, the values can be `MANUALLY_ADDED`, `AUTOSCALING_ADDED` and `ALL`.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filters include `nodepool-id` and `nodepool-instance-type` (how the instance is added to the pool). For `nodepool-instance-type`, the values can be `MANUALLY_ADDED`, `AUTOSCALING_ADDED` and `ALL`.
     * @param Filters Filters include `nodepool-id` and `nodepool-instance-type` (how the instance is added to the pool). For `nodepool-instance-type`, the values can be `MANUALLY_ADDED`, `AUTOSCALING_ADDED` and `ALL`.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeClusterInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterInstancesRequest(DescribeClusterInstancesRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.InstanceRole != null) {
            this.InstanceRole = new String(source.InstanceRole);
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
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "InstanceRole", this.InstanceRole);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}


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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEdrAlertCountForContainerRequest extends AbstractModel {

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Cluster ID list (≤500); group statistics by cluster when non-empty and ContainerIds is empty</p>
    */
    @SerializedName("ClusterIds")
    @Expose
    private String [] ClusterIds;

    /**
    * <p>Container ID list (≤500); if not empty, group statistics by container (higher priority than ClusterIds)</p>
    */
    @SerializedName("ContainerIds")
    @Expose
    private String [] ContainerIds;

    /**
    * <li>PolicyType - int - Required: No - policy type</li><li>PolicyName - string - Required: No - Policy Name</li><li>Domain - string - Required: No - domain name (urlencode the domain name first, then base64)</li><li>PolicyAction- int - Required: No - policy action</li><li>IsEnabled - int - Required: No - whether it takes effect</li><li>ContainerId - string - Required: No - container ID (exact/IN, dimension filtering)</li><li>ClusterId - string - Required: No - Cluster ID (exact/IN, dimension filtering)</li><li>ClusterName - string - Required: No - cluster name (prefix blurry)</li><li>ContainerName - string - Required: No - Container name (prefix blurry)</li><li>AlertSource - string - Required: No - alarm source: HOST-host alarm / CONTAINER-container alarm. If not specified, return all</li>
    */
    @SerializedName("Filters")
    @Expose
    private EDRFilter [] Filters;

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>Cluster ID list (≤500); group statistics by cluster when non-empty and ContainerIds is empty</p> 
     * @return ClusterIds <p>Cluster ID list (≤500); group statistics by cluster when non-empty and ContainerIds is empty</p>
     */
    public String [] getClusterIds() {
        return this.ClusterIds;
    }

    /**
     * Set <p>Cluster ID list (≤500); group statistics by cluster when non-empty and ContainerIds is empty</p>
     * @param ClusterIds <p>Cluster ID list (≤500); group statistics by cluster when non-empty and ContainerIds is empty</p>
     */
    public void setClusterIds(String [] ClusterIds) {
        this.ClusterIds = ClusterIds;
    }

    /**
     * Get <p>Container ID list (≤500); if not empty, group statistics by container (higher priority than ClusterIds)</p> 
     * @return ContainerIds <p>Container ID list (≤500); if not empty, group statistics by container (higher priority than ClusterIds)</p>
     */
    public String [] getContainerIds() {
        return this.ContainerIds;
    }

    /**
     * Set <p>Container ID list (≤500); if not empty, group statistics by container (higher priority than ClusterIds)</p>
     * @param ContainerIds <p>Container ID list (≤500); if not empty, group statistics by container (higher priority than ClusterIds)</p>
     */
    public void setContainerIds(String [] ContainerIds) {
        this.ContainerIds = ContainerIds;
    }

    /**
     * Get <li>PolicyType - int - Required: No - policy type</li><li>PolicyName - string - Required: No - Policy Name</li><li>Domain - string - Required: No - domain name (urlencode the domain name first, then base64)</li><li>PolicyAction- int - Required: No - policy action</li><li>IsEnabled - int - Required: No - whether it takes effect</li><li>ContainerId - string - Required: No - container ID (exact/IN, dimension filtering)</li><li>ClusterId - string - Required: No - Cluster ID (exact/IN, dimension filtering)</li><li>ClusterName - string - Required: No - cluster name (prefix blurry)</li><li>ContainerName - string - Required: No - Container name (prefix blurry)</li><li>AlertSource - string - Required: No - alarm source: HOST-host alarm / CONTAINER-container alarm. If not specified, return all</li> 
     * @return Filters <li>PolicyType - int - Required: No - policy type</li><li>PolicyName - string - Required: No - Policy Name</li><li>Domain - string - Required: No - domain name (urlencode the domain name first, then base64)</li><li>PolicyAction- int - Required: No - policy action</li><li>IsEnabled - int - Required: No - whether it takes effect</li><li>ContainerId - string - Required: No - container ID (exact/IN, dimension filtering)</li><li>ClusterId - string - Required: No - Cluster ID (exact/IN, dimension filtering)</li><li>ClusterName - string - Required: No - cluster name (prefix blurry)</li><li>ContainerName - string - Required: No - Container name (prefix blurry)</li><li>AlertSource - string - Required: No - alarm source: HOST-host alarm / CONTAINER-container alarm. If not specified, return all</li>
     */
    public EDRFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <li>PolicyType - int - Required: No - policy type</li><li>PolicyName - string - Required: No - Policy Name</li><li>Domain - string - Required: No - domain name (urlencode the domain name first, then base64)</li><li>PolicyAction- int - Required: No - policy action</li><li>IsEnabled - int - Required: No - whether it takes effect</li><li>ContainerId - string - Required: No - container ID (exact/IN, dimension filtering)</li><li>ClusterId - string - Required: No - Cluster ID (exact/IN, dimension filtering)</li><li>ClusterName - string - Required: No - cluster name (prefix blurry)</li><li>ContainerName - string - Required: No - Container name (prefix blurry)</li><li>AlertSource - string - Required: No - alarm source: HOST-host alarm / CONTAINER-container alarm. If not specified, return all</li>
     * @param Filters <li>PolicyType - int - Required: No - policy type</li><li>PolicyName - string - Required: No - Policy Name</li><li>Domain - string - Required: No - domain name (urlencode the domain name first, then base64)</li><li>PolicyAction- int - Required: No - policy action</li><li>IsEnabled - int - Required: No - whether it takes effect</li><li>ContainerId - string - Required: No - container ID (exact/IN, dimension filtering)</li><li>ClusterId - string - Required: No - Cluster ID (exact/IN, dimension filtering)</li><li>ClusterName - string - Required: No - cluster name (prefix blurry)</li><li>ContainerName - string - Required: No - Container name (prefix blurry)</li><li>AlertSource - string - Required: No - alarm source: HOST-host alarm / CONTAINER-container alarm. If not specified, return all</li>
     */
    public void setFilters(EDRFilter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeEdrAlertCountForContainerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEdrAlertCountForContainerRequest(DescribeEdrAlertCountForContainerRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.ClusterIds != null) {
            this.ClusterIds = new String[source.ClusterIds.length];
            for (int i = 0; i < source.ClusterIds.length; i++) {
                this.ClusterIds[i] = new String(source.ClusterIds[i]);
            }
        }
        if (source.ContainerIds != null) {
            this.ContainerIds = new String[source.ContainerIds.length];
            for (int i = 0; i < source.ContainerIds.length; i++) {
                this.ContainerIds[i] = new String(source.ContainerIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new EDRFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new EDRFilter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArraySimple(map, prefix + "ClusterIds.", this.ClusterIds);
        this.setParamArraySimple(map, prefix + "ContainerIds.", this.ContainerIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}


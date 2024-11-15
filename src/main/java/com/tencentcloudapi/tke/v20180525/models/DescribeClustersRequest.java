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

public class DescribeClustersRequest extends AbstractModel {

    /**
    * Cluster ID list (When it is empty,
all clusters under the account will be obtained)
    */
    @SerializedName("ClusterIds")
    @Expose
    private String [] ClusterIds;

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
    * · "Name":"ClusterName","Values": ["test"] Filter by the [cluster name]. Type: String Required: No · "Name":"ClusterType","Values": ["MANAGED_CLUSTER"] Filter by the [cluster type]. Type: String Required: No · "Name":"ClusterStatus","Values": ["Running"] Filter by the [cluster status]. Type: String Required: No · "Name":"vpc-id","Values": ["vpc-123qajzs"] Filter by the [VPC]. Type: String Required: No · "Name":"tag-key","Values": ["testKey"] Filter by the [tag key]. Type: String Required: No · "Name":"tag-value","Values": ["testValue"] Filter by the [tag value]. Type: String Required: No · "Name":"Tags","Values": ["abc:1"] Filter by [key-value pairs of tags]. Type: String Required: No
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Cluster type, such as `MANAGED_CLUSTER`
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
     * Get Cluster ID list (When it is empty,
all clusters under the account will be obtained) 
     * @return ClusterIds Cluster ID list (When it is empty,
all clusters under the account will be obtained)
     */
    public String [] getClusterIds() {
        return this.ClusterIds;
    }

    /**
     * Set Cluster ID list (When it is empty,
all clusters under the account will be obtained)
     * @param ClusterIds Cluster ID list (When it is empty,
all clusters under the account will be obtained)
     */
    public void setClusterIds(String [] ClusterIds) {
        this.ClusterIds = ClusterIds;
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
     * Get · "Name":"ClusterName","Values": ["test"] Filter by the [cluster name]. Type: String Required: No · "Name":"ClusterType","Values": ["MANAGED_CLUSTER"] Filter by the [cluster type]. Type: String Required: No · "Name":"ClusterStatus","Values": ["Running"] Filter by the [cluster status]. Type: String Required: No · "Name":"vpc-id","Values": ["vpc-123qajzs"] Filter by the [VPC]. Type: String Required: No · "Name":"tag-key","Values": ["testKey"] Filter by the [tag key]. Type: String Required: No · "Name":"tag-value","Values": ["testValue"] Filter by the [tag value]. Type: String Required: No · "Name":"Tags","Values": ["abc:1"] Filter by [key-value pairs of tags]. Type: String Required: No 
     * @return Filters · "Name":"ClusterName","Values": ["test"] Filter by the [cluster name]. Type: String Required: No · "Name":"ClusterType","Values": ["MANAGED_CLUSTER"] Filter by the [cluster type]. Type: String Required: No · "Name":"ClusterStatus","Values": ["Running"] Filter by the [cluster status]. Type: String Required: No · "Name":"vpc-id","Values": ["vpc-123qajzs"] Filter by the [VPC]. Type: String Required: No · "Name":"tag-key","Values": ["testKey"] Filter by the [tag key]. Type: String Required: No · "Name":"tag-value","Values": ["testValue"] Filter by the [tag value]. Type: String Required: No · "Name":"Tags","Values": ["abc:1"] Filter by [key-value pairs of tags]. Type: String Required: No
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set · "Name":"ClusterName","Values": ["test"] Filter by the [cluster name]. Type: String Required: No · "Name":"ClusterType","Values": ["MANAGED_CLUSTER"] Filter by the [cluster type]. Type: String Required: No · "Name":"ClusterStatus","Values": ["Running"] Filter by the [cluster status]. Type: String Required: No · "Name":"vpc-id","Values": ["vpc-123qajzs"] Filter by the [VPC]. Type: String Required: No · "Name":"tag-key","Values": ["testKey"] Filter by the [tag key]. Type: String Required: No · "Name":"tag-value","Values": ["testValue"] Filter by the [tag value]. Type: String Required: No · "Name":"Tags","Values": ["abc:1"] Filter by [key-value pairs of tags]. Type: String Required: No
     * @param Filters · "Name":"ClusterName","Values": ["test"] Filter by the [cluster name]. Type: String Required: No · "Name":"ClusterType","Values": ["MANAGED_CLUSTER"] Filter by the [cluster type]. Type: String Required: No · "Name":"ClusterStatus","Values": ["Running"] Filter by the [cluster status]. Type: String Required: No · "Name":"vpc-id","Values": ["vpc-123qajzs"] Filter by the [VPC]. Type: String Required: No · "Name":"tag-key","Values": ["testKey"] Filter by the [tag key]. Type: String Required: No · "Name":"tag-value","Values": ["testValue"] Filter by the [tag value]. Type: String Required: No · "Name":"Tags","Values": ["abc:1"] Filter by [key-value pairs of tags]. Type: String Required: No
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Cluster type, such as `MANAGED_CLUSTER` 
     * @return ClusterType Cluster type, such as `MANAGED_CLUSTER`
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set Cluster type, such as `MANAGED_CLUSTER`
     * @param ClusterType Cluster type, such as `MANAGED_CLUSTER`
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    public DescribeClustersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClustersRequest(DescribeClustersRequest source) {
        if (source.ClusterIds != null) {
            this.ClusterIds = new String[source.ClusterIds.length];
            for (int i = 0; i < source.ClusterIds.length; i++) {
                this.ClusterIds[i] = new String(source.ClusterIds[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ClusterIds.", this.ClusterIds);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);

    }
}


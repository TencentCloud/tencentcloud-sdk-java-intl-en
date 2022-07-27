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

public class DescribeTKEEdgeClustersRequest extends AbstractModel{

    /**
    * Cluster ID list (when it is empty,
all clusters under the account are obtained)
    */
    @SerializedName("ClusterIds")
    @Expose
    private String [] ClusterIds;

    /**
    * Offset. Default value: `0`
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Maximum number of output entries. Default value: `20`
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filter condition (only filtering by a single ClusterName is supported)
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get Cluster ID list (when it is empty,
all clusters under the account are obtained) 
     * @return ClusterIds Cluster ID list (when it is empty,
all clusters under the account are obtained)
     */
    public String [] getClusterIds() {
        return this.ClusterIds;
    }

    /**
     * Set Cluster ID list (when it is empty,
all clusters under the account are obtained)
     * @param ClusterIds Cluster ID list (when it is empty,
all clusters under the account are obtained)
     */
    public void setClusterIds(String [] ClusterIds) {
        this.ClusterIds = ClusterIds;
    }

    /**
     * Get Offset. Default value: `0` 
     * @return Offset Offset. Default value: `0`
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: `0`
     * @param Offset Offset. Default value: `0`
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Maximum number of output entries. Default value: `20` 
     * @return Limit Maximum number of output entries. Default value: `20`
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Maximum number of output entries. Default value: `20`
     * @param Limit Maximum number of output entries. Default value: `20`
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filter condition (only filtering by a single ClusterName is supported) 
     * @return Filters Filter condition (only filtering by a single ClusterName is supported)
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter condition (only filtering by a single ClusterName is supported)
     * @param Filters Filter condition (only filtering by a single ClusterName is supported)
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeTKEEdgeClustersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTKEEdgeClustersRequest(DescribeTKEEdgeClustersRequest source) {
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ClusterIds.", this.ClusterIds);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}


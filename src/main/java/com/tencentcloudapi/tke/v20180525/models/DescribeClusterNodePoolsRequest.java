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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterNodePoolsRequest extends AbstractModel {

    /**
    * ClusterId (cluster ID)
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * · "Name":"NodePoolsName","Values": ["test"]
    Filter by [Node Pool Name].
    Type: String
        Required: No



·  "Name":"NodePoolsId","Values": ["np-d2mb2zb"]
    Filter by [Node Pool ID].
    Type: String
        Required: No



·  "Name":"Tags","Values": ["abc:1"]
    Filter by [Key-value Pairs of Tags].
    Type: String
        Required: No
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get ClusterId (cluster ID) 
     * @return ClusterId ClusterId (cluster ID)
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set ClusterId (cluster ID)
     * @param ClusterId ClusterId (cluster ID)
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get · "Name":"NodePoolsName","Values": ["test"]
    Filter by [Node Pool Name].
    Type: String
        Required: No



·  "Name":"NodePoolsId","Values": ["np-d2mb2zb"]
    Filter by [Node Pool ID].
    Type: String
        Required: No



·  "Name":"Tags","Values": ["abc:1"]
    Filter by [Key-value Pairs of Tags].
    Type: String
        Required: No 
     * @return Filters · "Name":"NodePoolsName","Values": ["test"]
    Filter by [Node Pool Name].
    Type: String
        Required: No



·  "Name":"NodePoolsId","Values": ["np-d2mb2zb"]
    Filter by [Node Pool ID].
    Type: String
        Required: No



·  "Name":"Tags","Values": ["abc:1"]
    Filter by [Key-value Pairs of Tags].
    Type: String
        Required: No
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set · "Name":"NodePoolsName","Values": ["test"]
    Filter by [Node Pool Name].
    Type: String
        Required: No



·  "Name":"NodePoolsId","Values": ["np-d2mb2zb"]
    Filter by [Node Pool ID].
    Type: String
        Required: No



·  "Name":"Tags","Values": ["abc:1"]
    Filter by [Key-value Pairs of Tags].
    Type: String
        Required: No
     * @param Filters · "Name":"NodePoolsName","Values": ["test"]
    Filter by [Node Pool Name].
    Type: String
        Required: No



·  "Name":"NodePoolsId","Values": ["np-d2mb2zb"]
    Filter by [Node Pool ID].
    Type: String
        Required: No



·  "Name":"Tags","Values": ["abc:1"]
    Filter by [Key-value Pairs of Tags].
    Type: String
        Required: No
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeClusterNodePoolsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterNodePoolsRequest(DescribeClusterNodePoolsRequest source) {
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
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}


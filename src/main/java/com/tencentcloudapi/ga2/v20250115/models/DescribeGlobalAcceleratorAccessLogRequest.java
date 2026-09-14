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
package com.tencentcloudapi.ga2.v20250115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGlobalAcceleratorAccessLogRequest extends AbstractModel {

    /**
    * <p>Unique Id of the ga instance</p>
    */
    @SerializedName("GlobalAcceleratorId")
    @Expose
    private String GlobalAcceleratorId;

    /**
    * <p>Query filter parameters. { &quot;Name&quot;: &quot;listener-id&quot;, &quot;Values&quot;: [&quot;listener unique id&quot;] },{ &quot;Name&quot;: &quot;endpoint-group-id&quot;, &quot;Values&quot;: [&quot;Terminal node group unique id&quot;] },{ &quot;Name&quot;: &quot;access_log_id&quot;, &quot;Values&quot;: [&quot;log unique id&quot;] }</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>Offset. Default value: 0.</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Number of returned results.</p><p>Value range: [0, 200]</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <p>Unique Id of the ga instance</p> 
     * @return GlobalAcceleratorId <p>Unique Id of the ga instance</p>
     */
    public String getGlobalAcceleratorId() {
        return this.GlobalAcceleratorId;
    }

    /**
     * Set <p>Unique Id of the ga instance</p>
     * @param GlobalAcceleratorId <p>Unique Id of the ga instance</p>
     */
    public void setGlobalAcceleratorId(String GlobalAcceleratorId) {
        this.GlobalAcceleratorId = GlobalAcceleratorId;
    }

    /**
     * Get <p>Query filter parameters. { &quot;Name&quot;: &quot;listener-id&quot;, &quot;Values&quot;: [&quot;listener unique id&quot;] },{ &quot;Name&quot;: &quot;endpoint-group-id&quot;, &quot;Values&quot;: [&quot;Terminal node group unique id&quot;] },{ &quot;Name&quot;: &quot;access_log_id&quot;, &quot;Values&quot;: [&quot;log unique id&quot;] }</p> 
     * @return Filters <p>Query filter parameters. { &quot;Name&quot;: &quot;listener-id&quot;, &quot;Values&quot;: [&quot;listener unique id&quot;] },{ &quot;Name&quot;: &quot;endpoint-group-id&quot;, &quot;Values&quot;: [&quot;Terminal node group unique id&quot;] },{ &quot;Name&quot;: &quot;access_log_id&quot;, &quot;Values&quot;: [&quot;log unique id&quot;] }</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Query filter parameters. { &quot;Name&quot;: &quot;listener-id&quot;, &quot;Values&quot;: [&quot;listener unique id&quot;] },{ &quot;Name&quot;: &quot;endpoint-group-id&quot;, &quot;Values&quot;: [&quot;Terminal node group unique id&quot;] },{ &quot;Name&quot;: &quot;access_log_id&quot;, &quot;Values&quot;: [&quot;log unique id&quot;] }</p>
     * @param Filters <p>Query filter parameters. { &quot;Name&quot;: &quot;listener-id&quot;, &quot;Values&quot;: [&quot;listener unique id&quot;] },{ &quot;Name&quot;: &quot;endpoint-group-id&quot;, &quot;Values&quot;: [&quot;Terminal node group unique id&quot;] },{ &quot;Name&quot;: &quot;access_log_id&quot;, &quot;Values&quot;: [&quot;log unique id&quot;] }</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>Offset. Default value: 0.</p> 
     * @return Offset <p>Offset. Default value: 0.</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Offset. Default value: 0.</p>
     * @param Offset <p>Offset. Default value: 0.</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Number of returned results.</p><p>Value range: [0, 200]</p> 
     * @return Limit <p>Number of returned results.</p><p>Value range: [0, 200]</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Number of returned results.</p><p>Value range: [0, 200]</p>
     * @param Limit <p>Number of returned results.</p><p>Value range: [0, 200]</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeGlobalAcceleratorAccessLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGlobalAcceleratorAccessLogRequest(DescribeGlobalAcceleratorAccessLogRequest source) {
        if (source.GlobalAcceleratorId != null) {
            this.GlobalAcceleratorId = new String(source.GlobalAcceleratorId);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GlobalAcceleratorId", this.GlobalAcceleratorId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}


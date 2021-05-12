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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeComputeEnvsRequest extends AbstractModel{

    /**
    * Compute environment ID
    */
    @SerializedName("EnvIds")
    @Expose
    private String [] EnvIds;

    /**
    * Filter.
<li> `zone` - String - Optional - Filter by availability zone.</li>
<li> `env-id` - String - Optional - Filter by compute environment ID.</li>
<li> `env-name` - String - Optional - Filter by compute environment name.</li>
<li> `resource-type` - String - Optional - Filter by compute resource type, which can be CVM or CPM (BM).</li>
<li> `tag-key` - String - Optional - Filter by tag key.</li>
</li>`tag-value` - String - Optional - Filter by tag value.</li>
<li> `tag:tag-key` - String - Optional - Filter by tag key-value pair. The tag-key should be replaced by a specified tag key.</li>
It cannot be specified together with the `EnvIds` parameter.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned results
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Compute environment ID 
     * @return EnvIds Compute environment ID
     */
    public String [] getEnvIds() {
        return this.EnvIds;
    }

    /**
     * Set Compute environment ID
     * @param EnvIds Compute environment ID
     */
    public void setEnvIds(String [] EnvIds) {
        this.EnvIds = EnvIds;
    }

    /**
     * Get Filter.
<li> `zone` - String - Optional - Filter by availability zone.</li>
<li> `env-id` - String - Optional - Filter by compute environment ID.</li>
<li> `env-name` - String - Optional - Filter by compute environment name.</li>
<li> `resource-type` - String - Optional - Filter by compute resource type, which can be CVM or CPM (BM).</li>
<li> `tag-key` - String - Optional - Filter by tag key.</li>
</li>`tag-value` - String - Optional - Filter by tag value.</li>
<li> `tag:tag-key` - String - Optional - Filter by tag key-value pair. The tag-key should be replaced by a specified tag key.</li>
It cannot be specified together with the `EnvIds` parameter. 
     * @return Filters Filter.
<li> `zone` - String - Optional - Filter by availability zone.</li>
<li> `env-id` - String - Optional - Filter by compute environment ID.</li>
<li> `env-name` - String - Optional - Filter by compute environment name.</li>
<li> `resource-type` - String - Optional - Filter by compute resource type, which can be CVM or CPM (BM).</li>
<li> `tag-key` - String - Optional - Filter by tag key.</li>
</li>`tag-value` - String - Optional - Filter by tag value.</li>
<li> `tag:tag-key` - String - Optional - Filter by tag key-value pair. The tag-key should be replaced by a specified tag key.</li>
It cannot be specified together with the `EnvIds` parameter.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter.
<li> `zone` - String - Optional - Filter by availability zone.</li>
<li> `env-id` - String - Optional - Filter by compute environment ID.</li>
<li> `env-name` - String - Optional - Filter by compute environment name.</li>
<li> `resource-type` - String - Optional - Filter by compute resource type, which can be CVM or CPM (BM).</li>
<li> `tag-key` - String - Optional - Filter by tag key.</li>
</li>`tag-value` - String - Optional - Filter by tag value.</li>
<li> `tag:tag-key` - String - Optional - Filter by tag key-value pair. The tag-key should be replaced by a specified tag key.</li>
It cannot be specified together with the `EnvIds` parameter.
     * @param Filters Filter.
<li> `zone` - String - Optional - Filter by availability zone.</li>
<li> `env-id` - String - Optional - Filter by compute environment ID.</li>
<li> `env-name` - String - Optional - Filter by compute environment name.</li>
<li> `resource-type` - String - Optional - Filter by compute resource type, which can be CVM or CPM (BM).</li>
<li> `tag-key` - String - Optional - Filter by tag key.</li>
</li>`tag-value` - String - Optional - Filter by tag value.</li>
<li> `tag:tag-key` - String - Optional - Filter by tag key-value pair. The tag-key should be replaced by a specified tag key.</li>
It cannot be specified together with the `EnvIds` parameter.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Offset 
     * @return Offset Offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset
     * @param Offset Offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned results 
     * @return Limit Number of returned results
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results
     * @param Limit Number of returned results
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeComputeEnvsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeComputeEnvsRequest(DescribeComputeEnvsRequest source) {
        if (source.EnvIds != null) {
            this.EnvIds = new String[source.EnvIds.length];
            for (int i = 0; i < source.EnvIds.length; i++) {
                this.EnvIds[i] = new String(source.EnvIds[i]);
            }
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
        this.setParamArraySimple(map, prefix + "EnvIds.", this.EnvIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}


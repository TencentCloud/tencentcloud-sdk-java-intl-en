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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConsolesRequest extends AbstractModel {

    /**
    * <p>Pagination offset. Default value: 0.</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Number of entries per page. Default value: 100. Maximum value: 100.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <li> DomainPrefix filters by [domain name prefix]. Type: String Required: No</li><li> ConsoleId filters by [DataSight instance ID]. Type: String Required: No</li><li> tagKey filters by [tag key]. Type: String Required: No</li><li> tag:tagKey filters by [tag key-value pair]. Replace tagKey with a specific tag key, such as tag:exampleKey. Type: String Required: No</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get <p>Pagination offset. Default value: 0.</p> 
     * @return Offset <p>Pagination offset. Default value: 0.</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Pagination offset. Default value: 0.</p>
     * @param Offset <p>Pagination offset. Default value: 0.</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Number of entries per page. Default value: 100. Maximum value: 100.</p> 
     * @return Limit <p>Number of entries per page. Default value: 100. Maximum value: 100.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Number of entries per page. Default value: 100. Maximum value: 100.</p>
     * @param Limit <p>Number of entries per page. Default value: 100. Maximum value: 100.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <li> DomainPrefix filters by [domain name prefix]. Type: String Required: No</li><li> ConsoleId filters by [DataSight instance ID]. Type: String Required: No</li><li> tagKey filters by [tag key]. Type: String Required: No</li><li> tag:tagKey filters by [tag key-value pair]. Replace tagKey with a specific tag key, such as tag:exampleKey. Type: String Required: No</li> 
     * @return Filters <li> DomainPrefix filters by [domain name prefix]. Type: String Required: No</li><li> ConsoleId filters by [DataSight instance ID]. Type: String Required: No</li><li> tagKey filters by [tag key]. Type: String Required: No</li><li> tag:tagKey filters by [tag key-value pair]. Replace tagKey with a specific tag key, such as tag:exampleKey. Type: String Required: No</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <li> DomainPrefix filters by [domain name prefix]. Type: String Required: No</li><li> ConsoleId filters by [DataSight instance ID]. Type: String Required: No</li><li> tagKey filters by [tag key]. Type: String Required: No</li><li> tag:tagKey filters by [tag key-value pair]. Replace tagKey with a specific tag key, such as tag:exampleKey. Type: String Required: No</li>
     * @param Filters <li> DomainPrefix filters by [domain name prefix]. Type: String Required: No</li><li> ConsoleId filters by [DataSight instance ID]. Type: String Required: No</li><li> tagKey filters by [tag key]. Type: String Required: No</li><li> tag:tagKey filters by [tag key-value pair]. Replace tagKey with a specific tag key, such as tag:exampleKey. Type: String Required: No</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeConsolesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConsolesRequest(DescribeConsolesRequest source) {
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
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}


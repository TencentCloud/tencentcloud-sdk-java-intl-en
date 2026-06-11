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

public class DescribeNetworkApplicationsRequest extends AbstractModel {

    /**
    * <p>Filter items</p><ul><li><p>name<br>Filter as [task name]. Query by fuzzy matching method.<br>Type: String<br>Required: No</p></li><li><p>networkAppId<br>Filter as [web application id].<br>Type: String<br>Required: No</p></li></ul><p>The maximum number of Filters per request is 10, and the maximum number of Filter.Values is 10.</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>Pagination offset. Default value: 0.</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Maximum number of entries per page. Default value: 20. Maximum value: 100.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <p>Filter items</p><ul><li><p>name<br>Filter as [task name]. Query by fuzzy matching method.<br>Type: String<br>Required: No</p></li><li><p>networkAppId<br>Filter as [web application id].<br>Type: String<br>Required: No</p></li></ul><p>The maximum number of Filters per request is 10, and the maximum number of Filter.Values is 10.</p> 
     * @return Filters <p>Filter items</p><ul><li><p>name<br>Filter as [task name]. Query by fuzzy matching method.<br>Type: String<br>Required: No</p></li><li><p>networkAppId<br>Filter as [web application id].<br>Type: String<br>Required: No</p></li></ul><p>The maximum number of Filters per request is 10, and the maximum number of Filter.Values is 10.</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Filter items</p><ul><li><p>name<br>Filter as [task name]. Query by fuzzy matching method.<br>Type: String<br>Required: No</p></li><li><p>networkAppId<br>Filter as [web application id].<br>Type: String<br>Required: No</p></li></ul><p>The maximum number of Filters per request is 10, and the maximum number of Filter.Values is 10.</p>
     * @param Filters <p>Filter items</p><ul><li><p>name<br>Filter as [task name]. Query by fuzzy matching method.<br>Type: String<br>Required: No</p></li><li><p>networkAppId<br>Filter as [web application id].<br>Type: String<br>Required: No</p></li></ul><p>The maximum number of Filters per request is 10, and the maximum number of Filter.Values is 10.</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

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
     * Get <p>Maximum number of entries per page. Default value: 20. Maximum value: 100.</p> 
     * @return Limit <p>Maximum number of entries per page. Default value: 20. Maximum value: 100.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Maximum number of entries per page. Default value: 20. Maximum value: 100.</p>
     * @param Limit <p>Maximum number of entries per page. Default value: 20. Maximum value: 100.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeNetworkApplicationsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNetworkApplicationsRequest(DescribeNetworkApplicationsRequest source) {
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
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}


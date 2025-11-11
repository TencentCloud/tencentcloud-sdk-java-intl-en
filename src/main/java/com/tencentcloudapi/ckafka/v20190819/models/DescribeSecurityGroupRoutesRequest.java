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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSecurityGroupRoutesRequest extends AbstractModel {

    /**
    * Specifies the routing information.
    */
    @SerializedName("InstanceRoute")
    @Expose
    private InstanceRoute InstanceRoute;

    /**
    * Filter.
    */
    @SerializedName("Filters")
    @Expose
    private RouteFilter [] Filters;

    /**
    * Specifies the pagination Offset. default is 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Pagination Limit. default: 20.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Keyword. specifies fuzzy search by instance id, instance name, or vip.
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
     * Get Specifies the routing information. 
     * @return InstanceRoute Specifies the routing information.
     */
    public InstanceRoute getInstanceRoute() {
        return this.InstanceRoute;
    }

    /**
     * Set Specifies the routing information.
     * @param InstanceRoute Specifies the routing information.
     */
    public void setInstanceRoute(InstanceRoute InstanceRoute) {
        this.InstanceRoute = InstanceRoute;
    }

    /**
     * Get Filter. 
     * @return Filters Filter.
     */
    public RouteFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter.
     * @param Filters Filter.
     */
    public void setFilters(RouteFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Specifies the pagination Offset. default is 0. 
     * @return Offset Specifies the pagination Offset. default is 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Specifies the pagination Offset. default is 0.
     * @param Offset Specifies the pagination Offset. default is 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Pagination Limit. default: 20. 
     * @return Limit Pagination Limit. default: 20.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Pagination Limit. default: 20.
     * @param Limit Pagination Limit. default: 20.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Keyword. specifies fuzzy search by instance id, instance name, or vip. 
     * @return SearchWord Keyword. specifies fuzzy search by instance id, instance name, or vip.
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set Keyword. specifies fuzzy search by instance id, instance name, or vip.
     * @param SearchWord Keyword. specifies fuzzy search by instance id, instance name, or vip.
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    public DescribeSecurityGroupRoutesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecurityGroupRoutesRequest(DescribeSecurityGroupRoutesRequest source) {
        if (source.InstanceRoute != null) {
            this.InstanceRoute = new InstanceRoute(source.InstanceRoute);
        }
        if (source.Filters != null) {
            this.Filters = new RouteFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new RouteFilter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.SearchWord != null) {
            this.SearchWord = new String(source.SearchWord);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "InstanceRoute.", this.InstanceRoute);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);

    }
}


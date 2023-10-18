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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeZonesRequest extends AbstractModel {

    /**
    * Pagination parameter, which specifies the offset.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Pagination parameter, which specifies the number of sites returned in each page.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Query condition filter, which supports complex type.
    */
    @SerializedName("Filters")
    @Expose
    private ZoneFilter [] Filters;

    /**
     * Get Pagination parameter, which specifies the offset. 
     * @return Offset Pagination parameter, which specifies the offset.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination parameter, which specifies the offset.
     * @param Offset Pagination parameter, which specifies the offset.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Pagination parameter, which specifies the number of sites returned in each page. 
     * @return Limit Pagination parameter, which specifies the number of sites returned in each page.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Pagination parameter, which specifies the number of sites returned in each page.
     * @param Limit Pagination parameter, which specifies the number of sites returned in each page.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Query condition filter, which supports complex type. 
     * @return Filters Query condition filter, which supports complex type.
     */
    public ZoneFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Query condition filter, which supports complex type.
     * @param Filters Query condition filter, which supports complex type.
     */
    public void setFilters(ZoneFilter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeZonesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeZonesRequest(DescribeZonesRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new ZoneFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new ZoneFilter(source.Filters[i]);
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


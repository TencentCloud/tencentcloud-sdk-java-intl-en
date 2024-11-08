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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEndPointListRequest extends AbstractModel {

    /**
    * Pagination offset, starting from 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Pagination limit. Maximum value: 100. Default value: 20.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filter parameters. Valid values: EndPointName, EndPointId, EndPointServiceId, and EndPointVip.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get Pagination offset, starting from 0. 
     * @return Offset Pagination offset, starting from 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset, starting from 0.
     * @param Offset Pagination offset, starting from 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Pagination limit. Maximum value: 100. Default value: 20. 
     * @return Limit Pagination limit. Maximum value: 100. Default value: 20.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Pagination limit. Maximum value: 100. Default value: 20.
     * @param Limit Pagination limit. Maximum value: 100. Default value: 20.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filter parameters. Valid values: EndPointName, EndPointId, EndPointServiceId, and EndPointVip. 
     * @return Filters Filter parameters. Valid values: EndPointName, EndPointId, EndPointServiceId, and EndPointVip.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter parameters. Valid values: EndPointName, EndPointId, EndPointServiceId, and EndPointVip.
     * @param Filters Filter parameters. Valid values: EndPointName, EndPointId, EndPointServiceId, and EndPointVip.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeEndPointListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEndPointListRequest(DescribeEndPointListRequest source) {
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


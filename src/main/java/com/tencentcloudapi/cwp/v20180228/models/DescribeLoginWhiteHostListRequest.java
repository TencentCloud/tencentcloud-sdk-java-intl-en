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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLoginWhiteHostListRequest extends AbstractModel {

    /**
    * Allowlist ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Number of results to be returned. Maximum value: 1000.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Filtering criteria <li>IpOrAlias - String - required: no - host IP or alias for filtering</li>
    */
    @SerializedName("Filters")
    @Expose
    private AssetFilters [] Filters;

    /**
     * Get Allowlist ID 
     * @return Id Allowlist ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Allowlist ID
     * @param Id Allowlist ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Number of results to be returned. Maximum value: 1000. 
     * @return Limit Number of results to be returned. Maximum value: 1000.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results to be returned. Maximum value: 1000.
     * @param Limit Number of results to be returned. Maximum value: 1000.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset. Default value: 0. 
     * @return Offset Offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: 0.
     * @param Offset Offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Filtering criteria <li>IpOrAlias - String - required: no - host IP or alias for filtering</li> 
     * @return Filters Filtering criteria <li>IpOrAlias - String - required: no - host IP or alias for filtering</li>
     */
    public AssetFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filtering criteria <li>IpOrAlias - String - required: no - host IP or alias for filtering</li>
     * @param Filters Filtering criteria <li>IpOrAlias - String - required: no - host IP or alias for filtering</li>
     */
    public void setFilters(AssetFilters [] Filters) {
        this.Filters = Filters;
    }

    public DescribeLoginWhiteHostListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLoginWhiteHostListRequest(DescribeLoginWhiteHostListRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new AssetFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AssetFilters(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}


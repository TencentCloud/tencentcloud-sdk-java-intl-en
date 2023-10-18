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

public class DescribeOriginGroupRequest extends AbstractModel {

    /**
    * Pagination parameter
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Pagination parameter
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filter parameters
    */
    @SerializedName("Filters")
    @Expose
    private OriginFilter [] Filters;

    /**
    * Site ID
If it’s not specified, all origin groups will be obtained.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
     * Get Pagination parameter 
     * @return Offset Pagination parameter
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination parameter
     * @param Offset Pagination parameter
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Pagination parameter 
     * @return Limit Pagination parameter
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Pagination parameter
     * @param Limit Pagination parameter
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filter parameters 
     * @return Filters Filter parameters
     */
    public OriginFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter parameters
     * @param Filters Filter parameters
     */
    public void setFilters(OriginFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Site ID
If it’s not specified, all origin groups will be obtained. 
     * @return ZoneId Site ID
If it’s not specified, all origin groups will be obtained.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Site ID
If it’s not specified, all origin groups will be obtained.
     * @param ZoneId Site ID
If it’s not specified, all origin groups will be obtained.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    public DescribeOriginGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOriginGroupRequest(DescribeOriginGroupRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new OriginFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new OriginFilter(source.Filters[i]);
            }
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);

    }
}


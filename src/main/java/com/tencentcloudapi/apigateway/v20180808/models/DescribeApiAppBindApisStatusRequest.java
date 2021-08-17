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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApiAppBindApisStatusRequest extends AbstractModel{

    /**
    * Application ID
    */
    @SerializedName("ApiAppId")
    @Expose
    private String ApiAppId;

    /**
    * Number of returned results. Default value: 20. Maximum value: 100.
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
    * Filter. Valid values: ApiId, ApiName, ServiceId, Environment, KeyWord (match with `name` or ID).
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get Application ID 
     * @return ApiAppId Application ID
     */
    public String getApiAppId() {
        return this.ApiAppId;
    }

    /**
     * Set Application ID
     * @param ApiAppId Application ID
     */
    public void setApiAppId(String ApiAppId) {
        this.ApiAppId = ApiAppId;
    }

    /**
     * Get Number of returned results. Default value: 20. Maximum value: 100. 
     * @return Limit Number of returned results. Default value: 20. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results. Default value: 20. Maximum value: 100.
     * @param Limit Number of returned results. Default value: 20. Maximum value: 100.
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
     * Get Filter. Valid values: ApiId, ApiName, ServiceId, Environment, KeyWord (match with `name` or ID). 
     * @return Filters Filter. Valid values: ApiId, ApiName, ServiceId, Environment, KeyWord (match with `name` or ID).
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter. Valid values: ApiId, ApiName, ServiceId, Environment, KeyWord (match with `name` or ID).
     * @param Filters Filter. Valid values: ApiId, ApiName, ServiceId, Environment, KeyWord (match with `name` or ID).
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeApiAppBindApisStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApiAppBindApisStatusRequest(DescribeApiAppBindApisStatusRequest source) {
        if (source.ApiAppId != null) {
            this.ApiAppId = new String(source.ApiAppId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
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
        this.setParamSimple(map, prefix + "ApiAppId", this.ApiAppId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}


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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApisStatusRequest extends AbstractModel {

    /**
    * Unique service ID of API.
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * Offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned results. Default value: 20. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * API filter. Valid values: `ApiId`, `ApiName`, `ApiPath`, `ApiType`, `AuthRelationApiId`, `AuthType`, `ApiBuniessType`, `NotUsagePlanId`, `Environment`, `Tags` (whose values are the list of `$tag_key:tag_value`), `TagKeys` (whose values are the list of tag keys). Note that `NotUsagePlanId` and `Environment` must be used in the same time.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get Unique service ID of API. 
     * @return ServiceId Unique service ID of API.
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set Unique service ID of API.
     * @param ServiceId Unique service ID of API.
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
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
     * Get API filter. Valid values: `ApiId`, `ApiName`, `ApiPath`, `ApiType`, `AuthRelationApiId`, `AuthType`, `ApiBuniessType`, `NotUsagePlanId`, `Environment`, `Tags` (whose values are the list of `$tag_key:tag_value`), `TagKeys` (whose values are the list of tag keys). Note that `NotUsagePlanId` and `Environment` must be used in the same time. 
     * @return Filters API filter. Valid values: `ApiId`, `ApiName`, `ApiPath`, `ApiType`, `AuthRelationApiId`, `AuthType`, `ApiBuniessType`, `NotUsagePlanId`, `Environment`, `Tags` (whose values are the list of `$tag_key:tag_value`), `TagKeys` (whose values are the list of tag keys). Note that `NotUsagePlanId` and `Environment` must be used in the same time.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set API filter. Valid values: `ApiId`, `ApiName`, `ApiPath`, `ApiType`, `AuthRelationApiId`, `AuthType`, `ApiBuniessType`, `NotUsagePlanId`, `Environment`, `Tags` (whose values are the list of `$tag_key:tag_value`), `TagKeys` (whose values are the list of tag keys). Note that `NotUsagePlanId` and `Environment` must be used in the same time.
     * @param Filters API filter. Valid values: `ApiId`, `ApiName`, `ApiPath`, `ApiType`, `AuthRelationApiId`, `AuthType`, `ApiBuniessType`, `NotUsagePlanId`, `Environment`, `Tags` (whose values are the list of `$tag_key:tag_value`), `TagKeys` (whose values are the list of tag keys). Note that `NotUsagePlanId` and `Environment` must be used in the same time.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeApisStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApisStatusRequest(DescribeApisStatusRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
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
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}


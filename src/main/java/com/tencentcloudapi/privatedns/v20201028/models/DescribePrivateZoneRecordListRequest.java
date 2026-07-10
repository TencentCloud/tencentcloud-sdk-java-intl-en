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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePrivateZoneRecordListRequest extends AbstractModel {

    /**
    * Private domain ID, which is in zone-xxxxxx format.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Filter parameters. (Valid values: Value and RecordType.)
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Pagination offset, starting from 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Pagination limit. Maximum value: 200. Default value: 20.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Private domain ID, which is in zone-xxxxxx format. 
     * @return ZoneId Private domain ID, which is in zone-xxxxxx format.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Private domain ID, which is in zone-xxxxxx format.
     * @param ZoneId Private domain ID, which is in zone-xxxxxx format.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Filter parameters. (Valid values: Value and RecordType.) 
     * @return Filters Filter parameters. (Valid values: Value and RecordType.)
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter parameters. (Valid values: Value and RecordType.)
     * @param Filters Filter parameters. (Valid values: Value and RecordType.)
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

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
     * Get Pagination limit. Maximum value: 200. Default value: 20. 
     * @return Limit Pagination limit. Maximum value: 200. Default value: 20.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Pagination limit. Maximum value: 200. Default value: 20.
     * @param Limit Pagination limit. Maximum value: 200. Default value: 20.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribePrivateZoneRecordListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePrivateZoneRecordListRequest(DescribePrivateZoneRecordListRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
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
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}


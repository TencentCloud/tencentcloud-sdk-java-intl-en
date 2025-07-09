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

public class DescribeAuditLogRequest extends AbstractModel {

    /**
    * Request volume statistics start time
    */
    @SerializedName("TimeRangeBegin")
    @Expose
    private String TimeRangeBegin;

    /**
    * Filter parameter. Valid values: ZoneId (private domain ID), Domain (private domain), OperatorUin (operator account ID)
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Request volume statistics end time
    */
    @SerializedName("TimeRangeEnd")
    @Expose
    private String TimeRangeEnd;

    /**
    * Pagination offset, starting from 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of entries per page. Maximum value: 100. Default value: 20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Request volume statistics start time 
     * @return TimeRangeBegin Request volume statistics start time
     */
    public String getTimeRangeBegin() {
        return this.TimeRangeBegin;
    }

    /**
     * Set Request volume statistics start time
     * @param TimeRangeBegin Request volume statistics start time
     */
    public void setTimeRangeBegin(String TimeRangeBegin) {
        this.TimeRangeBegin = TimeRangeBegin;
    }

    /**
     * Get Filter parameter. Valid values: ZoneId (private domain ID), Domain (private domain), OperatorUin (operator account ID) 
     * @return Filters Filter parameter. Valid values: ZoneId (private domain ID), Domain (private domain), OperatorUin (operator account ID)
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter parameter. Valid values: ZoneId (private domain ID), Domain (private domain), OperatorUin (operator account ID)
     * @param Filters Filter parameter. Valid values: ZoneId (private domain ID), Domain (private domain), OperatorUin (operator account ID)
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Request volume statistics end time 
     * @return TimeRangeEnd Request volume statistics end time
     */
    public String getTimeRangeEnd() {
        return this.TimeRangeEnd;
    }

    /**
     * Set Request volume statistics end time
     * @param TimeRangeEnd Request volume statistics end time
     */
    public void setTimeRangeEnd(String TimeRangeEnd) {
        this.TimeRangeEnd = TimeRangeEnd;
    }

    /**
     * Get Pagination offset, starting from 0 
     * @return Offset Pagination offset, starting from 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset, starting from 0
     * @param Offset Pagination offset, starting from 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of entries per page. Maximum value: 100. Default value: 20 
     * @return Limit Number of entries per page. Maximum value: 100. Default value: 20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of entries per page. Maximum value: 100. Default value: 20
     * @param Limit Number of entries per page. Maximum value: 100. Default value: 20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeAuditLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAuditLogRequest(DescribeAuditLogRequest source) {
        if (source.TimeRangeBegin != null) {
            this.TimeRangeBegin = new String(source.TimeRangeBegin);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.TimeRangeEnd != null) {
            this.TimeRangeEnd = new String(source.TimeRangeEnd);
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
        this.setParamSimple(map, prefix + "TimeRangeBegin", this.TimeRangeBegin);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "TimeRangeEnd", this.TimeRangeEnd);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}


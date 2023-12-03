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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePurgeTasksRequest extends AbstractModel {

    /**
    * ZoneId. 
The parameter is required.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Start time of the query.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time of the query.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Offset for paginated queries. Default value: `0`.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Limit on paginated queries. Default value: `20`. Maximum value: `1000`.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filtering condition. The maximum value of Filters.Values is 20. Detailed filtering conditions: <li>job-id<br>u2003u2003 Filter based on [<strong>task ID</strong>]. job-id format: 1379afjk91u32h. Multiple values are not supported. <br>u2003u2003 Type: String<br>u2003u2003 Required: No<br>u2003u2003 Fuzz query: Not supported.</li><li>target<br>u2003u2003 Filter based on: [strong>target resource information</strong>. target format: http://www.qq.com/1.txt or tag1. Multiple values are not supported.<br>u2003u2003 Type: String<br>u2003u2003 Required: No<br>u2003u2003 Fuzz query: Not supported.</li><li>domains<br>u2003u2003 Filter based on [<strong>domain name</strong>]. domains format: www.qq.com<br>u2003u2003 Type: String<br>u2003u2003 Required: No<br>u2003u2003 Fuzz query: Not supported. </li><li>statuses<br>u2003u2003 Filter based on <strong>task status</strong>.<br>u2003u2003 Required: No<br>u2003u2003 Fuzz query: Not supported. <br>u2003u2003 Options:<br>u2003u2003 processing: Processing<br>u2003u2003 success: Success<br>u2003u2003 failed: Failure<br>u2003u2003 timeout: Timeout</li><li>type<br>u2003u2003 Filter based on [<strong>cleared cache type</strong>]. Multiple values are not supported. <br>u2003u2003 Type: String<br>u2003u2003 Required: No<br>u2003u2003 Fuzz query: Not supported.<br>u2003u2003 Options:<br>u2003u2003 purge_url: URL<br>u2003u2003 purge_prefix: Prefix<br>u2003u2003 purge_all: All cache content<br>u2003u2003 purge_host: Hostname<br>u2003u2003 purge_cache_tag: CacheTag</li>
    */
    @SerializedName("Filters")
    @Expose
    private AdvancedFilter [] Filters;

    /**
     * Get ZoneId. 
The parameter is required. 
     * @return ZoneId ZoneId. 
The parameter is required.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set ZoneId. 
The parameter is required.
     * @param ZoneId ZoneId. 
The parameter is required.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Start time of the query. 
     * @return StartTime Start time of the query.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time of the query.
     * @param StartTime Start time of the query.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time of the query. 
     * @return EndTime End time of the query.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time of the query.
     * @param EndTime End time of the query.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Offset for paginated queries. Default value: `0`. 
     * @return Offset Offset for paginated queries. Default value: `0`.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset for paginated queries. Default value: `0`.
     * @param Offset Offset for paginated queries. Default value: `0`.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Limit on paginated queries. Default value: `20`. Maximum value: `1000`. 
     * @return Limit Limit on paginated queries. Default value: `20`. Maximum value: `1000`.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Limit on paginated queries. Default value: `20`. Maximum value: `1000`.
     * @param Limit Limit on paginated queries. Default value: `20`. Maximum value: `1000`.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filtering condition. The maximum value of Filters.Values is 20. Detailed filtering conditions: <li>job-id<br>u2003u2003 Filter based on [<strong>task ID</strong>]. job-id format: 1379afjk91u32h. Multiple values are not supported. <br>u2003u2003 Type: String<br>u2003u2003 Required: No<br>u2003u2003 Fuzz query: Not supported.</li><li>target<br>u2003u2003 Filter based on: [strong>target resource information</strong>. target format: http://www.qq.com/1.txt or tag1. Multiple values are not supported.<br>u2003u2003 Type: String<br>u2003u2003 Required: No<br>u2003u2003 Fuzz query: Not supported.</li><li>domains<br>u2003u2003 Filter based on [<strong>domain name</strong>]. domains format: www.qq.com<br>u2003u2003 Type: String<br>u2003u2003 Required: No<br>u2003u2003 Fuzz query: Not supported. </li><li>statuses<br>u2003u2003 Filter based on <strong>task status</strong>.<br>u2003u2003 Required: No<br>u2003u2003 Fuzz query: Not supported. <br>u2003u2003 Options:<br>u2003u2003 processing: Processing<br>u2003u2003 success: Success<br>u2003u2003 failed: Failure<br>u2003u2003 timeout: Timeout</li><li>type<br>u2003u2003 Filter based on [<strong>cleared cache type</strong>]. Multiple values are not supported. <br>u2003u2003 Type: String<br>u2003u2003 Required: No<br>u2003u2003 Fuzz query: Not supported.<br>u2003u2003 Options:<br>u2003u2003 purge_url: URL<br>u2003u2003 purge_prefix: Prefix<br>u2003u2003 purge_all: All cache content<br>u2003u2003 purge_host: Hostname<br>u2003u2003 purge_cache_tag: CacheTag</li> 
     * @return Filters Filtering condition. The maximum value of Filters.Values is 20. Detailed filtering conditions: <li>job-id<br>u2003u2003 Filter based on [<strong>task ID</strong>]. job-id format: 1379afjk91u32h. Multiple values are not supported. <br>u2003u2003 Type: String<br>u2003u2003 Required: No<br>u2003u2003 Fuzz query: Not supported.</li><li>target<br>u2003u2003 Filter based on: [strong>target resource information</strong>. target format: http://www.qq.com/1.txt or tag1. Multiple values are not supported.<br>u2003u2003 Type: String<br>u2003u2003 Required: No<br>u2003u2003 Fuzz query: Not supported.</li><li>domains<br>u2003u2003 Filter based on [<strong>domain name</strong>]. domains format: www.qq.com<br>u2003u2003 Type: String<br>u2003u2003 Required: No<br>u2003u2003 Fuzz query: Not supported. </li><li>statuses<br>u2003u2003 Filter based on <strong>task status</strong>.<br>u2003u2003 Required: No<br>u2003u2003 Fuzz query: Not supported. <br>u2003u2003 Options:<br>u2003u2003 processing: Processing<br>u2003u2003 success: Success<br>u2003u2003 failed: Failure<br>u2003u2003 timeout: Timeout</li><li>type<br>u2003u2003 Filter based on [<strong>cleared cache type</strong>]. Multiple values are not supported. <br>u2003u2003 Type: String<br>u2003u2003 Required: No<br>u2003u2003 Fuzz query: Not supported.<br>u2003u2003 Options:<br>u2003u2003 purge_url: URL<br>u2003u2003 purge_prefix: Prefix<br>u2003u2003 purge_all: All cache content<br>u2003u2003 purge_host: Hostname<br>u2003u2003 purge_cache_tag: CacheTag</li>
     */
    public AdvancedFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filtering condition. The maximum value of Filters.Values is 20. Detailed filtering conditions: <li>job-id<br>u2003u2003 Filter based on [<strong>task ID</strong>]. job-id format: 1379afjk91u32h. Multiple values are not supported. <br>u2003u2003 Type: String<br>u2003u2003 Required: No<br>u2003u2003 Fuzz query: Not supported.</li><li>target<br>u2003u2003 Filter based on: [strong>target resource information</strong>. target format: http://www.qq.com/1.txt or tag1. Multiple values are not supported.<br>u2003u2003 Type: String<br>u2003u2003 Required: No<br>u2003u2003 Fuzz query: Not supported.</li><li>domains<br>u2003u2003 Filter based on [<strong>domain name</strong>]. domains format: www.qq.com<br>u2003u2003 Type: String<br>u2003u2003 Required: No<br>u2003u2003 Fuzz query: Not supported. </li><li>statuses<br>u2003u2003 Filter based on <strong>task status</strong>.<br>u2003u2003 Required: No<br>u2003u2003 Fuzz query: Not supported. <br>u2003u2003 Options:<br>u2003u2003 processing: Processing<br>u2003u2003 success: Success<br>u2003u2003 failed: Failure<br>u2003u2003 timeout: Timeout</li><li>type<br>u2003u2003 Filter based on [<strong>cleared cache type</strong>]. Multiple values are not supported. <br>u2003u2003 Type: String<br>u2003u2003 Required: No<br>u2003u2003 Fuzz query: Not supported.<br>u2003u2003 Options:<br>u2003u2003 purge_url: URL<br>u2003u2003 purge_prefix: Prefix<br>u2003u2003 purge_all: All cache content<br>u2003u2003 purge_host: Hostname<br>u2003u2003 purge_cache_tag: CacheTag</li>
     * @param Filters Filtering condition. The maximum value of Filters.Values is 20. Detailed filtering conditions: <li>job-id<br>u2003u2003 Filter based on [<strong>task ID</strong>]. job-id format: 1379afjk91u32h. Multiple values are not supported. <br>u2003u2003 Type: String<br>u2003u2003 Required: No<br>u2003u2003 Fuzz query: Not supported.</li><li>target<br>u2003u2003 Filter based on: [strong>target resource information</strong>. target format: http://www.qq.com/1.txt or tag1. Multiple values are not supported.<br>u2003u2003 Type: String<br>u2003u2003 Required: No<br>u2003u2003 Fuzz query: Not supported.</li><li>domains<br>u2003u2003 Filter based on [<strong>domain name</strong>]. domains format: www.qq.com<br>u2003u2003 Type: String<br>u2003u2003 Required: No<br>u2003u2003 Fuzz query: Not supported. </li><li>statuses<br>u2003u2003 Filter based on <strong>task status</strong>.<br>u2003u2003 Required: No<br>u2003u2003 Fuzz query: Not supported. <br>u2003u2003 Options:<br>u2003u2003 processing: Processing<br>u2003u2003 success: Success<br>u2003u2003 failed: Failure<br>u2003u2003 timeout: Timeout</li><li>type<br>u2003u2003 Filter based on [<strong>cleared cache type</strong>]. Multiple values are not supported. <br>u2003u2003 Type: String<br>u2003u2003 Required: No<br>u2003u2003 Fuzz query: Not supported.<br>u2003u2003 Options:<br>u2003u2003 purge_url: URL<br>u2003u2003 purge_prefix: Prefix<br>u2003u2003 purge_all: All cache content<br>u2003u2003 purge_host: Hostname<br>u2003u2003 purge_cache_tag: CacheTag</li>
     */
    public void setFilters(AdvancedFilter [] Filters) {
        this.Filters = Filters;
    }

    public DescribePurgeTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePurgeTasksRequest(DescribePurgeTasksRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new AdvancedFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AdvancedFilter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}


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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRealtimeLogDeliveryTasksRequest extends AbstractModel {

    /**
    * Zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * The offset of paginated query. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * The limit of paginated query. Default value: 20. Maximum value: 1,000.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filter criteria. The maximum number of Filters.Values is 20. If this parameter is left empty, all real-time log delivery task information under the current zone-id will be returned. The detailed filter criteria are as follows:
<li>task-id: Filter by real-time log delivery task ID. Fuzzy queries are not supported.</li>
<li>task-name: filter by real-time log delivery task name. Fuzzy query is supported. When fuzzy search is used, only one real-time log delivery task name can be filled in.</li>
<li>entity-list: Filter by the entity corresponding to the real-time log delivery task. Fuzzy queries are not supported. Example: domain.example.com or sid-2s69eb5wcms7.</li>
<li>task-type: filter by real-time log delivery task type. Fuzzy queries are not supported. Options are as follows:<br>        cls: push to Tencent Cloud CLS;<br>        custom_endpoint: push to a custom HTTP(S) address;<br>        s3: push to an AWS S3-compatible bucket address;<br>        log_analysis: push to EdgeOne log analytics.</li>
    */
    @SerializedName("Filters")
    @Expose
    private AdvancedFilter [] Filters;

    /**
     * Get Zone ID. 
     * @return ZoneId Zone ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone ID.
     * @param ZoneId Zone ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get The offset of paginated query. Default value: 0. 
     * @return Offset The offset of paginated query. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set The offset of paginated query. Default value: 0.
     * @param Offset The offset of paginated query. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get The limit of paginated query. Default value: 20. Maximum value: 1,000. 
     * @return Limit The limit of paginated query. Default value: 20. Maximum value: 1,000.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The limit of paginated query. Default value: 20. Maximum value: 1,000.
     * @param Limit The limit of paginated query. Default value: 20. Maximum value: 1,000.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filter criteria. The maximum number of Filters.Values is 20. If this parameter is left empty, all real-time log delivery task information under the current zone-id will be returned. The detailed filter criteria are as follows:
<li>task-id: Filter by real-time log delivery task ID. Fuzzy queries are not supported.</li>
<li>task-name: filter by real-time log delivery task name. Fuzzy query is supported. When fuzzy search is used, only one real-time log delivery task name can be filled in.</li>
<li>entity-list: Filter by the entity corresponding to the real-time log delivery task. Fuzzy queries are not supported. Example: domain.example.com or sid-2s69eb5wcms7.</li>
<li>task-type: filter by real-time log delivery task type. Fuzzy queries are not supported. Options are as follows:<br>        cls: push to Tencent Cloud CLS;<br>        custom_endpoint: push to a custom HTTP(S) address;<br>        s3: push to an AWS S3-compatible bucket address;<br>        log_analysis: push to EdgeOne log analytics.</li> 
     * @return Filters Filter criteria. The maximum number of Filters.Values is 20. If this parameter is left empty, all real-time log delivery task information under the current zone-id will be returned. The detailed filter criteria are as follows:
<li>task-id: Filter by real-time log delivery task ID. Fuzzy queries are not supported.</li>
<li>task-name: filter by real-time log delivery task name. Fuzzy query is supported. When fuzzy search is used, only one real-time log delivery task name can be filled in.</li>
<li>entity-list: Filter by the entity corresponding to the real-time log delivery task. Fuzzy queries are not supported. Example: domain.example.com or sid-2s69eb5wcms7.</li>
<li>task-type: filter by real-time log delivery task type. Fuzzy queries are not supported. Options are as follows:<br>        cls: push to Tencent Cloud CLS;<br>        custom_endpoint: push to a custom HTTP(S) address;<br>        s3: push to an AWS S3-compatible bucket address;<br>        log_analysis: push to EdgeOne log analytics.</li>
     */
    public AdvancedFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria. The maximum number of Filters.Values is 20. If this parameter is left empty, all real-time log delivery task information under the current zone-id will be returned. The detailed filter criteria are as follows:
<li>task-id: Filter by real-time log delivery task ID. Fuzzy queries are not supported.</li>
<li>task-name: filter by real-time log delivery task name. Fuzzy query is supported. When fuzzy search is used, only one real-time log delivery task name can be filled in.</li>
<li>entity-list: Filter by the entity corresponding to the real-time log delivery task. Fuzzy queries are not supported. Example: domain.example.com or sid-2s69eb5wcms7.</li>
<li>task-type: filter by real-time log delivery task type. Fuzzy queries are not supported. Options are as follows:<br>        cls: push to Tencent Cloud CLS;<br>        custom_endpoint: push to a custom HTTP(S) address;<br>        s3: push to an AWS S3-compatible bucket address;<br>        log_analysis: push to EdgeOne log analytics.</li>
     * @param Filters Filter criteria. The maximum number of Filters.Values is 20. If this parameter is left empty, all real-time log delivery task information under the current zone-id will be returned. The detailed filter criteria are as follows:
<li>task-id: Filter by real-time log delivery task ID. Fuzzy queries are not supported.</li>
<li>task-name: filter by real-time log delivery task name. Fuzzy query is supported. When fuzzy search is used, only one real-time log delivery task name can be filled in.</li>
<li>entity-list: Filter by the entity corresponding to the real-time log delivery task. Fuzzy queries are not supported. Example: domain.example.com or sid-2s69eb5wcms7.</li>
<li>task-type: filter by real-time log delivery task type. Fuzzy queries are not supported. Options are as follows:<br>        cls: push to Tencent Cloud CLS;<br>        custom_endpoint: push to a custom HTTP(S) address;<br>        s3: push to an AWS S3-compatible bucket address;<br>        log_analysis: push to EdgeOne log analytics.</li>
     */
    public void setFilters(AdvancedFilter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeRealtimeLogDeliveryTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRealtimeLogDeliveryTasksRequest(DescribeRealtimeLogDeliveryTasksRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
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
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}


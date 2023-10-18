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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAlertRecordHistoryRequest extends AbstractModel {

    /**
    * Start time of the query range, which is a Unix timestamp in ms
    */
    @SerializedName("From")
    @Expose
    private Long From;

    /**
    * End time of the query range, which is a Unix timestamp in ms
    */
    @SerializedName("To")
    @Expose
    private Long To;

    /**
    * Page offset. Default value: 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Maximum number of entries per page. Maximum value: 100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * - alertId: Filter by alarm policy ID. Type: String; optional
- topicId: Filter by ID of monitored object. Type: String; optional
- status: Filter by alarm status. Type: String, optional. Valid values: `0` (uncleared), `1` (cleared), `2` (expired)
- alarmLevel: Filter by alarm severity. Type: String, optional. Valid values: `0` (Warn), `1` (Info), `2` (Critical)

Each request can have up to 10 `Filters` and 100 `Filter.Values`.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get Start time of the query range, which is a Unix timestamp in ms 
     * @return From Start time of the query range, which is a Unix timestamp in ms
     */
    public Long getFrom() {
        return this.From;
    }

    /**
     * Set Start time of the query range, which is a Unix timestamp in ms
     * @param From Start time of the query range, which is a Unix timestamp in ms
     */
    public void setFrom(Long From) {
        this.From = From;
    }

    /**
     * Get End time of the query range, which is a Unix timestamp in ms 
     * @return To End time of the query range, which is a Unix timestamp in ms
     */
    public Long getTo() {
        return this.To;
    }

    /**
     * Set End time of the query range, which is a Unix timestamp in ms
     * @param To End time of the query range, which is a Unix timestamp in ms
     */
    public void setTo(Long To) {
        this.To = To;
    }

    /**
     * Get Page offset. Default value: 0 
     * @return Offset Page offset. Default value: 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Page offset. Default value: 0
     * @param Offset Page offset. Default value: 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Maximum number of entries per page. Maximum value: 100 
     * @return Limit Maximum number of entries per page. Maximum value: 100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Maximum number of entries per page. Maximum value: 100
     * @param Limit Maximum number of entries per page. Maximum value: 100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get - alertId: Filter by alarm policy ID. Type: String; optional
- topicId: Filter by ID of monitored object. Type: String; optional
- status: Filter by alarm status. Type: String, optional. Valid values: `0` (uncleared), `1` (cleared), `2` (expired)
- alarmLevel: Filter by alarm severity. Type: String, optional. Valid values: `0` (Warn), `1` (Info), `2` (Critical)

Each request can have up to 10 `Filters` and 100 `Filter.Values`. 
     * @return Filters - alertId: Filter by alarm policy ID. Type: String; optional
- topicId: Filter by ID of monitored object. Type: String; optional
- status: Filter by alarm status. Type: String, optional. Valid values: `0` (uncleared), `1` (cleared), `2` (expired)
- alarmLevel: Filter by alarm severity. Type: String, optional. Valid values: `0` (Warn), `1` (Info), `2` (Critical)

Each request can have up to 10 `Filters` and 100 `Filter.Values`.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set - alertId: Filter by alarm policy ID. Type: String; optional
- topicId: Filter by ID of monitored object. Type: String; optional
- status: Filter by alarm status. Type: String, optional. Valid values: `0` (uncleared), `1` (cleared), `2` (expired)
- alarmLevel: Filter by alarm severity. Type: String, optional. Valid values: `0` (Warn), `1` (Info), `2` (Critical)

Each request can have up to 10 `Filters` and 100 `Filter.Values`.
     * @param Filters - alertId: Filter by alarm policy ID. Type: String; optional
- topicId: Filter by ID of monitored object. Type: String; optional
- status: Filter by alarm status. Type: String, optional. Valid values: `0` (uncleared), `1` (cleared), `2` (expired)
- alarmLevel: Filter by alarm severity. Type: String, optional. Valid values: `0` (Warn), `1` (Info), `2` (Critical)

Each request can have up to 10 `Filters` and 100 `Filter.Values`.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeAlertRecordHistoryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAlertRecordHistoryRequest(DescribeAlertRecordHistoryRequest source) {
        if (source.From != null) {
            this.From = new Long(source.From);
        }
        if (source.To != null) {
            this.To = new Long(source.To);
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
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "To", this.To);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}


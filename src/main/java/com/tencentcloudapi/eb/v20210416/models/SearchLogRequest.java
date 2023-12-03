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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchLogRequest extends AbstractModel {

    /**
    * Query start time (UNIX in ms)
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * Query end time (UNIX in ms)
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Event bus ID
    */
    @SerializedName("EventBusId")
    @Expose
    private String EventBusId;

    /**
    * Page number
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * Logs returned per page
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filter conditions
    */
    @SerializedName("Filter")
    @Expose
    private LogFilter [] Filter;

    /**
    * Sorting array
    */
    @SerializedName("OrderFields")
    @Expose
    private String [] OrderFields;

    /**
    * Sorting order. Values: `asc` (earliest first); `desc` (latest first)
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
     * Get Query start time (UNIX in ms) 
     * @return StartTime Query start time (UNIX in ms)
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Query start time (UNIX in ms)
     * @param StartTime Query start time (UNIX in ms)
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Query end time (UNIX in ms) 
     * @return EndTime Query end time (UNIX in ms)
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Query end time (UNIX in ms)
     * @param EndTime Query end time (UNIX in ms)
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Event bus ID 
     * @return EventBusId Event bus ID
     */
    public String getEventBusId() {
        return this.EventBusId;
    }

    /**
     * Set Event bus ID
     * @param EventBusId Event bus ID
     */
    public void setEventBusId(String EventBusId) {
        this.EventBusId = EventBusId;
    }

    /**
     * Get Page number 
     * @return Page Page number
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set Page number
     * @param Page Page number
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get Logs returned per page 
     * @return Limit Logs returned per page
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Logs returned per page
     * @param Limit Logs returned per page
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filter conditions 
     * @return Filter Filter conditions
     */
    public LogFilter [] getFilter() {
        return this.Filter;
    }

    /**
     * Set Filter conditions
     * @param Filter Filter conditions
     */
    public void setFilter(LogFilter [] Filter) {
        this.Filter = Filter;
    }

    /**
     * Get Sorting array 
     * @return OrderFields Sorting array
     */
    public String [] getOrderFields() {
        return this.OrderFields;
    }

    /**
     * Set Sorting array
     * @param OrderFields Sorting array
     */
    public void setOrderFields(String [] OrderFields) {
        this.OrderFields = OrderFields;
    }

    /**
     * Get Sorting order. Values: `asc` (earliest first); `desc` (latest first) 
     * @return OrderBy Sorting order. Values: `asc` (earliest first); `desc` (latest first)
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sorting order. Values: `asc` (earliest first); `desc` (latest first)
     * @param OrderBy Sorting order. Values: `asc` (earliest first); `desc` (latest first)
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    public SearchLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchLogRequest(SearchLogRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.EventBusId != null) {
            this.EventBusId = new String(source.EventBusId);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filter != null) {
            this.Filter = new LogFilter[source.Filter.length];
            for (int i = 0; i < source.Filter.length; i++) {
                this.Filter[i] = new LogFilter(source.Filter[i]);
            }
        }
        if (source.OrderFields != null) {
            this.OrderFields = new String[source.OrderFields.length];
            for (int i = 0; i < source.OrderFields.length; i++) {
                this.OrderFields[i] = new String(source.OrderFields[i]);
            }
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "EventBusId", this.EventBusId);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filter.", this.Filter);
        this.setParamArraySimple(map, prefix + "OrderFields.", this.OrderFields);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);

    }
}


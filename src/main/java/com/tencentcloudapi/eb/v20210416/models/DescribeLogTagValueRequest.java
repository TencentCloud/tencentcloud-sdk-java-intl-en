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

public class DescribeLogTagValueRequest extends AbstractModel {

    /**
    * The query start time.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * The query end time.
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
    * Aggregation field
    */
    @SerializedName("GroupField")
    @Expose
    private String GroupField;

    /**
    * Number of pages.
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
     * Get The query start time. 
     * @return StartTime The query start time.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set The query start time.
     * @param StartTime The query start time.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get The query end time. 
     * @return EndTime The query end time.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set The query end time.
     * @param EndTime The query end time.
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
     * Get Aggregation field 
     * @return GroupField Aggregation field
     */
    public String getGroupField() {
        return this.GroupField;
    }

    /**
     * Set Aggregation field
     * @param GroupField Aggregation field
     */
    public void setGroupField(String GroupField) {
        this.GroupField = GroupField;
    }

    /**
     * Get Number of pages. 
     * @return Page Number of pages.
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set Number of pages.
     * @param Page Number of pages.
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

    public DescribeLogTagValueRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLogTagValueRequest(DescribeLogTagValueRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.EventBusId != null) {
            this.EventBusId = new String(source.EventBusId);
        }
        if (source.GroupField != null) {
            this.GroupField = new String(source.GroupField);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "EventBusId", this.EventBusId);
        this.setParamSimple(map, prefix + "GroupField", this.GroupField);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filter.", this.Filter);

    }
}


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

public class DescribeLogSearchRequest extends AbstractModel {

    /**
    * Log start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Log end time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Service ID
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * Reserved field
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Number of logs to be returned at a time. Maximum value: 100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Subsequent content can be obtained based on the `ConText` returned last time. Up to 10,000 data entries can be obtained
    */
    @SerializedName("ConText")
    @Expose
    private String ConText;

    /**
    * Sorting by time. Valid values: asc (ascending), desc (descending). Default value: desc
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * Reserved field
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * Search criterion. Valid values:
req_id: "="
api_id: "="
cip: "="
uip: ":"
err_msg: ":"
rsp_st: "=", "!=", ":", ">", "<"
req_t: ">=", "<="

Note:
":" indicates included, and "!=" indicates not equal to. For the meanings of fields, please see the `LogSet` description of the output parameter
    */
    @SerializedName("LogQuerys")
    @Expose
    private LogQuery [] LogQuerys;

    /**
     * Get Log start time 
     * @return StartTime Log start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Log start time
     * @param StartTime Log start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Log end time 
     * @return EndTime Log end time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Log end time
     * @param EndTime Log end time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Service ID 
     * @return ServiceId Service ID
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set Service ID
     * @param ServiceId Service ID
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get Reserved field 
     * @return Filters Reserved field
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Reserved field
     * @param Filters Reserved field
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Number of logs to be returned at a time. Maximum value: 100 
     * @return Limit Number of logs to be returned at a time. Maximum value: 100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of logs to be returned at a time. Maximum value: 100
     * @param Limit Number of logs to be returned at a time. Maximum value: 100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Subsequent content can be obtained based on the `ConText` returned last time. Up to 10,000 data entries can be obtained 
     * @return ConText Subsequent content can be obtained based on the `ConText` returned last time. Up to 10,000 data entries can be obtained
     */
    public String getConText() {
        return this.ConText;
    }

    /**
     * Set Subsequent content can be obtained based on the `ConText` returned last time. Up to 10,000 data entries can be obtained
     * @param ConText Subsequent content can be obtained based on the `ConText` returned last time. Up to 10,000 data entries can be obtained
     */
    public void setConText(String ConText) {
        this.ConText = ConText;
    }

    /**
     * Get Sorting by time. Valid values: asc (ascending), desc (descending). Default value: desc 
     * @return Sort Sorting by time. Valid values: asc (ascending), desc (descending). Default value: desc
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set Sorting by time. Valid values: asc (ascending), desc (descending). Default value: desc
     * @param Sort Sorting by time. Valid values: asc (ascending), desc (descending). Default value: desc
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get Reserved field 
     * @return Query Reserved field
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set Reserved field
     * @param Query Reserved field
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get Search criterion. Valid values:
req_id: "="
api_id: "="
cip: "="
uip: ":"
err_msg: ":"
rsp_st: "=", "!=", ":", ">", "<"
req_t: ">=", "<="

Note:
":" indicates included, and "!=" indicates not equal to. For the meanings of fields, please see the `LogSet` description of the output parameter 
     * @return LogQuerys Search criterion. Valid values:
req_id: "="
api_id: "="
cip: "="
uip: ":"
err_msg: ":"
rsp_st: "=", "!=", ":", ">", "<"
req_t: ">=", "<="

Note:
":" indicates included, and "!=" indicates not equal to. For the meanings of fields, please see the `LogSet` description of the output parameter
     * @deprecated
     */
    @Deprecated
    public LogQuery [] getLogQuerys() {
        return this.LogQuerys;
    }

    /**
     * Set Search criterion. Valid values:
req_id: "="
api_id: "="
cip: "="
uip: ":"
err_msg: ":"
rsp_st: "=", "!=", ":", ">", "<"
req_t: ">=", "<="

Note:
":" indicates included, and "!=" indicates not equal to. For the meanings of fields, please see the `LogSet` description of the output parameter
     * @param LogQuerys Search criterion. Valid values:
req_id: "="
api_id: "="
cip: "="
uip: ":"
err_msg: ":"
rsp_st: "=", "!=", ":", ">", "<"
req_t: ">=", "<="

Note:
":" indicates included, and "!=" indicates not equal to. For the meanings of fields, please see the `LogSet` description of the output parameter
     * @deprecated
     */
    @Deprecated
    public void setLogQuerys(LogQuery [] LogQuerys) {
        this.LogQuerys = LogQuerys;
    }

    public DescribeLogSearchRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLogSearchRequest(DescribeLogSearchRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ConText != null) {
            this.ConText = new String(source.ConText);
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.LogQuerys != null) {
            this.LogQuerys = new LogQuery[source.LogQuerys.length];
            for (int i = 0; i < source.LogQuerys.length; i++) {
                this.LogQuerys[i] = new LogQuery(source.LogQuerys[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ConText", this.ConText);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamArrayObj(map, prefix + "LogQuerys.", this.LogQuerys);

    }
}


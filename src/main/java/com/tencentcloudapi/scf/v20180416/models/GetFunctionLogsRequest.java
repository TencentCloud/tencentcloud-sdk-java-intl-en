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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetFunctionLogsRequest extends AbstractModel {

    /**
    * Function name.
-To ensure compatibility of the [retrieve function execution log](https://www.tencentcloud.com/document/product/583/18583?from_cn_redirect=1) API `GetFunctionLogs`, the input parameter `FunctionName` remains an optional field, but it is recommended to fill in this parameter. Otherwise, log acquisition failure may occur.
- After associating a function with CLS, it is recommended to use the relevant CLS APIs (https://www.tencentcloud.com/document/product/614/16875?from_cn_redirect=1) to get the best log retrieval experience.
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * Offset of the data. Offset + Limit cannot be greater than 10000.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Length of the returned data. Offset + Limit cannot be greater than 10000.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Whether to sort logs in descending or ascending order. Available values: `desc` and `asc`.
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Sort logs by a certain field. The following fields are supported: function_name, duration, mem_usage, start_time
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Log filter criteria. It can be used to distinguish correct and error logs. filter.RetCode=not0 means only return error logs, filter.RetCode=is0 means only return correct logs. If not passed, all logs are returned.
    */
    @SerializedName("Filter")
    @Expose
    private LogFilter Filter;

    /**
    * Namespace of the function
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Function version
    */
    @SerializedName("Qualifier")
    @Expose
    private String Qualifier;

    /**
    * Request ID for executing the function
    */
    @SerializedName("FunctionRequestId")
    @Expose
    private String FunctionRequestId;

    /**
    * Specific date of the query, for example: 2017-05-16 20:00:00. It must differ from endtime by no more than one day.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Specific date of the query, for example: 2017-05-16 20:59:59. It must differ from startTime by no more than one day.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * This field is offline.
    */
    @SerializedName("SearchContext")
    @Expose
    private LogSearchContext SearchContext;

    /**
     * Get Function name.
-To ensure compatibility of the [retrieve function execution log](https://www.tencentcloud.com/document/product/583/18583?from_cn_redirect=1) API `GetFunctionLogs`, the input parameter `FunctionName` remains an optional field, but it is recommended to fill in this parameter. Otherwise, log acquisition failure may occur.
- After associating a function with CLS, it is recommended to use the relevant CLS APIs (https://www.tencentcloud.com/document/product/614/16875?from_cn_redirect=1) to get the best log retrieval experience. 
     * @return FunctionName Function name.
-To ensure compatibility of the [retrieve function execution log](https://www.tencentcloud.com/document/product/583/18583?from_cn_redirect=1) API `GetFunctionLogs`, the input parameter `FunctionName` remains an optional field, but it is recommended to fill in this parameter. Otherwise, log acquisition failure may occur.
- After associating a function with CLS, it is recommended to use the relevant CLS APIs (https://www.tencentcloud.com/document/product/614/16875?from_cn_redirect=1) to get the best log retrieval experience.
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set Function name.
-To ensure compatibility of the [retrieve function execution log](https://www.tencentcloud.com/document/product/583/18583?from_cn_redirect=1) API `GetFunctionLogs`, the input parameter `FunctionName` remains an optional field, but it is recommended to fill in this parameter. Otherwise, log acquisition failure may occur.
- After associating a function with CLS, it is recommended to use the relevant CLS APIs (https://www.tencentcloud.com/document/product/614/16875?from_cn_redirect=1) to get the best log retrieval experience.
     * @param FunctionName Function name.
-To ensure compatibility of the [retrieve function execution log](https://www.tencentcloud.com/document/product/583/18583?from_cn_redirect=1) API `GetFunctionLogs`, the input parameter `FunctionName` remains an optional field, but it is recommended to fill in this parameter. Otherwise, log acquisition failure may occur.
- After associating a function with CLS, it is recommended to use the relevant CLS APIs (https://www.tencentcloud.com/document/product/614/16875?from_cn_redirect=1) to get the best log retrieval experience.
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get Offset of the data. Offset + Limit cannot be greater than 10000. 
     * @return Offset Offset of the data. Offset + Limit cannot be greater than 10000.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset of the data. Offset + Limit cannot be greater than 10000.
     * @param Offset Offset of the data. Offset + Limit cannot be greater than 10000.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Length of the returned data. Offset + Limit cannot be greater than 10000. 
     * @return Limit Length of the returned data. Offset + Limit cannot be greater than 10000.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Length of the returned data. Offset + Limit cannot be greater than 10000.
     * @param Limit Length of the returned data. Offset + Limit cannot be greater than 10000.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Whether to sort logs in descending or ascending order. Available values: `desc` and `asc`. 
     * @return Order Whether to sort logs in descending or ascending order. Available values: `desc` and `asc`.
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Whether to sort logs in descending or ascending order. Available values: `desc` and `asc`.
     * @param Order Whether to sort logs in descending or ascending order. Available values: `desc` and `asc`.
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Sort logs by a certain field. The following fields are supported: function_name, duration, mem_usage, start_time 
     * @return OrderBy Sort logs by a certain field. The following fields are supported: function_name, duration, mem_usage, start_time
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sort logs by a certain field. The following fields are supported: function_name, duration, mem_usage, start_time
     * @param OrderBy Sort logs by a certain field. The following fields are supported: function_name, duration, mem_usage, start_time
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Log filter criteria. It can be used to distinguish correct and error logs. filter.RetCode=not0 means only return error logs, filter.RetCode=is0 means only return correct logs. If not passed, all logs are returned. 
     * @return Filter Log filter criteria. It can be used to distinguish correct and error logs. filter.RetCode=not0 means only return error logs, filter.RetCode=is0 means only return correct logs. If not passed, all logs are returned.
     */
    public LogFilter getFilter() {
        return this.Filter;
    }

    /**
     * Set Log filter criteria. It can be used to distinguish correct and error logs. filter.RetCode=not0 means only return error logs, filter.RetCode=is0 means only return correct logs. If not passed, all logs are returned.
     * @param Filter Log filter criteria. It can be used to distinguish correct and error logs. filter.RetCode=not0 means only return error logs, filter.RetCode=is0 means only return correct logs. If not passed, all logs are returned.
     */
    public void setFilter(LogFilter Filter) {
        this.Filter = Filter;
    }

    /**
     * Get Namespace of the function 
     * @return Namespace Namespace of the function
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Namespace of the function
     * @param Namespace Namespace of the function
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Function version 
     * @return Qualifier Function version
     */
    public String getQualifier() {
        return this.Qualifier;
    }

    /**
     * Set Function version
     * @param Qualifier Function version
     */
    public void setQualifier(String Qualifier) {
        this.Qualifier = Qualifier;
    }

    /**
     * Get Request ID for executing the function 
     * @return FunctionRequestId Request ID for executing the function
     */
    public String getFunctionRequestId() {
        return this.FunctionRequestId;
    }

    /**
     * Set Request ID for executing the function
     * @param FunctionRequestId Request ID for executing the function
     */
    public void setFunctionRequestId(String FunctionRequestId) {
        this.FunctionRequestId = FunctionRequestId;
    }

    /**
     * Get Specific date of the query, for example: 2017-05-16 20:00:00. It must differ from endtime by no more than one day. 
     * @return StartTime Specific date of the query, for example: 2017-05-16 20:00:00. It must differ from endtime by no more than one day.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Specific date of the query, for example: 2017-05-16 20:00:00. It must differ from endtime by no more than one day.
     * @param StartTime Specific date of the query, for example: 2017-05-16 20:00:00. It must differ from endtime by no more than one day.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Specific date of the query, for example: 2017-05-16 20:59:59. It must differ from startTime by no more than one day. 
     * @return EndTime Specific date of the query, for example: 2017-05-16 20:59:59. It must differ from startTime by no more than one day.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Specific date of the query, for example: 2017-05-16 20:59:59. It must differ from startTime by no more than one day.
     * @param EndTime Specific date of the query, for example: 2017-05-16 20:59:59. It must differ from startTime by no more than one day.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get This field is offline. 
     * @return SearchContext This field is offline.
     */
    public LogSearchContext getSearchContext() {
        return this.SearchContext;
    }

    /**
     * Set This field is offline.
     * @param SearchContext This field is offline.
     */
    public void setSearchContext(LogSearchContext SearchContext) {
        this.SearchContext = SearchContext;
    }

    public GetFunctionLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetFunctionLogsRequest(GetFunctionLogsRequest source) {
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.Filter != null) {
            this.Filter = new LogFilter(source.Filter);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Qualifier != null) {
            this.Qualifier = new String(source.Qualifier);
        }
        if (source.FunctionRequestId != null) {
            this.FunctionRequestId = new String(source.FunctionRequestId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.SearchContext != null) {
            this.SearchContext = new LogSearchContext(source.SearchContext);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamObj(map, prefix + "Filter.", this.Filter);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Qualifier", this.Qualifier);
        this.setParamSimple(map, prefix + "FunctionRequestId", this.FunctionRequestId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamObj(map, prefix + "SearchContext.", this.SearchContext);

    }
}


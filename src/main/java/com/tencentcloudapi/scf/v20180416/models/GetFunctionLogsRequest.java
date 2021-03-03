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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetFunctionLogsRequest extends AbstractModel{

    /**
    * Function name.
- To ensure the compatibility of the [`GetFunctionLogs`](https://intl.cloud.tencent.com/document/product/583/18583?from_cn_redirect=1) API, the input parameter `FunctionName` is optional, but we recommend you enter it; otherwise, log acquisition may fail.
- After the function is connected to CLS, we recommend you use the [related CLS API](https://intl.cloud.tencent.com/document/product/614/16875?from_cn_redirect=1) to get the best log retrieval experience.
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * Data offset. The addition of `Offset` and `Limit` cannot exceed 10,000.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Length of the return data. The addition of `Offset` and `Limit` cannot exceed 10,000.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * It specifies whether to sort the logs in an ascending or descending order. The value is `desc` or `asc`.
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * It specifies the sorting order of the logs based on a specified field, such as `function_name`, `duration`, `mem_usage`, and `start_time`.
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Log filter used to identify whether to return logs of successful or failed requests. `filter.RetCode=not0` indicates that only the logs of failed requests will be returned. `filter.RetCode=is0` indicates that only the logs of successful requests will be returned. If this parameter is left blank, all logs will be returned. 
    */
    @SerializedName("Filter")
    @Expose
    private LogFilter Filter;

    /**
    * Function namespace
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
    * RequestId corresponding to the executed function
    */
    @SerializedName("FunctionRequestId")
    @Expose
    private String FunctionRequestId;

    /**
    * Query date, for example, 2017-05-16 20:00:00. The date must be within one day of the end time.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Query date, for example, 2017-05-16 20:59:59. The date must be within one day of the start time.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * This field is disused.
    */
    @SerializedName("SearchContext")
    @Expose
    private LogSearchContext SearchContext;

    /**
     * Get Function name.
- To ensure the compatibility of the [`GetFunctionLogs`](https://intl.cloud.tencent.com/document/product/583/18583?from_cn_redirect=1) API, the input parameter `FunctionName` is optional, but we recommend you enter it; otherwise, log acquisition may fail.
- After the function is connected to CLS, we recommend you use the [related CLS API](https://intl.cloud.tencent.com/document/product/614/16875?from_cn_redirect=1) to get the best log retrieval experience. 
     * @return FunctionName Function name.
- To ensure the compatibility of the [`GetFunctionLogs`](https://intl.cloud.tencent.com/document/product/583/18583?from_cn_redirect=1) API, the input parameter `FunctionName` is optional, but we recommend you enter it; otherwise, log acquisition may fail.
- After the function is connected to CLS, we recommend you use the [related CLS API](https://intl.cloud.tencent.com/document/product/614/16875?from_cn_redirect=1) to get the best log retrieval experience.
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set Function name.
- To ensure the compatibility of the [`GetFunctionLogs`](https://intl.cloud.tencent.com/document/product/583/18583?from_cn_redirect=1) API, the input parameter `FunctionName` is optional, but we recommend you enter it; otherwise, log acquisition may fail.
- After the function is connected to CLS, we recommend you use the [related CLS API](https://intl.cloud.tencent.com/document/product/614/16875?from_cn_redirect=1) to get the best log retrieval experience.
     * @param FunctionName Function name.
- To ensure the compatibility of the [`GetFunctionLogs`](https://intl.cloud.tencent.com/document/product/583/18583?from_cn_redirect=1) API, the input parameter `FunctionName` is optional, but we recommend you enter it; otherwise, log acquisition may fail.
- After the function is connected to CLS, we recommend you use the [related CLS API](https://intl.cloud.tencent.com/document/product/614/16875?from_cn_redirect=1) to get the best log retrieval experience.
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get Data offset. The addition of `Offset` and `Limit` cannot exceed 10,000. 
     * @return Offset Data offset. The addition of `Offset` and `Limit` cannot exceed 10,000.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Data offset. The addition of `Offset` and `Limit` cannot exceed 10,000.
     * @param Offset Data offset. The addition of `Offset` and `Limit` cannot exceed 10,000.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Length of the return data. The addition of `Offset` and `Limit` cannot exceed 10,000. 
     * @return Limit Length of the return data. The addition of `Offset` and `Limit` cannot exceed 10,000.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Length of the return data. The addition of `Offset` and `Limit` cannot exceed 10,000.
     * @param Limit Length of the return data. The addition of `Offset` and `Limit` cannot exceed 10,000.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get It specifies whether to sort the logs in an ascending or descending order. The value is `desc` or `asc`. 
     * @return Order It specifies whether to sort the logs in an ascending or descending order. The value is `desc` or `asc`.
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set It specifies whether to sort the logs in an ascending or descending order. The value is `desc` or `asc`.
     * @param Order It specifies whether to sort the logs in an ascending or descending order. The value is `desc` or `asc`.
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get It specifies the sorting order of the logs based on a specified field, such as `function_name`, `duration`, `mem_usage`, and `start_time`. 
     * @return OrderBy It specifies the sorting order of the logs based on a specified field, such as `function_name`, `duration`, `mem_usage`, and `start_time`.
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set It specifies the sorting order of the logs based on a specified field, such as `function_name`, `duration`, `mem_usage`, and `start_time`.
     * @param OrderBy It specifies the sorting order of the logs based on a specified field, such as `function_name`, `duration`, `mem_usage`, and `start_time`.
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Log filter used to identify whether to return logs of successful or failed requests. `filter.RetCode=not0` indicates that only the logs of failed requests will be returned. `filter.RetCode=is0` indicates that only the logs of successful requests will be returned. If this parameter is left blank, all logs will be returned.  
     * @return Filter Log filter used to identify whether to return logs of successful or failed requests. `filter.RetCode=not0` indicates that only the logs of failed requests will be returned. `filter.RetCode=is0` indicates that only the logs of successful requests will be returned. If this parameter is left blank, all logs will be returned. 
     */
    public LogFilter getFilter() {
        return this.Filter;
    }

    /**
     * Set Log filter used to identify whether to return logs of successful or failed requests. `filter.RetCode=not0` indicates that only the logs of failed requests will be returned. `filter.RetCode=is0` indicates that only the logs of successful requests will be returned. If this parameter is left blank, all logs will be returned. 
     * @param Filter Log filter used to identify whether to return logs of successful or failed requests. `filter.RetCode=not0` indicates that only the logs of failed requests will be returned. `filter.RetCode=is0` indicates that only the logs of successful requests will be returned. If this parameter is left blank, all logs will be returned. 
     */
    public void setFilter(LogFilter Filter) {
        this.Filter = Filter;
    }

    /**
     * Get Function namespace 
     * @return Namespace Function namespace
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Function namespace
     * @param Namespace Function namespace
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
     * Get RequestId corresponding to the executed function 
     * @return FunctionRequestId RequestId corresponding to the executed function
     */
    public String getFunctionRequestId() {
        return this.FunctionRequestId;
    }

    /**
     * Set RequestId corresponding to the executed function
     * @param FunctionRequestId RequestId corresponding to the executed function
     */
    public void setFunctionRequestId(String FunctionRequestId) {
        this.FunctionRequestId = FunctionRequestId;
    }

    /**
     * Get Query date, for example, 2017-05-16 20:00:00. The date must be within one day of the end time. 
     * @return StartTime Query date, for example, 2017-05-16 20:00:00. The date must be within one day of the end time.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Query date, for example, 2017-05-16 20:00:00. The date must be within one day of the end time.
     * @param StartTime Query date, for example, 2017-05-16 20:00:00. The date must be within one day of the end time.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Query date, for example, 2017-05-16 20:59:59. The date must be within one day of the start time. 
     * @return EndTime Query date, for example, 2017-05-16 20:59:59. The date must be within one day of the start time.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Query date, for example, 2017-05-16 20:59:59. The date must be within one day of the start time.
     * @param EndTime Query date, for example, 2017-05-16 20:59:59. The date must be within one day of the start time.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get This field is disused. 
     * @return SearchContext This field is disused.
     */
    public LogSearchContext getSearchContext() {
        return this.SearchContext;
    }

    /**
     * Set This field is disused.
     * @param SearchContext This field is disused.
     */
    public void setSearchContext(LogSearchContext SearchContext) {
        this.SearchContext = SearchContext;
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


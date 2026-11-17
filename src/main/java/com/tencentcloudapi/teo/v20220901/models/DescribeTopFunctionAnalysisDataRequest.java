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

public class DescribeTopFunctionAnalysisDataRequest extends AbstractModel {

    /**
    * <p>Set of site IDs. Enter at least one site ID.</p>
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * <p>Start time.</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time. The query time range (`EndTime` - `StartTime`) must be no longer than 7 days.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * The metric to query. Valid values:<ul><li>`function_requestCount_functionResult`: counts Edge Function requests by the dimension of execution result.</li><li>`function_requestCount_functionName`: counts Edge Function requests by the dimension of function name.</li><li>`function_requestCount_domain`: counts Edge Function requests by the dimension of domain name.</li></ul>
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * <p>Number of top data entries to query. The maximum value is 1000. If not specified, the default value is 10, indicating that the top 10 data entries are queried.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filter conditions. The maximum number of values in `Filters.Value` is 20. The detailed filter condition keys are as follows:<ul><li>`domain`: filters by subdomain name. Example value: `www.example.com`.</li><li>`function-name`: filters by Edge Function name. Example value: `test051301-zone-2r2fdoxxxx-130000000`.</li><li>`function-result`: filters by Edge Function execution result. Valid values for the corresponding `Value`:<ul><li>`success`: success.</li><li>`fail`: failure.</li></ul></li></ul>
    */
    @SerializedName("Filters")
    @Expose
    private QueryCondition [] Filters;

    /**
    * Query time granularity. Valid values:<ul><li>`min`: 1 minute.</li><li>`5min`: 5 minutes.</li><li>`hour`: 1 hour.</li><li>`day`: 1 day.</li></ul>If this parameter is not specified, the granularity is automatically inferred based on the interval between the start time and the end time. The specific rules are as follows: within 2 hours, the granularity is `min`; within 2 days, the granularity is `5min`; within 7 days, the granularity is `hour`; longer than 7 days, the granularity is `day`.
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * The region the data belongs to. Valid values:<ul><li>`overseas`: data from the global area (excluding the Chinese mainland).</li><li>`mainland`: data from the Chinese mainland.</li><li>`global`: global data.</li></ul>If this parameter is not specified, the default value is `global`.
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
     * Get <p>Set of site IDs. Enter at least one site ID.</p> 
     * @return ZoneIds <p>Set of site IDs. Enter at least one site ID.</p>
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set <p>Set of site IDs. Enter at least one site ID.</p>
     * @param ZoneIds <p>Set of site IDs. Enter at least one site ID.</p>
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get <p>Start time.</p> 
     * @return StartTime <p>Start time.</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Start time.</p>
     * @param StartTime <p>Start time.</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time. The query time range (`EndTime` - `StartTime`) must be no longer than 7 days. 
     * @return EndTime End time. The query time range (`EndTime` - `StartTime`) must be no longer than 7 days.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time. The query time range (`EndTime` - `StartTime`) must be no longer than 7 days.
     * @param EndTime End time. The query time range (`EndTime` - `StartTime`) must be no longer than 7 days.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get The metric to query. Valid values:<ul><li>`function_requestCount_functionResult`: counts Edge Function requests by the dimension of execution result.</li><li>`function_requestCount_functionName`: counts Edge Function requests by the dimension of function name.</li><li>`function_requestCount_domain`: counts Edge Function requests by the dimension of domain name.</li></ul> 
     * @return MetricName The metric to query. Valid values:<ul><li>`function_requestCount_functionResult`: counts Edge Function requests by the dimension of execution result.</li><li>`function_requestCount_functionName`: counts Edge Function requests by the dimension of function name.</li><li>`function_requestCount_domain`: counts Edge Function requests by the dimension of domain name.</li></ul>
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set The metric to query. Valid values:<ul><li>`function_requestCount_functionResult`: counts Edge Function requests by the dimension of execution result.</li><li>`function_requestCount_functionName`: counts Edge Function requests by the dimension of function name.</li><li>`function_requestCount_domain`: counts Edge Function requests by the dimension of domain name.</li></ul>
     * @param MetricName The metric to query. Valid values:<ul><li>`function_requestCount_functionResult`: counts Edge Function requests by the dimension of execution result.</li><li>`function_requestCount_functionName`: counts Edge Function requests by the dimension of function name.</li><li>`function_requestCount_domain`: counts Edge Function requests by the dimension of domain name.</li></ul>
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get <p>Number of top data entries to query. The maximum value is 1000. If not specified, the default value is 10, indicating that the top 10 data entries are queried.</p> 
     * @return Limit <p>Number of top data entries to query. The maximum value is 1000. If not specified, the default value is 10, indicating that the top 10 data entries are queried.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Number of top data entries to query. The maximum value is 1000. If not specified, the default value is 10, indicating that the top 10 data entries are queried.</p>
     * @param Limit <p>Number of top data entries to query. The maximum value is 1000. If not specified, the default value is 10, indicating that the top 10 data entries are queried.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filter conditions. The maximum number of values in `Filters.Value` is 20. The detailed filter condition keys are as follows:<ul><li>`domain`: filters by subdomain name. Example value: `www.example.com`.</li><li>`function-name`: filters by Edge Function name. Example value: `test051301-zone-2r2fdoxxxx-130000000`.</li><li>`function-result`: filters by Edge Function execution result. Valid values for the corresponding `Value`:<ul><li>`success`: success.</li><li>`fail`: failure.</li></ul></li></ul> 
     * @return Filters Filter conditions. The maximum number of values in `Filters.Value` is 20. The detailed filter condition keys are as follows:<ul><li>`domain`: filters by subdomain name. Example value: `www.example.com`.</li><li>`function-name`: filters by Edge Function name. Example value: `test051301-zone-2r2fdoxxxx-130000000`.</li><li>`function-result`: filters by Edge Function execution result. Valid values for the corresponding `Value`:<ul><li>`success`: success.</li><li>`fail`: failure.</li></ul></li></ul>
     */
    public QueryCondition [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter conditions. The maximum number of values in `Filters.Value` is 20. The detailed filter condition keys are as follows:<ul><li>`domain`: filters by subdomain name. Example value: `www.example.com`.</li><li>`function-name`: filters by Edge Function name. Example value: `test051301-zone-2r2fdoxxxx-130000000`.</li><li>`function-result`: filters by Edge Function execution result. Valid values for the corresponding `Value`:<ul><li>`success`: success.</li><li>`fail`: failure.</li></ul></li></ul>
     * @param Filters Filter conditions. The maximum number of values in `Filters.Value` is 20. The detailed filter condition keys are as follows:<ul><li>`domain`: filters by subdomain name. Example value: `www.example.com`.</li><li>`function-name`: filters by Edge Function name. Example value: `test051301-zone-2r2fdoxxxx-130000000`.</li><li>`function-result`: filters by Edge Function execution result. Valid values for the corresponding `Value`:<ul><li>`success`: success.</li><li>`fail`: failure.</li></ul></li></ul>
     */
    public void setFilters(QueryCondition [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Query time granularity. Valid values:<ul><li>`min`: 1 minute.</li><li>`5min`: 5 minutes.</li><li>`hour`: 1 hour.</li><li>`day`: 1 day.</li></ul>If this parameter is not specified, the granularity is automatically inferred based on the interval between the start time and the end time. The specific rules are as follows: within 2 hours, the granularity is `min`; within 2 days, the granularity is `5min`; within 7 days, the granularity is `hour`; longer than 7 days, the granularity is `day`. 
     * @return Interval Query time granularity. Valid values:<ul><li>`min`: 1 minute.</li><li>`5min`: 5 minutes.</li><li>`hour`: 1 hour.</li><li>`day`: 1 day.</li></ul>If this parameter is not specified, the granularity is automatically inferred based on the interval between the start time and the end time. The specific rules are as follows: within 2 hours, the granularity is `min`; within 2 days, the granularity is `5min`; within 7 days, the granularity is `hour`; longer than 7 days, the granularity is `day`.
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set Query time granularity. Valid values:<ul><li>`min`: 1 minute.</li><li>`5min`: 5 minutes.</li><li>`hour`: 1 hour.</li><li>`day`: 1 day.</li></ul>If this parameter is not specified, the granularity is automatically inferred based on the interval between the start time and the end time. The specific rules are as follows: within 2 hours, the granularity is `min`; within 2 days, the granularity is `5min`; within 7 days, the granularity is `hour`; longer than 7 days, the granularity is `day`.
     * @param Interval Query time granularity. Valid values:<ul><li>`min`: 1 minute.</li><li>`5min`: 5 minutes.</li><li>`hour`: 1 hour.</li><li>`day`: 1 day.</li></ul>If this parameter is not specified, the granularity is automatically inferred based on the interval between the start time and the end time. The specific rules are as follows: within 2 hours, the granularity is `min`; within 2 days, the granularity is `5min`; within 7 days, the granularity is `hour`; longer than 7 days, the granularity is `day`.
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get The region the data belongs to. Valid values:<ul><li>`overseas`: data from the global area (excluding the Chinese mainland).</li><li>`mainland`: data from the Chinese mainland.</li><li>`global`: global data.</li></ul>If this parameter is not specified, the default value is `global`. 
     * @return Area The region the data belongs to. Valid values:<ul><li>`overseas`: data from the global area (excluding the Chinese mainland).</li><li>`mainland`: data from the Chinese mainland.</li><li>`global`: global data.</li></ul>If this parameter is not specified, the default value is `global`.
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set The region the data belongs to. Valid values:<ul><li>`overseas`: data from the global area (excluding the Chinese mainland).</li><li>`mainland`: data from the Chinese mainland.</li><li>`global`: global data.</li></ul>If this parameter is not specified, the default value is `global`.
     * @param Area The region the data belongs to. Valid values:<ul><li>`overseas`: data from the global area (excluding the Chinese mainland).</li><li>`mainland`: data from the Chinese mainland.</li><li>`global`: global data.</li></ul>If this parameter is not specified, the default value is `global`.
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    public DescribeTopFunctionAnalysisDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTopFunctionAnalysisDataRequest(DescribeTopFunctionAnalysisDataRequest source) {
        if (source.ZoneIds != null) {
            this.ZoneIds = new String[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new String(source.ZoneIds[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new QueryCondition[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new QueryCondition(source.Filters[i]);
            }
        }
        if (source.Interval != null) {
            this.Interval = new String(source.Interval);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}


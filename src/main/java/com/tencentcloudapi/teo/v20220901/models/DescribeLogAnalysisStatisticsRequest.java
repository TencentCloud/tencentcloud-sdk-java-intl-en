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

public class DescribeLogAnalysisStatisticsRequest extends AbstractModel {

    /**
    * <p>Site ID.</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>Data ownership region. Available values:</p><ul><li>mainland: within the Chinese mainland;</li><li>overseas: global (excluding the Chinese mainland).</li></ul>Note: If the site service area is "global availability zone", to obtain all data, query the data of mainland and overseas separately.<p></p>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * <p>Log type. Available values:</p><ul><li> l7-access-logs: L7 access log;</li><li>web-attack: managed rule log.</li></ul>Default value: l7-access-logs.<p></p>
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * <p>Start time. Example value: 2020-04-29T00:00:00Z. The maximum span from the query start time to this day varies by package version. For details, see <a href="https://www.tencentcloud.com/document/product/1552/94165?from_cn_redirect=1#45435466-9103-4ff6-be22-e31717044fb2">Package Selection Comparison</a>.</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>End time, for example, 2020-04-30T00:00:00Z. The maximum time span from start time to end time per request is 31 days.</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>Statistical query statement, composed of [<a href="https://www.tencentcloud.com/document/product/1552/124662?from_cn_redirect=1">retrieval criteria</a>] | [<a href="https://www.tencentcloud.com/document/product/1552/124662?from_cn_redirect=1">SQL statement</a>]. The SQL segment after the pipe character "|" is required. The retrieval criteria segment can be empty (for example, | SELECT ...), which means aggregation on full data. Maximum length: 12 KB. Default SQL Limit: 100. Maximum Limit: 10000.<br>Example:</p><p>With retrieval criteria: <code>${EdgeCacheStatus} in ['miss','other'] | select EdgeCacheStatus as status, count(*) as cnt group by status limit 2</code></p><p>Without retrieval criteria: <code>| select EdgeCacheStatus as status, count(*) as cnt group by status</code></p>
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
     * Get <p>Site ID.</p> 
     * @return ZoneId <p>Site ID.</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>Site ID.</p>
     * @param ZoneId <p>Site ID.</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>Data ownership region. Available values:</p><ul><li>mainland: within the Chinese mainland;</li><li>overseas: global (excluding the Chinese mainland).</li></ul>Note: If the site service area is "global availability zone", to obtain all data, query the data of mainland and overseas separately.<p></p> 
     * @return Area <p>Data ownership region. Available values:</p><ul><li>mainland: within the Chinese mainland;</li><li>overseas: global (excluding the Chinese mainland).</li></ul>Note: If the site service area is "global availability zone", to obtain all data, query the data of mainland and overseas separately.<p></p>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set <p>Data ownership region. Available values:</p><ul><li>mainland: within the Chinese mainland;</li><li>overseas: global (excluding the Chinese mainland).</li></ul>Note: If the site service area is "global availability zone", to obtain all data, query the data of mainland and overseas separately.<p></p>
     * @param Area <p>Data ownership region. Available values:</p><ul><li>mainland: within the Chinese mainland;</li><li>overseas: global (excluding the Chinese mainland).</li></ul>Note: If the site service area is "global availability zone", to obtain all data, query the data of mainland and overseas separately.<p></p>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get <p>Log type. Available values:</p><ul><li> l7-access-logs: L7 access log;</li><li>web-attack: managed rule log.</li></ul>Default value: l7-access-logs.<p></p> 
     * @return LogType <p>Log type. Available values:</p><ul><li> l7-access-logs: L7 access log;</li><li>web-attack: managed rule log.</li></ul>Default value: l7-access-logs.<p></p>
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set <p>Log type. Available values:</p><ul><li> l7-access-logs: L7 access log;</li><li>web-attack: managed rule log.</li></ul>Default value: l7-access-logs.<p></p>
     * @param LogType <p>Log type. Available values:</p><ul><li> l7-access-logs: L7 access log;</li><li>web-attack: managed rule log.</li></ul>Default value: l7-access-logs.<p></p>
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get <p>Start time. Example value: 2020-04-29T00:00:00Z. The maximum span from the query start time to this day varies by package version. For details, see <a href="https://www.tencentcloud.com/document/product/1552/94165?from_cn_redirect=1#45435466-9103-4ff6-be22-e31717044fb2">Package Selection Comparison</a>.</p> 
     * @return StartTime <p>Start time. Example value: 2020-04-29T00:00:00Z. The maximum span from the query start time to this day varies by package version. For details, see <a href="https://www.tencentcloud.com/document/product/1552/94165?from_cn_redirect=1#45435466-9103-4ff6-be22-e31717044fb2">Package Selection Comparison</a>.</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Start time. Example value: 2020-04-29T00:00:00Z. The maximum span from the query start time to this day varies by package version. For details, see <a href="https://www.tencentcloud.com/document/product/1552/94165?from_cn_redirect=1#45435466-9103-4ff6-be22-e31717044fb2">Package Selection Comparison</a>.</p>
     * @param StartTime <p>Start time. Example value: 2020-04-29T00:00:00Z. The maximum span from the query start time to this day varies by package version. For details, see <a href="https://www.tencentcloud.com/document/product/1552/94165?from_cn_redirect=1#45435466-9103-4ff6-be22-e31717044fb2">Package Selection Comparison</a>.</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>End time, for example, 2020-04-30T00:00:00Z. The maximum time span from start time to end time per request is 31 days.</p> 
     * @return EndTime <p>End time, for example, 2020-04-30T00:00:00Z. The maximum time span from start time to end time per request is 31 days.</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>End time, for example, 2020-04-30T00:00:00Z. The maximum time span from start time to end time per request is 31 days.</p>
     * @param EndTime <p>End time, for example, 2020-04-30T00:00:00Z. The maximum time span from start time to end time per request is 31 days.</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>Statistical query statement, composed of [<a href="https://www.tencentcloud.com/document/product/1552/124662?from_cn_redirect=1">retrieval criteria</a>] | [<a href="https://www.tencentcloud.com/document/product/1552/124662?from_cn_redirect=1">SQL statement</a>]. The SQL segment after the pipe character "|" is required. The retrieval criteria segment can be empty (for example, | SELECT ...), which means aggregation on full data. Maximum length: 12 KB. Default SQL Limit: 100. Maximum Limit: 10000.<br>Example:</p><p>With retrieval criteria: <code>${EdgeCacheStatus} in ['miss','other'] | select EdgeCacheStatus as status, count(*) as cnt group by status limit 2</code></p><p>Without retrieval criteria: <code>| select EdgeCacheStatus as status, count(*) as cnt group by status</code></p> 
     * @return Query <p>Statistical query statement, composed of [<a href="https://www.tencentcloud.com/document/product/1552/124662?from_cn_redirect=1">retrieval criteria</a>] | [<a href="https://www.tencentcloud.com/document/product/1552/124662?from_cn_redirect=1">SQL statement</a>]. The SQL segment after the pipe character "|" is required. The retrieval criteria segment can be empty (for example, | SELECT ...), which means aggregation on full data. Maximum length: 12 KB. Default SQL Limit: 100. Maximum Limit: 10000.<br>Example:</p><p>With retrieval criteria: <code>${EdgeCacheStatus} in ['miss','other'] | select EdgeCacheStatus as status, count(*) as cnt group by status limit 2</code></p><p>Without retrieval criteria: <code>| select EdgeCacheStatus as status, count(*) as cnt group by status</code></p>
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set <p>Statistical query statement, composed of [<a href="https://www.tencentcloud.com/document/product/1552/124662?from_cn_redirect=1">retrieval criteria</a>] | [<a href="https://www.tencentcloud.com/document/product/1552/124662?from_cn_redirect=1">SQL statement</a>]. The SQL segment after the pipe character "|" is required. The retrieval criteria segment can be empty (for example, | SELECT ...), which means aggregation on full data. Maximum length: 12 KB. Default SQL Limit: 100. Maximum Limit: 10000.<br>Example:</p><p>With retrieval criteria: <code>${EdgeCacheStatus} in ['miss','other'] | select EdgeCacheStatus as status, count(*) as cnt group by status limit 2</code></p><p>Without retrieval criteria: <code>| select EdgeCacheStatus as status, count(*) as cnt group by status</code></p>
     * @param Query <p>Statistical query statement, composed of [<a href="https://www.tencentcloud.com/document/product/1552/124662?from_cn_redirect=1">retrieval criteria</a>] | [<a href="https://www.tencentcloud.com/document/product/1552/124662?from_cn_redirect=1">SQL statement</a>]. The SQL segment after the pipe character "|" is required. The retrieval criteria segment can be empty (for example, | SELECT ...), which means aggregation on full data. Maximum length: 12 KB. Default SQL Limit: 100. Maximum Limit: 10000.<br>Example:</p><p>With retrieval criteria: <code>${EdgeCacheStatus} in ['miss','other'] | select EdgeCacheStatus as status, count(*) as cnt group by status limit 2</code></p><p>Without retrieval criteria: <code>| select EdgeCacheStatus as status, count(*) as cnt group by status</code></p>
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    public DescribeLogAnalysisStatisticsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLogAnalysisStatisticsRequest(DescribeLogAnalysisStatisticsRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Query", this.Query);

    }
}


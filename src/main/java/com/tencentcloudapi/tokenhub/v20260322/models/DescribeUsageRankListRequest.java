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
package com.tencentcloudapi.tokenhub.v20260322.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUsageRankListRequest extends AbstractModel {

    /**
    * <p>Statistical dimension. Values: apikey (statistics by APIKey), endpoint (statistics by access point), model (statistics by model).</p>
    */
    @SerializedName("Dimension")
    @Expose
    private String Dimension;

    /**
    * <p>Start time (inclusive interval), in RFC3339 format.</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>End time (open interval) in RFC3339 format. The maximum span from StartTime is 90 days.</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>Metric family switch field.</p><ul><li>tokens (default): Token consumption chart (statistics=sum), supports Dimension = apikey/endpoint/model</li><li>search [to be launched]: Online search call count (statistics=sum), only supports Dimension = model</li><li>Other values return InvalidParameter.</li></ul><p>Enum values:</p><ul><li>tokens: tokens</li></ul>
    */
    @SerializedName("MetricType")
    @Expose
    private String MetricType;

    /**
    * <p>Dimension filtering value. An empty string indicates querying all objects; a non-empty string indicates querying only the specified single object (for example, a designated APIKey ID). Maximum 256 characters.</p>
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * <p>Statistical granularity (seconds). Value: 60, 300, 3600, 86400. Must not be less than the lower limit corresponding to the span: span ≤ 1 day → 60; 1–5 days → 300; 5–10 days → 3600; &gt; 10 days → 86400. Used only when ShowAll=false.</p>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * <p>Pagination starting point, starting from 0, default 0. Ignore timing when ShowAll=true. Page size fixed as 10.</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Whether to return full result.</p><ul><li>false (default): Return TopList in pages by Offset (10 items per page). Each object contains <br>Series time series points for drawing curves.</li><li>true: Ignore Offset and return the full object list without Series (CSV export scenario).</li></ul>
    */
    @SerializedName("ShowAll")
    @Expose
    private Boolean ShowAll;

    /**
     * Get <p>Statistical dimension. Values: apikey (statistics by APIKey), endpoint (statistics by access point), model (statistics by model).</p> 
     * @return Dimension <p>Statistical dimension. Values: apikey (statistics by APIKey), endpoint (statistics by access point), model (statistics by model).</p>
     */
    public String getDimension() {
        return this.Dimension;
    }

    /**
     * Set <p>Statistical dimension. Values: apikey (statistics by APIKey), endpoint (statistics by access point), model (statistics by model).</p>
     * @param Dimension <p>Statistical dimension. Values: apikey (statistics by APIKey), endpoint (statistics by access point), model (statistics by model).</p>
     */
    public void setDimension(String Dimension) {
        this.Dimension = Dimension;
    }

    /**
     * Get <p>Start time (inclusive interval), in RFC3339 format.</p> 
     * @return StartTime <p>Start time (inclusive interval), in RFC3339 format.</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Start time (inclusive interval), in RFC3339 format.</p>
     * @param StartTime <p>Start time (inclusive interval), in RFC3339 format.</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>End time (open interval) in RFC3339 format. The maximum span from StartTime is 90 days.</p> 
     * @return EndTime <p>End time (open interval) in RFC3339 format. The maximum span from StartTime is 90 days.</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>End time (open interval) in RFC3339 format. The maximum span from StartTime is 90 days.</p>
     * @param EndTime <p>End time (open interval) in RFC3339 format. The maximum span from StartTime is 90 days.</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>Metric family switch field.</p><ul><li>tokens (default): Token consumption chart (statistics=sum), supports Dimension = apikey/endpoint/model</li><li>search [to be launched]: Online search call count (statistics=sum), only supports Dimension = model</li><li>Other values return InvalidParameter.</li></ul><p>Enum values:</p><ul><li>tokens: tokens</li></ul> 
     * @return MetricType <p>Metric family switch field.</p><ul><li>tokens (default): Token consumption chart (statistics=sum), supports Dimension = apikey/endpoint/model</li><li>search [to be launched]: Online search call count (statistics=sum), only supports Dimension = model</li><li>Other values return InvalidParameter.</li></ul><p>Enum values:</p><ul><li>tokens: tokens</li></ul>
     */
    public String getMetricType() {
        return this.MetricType;
    }

    /**
     * Set <p>Metric family switch field.</p><ul><li>tokens (default): Token consumption chart (statistics=sum), supports Dimension = apikey/endpoint/model</li><li>search [to be launched]: Online search call count (statistics=sum), only supports Dimension = model</li><li>Other values return InvalidParameter.</li></ul><p>Enum values:</p><ul><li>tokens: tokens</li></ul>
     * @param MetricType <p>Metric family switch field.</p><ul><li>tokens (default): Token consumption chart (statistics=sum), supports Dimension = apikey/endpoint/model</li><li>search [to be launched]: Online search call count (statistics=sum), only supports Dimension = model</li><li>Other values return InvalidParameter.</li></ul><p>Enum values:</p><ul><li>tokens: tokens</li></ul>
     */
    public void setMetricType(String MetricType) {
        this.MetricType = MetricType;
    }

    /**
     * Get <p>Dimension filtering value. An empty string indicates querying all objects; a non-empty string indicates querying only the specified single object (for example, a designated APIKey ID). Maximum 256 characters.</p> 
     * @return Target <p>Dimension filtering value. An empty string indicates querying all objects; a non-empty string indicates querying only the specified single object (for example, a designated APIKey ID). Maximum 256 characters.</p>
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set <p>Dimension filtering value. An empty string indicates querying all objects; a non-empty string indicates querying only the specified single object (for example, a designated APIKey ID). Maximum 256 characters.</p>
     * @param Target <p>Dimension filtering value. An empty string indicates querying all objects; a non-empty string indicates querying only the specified single object (for example, a designated APIKey ID). Maximum 256 characters.</p>
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get <p>Statistical granularity (seconds). Value: 60, 300, 3600, 86400. Must not be less than the lower limit corresponding to the span: span ≤ 1 day → 60; 1–5 days → 300; 5–10 days → 3600; &gt; 10 days → 86400. Used only when ShowAll=false.</p> 
     * @return Period <p>Statistical granularity (seconds). Value: 60, 300, 3600, 86400. Must not be less than the lower limit corresponding to the span: span ≤ 1 day → 60; 1–5 days → 300; 5–10 days → 3600; &gt; 10 days → 86400. Used only when ShowAll=false.</p>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>Statistical granularity (seconds). Value: 60, 300, 3600, 86400. Must not be less than the lower limit corresponding to the span: span ≤ 1 day → 60; 1–5 days → 300; 5–10 days → 3600; &gt; 10 days → 86400. Used only when ShowAll=false.</p>
     * @param Period <p>Statistical granularity (seconds). Value: 60, 300, 3600, 86400. Must not be less than the lower limit corresponding to the span: span ≤ 1 day → 60; 1–5 days → 300; 5–10 days → 3600; &gt; 10 days → 86400. Used only when ShowAll=false.</p>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get <p>Pagination starting point, starting from 0, default 0. Ignore timing when ShowAll=true. Page size fixed as 10.</p> 
     * @return Offset <p>Pagination starting point, starting from 0, default 0. Ignore timing when ShowAll=true. Page size fixed as 10.</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Pagination starting point, starting from 0, default 0. Ignore timing when ShowAll=true. Page size fixed as 10.</p>
     * @param Offset <p>Pagination starting point, starting from 0, default 0. Ignore timing when ShowAll=true. Page size fixed as 10.</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Whether to return full result.</p><ul><li>false (default): Return TopList in pages by Offset (10 items per page). Each object contains <br>Series time series points for drawing curves.</li><li>true: Ignore Offset and return the full object list without Series (CSV export scenario).</li></ul> 
     * @return ShowAll <p>Whether to return full result.</p><ul><li>false (default): Return TopList in pages by Offset (10 items per page). Each object contains <br>Series time series points for drawing curves.</li><li>true: Ignore Offset and return the full object list without Series (CSV export scenario).</li></ul>
     */
    public Boolean getShowAll() {
        return this.ShowAll;
    }

    /**
     * Set <p>Whether to return full result.</p><ul><li>false (default): Return TopList in pages by Offset (10 items per page). Each object contains <br>Series time series points for drawing curves.</li><li>true: Ignore Offset and return the full object list without Series (CSV export scenario).</li></ul>
     * @param ShowAll <p>Whether to return full result.</p><ul><li>false (default): Return TopList in pages by Offset (10 items per page). Each object contains <br>Series time series points for drawing curves.</li><li>true: Ignore Offset and return the full object list without Series (CSV export scenario).</li></ul>
     */
    public void setShowAll(Boolean ShowAll) {
        this.ShowAll = ShowAll;
    }

    public DescribeUsageRankListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUsageRankListRequest(DescribeUsageRankListRequest source) {
        if (source.Dimension != null) {
            this.Dimension = new String(source.Dimension);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.MetricType != null) {
            this.MetricType = new String(source.MetricType);
        }
        if (source.Target != null) {
            this.Target = new String(source.Target);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.ShowAll != null) {
            this.ShowAll = new Boolean(source.ShowAll);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Dimension", this.Dimension);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "MetricType", this.MetricType);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "ShowAll", this.ShowAll);

    }
}


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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeWebProtectionTopDataRequest extends AbstractModel{

    /**
    * The start time.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * The end time.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * List of statistical metric. Values:
<li>`ccRate_requestNum_url`: Top-ranked URLs by rate limiting requests.</li>
<li>`ccRate_cipRequestNum_region`: Top-ranked client IPs by rate limiting requests.</li>
<li>`ccAcl_requestNum_url`: Top-ranked URLs by custom rule requests.</li>
<li>`ccAcl_requestNum_cip`: Top-ranked client IPs by custom rule execution requests.</li>
<li>`ccAcl_cipRequestNum_region`: Top-ranked clients by custom rule execution requests.</li>
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * The query time granularity. Values:
<li>`min`: 1 minute;</li>
<li>`5min`: 5 minute;</li>
<li>`hour`: 1 hour;</li>
<li>`day`: 1 day.</li>If this field is not specified, the granularity will be determined based on the interval between the start time and end time as follows: 1-minute granularity applies for a 1-hour interval, 5-minute granularity for a 2-day interval, 1-hour granularity for a 7-day interval, and 1-day granularity for an interval of over 7 days.
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * List of sites to be queried. All sites will be selected if this field is not specified.
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * List of subdomain names to be queried. All subdomain names will be selected if this field is not specified.
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * Queries the top n rows of data. Top 10 rows of data will be queried if this field is not specified.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * The key of the parameter QueryCondition, which is used to specify a filter. Values:
<li>`action`: The action;</li>
    */
    @SerializedName("QueryCondition")
    @Expose
    private QueryCondition [] QueryCondition;

    /**
    * Data storage region. Values:
<li>`overseas`: Global (outside the Chinese mainland);</li>
<li>`mainland`: Chinese mainland.</li>If this field is not specified, the data storage region will be determined based on the user’s location.
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
     * Get The start time. 
     * @return StartTime The start time.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set The start time.
     * @param StartTime The start time.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get The end time. 
     * @return EndTime The end time.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set The end time.
     * @param EndTime The end time.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get List of statistical metric. Values:
<li>`ccRate_requestNum_url`: Top-ranked URLs by rate limiting requests.</li>
<li>`ccRate_cipRequestNum_region`: Top-ranked client IPs by rate limiting requests.</li>
<li>`ccAcl_requestNum_url`: Top-ranked URLs by custom rule requests.</li>
<li>`ccAcl_requestNum_cip`: Top-ranked client IPs by custom rule execution requests.</li>
<li>`ccAcl_cipRequestNum_region`: Top-ranked clients by custom rule execution requests.</li> 
     * @return MetricName List of statistical metric. Values:
<li>`ccRate_requestNum_url`: Top-ranked URLs by rate limiting requests.</li>
<li>`ccRate_cipRequestNum_region`: Top-ranked client IPs by rate limiting requests.</li>
<li>`ccAcl_requestNum_url`: Top-ranked URLs by custom rule requests.</li>
<li>`ccAcl_requestNum_cip`: Top-ranked client IPs by custom rule execution requests.</li>
<li>`ccAcl_cipRequestNum_region`: Top-ranked clients by custom rule execution requests.</li>
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set List of statistical metric. Values:
<li>`ccRate_requestNum_url`: Top-ranked URLs by rate limiting requests.</li>
<li>`ccRate_cipRequestNum_region`: Top-ranked client IPs by rate limiting requests.</li>
<li>`ccAcl_requestNum_url`: Top-ranked URLs by custom rule requests.</li>
<li>`ccAcl_requestNum_cip`: Top-ranked client IPs by custom rule execution requests.</li>
<li>`ccAcl_cipRequestNum_region`: Top-ranked clients by custom rule execution requests.</li>
     * @param MetricName List of statistical metric. Values:
<li>`ccRate_requestNum_url`: Top-ranked URLs by rate limiting requests.</li>
<li>`ccRate_cipRequestNum_region`: Top-ranked client IPs by rate limiting requests.</li>
<li>`ccAcl_requestNum_url`: Top-ranked URLs by custom rule requests.</li>
<li>`ccAcl_requestNum_cip`: Top-ranked client IPs by custom rule execution requests.</li>
<li>`ccAcl_cipRequestNum_region`: Top-ranked clients by custom rule execution requests.</li>
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get The query time granularity. Values:
<li>`min`: 1 minute;</li>
<li>`5min`: 5 minute;</li>
<li>`hour`: 1 hour;</li>
<li>`day`: 1 day.</li>If this field is not specified, the granularity will be determined based on the interval between the start time and end time as follows: 1-minute granularity applies for a 1-hour interval, 5-minute granularity for a 2-day interval, 1-hour granularity for a 7-day interval, and 1-day granularity for an interval of over 7 days. 
     * @return Interval The query time granularity. Values:
<li>`min`: 1 minute;</li>
<li>`5min`: 5 minute;</li>
<li>`hour`: 1 hour;</li>
<li>`day`: 1 day.</li>If this field is not specified, the granularity will be determined based on the interval between the start time and end time as follows: 1-minute granularity applies for a 1-hour interval, 5-minute granularity for a 2-day interval, 1-hour granularity for a 7-day interval, and 1-day granularity for an interval of over 7 days.
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set The query time granularity. Values:
<li>`min`: 1 minute;</li>
<li>`5min`: 5 minute;</li>
<li>`hour`: 1 hour;</li>
<li>`day`: 1 day.</li>If this field is not specified, the granularity will be determined based on the interval between the start time and end time as follows: 1-minute granularity applies for a 1-hour interval, 5-minute granularity for a 2-day interval, 1-hour granularity for a 7-day interval, and 1-day granularity for an interval of over 7 days.
     * @param Interval The query time granularity. Values:
<li>`min`: 1 minute;</li>
<li>`5min`: 5 minute;</li>
<li>`hour`: 1 hour;</li>
<li>`day`: 1 day.</li>If this field is not specified, the granularity will be determined based on the interval between the start time and end time as follows: 1-minute granularity applies for a 1-hour interval, 5-minute granularity for a 2-day interval, 1-hour granularity for a 7-day interval, and 1-day granularity for an interval of over 7 days.
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get List of sites to be queried. All sites will be selected if this field is not specified. 
     * @return ZoneIds List of sites to be queried. All sites will be selected if this field is not specified.
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set List of sites to be queried. All sites will be selected if this field is not specified.
     * @param ZoneIds List of sites to be queried. All sites will be selected if this field is not specified.
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get List of subdomain names to be queried. All subdomain names will be selected if this field is not specified. 
     * @return Domains List of subdomain names to be queried. All subdomain names will be selected if this field is not specified.
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set List of subdomain names to be queried. All subdomain names will be selected if this field is not specified.
     * @param Domains List of subdomain names to be queried. All subdomain names will be selected if this field is not specified.
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get Queries the top n rows of data. Top 10 rows of data will be queried if this field is not specified. 
     * @return Limit Queries the top n rows of data. Top 10 rows of data will be queried if this field is not specified.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Queries the top n rows of data. Top 10 rows of data will be queried if this field is not specified.
     * @param Limit Queries the top n rows of data. Top 10 rows of data will be queried if this field is not specified.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get The key of the parameter QueryCondition, which is used to specify a filter. Values:
<li>`action`: The action;</li> 
     * @return QueryCondition The key of the parameter QueryCondition, which is used to specify a filter. Values:
<li>`action`: The action;</li>
     */
    public QueryCondition [] getQueryCondition() {
        return this.QueryCondition;
    }

    /**
     * Set The key of the parameter QueryCondition, which is used to specify a filter. Values:
<li>`action`: The action;</li>
     * @param QueryCondition The key of the parameter QueryCondition, which is used to specify a filter. Values:
<li>`action`: The action;</li>
     */
    public void setQueryCondition(QueryCondition [] QueryCondition) {
        this.QueryCondition = QueryCondition;
    }

    /**
     * Get Data storage region. Values:
<li>`overseas`: Global (outside the Chinese mainland);</li>
<li>`mainland`: Chinese mainland.</li>If this field is not specified, the data storage region will be determined based on the user’s location. 
     * @return Area Data storage region. Values:
<li>`overseas`: Global (outside the Chinese mainland);</li>
<li>`mainland`: Chinese mainland.</li>If this field is not specified, the data storage region will be determined based on the user’s location.
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Data storage region. Values:
<li>`overseas`: Global (outside the Chinese mainland);</li>
<li>`mainland`: Chinese mainland.</li>If this field is not specified, the data storage region will be determined based on the user’s location.
     * @param Area Data storage region. Values:
<li>`overseas`: Global (outside the Chinese mainland);</li>
<li>`mainland`: Chinese mainland.</li>If this field is not specified, the data storage region will be determined based on the user’s location.
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    public DescribeWebProtectionTopDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWebProtectionTopDataRequest(DescribeWebProtectionTopDataRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.Interval != null) {
            this.Interval = new String(source.Interval);
        }
        if (source.ZoneIds != null) {
            this.ZoneIds = new String[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new String(source.ZoneIds[i]);
            }
        }
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.QueryCondition != null) {
            this.QueryCondition = new QueryCondition[source.QueryCondition.length];
            for (int i = 0; i < source.QueryCondition.length; i++) {
                this.QueryCondition[i] = new QueryCondition(source.QueryCondition[i]);
            }
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "QueryCondition.", this.QueryCondition);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}


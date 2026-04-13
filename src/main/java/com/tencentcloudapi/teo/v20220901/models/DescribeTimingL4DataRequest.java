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

public class DescribeTimingL4DataRequest extends AbstractModel {

    /**
    * The start time.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time. the query time range (`EndTime` - `StartTime`) must be less than or equal to 31 days.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Query metrics. valid values:.
<ul><li>**l4Flow_flux**: specifies the total access traffic. measurement unit: Byte. metric value type: Integer.</li>.
<li>**l4Flow_inFlux**: specifies access inbound traffic. measurement unit: Byte. metric value type: Integer.</li>.
<li>**l4Flow_outFlux**: access outbound traffic. measurement unit: Byte. metric value type: Integer.</li>.
<li>**l4Flow_inBandwidth**: specifies the inbound bandwidth peak of the visit. measurement unit: bps. metric value type: Integer.</li>.
<li>**l4Flow_outBandwidth**: specifies the outbound bandwidth peak. measurement unit: bps. metric value type: Integer.</li>.
<li>**l4Flow_connections**: specifies the number of concurrent connections, measurement unit: unit, metric value type: Integer.</li>.
<li>**l4Flow_newConnectionsRate**: the rate of new connections, measurement unit: per second, metric value type: Float, rounded to two decimal places.</li></ul>**note**:<ul><li>metrics of <code>Integer</code> type will return corresponding time series Data from <code>Data.N.TypeValue</code>;</li>.
<li>Metrics with <code>Float</code> value type will return corresponding time series Data from <code>Data.N.FloatTypeValue</code>.</li></ul>.
    */
    @SerializedName("MetricNames")
    @Expose
    private String [] MetricNames;

    /**
    * Site ID. this parameter will change from selectable to required after may 30, 2024. for details, see the announcement: [tencent cloud EdgeOne: tencentcloud API change notification](https://www.tencentcloud.comom/document/product/1552/104902?from_cn_redirect=1).
Import up to 100 site ids. to query all site data under the tencent cloud root account, use `*` as a replacement. querying account-level data requires permission for all site resources of this api.
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * List of L4 proxy IDs. All L4 proxies will be selected if this field is not specified.
    */
    @SerializedName("ProxyIds")
    @Expose
    private String [] ProxyIds;

    /**
    * Time granularity of the query. valid values:.
<ul><li>**min**: 1 minute;</li>.
<Li>**5min**: 5 minutes;</li>.
<Li>**Hour**: 1 hour;</li>.
<Li>**Day**: 1 day.</li></ul>if this parameter is not input, the granularity will be automatically inferred based on the interval between the start time and end time. specifically, data will be queried with a granularity of <code>min</code>, <code>5min</code>, <code>hour</code>, and <code>day</code> respectively when the period is no more than 1 hour, no more than 2 days, no more than 7 days, and over 7 days.
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * Filter criteria. the detailed Key values of filter criteria are as follows:.
<ul><li>**ruleId**: filter by forwarding rule ID.</li>.
<li>**proxyId**: filters by l4 proxy instance ID.</li></ul>.
    */
    @SerializedName("Filters")
    @Expose
    private QueryCondition [] Filters;

    /**
    * Data ownership region. This parameter is deprecated. Please filter data by client region in Filters.country.
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
     * Get End time. the query time range (`EndTime` - `StartTime`) must be less than or equal to 31 days. 
     * @return EndTime End time. the query time range (`EndTime` - `StartTime`) must be less than or equal to 31 days.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time. the query time range (`EndTime` - `StartTime`) must be less than or equal to 31 days.
     * @param EndTime End time. the query time range (`EndTime` - `StartTime`) must be less than or equal to 31 days.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Query metrics. valid values:.
<ul><li>**l4Flow_flux**: specifies the total access traffic. measurement unit: Byte. metric value type: Integer.</li>.
<li>**l4Flow_inFlux**: specifies access inbound traffic. measurement unit: Byte. metric value type: Integer.</li>.
<li>**l4Flow_outFlux**: access outbound traffic. measurement unit: Byte. metric value type: Integer.</li>.
<li>**l4Flow_inBandwidth**: specifies the inbound bandwidth peak of the visit. measurement unit: bps. metric value type: Integer.</li>.
<li>**l4Flow_outBandwidth**: specifies the outbound bandwidth peak. measurement unit: bps. metric value type: Integer.</li>.
<li>**l4Flow_connections**: specifies the number of concurrent connections, measurement unit: unit, metric value type: Integer.</li>.
<li>**l4Flow_newConnectionsRate**: the rate of new connections, measurement unit: per second, metric value type: Float, rounded to two decimal places.</li></ul>**note**:<ul><li>metrics of <code>Integer</code> type will return corresponding time series Data from <code>Data.N.TypeValue</code>;</li>.
<li>Metrics with <code>Float</code> value type will return corresponding time series Data from <code>Data.N.FloatTypeValue</code>.</li></ul>. 
     * @return MetricNames Query metrics. valid values:.
<ul><li>**l4Flow_flux**: specifies the total access traffic. measurement unit: Byte. metric value type: Integer.</li>.
<li>**l4Flow_inFlux**: specifies access inbound traffic. measurement unit: Byte. metric value type: Integer.</li>.
<li>**l4Flow_outFlux**: access outbound traffic. measurement unit: Byte. metric value type: Integer.</li>.
<li>**l4Flow_inBandwidth**: specifies the inbound bandwidth peak of the visit. measurement unit: bps. metric value type: Integer.</li>.
<li>**l4Flow_outBandwidth**: specifies the outbound bandwidth peak. measurement unit: bps. metric value type: Integer.</li>.
<li>**l4Flow_connections**: specifies the number of concurrent connections, measurement unit: unit, metric value type: Integer.</li>.
<li>**l4Flow_newConnectionsRate**: the rate of new connections, measurement unit: per second, metric value type: Float, rounded to two decimal places.</li></ul>**note**:<ul><li>metrics of <code>Integer</code> type will return corresponding time series Data from <code>Data.N.TypeValue</code>;</li>.
<li>Metrics with <code>Float</code> value type will return corresponding time series Data from <code>Data.N.FloatTypeValue</code>.</li></ul>.
     */
    public String [] getMetricNames() {
        return this.MetricNames;
    }

    /**
     * Set Query metrics. valid values:.
<ul><li>**l4Flow_flux**: specifies the total access traffic. measurement unit: Byte. metric value type: Integer.</li>.
<li>**l4Flow_inFlux**: specifies access inbound traffic. measurement unit: Byte. metric value type: Integer.</li>.
<li>**l4Flow_outFlux**: access outbound traffic. measurement unit: Byte. metric value type: Integer.</li>.
<li>**l4Flow_inBandwidth**: specifies the inbound bandwidth peak of the visit. measurement unit: bps. metric value type: Integer.</li>.
<li>**l4Flow_outBandwidth**: specifies the outbound bandwidth peak. measurement unit: bps. metric value type: Integer.</li>.
<li>**l4Flow_connections**: specifies the number of concurrent connections, measurement unit: unit, metric value type: Integer.</li>.
<li>**l4Flow_newConnectionsRate**: the rate of new connections, measurement unit: per second, metric value type: Float, rounded to two decimal places.</li></ul>**note**:<ul><li>metrics of <code>Integer</code> type will return corresponding time series Data from <code>Data.N.TypeValue</code>;</li>.
<li>Metrics with <code>Float</code> value type will return corresponding time series Data from <code>Data.N.FloatTypeValue</code>.</li></ul>.
     * @param MetricNames Query metrics. valid values:.
<ul><li>**l4Flow_flux**: specifies the total access traffic. measurement unit: Byte. metric value type: Integer.</li>.
<li>**l4Flow_inFlux**: specifies access inbound traffic. measurement unit: Byte. metric value type: Integer.</li>.
<li>**l4Flow_outFlux**: access outbound traffic. measurement unit: Byte. metric value type: Integer.</li>.
<li>**l4Flow_inBandwidth**: specifies the inbound bandwidth peak of the visit. measurement unit: bps. metric value type: Integer.</li>.
<li>**l4Flow_outBandwidth**: specifies the outbound bandwidth peak. measurement unit: bps. metric value type: Integer.</li>.
<li>**l4Flow_connections**: specifies the number of concurrent connections, measurement unit: unit, metric value type: Integer.</li>.
<li>**l4Flow_newConnectionsRate**: the rate of new connections, measurement unit: per second, metric value type: Float, rounded to two decimal places.</li></ul>**note**:<ul><li>metrics of <code>Integer</code> type will return corresponding time series Data from <code>Data.N.TypeValue</code>;</li>.
<li>Metrics with <code>Float</code> value type will return corresponding time series Data from <code>Data.N.FloatTypeValue</code>.</li></ul>.
     */
    public void setMetricNames(String [] MetricNames) {
        this.MetricNames = MetricNames;
    }

    /**
     * Get Site ID. this parameter will change from selectable to required after may 30, 2024. for details, see the announcement: [tencent cloud EdgeOne: tencentcloud API change notification](https://www.tencentcloud.comom/document/product/1552/104902?from_cn_redirect=1).
Import up to 100 site ids. to query all site data under the tencent cloud root account, use `*` as a replacement. querying account-level data requires permission for all site resources of this api. 
     * @return ZoneIds Site ID. this parameter will change from selectable to required after may 30, 2024. for details, see the announcement: [tencent cloud EdgeOne: tencentcloud API change notification](https://www.tencentcloud.comom/document/product/1552/104902?from_cn_redirect=1).
Import up to 100 site ids. to query all site data under the tencent cloud root account, use `*` as a replacement. querying account-level data requires permission for all site resources of this api.
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set Site ID. this parameter will change from selectable to required after may 30, 2024. for details, see the announcement: [tencent cloud EdgeOne: tencentcloud API change notification](https://www.tencentcloud.comom/document/product/1552/104902?from_cn_redirect=1).
Import up to 100 site ids. to query all site data under the tencent cloud root account, use `*` as a replacement. querying account-level data requires permission for all site resources of this api.
     * @param ZoneIds Site ID. this parameter will change from selectable to required after may 30, 2024. for details, see the announcement: [tencent cloud EdgeOne: tencentcloud API change notification](https://www.tencentcloud.comom/document/product/1552/104902?from_cn_redirect=1).
Import up to 100 site ids. to query all site data under the tencent cloud root account, use `*` as a replacement. querying account-level data requires permission for all site resources of this api.
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get List of L4 proxy IDs. All L4 proxies will be selected if this field is not specified. 
     * @return ProxyIds List of L4 proxy IDs. All L4 proxies will be selected if this field is not specified.
     */
    public String [] getProxyIds() {
        return this.ProxyIds;
    }

    /**
     * Set List of L4 proxy IDs. All L4 proxies will be selected if this field is not specified.
     * @param ProxyIds List of L4 proxy IDs. All L4 proxies will be selected if this field is not specified.
     */
    public void setProxyIds(String [] ProxyIds) {
        this.ProxyIds = ProxyIds;
    }

    /**
     * Get Time granularity of the query. valid values:.
<ul><li>**min**: 1 minute;</li>.
<Li>**5min**: 5 minutes;</li>.
<Li>**Hour**: 1 hour;</li>.
<Li>**Day**: 1 day.</li></ul>if this parameter is not input, the granularity will be automatically inferred based on the interval between the start time and end time. specifically, data will be queried with a granularity of <code>min</code>, <code>5min</code>, <code>hour</code>, and <code>day</code> respectively when the period is no more than 1 hour, no more than 2 days, no more than 7 days, and over 7 days. 
     * @return Interval Time granularity of the query. valid values:.
<ul><li>**min**: 1 minute;</li>.
<Li>**5min**: 5 minutes;</li>.
<Li>**Hour**: 1 hour;</li>.
<Li>**Day**: 1 day.</li></ul>if this parameter is not input, the granularity will be automatically inferred based on the interval between the start time and end time. specifically, data will be queried with a granularity of <code>min</code>, <code>5min</code>, <code>hour</code>, and <code>day</code> respectively when the period is no more than 1 hour, no more than 2 days, no more than 7 days, and over 7 days.
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set Time granularity of the query. valid values:.
<ul><li>**min**: 1 minute;</li>.
<Li>**5min**: 5 minutes;</li>.
<Li>**Hour**: 1 hour;</li>.
<Li>**Day**: 1 day.</li></ul>if this parameter is not input, the granularity will be automatically inferred based on the interval between the start time and end time. specifically, data will be queried with a granularity of <code>min</code>, <code>5min</code>, <code>hour</code>, and <code>day</code> respectively when the period is no more than 1 hour, no more than 2 days, no more than 7 days, and over 7 days.
     * @param Interval Time granularity of the query. valid values:.
<ul><li>**min**: 1 minute;</li>.
<Li>**5min**: 5 minutes;</li>.
<Li>**Hour**: 1 hour;</li>.
<Li>**Day**: 1 day.</li></ul>if this parameter is not input, the granularity will be automatically inferred based on the interval between the start time and end time. specifically, data will be queried with a granularity of <code>min</code>, <code>5min</code>, <code>hour</code>, and <code>day</code> respectively when the period is no more than 1 hour, no more than 2 days, no more than 7 days, and over 7 days.
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get Filter criteria. the detailed Key values of filter criteria are as follows:.
<ul><li>**ruleId**: filter by forwarding rule ID.</li>.
<li>**proxyId**: filters by l4 proxy instance ID.</li></ul>. 
     * @return Filters Filter criteria. the detailed Key values of filter criteria are as follows:.
<ul><li>**ruleId**: filter by forwarding rule ID.</li>.
<li>**proxyId**: filters by l4 proxy instance ID.</li></ul>.
     */
    public QueryCondition [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria. the detailed Key values of filter criteria are as follows:.
<ul><li>**ruleId**: filter by forwarding rule ID.</li>.
<li>**proxyId**: filters by l4 proxy instance ID.</li></ul>.
     * @param Filters Filter criteria. the detailed Key values of filter criteria are as follows:.
<ul><li>**ruleId**: filter by forwarding rule ID.</li>.
<li>**proxyId**: filters by l4 proxy instance ID.</li></ul>.
     */
    public void setFilters(QueryCondition [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Data ownership region. This parameter is deprecated. Please filter data by client region in Filters.country. 
     * @return Area Data ownership region. This parameter is deprecated. Please filter data by client region in Filters.country.
     * @deprecated
     */
    @Deprecated
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Data ownership region. This parameter is deprecated. Please filter data by client region in Filters.country.
     * @param Area Data ownership region. This parameter is deprecated. Please filter data by client region in Filters.country.
     * @deprecated
     */
    @Deprecated
    public void setArea(String Area) {
        this.Area = Area;
    }

    public DescribeTimingL4DataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTimingL4DataRequest(DescribeTimingL4DataRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.MetricNames != null) {
            this.MetricNames = new String[source.MetricNames.length];
            for (int i = 0; i < source.MetricNames.length; i++) {
                this.MetricNames[i] = new String(source.MetricNames[i]);
            }
        }
        if (source.ZoneIds != null) {
            this.ZoneIds = new String[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new String(source.ZoneIds[i]);
            }
        }
        if (source.ProxyIds != null) {
            this.ProxyIds = new String[source.ProxyIds.length];
            for (int i = 0; i < source.ProxyIds.length; i++) {
                this.ProxyIds[i] = new String(source.ProxyIds[i]);
            }
        }
        if (source.Interval != null) {
            this.Interval = new String(source.Interval);
        }
        if (source.Filters != null) {
            this.Filters = new QueryCondition[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new QueryCondition(source.Filters[i]);
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
        this.setParamArraySimple(map, prefix + "MetricNames.", this.MetricNames);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamArraySimple(map, prefix + "ProxyIds.", this.ProxyIds);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}


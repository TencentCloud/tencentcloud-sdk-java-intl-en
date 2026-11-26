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
    * Start time.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time. The query time range (`EndTime` - `StartTime`) must be up to 31 days.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Queried metric. Valid values:
<ul><li>**l4Flow_flux**: Total access traffic, unit: Byte, metric value type: Integer;</li>
<li>**l4Flow_inFlux**: Access inbound traffic, unit: Byte, metric value type: Integer;</li>
<li>**l4Flow_outFlux**: Access outbound traffic, unit: Byte, metric value type: Integer;</li>
<li>**l4Flow_inBandwidth**: Inbound bandwidth peak for access, unit: bps, metric value type: Integer;</li>
<li>**l4Flow_outBandwidth**: Outbound access bandwidth peak, unit: bps, metric value type: Integer;</li>
<li>**l4Flow_connections**: Number of concurrent connections, unit: count, metric value type: Integer;</li>
<li>**l4Flow_newConnectionsRate**: Rate of new connections, unit: connections/second, metric value type: Float, rounded to two decimal places.</li></ul>**Note**:<ul><li>Metrics of the <code>Integer</code> value type will return corresponding time series data from <code>Data.N.TypeValue</code>;</li>
<li>Metrics of the <code>Float</code> value type return corresponding time series data from <code>Data.N.FloatTypeValue</code>.</li></ul>
    */
    @SerializedName("MetricNames")
    @Expose
    private String [] MetricNames;

    /**
    * Site ID. This parameter will change from selectable to required after May 30, 2024. For details, see the announcement: [Tencent Cloud EdgeOne Cloud API Change Notification](https://www.tencentcloud.com/document/product/1552/104902?from_cn_redirect=1).
Import up to 100 site IDs. To query data of all sites under the Tencent Cloud root account, use `*` instead. To query account-level data, you must have permissions for all site resources of this interface.
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * Layer-4 instance list. If not specified, it means select all instances.
    */
    @SerializedName("ProxyIds")
    @Expose
    private String [] ProxyIds;

    /**
    * Time granularity of the query. Valid values:
<ul><li>**min**: 1 minute;</li>
<li>**5min**: 5 minutes;</li>
<li>**hour**: 1 hour;</li>
<li>**day**: 1 day.</li></ul>If this parameter is not input, the granularity will be automatically calculated based on the interval between the start time and end time. Specifically, data will be queried with a granularity of <code>min</code>, <code>5min</code>, <code>hour</code>, and <code>day</code> respectively when the period is no more than 1 hour, no more than 2 days, no more than 7 days, and over 7 days.
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * Filter criteria. The detailed Key values of filter criteria are as follows:
<ul><li>**ruleId**: Filter by forwarding rule ID.</li>
<li>**proxyId**: filter by L4 proxy instance ID.</li></ul>
    */
    @SerializedName("Filters")
    @Expose
    private QueryCondition [] Filters;

    /**
    * Data ownership region. Deprecated. Filter data by client region in Filters.country.
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
     * Get Start time. 
     * @return StartTime Start time.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time.
     * @param StartTime Start time.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time. The query time range (`EndTime` - `StartTime`) must be up to 31 days. 
     * @return EndTime End time. The query time range (`EndTime` - `StartTime`) must be up to 31 days.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time. The query time range (`EndTime` - `StartTime`) must be up to 31 days.
     * @param EndTime End time. The query time range (`EndTime` - `StartTime`) must be up to 31 days.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Queried metric. Valid values:
<ul><li>**l4Flow_flux**: Total access traffic, unit: Byte, metric value type: Integer;</li>
<li>**l4Flow_inFlux**: Access inbound traffic, unit: Byte, metric value type: Integer;</li>
<li>**l4Flow_outFlux**: Access outbound traffic, unit: Byte, metric value type: Integer;</li>
<li>**l4Flow_inBandwidth**: Inbound bandwidth peak for access, unit: bps, metric value type: Integer;</li>
<li>**l4Flow_outBandwidth**: Outbound access bandwidth peak, unit: bps, metric value type: Integer;</li>
<li>**l4Flow_connections**: Number of concurrent connections, unit: count, metric value type: Integer;</li>
<li>**l4Flow_newConnectionsRate**: Rate of new connections, unit: connections/second, metric value type: Float, rounded to two decimal places.</li></ul>**Note**:<ul><li>Metrics of the <code>Integer</code> value type will return corresponding time series data from <code>Data.N.TypeValue</code>;</li>
<li>Metrics of the <code>Float</code> value type return corresponding time series data from <code>Data.N.FloatTypeValue</code>.</li></ul> 
     * @return MetricNames Queried metric. Valid values:
<ul><li>**l4Flow_flux**: Total access traffic, unit: Byte, metric value type: Integer;</li>
<li>**l4Flow_inFlux**: Access inbound traffic, unit: Byte, metric value type: Integer;</li>
<li>**l4Flow_outFlux**: Access outbound traffic, unit: Byte, metric value type: Integer;</li>
<li>**l4Flow_inBandwidth**: Inbound bandwidth peak for access, unit: bps, metric value type: Integer;</li>
<li>**l4Flow_outBandwidth**: Outbound access bandwidth peak, unit: bps, metric value type: Integer;</li>
<li>**l4Flow_connections**: Number of concurrent connections, unit: count, metric value type: Integer;</li>
<li>**l4Flow_newConnectionsRate**: Rate of new connections, unit: connections/second, metric value type: Float, rounded to two decimal places.</li></ul>**Note**:<ul><li>Metrics of the <code>Integer</code> value type will return corresponding time series data from <code>Data.N.TypeValue</code>;</li>
<li>Metrics of the <code>Float</code> value type return corresponding time series data from <code>Data.N.FloatTypeValue</code>.</li></ul>
     */
    public String [] getMetricNames() {
        return this.MetricNames;
    }

    /**
     * Set Queried metric. Valid values:
<ul><li>**l4Flow_flux**: Total access traffic, unit: Byte, metric value type: Integer;</li>
<li>**l4Flow_inFlux**: Access inbound traffic, unit: Byte, metric value type: Integer;</li>
<li>**l4Flow_outFlux**: Access outbound traffic, unit: Byte, metric value type: Integer;</li>
<li>**l4Flow_inBandwidth**: Inbound bandwidth peak for access, unit: bps, metric value type: Integer;</li>
<li>**l4Flow_outBandwidth**: Outbound access bandwidth peak, unit: bps, metric value type: Integer;</li>
<li>**l4Flow_connections**: Number of concurrent connections, unit: count, metric value type: Integer;</li>
<li>**l4Flow_newConnectionsRate**: Rate of new connections, unit: connections/second, metric value type: Float, rounded to two decimal places.</li></ul>**Note**:<ul><li>Metrics of the <code>Integer</code> value type will return corresponding time series data from <code>Data.N.TypeValue</code>;</li>
<li>Metrics of the <code>Float</code> value type return corresponding time series data from <code>Data.N.FloatTypeValue</code>.</li></ul>
     * @param MetricNames Queried metric. Valid values:
<ul><li>**l4Flow_flux**: Total access traffic, unit: Byte, metric value type: Integer;</li>
<li>**l4Flow_inFlux**: Access inbound traffic, unit: Byte, metric value type: Integer;</li>
<li>**l4Flow_outFlux**: Access outbound traffic, unit: Byte, metric value type: Integer;</li>
<li>**l4Flow_inBandwidth**: Inbound bandwidth peak for access, unit: bps, metric value type: Integer;</li>
<li>**l4Flow_outBandwidth**: Outbound access bandwidth peak, unit: bps, metric value type: Integer;</li>
<li>**l4Flow_connections**: Number of concurrent connections, unit: count, metric value type: Integer;</li>
<li>**l4Flow_newConnectionsRate**: Rate of new connections, unit: connections/second, metric value type: Float, rounded to two decimal places.</li></ul>**Note**:<ul><li>Metrics of the <code>Integer</code> value type will return corresponding time series data from <code>Data.N.TypeValue</code>;</li>
<li>Metrics of the <code>Float</code> value type return corresponding time series data from <code>Data.N.FloatTypeValue</code>.</li></ul>
     */
    public void setMetricNames(String [] MetricNames) {
        this.MetricNames = MetricNames;
    }

    /**
     * Get Site ID. This parameter will change from selectable to required after May 30, 2024. For details, see the announcement: [Tencent Cloud EdgeOne Cloud API Change Notification](https://www.tencentcloud.com/document/product/1552/104902?from_cn_redirect=1).
Import up to 100 site IDs. To query data of all sites under the Tencent Cloud root account, use `*` instead. To query account-level data, you must have permissions for all site resources of this interface. 
     * @return ZoneIds Site ID. This parameter will change from selectable to required after May 30, 2024. For details, see the announcement: [Tencent Cloud EdgeOne Cloud API Change Notification](https://www.tencentcloud.com/document/product/1552/104902?from_cn_redirect=1).
Import up to 100 site IDs. To query data of all sites under the Tencent Cloud root account, use `*` instead. To query account-level data, you must have permissions for all site resources of this interface.
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set Site ID. This parameter will change from selectable to required after May 30, 2024. For details, see the announcement: [Tencent Cloud EdgeOne Cloud API Change Notification](https://www.tencentcloud.com/document/product/1552/104902?from_cn_redirect=1).
Import up to 100 site IDs. To query data of all sites under the Tencent Cloud root account, use `*` instead. To query account-level data, you must have permissions for all site resources of this interface.
     * @param ZoneIds Site ID. This parameter will change from selectable to required after May 30, 2024. For details, see the announcement: [Tencent Cloud EdgeOne Cloud API Change Notification](https://www.tencentcloud.com/document/product/1552/104902?from_cn_redirect=1).
Import up to 100 site IDs. To query data of all sites under the Tencent Cloud root account, use `*` instead. To query account-level data, you must have permissions for all site resources of this interface.
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get Layer-4 instance list. If not specified, it means select all instances. 
     * @return ProxyIds Layer-4 instance list. If not specified, it means select all instances.
     */
    public String [] getProxyIds() {
        return this.ProxyIds;
    }

    /**
     * Set Layer-4 instance list. If not specified, it means select all instances.
     * @param ProxyIds Layer-4 instance list. If not specified, it means select all instances.
     */
    public void setProxyIds(String [] ProxyIds) {
        this.ProxyIds = ProxyIds;
    }

    /**
     * Get Time granularity of the query. Valid values:
<ul><li>**min**: 1 minute;</li>
<li>**5min**: 5 minutes;</li>
<li>**hour**: 1 hour;</li>
<li>**day**: 1 day.</li></ul>If this parameter is not input, the granularity will be automatically calculated based on the interval between the start time and end time. Specifically, data will be queried with a granularity of <code>min</code>, <code>5min</code>, <code>hour</code>, and <code>day</code> respectively when the period is no more than 1 hour, no more than 2 days, no more than 7 days, and over 7 days. 
     * @return Interval Time granularity of the query. Valid values:
<ul><li>**min**: 1 minute;</li>
<li>**5min**: 5 minutes;</li>
<li>**hour**: 1 hour;</li>
<li>**day**: 1 day.</li></ul>If this parameter is not input, the granularity will be automatically calculated based on the interval between the start time and end time. Specifically, data will be queried with a granularity of <code>min</code>, <code>5min</code>, <code>hour</code>, and <code>day</code> respectively when the period is no more than 1 hour, no more than 2 days, no more than 7 days, and over 7 days.
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set Time granularity of the query. Valid values:
<ul><li>**min**: 1 minute;</li>
<li>**5min**: 5 minutes;</li>
<li>**hour**: 1 hour;</li>
<li>**day**: 1 day.</li></ul>If this parameter is not input, the granularity will be automatically calculated based on the interval between the start time and end time. Specifically, data will be queried with a granularity of <code>min</code>, <code>5min</code>, <code>hour</code>, and <code>day</code> respectively when the period is no more than 1 hour, no more than 2 days, no more than 7 days, and over 7 days.
     * @param Interval Time granularity of the query. Valid values:
<ul><li>**min**: 1 minute;</li>
<li>**5min**: 5 minutes;</li>
<li>**hour**: 1 hour;</li>
<li>**day**: 1 day.</li></ul>If this parameter is not input, the granularity will be automatically calculated based on the interval between the start time and end time. Specifically, data will be queried with a granularity of <code>min</code>, <code>5min</code>, <code>hour</code>, and <code>day</code> respectively when the period is no more than 1 hour, no more than 2 days, no more than 7 days, and over 7 days.
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get Filter criteria. The detailed Key values of filter criteria are as follows:
<ul><li>**ruleId**: Filter by forwarding rule ID.</li>
<li>**proxyId**: filter by L4 proxy instance ID.</li></ul> 
     * @return Filters Filter criteria. The detailed Key values of filter criteria are as follows:
<ul><li>**ruleId**: Filter by forwarding rule ID.</li>
<li>**proxyId**: filter by L4 proxy instance ID.</li></ul>
     */
    public QueryCondition [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria. The detailed Key values of filter criteria are as follows:
<ul><li>**ruleId**: Filter by forwarding rule ID.</li>
<li>**proxyId**: filter by L4 proxy instance ID.</li></ul>
     * @param Filters Filter criteria. The detailed Key values of filter criteria are as follows:
<ul><li>**ruleId**: Filter by forwarding rule ID.</li>
<li>**proxyId**: filter by L4 proxy instance ID.</li></ul>
     */
    public void setFilters(QueryCondition [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Data ownership region. Deprecated. Filter data by client region in Filters.country. 
     * @return Area Data ownership region. Deprecated. Filter data by client region in Filters.country.
     * @deprecated
     */
    @Deprecated
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Data ownership region. Deprecated. Filter data by client region in Filters.country.
     * @param Area Data ownership region. Deprecated. Filter data by client region in Filters.country.
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


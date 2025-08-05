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
    * Metric list. Valid values:
<Li>l4Flow_connections: number of concurrent connections;</li>
<Li>l4Flow_flux: total traffic;</li>
<Li>l4Flow_inFlux: inbound traffic;</li>
<Li>l4Flow_outFlux: outbound traffic.</li>
<Li>l4Flow_inBandwidth: inbound peak bandwidth.</li>
<Li>l4Flow_outBandwidth: outbound peak bandwidth.</li>
    */
    @SerializedName("MetricNames")
    @Expose
    private String [] MetricNames;

    /**
    * Site ID set. this parameter is required. a maximum of 100 site ids can be imported. use `*` to query data for all sites under the tencent cloud root account. to query account-level data, you must have resource permissions for all sites in this api.
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
    * The query granularity. Values:
<li>`min`: 1 minute;</li>
<li>`5min`: 5 minutes;</li>
<li>`hour`: 1 hour;</li>
<li>`day`: 1 day.</li>If this field is not specified, the granularity will be determined based on the query period. <br>Period <= 1 hour: `min`; <br>1 hour < period <= 2 days: `5min`; <br>2 days < period <= 7 days: `hour`; <br>Period > 7 days: `day`.

    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * Filter criteria. The detailed key values of filter criteria are as follows:
<li>ruleId: filter by forwarding rule ID.</li>
<li>proxyId: filter by L4 proxy instance ID.</li>
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
     * Get Metric list. Valid values:
<Li>l4Flow_connections: number of concurrent connections;</li>
<Li>l4Flow_flux: total traffic;</li>
<Li>l4Flow_inFlux: inbound traffic;</li>
<Li>l4Flow_outFlux: outbound traffic.</li>
<Li>l4Flow_inBandwidth: inbound peak bandwidth.</li>
<Li>l4Flow_outBandwidth: outbound peak bandwidth.</li> 
     * @return MetricNames Metric list. Valid values:
<Li>l4Flow_connections: number of concurrent connections;</li>
<Li>l4Flow_flux: total traffic;</li>
<Li>l4Flow_inFlux: inbound traffic;</li>
<Li>l4Flow_outFlux: outbound traffic.</li>
<Li>l4Flow_inBandwidth: inbound peak bandwidth.</li>
<Li>l4Flow_outBandwidth: outbound peak bandwidth.</li>
     */
    public String [] getMetricNames() {
        return this.MetricNames;
    }

    /**
     * Set Metric list. Valid values:
<Li>l4Flow_connections: number of concurrent connections;</li>
<Li>l4Flow_flux: total traffic;</li>
<Li>l4Flow_inFlux: inbound traffic;</li>
<Li>l4Flow_outFlux: outbound traffic.</li>
<Li>l4Flow_inBandwidth: inbound peak bandwidth.</li>
<Li>l4Flow_outBandwidth: outbound peak bandwidth.</li>
     * @param MetricNames Metric list. Valid values:
<Li>l4Flow_connections: number of concurrent connections;</li>
<Li>l4Flow_flux: total traffic;</li>
<Li>l4Flow_inFlux: inbound traffic;</li>
<Li>l4Flow_outFlux: outbound traffic.</li>
<Li>l4Flow_inBandwidth: inbound peak bandwidth.</li>
<Li>l4Flow_outBandwidth: outbound peak bandwidth.</li>
     */
    public void setMetricNames(String [] MetricNames) {
        this.MetricNames = MetricNames;
    }

    /**
     * Get Site ID set. this parameter is required. a maximum of 100 site ids can be imported. use `*` to query data for all sites under the tencent cloud root account. to query account-level data, you must have resource permissions for all sites in this api. 
     * @return ZoneIds Site ID set. this parameter is required. a maximum of 100 site ids can be imported. use `*` to query data for all sites under the tencent cloud root account. to query account-level data, you must have resource permissions for all sites in this api.
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set Site ID set. this parameter is required. a maximum of 100 site ids can be imported. use `*` to query data for all sites under the tencent cloud root account. to query account-level data, you must have resource permissions for all sites in this api.
     * @param ZoneIds Site ID set. this parameter is required. a maximum of 100 site ids can be imported. use `*` to query data for all sites under the tencent cloud root account. to query account-level data, you must have resource permissions for all sites in this api.
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
     * Get The query granularity. Values:
<li>`min`: 1 minute;</li>
<li>`5min`: 5 minutes;</li>
<li>`hour`: 1 hour;</li>
<li>`day`: 1 day.</li>If this field is not specified, the granularity will be determined based on the query period. <br>Period <= 1 hour: `min`; <br>1 hour < period <= 2 days: `5min`; <br>2 days < period <= 7 days: `hour`; <br>Period > 7 days: `day`.
 
     * @return Interval The query granularity. Values:
<li>`min`: 1 minute;</li>
<li>`5min`: 5 minutes;</li>
<li>`hour`: 1 hour;</li>
<li>`day`: 1 day.</li>If this field is not specified, the granularity will be determined based on the query period. <br>Period <= 1 hour: `min`; <br>1 hour < period <= 2 days: `5min`; <br>2 days < period <= 7 days: `hour`; <br>Period > 7 days: `day`.

     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set The query granularity. Values:
<li>`min`: 1 minute;</li>
<li>`5min`: 5 minutes;</li>
<li>`hour`: 1 hour;</li>
<li>`day`: 1 day.</li>If this field is not specified, the granularity will be determined based on the query period. <br>Period <= 1 hour: `min`; <br>1 hour < period <= 2 days: `5min`; <br>2 days < period <= 7 days: `hour`; <br>Period > 7 days: `day`.

     * @param Interval The query granularity. Values:
<li>`min`: 1 minute;</li>
<li>`5min`: 5 minutes;</li>
<li>`hour`: 1 hour;</li>
<li>`day`: 1 day.</li>If this field is not specified, the granularity will be determined based on the query period. <br>Period <= 1 hour: `min`; <br>1 hour < period <= 2 days: `5min`; <br>2 days < period <= 7 days: `hour`; <br>Period > 7 days: `day`.

     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get Filter criteria. The detailed key values of filter criteria are as follows:
<li>ruleId: filter by forwarding rule ID.</li>
<li>proxyId: filter by L4 proxy instance ID.</li> 
     * @return Filters Filter criteria. The detailed key values of filter criteria are as follows:
<li>ruleId: filter by forwarding rule ID.</li>
<li>proxyId: filter by L4 proxy instance ID.</li>
     */
    public QueryCondition [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria. The detailed key values of filter criteria are as follows:
<li>ruleId: filter by forwarding rule ID.</li>
<li>proxyId: filter by L4 proxy instance ID.</li>
     * @param Filters Filter criteria. The detailed key values of filter criteria are as follows:
<li>ruleId: filter by forwarding rule ID.</li>
<li>proxyId: filter by L4 proxy instance ID.</li>
     */
    public void setFilters(QueryCondition [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Data ownership region. This parameter is deprecated. Please filter data by client region in Filters.country. 
     * @return Area Data ownership region. This parameter is deprecated. Please filter data by client region in Filters.country.
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Data ownership region. This parameter is deprecated. Please filter data by client region in Filters.country.
     * @param Area Data ownership region. This parameter is deprecated. Please filter data by client region in Filters.country.
     */
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


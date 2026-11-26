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

public class DescribeTimingL7CacheDataRequest extends AbstractModel {

    /**
    * Start time.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Queried metric. Valid values:
<li>l7Cache_outFlux: response traffic;</li>
<li>l7Cache_request: number of response requests;</li>
<li> l7Cache_outBandwidth: response bandwidth.</li>
    */
    @SerializedName("MetricNames")
    @Expose
    private String [] MetricNames;

    /**
    * Site ID set. This parameter is required.
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * Filter criteria. The detailed filter criteria are as follows:
<li>domain<br>   Filter by [<strong>subdomain</strong>]. The subdomain format is test.example.com.<br>   Type: String<br>   Required: No</li>
<li>url<br>   Filter by <strong>URL</strong>. This parameter supports only a 30-day time range. The URL format is /content.<br>   Type: String<br>   Required: No</li>
<li>resourceType<br>        Filter by [<strong>resource type</strong>]. This parameter supports only a 30-day time range. Resource types include jpg and png.<br>        Type: String<br>        Required: No</li>
<li>cacheType<br>        Filter by <strong>cache type</strong>.<br>        Type: String<br>        Required: No<br>        Options:<br>        hit: cache hit;<br>        dynamic: non-cacheable resource;<br>        miss: cache miss.</li>
<li>statusCode<br>   Filter by <strong>status code</strong>. This parameter supports only a 30-day time range.<br>   Type: String<br>   Required: No<br>   Options:<br>   1XX: 1xx status codes;<br>   100: 100 status code;<br>   101: 101 status code;<br>   102: 102 status code;<br>   2XX: 2xx status codes;<br>   200: 200 status code;<br>   201: 201 status code;<br>   202: 202 status code;<br>   203: 203 status code;<br>   204: 204 status code;<br>   100: 100 status code;<br>   206: 206 status code;<br>   207: 207 status code;<br>   3XX: 3xx status codes;<br>   300: 300 status code;<br>   301: 301 status code;<br>   302: 302 status code;<br>   303: 303 status code;<br>   304: 304 status code;<br>   305: 305 status code;<br>   307: 307 status code;<br>   4XX: 4xx status codes;<br>   400: 400 status code;<br>   401: 401 status code;<br>   402: 402 status code;<br>   403: 403 status code;<br>   404: 404 status code;<br>   405: 405 status code;<br>   406: 406 status code;<br>   407: 407 status code;<br>   408: 408 status code;<br>   409: 409 status code;<br>   410: 410 status code;<br>   411: 411 status code;<br>   412: 412 status code;<br>   412: 413 status code;<br>   414: 414 status code;<br>   415: 415 status code;<br>   416: 416 status code;<br>   417: 417 status code;<br>   422: 422 status code;<br>   423: 423 status code;<br>   424: 424 status code;<br>   426: 426 status code;<br>   451: 451 status code;<br>   5XX: 5xx status codes;<br>   500: 500 status code;<br>   501: 501 status code;<br>   502: 502 status code;<br>   503: 503 status code;<br>   504: 504 status code;<br>   505: 505 status code;<br>   506: 506 status code;<br>   507: 507 status code;<br>   510: 510 status code;<br>   514: 514 status code;<br>   544: 544 status code.</li>
<li>tagKey<br>   Filter by [<strong>tag key</strong>].<br>   Type: String<br>   Required: No</li>
<li>tagValue<br>?? Filter by [<strong>tag value</strong>].<br>?? Type: String<br>?? Required: No</li>
    */
    @SerializedName("Filters")
    @Expose
    private QueryCondition [] Filters;

    /**
    * Time granularity of the query. Optional values:
<li>min: 1-minute time granularity;</li>
<li>5min: 5-minute time granularity;</li>
<li>hour: 1-hour time granularity;</li>
<li>day: 1-day time granularity.</li>If this parameter is not input, the granularity will be automatically calculated based on the interval between the start time and end time. Specifically, data will be queried with a granularity of min, 5min, hour, and day respectively when the period is no more than 1 hour, no more than 2 days, no more than 7 days, and over 7 days.
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * Data ownership region. Valid values:
<li>overseas: global (excluding the Chinese mainland) data;</li>
<li>mainland: Chinese mainland data;</li>
<li>global: global data.</li>If this parameter is not input, the default value `global` is used.
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
     * Get End time. 
     * @return EndTime End time.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time.
     * @param EndTime End time.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Queried metric. Valid values:
<li>l7Cache_outFlux: response traffic;</li>
<li>l7Cache_request: number of response requests;</li>
<li> l7Cache_outBandwidth: response bandwidth.</li> 
     * @return MetricNames Queried metric. Valid values:
<li>l7Cache_outFlux: response traffic;</li>
<li>l7Cache_request: number of response requests;</li>
<li> l7Cache_outBandwidth: response bandwidth.</li>
     */
    public String [] getMetricNames() {
        return this.MetricNames;
    }

    /**
     * Set Queried metric. Valid values:
<li>l7Cache_outFlux: response traffic;</li>
<li>l7Cache_request: number of response requests;</li>
<li> l7Cache_outBandwidth: response bandwidth.</li>
     * @param MetricNames Queried metric. Valid values:
<li>l7Cache_outFlux: response traffic;</li>
<li>l7Cache_request: number of response requests;</li>
<li> l7Cache_outBandwidth: response bandwidth.</li>
     */
    public void setMetricNames(String [] MetricNames) {
        this.MetricNames = MetricNames;
    }

    /**
     * Get Site ID set. This parameter is required. 
     * @return ZoneIds Site ID set. This parameter is required.
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set Site ID set. This parameter is required.
     * @param ZoneIds Site ID set. This parameter is required.
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get Filter criteria. The detailed filter criteria are as follows:
<li>domain<br>   Filter by [<strong>subdomain</strong>]. The subdomain format is test.example.com.<br>   Type: String<br>   Required: No</li>
<li>url<br>   Filter by <strong>URL</strong>. This parameter supports only a 30-day time range. The URL format is /content.<br>   Type: String<br>   Required: No</li>
<li>resourceType<br>        Filter by [<strong>resource type</strong>]. This parameter supports only a 30-day time range. Resource types include jpg and png.<br>        Type: String<br>        Required: No</li>
<li>cacheType<br>        Filter by <strong>cache type</strong>.<br>        Type: String<br>        Required: No<br>        Options:<br>        hit: cache hit;<br>        dynamic: non-cacheable resource;<br>        miss: cache miss.</li>
<li>statusCode<br>   Filter by <strong>status code</strong>. This parameter supports only a 30-day time range.<br>   Type: String<br>   Required: No<br>   Options:<br>   1XX: 1xx status codes;<br>   100: 100 status code;<br>   101: 101 status code;<br>   102: 102 status code;<br>   2XX: 2xx status codes;<br>   200: 200 status code;<br>   201: 201 status code;<br>   202: 202 status code;<br>   203: 203 status code;<br>   204: 204 status code;<br>   100: 100 status code;<br>   206: 206 status code;<br>   207: 207 status code;<br>   3XX: 3xx status codes;<br>   300: 300 status code;<br>   301: 301 status code;<br>   302: 302 status code;<br>   303: 303 status code;<br>   304: 304 status code;<br>   305: 305 status code;<br>   307: 307 status code;<br>   4XX: 4xx status codes;<br>   400: 400 status code;<br>   401: 401 status code;<br>   402: 402 status code;<br>   403: 403 status code;<br>   404: 404 status code;<br>   405: 405 status code;<br>   406: 406 status code;<br>   407: 407 status code;<br>   408: 408 status code;<br>   409: 409 status code;<br>   410: 410 status code;<br>   411: 411 status code;<br>   412: 412 status code;<br>   412: 413 status code;<br>   414: 414 status code;<br>   415: 415 status code;<br>   416: 416 status code;<br>   417: 417 status code;<br>   422: 422 status code;<br>   423: 423 status code;<br>   424: 424 status code;<br>   426: 426 status code;<br>   451: 451 status code;<br>   5XX: 5xx status codes;<br>   500: 500 status code;<br>   501: 501 status code;<br>   502: 502 status code;<br>   503: 503 status code;<br>   504: 504 status code;<br>   505: 505 status code;<br>   506: 506 status code;<br>   507: 507 status code;<br>   510: 510 status code;<br>   514: 514 status code;<br>   544: 544 status code.</li>
<li>tagKey<br>   Filter by [<strong>tag key</strong>].<br>   Type: String<br>   Required: No</li>
<li>tagValue<br>?? Filter by [<strong>tag value</strong>].<br>?? Type: String<br>?? Required: No</li> 
     * @return Filters Filter criteria. The detailed filter criteria are as follows:
<li>domain<br>   Filter by [<strong>subdomain</strong>]. The subdomain format is test.example.com.<br>   Type: String<br>   Required: No</li>
<li>url<br>   Filter by <strong>URL</strong>. This parameter supports only a 30-day time range. The URL format is /content.<br>   Type: String<br>   Required: No</li>
<li>resourceType<br>        Filter by [<strong>resource type</strong>]. This parameter supports only a 30-day time range. Resource types include jpg and png.<br>        Type: String<br>        Required: No</li>
<li>cacheType<br>        Filter by <strong>cache type</strong>.<br>        Type: String<br>        Required: No<br>        Options:<br>        hit: cache hit;<br>        dynamic: non-cacheable resource;<br>        miss: cache miss.</li>
<li>statusCode<br>   Filter by <strong>status code</strong>. This parameter supports only a 30-day time range.<br>   Type: String<br>   Required: No<br>   Options:<br>   1XX: 1xx status codes;<br>   100: 100 status code;<br>   101: 101 status code;<br>   102: 102 status code;<br>   2XX: 2xx status codes;<br>   200: 200 status code;<br>   201: 201 status code;<br>   202: 202 status code;<br>   203: 203 status code;<br>   204: 204 status code;<br>   100: 100 status code;<br>   206: 206 status code;<br>   207: 207 status code;<br>   3XX: 3xx status codes;<br>   300: 300 status code;<br>   301: 301 status code;<br>   302: 302 status code;<br>   303: 303 status code;<br>   304: 304 status code;<br>   305: 305 status code;<br>   307: 307 status code;<br>   4XX: 4xx status codes;<br>   400: 400 status code;<br>   401: 401 status code;<br>   402: 402 status code;<br>   403: 403 status code;<br>   404: 404 status code;<br>   405: 405 status code;<br>   406: 406 status code;<br>   407: 407 status code;<br>   408: 408 status code;<br>   409: 409 status code;<br>   410: 410 status code;<br>   411: 411 status code;<br>   412: 412 status code;<br>   412: 413 status code;<br>   414: 414 status code;<br>   415: 415 status code;<br>   416: 416 status code;<br>   417: 417 status code;<br>   422: 422 status code;<br>   423: 423 status code;<br>   424: 424 status code;<br>   426: 426 status code;<br>   451: 451 status code;<br>   5XX: 5xx status codes;<br>   500: 500 status code;<br>   501: 501 status code;<br>   502: 502 status code;<br>   503: 503 status code;<br>   504: 504 status code;<br>   505: 505 status code;<br>   506: 506 status code;<br>   507: 507 status code;<br>   510: 510 status code;<br>   514: 514 status code;<br>   544: 544 status code.</li>
<li>tagKey<br>   Filter by [<strong>tag key</strong>].<br>   Type: String<br>   Required: No</li>
<li>tagValue<br>?? Filter by [<strong>tag value</strong>].<br>?? Type: String<br>?? Required: No</li>
     */
    public QueryCondition [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria. The detailed filter criteria are as follows:
<li>domain<br>   Filter by [<strong>subdomain</strong>]. The subdomain format is test.example.com.<br>   Type: String<br>   Required: No</li>
<li>url<br>   Filter by <strong>URL</strong>. This parameter supports only a 30-day time range. The URL format is /content.<br>   Type: String<br>   Required: No</li>
<li>resourceType<br>        Filter by [<strong>resource type</strong>]. This parameter supports only a 30-day time range. Resource types include jpg and png.<br>        Type: String<br>        Required: No</li>
<li>cacheType<br>        Filter by <strong>cache type</strong>.<br>        Type: String<br>        Required: No<br>        Options:<br>        hit: cache hit;<br>        dynamic: non-cacheable resource;<br>        miss: cache miss.</li>
<li>statusCode<br>   Filter by <strong>status code</strong>. This parameter supports only a 30-day time range.<br>   Type: String<br>   Required: No<br>   Options:<br>   1XX: 1xx status codes;<br>   100: 100 status code;<br>   101: 101 status code;<br>   102: 102 status code;<br>   2XX: 2xx status codes;<br>   200: 200 status code;<br>   201: 201 status code;<br>   202: 202 status code;<br>   203: 203 status code;<br>   204: 204 status code;<br>   100: 100 status code;<br>   206: 206 status code;<br>   207: 207 status code;<br>   3XX: 3xx status codes;<br>   300: 300 status code;<br>   301: 301 status code;<br>   302: 302 status code;<br>   303: 303 status code;<br>   304: 304 status code;<br>   305: 305 status code;<br>   307: 307 status code;<br>   4XX: 4xx status codes;<br>   400: 400 status code;<br>   401: 401 status code;<br>   402: 402 status code;<br>   403: 403 status code;<br>   404: 404 status code;<br>   405: 405 status code;<br>   406: 406 status code;<br>   407: 407 status code;<br>   408: 408 status code;<br>   409: 409 status code;<br>   410: 410 status code;<br>   411: 411 status code;<br>   412: 412 status code;<br>   412: 413 status code;<br>   414: 414 status code;<br>   415: 415 status code;<br>   416: 416 status code;<br>   417: 417 status code;<br>   422: 422 status code;<br>   423: 423 status code;<br>   424: 424 status code;<br>   426: 426 status code;<br>   451: 451 status code;<br>   5XX: 5xx status codes;<br>   500: 500 status code;<br>   501: 501 status code;<br>   502: 502 status code;<br>   503: 503 status code;<br>   504: 504 status code;<br>   505: 505 status code;<br>   506: 506 status code;<br>   507: 507 status code;<br>   510: 510 status code;<br>   514: 514 status code;<br>   544: 544 status code.</li>
<li>tagKey<br>   Filter by [<strong>tag key</strong>].<br>   Type: String<br>   Required: No</li>
<li>tagValue<br>?? Filter by [<strong>tag value</strong>].<br>?? Type: String<br>?? Required: No</li>
     * @param Filters Filter criteria. The detailed filter criteria are as follows:
<li>domain<br>   Filter by [<strong>subdomain</strong>]. The subdomain format is test.example.com.<br>   Type: String<br>   Required: No</li>
<li>url<br>   Filter by <strong>URL</strong>. This parameter supports only a 30-day time range. The URL format is /content.<br>   Type: String<br>   Required: No</li>
<li>resourceType<br>        Filter by [<strong>resource type</strong>]. This parameter supports only a 30-day time range. Resource types include jpg and png.<br>        Type: String<br>        Required: No</li>
<li>cacheType<br>        Filter by <strong>cache type</strong>.<br>        Type: String<br>        Required: No<br>        Options:<br>        hit: cache hit;<br>        dynamic: non-cacheable resource;<br>        miss: cache miss.</li>
<li>statusCode<br>   Filter by <strong>status code</strong>. This parameter supports only a 30-day time range.<br>   Type: String<br>   Required: No<br>   Options:<br>   1XX: 1xx status codes;<br>   100: 100 status code;<br>   101: 101 status code;<br>   102: 102 status code;<br>   2XX: 2xx status codes;<br>   200: 200 status code;<br>   201: 201 status code;<br>   202: 202 status code;<br>   203: 203 status code;<br>   204: 204 status code;<br>   100: 100 status code;<br>   206: 206 status code;<br>   207: 207 status code;<br>   3XX: 3xx status codes;<br>   300: 300 status code;<br>   301: 301 status code;<br>   302: 302 status code;<br>   303: 303 status code;<br>   304: 304 status code;<br>   305: 305 status code;<br>   307: 307 status code;<br>   4XX: 4xx status codes;<br>   400: 400 status code;<br>   401: 401 status code;<br>   402: 402 status code;<br>   403: 403 status code;<br>   404: 404 status code;<br>   405: 405 status code;<br>   406: 406 status code;<br>   407: 407 status code;<br>   408: 408 status code;<br>   409: 409 status code;<br>   410: 410 status code;<br>   411: 411 status code;<br>   412: 412 status code;<br>   412: 413 status code;<br>   414: 414 status code;<br>   415: 415 status code;<br>   416: 416 status code;<br>   417: 417 status code;<br>   422: 422 status code;<br>   423: 423 status code;<br>   424: 424 status code;<br>   426: 426 status code;<br>   451: 451 status code;<br>   5XX: 5xx status codes;<br>   500: 500 status code;<br>   501: 501 status code;<br>   502: 502 status code;<br>   503: 503 status code;<br>   504: 504 status code;<br>   505: 505 status code;<br>   506: 506 status code;<br>   507: 507 status code;<br>   510: 510 status code;<br>   514: 514 status code;<br>   544: 544 status code.</li>
<li>tagKey<br>   Filter by [<strong>tag key</strong>].<br>   Type: String<br>   Required: No</li>
<li>tagValue<br>?? Filter by [<strong>tag value</strong>].<br>?? Type: String<br>?? Required: No</li>
     */
    public void setFilters(QueryCondition [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Time granularity of the query. Optional values:
<li>min: 1-minute time granularity;</li>
<li>5min: 5-minute time granularity;</li>
<li>hour: 1-hour time granularity;</li>
<li>day: 1-day time granularity.</li>If this parameter is not input, the granularity will be automatically calculated based on the interval between the start time and end time. Specifically, data will be queried with a granularity of min, 5min, hour, and day respectively when the period is no more than 1 hour, no more than 2 days, no more than 7 days, and over 7 days. 
     * @return Interval Time granularity of the query. Optional values:
<li>min: 1-minute time granularity;</li>
<li>5min: 5-minute time granularity;</li>
<li>hour: 1-hour time granularity;</li>
<li>day: 1-day time granularity.</li>If this parameter is not input, the granularity will be automatically calculated based on the interval between the start time and end time. Specifically, data will be queried with a granularity of min, 5min, hour, and day respectively when the period is no more than 1 hour, no more than 2 days, no more than 7 days, and over 7 days.
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set Time granularity of the query. Optional values:
<li>min: 1-minute time granularity;</li>
<li>5min: 5-minute time granularity;</li>
<li>hour: 1-hour time granularity;</li>
<li>day: 1-day time granularity.</li>If this parameter is not input, the granularity will be automatically calculated based on the interval between the start time and end time. Specifically, data will be queried with a granularity of min, 5min, hour, and day respectively when the period is no more than 1 hour, no more than 2 days, no more than 7 days, and over 7 days.
     * @param Interval Time granularity of the query. Optional values:
<li>min: 1-minute time granularity;</li>
<li>5min: 5-minute time granularity;</li>
<li>hour: 1-hour time granularity;</li>
<li>day: 1-day time granularity.</li>If this parameter is not input, the granularity will be automatically calculated based on the interval between the start time and end time. Specifically, data will be queried with a granularity of min, 5min, hour, and day respectively when the period is no more than 1 hour, no more than 2 days, no more than 7 days, and over 7 days.
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get Data ownership region. Valid values:
<li>overseas: global (excluding the Chinese mainland) data;</li>
<li>mainland: Chinese mainland data;</li>
<li>global: global data.</li>If this parameter is not input, the default value `global` is used. 
     * @return Area Data ownership region. Valid values:
<li>overseas: global (excluding the Chinese mainland) data;</li>
<li>mainland: Chinese mainland data;</li>
<li>global: global data.</li>If this parameter is not input, the default value `global` is used.
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Data ownership region. Valid values:
<li>overseas: global (excluding the Chinese mainland) data;</li>
<li>mainland: Chinese mainland data;</li>
<li>global: global data.</li>If this parameter is not input, the default value `global` is used.
     * @param Area Data ownership region. Valid values:
<li>overseas: global (excluding the Chinese mainland) data;</li>
<li>mainland: Chinese mainland data;</li>
<li>global: global data.</li>If this parameter is not input, the default value `global` is used.
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    public DescribeTimingL7CacheDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTimingL7CacheDataRequest(DescribeTimingL7CacheDataRequest source) {
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
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "MetricNames.", this.MetricNames);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}


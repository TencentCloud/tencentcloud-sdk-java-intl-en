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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOriginDataRequest extends AbstractModel {

    /**
    * Start time of the query, e.g., 2018-09-04 10:40:00.
The specified start time will be rounded down based on the granularity parameter `Interval`. For example, if you set the start time to 2018-09-04 10:40:00 with 1-hour granularity, the time will be rounded down to 2018-09-04 10:00:00.
The period between the start time and end time can be up to 90 days.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time of the query, e.g. 2018-09-04 10:40:00.
The specified end time will be rounded down based on the granularity parameter `Interval`. For example, if you set the end time to 2018-09-04 10:40:00 with 1-hour granularity, the time will be rounded down to 2018-09-04 10:00:00.
The period between the start time and end time can be up to 90 days.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Specifies the metric to query, which can be:
`flux`: Origin-pull traffic (in bytes)
`bandwidth`: Origin-pull bandwidth (in bps)
`request`: Number of origin-pull requests
`failRequest`: Number of failed origin-pull requests
`failRate`: Origin-pull failure rate (in %)
`statusCode`: Origin-pull status code. The aggregate data for 2xx, 3xx, 4xx, and 5xx origin-pull status codes will be returned (in entries)
`2xx`: Returns the aggregate list of 2xx origin-pull status codes and the data for origin-pull status codes starting with 2 (in entries)
`3xx`: Returns the aggregate list of 3xx origin-pull status codes and the data for origin-pull status codes starting with 3 (in entries)
`4xx`: Returns the aggregate list of 4xx origin-pull status codes and the data for origin-pull status codes starting with 4 (in entries)
`5xx`: Returns the aggregate list of 5xx origin-pull status codes and the data for origin-pull status codes starting with 5 (in entries)
It is supported to specify a status code for query. The return will be empty if the status code has never been generated.
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * Specifies the list of domain names to query. You can query up to 30 domain names at a time.
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * Specifies the project ID to be queried. [Check project ID in the console](https://console.cloud.tencent.com/project)
If the domain name is not specified, the specified project will be queried. Up to 30 acceleration domain names can be queried at a time.
If the domain name information is specified, this parameter can be ignored.
    */
    @SerializedName("Project")
    @Expose
    private Long Project;

    /**
    * Time granularity, which can be:
`min`: Return data with 1-minute granularity. It’s available when the query period is  within 24 hours and `Area` is `mainland`.
`5min`: Return data with 5-minute granularity. It’s available when the query period is within 31 days.
`hour`: Return data with 1-hour granularity. It’s available when the query period is within 31 days.
`day`: Return data with 1-day granularity. It’s available when the query period is longer than 31 days.
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * The aggregate data for multiple domain names is returned by default (false) when multiple `Domains` are passed in.
You can set it to true to return the details for each Domain (the statusCode metric is currently not supported)
    */
    @SerializedName("Detail")
    @Expose
    private Boolean Detail;

    /**
    * Specifies the service region. If this value is left blank, it means to query CDN data within the Chinese mainland.
`mainland`: Query CDN data in the Chinese mainland.
`overseas`: Query CDN data outside the Chinese mainland.
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Specifies a time zone to query. The default time zone is UTC+08:00.
    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
     * Get Start time of the query, e.g., 2018-09-04 10:40:00.
The specified start time will be rounded down based on the granularity parameter `Interval`. For example, if you set the start time to 2018-09-04 10:40:00 with 1-hour granularity, the time will be rounded down to 2018-09-04 10:00:00.
The period between the start time and end time can be up to 90 days. 
     * @return StartTime Start time of the query, e.g., 2018-09-04 10:40:00.
The specified start time will be rounded down based on the granularity parameter `Interval`. For example, if you set the start time to 2018-09-04 10:40:00 with 1-hour granularity, the time will be rounded down to 2018-09-04 10:00:00.
The period between the start time and end time can be up to 90 days.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time of the query, e.g., 2018-09-04 10:40:00.
The specified start time will be rounded down based on the granularity parameter `Interval`. For example, if you set the start time to 2018-09-04 10:40:00 with 1-hour granularity, the time will be rounded down to 2018-09-04 10:00:00.
The period between the start time and end time can be up to 90 days.
     * @param StartTime Start time of the query, e.g., 2018-09-04 10:40:00.
The specified start time will be rounded down based on the granularity parameter `Interval`. For example, if you set the start time to 2018-09-04 10:40:00 with 1-hour granularity, the time will be rounded down to 2018-09-04 10:00:00.
The period between the start time and end time can be up to 90 days.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time of the query, e.g. 2018-09-04 10:40:00.
The specified end time will be rounded down based on the granularity parameter `Interval`. For example, if you set the end time to 2018-09-04 10:40:00 with 1-hour granularity, the time will be rounded down to 2018-09-04 10:00:00.
The period between the start time and end time can be up to 90 days. 
     * @return EndTime End time of the query, e.g. 2018-09-04 10:40:00.
The specified end time will be rounded down based on the granularity parameter `Interval`. For example, if you set the end time to 2018-09-04 10:40:00 with 1-hour granularity, the time will be rounded down to 2018-09-04 10:00:00.
The period between the start time and end time can be up to 90 days.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time of the query, e.g. 2018-09-04 10:40:00.
The specified end time will be rounded down based on the granularity parameter `Interval`. For example, if you set the end time to 2018-09-04 10:40:00 with 1-hour granularity, the time will be rounded down to 2018-09-04 10:00:00.
The period between the start time and end time can be up to 90 days.
     * @param EndTime End time of the query, e.g. 2018-09-04 10:40:00.
The specified end time will be rounded down based on the granularity parameter `Interval`. For example, if you set the end time to 2018-09-04 10:40:00 with 1-hour granularity, the time will be rounded down to 2018-09-04 10:00:00.
The period between the start time and end time can be up to 90 days.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Specifies the metric to query, which can be:
`flux`: Origin-pull traffic (in bytes)
`bandwidth`: Origin-pull bandwidth (in bps)
`request`: Number of origin-pull requests
`failRequest`: Number of failed origin-pull requests
`failRate`: Origin-pull failure rate (in %)
`statusCode`: Origin-pull status code. The aggregate data for 2xx, 3xx, 4xx, and 5xx origin-pull status codes will be returned (in entries)
`2xx`: Returns the aggregate list of 2xx origin-pull status codes and the data for origin-pull status codes starting with 2 (in entries)
`3xx`: Returns the aggregate list of 3xx origin-pull status codes and the data for origin-pull status codes starting with 3 (in entries)
`4xx`: Returns the aggregate list of 4xx origin-pull status codes and the data for origin-pull status codes starting with 4 (in entries)
`5xx`: Returns the aggregate list of 5xx origin-pull status codes and the data for origin-pull status codes starting with 5 (in entries)
It is supported to specify a status code for query. The return will be empty if the status code has never been generated. 
     * @return Metric Specifies the metric to query, which can be:
`flux`: Origin-pull traffic (in bytes)
`bandwidth`: Origin-pull bandwidth (in bps)
`request`: Number of origin-pull requests
`failRequest`: Number of failed origin-pull requests
`failRate`: Origin-pull failure rate (in %)
`statusCode`: Origin-pull status code. The aggregate data for 2xx, 3xx, 4xx, and 5xx origin-pull status codes will be returned (in entries)
`2xx`: Returns the aggregate list of 2xx origin-pull status codes and the data for origin-pull status codes starting with 2 (in entries)
`3xx`: Returns the aggregate list of 3xx origin-pull status codes and the data for origin-pull status codes starting with 3 (in entries)
`4xx`: Returns the aggregate list of 4xx origin-pull status codes and the data for origin-pull status codes starting with 4 (in entries)
`5xx`: Returns the aggregate list of 5xx origin-pull status codes and the data for origin-pull status codes starting with 5 (in entries)
It is supported to specify a status code for query. The return will be empty if the status code has never been generated.
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set Specifies the metric to query, which can be:
`flux`: Origin-pull traffic (in bytes)
`bandwidth`: Origin-pull bandwidth (in bps)
`request`: Number of origin-pull requests
`failRequest`: Number of failed origin-pull requests
`failRate`: Origin-pull failure rate (in %)
`statusCode`: Origin-pull status code. The aggregate data for 2xx, 3xx, 4xx, and 5xx origin-pull status codes will be returned (in entries)
`2xx`: Returns the aggregate list of 2xx origin-pull status codes and the data for origin-pull status codes starting with 2 (in entries)
`3xx`: Returns the aggregate list of 3xx origin-pull status codes and the data for origin-pull status codes starting with 3 (in entries)
`4xx`: Returns the aggregate list of 4xx origin-pull status codes and the data for origin-pull status codes starting with 4 (in entries)
`5xx`: Returns the aggregate list of 5xx origin-pull status codes and the data for origin-pull status codes starting with 5 (in entries)
It is supported to specify a status code for query. The return will be empty if the status code has never been generated.
     * @param Metric Specifies the metric to query, which can be:
`flux`: Origin-pull traffic (in bytes)
`bandwidth`: Origin-pull bandwidth (in bps)
`request`: Number of origin-pull requests
`failRequest`: Number of failed origin-pull requests
`failRate`: Origin-pull failure rate (in %)
`statusCode`: Origin-pull status code. The aggregate data for 2xx, 3xx, 4xx, and 5xx origin-pull status codes will be returned (in entries)
`2xx`: Returns the aggregate list of 2xx origin-pull status codes and the data for origin-pull status codes starting with 2 (in entries)
`3xx`: Returns the aggregate list of 3xx origin-pull status codes and the data for origin-pull status codes starting with 3 (in entries)
`4xx`: Returns the aggregate list of 4xx origin-pull status codes and the data for origin-pull status codes starting with 4 (in entries)
`5xx`: Returns the aggregate list of 5xx origin-pull status codes and the data for origin-pull status codes starting with 5 (in entries)
It is supported to specify a status code for query. The return will be empty if the status code has never been generated.
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get Specifies the list of domain names to query. You can query up to 30 domain names at a time. 
     * @return Domains Specifies the list of domain names to query. You can query up to 30 domain names at a time.
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set Specifies the list of domain names to query. You can query up to 30 domain names at a time.
     * @param Domains Specifies the list of domain names to query. You can query up to 30 domain names at a time.
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get Specifies the project ID to be queried. [Check project ID in the console](https://console.cloud.tencent.com/project)
If the domain name is not specified, the specified project will be queried. Up to 30 acceleration domain names can be queried at a time.
If the domain name information is specified, this parameter can be ignored. 
     * @return Project Specifies the project ID to be queried. [Check project ID in the console](https://console.cloud.tencent.com/project)
If the domain name is not specified, the specified project will be queried. Up to 30 acceleration domain names can be queried at a time.
If the domain name information is specified, this parameter can be ignored.
     */
    public Long getProject() {
        return this.Project;
    }

    /**
     * Set Specifies the project ID to be queried. [Check project ID in the console](https://console.cloud.tencent.com/project)
If the domain name is not specified, the specified project will be queried. Up to 30 acceleration domain names can be queried at a time.
If the domain name information is specified, this parameter can be ignored.
     * @param Project Specifies the project ID to be queried. [Check project ID in the console](https://console.cloud.tencent.com/project)
If the domain name is not specified, the specified project will be queried. Up to 30 acceleration domain names can be queried at a time.
If the domain name information is specified, this parameter can be ignored.
     */
    public void setProject(Long Project) {
        this.Project = Project;
    }

    /**
     * Get Time granularity, which can be:
`min`: Return data with 1-minute granularity. It’s available when the query period is  within 24 hours and `Area` is `mainland`.
`5min`: Return data with 5-minute granularity. It’s available when the query period is within 31 days.
`hour`: Return data with 1-hour granularity. It’s available when the query period is within 31 days.
`day`: Return data with 1-day granularity. It’s available when the query period is longer than 31 days. 
     * @return Interval Time granularity, which can be:
`min`: Return data with 1-minute granularity. It’s available when the query period is  within 24 hours and `Area` is `mainland`.
`5min`: Return data with 5-minute granularity. It’s available when the query period is within 31 days.
`hour`: Return data with 1-hour granularity. It’s available when the query period is within 31 days.
`day`: Return data with 1-day granularity. It’s available when the query period is longer than 31 days.
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set Time granularity, which can be:
`min`: Return data with 1-minute granularity. It’s available when the query period is  within 24 hours and `Area` is `mainland`.
`5min`: Return data with 5-minute granularity. It’s available when the query period is within 31 days.
`hour`: Return data with 1-hour granularity. It’s available when the query period is within 31 days.
`day`: Return data with 1-day granularity. It’s available when the query period is longer than 31 days.
     * @param Interval Time granularity, which can be:
`min`: Return data with 1-minute granularity. It’s available when the query period is  within 24 hours and `Area` is `mainland`.
`5min`: Return data with 5-minute granularity. It’s available when the query period is within 31 days.
`hour`: Return data with 1-hour granularity. It’s available when the query period is within 31 days.
`day`: Return data with 1-day granularity. It’s available when the query period is longer than 31 days.
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get The aggregate data for multiple domain names is returned by default (false) when multiple `Domains` are passed in.
You can set it to true to return the details for each Domain (the statusCode metric is currently not supported) 
     * @return Detail The aggregate data for multiple domain names is returned by default (false) when multiple `Domains` are passed in.
You can set it to true to return the details for each Domain (the statusCode metric is currently not supported)
     */
    public Boolean getDetail() {
        return this.Detail;
    }

    /**
     * Set The aggregate data for multiple domain names is returned by default (false) when multiple `Domains` are passed in.
You can set it to true to return the details for each Domain (the statusCode metric is currently not supported)
     * @param Detail The aggregate data for multiple domain names is returned by default (false) when multiple `Domains` are passed in.
You can set it to true to return the details for each Domain (the statusCode metric is currently not supported)
     */
    public void setDetail(Boolean Detail) {
        this.Detail = Detail;
    }

    /**
     * Get Specifies the service region. If this value is left blank, it means to query CDN data within the Chinese mainland.
`mainland`: Query CDN data in the Chinese mainland.
`overseas`: Query CDN data outside the Chinese mainland. 
     * @return Area Specifies the service region. If this value is left blank, it means to query CDN data within the Chinese mainland.
`mainland`: Query CDN data in the Chinese mainland.
`overseas`: Query CDN data outside the Chinese mainland.
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Specifies the service region. If this value is left blank, it means to query CDN data within the Chinese mainland.
`mainland`: Query CDN data in the Chinese mainland.
`overseas`: Query CDN data outside the Chinese mainland.
     * @param Area Specifies the service region. If this value is left blank, it means to query CDN data within the Chinese mainland.
`mainland`: Query CDN data in the Chinese mainland.
`overseas`: Query CDN data outside the Chinese mainland.
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Specifies a time zone to query. The default time zone is UTC+08:00. 
     * @return TimeZone Specifies a time zone to query. The default time zone is UTC+08:00.
     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set Specifies a time zone to query. The default time zone is UTC+08:00.
     * @param TimeZone Specifies a time zone to query. The default time zone is UTC+08:00.
     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    public DescribeOriginDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOriginDataRequest(DescribeOriginDataRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.Project != null) {
            this.Project = new Long(source.Project);
        }
        if (source.Interval != null) {
            this.Interval = new String(source.Interval);
        }
        if (source.Detail != null) {
            this.Detail = new Boolean(source.Detail);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.TimeZone != null) {
            this.TimeZone = new String(source.TimeZone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamSimple(map, prefix + "Project", this.Project);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "Detail", this.Detail);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);

    }
}


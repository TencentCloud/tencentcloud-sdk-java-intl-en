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
package com.tencentcloudapi.ecdn.v20191012.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEcdnStatisticsRequest extends AbstractModel {

    /**
    * Query start time, such as 2019-12-13 00:00:00
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Query end time, such as 2019-12-13 23:59:59
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Specifies the query metric, which can be:
flux: traffic (in bytes)
bandwidth: bandwidth (in bps)
request: number of requests
2xx: returns the number of 2xx status codes or details of status codes starting with 2
3xx: returns the number of 3xx status codes or details of status codes starting with 3
4xx: returns the number of 4xx status codes or details of status codes starting with 4
5xx: returns the number of 5xx status codes or details of status codes starting with 5
    */
    @SerializedName("Metrics")
    @Expose
    private String [] Metrics;

    /**
    * Sampling interval in minutes. The available options vary for different query period. See below: 
1 day: `1`, `5`, `15`, `30`, `60`, `120`, `240`, `1440` 
2 to 3 days: `15`, `30`, `60`, `120`, `240`, `1440`
4 to 7 days: `30`, `60`, `120`, `240`, `1440`
8 to 31 days: `60`, `120`, `240`, `1440`
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * Specifies the list of domain names to be queried

Up to 30 acceleration domain names can be queried at a time.
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * Specifies the project ID to be queried, which can be viewed [here](https://console.cloud.tencent.com/project)
If no domain name is entered, the specified project will be queried; otherwise, the domain name will prevail
    */
    @SerializedName("Projects")
    @Expose
    private Long [] Projects;

    /**
    * Statistical areas:
mainland: Chinese mainland
oversea: outside the Chinese mainland
global: global
Default value: global
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
     * Get Query start time, such as 2019-12-13 00:00:00 
     * @return StartTime Query start time, such as 2019-12-13 00:00:00
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Query start time, such as 2019-12-13 00:00:00
     * @param StartTime Query start time, such as 2019-12-13 00:00:00
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Query end time, such as 2019-12-13 23:59:59 
     * @return EndTime Query end time, such as 2019-12-13 23:59:59
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Query end time, such as 2019-12-13 23:59:59
     * @param EndTime Query end time, such as 2019-12-13 23:59:59
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Specifies the query metric, which can be:
flux: traffic (in bytes)
bandwidth: bandwidth (in bps)
request: number of requests
2xx: returns the number of 2xx status codes or details of status codes starting with 2
3xx: returns the number of 3xx status codes or details of status codes starting with 3
4xx: returns the number of 4xx status codes or details of status codes starting with 4
5xx: returns the number of 5xx status codes or details of status codes starting with 5 
     * @return Metrics Specifies the query metric, which can be:
flux: traffic (in bytes)
bandwidth: bandwidth (in bps)
request: number of requests
2xx: returns the number of 2xx status codes or details of status codes starting with 2
3xx: returns the number of 3xx status codes or details of status codes starting with 3
4xx: returns the number of 4xx status codes or details of status codes starting with 4
5xx: returns the number of 5xx status codes or details of status codes starting with 5
     */
    public String [] getMetrics() {
        return this.Metrics;
    }

    /**
     * Set Specifies the query metric, which can be:
flux: traffic (in bytes)
bandwidth: bandwidth (in bps)
request: number of requests
2xx: returns the number of 2xx status codes or details of status codes starting with 2
3xx: returns the number of 3xx status codes or details of status codes starting with 3
4xx: returns the number of 4xx status codes or details of status codes starting with 4
5xx: returns the number of 5xx status codes or details of status codes starting with 5
     * @param Metrics Specifies the query metric, which can be:
flux: traffic (in bytes)
bandwidth: bandwidth (in bps)
request: number of requests
2xx: returns the number of 2xx status codes or details of status codes starting with 2
3xx: returns the number of 3xx status codes or details of status codes starting with 3
4xx: returns the number of 4xx status codes or details of status codes starting with 4
5xx: returns the number of 5xx status codes or details of status codes starting with 5
     */
    public void setMetrics(String [] Metrics) {
        this.Metrics = Metrics;
    }

    /**
     * Get Sampling interval in minutes. The available options vary for different query period. See below: 
1 day: `1`, `5`, `15`, `30`, `60`, `120`, `240`, `1440` 
2 to 3 days: `15`, `30`, `60`, `120`, `240`, `1440`
4 to 7 days: `30`, `60`, `120`, `240`, `1440`
8 to 31 days: `60`, `120`, `240`, `1440` 
     * @return Interval Sampling interval in minutes. The available options vary for different query period. See below: 
1 day: `1`, `5`, `15`, `30`, `60`, `120`, `240`, `1440` 
2 to 3 days: `15`, `30`, `60`, `120`, `240`, `1440`
4 to 7 days: `30`, `60`, `120`, `240`, `1440`
8 to 31 days: `60`, `120`, `240`, `1440`
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set Sampling interval in minutes. The available options vary for different query period. See below: 
1 day: `1`, `5`, `15`, `30`, `60`, `120`, `240`, `1440` 
2 to 3 days: `15`, `30`, `60`, `120`, `240`, `1440`
4 to 7 days: `30`, `60`, `120`, `240`, `1440`
8 to 31 days: `60`, `120`, `240`, `1440`
     * @param Interval Sampling interval in minutes. The available options vary for different query period. See below: 
1 day: `1`, `5`, `15`, `30`, `60`, `120`, `240`, `1440` 
2 to 3 days: `15`, `30`, `60`, `120`, `240`, `1440`
4 to 7 days: `30`, `60`, `120`, `240`, `1440`
8 to 31 days: `60`, `120`, `240`, `1440`
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get Specifies the list of domain names to be queried

Up to 30 acceleration domain names can be queried at a time. 
     * @return Domains Specifies the list of domain names to be queried

Up to 30 acceleration domain names can be queried at a time.
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set Specifies the list of domain names to be queried

Up to 30 acceleration domain names can be queried at a time.
     * @param Domains Specifies the list of domain names to be queried

Up to 30 acceleration domain names can be queried at a time.
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get Specifies the project ID to be queried, which can be viewed [here](https://console.cloud.tencent.com/project)
If no domain name is entered, the specified project will be queried; otherwise, the domain name will prevail 
     * @return Projects Specifies the project ID to be queried, which can be viewed [here](https://console.cloud.tencent.com/project)
If no domain name is entered, the specified project will be queried; otherwise, the domain name will prevail
     */
    public Long [] getProjects() {
        return this.Projects;
    }

    /**
     * Set Specifies the project ID to be queried, which can be viewed [here](https://console.cloud.tencent.com/project)
If no domain name is entered, the specified project will be queried; otherwise, the domain name will prevail
     * @param Projects Specifies the project ID to be queried, which can be viewed [here](https://console.cloud.tencent.com/project)
If no domain name is entered, the specified project will be queried; otherwise, the domain name will prevail
     */
    public void setProjects(Long [] Projects) {
        this.Projects = Projects;
    }

    /**
     * Get Statistical areas:
mainland: Chinese mainland
oversea: outside the Chinese mainland
global: global
Default value: global 
     * @return Area Statistical areas:
mainland: Chinese mainland
oversea: outside the Chinese mainland
global: global
Default value: global
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Statistical areas:
mainland: Chinese mainland
oversea: outside the Chinese mainland
global: global
Default value: global
     * @param Area Statistical areas:
mainland: Chinese mainland
oversea: outside the Chinese mainland
global: global
Default value: global
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    public DescribeEcdnStatisticsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEcdnStatisticsRequest(DescribeEcdnStatisticsRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Metrics != null) {
            this.Metrics = new String[source.Metrics.length];
            for (int i = 0; i < source.Metrics.length; i++) {
                this.Metrics[i] = new String(source.Metrics[i]);
            }
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.Projects != null) {
            this.Projects = new Long[source.Projects.length];
            for (int i = 0; i < source.Projects.length; i++) {
                this.Projects[i] = new Long(source.Projects[i]);
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
        this.setParamArraySimple(map, prefix + "Metrics.", this.Metrics);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamArraySimple(map, prefix + "Projects.", this.Projects);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}


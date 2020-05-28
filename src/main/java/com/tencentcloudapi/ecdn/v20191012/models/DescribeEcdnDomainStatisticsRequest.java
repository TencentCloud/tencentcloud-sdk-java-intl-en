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
package com.tencentcloudapi.ecdn.v20191012.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEcdnDomainStatisticsRequest extends AbstractModel{

    /**
    * Query start time, such as 2019-12-13 00:00:00.
The time span cannot exceed 90 days.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Query end time, such as 2019-12-13 23:59:59.
The time span cannot exceed 90 days.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Statistical metric name. flux: traffic in bytes
bandwidth: bandwidth in bps
request: number of requests
delay: response time in ms
static_request: number of static requests
static_flux: static traffic in bytes
static_bandwidth: static bandwidth in bps
dynamic_request: number of dynamic requests
dynamic_flux: dynamic traffic in bytes
dynamic_bandwidth: dynamic bandwidth in bps
    */
    @SerializedName("Metrics")
    @Expose
    private String [] Metrics;

    /**
    * Specifies the list of domain names to be queried
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
    * Pagination offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of entries per page. Default value: 1000. Maximum value: 3,000.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Query start time, such as 2019-12-13 00:00:00.
The time span cannot exceed 90 days. 
     * @return StartTime Query start time, such as 2019-12-13 00:00:00.
The time span cannot exceed 90 days.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Query start time, such as 2019-12-13 00:00:00.
The time span cannot exceed 90 days.
     * @param StartTime Query start time, such as 2019-12-13 00:00:00.
The time span cannot exceed 90 days.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Query end time, such as 2019-12-13 23:59:59.
The time span cannot exceed 90 days. 
     * @return EndTime Query end time, such as 2019-12-13 23:59:59.
The time span cannot exceed 90 days.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Query end time, such as 2019-12-13 23:59:59.
The time span cannot exceed 90 days.
     * @param EndTime Query end time, such as 2019-12-13 23:59:59.
The time span cannot exceed 90 days.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Statistical metric name. flux: traffic in bytes
bandwidth: bandwidth in bps
request: number of requests
delay: response time in ms
static_request: number of static requests
static_flux: static traffic in bytes
static_bandwidth: static bandwidth in bps
dynamic_request: number of dynamic requests
dynamic_flux: dynamic traffic in bytes
dynamic_bandwidth: dynamic bandwidth in bps 
     * @return Metrics Statistical metric name. flux: traffic in bytes
bandwidth: bandwidth in bps
request: number of requests
delay: response time in ms
static_request: number of static requests
static_flux: static traffic in bytes
static_bandwidth: static bandwidth in bps
dynamic_request: number of dynamic requests
dynamic_flux: dynamic traffic in bytes
dynamic_bandwidth: dynamic bandwidth in bps
     */
    public String [] getMetrics() {
        return this.Metrics;
    }

    /**
     * Set Statistical metric name. flux: traffic in bytes
bandwidth: bandwidth in bps
request: number of requests
delay: response time in ms
static_request: number of static requests
static_flux: static traffic in bytes
static_bandwidth: static bandwidth in bps
dynamic_request: number of dynamic requests
dynamic_flux: dynamic traffic in bytes
dynamic_bandwidth: dynamic bandwidth in bps
     * @param Metrics Statistical metric name. flux: traffic in bytes
bandwidth: bandwidth in bps
request: number of requests
delay: response time in ms
static_request: number of static requests
static_flux: static traffic in bytes
static_bandwidth: static bandwidth in bps
dynamic_request: number of dynamic requests
dynamic_flux: dynamic traffic in bytes
dynamic_bandwidth: dynamic bandwidth in bps
     */
    public void setMetrics(String [] Metrics) {
        this.Metrics = Metrics;
    }

    /**
     * Get Specifies the list of domain names to be queried 
     * @return Domains Specifies the list of domain names to be queried
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set Specifies the list of domain names to be queried
     * @param Domains Specifies the list of domain names to be queried
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
     * Get Pagination offset. Default value: 0. 
     * @return Offset Pagination offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset. Default value: 0.
     * @param Offset Pagination offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of entries per page. Default value: 1000. Maximum value: 3,000. 
     * @return Limit Number of entries per page. Default value: 1000. Maximum value: 3,000.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of entries per page. Default value: 1000. Maximum value: 3,000.
     * @param Limit Number of entries per page. Default value: 1000. Maximum value: 3,000.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "Metrics.", this.Metrics);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamArraySimple(map, prefix + "Projects.", this.Projects);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}


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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBizHttpStatusRequest extends AbstractModel{

    /**
    * Anti-DDoS service type (`bgpip`: Anti-DDoS Advanced)
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * Resource ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Statistical period in seconds. Valid values: 300, 1800, 3600, 21600, and 86400.
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Statistics start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Statistics end time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Statistical mode, which only supports sum.
    */
    @SerializedName("Statistics")
    @Expose
    private String Statistics;

    /**
    * Protocol and port list, which is valid when the statistical dimension is the number of connections. Valid protocols: TCP, UDP, HTTP, and HTTPS.
    */
    @SerializedName("ProtoInfo")
    @Expose
    private ProtocolPort [] ProtoInfo;

    /**
    * Specific domain name query
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
     * Get Anti-DDoS service type (`bgpip`: Anti-DDoS Advanced) 
     * @return Business Anti-DDoS service type (`bgpip`: Anti-DDoS Advanced)
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set Anti-DDoS service type (`bgpip`: Anti-DDoS Advanced)
     * @param Business Anti-DDoS service type (`bgpip`: Anti-DDoS Advanced)
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get Resource ID 
     * @return Id Resource ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Resource ID
     * @param Id Resource ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Statistical period in seconds. Valid values: 300, 1800, 3600, 21600, and 86400. 
     * @return Period Statistical period in seconds. Valid values: 300, 1800, 3600, 21600, and 86400.
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Statistical period in seconds. Valid values: 300, 1800, 3600, 21600, and 86400.
     * @param Period Statistical period in seconds. Valid values: 300, 1800, 3600, 21600, and 86400.
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Statistics start time 
     * @return StartTime Statistics start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Statistics start time
     * @param StartTime Statistics start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Statistics end time 
     * @return EndTime Statistics end time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Statistics end time
     * @param EndTime Statistics end time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Statistical mode, which only supports sum. 
     * @return Statistics Statistical mode, which only supports sum.
     */
    public String getStatistics() {
        return this.Statistics;
    }

    /**
     * Set Statistical mode, which only supports sum.
     * @param Statistics Statistical mode, which only supports sum.
     */
    public void setStatistics(String Statistics) {
        this.Statistics = Statistics;
    }

    /**
     * Get Protocol and port list, which is valid when the statistical dimension is the number of connections. Valid protocols: TCP, UDP, HTTP, and HTTPS. 
     * @return ProtoInfo Protocol and port list, which is valid when the statistical dimension is the number of connections. Valid protocols: TCP, UDP, HTTP, and HTTPS.
     */
    public ProtocolPort [] getProtoInfo() {
        return this.ProtoInfo;
    }

    /**
     * Set Protocol and port list, which is valid when the statistical dimension is the number of connections. Valid protocols: TCP, UDP, HTTP, and HTTPS.
     * @param ProtoInfo Protocol and port list, which is valid when the statistical dimension is the number of connections. Valid protocols: TCP, UDP, HTTP, and HTTPS.
     */
    public void setProtoInfo(ProtocolPort [] ProtoInfo) {
        this.ProtoInfo = ProtoInfo;
    }

    /**
     * Get Specific domain name query 
     * @return Domain Specific domain name query
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Specific domain name query
     * @param Domain Specific domain name query
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Statistics", this.Statistics);
        this.setParamArrayObj(map, prefix + "ProtoInfo.", this.ProtoInfo);
        this.setParamSimple(map, prefix + "Domain", this.Domain);

    }
}


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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBizTrendRequest extends AbstractModel {

    /**
    * Statistical method. Valid values: `max`, `min`, `avg`, `sum`. It can only be `max` if the statistical dimension is traffic rate or packet rate.
    */
    @SerializedName("Statistics")
    @Expose
    private String Statistics;

    /**
    * Anti-DDoS service type (`bgpip`: Anti-DDoS Advanced)
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * Sampling interval in seconds. Valid values: `60`, `300`, `1800`, `3600`, `21600`, `86400`
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Beginning of the time range for the query, such as `2020-09-22 00:00:00`.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End of the time range for the query, such as `2020-09-22 00:00:00`.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Instance ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Metric. Valid values: `connum`, `new_conn`, `inactive_conn`, `intraffic`, `outtraffic`, `inpkg`, `outpkg`, `qps`
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * You can query data by specifying a domain name when the metric is `qps`.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Protocol and port list, which is valid when the metric is `connum`, `new_conn` or `inactive_conn`. Valid protocols: `TCP`, `UDP`, `HTTP`, `HTTPS`
    */
    @SerializedName("ProtoInfo")
    @Expose
    private ProtocolPort [] ProtoInfo;

    /**
     * Get Statistical method. Valid values: `max`, `min`, `avg`, `sum`. It can only be `max` if the statistical dimension is traffic rate or packet rate. 
     * @return Statistics Statistical method. Valid values: `max`, `min`, `avg`, `sum`. It can only be `max` if the statistical dimension is traffic rate or packet rate.
     */
    public String getStatistics() {
        return this.Statistics;
    }

    /**
     * Set Statistical method. Valid values: `max`, `min`, `avg`, `sum`. It can only be `max` if the statistical dimension is traffic rate or packet rate.
     * @param Statistics Statistical method. Valid values: `max`, `min`, `avg`, `sum`. It can only be `max` if the statistical dimension is traffic rate or packet rate.
     */
    public void setStatistics(String Statistics) {
        this.Statistics = Statistics;
    }

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
     * Get Sampling interval in seconds. Valid values: `60`, `300`, `1800`, `3600`, `21600`, `86400` 
     * @return Period Sampling interval in seconds. Valid values: `60`, `300`, `1800`, `3600`, `21600`, `86400`
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Sampling interval in seconds. Valid values: `60`, `300`, `1800`, `3600`, `21600`, `86400`
     * @param Period Sampling interval in seconds. Valid values: `60`, `300`, `1800`, `3600`, `21600`, `86400`
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Beginning of the time range for the query, such as `2020-09-22 00:00:00`. 
     * @return StartTime Beginning of the time range for the query, such as `2020-09-22 00:00:00`.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Beginning of the time range for the query, such as `2020-09-22 00:00:00`.
     * @param StartTime Beginning of the time range for the query, such as `2020-09-22 00:00:00`.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End of the time range for the query, such as `2020-09-22 00:00:00`. 
     * @return EndTime End of the time range for the query, such as `2020-09-22 00:00:00`.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End of the time range for the query, such as `2020-09-22 00:00:00`.
     * @param EndTime End of the time range for the query, such as `2020-09-22 00:00:00`.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Instance ID 
     * @return Id Instance ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Instance ID
     * @param Id Instance ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Metric. Valid values: `connum`, `new_conn`, `inactive_conn`, `intraffic`, `outtraffic`, `inpkg`, `outpkg`, `qps` 
     * @return MetricName Metric. Valid values: `connum`, `new_conn`, `inactive_conn`, `intraffic`, `outtraffic`, `inpkg`, `outpkg`, `qps`
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set Metric. Valid values: `connum`, `new_conn`, `inactive_conn`, `intraffic`, `outtraffic`, `inpkg`, `outpkg`, `qps`
     * @param MetricName Metric. Valid values: `connum`, `new_conn`, `inactive_conn`, `intraffic`, `outtraffic`, `inpkg`, `outpkg`, `qps`
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get You can query data by specifying a domain name when the metric is `qps`. 
     * @return Domain You can query data by specifying a domain name when the metric is `qps`.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set You can query data by specifying a domain name when the metric is `qps`.
     * @param Domain You can query data by specifying a domain name when the metric is `qps`.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Protocol and port list, which is valid when the metric is `connum`, `new_conn` or `inactive_conn`. Valid protocols: `TCP`, `UDP`, `HTTP`, `HTTPS` 
     * @return ProtoInfo Protocol and port list, which is valid when the metric is `connum`, `new_conn` or `inactive_conn`. Valid protocols: `TCP`, `UDP`, `HTTP`, `HTTPS`
     */
    public ProtocolPort [] getProtoInfo() {
        return this.ProtoInfo;
    }

    /**
     * Set Protocol and port list, which is valid when the metric is `connum`, `new_conn` or `inactive_conn`. Valid protocols: `TCP`, `UDP`, `HTTP`, `HTTPS`
     * @param ProtoInfo Protocol and port list, which is valid when the metric is `connum`, `new_conn` or `inactive_conn`. Valid protocols: `TCP`, `UDP`, `HTTP`, `HTTPS`
     */
    public void setProtoInfo(ProtocolPort [] ProtoInfo) {
        this.ProtoInfo = ProtoInfo;
    }

    public DescribeBizTrendRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBizTrendRequest(DescribeBizTrendRequest source) {
        if (source.Statistics != null) {
            this.Statistics = new String(source.Statistics);
        }
        if (source.Business != null) {
            this.Business = new String(source.Business);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.ProtoInfo != null) {
            this.ProtoInfo = new ProtocolPort[source.ProtoInfo.length];
            for (int i = 0; i < source.ProtoInfo.length; i++) {
                this.ProtoInfo[i] = new ProtocolPort(source.ProtoInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Statistics", this.Statistics);
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArrayObj(map, prefix + "ProtoInfo.", this.ProtoInfo);

    }
}


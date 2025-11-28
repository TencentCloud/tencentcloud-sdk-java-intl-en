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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRocketMQPublicAccessMonitorDataRequest extends AbstractModel {

    /**
    * Exclusive Edition cluster ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Metric name. Only single-metric pulling is supported. Currently supported metrics: ClientIntraffic and ClientOuttraffic.
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * Start time.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time, current time by default.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Monitoring statistical period, such as 60 (in seconds). The default value is 300.
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
     * Get Exclusive Edition cluster ID. 
     * @return InstanceId Exclusive Edition cluster ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Exclusive Edition cluster ID.
     * @param InstanceId Exclusive Edition cluster ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Metric name. Only single-metric pulling is supported. Currently supported metrics: ClientIntraffic and ClientOuttraffic. 
     * @return MetricName Metric name. Only single-metric pulling is supported. Currently supported metrics: ClientIntraffic and ClientOuttraffic.
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set Metric name. Only single-metric pulling is supported. Currently supported metrics: ClientIntraffic and ClientOuttraffic.
     * @param MetricName Metric name. Only single-metric pulling is supported. Currently supported metrics: ClientIntraffic and ClientOuttraffic.
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

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
     * Get End time, current time by default. 
     * @return EndTime End time, current time by default.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time, current time by default.
     * @param EndTime End time, current time by default.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Monitoring statistical period, such as 60 (in seconds). The default value is 300. 
     * @return Period Monitoring statistical period, such as 60 (in seconds). The default value is 300.
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Monitoring statistical period, such as 60 (in seconds). The default value is 300.
     * @param Period Monitoring statistical period, such as 60 (in seconds). The default value is 300.
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    public DescribeRocketMQPublicAccessMonitorDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRocketMQPublicAccessMonitorDataRequest(DescribeRocketMQPublicAccessMonitorDataRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Period", this.Period);

    }
}


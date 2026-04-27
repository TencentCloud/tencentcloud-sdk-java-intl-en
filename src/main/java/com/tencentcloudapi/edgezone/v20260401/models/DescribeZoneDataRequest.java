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
package com.tencentcloudapi.edgezone.v20260401.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeZoneDataRequest extends AbstractModel {

    /**
    * Availability zone id
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Metric name (inbw: inbound bandwidth, outbw: outbound bandwidth)
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * Start time (UTC time)
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time (UTC time), query up to 2 days.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get Availability zone id 
     * @return Zone Availability zone id
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Availability zone id
     * @param Zone Availability zone id
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Metric name (inbw: inbound bandwidth, outbw: outbound bandwidth) 
     * @return MetricName Metric name (inbw: inbound bandwidth, outbw: outbound bandwidth)
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set Metric name (inbw: inbound bandwidth, outbw: outbound bandwidth)
     * @param MetricName Metric name (inbw: inbound bandwidth, outbw: outbound bandwidth)
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get Start time (UTC time) 
     * @return StartTime Start time (UTC time)
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time (UTC time)
     * @param StartTime Start time (UTC time)
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time (UTC time), query up to 2 days. 
     * @return EndTime End time (UTC time), query up to 2 days.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time (UTC time), query up to 2 days.
     * @param EndTime End time (UTC time), query up to 2 days.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeZoneDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeZoneDataRequest(DescribeZoneDataRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}


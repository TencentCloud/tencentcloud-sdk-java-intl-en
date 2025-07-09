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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProxyGroupStatisticsRequest extends AbstractModel {

    /**
    * Connection group ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Statistical metric name list. Values: InBandwidth (inbound bandwidth); OutBandwidth (outbound bandwidth); Concurrent (concurrence); InPackets (inbound packets); OutPackets (outbound packets).
    */
    @SerializedName("MetricNames")
    @Expose
    private String [] MetricNames;

    /**
    * Monitoring granularity (in seconds). Valid values: 60s, 300s, 3,600s, 86,400s.
Time range: ≤ 1 day. Supported minimum granularity: 60 seconds;
Time range: ≤ 7 days. Supported minimum granularity: 3,600 seconds;
Time range: ≤ 30 days. Supported minimum granularity: 86,400 seconds;
    */
    @SerializedName("Granularity")
    @Expose
    private Long Granularity;

    /**
     * Get Connection group ID 
     * @return GroupId Connection group ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Connection group ID
     * @param GroupId Connection group ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Start time 
     * @return StartTime Start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time
     * @param StartTime Start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time 
     * @return EndTime End time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time
     * @param EndTime End time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Statistical metric name list. Values: InBandwidth (inbound bandwidth); OutBandwidth (outbound bandwidth); Concurrent (concurrence); InPackets (inbound packets); OutPackets (outbound packets). 
     * @return MetricNames Statistical metric name list. Values: InBandwidth (inbound bandwidth); OutBandwidth (outbound bandwidth); Concurrent (concurrence); InPackets (inbound packets); OutPackets (outbound packets).
     */
    public String [] getMetricNames() {
        return this.MetricNames;
    }

    /**
     * Set Statistical metric name list. Values: InBandwidth (inbound bandwidth); OutBandwidth (outbound bandwidth); Concurrent (concurrence); InPackets (inbound packets); OutPackets (outbound packets).
     * @param MetricNames Statistical metric name list. Values: InBandwidth (inbound bandwidth); OutBandwidth (outbound bandwidth); Concurrent (concurrence); InPackets (inbound packets); OutPackets (outbound packets).
     */
    public void setMetricNames(String [] MetricNames) {
        this.MetricNames = MetricNames;
    }

    /**
     * Get Monitoring granularity (in seconds). Valid values: 60s, 300s, 3,600s, 86,400s.
Time range: ≤ 1 day. Supported minimum granularity: 60 seconds;
Time range: ≤ 7 days. Supported minimum granularity: 3,600 seconds;
Time range: ≤ 30 days. Supported minimum granularity: 86,400 seconds; 
     * @return Granularity Monitoring granularity (in seconds). Valid values: 60s, 300s, 3,600s, 86,400s.
Time range: ≤ 1 day. Supported minimum granularity: 60 seconds;
Time range: ≤ 7 days. Supported minimum granularity: 3,600 seconds;
Time range: ≤ 30 days. Supported minimum granularity: 86,400 seconds;
     */
    public Long getGranularity() {
        return this.Granularity;
    }

    /**
     * Set Monitoring granularity (in seconds). Valid values: 60s, 300s, 3,600s, 86,400s.
Time range: ≤ 1 day. Supported minimum granularity: 60 seconds;
Time range: ≤ 7 days. Supported minimum granularity: 3,600 seconds;
Time range: ≤ 30 days. Supported minimum granularity: 86,400 seconds;
     * @param Granularity Monitoring granularity (in seconds). Valid values: 60s, 300s, 3,600s, 86,400s.
Time range: ≤ 1 day. Supported minimum granularity: 60 seconds;
Time range: ≤ 7 days. Supported minimum granularity: 3,600 seconds;
Time range: ≤ 30 days. Supported minimum granularity: 86,400 seconds;
     */
    public void setGranularity(Long Granularity) {
        this.Granularity = Granularity;
    }

    public DescribeProxyGroupStatisticsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProxyGroupStatisticsRequest(DescribeProxyGroupStatisticsRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
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
        if (source.Granularity != null) {
            this.Granularity = new Long(source.Granularity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "MetricNames.", this.MetricNames);
        this.setParamSimple(map, prefix + "Granularity", this.Granularity);

    }
}


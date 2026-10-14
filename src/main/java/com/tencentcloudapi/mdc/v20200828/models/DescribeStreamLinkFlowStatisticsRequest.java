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
package com.tencentcloudapi.mdc.v20200828.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStreamLinkFlowStatisticsRequest extends AbstractModel {

    /**
    * Transport stream ID.
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * Input or output type. Valid values: `input`, `output`.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Input or output Id.
    */
    @SerializedName("InputOutputId")
    @Expose
    private String InputOutputId;

    /**
    * Primary or backup channel. Valid values: 0 and 1.
    */
    @SerializedName("Pipeline")
    @Expose
    private String Pipeline;

    /**
    * Query interval. Option: [5s|1min|5min|15min].
    */
    @SerializedName("Period")
    @Expose
    private String Period;

    /**
    * Start time for statistics. Default value: last hour. You can query data from the last 7 days at most.
UTC time, for example, '2020-01-01T12:00:00Z'.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time for statistics. Defaults to one hour after `StartTime`. You can query the data of up to 24 hours.
UTC time, for example, '2020-01-01T12:00:00Z'.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Peer client or server IP address.
    */
    @SerializedName("RemoteIp")
    @Expose
    private String RemoteIp;

    /**
     * Get Transport stream ID. 
     * @return FlowId Transport stream ID.
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set Transport stream ID.
     * @param FlowId Transport stream ID.
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get Input or output type. Valid values: `input`, `output`. 
     * @return Type Input or output type. Valid values: `input`, `output`.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Input or output type. Valid values: `input`, `output`.
     * @param Type Input or output type. Valid values: `input`, `output`.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Input or output Id. 
     * @return InputOutputId Input or output Id.
     */
    public String getInputOutputId() {
        return this.InputOutputId;
    }

    /**
     * Set Input or output Id.
     * @param InputOutputId Input or output Id.
     */
    public void setInputOutputId(String InputOutputId) {
        this.InputOutputId = InputOutputId;
    }

    /**
     * Get Primary or backup channel. Valid values: 0 and 1. 
     * @return Pipeline Primary or backup channel. Valid values: 0 and 1.
     */
    public String getPipeline() {
        return this.Pipeline;
    }

    /**
     * Set Primary or backup channel. Valid values: 0 and 1.
     * @param Pipeline Primary or backup channel. Valid values: 0 and 1.
     */
    public void setPipeline(String Pipeline) {
        this.Pipeline = Pipeline;
    }

    /**
     * Get Query interval. Option: [5s|1min|5min|15min]. 
     * @return Period Query interval. Option: [5s|1min|5min|15min].
     */
    public String getPeriod() {
        return this.Period;
    }

    /**
     * Set Query interval. Option: [5s|1min|5min|15min].
     * @param Period Query interval. Option: [5s|1min|5min|15min].
     */
    public void setPeriod(String Period) {
        this.Period = Period;
    }

    /**
     * Get Start time for statistics. Default value: last hour. You can query data from the last 7 days at most.
UTC time, for example, '2020-01-01T12:00:00Z'. 
     * @return StartTime Start time for statistics. Default value: last hour. You can query data from the last 7 days at most.
UTC time, for example, '2020-01-01T12:00:00Z'.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time for statistics. Default value: last hour. You can query data from the last 7 days at most.
UTC time, for example, '2020-01-01T12:00:00Z'.
     * @param StartTime Start time for statistics. Default value: last hour. You can query data from the last 7 days at most.
UTC time, for example, '2020-01-01T12:00:00Z'.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time for statistics. Defaults to one hour after `StartTime`. You can query the data of up to 24 hours.
UTC time, for example, '2020-01-01T12:00:00Z'. 
     * @return EndTime End time for statistics. Defaults to one hour after `StartTime`. You can query the data of up to 24 hours.
UTC time, for example, '2020-01-01T12:00:00Z'.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time for statistics. Defaults to one hour after `StartTime`. You can query the data of up to 24 hours.
UTC time, for example, '2020-01-01T12:00:00Z'.
     * @param EndTime End time for statistics. Defaults to one hour after `StartTime`. You can query the data of up to 24 hours.
UTC time, for example, '2020-01-01T12:00:00Z'.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Peer client or server IP address. 
     * @return RemoteIp Peer client or server IP address.
     */
    public String getRemoteIp() {
        return this.RemoteIp;
    }

    /**
     * Set Peer client or server IP address.
     * @param RemoteIp Peer client or server IP address.
     */
    public void setRemoteIp(String RemoteIp) {
        this.RemoteIp = RemoteIp;
    }

    public DescribeStreamLinkFlowStatisticsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStreamLinkFlowStatisticsRequest(DescribeStreamLinkFlowStatisticsRequest source) {
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.InputOutputId != null) {
            this.InputOutputId = new String(source.InputOutputId);
        }
        if (source.Pipeline != null) {
            this.Pipeline = new String(source.Pipeline);
        }
        if (source.Period != null) {
            this.Period = new String(source.Period);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.RemoteIp != null) {
            this.RemoteIp = new String(source.RemoteIp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "InputOutputId", this.InputOutputId);
        this.setParamSimple(map, prefix + "Pipeline", this.Pipeline);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "RemoteIp", this.RemoteIp);

    }
}


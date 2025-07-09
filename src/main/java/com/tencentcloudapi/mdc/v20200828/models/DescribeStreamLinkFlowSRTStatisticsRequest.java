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

public class DescribeStreamLinkFlowSRTStatisticsRequest extends AbstractModel {

    /**
    * The flow ID.
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * Whether to query the inputs or outputs. Valid values: input, output.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * The input or output ID.
    */
    @SerializedName("InputOutputId")
    @Expose
    private String InputOutputId;

    /**
    * Whether to query the primary or backup pipeline. Valid values: 0, 1.
    */
    @SerializedName("Pipeline")
    @Expose
    private String Pipeline;

    /**
    * The start time for query, which is 1 hour ago by default. You can query statistics in the last 7 days.
It must be in UTC format, such as `2020-01-01T12:00:00Z`.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * The end time for query, which is 1 hour after the start time by default. The longest time range allowed for query is 24 hours.
It must be in UTC format, such as `2020-01-01T12:00:00Z`.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * The query interval. Valid values: 5s, 1min, 5min, 15min.
    */
    @SerializedName("Period")
    @Expose
    private String Period;

    /**
     * Get The flow ID. 
     * @return FlowId The flow ID.
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set The flow ID.
     * @param FlowId The flow ID.
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get Whether to query the inputs or outputs. Valid values: input, output. 
     * @return Type Whether to query the inputs or outputs. Valid values: input, output.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Whether to query the inputs or outputs. Valid values: input, output.
     * @param Type Whether to query the inputs or outputs. Valid values: input, output.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get The input or output ID. 
     * @return InputOutputId The input or output ID.
     */
    public String getInputOutputId() {
        return this.InputOutputId;
    }

    /**
     * Set The input or output ID.
     * @param InputOutputId The input or output ID.
     */
    public void setInputOutputId(String InputOutputId) {
        this.InputOutputId = InputOutputId;
    }

    /**
     * Get Whether to query the primary or backup pipeline. Valid values: 0, 1. 
     * @return Pipeline Whether to query the primary or backup pipeline. Valid values: 0, 1.
     */
    public String getPipeline() {
        return this.Pipeline;
    }

    /**
     * Set Whether to query the primary or backup pipeline. Valid values: 0, 1.
     * @param Pipeline Whether to query the primary or backup pipeline. Valid values: 0, 1.
     */
    public void setPipeline(String Pipeline) {
        this.Pipeline = Pipeline;
    }

    /**
     * Get The start time for query, which is 1 hour ago by default. You can query statistics in the last 7 days.
It must be in UTC format, such as `2020-01-01T12:00:00Z`. 
     * @return StartTime The start time for query, which is 1 hour ago by default. You can query statistics in the last 7 days.
It must be in UTC format, such as `2020-01-01T12:00:00Z`.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set The start time for query, which is 1 hour ago by default. You can query statistics in the last 7 days.
It must be in UTC format, such as `2020-01-01T12:00:00Z`.
     * @param StartTime The start time for query, which is 1 hour ago by default. You can query statistics in the last 7 days.
It must be in UTC format, such as `2020-01-01T12:00:00Z`.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get The end time for query, which is 1 hour after the start time by default. The longest time range allowed for query is 24 hours.
It must be in UTC format, such as `2020-01-01T12:00:00Z`. 
     * @return EndTime The end time for query, which is 1 hour after the start time by default. The longest time range allowed for query is 24 hours.
It must be in UTC format, such as `2020-01-01T12:00:00Z`.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set The end time for query, which is 1 hour after the start time by default. The longest time range allowed for query is 24 hours.
It must be in UTC format, such as `2020-01-01T12:00:00Z`.
     * @param EndTime The end time for query, which is 1 hour after the start time by default. The longest time range allowed for query is 24 hours.
It must be in UTC format, such as `2020-01-01T12:00:00Z`.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get The query interval. Valid values: 5s, 1min, 5min, 15min. 
     * @return Period The query interval. Valid values: 5s, 1min, 5min, 15min.
     */
    public String getPeriod() {
        return this.Period;
    }

    /**
     * Set The query interval. Valid values: 5s, 1min, 5min, 15min.
     * @param Period The query interval. Valid values: 5s, 1min, 5min, 15min.
     */
    public void setPeriod(String Period) {
        this.Period = Period;
    }

    public DescribeStreamLinkFlowSRTStatisticsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStreamLinkFlowSRTStatisticsRequest(DescribeStreamLinkFlowSRTStatisticsRequest source) {
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
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Period != null) {
            this.Period = new String(source.Period);
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
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Period", this.Period);

    }
}


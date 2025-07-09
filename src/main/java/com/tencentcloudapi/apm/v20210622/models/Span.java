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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Span extends AbstractModel {

    /**
    * Trace ID
    */
    @SerializedName("TraceID")
    @Expose
    private String TraceID;

    /**
    * Log.
    */
    @SerializedName("Logs")
    @Expose
    private SpanLog [] Logs;

    /**
    * Tag.
    */
    @SerializedName("Tags")
    @Expose
    private SpanTag [] Tags;

    /**
    * Submit application service information.
    */
    @SerializedName("Process")
    @Expose
    private SpanProcess Process;

    /**
    * Generated timestamp (ms).
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * Span name.
    */
    @SerializedName("OperationName")
    @Expose
    private String OperationName;

    /**
    * Association relationship.
    */
    @SerializedName("References")
    @Expose
    private SpanReference [] References;

    /**
    * Generated timestamp (ms).
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * Duration (ms).
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * Span ID
    */
    @SerializedName("SpanID")
    @Expose
    private String SpanID;

    /**
    * Generated timestamp (ms).
    */
    @SerializedName("StartTimeMillis")
    @Expose
    private Long StartTimeMillis;

    /**
    * Parent Span ID
    */
    @SerializedName("ParentSpanID")
    @Expose
    private String ParentSpanID;

    /**
     * Get Trace ID 
     * @return TraceID Trace ID
     */
    public String getTraceID() {
        return this.TraceID;
    }

    /**
     * Set Trace ID
     * @param TraceID Trace ID
     */
    public void setTraceID(String TraceID) {
        this.TraceID = TraceID;
    }

    /**
     * Get Log. 
     * @return Logs Log.
     */
    public SpanLog [] getLogs() {
        return this.Logs;
    }

    /**
     * Set Log.
     * @param Logs Log.
     */
    public void setLogs(SpanLog [] Logs) {
        this.Logs = Logs;
    }

    /**
     * Get Tag. 
     * @return Tags Tag.
     */
    public SpanTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag.
     * @param Tags Tag.
     */
    public void setTags(SpanTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Submit application service information. 
     * @return Process Submit application service information.
     */
    public SpanProcess getProcess() {
        return this.Process;
    }

    /**
     * Set Submit application service information.
     * @param Process Submit application service information.
     */
    public void setProcess(SpanProcess Process) {
        this.Process = Process;
    }

    /**
     * Get Generated timestamp (ms). 
     * @return Timestamp Generated timestamp (ms).
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set Generated timestamp (ms).
     * @param Timestamp Generated timestamp (ms).
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get Span name. 
     * @return OperationName Span name.
     */
    public String getOperationName() {
        return this.OperationName;
    }

    /**
     * Set Span name.
     * @param OperationName Span name.
     */
    public void setOperationName(String OperationName) {
        this.OperationName = OperationName;
    }

    /**
     * Get Association relationship. 
     * @return References Association relationship.
     */
    public SpanReference [] getReferences() {
        return this.References;
    }

    /**
     * Set Association relationship.
     * @param References Association relationship.
     */
    public void setReferences(SpanReference [] References) {
        this.References = References;
    }

    /**
     * Get Generated timestamp (ms). 
     * @return StartTime Generated timestamp (ms).
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Generated timestamp (ms).
     * @param StartTime Generated timestamp (ms).
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Duration (ms). 
     * @return Duration Duration (ms).
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set Duration (ms).
     * @param Duration Duration (ms).
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get Span ID 
     * @return SpanID Span ID
     */
    public String getSpanID() {
        return this.SpanID;
    }

    /**
     * Set Span ID
     * @param SpanID Span ID
     */
    public void setSpanID(String SpanID) {
        this.SpanID = SpanID;
    }

    /**
     * Get Generated timestamp (ms). 
     * @return StartTimeMillis Generated timestamp (ms).
     */
    public Long getStartTimeMillis() {
        return this.StartTimeMillis;
    }

    /**
     * Set Generated timestamp (ms).
     * @param StartTimeMillis Generated timestamp (ms).
     */
    public void setStartTimeMillis(Long StartTimeMillis) {
        this.StartTimeMillis = StartTimeMillis;
    }

    /**
     * Get Parent Span ID 
     * @return ParentSpanID Parent Span ID
     */
    public String getParentSpanID() {
        return this.ParentSpanID;
    }

    /**
     * Set Parent Span ID
     * @param ParentSpanID Parent Span ID
     */
    public void setParentSpanID(String ParentSpanID) {
        this.ParentSpanID = ParentSpanID;
    }

    public Span() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Span(Span source) {
        if (source.TraceID != null) {
            this.TraceID = new String(source.TraceID);
        }
        if (source.Logs != null) {
            this.Logs = new SpanLog[source.Logs.length];
            for (int i = 0; i < source.Logs.length; i++) {
                this.Logs[i] = new SpanLog(source.Logs[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new SpanTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new SpanTag(source.Tags[i]);
            }
        }
        if (source.Process != null) {
            this.Process = new SpanProcess(source.Process);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.OperationName != null) {
            this.OperationName = new String(source.OperationName);
        }
        if (source.References != null) {
            this.References = new SpanReference[source.References.length];
            for (int i = 0; i < source.References.length; i++) {
                this.References[i] = new SpanReference(source.References[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.SpanID != null) {
            this.SpanID = new String(source.SpanID);
        }
        if (source.StartTimeMillis != null) {
            this.StartTimeMillis = new Long(source.StartTimeMillis);
        }
        if (source.ParentSpanID != null) {
            this.ParentSpanID = new String(source.ParentSpanID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TraceID", this.TraceID);
        this.setParamArrayObj(map, prefix + "Logs.", this.Logs);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamObj(map, prefix + "Process.", this.Process);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "OperationName", this.OperationName);
        this.setParamArrayObj(map, prefix + "References.", this.References);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "SpanID", this.SpanID);
        this.setParamSimple(map, prefix + "StartTimeMillis", this.StartTimeMillis);
        this.setParamSimple(map, prefix + "ParentSpanID", this.ParentSpanID);

    }
}


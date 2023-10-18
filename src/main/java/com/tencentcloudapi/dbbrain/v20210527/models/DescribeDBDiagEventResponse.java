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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBDiagEventResponse extends AbstractModel {

    /**
    * Diagnosis item.
    */
    @SerializedName("DiagItem")
    @Expose
    private String DiagItem;

    /**
    * Diagnosis type.
    */
    @SerializedName("DiagType")
    @Expose
    private String DiagType;

    /**
    * Event ID.
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
    * Diagnosis event details. If there is no additional explanation information, the output will be empty.
    */
    @SerializedName("Explanation")
    @Expose
    private String Explanation;

    /**
    * Diagnosis summary.
    */
    @SerializedName("Outline")
    @Expose
    private String Outline;

    /**
    * Found problem.
    */
    @SerializedName("Problem")
    @Expose
    private String Problem;

    /**
    * Severity, which can be divided into 5 levels: `1` (Critical), `2` (Severe), `3` (Alarm), `4` (Reminder), `5` (healthy).
    */
    @SerializedName("Severity")
    @Expose
    private Long Severity;

    /**
    * Start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Suggestions. If there are no suggestions, the output will be empty.
    */
    @SerializedName("Suggestions")
    @Expose
    private String Suggestions;

    /**
    * Reserved field.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * End time.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Diagnosis item. 
     * @return DiagItem Diagnosis item.
     */
    public String getDiagItem() {
        return this.DiagItem;
    }

    /**
     * Set Diagnosis item.
     * @param DiagItem Diagnosis item.
     */
    public void setDiagItem(String DiagItem) {
        this.DiagItem = DiagItem;
    }

    /**
     * Get Diagnosis type. 
     * @return DiagType Diagnosis type.
     */
    public String getDiagType() {
        return this.DiagType;
    }

    /**
     * Set Diagnosis type.
     * @param DiagType Diagnosis type.
     */
    public void setDiagType(String DiagType) {
        this.DiagType = DiagType;
    }

    /**
     * Get Event ID. 
     * @return EventId Event ID.
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set Event ID.
     * @param EventId Event ID.
     */
    public void setEventId(Long EventId) {
        this.EventId = EventId;
    }

    /**
     * Get Diagnosis event details. If there is no additional explanation information, the output will be empty. 
     * @return Explanation Diagnosis event details. If there is no additional explanation information, the output will be empty.
     */
    public String getExplanation() {
        return this.Explanation;
    }

    /**
     * Set Diagnosis event details. If there is no additional explanation information, the output will be empty.
     * @param Explanation Diagnosis event details. If there is no additional explanation information, the output will be empty.
     */
    public void setExplanation(String Explanation) {
        this.Explanation = Explanation;
    }

    /**
     * Get Diagnosis summary. 
     * @return Outline Diagnosis summary.
     */
    public String getOutline() {
        return this.Outline;
    }

    /**
     * Set Diagnosis summary.
     * @param Outline Diagnosis summary.
     */
    public void setOutline(String Outline) {
        this.Outline = Outline;
    }

    /**
     * Get Found problem. 
     * @return Problem Found problem.
     */
    public String getProblem() {
        return this.Problem;
    }

    /**
     * Set Found problem.
     * @param Problem Found problem.
     */
    public void setProblem(String Problem) {
        this.Problem = Problem;
    }

    /**
     * Get Severity, which can be divided into 5 levels: `1` (Critical), `2` (Severe), `3` (Alarm), `4` (Reminder), `5` (healthy). 
     * @return Severity Severity, which can be divided into 5 levels: `1` (Critical), `2` (Severe), `3` (Alarm), `4` (Reminder), `5` (healthy).
     */
    public Long getSeverity() {
        return this.Severity;
    }

    /**
     * Set Severity, which can be divided into 5 levels: `1` (Critical), `2` (Severe), `3` (Alarm), `4` (Reminder), `5` (healthy).
     * @param Severity Severity, which can be divided into 5 levels: `1` (Critical), `2` (Severe), `3` (Alarm), `4` (Reminder), `5` (healthy).
     */
    public void setSeverity(Long Severity) {
        this.Severity = Severity;
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
     * Get Suggestions. If there are no suggestions, the output will be empty. 
     * @return Suggestions Suggestions. If there are no suggestions, the output will be empty.
     */
    public String getSuggestions() {
        return this.Suggestions;
    }

    /**
     * Set Suggestions. If there are no suggestions, the output will be empty.
     * @param Suggestions Suggestions. If there are no suggestions, the output will be empty.
     */
    public void setSuggestions(String Suggestions) {
        this.Suggestions = Suggestions;
    }

    /**
     * Get Reserved field.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Metric Reserved field.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set Reserved field.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Metric Reserved field.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get End time. 
     * @return EndTime End time.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time.
     * @param EndTime End time.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeDBDiagEventResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBDiagEventResponse(DescribeDBDiagEventResponse source) {
        if (source.DiagItem != null) {
            this.DiagItem = new String(source.DiagItem);
        }
        if (source.DiagType != null) {
            this.DiagType = new String(source.DiagType);
        }
        if (source.EventId != null) {
            this.EventId = new Long(source.EventId);
        }
        if (source.Explanation != null) {
            this.Explanation = new String(source.Explanation);
        }
        if (source.Outline != null) {
            this.Outline = new String(source.Outline);
        }
        if (source.Problem != null) {
            this.Problem = new String(source.Problem);
        }
        if (source.Severity != null) {
            this.Severity = new Long(source.Severity);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.Suggestions != null) {
            this.Suggestions = new String(source.Suggestions);
        }
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiagItem", this.DiagItem);
        this.setParamSimple(map, prefix + "DiagType", this.DiagType);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "Explanation", this.Explanation);
        this.setParamSimple(map, prefix + "Outline", this.Outline);
        this.setParamSimple(map, prefix + "Problem", this.Problem);
        this.setParamSimple(map, prefix + "Severity", this.Severity);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Suggestions", this.Suggestions);
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


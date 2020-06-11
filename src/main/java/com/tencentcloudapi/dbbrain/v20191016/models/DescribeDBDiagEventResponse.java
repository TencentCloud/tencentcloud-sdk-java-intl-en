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
package com.tencentcloudapi.dbbrain.v20191016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBDiagEventResponse extends AbstractModel{

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
    * Event details.
    */
    @SerializedName("Explanation")
    @Expose
    private String Explanation;

    /**
    * Summary.
    */
    @SerializedName("Outline")
    @Expose
    private String Outline;

    /**
    * Problem found.
    */
    @SerializedName("Problem")
    @Expose
    private String Problem;

    /**
    * Severity, which can be divided into 5 levels: 1: fatal, 2: severe, 3: warning, 4: notice, 5: healthy.
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
    * Suggestion.
    */
    @SerializedName("Suggestions")
    @Expose
    private String Suggestions;

    /**
    * Reserved field.
Note: this field may return null, indicating that no valid values can be obtained.
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
     * Get Event details. 
     * @return Explanation Event details.
     */
    public String getExplanation() {
        return this.Explanation;
    }

    /**
     * Set Event details.
     * @param Explanation Event details.
     */
    public void setExplanation(String Explanation) {
        this.Explanation = Explanation;
    }

    /**
     * Get Summary. 
     * @return Outline Summary.
     */
    public String getOutline() {
        return this.Outline;
    }

    /**
     * Set Summary.
     * @param Outline Summary.
     */
    public void setOutline(String Outline) {
        this.Outline = Outline;
    }

    /**
     * Get Problem found. 
     * @return Problem Problem found.
     */
    public String getProblem() {
        return this.Problem;
    }

    /**
     * Set Problem found.
     * @param Problem Problem found.
     */
    public void setProblem(String Problem) {
        this.Problem = Problem;
    }

    /**
     * Get Severity, which can be divided into 5 levels: 1: fatal, 2: severe, 3: warning, 4: notice, 5: healthy. 
     * @return Severity Severity, which can be divided into 5 levels: 1: fatal, 2: severe, 3: warning, 4: notice, 5: healthy.
     */
    public Long getSeverity() {
        return this.Severity;
    }

    /**
     * Set Severity, which can be divided into 5 levels: 1: fatal, 2: severe, 3: warning, 4: notice, 5: healthy.
     * @param Severity Severity, which can be divided into 5 levels: 1: fatal, 2: severe, 3: warning, 4: notice, 5: healthy.
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
     * Get Suggestion. 
     * @return Suggestions Suggestion.
     */
    public String getSuggestions() {
        return this.Suggestions;
    }

    /**
     * Set Suggestion.
     * @param Suggestions Suggestion.
     */
    public void setSuggestions(String Suggestions) {
        this.Suggestions = Suggestions;
    }

    /**
     * Get Reserved field.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Metric Reserved field.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set Reserved field.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Metric Reserved field.
Note: this field may return null, indicating that no valid values can be obtained.
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


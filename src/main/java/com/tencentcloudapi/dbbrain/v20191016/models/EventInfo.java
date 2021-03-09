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

public class EventInfo extends AbstractModel{

    /**
    * Event ID
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
    * Diagnosis type
    */
    @SerializedName("DiagType")
    @Expose
    private String DiagType;

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
    * Summary
    */
    @SerializedName("Outline")
    @Expose
    private String Outline;

    /**
    * Severity, which can be divided into 5 levels: 1: fatal, 2: severe, 3: warning, 4: notice, 5: healthy.
    */
    @SerializedName("Severity")
    @Expose
    private Long Severity;

    /**
    * Deduction
    */
    @SerializedName("ScoreLost")
    @Expose
    private Long ScoreLost;

    /**
    * Reserved field
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * The number of alarms
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get Event ID 
     * @return EventId Event ID
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set Event ID
     * @param EventId Event ID
     */
    public void setEventId(Long EventId) {
        this.EventId = EventId;
    }

    /**
     * Get Diagnosis type 
     * @return DiagType Diagnosis type
     */
    public String getDiagType() {
        return this.DiagType;
    }

    /**
     * Set Diagnosis type
     * @param DiagType Diagnosis type
     */
    public void setDiagType(String DiagType) {
        this.DiagType = DiagType;
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
     * Get Summary 
     * @return Outline Summary
     */
    public String getOutline() {
        return this.Outline;
    }

    /**
     * Set Summary
     * @param Outline Summary
     */
    public void setOutline(String Outline) {
        this.Outline = Outline;
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
     * Get Deduction 
     * @return ScoreLost Deduction
     */
    public Long getScoreLost() {
        return this.ScoreLost;
    }

    /**
     * Set Deduction
     * @param ScoreLost Deduction
     */
    public void setScoreLost(Long ScoreLost) {
        this.ScoreLost = ScoreLost;
    }

    /**
     * Get Reserved field 
     * @return Metric Reserved field
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set Reserved field
     * @param Metric Reserved field
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get The number of alarms 
     * @return Count The number of alarms
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set The number of alarms
     * @param Count The number of alarms
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "DiagType", this.DiagType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Outline", this.Outline);
        this.setParamSimple(map, prefix + "Severity", this.Severity);
        this.setParamSimple(map, prefix + "ScoreLost", this.ScoreLost);
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}


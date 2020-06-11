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

public class DiagHistoryEventItem extends AbstractModel{

    /**
    * Diagnosis type.
    */
    @SerializedName("DiagType")
    @Expose
    private String DiagType;

    /**
    * End time.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Start time.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Event ID.
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
    * Severity, which can be divided into 5 levels: 1: fatal, 2: severe, 3: warning, 4: notice, 5: healthy.
    */
    @SerializedName("Severity")
    @Expose
    private Long Severity;

    /**
    * Summary.
    */
    @SerializedName("Outline")
    @Expose
    private String Outline;

    /**
    * Diagnosis item.
    */
    @SerializedName("DiagItem")
    @Expose
    private String DiagItem;

    /**
    * Instance ID.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Reserved field
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * Region
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

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
     * Get Instance ID.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return InstanceId Instance ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param InstanceId Instance ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Reserved field
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Metric Reserved field
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set Reserved field
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Metric Reserved field
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get Region
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Region Region
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Region Region
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiagType", this.DiagType);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "Severity", this.Severity);
        this.setParamSimple(map, prefix + "Outline", this.Outline);
        this.setParamSimple(map, prefix + "DiagItem", this.DiagItem);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}


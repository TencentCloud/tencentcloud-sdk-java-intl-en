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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiagHistoryEventItem extends AbstractModel {

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
    * Unique event ID.
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
    * Diagnosis summary.
    */
    @SerializedName("Outline")
    @Expose
    private String Outline;

    /**
    * Diagnosis item description.
    */
    @SerializedName("DiagItem")
    @Expose
    private String DiagItem;

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Reserved field.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * Region.
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
     * Get Unique event ID. 
     * @return EventId Unique event ID.
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set Unique event ID.
     * @param EventId Unique event ID.
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
     * Get Diagnosis item description. 
     * @return DiagItem Diagnosis item description.
     */
    public String getDiagItem() {
        return this.DiagItem;
    }

    /**
     * Set Diagnosis item description.
     * @param DiagItem Diagnosis item description.
     */
    public void setDiagItem(String DiagItem) {
        this.DiagItem = DiagItem;
    }

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
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
     * Get Region. 
     * @return Region Region.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region.
     * @param Region Region.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public DiagHistoryEventItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiagHistoryEventItem(DiagHistoryEventItem source) {
        if (source.DiagType != null) {
            this.DiagType = new String(source.DiagType);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EventId != null) {
            this.EventId = new Long(source.EventId);
        }
        if (source.Severity != null) {
            this.Severity = new Long(source.Severity);
        }
        if (source.Outline != null) {
            this.Outline = new String(source.Outline);
        }
        if (source.DiagItem != null) {
            this.DiagItem = new String(source.DiagItem);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
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


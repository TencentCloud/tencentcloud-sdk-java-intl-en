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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateScheduledSqlRequest extends AbstractModel {

    /**
    * Source log topic
    */
    @SerializedName("SrcTopicId")
    @Expose
    private String SrcTopicId;

    /**
    * Task name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Task start status. 1: Enabled, 2: Disabled
    */
    @SerializedName("EnableFlag")
    @Expose
    private Long EnableFlag;

    /**
    * Target log topic for scheduled SQL analysis
    */
    @SerializedName("DstResource")
    @Expose
    private ScheduledSqlResouceInfo DstResource;

    /**
    * Query statement
    */
    @SerializedName("ScheduledSqlContent")
    @Expose
    private String ScheduledSqlContent;

    /**
    * Schedule start time, Unix timestamp, in milliseconds
    */
    @SerializedName("ProcessStartTime")
    @Expose
    private Long ProcessStartTime;

    /**
    * Schedule type: 1: Continuous running; 2: Specified time range
    */
    @SerializedName("ProcessType")
    @Expose
    private Long ProcessType;

    /**
    * Scheduling interval (minutes)
    */
    @SerializedName("ProcessPeriod")
    @Expose
    private Long ProcessPeriod;

    /**
    * Time window for a single query. If your target topic is a metric topic, it is recommended that the size of this parameter not exceed 30 minutes, otherwise, metric conversion may fail.
    */
    @SerializedName("ProcessTimeWindow")
    @Expose
    private String ProcessTimeWindow;

    /**
    * Execution delay (Seconds)
    */
    @SerializedName("ProcessDelay")
    @Expose
    private Long ProcessDelay;

    /**
    * Source topic ID region information
    */
    @SerializedName("SrcTopicRegion")
    @Expose
    private String SrcTopicRegion;

    /**
    * Schedule end time. Required field when ProcessType=2, Unix timestamp, in milliseconds
    */
    @SerializedName("ProcessEndTime")
    @Expose
    private Long ProcessEndTime;

    /**
    * Query syntax rules. Default value is 0. 0: Lucene syntax, 1: CQL syntax
    */
    @SerializedName("SyntaxRule")
    @Expose
    private Long SyntaxRule;

    /**
     * Get Source log topic 
     * @return SrcTopicId Source log topic
     */
    public String getSrcTopicId() {
        return this.SrcTopicId;
    }

    /**
     * Set Source log topic
     * @param SrcTopicId Source log topic
     */
    public void setSrcTopicId(String SrcTopicId) {
        this.SrcTopicId = SrcTopicId;
    }

    /**
     * Get Task name 
     * @return Name Task name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Task name
     * @param Name Task name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Task start status. 1: Enabled, 2: Disabled 
     * @return EnableFlag Task start status. 1: Enabled, 2: Disabled
     */
    public Long getEnableFlag() {
        return this.EnableFlag;
    }

    /**
     * Set Task start status. 1: Enabled, 2: Disabled
     * @param EnableFlag Task start status. 1: Enabled, 2: Disabled
     */
    public void setEnableFlag(Long EnableFlag) {
        this.EnableFlag = EnableFlag;
    }

    /**
     * Get Target log topic for scheduled SQL analysis 
     * @return DstResource Target log topic for scheduled SQL analysis
     */
    public ScheduledSqlResouceInfo getDstResource() {
        return this.DstResource;
    }

    /**
     * Set Target log topic for scheduled SQL analysis
     * @param DstResource Target log topic for scheduled SQL analysis
     */
    public void setDstResource(ScheduledSqlResouceInfo DstResource) {
        this.DstResource = DstResource;
    }

    /**
     * Get Query statement 
     * @return ScheduledSqlContent Query statement
     */
    public String getScheduledSqlContent() {
        return this.ScheduledSqlContent;
    }

    /**
     * Set Query statement
     * @param ScheduledSqlContent Query statement
     */
    public void setScheduledSqlContent(String ScheduledSqlContent) {
        this.ScheduledSqlContent = ScheduledSqlContent;
    }

    /**
     * Get Schedule start time, Unix timestamp, in milliseconds 
     * @return ProcessStartTime Schedule start time, Unix timestamp, in milliseconds
     */
    public Long getProcessStartTime() {
        return this.ProcessStartTime;
    }

    /**
     * Set Schedule start time, Unix timestamp, in milliseconds
     * @param ProcessStartTime Schedule start time, Unix timestamp, in milliseconds
     */
    public void setProcessStartTime(Long ProcessStartTime) {
        this.ProcessStartTime = ProcessStartTime;
    }

    /**
     * Get Schedule type: 1: Continuous running; 2: Specified time range 
     * @return ProcessType Schedule type: 1: Continuous running; 2: Specified time range
     */
    public Long getProcessType() {
        return this.ProcessType;
    }

    /**
     * Set Schedule type: 1: Continuous running; 2: Specified time range
     * @param ProcessType Schedule type: 1: Continuous running; 2: Specified time range
     */
    public void setProcessType(Long ProcessType) {
        this.ProcessType = ProcessType;
    }

    /**
     * Get Scheduling interval (minutes) 
     * @return ProcessPeriod Scheduling interval (minutes)
     */
    public Long getProcessPeriod() {
        return this.ProcessPeriod;
    }

    /**
     * Set Scheduling interval (minutes)
     * @param ProcessPeriod Scheduling interval (minutes)
     */
    public void setProcessPeriod(Long ProcessPeriod) {
        this.ProcessPeriod = ProcessPeriod;
    }

    /**
     * Get Time window for a single query. If your target topic is a metric topic, it is recommended that the size of this parameter not exceed 30 minutes, otherwise, metric conversion may fail. 
     * @return ProcessTimeWindow Time window for a single query. If your target topic is a metric topic, it is recommended that the size of this parameter not exceed 30 minutes, otherwise, metric conversion may fail.
     */
    public String getProcessTimeWindow() {
        return this.ProcessTimeWindow;
    }

    /**
     * Set Time window for a single query. If your target topic is a metric topic, it is recommended that the size of this parameter not exceed 30 minutes, otherwise, metric conversion may fail.
     * @param ProcessTimeWindow Time window for a single query. If your target topic is a metric topic, it is recommended that the size of this parameter not exceed 30 minutes, otherwise, metric conversion may fail.
     */
    public void setProcessTimeWindow(String ProcessTimeWindow) {
        this.ProcessTimeWindow = ProcessTimeWindow;
    }

    /**
     * Get Execution delay (Seconds) 
     * @return ProcessDelay Execution delay (Seconds)
     */
    public Long getProcessDelay() {
        return this.ProcessDelay;
    }

    /**
     * Set Execution delay (Seconds)
     * @param ProcessDelay Execution delay (Seconds)
     */
    public void setProcessDelay(Long ProcessDelay) {
        this.ProcessDelay = ProcessDelay;
    }

    /**
     * Get Source topic ID region information 
     * @return SrcTopicRegion Source topic ID region information
     */
    public String getSrcTopicRegion() {
        return this.SrcTopicRegion;
    }

    /**
     * Set Source topic ID region information
     * @param SrcTopicRegion Source topic ID region information
     */
    public void setSrcTopicRegion(String SrcTopicRegion) {
        this.SrcTopicRegion = SrcTopicRegion;
    }

    /**
     * Get Schedule end time. Required field when ProcessType=2, Unix timestamp, in milliseconds 
     * @return ProcessEndTime Schedule end time. Required field when ProcessType=2, Unix timestamp, in milliseconds
     */
    public Long getProcessEndTime() {
        return this.ProcessEndTime;
    }

    /**
     * Set Schedule end time. Required field when ProcessType=2, Unix timestamp, in milliseconds
     * @param ProcessEndTime Schedule end time. Required field when ProcessType=2, Unix timestamp, in milliseconds
     */
    public void setProcessEndTime(Long ProcessEndTime) {
        this.ProcessEndTime = ProcessEndTime;
    }

    /**
     * Get Query syntax rules. Default value is 0. 0: Lucene syntax, 1: CQL syntax 
     * @return SyntaxRule Query syntax rules. Default value is 0. 0: Lucene syntax, 1: CQL syntax
     */
    public Long getSyntaxRule() {
        return this.SyntaxRule;
    }

    /**
     * Set Query syntax rules. Default value is 0. 0: Lucene syntax, 1: CQL syntax
     * @param SyntaxRule Query syntax rules. Default value is 0. 0: Lucene syntax, 1: CQL syntax
     */
    public void setSyntaxRule(Long SyntaxRule) {
        this.SyntaxRule = SyntaxRule;
    }

    public CreateScheduledSqlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateScheduledSqlRequest(CreateScheduledSqlRequest source) {
        if (source.SrcTopicId != null) {
            this.SrcTopicId = new String(source.SrcTopicId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.EnableFlag != null) {
            this.EnableFlag = new Long(source.EnableFlag);
        }
        if (source.DstResource != null) {
            this.DstResource = new ScheduledSqlResouceInfo(source.DstResource);
        }
        if (source.ScheduledSqlContent != null) {
            this.ScheduledSqlContent = new String(source.ScheduledSqlContent);
        }
        if (source.ProcessStartTime != null) {
            this.ProcessStartTime = new Long(source.ProcessStartTime);
        }
        if (source.ProcessType != null) {
            this.ProcessType = new Long(source.ProcessType);
        }
        if (source.ProcessPeriod != null) {
            this.ProcessPeriod = new Long(source.ProcessPeriod);
        }
        if (source.ProcessTimeWindow != null) {
            this.ProcessTimeWindow = new String(source.ProcessTimeWindow);
        }
        if (source.ProcessDelay != null) {
            this.ProcessDelay = new Long(source.ProcessDelay);
        }
        if (source.SrcTopicRegion != null) {
            this.SrcTopicRegion = new String(source.SrcTopicRegion);
        }
        if (source.ProcessEndTime != null) {
            this.ProcessEndTime = new Long(source.ProcessEndTime);
        }
        if (source.SyntaxRule != null) {
            this.SyntaxRule = new Long(source.SyntaxRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SrcTopicId", this.SrcTopicId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "EnableFlag", this.EnableFlag);
        this.setParamObj(map, prefix + "DstResource.", this.DstResource);
        this.setParamSimple(map, prefix + "ScheduledSqlContent", this.ScheduledSqlContent);
        this.setParamSimple(map, prefix + "ProcessStartTime", this.ProcessStartTime);
        this.setParamSimple(map, prefix + "ProcessType", this.ProcessType);
        this.setParamSimple(map, prefix + "ProcessPeriod", this.ProcessPeriod);
        this.setParamSimple(map, prefix + "ProcessTimeWindow", this.ProcessTimeWindow);
        this.setParamSimple(map, prefix + "ProcessDelay", this.ProcessDelay);
        this.setParamSimple(map, prefix + "SrcTopicRegion", this.SrcTopicRegion);
        this.setParamSimple(map, prefix + "ProcessEndTime", this.ProcessEndTime);
        this.setParamSimple(map, prefix + "SyntaxRule", this.SyntaxRule);

    }
}


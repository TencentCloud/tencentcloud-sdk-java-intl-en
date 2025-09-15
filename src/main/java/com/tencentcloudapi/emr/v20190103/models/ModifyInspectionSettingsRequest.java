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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInspectionSettingsRequest extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Inspection type, FixedTime or RealTime.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Task configurations.
    */
    @SerializedName("Settings")
    @Expose
    private InspectionTaskSettings [] Settings;

    /**
    * Start timestamp.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * End timestamp.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Inspection cycle, such as EveryDay, EveryWeek or EveryMonth.
    */
    @SerializedName("Strategy")
    @Expose
    private String Strategy;

    /**
    * Start time of each day.
    */
    @SerializedName("Clock")
    @Expose
    private String Clock;

    /**
    * Day of the week.
    */
    @SerializedName("DayOfWeek")
    @Expose
    private String DayOfWeek;

    /**
    * Number of the day in a month.
    */
    @SerializedName("DayOfMonth")
    @Expose
    private String DayOfMonth;

    /**
    * Inspection job ID.
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

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
     * Get Inspection type, FixedTime or RealTime. 
     * @return Type Inspection type, FixedTime or RealTime.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Inspection type, FixedTime or RealTime.
     * @param Type Inspection type, FixedTime or RealTime.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Task configurations. 
     * @return Settings Task configurations.
     */
    public InspectionTaskSettings [] getSettings() {
        return this.Settings;
    }

    /**
     * Set Task configurations.
     * @param Settings Task configurations.
     */
    public void setSettings(InspectionTaskSettings [] Settings) {
        this.Settings = Settings;
    }

    /**
     * Get Start timestamp. 
     * @return StartTime Start timestamp.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start timestamp.
     * @param StartTime Start timestamp.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End timestamp. 
     * @return EndTime End timestamp.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End timestamp.
     * @param EndTime End timestamp.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Inspection cycle, such as EveryDay, EveryWeek or EveryMonth. 
     * @return Strategy Inspection cycle, such as EveryDay, EveryWeek or EveryMonth.
     */
    public String getStrategy() {
        return this.Strategy;
    }

    /**
     * Set Inspection cycle, such as EveryDay, EveryWeek or EveryMonth.
     * @param Strategy Inspection cycle, such as EveryDay, EveryWeek or EveryMonth.
     */
    public void setStrategy(String Strategy) {
        this.Strategy = Strategy;
    }

    /**
     * Get Start time of each day. 
     * @return Clock Start time of each day.
     */
    public String getClock() {
        return this.Clock;
    }

    /**
     * Set Start time of each day.
     * @param Clock Start time of each day.
     */
    public void setClock(String Clock) {
        this.Clock = Clock;
    }

    /**
     * Get Day of the week. 
     * @return DayOfWeek Day of the week.
     */
    public String getDayOfWeek() {
        return this.DayOfWeek;
    }

    /**
     * Set Day of the week.
     * @param DayOfWeek Day of the week.
     */
    public void setDayOfWeek(String DayOfWeek) {
        this.DayOfWeek = DayOfWeek;
    }

    /**
     * Get Number of the day in a month. 
     * @return DayOfMonth Number of the day in a month.
     */
    public String getDayOfMonth() {
        return this.DayOfMonth;
    }

    /**
     * Set Number of the day in a month.
     * @param DayOfMonth Number of the day in a month.
     */
    public void setDayOfMonth(String DayOfMonth) {
        this.DayOfMonth = DayOfMonth;
    }

    /**
     * Get Inspection job ID. 
     * @return JobId Inspection job ID.
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set Inspection job ID.
     * @param JobId Inspection job ID.
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    public ModifyInspectionSettingsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInspectionSettingsRequest(ModifyInspectionSettingsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Settings != null) {
            this.Settings = new InspectionTaskSettings[source.Settings.length];
            for (int i = 0; i < source.Settings.length; i++) {
                this.Settings[i] = new InspectionTaskSettings(source.Settings[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Strategy != null) {
            this.Strategy = new String(source.Strategy);
        }
        if (source.Clock != null) {
            this.Clock = new String(source.Clock);
        }
        if (source.DayOfWeek != null) {
            this.DayOfWeek = new String(source.DayOfWeek);
        }
        if (source.DayOfMonth != null) {
            this.DayOfMonth = new String(source.DayOfMonth);
        }
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "Settings.", this.Settings);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Strategy", this.Strategy);
        this.setParamSimple(map, prefix + "Clock", this.Clock);
        this.setParamSimple(map, prefix + "DayOfWeek", this.DayOfWeek);
        this.setParamSimple(map, prefix + "DayOfMonth", this.DayOfMonth);
        this.setParamSimple(map, prefix + "JobId", this.JobId);

    }
}


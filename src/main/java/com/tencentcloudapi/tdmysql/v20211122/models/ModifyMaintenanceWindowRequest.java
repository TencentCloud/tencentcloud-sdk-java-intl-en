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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyMaintenanceWindowRequest extends AbstractModel {

    /**
    * <p>Instance ID.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Ops window start time</p><p>Parameter format: hh:mm:ss</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>Ops window duration</p><p>Value ranges from 1 to 3</p><p>Unit: hour</p>
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * <p>Ops window date</p><p>Enumeration value:</p><ul><li>Monday: Monday</li><li>Tuesday: Tuesday</li><li>Wednesday: Wednesday</li><li>Thursday: Thursday</li><li>Friday: Friday</li><li>Saturday: Saturday</li><li>Sunday: Sunday</li></ul>
    */
    @SerializedName("WeekDays")
    @Expose
    private String [] WeekDays;

    /**
     * Get <p>Instance ID.</p> 
     * @return InstanceId <p>Instance ID.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID.</p>
     * @param InstanceId <p>Instance ID.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Ops window start time</p><p>Parameter format: hh:mm:ss</p> 
     * @return StartTime <p>Ops window start time</p><p>Parameter format: hh:mm:ss</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Ops window start time</p><p>Parameter format: hh:mm:ss</p>
     * @param StartTime <p>Ops window start time</p><p>Parameter format: hh:mm:ss</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>Ops window duration</p><p>Value ranges from 1 to 3</p><p>Unit: hour</p> 
     * @return Duration <p>Ops window duration</p><p>Value ranges from 1 to 3</p><p>Unit: hour</p>
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>Ops window duration</p><p>Value ranges from 1 to 3</p><p>Unit: hour</p>
     * @param Duration <p>Ops window duration</p><p>Value ranges from 1 to 3</p><p>Unit: hour</p>
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get <p>Ops window date</p><p>Enumeration value:</p><ul><li>Monday: Monday</li><li>Tuesday: Tuesday</li><li>Wednesday: Wednesday</li><li>Thursday: Thursday</li><li>Friday: Friday</li><li>Saturday: Saturday</li><li>Sunday: Sunday</li></ul> 
     * @return WeekDays <p>Ops window date</p><p>Enumeration value:</p><ul><li>Monday: Monday</li><li>Tuesday: Tuesday</li><li>Wednesday: Wednesday</li><li>Thursday: Thursday</li><li>Friday: Friday</li><li>Saturday: Saturday</li><li>Sunday: Sunday</li></ul>
     */
    public String [] getWeekDays() {
        return this.WeekDays;
    }

    /**
     * Set <p>Ops window date</p><p>Enumeration value:</p><ul><li>Monday: Monday</li><li>Tuesday: Tuesday</li><li>Wednesday: Wednesday</li><li>Thursday: Thursday</li><li>Friday: Friday</li><li>Saturday: Saturday</li><li>Sunday: Sunday</li></ul>
     * @param WeekDays <p>Ops window date</p><p>Enumeration value:</p><ul><li>Monday: Monday</li><li>Tuesday: Tuesday</li><li>Wednesday: Wednesday</li><li>Thursday: Thursday</li><li>Friday: Friday</li><li>Saturday: Saturday</li><li>Sunday: Sunday</li></ul>
     */
    public void setWeekDays(String [] WeekDays) {
        this.WeekDays = WeekDays;
    }

    public ModifyMaintenanceWindowRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMaintenanceWindowRequest(ModifyMaintenanceWindowRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.WeekDays != null) {
            this.WeekDays = new String[source.WeekDays.length];
            for (int i = 0; i < source.WeekDays.length; i++) {
                this.WeekDays[i] = new String(source.WeekDays[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamArraySimple(map, prefix + "WeekDays.", this.WeekDays);

    }
}


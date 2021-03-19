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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TimerConfiguration extends AbstractModel{

    /**
    * The recurrence pattern of auto-scaling. `0`: undefined, `1`: once, `2`: daily, `3`: monthly, `4`: weekly
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("TimerType")
    @Expose
    private Long TimerType;

    /**
    * Details of the recurrence pattern of auto-scaling
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("TimerValue")
    @Expose
    private TimerValue TimerValue;

    /**
    * Start time of the scheduled scaling policy
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * End time of the scheduled scaling policy
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get The recurrence pattern of auto-scaling. `0`: undefined, `1`: once, `2`: daily, `3`: monthly, `4`: weekly
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return TimerType The recurrence pattern of auto-scaling. `0`: undefined, `1`: once, `2`: daily, `3`: monthly, `4`: weekly
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getTimerType() {
        return this.TimerType;
    }

    /**
     * Set The recurrence pattern of auto-scaling. `0`: undefined, `1`: once, `2`: daily, `3`: monthly, `4`: weekly
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param TimerType The recurrence pattern of auto-scaling. `0`: undefined, `1`: once, `2`: daily, `3`: monthly, `4`: weekly
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTimerType(Long TimerType) {
        this.TimerType = TimerType;
    }

    /**
     * Get Details of the recurrence pattern of auto-scaling
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return TimerValue Details of the recurrence pattern of auto-scaling
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public TimerValue getTimerValue() {
        return this.TimerValue;
    }

    /**
     * Set Details of the recurrence pattern of auto-scaling
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param TimerValue Details of the recurrence pattern of auto-scaling
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTimerValue(TimerValue TimerValue) {
        this.TimerValue = TimerValue;
    }

    /**
     * Get Start time of the scheduled scaling policy
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return BeginTime Start time of the scheduled scaling policy
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set Start time of the scheduled scaling policy
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param BeginTime Start time of the scheduled scaling policy
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get End time of the scheduled scaling policy
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return EndTime End time of the scheduled scaling policy
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time of the scheduled scaling policy
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param EndTime End time of the scheduled scaling policy
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimerType", this.TimerType);
        this.setParamObj(map, prefix + "TimerValue.", this.TimerValue);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}


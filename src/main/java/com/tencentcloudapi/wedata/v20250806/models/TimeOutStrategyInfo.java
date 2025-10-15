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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TimeOutStrategyInfo extends AbstractModel {

    /**
    * Timeout Alarm Configuration

Expected Execution Duration Timeout - The actual runtime exceeds the estimated execution duration.

Expected Completion Time Timeout - The task has not completed by the estimated completion time.

Expected Scheduling Wait Timeout - The waiting time in the scheduling queue exceeds the estimated wait time.

Cycle-Incomplete Timeout - The task was expected to complete within its scheduled cycle but did not.
    */
    @SerializedName("RuleType")
    @Expose
    private Long RuleType;

    /**
    * Timeout Value Configuration Type

1: Fixed value (specified manually)

2: Average value (calculated automatically)
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Timeout Specified Value (hours) - The timeout threshold in hours. Default is 1.
    */
    @SerializedName("Hour")
    @Expose
    private Long Hour;

    /**
    * Timeout Specified Value (minutes) - The timeout threshold in minutes. Default is 1.
    */
    @SerializedName("Min")
    @Expose
    private Long Min;

    /**
    * The time zone configuration corresponding to the timeout, such as UTC+7, defaults to UTC+8.

    */
    @SerializedName("ScheduleTimeZone")
    @Expose
    private String ScheduleTimeZone;

    /**
     * Get Timeout Alarm Configuration

Expected Execution Duration Timeout - The actual runtime exceeds the estimated execution duration.

Expected Completion Time Timeout - The task has not completed by the estimated completion time.

Expected Scheduling Wait Timeout - The waiting time in the scheduling queue exceeds the estimated wait time.

Cycle-Incomplete Timeout - The task was expected to complete within its scheduled cycle but did not. 
     * @return RuleType Timeout Alarm Configuration

Expected Execution Duration Timeout - The actual runtime exceeds the estimated execution duration.

Expected Completion Time Timeout - The task has not completed by the estimated completion time.

Expected Scheduling Wait Timeout - The waiting time in the scheduling queue exceeds the estimated wait time.

Cycle-Incomplete Timeout - The task was expected to complete within its scheduled cycle but did not.
     */
    public Long getRuleType() {
        return this.RuleType;
    }

    /**
     * Set Timeout Alarm Configuration

Expected Execution Duration Timeout - The actual runtime exceeds the estimated execution duration.

Expected Completion Time Timeout - The task has not completed by the estimated completion time.

Expected Scheduling Wait Timeout - The waiting time in the scheduling queue exceeds the estimated wait time.

Cycle-Incomplete Timeout - The task was expected to complete within its scheduled cycle but did not.
     * @param RuleType Timeout Alarm Configuration

Expected Execution Duration Timeout - The actual runtime exceeds the estimated execution duration.

Expected Completion Time Timeout - The task has not completed by the estimated completion time.

Expected Scheduling Wait Timeout - The waiting time in the scheduling queue exceeds the estimated wait time.

Cycle-Incomplete Timeout - The task was expected to complete within its scheduled cycle but did not.
     */
    public void setRuleType(Long RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get Timeout Value Configuration Type

1: Fixed value (specified manually)

2: Average value (calculated automatically) 
     * @return Type Timeout Value Configuration Type

1: Fixed value (specified manually)

2: Average value (calculated automatically)
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Timeout Value Configuration Type

1: Fixed value (specified manually)

2: Average value (calculated automatically)
     * @param Type Timeout Value Configuration Type

1: Fixed value (specified manually)

2: Average value (calculated automatically)
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Timeout Specified Value (hours) - The timeout threshold in hours. Default is 1. 
     * @return Hour Timeout Specified Value (hours) - The timeout threshold in hours. Default is 1.
     */
    public Long getHour() {
        return this.Hour;
    }

    /**
     * Set Timeout Specified Value (hours) - The timeout threshold in hours. Default is 1.
     * @param Hour Timeout Specified Value (hours) - The timeout threshold in hours. Default is 1.
     */
    public void setHour(Long Hour) {
        this.Hour = Hour;
    }

    /**
     * Get Timeout Specified Value (minutes) - The timeout threshold in minutes. Default is 1. 
     * @return Min Timeout Specified Value (minutes) - The timeout threshold in minutes. Default is 1.
     */
    public Long getMin() {
        return this.Min;
    }

    /**
     * Set Timeout Specified Value (minutes) - The timeout threshold in minutes. Default is 1.
     * @param Min Timeout Specified Value (minutes) - The timeout threshold in minutes. Default is 1.
     */
    public void setMin(Long Min) {
        this.Min = Min;
    }

    /**
     * Get The time zone configuration corresponding to the timeout, such as UTC+7, defaults to UTC+8.
 
     * @return ScheduleTimeZone The time zone configuration corresponding to the timeout, such as UTC+7, defaults to UTC+8.

     */
    public String getScheduleTimeZone() {
        return this.ScheduleTimeZone;
    }

    /**
     * Set The time zone configuration corresponding to the timeout, such as UTC+7, defaults to UTC+8.

     * @param ScheduleTimeZone The time zone configuration corresponding to the timeout, such as UTC+7, defaults to UTC+8.

     */
    public void setScheduleTimeZone(String ScheduleTimeZone) {
        this.ScheduleTimeZone = ScheduleTimeZone;
    }

    public TimeOutStrategyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TimeOutStrategyInfo(TimeOutStrategyInfo source) {
        if (source.RuleType != null) {
            this.RuleType = new Long(source.RuleType);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Hour != null) {
            this.Hour = new Long(source.Hour);
        }
        if (source.Min != null) {
            this.Min = new Long(source.Min);
        }
        if (source.ScheduleTimeZone != null) {
            this.ScheduleTimeZone = new String(source.ScheduleTimeZone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Hour", this.Hour);
        this.setParamSimple(map, prefix + "Min", this.Min);
        this.setParamSimple(map, prefix + "ScheduleTimeZone", this.ScheduleTimeZone);

    }
}


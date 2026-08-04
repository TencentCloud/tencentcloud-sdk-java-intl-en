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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InferenceScheduledScalingPolicy extends AbstractModel {

    /**
    * Scheduled scaling action list. Fill in at least 1, supports up to 10.
    */
    @SerializedName("ScheduledActions")
    @Expose
    private InferenceScheduledScalingAction [] ScheduledActions;

    /**
    * Validity period range, for description of whether the scheduled scaling policy is permanently valid or valid only within a specified date range.
    */
    @SerializedName("EffectiveRange")
    @Expose
    private InferenceScheduledScalingEffectiveRange EffectiveRange;

    /**
    * Time zone, using [IANA time zone](https://www.iana.org/time-zones) to identify the trigger time in ScheduledActions, such as UTC, Asia/Shanghai, America/New_York, Europe/London, Asia/Kolkata. UTC is used by default if not specified.





    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
     * Get Scheduled scaling action list. Fill in at least 1, supports up to 10. 
     * @return ScheduledActions Scheduled scaling action list. Fill in at least 1, supports up to 10.
     */
    public InferenceScheduledScalingAction [] getScheduledActions() {
        return this.ScheduledActions;
    }

    /**
     * Set Scheduled scaling action list. Fill in at least 1, supports up to 10.
     * @param ScheduledActions Scheduled scaling action list. Fill in at least 1, supports up to 10.
     */
    public void setScheduledActions(InferenceScheduledScalingAction [] ScheduledActions) {
        this.ScheduledActions = ScheduledActions;
    }

    /**
     * Get Validity period range, for description of whether the scheduled scaling policy is permanently valid or valid only within a specified date range. 
     * @return EffectiveRange Validity period range, for description of whether the scheduled scaling policy is permanently valid or valid only within a specified date range.
     */
    public InferenceScheduledScalingEffectiveRange getEffectiveRange() {
        return this.EffectiveRange;
    }

    /**
     * Set Validity period range, for description of whether the scheduled scaling policy is permanently valid or valid only within a specified date range.
     * @param EffectiveRange Validity period range, for description of whether the scheduled scaling policy is permanently valid or valid only within a specified date range.
     */
    public void setEffectiveRange(InferenceScheduledScalingEffectiveRange EffectiveRange) {
        this.EffectiveRange = EffectiveRange;
    }

    /**
     * Get Time zone, using [IANA time zone](https://www.iana.org/time-zones) to identify the trigger time in ScheduledActions, such as UTC, Asia/Shanghai, America/New_York, Europe/London, Asia/Kolkata. UTC is used by default if not specified.




 
     * @return TimeZone Time zone, using [IANA time zone](https://www.iana.org/time-zones) to identify the trigger time in ScheduledActions, such as UTC, Asia/Shanghai, America/New_York, Europe/London, Asia/Kolkata. UTC is used by default if not specified.





     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set Time zone, using [IANA time zone](https://www.iana.org/time-zones) to identify the trigger time in ScheduledActions, such as UTC, Asia/Shanghai, America/New_York, Europe/London, Asia/Kolkata. UTC is used by default if not specified.





     * @param TimeZone Time zone, using [IANA time zone](https://www.iana.org/time-zones) to identify the trigger time in ScheduledActions, such as UTC, Asia/Shanghai, America/New_York, Europe/London, Asia/Kolkata. UTC is used by default if not specified.





     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    public InferenceScheduledScalingPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InferenceScheduledScalingPolicy(InferenceScheduledScalingPolicy source) {
        if (source.ScheduledActions != null) {
            this.ScheduledActions = new InferenceScheduledScalingAction[source.ScheduledActions.length];
            for (int i = 0; i < source.ScheduledActions.length; i++) {
                this.ScheduledActions[i] = new InferenceScheduledScalingAction(source.ScheduledActions[i]);
            }
        }
        if (source.EffectiveRange != null) {
            this.EffectiveRange = new InferenceScheduledScalingEffectiveRange(source.EffectiveRange);
        }
        if (source.TimeZone != null) {
            this.TimeZone = new String(source.TimeZone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ScheduledActions.", this.ScheduledActions);
        this.setParamObj(map, prefix + "EffectiveRange.", this.EffectiveRange);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);

    }
}


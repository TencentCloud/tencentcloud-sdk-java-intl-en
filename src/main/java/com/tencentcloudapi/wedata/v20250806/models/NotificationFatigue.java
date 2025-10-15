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

public class NotificationFatigue extends AbstractModel {

    /**
    * Number of alarms.
    */
    @SerializedName("NotifyCount")
    @Expose
    private Long NotifyCount;

    /**
    * Alarm interval, in minutes.
    */
    @SerializedName("NotifyInterval")
    @Expose
    private Long NotifyInterval;

    /**
    * Do not disturb period, such as example value.
[{DaysOfWeek: [1, 2], StartTime: "00:00:00", EndTime: "09:00:00"}]	
Specifies notification muting from 00:00 to 09:00 every monday and tuesday.
    */
    @SerializedName("QuietIntervals")
    @Expose
    private AlarmQuietInterval [] QuietIntervals;

    /**
     * Get Number of alarms. 
     * @return NotifyCount Number of alarms.
     */
    public Long getNotifyCount() {
        return this.NotifyCount;
    }

    /**
     * Set Number of alarms.
     * @param NotifyCount Number of alarms.
     */
    public void setNotifyCount(Long NotifyCount) {
        this.NotifyCount = NotifyCount;
    }

    /**
     * Get Alarm interval, in minutes. 
     * @return NotifyInterval Alarm interval, in minutes.
     */
    public Long getNotifyInterval() {
        return this.NotifyInterval;
    }

    /**
     * Set Alarm interval, in minutes.
     * @param NotifyInterval Alarm interval, in minutes.
     */
    public void setNotifyInterval(Long NotifyInterval) {
        this.NotifyInterval = NotifyInterval;
    }

    /**
     * Get Do not disturb period, such as example value.
[{DaysOfWeek: [1, 2], StartTime: "00:00:00", EndTime: "09:00:00"}]	
Specifies notification muting from 00:00 to 09:00 every monday and tuesday. 
     * @return QuietIntervals Do not disturb period, such as example value.
[{DaysOfWeek: [1, 2], StartTime: "00:00:00", EndTime: "09:00:00"}]	
Specifies notification muting from 00:00 to 09:00 every monday and tuesday.
     */
    public AlarmQuietInterval [] getQuietIntervals() {
        return this.QuietIntervals;
    }

    /**
     * Set Do not disturb period, such as example value.
[{DaysOfWeek: [1, 2], StartTime: "00:00:00", EndTime: "09:00:00"}]	
Specifies notification muting from 00:00 to 09:00 every monday and tuesday.
     * @param QuietIntervals Do not disturb period, such as example value.
[{DaysOfWeek: [1, 2], StartTime: "00:00:00", EndTime: "09:00:00"}]	
Specifies notification muting from 00:00 to 09:00 every monday and tuesday.
     */
    public void setQuietIntervals(AlarmQuietInterval [] QuietIntervals) {
        this.QuietIntervals = QuietIntervals;
    }

    public NotificationFatigue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NotificationFatigue(NotificationFatigue source) {
        if (source.NotifyCount != null) {
            this.NotifyCount = new Long(source.NotifyCount);
        }
        if (source.NotifyInterval != null) {
            this.NotifyInterval = new Long(source.NotifyInterval);
        }
        if (source.QuietIntervals != null) {
            this.QuietIntervals = new AlarmQuietInterval[source.QuietIntervals.length];
            for (int i = 0; i < source.QuietIntervals.length; i++) {
                this.QuietIntervals[i] = new AlarmQuietInterval(source.QuietIntervals[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NotifyCount", this.NotifyCount);
        this.setParamSimple(map, prefix + "NotifyInterval", this.NotifyInterval);
        this.setParamArrayObj(map, prefix + "QuietIntervals.", this.QuietIntervals);

    }
}


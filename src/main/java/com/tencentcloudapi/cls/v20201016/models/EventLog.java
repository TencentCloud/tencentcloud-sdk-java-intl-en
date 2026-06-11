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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventLog extends AbstractModel {

    /**
    * Event channel, support
-Application log
-Security log
-Startup log
-System log
-ALL logs

    */
    @SerializedName("EventChannel")
    @Expose
    private String EventChannel;

    /**
    * Supported types of the time field (Timestamp)
-1 (User-customized time)
-2 (current time)
    */
    @SerializedName("TimeType")
    @Expose
    private Long TimeType;

    /**
    * Time, when users choose custom time type, specify the time in seconds
Format: timestamp, 1754897446
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * Event ID filter list
	
Optional. Being empty indicates no filtering is applied.
Support forward filtering for a single value (for example: 20) or a range (for example: 0-20), also support reverse filtering for a single value (for example: -20).
Multiple filter items can be separated by commas, for example: 1-200,-100 means collect event logs within the range of 1-200 except 100.
    */
    @SerializedName("EventIDs")
    @Expose
    private String [] EventIDs;

    /**
     * Get Event channel, support
-Application log
-Security log
-Startup log
-System log
-ALL logs
 
     * @return EventChannel Event channel, support
-Application log
-Security log
-Startup log
-System log
-ALL logs

     */
    public String getEventChannel() {
        return this.EventChannel;
    }

    /**
     * Set Event channel, support
-Application log
-Security log
-Startup log
-System log
-ALL logs

     * @param EventChannel Event channel, support
-Application log
-Security log
-Startup log
-System log
-ALL logs

     */
    public void setEventChannel(String EventChannel) {
        this.EventChannel = EventChannel;
    }

    /**
     * Get Supported types of the time field (Timestamp)
-1 (User-customized time)
-2 (current time) 
     * @return TimeType Supported types of the time field (Timestamp)
-1 (User-customized time)
-2 (current time)
     */
    public Long getTimeType() {
        return this.TimeType;
    }

    /**
     * Set Supported types of the time field (Timestamp)
-1 (User-customized time)
-2 (current time)
     * @param TimeType Supported types of the time field (Timestamp)
-1 (User-customized time)
-2 (current time)
     */
    public void setTimeType(Long TimeType) {
        this.TimeType = TimeType;
    }

    /**
     * Get Time, when users choose custom time type, specify the time in seconds
Format: timestamp, 1754897446 
     * @return Timestamp Time, when users choose custom time type, specify the time in seconds
Format: timestamp, 1754897446
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set Time, when users choose custom time type, specify the time in seconds
Format: timestamp, 1754897446
     * @param Timestamp Time, when users choose custom time type, specify the time in seconds
Format: timestamp, 1754897446
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get Event ID filter list
	
Optional. Being empty indicates no filtering is applied.
Support forward filtering for a single value (for example: 20) or a range (for example: 0-20), also support reverse filtering for a single value (for example: -20).
Multiple filter items can be separated by commas, for example: 1-200,-100 means collect event logs within the range of 1-200 except 100. 
     * @return EventIDs Event ID filter list
	
Optional. Being empty indicates no filtering is applied.
Support forward filtering for a single value (for example: 20) or a range (for example: 0-20), also support reverse filtering for a single value (for example: -20).
Multiple filter items can be separated by commas, for example: 1-200,-100 means collect event logs within the range of 1-200 except 100.
     */
    public String [] getEventIDs() {
        return this.EventIDs;
    }

    /**
     * Set Event ID filter list
	
Optional. Being empty indicates no filtering is applied.
Support forward filtering for a single value (for example: 20) or a range (for example: 0-20), also support reverse filtering for a single value (for example: -20).
Multiple filter items can be separated by commas, for example: 1-200,-100 means collect event logs within the range of 1-200 except 100.
     * @param EventIDs Event ID filter list
	
Optional. Being empty indicates no filtering is applied.
Support forward filtering for a single value (for example: 20) or a range (for example: 0-20), also support reverse filtering for a single value (for example: -20).
Multiple filter items can be separated by commas, for example: 1-200,-100 means collect event logs within the range of 1-200 except 100.
     */
    public void setEventIDs(String [] EventIDs) {
        this.EventIDs = EventIDs;
    }

    public EventLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventLog(EventLog source) {
        if (source.EventChannel != null) {
            this.EventChannel = new String(source.EventChannel);
        }
        if (source.TimeType != null) {
            this.TimeType = new Long(source.TimeType);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.EventIDs != null) {
            this.EventIDs = new String[source.EventIDs.length];
            for (int i = 0; i < source.EventIDs.length; i++) {
                this.EventIDs[i] = new String(source.EventIDs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventChannel", this.EventChannel);
        this.setParamSimple(map, prefix + "TimeType", this.TimeType);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamArraySimple(map, prefix + "EventIDs.", this.EventIDs);

    }
}


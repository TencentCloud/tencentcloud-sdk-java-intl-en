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

public class EventLog extends AbstractModel {

    /**
    * Event channel, supports Application, Security, Setup, System, ALL

    */
    @SerializedName("EventChannel")
    @Expose
    private String EventChannel;

    /**
    * Time type, 1: User-defined, 2: Current time
    */
    @SerializedName("TimeType")
    @Expose
    private Long TimeType;

    /**
    * Time, when choosing custom time type, a specific time is required
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * Event ID filter list
    */
    @SerializedName("EventIDs")
    @Expose
    private String [] EventIDs;

    /**
     * Get Event channel, supports Application, Security, Setup, System, ALL
 
     * @return EventChannel Event channel, supports Application, Security, Setup, System, ALL

     */
    public String getEventChannel() {
        return this.EventChannel;
    }

    /**
     * Set Event channel, supports Application, Security, Setup, System, ALL

     * @param EventChannel Event channel, supports Application, Security, Setup, System, ALL

     */
    public void setEventChannel(String EventChannel) {
        this.EventChannel = EventChannel;
    }

    /**
     * Get Time type, 1: User-defined, 2: Current time 
     * @return TimeType Time type, 1: User-defined, 2: Current time
     */
    public Long getTimeType() {
        return this.TimeType;
    }

    /**
     * Set Time type, 1: User-defined, 2: Current time
     * @param TimeType Time type, 1: User-defined, 2: Current time
     */
    public void setTimeType(Long TimeType) {
        this.TimeType = TimeType;
    }

    /**
     * Get Time, when choosing custom time type, a specific time is required 
     * @return Timestamp Time, when choosing custom time type, a specific time is required
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set Time, when choosing custom time type, a specific time is required
     * @param Timestamp Time, when choosing custom time type, a specific time is required
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get Event ID filter list 
     * @return EventIDs Event ID filter list
     */
    public String [] getEventIDs() {
        return this.EventIDs;
    }

    /**
     * Set Event ID filter list
     * @param EventIDs Event ID filter list
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


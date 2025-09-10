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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SessionEvent extends AbstractModel {

    /**
    * Event timestamp. Unix second-level timestamp.
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * Event type. currently supports StaffHold, StaffUnhold, StaffMute, StaffUnmute.
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * Describes event details related to the agent.
    */
    @SerializedName("StaffEventDetail")
    @Expose
    private EventStaffDetail StaffEventDetail;

    /**
     * Get Event timestamp. Unix second-level timestamp. 
     * @return Timestamp Event timestamp. Unix second-level timestamp.
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set Event timestamp. Unix second-level timestamp.
     * @param Timestamp Event timestamp. Unix second-level timestamp.
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get Event type. currently supports StaffHold, StaffUnhold, StaffMute, StaffUnmute. 
     * @return EventType Event type. currently supports StaffHold, StaffUnhold, StaffMute, StaffUnmute.
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set Event type. currently supports StaffHold, StaffUnhold, StaffMute, StaffUnmute.
     * @param EventType Event type. currently supports StaffHold, StaffUnhold, StaffMute, StaffUnmute.
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get Describes event details related to the agent. 
     * @return StaffEventDetail Describes event details related to the agent.
     */
    public EventStaffDetail getStaffEventDetail() {
        return this.StaffEventDetail;
    }

    /**
     * Set Describes event details related to the agent.
     * @param StaffEventDetail Describes event details related to the agent.
     */
    public void setStaffEventDetail(EventStaffDetail StaffEventDetail) {
        this.StaffEventDetail = StaffEventDetail;
    }

    public SessionEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SessionEvent(SessionEvent source) {
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.EventType != null) {
            this.EventType = new String(source.EventType);
        }
        if (source.StaffEventDetail != null) {
            this.StaffEventDetail = new EventStaffDetail(source.StaffEventDetail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamObj(map, prefix + "StaffEventDetail.", this.StaffEventDetail);

    }
}


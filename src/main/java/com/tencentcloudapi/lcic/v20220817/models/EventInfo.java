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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventInfo extends AbstractModel {

    /**
    * The Unix timestamp (seconds) when the event occurred.
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * The event type. Valid values: 
`RoomStart`: The class started. `RoomEnd`: The class ended. `MemberJoin`: A user joined. `MemberQuit`: A user left. `RecordFinish`: Recording is finished.
·Camera0n·: The camera is turned on.
`Camera0ff`: The camera is turned off.
`MicOn`: The mic is turned on.
`MicOff`: The mic is turned off.
`ScreenOn`: Screen sharing is enabled.
`ScreenOff`: Screen sharing is disabled.
`VisibleOn`: The page is visible.
`VisibleOff`: The page is invisible.
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * The details of the event, including the room ID and the user to whom the event occurred.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EventData")
    @Expose
    private EventDataInfo EventData;

    /**
     * Get The Unix timestamp (seconds) when the event occurred. 
     * @return Timestamp The Unix timestamp (seconds) when the event occurred.
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set The Unix timestamp (seconds) when the event occurred.
     * @param Timestamp The Unix timestamp (seconds) when the event occurred.
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get The event type. Valid values: 
`RoomStart`: The class started. `RoomEnd`: The class ended. `MemberJoin`: A user joined. `MemberQuit`: A user left. `RecordFinish`: Recording is finished.
·Camera0n·: The camera is turned on.
`Camera0ff`: The camera is turned off.
`MicOn`: The mic is turned on.
`MicOff`: The mic is turned off.
`ScreenOn`: Screen sharing is enabled.
`ScreenOff`: Screen sharing is disabled.
`VisibleOn`: The page is visible.
`VisibleOff`: The page is invisible. 
     * @return EventType The event type. Valid values: 
`RoomStart`: The class started. `RoomEnd`: The class ended. `MemberJoin`: A user joined. `MemberQuit`: A user left. `RecordFinish`: Recording is finished.
·Camera0n·: The camera is turned on.
`Camera0ff`: The camera is turned off.
`MicOn`: The mic is turned on.
`MicOff`: The mic is turned off.
`ScreenOn`: Screen sharing is enabled.
`ScreenOff`: Screen sharing is disabled.
`VisibleOn`: The page is visible.
`VisibleOff`: The page is invisible.
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set The event type. Valid values: 
`RoomStart`: The class started. `RoomEnd`: The class ended. `MemberJoin`: A user joined. `MemberQuit`: A user left. `RecordFinish`: Recording is finished.
·Camera0n·: The camera is turned on.
`Camera0ff`: The camera is turned off.
`MicOn`: The mic is turned on.
`MicOff`: The mic is turned off.
`ScreenOn`: Screen sharing is enabled.
`ScreenOff`: Screen sharing is disabled.
`VisibleOn`: The page is visible.
`VisibleOff`: The page is invisible.
     * @param EventType The event type. Valid values: 
`RoomStart`: The class started. `RoomEnd`: The class ended. `MemberJoin`: A user joined. `MemberQuit`: A user left. `RecordFinish`: Recording is finished.
·Camera0n·: The camera is turned on.
`Camera0ff`: The camera is turned off.
`MicOn`: The mic is turned on.
`MicOff`: The mic is turned off.
`ScreenOn`: Screen sharing is enabled.
`ScreenOff`: Screen sharing is disabled.
`VisibleOn`: The page is visible.
`VisibleOff`: The page is invisible.
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get The details of the event, including the room ID and the user to whom the event occurred.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EventData The details of the event, including the room ID and the user to whom the event occurred.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public EventDataInfo getEventData() {
        return this.EventData;
    }

    /**
     * Set The details of the event, including the room ID and the user to whom the event occurred.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EventData The details of the event, including the room ID and the user to whom the event occurred.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEventData(EventDataInfo EventData) {
        this.EventData = EventData;
    }

    public EventInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventInfo(EventInfo source) {
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.EventType != null) {
            this.EventType = new String(source.EventType);
        }
        if (source.EventData != null) {
            this.EventData = new EventDataInfo(source.EventData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamObj(map, prefix + "EventData.", this.EventData);

    }
}


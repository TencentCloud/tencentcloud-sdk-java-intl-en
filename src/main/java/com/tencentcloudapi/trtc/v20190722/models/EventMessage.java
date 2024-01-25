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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventMessage extends AbstractModel {

    /**
    * The video stream type. Valid values:
`0`: A non-video event
`2`: The big video
`3`: The small video
`7`: A relayed video
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * The event reporting time in the format of UNIX timestamp (milliseconds), such as `1589891188801`.
    */
    @SerializedName("Time")
    @Expose
    private Long Time;

    /**
    * The event ID. Events are classified into SDK events and WebRTC events. For more information, see https://www.tencentcloud.com/document/product/647/37906?has_map=1
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
    * The first event parameter, such as the video width.
    */
    @SerializedName("ParamOne")
    @Expose
    private Long ParamOne;

    /**
    * The second event parameter, such as the video height.
    */
    @SerializedName("ParamTwo")
    @Expose
    private Long ParamTwo;

    /**
     * Get The video stream type. Valid values:
`0`: A non-video event
`2`: The big video
`3`: The small video
`7`: A relayed video 
     * @return Type The video stream type. Valid values:
`0`: A non-video event
`2`: The big video
`3`: The small video
`7`: A relayed video
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set The video stream type. Valid values:
`0`: A non-video event
`2`: The big video
`3`: The small video
`7`: A relayed video
     * @param Type The video stream type. Valid values:
`0`: A non-video event
`2`: The big video
`3`: The small video
`7`: A relayed video
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get The event reporting time in the format of UNIX timestamp (milliseconds), such as `1589891188801`. 
     * @return Time The event reporting time in the format of UNIX timestamp (milliseconds), such as `1589891188801`.
     */
    public Long getTime() {
        return this.Time;
    }

    /**
     * Set The event reporting time in the format of UNIX timestamp (milliseconds), such as `1589891188801`.
     * @param Time The event reporting time in the format of UNIX timestamp (milliseconds), such as `1589891188801`.
     */
    public void setTime(Long Time) {
        this.Time = Time;
    }

    /**
     * Get The event ID. Events are classified into SDK events and WebRTC events. For more information, see https://www.tencentcloud.com/document/product/647/37906?has_map=1 
     * @return EventId The event ID. Events are classified into SDK events and WebRTC events. For more information, see https://www.tencentcloud.com/document/product/647/37906?has_map=1
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set The event ID. Events are classified into SDK events and WebRTC events. For more information, see https://www.tencentcloud.com/document/product/647/37906?has_map=1
     * @param EventId The event ID. Events are classified into SDK events and WebRTC events. For more information, see https://www.tencentcloud.com/document/product/647/37906?has_map=1
     */
    public void setEventId(Long EventId) {
        this.EventId = EventId;
    }

    /**
     * Get The first event parameter, such as the video width. 
     * @return ParamOne The first event parameter, such as the video width.
     */
    public Long getParamOne() {
        return this.ParamOne;
    }

    /**
     * Set The first event parameter, such as the video width.
     * @param ParamOne The first event parameter, such as the video width.
     */
    public void setParamOne(Long ParamOne) {
        this.ParamOne = ParamOne;
    }

    /**
     * Get The second event parameter, such as the video height. 
     * @return ParamTwo The second event parameter, such as the video height.
     */
    public Long getParamTwo() {
        return this.ParamTwo;
    }

    /**
     * Set The second event parameter, such as the video height.
     * @param ParamTwo The second event parameter, such as the video height.
     */
    public void setParamTwo(Long ParamTwo) {
        this.ParamTwo = ParamTwo;
    }

    public EventMessage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventMessage(EventMessage source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Time != null) {
            this.Time = new Long(source.Time);
        }
        if (source.EventId != null) {
            this.EventId = new Long(source.EventId);
        }
        if (source.ParamOne != null) {
            this.ParamOne = new Long(source.ParamOne);
        }
        if (source.ParamTwo != null) {
            this.ParamTwo = new Long(source.ParamTwo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "ParamOne", this.ParamOne);
        this.setParamSimple(map, prefix + "ParamTwo", this.ParamTwo);

    }
}


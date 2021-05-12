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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventMessage extends AbstractModel{

    /**
    * Video stream type:
0: non-video event;
2: big image;
3: small image;
7: relayed stream image.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Event reporting time in the format of UNIX timestamp, such as 1589891188801ms
    */
    @SerializedName("Time")
    @Expose
    private Long Time;

    /**
    * Event ID. Events divide into SDK events and WebRTC events. For more information, please see Appendix - Event ID Mapping Table at https://intl.cloud.tencent.com/document/product/647/44916?from_cn_redirect=1
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
    * First event parameter, such as video resolution width
    */
    @SerializedName("ParamOne")
    @Expose
    private Long ParamOne;

    /**
    * Second event parameter, such as video resolution height
    */
    @SerializedName("ParamTwo")
    @Expose
    private Long ParamTwo;

    /**
     * Get Video stream type:
0: non-video event;
2: big image;
3: small image;
7: relayed stream image. 
     * @return Type Video stream type:
0: non-video event;
2: big image;
3: small image;
7: relayed stream image.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Video stream type:
0: non-video event;
2: big image;
3: small image;
7: relayed stream image.
     * @param Type Video stream type:
0: non-video event;
2: big image;
3: small image;
7: relayed stream image.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Event reporting time in the format of UNIX timestamp, such as 1589891188801ms 
     * @return Time Event reporting time in the format of UNIX timestamp, such as 1589891188801ms
     */
    public Long getTime() {
        return this.Time;
    }

    /**
     * Set Event reporting time in the format of UNIX timestamp, such as 1589891188801ms
     * @param Time Event reporting time in the format of UNIX timestamp, such as 1589891188801ms
     */
    public void setTime(Long Time) {
        this.Time = Time;
    }

    /**
     * Get Event ID. Events divide into SDK events and WebRTC events. For more information, please see Appendix - Event ID Mapping Table at https://intl.cloud.tencent.com/document/product/647/44916?from_cn_redirect=1 
     * @return EventId Event ID. Events divide into SDK events and WebRTC events. For more information, please see Appendix - Event ID Mapping Table at https://intl.cloud.tencent.com/document/product/647/44916?from_cn_redirect=1
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set Event ID. Events divide into SDK events and WebRTC events. For more information, please see Appendix - Event ID Mapping Table at https://intl.cloud.tencent.com/document/product/647/44916?from_cn_redirect=1
     * @param EventId Event ID. Events divide into SDK events and WebRTC events. For more information, please see Appendix - Event ID Mapping Table at https://intl.cloud.tencent.com/document/product/647/44916?from_cn_redirect=1
     */
    public void setEventId(Long EventId) {
        this.EventId = EventId;
    }

    /**
     * Get First event parameter, such as video resolution width 
     * @return ParamOne First event parameter, such as video resolution width
     */
    public Long getParamOne() {
        return this.ParamOne;
    }

    /**
     * Set First event parameter, such as video resolution width
     * @param ParamOne First event parameter, such as video resolution width
     */
    public void setParamOne(Long ParamOne) {
        this.ParamOne = ParamOne;
    }

    /**
     * Get Second event parameter, such as video resolution height 
     * @return ParamTwo Second event parameter, such as video resolution height
     */
    public Long getParamTwo() {
        return this.ParamTwo;
    }

    /**
     * Set Second event parameter, such as video resolution height
     * @param ParamTwo Second event parameter, such as video resolution height
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


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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AbnormalExperience extends AbstractModel {

    /**
    * The user ID.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * The abnormal experience ID.
    */
    @SerializedName("ExperienceId")
    @Expose
    private Long ExperienceId;

    /**
    * The room ID (string).
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * The possible error events.
    */
    @SerializedName("AbnormalEventList")
    @Expose
    private AbnormalEvent [] AbnormalEventList;

    /**
    * The report time.
    */
    @SerializedName("EventTime")
    @Expose
    private Long EventTime;

    /**
     * Get The user ID. 
     * @return UserId The user ID.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set The user ID.
     * @param UserId The user ID.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get The abnormal experience ID. 
     * @return ExperienceId The abnormal experience ID.
     */
    public Long getExperienceId() {
        return this.ExperienceId;
    }

    /**
     * Set The abnormal experience ID.
     * @param ExperienceId The abnormal experience ID.
     */
    public void setExperienceId(Long ExperienceId) {
        this.ExperienceId = ExperienceId;
    }

    /**
     * Get The room ID (string). 
     * @return RoomId The room ID (string).
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set The room ID (string).
     * @param RoomId The room ID (string).
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get The possible error events. 
     * @return AbnormalEventList The possible error events.
     */
    public AbnormalEvent [] getAbnormalEventList() {
        return this.AbnormalEventList;
    }

    /**
     * Set The possible error events.
     * @param AbnormalEventList The possible error events.
     */
    public void setAbnormalEventList(AbnormalEvent [] AbnormalEventList) {
        this.AbnormalEventList = AbnormalEventList;
    }

    /**
     * Get The report time. 
     * @return EventTime The report time.
     */
    public Long getEventTime() {
        return this.EventTime;
    }

    /**
     * Set The report time.
     * @param EventTime The report time.
     */
    public void setEventTime(Long EventTime) {
        this.EventTime = EventTime;
    }

    public AbnormalExperience() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AbnormalExperience(AbnormalExperience source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.ExperienceId != null) {
            this.ExperienceId = new Long(source.ExperienceId);
        }
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
        if (source.AbnormalEventList != null) {
            this.AbnormalEventList = new AbnormalEvent[source.AbnormalEventList.length];
            for (int i = 0; i < source.AbnormalEventList.length; i++) {
                this.AbnormalEventList[i] = new AbnormalEvent(source.AbnormalEventList[i]);
            }
        }
        if (source.EventTime != null) {
            this.EventTime = new Long(source.EventTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "ExperienceId", this.ExperienceId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamArrayObj(map, prefix + "AbnormalEventList.", this.AbnormalEventList);
        this.setParamSimple(map, prefix + "EventTime", this.EventTime);

    }
}


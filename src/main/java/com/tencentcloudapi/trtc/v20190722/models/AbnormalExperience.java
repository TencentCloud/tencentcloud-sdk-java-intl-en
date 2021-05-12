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

public class AbnormalExperience extends AbstractModel{

    /**
    * User ID
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * Exceptional experience ID
    */
    @SerializedName("ExperienceId")
    @Expose
    private Long ExperienceId;

    /**
    * Room ID in string type
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * Exception event array
    */
    @SerializedName("AbnormalEventList")
    @Expose
    private AbnormalEvent [] AbnormalEventList;

    /**
    * Report time of the exception event
    */
    @SerializedName("EventTime")
    @Expose
    private Long EventTime;

    /**
     * Get User ID 
     * @return UserId User ID
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set User ID
     * @param UserId User ID
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get Exceptional experience ID 
     * @return ExperienceId Exceptional experience ID
     */
    public Long getExperienceId() {
        return this.ExperienceId;
    }

    /**
     * Set Exceptional experience ID
     * @param ExperienceId Exceptional experience ID
     */
    public void setExperienceId(Long ExperienceId) {
        this.ExperienceId = ExperienceId;
    }

    /**
     * Get Room ID in string type 
     * @return RoomId Room ID in string type
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set Room ID in string type
     * @param RoomId Room ID in string type
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get Exception event array 
     * @return AbnormalEventList Exception event array
     */
    public AbnormalEvent [] getAbnormalEventList() {
        return this.AbnormalEventList;
    }

    /**
     * Set Exception event array
     * @param AbnormalEventList Exception event array
     */
    public void setAbnormalEventList(AbnormalEvent [] AbnormalEventList) {
        this.AbnormalEventList = AbnormalEventList;
    }

    /**
     * Get Report time of the exception event 
     * @return EventTime Report time of the exception event
     */
    public Long getEventTime() {
        return this.EventTime;
    }

    /**
     * Set Report time of the exception event
     * @param EventTime Report time of the exception event
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


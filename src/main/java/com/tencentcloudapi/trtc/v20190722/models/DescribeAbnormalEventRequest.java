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

public class DescribeAbnormalEventRequest extends AbstractModel{

    /**
    * User `SDKAppID`, which can be used to query 20 exceptional experience events (in one or more rooms)
    */
    @SerializedName("SdkAppId")
    @Expose
    private String SdkAppId;

    /**
    * Query start time
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * Query end time
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Room ID, which can be used to query up to 20 exceptional experience events in a specific room
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
     * Get User `SDKAppID`, which can be used to query 20 exceptional experience events (in one or more rooms) 
     * @return SdkAppId User `SDKAppID`, which can be used to query 20 exceptional experience events (in one or more rooms)
     */
    public String getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set User `SDKAppID`, which can be used to query 20 exceptional experience events (in one or more rooms)
     * @param SdkAppId User `SDKAppID`, which can be used to query 20 exceptional experience events (in one or more rooms)
     */
    public void setSdkAppId(String SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Query start time 
     * @return StartTime Query start time
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Query start time
     * @param StartTime Query start time
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Query end time 
     * @return EndTime Query end time
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Query end time
     * @param EndTime Query end time
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Room ID, which can be used to query up to 20 exceptional experience events in a specific room 
     * @return RoomId Room ID, which can be used to query up to 20 exceptional experience events in a specific room
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set Room ID, which can be used to query up to 20 exceptional experience events in a specific room
     * @param RoomId Room ID, which can be used to query up to 20 exceptional experience events in a specific room
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    public DescribeAbnormalEventRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAbnormalEventRequest(DescribeAbnormalEventRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new String(source.SdkAppId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);

    }
}


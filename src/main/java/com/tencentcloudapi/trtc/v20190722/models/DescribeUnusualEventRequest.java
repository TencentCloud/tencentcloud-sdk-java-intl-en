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

public class DescribeUnusualEventRequest extends AbstractModel {

    /**
    * User SdkAppId (for example: 1400xxxxxx).
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Query start time, local unix timestamp, in seconds (for example: 1590065777).
Note: support querying data within the last 14 days.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * Query end time, local unix timestamp, in seconds (for example, 1590065877). note: the time interval from StartTime should be no more than 1 hour.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Room number. query up to 20 abnormal experience events in the room.
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
     * Get User SdkAppId (for example: 1400xxxxxx). 
     * @return SdkAppId User SdkAppId (for example: 1400xxxxxx).
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set User SdkAppId (for example: 1400xxxxxx).
     * @param SdkAppId User SdkAppId (for example: 1400xxxxxx).
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Query start time, local unix timestamp, in seconds (for example: 1590065777).
Note: support querying data within the last 14 days. 
     * @return StartTime Query start time, local unix timestamp, in seconds (for example: 1590065777).
Note: support querying data within the last 14 days.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Query start time, local unix timestamp, in seconds (for example: 1590065777).
Note: support querying data within the last 14 days.
     * @param StartTime Query start time, local unix timestamp, in seconds (for example: 1590065777).
Note: support querying data within the last 14 days.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Query end time, local unix timestamp, in seconds (for example, 1590065877). note: the time interval from StartTime should be no more than 1 hour. 
     * @return EndTime Query end time, local unix timestamp, in seconds (for example, 1590065877). note: the time interval from StartTime should be no more than 1 hour.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Query end time, local unix timestamp, in seconds (for example, 1590065877). note: the time interval from StartTime should be no more than 1 hour.
     * @param EndTime Query end time, local unix timestamp, in seconds (for example, 1590065877). note: the time interval from StartTime should be no more than 1 hour.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Room number. query up to 20 abnormal experience events in the room. 
     * @return RoomId Room number. query up to 20 abnormal experience events in the room.
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set Room number. query up to 20 abnormal experience events in the room.
     * @param RoomId Room number. query up to 20 abnormal experience events in the room.
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    public DescribeUnusualEventRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUnusualEventRequest(DescribeUnusualEventRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
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


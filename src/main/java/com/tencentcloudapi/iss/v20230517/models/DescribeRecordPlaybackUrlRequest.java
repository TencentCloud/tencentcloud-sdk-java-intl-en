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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRecordPlaybackUrlRequest extends AbstractModel {

    /**
    * Device channel ID
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * Replay start time in UTC seconds, for example: 1662114146. The longest period between the start and end times is one day and cannot span multiple days.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * Replay end time in UTC seconds, for example: 1662114246. The longest period between the start and end times is one day, and cannot span multiple days.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Whether to obtain the intranet address
    */
    @SerializedName("IsInternal")
    @Expose
    private Boolean IsInternal;

    /**
    * Whether to enable timestamp correction during cloud video playback. This primarily addresses issues such as timestamp reversal or rollback that cause playback failure.
    */
    @SerializedName("CorrectTimestamp")
    @Expose
    private Boolean CorrectTimestamp;

    /**
     * Get Device channel ID 
     * @return ChannelId Device channel ID
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set Device channel ID
     * @param ChannelId Device channel ID
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get Replay start time in UTC seconds, for example: 1662114146. The longest period between the start and end times is one day and cannot span multiple days. 
     * @return StartTime Replay start time in UTC seconds, for example: 1662114146. The longest period between the start and end times is one day and cannot span multiple days.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Replay start time in UTC seconds, for example: 1662114146. The longest period between the start and end times is one day and cannot span multiple days.
     * @param StartTime Replay start time in UTC seconds, for example: 1662114146. The longest period between the start and end times is one day and cannot span multiple days.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Replay end time in UTC seconds, for example: 1662114246. The longest period between the start and end times is one day, and cannot span multiple days. 
     * @return EndTime Replay end time in UTC seconds, for example: 1662114246. The longest period between the start and end times is one day, and cannot span multiple days.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Replay end time in UTC seconds, for example: 1662114246. The longest period between the start and end times is one day, and cannot span multiple days.
     * @param EndTime Replay end time in UTC seconds, for example: 1662114246. The longest period between the start and end times is one day, and cannot span multiple days.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Whether to obtain the intranet address 
     * @return IsInternal Whether to obtain the intranet address
     */
    public Boolean getIsInternal() {
        return this.IsInternal;
    }

    /**
     * Set Whether to obtain the intranet address
     * @param IsInternal Whether to obtain the intranet address
     */
    public void setIsInternal(Boolean IsInternal) {
        this.IsInternal = IsInternal;
    }

    /**
     * Get Whether to enable timestamp correction during cloud video playback. This primarily addresses issues such as timestamp reversal or rollback that cause playback failure. 
     * @return CorrectTimestamp Whether to enable timestamp correction during cloud video playback. This primarily addresses issues such as timestamp reversal or rollback that cause playback failure.
     */
    public Boolean getCorrectTimestamp() {
        return this.CorrectTimestamp;
    }

    /**
     * Set Whether to enable timestamp correction during cloud video playback. This primarily addresses issues such as timestamp reversal or rollback that cause playback failure.
     * @param CorrectTimestamp Whether to enable timestamp correction during cloud video playback. This primarily addresses issues such as timestamp reversal or rollback that cause playback failure.
     */
    public void setCorrectTimestamp(Boolean CorrectTimestamp) {
        this.CorrectTimestamp = CorrectTimestamp;
    }

    public DescribeRecordPlaybackUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRecordPlaybackUrlRequest(DescribeRecordPlaybackUrlRequest source) {
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.IsInternal != null) {
            this.IsInternal = new Boolean(source.IsInternal);
        }
        if (source.CorrectTimestamp != null) {
            this.CorrectTimestamp = new Boolean(source.CorrectTimestamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "IsInternal", this.IsInternal);
        this.setParamSimple(map, prefix + "CorrectTimestamp", this.CorrectTimestamp);

    }
}


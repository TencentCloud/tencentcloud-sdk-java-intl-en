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

public class DescribeRecordFileRequest extends AbstractModel {

    /**
    * Device ID to which the channel belongs
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * Channel ID
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * Search start time in UTC seconds, for example: 1662114146. The longest period between the start and end times is one day and cannot span multiple days.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * Search end time, UTC seconds. Example: 1662114246. The longest period between the start and end times is one day, and cannot span multiple days.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Whether to carry the playback url for each time period
    */
    @SerializedName("WithUrl")
    @Expose
    private Boolean WithUrl;

    /**
     * Get Device ID to which the channel belongs 
     * @return DeviceId Device ID to which the channel belongs
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set Device ID to which the channel belongs
     * @param DeviceId Device ID to which the channel belongs
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get Channel ID 
     * @return ChannelId Channel ID
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set Channel ID
     * @param ChannelId Channel ID
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get Search start time in UTC seconds, for example: 1662114146. The longest period between the start and end times is one day and cannot span multiple days. 
     * @return StartTime Search start time in UTC seconds, for example: 1662114146. The longest period between the start and end times is one day and cannot span multiple days.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Search start time in UTC seconds, for example: 1662114146. The longest period between the start and end times is one day and cannot span multiple days.
     * @param StartTime Search start time in UTC seconds, for example: 1662114146. The longest period between the start and end times is one day and cannot span multiple days.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Search end time, UTC seconds. Example: 1662114246. The longest period between the start and end times is one day, and cannot span multiple days. 
     * @return EndTime Search end time, UTC seconds. Example: 1662114246. The longest period between the start and end times is one day, and cannot span multiple days.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Search end time, UTC seconds. Example: 1662114246. The longest period between the start and end times is one day, and cannot span multiple days.
     * @param EndTime Search end time, UTC seconds. Example: 1662114246. The longest period between the start and end times is one day, and cannot span multiple days.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Whether to carry the playback url for each time period 
     * @return WithUrl Whether to carry the playback url for each time period
     */
    public Boolean getWithUrl() {
        return this.WithUrl;
    }

    /**
     * Set Whether to carry the playback url for each time period
     * @param WithUrl Whether to carry the playback url for each time period
     */
    public void setWithUrl(Boolean WithUrl) {
        this.WithUrl = WithUrl;
    }

    public DescribeRecordFileRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRecordFileRequest(DescribeRecordFileRequest source) {
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.WithUrl != null) {
            this.WithUrl = new Boolean(source.WithUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "WithUrl", this.WithUrl);

    }
}


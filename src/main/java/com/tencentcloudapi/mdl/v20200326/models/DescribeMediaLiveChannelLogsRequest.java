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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMediaLiveChannelLogsRequest extends AbstractModel{

    /**
    * Channel ID.
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * Log start time, which is one hour ago by default. Maximum value: the last 7 days.
UTC time, such as `2020-01-01T12:00:00Z`.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Log end time, which is one hour after `StartTime` by default.
UTC time, such as `2020-01-01T12:00:00Z`.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get Channel ID. 
     * @return ChannelId Channel ID.
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set Channel ID.
     * @param ChannelId Channel ID.
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get Log start time, which is one hour ago by default. Maximum value: the last 7 days.
UTC time, such as `2020-01-01T12:00:00Z`. 
     * @return StartTime Log start time, which is one hour ago by default. Maximum value: the last 7 days.
UTC time, such as `2020-01-01T12:00:00Z`.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Log start time, which is one hour ago by default. Maximum value: the last 7 days.
UTC time, such as `2020-01-01T12:00:00Z`.
     * @param StartTime Log start time, which is one hour ago by default. Maximum value: the last 7 days.
UTC time, such as `2020-01-01T12:00:00Z`.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Log end time, which is one hour after `StartTime` by default.
UTC time, such as `2020-01-01T12:00:00Z`. 
     * @return EndTime Log end time, which is one hour after `StartTime` by default.
UTC time, such as `2020-01-01T12:00:00Z`.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Log end time, which is one hour after `StartTime` by default.
UTC time, such as `2020-01-01T12:00:00Z`.
     * @param EndTime Log end time, which is one hour after `StartTime` by default.
UTC time, such as `2020-01-01T12:00:00Z`.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}


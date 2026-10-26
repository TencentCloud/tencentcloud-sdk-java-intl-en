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

public class ControlRecordTimelineRequest extends AbstractModel {

    /**
    * Channel ID (obtain from the channel query API DescribeDeviceChannel)
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * Start time.
    */
    @SerializedName("Start")
    @Expose
    private Long Start;

    /**
    * End time.
    */
    @SerializedName("End")
    @Expose
    private Long End;

    /**
     * Get Channel ID (obtain from the channel query API DescribeDeviceChannel) 
     * @return ChannelId Channel ID (obtain from the channel query API DescribeDeviceChannel)
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set Channel ID (obtain from the channel query API DescribeDeviceChannel)
     * @param ChannelId Channel ID (obtain from the channel query API DescribeDeviceChannel)
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get Start time. 
     * @return Start Start time.
     */
    public Long getStart() {
        return this.Start;
    }

    /**
     * Set Start time.
     * @param Start Start time.
     */
    public void setStart(Long Start) {
        this.Start = Start;
    }

    /**
     * Get End time. 
     * @return End End time.
     */
    public Long getEnd() {
        return this.End;
    }

    /**
     * Set End time.
     * @param End End time.
     */
    public void setEnd(Long End) {
        this.End = End;
    }

    public ControlRecordTimelineRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ControlRecordTimelineRequest(ControlRecordTimelineRequest source) {
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.Start != null) {
            this.Start = new Long(source.Start);
        }
        if (source.End != null) {
            this.End = new Long(source.End);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "Start", this.Start);
        this.setParamSimple(map, prefix + "End", this.End);

    }
}


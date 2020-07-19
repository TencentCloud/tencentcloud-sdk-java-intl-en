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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeHttpStatusInfoListRequest extends AbstractModel{

    /**
    * Start time (Beijing time),
In the format of `yyyy-mm-dd HH:MM:SS`.
`StartTime` cannot be more than 3 months ago.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time (Beijing time),
In the format of `yyyy-mm-dd HH:MM:SS`.
Note: `EndTime` and `StartTime` only support querying data for the last day.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Playback domain name list.
    */
    @SerializedName("PlayDomains")
    @Expose
    private String [] PlayDomains;

    /**
     * Get Start time (Beijing time),
In the format of `yyyy-mm-dd HH:MM:SS`.
`StartTime` cannot be more than 3 months ago. 
     * @return StartTime Start time (Beijing time),
In the format of `yyyy-mm-dd HH:MM:SS`.
`StartTime` cannot be more than 3 months ago.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time (Beijing time),
In the format of `yyyy-mm-dd HH:MM:SS`.
`StartTime` cannot be more than 3 months ago.
     * @param StartTime Start time (Beijing time),
In the format of `yyyy-mm-dd HH:MM:SS`.
`StartTime` cannot be more than 3 months ago.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time (Beijing time),
In the format of `yyyy-mm-dd HH:MM:SS`.
Note: `EndTime` and `StartTime` only support querying data for the last day. 
     * @return EndTime End time (Beijing time),
In the format of `yyyy-mm-dd HH:MM:SS`.
Note: `EndTime` and `StartTime` only support querying data for the last day.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time (Beijing time),
In the format of `yyyy-mm-dd HH:MM:SS`.
Note: `EndTime` and `StartTime` only support querying data for the last day.
     * @param EndTime End time (Beijing time),
In the format of `yyyy-mm-dd HH:MM:SS`.
Note: `EndTime` and `StartTime` only support querying data for the last day.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Playback domain name list. 
     * @return PlayDomains Playback domain name list.
     */
    public String [] getPlayDomains() {
        return this.PlayDomains;
    }

    /**
     * Set Playback domain name list.
     * @param PlayDomains Playback domain name list.
     */
    public void setPlayDomains(String [] PlayDomains) {
        this.PlayDomains = PlayDomains;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "PlayDomains.", this.PlayDomains);

    }
}


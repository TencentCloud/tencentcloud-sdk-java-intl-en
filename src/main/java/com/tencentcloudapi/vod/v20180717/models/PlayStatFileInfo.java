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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PlayStatFileInfo extends AbstractModel{

    /**
    * Date of playback statistics in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?lang=en&pg=).
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * URL of a playback statistics file, including the following contents:
<li> date: playback date</li>
<li> file_id: video file ID</li>
<li> ip_count: number of client IPs after deduplication</li>
<li> flux: playback traffic in bytes</li>
<li> play_times: total playback times</li>
<li> pc_play_times: playback times on PC clients</li>
<li> mobile_play_times: playback times on mobile clients</li>
<li> iphone_play_times: playback times on iPhone</li>
<li> android_play_times: playback times on Android</li>
<li> host_name: domain name</li>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get Date of playback statistics in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?lang=en&pg=). 
     * @return Date Date of playback statistics in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?lang=en&pg=).
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set Date of playback statistics in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?lang=en&pg=).
     * @param Date Date of playback statistics in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?lang=en&pg=).
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get URL of a playback statistics file, including the following contents:
<li> date: playback date</li>
<li> file_id: video file ID</li>
<li> ip_count: number of client IPs after deduplication</li>
<li> flux: playback traffic in bytes</li>
<li> play_times: total playback times</li>
<li> pc_play_times: playback times on PC clients</li>
<li> mobile_play_times: playback times on mobile clients</li>
<li> iphone_play_times: playback times on iPhone</li>
<li> android_play_times: playback times on Android</li>
<li> host_name: domain name</li> 
     * @return Url URL of a playback statistics file, including the following contents:
<li> date: playback date</li>
<li> file_id: video file ID</li>
<li> ip_count: number of client IPs after deduplication</li>
<li> flux: playback traffic in bytes</li>
<li> play_times: total playback times</li>
<li> pc_play_times: playback times on PC clients</li>
<li> mobile_play_times: playback times on mobile clients</li>
<li> iphone_play_times: playback times on iPhone</li>
<li> android_play_times: playback times on Android</li>
<li> host_name: domain name</li>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set URL of a playback statistics file, including the following contents:
<li> date: playback date</li>
<li> file_id: video file ID</li>
<li> ip_count: number of client IPs after deduplication</li>
<li> flux: playback traffic in bytes</li>
<li> play_times: total playback times</li>
<li> pc_play_times: playback times on PC clients</li>
<li> mobile_play_times: playback times on mobile clients</li>
<li> iphone_play_times: playback times on iPhone</li>
<li> android_play_times: playback times on Android</li>
<li> host_name: domain name</li>
     * @param Url URL of a playback statistics file, including the following contents:
<li> date: playback date</li>
<li> file_id: video file ID</li>
<li> ip_count: number of client IPs after deduplication</li>
<li> flux: playback traffic in bytes</li>
<li> play_times: total playback times</li>
<li> pc_play_times: playback times on PC clients</li>
<li> mobile_play_times: playback times on mobile clients</li>
<li> iphone_play_times: playback times on iPhone</li>
<li> android_play_times: playback times on Android</li>
<li> host_name: domain name</li>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    public PlayStatFileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PlayStatFileInfo(PlayStatFileInfo source) {
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}


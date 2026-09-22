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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PlayStatFileInfo extends AbstractModel {

    /**
    * Date of the playback statistics in ISO date format (https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * URL address of the playback statistics file. The playback statistics file contains:
<li> date: Playback date.</li>
<li> file_id: Video file ID.</li>
<li> ip_count: Number of client IPs after deduplication.</li>
<li> flux: playback traffic volume, unit: byte.</li>
<li> play_times: total number of plays.</li>
<li> pc_play_times: Number of plays on PC.</li>
<li> mobile_play_times: Mobile playback count.</li>
<li> iphone_play_times: Number of plays on iPhone.</li>
<li> android_play_times: Number of plays on Android.</li>
<li> host_name	Domain name.</li>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get Date of the playback statistics in ISO date format (https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return Date Date of the playback statistics in ISO date format (https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set Date of the playback statistics in ISO date format (https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param Date Date of the playback statistics in ISO date format (https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get URL address of the playback statistics file. The playback statistics file contains:
<li> date: Playback date.</li>
<li> file_id: Video file ID.</li>
<li> ip_count: Number of client IPs after deduplication.</li>
<li> flux: playback traffic volume, unit: byte.</li>
<li> play_times: total number of plays.</li>
<li> pc_play_times: Number of plays on PC.</li>
<li> mobile_play_times: Mobile playback count.</li>
<li> iphone_play_times: Number of plays on iPhone.</li>
<li> android_play_times: Number of plays on Android.</li>
<li> host_name	Domain name.</li> 
     * @return Url URL address of the playback statistics file. The playback statistics file contains:
<li> date: Playback date.</li>
<li> file_id: Video file ID.</li>
<li> ip_count: Number of client IPs after deduplication.</li>
<li> flux: playback traffic volume, unit: byte.</li>
<li> play_times: total number of plays.</li>
<li> pc_play_times: Number of plays on PC.</li>
<li> mobile_play_times: Mobile playback count.</li>
<li> iphone_play_times: Number of plays on iPhone.</li>
<li> android_play_times: Number of plays on Android.</li>
<li> host_name	Domain name.</li>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set URL address of the playback statistics file. The playback statistics file contains:
<li> date: Playback date.</li>
<li> file_id: Video file ID.</li>
<li> ip_count: Number of client IPs after deduplication.</li>
<li> flux: playback traffic volume, unit: byte.</li>
<li> play_times: total number of plays.</li>
<li> pc_play_times: Number of plays on PC.</li>
<li> mobile_play_times: Mobile playback count.</li>
<li> iphone_play_times: Number of plays on iPhone.</li>
<li> android_play_times: Number of plays on Android.</li>
<li> host_name	Domain name.</li>
     * @param Url URL address of the playback statistics file. The playback statistics file contains:
<li> date: Playback date.</li>
<li> file_id: Video file ID.</li>
<li> ip_count: Number of client IPs after deduplication.</li>
<li> flux: playback traffic volume, unit: byte.</li>
<li> play_times: total number of plays.</li>
<li> pc_play_times: Number of plays on PC.</li>
<li> mobile_play_times: Mobile playback count.</li>
<li> iphone_play_times: Number of plays on iPhone.</li>
<li> android_play_times: Number of plays on Android.</li>
<li> host_name	Domain name.</li>
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


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

public class PlayStatInfo extends AbstractModel {

    /**
    * Start time of the time interval where the data resides, using [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). For example, when the time granularity is day, 2018-12-01T00:00:00+08:00 means the interval from December 1, 2018 (inclusive) to December 2, 2018 (exclusive).
<li>For hour-level data, 2019-08-22T00:00:00+08:00 refers to the stats from 0:00 to 1:00 on August 22, 2019.</li>
<li>For daily-level data, 2019-08-22T00:00:00+08:00 refers to the stats of 2019-08-22.</li>
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * Media file ID.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * Number of plays.
    */
    @SerializedName("PlayTimes")
    @Expose
    private Long PlayTimes;

    /**
    * Playback traffic volume. Measurement unit: byte.
    */
    @SerializedName("Traffic")
    @Expose
    private Long Traffic;

    /**
     * Get Start time of the time interval where the data resides, using [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). For example, when the time granularity is day, 2018-12-01T00:00:00+08:00 means the interval from December 1, 2018 (inclusive) to December 2, 2018 (exclusive).
<li>For hour-level data, 2019-08-22T00:00:00+08:00 refers to the stats from 0:00 to 1:00 on August 22, 2019.</li>
<li>For daily-level data, 2019-08-22T00:00:00+08:00 refers to the stats of 2019-08-22.</li> 
     * @return Time Start time of the time interval where the data resides, using [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). For example, when the time granularity is day, 2018-12-01T00:00:00+08:00 means the interval from December 1, 2018 (inclusive) to December 2, 2018 (exclusive).
<li>For hour-level data, 2019-08-22T00:00:00+08:00 refers to the stats from 0:00 to 1:00 on August 22, 2019.</li>
<li>For daily-level data, 2019-08-22T00:00:00+08:00 refers to the stats of 2019-08-22.</li>
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set Start time of the time interval where the data resides, using [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). For example, when the time granularity is day, 2018-12-01T00:00:00+08:00 means the interval from December 1, 2018 (inclusive) to December 2, 2018 (exclusive).
<li>For hour-level data, 2019-08-22T00:00:00+08:00 refers to the stats from 0:00 to 1:00 on August 22, 2019.</li>
<li>For daily-level data, 2019-08-22T00:00:00+08:00 refers to the stats of 2019-08-22.</li>
     * @param Time Start time of the time interval where the data resides, using [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). For example, when the time granularity is day, 2018-12-01T00:00:00+08:00 means the interval from December 1, 2018 (inclusive) to December 2, 2018 (exclusive).
<li>For hour-level data, 2019-08-22T00:00:00+08:00 refers to the stats from 0:00 to 1:00 on August 22, 2019.</li>
<li>For daily-level data, 2019-08-22T00:00:00+08:00 refers to the stats of 2019-08-22.</li>
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get Media file ID. 
     * @return FileId Media file ID.
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set Media file ID.
     * @param FileId Media file ID.
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get Number of plays. 
     * @return PlayTimes Number of plays.
     */
    public Long getPlayTimes() {
        return this.PlayTimes;
    }

    /**
     * Set Number of plays.
     * @param PlayTimes Number of plays.
     */
    public void setPlayTimes(Long PlayTimes) {
        this.PlayTimes = PlayTimes;
    }

    /**
     * Get Playback traffic volume. Measurement unit: byte. 
     * @return Traffic Playback traffic volume. Measurement unit: byte.
     */
    public Long getTraffic() {
        return this.Traffic;
    }

    /**
     * Set Playback traffic volume. Measurement unit: byte.
     * @param Traffic Playback traffic volume. Measurement unit: byte.
     */
    public void setTraffic(Long Traffic) {
        this.Traffic = Traffic;
    }

    public PlayStatInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PlayStatInfo(PlayStatInfo source) {
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.PlayTimes != null) {
            this.PlayTimes = new Long(source.PlayTimes);
        }
        if (source.Traffic != null) {
            this.Traffic = new Long(source.Traffic);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "PlayTimes", this.PlayTimes);
        this.setParamSimple(map, prefix + "Traffic", this.Traffic);

    }
}


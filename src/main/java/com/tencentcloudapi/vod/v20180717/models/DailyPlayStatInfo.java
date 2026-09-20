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

public class DailyPlayStatInfo extends AbstractModel {

    /**
    * <p>Date of playing media file in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * <p>Media file ID.</p>
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * <p>Number of plays.</p>
    */
    @SerializedName("PlayTimes")
    @Expose
    private Long PlayTimes;

    /**
    * <p>Playback traffic volume, unit: byte.</p>
    */
    @SerializedName("Traffic")
    @Expose
    private Long Traffic;

    /**
     * Get <p>Date of playing media file in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p> 
     * @return Date <p>Date of playing media file in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set <p>Date of playing media file in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
     * @param Date <p>Date of playing media file in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get <p>Media file ID.</p> 
     * @return FileId <p>Media file ID.</p>
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set <p>Media file ID.</p>
     * @param FileId <p>Media file ID.</p>
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get <p>Number of plays.</p> 
     * @return PlayTimes <p>Number of plays.</p>
     */
    public Long getPlayTimes() {
        return this.PlayTimes;
    }

    /**
     * Set <p>Number of plays.</p>
     * @param PlayTimes <p>Number of plays.</p>
     */
    public void setPlayTimes(Long PlayTimes) {
        this.PlayTimes = PlayTimes;
    }

    /**
     * Get <p>Playback traffic volume, unit: byte.</p> 
     * @return Traffic <p>Playback traffic volume, unit: byte.</p>
     */
    public Long getTraffic() {
        return this.Traffic;
    }

    /**
     * Set <p>Playback traffic volume, unit: byte.</p>
     * @param Traffic <p>Playback traffic volume, unit: byte.</p>
     */
    public void setTraffic(Long Traffic) {
        this.Traffic = Traffic;
    }

    public DailyPlayStatInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DailyPlayStatInfo(DailyPlayStatInfo source) {
        if (source.Date != null) {
            this.Date = new String(source.Date);
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
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "PlayTimes", this.PlayTimes);
        this.setParamSimple(map, prefix + "Traffic", this.Traffic);

    }
}


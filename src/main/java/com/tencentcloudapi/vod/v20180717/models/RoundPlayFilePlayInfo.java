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

public class RoundPlayFilePlayInfo extends AbstractModel {

    /**
    * Playlist program id, assigned by the system.
    */
    @SerializedName("ItemId")
    @Expose
    private String ItemId;

    /**
    * The media file id.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * The playback start time, in [iso 8601 date format](https://www.tencentcloud.com/document/product/266/11732?has_map=2#iso-date-format).
    */
    @SerializedName("StartPlayTime")
    @Expose
    private String StartPlayTime;

    /**
    * Playback duration, in seconds.
Note: this field may return null, indicating that no valid value was found.
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * Playback progress, in seconds.
Note: this field may return null, indicating that no valid value was found.
    */
    @SerializedName("Progress")
    @Expose
    private Float Progress;

    /**
     * Get Playlist program id, assigned by the system. 
     * @return ItemId Playlist program id, assigned by the system.
     */
    public String getItemId() {
        return this.ItemId;
    }

    /**
     * Set Playlist program id, assigned by the system.
     * @param ItemId Playlist program id, assigned by the system.
     */
    public void setItemId(String ItemId) {
        this.ItemId = ItemId;
    }

    /**
     * Get The media file id. 
     * @return FileId The media file id.
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set The media file id.
     * @param FileId The media file id.
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get The playback start time, in [iso 8601 date format](https://www.tencentcloud.com/document/product/266/11732?has_map=2#iso-date-format). 
     * @return StartPlayTime The playback start time, in [iso 8601 date format](https://www.tencentcloud.com/document/product/266/11732?has_map=2#iso-date-format).
     */
    public String getStartPlayTime() {
        return this.StartPlayTime;
    }

    /**
     * Set The playback start time, in [iso 8601 date format](https://www.tencentcloud.com/document/product/266/11732?has_map=2#iso-date-format).
     * @param StartPlayTime The playback start time, in [iso 8601 date format](https://www.tencentcloud.com/document/product/266/11732?has_map=2#iso-date-format).
     */
    public void setStartPlayTime(String StartPlayTime) {
        this.StartPlayTime = StartPlayTime;
    }

    /**
     * Get Playback duration, in seconds.
Note: this field may return null, indicating that no valid value was found. 
     * @return Duration Playback duration, in seconds.
Note: this field may return null, indicating that no valid value was found.
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set Playback duration, in seconds.
Note: this field may return null, indicating that no valid value was found.
     * @param Duration Playback duration, in seconds.
Note: this field may return null, indicating that no valid value was found.
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get Playback progress, in seconds.
Note: this field may return null, indicating that no valid value was found. 
     * @return Progress Playback progress, in seconds.
Note: this field may return null, indicating that no valid value was found.
     */
    public Float getProgress() {
        return this.Progress;
    }

    /**
     * Set Playback progress, in seconds.
Note: this field may return null, indicating that no valid value was found.
     * @param Progress Playback progress, in seconds.
Note: this field may return null, indicating that no valid value was found.
     */
    public void setProgress(Float Progress) {
        this.Progress = Progress;
    }

    public RoundPlayFilePlayInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RoundPlayFilePlayInfo(RoundPlayFilePlayInfo source) {
        if (source.ItemId != null) {
            this.ItemId = new String(source.ItemId);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.StartPlayTime != null) {
            this.StartPlayTime = new String(source.StartPlayTime);
        }
        if (source.Duration != null) {
            this.Duration = new Float(source.Duration);
        }
        if (source.Progress != null) {
            this.Progress = new Float(source.Progress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ItemId", this.ItemId);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "StartPlayTime", this.StartPlayTime);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Progress", this.Progress);

    }
}


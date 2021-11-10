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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SdkAppIdTrtcMcuTranscodeTimeUsage extends AbstractModel{

    /**
    * Time point for the statistics. e.g., `2020-09-07` or `2020-09-07 00:05:05`
    */
    @SerializedName("TimeKey")
    @Expose
    private String TimeKey;

    /**
    * Audio duration (s)
    */
    @SerializedName("AudioTime")
    @Expose
    private Long AudioTime;

    /**
    * SD video duration (s)
    */
    @SerializedName("VideoTimeSd")
    @Expose
    private Long VideoTimeSd;

    /**
    * HD video duration (s)
    */
    @SerializedName("VideoTimeHd")
    @Expose
    private Long VideoTimeHd;

    /**
    * FHD video duration (s)
    */
    @SerializedName("VideoTimeFhd")
    @Expose
    private Long VideoTimeFhd;

    /**
     * Get Time point for the statistics. e.g., `2020-09-07` or `2020-09-07 00:05:05` 
     * @return TimeKey Time point for the statistics. e.g., `2020-09-07` or `2020-09-07 00:05:05`
     */
    public String getTimeKey() {
        return this.TimeKey;
    }

    /**
     * Set Time point for the statistics. e.g., `2020-09-07` or `2020-09-07 00:05:05`
     * @param TimeKey Time point for the statistics. e.g., `2020-09-07` or `2020-09-07 00:05:05`
     */
    public void setTimeKey(String TimeKey) {
        this.TimeKey = TimeKey;
    }

    /**
     * Get Audio duration (s) 
     * @return AudioTime Audio duration (s)
     */
    public Long getAudioTime() {
        return this.AudioTime;
    }

    /**
     * Set Audio duration (s)
     * @param AudioTime Audio duration (s)
     */
    public void setAudioTime(Long AudioTime) {
        this.AudioTime = AudioTime;
    }

    /**
     * Get SD video duration (s) 
     * @return VideoTimeSd SD video duration (s)
     */
    public Long getVideoTimeSd() {
        return this.VideoTimeSd;
    }

    /**
     * Set SD video duration (s)
     * @param VideoTimeSd SD video duration (s)
     */
    public void setVideoTimeSd(Long VideoTimeSd) {
        this.VideoTimeSd = VideoTimeSd;
    }

    /**
     * Get HD video duration (s) 
     * @return VideoTimeHd HD video duration (s)
     */
    public Long getVideoTimeHd() {
        return this.VideoTimeHd;
    }

    /**
     * Set HD video duration (s)
     * @param VideoTimeHd HD video duration (s)
     */
    public void setVideoTimeHd(Long VideoTimeHd) {
        this.VideoTimeHd = VideoTimeHd;
    }

    /**
     * Get FHD video duration (s) 
     * @return VideoTimeFhd FHD video duration (s)
     */
    public Long getVideoTimeFhd() {
        return this.VideoTimeFhd;
    }

    /**
     * Set FHD video duration (s)
     * @param VideoTimeFhd FHD video duration (s)
     */
    public void setVideoTimeFhd(Long VideoTimeFhd) {
        this.VideoTimeFhd = VideoTimeFhd;
    }

    public SdkAppIdTrtcMcuTranscodeTimeUsage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SdkAppIdTrtcMcuTranscodeTimeUsage(SdkAppIdTrtcMcuTranscodeTimeUsage source) {
        if (source.TimeKey != null) {
            this.TimeKey = new String(source.TimeKey);
        }
        if (source.AudioTime != null) {
            this.AudioTime = new Long(source.AudioTime);
        }
        if (source.VideoTimeSd != null) {
            this.VideoTimeSd = new Long(source.VideoTimeSd);
        }
        if (source.VideoTimeHd != null) {
            this.VideoTimeHd = new Long(source.VideoTimeHd);
        }
        if (source.VideoTimeFhd != null) {
            this.VideoTimeFhd = new Long(source.VideoTimeFhd);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeKey", this.TimeKey);
        this.setParamSimple(map, prefix + "AudioTime", this.AudioTime);
        this.setParamSimple(map, prefix + "VideoTimeSd", this.VideoTimeSd);
        this.setParamSimple(map, prefix + "VideoTimeHd", this.VideoTimeHd);
        this.setParamSimple(map, prefix + "VideoTimeFhd", this.VideoTimeFhd);

    }
}


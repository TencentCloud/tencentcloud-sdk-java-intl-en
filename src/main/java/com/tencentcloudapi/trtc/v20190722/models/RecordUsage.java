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

public class RecordUsage extends AbstractModel{

    /**
    * Time point for the statistics, e.g., `2020-09-07` or `2020-09-07 00:05:05`
    */
    @SerializedName("TimeKey")
    @Expose
    private String TimeKey;

    /**
    * SD video duration (s)
    */
    @SerializedName("Class1VideoTime")
    @Expose
    private Long Class1VideoTime;

    /**
    * HD video duration (s)
    */
    @SerializedName("Class2VideoTime")
    @Expose
    private Long Class2VideoTime;

    /**
    * FHD video duration (s)
    */
    @SerializedName("Class3VideoTime")
    @Expose
    private Long Class3VideoTime;

    /**
    * Audio duration (s)
    */
    @SerializedName("AudioTime")
    @Expose
    private Long AudioTime;

    /**
     * Get Time point for the statistics, e.g., `2020-09-07` or `2020-09-07 00:05:05` 
     * @return TimeKey Time point for the statistics, e.g., `2020-09-07` or `2020-09-07 00:05:05`
     */
    public String getTimeKey() {
        return this.TimeKey;
    }

    /**
     * Set Time point for the statistics, e.g., `2020-09-07` or `2020-09-07 00:05:05`
     * @param TimeKey Time point for the statistics, e.g., `2020-09-07` or `2020-09-07 00:05:05`
     */
    public void setTimeKey(String TimeKey) {
        this.TimeKey = TimeKey;
    }

    /**
     * Get SD video duration (s) 
     * @return Class1VideoTime SD video duration (s)
     */
    public Long getClass1VideoTime() {
        return this.Class1VideoTime;
    }

    /**
     * Set SD video duration (s)
     * @param Class1VideoTime SD video duration (s)
     */
    public void setClass1VideoTime(Long Class1VideoTime) {
        this.Class1VideoTime = Class1VideoTime;
    }

    /**
     * Get HD video duration (s) 
     * @return Class2VideoTime HD video duration (s)
     */
    public Long getClass2VideoTime() {
        return this.Class2VideoTime;
    }

    /**
     * Set HD video duration (s)
     * @param Class2VideoTime HD video duration (s)
     */
    public void setClass2VideoTime(Long Class2VideoTime) {
        this.Class2VideoTime = Class2VideoTime;
    }

    /**
     * Get FHD video duration (s) 
     * @return Class3VideoTime FHD video duration (s)
     */
    public Long getClass3VideoTime() {
        return this.Class3VideoTime;
    }

    /**
     * Set FHD video duration (s)
     * @param Class3VideoTime FHD video duration (s)
     */
    public void setClass3VideoTime(Long Class3VideoTime) {
        this.Class3VideoTime = Class3VideoTime;
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

    public RecordUsage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecordUsage(RecordUsage source) {
        if (source.TimeKey != null) {
            this.TimeKey = new String(source.TimeKey);
        }
        if (source.Class1VideoTime != null) {
            this.Class1VideoTime = new Long(source.Class1VideoTime);
        }
        if (source.Class2VideoTime != null) {
            this.Class2VideoTime = new Long(source.Class2VideoTime);
        }
        if (source.Class3VideoTime != null) {
            this.Class3VideoTime = new Long(source.Class3VideoTime);
        }
        if (source.AudioTime != null) {
            this.AudioTime = new Long(source.AudioTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeKey", this.TimeKey);
        this.setParamSimple(map, prefix + "Class1VideoTime", this.Class1VideoTime);
        this.setParamSimple(map, prefix + "Class2VideoTime", this.Class2VideoTime);
        this.setParamSimple(map, prefix + "Class3VideoTime", this.Class3VideoTime);
        this.setParamSimple(map, prefix + "AudioTime", this.AudioTime);

    }
}


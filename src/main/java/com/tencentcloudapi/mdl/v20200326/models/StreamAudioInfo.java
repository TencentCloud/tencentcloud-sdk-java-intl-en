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

public class StreamAudioInfo extends AbstractModel{

    /**
    * Audio `Pid`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * Audio codec.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * Audio frame rate.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
    * Audio bitrate.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Rate")
    @Expose
    private Long Rate;

    /**
    * Audio sample rate.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SampleRate")
    @Expose
    private Long SampleRate;

    /**
     * Get Audio `Pid`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Pid Audio `Pid`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set Audio `Pid`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Pid Audio `Pid`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get Audio codec.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Codec Audio codec.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set Audio codec.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Codec Audio codec.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get Audio frame rate.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Fps Audio frame rate.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set Audio frame rate.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Fps Audio frame rate.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    /**
     * Get Audio bitrate.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Rate Audio bitrate.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getRate() {
        return this.Rate;
    }

    /**
     * Set Audio bitrate.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Rate Audio bitrate.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRate(Long Rate) {
        this.Rate = Rate;
    }

    /**
     * Get Audio sample rate.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SampleRate Audio sample rate.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set Audio sample rate.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SampleRate Audio sample rate.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSampleRate(Long SampleRate) {
        this.SampleRate = SampleRate;
    }

    public StreamAudioInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StreamAudioInfo(StreamAudioInfo source) {
        if (source.Pid != null) {
            this.Pid = new Long(source.Pid);
        }
        if (source.Codec != null) {
            this.Codec = new String(source.Codec);
        }
        if (source.Fps != null) {
            this.Fps = new Long(source.Fps);
        }
        if (source.Rate != null) {
            this.Rate = new Long(source.Rate);
        }
        if (source.SampleRate != null) {
            this.SampleRate = new Long(source.SampleRate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "Codec", this.Codec);
        this.setParamSimple(map, prefix + "Fps", this.Fps);
        this.setParamSimple(map, prefix + "Rate", this.Rate);
        this.setParamSimple(map, prefix + "SampleRate", this.SampleRate);

    }
}


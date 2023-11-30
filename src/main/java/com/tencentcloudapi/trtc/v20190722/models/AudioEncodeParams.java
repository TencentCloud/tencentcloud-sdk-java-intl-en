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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AudioEncodeParams extends AbstractModel {

    /**
    * Audio Sample rate, Value range [48000, 44100], unit is Hz.
    */
    @SerializedName("SampleRate")
    @Expose
    private Long SampleRate;

    /**
    * Audio Channel number, Value range [1,2], 1 means Audio is Mono-channel, 2 means Audio is Dual-channel.
    */
    @SerializedName("Channel")
    @Expose
    private Long Channel;

    /**
    * Audio Bitrate, Value range [8,500], unit is kbps.
    */
    @SerializedName("BitRate")
    @Expose
    private Long BitRate;

    /**
     * Get Audio Sample rate, Value range [48000, 44100], unit is Hz. 
     * @return SampleRate Audio Sample rate, Value range [48000, 44100], unit is Hz.
     */
    public Long getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set Audio Sample rate, Value range [48000, 44100], unit is Hz.
     * @param SampleRate Audio Sample rate, Value range [48000, 44100], unit is Hz.
     */
    public void setSampleRate(Long SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * Get Audio Channel number, Value range [1,2], 1 means Audio is Mono-channel, 2 means Audio is Dual-channel. 
     * @return Channel Audio Channel number, Value range [1,2], 1 means Audio is Mono-channel, 2 means Audio is Dual-channel.
     */
    public Long getChannel() {
        return this.Channel;
    }

    /**
     * Set Audio Channel number, Value range [1,2], 1 means Audio is Mono-channel, 2 means Audio is Dual-channel.
     * @param Channel Audio Channel number, Value range [1,2], 1 means Audio is Mono-channel, 2 means Audio is Dual-channel.
     */
    public void setChannel(Long Channel) {
        this.Channel = Channel;
    }

    /**
     * Get Audio Bitrate, Value range [8,500], unit is kbps. 
     * @return BitRate Audio Bitrate, Value range [8,500], unit is kbps.
     */
    public Long getBitRate() {
        return this.BitRate;
    }

    /**
     * Set Audio Bitrate, Value range [8,500], unit is kbps.
     * @param BitRate Audio Bitrate, Value range [8,500], unit is kbps.
     */
    public void setBitRate(Long BitRate) {
        this.BitRate = BitRate;
    }

    public AudioEncodeParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AudioEncodeParams(AudioEncodeParams source) {
        if (source.SampleRate != null) {
            this.SampleRate = new Long(source.SampleRate);
        }
        if (source.Channel != null) {
            this.Channel = new Long(source.Channel);
        }
        if (source.BitRate != null) {
            this.BitRate = new Long(source.BitRate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SampleRate", this.SampleRate);
        this.setParamSimple(map, prefix + "Channel", this.Channel);
        this.setParamSimple(map, prefix + "BitRate", this.BitRate);

    }
}


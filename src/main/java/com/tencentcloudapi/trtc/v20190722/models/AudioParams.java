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

public class AudioParams extends AbstractModel {

    /**
    * The audio sample rate.
1: 48000 Hz (default)
2: 44100 Hz
3: 16000 Hz
    */
    @SerializedName("SampleRate")
    @Expose
    private Long SampleRate;

    /**
    * The number of sound channels.
1: Mono-channel
2: Dual-channel (default)
    */
    @SerializedName("Channel")
    @Expose
    private Long Channel;

    /**
    * The audio bitrate (bps). Value range: [32000, 128000]. Default: 64000.
    */
    @SerializedName("BitRate")
    @Expose
    private Long BitRate;

    /**
     * Get The audio sample rate.
1: 48000 Hz (default)
2: 44100 Hz
3: 16000 Hz 
     * @return SampleRate The audio sample rate.
1: 48000 Hz (default)
2: 44100 Hz
3: 16000 Hz
     */
    public Long getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set The audio sample rate.
1: 48000 Hz (default)
2: 44100 Hz
3: 16000 Hz
     * @param SampleRate The audio sample rate.
1: 48000 Hz (default)
2: 44100 Hz
3: 16000 Hz
     */
    public void setSampleRate(Long SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * Get The number of sound channels.
1: Mono-channel
2: Dual-channel (default) 
     * @return Channel The number of sound channels.
1: Mono-channel
2: Dual-channel (default)
     */
    public Long getChannel() {
        return this.Channel;
    }

    /**
     * Set The number of sound channels.
1: Mono-channel
2: Dual-channel (default)
     * @param Channel The number of sound channels.
1: Mono-channel
2: Dual-channel (default)
     */
    public void setChannel(Long Channel) {
        this.Channel = Channel;
    }

    /**
     * Get The audio bitrate (bps). Value range: [32000, 128000]. Default: 64000. 
     * @return BitRate The audio bitrate (bps). Value range: [32000, 128000]. Default: 64000.
     */
    public Long getBitRate() {
        return this.BitRate;
    }

    /**
     * Set The audio bitrate (bps). Value range: [32000, 128000]. Default: 64000.
     * @param BitRate The audio bitrate (bps). Value range: [32000, 128000]. Default: 64000.
     */
    public void setBitRate(Long BitRate) {
        this.BitRate = BitRate;
    }

    public AudioParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AudioParams(AudioParams source) {
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


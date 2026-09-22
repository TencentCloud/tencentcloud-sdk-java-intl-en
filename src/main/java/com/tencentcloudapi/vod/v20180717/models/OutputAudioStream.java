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

public class OutputAudioStream extends AbstractModel {

    /**
    * Encoding format for audio streams. Optional values:
<li>libfdk_aac: suitable for mp4 files.</li>
Default value: libfdk_aac.
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * Sampling rate of the audio stream. Available values:
<li>16000</li>
<li>32000</li>
<li>44100</li>
<li>48000</li>
Unit: Hz.
Default value: 16000.
    */
    @SerializedName("SampleRate")
    @Expose
    private Long SampleRate;

    /**
    * Number of audio channels. Available values:
<li>1: mono.</li>
<li>2: stereo</li>
Default value: 2.
    */
    @SerializedName("AudioChannel")
    @Expose
    private Long AudioChannel;

    /**
    * Bitrate of the audio stream. Value range: 0 and [26, 256]. Unit: kbps.
When the value is 0, the audio bitrate is set automatically.
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
     * Get Encoding format for audio streams. Optional values:
<li>libfdk_aac: suitable for mp4 files.</li>
Default value: libfdk_aac. 
     * @return Codec Encoding format for audio streams. Optional values:
<li>libfdk_aac: suitable for mp4 files.</li>
Default value: libfdk_aac.
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set Encoding format for audio streams. Optional values:
<li>libfdk_aac: suitable for mp4 files.</li>
Default value: libfdk_aac.
     * @param Codec Encoding format for audio streams. Optional values:
<li>libfdk_aac: suitable for mp4 files.</li>
Default value: libfdk_aac.
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get Sampling rate of the audio stream. Available values:
<li>16000</li>
<li>32000</li>
<li>44100</li>
<li>48000</li>
Unit: Hz.
Default value: 16000. 
     * @return SampleRate Sampling rate of the audio stream. Available values:
<li>16000</li>
<li>32000</li>
<li>44100</li>
<li>48000</li>
Unit: Hz.
Default value: 16000.
     */
    public Long getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set Sampling rate of the audio stream. Available values:
<li>16000</li>
<li>32000</li>
<li>44100</li>
<li>48000</li>
Unit: Hz.
Default value: 16000.
     * @param SampleRate Sampling rate of the audio stream. Available values:
<li>16000</li>
<li>32000</li>
<li>44100</li>
<li>48000</li>
Unit: Hz.
Default value: 16000.
     */
    public void setSampleRate(Long SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * Get Number of audio channels. Available values:
<li>1: mono.</li>
<li>2: stereo</li>
Default value: 2. 
     * @return AudioChannel Number of audio channels. Available values:
<li>1: mono.</li>
<li>2: stereo</li>
Default value: 2.
     */
    public Long getAudioChannel() {
        return this.AudioChannel;
    }

    /**
     * Set Number of audio channels. Available values:
<li>1: mono.</li>
<li>2: stereo</li>
Default value: 2.
     * @param AudioChannel Number of audio channels. Available values:
<li>1: mono.</li>
<li>2: stereo</li>
Default value: 2.
     */
    public void setAudioChannel(Long AudioChannel) {
        this.AudioChannel = AudioChannel;
    }

    /**
     * Get Bitrate of the audio stream. Value range: 0 and [26, 256]. Unit: kbps.
When the value is 0, the audio bitrate is set automatically. 
     * @return Bitrate Bitrate of the audio stream. Value range: 0 and [26, 256]. Unit: kbps.
When the value is 0, the audio bitrate is set automatically.
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set Bitrate of the audio stream. Value range: 0 and [26, 256]. Unit: kbps.
When the value is 0, the audio bitrate is set automatically.
     * @param Bitrate Bitrate of the audio stream. Value range: 0 and [26, 256]. Unit: kbps.
When the value is 0, the audio bitrate is set automatically.
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    public OutputAudioStream() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OutputAudioStream(OutputAudioStream source) {
        if (source.Codec != null) {
            this.Codec = new String(source.Codec);
        }
        if (source.SampleRate != null) {
            this.SampleRate = new Long(source.SampleRate);
        }
        if (source.AudioChannel != null) {
            this.AudioChannel = new Long(source.AudioChannel);
        }
        if (source.Bitrate != null) {
            this.Bitrate = new Long(source.Bitrate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Codec", this.Codec);
        this.setParamSimple(map, prefix + "SampleRate", this.SampleRate);
        this.setParamSimple(map, prefix + "AudioChannel", this.AudioChannel);
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);

    }
}


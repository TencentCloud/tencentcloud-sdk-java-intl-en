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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComposeAudioStream extends AbstractModel {

    /**
    * The codec of the audio stream. Valid values:
<li>`AAC`: AAC (default), which is used for the MP4 container. </li>
<li>`MP3`: MP3 codec, which is used for the MP3 container. </li>
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * The sample rate (Hz) of the audio stream.
<li>16000 (default)</li>
<li>32000</li>
<li>44100</li>
<li>48000</li>
    */
    @SerializedName("SampleRate")
    @Expose
    private Long SampleRate;

    /**
    * The number of sound channels. Valid values:
u200c<li>`1`: Mono. </li>
<li>`2`: Dual (default). </li>
    */
    @SerializedName("AudioChannel")
    @Expose
    private Long AudioChannel;

    /**
     * Get The codec of the audio stream. Valid values:
<li>`AAC`: AAC (default), which is used for the MP4 container. </li>
<li>`MP3`: MP3 codec, which is used for the MP3 container. </li> 
     * @return Codec The codec of the audio stream. Valid values:
<li>`AAC`: AAC (default), which is used for the MP4 container. </li>
<li>`MP3`: MP3 codec, which is used for the MP3 container. </li>
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set The codec of the audio stream. Valid values:
<li>`AAC`: AAC (default), which is used for the MP4 container. </li>
<li>`MP3`: MP3 codec, which is used for the MP3 container. </li>
     * @param Codec The codec of the audio stream. Valid values:
<li>`AAC`: AAC (default), which is used for the MP4 container. </li>
<li>`MP3`: MP3 codec, which is used for the MP3 container. </li>
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get The sample rate (Hz) of the audio stream.
<li>16000 (default)</li>
<li>32000</li>
<li>44100</li>
<li>48000</li> 
     * @return SampleRate The sample rate (Hz) of the audio stream.
<li>16000 (default)</li>
<li>32000</li>
<li>44100</li>
<li>48000</li>
     */
    public Long getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set The sample rate (Hz) of the audio stream.
<li>16000 (default)</li>
<li>32000</li>
<li>44100</li>
<li>48000</li>
     * @param SampleRate The sample rate (Hz) of the audio stream.
<li>16000 (default)</li>
<li>32000</li>
<li>44100</li>
<li>48000</li>
     */
    public void setSampleRate(Long SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * Get The number of sound channels. Valid values:
u200c<li>`1`: Mono. </li>
<li>`2`: Dual (default). </li> 
     * @return AudioChannel The number of sound channels. Valid values:
u200c<li>`1`: Mono. </li>
<li>`2`: Dual (default). </li>
     */
    public Long getAudioChannel() {
        return this.AudioChannel;
    }

    /**
     * Set The number of sound channels. Valid values:
u200c<li>`1`: Mono. </li>
<li>`2`: Dual (default). </li>
     * @param AudioChannel The number of sound channels. Valid values:
u200c<li>`1`: Mono. </li>
<li>`2`: Dual (default). </li>
     */
    public void setAudioChannel(Long AudioChannel) {
        this.AudioChannel = AudioChannel;
    }

    public ComposeAudioStream() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComposeAudioStream(ComposeAudioStream source) {
        if (source.Codec != null) {
            this.Codec = new String(source.Codec);
        }
        if (source.SampleRate != null) {
            this.SampleRate = new Long(source.SampleRate);
        }
        if (source.AudioChannel != null) {
            this.AudioChannel = new Long(source.AudioChannel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Codec", this.Codec);
        this.setParamSimple(map, prefix + "SampleRate", this.SampleRate);
        this.setParamSimple(map, prefix + "AudioChannel", this.AudioChannel);

    }
}


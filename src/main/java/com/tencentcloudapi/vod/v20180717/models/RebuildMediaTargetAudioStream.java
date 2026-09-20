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

public class RebuildMediaTargetAudioStream extends AbstractModel {

    /**
    * Audio stream encoding format.
When the outer parameter Container is mp3, optional values:
<li>libmp3lame.</li>
When the outer parameter Container is ogg or flac, optional values:
<li>flac.</li>
When the outer parameter Container is m4a, valid values are:
<li>libfdk_aac;</li>
<li>libmp3lame;</li>
<li>ac3.</li>
When the outer parameter Container is mp4 or flv, optional values:
<li>libfdk_aac: more suitable for mp4;</li>
<li>libmp3lame: more suitable for flv;</li>
<li>mp2.</li>
When the outer parameter Container is hls, valid values are:
<li>libfdk_aac.</li>
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * Bitrate of the audio stream. Value range: 0 and [26, 256]. Unit: kbps.
When the value is 0, it means VOD automatically sets the bitrate.
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * Sampling rate of the audio stream. Available values:
<li>32000</li>
<li>44100</li>
<li>48000</li>

Unit: Hz.
    */
    @SerializedName("SampleRate")
    @Expose
    private Long SampleRate;

    /**
    * Audio channel mode. Valid values:
<li>1: single channel.</li>
<li>2: dual channel.</li>
<li>6: Stereo</li>

When the media encapsulation format is audio (flac, ogg, mp3, and m4a), the number of channels cannot be set to stereo.
Default value: 2.
    */
    @SerializedName("AudioChannel")
    @Expose
    private Long AudioChannel;

    /**
     * Get Audio stream encoding format.
When the outer parameter Container is mp3, optional values:
<li>libmp3lame.</li>
When the outer parameter Container is ogg or flac, optional values:
<li>flac.</li>
When the outer parameter Container is m4a, valid values are:
<li>libfdk_aac;</li>
<li>libmp3lame;</li>
<li>ac3.</li>
When the outer parameter Container is mp4 or flv, optional values:
<li>libfdk_aac: more suitable for mp4;</li>
<li>libmp3lame: more suitable for flv;</li>
<li>mp2.</li>
When the outer parameter Container is hls, valid values are:
<li>libfdk_aac.</li> 
     * @return Codec Audio stream encoding format.
When the outer parameter Container is mp3, optional values:
<li>libmp3lame.</li>
When the outer parameter Container is ogg or flac, optional values:
<li>flac.</li>
When the outer parameter Container is m4a, valid values are:
<li>libfdk_aac;</li>
<li>libmp3lame;</li>
<li>ac3.</li>
When the outer parameter Container is mp4 or flv, optional values:
<li>libfdk_aac: more suitable for mp4;</li>
<li>libmp3lame: more suitable for flv;</li>
<li>mp2.</li>
When the outer parameter Container is hls, valid values are:
<li>libfdk_aac.</li>
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set Audio stream encoding format.
When the outer parameter Container is mp3, optional values:
<li>libmp3lame.</li>
When the outer parameter Container is ogg or flac, optional values:
<li>flac.</li>
When the outer parameter Container is m4a, valid values are:
<li>libfdk_aac;</li>
<li>libmp3lame;</li>
<li>ac3.</li>
When the outer parameter Container is mp4 or flv, optional values:
<li>libfdk_aac: more suitable for mp4;</li>
<li>libmp3lame: more suitable for flv;</li>
<li>mp2.</li>
When the outer parameter Container is hls, valid values are:
<li>libfdk_aac.</li>
     * @param Codec Audio stream encoding format.
When the outer parameter Container is mp3, optional values:
<li>libmp3lame.</li>
When the outer parameter Container is ogg or flac, optional values:
<li>flac.</li>
When the outer parameter Container is m4a, valid values are:
<li>libfdk_aac;</li>
<li>libmp3lame;</li>
<li>ac3.</li>
When the outer parameter Container is mp4 or flv, optional values:
<li>libfdk_aac: more suitable for mp4;</li>
<li>libmp3lame: more suitable for flv;</li>
<li>mp2.</li>
When the outer parameter Container is hls, valid values are:
<li>libfdk_aac.</li>
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get Bitrate of the audio stream. Value range: 0 and [26, 256]. Unit: kbps.
When the value is 0, it means VOD automatically sets the bitrate. 
     * @return Bitrate Bitrate of the audio stream. Value range: 0 and [26, 256]. Unit: kbps.
When the value is 0, it means VOD automatically sets the bitrate.
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set Bitrate of the audio stream. Value range: 0 and [26, 256]. Unit: kbps.
When the value is 0, it means VOD automatically sets the bitrate.
     * @param Bitrate Bitrate of the audio stream. Value range: 0 and [26, 256]. Unit: kbps.
When the value is 0, it means VOD automatically sets the bitrate.
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get Sampling rate of the audio stream. Available values:
<li>32000</li>
<li>44100</li>
<li>48000</li>

Unit: Hz. 
     * @return SampleRate Sampling rate of the audio stream. Available values:
<li>32000</li>
<li>44100</li>
<li>48000</li>

Unit: Hz.
     */
    public Long getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set Sampling rate of the audio stream. Available values:
<li>32000</li>
<li>44100</li>
<li>48000</li>

Unit: Hz.
     * @param SampleRate Sampling rate of the audio stream. Available values:
<li>32000</li>
<li>44100</li>
<li>48000</li>

Unit: Hz.
     */
    public void setSampleRate(Long SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * Get Audio channel mode. Valid values:
<li>1: single channel.</li>
<li>2: dual channel.</li>
<li>6: Stereo</li>

When the media encapsulation format is audio (flac, ogg, mp3, and m4a), the number of channels cannot be set to stereo.
Default value: 2. 
     * @return AudioChannel Audio channel mode. Valid values:
<li>1: single channel.</li>
<li>2: dual channel.</li>
<li>6: Stereo</li>

When the media encapsulation format is audio (flac, ogg, mp3, and m4a), the number of channels cannot be set to stereo.
Default value: 2.
     */
    public Long getAudioChannel() {
        return this.AudioChannel;
    }

    /**
     * Set Audio channel mode. Valid values:
<li>1: single channel.</li>
<li>2: dual channel.</li>
<li>6: Stereo</li>

When the media encapsulation format is audio (flac, ogg, mp3, and m4a), the number of channels cannot be set to stereo.
Default value: 2.
     * @param AudioChannel Audio channel mode. Valid values:
<li>1: single channel.</li>
<li>2: dual channel.</li>
<li>6: Stereo</li>

When the media encapsulation format is audio (flac, ogg, mp3, and m4a), the number of channels cannot be set to stereo.
Default value: 2.
     */
    public void setAudioChannel(Long AudioChannel) {
        this.AudioChannel = AudioChannel;
    }

    public RebuildMediaTargetAudioStream() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RebuildMediaTargetAudioStream(RebuildMediaTargetAudioStream source) {
        if (source.Codec != null) {
            this.Codec = new String(source.Codec);
        }
        if (source.Bitrate != null) {
            this.Bitrate = new Long(source.Bitrate);
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
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);
        this.setParamSimple(map, prefix + "SampleRate", this.SampleRate);
        this.setParamSimple(map, prefix + "AudioChannel", this.AudioChannel);

    }
}


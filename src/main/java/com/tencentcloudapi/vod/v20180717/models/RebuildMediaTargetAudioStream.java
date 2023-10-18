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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RebuildMediaTargetAudioStream extends AbstractModel {

    /**
    * The audio codec.
If `Container` is `mp3`, the valid value is:
<li>`libmp3lame`</li>
If `Container` is `ogg` or `flac`, the valid value is:
<li>`flac`</li>
If `Container` is `m4a`, the valid values are:
<li>`libfdk_aac`</li>
<li>`libmp3lame`</li>
<li>`ac3`</li>
If `Container` is `mp4` or `flv`, the valid values are:
<li>`libfdk_aac` (Recommended for MP4)</li>
<li>`libmp3lame` (Recommended for FLV)</li>
<li>`mp2`</li>
If `Container` is `hls`, the valid value is:
<li>`libfdk_aac`</li>
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * The audio bitrate, in Kbps. Value range: 0 and 26-256.
If the value is `0`, the original audio bitrate will be used.
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * The audio sample rate. Valid values:
<li>`32000`</li>
<li>`44100`</li>
<li>`48000`</li>

Unit: Hz.
    */
    @SerializedName("SampleRate")
    @Expose
    private Long SampleRate;

    /**
    * The audio channels. Valid values:
<li>`1`: Mono-channel</li>
<li>`2`: Dual-channel</li>
<li>`6`: Stereo</li>

You cannot set this parameter to `6` if the container format is an audio format (FLAC, OGG, MP3, M4A).
Default value: `2`.
    */
    @SerializedName("AudioChannel")
    @Expose
    private Long AudioChannel;

    /**
     * Get The audio codec.
If `Container` is `mp3`, the valid value is:
<li>`libmp3lame`</li>
If `Container` is `ogg` or `flac`, the valid value is:
<li>`flac`</li>
If `Container` is `m4a`, the valid values are:
<li>`libfdk_aac`</li>
<li>`libmp3lame`</li>
<li>`ac3`</li>
If `Container` is `mp4` or `flv`, the valid values are:
<li>`libfdk_aac` (Recommended for MP4)</li>
<li>`libmp3lame` (Recommended for FLV)</li>
<li>`mp2`</li>
If `Container` is `hls`, the valid value is:
<li>`libfdk_aac`</li> 
     * @return Codec The audio codec.
If `Container` is `mp3`, the valid value is:
<li>`libmp3lame`</li>
If `Container` is `ogg` or `flac`, the valid value is:
<li>`flac`</li>
If `Container` is `m4a`, the valid values are:
<li>`libfdk_aac`</li>
<li>`libmp3lame`</li>
<li>`ac3`</li>
If `Container` is `mp4` or `flv`, the valid values are:
<li>`libfdk_aac` (Recommended for MP4)</li>
<li>`libmp3lame` (Recommended for FLV)</li>
<li>`mp2`</li>
If `Container` is `hls`, the valid value is:
<li>`libfdk_aac`</li>
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set The audio codec.
If `Container` is `mp3`, the valid value is:
<li>`libmp3lame`</li>
If `Container` is `ogg` or `flac`, the valid value is:
<li>`flac`</li>
If `Container` is `m4a`, the valid values are:
<li>`libfdk_aac`</li>
<li>`libmp3lame`</li>
<li>`ac3`</li>
If `Container` is `mp4` or `flv`, the valid values are:
<li>`libfdk_aac` (Recommended for MP4)</li>
<li>`libmp3lame` (Recommended for FLV)</li>
<li>`mp2`</li>
If `Container` is `hls`, the valid value is:
<li>`libfdk_aac`</li>
     * @param Codec The audio codec.
If `Container` is `mp3`, the valid value is:
<li>`libmp3lame`</li>
If `Container` is `ogg` or `flac`, the valid value is:
<li>`flac`</li>
If `Container` is `m4a`, the valid values are:
<li>`libfdk_aac`</li>
<li>`libmp3lame`</li>
<li>`ac3`</li>
If `Container` is `mp4` or `flv`, the valid values are:
<li>`libfdk_aac` (Recommended for MP4)</li>
<li>`libmp3lame` (Recommended for FLV)</li>
<li>`mp2`</li>
If `Container` is `hls`, the valid value is:
<li>`libfdk_aac`</li>
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get The audio bitrate, in Kbps. Value range: 0 and 26-256.
If the value is `0`, the original audio bitrate will be used. 
     * @return Bitrate The audio bitrate, in Kbps. Value range: 0 and 26-256.
If the value is `0`, the original audio bitrate will be used.
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set The audio bitrate, in Kbps. Value range: 0 and 26-256.
If the value is `0`, the original audio bitrate will be used.
     * @param Bitrate The audio bitrate, in Kbps. Value range: 0 and 26-256.
If the value is `0`, the original audio bitrate will be used.
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get The audio sample rate. Valid values:
<li>`32000`</li>
<li>`44100`</li>
<li>`48000`</li>

Unit: Hz. 
     * @return SampleRate The audio sample rate. Valid values:
<li>`32000`</li>
<li>`44100`</li>
<li>`48000`</li>

Unit: Hz.
     */
    public Long getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set The audio sample rate. Valid values:
<li>`32000`</li>
<li>`44100`</li>
<li>`48000`</li>

Unit: Hz.
     * @param SampleRate The audio sample rate. Valid values:
<li>`32000`</li>
<li>`44100`</li>
<li>`48000`</li>

Unit: Hz.
     */
    public void setSampleRate(Long SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * Get The audio channels. Valid values:
<li>`1`: Mono-channel</li>
<li>`2`: Dual-channel</li>
<li>`6`: Stereo</li>

You cannot set this parameter to `6` if the container format is an audio format (FLAC, OGG, MP3, M4A).
Default value: `2`. 
     * @return AudioChannel The audio channels. Valid values:
<li>`1`: Mono-channel</li>
<li>`2`: Dual-channel</li>
<li>`6`: Stereo</li>

You cannot set this parameter to `6` if the container format is an audio format (FLAC, OGG, MP3, M4A).
Default value: `2`.
     */
    public Long getAudioChannel() {
        return this.AudioChannel;
    }

    /**
     * Set The audio channels. Valid values:
<li>`1`: Mono-channel</li>
<li>`2`: Dual-channel</li>
<li>`6`: Stereo</li>

You cannot set this parameter to `6` if the container format is an audio format (FLAC, OGG, MP3, M4A).
Default value: `2`.
     * @param AudioChannel The audio channels. Valid values:
<li>`1`: Mono-channel</li>
<li>`2`: Dual-channel</li>
<li>`6`: Stereo</li>

You cannot set this parameter to `6` if the container format is an audio format (FLAC, OGG, MP3, M4A).
Default value: `2`.
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


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

public class AudioTemplateInfo extends AbstractModel {

    /**
    * Audio stream encoding format.
When audio transcoding is not needed, the value is:
<li>copy.</li>
When the outer parameter Container is mp3, the value is:
<li>mp3.</li>
When the outer parameter Container is ogg or flac, the value is:
<li>flac.</li>
When the outer parameter Container is m4a, valid values are:
<li>aac;</li>
<li>ac3.</li>
When the outer parameter Container is mp4 or flv, valid values are:
<li>aac: more suitable for mp4;</li>
<li>mp3: more suitable for flv;</li>
<li>mp2.</li>
When the outer parameter Container is hls, valid values are:
<li>aac;</li>
<li>mp3.</li>
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * Audio stream bitrate in Kbps. Value range: 0 and [26, 256].
If the value is 0, the bitrate of the audio stream will be the same as that of the original audio.
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * Audio stream sample rate. Valid values:
<li>32,000</li>
<li>44,100</li>
<li>48,000</li>
In Hz.
    */
    @SerializedName("SampleRate")
    @Expose
    private Long SampleRate;

    /**
    * Audio channel mode. Valid values:
<li>1: single channel.</li>
<li>2: dual channel.</li>
<li>6: 5.1 surround sound.</li>
When the media encapsulation format is audio (flac, ogg, mp3, and m4a), the number of channels cannot be set to 5.1 surround sound.
Default value: 2.
    */
    @SerializedName("AudioChannel")
    @Expose
    private Long AudioChannel;

    /**
    * Merge audio track information.
This field only takes effec in adaptive bitrate transcoding.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TrackChannelInfo")
    @Expose
    private AudioTrackChannelInfo TrackChannelInfo;

    /**
     * Get Audio stream encoding format.
When audio transcoding is not needed, the value is:
<li>copy.</li>
When the outer parameter Container is mp3, the value is:
<li>mp3.</li>
When the outer parameter Container is ogg or flac, the value is:
<li>flac.</li>
When the outer parameter Container is m4a, valid values are:
<li>aac;</li>
<li>ac3.</li>
When the outer parameter Container is mp4 or flv, valid values are:
<li>aac: more suitable for mp4;</li>
<li>mp3: more suitable for flv;</li>
<li>mp2.</li>
When the outer parameter Container is hls, valid values are:
<li>aac;</li>
<li>mp3.</li> 
     * @return Codec Audio stream encoding format.
When audio transcoding is not needed, the value is:
<li>copy.</li>
When the outer parameter Container is mp3, the value is:
<li>mp3.</li>
When the outer parameter Container is ogg or flac, the value is:
<li>flac.</li>
When the outer parameter Container is m4a, valid values are:
<li>aac;</li>
<li>ac3.</li>
When the outer parameter Container is mp4 or flv, valid values are:
<li>aac: more suitable for mp4;</li>
<li>mp3: more suitable for flv;</li>
<li>mp2.</li>
When the outer parameter Container is hls, valid values are:
<li>aac;</li>
<li>mp3.</li>
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set Audio stream encoding format.
When audio transcoding is not needed, the value is:
<li>copy.</li>
When the outer parameter Container is mp3, the value is:
<li>mp3.</li>
When the outer parameter Container is ogg or flac, the value is:
<li>flac.</li>
When the outer parameter Container is m4a, valid values are:
<li>aac;</li>
<li>ac3.</li>
When the outer parameter Container is mp4 or flv, valid values are:
<li>aac: more suitable for mp4;</li>
<li>mp3: more suitable for flv;</li>
<li>mp2.</li>
When the outer parameter Container is hls, valid values are:
<li>aac;</li>
<li>mp3.</li>
     * @param Codec Audio stream encoding format.
When audio transcoding is not needed, the value is:
<li>copy.</li>
When the outer parameter Container is mp3, the value is:
<li>mp3.</li>
When the outer parameter Container is ogg or flac, the value is:
<li>flac.</li>
When the outer parameter Container is m4a, valid values are:
<li>aac;</li>
<li>ac3.</li>
When the outer parameter Container is mp4 or flv, valid values are:
<li>aac: more suitable for mp4;</li>
<li>mp3: more suitable for flv;</li>
<li>mp2.</li>
When the outer parameter Container is hls, valid values are:
<li>aac;</li>
<li>mp3.</li>
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get Audio stream bitrate in Kbps. Value range: 0 and [26, 256].
If the value is 0, the bitrate of the audio stream will be the same as that of the original audio. 
     * @return Bitrate Audio stream bitrate in Kbps. Value range: 0 and [26, 256].
If the value is 0, the bitrate of the audio stream will be the same as that of the original audio.
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set Audio stream bitrate in Kbps. Value range: 0 and [26, 256].
If the value is 0, the bitrate of the audio stream will be the same as that of the original audio.
     * @param Bitrate Audio stream bitrate in Kbps. Value range: 0 and [26, 256].
If the value is 0, the bitrate of the audio stream will be the same as that of the original audio.
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get Audio stream sample rate. Valid values:
<li>32,000</li>
<li>44,100</li>
<li>48,000</li>
In Hz. 
     * @return SampleRate Audio stream sample rate. Valid values:
<li>32,000</li>
<li>44,100</li>
<li>48,000</li>
In Hz.
     */
    public Long getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set Audio stream sample rate. Valid values:
<li>32,000</li>
<li>44,100</li>
<li>48,000</li>
In Hz.
     * @param SampleRate Audio stream sample rate. Valid values:
<li>32,000</li>
<li>44,100</li>
<li>48,000</li>
In Hz.
     */
    public void setSampleRate(Long SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * Get Audio channel mode. Valid values:
<li>1: single channel.</li>
<li>2: dual channel.</li>
<li>6: 5.1 surround sound.</li>
When the media encapsulation format is audio (flac, ogg, mp3, and m4a), the number of channels cannot be set to 5.1 surround sound.
Default value: 2. 
     * @return AudioChannel Audio channel mode. Valid values:
<li>1: single channel.</li>
<li>2: dual channel.</li>
<li>6: 5.1 surround sound.</li>
When the media encapsulation format is audio (flac, ogg, mp3, and m4a), the number of channels cannot be set to 5.1 surround sound.
Default value: 2.
     */
    public Long getAudioChannel() {
        return this.AudioChannel;
    }

    /**
     * Set Audio channel mode. Valid values:
<li>1: single channel.</li>
<li>2: dual channel.</li>
<li>6: 5.1 surround sound.</li>
When the media encapsulation format is audio (flac, ogg, mp3, and m4a), the number of channels cannot be set to 5.1 surround sound.
Default value: 2.
     * @param AudioChannel Audio channel mode. Valid values:
<li>1: single channel.</li>
<li>2: dual channel.</li>
<li>6: 5.1 surround sound.</li>
When the media encapsulation format is audio (flac, ogg, mp3, and m4a), the number of channels cannot be set to 5.1 surround sound.
Default value: 2.
     */
    public void setAudioChannel(Long AudioChannel) {
        this.AudioChannel = AudioChannel;
    }

    /**
     * Get Merge audio track information.
This field only takes effec in adaptive bitrate transcoding.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TrackChannelInfo Merge audio track information.
This field only takes effec in adaptive bitrate transcoding.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public AudioTrackChannelInfo getTrackChannelInfo() {
        return this.TrackChannelInfo;
    }

    /**
     * Set Merge audio track information.
This field only takes effec in adaptive bitrate transcoding.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TrackChannelInfo Merge audio track information.
This field only takes effec in adaptive bitrate transcoding.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTrackChannelInfo(AudioTrackChannelInfo TrackChannelInfo) {
        this.TrackChannelInfo = TrackChannelInfo;
    }

    public AudioTemplateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AudioTemplateInfo(AudioTemplateInfo source) {
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
        if (source.TrackChannelInfo != null) {
            this.TrackChannelInfo = new AudioTrackChannelInfo(source.TrackChannelInfo);
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
        this.setParamObj(map, prefix + "TrackChannelInfo.", this.TrackChannelInfo);

    }
}


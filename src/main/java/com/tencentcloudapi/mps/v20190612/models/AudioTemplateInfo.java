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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AudioTemplateInfo extends AbstractModel {

    /**
    * Specifies the encoding format of the audio stream.
When audio transcoding is not needed, the optional values are:.
<li>copy.</li>
When the outer parameter Container is mp3, the valid values are:.
<li>mp3.</li>
When the outer parameter Container is ogg or flac, the valid values are:.
<li>flac.</li>
When the outer parameter Container is m4a, valid values are:.
<li>aac;</li>
<li>ac3.</li>
When the outer parameter Container is mp4 or flv, valid values are:.
<li>aac: more suitable for mp4;</li>.
<li>mp3: more suitable for flv;</li>.
<li>mp2.</li>
When the outer parameter Container is hls, valid values are:.
<li>aac;</li>
<li>mp3;</li>
<li>eac3: used when merging adaptive transcoding audio tracks.</li>.
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * The bitrate of the audio stream. value ranges from 0 to 26 and in the range of [26, 256]. measurement unit: kbps.
If the value is 0, the audio bitrate will be the same as that of the original audio.
Specifies that when using the TrackChannelInfo parameter for adaptive transcoding audio track merging, the valid values are:.
Cannot be set to 0.
2). when Codec is aac, valid values: [26, 256].
3). when Codec is ac3, valid values: [26, 640].
4) when Codec is eac3, value range: [26, 6144]. remark: when SampleRate is 44100HZ, maximum value: 5644. when SampleRate is 48000HZ, maximum value: 6144.


    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * Audio stream sampling rate. Different sampling rate options are provided for different encoding standards. For details, see [Audio/Video Transcoding Template](https://intl.cloud.tencent.com/document/product/862/77166?from_cn_redirect=1#f3b039f1-d817-4a96-b4e4-90132d31cd53).
Unit: Hz.
Note: Make sure that the sampling rate of the source audio stream is among the above options. Otherwise, transcoding may fail.
    */
    @SerializedName("SampleRate")
    @Expose
    private Long SampleRate;

    /**
    * Audio channel mode. Valid values:
<li>1: mono-channel.</li>
<li>2: dual-channel.</li>
<li>6: 5.1 surround sound.
<li>Default value: 2.
When the container format is audio (flac, ogg, mp3, and m4a), the audio channel cannot be set to 5.1 surround sound.
    */
    @SerializedName("AudioChannel")
    @Expose
    private Long AudioChannel;

    /**
    * Merge audio track information.
This field only takes effect in adaptive bitrate transcoding.

Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TrackChannelInfo")
    @Expose
    private AudioTrackChannelInfo TrackChannelInfo;

    /**
     * Get Specifies the encoding format of the audio stream.
When audio transcoding is not needed, the optional values are:.
<li>copy.</li>
When the outer parameter Container is mp3, the valid values are:.
<li>mp3.</li>
When the outer parameter Container is ogg or flac, the valid values are:.
<li>flac.</li>
When the outer parameter Container is m4a, valid values are:.
<li>aac;</li>
<li>ac3.</li>
When the outer parameter Container is mp4 or flv, valid values are:.
<li>aac: more suitable for mp4;</li>.
<li>mp3: more suitable for flv;</li>.
<li>mp2.</li>
When the outer parameter Container is hls, valid values are:.
<li>aac;</li>
<li>mp3;</li>
<li>eac3: used when merging adaptive transcoding audio tracks.</li>. 
     * @return Codec Specifies the encoding format of the audio stream.
When audio transcoding is not needed, the optional values are:.
<li>copy.</li>
When the outer parameter Container is mp3, the valid values are:.
<li>mp3.</li>
When the outer parameter Container is ogg or flac, the valid values are:.
<li>flac.</li>
When the outer parameter Container is m4a, valid values are:.
<li>aac;</li>
<li>ac3.</li>
When the outer parameter Container is mp4 or flv, valid values are:.
<li>aac: more suitable for mp4;</li>.
<li>mp3: more suitable for flv;</li>.
<li>mp2.</li>
When the outer parameter Container is hls, valid values are:.
<li>aac;</li>
<li>mp3;</li>
<li>eac3: used when merging adaptive transcoding audio tracks.</li>.
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set Specifies the encoding format of the audio stream.
When audio transcoding is not needed, the optional values are:.
<li>copy.</li>
When the outer parameter Container is mp3, the valid values are:.
<li>mp3.</li>
When the outer parameter Container is ogg or flac, the valid values are:.
<li>flac.</li>
When the outer parameter Container is m4a, valid values are:.
<li>aac;</li>
<li>ac3.</li>
When the outer parameter Container is mp4 or flv, valid values are:.
<li>aac: more suitable for mp4;</li>.
<li>mp3: more suitable for flv;</li>.
<li>mp2.</li>
When the outer parameter Container is hls, valid values are:.
<li>aac;</li>
<li>mp3;</li>
<li>eac3: used when merging adaptive transcoding audio tracks.</li>.
     * @param Codec Specifies the encoding format of the audio stream.
When audio transcoding is not needed, the optional values are:.
<li>copy.</li>
When the outer parameter Container is mp3, the valid values are:.
<li>mp3.</li>
When the outer parameter Container is ogg or flac, the valid values are:.
<li>flac.</li>
When the outer parameter Container is m4a, valid values are:.
<li>aac;</li>
<li>ac3.</li>
When the outer parameter Container is mp4 or flv, valid values are:.
<li>aac: more suitable for mp4;</li>.
<li>mp3: more suitable for flv;</li>.
<li>mp2.</li>
When the outer parameter Container is hls, valid values are:.
<li>aac;</li>
<li>mp3;</li>
<li>eac3: used when merging adaptive transcoding audio tracks.</li>.
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get The bitrate of the audio stream. value ranges from 0 to 26 and in the range of [26, 256]. measurement unit: kbps.
If the value is 0, the audio bitrate will be the same as that of the original audio.
Specifies that when using the TrackChannelInfo parameter for adaptive transcoding audio track merging, the valid values are:.
Cannot be set to 0.
2). when Codec is aac, valid values: [26, 256].
3). when Codec is ac3, valid values: [26, 640].
4) when Codec is eac3, value range: [26, 6144]. remark: when SampleRate is 44100HZ, maximum value: 5644. when SampleRate is 48000HZ, maximum value: 6144.

 
     * @return Bitrate The bitrate of the audio stream. value ranges from 0 to 26 and in the range of [26, 256]. measurement unit: kbps.
If the value is 0, the audio bitrate will be the same as that of the original audio.
Specifies that when using the TrackChannelInfo parameter for adaptive transcoding audio track merging, the valid values are:.
Cannot be set to 0.
2). when Codec is aac, valid values: [26, 256].
3). when Codec is ac3, valid values: [26, 640].
4) when Codec is eac3, value range: [26, 6144]. remark: when SampleRate is 44100HZ, maximum value: 5644. when SampleRate is 48000HZ, maximum value: 6144.


     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set The bitrate of the audio stream. value ranges from 0 to 26 and in the range of [26, 256]. measurement unit: kbps.
If the value is 0, the audio bitrate will be the same as that of the original audio.
Specifies that when using the TrackChannelInfo parameter for adaptive transcoding audio track merging, the valid values are:.
Cannot be set to 0.
2). when Codec is aac, valid values: [26, 256].
3). when Codec is ac3, valid values: [26, 640].
4) when Codec is eac3, value range: [26, 6144]. remark: when SampleRate is 44100HZ, maximum value: 5644. when SampleRate is 48000HZ, maximum value: 6144.


     * @param Bitrate The bitrate of the audio stream. value ranges from 0 to 26 and in the range of [26, 256]. measurement unit: kbps.
If the value is 0, the audio bitrate will be the same as that of the original audio.
Specifies that when using the TrackChannelInfo parameter for adaptive transcoding audio track merging, the valid values are:.
Cannot be set to 0.
2). when Codec is aac, valid values: [26, 256].
3). when Codec is ac3, valid values: [26, 640].
4) when Codec is eac3, value range: [26, 6144]. remark: when SampleRate is 44100HZ, maximum value: 5644. when SampleRate is 48000HZ, maximum value: 6144.


     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get Audio stream sampling rate. Different sampling rate options are provided for different encoding standards. For details, see [Audio/Video Transcoding Template](https://intl.cloud.tencent.com/document/product/862/77166?from_cn_redirect=1#f3b039f1-d817-4a96-b4e4-90132d31cd53).
Unit: Hz.
Note: Make sure that the sampling rate of the source audio stream is among the above options. Otherwise, transcoding may fail. 
     * @return SampleRate Audio stream sampling rate. Different sampling rate options are provided for different encoding standards. For details, see [Audio/Video Transcoding Template](https://intl.cloud.tencent.com/document/product/862/77166?from_cn_redirect=1#f3b039f1-d817-4a96-b4e4-90132d31cd53).
Unit: Hz.
Note: Make sure that the sampling rate of the source audio stream is among the above options. Otherwise, transcoding may fail.
     */
    public Long getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set Audio stream sampling rate. Different sampling rate options are provided for different encoding standards. For details, see [Audio/Video Transcoding Template](https://intl.cloud.tencent.com/document/product/862/77166?from_cn_redirect=1#f3b039f1-d817-4a96-b4e4-90132d31cd53).
Unit: Hz.
Note: Make sure that the sampling rate of the source audio stream is among the above options. Otherwise, transcoding may fail.
     * @param SampleRate Audio stream sampling rate. Different sampling rate options are provided for different encoding standards. For details, see [Audio/Video Transcoding Template](https://intl.cloud.tencent.com/document/product/862/77166?from_cn_redirect=1#f3b039f1-d817-4a96-b4e4-90132d31cd53).
Unit: Hz.
Note: Make sure that the sampling rate of the source audio stream is among the above options. Otherwise, transcoding may fail.
     */
    public void setSampleRate(Long SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * Get Audio channel mode. Valid values:
<li>1: mono-channel.</li>
<li>2: dual-channel.</li>
<li>6: 5.1 surround sound.
<li>Default value: 2.
When the container format is audio (flac, ogg, mp3, and m4a), the audio channel cannot be set to 5.1 surround sound. 
     * @return AudioChannel Audio channel mode. Valid values:
<li>1: mono-channel.</li>
<li>2: dual-channel.</li>
<li>6: 5.1 surround sound.
<li>Default value: 2.
When the container format is audio (flac, ogg, mp3, and m4a), the audio channel cannot be set to 5.1 surround sound.
     */
    public Long getAudioChannel() {
        return this.AudioChannel;
    }

    /**
     * Set Audio channel mode. Valid values:
<li>1: mono-channel.</li>
<li>2: dual-channel.</li>
<li>6: 5.1 surround sound.
<li>Default value: 2.
When the container format is audio (flac, ogg, mp3, and m4a), the audio channel cannot be set to 5.1 surround sound.
     * @param AudioChannel Audio channel mode. Valid values:
<li>1: mono-channel.</li>
<li>2: dual-channel.</li>
<li>6: 5.1 surround sound.
<li>Default value: 2.
When the container format is audio (flac, ogg, mp3, and m4a), the audio channel cannot be set to 5.1 surround sound.
     */
    public void setAudioChannel(Long AudioChannel) {
        this.AudioChannel = AudioChannel;
    }

    /**
     * Get Merge audio track information.
This field only takes effect in adaptive bitrate transcoding.

Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TrackChannelInfo Merge audio track information.
This field only takes effect in adaptive bitrate transcoding.

Note: This field may return null, indicating that no valid value can be obtained.
     */
    public AudioTrackChannelInfo getTrackChannelInfo() {
        return this.TrackChannelInfo;
    }

    /**
     * Set Merge audio track information.
This field only takes effect in adaptive bitrate transcoding.

Note: This field may return null, indicating that no valid value can be obtained.
     * @param TrackChannelInfo Merge audio track information.
This field only takes effect in adaptive bitrate transcoding.

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


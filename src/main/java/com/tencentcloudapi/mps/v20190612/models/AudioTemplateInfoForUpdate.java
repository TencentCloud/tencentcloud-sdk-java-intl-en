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

public class AudioTemplateInfoForUpdate extends AbstractModel {

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
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * Audio stream bitrate in Kbps. Value range: 0 and [26, 256]. If the value is 0, the bitrate of the audio stream will be the same as that of the original audio.
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * The sampling rate of the audio stream. the sampling rate options supported by different encoding standards are different. for details, see the audio sample rate support scope document (https://intl.cloud.tencent.com/document/product/862/77166?from_cn_redirect=1#f3b039f1-d817-4a96-b4e4-90132d31cd53).
Unit: Hz.
Please ensure that the sampling rate of the source audio stream is within the scope of the above options. otherwise, transcoding failure may occur.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SampleRate")
    @Expose
    private Long SampleRate;

    /**
    * Audio channel mode. Valid values:
<li>1: mono-channel.</li>
<li>2: dual-channel.</li>
<li>6: 5.1 surround sound.
When the container format is audio (flac, ogg, mp3, and m4a), the audio channel cannot be set to 5.1 surround sound.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AudioChannel")
    @Expose
    private Long AudioChannel;

    /**
    * The audio tracks to retain. All audio tracks are retained by default.
    */
    @SerializedName("StreamSelects")
    @Expose
    private Long [] StreamSelects;

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
Note: This field may return null, indicating that no valid values can be obtained. 
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
Note: This field may return null, indicating that no valid values can be obtained.
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
Note: This field may return null, indicating that no valid values can be obtained.
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
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get Audio stream bitrate in Kbps. Value range: 0 and [26, 256]. If the value is 0, the bitrate of the audio stream will be the same as that of the original audio. 
     * @return Bitrate Audio stream bitrate in Kbps. Value range: 0 and [26, 256]. If the value is 0, the bitrate of the audio stream will be the same as that of the original audio.
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set Audio stream bitrate in Kbps. Value range: 0 and [26, 256]. If the value is 0, the bitrate of the audio stream will be the same as that of the original audio.
     * @param Bitrate Audio stream bitrate in Kbps. Value range: 0 and [26, 256]. If the value is 0, the bitrate of the audio stream will be the same as that of the original audio.
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get The sampling rate of the audio stream. the sampling rate options supported by different encoding standards are different. for details, see the audio sample rate support scope document (https://intl.cloud.tencent.com/document/product/862/77166?from_cn_redirect=1#f3b039f1-d817-4a96-b4e4-90132d31cd53).
Unit: Hz.
Please ensure that the sampling rate of the source audio stream is within the scope of the above options. otherwise, transcoding failure may occur.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SampleRate The sampling rate of the audio stream. the sampling rate options supported by different encoding standards are different. for details, see the audio sample rate support scope document (https://intl.cloud.tencent.com/document/product/862/77166?from_cn_redirect=1#f3b039f1-d817-4a96-b4e4-90132d31cd53).
Unit: Hz.
Please ensure that the sampling rate of the source audio stream is within the scope of the above options. otherwise, transcoding failure may occur.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set The sampling rate of the audio stream. the sampling rate options supported by different encoding standards are different. for details, see the audio sample rate support scope document (https://intl.cloud.tencent.com/document/product/862/77166?from_cn_redirect=1#f3b039f1-d817-4a96-b4e4-90132d31cd53).
Unit: Hz.
Please ensure that the sampling rate of the source audio stream is within the scope of the above options. otherwise, transcoding failure may occur.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SampleRate The sampling rate of the audio stream. the sampling rate options supported by different encoding standards are different. for details, see the audio sample rate support scope document (https://intl.cloud.tencent.com/document/product/862/77166?from_cn_redirect=1#f3b039f1-d817-4a96-b4e4-90132d31cd53).
Unit: Hz.
Please ensure that the sampling rate of the source audio stream is within the scope of the above options. otherwise, transcoding failure may occur.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSampleRate(Long SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * Get Audio channel mode. Valid values:
<li>1: mono-channel.</li>
<li>2: dual-channel.</li>
<li>6: 5.1 surround sound.
When the container format is audio (flac, ogg, mp3, and m4a), the audio channel cannot be set to 5.1 surround sound.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AudioChannel Audio channel mode. Valid values:
<li>1: mono-channel.</li>
<li>2: dual-channel.</li>
<li>6: 5.1 surround sound.
When the container format is audio (flac, ogg, mp3, and m4a), the audio channel cannot be set to 5.1 surround sound.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAudioChannel() {
        return this.AudioChannel;
    }

    /**
     * Set Audio channel mode. Valid values:
<li>1: mono-channel.</li>
<li>2: dual-channel.</li>
<li>6: 5.1 surround sound.
When the container format is audio (flac, ogg, mp3, and m4a), the audio channel cannot be set to 5.1 surround sound.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param AudioChannel Audio channel mode. Valid values:
<li>1: mono-channel.</li>
<li>2: dual-channel.</li>
<li>6: 5.1 surround sound.
When the container format is audio (flac, ogg, mp3, and m4a), the audio channel cannot be set to 5.1 surround sound.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAudioChannel(Long AudioChannel) {
        this.AudioChannel = AudioChannel;
    }

    /**
     * Get The audio tracks to retain. All audio tracks are retained by default. 
     * @return StreamSelects The audio tracks to retain. All audio tracks are retained by default.
     */
    public Long [] getStreamSelects() {
        return this.StreamSelects;
    }

    /**
     * Set The audio tracks to retain. All audio tracks are retained by default.
     * @param StreamSelects The audio tracks to retain. All audio tracks are retained by default.
     */
    public void setStreamSelects(Long [] StreamSelects) {
        this.StreamSelects = StreamSelects;
    }

    public AudioTemplateInfoForUpdate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AudioTemplateInfoForUpdate(AudioTemplateInfoForUpdate source) {
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
        if (source.StreamSelects != null) {
            this.StreamSelects = new Long[source.StreamSelects.length];
            for (int i = 0; i < source.StreamSelects.length; i++) {
                this.StreamSelects[i] = new Long(source.StreamSelects[i]);
            }
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
        this.setParamArraySimple(map, prefix + "StreamSelects.", this.StreamSelects);

    }
}


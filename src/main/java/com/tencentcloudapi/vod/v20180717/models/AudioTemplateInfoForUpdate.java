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

public class AudioTemplateInfoForUpdate extends AbstractModel {

    /**
    * <p>Audio stream encoding format.<br>When the outer parameter Container is mp3, the valid value is:</p><li>libmp3lame.</li>When the outer parameter Container is ogg or flac, the valid value is:<li>flac.</li>When the outer parameter Container is m4a, the valid values are:<li>libfdk_aac;</li><li>libmp3lame;</li><li>ac3.</li>When the outer parameter Container is mp4 or flv, the valid values are:<li>libfdk_aac: suitable for mp4.</li><li>libmp3lame: suitable for flv.</li><li>mp2.</li>When the outer parameter Container is hls, the valid value is:<li>libfdk_aac.</li>When the outer parameter Format is HLS or MPEG-DASH, the valid value is:<li>libfdk_aac.</li>When the outer parameter Container is wav, the valid value is:<li>pcm16.</li>
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * <p>Audio stream bitrate, in kbps. Value range: 0 and [26, 256]. When the value is 0, it means the bitrate is set automatically by VOD.</p>
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * <p>Sampling rate of the audio stream. Available values:</p><li>16000. Available only when Codec is pcm16.</li><li>32000</li><li>44100</li><li>48000</li>Unit: Hz.
    */
    @SerializedName("SampleRate")
    @Expose
    private Long SampleRate;

    /**
    * <p>Audio channel. Available values:</p><li>1: Single channel.</li><li>2: Two channels.</li><li>6: Stereo.</li><li>0: The number of audio channels remains the same as the original audio.</li>When the media container format is an audio format (flac, ogg, mp3, m4a), the number of audio channels cannot be set to stereo.
    */
    @SerializedName("AudioChannel")
    @Expose
    private Long AudioChannel;

    /**
    * <p>Specifies the retained audio tracks for output. All source tracks are retained. </p><p>This parameter is valid only when specified in the OverrideParameter parameter and is disabled in other cases.</p>
    */
    @SerializedName("StreamSelects")
    @Expose
    private Long [] StreamSelects;

    /**
     * Get <p>Audio stream encoding format.<br>When the outer parameter Container is mp3, the valid value is:</p><li>libmp3lame.</li>When the outer parameter Container is ogg or flac, the valid value is:<li>flac.</li>When the outer parameter Container is m4a, the valid values are:<li>libfdk_aac;</li><li>libmp3lame;</li><li>ac3.</li>When the outer parameter Container is mp4 or flv, the valid values are:<li>libfdk_aac: suitable for mp4.</li><li>libmp3lame: suitable for flv.</li><li>mp2.</li>When the outer parameter Container is hls, the valid value is:<li>libfdk_aac.</li>When the outer parameter Format is HLS or MPEG-DASH, the valid value is:<li>libfdk_aac.</li>When the outer parameter Container is wav, the valid value is:<li>pcm16.</li> 
     * @return Codec <p>Audio stream encoding format.<br>When the outer parameter Container is mp3, the valid value is:</p><li>libmp3lame.</li>When the outer parameter Container is ogg or flac, the valid value is:<li>flac.</li>When the outer parameter Container is m4a, the valid values are:<li>libfdk_aac;</li><li>libmp3lame;</li><li>ac3.</li>When the outer parameter Container is mp4 or flv, the valid values are:<li>libfdk_aac: suitable for mp4.</li><li>libmp3lame: suitable for flv.</li><li>mp2.</li>When the outer parameter Container is hls, the valid value is:<li>libfdk_aac.</li>When the outer parameter Format is HLS or MPEG-DASH, the valid value is:<li>libfdk_aac.</li>When the outer parameter Container is wav, the valid value is:<li>pcm16.</li>
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set <p>Audio stream encoding format.<br>When the outer parameter Container is mp3, the valid value is:</p><li>libmp3lame.</li>When the outer parameter Container is ogg or flac, the valid value is:<li>flac.</li>When the outer parameter Container is m4a, the valid values are:<li>libfdk_aac;</li><li>libmp3lame;</li><li>ac3.</li>When the outer parameter Container is mp4 or flv, the valid values are:<li>libfdk_aac: suitable for mp4.</li><li>libmp3lame: suitable for flv.</li><li>mp2.</li>When the outer parameter Container is hls, the valid value is:<li>libfdk_aac.</li>When the outer parameter Format is HLS or MPEG-DASH, the valid value is:<li>libfdk_aac.</li>When the outer parameter Container is wav, the valid value is:<li>pcm16.</li>
     * @param Codec <p>Audio stream encoding format.<br>When the outer parameter Container is mp3, the valid value is:</p><li>libmp3lame.</li>When the outer parameter Container is ogg or flac, the valid value is:<li>flac.</li>When the outer parameter Container is m4a, the valid values are:<li>libfdk_aac;</li><li>libmp3lame;</li><li>ac3.</li>When the outer parameter Container is mp4 or flv, the valid values are:<li>libfdk_aac: suitable for mp4.</li><li>libmp3lame: suitable for flv.</li><li>mp2.</li>When the outer parameter Container is hls, the valid value is:<li>libfdk_aac.</li>When the outer parameter Format is HLS or MPEG-DASH, the valid value is:<li>libfdk_aac.</li>When the outer parameter Container is wav, the valid value is:<li>pcm16.</li>
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get <p>Audio stream bitrate, in kbps. Value range: 0 and [26, 256]. When the value is 0, it means the bitrate is set automatically by VOD.</p> 
     * @return Bitrate <p>Audio stream bitrate, in kbps. Value range: 0 and [26, 256]. When the value is 0, it means the bitrate is set automatically by VOD.</p>
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set <p>Audio stream bitrate, in kbps. Value range: 0 and [26, 256]. When the value is 0, it means the bitrate is set automatically by VOD.</p>
     * @param Bitrate <p>Audio stream bitrate, in kbps. Value range: 0 and [26, 256]. When the value is 0, it means the bitrate is set automatically by VOD.</p>
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get <p>Sampling rate of the audio stream. Available values:</p><li>16000. Available only when Codec is pcm16.</li><li>32000</li><li>44100</li><li>48000</li>Unit: Hz. 
     * @return SampleRate <p>Sampling rate of the audio stream. Available values:</p><li>16000. Available only when Codec is pcm16.</li><li>32000</li><li>44100</li><li>48000</li>Unit: Hz.
     */
    public Long getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set <p>Sampling rate of the audio stream. Available values:</p><li>16000. Available only when Codec is pcm16.</li><li>32000</li><li>44100</li><li>48000</li>Unit: Hz.
     * @param SampleRate <p>Sampling rate of the audio stream. Available values:</p><li>16000. Available only when Codec is pcm16.</li><li>32000</li><li>44100</li><li>48000</li>Unit: Hz.
     */
    public void setSampleRate(Long SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * Get <p>Audio channel. Available values:</p><li>1: Single channel.</li><li>2: Two channels.</li><li>6: Stereo.</li><li>0: The number of audio channels remains the same as the original audio.</li>When the media container format is an audio format (flac, ogg, mp3, m4a), the number of audio channels cannot be set to stereo. 
     * @return AudioChannel <p>Audio channel. Available values:</p><li>1: Single channel.</li><li>2: Two channels.</li><li>6: Stereo.</li><li>0: The number of audio channels remains the same as the original audio.</li>When the media container format is an audio format (flac, ogg, mp3, m4a), the number of audio channels cannot be set to stereo.
     */
    public Long getAudioChannel() {
        return this.AudioChannel;
    }

    /**
     * Set <p>Audio channel. Available values:</p><li>1: Single channel.</li><li>2: Two channels.</li><li>6: Stereo.</li><li>0: The number of audio channels remains the same as the original audio.</li>When the media container format is an audio format (flac, ogg, mp3, m4a), the number of audio channels cannot be set to stereo.
     * @param AudioChannel <p>Audio channel. Available values:</p><li>1: Single channel.</li><li>2: Two channels.</li><li>6: Stereo.</li><li>0: The number of audio channels remains the same as the original audio.</li>When the media container format is an audio format (flac, ogg, mp3, m4a), the number of audio channels cannot be set to stereo.
     */
    public void setAudioChannel(Long AudioChannel) {
        this.AudioChannel = AudioChannel;
    }

    /**
     * Get <p>Specifies the retained audio tracks for output. All source tracks are retained. </p><p>This parameter is valid only when specified in the OverrideParameter parameter and is disabled in other cases.</p> 
     * @return StreamSelects <p>Specifies the retained audio tracks for output. All source tracks are retained. </p><p>This parameter is valid only when specified in the OverrideParameter parameter and is disabled in other cases.</p>
     */
    public Long [] getStreamSelects() {
        return this.StreamSelects;
    }

    /**
     * Set <p>Specifies the retained audio tracks for output. All source tracks are retained. </p><p>This parameter is valid only when specified in the OverrideParameter parameter and is disabled in other cases.</p>
     * @param StreamSelects <p>Specifies the retained audio tracks for output. All source tracks are retained. </p><p>This parameter is valid only when specified in the OverrideParameter parameter and is disabled in other cases.</p>
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


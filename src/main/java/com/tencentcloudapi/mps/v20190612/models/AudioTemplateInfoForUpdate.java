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
    * <p>Audio stream encoding format.<br>When audio transcoding is not needed, the valid value is:</p><li>copy.</li>When the outer parameter Container is mp3, the valid value is:<li>mp3.</li>When the outer parameter Container is ogg or flac, the valid value is:<li>flac.</li>When the outer parameter Container is m4a, the valid values are:<li>aac;</li><li>ac3.</li>When the outer parameter Container is mp4 or flv, the valid values are:<li>aac: suitable for mp4.</li><li>mp3: suitable for flv.</li><li>mp2.</li>When the outer parameter Container is hls, the valid values are:<li>aac.</li><li>mp3.</li>When the outer parameter Container is wav, the valid values are:<li>pcm16 and pcm24.</li>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * <p>Audio stream bitrate, in kbps. Value range: 0 and [26, 256]. When the value is 0, it means the audio bitrate remains consistent with that of the original audio.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * <p>Audio stream sampling rate. Different sampling rate options are provided for different encoding standards. Enter 0 to use the source audio sampling rate.<br>For details, see <a href="https://www.tencentcloud.com/document/product/862/77166?from_cn_redirect=1#f3b039f1-d817-4a96-b4e4-90132d31cd53">Audio Sampling Rate Range</a>.<br>Unit: Hz.<br>Note: Ensure the source audio stream sampling rate is within the supported range. Otherwise, transcoding may fail.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SampleRate")
    @Expose
    private Long SampleRate;

    /**
    * <p>Audio channel mode. Valid values:</p><li>0: The number of audio channels follows that of the source.</li><li>1: Single channel.</li><li>2: Two channels.</li><li>6: 5.1 channels.</li>When the media container format is an audio format (mp3), the number of audio channels cannot be set to 5.1.<p>Default value: 2.<br>Note: If you set the audio channel to follow that of the source and the audio encoding format does not support the current audio channel, the transcoding task may fail.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AudioChannel")
    @Expose
    private Long AudioChannel;

    /**
    * <p>Specifies the retained audio tracks for output. All source tracks are retained by default.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StreamSelects")
    @Expose
    private Long [] StreamSelects;

    /**
     * Get <p>Audio stream encoding format.<br>When audio transcoding is not needed, the valid value is:</p><li>copy.</li>When the outer parameter Container is mp3, the valid value is:<li>mp3.</li>When the outer parameter Container is ogg or flac, the valid value is:<li>flac.</li>When the outer parameter Container is m4a, the valid values are:<li>aac;</li><li>ac3.</li>When the outer parameter Container is mp4 or flv, the valid values are:<li>aac: suitable for mp4.</li><li>mp3: suitable for flv.</li><li>mp2.</li>When the outer parameter Container is hls, the valid values are:<li>aac.</li><li>mp3.</li>When the outer parameter Container is wav, the valid values are:<li>pcm16 and pcm24.</li>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Codec <p>Audio stream encoding format.<br>When audio transcoding is not needed, the valid value is:</p><li>copy.</li>When the outer parameter Container is mp3, the valid value is:<li>mp3.</li>When the outer parameter Container is ogg or flac, the valid value is:<li>flac.</li>When the outer parameter Container is m4a, the valid values are:<li>aac;</li><li>ac3.</li>When the outer parameter Container is mp4 or flv, the valid values are:<li>aac: suitable for mp4.</li><li>mp3: suitable for flv.</li><li>mp2.</li>When the outer parameter Container is hls, the valid values are:<li>aac.</li><li>mp3.</li>When the outer parameter Container is wav, the valid values are:<li>pcm16 and pcm24.</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set <p>Audio stream encoding format.<br>When audio transcoding is not needed, the valid value is:</p><li>copy.</li>When the outer parameter Container is mp3, the valid value is:<li>mp3.</li>When the outer parameter Container is ogg or flac, the valid value is:<li>flac.</li>When the outer parameter Container is m4a, the valid values are:<li>aac;</li><li>ac3.</li>When the outer parameter Container is mp4 or flv, the valid values are:<li>aac: suitable for mp4.</li><li>mp3: suitable for flv.</li><li>mp2.</li>When the outer parameter Container is hls, the valid values are:<li>aac.</li><li>mp3.</li>When the outer parameter Container is wav, the valid values are:<li>pcm16 and pcm24.</li>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Codec <p>Audio stream encoding format.<br>When audio transcoding is not needed, the valid value is:</p><li>copy.</li>When the outer parameter Container is mp3, the valid value is:<li>mp3.</li>When the outer parameter Container is ogg or flac, the valid value is:<li>flac.</li>When the outer parameter Container is m4a, the valid values are:<li>aac;</li><li>ac3.</li>When the outer parameter Container is mp4 or flv, the valid values are:<li>aac: suitable for mp4.</li><li>mp3: suitable for flv.</li><li>mp2.</li>When the outer parameter Container is hls, the valid values are:<li>aac.</li><li>mp3.</li>When the outer parameter Container is wav, the valid values are:<li>pcm16 and pcm24.</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get <p>Audio stream bitrate, in kbps. Value range: 0 and [26, 256]. When the value is 0, it means the audio bitrate remains consistent with that of the original audio.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Bitrate <p>Audio stream bitrate, in kbps. Value range: 0 and [26, 256]. When the value is 0, it means the audio bitrate remains consistent with that of the original audio.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set <p>Audio stream bitrate, in kbps. Value range: 0 and [26, 256]. When the value is 0, it means the audio bitrate remains consistent with that of the original audio.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Bitrate <p>Audio stream bitrate, in kbps. Value range: 0 and [26, 256]. When the value is 0, it means the audio bitrate remains consistent with that of the original audio.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get <p>Audio stream sampling rate. Different sampling rate options are provided for different encoding standards. Enter 0 to use the source audio sampling rate.<br>For details, see <a href="https://www.tencentcloud.com/document/product/862/77166?from_cn_redirect=1#f3b039f1-d817-4a96-b4e4-90132d31cd53">Audio Sampling Rate Range</a>.<br>Unit: Hz.<br>Note: Ensure the source audio stream sampling rate is within the supported range. Otherwise, transcoding may fail.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SampleRate <p>Audio stream sampling rate. Different sampling rate options are provided for different encoding standards. Enter 0 to use the source audio sampling rate.<br>For details, see <a href="https://www.tencentcloud.com/document/product/862/77166?from_cn_redirect=1#f3b039f1-d817-4a96-b4e4-90132d31cd53">Audio Sampling Rate Range</a>.<br>Unit: Hz.<br>Note: Ensure the source audio stream sampling rate is within the supported range. Otherwise, transcoding may fail.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set <p>Audio stream sampling rate. Different sampling rate options are provided for different encoding standards. Enter 0 to use the source audio sampling rate.<br>For details, see <a href="https://www.tencentcloud.com/document/product/862/77166?from_cn_redirect=1#f3b039f1-d817-4a96-b4e4-90132d31cd53">Audio Sampling Rate Range</a>.<br>Unit: Hz.<br>Note: Ensure the source audio stream sampling rate is within the supported range. Otherwise, transcoding may fail.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SampleRate <p>Audio stream sampling rate. Different sampling rate options are provided for different encoding standards. Enter 0 to use the source audio sampling rate.<br>For details, see <a href="https://www.tencentcloud.com/document/product/862/77166?from_cn_redirect=1#f3b039f1-d817-4a96-b4e4-90132d31cd53">Audio Sampling Rate Range</a>.<br>Unit: Hz.<br>Note: Ensure the source audio stream sampling rate is within the supported range. Otherwise, transcoding may fail.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSampleRate(Long SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * Get <p>Audio channel mode. Valid values:</p><li>0: The number of audio channels follows that of the source.</li><li>1: Single channel.</li><li>2: Two channels.</li><li>6: 5.1 channels.</li>When the media container format is an audio format (mp3), the number of audio channels cannot be set to 5.1.<p>Default value: 2.<br>Note: If you set the audio channel to follow that of the source and the audio encoding format does not support the current audio channel, the transcoding task may fail.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AudioChannel <p>Audio channel mode. Valid values:</p><li>0: The number of audio channels follows that of the source.</li><li>1: Single channel.</li><li>2: Two channels.</li><li>6: 5.1 channels.</li>When the media container format is an audio format (mp3), the number of audio channels cannot be set to 5.1.<p>Default value: 2.<br>Note: If you set the audio channel to follow that of the source and the audio encoding format does not support the current audio channel, the transcoding task may fail.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAudioChannel() {
        return this.AudioChannel;
    }

    /**
     * Set <p>Audio channel mode. Valid values:</p><li>0: The number of audio channels follows that of the source.</li><li>1: Single channel.</li><li>2: Two channels.</li><li>6: 5.1 channels.</li>When the media container format is an audio format (mp3), the number of audio channels cannot be set to 5.1.<p>Default value: 2.<br>Note: If you set the audio channel to follow that of the source and the audio encoding format does not support the current audio channel, the transcoding task may fail.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AudioChannel <p>Audio channel mode. Valid values:</p><li>0: The number of audio channels follows that of the source.</li><li>1: Single channel.</li><li>2: Two channels.</li><li>6: 5.1 channels.</li>When the media container format is an audio format (mp3), the number of audio channels cannot be set to 5.1.<p>Default value: 2.<br>Note: If you set the audio channel to follow that of the source and the audio encoding format does not support the current audio channel, the transcoding task may fail.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAudioChannel(Long AudioChannel) {
        this.AudioChannel = AudioChannel;
    }

    /**
     * Get <p>Specifies the retained audio tracks for output. All source tracks are retained by default.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StreamSelects <p>Specifies the retained audio tracks for output. All source tracks are retained by default.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long [] getStreamSelects() {
        return this.StreamSelects;
    }

    /**
     * Set <p>Specifies the retained audio tracks for output. All source tracks are retained by default.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StreamSelects <p>Specifies the retained audio tracks for output. All source tracks are retained by default.</p>
Note: This field may return null, indicating that no valid values can be obtained.
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


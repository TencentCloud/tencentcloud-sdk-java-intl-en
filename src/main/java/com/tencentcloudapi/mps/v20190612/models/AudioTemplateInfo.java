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
    * <p>Audio stream encoding format.<br>When audio transcoding is not needed, the valid value is:</p><li>copy.</li>When the outer parameter Container is mp3, the valid value is:<li>mp3.</li>When the outer parameter Container is ogg or flac, the valid value is:<li>flac.</li>When the outer parameter Container is m4a, the valid values are:<li>aac;</li><li>ac3.</li>When the outer parameter Container is mp4 or flv, the valid values are:<li>aac: suitable for mp4.</li><li>mp3: suitable for flv.</li><li>mp2.</li>When the outer parameter Container is hls, the valid values are:<li>aac.</li><li>mp3.</li><li>eac3: used when merging audio tracks with adaptive transcoding.</li>When the outer parameter Container is wav, the valid values are:<li>pcm16 and pcm24.</li>
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * <p>Audio stream bitrate, in kbps. Value range: 0 and [26, 256].<br>When the value is 0, it means the audio bitrate remains consistent with that of the original audio.<br>Note: If the TrackChannelInfo parameter is used for audio track merging with adaptive transcoding, the value range:<br>1) cannot be 0.<br>2) When Codec is aac, the value range is [26, 256].<br>3) When Codec is ac3, the value range is [26, 640].<br>4) When Codec is eac3, the value range is [26, 6144]. Note: When SampleRate is 44100HZ, the maximum value is 5644. When SampleRate is 48000HZ, the maximum value is 6144.</p>
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * <p>Audio stream sampling rate. Different sampling rate options are provided for different encoding standards. Enter 0 to use the source audio sampling rate.<br>For details, see <a href="https://www.tencentcloud.com/document/product/862/77166?from_cn_redirect=1#f3b039f1-d817-4a96-b4e4-90132d31cd53">Audio Sampling Rate Range</a>.<br>Unit: Hz.<br>Note: Ensure the source audio stream sampling rate is within the supported range. Otherwise, transcoding may fail.</p>
    */
    @SerializedName("SampleRate")
    @Expose
    private Long SampleRate;

    /**
    * <p>Audio channel mode. Valid values:</p><li>0: The number of audio channels follows that of the source.</li><li>1: Single channel.</li><li>2: Two channels.</li><li>6: 5.1 channels.</li>When the media container format is an audio format (mp3), the number of audio channels cannot be set to 5.1.<p>Default value: 2.<br>Note: If you set the audio channel to follow that of the source and the audio encoding format does not support the current audio channel, the transcoding task may fail.</p>
    */
    @SerializedName("AudioChannel")
    @Expose
    private Long AudioChannel;

    /**
    * <p>Audio track merging information.<br>Note: This field only takes effect for adaptive transcoding.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TrackChannelInfo")
    @Expose
    private AudioTrackChannelInfo TrackChannelInfo;

    /**
     * Get <p>Audio stream encoding format.<br>When audio transcoding is not needed, the valid value is:</p><li>copy.</li>When the outer parameter Container is mp3, the valid value is:<li>mp3.</li>When the outer parameter Container is ogg or flac, the valid value is:<li>flac.</li>When the outer parameter Container is m4a, the valid values are:<li>aac;</li><li>ac3.</li>When the outer parameter Container is mp4 or flv, the valid values are:<li>aac: suitable for mp4.</li><li>mp3: suitable for flv.</li><li>mp2.</li>When the outer parameter Container is hls, the valid values are:<li>aac.</li><li>mp3.</li><li>eac3: used when merging audio tracks with adaptive transcoding.</li>When the outer parameter Container is wav, the valid values are:<li>pcm16 and pcm24.</li> 
     * @return Codec <p>Audio stream encoding format.<br>When audio transcoding is not needed, the valid value is:</p><li>copy.</li>When the outer parameter Container is mp3, the valid value is:<li>mp3.</li>When the outer parameter Container is ogg or flac, the valid value is:<li>flac.</li>When the outer parameter Container is m4a, the valid values are:<li>aac;</li><li>ac3.</li>When the outer parameter Container is mp4 or flv, the valid values are:<li>aac: suitable for mp4.</li><li>mp3: suitable for flv.</li><li>mp2.</li>When the outer parameter Container is hls, the valid values are:<li>aac.</li><li>mp3.</li><li>eac3: used when merging audio tracks with adaptive transcoding.</li>When the outer parameter Container is wav, the valid values are:<li>pcm16 and pcm24.</li>
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set <p>Audio stream encoding format.<br>When audio transcoding is not needed, the valid value is:</p><li>copy.</li>When the outer parameter Container is mp3, the valid value is:<li>mp3.</li>When the outer parameter Container is ogg or flac, the valid value is:<li>flac.</li>When the outer parameter Container is m4a, the valid values are:<li>aac;</li><li>ac3.</li>When the outer parameter Container is mp4 or flv, the valid values are:<li>aac: suitable for mp4.</li><li>mp3: suitable for flv.</li><li>mp2.</li>When the outer parameter Container is hls, the valid values are:<li>aac.</li><li>mp3.</li><li>eac3: used when merging audio tracks with adaptive transcoding.</li>When the outer parameter Container is wav, the valid values are:<li>pcm16 and pcm24.</li>
     * @param Codec <p>Audio stream encoding format.<br>When audio transcoding is not needed, the valid value is:</p><li>copy.</li>When the outer parameter Container is mp3, the valid value is:<li>mp3.</li>When the outer parameter Container is ogg or flac, the valid value is:<li>flac.</li>When the outer parameter Container is m4a, the valid values are:<li>aac;</li><li>ac3.</li>When the outer parameter Container is mp4 or flv, the valid values are:<li>aac: suitable for mp4.</li><li>mp3: suitable for flv.</li><li>mp2.</li>When the outer parameter Container is hls, the valid values are:<li>aac.</li><li>mp3.</li><li>eac3: used when merging audio tracks with adaptive transcoding.</li>When the outer parameter Container is wav, the valid values are:<li>pcm16 and pcm24.</li>
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get <p>Audio stream bitrate, in kbps. Value range: 0 and [26, 256].<br>When the value is 0, it means the audio bitrate remains consistent with that of the original audio.<br>Note: If the TrackChannelInfo parameter is used for audio track merging with adaptive transcoding, the value range:<br>1) cannot be 0.<br>2) When Codec is aac, the value range is [26, 256].<br>3) When Codec is ac3, the value range is [26, 640].<br>4) When Codec is eac3, the value range is [26, 6144]. Note: When SampleRate is 44100HZ, the maximum value is 5644. When SampleRate is 48000HZ, the maximum value is 6144.</p> 
     * @return Bitrate <p>Audio stream bitrate, in kbps. Value range: 0 and [26, 256].<br>When the value is 0, it means the audio bitrate remains consistent with that of the original audio.<br>Note: If the TrackChannelInfo parameter is used for audio track merging with adaptive transcoding, the value range:<br>1) cannot be 0.<br>2) When Codec is aac, the value range is [26, 256].<br>3) When Codec is ac3, the value range is [26, 640].<br>4) When Codec is eac3, the value range is [26, 6144]. Note: When SampleRate is 44100HZ, the maximum value is 5644. When SampleRate is 48000HZ, the maximum value is 6144.</p>
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set <p>Audio stream bitrate, in kbps. Value range: 0 and [26, 256].<br>When the value is 0, it means the audio bitrate remains consistent with that of the original audio.<br>Note: If the TrackChannelInfo parameter is used for audio track merging with adaptive transcoding, the value range:<br>1) cannot be 0.<br>2) When Codec is aac, the value range is [26, 256].<br>3) When Codec is ac3, the value range is [26, 640].<br>4) When Codec is eac3, the value range is [26, 6144]. Note: When SampleRate is 44100HZ, the maximum value is 5644. When SampleRate is 48000HZ, the maximum value is 6144.</p>
     * @param Bitrate <p>Audio stream bitrate, in kbps. Value range: 0 and [26, 256].<br>When the value is 0, it means the audio bitrate remains consistent with that of the original audio.<br>Note: If the TrackChannelInfo parameter is used for audio track merging with adaptive transcoding, the value range:<br>1) cannot be 0.<br>2) When Codec is aac, the value range is [26, 256].<br>3) When Codec is ac3, the value range is [26, 640].<br>4) When Codec is eac3, the value range is [26, 6144]. Note: When SampleRate is 44100HZ, the maximum value is 5644. When SampleRate is 48000HZ, the maximum value is 6144.</p>
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get <p>Audio stream sampling rate. Different sampling rate options are provided for different encoding standards. Enter 0 to use the source audio sampling rate.<br>For details, see <a href="https://www.tencentcloud.com/document/product/862/77166?from_cn_redirect=1#f3b039f1-d817-4a96-b4e4-90132d31cd53">Audio Sampling Rate Range</a>.<br>Unit: Hz.<br>Note: Ensure the source audio stream sampling rate is within the supported range. Otherwise, transcoding may fail.</p> 
     * @return SampleRate <p>Audio stream sampling rate. Different sampling rate options are provided for different encoding standards. Enter 0 to use the source audio sampling rate.<br>For details, see <a href="https://www.tencentcloud.com/document/product/862/77166?from_cn_redirect=1#f3b039f1-d817-4a96-b4e4-90132d31cd53">Audio Sampling Rate Range</a>.<br>Unit: Hz.<br>Note: Ensure the source audio stream sampling rate is within the supported range. Otherwise, transcoding may fail.</p>
     */
    public Long getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set <p>Audio stream sampling rate. Different sampling rate options are provided for different encoding standards. Enter 0 to use the source audio sampling rate.<br>For details, see <a href="https://www.tencentcloud.com/document/product/862/77166?from_cn_redirect=1#f3b039f1-d817-4a96-b4e4-90132d31cd53">Audio Sampling Rate Range</a>.<br>Unit: Hz.<br>Note: Ensure the source audio stream sampling rate is within the supported range. Otherwise, transcoding may fail.</p>
     * @param SampleRate <p>Audio stream sampling rate. Different sampling rate options are provided for different encoding standards. Enter 0 to use the source audio sampling rate.<br>For details, see <a href="https://www.tencentcloud.com/document/product/862/77166?from_cn_redirect=1#f3b039f1-d817-4a96-b4e4-90132d31cd53">Audio Sampling Rate Range</a>.<br>Unit: Hz.<br>Note: Ensure the source audio stream sampling rate is within the supported range. Otherwise, transcoding may fail.</p>
     */
    public void setSampleRate(Long SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * Get <p>Audio channel mode. Valid values:</p><li>0: The number of audio channels follows that of the source.</li><li>1: Single channel.</li><li>2: Two channels.</li><li>6: 5.1 channels.</li>When the media container format is an audio format (mp3), the number of audio channels cannot be set to 5.1.<p>Default value: 2.<br>Note: If you set the audio channel to follow that of the source and the audio encoding format does not support the current audio channel, the transcoding task may fail.</p> 
     * @return AudioChannel <p>Audio channel mode. Valid values:</p><li>0: The number of audio channels follows that of the source.</li><li>1: Single channel.</li><li>2: Two channels.</li><li>6: 5.1 channels.</li>When the media container format is an audio format (mp3), the number of audio channels cannot be set to 5.1.<p>Default value: 2.<br>Note: If you set the audio channel to follow that of the source and the audio encoding format does not support the current audio channel, the transcoding task may fail.</p>
     */
    public Long getAudioChannel() {
        return this.AudioChannel;
    }

    /**
     * Set <p>Audio channel mode. Valid values:</p><li>0: The number of audio channels follows that of the source.</li><li>1: Single channel.</li><li>2: Two channels.</li><li>6: 5.1 channels.</li>When the media container format is an audio format (mp3), the number of audio channels cannot be set to 5.1.<p>Default value: 2.<br>Note: If you set the audio channel to follow that of the source and the audio encoding format does not support the current audio channel, the transcoding task may fail.</p>
     * @param AudioChannel <p>Audio channel mode. Valid values:</p><li>0: The number of audio channels follows that of the source.</li><li>1: Single channel.</li><li>2: Two channels.</li><li>6: 5.1 channels.</li>When the media container format is an audio format (mp3), the number of audio channels cannot be set to 5.1.<p>Default value: 2.<br>Note: If you set the audio channel to follow that of the source and the audio encoding format does not support the current audio channel, the transcoding task may fail.</p>
     */
    public void setAudioChannel(Long AudioChannel) {
        this.AudioChannel = AudioChannel;
    }

    /**
     * Get <p>Audio track merging information.<br>Note: This field only takes effect for adaptive transcoding.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TrackChannelInfo <p>Audio track merging information.<br>Note: This field only takes effect for adaptive transcoding.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AudioTrackChannelInfo getTrackChannelInfo() {
        return this.TrackChannelInfo;
    }

    /**
     * Set <p>Audio track merging information.<br>Note: This field only takes effect for adaptive transcoding.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TrackChannelInfo <p>Audio track merging information.<br>Note: This field only takes effect for adaptive transcoding.</p>
Note: This field may return null, indicating that no valid values can be obtained.
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


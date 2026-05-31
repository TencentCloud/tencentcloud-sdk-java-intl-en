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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AudioTrackInfo extends AbstractModel {

    /**
    * User input, limited to letters and digits, length not exceeding 20, non-repeating in the same channel.
    */
    @SerializedName("TrackName")
    @Expose
    private String TrackName;

    /**
    * Audio encoding format, can only be `AAC` or `PASSTHROUGH`. Default is AAC.
    */
    @SerializedName("AudioCodec")
    @Expose
    private String AudioCodec;

    /**
    * Audio bitrate.
    */
    @SerializedName("AudioBitrate")
    @Expose
    private Long AudioBitrate;

    /**
    * Audio sample rate.
    */
    @SerializedName("AudioSampleRate")
    @Expose
    private Long AudioSampleRate;

    /**
    * Input Only the value defined in AttachedInputs.$.AudioSelectors.$.audioPidSelection.pid.
    */
    @SerializedName("AudioSelectorName")
    @Expose
    private String AudioSelectorName;

    /**
    * Audio loudness configuration.
    */
    @SerializedName("AudioNormalization")
    @Expose
    private AudioNormalizationSettings AudioNormalization;

    /**
    * Additional audio mode and sound channel configuration.
    */
    @SerializedName("AudioCodecDetails")
    @Expose
    private AudioCodecDetail AudioCodecDetails;

    /**
     * Get User input, limited to letters and digits, length not exceeding 20, non-repeating in the same channel. 
     * @return TrackName User input, limited to letters and digits, length not exceeding 20, non-repeating in the same channel.
     */
    public String getTrackName() {
        return this.TrackName;
    }

    /**
     * Set User input, limited to letters and digits, length not exceeding 20, non-repeating in the same channel.
     * @param TrackName User input, limited to letters and digits, length not exceeding 20, non-repeating in the same channel.
     */
    public void setTrackName(String TrackName) {
        this.TrackName = TrackName;
    }

    /**
     * Get Audio encoding format, can only be `AAC` or `PASSTHROUGH`. Default is AAC. 
     * @return AudioCodec Audio encoding format, can only be `AAC` or `PASSTHROUGH`. Default is AAC.
     */
    public String getAudioCodec() {
        return this.AudioCodec;
    }

    /**
     * Set Audio encoding format, can only be `AAC` or `PASSTHROUGH`. Default is AAC.
     * @param AudioCodec Audio encoding format, can only be `AAC` or `PASSTHROUGH`. Default is AAC.
     */
    public void setAudioCodec(String AudioCodec) {
        this.AudioCodec = AudioCodec;
    }

    /**
     * Get Audio bitrate. 
     * @return AudioBitrate Audio bitrate.
     */
    public Long getAudioBitrate() {
        return this.AudioBitrate;
    }

    /**
     * Set Audio bitrate.
     * @param AudioBitrate Audio bitrate.
     */
    public void setAudioBitrate(Long AudioBitrate) {
        this.AudioBitrate = AudioBitrate;
    }

    /**
     * Get Audio sample rate. 
     * @return AudioSampleRate Audio sample rate.
     */
    public Long getAudioSampleRate() {
        return this.AudioSampleRate;
    }

    /**
     * Set Audio sample rate.
     * @param AudioSampleRate Audio sample rate.
     */
    public void setAudioSampleRate(Long AudioSampleRate) {
        this.AudioSampleRate = AudioSampleRate;
    }

    /**
     * Get Input Only the value defined in AttachedInputs.$.AudioSelectors.$.audioPidSelection.pid. 
     * @return AudioSelectorName Input Only the value defined in AttachedInputs.$.AudioSelectors.$.audioPidSelection.pid.
     */
    public String getAudioSelectorName() {
        return this.AudioSelectorName;
    }

    /**
     * Set Input Only the value defined in AttachedInputs.$.AudioSelectors.$.audioPidSelection.pid.
     * @param AudioSelectorName Input Only the value defined in AttachedInputs.$.AudioSelectors.$.audioPidSelection.pid.
     */
    public void setAudioSelectorName(String AudioSelectorName) {
        this.AudioSelectorName = AudioSelectorName;
    }

    /**
     * Get Audio loudness configuration. 
     * @return AudioNormalization Audio loudness configuration.
     */
    public AudioNormalizationSettings getAudioNormalization() {
        return this.AudioNormalization;
    }

    /**
     * Set Audio loudness configuration.
     * @param AudioNormalization Audio loudness configuration.
     */
    public void setAudioNormalization(AudioNormalizationSettings AudioNormalization) {
        this.AudioNormalization = AudioNormalization;
    }

    /**
     * Get Additional audio mode and sound channel configuration. 
     * @return AudioCodecDetails Additional audio mode and sound channel configuration.
     */
    public AudioCodecDetail getAudioCodecDetails() {
        return this.AudioCodecDetails;
    }

    /**
     * Set Additional audio mode and sound channel configuration.
     * @param AudioCodecDetails Additional audio mode and sound channel configuration.
     */
    public void setAudioCodecDetails(AudioCodecDetail AudioCodecDetails) {
        this.AudioCodecDetails = AudioCodecDetails;
    }

    public AudioTrackInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AudioTrackInfo(AudioTrackInfo source) {
        if (source.TrackName != null) {
            this.TrackName = new String(source.TrackName);
        }
        if (source.AudioCodec != null) {
            this.AudioCodec = new String(source.AudioCodec);
        }
        if (source.AudioBitrate != null) {
            this.AudioBitrate = new Long(source.AudioBitrate);
        }
        if (source.AudioSampleRate != null) {
            this.AudioSampleRate = new Long(source.AudioSampleRate);
        }
        if (source.AudioSelectorName != null) {
            this.AudioSelectorName = new String(source.AudioSelectorName);
        }
        if (source.AudioNormalization != null) {
            this.AudioNormalization = new AudioNormalizationSettings(source.AudioNormalization);
        }
        if (source.AudioCodecDetails != null) {
            this.AudioCodecDetails = new AudioCodecDetail(source.AudioCodecDetails);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TrackName", this.TrackName);
        this.setParamSimple(map, prefix + "AudioCodec", this.AudioCodec);
        this.setParamSimple(map, prefix + "AudioBitrate", this.AudioBitrate);
        this.setParamSimple(map, prefix + "AudioSampleRate", this.AudioSampleRate);
        this.setParamSimple(map, prefix + "AudioSelectorName", this.AudioSelectorName);
        this.setParamObj(map, prefix + "AudioNormalization.", this.AudioNormalization);
        this.setParamObj(map, prefix + "AudioCodecDetails.", this.AudioCodecDetails);

    }
}


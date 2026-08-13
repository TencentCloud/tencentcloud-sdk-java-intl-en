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

public class MediaAudioStreamItem extends AbstractModel {

    /**
    * Bitrate of an audio stream in bps.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * Sample rate of an audio stream in Hz.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SamplingRate")
    @Expose
    private Long SamplingRate;

    /**
    * Audio stream codec, such as aac.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * Number of audio channels, for example 2.
    */
    @SerializedName("Channel")
    @Expose
    private Long Channel;

    /**
    * Audio Codecs.
    */
    @SerializedName("Codecs")
    @Expose
    private String Codecs;

    /**
    * Audio loudness.
    */
    @SerializedName("Loudness")
    @Expose
    private Float Loudness;

    /**
     * Get Bitrate of an audio stream in bps.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Bitrate Bitrate of an audio stream in bps.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set Bitrate of an audio stream in bps.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Bitrate Bitrate of an audio stream in bps.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get Sample rate of an audio stream in Hz.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SamplingRate Sample rate of an audio stream in Hz.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSamplingRate() {
        return this.SamplingRate;
    }

    /**
     * Set Sample rate of an audio stream in Hz.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SamplingRate Sample rate of an audio stream in Hz.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSamplingRate(Long SamplingRate) {
        this.SamplingRate = SamplingRate;
    }

    /**
     * Get Audio stream codec, such as aac.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Codec Audio stream codec, such as aac.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set Audio stream codec, such as aac.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Codec Audio stream codec, such as aac.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get Number of audio channels, for example 2. 
     * @return Channel Number of audio channels, for example 2.
     */
    public Long getChannel() {
        return this.Channel;
    }

    /**
     * Set Number of audio channels, for example 2.
     * @param Channel Number of audio channels, for example 2.
     */
    public void setChannel(Long Channel) {
        this.Channel = Channel;
    }

    /**
     * Get Audio Codecs. 
     * @return Codecs Audio Codecs.
     */
    public String getCodecs() {
        return this.Codecs;
    }

    /**
     * Set Audio Codecs.
     * @param Codecs Audio Codecs.
     */
    public void setCodecs(String Codecs) {
        this.Codecs = Codecs;
    }

    /**
     * Get Audio loudness. 
     * @return Loudness Audio loudness.
     */
    public Float getLoudness() {
        return this.Loudness;
    }

    /**
     * Set Audio loudness.
     * @param Loudness Audio loudness.
     */
    public void setLoudness(Float Loudness) {
        this.Loudness = Loudness;
    }

    public MediaAudioStreamItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaAudioStreamItem(MediaAudioStreamItem source) {
        if (source.Bitrate != null) {
            this.Bitrate = new Long(source.Bitrate);
        }
        if (source.SamplingRate != null) {
            this.SamplingRate = new Long(source.SamplingRate);
        }
        if (source.Codec != null) {
            this.Codec = new String(source.Codec);
        }
        if (source.Channel != null) {
            this.Channel = new Long(source.Channel);
        }
        if (source.Codecs != null) {
            this.Codecs = new String(source.Codecs);
        }
        if (source.Loudness != null) {
            this.Loudness = new Float(source.Loudness);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);
        this.setParamSimple(map, prefix + "SamplingRate", this.SamplingRate);
        this.setParamSimple(map, prefix + "Codec", this.Codec);
        this.setParamSimple(map, prefix + "Channel", this.Channel);
        this.setParamSimple(map, prefix + "Codecs", this.Codecs);
        this.setParamSimple(map, prefix + "Loudness", this.Loudness);

    }
}


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
    * Bitrate of the audio stream. Unit: bps.
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * Sampling rate of the audio stream. Unit: hz.
    */
    @SerializedName("SamplingRate")
    @Expose
    private Long SamplingRate;

    /**
    * Audio stream encoding format, for example, aac.
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * 
    */
    @SerializedName("Channel")
    @Expose
    private Long Channel;

    /**
    * 
    */
    @SerializedName("Codecs")
    @Expose
    private String Codecs;

    /**
    * 
    */
    @SerializedName("Loudness")
    @Expose
    private Float Loudness;

    /**
     * Get Bitrate of the audio stream. Unit: bps. 
     * @return Bitrate Bitrate of the audio stream. Unit: bps.
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set Bitrate of the audio stream. Unit: bps.
     * @param Bitrate Bitrate of the audio stream. Unit: bps.
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get Sampling rate of the audio stream. Unit: hz. 
     * @return SamplingRate Sampling rate of the audio stream. Unit: hz.
     */
    public Long getSamplingRate() {
        return this.SamplingRate;
    }

    /**
     * Set Sampling rate of the audio stream. Unit: hz.
     * @param SamplingRate Sampling rate of the audio stream. Unit: hz.
     */
    public void setSamplingRate(Long SamplingRate) {
        this.SamplingRate = SamplingRate;
    }

    /**
     * Get Audio stream encoding format, for example, aac. 
     * @return Codec Audio stream encoding format, for example, aac.
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set Audio stream encoding format, for example, aac.
     * @param Codec Audio stream encoding format, for example, aac.
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get  
     * @return Channel 
     */
    public Long getChannel() {
        return this.Channel;
    }

    /**
     * Set 
     * @param Channel 
     */
    public void setChannel(Long Channel) {
        this.Channel = Channel;
    }

    /**
     * Get  
     * @return Codecs 
     */
    public String getCodecs() {
        return this.Codecs;
    }

    /**
     * Set 
     * @param Codecs 
     */
    public void setCodecs(String Codecs) {
        this.Codecs = Codecs;
    }

    /**
     * Get  
     * @return Loudness 
     */
    public Float getLoudness() {
        return this.Loudness;
    }

    /**
     * Set 
     * @param Loudness 
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


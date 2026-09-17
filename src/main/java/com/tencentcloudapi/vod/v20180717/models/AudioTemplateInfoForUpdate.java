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
    * 
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * 
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * 
    */
    @SerializedName("SampleRate")
    @Expose
    private Long SampleRate;

    /**
    * 
    */
    @SerializedName("AudioChannel")
    @Expose
    private Long AudioChannel;

    /**
    * 
    */
    @SerializedName("StreamSelects")
    @Expose
    private Long [] StreamSelects;

    /**
     * Get  
     * @return Codec 
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set 
     * @param Codec 
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get  
     * @return Bitrate 
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set 
     * @param Bitrate 
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get  
     * @return SampleRate 
     */
    public Long getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set 
     * @param SampleRate 
     */
    public void setSampleRate(Long SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * Get  
     * @return AudioChannel 
     */
    public Long getAudioChannel() {
        return this.AudioChannel;
    }

    /**
     * Set 
     * @param AudioChannel 
     */
    public void setAudioChannel(Long AudioChannel) {
        this.AudioChannel = AudioChannel;
    }

    /**
     * Get  
     * @return StreamSelects 
     */
    public Long [] getStreamSelects() {
        return this.StreamSelects;
    }

    /**
     * Set 
     * @param StreamSelects 
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


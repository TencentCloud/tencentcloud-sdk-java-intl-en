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

public class MediaAudioStreamItem extends AbstractModel {

    /**
    * <p>Bitrate of the audio stream. Measurement unit: bps.</p>
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * <p>Sampling rate of the audio stream, unit: hz.</p>
    */
    @SerializedName("SamplingRate")
    @Expose
    private Long SamplingRate;

    /**
    * <p>Audio stream encoding format, such as aac.</p>
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
     * Get <p>Bitrate of the audio stream. Measurement unit: bps.</p> 
     * @return Bitrate <p>Bitrate of the audio stream. Measurement unit: bps.</p>
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set <p>Bitrate of the audio stream. Measurement unit: bps.</p>
     * @param Bitrate <p>Bitrate of the audio stream. Measurement unit: bps.</p>
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get <p>Sampling rate of the audio stream, unit: hz.</p> 
     * @return SamplingRate <p>Sampling rate of the audio stream, unit: hz.</p>
     */
    public Long getSamplingRate() {
        return this.SamplingRate;
    }

    /**
     * Set <p>Sampling rate of the audio stream, unit: hz.</p>
     * @param SamplingRate <p>Sampling rate of the audio stream, unit: hz.</p>
     */
    public void setSamplingRate(Long SamplingRate) {
        this.SamplingRate = SamplingRate;
    }

    /**
     * Get <p>Audio stream encoding format, such as aac.</p> 
     * @return Codec <p>Audio stream encoding format, such as aac.</p>
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set <p>Audio stream encoding format, such as aac.</p>
     * @param Codec <p>Audio stream encoding format, such as aac.</p>
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);
        this.setParamSimple(map, prefix + "SamplingRate", this.SamplingRate);
        this.setParamSimple(map, prefix + "Codec", this.Codec);

    }
}


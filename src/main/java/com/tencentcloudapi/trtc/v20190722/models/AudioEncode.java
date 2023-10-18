/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AudioEncode extends AbstractModel {

    /**
    * The audio sample rate (Hz). Valid values: 48000, 44100, 32000, 24000, 16000, 8000.
    */
    @SerializedName("SampleRate")
    @Expose
    private Long SampleRate;

    /**
    * The number of sound channels. Valid values: 1 (mono), 2 (dual).
    */
    @SerializedName("Channel")
    @Expose
    private Long Channel;

    /**
    * The audio bitrate (Kbps). Value range: 8-500.
    */
    @SerializedName("BitRate")
    @Expose
    private Long BitRate;

    /**
    * The audio codec. Valid values: 0 (LC-AAC), 1 (HE-AAC), 2 (HE-AACv2). The default value is 0. If this parameter is set to 2, `Channel` must be 2. If it is set to 1 or 2, `SampleRate` can only be 48000, 44100, 32000, 24000, or 16000.
    */
    @SerializedName("Codec")
    @Expose
    private Long Codec;

    /**
     * Get The audio sample rate (Hz). Valid values: 48000, 44100, 32000, 24000, 16000, 8000. 
     * @return SampleRate The audio sample rate (Hz). Valid values: 48000, 44100, 32000, 24000, 16000, 8000.
     */
    public Long getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set The audio sample rate (Hz). Valid values: 48000, 44100, 32000, 24000, 16000, 8000.
     * @param SampleRate The audio sample rate (Hz). Valid values: 48000, 44100, 32000, 24000, 16000, 8000.
     */
    public void setSampleRate(Long SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * Get The number of sound channels. Valid values: 1 (mono), 2 (dual). 
     * @return Channel The number of sound channels. Valid values: 1 (mono), 2 (dual).
     */
    public Long getChannel() {
        return this.Channel;
    }

    /**
     * Set The number of sound channels. Valid values: 1 (mono), 2 (dual).
     * @param Channel The number of sound channels. Valid values: 1 (mono), 2 (dual).
     */
    public void setChannel(Long Channel) {
        this.Channel = Channel;
    }

    /**
     * Get The audio bitrate (Kbps). Value range: 8-500. 
     * @return BitRate The audio bitrate (Kbps). Value range: 8-500.
     */
    public Long getBitRate() {
        return this.BitRate;
    }

    /**
     * Set The audio bitrate (Kbps). Value range: 8-500.
     * @param BitRate The audio bitrate (Kbps). Value range: 8-500.
     */
    public void setBitRate(Long BitRate) {
        this.BitRate = BitRate;
    }

    /**
     * Get The audio codec. Valid values: 0 (LC-AAC), 1 (HE-AAC), 2 (HE-AACv2). The default value is 0. If this parameter is set to 2, `Channel` must be 2. If it is set to 1 or 2, `SampleRate` can only be 48000, 44100, 32000, 24000, or 16000. 
     * @return Codec The audio codec. Valid values: 0 (LC-AAC), 1 (HE-AAC), 2 (HE-AACv2). The default value is 0. If this parameter is set to 2, `Channel` must be 2. If it is set to 1 or 2, `SampleRate` can only be 48000, 44100, 32000, 24000, or 16000.
     */
    public Long getCodec() {
        return this.Codec;
    }

    /**
     * Set The audio codec. Valid values: 0 (LC-AAC), 1 (HE-AAC), 2 (HE-AACv2). The default value is 0. If this parameter is set to 2, `Channel` must be 2. If it is set to 1 or 2, `SampleRate` can only be 48000, 44100, 32000, 24000, or 16000.
     * @param Codec The audio codec. Valid values: 0 (LC-AAC), 1 (HE-AAC), 2 (HE-AACv2). The default value is 0. If this parameter is set to 2, `Channel` must be 2. If it is set to 1 or 2, `SampleRate` can only be 48000, 44100, 32000, 24000, or 16000.
     */
    public void setCodec(Long Codec) {
        this.Codec = Codec;
    }

    public AudioEncode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AudioEncode(AudioEncode source) {
        if (source.SampleRate != null) {
            this.SampleRate = new Long(source.SampleRate);
        }
        if (source.Channel != null) {
            this.Channel = new Long(source.Channel);
        }
        if (source.BitRate != null) {
            this.BitRate = new Long(source.BitRate);
        }
        if (source.Codec != null) {
            this.Codec = new Long(source.Codec);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SampleRate", this.SampleRate);
        this.setParamSimple(map, prefix + "Channel", this.Channel);
        this.setParamSimple(map, prefix + "BitRate", this.BitRate);
        this.setParamSimple(map, prefix + "Codec", this.Codec);

    }
}


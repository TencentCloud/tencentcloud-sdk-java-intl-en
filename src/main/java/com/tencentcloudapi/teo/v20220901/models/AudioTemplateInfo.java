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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AudioTemplateInfo extends AbstractModel {

    /**
    * Encoding format for audio streams. optional values:.
<li>libfdk_aac.</li>
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * Audio channel quantity. valid values: <li>2: dual-channel.</li> default value: 2.
    */
    @SerializedName("AudioChannel")
    @Expose
    private Long AudioChannel;

    /**
     * Get Encoding format for audio streams. optional values:.
<li>libfdk_aac.</li> 
     * @return Codec Encoding format for audio streams. optional values:.
<li>libfdk_aac.</li>
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set Encoding format for audio streams. optional values:.
<li>libfdk_aac.</li>
     * @param Codec Encoding format for audio streams. optional values:.
<li>libfdk_aac.</li>
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get Audio channel quantity. valid values: <li>2: dual-channel.</li> default value: 2. 
     * @return AudioChannel Audio channel quantity. valid values: <li>2: dual-channel.</li> default value: 2.
     */
    public Long getAudioChannel() {
        return this.AudioChannel;
    }

    /**
     * Set Audio channel quantity. valid values: <li>2: dual-channel.</li> default value: 2.
     * @param AudioChannel Audio channel quantity. valid values: <li>2: dual-channel.</li> default value: 2.
     */
    public void setAudioChannel(Long AudioChannel) {
        this.AudioChannel = AudioChannel;
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
        if (source.AudioChannel != null) {
            this.AudioChannel = new Long(source.AudioChannel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Codec", this.Codec);
        this.setParamSimple(map, prefix + "AudioChannel", this.AudioChannel);

    }
}


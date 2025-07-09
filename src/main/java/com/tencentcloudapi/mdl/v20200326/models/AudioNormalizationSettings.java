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

public class AudioNormalizationSettings extends AbstractModel {

    /**
    * Whether to enable special configuration for audio transcoding: 1: Enable 0: Disable, the default value is 0.
    */
    @SerializedName("AudioNormalizationEnabled")
    @Expose
    private Long AudioNormalizationEnabled;

    /**
    * Loudness value, floating-point number, rounded to one decimal place, range -5 to -70.
    */
    @SerializedName("TargetLUFS")
    @Expose
    private Float TargetLUFS;

    /**
     * Get Whether to enable special configuration for audio transcoding: 1: Enable 0: Disable, the default value is 0. 
     * @return AudioNormalizationEnabled Whether to enable special configuration for audio transcoding: 1: Enable 0: Disable, the default value is 0.
     */
    public Long getAudioNormalizationEnabled() {
        return this.AudioNormalizationEnabled;
    }

    /**
     * Set Whether to enable special configuration for audio transcoding: 1: Enable 0: Disable, the default value is 0.
     * @param AudioNormalizationEnabled Whether to enable special configuration for audio transcoding: 1: Enable 0: Disable, the default value is 0.
     */
    public void setAudioNormalizationEnabled(Long AudioNormalizationEnabled) {
        this.AudioNormalizationEnabled = AudioNormalizationEnabled;
    }

    /**
     * Get Loudness value, floating-point number, rounded to one decimal place, range -5 to -70. 
     * @return TargetLUFS Loudness value, floating-point number, rounded to one decimal place, range -5 to -70.
     */
    public Float getTargetLUFS() {
        return this.TargetLUFS;
    }

    /**
     * Set Loudness value, floating-point number, rounded to one decimal place, range -5 to -70.
     * @param TargetLUFS Loudness value, floating-point number, rounded to one decimal place, range -5 to -70.
     */
    public void setTargetLUFS(Float TargetLUFS) {
        this.TargetLUFS = TargetLUFS;
    }

    public AudioNormalizationSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AudioNormalizationSettings(AudioNormalizationSettings source) {
        if (source.AudioNormalizationEnabled != null) {
            this.AudioNormalizationEnabled = new Long(source.AudioNormalizationEnabled);
        }
        if (source.TargetLUFS != null) {
            this.TargetLUFS = new Float(source.TargetLUFS);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AudioNormalizationEnabled", this.AudioNormalizationEnabled);
        this.setParamSimple(map, prefix + "TargetLUFS", this.TargetLUFS);

    }
}


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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AudioNormalizationSettings extends AbstractModel {

    /**
    * 
    */
    @SerializedName("AudioNormalizationEnabled")
    @Expose
    private Long AudioNormalizationEnabled;

    /**
    * 
    */
    @SerializedName("TargetLUFS")
    @Expose
    private Float TargetLUFS;

    /**
     * Get  
     * @return AudioNormalizationEnabled 
     */
    public Long getAudioNormalizationEnabled() {
        return this.AudioNormalizationEnabled;
    }

    /**
     * Set 
     * @param AudioNormalizationEnabled 
     */
    public void setAudioNormalizationEnabled(Long AudioNormalizationEnabled) {
        this.AudioNormalizationEnabled = AudioNormalizationEnabled;
    }

    /**
     * Get  
     * @return TargetLUFS 
     */
    public Float getTargetLUFS() {
        return this.TargetLUFS;
    }

    /**
     * Set 
     * @param TargetLUFS 
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


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

public class AudioVolumeParam extends AbstractModel {

    /**
    * Whether to mute. Value range: 0 or 1.
<li>0 means unmuted.</li>
<li>1 means mute.</li>
The default value is 0.
    */
    @SerializedName("Mute")
    @Expose
    private Long Mute;

    /**
    * Audio gain. Value range: 0-10.
<li>A value greater than 1 means increasing the volume.</li>
<li>Less than 1 means low volume.</li>
<li>0 and 1: means do not change.</li>
The default value is 0.
    */
    @SerializedName("Gain")
    @Expose
    private Float Gain;

    /**
     * Get Whether to mute. Value range: 0 or 1.
<li>0 means unmuted.</li>
<li>1 means mute.</li>
The default value is 0. 
     * @return Mute Whether to mute. Value range: 0 or 1.
<li>0 means unmuted.</li>
<li>1 means mute.</li>
The default value is 0.
     */
    public Long getMute() {
        return this.Mute;
    }

    /**
     * Set Whether to mute. Value range: 0 or 1.
<li>0 means unmuted.</li>
<li>1 means mute.</li>
The default value is 0.
     * @param Mute Whether to mute. Value range: 0 or 1.
<li>0 means unmuted.</li>
<li>1 means mute.</li>
The default value is 0.
     */
    public void setMute(Long Mute) {
        this.Mute = Mute;
    }

    /**
     * Get Audio gain. Value range: 0-10.
<li>A value greater than 1 means increasing the volume.</li>
<li>Less than 1 means low volume.</li>
<li>0 and 1: means do not change.</li>
The default value is 0. 
     * @return Gain Audio gain. Value range: 0-10.
<li>A value greater than 1 means increasing the volume.</li>
<li>Less than 1 means low volume.</li>
<li>0 and 1: means do not change.</li>
The default value is 0.
     */
    public Float getGain() {
        return this.Gain;
    }

    /**
     * Set Audio gain. Value range: 0-10.
<li>A value greater than 1 means increasing the volume.</li>
<li>Less than 1 means low volume.</li>
<li>0 and 1: means do not change.</li>
The default value is 0.
     * @param Gain Audio gain. Value range: 0-10.
<li>A value greater than 1 means increasing the volume.</li>
<li>Less than 1 means low volume.</li>
<li>0 and 1: means do not change.</li>
The default value is 0.
     */
    public void setGain(Float Gain) {
        this.Gain = Gain;
    }

    public AudioVolumeParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AudioVolumeParam(AudioVolumeParam source) {
        if (source.Mute != null) {
            this.Mute = new Long(source.Mute);
        }
        if (source.Gain != null) {
            this.Gain = new Float(source.Gain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mute", this.Mute);
        this.setParamSimple(map, prefix + "Gain", this.Gain);

    }
}


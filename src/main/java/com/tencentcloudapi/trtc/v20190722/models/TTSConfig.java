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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TTSConfig extends AbstractModel {

    /**
    * Voice type ID.
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
    * TTS model: flow_01_turbo is selected by default. options: [flow_01_turbo, flow_01_ex].
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * Speaking rate. value range: 0.5-2.0. default: 1.0.
    */
    @SerializedName("Speed")
    @Expose
    private Float Speed;

    /**
    * Value range: (0, 10]. default value: 1.0.
    */
    @SerializedName("Volume")
    @Expose
    private Float Volume;

    /**
     * Get Voice type ID. 
     * @return VoiceId Voice type ID.
     */
    public String getVoiceId() {
        return this.VoiceId;
    }

    /**
     * Set Voice type ID.
     * @param VoiceId Voice type ID.
     */
    public void setVoiceId(String VoiceId) {
        this.VoiceId = VoiceId;
    }

    /**
     * Get TTS model: flow_01_turbo is selected by default. options: [flow_01_turbo, flow_01_ex]. 
     * @return Model TTS model: flow_01_turbo is selected by default. options: [flow_01_turbo, flow_01_ex].
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set TTS model: flow_01_turbo is selected by default. options: [flow_01_turbo, flow_01_ex].
     * @param Model TTS model: flow_01_turbo is selected by default. options: [flow_01_turbo, flow_01_ex].
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get Speaking rate. value range: 0.5-2.0. default: 1.0. 
     * @return Speed Speaking rate. value range: 0.5-2.0. default: 1.0.
     */
    public Float getSpeed() {
        return this.Speed;
    }

    /**
     * Set Speaking rate. value range: 0.5-2.0. default: 1.0.
     * @param Speed Speaking rate. value range: 0.5-2.0. default: 1.0.
     */
    public void setSpeed(Float Speed) {
        this.Speed = Speed;
    }

    /**
     * Get Value range: (0, 10]. default value: 1.0. 
     * @return Volume Value range: (0, 10]. default value: 1.0.
     */
    public Float getVolume() {
        return this.Volume;
    }

    /**
     * Set Value range: (0, 10]. default value: 1.0.
     * @param Volume Value range: (0, 10]. default value: 1.0.
     */
    public void setVolume(Float Volume) {
        this.Volume = Volume;
    }

    public TTSConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TTSConfig(TTSConfig source) {
        if (source.VoiceId != null) {
            this.VoiceId = new String(source.VoiceId);
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.Speed != null) {
            this.Speed = new Float(source.Speed);
        }
        if (source.Volume != null) {
            this.Volume = new Float(source.Volume);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VoiceId", this.VoiceId);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "Speed", this.Speed);
        this.setParamSimple(map, prefix + "Volume", this.Volume);

    }
}


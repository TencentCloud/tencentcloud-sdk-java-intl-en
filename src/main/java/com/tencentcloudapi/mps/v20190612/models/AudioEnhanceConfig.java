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

public class AudioEnhanceConfig extends AbstractModel {

    /**
    * <p>Audio noise reduction configuration.</p>
    */
    @SerializedName("Denoise")
    @Expose
    private AudioDenoiseConfig Denoise;

    /**
    * <p>Audio separation configuration.</p>
    */
    @SerializedName("Separate")
    @Expose
    private AudioSeparateConfig Separate;

    /**
    * <p>Volume equalization configuration.</p>
    */
    @SerializedName("VolumeBalance")
    @Expose
    private VolumeBalanceConfig VolumeBalance;

    /**
    * <p>Audio improvement configuration.</p>
    */
    @SerializedName("Beautify")
    @Expose
    private AudioBeautifyConfig Beautify;

    /**
    * <p>Audio enhancement edit.</p>
    */
    @SerializedName("AudioEnhanceEdit")
    @Expose
    private AudioEnhanceEditConfig AudioEnhanceEdit;

    /**
     * Get <p>Audio noise reduction configuration.</p> 
     * @return Denoise <p>Audio noise reduction configuration.</p>
     */
    public AudioDenoiseConfig getDenoise() {
        return this.Denoise;
    }

    /**
     * Set <p>Audio noise reduction configuration.</p>
     * @param Denoise <p>Audio noise reduction configuration.</p>
     */
    public void setDenoise(AudioDenoiseConfig Denoise) {
        this.Denoise = Denoise;
    }

    /**
     * Get <p>Audio separation configuration.</p> 
     * @return Separate <p>Audio separation configuration.</p>
     */
    public AudioSeparateConfig getSeparate() {
        return this.Separate;
    }

    /**
     * Set <p>Audio separation configuration.</p>
     * @param Separate <p>Audio separation configuration.</p>
     */
    public void setSeparate(AudioSeparateConfig Separate) {
        this.Separate = Separate;
    }

    /**
     * Get <p>Volume equalization configuration.</p> 
     * @return VolumeBalance <p>Volume equalization configuration.</p>
     */
    public VolumeBalanceConfig getVolumeBalance() {
        return this.VolumeBalance;
    }

    /**
     * Set <p>Volume equalization configuration.</p>
     * @param VolumeBalance <p>Volume equalization configuration.</p>
     */
    public void setVolumeBalance(VolumeBalanceConfig VolumeBalance) {
        this.VolumeBalance = VolumeBalance;
    }

    /**
     * Get <p>Audio improvement configuration.</p> 
     * @return Beautify <p>Audio improvement configuration.</p>
     */
    public AudioBeautifyConfig getBeautify() {
        return this.Beautify;
    }

    /**
     * Set <p>Audio improvement configuration.</p>
     * @param Beautify <p>Audio improvement configuration.</p>
     */
    public void setBeautify(AudioBeautifyConfig Beautify) {
        this.Beautify = Beautify;
    }

    /**
     * Get <p>Audio enhancement edit.</p> 
     * @return AudioEnhanceEdit <p>Audio enhancement edit.</p>
     */
    public AudioEnhanceEditConfig getAudioEnhanceEdit() {
        return this.AudioEnhanceEdit;
    }

    /**
     * Set <p>Audio enhancement edit.</p>
     * @param AudioEnhanceEdit <p>Audio enhancement edit.</p>
     */
    public void setAudioEnhanceEdit(AudioEnhanceEditConfig AudioEnhanceEdit) {
        this.AudioEnhanceEdit = AudioEnhanceEdit;
    }

    public AudioEnhanceConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AudioEnhanceConfig(AudioEnhanceConfig source) {
        if (source.Denoise != null) {
            this.Denoise = new AudioDenoiseConfig(source.Denoise);
        }
        if (source.Separate != null) {
            this.Separate = new AudioSeparateConfig(source.Separate);
        }
        if (source.VolumeBalance != null) {
            this.VolumeBalance = new VolumeBalanceConfig(source.VolumeBalance);
        }
        if (source.Beautify != null) {
            this.Beautify = new AudioBeautifyConfig(source.Beautify);
        }
        if (source.AudioEnhanceEdit != null) {
            this.AudioEnhanceEdit = new AudioEnhanceEditConfig(source.AudioEnhanceEdit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Denoise.", this.Denoise);
        this.setParamObj(map, prefix + "Separate.", this.Separate);
        this.setParamObj(map, prefix + "VolumeBalance.", this.VolumeBalance);
        this.setParamObj(map, prefix + "Beautify.", this.Beautify);
        this.setParamObj(map, prefix + "AudioEnhanceEdit.", this.AudioEnhanceEdit);

    }
}


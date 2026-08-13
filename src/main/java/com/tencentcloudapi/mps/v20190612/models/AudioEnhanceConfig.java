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
    * Audio noise reduction configuration.
    */
    @SerializedName("Denoise")
    @Expose
    private AudioDenoiseConfig Denoise;

    /**
    * Audio separation configuration.
    */
    @SerializedName("Separate")
    @Expose
    private AudioSeparateConfig Separate;

    /**
    * Volume equalization configuration.
    */
    @SerializedName("VolumeBalance")
    @Expose
    private VolumeBalanceConfig VolumeBalance;

    /**
    * Audio beautification configuration.
    */
    @SerializedName("Beautify")
    @Expose
    private AudioBeautifyConfig Beautify;

    /**
     * Get Audio noise reduction configuration. 
     * @return Denoise Audio noise reduction configuration.
     */
    public AudioDenoiseConfig getDenoise() {
        return this.Denoise;
    }

    /**
     * Set Audio noise reduction configuration.
     * @param Denoise Audio noise reduction configuration.
     */
    public void setDenoise(AudioDenoiseConfig Denoise) {
        this.Denoise = Denoise;
    }

    /**
     * Get Audio separation configuration. 
     * @return Separate Audio separation configuration.
     */
    public AudioSeparateConfig getSeparate() {
        return this.Separate;
    }

    /**
     * Set Audio separation configuration.
     * @param Separate Audio separation configuration.
     */
    public void setSeparate(AudioSeparateConfig Separate) {
        this.Separate = Separate;
    }

    /**
     * Get Volume equalization configuration. 
     * @return VolumeBalance Volume equalization configuration.
     */
    public VolumeBalanceConfig getVolumeBalance() {
        return this.VolumeBalance;
    }

    /**
     * Set Volume equalization configuration.
     * @param VolumeBalance Volume equalization configuration.
     */
    public void setVolumeBalance(VolumeBalanceConfig VolumeBalance) {
        this.VolumeBalance = VolumeBalance;
    }

    /**
     * Get Audio beautification configuration. 
     * @return Beautify Audio beautification configuration.
     */
    public AudioBeautifyConfig getBeautify() {
        return this.Beautify;
    }

    /**
     * Set Audio beautification configuration.
     * @param Beautify Audio beautification configuration.
     */
    public void setBeautify(AudioBeautifyConfig Beautify) {
        this.Beautify = Beautify;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Denoise.", this.Denoise);
        this.setParamObj(map, prefix + "Separate.", this.Separate);
        this.setParamObj(map, prefix + "VolumeBalance.", this.VolumeBalance);
        this.setParamObj(map, prefix + "Beautify.", this.Beautify);

    }
}


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

public class AudioEnhanceConfig extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Denoise")
    @Expose
    private AudioDenoiseInfo Denoise;

    /**
    * 
    */
    @SerializedName("Separate")
    @Expose
    private AudioSeparateInfo Separate;

    /**
    * 
    */
    @SerializedName("VolumeBalance")
    @Expose
    private AudioVolumeBalanceInfo VolumeBalance;

    /**
    * 
    */
    @SerializedName("Beautify")
    @Expose
    private AudioBeautifyInfo Beautify;

    /**
     * Get  
     * @return Denoise 
     */
    public AudioDenoiseInfo getDenoise() {
        return this.Denoise;
    }

    /**
     * Set 
     * @param Denoise 
     */
    public void setDenoise(AudioDenoiseInfo Denoise) {
        this.Denoise = Denoise;
    }

    /**
     * Get  
     * @return Separate 
     */
    public AudioSeparateInfo getSeparate() {
        return this.Separate;
    }

    /**
     * Set 
     * @param Separate 
     */
    public void setSeparate(AudioSeparateInfo Separate) {
        this.Separate = Separate;
    }

    /**
     * Get  
     * @return VolumeBalance 
     */
    public AudioVolumeBalanceInfo getVolumeBalance() {
        return this.VolumeBalance;
    }

    /**
     * Set 
     * @param VolumeBalance 
     */
    public void setVolumeBalance(AudioVolumeBalanceInfo VolumeBalance) {
        this.VolumeBalance = VolumeBalance;
    }

    /**
     * Get  
     * @return Beautify 
     */
    public AudioBeautifyInfo getBeautify() {
        return this.Beautify;
    }

    /**
     * Set 
     * @param Beautify 
     */
    public void setBeautify(AudioBeautifyInfo Beautify) {
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
            this.Denoise = new AudioDenoiseInfo(source.Denoise);
        }
        if (source.Separate != null) {
            this.Separate = new AudioSeparateInfo(source.Separate);
        }
        if (source.VolumeBalance != null) {
            this.VolumeBalance = new AudioVolumeBalanceInfo(source.VolumeBalance);
        }
        if (source.Beautify != null) {
            this.Beautify = new AudioBeautifyInfo(source.Beautify);
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


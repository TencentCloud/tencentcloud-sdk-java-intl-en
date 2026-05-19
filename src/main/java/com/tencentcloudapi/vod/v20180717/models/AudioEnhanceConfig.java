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
    * Audio noise reduction configuration.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Denoise")
    @Expose
    private AudioDenoiseInfo Denoise;

    /**
    * Audio separation configuration.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Separate")
    @Expose
    private AudioSeparateInfo Separate;

    /**
    * Volume equalization configuration.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VolumeBalance")
    @Expose
    private AudioVolumeBalanceInfo VolumeBalance;

    /**
    * Volume beautification configuration.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Beautify")
    @Expose
    private AudioBeautifyInfo Beautify;

    /**
     * Get Audio noise reduction configuration.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Denoise Audio noise reduction configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AudioDenoiseInfo getDenoise() {
        return this.Denoise;
    }

    /**
     * Set Audio noise reduction configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Denoise Audio noise reduction configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDenoise(AudioDenoiseInfo Denoise) {
        this.Denoise = Denoise;
    }

    /**
     * Get Audio separation configuration.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Separate Audio separation configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AudioSeparateInfo getSeparate() {
        return this.Separate;
    }

    /**
     * Set Audio separation configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Separate Audio separation configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSeparate(AudioSeparateInfo Separate) {
        this.Separate = Separate;
    }

    /**
     * Get Volume equalization configuration.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VolumeBalance Volume equalization configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AudioVolumeBalanceInfo getVolumeBalance() {
        return this.VolumeBalance;
    }

    /**
     * Set Volume equalization configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VolumeBalance Volume equalization configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVolumeBalance(AudioVolumeBalanceInfo VolumeBalance) {
        this.VolumeBalance = VolumeBalance;
    }

    /**
     * Get Volume beautification configuration.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Beautify Volume beautification configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AudioBeautifyInfo getBeautify() {
        return this.Beautify;
    }

    /**
     * Set Volume beautification configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Beautify Volume beautification configuration.
Note: This field may return null, indicating that no valid values can be obtained.
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


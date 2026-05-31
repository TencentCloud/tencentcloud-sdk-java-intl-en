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

public class VideoCodecDetail extends AbstractModel {

    /**
    * Three image quality levels for H264, options include: BASELINE, HIGH, MAIN. The default option is MAIN.
    */
    @SerializedName("Profile")
    @Expose
    private String Profile;

    /**
    * Decoding performance of the profile. Options include 1, 1.1, 1.2, 1.3, 2, 2.1, 2.2, 2.3, 3, 3.1, 3.2, 4, 4.1, 4.2, 5, 5.1, AUTO. The default option is AUTO.
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * Encoding/decoding includes entropy encoding and lossless encoding. Options include CABAC and CAVLC. The default option is CABAC.
    */
    @SerializedName("EntropyEncoding")
    @Expose
    private String EntropyEncoding;

    /**
    * Mode, options include: AUTO, HIGH, HIGHER, LOW, MAX, MEDIUM, OFF. Default option: AUTO.
    */
    @SerializedName("AdaptiveQuantization")
    @Expose
    private String AdaptiveQuantization;

    /**
    * Analyze subsequent coding frames in advance. Options include HIGH, LOW, and MEDIUM. Default option is MEDIUM.
    */
    @SerializedName("LookAheadRateControl")
    @Expose
    private String LookAheadRateControl;

    /**
     * Get Three image quality levels for H264, options include: BASELINE, HIGH, MAIN. The default option is MAIN. 
     * @return Profile Three image quality levels for H264, options include: BASELINE, HIGH, MAIN. The default option is MAIN.
     */
    public String getProfile() {
        return this.Profile;
    }

    /**
     * Set Three image quality levels for H264, options include: BASELINE, HIGH, MAIN. The default option is MAIN.
     * @param Profile Three image quality levels for H264, options include: BASELINE, HIGH, MAIN. The default option is MAIN.
     */
    public void setProfile(String Profile) {
        this.Profile = Profile;
    }

    /**
     * Get Decoding performance of the profile. Options include 1, 1.1, 1.2, 1.3, 2, 2.1, 2.2, 2.3, 3, 3.1, 3.2, 4, 4.1, 4.2, 5, 5.1, AUTO. The default option is AUTO. 
     * @return Level Decoding performance of the profile. Options include 1, 1.1, 1.2, 1.3, 2, 2.1, 2.2, 2.3, 3, 3.1, 3.2, 4, 4.1, 4.2, 5, 5.1, AUTO. The default option is AUTO.
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set Decoding performance of the profile. Options include 1, 1.1, 1.2, 1.3, 2, 2.1, 2.2, 2.3, 3, 3.1, 3.2, 4, 4.1, 4.2, 5, 5.1, AUTO. The default option is AUTO.
     * @param Level Decoding performance of the profile. Options include 1, 1.1, 1.2, 1.3, 2, 2.1, 2.2, 2.3, 3, 3.1, 3.2, 4, 4.1, 4.2, 5, 5.1, AUTO. The default option is AUTO.
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get Encoding/decoding includes entropy encoding and lossless encoding. Options include CABAC and CAVLC. The default option is CABAC. 
     * @return EntropyEncoding Encoding/decoding includes entropy encoding and lossless encoding. Options include CABAC and CAVLC. The default option is CABAC.
     */
    public String getEntropyEncoding() {
        return this.EntropyEncoding;
    }

    /**
     * Set Encoding/decoding includes entropy encoding and lossless encoding. Options include CABAC and CAVLC. The default option is CABAC.
     * @param EntropyEncoding Encoding/decoding includes entropy encoding and lossless encoding. Options include CABAC and CAVLC. The default option is CABAC.
     */
    public void setEntropyEncoding(String EntropyEncoding) {
        this.EntropyEncoding = EntropyEncoding;
    }

    /**
     * Get Mode, options include: AUTO, HIGH, HIGHER, LOW, MAX, MEDIUM, OFF. Default option: AUTO. 
     * @return AdaptiveQuantization Mode, options include: AUTO, HIGH, HIGHER, LOW, MAX, MEDIUM, OFF. Default option: AUTO.
     */
    public String getAdaptiveQuantization() {
        return this.AdaptiveQuantization;
    }

    /**
     * Set Mode, options include: AUTO, HIGH, HIGHER, LOW, MAX, MEDIUM, OFF. Default option: AUTO.
     * @param AdaptiveQuantization Mode, options include: AUTO, HIGH, HIGHER, LOW, MAX, MEDIUM, OFF. Default option: AUTO.
     */
    public void setAdaptiveQuantization(String AdaptiveQuantization) {
        this.AdaptiveQuantization = AdaptiveQuantization;
    }

    /**
     * Get Analyze subsequent coding frames in advance. Options include HIGH, LOW, and MEDIUM. Default option is MEDIUM. 
     * @return LookAheadRateControl Analyze subsequent coding frames in advance. Options include HIGH, LOW, and MEDIUM. Default option is MEDIUM.
     */
    public String getLookAheadRateControl() {
        return this.LookAheadRateControl;
    }

    /**
     * Set Analyze subsequent coding frames in advance. Options include HIGH, LOW, and MEDIUM. Default option is MEDIUM.
     * @param LookAheadRateControl Analyze subsequent coding frames in advance. Options include HIGH, LOW, and MEDIUM. Default option is MEDIUM.
     */
    public void setLookAheadRateControl(String LookAheadRateControl) {
        this.LookAheadRateControl = LookAheadRateControl;
    }

    public VideoCodecDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoCodecDetail(VideoCodecDetail source) {
        if (source.Profile != null) {
            this.Profile = new String(source.Profile);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.EntropyEncoding != null) {
            this.EntropyEncoding = new String(source.EntropyEncoding);
        }
        if (source.AdaptiveQuantization != null) {
            this.AdaptiveQuantization = new String(source.AdaptiveQuantization);
        }
        if (source.LookAheadRateControl != null) {
            this.LookAheadRateControl = new String(source.LookAheadRateControl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Profile", this.Profile);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "EntropyEncoding", this.EntropyEncoding);
        this.setParamSimple(map, prefix + "AdaptiveQuantization", this.AdaptiveQuantization);
        this.setParamSimple(map, prefix + "LookAheadRateControl", this.LookAheadRateControl);

    }
}


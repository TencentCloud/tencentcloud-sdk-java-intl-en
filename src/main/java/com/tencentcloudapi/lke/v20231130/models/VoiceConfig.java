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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VoiceConfig extends AbstractModel {

    /**
    * Public Cloud Timbre ID
    */
    @SerializedName("VoiceType")
    @Expose
    private Long VoiceType;

    /**
    * Timbre Key
    */
    @SerializedName("TimbreKey")
    @Expose
    private String TimbreKey;

    /**
    * Timbre Name
    */
    @SerializedName("VoiceName")
    @Expose
    private String VoiceName;

    /**
     * Get Public Cloud Timbre ID 
     * @return VoiceType Public Cloud Timbre ID
     */
    public Long getVoiceType() {
        return this.VoiceType;
    }

    /**
     * Set Public Cloud Timbre ID
     * @param VoiceType Public Cloud Timbre ID
     */
    public void setVoiceType(Long VoiceType) {
        this.VoiceType = VoiceType;
    }

    /**
     * Get Timbre Key 
     * @return TimbreKey Timbre Key
     */
    public String getTimbreKey() {
        return this.TimbreKey;
    }

    /**
     * Set Timbre Key
     * @param TimbreKey Timbre Key
     */
    public void setTimbreKey(String TimbreKey) {
        this.TimbreKey = TimbreKey;
    }

    /**
     * Get Timbre Name 
     * @return VoiceName Timbre Name
     */
    public String getVoiceName() {
        return this.VoiceName;
    }

    /**
     * Set Timbre Name
     * @param VoiceName Timbre Name
     */
    public void setVoiceName(String VoiceName) {
        this.VoiceName = VoiceName;
    }

    public VoiceConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VoiceConfig(VoiceConfig source) {
        if (source.VoiceType != null) {
            this.VoiceType = new Long(source.VoiceType);
        }
        if (source.TimbreKey != null) {
            this.TimbreKey = new String(source.TimbreKey);
        }
        if (source.VoiceName != null) {
            this.VoiceName = new String(source.VoiceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VoiceType", this.VoiceType);
        this.setParamSimple(map, prefix + "TimbreKey", this.TimbreKey);
        this.setParamSimple(map, prefix + "VoiceName", this.VoiceName);

    }
}


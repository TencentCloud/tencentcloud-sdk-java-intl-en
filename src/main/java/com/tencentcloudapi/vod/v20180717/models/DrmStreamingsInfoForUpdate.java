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

public class DrmStreamingsInfoForUpdate extends AbstractModel {

    /**
    * Adaptive bitrate streaming template ID with SimpleAES protection type.
    */
    @SerializedName("SimpleAesDefinition")
    @Expose
    private Long SimpleAesDefinition;

    /**
    * Adaptive bitrate streaming template ID with Widevine protection type.
    */
    @SerializedName("WidevineDefinition")
    @Expose
    private Long WidevineDefinition;

    /**
    * Adaptive bitstreaming template ID with FairPlay protection.
    */
    @SerializedName("FairPlayDefinition")
    @Expose
    private Long FairPlayDefinition;

    /**
     * Get Adaptive bitrate streaming template ID with SimpleAES protection type. 
     * @return SimpleAesDefinition Adaptive bitrate streaming template ID with SimpleAES protection type.
     */
    public Long getSimpleAesDefinition() {
        return this.SimpleAesDefinition;
    }

    /**
     * Set Adaptive bitrate streaming template ID with SimpleAES protection type.
     * @param SimpleAesDefinition Adaptive bitrate streaming template ID with SimpleAES protection type.
     */
    public void setSimpleAesDefinition(Long SimpleAesDefinition) {
        this.SimpleAesDefinition = SimpleAesDefinition;
    }

    /**
     * Get Adaptive bitrate streaming template ID with Widevine protection type. 
     * @return WidevineDefinition Adaptive bitrate streaming template ID with Widevine protection type.
     */
    public Long getWidevineDefinition() {
        return this.WidevineDefinition;
    }

    /**
     * Set Adaptive bitrate streaming template ID with Widevine protection type.
     * @param WidevineDefinition Adaptive bitrate streaming template ID with Widevine protection type.
     */
    public void setWidevineDefinition(Long WidevineDefinition) {
        this.WidevineDefinition = WidevineDefinition;
    }

    /**
     * Get Adaptive bitstreaming template ID with FairPlay protection. 
     * @return FairPlayDefinition Adaptive bitstreaming template ID with FairPlay protection.
     */
    public Long getFairPlayDefinition() {
        return this.FairPlayDefinition;
    }

    /**
     * Set Adaptive bitstreaming template ID with FairPlay protection.
     * @param FairPlayDefinition Adaptive bitstreaming template ID with FairPlay protection.
     */
    public void setFairPlayDefinition(Long FairPlayDefinition) {
        this.FairPlayDefinition = FairPlayDefinition;
    }

    public DrmStreamingsInfoForUpdate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DrmStreamingsInfoForUpdate(DrmStreamingsInfoForUpdate source) {
        if (source.SimpleAesDefinition != null) {
            this.SimpleAesDefinition = new Long(source.SimpleAesDefinition);
        }
        if (source.WidevineDefinition != null) {
            this.WidevineDefinition = new Long(source.WidevineDefinition);
        }
        if (source.FairPlayDefinition != null) {
            this.FairPlayDefinition = new Long(source.FairPlayDefinition);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SimpleAesDefinition", this.SimpleAesDefinition);
        this.setParamSimple(map, prefix + "WidevineDefinition", this.WidevineDefinition);
        this.setParamSimple(map, prefix + "FairPlayDefinition", this.FairPlayDefinition);

    }
}


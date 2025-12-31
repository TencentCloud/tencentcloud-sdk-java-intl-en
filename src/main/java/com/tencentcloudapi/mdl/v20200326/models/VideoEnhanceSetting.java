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

public class VideoEnhanceSetting extends AbstractModel {

    /**
    * Video enhancement types, optional: "GameEnhance", "ColorEnhance", "Debur", "Comprehensive", "Denoising", "SR", "OutdoorSportsCompetitions", "IndoorSportsCompetitions", "ShowEnhance"
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Video enhancement intensity, 0-1.0, granularity 0.1
    */
    @SerializedName("Strength")
    @Expose
    private Float Strength;

    /**
     * Get Video enhancement types, optional: "GameEnhance", "ColorEnhance", "Debur", "Comprehensive", "Denoising", "SR", "OutdoorSportsCompetitions", "IndoorSportsCompetitions", "ShowEnhance" 
     * @return Type Video enhancement types, optional: "GameEnhance", "ColorEnhance", "Debur", "Comprehensive", "Denoising", "SR", "OutdoorSportsCompetitions", "IndoorSportsCompetitions", "ShowEnhance"
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Video enhancement types, optional: "GameEnhance", "ColorEnhance", "Debur", "Comprehensive", "Denoising", "SR", "OutdoorSportsCompetitions", "IndoorSportsCompetitions", "ShowEnhance"
     * @param Type Video enhancement types, optional: "GameEnhance", "ColorEnhance", "Debur", "Comprehensive", "Denoising", "SR", "OutdoorSportsCompetitions", "IndoorSportsCompetitions", "ShowEnhance"
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Video enhancement intensity, 0-1.0, granularity 0.1 
     * @return Strength Video enhancement intensity, 0-1.0, granularity 0.1
     */
    public Float getStrength() {
        return this.Strength;
    }

    /**
     * Set Video enhancement intensity, 0-1.0, granularity 0.1
     * @param Strength Video enhancement intensity, 0-1.0, granularity 0.1
     */
    public void setStrength(Float Strength) {
        this.Strength = Strength;
    }

    public VideoEnhanceSetting() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoEnhanceSetting(VideoEnhanceSetting source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Strength != null) {
            this.Strength = new Float(source.Strength);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Strength", this.Strength);

    }
}


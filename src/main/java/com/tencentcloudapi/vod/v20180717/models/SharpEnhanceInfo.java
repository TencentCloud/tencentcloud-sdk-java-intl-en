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

public class SharpEnhanceInfo extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 
    */
    @SerializedName("Intensity")
    @Expose
    private Float Intensity;

    /**
     * Get  
     * @return Switch 
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 
     * @param Switch 
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get  
     * @return Intensity 
     */
    public Float getIntensity() {
        return this.Intensity;
    }

    /**
     * Set 
     * @param Intensity 
     */
    public void setIntensity(Float Intensity) {
        this.Intensity = Intensity;
    }

    public SharpEnhanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SharpEnhanceInfo(SharpEnhanceInfo source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Intensity != null) {
            this.Intensity = new Float(source.Intensity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Intensity", this.Intensity);

    }
}


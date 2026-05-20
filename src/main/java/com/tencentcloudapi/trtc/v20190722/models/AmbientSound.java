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

public class AmbientSound extends AbstractModel {

    /**
    * Scenario selection.
    */
    @SerializedName("Scene")
    @Expose
    private String Scene;

    /**
    * Control the volume of ambient sound. value ranges from [0,2]. the lower the value, the softer the ambient sound; the higher the value, the louder the ambient sound. if not set, use the default value 1.
    */
    @SerializedName("Volume")
    @Expose
    private Float Volume;

    /**
     * Get Scenario selection. 
     * @return Scene Scenario selection.
     */
    public String getScene() {
        return this.Scene;
    }

    /**
     * Set Scenario selection.
     * @param Scene Scenario selection.
     */
    public void setScene(String Scene) {
        this.Scene = Scene;
    }

    /**
     * Get Control the volume of ambient sound. value ranges from [0,2]. the lower the value, the softer the ambient sound; the higher the value, the louder the ambient sound. if not set, use the default value 1. 
     * @return Volume Control the volume of ambient sound. value ranges from [0,2]. the lower the value, the softer the ambient sound; the higher the value, the louder the ambient sound. if not set, use the default value 1.
     */
    public Float getVolume() {
        return this.Volume;
    }

    /**
     * Set Control the volume of ambient sound. value ranges from [0,2]. the lower the value, the softer the ambient sound; the higher the value, the louder the ambient sound. if not set, use the default value 1.
     * @param Volume Control the volume of ambient sound. value ranges from [0,2]. the lower the value, the softer the ambient sound; the higher the value, the louder the ambient sound. if not set, use the default value 1.
     */
    public void setVolume(Float Volume) {
        this.Volume = Volume;
    }

    public AmbientSound() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AmbientSound(AmbientSound source) {
        if (source.Scene != null) {
            this.Scene = new String(source.Scene);
        }
        if (source.Volume != null) {
            this.Volume = new Float(source.Volume);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Scene", this.Scene);
        this.setParamSimple(map, prefix + "Volume", this.Volume);

    }
}


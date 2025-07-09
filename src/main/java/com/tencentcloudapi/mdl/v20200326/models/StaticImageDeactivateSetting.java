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

public class StaticImageDeactivateSetting extends AbstractModel {

    /**
    * The overlay level to be canceled, range 0-7, default value 0.
    */
    @SerializedName("Layer")
    @Expose
    private Long Layer;

    /**
    * Fade-out duration, in milliseconds, range 0-5000; default value 0, 0 means no fade-out effect.
    */
    @SerializedName("FadeOut")
    @Expose
    private Long FadeOut;

    /**
     * Get The overlay level to be canceled, range 0-7, default value 0. 
     * @return Layer The overlay level to be canceled, range 0-7, default value 0.
     */
    public Long getLayer() {
        return this.Layer;
    }

    /**
     * Set The overlay level to be canceled, range 0-7, default value 0.
     * @param Layer The overlay level to be canceled, range 0-7, default value 0.
     */
    public void setLayer(Long Layer) {
        this.Layer = Layer;
    }

    /**
     * Get Fade-out duration, in milliseconds, range 0-5000; default value 0, 0 means no fade-out effect. 
     * @return FadeOut Fade-out duration, in milliseconds, range 0-5000; default value 0, 0 means no fade-out effect.
     */
    public Long getFadeOut() {
        return this.FadeOut;
    }

    /**
     * Set Fade-out duration, in milliseconds, range 0-5000; default value 0, 0 means no fade-out effect.
     * @param FadeOut Fade-out duration, in milliseconds, range 0-5000; default value 0, 0 means no fade-out effect.
     */
    public void setFadeOut(Long FadeOut) {
        this.FadeOut = FadeOut;
    }

    public StaticImageDeactivateSetting() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StaticImageDeactivateSetting(StaticImageDeactivateSetting source) {
        if (source.Layer != null) {
            this.Layer = new Long(source.Layer);
        }
        if (source.FadeOut != null) {
            this.FadeOut = new Long(source.FadeOut);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Layer", this.Layer);
        this.setParamSimple(map, prefix + "FadeOut", this.FadeOut);

    }
}


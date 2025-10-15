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

public class MotionGraphicsSetting extends AbstractModel {

    /**
    * Whether to enable dynamic graphic overlay, '0' not enabled, '1' enabled; Default 0.
    */
    @SerializedName("MotionGraphicsOverlayEnabled")
    @Expose
    private Long MotionGraphicsOverlayEnabled;

    /**
     * Get Whether to enable dynamic graphic overlay, '0' not enabled, '1' enabled; Default 0. 
     * @return MotionGraphicsOverlayEnabled Whether to enable dynamic graphic overlay, '0' not enabled, '1' enabled; Default 0.
     */
    public Long getMotionGraphicsOverlayEnabled() {
        return this.MotionGraphicsOverlayEnabled;
    }

    /**
     * Set Whether to enable dynamic graphic overlay, '0' not enabled, '1' enabled; Default 0.
     * @param MotionGraphicsOverlayEnabled Whether to enable dynamic graphic overlay, '0' not enabled, '1' enabled; Default 0.
     */
    public void setMotionGraphicsOverlayEnabled(Long MotionGraphicsOverlayEnabled) {
        this.MotionGraphicsOverlayEnabled = MotionGraphicsOverlayEnabled;
    }

    public MotionGraphicsSetting() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MotionGraphicsSetting(MotionGraphicsSetting source) {
        if (source.MotionGraphicsOverlayEnabled != null) {
            this.MotionGraphicsOverlayEnabled = new Long(source.MotionGraphicsOverlayEnabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MotionGraphicsOverlayEnabled", this.MotionGraphicsOverlayEnabled);

    }
}


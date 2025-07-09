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

public class StaticImageSettings extends AbstractModel {

    /**
    * Whether to enable global static image overlay, 0: Disable, 1: Enable; Default value: 0.
    */
    @SerializedName("GlobalImageOverlayEnabled")
    @Expose
    private Long GlobalImageOverlayEnabled;

    /**
     * Get Whether to enable global static image overlay, 0: Disable, 1: Enable; Default value: 0. 
     * @return GlobalImageOverlayEnabled Whether to enable global static image overlay, 0: Disable, 1: Enable; Default value: 0.
     */
    public Long getGlobalImageOverlayEnabled() {
        return this.GlobalImageOverlayEnabled;
    }

    /**
     * Set Whether to enable global static image overlay, 0: Disable, 1: Enable; Default value: 0.
     * @param GlobalImageOverlayEnabled Whether to enable global static image overlay, 0: Disable, 1: Enable; Default value: 0.
     */
    public void setGlobalImageOverlayEnabled(Long GlobalImageOverlayEnabled) {
        this.GlobalImageOverlayEnabled = GlobalImageOverlayEnabled;
    }

    public StaticImageSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StaticImageSettings(StaticImageSettings source) {
        if (source.GlobalImageOverlayEnabled != null) {
            this.GlobalImageOverlayEnabled = new Long(source.GlobalImageOverlayEnabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GlobalImageOverlayEnabled", this.GlobalImageOverlayEnabled);

    }
}


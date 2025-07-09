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

public class ColorSpaceSetting extends AbstractModel {

    /**
    * Color space, supports `PASSTHROUGH` (transparent transmission, only supports H265); optional.
    */
    @SerializedName("ColorSpace")
    @Expose
    private String ColorSpace;

    /**
     * Get Color space, supports `PASSTHROUGH` (transparent transmission, only supports H265); optional. 
     * @return ColorSpace Color space, supports `PASSTHROUGH` (transparent transmission, only supports H265); optional.
     */
    public String getColorSpace() {
        return this.ColorSpace;
    }

    /**
     * Set Color space, supports `PASSTHROUGH` (transparent transmission, only supports H265); optional.
     * @param ColorSpace Color space, supports `PASSTHROUGH` (transparent transmission, only supports H265); optional.
     */
    public void setColorSpace(String ColorSpace) {
        this.ColorSpace = ColorSpace;
    }

    public ColorSpaceSetting() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ColorSpaceSetting(ColorSpaceSetting source) {
        if (source.ColorSpace != null) {
            this.ColorSpace = new String(source.ColorSpace);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ColorSpace", this.ColorSpace);

    }
}


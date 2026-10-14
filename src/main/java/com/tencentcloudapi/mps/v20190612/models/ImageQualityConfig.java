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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageQualityConfig extends AbstractModel {

    /**
    * <p>Image quality assessment dimensions</p><p>Enumeration values:</p><ul><li>Brightness: Brightness assessment</li><li>Contrast: Contrast assessment</li><li>Sharpness: Clarity assessment</li><li>IQA: Comprehensive quality assessment</li></ul>
    */
    @SerializedName("Attributes")
    @Expose
    private String [] Attributes;

    /**
     * Get <p>Image quality assessment dimensions</p><p>Enumeration values:</p><ul><li>Brightness: Brightness assessment</li><li>Contrast: Contrast assessment</li><li>Sharpness: Clarity assessment</li><li>IQA: Comprehensive quality assessment</li></ul> 
     * @return Attributes <p>Image quality assessment dimensions</p><p>Enumeration values:</p><ul><li>Brightness: Brightness assessment</li><li>Contrast: Contrast assessment</li><li>Sharpness: Clarity assessment</li><li>IQA: Comprehensive quality assessment</li></ul>
     */
    public String [] getAttributes() {
        return this.Attributes;
    }

    /**
     * Set <p>Image quality assessment dimensions</p><p>Enumeration values:</p><ul><li>Brightness: Brightness assessment</li><li>Contrast: Contrast assessment</li><li>Sharpness: Clarity assessment</li><li>IQA: Comprehensive quality assessment</li></ul>
     * @param Attributes <p>Image quality assessment dimensions</p><p>Enumeration values:</p><ul><li>Brightness: Brightness assessment</li><li>Contrast: Contrast assessment</li><li>Sharpness: Clarity assessment</li><li>IQA: Comprehensive quality assessment</li></ul>
     */
    public void setAttributes(String [] Attributes) {
        this.Attributes = Attributes;
    }

    public ImageQualityConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageQualityConfig(ImageQualityConfig source) {
        if (source.Attributes != null) {
            this.Attributes = new String[source.Attributes.length];
            for (int i = 0; i < source.Attributes.length; i++) {
                this.Attributes[i] = new String(source.Attributes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Attributes.", this.Attributes);

    }
}


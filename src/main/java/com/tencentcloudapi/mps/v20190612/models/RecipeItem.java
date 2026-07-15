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

public class RecipeItem extends AbstractModel {

    /**
    * <p>Sub-image type.</p><p>Enumeration values:</p><ul><li>hero: product hero image.</li><li>detail: product details image.</li><li>selling: core selling point image.</li><li>atmosphere: scene atmosphere image.</li><li>angles: multiple-angle image.</li><li>scene: usage scenario image.</li></ul>
    */
    @SerializedName("Theme")
    @Expose
    private String Theme;

    /**
    * <p>Number of corresponding sub-images.</p><p>Value range: 1 to 4.</p><p>Unit: image.</p><p>Each type can have up to 4 sub-images. The total number of sub-images must be within the range of 4 to 12.</p>
    */
    @SerializedName("Num")
    @Expose
    private Long Num;

    /**
     * Get <p>Sub-image type.</p><p>Enumeration values:</p><ul><li>hero: product hero image.</li><li>detail: product details image.</li><li>selling: core selling point image.</li><li>atmosphere: scene atmosphere image.</li><li>angles: multiple-angle image.</li><li>scene: usage scenario image.</li></ul> 
     * @return Theme <p>Sub-image type.</p><p>Enumeration values:</p><ul><li>hero: product hero image.</li><li>detail: product details image.</li><li>selling: core selling point image.</li><li>atmosphere: scene atmosphere image.</li><li>angles: multiple-angle image.</li><li>scene: usage scenario image.</li></ul>
     */
    public String getTheme() {
        return this.Theme;
    }

    /**
     * Set <p>Sub-image type.</p><p>Enumeration values:</p><ul><li>hero: product hero image.</li><li>detail: product details image.</li><li>selling: core selling point image.</li><li>atmosphere: scene atmosphere image.</li><li>angles: multiple-angle image.</li><li>scene: usage scenario image.</li></ul>
     * @param Theme <p>Sub-image type.</p><p>Enumeration values:</p><ul><li>hero: product hero image.</li><li>detail: product details image.</li><li>selling: core selling point image.</li><li>atmosphere: scene atmosphere image.</li><li>angles: multiple-angle image.</li><li>scene: usage scenario image.</li></ul>
     */
    public void setTheme(String Theme) {
        this.Theme = Theme;
    }

    /**
     * Get <p>Number of corresponding sub-images.</p><p>Value range: 1 to 4.</p><p>Unit: image.</p><p>Each type can have up to 4 sub-images. The total number of sub-images must be within the range of 4 to 12.</p> 
     * @return Num <p>Number of corresponding sub-images.</p><p>Value range: 1 to 4.</p><p>Unit: image.</p><p>Each type can have up to 4 sub-images. The total number of sub-images must be within the range of 4 to 12.</p>
     */
    public Long getNum() {
        return this.Num;
    }

    /**
     * Set <p>Number of corresponding sub-images.</p><p>Value range: 1 to 4.</p><p>Unit: image.</p><p>Each type can have up to 4 sub-images. The total number of sub-images must be within the range of 4 to 12.</p>
     * @param Num <p>Number of corresponding sub-images.</p><p>Value range: 1 to 4.</p><p>Unit: image.</p><p>Each type can have up to 4 sub-images. The total number of sub-images must be within the range of 4 to 12.</p>
     */
    public void setNum(Long Num) {
        this.Num = Num;
    }

    public RecipeItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecipeItem(RecipeItem source) {
        if (source.Theme != null) {
            this.Theme = new String(source.Theme);
        }
        if (source.Num != null) {
            this.Num = new Long(source.Num);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Theme", this.Theme);
        this.setParamSimple(map, prefix + "Num", this.Num);

    }
}


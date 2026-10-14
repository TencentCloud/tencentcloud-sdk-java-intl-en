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

public class ImageComposeCanvas extends AbstractModel {

    /**
    * <p>Canvas width, value ranges from 1 to 10240. Set both this and Height at the same time.</p>
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * <p>Canvas height, in the range of [1, 10240]. Set it simultaneously with Width.</p>
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * <p>Canvas background color, unified as an 8-digit hexadecimal #RRGGBBAA (including alpha), used as the canvas background color. Default #00000000 (fully transparent). Example: #FFFFFFFF opaque white, #FFFFFF80 semi-transparent white.</p><p>When the output format does not support transparent channel (such as JPEG), transparent areas are collapsed according to the RGB of this background color. The default value will get a black background. If a white background is required, explicitly pass #FFFFFFFF.</p>
    */
    @SerializedName("Background")
    @Expose
    private String Background;

    /**
     * Get <p>Canvas width, value ranges from 1 to 10240. Set both this and Height at the same time.</p> 
     * @return Width <p>Canvas width, value ranges from 1 to 10240. Set both this and Height at the same time.</p>
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set <p>Canvas width, value ranges from 1 to 10240. Set both this and Height at the same time.</p>
     * @param Width <p>Canvas width, value ranges from 1 to 10240. Set both this and Height at the same time.</p>
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get <p>Canvas height, in the range of [1, 10240]. Set it simultaneously with Width.</p> 
     * @return Height <p>Canvas height, in the range of [1, 10240]. Set it simultaneously with Width.</p>
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set <p>Canvas height, in the range of [1, 10240]. Set it simultaneously with Width.</p>
     * @param Height <p>Canvas height, in the range of [1, 10240]. Set it simultaneously with Width.</p>
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get <p>Canvas background color, unified as an 8-digit hexadecimal #RRGGBBAA (including alpha), used as the canvas background color. Default #00000000 (fully transparent). Example: #FFFFFFFF opaque white, #FFFFFF80 semi-transparent white.</p><p>When the output format does not support transparent channel (such as JPEG), transparent areas are collapsed according to the RGB of this background color. The default value will get a black background. If a white background is required, explicitly pass #FFFFFFFF.</p> 
     * @return Background <p>Canvas background color, unified as an 8-digit hexadecimal #RRGGBBAA (including alpha), used as the canvas background color. Default #00000000 (fully transparent). Example: #FFFFFFFF opaque white, #FFFFFF80 semi-transparent white.</p><p>When the output format does not support transparent channel (such as JPEG), transparent areas are collapsed according to the RGB of this background color. The default value will get a black background. If a white background is required, explicitly pass #FFFFFFFF.</p>
     */
    public String getBackground() {
        return this.Background;
    }

    /**
     * Set <p>Canvas background color, unified as an 8-digit hexadecimal #RRGGBBAA (including alpha), used as the canvas background color. Default #00000000 (fully transparent). Example: #FFFFFFFF opaque white, #FFFFFF80 semi-transparent white.</p><p>When the output format does not support transparent channel (such as JPEG), transparent areas are collapsed according to the RGB of this background color. The default value will get a black background. If a white background is required, explicitly pass #FFFFFFFF.</p>
     * @param Background <p>Canvas background color, unified as an 8-digit hexadecimal #RRGGBBAA (including alpha), used as the canvas background color. Default #00000000 (fully transparent). Example: #FFFFFFFF opaque white, #FFFFFF80 semi-transparent white.</p><p>When the output format does not support transparent channel (such as JPEG), transparent areas are collapsed according to the RGB of this background color. The default value will get a black background. If a white background is required, explicitly pass #FFFFFFFF.</p>
     */
    public void setBackground(String Background) {
        this.Background = Background;
    }

    public ImageComposeCanvas() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageComposeCanvas(ImageComposeCanvas source) {
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.Background != null) {
            this.Background = new String(source.Background);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Background", this.Background);

    }
}


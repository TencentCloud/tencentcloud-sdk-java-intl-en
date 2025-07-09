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

public class TextWatermarkTemplateInputForUpdate extends AbstractModel {

    /**
    * Font type. Currently, two types are supported:
<li>simkai.ttf: both Chinese and English are supported;</li>
<li>arial.ttf: only English is supported.</li>
    */
    @SerializedName("FontType")
    @Expose
    private String FontType;

    /**
    * Font size in Npx format where N is a numeric value.
    */
    @SerializedName("FontSize")
    @Expose
    private String FontSize;

    /**
    * Font color in 0xRRGGBB format. Default value: 0xFFFFFF (white).
    */
    @SerializedName("FontColor")
    @Expose
    private String FontColor;

    /**
    * Text transparency. Value range: (0, 1]
<li>0: completely transparent</li>
<li>1: completely opaque</li>
    */
    @SerializedName("FontAlpha")
    @Expose
    private Float FontAlpha;

    /**
     * Get Font type. Currently, two types are supported:
<li>simkai.ttf: both Chinese and English are supported;</li>
<li>arial.ttf: only English is supported.</li> 
     * @return FontType Font type. Currently, two types are supported:
<li>simkai.ttf: both Chinese and English are supported;</li>
<li>arial.ttf: only English is supported.</li>
     */
    public String getFontType() {
        return this.FontType;
    }

    /**
     * Set Font type. Currently, two types are supported:
<li>simkai.ttf: both Chinese and English are supported;</li>
<li>arial.ttf: only English is supported.</li>
     * @param FontType Font type. Currently, two types are supported:
<li>simkai.ttf: both Chinese and English are supported;</li>
<li>arial.ttf: only English is supported.</li>
     */
    public void setFontType(String FontType) {
        this.FontType = FontType;
    }

    /**
     * Get Font size in Npx format where N is a numeric value. 
     * @return FontSize Font size in Npx format where N is a numeric value.
     */
    public String getFontSize() {
        return this.FontSize;
    }

    /**
     * Set Font size in Npx format where N is a numeric value.
     * @param FontSize Font size in Npx format where N is a numeric value.
     */
    public void setFontSize(String FontSize) {
        this.FontSize = FontSize;
    }

    /**
     * Get Font color in 0xRRGGBB format. Default value: 0xFFFFFF (white). 
     * @return FontColor Font color in 0xRRGGBB format. Default value: 0xFFFFFF (white).
     */
    public String getFontColor() {
        return this.FontColor;
    }

    /**
     * Set Font color in 0xRRGGBB format. Default value: 0xFFFFFF (white).
     * @param FontColor Font color in 0xRRGGBB format. Default value: 0xFFFFFF (white).
     */
    public void setFontColor(String FontColor) {
        this.FontColor = FontColor;
    }

    /**
     * Get Text transparency. Value range: (0, 1]
<li>0: completely transparent</li>
<li>1: completely opaque</li> 
     * @return FontAlpha Text transparency. Value range: (0, 1]
<li>0: completely transparent</li>
<li>1: completely opaque</li>
     */
    public Float getFontAlpha() {
        return this.FontAlpha;
    }

    /**
     * Set Text transparency. Value range: (0, 1]
<li>0: completely transparent</li>
<li>1: completely opaque</li>
     * @param FontAlpha Text transparency. Value range: (0, 1]
<li>0: completely transparent</li>
<li>1: completely opaque</li>
     */
    public void setFontAlpha(Float FontAlpha) {
        this.FontAlpha = FontAlpha;
    }

    public TextWatermarkTemplateInputForUpdate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextWatermarkTemplateInputForUpdate(TextWatermarkTemplateInputForUpdate source) {
        if (source.FontType != null) {
            this.FontType = new String(source.FontType);
        }
        if (source.FontSize != null) {
            this.FontSize = new String(source.FontSize);
        }
        if (source.FontColor != null) {
            this.FontColor = new String(source.FontColor);
        }
        if (source.FontAlpha != null) {
            this.FontAlpha = new Float(source.FontAlpha);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FontType", this.FontType);
        this.setParamSimple(map, prefix + "FontSize", this.FontSize);
        this.setParamSimple(map, prefix + "FontColor", this.FontColor);
        this.setParamSimple(map, prefix + "FontAlpha", this.FontAlpha);

    }
}


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

public class TextWatermarkTemplateInput extends AbstractModel {

    /**
    * 
    */
    @SerializedName("FontType")
    @Expose
    private String FontType;

    /**
    * 
    */
    @SerializedName("FontSize")
    @Expose
    private String FontSize;

    /**
    * 
    */
    @SerializedName("FontColor")
    @Expose
    private String FontColor;

    /**
    * 
    */
    @SerializedName("FontAlpha")
    @Expose
    private Float FontAlpha;

    /**
     * Get  
     * @return FontType 
     */
    public String getFontType() {
        return this.FontType;
    }

    /**
     * Set 
     * @param FontType 
     */
    public void setFontType(String FontType) {
        this.FontType = FontType;
    }

    /**
     * Get  
     * @return FontSize 
     */
    public String getFontSize() {
        return this.FontSize;
    }

    /**
     * Set 
     * @param FontSize 
     */
    public void setFontSize(String FontSize) {
        this.FontSize = FontSize;
    }

    /**
     * Get  
     * @return FontColor 
     */
    public String getFontColor() {
        return this.FontColor;
    }

    /**
     * Set 
     * @param FontColor 
     */
    public void setFontColor(String FontColor) {
        this.FontColor = FontColor;
    }

    /**
     * Get  
     * @return FontAlpha 
     */
    public Float getFontAlpha() {
        return this.FontAlpha;
    }

    /**
     * Set 
     * @param FontAlpha 
     */
    public void setFontAlpha(Float FontAlpha) {
        this.FontAlpha = FontAlpha;
    }

    public TextWatermarkTemplateInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextWatermarkTemplateInput(TextWatermarkTemplateInput source) {
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


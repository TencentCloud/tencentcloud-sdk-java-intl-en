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

public class MPSSubtitleEmbedConfig extends AbstractModel {

    /**
    * 
    */
    @SerializedName("FontType")
    @Expose
    private String FontType;

    /**
    * 
    */
    @SerializedName("FontPath")
    @Expose
    private String FontPath;

    /**
    * 
    */
    @SerializedName("FontSize")
    @Expose
    private Long FontSize;

    /**
    * 
    */
    @SerializedName("FontSizeUnit")
    @Expose
    private Long FontSizeUnit;

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
    * 
    */
    @SerializedName("PosX")
    @Expose
    private Long PosX;

    /**
    * 
    */
    @SerializedName("PosXUnit")
    @Expose
    private Long PosXUnit;

    /**
    * 
    */
    @SerializedName("PosY")
    @Expose
    private Long PosY;

    /**
    * 
    */
    @SerializedName("PosYUnit")
    @Expose
    private Long PosYUnit;

    /**
    * 
    */
    @SerializedName("SubtitleBoardConfig")
    @Expose
    private MPSSubtitleBoardConfig SubtitleBoardConfig;

    /**
    * 
    */
    @SerializedName("SubtitleLayoutConfig")
    @Expose
    private MPSSubtitleLayoutConfig SubtitleLayoutConfig;

    /**
    * 
    */
    @SerializedName("SubtitleOutlineConfig")
    @Expose
    private MPSSubtitleOutlineConfig SubtitleOutlineConfig;

    /**
    * 
    */
    @SerializedName("SubtitleShadowConfig")
    @Expose
    private MPSSubtitleShadowConfig SubtitleShadowConfig;

    /**
    * 
    */
    @SerializedName("SampleWidth")
    @Expose
    private Long SampleWidth;

    /**
    * 
    */
    @SerializedName("SampleHeight")
    @Expose
    private Long SampleHeight;

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
     * @return FontPath 
     */
    public String getFontPath() {
        return this.FontPath;
    }

    /**
     * Set 
     * @param FontPath 
     */
    public void setFontPath(String FontPath) {
        this.FontPath = FontPath;
    }

    /**
     * Get  
     * @return FontSize 
     */
    public Long getFontSize() {
        return this.FontSize;
    }

    /**
     * Set 
     * @param FontSize 
     */
    public void setFontSize(Long FontSize) {
        this.FontSize = FontSize;
    }

    /**
     * Get  
     * @return FontSizeUnit 
     */
    public Long getFontSizeUnit() {
        return this.FontSizeUnit;
    }

    /**
     * Set 
     * @param FontSizeUnit 
     */
    public void setFontSizeUnit(Long FontSizeUnit) {
        this.FontSizeUnit = FontSizeUnit;
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

    /**
     * Get  
     * @return PosX 
     */
    public Long getPosX() {
        return this.PosX;
    }

    /**
     * Set 
     * @param PosX 
     */
    public void setPosX(Long PosX) {
        this.PosX = PosX;
    }

    /**
     * Get  
     * @return PosXUnit 
     */
    public Long getPosXUnit() {
        return this.PosXUnit;
    }

    /**
     * Set 
     * @param PosXUnit 
     */
    public void setPosXUnit(Long PosXUnit) {
        this.PosXUnit = PosXUnit;
    }

    /**
     * Get  
     * @return PosY 
     */
    public Long getPosY() {
        return this.PosY;
    }

    /**
     * Set 
     * @param PosY 
     */
    public void setPosY(Long PosY) {
        this.PosY = PosY;
    }

    /**
     * Get  
     * @return PosYUnit 
     */
    public Long getPosYUnit() {
        return this.PosYUnit;
    }

    /**
     * Set 
     * @param PosYUnit 
     */
    public void setPosYUnit(Long PosYUnit) {
        this.PosYUnit = PosYUnit;
    }

    /**
     * Get  
     * @return SubtitleBoardConfig 
     */
    public MPSSubtitleBoardConfig getSubtitleBoardConfig() {
        return this.SubtitleBoardConfig;
    }

    /**
     * Set 
     * @param SubtitleBoardConfig 
     */
    public void setSubtitleBoardConfig(MPSSubtitleBoardConfig SubtitleBoardConfig) {
        this.SubtitleBoardConfig = SubtitleBoardConfig;
    }

    /**
     * Get  
     * @return SubtitleLayoutConfig 
     */
    public MPSSubtitleLayoutConfig getSubtitleLayoutConfig() {
        return this.SubtitleLayoutConfig;
    }

    /**
     * Set 
     * @param SubtitleLayoutConfig 
     */
    public void setSubtitleLayoutConfig(MPSSubtitleLayoutConfig SubtitleLayoutConfig) {
        this.SubtitleLayoutConfig = SubtitleLayoutConfig;
    }

    /**
     * Get  
     * @return SubtitleOutlineConfig 
     */
    public MPSSubtitleOutlineConfig getSubtitleOutlineConfig() {
        return this.SubtitleOutlineConfig;
    }

    /**
     * Set 
     * @param SubtitleOutlineConfig 
     */
    public void setSubtitleOutlineConfig(MPSSubtitleOutlineConfig SubtitleOutlineConfig) {
        this.SubtitleOutlineConfig = SubtitleOutlineConfig;
    }

    /**
     * Get  
     * @return SubtitleShadowConfig 
     */
    public MPSSubtitleShadowConfig getSubtitleShadowConfig() {
        return this.SubtitleShadowConfig;
    }

    /**
     * Set 
     * @param SubtitleShadowConfig 
     */
    public void setSubtitleShadowConfig(MPSSubtitleShadowConfig SubtitleShadowConfig) {
        this.SubtitleShadowConfig = SubtitleShadowConfig;
    }

    /**
     * Get  
     * @return SampleWidth 
     */
    public Long getSampleWidth() {
        return this.SampleWidth;
    }

    /**
     * Set 
     * @param SampleWidth 
     */
    public void setSampleWidth(Long SampleWidth) {
        this.SampleWidth = SampleWidth;
    }

    /**
     * Get  
     * @return SampleHeight 
     */
    public Long getSampleHeight() {
        return this.SampleHeight;
    }

    /**
     * Set 
     * @param SampleHeight 
     */
    public void setSampleHeight(Long SampleHeight) {
        this.SampleHeight = SampleHeight;
    }

    public MPSSubtitleEmbedConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MPSSubtitleEmbedConfig(MPSSubtitleEmbedConfig source) {
        if (source.FontType != null) {
            this.FontType = new String(source.FontType);
        }
        if (source.FontPath != null) {
            this.FontPath = new String(source.FontPath);
        }
        if (source.FontSize != null) {
            this.FontSize = new Long(source.FontSize);
        }
        if (source.FontSizeUnit != null) {
            this.FontSizeUnit = new Long(source.FontSizeUnit);
        }
        if (source.FontColor != null) {
            this.FontColor = new String(source.FontColor);
        }
        if (source.FontAlpha != null) {
            this.FontAlpha = new Float(source.FontAlpha);
        }
        if (source.PosX != null) {
            this.PosX = new Long(source.PosX);
        }
        if (source.PosXUnit != null) {
            this.PosXUnit = new Long(source.PosXUnit);
        }
        if (source.PosY != null) {
            this.PosY = new Long(source.PosY);
        }
        if (source.PosYUnit != null) {
            this.PosYUnit = new Long(source.PosYUnit);
        }
        if (source.SubtitleBoardConfig != null) {
            this.SubtitleBoardConfig = new MPSSubtitleBoardConfig(source.SubtitleBoardConfig);
        }
        if (source.SubtitleLayoutConfig != null) {
            this.SubtitleLayoutConfig = new MPSSubtitleLayoutConfig(source.SubtitleLayoutConfig);
        }
        if (source.SubtitleOutlineConfig != null) {
            this.SubtitleOutlineConfig = new MPSSubtitleOutlineConfig(source.SubtitleOutlineConfig);
        }
        if (source.SubtitleShadowConfig != null) {
            this.SubtitleShadowConfig = new MPSSubtitleShadowConfig(source.SubtitleShadowConfig);
        }
        if (source.SampleWidth != null) {
            this.SampleWidth = new Long(source.SampleWidth);
        }
        if (source.SampleHeight != null) {
            this.SampleHeight = new Long(source.SampleHeight);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FontType", this.FontType);
        this.setParamSimple(map, prefix + "FontPath", this.FontPath);
        this.setParamSimple(map, prefix + "FontSize", this.FontSize);
        this.setParamSimple(map, prefix + "FontSizeUnit", this.FontSizeUnit);
        this.setParamSimple(map, prefix + "FontColor", this.FontColor);
        this.setParamSimple(map, prefix + "FontAlpha", this.FontAlpha);
        this.setParamSimple(map, prefix + "PosX", this.PosX);
        this.setParamSimple(map, prefix + "PosXUnit", this.PosXUnit);
        this.setParamSimple(map, prefix + "PosY", this.PosY);
        this.setParamSimple(map, prefix + "PosYUnit", this.PosYUnit);
        this.setParamObj(map, prefix + "SubtitleBoardConfig.", this.SubtitleBoardConfig);
        this.setParamObj(map, prefix + "SubtitleLayoutConfig.", this.SubtitleLayoutConfig);
        this.setParamObj(map, prefix + "SubtitleOutlineConfig.", this.SubtitleOutlineConfig);
        this.setParamObj(map, prefix + "SubtitleShadowConfig.", this.SubtitleShadowConfig);
        this.setParamSimple(map, prefix + "SampleWidth", this.SampleWidth);
        this.setParamSimple(map, prefix + "SampleHeight", this.SampleHeight);

    }
}


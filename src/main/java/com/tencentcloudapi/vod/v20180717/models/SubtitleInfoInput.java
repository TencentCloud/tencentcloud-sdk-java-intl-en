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

public class SubtitleInfoInput extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 
    */
    @SerializedName("StreamIndex")
    @Expose
    private Long StreamIndex;

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
    * 
    */
    @SerializedName("YPos")
    @Expose
    private String YPos;

    /**
    * 
    */
    @SerializedName("BoardY")
    @Expose
    private String BoardY;

    /**
    * 
    */
    @SerializedName("BoardWidth")
    @Expose
    private String BoardWidth;

    /**
    * 
    */
    @SerializedName("BoardHeight")
    @Expose
    private String BoardHeight;

    /**
    * 
    */
    @SerializedName("BoardColor")
    @Expose
    private String BoardColor;

    /**
    * 
    */
    @SerializedName("BoardAlpha")
    @Expose
    private Float BoardAlpha;

    /**
    * 
    */
    @SerializedName("Alignment")
    @Expose
    private String Alignment;

    /**
    * 
    */
    @SerializedName("OutlineWidth")
    @Expose
    private String OutlineWidth;

    /**
    * 
    */
    @SerializedName("OutlineColor")
    @Expose
    private String OutlineColor;

    /**
    * 
    */
    @SerializedName("OutlineAlpha")
    @Expose
    private Float OutlineAlpha;

    /**
    * 
    */
    @SerializedName("ShadowWidth")
    @Expose
    private String ShadowWidth;

    /**
    * 
    */
    @SerializedName("ShadowColor")
    @Expose
    private String ShadowColor;

    /**
    * 
    */
    @SerializedName("ShadowAlpha")
    @Expose
    private Float ShadowAlpha;

    /**
    * 
    */
    @SerializedName("LineSpacing")
    @Expose
    private String LineSpacing;

    /**
     * Get  
     * @return Id 
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 
     * @param Id 
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get  
     * @return StreamIndex 
     */
    public Long getStreamIndex() {
        return this.StreamIndex;
    }

    /**
     * Set 
     * @param StreamIndex 
     */
    public void setStreamIndex(Long StreamIndex) {
        this.StreamIndex = StreamIndex;
    }

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

    /**
     * Get  
     * @return YPos 
     */
    public String getYPos() {
        return this.YPos;
    }

    /**
     * Set 
     * @param YPos 
     */
    public void setYPos(String YPos) {
        this.YPos = YPos;
    }

    /**
     * Get  
     * @return BoardY 
     */
    public String getBoardY() {
        return this.BoardY;
    }

    /**
     * Set 
     * @param BoardY 
     */
    public void setBoardY(String BoardY) {
        this.BoardY = BoardY;
    }

    /**
     * Get  
     * @return BoardWidth 
     */
    public String getBoardWidth() {
        return this.BoardWidth;
    }

    /**
     * Set 
     * @param BoardWidth 
     */
    public void setBoardWidth(String BoardWidth) {
        this.BoardWidth = BoardWidth;
    }

    /**
     * Get  
     * @return BoardHeight 
     */
    public String getBoardHeight() {
        return this.BoardHeight;
    }

    /**
     * Set 
     * @param BoardHeight 
     */
    public void setBoardHeight(String BoardHeight) {
        this.BoardHeight = BoardHeight;
    }

    /**
     * Get  
     * @return BoardColor 
     */
    public String getBoardColor() {
        return this.BoardColor;
    }

    /**
     * Set 
     * @param BoardColor 
     */
    public void setBoardColor(String BoardColor) {
        this.BoardColor = BoardColor;
    }

    /**
     * Get  
     * @return BoardAlpha 
     */
    public Float getBoardAlpha() {
        return this.BoardAlpha;
    }

    /**
     * Set 
     * @param BoardAlpha 
     */
    public void setBoardAlpha(Float BoardAlpha) {
        this.BoardAlpha = BoardAlpha;
    }

    /**
     * Get  
     * @return Alignment 
     */
    public String getAlignment() {
        return this.Alignment;
    }

    /**
     * Set 
     * @param Alignment 
     */
    public void setAlignment(String Alignment) {
        this.Alignment = Alignment;
    }

    /**
     * Get  
     * @return OutlineWidth 
     */
    public String getOutlineWidth() {
        return this.OutlineWidth;
    }

    /**
     * Set 
     * @param OutlineWidth 
     */
    public void setOutlineWidth(String OutlineWidth) {
        this.OutlineWidth = OutlineWidth;
    }

    /**
     * Get  
     * @return OutlineColor 
     */
    public String getOutlineColor() {
        return this.OutlineColor;
    }

    /**
     * Set 
     * @param OutlineColor 
     */
    public void setOutlineColor(String OutlineColor) {
        this.OutlineColor = OutlineColor;
    }

    /**
     * Get  
     * @return OutlineAlpha 
     */
    public Float getOutlineAlpha() {
        return this.OutlineAlpha;
    }

    /**
     * Set 
     * @param OutlineAlpha 
     */
    public void setOutlineAlpha(Float OutlineAlpha) {
        this.OutlineAlpha = OutlineAlpha;
    }

    /**
     * Get  
     * @return ShadowWidth 
     */
    public String getShadowWidth() {
        return this.ShadowWidth;
    }

    /**
     * Set 
     * @param ShadowWidth 
     */
    public void setShadowWidth(String ShadowWidth) {
        this.ShadowWidth = ShadowWidth;
    }

    /**
     * Get  
     * @return ShadowColor 
     */
    public String getShadowColor() {
        return this.ShadowColor;
    }

    /**
     * Set 
     * @param ShadowColor 
     */
    public void setShadowColor(String ShadowColor) {
        this.ShadowColor = ShadowColor;
    }

    /**
     * Get  
     * @return ShadowAlpha 
     */
    public Float getShadowAlpha() {
        return this.ShadowAlpha;
    }

    /**
     * Set 
     * @param ShadowAlpha 
     */
    public void setShadowAlpha(Float ShadowAlpha) {
        this.ShadowAlpha = ShadowAlpha;
    }

    /**
     * Get  
     * @return LineSpacing 
     */
    public String getLineSpacing() {
        return this.LineSpacing;
    }

    /**
     * Set 
     * @param LineSpacing 
     */
    public void setLineSpacing(String LineSpacing) {
        this.LineSpacing = LineSpacing;
    }

    public SubtitleInfoInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubtitleInfoInput(SubtitleInfoInput source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.StreamIndex != null) {
            this.StreamIndex = new Long(source.StreamIndex);
        }
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
        if (source.YPos != null) {
            this.YPos = new String(source.YPos);
        }
        if (source.BoardY != null) {
            this.BoardY = new String(source.BoardY);
        }
        if (source.BoardWidth != null) {
            this.BoardWidth = new String(source.BoardWidth);
        }
        if (source.BoardHeight != null) {
            this.BoardHeight = new String(source.BoardHeight);
        }
        if (source.BoardColor != null) {
            this.BoardColor = new String(source.BoardColor);
        }
        if (source.BoardAlpha != null) {
            this.BoardAlpha = new Float(source.BoardAlpha);
        }
        if (source.Alignment != null) {
            this.Alignment = new String(source.Alignment);
        }
        if (source.OutlineWidth != null) {
            this.OutlineWidth = new String(source.OutlineWidth);
        }
        if (source.OutlineColor != null) {
            this.OutlineColor = new String(source.OutlineColor);
        }
        if (source.OutlineAlpha != null) {
            this.OutlineAlpha = new Float(source.OutlineAlpha);
        }
        if (source.ShadowWidth != null) {
            this.ShadowWidth = new String(source.ShadowWidth);
        }
        if (source.ShadowColor != null) {
            this.ShadowColor = new String(source.ShadowColor);
        }
        if (source.ShadowAlpha != null) {
            this.ShadowAlpha = new Float(source.ShadowAlpha);
        }
        if (source.LineSpacing != null) {
            this.LineSpacing = new String(source.LineSpacing);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "StreamIndex", this.StreamIndex);
        this.setParamSimple(map, prefix + "FontType", this.FontType);
        this.setParamSimple(map, prefix + "FontSize", this.FontSize);
        this.setParamSimple(map, prefix + "FontColor", this.FontColor);
        this.setParamSimple(map, prefix + "FontAlpha", this.FontAlpha);
        this.setParamSimple(map, prefix + "YPos", this.YPos);
        this.setParamSimple(map, prefix + "BoardY", this.BoardY);
        this.setParamSimple(map, prefix + "BoardWidth", this.BoardWidth);
        this.setParamSimple(map, prefix + "BoardHeight", this.BoardHeight);
        this.setParamSimple(map, prefix + "BoardColor", this.BoardColor);
        this.setParamSimple(map, prefix + "BoardAlpha", this.BoardAlpha);
        this.setParamSimple(map, prefix + "Alignment", this.Alignment);
        this.setParamSimple(map, prefix + "OutlineWidth", this.OutlineWidth);
        this.setParamSimple(map, prefix + "OutlineColor", this.OutlineColor);
        this.setParamSimple(map, prefix + "OutlineAlpha", this.OutlineAlpha);
        this.setParamSimple(map, prefix + "ShadowWidth", this.ShadowWidth);
        this.setParamSimple(map, prefix + "ShadowColor", this.ShadowColor);
        this.setParamSimple(map, prefix + "ShadowAlpha", this.ShadowAlpha);
        this.setParamSimple(map, prefix + "LineSpacing", this.LineSpacing);

    }
}


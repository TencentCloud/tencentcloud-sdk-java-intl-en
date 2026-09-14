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

public class SubtitleTemplate extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 
    */
    @SerializedName("StreamIndex")
    @Expose
    private Long StreamIndex;

    /**
    * 
    */
    @SerializedName("SubtitleFileInput")
    @Expose
    private MediaInputInfo SubtitleFileInput;

    /**
    * Input information for the subtitle font file to be suppressed. Currently only support url and cos. If both are filled, url takes precedence over cos. If FontFileInput is filled, FontFileInput takes precedence over FontType.

    */
    @SerializedName("FontFileInput")
    @Expose
    private MediaInputInfo FontFileInput;

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
    private Long BoardWidth;

    /**
    * 
    */
    @SerializedName("BoardHeight")
    @Expose
    private Long BoardHeight;

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
    * Stroke width. The value should be a floating-point number.
- Value range for pixels: [0, 1000].
- Value range for percentages: [0, 100].
0.3% of the source video height by default if left blank.

    */
    @SerializedName("OutlineWidth")
    @Expose
    private Float OutlineWidth;

    /**
    * Border color. 6-digit hexadecimal RGB. Black by default if left blank.

    */
    @SerializedName("OutlineColor")
    @Expose
    private String OutlineColor;

    /**
    * Stroke transparency. The value should be a positive floating-point number in the range of (0, 1]. If this is not specified, the default value is 1, which means completely opaque.

    */
    @SerializedName("OutlineAlpha")
    @Expose
    private Float OutlineAlpha;

    /**
    * Shadow width. Floating-point number.
- Value range for pixels: [0, 1000].
- Value range for percentages: [0, 100].
No shading by default if left blank.

    */
    @SerializedName("ShadowWidth")
    @Expose
    private Float ShadowWidth;

    /**
    * Shadow color. 6-bit base RGB. Black by default if left blank (when shadow has set).

    */
    @SerializedName("ShadowColor")
    @Expose
    private String ShadowColor;

    /**
    * Shadow transparency. The value should be a positive floating-point number in the range of (0, 1]. If this is not specified, the default value is 1, which means completely opaque (with shadow configured).

    */
    @SerializedName("ShadowAlpha")
    @Expose
    private Float ShadowAlpha;

    /**
    * Line spacing. The value should be a positive integer.
- Value range for pixels: [0, 1000].
- Value range for percentages: [0, 100]. If this is not specified, the default value is 0.

    */
    @SerializedName("LineSpacing")
    @Expose
    private Long LineSpacing;

    /**
    * Alignment mode. Valid values: top: The top position of the subtitle is fixed, while the bottom position changes according to the number of lines. bottom: The bottom position of the subtitle is fixed, while the top position changes according to the number of lines. If this is not specified, bottom alignment is used by default.

    */
    @SerializedName("Alignment")
    @Expose
    private String Alignment;

    /**
    * Default value is 0. If this is set to 1, the value of BoardWidth is a percentage based on the video width.

    */
    @SerializedName("BoardWidthUnit")
    @Expose
    private Long BoardWidthUnit;

    /**
    * Default value is 0. If this is set to 1, the value of BoardHeight is a percentage based on the video height.

    */
    @SerializedName("BoardHeightUnit")
    @Expose
    private Long BoardHeightUnit;

    /**
    * Default value is 0. If this is set to 1, the value of OutlineWidth is a percentage based on the video height.

    */
    @SerializedName("OutlineWidthUnit")
    @Expose
    private Long OutlineWidthUnit;

    /**
    * Default value is 0. If this is set to 1, the value of ShadowWidth is a percentage based on the video height.

    */
    @SerializedName("ShadowWidthUnit")
    @Expose
    private Long ShadowWidthUnit;

    /**
    * Default value: 0. If this is set to 1, the value of LineSpacing is a percentage based on the video height.

    */
    @SerializedName("LineSpacingUnit")
    @Expose
    private Long LineSpacingUnit;

    /**
     * Get  
     * @return Path 
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 
     * @param Path 
     */
    public void setPath(String Path) {
        this.Path = Path;
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
     * @return SubtitleFileInput 
     */
    public MediaInputInfo getSubtitleFileInput() {
        return this.SubtitleFileInput;
    }

    /**
     * Set 
     * @param SubtitleFileInput 
     */
    public void setSubtitleFileInput(MediaInputInfo SubtitleFileInput) {
        this.SubtitleFileInput = SubtitleFileInput;
    }

    /**
     * Get Input information for the subtitle font file to be suppressed. Currently only support url and cos. If both are filled, url takes precedence over cos. If FontFileInput is filled, FontFileInput takes precedence over FontType.
 
     * @return FontFileInput Input information for the subtitle font file to be suppressed. Currently only support url and cos. If both are filled, url takes precedence over cos. If FontFileInput is filled, FontFileInput takes precedence over FontType.

     */
    public MediaInputInfo getFontFileInput() {
        return this.FontFileInput;
    }

    /**
     * Set Input information for the subtitle font file to be suppressed. Currently only support url and cos. If both are filled, url takes precedence over cos. If FontFileInput is filled, FontFileInput takes precedence over FontType.

     * @param FontFileInput Input information for the subtitle font file to be suppressed. Currently only support url and cos. If both are filled, url takes precedence over cos. If FontFileInput is filled, FontFileInput takes precedence over FontType.

     */
    public void setFontFileInput(MediaInputInfo FontFileInput) {
        this.FontFileInput = FontFileInput;
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
    public Long getBoardWidth() {
        return this.BoardWidth;
    }

    /**
     * Set 
     * @param BoardWidth 
     */
    public void setBoardWidth(Long BoardWidth) {
        this.BoardWidth = BoardWidth;
    }

    /**
     * Get  
     * @return BoardHeight 
     */
    public Long getBoardHeight() {
        return this.BoardHeight;
    }

    /**
     * Set 
     * @param BoardHeight 
     */
    public void setBoardHeight(Long BoardHeight) {
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
     * Get Stroke width. The value should be a floating-point number.
- Value range for pixels: [0, 1000].
- Value range for percentages: [0, 100].
0.3% of the source video height by default if left blank.
 
     * @return OutlineWidth Stroke width. The value should be a floating-point number.
- Value range for pixels: [0, 1000].
- Value range for percentages: [0, 100].
0.3% of the source video height by default if left blank.

     */
    public Float getOutlineWidth() {
        return this.OutlineWidth;
    }

    /**
     * Set Stroke width. The value should be a floating-point number.
- Value range for pixels: [0, 1000].
- Value range for percentages: [0, 100].
0.3% of the source video height by default if left blank.

     * @param OutlineWidth Stroke width. The value should be a floating-point number.
- Value range for pixels: [0, 1000].
- Value range for percentages: [0, 100].
0.3% of the source video height by default if left blank.

     */
    public void setOutlineWidth(Float OutlineWidth) {
        this.OutlineWidth = OutlineWidth;
    }

    /**
     * Get Border color. 6-digit hexadecimal RGB. Black by default if left blank.
 
     * @return OutlineColor Border color. 6-digit hexadecimal RGB. Black by default if left blank.

     */
    public String getOutlineColor() {
        return this.OutlineColor;
    }

    /**
     * Set Border color. 6-digit hexadecimal RGB. Black by default if left blank.

     * @param OutlineColor Border color. 6-digit hexadecimal RGB. Black by default if left blank.

     */
    public void setOutlineColor(String OutlineColor) {
        this.OutlineColor = OutlineColor;
    }

    /**
     * Get Stroke transparency. The value should be a positive floating-point number in the range of (0, 1]. If this is not specified, the default value is 1, which means completely opaque.
 
     * @return OutlineAlpha Stroke transparency. The value should be a positive floating-point number in the range of (0, 1]. If this is not specified, the default value is 1, which means completely opaque.

     */
    public Float getOutlineAlpha() {
        return this.OutlineAlpha;
    }

    /**
     * Set Stroke transparency. The value should be a positive floating-point number in the range of (0, 1]. If this is not specified, the default value is 1, which means completely opaque.

     * @param OutlineAlpha Stroke transparency. The value should be a positive floating-point number in the range of (0, 1]. If this is not specified, the default value is 1, which means completely opaque.

     */
    public void setOutlineAlpha(Float OutlineAlpha) {
        this.OutlineAlpha = OutlineAlpha;
    }

    /**
     * Get Shadow width. Floating-point number.
- Value range for pixels: [0, 1000].
- Value range for percentages: [0, 100].
No shading by default if left blank.
 
     * @return ShadowWidth Shadow width. Floating-point number.
- Value range for pixels: [0, 1000].
- Value range for percentages: [0, 100].
No shading by default if left blank.

     */
    public Float getShadowWidth() {
        return this.ShadowWidth;
    }

    /**
     * Set Shadow width. Floating-point number.
- Value range for pixels: [0, 1000].
- Value range for percentages: [0, 100].
No shading by default if left blank.

     * @param ShadowWidth Shadow width. Floating-point number.
- Value range for pixels: [0, 1000].
- Value range for percentages: [0, 100].
No shading by default if left blank.

     */
    public void setShadowWidth(Float ShadowWidth) {
        this.ShadowWidth = ShadowWidth;
    }

    /**
     * Get Shadow color. 6-bit base RGB. Black by default if left blank (when shadow has set).
 
     * @return ShadowColor Shadow color. 6-bit base RGB. Black by default if left blank (when shadow has set).

     */
    public String getShadowColor() {
        return this.ShadowColor;
    }

    /**
     * Set Shadow color. 6-bit base RGB. Black by default if left blank (when shadow has set).

     * @param ShadowColor Shadow color. 6-bit base RGB. Black by default if left blank (when shadow has set).

     */
    public void setShadowColor(String ShadowColor) {
        this.ShadowColor = ShadowColor;
    }

    /**
     * Get Shadow transparency. The value should be a positive floating-point number in the range of (0, 1]. If this is not specified, the default value is 1, which means completely opaque (with shadow configured).
 
     * @return ShadowAlpha Shadow transparency. The value should be a positive floating-point number in the range of (0, 1]. If this is not specified, the default value is 1, which means completely opaque (with shadow configured).

     */
    public Float getShadowAlpha() {
        return this.ShadowAlpha;
    }

    /**
     * Set Shadow transparency. The value should be a positive floating-point number in the range of (0, 1]. If this is not specified, the default value is 1, which means completely opaque (with shadow configured).

     * @param ShadowAlpha Shadow transparency. The value should be a positive floating-point number in the range of (0, 1]. If this is not specified, the default value is 1, which means completely opaque (with shadow configured).

     */
    public void setShadowAlpha(Float ShadowAlpha) {
        this.ShadowAlpha = ShadowAlpha;
    }

    /**
     * Get Line spacing. The value should be a positive integer.
- Value range for pixels: [0, 1000].
- Value range for percentages: [0, 100]. If this is not specified, the default value is 0.
 
     * @return LineSpacing Line spacing. The value should be a positive integer.
- Value range for pixels: [0, 1000].
- Value range for percentages: [0, 100]. If this is not specified, the default value is 0.

     */
    public Long getLineSpacing() {
        return this.LineSpacing;
    }

    /**
     * Set Line spacing. The value should be a positive integer.
- Value range for pixels: [0, 1000].
- Value range for percentages: [0, 100]. If this is not specified, the default value is 0.

     * @param LineSpacing Line spacing. The value should be a positive integer.
- Value range for pixels: [0, 1000].
- Value range for percentages: [0, 100]. If this is not specified, the default value is 0.

     */
    public void setLineSpacing(Long LineSpacing) {
        this.LineSpacing = LineSpacing;
    }

    /**
     * Get Alignment mode. Valid values: top: The top position of the subtitle is fixed, while the bottom position changes according to the number of lines. bottom: The bottom position of the subtitle is fixed, while the top position changes according to the number of lines. If this is not specified, bottom alignment is used by default.
 
     * @return Alignment Alignment mode. Valid values: top: The top position of the subtitle is fixed, while the bottom position changes according to the number of lines. bottom: The bottom position of the subtitle is fixed, while the top position changes according to the number of lines. If this is not specified, bottom alignment is used by default.

     */
    public String getAlignment() {
        return this.Alignment;
    }

    /**
     * Set Alignment mode. Valid values: top: The top position of the subtitle is fixed, while the bottom position changes according to the number of lines. bottom: The bottom position of the subtitle is fixed, while the top position changes according to the number of lines. If this is not specified, bottom alignment is used by default.

     * @param Alignment Alignment mode. Valid values: top: The top position of the subtitle is fixed, while the bottom position changes according to the number of lines. bottom: The bottom position of the subtitle is fixed, while the top position changes according to the number of lines. If this is not specified, bottom alignment is used by default.

     */
    public void setAlignment(String Alignment) {
        this.Alignment = Alignment;
    }

    /**
     * Get Default value is 0. If this is set to 1, the value of BoardWidth is a percentage based on the video width.
 
     * @return BoardWidthUnit Default value is 0. If this is set to 1, the value of BoardWidth is a percentage based on the video width.

     */
    public Long getBoardWidthUnit() {
        return this.BoardWidthUnit;
    }

    /**
     * Set Default value is 0. If this is set to 1, the value of BoardWidth is a percentage based on the video width.

     * @param BoardWidthUnit Default value is 0. If this is set to 1, the value of BoardWidth is a percentage based on the video width.

     */
    public void setBoardWidthUnit(Long BoardWidthUnit) {
        this.BoardWidthUnit = BoardWidthUnit;
    }

    /**
     * Get Default value is 0. If this is set to 1, the value of BoardHeight is a percentage based on the video height.
 
     * @return BoardHeightUnit Default value is 0. If this is set to 1, the value of BoardHeight is a percentage based on the video height.

     */
    public Long getBoardHeightUnit() {
        return this.BoardHeightUnit;
    }

    /**
     * Set Default value is 0. If this is set to 1, the value of BoardHeight is a percentage based on the video height.

     * @param BoardHeightUnit Default value is 0. If this is set to 1, the value of BoardHeight is a percentage based on the video height.

     */
    public void setBoardHeightUnit(Long BoardHeightUnit) {
        this.BoardHeightUnit = BoardHeightUnit;
    }

    /**
     * Get Default value is 0. If this is set to 1, the value of OutlineWidth is a percentage based on the video height.
 
     * @return OutlineWidthUnit Default value is 0. If this is set to 1, the value of OutlineWidth is a percentage based on the video height.

     */
    public Long getOutlineWidthUnit() {
        return this.OutlineWidthUnit;
    }

    /**
     * Set Default value is 0. If this is set to 1, the value of OutlineWidth is a percentage based on the video height.

     * @param OutlineWidthUnit Default value is 0. If this is set to 1, the value of OutlineWidth is a percentage based on the video height.

     */
    public void setOutlineWidthUnit(Long OutlineWidthUnit) {
        this.OutlineWidthUnit = OutlineWidthUnit;
    }

    /**
     * Get Default value is 0. If this is set to 1, the value of ShadowWidth is a percentage based on the video height.
 
     * @return ShadowWidthUnit Default value is 0. If this is set to 1, the value of ShadowWidth is a percentage based on the video height.

     */
    public Long getShadowWidthUnit() {
        return this.ShadowWidthUnit;
    }

    /**
     * Set Default value is 0. If this is set to 1, the value of ShadowWidth is a percentage based on the video height.

     * @param ShadowWidthUnit Default value is 0. If this is set to 1, the value of ShadowWidth is a percentage based on the video height.

     */
    public void setShadowWidthUnit(Long ShadowWidthUnit) {
        this.ShadowWidthUnit = ShadowWidthUnit;
    }

    /**
     * Get Default value: 0. If this is set to 1, the value of LineSpacing is a percentage based on the video height.
 
     * @return LineSpacingUnit Default value: 0. If this is set to 1, the value of LineSpacing is a percentage based on the video height.

     */
    public Long getLineSpacingUnit() {
        return this.LineSpacingUnit;
    }

    /**
     * Set Default value: 0. If this is set to 1, the value of LineSpacing is a percentage based on the video height.

     * @param LineSpacingUnit Default value: 0. If this is set to 1, the value of LineSpacing is a percentage based on the video height.

     */
    public void setLineSpacingUnit(Long LineSpacingUnit) {
        this.LineSpacingUnit = LineSpacingUnit;
    }

    public SubtitleTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubtitleTemplate(SubtitleTemplate source) {
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.StreamIndex != null) {
            this.StreamIndex = new Long(source.StreamIndex);
        }
        if (source.SubtitleFileInput != null) {
            this.SubtitleFileInput = new MediaInputInfo(source.SubtitleFileInput);
        }
        if (source.FontFileInput != null) {
            this.FontFileInput = new MediaInputInfo(source.FontFileInput);
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
            this.BoardWidth = new Long(source.BoardWidth);
        }
        if (source.BoardHeight != null) {
            this.BoardHeight = new Long(source.BoardHeight);
        }
        if (source.BoardColor != null) {
            this.BoardColor = new String(source.BoardColor);
        }
        if (source.BoardAlpha != null) {
            this.BoardAlpha = new Float(source.BoardAlpha);
        }
        if (source.OutlineWidth != null) {
            this.OutlineWidth = new Float(source.OutlineWidth);
        }
        if (source.OutlineColor != null) {
            this.OutlineColor = new String(source.OutlineColor);
        }
        if (source.OutlineAlpha != null) {
            this.OutlineAlpha = new Float(source.OutlineAlpha);
        }
        if (source.ShadowWidth != null) {
            this.ShadowWidth = new Float(source.ShadowWidth);
        }
        if (source.ShadowColor != null) {
            this.ShadowColor = new String(source.ShadowColor);
        }
        if (source.ShadowAlpha != null) {
            this.ShadowAlpha = new Float(source.ShadowAlpha);
        }
        if (source.LineSpacing != null) {
            this.LineSpacing = new Long(source.LineSpacing);
        }
        if (source.Alignment != null) {
            this.Alignment = new String(source.Alignment);
        }
        if (source.BoardWidthUnit != null) {
            this.BoardWidthUnit = new Long(source.BoardWidthUnit);
        }
        if (source.BoardHeightUnit != null) {
            this.BoardHeightUnit = new Long(source.BoardHeightUnit);
        }
        if (source.OutlineWidthUnit != null) {
            this.OutlineWidthUnit = new Long(source.OutlineWidthUnit);
        }
        if (source.ShadowWidthUnit != null) {
            this.ShadowWidthUnit = new Long(source.ShadowWidthUnit);
        }
        if (source.LineSpacingUnit != null) {
            this.LineSpacingUnit = new Long(source.LineSpacingUnit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "StreamIndex", this.StreamIndex);
        this.setParamObj(map, prefix + "SubtitleFileInput.", this.SubtitleFileInput);
        this.setParamObj(map, prefix + "FontFileInput.", this.FontFileInput);
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
        this.setParamSimple(map, prefix + "OutlineWidth", this.OutlineWidth);
        this.setParamSimple(map, prefix + "OutlineColor", this.OutlineColor);
        this.setParamSimple(map, prefix + "OutlineAlpha", this.OutlineAlpha);
        this.setParamSimple(map, prefix + "ShadowWidth", this.ShadowWidth);
        this.setParamSimple(map, prefix + "ShadowColor", this.ShadowColor);
        this.setParamSimple(map, prefix + "ShadowAlpha", this.ShadowAlpha);
        this.setParamSimple(map, prefix + "LineSpacing", this.LineSpacing);
        this.setParamSimple(map, prefix + "Alignment", this.Alignment);
        this.setParamSimple(map, prefix + "BoardWidthUnit", this.BoardWidthUnit);
        this.setParamSimple(map, prefix + "BoardHeightUnit", this.BoardHeightUnit);
        this.setParamSimple(map, prefix + "OutlineWidthUnit", this.OutlineWidthUnit);
        this.setParamSimple(map, prefix + "ShadowWidthUnit", this.ShadowWidthUnit);
        this.setParamSimple(map, prefix + "LineSpacingUnit", this.LineSpacingUnit);

    }
}


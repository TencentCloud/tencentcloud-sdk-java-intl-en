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

public class ComposeSubtitleStyle extends AbstractModel {

    /**
    * The subtitle height. Two formats are supported:
u200c<li>If the value ends with %, it specifies the height as a percentage of the canvas height. For example, `10%` means that the height is 10% of the canvas height. </li>
u200c<li>If the value ends with px, it specifies the height in pixels. For example, `100px` means that the height is 100 pixels. </li>
The default value is the value of `FontSize`.
    */
    @SerializedName("Height")
    @Expose
    private String Height;

    /**
    * The bottom margin. Two formats are supported:
u200c<li>If the value ends with %, it specifies the margin as a percentage of the canvas height. For example, `10%` means that the margin is 10% of the canvas height. </li>
u200c<li>If the value ends with px, it specifies the margin in pixels. For example, `100px` means that the margin is 100 pixels. </li>
Default value: `0px`.
    */
    @SerializedName("MarginBottom")
    @Expose
    private String MarginBottom;

    /**
    * The font type. Valid values:
<li>`SimHei`(default): Chinese font Heiti. </li>
<Li>`SimSun`: Chinese font Songti. </li>
    */
    @SerializedName("FontType")
    @Expose
    private String FontType;

    /**
    * The font size. Two formats are supported:
u200c<li>If the value ends with %, it specifies the size as a percentage of the canvas height. For example, `10%` means that the size is 10% of the canvas height. </li>
u200c<li>If the value ends with px, it specifies the size in pixels. For example, `100px` means that the size is 100 pixels. </li>
Default value: `2%`.
    */
    @SerializedName("FontSize")
    @Expose
    private String FontSize;

    /**
    * Whether to bold the text (some fonts may not support bold). Valid values:
<li>`0` (default): No. </li>
<li>`1`: Yes. </li>
    */
    @SerializedName("FontBold")
    @Expose
    private Long FontBold;

    /**
    * Whether to italicize the text (some fonts may not support italics). Valid values:
<li>`0` (default): No. </li>
<li>`1`: Yes. </li>
    */
    @SerializedName("FontItalic")
    @Expose
    private Long FontItalic;

    /**
    * The font color (#RRGGBBAA).  
Default value: `0x000000FF` (black).  
Note: `AA` in the color notation defines the opacity of the color. It's optional.

    */
    @SerializedName("FontColor")
    @Expose
    private String FontColor;

    /**
    * The text alignment. Valid values:
<li>`Center`(default) </li>
<li>`Left` </li>
<li>`Right` </li>
    */
    @SerializedName("FontAlign")
    @Expose
    private String FontAlign;

    /**
    * The margin for left/right align.
<li>If `FontAlign` is `Left`, this parameter specifies the left margin of the subtitles. </li>
<li>If `FontAlign` is `Right`, this parameter specifies the right margin of the subtitles. </li>
Two formats are supported:
u200c<li>If the value ends with %, it specifies the margin as a percentage of the canvas width. For example, `10%` means that the margin is 10% of the canvas width. </li>
u200c<li>If the value ends with px, it specifies the margin in pixels. For example, `100px` means that the margin is 100 pixels. </li>
    */
    @SerializedName("FontAlignMargin")
    @Expose
    private String FontAlignMargin;

    /**
    * The subtitle border width. Two formats are supported:
u200c<li>If the value ends with %, it specifies the width as a percentage of the canvas height. For example, `10%` means that the width is 10% of the canvas height. </li>
u200c<li>If the value ends with px, it specifies the width in pixels. For example, `100px` means that the width is 100 pixels. </li>
The default value is `0`, which means the subtitles will have no borders.
    */
    @SerializedName("BorderWidth")
    @Expose
    private String BorderWidth;

    /**
    * The border color, whose format is the same as that for `FontColor`. This parameter is valid if `BorderWidth` is not `0`.
    */
    @SerializedName("BorderColor")
    @Expose
    private String BorderColor;

    /**
    * The text background color, whose format is the same as that for `FontColor`.  
The default value is an empty string, which means the subtitles will not have a background color.
    */
    @SerializedName("BottomColor")
    @Expose
    private String BottomColor;

    /**
     * Get The subtitle height. Two formats are supported:
u200c<li>If the value ends with %, it specifies the height as a percentage of the canvas height. For example, `10%` means that the height is 10% of the canvas height. </li>
u200c<li>If the value ends with px, it specifies the height in pixels. For example, `100px` means that the height is 100 pixels. </li>
The default value is the value of `FontSize`. 
     * @return Height The subtitle height. Two formats are supported:
u200c<li>If the value ends with %, it specifies the height as a percentage of the canvas height. For example, `10%` means that the height is 10% of the canvas height. </li>
u200c<li>If the value ends with px, it specifies the height in pixels. For example, `100px` means that the height is 100 pixels. </li>
The default value is the value of `FontSize`.
     */
    public String getHeight() {
        return this.Height;
    }

    /**
     * Set The subtitle height. Two formats are supported:
u200c<li>If the value ends with %, it specifies the height as a percentage of the canvas height. For example, `10%` means that the height is 10% of the canvas height. </li>
u200c<li>If the value ends with px, it specifies the height in pixels. For example, `100px` means that the height is 100 pixels. </li>
The default value is the value of `FontSize`.
     * @param Height The subtitle height. Two formats are supported:
u200c<li>If the value ends with %, it specifies the height as a percentage of the canvas height. For example, `10%` means that the height is 10% of the canvas height. </li>
u200c<li>If the value ends with px, it specifies the height in pixels. For example, `100px` means that the height is 100 pixels. </li>
The default value is the value of `FontSize`.
     */
    public void setHeight(String Height) {
        this.Height = Height;
    }

    /**
     * Get The bottom margin. Two formats are supported:
u200c<li>If the value ends with %, it specifies the margin as a percentage of the canvas height. For example, `10%` means that the margin is 10% of the canvas height. </li>
u200c<li>If the value ends with px, it specifies the margin in pixels. For example, `100px` means that the margin is 100 pixels. </li>
Default value: `0px`. 
     * @return MarginBottom The bottom margin. Two formats are supported:
u200c<li>If the value ends with %, it specifies the margin as a percentage of the canvas height. For example, `10%` means that the margin is 10% of the canvas height. </li>
u200c<li>If the value ends with px, it specifies the margin in pixels. For example, `100px` means that the margin is 100 pixels. </li>
Default value: `0px`.
     */
    public String getMarginBottom() {
        return this.MarginBottom;
    }

    /**
     * Set The bottom margin. Two formats are supported:
u200c<li>If the value ends with %, it specifies the margin as a percentage of the canvas height. For example, `10%` means that the margin is 10% of the canvas height. </li>
u200c<li>If the value ends with px, it specifies the margin in pixels. For example, `100px` means that the margin is 100 pixels. </li>
Default value: `0px`.
     * @param MarginBottom The bottom margin. Two formats are supported:
u200c<li>If the value ends with %, it specifies the margin as a percentage of the canvas height. For example, `10%` means that the margin is 10% of the canvas height. </li>
u200c<li>If the value ends with px, it specifies the margin in pixels. For example, `100px` means that the margin is 100 pixels. </li>
Default value: `0px`.
     */
    public void setMarginBottom(String MarginBottom) {
        this.MarginBottom = MarginBottom;
    }

    /**
     * Get The font type. Valid values:
<li>`SimHei`(default): Chinese font Heiti. </li>
<Li>`SimSun`: Chinese font Songti. </li> 
     * @return FontType The font type. Valid values:
<li>`SimHei`(default): Chinese font Heiti. </li>
<Li>`SimSun`: Chinese font Songti. </li>
     */
    public String getFontType() {
        return this.FontType;
    }

    /**
     * Set The font type. Valid values:
<li>`SimHei`(default): Chinese font Heiti. </li>
<Li>`SimSun`: Chinese font Songti. </li>
     * @param FontType The font type. Valid values:
<li>`SimHei`(default): Chinese font Heiti. </li>
<Li>`SimSun`: Chinese font Songti. </li>
     */
    public void setFontType(String FontType) {
        this.FontType = FontType;
    }

    /**
     * Get The font size. Two formats are supported:
u200c<li>If the value ends with %, it specifies the size as a percentage of the canvas height. For example, `10%` means that the size is 10% of the canvas height. </li>
u200c<li>If the value ends with px, it specifies the size in pixels. For example, `100px` means that the size is 100 pixels. </li>
Default value: `2%`. 
     * @return FontSize The font size. Two formats are supported:
u200c<li>If the value ends with %, it specifies the size as a percentage of the canvas height. For example, `10%` means that the size is 10% of the canvas height. </li>
u200c<li>If the value ends with px, it specifies the size in pixels. For example, `100px` means that the size is 100 pixels. </li>
Default value: `2%`.
     */
    public String getFontSize() {
        return this.FontSize;
    }

    /**
     * Set The font size. Two formats are supported:
u200c<li>If the value ends with %, it specifies the size as a percentage of the canvas height. For example, `10%` means that the size is 10% of the canvas height. </li>
u200c<li>If the value ends with px, it specifies the size in pixels. For example, `100px` means that the size is 100 pixels. </li>
Default value: `2%`.
     * @param FontSize The font size. Two formats are supported:
u200c<li>If the value ends with %, it specifies the size as a percentage of the canvas height. For example, `10%` means that the size is 10% of the canvas height. </li>
u200c<li>If the value ends with px, it specifies the size in pixels. For example, `100px` means that the size is 100 pixels. </li>
Default value: `2%`.
     */
    public void setFontSize(String FontSize) {
        this.FontSize = FontSize;
    }

    /**
     * Get Whether to bold the text (some fonts may not support bold). Valid values:
<li>`0` (default): No. </li>
<li>`1`: Yes. </li> 
     * @return FontBold Whether to bold the text (some fonts may not support bold). Valid values:
<li>`0` (default): No. </li>
<li>`1`: Yes. </li>
     */
    public Long getFontBold() {
        return this.FontBold;
    }

    /**
     * Set Whether to bold the text (some fonts may not support bold). Valid values:
<li>`0` (default): No. </li>
<li>`1`: Yes. </li>
     * @param FontBold Whether to bold the text (some fonts may not support bold). Valid values:
<li>`0` (default): No. </li>
<li>`1`: Yes. </li>
     */
    public void setFontBold(Long FontBold) {
        this.FontBold = FontBold;
    }

    /**
     * Get Whether to italicize the text (some fonts may not support italics). Valid values:
<li>`0` (default): No. </li>
<li>`1`: Yes. </li> 
     * @return FontItalic Whether to italicize the text (some fonts may not support italics). Valid values:
<li>`0` (default): No. </li>
<li>`1`: Yes. </li>
     */
    public Long getFontItalic() {
        return this.FontItalic;
    }

    /**
     * Set Whether to italicize the text (some fonts may not support italics). Valid values:
<li>`0` (default): No. </li>
<li>`1`: Yes. </li>
     * @param FontItalic Whether to italicize the text (some fonts may not support italics). Valid values:
<li>`0` (default): No. </li>
<li>`1`: Yes. </li>
     */
    public void setFontItalic(Long FontItalic) {
        this.FontItalic = FontItalic;
    }

    /**
     * Get The font color (#RRGGBBAA).  
Default value: `0x000000FF` (black).  
Note: `AA` in the color notation defines the opacity of the color. It's optional.
 
     * @return FontColor The font color (#RRGGBBAA).  
Default value: `0x000000FF` (black).  
Note: `AA` in the color notation defines the opacity of the color. It's optional.

     */
    public String getFontColor() {
        return this.FontColor;
    }

    /**
     * Set The font color (#RRGGBBAA).  
Default value: `0x000000FF` (black).  
Note: `AA` in the color notation defines the opacity of the color. It's optional.

     * @param FontColor The font color (#RRGGBBAA).  
Default value: `0x000000FF` (black).  
Note: `AA` in the color notation defines the opacity of the color. It's optional.

     */
    public void setFontColor(String FontColor) {
        this.FontColor = FontColor;
    }

    /**
     * Get The text alignment. Valid values:
<li>`Center`(default) </li>
<li>`Left` </li>
<li>`Right` </li> 
     * @return FontAlign The text alignment. Valid values:
<li>`Center`(default) </li>
<li>`Left` </li>
<li>`Right` </li>
     */
    public String getFontAlign() {
        return this.FontAlign;
    }

    /**
     * Set The text alignment. Valid values:
<li>`Center`(default) </li>
<li>`Left` </li>
<li>`Right` </li>
     * @param FontAlign The text alignment. Valid values:
<li>`Center`(default) </li>
<li>`Left` </li>
<li>`Right` </li>
     */
    public void setFontAlign(String FontAlign) {
        this.FontAlign = FontAlign;
    }

    /**
     * Get The margin for left/right align.
<li>If `FontAlign` is `Left`, this parameter specifies the left margin of the subtitles. </li>
<li>If `FontAlign` is `Right`, this parameter specifies the right margin of the subtitles. </li>
Two formats are supported:
u200c<li>If the value ends with %, it specifies the margin as a percentage of the canvas width. For example, `10%` means that the margin is 10% of the canvas width. </li>
u200c<li>If the value ends with px, it specifies the margin in pixels. For example, `100px` means that the margin is 100 pixels. </li> 
     * @return FontAlignMargin The margin for left/right align.
<li>If `FontAlign` is `Left`, this parameter specifies the left margin of the subtitles. </li>
<li>If `FontAlign` is `Right`, this parameter specifies the right margin of the subtitles. </li>
Two formats are supported:
u200c<li>If the value ends with %, it specifies the margin as a percentage of the canvas width. For example, `10%` means that the margin is 10% of the canvas width. </li>
u200c<li>If the value ends with px, it specifies the margin in pixels. For example, `100px` means that the margin is 100 pixels. </li>
     */
    public String getFontAlignMargin() {
        return this.FontAlignMargin;
    }

    /**
     * Set The margin for left/right align.
<li>If `FontAlign` is `Left`, this parameter specifies the left margin of the subtitles. </li>
<li>If `FontAlign` is `Right`, this parameter specifies the right margin of the subtitles. </li>
Two formats are supported:
u200c<li>If the value ends with %, it specifies the margin as a percentage of the canvas width. For example, `10%` means that the margin is 10% of the canvas width. </li>
u200c<li>If the value ends with px, it specifies the margin in pixels. For example, `100px` means that the margin is 100 pixels. </li>
     * @param FontAlignMargin The margin for left/right align.
<li>If `FontAlign` is `Left`, this parameter specifies the left margin of the subtitles. </li>
<li>If `FontAlign` is `Right`, this parameter specifies the right margin of the subtitles. </li>
Two formats are supported:
u200c<li>If the value ends with %, it specifies the margin as a percentage of the canvas width. For example, `10%` means that the margin is 10% of the canvas width. </li>
u200c<li>If the value ends with px, it specifies the margin in pixels. For example, `100px` means that the margin is 100 pixels. </li>
     */
    public void setFontAlignMargin(String FontAlignMargin) {
        this.FontAlignMargin = FontAlignMargin;
    }

    /**
     * Get The subtitle border width. Two formats are supported:
u200c<li>If the value ends with %, it specifies the width as a percentage of the canvas height. For example, `10%` means that the width is 10% of the canvas height. </li>
u200c<li>If the value ends with px, it specifies the width in pixels. For example, `100px` means that the width is 100 pixels. </li>
The default value is `0`, which means the subtitles will have no borders. 
     * @return BorderWidth The subtitle border width. Two formats are supported:
u200c<li>If the value ends with %, it specifies the width as a percentage of the canvas height. For example, `10%` means that the width is 10% of the canvas height. </li>
u200c<li>If the value ends with px, it specifies the width in pixels. For example, `100px` means that the width is 100 pixels. </li>
The default value is `0`, which means the subtitles will have no borders.
     */
    public String getBorderWidth() {
        return this.BorderWidth;
    }

    /**
     * Set The subtitle border width. Two formats are supported:
u200c<li>If the value ends with %, it specifies the width as a percentage of the canvas height. For example, `10%` means that the width is 10% of the canvas height. </li>
u200c<li>If the value ends with px, it specifies the width in pixels. For example, `100px` means that the width is 100 pixels. </li>
The default value is `0`, which means the subtitles will have no borders.
     * @param BorderWidth The subtitle border width. Two formats are supported:
u200c<li>If the value ends with %, it specifies the width as a percentage of the canvas height. For example, `10%` means that the width is 10% of the canvas height. </li>
u200c<li>If the value ends with px, it specifies the width in pixels. For example, `100px` means that the width is 100 pixels. </li>
The default value is `0`, which means the subtitles will have no borders.
     */
    public void setBorderWidth(String BorderWidth) {
        this.BorderWidth = BorderWidth;
    }

    /**
     * Get The border color, whose format is the same as that for `FontColor`. This parameter is valid if `BorderWidth` is not `0`. 
     * @return BorderColor The border color, whose format is the same as that for `FontColor`. This parameter is valid if `BorderWidth` is not `0`.
     */
    public String getBorderColor() {
        return this.BorderColor;
    }

    /**
     * Set The border color, whose format is the same as that for `FontColor`. This parameter is valid if `BorderWidth` is not `0`.
     * @param BorderColor The border color, whose format is the same as that for `FontColor`. This parameter is valid if `BorderWidth` is not `0`.
     */
    public void setBorderColor(String BorderColor) {
        this.BorderColor = BorderColor;
    }

    /**
     * Get The text background color, whose format is the same as that for `FontColor`.  
The default value is an empty string, which means the subtitles will not have a background color. 
     * @return BottomColor The text background color, whose format is the same as that for `FontColor`.  
The default value is an empty string, which means the subtitles will not have a background color.
     */
    public String getBottomColor() {
        return this.BottomColor;
    }

    /**
     * Set The text background color, whose format is the same as that for `FontColor`.  
The default value is an empty string, which means the subtitles will not have a background color.
     * @param BottomColor The text background color, whose format is the same as that for `FontColor`.  
The default value is an empty string, which means the subtitles will not have a background color.
     */
    public void setBottomColor(String BottomColor) {
        this.BottomColor = BottomColor;
    }

    public ComposeSubtitleStyle() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComposeSubtitleStyle(ComposeSubtitleStyle source) {
        if (source.Height != null) {
            this.Height = new String(source.Height);
        }
        if (source.MarginBottom != null) {
            this.MarginBottom = new String(source.MarginBottom);
        }
        if (source.FontType != null) {
            this.FontType = new String(source.FontType);
        }
        if (source.FontSize != null) {
            this.FontSize = new String(source.FontSize);
        }
        if (source.FontBold != null) {
            this.FontBold = new Long(source.FontBold);
        }
        if (source.FontItalic != null) {
            this.FontItalic = new Long(source.FontItalic);
        }
        if (source.FontColor != null) {
            this.FontColor = new String(source.FontColor);
        }
        if (source.FontAlign != null) {
            this.FontAlign = new String(source.FontAlign);
        }
        if (source.FontAlignMargin != null) {
            this.FontAlignMargin = new String(source.FontAlignMargin);
        }
        if (source.BorderWidth != null) {
            this.BorderWidth = new String(source.BorderWidth);
        }
        if (source.BorderColor != null) {
            this.BorderColor = new String(source.BorderColor);
        }
        if (source.BottomColor != null) {
            this.BottomColor = new String(source.BottomColor);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "MarginBottom", this.MarginBottom);
        this.setParamSimple(map, prefix + "FontType", this.FontType);
        this.setParamSimple(map, prefix + "FontSize", this.FontSize);
        this.setParamSimple(map, prefix + "FontBold", this.FontBold);
        this.setParamSimple(map, prefix + "FontItalic", this.FontItalic);
        this.setParamSimple(map, prefix + "FontColor", this.FontColor);
        this.setParamSimple(map, prefix + "FontAlign", this.FontAlign);
        this.setParamSimple(map, prefix + "FontAlignMargin", this.FontAlignMargin);
        this.setParamSimple(map, prefix + "BorderWidth", this.BorderWidth);
        this.setParamSimple(map, prefix + "BorderColor", this.BorderColor);
        this.setParamSimple(map, prefix + "BottomColor", this.BottomColor);

    }
}


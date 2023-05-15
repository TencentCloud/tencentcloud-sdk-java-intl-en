/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WaterMarkChar extends AbstractModel{

    /**
    * The Y coordinate of the text watermark from the top left.
    */
    @SerializedName("Top")
    @Expose
    private Long Top;

    /**
    * The X coordinate of the text watermark from the top left.
    */
    @SerializedName("Left")
    @Expose
    private Long Left;

    /**
    * The watermark width (pixels).
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * The watermark height (pixels).
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * The text.
    */
    @SerializedName("Chars")
    @Expose
    private String Chars;

    /**
    * The font size (pixels). The default value is `14`.
    */
    @SerializedName("FontSize")
    @Expose
    private Long FontSize;

    /**
    * The text color. The default color is white.
    */
    @SerializedName("FontColor")
    @Expose
    private String FontColor;

    /**
    * The background color. If this parameter is empty, the background will be transparent (default).
    */
    @SerializedName("BackGroundColor")
    @Expose
    private String BackGroundColor;

    /**
     * Get The Y coordinate of the text watermark from the top left. 
     * @return Top The Y coordinate of the text watermark from the top left.
     */
    public Long getTop() {
        return this.Top;
    }

    /**
     * Set The Y coordinate of the text watermark from the top left.
     * @param Top The Y coordinate of the text watermark from the top left.
     */
    public void setTop(Long Top) {
        this.Top = Top;
    }

    /**
     * Get The X coordinate of the text watermark from the top left. 
     * @return Left The X coordinate of the text watermark from the top left.
     */
    public Long getLeft() {
        return this.Left;
    }

    /**
     * Set The X coordinate of the text watermark from the top left.
     * @param Left The X coordinate of the text watermark from the top left.
     */
    public void setLeft(Long Left) {
        this.Left = Left;
    }

    /**
     * Get The watermark width (pixels). 
     * @return Width The watermark width (pixels).
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set The watermark width (pixels).
     * @param Width The watermark width (pixels).
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get The watermark height (pixels). 
     * @return Height The watermark height (pixels).
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set The watermark height (pixels).
     * @param Height The watermark height (pixels).
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get The text. 
     * @return Chars The text.
     */
    public String getChars() {
        return this.Chars;
    }

    /**
     * Set The text.
     * @param Chars The text.
     */
    public void setChars(String Chars) {
        this.Chars = Chars;
    }

    /**
     * Get The font size (pixels). The default value is `14`. 
     * @return FontSize The font size (pixels). The default value is `14`.
     */
    public Long getFontSize() {
        return this.FontSize;
    }

    /**
     * Set The font size (pixels). The default value is `14`.
     * @param FontSize The font size (pixels). The default value is `14`.
     */
    public void setFontSize(Long FontSize) {
        this.FontSize = FontSize;
    }

    /**
     * Get The text color. The default color is white. 
     * @return FontColor The text color. The default color is white.
     */
    public String getFontColor() {
        return this.FontColor;
    }

    /**
     * Set The text color. The default color is white.
     * @param FontColor The text color. The default color is white.
     */
    public void setFontColor(String FontColor) {
        this.FontColor = FontColor;
    }

    /**
     * Get The background color. If this parameter is empty, the background will be transparent (default). 
     * @return BackGroundColor The background color. If this parameter is empty, the background will be transparent (default).
     */
    public String getBackGroundColor() {
        return this.BackGroundColor;
    }

    /**
     * Set The background color. If this parameter is empty, the background will be transparent (default).
     * @param BackGroundColor The background color. If this parameter is empty, the background will be transparent (default).
     */
    public void setBackGroundColor(String BackGroundColor) {
        this.BackGroundColor = BackGroundColor;
    }

    public WaterMarkChar() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WaterMarkChar(WaterMarkChar source) {
        if (source.Top != null) {
            this.Top = new Long(source.Top);
        }
        if (source.Left != null) {
            this.Left = new Long(source.Left);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.Chars != null) {
            this.Chars = new String(source.Chars);
        }
        if (source.FontSize != null) {
            this.FontSize = new Long(source.FontSize);
        }
        if (source.FontColor != null) {
            this.FontColor = new String(source.FontColor);
        }
        if (source.BackGroundColor != null) {
            this.BackGroundColor = new String(source.BackGroundColor);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Top", this.Top);
        this.setParamSimple(map, prefix + "Left", this.Left);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Chars", this.Chars);
        this.setParamSimple(map, prefix + "FontSize", this.FontSize);
        this.setParamSimple(map, prefix + "FontColor", this.FontColor);
        this.setParamSimple(map, prefix + "BackGroundColor", this.BackGroundColor);

    }
}


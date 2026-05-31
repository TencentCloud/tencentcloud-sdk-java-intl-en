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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubtitleFontConf extends AbstractModel {

    /**
    * Line spacing.
    */
    @SerializedName("LineSpacing")
    @Expose
    private Long LineSpacing;

    /**
    * Margin.
    */
    @SerializedName("Margins")
    @Expose
    private Long Margins;

    /**
    * Number of rows.
    */
    @SerializedName("Lines")
    @Expose
    private Long Lines;

    /**
    * Number of characters per line.
    */
    @SerializedName("CharactersPerLine")
    @Expose
    private Long CharactersPerLine;

    /**
    * Original font    Heiti: simhei.ttf    Song Typeface: simsun.ttc    Huakang Diamond Black (Dynacw Diamond Black): hkjgh.ttf    Helvetica: helvetica.ttf; Needs to be set in Source or Source+Target mode.
    */
    @SerializedName("SourceTextFont")
    @Expose
    private String SourceTextFont;

    /**
    * Font color, represented by 6 characters in hexadecimal RGB.
    */
    @SerializedName("TextColor")
    @Expose
    private String TextColor;

    /**
    * Background color, represented by 6 characters in hexadecimal RGB.
    */
    @SerializedName("BackgroundColor")
    @Expose
    private String BackgroundColor;

    /**
    * Background opacity. A number from 0 to 100.
    */
    @SerializedName("BackgroundAlpha")
    @Expose
    private Long BackgroundAlpha;

    /**
    * Preview the copywriting.
    */
    @SerializedName("PreviewContent")
    @Expose
    private String PreviewContent;

    /**
    * Preview window height.
    */
    @SerializedName("PreviewWindowHeight")
    @Expose
    private Long PreviewWindowHeight;

    /**
    * Preview window width.
    */
    @SerializedName("PreviewWindowWidth")
    @Expose
    private Long PreviewWindowWidth;

    /**
    * Font for the target language. The enumeration value is the same as SourceTextFont. Case-sensitive language support for fonts. TextColor needs to be set in Target or Source+Target mode.
    */
    @SerializedName("TranslatedTextFont")
    @Expose
    private String TranslatedTextFont;

    /**
     * Get Line spacing. 
     * @return LineSpacing Line spacing.
     */
    public Long getLineSpacing() {
        return this.LineSpacing;
    }

    /**
     * Set Line spacing.
     * @param LineSpacing Line spacing.
     */
    public void setLineSpacing(Long LineSpacing) {
        this.LineSpacing = LineSpacing;
    }

    /**
     * Get Margin. 
     * @return Margins Margin.
     */
    public Long getMargins() {
        return this.Margins;
    }

    /**
     * Set Margin.
     * @param Margins Margin.
     */
    public void setMargins(Long Margins) {
        this.Margins = Margins;
    }

    /**
     * Get Number of rows. 
     * @return Lines Number of rows.
     */
    public Long getLines() {
        return this.Lines;
    }

    /**
     * Set Number of rows.
     * @param Lines Number of rows.
     */
    public void setLines(Long Lines) {
        this.Lines = Lines;
    }

    /**
     * Get Number of characters per line. 
     * @return CharactersPerLine Number of characters per line.
     */
    public Long getCharactersPerLine() {
        return this.CharactersPerLine;
    }

    /**
     * Set Number of characters per line.
     * @param CharactersPerLine Number of characters per line.
     */
    public void setCharactersPerLine(Long CharactersPerLine) {
        this.CharactersPerLine = CharactersPerLine;
    }

    /**
     * Get Original font    Heiti: simhei.ttf    Song Typeface: simsun.ttc    Huakang Diamond Black (Dynacw Diamond Black): hkjgh.ttf    Helvetica: helvetica.ttf; Needs to be set in Source or Source+Target mode. 
     * @return SourceTextFont Original font    Heiti: simhei.ttf    Song Typeface: simsun.ttc    Huakang Diamond Black (Dynacw Diamond Black): hkjgh.ttf    Helvetica: helvetica.ttf; Needs to be set in Source or Source+Target mode.
     */
    public String getSourceTextFont() {
        return this.SourceTextFont;
    }

    /**
     * Set Original font    Heiti: simhei.ttf    Song Typeface: simsun.ttc    Huakang Diamond Black (Dynacw Diamond Black): hkjgh.ttf    Helvetica: helvetica.ttf; Needs to be set in Source or Source+Target mode.
     * @param SourceTextFont Original font    Heiti: simhei.ttf    Song Typeface: simsun.ttc    Huakang Diamond Black (Dynacw Diamond Black): hkjgh.ttf    Helvetica: helvetica.ttf; Needs to be set in Source or Source+Target mode.
     */
    public void setSourceTextFont(String SourceTextFont) {
        this.SourceTextFont = SourceTextFont;
    }

    /**
     * Get Font color, represented by 6 characters in hexadecimal RGB. 
     * @return TextColor Font color, represented by 6 characters in hexadecimal RGB.
     */
    public String getTextColor() {
        return this.TextColor;
    }

    /**
     * Set Font color, represented by 6 characters in hexadecimal RGB.
     * @param TextColor Font color, represented by 6 characters in hexadecimal RGB.
     */
    public void setTextColor(String TextColor) {
        this.TextColor = TextColor;
    }

    /**
     * Get Background color, represented by 6 characters in hexadecimal RGB. 
     * @return BackgroundColor Background color, represented by 6 characters in hexadecimal RGB.
     */
    public String getBackgroundColor() {
        return this.BackgroundColor;
    }

    /**
     * Set Background color, represented by 6 characters in hexadecimal RGB.
     * @param BackgroundColor Background color, represented by 6 characters in hexadecimal RGB.
     */
    public void setBackgroundColor(String BackgroundColor) {
        this.BackgroundColor = BackgroundColor;
    }

    /**
     * Get Background opacity. A number from 0 to 100. 
     * @return BackgroundAlpha Background opacity. A number from 0 to 100.
     */
    public Long getBackgroundAlpha() {
        return this.BackgroundAlpha;
    }

    /**
     * Set Background opacity. A number from 0 to 100.
     * @param BackgroundAlpha Background opacity. A number from 0 to 100.
     */
    public void setBackgroundAlpha(Long BackgroundAlpha) {
        this.BackgroundAlpha = BackgroundAlpha;
    }

    /**
     * Get Preview the copywriting. 
     * @return PreviewContent Preview the copywriting.
     */
    public String getPreviewContent() {
        return this.PreviewContent;
    }

    /**
     * Set Preview the copywriting.
     * @param PreviewContent Preview the copywriting.
     */
    public void setPreviewContent(String PreviewContent) {
        this.PreviewContent = PreviewContent;
    }

    /**
     * Get Preview window height. 
     * @return PreviewWindowHeight Preview window height.
     */
    public Long getPreviewWindowHeight() {
        return this.PreviewWindowHeight;
    }

    /**
     * Set Preview window height.
     * @param PreviewWindowHeight Preview window height.
     */
    public void setPreviewWindowHeight(Long PreviewWindowHeight) {
        this.PreviewWindowHeight = PreviewWindowHeight;
    }

    /**
     * Get Preview window width. 
     * @return PreviewWindowWidth Preview window width.
     */
    public Long getPreviewWindowWidth() {
        return this.PreviewWindowWidth;
    }

    /**
     * Set Preview window width.
     * @param PreviewWindowWidth Preview window width.
     */
    public void setPreviewWindowWidth(Long PreviewWindowWidth) {
        this.PreviewWindowWidth = PreviewWindowWidth;
    }

    /**
     * Get Font for the target language. The enumeration value is the same as SourceTextFont. Case-sensitive language support for fonts. TextColor needs to be set in Target or Source+Target mode. 
     * @return TranslatedTextFont Font for the target language. The enumeration value is the same as SourceTextFont. Case-sensitive language support for fonts. TextColor needs to be set in Target or Source+Target mode.
     */
    public String getTranslatedTextFont() {
        return this.TranslatedTextFont;
    }

    /**
     * Set Font for the target language. The enumeration value is the same as SourceTextFont. Case-sensitive language support for fonts. TextColor needs to be set in Target or Source+Target mode.
     * @param TranslatedTextFont Font for the target language. The enumeration value is the same as SourceTextFont. Case-sensitive language support for fonts. TextColor needs to be set in Target or Source+Target mode.
     */
    public void setTranslatedTextFont(String TranslatedTextFont) {
        this.TranslatedTextFont = TranslatedTextFont;
    }

    public SubtitleFontConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubtitleFontConf(SubtitleFontConf source) {
        if (source.LineSpacing != null) {
            this.LineSpacing = new Long(source.LineSpacing);
        }
        if (source.Margins != null) {
            this.Margins = new Long(source.Margins);
        }
        if (source.Lines != null) {
            this.Lines = new Long(source.Lines);
        }
        if (source.CharactersPerLine != null) {
            this.CharactersPerLine = new Long(source.CharactersPerLine);
        }
        if (source.SourceTextFont != null) {
            this.SourceTextFont = new String(source.SourceTextFont);
        }
        if (source.TextColor != null) {
            this.TextColor = new String(source.TextColor);
        }
        if (source.BackgroundColor != null) {
            this.BackgroundColor = new String(source.BackgroundColor);
        }
        if (source.BackgroundAlpha != null) {
            this.BackgroundAlpha = new Long(source.BackgroundAlpha);
        }
        if (source.PreviewContent != null) {
            this.PreviewContent = new String(source.PreviewContent);
        }
        if (source.PreviewWindowHeight != null) {
            this.PreviewWindowHeight = new Long(source.PreviewWindowHeight);
        }
        if (source.PreviewWindowWidth != null) {
            this.PreviewWindowWidth = new Long(source.PreviewWindowWidth);
        }
        if (source.TranslatedTextFont != null) {
            this.TranslatedTextFont = new String(source.TranslatedTextFont);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LineSpacing", this.LineSpacing);
        this.setParamSimple(map, prefix + "Margins", this.Margins);
        this.setParamSimple(map, prefix + "Lines", this.Lines);
        this.setParamSimple(map, prefix + "CharactersPerLine", this.CharactersPerLine);
        this.setParamSimple(map, prefix + "SourceTextFont", this.SourceTextFont);
        this.setParamSimple(map, prefix + "TextColor", this.TextColor);
        this.setParamSimple(map, prefix + "BackgroundColor", this.BackgroundColor);
        this.setParamSimple(map, prefix + "BackgroundAlpha", this.BackgroundAlpha);
        this.setParamSimple(map, prefix + "PreviewContent", this.PreviewContent);
        this.setParamSimple(map, prefix + "PreviewWindowHeight", this.PreviewWindowHeight);
        this.setParamSimple(map, prefix + "PreviewWindowWidth", this.PreviewWindowWidth);
        this.setParamSimple(map, prefix + "TranslatedTextFont", this.TranslatedTextFont);

    }
}


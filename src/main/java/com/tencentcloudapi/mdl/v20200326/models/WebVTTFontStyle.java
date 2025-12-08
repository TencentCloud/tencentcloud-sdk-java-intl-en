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

public class WebVTTFontStyle extends AbstractModel {

    /**
    * Text color, RGB hexadecimal representation, 6 hexadecimal characters (no # needed).
    */
    @SerializedName("TextColor")
    @Expose
    private String TextColor;

    /**
    * Background color, RGB hexadecimal representation, 6 hexadecimal characters (no # needed).
    */
    @SerializedName("BackgroundColor")
    @Expose
    private String BackgroundColor;

    /**
    * Background opacity parameter, a number from 0 to 100, with 0 being the default for full transparency.
    */
    @SerializedName("BackgroundAlpha")
    @Expose
    private Long BackgroundAlpha;

    /**
    * Font size, in units of vh (1% of height), default value 0 means automatic.
    */
    @SerializedName("FontSize")
    @Expose
    private Long FontSize;

    /**
    * The position of the text box, default value AUTO, can be empty; represents the percentage of video height, supports integers from 0 to 100.
    */
    @SerializedName("Line")
    @Expose
    private String Line;

    /**
    * The alignment of the text box on the Line. Optional values: START, CENTER, END. Which can be empty.
    */
    @SerializedName("LineAlignment")
    @Expose
    private String LineAlignment;

    /**
    * The text box is positioned in another direction as a percentage of the video's width. It defaults to AUTO and can be empty.
    */
    @SerializedName("Position")
    @Expose
    private String Position;

    /**
    * The alignment of the text box on the Position. Optional values are LINE_LEFT, LINE_RIGHT, CENTER, and AUTO. The default value is AUTO, and it can be empty.
    */
    @SerializedName("PositionAlignment")
    @Expose
    private String PositionAlignment;

    /**
    * Text box size, a percentage of video width/height, with values (0, 100), default AUTO, can be empty.
    */
    @SerializedName("CueSize")
    @Expose
    private String CueSize;

    /**
    * Text alignment, with possible values  START, CENTER, END, LEFT, and RIGHT; the default value is CENTER, which can be empty.
    */
    @SerializedName("TextAlignment")
    @Expose
    private String TextAlignment;

    /**
     * Get Text color, RGB hexadecimal representation, 6 hexadecimal characters (no # needed). 
     * @return TextColor Text color, RGB hexadecimal representation, 6 hexadecimal characters (no # needed).
     */
    public String getTextColor() {
        return this.TextColor;
    }

    /**
     * Set Text color, RGB hexadecimal representation, 6 hexadecimal characters (no # needed).
     * @param TextColor Text color, RGB hexadecimal representation, 6 hexadecimal characters (no # needed).
     */
    public void setTextColor(String TextColor) {
        this.TextColor = TextColor;
    }

    /**
     * Get Background color, RGB hexadecimal representation, 6 hexadecimal characters (no # needed). 
     * @return BackgroundColor Background color, RGB hexadecimal representation, 6 hexadecimal characters (no # needed).
     */
    public String getBackgroundColor() {
        return this.BackgroundColor;
    }

    /**
     * Set Background color, RGB hexadecimal representation, 6 hexadecimal characters (no # needed).
     * @param BackgroundColor Background color, RGB hexadecimal representation, 6 hexadecimal characters (no # needed).
     */
    public void setBackgroundColor(String BackgroundColor) {
        this.BackgroundColor = BackgroundColor;
    }

    /**
     * Get Background opacity parameter, a number from 0 to 100, with 0 being the default for full transparency. 
     * @return BackgroundAlpha Background opacity parameter, a number from 0 to 100, with 0 being the default for full transparency.
     */
    public Long getBackgroundAlpha() {
        return this.BackgroundAlpha;
    }

    /**
     * Set Background opacity parameter, a number from 0 to 100, with 0 being the default for full transparency.
     * @param BackgroundAlpha Background opacity parameter, a number from 0 to 100, with 0 being the default for full transparency.
     */
    public void setBackgroundAlpha(Long BackgroundAlpha) {
        this.BackgroundAlpha = BackgroundAlpha;
    }

    /**
     * Get Font size, in units of vh (1% of height), default value 0 means automatic. 
     * @return FontSize Font size, in units of vh (1% of height), default value 0 means automatic.
     */
    public Long getFontSize() {
        return this.FontSize;
    }

    /**
     * Set Font size, in units of vh (1% of height), default value 0 means automatic.
     * @param FontSize Font size, in units of vh (1% of height), default value 0 means automatic.
     */
    public void setFontSize(Long FontSize) {
        this.FontSize = FontSize;
    }

    /**
     * Get The position of the text box, default value AUTO, can be empty; represents the percentage of video height, supports integers from 0 to 100. 
     * @return Line The position of the text box, default value AUTO, can be empty; represents the percentage of video height, supports integers from 0 to 100.
     */
    public String getLine() {
        return this.Line;
    }

    /**
     * Set The position of the text box, default value AUTO, can be empty; represents the percentage of video height, supports integers from 0 to 100.
     * @param Line The position of the text box, default value AUTO, can be empty; represents the percentage of video height, supports integers from 0 to 100.
     */
    public void setLine(String Line) {
        this.Line = Line;
    }

    /**
     * Get The alignment of the text box on the Line. Optional values: START, CENTER, END. Which can be empty. 
     * @return LineAlignment The alignment of the text box on the Line. Optional values: START, CENTER, END. Which can be empty.
     */
    public String getLineAlignment() {
        return this.LineAlignment;
    }

    /**
     * Set The alignment of the text box on the Line. Optional values: START, CENTER, END. Which can be empty.
     * @param LineAlignment The alignment of the text box on the Line. Optional values: START, CENTER, END. Which can be empty.
     */
    public void setLineAlignment(String LineAlignment) {
        this.LineAlignment = LineAlignment;
    }

    /**
     * Get The text box is positioned in another direction as a percentage of the video's width. It defaults to AUTO and can be empty. 
     * @return Position The text box is positioned in another direction as a percentage of the video's width. It defaults to AUTO and can be empty.
     */
    public String getPosition() {
        return this.Position;
    }

    /**
     * Set The text box is positioned in another direction as a percentage of the video's width. It defaults to AUTO and can be empty.
     * @param Position The text box is positioned in another direction as a percentage of the video's width. It defaults to AUTO and can be empty.
     */
    public void setPosition(String Position) {
        this.Position = Position;
    }

    /**
     * Get The alignment of the text box on the Position. Optional values are LINE_LEFT, LINE_RIGHT, CENTER, and AUTO. The default value is AUTO, and it can be empty. 
     * @return PositionAlignment The alignment of the text box on the Position. Optional values are LINE_LEFT, LINE_RIGHT, CENTER, and AUTO. The default value is AUTO, and it can be empty.
     */
    public String getPositionAlignment() {
        return this.PositionAlignment;
    }

    /**
     * Set The alignment of the text box on the Position. Optional values are LINE_LEFT, LINE_RIGHT, CENTER, and AUTO. The default value is AUTO, and it can be empty.
     * @param PositionAlignment The alignment of the text box on the Position. Optional values are LINE_LEFT, LINE_RIGHT, CENTER, and AUTO. The default value is AUTO, and it can be empty.
     */
    public void setPositionAlignment(String PositionAlignment) {
        this.PositionAlignment = PositionAlignment;
    }

    /**
     * Get Text box size, a percentage of video width/height, with values (0, 100), default AUTO, can be empty. 
     * @return CueSize Text box size, a percentage of video width/height, with values (0, 100), default AUTO, can be empty.
     */
    public String getCueSize() {
        return this.CueSize;
    }

    /**
     * Set Text box size, a percentage of video width/height, with values (0, 100), default AUTO, can be empty.
     * @param CueSize Text box size, a percentage of video width/height, with values (0, 100), default AUTO, can be empty.
     */
    public void setCueSize(String CueSize) {
        this.CueSize = CueSize;
    }

    /**
     * Get Text alignment, with possible values  START, CENTER, END, LEFT, and RIGHT; the default value is CENTER, which can be empty. 
     * @return TextAlignment Text alignment, with possible values  START, CENTER, END, LEFT, and RIGHT; the default value is CENTER, which can be empty.
     */
    public String getTextAlignment() {
        return this.TextAlignment;
    }

    /**
     * Set Text alignment, with possible values  START, CENTER, END, LEFT, and RIGHT; the default value is CENTER, which can be empty.
     * @param TextAlignment Text alignment, with possible values  START, CENTER, END, LEFT, and RIGHT; the default value is CENTER, which can be empty.
     */
    public void setTextAlignment(String TextAlignment) {
        this.TextAlignment = TextAlignment;
    }

    public WebVTTFontStyle() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WebVTTFontStyle(WebVTTFontStyle source) {
        if (source.TextColor != null) {
            this.TextColor = new String(source.TextColor);
        }
        if (source.BackgroundColor != null) {
            this.BackgroundColor = new String(source.BackgroundColor);
        }
        if (source.BackgroundAlpha != null) {
            this.BackgroundAlpha = new Long(source.BackgroundAlpha);
        }
        if (source.FontSize != null) {
            this.FontSize = new Long(source.FontSize);
        }
        if (source.Line != null) {
            this.Line = new String(source.Line);
        }
        if (source.LineAlignment != null) {
            this.LineAlignment = new String(source.LineAlignment);
        }
        if (source.Position != null) {
            this.Position = new String(source.Position);
        }
        if (source.PositionAlignment != null) {
            this.PositionAlignment = new String(source.PositionAlignment);
        }
        if (source.CueSize != null) {
            this.CueSize = new String(source.CueSize);
        }
        if (source.TextAlignment != null) {
            this.TextAlignment = new String(source.TextAlignment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TextColor", this.TextColor);
        this.setParamSimple(map, prefix + "BackgroundColor", this.BackgroundColor);
        this.setParamSimple(map, prefix + "BackgroundAlpha", this.BackgroundAlpha);
        this.setParamSimple(map, prefix + "FontSize", this.FontSize);
        this.setParamSimple(map, prefix + "Line", this.Line);
        this.setParamSimple(map, prefix + "LineAlignment", this.LineAlignment);
        this.setParamSimple(map, prefix + "Position", this.Position);
        this.setParamSimple(map, prefix + "PositionAlignment", this.PositionAlignment);
        this.setParamSimple(map, prefix + "CueSize", this.CueSize);
        this.setParamSimple(map, prefix + "TextAlignment", this.TextAlignment);

    }
}


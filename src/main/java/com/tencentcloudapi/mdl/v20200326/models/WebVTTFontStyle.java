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
    * Text color, 6 hexadecimal characters in RGB (not required #).
    */
    @SerializedName("TextColor")
    @Expose
    private String TextColor;

    /**
    * Background color, 6 hexadecimal characters in RGB (not required #)
    */
    @SerializedName("BackgroundColor")
    @Expose
    private String BackgroundColor;

    /**
    * Background opacity parameter. A number from 0 to 100. The default value is 0 (fully transparent).
    */
    @SerializedName("BackgroundAlpha")
    @Expose
    private Long BackgroundAlpha;

    /**
    * Font size, in vh (1% of height), default value 0 means auto.
    */
    @SerializedName("FontSize")
    @Expose
    private Long FontSize;

    /**
    * The position of the text box, default value AUTO, can be empty; it represents the percentage of video height and supports integers from 0 to 100.
    */
    @SerializedName("Line")
    @Expose
    private String Line;

    /**
    * The alignment mode of the text box on the Line. Available values: START, CENTER, END. Default: START. Can be blank.
    */
    @SerializedName("LineAlignment")
    @Expose
    private String LineAlignment;

    /**
    * The position of the text box in another direction is a percentage of the video width or height, defaults to AUTO, and can be empty.
    */
    @SerializedName("Position")
    @Expose
    private String Position;

    /**
    * The alignment mode of the text box on Position. Available values: LINE_LEFT, LINE_RIGHT, CENTER, AUTO. Default value: AUTO. Can be empty.
    */
    @SerializedName("PositionAlignment")
    @Expose
    private String PositionAlignment;

    /**
    * The size of the text box, a percentage of video width/height, value (0, 100], default AUTO, can be empty.
    */
    @SerializedName("CueSize")
    @Expose
    private String CueSize;

    /**
    * Text alignment mode, available values START, CENTER, END, LEFT, RIGHT; default value CENTER, can be empty.
    */
    @SerializedName("TextAlignment")
    @Expose
    private String TextAlignment;

    /**
     * Get Text color, 6 hexadecimal characters in RGB (not required #). 
     * @return TextColor Text color, 6 hexadecimal characters in RGB (not required #).
     */
    public String getTextColor() {
        return this.TextColor;
    }

    /**
     * Set Text color, 6 hexadecimal characters in RGB (not required #).
     * @param TextColor Text color, 6 hexadecimal characters in RGB (not required #).
     */
    public void setTextColor(String TextColor) {
        this.TextColor = TextColor;
    }

    /**
     * Get Background color, 6 hexadecimal characters in RGB (not required #) 
     * @return BackgroundColor Background color, 6 hexadecimal characters in RGB (not required #)
     */
    public String getBackgroundColor() {
        return this.BackgroundColor;
    }

    /**
     * Set Background color, 6 hexadecimal characters in RGB (not required #)
     * @param BackgroundColor Background color, 6 hexadecimal characters in RGB (not required #)
     */
    public void setBackgroundColor(String BackgroundColor) {
        this.BackgroundColor = BackgroundColor;
    }

    /**
     * Get Background opacity parameter. A number from 0 to 100. The default value is 0 (fully transparent). 
     * @return BackgroundAlpha Background opacity parameter. A number from 0 to 100. The default value is 0 (fully transparent).
     */
    public Long getBackgroundAlpha() {
        return this.BackgroundAlpha;
    }

    /**
     * Set Background opacity parameter. A number from 0 to 100. The default value is 0 (fully transparent).
     * @param BackgroundAlpha Background opacity parameter. A number from 0 to 100. The default value is 0 (fully transparent).
     */
    public void setBackgroundAlpha(Long BackgroundAlpha) {
        this.BackgroundAlpha = BackgroundAlpha;
    }

    /**
     * Get Font size, in vh (1% of height), default value 0 means auto. 
     * @return FontSize Font size, in vh (1% of height), default value 0 means auto.
     */
    public Long getFontSize() {
        return this.FontSize;
    }

    /**
     * Set Font size, in vh (1% of height), default value 0 means auto.
     * @param FontSize Font size, in vh (1% of height), default value 0 means auto.
     */
    public void setFontSize(Long FontSize) {
        this.FontSize = FontSize;
    }

    /**
     * Get The position of the text box, default value AUTO, can be empty; it represents the percentage of video height and supports integers from 0 to 100. 
     * @return Line The position of the text box, default value AUTO, can be empty; it represents the percentage of video height and supports integers from 0 to 100.
     */
    public String getLine() {
        return this.Line;
    }

    /**
     * Set The position of the text box, default value AUTO, can be empty; it represents the percentage of video height and supports integers from 0 to 100.
     * @param Line The position of the text box, default value AUTO, can be empty; it represents the percentage of video height and supports integers from 0 to 100.
     */
    public void setLine(String Line) {
        this.Line = Line;
    }

    /**
     * Get The alignment mode of the text box on the Line. Available values: START, CENTER, END. Default: START. Can be blank. 
     * @return LineAlignment The alignment mode of the text box on the Line. Available values: START, CENTER, END. Default: START. Can be blank.
     */
    public String getLineAlignment() {
        return this.LineAlignment;
    }

    /**
     * Set The alignment mode of the text box on the Line. Available values: START, CENTER, END. Default: START. Can be blank.
     * @param LineAlignment The alignment mode of the text box on the Line. Available values: START, CENTER, END. Default: START. Can be blank.
     */
    public void setLineAlignment(String LineAlignment) {
        this.LineAlignment = LineAlignment;
    }

    /**
     * Get The position of the text box in another direction is a percentage of the video width or height, defaults to AUTO, and can be empty. 
     * @return Position The position of the text box in another direction is a percentage of the video width or height, defaults to AUTO, and can be empty.
     */
    public String getPosition() {
        return this.Position;
    }

    /**
     * Set The position of the text box in another direction is a percentage of the video width or height, defaults to AUTO, and can be empty.
     * @param Position The position of the text box in another direction is a percentage of the video width or height, defaults to AUTO, and can be empty.
     */
    public void setPosition(String Position) {
        this.Position = Position;
    }

    /**
     * Get The alignment mode of the text box on Position. Available values: LINE_LEFT, LINE_RIGHT, CENTER, AUTO. Default value: AUTO. Can be empty. 
     * @return PositionAlignment The alignment mode of the text box on Position. Available values: LINE_LEFT, LINE_RIGHT, CENTER, AUTO. Default value: AUTO. Can be empty.
     */
    public String getPositionAlignment() {
        return this.PositionAlignment;
    }

    /**
     * Set The alignment mode of the text box on Position. Available values: LINE_LEFT, LINE_RIGHT, CENTER, AUTO. Default value: AUTO. Can be empty.
     * @param PositionAlignment The alignment mode of the text box on Position. Available values: LINE_LEFT, LINE_RIGHT, CENTER, AUTO. Default value: AUTO. Can be empty.
     */
    public void setPositionAlignment(String PositionAlignment) {
        this.PositionAlignment = PositionAlignment;
    }

    /**
     * Get The size of the text box, a percentage of video width/height, value (0, 100], default AUTO, can be empty. 
     * @return CueSize The size of the text box, a percentage of video width/height, value (0, 100], default AUTO, can be empty.
     */
    public String getCueSize() {
        return this.CueSize;
    }

    /**
     * Set The size of the text box, a percentage of video width/height, value (0, 100], default AUTO, can be empty.
     * @param CueSize The size of the text box, a percentage of video width/height, value (0, 100], default AUTO, can be empty.
     */
    public void setCueSize(String CueSize) {
        this.CueSize = CueSize;
    }

    /**
     * Get Text alignment mode, available values START, CENTER, END, LEFT, RIGHT; default value CENTER, can be empty. 
     * @return TextAlignment Text alignment mode, available values START, CENTER, END, LEFT, RIGHT; default value CENTER, can be empty.
     */
    public String getTextAlignment() {
        return this.TextAlignment;
    }

    /**
     * Set Text alignment mode, available values START, CENTER, END, LEFT, RIGHT; default value CENTER, can be empty.
     * @param TextAlignment Text alignment mode, available values START, CENTER, END, LEFT, RIGHT; default value CENTER, can be empty.
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


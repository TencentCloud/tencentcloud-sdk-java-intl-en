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

public class McuWaterMarkText extends AbstractModel{

    /**
    * The text.
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * The watermark width (pixels).
    */
    @SerializedName("WaterMarkWidth")
    @Expose
    private Long WaterMarkWidth;

    /**
    * The watermark height (pixels).
    */
    @SerializedName("WaterMarkHeight")
    @Expose
    private Long WaterMarkHeight;

    /**
    * The horizontal offset (pixels) of the watermark.
    */
    @SerializedName("LocationX")
    @Expose
    private Long LocationX;

    /**
    * The vertical offset (pixels) of the watermark.
    */
    @SerializedName("LocationY")
    @Expose
    private Long LocationY;

    /**
    * The font size.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FontSize")
    @Expose
    private Long FontSize;

    /**
    * The text color. The default color is white. Values for some commonly used colors: Red: 0xcc0033; yellow: 0xcc9900; green: 0xcccc33; blue: 0x99CCFF; black: 0x000000; white: 0xFFFFFF; gray: 0x999999.	
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FontColor")
    @Expose
    private String FontColor;

    /**
    * The text fill color. If you do not specify this parameter, the fill color will be transparent. Values for some commonly used colors: Red: 0xcc0033; yellow: 0xcc9900; green: 0xcccc33; blue: 0x99CCFF; black: 0x000000; white: 0xFFFFFF; gray: 0x999999.	
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BackGroundColor")
    @Expose
    private String BackGroundColor;

    /**
     * Get The text. 
     * @return Text The text.
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set The text.
     * @param Text The text.
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get The watermark width (pixels). 
     * @return WaterMarkWidth The watermark width (pixels).
     */
    public Long getWaterMarkWidth() {
        return this.WaterMarkWidth;
    }

    /**
     * Set The watermark width (pixels).
     * @param WaterMarkWidth The watermark width (pixels).
     */
    public void setWaterMarkWidth(Long WaterMarkWidth) {
        this.WaterMarkWidth = WaterMarkWidth;
    }

    /**
     * Get The watermark height (pixels). 
     * @return WaterMarkHeight The watermark height (pixels).
     */
    public Long getWaterMarkHeight() {
        return this.WaterMarkHeight;
    }

    /**
     * Set The watermark height (pixels).
     * @param WaterMarkHeight The watermark height (pixels).
     */
    public void setWaterMarkHeight(Long WaterMarkHeight) {
        this.WaterMarkHeight = WaterMarkHeight;
    }

    /**
     * Get The horizontal offset (pixels) of the watermark. 
     * @return LocationX The horizontal offset (pixels) of the watermark.
     */
    public Long getLocationX() {
        return this.LocationX;
    }

    /**
     * Set The horizontal offset (pixels) of the watermark.
     * @param LocationX The horizontal offset (pixels) of the watermark.
     */
    public void setLocationX(Long LocationX) {
        this.LocationX = LocationX;
    }

    /**
     * Get The vertical offset (pixels) of the watermark. 
     * @return LocationY The vertical offset (pixels) of the watermark.
     */
    public Long getLocationY() {
        return this.LocationY;
    }

    /**
     * Set The vertical offset (pixels) of the watermark.
     * @param LocationY The vertical offset (pixels) of the watermark.
     */
    public void setLocationY(Long LocationY) {
        this.LocationY = LocationY;
    }

    /**
     * Get The font size.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FontSize The font size.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getFontSize() {
        return this.FontSize;
    }

    /**
     * Set The font size.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FontSize The font size.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFontSize(Long FontSize) {
        this.FontSize = FontSize;
    }

    /**
     * Get The text color. The default color is white. Values for some commonly used colors: Red: 0xcc0033; yellow: 0xcc9900; green: 0xcccc33; blue: 0x99CCFF; black: 0x000000; white: 0xFFFFFF; gray: 0x999999.	
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FontColor The text color. The default color is white. Values for some commonly used colors: Red: 0xcc0033; yellow: 0xcc9900; green: 0xcccc33; blue: 0x99CCFF; black: 0x000000; white: 0xFFFFFF; gray: 0x999999.	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFontColor() {
        return this.FontColor;
    }

    /**
     * Set The text color. The default color is white. Values for some commonly used colors: Red: 0xcc0033; yellow: 0xcc9900; green: 0xcccc33; blue: 0x99CCFF; black: 0x000000; white: 0xFFFFFF; gray: 0x999999.	
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FontColor The text color. The default color is white. Values for some commonly used colors: Red: 0xcc0033; yellow: 0xcc9900; green: 0xcccc33; blue: 0x99CCFF; black: 0x000000; white: 0xFFFFFF; gray: 0x999999.	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFontColor(String FontColor) {
        this.FontColor = FontColor;
    }

    /**
     * Get The text fill color. If you do not specify this parameter, the fill color will be transparent. Values for some commonly used colors: Red: 0xcc0033; yellow: 0xcc9900; green: 0xcccc33; blue: 0x99CCFF; black: 0x000000; white: 0xFFFFFF; gray: 0x999999.	
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BackGroundColor The text fill color. If you do not specify this parameter, the fill color will be transparent. Values for some commonly used colors: Red: 0xcc0033; yellow: 0xcc9900; green: 0xcccc33; blue: 0x99CCFF; black: 0x000000; white: 0xFFFFFF; gray: 0x999999.	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBackGroundColor() {
        return this.BackGroundColor;
    }

    /**
     * Set The text fill color. If you do not specify this parameter, the fill color will be transparent. Values for some commonly used colors: Red: 0xcc0033; yellow: 0xcc9900; green: 0xcccc33; blue: 0x99CCFF; black: 0x000000; white: 0xFFFFFF; gray: 0x999999.	
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BackGroundColor The text fill color. If you do not specify this parameter, the fill color will be transparent. Values for some commonly used colors: Red: 0xcc0033; yellow: 0xcc9900; green: 0xcccc33; blue: 0x99CCFF; black: 0x000000; white: 0xFFFFFF; gray: 0x999999.	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBackGroundColor(String BackGroundColor) {
        this.BackGroundColor = BackGroundColor;
    }

    public McuWaterMarkText() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public McuWaterMarkText(McuWaterMarkText source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.WaterMarkWidth != null) {
            this.WaterMarkWidth = new Long(source.WaterMarkWidth);
        }
        if (source.WaterMarkHeight != null) {
            this.WaterMarkHeight = new Long(source.WaterMarkHeight);
        }
        if (source.LocationX != null) {
            this.LocationX = new Long(source.LocationX);
        }
        if (source.LocationY != null) {
            this.LocationY = new Long(source.LocationY);
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
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "WaterMarkWidth", this.WaterMarkWidth);
        this.setParamSimple(map, prefix + "WaterMarkHeight", this.WaterMarkHeight);
        this.setParamSimple(map, prefix + "LocationX", this.LocationX);
        this.setParamSimple(map, prefix + "LocationY", this.LocationY);
        this.setParamSimple(map, prefix + "FontSize", this.FontSize);
        this.setParamSimple(map, prefix + "FontColor", this.FontColor);
        this.setParamSimple(map, prefix + "BackGroundColor", this.BackGroundColor);

    }
}


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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTextSettings extends AbstractModel {

    /**
    * Text
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * Origin. Valid values: TOP_LEFT, BOTTOM_LEFT, TOP_RIGHT, BOTTOM_RIGHT.
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * The watermark’s horizontal distance from the origin as a percentage of the video width. Value range: 0-100. Default: 10.
    */
    @SerializedName("XPos")
    @Expose
    private Long XPos;

    /**
    * The watermark’s vertical distance from the origin as a percentage of the video height. Value range: 0-100. Default: 10.
    */
    @SerializedName("YPos")
    @Expose
    private Long YPos;

    /**
    * Font size. Value range: 25-50.
    */
    @SerializedName("FontSize")
    @Expose
    private Long FontSize;

    /**
    * Font color, which is an RGB color value. Default value: 0x000000.
    */
    @SerializedName("FontColor")
    @Expose
    private String FontColor;

    /**
     * Get Text 
     * @return Text Text
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set Text
     * @param Text Text
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get Origin. Valid values: TOP_LEFT, BOTTOM_LEFT, TOP_RIGHT, BOTTOM_RIGHT. 
     * @return Location Origin. Valid values: TOP_LEFT, BOTTOM_LEFT, TOP_RIGHT, BOTTOM_RIGHT.
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set Origin. Valid values: TOP_LEFT, BOTTOM_LEFT, TOP_RIGHT, BOTTOM_RIGHT.
     * @param Location Origin. Valid values: TOP_LEFT, BOTTOM_LEFT, TOP_RIGHT, BOTTOM_RIGHT.
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get The watermark’s horizontal distance from the origin as a percentage of the video width. Value range: 0-100. Default: 10. 
     * @return XPos The watermark’s horizontal distance from the origin as a percentage of the video width. Value range: 0-100. Default: 10.
     */
    public Long getXPos() {
        return this.XPos;
    }

    /**
     * Set The watermark’s horizontal distance from the origin as a percentage of the video width. Value range: 0-100. Default: 10.
     * @param XPos The watermark’s horizontal distance from the origin as a percentage of the video width. Value range: 0-100. Default: 10.
     */
    public void setXPos(Long XPos) {
        this.XPos = XPos;
    }

    /**
     * Get The watermark’s vertical distance from the origin as a percentage of the video height. Value range: 0-100. Default: 10. 
     * @return YPos The watermark’s vertical distance from the origin as a percentage of the video height. Value range: 0-100. Default: 10.
     */
    public Long getYPos() {
        return this.YPos;
    }

    /**
     * Set The watermark’s vertical distance from the origin as a percentage of the video height. Value range: 0-100. Default: 10.
     * @param YPos The watermark’s vertical distance from the origin as a percentage of the video height. Value range: 0-100. Default: 10.
     */
    public void setYPos(Long YPos) {
        this.YPos = YPos;
    }

    /**
     * Get Font size. Value range: 25-50. 
     * @return FontSize Font size. Value range: 25-50.
     */
    public Long getFontSize() {
        return this.FontSize;
    }

    /**
     * Set Font size. Value range: 25-50.
     * @param FontSize Font size. Value range: 25-50.
     */
    public void setFontSize(Long FontSize) {
        this.FontSize = FontSize;
    }

    /**
     * Get Font color, which is an RGB color value. Default value: 0x000000. 
     * @return FontColor Font color, which is an RGB color value. Default value: 0x000000.
     */
    public String getFontColor() {
        return this.FontColor;
    }

    /**
     * Set Font color, which is an RGB color value. Default value: 0x000000.
     * @param FontColor Font color, which is an RGB color value. Default value: 0x000000.
     */
    public void setFontColor(String FontColor) {
        this.FontColor = FontColor;
    }

    public CreateTextSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTextSettings(CreateTextSettings source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Location != null) {
            this.Location = new String(source.Location);
        }
        if (source.XPos != null) {
            this.XPos = new Long(source.XPos);
        }
        if (source.YPos != null) {
            this.YPos = new Long(source.YPos);
        }
        if (source.FontSize != null) {
            this.FontSize = new Long(source.FontSize);
        }
        if (source.FontColor != null) {
            this.FontColor = new String(source.FontColor);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamSimple(map, prefix + "XPos", this.XPos);
        this.setParamSimple(map, prefix + "YPos", this.YPos);
        this.setParamSimple(map, prefix + "FontSize", this.FontSize);
        this.setParamSimple(map, prefix + "FontColor", this.FontColor);

    }
}


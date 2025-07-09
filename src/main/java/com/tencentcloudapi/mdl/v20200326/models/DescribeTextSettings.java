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

public class DescribeTextSettings extends AbstractModel {

    /**
    * Text
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * Origin
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * The watermark image’s horizontal distance from the origin as a percentage of the video width
    */
    @SerializedName("XPos")
    @Expose
    private Long XPos;

    /**
    * The watermark image’s vertical distance from the origin as a percentage of the video height
    */
    @SerializedName("YPos")
    @Expose
    private Long YPos;

    /**
    * Font size
    */
    @SerializedName("FontSize")
    @Expose
    private Long FontSize;

    /**
    * Font color
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
     * Get Origin 
     * @return Location Origin
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set Origin
     * @param Location Origin
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get The watermark image’s horizontal distance from the origin as a percentage of the video width 
     * @return XPos The watermark image’s horizontal distance from the origin as a percentage of the video width
     */
    public Long getXPos() {
        return this.XPos;
    }

    /**
     * Set The watermark image’s horizontal distance from the origin as a percentage of the video width
     * @param XPos The watermark image’s horizontal distance from the origin as a percentage of the video width
     */
    public void setXPos(Long XPos) {
        this.XPos = XPos;
    }

    /**
     * Get The watermark image’s vertical distance from the origin as a percentage of the video height 
     * @return YPos The watermark image’s vertical distance from the origin as a percentage of the video height
     */
    public Long getYPos() {
        return this.YPos;
    }

    /**
     * Set The watermark image’s vertical distance from the origin as a percentage of the video height
     * @param YPos The watermark image’s vertical distance from the origin as a percentage of the video height
     */
    public void setYPos(Long YPos) {
        this.YPos = YPos;
    }

    /**
     * Get Font size 
     * @return FontSize Font size
     */
    public Long getFontSize() {
        return this.FontSize;
    }

    /**
     * Set Font size
     * @param FontSize Font size
     */
    public void setFontSize(Long FontSize) {
        this.FontSize = FontSize;
    }

    /**
     * Get Font color 
     * @return FontColor Font color
     */
    public String getFontColor() {
        return this.FontColor;
    }

    /**
     * Set Font color
     * @param FontColor Font color
     */
    public void setFontColor(String FontColor) {
        this.FontColor = FontColor;
    }

    public DescribeTextSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTextSettings(DescribeTextSettings source) {
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


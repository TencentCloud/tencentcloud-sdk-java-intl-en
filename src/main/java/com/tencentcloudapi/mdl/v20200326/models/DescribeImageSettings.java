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

public class DescribeImageSettings extends AbstractModel {

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
    * The watermark image’s width as a percentage of the video width
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * The watermark image’s height as a percentage of the video height
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

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
     * Get The watermark image’s width as a percentage of the video width 
     * @return Width The watermark image’s width as a percentage of the video width
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set The watermark image’s width as a percentage of the video width
     * @param Width The watermark image’s width as a percentage of the video width
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get The watermark image’s height as a percentage of the video height 
     * @return Height The watermark image’s height as a percentage of the video height
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set The watermark image’s height as a percentage of the video height
     * @param Height The watermark image’s height as a percentage of the video height
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    public DescribeImageSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeImageSettings(DescribeImageSettings source) {
        if (source.Location != null) {
            this.Location = new String(source.Location);
        }
        if (source.XPos != null) {
            this.XPos = new Long(source.XPos);
        }
        if (source.YPos != null) {
            this.YPos = new Long(source.YPos);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamSimple(map, prefix + "XPos", this.XPos);
        this.setParamSimple(map, prefix + "YPos", this.YPos);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);

    }
}


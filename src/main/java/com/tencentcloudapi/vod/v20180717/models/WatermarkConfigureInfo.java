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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WatermarkConfigureInfo extends AbstractModel {

    /**
    * Whether to enable watermark. Possible values:
<li>ON: means enabling watermark;</li>
<li>OFF: means turning off watermark. </li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Watermark image Base64 encoded string. Supports jpeg, png image formats.
    */
    @SerializedName("ImageContent")
    @Expose
    private String ImageContent;

    /**
    * The width of the watermark. 
<li>The string ends with %, indicating that the watermark Width is a percentage of the video width, such as 10% indicating that the Width is 10% of the video width;</li>
    */
    @SerializedName("Width")
    @Expose
    private String Width;

    /**
    * The height of the watermark. 
<li>The string ends with %, indicating that the watermark Height is a percentage of the video height, for example, 10% means that the Height is 10% of the video height;</li>
    */
    @SerializedName("Height")
    @Expose
    private String Height;

    /**
    * The horizontal position of the watermark origin from the video image coordinate origin. The string ends with %, indicating that the watermark XPos specifies a percentage of the video width, such as 10% indicating that the XPos is 10% of the video width.
    */
    @SerializedName("XPos")
    @Expose
    private String XPos;

    /**
    * The vertical position of the watermark origin from the video image coordinate origin. When the string ends with %, it means that the watermark YPos specifies a percentage of the video height. For example, 10% means that YPos is 10% of the video height.
    */
    @SerializedName("YPos")
    @Expose
    private String YPos;

    /**
     * Get Whether to enable watermark. Possible values:
<li>ON: means enabling watermark;</li>
<li>OFF: means turning off watermark. </li> 
     * @return Switch Whether to enable watermark. Possible values:
<li>ON: means enabling watermark;</li>
<li>OFF: means turning off watermark. </li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable watermark. Possible values:
<li>ON: means enabling watermark;</li>
<li>OFF: means turning off watermark. </li>
     * @param Switch Whether to enable watermark. Possible values:
<li>ON: means enabling watermark;</li>
<li>OFF: means turning off watermark. </li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Watermark image Base64 encoded string. Supports jpeg, png image formats. 
     * @return ImageContent Watermark image Base64 encoded string. Supports jpeg, png image formats.
     */
    public String getImageContent() {
        return this.ImageContent;
    }

    /**
     * Set Watermark image Base64 encoded string. Supports jpeg, png image formats.
     * @param ImageContent Watermark image Base64 encoded string. Supports jpeg, png image formats.
     */
    public void setImageContent(String ImageContent) {
        this.ImageContent = ImageContent;
    }

    /**
     * Get The width of the watermark. 
<li>The string ends with %, indicating that the watermark Width is a percentage of the video width, such as 10% indicating that the Width is 10% of the video width;</li> 
     * @return Width The width of the watermark. 
<li>The string ends with %, indicating that the watermark Width is a percentage of the video width, such as 10% indicating that the Width is 10% of the video width;</li>
     */
    public String getWidth() {
        return this.Width;
    }

    /**
     * Set The width of the watermark. 
<li>The string ends with %, indicating that the watermark Width is a percentage of the video width, such as 10% indicating that the Width is 10% of the video width;</li>
     * @param Width The width of the watermark. 
<li>The string ends with %, indicating that the watermark Width is a percentage of the video width, such as 10% indicating that the Width is 10% of the video width;</li>
     */
    public void setWidth(String Width) {
        this.Width = Width;
    }

    /**
     * Get The height of the watermark. 
<li>The string ends with %, indicating that the watermark Height is a percentage of the video height, for example, 10% means that the Height is 10% of the video height;</li> 
     * @return Height The height of the watermark. 
<li>The string ends with %, indicating that the watermark Height is a percentage of the video height, for example, 10% means that the Height is 10% of the video height;</li>
     */
    public String getHeight() {
        return this.Height;
    }

    /**
     * Set The height of the watermark. 
<li>The string ends with %, indicating that the watermark Height is a percentage of the video height, for example, 10% means that the Height is 10% of the video height;</li>
     * @param Height The height of the watermark. 
<li>The string ends with %, indicating that the watermark Height is a percentage of the video height, for example, 10% means that the Height is 10% of the video height;</li>
     */
    public void setHeight(String Height) {
        this.Height = Height;
    }

    /**
     * Get The horizontal position of the watermark origin from the video image coordinate origin. The string ends with %, indicating that the watermark XPos specifies a percentage of the video width, such as 10% indicating that the XPos is 10% of the video width. 
     * @return XPos The horizontal position of the watermark origin from the video image coordinate origin. The string ends with %, indicating that the watermark XPos specifies a percentage of the video width, such as 10% indicating that the XPos is 10% of the video width.
     */
    public String getXPos() {
        return this.XPos;
    }

    /**
     * Set The horizontal position of the watermark origin from the video image coordinate origin. The string ends with %, indicating that the watermark XPos specifies a percentage of the video width, such as 10% indicating that the XPos is 10% of the video width.
     * @param XPos The horizontal position of the watermark origin from the video image coordinate origin. The string ends with %, indicating that the watermark XPos specifies a percentage of the video width, such as 10% indicating that the XPos is 10% of the video width.
     */
    public void setXPos(String XPos) {
        this.XPos = XPos;
    }

    /**
     * Get The vertical position of the watermark origin from the video image coordinate origin. When the string ends with %, it means that the watermark YPos specifies a percentage of the video height. For example, 10% means that YPos is 10% of the video height. 
     * @return YPos The vertical position of the watermark origin from the video image coordinate origin. When the string ends with %, it means that the watermark YPos specifies a percentage of the video height. For example, 10% means that YPos is 10% of the video height.
     */
    public String getYPos() {
        return this.YPos;
    }

    /**
     * Set The vertical position of the watermark origin from the video image coordinate origin. When the string ends with %, it means that the watermark YPos specifies a percentage of the video height. For example, 10% means that YPos is 10% of the video height.
     * @param YPos The vertical position of the watermark origin from the video image coordinate origin. When the string ends with %, it means that the watermark YPos specifies a percentage of the video height. For example, 10% means that YPos is 10% of the video height.
     */
    public void setYPos(String YPos) {
        this.YPos = YPos;
    }

    public WatermarkConfigureInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WatermarkConfigureInfo(WatermarkConfigureInfo source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.ImageContent != null) {
            this.ImageContent = new String(source.ImageContent);
        }
        if (source.Width != null) {
            this.Width = new String(source.Width);
        }
        if (source.Height != null) {
            this.Height = new String(source.Height);
        }
        if (source.XPos != null) {
            this.XPos = new String(source.XPos);
        }
        if (source.YPos != null) {
            this.YPos = new String(source.YPos);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "ImageContent", this.ImageContent);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "XPos", this.XPos);
        this.setParamSimple(map, prefix + "YPos", this.YPos);

    }
}


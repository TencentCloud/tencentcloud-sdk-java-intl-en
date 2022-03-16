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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateImageSettings extends AbstractModel{

    /**
    * Image file format. Valid values: png, jpg.
    */
    @SerializedName("ImageType")
    @Expose
    private String ImageType;

    /**
    * Base64 encoded image content
    */
    @SerializedName("ImageContent")
    @Expose
    private String ImageContent;

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
    * The watermark image’s width as a percentage of the video width. Value range: 0-100. Default: 10.
`0` means to scale the width proportionally to the height.
You cannot set both `Width` and `Height` to `0`.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * The watermark image’s height as a percentage of the video height. Value range: 0-100. Default: 10.
`0` means to scale the height proportionally to the width.
You cannot set both `Width` and `Height` to `0`.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
     * Get Image file format. Valid values: png, jpg. 
     * @return ImageType Image file format. Valid values: png, jpg.
     */
    public String getImageType() {
        return this.ImageType;
    }

    /**
     * Set Image file format. Valid values: png, jpg.
     * @param ImageType Image file format. Valid values: png, jpg.
     */
    public void setImageType(String ImageType) {
        this.ImageType = ImageType;
    }

    /**
     * Get Base64 encoded image content 
     * @return ImageContent Base64 encoded image content
     */
    public String getImageContent() {
        return this.ImageContent;
    }

    /**
     * Set Base64 encoded image content
     * @param ImageContent Base64 encoded image content
     */
    public void setImageContent(String ImageContent) {
        this.ImageContent = ImageContent;
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
     * Get The watermark image’s width as a percentage of the video width. Value range: 0-100. Default: 10.
`0` means to scale the width proportionally to the height.
You cannot set both `Width` and `Height` to `0`. 
     * @return Width The watermark image’s width as a percentage of the video width. Value range: 0-100. Default: 10.
`0` means to scale the width proportionally to the height.
You cannot set both `Width` and `Height` to `0`.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set The watermark image’s width as a percentage of the video width. Value range: 0-100. Default: 10.
`0` means to scale the width proportionally to the height.
You cannot set both `Width` and `Height` to `0`.
     * @param Width The watermark image’s width as a percentage of the video width. Value range: 0-100. Default: 10.
`0` means to scale the width proportionally to the height.
You cannot set both `Width` and `Height` to `0`.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get The watermark image’s height as a percentage of the video height. Value range: 0-100. Default: 10.
`0` means to scale the height proportionally to the width.
You cannot set both `Width` and `Height` to `0`. 
     * @return Height The watermark image’s height as a percentage of the video height. Value range: 0-100. Default: 10.
`0` means to scale the height proportionally to the width.
You cannot set both `Width` and `Height` to `0`.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set The watermark image’s height as a percentage of the video height. Value range: 0-100. Default: 10.
`0` means to scale the height proportionally to the width.
You cannot set both `Width` and `Height` to `0`.
     * @param Height The watermark image’s height as a percentage of the video height. Value range: 0-100. Default: 10.
`0` means to scale the height proportionally to the width.
You cannot set both `Width` and `Height` to `0`.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    public CreateImageSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateImageSettings(CreateImageSettings source) {
        if (source.ImageType != null) {
            this.ImageType = new String(source.ImageType);
        }
        if (source.ImageContent != null) {
            this.ImageContent = new String(source.ImageContent);
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
        this.setParamSimple(map, prefix + "ImageType", this.ImageType);
        this.setParamSimple(map, prefix + "ImageContent", this.ImageContent);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamSimple(map, prefix + "XPos", this.XPos);
        this.setParamSimple(map, prefix + "YPos", this.YPos);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);

    }
}


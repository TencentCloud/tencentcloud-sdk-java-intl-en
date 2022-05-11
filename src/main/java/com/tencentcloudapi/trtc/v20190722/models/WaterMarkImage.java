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

public class WaterMarkImage extends AbstractModel{

    /**
    * The download URLs of the watermark images, which must be in JPG or PNG format and cannot be larger than 5 MB.
    */
    @SerializedName("WaterMarkUrl")
    @Expose
    private String WaterMarkUrl;

    /**
    * The Y axis of the image's top-left corner. Value range: [0, 2560]. The value cannot be larger than the canvas height.
    */
    @SerializedName("Top")
    @Expose
    private Long Top;

    /**
    * The X axis of the image’s top-left corner. Value range: [0, 2560]. The value cannot be larger than the canvas width.
    */
    @SerializedName("Left")
    @Expose
    private Long Left;

    /**
    * The relative width of the image. Value range: [0, 2560]. The sum of the values of this parameter and `Left` cannot exceed the canvas width.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * The relative height of the image. Value range: [0, 2560]. The sum of the values of this parameter and `Top` cannot exceed the canvas height.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
     * Get The download URLs of the watermark images, which must be in JPG or PNG format and cannot be larger than 5 MB. 
     * @return WaterMarkUrl The download URLs of the watermark images, which must be in JPG or PNG format and cannot be larger than 5 MB.
     */
    public String getWaterMarkUrl() {
        return this.WaterMarkUrl;
    }

    /**
     * Set The download URLs of the watermark images, which must be in JPG or PNG format and cannot be larger than 5 MB.
     * @param WaterMarkUrl The download URLs of the watermark images, which must be in JPG or PNG format and cannot be larger than 5 MB.
     */
    public void setWaterMarkUrl(String WaterMarkUrl) {
        this.WaterMarkUrl = WaterMarkUrl;
    }

    /**
     * Get The Y axis of the image's top-left corner. Value range: [0, 2560]. The value cannot be larger than the canvas height. 
     * @return Top The Y axis of the image's top-left corner. Value range: [0, 2560]. The value cannot be larger than the canvas height.
     */
    public Long getTop() {
        return this.Top;
    }

    /**
     * Set The Y axis of the image's top-left corner. Value range: [0, 2560]. The value cannot be larger than the canvas height.
     * @param Top The Y axis of the image's top-left corner. Value range: [0, 2560]. The value cannot be larger than the canvas height.
     */
    public void setTop(Long Top) {
        this.Top = Top;
    }

    /**
     * Get The X axis of the image’s top-left corner. Value range: [0, 2560]. The value cannot be larger than the canvas width. 
     * @return Left The X axis of the image’s top-left corner. Value range: [0, 2560]. The value cannot be larger than the canvas width.
     */
    public Long getLeft() {
        return this.Left;
    }

    /**
     * Set The X axis of the image’s top-left corner. Value range: [0, 2560]. The value cannot be larger than the canvas width.
     * @param Left The X axis of the image’s top-left corner. Value range: [0, 2560]. The value cannot be larger than the canvas width.
     */
    public void setLeft(Long Left) {
        this.Left = Left;
    }

    /**
     * Get The relative width of the image. Value range: [0, 2560]. The sum of the values of this parameter and `Left` cannot exceed the canvas width. 
     * @return Width The relative width of the image. Value range: [0, 2560]. The sum of the values of this parameter and `Left` cannot exceed the canvas width.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set The relative width of the image. Value range: [0, 2560]. The sum of the values of this parameter and `Left` cannot exceed the canvas width.
     * @param Width The relative width of the image. Value range: [0, 2560]. The sum of the values of this parameter and `Left` cannot exceed the canvas width.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get The relative height of the image. Value range: [0, 2560]. The sum of the values of this parameter and `Top` cannot exceed the canvas height. 
     * @return Height The relative height of the image. Value range: [0, 2560]. The sum of the values of this parameter and `Top` cannot exceed the canvas height.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set The relative height of the image. Value range: [0, 2560]. The sum of the values of this parameter and `Top` cannot exceed the canvas height.
     * @param Height The relative height of the image. Value range: [0, 2560]. The sum of the values of this parameter and `Top` cannot exceed the canvas height.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    public WaterMarkImage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WaterMarkImage(WaterMarkImage source) {
        if (source.WaterMarkUrl != null) {
            this.WaterMarkUrl = new String(source.WaterMarkUrl);
        }
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WaterMarkUrl", this.WaterMarkUrl);
        this.setParamSimple(map, prefix + "Top", this.Top);
        this.setParamSimple(map, prefix + "Left", this.Left);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);

    }
}


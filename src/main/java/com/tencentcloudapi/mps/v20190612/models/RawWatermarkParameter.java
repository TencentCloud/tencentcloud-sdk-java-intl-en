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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RawWatermarkParameter extends AbstractModel {

    /**
    * Watermark type. Valid values:
<li>image: image watermark.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Origin position. Valid values:
<li>TopLeft: indicates that the coordinate origin is at the top left corner of the video image and the watermark origin is at the top left corner of the image or text.</li>
<li>TopRight: indicates that the coordinate origin is at the top right corner of the video image and the watermark origin is at the top right corner of the image or text.</li>
<li>BottomLeft: indicates that the coordinate origin is at the bottom-left corner of the video image and the watermark origin is at the bottom-left corner of the image or text.</li>
<li>BottomRight: indicates that the coordinate origin is at the bottom right corner of the video image and the watermark origin is at the bottom right corner of the image or text.</li>
Default value: TopLeft.
    */
    @SerializedName("CoordinateOrigin")
    @Expose
    private String CoordinateOrigin;

    /**
    * Horizontal position of the watermark origin from the origin of coordinates of the video image. Supports % and px formats.
<li>If a string ends with %, it indicates that the `XPos` of a watermark is a specified percentage of a video's width. For example, `10%` means that `XPos` is 10% of a video's width.</li>
<li>If a string ends with px, it means the watermark XPos is specified in pixels. For example, 100px means XPos is 100 pixels.</li>
Default value: 0px.
    */
    @SerializedName("XPos")
    @Expose
    private String XPos;

    /**
    * Vertical position of the watermark origin relative to the origin of coordinates of the video image. Supports two formats: % and px.
<li>If a string ends with %, it indicates that the `YPos` of a watermark is a specified percentage of a video's height. For example, `10%` means that `YPos` is 10% of a video's height.</li>
<li>If a string ends with px, it means the watermark YPos is specified in pixels. For example, 100px means YPos is 100 pixels.</li>
Default value: 0px.
    */
    @SerializedName("YPos")
    @Expose
    private String YPos;

    /**
    * Image watermark template. This field is required when Type is image, and invalid when Type is text.
    */
    @SerializedName("ImageTemplate")
    @Expose
    private RawImageWatermarkInput ImageTemplate;

    /**
     * Get Watermark type. Valid values:
<li>image: image watermark.</li> 
     * @return Type Watermark type. Valid values:
<li>image: image watermark.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Watermark type. Valid values:
<li>image: image watermark.</li>
     * @param Type Watermark type. Valid values:
<li>image: image watermark.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Origin position. Valid values:
<li>TopLeft: indicates that the coordinate origin is at the top left corner of the video image and the watermark origin is at the top left corner of the image or text.</li>
<li>TopRight: indicates that the coordinate origin is at the top right corner of the video image and the watermark origin is at the top right corner of the image or text.</li>
<li>BottomLeft: indicates that the coordinate origin is at the bottom-left corner of the video image and the watermark origin is at the bottom-left corner of the image or text.</li>
<li>BottomRight: indicates that the coordinate origin is at the bottom right corner of the video image and the watermark origin is at the bottom right corner of the image or text.</li>
Default value: TopLeft. 
     * @return CoordinateOrigin Origin position. Valid values:
<li>TopLeft: indicates that the coordinate origin is at the top left corner of the video image and the watermark origin is at the top left corner of the image or text.</li>
<li>TopRight: indicates that the coordinate origin is at the top right corner of the video image and the watermark origin is at the top right corner of the image or text.</li>
<li>BottomLeft: indicates that the coordinate origin is at the bottom-left corner of the video image and the watermark origin is at the bottom-left corner of the image or text.</li>
<li>BottomRight: indicates that the coordinate origin is at the bottom right corner of the video image and the watermark origin is at the bottom right corner of the image or text.</li>
Default value: TopLeft.
     */
    public String getCoordinateOrigin() {
        return this.CoordinateOrigin;
    }

    /**
     * Set Origin position. Valid values:
<li>TopLeft: indicates that the coordinate origin is at the top left corner of the video image and the watermark origin is at the top left corner of the image or text.</li>
<li>TopRight: indicates that the coordinate origin is at the top right corner of the video image and the watermark origin is at the top right corner of the image or text.</li>
<li>BottomLeft: indicates that the coordinate origin is at the bottom-left corner of the video image and the watermark origin is at the bottom-left corner of the image or text.</li>
<li>BottomRight: indicates that the coordinate origin is at the bottom right corner of the video image and the watermark origin is at the bottom right corner of the image or text.</li>
Default value: TopLeft.
     * @param CoordinateOrigin Origin position. Valid values:
<li>TopLeft: indicates that the coordinate origin is at the top left corner of the video image and the watermark origin is at the top left corner of the image or text.</li>
<li>TopRight: indicates that the coordinate origin is at the top right corner of the video image and the watermark origin is at the top right corner of the image or text.</li>
<li>BottomLeft: indicates that the coordinate origin is at the bottom-left corner of the video image and the watermark origin is at the bottom-left corner of the image or text.</li>
<li>BottomRight: indicates that the coordinate origin is at the bottom right corner of the video image and the watermark origin is at the bottom right corner of the image or text.</li>
Default value: TopLeft.
     */
    public void setCoordinateOrigin(String CoordinateOrigin) {
        this.CoordinateOrigin = CoordinateOrigin;
    }

    /**
     * Get Horizontal position of the watermark origin from the origin of coordinates of the video image. Supports % and px formats.
<li>If a string ends with %, it indicates that the `XPos` of a watermark is a specified percentage of a video's width. For example, `10%` means that `XPos` is 10% of a video's width.</li>
<li>If a string ends with px, it means the watermark XPos is specified in pixels. For example, 100px means XPos is 100 pixels.</li>
Default value: 0px. 
     * @return XPos Horizontal position of the watermark origin from the origin of coordinates of the video image. Supports % and px formats.
<li>If a string ends with %, it indicates that the `XPos` of a watermark is a specified percentage of a video's width. For example, `10%` means that `XPos` is 10% of a video's width.</li>
<li>If a string ends with px, it means the watermark XPos is specified in pixels. For example, 100px means XPos is 100 pixels.</li>
Default value: 0px.
     */
    public String getXPos() {
        return this.XPos;
    }

    /**
     * Set Horizontal position of the watermark origin from the origin of coordinates of the video image. Supports % and px formats.
<li>If a string ends with %, it indicates that the `XPos` of a watermark is a specified percentage of a video's width. For example, `10%` means that `XPos` is 10% of a video's width.</li>
<li>If a string ends with px, it means the watermark XPos is specified in pixels. For example, 100px means XPos is 100 pixels.</li>
Default value: 0px.
     * @param XPos Horizontal position of the watermark origin from the origin of coordinates of the video image. Supports % and px formats.
<li>If a string ends with %, it indicates that the `XPos` of a watermark is a specified percentage of a video's width. For example, `10%` means that `XPos` is 10% of a video's width.</li>
<li>If a string ends with px, it means the watermark XPos is specified in pixels. For example, 100px means XPos is 100 pixels.</li>
Default value: 0px.
     */
    public void setXPos(String XPos) {
        this.XPos = XPos;
    }

    /**
     * Get Vertical position of the watermark origin relative to the origin of coordinates of the video image. Supports two formats: % and px.
<li>If a string ends with %, it indicates that the `YPos` of a watermark is a specified percentage of a video's height. For example, `10%` means that `YPos` is 10% of a video's height.</li>
<li>If a string ends with px, it means the watermark YPos is specified in pixels. For example, 100px means YPos is 100 pixels.</li>
Default value: 0px. 
     * @return YPos Vertical position of the watermark origin relative to the origin of coordinates of the video image. Supports two formats: % and px.
<li>If a string ends with %, it indicates that the `YPos` of a watermark is a specified percentage of a video's height. For example, `10%` means that `YPos` is 10% of a video's height.</li>
<li>If a string ends with px, it means the watermark YPos is specified in pixels. For example, 100px means YPos is 100 pixels.</li>
Default value: 0px.
     */
    public String getYPos() {
        return this.YPos;
    }

    /**
     * Set Vertical position of the watermark origin relative to the origin of coordinates of the video image. Supports two formats: % and px.
<li>If a string ends with %, it indicates that the `YPos` of a watermark is a specified percentage of a video's height. For example, `10%` means that `YPos` is 10% of a video's height.</li>
<li>If a string ends with px, it means the watermark YPos is specified in pixels. For example, 100px means YPos is 100 pixels.</li>
Default value: 0px.
     * @param YPos Vertical position of the watermark origin relative to the origin of coordinates of the video image. Supports two formats: % and px.
<li>If a string ends with %, it indicates that the `YPos` of a watermark is a specified percentage of a video's height. For example, `10%` means that `YPos` is 10% of a video's height.</li>
<li>If a string ends with px, it means the watermark YPos is specified in pixels. For example, 100px means YPos is 100 pixels.</li>
Default value: 0px.
     */
    public void setYPos(String YPos) {
        this.YPos = YPos;
    }

    /**
     * Get Image watermark template. This field is required when Type is image, and invalid when Type is text. 
     * @return ImageTemplate Image watermark template. This field is required when Type is image, and invalid when Type is text.
     */
    public RawImageWatermarkInput getImageTemplate() {
        return this.ImageTemplate;
    }

    /**
     * Set Image watermark template. This field is required when Type is image, and invalid when Type is text.
     * @param ImageTemplate Image watermark template. This field is required when Type is image, and invalid when Type is text.
     */
    public void setImageTemplate(RawImageWatermarkInput ImageTemplate) {
        this.ImageTemplate = ImageTemplate;
    }

    public RawWatermarkParameter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RawWatermarkParameter(RawWatermarkParameter source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.CoordinateOrigin != null) {
            this.CoordinateOrigin = new String(source.CoordinateOrigin);
        }
        if (source.XPos != null) {
            this.XPos = new String(source.XPos);
        }
        if (source.YPos != null) {
            this.YPos = new String(source.YPos);
        }
        if (source.ImageTemplate != null) {
            this.ImageTemplate = new RawImageWatermarkInput(source.ImageTemplate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CoordinateOrigin", this.CoordinateOrigin);
        this.setParamSimple(map, prefix + "XPos", this.XPos);
        this.setParamSimple(map, prefix + "YPos", this.YPos);
        this.setParamObj(map, prefix + "ImageTemplate.", this.ImageTemplate);

    }
}


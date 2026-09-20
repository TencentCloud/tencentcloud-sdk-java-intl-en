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

public class WatermarkTemplate extends AbstractModel {

    /**
    * Watermark template unique identifier.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Watermark type. Valid values:
<li>image: image watermark;</li>
<li>text: text watermark.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Watermark template name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Template description information.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Horizontal position of the watermark image origin point from the video origin point.
<li>If a string ends with %, it indicates that the `Left` of a watermark is a position at a specified percentage of a video's width. For example, `10%` means that `Left` is 10% of a video's width.</li>
<li>If a string ends with px, it means the watermark Left is at the specified pixel position of the video width. For example, 100px means Left is 100 pixels.</li>
    */
    @SerializedName("XPos")
    @Expose
    private String XPos;

    /**
    * Vertical position of the watermark image origin point from the video origin point.
<li>If a string ends with %, it indicates that the `Top` of a watermark is a location at a specified percentage of a video's height. For example, `10%` means that `Top` is 10% of a video's height.</li>
<li>If a string ends with px, it means the watermark Top is at the specified pixel position of the video height. For example, 100px means the Top is 100 pixels.</li>
    */
    @SerializedName("YPos")
    @Expose
    private String YPos;

    /**
    * Image watermark template. This field is valid only when Type is image.
    */
    @SerializedName("ImageTemplate")
    @Expose
    private ImageWatermarkTemplate ImageTemplate;

    /**
    * Text watermarking template. This field is valid only when Type is text.
    */
    @SerializedName("TextTemplate")
    @Expose
    private TextWatermarkTemplateInput TextTemplate;

    /**
    * SVG watermark template. This field is valid when Type is `svg`.
    */
    @SerializedName("SvgTemplate")
    @Expose
    private SvgWatermarkInput SvgTemplate;

    /**
    * Template creation time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Template last modified time, use [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Origin position. Valid values:
<li>topLeft: indicates that the coordinate origin is at the top left corner of the video image and the watermark origin is at the top left corner of the image or text.</li>
<li>topRight: indicates that the coordinate origin is at the top right corner of the video image and the watermark origin is at the top right corner of the image or text.</li>
<li>bottomLeft: indicates that the coordinate origin is at the bottom-left corner of the video image and the watermark origin is at the bottom-left corner of the image or text.</li>
<li>bottomRight: indicates that the coordinate origin is at the bottom-right corner of the video image and the watermark origin is at the lower-right of the image or text.</li>
    */
    @SerializedName("CoordinateOrigin")
    @Expose
    private String CoordinateOrigin;

    /**
     * Get Watermark template unique identifier. 
     * @return Definition Watermark template unique identifier.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Watermark template unique identifier.
     * @param Definition Watermark template unique identifier.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Watermark type. Valid values:
<li>image: image watermark;</li>
<li>text: text watermark.</li> 
     * @return Type Watermark type. Valid values:
<li>image: image watermark;</li>
<li>text: text watermark.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Watermark type. Valid values:
<li>image: image watermark;</li>
<li>text: text watermark.</li>
     * @param Type Watermark type. Valid values:
<li>image: image watermark;</li>
<li>text: text watermark.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Watermark template name. 
     * @return Name Watermark template name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Watermark template name.
     * @param Name Watermark template name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Template description information. 
     * @return Comment Template description information.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Template description information.
     * @param Comment Template description information.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get Horizontal position of the watermark image origin point from the video origin point.
<li>If a string ends with %, it indicates that the `Left` of a watermark is a position at a specified percentage of a video's width. For example, `10%` means that `Left` is 10% of a video's width.</li>
<li>If a string ends with px, it means the watermark Left is at the specified pixel position of the video width. For example, 100px means Left is 100 pixels.</li> 
     * @return XPos Horizontal position of the watermark image origin point from the video origin point.
<li>If a string ends with %, it indicates that the `Left` of a watermark is a position at a specified percentage of a video's width. For example, `10%` means that `Left` is 10% of a video's width.</li>
<li>If a string ends with px, it means the watermark Left is at the specified pixel position of the video width. For example, 100px means Left is 100 pixels.</li>
     */
    public String getXPos() {
        return this.XPos;
    }

    /**
     * Set Horizontal position of the watermark image origin point from the video origin point.
<li>If a string ends with %, it indicates that the `Left` of a watermark is a position at a specified percentage of a video's width. For example, `10%` means that `Left` is 10% of a video's width.</li>
<li>If a string ends with px, it means the watermark Left is at the specified pixel position of the video width. For example, 100px means Left is 100 pixels.</li>
     * @param XPos Horizontal position of the watermark image origin point from the video origin point.
<li>If a string ends with %, it indicates that the `Left` of a watermark is a position at a specified percentage of a video's width. For example, `10%` means that `Left` is 10% of a video's width.</li>
<li>If a string ends with px, it means the watermark Left is at the specified pixel position of the video width. For example, 100px means Left is 100 pixels.</li>
     */
    public void setXPos(String XPos) {
        this.XPos = XPos;
    }

    /**
     * Get Vertical position of the watermark image origin point from the video origin point.
<li>If a string ends with %, it indicates that the `Top` of a watermark is a location at a specified percentage of a video's height. For example, `10%` means that `Top` is 10% of a video's height.</li>
<li>If a string ends with px, it means the watermark Top is at the specified pixel position of the video height. For example, 100px means the Top is 100 pixels.</li> 
     * @return YPos Vertical position of the watermark image origin point from the video origin point.
<li>If a string ends with %, it indicates that the `Top` of a watermark is a location at a specified percentage of a video's height. For example, `10%` means that `Top` is 10% of a video's height.</li>
<li>If a string ends with px, it means the watermark Top is at the specified pixel position of the video height. For example, 100px means the Top is 100 pixels.</li>
     */
    public String getYPos() {
        return this.YPos;
    }

    /**
     * Set Vertical position of the watermark image origin point from the video origin point.
<li>If a string ends with %, it indicates that the `Top` of a watermark is a location at a specified percentage of a video's height. For example, `10%` means that `Top` is 10% of a video's height.</li>
<li>If a string ends with px, it means the watermark Top is at the specified pixel position of the video height. For example, 100px means the Top is 100 pixels.</li>
     * @param YPos Vertical position of the watermark image origin point from the video origin point.
<li>If a string ends with %, it indicates that the `Top` of a watermark is a location at a specified percentage of a video's height. For example, `10%` means that `Top` is 10% of a video's height.</li>
<li>If a string ends with px, it means the watermark Top is at the specified pixel position of the video height. For example, 100px means the Top is 100 pixels.</li>
     */
    public void setYPos(String YPos) {
        this.YPos = YPos;
    }

    /**
     * Get Image watermark template. This field is valid only when Type is image. 
     * @return ImageTemplate Image watermark template. This field is valid only when Type is image.
     */
    public ImageWatermarkTemplate getImageTemplate() {
        return this.ImageTemplate;
    }

    /**
     * Set Image watermark template. This field is valid only when Type is image.
     * @param ImageTemplate Image watermark template. This field is valid only when Type is image.
     */
    public void setImageTemplate(ImageWatermarkTemplate ImageTemplate) {
        this.ImageTemplate = ImageTemplate;
    }

    /**
     * Get Text watermarking template. This field is valid only when Type is text. 
     * @return TextTemplate Text watermarking template. This field is valid only when Type is text.
     */
    public TextWatermarkTemplateInput getTextTemplate() {
        return this.TextTemplate;
    }

    /**
     * Set Text watermarking template. This field is valid only when Type is text.
     * @param TextTemplate Text watermarking template. This field is valid only when Type is text.
     */
    public void setTextTemplate(TextWatermarkTemplateInput TextTemplate) {
        this.TextTemplate = TextTemplate;
    }

    /**
     * Get SVG watermark template. This field is valid when Type is `svg`. 
     * @return SvgTemplate SVG watermark template. This field is valid when Type is `svg`.
     */
    public SvgWatermarkInput getSvgTemplate() {
        return this.SvgTemplate;
    }

    /**
     * Set SVG watermark template. This field is valid when Type is `svg`.
     * @param SvgTemplate SVG watermark template. This field is valid when Type is `svg`.
     */
    public void setSvgTemplate(SvgWatermarkInput SvgTemplate) {
        this.SvgTemplate = SvgTemplate;
    }

    /**
     * Get Template creation time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return CreateTime Template creation time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Template creation time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param CreateTime Template creation time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Template last modified time, use [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return UpdateTime Template last modified time, use [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Template last modified time, use [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param UpdateTime Template last modified time, use [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Origin position. Valid values:
<li>topLeft: indicates that the coordinate origin is at the top left corner of the video image and the watermark origin is at the top left corner of the image or text.</li>
<li>topRight: indicates that the coordinate origin is at the top right corner of the video image and the watermark origin is at the top right corner of the image or text.</li>
<li>bottomLeft: indicates that the coordinate origin is at the bottom-left corner of the video image and the watermark origin is at the bottom-left corner of the image or text.</li>
<li>bottomRight: indicates that the coordinate origin is at the bottom-right corner of the video image and the watermark origin is at the lower-right of the image or text.</li> 
     * @return CoordinateOrigin Origin position. Valid values:
<li>topLeft: indicates that the coordinate origin is at the top left corner of the video image and the watermark origin is at the top left corner of the image or text.</li>
<li>topRight: indicates that the coordinate origin is at the top right corner of the video image and the watermark origin is at the top right corner of the image or text.</li>
<li>bottomLeft: indicates that the coordinate origin is at the bottom-left corner of the video image and the watermark origin is at the bottom-left corner of the image or text.</li>
<li>bottomRight: indicates that the coordinate origin is at the bottom-right corner of the video image and the watermark origin is at the lower-right of the image or text.</li>
     */
    public String getCoordinateOrigin() {
        return this.CoordinateOrigin;
    }

    /**
     * Set Origin position. Valid values:
<li>topLeft: indicates that the coordinate origin is at the top left corner of the video image and the watermark origin is at the top left corner of the image or text.</li>
<li>topRight: indicates that the coordinate origin is at the top right corner of the video image and the watermark origin is at the top right corner of the image or text.</li>
<li>bottomLeft: indicates that the coordinate origin is at the bottom-left corner of the video image and the watermark origin is at the bottom-left corner of the image or text.</li>
<li>bottomRight: indicates that the coordinate origin is at the bottom-right corner of the video image and the watermark origin is at the lower-right of the image or text.</li>
     * @param CoordinateOrigin Origin position. Valid values:
<li>topLeft: indicates that the coordinate origin is at the top left corner of the video image and the watermark origin is at the top left corner of the image or text.</li>
<li>topRight: indicates that the coordinate origin is at the top right corner of the video image and the watermark origin is at the top right corner of the image or text.</li>
<li>bottomLeft: indicates that the coordinate origin is at the bottom-left corner of the video image and the watermark origin is at the bottom-left corner of the image or text.</li>
<li>bottomRight: indicates that the coordinate origin is at the bottom-right corner of the video image and the watermark origin is at the lower-right of the image or text.</li>
     */
    public void setCoordinateOrigin(String CoordinateOrigin) {
        this.CoordinateOrigin = CoordinateOrigin;
    }

    public WatermarkTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WatermarkTemplate(WatermarkTemplate source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.XPos != null) {
            this.XPos = new String(source.XPos);
        }
        if (source.YPos != null) {
            this.YPos = new String(source.YPos);
        }
        if (source.ImageTemplate != null) {
            this.ImageTemplate = new ImageWatermarkTemplate(source.ImageTemplate);
        }
        if (source.TextTemplate != null) {
            this.TextTemplate = new TextWatermarkTemplateInput(source.TextTemplate);
        }
        if (source.SvgTemplate != null) {
            this.SvgTemplate = new SvgWatermarkInput(source.SvgTemplate);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.CoordinateOrigin != null) {
            this.CoordinateOrigin = new String(source.CoordinateOrigin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "XPos", this.XPos);
        this.setParamSimple(map, prefix + "YPos", this.YPos);
        this.setParamObj(map, prefix + "ImageTemplate.", this.ImageTemplate);
        this.setParamObj(map, prefix + "TextTemplate.", this.TextTemplate);
        this.setParamObj(map, prefix + "SvgTemplate.", this.SvgTemplate);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "CoordinateOrigin", this.CoordinateOrigin);

    }
}


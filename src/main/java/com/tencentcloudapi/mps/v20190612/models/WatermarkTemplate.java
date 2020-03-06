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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WatermarkTemplate extends AbstractModel{

    /**
    * Unique ID of a watermarking template.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Watermark type. Valid values:
<li>image: Image watermark;</li>
<li>text: Text watermark.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Name of a watermarking template.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Template description.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Horizontal position of the origin of the watermark image relative to the origin of the video.
<li>If the string ends in %, the `Left` edge of the watermark will be at the position of the specified percentage of the video width; for example, `10%` means that the `Left` edge is at 10% of the video width;</li>
<li>If the string ends in px, the `Left` edge of the watermark will be at the position of the specified px of the video width; for example, `100px` means that the `Left` edge is at the position of 100 px.</li>
    */
    @SerializedName("XPos")
    @Expose
    private String XPos;

    /**
    * Vertical position of the origin of the watermark image relative to the origin of the video.
<li>If the string ends in %, the `Top` edge of the watermark will beat the position of the specified percentage of the video height; for example, `10%` means that the `Top` edge is at 10% of the video height;</li>
<li>If the string ends in px, the `Top` edge of the watermark will be at the position of the specified px of the video height; for example, `100px` means that the `Top` edge is at the position of 100 px.</li>
    */
    @SerializedName("YPos")
    @Expose
    private String YPos;

    /**
    * Image watermarking template. This field is valid only when `Type` is `image`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ImageTemplate")
    @Expose
    private ImageWatermarkTemplate ImageTemplate;

    /**
    * Text watermarking template. This field is valid only when `Type` is `text`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TextTemplate")
    @Expose
    private TextWatermarkTemplateInput TextTemplate;

    /**
    * SVG watermarking template. This field is valid when `Type` is `svg`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SvgTemplate")
    @Expose
    private SvgWatermarkInput SvgTemplate;

    /**
    * Creation time of a template in [ISO date format](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last modified time of a template in [ISO date format](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Origin position. Valid values:
<li>topLeft: The origin of coordinates is in the top-left corner of the video, and the origin of the watermark is in the top-left corner of the image or text;</li>
<li>topRight: The origin of coordinates is in the top-right corner of the video, and the origin of the watermark is in the top-right corner of the image or text;</li>
<li>bottomLeft: The origin of coordinates is in the bottom-left corner of the video, and the origin of the watermark is in the bottom-left corner of the image or text;</li>
<li>bottomRight: The origin of coordinates is in the bottom-right corner of the video, and the origin of the watermark is in the bottom-right corner of the image or text.</li>
    */
    @SerializedName("CoordinateOrigin")
    @Expose
    private String CoordinateOrigin;

    /**
     * Get Unique ID of a watermarking template. 
     * @return Definition Unique ID of a watermarking template.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Unique ID of a watermarking template.
     * @param Definition Unique ID of a watermarking template.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Watermark type. Valid values:
<li>image: Image watermark;</li>
<li>text: Text watermark.</li> 
     * @return Type Watermark type. Valid values:
<li>image: Image watermark;</li>
<li>text: Text watermark.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Watermark type. Valid values:
<li>image: Image watermark;</li>
<li>text: Text watermark.</li>
     * @param Type Watermark type. Valid values:
<li>image: Image watermark;</li>
<li>text: Text watermark.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Name of a watermarking template. 
     * @return Name Name of a watermarking template.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of a watermarking template.
     * @param Name Name of a watermarking template.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Template description. 
     * @return Comment Template description.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Template description.
     * @param Comment Template description.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get Horizontal position of the origin of the watermark image relative to the origin of the video.
<li>If the string ends in %, the `Left` edge of the watermark will be at the position of the specified percentage of the video width; for example, `10%` means that the `Left` edge is at 10% of the video width;</li>
<li>If the string ends in px, the `Left` edge of the watermark will be at the position of the specified px of the video width; for example, `100px` means that the `Left` edge is at the position of 100 px.</li> 
     * @return XPos Horizontal position of the origin of the watermark image relative to the origin of the video.
<li>If the string ends in %, the `Left` edge of the watermark will be at the position of the specified percentage of the video width; for example, `10%` means that the `Left` edge is at 10% of the video width;</li>
<li>If the string ends in px, the `Left` edge of the watermark will be at the position of the specified px of the video width; for example, `100px` means that the `Left` edge is at the position of 100 px.</li>
     */
    public String getXPos() {
        return this.XPos;
    }

    /**
     * Set Horizontal position of the origin of the watermark image relative to the origin of the video.
<li>If the string ends in %, the `Left` edge of the watermark will be at the position of the specified percentage of the video width; for example, `10%` means that the `Left` edge is at 10% of the video width;</li>
<li>If the string ends in px, the `Left` edge of the watermark will be at the position of the specified px of the video width; for example, `100px` means that the `Left` edge is at the position of 100 px.</li>
     * @param XPos Horizontal position of the origin of the watermark image relative to the origin of the video.
<li>If the string ends in %, the `Left` edge of the watermark will be at the position of the specified percentage of the video width; for example, `10%` means that the `Left` edge is at 10% of the video width;</li>
<li>If the string ends in px, the `Left` edge of the watermark will be at the position of the specified px of the video width; for example, `100px` means that the `Left` edge is at the position of 100 px.</li>
     */
    public void setXPos(String XPos) {
        this.XPos = XPos;
    }

    /**
     * Get Vertical position of the origin of the watermark image relative to the origin of the video.
<li>If the string ends in %, the `Top` edge of the watermark will beat the position of the specified percentage of the video height; for example, `10%` means that the `Top` edge is at 10% of the video height;</li>
<li>If the string ends in px, the `Top` edge of the watermark will be at the position of the specified px of the video height; for example, `100px` means that the `Top` edge is at the position of 100 px.</li> 
     * @return YPos Vertical position of the origin of the watermark image relative to the origin of the video.
<li>If the string ends in %, the `Top` edge of the watermark will beat the position of the specified percentage of the video height; for example, `10%` means that the `Top` edge is at 10% of the video height;</li>
<li>If the string ends in px, the `Top` edge of the watermark will be at the position of the specified px of the video height; for example, `100px` means that the `Top` edge is at the position of 100 px.</li>
     */
    public String getYPos() {
        return this.YPos;
    }

    /**
     * Set Vertical position of the origin of the watermark image relative to the origin of the video.
<li>If the string ends in %, the `Top` edge of the watermark will beat the position of the specified percentage of the video height; for example, `10%` means that the `Top` edge is at 10% of the video height;</li>
<li>If the string ends in px, the `Top` edge of the watermark will be at the position of the specified px of the video height; for example, `100px` means that the `Top` edge is at the position of 100 px.</li>
     * @param YPos Vertical position of the origin of the watermark image relative to the origin of the video.
<li>If the string ends in %, the `Top` edge of the watermark will beat the position of the specified percentage of the video height; for example, `10%` means that the `Top` edge is at 10% of the video height;</li>
<li>If the string ends in px, the `Top` edge of the watermark will be at the position of the specified px of the video height; for example, `100px` means that the `Top` edge is at the position of 100 px.</li>
     */
    public void setYPos(String YPos) {
        this.YPos = YPos;
    }

    /**
     * Get Image watermarking template. This field is valid only when `Type` is `image`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ImageTemplate Image watermarking template. This field is valid only when `Type` is `image`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ImageWatermarkTemplate getImageTemplate() {
        return this.ImageTemplate;
    }

    /**
     * Set Image watermarking template. This field is valid only when `Type` is `image`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ImageTemplate Image watermarking template. This field is valid only when `Type` is `image`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setImageTemplate(ImageWatermarkTemplate ImageTemplate) {
        this.ImageTemplate = ImageTemplate;
    }

    /**
     * Get Text watermarking template. This field is valid only when `Type` is `text`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TextTemplate Text watermarking template. This field is valid only when `Type` is `text`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TextWatermarkTemplateInput getTextTemplate() {
        return this.TextTemplate;
    }

    /**
     * Set Text watermarking template. This field is valid only when `Type` is `text`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TextTemplate Text watermarking template. This field is valid only when `Type` is `text`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTextTemplate(TextWatermarkTemplateInput TextTemplate) {
        this.TextTemplate = TextTemplate;
    }

    /**
     * Get SVG watermarking template. This field is valid when `Type` is `svg`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SvgTemplate SVG watermarking template. This field is valid when `Type` is `svg`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SvgWatermarkInput getSvgTemplate() {
        return this.SvgTemplate;
    }

    /**
     * Set SVG watermarking template. This field is valid when `Type` is `svg`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SvgTemplate SVG watermarking template. This field is valid when `Type` is `svg`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSvgTemplate(SvgWatermarkInput SvgTemplate) {
        this.SvgTemplate = SvgTemplate;
    }

    /**
     * Get Creation time of a template in [ISO date format](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F). 
     * @return CreateTime Creation time of a template in [ISO date format](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time of a template in [ISO date format](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     * @param CreateTime Creation time of a template in [ISO date format](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last modified time of a template in [ISO date format](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F). 
     * @return UpdateTime Last modified time of a template in [ISO date format](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last modified time of a template in [ISO date format](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     * @param UpdateTime Last modified time of a template in [ISO date format](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Origin position. Valid values:
<li>topLeft: The origin of coordinates is in the top-left corner of the video, and the origin of the watermark is in the top-left corner of the image or text;</li>
<li>topRight: The origin of coordinates is in the top-right corner of the video, and the origin of the watermark is in the top-right corner of the image or text;</li>
<li>bottomLeft: The origin of coordinates is in the bottom-left corner of the video, and the origin of the watermark is in the bottom-left corner of the image or text;</li>
<li>bottomRight: The origin of coordinates is in the bottom-right corner of the video, and the origin of the watermark is in the bottom-right corner of the image or text.</li> 
     * @return CoordinateOrigin Origin position. Valid values:
<li>topLeft: The origin of coordinates is in the top-left corner of the video, and the origin of the watermark is in the top-left corner of the image or text;</li>
<li>topRight: The origin of coordinates is in the top-right corner of the video, and the origin of the watermark is in the top-right corner of the image or text;</li>
<li>bottomLeft: The origin of coordinates is in the bottom-left corner of the video, and the origin of the watermark is in the bottom-left corner of the image or text;</li>
<li>bottomRight: The origin of coordinates is in the bottom-right corner of the video, and the origin of the watermark is in the bottom-right corner of the image or text.</li>
     */
    public String getCoordinateOrigin() {
        return this.CoordinateOrigin;
    }

    /**
     * Set Origin position. Valid values:
<li>topLeft: The origin of coordinates is in the top-left corner of the video, and the origin of the watermark is in the top-left corner of the image or text;</li>
<li>topRight: The origin of coordinates is in the top-right corner of the video, and the origin of the watermark is in the top-right corner of the image or text;</li>
<li>bottomLeft: The origin of coordinates is in the bottom-left corner of the video, and the origin of the watermark is in the bottom-left corner of the image or text;</li>
<li>bottomRight: The origin of coordinates is in the bottom-right corner of the video, and the origin of the watermark is in the bottom-right corner of the image or text.</li>
     * @param CoordinateOrigin Origin position. Valid values:
<li>topLeft: The origin of coordinates is in the top-left corner of the video, and the origin of the watermark is in the top-left corner of the image or text;</li>
<li>topRight: The origin of coordinates is in the top-right corner of the video, and the origin of the watermark is in the top-right corner of the image or text;</li>
<li>bottomLeft: The origin of coordinates is in the bottom-left corner of the video, and the origin of the watermark is in the bottom-left corner of the image or text;</li>
<li>bottomRight: The origin of coordinates is in the bottom-right corner of the video, and the origin of the watermark is in the bottom-right corner of the image or text.</li>
     */
    public void setCoordinateOrigin(String CoordinateOrigin) {
        this.CoordinateOrigin = CoordinateOrigin;
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


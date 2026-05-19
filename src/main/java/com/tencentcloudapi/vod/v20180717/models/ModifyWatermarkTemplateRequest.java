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

public class ModifyWatermarkTemplateRequest extends AbstractModel {

    /**
    * Unique identifier of the watermark template.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Watermark template name. The length cannot exceed 64 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Template description, with a length limit of 256 characters.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Origin position. Valid values:
<li>TopLeft: indicates that the coordinate origin is at the top left corner of the video image and the watermark origin is at the top left corner of the image or text.</li>
<li>TopRight: indicates that the coordinate origin is at the top right corner of the video image and the watermark origin is at the top right corner of the image or text.</li>
<li>BottomLeft: indicates that the coordinate origin is at the bottom left corner of the video image and the watermark origin is at the bottom left corner of the image or text.</li>
<li>BottomRight: indicates that the coordinate origin is at the bottom right corner of the video image and the watermark origin is at the bottom right corner of the image or text.</li>
    */
    @SerializedName("CoordinateOrigin")
    @Expose
    private String CoordinateOrigin;

    /**
    * The horizontal position of the watermark origin from the origin of coordinates of the video image. Support two formats: % and px.
<li>If a string ends with %, it indicates that the `XPos` of a watermark is a specified percentage of a video's width. For example, `10%` means that `XPos` is 10% of a video's width.</li>
<li>If a string ends with px, it means the watermark XPos is specified in pixels, for example, 100px means the XPos is 100 pixels.</li>
    */
    @SerializedName("XPos")
    @Expose
    private String XPos;

    /**
    * Vertical position of the watermark origin from the origin of coordinates of the video image. Support two formats: % and px.
<li>If a string ends with %, it indicates that the `YPos` of a watermark is a specified percentage of a video's height. For example, `10%` means that `YPos` is 10% of a video's height.</li>
<li>If a string ends with px, it means the watermark YPos is specified in pixels, for example, 100px means YPos is 100 pixels.</li>
    */
    @SerializedName("YPos")
    @Expose
    private String YPos;

    /**
    * Image watermark template. This field is only applicable to image watermark templates.
    */
    @SerializedName("ImageTemplate")
    @Expose
    private ImageWatermarkInputForUpdate ImageTemplate;

    /**
    * Text watermarking template. This field is only applicable to text watermarking templates.
    */
    @SerializedName("TextTemplate")
    @Expose
    private TextWatermarkTemplateInputForUpdate TextTemplate;

    /**
    * SVG watermark template. This field is only applicable to SVG watermark templates.
    */
    @SerializedName("SvgTemplate")
    @Expose
    private SvgWatermarkInputForUpdate SvgTemplate;

    /**
     * Get Unique identifier of the watermark template. 
     * @return Definition Unique identifier of the watermark template.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Unique identifier of the watermark template.
     * @param Definition Unique identifier of the watermark template.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b> 
     * @return SubAppId <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b>
     * @param SubAppId <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Watermark template name. The length cannot exceed 64 characters. 
     * @return Name Watermark template name. The length cannot exceed 64 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Watermark template name. The length cannot exceed 64 characters.
     * @param Name Watermark template name. The length cannot exceed 64 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Template description, with a length limit of 256 characters. 
     * @return Comment Template description, with a length limit of 256 characters.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Template description, with a length limit of 256 characters.
     * @param Comment Template description, with a length limit of 256 characters.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get Origin position. Valid values:
<li>TopLeft: indicates that the coordinate origin is at the top left corner of the video image and the watermark origin is at the top left corner of the image or text.</li>
<li>TopRight: indicates that the coordinate origin is at the top right corner of the video image and the watermark origin is at the top right corner of the image or text.</li>
<li>BottomLeft: indicates that the coordinate origin is at the bottom left corner of the video image and the watermark origin is at the bottom left corner of the image or text.</li>
<li>BottomRight: indicates that the coordinate origin is at the bottom right corner of the video image and the watermark origin is at the bottom right corner of the image or text.</li> 
     * @return CoordinateOrigin Origin position. Valid values:
<li>TopLeft: indicates that the coordinate origin is at the top left corner of the video image and the watermark origin is at the top left corner of the image or text.</li>
<li>TopRight: indicates that the coordinate origin is at the top right corner of the video image and the watermark origin is at the top right corner of the image or text.</li>
<li>BottomLeft: indicates that the coordinate origin is at the bottom left corner of the video image and the watermark origin is at the bottom left corner of the image or text.</li>
<li>BottomRight: indicates that the coordinate origin is at the bottom right corner of the video image and the watermark origin is at the bottom right corner of the image or text.</li>
     */
    public String getCoordinateOrigin() {
        return this.CoordinateOrigin;
    }

    /**
     * Set Origin position. Valid values:
<li>TopLeft: indicates that the coordinate origin is at the top left corner of the video image and the watermark origin is at the top left corner of the image or text.</li>
<li>TopRight: indicates that the coordinate origin is at the top right corner of the video image and the watermark origin is at the top right corner of the image or text.</li>
<li>BottomLeft: indicates that the coordinate origin is at the bottom left corner of the video image and the watermark origin is at the bottom left corner of the image or text.</li>
<li>BottomRight: indicates that the coordinate origin is at the bottom right corner of the video image and the watermark origin is at the bottom right corner of the image or text.</li>
     * @param CoordinateOrigin Origin position. Valid values:
<li>TopLeft: indicates that the coordinate origin is at the top left corner of the video image and the watermark origin is at the top left corner of the image or text.</li>
<li>TopRight: indicates that the coordinate origin is at the top right corner of the video image and the watermark origin is at the top right corner of the image or text.</li>
<li>BottomLeft: indicates that the coordinate origin is at the bottom left corner of the video image and the watermark origin is at the bottom left corner of the image or text.</li>
<li>BottomRight: indicates that the coordinate origin is at the bottom right corner of the video image and the watermark origin is at the bottom right corner of the image or text.</li>
     */
    public void setCoordinateOrigin(String CoordinateOrigin) {
        this.CoordinateOrigin = CoordinateOrigin;
    }

    /**
     * Get The horizontal position of the watermark origin from the origin of coordinates of the video image. Support two formats: % and px.
<li>If a string ends with %, it indicates that the `XPos` of a watermark is a specified percentage of a video's width. For example, `10%` means that `XPos` is 10% of a video's width.</li>
<li>If a string ends with px, it means the watermark XPos is specified in pixels, for example, 100px means the XPos is 100 pixels.</li> 
     * @return XPos The horizontal position of the watermark origin from the origin of coordinates of the video image. Support two formats: % and px.
<li>If a string ends with %, it indicates that the `XPos` of a watermark is a specified percentage of a video's width. For example, `10%` means that `XPos` is 10% of a video's width.</li>
<li>If a string ends with px, it means the watermark XPos is specified in pixels, for example, 100px means the XPos is 100 pixels.</li>
     */
    public String getXPos() {
        return this.XPos;
    }

    /**
     * Set The horizontal position of the watermark origin from the origin of coordinates of the video image. Support two formats: % and px.
<li>If a string ends with %, it indicates that the `XPos` of a watermark is a specified percentage of a video's width. For example, `10%` means that `XPos` is 10% of a video's width.</li>
<li>If a string ends with px, it means the watermark XPos is specified in pixels, for example, 100px means the XPos is 100 pixels.</li>
     * @param XPos The horizontal position of the watermark origin from the origin of coordinates of the video image. Support two formats: % and px.
<li>If a string ends with %, it indicates that the `XPos` of a watermark is a specified percentage of a video's width. For example, `10%` means that `XPos` is 10% of a video's width.</li>
<li>If a string ends with px, it means the watermark XPos is specified in pixels, for example, 100px means the XPos is 100 pixels.</li>
     */
    public void setXPos(String XPos) {
        this.XPos = XPos;
    }

    /**
     * Get Vertical position of the watermark origin from the origin of coordinates of the video image. Support two formats: % and px.
<li>If a string ends with %, it indicates that the `YPos` of a watermark is a specified percentage of a video's height. For example, `10%` means that `YPos` is 10% of a video's height.</li>
<li>If a string ends with px, it means the watermark YPos is specified in pixels, for example, 100px means YPos is 100 pixels.</li> 
     * @return YPos Vertical position of the watermark origin from the origin of coordinates of the video image. Support two formats: % and px.
<li>If a string ends with %, it indicates that the `YPos` of a watermark is a specified percentage of a video's height. For example, `10%` means that `YPos` is 10% of a video's height.</li>
<li>If a string ends with px, it means the watermark YPos is specified in pixels, for example, 100px means YPos is 100 pixels.</li>
     */
    public String getYPos() {
        return this.YPos;
    }

    /**
     * Set Vertical position of the watermark origin from the origin of coordinates of the video image. Support two formats: % and px.
<li>If a string ends with %, it indicates that the `YPos` of a watermark is a specified percentage of a video's height. For example, `10%` means that `YPos` is 10% of a video's height.</li>
<li>If a string ends with px, it means the watermark YPos is specified in pixels, for example, 100px means YPos is 100 pixels.</li>
     * @param YPos Vertical position of the watermark origin from the origin of coordinates of the video image. Support two formats: % and px.
<li>If a string ends with %, it indicates that the `YPos` of a watermark is a specified percentage of a video's height. For example, `10%` means that `YPos` is 10% of a video's height.</li>
<li>If a string ends with px, it means the watermark YPos is specified in pixels, for example, 100px means YPos is 100 pixels.</li>
     */
    public void setYPos(String YPos) {
        this.YPos = YPos;
    }

    /**
     * Get Image watermark template. This field is only applicable to image watermark templates. 
     * @return ImageTemplate Image watermark template. This field is only applicable to image watermark templates.
     */
    public ImageWatermarkInputForUpdate getImageTemplate() {
        return this.ImageTemplate;
    }

    /**
     * Set Image watermark template. This field is only applicable to image watermark templates.
     * @param ImageTemplate Image watermark template. This field is only applicable to image watermark templates.
     */
    public void setImageTemplate(ImageWatermarkInputForUpdate ImageTemplate) {
        this.ImageTemplate = ImageTemplate;
    }

    /**
     * Get Text watermarking template. This field is only applicable to text watermarking templates. 
     * @return TextTemplate Text watermarking template. This field is only applicable to text watermarking templates.
     */
    public TextWatermarkTemplateInputForUpdate getTextTemplate() {
        return this.TextTemplate;
    }

    /**
     * Set Text watermarking template. This field is only applicable to text watermarking templates.
     * @param TextTemplate Text watermarking template. This field is only applicable to text watermarking templates.
     */
    public void setTextTemplate(TextWatermarkTemplateInputForUpdate TextTemplate) {
        this.TextTemplate = TextTemplate;
    }

    /**
     * Get SVG watermark template. This field is only applicable to SVG watermark templates. 
     * @return SvgTemplate SVG watermark template. This field is only applicable to SVG watermark templates.
     */
    public SvgWatermarkInputForUpdate getSvgTemplate() {
        return this.SvgTemplate;
    }

    /**
     * Set SVG watermark template. This field is only applicable to SVG watermark templates.
     * @param SvgTemplate SVG watermark template. This field is only applicable to SVG watermark templates.
     */
    public void setSvgTemplate(SvgWatermarkInputForUpdate SvgTemplate) {
        this.SvgTemplate = SvgTemplate;
    }

    public ModifyWatermarkTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyWatermarkTemplateRequest(ModifyWatermarkTemplateRequest source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
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
            this.ImageTemplate = new ImageWatermarkInputForUpdate(source.ImageTemplate);
        }
        if (source.TextTemplate != null) {
            this.TextTemplate = new TextWatermarkTemplateInputForUpdate(source.TextTemplate);
        }
        if (source.SvgTemplate != null) {
            this.SvgTemplate = new SvgWatermarkInputForUpdate(source.SvgTemplate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "CoordinateOrigin", this.CoordinateOrigin);
        this.setParamSimple(map, prefix + "XPos", this.XPos);
        this.setParamSimple(map, prefix + "YPos", this.YPos);
        this.setParamObj(map, prefix + "ImageTemplate.", this.ImageTemplate);
        this.setParamObj(map, prefix + "TextTemplate.", this.TextTemplate);
        this.setParamObj(map, prefix + "SvgTemplate.", this.SvgTemplate);

    }
}


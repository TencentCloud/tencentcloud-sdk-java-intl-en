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

public class ImageSpriteTemplate extends AbstractModel {

    /**
    * Unique identifier of the sprite template.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Template type. Valid values:
<li>Preset: system-preset template;</li>
<li>Custom: custom template.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Sprite sheet template name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Maximum width (or long side) of small images in the sprite image. Value range: 0 and [128, 4096]. Unit: px.
<li>If both Width and Height are 0, the resolution is the same as the source.</li>
<li>If Width is 0 but Height is not 0, the width will be proportionally scaled.</li>
<li>If Width is not 0 but Height is 0, the height will be proportionally scaled.</li>
<li>If both Width and Height are not 0, the resolution is as specified by the user.</li>
Default value: 0.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Maximum height (or short side) of small images in the sprite image. Value range: 0 and [128, 4096]. Unit: px.
<li>If both Width and Height are 0, the resolution is the same as the source.</li>
<li>If Width is 0 but Height is not 0, the width will be proportionally scaled.</li>
<li>If Width is not 0 but Height is 0, the height will be proportionally scaled.</li>
<li>If both Width and Height are not 0, the resolution is as specified by the user.</li>
Default value: 0.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * Resolution adaptation. Available values:
<li>open: enabled. At this point, Width represents the long side of the video, and Height indicates the short side of the video;</li>
<li>close: closed. At this point, Width represents the video width, and Height represents the video height.</li>
Default value: open.
    */
    @SerializedName("ResolutionAdaptive")
    @Expose
    private String ResolutionAdaptive;

    /**
    * Sampling type.
    */
    @SerializedName("SampleType")
    @Expose
    private String SampleType;

    /**
    * Sampling interval.
    */
    @SerializedName("SampleInterval")
    @Expose
    private Long SampleInterval;

    /**
    * Number of rows of small images in the sprite image.
    */
    @SerializedName("RowCount")
    @Expose
    private Long RowCount;

    /**
    * Number of columns of small images in the sprite image.
    */
    @SerializedName("ColumnCount")
    @Expose
    private Long ColumnCount;

    /**
    * Template creation time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Template last modified time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Filling method. When the video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the processing method for transcoding is "padding". Optional filling methods:
<li> stretch: Stretch each frame to fill the entire screen, which may cause the transcoded video to be "squashed" or "stretched";</li>
<li>black: black bars, maintain video aspect ratio, edges filled with black.</li>
Default value: black.
    */
    @SerializedName("FillType")
    @Expose
    private String FillType;

    /**
    * Template description information.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Image format.
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
     * Get Unique identifier of the sprite template. 
     * @return Definition Unique identifier of the sprite template.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Unique identifier of the sprite template.
     * @param Definition Unique identifier of the sprite template.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Template type. Valid values:
<li>Preset: system-preset template;</li>
<li>Custom: custom template.</li> 
     * @return Type Template type. Valid values:
<li>Preset: system-preset template;</li>
<li>Custom: custom template.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Template type. Valid values:
<li>Preset: system-preset template;</li>
<li>Custom: custom template.</li>
     * @param Type Template type. Valid values:
<li>Preset: system-preset template;</li>
<li>Custom: custom template.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Sprite sheet template name. 
     * @return Name Sprite sheet template name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Sprite sheet template name.
     * @param Name Sprite sheet template name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Maximum width (or long side) of small images in the sprite image. Value range: 0 and [128, 4096]. Unit: px.
<li>If both Width and Height are 0, the resolution is the same as the source.</li>
<li>If Width is 0 but Height is not 0, the width will be proportionally scaled.</li>
<li>If Width is not 0 but Height is 0, the height will be proportionally scaled.</li>
<li>If both Width and Height are not 0, the resolution is as specified by the user.</li>
Default value: 0. 
     * @return Width Maximum width (or long side) of small images in the sprite image. Value range: 0 and [128, 4096]. Unit: px.
<li>If both Width and Height are 0, the resolution is the same as the source.</li>
<li>If Width is 0 but Height is not 0, the width will be proportionally scaled.</li>
<li>If Width is not 0 but Height is 0, the height will be proportionally scaled.</li>
<li>If both Width and Height are not 0, the resolution is as specified by the user.</li>
Default value: 0.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Maximum width (or long side) of small images in the sprite image. Value range: 0 and [128, 4096]. Unit: px.
<li>If both Width and Height are 0, the resolution is the same as the source.</li>
<li>If Width is 0 but Height is not 0, the width will be proportionally scaled.</li>
<li>If Width is not 0 but Height is 0, the height will be proportionally scaled.</li>
<li>If both Width and Height are not 0, the resolution is as specified by the user.</li>
Default value: 0.
     * @param Width Maximum width (or long side) of small images in the sprite image. Value range: 0 and [128, 4096]. Unit: px.
<li>If both Width and Height are 0, the resolution is the same as the source.</li>
<li>If Width is 0 but Height is not 0, the width will be proportionally scaled.</li>
<li>If Width is not 0 but Height is 0, the height will be proportionally scaled.</li>
<li>If both Width and Height are not 0, the resolution is as specified by the user.</li>
Default value: 0.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Maximum height (or short side) of small images in the sprite image. Value range: 0 and [128, 4096]. Unit: px.
<li>If both Width and Height are 0, the resolution is the same as the source.</li>
<li>If Width is 0 but Height is not 0, the width will be proportionally scaled.</li>
<li>If Width is not 0 but Height is 0, the height will be proportionally scaled.</li>
<li>If both Width and Height are not 0, the resolution is as specified by the user.</li>
Default value: 0. 
     * @return Height Maximum height (or short side) of small images in the sprite image. Value range: 0 and [128, 4096]. Unit: px.
<li>If both Width and Height are 0, the resolution is the same as the source.</li>
<li>If Width is 0 but Height is not 0, the width will be proportionally scaled.</li>
<li>If Width is not 0 but Height is 0, the height will be proportionally scaled.</li>
<li>If both Width and Height are not 0, the resolution is as specified by the user.</li>
Default value: 0.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Maximum height (or short side) of small images in the sprite image. Value range: 0 and [128, 4096]. Unit: px.
<li>If both Width and Height are 0, the resolution is the same as the source.</li>
<li>If Width is 0 but Height is not 0, the width will be proportionally scaled.</li>
<li>If Width is not 0 but Height is 0, the height will be proportionally scaled.</li>
<li>If both Width and Height are not 0, the resolution is as specified by the user.</li>
Default value: 0.
     * @param Height Maximum height (or short side) of small images in the sprite image. Value range: 0 and [128, 4096]. Unit: px.
<li>If both Width and Height are 0, the resolution is the same as the source.</li>
<li>If Width is 0 but Height is not 0, the width will be proportionally scaled.</li>
<li>If Width is not 0 but Height is 0, the height will be proportionally scaled.</li>
<li>If both Width and Height are not 0, the resolution is as specified by the user.</li>
Default value: 0.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get Resolution adaptation. Available values:
<li>open: enabled. At this point, Width represents the long side of the video, and Height indicates the short side of the video;</li>
<li>close: closed. At this point, Width represents the video width, and Height represents the video height.</li>
Default value: open. 
     * @return ResolutionAdaptive Resolution adaptation. Available values:
<li>open: enabled. At this point, Width represents the long side of the video, and Height indicates the short side of the video;</li>
<li>close: closed. At this point, Width represents the video width, and Height represents the video height.</li>
Default value: open.
     */
    public String getResolutionAdaptive() {
        return this.ResolutionAdaptive;
    }

    /**
     * Set Resolution adaptation. Available values:
<li>open: enabled. At this point, Width represents the long side of the video, and Height indicates the short side of the video;</li>
<li>close: closed. At this point, Width represents the video width, and Height represents the video height.</li>
Default value: open.
     * @param ResolutionAdaptive Resolution adaptation. Available values:
<li>open: enabled. At this point, Width represents the long side of the video, and Height indicates the short side of the video;</li>
<li>close: closed. At this point, Width represents the video width, and Height represents the video height.</li>
Default value: open.
     */
    public void setResolutionAdaptive(String ResolutionAdaptive) {
        this.ResolutionAdaptive = ResolutionAdaptive;
    }

    /**
     * Get Sampling type. 
     * @return SampleType Sampling type.
     */
    public String getSampleType() {
        return this.SampleType;
    }

    /**
     * Set Sampling type.
     * @param SampleType Sampling type.
     */
    public void setSampleType(String SampleType) {
        this.SampleType = SampleType;
    }

    /**
     * Get Sampling interval. 
     * @return SampleInterval Sampling interval.
     */
    public Long getSampleInterval() {
        return this.SampleInterval;
    }

    /**
     * Set Sampling interval.
     * @param SampleInterval Sampling interval.
     */
    public void setSampleInterval(Long SampleInterval) {
        this.SampleInterval = SampleInterval;
    }

    /**
     * Get Number of rows of small images in the sprite image. 
     * @return RowCount Number of rows of small images in the sprite image.
     */
    public Long getRowCount() {
        return this.RowCount;
    }

    /**
     * Set Number of rows of small images in the sprite image.
     * @param RowCount Number of rows of small images in the sprite image.
     */
    public void setRowCount(Long RowCount) {
        this.RowCount = RowCount;
    }

    /**
     * Get Number of columns of small images in the sprite image. 
     * @return ColumnCount Number of columns of small images in the sprite image.
     */
    public Long getColumnCount() {
        return this.ColumnCount;
    }

    /**
     * Set Number of columns of small images in the sprite image.
     * @param ColumnCount Number of columns of small images in the sprite image.
     */
    public void setColumnCount(Long ColumnCount) {
        this.ColumnCount = ColumnCount;
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
     * Get Template last modified time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return UpdateTime Template last modified time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Template last modified time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param UpdateTime Template last modified time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Filling method. When the video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the processing method for transcoding is "padding". Optional filling methods:
<li> stretch: Stretch each frame to fill the entire screen, which may cause the transcoded video to be "squashed" or "stretched";</li>
<li>black: black bars, maintain video aspect ratio, edges filled with black.</li>
Default value: black. 
     * @return FillType Filling method. When the video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the processing method for transcoding is "padding". Optional filling methods:
<li> stretch: Stretch each frame to fill the entire screen, which may cause the transcoded video to be "squashed" or "stretched";</li>
<li>black: black bars, maintain video aspect ratio, edges filled with black.</li>
Default value: black.
     */
    public String getFillType() {
        return this.FillType;
    }

    /**
     * Set Filling method. When the video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the processing method for transcoding is "padding". Optional filling methods:
<li> stretch: Stretch each frame to fill the entire screen, which may cause the transcoded video to be "squashed" or "stretched";</li>
<li>black: black bars, maintain video aspect ratio, edges filled with black.</li>
Default value: black.
     * @param FillType Filling method. When the video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the processing method for transcoding is "padding". Optional filling methods:
<li> stretch: Stretch each frame to fill the entire screen, which may cause the transcoded video to be "squashed" or "stretched";</li>
<li>black: black bars, maintain video aspect ratio, edges filled with black.</li>
Default value: black.
     */
    public void setFillType(String FillType) {
        this.FillType = FillType;
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
     * Get Image format. 
     * @return Format Image format.
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set Image format.
     * @param Format Image format.
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    public ImageSpriteTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageSpriteTemplate(ImageSpriteTemplate source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.ResolutionAdaptive != null) {
            this.ResolutionAdaptive = new String(source.ResolutionAdaptive);
        }
        if (source.SampleType != null) {
            this.SampleType = new String(source.SampleType);
        }
        if (source.SampleInterval != null) {
            this.SampleInterval = new Long(source.SampleInterval);
        }
        if (source.RowCount != null) {
            this.RowCount = new Long(source.RowCount);
        }
        if (source.ColumnCount != null) {
            this.ColumnCount = new Long(source.ColumnCount);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.FillType != null) {
            this.FillType = new String(source.FillType);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "ResolutionAdaptive", this.ResolutionAdaptive);
        this.setParamSimple(map, prefix + "SampleType", this.SampleType);
        this.setParamSimple(map, prefix + "SampleInterval", this.SampleInterval);
        this.setParamSimple(map, prefix + "RowCount", this.RowCount);
        this.setParamSimple(map, prefix + "ColumnCount", this.ColumnCount);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "FillType", this.FillType);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "Format", this.Format);

    }
}


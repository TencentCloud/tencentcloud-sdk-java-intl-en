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

public class ModifyImageSpriteTemplateRequest extends AbstractModel {

    /**
    * Unique identifier of the sprite template.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate VOD services after December 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications (whether default or newly created).</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Sprite image template name. Length limit: 64 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Width of small images in sprite image, in the range of [32, 4096], unit: px.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Height of small images in sprite image, in the range of [32, 4096], unit: px.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * Resolution adaptation, available values:
<li>open: start. At this point, Width represents the long side of the video, and Height indicates the short side of the video;</li>
<li>close: Close. At this point, Width represents the width of the video, and Height indicates the height of the video.</li>
Default value: open.
    */
    @SerializedName("ResolutionAdaptive")
    @Expose
    private String ResolutionAdaptive;

    /**
    * Sampling type, Valid value:
<li>Percent: by percent.</li>
<li>Time: By time interval.</li>
    */
    @SerializedName("SampleType")
    @Expose
    private String SampleType;

    /**
    * Sampling interval.
<li>When SampleType is Percent, specify the percentage of the sampling interval.</li>
<li>When SampleType is Time, specify the sampling interval in seconds.</li>
    */
    @SerializedName("SampleInterval")
    @Expose
    private Long SampleInterval;

    /**
    * Number of rows of small images in sprite image.
    */
    @SerializedName("RowCount")
    @Expose
    private Long RowCount;

    /**
    * Number of columns of small images in sprite image.
    */
    @SerializedName("ColumnCount")
    @Expose
    private Long ColumnCount;

    /**
    * Filling method. When video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the processing method for transcoding is "fill". Optional filling modes: <li>stretch: stretch each frame to fill the entire screen, possibly causing the transcoded video to be squashed or stretched;</li><li>black: maintain video aspect ratio, remaining edge part filled with black;</li><li>white: maintain video aspect ratio, remaining edge part filled with white;</li><li>gauss: maintain video aspect ratio, remaining edge part filled with Gaussian blur.</li>Default value: black.
    */
    @SerializedName("FillType")
    @Expose
    private String FillType;

    /**
    * Template description, with a length limit of 256 characters.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Image format. Value:
<li> jpg: jpg format;</li>
<li>png: png format.</li>
<li>WEBP: webp format.</li>
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
     * Get <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate VOD services after December 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications (whether default or newly created).</b> 
     * @return SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate VOD services after December 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications (whether default or newly created).</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate VOD services after December 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications (whether default or newly created).</b>
     * @param SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate VOD services after December 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications (whether default or newly created).</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Sprite image template name. Length limit: 64 characters. 
     * @return Name Sprite image template name. Length limit: 64 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Sprite image template name. Length limit: 64 characters.
     * @param Name Sprite image template name. Length limit: 64 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Width of small images in sprite image, in the range of [32, 4096], unit: px. 
     * @return Width Width of small images in sprite image, in the range of [32, 4096], unit: px.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Width of small images in sprite image, in the range of [32, 4096], unit: px.
     * @param Width Width of small images in sprite image, in the range of [32, 4096], unit: px.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Height of small images in sprite image, in the range of [32, 4096], unit: px. 
     * @return Height Height of small images in sprite image, in the range of [32, 4096], unit: px.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Height of small images in sprite image, in the range of [32, 4096], unit: px.
     * @param Height Height of small images in sprite image, in the range of [32, 4096], unit: px.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get Resolution adaptation, available values:
<li>open: start. At this point, Width represents the long side of the video, and Height indicates the short side of the video;</li>
<li>close: Close. At this point, Width represents the width of the video, and Height indicates the height of the video.</li>
Default value: open. 
     * @return ResolutionAdaptive Resolution adaptation, available values:
<li>open: start. At this point, Width represents the long side of the video, and Height indicates the short side of the video;</li>
<li>close: Close. At this point, Width represents the width of the video, and Height indicates the height of the video.</li>
Default value: open.
     */
    public String getResolutionAdaptive() {
        return this.ResolutionAdaptive;
    }

    /**
     * Set Resolution adaptation, available values:
<li>open: start. At this point, Width represents the long side of the video, and Height indicates the short side of the video;</li>
<li>close: Close. At this point, Width represents the width of the video, and Height indicates the height of the video.</li>
Default value: open.
     * @param ResolutionAdaptive Resolution adaptation, available values:
<li>open: start. At this point, Width represents the long side of the video, and Height indicates the short side of the video;</li>
<li>close: Close. At this point, Width represents the width of the video, and Height indicates the height of the video.</li>
Default value: open.
     */
    public void setResolutionAdaptive(String ResolutionAdaptive) {
        this.ResolutionAdaptive = ResolutionAdaptive;
    }

    /**
     * Get Sampling type, Valid value:
<li>Percent: by percent.</li>
<li>Time: By time interval.</li> 
     * @return SampleType Sampling type, Valid value:
<li>Percent: by percent.</li>
<li>Time: By time interval.</li>
     */
    public String getSampleType() {
        return this.SampleType;
    }

    /**
     * Set Sampling type, Valid value:
<li>Percent: by percent.</li>
<li>Time: By time interval.</li>
     * @param SampleType Sampling type, Valid value:
<li>Percent: by percent.</li>
<li>Time: By time interval.</li>
     */
    public void setSampleType(String SampleType) {
        this.SampleType = SampleType;
    }

    /**
     * Get Sampling interval.
<li>When SampleType is Percent, specify the percentage of the sampling interval.</li>
<li>When SampleType is Time, specify the sampling interval in seconds.</li> 
     * @return SampleInterval Sampling interval.
<li>When SampleType is Percent, specify the percentage of the sampling interval.</li>
<li>When SampleType is Time, specify the sampling interval in seconds.</li>
     */
    public Long getSampleInterval() {
        return this.SampleInterval;
    }

    /**
     * Set Sampling interval.
<li>When SampleType is Percent, specify the percentage of the sampling interval.</li>
<li>When SampleType is Time, specify the sampling interval in seconds.</li>
     * @param SampleInterval Sampling interval.
<li>When SampleType is Percent, specify the percentage of the sampling interval.</li>
<li>When SampleType is Time, specify the sampling interval in seconds.</li>
     */
    public void setSampleInterval(Long SampleInterval) {
        this.SampleInterval = SampleInterval;
    }

    /**
     * Get Number of rows of small images in sprite image. 
     * @return RowCount Number of rows of small images in sprite image.
     */
    public Long getRowCount() {
        return this.RowCount;
    }

    /**
     * Set Number of rows of small images in sprite image.
     * @param RowCount Number of rows of small images in sprite image.
     */
    public void setRowCount(Long RowCount) {
        this.RowCount = RowCount;
    }

    /**
     * Get Number of columns of small images in sprite image. 
     * @return ColumnCount Number of columns of small images in sprite image.
     */
    public Long getColumnCount() {
        return this.ColumnCount;
    }

    /**
     * Set Number of columns of small images in sprite image.
     * @param ColumnCount Number of columns of small images in sprite image.
     */
    public void setColumnCount(Long ColumnCount) {
        this.ColumnCount = ColumnCount;
    }

    /**
     * Get Filling method. When video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the processing method for transcoding is "fill". Optional filling modes: <li>stretch: stretch each frame to fill the entire screen, possibly causing the transcoded video to be squashed or stretched;</li><li>black: maintain video aspect ratio, remaining edge part filled with black;</li><li>white: maintain video aspect ratio, remaining edge part filled with white;</li><li>gauss: maintain video aspect ratio, remaining edge part filled with Gaussian blur.</li>Default value: black. 
     * @return FillType Filling method. When video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the processing method for transcoding is "fill". Optional filling modes: <li>stretch: stretch each frame to fill the entire screen, possibly causing the transcoded video to be squashed or stretched;</li><li>black: maintain video aspect ratio, remaining edge part filled with black;</li><li>white: maintain video aspect ratio, remaining edge part filled with white;</li><li>gauss: maintain video aspect ratio, remaining edge part filled with Gaussian blur.</li>Default value: black.
     */
    public String getFillType() {
        return this.FillType;
    }

    /**
     * Set Filling method. When video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the processing method for transcoding is "fill". Optional filling modes: <li>stretch: stretch each frame to fill the entire screen, possibly causing the transcoded video to be squashed or stretched;</li><li>black: maintain video aspect ratio, remaining edge part filled with black;</li><li>white: maintain video aspect ratio, remaining edge part filled with white;</li><li>gauss: maintain video aspect ratio, remaining edge part filled with Gaussian blur.</li>Default value: black.
     * @param FillType Filling method. When video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the processing method for transcoding is "fill". Optional filling modes: <li>stretch: stretch each frame to fill the entire screen, possibly causing the transcoded video to be squashed or stretched;</li><li>black: maintain video aspect ratio, remaining edge part filled with black;</li><li>white: maintain video aspect ratio, remaining edge part filled with white;</li><li>gauss: maintain video aspect ratio, remaining edge part filled with Gaussian blur.</li>Default value: black.
     */
    public void setFillType(String FillType) {
        this.FillType = FillType;
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
     * Get Image format. Value:
<li> jpg: jpg format;</li>
<li>png: png format.</li>
<li>WEBP: webp format.</li> 
     * @return Format Image format. Value:
<li> jpg: jpg format;</li>
<li>png: png format.</li>
<li>WEBP: webp format.</li>
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set Image format. Value:
<li> jpg: jpg format;</li>
<li>png: png format.</li>
<li>WEBP: webp format.</li>
     * @param Format Image format. Value:
<li> jpg: jpg format;</li>
<li>png: png format.</li>
<li>WEBP: webp format.</li>
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    public ModifyImageSpriteTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyImageSpriteTemplateRequest(ModifyImageSpriteTemplateRequest source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
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
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "ResolutionAdaptive", this.ResolutionAdaptive);
        this.setParamSimple(map, prefix + "SampleType", this.SampleType);
        this.setParamSimple(map, prefix + "SampleInterval", this.SampleInterval);
        this.setParamSimple(map, prefix + "RowCount", this.RowCount);
        this.setParamSimple(map, prefix + "ColumnCount", this.ColumnCount);
        this.setParamSimple(map, prefix + "FillType", this.FillType);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "Format", this.Format);

    }
}


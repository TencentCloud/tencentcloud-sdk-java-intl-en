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

public class CreateImageSpriteTemplateRequest extends AbstractModel {

    /**
    * Sampling type. Valid values:
<li>Percent: by percent.</li>
<li>Time: by time interval.</li>
    */
    @SerializedName("SampleType")
    @Expose
    private String SampleType;

    /**
    * Sampling interval.
<li>When SampleType is Percent, specify the percentage of the sampling interval.</li>
<li>The time when the sampling interval is specified if SampleType is Time, in seconds.</li>
    */
    @SerializedName("SampleInterval")
    @Expose
    private Long SampleInterval;

    /**
    * Number of rows of small images in the sprite image.
Note: The number of subimage rows impacts the final height of the large image. The maximum height of the large image is 15,000 pixels, where the height of the large image is the product of the number of subimage rows and the subimage height.
    */
    @SerializedName("RowCount")
    @Expose
    private Long RowCount;

    /**
    * Number of columns of small images in the sprite image.
Note: The number of columns of small images impacts the final width of the large image. The maximum width of the large image is 15,000 pixels, where the width of the large image is the product of the number of columns and the width of the small images.
    */
    @SerializedName("ColumnCount")
    @Expose
    private Long ColumnCount;

    /**
    * <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Sprite image template name, with a length limit of 64 characters.
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
    * Filling method. When the video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the processing method for transcoding is "filling". Optional filling methods: <li> stretch: Stretch each frame to fill the entire screen, which may cause the transcoded video to be "squashed" or "stretched";</li><li>black: Keep black bars, maintain the video aspect ratio, and fill the remaining edges with black.</li>Default value: black.
    */
    @SerializedName("FillType")
    @Expose
    private String FillType;

    /**
    * Maximum value of the width (or long side) of small images in the sprite image. Value range: 0 and [128, 4096]. Unit: px.<li>When both Width and Height are 0, Same Resolution Source is used;</li><li>When Width is 0 and Height is not 0, Width is proportionally scaled;</li><li>When Width is not 0 and Height is 0, Height is proportionally scaled;</li><li>When both Width and Height are not 0, the resolution specified by user is used.</li>Default value: 0. Note: The width of small images impacts the width of the final large image. The maximum width of the large image is 15000 pixels, where the width of the large image is the product of the columns and the width of small images.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Maximum value of the height (or short side) of small images in the sprite image. Value range: 0 and [128, 4096]. Unit: px.<li>When both Width and Height are 0, the resolution is the same as the source.</li><li>When Width is 0 and Height is not 0, Width is proportionally scaled.</li><li>When Width is not 0 and Height is 0, Height is proportionally scaled.</li><li>When both Width and Height are not 0, the resolution is specified by the user.</li>Default value: 0. Note: The height of small images impacts the height of the final large image. The maximum height of the large image is 15000 pixels, where the height of the large image is the product of the subimage rows and the height of small images.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * Resolution adaptation. Available values:
<li>open: enable. At this point, Width represents the long side of the video, and Height indicates the short side of the video;</li>
<li>close: closed. At this point, Width represents the width of the video, and Height represents the height of the video.</li>
Default value: open.
    */
    @SerializedName("ResolutionAdaptive")
    @Expose
    private String ResolutionAdaptive;

    /**
    * Image format. Value:
<li> jpg: jpg format;</li>
<li> png: PNG format;</li>
<li> webp: webp format.</li>
Default value: jpg.
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
     * Get Sampling type. Valid values:
<li>Percent: by percent.</li>
<li>Time: by time interval.</li> 
     * @return SampleType Sampling type. Valid values:
<li>Percent: by percent.</li>
<li>Time: by time interval.</li>
     */
    public String getSampleType() {
        return this.SampleType;
    }

    /**
     * Set Sampling type. Valid values:
<li>Percent: by percent.</li>
<li>Time: by time interval.</li>
     * @param SampleType Sampling type. Valid values:
<li>Percent: by percent.</li>
<li>Time: by time interval.</li>
     */
    public void setSampleType(String SampleType) {
        this.SampleType = SampleType;
    }

    /**
     * Get Sampling interval.
<li>When SampleType is Percent, specify the percentage of the sampling interval.</li>
<li>The time when the sampling interval is specified if SampleType is Time, in seconds.</li> 
     * @return SampleInterval Sampling interval.
<li>When SampleType is Percent, specify the percentage of the sampling interval.</li>
<li>The time when the sampling interval is specified if SampleType is Time, in seconds.</li>
     */
    public Long getSampleInterval() {
        return this.SampleInterval;
    }

    /**
     * Set Sampling interval.
<li>When SampleType is Percent, specify the percentage of the sampling interval.</li>
<li>The time when the sampling interval is specified if SampleType is Time, in seconds.</li>
     * @param SampleInterval Sampling interval.
<li>When SampleType is Percent, specify the percentage of the sampling interval.</li>
<li>The time when the sampling interval is specified if SampleType is Time, in seconds.</li>
     */
    public void setSampleInterval(Long SampleInterval) {
        this.SampleInterval = SampleInterval;
    }

    /**
     * Get Number of rows of small images in the sprite image.
Note: The number of subimage rows impacts the final height of the large image. The maximum height of the large image is 15,000 pixels, where the height of the large image is the product of the number of subimage rows and the subimage height. 
     * @return RowCount Number of rows of small images in the sprite image.
Note: The number of subimage rows impacts the final height of the large image. The maximum height of the large image is 15,000 pixels, where the height of the large image is the product of the number of subimage rows and the subimage height.
     */
    public Long getRowCount() {
        return this.RowCount;
    }

    /**
     * Set Number of rows of small images in the sprite image.
Note: The number of subimage rows impacts the final height of the large image. The maximum height of the large image is 15,000 pixels, where the height of the large image is the product of the number of subimage rows and the subimage height.
     * @param RowCount Number of rows of small images in the sprite image.
Note: The number of subimage rows impacts the final height of the large image. The maximum height of the large image is 15,000 pixels, where the height of the large image is the product of the number of subimage rows and the subimage height.
     */
    public void setRowCount(Long RowCount) {
        this.RowCount = RowCount;
    }

    /**
     * Get Number of columns of small images in the sprite image.
Note: The number of columns of small images impacts the final width of the large image. The maximum width of the large image is 15,000 pixels, where the width of the large image is the product of the number of columns and the width of the small images. 
     * @return ColumnCount Number of columns of small images in the sprite image.
Note: The number of columns of small images impacts the final width of the large image. The maximum width of the large image is 15,000 pixels, where the width of the large image is the product of the number of columns and the width of the small images.
     */
    public Long getColumnCount() {
        return this.ColumnCount;
    }

    /**
     * Set Number of columns of small images in the sprite image.
Note: The number of columns of small images impacts the final width of the large image. The maximum width of the large image is 15,000 pixels, where the width of the large image is the product of the number of columns and the width of the small images.
     * @param ColumnCount Number of columns of small images in the sprite image.
Note: The number of columns of small images impacts the final width of the large image. The maximum width of the large image is 15,000 pixels, where the width of the large image is the product of the number of columns and the width of the small images.
     */
    public void setColumnCount(Long ColumnCount) {
        this.ColumnCount = ColumnCount;
    }

    /**
     * Get <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b> 
     * @return SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b>
     * @param SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Sprite image template name, with a length limit of 64 characters. 
     * @return Name Sprite image template name, with a length limit of 64 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Sprite image template name, with a length limit of 64 characters.
     * @param Name Sprite image template name, with a length limit of 64 characters.
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
     * Get Filling method. When the video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the processing method for transcoding is "filling". Optional filling methods: <li> stretch: Stretch each frame to fill the entire screen, which may cause the transcoded video to be "squashed" or "stretched";</li><li>black: Keep black bars, maintain the video aspect ratio, and fill the remaining edges with black.</li>Default value: black. 
     * @return FillType Filling method. When the video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the processing method for transcoding is "filling". Optional filling methods: <li> stretch: Stretch each frame to fill the entire screen, which may cause the transcoded video to be "squashed" or "stretched";</li><li>black: Keep black bars, maintain the video aspect ratio, and fill the remaining edges with black.</li>Default value: black.
     */
    public String getFillType() {
        return this.FillType;
    }

    /**
     * Set Filling method. When the video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the processing method for transcoding is "filling". Optional filling methods: <li> stretch: Stretch each frame to fill the entire screen, which may cause the transcoded video to be "squashed" or "stretched";</li><li>black: Keep black bars, maintain the video aspect ratio, and fill the remaining edges with black.</li>Default value: black.
     * @param FillType Filling method. When the video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the processing method for transcoding is "filling". Optional filling methods: <li> stretch: Stretch each frame to fill the entire screen, which may cause the transcoded video to be "squashed" or "stretched";</li><li>black: Keep black bars, maintain the video aspect ratio, and fill the remaining edges with black.</li>Default value: black.
     */
    public void setFillType(String FillType) {
        this.FillType = FillType;
    }

    /**
     * Get Maximum value of the width (or long side) of small images in the sprite image. Value range: 0 and [128, 4096]. Unit: px.<li>When both Width and Height are 0, Same Resolution Source is used;</li><li>When Width is 0 and Height is not 0, Width is proportionally scaled;</li><li>When Width is not 0 and Height is 0, Height is proportionally scaled;</li><li>When both Width and Height are not 0, the resolution specified by user is used.</li>Default value: 0. Note: The width of small images impacts the width of the final large image. The maximum width of the large image is 15000 pixels, where the width of the large image is the product of the columns and the width of small images. 
     * @return Width Maximum value of the width (or long side) of small images in the sprite image. Value range: 0 and [128, 4096]. Unit: px.<li>When both Width and Height are 0, Same Resolution Source is used;</li><li>When Width is 0 and Height is not 0, Width is proportionally scaled;</li><li>When Width is not 0 and Height is 0, Height is proportionally scaled;</li><li>When both Width and Height are not 0, the resolution specified by user is used.</li>Default value: 0. Note: The width of small images impacts the width of the final large image. The maximum width of the large image is 15000 pixels, where the width of the large image is the product of the columns and the width of small images.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Maximum value of the width (or long side) of small images in the sprite image. Value range: 0 and [128, 4096]. Unit: px.<li>When both Width and Height are 0, Same Resolution Source is used;</li><li>When Width is 0 and Height is not 0, Width is proportionally scaled;</li><li>When Width is not 0 and Height is 0, Height is proportionally scaled;</li><li>When both Width and Height are not 0, the resolution specified by user is used.</li>Default value: 0. Note: The width of small images impacts the width of the final large image. The maximum width of the large image is 15000 pixels, where the width of the large image is the product of the columns and the width of small images.
     * @param Width Maximum value of the width (or long side) of small images in the sprite image. Value range: 0 and [128, 4096]. Unit: px.<li>When both Width and Height are 0, Same Resolution Source is used;</li><li>When Width is 0 and Height is not 0, Width is proportionally scaled;</li><li>When Width is not 0 and Height is 0, Height is proportionally scaled;</li><li>When both Width and Height are not 0, the resolution specified by user is used.</li>Default value: 0. Note: The width of small images impacts the width of the final large image. The maximum width of the large image is 15000 pixels, where the width of the large image is the product of the columns and the width of small images.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Maximum value of the height (or short side) of small images in the sprite image. Value range: 0 and [128, 4096]. Unit: px.<li>When both Width and Height are 0, the resolution is the same as the source.</li><li>When Width is 0 and Height is not 0, Width is proportionally scaled.</li><li>When Width is not 0 and Height is 0, Height is proportionally scaled.</li><li>When both Width and Height are not 0, the resolution is specified by the user.</li>Default value: 0. Note: The height of small images impacts the height of the final large image. The maximum height of the large image is 15000 pixels, where the height of the large image is the product of the subimage rows and the height of small images. 
     * @return Height Maximum value of the height (or short side) of small images in the sprite image. Value range: 0 and [128, 4096]. Unit: px.<li>When both Width and Height are 0, the resolution is the same as the source.</li><li>When Width is 0 and Height is not 0, Width is proportionally scaled.</li><li>When Width is not 0 and Height is 0, Height is proportionally scaled.</li><li>When both Width and Height are not 0, the resolution is specified by the user.</li>Default value: 0. Note: The height of small images impacts the height of the final large image. The maximum height of the large image is 15000 pixels, where the height of the large image is the product of the subimage rows and the height of small images.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Maximum value of the height (or short side) of small images in the sprite image. Value range: 0 and [128, 4096]. Unit: px.<li>When both Width and Height are 0, the resolution is the same as the source.</li><li>When Width is 0 and Height is not 0, Width is proportionally scaled.</li><li>When Width is not 0 and Height is 0, Height is proportionally scaled.</li><li>When both Width and Height are not 0, the resolution is specified by the user.</li>Default value: 0. Note: The height of small images impacts the height of the final large image. The maximum height of the large image is 15000 pixels, where the height of the large image is the product of the subimage rows and the height of small images.
     * @param Height Maximum value of the height (or short side) of small images in the sprite image. Value range: 0 and [128, 4096]. Unit: px.<li>When both Width and Height are 0, the resolution is the same as the source.</li><li>When Width is 0 and Height is not 0, Width is proportionally scaled.</li><li>When Width is not 0 and Height is 0, Height is proportionally scaled.</li><li>When both Width and Height are not 0, the resolution is specified by the user.</li>Default value: 0. Note: The height of small images impacts the height of the final large image. The maximum height of the large image is 15000 pixels, where the height of the large image is the product of the subimage rows and the height of small images.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get Resolution adaptation. Available values:
<li>open: enable. At this point, Width represents the long side of the video, and Height indicates the short side of the video;</li>
<li>close: closed. At this point, Width represents the width of the video, and Height represents the height of the video.</li>
Default value: open. 
     * @return ResolutionAdaptive Resolution adaptation. Available values:
<li>open: enable. At this point, Width represents the long side of the video, and Height indicates the short side of the video;</li>
<li>close: closed. At this point, Width represents the width of the video, and Height represents the height of the video.</li>
Default value: open.
     */
    public String getResolutionAdaptive() {
        return this.ResolutionAdaptive;
    }

    /**
     * Set Resolution adaptation. Available values:
<li>open: enable. At this point, Width represents the long side of the video, and Height indicates the short side of the video;</li>
<li>close: closed. At this point, Width represents the width of the video, and Height represents the height of the video.</li>
Default value: open.
     * @param ResolutionAdaptive Resolution adaptation. Available values:
<li>open: enable. At this point, Width represents the long side of the video, and Height indicates the short side of the video;</li>
<li>close: closed. At this point, Width represents the width of the video, and Height represents the height of the video.</li>
Default value: open.
     */
    public void setResolutionAdaptive(String ResolutionAdaptive) {
        this.ResolutionAdaptive = ResolutionAdaptive;
    }

    /**
     * Get Image format. Value:
<li> jpg: jpg format;</li>
<li> png: PNG format;</li>
<li> webp: webp format.</li>
Default value: jpg. 
     * @return Format Image format. Value:
<li> jpg: jpg format;</li>
<li> png: PNG format;</li>
<li> webp: webp format.</li>
Default value: jpg.
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set Image format. Value:
<li> jpg: jpg format;</li>
<li> png: PNG format;</li>
<li> webp: webp format.</li>
Default value: jpg.
     * @param Format Image format. Value:
<li> jpg: jpg format;</li>
<li> png: PNG format;</li>
<li> webp: webp format.</li>
Default value: jpg.
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    public CreateImageSpriteTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateImageSpriteTemplateRequest(CreateImageSpriteTemplateRequest source) {
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
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.FillType != null) {
            this.FillType = new String(source.FillType);
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
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SampleType", this.SampleType);
        this.setParamSimple(map, prefix + "SampleInterval", this.SampleInterval);
        this.setParamSimple(map, prefix + "RowCount", this.RowCount);
        this.setParamSimple(map, prefix + "ColumnCount", this.ColumnCount);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "FillType", this.FillType);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "ResolutionAdaptive", this.ResolutionAdaptive);
        this.setParamSimple(map, prefix + "Format", this.Format);

    }
}


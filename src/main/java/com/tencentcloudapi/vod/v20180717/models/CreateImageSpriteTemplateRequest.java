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
<li>If `SampleType` is `Percent`, sampling will be performed at an interval of the specified percentage.</li>
<li>If `SampleType` is `Time`, sampling will be performed at the specified time interval in seconds.</li>
    */
    @SerializedName("SampleInterval")
    @Expose
    private Long SampleInterval;

    /**
    * The number of rows of small images in the sprite image. 
Note: The number of rows of the small image will affect the height of the final large image. The maximum height of the large image is 15,000 pixels. The height of the large image is the product of the number of rows of the small image and the height of the small image.
    */
    @SerializedName("RowCount")
    @Expose
    private Long RowCount;

    /**
    * The number of columns of small images in the sprite image. 
Note: The number of columns of the small image will affect the width of the final large image. The maximum width of the large image is 15,000 pixels. The width of the large image is the product of the number of columns of the small image and the width of the small image.
    */
    @SerializedName("ColumnCount")
    @Expose
    private Long ColumnCount;

    /**
    * <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Name of an image sprite generating template. Length limit: 64 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Template description. Length limit: 256 characters.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Fill type. "Fill" refers to the way of processing a screenshot when its aspect ratio is different from that of the source video. The following fill types are supported:
<li> stretch: stretch. The screenshot will be stretched frame by frame to match the aspect ratio of the source video, which may make the screenshot "shorter" or "longer";</li>
<li>black: fill with black. This option retains the aspect ratio of the source video for the screenshot and fills the unmatched area with black color blocks.</li>
Default value: black.
    */
    @SerializedName("FillType")
    @Expose
    private String FillType;

    /**
    * The maximum value of the width (or long side) of the small image in the sprite image, value range: 0 and [128, 4096], unit: px. 
<li>When Width and Height are both 0, the resolution is from the same source;</li>
<li>When Width is 0 and Height is non-0, Width is scaled proportionally;</li>
< li>When Width is non-0 and Height is 0, the Height is scaled proportionally; </li>
<li>When both Width and Height are non-0, the resolution is specified by the user. </li>
Default value: 0. 
Note: The width of the small image will affect the width of the final large image. The maximum width of the large image is 15,000 pixels. The width of the large image is the product of the number of columns of the small image and the width of the small image.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * The maximum value of the height (or short side) of the small image in the sprite image, value range: 0 and [128, 4096], unit: px. 
<li>When Width and Height are both 0, the resolution is from the same source;</li>
<li>When Width is 0 and Height is non-0, Width is scaled proportionally;</li>
< li>When Width is non-0 and Height is 0, the Height is scaled proportionally; </li>
<li>When both Width and Height are non-0, the resolution is specified by the user. </li>
Default value: 0. 
Note: The height of the small image will affect the height of the final large image. The maximum height of the large image is 15,000 pixels. The height of the large image is the product of the number of rows of the small image and the height of the small image.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * Resolution adaption. Valid values:
<li>open: enabled. In this case, `Width` represents the long side of a video, while `Height` the short side;</li>
<li>close: disabled. In this case, `Width` represents the width of a video, while `Height` the height.</li>
Default value: open.
    */
    @SerializedName("ResolutionAdaptive")
    @Expose
    private String ResolutionAdaptive;

    /**
    * The image format. Valid values:
<li> jpg</li>
<li> png</li>
<li> webp</li>
Default: jpg
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
<li>If `SampleType` is `Percent`, sampling will be performed at an interval of the specified percentage.</li>
<li>If `SampleType` is `Time`, sampling will be performed at the specified time interval in seconds.</li> 
     * @return SampleInterval Sampling interval.
<li>If `SampleType` is `Percent`, sampling will be performed at an interval of the specified percentage.</li>
<li>If `SampleType` is `Time`, sampling will be performed at the specified time interval in seconds.</li>
     */
    public Long getSampleInterval() {
        return this.SampleInterval;
    }

    /**
     * Set Sampling interval.
<li>If `SampleType` is `Percent`, sampling will be performed at an interval of the specified percentage.</li>
<li>If `SampleType` is `Time`, sampling will be performed at the specified time interval in seconds.</li>
     * @param SampleInterval Sampling interval.
<li>If `SampleType` is `Percent`, sampling will be performed at an interval of the specified percentage.</li>
<li>If `SampleType` is `Time`, sampling will be performed at the specified time interval in seconds.</li>
     */
    public void setSampleInterval(Long SampleInterval) {
        this.SampleInterval = SampleInterval;
    }

    /**
     * Get The number of rows of small images in the sprite image. 
Note: The number of rows of the small image will affect the height of the final large image. The maximum height of the large image is 15,000 pixels. The height of the large image is the product of the number of rows of the small image and the height of the small image. 
     * @return RowCount The number of rows of small images in the sprite image. 
Note: The number of rows of the small image will affect the height of the final large image. The maximum height of the large image is 15,000 pixels. The height of the large image is the product of the number of rows of the small image and the height of the small image.
     */
    public Long getRowCount() {
        return this.RowCount;
    }

    /**
     * Set The number of rows of small images in the sprite image. 
Note: The number of rows of the small image will affect the height of the final large image. The maximum height of the large image is 15,000 pixels. The height of the large image is the product of the number of rows of the small image and the height of the small image.
     * @param RowCount The number of rows of small images in the sprite image. 
Note: The number of rows of the small image will affect the height of the final large image. The maximum height of the large image is 15,000 pixels. The height of the large image is the product of the number of rows of the small image and the height of the small image.
     */
    public void setRowCount(Long RowCount) {
        this.RowCount = RowCount;
    }

    /**
     * Get The number of columns of small images in the sprite image. 
Note: The number of columns of the small image will affect the width of the final large image. The maximum width of the large image is 15,000 pixels. The width of the large image is the product of the number of columns of the small image and the width of the small image. 
     * @return ColumnCount The number of columns of small images in the sprite image. 
Note: The number of columns of the small image will affect the width of the final large image. The maximum width of the large image is 15,000 pixels. The width of the large image is the product of the number of columns of the small image and the width of the small image.
     */
    public Long getColumnCount() {
        return this.ColumnCount;
    }

    /**
     * Set The number of columns of small images in the sprite image. 
Note: The number of columns of the small image will affect the width of the final large image. The maximum width of the large image is 15,000 pixels. The width of the large image is the product of the number of columns of the small image and the width of the small image.
     * @param ColumnCount The number of columns of small images in the sprite image. 
Note: The number of columns of the small image will affect the width of the final large image. The maximum width of the large image is 15,000 pixels. The width of the large image is the product of the number of columns of the small image and the width of the small image.
     */
    public void setColumnCount(Long ColumnCount) {
        this.ColumnCount = ColumnCount;
    }

    /**
     * Get <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b> 
     * @return SubAppId <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
     * @param SubAppId <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Name of an image sprite generating template. Length limit: 64 characters. 
     * @return Name Name of an image sprite generating template. Length limit: 64 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of an image sprite generating template. Length limit: 64 characters.
     * @param Name Name of an image sprite generating template. Length limit: 64 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Template description. Length limit: 256 characters. 
     * @return Comment Template description. Length limit: 256 characters.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Template description. Length limit: 256 characters.
     * @param Comment Template description. Length limit: 256 characters.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get Fill type. "Fill" refers to the way of processing a screenshot when its aspect ratio is different from that of the source video. The following fill types are supported:
<li> stretch: stretch. The screenshot will be stretched frame by frame to match the aspect ratio of the source video, which may make the screenshot "shorter" or "longer";</li>
<li>black: fill with black. This option retains the aspect ratio of the source video for the screenshot and fills the unmatched area with black color blocks.</li>
Default value: black. 
     * @return FillType Fill type. "Fill" refers to the way of processing a screenshot when its aspect ratio is different from that of the source video. The following fill types are supported:
<li> stretch: stretch. The screenshot will be stretched frame by frame to match the aspect ratio of the source video, which may make the screenshot "shorter" or "longer";</li>
<li>black: fill with black. This option retains the aspect ratio of the source video for the screenshot and fills the unmatched area with black color blocks.</li>
Default value: black.
     */
    public String getFillType() {
        return this.FillType;
    }

    /**
     * Set Fill type. "Fill" refers to the way of processing a screenshot when its aspect ratio is different from that of the source video. The following fill types are supported:
<li> stretch: stretch. The screenshot will be stretched frame by frame to match the aspect ratio of the source video, which may make the screenshot "shorter" or "longer";</li>
<li>black: fill with black. This option retains the aspect ratio of the source video for the screenshot and fills the unmatched area with black color blocks.</li>
Default value: black.
     * @param FillType Fill type. "Fill" refers to the way of processing a screenshot when its aspect ratio is different from that of the source video. The following fill types are supported:
<li> stretch: stretch. The screenshot will be stretched frame by frame to match the aspect ratio of the source video, which may make the screenshot "shorter" or "longer";</li>
<li>black: fill with black. This option retains the aspect ratio of the source video for the screenshot and fills the unmatched area with black color blocks.</li>
Default value: black.
     */
    public void setFillType(String FillType) {
        this.FillType = FillType;
    }

    /**
     * Get The maximum value of the width (or long side) of the small image in the sprite image, value range: 0 and [128, 4096], unit: px. 
<li>When Width and Height are both 0, the resolution is from the same source;</li>
<li>When Width is 0 and Height is non-0, Width is scaled proportionally;</li>
< li>When Width is non-0 and Height is 0, the Height is scaled proportionally; </li>
<li>When both Width and Height are non-0, the resolution is specified by the user. </li>
Default value: 0. 
Note: The width of the small image will affect the width of the final large image. The maximum width of the large image is 15,000 pixels. The width of the large image is the product of the number of columns of the small image and the width of the small image. 
     * @return Width The maximum value of the width (or long side) of the small image in the sprite image, value range: 0 and [128, 4096], unit: px. 
<li>When Width and Height are both 0, the resolution is from the same source;</li>
<li>When Width is 0 and Height is non-0, Width is scaled proportionally;</li>
< li>When Width is non-0 and Height is 0, the Height is scaled proportionally; </li>
<li>When both Width and Height are non-0, the resolution is specified by the user. </li>
Default value: 0. 
Note: The width of the small image will affect the width of the final large image. The maximum width of the large image is 15,000 pixels. The width of the large image is the product of the number of columns of the small image and the width of the small image.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set The maximum value of the width (or long side) of the small image in the sprite image, value range: 0 and [128, 4096], unit: px. 
<li>When Width and Height are both 0, the resolution is from the same source;</li>
<li>When Width is 0 and Height is non-0, Width is scaled proportionally;</li>
< li>When Width is non-0 and Height is 0, the Height is scaled proportionally; </li>
<li>When both Width and Height are non-0, the resolution is specified by the user. </li>
Default value: 0. 
Note: The width of the small image will affect the width of the final large image. The maximum width of the large image is 15,000 pixels. The width of the large image is the product of the number of columns of the small image and the width of the small image.
     * @param Width The maximum value of the width (or long side) of the small image in the sprite image, value range: 0 and [128, 4096], unit: px. 
<li>When Width and Height are both 0, the resolution is from the same source;</li>
<li>When Width is 0 and Height is non-0, Width is scaled proportionally;</li>
< li>When Width is non-0 and Height is 0, the Height is scaled proportionally; </li>
<li>When both Width and Height are non-0, the resolution is specified by the user. </li>
Default value: 0. 
Note: The width of the small image will affect the width of the final large image. The maximum width of the large image is 15,000 pixels. The width of the large image is the product of the number of columns of the small image and the width of the small image.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get The maximum value of the height (or short side) of the small image in the sprite image, value range: 0 and [128, 4096], unit: px. 
<li>When Width and Height are both 0, the resolution is from the same source;</li>
<li>When Width is 0 and Height is non-0, Width is scaled proportionally;</li>
< li>When Width is non-0 and Height is 0, the Height is scaled proportionally; </li>
<li>When both Width and Height are non-0, the resolution is specified by the user. </li>
Default value: 0. 
Note: The height of the small image will affect the height of the final large image. The maximum height of the large image is 15,000 pixels. The height of the large image is the product of the number of rows of the small image and the height of the small image. 
     * @return Height The maximum value of the height (or short side) of the small image in the sprite image, value range: 0 and [128, 4096], unit: px. 
<li>When Width and Height are both 0, the resolution is from the same source;</li>
<li>When Width is 0 and Height is non-0, Width is scaled proportionally;</li>
< li>When Width is non-0 and Height is 0, the Height is scaled proportionally; </li>
<li>When both Width and Height are non-0, the resolution is specified by the user. </li>
Default value: 0. 
Note: The height of the small image will affect the height of the final large image. The maximum height of the large image is 15,000 pixels. The height of the large image is the product of the number of rows of the small image and the height of the small image.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set The maximum value of the height (or short side) of the small image in the sprite image, value range: 0 and [128, 4096], unit: px. 
<li>When Width and Height are both 0, the resolution is from the same source;</li>
<li>When Width is 0 and Height is non-0, Width is scaled proportionally;</li>
< li>When Width is non-0 and Height is 0, the Height is scaled proportionally; </li>
<li>When both Width and Height are non-0, the resolution is specified by the user. </li>
Default value: 0. 
Note: The height of the small image will affect the height of the final large image. The maximum height of the large image is 15,000 pixels. The height of the large image is the product of the number of rows of the small image and the height of the small image.
     * @param Height The maximum value of the height (or short side) of the small image in the sprite image, value range: 0 and [128, 4096], unit: px. 
<li>When Width and Height are both 0, the resolution is from the same source;</li>
<li>When Width is 0 and Height is non-0, Width is scaled proportionally;</li>
< li>When Width is non-0 and Height is 0, the Height is scaled proportionally; </li>
<li>When both Width and Height are non-0, the resolution is specified by the user. </li>
Default value: 0. 
Note: The height of the small image will affect the height of the final large image. The maximum height of the large image is 15,000 pixels. The height of the large image is the product of the number of rows of the small image and the height of the small image.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get Resolution adaption. Valid values:
<li>open: enabled. In this case, `Width` represents the long side of a video, while `Height` the short side;</li>
<li>close: disabled. In this case, `Width` represents the width of a video, while `Height` the height.</li>
Default value: open. 
     * @return ResolutionAdaptive Resolution adaption. Valid values:
<li>open: enabled. In this case, `Width` represents the long side of a video, while `Height` the short side;</li>
<li>close: disabled. In this case, `Width` represents the width of a video, while `Height` the height.</li>
Default value: open.
     */
    public String getResolutionAdaptive() {
        return this.ResolutionAdaptive;
    }

    /**
     * Set Resolution adaption. Valid values:
<li>open: enabled. In this case, `Width` represents the long side of a video, while `Height` the short side;</li>
<li>close: disabled. In this case, `Width` represents the width of a video, while `Height` the height.</li>
Default value: open.
     * @param ResolutionAdaptive Resolution adaption. Valid values:
<li>open: enabled. In this case, `Width` represents the long side of a video, while `Height` the short side;</li>
<li>close: disabled. In this case, `Width` represents the width of a video, while `Height` the height.</li>
Default value: open.
     */
    public void setResolutionAdaptive(String ResolutionAdaptive) {
        this.ResolutionAdaptive = ResolutionAdaptive;
    }

    /**
     * Get The image format. Valid values:
<li> jpg</li>
<li> png</li>
<li> webp</li>
Default: jpg 
     * @return Format The image format. Valid values:
<li> jpg</li>
<li> png</li>
<li> webp</li>
Default: jpg
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set The image format. Valid values:
<li> jpg</li>
<li> png</li>
<li> webp</li>
Default: jpg
     * @param Format The image format. Valid values:
<li> jpg</li>
<li> png</li>
<li> webp</li>
Default: jpg
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


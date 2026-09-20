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

public class CreateSampleSnapshotTemplateRequest extends AbstractModel {

    /**
    * <p>Sampling screenshot type. Value:</p><li>Percent: By percent.</li><li>Time: By time interval.</li>
    */
    @SerializedName("SampleType")
    @Expose
    private String SampleType;

    /**
    * <p>Sampling interval.</p><li>When SampleType is Percent, specify the percentage of the sampling interval.</li><li>When SampleType is Time, specify the time of the sampling interval in seconds.</li>
    */
    @SerializedName("SampleInterval")
    @Expose
    private Long SampleInterval;

    /**
    * <p><b>On-demand <a href="/document/product/266/14574">application</a> ID. For customers who activate on-demand services on or after December 25, 2023, when accessing resources in on-demand applications (whether the default application or a newly created application), this field must be set to the app ID.</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>Sample screenshot template name. Length limit: 64 characters.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>The maximum value of the screenshot width (or long side). Valid values: 0 and [32, 4096]. Unit: px.<li>When Width and Height are both 0, the resolution is from the same source;</li><li>When Width is 0 and Height is non-0, Width is scaled proportionally;</li><li>When Width is non-0 and Height is 0, Height is scaled proportionally;</li><li>When both Width and Height are non-0, the resolution is specified by the user.</li>Default value: 0.</p>
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * <p>The maximum value of the screenshot height (or short side). Valid values: 0 and [32, 4096]. Unit: px.<li>When Width and Height are both 0, the resolution is from the same source;</li><li>When Width is 0 and Height is non-0, Width is scaled proportionally;</li><li>When Width is non-0 and Height is 0, the Height is scaled proportionally;</li><li>When both Width and Height are non-0, the resolution is specified by the user.</li>Default value: 0.</p>
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * <p>Resolution adaptation. Available values:</p><li>open: enable. At this point, Width represents the long side of the video, and Height represents the short side;</li><li>close: disable. At this point, Width represents the video width, and Height represents the video height.</li>Default value: open.
    */
    @SerializedName("ResolutionAdaptive")
    @Expose
    private String ResolutionAdaptive;

    /**
    * <p>Image format. Valid values: jpg, png, and webp. Default value: jpg.</p>
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * <p>Transcoding template description. Length limit: 256 characters.</p>
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>Filling method. When the video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the processing method for transcoding is "fill". Optional filling modes:</p><li>stretch: Stretch each frame to fill the entire screen, which may cause the transcoded video to be "squashed" or "stretched";</li><li>black: Keep the video aspect ratio unchanged, and fill the remaining edge part with black.</li><li>white: Keep the video aspect ratio unchanged, and fill the remaining edge part with white.</li><li>gauss: Gaussian blur. Keep the video aspect ratio unchanged, and apply Gaussian blur to the remaining edge part.</li>Default value: black.
    */
    @SerializedName("FillType")
    @Expose
    private String FillType;

    /**
     * Get <p>Sampling screenshot type. Value:</p><li>Percent: By percent.</li><li>Time: By time interval.</li> 
     * @return SampleType <p>Sampling screenshot type. Value:</p><li>Percent: By percent.</li><li>Time: By time interval.</li>
     */
    public String getSampleType() {
        return this.SampleType;
    }

    /**
     * Set <p>Sampling screenshot type. Value:</p><li>Percent: By percent.</li><li>Time: By time interval.</li>
     * @param SampleType <p>Sampling screenshot type. Value:</p><li>Percent: By percent.</li><li>Time: By time interval.</li>
     */
    public void setSampleType(String SampleType) {
        this.SampleType = SampleType;
    }

    /**
     * Get <p>Sampling interval.</p><li>When SampleType is Percent, specify the percentage of the sampling interval.</li><li>When SampleType is Time, specify the time of the sampling interval in seconds.</li> 
     * @return SampleInterval <p>Sampling interval.</p><li>When SampleType is Percent, specify the percentage of the sampling interval.</li><li>When SampleType is Time, specify the time of the sampling interval in seconds.</li>
     */
    public Long getSampleInterval() {
        return this.SampleInterval;
    }

    /**
     * Set <p>Sampling interval.</p><li>When SampleType is Percent, specify the percentage of the sampling interval.</li><li>When SampleType is Time, specify the time of the sampling interval in seconds.</li>
     * @param SampleInterval <p>Sampling interval.</p><li>When SampleType is Percent, specify the percentage of the sampling interval.</li><li>When SampleType is Time, specify the time of the sampling interval in seconds.</li>
     */
    public void setSampleInterval(Long SampleInterval) {
        this.SampleInterval = SampleInterval;
    }

    /**
     * Get <p><b>On-demand <a href="/document/product/266/14574">application</a> ID. For customers who activate on-demand services on or after December 25, 2023, when accessing resources in on-demand applications (whether the default application or a newly created application), this field must be set to the app ID.</b></p> 
     * @return SubAppId <p><b>On-demand <a href="/document/product/266/14574">application</a> ID. For customers who activate on-demand services on or after December 25, 2023, when accessing resources in on-demand applications (whether the default application or a newly created application), this field must be set to the app ID.</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>On-demand <a href="/document/product/266/14574">application</a> ID. For customers who activate on-demand services on or after December 25, 2023, when accessing resources in on-demand applications (whether the default application or a newly created application), this field must be set to the app ID.</b></p>
     * @param SubAppId <p><b>On-demand <a href="/document/product/266/14574">application</a> ID. For customers who activate on-demand services on or after December 25, 2023, when accessing resources in on-demand applications (whether the default application or a newly created application), this field must be set to the app ID.</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>Sample screenshot template name. Length limit: 64 characters.</p> 
     * @return Name <p>Sample screenshot template name. Length limit: 64 characters.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Sample screenshot template name. Length limit: 64 characters.</p>
     * @param Name <p>Sample screenshot template name. Length limit: 64 characters.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>The maximum value of the screenshot width (or long side). Valid values: 0 and [32, 4096]. Unit: px.<li>When Width and Height are both 0, the resolution is from the same source;</li><li>When Width is 0 and Height is non-0, Width is scaled proportionally;</li><li>When Width is non-0 and Height is 0, Height is scaled proportionally;</li><li>When both Width and Height are non-0, the resolution is specified by the user.</li>Default value: 0.</p> 
     * @return Width <p>The maximum value of the screenshot width (or long side). Valid values: 0 and [32, 4096]. Unit: px.<li>When Width and Height are both 0, the resolution is from the same source;</li><li>When Width is 0 and Height is non-0, Width is scaled proportionally;</li><li>When Width is non-0 and Height is 0, Height is scaled proportionally;</li><li>When both Width and Height are non-0, the resolution is specified by the user.</li>Default value: 0.</p>
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set <p>The maximum value of the screenshot width (or long side). Valid values: 0 and [32, 4096]. Unit: px.<li>When Width and Height are both 0, the resolution is from the same source;</li><li>When Width is 0 and Height is non-0, Width is scaled proportionally;</li><li>When Width is non-0 and Height is 0, Height is scaled proportionally;</li><li>When both Width and Height are non-0, the resolution is specified by the user.</li>Default value: 0.</p>
     * @param Width <p>The maximum value of the screenshot width (or long side). Valid values: 0 and [32, 4096]. Unit: px.<li>When Width and Height are both 0, the resolution is from the same source;</li><li>When Width is 0 and Height is non-0, Width is scaled proportionally;</li><li>When Width is non-0 and Height is 0, Height is scaled proportionally;</li><li>When both Width and Height are non-0, the resolution is specified by the user.</li>Default value: 0.</p>
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get <p>The maximum value of the screenshot height (or short side). Valid values: 0 and [32, 4096]. Unit: px.<li>When Width and Height are both 0, the resolution is from the same source;</li><li>When Width is 0 and Height is non-0, Width is scaled proportionally;</li><li>When Width is non-0 and Height is 0, the Height is scaled proportionally;</li><li>When both Width and Height are non-0, the resolution is specified by the user.</li>Default value: 0.</p> 
     * @return Height <p>The maximum value of the screenshot height (or short side). Valid values: 0 and [32, 4096]. Unit: px.<li>When Width and Height are both 0, the resolution is from the same source;</li><li>When Width is 0 and Height is non-0, Width is scaled proportionally;</li><li>When Width is non-0 and Height is 0, the Height is scaled proportionally;</li><li>When both Width and Height are non-0, the resolution is specified by the user.</li>Default value: 0.</p>
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set <p>The maximum value of the screenshot height (or short side). Valid values: 0 and [32, 4096]. Unit: px.<li>When Width and Height are both 0, the resolution is from the same source;</li><li>When Width is 0 and Height is non-0, Width is scaled proportionally;</li><li>When Width is non-0 and Height is 0, the Height is scaled proportionally;</li><li>When both Width and Height are non-0, the resolution is specified by the user.</li>Default value: 0.</p>
     * @param Height <p>The maximum value of the screenshot height (or short side). Valid values: 0 and [32, 4096]. Unit: px.<li>When Width and Height are both 0, the resolution is from the same source;</li><li>When Width is 0 and Height is non-0, Width is scaled proportionally;</li><li>When Width is non-0 and Height is 0, the Height is scaled proportionally;</li><li>When both Width and Height are non-0, the resolution is specified by the user.</li>Default value: 0.</p>
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get <p>Resolution adaptation. Available values:</p><li>open: enable. At this point, Width represents the long side of the video, and Height represents the short side;</li><li>close: disable. At this point, Width represents the video width, and Height represents the video height.</li>Default value: open. 
     * @return ResolutionAdaptive <p>Resolution adaptation. Available values:</p><li>open: enable. At this point, Width represents the long side of the video, and Height represents the short side;</li><li>close: disable. At this point, Width represents the video width, and Height represents the video height.</li>Default value: open.
     */
    public String getResolutionAdaptive() {
        return this.ResolutionAdaptive;
    }

    /**
     * Set <p>Resolution adaptation. Available values:</p><li>open: enable. At this point, Width represents the long side of the video, and Height represents the short side;</li><li>close: disable. At this point, Width represents the video width, and Height represents the video height.</li>Default value: open.
     * @param ResolutionAdaptive <p>Resolution adaptation. Available values:</p><li>open: enable. At this point, Width represents the long side of the video, and Height represents the short side;</li><li>close: disable. At this point, Width represents the video width, and Height represents the video height.</li>Default value: open.
     */
    public void setResolutionAdaptive(String ResolutionAdaptive) {
        this.ResolutionAdaptive = ResolutionAdaptive;
    }

    /**
     * Get <p>Image format. Valid values: jpg, png, and webp. Default value: jpg.</p> 
     * @return Format <p>Image format. Valid values: jpg, png, and webp. Default value: jpg.</p>
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set <p>Image format. Valid values: jpg, png, and webp. Default value: jpg.</p>
     * @param Format <p>Image format. Valid values: jpg, png, and webp. Default value: jpg.</p>
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get <p>Transcoding template description. Length limit: 256 characters.</p> 
     * @return Comment <p>Transcoding template description. Length limit: 256 characters.</p>
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>Transcoding template description. Length limit: 256 characters.</p>
     * @param Comment <p>Transcoding template description. Length limit: 256 characters.</p>
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get <p>Filling method. When the video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the processing method for transcoding is "fill". Optional filling modes:</p><li>stretch: Stretch each frame to fill the entire screen, which may cause the transcoded video to be "squashed" or "stretched";</li><li>black: Keep the video aspect ratio unchanged, and fill the remaining edge part with black.</li><li>white: Keep the video aspect ratio unchanged, and fill the remaining edge part with white.</li><li>gauss: Gaussian blur. Keep the video aspect ratio unchanged, and apply Gaussian blur to the remaining edge part.</li>Default value: black. 
     * @return FillType <p>Filling method. When the video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the processing method for transcoding is "fill". Optional filling modes:</p><li>stretch: Stretch each frame to fill the entire screen, which may cause the transcoded video to be "squashed" or "stretched";</li><li>black: Keep the video aspect ratio unchanged, and fill the remaining edge part with black.</li><li>white: Keep the video aspect ratio unchanged, and fill the remaining edge part with white.</li><li>gauss: Gaussian blur. Keep the video aspect ratio unchanged, and apply Gaussian blur to the remaining edge part.</li>Default value: black.
     */
    public String getFillType() {
        return this.FillType;
    }

    /**
     * Set <p>Filling method. When the video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the processing method for transcoding is "fill". Optional filling modes:</p><li>stretch: Stretch each frame to fill the entire screen, which may cause the transcoded video to be "squashed" or "stretched";</li><li>black: Keep the video aspect ratio unchanged, and fill the remaining edge part with black.</li><li>white: Keep the video aspect ratio unchanged, and fill the remaining edge part with white.</li><li>gauss: Gaussian blur. Keep the video aspect ratio unchanged, and apply Gaussian blur to the remaining edge part.</li>Default value: black.
     * @param FillType <p>Filling method. When the video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the processing method for transcoding is "fill". Optional filling modes:</p><li>stretch: Stretch each frame to fill the entire screen, which may cause the transcoded video to be "squashed" or "stretched";</li><li>black: Keep the video aspect ratio unchanged, and fill the remaining edge part with black.</li><li>white: Keep the video aspect ratio unchanged, and fill the remaining edge part with white.</li><li>gauss: Gaussian blur. Keep the video aspect ratio unchanged, and apply Gaussian blur to the remaining edge part.</li>Default value: black.
     */
    public void setFillType(String FillType) {
        this.FillType = FillType;
    }

    public CreateSampleSnapshotTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSampleSnapshotTemplateRequest(CreateSampleSnapshotTemplateRequest source) {
        if (source.SampleType != null) {
            this.SampleType = new String(source.SampleType);
        }
        if (source.SampleInterval != null) {
            this.SampleInterval = new Long(source.SampleInterval);
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
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.FillType != null) {
            this.FillType = new String(source.FillType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SampleType", this.SampleType);
        this.setParamSimple(map, prefix + "SampleInterval", this.SampleInterval);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "ResolutionAdaptive", this.ResolutionAdaptive);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "FillType", this.FillType);

    }
}


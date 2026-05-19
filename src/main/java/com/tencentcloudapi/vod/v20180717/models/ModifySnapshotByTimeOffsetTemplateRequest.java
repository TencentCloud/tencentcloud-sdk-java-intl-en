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

public class ModifySnapshotByTimeOffsetTemplateRequest extends AbstractModel {

    /**
    * Unique identifier of the screenshot template at specified time point.
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
    * Screenshot template name at specified time point. Length limit: 64 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * The maximum screenshot width (or long edge), value ranges from 0 to [32, 4096], measurement unit: px.<li>When both Width and Height are 0, the resolution is Same Resolution Source.</li><li>When Width is 0 and Height is not 0, Width is proportionally scaled.</li><li>When Width is not 0 and Height is 0, Height is proportionally scaled.</li><li>When both Width and Height are not 0, the resolution is specified by user.</li>Default value: 0.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Maximum value of screenshot height (or short edge), value ranges from 0 to [32, 4096], measurement unit: px. <li>When both Width and Height are 0, resolution is Same Resolution Source.</li> <li>When Width is 0 and Height is not 0, Width is proportionally scaled.</li> <li>When Width is not 0 and Height is 0, Height is proportionally scaled.</li> <li>When both Width and Height are not 0, resolution is specified by user.</li> Default value: 0.
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
    * Image format. Value can be jpg and png.
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * Template description, with a length limit of 256 characters.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Filling method. When the video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the processing method for transcoding is "padding". Optional filling mode:
<li> stretch: Stretch each frame to fill the entire screen, possibly causing the transcoded video to be "squashed" or "stretched";</li>
<li>black: Keep black, maintain video aspect ratio, edges filled with black.</li>
<li>white: Leave blank, maintain video aspect ratio, edge remainder filled with white.</li>
<li>gauss: Gaussian blur, maintain video aspect ratio, and use Gaussian blur for the remaining edge part.</li>
Default value: black.
    */
    @SerializedName("FillType")
    @Expose
    private String FillType;

    /**
     * Get Unique identifier of the screenshot template at specified time point. 
     * @return Definition Unique identifier of the screenshot template at specified time point.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Unique identifier of the screenshot template at specified time point.
     * @param Definition Unique identifier of the screenshot template at specified time point.
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
     * Get Screenshot template name at specified time point. Length limit: 64 characters. 
     * @return Name Screenshot template name at specified time point. Length limit: 64 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Screenshot template name at specified time point. Length limit: 64 characters.
     * @param Name Screenshot template name at specified time point. Length limit: 64 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get The maximum screenshot width (or long edge), value ranges from 0 to [32, 4096], measurement unit: px.<li>When both Width and Height are 0, the resolution is Same Resolution Source.</li><li>When Width is 0 and Height is not 0, Width is proportionally scaled.</li><li>When Width is not 0 and Height is 0, Height is proportionally scaled.</li><li>When both Width and Height are not 0, the resolution is specified by user.</li>Default value: 0. 
     * @return Width The maximum screenshot width (or long edge), value ranges from 0 to [32, 4096], measurement unit: px.<li>When both Width and Height are 0, the resolution is Same Resolution Source.</li><li>When Width is 0 and Height is not 0, Width is proportionally scaled.</li><li>When Width is not 0 and Height is 0, Height is proportionally scaled.</li><li>When both Width and Height are not 0, the resolution is specified by user.</li>Default value: 0.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set The maximum screenshot width (or long edge), value ranges from 0 to [32, 4096], measurement unit: px.<li>When both Width and Height are 0, the resolution is Same Resolution Source.</li><li>When Width is 0 and Height is not 0, Width is proportionally scaled.</li><li>When Width is not 0 and Height is 0, Height is proportionally scaled.</li><li>When both Width and Height are not 0, the resolution is specified by user.</li>Default value: 0.
     * @param Width The maximum screenshot width (or long edge), value ranges from 0 to [32, 4096], measurement unit: px.<li>When both Width and Height are 0, the resolution is Same Resolution Source.</li><li>When Width is 0 and Height is not 0, Width is proportionally scaled.</li><li>When Width is not 0 and Height is 0, Height is proportionally scaled.</li><li>When both Width and Height are not 0, the resolution is specified by user.</li>Default value: 0.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Maximum value of screenshot height (or short edge), value ranges from 0 to [32, 4096], measurement unit: px. <li>When both Width and Height are 0, resolution is Same Resolution Source.</li> <li>When Width is 0 and Height is not 0, Width is proportionally scaled.</li> <li>When Width is not 0 and Height is 0, Height is proportionally scaled.</li> <li>When both Width and Height are not 0, resolution is specified by user.</li> Default value: 0. 
     * @return Height Maximum value of screenshot height (or short edge), value ranges from 0 to [32, 4096], measurement unit: px. <li>When both Width and Height are 0, resolution is Same Resolution Source.</li> <li>When Width is 0 and Height is not 0, Width is proportionally scaled.</li> <li>When Width is not 0 and Height is 0, Height is proportionally scaled.</li> <li>When both Width and Height are not 0, resolution is specified by user.</li> Default value: 0.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Maximum value of screenshot height (or short edge), value ranges from 0 to [32, 4096], measurement unit: px. <li>When both Width and Height are 0, resolution is Same Resolution Source.</li> <li>When Width is 0 and Height is not 0, Width is proportionally scaled.</li> <li>When Width is not 0 and Height is 0, Height is proportionally scaled.</li> <li>When both Width and Height are not 0, resolution is specified by user.</li> Default value: 0.
     * @param Height Maximum value of screenshot height (or short edge), value ranges from 0 to [32, 4096], measurement unit: px. <li>When both Width and Height are 0, resolution is Same Resolution Source.</li> <li>When Width is 0 and Height is not 0, Width is proportionally scaled.</li> <li>When Width is not 0 and Height is 0, Height is proportionally scaled.</li> <li>When both Width and Height are not 0, resolution is specified by user.</li> Default value: 0.
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
     * Get Image format. Value can be jpg and png. 
     * @return Format Image format. Value can be jpg and png.
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set Image format. Value can be jpg and png.
     * @param Format Image format. Value can be jpg and png.
     */
    public void setFormat(String Format) {
        this.Format = Format;
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
     * Get Filling method. When the video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the processing method for transcoding is "padding". Optional filling mode:
<li> stretch: Stretch each frame to fill the entire screen, possibly causing the transcoded video to be "squashed" or "stretched";</li>
<li>black: Keep black, maintain video aspect ratio, edges filled with black.</li>
<li>white: Leave blank, maintain video aspect ratio, edge remainder filled with white.</li>
<li>gauss: Gaussian blur, maintain video aspect ratio, and use Gaussian blur for the remaining edge part.</li>
Default value: black. 
     * @return FillType Filling method. When the video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the processing method for transcoding is "padding". Optional filling mode:
<li> stretch: Stretch each frame to fill the entire screen, possibly causing the transcoded video to be "squashed" or "stretched";</li>
<li>black: Keep black, maintain video aspect ratio, edges filled with black.</li>
<li>white: Leave blank, maintain video aspect ratio, edge remainder filled with white.</li>
<li>gauss: Gaussian blur, maintain video aspect ratio, and use Gaussian blur for the remaining edge part.</li>
Default value: black.
     */
    public String getFillType() {
        return this.FillType;
    }

    /**
     * Set Filling method. When the video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the processing method for transcoding is "padding". Optional filling mode:
<li> stretch: Stretch each frame to fill the entire screen, possibly causing the transcoded video to be "squashed" or "stretched";</li>
<li>black: Keep black, maintain video aspect ratio, edges filled with black.</li>
<li>white: Leave blank, maintain video aspect ratio, edge remainder filled with white.</li>
<li>gauss: Gaussian blur, maintain video aspect ratio, and use Gaussian blur for the remaining edge part.</li>
Default value: black.
     * @param FillType Filling method. When the video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the processing method for transcoding is "padding". Optional filling mode:
<li> stretch: Stretch each frame to fill the entire screen, possibly causing the transcoded video to be "squashed" or "stretched";</li>
<li>black: Keep black, maintain video aspect ratio, edges filled with black.</li>
<li>white: Leave blank, maintain video aspect ratio, edge remainder filled with white.</li>
<li>gauss: Gaussian blur, maintain video aspect ratio, and use Gaussian blur for the remaining edge part.</li>
Default value: black.
     */
    public void setFillType(String FillType) {
        this.FillType = FillType;
    }

    public ModifySnapshotByTimeOffsetTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySnapshotByTimeOffsetTemplateRequest(ModifySnapshotByTimeOffsetTemplateRequest source) {
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
        this.setParamSimple(map, prefix + "Definition", this.Definition);
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


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

public class SnapshotByTimeOffsetTemplate extends AbstractModel {

    /**
    * Unique ID of a specified time point screencapturing template.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Template type. Valid values:
<li>Preset: preset template;</li>
<li>Custom: custom template.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Name of a specified time point screencapturing template.
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
    * Maximum value of the width (or long side) of a screenshot in px. Value range: 0 and [128, 4,096].
<li>If both `Width` and `Height` are 0, the resolution will be the same as that of the source video;</li>
<li>If `Width` is 0, but `Height` is not 0, `Width` will be proportionally scaled;</li>
<li>If `Width` is not 0, but `Height` is 0, `Height` will be proportionally scaled;</li>
<li>If both `Width` and `Height` are not 0, the custom resolution will be used.</li>
Default value: 0.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Maximum value of the height (or short side) of a screenshot in px. Value range: 0 and [128, 4,096].
<li>If both `Width` and `Height` are 0, the resolution will be the same as that of the source video;</li>
<li>If `Width` is 0, but `Height` is not 0, `Width` will be proportionally scaled;</li>
<li>If `Width` is not 0, but `Height` is 0, `Height` will be proportionally scaled;</li>
<li>If both `Width` and `Height` are not 0, the custom resolution will be used.</li>
Default value: 0.
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
    * Image format.
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * Creation time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last modified time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * The fill mode, or the way of processing a screenshot when the configured aspect ratio is different from that of the source video. Valid values:
<li>stretch: Stretch the image frame by frame to fill the entire screen. The video image may become "squashed" or "stretched" after transcoding.</li>
<li>black: Keep the image's original aspect ratio and fill the blank space with black bars.</li>
<li>white: Keep the image’s original aspect ratio and fill the blank space with white bars.</li>
<li>gauss: Keep the image’s original aspect ratio and apply Gaussian blur to the blank space.</li>
Default value: black.
    */
    @SerializedName("FillType")
    @Expose
    private String FillType;

    /**
     * Get Unique ID of a specified time point screencapturing template. 
     * @return Definition Unique ID of a specified time point screencapturing template.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Unique ID of a specified time point screencapturing template.
     * @param Definition Unique ID of a specified time point screencapturing template.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Template type. Valid values:
<li>Preset: preset template;</li>
<li>Custom: custom template.</li> 
     * @return Type Template type. Valid values:
<li>Preset: preset template;</li>
<li>Custom: custom template.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Template type. Valid values:
<li>Preset: preset template;</li>
<li>Custom: custom template.</li>
     * @param Type Template type. Valid values:
<li>Preset: preset template;</li>
<li>Custom: custom template.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Name of a specified time point screencapturing template. 
     * @return Name Name of a specified time point screencapturing template.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of a specified time point screencapturing template.
     * @param Name Name of a specified time point screencapturing template.
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
     * Get Maximum value of the width (or long side) of a screenshot in px. Value range: 0 and [128, 4,096].
<li>If both `Width` and `Height` are 0, the resolution will be the same as that of the source video;</li>
<li>If `Width` is 0, but `Height` is not 0, `Width` will be proportionally scaled;</li>
<li>If `Width` is not 0, but `Height` is 0, `Height` will be proportionally scaled;</li>
<li>If both `Width` and `Height` are not 0, the custom resolution will be used.</li>
Default value: 0. 
     * @return Width Maximum value of the width (or long side) of a screenshot in px. Value range: 0 and [128, 4,096].
<li>If both `Width` and `Height` are 0, the resolution will be the same as that of the source video;</li>
<li>If `Width` is 0, but `Height` is not 0, `Width` will be proportionally scaled;</li>
<li>If `Width` is not 0, but `Height` is 0, `Height` will be proportionally scaled;</li>
<li>If both `Width` and `Height` are not 0, the custom resolution will be used.</li>
Default value: 0.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Maximum value of the width (or long side) of a screenshot in px. Value range: 0 and [128, 4,096].
<li>If both `Width` and `Height` are 0, the resolution will be the same as that of the source video;</li>
<li>If `Width` is 0, but `Height` is not 0, `Width` will be proportionally scaled;</li>
<li>If `Width` is not 0, but `Height` is 0, `Height` will be proportionally scaled;</li>
<li>If both `Width` and `Height` are not 0, the custom resolution will be used.</li>
Default value: 0.
     * @param Width Maximum value of the width (or long side) of a screenshot in px. Value range: 0 and [128, 4,096].
<li>If both `Width` and `Height` are 0, the resolution will be the same as that of the source video;</li>
<li>If `Width` is 0, but `Height` is not 0, `Width` will be proportionally scaled;</li>
<li>If `Width` is not 0, but `Height` is 0, `Height` will be proportionally scaled;</li>
<li>If both `Width` and `Height` are not 0, the custom resolution will be used.</li>
Default value: 0.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Maximum value of the height (or short side) of a screenshot in px. Value range: 0 and [128, 4,096].
<li>If both `Width` and `Height` are 0, the resolution will be the same as that of the source video;</li>
<li>If `Width` is 0, but `Height` is not 0, `Width` will be proportionally scaled;</li>
<li>If `Width` is not 0, but `Height` is 0, `Height` will be proportionally scaled;</li>
<li>If both `Width` and `Height` are not 0, the custom resolution will be used.</li>
Default value: 0. 
     * @return Height Maximum value of the height (or short side) of a screenshot in px. Value range: 0 and [128, 4,096].
<li>If both `Width` and `Height` are 0, the resolution will be the same as that of the source video;</li>
<li>If `Width` is 0, but `Height` is not 0, `Width` will be proportionally scaled;</li>
<li>If `Width` is not 0, but `Height` is 0, `Height` will be proportionally scaled;</li>
<li>If both `Width` and `Height` are not 0, the custom resolution will be used.</li>
Default value: 0.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Maximum value of the height (or short side) of a screenshot in px. Value range: 0 and [128, 4,096].
<li>If both `Width` and `Height` are 0, the resolution will be the same as that of the source video;</li>
<li>If `Width` is 0, but `Height` is not 0, `Width` will be proportionally scaled;</li>
<li>If `Width` is not 0, but `Height` is 0, `Height` will be proportionally scaled;</li>
<li>If both `Width` and `Height` are not 0, the custom resolution will be used.</li>
Default value: 0.
     * @param Height Maximum value of the height (or short side) of a screenshot in px. Value range: 0 and [128, 4,096].
<li>If both `Width` and `Height` are 0, the resolution will be the same as that of the source video;</li>
<li>If `Width` is 0, but `Height` is not 0, `Width` will be proportionally scaled;</li>
<li>If `Width` is not 0, but `Height` is 0, `Height` will be proportionally scaled;</li>
<li>If both `Width` and `Height` are not 0, the custom resolution will be used.</li>
Default value: 0.
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

    /**
     * Get Creation time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return CreateTime Creation time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param CreateTime Creation time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last modified time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return UpdateTime Last modified time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last modified time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param UpdateTime Last modified time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get The fill mode, or the way of processing a screenshot when the configured aspect ratio is different from that of the source video. Valid values:
<li>stretch: Stretch the image frame by frame to fill the entire screen. The video image may become "squashed" or "stretched" after transcoding.</li>
<li>black: Keep the image's original aspect ratio and fill the blank space with black bars.</li>
<li>white: Keep the image’s original aspect ratio and fill the blank space with white bars.</li>
<li>gauss: Keep the image’s original aspect ratio and apply Gaussian blur to the blank space.</li>
Default value: black. 
     * @return FillType The fill mode, or the way of processing a screenshot when the configured aspect ratio is different from that of the source video. Valid values:
<li>stretch: Stretch the image frame by frame to fill the entire screen. The video image may become "squashed" or "stretched" after transcoding.</li>
<li>black: Keep the image's original aspect ratio and fill the blank space with black bars.</li>
<li>white: Keep the image’s original aspect ratio and fill the blank space with white bars.</li>
<li>gauss: Keep the image’s original aspect ratio and apply Gaussian blur to the blank space.</li>
Default value: black.
     */
    public String getFillType() {
        return this.FillType;
    }

    /**
     * Set The fill mode, or the way of processing a screenshot when the configured aspect ratio is different from that of the source video. Valid values:
<li>stretch: Stretch the image frame by frame to fill the entire screen. The video image may become "squashed" or "stretched" after transcoding.</li>
<li>black: Keep the image's original aspect ratio and fill the blank space with black bars.</li>
<li>white: Keep the image’s original aspect ratio and fill the blank space with white bars.</li>
<li>gauss: Keep the image’s original aspect ratio and apply Gaussian blur to the blank space.</li>
Default value: black.
     * @param FillType The fill mode, or the way of processing a screenshot when the configured aspect ratio is different from that of the source video. Valid values:
<li>stretch: Stretch the image frame by frame to fill the entire screen. The video image may become "squashed" or "stretched" after transcoding.</li>
<li>black: Keep the image's original aspect ratio and fill the blank space with black bars.</li>
<li>white: Keep the image’s original aspect ratio and fill the blank space with white bars.</li>
<li>gauss: Keep the image’s original aspect ratio and apply Gaussian blur to the blank space.</li>
Default value: black.
     */
    public void setFillType(String FillType) {
        this.FillType = FillType;
    }

    public SnapshotByTimeOffsetTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SnapshotByTimeOffsetTemplate(SnapshotByTimeOffsetTemplate source) {
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
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
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
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "ResolutionAdaptive", this.ResolutionAdaptive);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "FillType", this.FillType);

    }
}


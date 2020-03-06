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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyImageSpriteTemplateRequest extends AbstractModel{

    /**
    * Unique ID of an image sprite generating template.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Name of an image sprite generating template. Length limit: 64 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Subimage width of an image sprite in px. Value range: [128, 4,096].
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Subimage height of an image sprite in px. Value range: [128, 4,096].
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
    * Subimage row count of an image sprite.
    */
    @SerializedName("RowCount")
    @Expose
    private Long RowCount;

    /**
    * Subimage column count of an image sprite.
    */
    @SerializedName("ColumnCount")
    @Expose
    private Long ColumnCount;

    /**
    * ID of a [subapplication](/document/product/266/14574) in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

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
     * Get Unique ID of an image sprite generating template. 
     * @return Definition Unique ID of an image sprite generating template.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Unique ID of an image sprite generating template.
     * @param Definition Unique ID of an image sprite generating template.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
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
     * Get Subimage width of an image sprite in px. Value range: [128, 4,096]. 
     * @return Width Subimage width of an image sprite in px. Value range: [128, 4,096].
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Subimage width of an image sprite in px. Value range: [128, 4,096].
     * @param Width Subimage width of an image sprite in px. Value range: [128, 4,096].
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Subimage height of an image sprite in px. Value range: [128, 4,096]. 
     * @return Height Subimage height of an image sprite in px. Value range: [128, 4,096].
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Subimage height of an image sprite in px. Value range: [128, 4,096].
     * @param Height Subimage height of an image sprite in px. Value range: [128, 4,096].
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
     * Get Subimage row count of an image sprite. 
     * @return RowCount Subimage row count of an image sprite.
     */
    public Long getRowCount() {
        return this.RowCount;
    }

    /**
     * Set Subimage row count of an image sprite.
     * @param RowCount Subimage row count of an image sprite.
     */
    public void setRowCount(Long RowCount) {
        this.RowCount = RowCount;
    }

    /**
     * Get Subimage column count of an image sprite. 
     * @return ColumnCount Subimage column count of an image sprite.
     */
    public Long getColumnCount() {
        return this.ColumnCount;
    }

    /**
     * Set Subimage column count of an image sprite.
     * @param ColumnCount Subimage column count of an image sprite.
     */
    public void setColumnCount(Long ColumnCount) {
        this.ColumnCount = ColumnCount;
    }

    /**
     * Get ID of a [subapplication](/document/product/266/14574) in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty. 
     * @return SubAppId ID of a [subapplication](/document/product/266/14574) in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set ID of a [subapplication](/document/product/266/14574) in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
     * @param SubAppId ID of a [subapplication](/document/product/266/14574) in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "ResolutionAdaptive", this.ResolutionAdaptive);
        this.setParamSimple(map, prefix + "SampleType", this.SampleType);
        this.setParamSimple(map, prefix + "SampleInterval", this.SampleInterval);
        this.setParamSimple(map, prefix + "RowCount", this.RowCount);
        this.setParamSimple(map, prefix + "ColumnCount", this.ColumnCount);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "FillType", this.FillType);

    }
}


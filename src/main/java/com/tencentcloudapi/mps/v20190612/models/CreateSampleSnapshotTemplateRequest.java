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

public class CreateSampleSnapshotTemplateRequest extends AbstractModel{

    /**
    * Image width in px. Value range: [128, 4,096].
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Image height in px. Value range: [128, 4,096].
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * Sampled screencapturing type. Valid values:
<li>Percent: By percent.</li>
<li>Time: By time interval.</li>
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
    * Name of a sampled screencapturing template. Length limit: 64 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Image format. Valid values: jpg; png. Default value: jpg.
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * Template description. Length limit: 256 characters.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
     * Get Image width in px. Value range: [128, 4,096]. 
     * @return Width Image width in px. Value range: [128, 4,096].
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Image width in px. Value range: [128, 4,096].
     * @param Width Image width in px. Value range: [128, 4,096].
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Image height in px. Value range: [128, 4,096]. 
     * @return Height Image height in px. Value range: [128, 4,096].
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Image height in px. Value range: [128, 4,096].
     * @param Height Image height in px. Value range: [128, 4,096].
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get Sampled screencapturing type. Valid values:
<li>Percent: By percent.</li>
<li>Time: By time interval.</li> 
     * @return SampleType Sampled screencapturing type. Valid values:
<li>Percent: By percent.</li>
<li>Time: By time interval.</li>
     */
    public String getSampleType() {
        return this.SampleType;
    }

    /**
     * Set Sampled screencapturing type. Valid values:
<li>Percent: By percent.</li>
<li>Time: By time interval.</li>
     * @param SampleType Sampled screencapturing type. Valid values:
<li>Percent: By percent.</li>
<li>Time: By time interval.</li>
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
     * Get Name of a sampled screencapturing template. Length limit: 64 characters. 
     * @return Name Name of a sampled screencapturing template. Length limit: 64 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of a sampled screencapturing template. Length limit: 64 characters.
     * @param Name Name of a sampled screencapturing template. Length limit: 64 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Image format. Valid values: jpg; png. Default value: jpg. 
     * @return Format Image format. Valid values: jpg; png. Default value: jpg.
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set Image format. Valid values: jpg; png. Default value: jpg.
     * @param Format Image format. Valid values: jpg; png. Default value: jpg.
     */
    public void setFormat(String Format) {
        this.Format = Format;
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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "SampleType", this.SampleType);
        this.setParamSimple(map, prefix + "SampleInterval", this.SampleInterval);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "Comment", this.Comment);

    }
}


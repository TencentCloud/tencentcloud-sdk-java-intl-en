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

public class TranscodeTaskInput extends AbstractModel{

    /**
    * ID of a video transcoding template.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Custom video transcoding parameter, which is valid if `Definition` is 0.
This parameter is used in highly customized scenarios. We recommend you use `Definition` to specify the transcoding parameter preferably.
    */
    @SerializedName("RawParameter")
    @Expose
    private RawTranscodeParameter RawParameter;

    /**
    * Video transcoding custom parameter, which is valid when `Definition` is not 0.
When any parameters in this structure are entered, they will be used to override corresponding parameters in templates.
This parameter is used in highly customized scenarios. We recommend you only use `Definition` to specify the transcoding parameter.
Note: this field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("OverrideParameter")
    @Expose
    private OverrideTranscodeParameter OverrideParameter;

    /**
    * List of up to 10 image or text watermarks.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WatermarkSet")
    @Expose
    private WatermarkInput [] WatermarkSet;

    /**
    * List of blurs. Up to 10 ones can be supported.
    */
    @SerializedName("MosaicSet")
    @Expose
    private MosaicInput [] MosaicSet;

    /**
    * Start time offset of a transcoded video, in seconds.
<li>If this parameter is left empty or set to 0, the transcoded video will start at the same time as the original video.</li>
<li>If this parameter is set to a positive number (n for example), the transcoded video will start at the nth second of the original video.</li>
<li>If this parameter is set to a negative number (-n for example), the transcoded video will start at the nth second before the end of the original video.</li>
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * End time offset of a transcoded video, in seconds.
<li>If this parameter is left empty or set to 0, the transcoded video will end at the same time as the original video.</li>
<li>If this parameter is set to a positive number (n for example), the transcoded video will end at the nth second of the original video.</li>
<li>If this parameter is set to a negative number (-n for example), the transcoded video will end at the nth second before the end of the original video.</li>
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
    * Target bucket of an output file. If this parameter is left empty, the `OutputStorage` value of the upper folder will be inherited.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * Path to a primary output file, which can be a relative path or an absolute path. If this parameter is left empty, the following relative path will be used by default: `{inputName}_transcode_{definition}.{format}`.
    */
    @SerializedName("OutputObjectPath")
    @Expose
    private String OutputObjectPath;

    /**
    * Path to an output file part (the path to ts during transcoding to HLS), which can only be a relative path. If this parameter is left empty, the following relative path will be used by default: `{inputName}_transcode_{definition}_{number}.{format}`.
    */
    @SerializedName("SegmentObjectName")
    @Expose
    private String SegmentObjectName;

    /**
    * Rule of the `{number}` variable in the output path after transcoding.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ObjectNumberFormat")
    @Expose
    private NumberFormat ObjectNumberFormat;

    /**
     * Get ID of a video transcoding template. 
     * @return Definition ID of a video transcoding template.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set ID of a video transcoding template.
     * @param Definition ID of a video transcoding template.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Custom video transcoding parameter, which is valid if `Definition` is 0.
This parameter is used in highly customized scenarios. We recommend you use `Definition` to specify the transcoding parameter preferably. 
     * @return RawParameter Custom video transcoding parameter, which is valid if `Definition` is 0.
This parameter is used in highly customized scenarios. We recommend you use `Definition` to specify the transcoding parameter preferably.
     */
    public RawTranscodeParameter getRawParameter() {
        return this.RawParameter;
    }

    /**
     * Set Custom video transcoding parameter, which is valid if `Definition` is 0.
This parameter is used in highly customized scenarios. We recommend you use `Definition` to specify the transcoding parameter preferably.
     * @param RawParameter Custom video transcoding parameter, which is valid if `Definition` is 0.
This parameter is used in highly customized scenarios. We recommend you use `Definition` to specify the transcoding parameter preferably.
     */
    public void setRawParameter(RawTranscodeParameter RawParameter) {
        this.RawParameter = RawParameter;
    }

    /**
     * Get Video transcoding custom parameter, which is valid when `Definition` is not 0.
When any parameters in this structure are entered, they will be used to override corresponding parameters in templates.
This parameter is used in highly customized scenarios. We recommend you only use `Definition` to specify the transcoding parameter.
Note: this field may return `null`, indicating that no valid value was found. 
     * @return OverrideParameter Video transcoding custom parameter, which is valid when `Definition` is not 0.
When any parameters in this structure are entered, they will be used to override corresponding parameters in templates.
This parameter is used in highly customized scenarios. We recommend you only use `Definition` to specify the transcoding parameter.
Note: this field may return `null`, indicating that no valid value was found.
     */
    public OverrideTranscodeParameter getOverrideParameter() {
        return this.OverrideParameter;
    }

    /**
     * Set Video transcoding custom parameter, which is valid when `Definition` is not 0.
When any parameters in this structure are entered, they will be used to override corresponding parameters in templates.
This parameter is used in highly customized scenarios. We recommend you only use `Definition` to specify the transcoding parameter.
Note: this field may return `null`, indicating that no valid value was found.
     * @param OverrideParameter Video transcoding custom parameter, which is valid when `Definition` is not 0.
When any parameters in this structure are entered, they will be used to override corresponding parameters in templates.
This parameter is used in highly customized scenarios. We recommend you only use `Definition` to specify the transcoding parameter.
Note: this field may return `null`, indicating that no valid value was found.
     */
    public void setOverrideParameter(OverrideTranscodeParameter OverrideParameter) {
        this.OverrideParameter = OverrideParameter;
    }

    /**
     * Get List of up to 10 image or text watermarks.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WatermarkSet List of up to 10 image or text watermarks.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public WatermarkInput [] getWatermarkSet() {
        return this.WatermarkSet;
    }

    /**
     * Set List of up to 10 image or text watermarks.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WatermarkSet List of up to 10 image or text watermarks.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWatermarkSet(WatermarkInput [] WatermarkSet) {
        this.WatermarkSet = WatermarkSet;
    }

    /**
     * Get List of blurs. Up to 10 ones can be supported. 
     * @return MosaicSet List of blurs. Up to 10 ones can be supported.
     */
    public MosaicInput [] getMosaicSet() {
        return this.MosaicSet;
    }

    /**
     * Set List of blurs. Up to 10 ones can be supported.
     * @param MosaicSet List of blurs. Up to 10 ones can be supported.
     */
    public void setMosaicSet(MosaicInput [] MosaicSet) {
        this.MosaicSet = MosaicSet;
    }

    /**
     * Get Start time offset of a transcoded video, in seconds.
<li>If this parameter is left empty or set to 0, the transcoded video will start at the same time as the original video.</li>
<li>If this parameter is set to a positive number (n for example), the transcoded video will start at the nth second of the original video.</li>
<li>If this parameter is set to a negative number (-n for example), the transcoded video will start at the nth second before the end of the original video.</li> 
     * @return StartTimeOffset Start time offset of a transcoded video, in seconds.
<li>If this parameter is left empty or set to 0, the transcoded video will start at the same time as the original video.</li>
<li>If this parameter is set to a positive number (n for example), the transcoded video will start at the nth second of the original video.</li>
<li>If this parameter is set to a negative number (-n for example), the transcoded video will start at the nth second before the end of the original video.</li>
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set Start time offset of a transcoded video, in seconds.
<li>If this parameter is left empty or set to 0, the transcoded video will start at the same time as the original video.</li>
<li>If this parameter is set to a positive number (n for example), the transcoded video will start at the nth second of the original video.</li>
<li>If this parameter is set to a negative number (-n for example), the transcoded video will start at the nth second before the end of the original video.</li>
     * @param StartTimeOffset Start time offset of a transcoded video, in seconds.
<li>If this parameter is left empty or set to 0, the transcoded video will start at the same time as the original video.</li>
<li>If this parameter is set to a positive number (n for example), the transcoded video will start at the nth second of the original video.</li>
<li>If this parameter is set to a negative number (-n for example), the transcoded video will start at the nth second before the end of the original video.</li>
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get End time offset of a transcoded video, in seconds.
<li>If this parameter is left empty or set to 0, the transcoded video will end at the same time as the original video.</li>
<li>If this parameter is set to a positive number (n for example), the transcoded video will end at the nth second of the original video.</li>
<li>If this parameter is set to a negative number (-n for example), the transcoded video will end at the nth second before the end of the original video.</li> 
     * @return EndTimeOffset End time offset of a transcoded video, in seconds.
<li>If this parameter is left empty or set to 0, the transcoded video will end at the same time as the original video.</li>
<li>If this parameter is set to a positive number (n for example), the transcoded video will end at the nth second of the original video.</li>
<li>If this parameter is set to a negative number (-n for example), the transcoded video will end at the nth second before the end of the original video.</li>
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set End time offset of a transcoded video, in seconds.
<li>If this parameter is left empty or set to 0, the transcoded video will end at the same time as the original video.</li>
<li>If this parameter is set to a positive number (n for example), the transcoded video will end at the nth second of the original video.</li>
<li>If this parameter is set to a negative number (-n for example), the transcoded video will end at the nth second before the end of the original video.</li>
     * @param EndTimeOffset End time offset of a transcoded video, in seconds.
<li>If this parameter is left empty or set to 0, the transcoded video will end at the same time as the original video.</li>
<li>If this parameter is set to a positive number (n for example), the transcoded video will end at the nth second of the original video.</li>
<li>If this parameter is set to a negative number (-n for example), the transcoded video will end at the nth second before the end of the original video.</li>
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * Get Target bucket of an output file. If this parameter is left empty, the `OutputStorage` value of the upper folder will be inherited.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OutputStorage Target bucket of an output file. If this parameter is left empty, the `OutputStorage` value of the upper folder will be inherited.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set Target bucket of an output file. If this parameter is left empty, the `OutputStorage` value of the upper folder will be inherited.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OutputStorage Target bucket of an output file. If this parameter is left empty, the `OutputStorage` value of the upper folder will be inherited.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Get Path to a primary output file, which can be a relative path or an absolute path. If this parameter is left empty, the following relative path will be used by default: `{inputName}_transcode_{definition}.{format}`. 
     * @return OutputObjectPath Path to a primary output file, which can be a relative path or an absolute path. If this parameter is left empty, the following relative path will be used by default: `{inputName}_transcode_{definition}.{format}`.
     */
    public String getOutputObjectPath() {
        return this.OutputObjectPath;
    }

    /**
     * Set Path to a primary output file, which can be a relative path or an absolute path. If this parameter is left empty, the following relative path will be used by default: `{inputName}_transcode_{definition}.{format}`.
     * @param OutputObjectPath Path to a primary output file, which can be a relative path or an absolute path. If this parameter is left empty, the following relative path will be used by default: `{inputName}_transcode_{definition}.{format}`.
     */
    public void setOutputObjectPath(String OutputObjectPath) {
        this.OutputObjectPath = OutputObjectPath;
    }

    /**
     * Get Path to an output file part (the path to ts during transcoding to HLS), which can only be a relative path. If this parameter is left empty, the following relative path will be used by default: `{inputName}_transcode_{definition}_{number}.{format}`. 
     * @return SegmentObjectName Path to an output file part (the path to ts during transcoding to HLS), which can only be a relative path. If this parameter is left empty, the following relative path will be used by default: `{inputName}_transcode_{definition}_{number}.{format}`.
     */
    public String getSegmentObjectName() {
        return this.SegmentObjectName;
    }

    /**
     * Set Path to an output file part (the path to ts during transcoding to HLS), which can only be a relative path. If this parameter is left empty, the following relative path will be used by default: `{inputName}_transcode_{definition}_{number}.{format}`.
     * @param SegmentObjectName Path to an output file part (the path to ts during transcoding to HLS), which can only be a relative path. If this parameter is left empty, the following relative path will be used by default: `{inputName}_transcode_{definition}_{number}.{format}`.
     */
    public void setSegmentObjectName(String SegmentObjectName) {
        this.SegmentObjectName = SegmentObjectName;
    }

    /**
     * Get Rule of the `{number}` variable in the output path after transcoding.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ObjectNumberFormat Rule of the `{number}` variable in the output path after transcoding.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public NumberFormat getObjectNumberFormat() {
        return this.ObjectNumberFormat;
    }

    /**
     * Set Rule of the `{number}` variable in the output path after transcoding.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ObjectNumberFormat Rule of the `{number}` variable in the output path after transcoding.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setObjectNumberFormat(NumberFormat ObjectNumberFormat) {
        this.ObjectNumberFormat = ObjectNumberFormat;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamObj(map, prefix + "RawParameter.", this.RawParameter);
        this.setParamObj(map, prefix + "OverrideParameter.", this.OverrideParameter);
        this.setParamArrayObj(map, prefix + "WatermarkSet.", this.WatermarkSet);
        this.setParamArrayObj(map, prefix + "MosaicSet.", this.MosaicSet);
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamSimple(map, prefix + "EndTimeOffset", this.EndTimeOffset);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);
        this.setParamSimple(map, prefix + "OutputObjectPath", this.OutputObjectPath);
        this.setParamSimple(map, prefix + "SegmentObjectName", this.SegmentObjectName);
        this.setParamObj(map, prefix + "ObjectNumberFormat.", this.ObjectNumberFormat);

    }
}


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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TranscodeTaskInput extends AbstractModel {

    /**
    * Video transcoding template ID.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Custom video transcoding parameter. It takes effect when Definition is set to 0.
This parameter is used in high customization scenarios. It is recommended that you preferentially use Definition to specify transcoding parameters.
    */
    @SerializedName("RawParameter")
    @Expose
    private RawTranscodeParameter RawParameter;

    /**
    * 
    */
    @SerializedName("OverrideParameter")
    @Expose
    private OverrideTranscodeParameter OverrideParameter;

    /**
    * Watermark list. Multiple image or text watermarks up to a maximum of 10 are supported.
    */
    @SerializedName("WatermarkSet")
    @Expose
    private WatermarkInput [] WatermarkSet;

    /**
    * 
    */
    @SerializedName("BlindWatermark")
    @Expose
    private BlindWatermarkInput BlindWatermark;

    /**
    * Mosaic list. A maximum of 10 images is supported.
    */
    @SerializedName("MosaicSet")
    @Expose
    private MosaicInput [] MosaicSet;

    /**
    * Start time offset of the transcoded video, in seconds.
<li>If this parameter is not specified or is set to 0, the transcoded video starts from the start position of the original video;</li>
<li>When the value is greater than 0 (assuming n), it means the transcoded video starts from the nth second of the original video;</li>
<li>When the value is less than 0 (assuming -n), it means the transcoded video starts n seconds before the end of the original video.</li>
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * End time offset of the transcoded video, in seconds.
<li>If not set or set to 0, the transcoded video will last until the end of the original video.</li>
<li>When the value is greater than 0 (assuming n), it means the transcoded video ends at the nth second of the original video.</li>
<li>When the value is less than 0 (assuming -n), it means the transcoded video lasts until n seconds before the end of the original video.</li>
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
    * 
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * Output path of the main file after transcoding, which can be a relative or absolute path.
To define the output path, the path must end with `.{format}`. For variable names, please refer to [Filename Variable Explanation](https://www.tencentcloud.com/document/product/862/37039?from_cn_redirect=1).
Relative path example:
<li>Filename_{Variable name}.{format}</li>
<li>Filename.{format}.</li>
Absolute path example:
<li>/Custom path/Filename_{Variable name}.{format}</li>
If left empty, the default relative path is `{inputName}_transcode_{definition}.{format}`.

    */
    @SerializedName("OutputObjectPath")
    @Expose
    private String OutputObjectPath;

    /**
    * Output path for segment files after transcoding (the path of TS files when transcoding to HLS), which can only be a relative path. If left empty, it defaults to `{inputName}_transcode_{definition}_{number}.{format}`.
    */
    @SerializedName("SegmentObjectName")
    @Expose
    private String SegmentObjectName;

    /**
    * 
    */
    @SerializedName("ObjectNumberFormat")
    @Expose
    private NumberFormat ObjectNumberFormat;

    /**
    * 
    */
    @SerializedName("HeadTailParameter")
    @Expose
    private HeadTailParameter HeadTailParameter;

    /**
     * Get Video transcoding template ID. 
     * @return Definition Video transcoding template ID.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Video transcoding template ID.
     * @param Definition Video transcoding template ID.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Custom video transcoding parameter. It takes effect when Definition is set to 0.
This parameter is used in high customization scenarios. It is recommended that you preferentially use Definition to specify transcoding parameters. 
     * @return RawParameter Custom video transcoding parameter. It takes effect when Definition is set to 0.
This parameter is used in high customization scenarios. It is recommended that you preferentially use Definition to specify transcoding parameters.
     */
    public RawTranscodeParameter getRawParameter() {
        return this.RawParameter;
    }

    /**
     * Set Custom video transcoding parameter. It takes effect when Definition is set to 0.
This parameter is used in high customization scenarios. It is recommended that you preferentially use Definition to specify transcoding parameters.
     * @param RawParameter Custom video transcoding parameter. It takes effect when Definition is set to 0.
This parameter is used in high customization scenarios. It is recommended that you preferentially use Definition to specify transcoding parameters.
     */
    public void setRawParameter(RawTranscodeParameter RawParameter) {
        this.RawParameter = RawParameter;
    }

    /**
     * Get  
     * @return OverrideParameter 
     */
    public OverrideTranscodeParameter getOverrideParameter() {
        return this.OverrideParameter;
    }

    /**
     * Set 
     * @param OverrideParameter 
     */
    public void setOverrideParameter(OverrideTranscodeParameter OverrideParameter) {
        this.OverrideParameter = OverrideParameter;
    }

    /**
     * Get Watermark list. Multiple image or text watermarks up to a maximum of 10 are supported. 
     * @return WatermarkSet Watermark list. Multiple image or text watermarks up to a maximum of 10 are supported.
     */
    public WatermarkInput [] getWatermarkSet() {
        return this.WatermarkSet;
    }

    /**
     * Set Watermark list. Multiple image or text watermarks up to a maximum of 10 are supported.
     * @param WatermarkSet Watermark list. Multiple image or text watermarks up to a maximum of 10 are supported.
     */
    public void setWatermarkSet(WatermarkInput [] WatermarkSet) {
        this.WatermarkSet = WatermarkSet;
    }

    /**
     * Get  
     * @return BlindWatermark 
     */
    public BlindWatermarkInput getBlindWatermark() {
        return this.BlindWatermark;
    }

    /**
     * Set 
     * @param BlindWatermark 
     */
    public void setBlindWatermark(BlindWatermarkInput BlindWatermark) {
        this.BlindWatermark = BlindWatermark;
    }

    /**
     * Get Mosaic list. A maximum of 10 images is supported. 
     * @return MosaicSet Mosaic list. A maximum of 10 images is supported.
     */
    public MosaicInput [] getMosaicSet() {
        return this.MosaicSet;
    }

    /**
     * Set Mosaic list. A maximum of 10 images is supported.
     * @param MosaicSet Mosaic list. A maximum of 10 images is supported.
     */
    public void setMosaicSet(MosaicInput [] MosaicSet) {
        this.MosaicSet = MosaicSet;
    }

    /**
     * Get Start time offset of the transcoded video, in seconds.
<li>If this parameter is not specified or is set to 0, the transcoded video starts from the start position of the original video;</li>
<li>When the value is greater than 0 (assuming n), it means the transcoded video starts from the nth second of the original video;</li>
<li>When the value is less than 0 (assuming -n), it means the transcoded video starts n seconds before the end of the original video.</li> 
     * @return StartTimeOffset Start time offset of the transcoded video, in seconds.
<li>If this parameter is not specified or is set to 0, the transcoded video starts from the start position of the original video;</li>
<li>When the value is greater than 0 (assuming n), it means the transcoded video starts from the nth second of the original video;</li>
<li>When the value is less than 0 (assuming -n), it means the transcoded video starts n seconds before the end of the original video.</li>
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set Start time offset of the transcoded video, in seconds.
<li>If this parameter is not specified or is set to 0, the transcoded video starts from the start position of the original video;</li>
<li>When the value is greater than 0 (assuming n), it means the transcoded video starts from the nth second of the original video;</li>
<li>When the value is less than 0 (assuming -n), it means the transcoded video starts n seconds before the end of the original video.</li>
     * @param StartTimeOffset Start time offset of the transcoded video, in seconds.
<li>If this parameter is not specified or is set to 0, the transcoded video starts from the start position of the original video;</li>
<li>When the value is greater than 0 (assuming n), it means the transcoded video starts from the nth second of the original video;</li>
<li>When the value is less than 0 (assuming -n), it means the transcoded video starts n seconds before the end of the original video.</li>
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get End time offset of the transcoded video, in seconds.
<li>If not set or set to 0, the transcoded video will last until the end of the original video.</li>
<li>When the value is greater than 0 (assuming n), it means the transcoded video ends at the nth second of the original video.</li>
<li>When the value is less than 0 (assuming -n), it means the transcoded video lasts until n seconds before the end of the original video.</li> 
     * @return EndTimeOffset End time offset of the transcoded video, in seconds.
<li>If not set or set to 0, the transcoded video will last until the end of the original video.</li>
<li>When the value is greater than 0 (assuming n), it means the transcoded video ends at the nth second of the original video.</li>
<li>When the value is less than 0 (assuming -n), it means the transcoded video lasts until n seconds before the end of the original video.</li>
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set End time offset of the transcoded video, in seconds.
<li>If not set or set to 0, the transcoded video will last until the end of the original video.</li>
<li>When the value is greater than 0 (assuming n), it means the transcoded video ends at the nth second of the original video.</li>
<li>When the value is less than 0 (assuming -n), it means the transcoded video lasts until n seconds before the end of the original video.</li>
     * @param EndTimeOffset End time offset of the transcoded video, in seconds.
<li>If not set or set to 0, the transcoded video will last until the end of the original video.</li>
<li>When the value is greater than 0 (assuming n), it means the transcoded video ends at the nth second of the original video.</li>
<li>When the value is less than 0 (assuming -n), it means the transcoded video lasts until n seconds before the end of the original video.</li>
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * Get  
     * @return OutputStorage 
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set 
     * @param OutputStorage 
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Get Output path of the main file after transcoding, which can be a relative or absolute path.
To define the output path, the path must end with `.{format}`. For variable names, please refer to [Filename Variable Explanation](https://www.tencentcloud.com/document/product/862/37039?from_cn_redirect=1).
Relative path example:
<li>Filename_{Variable name}.{format}</li>
<li>Filename.{format}.</li>
Absolute path example:
<li>/Custom path/Filename_{Variable name}.{format}</li>
If left empty, the default relative path is `{inputName}_transcode_{definition}.{format}`.
 
     * @return OutputObjectPath Output path of the main file after transcoding, which can be a relative or absolute path.
To define the output path, the path must end with `.{format}`. For variable names, please refer to [Filename Variable Explanation](https://www.tencentcloud.com/document/product/862/37039?from_cn_redirect=1).
Relative path example:
<li>Filename_{Variable name}.{format}</li>
<li>Filename.{format}.</li>
Absolute path example:
<li>/Custom path/Filename_{Variable name}.{format}</li>
If left empty, the default relative path is `{inputName}_transcode_{definition}.{format}`.

     */
    public String getOutputObjectPath() {
        return this.OutputObjectPath;
    }

    /**
     * Set Output path of the main file after transcoding, which can be a relative or absolute path.
To define the output path, the path must end with `.{format}`. For variable names, please refer to [Filename Variable Explanation](https://www.tencentcloud.com/document/product/862/37039?from_cn_redirect=1).
Relative path example:
<li>Filename_{Variable name}.{format}</li>
<li>Filename.{format}.</li>
Absolute path example:
<li>/Custom path/Filename_{Variable name}.{format}</li>
If left empty, the default relative path is `{inputName}_transcode_{definition}.{format}`.

     * @param OutputObjectPath Output path of the main file after transcoding, which can be a relative or absolute path.
To define the output path, the path must end with `.{format}`. For variable names, please refer to [Filename Variable Explanation](https://www.tencentcloud.com/document/product/862/37039?from_cn_redirect=1).
Relative path example:
<li>Filename_{Variable name}.{format}</li>
<li>Filename.{format}.</li>
Absolute path example:
<li>/Custom path/Filename_{Variable name}.{format}</li>
If left empty, the default relative path is `{inputName}_transcode_{definition}.{format}`.

     */
    public void setOutputObjectPath(String OutputObjectPath) {
        this.OutputObjectPath = OutputObjectPath;
    }

    /**
     * Get Output path for segment files after transcoding (the path of TS files when transcoding to HLS), which can only be a relative path. If left empty, it defaults to `{inputName}_transcode_{definition}_{number}.{format}`. 
     * @return SegmentObjectName Output path for segment files after transcoding (the path of TS files when transcoding to HLS), which can only be a relative path. If left empty, it defaults to `{inputName}_transcode_{definition}_{number}.{format}`.
     */
    public String getSegmentObjectName() {
        return this.SegmentObjectName;
    }

    /**
     * Set Output path for segment files after transcoding (the path of TS files when transcoding to HLS), which can only be a relative path. If left empty, it defaults to `{inputName}_transcode_{definition}_{number}.{format}`.
     * @param SegmentObjectName Output path for segment files after transcoding (the path of TS files when transcoding to HLS), which can only be a relative path. If left empty, it defaults to `{inputName}_transcode_{definition}_{number}.{format}`.
     */
    public void setSegmentObjectName(String SegmentObjectName) {
        this.SegmentObjectName = SegmentObjectName;
    }

    /**
     * Get  
     * @return ObjectNumberFormat 
     */
    public NumberFormat getObjectNumberFormat() {
        return this.ObjectNumberFormat;
    }

    /**
     * Set 
     * @param ObjectNumberFormat 
     */
    public void setObjectNumberFormat(NumberFormat ObjectNumberFormat) {
        this.ObjectNumberFormat = ObjectNumberFormat;
    }

    /**
     * Get  
     * @return HeadTailParameter 
     */
    public HeadTailParameter getHeadTailParameter() {
        return this.HeadTailParameter;
    }

    /**
     * Set 
     * @param HeadTailParameter 
     */
    public void setHeadTailParameter(HeadTailParameter HeadTailParameter) {
        this.HeadTailParameter = HeadTailParameter;
    }

    public TranscodeTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TranscodeTaskInput(TranscodeTaskInput source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.RawParameter != null) {
            this.RawParameter = new RawTranscodeParameter(source.RawParameter);
        }
        if (source.OverrideParameter != null) {
            this.OverrideParameter = new OverrideTranscodeParameter(source.OverrideParameter);
        }
        if (source.WatermarkSet != null) {
            this.WatermarkSet = new WatermarkInput[source.WatermarkSet.length];
            for (int i = 0; i < source.WatermarkSet.length; i++) {
                this.WatermarkSet[i] = new WatermarkInput(source.WatermarkSet[i]);
            }
        }
        if (source.BlindWatermark != null) {
            this.BlindWatermark = new BlindWatermarkInput(source.BlindWatermark);
        }
        if (source.MosaicSet != null) {
            this.MosaicSet = new MosaicInput[source.MosaicSet.length];
            for (int i = 0; i < source.MosaicSet.length; i++) {
                this.MosaicSet[i] = new MosaicInput(source.MosaicSet[i]);
            }
        }
        if (source.StartTimeOffset != null) {
            this.StartTimeOffset = new Float(source.StartTimeOffset);
        }
        if (source.EndTimeOffset != null) {
            this.EndTimeOffset = new Float(source.EndTimeOffset);
        }
        if (source.OutputStorage != null) {
            this.OutputStorage = new TaskOutputStorage(source.OutputStorage);
        }
        if (source.OutputObjectPath != null) {
            this.OutputObjectPath = new String(source.OutputObjectPath);
        }
        if (source.SegmentObjectName != null) {
            this.SegmentObjectName = new String(source.SegmentObjectName);
        }
        if (source.ObjectNumberFormat != null) {
            this.ObjectNumberFormat = new NumberFormat(source.ObjectNumberFormat);
        }
        if (source.HeadTailParameter != null) {
            this.HeadTailParameter = new HeadTailParameter(source.HeadTailParameter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamObj(map, prefix + "RawParameter.", this.RawParameter);
        this.setParamObj(map, prefix + "OverrideParameter.", this.OverrideParameter);
        this.setParamArrayObj(map, prefix + "WatermarkSet.", this.WatermarkSet);
        this.setParamObj(map, prefix + "BlindWatermark.", this.BlindWatermark);
        this.setParamArrayObj(map, prefix + "MosaicSet.", this.MosaicSet);
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamSimple(map, prefix + "EndTimeOffset", this.EndTimeOffset);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);
        this.setParamSimple(map, prefix + "OutputObjectPath", this.OutputObjectPath);
        this.setParamSimple(map, prefix + "SegmentObjectName", this.SegmentObjectName);
        this.setParamObj(map, prefix + "ObjectNumberFormat.", this.ObjectNumberFormat);
        this.setParamObj(map, prefix + "HeadTailParameter.", this.HeadTailParameter);

    }
}


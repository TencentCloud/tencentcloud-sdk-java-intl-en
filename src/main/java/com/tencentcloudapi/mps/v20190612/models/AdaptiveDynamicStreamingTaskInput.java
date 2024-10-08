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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AdaptiveDynamicStreamingTaskInput extends AbstractModel {

    /**
    * Adaptive bitrate streaming template ID.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * List of up to 10 image or text watermarks.
    */
    @SerializedName("WatermarkSet")
    @Expose
    private WatermarkInput [] WatermarkSet;

    /**
    * 
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * The relative or absolute output path of the manifest file after being transcoded to adaptive bitrate streaming. If this parameter is left empty, a relative path in the following format will be used by default: `{inputName}_adaptiveDynamicStreaming_{definition}.{format}`.
    */
    @SerializedName("OutputObjectPath")
    @Expose
    private String OutputObjectPath;

    /**
    * The relative output path of the substream file after being transcoded to adaptive bitrate streaming. If this parameter is left empty, a relative path in the following format will be used by default: `{inputName}_adaptiveDynamicStreaming_{definition}_{subStreamNumber}.{format}`.
    */
    @SerializedName("SubStreamObjectName")
    @Expose
    private String SubStreamObjectName;

    /**
    * The relative output path of the segment file after being transcoded to adaptive bitrate streaming (in HLS format only). If this parameter is left empty, a relative path in the following format will be used by default: `{inputName}_adaptiveDynamicStreaming_{definition}_{subStreamNumber}_{segmentNumber}.{format}`.
    */
    @SerializedName("SegmentObjectName")
    @Expose
    private String SegmentObjectName;

    /**
    * 
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("AddOnSubtitles")
    @Expose
    private AddOnSubtitle [] AddOnSubtitles;

    /**
    * 
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("DrmInfo")
    @Expose
    private DrmInfo DrmInfo;

    /**
    * Adaptive transcoding template type.
Common: audio-video.
PureAudio: audio-only.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DefinitionType")
    @Expose
    private String DefinitionType;

    /**
     * Get Adaptive bitrate streaming template ID. 
     * @return Definition Adaptive bitrate streaming template ID.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Adaptive bitrate streaming template ID.
     * @param Definition Adaptive bitrate streaming template ID.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get List of up to 10 image or text watermarks. 
     * @return WatermarkSet List of up to 10 image or text watermarks.
     */
    public WatermarkInput [] getWatermarkSet() {
        return this.WatermarkSet;
    }

    /**
     * Set List of up to 10 image or text watermarks.
     * @param WatermarkSet List of up to 10 image or text watermarks.
     */
    public void setWatermarkSet(WatermarkInput [] WatermarkSet) {
        this.WatermarkSet = WatermarkSet;
    }

    /**
     * Get 
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return OutputStorage 
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set 
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param OutputStorage 
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Get The relative or absolute output path of the manifest file after being transcoded to adaptive bitrate streaming. If this parameter is left empty, a relative path in the following format will be used by default: `{inputName}_adaptiveDynamicStreaming_{definition}.{format}`. 
     * @return OutputObjectPath The relative or absolute output path of the manifest file after being transcoded to adaptive bitrate streaming. If this parameter is left empty, a relative path in the following format will be used by default: `{inputName}_adaptiveDynamicStreaming_{definition}.{format}`.
     */
    public String getOutputObjectPath() {
        return this.OutputObjectPath;
    }

    /**
     * Set The relative or absolute output path of the manifest file after being transcoded to adaptive bitrate streaming. If this parameter is left empty, a relative path in the following format will be used by default: `{inputName}_adaptiveDynamicStreaming_{definition}.{format}`.
     * @param OutputObjectPath The relative or absolute output path of the manifest file after being transcoded to adaptive bitrate streaming. If this parameter is left empty, a relative path in the following format will be used by default: `{inputName}_adaptiveDynamicStreaming_{definition}.{format}`.
     */
    public void setOutputObjectPath(String OutputObjectPath) {
        this.OutputObjectPath = OutputObjectPath;
    }

    /**
     * Get The relative output path of the substream file after being transcoded to adaptive bitrate streaming. If this parameter is left empty, a relative path in the following format will be used by default: `{inputName}_adaptiveDynamicStreaming_{definition}_{subStreamNumber}.{format}`. 
     * @return SubStreamObjectName The relative output path of the substream file after being transcoded to adaptive bitrate streaming. If this parameter is left empty, a relative path in the following format will be used by default: `{inputName}_adaptiveDynamicStreaming_{definition}_{subStreamNumber}.{format}`.
     */
    public String getSubStreamObjectName() {
        return this.SubStreamObjectName;
    }

    /**
     * Set The relative output path of the substream file after being transcoded to adaptive bitrate streaming. If this parameter is left empty, a relative path in the following format will be used by default: `{inputName}_adaptiveDynamicStreaming_{definition}_{subStreamNumber}.{format}`.
     * @param SubStreamObjectName The relative output path of the substream file after being transcoded to adaptive bitrate streaming. If this parameter is left empty, a relative path in the following format will be used by default: `{inputName}_adaptiveDynamicStreaming_{definition}_{subStreamNumber}.{format}`.
     */
    public void setSubStreamObjectName(String SubStreamObjectName) {
        this.SubStreamObjectName = SubStreamObjectName;
    }

    /**
     * Get The relative output path of the segment file after being transcoded to adaptive bitrate streaming (in HLS format only). If this parameter is left empty, a relative path in the following format will be used by default: `{inputName}_adaptiveDynamicStreaming_{definition}_{subStreamNumber}_{segmentNumber}.{format}`. 
     * @return SegmentObjectName The relative output path of the segment file after being transcoded to adaptive bitrate streaming (in HLS format only). If this parameter is left empty, a relative path in the following format will be used by default: `{inputName}_adaptiveDynamicStreaming_{definition}_{subStreamNumber}_{segmentNumber}.{format}`.
     */
    public String getSegmentObjectName() {
        return this.SegmentObjectName;
    }

    /**
     * Set The relative output path of the segment file after being transcoded to adaptive bitrate streaming (in HLS format only). If this parameter is left empty, a relative path in the following format will be used by default: `{inputName}_adaptiveDynamicStreaming_{definition}_{subStreamNumber}_{segmentNumber}.{format}`.
     * @param SegmentObjectName The relative output path of the segment file after being transcoded to adaptive bitrate streaming (in HLS format only). If this parameter is left empty, a relative path in the following format will be used by default: `{inputName}_adaptiveDynamicStreaming_{definition}_{subStreamNumber}_{segmentNumber}.{format}`.
     */
    public void setSegmentObjectName(String SegmentObjectName) {
        this.SegmentObjectName = SegmentObjectName;
    }

    /**
     * Get 
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return AddOnSubtitles 
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public AddOnSubtitle [] getAddOnSubtitles() {
        return this.AddOnSubtitles;
    }

    /**
     * Set 
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param AddOnSubtitles 
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setAddOnSubtitles(AddOnSubtitle [] AddOnSubtitles) {
        this.AddOnSubtitles = AddOnSubtitles;
    }

    /**
     * Get 
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return DrmInfo 
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public DrmInfo getDrmInfo() {
        return this.DrmInfo;
    }

    /**
     * Set 
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param DrmInfo 
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setDrmInfo(DrmInfo DrmInfo) {
        this.DrmInfo = DrmInfo;
    }

    /**
     * Get Adaptive transcoding template type.
Common: audio-video.
PureAudio: audio-only.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DefinitionType Adaptive transcoding template type.
Common: audio-video.
PureAudio: audio-only.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDefinitionType() {
        return this.DefinitionType;
    }

    /**
     * Set Adaptive transcoding template type.
Common: audio-video.
PureAudio: audio-only.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DefinitionType Adaptive transcoding template type.
Common: audio-video.
PureAudio: audio-only.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDefinitionType(String DefinitionType) {
        this.DefinitionType = DefinitionType;
    }

    public AdaptiveDynamicStreamingTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdaptiveDynamicStreamingTaskInput(AdaptiveDynamicStreamingTaskInput source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.WatermarkSet != null) {
            this.WatermarkSet = new WatermarkInput[source.WatermarkSet.length];
            for (int i = 0; i < source.WatermarkSet.length; i++) {
                this.WatermarkSet[i] = new WatermarkInput(source.WatermarkSet[i]);
            }
        }
        if (source.OutputStorage != null) {
            this.OutputStorage = new TaskOutputStorage(source.OutputStorage);
        }
        if (source.OutputObjectPath != null) {
            this.OutputObjectPath = new String(source.OutputObjectPath);
        }
        if (source.SubStreamObjectName != null) {
            this.SubStreamObjectName = new String(source.SubStreamObjectName);
        }
        if (source.SegmentObjectName != null) {
            this.SegmentObjectName = new String(source.SegmentObjectName);
        }
        if (source.AddOnSubtitles != null) {
            this.AddOnSubtitles = new AddOnSubtitle[source.AddOnSubtitles.length];
            for (int i = 0; i < source.AddOnSubtitles.length; i++) {
                this.AddOnSubtitles[i] = new AddOnSubtitle(source.AddOnSubtitles[i]);
            }
        }
        if (source.DrmInfo != null) {
            this.DrmInfo = new DrmInfo(source.DrmInfo);
        }
        if (source.DefinitionType != null) {
            this.DefinitionType = new String(source.DefinitionType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamArrayObj(map, prefix + "WatermarkSet.", this.WatermarkSet);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);
        this.setParamSimple(map, prefix + "OutputObjectPath", this.OutputObjectPath);
        this.setParamSimple(map, prefix + "SubStreamObjectName", this.SubStreamObjectName);
        this.setParamSimple(map, prefix + "SegmentObjectName", this.SegmentObjectName);
        this.setParamArrayObj(map, prefix + "AddOnSubtitles.", this.AddOnSubtitles);
        this.setParamObj(map, prefix + "DrmInfo.", this.DrmInfo);
        this.setParamSimple(map, prefix + "DefinitionType", this.DefinitionType);

    }
}


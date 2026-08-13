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

public class AdaptiveDynamicStreamingTaskInput extends AbstractModel {

    /**
    * <p>Adaptive bitrate streaming template ID.</p>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <p>Watermark list. Up to 10 image or text watermarks are supported.</p>
    */
    @SerializedName("WatermarkSet")
    @Expose
    private WatermarkInput [] WatermarkSet;

    /**
    * <p>Digital watermark parameter.</p>
    */
    @SerializedName("BlindWatermark")
    @Expose
    private BlindWatermarkInput BlindWatermark;

    /**
    * <p>Target storage for files after adaptive bitrate streaming. If left blank, it inherits the upper-level OutputStorage value.</p>
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * <p>Output path for the manifest file after adaptive bitrate streaming, which can be a relative or absolute path.<br>To define the output path, the path must end with <code>.{format}</code>. For variable names, see <a href="https://www.tencentcloud.com/document/product/862/37039?from_cn_redirect=1">Filename Variables</a>.<br>Relative path example:</p><li>Filename_{variable name}.{format}</li><li>Filename.{format}</li>Absolute path example:<li>/custom path/Filename_{variable name}.{format}</li>If this is not specified, the default relative path is {inputName}_adaptiveDynamicStreaming_{definition}.{format}.
    */
    @SerializedName("OutputObjectPath")
    @Expose
    private String OutputObjectPath;

    /**
    * <p>Output path for substream files after adaptive bitrate streaming, which can only be a relative path. If this is not specified, the default relative path is <code>{inputName}_adaptiveDynamicStreaming_{definition}_{subStreamNumber}.{format}</code>.</p>
    */
    @SerializedName("SubStreamObjectName")
    @Expose
    private String SubStreamObjectName;

    /**
    * <p>Output path for segment files after adaptive bitrate streaming (HLS only), which can only be a relative path. If this is not specified, the default relative path is <code>{inputName}_adaptiveDynamicStreaming_{definition}_{subStreamNumber}_{segmentNumber}.{format}</code>.</p>
    */
    @SerializedName("SegmentObjectName")
    @Expose
    private String SegmentObjectName;

    /**
    * <p>External subtitle feature. Specifies the subtitle file to be inserted.</p>
    */
    @SerializedName("AddOnSubtitles")
    @Expose
    private AddOnSubtitle [] AddOnSubtitles;

    /**
    * <p>Drm information.</p>
    */
    @SerializedName("DrmInfo")
    @Expose
    private DrmInfo DrmInfo;

    /**
    * <p>Adaptive bitrate streaming template type. Valid values:<br>Common: audio and video.<br>PureAudio: audio only.</p>
    */
    @SerializedName("DefinitionType")
    @Expose
    private String DefinitionType;

    /**
    * <p>Hard subtitle (burned-in subtitle) feature. Specifies the subtitle source, font size, location, and other subtitle parameters.</p>
    */
    @SerializedName("SubtitleTemplate")
    @Expose
    private SubtitleTemplate SubtitleTemplate;

    /**
    * <p>Extended transcoding parameter field.</p>
    */
    @SerializedName("StdExtInfo")
    @Expose
    private String StdExtInfo;

    /**
    * <p>Set the frame at the specified pts time as a key frame and segment it. Unit: milliseconds (relative deviation <=1ms is allowed). When both gop and segment duration are specified simultaneously, they function together. Note that RawPts must be enabled, keep the frame rate following the source, and ensure the passed-in pts time corresponds to a frame in the source.</p>
    */
    @SerializedName("KeyPTSList")
    @Expose
    private Long [] KeyPTSList;

    /**
    * <p>External audio feature. Specifies the audio files to be inserted.</p>
    */
    @SerializedName("AddOnAudios")
    @Expose
    private AddOnAudio [] AddOnAudios;

    /**
    * <p>When not empty, directly replace the StreamInfos field of the template. The field format is the same as the StreamInfos when creating an adaptive template.</p>
    */
    @SerializedName("StdExtStreamInfos")
    @Expose
    private AdaptiveStreamTemplate [] StdExtStreamInfos;

    /**
     * Get <p>Adaptive bitrate streaming template ID.</p> 
     * @return Definition <p>Adaptive bitrate streaming template ID.</p>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>Adaptive bitrate streaming template ID.</p>
     * @param Definition <p>Adaptive bitrate streaming template ID.</p>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <p>Watermark list. Up to 10 image or text watermarks are supported.</p> 
     * @return WatermarkSet <p>Watermark list. Up to 10 image or text watermarks are supported.</p>
     */
    public WatermarkInput [] getWatermarkSet() {
        return this.WatermarkSet;
    }

    /**
     * Set <p>Watermark list. Up to 10 image or text watermarks are supported.</p>
     * @param WatermarkSet <p>Watermark list. Up to 10 image or text watermarks are supported.</p>
     */
    public void setWatermarkSet(WatermarkInput [] WatermarkSet) {
        this.WatermarkSet = WatermarkSet;
    }

    /**
     * Get <p>Digital watermark parameter.</p> 
     * @return BlindWatermark <p>Digital watermark parameter.</p>
     */
    public BlindWatermarkInput getBlindWatermark() {
        return this.BlindWatermark;
    }

    /**
     * Set <p>Digital watermark parameter.</p>
     * @param BlindWatermark <p>Digital watermark parameter.</p>
     */
    public void setBlindWatermark(BlindWatermarkInput BlindWatermark) {
        this.BlindWatermark = BlindWatermark;
    }

    /**
     * Get <p>Target storage for files after adaptive bitrate streaming. If left blank, it inherits the upper-level OutputStorage value.</p> 
     * @return OutputStorage <p>Target storage for files after adaptive bitrate streaming. If left blank, it inherits the upper-level OutputStorage value.</p>
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set <p>Target storage for files after adaptive bitrate streaming. If left blank, it inherits the upper-level OutputStorage value.</p>
     * @param OutputStorage <p>Target storage for files after adaptive bitrate streaming. If left blank, it inherits the upper-level OutputStorage value.</p>
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Get <p>Output path for the manifest file after adaptive bitrate streaming, which can be a relative or absolute path.<br>To define the output path, the path must end with <code>.{format}</code>. For variable names, see <a href="https://www.tencentcloud.com/document/product/862/37039?from_cn_redirect=1">Filename Variables</a>.<br>Relative path example:</p><li>Filename_{variable name}.{format}</li><li>Filename.{format}</li>Absolute path example:<li>/custom path/Filename_{variable name}.{format}</li>If this is not specified, the default relative path is {inputName}_adaptiveDynamicStreaming_{definition}.{format}. 
     * @return OutputObjectPath <p>Output path for the manifest file after adaptive bitrate streaming, which can be a relative or absolute path.<br>To define the output path, the path must end with <code>.{format}</code>. For variable names, see <a href="https://www.tencentcloud.com/document/product/862/37039?from_cn_redirect=1">Filename Variables</a>.<br>Relative path example:</p><li>Filename_{variable name}.{format}</li><li>Filename.{format}</li>Absolute path example:<li>/custom path/Filename_{variable name}.{format}</li>If this is not specified, the default relative path is {inputName}_adaptiveDynamicStreaming_{definition}.{format}.
     */
    public String getOutputObjectPath() {
        return this.OutputObjectPath;
    }

    /**
     * Set <p>Output path for the manifest file after adaptive bitrate streaming, which can be a relative or absolute path.<br>To define the output path, the path must end with <code>.{format}</code>. For variable names, see <a href="https://www.tencentcloud.com/document/product/862/37039?from_cn_redirect=1">Filename Variables</a>.<br>Relative path example:</p><li>Filename_{variable name}.{format}</li><li>Filename.{format}</li>Absolute path example:<li>/custom path/Filename_{variable name}.{format}</li>If this is not specified, the default relative path is {inputName}_adaptiveDynamicStreaming_{definition}.{format}.
     * @param OutputObjectPath <p>Output path for the manifest file after adaptive bitrate streaming, which can be a relative or absolute path.<br>To define the output path, the path must end with <code>.{format}</code>. For variable names, see <a href="https://www.tencentcloud.com/document/product/862/37039?from_cn_redirect=1">Filename Variables</a>.<br>Relative path example:</p><li>Filename_{variable name}.{format}</li><li>Filename.{format}</li>Absolute path example:<li>/custom path/Filename_{variable name}.{format}</li>If this is not specified, the default relative path is {inputName}_adaptiveDynamicStreaming_{definition}.{format}.
     */
    public void setOutputObjectPath(String OutputObjectPath) {
        this.OutputObjectPath = OutputObjectPath;
    }

    /**
     * Get <p>Output path for substream files after adaptive bitrate streaming, which can only be a relative path. If this is not specified, the default relative path is <code>{inputName}_adaptiveDynamicStreaming_{definition}_{subStreamNumber}.{format}</code>.</p> 
     * @return SubStreamObjectName <p>Output path for substream files after adaptive bitrate streaming, which can only be a relative path. If this is not specified, the default relative path is <code>{inputName}_adaptiveDynamicStreaming_{definition}_{subStreamNumber}.{format}</code>.</p>
     */
    public String getSubStreamObjectName() {
        return this.SubStreamObjectName;
    }

    /**
     * Set <p>Output path for substream files after adaptive bitrate streaming, which can only be a relative path. If this is not specified, the default relative path is <code>{inputName}_adaptiveDynamicStreaming_{definition}_{subStreamNumber}.{format}</code>.</p>
     * @param SubStreamObjectName <p>Output path for substream files after adaptive bitrate streaming, which can only be a relative path. If this is not specified, the default relative path is <code>{inputName}_adaptiveDynamicStreaming_{definition}_{subStreamNumber}.{format}</code>.</p>
     */
    public void setSubStreamObjectName(String SubStreamObjectName) {
        this.SubStreamObjectName = SubStreamObjectName;
    }

    /**
     * Get <p>Output path for segment files after adaptive bitrate streaming (HLS only), which can only be a relative path. If this is not specified, the default relative path is <code>{inputName}_adaptiveDynamicStreaming_{definition}_{subStreamNumber}_{segmentNumber}.{format}</code>.</p> 
     * @return SegmentObjectName <p>Output path for segment files after adaptive bitrate streaming (HLS only), which can only be a relative path. If this is not specified, the default relative path is <code>{inputName}_adaptiveDynamicStreaming_{definition}_{subStreamNumber}_{segmentNumber}.{format}</code>.</p>
     */
    public String getSegmentObjectName() {
        return this.SegmentObjectName;
    }

    /**
     * Set <p>Output path for segment files after adaptive bitrate streaming (HLS only), which can only be a relative path. If this is not specified, the default relative path is <code>{inputName}_adaptiveDynamicStreaming_{definition}_{subStreamNumber}_{segmentNumber}.{format}</code>.</p>
     * @param SegmentObjectName <p>Output path for segment files after adaptive bitrate streaming (HLS only), which can only be a relative path. If this is not specified, the default relative path is <code>{inputName}_adaptiveDynamicStreaming_{definition}_{subStreamNumber}_{segmentNumber}.{format}</code>.</p>
     */
    public void setSegmentObjectName(String SegmentObjectName) {
        this.SegmentObjectName = SegmentObjectName;
    }

    /**
     * Get <p>External subtitle feature. Specifies the subtitle file to be inserted.</p> 
     * @return AddOnSubtitles <p>External subtitle feature. Specifies the subtitle file to be inserted.</p>
     */
    public AddOnSubtitle [] getAddOnSubtitles() {
        return this.AddOnSubtitles;
    }

    /**
     * Set <p>External subtitle feature. Specifies the subtitle file to be inserted.</p>
     * @param AddOnSubtitles <p>External subtitle feature. Specifies the subtitle file to be inserted.</p>
     */
    public void setAddOnSubtitles(AddOnSubtitle [] AddOnSubtitles) {
        this.AddOnSubtitles = AddOnSubtitles;
    }

    /**
     * Get <p>Drm information.</p> 
     * @return DrmInfo <p>Drm information.</p>
     */
    public DrmInfo getDrmInfo() {
        return this.DrmInfo;
    }

    /**
     * Set <p>Drm information.</p>
     * @param DrmInfo <p>Drm information.</p>
     */
    public void setDrmInfo(DrmInfo DrmInfo) {
        this.DrmInfo = DrmInfo;
    }

    /**
     * Get <p>Adaptive bitrate streaming template type. Valid values:<br>Common: audio and video.<br>PureAudio: audio only.</p> 
     * @return DefinitionType <p>Adaptive bitrate streaming template type. Valid values:<br>Common: audio and video.<br>PureAudio: audio only.</p>
     */
    public String getDefinitionType() {
        return this.DefinitionType;
    }

    /**
     * Set <p>Adaptive bitrate streaming template type. Valid values:<br>Common: audio and video.<br>PureAudio: audio only.</p>
     * @param DefinitionType <p>Adaptive bitrate streaming template type. Valid values:<br>Common: audio and video.<br>PureAudio: audio only.</p>
     */
    public void setDefinitionType(String DefinitionType) {
        this.DefinitionType = DefinitionType;
    }

    /**
     * Get <p>Hard subtitle (burned-in subtitle) feature. Specifies the subtitle source, font size, location, and other subtitle parameters.</p> 
     * @return SubtitleTemplate <p>Hard subtitle (burned-in subtitle) feature. Specifies the subtitle source, font size, location, and other subtitle parameters.</p>
     */
    public SubtitleTemplate getSubtitleTemplate() {
        return this.SubtitleTemplate;
    }

    /**
     * Set <p>Hard subtitle (burned-in subtitle) feature. Specifies the subtitle source, font size, location, and other subtitle parameters.</p>
     * @param SubtitleTemplate <p>Hard subtitle (burned-in subtitle) feature. Specifies the subtitle source, font size, location, and other subtitle parameters.</p>
     */
    public void setSubtitleTemplate(SubtitleTemplate SubtitleTemplate) {
        this.SubtitleTemplate = SubtitleTemplate;
    }

    /**
     * Get <p>Extended transcoding parameter field.</p> 
     * @return StdExtInfo <p>Extended transcoding parameter field.</p>
     */
    public String getStdExtInfo() {
        return this.StdExtInfo;
    }

    /**
     * Set <p>Extended transcoding parameter field.</p>
     * @param StdExtInfo <p>Extended transcoding parameter field.</p>
     */
    public void setStdExtInfo(String StdExtInfo) {
        this.StdExtInfo = StdExtInfo;
    }

    /**
     * Get <p>Set the frame at the specified pts time as a key frame and segment it. Unit: milliseconds (relative deviation <=1ms is allowed). When both gop and segment duration are specified simultaneously, they function together. Note that RawPts must be enabled, keep the frame rate following the source, and ensure the passed-in pts time corresponds to a frame in the source.</p> 
     * @return KeyPTSList <p>Set the frame at the specified pts time as a key frame and segment it. Unit: milliseconds (relative deviation <=1ms is allowed). When both gop and segment duration are specified simultaneously, they function together. Note that RawPts must be enabled, keep the frame rate following the source, and ensure the passed-in pts time corresponds to a frame in the source.</p>
     */
    public Long [] getKeyPTSList() {
        return this.KeyPTSList;
    }

    /**
     * Set <p>Set the frame at the specified pts time as a key frame and segment it. Unit: milliseconds (relative deviation <=1ms is allowed). When both gop and segment duration are specified simultaneously, they function together. Note that RawPts must be enabled, keep the frame rate following the source, and ensure the passed-in pts time corresponds to a frame in the source.</p>
     * @param KeyPTSList <p>Set the frame at the specified pts time as a key frame and segment it. Unit: milliseconds (relative deviation <=1ms is allowed). When both gop and segment duration are specified simultaneously, they function together. Note that RawPts must be enabled, keep the frame rate following the source, and ensure the passed-in pts time corresponds to a frame in the source.</p>
     */
    public void setKeyPTSList(Long [] KeyPTSList) {
        this.KeyPTSList = KeyPTSList;
    }

    /**
     * Get <p>External audio feature. Specifies the audio files to be inserted.</p> 
     * @return AddOnAudios <p>External audio feature. Specifies the audio files to be inserted.</p>
     */
    public AddOnAudio [] getAddOnAudios() {
        return this.AddOnAudios;
    }

    /**
     * Set <p>External audio feature. Specifies the audio files to be inserted.</p>
     * @param AddOnAudios <p>External audio feature. Specifies the audio files to be inserted.</p>
     */
    public void setAddOnAudios(AddOnAudio [] AddOnAudios) {
        this.AddOnAudios = AddOnAudios;
    }

    /**
     * Get <p>When not empty, directly replace the StreamInfos field of the template. The field format is the same as the StreamInfos when creating an adaptive template.</p> 
     * @return StdExtStreamInfos <p>When not empty, directly replace the StreamInfos field of the template. The field format is the same as the StreamInfos when creating an adaptive template.</p>
     */
    public AdaptiveStreamTemplate [] getStdExtStreamInfos() {
        return this.StdExtStreamInfos;
    }

    /**
     * Set <p>When not empty, directly replace the StreamInfos field of the template. The field format is the same as the StreamInfos when creating an adaptive template.</p>
     * @param StdExtStreamInfos <p>When not empty, directly replace the StreamInfos field of the template. The field format is the same as the StreamInfos when creating an adaptive template.</p>
     */
    public void setStdExtStreamInfos(AdaptiveStreamTemplate [] StdExtStreamInfos) {
        this.StdExtStreamInfos = StdExtStreamInfos;
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
        if (source.BlindWatermark != null) {
            this.BlindWatermark = new BlindWatermarkInput(source.BlindWatermark);
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
        if (source.SubtitleTemplate != null) {
            this.SubtitleTemplate = new SubtitleTemplate(source.SubtitleTemplate);
        }
        if (source.StdExtInfo != null) {
            this.StdExtInfo = new String(source.StdExtInfo);
        }
        if (source.KeyPTSList != null) {
            this.KeyPTSList = new Long[source.KeyPTSList.length];
            for (int i = 0; i < source.KeyPTSList.length; i++) {
                this.KeyPTSList[i] = new Long(source.KeyPTSList[i]);
            }
        }
        if (source.AddOnAudios != null) {
            this.AddOnAudios = new AddOnAudio[source.AddOnAudios.length];
            for (int i = 0; i < source.AddOnAudios.length; i++) {
                this.AddOnAudios[i] = new AddOnAudio(source.AddOnAudios[i]);
            }
        }
        if (source.StdExtStreamInfos != null) {
            this.StdExtStreamInfos = new AdaptiveStreamTemplate[source.StdExtStreamInfos.length];
            for (int i = 0; i < source.StdExtStreamInfos.length; i++) {
                this.StdExtStreamInfos[i] = new AdaptiveStreamTemplate(source.StdExtStreamInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamArrayObj(map, prefix + "WatermarkSet.", this.WatermarkSet);
        this.setParamObj(map, prefix + "BlindWatermark.", this.BlindWatermark);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);
        this.setParamSimple(map, prefix + "OutputObjectPath", this.OutputObjectPath);
        this.setParamSimple(map, prefix + "SubStreamObjectName", this.SubStreamObjectName);
        this.setParamSimple(map, prefix + "SegmentObjectName", this.SegmentObjectName);
        this.setParamArrayObj(map, prefix + "AddOnSubtitles.", this.AddOnSubtitles);
        this.setParamObj(map, prefix + "DrmInfo.", this.DrmInfo);
        this.setParamSimple(map, prefix + "DefinitionType", this.DefinitionType);
        this.setParamObj(map, prefix + "SubtitleTemplate.", this.SubtitleTemplate);
        this.setParamSimple(map, prefix + "StdExtInfo", this.StdExtInfo);
        this.setParamArraySimple(map, prefix + "KeyPTSList.", this.KeyPTSList);
        this.setParamArrayObj(map, prefix + "AddOnAudios.", this.AddOnAudios);
        this.setParamArrayObj(map, prefix + "StdExtStreamInfos.", this.StdExtStreamInfos);

    }
}


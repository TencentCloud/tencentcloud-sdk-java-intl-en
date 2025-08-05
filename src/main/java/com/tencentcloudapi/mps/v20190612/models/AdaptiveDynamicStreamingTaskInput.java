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
    * Adaptive dynamic streaming template ID.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Watermark list. Multiple image or text watermarks up to a maximum of 10 are supported.
    */
    @SerializedName("WatermarkSet")
    @Expose
    private WatermarkInput [] WatermarkSet;

    /**
    * Target storage for files after adaptive dynamic streaming. If left blank, it inherits the upper-level OutputStorage value.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * Output path for the manifest file after adaptive dynamic streaming. It can be either a relative path or an absolute path.
If you need to define an output path, the path must end with `.{format}`. Refer to [Filename Variable Description](https://intl.cloud.tencent.com/document/product/862/37039?from_cn_redirect=1) for variable names.
Example of relative path:
<li>filename_{variable name}.{format}</li>
<li>filename.{format}</li>
Example of absolute path:
<li>/custom path/filename_{variable name}.{format}</li>
If not filled in, it is a relative path by default: {inputName}_adaptiveDynamicStreaming_{definition}.{format}.
    */
    @SerializedName("OutputObjectPath")
    @Expose
    private String OutputObjectPath;

    /**
    * After adaptive dynamic streaming, the output path of substream files can only be a relative path. If not filled in, it is a relative path by default: `{inputName}_adaptiveDynamicStreaming_{definition}_{subStreamNumber}.{format}`.
    */
    @SerializedName("SubStreamObjectName")
    @Expose
    private String SubStreamObjectName;

    /**
    * After adaptive dynamic streaming (for HLS only), the output path of segment files can only be a relative path. If not filled in, it is a relative path by default: `{inputName}_adaptiveDynamicStreaming_{definition}_{subStreamNumber}_{segmentNumber}.{format}`.
    */
    @SerializedName("SegmentObjectName")
    @Expose
    private String SegmentObjectName;

    /**
    * Subtitle file to be inserted.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("AddOnSubtitles")
    @Expose
    private AddOnSubtitle [] AddOnSubtitles;

    /**
    * Drm information.
    */
    @SerializedName("DrmInfo")
    @Expose
    private DrmInfo DrmInfo;

    /**
    * Adaptive transcoding template type.
Common: audio/video type.
PureAudio: audio-only.
    */
    @SerializedName("DefinitionType")
    @Expose
    private String DefinitionType;

    /**
    * Specifies the subtitle parameter.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SubtitleTemplate")
    @Expose
    private SubtitleTemplate SubtitleTemplate;

    /**
    * Transcoding parameter extension field.
    */
    @SerializedName("StdExtInfo")
    @Expose
    private String StdExtInfo;

    /**
     * Get Adaptive dynamic streaming template ID. 
     * @return Definition Adaptive dynamic streaming template ID.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Adaptive dynamic streaming template ID.
     * @param Definition Adaptive dynamic streaming template ID.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
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
     * Get Target storage for files after adaptive dynamic streaming. If left blank, it inherits the upper-level OutputStorage value.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return OutputStorage Target storage for files after adaptive dynamic streaming. If left blank, it inherits the upper-level OutputStorage value.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set Target storage for files after adaptive dynamic streaming. If left blank, it inherits the upper-level OutputStorage value.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param OutputStorage Target storage for files after adaptive dynamic streaming. If left blank, it inherits the upper-level OutputStorage value.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Get Output path for the manifest file after adaptive dynamic streaming. It can be either a relative path or an absolute path.
If you need to define an output path, the path must end with `.{format}`. Refer to [Filename Variable Description](https://intl.cloud.tencent.com/document/product/862/37039?from_cn_redirect=1) for variable names.
Example of relative path:
<li>filename_{variable name}.{format}</li>
<li>filename.{format}</li>
Example of absolute path:
<li>/custom path/filename_{variable name}.{format}</li>
If not filled in, it is a relative path by default: {inputName}_adaptiveDynamicStreaming_{definition}.{format}. 
     * @return OutputObjectPath Output path for the manifest file after adaptive dynamic streaming. It can be either a relative path or an absolute path.
If you need to define an output path, the path must end with `.{format}`. Refer to [Filename Variable Description](https://intl.cloud.tencent.com/document/product/862/37039?from_cn_redirect=1) for variable names.
Example of relative path:
<li>filename_{variable name}.{format}</li>
<li>filename.{format}</li>
Example of absolute path:
<li>/custom path/filename_{variable name}.{format}</li>
If not filled in, it is a relative path by default: {inputName}_adaptiveDynamicStreaming_{definition}.{format}.
     */
    public String getOutputObjectPath() {
        return this.OutputObjectPath;
    }

    /**
     * Set Output path for the manifest file after adaptive dynamic streaming. It can be either a relative path or an absolute path.
If you need to define an output path, the path must end with `.{format}`. Refer to [Filename Variable Description](https://intl.cloud.tencent.com/document/product/862/37039?from_cn_redirect=1) for variable names.
Example of relative path:
<li>filename_{variable name}.{format}</li>
<li>filename.{format}</li>
Example of absolute path:
<li>/custom path/filename_{variable name}.{format}</li>
If not filled in, it is a relative path by default: {inputName}_adaptiveDynamicStreaming_{definition}.{format}.
     * @param OutputObjectPath Output path for the manifest file after adaptive dynamic streaming. It can be either a relative path or an absolute path.
If you need to define an output path, the path must end with `.{format}`. Refer to [Filename Variable Description](https://intl.cloud.tencent.com/document/product/862/37039?from_cn_redirect=1) for variable names.
Example of relative path:
<li>filename_{variable name}.{format}</li>
<li>filename.{format}</li>
Example of absolute path:
<li>/custom path/filename_{variable name}.{format}</li>
If not filled in, it is a relative path by default: {inputName}_adaptiveDynamicStreaming_{definition}.{format}.
     */
    public void setOutputObjectPath(String OutputObjectPath) {
        this.OutputObjectPath = OutputObjectPath;
    }

    /**
     * Get After adaptive dynamic streaming, the output path of substream files can only be a relative path. If not filled in, it is a relative path by default: `{inputName}_adaptiveDynamicStreaming_{definition}_{subStreamNumber}.{format}`. 
     * @return SubStreamObjectName After adaptive dynamic streaming, the output path of substream files can only be a relative path. If not filled in, it is a relative path by default: `{inputName}_adaptiveDynamicStreaming_{definition}_{subStreamNumber}.{format}`.
     */
    public String getSubStreamObjectName() {
        return this.SubStreamObjectName;
    }

    /**
     * Set After adaptive dynamic streaming, the output path of substream files can only be a relative path. If not filled in, it is a relative path by default: `{inputName}_adaptiveDynamicStreaming_{definition}_{subStreamNumber}.{format}`.
     * @param SubStreamObjectName After adaptive dynamic streaming, the output path of substream files can only be a relative path. If not filled in, it is a relative path by default: `{inputName}_adaptiveDynamicStreaming_{definition}_{subStreamNumber}.{format}`.
     */
    public void setSubStreamObjectName(String SubStreamObjectName) {
        this.SubStreamObjectName = SubStreamObjectName;
    }

    /**
     * Get After adaptive dynamic streaming (for HLS only), the output path of segment files can only be a relative path. If not filled in, it is a relative path by default: `{inputName}_adaptiveDynamicStreaming_{definition}_{subStreamNumber}_{segmentNumber}.{format}`. 
     * @return SegmentObjectName After adaptive dynamic streaming (for HLS only), the output path of segment files can only be a relative path. If not filled in, it is a relative path by default: `{inputName}_adaptiveDynamicStreaming_{definition}_{subStreamNumber}_{segmentNumber}.{format}`.
     */
    public String getSegmentObjectName() {
        return this.SegmentObjectName;
    }

    /**
     * Set After adaptive dynamic streaming (for HLS only), the output path of segment files can only be a relative path. If not filled in, it is a relative path by default: `{inputName}_adaptiveDynamicStreaming_{definition}_{subStreamNumber}_{segmentNumber}.{format}`.
     * @param SegmentObjectName After adaptive dynamic streaming (for HLS only), the output path of segment files can only be a relative path. If not filled in, it is a relative path by default: `{inputName}_adaptiveDynamicStreaming_{definition}_{subStreamNumber}_{segmentNumber}.{format}`.
     */
    public void setSegmentObjectName(String SegmentObjectName) {
        this.SegmentObjectName = SegmentObjectName;
    }

    /**
     * Get Subtitle file to be inserted.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return AddOnSubtitles Subtitle file to be inserted.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public AddOnSubtitle [] getAddOnSubtitles() {
        return this.AddOnSubtitles;
    }

    /**
     * Set Subtitle file to be inserted.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param AddOnSubtitles Subtitle file to be inserted.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setAddOnSubtitles(AddOnSubtitle [] AddOnSubtitles) {
        this.AddOnSubtitles = AddOnSubtitles;
    }

    /**
     * Get Drm information. 
     * @return DrmInfo Drm information.
     */
    public DrmInfo getDrmInfo() {
        return this.DrmInfo;
    }

    /**
     * Set Drm information.
     * @param DrmInfo Drm information.
     */
    public void setDrmInfo(DrmInfo DrmInfo) {
        this.DrmInfo = DrmInfo;
    }

    /**
     * Get Adaptive transcoding template type.
Common: audio/video type.
PureAudio: audio-only. 
     * @return DefinitionType Adaptive transcoding template type.
Common: audio/video type.
PureAudio: audio-only.
     */
    public String getDefinitionType() {
        return this.DefinitionType;
    }

    /**
     * Set Adaptive transcoding template type.
Common: audio/video type.
PureAudio: audio-only.
     * @param DefinitionType Adaptive transcoding template type.
Common: audio/video type.
PureAudio: audio-only.
     */
    public void setDefinitionType(String DefinitionType) {
        this.DefinitionType = DefinitionType;
    }

    /**
     * Get Specifies the subtitle parameter.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SubtitleTemplate Specifies the subtitle parameter.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public SubtitleTemplate getSubtitleTemplate() {
        return this.SubtitleTemplate;
    }

    /**
     * Set Specifies the subtitle parameter.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SubtitleTemplate Specifies the subtitle parameter.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSubtitleTemplate(SubtitleTemplate SubtitleTemplate) {
        this.SubtitleTemplate = SubtitleTemplate;
    }

    /**
     * Get Transcoding parameter extension field. 
     * @return StdExtInfo Transcoding parameter extension field.
     */
    public String getStdExtInfo() {
        return this.StdExtInfo;
    }

    /**
     * Set Transcoding parameter extension field.
     * @param StdExtInfo Transcoding parameter extension field.
     */
    public void setStdExtInfo(String StdExtInfo) {
        this.StdExtInfo = StdExtInfo;
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
        if (source.SubtitleTemplate != null) {
            this.SubtitleTemplate = new SubtitleTemplate(source.SubtitleTemplate);
        }
        if (source.StdExtInfo != null) {
            this.StdExtInfo = new String(source.StdExtInfo);
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
        this.setParamObj(map, prefix + "SubtitleTemplate.", this.SubtitleTemplate);
        this.setParamSimple(map, prefix + "StdExtInfo", this.StdExtInfo);

    }
}


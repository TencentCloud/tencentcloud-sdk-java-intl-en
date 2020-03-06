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

public class TranscodeTemplate extends AbstractModel{

    /**
    * Unique ID of a transcoding template.
    */
    @SerializedName("Definition")
    @Expose
    private String Definition;

    /**
    * Container format. Valid values: mp4, flv, hls, mp3, flac, ogg.
    */
    @SerializedName("Container")
    @Expose
    private String Container;

    /**
    * Name of a transcoding template.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Template description.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Template type. Valid values:
<li>Preset: Preset template;</li>
<li>Custom: Custom template.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Whether to remove video data. Valid values:
<li>0: Retain;</li>
<li>1: Remove.</li>
    */
    @SerializedName("RemoveVideo")
    @Expose
    private Long RemoveVideo;

    /**
    * Whether to remove audio data. Valid values:
<li>0: Retain;</li>
<li>1: Remove.</li>
    */
    @SerializedName("RemoveAudio")
    @Expose
    private Long RemoveAudio;

    /**
    * Video stream configuration parameter. This field is valid only when `RemoveVideo` is 0.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VideoTemplate")
    @Expose
    private VideoTemplateInfo VideoTemplate;

    /**
    * Audio stream configuration parameter. This field is valid only when `RemoveAudio` is 0.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AudioTemplate")
    @Expose
    private AudioTemplateInfo AudioTemplate;

    /**
    * TESHD transcoding parameter. To enable it, please contact your Tencent Cloud sales rep.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TEHDConfig")
    @Expose
    private TEHDConfig TEHDConfig;

    /**
    * Container format filter. Valid values:
<li>Video: Video container format that can contain both video stream and audio stream;</li>
<li>PureAudio: Audio container format that can contain only audio stream.</li>
    */
    @SerializedName("ContainerType")
    @Expose
    private String ContainerType;

    /**
    * Creation time of a template in [ISO date format](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last modified time of a template in [ISO date format](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get Unique ID of a transcoding template. 
     * @return Definition Unique ID of a transcoding template.
     */
    public String getDefinition() {
        return this.Definition;
    }

    /**
     * Set Unique ID of a transcoding template.
     * @param Definition Unique ID of a transcoding template.
     */
    public void setDefinition(String Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Container format. Valid values: mp4, flv, hls, mp3, flac, ogg. 
     * @return Container Container format. Valid values: mp4, flv, hls, mp3, flac, ogg.
     */
    public String getContainer() {
        return this.Container;
    }

    /**
     * Set Container format. Valid values: mp4, flv, hls, mp3, flac, ogg.
     * @param Container Container format. Valid values: mp4, flv, hls, mp3, flac, ogg.
     */
    public void setContainer(String Container) {
        this.Container = Container;
    }

    /**
     * Get Name of a transcoding template.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name Name of a transcoding template.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of a transcoding template.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name Name of a transcoding template.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Template description.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Comment Template description.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Template description.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Comment Template description.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get Template type. Valid values:
<li>Preset: Preset template;</li>
<li>Custom: Custom template.</li> 
     * @return Type Template type. Valid values:
<li>Preset: Preset template;</li>
<li>Custom: Custom template.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Template type. Valid values:
<li>Preset: Preset template;</li>
<li>Custom: Custom template.</li>
     * @param Type Template type. Valid values:
<li>Preset: Preset template;</li>
<li>Custom: Custom template.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Whether to remove video data. Valid values:
<li>0: Retain;</li>
<li>1: Remove.</li> 
     * @return RemoveVideo Whether to remove video data. Valid values:
<li>0: Retain;</li>
<li>1: Remove.</li>
     */
    public Long getRemoveVideo() {
        return this.RemoveVideo;
    }

    /**
     * Set Whether to remove video data. Valid values:
<li>0: Retain;</li>
<li>1: Remove.</li>
     * @param RemoveVideo Whether to remove video data. Valid values:
<li>0: Retain;</li>
<li>1: Remove.</li>
     */
    public void setRemoveVideo(Long RemoveVideo) {
        this.RemoveVideo = RemoveVideo;
    }

    /**
     * Get Whether to remove audio data. Valid values:
<li>0: Retain;</li>
<li>1: Remove.</li> 
     * @return RemoveAudio Whether to remove audio data. Valid values:
<li>0: Retain;</li>
<li>1: Remove.</li>
     */
    public Long getRemoveAudio() {
        return this.RemoveAudio;
    }

    /**
     * Set Whether to remove audio data. Valid values:
<li>0: Retain;</li>
<li>1: Remove.</li>
     * @param RemoveAudio Whether to remove audio data. Valid values:
<li>0: Retain;</li>
<li>1: Remove.</li>
     */
    public void setRemoveAudio(Long RemoveAudio) {
        this.RemoveAudio = RemoveAudio;
    }

    /**
     * Get Video stream configuration parameter. This field is valid only when `RemoveVideo` is 0.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VideoTemplate Video stream configuration parameter. This field is valid only when `RemoveVideo` is 0.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public VideoTemplateInfo getVideoTemplate() {
        return this.VideoTemplate;
    }

    /**
     * Set Video stream configuration parameter. This field is valid only when `RemoveVideo` is 0.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VideoTemplate Video stream configuration parameter. This field is valid only when `RemoveVideo` is 0.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVideoTemplate(VideoTemplateInfo VideoTemplate) {
        this.VideoTemplate = VideoTemplate;
    }

    /**
     * Get Audio stream configuration parameter. This field is valid only when `RemoveAudio` is 0.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AudioTemplate Audio stream configuration parameter. This field is valid only when `RemoveAudio` is 0.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AudioTemplateInfo getAudioTemplate() {
        return this.AudioTemplate;
    }

    /**
     * Set Audio stream configuration parameter. This field is valid only when `RemoveAudio` is 0.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AudioTemplate Audio stream configuration parameter. This field is valid only when `RemoveAudio` is 0.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAudioTemplate(AudioTemplateInfo AudioTemplate) {
        this.AudioTemplate = AudioTemplate;
    }

    /**
     * Get TESHD transcoding parameter. To enable it, please contact your Tencent Cloud sales rep.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TEHDConfig TESHD transcoding parameter. To enable it, please contact your Tencent Cloud sales rep.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TEHDConfig getTEHDConfig() {
        return this.TEHDConfig;
    }

    /**
     * Set TESHD transcoding parameter. To enable it, please contact your Tencent Cloud sales rep.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TEHDConfig TESHD transcoding parameter. To enable it, please contact your Tencent Cloud sales rep.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTEHDConfig(TEHDConfig TEHDConfig) {
        this.TEHDConfig = TEHDConfig;
    }

    /**
     * Get Container format filter. Valid values:
<li>Video: Video container format that can contain both video stream and audio stream;</li>
<li>PureAudio: Audio container format that can contain only audio stream.</li> 
     * @return ContainerType Container format filter. Valid values:
<li>Video: Video container format that can contain both video stream and audio stream;</li>
<li>PureAudio: Audio container format that can contain only audio stream.</li>
     */
    public String getContainerType() {
        return this.ContainerType;
    }

    /**
     * Set Container format filter. Valid values:
<li>Video: Video container format that can contain both video stream and audio stream;</li>
<li>PureAudio: Audio container format that can contain only audio stream.</li>
     * @param ContainerType Container format filter. Valid values:
<li>Video: Video container format that can contain both video stream and audio stream;</li>
<li>PureAudio: Audio container format that can contain only audio stream.</li>
     */
    public void setContainerType(String ContainerType) {
        this.ContainerType = ContainerType;
    }

    /**
     * Get Creation time of a template in [ISO date format](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F). 
     * @return CreateTime Creation time of a template in [ISO date format](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time of a template in [ISO date format](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     * @param CreateTime Creation time of a template in [ISO date format](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last modified time of a template in [ISO date format](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F). 
     * @return UpdateTime Last modified time of a template in [ISO date format](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last modified time of a template in [ISO date format](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     * @param UpdateTime Last modified time of a template in [ISO date format](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Container", this.Container);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "RemoveVideo", this.RemoveVideo);
        this.setParamSimple(map, prefix + "RemoveAudio", this.RemoveAudio);
        this.setParamObj(map, prefix + "VideoTemplate.", this.VideoTemplate);
        this.setParamObj(map, prefix + "AudioTemplate.", this.AudioTemplate);
        this.setParamObj(map, prefix + "TEHDConfig.", this.TEHDConfig);
        this.setParamSimple(map, prefix + "ContainerType", this.ContainerType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}


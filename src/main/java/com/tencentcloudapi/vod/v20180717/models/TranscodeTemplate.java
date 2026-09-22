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

public class TranscodeTemplate extends AbstractModel {

    /**
    * <p>Unique identifier of the transcoding template.</p>
    */
    @SerializedName("Definition")
    @Expose
    private String Definition;

    /**
    * <p>Container format. Valid values: mp4, flv, hls, mp3, flac, ogg.</p>
    */
    @SerializedName("Container")
    @Expose
    private String Container;

    /**
    * <p>Transcoding template name.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Template description information.</p>
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>Template type. Valid values:</p><li>Preset: preset template.</li><li>Custom: custom template.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Indicates whether to remove video data. Valid values:</p><li>0: Data is reserved.</li><li>1: Data is removed.</li>
    */
    @SerializedName("RemoveVideo")
    @Expose
    private Long RemoveVideo;

    /**
    * <p>Indicates whether to remove audio data. Valid values:</p><li>0: Data is reserved;</li><li>1: Data is removed.</li>
    */
    @SerializedName("RemoveAudio")
    @Expose
    private Long RemoveAudio;

    /**
    * <p>Video stream configuration parameters. This field is valid only when RemoveVideo is 0.</p>
    */
    @SerializedName("VideoTemplate")
    @Expose
    private VideoTemplateInfo VideoTemplate;

    /**
    * <p>Audio stream configuration parameters. This field is valid only when RemoveAudio is 0.</p>
    */
    @SerializedName("AudioTemplate")
    @Expose
    private AudioTemplateInfo AudioTemplate;

    /**
    * <p>Top Speed Codec transcoding parameters.</p>
    */
    @SerializedName("TEHDConfig")
    @Expose
    private TEHDConfig TEHDConfig;

    /**
    * <p>Audio/video enhancement configurations.</p>
    */
    @SerializedName("EnhanceConfig")
    @Expose
    private EnhanceConfig EnhanceConfig;

    /**
    * <p>Container format filter criteria. Available values:</p><li>Video: video format, a container format that can contain both video and audio streams;</li><li>PureAudio: pure audio format, a container format that can only contain audio streams.</li>
    */
    @SerializedName("ContainerType")
    @Expose
    private String ContainerType;

    /**
    * <p>Template creation time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Last template modification time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>Segment type. It is valid only when Container is hls.</p>
    */
    @SerializedName("SegmentType")
    @Expose
    private String SegmentType;

    /**
    * <p>Extended parameter.</p>
    */
    @SerializedName("StdExtInfo")
    @Expose
    private String StdExtInfo;

    /**
     * Get <p>Unique identifier of the transcoding template.</p> 
     * @return Definition <p>Unique identifier of the transcoding template.</p>
     */
    public String getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>Unique identifier of the transcoding template.</p>
     * @param Definition <p>Unique identifier of the transcoding template.</p>
     */
    public void setDefinition(String Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <p>Container format. Valid values: mp4, flv, hls, mp3, flac, ogg.</p> 
     * @return Container <p>Container format. Valid values: mp4, flv, hls, mp3, flac, ogg.</p>
     */
    public String getContainer() {
        return this.Container;
    }

    /**
     * Set <p>Container format. Valid values: mp4, flv, hls, mp3, flac, ogg.</p>
     * @param Container <p>Container format. Valid values: mp4, flv, hls, mp3, flac, ogg.</p>
     */
    public void setContainer(String Container) {
        this.Container = Container;
    }

    /**
     * Get <p>Transcoding template name.</p> 
     * @return Name <p>Transcoding template name.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Transcoding template name.</p>
     * @param Name <p>Transcoding template name.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Template description information.</p> 
     * @return Comment <p>Template description information.</p>
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>Template description information.</p>
     * @param Comment <p>Template description information.</p>
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get <p>Template type. Valid values:</p><li>Preset: preset template.</li><li>Custom: custom template.</li> 
     * @return Type <p>Template type. Valid values:</p><li>Preset: preset template.</li><li>Custom: custom template.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Template type. Valid values:</p><li>Preset: preset template.</li><li>Custom: custom template.</li>
     * @param Type <p>Template type. Valid values:</p><li>Preset: preset template.</li><li>Custom: custom template.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Indicates whether to remove video data. Valid values:</p><li>0: Data is reserved.</li><li>1: Data is removed.</li> 
     * @return RemoveVideo <p>Indicates whether to remove video data. Valid values:</p><li>0: Data is reserved.</li><li>1: Data is removed.</li>
     */
    public Long getRemoveVideo() {
        return this.RemoveVideo;
    }

    /**
     * Set <p>Indicates whether to remove video data. Valid values:</p><li>0: Data is reserved.</li><li>1: Data is removed.</li>
     * @param RemoveVideo <p>Indicates whether to remove video data. Valid values:</p><li>0: Data is reserved.</li><li>1: Data is removed.</li>
     */
    public void setRemoveVideo(Long RemoveVideo) {
        this.RemoveVideo = RemoveVideo;
    }

    /**
     * Get <p>Indicates whether to remove audio data. Valid values:</p><li>0: Data is reserved;</li><li>1: Data is removed.</li> 
     * @return RemoveAudio <p>Indicates whether to remove audio data. Valid values:</p><li>0: Data is reserved;</li><li>1: Data is removed.</li>
     */
    public Long getRemoveAudio() {
        return this.RemoveAudio;
    }

    /**
     * Set <p>Indicates whether to remove audio data. Valid values:</p><li>0: Data is reserved;</li><li>1: Data is removed.</li>
     * @param RemoveAudio <p>Indicates whether to remove audio data. Valid values:</p><li>0: Data is reserved;</li><li>1: Data is removed.</li>
     */
    public void setRemoveAudio(Long RemoveAudio) {
        this.RemoveAudio = RemoveAudio;
    }

    /**
     * Get <p>Video stream configuration parameters. This field is valid only when RemoveVideo is 0.</p> 
     * @return VideoTemplate <p>Video stream configuration parameters. This field is valid only when RemoveVideo is 0.</p>
     */
    public VideoTemplateInfo getVideoTemplate() {
        return this.VideoTemplate;
    }

    /**
     * Set <p>Video stream configuration parameters. This field is valid only when RemoveVideo is 0.</p>
     * @param VideoTemplate <p>Video stream configuration parameters. This field is valid only when RemoveVideo is 0.</p>
     */
    public void setVideoTemplate(VideoTemplateInfo VideoTemplate) {
        this.VideoTemplate = VideoTemplate;
    }

    /**
     * Get <p>Audio stream configuration parameters. This field is valid only when RemoveAudio is 0.</p> 
     * @return AudioTemplate <p>Audio stream configuration parameters. This field is valid only when RemoveAudio is 0.</p>
     */
    public AudioTemplateInfo getAudioTemplate() {
        return this.AudioTemplate;
    }

    /**
     * Set <p>Audio stream configuration parameters. This field is valid only when RemoveAudio is 0.</p>
     * @param AudioTemplate <p>Audio stream configuration parameters. This field is valid only when RemoveAudio is 0.</p>
     */
    public void setAudioTemplate(AudioTemplateInfo AudioTemplate) {
        this.AudioTemplate = AudioTemplate;
    }

    /**
     * Get <p>Top Speed Codec transcoding parameters.</p> 
     * @return TEHDConfig <p>Top Speed Codec transcoding parameters.</p>
     */
    public TEHDConfig getTEHDConfig() {
        return this.TEHDConfig;
    }

    /**
     * Set <p>Top Speed Codec transcoding parameters.</p>
     * @param TEHDConfig <p>Top Speed Codec transcoding parameters.</p>
     */
    public void setTEHDConfig(TEHDConfig TEHDConfig) {
        this.TEHDConfig = TEHDConfig;
    }

    /**
     * Get <p>Audio/video enhancement configurations.</p> 
     * @return EnhanceConfig <p>Audio/video enhancement configurations.</p>
     */
    public EnhanceConfig getEnhanceConfig() {
        return this.EnhanceConfig;
    }

    /**
     * Set <p>Audio/video enhancement configurations.</p>
     * @param EnhanceConfig <p>Audio/video enhancement configurations.</p>
     */
    public void setEnhanceConfig(EnhanceConfig EnhanceConfig) {
        this.EnhanceConfig = EnhanceConfig;
    }

    /**
     * Get <p>Container format filter criteria. Available values:</p><li>Video: video format, a container format that can contain both video and audio streams;</li><li>PureAudio: pure audio format, a container format that can only contain audio streams.</li> 
     * @return ContainerType <p>Container format filter criteria. Available values:</p><li>Video: video format, a container format that can contain both video and audio streams;</li><li>PureAudio: pure audio format, a container format that can only contain audio streams.</li>
     */
    public String getContainerType() {
        return this.ContainerType;
    }

    /**
     * Set <p>Container format filter criteria. Available values:</p><li>Video: video format, a container format that can contain both video and audio streams;</li><li>PureAudio: pure audio format, a container format that can only contain audio streams.</li>
     * @param ContainerType <p>Container format filter criteria. Available values:</p><li>Video: video format, a container format that can contain both video and audio streams;</li><li>PureAudio: pure audio format, a container format that can only contain audio streams.</li>
     */
    public void setContainerType(String ContainerType) {
        this.ContainerType = ContainerType;
    }

    /**
     * Get <p>Template creation time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p> 
     * @return CreateTime <p>Template creation time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Template creation time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
     * @param CreateTime <p>Template creation time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Last template modification time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p> 
     * @return UpdateTime <p>Last template modification time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Last template modification time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
     * @param UpdateTime <p>Last template modification time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>Segment type. It is valid only when Container is hls.</p> 
     * @return SegmentType <p>Segment type. It is valid only when Container is hls.</p>
     */
    public String getSegmentType() {
        return this.SegmentType;
    }

    /**
     * Set <p>Segment type. It is valid only when Container is hls.</p>
     * @param SegmentType <p>Segment type. It is valid only when Container is hls.</p>
     */
    public void setSegmentType(String SegmentType) {
        this.SegmentType = SegmentType;
    }

    /**
     * Get <p>Extended parameter.</p> 
     * @return StdExtInfo <p>Extended parameter.</p>
     */
    public String getStdExtInfo() {
        return this.StdExtInfo;
    }

    /**
     * Set <p>Extended parameter.</p>
     * @param StdExtInfo <p>Extended parameter.</p>
     */
    public void setStdExtInfo(String StdExtInfo) {
        this.StdExtInfo = StdExtInfo;
    }

    public TranscodeTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TranscodeTemplate(TranscodeTemplate source) {
        if (source.Definition != null) {
            this.Definition = new String(source.Definition);
        }
        if (source.Container != null) {
            this.Container = new String(source.Container);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.RemoveVideo != null) {
            this.RemoveVideo = new Long(source.RemoveVideo);
        }
        if (source.RemoveAudio != null) {
            this.RemoveAudio = new Long(source.RemoveAudio);
        }
        if (source.VideoTemplate != null) {
            this.VideoTemplate = new VideoTemplateInfo(source.VideoTemplate);
        }
        if (source.AudioTemplate != null) {
            this.AudioTemplate = new AudioTemplateInfo(source.AudioTemplate);
        }
        if (source.TEHDConfig != null) {
            this.TEHDConfig = new TEHDConfig(source.TEHDConfig);
        }
        if (source.EnhanceConfig != null) {
            this.EnhanceConfig = new EnhanceConfig(source.EnhanceConfig);
        }
        if (source.ContainerType != null) {
            this.ContainerType = new String(source.ContainerType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.SegmentType != null) {
            this.SegmentType = new String(source.SegmentType);
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
        this.setParamSimple(map, prefix + "Container", this.Container);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "RemoveVideo", this.RemoveVideo);
        this.setParamSimple(map, prefix + "RemoveAudio", this.RemoveAudio);
        this.setParamObj(map, prefix + "VideoTemplate.", this.VideoTemplate);
        this.setParamObj(map, prefix + "AudioTemplate.", this.AudioTemplate);
        this.setParamObj(map, prefix + "TEHDConfig.", this.TEHDConfig);
        this.setParamObj(map, prefix + "EnhanceConfig.", this.EnhanceConfig);
        this.setParamSimple(map, prefix + "ContainerType", this.ContainerType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "SegmentType", this.SegmentType);
        this.setParamSimple(map, prefix + "StdExtInfo", this.StdExtInfo);

    }
}


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

public class RebuildMediaTemplate extends AbstractModel {

    /**
    * Audio and video quality rebirth template number.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Template type. Available values:
<li>Preset: system-preset template;</li>
<li>Custom: custom template.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Audio and video quality rebirth template name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Description of the Audio and Video Quality Rebirth Template.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Audio-visual quality revival video control info.
    */
    @SerializedName("RebuildVideoInfo")
    @Expose
    private RebuildVideoInfo RebuildVideoInfo;

    /**
    * Audio-visual quality revival audio control info.
    */
    @SerializedName("RebuildAudioInfo")
    @Expose
    private RebuildAudioInfo RebuildAudioInfo;

    /**
    * Output video control information.
    */
    @SerializedName("TargetVideoInfo")
    @Expose
    private RebuildMediaTargetVideoStream TargetVideoInfo;

    /**
    * Output audio control information.
    */
    @SerializedName("TargetAudioInfo")
    @Expose
    private RebuildMediaTargetAudioStream TargetAudioInfo;

    /**
    * Muxing format. Available values: mp4, hls. mp4 is selected by default.
    */
    @SerializedName("Container")
    @Expose
    private String Container;

    /**
    * Indicates whether to remove video data. Available values:
<li>`0`: reserved</li>
<li>1: Remove</li>
Default value: 0.
    */
    @SerializedName("RemoveVideo")
    @Expose
    private Long RemoveVideo;

    /**
    * Indicates whether to remove audio data. Available values:
<li>`0`: reserved</li>
<li>1: Remove</li>
Default value: 0.
    */
    @SerializedName("RemoveAudio")
    @Expose
    private Long RemoveAudio;

    /**
    * Template creation time in ISO date format (https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Template last modified time, use [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get Audio and video quality rebirth template number. 
     * @return Definition Audio and video quality rebirth template number.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Audio and video quality rebirth template number.
     * @param Definition Audio and video quality rebirth template number.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Template type. Available values:
<li>Preset: system-preset template;</li>
<li>Custom: custom template.</li> 
     * @return Type Template type. Available values:
<li>Preset: system-preset template;</li>
<li>Custom: custom template.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Template type. Available values:
<li>Preset: system-preset template;</li>
<li>Custom: custom template.</li>
     * @param Type Template type. Available values:
<li>Preset: system-preset template;</li>
<li>Custom: custom template.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Audio and video quality rebirth template name. 
     * @return Name Audio and video quality rebirth template name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Audio and video quality rebirth template name.
     * @param Name Audio and video quality rebirth template name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Description of the Audio and Video Quality Rebirth Template. 
     * @return Comment Description of the Audio and Video Quality Rebirth Template.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Description of the Audio and Video Quality Rebirth Template.
     * @param Comment Description of the Audio and Video Quality Rebirth Template.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get Audio-visual quality revival video control info. 
     * @return RebuildVideoInfo Audio-visual quality revival video control info.
     */
    public RebuildVideoInfo getRebuildVideoInfo() {
        return this.RebuildVideoInfo;
    }

    /**
     * Set Audio-visual quality revival video control info.
     * @param RebuildVideoInfo Audio-visual quality revival video control info.
     */
    public void setRebuildVideoInfo(RebuildVideoInfo RebuildVideoInfo) {
        this.RebuildVideoInfo = RebuildVideoInfo;
    }

    /**
     * Get Audio-visual quality revival audio control info. 
     * @return RebuildAudioInfo Audio-visual quality revival audio control info.
     */
    public RebuildAudioInfo getRebuildAudioInfo() {
        return this.RebuildAudioInfo;
    }

    /**
     * Set Audio-visual quality revival audio control info.
     * @param RebuildAudioInfo Audio-visual quality revival audio control info.
     */
    public void setRebuildAudioInfo(RebuildAudioInfo RebuildAudioInfo) {
        this.RebuildAudioInfo = RebuildAudioInfo;
    }

    /**
     * Get Output video control information. 
     * @return TargetVideoInfo Output video control information.
     */
    public RebuildMediaTargetVideoStream getTargetVideoInfo() {
        return this.TargetVideoInfo;
    }

    /**
     * Set Output video control information.
     * @param TargetVideoInfo Output video control information.
     */
    public void setTargetVideoInfo(RebuildMediaTargetVideoStream TargetVideoInfo) {
        this.TargetVideoInfo = TargetVideoInfo;
    }

    /**
     * Get Output audio control information. 
     * @return TargetAudioInfo Output audio control information.
     */
    public RebuildMediaTargetAudioStream getTargetAudioInfo() {
        return this.TargetAudioInfo;
    }

    /**
     * Set Output audio control information.
     * @param TargetAudioInfo Output audio control information.
     */
    public void setTargetAudioInfo(RebuildMediaTargetAudioStream TargetAudioInfo) {
        this.TargetAudioInfo = TargetAudioInfo;
    }

    /**
     * Get Muxing format. Available values: mp4, hls. mp4 is selected by default. 
     * @return Container Muxing format. Available values: mp4, hls. mp4 is selected by default.
     */
    public String getContainer() {
        return this.Container;
    }

    /**
     * Set Muxing format. Available values: mp4, hls. mp4 is selected by default.
     * @param Container Muxing format. Available values: mp4, hls. mp4 is selected by default.
     */
    public void setContainer(String Container) {
        this.Container = Container;
    }

    /**
     * Get Indicates whether to remove video data. Available values:
<li>`0`: reserved</li>
<li>1: Remove</li>
Default value: 0. 
     * @return RemoveVideo Indicates whether to remove video data. Available values:
<li>`0`: reserved</li>
<li>1: Remove</li>
Default value: 0.
     */
    public Long getRemoveVideo() {
        return this.RemoveVideo;
    }

    /**
     * Set Indicates whether to remove video data. Available values:
<li>`0`: reserved</li>
<li>1: Remove</li>
Default value: 0.
     * @param RemoveVideo Indicates whether to remove video data. Available values:
<li>`0`: reserved</li>
<li>1: Remove</li>
Default value: 0.
     */
    public void setRemoveVideo(Long RemoveVideo) {
        this.RemoveVideo = RemoveVideo;
    }

    /**
     * Get Indicates whether to remove audio data. Available values:
<li>`0`: reserved</li>
<li>1: Remove</li>
Default value: 0. 
     * @return RemoveAudio Indicates whether to remove audio data. Available values:
<li>`0`: reserved</li>
<li>1: Remove</li>
Default value: 0.
     */
    public Long getRemoveAudio() {
        return this.RemoveAudio;
    }

    /**
     * Set Indicates whether to remove audio data. Available values:
<li>`0`: reserved</li>
<li>1: Remove</li>
Default value: 0.
     * @param RemoveAudio Indicates whether to remove audio data. Available values:
<li>`0`: reserved</li>
<li>1: Remove</li>
Default value: 0.
     */
    public void setRemoveAudio(Long RemoveAudio) {
        this.RemoveAudio = RemoveAudio;
    }

    /**
     * Get Template creation time in ISO date format (https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return CreateTime Template creation time in ISO date format (https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Template creation time in ISO date format (https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param CreateTime Template creation time in ISO date format (https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Template last modified time, use [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return UpdateTime Template last modified time, use [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Template last modified time, use [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param UpdateTime Template last modified time, use [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public RebuildMediaTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RebuildMediaTemplate(RebuildMediaTemplate source) {
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
        if (source.RebuildVideoInfo != null) {
            this.RebuildVideoInfo = new RebuildVideoInfo(source.RebuildVideoInfo);
        }
        if (source.RebuildAudioInfo != null) {
            this.RebuildAudioInfo = new RebuildAudioInfo(source.RebuildAudioInfo);
        }
        if (source.TargetVideoInfo != null) {
            this.TargetVideoInfo = new RebuildMediaTargetVideoStream(source.TargetVideoInfo);
        }
        if (source.TargetAudioInfo != null) {
            this.TargetAudioInfo = new RebuildMediaTargetAudioStream(source.TargetAudioInfo);
        }
        if (source.Container != null) {
            this.Container = new String(source.Container);
        }
        if (source.RemoveVideo != null) {
            this.RemoveVideo = new Long(source.RemoveVideo);
        }
        if (source.RemoveAudio != null) {
            this.RemoveAudio = new Long(source.RemoveAudio);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
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
        this.setParamObj(map, prefix + "RebuildVideoInfo.", this.RebuildVideoInfo);
        this.setParamObj(map, prefix + "RebuildAudioInfo.", this.RebuildAudioInfo);
        this.setParamObj(map, prefix + "TargetVideoInfo.", this.TargetVideoInfo);
        this.setParamObj(map, prefix + "TargetAudioInfo.", this.TargetAudioInfo);
        this.setParamSimple(map, prefix + "Container", this.Container);
        this.setParamSimple(map, prefix + "RemoveVideo", this.RemoveVideo);
        this.setParamSimple(map, prefix + "RemoveAudio", this.RemoveAudio);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}


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

public class CreateTranscodeTemplateRequest extends AbstractModel {

    /**
    * Container format. Valid values: mp4; flv; hls; mp3; flac; ogg; m4a. Among them, mp3, flac, ogg, and m4a are for audio files.
    */
    @SerializedName("Container")
    @Expose
    private String Container;

    /**
    * Name of a transcoding template. Length limit: 64 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Template description. Length limit: 256 characters.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Whether to remove video data. Valid values:
<li>0: Retain</li>
<li>1: Remove</li>
Default value: 0.
    */
    @SerializedName("RemoveVideo")
    @Expose
    private Long RemoveVideo;

    /**
    * Whether to remove audio data. Valid values:
<li>0: Retain</li>
<li>1: Remove</li>
Default value: 0.
    */
    @SerializedName("RemoveAudio")
    @Expose
    private Long RemoveAudio;

    /**
    * Video stream configuration parameter. This field is required when `RemoveVideo` is 0.
    */
    @SerializedName("VideoTemplate")
    @Expose
    private VideoTemplateInfo VideoTemplate;

    /**
    * Audio stream configuration parameter. This field is required when `RemoveAudio` is 0.
    */
    @SerializedName("AudioTemplate")
    @Expose
    private AudioTemplateInfo AudioTemplate;

    /**
    * TESHD transcoding parameter. To enable it, please contact your Tencent Cloud sales rep.
    */
    @SerializedName("TEHDConfig")
    @Expose
    private TEHDConfig TEHDConfig;

    /**
    * Audio/Video enhancement configuration.
    */
    @SerializedName("EnhanceConfig")
    @Expose
    private EnhanceConfig EnhanceConfig;

    /**
     * Get Container format. Valid values: mp4; flv; hls; mp3; flac; ogg; m4a. Among them, mp3, flac, ogg, and m4a are for audio files. 
     * @return Container Container format. Valid values: mp4; flv; hls; mp3; flac; ogg; m4a. Among them, mp3, flac, ogg, and m4a are for audio files.
     */
    public String getContainer() {
        return this.Container;
    }

    /**
     * Set Container format. Valid values: mp4; flv; hls; mp3; flac; ogg; m4a. Among them, mp3, flac, ogg, and m4a are for audio files.
     * @param Container Container format. Valid values: mp4; flv; hls; mp3; flac; ogg; m4a. Among them, mp3, flac, ogg, and m4a are for audio files.
     */
    public void setContainer(String Container) {
        this.Container = Container;
    }

    /**
     * Get Name of a transcoding template. Length limit: 64 characters. 
     * @return Name Name of a transcoding template. Length limit: 64 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of a transcoding template. Length limit: 64 characters.
     * @param Name Name of a transcoding template. Length limit: 64 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
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
     * Get Whether to remove video data. Valid values:
<li>0: Retain</li>
<li>1: Remove</li>
Default value: 0. 
     * @return RemoveVideo Whether to remove video data. Valid values:
<li>0: Retain</li>
<li>1: Remove</li>
Default value: 0.
     */
    public Long getRemoveVideo() {
        return this.RemoveVideo;
    }

    /**
     * Set Whether to remove video data. Valid values:
<li>0: Retain</li>
<li>1: Remove</li>
Default value: 0.
     * @param RemoveVideo Whether to remove video data. Valid values:
<li>0: Retain</li>
<li>1: Remove</li>
Default value: 0.
     */
    public void setRemoveVideo(Long RemoveVideo) {
        this.RemoveVideo = RemoveVideo;
    }

    /**
     * Get Whether to remove audio data. Valid values:
<li>0: Retain</li>
<li>1: Remove</li>
Default value: 0. 
     * @return RemoveAudio Whether to remove audio data. Valid values:
<li>0: Retain</li>
<li>1: Remove</li>
Default value: 0.
     */
    public Long getRemoveAudio() {
        return this.RemoveAudio;
    }

    /**
     * Set Whether to remove audio data. Valid values:
<li>0: Retain</li>
<li>1: Remove</li>
Default value: 0.
     * @param RemoveAudio Whether to remove audio data. Valid values:
<li>0: Retain</li>
<li>1: Remove</li>
Default value: 0.
     */
    public void setRemoveAudio(Long RemoveAudio) {
        this.RemoveAudio = RemoveAudio;
    }

    /**
     * Get Video stream configuration parameter. This field is required when `RemoveVideo` is 0. 
     * @return VideoTemplate Video stream configuration parameter. This field is required when `RemoveVideo` is 0.
     */
    public VideoTemplateInfo getVideoTemplate() {
        return this.VideoTemplate;
    }

    /**
     * Set Video stream configuration parameter. This field is required when `RemoveVideo` is 0.
     * @param VideoTemplate Video stream configuration parameter. This field is required when `RemoveVideo` is 0.
     */
    public void setVideoTemplate(VideoTemplateInfo VideoTemplate) {
        this.VideoTemplate = VideoTemplate;
    }

    /**
     * Get Audio stream configuration parameter. This field is required when `RemoveAudio` is 0. 
     * @return AudioTemplate Audio stream configuration parameter. This field is required when `RemoveAudio` is 0.
     */
    public AudioTemplateInfo getAudioTemplate() {
        return this.AudioTemplate;
    }

    /**
     * Set Audio stream configuration parameter. This field is required when `RemoveAudio` is 0.
     * @param AudioTemplate Audio stream configuration parameter. This field is required when `RemoveAudio` is 0.
     */
    public void setAudioTemplate(AudioTemplateInfo AudioTemplate) {
        this.AudioTemplate = AudioTemplate;
    }

    /**
     * Get TESHD transcoding parameter. To enable it, please contact your Tencent Cloud sales rep. 
     * @return TEHDConfig TESHD transcoding parameter. To enable it, please contact your Tencent Cloud sales rep.
     */
    public TEHDConfig getTEHDConfig() {
        return this.TEHDConfig;
    }

    /**
     * Set TESHD transcoding parameter. To enable it, please contact your Tencent Cloud sales rep.
     * @param TEHDConfig TESHD transcoding parameter. To enable it, please contact your Tencent Cloud sales rep.
     */
    public void setTEHDConfig(TEHDConfig TEHDConfig) {
        this.TEHDConfig = TEHDConfig;
    }

    /**
     * Get Audio/Video enhancement configuration. 
     * @return EnhanceConfig Audio/Video enhancement configuration.
     */
    public EnhanceConfig getEnhanceConfig() {
        return this.EnhanceConfig;
    }

    /**
     * Set Audio/Video enhancement configuration.
     * @param EnhanceConfig Audio/Video enhancement configuration.
     */
    public void setEnhanceConfig(EnhanceConfig EnhanceConfig) {
        this.EnhanceConfig = EnhanceConfig;
    }

    public CreateTranscodeTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTranscodeTemplateRequest(CreateTranscodeTemplateRequest source) {
        if (source.Container != null) {
            this.Container = new String(source.Container);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Container", this.Container);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "RemoveVideo", this.RemoveVideo);
        this.setParamSimple(map, prefix + "RemoveAudio", this.RemoveAudio);
        this.setParamObj(map, prefix + "VideoTemplate.", this.VideoTemplate);
        this.setParamObj(map, prefix + "AudioTemplate.", this.AudioTemplate);
        this.setParamObj(map, prefix + "TEHDConfig.", this.TEHDConfig);
        this.setParamObj(map, prefix + "EnhanceConfig.", this.EnhanceConfig);

    }
}


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

public class CreateTranscodeTemplateRequest extends AbstractModel {

    /**
    * <p>Container format. Valid values: mp4, flv, hls, ts, webm, mkv, mxf, mov, mp3, flac, ogg, m4a, and wav. Among them, mp3, flac, ogg, m4a, and wav are for audio-only files.</p>
    */
    @SerializedName("Container")
    @Expose
    private String Container;

    /**
    * <p>Transcoding template name. Length limit: 64 characters.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Transcoding template description. Length limit: 256 characters.</p>
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>Indicates whether to remove video data. Valid values:</p><li>0: Data is reserved.</li><li>1: Data is removed.</li>Default value: 0.
    */
    @SerializedName("RemoveVideo")
    @Expose
    private Long RemoveVideo;

    /**
    * <p>Indicates whether to remove audio data. Valid values:</p><li>0: Data is reserved.</li><li>1: Data is removed.</li>Default value: 0.
    */
    @SerializedName("RemoveAudio")
    @Expose
    private Long RemoveAudio;

    /**
    * <p>Video stream configuration parameters. This field is required when RemoveVideo is 0.</p>
    */
    @SerializedName("VideoTemplate")
    @Expose
    private VideoTemplateInfo VideoTemplate;

    /**
    * <p>Audio stream configuration parameters. This field is required when RemoveAudio is 0.</p>
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
    * <p>Extended parameter, which is a serialized JSON string.</p>
    */
    @SerializedName("StdExtInfo")
    @Expose
    private String StdExtInfo;

    /**
     * Get <p>Container format. Valid values: mp4, flv, hls, ts, webm, mkv, mxf, mov, mp3, flac, ogg, m4a, and wav. Among them, mp3, flac, ogg, m4a, and wav are for audio-only files.</p> 
     * @return Container <p>Container format. Valid values: mp4, flv, hls, ts, webm, mkv, mxf, mov, mp3, flac, ogg, m4a, and wav. Among them, mp3, flac, ogg, m4a, and wav are for audio-only files.</p>
     */
    public String getContainer() {
        return this.Container;
    }

    /**
     * Set <p>Container format. Valid values: mp4, flv, hls, ts, webm, mkv, mxf, mov, mp3, flac, ogg, m4a, and wav. Among them, mp3, flac, ogg, m4a, and wav are for audio-only files.</p>
     * @param Container <p>Container format. Valid values: mp4, flv, hls, ts, webm, mkv, mxf, mov, mp3, flac, ogg, m4a, and wav. Among them, mp3, flac, ogg, m4a, and wav are for audio-only files.</p>
     */
    public void setContainer(String Container) {
        this.Container = Container;
    }

    /**
     * Get <p>Transcoding template name. Length limit: 64 characters.</p> 
     * @return Name <p>Transcoding template name. Length limit: 64 characters.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Transcoding template name. Length limit: 64 characters.</p>
     * @param Name <p>Transcoding template name. Length limit: 64 characters.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Transcoding template description. Length limit: 256 characters.</p> 
     * @return Comment <p>Transcoding template description. Length limit: 256 characters.</p>
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>Transcoding template description. Length limit: 256 characters.</p>
     * @param Comment <p>Transcoding template description. Length limit: 256 characters.</p>
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get <p>Indicates whether to remove video data. Valid values:</p><li>0: Data is reserved.</li><li>1: Data is removed.</li>Default value: 0. 
     * @return RemoveVideo <p>Indicates whether to remove video data. Valid values:</p><li>0: Data is reserved.</li><li>1: Data is removed.</li>Default value: 0.
     */
    public Long getRemoveVideo() {
        return this.RemoveVideo;
    }

    /**
     * Set <p>Indicates whether to remove video data. Valid values:</p><li>0: Data is reserved.</li><li>1: Data is removed.</li>Default value: 0.
     * @param RemoveVideo <p>Indicates whether to remove video data. Valid values:</p><li>0: Data is reserved.</li><li>1: Data is removed.</li>Default value: 0.
     */
    public void setRemoveVideo(Long RemoveVideo) {
        this.RemoveVideo = RemoveVideo;
    }

    /**
     * Get <p>Indicates whether to remove audio data. Valid values:</p><li>0: Data is reserved.</li><li>1: Data is removed.</li>Default value: 0. 
     * @return RemoveAudio <p>Indicates whether to remove audio data. Valid values:</p><li>0: Data is reserved.</li><li>1: Data is removed.</li>Default value: 0.
     */
    public Long getRemoveAudio() {
        return this.RemoveAudio;
    }

    /**
     * Set <p>Indicates whether to remove audio data. Valid values:</p><li>0: Data is reserved.</li><li>1: Data is removed.</li>Default value: 0.
     * @param RemoveAudio <p>Indicates whether to remove audio data. Valid values:</p><li>0: Data is reserved.</li><li>1: Data is removed.</li>Default value: 0.
     */
    public void setRemoveAudio(Long RemoveAudio) {
        this.RemoveAudio = RemoveAudio;
    }

    /**
     * Get <p>Video stream configuration parameters. This field is required when RemoveVideo is 0.</p> 
     * @return VideoTemplate <p>Video stream configuration parameters. This field is required when RemoveVideo is 0.</p>
     */
    public VideoTemplateInfo getVideoTemplate() {
        return this.VideoTemplate;
    }

    /**
     * Set <p>Video stream configuration parameters. This field is required when RemoveVideo is 0.</p>
     * @param VideoTemplate <p>Video stream configuration parameters. This field is required when RemoveVideo is 0.</p>
     */
    public void setVideoTemplate(VideoTemplateInfo VideoTemplate) {
        this.VideoTemplate = VideoTemplate;
    }

    /**
     * Get <p>Audio stream configuration parameters. This field is required when RemoveAudio is 0.</p> 
     * @return AudioTemplate <p>Audio stream configuration parameters. This field is required when RemoveAudio is 0.</p>
     */
    public AudioTemplateInfo getAudioTemplate() {
        return this.AudioTemplate;
    }

    /**
     * Set <p>Audio stream configuration parameters. This field is required when RemoveAudio is 0.</p>
     * @param AudioTemplate <p>Audio stream configuration parameters. This field is required when RemoveAudio is 0.</p>
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
     * Get <p>Extended parameter, which is a serialized JSON string.</p> 
     * @return StdExtInfo <p>Extended parameter, which is a serialized JSON string.</p>
     */
    public String getStdExtInfo() {
        return this.StdExtInfo;
    }

    /**
     * Set <p>Extended parameter, which is a serialized JSON string.</p>
     * @param StdExtInfo <p>Extended parameter, which is a serialized JSON string.</p>
     */
    public void setStdExtInfo(String StdExtInfo) {
        this.StdExtInfo = StdExtInfo;
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
        if (source.StdExtInfo != null) {
            this.StdExtInfo = new String(source.StdExtInfo);
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
        this.setParamSimple(map, prefix + "StdExtInfo", this.StdExtInfo);

    }
}


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

public class OverrideTranscodeParameter extends AbstractModel{

    /**
    * Container format. Valid values: mp4, flv, hls, mp3, flac, ogg, and m4a; mp3, flac, ogg, and m4a are formats of audio files.
    */
    @SerializedName("Container")
    @Expose
    private String Container;

    /**
    * Whether to remove video data. Valid values:
<li>0: retain</li>
<li>1: remove</li>
    */
    @SerializedName("RemoveVideo")
    @Expose
    private Long RemoveVideo;

    /**
    * Whether to remove audio data. Valid values:
<li>0: retain</li>
<li>1: remove</li>
    */
    @SerializedName("RemoveAudio")
    @Expose
    private Long RemoveAudio;

    /**
    * Video stream configuration parameter.
    */
    @SerializedName("VideoTemplate")
    @Expose
    private VideoTemplateInfoForUpdate VideoTemplate;

    /**
    * Audio stream configuration parameter.
    */
    @SerializedName("AudioTemplate")
    @Expose
    private AudioTemplateInfoForUpdate AudioTemplate;

    /**
    * TESHD transcoding parameter.
    */
    @SerializedName("TEHDConfig")
    @Expose
    private TEHDConfigForUpdate TEHDConfig;

    /**
    * The subtitle settings.
    */
    @SerializedName("SubtitleTemplate")
    @Expose
    private SubtitleTemplate SubtitleTemplate;

    /**
     * Get Container format. Valid values: mp4, flv, hls, mp3, flac, ogg, and m4a; mp3, flac, ogg, and m4a are formats of audio files. 
     * @return Container Container format. Valid values: mp4, flv, hls, mp3, flac, ogg, and m4a; mp3, flac, ogg, and m4a are formats of audio files.
     */
    public String getContainer() {
        return this.Container;
    }

    /**
     * Set Container format. Valid values: mp4, flv, hls, mp3, flac, ogg, and m4a; mp3, flac, ogg, and m4a are formats of audio files.
     * @param Container Container format. Valid values: mp4, flv, hls, mp3, flac, ogg, and m4a; mp3, flac, ogg, and m4a are formats of audio files.
     */
    public void setContainer(String Container) {
        this.Container = Container;
    }

    /**
     * Get Whether to remove video data. Valid values:
<li>0: retain</li>
<li>1: remove</li> 
     * @return RemoveVideo Whether to remove video data. Valid values:
<li>0: retain</li>
<li>1: remove</li>
     */
    public Long getRemoveVideo() {
        return this.RemoveVideo;
    }

    /**
     * Set Whether to remove video data. Valid values:
<li>0: retain</li>
<li>1: remove</li>
     * @param RemoveVideo Whether to remove video data. Valid values:
<li>0: retain</li>
<li>1: remove</li>
     */
    public void setRemoveVideo(Long RemoveVideo) {
        this.RemoveVideo = RemoveVideo;
    }

    /**
     * Get Whether to remove audio data. Valid values:
<li>0: retain</li>
<li>1: remove</li> 
     * @return RemoveAudio Whether to remove audio data. Valid values:
<li>0: retain</li>
<li>1: remove</li>
     */
    public Long getRemoveAudio() {
        return this.RemoveAudio;
    }

    /**
     * Set Whether to remove audio data. Valid values:
<li>0: retain</li>
<li>1: remove</li>
     * @param RemoveAudio Whether to remove audio data. Valid values:
<li>0: retain</li>
<li>1: remove</li>
     */
    public void setRemoveAudio(Long RemoveAudio) {
        this.RemoveAudio = RemoveAudio;
    }

    /**
     * Get Video stream configuration parameter. 
     * @return VideoTemplate Video stream configuration parameter.
     */
    public VideoTemplateInfoForUpdate getVideoTemplate() {
        return this.VideoTemplate;
    }

    /**
     * Set Video stream configuration parameter.
     * @param VideoTemplate Video stream configuration parameter.
     */
    public void setVideoTemplate(VideoTemplateInfoForUpdate VideoTemplate) {
        this.VideoTemplate = VideoTemplate;
    }

    /**
     * Get Audio stream configuration parameter. 
     * @return AudioTemplate Audio stream configuration parameter.
     */
    public AudioTemplateInfoForUpdate getAudioTemplate() {
        return this.AudioTemplate;
    }

    /**
     * Set Audio stream configuration parameter.
     * @param AudioTemplate Audio stream configuration parameter.
     */
    public void setAudioTemplate(AudioTemplateInfoForUpdate AudioTemplate) {
        this.AudioTemplate = AudioTemplate;
    }

    /**
     * Get TESHD transcoding parameter. 
     * @return TEHDConfig TESHD transcoding parameter.
     */
    public TEHDConfigForUpdate getTEHDConfig() {
        return this.TEHDConfig;
    }

    /**
     * Set TESHD transcoding parameter.
     * @param TEHDConfig TESHD transcoding parameter.
     */
    public void setTEHDConfig(TEHDConfigForUpdate TEHDConfig) {
        this.TEHDConfig = TEHDConfig;
    }

    /**
     * Get The subtitle settings. 
     * @return SubtitleTemplate The subtitle settings.
     */
    public SubtitleTemplate getSubtitleTemplate() {
        return this.SubtitleTemplate;
    }

    /**
     * Set The subtitle settings.
     * @param SubtitleTemplate The subtitle settings.
     */
    public void setSubtitleTemplate(SubtitleTemplate SubtitleTemplate) {
        this.SubtitleTemplate = SubtitleTemplate;
    }

    public OverrideTranscodeParameter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OverrideTranscodeParameter(OverrideTranscodeParameter source) {
        if (source.Container != null) {
            this.Container = new String(source.Container);
        }
        if (source.RemoveVideo != null) {
            this.RemoveVideo = new Long(source.RemoveVideo);
        }
        if (source.RemoveAudio != null) {
            this.RemoveAudio = new Long(source.RemoveAudio);
        }
        if (source.VideoTemplate != null) {
            this.VideoTemplate = new VideoTemplateInfoForUpdate(source.VideoTemplate);
        }
        if (source.AudioTemplate != null) {
            this.AudioTemplate = new AudioTemplateInfoForUpdate(source.AudioTemplate);
        }
        if (source.TEHDConfig != null) {
            this.TEHDConfig = new TEHDConfigForUpdate(source.TEHDConfig);
        }
        if (source.SubtitleTemplate != null) {
            this.SubtitleTemplate = new SubtitleTemplate(source.SubtitleTemplate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Container", this.Container);
        this.setParamSimple(map, prefix + "RemoveVideo", this.RemoveVideo);
        this.setParamSimple(map, prefix + "RemoveAudio", this.RemoveAudio);
        this.setParamObj(map, prefix + "VideoTemplate.", this.VideoTemplate);
        this.setParamObj(map, prefix + "AudioTemplate.", this.AudioTemplate);
        this.setParamObj(map, prefix + "TEHDConfig.", this.TEHDConfig);
        this.setParamObj(map, prefix + "SubtitleTemplate.", this.SubtitleTemplate);

    }
}


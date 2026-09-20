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

public class OverrideTranscodeParameter extends AbstractModel {

    /**
    * <p>Container format. Valid values: mp4, flv, hls, mp3, flac, ogg, m4a, and wav. Among them, mp3, flac, ogg, m4a, and wav are for audio-only files.</p>
    */
    @SerializedName("Container")
    @Expose
    private String Container;

    /**
    * <p>Indicates whether to remove video data. Valid values:<br>&lt;li&gt;0: Data is reserved;&lt;\li&gt;<br>&lt;li&gt;1: Data is removed.&lt;\li&gt;</p>
    */
    @SerializedName("RemoveVideo")
    @Expose
    private Long RemoveVideo;

    /**
    * <p>Indicates whether to remove audio data. Valid values:<br>&lt;li&gt;0: Data is reserved;&lt;\li&gt;<br>&lt;li&gt;1: Data is removed.&lt;\li&gt;</p>
    */
    @SerializedName("RemoveAudio")
    @Expose
    private Long RemoveAudio;

    /**
    * <p>Video stream configuration parameters.</p>
    */
    @SerializedName("VideoTemplate")
    @Expose
    private VideoTemplateInfoForUpdate VideoTemplate;

    /**
    * <p>Audio stream configuration parameters.</p>
    */
    @SerializedName("AudioTemplate")
    @Expose
    private AudioTemplateInfoForUpdate AudioTemplate;

    /**
    * <p>TSC transcoding configuration parameters.</p>
    */
    @SerializedName("TEHDConfig")
    @Expose
    private TEHDConfigForUpdate TEHDConfig;

    /**
    * <p>Standard extended fields for special usage.</p>
    */
    @SerializedName("StdExtInfo")
    @Expose
    private String StdExtInfo;

    /**
     * Get <p>Container format. Valid values: mp4, flv, hls, mp3, flac, ogg, m4a, and wav. Among them, mp3, flac, ogg, m4a, and wav are for audio-only files.</p> 
     * @return Container <p>Container format. Valid values: mp4, flv, hls, mp3, flac, ogg, m4a, and wav. Among them, mp3, flac, ogg, m4a, and wav are for audio-only files.</p>
     */
    public String getContainer() {
        return this.Container;
    }

    /**
     * Set <p>Container format. Valid values: mp4, flv, hls, mp3, flac, ogg, m4a, and wav. Among them, mp3, flac, ogg, m4a, and wav are for audio-only files.</p>
     * @param Container <p>Container format. Valid values: mp4, flv, hls, mp3, flac, ogg, m4a, and wav. Among them, mp3, flac, ogg, m4a, and wav are for audio-only files.</p>
     */
    public void setContainer(String Container) {
        this.Container = Container;
    }

    /**
     * Get <p>Indicates whether to remove video data. Valid values:<br>&lt;li&gt;0: Data is reserved;&lt;\li&gt;<br>&lt;li&gt;1: Data is removed.&lt;\li&gt;</p> 
     * @return RemoveVideo <p>Indicates whether to remove video data. Valid values:<br>&lt;li&gt;0: Data is reserved;&lt;\li&gt;<br>&lt;li&gt;1: Data is removed.&lt;\li&gt;</p>
     */
    public Long getRemoveVideo() {
        return this.RemoveVideo;
    }

    /**
     * Set <p>Indicates whether to remove video data. Valid values:<br>&lt;li&gt;0: Data is reserved;&lt;\li&gt;<br>&lt;li&gt;1: Data is removed.&lt;\li&gt;</p>
     * @param RemoveVideo <p>Indicates whether to remove video data. Valid values:<br>&lt;li&gt;0: Data is reserved;&lt;\li&gt;<br>&lt;li&gt;1: Data is removed.&lt;\li&gt;</p>
     */
    public void setRemoveVideo(Long RemoveVideo) {
        this.RemoveVideo = RemoveVideo;
    }

    /**
     * Get <p>Indicates whether to remove audio data. Valid values:<br>&lt;li&gt;0: Data is reserved;&lt;\li&gt;<br>&lt;li&gt;1: Data is removed.&lt;\li&gt;</p> 
     * @return RemoveAudio <p>Indicates whether to remove audio data. Valid values:<br>&lt;li&gt;0: Data is reserved;&lt;\li&gt;<br>&lt;li&gt;1: Data is removed.&lt;\li&gt;</p>
     */
    public Long getRemoveAudio() {
        return this.RemoveAudio;
    }

    /**
     * Set <p>Indicates whether to remove audio data. Valid values:<br>&lt;li&gt;0: Data is reserved;&lt;\li&gt;<br>&lt;li&gt;1: Data is removed.&lt;\li&gt;</p>
     * @param RemoveAudio <p>Indicates whether to remove audio data. Valid values:<br>&lt;li&gt;0: Data is reserved;&lt;\li&gt;<br>&lt;li&gt;1: Data is removed.&lt;\li&gt;</p>
     */
    public void setRemoveAudio(Long RemoveAudio) {
        this.RemoveAudio = RemoveAudio;
    }

    /**
     * Get <p>Video stream configuration parameters.</p> 
     * @return VideoTemplate <p>Video stream configuration parameters.</p>
     */
    public VideoTemplateInfoForUpdate getVideoTemplate() {
        return this.VideoTemplate;
    }

    /**
     * Set <p>Video stream configuration parameters.</p>
     * @param VideoTemplate <p>Video stream configuration parameters.</p>
     */
    public void setVideoTemplate(VideoTemplateInfoForUpdate VideoTemplate) {
        this.VideoTemplate = VideoTemplate;
    }

    /**
     * Get <p>Audio stream configuration parameters.</p> 
     * @return AudioTemplate <p>Audio stream configuration parameters.</p>
     */
    public AudioTemplateInfoForUpdate getAudioTemplate() {
        return this.AudioTemplate;
    }

    /**
     * Set <p>Audio stream configuration parameters.</p>
     * @param AudioTemplate <p>Audio stream configuration parameters.</p>
     */
    public void setAudioTemplate(AudioTemplateInfoForUpdate AudioTemplate) {
        this.AudioTemplate = AudioTemplate;
    }

    /**
     * Get <p>TSC transcoding configuration parameters.</p> 
     * @return TEHDConfig <p>TSC transcoding configuration parameters.</p>
     */
    public TEHDConfigForUpdate getTEHDConfig() {
        return this.TEHDConfig;
    }

    /**
     * Set <p>TSC transcoding configuration parameters.</p>
     * @param TEHDConfig <p>TSC transcoding configuration parameters.</p>
     */
    public void setTEHDConfig(TEHDConfigForUpdate TEHDConfig) {
        this.TEHDConfig = TEHDConfig;
    }

    /**
     * Get <p>Standard extended fields for special usage.</p> 
     * @return StdExtInfo <p>Standard extended fields for special usage.</p>
     */
    public String getStdExtInfo() {
        return this.StdExtInfo;
    }

    /**
     * Set <p>Standard extended fields for special usage.</p>
     * @param StdExtInfo <p>Standard extended fields for special usage.</p>
     */
    public void setStdExtInfo(String StdExtInfo) {
        this.StdExtInfo = StdExtInfo;
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
        if (source.StdExtInfo != null) {
            this.StdExtInfo = new String(source.StdExtInfo);
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
        this.setParamSimple(map, prefix + "StdExtInfo", this.StdExtInfo);

    }
}


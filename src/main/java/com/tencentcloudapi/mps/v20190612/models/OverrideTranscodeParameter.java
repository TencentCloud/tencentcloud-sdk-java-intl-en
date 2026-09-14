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

public class OverrideTranscodeParameter extends AbstractModel {

    /**
    * Muxing format. Available values: mp4, flv, hls, mp3, flac, ogg, and m4a. Among them, mp3, flac, ogg, and m4a are for audio-only files.
    */
    @SerializedName("Container")
    @Expose
    private String Container;

    /**
    * Indicates whether to remove video data. Parameter value:
<li>`0`: retention;</li>
<li>1: Remove.</li>
    */
    @SerializedName("RemoveVideo")
    @Expose
    private Long RemoveVideo;

    /**
    * Indicates whether to remove audio data. Parameter value:
<li>`0`: retention;</li>
<li>1: Remove.</li>
    */
    @SerializedName("RemoveAudio")
    @Expose
    private Long RemoveAudio;

    /**
    * Video stream configuration parameters.
    */
    @SerializedName("VideoTemplate")
    @Expose
    private VideoTemplateInfoForUpdate VideoTemplate;

    /**
    * Audio stream configuration parameters.
    */
    @SerializedName("AudioTemplate")
    @Expose
    private AudioTemplateInfoForUpdate AudioTemplate;

    /**
    * 
    */
    @SerializedName("TEHDConfig")
    @Expose
    private TEHDConfigForUpdate TEHDConfig;

    /**
    * Subtitle stream configuration parameters.
    */
    @SerializedName("SubtitleTemplate")
    @Expose
    private SubtitleTemplate SubtitleTemplate;

    /**
    * External audio track parameter.
    */
    @SerializedName("AddonAudioStream")
    @Expose
    private MediaInputInfo [] AddonAudioStream;

    /**
    * Transcoding extension field.
    */
    @SerializedName("StdExtInfo")
    @Expose
    private String StdExtInfo;

    /**
    * Subtitle file to be inserted.
    */
    @SerializedName("AddOnSubtitles")
    @Expose
    private AddOnSubtitle [] AddOnSubtitles;

    /**
     * Get Muxing format. Available values: mp4, flv, hls, mp3, flac, ogg, and m4a. Among them, mp3, flac, ogg, and m4a are for audio-only files. 
     * @return Container Muxing format. Available values: mp4, flv, hls, mp3, flac, ogg, and m4a. Among them, mp3, flac, ogg, and m4a are for audio-only files.
     */
    public String getContainer() {
        return this.Container;
    }

    /**
     * Set Muxing format. Available values: mp4, flv, hls, mp3, flac, ogg, and m4a. Among them, mp3, flac, ogg, and m4a are for audio-only files.
     * @param Container Muxing format. Available values: mp4, flv, hls, mp3, flac, ogg, and m4a. Among them, mp3, flac, ogg, and m4a are for audio-only files.
     */
    public void setContainer(String Container) {
        this.Container = Container;
    }

    /**
     * Get Indicates whether to remove video data. Parameter value:
<li>`0`: retention;</li>
<li>1: Remove.</li> 
     * @return RemoveVideo Indicates whether to remove video data. Parameter value:
<li>`0`: retention;</li>
<li>1: Remove.</li>
     */
    public Long getRemoveVideo() {
        return this.RemoveVideo;
    }

    /**
     * Set Indicates whether to remove video data. Parameter value:
<li>`0`: retention;</li>
<li>1: Remove.</li>
     * @param RemoveVideo Indicates whether to remove video data. Parameter value:
<li>`0`: retention;</li>
<li>1: Remove.</li>
     */
    public void setRemoveVideo(Long RemoveVideo) {
        this.RemoveVideo = RemoveVideo;
    }

    /**
     * Get Indicates whether to remove audio data. Parameter value:
<li>`0`: retention;</li>
<li>1: Remove.</li> 
     * @return RemoveAudio Indicates whether to remove audio data. Parameter value:
<li>`0`: retention;</li>
<li>1: Remove.</li>
     */
    public Long getRemoveAudio() {
        return this.RemoveAudio;
    }

    /**
     * Set Indicates whether to remove audio data. Parameter value:
<li>`0`: retention;</li>
<li>1: Remove.</li>
     * @param RemoveAudio Indicates whether to remove audio data. Parameter value:
<li>`0`: retention;</li>
<li>1: Remove.</li>
     */
    public void setRemoveAudio(Long RemoveAudio) {
        this.RemoveAudio = RemoveAudio;
    }

    /**
     * Get Video stream configuration parameters. 
     * @return VideoTemplate Video stream configuration parameters.
     */
    public VideoTemplateInfoForUpdate getVideoTemplate() {
        return this.VideoTemplate;
    }

    /**
     * Set Video stream configuration parameters.
     * @param VideoTemplate Video stream configuration parameters.
     */
    public void setVideoTemplate(VideoTemplateInfoForUpdate VideoTemplate) {
        this.VideoTemplate = VideoTemplate;
    }

    /**
     * Get Audio stream configuration parameters. 
     * @return AudioTemplate Audio stream configuration parameters.
     */
    public AudioTemplateInfoForUpdate getAudioTemplate() {
        return this.AudioTemplate;
    }

    /**
     * Set Audio stream configuration parameters.
     * @param AudioTemplate Audio stream configuration parameters.
     */
    public void setAudioTemplate(AudioTemplateInfoForUpdate AudioTemplate) {
        this.AudioTemplate = AudioTemplate;
    }

    /**
     * Get  
     * @return TEHDConfig 
     */
    public TEHDConfigForUpdate getTEHDConfig() {
        return this.TEHDConfig;
    }

    /**
     * Set 
     * @param TEHDConfig 
     */
    public void setTEHDConfig(TEHDConfigForUpdate TEHDConfig) {
        this.TEHDConfig = TEHDConfig;
    }

    /**
     * Get Subtitle stream configuration parameters. 
     * @return SubtitleTemplate Subtitle stream configuration parameters.
     */
    public SubtitleTemplate getSubtitleTemplate() {
        return this.SubtitleTemplate;
    }

    /**
     * Set Subtitle stream configuration parameters.
     * @param SubtitleTemplate Subtitle stream configuration parameters.
     */
    public void setSubtitleTemplate(SubtitleTemplate SubtitleTemplate) {
        this.SubtitleTemplate = SubtitleTemplate;
    }

    /**
     * Get External audio track parameter. 
     * @return AddonAudioStream External audio track parameter.
     */
    public MediaInputInfo [] getAddonAudioStream() {
        return this.AddonAudioStream;
    }

    /**
     * Set External audio track parameter.
     * @param AddonAudioStream External audio track parameter.
     */
    public void setAddonAudioStream(MediaInputInfo [] AddonAudioStream) {
        this.AddonAudioStream = AddonAudioStream;
    }

    /**
     * Get Transcoding extension field. 
     * @return StdExtInfo Transcoding extension field.
     */
    public String getStdExtInfo() {
        return this.StdExtInfo;
    }

    /**
     * Set Transcoding extension field.
     * @param StdExtInfo Transcoding extension field.
     */
    public void setStdExtInfo(String StdExtInfo) {
        this.StdExtInfo = StdExtInfo;
    }

    /**
     * Get Subtitle file to be inserted. 
     * @return AddOnSubtitles Subtitle file to be inserted.
     */
    public AddOnSubtitle [] getAddOnSubtitles() {
        return this.AddOnSubtitles;
    }

    /**
     * Set Subtitle file to be inserted.
     * @param AddOnSubtitles Subtitle file to be inserted.
     */
    public void setAddOnSubtitles(AddOnSubtitle [] AddOnSubtitles) {
        this.AddOnSubtitles = AddOnSubtitles;
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
        if (source.AddonAudioStream != null) {
            this.AddonAudioStream = new MediaInputInfo[source.AddonAudioStream.length];
            for (int i = 0; i < source.AddonAudioStream.length; i++) {
                this.AddonAudioStream[i] = new MediaInputInfo(source.AddonAudioStream[i]);
            }
        }
        if (source.StdExtInfo != null) {
            this.StdExtInfo = new String(source.StdExtInfo);
        }
        if (source.AddOnSubtitles != null) {
            this.AddOnSubtitles = new AddOnSubtitle[source.AddOnSubtitles.length];
            for (int i = 0; i < source.AddOnSubtitles.length; i++) {
                this.AddOnSubtitles[i] = new AddOnSubtitle(source.AddOnSubtitles[i]);
            }
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
        this.setParamArrayObj(map, prefix + "AddonAudioStream.", this.AddonAudioStream);
        this.setParamSimple(map, prefix + "StdExtInfo", this.StdExtInfo);
        this.setParamArrayObj(map, prefix + "AddOnSubtitles.", this.AddOnSubtitles);

    }
}


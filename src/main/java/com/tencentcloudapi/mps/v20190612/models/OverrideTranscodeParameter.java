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
    * The TSC transcoding parameters.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TEHDConfig")
    @Expose
    private TEHDConfigForUpdate TEHDConfig;

    /**
    * The subtitle settings.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubtitleTemplate")
    @Expose
    private SubtitleTemplate SubtitleTemplate;

    /**
    * The information of the external audio track to add.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AddonAudioStream")
    @Expose
    private MediaInputInfo [] AddonAudioStream;

    /**
    * An extended field for transcoding.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
    */
    @SerializedName("StdExtInfo")
    @Expose
    private String StdExtInfo;

    /**
    * The subtitle file to add.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
    */
    @SerializedName("AddOnSubtitles")
    @Expose
    private AddOnSubtitle [] AddOnSubtitles;

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
     * Get The TSC transcoding parameters.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TEHDConfig The TSC transcoding parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TEHDConfigForUpdate getTEHDConfig() {
        return this.TEHDConfig;
    }

    /**
     * Set The TSC transcoding parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TEHDConfig The TSC transcoding parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTEHDConfig(TEHDConfigForUpdate TEHDConfig) {
        this.TEHDConfig = TEHDConfig;
    }

    /**
     * Get The subtitle settings.
Note: u200dThis field may return null, indicating that no valid values can be obtained. 
     * @return SubtitleTemplate The subtitle settings.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public SubtitleTemplate getSubtitleTemplate() {
        return this.SubtitleTemplate;
    }

    /**
     * Set The subtitle settings.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     * @param SubtitleTemplate The subtitle settings.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public void setSubtitleTemplate(SubtitleTemplate SubtitleTemplate) {
        this.SubtitleTemplate = SubtitleTemplate;
    }

    /**
     * Get The information of the external audio track to add.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AddonAudioStream The information of the external audio track to add.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MediaInputInfo [] getAddonAudioStream() {
        return this.AddonAudioStream;
    }

    /**
     * Set The information of the external audio track to add.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AddonAudioStream The information of the external audio track to add.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAddonAudioStream(MediaInputInfo [] AddonAudioStream) {
        this.AddonAudioStream = AddonAudioStream;
    }

    /**
     * Get An extended field for transcoding.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained. 
     * @return StdExtInfo An extended field for transcoding.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public String getStdExtInfo() {
        return this.StdExtInfo;
    }

    /**
     * Set An extended field for transcoding.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     * @param StdExtInfo An extended field for transcoding.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public void setStdExtInfo(String StdExtInfo) {
        this.StdExtInfo = StdExtInfo;
    }

    /**
     * Get The subtitle file to add.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained. 
     * @return AddOnSubtitles The subtitle file to add.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public AddOnSubtitle [] getAddOnSubtitles() {
        return this.AddOnSubtitles;
    }

    /**
     * Set The subtitle file to add.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     * @param AddOnSubtitles The subtitle file to add.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
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


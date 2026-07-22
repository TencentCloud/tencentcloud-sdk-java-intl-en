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
    * Container format. Valid values: mp4, flv, hls, mp3, flac, ogg, m4a, and wav. Among them, mp3, flac, ogg, m4a, and wav are for audio-only files.
    */
    @SerializedName("Container")
    @Expose
    private String Container;

    /**
    * Indicates whether to remove video data. Valid values:
<li>`0`: reserved;</li>
<li>1: Remove.</li>
    */
    @SerializedName("RemoveVideo")
    @Expose
    private Long RemoveVideo;

    /**
    * Indicates whether to remove audio data. Valid values:
<li>`0`: reserved;</li>
<li>1: Remove.</li>
    */
    @SerializedName("RemoveAudio")
    @Expose
    private Long RemoveAudio;

    /**
    * Video stream configuration parameters.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VideoTemplate")
    @Expose
    private VideoTemplateInfoForUpdate VideoTemplate;

    /**
    * Audio stream configuration parameters.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AudioTemplate")
    @Expose
    private AudioTemplateInfoForUpdate AudioTemplate;

    /**
    * Top Speed Codec transcoding configuration parameters.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TEHDConfig")
    @Expose
    private TEHDConfigForUpdate TEHDConfig;

    /**
     * Get Container format. Valid values: mp4, flv, hls, mp3, flac, ogg, m4a, and wav. Among them, mp3, flac, ogg, m4a, and wav are for audio-only files. 
     * @return Container Container format. Valid values: mp4, flv, hls, mp3, flac, ogg, m4a, and wav. Among them, mp3, flac, ogg, m4a, and wav are for audio-only files.
     */
    public String getContainer() {
        return this.Container;
    }

    /**
     * Set Container format. Valid values: mp4, flv, hls, mp3, flac, ogg, m4a, and wav. Among them, mp3, flac, ogg, m4a, and wav are for audio-only files.
     * @param Container Container format. Valid values: mp4, flv, hls, mp3, flac, ogg, m4a, and wav. Among them, mp3, flac, ogg, m4a, and wav are for audio-only files.
     */
    public void setContainer(String Container) {
        this.Container = Container;
    }

    /**
     * Get Indicates whether to remove video data. Valid values:
<li>`0`: reserved;</li>
<li>1: Remove.</li> 
     * @return RemoveVideo Indicates whether to remove video data. Valid values:
<li>`0`: reserved;</li>
<li>1: Remove.</li>
     */
    public Long getRemoveVideo() {
        return this.RemoveVideo;
    }

    /**
     * Set Indicates whether to remove video data. Valid values:
<li>`0`: reserved;</li>
<li>1: Remove.</li>
     * @param RemoveVideo Indicates whether to remove video data. Valid values:
<li>`0`: reserved;</li>
<li>1: Remove.</li>
     */
    public void setRemoveVideo(Long RemoveVideo) {
        this.RemoveVideo = RemoveVideo;
    }

    /**
     * Get Indicates whether to remove audio data. Valid values:
<li>`0`: reserved;</li>
<li>1: Remove.</li> 
     * @return RemoveAudio Indicates whether to remove audio data. Valid values:
<li>`0`: reserved;</li>
<li>1: Remove.</li>
     */
    public Long getRemoveAudio() {
        return this.RemoveAudio;
    }

    /**
     * Set Indicates whether to remove audio data. Valid values:
<li>`0`: reserved;</li>
<li>1: Remove.</li>
     * @param RemoveAudio Indicates whether to remove audio data. Valid values:
<li>`0`: reserved;</li>
<li>1: Remove.</li>
     */
    public void setRemoveAudio(Long RemoveAudio) {
        this.RemoveAudio = RemoveAudio;
    }

    /**
     * Get Video stream configuration parameters.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VideoTemplate Video stream configuration parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public VideoTemplateInfoForUpdate getVideoTemplate() {
        return this.VideoTemplate;
    }

    /**
     * Set Video stream configuration parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VideoTemplate Video stream configuration parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVideoTemplate(VideoTemplateInfoForUpdate VideoTemplate) {
        this.VideoTemplate = VideoTemplate;
    }

    /**
     * Get Audio stream configuration parameters.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AudioTemplate Audio stream configuration parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AudioTemplateInfoForUpdate getAudioTemplate() {
        return this.AudioTemplate;
    }

    /**
     * Set Audio stream configuration parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AudioTemplate Audio stream configuration parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAudioTemplate(AudioTemplateInfoForUpdate AudioTemplate) {
        this.AudioTemplate = AudioTemplate;
    }

    /**
     * Get Top Speed Codec transcoding configuration parameters.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TEHDConfig Top Speed Codec transcoding configuration parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TEHDConfigForUpdate getTEHDConfig() {
        return this.TEHDConfig;
    }

    /**
     * Set Top Speed Codec transcoding configuration parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TEHDConfig Top Speed Codec transcoding configuration parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTEHDConfig(TEHDConfigForUpdate TEHDConfig) {
        this.TEHDConfig = TEHDConfig;
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

    }
}


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

public class RawTranscodeParameter extends AbstractModel {

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
Default value: 0.
    */
    @SerializedName("RemoveVideo")
    @Expose
    private Long RemoveVideo;

    /**
    * Whether to remove audio data. Parameter Value:
<li>`0`: retention;</li>
<li>1: Remove.</li>
Default value: 0.
    */
    @SerializedName("RemoveAudio")
    @Expose
    private Long RemoveAudio;

    /**
    * Video stream configuration parameters. This field is required when RemoveVideo is 0.
    */
    @SerializedName("VideoTemplate")
    @Expose
    private VideoTemplateInfo VideoTemplate;

    /**
    * Audio stream configuration parameters. This field is required when RemoveAudio is 0.
    */
    @SerializedName("AudioTemplate")
    @Expose
    private AudioTemplateInfo AudioTemplate;

    /**
    * TSC transcoding parameters.
    */
    @SerializedName("TEHDConfig")
    @Expose
    private TEHDConfig TEHDConfig;

    /**
    * Additional parameter, which is a serialized JSON string.
    */
    @SerializedName("StdExtInfo")
    @Expose
    private String StdExtInfo;

    /**
    * 
    */
    @SerializedName("EnhanceConfig")
    @Expose
    private EnhanceConfig EnhanceConfig;

    /**
    * 
    */
    @SerializedName("SubtitleTemplate")
    @Expose
    private SubtitleTemplate SubtitleTemplate;

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
Default value: 0. 
     * @return RemoveVideo Indicates whether to remove video data. Parameter value:
<li>`0`: retention;</li>
<li>1: Remove.</li>
Default value: 0.
     */
    public Long getRemoveVideo() {
        return this.RemoveVideo;
    }

    /**
     * Set Indicates whether to remove video data. Parameter value:
<li>`0`: retention;</li>
<li>1: Remove.</li>
Default value: 0.
     * @param RemoveVideo Indicates whether to remove video data. Parameter value:
<li>`0`: retention;</li>
<li>1: Remove.</li>
Default value: 0.
     */
    public void setRemoveVideo(Long RemoveVideo) {
        this.RemoveVideo = RemoveVideo;
    }

    /**
     * Get Whether to remove audio data. Parameter Value:
<li>`0`: retention;</li>
<li>1: Remove.</li>
Default value: 0. 
     * @return RemoveAudio Whether to remove audio data. Parameter Value:
<li>`0`: retention;</li>
<li>1: Remove.</li>
Default value: 0.
     */
    public Long getRemoveAudio() {
        return this.RemoveAudio;
    }

    /**
     * Set Whether to remove audio data. Parameter Value:
<li>`0`: retention;</li>
<li>1: Remove.</li>
Default value: 0.
     * @param RemoveAudio Whether to remove audio data. Parameter Value:
<li>`0`: retention;</li>
<li>1: Remove.</li>
Default value: 0.
     */
    public void setRemoveAudio(Long RemoveAudio) {
        this.RemoveAudio = RemoveAudio;
    }

    /**
     * Get Video stream configuration parameters. This field is required when RemoveVideo is 0. 
     * @return VideoTemplate Video stream configuration parameters. This field is required when RemoveVideo is 0.
     */
    public VideoTemplateInfo getVideoTemplate() {
        return this.VideoTemplate;
    }

    /**
     * Set Video stream configuration parameters. This field is required when RemoveVideo is 0.
     * @param VideoTemplate Video stream configuration parameters. This field is required when RemoveVideo is 0.
     */
    public void setVideoTemplate(VideoTemplateInfo VideoTemplate) {
        this.VideoTemplate = VideoTemplate;
    }

    /**
     * Get Audio stream configuration parameters. This field is required when RemoveAudio is 0. 
     * @return AudioTemplate Audio stream configuration parameters. This field is required when RemoveAudio is 0.
     */
    public AudioTemplateInfo getAudioTemplate() {
        return this.AudioTemplate;
    }

    /**
     * Set Audio stream configuration parameters. This field is required when RemoveAudio is 0.
     * @param AudioTemplate Audio stream configuration parameters. This field is required when RemoveAudio is 0.
     */
    public void setAudioTemplate(AudioTemplateInfo AudioTemplate) {
        this.AudioTemplate = AudioTemplate;
    }

    /**
     * Get TSC transcoding parameters. 
     * @return TEHDConfig TSC transcoding parameters.
     */
    public TEHDConfig getTEHDConfig() {
        return this.TEHDConfig;
    }

    /**
     * Set TSC transcoding parameters.
     * @param TEHDConfig TSC transcoding parameters.
     */
    public void setTEHDConfig(TEHDConfig TEHDConfig) {
        this.TEHDConfig = TEHDConfig;
    }

    /**
     * Get Additional parameter, which is a serialized JSON string. 
     * @return StdExtInfo Additional parameter, which is a serialized JSON string.
     */
    public String getStdExtInfo() {
        return this.StdExtInfo;
    }

    /**
     * Set Additional parameter, which is a serialized JSON string.
     * @param StdExtInfo Additional parameter, which is a serialized JSON string.
     */
    public void setStdExtInfo(String StdExtInfo) {
        this.StdExtInfo = StdExtInfo;
    }

    /**
     * Get  
     * @return EnhanceConfig 
     */
    public EnhanceConfig getEnhanceConfig() {
        return this.EnhanceConfig;
    }

    /**
     * Set 
     * @param EnhanceConfig 
     */
    public void setEnhanceConfig(EnhanceConfig EnhanceConfig) {
        this.EnhanceConfig = EnhanceConfig;
    }

    /**
     * Get  
     * @return SubtitleTemplate 
     */
    public SubtitleTemplate getSubtitleTemplate() {
        return this.SubtitleTemplate;
    }

    /**
     * Set 
     * @param SubtitleTemplate 
     */
    public void setSubtitleTemplate(SubtitleTemplate SubtitleTemplate) {
        this.SubtitleTemplate = SubtitleTemplate;
    }

    public RawTranscodeParameter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RawTranscodeParameter(RawTranscodeParameter source) {
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
            this.VideoTemplate = new VideoTemplateInfo(source.VideoTemplate);
        }
        if (source.AudioTemplate != null) {
            this.AudioTemplate = new AudioTemplateInfo(source.AudioTemplate);
        }
        if (source.TEHDConfig != null) {
            this.TEHDConfig = new TEHDConfig(source.TEHDConfig);
        }
        if (source.StdExtInfo != null) {
            this.StdExtInfo = new String(source.StdExtInfo);
        }
        if (source.EnhanceConfig != null) {
            this.EnhanceConfig = new EnhanceConfig(source.EnhanceConfig);
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
        this.setParamSimple(map, prefix + "StdExtInfo", this.StdExtInfo);
        this.setParamObj(map, prefix + "EnhanceConfig.", this.EnhanceConfig);
        this.setParamObj(map, prefix + "SubtitleTemplate.", this.SubtitleTemplate);

    }
}


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

public class AdaptiveStreamTemplate extends AbstractModel {

    /**
    * Video parameter information.
    */
    @SerializedName("Video")
    @Expose
    private VideoTemplateInfo Video;

    /**
    * Audio parameter information.
    */
    @SerializedName("Audio")
    @Expose
    private AudioTemplateInfo Audio;

    /**
    * Whether to remove audio stream. Valid values:
<li>0: no,</li>
<li>1: yes.</li>
    */
    @SerializedName("RemoveAudio")
    @Expose
    private Long RemoveAudio;

    /**
    * Whether to remove a video stream. Valid values:
<li>0: no</li>
<li>1: yes</li>
    */
    @SerializedName("RemoveVideo")
    @Expose
    private Long RemoveVideo;

    /**
    * TESHD transcoding parameters
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("TEHDConfig")
    @Expose
    private TEHDConfig TEHDConfig;

    /**
    * Audio/Video enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EnhanceConfig")
    @Expose
    private EnhanceConfig EnhanceConfig;

    /**
     * Get Video parameter information. 
     * @return Video Video parameter information.
     */
    public VideoTemplateInfo getVideo() {
        return this.Video;
    }

    /**
     * Set Video parameter information.
     * @param Video Video parameter information.
     */
    public void setVideo(VideoTemplateInfo Video) {
        this.Video = Video;
    }

    /**
     * Get Audio parameter information. 
     * @return Audio Audio parameter information.
     */
    public AudioTemplateInfo getAudio() {
        return this.Audio;
    }

    /**
     * Set Audio parameter information.
     * @param Audio Audio parameter information.
     */
    public void setAudio(AudioTemplateInfo Audio) {
        this.Audio = Audio;
    }

    /**
     * Get Whether to remove audio stream. Valid values:
<li>0: no,</li>
<li>1: yes.</li> 
     * @return RemoveAudio Whether to remove audio stream. Valid values:
<li>0: no,</li>
<li>1: yes.</li>
     */
    public Long getRemoveAudio() {
        return this.RemoveAudio;
    }

    /**
     * Set Whether to remove audio stream. Valid values:
<li>0: no,</li>
<li>1: yes.</li>
     * @param RemoveAudio Whether to remove audio stream. Valid values:
<li>0: no,</li>
<li>1: yes.</li>
     */
    public void setRemoveAudio(Long RemoveAudio) {
        this.RemoveAudio = RemoveAudio;
    }

    /**
     * Get Whether to remove a video stream. Valid values:
<li>0: no</li>
<li>1: yes</li> 
     * @return RemoveVideo Whether to remove a video stream. Valid values:
<li>0: no</li>
<li>1: yes</li>
     */
    public Long getRemoveVideo() {
        return this.RemoveVideo;
    }

    /**
     * Set Whether to remove a video stream. Valid values:
<li>0: no</li>
<li>1: yes</li>
     * @param RemoveVideo Whether to remove a video stream. Valid values:
<li>0: no</li>
<li>1: yes</li>
     */
    public void setRemoveVideo(Long RemoveVideo) {
        this.RemoveVideo = RemoveVideo;
    }

    /**
     * Get TESHD transcoding parameters
Note: This field may return `null`, indicating that no valid value was found. 
     * @return TEHDConfig TESHD transcoding parameters
Note: This field may return `null`, indicating that no valid value was found.
     */
    public TEHDConfig getTEHDConfig() {
        return this.TEHDConfig;
    }

    /**
     * Set TESHD transcoding parameters
Note: This field may return `null`, indicating that no valid value was found.
     * @param TEHDConfig TESHD transcoding parameters
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setTEHDConfig(TEHDConfig TEHDConfig) {
        this.TEHDConfig = TEHDConfig;
    }

    /**
     * Get Audio/Video enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EnhanceConfig Audio/Video enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public EnhanceConfig getEnhanceConfig() {
        return this.EnhanceConfig;
    }

    /**
     * Set Audio/Video enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EnhanceConfig Audio/Video enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEnhanceConfig(EnhanceConfig EnhanceConfig) {
        this.EnhanceConfig = EnhanceConfig;
    }

    public AdaptiveStreamTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdaptiveStreamTemplate(AdaptiveStreamTemplate source) {
        if (source.Video != null) {
            this.Video = new VideoTemplateInfo(source.Video);
        }
        if (source.Audio != null) {
            this.Audio = new AudioTemplateInfo(source.Audio);
        }
        if (source.RemoveAudio != null) {
            this.RemoveAudio = new Long(source.RemoveAudio);
        }
        if (source.RemoveVideo != null) {
            this.RemoveVideo = new Long(source.RemoveVideo);
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
        this.setParamObj(map, prefix + "Video.", this.Video);
        this.setParamObj(map, prefix + "Audio.", this.Audio);
        this.setParamSimple(map, prefix + "RemoveAudio", this.RemoveAudio);
        this.setParamSimple(map, prefix + "RemoveVideo", this.RemoveVideo);
        this.setParamObj(map, prefix + "TEHDConfig.", this.TEHDConfig);
        this.setParamObj(map, prefix + "EnhanceConfig.", this.EnhanceConfig);

    }
}


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

public class AdaptiveStreamTemplate extends AbstractModel {

    /**
    * Audio parameter information.
    */
    @SerializedName("Audio")
    @Expose
    private AudioTemplateInfo Audio;

    /**
    * Video parameter information.
    */
    @SerializedName("Video")
    @Expose
    private VideoTemplateInfo Video;

    /**
    * Whether to remove audio stream. Valid values:
<li>0: no,</li>
<li>1: yes.</li>
    */
    @SerializedName("RemoveAudio")
    @Expose
    private Long RemoveAudio;

    /**
    * Whether to remove video stream. Valid values:
<li>0: no,</li>
<li>1: yes.</li>
    */
    @SerializedName("RemoveVideo")
    @Expose
    private Long RemoveVideo;

    /**
    * List of audio parameter information.
The parameter array has a maximum length of 64.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("AudioList")
    @Expose
    private AudioTemplateInfo [] AudioList;

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
     * Get Whether to remove video stream. Valid values:
<li>0: no,</li>
<li>1: yes.</li> 
     * @return RemoveVideo Whether to remove video stream. Valid values:
<li>0: no,</li>
<li>1: yes.</li>
     */
    public Long getRemoveVideo() {
        return this.RemoveVideo;
    }

    /**
     * Set Whether to remove video stream. Valid values:
<li>0: no,</li>
<li>1: yes.</li>
     * @param RemoveVideo Whether to remove video stream. Valid values:
<li>0: no,</li>
<li>1: yes.</li>
     */
    public void setRemoveVideo(Long RemoveVideo) {
        this.RemoveVideo = RemoveVideo;
    }

    /**
     * Get List of audio parameter information.
The parameter array has a maximum length of 64.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return AudioList List of audio parameter information.
The parameter array has a maximum length of 64.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public AudioTemplateInfo [] getAudioList() {
        return this.AudioList;
    }

    /**
     * Set List of audio parameter information.
The parameter array has a maximum length of 64.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param AudioList List of audio parameter information.
The parameter array has a maximum length of 64.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setAudioList(AudioTemplateInfo [] AudioList) {
        this.AudioList = AudioList;
    }

    public AdaptiveStreamTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdaptiveStreamTemplate(AdaptiveStreamTemplate source) {
        if (source.Audio != null) {
            this.Audio = new AudioTemplateInfo(source.Audio);
        }
        if (source.Video != null) {
            this.Video = new VideoTemplateInfo(source.Video);
        }
        if (source.RemoveAudio != null) {
            this.RemoveAudio = new Long(source.RemoveAudio);
        }
        if (source.RemoveVideo != null) {
            this.RemoveVideo = new Long(source.RemoveVideo);
        }
        if (source.AudioList != null) {
            this.AudioList = new AudioTemplateInfo[source.AudioList.length];
            for (int i = 0; i < source.AudioList.length; i++) {
                this.AudioList[i] = new AudioTemplateInfo(source.AudioList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Audio.", this.Audio);
        this.setParamObj(map, prefix + "Video.", this.Video);
        this.setParamSimple(map, prefix + "RemoveAudio", this.RemoveAudio);
        this.setParamSimple(map, prefix + "RemoveVideo", this.RemoveVideo);
        this.setParamArrayObj(map, prefix + "AudioList.", this.AudioList);

    }
}


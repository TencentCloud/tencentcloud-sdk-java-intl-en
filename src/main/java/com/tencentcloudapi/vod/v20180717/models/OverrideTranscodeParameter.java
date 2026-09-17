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
    * 
    */
    @SerializedName("Container")
    @Expose
    private String Container;

    /**
    * 
    */
    @SerializedName("RemoveVideo")
    @Expose
    private Long RemoveVideo;

    /**
    * 
    */
    @SerializedName("RemoveAudio")
    @Expose
    private Long RemoveAudio;

    /**
    * 
    */
    @SerializedName("VideoTemplate")
    @Expose
    private VideoTemplateInfoForUpdate VideoTemplate;

    /**
    * 
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
    * 
    */
    @SerializedName("StdExtInfo")
    @Expose
    private String StdExtInfo;

    /**
     * Get  
     * @return Container 
     */
    public String getContainer() {
        return this.Container;
    }

    /**
     * Set 
     * @param Container 
     */
    public void setContainer(String Container) {
        this.Container = Container;
    }

    /**
     * Get  
     * @return RemoveVideo 
     */
    public Long getRemoveVideo() {
        return this.RemoveVideo;
    }

    /**
     * Set 
     * @param RemoveVideo 
     */
    public void setRemoveVideo(Long RemoveVideo) {
        this.RemoveVideo = RemoveVideo;
    }

    /**
     * Get  
     * @return RemoveAudio 
     */
    public Long getRemoveAudio() {
        return this.RemoveAudio;
    }

    /**
     * Set 
     * @param RemoveAudio 
     */
    public void setRemoveAudio(Long RemoveAudio) {
        this.RemoveAudio = RemoveAudio;
    }

    /**
     * Get  
     * @return VideoTemplate 
     */
    public VideoTemplateInfoForUpdate getVideoTemplate() {
        return this.VideoTemplate;
    }

    /**
     * Set 
     * @param VideoTemplate 
     */
    public void setVideoTemplate(VideoTemplateInfoForUpdate VideoTemplate) {
        this.VideoTemplate = VideoTemplate;
    }

    /**
     * Get  
     * @return AudioTemplate 
     */
    public AudioTemplateInfoForUpdate getAudioTemplate() {
        return this.AudioTemplate;
    }

    /**
     * Set 
     * @param AudioTemplate 
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
     * Get  
     * @return StdExtInfo 
     */
    public String getStdExtInfo() {
        return this.StdExtInfo;
    }

    /**
     * Set 
     * @param StdExtInfo 
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


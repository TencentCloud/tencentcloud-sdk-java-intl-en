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
    * 
    */
    @SerializedName("Video")
    @Expose
    private VideoTemplateInfo Video;

    /**
    * 
    */
    @SerializedName("Audio")
    @Expose
    private AudioTemplateInfo Audio;

    /**
    * 
    */
    @SerializedName("RemoveAudio")
    @Expose
    private Long RemoveAudio;

    /**
    * 
    */
    @SerializedName("RemoveVideo")
    @Expose
    private Long RemoveVideo;

    /**
    * 
    */
    @SerializedName("TEHDConfig")
    @Expose
    private TEHDConfig TEHDConfig;

    /**
    * 
    */
    @SerializedName("EnhanceConfig")
    @Expose
    private EnhanceConfig EnhanceConfig;

    /**
    * 
    */
    @SerializedName("StdExtInfo")
    @Expose
    private String StdExtInfo;

    /**
     * Get  
     * @return Video 
     */
    public VideoTemplateInfo getVideo() {
        return this.Video;
    }

    /**
     * Set 
     * @param Video 
     */
    public void setVideo(VideoTemplateInfo Video) {
        this.Video = Video;
    }

    /**
     * Get  
     * @return Audio 
     */
    public AudioTemplateInfo getAudio() {
        return this.Audio;
    }

    /**
     * Set 
     * @param Audio 
     */
    public void setAudio(AudioTemplateInfo Audio) {
        this.Audio = Audio;
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
     * @return TEHDConfig 
     */
    public TEHDConfig getTEHDConfig() {
        return this.TEHDConfig;
    }

    /**
     * Set 
     * @param TEHDConfig 
     */
    public void setTEHDConfig(TEHDConfig TEHDConfig) {
        this.TEHDConfig = TEHDConfig;
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
        if (source.StdExtInfo != null) {
            this.StdExtInfo = new String(source.StdExtInfo);
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
        this.setParamSimple(map, prefix + "StdExtInfo", this.StdExtInfo);

    }
}


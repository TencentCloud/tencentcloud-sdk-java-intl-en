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

public class RebuildMediaTargetInfo extends AbstractModel {

    /**
    * 
    */
    @SerializedName("MediaName")
    @Expose
    private String MediaName;

    /**
    * 
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 
    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * 
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 
    */
    @SerializedName("Container")
    @Expose
    private String Container;

    /**
    * 
    */
    @SerializedName("VideoStream")
    @Expose
    private RebuildMediaTargetVideoStream VideoStream;

    /**
    * 
    */
    @SerializedName("AudioStream")
    @Expose
    private RebuildMediaTargetAudioStream AudioStream;

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
     * Get  
     * @return MediaName 
     */
    public String getMediaName() {
        return this.MediaName;
    }

    /**
     * Set 
     * @param MediaName 
     */
    public void setMediaName(String MediaName) {
        this.MediaName = MediaName;
    }

    /**
     * Get  
     * @return Description 
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 
     * @param Description 
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get  
     * @return ClassId 
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set 
     * @param ClassId 
     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
    }

    /**
     * Get  
     * @return ExpireTime 
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 
     * @param ExpireTime 
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

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
     * @return VideoStream 
     */
    public RebuildMediaTargetVideoStream getVideoStream() {
        return this.VideoStream;
    }

    /**
     * Set 
     * @param VideoStream 
     */
    public void setVideoStream(RebuildMediaTargetVideoStream VideoStream) {
        this.VideoStream = VideoStream;
    }

    /**
     * Get  
     * @return AudioStream 
     */
    public RebuildMediaTargetAudioStream getAudioStream() {
        return this.AudioStream;
    }

    /**
     * Set 
     * @param AudioStream 
     */
    public void setAudioStream(RebuildMediaTargetAudioStream AudioStream) {
        this.AudioStream = AudioStream;
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

    public RebuildMediaTargetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RebuildMediaTargetInfo(RebuildMediaTargetInfo source) {
        if (source.MediaName != null) {
            this.MediaName = new String(source.MediaName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ClassId != null) {
            this.ClassId = new Long(source.ClassId);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.Container != null) {
            this.Container = new String(source.Container);
        }
        if (source.VideoStream != null) {
            this.VideoStream = new RebuildMediaTargetVideoStream(source.VideoStream);
        }
        if (source.AudioStream != null) {
            this.AudioStream = new RebuildMediaTargetAudioStream(source.AudioStream);
        }
        if (source.RemoveVideo != null) {
            this.RemoveVideo = new Long(source.RemoveVideo);
        }
        if (source.RemoveAudio != null) {
            this.RemoveAudio = new Long(source.RemoveAudio);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MediaName", this.MediaName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ClassId", this.ClassId);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "Container", this.Container);
        this.setParamObj(map, prefix + "VideoStream.", this.VideoStream);
        this.setParamObj(map, prefix + "AudioStream.", this.AudioStream);
        this.setParamSimple(map, prefix + "RemoveVideo", this.RemoveVideo);
        this.setParamSimple(map, prefix + "RemoveAudio", this.RemoveAudio);

    }
}


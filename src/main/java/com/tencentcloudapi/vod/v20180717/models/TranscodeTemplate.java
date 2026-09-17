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

public class TranscodeTemplate extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Definition")
    @Expose
    private String Definition;

    /**
    * 
    */
    @SerializedName("Container")
    @Expose
    private String Container;

    /**
    * 
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 
    */
    @SerializedName("Type")
    @Expose
    private String Type;

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
    private VideoTemplateInfo VideoTemplate;

    /**
    * 
    */
    @SerializedName("AudioTemplate")
    @Expose
    private AudioTemplateInfo AudioTemplate;

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
    @SerializedName("ContainerType")
    @Expose
    private String ContainerType;

    /**
    * 
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 
    */
    @SerializedName("SegmentType")
    @Expose
    private String SegmentType;

    /**
    * 
    */
    @SerializedName("StdExtInfo")
    @Expose
    private String StdExtInfo;

    /**
     * Get  
     * @return Definition 
     */
    public String getDefinition() {
        return this.Definition;
    }

    /**
     * Set 
     * @param Definition 
     */
    public void setDefinition(String Definition) {
        this.Definition = Definition;
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
     * @return Name 
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 
     * @param Name 
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get  
     * @return Comment 
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 
     * @param Comment 
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get  
     * @return Type 
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 
     * @param Type 
     */
    public void setType(String Type) {
        this.Type = Type;
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
    public VideoTemplateInfo getVideoTemplate() {
        return this.VideoTemplate;
    }

    /**
     * Set 
     * @param VideoTemplate 
     */
    public void setVideoTemplate(VideoTemplateInfo VideoTemplate) {
        this.VideoTemplate = VideoTemplate;
    }

    /**
     * Get  
     * @return AudioTemplate 
     */
    public AudioTemplateInfo getAudioTemplate() {
        return this.AudioTemplate;
    }

    /**
     * Set 
     * @param AudioTemplate 
     */
    public void setAudioTemplate(AudioTemplateInfo AudioTemplate) {
        this.AudioTemplate = AudioTemplate;
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
     * @return ContainerType 
     */
    public String getContainerType() {
        return this.ContainerType;
    }

    /**
     * Set 
     * @param ContainerType 
     */
    public void setContainerType(String ContainerType) {
        this.ContainerType = ContainerType;
    }

    /**
     * Get  
     * @return CreateTime 
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 
     * @param CreateTime 
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get  
     * @return UpdateTime 
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 
     * @param UpdateTime 
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get  
     * @return SegmentType 
     */
    public String getSegmentType() {
        return this.SegmentType;
    }

    /**
     * Set 
     * @param SegmentType 
     */
    public void setSegmentType(String SegmentType) {
        this.SegmentType = SegmentType;
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

    public TranscodeTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TranscodeTemplate(TranscodeTemplate source) {
        if (source.Definition != null) {
            this.Definition = new String(source.Definition);
        }
        if (source.Container != null) {
            this.Container = new String(source.Container);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
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
        if (source.EnhanceConfig != null) {
            this.EnhanceConfig = new EnhanceConfig(source.EnhanceConfig);
        }
        if (source.ContainerType != null) {
            this.ContainerType = new String(source.ContainerType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.SegmentType != null) {
            this.SegmentType = new String(source.SegmentType);
        }
        if (source.StdExtInfo != null) {
            this.StdExtInfo = new String(source.StdExtInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Container", this.Container);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "RemoveVideo", this.RemoveVideo);
        this.setParamSimple(map, prefix + "RemoveAudio", this.RemoveAudio);
        this.setParamObj(map, prefix + "VideoTemplate.", this.VideoTemplate);
        this.setParamObj(map, prefix + "AudioTemplate.", this.AudioTemplate);
        this.setParamObj(map, prefix + "TEHDConfig.", this.TEHDConfig);
        this.setParamObj(map, prefix + "EnhanceConfig.", this.EnhanceConfig);
        this.setParamSimple(map, prefix + "ContainerType", this.ContainerType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "SegmentType", this.SegmentType);
        this.setParamSimple(map, prefix + "StdExtInfo", this.StdExtInfo);

    }
}


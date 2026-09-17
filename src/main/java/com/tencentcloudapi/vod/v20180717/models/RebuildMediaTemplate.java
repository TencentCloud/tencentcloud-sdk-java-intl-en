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

public class RebuildMediaTemplate extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 
    */
    @SerializedName("Type")
    @Expose
    private String Type;

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
    @SerializedName("RebuildVideoInfo")
    @Expose
    private RebuildVideoInfo RebuildVideoInfo;

    /**
    * 
    */
    @SerializedName("RebuildAudioInfo")
    @Expose
    private RebuildAudioInfo RebuildAudioInfo;

    /**
    * 
    */
    @SerializedName("TargetVideoInfo")
    @Expose
    private RebuildMediaTargetVideoStream TargetVideoInfo;

    /**
    * 
    */
    @SerializedName("TargetAudioInfo")
    @Expose
    private RebuildMediaTargetAudioStream TargetAudioInfo;

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
     * Get  
     * @return Definition 
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 
     * @param Definition 
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
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
     * @return RebuildVideoInfo 
     */
    public RebuildVideoInfo getRebuildVideoInfo() {
        return this.RebuildVideoInfo;
    }

    /**
     * Set 
     * @param RebuildVideoInfo 
     */
    public void setRebuildVideoInfo(RebuildVideoInfo RebuildVideoInfo) {
        this.RebuildVideoInfo = RebuildVideoInfo;
    }

    /**
     * Get  
     * @return RebuildAudioInfo 
     */
    public RebuildAudioInfo getRebuildAudioInfo() {
        return this.RebuildAudioInfo;
    }

    /**
     * Set 
     * @param RebuildAudioInfo 
     */
    public void setRebuildAudioInfo(RebuildAudioInfo RebuildAudioInfo) {
        this.RebuildAudioInfo = RebuildAudioInfo;
    }

    /**
     * Get  
     * @return TargetVideoInfo 
     */
    public RebuildMediaTargetVideoStream getTargetVideoInfo() {
        return this.TargetVideoInfo;
    }

    /**
     * Set 
     * @param TargetVideoInfo 
     */
    public void setTargetVideoInfo(RebuildMediaTargetVideoStream TargetVideoInfo) {
        this.TargetVideoInfo = TargetVideoInfo;
    }

    /**
     * Get  
     * @return TargetAudioInfo 
     */
    public RebuildMediaTargetAudioStream getTargetAudioInfo() {
        return this.TargetAudioInfo;
    }

    /**
     * Set 
     * @param TargetAudioInfo 
     */
    public void setTargetAudioInfo(RebuildMediaTargetAudioStream TargetAudioInfo) {
        this.TargetAudioInfo = TargetAudioInfo;
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

    public RebuildMediaTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RebuildMediaTemplate(RebuildMediaTemplate source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.RebuildVideoInfo != null) {
            this.RebuildVideoInfo = new RebuildVideoInfo(source.RebuildVideoInfo);
        }
        if (source.RebuildAudioInfo != null) {
            this.RebuildAudioInfo = new RebuildAudioInfo(source.RebuildAudioInfo);
        }
        if (source.TargetVideoInfo != null) {
            this.TargetVideoInfo = new RebuildMediaTargetVideoStream(source.TargetVideoInfo);
        }
        if (source.TargetAudioInfo != null) {
            this.TargetAudioInfo = new RebuildMediaTargetAudioStream(source.TargetAudioInfo);
        }
        if (source.Container != null) {
            this.Container = new String(source.Container);
        }
        if (source.RemoveVideo != null) {
            this.RemoveVideo = new Long(source.RemoveVideo);
        }
        if (source.RemoveAudio != null) {
            this.RemoveAudio = new Long(source.RemoveAudio);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamObj(map, prefix + "RebuildVideoInfo.", this.RebuildVideoInfo);
        this.setParamObj(map, prefix + "RebuildAudioInfo.", this.RebuildAudioInfo);
        this.setParamObj(map, prefix + "TargetVideoInfo.", this.TargetVideoInfo);
        this.setParamObj(map, prefix + "TargetAudioInfo.", this.TargetAudioInfo);
        this.setParamSimple(map, prefix + "Container", this.Container);
        this.setParamSimple(map, prefix + "RemoveVideo", this.RemoveVideo);
        this.setParamSimple(map, prefix + "RemoveAudio", this.RemoveAudio);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}


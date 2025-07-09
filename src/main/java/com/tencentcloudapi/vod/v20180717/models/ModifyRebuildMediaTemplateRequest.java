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

public class ModifyRebuildMediaTemplateRequest extends AbstractModel {

    /**
    * Rebuild Media Template ID.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private String SubAppId;

    /**
    * Rebuild Media Template Name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Rebuild media template description.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Rebuild media video control information.
    */
    @SerializedName("RebuildVideoInfo")
    @Expose
    private RebuildVideoInfo RebuildVideoInfo;

    /**
    * Rebuild media audio control information.
    */
    @SerializedName("RebuildAudioInfo")
    @Expose
    private RebuildAudioInfo RebuildAudioInfo;

    /**
    * The output video parameters.
    */
    @SerializedName("TargetVideoInfo")
    @Expose
    private RebuildMediaTargetVideoStream TargetVideoInfo;

    /**
    * The output audio parameters.
    */
    @SerializedName("TargetAudioInfo")
    @Expose
    private RebuildMediaTargetAudioStream TargetAudioInfo;

    /**
    * The output container format. Valid values: `mp4`, `flv`, `hls`.
    */
    @SerializedName("Container")
    @Expose
    private String Container;

    /**
    * Whether to remove video data. Valid values:
<li>`0`: No</li>
<li>`1`: Yes</li>
    */
    @SerializedName("RemoveVideo")
    @Expose
    private Long RemoveVideo;

    /**
    * Whether to remove audio data. Valid values:
<li>`0`: No</li>
<li>`1`: Yes</li>
    */
    @SerializedName("RemoveAudio")
    @Expose
    private Long RemoveAudio;

    /**
     * Get Rebuild Media Template ID. 
     * @return Definition Rebuild Media Template ID.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Rebuild Media Template ID.
     * @param Definition Rebuild Media Template ID.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b> 
     * @return SubAppId <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
     */
    public String getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
     * @param SubAppId <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
     */
    public void setSubAppId(String SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Rebuild Media Template Name. 
     * @return Name Rebuild Media Template Name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Rebuild Media Template Name.
     * @param Name Rebuild Media Template Name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Rebuild media template description. 
     * @return Comment Rebuild media template description.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Rebuild media template description.
     * @param Comment Rebuild media template description.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get Rebuild media video control information. 
     * @return RebuildVideoInfo Rebuild media video control information.
     */
    public RebuildVideoInfo getRebuildVideoInfo() {
        return this.RebuildVideoInfo;
    }

    /**
     * Set Rebuild media video control information.
     * @param RebuildVideoInfo Rebuild media video control information.
     */
    public void setRebuildVideoInfo(RebuildVideoInfo RebuildVideoInfo) {
        this.RebuildVideoInfo = RebuildVideoInfo;
    }

    /**
     * Get Rebuild media audio control information. 
     * @return RebuildAudioInfo Rebuild media audio control information.
     */
    public RebuildAudioInfo getRebuildAudioInfo() {
        return this.RebuildAudioInfo;
    }

    /**
     * Set Rebuild media audio control information.
     * @param RebuildAudioInfo Rebuild media audio control information.
     */
    public void setRebuildAudioInfo(RebuildAudioInfo RebuildAudioInfo) {
        this.RebuildAudioInfo = RebuildAudioInfo;
    }

    /**
     * Get The output video parameters. 
     * @return TargetVideoInfo The output video parameters.
     */
    public RebuildMediaTargetVideoStream getTargetVideoInfo() {
        return this.TargetVideoInfo;
    }

    /**
     * Set The output video parameters.
     * @param TargetVideoInfo The output video parameters.
     */
    public void setTargetVideoInfo(RebuildMediaTargetVideoStream TargetVideoInfo) {
        this.TargetVideoInfo = TargetVideoInfo;
    }

    /**
     * Get The output audio parameters. 
     * @return TargetAudioInfo The output audio parameters.
     */
    public RebuildMediaTargetAudioStream getTargetAudioInfo() {
        return this.TargetAudioInfo;
    }

    /**
     * Set The output audio parameters.
     * @param TargetAudioInfo The output audio parameters.
     */
    public void setTargetAudioInfo(RebuildMediaTargetAudioStream TargetAudioInfo) {
        this.TargetAudioInfo = TargetAudioInfo;
    }

    /**
     * Get The output container format. Valid values: `mp4`, `flv`, `hls`. 
     * @return Container The output container format. Valid values: `mp4`, `flv`, `hls`.
     */
    public String getContainer() {
        return this.Container;
    }

    /**
     * Set The output container format. Valid values: `mp4`, `flv`, `hls`.
     * @param Container The output container format. Valid values: `mp4`, `flv`, `hls`.
     */
    public void setContainer(String Container) {
        this.Container = Container;
    }

    /**
     * Get Whether to remove video data. Valid values:
<li>`0`: No</li>
<li>`1`: Yes</li> 
     * @return RemoveVideo Whether to remove video data. Valid values:
<li>`0`: No</li>
<li>`1`: Yes</li>
     */
    public Long getRemoveVideo() {
        return this.RemoveVideo;
    }

    /**
     * Set Whether to remove video data. Valid values:
<li>`0`: No</li>
<li>`1`: Yes</li>
     * @param RemoveVideo Whether to remove video data. Valid values:
<li>`0`: No</li>
<li>`1`: Yes</li>
     */
    public void setRemoveVideo(Long RemoveVideo) {
        this.RemoveVideo = RemoveVideo;
    }

    /**
     * Get Whether to remove audio data. Valid values:
<li>`0`: No</li>
<li>`1`: Yes</li> 
     * @return RemoveAudio Whether to remove audio data. Valid values:
<li>`0`: No</li>
<li>`1`: Yes</li>
     */
    public Long getRemoveAudio() {
        return this.RemoveAudio;
    }

    /**
     * Set Whether to remove audio data. Valid values:
<li>`0`: No</li>
<li>`1`: Yes</li>
     * @param RemoveAudio Whether to remove audio data. Valid values:
<li>`0`: No</li>
<li>`1`: Yes</li>
     */
    public void setRemoveAudio(Long RemoveAudio) {
        this.RemoveAudio = RemoveAudio;
    }

    public ModifyRebuildMediaTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRebuildMediaTemplateRequest(ModifyRebuildMediaTemplateRequest source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new String(source.SubAppId);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamObj(map, prefix + "RebuildVideoInfo.", this.RebuildVideoInfo);
        this.setParamObj(map, prefix + "RebuildAudioInfo.", this.RebuildAudioInfo);
        this.setParamObj(map, prefix + "TargetVideoInfo.", this.TargetVideoInfo);
        this.setParamObj(map, prefix + "TargetAudioInfo.", this.TargetAudioInfo);
        this.setParamSimple(map, prefix + "Container", this.Container);
        this.setParamSimple(map, prefix + "RemoveVideo", this.RemoveVideo);
        this.setParamSimple(map, prefix + "RemoveAudio", this.RemoveAudio);

    }
}


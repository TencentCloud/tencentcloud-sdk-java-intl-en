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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRebuildMediaTemplateRequest extends AbstractModel {

    /**
    * The output container format. Valid values: `mp4`, `flv`, `hls`.
    */
    @SerializedName("Container")
    @Expose
    private String Container;

    /**
    * <b>The VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty.</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * The remaster template name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * The template description.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * The video remaster parameters.
    */
    @SerializedName("RebuildVideoInfo")
    @Expose
    private RebuildVideoInfo RebuildVideoInfo;

    /**
    * The audio remaster parameters.
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
    * Whether to remove video data. Valid values:
<li>`0`: No</li>
<li>`1`: Yes</li>
Default value: 0.
    */
    @SerializedName("RemoveVideo")
    @Expose
    private Long RemoveVideo;

    /**
    * Whether to remove audio data. Valid values:
<li>`0`: No</li>
<li>`1`: Yes</li>
Default value: 0.
    */
    @SerializedName("RemoveAudio")
    @Expose
    private String RemoveAudio;

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
     * Get <b>The VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty.</b> 
     * @return SubAppId <b>The VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty.</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>The VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty.</b>
     * @param SubAppId <b>The VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty.</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get The remaster template name. 
     * @return Name The remaster template name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set The remaster template name.
     * @param Name The remaster template name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get The template description. 
     * @return Comment The template description.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set The template description.
     * @param Comment The template description.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get The video remaster parameters. 
     * @return RebuildVideoInfo The video remaster parameters.
     */
    public RebuildVideoInfo getRebuildVideoInfo() {
        return this.RebuildVideoInfo;
    }

    /**
     * Set The video remaster parameters.
     * @param RebuildVideoInfo The video remaster parameters.
     */
    public void setRebuildVideoInfo(RebuildVideoInfo RebuildVideoInfo) {
        this.RebuildVideoInfo = RebuildVideoInfo;
    }

    /**
     * Get The audio remaster parameters. 
     * @return RebuildAudioInfo The audio remaster parameters.
     */
    public RebuildAudioInfo getRebuildAudioInfo() {
        return this.RebuildAudioInfo;
    }

    /**
     * Set The audio remaster parameters.
     * @param RebuildAudioInfo The audio remaster parameters.
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
     * Get Whether to remove video data. Valid values:
<li>`0`: No</li>
<li>`1`: Yes</li>
Default value: 0. 
     * @return RemoveVideo Whether to remove video data. Valid values:
<li>`0`: No</li>
<li>`1`: Yes</li>
Default value: 0.
     */
    public Long getRemoveVideo() {
        return this.RemoveVideo;
    }

    /**
     * Set Whether to remove video data. Valid values:
<li>`0`: No</li>
<li>`1`: Yes</li>
Default value: 0.
     * @param RemoveVideo Whether to remove video data. Valid values:
<li>`0`: No</li>
<li>`1`: Yes</li>
Default value: 0.
     */
    public void setRemoveVideo(Long RemoveVideo) {
        this.RemoveVideo = RemoveVideo;
    }

    /**
     * Get Whether to remove audio data. Valid values:
<li>`0`: No</li>
<li>`1`: Yes</li>
Default value: 0. 
     * @return RemoveAudio Whether to remove audio data. Valid values:
<li>`0`: No</li>
<li>`1`: Yes</li>
Default value: 0.
     */
    public String getRemoveAudio() {
        return this.RemoveAudio;
    }

    /**
     * Set Whether to remove audio data. Valid values:
<li>`0`: No</li>
<li>`1`: Yes</li>
Default value: 0.
     * @param RemoveAudio Whether to remove audio data. Valid values:
<li>`0`: No</li>
<li>`1`: Yes</li>
Default value: 0.
     */
    public void setRemoveAudio(String RemoveAudio) {
        this.RemoveAudio = RemoveAudio;
    }

    public CreateRebuildMediaTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRebuildMediaTemplateRequest(CreateRebuildMediaTemplateRequest source) {
        if (source.Container != null) {
            this.Container = new String(source.Container);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
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
        if (source.RemoveVideo != null) {
            this.RemoveVideo = new Long(source.RemoveVideo);
        }
        if (source.RemoveAudio != null) {
            this.RemoveAudio = new String(source.RemoveAudio);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Container", this.Container);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamObj(map, prefix + "RebuildVideoInfo.", this.RebuildVideoInfo);
        this.setParamObj(map, prefix + "RebuildAudioInfo.", this.RebuildAudioInfo);
        this.setParamObj(map, prefix + "TargetVideoInfo.", this.TargetVideoInfo);
        this.setParamObj(map, prefix + "TargetAudioInfo.", this.TargetAudioInfo);
        this.setParamSimple(map, prefix + "RemoveVideo", this.RemoveVideo);
        this.setParamSimple(map, prefix + "RemoveAudio", this.RemoveAudio);

    }
}


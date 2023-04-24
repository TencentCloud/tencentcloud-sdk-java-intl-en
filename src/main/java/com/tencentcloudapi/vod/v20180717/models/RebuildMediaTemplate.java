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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RebuildMediaTemplate extends AbstractModel{

    /**
    * The remaster template ID.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * The template type. Valid values:
<li>`Preset`</li>
<li>`Custom`</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

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
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RebuildVideoInfo")
    @Expose
    private RebuildVideoInfo RebuildVideoInfo;

    /**
    * The audio remaster parameters.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RebuildAudioInfo")
    @Expose
    private RebuildAudioInfo RebuildAudioInfo;

    /**
    * The output video parameters.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TargetVideoInfo")
    @Expose
    private RebuildMediaTargetVideoStream TargetVideoInfo;

    /**
    * The output audio parameters.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TargetAudioInfo")
    @Expose
    private RebuildMediaTargetAudioStream TargetAudioInfo;

    /**
    * The output file format. Valid values: `mp4` (default), `hls`.
    */
    @SerializedName("Container")
    @Expose
    private String Container;

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
    private Long RemoveAudio;

    /**
    * The template creation time in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * The last updated time of the template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get The remaster template ID. 
     * @return Definition The remaster template ID.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set The remaster template ID.
     * @param Definition The remaster template ID.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get The template type. Valid values:
<li>`Preset`</li>
<li>`Custom`</li> 
     * @return Type The template type. Valid values:
<li>`Preset`</li>
<li>`Custom`</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The template type. Valid values:
<li>`Preset`</li>
<li>`Custom`</li>
     * @param Type The template type. Valid values:
<li>`Preset`</li>
<li>`Custom`</li>
     */
    public void setType(String Type) {
        this.Type = Type;
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
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RebuildVideoInfo The video remaster parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public RebuildVideoInfo getRebuildVideoInfo() {
        return this.RebuildVideoInfo;
    }

    /**
     * Set The video remaster parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RebuildVideoInfo The video remaster parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRebuildVideoInfo(RebuildVideoInfo RebuildVideoInfo) {
        this.RebuildVideoInfo = RebuildVideoInfo;
    }

    /**
     * Get The audio remaster parameters.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RebuildAudioInfo The audio remaster parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public RebuildAudioInfo getRebuildAudioInfo() {
        return this.RebuildAudioInfo;
    }

    /**
     * Set The audio remaster parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RebuildAudioInfo The audio remaster parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRebuildAudioInfo(RebuildAudioInfo RebuildAudioInfo) {
        this.RebuildAudioInfo = RebuildAudioInfo;
    }

    /**
     * Get The output video parameters.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TargetVideoInfo The output video parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public RebuildMediaTargetVideoStream getTargetVideoInfo() {
        return this.TargetVideoInfo;
    }

    /**
     * Set The output video parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TargetVideoInfo The output video parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTargetVideoInfo(RebuildMediaTargetVideoStream TargetVideoInfo) {
        this.TargetVideoInfo = TargetVideoInfo;
    }

    /**
     * Get The output audio parameters.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TargetAudioInfo The output audio parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public RebuildMediaTargetAudioStream getTargetAudioInfo() {
        return this.TargetAudioInfo;
    }

    /**
     * Set The output audio parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TargetAudioInfo The output audio parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTargetAudioInfo(RebuildMediaTargetAudioStream TargetAudioInfo) {
        this.TargetAudioInfo = TargetAudioInfo;
    }

    /**
     * Get The output file format. Valid values: `mp4` (default), `hls`. 
     * @return Container The output file format. Valid values: `mp4` (default), `hls`.
     */
    public String getContainer() {
        return this.Container;
    }

    /**
     * Set The output file format. Valid values: `mp4` (default), `hls`.
     * @param Container The output file format. Valid values: `mp4` (default), `hls`.
     */
    public void setContainer(String Container) {
        this.Container = Container;
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
    public Long getRemoveAudio() {
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
    public void setRemoveAudio(Long RemoveAudio) {
        this.RemoveAudio = RemoveAudio;
    }

    /**
     * Get The template creation time in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return CreateTime The template creation time in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set The template creation time in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param CreateTime The template creation time in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get The last updated time of the template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return UpdateTime The last updated time of the template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set The last updated time of the template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param UpdateTime The last updated time of the template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
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


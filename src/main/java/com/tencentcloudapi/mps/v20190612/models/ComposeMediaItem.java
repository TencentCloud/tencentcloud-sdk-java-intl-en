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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComposeMediaItem extends AbstractModel {

    /**
    * The element type. Valid values:
<li>`Video` </li>
<li>`Audio` </li>
<li>`Image` </li>
<li>`Transition` </li>
<li>`Subtitle` </li>
<li>`Empty` </li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * The information of the video element, which is valid if `Type` is `Video`.
    */
    @SerializedName("Video")
    @Expose
    private ComposeVideoItem Video;

    /**
    * The information of the audio element, which is valid if `Type` is `Audio`.
    */
    @SerializedName("Audio")
    @Expose
    private ComposeAudioItem Audio;

    /**
    * The information of the image element, which is valid if `Type` is `Image`.
    */
    @SerializedName("Image")
    @Expose
    private ComposeImageItem Image;

    /**
    * The information of the transition element, which is valid if `Type` is `Transition`.
    */
    @SerializedName("Transition")
    @Expose
    private ComposeTransitionItem Transition;

    /**
    * The information of the subtitle element, which is valid if `Type` is `Subtitle`.
    */
    @SerializedName("Subtitle")
    @Expose
    private ComposeSubtitleItem Subtitle;

    /**
    * The information of the empty element, which is valid if `Type` is `Empty`. An empty element is used as a placeholder in the timeline.
    */
    @SerializedName("Empty")
    @Expose
    private ComposeEmptyItem Empty;

    /**
     * Get The element type. Valid values:
<li>`Video` </li>
<li>`Audio` </li>
<li>`Image` </li>
<li>`Transition` </li>
<li>`Subtitle` </li>
<li>`Empty` </li> 
     * @return Type The element type. Valid values:
<li>`Video` </li>
<li>`Audio` </li>
<li>`Image` </li>
<li>`Transition` </li>
<li>`Subtitle` </li>
<li>`Empty` </li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The element type. Valid values:
<li>`Video` </li>
<li>`Audio` </li>
<li>`Image` </li>
<li>`Transition` </li>
<li>`Subtitle` </li>
<li>`Empty` </li>
     * @param Type The element type. Valid values:
<li>`Video` </li>
<li>`Audio` </li>
<li>`Image` </li>
<li>`Transition` </li>
<li>`Subtitle` </li>
<li>`Empty` </li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get The information of the video element, which is valid if `Type` is `Video`. 
     * @return Video The information of the video element, which is valid if `Type` is `Video`.
     */
    public ComposeVideoItem getVideo() {
        return this.Video;
    }

    /**
     * Set The information of the video element, which is valid if `Type` is `Video`.
     * @param Video The information of the video element, which is valid if `Type` is `Video`.
     */
    public void setVideo(ComposeVideoItem Video) {
        this.Video = Video;
    }

    /**
     * Get The information of the audio element, which is valid if `Type` is `Audio`. 
     * @return Audio The information of the audio element, which is valid if `Type` is `Audio`.
     */
    public ComposeAudioItem getAudio() {
        return this.Audio;
    }

    /**
     * Set The information of the audio element, which is valid if `Type` is `Audio`.
     * @param Audio The information of the audio element, which is valid if `Type` is `Audio`.
     */
    public void setAudio(ComposeAudioItem Audio) {
        this.Audio = Audio;
    }

    /**
     * Get The information of the image element, which is valid if `Type` is `Image`. 
     * @return Image The information of the image element, which is valid if `Type` is `Image`.
     */
    public ComposeImageItem getImage() {
        return this.Image;
    }

    /**
     * Set The information of the image element, which is valid if `Type` is `Image`.
     * @param Image The information of the image element, which is valid if `Type` is `Image`.
     */
    public void setImage(ComposeImageItem Image) {
        this.Image = Image;
    }

    /**
     * Get The information of the transition element, which is valid if `Type` is `Transition`. 
     * @return Transition The information of the transition element, which is valid if `Type` is `Transition`.
     */
    public ComposeTransitionItem getTransition() {
        return this.Transition;
    }

    /**
     * Set The information of the transition element, which is valid if `Type` is `Transition`.
     * @param Transition The information of the transition element, which is valid if `Type` is `Transition`.
     */
    public void setTransition(ComposeTransitionItem Transition) {
        this.Transition = Transition;
    }

    /**
     * Get The information of the subtitle element, which is valid if `Type` is `Subtitle`. 
     * @return Subtitle The information of the subtitle element, which is valid if `Type` is `Subtitle`.
     */
    public ComposeSubtitleItem getSubtitle() {
        return this.Subtitle;
    }

    /**
     * Set The information of the subtitle element, which is valid if `Type` is `Subtitle`.
     * @param Subtitle The information of the subtitle element, which is valid if `Type` is `Subtitle`.
     */
    public void setSubtitle(ComposeSubtitleItem Subtitle) {
        this.Subtitle = Subtitle;
    }

    /**
     * Get The information of the empty element, which is valid if `Type` is `Empty`. An empty element is used as a placeholder in the timeline. 
     * @return Empty The information of the empty element, which is valid if `Type` is `Empty`. An empty element is used as a placeholder in the timeline.
     */
    public ComposeEmptyItem getEmpty() {
        return this.Empty;
    }

    /**
     * Set The information of the empty element, which is valid if `Type` is `Empty`. An empty element is used as a placeholder in the timeline.
     * @param Empty The information of the empty element, which is valid if `Type` is `Empty`. An empty element is used as a placeholder in the timeline.
     */
    public void setEmpty(ComposeEmptyItem Empty) {
        this.Empty = Empty;
    }

    public ComposeMediaItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComposeMediaItem(ComposeMediaItem source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Video != null) {
            this.Video = new ComposeVideoItem(source.Video);
        }
        if (source.Audio != null) {
            this.Audio = new ComposeAudioItem(source.Audio);
        }
        if (source.Image != null) {
            this.Image = new ComposeImageItem(source.Image);
        }
        if (source.Transition != null) {
            this.Transition = new ComposeTransitionItem(source.Transition);
        }
        if (source.Subtitle != null) {
            this.Subtitle = new ComposeSubtitleItem(source.Subtitle);
        }
        if (source.Empty != null) {
            this.Empty = new ComposeEmptyItem(source.Empty);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "Video.", this.Video);
        this.setParamObj(map, prefix + "Audio.", this.Audio);
        this.setParamObj(map, prefix + "Image.", this.Image);
        this.setParamObj(map, prefix + "Transition.", this.Transition);
        this.setParamObj(map, prefix + "Subtitle.", this.Subtitle);
        this.setParamObj(map, prefix + "Empty.", this.Empty);

    }
}


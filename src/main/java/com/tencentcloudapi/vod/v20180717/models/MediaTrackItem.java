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

public class MediaTrackItem extends AbstractModel {

    /**
    * Segment type. Valid values:
<li>Video: video segment.</li>
<li>Audio: audio segment.</li>
<li>Sticker: sticker segment.</li>
<li>Transition: transition.</li>
<li>Empty: empty segment.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Video segment, which is valid if `Type` is `Video`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VideoItem")
    @Expose
    private VideoTrackItem VideoItem;

    /**
    * Audio segment, which is valid if `Type` is `Audio`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AudioItem")
    @Expose
    private AudioTrackItem AudioItem;

    /**
    * Sticker segment, which is valid if `Type` is `Sticker`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StickerItem")
    @Expose
    private StickerTrackItem StickerItem;

    /**
    * Transition, which is valid if `Type` is `Transition`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TransitionItem")
    @Expose
    private MediaTransitionItem TransitionItem;

    /**
    * Empty segment, which is valid if `Type` is `Empty`. It is used as placeholder on time axis. <li>If you want a period of silence between two audio segments, you can use `EmptyTrackItem` to hold the place.</li>
<li>Use `EmptyTrackItem` as a placeholder to locate an item.</li>
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EmptyItem")
    @Expose
    private EmptyTrackItem EmptyItem;

    /**
     * Get Segment type. Valid values:
<li>Video: video segment.</li>
<li>Audio: audio segment.</li>
<li>Sticker: sticker segment.</li>
<li>Transition: transition.</li>
<li>Empty: empty segment.</li> 
     * @return Type Segment type. Valid values:
<li>Video: video segment.</li>
<li>Audio: audio segment.</li>
<li>Sticker: sticker segment.</li>
<li>Transition: transition.</li>
<li>Empty: empty segment.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Segment type. Valid values:
<li>Video: video segment.</li>
<li>Audio: audio segment.</li>
<li>Sticker: sticker segment.</li>
<li>Transition: transition.</li>
<li>Empty: empty segment.</li>
     * @param Type Segment type. Valid values:
<li>Video: video segment.</li>
<li>Audio: audio segment.</li>
<li>Sticker: sticker segment.</li>
<li>Transition: transition.</li>
<li>Empty: empty segment.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Video segment, which is valid if `Type` is `Video`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return VideoItem Video segment, which is valid if `Type` is `Video`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public VideoTrackItem getVideoItem() {
        return this.VideoItem;
    }

    /**
     * Set Video segment, which is valid if `Type` is `Video`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param VideoItem Video segment, which is valid if `Type` is `Video`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setVideoItem(VideoTrackItem VideoItem) {
        this.VideoItem = VideoItem;
    }

    /**
     * Get Audio segment, which is valid if `Type` is `Audio`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AudioItem Audio segment, which is valid if `Type` is `Audio`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public AudioTrackItem getAudioItem() {
        return this.AudioItem;
    }

    /**
     * Set Audio segment, which is valid if `Type` is `Audio`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AudioItem Audio segment, which is valid if `Type` is `Audio`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAudioItem(AudioTrackItem AudioItem) {
        this.AudioItem = AudioItem;
    }

    /**
     * Get Sticker segment, which is valid if `Type` is `Sticker`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return StickerItem Sticker segment, which is valid if `Type` is `Sticker`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public StickerTrackItem getStickerItem() {
        return this.StickerItem;
    }

    /**
     * Set Sticker segment, which is valid if `Type` is `Sticker`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param StickerItem Sticker segment, which is valid if `Type` is `Sticker`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setStickerItem(StickerTrackItem StickerItem) {
        this.StickerItem = StickerItem;
    }

    /**
     * Get Transition, which is valid if `Type` is `Transition`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TransitionItem Transition, which is valid if `Type` is `Transition`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public MediaTransitionItem getTransitionItem() {
        return this.TransitionItem;
    }

    /**
     * Set Transition, which is valid if `Type` is `Transition`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TransitionItem Transition, which is valid if `Type` is `Transition`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTransitionItem(MediaTransitionItem TransitionItem) {
        this.TransitionItem = TransitionItem;
    }

    /**
     * Get Empty segment, which is valid if `Type` is `Empty`. It is used as placeholder on time axis. <li>If you want a period of silence between two audio segments, you can use `EmptyTrackItem` to hold the place.</li>
<li>Use `EmptyTrackItem` as a placeholder to locate an item.</li>
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return EmptyItem Empty segment, which is valid if `Type` is `Empty`. It is used as placeholder on time axis. <li>If you want a period of silence between two audio segments, you can use `EmptyTrackItem` to hold the place.</li>
<li>Use `EmptyTrackItem` as a placeholder to locate an item.</li>
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public EmptyTrackItem getEmptyItem() {
        return this.EmptyItem;
    }

    /**
     * Set Empty segment, which is valid if `Type` is `Empty`. It is used as placeholder on time axis. <li>If you want a period of silence between two audio segments, you can use `EmptyTrackItem` to hold the place.</li>
<li>Use `EmptyTrackItem` as a placeholder to locate an item.</li>
Note: this field may return null, indicating that no valid values can be obtained.
     * @param EmptyItem Empty segment, which is valid if `Type` is `Empty`. It is used as placeholder on time axis. <li>If you want a period of silence between two audio segments, you can use `EmptyTrackItem` to hold the place.</li>
<li>Use `EmptyTrackItem` as a placeholder to locate an item.</li>
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setEmptyItem(EmptyTrackItem EmptyItem) {
        this.EmptyItem = EmptyItem;
    }

    public MediaTrackItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaTrackItem(MediaTrackItem source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.VideoItem != null) {
            this.VideoItem = new VideoTrackItem(source.VideoItem);
        }
        if (source.AudioItem != null) {
            this.AudioItem = new AudioTrackItem(source.AudioItem);
        }
        if (source.StickerItem != null) {
            this.StickerItem = new StickerTrackItem(source.StickerItem);
        }
        if (source.TransitionItem != null) {
            this.TransitionItem = new MediaTransitionItem(source.TransitionItem);
        }
        if (source.EmptyItem != null) {
            this.EmptyItem = new EmptyTrackItem(source.EmptyItem);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "VideoItem.", this.VideoItem);
        this.setParamObj(map, prefix + "AudioItem.", this.AudioItem);
        this.setParamObj(map, prefix + "StickerItem.", this.StickerItem);
        this.setParamObj(map, prefix + "TransitionItem.", this.TransitionItem);
        this.setParamObj(map, prefix + "EmptyItem.", this.EmptyItem);

    }
}


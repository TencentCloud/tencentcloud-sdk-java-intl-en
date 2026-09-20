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
    * Fragment type. Valid values:
<li>Video: video clip.</li>
<li>Audio: audio clip.</li>
<li>Sticker: texture segment.</li>
<li>Transition: transition.</li>
<li>Empty: empty segment.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Video clip. Valid when Type is Video.
    */
    @SerializedName("VideoItem")
    @Expose
    private VideoTrackItem VideoItem;

    /**
    * Audio clip. Valid when Type = Audio.
    */
    @SerializedName("AudioItem")
    @Expose
    private AudioTrackItem AudioItem;

    /**
    * Texture segment. Valid when Type is Sticker.
    */
    @SerializedName("StickerItem")
    @Expose
    private StickerTrackItem StickerItem;

    /**
    * Transition. Valid when Type is Transition.
    */
    @SerializedName("TransitionItem")
    @Expose
    private MediaTransitionItem TransitionItem;

    /**
    * Empty segment. Valid when Type is Empty. Empty segments are used as placeholders on the timeline.<li>If a period of silence is required between two audio clips, you can use EmptyTrackItem as a placeholder.</li>
<li>Use EmptyTrackItem as a placeholder to locate an item.</li>
    */
    @SerializedName("EmptyItem")
    @Expose
    private EmptyTrackItem EmptyItem;

    /**
     * Get Fragment type. Valid values:
<li>Video: video clip.</li>
<li>Audio: audio clip.</li>
<li>Sticker: texture segment.</li>
<li>Transition: transition.</li>
<li>Empty: empty segment.</li> 
     * @return Type Fragment type. Valid values:
<li>Video: video clip.</li>
<li>Audio: audio clip.</li>
<li>Sticker: texture segment.</li>
<li>Transition: transition.</li>
<li>Empty: empty segment.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Fragment type. Valid values:
<li>Video: video clip.</li>
<li>Audio: audio clip.</li>
<li>Sticker: texture segment.</li>
<li>Transition: transition.</li>
<li>Empty: empty segment.</li>
     * @param Type Fragment type. Valid values:
<li>Video: video clip.</li>
<li>Audio: audio clip.</li>
<li>Sticker: texture segment.</li>
<li>Transition: transition.</li>
<li>Empty: empty segment.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Video clip. Valid when Type is Video. 
     * @return VideoItem Video clip. Valid when Type is Video.
     */
    public VideoTrackItem getVideoItem() {
        return this.VideoItem;
    }

    /**
     * Set Video clip. Valid when Type is Video.
     * @param VideoItem Video clip. Valid when Type is Video.
     */
    public void setVideoItem(VideoTrackItem VideoItem) {
        this.VideoItem = VideoItem;
    }

    /**
     * Get Audio clip. Valid when Type = Audio. 
     * @return AudioItem Audio clip. Valid when Type = Audio.
     */
    public AudioTrackItem getAudioItem() {
        return this.AudioItem;
    }

    /**
     * Set Audio clip. Valid when Type = Audio.
     * @param AudioItem Audio clip. Valid when Type = Audio.
     */
    public void setAudioItem(AudioTrackItem AudioItem) {
        this.AudioItem = AudioItem;
    }

    /**
     * Get Texture segment. Valid when Type is Sticker. 
     * @return StickerItem Texture segment. Valid when Type is Sticker.
     */
    public StickerTrackItem getStickerItem() {
        return this.StickerItem;
    }

    /**
     * Set Texture segment. Valid when Type is Sticker.
     * @param StickerItem Texture segment. Valid when Type is Sticker.
     */
    public void setStickerItem(StickerTrackItem StickerItem) {
        this.StickerItem = StickerItem;
    }

    /**
     * Get Transition. Valid when Type is Transition. 
     * @return TransitionItem Transition. Valid when Type is Transition.
     */
    public MediaTransitionItem getTransitionItem() {
        return this.TransitionItem;
    }

    /**
     * Set Transition. Valid when Type is Transition.
     * @param TransitionItem Transition. Valid when Type is Transition.
     */
    public void setTransitionItem(MediaTransitionItem TransitionItem) {
        this.TransitionItem = TransitionItem;
    }

    /**
     * Get Empty segment. Valid when Type is Empty. Empty segments are used as placeholders on the timeline.<li>If a period of silence is required between two audio clips, you can use EmptyTrackItem as a placeholder.</li>
<li>Use EmptyTrackItem as a placeholder to locate an item.</li> 
     * @return EmptyItem Empty segment. Valid when Type is Empty. Empty segments are used as placeholders on the timeline.<li>If a period of silence is required between two audio clips, you can use EmptyTrackItem as a placeholder.</li>
<li>Use EmptyTrackItem as a placeholder to locate an item.</li>
     */
    public EmptyTrackItem getEmptyItem() {
        return this.EmptyItem;
    }

    /**
     * Set Empty segment. Valid when Type is Empty. Empty segments are used as placeholders on the timeline.<li>If a period of silence is required between two audio clips, you can use EmptyTrackItem as a placeholder.</li>
<li>Use EmptyTrackItem as a placeholder to locate an item.</li>
     * @param EmptyItem Empty segment. Valid when Type is Empty. Empty segments are used as placeholders on the timeline.<li>If a period of silence is required between two audio clips, you can use EmptyTrackItem as a placeholder.</li>
<li>Use EmptyTrackItem as a placeholder to locate an item.</li>
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


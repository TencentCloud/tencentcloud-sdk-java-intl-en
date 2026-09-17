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
    * 
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 
    */
    @SerializedName("VideoItem")
    @Expose
    private VideoTrackItem VideoItem;

    /**
    * 
    */
    @SerializedName("AudioItem")
    @Expose
    private AudioTrackItem AudioItem;

    /**
    * 
    */
    @SerializedName("StickerItem")
    @Expose
    private StickerTrackItem StickerItem;

    /**
    * 
    */
    @SerializedName("TransitionItem")
    @Expose
    private MediaTransitionItem TransitionItem;

    /**
    * 
    */
    @SerializedName("EmptyItem")
    @Expose
    private EmptyTrackItem EmptyItem;

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
     * @return VideoItem 
     */
    public VideoTrackItem getVideoItem() {
        return this.VideoItem;
    }

    /**
     * Set 
     * @param VideoItem 
     */
    public void setVideoItem(VideoTrackItem VideoItem) {
        this.VideoItem = VideoItem;
    }

    /**
     * Get  
     * @return AudioItem 
     */
    public AudioTrackItem getAudioItem() {
        return this.AudioItem;
    }

    /**
     * Set 
     * @param AudioItem 
     */
    public void setAudioItem(AudioTrackItem AudioItem) {
        this.AudioItem = AudioItem;
    }

    /**
     * Get  
     * @return StickerItem 
     */
    public StickerTrackItem getStickerItem() {
        return this.StickerItem;
    }

    /**
     * Set 
     * @param StickerItem 
     */
    public void setStickerItem(StickerTrackItem StickerItem) {
        this.StickerItem = StickerItem;
    }

    /**
     * Get  
     * @return TransitionItem 
     */
    public MediaTransitionItem getTransitionItem() {
        return this.TransitionItem;
    }

    /**
     * Set 
     * @param TransitionItem 
     */
    public void setTransitionItem(MediaTransitionItem TransitionItem) {
        this.TransitionItem = TransitionItem;
    }

    /**
     * Get  
     * @return EmptyItem 
     */
    public EmptyTrackItem getEmptyItem() {
        return this.EmptyItem;
    }

    /**
     * Set 
     * @param EmptyItem 
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


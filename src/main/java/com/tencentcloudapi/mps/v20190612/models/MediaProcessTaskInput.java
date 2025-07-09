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

public class MediaProcessTaskInput extends AbstractModel {

    /**
    * List of transcoding tasks.
    */
    @SerializedName("TranscodeTaskSet")
    @Expose
    private TranscodeTaskInput [] TranscodeTaskSet;

    /**
    * List of animated image screenshot tasks.
    */
    @SerializedName("AnimatedGraphicTaskSet")
    @Expose
    private AnimatedGraphicTaskInput [] AnimatedGraphicTaskSet;

    /**
    * List of time point screenshot tasks.
    */
    @SerializedName("SnapshotByTimeOffsetTaskSet")
    @Expose
    private SnapshotByTimeOffsetTaskInput [] SnapshotByTimeOffsetTaskSet;

    /**
    * List of sampled screenshot tasks.
    */
    @SerializedName("SampleSnapshotTaskSet")
    @Expose
    private SampleSnapshotTaskInput [] SampleSnapshotTaskSet;

    /**
    * List of image sprite screenshot tasks.
    */
    @SerializedName("ImageSpriteTaskSet")
    @Expose
    private ImageSpriteTaskInput [] ImageSpriteTaskSet;

    /**
    * List of adaptive bitrate streaming tasks.
    */
    @SerializedName("AdaptiveDynamicStreamingTaskSet")
    @Expose
    private AdaptiveDynamicStreamingTaskInput [] AdaptiveDynamicStreamingTaskSet;

    /**
     * Get List of transcoding tasks. 
     * @return TranscodeTaskSet List of transcoding tasks.
     */
    public TranscodeTaskInput [] getTranscodeTaskSet() {
        return this.TranscodeTaskSet;
    }

    /**
     * Set List of transcoding tasks.
     * @param TranscodeTaskSet List of transcoding tasks.
     */
    public void setTranscodeTaskSet(TranscodeTaskInput [] TranscodeTaskSet) {
        this.TranscodeTaskSet = TranscodeTaskSet;
    }

    /**
     * Get List of animated image screenshot tasks. 
     * @return AnimatedGraphicTaskSet List of animated image screenshot tasks.
     */
    public AnimatedGraphicTaskInput [] getAnimatedGraphicTaskSet() {
        return this.AnimatedGraphicTaskSet;
    }

    /**
     * Set List of animated image screenshot tasks.
     * @param AnimatedGraphicTaskSet List of animated image screenshot tasks.
     */
    public void setAnimatedGraphicTaskSet(AnimatedGraphicTaskInput [] AnimatedGraphicTaskSet) {
        this.AnimatedGraphicTaskSet = AnimatedGraphicTaskSet;
    }

    /**
     * Get List of time point screenshot tasks. 
     * @return SnapshotByTimeOffsetTaskSet List of time point screenshot tasks.
     */
    public SnapshotByTimeOffsetTaskInput [] getSnapshotByTimeOffsetTaskSet() {
        return this.SnapshotByTimeOffsetTaskSet;
    }

    /**
     * Set List of time point screenshot tasks.
     * @param SnapshotByTimeOffsetTaskSet List of time point screenshot tasks.
     */
    public void setSnapshotByTimeOffsetTaskSet(SnapshotByTimeOffsetTaskInput [] SnapshotByTimeOffsetTaskSet) {
        this.SnapshotByTimeOffsetTaskSet = SnapshotByTimeOffsetTaskSet;
    }

    /**
     * Get List of sampled screenshot tasks. 
     * @return SampleSnapshotTaskSet List of sampled screenshot tasks.
     */
    public SampleSnapshotTaskInput [] getSampleSnapshotTaskSet() {
        return this.SampleSnapshotTaskSet;
    }

    /**
     * Set List of sampled screenshot tasks.
     * @param SampleSnapshotTaskSet List of sampled screenshot tasks.
     */
    public void setSampleSnapshotTaskSet(SampleSnapshotTaskInput [] SampleSnapshotTaskSet) {
        this.SampleSnapshotTaskSet = SampleSnapshotTaskSet;
    }

    /**
     * Get List of image sprite screenshot tasks. 
     * @return ImageSpriteTaskSet List of image sprite screenshot tasks.
     */
    public ImageSpriteTaskInput [] getImageSpriteTaskSet() {
        return this.ImageSpriteTaskSet;
    }

    /**
     * Set List of image sprite screenshot tasks.
     * @param ImageSpriteTaskSet List of image sprite screenshot tasks.
     */
    public void setImageSpriteTaskSet(ImageSpriteTaskInput [] ImageSpriteTaskSet) {
        this.ImageSpriteTaskSet = ImageSpriteTaskSet;
    }

    /**
     * Get List of adaptive bitrate streaming tasks. 
     * @return AdaptiveDynamicStreamingTaskSet List of adaptive bitrate streaming tasks.
     */
    public AdaptiveDynamicStreamingTaskInput [] getAdaptiveDynamicStreamingTaskSet() {
        return this.AdaptiveDynamicStreamingTaskSet;
    }

    /**
     * Set List of adaptive bitrate streaming tasks.
     * @param AdaptiveDynamicStreamingTaskSet List of adaptive bitrate streaming tasks.
     */
    public void setAdaptiveDynamicStreamingTaskSet(AdaptiveDynamicStreamingTaskInput [] AdaptiveDynamicStreamingTaskSet) {
        this.AdaptiveDynamicStreamingTaskSet = AdaptiveDynamicStreamingTaskSet;
    }

    public MediaProcessTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaProcessTaskInput(MediaProcessTaskInput source) {
        if (source.TranscodeTaskSet != null) {
            this.TranscodeTaskSet = new TranscodeTaskInput[source.TranscodeTaskSet.length];
            for (int i = 0; i < source.TranscodeTaskSet.length; i++) {
                this.TranscodeTaskSet[i] = new TranscodeTaskInput(source.TranscodeTaskSet[i]);
            }
        }
        if (source.AnimatedGraphicTaskSet != null) {
            this.AnimatedGraphicTaskSet = new AnimatedGraphicTaskInput[source.AnimatedGraphicTaskSet.length];
            for (int i = 0; i < source.AnimatedGraphicTaskSet.length; i++) {
                this.AnimatedGraphicTaskSet[i] = new AnimatedGraphicTaskInput(source.AnimatedGraphicTaskSet[i]);
            }
        }
        if (source.SnapshotByTimeOffsetTaskSet != null) {
            this.SnapshotByTimeOffsetTaskSet = new SnapshotByTimeOffsetTaskInput[source.SnapshotByTimeOffsetTaskSet.length];
            for (int i = 0; i < source.SnapshotByTimeOffsetTaskSet.length; i++) {
                this.SnapshotByTimeOffsetTaskSet[i] = new SnapshotByTimeOffsetTaskInput(source.SnapshotByTimeOffsetTaskSet[i]);
            }
        }
        if (source.SampleSnapshotTaskSet != null) {
            this.SampleSnapshotTaskSet = new SampleSnapshotTaskInput[source.SampleSnapshotTaskSet.length];
            for (int i = 0; i < source.SampleSnapshotTaskSet.length; i++) {
                this.SampleSnapshotTaskSet[i] = new SampleSnapshotTaskInput(source.SampleSnapshotTaskSet[i]);
            }
        }
        if (source.ImageSpriteTaskSet != null) {
            this.ImageSpriteTaskSet = new ImageSpriteTaskInput[source.ImageSpriteTaskSet.length];
            for (int i = 0; i < source.ImageSpriteTaskSet.length; i++) {
                this.ImageSpriteTaskSet[i] = new ImageSpriteTaskInput(source.ImageSpriteTaskSet[i]);
            }
        }
        if (source.AdaptiveDynamicStreamingTaskSet != null) {
            this.AdaptiveDynamicStreamingTaskSet = new AdaptiveDynamicStreamingTaskInput[source.AdaptiveDynamicStreamingTaskSet.length];
            for (int i = 0; i < source.AdaptiveDynamicStreamingTaskSet.length; i++) {
                this.AdaptiveDynamicStreamingTaskSet[i] = new AdaptiveDynamicStreamingTaskInput(source.AdaptiveDynamicStreamingTaskSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TranscodeTaskSet.", this.TranscodeTaskSet);
        this.setParamArrayObj(map, prefix + "AnimatedGraphicTaskSet.", this.AnimatedGraphicTaskSet);
        this.setParamArrayObj(map, prefix + "SnapshotByTimeOffsetTaskSet.", this.SnapshotByTimeOffsetTaskSet);
        this.setParamArrayObj(map, prefix + "SampleSnapshotTaskSet.", this.SampleSnapshotTaskSet);
        this.setParamArrayObj(map, prefix + "ImageSpriteTaskSet.", this.ImageSpriteTaskSet);
        this.setParamArrayObj(map, prefix + "AdaptiveDynamicStreamingTaskSet.", this.AdaptiveDynamicStreamingTaskSet);

    }
}


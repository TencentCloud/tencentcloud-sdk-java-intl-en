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

public class MediaProcessTaskInput extends AbstractModel {

    /**
    * List of transcoding tasks.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TranscodeTaskSet")
    @Expose
    private TranscodeTaskInput [] TranscodeTaskSet;

    /**
    * List of animated image generating tasks.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AnimatedGraphicTaskSet")
    @Expose
    private AnimatedGraphicTaskInput [] AnimatedGraphicTaskSet;

    /**
    * List of time point screencapturing tasks.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SnapshotByTimeOffsetTaskSet")
    @Expose
    private SnapshotByTimeOffsetTaskInput [] SnapshotByTimeOffsetTaskSet;

    /**
    * List of sampled screencapturing tasks.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SampleSnapshotTaskSet")
    @Expose
    private SampleSnapshotTaskInput [] SampleSnapshotTaskSet;

    /**
    * List of image sprite generating tasks.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ImageSpriteTaskSet")
    @Expose
    private ImageSpriteTaskInput [] ImageSpriteTaskSet;

    /**
    * List of cover generating tasks.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CoverBySnapshotTaskSet")
    @Expose
    private CoverBySnapshotTaskInput [] CoverBySnapshotTaskSet;

    /**
    * List of adaptive bitrate streaming tasks.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AdaptiveDynamicStreamingTaskSet")
    @Expose
    private AdaptiveDynamicStreamingTaskInput [] AdaptiveDynamicStreamingTaskSet;

    /**
     * Get List of transcoding tasks.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TranscodeTaskSet List of transcoding tasks.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public TranscodeTaskInput [] getTranscodeTaskSet() {
        return this.TranscodeTaskSet;
    }

    /**
     * Set List of transcoding tasks.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TranscodeTaskSet List of transcoding tasks.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTranscodeTaskSet(TranscodeTaskInput [] TranscodeTaskSet) {
        this.TranscodeTaskSet = TranscodeTaskSet;
    }

    /**
     * Get List of animated image generating tasks.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AnimatedGraphicTaskSet List of animated image generating tasks.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public AnimatedGraphicTaskInput [] getAnimatedGraphicTaskSet() {
        return this.AnimatedGraphicTaskSet;
    }

    /**
     * Set List of animated image generating tasks.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AnimatedGraphicTaskSet List of animated image generating tasks.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAnimatedGraphicTaskSet(AnimatedGraphicTaskInput [] AnimatedGraphicTaskSet) {
        this.AnimatedGraphicTaskSet = AnimatedGraphicTaskSet;
    }

    /**
     * Get List of time point screencapturing tasks.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SnapshotByTimeOffsetTaskSet List of time point screencapturing tasks.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public SnapshotByTimeOffsetTaskInput [] getSnapshotByTimeOffsetTaskSet() {
        return this.SnapshotByTimeOffsetTaskSet;
    }

    /**
     * Set List of time point screencapturing tasks.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SnapshotByTimeOffsetTaskSet List of time point screencapturing tasks.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSnapshotByTimeOffsetTaskSet(SnapshotByTimeOffsetTaskInput [] SnapshotByTimeOffsetTaskSet) {
        this.SnapshotByTimeOffsetTaskSet = SnapshotByTimeOffsetTaskSet;
    }

    /**
     * Get List of sampled screencapturing tasks.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SampleSnapshotTaskSet List of sampled screencapturing tasks.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public SampleSnapshotTaskInput [] getSampleSnapshotTaskSet() {
        return this.SampleSnapshotTaskSet;
    }

    /**
     * Set List of sampled screencapturing tasks.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SampleSnapshotTaskSet List of sampled screencapturing tasks.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSampleSnapshotTaskSet(SampleSnapshotTaskInput [] SampleSnapshotTaskSet) {
        this.SampleSnapshotTaskSet = SampleSnapshotTaskSet;
    }

    /**
     * Get List of image sprite generating tasks.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ImageSpriteTaskSet List of image sprite generating tasks.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ImageSpriteTaskInput [] getImageSpriteTaskSet() {
        return this.ImageSpriteTaskSet;
    }

    /**
     * Set List of image sprite generating tasks.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ImageSpriteTaskSet List of image sprite generating tasks.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setImageSpriteTaskSet(ImageSpriteTaskInput [] ImageSpriteTaskSet) {
        this.ImageSpriteTaskSet = ImageSpriteTaskSet;
    }

    /**
     * Get List of cover generating tasks.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CoverBySnapshotTaskSet List of cover generating tasks.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public CoverBySnapshotTaskInput [] getCoverBySnapshotTaskSet() {
        return this.CoverBySnapshotTaskSet;
    }

    /**
     * Set List of cover generating tasks.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CoverBySnapshotTaskSet List of cover generating tasks.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCoverBySnapshotTaskSet(CoverBySnapshotTaskInput [] CoverBySnapshotTaskSet) {
        this.CoverBySnapshotTaskSet = CoverBySnapshotTaskSet;
    }

    /**
     * Get List of adaptive bitrate streaming tasks.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AdaptiveDynamicStreamingTaskSet List of adaptive bitrate streaming tasks.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public AdaptiveDynamicStreamingTaskInput [] getAdaptiveDynamicStreamingTaskSet() {
        return this.AdaptiveDynamicStreamingTaskSet;
    }

    /**
     * Set List of adaptive bitrate streaming tasks.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AdaptiveDynamicStreamingTaskSet List of adaptive bitrate streaming tasks.
Note: this field may return null, indicating that no valid values can be obtained.
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
        if (source.CoverBySnapshotTaskSet != null) {
            this.CoverBySnapshotTaskSet = new CoverBySnapshotTaskInput[source.CoverBySnapshotTaskSet.length];
            for (int i = 0; i < source.CoverBySnapshotTaskSet.length; i++) {
                this.CoverBySnapshotTaskSet[i] = new CoverBySnapshotTaskInput(source.CoverBySnapshotTaskSet[i]);
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
        this.setParamArrayObj(map, prefix + "CoverBySnapshotTaskSet.", this.CoverBySnapshotTaskSet);
        this.setParamArrayObj(map, prefix + "AdaptiveDynamicStreamingTaskSet.", this.AdaptiveDynamicStreamingTaskSet);

    }
}


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

public class MediaProcessTaskResult extends AbstractModel {

    /**
    * Task type. Valid values:
<li>Transcode: Transcode</li>
<li>AnimatedGraphics: Animated image</li>
<li>SnapshotByTimeOffset: time point screenshot.</li>
<li>SampleSnapshot: sampled screenshot.</li>
<li>ImageSprites: sprite sheet</li>
<li>CoverBySnapshot: screencapturing for cover image.</li>
<li>AdaptiveDynamicStreaming: adaptive bitrate streaming.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 
    */
    @SerializedName("TranscodeTask")
    @Expose
    private MediaProcessTaskTranscodeResult TranscodeTask;

    /**
    * 
    */
    @SerializedName("AnimatedGraphicTask")
    @Expose
    private MediaProcessTaskAnimatedGraphicResult AnimatedGraphicTask;

    /**
    * 
    */
    @SerializedName("SnapshotByTimeOffsetTask")
    @Expose
    private MediaProcessTaskSnapshotByTimeOffsetResult SnapshotByTimeOffsetTask;

    /**
    * 
    */
    @SerializedName("SampleSnapshotTask")
    @Expose
    private MediaProcessTaskSampleSnapshotResult SampleSnapshotTask;

    /**
    * 
    */
    @SerializedName("ImageSpriteTask")
    @Expose
    private MediaProcessTaskImageSpriteResult ImageSpriteTask;

    /**
    * 
    */
    @SerializedName("AdaptiveDynamicStreamingTask")
    @Expose
    private MediaProcessTaskAdaptiveDynamicStreamingResult AdaptiveDynamicStreamingTask;

    /**
     * Get Task type. Valid values:
<li>Transcode: Transcode</li>
<li>AnimatedGraphics: Animated image</li>
<li>SnapshotByTimeOffset: time point screenshot.</li>
<li>SampleSnapshot: sampled screenshot.</li>
<li>ImageSprites: sprite sheet</li>
<li>CoverBySnapshot: screencapturing for cover image.</li>
<li>AdaptiveDynamicStreaming: adaptive bitrate streaming.</li> 
     * @return Type Task type. Valid values:
<li>Transcode: Transcode</li>
<li>AnimatedGraphics: Animated image</li>
<li>SnapshotByTimeOffset: time point screenshot.</li>
<li>SampleSnapshot: sampled screenshot.</li>
<li>ImageSprites: sprite sheet</li>
<li>CoverBySnapshot: screencapturing for cover image.</li>
<li>AdaptiveDynamicStreaming: adaptive bitrate streaming.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Task type. Valid values:
<li>Transcode: Transcode</li>
<li>AnimatedGraphics: Animated image</li>
<li>SnapshotByTimeOffset: time point screenshot.</li>
<li>SampleSnapshot: sampled screenshot.</li>
<li>ImageSprites: sprite sheet</li>
<li>CoverBySnapshot: screencapturing for cover image.</li>
<li>AdaptiveDynamicStreaming: adaptive bitrate streaming.</li>
     * @param Type Task type. Valid values:
<li>Transcode: Transcode</li>
<li>AnimatedGraphics: Animated image</li>
<li>SnapshotByTimeOffset: time point screenshot.</li>
<li>SampleSnapshot: sampled screenshot.</li>
<li>ImageSprites: sprite sheet</li>
<li>CoverBySnapshot: screencapturing for cover image.</li>
<li>AdaptiveDynamicStreaming: adaptive bitrate streaming.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get  
     * @return TranscodeTask 
     */
    public MediaProcessTaskTranscodeResult getTranscodeTask() {
        return this.TranscodeTask;
    }

    /**
     * Set 
     * @param TranscodeTask 
     */
    public void setTranscodeTask(MediaProcessTaskTranscodeResult TranscodeTask) {
        this.TranscodeTask = TranscodeTask;
    }

    /**
     * Get  
     * @return AnimatedGraphicTask 
     */
    public MediaProcessTaskAnimatedGraphicResult getAnimatedGraphicTask() {
        return this.AnimatedGraphicTask;
    }

    /**
     * Set 
     * @param AnimatedGraphicTask 
     */
    public void setAnimatedGraphicTask(MediaProcessTaskAnimatedGraphicResult AnimatedGraphicTask) {
        this.AnimatedGraphicTask = AnimatedGraphicTask;
    }

    /**
     * Get  
     * @return SnapshotByTimeOffsetTask 
     */
    public MediaProcessTaskSnapshotByTimeOffsetResult getSnapshotByTimeOffsetTask() {
        return this.SnapshotByTimeOffsetTask;
    }

    /**
     * Set 
     * @param SnapshotByTimeOffsetTask 
     */
    public void setSnapshotByTimeOffsetTask(MediaProcessTaskSnapshotByTimeOffsetResult SnapshotByTimeOffsetTask) {
        this.SnapshotByTimeOffsetTask = SnapshotByTimeOffsetTask;
    }

    /**
     * Get  
     * @return SampleSnapshotTask 
     */
    public MediaProcessTaskSampleSnapshotResult getSampleSnapshotTask() {
        return this.SampleSnapshotTask;
    }

    /**
     * Set 
     * @param SampleSnapshotTask 
     */
    public void setSampleSnapshotTask(MediaProcessTaskSampleSnapshotResult SampleSnapshotTask) {
        this.SampleSnapshotTask = SampleSnapshotTask;
    }

    /**
     * Get  
     * @return ImageSpriteTask 
     */
    public MediaProcessTaskImageSpriteResult getImageSpriteTask() {
        return this.ImageSpriteTask;
    }

    /**
     * Set 
     * @param ImageSpriteTask 
     */
    public void setImageSpriteTask(MediaProcessTaskImageSpriteResult ImageSpriteTask) {
        this.ImageSpriteTask = ImageSpriteTask;
    }

    /**
     * Get  
     * @return AdaptiveDynamicStreamingTask 
     */
    public MediaProcessTaskAdaptiveDynamicStreamingResult getAdaptiveDynamicStreamingTask() {
        return this.AdaptiveDynamicStreamingTask;
    }

    /**
     * Set 
     * @param AdaptiveDynamicStreamingTask 
     */
    public void setAdaptiveDynamicStreamingTask(MediaProcessTaskAdaptiveDynamicStreamingResult AdaptiveDynamicStreamingTask) {
        this.AdaptiveDynamicStreamingTask = AdaptiveDynamicStreamingTask;
    }

    public MediaProcessTaskResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaProcessTaskResult(MediaProcessTaskResult source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.TranscodeTask != null) {
            this.TranscodeTask = new MediaProcessTaskTranscodeResult(source.TranscodeTask);
        }
        if (source.AnimatedGraphicTask != null) {
            this.AnimatedGraphicTask = new MediaProcessTaskAnimatedGraphicResult(source.AnimatedGraphicTask);
        }
        if (source.SnapshotByTimeOffsetTask != null) {
            this.SnapshotByTimeOffsetTask = new MediaProcessTaskSnapshotByTimeOffsetResult(source.SnapshotByTimeOffsetTask);
        }
        if (source.SampleSnapshotTask != null) {
            this.SampleSnapshotTask = new MediaProcessTaskSampleSnapshotResult(source.SampleSnapshotTask);
        }
        if (source.ImageSpriteTask != null) {
            this.ImageSpriteTask = new MediaProcessTaskImageSpriteResult(source.ImageSpriteTask);
        }
        if (source.AdaptiveDynamicStreamingTask != null) {
            this.AdaptiveDynamicStreamingTask = new MediaProcessTaskAdaptiveDynamicStreamingResult(source.AdaptiveDynamicStreamingTask);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "TranscodeTask.", this.TranscodeTask);
        this.setParamObj(map, prefix + "AnimatedGraphicTask.", this.AnimatedGraphicTask);
        this.setParamObj(map, prefix + "SnapshotByTimeOffsetTask.", this.SnapshotByTimeOffsetTask);
        this.setParamObj(map, prefix + "SampleSnapshotTask.", this.SampleSnapshotTask);
        this.setParamObj(map, prefix + "ImageSpriteTask.", this.ImageSpriteTask);
        this.setParamObj(map, prefix + "AdaptiveDynamicStreamingTask.", this.AdaptiveDynamicStreamingTask);

    }
}


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

public class MediaProcessTaskResult extends AbstractModel {

    /**
    * Task type. Valid values:
<li>Transcode: transcode</li>
<li>AnimatedGraphics: animated image</li>
<li>SnapshotByTimeOffset: time point screenshot.</li>
<li>SampleSnapshot: sampled screenshot.</li>
<li>ImageSprites: sprite sheets</li>
<li>CoverBySnapshot: screencapturing for cover image</li>
<li>AdaptiveDynamicStreaming: adaptive bitrate streaming</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Query result of the video transcoding task. Valid when the task type is `Transcode`.
    */
    @SerializedName("TranscodeTask")
    @Expose
    private MediaProcessTaskTranscodeResult TranscodeTask;

    /**
    * Query result of the video-to-animated-image task. Valid when the task type is `AnimatedGraphics`.
    */
    @SerializedName("AnimatedGraphicTask")
    @Expose
    private MediaProcessTaskAnimatedGraphicResult AnimatedGraphicTask;

    /**
    * Query result of a video time point screenshot task. Valid when the task type is `SnapshotByTimeOffset`.
    */
    @SerializedName("SnapshotByTimeOffsetTask")
    @Expose
    private MediaProcessTaskSnapshotByTimeOffsetResult SnapshotByTimeOffsetTask;

    /**
    * Query result of the video sampling screenshot task. Valid when the task type is `SampleSnapshot`.
    */
    @SerializedName("SampleSnapshotTask")
    @Expose
    private MediaProcessTaskSampleSnapshotResult SampleSnapshotTask;

    /**
    * Query result of an image sprite task. Valid when the task type is `ImageSprite`.
    */
    @SerializedName("ImageSpriteTask")
    @Expose
    private MediaProcessTaskImageSpriteResult ImageSpriteTask;

    /**
    * Query result of the video screencapturing for cover image task. Valid when the task type is `CoverBySnapshot`.
    */
    @SerializedName("CoverBySnapshotTask")
    @Expose
    private MediaProcessTaskCoverBySnapshotResult CoverBySnapshotTask;

    /**
    * Query result of the video to adaptive streaming task. Valid when the task type is `AdaptiveDynamicStreaming`.
    */
    @SerializedName("AdaptiveDynamicStreamingTask")
    @Expose
    private MediaProcessTaskAdaptiveDynamicStreamingResult AdaptiveDynamicStreamingTask;

    /**
     * Get Task type. Valid values:
<li>Transcode: transcode</li>
<li>AnimatedGraphics: animated image</li>
<li>SnapshotByTimeOffset: time point screenshot.</li>
<li>SampleSnapshot: sampled screenshot.</li>
<li>ImageSprites: sprite sheets</li>
<li>CoverBySnapshot: screencapturing for cover image</li>
<li>AdaptiveDynamicStreaming: adaptive bitrate streaming</li> 
     * @return Type Task type. Valid values:
<li>Transcode: transcode</li>
<li>AnimatedGraphics: animated image</li>
<li>SnapshotByTimeOffset: time point screenshot.</li>
<li>SampleSnapshot: sampled screenshot.</li>
<li>ImageSprites: sprite sheets</li>
<li>CoverBySnapshot: screencapturing for cover image</li>
<li>AdaptiveDynamicStreaming: adaptive bitrate streaming</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Task type. Valid values:
<li>Transcode: transcode</li>
<li>AnimatedGraphics: animated image</li>
<li>SnapshotByTimeOffset: time point screenshot.</li>
<li>SampleSnapshot: sampled screenshot.</li>
<li>ImageSprites: sprite sheets</li>
<li>CoverBySnapshot: screencapturing for cover image</li>
<li>AdaptiveDynamicStreaming: adaptive bitrate streaming</li>
     * @param Type Task type. Valid values:
<li>Transcode: transcode</li>
<li>AnimatedGraphics: animated image</li>
<li>SnapshotByTimeOffset: time point screenshot.</li>
<li>SampleSnapshot: sampled screenshot.</li>
<li>ImageSprites: sprite sheets</li>
<li>CoverBySnapshot: screencapturing for cover image</li>
<li>AdaptiveDynamicStreaming: adaptive bitrate streaming</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Query result of the video transcoding task. Valid when the task type is `Transcode`. 
     * @return TranscodeTask Query result of the video transcoding task. Valid when the task type is `Transcode`.
     */
    public MediaProcessTaskTranscodeResult getTranscodeTask() {
        return this.TranscodeTask;
    }

    /**
     * Set Query result of the video transcoding task. Valid when the task type is `Transcode`.
     * @param TranscodeTask Query result of the video transcoding task. Valid when the task type is `Transcode`.
     */
    public void setTranscodeTask(MediaProcessTaskTranscodeResult TranscodeTask) {
        this.TranscodeTask = TranscodeTask;
    }

    /**
     * Get Query result of the video-to-animated-image task. Valid when the task type is `AnimatedGraphics`. 
     * @return AnimatedGraphicTask Query result of the video-to-animated-image task. Valid when the task type is `AnimatedGraphics`.
     */
    public MediaProcessTaskAnimatedGraphicResult getAnimatedGraphicTask() {
        return this.AnimatedGraphicTask;
    }

    /**
     * Set Query result of the video-to-animated-image task. Valid when the task type is `AnimatedGraphics`.
     * @param AnimatedGraphicTask Query result of the video-to-animated-image task. Valid when the task type is `AnimatedGraphics`.
     */
    public void setAnimatedGraphicTask(MediaProcessTaskAnimatedGraphicResult AnimatedGraphicTask) {
        this.AnimatedGraphicTask = AnimatedGraphicTask;
    }

    /**
     * Get Query result of a video time point screenshot task. Valid when the task type is `SnapshotByTimeOffset`. 
     * @return SnapshotByTimeOffsetTask Query result of a video time point screenshot task. Valid when the task type is `SnapshotByTimeOffset`.
     */
    public MediaProcessTaskSnapshotByTimeOffsetResult getSnapshotByTimeOffsetTask() {
        return this.SnapshotByTimeOffsetTask;
    }

    /**
     * Set Query result of a video time point screenshot task. Valid when the task type is `SnapshotByTimeOffset`.
     * @param SnapshotByTimeOffsetTask Query result of a video time point screenshot task. Valid when the task type is `SnapshotByTimeOffset`.
     */
    public void setSnapshotByTimeOffsetTask(MediaProcessTaskSnapshotByTimeOffsetResult SnapshotByTimeOffsetTask) {
        this.SnapshotByTimeOffsetTask = SnapshotByTimeOffsetTask;
    }

    /**
     * Get Query result of the video sampling screenshot task. Valid when the task type is `SampleSnapshot`. 
     * @return SampleSnapshotTask Query result of the video sampling screenshot task. Valid when the task type is `SampleSnapshot`.
     */
    public MediaProcessTaskSampleSnapshotResult getSampleSnapshotTask() {
        return this.SampleSnapshotTask;
    }

    /**
     * Set Query result of the video sampling screenshot task. Valid when the task type is `SampleSnapshot`.
     * @param SampleSnapshotTask Query result of the video sampling screenshot task. Valid when the task type is `SampleSnapshot`.
     */
    public void setSampleSnapshotTask(MediaProcessTaskSampleSnapshotResult SampleSnapshotTask) {
        this.SampleSnapshotTask = SampleSnapshotTask;
    }

    /**
     * Get Query result of an image sprite task. Valid when the task type is `ImageSprite`. 
     * @return ImageSpriteTask Query result of an image sprite task. Valid when the task type is `ImageSprite`.
     */
    public MediaProcessTaskImageSpriteResult getImageSpriteTask() {
        return this.ImageSpriteTask;
    }

    /**
     * Set Query result of an image sprite task. Valid when the task type is `ImageSprite`.
     * @param ImageSpriteTask Query result of an image sprite task. Valid when the task type is `ImageSprite`.
     */
    public void setImageSpriteTask(MediaProcessTaskImageSpriteResult ImageSpriteTask) {
        this.ImageSpriteTask = ImageSpriteTask;
    }

    /**
     * Get Query result of the video screencapturing for cover image task. Valid when the task type is `CoverBySnapshot`. 
     * @return CoverBySnapshotTask Query result of the video screencapturing for cover image task. Valid when the task type is `CoverBySnapshot`.
     */
    public MediaProcessTaskCoverBySnapshotResult getCoverBySnapshotTask() {
        return this.CoverBySnapshotTask;
    }

    /**
     * Set Query result of the video screencapturing for cover image task. Valid when the task type is `CoverBySnapshot`.
     * @param CoverBySnapshotTask Query result of the video screencapturing for cover image task. Valid when the task type is `CoverBySnapshot`.
     */
    public void setCoverBySnapshotTask(MediaProcessTaskCoverBySnapshotResult CoverBySnapshotTask) {
        this.CoverBySnapshotTask = CoverBySnapshotTask;
    }

    /**
     * Get Query result of the video to adaptive streaming task. Valid when the task type is `AdaptiveDynamicStreaming`. 
     * @return AdaptiveDynamicStreamingTask Query result of the video to adaptive streaming task. Valid when the task type is `AdaptiveDynamicStreaming`.
     */
    public MediaProcessTaskAdaptiveDynamicStreamingResult getAdaptiveDynamicStreamingTask() {
        return this.AdaptiveDynamicStreamingTask;
    }

    /**
     * Set Query result of the video to adaptive streaming task. Valid when the task type is `AdaptiveDynamicStreaming`.
     * @param AdaptiveDynamicStreamingTask Query result of the video to adaptive streaming task. Valid when the task type is `AdaptiveDynamicStreaming`.
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
        if (source.CoverBySnapshotTask != null) {
            this.CoverBySnapshotTask = new MediaProcessTaskCoverBySnapshotResult(source.CoverBySnapshotTask);
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
        this.setParamObj(map, prefix + "CoverBySnapshotTask.", this.CoverBySnapshotTask);
        this.setParamObj(map, prefix + "AdaptiveDynamicStreamingTask.", this.AdaptiveDynamicStreamingTask);

    }
}


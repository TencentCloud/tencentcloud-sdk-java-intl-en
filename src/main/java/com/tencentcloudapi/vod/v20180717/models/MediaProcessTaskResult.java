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

public class MediaProcessTaskResult extends AbstractModel{

    /**
    * Task type. Valid values:
<li>Transcode: transcoding</li>
<li>AnimatedGraphics: animated image generating</li>
<li>SnapshotByTimeOffset: time point screencapturing</li>
<li>SampleSnapshot: sampled screencapturing</li>
<li>ImageSprites: image sprite generating</li>
<li>CoverBySnapshot: Screencapturing for cover image</li>
<li>AdaptiveDynamicStreaming: adaptive bitrate streaming</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Query result of transcoding task, which is valid when task type is `Transcode`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TranscodeTask")
    @Expose
    private MediaProcessTaskTranscodeResult TranscodeTask;

    /**
    * Query result of animated image generating task, which is valid when task type is `AnimatedGraphics`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AnimatedGraphicTask")
    @Expose
    private MediaProcessTaskAnimatedGraphicResult AnimatedGraphicTask;

    /**
    * Query result of time point screencapturing task, which is valid when task type is `SnapshotByTimeOffset`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SnapshotByTimeOffsetTask")
    @Expose
    private MediaProcessTaskSnapshotByTimeOffsetResult SnapshotByTimeOffsetTask;

    /**
    * Query result of sampled screencapturing task, which is valid when task type is `SampleSnapshot`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SampleSnapshotTask")
    @Expose
    private MediaProcessTaskSampleSnapshotResult SampleSnapshotTask;

    /**
    * Query result of image sprite generating task, which is valid when task type is `ImageSprite`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ImageSpriteTask")
    @Expose
    private MediaProcessTaskImageSpriteResult ImageSpriteTask;

    /**
    * Query result of cover generating task, which is valid if task type is `CoverBySnapshot`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CoverBySnapshotTask")
    @Expose
    private MediaProcessTaskCoverBySnapshotResult CoverBySnapshotTask;

    /**
    * Query result of adaptive bitrate streaming, which is valid if task type is `AdaptiveDynamicStreaming`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AdaptiveDynamicStreamingTask")
    @Expose
    private MediaProcessTaskAdaptiveDynamicStreamingResult AdaptiveDynamicStreamingTask;

    /**
     * Get Task type. Valid values:
<li>Transcode: transcoding</li>
<li>AnimatedGraphics: animated image generating</li>
<li>SnapshotByTimeOffset: time point screencapturing</li>
<li>SampleSnapshot: sampled screencapturing</li>
<li>ImageSprites: image sprite generating</li>
<li>CoverBySnapshot: Screencapturing for cover image</li>
<li>AdaptiveDynamicStreaming: adaptive bitrate streaming</li> 
     * @return Type Task type. Valid values:
<li>Transcode: transcoding</li>
<li>AnimatedGraphics: animated image generating</li>
<li>SnapshotByTimeOffset: time point screencapturing</li>
<li>SampleSnapshot: sampled screencapturing</li>
<li>ImageSprites: image sprite generating</li>
<li>CoverBySnapshot: Screencapturing for cover image</li>
<li>AdaptiveDynamicStreaming: adaptive bitrate streaming</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Task type. Valid values:
<li>Transcode: transcoding</li>
<li>AnimatedGraphics: animated image generating</li>
<li>SnapshotByTimeOffset: time point screencapturing</li>
<li>SampleSnapshot: sampled screencapturing</li>
<li>ImageSprites: image sprite generating</li>
<li>CoverBySnapshot: Screencapturing for cover image</li>
<li>AdaptiveDynamicStreaming: adaptive bitrate streaming</li>
     * @param Type Task type. Valid values:
<li>Transcode: transcoding</li>
<li>AnimatedGraphics: animated image generating</li>
<li>SnapshotByTimeOffset: time point screencapturing</li>
<li>SampleSnapshot: sampled screencapturing</li>
<li>ImageSprites: image sprite generating</li>
<li>CoverBySnapshot: Screencapturing for cover image</li>
<li>AdaptiveDynamicStreaming: adaptive bitrate streaming</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Query result of transcoding task, which is valid when task type is `Transcode`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TranscodeTask Query result of transcoding task, which is valid when task type is `Transcode`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public MediaProcessTaskTranscodeResult getTranscodeTask() {
        return this.TranscodeTask;
    }

    /**
     * Set Query result of transcoding task, which is valid when task type is `Transcode`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TranscodeTask Query result of transcoding task, which is valid when task type is `Transcode`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTranscodeTask(MediaProcessTaskTranscodeResult TranscodeTask) {
        this.TranscodeTask = TranscodeTask;
    }

    /**
     * Get Query result of animated image generating task, which is valid when task type is `AnimatedGraphics`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AnimatedGraphicTask Query result of animated image generating task, which is valid when task type is `AnimatedGraphics`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public MediaProcessTaskAnimatedGraphicResult getAnimatedGraphicTask() {
        return this.AnimatedGraphicTask;
    }

    /**
     * Set Query result of animated image generating task, which is valid when task type is `AnimatedGraphics`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AnimatedGraphicTask Query result of animated image generating task, which is valid when task type is `AnimatedGraphics`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAnimatedGraphicTask(MediaProcessTaskAnimatedGraphicResult AnimatedGraphicTask) {
        this.AnimatedGraphicTask = AnimatedGraphicTask;
    }

    /**
     * Get Query result of time point screencapturing task, which is valid when task type is `SnapshotByTimeOffset`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SnapshotByTimeOffsetTask Query result of time point screencapturing task, which is valid when task type is `SnapshotByTimeOffset`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public MediaProcessTaskSnapshotByTimeOffsetResult getSnapshotByTimeOffsetTask() {
        return this.SnapshotByTimeOffsetTask;
    }

    /**
     * Set Query result of time point screencapturing task, which is valid when task type is `SnapshotByTimeOffset`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SnapshotByTimeOffsetTask Query result of time point screencapturing task, which is valid when task type is `SnapshotByTimeOffset`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSnapshotByTimeOffsetTask(MediaProcessTaskSnapshotByTimeOffsetResult SnapshotByTimeOffsetTask) {
        this.SnapshotByTimeOffsetTask = SnapshotByTimeOffsetTask;
    }

    /**
     * Get Query result of sampled screencapturing task, which is valid when task type is `SampleSnapshot`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SampleSnapshotTask Query result of sampled screencapturing task, which is valid when task type is `SampleSnapshot`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public MediaProcessTaskSampleSnapshotResult getSampleSnapshotTask() {
        return this.SampleSnapshotTask;
    }

    /**
     * Set Query result of sampled screencapturing task, which is valid when task type is `SampleSnapshot`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SampleSnapshotTask Query result of sampled screencapturing task, which is valid when task type is `SampleSnapshot`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSampleSnapshotTask(MediaProcessTaskSampleSnapshotResult SampleSnapshotTask) {
        this.SampleSnapshotTask = SampleSnapshotTask;
    }

    /**
     * Get Query result of image sprite generating task, which is valid when task type is `ImageSprite`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ImageSpriteTask Query result of image sprite generating task, which is valid when task type is `ImageSprite`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public MediaProcessTaskImageSpriteResult getImageSpriteTask() {
        return this.ImageSpriteTask;
    }

    /**
     * Set Query result of image sprite generating task, which is valid when task type is `ImageSprite`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ImageSpriteTask Query result of image sprite generating task, which is valid when task type is `ImageSprite`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setImageSpriteTask(MediaProcessTaskImageSpriteResult ImageSpriteTask) {
        this.ImageSpriteTask = ImageSpriteTask;
    }

    /**
     * Get Query result of cover generating task, which is valid if task type is `CoverBySnapshot`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CoverBySnapshotTask Query result of cover generating task, which is valid if task type is `CoverBySnapshot`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public MediaProcessTaskCoverBySnapshotResult getCoverBySnapshotTask() {
        return this.CoverBySnapshotTask;
    }

    /**
     * Set Query result of cover generating task, which is valid if task type is `CoverBySnapshot`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CoverBySnapshotTask Query result of cover generating task, which is valid if task type is `CoverBySnapshot`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCoverBySnapshotTask(MediaProcessTaskCoverBySnapshotResult CoverBySnapshotTask) {
        this.CoverBySnapshotTask = CoverBySnapshotTask;
    }

    /**
     * Get Query result of adaptive bitrate streaming, which is valid if task type is `AdaptiveDynamicStreaming`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AdaptiveDynamicStreamingTask Query result of adaptive bitrate streaming, which is valid if task type is `AdaptiveDynamicStreaming`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public MediaProcessTaskAdaptiveDynamicStreamingResult getAdaptiveDynamicStreamingTask() {
        return this.AdaptiveDynamicStreamingTask;
    }

    /**
     * Set Query result of adaptive bitrate streaming, which is valid if task type is `AdaptiveDynamicStreaming`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AdaptiveDynamicStreamingTask Query result of adaptive bitrate streaming, which is valid if task type is `AdaptiveDynamicStreaming`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAdaptiveDynamicStreamingTask(MediaProcessTaskAdaptiveDynamicStreamingResult AdaptiveDynamicStreamingTask) {
        this.AdaptiveDynamicStreamingTask = AdaptiveDynamicStreamingTask;
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


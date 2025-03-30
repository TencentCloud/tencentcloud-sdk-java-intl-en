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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ActivityResItem extends AbstractModel {

    /**
    * The result of a transcoding task.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TranscodeTask")
    @Expose
    private MediaProcessTaskTranscodeResult TranscodeTask;

    /**
    * The result of an animated image generating task.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AnimatedGraphicTask")
    @Expose
    private MediaProcessTaskAnimatedGraphicResult AnimatedGraphicTask;

    /**
    * The result of a time point screenshot task.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SnapshotByTimeOffsetTask")
    @Expose
    private MediaProcessTaskSnapshotByTimeOffsetResult SnapshotByTimeOffsetTask;

    /**
    * The result of a sampled screenshot task.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SampleSnapshotTask")
    @Expose
    private MediaProcessTaskSampleSnapshotResult SampleSnapshotTask;

    /**
    * The result of an image sprite task.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ImageSpriteTask")
    @Expose
    private MediaProcessTaskImageSpriteResult ImageSpriteTask;

    /**
    * The result of an adaptive bitrate streaming task.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AdaptiveDynamicStreamingTask")
    @Expose
    private MediaProcessTaskAdaptiveDynamicStreamingResult AdaptiveDynamicStreamingTask;

    /**
    * The result of a content recognition task.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RecognitionTask")
    @Expose
    private ScheduleRecognitionTaskResult RecognitionTask;

    /**
    * The result of a content moderation task.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReviewTask")
    @Expose
    private ScheduleReviewTaskResult ReviewTask;

    /**
    * The result of a content analysis task.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AnalysisTask")
    @Expose
    private ScheduleAnalysisTaskResult AnalysisTask;

    /**
    * Media quality inspection task output.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("QualityControlTask")
    @Expose
    private ScheduleQualityControlTaskResult QualityControlTask;

    /**
    * Smart subtitle task output.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SmartSubtitlesTask")
    @Expose
    private ScheduleSmartSubtitleTaskResult SmartSubtitlesTask;

    /**
     * Get The result of a transcoding task.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TranscodeTask The result of a transcoding task.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MediaProcessTaskTranscodeResult getTranscodeTask() {
        return this.TranscodeTask;
    }

    /**
     * Set The result of a transcoding task.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TranscodeTask The result of a transcoding task.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTranscodeTask(MediaProcessTaskTranscodeResult TranscodeTask) {
        this.TranscodeTask = TranscodeTask;
    }

    /**
     * Get The result of an animated image generating task.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AnimatedGraphicTask The result of an animated image generating task.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MediaProcessTaskAnimatedGraphicResult getAnimatedGraphicTask() {
        return this.AnimatedGraphicTask;
    }

    /**
     * Set The result of an animated image generating task.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AnimatedGraphicTask The result of an animated image generating task.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAnimatedGraphicTask(MediaProcessTaskAnimatedGraphicResult AnimatedGraphicTask) {
        this.AnimatedGraphicTask = AnimatedGraphicTask;
    }

    /**
     * Get The result of a time point screenshot task.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SnapshotByTimeOffsetTask The result of a time point screenshot task.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MediaProcessTaskSnapshotByTimeOffsetResult getSnapshotByTimeOffsetTask() {
        return this.SnapshotByTimeOffsetTask;
    }

    /**
     * Set The result of a time point screenshot task.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SnapshotByTimeOffsetTask The result of a time point screenshot task.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSnapshotByTimeOffsetTask(MediaProcessTaskSnapshotByTimeOffsetResult SnapshotByTimeOffsetTask) {
        this.SnapshotByTimeOffsetTask = SnapshotByTimeOffsetTask;
    }

    /**
     * Get The result of a sampled screenshot task.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SampleSnapshotTask The result of a sampled screenshot task.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MediaProcessTaskSampleSnapshotResult getSampleSnapshotTask() {
        return this.SampleSnapshotTask;
    }

    /**
     * Set The result of a sampled screenshot task.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SampleSnapshotTask The result of a sampled screenshot task.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSampleSnapshotTask(MediaProcessTaskSampleSnapshotResult SampleSnapshotTask) {
        this.SampleSnapshotTask = SampleSnapshotTask;
    }

    /**
     * Get The result of an image sprite task.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ImageSpriteTask The result of an image sprite task.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MediaProcessTaskImageSpriteResult getImageSpriteTask() {
        return this.ImageSpriteTask;
    }

    /**
     * Set The result of an image sprite task.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ImageSpriteTask The result of an image sprite task.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setImageSpriteTask(MediaProcessTaskImageSpriteResult ImageSpriteTask) {
        this.ImageSpriteTask = ImageSpriteTask;
    }

    /**
     * Get The result of an adaptive bitrate streaming task.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AdaptiveDynamicStreamingTask The result of an adaptive bitrate streaming task.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MediaProcessTaskAdaptiveDynamicStreamingResult getAdaptiveDynamicStreamingTask() {
        return this.AdaptiveDynamicStreamingTask;
    }

    /**
     * Set The result of an adaptive bitrate streaming task.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AdaptiveDynamicStreamingTask The result of an adaptive bitrate streaming task.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAdaptiveDynamicStreamingTask(MediaProcessTaskAdaptiveDynamicStreamingResult AdaptiveDynamicStreamingTask) {
        this.AdaptiveDynamicStreamingTask = AdaptiveDynamicStreamingTask;
    }

    /**
     * Get The result of a content recognition task.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RecognitionTask The result of a content recognition task.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ScheduleRecognitionTaskResult getRecognitionTask() {
        return this.RecognitionTask;
    }

    /**
     * Set The result of a content recognition task.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RecognitionTask The result of a content recognition task.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRecognitionTask(ScheduleRecognitionTaskResult RecognitionTask) {
        this.RecognitionTask = RecognitionTask;
    }

    /**
     * Get The result of a content moderation task.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ReviewTask The result of a content moderation task.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ScheduleReviewTaskResult getReviewTask() {
        return this.ReviewTask;
    }

    /**
     * Set The result of a content moderation task.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ReviewTask The result of a content moderation task.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReviewTask(ScheduleReviewTaskResult ReviewTask) {
        this.ReviewTask = ReviewTask;
    }

    /**
     * Get The result of a content analysis task.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AnalysisTask The result of a content analysis task.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ScheduleAnalysisTaskResult getAnalysisTask() {
        return this.AnalysisTask;
    }

    /**
     * Set The result of a content analysis task.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AnalysisTask The result of a content analysis task.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAnalysisTask(ScheduleAnalysisTaskResult AnalysisTask) {
        this.AnalysisTask = AnalysisTask;
    }

    /**
     * Get Media quality inspection task output.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return QualityControlTask Media quality inspection task output.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ScheduleQualityControlTaskResult getQualityControlTask() {
        return this.QualityControlTask;
    }

    /**
     * Set Media quality inspection task output.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param QualityControlTask Media quality inspection task output.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setQualityControlTask(ScheduleQualityControlTaskResult QualityControlTask) {
        this.QualityControlTask = QualityControlTask;
    }

    /**
     * Get Smart subtitle task output.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SmartSubtitlesTask Smart subtitle task output.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public ScheduleSmartSubtitleTaskResult getSmartSubtitlesTask() {
        return this.SmartSubtitlesTask;
    }

    /**
     * Set Smart subtitle task output.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SmartSubtitlesTask Smart subtitle task output.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSmartSubtitlesTask(ScheduleSmartSubtitleTaskResult SmartSubtitlesTask) {
        this.SmartSubtitlesTask = SmartSubtitlesTask;
    }

    public ActivityResItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ActivityResItem(ActivityResItem source) {
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
        if (source.RecognitionTask != null) {
            this.RecognitionTask = new ScheduleRecognitionTaskResult(source.RecognitionTask);
        }
        if (source.ReviewTask != null) {
            this.ReviewTask = new ScheduleReviewTaskResult(source.ReviewTask);
        }
        if (source.AnalysisTask != null) {
            this.AnalysisTask = new ScheduleAnalysisTaskResult(source.AnalysisTask);
        }
        if (source.QualityControlTask != null) {
            this.QualityControlTask = new ScheduleQualityControlTaskResult(source.QualityControlTask);
        }
        if (source.SmartSubtitlesTask != null) {
            this.SmartSubtitlesTask = new ScheduleSmartSubtitleTaskResult(source.SmartSubtitlesTask);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "TranscodeTask.", this.TranscodeTask);
        this.setParamObj(map, prefix + "AnimatedGraphicTask.", this.AnimatedGraphicTask);
        this.setParamObj(map, prefix + "SnapshotByTimeOffsetTask.", this.SnapshotByTimeOffsetTask);
        this.setParamObj(map, prefix + "SampleSnapshotTask.", this.SampleSnapshotTask);
        this.setParamObj(map, prefix + "ImageSpriteTask.", this.ImageSpriteTask);
        this.setParamObj(map, prefix + "AdaptiveDynamicStreamingTask.", this.AdaptiveDynamicStreamingTask);
        this.setParamObj(map, prefix + "RecognitionTask.", this.RecognitionTask);
        this.setParamObj(map, prefix + "ReviewTask.", this.ReviewTask);
        this.setParamObj(map, prefix + "AnalysisTask.", this.AnalysisTask);
        this.setParamObj(map, prefix + "QualityControlTask.", this.QualityControlTask);
        this.setParamObj(map, prefix + "SmartSubtitlesTask.", this.SmartSubtitlesTask);

    }
}


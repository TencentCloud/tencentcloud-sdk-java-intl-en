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

public class ActivityResItem extends AbstractModel {

    /**
    * <p>Transcoding task output</p>
    */
    @SerializedName("TranscodeTask")
    @Expose
    private MediaProcessTaskTranscodeResult TranscodeTask;

    /**
    * <p>Output of rotating image tasks</p>
    */
    @SerializedName("AnimatedGraphicTask")
    @Expose
    private MediaProcessTaskAnimatedGraphicResult AnimatedGraphicTask;

    /**
    * <p>Time point screenshot task output</p>
    */
    @SerializedName("SnapshotByTimeOffsetTask")
    @Expose
    private MediaProcessTaskSnapshotByTimeOffsetResult SnapshotByTimeOffsetTask;

    /**
    * <p>Output of sampling screenshot task</p>
    */
    @SerializedName("SampleSnapshotTask")
    @Expose
    private MediaProcessTaskSampleSnapshotResult SampleSnapshotTask;

    /**
    * <p>Image sprite output</p>
    */
    @SerializedName("ImageSpriteTask")
    @Expose
    private MediaProcessTaskImageSpriteResult ImageSpriteTask;

    /**
    * <p>Adaptive bitrate streaming task output</p>
    */
    @SerializedName("AdaptiveDynamicStreamingTask")
    @Expose
    private MediaProcessTaskAdaptiveDynamicStreamingResult AdaptiveDynamicStreamingTask;

    /**
    * <p>Identification task output</p>
    */
    @SerializedName("RecognitionTask")
    @Expose
    private ScheduleRecognitionTaskResult RecognitionTask;

    /**
    * <p>Review task output</p>
    */
    @SerializedName("ReviewTask")
    @Expose
    private ScheduleReviewTaskResult ReviewTask;

    /**
    * <p>Analysis task output</p>
    */
    @SerializedName("AnalysisTask")
    @Expose
    private ScheduleAnalysisTaskResult AnalysisTask;

    /**
    * <p>Media quality inspection task output</p>
    */
    @SerializedName("QualityControlTask")
    @Expose
    private ScheduleQualityControlTaskResult QualityControlTask;

    /**
    * <p>Conditional judgment task output</p>
    */
    @SerializedName("ExecRuleTask")
    @Expose
    private ScheduleExecRuleTaskResult ExecRuleTask;

    /**
    * <p>Smart subtitle task output</p>
    */
    @SerializedName("SmartSubtitlesTask")
    @Expose
    private ScheduleSmartSubtitleTaskResult SmartSubtitlesTask;

    /**
    * <p>Output of the intelligent erasure task</p>
    */
    @SerializedName("SmartEraseTask")
    @Expose
    private SmartEraseTaskResult SmartEraseTask;

    /**
    * <p>AI dubbing task output.</p>
    */
    @SerializedName("AIDubbingTask")
    @Expose
    private AIDubbingTaskResult AIDubbingTask;

    /**
     * Get <p>Transcoding task output</p> 
     * @return TranscodeTask <p>Transcoding task output</p>
     */
    public MediaProcessTaskTranscodeResult getTranscodeTask() {
        return this.TranscodeTask;
    }

    /**
     * Set <p>Transcoding task output</p>
     * @param TranscodeTask <p>Transcoding task output</p>
     */
    public void setTranscodeTask(MediaProcessTaskTranscodeResult TranscodeTask) {
        this.TranscodeTask = TranscodeTask;
    }

    /**
     * Get <p>Output of rotating image tasks</p> 
     * @return AnimatedGraphicTask <p>Output of rotating image tasks</p>
     */
    public MediaProcessTaskAnimatedGraphicResult getAnimatedGraphicTask() {
        return this.AnimatedGraphicTask;
    }

    /**
     * Set <p>Output of rotating image tasks</p>
     * @param AnimatedGraphicTask <p>Output of rotating image tasks</p>
     */
    public void setAnimatedGraphicTask(MediaProcessTaskAnimatedGraphicResult AnimatedGraphicTask) {
        this.AnimatedGraphicTask = AnimatedGraphicTask;
    }

    /**
     * Get <p>Time point screenshot task output</p> 
     * @return SnapshotByTimeOffsetTask <p>Time point screenshot task output</p>
     */
    public MediaProcessTaskSnapshotByTimeOffsetResult getSnapshotByTimeOffsetTask() {
        return this.SnapshotByTimeOffsetTask;
    }

    /**
     * Set <p>Time point screenshot task output</p>
     * @param SnapshotByTimeOffsetTask <p>Time point screenshot task output</p>
     */
    public void setSnapshotByTimeOffsetTask(MediaProcessTaskSnapshotByTimeOffsetResult SnapshotByTimeOffsetTask) {
        this.SnapshotByTimeOffsetTask = SnapshotByTimeOffsetTask;
    }

    /**
     * Get <p>Output of sampling screenshot task</p> 
     * @return SampleSnapshotTask <p>Output of sampling screenshot task</p>
     */
    public MediaProcessTaskSampleSnapshotResult getSampleSnapshotTask() {
        return this.SampleSnapshotTask;
    }

    /**
     * Set <p>Output of sampling screenshot task</p>
     * @param SampleSnapshotTask <p>Output of sampling screenshot task</p>
     */
    public void setSampleSnapshotTask(MediaProcessTaskSampleSnapshotResult SampleSnapshotTask) {
        this.SampleSnapshotTask = SampleSnapshotTask;
    }

    /**
     * Get <p>Image sprite output</p> 
     * @return ImageSpriteTask <p>Image sprite output</p>
     */
    public MediaProcessTaskImageSpriteResult getImageSpriteTask() {
        return this.ImageSpriteTask;
    }

    /**
     * Set <p>Image sprite output</p>
     * @param ImageSpriteTask <p>Image sprite output</p>
     */
    public void setImageSpriteTask(MediaProcessTaskImageSpriteResult ImageSpriteTask) {
        this.ImageSpriteTask = ImageSpriteTask;
    }

    /**
     * Get <p>Adaptive bitrate streaming task output</p> 
     * @return AdaptiveDynamicStreamingTask <p>Adaptive bitrate streaming task output</p>
     */
    public MediaProcessTaskAdaptiveDynamicStreamingResult getAdaptiveDynamicStreamingTask() {
        return this.AdaptiveDynamicStreamingTask;
    }

    /**
     * Set <p>Adaptive bitrate streaming task output</p>
     * @param AdaptiveDynamicStreamingTask <p>Adaptive bitrate streaming task output</p>
     */
    public void setAdaptiveDynamicStreamingTask(MediaProcessTaskAdaptiveDynamicStreamingResult AdaptiveDynamicStreamingTask) {
        this.AdaptiveDynamicStreamingTask = AdaptiveDynamicStreamingTask;
    }

    /**
     * Get <p>Identification task output</p> 
     * @return RecognitionTask <p>Identification task output</p>
     */
    public ScheduleRecognitionTaskResult getRecognitionTask() {
        return this.RecognitionTask;
    }

    /**
     * Set <p>Identification task output</p>
     * @param RecognitionTask <p>Identification task output</p>
     */
    public void setRecognitionTask(ScheduleRecognitionTaskResult RecognitionTask) {
        this.RecognitionTask = RecognitionTask;
    }

    /**
     * Get <p>Review task output</p> 
     * @return ReviewTask <p>Review task output</p>
     */
    public ScheduleReviewTaskResult getReviewTask() {
        return this.ReviewTask;
    }

    /**
     * Set <p>Review task output</p>
     * @param ReviewTask <p>Review task output</p>
     */
    public void setReviewTask(ScheduleReviewTaskResult ReviewTask) {
        this.ReviewTask = ReviewTask;
    }

    /**
     * Get <p>Analysis task output</p> 
     * @return AnalysisTask <p>Analysis task output</p>
     */
    public ScheduleAnalysisTaskResult getAnalysisTask() {
        return this.AnalysisTask;
    }

    /**
     * Set <p>Analysis task output</p>
     * @param AnalysisTask <p>Analysis task output</p>
     */
    public void setAnalysisTask(ScheduleAnalysisTaskResult AnalysisTask) {
        this.AnalysisTask = AnalysisTask;
    }

    /**
     * Get <p>Media quality inspection task output</p> 
     * @return QualityControlTask <p>Media quality inspection task output</p>
     */
    public ScheduleQualityControlTaskResult getQualityControlTask() {
        return this.QualityControlTask;
    }

    /**
     * Set <p>Media quality inspection task output</p>
     * @param QualityControlTask <p>Media quality inspection task output</p>
     */
    public void setQualityControlTask(ScheduleQualityControlTaskResult QualityControlTask) {
        this.QualityControlTask = QualityControlTask;
    }

    /**
     * Get <p>Conditional judgment task output</p> 
     * @return ExecRuleTask <p>Conditional judgment task output</p>
     */
    public ScheduleExecRuleTaskResult getExecRuleTask() {
        return this.ExecRuleTask;
    }

    /**
     * Set <p>Conditional judgment task output</p>
     * @param ExecRuleTask <p>Conditional judgment task output</p>
     */
    public void setExecRuleTask(ScheduleExecRuleTaskResult ExecRuleTask) {
        this.ExecRuleTask = ExecRuleTask;
    }

    /**
     * Get <p>Smart subtitle task output</p> 
     * @return SmartSubtitlesTask <p>Smart subtitle task output</p>
     */
    public ScheduleSmartSubtitleTaskResult getSmartSubtitlesTask() {
        return this.SmartSubtitlesTask;
    }

    /**
     * Set <p>Smart subtitle task output</p>
     * @param SmartSubtitlesTask <p>Smart subtitle task output</p>
     */
    public void setSmartSubtitlesTask(ScheduleSmartSubtitleTaskResult SmartSubtitlesTask) {
        this.SmartSubtitlesTask = SmartSubtitlesTask;
    }

    /**
     * Get <p>Output of the intelligent erasure task</p> 
     * @return SmartEraseTask <p>Output of the intelligent erasure task</p>
     */
    public SmartEraseTaskResult getSmartEraseTask() {
        return this.SmartEraseTask;
    }

    /**
     * Set <p>Output of the intelligent erasure task</p>
     * @param SmartEraseTask <p>Output of the intelligent erasure task</p>
     */
    public void setSmartEraseTask(SmartEraseTaskResult SmartEraseTask) {
        this.SmartEraseTask = SmartEraseTask;
    }

    /**
     * Get <p>AI dubbing task output.</p> 
     * @return AIDubbingTask <p>AI dubbing task output.</p>
     */
    public AIDubbingTaskResult getAIDubbingTask() {
        return this.AIDubbingTask;
    }

    /**
     * Set <p>AI dubbing task output.</p>
     * @param AIDubbingTask <p>AI dubbing task output.</p>
     */
    public void setAIDubbingTask(AIDubbingTaskResult AIDubbingTask) {
        this.AIDubbingTask = AIDubbingTask;
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
        if (source.ExecRuleTask != null) {
            this.ExecRuleTask = new ScheduleExecRuleTaskResult(source.ExecRuleTask);
        }
        if (source.SmartSubtitlesTask != null) {
            this.SmartSubtitlesTask = new ScheduleSmartSubtitleTaskResult(source.SmartSubtitlesTask);
        }
        if (source.SmartEraseTask != null) {
            this.SmartEraseTask = new SmartEraseTaskResult(source.SmartEraseTask);
        }
        if (source.AIDubbingTask != null) {
            this.AIDubbingTask = new AIDubbingTaskResult(source.AIDubbingTask);
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
        this.setParamObj(map, prefix + "ExecRuleTask.", this.ExecRuleTask);
        this.setParamObj(map, prefix + "SmartSubtitlesTask.", this.SmartSubtitlesTask);
        this.setParamObj(map, prefix + "SmartEraseTask.", this.SmartEraseTask);
        this.setParamObj(map, prefix + "AIDubbingTask.", this.AIDubbingTask);

    }
}


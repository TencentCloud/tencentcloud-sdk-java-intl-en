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

public class ActivityPara extends AbstractModel {

    /**
    * A transcoding task.
    */
    @SerializedName("TranscodeTask")
    @Expose
    private TranscodeTaskInput TranscodeTask;

    /**
    * An animated screenshot generation task.
    */
    @SerializedName("AnimatedGraphicTask")
    @Expose
    private AnimatedGraphicTaskInput AnimatedGraphicTask;

    /**
    * A time point screenshot task.
    */
    @SerializedName("SnapshotByTimeOffsetTask")
    @Expose
    private SnapshotByTimeOffsetTaskInput SnapshotByTimeOffsetTask;

    /**
    * A sampled screenshot task.
    */
    @SerializedName("SampleSnapshotTask")
    @Expose
    private SampleSnapshotTaskInput SampleSnapshotTask;

    /**
    * An image sprite screenshot task.
    */
    @SerializedName("ImageSpriteTask")
    @Expose
    private ImageSpriteTaskInput ImageSpriteTask;

    /**
    * An adaptive bitrate streaming task.
    */
    @SerializedName("AdaptiveDynamicStreamingTask")
    @Expose
    private AdaptiveDynamicStreamingTaskInput AdaptiveDynamicStreamingTask;

    /**
    * A content moderation task.
    */
    @SerializedName("AiContentReviewTask")
    @Expose
    private AiContentReviewTaskInput AiContentReviewTask;

    /**
    * A content analysis task.
    */
    @SerializedName("AiAnalysisTask")
    @Expose
    private AiAnalysisTaskInput AiAnalysisTask;

    /**
    * A content recognition task.
    */
    @SerializedName("AiRecognitionTask")
    @Expose
    private AiRecognitionTaskInput AiRecognitionTask;

    /**
    * Media quality inspection task.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("QualityControlTask")
    @Expose
    private AiQualityControlTaskInput QualityControlTask;

    /**
    * Conditional judgment of the task.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ExecRulesTask")
    @Expose
    private ExecRulesTask ExecRulesTask;

    /**
    * Smart subtitle task.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SmartSubtitlesTask")
    @Expose
    private SmartSubtitlesTaskInput SmartSubtitlesTask;

    /**
     * Get A transcoding task. 
     * @return TranscodeTask A transcoding task.
     */
    public TranscodeTaskInput getTranscodeTask() {
        return this.TranscodeTask;
    }

    /**
     * Set A transcoding task.
     * @param TranscodeTask A transcoding task.
     */
    public void setTranscodeTask(TranscodeTaskInput TranscodeTask) {
        this.TranscodeTask = TranscodeTask;
    }

    /**
     * Get An animated screenshot generation task. 
     * @return AnimatedGraphicTask An animated screenshot generation task.
     */
    public AnimatedGraphicTaskInput getAnimatedGraphicTask() {
        return this.AnimatedGraphicTask;
    }

    /**
     * Set An animated screenshot generation task.
     * @param AnimatedGraphicTask An animated screenshot generation task.
     */
    public void setAnimatedGraphicTask(AnimatedGraphicTaskInput AnimatedGraphicTask) {
        this.AnimatedGraphicTask = AnimatedGraphicTask;
    }

    /**
     * Get A time point screenshot task. 
     * @return SnapshotByTimeOffsetTask A time point screenshot task.
     */
    public SnapshotByTimeOffsetTaskInput getSnapshotByTimeOffsetTask() {
        return this.SnapshotByTimeOffsetTask;
    }

    /**
     * Set A time point screenshot task.
     * @param SnapshotByTimeOffsetTask A time point screenshot task.
     */
    public void setSnapshotByTimeOffsetTask(SnapshotByTimeOffsetTaskInput SnapshotByTimeOffsetTask) {
        this.SnapshotByTimeOffsetTask = SnapshotByTimeOffsetTask;
    }

    /**
     * Get A sampled screenshot task. 
     * @return SampleSnapshotTask A sampled screenshot task.
     */
    public SampleSnapshotTaskInput getSampleSnapshotTask() {
        return this.SampleSnapshotTask;
    }

    /**
     * Set A sampled screenshot task.
     * @param SampleSnapshotTask A sampled screenshot task.
     */
    public void setSampleSnapshotTask(SampleSnapshotTaskInput SampleSnapshotTask) {
        this.SampleSnapshotTask = SampleSnapshotTask;
    }

    /**
     * Get An image sprite screenshot task. 
     * @return ImageSpriteTask An image sprite screenshot task.
     */
    public ImageSpriteTaskInput getImageSpriteTask() {
        return this.ImageSpriteTask;
    }

    /**
     * Set An image sprite screenshot task.
     * @param ImageSpriteTask An image sprite screenshot task.
     */
    public void setImageSpriteTask(ImageSpriteTaskInput ImageSpriteTask) {
        this.ImageSpriteTask = ImageSpriteTask;
    }

    /**
     * Get An adaptive bitrate streaming task. 
     * @return AdaptiveDynamicStreamingTask An adaptive bitrate streaming task.
     */
    public AdaptiveDynamicStreamingTaskInput getAdaptiveDynamicStreamingTask() {
        return this.AdaptiveDynamicStreamingTask;
    }

    /**
     * Set An adaptive bitrate streaming task.
     * @param AdaptiveDynamicStreamingTask An adaptive bitrate streaming task.
     */
    public void setAdaptiveDynamicStreamingTask(AdaptiveDynamicStreamingTaskInput AdaptiveDynamicStreamingTask) {
        this.AdaptiveDynamicStreamingTask = AdaptiveDynamicStreamingTask;
    }

    /**
     * Get A content moderation task. 
     * @return AiContentReviewTask A content moderation task.
     */
    public AiContentReviewTaskInput getAiContentReviewTask() {
        return this.AiContentReviewTask;
    }

    /**
     * Set A content moderation task.
     * @param AiContentReviewTask A content moderation task.
     */
    public void setAiContentReviewTask(AiContentReviewTaskInput AiContentReviewTask) {
        this.AiContentReviewTask = AiContentReviewTask;
    }

    /**
     * Get A content analysis task. 
     * @return AiAnalysisTask A content analysis task.
     */
    public AiAnalysisTaskInput getAiAnalysisTask() {
        return this.AiAnalysisTask;
    }

    /**
     * Set A content analysis task.
     * @param AiAnalysisTask A content analysis task.
     */
    public void setAiAnalysisTask(AiAnalysisTaskInput AiAnalysisTask) {
        this.AiAnalysisTask = AiAnalysisTask;
    }

    /**
     * Get A content recognition task. 
     * @return AiRecognitionTask A content recognition task.
     */
    public AiRecognitionTaskInput getAiRecognitionTask() {
        return this.AiRecognitionTask;
    }

    /**
     * Set A content recognition task.
     * @param AiRecognitionTask A content recognition task.
     */
    public void setAiRecognitionTask(AiRecognitionTaskInput AiRecognitionTask) {
        this.AiRecognitionTask = AiRecognitionTask;
    }

    /**
     * Get Media quality inspection task.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return QualityControlTask Media quality inspection task.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AiQualityControlTaskInput getQualityControlTask() {
        return this.QualityControlTask;
    }

    /**
     * Set Media quality inspection task.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param QualityControlTask Media quality inspection task.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setQualityControlTask(AiQualityControlTaskInput QualityControlTask) {
        this.QualityControlTask = QualityControlTask;
    }

    /**
     * Get Conditional judgment of the task.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ExecRulesTask Conditional judgment of the task.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public ExecRulesTask getExecRulesTask() {
        return this.ExecRulesTask;
    }

    /**
     * Set Conditional judgment of the task.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ExecRulesTask Conditional judgment of the task.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setExecRulesTask(ExecRulesTask ExecRulesTask) {
        this.ExecRulesTask = ExecRulesTask;
    }

    /**
     * Get Smart subtitle task.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SmartSubtitlesTask Smart subtitle task.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public SmartSubtitlesTaskInput getSmartSubtitlesTask() {
        return this.SmartSubtitlesTask;
    }

    /**
     * Set Smart subtitle task.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SmartSubtitlesTask Smart subtitle task.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSmartSubtitlesTask(SmartSubtitlesTaskInput SmartSubtitlesTask) {
        this.SmartSubtitlesTask = SmartSubtitlesTask;
    }

    public ActivityPara() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ActivityPara(ActivityPara source) {
        if (source.TranscodeTask != null) {
            this.TranscodeTask = new TranscodeTaskInput(source.TranscodeTask);
        }
        if (source.AnimatedGraphicTask != null) {
            this.AnimatedGraphicTask = new AnimatedGraphicTaskInput(source.AnimatedGraphicTask);
        }
        if (source.SnapshotByTimeOffsetTask != null) {
            this.SnapshotByTimeOffsetTask = new SnapshotByTimeOffsetTaskInput(source.SnapshotByTimeOffsetTask);
        }
        if (source.SampleSnapshotTask != null) {
            this.SampleSnapshotTask = new SampleSnapshotTaskInput(source.SampleSnapshotTask);
        }
        if (source.ImageSpriteTask != null) {
            this.ImageSpriteTask = new ImageSpriteTaskInput(source.ImageSpriteTask);
        }
        if (source.AdaptiveDynamicStreamingTask != null) {
            this.AdaptiveDynamicStreamingTask = new AdaptiveDynamicStreamingTaskInput(source.AdaptiveDynamicStreamingTask);
        }
        if (source.AiContentReviewTask != null) {
            this.AiContentReviewTask = new AiContentReviewTaskInput(source.AiContentReviewTask);
        }
        if (source.AiAnalysisTask != null) {
            this.AiAnalysisTask = new AiAnalysisTaskInput(source.AiAnalysisTask);
        }
        if (source.AiRecognitionTask != null) {
            this.AiRecognitionTask = new AiRecognitionTaskInput(source.AiRecognitionTask);
        }
        if (source.QualityControlTask != null) {
            this.QualityControlTask = new AiQualityControlTaskInput(source.QualityControlTask);
        }
        if (source.ExecRulesTask != null) {
            this.ExecRulesTask = new ExecRulesTask(source.ExecRulesTask);
        }
        if (source.SmartSubtitlesTask != null) {
            this.SmartSubtitlesTask = new SmartSubtitlesTaskInput(source.SmartSubtitlesTask);
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
        this.setParamObj(map, prefix + "AiContentReviewTask.", this.AiContentReviewTask);
        this.setParamObj(map, prefix + "AiAnalysisTask.", this.AiAnalysisTask);
        this.setParamObj(map, prefix + "AiRecognitionTask.", this.AiRecognitionTask);
        this.setParamObj(map, prefix + "QualityControlTask.", this.QualityControlTask);
        this.setParamObj(map, prefix + "ExecRulesTask.", this.ExecRulesTask);
        this.setParamObj(map, prefix + "SmartSubtitlesTask.", this.SmartSubtitlesTask);

    }
}


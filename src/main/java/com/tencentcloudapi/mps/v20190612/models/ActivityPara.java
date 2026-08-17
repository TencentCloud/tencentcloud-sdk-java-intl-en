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
    * 
    */
    @SerializedName("TranscodeTask")
    @Expose
    private TranscodeTaskInput TranscodeTask;

    /**
    * 
    */
    @SerializedName("AnimatedGraphicTask")
    @Expose
    private AnimatedGraphicTaskInput AnimatedGraphicTask;

    /**
    * 
    */
    @SerializedName("SnapshotByTimeOffsetTask")
    @Expose
    private SnapshotByTimeOffsetTaskInput SnapshotByTimeOffsetTask;

    /**
    * 
    */
    @SerializedName("SampleSnapshotTask")
    @Expose
    private SampleSnapshotTaskInput SampleSnapshotTask;

    /**
    * 
    */
    @SerializedName("ImageSpriteTask")
    @Expose
    private ImageSpriteTaskInput ImageSpriteTask;

    /**
    * 
    */
    @SerializedName("AdaptiveDynamicStreamingTask")
    @Expose
    private AdaptiveDynamicStreamingTaskInput AdaptiveDynamicStreamingTask;

    /**
    * 
    */
    @SerializedName("AiContentReviewTask")
    @Expose
    private AiContentReviewTaskInput AiContentReviewTask;

    /**
    * 
    */
    @SerializedName("AiAnalysisTask")
    @Expose
    private AiAnalysisTaskInput AiAnalysisTask;

    /**
    * 
    */
    @SerializedName("AiRecognitionTask")
    @Expose
    private AiRecognitionTaskInput AiRecognitionTask;

    /**
    * 
    */
    @SerializedName("QualityControlTask")
    @Expose
    private AiQualityControlTaskInput QualityControlTask;

    /**
    * 
    */
    @SerializedName("ExecRulesTask")
    @Expose
    private ExecRulesTask ExecRulesTask;

    /**
    * 
    */
    @SerializedName("SmartSubtitlesTask")
    @Expose
    private SmartSubtitlesTaskInput SmartSubtitlesTask;

    /**
    * 
    */
    @SerializedName("SmartEraseTask")
    @Expose
    private SmartEraseTaskInput SmartEraseTask;

    /**
     * Get  
     * @return TranscodeTask 
     */
    public TranscodeTaskInput getTranscodeTask() {
        return this.TranscodeTask;
    }

    /**
     * Set 
     * @param TranscodeTask 
     */
    public void setTranscodeTask(TranscodeTaskInput TranscodeTask) {
        this.TranscodeTask = TranscodeTask;
    }

    /**
     * Get  
     * @return AnimatedGraphicTask 
     */
    public AnimatedGraphicTaskInput getAnimatedGraphicTask() {
        return this.AnimatedGraphicTask;
    }

    /**
     * Set 
     * @param AnimatedGraphicTask 
     */
    public void setAnimatedGraphicTask(AnimatedGraphicTaskInput AnimatedGraphicTask) {
        this.AnimatedGraphicTask = AnimatedGraphicTask;
    }

    /**
     * Get  
     * @return SnapshotByTimeOffsetTask 
     */
    public SnapshotByTimeOffsetTaskInput getSnapshotByTimeOffsetTask() {
        return this.SnapshotByTimeOffsetTask;
    }

    /**
     * Set 
     * @param SnapshotByTimeOffsetTask 
     */
    public void setSnapshotByTimeOffsetTask(SnapshotByTimeOffsetTaskInput SnapshotByTimeOffsetTask) {
        this.SnapshotByTimeOffsetTask = SnapshotByTimeOffsetTask;
    }

    /**
     * Get  
     * @return SampleSnapshotTask 
     */
    public SampleSnapshotTaskInput getSampleSnapshotTask() {
        return this.SampleSnapshotTask;
    }

    /**
     * Set 
     * @param SampleSnapshotTask 
     */
    public void setSampleSnapshotTask(SampleSnapshotTaskInput SampleSnapshotTask) {
        this.SampleSnapshotTask = SampleSnapshotTask;
    }

    /**
     * Get  
     * @return ImageSpriteTask 
     */
    public ImageSpriteTaskInput getImageSpriteTask() {
        return this.ImageSpriteTask;
    }

    /**
     * Set 
     * @param ImageSpriteTask 
     */
    public void setImageSpriteTask(ImageSpriteTaskInput ImageSpriteTask) {
        this.ImageSpriteTask = ImageSpriteTask;
    }

    /**
     * Get  
     * @return AdaptiveDynamicStreamingTask 
     */
    public AdaptiveDynamicStreamingTaskInput getAdaptiveDynamicStreamingTask() {
        return this.AdaptiveDynamicStreamingTask;
    }

    /**
     * Set 
     * @param AdaptiveDynamicStreamingTask 
     */
    public void setAdaptiveDynamicStreamingTask(AdaptiveDynamicStreamingTaskInput AdaptiveDynamicStreamingTask) {
        this.AdaptiveDynamicStreamingTask = AdaptiveDynamicStreamingTask;
    }

    /**
     * Get  
     * @return AiContentReviewTask 
     */
    public AiContentReviewTaskInput getAiContentReviewTask() {
        return this.AiContentReviewTask;
    }

    /**
     * Set 
     * @param AiContentReviewTask 
     */
    public void setAiContentReviewTask(AiContentReviewTaskInput AiContentReviewTask) {
        this.AiContentReviewTask = AiContentReviewTask;
    }

    /**
     * Get  
     * @return AiAnalysisTask 
     */
    public AiAnalysisTaskInput getAiAnalysisTask() {
        return this.AiAnalysisTask;
    }

    /**
     * Set 
     * @param AiAnalysisTask 
     */
    public void setAiAnalysisTask(AiAnalysisTaskInput AiAnalysisTask) {
        this.AiAnalysisTask = AiAnalysisTask;
    }

    /**
     * Get  
     * @return AiRecognitionTask 
     */
    public AiRecognitionTaskInput getAiRecognitionTask() {
        return this.AiRecognitionTask;
    }

    /**
     * Set 
     * @param AiRecognitionTask 
     */
    public void setAiRecognitionTask(AiRecognitionTaskInput AiRecognitionTask) {
        this.AiRecognitionTask = AiRecognitionTask;
    }

    /**
     * Get  
     * @return QualityControlTask 
     */
    public AiQualityControlTaskInput getQualityControlTask() {
        return this.QualityControlTask;
    }

    /**
     * Set 
     * @param QualityControlTask 
     */
    public void setQualityControlTask(AiQualityControlTaskInput QualityControlTask) {
        this.QualityControlTask = QualityControlTask;
    }

    /**
     * Get  
     * @return ExecRulesTask 
     */
    public ExecRulesTask getExecRulesTask() {
        return this.ExecRulesTask;
    }

    /**
     * Set 
     * @param ExecRulesTask 
     */
    public void setExecRulesTask(ExecRulesTask ExecRulesTask) {
        this.ExecRulesTask = ExecRulesTask;
    }

    /**
     * Get  
     * @return SmartSubtitlesTask 
     */
    public SmartSubtitlesTaskInput getSmartSubtitlesTask() {
        return this.SmartSubtitlesTask;
    }

    /**
     * Set 
     * @param SmartSubtitlesTask 
     */
    public void setSmartSubtitlesTask(SmartSubtitlesTaskInput SmartSubtitlesTask) {
        this.SmartSubtitlesTask = SmartSubtitlesTask;
    }

    /**
     * Get  
     * @return SmartEraseTask 
     */
    public SmartEraseTaskInput getSmartEraseTask() {
        return this.SmartEraseTask;
    }

    /**
     * Set 
     * @param SmartEraseTask 
     */
    public void setSmartEraseTask(SmartEraseTaskInput SmartEraseTask) {
        this.SmartEraseTask = SmartEraseTask;
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
        if (source.SmartEraseTask != null) {
            this.SmartEraseTask = new SmartEraseTaskInput(source.SmartEraseTask);
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
        this.setParamObj(map, prefix + "SmartEraseTask.", this.SmartEraseTask);

    }
}


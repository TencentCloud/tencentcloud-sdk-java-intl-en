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

public class MPSAiMediaItem extends AbstractModel {

    /**
    * MPS intelligent processing task type. Valid values:
<li>AiAnalysis.ClassificationTask: intelligent classification task.</li>
<li>AiAnalysis.CoverTask: Intelligent Cover Task.</li>
<li>AiAnalysis.TagTask: intelligent tag task.</li>
<li>AiAnalysis.FrameTagTask: intelligent frame-specific tagging task.</li>
<li>AiAnalysis.HighlightTask: intelligent highlight task.</li>
<li>AiAnalysis.SegmentTask: intelligent splitting task.</li>
<li>AiAnalysis.HeadTailTask: intelligent opening and closing credits task.</li>
<li>AiAnalysis.DescriptionTask: intelligent summarization task.</li>
<li>AiAnalysis.HorizontalToVerticalTask: Intelligent Landscape to Portrait Task.</li>
<li>AiAnalysis.DubbingTask: intelligent dubbing task.</li>
<li>AiAnalysis.VideoRemakeTask: Intelligent deduplication task.</li>
<li>AiAnalysis.VideoComprehensionTask: video understanding task.</li>
<li>SmartSubtitle.AsrFullTextTask: intelligent speech full-text recognition task.</li>
<li>SmartSubtitle.TransTextTask: Translation result.</li>
<li>SmartSubtitle.PureSubtitleTransTask: return the translation result of a pure subtitle file.</li>
<li>SmartSubtitle.OcrFullTextTask: intelligent text extraction subtitle task.</li>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * MPS intelligent processing task result set
    */
    @SerializedName("AiMediaTasks")
    @Expose
    private MPSAiMediaTask [] AiMediaTasks;

    /**
     * Get MPS intelligent processing task type. Valid values:
<li>AiAnalysis.ClassificationTask: intelligent classification task.</li>
<li>AiAnalysis.CoverTask: Intelligent Cover Task.</li>
<li>AiAnalysis.TagTask: intelligent tag task.</li>
<li>AiAnalysis.FrameTagTask: intelligent frame-specific tagging task.</li>
<li>AiAnalysis.HighlightTask: intelligent highlight task.</li>
<li>AiAnalysis.SegmentTask: intelligent splitting task.</li>
<li>AiAnalysis.HeadTailTask: intelligent opening and closing credits task.</li>
<li>AiAnalysis.DescriptionTask: intelligent summarization task.</li>
<li>AiAnalysis.HorizontalToVerticalTask: Intelligent Landscape to Portrait Task.</li>
<li>AiAnalysis.DubbingTask: intelligent dubbing task.</li>
<li>AiAnalysis.VideoRemakeTask: Intelligent deduplication task.</li>
<li>AiAnalysis.VideoComprehensionTask: video understanding task.</li>
<li>SmartSubtitle.AsrFullTextTask: intelligent speech full-text recognition task.</li>
<li>SmartSubtitle.TransTextTask: Translation result.</li>
<li>SmartSubtitle.PureSubtitleTransTask: return the translation result of a pure subtitle file.</li>
<li>SmartSubtitle.OcrFullTextTask: intelligent text extraction subtitle task.</li> 
     * @return TaskType MPS intelligent processing task type. Valid values:
<li>AiAnalysis.ClassificationTask: intelligent classification task.</li>
<li>AiAnalysis.CoverTask: Intelligent Cover Task.</li>
<li>AiAnalysis.TagTask: intelligent tag task.</li>
<li>AiAnalysis.FrameTagTask: intelligent frame-specific tagging task.</li>
<li>AiAnalysis.HighlightTask: intelligent highlight task.</li>
<li>AiAnalysis.SegmentTask: intelligent splitting task.</li>
<li>AiAnalysis.HeadTailTask: intelligent opening and closing credits task.</li>
<li>AiAnalysis.DescriptionTask: intelligent summarization task.</li>
<li>AiAnalysis.HorizontalToVerticalTask: Intelligent Landscape to Portrait Task.</li>
<li>AiAnalysis.DubbingTask: intelligent dubbing task.</li>
<li>AiAnalysis.VideoRemakeTask: Intelligent deduplication task.</li>
<li>AiAnalysis.VideoComprehensionTask: video understanding task.</li>
<li>SmartSubtitle.AsrFullTextTask: intelligent speech full-text recognition task.</li>
<li>SmartSubtitle.TransTextTask: Translation result.</li>
<li>SmartSubtitle.PureSubtitleTransTask: return the translation result of a pure subtitle file.</li>
<li>SmartSubtitle.OcrFullTextTask: intelligent text extraction subtitle task.</li>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set MPS intelligent processing task type. Valid values:
<li>AiAnalysis.ClassificationTask: intelligent classification task.</li>
<li>AiAnalysis.CoverTask: Intelligent Cover Task.</li>
<li>AiAnalysis.TagTask: intelligent tag task.</li>
<li>AiAnalysis.FrameTagTask: intelligent frame-specific tagging task.</li>
<li>AiAnalysis.HighlightTask: intelligent highlight task.</li>
<li>AiAnalysis.SegmentTask: intelligent splitting task.</li>
<li>AiAnalysis.HeadTailTask: intelligent opening and closing credits task.</li>
<li>AiAnalysis.DescriptionTask: intelligent summarization task.</li>
<li>AiAnalysis.HorizontalToVerticalTask: Intelligent Landscape to Portrait Task.</li>
<li>AiAnalysis.DubbingTask: intelligent dubbing task.</li>
<li>AiAnalysis.VideoRemakeTask: Intelligent deduplication task.</li>
<li>AiAnalysis.VideoComprehensionTask: video understanding task.</li>
<li>SmartSubtitle.AsrFullTextTask: intelligent speech full-text recognition task.</li>
<li>SmartSubtitle.TransTextTask: Translation result.</li>
<li>SmartSubtitle.PureSubtitleTransTask: return the translation result of a pure subtitle file.</li>
<li>SmartSubtitle.OcrFullTextTask: intelligent text extraction subtitle task.</li>
     * @param TaskType MPS intelligent processing task type. Valid values:
<li>AiAnalysis.ClassificationTask: intelligent classification task.</li>
<li>AiAnalysis.CoverTask: Intelligent Cover Task.</li>
<li>AiAnalysis.TagTask: intelligent tag task.</li>
<li>AiAnalysis.FrameTagTask: intelligent frame-specific tagging task.</li>
<li>AiAnalysis.HighlightTask: intelligent highlight task.</li>
<li>AiAnalysis.SegmentTask: intelligent splitting task.</li>
<li>AiAnalysis.HeadTailTask: intelligent opening and closing credits task.</li>
<li>AiAnalysis.DescriptionTask: intelligent summarization task.</li>
<li>AiAnalysis.HorizontalToVerticalTask: Intelligent Landscape to Portrait Task.</li>
<li>AiAnalysis.DubbingTask: intelligent dubbing task.</li>
<li>AiAnalysis.VideoRemakeTask: Intelligent deduplication task.</li>
<li>AiAnalysis.VideoComprehensionTask: video understanding task.</li>
<li>SmartSubtitle.AsrFullTextTask: intelligent speech full-text recognition task.</li>
<li>SmartSubtitle.TransTextTask: Translation result.</li>
<li>SmartSubtitle.PureSubtitleTransTask: return the translation result of a pure subtitle file.</li>
<li>SmartSubtitle.OcrFullTextTask: intelligent text extraction subtitle task.</li>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get MPS intelligent processing task result set 
     * @return AiMediaTasks MPS intelligent processing task result set
     */
    public MPSAiMediaTask [] getAiMediaTasks() {
        return this.AiMediaTasks;
    }

    /**
     * Set MPS intelligent processing task result set
     * @param AiMediaTasks MPS intelligent processing task result set
     */
    public void setAiMediaTasks(MPSAiMediaTask [] AiMediaTasks) {
        this.AiMediaTasks = AiMediaTasks;
    }

    public MPSAiMediaItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MPSAiMediaItem(MPSAiMediaItem source) {
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.AiMediaTasks != null) {
            this.AiMediaTasks = new MPSAiMediaTask[source.AiMediaTasks.length];
            for (int i = 0; i < source.AiMediaTasks.length; i++) {
                this.AiMediaTasks[i] = new MPSAiMediaTask(source.AiMediaTasks[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamArrayObj(map, prefix + "AiMediaTasks.", this.AiMediaTasks);

    }
}


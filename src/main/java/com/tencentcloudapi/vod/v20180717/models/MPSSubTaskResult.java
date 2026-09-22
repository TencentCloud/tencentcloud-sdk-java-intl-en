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

public class MPSSubTaskResult extends AbstractModel {

    /**
    * Task type. The specific subtask type in the WorkflowTask structure of MPS. Value:
<li>MediaProcess.Transcode: audio and video transcoding task.</li>
<li>AiAnalysis.DeLogo: intelligent erasure task.</li>
<li>AiAnalysis.ClassificationTask: intelligent classification task.</li>
<li>AiAnalysis.CoverTask: Intelligent Cover Task.</li>
<li>AiAnalysis.TagTask: intelligent tag task.</li>
<li>AiAnalysis.FrameTagTask: intelligent frame-specific tagging task.</li>
<li>AiAnalysis.HighlightTask: intelligent highlight task.</li>
<li>AiAnalysis.SegmentTask: intelligent video splitting task.</li>
<li>AiAnalysis.HeadTailTask: intelligent opening and closing credits task.</li>
<li>AiAnalysis.DescriptionTask: intelligent summarization task.</li>
<li>AiAnalysis.HorizontalToVerticalTask: Intelligent Landscape to Portrait Task.</li>
<li>AiAnalysis.DubbingTask: intelligent dubbing task.</li>
<li>AiAnalysis.VideoRemakeTask: intelligent deduplication task.</li>
<li>AiAnalysis.VideoComprehensionTask: video understanding task.</li>
<li>SmartSubtitle.AsrFullTextTask: intelligent speech full-text recognition task.</li>
<li>SmartSubtitle.TransTextTask: Translation result.</li>
<li>SmartSubtitle.PureSubtitleTransTask: returns the translation result of a pure subtitle file.</li>
<li>SmartSubtitle.OcrFullTextTask: intelligent text extraction subtitle task.</li>
<li>SmartErase: intelligent erasure task.</li>

    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * Task status. It has three values: PROCESSING, SUCCESS, and FAIL.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Error code. `0` indicates success. Other values indicate failure.
    */
    @SerializedName("ErrCode")
    @Expose
    private String ErrCode;

    /**
    * Error message.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Input of the MPS video processing task. This field corresponds to the Input result returned by the MPS task, returned in JSON format.
    */
    @SerializedName("Input")
    @Expose
    private String Input;

    /**
    * Output of the MPS video processing task.
    */
    @SerializedName("Output")
    @Expose
    private MPSTaskOutput Output;

    /**
     * Get Task type. The specific subtask type in the WorkflowTask structure of MPS. Value:
<li>MediaProcess.Transcode: audio and video transcoding task.</li>
<li>AiAnalysis.DeLogo: intelligent erasure task.</li>
<li>AiAnalysis.ClassificationTask: intelligent classification task.</li>
<li>AiAnalysis.CoverTask: Intelligent Cover Task.</li>
<li>AiAnalysis.TagTask: intelligent tag task.</li>
<li>AiAnalysis.FrameTagTask: intelligent frame-specific tagging task.</li>
<li>AiAnalysis.HighlightTask: intelligent highlight task.</li>
<li>AiAnalysis.SegmentTask: intelligent video splitting task.</li>
<li>AiAnalysis.HeadTailTask: intelligent opening and closing credits task.</li>
<li>AiAnalysis.DescriptionTask: intelligent summarization task.</li>
<li>AiAnalysis.HorizontalToVerticalTask: Intelligent Landscape to Portrait Task.</li>
<li>AiAnalysis.DubbingTask: intelligent dubbing task.</li>
<li>AiAnalysis.VideoRemakeTask: intelligent deduplication task.</li>
<li>AiAnalysis.VideoComprehensionTask: video understanding task.</li>
<li>SmartSubtitle.AsrFullTextTask: intelligent speech full-text recognition task.</li>
<li>SmartSubtitle.TransTextTask: Translation result.</li>
<li>SmartSubtitle.PureSubtitleTransTask: returns the translation result of a pure subtitle file.</li>
<li>SmartSubtitle.OcrFullTextTask: intelligent text extraction subtitle task.</li>
<li>SmartErase: intelligent erasure task.</li>
 
     * @return TaskType Task type. The specific subtask type in the WorkflowTask structure of MPS. Value:
<li>MediaProcess.Transcode: audio and video transcoding task.</li>
<li>AiAnalysis.DeLogo: intelligent erasure task.</li>
<li>AiAnalysis.ClassificationTask: intelligent classification task.</li>
<li>AiAnalysis.CoverTask: Intelligent Cover Task.</li>
<li>AiAnalysis.TagTask: intelligent tag task.</li>
<li>AiAnalysis.FrameTagTask: intelligent frame-specific tagging task.</li>
<li>AiAnalysis.HighlightTask: intelligent highlight task.</li>
<li>AiAnalysis.SegmentTask: intelligent video splitting task.</li>
<li>AiAnalysis.HeadTailTask: intelligent opening and closing credits task.</li>
<li>AiAnalysis.DescriptionTask: intelligent summarization task.</li>
<li>AiAnalysis.HorizontalToVerticalTask: Intelligent Landscape to Portrait Task.</li>
<li>AiAnalysis.DubbingTask: intelligent dubbing task.</li>
<li>AiAnalysis.VideoRemakeTask: intelligent deduplication task.</li>
<li>AiAnalysis.VideoComprehensionTask: video understanding task.</li>
<li>SmartSubtitle.AsrFullTextTask: intelligent speech full-text recognition task.</li>
<li>SmartSubtitle.TransTextTask: Translation result.</li>
<li>SmartSubtitle.PureSubtitleTransTask: returns the translation result of a pure subtitle file.</li>
<li>SmartSubtitle.OcrFullTextTask: intelligent text extraction subtitle task.</li>
<li>SmartErase: intelligent erasure task.</li>

     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set Task type. The specific subtask type in the WorkflowTask structure of MPS. Value:
<li>MediaProcess.Transcode: audio and video transcoding task.</li>
<li>AiAnalysis.DeLogo: intelligent erasure task.</li>
<li>AiAnalysis.ClassificationTask: intelligent classification task.</li>
<li>AiAnalysis.CoverTask: Intelligent Cover Task.</li>
<li>AiAnalysis.TagTask: intelligent tag task.</li>
<li>AiAnalysis.FrameTagTask: intelligent frame-specific tagging task.</li>
<li>AiAnalysis.HighlightTask: intelligent highlight task.</li>
<li>AiAnalysis.SegmentTask: intelligent video splitting task.</li>
<li>AiAnalysis.HeadTailTask: intelligent opening and closing credits task.</li>
<li>AiAnalysis.DescriptionTask: intelligent summarization task.</li>
<li>AiAnalysis.HorizontalToVerticalTask: Intelligent Landscape to Portrait Task.</li>
<li>AiAnalysis.DubbingTask: intelligent dubbing task.</li>
<li>AiAnalysis.VideoRemakeTask: intelligent deduplication task.</li>
<li>AiAnalysis.VideoComprehensionTask: video understanding task.</li>
<li>SmartSubtitle.AsrFullTextTask: intelligent speech full-text recognition task.</li>
<li>SmartSubtitle.TransTextTask: Translation result.</li>
<li>SmartSubtitle.PureSubtitleTransTask: returns the translation result of a pure subtitle file.</li>
<li>SmartSubtitle.OcrFullTextTask: intelligent text extraction subtitle task.</li>
<li>SmartErase: intelligent erasure task.</li>

     * @param TaskType Task type. The specific subtask type in the WorkflowTask structure of MPS. Value:
<li>MediaProcess.Transcode: audio and video transcoding task.</li>
<li>AiAnalysis.DeLogo: intelligent erasure task.</li>
<li>AiAnalysis.ClassificationTask: intelligent classification task.</li>
<li>AiAnalysis.CoverTask: Intelligent Cover Task.</li>
<li>AiAnalysis.TagTask: intelligent tag task.</li>
<li>AiAnalysis.FrameTagTask: intelligent frame-specific tagging task.</li>
<li>AiAnalysis.HighlightTask: intelligent highlight task.</li>
<li>AiAnalysis.SegmentTask: intelligent video splitting task.</li>
<li>AiAnalysis.HeadTailTask: intelligent opening and closing credits task.</li>
<li>AiAnalysis.DescriptionTask: intelligent summarization task.</li>
<li>AiAnalysis.HorizontalToVerticalTask: Intelligent Landscape to Portrait Task.</li>
<li>AiAnalysis.DubbingTask: intelligent dubbing task.</li>
<li>AiAnalysis.VideoRemakeTask: intelligent deduplication task.</li>
<li>AiAnalysis.VideoComprehensionTask: video understanding task.</li>
<li>SmartSubtitle.AsrFullTextTask: intelligent speech full-text recognition task.</li>
<li>SmartSubtitle.TransTextTask: Translation result.</li>
<li>SmartSubtitle.PureSubtitleTransTask: returns the translation result of a pure subtitle file.</li>
<li>SmartSubtitle.OcrFullTextTask: intelligent text extraction subtitle task.</li>
<li>SmartErase: intelligent erasure task.</li>

     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get Task status. It has three values: PROCESSING, SUCCESS, and FAIL. 
     * @return Status Task status. It has three values: PROCESSING, SUCCESS, and FAIL.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task status. It has three values: PROCESSING, SUCCESS, and FAIL.
     * @param Status Task status. It has three values: PROCESSING, SUCCESS, and FAIL.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Error code. `0` indicates success. Other values indicate failure. 
     * @return ErrCode Error code. `0` indicates success. Other values indicate failure.
     */
    public String getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set Error code. `0` indicates success. Other values indicate failure.
     * @param ErrCode Error code. `0` indicates success. Other values indicate failure.
     */
    public void setErrCode(String ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get Error message. 
     * @return Message Error message.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Error message.
     * @param Message Error message.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Input of the MPS video processing task. This field corresponds to the Input result returned by the MPS task, returned in JSON format. 
     * @return Input Input of the MPS video processing task. This field corresponds to the Input result returned by the MPS task, returned in JSON format.
     */
    public String getInput() {
        return this.Input;
    }

    /**
     * Set Input of the MPS video processing task. This field corresponds to the Input result returned by the MPS task, returned in JSON format.
     * @param Input Input of the MPS video processing task. This field corresponds to the Input result returned by the MPS task, returned in JSON format.
     */
    public void setInput(String Input) {
        this.Input = Input;
    }

    /**
     * Get Output of the MPS video processing task. 
     * @return Output Output of the MPS video processing task.
     */
    public MPSTaskOutput getOutput() {
        return this.Output;
    }

    /**
     * Set Output of the MPS video processing task.
     * @param Output Output of the MPS video processing task.
     */
    public void setOutput(MPSTaskOutput Output) {
        this.Output = Output;
    }

    public MPSSubTaskResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MPSSubTaskResult(MPSSubTaskResult source) {
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrCode != null) {
            this.ErrCode = new String(source.ErrCode);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Input != null) {
            this.Input = new String(source.Input);
        }
        if (source.Output != null) {
            this.Output = new MPSTaskOutput(source.Output);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "Input", this.Input);
        this.setParamObj(map, prefix + "Output.", this.Output);

    }
}


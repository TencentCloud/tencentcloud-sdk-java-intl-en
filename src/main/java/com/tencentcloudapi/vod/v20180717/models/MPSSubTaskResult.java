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
    * Task type. Specific subtask type in the MPS WorkflowTask structure. Value:
<li>MediaProcess.Transcode: audio and video transcoding task.</li>
<li>AiAnalysis.DeLogo: intelligent erasure task.</li>
<li>AiAnalysis.ClassificationTask: intelligent classification task.</li>
<li>AiAnalysis.CoverTask: intelligent thumbnail generating.</li>
<li>AiAnalysis.TagTask: intelligent tag task.</li>
<li>AiAnalysis.FrameTagTask: intelligent frame-by-frame tagging task.</li>
<li>AiAnalysis.HighlightTask: Intelligent highlight task.</li>
<li>AiAnalysis.SegmentTask: Intelligent video splitting task.</li>
<li>AiAnalysis.HeadTailTask: Intelligent opening and closing credits task.</li>
<li>AiAnalysis.DescriptionTask: Intelligent summary task.</li>
<li>AiAnalysis.HorizontalToVerticalTask: Intelligent Landscape to Portrait Task.</li>
<li>AiAnalysis.DubbingTask: Intelligent dubbing task.</li>
<li>AiAnalysis.VideoRemakeTask: Intelligent deduplication task.</li>
<li>AiAnalysis.VideoComprehensionTask: Video understanding task.</li>
<li>SmartSubtitle.AsrFullTextTask: intelligent speech full-text recognition task.</li>
<li>SmartSubtitle.TransTextTask: Translation result.</li>
<li>SmartSubtitle.PureSubtitleTransTask: Returns the translation result of the pure subtitle file.</li>
<li>SmartSubtitle.OcrFullTextTask: Intelligent text extraction subtitle task.</li>
<li>SmartErase: intelligent erasure task.</li>

    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * Task status, including PROCESSING, SUCCESS, and FAIL.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Error code. 0 indicates success, others indicate failure.
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
    * MPS video processing task input. This field corresponds to the Input result returned by the MPS task in JSON format.
    */
    @SerializedName("Input")
    @Expose
    private String Input;

    /**
    * MPS video processing task output.
    */
    @SerializedName("Output")
    @Expose
    private MPSTaskOutput Output;

    /**
     * Get Task type. Specific subtask type in the MPS WorkflowTask structure. Value:
<li>MediaProcess.Transcode: audio and video transcoding task.</li>
<li>AiAnalysis.DeLogo: intelligent erasure task.</li>
<li>AiAnalysis.ClassificationTask: intelligent classification task.</li>
<li>AiAnalysis.CoverTask: intelligent thumbnail generating.</li>
<li>AiAnalysis.TagTask: intelligent tag task.</li>
<li>AiAnalysis.FrameTagTask: intelligent frame-by-frame tagging task.</li>
<li>AiAnalysis.HighlightTask: Intelligent highlight task.</li>
<li>AiAnalysis.SegmentTask: Intelligent video splitting task.</li>
<li>AiAnalysis.HeadTailTask: Intelligent opening and closing credits task.</li>
<li>AiAnalysis.DescriptionTask: Intelligent summary task.</li>
<li>AiAnalysis.HorizontalToVerticalTask: Intelligent Landscape to Portrait Task.</li>
<li>AiAnalysis.DubbingTask: Intelligent dubbing task.</li>
<li>AiAnalysis.VideoRemakeTask: Intelligent deduplication task.</li>
<li>AiAnalysis.VideoComprehensionTask: Video understanding task.</li>
<li>SmartSubtitle.AsrFullTextTask: intelligent speech full-text recognition task.</li>
<li>SmartSubtitle.TransTextTask: Translation result.</li>
<li>SmartSubtitle.PureSubtitleTransTask: Returns the translation result of the pure subtitle file.</li>
<li>SmartSubtitle.OcrFullTextTask: Intelligent text extraction subtitle task.</li>
<li>SmartErase: intelligent erasure task.</li>
 
     * @return TaskType Task type. Specific subtask type in the MPS WorkflowTask structure. Value:
<li>MediaProcess.Transcode: audio and video transcoding task.</li>
<li>AiAnalysis.DeLogo: intelligent erasure task.</li>
<li>AiAnalysis.ClassificationTask: intelligent classification task.</li>
<li>AiAnalysis.CoverTask: intelligent thumbnail generating.</li>
<li>AiAnalysis.TagTask: intelligent tag task.</li>
<li>AiAnalysis.FrameTagTask: intelligent frame-by-frame tagging task.</li>
<li>AiAnalysis.HighlightTask: Intelligent highlight task.</li>
<li>AiAnalysis.SegmentTask: Intelligent video splitting task.</li>
<li>AiAnalysis.HeadTailTask: Intelligent opening and closing credits task.</li>
<li>AiAnalysis.DescriptionTask: Intelligent summary task.</li>
<li>AiAnalysis.HorizontalToVerticalTask: Intelligent Landscape to Portrait Task.</li>
<li>AiAnalysis.DubbingTask: Intelligent dubbing task.</li>
<li>AiAnalysis.VideoRemakeTask: Intelligent deduplication task.</li>
<li>AiAnalysis.VideoComprehensionTask: Video understanding task.</li>
<li>SmartSubtitle.AsrFullTextTask: intelligent speech full-text recognition task.</li>
<li>SmartSubtitle.TransTextTask: Translation result.</li>
<li>SmartSubtitle.PureSubtitleTransTask: Returns the translation result of the pure subtitle file.</li>
<li>SmartSubtitle.OcrFullTextTask: Intelligent text extraction subtitle task.</li>
<li>SmartErase: intelligent erasure task.</li>

     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set Task type. Specific subtask type in the MPS WorkflowTask structure. Value:
<li>MediaProcess.Transcode: audio and video transcoding task.</li>
<li>AiAnalysis.DeLogo: intelligent erasure task.</li>
<li>AiAnalysis.ClassificationTask: intelligent classification task.</li>
<li>AiAnalysis.CoverTask: intelligent thumbnail generating.</li>
<li>AiAnalysis.TagTask: intelligent tag task.</li>
<li>AiAnalysis.FrameTagTask: intelligent frame-by-frame tagging task.</li>
<li>AiAnalysis.HighlightTask: Intelligent highlight task.</li>
<li>AiAnalysis.SegmentTask: Intelligent video splitting task.</li>
<li>AiAnalysis.HeadTailTask: Intelligent opening and closing credits task.</li>
<li>AiAnalysis.DescriptionTask: Intelligent summary task.</li>
<li>AiAnalysis.HorizontalToVerticalTask: Intelligent Landscape to Portrait Task.</li>
<li>AiAnalysis.DubbingTask: Intelligent dubbing task.</li>
<li>AiAnalysis.VideoRemakeTask: Intelligent deduplication task.</li>
<li>AiAnalysis.VideoComprehensionTask: Video understanding task.</li>
<li>SmartSubtitle.AsrFullTextTask: intelligent speech full-text recognition task.</li>
<li>SmartSubtitle.TransTextTask: Translation result.</li>
<li>SmartSubtitle.PureSubtitleTransTask: Returns the translation result of the pure subtitle file.</li>
<li>SmartSubtitle.OcrFullTextTask: Intelligent text extraction subtitle task.</li>
<li>SmartErase: intelligent erasure task.</li>

     * @param TaskType Task type. Specific subtask type in the MPS WorkflowTask structure. Value:
<li>MediaProcess.Transcode: audio and video transcoding task.</li>
<li>AiAnalysis.DeLogo: intelligent erasure task.</li>
<li>AiAnalysis.ClassificationTask: intelligent classification task.</li>
<li>AiAnalysis.CoverTask: intelligent thumbnail generating.</li>
<li>AiAnalysis.TagTask: intelligent tag task.</li>
<li>AiAnalysis.FrameTagTask: intelligent frame-by-frame tagging task.</li>
<li>AiAnalysis.HighlightTask: Intelligent highlight task.</li>
<li>AiAnalysis.SegmentTask: Intelligent video splitting task.</li>
<li>AiAnalysis.HeadTailTask: Intelligent opening and closing credits task.</li>
<li>AiAnalysis.DescriptionTask: Intelligent summary task.</li>
<li>AiAnalysis.HorizontalToVerticalTask: Intelligent Landscape to Portrait Task.</li>
<li>AiAnalysis.DubbingTask: Intelligent dubbing task.</li>
<li>AiAnalysis.VideoRemakeTask: Intelligent deduplication task.</li>
<li>AiAnalysis.VideoComprehensionTask: Video understanding task.</li>
<li>SmartSubtitle.AsrFullTextTask: intelligent speech full-text recognition task.</li>
<li>SmartSubtitle.TransTextTask: Translation result.</li>
<li>SmartSubtitle.PureSubtitleTransTask: Returns the translation result of the pure subtitle file.</li>
<li>SmartSubtitle.OcrFullTextTask: Intelligent text extraction subtitle task.</li>
<li>SmartErase: intelligent erasure task.</li>

     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get Task status, including PROCESSING, SUCCESS, and FAIL. 
     * @return Status Task status, including PROCESSING, SUCCESS, and FAIL.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task status, including PROCESSING, SUCCESS, and FAIL.
     * @param Status Task status, including PROCESSING, SUCCESS, and FAIL.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Error code. 0 indicates success, others indicate failure. 
     * @return ErrCode Error code. 0 indicates success, others indicate failure.
     */
    public String getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set Error code. 0 indicates success, others indicate failure.
     * @param ErrCode Error code. 0 indicates success, others indicate failure.
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
     * Get MPS video processing task input. This field corresponds to the Input result returned by the MPS task in JSON format. 
     * @return Input MPS video processing task input. This field corresponds to the Input result returned by the MPS task in JSON format.
     */
    public String getInput() {
        return this.Input;
    }

    /**
     * Set MPS video processing task input. This field corresponds to the Input result returned by the MPS task in JSON format.
     * @param Input MPS video processing task input. This field corresponds to the Input result returned by the MPS task in JSON format.
     */
    public void setInput(String Input) {
        this.Input = Input;
    }

    /**
     * Get MPS video processing task output. 
     * @return Output MPS video processing task output.
     */
    public MPSTaskOutput getOutput() {
        return this.Output;
    }

    /**
     * Set MPS video processing task output.
     * @param Output MPS video processing task output.
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


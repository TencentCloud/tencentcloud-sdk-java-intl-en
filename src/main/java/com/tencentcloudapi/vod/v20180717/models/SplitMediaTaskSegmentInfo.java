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

public class SplitMediaTaskSegmentInfo extends AbstractModel {

    /**
    * Input information of the video splitting task.
    */
    @SerializedName("Input")
    @Expose
    private SplitMediaTaskInput Input;

    /**
    * Output information of the video splitting task.
    */
    @SerializedName("Output")
    @Expose
    private TaskOutputMediaInfo Output;

    /**
    * Task ID of the `Procedure` task type. If a task flow template (`ProcedureName`) is specified in the video split task information list when initiating a video splitting task (https://www.tencentcloud.com/document/api/266/51098?from_cn_redirect=1), the task is initiated when the task flow template specifies one or more of `MediaProcessTask`, `AiAnalysisTask`, and `AiRecognitionTask`.
    */
    @SerializedName("ProcedureTaskId")
    @Expose
    private String ProcedureTaskId;

    /**
    * Task ID of the `ReviewAudioVideo` type. If a task flow template (`ProcedureName`) is specified in the video split task information list when initiating a [video splitting](https://www.tencentcloud.com/document/api/266/51098?from_cn_redirect=1) task, the task is triggered when `ReviewAudioVideoTask` is specified in the task flow template.
    */
    @SerializedName("ReviewAudioVideoTaskId")
    @Expose
    private String ReviewAudioVideoTaskId;

    /**
     * Get Input information of the video splitting task. 
     * @return Input Input information of the video splitting task.
     */
    public SplitMediaTaskInput getInput() {
        return this.Input;
    }

    /**
     * Set Input information of the video splitting task.
     * @param Input Input information of the video splitting task.
     */
    public void setInput(SplitMediaTaskInput Input) {
        this.Input = Input;
    }

    /**
     * Get Output information of the video splitting task. 
     * @return Output Output information of the video splitting task.
     */
    public TaskOutputMediaInfo getOutput() {
        return this.Output;
    }

    /**
     * Set Output information of the video splitting task.
     * @param Output Output information of the video splitting task.
     */
    public void setOutput(TaskOutputMediaInfo Output) {
        this.Output = Output;
    }

    /**
     * Get Task ID of the `Procedure` task type. If a task flow template (`ProcedureName`) is specified in the video split task information list when initiating a video splitting task (https://www.tencentcloud.com/document/api/266/51098?from_cn_redirect=1), the task is initiated when the task flow template specifies one or more of `MediaProcessTask`, `AiAnalysisTask`, and `AiRecognitionTask`. 
     * @return ProcedureTaskId Task ID of the `Procedure` task type. If a task flow template (`ProcedureName`) is specified in the video split task information list when initiating a video splitting task (https://www.tencentcloud.com/document/api/266/51098?from_cn_redirect=1), the task is initiated when the task flow template specifies one or more of `MediaProcessTask`, `AiAnalysisTask`, and `AiRecognitionTask`.
     */
    public String getProcedureTaskId() {
        return this.ProcedureTaskId;
    }

    /**
     * Set Task ID of the `Procedure` task type. If a task flow template (`ProcedureName`) is specified in the video split task information list when initiating a video splitting task (https://www.tencentcloud.com/document/api/266/51098?from_cn_redirect=1), the task is initiated when the task flow template specifies one or more of `MediaProcessTask`, `AiAnalysisTask`, and `AiRecognitionTask`.
     * @param ProcedureTaskId Task ID of the `Procedure` task type. If a task flow template (`ProcedureName`) is specified in the video split task information list when initiating a video splitting task (https://www.tencentcloud.com/document/api/266/51098?from_cn_redirect=1), the task is initiated when the task flow template specifies one or more of `MediaProcessTask`, `AiAnalysisTask`, and `AiRecognitionTask`.
     */
    public void setProcedureTaskId(String ProcedureTaskId) {
        this.ProcedureTaskId = ProcedureTaskId;
    }

    /**
     * Get Task ID of the `ReviewAudioVideo` type. If a task flow template (`ProcedureName`) is specified in the video split task information list when initiating a [video splitting](https://www.tencentcloud.com/document/api/266/51098?from_cn_redirect=1) task, the task is triggered when `ReviewAudioVideoTask` is specified in the task flow template. 
     * @return ReviewAudioVideoTaskId Task ID of the `ReviewAudioVideo` type. If a task flow template (`ProcedureName`) is specified in the video split task information list when initiating a [video splitting](https://www.tencentcloud.com/document/api/266/51098?from_cn_redirect=1) task, the task is triggered when `ReviewAudioVideoTask` is specified in the task flow template.
     */
    public String getReviewAudioVideoTaskId() {
        return this.ReviewAudioVideoTaskId;
    }

    /**
     * Set Task ID of the `ReviewAudioVideo` type. If a task flow template (`ProcedureName`) is specified in the video split task information list when initiating a [video splitting](https://www.tencentcloud.com/document/api/266/51098?from_cn_redirect=1) task, the task is triggered when `ReviewAudioVideoTask` is specified in the task flow template.
     * @param ReviewAudioVideoTaskId Task ID of the `ReviewAudioVideo` type. If a task flow template (`ProcedureName`) is specified in the video split task information list when initiating a [video splitting](https://www.tencentcloud.com/document/api/266/51098?from_cn_redirect=1) task, the task is triggered when `ReviewAudioVideoTask` is specified in the task flow template.
     */
    public void setReviewAudioVideoTaskId(String ReviewAudioVideoTaskId) {
        this.ReviewAudioVideoTaskId = ReviewAudioVideoTaskId;
    }

    public SplitMediaTaskSegmentInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SplitMediaTaskSegmentInfo(SplitMediaTaskSegmentInfo source) {
        if (source.Input != null) {
            this.Input = new SplitMediaTaskInput(source.Input);
        }
        if (source.Output != null) {
            this.Output = new TaskOutputMediaInfo(source.Output);
        }
        if (source.ProcedureTaskId != null) {
            this.ProcedureTaskId = new String(source.ProcedureTaskId);
        }
        if (source.ReviewAudioVideoTaskId != null) {
            this.ReviewAudioVideoTaskId = new String(source.ReviewAudioVideoTaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Input.", this.Input);
        this.setParamObj(map, prefix + "Output.", this.Output);
        this.setParamSimple(map, prefix + "ProcedureTaskId", this.ProcedureTaskId);
        this.setParamSimple(map, prefix + "ReviewAudioVideoTaskId", this.ReviewAudioVideoTaskId);

    }
}


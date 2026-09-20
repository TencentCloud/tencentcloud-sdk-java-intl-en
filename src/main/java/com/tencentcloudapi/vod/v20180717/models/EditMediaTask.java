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

public class EditMediaTask extends AbstractModel {

    /**
    * Task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Task stream status. Valid values:
<li>PROCESSING: Processing;</li>
<li>FINISH: completed</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Error code. 0 indicates success. Other values indicate failure:
<li>40000: invalid input parameters. Check the input parameters;</li>
<li>60000: Source file error (for example, video data damage). Confirm whether the source file is normal;</li>
<li>70000: internal service error. Retry is recommended.</li>
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * Error code. An empty string indicates success, and other values indicate failure. For values, see [Video Processing Error Codes](https://www.tencentcloud.com/document/product/266/50368?from_cn_redirect=1#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81).
    */
    @SerializedName("ErrCodeExt")
    @Expose
    private String ErrCodeExt;

    /**
    * Error message.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Video editing task progress, in the range of [0,100].
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * Input of a video editing task.
    */
    @SerializedName("Input")
    @Expose
    private EditMediaTaskInput Input;

    /**
    * Output of the video editing task.
    */
    @SerializedName("Output")
    @Expose
    private EditMediaTaskOutput Output;

    /**
    * Meta information of the output video.
    */
    @SerializedName("MetaData")
    @Expose
    private MediaMetaData MetaData;

    /**
    * Task ID of the task type `Procedure`. If a task flow template (`ProcedureName`) is specified when initiating a video editing task (https://www.tencentcloud.com/document/api/266/34783?from_cn_redirect=1), the task is initiated when the template specifies one or more of `MediaProcessTask`, `AiAnalysisTask`, and `AiRecognitionTask`.
    */
    @SerializedName("ProcedureTaskId")
    @Expose
    private String ProcedureTaskId;

    /**
    * Task ID of the `ReviewAudioVideo` task type. If a task flow template (`ProcedureName`) is specified when initiating a video editing task (https://www.tencentcloud.com/document/api/266/34783?from_cn_redirect=1), and the task flow template specifies `ReviewAudioVideoTask`, the task is initiated.
    */
    @SerializedName("ReviewAudioVideoTaskId")
    @Expose
    private String ReviewAudioVideoTaskId;

    /**
    * Identifier for deduplication. If a request with the same identifier has been sent within the past seven days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * Source context, which is used to pass through the user request information. The callback for task flow status changes will return the value of this field. The maximum length is 1,000 characters.
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
     * Get Task ID. 
     * @return TaskId Task ID.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID.
     * @param TaskId Task ID.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Task stream status. Valid values:
<li>PROCESSING: Processing;</li>
<li>FINISH: completed</li> 
     * @return Status Task stream status. Valid values:
<li>PROCESSING: Processing;</li>
<li>FINISH: completed</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task stream status. Valid values:
<li>PROCESSING: Processing;</li>
<li>FINISH: completed</li>
     * @param Status Task stream status. Valid values:
<li>PROCESSING: Processing;</li>
<li>FINISH: completed</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Error code. 0 indicates success. Other values indicate failure:
<li>40000: invalid input parameters. Check the input parameters;</li>
<li>60000: Source file error (for example, video data damage). Confirm whether the source file is normal;</li>
<li>70000: internal service error. Retry is recommended.</li> 
     * @return ErrCode Error code. 0 indicates success. Other values indicate failure:
<li>40000: invalid input parameters. Check the input parameters;</li>
<li>60000: Source file error (for example, video data damage). Confirm whether the source file is normal;</li>
<li>70000: internal service error. Retry is recommended.</li>
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set Error code. 0 indicates success. Other values indicate failure:
<li>40000: invalid input parameters. Check the input parameters;</li>
<li>60000: Source file error (for example, video data damage). Confirm whether the source file is normal;</li>
<li>70000: internal service error. Retry is recommended.</li>
     * @param ErrCode Error code. 0 indicates success. Other values indicate failure:
<li>40000: invalid input parameters. Check the input parameters;</li>
<li>60000: Source file error (for example, video data damage). Confirm whether the source file is normal;</li>
<li>70000: internal service error. Retry is recommended.</li>
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get Error code. An empty string indicates success, and other values indicate failure. For values, see [Video Processing Error Codes](https://www.tencentcloud.com/document/product/266/50368?from_cn_redirect=1#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81). 
     * @return ErrCodeExt Error code. An empty string indicates success, and other values indicate failure. For values, see [Video Processing Error Codes](https://www.tencentcloud.com/document/product/266/50368?from_cn_redirect=1#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81).
     */
    public String getErrCodeExt() {
        return this.ErrCodeExt;
    }

    /**
     * Set Error code. An empty string indicates success, and other values indicate failure. For values, see [Video Processing Error Codes](https://www.tencentcloud.com/document/product/266/50368?from_cn_redirect=1#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81).
     * @param ErrCodeExt Error code. An empty string indicates success, and other values indicate failure. For values, see [Video Processing Error Codes](https://www.tencentcloud.com/document/product/266/50368?from_cn_redirect=1#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81).
     */
    public void setErrCodeExt(String ErrCodeExt) {
        this.ErrCodeExt = ErrCodeExt;
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
     * Get Video editing task progress, in the range of [0,100]. 
     * @return Progress Video editing task progress, in the range of [0,100].
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set Video editing task progress, in the range of [0,100].
     * @param Progress Video editing task progress, in the range of [0,100].
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get Input of a video editing task. 
     * @return Input Input of a video editing task.
     */
    public EditMediaTaskInput getInput() {
        return this.Input;
    }

    /**
     * Set Input of a video editing task.
     * @param Input Input of a video editing task.
     */
    public void setInput(EditMediaTaskInput Input) {
        this.Input = Input;
    }

    /**
     * Get Output of the video editing task. 
     * @return Output Output of the video editing task.
     */
    public EditMediaTaskOutput getOutput() {
        return this.Output;
    }

    /**
     * Set Output of the video editing task.
     * @param Output Output of the video editing task.
     */
    public void setOutput(EditMediaTaskOutput Output) {
        this.Output = Output;
    }

    /**
     * Get Meta information of the output video. 
     * @return MetaData Meta information of the output video.
     */
    public MediaMetaData getMetaData() {
        return this.MetaData;
    }

    /**
     * Set Meta information of the output video.
     * @param MetaData Meta information of the output video.
     */
    public void setMetaData(MediaMetaData MetaData) {
        this.MetaData = MetaData;
    }

    /**
     * Get Task ID of the task type `Procedure`. If a task flow template (`ProcedureName`) is specified when initiating a video editing task (https://www.tencentcloud.com/document/api/266/34783?from_cn_redirect=1), the task is initiated when the template specifies one or more of `MediaProcessTask`, `AiAnalysisTask`, and `AiRecognitionTask`. 
     * @return ProcedureTaskId Task ID of the task type `Procedure`. If a task flow template (`ProcedureName`) is specified when initiating a video editing task (https://www.tencentcloud.com/document/api/266/34783?from_cn_redirect=1), the task is initiated when the template specifies one or more of `MediaProcessTask`, `AiAnalysisTask`, and `AiRecognitionTask`.
     */
    public String getProcedureTaskId() {
        return this.ProcedureTaskId;
    }

    /**
     * Set Task ID of the task type `Procedure`. If a task flow template (`ProcedureName`) is specified when initiating a video editing task (https://www.tencentcloud.com/document/api/266/34783?from_cn_redirect=1), the task is initiated when the template specifies one or more of `MediaProcessTask`, `AiAnalysisTask`, and `AiRecognitionTask`.
     * @param ProcedureTaskId Task ID of the task type `Procedure`. If a task flow template (`ProcedureName`) is specified when initiating a video editing task (https://www.tencentcloud.com/document/api/266/34783?from_cn_redirect=1), the task is initiated when the template specifies one or more of `MediaProcessTask`, `AiAnalysisTask`, and `AiRecognitionTask`.
     */
    public void setProcedureTaskId(String ProcedureTaskId) {
        this.ProcedureTaskId = ProcedureTaskId;
    }

    /**
     * Get Task ID of the `ReviewAudioVideo` task type. If a task flow template (`ProcedureName`) is specified when initiating a video editing task (https://www.tencentcloud.com/document/api/266/34783?from_cn_redirect=1), and the task flow template specifies `ReviewAudioVideoTask`, the task is initiated. 
     * @return ReviewAudioVideoTaskId Task ID of the `ReviewAudioVideo` task type. If a task flow template (`ProcedureName`) is specified when initiating a video editing task (https://www.tencentcloud.com/document/api/266/34783?from_cn_redirect=1), and the task flow template specifies `ReviewAudioVideoTask`, the task is initiated.
     */
    public String getReviewAudioVideoTaskId() {
        return this.ReviewAudioVideoTaskId;
    }

    /**
     * Set Task ID of the `ReviewAudioVideo` task type. If a task flow template (`ProcedureName`) is specified when initiating a video editing task (https://www.tencentcloud.com/document/api/266/34783?from_cn_redirect=1), and the task flow template specifies `ReviewAudioVideoTask`, the task is initiated.
     * @param ReviewAudioVideoTaskId Task ID of the `ReviewAudioVideo` task type. If a task flow template (`ProcedureName`) is specified when initiating a video editing task (https://www.tencentcloud.com/document/api/266/34783?from_cn_redirect=1), and the task flow template specifies `ReviewAudioVideoTask`, the task is initiated.
     */
    public void setReviewAudioVideoTaskId(String ReviewAudioVideoTaskId) {
        this.ReviewAudioVideoTaskId = ReviewAudioVideoTaskId;
    }

    /**
     * Get Identifier for deduplication. If a request with the same identifier has been sent within the past seven days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed. 
     * @return SessionId Identifier for deduplication. If a request with the same identifier has been sent within the past seven days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set Identifier for deduplication. If a request with the same identifier has been sent within the past seven days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed.
     * @param SessionId Identifier for deduplication. If a request with the same identifier has been sent within the past seven days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get Source context, which is used to pass through the user request information. The callback for task flow status changes will return the value of this field. The maximum length is 1,000 characters. 
     * @return SessionContext Source context, which is used to pass through the user request information. The callback for task flow status changes will return the value of this field. The maximum length is 1,000 characters.
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set Source context, which is used to pass through the user request information. The callback for task flow status changes will return the value of this field. The maximum length is 1,000 characters.
     * @param SessionContext Source context, which is used to pass through the user request information. The callback for task flow status changes will return the value of this field. The maximum length is 1,000 characters.
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    public EditMediaTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EditMediaTask(EditMediaTask source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrCode != null) {
            this.ErrCode = new Long(source.ErrCode);
        }
        if (source.ErrCodeExt != null) {
            this.ErrCodeExt = new String(source.ErrCodeExt);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.Input != null) {
            this.Input = new EditMediaTaskInput(source.Input);
        }
        if (source.Output != null) {
            this.Output = new EditMediaTaskOutput(source.Output);
        }
        if (source.MetaData != null) {
            this.MetaData = new MediaMetaData(source.MetaData);
        }
        if (source.ProcedureTaskId != null) {
            this.ProcedureTaskId = new String(source.ProcedureTaskId);
        }
        if (source.ReviewAudioVideoTaskId != null) {
            this.ReviewAudioVideoTaskId = new String(source.ReviewAudioVideoTaskId);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "ErrCodeExt", this.ErrCodeExt);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamObj(map, prefix + "Input.", this.Input);
        this.setParamObj(map, prefix + "Output.", this.Output);
        this.setParamObj(map, prefix + "MetaData.", this.MetaData);
        this.setParamSimple(map, prefix + "ProcedureTaskId", this.ProcedureTaskId);
        this.setParamSimple(map, prefix + "ReviewAudioVideoTaskId", this.ReviewAudioVideoTaskId);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);

    }
}


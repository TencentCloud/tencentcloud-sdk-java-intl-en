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

public class AigcAudioTask extends AbstractModel {

    /**
    * <p>Task ID.</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>Task status. Valid values: <li>PROCESSING: Processing; </li><li>FINISH: Completed.</li></p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Error code. A non-zero error code is returned when a source error occurs. If 0 is returned, please use the ErrCode of each specific task.</p>
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * <p>Extended error code. An empty string indicates success, and other values indicate failure.</p><p>Enumeration values:</p><ul><li>RequestLimitExceeded: The call exceeds the concurrency limit.</li><li>InvalidParameter.VoilationContent: The input prompt violates the Content Security Policy.</li><li>InvalidParameterValue: Parameter value error.</li><li>FailedOperation: Model tasks are accumulating.</li><li>InternalError: Internal error.</li><li>InvalidParameter: Invalid parameters.</li><li>InvalidParameter.MediaFormat: Invalid media format.</li><li>ContentModerationFailed: Failed to pass content moderation.</li><li>ResourceInsufficient: Insufficient resources.</li><li>ModelGenerateFailed: Failed to generate the model.</li><li>ResourceNotFound: Resource not found.</li><li>OperationCanceled: Operation canceled.</li><li>TaskTimeout: Task timeout.</li></ul>
    */
    @SerializedName("ErrCodeExt")
    @Expose
    private String ErrCodeExt;

    /**
    * <p>Error message.</p>
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * <p>Task progress. Value range: [0-100].</p>
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * <p>Input information of AIGC audio tasks.</p>
    */
    @SerializedName("Input")
    @Expose
    private AigcAudioTaskInput Input;

    /**
    * <p>Output information of AIGC audio tasks.</p>
    */
    @SerializedName("Output")
    @Expose
    private AigcAudioTaskOutput Output;

    /**
     * Get <p>Task ID.</p> 
     * @return TaskId <p>Task ID.</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>Task ID.</p>
     * @param TaskId <p>Task ID.</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>Task status. Valid values: <li>PROCESSING: Processing; </li><li>FINISH: Completed.</li></p> 
     * @return Status <p>Task status. Valid values: <li>PROCESSING: Processing; </li><li>FINISH: Completed.</li></p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Task status. Valid values: <li>PROCESSING: Processing; </li><li>FINISH: Completed.</li></p>
     * @param Status <p>Task status. Valid values: <li>PROCESSING: Processing; </li><li>FINISH: Completed.</li></p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Error code. A non-zero error code is returned when a source error occurs. If 0 is returned, please use the ErrCode of each specific task.</p> 
     * @return ErrCode <p>Error code. A non-zero error code is returned when a source error occurs. If 0 is returned, please use the ErrCode of each specific task.</p>
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set <p>Error code. A non-zero error code is returned when a source error occurs. If 0 is returned, please use the ErrCode of each specific task.</p>
     * @param ErrCode <p>Error code. A non-zero error code is returned when a source error occurs. If 0 is returned, please use the ErrCode of each specific task.</p>
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get <p>Extended error code. An empty string indicates success, and other values indicate failure.</p><p>Enumeration values:</p><ul><li>RequestLimitExceeded: The call exceeds the concurrency limit.</li><li>InvalidParameter.VoilationContent: The input prompt violates the Content Security Policy.</li><li>InvalidParameterValue: Parameter value error.</li><li>FailedOperation: Model tasks are accumulating.</li><li>InternalError: Internal error.</li><li>InvalidParameter: Invalid parameters.</li><li>InvalidParameter.MediaFormat: Invalid media format.</li><li>ContentModerationFailed: Failed to pass content moderation.</li><li>ResourceInsufficient: Insufficient resources.</li><li>ModelGenerateFailed: Failed to generate the model.</li><li>ResourceNotFound: Resource not found.</li><li>OperationCanceled: Operation canceled.</li><li>TaskTimeout: Task timeout.</li></ul> 
     * @return ErrCodeExt <p>Extended error code. An empty string indicates success, and other values indicate failure.</p><p>Enumeration values:</p><ul><li>RequestLimitExceeded: The call exceeds the concurrency limit.</li><li>InvalidParameter.VoilationContent: The input prompt violates the Content Security Policy.</li><li>InvalidParameterValue: Parameter value error.</li><li>FailedOperation: Model tasks are accumulating.</li><li>InternalError: Internal error.</li><li>InvalidParameter: Invalid parameters.</li><li>InvalidParameter.MediaFormat: Invalid media format.</li><li>ContentModerationFailed: Failed to pass content moderation.</li><li>ResourceInsufficient: Insufficient resources.</li><li>ModelGenerateFailed: Failed to generate the model.</li><li>ResourceNotFound: Resource not found.</li><li>OperationCanceled: Operation canceled.</li><li>TaskTimeout: Task timeout.</li></ul>
     */
    public String getErrCodeExt() {
        return this.ErrCodeExt;
    }

    /**
     * Set <p>Extended error code. An empty string indicates success, and other values indicate failure.</p><p>Enumeration values:</p><ul><li>RequestLimitExceeded: The call exceeds the concurrency limit.</li><li>InvalidParameter.VoilationContent: The input prompt violates the Content Security Policy.</li><li>InvalidParameterValue: Parameter value error.</li><li>FailedOperation: Model tasks are accumulating.</li><li>InternalError: Internal error.</li><li>InvalidParameter: Invalid parameters.</li><li>InvalidParameter.MediaFormat: Invalid media format.</li><li>ContentModerationFailed: Failed to pass content moderation.</li><li>ResourceInsufficient: Insufficient resources.</li><li>ModelGenerateFailed: Failed to generate the model.</li><li>ResourceNotFound: Resource not found.</li><li>OperationCanceled: Operation canceled.</li><li>TaskTimeout: Task timeout.</li></ul>
     * @param ErrCodeExt <p>Extended error code. An empty string indicates success, and other values indicate failure.</p><p>Enumeration values:</p><ul><li>RequestLimitExceeded: The call exceeds the concurrency limit.</li><li>InvalidParameter.VoilationContent: The input prompt violates the Content Security Policy.</li><li>InvalidParameterValue: Parameter value error.</li><li>FailedOperation: Model tasks are accumulating.</li><li>InternalError: Internal error.</li><li>InvalidParameter: Invalid parameters.</li><li>InvalidParameter.MediaFormat: Invalid media format.</li><li>ContentModerationFailed: Failed to pass content moderation.</li><li>ResourceInsufficient: Insufficient resources.</li><li>ModelGenerateFailed: Failed to generate the model.</li><li>ResourceNotFound: Resource not found.</li><li>OperationCanceled: Operation canceled.</li><li>TaskTimeout: Task timeout.</li></ul>
     */
    public void setErrCodeExt(String ErrCodeExt) {
        this.ErrCodeExt = ErrCodeExt;
    }

    /**
     * Get <p>Error message.</p> 
     * @return Message <p>Error message.</p>
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>Error message.</p>
     * @param Message <p>Error message.</p>
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get <p>Task progress. Value range: [0-100].</p> 
     * @return Progress <p>Task progress. Value range: [0-100].</p>
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set <p>Task progress. Value range: [0-100].</p>
     * @param Progress <p>Task progress. Value range: [0-100].</p>
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get <p>Input information of AIGC audio tasks.</p> 
     * @return Input <p>Input information of AIGC audio tasks.</p>
     */
    public AigcAudioTaskInput getInput() {
        return this.Input;
    }

    /**
     * Set <p>Input information of AIGC audio tasks.</p>
     * @param Input <p>Input information of AIGC audio tasks.</p>
     */
    public void setInput(AigcAudioTaskInput Input) {
        this.Input = Input;
    }

    /**
     * Get <p>Output information of AIGC audio tasks.</p> 
     * @return Output <p>Output information of AIGC audio tasks.</p>
     */
    public AigcAudioTaskOutput getOutput() {
        return this.Output;
    }

    /**
     * Set <p>Output information of AIGC audio tasks.</p>
     * @param Output <p>Output information of AIGC audio tasks.</p>
     */
    public void setOutput(AigcAudioTaskOutput Output) {
        this.Output = Output;
    }

    public AigcAudioTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcAudioTask(AigcAudioTask source) {
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
            this.Input = new AigcAudioTaskInput(source.Input);
        }
        if (source.Output != null) {
            this.Output = new AigcAudioTaskOutput(source.Output);
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

    }
}


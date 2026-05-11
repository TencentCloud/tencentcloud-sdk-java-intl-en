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

public class ProcessImageAsync extends AbstractModel {

    /**
    * Task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Task status. Value: <li>PROCESSING: Processing;</li><li>FINISH: Completed.</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Error code. Returns a non-zero error code for source error. For 0, please use the ErrCode of each specific task.
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * Error message.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Task progress, with a value range of [0-100].
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * Input information for asynchronous task processing of images.
    */
    @SerializedName("Input")
    @Expose
    private ProcessImageAsyncInput Input;

    /**
    * Output information of asynchronous image processing tasks.
    */
    @SerializedName("Output")
    @Expose
    private ProcessImageAsyncOutput Output;

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
     * Get Task status. Value: <li>PROCESSING: Processing;</li><li>FINISH: Completed.</li> 
     * @return Status Task status. Value: <li>PROCESSING: Processing;</li><li>FINISH: Completed.</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task status. Value: <li>PROCESSING: Processing;</li><li>FINISH: Completed.</li>
     * @param Status Task status. Value: <li>PROCESSING: Processing;</li><li>FINISH: Completed.</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Error code. Returns a non-zero error code for source error. For 0, please use the ErrCode of each specific task. 
     * @return ErrCode Error code. Returns a non-zero error code for source error. For 0, please use the ErrCode of each specific task.
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set Error code. Returns a non-zero error code for source error. For 0, please use the ErrCode of each specific task.
     * @param ErrCode Error code. Returns a non-zero error code for source error. For 0, please use the ErrCode of each specific task.
     */
    public void setErrCode(Long ErrCode) {
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
     * Get Task progress, with a value range of [0-100]. 
     * @return Progress Task progress, with a value range of [0-100].
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set Task progress, with a value range of [0-100].
     * @param Progress Task progress, with a value range of [0-100].
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get Input information for asynchronous task processing of images. 
     * @return Input Input information for asynchronous task processing of images.
     */
    public ProcessImageAsyncInput getInput() {
        return this.Input;
    }

    /**
     * Set Input information for asynchronous task processing of images.
     * @param Input Input information for asynchronous task processing of images.
     */
    public void setInput(ProcessImageAsyncInput Input) {
        this.Input = Input;
    }

    /**
     * Get Output information of asynchronous image processing tasks. 
     * @return Output Output information of asynchronous image processing tasks.
     */
    public ProcessImageAsyncOutput getOutput() {
        return this.Output;
    }

    /**
     * Set Output information of asynchronous image processing tasks.
     * @param Output Output information of asynchronous image processing tasks.
     */
    public void setOutput(ProcessImageAsyncOutput Output) {
        this.Output = Output;
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

    public ProcessImageAsync() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProcessImageAsync(ProcessImageAsync source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrCode != null) {
            this.ErrCode = new Long(source.ErrCode);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.Input != null) {
            this.Input = new ProcessImageAsyncInput(source.Input);
        }
        if (source.Output != null) {
            this.Output = new ProcessImageAsyncOutput(source.Output);
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
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamObj(map, prefix + "Input.", this.Input);
        this.setParamObj(map, prefix + "Output.", this.Output);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);

    }
}


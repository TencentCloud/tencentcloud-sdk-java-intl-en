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

public class CreateAigcCustomVoiceTask extends AbstractModel {

    /**
    * <p>Task ID.</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>Task status.</p><p>Enumeration value:</p><ul><li>PROCESSING: Processing</li><li>FINISH: Completed</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Error code. A non-zero error code is returned back when a source error occurs. Please use the ErrCode of each specific task when 0 is returned.</p>
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * <p>Extended error code. A null string indicates success, other values indicate failure.</p>
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
    * <p>Task progress, with a value range of [0-100].</p>
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * <p>Create AIGC custom timbre input.</p>
    */
    @SerializedName("Input")
    @Expose
    private CreateAigcCustomVoiceInput Input;

    /**
    * <p>Create custom voice type output message for AIGC.</p>
    */
    @SerializedName("Output")
    @Expose
    private CreateAigcCustomVoiceOutput Output;

    /**
    * <p>Identifier for deduplication. If a request with the same identifier has been sent within the past seven days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed.</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>Source context. This is used to pass user request information. The task status change callback returns the value of this field. The maximum length is 1000 characters.</p>
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

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
     * Get <p>Task status.</p><p>Enumeration value:</p><ul><li>PROCESSING: Processing</li><li>FINISH: Completed</li></ul> 
     * @return Status <p>Task status.</p><p>Enumeration value:</p><ul><li>PROCESSING: Processing</li><li>FINISH: Completed</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Task status.</p><p>Enumeration value:</p><ul><li>PROCESSING: Processing</li><li>FINISH: Completed</li></ul>
     * @param Status <p>Task status.</p><p>Enumeration value:</p><ul><li>PROCESSING: Processing</li><li>FINISH: Completed</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Error code. A non-zero error code is returned back when a source error occurs. Please use the ErrCode of each specific task when 0 is returned.</p> 
     * @return ErrCode <p>Error code. A non-zero error code is returned back when a source error occurs. Please use the ErrCode of each specific task when 0 is returned.</p>
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set <p>Error code. A non-zero error code is returned back when a source error occurs. Please use the ErrCode of each specific task when 0 is returned.</p>
     * @param ErrCode <p>Error code. A non-zero error code is returned back when a source error occurs. Please use the ErrCode of each specific task when 0 is returned.</p>
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get <p>Extended error code. A null string indicates success, other values indicate failure.</p> 
     * @return ErrCodeExt <p>Extended error code. A null string indicates success, other values indicate failure.</p>
     */
    public String getErrCodeExt() {
        return this.ErrCodeExt;
    }

    /**
     * Set <p>Extended error code. A null string indicates success, other values indicate failure.</p>
     * @param ErrCodeExt <p>Extended error code. A null string indicates success, other values indicate failure.</p>
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
     * Get <p>Task progress, with a value range of [0-100].</p> 
     * @return Progress <p>Task progress, with a value range of [0-100].</p>
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set <p>Task progress, with a value range of [0-100].</p>
     * @param Progress <p>Task progress, with a value range of [0-100].</p>
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get <p>Create AIGC custom timbre input.</p> 
     * @return Input <p>Create AIGC custom timbre input.</p>
     */
    public CreateAigcCustomVoiceInput getInput() {
        return this.Input;
    }

    /**
     * Set <p>Create AIGC custom timbre input.</p>
     * @param Input <p>Create AIGC custom timbre input.</p>
     */
    public void setInput(CreateAigcCustomVoiceInput Input) {
        this.Input = Input;
    }

    /**
     * Get <p>Create custom voice type output message for AIGC.</p> 
     * @return Output <p>Create custom voice type output message for AIGC.</p>
     */
    public CreateAigcCustomVoiceOutput getOutput() {
        return this.Output;
    }

    /**
     * Set <p>Create custom voice type output message for AIGC.</p>
     * @param Output <p>Create custom voice type output message for AIGC.</p>
     */
    public void setOutput(CreateAigcCustomVoiceOutput Output) {
        this.Output = Output;
    }

    /**
     * Get <p>Identifier for deduplication. If a request with the same identifier has been sent within the past seven days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed.</p> 
     * @return SessionId <p>Identifier for deduplication. If a request with the same identifier has been sent within the past seven days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed.</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>Identifier for deduplication. If a request with the same identifier has been sent within the past seven days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed.</p>
     * @param SessionId <p>Identifier for deduplication. If a request with the same identifier has been sent within the past seven days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed.</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>Source context. This is used to pass user request information. The task status change callback returns the value of this field. The maximum length is 1000 characters.</p> 
     * @return SessionContext <p>Source context. This is used to pass user request information. The task status change callback returns the value of this field. The maximum length is 1000 characters.</p>
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set <p>Source context. This is used to pass user request information. The task status change callback returns the value of this field. The maximum length is 1000 characters.</p>
     * @param SessionContext <p>Source context. This is used to pass user request information. The task status change callback returns the value of this field. The maximum length is 1000 characters.</p>
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    public CreateAigcCustomVoiceTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAigcCustomVoiceTask(CreateAigcCustomVoiceTask source) {
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
            this.Input = new CreateAigcCustomVoiceInput(source.Input);
        }
        if (source.Output != null) {
            this.Output = new CreateAigcCustomVoiceOutput(source.Output);
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
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);

    }
}


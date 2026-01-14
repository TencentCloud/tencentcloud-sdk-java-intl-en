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

public class SceneAigcImageTask extends AbstractModel {

    /**
    * The task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Task status, value: <li>PROCESSING: processing;</li><li>FINISH: completed.</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Error code. A non-zero error code is returned when the source is abnormal. If 0 is returned, use the ErrCode of each specific task.
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * Error message. If the source is abnormal, the corresponding exception message is returned. Otherwise, use the message of each specific task.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * The execution progress of a single adaptive bitrate stream. Value range: 0-100.
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * Input of AIGC image task.
    */
    @SerializedName("Input")
    @Expose
    private SceneAigcImageTaskInput Input;

    /**
    * Output of AIGC image task.
    */
    @SerializedName("Output")
    @Expose
    private SceneAigcImageTaskOutput Output;

    /**
    * ID used for deduplication. If there was a request with the same ID in the last seven days, the current request will return an error. The ID can contain up to 50 characters. If this parameter is not carried or is left empty, no deduplication will be performed.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * The source context which is used to pass through the user request information. The task flow status change callback will return the value of this parameter. It can contain up to 1000 characters.
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
     * Get The task ID. 
     * @return TaskId The task ID.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set The task ID.
     * @param TaskId The task ID.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Task status, value: <li>PROCESSING: processing;</li><li>FINISH: completed.</li> 
     * @return Status Task status, value: <li>PROCESSING: processing;</li><li>FINISH: completed.</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task status, value: <li>PROCESSING: processing;</li><li>FINISH: completed.</li>
     * @param Status Task status, value: <li>PROCESSING: processing;</li><li>FINISH: completed.</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Error code. A non-zero error code is returned when the source is abnormal. If 0 is returned, use the ErrCode of each specific task. 
     * @return ErrCode Error code. A non-zero error code is returned when the source is abnormal. If 0 is returned, use the ErrCode of each specific task.
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set Error code. A non-zero error code is returned when the source is abnormal. If 0 is returned, use the ErrCode of each specific task.
     * @param ErrCode Error code. A non-zero error code is returned when the source is abnormal. If 0 is returned, use the ErrCode of each specific task.
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get Error message. If the source is abnormal, the corresponding exception message is returned. Otherwise, use the message of each specific task. 
     * @return Message Error message. If the source is abnormal, the corresponding exception message is returned. Otherwise, use the message of each specific task.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Error message. If the source is abnormal, the corresponding exception message is returned. Otherwise, use the message of each specific task.
     * @param Message Error message. If the source is abnormal, the corresponding exception message is returned. Otherwise, use the message of each specific task.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get The execution progress of a single adaptive bitrate stream. Value range: 0-100. 
     * @return Progress The execution progress of a single adaptive bitrate stream. Value range: 0-100.
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set The execution progress of a single adaptive bitrate stream. Value range: 0-100.
     * @param Progress The execution progress of a single adaptive bitrate stream. Value range: 0-100.
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get Input of AIGC image task. 
     * @return Input Input of AIGC image task.
     */
    public SceneAigcImageTaskInput getInput() {
        return this.Input;
    }

    /**
     * Set Input of AIGC image task.
     * @param Input Input of AIGC image task.
     */
    public void setInput(SceneAigcImageTaskInput Input) {
        this.Input = Input;
    }

    /**
     * Get Output of AIGC image task. 
     * @return Output Output of AIGC image task.
     */
    public SceneAigcImageTaskOutput getOutput() {
        return this.Output;
    }

    /**
     * Set Output of AIGC image task.
     * @param Output Output of AIGC image task.
     */
    public void setOutput(SceneAigcImageTaskOutput Output) {
        this.Output = Output;
    }

    /**
     * Get ID used for deduplication. If there was a request with the same ID in the last seven days, the current request will return an error. The ID can contain up to 50 characters. If this parameter is not carried or is left empty, no deduplication will be performed. 
     * @return SessionId ID used for deduplication. If there was a request with the same ID in the last seven days, the current request will return an error. The ID can contain up to 50 characters. If this parameter is not carried or is left empty, no deduplication will be performed.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set ID used for deduplication. If there was a request with the same ID in the last seven days, the current request will return an error. The ID can contain up to 50 characters. If this parameter is not carried or is left empty, no deduplication will be performed.
     * @param SessionId ID used for deduplication. If there was a request with the same ID in the last seven days, the current request will return an error. The ID can contain up to 50 characters. If this parameter is not carried or is left empty, no deduplication will be performed.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get The source context which is used to pass through the user request information. The task flow status change callback will return the value of this parameter. It can contain up to 1000 characters. 
     * @return SessionContext The source context which is used to pass through the user request information. The task flow status change callback will return the value of this parameter. It can contain up to 1000 characters.
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set The source context which is used to pass through the user request information. The task flow status change callback will return the value of this parameter. It can contain up to 1000 characters.
     * @param SessionContext The source context which is used to pass through the user request information. The task flow status change callback will return the value of this parameter. It can contain up to 1000 characters.
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    public SceneAigcImageTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SceneAigcImageTask(SceneAigcImageTask source) {
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
            this.Input = new SceneAigcImageTaskInput(source.Input);
        }
        if (source.Output != null) {
            this.Output = new SceneAigcImageTaskOutput(source.Output);
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


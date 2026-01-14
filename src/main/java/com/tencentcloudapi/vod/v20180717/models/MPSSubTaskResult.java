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
    * Task type. Specific subtask type in the MPS WorkflowTask structure. Value: <li>AiAnalysis.DeLogo: Intelligent erasure task.</li>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * Task status. There are three types: PROCESSING, SUCCESS, and FAIL.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Error code. Returns 0 for success, other values for failure.
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
    * MPS media processing task input. This field corresponds to the Input result in the MPS task response and is returned in JSON format.
    */
    @SerializedName("Input")
    @Expose
    private String Input;

    /**
    * MPS media processing task output.
    */
    @SerializedName("Output")
    @Expose
    private MPSTaskOutput Output;

    /**
     * Get Task type. Specific subtask type in the MPS WorkflowTask structure. Value: <li>AiAnalysis.DeLogo: Intelligent erasure task.</li> 
     * @return TaskType Task type. Specific subtask type in the MPS WorkflowTask structure. Value: <li>AiAnalysis.DeLogo: Intelligent erasure task.</li>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set Task type. Specific subtask type in the MPS WorkflowTask structure. Value: <li>AiAnalysis.DeLogo: Intelligent erasure task.</li>
     * @param TaskType Task type. Specific subtask type in the MPS WorkflowTask structure. Value: <li>AiAnalysis.DeLogo: Intelligent erasure task.</li>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get Task status. There are three types: PROCESSING, SUCCESS, and FAIL. 
     * @return Status Task status. There are three types: PROCESSING, SUCCESS, and FAIL.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task status. There are three types: PROCESSING, SUCCESS, and FAIL.
     * @param Status Task status. There are three types: PROCESSING, SUCCESS, and FAIL.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Error code. Returns 0 for success, other values for failure. 
     * @return ErrCode Error code. Returns 0 for success, other values for failure.
     */
    public String getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set Error code. Returns 0 for success, other values for failure.
     * @param ErrCode Error code. Returns 0 for success, other values for failure.
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
     * Get MPS media processing task input. This field corresponds to the Input result in the MPS task response and is returned in JSON format. 
     * @return Input MPS media processing task input. This field corresponds to the Input result in the MPS task response and is returned in JSON format.
     */
    public String getInput() {
        return this.Input;
    }

    /**
     * Set MPS media processing task input. This field corresponds to the Input result in the MPS task response and is returned in JSON format.
     * @param Input MPS media processing task input. This field corresponds to the Input result in the MPS task response and is returned in JSON format.
     */
    public void setInput(String Input) {
        this.Input = Input;
    }

    /**
     * Get MPS media processing task output. 
     * @return Output MPS media processing task output.
     */
    public MPSTaskOutput getOutput() {
        return this.Output;
    }

    /**
     * Set MPS media processing task output.
     * @param Output MPS media processing task output.
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


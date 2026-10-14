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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiAnalysisTaskReelResult extends AbstractModel {

    /**
    * Task status. Valid values are PROCESSING, SUCCESS, and FAIL.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Error code. 0: Task successful. Other values: Task failed.
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
    * Task input for AI narration and video re-creation.
    */
    @SerializedName("Input")
    @Expose
    private AiAnalysisTaskReelInput Input;

    /**
    * Task output for AI narration and video re-creation.
    */
    @SerializedName("Output")
    @Expose
    private AiAnalysisTaskReelOutput Output;

    /**
    * Error code. A null string indicates that the task is successful, while other values indicate that the task has failed. For valid values, see the list of Media Processing Service (MPS) error codes.
    */
    @SerializedName("ErrCodeExt")
    @Expose
    private String ErrCodeExt;

    /**
    * Task progress.
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * Starting time of task execution, in ISO date and time format.
    */
    @SerializedName("BeginProcessTime")
    @Expose
    private String BeginProcessTime;

    /**
    * Task completion time, in ISO date and time format.
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
     * Get Task status. Valid values are PROCESSING, SUCCESS, and FAIL. 
     * @return Status Task status. Valid values are PROCESSING, SUCCESS, and FAIL.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task status. Valid values are PROCESSING, SUCCESS, and FAIL.
     * @param Status Task status. Valid values are PROCESSING, SUCCESS, and FAIL.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Error code. 0: Task successful. Other values: Task failed. 
     * @return ErrCode Error code. 0: Task successful. Other values: Task failed.
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set Error code. 0: Task successful. Other values: Task failed.
     * @param ErrCode Error code. 0: Task successful. Other values: Task failed.
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
     * Get Task input for AI narration and video re-creation. 
     * @return Input Task input for AI narration and video re-creation.
     */
    public AiAnalysisTaskReelInput getInput() {
        return this.Input;
    }

    /**
     * Set Task input for AI narration and video re-creation.
     * @param Input Task input for AI narration and video re-creation.
     */
    public void setInput(AiAnalysisTaskReelInput Input) {
        this.Input = Input;
    }

    /**
     * Get Task output for AI narration and video re-creation. 
     * @return Output Task output for AI narration and video re-creation.
     */
    public AiAnalysisTaskReelOutput getOutput() {
        return this.Output;
    }

    /**
     * Set Task output for AI narration and video re-creation.
     * @param Output Task output for AI narration and video re-creation.
     */
    public void setOutput(AiAnalysisTaskReelOutput Output) {
        this.Output = Output;
    }

    /**
     * Get Error code. A null string indicates that the task is successful, while other values indicate that the task has failed. For valid values, see the list of Media Processing Service (MPS) error codes. 
     * @return ErrCodeExt Error code. A null string indicates that the task is successful, while other values indicate that the task has failed. For valid values, see the list of Media Processing Service (MPS) error codes.
     */
    public String getErrCodeExt() {
        return this.ErrCodeExt;
    }

    /**
     * Set Error code. A null string indicates that the task is successful, while other values indicate that the task has failed. For valid values, see the list of Media Processing Service (MPS) error codes.
     * @param ErrCodeExt Error code. A null string indicates that the task is successful, while other values indicate that the task has failed. For valid values, see the list of Media Processing Service (MPS) error codes.
     */
    public void setErrCodeExt(String ErrCodeExt) {
        this.ErrCodeExt = ErrCodeExt;
    }

    /**
     * Get Task progress. 
     * @return Progress Task progress.
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set Task progress.
     * @param Progress Task progress.
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get Starting time of task execution, in ISO date and time format. 
     * @return BeginProcessTime Starting time of task execution, in ISO date and time format.
     */
    public String getBeginProcessTime() {
        return this.BeginProcessTime;
    }

    /**
     * Set Starting time of task execution, in ISO date and time format.
     * @param BeginProcessTime Starting time of task execution, in ISO date and time format.
     */
    public void setBeginProcessTime(String BeginProcessTime) {
        this.BeginProcessTime = BeginProcessTime;
    }

    /**
     * Get Task completion time, in ISO date and time format. 
     * @return FinishTime Task completion time, in ISO date and time format.
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set Task completion time, in ISO date and time format.
     * @param FinishTime Task completion time, in ISO date and time format.
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    public AiAnalysisTaskReelResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiAnalysisTaskReelResult(AiAnalysisTaskReelResult source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrCode != null) {
            this.ErrCode = new Long(source.ErrCode);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Input != null) {
            this.Input = new AiAnalysisTaskReelInput(source.Input);
        }
        if (source.Output != null) {
            this.Output = new AiAnalysisTaskReelOutput(source.Output);
        }
        if (source.ErrCodeExt != null) {
            this.ErrCodeExt = new String(source.ErrCodeExt);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.BeginProcessTime != null) {
            this.BeginProcessTime = new String(source.BeginProcessTime);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamObj(map, prefix + "Input.", this.Input);
        this.setParamObj(map, prefix + "Output.", this.Output);
        this.setParamSimple(map, prefix + "ErrCodeExt", this.ErrCodeExt);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "BeginProcessTime", this.BeginProcessTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);

    }
}


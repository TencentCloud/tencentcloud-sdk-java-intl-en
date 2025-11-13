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

public class AiAnalysisTaskVideoComprehensionResult extends AbstractModel {

    /**
    * Task status. Valid values: `PROCESSING`, `SUCCESS`, and `FAIL`.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Error code. 0: successful; other values: failed.
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
    * Input file for video (audio) recognition.
    */
    @SerializedName("Input")
    @Expose
    private AiAnalysisTaskVideoComprehensionInput Input;

    /**
    * Output file for video (audio) recognition.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Output")
    @Expose
    private AiAnalysisTaskVideoComprehensionOutput Output;

    /**
    * Error code. A null string indicates that the task is successful, while other values indicate that the task has failed. For valid values, see the list of MPS error codes.
    */
    @SerializedName("ErrCodeExt")
    @Expose
    private String ErrCodeExt;

    /**
    * Task progress
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
    * Completion time of task execution, in ISO date and time format.
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
     * Get Task status. Valid values: `PROCESSING`, `SUCCESS`, and `FAIL`. 
     * @return Status Task status. Valid values: `PROCESSING`, `SUCCESS`, and `FAIL`.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task status. Valid values: `PROCESSING`, `SUCCESS`, and `FAIL`.
     * @param Status Task status. Valid values: `PROCESSING`, `SUCCESS`, and `FAIL`.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Error code. 0: successful; other values: failed. 
     * @return ErrCode Error code. 0: successful; other values: failed.
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set Error code. 0: successful; other values: failed.
     * @param ErrCode Error code. 0: successful; other values: failed.
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
     * Get Input file for video (audio) recognition. 
     * @return Input Input file for video (audio) recognition.
     */
    public AiAnalysisTaskVideoComprehensionInput getInput() {
        return this.Input;
    }

    /**
     * Set Input file for video (audio) recognition.
     * @param Input Input file for video (audio) recognition.
     */
    public void setInput(AiAnalysisTaskVideoComprehensionInput Input) {
        this.Input = Input;
    }

    /**
     * Get Output file for video (audio) recognition.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Output Output file for video (audio) recognition.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AiAnalysisTaskVideoComprehensionOutput getOutput() {
        return this.Output;
    }

    /**
     * Set Output file for video (audio) recognition.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Output Output file for video (audio) recognition.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOutput(AiAnalysisTaskVideoComprehensionOutput Output) {
        this.Output = Output;
    }

    /**
     * Get Error code. A null string indicates that the task is successful, while other values indicate that the task has failed. For valid values, see the list of MPS error codes. 
     * @return ErrCodeExt Error code. A null string indicates that the task is successful, while other values indicate that the task has failed. For valid values, see the list of MPS error codes.
     */
    public String getErrCodeExt() {
        return this.ErrCodeExt;
    }

    /**
     * Set Error code. A null string indicates that the task is successful, while other values indicate that the task has failed. For valid values, see the list of MPS error codes.
     * @param ErrCodeExt Error code. A null string indicates that the task is successful, while other values indicate that the task has failed. For valid values, see the list of MPS error codes.
     */
    public void setErrCodeExt(String ErrCodeExt) {
        this.ErrCodeExt = ErrCodeExt;
    }

    /**
     * Get Task progress 
     * @return Progress Task progress
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set Task progress
     * @param Progress Task progress
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
     * Get Completion time of task execution, in ISO date and time format. 
     * @return FinishTime Completion time of task execution, in ISO date and time format.
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set Completion time of task execution, in ISO date and time format.
     * @param FinishTime Completion time of task execution, in ISO date and time format.
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    public AiAnalysisTaskVideoComprehensionResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiAnalysisTaskVideoComprehensionResult(AiAnalysisTaskVideoComprehensionResult source) {
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
            this.Input = new AiAnalysisTaskVideoComprehensionInput(source.Input);
        }
        if (source.Output != null) {
            this.Output = new AiAnalysisTaskVideoComprehensionOutput(source.Output);
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


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

public class AIDubbingTaskResult extends AbstractModel {

    /**
    * <p>Task status. Valid values are PROCESSING, SUCCESS, and FAIL.</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Error code. An empty string indicates that the task is successful, while other values indicate that the task has failed. For valid values, see the list of <a href="https://www.tencentcloud.com/document/product/862/50369?from_cn_redirect=1#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81">MPS error codes</a>.</p>
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
    * <p>AI dubbing task input.</p>
    */
    @SerializedName("Input")
    @Expose
    private AIDubbingTaskInput Input;

    /**
    * <p>AI dubbing task output.</p>
    */
    @SerializedName("Output")
    @Expose
    private AIDubbingTaskOutput Output;

    /**
    * <p>Task progress.</p>
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * <p>Starting time of task execution, in ISO date and time format.</p>
    */
    @SerializedName("BeginProcessTime")
    @Expose
    private String BeginProcessTime;

    /**
    * <p>Completion time of task execution, in ISO date format.</p>
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
     * Get <p>Task status. Valid values are PROCESSING, SUCCESS, and FAIL.</p> 
     * @return Status <p>Task status. Valid values are PROCESSING, SUCCESS, and FAIL.</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Task status. Valid values are PROCESSING, SUCCESS, and FAIL.</p>
     * @param Status <p>Task status. Valid values are PROCESSING, SUCCESS, and FAIL.</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Error code. An empty string indicates that the task is successful, while other values indicate that the task has failed. For valid values, see the list of <a href="https://www.tencentcloud.com/document/product/862/50369?from_cn_redirect=1#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81">MPS error codes</a>.</p> 
     * @return ErrCodeExt <p>Error code. An empty string indicates that the task is successful, while other values indicate that the task has failed. For valid values, see the list of <a href="https://www.tencentcloud.com/document/product/862/50369?from_cn_redirect=1#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81">MPS error codes</a>.</p>
     */
    public String getErrCodeExt() {
        return this.ErrCodeExt;
    }

    /**
     * Set <p>Error code. An empty string indicates that the task is successful, while other values indicate that the task has failed. For valid values, see the list of <a href="https://www.tencentcloud.com/document/product/862/50369?from_cn_redirect=1#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81">MPS error codes</a>.</p>
     * @param ErrCodeExt <p>Error code. An empty string indicates that the task is successful, while other values indicate that the task has failed. For valid values, see the list of <a href="https://www.tencentcloud.com/document/product/862/50369?from_cn_redirect=1#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81">MPS error codes</a>.</p>
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
     * Get <p>AI dubbing task input.</p> 
     * @return Input <p>AI dubbing task input.</p>
     */
    public AIDubbingTaskInput getInput() {
        return this.Input;
    }

    /**
     * Set <p>AI dubbing task input.</p>
     * @param Input <p>AI dubbing task input.</p>
     */
    public void setInput(AIDubbingTaskInput Input) {
        this.Input = Input;
    }

    /**
     * Get <p>AI dubbing task output.</p> 
     * @return Output <p>AI dubbing task output.</p>
     */
    public AIDubbingTaskOutput getOutput() {
        return this.Output;
    }

    /**
     * Set <p>AI dubbing task output.</p>
     * @param Output <p>AI dubbing task output.</p>
     */
    public void setOutput(AIDubbingTaskOutput Output) {
        this.Output = Output;
    }

    /**
     * Get <p>Task progress.</p> 
     * @return Progress <p>Task progress.</p>
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set <p>Task progress.</p>
     * @param Progress <p>Task progress.</p>
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get <p>Starting time of task execution, in ISO date and time format.</p> 
     * @return BeginProcessTime <p>Starting time of task execution, in ISO date and time format.</p>
     */
    public String getBeginProcessTime() {
        return this.BeginProcessTime;
    }

    /**
     * Set <p>Starting time of task execution, in ISO date and time format.</p>
     * @param BeginProcessTime <p>Starting time of task execution, in ISO date and time format.</p>
     */
    public void setBeginProcessTime(String BeginProcessTime) {
        this.BeginProcessTime = BeginProcessTime;
    }

    /**
     * Get <p>Completion time of task execution, in ISO date format.</p> 
     * @return FinishTime <p>Completion time of task execution, in ISO date format.</p>
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set <p>Completion time of task execution, in ISO date format.</p>
     * @param FinishTime <p>Completion time of task execution, in ISO date format.</p>
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    public AIDubbingTaskResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIDubbingTaskResult(AIDubbingTaskResult source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrCodeExt != null) {
            this.ErrCodeExt = new String(source.ErrCodeExt);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Input != null) {
            this.Input = new AIDubbingTaskInput(source.Input);
        }
        if (source.Output != null) {
            this.Output = new AIDubbingTaskOutput(source.Output);
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
        this.setParamSimple(map, prefix + "ErrCodeExt", this.ErrCodeExt);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamObj(map, prefix + "Input.", this.Input);
        this.setParamObj(map, prefix + "Output.", this.Output);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "BeginProcessTime", this.BeginProcessTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);

    }
}


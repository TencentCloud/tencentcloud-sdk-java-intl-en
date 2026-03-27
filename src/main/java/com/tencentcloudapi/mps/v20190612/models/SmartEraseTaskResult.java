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

public class SmartEraseTaskResult extends AbstractModel {

    /**
    * Task status, including PROCESSING, SUCCESS, and FAIL.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Error code. An empty string indicates that the task is successful, and other values indicate that the task has failed. For specific values, see [Error Codes] (https://www.tencentcloud.com/document/product/862/50369?from_cn_redirect=1#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81).
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
    * Input of the smart erasure task.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Input")
    @Expose
    private SmartEraseTaskInput Input;

    /**
    * Output of the smart erasure task.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Output")
    @Expose
    private AiAnalysisTaskDelLogoOutput Output;

    /**
    * Task progress.		
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * Task execution start time in ISO datetime format.
    */
    @SerializedName("BeginProcessTime")
    @Expose
    private String BeginProcessTime;

    /**
    * Task execution completion time in ISO datetime format.
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
     * Get Task status, including PROCESSING, SUCCESS, and FAIL. 
     * @return Status Task status, including PROCESSING, SUCCESS, and FAIL.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task status, including PROCESSING, SUCCESS, and FAIL.
     * @param Status Task status, including PROCESSING, SUCCESS, and FAIL.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Error code. An empty string indicates that the task is successful, and other values indicate that the task has failed. For specific values, see [Error Codes] (https://www.tencentcloud.com/document/product/862/50369?from_cn_redirect=1#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81). 
     * @return ErrCodeExt Error code. An empty string indicates that the task is successful, and other values indicate that the task has failed. For specific values, see [Error Codes] (https://www.tencentcloud.com/document/product/862/50369?from_cn_redirect=1#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81).
     */
    public String getErrCodeExt() {
        return this.ErrCodeExt;
    }

    /**
     * Set Error code. An empty string indicates that the task is successful, and other values indicate that the task has failed. For specific values, see [Error Codes] (https://www.tencentcloud.com/document/product/862/50369?from_cn_redirect=1#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81).
     * @param ErrCodeExt Error code. An empty string indicates that the task is successful, and other values indicate that the task has failed. For specific values, see [Error Codes] (https://www.tencentcloud.com/document/product/862/50369?from_cn_redirect=1#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81).
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
     * Get Input of the smart erasure task.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Input Input of the smart erasure task.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public SmartEraseTaskInput getInput() {
        return this.Input;
    }

    /**
     * Set Input of the smart erasure task.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Input Input of the smart erasure task.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setInput(SmartEraseTaskInput Input) {
        this.Input = Input;
    }

    /**
     * Get Output of the smart erasure task.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Output Output of the smart erasure task.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public AiAnalysisTaskDelLogoOutput getOutput() {
        return this.Output;
    }

    /**
     * Set Output of the smart erasure task.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Output Output of the smart erasure task.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOutput(AiAnalysisTaskDelLogoOutput Output) {
        this.Output = Output;
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
     * Get Task execution start time in ISO datetime format. 
     * @return BeginProcessTime Task execution start time in ISO datetime format.
     */
    public String getBeginProcessTime() {
        return this.BeginProcessTime;
    }

    /**
     * Set Task execution start time in ISO datetime format.
     * @param BeginProcessTime Task execution start time in ISO datetime format.
     */
    public void setBeginProcessTime(String BeginProcessTime) {
        this.BeginProcessTime = BeginProcessTime;
    }

    /**
     * Get Task execution completion time in ISO datetime format. 
     * @return FinishTime Task execution completion time in ISO datetime format.
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set Task execution completion time in ISO datetime format.
     * @param FinishTime Task execution completion time in ISO datetime format.
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    public SmartEraseTaskResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmartEraseTaskResult(SmartEraseTaskResult source) {
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
            this.Input = new SmartEraseTaskInput(source.Input);
        }
        if (source.Output != null) {
            this.Output = new AiAnalysisTaskDelLogoOutput(source.Output);
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


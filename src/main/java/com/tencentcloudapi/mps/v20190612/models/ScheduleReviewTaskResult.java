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

public class ScheduleReviewTaskResult extends AbstractModel {

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
    * <p>Error code. 0 indicates success, and other values indicate failure. (This field is not recommended. Use the new error code field ErrCodeExt instead.)</p>
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * <p>Error message.</p>
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * <p>Input of the review task.</p>
    */
    @SerializedName("Input")
    @Expose
    private AiContentReviewTaskInput Input;

    /**
    * <p>Output of the moderation task.</p>
    */
    @SerializedName("Output")
    @Expose
    private AiContentReviewResult [] Output;

    /**
    * <p>Starting time of task execution, in <a href="https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52">ISO date and time format</a>.</p>
    */
    @SerializedName("BeginProcessTime")
    @Expose
    private String BeginProcessTime;

    /**
    * <p>Task completion time, in <a href="https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52">ISO date and time format</a>.</p>
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
     * Get <p>Error code. 0 indicates success, and other values indicate failure. (This field is not recommended. Use the new error code field ErrCodeExt instead.)</p> 
     * @return ErrCode <p>Error code. 0 indicates success, and other values indicate failure. (This field is not recommended. Use the new error code field ErrCodeExt instead.)</p>
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set <p>Error code. 0 indicates success, and other values indicate failure. (This field is not recommended. Use the new error code field ErrCodeExt instead.)</p>
     * @param ErrCode <p>Error code. 0 indicates success, and other values indicate failure. (This field is not recommended. Use the new error code field ErrCodeExt instead.)</p>
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
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
     * Get <p>Input of the review task.</p> 
     * @return Input <p>Input of the review task.</p>
     */
    public AiContentReviewTaskInput getInput() {
        return this.Input;
    }

    /**
     * Set <p>Input of the review task.</p>
     * @param Input <p>Input of the review task.</p>
     */
    public void setInput(AiContentReviewTaskInput Input) {
        this.Input = Input;
    }

    /**
     * Get <p>Output of the moderation task.</p> 
     * @return Output <p>Output of the moderation task.</p>
     */
    public AiContentReviewResult [] getOutput() {
        return this.Output;
    }

    /**
     * Set <p>Output of the moderation task.</p>
     * @param Output <p>Output of the moderation task.</p>
     */
    public void setOutput(AiContentReviewResult [] Output) {
        this.Output = Output;
    }

    /**
     * Get <p>Starting time of task execution, in <a href="https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52">ISO date and time format</a>.</p> 
     * @return BeginProcessTime <p>Starting time of task execution, in <a href="https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52">ISO date and time format</a>.</p>
     */
    public String getBeginProcessTime() {
        return this.BeginProcessTime;
    }

    /**
     * Set <p>Starting time of task execution, in <a href="https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52">ISO date and time format</a>.</p>
     * @param BeginProcessTime <p>Starting time of task execution, in <a href="https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52">ISO date and time format</a>.</p>
     */
    public void setBeginProcessTime(String BeginProcessTime) {
        this.BeginProcessTime = BeginProcessTime;
    }

    /**
     * Get <p>Task completion time, in <a href="https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52">ISO date and time format</a>.</p> 
     * @return FinishTime <p>Task completion time, in <a href="https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52">ISO date and time format</a>.</p>
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set <p>Task completion time, in <a href="https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52">ISO date and time format</a>.</p>
     * @param FinishTime <p>Task completion time, in <a href="https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52">ISO date and time format</a>.</p>
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    public ScheduleReviewTaskResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScheduleReviewTaskResult(ScheduleReviewTaskResult source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrCodeExt != null) {
            this.ErrCodeExt = new String(source.ErrCodeExt);
        }
        if (source.ErrCode != null) {
            this.ErrCode = new Long(source.ErrCode);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Input != null) {
            this.Input = new AiContentReviewTaskInput(source.Input);
        }
        if (source.Output != null) {
            this.Output = new AiContentReviewResult[source.Output.length];
            for (int i = 0; i < source.Output.length; i++) {
                this.Output[i] = new AiContentReviewResult(source.Output[i]);
            }
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
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamObj(map, prefix + "Input.", this.Input);
        this.setParamArrayObj(map, prefix + "Output.", this.Output);
        this.setParamSimple(map, prefix + "BeginProcessTime", this.BeginProcessTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);

    }
}


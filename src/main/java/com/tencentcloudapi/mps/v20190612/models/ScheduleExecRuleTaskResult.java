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

public class ScheduleExecRuleTaskResult extends AbstractModel {

    /**
    * Task status, which can be PROCESSING, SUCCESS, or FAIL.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Error code. An empty string indicates success, while other values indicate failure. For specific values, see the list of MPS error codes at https://www.tencentcloud.com/document/product/862/50369?from_cn_redirect=1#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81.
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
    * Input of the conditional judgment task.
    */
    @SerializedName("Input")
    @Expose
    private ExecRulesTask Input;

    /**
    * Output of the conditional judgment task.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Output")
    @Expose
    private ExecRuleTaskData Output;

    /**
     * Get Task status, which can be PROCESSING, SUCCESS, or FAIL. 
     * @return Status Task status, which can be PROCESSING, SUCCESS, or FAIL.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task status, which can be PROCESSING, SUCCESS, or FAIL.
     * @param Status Task status, which can be PROCESSING, SUCCESS, or FAIL.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Error code. An empty string indicates success, while other values indicate failure. For specific values, see the list of MPS error codes at https://www.tencentcloud.com/document/product/862/50369?from_cn_redirect=1#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81. 
     * @return ErrCodeExt Error code. An empty string indicates success, while other values indicate failure. For specific values, see the list of MPS error codes at https://www.tencentcloud.com/document/product/862/50369?from_cn_redirect=1#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81.
     */
    public String getErrCodeExt() {
        return this.ErrCodeExt;
    }

    /**
     * Set Error code. An empty string indicates success, while other values indicate failure. For specific values, see the list of MPS error codes at https://www.tencentcloud.com/document/product/862/50369?from_cn_redirect=1#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81.
     * @param ErrCodeExt Error code. An empty string indicates success, while other values indicate failure. For specific values, see the list of MPS error codes at https://www.tencentcloud.com/document/product/862/50369?from_cn_redirect=1#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81.
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
     * Get Input of the conditional judgment task. 
     * @return Input Input of the conditional judgment task.
     */
    public ExecRulesTask getInput() {
        return this.Input;
    }

    /**
     * Set Input of the conditional judgment task.
     * @param Input Input of the conditional judgment task.
     */
    public void setInput(ExecRulesTask Input) {
        this.Input = Input;
    }

    /**
     * Get Output of the conditional judgment task.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Output Output of the conditional judgment task.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public ExecRuleTaskData getOutput() {
        return this.Output;
    }

    /**
     * Set Output of the conditional judgment task.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Output Output of the conditional judgment task.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOutput(ExecRuleTaskData Output) {
        this.Output = Output;
    }

    public ScheduleExecRuleTaskResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScheduleExecRuleTaskResult(ScheduleExecRuleTaskResult source) {
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
            this.Input = new ExecRulesTask(source.Input);
        }
        if (source.Output != null) {
            this.Output = new ExecRuleTaskData(source.Output);
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

    }
}


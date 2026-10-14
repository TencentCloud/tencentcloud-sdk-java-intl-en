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

public class AiAnalysisTaskCoverResult extends AbstractModel {

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
    * <p>Intelligent Cover Task input.</p>
    */
    @SerializedName("Input")
    @Expose
    private AiAnalysisTaskCoverInput Input;

    /**
    * <p>Output of the intelligent cover task.</p>
    */
    @SerializedName("Output")
    @Expose
    private AiAnalysisTaskCoverOutput Output;

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
     * Get <p>Intelligent Cover Task input.</p> 
     * @return Input <p>Intelligent Cover Task input.</p>
     */
    public AiAnalysisTaskCoverInput getInput() {
        return this.Input;
    }

    /**
     * Set <p>Intelligent Cover Task input.</p>
     * @param Input <p>Intelligent Cover Task input.</p>
     */
    public void setInput(AiAnalysisTaskCoverInput Input) {
        this.Input = Input;
    }

    /**
     * Get <p>Output of the intelligent cover task.</p> 
     * @return Output <p>Output of the intelligent cover task.</p>
     */
    public AiAnalysisTaskCoverOutput getOutput() {
        return this.Output;
    }

    /**
     * Set <p>Output of the intelligent cover task.</p>
     * @param Output <p>Output of the intelligent cover task.</p>
     */
    public void setOutput(AiAnalysisTaskCoverOutput Output) {
        this.Output = Output;
    }

    public AiAnalysisTaskCoverResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiAnalysisTaskCoverResult(AiAnalysisTaskCoverResult source) {
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
            this.Input = new AiAnalysisTaskCoverInput(source.Input);
        }
        if (source.Output != null) {
            this.Output = new AiAnalysisTaskCoverOutput(source.Output);
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
        this.setParamObj(map, prefix + "Output.", this.Output);

    }
}


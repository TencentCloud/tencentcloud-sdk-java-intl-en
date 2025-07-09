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

public class AiAnalysisTaskHighlightResult extends AbstractModel {

    /**
    * The task status. Valid values: `PROCESSING`, `SUCCESS`, `FAIL`.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Error code. `0`: The task succeeded; other values: The task failed.
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * The error message.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * The input of the intelligent highlight generation task.
    */
    @SerializedName("Input")
    @Expose
    private AiAnalysisTaskHighlightInput Input;

    /**
    * The output of the intelligent highlight generation task.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Output")
    @Expose
    private AiAnalysisTaskHighlightOutput Output;

    /**
     * Get The task status. Valid values: `PROCESSING`, `SUCCESS`, `FAIL`. 
     * @return Status The task status. Valid values: `PROCESSING`, `SUCCESS`, `FAIL`.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set The task status. Valid values: `PROCESSING`, `SUCCESS`, `FAIL`.
     * @param Status The task status. Valid values: `PROCESSING`, `SUCCESS`, `FAIL`.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Error code. `0`: The task succeeded; other values: The task failed. 
     * @return ErrCode Error code. `0`: The task succeeded; other values: The task failed.
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set Error code. `0`: The task succeeded; other values: The task failed.
     * @param ErrCode Error code. `0`: The task succeeded; other values: The task failed.
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get The error message. 
     * @return Message The error message.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set The error message.
     * @param Message The error message.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get The input of the intelligent highlight generation task. 
     * @return Input The input of the intelligent highlight generation task.
     */
    public AiAnalysisTaskHighlightInput getInput() {
        return this.Input;
    }

    /**
     * Set The input of the intelligent highlight generation task.
     * @param Input The input of the intelligent highlight generation task.
     */
    public void setInput(AiAnalysisTaskHighlightInput Input) {
        this.Input = Input;
    }

    /**
     * Get The output of the intelligent highlight generation task.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Output The output of the intelligent highlight generation task.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AiAnalysisTaskHighlightOutput getOutput() {
        return this.Output;
    }

    /**
     * Set The output of the intelligent highlight generation task.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Output The output of the intelligent highlight generation task.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOutput(AiAnalysisTaskHighlightOutput Output) {
        this.Output = Output;
    }

    public AiAnalysisTaskHighlightResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiAnalysisTaskHighlightResult(AiAnalysisTaskHighlightResult source) {
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
            this.Input = new AiAnalysisTaskHighlightInput(source.Input);
        }
        if (source.Output != null) {
            this.Output = new AiAnalysisTaskHighlightOutput(source.Output);
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

    }
}


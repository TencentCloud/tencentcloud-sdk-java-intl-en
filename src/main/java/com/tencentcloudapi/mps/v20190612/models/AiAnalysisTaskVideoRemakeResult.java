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

public class AiAnalysisTaskVideoRemakeResult extends AbstractModel {

    /**
    * Specifies the task status. valid values: `PROCESSING`, `SUCCESS`, and `FAIL`.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Error code. 0: success. other values: failure.
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
    * Deduplication task input.
    */
    @SerializedName("Input")
    @Expose
    private AiAnalysisTaskVideoRemakeInput Input;

    /**
    * Task output.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Output")
    @Expose
    private AiAnalysisTaskVideoRemakeOutput Output;

    /**
     * Get Specifies the task status. valid values: `PROCESSING`, `SUCCESS`, and `FAIL`. 
     * @return Status Specifies the task status. valid values: `PROCESSING`, `SUCCESS`, and `FAIL`.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Specifies the task status. valid values: `PROCESSING`, `SUCCESS`, and `FAIL`.
     * @param Status Specifies the task status. valid values: `PROCESSING`, `SUCCESS`, and `FAIL`.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Error code. 0: success. other values: failure. 
     * @return ErrCode Error code. 0: success. other values: failure.
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set Error code. 0: success. other values: failure.
     * @param ErrCode Error code. 0: success. other values: failure.
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
     * Get Deduplication task input. 
     * @return Input Deduplication task input.
     */
    public AiAnalysisTaskVideoRemakeInput getInput() {
        return this.Input;
    }

    /**
     * Set Deduplication task input.
     * @param Input Deduplication task input.
     */
    public void setInput(AiAnalysisTaskVideoRemakeInput Input) {
        this.Input = Input;
    }

    /**
     * Get Task output.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Output Task output.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public AiAnalysisTaskVideoRemakeOutput getOutput() {
        return this.Output;
    }

    /**
     * Set Task output.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Output Task output.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOutput(AiAnalysisTaskVideoRemakeOutput Output) {
        this.Output = Output;
    }

    public AiAnalysisTaskVideoRemakeResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiAnalysisTaskVideoRemakeResult(AiAnalysisTaskVideoRemakeResult source) {
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
            this.Input = new AiAnalysisTaskVideoRemakeInput(source.Input);
        }
        if (source.Output != null) {
            this.Output = new AiAnalysisTaskVideoRemakeOutput(source.Output);
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


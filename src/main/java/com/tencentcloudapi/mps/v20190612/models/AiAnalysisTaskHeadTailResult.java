/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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

public class AiAnalysisTaskHeadTailResult extends AbstractModel {

    /**
    * Task status, including PROCESSING, SUCCESS, and FAIL.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Error code. `0`: Task successful. Other values: Task failed.
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
    * Opening and closing segments recognition task input.
    */
    @SerializedName("Input")
    @Expose
    private AiAnalysisTaskHeadTailInput Input;

    /**
    * Opening and closing segments recognition task output.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Output")
    @Expose
    private AiAnalysisTaskHeadTailOutput Output;

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
     * Get Error code. `0`: Task successful. Other values: Task failed. 
     * @return ErrCode Error code. `0`: Task successful. Other values: Task failed.
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set Error code. `0`: Task successful. Other values: Task failed.
     * @param ErrCode Error code. `0`: Task successful. Other values: Task failed.
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
     * Get Opening and closing segments recognition task input. 
     * @return Input Opening and closing segments recognition task input.
     */
    public AiAnalysisTaskHeadTailInput getInput() {
        return this.Input;
    }

    /**
     * Set Opening and closing segments recognition task input.
     * @param Input Opening and closing segments recognition task input.
     */
    public void setInput(AiAnalysisTaskHeadTailInput Input) {
        this.Input = Input;
    }

    /**
     * Get Opening and closing segments recognition task output.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Output Opening and closing segments recognition task output.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AiAnalysisTaskHeadTailOutput getOutput() {
        return this.Output;
    }

    /**
     * Set Opening and closing segments recognition task output.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Output Opening and closing segments recognition task output.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOutput(AiAnalysisTaskHeadTailOutput Output) {
        this.Output = Output;
    }

    public AiAnalysisTaskHeadTailResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiAnalysisTaskHeadTailResult(AiAnalysisTaskHeadTailResult source) {
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
            this.Input = new AiAnalysisTaskHeadTailInput(source.Input);
        }
        if (source.Output != null) {
            this.Output = new AiAnalysisTaskHeadTailOutput(source.Output);
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


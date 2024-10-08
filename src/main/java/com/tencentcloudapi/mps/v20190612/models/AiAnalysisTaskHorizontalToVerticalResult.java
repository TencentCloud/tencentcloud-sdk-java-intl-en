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

public class AiAnalysisTaskHorizontalToVerticalResult extends AbstractModel {

    /**
    * Task status, including PROCESSING, SUCCESS, and FAIL.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Error code. 0: Task successful. Other values: Task failed.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * Error message

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Intelligent landscape-to-portrait task input.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Input")
    @Expose
    private AiAnalysisTaskHorizontalToVerticalInput Input;

    /**
    * Intelligent landscape-to-portrait task output.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Output")
    @Expose
    private AiAnalysisTaskHorizontalToVerticalOutput Output;

    /**
     * Get Task status, including PROCESSING, SUCCESS, and FAIL.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Task status, including PROCESSING, SUCCESS, and FAIL.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task status, including PROCESSING, SUCCESS, and FAIL.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Task status, including PROCESSING, SUCCESS, and FAIL.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Error code. 0: Task successful. Other values: Task failed.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ErrCode Error code. 0: Task successful. Other values: Task failed.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set Error code. 0: Task successful. Other values: Task failed.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param ErrCode Error code. 0: Task successful. Other values: Task failed.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get Error message

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Message Error message

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Error message

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Message Error message

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Intelligent landscape-to-portrait task input.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Input Intelligent landscape-to-portrait task input.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AiAnalysisTaskHorizontalToVerticalInput getInput() {
        return this.Input;
    }

    /**
     * Set Intelligent landscape-to-portrait task input.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Input Intelligent landscape-to-portrait task input.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInput(AiAnalysisTaskHorizontalToVerticalInput Input) {
        this.Input = Input;
    }

    /**
     * Get Intelligent landscape-to-portrait task output.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Output Intelligent landscape-to-portrait task output.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AiAnalysisTaskHorizontalToVerticalOutput getOutput() {
        return this.Output;
    }

    /**
     * Set Intelligent landscape-to-portrait task output.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Output Intelligent landscape-to-portrait task output.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOutput(AiAnalysisTaskHorizontalToVerticalOutput Output) {
        this.Output = Output;
    }

    public AiAnalysisTaskHorizontalToVerticalResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiAnalysisTaskHorizontalToVerticalResult(AiAnalysisTaskHorizontalToVerticalResult source) {
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
            this.Input = new AiAnalysisTaskHorizontalToVerticalInput(source.Input);
        }
        if (source.Output != null) {
            this.Output = new AiAnalysisTaskHorizontalToVerticalOutput(source.Output);
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


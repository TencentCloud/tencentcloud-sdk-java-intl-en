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

public class AiAnalysisTaskDelLogoResult extends AbstractModel {

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
    * Intelligent removal task input.
    */
    @SerializedName("Input")
    @Expose
    private AiAnalysisTaskDelLogoInput Input;

    /**
    * Intelligent removal task output.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Output")
    @Expose
    private AiAnalysisTaskDelLogoOutput Output;

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
     * Get Intelligent removal task input. 
     * @return Input Intelligent removal task input.
     */
    public AiAnalysisTaskDelLogoInput getInput() {
        return this.Input;
    }

    /**
     * Set Intelligent removal task input.
     * @param Input Intelligent removal task input.
     */
    public void setInput(AiAnalysisTaskDelLogoInput Input) {
        this.Input = Input;
    }

    /**
     * Get Intelligent removal task output.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Output Intelligent removal task output.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AiAnalysisTaskDelLogoOutput getOutput() {
        return this.Output;
    }

    /**
     * Set Intelligent removal task output.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Output Intelligent removal task output.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOutput(AiAnalysisTaskDelLogoOutput Output) {
        this.Output = Output;
    }

    public AiAnalysisTaskDelLogoResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiAnalysisTaskDelLogoResult(AiAnalysisTaskDelLogoResult source) {
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
            this.Input = new AiAnalysisTaskDelLogoInput(source.Input);
        }
        if (source.Output != null) {
            this.Output = new AiAnalysisTaskDelLogoOutput(source.Output);
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


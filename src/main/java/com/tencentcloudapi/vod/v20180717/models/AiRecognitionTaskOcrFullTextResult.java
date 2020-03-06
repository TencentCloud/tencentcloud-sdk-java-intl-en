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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiRecognitionTaskOcrFullTextResult extends AbstractModel{

    /**
    * Task status. Valid values: PROCESSING, SUCCESS, FAIL.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Error code. 0: success; other values: failure.
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
    * Input information of full text recognition task.
    */
    @SerializedName("Input")
    @Expose
    private AiRecognitionTaskOcrFullTextResultInput Input;

    /**
    * Output information of full text recognition task.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Output")
    @Expose
    private AiRecognitionTaskOcrFullTextResultOutput Output;

    /**
     * Get Task status. Valid values: PROCESSING, SUCCESS, FAIL. 
     * @return Status Task status. Valid values: PROCESSING, SUCCESS, FAIL.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task status. Valid values: PROCESSING, SUCCESS, FAIL.
     * @param Status Task status. Valid values: PROCESSING, SUCCESS, FAIL.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Error code. 0: success; other values: failure. 
     * @return ErrCode Error code. 0: success; other values: failure.
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set Error code. 0: success; other values: failure.
     * @param ErrCode Error code. 0: success; other values: failure.
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
     * Get Input information of full text recognition task. 
     * @return Input Input information of full text recognition task.
     */
    public AiRecognitionTaskOcrFullTextResultInput getInput() {
        return this.Input;
    }

    /**
     * Set Input information of full text recognition task.
     * @param Input Input information of full text recognition task.
     */
    public void setInput(AiRecognitionTaskOcrFullTextResultInput Input) {
        this.Input = Input;
    }

    /**
     * Get Output information of full text recognition task.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Output Output information of full text recognition task.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public AiRecognitionTaskOcrFullTextResultOutput getOutput() {
        return this.Output;
    }

    /**
     * Set Output information of full text recognition task.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Output Output information of full text recognition task.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOutput(AiRecognitionTaskOcrFullTextResultOutput Output) {
        this.Output = Output;
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


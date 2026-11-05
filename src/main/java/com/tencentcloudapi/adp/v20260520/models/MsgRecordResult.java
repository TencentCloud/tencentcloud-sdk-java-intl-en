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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MsgRecordResult extends AbstractModel {

    /**
    * Indicates the call result of the message: 0=CALL_RESULT_UNKNOWN (all/unknown), 1=CALL_RESULT_SUCCESS (success), 2=CALL_RESULT_FAILED (failed). fail_reason (string) describes the failure reason when the call failed.
    */
    @SerializedName("CallResult")
    @Expose
    private Long CallResult;

    /**
    * Custom variable, json string
    */
    @SerializedName("CustomerVariable")
    @Expose
    private String CustomerVariable;

    /**
    * Failure cause.
    */
    @SerializedName("FailReason")
    @Expose
    private String FailReason;

    /**
    * Time to first token
    */
    @SerializedName("FirstTokenLatency")
    @Expose
    private Long FirstTokenLatency;

    /**
    * Number of input tokens.
    */
    @SerializedName("InputToken")
    @Expose
    private Long InputToken;

    /**
    * Number of output tokens.
    */
    @SerializedName("OutputToken")
    @Expose
    private Long OutputToken;

    /**
    * Total number of tokens.
    */
    @SerializedName("TotalToken")
    @Expose
    private Long TotalToken;

    /**
    * Total token duration
    */
    @SerializedName("TotalTokenLatency")
    @Expose
    private Long TotalTokenLatency;

    /**
     * Get Indicates the call result of the message: 0=CALL_RESULT_UNKNOWN (all/unknown), 1=CALL_RESULT_SUCCESS (success), 2=CALL_RESULT_FAILED (failed). fail_reason (string) describes the failure reason when the call failed. 
     * @return CallResult Indicates the call result of the message: 0=CALL_RESULT_UNKNOWN (all/unknown), 1=CALL_RESULT_SUCCESS (success), 2=CALL_RESULT_FAILED (failed). fail_reason (string) describes the failure reason when the call failed.
     */
    public Long getCallResult() {
        return this.CallResult;
    }

    /**
     * Set Indicates the call result of the message: 0=CALL_RESULT_UNKNOWN (all/unknown), 1=CALL_RESULT_SUCCESS (success), 2=CALL_RESULT_FAILED (failed). fail_reason (string) describes the failure reason when the call failed.
     * @param CallResult Indicates the call result of the message: 0=CALL_RESULT_UNKNOWN (all/unknown), 1=CALL_RESULT_SUCCESS (success), 2=CALL_RESULT_FAILED (failed). fail_reason (string) describes the failure reason when the call failed.
     */
    public void setCallResult(Long CallResult) {
        this.CallResult = CallResult;
    }

    /**
     * Get Custom variable, json string 
     * @return CustomerVariable Custom variable, json string
     */
    public String getCustomerVariable() {
        return this.CustomerVariable;
    }

    /**
     * Set Custom variable, json string
     * @param CustomerVariable Custom variable, json string
     */
    public void setCustomerVariable(String CustomerVariable) {
        this.CustomerVariable = CustomerVariable;
    }

    /**
     * Get Failure cause. 
     * @return FailReason Failure cause.
     */
    public String getFailReason() {
        return this.FailReason;
    }

    /**
     * Set Failure cause.
     * @param FailReason Failure cause.
     */
    public void setFailReason(String FailReason) {
        this.FailReason = FailReason;
    }

    /**
     * Get Time to first token 
     * @return FirstTokenLatency Time to first token
     */
    public Long getFirstTokenLatency() {
        return this.FirstTokenLatency;
    }

    /**
     * Set Time to first token
     * @param FirstTokenLatency Time to first token
     */
    public void setFirstTokenLatency(Long FirstTokenLatency) {
        this.FirstTokenLatency = FirstTokenLatency;
    }

    /**
     * Get Number of input tokens. 
     * @return InputToken Number of input tokens.
     */
    public Long getInputToken() {
        return this.InputToken;
    }

    /**
     * Set Number of input tokens.
     * @param InputToken Number of input tokens.
     */
    public void setInputToken(Long InputToken) {
        this.InputToken = InputToken;
    }

    /**
     * Get Number of output tokens. 
     * @return OutputToken Number of output tokens.
     */
    public Long getOutputToken() {
        return this.OutputToken;
    }

    /**
     * Set Number of output tokens.
     * @param OutputToken Number of output tokens.
     */
    public void setOutputToken(Long OutputToken) {
        this.OutputToken = OutputToken;
    }

    /**
     * Get Total number of tokens. 
     * @return TotalToken Total number of tokens.
     */
    public Long getTotalToken() {
        return this.TotalToken;
    }

    /**
     * Set Total number of tokens.
     * @param TotalToken Total number of tokens.
     */
    public void setTotalToken(Long TotalToken) {
        this.TotalToken = TotalToken;
    }

    /**
     * Get Total token duration 
     * @return TotalTokenLatency Total token duration
     */
    public Long getTotalTokenLatency() {
        return this.TotalTokenLatency;
    }

    /**
     * Set Total token duration
     * @param TotalTokenLatency Total token duration
     */
    public void setTotalTokenLatency(Long TotalTokenLatency) {
        this.TotalTokenLatency = TotalTokenLatency;
    }

    public MsgRecordResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MsgRecordResult(MsgRecordResult source) {
        if (source.CallResult != null) {
            this.CallResult = new Long(source.CallResult);
        }
        if (source.CustomerVariable != null) {
            this.CustomerVariable = new String(source.CustomerVariable);
        }
        if (source.FailReason != null) {
            this.FailReason = new String(source.FailReason);
        }
        if (source.FirstTokenLatency != null) {
            this.FirstTokenLatency = new Long(source.FirstTokenLatency);
        }
        if (source.InputToken != null) {
            this.InputToken = new Long(source.InputToken);
        }
        if (source.OutputToken != null) {
            this.OutputToken = new Long(source.OutputToken);
        }
        if (source.TotalToken != null) {
            this.TotalToken = new Long(source.TotalToken);
        }
        if (source.TotalTokenLatency != null) {
            this.TotalTokenLatency = new Long(source.TotalTokenLatency);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CallResult", this.CallResult);
        this.setParamSimple(map, prefix + "CustomerVariable", this.CustomerVariable);
        this.setParamSimple(map, prefix + "FailReason", this.FailReason);
        this.setParamSimple(map, prefix + "FirstTokenLatency", this.FirstTokenLatency);
        this.setParamSimple(map, prefix + "InputToken", this.InputToken);
        this.setParamSimple(map, prefix + "OutputToken", this.OutputToken);
        this.setParamSimple(map, prefix + "TotalToken", this.TotalToken);
        this.setParamSimple(map, prefix + "TotalTokenLatency", this.TotalTokenLatency);

    }
}


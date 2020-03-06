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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Result extends AbstractModel{

    /**
    * It indicates the log output during the function execution. Null is returned for asynchronous invocations.
    */
    @SerializedName("Log")
    @Expose
    private String Log;

    /**
    * It indicates the response from the executed function. Null is returned for asynchronous invocations.
    */
    @SerializedName("RetMsg")
    @Expose
    private String RetMsg;

    /**
    * It indicates the error message of the executed function. Null is returned for asynchronous invocations.
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
    * It indicates the memory size (in bytes) when the function is running. Null is returned for asynchronous invocations.
    */
    @SerializedName("MemUsage")
    @Expose
    private Long MemUsage;

    /**
    * It indicates the duration (in milliseconds) required for running the function. Null is returned for asynchronous invocations.
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * It indicates the billing duration (in milliseconds) for the function. Null is returned for asynchronous invocations.
    */
    @SerializedName("BillDuration")
    @Expose
    private Long BillDuration;

    /**
    * ID of the executed function
    */
    @SerializedName("FunctionRequestId")
    @Expose
    private String FunctionRequestId;

    /**
    * `0` indicates successful execution. Null is returned for asynchronous invocations.
    */
    @SerializedName("InvokeResult")
    @Expose
    private Long InvokeResult;

    /**
     * Get It indicates the log output during the function execution. Null is returned for asynchronous invocations. 
     * @return Log It indicates the log output during the function execution. Null is returned for asynchronous invocations.
     */
    public String getLog() {
        return this.Log;
    }

    /**
     * Set It indicates the log output during the function execution. Null is returned for asynchronous invocations.
     * @param Log It indicates the log output during the function execution. Null is returned for asynchronous invocations.
     */
    public void setLog(String Log) {
        this.Log = Log;
    }

    /**
     * Get It indicates the response from the executed function. Null is returned for asynchronous invocations. 
     * @return RetMsg It indicates the response from the executed function. Null is returned for asynchronous invocations.
     */
    public String getRetMsg() {
        return this.RetMsg;
    }

    /**
     * Set It indicates the response from the executed function. Null is returned for asynchronous invocations.
     * @param RetMsg It indicates the response from the executed function. Null is returned for asynchronous invocations.
     */
    public void setRetMsg(String RetMsg) {
        this.RetMsg = RetMsg;
    }

    /**
     * Get It indicates the error message of the executed function. Null is returned for asynchronous invocations. 
     * @return ErrMsg It indicates the error message of the executed function. Null is returned for asynchronous invocations.
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set It indicates the error message of the executed function. Null is returned for asynchronous invocations.
     * @param ErrMsg It indicates the error message of the executed function. Null is returned for asynchronous invocations.
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    /**
     * Get It indicates the memory size (in bytes) when the function is running. Null is returned for asynchronous invocations. 
     * @return MemUsage It indicates the memory size (in bytes) when the function is running. Null is returned for asynchronous invocations.
     */
    public Long getMemUsage() {
        return this.MemUsage;
    }

    /**
     * Set It indicates the memory size (in bytes) when the function is running. Null is returned for asynchronous invocations.
     * @param MemUsage It indicates the memory size (in bytes) when the function is running. Null is returned for asynchronous invocations.
     */
    public void setMemUsage(Long MemUsage) {
        this.MemUsage = MemUsage;
    }

    /**
     * Get It indicates the duration (in milliseconds) required for running the function. Null is returned for asynchronous invocations. 
     * @return Duration It indicates the duration (in milliseconds) required for running the function. Null is returned for asynchronous invocations.
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set It indicates the duration (in milliseconds) required for running the function. Null is returned for asynchronous invocations.
     * @param Duration It indicates the duration (in milliseconds) required for running the function. Null is returned for asynchronous invocations.
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get It indicates the billing duration (in milliseconds) for the function. Null is returned for asynchronous invocations. 
     * @return BillDuration It indicates the billing duration (in milliseconds) for the function. Null is returned for asynchronous invocations.
     */
    public Long getBillDuration() {
        return this.BillDuration;
    }

    /**
     * Set It indicates the billing duration (in milliseconds) for the function. Null is returned for asynchronous invocations.
     * @param BillDuration It indicates the billing duration (in milliseconds) for the function. Null is returned for asynchronous invocations.
     */
    public void setBillDuration(Long BillDuration) {
        this.BillDuration = BillDuration;
    }

    /**
     * Get ID of the executed function 
     * @return FunctionRequestId ID of the executed function
     */
    public String getFunctionRequestId() {
        return this.FunctionRequestId;
    }

    /**
     * Set ID of the executed function
     * @param FunctionRequestId ID of the executed function
     */
    public void setFunctionRequestId(String FunctionRequestId) {
        this.FunctionRequestId = FunctionRequestId;
    }

    /**
     * Get `0` indicates successful execution. Null is returned for asynchronous invocations. 
     * @return InvokeResult `0` indicates successful execution. Null is returned for asynchronous invocations.
     */
    public Long getInvokeResult() {
        return this.InvokeResult;
    }

    /**
     * Set `0` indicates successful execution. Null is returned for asynchronous invocations.
     * @param InvokeResult `0` indicates successful execution. Null is returned for asynchronous invocations.
     */
    public void setInvokeResult(Long InvokeResult) {
        this.InvokeResult = InvokeResult;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Log", this.Log);
        this.setParamSimple(map, prefix + "RetMsg", this.RetMsg);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);
        this.setParamSimple(map, prefix + "MemUsage", this.MemUsage);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "BillDuration", this.BillDuration);
        this.setParamSimple(map, prefix + "FunctionRequestId", this.FunctionRequestId);
        this.setParamSimple(map, prefix + "InvokeResult", this.InvokeResult);

    }
}


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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FunctionLog extends AbstractModel {

    /**
    * Function name.
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * Returned value after function execution
    */
    @SerializedName("RetMsg")
    @Expose
    private String RetMsg;

    /**
    * requestId for executing the function
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
    * Time point when the function starts execution
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Function execution result. 0 indicates successful execution, 2 indicates the function is running, 3 indicates an execution interrupt, and other values indicate failure.
    */
    @SerializedName("RetCode")
    @Expose
    private Long RetCode;

    /**
    * Whether the function call ends. If so, 1 means execution ended, and additional values indicate a call exception.
    */
    @SerializedName("InvokeFinished")
    @Expose
    private Long InvokeFinished;

    /**
    * Function execution duration in milliseconds.
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * Billing duration of a function. It is rounded up to the nearest 100 ms based on the duration, in ms.
    */
    @SerializedName("BillDuration")
    @Expose
    private Long BillDuration;

    /**
    * Memory size actually consumed during function execution, in bytes.
    */
    @SerializedName("MemUsage")
    @Expose
    private Long MemUsage;

    /**
    * Log output during function execution
    */
    @SerializedName("Log")
    @Expose
    private String Log;

    /**
    * Log level.
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * Log source
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * Number of retries.
    */
    @SerializedName("RetryNum")
    @Expose
    private Long RetryNum;

    /**
     * Get Function name. 
     * @return FunctionName Function name.
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set Function name.
     * @param FunctionName Function name.
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get Returned value after function execution 
     * @return RetMsg Returned value after function execution
     */
    public String getRetMsg() {
        return this.RetMsg;
    }

    /**
     * Set Returned value after function execution
     * @param RetMsg Returned value after function execution
     */
    public void setRetMsg(String RetMsg) {
        this.RetMsg = RetMsg;
    }

    /**
     * Get requestId for executing the function 
     * @return RequestId requestId for executing the function
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set requestId for executing the function
     * @param RequestId requestId for executing the function
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Get Time point when the function starts execution 
     * @return StartTime Time point when the function starts execution
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Time point when the function starts execution
     * @param StartTime Time point when the function starts execution
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Function execution result. 0 indicates successful execution, 2 indicates the function is running, 3 indicates an execution interrupt, and other values indicate failure. 
     * @return RetCode Function execution result. 0 indicates successful execution, 2 indicates the function is running, 3 indicates an execution interrupt, and other values indicate failure.
     */
    public Long getRetCode() {
        return this.RetCode;
    }

    /**
     * Set Function execution result. 0 indicates successful execution, 2 indicates the function is running, 3 indicates an execution interrupt, and other values indicate failure.
     * @param RetCode Function execution result. 0 indicates successful execution, 2 indicates the function is running, 3 indicates an execution interrupt, and other values indicate failure.
     */
    public void setRetCode(Long RetCode) {
        this.RetCode = RetCode;
    }

    /**
     * Get Whether the function call ends. If so, 1 means execution ended, and additional values indicate a call exception. 
     * @return InvokeFinished Whether the function call ends. If so, 1 means execution ended, and additional values indicate a call exception.
     */
    public Long getInvokeFinished() {
        return this.InvokeFinished;
    }

    /**
     * Set Whether the function call ends. If so, 1 means execution ended, and additional values indicate a call exception.
     * @param InvokeFinished Whether the function call ends. If so, 1 means execution ended, and additional values indicate a call exception.
     */
    public void setInvokeFinished(Long InvokeFinished) {
        this.InvokeFinished = InvokeFinished;
    }

    /**
     * Get Function execution duration in milliseconds. 
     * @return Duration Function execution duration in milliseconds.
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set Function execution duration in milliseconds.
     * @param Duration Function execution duration in milliseconds.
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get Billing duration of a function. It is rounded up to the nearest 100 ms based on the duration, in ms. 
     * @return BillDuration Billing duration of a function. It is rounded up to the nearest 100 ms based on the duration, in ms.
     */
    public Long getBillDuration() {
        return this.BillDuration;
    }

    /**
     * Set Billing duration of a function. It is rounded up to the nearest 100 ms based on the duration, in ms.
     * @param BillDuration Billing duration of a function. It is rounded up to the nearest 100 ms based on the duration, in ms.
     */
    public void setBillDuration(Long BillDuration) {
        this.BillDuration = BillDuration;
    }

    /**
     * Get Memory size actually consumed during function execution, in bytes. 
     * @return MemUsage Memory size actually consumed during function execution, in bytes.
     */
    public Long getMemUsage() {
        return this.MemUsage;
    }

    /**
     * Set Memory size actually consumed during function execution, in bytes.
     * @param MemUsage Memory size actually consumed during function execution, in bytes.
     */
    public void setMemUsage(Long MemUsage) {
        this.MemUsage = MemUsage;
    }

    /**
     * Get Log output during function execution 
     * @return Log Log output during function execution
     */
    public String getLog() {
        return this.Log;
    }

    /**
     * Set Log output during function execution
     * @param Log Log output during function execution
     */
    public void setLog(String Log) {
        this.Log = Log;
    }

    /**
     * Get Log level. 
     * @return Level Log level.
     * @deprecated
     */
    @Deprecated
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set Log level.
     * @param Level Log level.
     * @deprecated
     */
    @Deprecated
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get Log source 
     * @return Source Log source
     * @deprecated
     */
    @Deprecated
    public String getSource() {
        return this.Source;
    }

    /**
     * Set Log source
     * @param Source Log source
     * @deprecated
     */
    @Deprecated
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get Number of retries. 
     * @return RetryNum Number of retries.
     */
    public Long getRetryNum() {
        return this.RetryNum;
    }

    /**
     * Set Number of retries.
     * @param RetryNum Number of retries.
     */
    public void setRetryNum(Long RetryNum) {
        this.RetryNum = RetryNum;
    }

    public FunctionLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FunctionLog(FunctionLog source) {
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.RetMsg != null) {
            this.RetMsg = new String(source.RetMsg);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.RetCode != null) {
            this.RetCode = new Long(source.RetCode);
        }
        if (source.InvokeFinished != null) {
            this.InvokeFinished = new Long(source.InvokeFinished);
        }
        if (source.Duration != null) {
            this.Duration = new Float(source.Duration);
        }
        if (source.BillDuration != null) {
            this.BillDuration = new Long(source.BillDuration);
        }
        if (source.MemUsage != null) {
            this.MemUsage = new Long(source.MemUsage);
        }
        if (source.Log != null) {
            this.Log = new String(source.Log);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.RetryNum != null) {
            this.RetryNum = new Long(source.RetryNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "RetMsg", this.RetMsg);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "RetCode", this.RetCode);
        this.setParamSimple(map, prefix + "InvokeFinished", this.InvokeFinished);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "BillDuration", this.BillDuration);
        this.setParamSimple(map, prefix + "MemUsage", this.MemUsage);
        this.setParamSimple(map, prefix + "Log", this.Log);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "RetryNum", this.RetryNum);

    }
}


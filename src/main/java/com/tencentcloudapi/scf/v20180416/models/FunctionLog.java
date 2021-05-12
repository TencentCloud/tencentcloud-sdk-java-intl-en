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

public class FunctionLog extends AbstractModel{

    /**
    * Function name
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * Return value after the function is executed
    */
    @SerializedName("RetMsg")
    @Expose
    private String RetMsg;

    /**
    * RequestId corresponding to the executed function
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
    * Start time of the function execution
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Function execution result. `0` indicates successful execution and other values indicate failure.
    */
    @SerializedName("RetCode")
    @Expose
    private Long RetCode;

    /**
    * It specifies whether the function invocation is finished. `1` indicates execution completion and other values indicate that exceptions occurred during the invocation.
    */
    @SerializedName("InvokeFinished")
    @Expose
    private Long InvokeFinished;

    /**
    * Duration of the function execution. The unit is millisecond (ms).
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * Function billing duration. The unit is millisecond (ms). The value is rounded up to a multiple of 100 ms.
    */
    @SerializedName("BillDuration")
    @Expose
    private Long BillDuration;

    /**
    * Actual memory size used during the function execution. The unit is byte.
    */
    @SerializedName("MemUsage")
    @Expose
    private Long MemUsage;

    /**
    * Function execution logs
    */
    @SerializedName("Log")
    @Expose
    private String Log;

    /**
    * Log level
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
    * Number of retries
    */
    @SerializedName("RetryNum")
    @Expose
    private Long RetryNum;

    /**
     * Get Function name 
     * @return FunctionName Function name
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set Function name
     * @param FunctionName Function name
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get Return value after the function is executed 
     * @return RetMsg Return value after the function is executed
     */
    public String getRetMsg() {
        return this.RetMsg;
    }

    /**
     * Set Return value after the function is executed
     * @param RetMsg Return value after the function is executed
     */
    public void setRetMsg(String RetMsg) {
        this.RetMsg = RetMsg;
    }

    /**
     * Get RequestId corresponding to the executed function 
     * @return RequestId RequestId corresponding to the executed function
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set RequestId corresponding to the executed function
     * @param RequestId RequestId corresponding to the executed function
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Get Start time of the function execution 
     * @return StartTime Start time of the function execution
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time of the function execution
     * @param StartTime Start time of the function execution
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Function execution result. `0` indicates successful execution and other values indicate failure. 
     * @return RetCode Function execution result. `0` indicates successful execution and other values indicate failure.
     */
    public Long getRetCode() {
        return this.RetCode;
    }

    /**
     * Set Function execution result. `0` indicates successful execution and other values indicate failure.
     * @param RetCode Function execution result. `0` indicates successful execution and other values indicate failure.
     */
    public void setRetCode(Long RetCode) {
        this.RetCode = RetCode;
    }

    /**
     * Get It specifies whether the function invocation is finished. `1` indicates execution completion and other values indicate that exceptions occurred during the invocation. 
     * @return InvokeFinished It specifies whether the function invocation is finished. `1` indicates execution completion and other values indicate that exceptions occurred during the invocation.
     */
    public Long getInvokeFinished() {
        return this.InvokeFinished;
    }

    /**
     * Set It specifies whether the function invocation is finished. `1` indicates execution completion and other values indicate that exceptions occurred during the invocation.
     * @param InvokeFinished It specifies whether the function invocation is finished. `1` indicates execution completion and other values indicate that exceptions occurred during the invocation.
     */
    public void setInvokeFinished(Long InvokeFinished) {
        this.InvokeFinished = InvokeFinished;
    }

    /**
     * Get Duration of the function execution. The unit is millisecond (ms). 
     * @return Duration Duration of the function execution. The unit is millisecond (ms).
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set Duration of the function execution. The unit is millisecond (ms).
     * @param Duration Duration of the function execution. The unit is millisecond (ms).
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get Function billing duration. The unit is millisecond (ms). The value is rounded up to a multiple of 100 ms. 
     * @return BillDuration Function billing duration. The unit is millisecond (ms). The value is rounded up to a multiple of 100 ms.
     */
    public Long getBillDuration() {
        return this.BillDuration;
    }

    /**
     * Set Function billing duration. The unit is millisecond (ms). The value is rounded up to a multiple of 100 ms.
     * @param BillDuration Function billing duration. The unit is millisecond (ms). The value is rounded up to a multiple of 100 ms.
     */
    public void setBillDuration(Long BillDuration) {
        this.BillDuration = BillDuration;
    }

    /**
     * Get Actual memory size used during the function execution. The unit is byte. 
     * @return MemUsage Actual memory size used during the function execution. The unit is byte.
     */
    public Long getMemUsage() {
        return this.MemUsage;
    }

    /**
     * Set Actual memory size used during the function execution. The unit is byte.
     * @param MemUsage Actual memory size used during the function execution. The unit is byte.
     */
    public void setMemUsage(Long MemUsage) {
        this.MemUsage = MemUsage;
    }

    /**
     * Get Function execution logs 
     * @return Log Function execution logs
     */
    public String getLog() {
        return this.Log;
    }

    /**
     * Set Function execution logs
     * @param Log Function execution logs
     */
    public void setLog(String Log) {
        this.Log = Log;
    }

    /**
     * Get Log level 
     * @return Level Log level
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set Log level
     * @param Level Log level
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get Log source 
     * @return Source Log source
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set Log source
     * @param Source Log source
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get Number of retries 
     * @return RetryNum Number of retries
     */
    public Long getRetryNum() {
        return this.RetryNum;
    }

    /**
     * Set Number of retries
     * @param RetryNum Number of retries
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


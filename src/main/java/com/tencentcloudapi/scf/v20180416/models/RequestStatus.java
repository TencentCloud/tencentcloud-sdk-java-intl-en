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

public class RequestStatus extends AbstractModel{

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
    * Request ID
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
    * Request start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Result of the request. `0`: succeeded, `1`: running, `-1`: exception
    */
    @SerializedName("RetCode")
    @Expose
    private Long RetCode;

    /**
    * Time consumed for the request in ms
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * Time consumed by the request in MB
    */
    @SerializedName("MemUsage")
    @Expose
    private Float MemUsage;

    /**
    * Retry Attempts
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
     * Get Request ID 
     * @return RequestId Request ID
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set Request ID
     * @param RequestId Request ID
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Get Request start time 
     * @return StartTime Request start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Request start time
     * @param StartTime Request start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Result of the request. `0`: succeeded, `1`: running, `-1`: exception 
     * @return RetCode Result of the request. `0`: succeeded, `1`: running, `-1`: exception
     */
    public Long getRetCode() {
        return this.RetCode;
    }

    /**
     * Set Result of the request. `0`: succeeded, `1`: running, `-1`: exception
     * @param RetCode Result of the request. `0`: succeeded, `1`: running, `-1`: exception
     */
    public void setRetCode(Long RetCode) {
        this.RetCode = RetCode;
    }

    /**
     * Get Time consumed for the request in ms 
     * @return Duration Time consumed for the request in ms
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set Time consumed for the request in ms
     * @param Duration Time consumed for the request in ms
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get Time consumed by the request in MB 
     * @return MemUsage Time consumed by the request in MB
     */
    public Float getMemUsage() {
        return this.MemUsage;
    }

    /**
     * Set Time consumed by the request in MB
     * @param MemUsage Time consumed by the request in MB
     */
    public void setMemUsage(Float MemUsage) {
        this.MemUsage = MemUsage;
    }

    /**
     * Get Retry Attempts 
     * @return RetryNum Retry Attempts
     */
    public Long getRetryNum() {
        return this.RetryNum;
    }

    /**
     * Set Retry Attempts
     * @param RetryNum Retry Attempts
     */
    public void setRetryNum(Long RetryNum) {
        this.RetryNum = RetryNum;
    }

    public RequestStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RequestStatus(RequestStatus source) {
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
        if (source.Duration != null) {
            this.Duration = new Float(source.Duration);
        }
        if (source.MemUsage != null) {
            this.MemUsage = new Float(source.MemUsage);
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
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "MemUsage", this.MemUsage);
        this.setParamSimple(map, prefix + "RetryNum", this.RetryNum);

    }
}


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
package com.tencentcloudapi.tat.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InvokerRecord extends AbstractModel {

    /**
    * Invoker ID.
    */
    @SerializedName("InvokerId")
    @Expose
    private String InvokerId;

    /**
    * Execution time.
    */
    @SerializedName("InvokeTime")
    @Expose
    private String InvokeTime;

    /**
    * Execution reason.
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * Command execution ID.
    */
    @SerializedName("InvocationId")
    @Expose
    private String InvocationId;

    /**
    * Trigger result.
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
     * Get Invoker ID. 
     * @return InvokerId Invoker ID.
     */
    public String getInvokerId() {
        return this.InvokerId;
    }

    /**
     * Set Invoker ID.
     * @param InvokerId Invoker ID.
     */
    public void setInvokerId(String InvokerId) {
        this.InvokerId = InvokerId;
    }

    /**
     * Get Execution time. 
     * @return InvokeTime Execution time.
     */
    public String getInvokeTime() {
        return this.InvokeTime;
    }

    /**
     * Set Execution time.
     * @param InvokeTime Execution time.
     */
    public void setInvokeTime(String InvokeTime) {
        this.InvokeTime = InvokeTime;
    }

    /**
     * Get Execution reason. 
     * @return Reason Execution reason.
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set Execution reason.
     * @param Reason Execution reason.
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get Command execution ID. 
     * @return InvocationId Command execution ID.
     */
    public String getInvocationId() {
        return this.InvocationId;
    }

    /**
     * Set Command execution ID.
     * @param InvocationId Command execution ID.
     */
    public void setInvocationId(String InvocationId) {
        this.InvocationId = InvocationId;
    }

    /**
     * Get Trigger result. 
     * @return Result Trigger result.
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set Trigger result.
     * @param Result Trigger result.
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    public InvokerRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InvokerRecord(InvokerRecord source) {
        if (source.InvokerId != null) {
            this.InvokerId = new String(source.InvokerId);
        }
        if (source.InvokeTime != null) {
            this.InvokeTime = new String(source.InvokeTime);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.InvocationId != null) {
            this.InvocationId = new String(source.InvocationId);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InvokerId", this.InvokerId);
        this.setParamSimple(map, prefix + "InvokeTime", this.InvokeTime);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "InvocationId", this.InvocationId);
        this.setParamSimple(map, prefix + "Result", this.Result);

    }
}


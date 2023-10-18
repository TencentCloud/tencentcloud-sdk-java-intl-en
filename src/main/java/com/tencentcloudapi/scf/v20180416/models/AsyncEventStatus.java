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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AsyncEventStatus extends AbstractModel {

    /**
    * Async event status. Values: `RUNNING` (running); `FINISHED` (invoked successfully); `ABORTED` (invocation ended); `FAILED` (invocation failed).
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Request status code
    */
    @SerializedName("StatusCode")
    @Expose
    private Long StatusCode;

    /**
    * Async execution request ID
    */
    @SerializedName("InvokeRequestId")
    @Expose
    private String InvokeRequestId;

    /**
     * Get Async event status. Values: `RUNNING` (running); `FINISHED` (invoked successfully); `ABORTED` (invocation ended); `FAILED` (invocation failed). 
     * @return Status Async event status. Values: `RUNNING` (running); `FINISHED` (invoked successfully); `ABORTED` (invocation ended); `FAILED` (invocation failed).
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Async event status. Values: `RUNNING` (running); `FINISHED` (invoked successfully); `ABORTED` (invocation ended); `FAILED` (invocation failed).
     * @param Status Async event status. Values: `RUNNING` (running); `FINISHED` (invoked successfully); `ABORTED` (invocation ended); `FAILED` (invocation failed).
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Request status code 
     * @return StatusCode Request status code
     */
    public Long getStatusCode() {
        return this.StatusCode;
    }

    /**
     * Set Request status code
     * @param StatusCode Request status code
     */
    public void setStatusCode(Long StatusCode) {
        this.StatusCode = StatusCode;
    }

    /**
     * Get Async execution request ID 
     * @return InvokeRequestId Async execution request ID
     */
    public String getInvokeRequestId() {
        return this.InvokeRequestId;
    }

    /**
     * Set Async execution request ID
     * @param InvokeRequestId Async execution request ID
     */
    public void setInvokeRequestId(String InvokeRequestId) {
        this.InvokeRequestId = InvokeRequestId;
    }

    public AsyncEventStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AsyncEventStatus(AsyncEventStatus source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StatusCode != null) {
            this.StatusCode = new Long(source.StatusCode);
        }
        if (source.InvokeRequestId != null) {
            this.InvokeRequestId = new String(source.InvokeRequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusCode", this.StatusCode);
        this.setParamSimple(map, prefix + "InvokeRequestId", this.InvokeRequestId);

    }
}


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

public class AsyncEvent extends AbstractModel{

    /**
    * Invocation request ID
    */
    @SerializedName("InvokeRequestId")
    @Expose
    private String InvokeRequestId;

    /**
    * Invocation type
    */
    @SerializedName("InvokeType")
    @Expose
    private String InvokeType;

    /**
    * Function version
    */
    @SerializedName("Qualifier")
    @Expose
    private String Qualifier;

    /**
    * Event status
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Invocation start time in the format of "%Y-%m-%d %H:%M:%S.%f"
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Invocation end time in the format of "%Y-%m-%d %H:%M:%S.%f"
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get Invocation request ID 
     * @return InvokeRequestId Invocation request ID
     */
    public String getInvokeRequestId() {
        return this.InvokeRequestId;
    }

    /**
     * Set Invocation request ID
     * @param InvokeRequestId Invocation request ID
     */
    public void setInvokeRequestId(String InvokeRequestId) {
        this.InvokeRequestId = InvokeRequestId;
    }

    /**
     * Get Invocation type 
     * @return InvokeType Invocation type
     */
    public String getInvokeType() {
        return this.InvokeType;
    }

    /**
     * Set Invocation type
     * @param InvokeType Invocation type
     */
    public void setInvokeType(String InvokeType) {
        this.InvokeType = InvokeType;
    }

    /**
     * Get Function version 
     * @return Qualifier Function version
     */
    public String getQualifier() {
        return this.Qualifier;
    }

    /**
     * Set Function version
     * @param Qualifier Function version
     */
    public void setQualifier(String Qualifier) {
        this.Qualifier = Qualifier;
    }

    /**
     * Get Event status 
     * @return Status Event status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Event status
     * @param Status Event status
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Invocation start time in the format of "%Y-%m-%d %H:%M:%S.%f" 
     * @return StartTime Invocation start time in the format of "%Y-%m-%d %H:%M:%S.%f"
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Invocation start time in the format of "%Y-%m-%d %H:%M:%S.%f"
     * @param StartTime Invocation start time in the format of "%Y-%m-%d %H:%M:%S.%f"
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Invocation end time in the format of "%Y-%m-%d %H:%M:%S.%f" 
     * @return EndTime Invocation end time in the format of "%Y-%m-%d %H:%M:%S.%f"
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Invocation end time in the format of "%Y-%m-%d %H:%M:%S.%f"
     * @param EndTime Invocation end time in the format of "%Y-%m-%d %H:%M:%S.%f"
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public AsyncEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AsyncEvent(AsyncEvent source) {
        if (source.InvokeRequestId != null) {
            this.InvokeRequestId = new String(source.InvokeRequestId);
        }
        if (source.InvokeType != null) {
            this.InvokeType = new String(source.InvokeType);
        }
        if (source.Qualifier != null) {
            this.Qualifier = new String(source.Qualifier);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InvokeRequestId", this.InvokeRequestId);
        this.setParamSimple(map, prefix + "InvokeType", this.InvokeType);
        this.setParamSimple(map, prefix + "Qualifier", this.Qualifier);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}


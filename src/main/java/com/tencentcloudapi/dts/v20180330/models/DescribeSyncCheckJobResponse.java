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
package com.tencentcloudapi.dts.v20180330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSyncCheckJobResponse extends AbstractModel{

    /**
    * Task check status: starting, running, finished
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Code of the task check result
    */
    @SerializedName("ErrorCode")
    @Expose
    private Long ErrorCode;

    /**
    * Prompt message
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * Description of a task execution step
    */
    @SerializedName("StepInfo")
    @Expose
    private SyncCheckStepInfo [] StepInfo;

    /**
    * Check flag. 0: checking; 1: successfully checked
    */
    @SerializedName("CheckFlag")
    @Expose
    private Long CheckFlag;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Task check status: starting, running, finished 
     * @return Status Task check status: starting, running, finished
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task check status: starting, running, finished
     * @param Status Task check status: starting, running, finished
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Code of the task check result 
     * @return ErrorCode Code of the task check result
     */
    public Long getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set Code of the task check result
     * @param ErrorCode Code of the task check result
     */
    public void setErrorCode(Long ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get Prompt message 
     * @return ErrorMessage Prompt message
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set Prompt message
     * @param ErrorMessage Prompt message
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get Description of a task execution step 
     * @return StepInfo Description of a task execution step
     */
    public SyncCheckStepInfo [] getStepInfo() {
        return this.StepInfo;
    }

    /**
     * Set Description of a task execution step
     * @param StepInfo Description of a task execution step
     */
    public void setStepInfo(SyncCheckStepInfo [] StepInfo) {
        this.StepInfo = StepInfo;
    }

    /**
     * Get Check flag. 0: checking; 1: successfully checked 
     * @return CheckFlag Check flag. 0: checking; 1: successfully checked
     */
    public Long getCheckFlag() {
        return this.CheckFlag;
    }

    /**
     * Set Check flag. 0: checking; 1: successfully checked
     * @param CheckFlag Check flag. 0: checking; 1: successfully checked
     */
    public void setCheckFlag(Long CheckFlag) {
        this.CheckFlag = CheckFlag;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeSyncCheckJobResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSyncCheckJobResponse(DescribeSyncCheckJobResponse source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrorCode != null) {
            this.ErrorCode = new Long(source.ErrorCode);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.StepInfo != null) {
            this.StepInfo = new SyncCheckStepInfo[source.StepInfo.length];
            for (int i = 0; i < source.StepInfo.length; i++) {
                this.StepInfo[i] = new SyncCheckStepInfo(source.StepInfo[i]);
            }
        }
        if (source.CheckFlag != null) {
            this.CheckFlag = new Long(source.CheckFlag);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamArrayObj(map, prefix + "StepInfo.", this.StepInfo);
        this.setParamSimple(map, prefix + "CheckFlag", this.CheckFlag);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


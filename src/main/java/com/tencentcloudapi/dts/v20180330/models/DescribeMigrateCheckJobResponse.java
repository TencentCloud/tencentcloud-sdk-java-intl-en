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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMigrateCheckJobResponse extends AbstractModel {

    /**
    * Check task status: unavailable, starting, running, finished
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Task error code
    */
    @SerializedName("ErrorCode")
    @Expose
    private Long ErrorCode;

    /**
    * Task error message
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * Check task progress. For example, "30" means 30% completed
    */
    @SerializedName("Progress")
    @Expose
    private String Progress;

    /**
    * Whether the check succeeds. 0: no; 1: yes; 3: not checked
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
     * Get Check task status: unavailable, starting, running, finished 
     * @return Status Check task status: unavailable, starting, running, finished
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Check task status: unavailable, starting, running, finished
     * @param Status Check task status: unavailable, starting, running, finished
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Task error code 
     * @return ErrorCode Task error code
     */
    public Long getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set Task error code
     * @param ErrorCode Task error code
     */
    public void setErrorCode(Long ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get Task error message 
     * @return ErrorMessage Task error message
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set Task error message
     * @param ErrorMessage Task error message
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get Check task progress. For example, "30" means 30% completed 
     * @return Progress Check task progress. For example, "30" means 30% completed
     */
    public String getProgress() {
        return this.Progress;
    }

    /**
     * Set Check task progress. For example, "30" means 30% completed
     * @param Progress Check task progress. For example, "30" means 30% completed
     */
    public void setProgress(String Progress) {
        this.Progress = Progress;
    }

    /**
     * Get Whether the check succeeds. 0: no; 1: yes; 3: not checked 
     * @return CheckFlag Whether the check succeeds. 0: no; 1: yes; 3: not checked
     */
    public Long getCheckFlag() {
        return this.CheckFlag;
    }

    /**
     * Set Whether the check succeeds. 0: no; 1: yes; 3: not checked
     * @param CheckFlag Whether the check succeeds. 0: no; 1: yes; 3: not checked
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

    public DescribeMigrateCheckJobResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMigrateCheckJobResponse(DescribeMigrateCheckJobResponse source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrorCode != null) {
            this.ErrorCode = new Long(source.ErrorCode);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.Progress != null) {
            this.Progress = new String(source.Progress);
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
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "CheckFlag", this.CheckFlag);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


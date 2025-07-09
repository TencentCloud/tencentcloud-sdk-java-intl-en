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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RetentionExecution extends AbstractModel {

    /**
    * Execution ID
    */
    @SerializedName("ExecutionId")
    @Expose
    private Long ExecutionId;

    /**
    * Rule ID
    */
    @SerializedName("RetentionId")
    @Expose
    private Long RetentionId;

    /**
    * Execution start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Execution end time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Execution status. Valid values: Failed, Succeed, Stopped, InProgress.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get Execution ID 
     * @return ExecutionId Execution ID
     */
    public Long getExecutionId() {
        return this.ExecutionId;
    }

    /**
     * Set Execution ID
     * @param ExecutionId Execution ID
     */
    public void setExecutionId(Long ExecutionId) {
        this.ExecutionId = ExecutionId;
    }

    /**
     * Get Rule ID 
     * @return RetentionId Rule ID
     */
    public Long getRetentionId() {
        return this.RetentionId;
    }

    /**
     * Set Rule ID
     * @param RetentionId Rule ID
     */
    public void setRetentionId(Long RetentionId) {
        this.RetentionId = RetentionId;
    }

    /**
     * Get Execution start time 
     * @return StartTime Execution start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Execution start time
     * @param StartTime Execution start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Execution end time 
     * @return EndTime Execution end time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Execution end time
     * @param EndTime Execution end time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Execution status. Valid values: Failed, Succeed, Stopped, InProgress. 
     * @return Status Execution status. Valid values: Failed, Succeed, Stopped, InProgress.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Execution status. Valid values: Failed, Succeed, Stopped, InProgress.
     * @param Status Execution status. Valid values: Failed, Succeed, Stopped, InProgress.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public RetentionExecution() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RetentionExecution(RetentionExecution source) {
        if (source.ExecutionId != null) {
            this.ExecutionId = new Long(source.ExecutionId);
        }
        if (source.RetentionId != null) {
            this.RetentionId = new Long(source.RetentionId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExecutionId", this.ExecutionId);
        this.setParamSimple(map, prefix + "RetentionId", this.RetentionId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}


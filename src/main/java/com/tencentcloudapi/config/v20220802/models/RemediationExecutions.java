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
package com.tencentcloudapi.config.v20220802.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RemediationExecutions extends AbstractModel {

    /**
    * Remediation status. Valid values: 1 (running), 2 (successful), and 3 (failed).
    */
    @SerializedName("ExecutionStatus")
    @Expose
    private Long ExecutionStatus;

    /**
    * Resource type.
    */
    @SerializedName("ExecutionResourceType")
    @Expose
    private String ExecutionResourceType;

    /**
    * Fixing time
    */
    @SerializedName("ExecutionCreateDate")
    @Expose
    private String ExecutionCreateDate;

    /**
    * Error message
    */
    @SerializedName("ExecutionStatusMessage")
    @Expose
    private String ExecutionStatusMessage;

    /**
    * Resource ID
    */
    @SerializedName("ExecutionResourceIds")
    @Expose
    private String ExecutionResourceIds;

    /**
     * Get Remediation status. Valid values: 1 (running), 2 (successful), and 3 (failed). 
     * @return ExecutionStatus Remediation status. Valid values: 1 (running), 2 (successful), and 3 (failed).
     */
    public Long getExecutionStatus() {
        return this.ExecutionStatus;
    }

    /**
     * Set Remediation status. Valid values: 1 (running), 2 (successful), and 3 (failed).
     * @param ExecutionStatus Remediation status. Valid values: 1 (running), 2 (successful), and 3 (failed).
     */
    public void setExecutionStatus(Long ExecutionStatus) {
        this.ExecutionStatus = ExecutionStatus;
    }

    /**
     * Get Resource type. 
     * @return ExecutionResourceType Resource type.
     */
    public String getExecutionResourceType() {
        return this.ExecutionResourceType;
    }

    /**
     * Set Resource type.
     * @param ExecutionResourceType Resource type.
     */
    public void setExecutionResourceType(String ExecutionResourceType) {
        this.ExecutionResourceType = ExecutionResourceType;
    }

    /**
     * Get Fixing time 
     * @return ExecutionCreateDate Fixing time
     */
    public String getExecutionCreateDate() {
        return this.ExecutionCreateDate;
    }

    /**
     * Set Fixing time
     * @param ExecutionCreateDate Fixing time
     */
    public void setExecutionCreateDate(String ExecutionCreateDate) {
        this.ExecutionCreateDate = ExecutionCreateDate;
    }

    /**
     * Get Error message 
     * @return ExecutionStatusMessage Error message
     */
    public String getExecutionStatusMessage() {
        return this.ExecutionStatusMessage;
    }

    /**
     * Set Error message
     * @param ExecutionStatusMessage Error message
     */
    public void setExecutionStatusMessage(String ExecutionStatusMessage) {
        this.ExecutionStatusMessage = ExecutionStatusMessage;
    }

    /**
     * Get Resource ID 
     * @return ExecutionResourceIds Resource ID
     */
    public String getExecutionResourceIds() {
        return this.ExecutionResourceIds;
    }

    /**
     * Set Resource ID
     * @param ExecutionResourceIds Resource ID
     */
    public void setExecutionResourceIds(String ExecutionResourceIds) {
        this.ExecutionResourceIds = ExecutionResourceIds;
    }

    public RemediationExecutions() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RemediationExecutions(RemediationExecutions source) {
        if (source.ExecutionStatus != null) {
            this.ExecutionStatus = new Long(source.ExecutionStatus);
        }
        if (source.ExecutionResourceType != null) {
            this.ExecutionResourceType = new String(source.ExecutionResourceType);
        }
        if (source.ExecutionCreateDate != null) {
            this.ExecutionCreateDate = new String(source.ExecutionCreateDate);
        }
        if (source.ExecutionStatusMessage != null) {
            this.ExecutionStatusMessage = new String(source.ExecutionStatusMessage);
        }
        if (source.ExecutionResourceIds != null) {
            this.ExecutionResourceIds = new String(source.ExecutionResourceIds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExecutionStatus", this.ExecutionStatus);
        this.setParamSimple(map, prefix + "ExecutionResourceType", this.ExecutionResourceType);
        this.setParamSimple(map, prefix + "ExecutionCreateDate", this.ExecutionCreateDate);
        this.setParamSimple(map, prefix + "ExecutionStatusMessage", this.ExecutionStatusMessage);
        this.setParamSimple(map, prefix + "ExecutionResourceIds", this.ExecutionResourceIds);

    }
}


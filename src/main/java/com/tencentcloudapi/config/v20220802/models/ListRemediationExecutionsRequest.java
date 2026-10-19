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

public class ListRemediationExecutionsRequest extends AbstractModel {

    /**
    * Rule ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Number of items per page. Default value: 20; value range: 1–200.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Pagination offset.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Remediation status. Valid values: 1 (running), 2 (successful), and 3 (failed).
    */
    @SerializedName("ExecutionStatus")
    @Expose
    private Long ExecutionStatus;

    /**
     * Get Rule ID 
     * @return RuleId Rule ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule ID
     * @param RuleId Rule ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Number of items per page. Default value: 20; value range: 1–200. 
     * @return Limit Number of items per page. Default value: 20; value range: 1–200.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of items per page. Default value: 20; value range: 1–200.
     * @param Limit Number of items per page. Default value: 20; value range: 1–200.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Pagination offset. 
     * @return Offset Pagination offset.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset.
     * @param Offset Pagination offset.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

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

    public ListRemediationExecutionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListRemediationExecutionsRequest(ListRemediationExecutionsRequest source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.ExecutionStatus != null) {
            this.ExecutionStatus = new Long(source.ExecutionStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "ExecutionStatus", this.ExecutionStatus);

    }
}


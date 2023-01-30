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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeComplianceTaskPolicyItemSummaryListResponse extends AbstractModel{

    /**
    * ID of the last compliance check task, which is the source of the displayed data.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * Total number of check items
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * List of the aggregated information of each check item
    */
    @SerializedName("PolicyItemSummaryList")
    @Expose
    private CompliancePolicyItemSummary [] PolicyItemSummaryList;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get ID of the last compliance check task, which is the source of the displayed data.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskId ID of the last compliance check task, which is the source of the displayed data.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set ID of the last compliance check task, which is the source of the displayed data.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskId ID of the last compliance check task, which is the source of the displayed data.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Total number of check items 
     * @return TotalCount Total number of check items
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of check items
     * @param TotalCount Total number of check items
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get List of the aggregated information of each check item 
     * @return PolicyItemSummaryList List of the aggregated information of each check item
     */
    public CompliancePolicyItemSummary [] getPolicyItemSummaryList() {
        return this.PolicyItemSummaryList;
    }

    /**
     * Set List of the aggregated information of each check item
     * @param PolicyItemSummaryList List of the aggregated information of each check item
     */
    public void setPolicyItemSummaryList(CompliancePolicyItemSummary [] PolicyItemSummaryList) {
        this.PolicyItemSummaryList = PolicyItemSummaryList;
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

    public DescribeComplianceTaskPolicyItemSummaryListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeComplianceTaskPolicyItemSummaryListResponse(DescribeComplianceTaskPolicyItemSummaryListResponse source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.PolicyItemSummaryList != null) {
            this.PolicyItemSummaryList = new CompliancePolicyItemSummary[source.PolicyItemSummaryList.length];
            for (int i = 0; i < source.PolicyItemSummaryList.length; i++) {
                this.PolicyItemSummaryList[i] = new CompliancePolicyItemSummary(source.PolicyItemSummaryList[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "PolicyItemSummaryList.", this.PolicyItemSummaryList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


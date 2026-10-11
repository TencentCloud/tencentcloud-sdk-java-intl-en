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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InnerWorkflowTaskRun extends AbstractModel {

    /**
    * Current page
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Page Size
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Total number of records
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Total pages
    */
    @SerializedName("TotalPageNumber")
    @Expose
    private Long TotalPageNumber;

    /**
    * Iteration run list
    */
    @SerializedName("Items")
    @Expose
    private InnerWorkflowTaskRunIteration [] Items;

    /**
    * Number of iterations.
    */
    @SerializedName("IterationCount")
    @Expose
    private Long IterationCount;

    /**
    * Number of failures
    */
    @SerializedName("FailureCount")
    @Expose
    private Long FailureCount;

    /**
    * Number of successes
    */
    @SerializedName("SuccessCount")
    @Expose
    private Long SuccessCount;

    /**
    * Built-in workflow ID, which can be obtained through ListWorkflows
    */
    @SerializedName("InnerWorkflowId")
    @Expose
    private String InnerWorkflowId;

    /**
    * Built-in task ID, which can be obtained through ListWorkflowTasks.
    */
    @SerializedName("InnerTaskId")
    @Expose
    private String InnerTaskId;

    /**
    * Statistics on the number of built-in task running statuses (list of key-value pairs for instance business enums)
    */
    @SerializedName("InnerTaskRunBizEnumInfos")
    @Expose
    private ScheduleBizEnumBrief [] InnerTaskRunBizEnumInfos;

    /**
     * Get Current page 
     * @return PageNumber Current page
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Current page
     * @param PageNumber Current page
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Page Size 
     * @return PageSize Page Size
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Page Size
     * @param PageSize Page Size
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Total number of records 
     * @return TotalCount Total number of records
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of records
     * @param TotalCount Total number of records
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Total pages 
     * @return TotalPageNumber Total pages
     */
    public Long getTotalPageNumber() {
        return this.TotalPageNumber;
    }

    /**
     * Set Total pages
     * @param TotalPageNumber Total pages
     */
    public void setTotalPageNumber(Long TotalPageNumber) {
        this.TotalPageNumber = TotalPageNumber;
    }

    /**
     * Get Iteration run list 
     * @return Items Iteration run list
     */
    public InnerWorkflowTaskRunIteration [] getItems() {
        return this.Items;
    }

    /**
     * Set Iteration run list
     * @param Items Iteration run list
     */
    public void setItems(InnerWorkflowTaskRunIteration [] Items) {
        this.Items = Items;
    }

    /**
     * Get Number of iterations. 
     * @return IterationCount Number of iterations.
     */
    public Long getIterationCount() {
        return this.IterationCount;
    }

    /**
     * Set Number of iterations.
     * @param IterationCount Number of iterations.
     */
    public void setIterationCount(Long IterationCount) {
        this.IterationCount = IterationCount;
    }

    /**
     * Get Number of failures 
     * @return FailureCount Number of failures
     */
    public Long getFailureCount() {
        return this.FailureCount;
    }

    /**
     * Set Number of failures
     * @param FailureCount Number of failures
     */
    public void setFailureCount(Long FailureCount) {
        this.FailureCount = FailureCount;
    }

    /**
     * Get Number of successes 
     * @return SuccessCount Number of successes
     */
    public Long getSuccessCount() {
        return this.SuccessCount;
    }

    /**
     * Set Number of successes
     * @param SuccessCount Number of successes
     */
    public void setSuccessCount(Long SuccessCount) {
        this.SuccessCount = SuccessCount;
    }

    /**
     * Get Built-in workflow ID, which can be obtained through ListWorkflows 
     * @return InnerWorkflowId Built-in workflow ID, which can be obtained through ListWorkflows
     */
    public String getInnerWorkflowId() {
        return this.InnerWorkflowId;
    }

    /**
     * Set Built-in workflow ID, which can be obtained through ListWorkflows
     * @param InnerWorkflowId Built-in workflow ID, which can be obtained through ListWorkflows
     */
    public void setInnerWorkflowId(String InnerWorkflowId) {
        this.InnerWorkflowId = InnerWorkflowId;
    }

    /**
     * Get Built-in task ID, which can be obtained through ListWorkflowTasks. 
     * @return InnerTaskId Built-in task ID, which can be obtained through ListWorkflowTasks.
     */
    public String getInnerTaskId() {
        return this.InnerTaskId;
    }

    /**
     * Set Built-in task ID, which can be obtained through ListWorkflowTasks.
     * @param InnerTaskId Built-in task ID, which can be obtained through ListWorkflowTasks.
     */
    public void setInnerTaskId(String InnerTaskId) {
        this.InnerTaskId = InnerTaskId;
    }

    /**
     * Get Statistics on the number of built-in task running statuses (list of key-value pairs for instance business enums) 
     * @return InnerTaskRunBizEnumInfos Statistics on the number of built-in task running statuses (list of key-value pairs for instance business enums)
     */
    public ScheduleBizEnumBrief [] getInnerTaskRunBizEnumInfos() {
        return this.InnerTaskRunBizEnumInfos;
    }

    /**
     * Set Statistics on the number of built-in task running statuses (list of key-value pairs for instance business enums)
     * @param InnerTaskRunBizEnumInfos Statistics on the number of built-in task running statuses (list of key-value pairs for instance business enums)
     */
    public void setInnerTaskRunBizEnumInfos(ScheduleBizEnumBrief [] InnerTaskRunBizEnumInfos) {
        this.InnerTaskRunBizEnumInfos = InnerTaskRunBizEnumInfos;
    }

    public InnerWorkflowTaskRun() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InnerWorkflowTaskRun(InnerWorkflowTaskRun source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.TotalPageNumber != null) {
            this.TotalPageNumber = new Long(source.TotalPageNumber);
        }
        if (source.Items != null) {
            this.Items = new InnerWorkflowTaskRunIteration[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new InnerWorkflowTaskRunIteration(source.Items[i]);
            }
        }
        if (source.IterationCount != null) {
            this.IterationCount = new Long(source.IterationCount);
        }
        if (source.FailureCount != null) {
            this.FailureCount = new Long(source.FailureCount);
        }
        if (source.SuccessCount != null) {
            this.SuccessCount = new Long(source.SuccessCount);
        }
        if (source.InnerWorkflowId != null) {
            this.InnerWorkflowId = new String(source.InnerWorkflowId);
        }
        if (source.InnerTaskId != null) {
            this.InnerTaskId = new String(source.InnerTaskId);
        }
        if (source.InnerTaskRunBizEnumInfos != null) {
            this.InnerTaskRunBizEnumInfos = new ScheduleBizEnumBrief[source.InnerTaskRunBizEnumInfos.length];
            for (int i = 0; i < source.InnerTaskRunBizEnumInfos.length; i++) {
                this.InnerTaskRunBizEnumInfos[i] = new ScheduleBizEnumBrief(source.InnerTaskRunBizEnumInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "TotalPageNumber", this.TotalPageNumber);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "IterationCount", this.IterationCount);
        this.setParamSimple(map, prefix + "FailureCount", this.FailureCount);
        this.setParamSimple(map, prefix + "SuccessCount", this.SuccessCount);
        this.setParamSimple(map, prefix + "InnerWorkflowId", this.InnerWorkflowId);
        this.setParamSimple(map, prefix + "InnerTaskId", this.InnerTaskId);
        this.setParamArrayObj(map, prefix + "InnerTaskRunBizEnumInfos.", this.InnerTaskRunBizEnumInfos);

    }
}


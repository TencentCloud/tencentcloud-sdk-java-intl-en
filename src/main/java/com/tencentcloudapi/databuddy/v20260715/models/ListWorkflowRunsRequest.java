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

public class ListWorkflowRunsRequest extends AbstractModel {

    /**
    * <p>Workspace ID, which can be obtained through ListWorkspaces. Required.</p>
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>Page number. Value range: starts from 1. Optional. Default value: 1.</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>Size per page. Optional. Default: 10. Value range: [10, 200]</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>Workflow ID, exact match. Optional, single value</p>
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * <p>Workflow name keyword for fuzzy matching of WorkflowName. Optional, single value</p>
    */
    @SerializedName("WorkflowNameKeyword")
    @Expose
    private String WorkflowNameKeyword;

    /**
    * <p>Lower bound for the running creation time, range match (CreateTime &gt;= this value), unit: timestamp in milliseconds.<br>Optional, single value, corresponding to the output parameter WorkflowRun.CreateTime</p>
    */
    @SerializedName("CreateStartTime")
    @Expose
    private String CreateStartTime;

    /**
    * <p>Upper bound for the running creation time, range match (CreateTime &lt;= this value), unit: timestamp in milliseconds.<br>Optional, single value, corresponding to the output parameter WorkflowRun.CreateTime</p>
    */
    @SerializedName("CreateEndTime")
    @Expose
    private String CreateEndTime;

    /**
    * <p>RUNNING state. Exact matching. Optional. Multiple selection (multiple values are in OR relationship with each other). RUNNING state. CREATE("initialization"), QUEUED("Waiting"), PENDING("preparing"), RUNNING("RUNNING"), SKIPPED("skip RUNNING"), SUCCESS("successful"), FAILED("failure"), TERMINATING("TERMINATING"), TERMINATED("termination"), CANCELLED("manual termination"), etc.</p>
    */
    @SerializedName("RunStates")
    @Expose
    private String [] RunStates;

    /**
    * <p>Error code, exact match. Optional, multiple selection (OR relationship between multiple values)</p>
    */
    @SerializedName("ErrorCodeStrings")
    @Expose
    private String [] ErrorCodeStrings;

    /**
    * <p>Operator UIN, exact match. Optional, multiple selection (OR relationship between multiple values)</p>
    */
    @SerializedName("RunUserUins")
    @Expose
    private String [] RunUserUins;

    /**
    * <p>Tag name ID, exact match, obtainable through tag-related APIs. Optional, multiple selection (multiple values are in an OR relationship with each other)</p>
    */
    @SerializedName("LabelKeyIds")
    @Expose
    private String [] LabelKeyIds;

    /**
    * <p>Tag value ID. Exact match. It can be obtained through the tag-related API. Optional. Multiple selection (multiple values are in OR relationship with each other)</p>
    */
    @SerializedName("LabelValueIds")
    @Expose
    private String [] LabelValueIds;

    /**
    * <p>Sorting conditions. The priority of multiple conditions is indicated by the array order. Optional. Default: CreateTime Desc.<br>Sortable field allowlist: CreateTime, EndTime, RunCostTime</p>
    */
    @SerializedName("OrderBys")
    @Expose
    private OrderBy [] OrderBys;

    /**
     * Get <p>Workspace ID, which can be obtained through ListWorkspaces. Required.</p> 
     * @return WorkspaceId <p>Workspace ID, which can be obtained through ListWorkspaces. Required.</p>
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set <p>Workspace ID, which can be obtained through ListWorkspaces. Required.</p>
     * @param WorkspaceId <p>Workspace ID, which can be obtained through ListWorkspaces. Required.</p>
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get <p>Page number. Value range: starts from 1. Optional. Default value: 1.</p> 
     * @return PageNumber <p>Page number. Value range: starts from 1. Optional. Default value: 1.</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>Page number. Value range: starts from 1. Optional. Default value: 1.</p>
     * @param PageNumber <p>Page number. Value range: starts from 1. Optional. Default value: 1.</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>Size per page. Optional. Default: 10. Value range: [10, 200]</p> 
     * @return PageSize <p>Size per page. Optional. Default: 10. Value range: [10, 200]</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>Size per page. Optional. Default: 10. Value range: [10, 200]</p>
     * @param PageSize <p>Size per page. Optional. Default: 10. Value range: [10, 200]</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>Workflow ID, exact match. Optional, single value</p> 
     * @return WorkflowId <p>Workflow ID, exact match. Optional, single value</p>
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set <p>Workflow ID, exact match. Optional, single value</p>
     * @param WorkflowId <p>Workflow ID, exact match. Optional, single value</p>
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get <p>Workflow name keyword for fuzzy matching of WorkflowName. Optional, single value</p> 
     * @return WorkflowNameKeyword <p>Workflow name keyword for fuzzy matching of WorkflowName. Optional, single value</p>
     */
    public String getWorkflowNameKeyword() {
        return this.WorkflowNameKeyword;
    }

    /**
     * Set <p>Workflow name keyword for fuzzy matching of WorkflowName. Optional, single value</p>
     * @param WorkflowNameKeyword <p>Workflow name keyword for fuzzy matching of WorkflowName. Optional, single value</p>
     */
    public void setWorkflowNameKeyword(String WorkflowNameKeyword) {
        this.WorkflowNameKeyword = WorkflowNameKeyword;
    }

    /**
     * Get <p>Lower bound for the running creation time, range match (CreateTime &gt;= this value), unit: timestamp in milliseconds.<br>Optional, single value, corresponding to the output parameter WorkflowRun.CreateTime</p> 
     * @return CreateStartTime <p>Lower bound for the running creation time, range match (CreateTime &gt;= this value), unit: timestamp in milliseconds.<br>Optional, single value, corresponding to the output parameter WorkflowRun.CreateTime</p>
     */
    public String getCreateStartTime() {
        return this.CreateStartTime;
    }

    /**
     * Set <p>Lower bound for the running creation time, range match (CreateTime &gt;= this value), unit: timestamp in milliseconds.<br>Optional, single value, corresponding to the output parameter WorkflowRun.CreateTime</p>
     * @param CreateStartTime <p>Lower bound for the running creation time, range match (CreateTime &gt;= this value), unit: timestamp in milliseconds.<br>Optional, single value, corresponding to the output parameter WorkflowRun.CreateTime</p>
     */
    public void setCreateStartTime(String CreateStartTime) {
        this.CreateStartTime = CreateStartTime;
    }

    /**
     * Get <p>Upper bound for the running creation time, range match (CreateTime &lt;= this value), unit: timestamp in milliseconds.<br>Optional, single value, corresponding to the output parameter WorkflowRun.CreateTime</p> 
     * @return CreateEndTime <p>Upper bound for the running creation time, range match (CreateTime &lt;= this value), unit: timestamp in milliseconds.<br>Optional, single value, corresponding to the output parameter WorkflowRun.CreateTime</p>
     */
    public String getCreateEndTime() {
        return this.CreateEndTime;
    }

    /**
     * Set <p>Upper bound for the running creation time, range match (CreateTime &lt;= this value), unit: timestamp in milliseconds.<br>Optional, single value, corresponding to the output parameter WorkflowRun.CreateTime</p>
     * @param CreateEndTime <p>Upper bound for the running creation time, range match (CreateTime &lt;= this value), unit: timestamp in milliseconds.<br>Optional, single value, corresponding to the output parameter WorkflowRun.CreateTime</p>
     */
    public void setCreateEndTime(String CreateEndTime) {
        this.CreateEndTime = CreateEndTime;
    }

    /**
     * Get <p>RUNNING state. Exact matching. Optional. Multiple selection (multiple values are in OR relationship with each other). RUNNING state. CREATE("initialization"), QUEUED("Waiting"), PENDING("preparing"), RUNNING("RUNNING"), SKIPPED("skip RUNNING"), SUCCESS("successful"), FAILED("failure"), TERMINATING("TERMINATING"), TERMINATED("termination"), CANCELLED("manual termination"), etc.</p> 
     * @return RunStates <p>RUNNING state. Exact matching. Optional. Multiple selection (multiple values are in OR relationship with each other). RUNNING state. CREATE("initialization"), QUEUED("Waiting"), PENDING("preparing"), RUNNING("RUNNING"), SKIPPED("skip RUNNING"), SUCCESS("successful"), FAILED("failure"), TERMINATING("TERMINATING"), TERMINATED("termination"), CANCELLED("manual termination"), etc.</p>
     */
    public String [] getRunStates() {
        return this.RunStates;
    }

    /**
     * Set <p>RUNNING state. Exact matching. Optional. Multiple selection (multiple values are in OR relationship with each other). RUNNING state. CREATE("initialization"), QUEUED("Waiting"), PENDING("preparing"), RUNNING("RUNNING"), SKIPPED("skip RUNNING"), SUCCESS("successful"), FAILED("failure"), TERMINATING("TERMINATING"), TERMINATED("termination"), CANCELLED("manual termination"), etc.</p>
     * @param RunStates <p>RUNNING state. Exact matching. Optional. Multiple selection (multiple values are in OR relationship with each other). RUNNING state. CREATE("initialization"), QUEUED("Waiting"), PENDING("preparing"), RUNNING("RUNNING"), SKIPPED("skip RUNNING"), SUCCESS("successful"), FAILED("failure"), TERMINATING("TERMINATING"), TERMINATED("termination"), CANCELLED("manual termination"), etc.</p>
     */
    public void setRunStates(String [] RunStates) {
        this.RunStates = RunStates;
    }

    /**
     * Get <p>Error code, exact match. Optional, multiple selection (OR relationship between multiple values)</p> 
     * @return ErrorCodeStrings <p>Error code, exact match. Optional, multiple selection (OR relationship between multiple values)</p>
     */
    public String [] getErrorCodeStrings() {
        return this.ErrorCodeStrings;
    }

    /**
     * Set <p>Error code, exact match. Optional, multiple selection (OR relationship between multiple values)</p>
     * @param ErrorCodeStrings <p>Error code, exact match. Optional, multiple selection (OR relationship between multiple values)</p>
     */
    public void setErrorCodeStrings(String [] ErrorCodeStrings) {
        this.ErrorCodeStrings = ErrorCodeStrings;
    }

    /**
     * Get <p>Operator UIN, exact match. Optional, multiple selection (OR relationship between multiple values)</p> 
     * @return RunUserUins <p>Operator UIN, exact match. Optional, multiple selection (OR relationship between multiple values)</p>
     */
    public String [] getRunUserUins() {
        return this.RunUserUins;
    }

    /**
     * Set <p>Operator UIN, exact match. Optional, multiple selection (OR relationship between multiple values)</p>
     * @param RunUserUins <p>Operator UIN, exact match. Optional, multiple selection (OR relationship between multiple values)</p>
     */
    public void setRunUserUins(String [] RunUserUins) {
        this.RunUserUins = RunUserUins;
    }

    /**
     * Get <p>Tag name ID, exact match, obtainable through tag-related APIs. Optional, multiple selection (multiple values are in an OR relationship with each other)</p> 
     * @return LabelKeyIds <p>Tag name ID, exact match, obtainable through tag-related APIs. Optional, multiple selection (multiple values are in an OR relationship with each other)</p>
     */
    public String [] getLabelKeyIds() {
        return this.LabelKeyIds;
    }

    /**
     * Set <p>Tag name ID, exact match, obtainable through tag-related APIs. Optional, multiple selection (multiple values are in an OR relationship with each other)</p>
     * @param LabelKeyIds <p>Tag name ID, exact match, obtainable through tag-related APIs. Optional, multiple selection (multiple values are in an OR relationship with each other)</p>
     */
    public void setLabelKeyIds(String [] LabelKeyIds) {
        this.LabelKeyIds = LabelKeyIds;
    }

    /**
     * Get <p>Tag value ID. Exact match. It can be obtained through the tag-related API. Optional. Multiple selection (multiple values are in OR relationship with each other)</p> 
     * @return LabelValueIds <p>Tag value ID. Exact match. It can be obtained through the tag-related API. Optional. Multiple selection (multiple values are in OR relationship with each other)</p>
     */
    public String [] getLabelValueIds() {
        return this.LabelValueIds;
    }

    /**
     * Set <p>Tag value ID. Exact match. It can be obtained through the tag-related API. Optional. Multiple selection (multiple values are in OR relationship with each other)</p>
     * @param LabelValueIds <p>Tag value ID. Exact match. It can be obtained through the tag-related API. Optional. Multiple selection (multiple values are in OR relationship with each other)</p>
     */
    public void setLabelValueIds(String [] LabelValueIds) {
        this.LabelValueIds = LabelValueIds;
    }

    /**
     * Get <p>Sorting conditions. The priority of multiple conditions is indicated by the array order. Optional. Default: CreateTime Desc.<br>Sortable field allowlist: CreateTime, EndTime, RunCostTime</p> 
     * @return OrderBys <p>Sorting conditions. The priority of multiple conditions is indicated by the array order. Optional. Default: CreateTime Desc.<br>Sortable field allowlist: CreateTime, EndTime, RunCostTime</p>
     */
    public OrderBy [] getOrderBys() {
        return this.OrderBys;
    }

    /**
     * Set <p>Sorting conditions. The priority of multiple conditions is indicated by the array order. Optional. Default: CreateTime Desc.<br>Sortable field allowlist: CreateTime, EndTime, RunCostTime</p>
     * @param OrderBys <p>Sorting conditions. The priority of multiple conditions is indicated by the array order. Optional. Default: CreateTime Desc.<br>Sortable field allowlist: CreateTime, EndTime, RunCostTime</p>
     */
    public void setOrderBys(OrderBy [] OrderBys) {
        this.OrderBys = OrderBys;
    }

    public ListWorkflowRunsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListWorkflowRunsRequest(ListWorkflowRunsRequest source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.WorkflowNameKeyword != null) {
            this.WorkflowNameKeyword = new String(source.WorkflowNameKeyword);
        }
        if (source.CreateStartTime != null) {
            this.CreateStartTime = new String(source.CreateStartTime);
        }
        if (source.CreateEndTime != null) {
            this.CreateEndTime = new String(source.CreateEndTime);
        }
        if (source.RunStates != null) {
            this.RunStates = new String[source.RunStates.length];
            for (int i = 0; i < source.RunStates.length; i++) {
                this.RunStates[i] = new String(source.RunStates[i]);
            }
        }
        if (source.ErrorCodeStrings != null) {
            this.ErrorCodeStrings = new String[source.ErrorCodeStrings.length];
            for (int i = 0; i < source.ErrorCodeStrings.length; i++) {
                this.ErrorCodeStrings[i] = new String(source.ErrorCodeStrings[i]);
            }
        }
        if (source.RunUserUins != null) {
            this.RunUserUins = new String[source.RunUserUins.length];
            for (int i = 0; i < source.RunUserUins.length; i++) {
                this.RunUserUins[i] = new String(source.RunUserUins[i]);
            }
        }
        if (source.LabelKeyIds != null) {
            this.LabelKeyIds = new String[source.LabelKeyIds.length];
            for (int i = 0; i < source.LabelKeyIds.length; i++) {
                this.LabelKeyIds[i] = new String(source.LabelKeyIds[i]);
            }
        }
        if (source.LabelValueIds != null) {
            this.LabelValueIds = new String[source.LabelValueIds.length];
            for (int i = 0; i < source.LabelValueIds.length; i++) {
                this.LabelValueIds[i] = new String(source.LabelValueIds[i]);
            }
        }
        if (source.OrderBys != null) {
            this.OrderBys = new OrderBy[source.OrderBys.length];
            for (int i = 0; i < source.OrderBys.length; i++) {
                this.OrderBys[i] = new OrderBy(source.OrderBys[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "WorkflowNameKeyword", this.WorkflowNameKeyword);
        this.setParamSimple(map, prefix + "CreateStartTime", this.CreateStartTime);
        this.setParamSimple(map, prefix + "CreateEndTime", this.CreateEndTime);
        this.setParamArraySimple(map, prefix + "RunStates.", this.RunStates);
        this.setParamArraySimple(map, prefix + "ErrorCodeStrings.", this.ErrorCodeStrings);
        this.setParamArraySimple(map, prefix + "RunUserUins.", this.RunUserUins);
        this.setParamArraySimple(map, prefix + "LabelKeyIds.", this.LabelKeyIds);
        this.setParamArraySimple(map, prefix + "LabelValueIds.", this.LabelValueIds);
        this.setParamArrayObj(map, prefix + "OrderBys.", this.OrderBys);

    }
}


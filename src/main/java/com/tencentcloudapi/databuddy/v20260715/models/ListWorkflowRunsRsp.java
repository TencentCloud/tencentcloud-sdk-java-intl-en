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

public class ListWorkflowRunsRsp extends AbstractModel {

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
    * Workflow run list
    */
    @SerializedName("Items")
    @Expose
    private WorkflowRun [] Items;

    /**
    * Statistics of workflow execution status.
Statistical caliber is the full data under current filter conditions, unaffected by PageNumber/PageSize.
    */
    @SerializedName("BizStateEnumInfos")
    @Expose
    private ScheduleBizEnumBrief [] BizStateEnumInfos;

    /**
    * Statistics of workflow execution error codes.
Statistical caliber is the full data under current filter conditions, unaffected by PageNumber/PageSize.
    */
    @SerializedName("BizErrorCodeEnumInfos")
    @Expose
    private ScheduleBizEnumBrief [] BizErrorCodeEnumInfos;

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
     * Get Workflow run list 
     * @return Items Workflow run list
     */
    public WorkflowRun [] getItems() {
        return this.Items;
    }

    /**
     * Set Workflow run list
     * @param Items Workflow run list
     */
    public void setItems(WorkflowRun [] Items) {
        this.Items = Items;
    }

    /**
     * Get Statistics of workflow execution status.
Statistical caliber is the full data under current filter conditions, unaffected by PageNumber/PageSize. 
     * @return BizStateEnumInfos Statistics of workflow execution status.
Statistical caliber is the full data under current filter conditions, unaffected by PageNumber/PageSize.
     */
    public ScheduleBizEnumBrief [] getBizStateEnumInfos() {
        return this.BizStateEnumInfos;
    }

    /**
     * Set Statistics of workflow execution status.
Statistical caliber is the full data under current filter conditions, unaffected by PageNumber/PageSize.
     * @param BizStateEnumInfos Statistics of workflow execution status.
Statistical caliber is the full data under current filter conditions, unaffected by PageNumber/PageSize.
     */
    public void setBizStateEnumInfos(ScheduleBizEnumBrief [] BizStateEnumInfos) {
        this.BizStateEnumInfos = BizStateEnumInfos;
    }

    /**
     * Get Statistics of workflow execution error codes.
Statistical caliber is the full data under current filter conditions, unaffected by PageNumber/PageSize. 
     * @return BizErrorCodeEnumInfos Statistics of workflow execution error codes.
Statistical caliber is the full data under current filter conditions, unaffected by PageNumber/PageSize.
     */
    public ScheduleBizEnumBrief [] getBizErrorCodeEnumInfos() {
        return this.BizErrorCodeEnumInfos;
    }

    /**
     * Set Statistics of workflow execution error codes.
Statistical caliber is the full data under current filter conditions, unaffected by PageNumber/PageSize.
     * @param BizErrorCodeEnumInfos Statistics of workflow execution error codes.
Statistical caliber is the full data under current filter conditions, unaffected by PageNumber/PageSize.
     */
    public void setBizErrorCodeEnumInfos(ScheduleBizEnumBrief [] BizErrorCodeEnumInfos) {
        this.BizErrorCodeEnumInfos = BizErrorCodeEnumInfos;
    }

    public ListWorkflowRunsRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListWorkflowRunsRsp(ListWorkflowRunsRsp source) {
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
            this.Items = new WorkflowRun[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new WorkflowRun(source.Items[i]);
            }
        }
        if (source.BizStateEnumInfos != null) {
            this.BizStateEnumInfos = new ScheduleBizEnumBrief[source.BizStateEnumInfos.length];
            for (int i = 0; i < source.BizStateEnumInfos.length; i++) {
                this.BizStateEnumInfos[i] = new ScheduleBizEnumBrief(source.BizStateEnumInfos[i]);
            }
        }
        if (source.BizErrorCodeEnumInfos != null) {
            this.BizErrorCodeEnumInfos = new ScheduleBizEnumBrief[source.BizErrorCodeEnumInfos.length];
            for (int i = 0; i < source.BizErrorCodeEnumInfos.length; i++) {
                this.BizErrorCodeEnumInfos[i] = new ScheduleBizEnumBrief(source.BizErrorCodeEnumInfos[i]);
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
        this.setParamArrayObj(map, prefix + "BizStateEnumInfos.", this.BizStateEnumInfos);
        this.setParamArrayObj(map, prefix + "BizErrorCodeEnumInfos.", this.BizErrorCodeEnumInfos);

    }
}


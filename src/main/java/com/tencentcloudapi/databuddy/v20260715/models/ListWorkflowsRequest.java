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

public class ListWorkflowsRequest extends AbstractModel {

    /**
    * <p>Workspace ID, which can be obtained through ListWorkspaces. Required</p>
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
    * <p>Workflow name keyword for fuzzy matching of WorkflowName. Optional, single value</p>
    */
    @SerializedName("WorkflowNameKeyword")
    @Expose
    private String WorkflowNameKeyword;

    /**
    * <p>Workflow name, exact match. Optional, multiple selection (OR relationship between multiple values)</p>
    */
    @SerializedName("WorkflowNames")
    @Expose
    private String [] WorkflowNames;

    /**
    * <p>Workflow ID. Exact match. Optional. Multiple selection (OR relationship between multiple values)</p>
    */
    @SerializedName("WorkflowIds")
    @Expose
    private String [] WorkflowIds;

    /**
    * <p>Workflow runner UIN, exact match. Optional, multiple selection (OR relationship between multiple values)</p>
    */
    @SerializedName("RunUserUins")
    @Expose
    private String [] RunUserUins;

    /**
    * <p>Tag name ID. Exact match. You can obtain it via tag-related APIs. Optional. Multiple selection (multiple values are in an OR relationship with each other)</p>
    */
    @SerializedName("LabelKeyIds")
    @Expose
    private String [] LabelKeyIds;

    /**
    * <p>Tag value ID, exact match, obtainable through the tag-related API. Optional, multiple selection (multiple values are in an OR relationship with each other)</p>
    */
    @SerializedName("LabelValueIds")
    @Expose
    private String [] LabelValueIds;

    /**
    * <p>Quick filter type. Optional, single value</p><p>Align with the legacy Cloud API (wedata/2025-10-10) document example values:</p><ul><li>MY_FAVORITE: collected by me</li><li>MY_OWNER: I am responsible</li><li>MY_AUTHORITY: I have permission</li><li>WorkflowId: support filtering by multiple workflow IDs</li></ul><p>Backend implementation status quo: currently only MY_FAVORITE takes effect (set favoriteUserUin to filter the current user's favorites). MY_OWNER / MY_AUTHORITY are not yet implemented at the Service layer, and the input will be ignored (returned as full results).</p>
    */
    @SerializedName("QuickSelectionType")
    @Expose
    private String QuickSelectionType;

    /**
    * <p>Sorting criteria. The priority of multiple criteria is indicated by their sequence in the array. Optional.<br>Sortable field allowlist: CreateTime</p>
    */
    @SerializedName("OrderBys")
    @Expose
    private OrderBy [] OrderBys;

    /**
     * Get <p>Workspace ID, which can be obtained through ListWorkspaces. Required</p> 
     * @return WorkspaceId <p>Workspace ID, which can be obtained through ListWorkspaces. Required</p>
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set <p>Workspace ID, which can be obtained through ListWorkspaces. Required</p>
     * @param WorkspaceId <p>Workspace ID, which can be obtained through ListWorkspaces. Required</p>
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
     * Get <p>Workflow name, exact match. Optional, multiple selection (OR relationship between multiple values)</p> 
     * @return WorkflowNames <p>Workflow name, exact match. Optional, multiple selection (OR relationship between multiple values)</p>
     */
    public String [] getWorkflowNames() {
        return this.WorkflowNames;
    }

    /**
     * Set <p>Workflow name, exact match. Optional, multiple selection (OR relationship between multiple values)</p>
     * @param WorkflowNames <p>Workflow name, exact match. Optional, multiple selection (OR relationship between multiple values)</p>
     */
    public void setWorkflowNames(String [] WorkflowNames) {
        this.WorkflowNames = WorkflowNames;
    }

    /**
     * Get <p>Workflow ID. Exact match. Optional. Multiple selection (OR relationship between multiple values)</p> 
     * @return WorkflowIds <p>Workflow ID. Exact match. Optional. Multiple selection (OR relationship between multiple values)</p>
     */
    public String [] getWorkflowIds() {
        return this.WorkflowIds;
    }

    /**
     * Set <p>Workflow ID. Exact match. Optional. Multiple selection (OR relationship between multiple values)</p>
     * @param WorkflowIds <p>Workflow ID. Exact match. Optional. Multiple selection (OR relationship between multiple values)</p>
     */
    public void setWorkflowIds(String [] WorkflowIds) {
        this.WorkflowIds = WorkflowIds;
    }

    /**
     * Get <p>Workflow runner UIN, exact match. Optional, multiple selection (OR relationship between multiple values)</p> 
     * @return RunUserUins <p>Workflow runner UIN, exact match. Optional, multiple selection (OR relationship between multiple values)</p>
     */
    public String [] getRunUserUins() {
        return this.RunUserUins;
    }

    /**
     * Set <p>Workflow runner UIN, exact match. Optional, multiple selection (OR relationship between multiple values)</p>
     * @param RunUserUins <p>Workflow runner UIN, exact match. Optional, multiple selection (OR relationship between multiple values)</p>
     */
    public void setRunUserUins(String [] RunUserUins) {
        this.RunUserUins = RunUserUins;
    }

    /**
     * Get <p>Tag name ID. Exact match. You can obtain it via tag-related APIs. Optional. Multiple selection (multiple values are in an OR relationship with each other)</p> 
     * @return LabelKeyIds <p>Tag name ID. Exact match. You can obtain it via tag-related APIs. Optional. Multiple selection (multiple values are in an OR relationship with each other)</p>
     */
    public String [] getLabelKeyIds() {
        return this.LabelKeyIds;
    }

    /**
     * Set <p>Tag name ID. Exact match. You can obtain it via tag-related APIs. Optional. Multiple selection (multiple values are in an OR relationship with each other)</p>
     * @param LabelKeyIds <p>Tag name ID. Exact match. You can obtain it via tag-related APIs. Optional. Multiple selection (multiple values are in an OR relationship with each other)</p>
     */
    public void setLabelKeyIds(String [] LabelKeyIds) {
        this.LabelKeyIds = LabelKeyIds;
    }

    /**
     * Get <p>Tag value ID, exact match, obtainable through the tag-related API. Optional, multiple selection (multiple values are in an OR relationship with each other)</p> 
     * @return LabelValueIds <p>Tag value ID, exact match, obtainable through the tag-related API. Optional, multiple selection (multiple values are in an OR relationship with each other)</p>
     */
    public String [] getLabelValueIds() {
        return this.LabelValueIds;
    }

    /**
     * Set <p>Tag value ID, exact match, obtainable through the tag-related API. Optional, multiple selection (multiple values are in an OR relationship with each other)</p>
     * @param LabelValueIds <p>Tag value ID, exact match, obtainable through the tag-related API. Optional, multiple selection (multiple values are in an OR relationship with each other)</p>
     */
    public void setLabelValueIds(String [] LabelValueIds) {
        this.LabelValueIds = LabelValueIds;
    }

    /**
     * Get <p>Quick filter type. Optional, single value</p><p>Align with the legacy Cloud API (wedata/2025-10-10) document example values:</p><ul><li>MY_FAVORITE: collected by me</li><li>MY_OWNER: I am responsible</li><li>MY_AUTHORITY: I have permission</li><li>WorkflowId: support filtering by multiple workflow IDs</li></ul><p>Backend implementation status quo: currently only MY_FAVORITE takes effect (set favoriteUserUin to filter the current user's favorites). MY_OWNER / MY_AUTHORITY are not yet implemented at the Service layer, and the input will be ignored (returned as full results).</p> 
     * @return QuickSelectionType <p>Quick filter type. Optional, single value</p><p>Align with the legacy Cloud API (wedata/2025-10-10) document example values:</p><ul><li>MY_FAVORITE: collected by me</li><li>MY_OWNER: I am responsible</li><li>MY_AUTHORITY: I have permission</li><li>WorkflowId: support filtering by multiple workflow IDs</li></ul><p>Backend implementation status quo: currently only MY_FAVORITE takes effect (set favoriteUserUin to filter the current user's favorites). MY_OWNER / MY_AUTHORITY are not yet implemented at the Service layer, and the input will be ignored (returned as full results).</p>
     */
    public String getQuickSelectionType() {
        return this.QuickSelectionType;
    }

    /**
     * Set <p>Quick filter type. Optional, single value</p><p>Align with the legacy Cloud API (wedata/2025-10-10) document example values:</p><ul><li>MY_FAVORITE: collected by me</li><li>MY_OWNER: I am responsible</li><li>MY_AUTHORITY: I have permission</li><li>WorkflowId: support filtering by multiple workflow IDs</li></ul><p>Backend implementation status quo: currently only MY_FAVORITE takes effect (set favoriteUserUin to filter the current user's favorites). MY_OWNER / MY_AUTHORITY are not yet implemented at the Service layer, and the input will be ignored (returned as full results).</p>
     * @param QuickSelectionType <p>Quick filter type. Optional, single value</p><p>Align with the legacy Cloud API (wedata/2025-10-10) document example values:</p><ul><li>MY_FAVORITE: collected by me</li><li>MY_OWNER: I am responsible</li><li>MY_AUTHORITY: I have permission</li><li>WorkflowId: support filtering by multiple workflow IDs</li></ul><p>Backend implementation status quo: currently only MY_FAVORITE takes effect (set favoriteUserUin to filter the current user's favorites). MY_OWNER / MY_AUTHORITY are not yet implemented at the Service layer, and the input will be ignored (returned as full results).</p>
     */
    public void setQuickSelectionType(String QuickSelectionType) {
        this.QuickSelectionType = QuickSelectionType;
    }

    /**
     * Get <p>Sorting criteria. The priority of multiple criteria is indicated by their sequence in the array. Optional.<br>Sortable field allowlist: CreateTime</p> 
     * @return OrderBys <p>Sorting criteria. The priority of multiple criteria is indicated by their sequence in the array. Optional.<br>Sortable field allowlist: CreateTime</p>
     */
    public OrderBy [] getOrderBys() {
        return this.OrderBys;
    }

    /**
     * Set <p>Sorting criteria. The priority of multiple criteria is indicated by their sequence in the array. Optional.<br>Sortable field allowlist: CreateTime</p>
     * @param OrderBys <p>Sorting criteria. The priority of multiple criteria is indicated by their sequence in the array. Optional.<br>Sortable field allowlist: CreateTime</p>
     */
    public void setOrderBys(OrderBy [] OrderBys) {
        this.OrderBys = OrderBys;
    }

    public ListWorkflowsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListWorkflowsRequest(ListWorkflowsRequest source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.WorkflowNameKeyword != null) {
            this.WorkflowNameKeyword = new String(source.WorkflowNameKeyword);
        }
        if (source.WorkflowNames != null) {
            this.WorkflowNames = new String[source.WorkflowNames.length];
            for (int i = 0; i < source.WorkflowNames.length; i++) {
                this.WorkflowNames[i] = new String(source.WorkflowNames[i]);
            }
        }
        if (source.WorkflowIds != null) {
            this.WorkflowIds = new String[source.WorkflowIds.length];
            for (int i = 0; i < source.WorkflowIds.length; i++) {
                this.WorkflowIds[i] = new String(source.WorkflowIds[i]);
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
        if (source.QuickSelectionType != null) {
            this.QuickSelectionType = new String(source.QuickSelectionType);
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
        this.setParamSimple(map, prefix + "WorkflowNameKeyword", this.WorkflowNameKeyword);
        this.setParamArraySimple(map, prefix + "WorkflowNames.", this.WorkflowNames);
        this.setParamArraySimple(map, prefix + "WorkflowIds.", this.WorkflowIds);
        this.setParamArraySimple(map, prefix + "RunUserUins.", this.RunUserUins);
        this.setParamArraySimple(map, prefix + "LabelKeyIds.", this.LabelKeyIds);
        this.setParamArraySimple(map, prefix + "LabelValueIds.", this.LabelValueIds);
        this.setParamSimple(map, prefix + "QuickSelectionType", this.QuickSelectionType);
        this.setParamArrayObj(map, prefix + "OrderBys.", this.OrderBys);

    }
}


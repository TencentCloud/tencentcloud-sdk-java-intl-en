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

public class ListWorkspacesRsp extends AbstractModel {

    /**
    * <p>Workspace list.</p>
    */
    @SerializedName("Items")
    @Expose
    private WorkspaceInfo [] Items;

    /**
    * <p>Current page</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>Page Size</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>Total number of records</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>Total number of pages</p>
    */
    @SerializedName("TotalPageNumber")
    @Expose
    private Long TotalPageNumber;

    /**
    * <p>Console administrator or not</p>
    */
    @SerializedName("IsConsoleAdmin")
    @Expose
    private Boolean IsConsoleAdmin;

    /**
     * Get <p>Workspace list.</p> 
     * @return Items <p>Workspace list.</p>
     */
    public WorkspaceInfo [] getItems() {
        return this.Items;
    }

    /**
     * Set <p>Workspace list.</p>
     * @param Items <p>Workspace list.</p>
     */
    public void setItems(WorkspaceInfo [] Items) {
        this.Items = Items;
    }

    /**
     * Get <p>Current page</p> 
     * @return PageNumber <p>Current page</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>Current page</p>
     * @param PageNumber <p>Current page</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>Page Size</p> 
     * @return PageSize <p>Page Size</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>Page Size</p>
     * @param PageSize <p>Page Size</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>Total number of records</p> 
     * @return TotalCount <p>Total number of records</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>Total number of records</p>
     * @param TotalCount <p>Total number of records</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>Total number of pages</p> 
     * @return TotalPageNumber <p>Total number of pages</p>
     */
    public Long getTotalPageNumber() {
        return this.TotalPageNumber;
    }

    /**
     * Set <p>Total number of pages</p>
     * @param TotalPageNumber <p>Total number of pages</p>
     */
    public void setTotalPageNumber(Long TotalPageNumber) {
        this.TotalPageNumber = TotalPageNumber;
    }

    /**
     * Get <p>Console administrator or not</p> 
     * @return IsConsoleAdmin <p>Console administrator or not</p>
     */
    public Boolean getIsConsoleAdmin() {
        return this.IsConsoleAdmin;
    }

    /**
     * Set <p>Console administrator or not</p>
     * @param IsConsoleAdmin <p>Console administrator or not</p>
     */
    public void setIsConsoleAdmin(Boolean IsConsoleAdmin) {
        this.IsConsoleAdmin = IsConsoleAdmin;
    }

    public ListWorkspacesRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListWorkspacesRsp(ListWorkspacesRsp source) {
        if (source.Items != null) {
            this.Items = new WorkspaceInfo[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new WorkspaceInfo(source.Items[i]);
            }
        }
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
        if (source.IsConsoleAdmin != null) {
            this.IsConsoleAdmin = new Boolean(source.IsConsoleAdmin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "TotalPageNumber", this.TotalPageNumber);
        this.setParamSimple(map, prefix + "IsConsoleAdmin", this.IsConsoleAdmin);

    }
}


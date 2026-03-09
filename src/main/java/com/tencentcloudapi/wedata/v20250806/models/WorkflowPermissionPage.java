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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkflowPermissionPage extends AbstractModel {

    /**
    * Number of data pages, at least 1.
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Number of records per page. the minimum value is `10`. the maximum value is `200`.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Total number of authorized data.
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
    * Authorization information list.
    */
    @SerializedName("Items")
    @Expose
    private WorkflowPermission [] Items;

    /**
     * Get Number of data pages, at least 1. 
     * @return PageNumber Number of data pages, at least 1.
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Number of data pages, at least 1.
     * @param PageNumber Number of data pages, at least 1.
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Number of records per page. the minimum value is `10`. the maximum value is `200`. 
     * @return PageSize Number of records per page. the minimum value is `10`. the maximum value is `200`.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of records per page. the minimum value is `10`. the maximum value is `200`.
     * @param PageSize Number of records per page. the minimum value is `10`. the maximum value is `200`.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Total number of authorized data. 
     * @return TotalCount Total number of authorized data.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of authorized data.
     * @param TotalCount Total number of authorized data.
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
     * Get Authorization information list. 
     * @return Items Authorization information list.
     */
    public WorkflowPermission [] getItems() {
        return this.Items;
    }

    /**
     * Set Authorization information list.
     * @param Items Authorization information list.
     */
    public void setItems(WorkflowPermission [] Items) {
        this.Items = Items;
    }

    public WorkflowPermissionPage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowPermissionPage(WorkflowPermissionPage source) {
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
            this.Items = new WorkflowPermission[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new WorkflowPermission(source.Items[i]);
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

    }
}


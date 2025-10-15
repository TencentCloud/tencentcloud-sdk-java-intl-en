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

public class DependencyConfigPage extends AbstractModel {

    /**
    * Total number of records matching the query conditions.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Total number of pages matching the query conditions.
    */
    @SerializedName("TotalPageNumber")
    @Expose
    private Long TotalPageNumber;

    /**
    * The page number of the current request.
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * The number of entries in the current request data page.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Paginated Data
    */
    @SerializedName("Items")
    @Expose
    private TaskDependDto [] Items;

    /**
     * Get Total number of records matching the query conditions. 
     * @return TotalCount Total number of records matching the query conditions.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of records matching the query conditions.
     * @param TotalCount Total number of records matching the query conditions.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Total number of pages matching the query conditions. 
     * @return TotalPageNumber Total number of pages matching the query conditions.
     */
    public Long getTotalPageNumber() {
        return this.TotalPageNumber;
    }

    /**
     * Set Total number of pages matching the query conditions.
     * @param TotalPageNumber Total number of pages matching the query conditions.
     */
    public void setTotalPageNumber(Long TotalPageNumber) {
        this.TotalPageNumber = TotalPageNumber;
    }

    /**
     * Get The page number of the current request. 
     * @return PageNumber The page number of the current request.
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set The page number of the current request.
     * @param PageNumber The page number of the current request.
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get The number of entries in the current request data page. 
     * @return PageSize The number of entries in the current request data page.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set The number of entries in the current request data page.
     * @param PageSize The number of entries in the current request data page.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Paginated Data 
     * @return Items Paginated Data
     */
    public TaskDependDto [] getItems() {
        return this.Items;
    }

    /**
     * Set Paginated Data
     * @param Items Paginated Data
     */
    public void setItems(TaskDependDto [] Items) {
        this.Items = Items;
    }

    public DependencyConfigPage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DependencyConfigPage(DependencyConfigPage source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.TotalPageNumber != null) {
            this.TotalPageNumber = new Long(source.TotalPageNumber);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Items != null) {
            this.Items = new TaskDependDto[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new TaskDependDto(source.Items[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "TotalPageNumber", this.TotalPageNumber);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);

    }
}


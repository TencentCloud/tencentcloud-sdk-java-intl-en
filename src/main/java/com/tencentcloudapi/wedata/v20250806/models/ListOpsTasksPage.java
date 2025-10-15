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

public class ListOpsTasksPage extends AbstractModel {

    /**
    * Total number of results

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
    * Record list	
	

    */
    @SerializedName("Items")
    @Expose
    private TaskOpsInfo [] Items;

    /**
    * Page number.

    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Pagination size.

    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get Total number of results
 
     * @return TotalCount Total number of results

     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of results

     * @param TotalCount Total number of results

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
     * Get Record list	
	
 
     * @return Items Record list	
	

     */
    public TaskOpsInfo [] getItems() {
        return this.Items;
    }

    /**
     * Set Record list	
	

     * @param Items Record list	
	

     */
    public void setItems(TaskOpsInfo [] Items) {
        this.Items = Items;
    }

    /**
     * Get Page number.
 
     * @return PageNumber Page number.

     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Page number.

     * @param PageNumber Page number.

     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Pagination size.
 
     * @return PageSize Pagination size.

     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Pagination size.

     * @param PageSize Pagination size.

     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public ListOpsTasksPage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListOpsTasksPage(ListOpsTasksPage source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.TotalPageNumber != null) {
            this.TotalPageNumber = new Long(source.TotalPageNumber);
        }
        if (source.Items != null) {
            this.Items = new TaskOpsInfo[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new TaskOpsInfo(source.Items[i]);
            }
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "TotalPageNumber", this.TotalPageNumber);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

